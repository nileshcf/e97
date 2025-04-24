package com.cloudframe.app.ip313010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip313010.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip50004iTableId;
import com.cloudframe.app.global.sharedvar.Ip50005oTableId;
import com.cloudframe.app.global.sharedvar.Ip50004iOneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005oClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRec;
import com.cloudframe.app.global.sharedvar.Ip002102TableData;
import com.cloudframe.app.global.sharedvar.Ip50005oOneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50004iReadTableIdGroup;
import com.cloudframe.app.global.sharedvar.Ip002102RecreateConvTable;
import com.cloudframe.app.global.sharedvar.Ip50004iOneDayRec;
import com.cloudframe.app.global.sharedvar.Ip50005oOneDayRecLthGroup;
import com.cloudframe.app.ip313010.dto.Ip002103TableData;


@Context
public class Ip313010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip50005oOneDayReadStatusGroup ip50005oOneDayReadStatusGroup;
    Ip002103TableData ip002103TableData;
    Ip50005oClearingDtTm ip50005oClearingDtTm;
    Ip50004iReadTableIdGroup ip50004iReadTableIdGroup;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip50004iOneDayReadStatusGroup ip50004iOneDayReadStatusGroup;
    Ip50005oOneDayRecLthGroup ip50005oOneDayRecLthGroup;
    Ip50004iOneDayRecLthGroup ip50004iOneDayRecLthGroup;
    Ip50004iOneDayRec ip50004iOneDayRec;
    Ip50005oOneDayRec ip50005oOneDayRec;
    Ip002102RecreateConvTable ip002102RecreateConvTable;
    Work work;

    int ip002102X;

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


    public Ip50005oOneDayReadStatusGroup getIp50005oOneDayReadStatusGroup() {
        if (ip50005oOneDayReadStatusGroup == null) {
            ip50005oOneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005oOneDayReadStatusGroup.class);
        }

        return ip50005oOneDayReadStatusGroup;
    }

    public Ip002103TableData getIp002103TableData() {
        if (ip002103TableData == null) {
            ip002103TableData = new Ip002103TableData();
        }

        return ip002103TableData;
    }

    public void setIp002103TableData(Ip002103TableData ip002103TableData) {
        this.ip002103TableData = ip002103TableData;
    }
    public Ip50005oClearingDtTm getIp50005oClearingDtTm() {
        if (ip50005oClearingDtTm == null) {
            ip50005oClearingDtTm = globalCtx.getGlobalDto(Ip50005oClearingDtTm.class);
        }

        return ip50005oClearingDtTm;
    }

    public Ip50004iReadTableIdGroup getIp50004iReadTableIdGroup() {
        if (ip50004iReadTableIdGroup == null) {
            ip50004iReadTableIdGroup = globalCtx.getGlobalDto(Ip50004iReadTableIdGroup.class);
        }

        return ip50004iReadTableIdGroup;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip50004iOneDayReadStatusGroup getIp50004iOneDayReadStatusGroup() {
        if (ip50004iOneDayReadStatusGroup == null) {
            ip50004iOneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50004iOneDayReadStatusGroup.class);
        }

        return ip50004iOneDayReadStatusGroup;
    }

    public Ip50005oOneDayRecLthGroup getIp50005oOneDayRecLthGroup() {
        if (ip50005oOneDayRecLthGroup == null) {
            ip50005oOneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005oOneDayRecLthGroup.class);
        }

        return ip50005oOneDayRecLthGroup;
    }

    public Ip50004iOneDayRecLthGroup getIp50004iOneDayRecLthGroup() {
        if (ip50004iOneDayRecLthGroup == null) {
            ip50004iOneDayRecLthGroup = globalCtx.getGlobalDto(Ip50004iOneDayRecLthGroup.class);
        }

        return ip50004iOneDayRecLthGroup;
    }

    public Ip50004iOneDayRec getIp50004iOneDayRec() {
        if (ip50004iOneDayRec == null) {
            ip50004iOneDayRec = globalCtx.getGlobalDto(Ip50004iOneDayRec.class);
        }

        return ip50004iOneDayRec;
    }

    public Ip50005oOneDayRec getIp50005oOneDayRec() {
        if (ip50005oOneDayRec == null) {
            ip50005oOneDayRec = globalCtx.getGlobalDto(Ip50005oOneDayRec.class);
        }

        return ip50005oOneDayRec;
    }

    public Ip002102RecreateConvTable getIp002102RecreateConvTable() {
        if (ip002102RecreateConvTable == null) {
            ip002102RecreateConvTable = globalCtx.getGlobalDto(Ip002102RecreateConvTable.class);
        }

        return ip002102RecreateConvTable;
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

    public int getIp002102X() {
        return ip002102X;
    }

    public void setIp002102X(int ip002102X) {
        this.ip002102X = ip002102X;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005oOneDayReadStatusGroup.hashCode();
        str += ip002103TableData.hashCode();
        str += ip50005oClearingDtTm.hashCode();
        str += ip50004iReadTableIdGroup.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip50004iOneDayReadStatusGroup.hashCode();
        str += ip50005oOneDayRecLthGroup.hashCode();
        str += ip50004iOneDayRecLthGroup.hashCode();
        str += ip50004iOneDayRec.hashCode();
        str += ip50005oOneDayRec.hashCode();
        str += ip002102RecreateConvTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Ip313010Ctx clone() {
        Ip313010Ctx cloneObj = new Ip313010Ctx();
        cloneObj.ip50005oOneDayReadStatusGroup = new Ip50005oOneDayReadStatusGroup();
        cloneObj.ip50005oOneDayReadStatusGroup.set(ip50005oOneDayReadStatusGroup.getClonedField());
        cloneObj.ip002103TableData = new Ip002103TableData();
        cloneObj.ip002103TableData.set(ip002103TableData.getClonedField());
        cloneObj.ip50005oClearingDtTm = new Ip50005oClearingDtTm();
        cloneObj.ip50005oClearingDtTm.set(ip50005oClearingDtTm.getClonedField());
        cloneObj.ip50004iReadTableIdGroup = new Ip50004iReadTableIdGroup();
        cloneObj.ip50004iReadTableIdGroup.set(ip50004iReadTableIdGroup.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50004iOneDayReadStatusGroup = new Ip50004iOneDayReadStatusGroup();
        cloneObj.ip50004iOneDayReadStatusGroup.set(ip50004iOneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005oOneDayRecLthGroup = new Ip50005oOneDayRecLthGroup();
        cloneObj.ip50005oOneDayRecLthGroup.set(ip50005oOneDayRecLthGroup.getClonedField());
        cloneObj.ip50004iOneDayRecLthGroup = new Ip50004iOneDayRecLthGroup();
        cloneObj.ip50004iOneDayRecLthGroup.set(ip50004iOneDayRecLthGroup.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        cloneObj.ip002102RecreateConvTable = new Ip002102RecreateConvTable();
        cloneObj.ip002102RecreateConvTable.set(ip002102RecreateConvTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class DoInitializationInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip313010Ctx.this.getIp996011ProgramStartMessage();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip313010Ctx.this.getIp50004iOneDayRec();
     Work work = Ip313010Ctx.this.getWork();
     Ip002102RecreateConvTable ip002102RecreateConvTable = Ip313010Ctx.this.getIp002102RecreateConvTable();

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
	 *	Returns the value of ip50004iTableId
	 *	@return ip50004iTableId
	 */   
	 public Ip50004iTableId getIp50004iTableId() {
   	return ip50004iOneDayRec.getIp50004iTableKey().getIp50004iTableId();
   }

   /**
	* 	Update Ip50004iTableId with the passed value
	*	@param value
	*/
   public void setIp50004iTableId(char[] value) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(value);
   }   

     /**
	 * 	Update Ip50004iTableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableId(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableId with another Field
	 *	@param value
	 */
   public void setIp50004iTableId(Field source) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source);
   }  
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableId(Field source, int sourceIndex,int sourceLen) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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
	 *	Returns the value of ip50004iEffDate
	 *	@return ip50004iEffDate
	 */
   public char[] getIp50004iEffDate() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableKey().getIp50004iEffDate();
   }

  
	/**
	*  set variable ip50004iEffDate
	*  @param value
	**/
   public void setIp50004iEffDate(char[] value) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(value);
   } 

     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex);
   	
   }
   
   public void setIp50004iEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iEffDate with another Field
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source);
   }  
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip313010300
	 *	@return ip313010300
	 */
   public char[] getIp313010300() throws CFException  {              
   		return work.getIp313010300();
   }

  
	/**
	*  set variable ip313010300
	*  @param value
	**/
   public void setIp313010300(char[] value) throws CFException {
      work.setIp313010300(value);
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


        public Ip313010Ctx getIp313010Ctx() {
            return Ip313010Ctx.this;
        }

        public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
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
        str += ip50004iOneDayRec.hashCode();
        str += work.hashCode();
        str += ip002102RecreateConvTable.hashCode();
       return str.hashCode();
    }

    public DoInitializationInCtx clone() {
        DoInitializationInCtx cloneObj = new DoInitializationInCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip002102RecreateConvTable = new Ip002102RecreateConvTable();
        cloneObj.ip002102RecreateConvTable.set(ip002102RecreateConvTable.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationInCtx getDoInitializationInCtx() {
            return new DoInitializationInCtx();
    }
     public class DoInitializationOutCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip313010Ctx.this.getIp996011ProgramStartMessage();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip313010Ctx.this.getIp50004iOneDayRec();
     Ip002102RecreateConvTable ip002102RecreateConvTable = Ip313010Ctx.this.getIp002102RecreateConvTable();
     Work work = Ip313010Ctx.this.getWork();

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
	 *	Returns the value of ip50004iTableId
	 *	@return ip50004iTableId
	 */   
	 public Ip50004iTableId getIp50004iTableId() {
   	return ip50004iOneDayRec.getIp50004iTableKey().getIp50004iTableId();
   }

   /**
	* 	Update Ip50004iTableId with the passed value
	*	@param value
	*/
   public void setIp50004iTableId(char[] value) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(value);
   }   

     /**
	 * 	Update Ip50004iTableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableId(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableId with another Field
	 *	@param value
	 */
   public void setIp50004iTableId(Field source) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source);
   }  
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableId(Field source, int sourceIndex,int sourceLen) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50004iOneDayRec.getIp50004iTableKey().setIp50004iTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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
	 *	Returns the value of ip002102RecreateConvTable
	 *	@return ip002102RecreateConvTable
	 */   
	 public Ip002102RecreateConvTable getIp002102RecreateConvTable() {
   	return ip002102RecreateConvTable;
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
	/**
	 *	Returns the value of saveTableId100
	 *	@return saveTableId100
	 */
   public char[] getSaveTableId100() throws CFException  {              
   		return work.getSaveTableId100();
   }

  
	/**
	*  set variable saveTableId100
	*  @param value
	**/
   public void setSaveTableId100(char[] value) throws CFException {
      work.setSaveTableId100(value);
   } 

	/**
	 *	Returns the value of ip50004iEffDate
	 *	@return ip50004iEffDate
	 */
   public char[] getIp50004iEffDate() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableKey().getIp50004iEffDate();
   }

  
	/**
	*  set variable ip50004iEffDate
	*  @param value
	**/
   public void setIp50004iEffDate(char[] value) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(value);
   } 

     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex);
   	
   }
   
   public void setIp50004iEffDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iEffDate with another Field
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source);
   }  
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iEffDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iEffDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.getIp50004iTableKey().setIp50004iEffDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of saveEffDate100
	 *	@return saveEffDate100
	 */
   public char[] getSaveEffDate100() throws CFException  {              
   		return work.getSaveEffDate100();
   }

  
	/**
	*  set variable saveEffDate100
	*  @param value
	**/
   public void setSaveEffDate100(char[] value) throws CFException {
      work.setSaveEffDate100(value);
   } 


