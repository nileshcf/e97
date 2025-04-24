package com.cloudframe.app.vsammon1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.vsammon1.dto.AcceptInputGroup;
import com.cloudframe.app.vsammon1.dto.Work;
import com.cloudframe.app.vsammon1.dto.Input;
import com.cloudframe.app.vsammon1.file.records.MonitorRecord;
import com.cloudframe.app.vsammon1.file.records.MonPriKey;
import com.cloudframe.app.vsammon1.file.records.Reprec;
import com.cloudframe.app.vsammon1.dto.MonitorFileStatus;


@Context
public class Vsammon1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    MonitorRecord monitorRecord;
    AcceptInputGroup acceptInputGroup;
    Reprec reprec;
    MonitorFileStatus monitorFileStatus;
    Work work;


    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }

    boolean doNotSkipCloseFiles = true;

    public boolean getDoNotSkipCloseFiles() {
        return this.doNotSkipCloseFiles;
    }

    public void setDoNotSkipCloseFiles(boolean doNotSkipCloseFiles) {
            this.doNotSkipCloseFiles = doNotSkipCloseFiles;
        }
    boolean doNotSkipMethodBasedReport = true;

    public boolean getDoNotSkipMethodBasedReport() {
        return this.doNotSkipMethodBasedReport;
    }

    public void setDoNotSkipMethodBasedReport(boolean doNotSkipMethodBasedReport) {
            this.doNotSkipMethodBasedReport = doNotSkipMethodBasedReport;
        }
    boolean doNotSkipProgramBasedReport = true;

    public boolean getDoNotSkipProgramBasedReport() {
        return this.doNotSkipProgramBasedReport;
    }

    public void setDoNotSkipProgramBasedReport(boolean doNotSkipProgramBasedReport) {
            this.doNotSkipProgramBasedReport = doNotSkipProgramBasedReport;
        }
    boolean doNotSkipProgramBasedReport2001 = true;

    public boolean getDoNotSkipProgramBasedReport2001() {
        return this.doNotSkipProgramBasedReport2001;
    }

    public void setDoNotSkipProgramBasedReport2001(boolean doNotSkipProgramBasedReport2001) {
            this.doNotSkipProgramBasedReport2001 = doNotSkipProgramBasedReport2001;
        }
    boolean doNotSkipIpaddrBasedReport = true;

    public boolean getDoNotSkipIpaddrBasedReport() {
        return this.doNotSkipIpaddrBasedReport;
    }

    public void setDoNotSkipIpaddrBasedReport(boolean doNotSkipIpaddrBasedReport) {
            this.doNotSkipIpaddrBasedReport = doNotSkipIpaddrBasedReport;
        }
    boolean doNotSkipKeyreadBasedReport = true;

    public boolean getDoNotSkipKeyreadBasedReport() {
        return this.doNotSkipKeyreadBasedReport;
    }

    public void setDoNotSkipKeyreadBasedReport(boolean doNotSkipKeyreadBasedReport) {
            this.doNotSkipKeyreadBasedReport = doNotSkipKeyreadBasedReport;
        }
    boolean doNotSkipKeyreadnBasedReport = true;

    public boolean getDoNotSkipKeyreadnBasedReport() {
        return this.doNotSkipKeyreadnBasedReport;
    }

    public void setDoNotSkipKeyreadnBasedReport(boolean doNotSkipKeyreadnBasedReport) {
            this.doNotSkipKeyreadnBasedReport = doNotSkipKeyreadnBasedReport;
        }
    boolean doNotSkipInsertBasedReport = true;

    public boolean getDoNotSkipInsertBasedReport() {
        return this.doNotSkipInsertBasedReport;
    }

    public void setDoNotSkipInsertBasedReport(boolean doNotSkipInsertBasedReport) {
            this.doNotSkipInsertBasedReport = doNotSkipInsertBasedReport;
        }
    boolean doNotSkipDeleteBasedReport = true;

    public boolean getDoNotSkipDeleteBasedReport() {
        return this.doNotSkipDeleteBasedReport;
    }

    public void setDoNotSkipDeleteBasedReport(boolean doNotSkipDeleteBasedReport) {
            this.doNotSkipDeleteBasedReport = doNotSkipDeleteBasedReport;
        }

    public MonitorRecord getMonitorRecord() {
        if (monitorRecord == null) {
            monitorRecord = new MonitorRecord();
        }

        return monitorRecord;
    }

    public void setMonitorRecord(MonitorRecord monitorRecord) {
        this.monitorRecord = monitorRecord;
    }
    public AcceptInputGroup getAcceptInputGroup() {
        if (acceptInputGroup == null) {
            acceptInputGroup = new AcceptInputGroup();
        }

        return acceptInputGroup;
    }

    public void setAcceptInputGroup(AcceptInputGroup acceptInputGroup) {
        this.acceptInputGroup = acceptInputGroup;
    }
    public Reprec getReprec() {
        if (reprec == null) {
            reprec = new Reprec();
        }

        return reprec;
    }

    public void setReprec(Reprec reprec) {
        this.reprec = reprec;
    }
    public MonitorFileStatus getMonitorFileStatus() {
        if (monitorFileStatus == null) {
            monitorFileStatus = new MonitorFileStatus();
        }

        return monitorFileStatus;
    }

    public void setMonitorFileStatus(MonitorFileStatus monitorFileStatus) {
        this.monitorFileStatus = monitorFileStatus;
    }
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Vsammon1Ctx clone() {
        Vsammon1Ctx cloneObj = new Vsammon1Ctx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineOutCtx implements Cloneable {
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();

	/**
	 *	Test condition "KYREADN" for isCKeyreadn()
	 *	@return  Returns true if isCKeyreadn() is "KYREADN"
	 */
   public boolean isCKeyreadn() throws CFException {
      return acceptInputGroup.getInput().isCKeyreadn();
   }

	/**
	*  set values "KYREADN"
	*/
   	public void setCKeyreadnTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCKeyreadnTrue();
   	}
	/**
	 *	Returns the value of acceptInput
	 *	@return acceptInput
	 */
   public char[] getAcceptInput() throws CFException  {              
   		return acceptInputGroup.getAcceptInput();
   }

  
	/**
	*  set variable acceptInput
	*  @param value
	**/
   public void setAcceptInput(char[] value) throws CFException {
      acceptInputGroup.setAcceptInput(value);
   } 

     /**
	 * 	Update AcceptInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcceptInput(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.setAcceptInput(source, sourceIndex);
   	
   }
   
   public void setAcceptInput(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AcceptInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcceptInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AcceptInput with another Field
	 *	@param value
	 */
   public void setAcceptInput(Field source) {
      acceptInputGroup.setAcceptInput(source);
   }  
   
     /**
	 * 	Update AcceptInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcceptInput(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AcceptInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcceptInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.setAcceptInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "IPADDR " for isCIpaddr()
	 *	@return  Returns true if isCIpaddr() is "IPADDR "
	 */
   public boolean isCIpaddr() throws CFException {
      return acceptInputGroup.getInput().isCIpaddr();
   }

	/**
	*  set values "IPADDR "
	*/
   	public void setCIpaddrTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCIpaddrTrue();
   	}
	/**
	 *	Test condition "INSERT " for isCInsert()
	 *	@return  Returns true if isCInsert() is "INSERT "
	 */
   public boolean isCInsert() throws CFException {
      return acceptInputGroup.getInput().isCInsert();
   }

	/**
	*  set values "INSERT "
	*/
   	public void setCInsertTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCInsertTrue();
   	}
	/**
	 *	Test condition "DELETE " for isCDelete()
	 *	@return  Returns true if isCDelete() is "DELETE "
	 */
   public boolean isCDelete() throws CFException {
      return acceptInputGroup.getInput().isCDelete();
   }

	/**
	*  set values "DELETE "
	*/
   	public void setCDeleteTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCDeleteTrue();
   	}
	/**
	 *	Test condition "METHOD " for isCMethod()
	 *	@return  Returns true if isCMethod() is "METHOD "
	 */
   public boolean isCMethod() throws CFException {
      return acceptInputGroup.getInput().isCMethod();
   }

	/**
	*  set values "METHOD "
	*/
   	public void setCMethodTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCMethodTrue();
   	}
	/**
	 *	Test condition "KYREAD " for isCKeyread()
	 *	@return  Returns true if isCKeyread() is "KYREAD "
	 */
   public boolean isCKeyread() throws CFException {
      return acceptInputGroup.getInput().isCKeyread();
   }

	/**
	*  set values "KYREAD "
	*/
   	public void setCKeyreadTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCKeyreadTrue();
   	}
	/**
	 *	Returns the value of input
	 *	@return input
	 */   
	 public Input getInput() {
   	return acceptInputGroup.getInput();
   }

   /**
	* 	Update Input with the passed value
	*	@param value
	*/
   public void setInput(char[] value) throws CFException {
      acceptInputGroup.setInput(value);
   }   

     /**
	 * 	Update Input 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInput(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Input 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Input with another Field
	 *	@param value
	 */
   public void setInput(Field source) {
   	acceptInputGroup.setInput(source);
   }  
   
     /**
	 * 	Update Input 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInput(Field source, int sourceIndex,int sourceLen) {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Input 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	acceptInputGroup.setInput(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "*END*  " for isCTerminate()
	 *	@return  Returns true if isCTerminate() is "*END*  "
	 */
   public boolean isCTerminate() throws CFException {
      return acceptInputGroup.getInput().isCTerminate();
   }

	/**
	*  set values "*END*  "
	*/
   	public void setCTerminateTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCTerminateTrue();
   	}
	/**
	 *	Test condition "PROGRM " for isCProgram()
	 *	@return  Returns true if isCProgram() is "PROGRM "
	 */
   public boolean isCProgram() throws CFException {
      return acceptInputGroup.getInput().isCProgram();
   }

	/**
	*  set values "PROGRM "
	*/
   	public void setCProgramTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCProgramTrue();
   	}
	/**
	 *	Test condition "PROGRM*" for isCProgram1()
	 *	@return  Returns true if isCProgram1() is "PROGRM*"
	 */
   public boolean isCProgram1() throws CFException {
      return acceptInputGroup.getInput().isCProgram1();
   }

	/**
	*  set values "PROGRM*"
	*/
   	public void setCProgram1True()  throws CFException{  			
    	acceptInputGroup.getInput().setCProgram1True();
   	}

        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class OpenFilesInCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public OpenFilesOutCtx getOpenFilesOutCtx() {
            return new OpenFilesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesInCtx getOpenFilesInCtx() {
            return new OpenFilesInCtx();
    }
     public class OpenFilesOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }



        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
       return str.hashCode();
    }

    public OpenFilesOutCtx clone() {
        OpenFilesOutCtx cloneObj = new OpenFilesOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesOutCtx getOpenFilesOutCtx() {
            return new OpenFilesOutCtx();
    }
     public class CloseFilesOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }



        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorFileStatus.hashCode();
       return str.hashCode();
    }

    public CloseFilesOutCtx clone() {
        CloseFilesOutCtx cloneObj = new CloseFilesOutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        return cloneObj;
    }

    }

    public CloseFilesOutCtx getCloseFilesOutCtx() {
            return new CloseFilesOutCtx();
    }
     public class MethodBasedReportInCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of staInStat1
	 *	@return staInStat1
	 */
   public char[] getStaInStat1() throws CFException  {              
   		return monitorFileStatus.getStaInStat1();
   }

  
	/**
	*  set variable staInStat1
	*  @param value
	**/
   public void setStaInStat1(char[] value) throws CFException {
      monitorFileStatus.setStaInStat1(value);
   } 

     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex) throws CFException {
      monitorFileStatus.setStaInStat1(source, sourceIndex);
   	
   }
   
   public void setStaInStat1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StaInStat1 with another Field
	 *	@param value
	 */
   public void setStaInStat1(Field source) {
      monitorFileStatus.setStaInStat1(source);
   }  
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iMethod
	 *	@return iMethod
	 */
   public char[] getIMethod() throws CFException  {              
   		return acceptInputGroup.getInput().getMethodData().getIMethod();
   }

  
	/**
	*  set variable iMethod
	*  @param value
	**/
   public void setIMethod(char[] value) throws CFException {
      acceptInputGroup.getInput().getMethodData().setIMethod(value);
   } 

     /**
	 * 	Update IMethod 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIMethod(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex);
   	
   }
   
   public void setIMethod(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IMethod 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIMethod(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IMethod with another Field
	 *	@param value
	 */
   public void setIMethod(Field source) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source);
   }  
   
     /**
	 * 	Update IMethod 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIMethod(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IMethod 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIMethod(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public MethodBasedReportOutCtx getMethodBasedReportOutCtx() {
            return new MethodBasedReportOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MethodBasedReportInCtx clone() {
        MethodBasedReportInCtx cloneObj = new MethodBasedReportInCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MethodBasedReportInCtx getMethodBasedReportInCtx() {
            return new MethodBasedReportInCtx();
    }
     public class MethodBasedReportOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Test condition "Y" for isEndOfMonitor()
	 *	@return  Returns true if isEndOfMonitor() is "Y"
	 */
   public boolean isEndOfMonitor() throws CFException {
      return work.isEndOfMonitor();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfMonitorTrue()  throws CFException{  			
    	work.setEndOfMonitorTrue();
   	}
	/**
	 *	Returns the value of iMethod
	 *	@return iMethod
	 */
   public char[] getIMethod() throws CFException  {              
   		return acceptInputGroup.getInput().getMethodData().getIMethod();
   }

  
	/**
	*  set variable iMethod
	*  @param value
	**/
   public void setIMethod(char[] value) throws CFException {
      acceptInputGroup.getInput().getMethodData().setIMethod(value);
   } 

     /**
	 * 	Update IMethod 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIMethod(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex);
   	
   }
   
   public void setIMethod(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IMethod 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIMethod(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IMethod with another Field
	 *	@param value
	 */
   public void setIMethod(Field source) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source);
   }  
   
     /**
	 * 	Update IMethod 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIMethod(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IMethod 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIMethod(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getMethodData().setIMethod(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtMthdNm
	 *	@return monXcdtMthdNm
	 */
   public char[] getMonXcdtMthdNm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtMthdNm();
   }

  
	/**
	*  set variable monXcdtMthdNm
	*  @param value
	**/
   public void setMonXcdtMthdNm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtMthdNm(value);
   } 

     /**
	 * 	Update MonXcdtMthdNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtMthdNm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtMthdNm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtMthdNm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtMthdNm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtMthdNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtMthdNm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtMthdNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtMthdNm with another Field
	 *	@param value
	 */
   public void setMonXcdtMthdNm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtMthdNm(source);
   }  
   
     /**
	 * 	Update MonXcdtMthdNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtMthdNm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtMthdNm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtMthdNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtMthdNm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtMthdNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MethodBasedReportOutCtx clone() {
        MethodBasedReportOutCtx cloneObj = new MethodBasedReportOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MethodBasedReportOutCtx getMethodBasedReportOutCtx() {
            return new MethodBasedReportOutCtx();
    }
     public class ProgramBasedReportInCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of iProgram
	 *	@return iProgram
	 */
   public char[] getIProgram() throws CFException  {              
   		return acceptInputGroup.getInput().getProgramData().getIProgram();
   }

  
	/**
	*  set variable iProgram
	*  @param value
	**/
   public void setIProgram(char[] value) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(value);
   } 

     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex);
   	
   }
   
   public void setIProgram(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IProgram with another Field
	 *	@param value
	 */
   public void setIProgram(Field source) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source);
   }  
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of staInStat1
	 *	@return staInStat1
	 */
   public char[] getStaInStat1() throws CFException  {              
   		return monitorFileStatus.getStaInStat1();
   }

  
	/**
	*  set variable staInStat1
	*  @param value
	**/
   public void setStaInStat1(char[] value) throws CFException {
      monitorFileStatus.setStaInStat1(value);
   } 

     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex) throws CFException {
      monitorFileStatus.setStaInStat1(source, sourceIndex);
   	
   }
   
   public void setStaInStat1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StaInStat1 with another Field
	 *	@param value
	 */
   public void setStaInStat1(Field source) {
      monitorFileStatus.setStaInStat1(source);
   }  
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public ProgramBasedReportOutCtx getProgramBasedReportOutCtx() {
            return new ProgramBasedReportOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProgramBasedReportInCtx clone() {
        ProgramBasedReportInCtx cloneObj = new ProgramBasedReportInCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBasedReportInCtx getProgramBasedReportInCtx() {
            return new ProgramBasedReportInCtx();
    }
     public class ProgramBasedReportOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of iProgram
	 *	@return iProgram
	 */
   public char[] getIProgram() throws CFException  {              
   		return acceptInputGroup.getInput().getProgramData().getIProgram();
   }

  
	/**
	*  set variable iProgram
	*  @param value
	**/
   public void setIProgram(char[] value) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(value);
   } 

     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex);
   	
   }
   
   public void setIProgram(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IProgram with another Field
	 *	@param value
	 */
   public void setIProgram(Field source) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source);
   }  
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of monXcdtProgNm
	 *	@return monXcdtProgNm
	 */
   public char[] getMonXcdtProgNm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtProgNm();
   }

  
	/**
	*  set variable monXcdtProgNm
	*  @param value
	**/
   public void setMonXcdtProgNm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(value);
   } 

     /**
	 * 	Update MonXcdtProgNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtProgNm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtProgNm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtProgNm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtProgNm with another Field
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source);
   }  
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfMonitor()
	 *	@return  Returns true if isEndOfMonitor() is "Y"
	 */
   public boolean isEndOfMonitor() throws CFException {
      return work.isEndOfMonitor();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfMonitorTrue()  throws CFException{  			
    	work.setEndOfMonitorTrue();
   	}
	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProgramBasedReportOutCtx clone() {
        ProgramBasedReportOutCtx cloneObj = new ProgramBasedReportOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBasedReportOutCtx getProgramBasedReportOutCtx() {
            return new ProgramBasedReportOutCtx();
    }
     public class ProgramBasedReport2001InCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of iProgram
	 *	@return iProgram
	 */
   public char[] getIProgram() throws CFException  {              
   		return acceptInputGroup.getInput().getProgramData().getIProgram();
   }

  
	/**
	*  set variable iProgram
	*  @param value
	**/
   public void setIProgram(char[] value) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(value);
   } 

     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex);
   	
   }
   
   public void setIProgram(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IProgram with another Field
	 *	@param value
	 */
   public void setIProgram(Field source) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source);
   }  
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public ProgramBasedReport2001OutCtx getProgramBasedReport2001OutCtx() {
            return new ProgramBasedReport2001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProgramBasedReport2001InCtx clone() {
        ProgramBasedReport2001InCtx cloneObj = new ProgramBasedReport2001InCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBasedReport2001InCtx getProgramBasedReport2001InCtx() {
            return new ProgramBasedReport2001InCtx();
    }
     public class ProgramBasedReport2001OutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of iProgram
	 *	@return iProgram
	 */
   public char[] getIProgram() throws CFException  {              
   		return acceptInputGroup.getInput().getProgramData().getIProgram();
   }

  
	/**
	*  set variable iProgram
	*  @param value
	**/
   public void setIProgram(char[] value) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(value);
   } 

     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex);
   	
   }
   
   public void setIProgram(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IProgram 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IProgram with another Field
	 *	@param value
	 */
   public void setIProgram(Field source) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source);
   }  
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IProgram 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIProgram(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getProgramData().setIProgram(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of monXcdtProgNm
	 *	@return monXcdtProgNm
	 */
   public char[] getMonXcdtProgNm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtProgNm();
   }

  
	/**
	*  set variable monXcdtProgNm
	*  @param value
	**/
   public void setMonXcdtProgNm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(value);
   } 

     /**
	 * 	Update MonXcdtProgNm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtProgNm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtProgNm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtProgNm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtProgNm with another Field
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source);
   }  
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtProgNm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtProgNm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtProgNm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfMonitor()
	 *	@return  Returns true if isEndOfMonitor() is "Y"
	 */
   public boolean isEndOfMonitor() throws CFException {
      return work.isEndOfMonitor();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfMonitorTrue()  throws CFException{  			
    	work.setEndOfMonitorTrue();
   	}
	/**
	 *	Returns the value of staInStat1
	 *	@return staInStat1
	 */
   public char[] getStaInStat1() throws CFException  {              
   		return monitorFileStatus.getStaInStat1();
   }

  
	/**
	*  set variable staInStat1
	*  @param value
	**/
   public void setStaInStat1(char[] value) throws CFException {
      monitorFileStatus.setStaInStat1(value);
   } 

     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex) throws CFException {
      monitorFileStatus.setStaInStat1(source, sourceIndex);
   	
   }
   
   public void setStaInStat1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StaInStat1 with another Field
	 *	@param value
	 */
   public void setStaInStat1(Field source) {
      monitorFileStatus.setStaInStat1(source);
   }  
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProgramBasedReport2001OutCtx clone() {
        ProgramBasedReport2001OutCtx cloneObj = new ProgramBasedReport2001OutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProgramBasedReport2001OutCtx getProgramBasedReport2001OutCtx() {
            return new ProgramBasedReport2001OutCtx();
    }
     public class IpaddrBasedReportInCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of staInStat1
	 *	@return staInStat1
	 */
   public char[] getStaInStat1() throws CFException  {              
   		return monitorFileStatus.getStaInStat1();
   }

  
	/**
	*  set variable staInStat1
	*  @param value
	**/
   public void setStaInStat1(char[] value) throws CFException {
      monitorFileStatus.setStaInStat1(value);
   } 

     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex) throws CFException {
      monitorFileStatus.setStaInStat1(source, sourceIndex);
   	
   }
   
   public void setStaInStat1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StaInStat1 with another Field
	 *	@param value
	 */
   public void setStaInStat1(Field source) {
      monitorFileStatus.setStaInStat1(source);
   }  
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iIpaddr
	 *	@return iIpaddr
	 */
   public char[] getIIpaddr() throws CFException  {              
   		return acceptInputGroup.getInput().getIpaddrData().getIIpaddr();
   }

  
	/**
	*  set variable iIpaddr
	*  @param value
	**/
   public void setIIpaddr(char[] value) throws CFException {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(value);
   } 

     /**
	 * 	Update IIpaddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIIpaddr(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex);
   	
   }
   
   public void setIIpaddr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IIpaddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIIpaddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IIpaddr with another Field
	 *	@param value
	 */
   public void setIIpaddr(Field source) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source);
   }  
   
     /**
	 * 	Update IIpaddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIIpaddr(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IIpaddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIIpaddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public IpaddrBasedReportOutCtx getIpaddrBasedReportOutCtx() {
            return new IpaddrBasedReportOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public IpaddrBasedReportInCtx clone() {
        IpaddrBasedReportInCtx cloneObj = new IpaddrBasedReportInCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public IpaddrBasedReportInCtx getIpaddrBasedReportInCtx() {
            return new IpaddrBasedReportInCtx();
    }
     public class IpaddrBasedReportOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monXcdtReqrIpAd
	 *	@return monXcdtReqrIpAd
	 */
   public char[] getMonXcdtReqrIpAd() throws CFException  {              
   		return monitorRecord.getMonXcdtReqrIpAd();
   }

  
	/**
	*  set variable monXcdtReqrIpAd
	*  @param value
	**/
   public void setMonXcdtReqrIpAd(char[] value) throws CFException {
      monitorRecord.setMonXcdtReqrIpAd(value);
   } 

     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex);
   	
   }
   
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtReqrIpAd with another Field
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source) {
      monitorRecord.setMonXcdtReqrIpAd(source);
   }  
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Test condition "Y" for isEndOfMonitor()
	 *	@return  Returns true if isEndOfMonitor() is "Y"
	 */
   public boolean isEndOfMonitor() throws CFException {
      return work.isEndOfMonitor();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfMonitorTrue()  throws CFException{  			
    	work.setEndOfMonitorTrue();
   	}
	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iIpaddr
	 *	@return iIpaddr
	 */
   public char[] getIIpaddr() throws CFException  {              
   		return acceptInputGroup.getInput().getIpaddrData().getIIpaddr();
   }

  
	/**
	*  set variable iIpaddr
	*  @param value
	**/
   public void setIIpaddr(char[] value) throws CFException {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(value);
   } 

     /**
	 * 	Update IIpaddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIIpaddr(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex);
   	
   }
   
   public void setIIpaddr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IIpaddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIIpaddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IIpaddr with another Field
	 *	@param value
	 */
   public void setIIpaddr(Field source) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source);
   }  
   
     /**
	 * 	Update IIpaddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIIpaddr(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IIpaddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIIpaddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getIpaddrData().setIIpaddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public IpaddrBasedReportOutCtx clone() {
        IpaddrBasedReportOutCtx cloneObj = new IpaddrBasedReportOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public IpaddrBasedReportOutCtx getIpaddrBasedReportOutCtx() {
            return new IpaddrBasedReportOutCtx();
    }
     public class KeyreadBasedReportInCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of iKeyread
	 *	@return iKeyread
	 */
   public char[] getIKeyread() throws CFException  {              
   		return acceptInputGroup.getInput().getKeyreadData().getIKeyread();
   }

  
	/**
	*  set variable iKeyread
	*  @param value
	**/
   public void setIKeyread(char[] value) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(value);
   } 

     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex);
   	
   }
   
   public void setIKeyread(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IKeyread with another Field
	 *	@param value
	 */
   public void setIKeyread(Field source) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source);
   }  
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public KeyreadBasedReportOutCtx getKeyreadBasedReportOutCtx() {
            return new KeyreadBasedReportOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public KeyreadBasedReportInCtx clone() {
        KeyreadBasedReportInCtx cloneObj = new KeyreadBasedReportInCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadBasedReportInCtx getKeyreadBasedReportInCtx() {
            return new KeyreadBasedReportInCtx();
    }
     public class KeyreadBasedReportOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of staInStat1
	 *	@return staInStat1
	 */
   public char[] getStaInStat1() throws CFException  {              
   		return monitorFileStatus.getStaInStat1();
   }

  
	/**
	*  set variable staInStat1
	*  @param value
	**/
   public void setStaInStat1(char[] value) throws CFException {
      monitorFileStatus.setStaInStat1(value);
   } 

     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex) throws CFException {
      monitorFileStatus.setStaInStat1(source, sourceIndex);
   	
   }
   
   public void setStaInStat1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StaInStat1 with another Field
	 *	@param value
	 */
   public void setStaInStat1(Field source) {
      monitorFileStatus.setStaInStat1(source);
   }  
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iKeyread
	 *	@return iKeyread
	 */
   public char[] getIKeyread() throws CFException  {              
   		return acceptInputGroup.getInput().getKeyreadData().getIKeyread();
   }

  
	/**
	*  set variable iKeyread
	*  @param value
	**/
   public void setIKeyread(char[] value) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(value);
   } 

     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex);
   	
   }
   
   public void setIKeyread(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IKeyread with another Field
	 *	@param value
	 */
   public void setIKeyread(Field source) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source);
   }  
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public KeyreadBasedReportOutCtx clone() {
        KeyreadBasedReportOutCtx cloneObj = new KeyreadBasedReportOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadBasedReportOutCtx getKeyreadBasedReportOutCtx() {
            return new KeyreadBasedReportOutCtx();
    }
     public class KeyreadnBasedReportInCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of iKeyread
	 *	@return iKeyread
	 */
   public char[] getIKeyread() throws CFException  {              
   		return acceptInputGroup.getInput().getKeyreadData().getIKeyread();
   }

  
	/**
	*  set variable iKeyread
	*  @param value
	**/
   public void setIKeyread(char[] value) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(value);
   } 

     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex);
   	
   }
   
   public void setIKeyread(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IKeyread with another Field
	 *	@param value
	 */
   public void setIKeyread(Field source) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source);
   }  
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public KeyreadnBasedReportOutCtx getKeyreadnBasedReportOutCtx() {
            return new KeyreadnBasedReportOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public KeyreadnBasedReportInCtx clone() {
        KeyreadnBasedReportInCtx cloneObj = new KeyreadnBasedReportInCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadnBasedReportInCtx getKeyreadnBasedReportInCtx() {
            return new KeyreadnBasedReportInCtx();
    }
     public class KeyreadnBasedReportOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of staInStat1
	 *	@return staInStat1
	 */
   public char[] getStaInStat1() throws CFException  {              
   		return monitorFileStatus.getStaInStat1();
   }

  
	/**
	*  set variable staInStat1
	*  @param value
	**/
   public void setStaInStat1(char[] value) throws CFException {
      monitorFileStatus.setStaInStat1(value);
   } 

     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex) throws CFException {
      monitorFileStatus.setStaInStat1(source, sourceIndex);
   	
   }
   
   public void setStaInStat1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StaInStat1 with another Field
	 *	@param value
	 */
   public void setStaInStat1(Field source) {
      monitorFileStatus.setStaInStat1(source);
   }  
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StaInStat1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStaInStat1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorFileStatus.setStaInStat1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfMonitor()
	 *	@return  Returns true if isEndOfMonitor() is "Y"
	 */
   public boolean isEndOfMonitor() throws CFException {
      return work.isEndOfMonitor();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfMonitorTrue()  throws CFException{  			
    	work.setEndOfMonitorTrue();
   	}
	/**
	 *	Returns the value of iKeyread
	 *	@return iKeyread
	 */
   public char[] getIKeyread() throws CFException  {              
   		return acceptInputGroup.getInput().getKeyreadData().getIKeyread();
   }

  
	/**
	*  set variable iKeyread
	*  @param value
	**/
   public void setIKeyread(char[] value) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(value);
   } 

     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex);
   	
   }
   
   public void setIKeyread(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IKeyread with another Field
	 *	@param value
	 */
   public void setIKeyread(Field source) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source);
   }  
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getKeyreadData().setIKeyread(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public KeyreadnBasedReportOutCtx clone() {
        KeyreadnBasedReportOutCtx cloneObj = new KeyreadnBasedReportOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadnBasedReportOutCtx getKeyreadnBasedReportOutCtx() {
            return new KeyreadnBasedReportOutCtx();
    }
     public class InsertBasedReportInCtx implements Cloneable {
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of iInsertKey
	 *	@return iInsertKey
	 */
   public char[] getIInsertKey() throws CFException  {              
   		return acceptInputGroup.getInput().getInsertData().getIInsertKey();
   }

  
	/**
	*  set variable iInsertKey
	*  @param value
	**/
   public void setIInsertKey(char[] value) throws CFException {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(value);
   } 

     /**
	 * 	Update IInsertKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIInsertKey(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex);
   	
   }
   
   public void setIInsertKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IInsertKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIInsertKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IInsertKey with another Field
	 *	@param value
	 */
   public void setIInsertKey(Field source) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source);
   }  
   
     /**
	 * 	Update IInsertKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIInsertKey(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IInsertKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIInsertKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public InsertBasedReportOutCtx getInsertBasedReportOutCtx() {
            return new InsertBasedReportOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertBasedReportInCtx clone() {
        InsertBasedReportInCtx cloneObj = new InsertBasedReportInCtx();
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertBasedReportInCtx getInsertBasedReportInCtx() {
            return new InsertBasedReportInCtx();
    }
     public class InsertBasedReportOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monXcdtReqrIpAd
	 *	@return monXcdtReqrIpAd
	 */
   public char[] getMonXcdtReqrIpAd() throws CFException  {              
   		return monitorRecord.getMonXcdtReqrIpAd();
   }

  
	/**
	*  set variable monXcdtReqrIpAd
	*  @param value
	**/
   public void setMonXcdtReqrIpAd(char[] value) throws CFException {
      monitorRecord.setMonXcdtReqrIpAd(value);
   } 

     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex);
   	
   }
   
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtReqrIpAd with another Field
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source) {
      monitorRecord.setMonXcdtReqrIpAd(source);
   }  
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtReqrIpAd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtReqrIpAd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtReqrIpAd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iInsertKey
	 *	@return iInsertKey
	 */
   public char[] getIInsertKey() throws CFException  {              
   		return acceptInputGroup.getInput().getInsertData().getIInsertKey();
   }

  
	/**
	*  set variable iInsertKey
	*  @param value
	**/
   public void setIInsertKey(char[] value) throws CFException {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(value);
   } 

     /**
	 * 	Update IInsertKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIInsertKey(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex);
   	
   }
   
   public void setIInsertKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IInsertKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIInsertKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IInsertKey with another Field
	 *	@param value
	 */
   public void setIInsertKey(Field source) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source);
   }  
   
     /**
	 * 	Update IInsertKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIInsertKey(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IInsertKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIInsertKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getInsertData().setIInsertKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertBasedReportOutCtx clone() {
        InsertBasedReportOutCtx cloneObj = new InsertBasedReportOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertBasedReportOutCtx getInsertBasedReportOutCtx() {
            return new InsertBasedReportOutCtx();
    }
     public class DeleteBasedReportInCtx implements Cloneable {
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of iDeleteKey
	 *	@return iDeleteKey
	 */
   public char[] getIDeleteKey() throws CFException  {              
   		return acceptInputGroup.getInput().getDeleteData().getIDeleteKey();
   }

  
	/**
	*  set variable iDeleteKey
	*  @param value
	**/
   public void setIDeleteKey(char[] value) throws CFException {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(value);
   } 

     /**
	 * 	Update IDeleteKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIDeleteKey(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex);
   	
   }
   
   public void setIDeleteKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IDeleteKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIDeleteKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IDeleteKey with another Field
	 *	@param value
	 */
   public void setIDeleteKey(Field source) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source);
   }  
   
     /**
	 * 	Update IDeleteKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIDeleteKey(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IDeleteKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIDeleteKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }

        public DeleteBasedReportOutCtx getDeleteBasedReportOutCtx() {
            return new DeleteBasedReportOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DeleteBasedReportInCtx clone() {
        DeleteBasedReportInCtx cloneObj = new DeleteBasedReportInCtx();
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DeleteBasedReportInCtx getDeleteBasedReportInCtx() {
            return new DeleteBasedReportInCtx();
    }
     public class DeleteBasedReportOutCtx implements Cloneable {
     MonitorRecord monitorRecord = Vsammon1Ctx.this.getMonitorRecord();
     AcceptInputGroup acceptInputGroup = Vsammon1Ctx.this.getAcceptInputGroup();
     Reprec reprec = Vsammon1Ctx.this.getReprec();
     MonitorFileStatus monitorFileStatus = Vsammon1Ctx.this.getMonitorFileStatus();
     Work work = Vsammon1Ctx.this.getWork();

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of monPriKey
	 *	@return monPriKey
	 */   
	 public MonPriKey getMonPriKey() {
   	return monitorRecord.getMonPriKey();
   }

   /**
	* 	Update MonPriKey with the passed value
	*	@param value
	*/
   public void setMonPriKey(char[] value) throws CFException {
      monitorRecord.setMonPriKey(value);
   }   

     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonPriKey with another Field
	 *	@param value
	 */
   public void setMonPriKey(Field source) {
   	monitorRecord.setMonPriKey(source);
   }  
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonPriKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonPriKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	monitorRecord.setMonPriKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of iDeleteKey
	 *	@return iDeleteKey
	 */
   public char[] getIDeleteKey() throws CFException  {              
   		return acceptInputGroup.getInput().getDeleteData().getIDeleteKey();
   }

  
	/**
	*  set variable iDeleteKey
	*  @param value
	**/
   public void setIDeleteKey(char[] value) throws CFException {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(value);
   } 

     /**
	 * 	Update IDeleteKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIDeleteKey(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex);
   	
   }
   
   public void setIDeleteKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IDeleteKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIDeleteKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IDeleteKey with another Field
	 *	@param value
	 */
   public void setIDeleteKey(Field source) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source);
   }  
   
     /**
	 * 	Update IDeleteKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIDeleteKey(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IDeleteKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIDeleteKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().getDeleteData().setIDeleteKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Vsammon1Ctx getVsammon1Ctx() {
            return Vsammon1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += monitorRecord.hashCode();
        str += acceptInputGroup.hashCode();
        str += reprec.hashCode();
        str += monitorFileStatus.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DeleteBasedReportOutCtx clone() {
        DeleteBasedReportOutCtx cloneObj = new DeleteBasedReportOutCtx();
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DeleteBasedReportOutCtx getDeleteBasedReportOutCtx() {
            return new DeleteBasedReportOutCtx();
    }
}
