package com.cloudframe.app.mcwin;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcwin.dto.WorkArea800;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.mcwin.dto.MciwinYearToWindow800;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.mcwin.dto.MciwinReturnedYear800;
import com.cloudframe.app.mcwin.dto.MciwinNewWindowYearGroup800;
import com.cloudframe.app.mcwin.dto.Work;


@Context
public class McwinCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    MciwinReturnedYear800 mciwinReturnedYear800;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    MciwinYearToWindow800 mciwinYearToWindow800;
    WorkArea800 workArea800;
    MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
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


    public MciwinReturnedYear800 getMciwinReturnedYear800() {
        if (mciwinReturnedYear800 == null) {
            mciwinReturnedYear800 = new MciwinReturnedYear800();
        }

        return mciwinReturnedYear800;
    }

    public void setMciwinReturnedYear800(MciwinReturnedYear800 mciwinReturnedYear800) {
        this.mciwinReturnedYear800 = mciwinReturnedYear800;
    }
    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public MciwinYearToWindow800 getMciwinYearToWindow800() {
        if (mciwinYearToWindow800 == null) {
            mciwinYearToWindow800 = new MciwinYearToWindow800();
        }

        return mciwinYearToWindow800;
    }

    public void setMciwinYearToWindow800(MciwinYearToWindow800 mciwinYearToWindow800) {
        this.mciwinYearToWindow800 = mciwinYearToWindow800;
    }
    public WorkArea800 getWorkArea800() {
        if (workArea800 == null) {
            workArea800 = new WorkArea800();
        }

        return workArea800;
    }

    public void setWorkArea800(WorkArea800 workArea800) {
        this.workArea800 = workArea800;
    }
    public MciwinNewWindowYearGroup800 getMciwinNewWindowYearGroup800() {
        if (mciwinNewWindowYearGroup800 == null) {
            mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800();
        }

        return mciwinNewWindowYearGroup800;
    }

    public void setMciwinNewWindowYearGroup800(MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800) {
        this.mciwinNewWindowYearGroup800 = mciwinNewWindowYearGroup800;
    }
    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
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
        str += mciwinReturnedYear800.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += mciwinYearToWindow800.hashCode();
        str += workArea800.hashCode();
        str += mciwinNewWindowYearGroup800.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinCtx clone() {
        McwinCtx cloneObj = new McwinCtx();
        cloneObj.mciwinReturnedYear800 = new MciwinReturnedYear800();
        cloneObj.mciwinReturnedYear800.set(mciwinReturnedYear800.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.workArea800 = new WorkArea800();
        cloneObj.workArea800.set(workArea800.getClonedField());
        cloneObj.mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800();
        cloneObj.mciwinNewWindowYearGroup800.set(mciwinNewWindowYearGroup800.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     MciwinReturnedYear800 mciwinReturnedYear800 = McwinCtx.this.getMciwinReturnedYear800();
     MciwinYearToWindow800 mciwinYearToWindow800 = McwinCtx.this.getMciwinYearToWindow800();
     MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800 = McwinCtx.this.getMciwinNewWindowYearGroup800();


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mciwinReturnedYear800.hashCode();
        str += mciwinYearToWindow800.hashCode();
        str += mciwinNewWindowYearGroup800.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.mciwinReturnedYear800 = new MciwinReturnedYear800();
        cloneObj.mciwinReturnedYear800.set(mciwinReturnedYear800.getClonedField());
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800();
        cloneObj.mciwinNewWindowYearGroup800.set(mciwinNewWindowYearGroup800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessInitializationInCtx implements Cloneable {
     Work work = McwinCtx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = McwinCtx.this.getIp60001EventLogWorkArea();

	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return work.isItIsFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True()  throws CFException{  			
    	work.setItIsFirstTime88100True();
   	}
	/**
	 *	Returns the value of pgmMcwin300
	 *	@return pgmMcwin300
	 */
   public char[] getPgmMcwin300() throws CFException  {              
   		return work.getPgmMcwin300();
   }

  
	/**
	*  set variable pgmMcwin300
	*  @param value
	**/
   public void setPgmMcwin300(char[] value) throws CFException {
      work.setPgmMcwin300(value);
   } 

	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException  {              
   		return work.getPgmIp996010300();
   }

  
	/**
	*  set variable pgmIp996010300
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) throws CFException {
      work.setPgmIp996010300(value);
   } 


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }

        public ProcessInitializationOutCtx getProcessInitializationOutCtx() {
            return new ProcessInitializationOutCtx();
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
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public ProcessInitializationInCtx clone() {
        ProcessInitializationInCtx cloneObj = new ProcessInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInitializationInCtx getProcessInitializationInCtx() {
            return new ProcessInitializationInCtx();
    }
     public class ProcessInitializationOutCtx implements Cloneable {
     Work work = McwinCtx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = McwinCtx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmMcwin300
	 *	@return pgmMcwin300
	 */
   public char[] getPgmMcwin300() throws CFException  {              
   		return work.getPgmMcwin300();
   }

  
	/**
	*  set variable pgmMcwin300
	*  @param value
	**/
   public void setPgmMcwin300(char[] value) throws CFException {
      work.setPgmMcwin300(value);
   } 

	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException  {              
   		return work.getPtrIp996010800();
   }

  
	/**
	*  set variable ptrIp996010800
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) throws CFException {
      work.setPtrIp996010800(value);
   } 

	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return work.isItIsNotFirstTime88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True()  throws CFException{  			
    	work.setItIsNotFirstTime88100True();
   	}

        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
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
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public ProcessInitializationOutCtx clone() {
        ProcessInitializationOutCtx cloneObj = new ProcessInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInitializationOutCtx getProcessInitializationOutCtx() {
            return new ProcessInitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = McwinCtx.this.getIp996011ProgramStartMessage();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of pgmMcwin300
	 *	@return pgmMcwin300
	 */
   public char[] getPgmMcwin300() throws CFException  {              
   		return work.getPgmMcwin300();
   }

  
	/**
	*  set variable pgmMcwin300
	*  @param value
	**/
   public void setPgmMcwin300(char[] value) throws CFException {
      work.setPgmMcwin300(value);
   } 

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }

        public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = McwinCtx.this.getIp996011ProgramStartMessage();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of ip996011PgmId
	 *	@return ip996011PgmId
	 */
   public char[] getIp996011PgmId() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmId();
   }

  
	/**
	*  set variable ip996011PgmId
	*  @param value
	**/
   public void setIp996011PgmId(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(value);
   } 

     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmId with another Field
	 *	@param value
	 */
   public void setIp996011PgmId(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmId(source);
   }  
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmMcwin300
	 *	@return pgmMcwin300
	 */
   public char[] getPgmMcwin300() throws CFException  {              
   		return work.getPgmMcwin300();
   }

  
	/**
	*  set variable pgmMcwin300
	*  @param value
	**/
   public void setPgmMcwin300(char[] value) throws CFException {
      work.setPgmMcwin300(value);
   } 

	/**
	 *	Returns the value of ip996011PgmVersion
	 *	@return ip996011PgmVersion
	 */
   public char[] getIp996011PgmVersion() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmVersion();
   }

  
	/**
	*  set variable ip996011PgmVersion
	*  @param value
	**/
   public void setIp996011PgmVersion(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(value);
   } 

     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmVersion(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmVersion with another Field
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source);
   }  
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 

	/**
	 *	Returns the value of ip996011WhenCompiled
	 *	@return ip996011WhenCompiled
	 */
   public char[] getIp996011WhenCompiled() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011WhenCompiled();
   }

  
	/**
	*  set variable ip996011WhenCompiled
	*  @param value
	**/
   public void setIp996011WhenCompiled(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(value);
   } 

     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex);
   	
   }
   
   public void setIp996011WhenCompiled(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011WhenCompiled with another Field
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source);
   }  
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class McwinMainOutCtx implements Cloneable {


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
       return str.hashCode();
    }

    public McwinMainOutCtx clone() {
        McwinMainOutCtx cloneObj = new McwinMainOutCtx();
        return cloneObj;
    }

    }

    public McwinMainOutCtx getMcwinMainOutCtx() {
            return new McwinMainOutCtx();
    }
     public class McwinErrorMsgOneInCtx implements Cloneable {
     MciwinYearToWindow800 mciwinYearToWindow800 = McwinCtx.this.getMciwinYearToWindow800();
     MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800 = McwinCtx.this.getMciwinNewWindowYearGroup800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of num16300
	 *	@return num16300
	 */
	public int getNum16300() throws CFException {
   		return work.getNum16300();
	}


	/**
	 *	Returns String value of num16300
	 *	@return num16300
	 */
	public char[]  getNum16300String() throws CFException {
	     return String.valueOf(work.getNum16300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num16300IsNumeric()  throws CFException{
	    return work.num16300IsNumeric();
	}

	/**
	 * 	Update Num16300 with the passed value
	 *	@param number
	 */
	public void setNum16300(int number)  throws CFException{
		work.setNum16300(number);
	}
	

	public void setNum16300(long number)  throws CFException{
	    work.setNum16300(number);
	}
	
	
	/**
	 * 	Update Num16300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum16300(char[] value)  throws CFException {
		work.setNum16300(value);
	}
	
	/**
	 * 	Update Num16300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum16300String(char[] value)  throws CFException{
		work.setNum16300(value);
	}	

	/**
	 *	Returns the value of mciwinYearToWindow800
	 *	@return mciwinYearToWindow800
	 */   
	 public MciwinYearToWindow800 getMciwinYearToWindow800() {
   	return mciwinYearToWindow800;
   }


	/**
	 *	Returns the value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public int getMciwinNewWindowYear800() throws CFException {
   		return mciwinNewWindowYearGroup800.getMciwinNewWindowYear800();
	}


	/**
	 *	Returns String value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public char[]  getMciwinNewWindowYear800String() throws CFException {
	     return String.valueOf(mciwinNewWindowYearGroup800.getMciwinNewWindowYear800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinNewWindowYear800IsNumeric()  throws CFException{
	    return mciwinNewWindowYearGroup800.mciwinNewWindowYear800IsNumeric();
	}

	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *	@param number
	 */
	public void setMciwinNewWindowYear800(int number)  throws CFException{
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(number);
	}
	

	public void setMciwinNewWindowYear800(long number)  throws CFException{
	    mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(number);
	}
	
	
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800(char[] value)  throws CFException {
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(value);
	}
	
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800String(char[] value)  throws CFException{
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(value);
	}	

	/**
	 *	Returns the value of errMsg016600
	 *	@return errMsg016600
	 */
   public char[] getErrMsg016600() throws CFException  {              
   		return work.getErrMsg016600();
   }

  
	/**
	*  set variable errMsg016600
	*  @param value
	**/
   public void setErrMsg016600(char[] value) throws CFException {
      work.setErrMsg016600(value);
   } 

	/**
	 *	Returns the value of num00300
	 *	@return num00300
	 */
	public int getNum00300() throws CFException {
   		return work.getNum00300();
	}


	/**
	 *	Returns String value of num00300
	 *	@return num00300
	 */
	public char[]  getNum00300String() throws CFException {
	     return String.valueOf(work.getNum00300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num00300IsNumeric()  throws CFException{
	    return work.num00300IsNumeric();
	}

	/**
	 * 	Update Num00300 with the passed value
	 *	@param number
	 */
	public void setNum00300(int number)  throws CFException{
		work.setNum00300(number);
	}
	

	public void setNum00300(long number)  throws CFException{
	    work.setNum00300(number);
	}
	
	
	/**
	 * 	Update Num00300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum00300(char[] value)  throws CFException {
		work.setNum00300(value);
	}
	
	/**
	 * 	Update Num00300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum00300String(char[] value)  throws CFException{
		work.setNum00300(value);
	}	


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }

        public McwinErrorMsgOneOutCtx getMcwinErrorMsgOneOutCtx() {
            return new McwinErrorMsgOneOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mciwinYearToWindow800.hashCode();
        str += mciwinNewWindowYearGroup800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinErrorMsgOneInCtx clone() {
        McwinErrorMsgOneInCtx cloneObj = new McwinErrorMsgOneInCtx();
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800();
        cloneObj.mciwinNewWindowYearGroup800.set(mciwinNewWindowYearGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinErrorMsgOneInCtx getMcwinErrorMsgOneInCtx() {
            return new McwinErrorMsgOneInCtx();
    }
     public class McwinErrorMsgOneOutCtx implements Cloneable {
     MciwinYearToWindow800 mciwinYearToWindow800 = McwinCtx.this.getMciwinYearToWindow800();
     MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800 = McwinCtx.this.getMciwinNewWindowYearGroup800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of num16300
	 *	@return num16300
	 */
	public int getNum16300() throws CFException {
   		return work.getNum16300();
	}


	/**
	 *	Returns String value of num16300
	 *	@return num16300
	 */
	public char[]  getNum16300String() throws CFException {
	     return String.valueOf(work.getNum16300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num16300IsNumeric()  throws CFException{
	    return work.num16300IsNumeric();
	}

	/**
	 * 	Update Num16300 with the passed value
	 *	@param number
	 */
	public void setNum16300(int number)  throws CFException{
		work.setNum16300(number);
	}
	

	public void setNum16300(long number)  throws CFException{
	    work.setNum16300(number);
	}
	
	
	/**
	 * 	Update Num16300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum16300(char[] value)  throws CFException {
		work.setNum16300(value);
	}
	
	/**
	 * 	Update Num16300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum16300String(char[] value)  throws CFException{
		work.setNum16300(value);
	}	

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return work.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      work.setAbendText900(value);
   } 

	/**
	 *	Returns the value of errMsg016600
	 *	@return errMsg016600
	 */
   public char[] getErrMsg016600() throws CFException  {              
   		return work.getErrMsg016600();
   }

  
	/**
	*  set variable errMsg016600
	*  @param value
	**/
   public void setErrMsg016600(char[] value) throws CFException {
      work.setErrMsg016600(value);
   } 


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mciwinYearToWindow800.hashCode();
        str += mciwinNewWindowYearGroup800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinErrorMsgOneOutCtx clone() {
        McwinErrorMsgOneOutCtx cloneObj = new McwinErrorMsgOneOutCtx();
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800();
        cloneObj.mciwinNewWindowYearGroup800.set(mciwinNewWindowYearGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinErrorMsgOneOutCtx getMcwinErrorMsgOneOutCtx() {
            return new McwinErrorMsgOneOutCtx();
    }
     public class McwinErrorMsgTwoInCtx implements Cloneable {
     WorkArea800 workArea800 = McwinCtx.this.getWorkArea800();
     MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800 = McwinCtx.this.getMciwinNewWindowYearGroup800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of num08300
	 *	@return num08300
	 */
	public int getNum08300() throws CFException {
   		return work.getNum08300();
	}


	/**
	 *	Returns String value of num08300
	 *	@return num08300
	 */
	public char[]  getNum08300String() throws CFException {
	     return String.valueOf(work.getNum08300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num08300IsNumeric()  throws CFException{
	    return work.num08300IsNumeric();
	}

	/**
	 * 	Update Num08300 with the passed value
	 *	@param number
	 */
	public void setNum08300(int number)  throws CFException{
		work.setNum08300(number);
	}
	

	public void setNum08300(long number)  throws CFException{
	    work.setNum08300(number);
	}
	
	
	/**
	 * 	Update Num08300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum08300(char[] value)  throws CFException {
		work.setNum08300(value);
	}
	
	/**
	 * 	Update Num08300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum08300String(char[] value)  throws CFException{
		work.setNum08300(value);
	}	

	/**
	 *	Returns the value of num99300
	 *	@return num99300
	 */
	public int getNum99300() throws CFException {
   		return work.getNum99300();
	}


	/**
	 *	Returns String value of num99300
	 *	@return num99300
	 */
	public char[]  getNum99300String() throws CFException {
	     return String.valueOf(work.getNum99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num99300IsNumeric()  throws CFException{
	    return work.num99300IsNumeric();
	}

	/**
	 * 	Update Num99300 with the passed value
	 *	@param number
	 */
	public void setNum99300(int number)  throws CFException{
		work.setNum99300(number);
	}
	

	public void setNum99300(long number)  throws CFException{
	    work.setNum99300(number);
	}
	
	
	/**
	 * 	Update Num99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum99300(char[] value)  throws CFException {
		work.setNum99300(value);
	}
	
	/**
	 * 	Update Num99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum99300String(char[] value)  throws CFException{
		work.setNum99300(value);
	}	

	/**
	 *	Returns the value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public int getMciwinNewWindowYear800() throws CFException {
   		return mciwinNewWindowYearGroup800.getMciwinNewWindowYear800();
	}


	/**
	 *	Returns String value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public char[]  getMciwinNewWindowYear800String() throws CFException {
	     return String.valueOf(mciwinNewWindowYearGroup800.getMciwinNewWindowYear800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinNewWindowYear800IsNumeric()  throws CFException{
	    return mciwinNewWindowYearGroup800.mciwinNewWindowYear800IsNumeric();
	}

	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *	@param number
	 */
	public void setMciwinNewWindowYear800(int number)  throws CFException{
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(number);
	}
	

	public void setMciwinNewWindowYear800(long number)  throws CFException{
	    mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(number);
	}
	
	
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800(char[] value)  throws CFException {
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(value);
	}
	
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800String(char[] value)  throws CFException{
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(value);
	}	

	/**
	 *	Returns the value of num00300
	 *	@return num00300
	 */
	public int getNum00300() throws CFException {
   		return work.getNum00300();
	}


	/**
	 *	Returns String value of num00300
	 *	@return num00300
	 */
	public char[]  getNum00300String() throws CFException {
	     return String.valueOf(work.getNum00300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num00300IsNumeric()  throws CFException{
	    return work.num00300IsNumeric();
	}

	/**
	 * 	Update Num00300 with the passed value
	 *	@param number
	 */
	public void setNum00300(int number)  throws CFException{
		work.setNum00300(number);
	}
	

	public void setNum00300(long number)  throws CFException{
	    work.setNum00300(number);
	}
	
	
	/**
	 * 	Update Num00300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum00300(char[] value)  throws CFException {
		work.setNum00300(value);
	}
	
	/**
	 * 	Update Num00300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum00300String(char[] value)  throws CFException{
		work.setNum00300(value);
	}	

	/**
	 *	Returns the value of errMsg008600
	 *	@return errMsg008600
	 */
   public char[] getErrMsg008600() throws CFException  {              
   		return work.getErrMsg008600();
   }

  
	/**
	*  set variable errMsg008600
	*  @param value
	**/
   public void setErrMsg008600(char[] value) throws CFException {
      work.setErrMsg008600(value);
   } 


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }

        public McwinErrorMsgTwoOutCtx getMcwinErrorMsgTwoOutCtx() {
            return new McwinErrorMsgTwoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workArea800.hashCode();
        str += mciwinNewWindowYearGroup800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinErrorMsgTwoInCtx clone() {
        McwinErrorMsgTwoInCtx cloneObj = new McwinErrorMsgTwoInCtx();
        cloneObj.workArea800 = new WorkArea800();
        cloneObj.workArea800.set(workArea800.getClonedField());
        cloneObj.mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800();
        cloneObj.mciwinNewWindowYearGroup800.set(mciwinNewWindowYearGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinErrorMsgTwoInCtx getMcwinErrorMsgTwoInCtx() {
            return new McwinErrorMsgTwoInCtx();
    }
     public class McwinErrorMsgTwoOutCtx implements Cloneable {
     WorkArea800 workArea800 = McwinCtx.this.getWorkArea800();
     MciwinNewWindowYearGroup800 mciwinNewWindowYearGroup800 = McwinCtx.this.getMciwinNewWindowYearGroup800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of num08300
	 *	@return num08300
	 */
	public int getNum08300() throws CFException {
   		return work.getNum08300();
	}


	/**
	 *	Returns String value of num08300
	 *	@return num08300
	 */
	public char[]  getNum08300String() throws CFException {
	     return String.valueOf(work.getNum08300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num08300IsNumeric()  throws CFException{
	    return work.num08300IsNumeric();
	}

	/**
	 * 	Update Num08300 with the passed value
	 *	@param number
	 */
	public void setNum08300(int number)  throws CFException{
		work.setNum08300(number);
	}
	

	public void setNum08300(long number)  throws CFException{
	    work.setNum08300(number);
	}
	
	
	/**
	 * 	Update Num08300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum08300(char[] value)  throws CFException {
		work.setNum08300(value);
	}
	
	/**
	 * 	Update Num08300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum08300String(char[] value)  throws CFException{
		work.setNum08300(value);
	}	

	/**
	 *	Returns the value of mciwinReturnedYear
	 *	@return mciwinReturnedYear
	 */
   public char[] getMciwinReturnedYear() throws CFException  {              
   		return work.getMciwinReturnedYear();
   }

  
	/**
	*  set variable mciwinReturnedYear
	*  @param value
	**/
   public void setMciwinReturnedYear(char[] value) throws CFException {
      work.setMciwinReturnedYear(value);
   } 

	/**
	 *	Returns the value of yearValue800
	 *	@return yearValue800
	 */
	public int getYearValue800() throws CFException {
   		return workArea800.getYearValue800();
	}


	/**
	 *	Returns String value of yearValue800
	 *	@return yearValue800
	 */
	public char[]  getYearValue800String() throws CFException {
	     return String.valueOf(workArea800.getYearValue800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean yearValue800IsNumeric()  throws CFException{
	    return workArea800.yearValue800IsNumeric();
	}

	/**
	 * 	Update YearValue800 with the passed value
	 *	@param number
	 */
	public void setYearValue800(int number)  throws CFException{
		workArea800.setYearValue800(number);
	}
	

	public void setYearValue800(long number)  throws CFException{
	    workArea800.setYearValue800(number);
	}
	
	
	/**
	 * 	Update YearValue800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setYearValue800(char[] value)  throws CFException {
		workArea800.setYearValue800(value);
	}
	
	/**
	 * 	Update YearValue800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setYearValue800String(char[] value)  throws CFException{
		workArea800.setYearValue800(value);
	}	

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return work.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      work.setAbendText900(value);
   } 

	/**
	 *	Returns the value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public int getMciwinNewWindowYear800() throws CFException {
   		return mciwinNewWindowYearGroup800.getMciwinNewWindowYear800();
	}


	/**
	 *	Returns String value of mciwinNewWindowYear800
	 *	@return mciwinNewWindowYear800
	 */
	public char[]  getMciwinNewWindowYear800String() throws CFException {
	     return String.valueOf(mciwinNewWindowYearGroup800.getMciwinNewWindowYear800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinNewWindowYear800IsNumeric()  throws CFException{
	    return mciwinNewWindowYearGroup800.mciwinNewWindowYear800IsNumeric();
	}

	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *	@param number
	 */
	public void setMciwinNewWindowYear800(int number)  throws CFException{
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(number);
	}
	

	public void setMciwinNewWindowYear800(long number)  throws CFException{
	    mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(number);
	}
	
	
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800(char[] value)  throws CFException {
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(value);
	}
	
	/**
	 * 	Update MciwinNewWindowYear800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinNewWindowYear800String(char[] value)  throws CFException{
		mciwinNewWindowYearGroup800.setMciwinNewWindowYear800(value);
	}	

	/**
	 *	Returns the value of errMsg008600
	 *	@return errMsg008600
	 */
   public char[] getErrMsg008600() throws CFException  {              
   		return work.getErrMsg008600();
   }

  
	/**
	*  set variable errMsg008600
	*  @param value
	**/
   public void setErrMsg008600(char[] value) throws CFException {
      work.setErrMsg008600(value);
   } 


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workArea800.hashCode();
        str += mciwinNewWindowYearGroup800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinErrorMsgTwoOutCtx clone() {
        McwinErrorMsgTwoOutCtx cloneObj = new McwinErrorMsgTwoOutCtx();
        cloneObj.workArea800 = new WorkArea800();
        cloneObj.workArea800.set(workArea800.getClonedField());
        cloneObj.mciwinNewWindowYearGroup800 = new MciwinNewWindowYearGroup800();
        cloneObj.mciwinNewWindowYearGroup800.set(mciwinNewWindowYearGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinErrorMsgTwoOutCtx getMcwinErrorMsgTwoOutCtx() {
            return new McwinErrorMsgTwoOutCtx();
    }
     public class McwinErrorMsgThreeInCtx implements Cloneable {
     MciwinYearToWindow800 mciwinYearToWindow800 = McwinCtx.this.getMciwinYearToWindow800();
     WorkArea800 workArea800 = McwinCtx.this.getWorkArea800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of mciwinYearToWindow800
	 *	@return mciwinYearToWindow800
	 */   
	 public MciwinYearToWindow800 getMciwinYearToWindow800() {
   	return mciwinYearToWindow800;
   }


	/**
	 *	Returns the value of workArea800
	 *	@return workArea800
	 */   
	 public WorkArea800 getWorkArea800() {
   	return workArea800;
   }


	/**
	 *	Returns the value of errMsg004600
	 *	@return errMsg004600
	 */
   public char[] getErrMsg004600() throws CFException  {              
   		return work.getErrMsg004600();
   }

  
	/**
	*  set variable errMsg004600
	*  @param value
	**/
   public void setErrMsg004600(char[] value) throws CFException {
      work.setErrMsg004600(value);
   } 

	/**
	 *	Returns the value of num99300
	 *	@return num99300
	 */
	public int getNum99300() throws CFException {
   		return work.getNum99300();
	}


	/**
	 *	Returns String value of num99300
	 *	@return num99300
	 */
	public char[]  getNum99300String() throws CFException {
	     return String.valueOf(work.getNum99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num99300IsNumeric()  throws CFException{
	    return work.num99300IsNumeric();
	}

	/**
	 * 	Update Num99300 with the passed value
	 *	@param number
	 */
	public void setNum99300(int number)  throws CFException{
		work.setNum99300(number);
	}
	

	public void setNum99300(long number)  throws CFException{
	    work.setNum99300(number);
	}
	
	
	/**
	 * 	Update Num99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum99300(char[] value)  throws CFException {
		work.setNum99300(value);
	}
	
	/**
	 * 	Update Num99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum99300String(char[] value)  throws CFException{
		work.setNum99300(value);
	}	

	/**
	 *	Returns the value of num00300
	 *	@return num00300
	 */
	public int getNum00300() throws CFException {
   		return work.getNum00300();
	}


	/**
	 *	Returns String value of num00300
	 *	@return num00300
	 */
	public char[]  getNum00300String() throws CFException {
	     return String.valueOf(work.getNum00300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num00300IsNumeric()  throws CFException{
	    return work.num00300IsNumeric();
	}

	/**
	 * 	Update Num00300 with the passed value
	 *	@param number
	 */
	public void setNum00300(int number)  throws CFException{
		work.setNum00300(number);
	}
	

	public void setNum00300(long number)  throws CFException{
	    work.setNum00300(number);
	}
	
	
	/**
	 * 	Update Num00300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum00300(char[] value)  throws CFException {
		work.setNum00300(value);
	}
	
	/**
	 * 	Update Num00300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum00300String(char[] value)  throws CFException{
		work.setNum00300(value);
	}	

	/**
	 *	Returns the value of num04300
	 *	@return num04300
	 */
	public int getNum04300() throws CFException {
   		return work.getNum04300();
	}


	/**
	 *	Returns String value of num04300
	 *	@return num04300
	 */
	public char[]  getNum04300String() throws CFException {
	     return String.valueOf(work.getNum04300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num04300IsNumeric()  throws CFException{
	    return work.num04300IsNumeric();
	}

	/**
	 * 	Update Num04300 with the passed value
	 *	@param number
	 */
	public void setNum04300(int number)  throws CFException{
		work.setNum04300(number);
	}
	

	public void setNum04300(long number)  throws CFException{
	    work.setNum04300(number);
	}
	
	
	/**
	 * 	Update Num04300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum04300(char[] value)  throws CFException {
		work.setNum04300(value);
	}
	
	/**
	 * 	Update Num04300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum04300String(char[] value)  throws CFException{
		work.setNum04300(value);
	}	


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }

        public McwinErrorMsgThreeOutCtx getMcwinErrorMsgThreeOutCtx() {
            return new McwinErrorMsgThreeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mciwinYearToWindow800.hashCode();
        str += workArea800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinErrorMsgThreeInCtx clone() {
        McwinErrorMsgThreeInCtx cloneObj = new McwinErrorMsgThreeInCtx();
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.workArea800 = new WorkArea800();
        cloneObj.workArea800.set(workArea800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinErrorMsgThreeInCtx getMcwinErrorMsgThreeInCtx() {
            return new McwinErrorMsgThreeInCtx();
    }
     public class McwinErrorMsgThreeOutCtx implements Cloneable {
     MciwinYearToWindow800 mciwinYearToWindow800 = McwinCtx.this.getMciwinYearToWindow800();
     WorkArea800 workArea800 = McwinCtx.this.getWorkArea800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of mciwinYearToWindow800
	 *	@return mciwinYearToWindow800
	 */   
	 public MciwinYearToWindow800 getMciwinYearToWindow800() {
   	return mciwinYearToWindow800;
   }


	/**
	 *	Returns the value of workArea800
	 *	@return workArea800
	 */   
	 public WorkArea800 getWorkArea800() {
   	return workArea800;
   }


	/**
	 *	Returns the value of errMsg004600
	 *	@return errMsg004600
	 */
   public char[] getErrMsg004600() throws CFException  {              
   		return work.getErrMsg004600();
   }

  
	/**
	*  set variable errMsg004600
	*  @param value
	**/
   public void setErrMsg004600(char[] value) throws CFException {
      work.setErrMsg004600(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return work.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      work.setAbendText900(value);
   } 

	/**
	 *	Returns the value of currYear1800
	 *	@return currYear1800
	 */
	public long getCurrYear1800() throws CFException {
   		return workArea800.getCurrYear1800();
	}


	/**
	 *	Returns String value of currYear1800
	 *	@return currYear1800
	 */
	public char[]  getCurrYear1800String() throws CFException {
	     return String.valueOf(workArea800.getCurrYear1800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currYear1800IsNumeric()  throws CFException{
	    return workArea800.currYear1800IsNumeric();
	}

	/**
	 * 	Update CurrYear1800 with the passed value
	 *	@param number
	 */
	public void setCurrYear1800(long number)  throws CFException{
		workArea800.setCurrYear1800(number);
	}
	

	
	/**
	 * 	Update CurrYear1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrYear1800(char[] value)  throws CFException {
		workArea800.setCurrYear1800(value);
	}
	
	/**
	 * 	Update CurrYear1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrYear1800String(char[] value)  throws CFException{
		workArea800.setCurrYear1800(value);
	}	

	/**
	 *	Returns the value of num04300
	 *	@return num04300
	 */
	public int getNum04300() throws CFException {
   		return work.getNum04300();
	}


	/**
	 *	Returns String value of num04300
	 *	@return num04300
	 */
	public char[]  getNum04300String() throws CFException {
	     return String.valueOf(work.getNum04300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num04300IsNumeric()  throws CFException{
	    return work.num04300IsNumeric();
	}

	/**
	 * 	Update Num04300 with the passed value
	 *	@param number
	 */
	public void setNum04300(int number)  throws CFException{
		work.setNum04300(number);
	}
	

	public void setNum04300(long number)  throws CFException{
	    work.setNum04300(number);
	}
	
	
	/**
	 * 	Update Num04300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum04300(char[] value)  throws CFException {
		work.setNum04300(value);
	}
	
	/**
	 * 	Update Num04300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum04300String(char[] value)  throws CFException{
		work.setNum04300(value);
	}	


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mciwinYearToWindow800.hashCode();
        str += workArea800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinErrorMsgThreeOutCtx clone() {
        McwinErrorMsgThreeOutCtx cloneObj = new McwinErrorMsgThreeOutCtx();
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.workArea800 = new WorkArea800();
        cloneObj.workArea800.set(workArea800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinErrorMsgThreeOutCtx getMcwinErrorMsgThreeOutCtx() {
            return new McwinErrorMsgThreeOutCtx();
    }
     public class McwinProcessCenturyInCtx implements Cloneable {
     MciwinReturnedYear800 mciwinReturnedYear800 = McwinCtx.this.getMciwinReturnedYear800();
     MciwinYearToWindow800 mciwinYearToWindow800 = McwinCtx.this.getMciwinYearToWindow800();
     WorkArea800 workArea800 = McwinCtx.this.getWorkArea800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of mciwinYearToWindow800
	 *	@return mciwinYearToWindow800
	 */   
	 public MciwinYearToWindow800 getMciwinYearToWindow800() {
   	return mciwinYearToWindow800;
   }


	/**
	 *	Returns the value of yearValue800
	 *	@return yearValue800
	 */
	public int getYearValue800() throws CFException {
   		return workArea800.getYearValue800();
	}


	/**
	 *	Returns String value of yearValue800
	 *	@return yearValue800
	 */
	public char[]  getYearValue800String() throws CFException {
	     return String.valueOf(workArea800.getYearValue800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean yearValue800IsNumeric()  throws CFException{
	    return workArea800.yearValue800IsNumeric();
	}

	/**
	 * 	Update YearValue800 with the passed value
	 *	@param number
	 */
	public void setYearValue800(int number)  throws CFException{
		workArea800.setYearValue800(number);
	}
	

	public void setYearValue800(long number)  throws CFException{
	    workArea800.setYearValue800(number);
	}
	
	
	/**
	 * 	Update YearValue800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setYearValue800(char[] value)  throws CFException {
		workArea800.setYearValue800(value);
	}
	
	/**
	 * 	Update YearValue800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setYearValue800String(char[] value)  throws CFException{
		workArea800.setYearValue800(value);
	}	

	/**
	 *	Returns the value of num20300
	 *	@return num20300
	 */
	public int getNum20300() throws CFException {
   		return work.getNum20300();
	}


	/**
	 *	Returns String value of num20300
	 *	@return num20300
	 */
	public char[]  getNum20300String() throws CFException {
	     return String.valueOf(work.getNum20300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num20300IsNumeric()  throws CFException{
	    return work.num20300IsNumeric();
	}

	/**
	 * 	Update Num20300 with the passed value
	 *	@param number
	 */
	public void setNum20300(int number)  throws CFException{
		work.setNum20300(number);
	}
	

	public void setNum20300(long number)  throws CFException{
	    work.setNum20300(number);
	}
	
	
	/**
	 * 	Update Num20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum20300(char[] value)  throws CFException {
		work.setNum20300(value);
	}
	
	/**
	 * 	Update Num20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum20300String(char[] value)  throws CFException{
		work.setNum20300(value);
	}	

	/**
	 *	Returns the value of num19300
	 *	@return num19300
	 */
	public int getNum19300() throws CFException {
   		return work.getNum19300();
	}


	/**
	 *	Returns String value of num19300
	 *	@return num19300
	 */
	public char[]  getNum19300String() throws CFException {
	     return String.valueOf(work.getNum19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num19300IsNumeric()  throws CFException{
	    return work.num19300IsNumeric();
	}

	/**
	 * 	Update Num19300 with the passed value
	 *	@param number
	 */
	public void setNum19300(int number)  throws CFException{
		work.setNum19300(number);
	}
	

	public void setNum19300(long number)  throws CFException{
	    work.setNum19300(number);
	}
	
	
	/**
	 * 	Update Num19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum19300(char[] value)  throws CFException {
		work.setNum19300(value);
	}
	
	/**
	 * 	Update Num19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum19300String(char[] value)  throws CFException{
		work.setNum19300(value);
	}	


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }

        public McwinProcessCenturyOutCtx getMcwinProcessCenturyOutCtx() {
            return new McwinProcessCenturyOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mciwinReturnedYear800.hashCode();
        str += mciwinYearToWindow800.hashCode();
        str += workArea800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinProcessCenturyInCtx clone() {
        McwinProcessCenturyInCtx cloneObj = new McwinProcessCenturyInCtx();
        cloneObj.mciwinReturnedYear800 = new MciwinReturnedYear800();
        cloneObj.mciwinReturnedYear800.set(mciwinReturnedYear800.getClonedField());
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.workArea800 = new WorkArea800();
        cloneObj.workArea800.set(workArea800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinProcessCenturyInCtx getMcwinProcessCenturyInCtx() {
            return new McwinProcessCenturyInCtx();
    }
     public class McwinProcessCenturyOutCtx implements Cloneable {
     MciwinReturnedYear800 mciwinReturnedYear800 = McwinCtx.this.getMciwinReturnedYear800();
     MciwinYearToWindow800 mciwinYearToWindow800 = McwinCtx.this.getMciwinYearToWindow800();
     WorkArea800 workArea800 = McwinCtx.this.getWorkArea800();
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of mciwinRetYearL2800
	 *	@return mciwinRetYearL2800
	 */
	public int getMciwinRetYearL2800() throws CFException {
   		return mciwinReturnedYear800.getMciwinRetYearL2800();
	}


	/**
	 *	Returns String value of mciwinRetYearL2800
	 *	@return mciwinRetYearL2800
	 */
	public char[]  getMciwinRetYearL2800String() throws CFException {
	     return String.valueOf(mciwinReturnedYear800.getMciwinRetYearL2800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinRetYearL2800IsNumeric()  throws CFException{
	    return mciwinReturnedYear800.mciwinRetYearL2800IsNumeric();
	}

	/**
	 * 	Update MciwinRetYearL2800 with the passed value
	 *	@param number
	 */
	public void setMciwinRetYearL2800(int number)  throws CFException{
		mciwinReturnedYear800.setMciwinRetYearL2800(number);
	}
	

	public void setMciwinRetYearL2800(long number)  throws CFException{
	    mciwinReturnedYear800.setMciwinRetYearL2800(number);
	}
	
	
	/**
	 * 	Update MciwinRetYearL2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinRetYearL2800(char[] value)  throws CFException {
		mciwinReturnedYear800.setMciwinRetYearL2800(value);
	}
	
	/**
	 * 	Update MciwinRetYearL2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinRetYearL2800String(char[] value)  throws CFException{
		mciwinReturnedYear800.setMciwinRetYearL2800(value);
	}	

	/**
	 *	Returns the value of mciwinYearToWindow800
	 *	@return mciwinYearToWindow800
	 */   
	 public MciwinYearToWindow800 getMciwinYearToWindow800() {
   	return mciwinYearToWindow800;
   }


	/**
	 *	Returns the value of num20300
	 *	@return num20300
	 */
	public int getNum20300() throws CFException {
   		return work.getNum20300();
	}


	/**
	 *	Returns String value of num20300
	 *	@return num20300
	 */
	public char[]  getNum20300String() throws CFException {
	     return String.valueOf(work.getNum20300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num20300IsNumeric()  throws CFException{
	    return work.num20300IsNumeric();
	}

	/**
	 * 	Update Num20300 with the passed value
	 *	@param number
	 */
	public void setNum20300(int number)  throws CFException{
		work.setNum20300(number);
	}
	

	public void setNum20300(long number)  throws CFException{
	    work.setNum20300(number);
	}
	
	
	/**
	 * 	Update Num20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum20300(char[] value)  throws CFException {
		work.setNum20300(value);
	}
	
	/**
	 * 	Update Num20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum20300String(char[] value)  throws CFException{
		work.setNum20300(value);
	}	

	/**
	 *	Returns the value of num19300
	 *	@return num19300
	 */
	public int getNum19300() throws CFException {
   		return work.getNum19300();
	}


	/**
	 *	Returns String value of num19300
	 *	@return num19300
	 */
	public char[]  getNum19300String() throws CFException {
	     return String.valueOf(work.getNum19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num19300IsNumeric()  throws CFException{
	    return work.num19300IsNumeric();
	}

	/**
	 * 	Update Num19300 with the passed value
	 *	@param number
	 */
	public void setNum19300(int number)  throws CFException{
		work.setNum19300(number);
	}
	

	public void setNum19300(long number)  throws CFException{
	    work.setNum19300(number);
	}
	
	
	/**
	 * 	Update Num19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum19300(char[] value)  throws CFException {
		work.setNum19300(value);
	}
	
	/**
	 * 	Update Num19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum19300String(char[] value)  throws CFException{
		work.setNum19300(value);
	}	

	/**
	 *	Returns the value of mciwinRetCentury800
	 *	@return mciwinRetCentury800
	 */
	public int getMciwinRetCentury800() throws CFException {
   		return mciwinReturnedYear800.getMciwinRetCentury800();
	}


	/**
	 *	Returns String value of mciwinRetCentury800
	 *	@return mciwinRetCentury800
	 */
	public char[]  getMciwinRetCentury800String() throws CFException {
	     return String.valueOf(mciwinReturnedYear800.getMciwinRetCentury800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mciwinRetCentury800IsNumeric()  throws CFException{
	    return mciwinReturnedYear800.mciwinRetCentury800IsNumeric();
	}

	/**
	 * 	Update MciwinRetCentury800 with the passed value
	 *	@param number
	 */
	public void setMciwinRetCentury800(int number)  throws CFException{
		mciwinReturnedYear800.setMciwinRetCentury800(number);
	}
	

	public void setMciwinRetCentury800(long number)  throws CFException{
	    mciwinReturnedYear800.setMciwinRetCentury800(number);
	}
	
	
	/**
	 * 	Update MciwinRetCentury800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinRetCentury800(char[] value)  throws CFException {
		mciwinReturnedYear800.setMciwinRetCentury800(value);
	}
	
	/**
	 * 	Update MciwinRetCentury800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinRetCentury800String(char[] value)  throws CFException{
		mciwinReturnedYear800.setMciwinRetCentury800(value);
	}	


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mciwinReturnedYear800.hashCode();
        str += mciwinYearToWindow800.hashCode();
        str += workArea800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public McwinProcessCenturyOutCtx clone() {
        McwinProcessCenturyOutCtx cloneObj = new McwinProcessCenturyOutCtx();
        cloneObj.mciwinReturnedYear800 = new MciwinReturnedYear800();
        cloneObj.mciwinReturnedYear800.set(mciwinReturnedYear800.getClonedField());
        cloneObj.mciwinYearToWindow800 = new MciwinYearToWindow800();
        cloneObj.mciwinYearToWindow800.set(mciwinYearToWindow800.getClonedField());
        cloneObj.workArea800 = new WorkArea800();
        cloneObj.workArea800.set(workArea800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public McwinProcessCenturyOutCtx getMcwinProcessCenturyOutCtx() {
            return new McwinProcessCenturyOutCtx();
    }
     public class TerminateProgramInCtx implements Cloneable {
     Work work = McwinCtx.this.getWork();

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return work.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      work.setAbendText900(value);
   } 


        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
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

    public TerminateProgramInCtx clone() {
        TerminateProgramInCtx cloneObj = new TerminateProgramInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProgramInCtx getTerminateProgramInCtx() {
            return new TerminateProgramInCtx();
    }
     public class UpdateEventLogInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = McwinCtx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "T" for isIp60001LogEvent88()
	 *	@return  Returns true if isIp60001LogEvent88() is "T"
	 */
   public boolean isIp60001LogEvent88() throws CFException {
      return ip60001EventLogWorkArea.isIp60001LogEvent88();
   }

	/**
	*  set values "T"
	*/
   	public void setIp60001LogEvent88True()  throws CFException{  			
    	ip60001EventLogWorkArea.setIp60001LogEvent88True();
   	}
	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}




        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }

        public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public UpdateEventLogInCtx clone() {
        UpdateEventLogInCtx cloneObj = new UpdateEventLogInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogInCtx getUpdateEventLogInCtx() {
            return new UpdateEventLogInCtx();
    }
     public class UpdateEventLogOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = McwinCtx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip60001PgmName
	 *	@return ip60001PgmName
	 */
   public char[] getIp60001PgmName(int index) throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventEntry(index).getIp60001PgmName();
   }

  
	/**
	*  set variable ip60001PgmName
	*  @param value
	**/
   public void setIp60001PgmName(int index,char[] value) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(value);
   } 

     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001PgmName(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001PgmName with another Field
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source);
   }  
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}




        public McwinCtx getMcwinCtx() {
            return McwinCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public UpdateEventLogOutCtx clone() {
        UpdateEventLogOutCtx cloneObj = new UpdateEventLogOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
    }
}
