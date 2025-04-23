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
    private static final String SORT1 = "sort1";
    private static final String SORT2 = "sort2";
    private static final String SORT3 = "sort3";
    private static final String SORT4 = "sort4";
    private static final String SORT5 = "sort5";
    private static final String SORT6 = "sort6";
    private static final String SORT7 = "sort7";
    private static final String SORT8 = "sort8";
    private static final String SORT9 = "sort9";
    private static final String SORT10 = "sort10";
    private static final String SORT11 = "sort11";
    private static final String SORT12 = "sort12";
    private static final String SORT13 = "sort13";
    private static final String SORT14 = "sort14";
    private static final String SORT15 = "sort15";
    private static final String SORT16 = "sort16";
    private static final String SORT18 = "sort18";
    private static final String SORT19 = "sort19";
    private static final String SORT20 = "sort20";
    
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
	          case SORT1:
	              canExecute = (true);
	          break;
	          case SORT2:
	              canExecute = abendList.isEmpty() && deciderForSort2();
	          break;
	          case SORT3:
	              canExecute = abendList.isEmpty() && deciderForSort3();
	          break;
	          case SORT4:
	              canExecute = abendList.isEmpty() && deciderForSort4();
	          break;
	          case SORT5:
	              canExecute = abendList.isEmpty() && deciderForSort5();
	          break;
	          case SORT6:
	              canExecute = abendList.isEmpty() && deciderForSort6();
	          break;
	          case SORT7:
	              canExecute = abendList.isEmpty() && deciderForSort7();
	          break;
	          case SORT8:
	              canExecute = abendList.isEmpty() && deciderForSort8();
	          break;
	          case SORT9:
	              canExecute = abendList.isEmpty() && deciderForSort9();
	          break;
	          case SORT10:
	              canExecute = abendList.isEmpty() && deciderForSort10();
	          break;
	          case SORT11:
	              canExecute = abendList.isEmpty() && deciderForSort11();
	          break;
	          case SORT12:
	              canExecute = abendList.isEmpty() && deciderForSort12();
	          break;
	          case SORT13:
	              canExecute = abendList.isEmpty() && deciderForSort13();
	          break;
	          case SORT14:
	              canExecute = abendList.isEmpty() && deciderForSort14();
	          break;
	          case SORT15:
	              canExecute = abendList.isEmpty() && deciderForSort15();
	          break;
	          case SORT16:
	              canExecute = abendList.isEmpty() && deciderForSort16();
	          break;
	          case SORT18:
	              canExecute = abendList.isEmpty() && deciderForSort18();
	          break;
	          case SORT19:
	              canExecute = abendList.isEmpty() && deciderForSort19();
	          break;
	          case SORT20:
	              canExecute = abendList.isEmpty() && deciderForSort20();
	          break;
	          default:
	              canExecute = false;
	          break;
        }