public void setIp002102X(int ip002102X) { 
    Ip313010Ctx.this.ip002102X = ip002102X;
}

public int getIp002102X() { 
    return Ip313010Ctx.this.ip002102X;
}
	/**
	 *	Returns the value of ip313010300
	 *	@return ip313010300
	 */
   public char[] getIp313010300() throws CFException  {              
   		return work.getIp313010300();
   }

  
	/**
	*  set variable ip313010300
	*  @param value
	**/
   public void setIp313010300(char[] value) throws CFException {
      work.setIp313010300(value);
   } 

	/**
	 *	Returns the value of ip002102RowCount
	 *	@return ip002102RowCount
	 */
	public int getIp002102RowCount() throws CFException {        
   		return ip002102RecreateConvTable.getIp002102RowCount();
	}
	
	/**
	 * 	Update Ip002102RowCount with the passed value
	 *	@param number
	 */
	public void setIp002102RowCount(int number)  throws CFException{
		ip002102RecreateConvTable.setIp002102RowCount(number);
	}


	public void setIp002102RowCount(long number)  throws CFException{
		ip002102RecreateConvTable.setIp002102RowCount((int)number);
	}



        public Ip313010Ctx getIp313010Ctx() {
            return Ip313010Ctx.this;
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
        str += ip50004iOneDayRec.hashCode();
        str += ip002102RecreateConvTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DoInitializationOutCtx clone() {
        DoInitializationOutCtx cloneObj = new DoInitializationOutCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.ip002102RecreateConvTable = new Ip002102RecreateConvTable();
        cloneObj.ip002102RecreateConvTable.set(ip002102RecreateConvTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
    }
     public class ProcessTbl0021InCtx implements Cloneable {
     Ip002103TableData ip002103TableData = Ip313010Ctx.this.getIp002103TableData();
     Ip50005oOneDayRecLthGroup ip50005oOneDayRecLthGroup = Ip313010Ctx.this.getIp50005oOneDayRecLthGroup();
     Ip50004iOneDayRecLthGroup ip50004iOneDayRecLthGroup = Ip313010Ctx.this.getIp50004iOneDayRecLthGroup();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip313010Ctx.this.getIp50004iOneDayRec();
     Ip50005oOneDayRec ip50005oOneDayRec = Ip313010Ctx.this.getIp50005oOneDayRec();
     Ip002102RecreateConvTable ip002102RecreateConvTable = Ip313010Ctx.this.getIp002102RecreateConvTable();
     Work work = Ip313010Ctx.this.getWork();

	/**
	 *	Returns the value of ip50004iTableData
	 *	@return ip50004iTableData
	 */
   public char[] getIp50004iTableData() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableData();
   }

  
	/**
	*  set variable ip50004iTableData
	*  @param value
	**/
   public void setIp50004iTableData(char[] value) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(value);
   } 

     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex);
   	
   }
   
   public void setIp50004iTableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableData with another Field
	 *	@param value
	 */
   public void setIp50004iTableData(Field source) {
      ip50004iOneDayRec.setIp50004iTableData(source);
   }  
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip002102TableData
	 *	@return ip002102TableData
	 */   
	 public Ip002102TableData getIp002102TableData(int index) {
   	return ip002102RecreateConvTable.getIp002102TableData(index);
   }

    public List<Ip002102TableData> getIp002102TableData() {
        return ip002102RecreateConvTable.getIp002102TableData();
    }
   /**
	* 	Update Ip002102TableData with the passed value
	*	@param value
	*/
   public void setIp002102TableData(int index,char[] value) throws CFException {
      ip002102RecreateConvTable.setIp002102TableData((index),value);
   }   


	/**
	 *	Returns the value of saveTableId100
	 *	@return saveTableId100
	 */
   public char[] getSaveTableId100() throws CFException  {              
   		return work.getSaveTableId100();
   }

  
	/**
	*  set variable saveTableId100
	*  @param value
	**/
   public void setSaveTableId100(char[] value) throws CFException {
      work.setSaveTableId100(value);
   } 

	/**
	 *	Returns the value of saveEffDate100
	 *	@return saveEffDate100
	 */
   public char[] getSaveEffDate100() throws CFException  {              
   		return work.getSaveEffDate100();
   }

  
	/**
	*  set variable saveEffDate100
	*  @param value
	**/
   public void setSaveEffDate100(char[] value) throws CFException {
      work.setSaveEffDate100(value);
   } 


