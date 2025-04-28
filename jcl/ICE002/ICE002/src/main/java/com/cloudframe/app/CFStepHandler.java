package com.cloudframe.app;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.StringJoiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.observability.BatchMetrics;
import java.time.Duration;
import org.springframework.batch.core.scope.context.ChunkContext;
import com.cloudframe.app.utility.SpringContextHandler;
import org.springframework.beans.factory.InitializingBean;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import com.cloudframe.app.process.BaseProcess;
import com.cloudframe.app.step.StepInfo;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.utility.Cond;
import com.cloudframe.app.exception.CFException;
    
@Component
public class CFStepHandler implements InitializingBean {
    
    private Logger logger = LoggerFactory.getLogger(CFStepHandler.class);
    private Map<String, List<String>> sharedVarMap ;
    private Map<String, List<String>> programMap ;
    private List<String> refreshList = new ArrayList<>();
    private Map<String, Integer> stepMap = new HashMap<>();
    private List<String> skipList = new ArrayList<>();
    private List<String> abendList = new ArrayList<>();
    private Map<String, StepExecution> stepInfo = new HashMap<>();
    private Map<String, Set<String>> dynamicBeanMap = new HashMap<>();
    private List<String> ignorePrograms = Arrays.asList("IDCAMS","SORT");
    private boolean skipFirst = true;
    private List<String> stepSummary ;
    private List<String> stepProgm ;
    private int jobRc;
    private boolean isNormalExit = true;
    private String abendCode = "";
    private List<StepInfo> stepsInfo;
    private static final String P010 = "p010";
    private static final String P020 = "p020";
    private static final String P030_01 = "p030_01";
    private static final String P030_02 = "p030_02";
    private static final String P030_03 = "p030_03";
    private static final String P030_04 = "p030_04";
    private static final String P030_05 = "p030_05";
    private static final String P030_06 = "p030_06";
    private static final String P030_07 = "p030_07";
    private static final String P030_08 = "p030_08";
    private static final String P030_09 = "p030_09";
    private static final String P030_10 = "p030_10";
    private static final String P030_11 = "p030_11";
    private static final String P030_12 = "p030_12";
    private static final String P030_13 = "p030_13";
    private static final String P030_14 = "p030_14";
    private static final String P030_15 = "p030_15";
    private static final String P030_16 = "p030_16";
    private static final String P030_17 = "p030_17";
    private static final String P030_18 = "p030_18";
    private static final String P030_19 = "p030_19";
    private static final String P030_20 = "p030_20";
    private static final String P030_21 = "p030_21";
    private static final String P030_22 = "p030_22";
    private static final String P030_23 = "p030_23";
    private static final String P030_24 = "p030_24";
    private static final String P050 = "p050";
    private static final String P060 = "p060";
    
    @Override
    public void afterPropertiesSet() throws Exception {
   sharedVarMap = CFUtil.getBeanInfoFromJson("sharedVarMap.json");
   programMap = CFUtil.getBeanInfoFromJson("programMap.json");
  try {
   	stepsInfo = CFUtil.getJSONAsObject("stepInfo.json", new TypeReference<List<StepInfo>>() {});
   	stepSummary = new ArrayList<>();
   	stepProgm = new ArrayList<>();
   	if (!stepsInfo.isEmpty()) {
   		stepsInfo.forEach(si -> {
   			stepSummary.add(si.getStepName().toLowerCase());
   			stepProgm.add(si.getProgName());
   			SpringContextHandler.updateDDInfo(si.getDataSetInfos());
   		});
   	}
} catch (IOException e) {
   logger.error("Unable to load stepInfo from json. err msg :  {}" , e.getMessage());
}
}
public void setAbendCode(CFException cfe) {
	//sets abend code if only it is not setted by any of the previous steps
	if(CFUtil.isEmpty(abendCode) && !CFUtil.isEmpty(cfe.getAbendCode()))
		abendCode = cfe.getAbendCode();
	this.isNormalExit = false;
}
    
/**   
 * Decides whether the step can be executed
* 
* @param stepName
* @return
*/
    public boolean stepDecider(String stepName) {
	      boolean canExecute = false;
	      switch (stepName) {
	          case P010:
	              canExecute = (true);
	          break;
	          case P020:
	          case P030_01:
	          case P030_02:
	          case P030_03:
	          case P030_04:
	          case P030_05:
	          case P030_06:
	          case P030_07:
	          case P030_08:
	          case P030_09:
	          case P030_10:
	          case P030_11:
	          case P030_12:
	          case P030_13:
	          case P030_14:
	          case P030_15:
	          case P030_16:
	          case P030_17:
	          case P030_18:
	          case P030_19:
	          case P030_20:
	          case P030_21:
	          case P030_22:
	          case P030_23:
	          case P030_24:
	          case P050:
	          case P060:
	              canExecute = abendList.isEmpty();
	          break;
	          default:
	              canExecute = false;
	          break;
        }
if (!canExecute) skipList.add(stepName);
return canExecute;
    }
    
/**
* Initialize's this step for execution and return the process bean
* 
* 1. closes previously opened qsam and vsam files
* 2. refreshes the driverProgram and its child's for execution
* 3. init qsam, vsam and dynamic beans list for the current run
* 
* 
* @param stepName
* @param driverProgName
* 
* @return the process bean to be executed
*  
*/
    public BaseProcess initAndGetProcessBean(String stepName , String driverProgName) throws CFException {
      if (!skipFirst) {
        SpringContextHandler.close();
        refreshBeans(driverProgName);
        SpringContextHandler.initStep();
      } else skipFirst = false;
      handleStepOverrides(stepName);
      return SpringContextHandler.getProcess(driverProgName);
    }
    
