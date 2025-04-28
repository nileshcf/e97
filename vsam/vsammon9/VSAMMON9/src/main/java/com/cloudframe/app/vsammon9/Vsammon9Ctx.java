package com.cloudframe.app.vsammon9;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.vsammon9.file.records.MonPriKey;
import com.cloudframe.app.vsammon9.file.records.MonitorRecord;
import com.cloudframe.app.vsammon9.dto.Work;
import com.cloudframe.app.vsammon9.file.records.Reprec;


@Context
public class Vsammon9Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Reprec reprec;
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

    boolean doNotSkipVsamOperations = true;

    public boolean getDoNotSkipVsamOperations() {
        return this.doNotSkipVsamOperations;
    }

    public void setDoNotSkipVsamOperations(boolean doNotSkipVsamOperations) {
            this.doNotSkipVsamOperations = doNotSkipVsamOperations;
        }
    boolean doNotSkipVsamStartApi = true;

    public boolean getDoNotSkipVsamStartApi() {
        return this.doNotSkipVsamStartApi;
    }

    public void setDoNotSkipVsamStartApi(boolean doNotSkipVsamStartApi) {
            this.doNotSkipVsamStartApi = doNotSkipVsamStartApi;
        }
    boolean doNotSkipVsamReadApi = true;

    public boolean getDoNotSkipVsamReadApi() {
        return this.doNotSkipVsamReadApi;
    }

    public void setDoNotSkipVsamReadApi(boolean doNotSkipVsamReadApi) {
            this.doNotSkipVsamReadApi = doNotSkipVsamReadApi;
        }
    boolean doNotSkipVsamWriteApi = true;

    public boolean getDoNotSkipVsamWriteApi() {
        return this.doNotSkipVsamWriteApi;
    }

    public void setDoNotSkipVsamWriteApi(boolean doNotSkipVsamWriteApi) {
            this.doNotSkipVsamWriteApi = doNotSkipVsamWriteApi;
        }
    boolean doNotSkipVsamWriteApiSplit0 = true;

    public boolean getDoNotSkipVsamWriteApiSplit0() {
        return this.doNotSkipVsamWriteApiSplit0;
    }

    public void setDoNotSkipVsamWriteApiSplit0(boolean doNotSkipVsamWriteApiSplit0) {
            this.doNotSkipVsamWriteApiSplit0 = doNotSkipVsamWriteApiSplit0;
        }
    boolean doNotSkipVsamWriteApiSplit1 = true;

    public boolean getDoNotSkipVsamWriteApiSplit1() {
        return this.doNotSkipVsamWriteApiSplit1;
    }

    public void setDoNotSkipVsamWriteApiSplit1(boolean doNotSkipVsamWriteApiSplit1) {
            this.doNotSkipVsamWriteApiSplit1 = doNotSkipVsamWriteApiSplit1;
        }
    boolean doNotSkipVsamRewriteApi = true;

    public boolean getDoNotSkipVsamRewriteApi() {
        return this.doNotSkipVsamRewriteApi;
    }

    public void setDoNotSkipVsamRewriteApi(boolean doNotSkipVsamRewriteApi) {
            this.doNotSkipVsamRewriteApi = doNotSkipVsamRewriteApi;
        }
    boolean doNotSkipVsamRewriteApiSplit2 = true;

    public boolean getDoNotSkipVsamRewriteApiSplit2() {
        return this.doNotSkipVsamRewriteApiSplit2;
    }

    public void setDoNotSkipVsamRewriteApiSplit2(boolean doNotSkipVsamRewriteApiSplit2) {
            this.doNotSkipVsamRewriteApiSplit2 = doNotSkipVsamRewriteApiSplit2;
        }
    boolean doNotSkipVsamRewriteApiSplit3 = true;

    public boolean getDoNotSkipVsamRewriteApiSplit3() {
        return this.doNotSkipVsamRewriteApiSplit3;
    }

    public void setDoNotSkipVsamRewriteApiSplit3(boolean doNotSkipVsamRewriteApiSplit3) {
            this.doNotSkipVsamRewriteApiSplit3 = doNotSkipVsamRewriteApiSplit3;
        }
    boolean doNotSkipVsamDeleteApi = true;

    public boolean getDoNotSkipVsamDeleteApi() {
        return this.doNotSkipVsamDeleteApi;
    }

    public void setDoNotSkipVsamDeleteApi(boolean doNotSkipVsamDeleteApi) {
            this.doNotSkipVsamDeleteApi = doNotSkipVsamDeleteApi;
        }
    boolean doNotSkipCloseFiles = true;

    public boolean getDoNotSkipCloseFiles() {
        return this.doNotSkipCloseFiles;
    }

    public void setDoNotSkipCloseFiles(boolean doNotSkipCloseFiles) {
            this.doNotSkipCloseFiles = doNotSkipCloseFiles;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public Vsammon9Ctx clone() {
        Vsammon9Ctx cloneObj = new Vsammon9Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class OpenFilesInCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += work.hashCode();
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
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
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public OpenFilesOutCtx clone() {
        OpenFilesOutCtx cloneObj = new OpenFilesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
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
     public class VsamStartApiInCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
        }

        public VsamStartApiOutCtx getVsamStartApiOutCtx() {
            return new VsamStartApiOutCtx();
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamStartApiInCtx clone() {
        VsamStartApiInCtx cloneObj = new VsamStartApiInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamStartApiInCtx getVsamStartApiInCtx() {
            return new VsamStartApiInCtx();
    }
     public class VsamStartApiOutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monXcdtTskStrtDt
	 *	@return monXcdtTskStrtDt
	 */
   public char[] getMonXcdtTskStrtDt() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtDt();
   }

  
	/**
	*  set variable monXcdtTskStrtDt
	*  @param value
	**/
   public void setMonXcdtTskStrtDt(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtDt with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
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

public int getMonXctorTskNo() throws CFException {  
        return monitorRecord.getMonPriKey().getMonXctorTskNo();
}
	/**
	 * 	Update MonXctorTskNo with the passed value
	 *	@param number
	 */
	public void setMonXctorTskNo(int number)  throws CFException{
		monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}


	public void setMonXctorTskNo(long number)  throws CFException{
	    monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}
	

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
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
	 *	Returns the value of monXcdtTskStrtTm
	 *	@return monXcdtTskStrtTm
	 */
   public char[] getMonXcdtTskStrtTm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtTm();
   }

  
	/**
	*  set variable monXcdtTskStrtTm
	*  @param value
	**/
   public void setMonXcdtTskStrtTm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtTm with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamStartApiOutCtx clone() {
        VsamStartApiOutCtx cloneObj = new VsamStartApiOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamStartApiOutCtx getVsamStartApiOutCtx() {
            return new VsamStartApiOutCtx();
    }
     public class VsamReadApiInCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
        }

        public VsamReadApiOutCtx getVsamReadApiOutCtx() {
            return new VsamReadApiOutCtx();
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamReadApiInCtx clone() {
        VsamReadApiInCtx cloneObj = new VsamReadApiInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamReadApiInCtx getVsamReadApiInCtx() {
            return new VsamReadApiInCtx();
    }
     public class VsamReadApiOutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monXcdtTskStrtDt
	 *	@return monXcdtTskStrtDt
	 */
   public char[] getMonXcdtTskStrtDt() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtDt();
   }

  
	/**
	*  set variable monXcdtTskStrtDt
	*  @param value
	**/
   public void setMonXcdtTskStrtDt(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtDt with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
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

public int getMonXctorTskNo() throws CFException {  
        return monitorRecord.getMonPriKey().getMonXctorTskNo();
}
	/**
	 * 	Update MonXctorTskNo with the passed value
	 *	@param number
	 */
	public void setMonXctorTskNo(int number)  throws CFException{
		monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}


	public void setMonXctorTskNo(long number)  throws CFException{
	    monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}
	

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
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
	 *	Returns the value of monXcdtTskStrtTm
	 *	@return monXcdtTskStrtTm
	 */
   public char[] getMonXcdtTskStrtTm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtTm();
   }

  
	/**
	*  set variable monXcdtTskStrtTm
	*  @param value
	**/
   public void setMonXcdtTskStrtTm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtTm with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamReadApiOutCtx clone() {
        VsamReadApiOutCtx cloneObj = new VsamReadApiOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamReadApiOutCtx getVsamReadApiOutCtx() {
            return new VsamReadApiOutCtx();
    }
     public class VsamWriteApiSplit0InCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
        }

        public VsamWriteApiSplit0OutCtx getVsamWriteApiSplit0OutCtx() {
            return new VsamWriteApiSplit0OutCtx();
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamWriteApiSplit0InCtx clone() {
        VsamWriteApiSplit0InCtx cloneObj = new VsamWriteApiSplit0InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamWriteApiSplit0InCtx getVsamWriteApiSplit0InCtx() {
            return new VsamWriteApiSplit0InCtx();
    }
     public class VsamWriteApiSplit0OutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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

public int getMonXctorTskNo() throws CFException {  
        return monitorRecord.getMonPriKey().getMonXctorTskNo();
}
	/**
	 * 	Update MonXctorTskNo with the passed value
	 *	@param number
	 */
	public void setMonXctorTskNo(int number)  throws CFException{
		monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}


	public void setMonXctorTskNo(long number)  throws CFException{
	    monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}
	

	/**
	 *	Returns the value of monXcaorSysId
	 *	@return monXcaorSysId
	 */
   public char[] getMonXcaorSysId() throws CFException  {              
   		return monitorRecord.getMonXcaorSysId();
   }

  
	/**
	*  set variable monXcaorSysId
	*  @param value
	**/
   public void setMonXcaorSysId(char[] value) throws CFException {
      monitorRecord.setMonXcaorSysId(value);
   } 

     /**
	 * 	Update MonXcaorSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcaorSysId(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcaorSysId(source, sourceIndex);
   	
   }
   
   public void setMonXcaorSysId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcaorSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcaorSysId with another Field
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source) {
      monitorRecord.setMonXcaorSysId(source);
   }  
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtReqSz
	 *	@return monXcdtReqSz
	 */
	public int getMonXcdtReqSz() throws CFException {        
   		return monitorRecord.getMonXcdtReqSz();
	}
	
	/**
	 * 	Update MonXcdtReqSz with the passed value
	 *	@param number
	 */
	public void setMonXcdtReqSz(int number)  throws CFException{
		monitorRecord.setMonXcdtReqSz(number);
	}


	public void setMonXcdtReqSz(long number)  throws CFException{
		monitorRecord.setMonXcdtReqSz((int)number);
	}


	/**
	 *	Returns the value of monXcdtTskAorTm
	 *	@return monXcdtTskAorTm
	 */
	public int getMonXcdtTskAorTm() throws CFException {        
   		return monitorRecord.getMonXcdtTskAorTm();
	}
	
	/**
	 * 	Update MonXcdtTskAorTm with the passed value
	 *	@param number
	 */
	public void setMonXcdtTskAorTm(int number)  throws CFException{
		monitorRecord.setMonXcdtTskAorTm(number);
	}


	public void setMonXcdtTskAorTm(long number)  throws CFException{
		monitorRecord.setMonXcdtTskAorTm((int)number);
	}


	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


public int getMonXcaorTskNo() throws CFException {  
        return monitorRecord.getMonXcaorTskNo();
}
	/**
	 * 	Update MonXcaorTskNo with the passed value
	 *	@param number
	 */
	public void setMonXcaorTskNo(int number)  throws CFException{
		monitorRecord.setMonXcaorTskNo(number);
	}


	public void setMonXcaorTskNo(long number)  throws CFException{
	    monitorRecord.setMonXcaorTskNo(number);
	}
	

	/**
	 *	Returns the value of monXcdtTskCmpCd
	 *	@return monXcdtTskCmpCd
	 */
	public short getMonXcdtTskCmpCd() throws CFException {        
   		return monitorRecord.getMonXcdtTskCmpCd();
	}
	
	/**
	 * 	Update MonXcdtTskCmpCd with the passed value
	 *	@param number
	 */
	public void setMonXcdtTskCmpCd(short number)  throws CFException{
		monitorRecord.setMonXcdtTskCmpCd(number);
	}

	public void setMonXcdtTskCmpCd(int number)  throws CFException{
		monitorRecord.setMonXcdtTskCmpCd((short)number);
	}

	public void setMonXcdtTskCmpCd(long number)  throws CFException{
		monitorRecord.setMonXcdtTskCmpCd((short)number);
	}



	/**
	 *	Returns the value of monXcdtTskStrtDt
	 *	@return monXcdtTskStrtDt
	 */
   public char[] getMonXcdtTskStrtDt() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtDt();
   }

  
	/**
	*  set variable monXcdtTskStrtDt
	*  @param value
	**/
   public void setMonXcdtTskStrtDt(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtDt with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtTskElpsTm
	 *	@return monXcdtTskElpsTm
	 */
	public int getMonXcdtTskElpsTm() throws CFException {        
   		return monitorRecord.getMonXcdtTskElpsTm();
	}
	
	/**
	 * 	Update MonXcdtTskElpsTm with the passed value
	 *	@param number
	 */
	public void setMonXcdtTskElpsTm(int number)  throws CFException{
		monitorRecord.setMonXcdtTskElpsTm(number);
	}


	public void setMonXcdtTskElpsTm(long number)  throws CFException{
		monitorRecord.setMonXcdtTskElpsTm((int)number);
	}


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monXcdtRespSz
	 *	@return monXcdtRespSz
	 */
	public int getMonXcdtRespSz() throws CFException {        
   		return monitorRecord.getMonXcdtRespSz();
	}
	
	/**
	 * 	Update MonXcdtRespSz with the passed value
	 *	@param number
	 */
	public void setMonXcdtRespSz(int number)  throws CFException{
		monitorRecord.setMonXcdtRespSz(number);
	}


	public void setMonXcdtRespSz(long number)  throws CFException{
		monitorRecord.setMonXcdtRespSz((int)number);
	}


	/**
	 *	Returns the value of monUsertoken
	 *	@return monUsertoken
	 */
   public char[] getMonUsertoken() throws CFException  {              
   		return monitorRecord.getMonUsertoken();
   }

  
	/**
	*  set variable monUsertoken
	*  @param value
	**/
   public void setMonUsertoken(char[] value) throws CFException {
      monitorRecord.setMonUsertoken(value);
   } 

     /**
	 * 	Update MonUsertoken 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonUsertoken(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonUsertoken(source, sourceIndex);
   	
   }
   
   public void setMonUsertoken(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonUsertoken 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonUsertoken(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonUsertoken with another Field
	 *	@param value
	 */
   public void setMonUsertoken(Field source) {
      monitorRecord.setMonUsertoken(source);
   }  
   
     /**
	 * 	Update MonUsertoken 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonUsertoken(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonUsertoken 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonUsertoken(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtPgmTyCd
	 *	@return monXcdtPgmTyCd
	 */
   public char[] getMonXcdtPgmTyCd() throws CFException  {              
   		return monitorRecord.getMonXcdtPgmTyCd();
   }

  
	/**
	*  set variable monXcdtPgmTyCd
	*  @param value
	**/
   public void setMonXcdtPgmTyCd(char[] value) throws CFException {
      monitorRecord.setMonXcdtPgmTyCd(value);
   } 

     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex);
   	
   }
   
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtPgmTyCd with another Field
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source) {
      monitorRecord.setMonXcdtPgmTyCd(source);
   }  
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXctorTranId
	 *	@return monXctorTranId
	 */
   public char[] getMonXctorTranId() throws CFException  {              
   		return monitorRecord.getMonXctorTranId();
   }

  
	/**
	*  set variable monXctorTranId
	*  @param value
	**/
   public void setMonXctorTranId(char[] value) throws CFException {
      monitorRecord.setMonXctorTranId(value);
   } 

     /**
	 * 	Update MonXctorTranId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXctorTranId(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXctorTranId(source, sourceIndex);
   	
   }
   
   public void setMonXctorTranId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXctorTranId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorTranId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXctorTranId with another Field
	 *	@param value
	 */
   public void setMonXctorTranId(Field source) {
      monitorRecord.setMonXctorTranId(source);
   }  
   
     /**
	 * 	Update MonXctorTranId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXctorTranId(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXctorTranId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorTranId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

	/**
	 *	Returns the value of monXctorSysId
	 *	@return monXctorSysId
	 */
   public char[] getMonXctorSysId() throws CFException  {              
   		return monitorRecord.getMonXctorSysId();
   }

  
	/**
	*  set variable monXctorSysId
	*  @param value
	**/
   public void setMonXctorSysId(char[] value) throws CFException {
      monitorRecord.setMonXctorSysId(value);
   } 

     /**
	 * 	Update MonXctorSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXctorSysId(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXctorSysId(source, sourceIndex);
   	
   }
   
   public void setMonXctorSysId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXctorSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXctorSysId with another Field
	 *	@param value
	 */
   public void setMonXctorSysId(Field source) {
      monitorRecord.setMonXctorSysId(source);
   }  
   
     /**
	 * 	Update MonXctorSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXctorSysId(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXctorSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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
	 *	Returns the value of monXcdtTskStrtTm
	 *	@return monXcdtTskStrtTm
	 */
   public char[] getMonXcdtTskStrtTm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtTm();
   }

  
	/**
	*  set variable monXcdtTskStrtTm
	*  @param value
	**/
   public void setMonXcdtTskStrtTm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtTm with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtTskAbndCd
	 *	@return monXcdtTskAbndCd
	 */
   public char[] getMonXcdtTskAbndCd() throws CFException  {              
   		return monitorRecord.getMonXcdtTskAbndCd();
   }

  
	/**
	*  set variable monXcdtTskAbndCd
	*  @param value
	**/
   public void setMonXcdtTskAbndCd(char[] value) throws CFException {
      monitorRecord.setMonXcdtTskAbndCd(value);
   } 

     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskAbndCd with another Field
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source) {
      monitorRecord.setMonXcdtTskAbndCd(source);
   }  
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamWriteApiSplit0OutCtx clone() {
        VsamWriteApiSplit0OutCtx cloneObj = new VsamWriteApiSplit0OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamWriteApiSplit0OutCtx getVsamWriteApiSplit0OutCtx() {
            return new VsamWriteApiSplit0OutCtx();
    }
     public class VsamWriteApiSplit1InCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
        }

        public VsamWriteApiSplit1OutCtx getVsamWriteApiSplit1OutCtx() {
            return new VsamWriteApiSplit1OutCtx();
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamWriteApiSplit1InCtx clone() {
        VsamWriteApiSplit1InCtx cloneObj = new VsamWriteApiSplit1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamWriteApiSplit1InCtx getVsamWriteApiSplit1InCtx() {
            return new VsamWriteApiSplit1InCtx();
    }
     public class VsamWriteApiSplit1OutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamWriteApiSplit1OutCtx clone() {
        VsamWriteApiSplit1OutCtx cloneObj = new VsamWriteApiSplit1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamWriteApiSplit1OutCtx getVsamWriteApiSplit1OutCtx() {
            return new VsamWriteApiSplit1OutCtx();
    }
     public class VsamRewriteApiSplit2InCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
        }

        public VsamRewriteApiSplit2OutCtx getVsamRewriteApiSplit2OutCtx() {
            return new VsamRewriteApiSplit2OutCtx();
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamRewriteApiSplit2InCtx clone() {
        VsamRewriteApiSplit2InCtx cloneObj = new VsamRewriteApiSplit2InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamRewriteApiSplit2InCtx getVsamRewriteApiSplit2InCtx() {
            return new VsamRewriteApiSplit2InCtx();
    }
     public class VsamRewriteApiSplit2OutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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

public int getMonXctorTskNo() throws CFException {  
        return monitorRecord.getMonPriKey().getMonXctorTskNo();
}
	/**
	 * 	Update MonXctorTskNo with the passed value
	 *	@param number
	 */
	public void setMonXctorTskNo(int number)  throws CFException{
		monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}


	public void setMonXctorTskNo(long number)  throws CFException{
	    monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}
	

	/**
	 *	Returns the value of monXcaorSysId
	 *	@return monXcaorSysId
	 */
   public char[] getMonXcaorSysId() throws CFException  {              
   		return monitorRecord.getMonXcaorSysId();
   }

  
	/**
	*  set variable monXcaorSysId
	*  @param value
	**/
   public void setMonXcaorSysId(char[] value) throws CFException {
      monitorRecord.setMonXcaorSysId(value);
   } 

     /**
	 * 	Update MonXcaorSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcaorSysId(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcaorSysId(source, sourceIndex);
   	
   }
   
   public void setMonXcaorSysId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcaorSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcaorSysId with another Field
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source) {
      monitorRecord.setMonXcaorSysId(source);
   }  
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcaorSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcaorSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcaorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtReqSz
	 *	@return monXcdtReqSz
	 */
	public int getMonXcdtReqSz() throws CFException {        
   		return monitorRecord.getMonXcdtReqSz();
	}
	
	/**
	 * 	Update MonXcdtReqSz with the passed value
	 *	@param number
	 */
	public void setMonXcdtReqSz(int number)  throws CFException{
		monitorRecord.setMonXcdtReqSz(number);
	}


	public void setMonXcdtReqSz(long number)  throws CFException{
		monitorRecord.setMonXcdtReqSz((int)number);
	}


	/**
	 *	Returns the value of monXcdtTskAorTm
	 *	@return monXcdtTskAorTm
	 */
	public int getMonXcdtTskAorTm() throws CFException {        
   		return monitorRecord.getMonXcdtTskAorTm();
	}
	
	/**
	 * 	Update MonXcdtTskAorTm with the passed value
	 *	@param number
	 */
	public void setMonXcdtTskAorTm(int number)  throws CFException{
		monitorRecord.setMonXcdtTskAorTm(number);
	}


	public void setMonXcdtTskAorTm(long number)  throws CFException{
		monitorRecord.setMonXcdtTskAorTm((int)number);
	}


	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
   }


public int getMonXcaorTskNo() throws CFException {  
        return monitorRecord.getMonXcaorTskNo();
}
	/**
	 * 	Update MonXcaorTskNo with the passed value
	 *	@param number
	 */
	public void setMonXcaorTskNo(int number)  throws CFException{
		monitorRecord.setMonXcaorTskNo(number);
	}


	public void setMonXcaorTskNo(long number)  throws CFException{
	    monitorRecord.setMonXcaorTskNo(number);
	}
	

	/**
	 *	Returns the value of monXcdtTskCmpCd
	 *	@return monXcdtTskCmpCd
	 */
	public short getMonXcdtTskCmpCd() throws CFException {        
   		return monitorRecord.getMonXcdtTskCmpCd();
	}
	
	/**
	 * 	Update MonXcdtTskCmpCd with the passed value
	 *	@param number
	 */
	public void setMonXcdtTskCmpCd(short number)  throws CFException{
		monitorRecord.setMonXcdtTskCmpCd(number);
	}

	public void setMonXcdtTskCmpCd(int number)  throws CFException{
		monitorRecord.setMonXcdtTskCmpCd((short)number);
	}

	public void setMonXcdtTskCmpCd(long number)  throws CFException{
		monitorRecord.setMonXcdtTskCmpCd((short)number);
	}



	/**
	 *	Returns the value of monXcdtTskStrtDt
	 *	@return monXcdtTskStrtDt
	 */
   public char[] getMonXcdtTskStrtDt() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtDt();
   }

  
	/**
	*  set variable monXcdtTskStrtDt
	*  @param value
	**/
   public void setMonXcdtTskStrtDt(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtDt with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtTskElpsTm
	 *	@return monXcdtTskElpsTm
	 */
	public int getMonXcdtTskElpsTm() throws CFException {        
   		return monitorRecord.getMonXcdtTskElpsTm();
	}
	
	/**
	 * 	Update MonXcdtTskElpsTm with the passed value
	 *	@param number
	 */
	public void setMonXcdtTskElpsTm(int number)  throws CFException{
		monitorRecord.setMonXcdtTskElpsTm(number);
	}


	public void setMonXcdtTskElpsTm(long number)  throws CFException{
		monitorRecord.setMonXcdtTskElpsTm((int)number);
	}


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of monXcdtRespSz
	 *	@return monXcdtRespSz
	 */
	public int getMonXcdtRespSz() throws CFException {        
   		return monitorRecord.getMonXcdtRespSz();
	}
	
	/**
	 * 	Update MonXcdtRespSz with the passed value
	 *	@param number
	 */
	public void setMonXcdtRespSz(int number)  throws CFException{
		monitorRecord.setMonXcdtRespSz(number);
	}


	public void setMonXcdtRespSz(long number)  throws CFException{
		monitorRecord.setMonXcdtRespSz((int)number);
	}


	/**
	 *	Returns the value of monUsertoken
	 *	@return monUsertoken
	 */
   public char[] getMonUsertoken() throws CFException  {              
   		return monitorRecord.getMonUsertoken();
   }

  
	/**
	*  set variable monUsertoken
	*  @param value
	**/
   public void setMonUsertoken(char[] value) throws CFException {
      monitorRecord.setMonUsertoken(value);
   } 

     /**
	 * 	Update MonUsertoken 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonUsertoken(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonUsertoken(source, sourceIndex);
   	
   }
   
   public void setMonUsertoken(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonUsertoken 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonUsertoken(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonUsertoken with another Field
	 *	@param value
	 */
   public void setMonUsertoken(Field source) {
      monitorRecord.setMonUsertoken(source);
   }  
   
     /**
	 * 	Update MonUsertoken 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonUsertoken(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonUsertoken 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonUsertoken(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonUsertoken(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtPgmTyCd
	 *	@return monXcdtPgmTyCd
	 */
   public char[] getMonXcdtPgmTyCd() throws CFException  {              
   		return monitorRecord.getMonXcdtPgmTyCd();
   }

  
	/**
	*  set variable monXcdtPgmTyCd
	*  @param value
	**/
   public void setMonXcdtPgmTyCd(char[] value) throws CFException {
      monitorRecord.setMonXcdtPgmTyCd(value);
   } 

     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex);
   	
   }
   
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtPgmTyCd with another Field
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source) {
      monitorRecord.setMonXcdtPgmTyCd(source);
   }  
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtPgmTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtPgmTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtPgmTyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXctorTranId
	 *	@return monXctorTranId
	 */
   public char[] getMonXctorTranId() throws CFException  {              
   		return monitorRecord.getMonXctorTranId();
   }

  
	/**
	*  set variable monXctorTranId
	*  @param value
	**/
   public void setMonXctorTranId(char[] value) throws CFException {
      monitorRecord.setMonXctorTranId(value);
   } 

     /**
	 * 	Update MonXctorTranId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXctorTranId(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXctorTranId(source, sourceIndex);
   	
   }
   
   public void setMonXctorTranId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXctorTranId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorTranId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXctorTranId with another Field
	 *	@param value
	 */
   public void setMonXctorTranId(Field source) {
      monitorRecord.setMonXctorTranId(source);
   }  
   
     /**
	 * 	Update MonXctorTranId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXctorTranId(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXctorTranId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorTranId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorTranId(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

	/**
	 *	Returns the value of monXctorSysId
	 *	@return monXctorSysId
	 */
   public char[] getMonXctorSysId() throws CFException  {              
   		return monitorRecord.getMonXctorSysId();
   }

  
	/**
	*  set variable monXctorSysId
	*  @param value
	**/
   public void setMonXctorSysId(char[] value) throws CFException {
      monitorRecord.setMonXctorSysId(value);
   } 

     /**
	 * 	Update MonXctorSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXctorSysId(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXctorSysId(source, sourceIndex);
   	
   }
   
   public void setMonXctorSysId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXctorSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXctorSysId with another Field
	 *	@param value
	 */
   public void setMonXctorSysId(Field source) {
      monitorRecord.setMonXctorSysId(source);
   }  
   
     /**
	 * 	Update MonXctorSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXctorSysId(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXctorSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXctorSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXctorSysId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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
	 *	Returns the value of monXcdtTskStrtTm
	 *	@return monXcdtTskStrtTm
	 */
   public char[] getMonXcdtTskStrtTm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtTm();
   }

  
	/**
	*  set variable monXcdtTskStrtTm
	*  @param value
	**/
   public void setMonXcdtTskStrtTm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtTm with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monXcdtTskAbndCd
	 *	@return monXcdtTskAbndCd
	 */
   public char[] getMonXcdtTskAbndCd() throws CFException  {              
   		return monitorRecord.getMonXcdtTskAbndCd();
   }

  
	/**
	*  set variable monXcdtTskAbndCd
	*  @param value
	**/
   public void setMonXcdtTskAbndCd(char[] value) throws CFException {
      monitorRecord.setMonXcdtTskAbndCd(value);
   } 

     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex) throws CFException {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskAbndCd with another Field
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source) {
      monitorRecord.setMonXcdtTskAbndCd(source);
   }  
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskAbndCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskAbndCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.setMonXcdtTskAbndCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamRewriteApiSplit2OutCtx clone() {
        VsamRewriteApiSplit2OutCtx cloneObj = new VsamRewriteApiSplit2OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamRewriteApiSplit2OutCtx getVsamRewriteApiSplit2OutCtx() {
            return new VsamRewriteApiSplit2OutCtx();
    }
     public class VsamRewriteApiSplit3InCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
        }

        public VsamRewriteApiSplit3OutCtx getVsamRewriteApiSplit3OutCtx() {
            return new VsamRewriteApiSplit3OutCtx();
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamRewriteApiSplit3InCtx clone() {
        VsamRewriteApiSplit3InCtx cloneObj = new VsamRewriteApiSplit3InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamRewriteApiSplit3InCtx getVsamRewriteApiSplit3InCtx() {
            return new VsamRewriteApiSplit3InCtx();
    }
     public class VsamRewriteApiSplit3OutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamRewriteApiSplit3OutCtx clone() {
        VsamRewriteApiSplit3OutCtx cloneObj = new VsamRewriteApiSplit3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamRewriteApiSplit3OutCtx getVsamRewriteApiSplit3OutCtx() {
            return new VsamRewriteApiSplit3OutCtx();
    }
     public class VsamDeleteApiInCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

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


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
        }

        public VsamDeleteApiOutCtx getVsamDeleteApiOutCtx() {
            return new VsamDeleteApiOutCtx();
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamDeleteApiInCtx clone() {
        VsamDeleteApiInCtx cloneObj = new VsamDeleteApiInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamDeleteApiInCtx getVsamDeleteApiInCtx() {
            return new VsamDeleteApiInCtx();
    }
     public class VsamDeleteApiOutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();
     Reprec reprec = Vsammon9Ctx.this.getReprec();
     MonitorRecord monitorRecord = Vsammon9Ctx.this.getMonitorRecord();

	/**
	 *	Returns the value of monXcdtTskStrtDt
	 *	@return monXcdtTskStrtDt
	 */
   public char[] getMonXcdtTskStrtDt() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtDt();
   }

  
	/**
	*  set variable monXcdtTskStrtDt
	*  @param value
	**/
   public void setMonXcdtTskStrtDt(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtDt with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
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

public int getMonXctorTskNo() throws CFException {  
        return monitorRecord.getMonPriKey().getMonXctorTskNo();
}
	/**
	 * 	Update MonXctorTskNo with the passed value
	 *	@param number
	 */
	public void setMonXctorTskNo(int number)  throws CFException{
		monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}


	public void setMonXctorTskNo(long number)  throws CFException{
	    monitorRecord.getMonPriKey().setMonXctorTskNo(number);
	}
	

	/**
	 *	Returns the value of monitorRecord
	 *	@return monitorRecord
	 */   
	 public MonitorRecord getMonitorRecord() {
   	return monitorRecord;
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
	 *	Returns the value of monXcdtTskStrtTm
	 *	@return monXcdtTskStrtTm
	 */
   public char[] getMonXcdtTskStrtTm() throws CFException  {              
   		return monitorRecord.getMonPriKey().getMonXcdtTskStrtTm();
   }

  
	/**
	*  set variable monXcdtTskStrtTm
	*  @param value
	**/
   public void setMonXcdtTskStrtTm(char[] value) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(value);
   } 

     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex) throws CFException {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex);
   	
   }
   
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MonXcdtTskStrtTm with another Field
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source);
   }  
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MonXcdtTskStrtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMonXcdtTskStrtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      monitorRecord.getMonPriKey().setMonXcdtTskStrtTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
        str += reprec.hashCode();
        str += monitorRecord.hashCode();
       return str.hashCode();
    }

    public VsamDeleteApiOutCtx clone() {
        VsamDeleteApiOutCtx cloneObj = new VsamDeleteApiOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.monitorRecord = new MonitorRecord();
        cloneObj.monitorRecord.set(monitorRecord.getClonedField());
        return cloneObj;
    }

    }

    public VsamDeleteApiOutCtx getVsamDeleteApiOutCtx() {
            return new VsamDeleteApiOutCtx();
    }
     public class CloseFilesOutCtx implements Cloneable {
     Work work = Vsammon9Ctx.this.getWork();

	/**
	 *	Returns the value of monitorFileStatus
	 *	@return monitorFileStatus
	 */
   public char[] getMonitorFileStatus() throws CFException  {              
   		return work.getMonitorFileStatus();
   }

  
	/**
	*  set variable monitorFileStatus
	*  @param value
	**/
   public void setMonitorFileStatus(char[] value) throws CFException {
      work.setMonitorFileStatus(value);
   } 


        public Vsammon9Ctx getVsammon9Ctx() {
            return Vsammon9Ctx.this;
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
       return str.hashCode();
    }

    public CloseFilesOutCtx clone() {
        CloseFilesOutCtx cloneObj = new CloseFilesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseFilesOutCtx getCloseFilesOutCtx() {
            return new CloseFilesOutCtx();
    }
}
