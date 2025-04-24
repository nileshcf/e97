package com.cloudframe.app.mcsort05;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcsort05.file.records.Sys001GroupStatRec;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.mcsort05.dto.Work;
import com.cloudframe.app.mcsort05.file.records.Sys201SortedGroupStatRec;
import com.cloudframe.app.mcsort05.file.records.Ip40005GroupStatusRec;


@Context
public class Mcsort05Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Sys001GroupStatRec sys001GroupStatRec;
    Ip40005GroupStatusRec ip40005GroupStatusRec;
    Sys201SortedGroupStatRec sys201SortedGroupStatRec;
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


    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public Sys001GroupStatRec getSys001GroupStatRec() {
        if (sys001GroupStatRec == null) {
            sys001GroupStatRec = new Sys001GroupStatRec();
        }

        return sys001GroupStatRec;
    }

    public void setSys001GroupStatRec(Sys001GroupStatRec sys001GroupStatRec) {
        this.sys001GroupStatRec = sys001GroupStatRec;
    }
    public Ip40005GroupStatusRec getIp40005GroupStatusRec() {
        if (ip40005GroupStatusRec == null) {
            ip40005GroupStatusRec = new Ip40005GroupStatusRec();
        }

        return ip40005GroupStatusRec;
    }

    public void setIp40005GroupStatusRec(Ip40005GroupStatusRec ip40005GroupStatusRec) {
        this.ip40005GroupStatusRec = ip40005GroupStatusRec;
    }
    public Sys201SortedGroupStatRec getSys201SortedGroupStatRec() {
        if (sys201SortedGroupStatRec == null) {
            sys201SortedGroupStatRec = new Sys201SortedGroupStatRec();
        }

        return sys201SortedGroupStatRec;
    }

    public void setSys201SortedGroupStatRec(Sys201SortedGroupStatRec sys201SortedGroupStatRec) {
        this.sys201SortedGroupStatRec = sys201SortedGroupStatRec;
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
        str += work.hashCode();
        str += sys001GroupStatRec.hashCode();
        str += ip40005GroupStatusRec.hashCode();
        str += sys201SortedGroupStatRec.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
       return str.hashCode();
    }

    public Mcsort05Ctx clone() {
        Mcsort05Ctx cloneObj = new Mcsort05Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys001GroupStatRec = new Sys001GroupStatRec();
        cloneObj.sys001GroupStatRec.set(sys001GroupStatRec.getClonedField());
        cloneObj.ip40005GroupStatusRec = new Ip40005GroupStatusRec();
        cloneObj.ip40005GroupStatusRec.set(ip40005GroupStatusRec.getClonedField());
        cloneObj.sys201SortedGroupStatRec = new Sys201SortedGroupStatRec();
        cloneObj.sys201SortedGroupStatRec.set(sys201SortedGroupStatRec.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InitializeInCtx implements Cloneable {
     Work work = Mcsort05Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Mcsort05Ctx.this.getIp996011ProgramStartMessage();

	/**
	 *	Returns the value of pgmMcsort05300
	 *	@return pgmMcsort05300
	 */
   public char[] getPgmMcsort05300() throws CFException  {              
   		return work.getPgmMcsort05300();
   }

  
	/**
	*  set variable pgmMcsort05300
	*  @param value
	**/
   public void setPgmMcsort05300(char[] value) throws CFException {
      work.setPgmMcsort05300(value);
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


        public Mcsort05Ctx getMcsort05Ctx() {
            return Mcsort05Ctx.this;
        }

        public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
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

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Work work = Mcsort05Ctx.this.getWork();
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Mcsort05Ctx.this.getIp996011ProgramStartMessage();

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
	 *	Returns the value of pgmMcsort05300
	 *	@return pgmMcsort05300
	 */
   public char[] getPgmMcsort05300() throws CFException  {              
   		return work.getPgmMcsort05300();
   }

  
	/**
	*  set variable pgmMcsort05300
	*  @param value
	**/
   public void setPgmMcsort05300(char[] value) throws CFException {
      work.setPgmMcsort05300(value);
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


        public Mcsort05Ctx getMcsort05Ctx() {
            return Mcsort05Ctx.this;
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

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class SortFileInCtx implements Cloneable {
     Sys001GroupStatRec sys001GroupStatRec = Mcsort05Ctx.this.getSys001GroupStatRec();
     Ip40005GroupStatusRec ip40005GroupStatusRec = Mcsort05Ctx.this.getIp40005GroupStatusRec();
     Sys201SortedGroupStatRec sys201SortedGroupStatRec = Mcsort05Ctx.this.getSys201SortedGroupStatRec();

	/**
	 *	Returns the value of ip40005GrpFileSeqNbr
	 *	@return ip40005GrpFileSeqNbr
	 */
	public int getIp40005GrpFileSeqNbr() throws CFException {
   		return ip40005GroupStatusRec.getIp40005GrpFileSeqNbr();
	}


	/**
	 *	Returns String value of ip40005GrpFileSeqNbr
	 *	@return ip40005GrpFileSeqNbr
	 */
	public char[]  getIp40005GrpFileSeqNbrString() throws CFException {
	     return String.valueOf(ip40005GroupStatusRec.getIp40005GrpFileSeqNbrString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip40005GrpFileSeqNbrIsNumeric()  throws CFException{
	    return ip40005GroupStatusRec.ip40005GrpFileSeqNbrIsNumeric();
	}

	/**
	 * 	Update Ip40005GrpFileSeqNbr with the passed value
	 *	@param number
	 */
	public void setIp40005GrpFileSeqNbr(int number)  throws CFException{
		ip40005GroupStatusRec.setIp40005GrpFileSeqNbr(number);
	}
	

	public void setIp40005GrpFileSeqNbr(long number)  throws CFException{
	    ip40005GroupStatusRec.setIp40005GrpFileSeqNbr(number);
	}
	
	
	/**
	 * 	Update Ip40005GrpFileSeqNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40005GrpFileSeqNbr(char[] value)  throws CFException {
		ip40005GroupStatusRec.setIp40005GrpFileSeqNbr(value);
	}
	
	/**
	 * 	Update Ip40005GrpFileSeqNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40005GrpFileSeqNbrString(char[] value)  throws CFException{
		ip40005GroupStatusRec.setIp40005GrpFileSeqNbr(value);
	}	

	/**
	 *	Returns the value of sys001GroupStatRec
	 *	@return sys001GroupStatRec
	 */   
	 public Sys001GroupStatRec getSys001GroupStatRec() {
   	return sys001GroupStatRec;
   }


	/**
	 *	Returns the value of ip40005GroupSeqNum
	 *	@return ip40005GroupSeqNum
	 */
	public long getIp40005GroupSeqNum() throws CFException {        
   		return ip40005GroupStatusRec.getIp40005GroupSeqNum();
	}
	
	/**
	 * 	Update Ip40005GroupSeqNum with the passed value
	 *	@param number
	 */
	public void setIp40005GroupSeqNum(long number)  throws CFException{
		ip40005GroupStatusRec.setIp40005GroupSeqNum(number);
	}



	/**
	 *	Returns the value of ip40005GroupStatusRec
	 *	@return ip40005GroupStatusRec
	 */   
	 public Ip40005GroupStatusRec getIp40005GroupStatusRec() {
   	return ip40005GroupStatusRec;
   }


	/**
	 *	Returns the value of sys201SortedGroupStatRec
	 *	@return sys201SortedGroupStatRec
	 */   
	 public Sys201SortedGroupStatRec getSys201SortedGroupStatRec() {
   	return sys201SortedGroupStatRec;
   }



        public Mcsort05Ctx getMcsort05Ctx() {
            return Mcsort05Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001GroupStatRec.hashCode();
        str += ip40005GroupStatusRec.hashCode();
        str += sys201SortedGroupStatRec.hashCode();
       return str.hashCode();
    }

    public SortFileInCtx clone() {
        SortFileInCtx cloneObj = new SortFileInCtx();
        cloneObj.sys001GroupStatRec = new Sys001GroupStatRec();
        cloneObj.sys001GroupStatRec.set(sys001GroupStatRec.getClonedField());
        cloneObj.ip40005GroupStatusRec = new Ip40005GroupStatusRec();
        cloneObj.ip40005GroupStatusRec.set(ip40005GroupStatusRec.getClonedField());
        cloneObj.sys201SortedGroupStatRec = new Sys201SortedGroupStatRec();
        cloneObj.sys201SortedGroupStatRec.set(sys201SortedGroupStatRec.getClonedField());
        return cloneObj;
    }

    }

    public SortFileInCtx getSortFileInCtx() {
            return new SortFileInCtx();
    }
     public class ProcessTerminationInCtx implements Cloneable {
     Work work = Mcsort05Ctx.this.getWork();

	/**
	 *	Returns the value of endOfStepMsg301
	 *	@return endOfStepMsg301
	 */
   public char[] getEndOfStepMsg301() throws CFException  {              
   		return work.getEndOfStepMsg301();
   }

  
	/**
	*  set variable endOfStepMsg301
	*  @param value
	**/
   public void setEndOfStepMsg301(char[] value) throws CFException {
      work.setEndOfStepMsg301(value);
   } 


        public Mcsort05Ctx getMcsort05Ctx() {
            return Mcsort05Ctx.this;
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

    public ProcessTerminationInCtx clone() {
        ProcessTerminationInCtx cloneObj = new ProcessTerminationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTerminationInCtx getProcessTerminationInCtx() {
            return new ProcessTerminationInCtx();
    }
}