public void setIp002102X(int ip002102X) { 
    Ip313010Ctx.this.ip002102X = ip002102X;
}

public int getIp002102X() { 
    return Ip313010Ctx.this.ip002102X;
}
	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public int getLength800() throws CFException {        
   		return work.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(int number)  throws CFException{
		work.setLength800(number);
	}


	public void setLength800(long number)  throws CFException{
		work.setLength800((int)number);
	}


	/**
	 *	Returns the value of ip002102RowCount
	 *	@return ip002102RowCount
	 */
	public int getIp002102RowCount() throws CFException {        
   		return ip002102RecreateConvTable.getIp002102RowCount();
	}
	
	/**
	 * 	Update Ip002102RowCount with the passed value
	 *	@param number
	 */
	public void setIp002102RowCount(int number)  throws CFException{
		ip002102RecreateConvTable.setIp002102RowCount(number);
	}


	public void setIp002102RowCount(long number)  throws CFException{
		ip002102RecreateConvTable.setIp002102RowCount((int)number);
	}


	/**
	 *	Returns the value of ip50004iOneDayRecLth
	 *	@return ip50004iOneDayRecLth
	 */
	public long getIp50004iOneDayRecLth() throws CFException {        
   		return ip50004iOneDayRecLthGroup.getIp50004iOneDayRecLth();
	}
	
	/**
	 * 	Update Ip50004iOneDayRecLth with the passed value
	 *	@param number
	 */
	public void setIp50004iOneDayRecLth(long number)  throws CFException{
		ip50004iOneDayRecLthGroup.setIp50004iOneDayRecLth(number);
	}



	/**
	 *	Returns the value of ip002102RecreateConvTable
	 *	@return ip002102RecreateConvTable
	 */   
	 public Ip002102RecreateConvTable getIp002102RecreateConvTable() {
   	return ip002102RecreateConvTable;
   }



        public Ip313010Ctx getIp313010Ctx() {
            return Ip313010Ctx.this;
        }

        public ProcessTbl0021OutCtx getProcessTbl0021OutCtx() {
            return new ProcessTbl0021OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip002103TableData.hashCode();
        str += ip50005oOneDayRecLthGroup.hashCode();
        str += ip50004iOneDayRecLthGroup.hashCode();
        str += ip50004iOneDayRec.hashCode();
        str += ip50005oOneDayRec.hashCode();
        str += ip002102RecreateConvTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessTbl0021InCtx clone() {
        ProcessTbl0021InCtx cloneObj = new ProcessTbl0021InCtx();
        cloneObj.ip002103TableData = new Ip002103TableData();
        cloneObj.ip002103TableData.set(ip002103TableData.getClonedField());
        cloneObj.ip50005oOneDayRecLthGroup = new Ip50005oOneDayRecLthGroup();
        cloneObj.ip50005oOneDayRecLthGroup.set(ip50005oOneDayRecLthGroup.getClonedField());
        cloneObj.ip50004iOneDayRecLthGroup = new Ip50004iOneDayRecLthGroup();
        cloneObj.ip50004iOneDayRecLthGroup.set(ip50004iOneDayRecLthGroup.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        cloneObj.ip002102RecreateConvTable = new Ip002102RecreateConvTable();
        cloneObj.ip002102RecreateConvTable.set(ip002102RecreateConvTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTbl0021InCtx getProcessTbl0021InCtx() {
            return new ProcessTbl0021InCtx();
    }
     public class ProcessTbl0021OutCtx implements Cloneable {
     Ip002103TableData ip002103TableData = Ip313010Ctx.this.getIp002103TableData();
     Ip50005oOneDayRecLthGroup ip50005oOneDayRecLthGroup = Ip313010Ctx.this.getIp50005oOneDayRecLthGroup();
     Ip50004iOneDayRecLthGroup ip50004iOneDayRecLthGroup = Ip313010Ctx.this.getIp50004iOneDayRecLthGroup();
     Ip50005oOneDayRec ip50005oOneDayRec = Ip313010Ctx.this.getIp50005oOneDayRec();
     Ip50004iOneDayRec ip50004iOneDayRec = Ip313010Ctx.this.getIp50004iOneDayRec();
     Ip002102RecreateConvTable ip002102RecreateConvTable = Ip313010Ctx.this.getIp002102RecreateConvTable();
     Work work = Ip313010Ctx.this.getWork();

	/**
	 *	Returns the value of ip50004iTableData
	 *	@return ip50004iTableData
	 */
   public char[] getIp50004iTableData() throws CFException  {              
   		return ip50004iOneDayRec.getIp50004iTableData();
   }

  
	/**
	*  set variable ip50004iTableData
	*  @param value
	**/
   public void setIp50004iTableData(char[] value) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(value);
   } 

     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex) throws CFException {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex);
   	
   }
   
   public void setIp50004iTableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50004iTableData with another Field
	 *	@param value
	 */
   public void setIp50004iTableData(Field source) {
      ip50004iOneDayRec.setIp50004iTableData(source);
   }  
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50004iTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50004iTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50004iOneDayRec.setIp50004iTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005oOneDayRecLth
	 *	@return ip50005oOneDayRecLth
	 */
	public long getIp50005oOneDayRecLth() throws CFException {        
   		return ip50005oOneDayRecLthGroup.getIp50005oOneDayRecLth();
	}
	
	/**
	 * 	Update Ip50005oOneDayRecLth with the passed value
	 *	@param number
	 */
	public void setIp50005oOneDayRecLth(long number)  throws CFException{
		ip50005oOneDayRecLthGroup.setIp50005oOneDayRecLth(number);
	}



	/**
	 *	Returns the value of ip002103TableData
	 *	@return ip002103TableData
	 */   
	 public Ip002103TableData getIp002103TableData() {
   	return ip002103TableData;
   }


	/**
	 *	Returns the value of ip50005oTableId
	 *	@return ip50005oTableId
	 */   
	 public Ip50005oTableId getIp50005oTableId() {
   	return ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().getIp50005oTableId();
   }

   /**
	* 	Update Ip50005oTableId with the passed value
	*	@param value
	*/
   public void setIp50005oTableId(char[] value) throws CFException {
      ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(value);
   }   

     /**
	 * 	Update Ip50005oTableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableId(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005oTableId with another Field
	 *	@param value
	 */
   public void setIp50005oTableId(Field source) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source);
   }  
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableId(Field source, int sourceIndex,int sourceLen) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005oTableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oTableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005oTableData
	 *	@return ip50005oTableData
	 */
   public char[] getIp50005oTableData() throws CFException  {              
   		return ip50005oOneDayRec.getIp50005oTableData();
   }

  
	/**
	*  set variable ip50005oTableData
	*  @param value
	**/
   public void setIp50005oTableData(char[] value) throws CFException {
      ip50005oOneDayRec.setIp50005oTableData(value);
   } 

     /**
	 * 	Update Ip50005oTableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005oTableData(char[] source, int sourceIndex) throws CFException {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex);
   	
   }
   
   public void setIp50005oTableData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005oTableData with another Field
	 *	@param value
	 */
   public void setIp50005oTableData(Field source) {
      ip50005oOneDayRec.setIp50005oTableData(source);
   }  
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005oTableData(Field source, int sourceIndex,int sourceLen) {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005oTableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005oTableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005oOneDayRec.setIp50005oTableData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005oEffDate
	 *	@return ip50005oEffDate
	 */
	public long getIp50005oEffDate() throws CFException {
   		return ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().getIp50005oEffDate();
	}


	/**
	 *	Returns String value of ip50005oEffDate
	 *	@return ip50005oEffDate
	 */
	public char[]  getIp50005oEffDateString() throws CFException {
	     return String.valueOf(ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().getIp50005oEffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50005oEffDateIsNumeric()  throws CFException{
	    return ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().ip50005oEffDateIsNumeric();
	}

	/**
	 * 	Update Ip50005oEffDate with the passed value
	 *	@param number
	 */
	public void setIp50005oEffDate(long number)  throws CFException{
		ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oEffDate(number);
	}
	

	
	/**
	 * 	Update Ip50005oEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50005oEffDate(char[] value)  throws CFException {
		ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oEffDate(value);
	}
	
	/**
	 * 	Update Ip50005oEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50005oEffDateString(char[] value)  throws CFException{
		ip50005oOneDayRec.getIp50005oTableKeyAll().getIp50005oTableKey().setIp50005oEffDate(value);
	}	

	/**
	 *	Returns the value of saveTableId100
	 *	@return saveTableId100
	 */
   public char[] getSaveTableId100() throws CFException  {              
   		return work.getSaveTableId100();
   }

  
	/**
	*  set variable saveTableId100
	*  @param value
	**/
   public void setSaveTableId100(char[] value) throws CFException {
      work.setSaveTableId100(value);
   } 

	/**
	 *	Returns the value of saveEffDate100
	 *	@return saveEffDate100
	 */
   public char[] getSaveEffDate100() throws CFException  {              
   		return work.getSaveEffDate100();
   }

  
	/**
	*  set variable saveEffDate100
	*  @param value
	**/
   public void setSaveEffDate100(char[] value) throws CFException {
      work.setSaveEffDate100(value);
   } 

	/**
	 *	Returns the value of length800
	 *	@return length800
	 */
	public int getLength800() throws CFException {        
   		return work.getLength800();
	}
	
	/**
	 * 	Update Length800 with the passed value
	 *	@param number
	 */
	public void setLength800(int number)  throws CFException{
		work.setLength800(number);
	}


	public void setLength800(long number)  throws CFException{
		work.setLength800((int)number);
	}


	/**
	 *	Returns the value of ip002102RowCount
	 *	@return ip002102RowCount
	 */
	public int getIp002102RowCount() throws CFException {        
   		return ip002102RecreateConvTable.getIp002102RowCount();
	}
	
	/**
	 * 	Update Ip002102RowCount with the passed value
	 *	@param number
	 */
	public void setIp002102RowCount(int number)  throws CFException{
		ip002102RecreateConvTable.setIp002102RowCount(number);
	}


	public void setIp002102RowCount(long number)  throws CFException{
		ip002102RecreateConvTable.setIp002102RowCount((int)number);
	}


	/**
	 *	Returns the value of ip002102RecreateConvTable
	 *	@return ip002102RecreateConvTable
	 */   
	 public Ip002102RecreateConvTable getIp002102RecreateConvTable() {
   	return ip002102RecreateConvTable;
   }



        public Ip313010Ctx getIp313010Ctx() {
            return Ip313010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip002103TableData.hashCode();
        str += ip50005oOneDayRecLthGroup.hashCode();
        str += ip50004iOneDayRecLthGroup.hashCode();
        str += ip50005oOneDayRec.hashCode();
        str += ip50004iOneDayRec.hashCode();
        str += ip002102RecreateConvTable.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessTbl0021OutCtx clone() {
        ProcessTbl0021OutCtx cloneObj = new ProcessTbl0021OutCtx();
        cloneObj.ip002103TableData = new Ip002103TableData();
        cloneObj.ip002103TableData.set(ip002103TableData.getClonedField());
        cloneObj.ip50005oOneDayRecLthGroup = new Ip50005oOneDayRecLthGroup();
        cloneObj.ip50005oOneDayRecLthGroup.set(ip50005oOneDayRecLthGroup.getClonedField());
        cloneObj.ip50004iOneDayRecLthGroup = new Ip50004iOneDayRecLthGroup();
        cloneObj.ip50004iOneDayRecLthGroup.set(ip50004iOneDayRecLthGroup.getClonedField());
        cloneObj.ip50005oOneDayRec = new Ip50005oOneDayRec();
        cloneObj.ip50005oOneDayRec.set(ip50005oOneDayRec.getClonedField());
        cloneObj.ip50004iOneDayRec = new Ip50004iOneDayRec();
        cloneObj.ip50004iOneDayRec.set(ip50004iOneDayRec.getClonedField());
        cloneObj.ip002102RecreateConvTable = new Ip002102RecreateConvTable();
        cloneObj.ip002102RecreateConvTable.set(ip002102RecreateConvTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTbl0021OutCtx getProcessTbl0021OutCtx() {
            return new ProcessTbl0021OutCtx();
    }
     public class MoveTableEntryInCtx implements Cloneable {
     Ip002103TableData ip002103TableData = Ip313010Ctx.this.getIp002103TableData();
     Ip002102RecreateConvTable ip002102RecreateConvTable = Ip313010Ctx.this.getIp002102RecreateConvTable();

	/**
	 *	Returns the value of ip002103OldSubfldNo
	 *	@return ip002103OldSubfldNo
	 */
	public int getIp002103OldSubfldNo() throws CFException {
   		return ip002103TableData.getIp002103OldSubfldNo();
	}


	/**
	 *	Returns String value of ip002103OldSubfldNo
	 *	@return ip002103OldSubfldNo
	 */
	public char[]  getIp002103OldSubfldNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103OldSubfldNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldSubfldNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103OldSubfldNoIsNumeric();
	}

	/**
	 * 	Update Ip002103OldSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp002103OldSubfldNo(int number)  throws CFException{
		ip002103TableData.setIp002103OldSubfldNo(number);
	}
	

	public void setIp002103OldSubfldNo(long number)  throws CFException{
	    ip002103TableData.setIp002103OldSubfldNo(number);
	}
	
	
	/**
	 * 	Update Ip002103OldSubfldNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldSubfldNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103OldSubfldNo(value);
	}
	
	/**
	 * 	Update Ip002103OldSubfldNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldSubfldNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103OldSubfldNo(value);
	}	

	/**
	 *	Returns the value of ip002103NewElementType
	 *	@return ip002103NewElementType
	 */
	public int getIp002103NewElementType() throws CFException {
   		return ip002103TableData.getIp002103NewElementType();
	}


	/**
	 *	Returns String value of ip002103NewElementType
	 *	@return ip002103NewElementType
	 */
	public char[]  getIp002103NewElementTypeString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103NewElementTypeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewElementTypeIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103NewElementTypeIsNumeric();
	}

	/**
	 * 	Update Ip002103NewElementType with the passed value
	 *	@param number
	 */
	public void setIp002103NewElementType(int number)  throws CFException{
		ip002103TableData.setIp002103NewElementType(number);
	}
	

	public void setIp002103NewElementType(long number)  throws CFException{
	    ip002103TableData.setIp002103NewElementType(number);
	}
	
	
	/**
	 * 	Update Ip002103NewElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementType(char[] value)  throws CFException {
		ip002103TableData.setIp002103NewElementType(value);
	}
	
	/**
	 * 	Update Ip002103NewElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementTypeString(char[] value)  throws CFException{
		ip002103TableData.setIp002103NewElementType(value);
	}	

	/**
	 *	Returns the value of ip002103OldElementType
	 *	@return ip002103OldElementType
	 */
	public int getIp002103OldElementType() throws CFException {
   		return ip002103TableData.getIp002103OldElementType();
	}


	/**
	 *	Returns String value of ip002103OldElementType
	 *	@return ip002103OldElementType
	 */
	public char[]  getIp002103OldElementTypeString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103OldElementTypeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldElementTypeIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103OldElementTypeIsNumeric();
	}

	/**
	 * 	Update Ip002103OldElementType with the passed value
	 *	@param number
	 */
	public void setIp002103OldElementType(int number)  throws CFException{
		ip002103TableData.setIp002103OldElementType(number);
	}
	

	public void setIp002103OldElementType(long number)  throws CFException{
	    ip002103TableData.setIp002103OldElementType(number);
	}
	
	
	/**
	 * 	Update Ip002103OldElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementType(char[] value)  throws CFException {
		ip002103TableData.setIp002103OldElementType(value);
	}
	
	/**
	 * 	Update Ip002103OldElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementTypeString(char[] value)  throws CFException{
		ip002103TableData.setIp002103OldElementType(value);
	}	

	/**
	 *	Returns the value of ip002103NewElementNo
	 *	@return ip002103NewElementNo
	 */
	public int getIp002103NewElementNo() throws CFException {
   		return ip002103TableData.getIp002103NewElementNo();
	}


	/**
	 *	Returns String value of ip002103NewElementNo
	 *	@return ip002103NewElementNo
	 */
	public char[]  getIp002103NewElementNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103NewElementNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewElementNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103NewElementNoIsNumeric();
	}

	/**
	 * 	Update Ip002103NewElementNo with the passed value
	 *	@param number
	 */
	public void setIp002103NewElementNo(int number)  throws CFException{
		ip002103TableData.setIp002103NewElementNo(number);
	}
	

	public void setIp002103NewElementNo(long number)  throws CFException{
	    ip002103TableData.setIp002103NewElementNo(number);
	}
	
	
	/**
	 * 	Update Ip002103NewElementNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103NewElementNo(value);
	}
	
	/**
	 * 	Update Ip002103NewElementNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103NewElementNo(value);
	}	

	/**
	 *	Returns the value of ip002103NewSubfldNo
	 *	@return ip002103NewSubfldNo
	 */
	public int getIp002103NewSubfldNo() throws CFException {
   		return ip002103TableData.getIp002103NewSubfldNo();
	}


	/**
	 *	Returns String value of ip002103NewSubfldNo
	 *	@return ip002103NewSubfldNo
	 */
	public char[]  getIp002103NewSubfldNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103NewSubfldNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewSubfldNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103NewSubfldNoIsNumeric();
	}

	/**
	 * 	Update Ip002103NewSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp002103NewSubfldNo(int number)  throws CFException{
		ip002103TableData.setIp002103NewSubfldNo(number);
	}
	

	public void setIp002103NewSubfldNo(long number)  throws CFException{
	    ip002103TableData.setIp002103NewSubfldNo(number);
	}
	
	
	/**
	 * 	Update Ip002103NewSubfldNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewSubfldNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103NewSubfldNo(value);
	}
	
	/**
	 * 	Update Ip002103NewSubfldNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewSubfldNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103NewSubfldNo(value);
	}	

	/**
	 *	Returns the value of ip002103Justified
	 *	@return ip002103Justified
	 */
   public char[] getIp002103Justified() throws CFException  {              
   		return ip002103TableData.getIp002103Justified();
   }

  
	/**
	*  set variable ip002103Justified
	*  @param value
	**/
   public void setIp002103Justified(char[] value) throws CFException {
      ip002103TableData.setIp002103Justified(value);
   } 

     /**
	 * 	Update Ip002103Justified 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp002103Justified(char[] source, int sourceIndex) throws CFException {
      ip002103TableData.setIp002103Justified(source, sourceIndex);
   	
   }
   
   public void setIp002103Justified(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip002103Justified 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002103Justified(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip002103Justified with another Field
	 *	@param value
	 */
   public void setIp002103Justified(Field source) {
      ip002103TableData.setIp002103Justified(source);
   }  
   
     /**
	 * 	Update Ip002103Justified 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp002103Justified(Field source, int sourceIndex,int sourceLen) {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip002103Justified 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002103Justified(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp002102X(int ip002102X) { 
    Ip313010Ctx.this.ip002102X = ip002102X;
}

public int getIp002102X() { 
    return Ip313010Ctx.this.ip002102X;
}
	/**
	 *	Returns the value of ip002103OldElementNo
	 *	@return ip002103OldElementNo
	 */
	public int getIp002103OldElementNo() throws CFException {
   		return ip002103TableData.getIp002103OldElementNo();
	}


	/**
	 *	Returns String value of ip002103OldElementNo
	 *	@return ip002103OldElementNo
	 */
	public char[]  getIp002103OldElementNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103OldElementNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldElementNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103OldElementNoIsNumeric();
	}

	/**
	 * 	Update Ip002103OldElementNo with the passed value
	 *	@param number
	 */
	public void setIp002103OldElementNo(int number)  throws CFException{
		ip002103TableData.setIp002103OldElementNo(number);
	}
	

	public void setIp002103OldElementNo(long number)  throws CFException{
	    ip002103TableData.setIp002103OldElementNo(number);
	}
	
	
	/**
	 * 	Update Ip002103OldElementNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103OldElementNo(value);
	}
	
	/**
	 * 	Update Ip002103OldElementNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103OldElementNo(value);
	}	


        public Ip313010Ctx getIp313010Ctx() {
            return Ip313010Ctx.this;
        }

        public MoveTableEntryOutCtx getMoveTableEntryOutCtx() {
            return new MoveTableEntryOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip002103TableData.hashCode();
        str += ip002102RecreateConvTable.hashCode();
       return str.hashCode();
    }

    public MoveTableEntryInCtx clone() {
        MoveTableEntryInCtx cloneObj = new MoveTableEntryInCtx();
        cloneObj.ip002103TableData = new Ip002103TableData();
        cloneObj.ip002103TableData.set(ip002103TableData.getClonedField());
        cloneObj.ip002102RecreateConvTable = new Ip002102RecreateConvTable();
        cloneObj.ip002102RecreateConvTable.set(ip002102RecreateConvTable.getClonedField());
        return cloneObj;
    }

    }

    public MoveTableEntryInCtx getMoveTableEntryInCtx() {
            return new MoveTableEntryInCtx();
    }
     public class MoveTableEntryOutCtx implements Cloneable {
     Ip002103TableData ip002103TableData = Ip313010Ctx.this.getIp002103TableData();
     Ip002102RecreateConvTable ip002102RecreateConvTable = Ip313010Ctx.this.getIp002102RecreateConvTable();

	/**
	 *	Returns the value of ip002102OldSubfldNo
	 *	@return ip002102OldSubfldNo
	 */
	public short getIp002102OldSubfldNo(int index) throws CFException {        
   		return ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldSubfldNo();
	}
	
	/**
	 * 	Update Ip002102OldSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp002102OldSubfldNo(int index,short number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).setIp002102OldSubfldNo(number);
	}

	public void setIp002102OldSubfldNo(int index,int number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).setIp002102OldSubfldNo((short)number);
	}

	public void setIp002102OldSubfldNo(int index,long number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).setIp002102OldSubfldNo((short)number);
	}



	/**
	 *	Returns the value of ip002103NewElementNo
	 *	@return ip002103NewElementNo
	 */
	public int getIp002103NewElementNo() throws CFException {
   		return ip002103TableData.getIp002103NewElementNo();
	}


	/**
	 *	Returns String value of ip002103NewElementNo
	 *	@return ip002103NewElementNo
	 */
	public char[]  getIp002103NewElementNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103NewElementNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewElementNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103NewElementNoIsNumeric();
	}

	/**
	 * 	Update Ip002103NewElementNo with the passed value
	 *	@param number
	 */
	public void setIp002103NewElementNo(int number)  throws CFException{
		ip002103TableData.setIp002103NewElementNo(number);
	}
	

	public void setIp002103NewElementNo(long number)  throws CFException{
	    ip002103TableData.setIp002103NewElementNo(number);
	}
	
	
	/**
	 * 	Update Ip002103NewElementNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103NewElementNo(value);
	}
	
	/**
	 * 	Update Ip002103NewElementNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103NewElementNo(value);
	}	

	/**
	 *	Returns the value of ip002103NewSubfldNo
	 *	@return ip002103NewSubfldNo
	 */
	public int getIp002103NewSubfldNo() throws CFException {
   		return ip002103TableData.getIp002103NewSubfldNo();
	}


	/**
	 *	Returns String value of ip002103NewSubfldNo
	 *	@return ip002103NewSubfldNo
	 */
	public char[]  getIp002103NewSubfldNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103NewSubfldNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewSubfldNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103NewSubfldNoIsNumeric();
	}

	/**
	 * 	Update Ip002103NewSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp002103NewSubfldNo(int number)  throws CFException{
		ip002103TableData.setIp002103NewSubfldNo(number);
	}
	

	public void setIp002103NewSubfldNo(long number)  throws CFException{
	    ip002103TableData.setIp002103NewSubfldNo(number);
	}
	
	
	/**
	 * 	Update Ip002103NewSubfldNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewSubfldNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103NewSubfldNo(value);
	}
	
	/**
	 * 	Update Ip002103NewSubfldNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewSubfldNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103NewSubfldNo(value);
	}	

	/**
	 *	Returns the value of ip002102OldElementNo
	 *	@return ip002102OldElementNo
	 */
	public short getIp002102OldElementNo(int index) throws CFException {        
   		return ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().getIp002102OldElementNo();
	}
	
	/**
	 * 	Update Ip002102OldElementNo with the passed value
	 *	@param number
	 */
	public void setIp002102OldElementNo(int index,short number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().setIp002102OldElementNo(number);
	}

	public void setIp002102OldElementNo(int index,int number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().setIp002102OldElementNo((short)number);
	}

	public void setIp002102OldElementNo(int index,long number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().setIp002102OldElementNo((short)number);
	}



	/**
	 *	Returns the value of ip002102NewSubfldNo
	 *	@return ip002102NewSubfldNo
	 */
	public short getIp002102NewSubfldNo(int index) throws CFException {        
   		return ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewSubfldNo();
	}
	
	/**
	 * 	Update Ip002102NewSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp002102NewSubfldNo(int index,short number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).setIp002102NewSubfldNo(number);
	}

	public void setIp002102NewSubfldNo(int index,int number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).setIp002102NewSubfldNo((short)number);
	}

	public void setIp002102NewSubfldNo(int index,long number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).setIp002102NewSubfldNo((short)number);
	}



	/**
	 *	Returns the value of ip002102NewElementType
	 *	@return ip002102NewElementType
	 */
	public short getIp002102NewElementType(int index) throws CFException {        
   		return ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().getIp002102NewElementType();
	}
	
	/**
	 * 	Update Ip002102NewElementType with the passed value
	 *	@param number
	 */
	public void setIp002102NewElementType(int index,short number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().setIp002102NewElementType(number);
	}

	public void setIp002102NewElementType(int index,int number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().setIp002102NewElementType((short)number);
	}

	public void setIp002102NewElementType(int index,long number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().setIp002102NewElementType((short)number);
	}



	/**
	 *	Returns the value of ip002103OldSubfldNo
	 *	@return ip002103OldSubfldNo
	 */
	public int getIp002103OldSubfldNo() throws CFException {
   		return ip002103TableData.getIp002103OldSubfldNo();
	}


	/**
	 *	Returns String value of ip002103OldSubfldNo
	 *	@return ip002103OldSubfldNo
	 */
	public char[]  getIp002103OldSubfldNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103OldSubfldNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldSubfldNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103OldSubfldNoIsNumeric();
	}

	/**
	 * 	Update Ip002103OldSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp002103OldSubfldNo(int number)  throws CFException{
		ip002103TableData.setIp002103OldSubfldNo(number);
	}
	

	public void setIp002103OldSubfldNo(long number)  throws CFException{
	    ip002103TableData.setIp002103OldSubfldNo(number);
	}
	
	
	/**
	 * 	Update Ip002103OldSubfldNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldSubfldNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103OldSubfldNo(value);
	}
	
	/**
	 * 	Update Ip002103OldSubfldNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldSubfldNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103OldSubfldNo(value);
	}	

	/**
	 *	Returns the value of ip002103NewElementType
	 *	@return ip002103NewElementType
	 */
	public int getIp002103NewElementType() throws CFException {
   		return ip002103TableData.getIp002103NewElementType();
	}


	/**
	 *	Returns String value of ip002103NewElementType
	 *	@return ip002103NewElementType
	 */
	public char[]  getIp002103NewElementTypeString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103NewElementTypeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103NewElementTypeIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103NewElementTypeIsNumeric();
	}

	/**
	 * 	Update Ip002103NewElementType with the passed value
	 *	@param number
	 */
	public void setIp002103NewElementType(int number)  throws CFException{
		ip002103TableData.setIp002103NewElementType(number);
	}
	

	public void setIp002103NewElementType(long number)  throws CFException{
	    ip002103TableData.setIp002103NewElementType(number);
	}
	
	
	/**
	 * 	Update Ip002103NewElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementType(char[] value)  throws CFException {
		ip002103TableData.setIp002103NewElementType(value);
	}
	
	/**
	 * 	Update Ip002103NewElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103NewElementTypeString(char[] value)  throws CFException{
		ip002103TableData.setIp002103NewElementType(value);
	}	

	/**
	 *	Returns the value of ip002103OldElementType
	 *	@return ip002103OldElementType
	 */
	public int getIp002103OldElementType() throws CFException {
   		return ip002103TableData.getIp002103OldElementType();
	}


	/**
	 *	Returns String value of ip002103OldElementType
	 *	@return ip002103OldElementType
	 */
	public char[]  getIp002103OldElementTypeString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103OldElementTypeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldElementTypeIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103OldElementTypeIsNumeric();
	}

	/**
	 * 	Update Ip002103OldElementType with the passed value
	 *	@param number
	 */
	public void setIp002103OldElementType(int number)  throws CFException{
		ip002103TableData.setIp002103OldElementType(number);
	}
	

	public void setIp002103OldElementType(long number)  throws CFException{
	    ip002103TableData.setIp002103OldElementType(number);
	}
	
	
	/**
	 * 	Update Ip002103OldElementType with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementType(char[] value)  throws CFException {
		ip002103TableData.setIp002103OldElementType(value);
	}
	
	/**
	 * 	Update Ip002103OldElementType with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementTypeString(char[] value)  throws CFException{
		ip002103TableData.setIp002103OldElementType(value);
	}	

	/**
	 *	Returns the value of ip002102NewElementNo
	 *	@return ip002102NewElementNo
	 */
	public short getIp002102NewElementNo(int index) throws CFException {        
   		return ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().getIp002102NewElementNo();
	}
	
	/**
	 * 	Update Ip002102NewElementNo with the passed value
	 *	@param number
	 */
	public void setIp002102NewElementNo(int index,short number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().setIp002102NewElementNo(number);
	}

	public void setIp002102NewElementNo(int index,int number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().setIp002102NewElementNo((short)number);
	}

	public void setIp002102NewElementNo(int index,long number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102NewElementId().setIp002102NewElementNo((short)number);
	}



	/**
	 *	Returns the value of ip002102OldElementType
	 *	@return ip002102OldElementType
	 */
	public short getIp002102OldElementType(int index) throws CFException {        
   		return ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().getIp002102OldElementType();
	}
	
	/**
	 * 	Update Ip002102OldElementType with the passed value
	 *	@param number
	 */
	public void setIp002102OldElementType(int index,short number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().setIp002102OldElementType(number);
	}

	public void setIp002102OldElementType(int index,int number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().setIp002102OldElementType((short)number);
	}

	public void setIp002102OldElementType(int index,long number)  throws CFException{
		ip002102RecreateConvTable.getIp002102TableData(index).getIp002102OldElementId().setIp002102OldElementType((short)number);
	}



	/**
	 *	Returns the value of ip002102Justified
	 *	@return ip002102Justified
	 */
   public char[] getIp002102Justified(int index) throws CFException  {              
   		return ip002102RecreateConvTable.getIp002102TableData(index).getIp002102Justified();
   }

  
	/**
	*  set variable ip002102Justified
	*  @param value
	**/
   public void setIp002102Justified(int index,char[] value) throws CFException {
      ip002102RecreateConvTable.getIp002102TableData(index).setIp002102Justified(value);
   } 

     /**
	 * 	Update Ip002102Justified 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp002102Justified(int index,char[] source, int sourceIndex) throws CFException {
      ip002102RecreateConvTable.getIp002102TableData(index).setIp002102Justified(source, sourceIndex);
   	
   }
   
   public void setIp002102Justified(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip002102RecreateConvTable.getIp002102TableData(index).setIp002102Justified(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip002102Justified 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002102Justified(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip002102RecreateConvTable.getIp002102TableData(index).setIp002102Justified(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip002102Justified with another Field
	 *	@param value
	 */
   public void setIp002102Justified(int index,Field source) {
      ip002102RecreateConvTable.getIp002102TableData(index).setIp002102Justified(source);
   }  
   
     /**
	 * 	Update Ip002102Justified 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp002102Justified(int index,Field source, int sourceIndex,int sourceLen) {
      ip002102RecreateConvTable.getIp002102TableData(index).setIp002102Justified(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip002102Justified 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002102Justified(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip002102RecreateConvTable.getIp002102TableData(index).setIp002102Justified(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip002103Justified
	 *	@return ip002103Justified
	 */
   public char[] getIp002103Justified() throws CFException  {              
   		return ip002103TableData.getIp002103Justified();
   }

  
	/**
	*  set variable ip002103Justified
	*  @param value
	**/
   public void setIp002103Justified(char[] value) throws CFException {
      ip002103TableData.setIp002103Justified(value);
   } 

     /**
	 * 	Update Ip002103Justified 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp002103Justified(char[] source, int sourceIndex) throws CFException {
      ip002103TableData.setIp002103Justified(source, sourceIndex);
   	
   }
   
   public void setIp002103Justified(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip002103Justified 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp002103Justified(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip002103Justified with another Field
	 *	@param value
	 */
   public void setIp002103Justified(Field source) {
      ip002103TableData.setIp002103Justified(source);
   }  
   
     /**
	 * 	Update Ip002103Justified 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp002103Justified(Field source, int sourceIndex,int sourceLen) {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip002103Justified 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp002103Justified(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip002103TableData.setIp002103Justified(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp002102X(int ip002102X) { 
    Ip313010Ctx.this.ip002102X = ip002102X;
}

public int getIp002102X() { 
    return Ip313010Ctx.this.ip002102X;
}
	/**
	 *	Returns the value of ip002103OldElementNo
	 *	@return ip002103OldElementNo
	 */
	public int getIp002103OldElementNo() throws CFException {
   		return ip002103TableData.getIp002103OldElementNo();
	}


	/**
	 *	Returns String value of ip002103OldElementNo
	 *	@return ip002103OldElementNo
	 */
	public char[]  getIp002103OldElementNoString() throws CFException {
	     return String.valueOf(ip002103TableData.getIp002103OldElementNoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip002103OldElementNoIsNumeric()  throws CFException{
	    return ip002103TableData.ip002103OldElementNoIsNumeric();
	}

	/**
	 * 	Update Ip002103OldElementNo with the passed value
	 *	@param number
	 */
	public void setIp002103OldElementNo(int number)  throws CFException{
		ip002103TableData.setIp002103OldElementNo(number);
	}
	

	public void setIp002103OldElementNo(long number)  throws CFException{
	    ip002103TableData.setIp002103OldElementNo(number);
	}
	
	
	/**
	 * 	Update Ip002103OldElementNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementNo(char[] value)  throws CFException {
		ip002103TableData.setIp002103OldElementNo(value);
	}
	
	/**
	 * 	Update Ip002103OldElementNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp002103OldElementNoString(char[] value)  throws CFException{
		ip002103TableData.setIp002103OldElementNo(value);
	}	


        public Ip313010Ctx getIp313010Ctx() {
            return Ip313010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip002103TableData.hashCode();
        str += ip002102RecreateConvTable.hashCode();
       return str.hashCode();
    }

    public MoveTableEntryOutCtx clone() {
        MoveTableEntryOutCtx cloneObj = new MoveTableEntryOutCtx();
        cloneObj.ip002103TableData = new Ip002103TableData();
        cloneObj.ip002103TableData.set(ip002103TableData.getClonedField());
        cloneObj.ip002102RecreateConvTable = new Ip002102RecreateConvTable();
        cloneObj.ip002102RecreateConvTable.set(ip002102RecreateConvTable.getClonedField());
        return cloneObj;
    }

    }

    public MoveTableEntryOutCtx getMoveTableEntryOutCtx() {
            return new MoveTableEntryOutCtx();
    }
}