  public void handleStepOverrides(String stepName) throws CFException {
        switch(stepName) {
            case "p010":  /* setting the disp position for file(s) info for this step(P010). */
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut2","P010.IEFBR14.Sysut2.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut3","P010.IEFBR14.Sysut3.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut4","P010.IEFBR14.Sysut4.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut5","P010.IEFBR14.Sysut5.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut6","P010.IEFBR14.Sysut6.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut7","P010.IEFBR14.Sysut7.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut8","P010.IEFBR14.Sysut8.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut9","P010.IEFBR14.Sysut9.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut10","P010.IEFBR14.Sysut10.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut11","P010.IEFBR14.Sysut11.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut12","P010.IEFBR14.Sysut12.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut13","P010.IEFBR14.Sysut13.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut14","P010.IEFBR14.Sysut14.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P010.IEFBR14.Sysut15","P010.IEFBR14.Sysut15.DISP");
            break;
            case "p020":
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut2","P020.IEBGENER.Sysut2.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut3","P020.IEBGENER.Sysut3.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut4","P020.IEBGENER.Sysut4.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut5","P020.IEBGENER.Sysut5.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut6","P020.IEBGENER.Sysut6.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut7","P020.IEBGENER.Sysut7.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut8","P020.IEBGENER.Sysut8.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut9","P020.IEBGENER.Sysut9.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut10","P020.IEBGENER.Sysut10.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut11","P020.IEBGENER.Sysut11.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut12","P020.IEBGENER.Sysut12.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P020.IEBGENER.Sysut13","P020.IEBGENER.Sysut13.DISP");
            break;
            case "p030_01":  /* setting the disp position for file(s) info for this step(P030_01). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_01SortIn","Ice002P030_01SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_01SortOut","Ice002P030_01SortOut.DISP");
            break;
            case "p030_02":  /* setting the disp position for file(s) info for this step(P030_02). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_02SortIn","Ice002P030_02SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_02SortOut","Ice002P030_02SortOut.DISP");
            break;
            case "p030_03":  /* setting the disp position for file(s) info for this step(P030_03). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_03SortIn","Ice002P030_03SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_03SortOut","Ice002P030_03SortOut.DISP");
            break;
            case "p030_04":  /* setting the disp position for file(s) info for this step(P030_04). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_04SortIn","Ice002P030_04SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_04SortOut","Ice002P030_04SortOut.DISP");
            break;
            case "p030_05":  /* setting the disp position for file(s) info for this step(P030_05). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_05SortIn","Ice002P030_05SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_05SortOut","Ice002P030_05SortOut.DISP");
            break;
            case "p030_06":  /* setting the disp position for file(s) info for this step(P030_06). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_06SortIn","Ice002P030_06SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_06SortOut","Ice002P030_06SortOut.DISP");
            break;
            case "p030_07":  /* setting the disp position for file(s) info for this step(P030_07). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_07SortIn","Ice002P030_07SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_07SortOut","Ice002P030_07SortOut.DISP");
            break;
            case "p030_08":  /* setting the disp position for file(s) info for this step(P030_08). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_08SortIn","Ice002P030_08SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_08SortOut","Ice002P030_08SortOut.DISP");
            break;
            case "p030_09":  /* setting the disp position for file(s) info for this step(P030_09). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_09SortIn","Ice002P030_09SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_09SortOut","Ice002P030_09SortOut.DISP");
            break;
            case "p030_10":  /* setting the disp position for file(s) info for this step(P030_10). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_10SortIn","Ice002P030_10SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_10SortOut","Ice002P030_10SortOut.DISP");
            break;
            case "p030_11":  /* setting the disp position for file(s) info for this step(P030_11). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_11SortIn","Ice002P030_11SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_11SortOut","Ice002P030_11SortOut.DISP");
            break;
            case "p030_12":  /* setting the disp position for file(s) info for this step(P030_12). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_12SortIn","Ice002P030_12SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_12SortOut","Ice002P030_12SortOut.DISP");
            break;
            case "p030_13":  /* setting the disp position for file(s) info for this step(P030_13). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_13SortIn","Ice002P030_13SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_13SortOut","Ice002P030_13SortOut.DISP");
            break;
            case "p030_14":  /* setting the disp position for file(s) info for this step(P030_14). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_14SortIn","Ice002P030_14SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_14SortOut","Ice002P030_14SortOut.DISP");
            break;
            case "p030_15":  /* setting the disp position for file(s) info for this step(P030_15). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_15SortIn","Ice002P030_15SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_15SortOut","Ice002P030_15SortOut.DISP");
            break;
            case "p030_16":  /* setting the disp position for file(s) info for this step(P030_16). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_16SortIn","Ice002P030_16SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_16SortOut","Ice002P030_16SortOut.DISP");
            break;
            case "p030_17":  /* setting the disp position for file(s) info for this step(P030_17). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_17SortIn","Ice002P030_17SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_17SortOut","Ice002P030_17SortOut.DISP");
            break;
            case "p030_18":  /* setting the disp position for file(s) info for this step(P030_18). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_18SortIn","Ice002P030_18SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_18SortOut","Ice002P030_18SortOut.DISP");
            break;
            case "p030_19":  /* setting the disp position for file(s) info for this step(P030_19). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_19SortIn","Ice002P030_19SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_19SortOut","Ice002P030_19SortOut.DISP");
            break;
            case "p030_20":  /* setting the disp position for file(s) info for this step(P030_20). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_20SortIn","Ice002P030_20SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_20SortOut","Ice002P030_20SortOut.DISP");
            break;
            case "p030_21":  /* setting the disp position for file(s) info for this step(P030_21). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_21SortIn","Ice002P030_21SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_21SortOut","Ice002P030_21SortOut.DISP");
            break;
            case "p030_22":  /* setting the disp position for file(s) info for this step(P030_22). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_22SortIn","Ice002P030_22SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_22SortOut","Ice002P030_22SortOut.DISP");
            break;
            case "p030_23":  /* setting the disp position for file(s) info for this step(P030_23). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_23SortIn","Ice002P030_23SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_23SortOut","Ice002P030_23SortOut.DISP");
            break;
            case "p030_24":  /* setting the disp position for file(s) info for this step(P030_24). */
                         SpringContextHandler.setFileDispPosition("Ice002P030_24SortIn","Ice002P030_24SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P030_24SortOut","Ice002P030_24SortOut.DISP");
            break;
            case "p050":
 		    	   		SpringContextHandler.handleDispPostion("P050.IEBGENER.Sysut1","P050.IEBGENER.Sysut1.DISP");
 		    	   		SpringContextHandler.handleDispPostion("P050.IEBGENER.Sysut2","P050.IEBGENER.Sysut2.DISP");
            break;
            case "p060":  /* setting the disp position for file(s) info for this step(P060). */
                         SpringContextHandler.setFileDispPosition("Ice002P060SortIn","Ice002P060SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("Ice002P060SortOut","Ice002P060SortOut.DISP");
            break;
                default: break;
        }
}
    
/**
* Updates the rc for this step
 * 
 * 
 * @param stepName
 * @param rc
 */
    public void postStepExecution(String stepName, int rc) throws CFException {
      if(isNormalExit) {
          stepMap.put(stepName, rc);
          updateJobRc(rc);
      } else {
          abendList.add(stepName);
      }
      SpringContextHandler.handleDispPostionAtStepEnd(isNormalExit);
    }
    
/**
* Updates the rc for this step and keeps track of dynamic beans for this program
 * 
 * 
 * @param stepName
 * @param rc
 */
   public void postStepExecution(String stepName, int rc , String driveProgramName) throws CFException {
     if(isNormalExit) {
          stepMap.put(stepName, rc);
          updateJobRc(rc);
      } else {
          abendList.add(stepName);
      } 
      if(!ignorePrograms.contains(driveProgramName)) {
          SpringContextHandler.close();
          updateDynamicBeanMap(driveProgramName);
          SpringContextHandler.handleDispPostionAtStepEnd(isNormalExit);
      }
      SpringContextHandler.clearCache();
  }
    
   private void updateDynamicBeanMap(String driveProgramName) {     
      dynamicBeanMap.computeIfAbsent(driveProgramName,  key -> new HashSet<>());
      SpringContextHandler.removeFromDynamicBeans(driveProgramName);
      dynamicBeanMap.get(driveProgramName).addAll(SpringContextHandler.dynamicBeans());
   }
    
    private void refreshBeans(String driverProgName) {
        refreshList.clear();
        SpringContextHandler.removeFromDynamicBeans(driverProgName);
        SpringContextHandler.dynamicBeans().forEach(this::refreshProcessBean);
        if(dynamicBeanMap.containsKey(driverProgName))
                dynamicBeanMap.get(driverProgName).forEach(this::refreshProcessBean);
        refreshProcessBean(driverProgName);
    }
    
    private void refreshProcessBean(String processBean) {
        if (sharedVarMap.containsKey(processBean))
            sharedVarMap.get(processBean).forEach(globalBean -> {
                if (!refreshList.contains(globalBean)) {
                    SpringContextHandler.refreshBean(globalBean);
                    refreshList.add(globalBean);
                }
            });
        if (programMap.containsKey(processBean))
            programMap.get(processBean).forEach(childProcessBean -> {
                if (!refreshList.contains(childProcessBean)) {
                    refreshList.add(childProcessBean);
                    refreshProcessBean(childProcessBean);
                }
            });
        SpringContextHandler.refreshBean(processBean);
    }
    
/**
 * Gets the formatted parm by removing the preceding and succeeding quotes
* 
* @param parm 
* @return
*/ 
    public String getParm(String parm) {
        if (parm.startsWith("'") && parm.endsWith("'"))
            return parm.substring(1, parm.length() - 1);
        return parm;
    }
    
	/**
	  * Logs the step-wise execution summary
	  * 
	 */
    public void printExecutionSummary() {
       int stepNameMaxLength = findMaxLength(stepSummary);
       int progNameMaxLength = findMaxLength(stepProgm);
       int statusMaxLength = Math.max("Status".length(), Math.max("FLUSH".length(), "ABEND".length()));
       int elapsedTimeMaxLength = "Elapsed Time".length();
    
       StringJoiner report = new StringJoiner("\n");
       report.add("\n");
       report.add("Stepwise Execution Summary :");
       String border = generateBorder(stepSummary, stepProgm);
       report.add(border);
       report.add(formatRow("STEPNAME", "PROGRAM", "RC", "ELAPSED",stepNameMaxLength, progNameMaxLength, statusMaxLength, elapsedTimeMaxLength));
       report.add(formatRow("", "", "", "HH:MM:SS:ss",stepNameMaxLength, progNameMaxLength, statusMaxLength, elapsedTimeMaxLength));
       report.add(border);
       for (int i = 0; i < stepSummary.size(); i++) {
       	String stepName = stepSummary.get(i);
       	String retCode = String.format("%02d", (stepMap.containsKey(stepName)) ? stepMap.get(stepName) : 0);
       	String formattedStepName = stepName.toUpperCase();
       	String progName = stepProgm.get(i).toUpperCase();
       	String status;
       	if (skipList.contains(stepName)) {
       		status = "FLUSH";
       	} else if (abendList.contains(stepName)) {
       		status = "ABEND";
       	} else {
       		status = retCode;
      	}
       	String elapsedTime = getElapsed(stepName);
       	String formattedElapsedTime = formatElapsedTime(elapsedTime);
       	report.add(formatRow(formattedStepName, progName, status, formattedElapsedTime, stepNameMaxLength, progNameMaxLength, statusMaxLength, elapsedTimeMaxLength));
       	report.add(border);
      }
      report.add("  ");
      if(abendList.isEmpty()) {
          String formattedJobRc = String.format("%04d", jobRc);
          logger.info("JOB : ICE002 ENDED -  {}", formattedJobRc);
      } else { 
          logger.info("JOB : ICE002 ENDED -  ABEND={}", abendCode);
      } 
      logger.info(report.toString());
      SpringContextHandler.deleteTmpFiles();
    }
    
	 /**
	  * Generates a border string to be used for formatting in a report, based on the maximum lengths 
	  * of step names, program names, status, and elapsed time. 
	  * 
	  * @param list of step summary
    	  * @param list of step programs
	  * @return string representing the generated border.
	 */
    private String generateBorder(List<String> stepSummary, List<String> stepProgm) {
       int stepNameMaxLength = findMaxLength(stepSummary);
       int progNameMaxLength = findMaxLength(stepProgm);
       int statusMaxLength = Math.max("Status".length(), Math.max("FLUSH".length(), "ABEND".length()));
       int elapsedTimeMaxLength = "Elapsed Time".length();
       int totalWidth = stepNameMaxLength + progNameMaxLength + statusMaxLength + elapsedTimeMaxLength+31;
       StringBuilder borderBuilder = new StringBuilder("+");
       for (int i = 0; i < totalWidth; i++) {
       	borderBuilder.append("-");
       }
       borderBuilder.append("+");
       return borderBuilder.toString();
    }
    
	/**
	* Finds the maximum length among the strings in the provided list.
	* 
	*/
    private int findMaxLength(List<String> strings) {
       int maxLength = 0;
       for (String s : strings) {
       	maxLength = Math.max(maxLength, s.length());
       }
       return maxLength;
    }
    
	/**
	* Formats the elapsed time represented by the given string into a standardized format of hours, 
	* minutes, seconds, and milliseconds. 
	* 
	*/
    public static String formatElapsedTime(String elapsedTime) {
       int hours = 0, minutes = 0, seconds = 0, milliseconds = 0;
       String[] parts = elapsedTime.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
       for (int i = 0; i < parts.length; i += 2) {
    		int value = Integer.parseInt(parts[i]);
       	if (i + 1 < parts.length) {
       		String unit = parts[i + 1];
       		switch (unit) {
       			case "h":
       				hours = value;
    					break;
       			case "m":
       				minutes = value;
       				break;
    				case "s":
       				seconds = value;
       				break;
       			case "ms":
       				milliseconds = value;
       				break;
       		}
       	}
   	}
   	return String.format("%02d:%02d:%02d:%03d", hours, minutes, seconds, milliseconds);
   }
    
	/**
	* Formats a row of data with specified step name, program name, status, and elapsed time, 
	* adjusting the padding to fit the maximum lengths provided for each field. 
	* 
	*/
	private String formatRow(String stepName, String progName, String status, String elapsedTime, int stepNameMaxLength, int progNameMaxLength, int statusMaxLength, int elapsedTimeMaxLength) {
		String format = "| %-"+(stepNameMaxLength+5)+"s | %-"+(progNameMaxLength+5)+"s | %-"+(statusMaxLength+5)+"s | %-"+(elapsedTimeMaxLength+5)+"s |";
		return String.format(format, stepName, progName, status, elapsedTime);
	}
    
	private String getElapsed(String stepName) {
	    StepExecution stepExecution = stepInfo.get(stepName);
		if(stepExecution != null) { 
		    Duration duration = BatchMetrics.calculateDuration(stepExecution.getStartTime(), stepExecution.getEndTime());
		    return (duration != null && duration.isZero()) ? "1ms" /*Less than a millisecond */ : BatchMetrics.formatDuration(duration);
		}
	    return "";
	}
    
/**
 * Updates the step execution info
* 
* @param stepName
* @param chunkContext
* @param rcStatus
* @param status
*/
    public void updateStepExecution(String stepName, ChunkContext chunkContext , String rcStatus , String status) {
    	StepExecution stepExecution = chunkContext.getStepContext().getStepExecution();
      ExitStatus exitStatus = new ExitStatus(status, rcStatus);
      stepExecution.setExitStatus(exitStatus);
      stepInfo.put(stepName, stepExecution);
      isNormalExit = true; //resetting normalExit at end
    }
    
    /**
     * Updates the sort step execution end time information
     * @param stepName
     */   
     public void updateSortStepExecution(String stepName) {
        StepExecution stepExecution = stepInfo.get(stepName);
        if(stepExecution != null) {
           stepExecution.setEndTime(LocalDateTime.now());
           stepInfo.put(stepName, stepExecution);
        }
      }
    
    public Integer getRcForStep(String stepName) {
   	return stepMap.get(stepName);
    }
    
    private void updateJobRc(int rc) {
    	if (jobRc < rc)
    		jobRc = rc;
    }
    
    public int getJobRc() {
    	return jobRc;
    }
    public void intializeStepDetails() {
        init();
        stepsInfo.forEach(this::updateDDInfo);
    }
    
    private void updateDDInfo(StepInfo si) {
        SpringContextHandler.updateDDInfo(si.getDataSetInfos());
    }
    
    private void init() {
        skipFirst = true;
        jobRc = 0;
        isNormalExit = true;
        abendCode = "";
        refreshList.clear();
        stepMap.clear();
        skipList.clear();
        abendList.clear();
        stepInfo.clear();
        dynamicBeanMap.clear();
        stepSummary.clear();
        stepProgm.clear();
        SpringContextHandler.getCFContext().getFileMap().clear();
    }
}
