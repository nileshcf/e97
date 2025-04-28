package com.cloudframe.app.ip670010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip67002UtcOffsetHhmm;
import com.cloudframe.app.ip670010.dto.CtcCcyy2Group802;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip670010.dto.CtcDate802;
import com.cloudframe.app.ip670010.dto.FormatedJulDate800;
import com.cloudframe.app.ip670010.dto.CtcMmdd802;
import com.cloudframe.app.global.sharedvar.Ip67002Ccyyddd;
import com.cloudframe.app.ip670010.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip67002DateParm;
import com.cloudframe.app.ip670010.dto.DaysOfMonthsGroup300;


@Context
public class Ip670010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    CtcCcyy2Group802 ctcCcyy2Group802;
    DaysOfMonthsGroup300 daysOfMonthsGroup300;
    Work work;
    CtcDate802 ctcDate802;
    FormatedJulDate800 formatedJulDate800;
    Ip67002DateParm ip67002DateParm;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;


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


    public CtcCcyy2Group802 getCtcCcyy2Group802() {
        if (ctcCcyy2Group802 == null) {
            ctcCcyy2Group802 = new CtcCcyy2Group802();
        }

        return ctcCcyy2Group802;
    }

    public void setCtcCcyy2Group802(CtcCcyy2Group802 ctcCcyy2Group802) {
        this.ctcCcyy2Group802 = ctcCcyy2Group802;
    }
    public DaysOfMonthsGroup300 getDaysOfMonthsGroup300() {
        if (daysOfMonthsGroup300 == null) {
            daysOfMonthsGroup300 = new DaysOfMonthsGroup300();
        }

        return daysOfMonthsGroup300;
    }

    public void setDaysOfMonthsGroup300(DaysOfMonthsGroup300 daysOfMonthsGroup300) {
        this.daysOfMonthsGroup300 = daysOfMonthsGroup300;
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
    public CtcDate802 getCtcDate802() {
        if (ctcDate802 == null) {
            ctcDate802 = new CtcDate802();
        }

        return ctcDate802;
    }

    public void setCtcDate802(CtcDate802 ctcDate802) {
        this.ctcDate802 = ctcDate802;
    }
    public FormatedJulDate800 getFormatedJulDate800() {
        if (formatedJulDate800 == null) {
            formatedJulDate800 = new FormatedJulDate800();
        }

        return formatedJulDate800;
    }

    public void setFormatedJulDate800(FormatedJulDate800 formatedJulDate800) {
        this.formatedJulDate800 = formatedJulDate800;
    }
    public Ip67002DateParm getIp67002DateParm() {
        if (ip67002DateParm == null) {
            ip67002DateParm = globalCtx.getGlobalDto(Ip67002DateParm.class);
        }

        return ip67002DateParm;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ctcCcyy2Group802.hashCode();
        str += daysOfMonthsGroup300.hashCode();
        str += work.hashCode();
        str += ctcDate802.hashCode();
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public Ip670010Ctx clone() {
        Ip670010Ctx cloneObj = new Ip670010Ctx();
        cloneObj.ctcCcyy2Group802 = new CtcCcyy2Group802();
        cloneObj.ctcCcyy2Group802.set(ctcCcyy2Group802.getClonedField());
        cloneObj.daysOfMonthsGroup300 = new DaysOfMonthsGroup300();
        cloneObj.daysOfMonthsGroup300.set(daysOfMonthsGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InitializationInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();

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

        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public InitializationOutCtx getInitializationOutCtx() {
            return new InitializationOutCtx();
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

    public InitializationInCtx clone() {
        InitializationInCtx cloneObj = new InitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationInCtx getInitializationInCtx() {
            return new InitializationInCtx();
    }
     public class InitializationOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();

	/**
	 *	Test condition " " for isLeapYearIsUnknown88100()
	 *	@return  Returns true if isLeapYearIsUnknown88100() is " "
	 */
   public boolean isLeapYearIsUnknown88100() throws CFException {
      return work.isLeapYearIsUnknown88100();
   }

	/**
	*  set values " "
	*/
   	public void setLeapYearIsUnknown88100True()  throws CFException{  			
    	work.setLeapYearIsUnknown88100True();
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

        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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

    public InitializationOutCtx clone() {
        InitializationOutCtx cloneObj = new InitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializationOutCtx getInitializationOutCtx() {
            return new InitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip670010Ctx.this.getIp996011ProgramStartMessage();

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
	 *	Returns the value of ip670010300
	 *	@return ip670010300
	 */
   public char[] getIp670010300() throws CFException  {              
   		return work.getIp670010300();
   }

  
	/**
	*  set variable ip670010300
	*  @param value
	**/
   public void setIp670010300(char[] value) throws CFException {
      work.setIp670010300(value);
   } 


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += work.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip670010Ctx.this.getIp996011ProgramStartMessage();

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
	 *	Returns the value of ip670010300
	 *	@return ip670010300
	 */
   public char[] getIp670010300() throws CFException  {              
   		return work.getIp670010300();
   }

  
	/**
	*  set variable ip670010300
	*  @param value
	**/
   public void setIp670010300(char[] value) throws CFException {
      work.setIp670010300(value);
   } 


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class ControlFunctionalityInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Test condition "G" for isIp67002ConvertToJulian88()
	 *	@return  Returns true if isIp67002ConvertToJulian88() is "G"
	 */
   public boolean isIp67002ConvertToJulian88() throws CFException {
      return ip67002DateParm.isIp67002ConvertToJulian88();
   }

	/**
	*  set values "G"
	*/
   	public void setIp67002ConvertToJulian88True()  throws CFException{  			
    	ip67002DateParm.setIp67002ConvertToJulian88True();
   	}
	/**
	 *	Test condition "J" for isIp67002ConvertFromJulian88()
	 *	@return  Returns true if isIp67002ConvertFromJulian88() is "J"
	 */
   public boolean isIp67002ConvertFromJulian88() throws CFException {
      return ip67002DateParm.isIp67002ConvertFromJulian88();
   }

	/**
	*  set values "J"
	*/
   	public void setIp67002ConvertFromJulian88True()  throws CFException{  			
    	ip67002DateParm.setIp67002ConvertFromJulian88True();
   	}
	/**
	 *	Test condition "W" for isIp67002GetCalendarDow88()
	 *	@return  Returns true if isIp67002GetCalendarDow88() is "W"
	 */
   public boolean isIp67002GetCalendarDow88() throws CFException {
      return ip67002DateParm.isIp67002GetCalendarDow88();
   }

	/**
	*  set values "W"
	*/
   	public void setIp67002GetCalendarDow88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetCalendarDow88True();
   	}
	/**
	 *	Test condition "A" for isIp67002GetAbsOfGregDt88()
	 *	@return  Returns true if isIp67002GetAbsOfGregDt88() is "A"
	 */
   public boolean isIp67002GetAbsOfGregDt88() throws CFException {
      return ip67002DateParm.isIp67002GetAbsOfGregDt88();
   }

	/**
	*  set values "A"
	*/
   	public void setIp67002GetAbsOfGregDt88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetAbsOfGregDt88True();
   	}
	/**
	 *	Test condition "B" for isIp67002GetDtBeforeSpan88()
	 *	@return  Returns true if isIp67002GetDtBeforeSpan88() is "B"
	 */
   public boolean isIp67002GetDtBeforeSpan88() throws CFException {
      return ip67002DateParm.isIp67002GetDtBeforeSpan88();
   }

	/**
	*  set values "B"
	*/
   	public void setIp67002GetDtBeforeSpan88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetDtBeforeSpan88True();
   	}
	/**
	 *	Test condition "V" for isIp67002ValidateDate88()
	 *	@return  Returns true if isIp67002ValidateDate88() is "V"
	 */
   public boolean isIp67002ValidateDate88() throws CFException {
      return ip67002DateParm.isIp67002ValidateDate88();
   }

	/**
	*  set values "V"
	*/
   	public void setIp67002ValidateDate88True()  throws CFException{  			
    	ip67002DateParm.setIp67002ValidateDate88True();
   	}
	/**
	 *	Test condition "E" for isIp67002GetJulOfAbsDt88()
	 *	@return  Returns true if isIp67002GetJulOfAbsDt88() is "E"
	 */
   public boolean isIp67002GetJulOfAbsDt88() throws CFException {
      return ip67002DateParm.isIp67002GetJulOfAbsDt88();
   }

	/**
	*  set values "E"
	*/
   	public void setIp67002GetJulOfAbsDt88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetJulOfAbsDt88True();
   	}
	/**
	 *	Test condition "C" for isIp67002JulianDatesSpan88()
	 *	@return  Returns true if isIp67002JulianDatesSpan88() is "C"
	 */
   public boolean isIp67002JulianDatesSpan88() throws CFException {
      return ip67002DateParm.isIp67002JulianDatesSpan88();
   }

	/**
	*  set values "C"
	*/
   	public void setIp67002JulianDatesSpan88True()  throws CFException{  			
    	ip67002DateParm.setIp67002JulianDatesSpan88True();
   	}
	/**
	 *	Test condition "O" for isIp67002AddonGregJulDow88()
	 *	@return  Returns true if isIp67002AddonGregJulDow88() is "O"
	 */
   public boolean isIp67002AddonGregJulDow88() throws CFException {
      return ip67002DateParm.isIp67002AddonGregJulDow88();
   }

	/**
	*  set values "O"
	*/
   	public void setIp67002AddonGregJulDow88True()  throws CFException{  			
    	ip67002DateParm.setIp67002AddonGregJulDow88True();
   	}
	/**
	 *	Returns the value of invalidCallMessage600
	 *	@return invalidCallMessage600
	 */
   public char[] getInvalidCallMessage600() throws CFException  {              
   		return work.getInvalidCallMessage600();
   }

  
	/**
	*  set variable invalidCallMessage600
	*  @param value
	**/
   public void setInvalidCallMessage600(char[] value) throws CFException {
      work.setInvalidCallMessage600(value);
   } 

	/**
	 *	Test condition "Z" for isIp67002GetAbsOfJulDt88()
	 *	@return  Returns true if isIp67002GetAbsOfJulDt88() is "Z"
	 */
   public boolean isIp67002GetAbsOfJulDt88() throws CFException {
      return ip67002DateParm.isIp67002GetAbsOfJulDt88();
   }

	/**
	*  set values "Z"
	*/
   	public void setIp67002GetAbsOfJulDt88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetAbsOfJulDt88True();
   	}
	/**
	 *	Test condition "U" for isIp67002GetUtcDtTm88()
	 *	@return  Returns true if isIp67002GetUtcDtTm88() is "U"
	 */
   public boolean isIp67002GetUtcDtTm88() throws CFException {
      return ip67002DateParm.isIp67002GetUtcDtTm88();
   }

	/**
	*  set values "U"
	*/
   	public void setIp67002GetUtcDtTm88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetUtcDtTm88True();
   	}
	/**
	 *	Test condition "D" for isIp67002GetGregOfAbsDt88()
	 *	@return  Returns true if isIp67002GetGregOfAbsDt88() is "D"
	 */
   public boolean isIp67002GetGregOfAbsDt88() throws CFException {
      return ip67002DateParm.isIp67002GetGregOfAbsDt88();
   }

	/**
	*  set values "D"
	*/
   	public void setIp67002GetGregOfAbsDt88True()  throws CFException{  			
    	ip67002DateParm.setIp67002GetGregOfAbsDt88True();
   	}

        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ControlFunctionalityInCtx clone() {
        ControlFunctionalityInCtx cloneObj = new ControlFunctionalityInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ControlFunctionalityInCtx getControlFunctionalityInCtx() {
            return new ControlFunctionalityInCtx();
    }
     public class CompareJulianDatesInCtx implements Cloneable {
     CtcCcyy2Group802 ctcCcyy2Group802 = Ip670010Ctx.this.getCtcCcyy2Group802();
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of ip67002Cc2
	 *	@return ip67002Cc2
	 */
	public int getIp67002Cc2() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Cc2();
	}


	/**
	 *	Returns String value of ip67002Cc2
	 *	@return ip67002Cc2
	 */
	public char[]  getIp67002Cc2String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Cc2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Cc2IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().ip67002Cc2IsNumeric();
	}

	/**
	 * 	Update Ip67002Cc2 with the passed value
	 *	@param number
	 */
	public void setIp67002Cc2(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(number);
	}
	

	public void setIp67002Cc2(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(number);
	}
	
	
	/**
	 * 	Update Ip67002Cc2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc2(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(value);
	}
	
	/**
	 * 	Update Ip67002Cc2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc2String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(value);
	}	

	/**
	 *	Returns the value of ip67002JDdd201
	 *	@return ip67002JDdd201
	 */
	public int getIp67002JDdd201() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().getIp67002JDdd201();
	}


	/**
	 *	Returns String value of ip67002JDdd201
	 *	@return ip67002JDdd201
	 */
	public char[]  getIp67002JDdd201String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().getIp67002JDdd201String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002JDdd201IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().ip67002JDdd201IsNumeric();
	}

	/**
	 * 	Update Ip67002JDdd201 with the passed value
	 *	@param number
	 */
	public void setIp67002JDdd201(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(number);
	}
	

	public void setIp67002JDdd201(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(number);
	}
	
	
	/**
	 * 	Update Ip67002JDdd201 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd201(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(value);
	}
	
	/**
	 * 	Update Ip67002JDdd201 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd201String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public int getIp67002Ccyy() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Ccyy();
	}


	/**
	 *	Returns String value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public char[]  getIp67002CcyyString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002CcyyIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().ip67002CcyyIsNumeric();
	}

	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param number
	 */
	public void setIp67002Ccyy(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	

	public void setIp67002Ccyy(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	
	
	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}
	
	/**
	 * 	Update Ip67002Ccyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcyyString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyy2
	 *	@return ip67002Ccyy2
	 */
	public int getIp67002Ccyy2() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2();
	}


	/**
	 *	Returns String value of ip67002Ccyy2
	 *	@return ip67002Ccyy2
	 */
	public char[]  getIp67002Ccyy2String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Ccyy2IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().ip67002Ccyy2IsNumeric();
	}

	/**
	 * 	Update Ip67002Ccyy2 with the passed value
	 *	@param number
	 */
	public void setIp67002Ccyy2(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(number);
	}
	

	public void setIp67002Ccyy2(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(number);
	}
	
	
	/**
	 * 	Update Ip67002Ccyy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy2(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(value);
	}
	
	/**
	 * 	Update Ip67002Ccyy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy2String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(value);
	}	

	/**
	 *	Returns the value of value366300
	 *	@return value366300
	 */
	public int getValue366300() throws CFException {
   		return work.getValue366300();
	}


	/**
	 *	Returns String value of value366300
	 *	@return value366300
	 */
	public char[]  getValue366300String() throws CFException {
	     return String.valueOf(work.getValue366300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value366300IsNumeric()  throws CFException{
	    return work.value366300IsNumeric();
	}

	/**
	 * 	Update Value366300 with the passed value
	 *	@param number
	 */
	public void setValue366300(int number)  throws CFException{
		work.setValue366300(number);
	}
	

	public void setValue366300(long number)  throws CFException{
	    work.setValue366300(number);
	}
	
	
	/**
	 * 	Update Value366300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue366300(char[] value)  throws CFException {
		work.setValue366300(value);
	}
	
	/**
	 * 	Update Value366300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue366300String(char[] value)  throws CFException{
		work.setValue366300(value);
	}	

	/**
	 *	Returns the value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public int getIp67002JDdd01() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().getIp67002JDdd01();
	}


	/**
	 *	Returns String value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public char[]  getIp67002JDdd01String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().getIp67002JDdd01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002JDdd01IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().ip67002JDdd01IsNumeric();
	}

	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *	@param number
	 */
	public void setIp67002JDdd01(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(number);
	}
	

	public void setIp67002JDdd01(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(number);
	}
	
	
	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(value);
	}
	
	/**
	 * 	Update Ip67002JDdd01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(value);
	}	

	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
   		return work.getValue19300();
	}


	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() throws CFException {
	     return String.valueOf(work.getValue19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric()  throws CFException{
	    return work.value19300IsNumeric();
	}

	/**
	 * 	Update Value19300 with the passed value
	 *	@param number
	 */
	public void setValue19300(int number)  throws CFException{
		work.setValue19300(number);
	}
	

	public void setValue19300(long number)  throws CFException{
	    work.setValue19300(number);
	}
	
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value)  throws CFException {
		work.setValue19300(value);
	}
	
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value)  throws CFException{
		work.setValue19300(value);
	}	

	/**
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
   		return work.getValue4300();
	}


	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() throws CFException {
	     return String.valueOf(work.getValue4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric()  throws CFException{
	    return work.value4300IsNumeric();
	}

	/**
	 * 	Update Value4300 with the passed value
	 *	@param number
	 */
	public void setValue4300(int number)  throws CFException{
		work.setValue4300(number);
	}
	

	public void setValue4300(long number)  throws CFException{
	    work.setValue4300(number);
	}
	
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value)  throws CFException {
		work.setValue4300(value);
	}
	
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value)  throws CFException{
		work.setValue4300(value);
	}	

	/**
	 *	Returns the value of value49300
	 *	@return value49300
	 */
	public int getValue49300() throws CFException {
   		return work.getValue49300();
	}


	/**
	 *	Returns String value of value49300
	 *	@return value49300
	 */
	public char[]  getValue49300String() throws CFException {
	     return String.valueOf(work.getValue49300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value49300IsNumeric()  throws CFException{
	    return work.value49300IsNumeric();
	}

	/**
	 * 	Update Value49300 with the passed value
	 *	@param number
	 */
	public void setValue49300(int number)  throws CFException{
		work.setValue49300(number);
	}
	

	public void setValue49300(long number)  throws CFException{
	    work.setValue49300(number);
	}
	
	
	/**
	 * 	Update Value49300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue49300(char[] value)  throws CFException {
		work.setValue49300(value);
	}
	
	/**
	 * 	Update Value49300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue49300String(char[] value)  throws CFException{
		work.setValue49300(value);
	}	

	/**
	 *	Returns the value of ctcCc2802
	 *	@return ctcCc2802
	 */
	public int getCtcCc2802() throws CFException {
   		return ctcCcyy2Group802.getCtcCcyy2802Redefined().getCtcCc2802();
	}


	/**
	 *	Returns String value of ctcCc2802
	 *	@return ctcCc2802
	 */
	public char[]  getCtcCc2802String() throws CFException {
	     return String.valueOf(ctcCcyy2Group802.getCtcCcyy2802Redefined().getCtcCc2802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcCc2802IsNumeric()  throws CFException{
	    return ctcCcyy2Group802.getCtcCcyy2802Redefined().ctcCc2802IsNumeric();
	}

	/**
	 * 	Update CtcCc2802 with the passed value
	 *	@param number
	 */
	public void setCtcCc2802(int number)  throws CFException{
		ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCc2802(number);
	}
	

	public void setCtcCc2802(long number)  throws CFException{
	    ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCc2802(number);
	}
	
	
	/**
	 * 	Update CtcCc2802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcCc2802(char[] value)  throws CFException {
		ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCc2802(value);
	}
	
	/**
	 * 	Update CtcCc2802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcCc2802String(char[] value)  throws CFException{
		ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCc2802(value);
	}	

	/**
	 *	Returns the value of workRemainder2801
	 *	@return workRemainder2801
	 */
	public int getWorkRemainder2801() throws CFException {
   		return work.getWorkRemainder2801();
	}


	/**
	 *	Returns String value of workRemainder2801
	 *	@return workRemainder2801
	 */
	public char[]  getWorkRemainder2801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder2801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder2801IsNumeric()  throws CFException{
	    return work.workRemainder2801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder2801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder2801(int number)  throws CFException{
		work.setWorkRemainder2801(number);
	}
	

	public void setWorkRemainder2801(long number)  throws CFException{
	    work.setWorkRemainder2801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder2801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder2801(char[] value)  throws CFException {
		work.setWorkRemainder2801(value);
	}
	
	/**
	 * 	Update WorkRemainder2801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder2801String(char[] value)  throws CFException{
		work.setWorkRemainder2801(value);
	}	

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return work.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(work.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return work.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    work.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		work.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		work.setValue1300(value);
	}	

	/**
	 *	Returns the value of value365300
	 *	@return value365300
	 */
	public int getValue365300() throws CFException {
   		return work.getValue365300();
	}


	/**
	 *	Returns String value of value365300
	 *	@return value365300
	 */
	public char[]  getValue365300String() throws CFException {
	     return String.valueOf(work.getValue365300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value365300IsNumeric()  throws CFException{
	    return work.value365300IsNumeric();
	}

	/**
	 * 	Update Value365300 with the passed value
	 *	@param number
	 */
	public void setValue365300(int number)  throws CFException{
		work.setValue365300(number);
	}
	

	public void setValue365300(long number)  throws CFException{
	    work.setValue365300(number);
	}
	
	
	/**
	 * 	Update Value365300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue365300(char[] value)  throws CFException {
		work.setValue365300(value);
	}
	
	/**
	 * 	Update Value365300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue365300String(char[] value)  throws CFException{
		work.setValue365300(value);
	}	

	/**
	 *	Returns the value of ip67002Yy2
	 *	@return ip67002Yy2
	 */
	public int getIp67002Yy2() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Yy2();
	}


	/**
	 *	Returns String value of ip67002Yy2
	 *	@return ip67002Yy2
	 */
	public char[]  getIp67002Yy2String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Yy2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Yy2IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().ip67002Yy2IsNumeric();
	}

	/**
	 * 	Update Ip67002Yy2 with the passed value
	 *	@param number
	 */
	public void setIp67002Yy2(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(number);
	}
	

	public void setIp67002Yy2(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(number);
	}
	
	
	/**
	 * 	Update Ip67002Yy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy2(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(value);
	}
	
	/**
	 * 	Update Ip67002Yy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy2String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(value);
	}	

	/**
	 *	Returns the value of value20300
	 *	@return value20300
	 */
	public int getValue20300() throws CFException {
   		return work.getValue20300();
	}


	/**
	 *	Returns String value of value20300
	 *	@return value20300
	 */
	public char[]  getValue20300String() throws CFException {
	     return String.valueOf(work.getValue20300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value20300IsNumeric()  throws CFException{
	    return work.value20300IsNumeric();
	}

	/**
	 * 	Update Value20300 with the passed value
	 *	@param number
	 */
	public void setValue20300(int number)  throws CFException{
		work.setValue20300(number);
	}
	

	public void setValue20300(long number)  throws CFException{
	    work.setValue20300(number);
	}
	
	
	/**
	 * 	Update Value20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue20300(char[] value)  throws CFException {
		work.setValue20300(value);
	}
	
	/**
	 * 	Update Value20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue20300String(char[] value)  throws CFException{
		work.setValue20300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public CompareJulianDatesOutCtx getCompareJulianDatesOutCtx() {
            return new CompareJulianDatesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ctcCcyy2Group802.hashCode();
        str += work.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public CompareJulianDatesInCtx clone() {
        CompareJulianDatesInCtx cloneObj = new CompareJulianDatesInCtx();
        cloneObj.ctcCcyy2Group802 = new CtcCcyy2Group802();
        cloneObj.ctcCcyy2Group802.set(ctcCcyy2Group802.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public CompareJulianDatesInCtx getCompareJulianDatesInCtx() {
            return new CompareJulianDatesInCtx();
    }
     public class CompareJulianDatesOutCtx implements Cloneable {
     CtcCcyy2Group802 ctcCcyy2Group802 = Ip670010Ctx.this.getCtcCcyy2Group802();
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of workRemainder2801
	 *	@return workRemainder2801
	 */
	public int getWorkRemainder2801() throws CFException {
   		return work.getWorkRemainder2801();
	}


	/**
	 *	Returns String value of workRemainder2801
	 *	@return workRemainder2801
	 */
	public char[]  getWorkRemainder2801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder2801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder2801IsNumeric()  throws CFException{
	    return work.workRemainder2801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder2801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder2801(int number)  throws CFException{
		work.setWorkRemainder2801(number);
	}
	

	public void setWorkRemainder2801(long number)  throws CFException{
	    work.setWorkRemainder2801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder2801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder2801(char[] value)  throws CFException {
		work.setWorkRemainder2801(value);
	}
	
	/**
	 * 	Update WorkRemainder2801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder2801String(char[] value)  throws CFException{
		work.setWorkRemainder2801(value);
	}	

	/**
	 *	Returns the value of ip67002Cc2
	 *	@return ip67002Cc2
	 */
	public int getIp67002Cc2() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Cc2();
	}


	/**
	 *	Returns String value of ip67002Cc2
	 *	@return ip67002Cc2
	 */
	public char[]  getIp67002Cc2String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Cc2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Cc2IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().ip67002Cc2IsNumeric();
	}

	/**
	 * 	Update Ip67002Cc2 with the passed value
	 *	@param number
	 */
	public void setIp67002Cc2(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(number);
	}
	

	public void setIp67002Cc2(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(number);
	}
	
	
	/**
	 * 	Update Ip67002Cc2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc2(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(value);
	}
	
	/**
	 * 	Update Ip67002Cc2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc2String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Cc2(value);
	}	

	/**
	 *	Returns the value of ip67002JDdd201
	 *	@return ip67002JDdd201
	 */
	public int getIp67002JDdd201() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().getIp67002JDdd201();
	}


	/**
	 *	Returns String value of ip67002JDdd201
	 *	@return ip67002JDdd201
	 */
	public char[]  getIp67002JDdd201String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().getIp67002JDdd201String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002JDdd201IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().ip67002JDdd201IsNumeric();
	}

	/**
	 * 	Update Ip67002JDdd201 with the passed value
	 *	@param number
	 */
	public void setIp67002JDdd201(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(number);
	}
	

	public void setIp67002JDdd201(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(number);
	}
	
	
	/**
	 * 	Update Ip67002JDdd201 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd201(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(value);
	}
	
	/**
	 * 	Update Ip67002JDdd201 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd201String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Jddd2().setIp67002JDdd201(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public int getIp67002Ccyy() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Ccyy();
	}


	/**
	 *	Returns String value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public char[]  getIp67002CcyyString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002CcyyIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().ip67002CcyyIsNumeric();
	}

	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param number
	 */
	public void setIp67002Ccyy(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	

	public void setIp67002Ccyy(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	
	
	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}
	
	/**
	 * 	Update Ip67002Ccyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcyyString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}	

	/**
	 *	Returns the value of workYear2801
	 *	@return workYear2801
	 */
	public int getWorkYear2801() throws CFException {
   		return work.getWorkYear2801();
	}


	/**
	 *	Returns String value of workYear2801
	 *	@return workYear2801
	 */
	public char[]  getWorkYear2801String() throws CFException {
	     return String.valueOf(work.getWorkYear2801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear2801IsNumeric()  throws CFException{
	    return work.workYear2801IsNumeric();
	}

	/**
	 * 	Update WorkYear2801 with the passed value
	 *	@param number
	 */
	public void setWorkYear2801(int number)  throws CFException{
		work.setWorkYear2801(number);
	}
	

	public void setWorkYear2801(long number)  throws CFException{
	    work.setWorkYear2801(number);
	}
	
	
	/**
	 * 	Update WorkYear2801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear2801(char[] value)  throws CFException {
		work.setWorkYear2801(value);
	}
	
	/**
	 * 	Update WorkYear2801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear2801String(char[] value)  throws CFException{
		work.setWorkYear2801(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyy2
	 *	@return ip67002Ccyy2
	 */
	public int getIp67002Ccyy2() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2();
	}


	/**
	 *	Returns String value of ip67002Ccyy2
	 *	@return ip67002Ccyy2
	 */
	public char[]  getIp67002Ccyy2String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Ccyy2IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().ip67002Ccyy2IsNumeric();
	}

	/**
	 * 	Update Ip67002Ccyy2 with the passed value
	 *	@param number
	 */
	public void setIp67002Ccyy2(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(number);
	}
	

	public void setIp67002Ccyy2(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(number);
	}
	
	
	/**
	 * 	Update Ip67002Ccyy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy2(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(value);
	}
	
	/**
	 * 	Update Ip67002Ccyy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy2String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().setIp67002Ccyy2(value);
	}	

	/**
	 *	Returns the value of ctcCcx2802
	 *	@return ctcCcx2802
	 */
   public char[] getCtcCcx2802() throws CFException  {              
   		return ctcCcyy2Group802.getCtcCcyy2802Redefined().getCtcCcx2802();
   }

  
	/**
	*  set variable ctcCcx2802
	*  @param value
	**/
   public void setCtcCcx2802(char[] value) throws CFException {
      ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(value);
   } 

     /**
	 * 	Update CtcCcx2802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCtcCcx2802(char[] source, int sourceIndex) throws CFException {
      ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(source, sourceIndex);
   	
   }
   
   public void setCtcCcx2802(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CtcCcx2802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcx2802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CtcCcx2802 with another Field
	 *	@param value
	 */
   public void setCtcCcx2802(Field source) {
      ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(source);
   }  
   
     /**
	 * 	Update CtcCcx2802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCtcCcx2802(Field source, int sourceIndex,int sourceLen) {
      ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CtcCcx2802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcCcx2802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ctcCcyy2Group802.getCtcCcyy2802Redefined().setCtcCcx2802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public int getIp67002JDdd01() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().getIp67002JDdd01();
	}


	/**
	 *	Returns String value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public char[]  getIp67002JDdd01String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().getIp67002JDdd01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002JDdd01IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().ip67002JDdd01IsNumeric();
	}

	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *	@param number
	 */
	public void setIp67002JDdd01(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(number);
	}
	

	public void setIp67002JDdd01(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(number);
	}
	
	
	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(value);
	}
	
	/**
	 * 	Update Ip67002JDdd01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(value);
	}	

	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
   		return work.getValue19300();
	}


	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() throws CFException {
	     return String.valueOf(work.getValue19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric()  throws CFException{
	    return work.value19300IsNumeric();
	}

	/**
	 * 	Update Value19300 with the passed value
	 *	@param number
	 */
	public void setValue19300(int number)  throws CFException{
		work.setValue19300(number);
	}
	

	public void setValue19300(long number)  throws CFException{
	    work.setValue19300(number);
	}
	
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value)  throws CFException {
		work.setValue19300(value);
	}
	
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value)  throws CFException{
		work.setValue19300(value);
	}	

	/**
	 *	Returns the value of ip67002Yy2
	 *	@return ip67002Yy2
	 */
	public int getIp67002Yy2() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Yy2();
	}


	/**
	 *	Returns String value of ip67002Yy2
	 *	@return ip67002Yy2
	 */
	public char[]  getIp67002Yy2String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().getIp67002Yy2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Yy2IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().ip67002Yy2IsNumeric();
	}

	/**
	 * 	Update Ip67002Yy2 with the passed value
	 *	@param number
	 */
	public void setIp67002Yy2(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(number);
	}
	

	public void setIp67002Yy2(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(number);
	}
	
	
	/**
	 * 	Update Ip67002Yy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy2(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(value);
	}
	
	/**
	 * 	Update Ip67002Yy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy2String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined().getIp67002Ccyy2Redefined().setIp67002Yy2(value);
	}	

	/**
	 *	Returns the value of value20300
	 *	@return value20300
	 */
	public int getValue20300() throws CFException {
   		return work.getValue20300();
	}


	/**
	 *	Returns String value of value20300
	 *	@return value20300
	 */
	public char[]  getValue20300String() throws CFException {
	     return String.valueOf(work.getValue20300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value20300IsNumeric()  throws CFException{
	    return work.value20300IsNumeric();
	}

	/**
	 * 	Update Value20300 with the passed value
	 *	@param number
	 */
	public void setValue20300(int number)  throws CFException{
		work.setValue20300(number);
	}
	

	public void setValue20300(long number)  throws CFException{
	    work.setValue20300(number);
	}
	
	
	/**
	 * 	Update Value20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue20300(char[] value)  throws CFException {
		work.setValue20300(value);
	}
	
	/**
	 * 	Update Value20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue20300String(char[] value)  throws CFException{
		work.setValue20300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ctcCcyy2Group802.hashCode();
        str += work.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public CompareJulianDatesOutCtx clone() {
        CompareJulianDatesOutCtx cloneObj = new CompareJulianDatesOutCtx();
        cloneObj.ctcCcyy2Group802 = new CtcCcyy2Group802();
        cloneObj.ctcCcyy2Group802.set(ctcCcyy2Group802.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public CompareJulianDatesOutCtx getCompareJulianDatesOutCtx() {
            return new CompareJulianDatesOutCtx();
    }
     public class ConvertFromJulianInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
   		return formatedJulDate800.getJulianDate800();
	}


	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() throws CFException {
	     return String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric()  throws CFException{
	    return formatedJulDate800.julianDate800IsNumeric();
	}

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param number
	 */
	public void setJulianDate800(long number)  throws CFException{
		formatedJulDate800.setJulianDate800(number);
	}
	

	
	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value)  throws CFException {
		formatedJulDate800.setJulianDate800(value);
	}
	
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value)  throws CFException{
		formatedJulDate800.setJulianDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public ConvertFromJulianOutCtx getConvertFromJulianOutCtx() {
            return new ConvertFromJulianOutCtx();
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ConvertFromJulianInCtx clone() {
        ConvertFromJulianInCtx cloneObj = new ConvertFromJulianInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ConvertFromJulianInCtx getConvertFromJulianInCtx() {
            return new ConvertFromJulianInCtx();
    }
     public class ConvertFromJulianOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public long getGregorianDateCal800() throws CFException {
   		return work.getGregorianDateCal800();
	}


	/**
	 *	Returns String value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public char[]  getGregorianDateCal800String() throws CFException {
	     return String.valueOf(work.getGregorianDateCal800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gregorianDateCal800IsNumeric()  throws CFException{
	    return work.gregorianDateCal800IsNumeric();
	}

	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param number
	 */
	public void setGregorianDateCal800(long number)  throws CFException{
		work.setGregorianDateCal800(number);
	}
	

	
	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800(char[] value)  throws CFException {
		work.setGregorianDateCal800(value);
	}
	
	/**
	 * 	Update GregorianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800String(char[] value)  throws CFException{
		work.setGregorianDateCal800(value);
	}	

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
   		return formatedJulDate800.getJulianDate800();
	}


	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() throws CFException {
	     return String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric()  throws CFException{
	    return formatedJulDate800.julianDate800IsNumeric();
	}

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param number
	 */
	public void setJulianDate800(long number)  throws CFException{
		formatedJulDate800.setJulianDate800(number);
	}
	

	
	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value)  throws CFException {
		formatedJulDate800.setJulianDate800(value);
	}
	
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value)  throws CFException{
		formatedJulDate800.setJulianDate800(value);
	}	

	/**
	 *	Returns the value of formatedJulDate800
	 *	@return formatedJulDate800
	 */   
	 public FormatedJulDate800 getFormatedJulDate800() {
   	return formatedJulDate800;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ConvertFromJulianOutCtx clone() {
        ConvertFromJulianOutCtx cloneObj = new ConvertFromJulianOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ConvertFromJulianOutCtx getConvertFromJulianOutCtx() {
            return new ConvertFromJulianOutCtx();
    }
     public class ConvertToJulianInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Test condition "Y" for isItIsLeapYear88100()
	 *	@return  Returns true if isItIsLeapYear88100() is "Y"
	 */
   public boolean isItIsLeapYear88100() throws CFException {
      return work.isItIsLeapYear88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsLeapYear88100True()  throws CFException{  			
    	work.setItIsLeapYear88100True();
   	}
	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	

	/**
	 *	Returns the value of value11300
	 *	@return value11300
	 */
	public int getValue11300() throws CFException {
   		return work.getValue11300();
	}


	/**
	 *	Returns String value of value11300
	 *	@return value11300
	 */
	public char[]  getValue11300String() throws CFException {
	     return String.valueOf(work.getValue11300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value11300IsNumeric()  throws CFException{
	    return work.value11300IsNumeric();
	}

	/**
	 * 	Update Value11300 with the passed value
	 *	@param number
	 */
	public void setValue11300(int number)  throws CFException{
		work.setValue11300(number);
	}
	

	public void setValue11300(long number)  throws CFException{
	    work.setValue11300(number);
	}
	
	
	/**
	 * 	Update Value11300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue11300(char[] value)  throws CFException {
		work.setValue11300(value);
	}
	
	/**
	 * 	Update Value11300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue11300String(char[] value)  throws CFException{
		work.setValue11300(value);
	}	

	/**
	 *	Returns the value of value12300
	 *	@return value12300
	 */
	public int getValue12300() throws CFException {
   		return work.getValue12300();
	}


	/**
	 *	Returns String value of value12300
	 *	@return value12300
	 */
	public char[]  getValue12300String() throws CFException {
	     return String.valueOf(work.getValue12300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value12300IsNumeric()  throws CFException{
	    return work.value12300IsNumeric();
	}

	/**
	 * 	Update Value12300 with the passed value
	 *	@param number
	 */
	public void setValue12300(int number)  throws CFException{
		work.setValue12300(number);
	}
	

	public void setValue12300(long number)  throws CFException{
	    work.setValue12300(number);
	}
	
	
	/**
	 * 	Update Value12300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue12300(char[] value)  throws CFException {
		work.setValue12300(value);
	}
	
	/**
	 * 	Update Value12300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue12300String(char[] value)  throws CFException{
		work.setValue12300(value);
	}	

	/**
	 *	Returns the value of ip67002Yymmdd
	 *	@return ip67002Yymmdd
	 */
   public char[] getIp67002Yymmdd() throws CFException  {              
   		return ip67002DateParm.getIp67002DateRedefined02().getIp67002Yymmdd();
   }

  
	/**
	*  set variable ip67002Yymmdd
	*  @param value
	**/
   public void setIp67002Yymmdd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(value);
   } 

     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex) throws CFException {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex);
   	
   }
   
   public void setIp67002Yymmdd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Yymmdd with another Field
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source);
   }  
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip67002Dd
	 *	@return ip67002Dd
	 */
	public int getIp67002Dd() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd().getIp67002Dd();
	}


	/**
	 *	Returns String value of ip67002Dd
	 *	@return ip67002Dd
	 */
	public char[]  getIp67002DdString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd().getIp67002DdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DdIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd().ip67002DdIsNumeric();
	}

	/**
	 * 	Update Ip67002Dd with the passed value
	 *	@param number
	 */
	public void setIp67002Dd(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd().setIp67002Dd(number);
	}
	

	public void setIp67002Dd(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd().setIp67002Dd(number);
	}
	
	
	/**
	 * 	Update Ip67002Dd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Dd(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd().setIp67002Dd(value);
	}
	
	/**
	 * 	Update Ip67002Dd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DdString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Mmdd().setIp67002Dd(value);
	}	

	/**
	 *	Returns the value of value5300
	 *	@return value5300
	 */
	public int getValue5300() throws CFException {
   		return work.getValue5300();
	}


	/**
	 *	Returns String value of value5300
	 *	@return value5300
	 */
	public char[]  getValue5300String() throws CFException {
	     return String.valueOf(work.getValue5300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value5300IsNumeric()  throws CFException{
	    return work.value5300IsNumeric();
	}

	/**
	 * 	Update Value5300 with the passed value
	 *	@param number
	 */
	public void setValue5300(int number)  throws CFException{
		work.setValue5300(number);
	}
	

	public void setValue5300(long number)  throws CFException{
	    work.setValue5300(number);
	}
	
	
	/**
	 * 	Update Value5300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue5300(char[] value)  throws CFException {
		work.setValue5300(value);
	}
	
	/**
	 * 	Update Value5300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue5300String(char[] value)  throws CFException{
		work.setValue5300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public ConvertToJulianOutCtx getConvertToJulianOutCtx() {
            return new ConvertToJulianOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ConvertToJulianInCtx clone() {
        ConvertToJulianInCtx cloneObj = new ConvertToJulianInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ConvertToJulianInCtx getConvertToJulianInCtx() {
            return new ConvertToJulianInCtx();
    }
     public class ConvertToJulianOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	

	/**
	 *	Returns the value of value11300
	 *	@return value11300
	 */
	public int getValue11300() throws CFException {
   		return work.getValue11300();
	}


	/**
	 *	Returns String value of value11300
	 *	@return value11300
	 */
	public char[]  getValue11300String() throws CFException {
	     return String.valueOf(work.getValue11300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value11300IsNumeric()  throws CFException{
	    return work.value11300IsNumeric();
	}

	/**
	 * 	Update Value11300 with the passed value
	 *	@param number
	 */
	public void setValue11300(int number)  throws CFException{
		work.setValue11300(number);
	}
	

	public void setValue11300(long number)  throws CFException{
	    work.setValue11300(number);
	}
	
	
	/**
	 * 	Update Value11300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue11300(char[] value)  throws CFException {
		work.setValue11300(value);
	}
	
	/**
	 * 	Update Value11300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue11300String(char[] value)  throws CFException{
		work.setValue11300(value);
	}	

	/**
	 *	Returns the value of value12300
	 *	@return value12300
	 */
	public int getValue12300() throws CFException {
   		return work.getValue12300();
	}


	/**
	 *	Returns String value of value12300
	 *	@return value12300
	 */
	public char[]  getValue12300String() throws CFException {
	     return String.valueOf(work.getValue12300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value12300IsNumeric()  throws CFException{
	    return work.value12300IsNumeric();
	}

	/**
	 * 	Update Value12300 with the passed value
	 *	@param number
	 */
	public void setValue12300(int number)  throws CFException{
		work.setValue12300(number);
	}
	

	public void setValue12300(long number)  throws CFException{
	    work.setValue12300(number);
	}
	
	
	/**
	 * 	Update Value12300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue12300(char[] value)  throws CFException {
		work.setValue12300(value);
	}
	
	/**
	 * 	Update Value12300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue12300String(char[] value)  throws CFException{
		work.setValue12300(value);
	}	

	/**
	 *	Returns the value of value5300
	 *	@return value5300
	 */
	public int getValue5300() throws CFException {
   		return work.getValue5300();
	}


	/**
	 *	Returns String value of value5300
	 *	@return value5300
	 */
	public char[]  getValue5300String() throws CFException {
	     return String.valueOf(work.getValue5300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value5300IsNumeric()  throws CFException{
	    return work.value5300IsNumeric();
	}

	/**
	 * 	Update Value5300 with the passed value
	 *	@param number
	 */
	public void setValue5300(int number)  throws CFException{
		work.setValue5300(number);
	}
	

	public void setValue5300(long number)  throws CFException{
	    work.setValue5300(number);
	}
	
	
	/**
	 * 	Update Value5300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue5300(char[] value)  throws CFException {
		work.setValue5300(value);
	}
	
	/**
	 * 	Update Value5300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue5300String(char[] value)  throws CFException{
		work.setValue5300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ConvertToJulianOutCtx clone() {
        ConvertToJulianOutCtx cloneObj = new ConvertToJulianOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ConvertToJulianOutCtx getConvertToJulianOutCtx() {
            return new ConvertToJulianOutCtx();
    }
     public class GregToJulConversionInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public long getGregorianDateCal800() throws CFException {
   		return work.getGregorianDateCal800();
	}


	/**
	 *	Returns String value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public char[]  getGregorianDateCal800String() throws CFException {
	     return String.valueOf(work.getGregorianDateCal800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gregorianDateCal800IsNumeric()  throws CFException{
	    return work.gregorianDateCal800IsNumeric();
	}

	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param number
	 */
	public void setGregorianDateCal800(long number)  throws CFException{
		work.setGregorianDateCal800(number);
	}
	

	
	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800(char[] value)  throws CFException {
		work.setGregorianDateCal800(value);
	}
	
	/**
	 * 	Update GregorianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800String(char[] value)  throws CFException{
		work.setGregorianDateCal800(value);
	}	

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of julianDateCal800
	 *	@return julianDateCal800
	 */
	public long getJulianDateCal800() throws CFException {
   		return work.getJulianDateCal800();
	}


	/**
	 *	Returns String value of julianDateCal800
	 *	@return julianDateCal800
	 */
	public char[]  getJulianDateCal800String() throws CFException {
	     return String.valueOf(work.getJulianDateCal800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDateCal800IsNumeric()  throws CFException{
	    return work.julianDateCal800IsNumeric();
	}

	/**
	 * 	Update JulianDateCal800 with the passed value
	 *	@param number
	 */
	public void setJulianDateCal800(long number)  throws CFException{
		work.setJulianDateCal800(number);
	}
	

	
	/**
	 * 	Update JulianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDateCal800(char[] value)  throws CFException {
		work.setJulianDateCal800(value);
	}
	
	/**
	 * 	Update JulianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDateCal800String(char[] value)  throws CFException{
		work.setJulianDateCal800(value);
	}	

	/**
	 *	Returns the value of formatedJulDate800
	 *	@return formatedJulDate800
	 */   
	 public FormatedJulDate800 getFormatedJulDate800() {
   	return formatedJulDate800;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GregToJulConversionOutCtx getGregToJulConversionOutCtx() {
            return new GregToJulConversionOutCtx();
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GregToJulConversionInCtx clone() {
        GregToJulConversionInCtx cloneObj = new GregToJulConversionInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GregToJulConversionInCtx getGregToJulConversionInCtx() {
            return new GregToJulConversionInCtx();
    }
     public class GregToJulConversionOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public long getGregorianDateCal800() throws CFException {
   		return work.getGregorianDateCal800();
	}


	/**
	 *	Returns String value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public char[]  getGregorianDateCal800String() throws CFException {
	     return String.valueOf(work.getGregorianDateCal800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gregorianDateCal800IsNumeric()  throws CFException{
	    return work.gregorianDateCal800IsNumeric();
	}

	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param number
	 */
	public void setGregorianDateCal800(long number)  throws CFException{
		work.setGregorianDateCal800(number);
	}
	

	
	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800(char[] value)  throws CFException {
		work.setGregorianDateCal800(value);
	}
	
	/**
	 * 	Update GregorianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800String(char[] value)  throws CFException{
		work.setGregorianDateCal800(value);
	}	

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of julianDateCal800
	 *	@return julianDateCal800
	 */
	public long getJulianDateCal800() throws CFException {
   		return work.getJulianDateCal800();
	}


	/**
	 *	Returns String value of julianDateCal800
	 *	@return julianDateCal800
	 */
	public char[]  getJulianDateCal800String() throws CFException {
	     return String.valueOf(work.getJulianDateCal800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDateCal800IsNumeric()  throws CFException{
	    return work.julianDateCal800IsNumeric();
	}

	/**
	 * 	Update JulianDateCal800 with the passed value
	 *	@param number
	 */
	public void setJulianDateCal800(long number)  throws CFException{
		work.setJulianDateCal800(number);
	}
	

	
	/**
	 * 	Update JulianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDateCal800(char[] value)  throws CFException {
		work.setJulianDateCal800(value);
	}
	
	/**
	 * 	Update JulianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDateCal800String(char[] value)  throws CFException{
		work.setJulianDateCal800(value);
	}	

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
   		return formatedJulDate800.getJulianDate800();
	}


	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() throws CFException {
	     return String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric()  throws CFException{
	    return formatedJulDate800.julianDate800IsNumeric();
	}

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param number
	 */
	public void setJulianDate800(long number)  throws CFException{
		formatedJulDate800.setJulianDate800(number);
	}
	

	
	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value)  throws CFException {
		formatedJulDate800.setJulianDate800(value);
	}
	
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value)  throws CFException{
		formatedJulDate800.setJulianDate800(value);
	}	

	/**
	 *	Returns the value of formatedJulDate800
	 *	@return formatedJulDate800
	 */   
	 public FormatedJulDate800 getFormatedJulDate800() {
   	return formatedJulDate800;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GregToJulConversionOutCtx clone() {
        GregToJulConversionOutCtx cloneObj = new GregToJulConversionOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GregToJulConversionOutCtx getGregToJulConversionOutCtx() {
            return new GregToJulConversionOutCtx();
    }
     public class GetCalendarDowInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public int getIp67002DayOfWeek() throws CFException {
   		return ip67002DateParm.getIp67002DayOfWeek();
	}


	/**
	 *	Returns String value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public char[]  getIp67002DayOfWeekString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DayOfWeekString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DayOfWeekIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DayOfWeekIsNumeric();
	}

	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param number
	 */
	public void setIp67002DayOfWeek(int number)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(number);
	}
	

	public void setIp67002DayOfWeek(long number)  throws CFException{
	    ip67002DateParm.setIp67002DayOfWeek(number);
	}
	
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeek(char[] value)  throws CFException {
		ip67002DateParm.setIp67002DayOfWeek(value);
	}
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeekString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
   		return work.getValue7300();
	}


	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() throws CFException {
	     return String.valueOf(work.getValue7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric()  throws CFException{
	    return work.value7300IsNumeric();
	}

	/**
	 * 	Update Value7300 with the passed value
	 *	@param number
	 */
	public void setValue7300(int number)  throws CFException{
		work.setValue7300(number);
	}
	

	public void setValue7300(long number)  throws CFException{
	    work.setValue7300(number);
	}
	
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value)  throws CFException {
		work.setValue7300(value);
	}
	
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value)  throws CFException{
		work.setValue7300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetCalendarDowOutCtx getGetCalendarDowOutCtx() {
            return new GetCalendarDowOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetCalendarDowInCtx clone() {
        GetCalendarDowInCtx cloneObj = new GetCalendarDowInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetCalendarDowInCtx getGetCalendarDowInCtx() {
            return new GetCalendarDowInCtx();
    }
     public class GetCalendarDowOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public int getIp67002DayOfWeek() throws CFException {
   		return ip67002DateParm.getIp67002DayOfWeek();
	}


	/**
	 *	Returns String value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public char[]  getIp67002DayOfWeekString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DayOfWeekString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DayOfWeekIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DayOfWeekIsNumeric();
	}

	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param number
	 */
	public void setIp67002DayOfWeek(int number)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(number);
	}
	

	public void setIp67002DayOfWeek(long number)  throws CFException{
	    ip67002DateParm.setIp67002DayOfWeek(number);
	}
	
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeek(char[] value)  throws CFException {
		ip67002DateParm.setIp67002DayOfWeek(value);
	}
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeekString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
   		return work.getValue7300();
	}


	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() throws CFException {
	     return String.valueOf(work.getValue7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric()  throws CFException{
	    return work.value7300IsNumeric();
	}

	/**
	 * 	Update Value7300 with the passed value
	 *	@param number
	 */
	public void setValue7300(int number)  throws CFException{
		work.setValue7300(number);
	}
	

	public void setValue7300(long number)  throws CFException{
	    work.setValue7300(number);
	}
	
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value)  throws CFException {
		work.setValue7300(value);
	}
	
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value)  throws CFException{
		work.setValue7300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetCalendarDowOutCtx clone() {
        GetCalendarDowOutCtx cloneObj = new GetCalendarDowOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetCalendarDowOutCtx getGetCalendarDowOutCtx() {
            return new GetCalendarDowOutCtx();
    }
     public class GetDateBeforeSpanInCtx implements Cloneable {
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public int getIp67002Ddd() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002Ddd();
	}


	/**
	 *	Returns String value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public char[]  getIp67002DddString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002DddString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DddIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().ip67002DddIsNumeric();
	}

	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param number
	 */
	public void setIp67002Ddd(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	

	public void setIp67002Ddd(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	
	
	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ddd(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}
	
	/**
	 * 	Update Ip67002Ddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DddString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}	

	/**
	 *	Returns the value of ip67002JulianDaysSpan
	 *	@return ip67002JulianDaysSpan
	 */
	public short getIp67002JulianDaysSpan() throws CFException {        
   		return ip67002DateParm.getIp67002JulianDaysSpan();
	}
	
	/**
	 * 	Update Ip67002JulianDaysSpan with the passed value
	 *	@param number
	 */
	public void setIp67002JulianDaysSpan(short number)  throws CFException{
		ip67002DateParm.setIp67002JulianDaysSpan(number);
	}

	public void setIp67002JulianDaysSpan(int number)  throws CFException{
		ip67002DateParm.setIp67002JulianDaysSpan((short)number);
	}

	public void setIp67002JulianDaysSpan(long number)  throws CFException{
		ip67002DateParm.setIp67002JulianDaysSpan((short)number);
	}




        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetDateBeforeSpanOutCtx getGetDateBeforeSpanOutCtx() {
            return new GetDateBeforeSpanOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetDateBeforeSpanInCtx clone() {
        GetDateBeforeSpanInCtx cloneObj = new GetDateBeforeSpanInCtx();
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetDateBeforeSpanInCtx getGetDateBeforeSpanInCtx() {
            return new GetDateBeforeSpanInCtx();
    }
     public class GetDateBeforeSpanOutCtx implements Cloneable {
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public int getIp67002Ddd() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002Ddd();
	}


	/**
	 *	Returns String value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public char[]  getIp67002DddString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002DddString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DddIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().ip67002DddIsNumeric();
	}

	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param number
	 */
	public void setIp67002Ddd(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	

	public void setIp67002Ddd(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	
	
	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ddd(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}
	
	/**
	 * 	Update Ip67002Ddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DddString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetDateBeforeSpanOutCtx clone() {
        GetDateBeforeSpanOutCtx cloneObj = new GetDateBeforeSpanOutCtx();
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetDateBeforeSpanOutCtx getGetDateBeforeSpanOutCtx() {
            return new GetDateBeforeSpanOutCtx();
    }
     public class GetPreviousYearDateInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return work.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(work.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return work.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    work.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		work.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		work.setValue1300(value);
	}	

	/**
	 *	Returns the value of workRemainder801
	 *	@return workRemainder801
	 */
	public int getWorkRemainder801() throws CFException {
   		return work.getWorkRemainder801();
	}


	/**
	 *	Returns String value of workRemainder801
	 *	@return workRemainder801
	 */
	public char[]  getWorkRemainder801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder801IsNumeric()  throws CFException{
	    return work.workRemainder801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder801(int number)  throws CFException{
		work.setWorkRemainder801(number);
	}
	

	public void setWorkRemainder801(long number)  throws CFException{
	    work.setWorkRemainder801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801(char[] value)  throws CFException {
		work.setWorkRemainder801(value);
	}
	
	/**
	 * 	Update WorkRemainder801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801String(char[] value)  throws CFException{
		work.setWorkRemainder801(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public int getIp67002Ccyy() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Ccyy();
	}


	/**
	 *	Returns String value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public char[]  getIp67002CcyyString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002CcyyIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().ip67002CcyyIsNumeric();
	}

	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param number
	 */
	public void setIp67002Ccyy(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	

	public void setIp67002Ccyy(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	
	
	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}
	
	/**
	 * 	Update Ip67002Ccyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcyyString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}	

	/**
	 *	Returns the value of ip67002YyJul
	 *	@return ip67002YyJul
	 */
	public int getIp67002YyJul() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002YyJul();
	}


	/**
	 *	Returns String value of ip67002YyJul
	 *	@return ip67002YyJul
	 */
	public char[]  getIp67002YyJulString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002YyJulString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002YyJulIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().ip67002YyJulIsNumeric();
	}

	/**
	 * 	Update Ip67002YyJul with the passed value
	 *	@param number
	 */
	public void setIp67002YyJul(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(number);
	}
	

	public void setIp67002YyJul(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(number);
	}
	
	
	/**
	 * 	Update Ip67002YyJul with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002YyJul(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(value);
	}
	
	/**
	 * 	Update Ip67002YyJul with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002YyJulString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(value);
	}	

	/**
	 *	Returns the value of value366300
	 *	@return value366300
	 */
	public int getValue366300() throws CFException {
   		return work.getValue366300();
	}


	/**
	 *	Returns String value of value366300
	 *	@return value366300
	 */
	public char[]  getValue366300String() throws CFException {
	     return String.valueOf(work.getValue366300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value366300IsNumeric()  throws CFException{
	    return work.value366300IsNumeric();
	}

	/**
	 * 	Update Value366300 with the passed value
	 *	@param number
	 */
	public void setValue366300(int number)  throws CFException{
		work.setValue366300(number);
	}
	

	public void setValue366300(long number)  throws CFException{
	    work.setValue366300(number);
	}
	
	
	/**
	 * 	Update Value366300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue366300(char[] value)  throws CFException {
		work.setValue366300(value);
	}
	
	/**
	 * 	Update Value366300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue366300String(char[] value)  throws CFException{
		work.setValue366300(value);
	}	

	/**
	 *	Returns the value of value365300
	 *	@return value365300
	 */
	public int getValue365300() throws CFException {
   		return work.getValue365300();
	}


	/**
	 *	Returns String value of value365300
	 *	@return value365300
	 */
	public char[]  getValue365300String() throws CFException {
	     return String.valueOf(work.getValue365300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value365300IsNumeric()  throws CFException{
	    return work.value365300IsNumeric();
	}

	/**
	 * 	Update Value365300 with the passed value
	 *	@param number
	 */
	public void setValue365300(int number)  throws CFException{
		work.setValue365300(number);
	}
	

	public void setValue365300(long number)  throws CFException{
	    work.setValue365300(number);
	}
	
	
	/**
	 * 	Update Value365300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue365300(char[] value)  throws CFException {
		work.setValue365300(value);
	}
	
	/**
	 * 	Update Value365300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue365300String(char[] value)  throws CFException{
		work.setValue365300(value);
	}	

	/**
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
   		return work.getValue4300();
	}


	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() throws CFException {
	     return String.valueOf(work.getValue4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric()  throws CFException{
	    return work.value4300IsNumeric();
	}

	/**
	 * 	Update Value4300 with the passed value
	 *	@param number
	 */
	public void setValue4300(int number)  throws CFException{
		work.setValue4300(number);
	}
	

	public void setValue4300(long number)  throws CFException{
	    work.setValue4300(number);
	}
	
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value)  throws CFException {
		work.setValue4300(value);
	}
	
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value)  throws CFException{
		work.setValue4300(value);
	}	

	/**
	 *	Returns the value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public int getIp67002Ddd() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002Ddd();
	}


	/**
	 *	Returns String value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public char[]  getIp67002DddString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002DddString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DddIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().ip67002DddIsNumeric();
	}

	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param number
	 */
	public void setIp67002Ddd(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	

	public void setIp67002Ddd(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	
	
	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ddd(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}
	
	/**
	 * 	Update Ip67002Ddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DddString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetPreviousYearDateOutCtx getGetPreviousYearDateOutCtx() {
            return new GetPreviousYearDateOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetPreviousYearDateInCtx clone() {
        GetPreviousYearDateInCtx cloneObj = new GetPreviousYearDateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetPreviousYearDateInCtx getGetPreviousYearDateInCtx() {
            return new GetPreviousYearDateInCtx();
    }
     public class GetPreviousYearDateOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of workRemainder801
	 *	@return workRemainder801
	 */
	public int getWorkRemainder801() throws CFException {
   		return work.getWorkRemainder801();
	}


	/**
	 *	Returns String value of workRemainder801
	 *	@return workRemainder801
	 */
	public char[]  getWorkRemainder801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder801IsNumeric()  throws CFException{
	    return work.workRemainder801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder801(int number)  throws CFException{
		work.setWorkRemainder801(number);
	}
	

	public void setWorkRemainder801(long number)  throws CFException{
	    work.setWorkRemainder801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801(char[] value)  throws CFException {
		work.setWorkRemainder801(value);
	}
	
	/**
	 * 	Update WorkRemainder801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801String(char[] value)  throws CFException{
		work.setWorkRemainder801(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public int getIp67002Ccyy() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Ccyy();
	}


	/**
	 *	Returns String value of ip67002Ccyy
	 *	@return ip67002Ccyy
	 */
	public char[]  getIp67002CcyyString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002CcyyIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().ip67002CcyyIsNumeric();
	}

	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param number
	 */
	public void setIp67002Ccyy(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	

	public void setIp67002Ccyy(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(number);
	}
	
	
	/**
	 * 	Update Ip67002Ccyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ccyy(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}
	
	/**
	 * 	Update Ip67002Ccyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcyyString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().setIp67002Ccyy(value);
	}	

	/**
	 *	Returns the value of ip67002YyJul
	 *	@return ip67002YyJul
	 */
	public int getIp67002YyJul() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002YyJul();
	}


	/**
	 *	Returns String value of ip67002YyJul
	 *	@return ip67002YyJul
	 */
	public char[]  getIp67002YyJulString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002YyJulString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002YyJulIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().ip67002YyJulIsNumeric();
	}

	/**
	 * 	Update Ip67002YyJul with the passed value
	 *	@param number
	 */
	public void setIp67002YyJul(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(number);
	}
	

	public void setIp67002YyJul(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(number);
	}
	
	
	/**
	 * 	Update Ip67002YyJul with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002YyJul(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(value);
	}
	
	/**
	 * 	Update Ip67002YyJul with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002YyJulString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002YyJul(value);
	}	

	/**
	 *	Returns the value of workYear801
	 *	@return workYear801
	 */
	public int getWorkYear801() throws CFException {
   		return work.getWorkYear801();
	}


	/**
	 *	Returns String value of workYear801
	 *	@return workYear801
	 */
	public char[]  getWorkYear801String() throws CFException {
	     return String.valueOf(work.getWorkYear801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear801IsNumeric()  throws CFException{
	    return work.workYear801IsNumeric();
	}

	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param number
	 */
	public void setWorkYear801(int number)  throws CFException{
		work.setWorkYear801(number);
	}
	

	public void setWorkYear801(long number)  throws CFException{
	    work.setWorkYear801(number);
	}
	
	
	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear801(char[] value)  throws CFException {
		work.setWorkYear801(value);
	}
	
	/**
	 * 	Update WorkYear801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear801String(char[] value)  throws CFException{
		work.setWorkYear801(value);
	}	

	/**
	 *	Returns the value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public int getIp67002Ddd() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002Ddd();
	}


	/**
	 *	Returns String value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public char[]  getIp67002DddString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().getIp67002DddString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DddIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().ip67002DddIsNumeric();
	}

	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param number
	 */
	public void setIp67002Ddd(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	

	public void setIp67002Ddd(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(number);
	}
	
	
	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ddd(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}
	
	/**
	 * 	Update Ip67002Ddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DddString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd().getIp67002Yyddd().setIp67002Ddd(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetPreviousYearDateOutCtx clone() {
        GetPreviousYearDateOutCtx cloneObj = new GetPreviousYearDateOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetPreviousYearDateOutCtx getGetPreviousYearDateOutCtx() {
            return new GetPreviousYearDateOutCtx();
    }
     public class GetAbsoluteDateGregInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public long getGregorianDateCal800() throws CFException {
   		return work.getGregorianDateCal800();
	}


	/**
	 *	Returns String value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public char[]  getGregorianDateCal800String() throws CFException {
	     return String.valueOf(work.getGregorianDateCal800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gregorianDateCal800IsNumeric()  throws CFException{
	    return work.gregorianDateCal800IsNumeric();
	}

	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param number
	 */
	public void setGregorianDateCal800(long number)  throws CFException{
		work.setGregorianDateCal800(number);
	}
	

	
	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800(char[] value)  throws CFException {
		work.setGregorianDateCal800(value);
	}
	
	/**
	 * 	Update GregorianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800String(char[] value)  throws CFException{
		work.setGregorianDateCal800(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetAbsoluteDateGregOutCtx getGetAbsoluteDateGregOutCtx() {
            return new GetAbsoluteDateGregOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetAbsoluteDateGregInCtx clone() {
        GetAbsoluteDateGregInCtx cloneObj = new GetAbsoluteDateGregInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetAbsoluteDateGregInCtx getGetAbsoluteDateGregInCtx() {
            return new GetAbsoluteDateGregInCtx();
    }
     public class GetAbsoluteDateGregOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public long getGregorianDateCal800() throws CFException {
   		return work.getGregorianDateCal800();
	}


	/**
	 *	Returns String value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public char[]  getGregorianDateCal800String() throws CFException {
	     return String.valueOf(work.getGregorianDateCal800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean gregorianDateCal800IsNumeric()  throws CFException{
	    return work.gregorianDateCal800IsNumeric();
	}

	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param number
	 */
	public void setGregorianDateCal800(long number)  throws CFException{
		work.setGregorianDateCal800(number);
	}
	

	
	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800(char[] value)  throws CFException {
		work.setGregorianDateCal800(value);
	}
	
	/**
	 * 	Update GregorianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800String(char[] value)  throws CFException{
		work.setGregorianDateCal800(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetAbsoluteDateGregOutCtx clone() {
        GetAbsoluteDateGregOutCtx cloneObj = new GetAbsoluteDateGregOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetAbsoluteDateGregOutCtx getGetAbsoluteDateGregOutCtx() {
            return new GetAbsoluteDateGregOutCtx();
    }
     public class GetAbsoluteDateJulInCtx implements Cloneable {
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
   		return formatedJulDate800.getJulianDate800();
	}


	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() throws CFException {
	     return String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric()  throws CFException{
	    return formatedJulDate800.julianDate800IsNumeric();
	}

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param number
	 */
	public void setJulianDate800(long number)  throws CFException{
		formatedJulDate800.setJulianDate800(number);
	}
	

	
	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value)  throws CFException {
		formatedJulDate800.setJulianDate800(value);
	}
	
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value)  throws CFException{
		formatedJulDate800.setJulianDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyyddd
	 *	@return ip67002Ccyyddd
	 */   
	 public Ip67002Ccyyddd getIp67002Ccyyddd() {
   	return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd();
   }

   /**
	* 	Update Ip67002Ccyyddd with the passed value
	*	@param value
	*/
   public void setIp67002Ccyyddd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(value);
   }   

     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Ccyyddd with another Field
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source);
   }  
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of formatedJulDate800
	 *	@return formatedJulDate800
	 */   
	 public FormatedJulDate800 getFormatedJulDate800() {
   	return formatedJulDate800;
   }



        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetAbsoluteDateJulOutCtx getGetAbsoluteDateJulOutCtx() {
            return new GetAbsoluteDateJulOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetAbsoluteDateJulInCtx clone() {
        GetAbsoluteDateJulInCtx cloneObj = new GetAbsoluteDateJulInCtx();
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetAbsoluteDateJulInCtx getGetAbsoluteDateJulInCtx() {
            return new GetAbsoluteDateJulInCtx();
    }
     public class GetAbsoluteDateJulOutCtx implements Cloneable {
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
   		return formatedJulDate800.getJulianDate800();
	}


	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() throws CFException {
	     return String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric()  throws CFException{
	    return formatedJulDate800.julianDate800IsNumeric();
	}

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param number
	 */
	public void setJulianDate800(long number)  throws CFException{
		formatedJulDate800.setJulianDate800(number);
	}
	

	
	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value)  throws CFException {
		formatedJulDate800.setJulianDate800(value);
	}
	
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value)  throws CFException{
		formatedJulDate800.setJulianDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyyddd
	 *	@return ip67002Ccyyddd
	 */   
	 public Ip67002Ccyyddd getIp67002Ccyyddd() {
   	return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd();
   }

   /**
	* 	Update Ip67002Ccyyddd with the passed value
	*	@param value
	*/
   public void setIp67002Ccyyddd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(value);
   }   

     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Ccyyddd with another Field
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source);
   }  
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of formatedJulDate800
	 *	@return formatedJulDate800
	 */   
	 public FormatedJulDate800 getFormatedJulDate800() {
   	return formatedJulDate800;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetAbsoluteDateJulOutCtx clone() {
        GetAbsoluteDateJulOutCtx cloneObj = new GetAbsoluteDateJulOutCtx();
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetAbsoluteDateJulOutCtx getGetAbsoluteDateJulOutCtx() {
            return new GetAbsoluteDateJulOutCtx();
    }
     public class GetGregFromAbsDtInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of ip67002DateParm
	 *	@return ip67002DateParm
	 */   
	 public Ip67002DateParm getIp67002DateParm() {
   	return ip67002DateParm;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of value98300
	 *	@return value98300
	 */
	public int getValue98300() throws CFException {
   		return work.getValue98300();
	}


	/**
	 *	Returns String value of value98300
	 *	@return value98300
	 */
	public char[]  getValue98300String() throws CFException {
	     return String.valueOf(work.getValue98300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value98300IsNumeric()  throws CFException{
	    return work.value98300IsNumeric();
	}

	/**
	 * 	Update Value98300 with the passed value
	 *	@param number
	 */
	public void setValue98300(int number)  throws CFException{
		work.setValue98300(number);
	}
	

	public void setValue98300(long number)  throws CFException{
	    work.setValue98300(number);
	}
	
	
	/**
	 * 	Update Value98300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue98300(char[] value)  throws CFException {
		work.setValue98300(value);
	}
	
	/**
	 * 	Update Value98300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue98300String(char[] value)  throws CFException{
		work.setValue98300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetGregFromAbsDtOutCtx getGetGregFromAbsDtOutCtx() {
            return new GetGregFromAbsDtOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetGregFromAbsDtInCtx clone() {
        GetGregFromAbsDtInCtx cloneObj = new GetGregFromAbsDtInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetGregFromAbsDtInCtx getGetGregFromAbsDtInCtx() {
            return new GetGregFromAbsDtInCtx();
    }
     public class GetGregFromAbsDtOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of value98300
	 *	@return value98300
	 */
	public int getValue98300() throws CFException {
   		return work.getValue98300();
	}


	/**
	 *	Returns String value of value98300
	 *	@return value98300
	 */
	public char[]  getValue98300String() throws CFException {
	     return String.valueOf(work.getValue98300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value98300IsNumeric()  throws CFException{
	    return work.value98300IsNumeric();
	}

	/**
	 * 	Update Value98300 with the passed value
	 *	@param number
	 */
	public void setValue98300(int number)  throws CFException{
		work.setValue98300(number);
	}
	

	public void setValue98300(long number)  throws CFException{
	    work.setValue98300(number);
	}
	
	
	/**
	 * 	Update Value98300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue98300(char[] value)  throws CFException {
		work.setValue98300(value);
	}
	
	/**
	 * 	Update Value98300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue98300String(char[] value)  throws CFException{
		work.setValue98300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetGregFromAbsDtOutCtx clone() {
        GetGregFromAbsDtOutCtx cloneObj = new GetGregFromAbsDtOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetGregFromAbsDtOutCtx getGetGregFromAbsDtOutCtx() {
            return new GetGregFromAbsDtOutCtx();
    }
     public class GetJulFromAbsDtInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of formatedJulDate800
	 *	@return formatedJulDate800
	 */   
	 public FormatedJulDate800 getFormatedJulDate800() {
   	return formatedJulDate800;
   }


	/**
	 *	Returns the value of ip67002DateParm
	 *	@return ip67002DateParm
	 */   
	 public Ip67002DateParm getIp67002DateParm() {
   	return ip67002DateParm;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of value98300
	 *	@return value98300
	 */
	public int getValue98300() throws CFException {
   		return work.getValue98300();
	}


	/**
	 *	Returns String value of value98300
	 *	@return value98300
	 */
	public char[]  getValue98300String() throws CFException {
	     return String.valueOf(work.getValue98300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value98300IsNumeric()  throws CFException{
	    return work.value98300IsNumeric();
	}

	/**
	 * 	Update Value98300 with the passed value
	 *	@param number
	 */
	public void setValue98300(int number)  throws CFException{
		work.setValue98300(number);
	}
	

	public void setValue98300(long number)  throws CFException{
	    work.setValue98300(number);
	}
	
	
	/**
	 * 	Update Value98300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue98300(char[] value)  throws CFException {
		work.setValue98300(value);
	}
	
	/**
	 * 	Update Value98300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue98300String(char[] value)  throws CFException{
		work.setValue98300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetJulFromAbsDtOutCtx getGetJulFromAbsDtOutCtx() {
            return new GetJulFromAbsDtOutCtx();
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetJulFromAbsDtInCtx clone() {
        GetJulFromAbsDtInCtx cloneObj = new GetJulFromAbsDtInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetJulFromAbsDtInCtx getGetJulFromAbsDtInCtx() {
            return new GetJulFromAbsDtInCtx();
    }
     public class GetJulFromAbsDtOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
   		return formatedJulDate800.getJulianDate800();
	}


	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() throws CFException {
	     return String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric()  throws CFException{
	    return formatedJulDate800.julianDate800IsNumeric();
	}

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param number
	 */
	public void setJulianDate800(long number)  throws CFException{
		formatedJulDate800.setJulianDate800(number);
	}
	

	
	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value)  throws CFException {
		formatedJulDate800.setJulianDate800(value);
	}
	
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value)  throws CFException{
		formatedJulDate800.setJulianDate800(value);
	}	

	/**
	 *	Returns the value of formatedJulDate800
	 *	@return formatedJulDate800
	 */   
	 public FormatedJulDate800 getFormatedJulDate800() {
   	return formatedJulDate800;
   }


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of value98300
	 *	@return value98300
	 */
	public int getValue98300() throws CFException {
   		return work.getValue98300();
	}


	/**
	 *	Returns String value of value98300
	 *	@return value98300
	 */
	public char[]  getValue98300String() throws CFException {
	     return String.valueOf(work.getValue98300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value98300IsNumeric()  throws CFException{
	    return work.value98300IsNumeric();
	}

	/**
	 * 	Update Value98300 with the passed value
	 *	@param number
	 */
	public void setValue98300(int number)  throws CFException{
		work.setValue98300(number);
	}
	

	public void setValue98300(long number)  throws CFException{
	    work.setValue98300(number);
	}
	
	
	/**
	 * 	Update Value98300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue98300(char[] value)  throws CFException {
		work.setValue98300(value);
	}
	
	/**
	 * 	Update Value98300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue98300String(char[] value)  throws CFException{
		work.setValue98300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetJulFromAbsDtOutCtx clone() {
        GetJulFromAbsDtOutCtx cloneObj = new GetJulFromAbsDtOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetJulFromAbsDtOutCtx getGetJulFromAbsDtOutCtx() {
            return new GetJulFromAbsDtOutCtx();
    }
     public class GetUtcDtTmInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public int getIp67002Hh() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Hh();
	}


	/**
	 *	Returns String value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public char[]  getIp67002HhString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002HhString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002HhIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002HhIsNumeric();
	}

	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param number
	 */
	public void setIp67002Hh(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	

	public void setIp67002Hh(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	
	
	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Hh(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}
	
	/**
	 * 	Update Ip67002Hh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002HhString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}	

	/**
	 *	Returns the value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public int getIp67002UtcOffsetMm() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetMm();
	}


	/**
	 *	Returns String value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public char[]  getIp67002UtcOffsetMmString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetMmIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().ip67002UtcOffsetMmIsNumeric();
	}

	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *	@param number
	 */
	public void setIp67002UtcOffsetMm(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(number);
	}
	

	public void setIp67002UtcOffsetMm(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(number);
	}
	
	
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMm(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(value);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMmString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(value);
	}	

	/**
	 *	Returns the value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public int getIp67002Mth() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Mth();
	}


	/**
	 *	Returns String value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public char[]  getIp67002MthString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002MthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002MthIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002MthIsNumeric();
	}

	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param number
	 */
	public void setIp67002Mth(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	

	public void setIp67002Mth(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	
	
	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Mth(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}
	
	/**
	 * 	Update Ip67002Mth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002MthString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}	

	/**
	 *	Returns the value of ip67002UtcOffsetSign
	 *	@return ip67002UtcOffsetSign
	 */
   public char[] getIp67002UtcOffsetSign() throws CFException  {              
   		return ip67002DateParm.getIp67002UtcOffsetSign();
   }

  
	/**
	*  set variable ip67002UtcOffsetSign
	*  @param value
	**/
   public void setIp67002UtcOffsetSign(char[] value) throws CFException {
      ip67002DateParm.setIp67002UtcOffsetSign(value);
   } 

     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex) throws CFException {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex);
   	
   }
   
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002UtcOffsetSign with another Field
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source) {
      ip67002DateParm.setIp67002UtcOffsetSign(source);
   }  
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source, int sourceIndex,int sourceLen) {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public int getIp67002UtcOffsetHh() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetHh();
	}


	/**
	 *	Returns String value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public char[]  getIp67002UtcOffsetHhString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetHhString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetHhIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().ip67002UtcOffsetHhIsNumeric();
	}

	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *	@param number
	 */
	public void setIp67002UtcOffsetHh(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(number);
	}
	

	public void setIp67002UtcOffsetHh(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(number);
	}
	
	
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHh(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(value);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHhString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetUtcDtTmOutCtx getGetUtcDtTmOutCtx() {
            return new GetUtcDtTmOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetUtcDtTmInCtx clone() {
        GetUtcDtTmInCtx cloneObj = new GetUtcDtTmInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetUtcDtTmInCtx getGetUtcDtTmInCtx() {
            return new GetUtcDtTmInCtx();
    }
     public class GetUtcDtTmOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of workHr800
	 *	@return workHr800
	 */
	public int getWorkHr800() throws CFException {        
   		return work.getWorkHr800();
	}
	
	/**
	 * 	Update WorkHr800 with the passed value
	 *	@param number
	 */
	public void setWorkHr800(int number)  throws CFException{
		work.setWorkHr800(number);
	}


	public void setWorkHr800(long number)  throws CFException{
		work.setWorkHr800((int)number);
	}


	/**
	 *	Returns the value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public int getIp67002Hh() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Hh();
	}


	/**
	 *	Returns String value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public char[]  getIp67002HhString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002HhString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002HhIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002HhIsNumeric();
	}

	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param number
	 */
	public void setIp67002Hh(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	

	public void setIp67002Hh(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	
	
	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Hh(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}
	
	/**
	 * 	Update Ip67002Hh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002HhString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}	

	/**
	 *	Returns the value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public int getIp67002UtcOffsetMm() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetMm();
	}


	/**
	 *	Returns String value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public char[]  getIp67002UtcOffsetMmString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetMmIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().ip67002UtcOffsetMmIsNumeric();
	}

	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *	@param number
	 */
	public void setIp67002UtcOffsetMm(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(number);
	}
	

	public void setIp67002UtcOffsetMm(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(number);
	}
	
	
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMm(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(value);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMmString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(value);
	}	

	/**
	 *	Returns the value of workMin800
	 *	@return workMin800
	 */
	public int getWorkMin800() throws CFException {        
   		return work.getWorkMin800();
	}
	
	/**
	 * 	Update WorkMin800 with the passed value
	 *	@param number
	 */
	public void setWorkMin800(int number)  throws CFException{
		work.setWorkMin800(number);
	}


	public void setWorkMin800(long number)  throws CFException{
		work.setWorkMin800((int)number);
	}


	/**
	 *	Returns the value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public int getIp67002Mth() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Mth();
	}


	/**
	 *	Returns String value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public char[]  getIp67002MthString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002MthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002MthIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002MthIsNumeric();
	}

	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param number
	 */
	public void setIp67002Mth(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	

	public void setIp67002Mth(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	
	
	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Mth(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}
	
	/**
	 * 	Update Ip67002Mth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002MthString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}	

	/**
	 *	Returns the value of workOffsetMin800
	 *	@return workOffsetMin800
	 */
	public int getWorkOffsetMin800() throws CFException {        
   		return work.getWorkOffsetMin800();
	}
	
	/**
	 * 	Update WorkOffsetMin800 with the passed value
	 *	@param number
	 */
	public void setWorkOffsetMin800(int number)  throws CFException{
		work.setWorkOffsetMin800(number);
	}


	public void setWorkOffsetMin800(long number)  throws CFException{
		work.setWorkOffsetMin800((int)number);
	}


	/**
	 *	Returns the value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public int getIp67002UtcOffsetHh() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetHh();
	}


	/**
	 *	Returns String value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public char[]  getIp67002UtcOffsetHhString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetHhString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetHhIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().ip67002UtcOffsetHhIsNumeric();
	}

	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *	@param number
	 */
	public void setIp67002UtcOffsetHh(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(number);
	}
	

	public void setIp67002UtcOffsetHh(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(number);
	}
	
	
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHh(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(value);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHhString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(value);
	}	

	/**
	 *	Returns the value of workOffsetHr800
	 *	@return workOffsetHr800
	 */
	public int getWorkOffsetHr800() throws CFException {        
   		return work.getWorkOffsetHr800();
	}
	
	/**
	 * 	Update WorkOffsetHr800 with the passed value
	 *	@param number
	 */
	public void setWorkOffsetHr800(int number)  throws CFException{
		work.setWorkOffsetHr800(number);
	}


	public void setWorkOffsetHr800(long number)  throws CFException{
		work.setWorkOffsetHr800((int)number);
	}



        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetUtcDtTmOutCtx clone() {
        GetUtcDtTmOutCtx cloneObj = new GetUtcDtTmOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetUtcDtTmOutCtx getGetUtcDtTmOutCtx() {
            return new GetUtcDtTmOutCtx();
    }
     public class CalculateUtcInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public int getIp67002Hh() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Hh();
	}


	/**
	 *	Returns String value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public char[]  getIp67002HhString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002HhString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002HhIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002HhIsNumeric();
	}

	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param number
	 */
	public void setIp67002Hh(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	

	public void setIp67002Hh(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	
	
	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Hh(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}
	
	/**
	 * 	Update Ip67002Hh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002HhString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}	

	/**
	 *	Returns the value of workMin800
	 *	@return workMin800
	 */
	public int getWorkMin800() throws CFException {        
   		return work.getWorkMin800();
	}
	
	/**
	 * 	Update WorkMin800 with the passed value
	 *	@param number
	 */
	public void setWorkMin800(int number)  throws CFException{
		work.setWorkMin800(number);
	}


	public void setWorkMin800(long number)  throws CFException{
		work.setWorkMin800((int)number);
	}


	/**
	 *	Returns the value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public int getIp67002Mth() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Mth();
	}


	/**
	 *	Returns String value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public char[]  getIp67002MthString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002MthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002MthIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002MthIsNumeric();
	}

	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param number
	 */
	public void setIp67002Mth(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	

	public void setIp67002Mth(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	
	
	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Mth(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}
	
	/**
	 * 	Update Ip67002Mth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002MthString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}	

	/**
	 *	Returns the value of workOffsetMin800
	 *	@return workOffsetMin800
	 */
	public int getWorkOffsetMin800() throws CFException {        
   		return work.getWorkOffsetMin800();
	}
	
	/**
	 * 	Update WorkOffsetMin800 with the passed value
	 *	@param number
	 */
	public void setWorkOffsetMin800(int number)  throws CFException{
		work.setWorkOffsetMin800(number);
	}


	public void setWorkOffsetMin800(long number)  throws CFException{
		work.setWorkOffsetMin800((int)number);
	}


	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of workOffsetHr800
	 *	@return workOffsetHr800
	 */
	public int getWorkOffsetHr800() throws CFException {        
   		return work.getWorkOffsetHr800();
	}
	
	/**
	 * 	Update WorkOffsetHr800 with the passed value
	 *	@param number
	 */
	public void setWorkOffsetHr800(int number)  throws CFException{
		work.setWorkOffsetHr800(number);
	}


	public void setWorkOffsetHr800(long number)  throws CFException{
		work.setWorkOffsetHr800((int)number);
	}



        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public CalculateUtcOutCtx getCalculateUtcOutCtx() {
            return new CalculateUtcOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public CalculateUtcInCtx clone() {
        CalculateUtcInCtx cloneObj = new CalculateUtcInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public CalculateUtcInCtx getCalculateUtcInCtx() {
            return new CalculateUtcInCtx();
    }
     public class CalculateUtcOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public int getIp67002Hh() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Hh();
	}


	/**
	 *	Returns String value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public char[]  getIp67002HhString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002HhString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002HhIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002HhIsNumeric();
	}

	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param number
	 */
	public void setIp67002Hh(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	

	public void setIp67002Hh(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(number);
	}
	
	
	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Hh(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}
	
	/**
	 * 	Update Ip67002Hh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002HhString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Hh(value);
	}	

	/**
	 *	Returns the value of workMin800
	 *	@return workMin800
	 */
	public int getWorkMin800() throws CFException {        
   		return work.getWorkMin800();
	}
	
	/**
	 * 	Update WorkMin800 with the passed value
	 *	@param number
	 */
	public void setWorkMin800(int number)  throws CFException{
		work.setWorkMin800(number);
	}


	public void setWorkMin800(long number)  throws CFException{
		work.setWorkMin800((int)number);
	}


	/**
	 *	Returns the value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public int getIp67002Mth() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002Mth();
	}


	/**
	 *	Returns String value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public char[]  getIp67002MthString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().getIp67002MthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002MthIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().ip67002MthIsNumeric();
	}

	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param number
	 */
	public void setIp67002Mth(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	

	public void setIp67002Mth(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(number);
	}
	
	
	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Mth(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}
	
	/**
	 * 	Update Ip67002Mth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002MthString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002Hhmm().setIp67002Mth(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public CalculateUtcOutCtx clone() {
        CalculateUtcOutCtx cloneObj = new CalculateUtcOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public CalculateUtcOutCtx getCalculateUtcOutCtx() {
            return new CalculateUtcOutCtx();
    }
     public class GetAddonGregJulDowInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public int getIp67002DayOfWeek() throws CFException {
   		return ip67002DateParm.getIp67002DayOfWeek();
	}


	/**
	 *	Returns String value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public char[]  getIp67002DayOfWeekString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DayOfWeekString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DayOfWeekIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DayOfWeekIsNumeric();
	}

	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param number
	 */
	public void setIp67002DayOfWeek(int number)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(number);
	}
	

	public void setIp67002DayOfWeek(long number)  throws CFException{
	    ip67002DateParm.setIp67002DayOfWeek(number);
	}
	
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeek(char[] value)  throws CFException {
		ip67002DateParm.setIp67002DayOfWeek(value);
	}
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeekString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of ip67002JulianDaysSpan
	 *	@return ip67002JulianDaysSpan
	 */
	public short getIp67002JulianDaysSpan() throws CFException {        
   		return ip67002DateParm.getIp67002JulianDaysSpan();
	}
	
	/**
	 * 	Update Ip67002JulianDaysSpan with the passed value
	 *	@param number
	 */
	public void setIp67002JulianDaysSpan(short number)  throws CFException{
		ip67002DateParm.setIp67002JulianDaysSpan(number);
	}

	public void setIp67002JulianDaysSpan(int number)  throws CFException{
		ip67002DateParm.setIp67002JulianDaysSpan((short)number);
	}

	public void setIp67002JulianDaysSpan(long number)  throws CFException{
		ip67002DateParm.setIp67002JulianDaysSpan((short)number);
	}



	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
   		return work.getValue7300();
	}


	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() throws CFException {
	     return String.valueOf(work.getValue7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric()  throws CFException{
	    return work.value7300IsNumeric();
	}

	/**
	 * 	Update Value7300 with the passed value
	 *	@param number
	 */
	public void setValue7300(int number)  throws CFException{
		work.setValue7300(number);
	}
	

	public void setValue7300(long number)  throws CFException{
	    work.setValue7300(number);
	}
	
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value)  throws CFException {
		work.setValue7300(value);
	}
	
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value)  throws CFException{
		work.setValue7300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public GetAddonGregJulDowOutCtx getGetAddonGregJulDowOutCtx() {
            return new GetAddonGregJulDowOutCtx();
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetAddonGregJulDowInCtx clone() {
        GetAddonGregJulDowInCtx cloneObj = new GetAddonGregJulDowInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetAddonGregJulDowInCtx getGetAddonGregJulDowInCtx() {
            return new GetAddonGregJulDowInCtx();
    }
     public class GetAddonGregJulDowOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     FormatedJulDate800 formatedJulDate800 = Ip670010Ctx.this.getFormatedJulDate800();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
   		return work.getIntegerDate800();
	}


	/**
	 *	Returns String value of integerDate800
	 *	@return integerDate800
	 */
	public char[]  getIntegerDate800String() throws CFException {
	     return String.valueOf(work.getIntegerDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean integerDate800IsNumeric()  throws CFException{
	    return work.integerDate800IsNumeric();
	}

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param number
	 */
	public void setIntegerDate800(long number)  throws CFException{
		work.setIntegerDate800(number);
	}
	

	
	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value)  throws CFException {
		work.setIntegerDate800(value);
	}
	
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value)  throws CFException{
		work.setIntegerDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Date2
	 *	@return ip67002Date2
	 */
	public long getIp67002Date2() throws CFException {
   		return ip67002DateParm.getIp67002Date2();
	}


	/**
	 *	Returns String value of ip67002Date2
	 *	@return ip67002Date2
	 */
	public char[]  getIp67002Date2String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002Date2IsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002Date2IsNumeric();
	}

	/**
	 * 	Update Ip67002Date2 with the passed value
	 *	@param number
	 */
	public void setIp67002Date2(long number)  throws CFException{
		ip67002DateParm.setIp67002Date2(number);
	}
	

	
	/**
	 * 	Update Ip67002Date2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date2(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date2(value);
	}
	
	/**
	 * 	Update Ip67002Date2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Date2String(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date2(value);
	}	

	/**
	 *	Returns the value of julianDate800
	 *	@return julianDate800
	 */
	public long getJulianDate800() throws CFException {
   		return formatedJulDate800.getJulianDate800();
	}


	/**
	 *	Returns String value of julianDate800
	 *	@return julianDate800
	 */
	public char[]  getJulianDate800String() throws CFException {
	     return String.valueOf(formatedJulDate800.getJulianDate800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean julianDate800IsNumeric()  throws CFException{
	    return formatedJulDate800.julianDate800IsNumeric();
	}

	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param number
	 */
	public void setJulianDate800(long number)  throws CFException{
		formatedJulDate800.setJulianDate800(number);
	}
	

	
	/**
	 * 	Update JulianDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDate800(char[] value)  throws CFException {
		formatedJulDate800.setJulianDate800(value);
	}
	
	/**
	 * 	Update JulianDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDate800String(char[] value)  throws CFException{
		formatedJulDate800.setJulianDate800(value);
	}	

	/**
	 *	Returns the value of ip67002Ccyyddd
	 *	@return ip67002Ccyyddd
	 */   
	 public Ip67002Ccyyddd getIp67002Ccyyddd() {
   	return ip67002DateParm.getIp67002DateRedefined01().getIp67002Ccyyddd();
   }

   /**
	* 	Update Ip67002Ccyyddd with the passed value
	*	@param value
	*/
   public void setIp67002Ccyyddd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(value);
   }   

     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Ccyyddd with another Field
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source);
   }  
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Ccyyddd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Ccyyddd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002DateRedefined01().setIp67002Ccyyddd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public int getIp67002DayOfWeek() throws CFException {
   		return ip67002DateParm.getIp67002DayOfWeek();
	}


	/**
	 *	Returns String value of ip67002DayOfWeek
	 *	@return ip67002DayOfWeek
	 */
	public char[]  getIp67002DayOfWeekString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DayOfWeekString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DayOfWeekIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DayOfWeekIsNumeric();
	}

	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param number
	 */
	public void setIp67002DayOfWeek(int number)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(number);
	}
	

	public void setIp67002DayOfWeek(long number)  throws CFException{
	    ip67002DateParm.setIp67002DayOfWeek(number);
	}
	
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeek(char[] value)  throws CFException {
		ip67002DateParm.setIp67002DayOfWeek(value);
	}
	
	/**
	 * 	Update Ip67002DayOfWeek with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DayOfWeekString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002DayOfWeek(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
   		return work.getValue7300();
	}


	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() throws CFException {
	     return String.valueOf(work.getValue7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric()  throws CFException{
	    return work.value7300IsNumeric();
	}

	/**
	 * 	Update Value7300 with the passed value
	 *	@param number
	 */
	public void setValue7300(int number)  throws CFException{
		work.setValue7300(number);
	}
	

	public void setValue7300(long number)  throws CFException{
	    work.setValue7300(number);
	}
	
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value)  throws CFException {
		work.setValue7300(value);
	}
	
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value)  throws CFException{
		work.setValue7300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += formatedJulDate800.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public GetAddonGregJulDowOutCtx clone() {
        GetAddonGregJulDowOutCtx cloneObj = new GetAddonGregJulDowOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.formatedJulDate800 = new FormatedJulDate800();
        cloneObj.formatedJulDate800.set(formatedJulDate800.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public GetAddonGregJulDowOutCtx getGetAddonGregJulDowOutCtx() {
            return new GetAddonGregJulDowOutCtx();
    }
     public class ValidateDateInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	

	/**
	 *	Returns the value of ip67002Yymmdd
	 *	@return ip67002Yymmdd
	 */
   public char[] getIp67002Yymmdd() throws CFException  {              
   		return ip67002DateParm.getIp67002DateRedefined02().getIp67002Yymmdd();
   }

  
	/**
	*  set variable ip67002Yymmdd
	*  @param value
	**/
   public void setIp67002Yymmdd(char[] value) throws CFException {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(value);
   } 

     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex) throws CFException {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex);
   	
   }
   
   public void setIp67002Yymmdd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002Yymmdd with another Field
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source);
   }  
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip67002Yymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002Yymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.getIp67002DateRedefined02().setIp67002Yymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public ValidateDateOutCtx getValidateDateOutCtx() {
            return new ValidateDateOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ValidateDateInCtx clone() {
        ValidateDateInCtx cloneObj = new ValidateDateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateDateInCtx getValidateDateInCtx() {
            return new ValidateDateInCtx();
    }
     public class ValidateDateOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ValidateDateOutCtx clone() {
        ValidateDateOutCtx cloneObj = new ValidateDateOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateDateOutCtx getValidateDateOutCtx() {
            return new ValidateDateOutCtx();
    }
     public class ValidateUtcOffsetInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public int getIp67002UtcOffsetMm() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetMm();
	}


	/**
	 *	Returns String value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public char[]  getIp67002UtcOffsetMmString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetMmIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().ip67002UtcOffsetMmIsNumeric();
	}

	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *	@param number
	 */
	public void setIp67002UtcOffsetMm(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(number);
	}
	

	public void setIp67002UtcOffsetMm(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(number);
	}
	
	
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMm(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(value);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMmString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetMm(value);
	}	

	/**
	 *	Returns the value of ip67002UtcOffsetHhmm
	 *	@return ip67002UtcOffsetHhmm
	 */   
	 public Ip67002UtcOffsetHhmm getIp67002UtcOffsetHhmm() {
   	return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm();
   }

   /**
	* 	Update Ip67002UtcOffsetHhmm with the passed value
	*	@param value
	*/
   public void setIp67002UtcOffsetHhmm(char[] value) throws CFException {
      ip67002DateParm.getIp67002Date2Redefined01().setIp67002UtcOffsetHhmm(value);
   }   

     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip67002DateParm.getIp67002Date2Redefined01().setIp67002UtcOffsetHhmm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002Date2Redefined01().setIp67002UtcOffsetHhmm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002UtcOffsetHhmm with another Field
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(Field source) {
   	ip67002DateParm.getIp67002Date2Redefined01().setIp67002UtcOffsetHhmm(source);
   }  
   
     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(Field source, int sourceIndex,int sourceLen) {
   	ip67002DateParm.getIp67002Date2Redefined01().setIp67002UtcOffsetHhmm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002UtcOffsetHhmm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetHhmm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip67002DateParm.getIp67002Date2Redefined01().setIp67002UtcOffsetHhmm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip67002UtcOffsetSign
	 *	@return ip67002UtcOffsetSign
	 */
   public char[] getIp67002UtcOffsetSign() throws CFException  {              
   		return ip67002DateParm.getIp67002UtcOffsetSign();
   }

  
	/**
	*  set variable ip67002UtcOffsetSign
	*  @param value
	**/
   public void setIp67002UtcOffsetSign(char[] value) throws CFException {
      ip67002DateParm.setIp67002UtcOffsetSign(value);
   } 

     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex) throws CFException {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex);
   	
   }
   
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip67002UtcOffsetSign with another Field
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source) {
      ip67002DateParm.setIp67002UtcOffsetSign(source);
   }  
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source, int sourceIndex,int sourceLen) {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip67002UtcOffsetSign 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp67002UtcOffsetSign(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip67002DateParm.setIp67002UtcOffsetSign(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of value97300
	 *	@return value97300
	 */
	public int getValue97300() throws CFException {
   		return work.getValue97300();
	}


	/**
	 *	Returns String value of value97300
	 *	@return value97300
	 */
	public char[]  getValue97300String() throws CFException {
	     return String.valueOf(work.getValue97300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value97300IsNumeric()  throws CFException{
	    return work.value97300IsNumeric();
	}

	/**
	 * 	Update Value97300 with the passed value
	 *	@param number
	 */
	public void setValue97300(int number)  throws CFException{
		work.setValue97300(number);
	}
	

	public void setValue97300(long number)  throws CFException{
	    work.setValue97300(number);
	}
	
	
	/**
	 * 	Update Value97300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue97300(char[] value)  throws CFException {
		work.setValue97300(value);
	}
	
	/**
	 * 	Update Value97300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue97300String(char[] value)  throws CFException{
		work.setValue97300(value);
	}	

	/**
	 *	Returns the value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public int getIp67002UtcOffsetHh() throws CFException {
   		return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetHh();
	}


	/**
	 *	Returns String value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public char[]  getIp67002UtcOffsetHhString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().getIp67002UtcOffsetHhString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetHhIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().ip67002UtcOffsetHhIsNumeric();
	}

	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *	@param number
	 */
	public void setIp67002UtcOffsetHh(int number)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(number);
	}
	

	public void setIp67002UtcOffsetHh(long number)  throws CFException{
	    ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(number);
	}
	
	
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHh(char[] value)  throws CFException {
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(value);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHhString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002Date2Redefined01().getIp67002UtcOffsetHhmm().setIp67002UtcOffsetHh(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public ValidateUtcOffsetOutCtx getValidateUtcOffsetOutCtx() {
            return new ValidateUtcOffsetOutCtx();
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ValidateUtcOffsetInCtx clone() {
        ValidateUtcOffsetInCtx cloneObj = new ValidateUtcOffsetInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateUtcOffsetInCtx getValidateUtcOffsetInCtx() {
            return new ValidateUtcOffsetInCtx();
    }
     public class ValidateUtcOffsetOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of value97300
	 *	@return value97300
	 */
	public int getValue97300() throws CFException {
   		return work.getValue97300();
	}


	/**
	 *	Returns String value of value97300
	 *	@return value97300
	 */
	public char[]  getValue97300String() throws CFException {
	     return String.valueOf(work.getValue97300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value97300IsNumeric()  throws CFException{
	    return work.value97300IsNumeric();
	}

	/**
	 * 	Update Value97300 with the passed value
	 *	@param number
	 */
	public void setValue97300(int number)  throws CFException{
		work.setValue97300(number);
	}
	

	public void setValue97300(long number)  throws CFException{
	    work.setValue97300(number);
	}
	
	
	/**
	 * 	Update Value97300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue97300(char[] value)  throws CFException {
		work.setValue97300(value);
	}
	
	/**
	 * 	Update Value97300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue97300String(char[] value)  throws CFException{
		work.setValue97300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ValidateUtcOffsetOutCtx clone() {
        ValidateUtcOffsetOutCtx cloneObj = new ValidateUtcOffsetOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateUtcOffsetOutCtx getValidateUtcOffsetOutCtx() {
            return new ValidateUtcOffsetOutCtx();
    }
     public class ValidateMonthInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of ctcMm802
	 *	@return ctcMm802
	 */
	public int getCtcMm802() throws CFException {
   		return ctcDate802.getCtcMmdd802().getCtcMm802();
	}


	/**
	 *	Returns String value of ctcMm802
	 *	@return ctcMm802
	 */
	public char[]  getCtcMm802String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcMmdd802().getCtcMm802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcMm802IsNumeric()  throws CFException{
	    return ctcDate802.getCtcMmdd802().ctcMm802IsNumeric();
	}

	/**
	 * 	Update CtcMm802 with the passed value
	 *	@param number
	 */
	public void setCtcMm802(int number)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcMm802(number);
	}
	

	public void setCtcMm802(long number)  throws CFException{
	    ctcDate802.getCtcMmdd802().setCtcMm802(number);
	}
	
	
	/**
	 * 	Update CtcMm802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcMm802(char[] value)  throws CFException {
		ctcDate802.getCtcMmdd802().setCtcMm802(value);
	}
	
	/**
	 * 	Update CtcMm802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcMm802String(char[] value)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcMm802(value);
	}	

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public ValidateMonthOutCtx getValidateMonthOutCtx() {
            return new ValidateMonthOutCtx();
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public ValidateMonthInCtx clone() {
        ValidateMonthInCtx cloneObj = new ValidateMonthInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public ValidateMonthInCtx getValidateMonthInCtx() {
            return new ValidateMonthInCtx();
    }
     public class ValidateMonthOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of ctcMm802
	 *	@return ctcMm802
	 */
	public int getCtcMm802() throws CFException {
   		return ctcDate802.getCtcMmdd802().getCtcMm802();
	}


	/**
	 *	Returns String value of ctcMm802
	 *	@return ctcMm802
	 */
	public char[]  getCtcMm802String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcMmdd802().getCtcMm802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcMm802IsNumeric()  throws CFException{
	    return ctcDate802.getCtcMmdd802().ctcMm802IsNumeric();
	}

	/**
	 * 	Update CtcMm802 with the passed value
	 *	@param number
	 */
	public void setCtcMm802(int number)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcMm802(number);
	}
	

	public void setCtcMm802(long number)  throws CFException{
	    ctcDate802.getCtcMmdd802().setCtcMm802(number);
	}
	
	
	/**
	 * 	Update CtcMm802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcMm802(char[] value)  throws CFException {
		ctcDate802.getCtcMmdd802().setCtcMm802(value);
	}
	
	/**
	 * 	Update CtcMm802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcMm802String(char[] value)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcMm802(value);
	}	

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	

	/**
	 *	Test condition 1 THRU 12 for isValidMonth88800()
	 *	@return  Returns true if isValidMonth88800() is 1 THRU 12
	 */
   public boolean isValidMonth88800() throws CFException {
      return work.isValidMonth88800();
   }

	/**
	*  set values 1 THRU 12
	*/
   	public void setValidMonth88800True()  throws CFException{  			
    	work.setValidMonth88800True();
   	}
	/**
	 *	Returns the value of validateMonth800
	 *	@return validateMonth800
	 */
	public int getValidateMonth800() throws CFException {
   		return work.getValidateMonth800();
	}


	/**
	 *	Returns String value of validateMonth800
	 *	@return validateMonth800
	 */
	public char[]  getValidateMonth800String() throws CFException {
	     return String.valueOf(work.getValidateMonth800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean validateMonth800IsNumeric()  throws CFException{
	    return work.validateMonth800IsNumeric();
	}

	/**
	 * 	Update ValidateMonth800 with the passed value
	 *	@param number
	 */
	public void setValidateMonth800(int number)  throws CFException{
		work.setValidateMonth800(number);
	}
	

	public void setValidateMonth800(long number)  throws CFException{
	    work.setValidateMonth800(number);
	}
	
	
	/**
	 * 	Update ValidateMonth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValidateMonth800(char[] value)  throws CFException {
		work.setValidateMonth800(value);
	}
	
	/**
	 * 	Update ValidateMonth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValidateMonth800String(char[] value)  throws CFException{
		work.setValidateMonth800(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public ValidateMonthOutCtx clone() {
        ValidateMonthOutCtx cloneObj = new ValidateMonthOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public ValidateMonthOutCtx getValidateMonthOutCtx() {
            return new ValidateMonthOutCtx();
    }
     public class CheckDaysOfMonthInCtx implements Cloneable {
     DaysOfMonthsGroup300 daysOfMonthsGroup300 = Ip670010Ctx.this.getDaysOfMonthsGroup300();
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of ctcMmdd802
	 *	@return ctcMmdd802
	 */   
	 public CtcMmdd802 getCtcMmdd802() {
   	return ctcDate802.getCtcMmdd802();
   }

   /**
	* 	Update CtcMmdd802 with the passed value
	*	@param value
	*/
   public void setCtcMmdd802(char[] value) throws CFException {
      ctcDate802.setCtcMmdd802(value);
   }   

     /**
	 * 	Update CtcMmdd802 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCtcMmdd802(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ctcDate802.setCtcMmdd802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CtcMmdd802 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCtcMmdd802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ctcDate802.setCtcMmdd802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CtcMmdd802 with another Field
	 *	@param value
	 */
   public void setCtcMmdd802(Field source) {
   	ctcDate802.setCtcMmdd802(source);
   }  
   
     /**
	 * 	Update CtcMmdd802 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCtcMmdd802(Field source, int sourceIndex,int sourceLen) {
   	ctcDate802.setCtcMmdd802(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CtcMmdd802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCtcMmdd802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ctcDate802.setCtcMmdd802(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ctcMm802
	 *	@return ctcMm802
	 */
	public int getCtcMm802() throws CFException {
   		return ctcDate802.getCtcMmdd802().getCtcMm802();
	}


	/**
	 *	Returns String value of ctcMm802
	 *	@return ctcMm802
	 */
	public char[]  getCtcMm802String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcMmdd802().getCtcMm802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcMm802IsNumeric()  throws CFException{
	    return ctcDate802.getCtcMmdd802().ctcMm802IsNumeric();
	}

	/**
	 * 	Update CtcMm802 with the passed value
	 *	@param number
	 */
	public void setCtcMm802(int number)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcMm802(number);
	}
	

	public void setCtcMm802(long number)  throws CFException{
	    ctcDate802.getCtcMmdd802().setCtcMm802(number);
	}
	
	
	/**
	 * 	Update CtcMm802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcMm802(char[] value)  throws CFException {
		ctcDate802.getCtcMmdd802().setCtcMm802(value);
	}
	
	/**
	 * 	Update CtcMm802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcMm802String(char[] value)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcMm802(value);
	}	

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	

	/**
	 *	Returns the value of value2300
	 *	@return value2300
	 */
	public int getValue2300() throws CFException {
   		return work.getValue2300();
	}


	/**
	 *	Returns String value of value2300
	 *	@return value2300
	 */
	public char[]  getValue2300String() throws CFException {
	     return String.valueOf(work.getValue2300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value2300IsNumeric()  throws CFException{
	    return work.value2300IsNumeric();
	}

	/**
	 * 	Update Value2300 with the passed value
	 *	@param number
	 */
	public void setValue2300(int number)  throws CFException{
		work.setValue2300(number);
	}
	

	public void setValue2300(long number)  throws CFException{
	    work.setValue2300(number);
	}
	
	
	/**
	 * 	Update Value2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue2300(char[] value)  throws CFException {
		work.setValue2300(value);
	}
	
	/**
	 * 	Update Value2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue2300String(char[] value)  throws CFException{
		work.setValue2300(value);
	}	

	/**
	 *	Returns the value of daysOfAMonth300
	 *	@return daysOfAMonth300
	 */
   public char[] getDaysOfAMonth300(int index) throws CFException  {              
   		return daysOfMonthsGroup300.getMaxDaysOfMonth300().getDaysOfAMonth300(index);
   }

  
	/**
	*  set variable daysOfAMonth300
	*  @param value
	**/
   public void setDaysOfAMonth300(int index,char[] value) throws CFException {
      daysOfMonthsGroup300.getMaxDaysOfMonth300().setDaysOfAMonth300((index),value);
   } 

	/**
	 *	Returns the value of ctcDd802
	 *	@return ctcDd802
	 */
	public int getCtcDd802() throws CFException {
   		return ctcDate802.getCtcMmdd802().getCtcDd802();
	}


	/**
	 *	Returns String value of ctcDd802
	 *	@return ctcDd802
	 */
	public char[]  getCtcDd802String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcMmdd802().getCtcDd802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcDd802IsNumeric()  throws CFException{
	    return ctcDate802.getCtcMmdd802().ctcDd802IsNumeric();
	}

	/**
	 * 	Update CtcDd802 with the passed value
	 *	@param number
	 */
	public void setCtcDd802(int number)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcDd802(number);
	}
	

	public void setCtcDd802(long number)  throws CFException{
	    ctcDate802.getCtcMmdd802().setCtcDd802(number);
	}
	
	
	/**
	 * 	Update CtcDd802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcDd802(char[] value)  throws CFException {
		ctcDate802.getCtcMmdd802().setCtcDd802(value);
	}
	
	/**
	 * 	Update CtcDd802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcDd802String(char[] value)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcDd802(value);
	}	

	/**
	 *	Returns the value of validateMonth800
	 *	@return validateMonth800
	 */
	public int getValidateMonth800() throws CFException {
   		return work.getValidateMonth800();
	}


	/**
	 *	Returns String value of validateMonth800
	 *	@return validateMonth800
	 */
	public char[]  getValidateMonth800String() throws CFException {
	     return String.valueOf(work.getValidateMonth800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean validateMonth800IsNumeric()  throws CFException{
	    return work.validateMonth800IsNumeric();
	}

	/**
	 * 	Update ValidateMonth800 with the passed value
	 *	@param number
	 */
	public void setValidateMonth800(int number)  throws CFException{
		work.setValidateMonth800(number);
	}
	

	public void setValidateMonth800(long number)  throws CFException{
	    work.setValidateMonth800(number);
	}
	
	
	/**
	 * 	Update ValidateMonth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValidateMonth800(char[] value)  throws CFException {
		work.setValidateMonth800(value);
	}
	
	/**
	 * 	Update ValidateMonth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValidateMonth800String(char[] value)  throws CFException{
		work.setValidateMonth800(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public CheckDaysOfMonthOutCtx getCheckDaysOfMonthOutCtx() {
            return new CheckDaysOfMonthOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += daysOfMonthsGroup300.hashCode();
        str += work.hashCode();
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckDaysOfMonthInCtx clone() {
        CheckDaysOfMonthInCtx cloneObj = new CheckDaysOfMonthInCtx();
        cloneObj.daysOfMonthsGroup300 = new DaysOfMonthsGroup300();
        cloneObj.daysOfMonthsGroup300.set(daysOfMonthsGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckDaysOfMonthInCtx getCheckDaysOfMonthInCtx() {
            return new CheckDaysOfMonthInCtx();
    }
     public class CheckDaysOfMonthOutCtx implements Cloneable {
     DaysOfMonthsGroup300 daysOfMonthsGroup300 = Ip670010Ctx.this.getDaysOfMonthsGroup300();
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += daysOfMonthsGroup300.hashCode();
        str += work.hashCode();
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckDaysOfMonthOutCtx clone() {
        CheckDaysOfMonthOutCtx cloneObj = new CheckDaysOfMonthOutCtx();
        cloneObj.daysOfMonthsGroup300 = new DaysOfMonthsGroup300();
        cloneObj.daysOfMonthsGroup300.set(daysOfMonthsGroup300.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckDaysOfMonthOutCtx getCheckDaysOfMonthOutCtx() {
            return new CheckDaysOfMonthOutCtx();
    }
     public class CheckForLeapyearInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of workRemainder801
	 *	@return workRemainder801
	 */
	public int getWorkRemainder801() throws CFException {
   		return work.getWorkRemainder801();
	}


	/**
	 *	Returns String value of workRemainder801
	 *	@return workRemainder801
	 */
	public char[]  getWorkRemainder801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder801IsNumeric()  throws CFException{
	    return work.workRemainder801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder801(int number)  throws CFException{
		work.setWorkRemainder801(number);
	}
	

	public void setWorkRemainder801(long number)  throws CFException{
	    work.setWorkRemainder801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801(char[] value)  throws CFException {
		work.setWorkRemainder801(value);
	}
	
	/**
	 * 	Update WorkRemainder801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801String(char[] value)  throws CFException{
		work.setWorkRemainder801(value);
	}	

	/**
	 *	Returns the value of ctcCcyy802
	 *	@return ctcCcyy802
	 */
	public int getCtcCcyy802() throws CFException {
   		return ctcDate802.getCtcCcyy802();
	}


	/**
	 *	Returns String value of ctcCcyy802
	 *	@return ctcCcyy802
	 */
	public char[]  getCtcCcyy802String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcCcyy802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcCcyy802IsNumeric()  throws CFException{
	    return ctcDate802.ctcCcyy802IsNumeric();
	}

	/**
	 * 	Update CtcCcyy802 with the passed value
	 *	@param number
	 */
	public void setCtcCcyy802(int number)  throws CFException{
		ctcDate802.setCtcCcyy802(number);
	}
	

	public void setCtcCcyy802(long number)  throws CFException{
	    ctcDate802.setCtcCcyy802(number);
	}
	
	
	/**
	 * 	Update CtcCcyy802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcCcyy802(char[] value)  throws CFException {
		ctcDate802.setCtcCcyy802(value);
	}
	
	/**
	 * 	Update CtcCcyy802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcCcyy802String(char[] value)  throws CFException{
		ctcDate802.setCtcCcyy802(value);
	}	

	/**
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
   		return work.getValue4300();
	}


	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() throws CFException {
	     return String.valueOf(work.getValue4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric()  throws CFException{
	    return work.value4300IsNumeric();
	}

	/**
	 * 	Update Value4300 with the passed value
	 *	@param number
	 */
	public void setValue4300(int number)  throws CFException{
		work.setValue4300(number);
	}
	

	public void setValue4300(long number)  throws CFException{
	    work.setValue4300(number);
	}
	
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value)  throws CFException {
		work.setValue4300(value);
	}
	
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value)  throws CFException{
		work.setValue4300(value);
	}	

	/**
	 *	Returns the value of value400300
	 *	@return value400300
	 */
	public int getValue400300() throws CFException {
   		return work.getValue400300();
	}


	/**
	 *	Returns String value of value400300
	 *	@return value400300
	 */
	public char[]  getValue400300String() throws CFException {
	     return String.valueOf(work.getValue400300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value400300IsNumeric()  throws CFException{
	    return work.value400300IsNumeric();
	}

	/**
	 * 	Update Value400300 with the passed value
	 *	@param number
	 */
	public void setValue400300(int number)  throws CFException{
		work.setValue400300(number);
	}
	

	public void setValue400300(long number)  throws CFException{
	    work.setValue400300(number);
	}
	
	
	/**
	 * 	Update Value400300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue400300(char[] value)  throws CFException {
		work.setValue400300(value);
	}
	
	/**
	 * 	Update Value400300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue400300String(char[] value)  throws CFException{
		work.setValue400300(value);
	}	

	/**
	 *	Returns the value of value100300
	 *	@return value100300
	 */
	public int getValue100300() throws CFException {
   		return work.getValue100300();
	}


	/**
	 *	Returns String value of value100300
	 *	@return value100300
	 */
	public char[]  getValue100300String() throws CFException {
	     return String.valueOf(work.getValue100300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value100300IsNumeric()  throws CFException{
	    return work.value100300IsNumeric();
	}

	/**
	 * 	Update Value100300 with the passed value
	 *	@param number
	 */
	public void setValue100300(int number)  throws CFException{
		work.setValue100300(number);
	}
	

	public void setValue100300(long number)  throws CFException{
	    work.setValue100300(number);
	}
	
	
	/**
	 * 	Update Value100300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue100300(char[] value)  throws CFException {
		work.setValue100300(value);
	}
	
	/**
	 * 	Update Value100300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue100300String(char[] value)  throws CFException{
		work.setValue100300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public CheckForLeapyearOutCtx getCheckForLeapyearOutCtx() {
            return new CheckForLeapyearOutCtx();
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckForLeapyearInCtx clone() {
        CheckForLeapyearInCtx cloneObj = new CheckForLeapyearInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckForLeapyearInCtx getCheckForLeapyearInCtx() {
            return new CheckForLeapyearInCtx();
    }
     public class CheckForLeapyearOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of workRemainder801
	 *	@return workRemainder801
	 */
	public int getWorkRemainder801() throws CFException {
   		return work.getWorkRemainder801();
	}


	/**
	 *	Returns String value of workRemainder801
	 *	@return workRemainder801
	 */
	public char[]  getWorkRemainder801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder801IsNumeric()  throws CFException{
	    return work.workRemainder801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder801(int number)  throws CFException{
		work.setWorkRemainder801(number);
	}
	

	public void setWorkRemainder801(long number)  throws CFException{
	    work.setWorkRemainder801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801(char[] value)  throws CFException {
		work.setWorkRemainder801(value);
	}
	
	/**
	 * 	Update WorkRemainder801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801String(char[] value)  throws CFException{
		work.setWorkRemainder801(value);
	}	

	/**
	 *	Test condition "Y" for isItIsLeapYear88100()
	 *	@return  Returns true if isItIsLeapYear88100() is "Y"
	 */
   public boolean isItIsLeapYear88100() throws CFException {
      return work.isItIsLeapYear88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsLeapYear88100True()  throws CFException{  			
    	work.setItIsLeapYear88100True();
   	}
	/**
	 *	Returns the value of workYear3801
	 *	@return workYear3801
	 */
	public int getWorkYear3801() throws CFException {
   		return work.getWorkYear3801();
	}


	/**
	 *	Returns String value of workYear3801
	 *	@return workYear3801
	 */
	public char[]  getWorkYear3801String() throws CFException {
	     return String.valueOf(work.getWorkYear3801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear3801IsNumeric()  throws CFException{
	    return work.workYear3801IsNumeric();
	}

	/**
	 * 	Update WorkYear3801 with the passed value
	 *	@param number
	 */
	public void setWorkYear3801(int number)  throws CFException{
		work.setWorkYear3801(number);
	}
	

	public void setWorkYear3801(long number)  throws CFException{
	    work.setWorkYear3801(number);
	}
	
	
	/**
	 * 	Update WorkYear3801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear3801(char[] value)  throws CFException {
		work.setWorkYear3801(value);
	}
	
	/**
	 * 	Update WorkYear3801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear3801String(char[] value)  throws CFException{
		work.setWorkYear3801(value);
	}	

	/**
	 *	Test condition "N" for isItIsNotLeapYear88100()
	 *	@return  Returns true if isItIsNotLeapYear88100() is "N"
	 */
   public boolean isItIsNotLeapYear88100() throws CFException {
      return work.isItIsNotLeapYear88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotLeapYear88100True()  throws CFException{  			
    	work.setItIsNotLeapYear88100True();
   	}

        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckForLeapyearOutCtx clone() {
        CheckForLeapyearOutCtx cloneObj = new CheckForLeapyearOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckForLeapyearOutCtx getCheckForLeapyearOutCtx() {
            return new CheckForLeapyearOutCtx();
    }
     public class CheckFor29daysInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	

	/**
	 *	Returns the value of value29300
	 *	@return value29300
	 */
	public int getValue29300() throws CFException {
   		return work.getValue29300();
	}


	/**
	 *	Returns String value of value29300
	 *	@return value29300
	 */
	public char[]  getValue29300String() throws CFException {
	     return String.valueOf(work.getValue29300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value29300IsNumeric()  throws CFException{
	    return work.value29300IsNumeric();
	}

	/**
	 * 	Update Value29300 with the passed value
	 *	@param number
	 */
	public void setValue29300(int number)  throws CFException{
		work.setValue29300(number);
	}
	

	public void setValue29300(long number)  throws CFException{
	    work.setValue29300(number);
	}
	
	
	/**
	 * 	Update Value29300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue29300(char[] value)  throws CFException {
		work.setValue29300(value);
	}
	
	/**
	 * 	Update Value29300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue29300String(char[] value)  throws CFException{
		work.setValue29300(value);
	}	

	/**
	 *	Returns the value of ctcDd802
	 *	@return ctcDd802
	 */
	public int getCtcDd802() throws CFException {
   		return ctcDate802.getCtcMmdd802().getCtcDd802();
	}


	/**
	 *	Returns String value of ctcDd802
	 *	@return ctcDd802
	 */
	public char[]  getCtcDd802String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcMmdd802().getCtcDd802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcDd802IsNumeric()  throws CFException{
	    return ctcDate802.getCtcMmdd802().ctcDd802IsNumeric();
	}

	/**
	 * 	Update CtcDd802 with the passed value
	 *	@param number
	 */
	public void setCtcDd802(int number)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcDd802(number);
	}
	

	public void setCtcDd802(long number)  throws CFException{
	    ctcDate802.getCtcMmdd802().setCtcDd802(number);
	}
	
	
	/**
	 * 	Update CtcDd802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcDd802(char[] value)  throws CFException {
		ctcDate802.getCtcMmdd802().setCtcDd802(value);
	}
	
	/**
	 * 	Update CtcDd802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcDd802String(char[] value)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcDd802(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public CheckFor29daysOutCtx getCheckFor29daysOutCtx() {
            return new CheckFor29daysOutCtx();
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckFor29daysInCtx clone() {
        CheckFor29daysInCtx cloneObj = new CheckFor29daysInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckFor29daysInCtx getCheckFor29daysInCtx() {
            return new CheckFor29daysInCtx();
    }
     public class CheckFor29daysOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckFor29daysOutCtx clone() {
        CheckFor29daysOutCtx cloneObj = new CheckFor29daysOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckFor29daysOutCtx getCheckFor29daysOutCtx() {
            return new CheckFor29daysOutCtx();
    }
     public class CheckFor28daysInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	

	/**
	 *	Returns the value of ctcDd802
	 *	@return ctcDd802
	 */
	public int getCtcDd802() throws CFException {
   		return ctcDate802.getCtcMmdd802().getCtcDd802();
	}


	/**
	 *	Returns String value of ctcDd802
	 *	@return ctcDd802
	 */
	public char[]  getCtcDd802String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcMmdd802().getCtcDd802String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcDd802IsNumeric()  throws CFException{
	    return ctcDate802.getCtcMmdd802().ctcDd802IsNumeric();
	}

	/**
	 * 	Update CtcDd802 with the passed value
	 *	@param number
	 */
	public void setCtcDd802(int number)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcDd802(number);
	}
	

	public void setCtcDd802(long number)  throws CFException{
	    ctcDate802.getCtcMmdd802().setCtcDd802(number);
	}
	
	
	/**
	 * 	Update CtcDd802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcDd802(char[] value)  throws CFException {
		ctcDate802.getCtcMmdd802().setCtcDd802(value);
	}
	
	/**
	 * 	Update CtcDd802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcDd802String(char[] value)  throws CFException{
		ctcDate802.getCtcMmdd802().setCtcDd802(value);
	}	

	/**
	 *	Returns the value of value28300
	 *	@return value28300
	 */
	public int getValue28300() throws CFException {
   		return work.getValue28300();
	}


	/**
	 *	Returns String value of value28300
	 *	@return value28300
	 */
	public char[]  getValue28300String() throws CFException {
	     return String.valueOf(work.getValue28300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value28300IsNumeric()  throws CFException{
	    return work.value28300IsNumeric();
	}

	/**
	 * 	Update Value28300 with the passed value
	 *	@param number
	 */
	public void setValue28300(int number)  throws CFException{
		work.setValue28300(number);
	}
	

	public void setValue28300(long number)  throws CFException{
	    work.setValue28300(number);
	}
	
	
	/**
	 * 	Update Value28300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue28300(char[] value)  throws CFException {
		work.setValue28300(value);
	}
	
	/**
	 * 	Update Value28300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue28300String(char[] value)  throws CFException{
		work.setValue28300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public CheckFor28daysOutCtx getCheckFor28daysOutCtx() {
            return new CheckFor28daysOutCtx();
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckFor28daysInCtx clone() {
        CheckFor28daysInCtx cloneObj = new CheckFor28daysInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckFor28daysInCtx getCheckFor28daysInCtx() {
            return new CheckFor28daysInCtx();
    }
     public class CheckFor28daysOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ctcDate802.hashCode();
       return str.hashCode();
    }

    public CheckFor28daysOutCtx clone() {
        CheckFor28daysOutCtx cloneObj = new CheckFor28daysOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        return cloneObj;
    }

    }

    public CheckFor28daysOutCtx getCheckFor28daysOutCtx() {
            return new CheckFor28daysOutCtx();
    }
     public class ValidateJulDateInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of workRemainder801
	 *	@return workRemainder801
	 */
	public int getWorkRemainder801() throws CFException {
   		return work.getWorkRemainder801();
	}


	/**
	 *	Returns String value of workRemainder801
	 *	@return workRemainder801
	 */
	public char[]  getWorkRemainder801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder801IsNumeric()  throws CFException{
	    return work.workRemainder801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder801(int number)  throws CFException{
		work.setWorkRemainder801(number);
	}
	

	public void setWorkRemainder801(long number)  throws CFException{
	    work.setWorkRemainder801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801(char[] value)  throws CFException {
		work.setWorkRemainder801(value);
	}
	
	/**
	 * 	Update WorkRemainder801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801String(char[] value)  throws CFException{
		work.setWorkRemainder801(value);
	}	

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return work.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(work.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return work.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    work.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		work.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		work.setValue1300(value);
	}	

	/**
	 *	Returns the value of value366300
	 *	@return value366300
	 */
	public int getValue366300() throws CFException {
   		return work.getValue366300();
	}


	/**
	 *	Returns String value of value366300
	 *	@return value366300
	 */
	public char[]  getValue366300String() throws CFException {
	     return String.valueOf(work.getValue366300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value366300IsNumeric()  throws CFException{
	    return work.value366300IsNumeric();
	}

	/**
	 * 	Update Value366300 with the passed value
	 *	@param number
	 */
	public void setValue366300(int number)  throws CFException{
		work.setValue366300(number);
	}
	

	public void setValue366300(long number)  throws CFException{
	    work.setValue366300(number);
	}
	
	
	/**
	 * 	Update Value366300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue366300(char[] value)  throws CFException {
		work.setValue366300(value);
	}
	
	/**
	 * 	Update Value366300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue366300String(char[] value)  throws CFException{
		work.setValue366300(value);
	}	

	/**
	 *	Returns the value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public int getIp67002JDdd01() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().getIp67002JDdd01();
	}


	/**
	 *	Returns String value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public char[]  getIp67002JDdd01String() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().getIp67002JDdd01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002JDdd01IsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().ip67002JDdd01IsNumeric();
	}

	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *	@param number
	 */
	public void setIp67002JDdd01(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(number);
	}
	

	public void setIp67002JDdd01(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(number);
	}
	
	
	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(value);
	}
	
	/**
	 * 	Update Ip67002JDdd01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01String(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002Jddd().setIp67002JDdd01(value);
	}	

	/**
	 *	Returns the value of value365300
	 *	@return value365300
	 */
	public int getValue365300() throws CFException {
   		return work.getValue365300();
	}


	/**
	 *	Returns String value of value365300
	 *	@return value365300
	 */
	public char[]  getValue365300String() throws CFException {
	     return String.valueOf(work.getValue365300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value365300IsNumeric()  throws CFException{
	    return work.value365300IsNumeric();
	}

	/**
	 * 	Update Value365300 with the passed value
	 *	@param number
	 */
	public void setValue365300(int number)  throws CFException{
		work.setValue365300(number);
	}
	

	public void setValue365300(long number)  throws CFException{
	    work.setValue365300(number);
	}
	
	
	/**
	 * 	Update Value365300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue365300(char[] value)  throws CFException {
		work.setValue365300(value);
	}
	
	/**
	 * 	Update Value365300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue365300String(char[] value)  throws CFException{
		work.setValue365300(value);
	}	

	/**
	 *	Returns the value of workYear801
	 *	@return workYear801
	 */
	public int getWorkYear801() throws CFException {
   		return work.getWorkYear801();
	}


	/**
	 *	Returns String value of workYear801
	 *	@return workYear801
	 */
	public char[]  getWorkYear801String() throws CFException {
	     return String.valueOf(work.getWorkYear801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear801IsNumeric()  throws CFException{
	    return work.workYear801IsNumeric();
	}

	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param number
	 */
	public void setWorkYear801(int number)  throws CFException{
		work.setWorkYear801(number);
	}
	

	public void setWorkYear801(long number)  throws CFException{
	    work.setWorkYear801(number);
	}
	
	
	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear801(char[] value)  throws CFException {
		work.setWorkYear801(value);
	}
	
	/**
	 * 	Update WorkYear801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear801String(char[] value)  throws CFException{
		work.setWorkYear801(value);
	}	

	/**
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
   		return work.getValue4300();
	}


	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() throws CFException {
	     return String.valueOf(work.getValue4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric()  throws CFException{
	    return work.value4300IsNumeric();
	}

	/**
	 * 	Update Value4300 with the passed value
	 *	@param number
	 */
	public void setValue4300(int number)  throws CFException{
		work.setValue4300(number);
	}
	

	public void setValue4300(long number)  throws CFException{
	    work.setValue4300(number);
	}
	
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value)  throws CFException {
		work.setValue4300(value);
	}
	
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value)  throws CFException{
		work.setValue4300(value);
	}	

	/**
	 *	Returns the value of value2300
	 *	@return value2300
	 */
	public int getValue2300() throws CFException {
   		return work.getValue2300();
	}


	/**
	 *	Returns String value of value2300
	 *	@return value2300
	 */
	public char[]  getValue2300String() throws CFException {
	     return String.valueOf(work.getValue2300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value2300IsNumeric()  throws CFException{
	    return work.value2300IsNumeric();
	}

	/**
	 * 	Update Value2300 with the passed value
	 *	@param number
	 */
	public void setValue2300(int number)  throws CFException{
		work.setValue2300(number);
	}
	

	public void setValue2300(long number)  throws CFException{
	    work.setValue2300(number);
	}
	
	
	/**
	 * 	Update Value2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue2300(char[] value)  throws CFException {
		work.setValue2300(value);
	}
	
	/**
	 * 	Update Value2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue2300String(char[] value)  throws CFException{
		work.setValue2300(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public ValidateJulDateOutCtx getValidateJulDateOutCtx() {
            return new ValidateJulDateOutCtx();
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
        str += ctcDate802.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ValidateJulDateInCtx clone() {
        ValidateJulDateInCtx cloneObj = new ValidateJulDateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateJulDateInCtx getValidateJulDateInCtx() {
            return new ValidateJulDateInCtx();
    }
     public class ValidateJulDateOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of workRemainder801
	 *	@return workRemainder801
	 */
	public int getWorkRemainder801() throws CFException {
   		return work.getWorkRemainder801();
	}


	/**
	 *	Returns String value of workRemainder801
	 *	@return workRemainder801
	 */
	public char[]  getWorkRemainder801String() throws CFException {
	     return String.valueOf(work.getWorkRemainder801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workRemainder801IsNumeric()  throws CFException{
	    return work.workRemainder801IsNumeric();
	}

	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param number
	 */
	public void setWorkRemainder801(int number)  throws CFException{
		work.setWorkRemainder801(number);
	}
	

	public void setWorkRemainder801(long number)  throws CFException{
	    work.setWorkRemainder801(number);
	}
	
	
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801(char[] value)  throws CFException {
		work.setWorkRemainder801(value);
	}
	
	/**
	 * 	Update WorkRemainder801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801String(char[] value)  throws CFException{
		work.setWorkRemainder801(value);
	}	

	/**
	 *	Returns the value of ctcJDdd80201
	 *	@return ctcJDdd80201
	 */
	public int getCtcJDdd80201() throws CFException {
   		return ctcDate802.getCtcJddd802().getCtcJDdd80201();
	}


	/**
	 *	Returns String value of ctcJDdd80201
	 *	@return ctcJDdd80201
	 */
	public char[]  getCtcJDdd80201String() throws CFException {
	     return String.valueOf(ctcDate802.getCtcJddd802().getCtcJDdd80201String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ctcJDdd80201IsNumeric()  throws CFException{
	    return ctcDate802.getCtcJddd802().ctcJDdd80201IsNumeric();
	}

	/**
	 * 	Update CtcJDdd80201 with the passed value
	 *	@param number
	 */
	public void setCtcJDdd80201(int number)  throws CFException{
		ctcDate802.getCtcJddd802().setCtcJDdd80201(number);
	}
	

	public void setCtcJDdd80201(long number)  throws CFException{
	    ctcDate802.getCtcJddd802().setCtcJDdd80201(number);
	}
	
	
	/**
	 * 	Update CtcJDdd80201 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcJDdd80201(char[] value)  throws CFException {
		ctcDate802.getCtcJddd802().setCtcJDdd80201(value);
	}
	
	/**
	 * 	Update CtcJDdd80201 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcJDdd80201String(char[] value)  throws CFException{
		ctcDate802.getCtcJddd802().setCtcJDdd80201(value);
	}	

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return work.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(work.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return work.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    work.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		work.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		work.setValue1300(value);
	}	

	/**
	 *	Returns the value of workYear801
	 *	@return workYear801
	 */
	public int getWorkYear801() throws CFException {
   		return work.getWorkYear801();
	}


	/**
	 *	Returns String value of workYear801
	 *	@return workYear801
	 */
	public char[]  getWorkYear801String() throws CFException {
	     return String.valueOf(work.getWorkYear801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear801IsNumeric()  throws CFException{
	    return work.workYear801IsNumeric();
	}

	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param number
	 */
	public void setWorkYear801(int number)  throws CFException{
		work.setWorkYear801(number);
	}
	

	public void setWorkYear801(long number)  throws CFException{
	    work.setWorkYear801(number);
	}
	
	
	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear801(char[] value)  throws CFException {
		work.setWorkYear801(value);
	}
	
	/**
	 * 	Update WorkYear801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear801String(char[] value)  throws CFException{
		work.setWorkYear801(value);
	}	

	/**
	 *	Returns the value of value2300
	 *	@return value2300
	 */
	public int getValue2300() throws CFException {
   		return work.getValue2300();
	}


	/**
	 *	Returns String value of value2300
	 *	@return value2300
	 */
	public char[]  getValue2300String() throws CFException {
	     return String.valueOf(work.getValue2300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value2300IsNumeric()  throws CFException{
	    return work.value2300IsNumeric();
	}

	/**
	 * 	Update Value2300 with the passed value
	 *	@param number
	 */
	public void setValue2300(int number)  throws CFException{
		work.setValue2300(number);
	}
	

	public void setValue2300(long number)  throws CFException{
	    work.setValue2300(number);
	}
	
	
	/**
	 * 	Update Value2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue2300(char[] value)  throws CFException {
		work.setValue2300(value);
	}
	
	/**
	 * 	Update Value2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue2300String(char[] value)  throws CFException{
		work.setValue2300(value);
	}	

	/**
	 *	Returns the value of ip67002DateParm
	 *	@return ip67002DateParm
	 */   
	 public Ip67002DateParm getIp67002DateParm() {
   	return ip67002DateParm;
   }



        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ctcDate802.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public ValidateJulDateOutCtx clone() {
        ValidateJulDateOutCtx cloneObj = new ValidateJulDateOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateJulDateOutCtx getValidateJulDateOutCtx() {
            return new ValidateJulDateOutCtx();
    }
     public class FindCenturyInCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
   		return work.getValue19300();
	}


	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() throws CFException {
	     return String.valueOf(work.getValue19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric()  throws CFException{
	    return work.value19300IsNumeric();
	}

	/**
	 * 	Update Value19300 with the passed value
	 *	@param number
	 */
	public void setValue19300(int number)  throws CFException{
		work.setValue19300(number);
	}
	

	public void setValue19300(long number)  throws CFException{
	    work.setValue19300(number);
	}
	
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value)  throws CFException {
		work.setValue19300(value);
	}
	
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value)  throws CFException{
		work.setValue19300(value);
	}	

	/**
	 *	Returns the value of value20300
	 *	@return value20300
	 */
	public int getValue20300() throws CFException {
   		return work.getValue20300();
	}


	/**
	 *	Returns String value of value20300
	 *	@return value20300
	 */
	public char[]  getValue20300String() throws CFException {
	     return String.valueOf(work.getValue20300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value20300IsNumeric()  throws CFException{
	    return work.value20300IsNumeric();
	}

	/**
	 * 	Update Value20300 with the passed value
	 *	@param number
	 */
	public void setValue20300(int number)  throws CFException{
		work.setValue20300(number);
	}
	

	public void setValue20300(long number)  throws CFException{
	    work.setValue20300(number);
	}
	
	
	/**
	 * 	Update Value20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue20300(char[] value)  throws CFException {
		work.setValue20300(value);
	}
	
	/**
	 * 	Update Value20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue20300String(char[] value)  throws CFException{
		work.setValue20300(value);
	}	

	/**
	 *	Returns the value of value49300
	 *	@return value49300
	 */
	public int getValue49300() throws CFException {
   		return work.getValue49300();
	}


	/**
	 *	Returns String value of value49300
	 *	@return value49300
	 */
	public char[]  getValue49300String() throws CFException {
	     return String.valueOf(work.getValue49300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value49300IsNumeric()  throws CFException{
	    return work.value49300IsNumeric();
	}

	/**
	 * 	Update Value49300 with the passed value
	 *	@param number
	 */
	public void setValue49300(int number)  throws CFException{
		work.setValue49300(number);
	}
	

	public void setValue49300(long number)  throws CFException{
	    work.setValue49300(number);
	}
	
	
	/**
	 * 	Update Value49300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue49300(char[] value)  throws CFException {
		work.setValue49300(value);
	}
	
	/**
	 * 	Update Value49300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue49300String(char[] value)  throws CFException{
		work.setValue49300(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of ip67002Yy
	 *	@return ip67002Yy
	 */
	public int getIp67002Yy() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().getIp67002Yy();
	}


	/**
	 *	Returns String value of ip67002Yy
	 *	@return ip67002Yy
	 */
	public char[]  getIp67002YyString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().getIp67002YyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002YyIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().ip67002YyIsNumeric();
	}

	/**
	 * 	Update Ip67002Yy with the passed value
	 *	@param number
	 */
	public void setIp67002Yy(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(number);
	}
	

	public void setIp67002Yy(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(number);
	}
	
	
	/**
	 * 	Update Ip67002Yy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(value);
	}
	
	/**
	 * 	Update Ip67002Yy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002YyString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
        }

        public FindCenturyOutCtx getFindCenturyOutCtx() {
            return new FindCenturyOutCtx();
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
        str += ctcDate802.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public FindCenturyInCtx clone() {
        FindCenturyInCtx cloneObj = new FindCenturyInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public FindCenturyInCtx getFindCenturyInCtx() {
            return new FindCenturyInCtx();
    }
     public class FindCenturyOutCtx implements Cloneable {
     Work work = Ip670010Ctx.this.getWork();
     CtcDate802 ctcDate802 = Ip670010Ctx.this.getCtcDate802();
     Ip67002DateParm ip67002DateParm = Ip670010Ctx.this.getIp67002DateParm();

	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
   		return work.getValue19300();
	}


	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() throws CFException {
	     return String.valueOf(work.getValue19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric()  throws CFException{
	    return work.value19300IsNumeric();
	}

	/**
	 * 	Update Value19300 with the passed value
	 *	@param number
	 */
	public void setValue19300(int number)  throws CFException{
		work.setValue19300(number);
	}
	

	public void setValue19300(long number)  throws CFException{
	    work.setValue19300(number);
	}
	
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value)  throws CFException {
		work.setValue19300(value);
	}
	
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value)  throws CFException{
		work.setValue19300(value);
	}	

	/**
	 *	Returns the value of value20300
	 *	@return value20300
	 */
	public int getValue20300() throws CFException {
   		return work.getValue20300();
	}


	/**
	 *	Returns String value of value20300
	 *	@return value20300
	 */
	public char[]  getValue20300String() throws CFException {
	     return String.valueOf(work.getValue20300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value20300IsNumeric()  throws CFException{
	    return work.value20300IsNumeric();
	}

	/**
	 * 	Update Value20300 with the passed value
	 *	@param number
	 */
	public void setValue20300(int number)  throws CFException{
		work.setValue20300(number);
	}
	

	public void setValue20300(long number)  throws CFException{
	    work.setValue20300(number);
	}
	
	
	/**
	 * 	Update Value20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue20300(char[] value)  throws CFException {
		work.setValue20300(value);
	}
	
	/**
	 * 	Update Value20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue20300String(char[] value)  throws CFException{
		work.setValue20300(value);
	}	

	/**
	 *	Returns the value of workYear801
	 *	@return workYear801
	 */
	public int getWorkYear801() throws CFException {
   		return work.getWorkYear801();
	}


	/**
	 *	Returns String value of workYear801
	 *	@return workYear801
	 */
	public char[]  getWorkYear801String() throws CFException {
	     return String.valueOf(work.getWorkYear801String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workYear801IsNumeric()  throws CFException{
	    return work.workYear801IsNumeric();
	}

	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param number
	 */
	public void setWorkYear801(int number)  throws CFException{
		work.setWorkYear801(number);
	}
	

	public void setWorkYear801(long number)  throws CFException{
	    work.setWorkYear801(number);
	}
	
	
	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear801(char[] value)  throws CFException {
		work.setWorkYear801(value);
	}
	
	/**
	 * 	Update WorkYear801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear801String(char[] value)  throws CFException{
		work.setWorkYear801(value);
	}	

	/**
	 *	Returns the value of ctcDate802
	 *	@return ctcDate802
	 */   
	 public CtcDate802 getCtcDate802() {
   	return ctcDate802;
   }


	/**
	 *	Returns the value of ip67002Cc
	 *	@return ip67002Cc
	 */
	public int getIp67002Cc() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().getIp67002Cc();
	}


	/**
	 *	Returns String value of ip67002Cc
	 *	@return ip67002Cc
	 */
	public char[]  getIp67002CcString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().getIp67002CcString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002CcIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().ip67002CcIsNumeric();
	}

	/**
	 * 	Update Ip67002Cc with the passed value
	 *	@param number
	 */
	public void setIp67002Cc(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Cc(number);
	}
	

	public void setIp67002Cc(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Cc(number);
	}
	
	
	/**
	 * 	Update Ip67002Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Cc(value);
	}
	
	/**
	 * 	Update Ip67002Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Cc(value);
	}	

	/**
	 *	Returns the value of ip67002Date
	 *	@return ip67002Date
	 */
	public long getIp67002Date() throws CFException {
   		return ip67002DateParm.getIp67002Date();
	}


	/**
	 *	Returns String value of ip67002Date
	 *	@return ip67002Date
	 */
	public char[]  getIp67002DateString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DateIsNumeric()  throws CFException{
	    return ip67002DateParm.ip67002DateIsNumeric();
	}

	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param number
	 */
	public void setIp67002Date(long number)  throws CFException{
		ip67002DateParm.setIp67002Date(number);
	}
	

	
	/**
	 * 	Update Ip67002Date with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Date(char[] value)  throws CFException {
		ip67002DateParm.setIp67002Date(value);
	}
	
	/**
	 * 	Update Ip67002Date with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DateString(char[] value)  throws CFException{
		ip67002DateParm.setIp67002Date(value);
	}	

	/**
	 *	Returns the value of ip67002Yy
	 *	@return ip67002Yy
	 */
	public int getIp67002Yy() throws CFException {
   		return ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().getIp67002Yy();
	}


	/**
	 *	Returns String value of ip67002Yy
	 *	@return ip67002Yy
	 */
	public char[]  getIp67002YyString() throws CFException {
	     return String.valueOf(ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().getIp67002YyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002YyIsNumeric()  throws CFException{
	    return ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().ip67002YyIsNumeric();
	}

	/**
	 * 	Update Ip67002Yy with the passed value
	 *	@param number
	 */
	public void setIp67002Yy(int number)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(number);
	}
	

	public void setIp67002Yy(long number)  throws CFException{
	    ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(number);
	}
	
	
	/**
	 * 	Update Ip67002Yy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy(char[] value)  throws CFException {
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(value);
	}
	
	/**
	 * 	Update Ip67002Yy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002YyString(char[] value)  throws CFException{
		ip67002DateParm.getIp67002DateRedefined().getIp67002CcyyRedefined().setIp67002Yy(value);
	}	


        public Ip670010Ctx getIp670010Ctx() {
            return Ip670010Ctx.this;
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
        str += ctcDate802.hashCode();
        str += ip67002DateParm.hashCode();
       return str.hashCode();
    }

    public FindCenturyOutCtx clone() {
        FindCenturyOutCtx cloneObj = new FindCenturyOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ctcDate802 = new CtcDate802();
        cloneObj.ctcDate802.set(ctcDate802.getClonedField());
        cloneObj.ip67002DateParm = new Ip67002DateParm();
        cloneObj.ip67002DateParm.set(ip67002DateParm.getClonedField());
        return cloneObj;
    }

    }

    public FindCenturyOutCtx getFindCenturyOutCtx() {
            return new FindCenturyOutCtx();
    }
}
