package com.cloudframe.app.vsammon7;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.vsammon7.dto.Work;
import com.cloudframe.app.vsammon7.file.records.Reprec;
import com.cloudframe.app.vsammon7.dto.AcceptInputGroup;
import com.cloudframe.app.vsammon7.file.records.MonitorRecord;
import com.cloudframe.app.vsammon7.dto.Input;
import com.cloudframe.app.vsammon7.dto.MonitorFileStatus;
import com.cloudframe.app.vsammon7.file.records.MonPriKey;


@Context
public class Vsammon7Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    MonitorFileStatus monitorFileStatus;
    Work work;
    Reprec reprec;
    AcceptInputGroup acceptInputGroup;
    MonitorRecord monitorRecord;


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
    boolean doNotSkipKeyreadBasedReport = true;

    public boolean getDoNotSkipKeyreadBasedReport() {
        return this.doNotSkipKeyreadBasedReport;
    }

    public void setDoNotSkipKeyreadBasedReport(boolean doNotSkipKeyreadBasedReport) {
            this.doNotSkipKeyreadBasedReport = doNotSkipKeyreadBasedReport;
        }
    boolean doNotSkipReadnxt = true;

    public boolean getDoNotSkipReadnxt() {
        return this.doNotSkipReadnxt;
    }

    public void setDoNotSkipReadnxt(boolean doNotSkipReadnxt) {
            this.doNotSkipReadnxt = doNotSkipReadnxt;
        }
    boolean doNotSkipRn9999 = true;

    public boolean getDoNotSkipRn9999() {
        return this.doNotSkipRn9999;
    }

    public void setDoNotSkipRn9999(boolean doNotSkipRn9999) {
            this.doNotSkipRn9999 = doNotSkipRn9999;
        }
    boolean doNotSkipProgram = true;

    public boolean getDoNotSkipProgram() {
        return this.doNotSkipProgram;
    }

    public void setDoNotSkipProgram(boolean doNotSkipProgram) {
            this.doNotSkipProgram = doNotSkipProgram;
        }
    boolean doNotSkipStartp = true;

    public boolean getDoNotSkipStartp() {
        return this.doNotSkipStartp;
    }

    public void setDoNotSkipStartp(boolean doNotSkipStartp) {
            this.doNotSkipStartp = doNotSkipStartp;
        }
    boolean doNotSkipStarta = true;

    public boolean getDoNotSkipStarta() {
        return this.doNotSkipStarta;
    }

    public void setDoNotSkipStarta(boolean doNotSkipStarta) {
            this.doNotSkipStarta = doNotSkipStarta;
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
    public Reprec getReprec() {
        if (reprec == null) {
            reprec = new Reprec();
        }

        return reprec;
    }

    public void setReprec(Reprec reprec) {
        this.reprec = reprec;
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
    public MonitorRecord getMonitorRecord() {
        if (monitorRecord == null) {
            monitorRecord = new MonitorRecord();
        }

        return monitorRecord;
    }

    public void setMonitorRecord(MonitorRecord monitorRecord) {
        this.monitorRecord = monitorRecord;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public Vsammon7Ctx clone() {
        Vsammon7Ctx cloneObj = new Vsammon7Ctx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Vsammon7Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public long getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(long number)  throws CFException{
		work.setI(number);
	}
	

	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Returns the value of r
	 *	@return r
	 */
	public short getR() throws CFException {        
   		return work.getR();
	}
	
	/**
	 * 	Update R with the passed value
	 *	@param number
	 */
	public void setR(short number)  throws CFException{
		work.setR(number);
	}

	public void setR(int number)  throws CFException{
		work.setR((short)number);
	}

	public void setR(long number)  throws CFException{
		work.setR((short)number);
	}




        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Vsammon7Ctx.this.getWork();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();

	/**
	 *	Returns the value of inputCommand
	 *	@return inputCommand
	 */
   public char[] getInputCommand() throws CFException  {              
   		return acceptInputGroup.getInput().getInputCommand();
   }

  
	/**
	*  set variable inputCommand
	*  @param value
	**/
   public void setInputCommand(char[] value) throws CFException {
      acceptInputGroup.getInput().setInputCommand(value);
   } 

     /**
	 * 	Update InputCommand 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputCommand(char[] source, int sourceIndex) throws CFException {
      acceptInputGroup.getInput().setInputCommand(source, sourceIndex);
   	
   }
   
   public void setInputCommand(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInputGroup.getInput().setInputCommand(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputCommand 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputCommand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().setInputCommand(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputCommand with another Field
	 *	@param value
	 */
   public void setInputCommand(Field source) {
      acceptInputGroup.getInput().setInputCommand(source);
   }  
   
     /**
	 * 	Update InputCommand 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputCommand(Field source, int sourceIndex,int sourceLen) {
      acceptInputGroup.getInput().setInputCommand(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputCommand 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputCommand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInputGroup.getInput().setInputCommand(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of q
	 *	@return q
	 */
	public short getQ() throws CFException {        
   		return work.getQ();
	}
	
	/**
	 * 	Update Q with the passed value
	 *	@param number
	 */
	public void setQ(short number)  throws CFException{
		work.setQ(number);
	}

	public void setQ(int number)  throws CFException{
		work.setQ((short)number);
	}

	public void setQ(long number)  throws CFException{
		work.setQ((short)number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public long getI() throws CFException {
   		return work.getI();
	}


	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() throws CFException {
	     return String.valueOf(work.getIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric()  throws CFException{
	    return work.iIsNumeric();
	}

	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(long number)  throws CFException{
		work.setI(number);
	}
	

	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value)  throws CFException {
		work.setI(value);
	}
	
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value)  throws CFException{
		work.setI(value);
	}	

	/**
	 *	Test condition "READNXT" for isCReadnxt()
	 *	@return  Returns true if isCReadnxt() is "READNXT"
	 */
   public boolean isCReadnxt() throws CFException {
      return acceptInputGroup.getInput().isCReadnxt();
   }

	/**
	*  set values "READNXT"
	*/
   	public void setCReadnxtTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCReadnxtTrue();
   	}
	/**
	 *	Returns the value of r
	 *	@return r
	 */
	public short getR() throws CFException {        
   		return work.getR();
	}
	
	/**
	 * 	Update R with the passed value
	 *	@param number
	 */
	public void setR(short number)  throws CFException{
		work.setR(number);
	}

	public void setR(int number)  throws CFException{
		work.setR((short)number);
	}

	public void setR(long number)  throws CFException{
		work.setR((short)number);
	}



	/**
	 *	Test condition "STARTP " for isCStartp()
	 *	@return  Returns true if isCStartp() is "STARTP "
	 */
   public boolean isCStartp() throws CFException {
      return acceptInputGroup.getInput().isCStartp();
   }

	/**
	*  set values "STARTP "
	*/
   	public void setCStartpTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCStartpTrue();
   	}
	/**
	 *	Test condition "STARTA " for isCStarta()
	 *	@return  Returns true if isCStarta() is "STARTA "
	 */
   public boolean isCStarta() throws CFException {
      return acceptInputGroup.getInput().isCStarta();
   }

	/**
	*  set values "STARTA "
	*/
   	public void setCStartaTrue()  throws CFException{  			
    	acceptInputGroup.getInput().setCStartaTrue();
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


        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += acceptInputGroup.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class OpenFilesInCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

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
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += monitorFileStatus.hashCode();
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesInCtx getOpenFilesInCtx() {
            return new OpenFilesInCtx();
    }
     public class OpenFilesOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public OpenFilesOutCtx clone() {
        OpenFilesOutCtx cloneObj = new OpenFilesOutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesOutCtx getOpenFilesOutCtx() {
            return new OpenFilesOutCtx();
    }
     public class CloseFilesOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
     public class KeyreadBasedReportInCtx implements Cloneable {
     Work work = Vsammon7Ctx.this.getWork();
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

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

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += work.hashCode();
        str += monitorFileStatus.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public KeyreadBasedReportInCtx clone() {
        KeyreadBasedReportInCtx cloneObj = new KeyreadBasedReportInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadBasedReportInCtx getKeyreadBasedReportInCtx() {
            return new KeyreadBasedReportInCtx();
    }
     public class KeyreadBasedReportOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
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

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public KeyreadBasedReportOutCtx clone() {
        KeyreadBasedReportOutCtx cloneObj = new KeyreadBasedReportOutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public KeyreadBasedReportOutCtx getKeyreadBasedReportOutCtx() {
            return new KeyreadBasedReportOutCtx();
    }
     public class ReadnxtInCtx implements Cloneable {
     Work work = Vsammon7Ctx.this.getWork();
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
        }

        public ReadnxtOutCtx getReadnxtOutCtx() {
            return new ReadnxtOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += monitorFileStatus.hashCode();
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public ReadnxtInCtx clone() {
        ReadnxtInCtx cloneObj = new ReadnxtInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReadnxtInCtx getReadnxtInCtx() {
            return new ReadnxtInCtx();
    }
     public class ReadnxtOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
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

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public ReadnxtOutCtx clone() {
        ReadnxtOutCtx cloneObj = new ReadnxtOutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReadnxtOutCtx getReadnxtOutCtx() {
            return new ReadnxtOutCtx();
    }
     public class Rn9999InCtx implements Cloneable {
     Work work = Vsammon7Ctx.this.getWork();
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

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
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of rnCnt
	 *	@return rnCnt
	 */
	public int getRnCnt() throws CFException {
   		return work.getRnCnt();
	}


	/**
	 *	Returns String value of rnCnt
	 *	@return rnCnt
	 */
	public char[]  getRnCntString() throws CFException {
	     return String.valueOf(work.getRnCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rnCntIsNumeric()  throws CFException{
	    return work.rnCntIsNumeric();
	}

	/**
	 * 	Update RnCnt with the passed value
	 *	@param number
	 */
	public void setRnCnt(int number)  throws CFException{
		work.setRnCnt(number);
	}
	

	public void setRnCnt(long number)  throws CFException{
	    work.setRnCnt(number);
	}
	
	
	/**
	 * 	Update RnCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setRnCnt(char[] value)  throws CFException {
		work.setRnCnt(value);
	}
	
	/**
	 * 	Update RnCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRnCntString(char[] value)  throws CFException{
		work.setRnCnt(value);
	}	

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(short number)  throws CFException{
		work.setJ(number);
	}

	public void setJ(int number)  throws CFException{
		work.setJ((short)number);
	}

	public void setJ(long number)  throws CFException{
		work.setJ((short)number);
	}



	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
        }

        public Rn9999OutCtx getRn9999OutCtx() {
            return new Rn9999OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += monitorFileStatus.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public Rn9999InCtx clone() {
        Rn9999InCtx cloneObj = new Rn9999InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public Rn9999InCtx getRn9999InCtx() {
            return new Rn9999InCtx();
    }
     public class Rn9999OutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
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
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of rnCnt
	 *	@return rnCnt
	 */
	public int getRnCnt() throws CFException {
   		return work.getRnCnt();
	}


	/**
	 *	Returns String value of rnCnt
	 *	@return rnCnt
	 */
	public char[]  getRnCntString() throws CFException {
	     return String.valueOf(work.getRnCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rnCntIsNumeric()  throws CFException{
	    return work.rnCntIsNumeric();
	}

	/**
	 * 	Update RnCnt with the passed value
	 *	@param number
	 */
	public void setRnCnt(int number)  throws CFException{
		work.setRnCnt(number);
	}
	

	public void setRnCnt(long number)  throws CFException{
	    work.setRnCnt(number);
	}
	
	
	/**
	 * 	Update RnCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setRnCnt(char[] value)  throws CFException {
		work.setRnCnt(value);
	}
	
	/**
	 * 	Update RnCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRnCntString(char[] value)  throws CFException{
		work.setRnCnt(value);
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
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(short number)  throws CFException{
		work.setJ(number);
	}

	public void setJ(int number)  throws CFException{
		work.setJ((short)number);
	}

	public void setJ(long number)  throws CFException{
		work.setJ((short)number);
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
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public Rn9999OutCtx clone() {
        Rn9999OutCtx cloneObj = new Rn9999OutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public Rn9999OutCtx getRn9999OutCtx() {
            return new Rn9999OutCtx();
    }
     public class ProgramInCtx implements Cloneable {
     Work work = Vsammon7Ctx.this.getWork();
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


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



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
        }

        public ProgramOutCtx getProgramOutCtx() {
            return new ProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += monitorFileStatus.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public ProgramInCtx clone() {
        ProgramInCtx cloneObj = new ProgramInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProgramInCtx getProgramInCtx() {
            return new ProgramInCtx();
    }
     public class ProgramOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


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
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public ProgramOutCtx clone() {
        ProgramOutCtx cloneObj = new ProgramOutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProgramOutCtx getProgramOutCtx() {
            return new ProgramOutCtx();
    }
     public class StartpInCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
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


        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
        }

        public StartpOutCtx getStartpOutCtx() {
            return new StartpOutCtx();
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public StartpInCtx clone() {
        StartpInCtx cloneObj = new StartpInCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public StartpInCtx getStartpInCtx() {
            return new StartpInCtx();
    }
     public class StartpOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
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
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public StartpOutCtx clone() {
        StartpOutCtx cloneObj = new StartpOutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public StartpOutCtx getStartpOutCtx() {
            return new StartpOutCtx();
    }
     public class StartaInCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


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


        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
        }

        public StartaOutCtx getStartaOutCtx() {
            return new StartaOutCtx();
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public StartaInCtx clone() {
        StartaInCtx cloneObj = new StartaInCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public StartaInCtx getStartaInCtx() {
            return new StartaInCtx();
    }
     public class StartaOutCtx implements Cloneable {
     MonitorFileStatus monitorFileStatus = Vsammon7Ctx.this.getMonitorFileStatus();
     Work work = Vsammon7Ctx.this.getWork();
     Reprec reprec = Vsammon7Ctx.this.getReprec();
     AcceptInputGroup acceptInputGroup = Vsammon7Ctx.this.getAcceptInputGroup();
     MonitorRecord monitorRecord = Vsammon7Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */   
	 public MonitorFileStatus getMonitorFileStatus() {
   	return monitorFileStatus;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


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
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }



        public Vsammon7Ctx getVsammon7Ctx() {
            return Vsammon7Ctx.this;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += acceptInputGroup.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public StartaOutCtx clone() {
        StartaOutCtx cloneObj = new StartaOutCtx();
        cloneObj.monitorFileStatus = new MonitorFileStatus();
        cloneObj.monitorFileStatus.set(monitorFileStatus.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.acceptInputGroup = new AcceptInputGroup();
        cloneObj.acceptInputGroup.set(acceptInputGroup.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public StartaOutCtx getStartaOutCtx() {
            return new StartaOutCtx();
    }
}