if (!canExecute) skipList.add(stepName);
return canExecute;
    }
    
    private boolean deciderForSort2() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort3() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort4() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort5() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort6() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort7() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort8() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort9() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort10() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort11() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort12() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort13() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT12, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort14() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT12, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT13, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort15() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT12, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT13, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT14, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort16() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT12, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT13, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT14, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT15, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort18() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT12, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT13, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT14, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT15, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT16, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort19() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT12, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT13, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT14, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT15, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT16, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT18, 0, Cond.EQ) ) /*COND CODE*/ ;
    }
    
    private boolean deciderForSort20() {
        return ( CFUtil.validateStepRc(stepMap, SORT1, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT2, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT3, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT4, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT5, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT6, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT7, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT8, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT9, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT10, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT11, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT12, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT13, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT14, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT15, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT16, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT18, 0, Cond.EQ)  &&  CFUtil.validateStepRc(stepMap, SORT19, 0, Cond.EQ) ) /*COND CODE*/ ;
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
            case "sort1":  /* setting the disp position for file(s) info for this step(SORT1). */
                         SpringContextHandler.setFileDispPosition("IcemanSort1SortIn","IcemanSort1SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort1SortOut","IcemanSort1SortOut.DISP");
            break;
            case "sort2":  /* setting the disp position for file(s) info for this step(SORT2). */
                         SpringContextHandler.setFileDispPosition("IcemanSort2SortIn","IcemanSort2SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort2SortOut","IcemanSort2SortOut.DISP");
            break;
            case "sort3":  /* setting the disp position for file(s) info for this step(SORT3). */
                         SpringContextHandler.setFileDispPosition("IcemanSort3SortIn","IcemanSort3SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort3SortOut","IcemanSort3SortOut.DISP");
            break;
            case "sort4":  /* setting the disp position for file(s) info for this step(SORT4). */
                         SpringContextHandler.setFileDispPosition("IcemanSort4SortIn","IcemanSort4SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort4SortOut","IcemanSort4SortOut.DISP");
            break;
            case "sort5":  /* setting the disp position for file(s) info for this step(SORT5). */
                         SpringContextHandler.setFileDispPosition("IcemanSort5SortIn","IcemanSort5SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort5SortOut","IcemanSort5SortOut.DISP");
            break;
            case "sort6":  /* setting the disp position for file(s) info for this step(SORT6). */
                         SpringContextHandler.setFileDispPosition("IcemanSort6SortIn","IcemanSort6SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort6SortOut","IcemanSort6SortOut.DISP");
            break;
            case "sort7":  /* setting the disp position for file(s) info for this step(SORT7). */
                         SpringContextHandler.setFileDispPosition("IcemanSort7SortIn","IcemanSort7SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort7SortOut","IcemanSort7SortOut.DISP");
            break;
            case "sort8":  /* setting the disp position for file(s) info for this step(SORT8). */
                         SpringContextHandler.setFileDispPosition("IcemanSort8SortIn","IcemanSort8SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort8SortOut","IcemanSort8SortOut.DISP");
            break;
            case "sort9":  /* setting the disp position for file(s) info for this step(SORT9). */
                         SpringContextHandler.setFileDispPosition("IcemanSort9SortIn","IcemanSort9SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort9SortOut","IcemanSort9SortOut.DISP");
            break;
            case "sort10":  /* setting the disp position for file(s) info for this step(SORT10). */
                         SpringContextHandler.setFileDispPosition("IcemanSort10SortIn","IcemanSort10SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort10SortOut","IcemanSort10SortOut.DISP");
            break;
            case "sort11":  /* setting the disp position for file(s) info for this step(SORT11). */
                         SpringContextHandler.setFileDispPosition("IcemanSort11SortIn","IcemanSort11SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort11SortOut","IcemanSort11SortOut.DISP");
            break;
            case "sort12":  /* setting the disp position for file(s) info for this step(SORT12). */
                         SpringContextHandler.setFileDispPosition("IcemanSort12SortIn","IcemanSort12SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort12SortOut","IcemanSort12SortOut.DISP");
            break;
            case "sort13":  /* setting the disp position for file(s) info for this step(SORT13). */
                         SpringContextHandler.setFileDispPosition("IcemanSort13SortIn","IcemanSort13SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort13SortOut","IcemanSort13SortOut.DISP");
            break;
            case "sort14":  /* setting the disp position for file(s) info for this step(SORT14). */
                         SpringContextHandler.setFileDispPosition("IcemanSort14SortIn","IcemanSort14SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort14SortOut","IcemanSort14SortOut.DISP");
            break;
            case "sort15":  /* setting the disp position for file(s) info for this step(SORT15). */
                         SpringContextHandler.setFileDispPosition("IcemanSort15SortIn0","IcemanSort15SortIn[0].DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort15SortIn1","IcemanSort15SortIn[1].DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort15SortOut","IcemanSort15SortOut.DISP");
            break;
            case "sort16":  /* setting the disp position for file(s) info for this step(SORT16). */
                         SpringContextHandler.setFileDispPosition("IcemanSort16SortIn0","IcemanSort16SortIn[0].DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort16SortIn1","IcemanSort16SortIn[1].DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort16SortIn2","IcemanSort16SortIn[2].DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort16SortOut","IcemanSort16SortOut.DISP");
            break;
            case "sort18":  /* setting the disp position for file(s) info for this step(SORT18). */
                         SpringContextHandler.setFileDispPosition("IcemanSort18SortIn","IcemanSort18SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort18SortOut","IcemanSort18SortOut.DISP");
            break;
            case "sort19":  /* setting the disp position for file(s) info for this step(SORT19). */
                         SpringContextHandler.setFileDispPosition("IcemanSort19SortIn","IcemanSort19SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort19SortOut","IcemanSort19SortOut.DISP");
            break;
            case "sort20":  /* setting the disp position for file(s) info for this step(SORT20). */
                         SpringContextHandler.setFileDispPosition("IcemanSort20SortIn","IcemanSort20SortIn.DISP");
                         SpringContextHandler.setFileDispPosition("IcemanSort20SortOut","IcemanSort20SortOut.DISP");
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
          logger.info("JOB : ICEMAN ENDED -  {}", formattedJobRc);
      } else { 
          logger.info("JOB : ICEMAN ENDED -  ABEND={}", abendCode);
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
