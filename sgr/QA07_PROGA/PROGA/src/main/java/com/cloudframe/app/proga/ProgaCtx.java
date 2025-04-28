package com.cloudframe.app.proga;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.proga.dto.Work;
import com.cloudframe.app.proga.dto.RetCodeGroup;


@Context
public class ProgaCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    RetCodeGroup retCodeGroup;
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


    public RetCodeGroup getRetCodeGroup() {
        if (retCodeGroup == null) {
            retCodeGroup = new RetCodeGroup();
        }

        return retCodeGroup;
    }

    public void setRetCodeGroup(RetCodeGroup retCodeGroup) {
        this.retCodeGroup = retCodeGroup;
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
        str += retCodeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProgaCtx clone() {
        ProgaCtx cloneObj = new ProgaCtx();
        cloneObj.retCodeGroup = new RetCodeGroup();
        cloneObj.retCodeGroup.set(retCodeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     RetCodeGroup retCodeGroup = ProgaCtx.this.getRetCodeGroup();
     Work work = ProgaCtx.this.getWork();

	/**
	 *	Returns the value of retCodeGroup
	 *	@return retCodeGroup
	 */   
	 public RetCodeGroup getRetCodeGroup() {
   	return retCodeGroup;
   }



        public ProgaCtx getProgaCtx() {
            return ProgaCtx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += retCodeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.retCodeGroup = new RetCodeGroup();
        cloneObj.retCodeGroup.set(retCodeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     RetCodeGroup retCodeGroup = ProgaCtx.this.getRetCodeGroup();
     Work work = ProgaCtx.this.getWork();

	/**
	 *	Returns the value of retCodeGroup
	 *	@return retCodeGroup
	 */   
	 public RetCodeGroup getRetCodeGroup() {
   	return retCodeGroup;
   }


	/**
	 *	Returns the value of pgmName
	 *	@return pgmName
	 */
   public char[] getPgmName() throws CFException  {              
   		return work.getPgmName();
   }

  
	/**
	*  set variable pgmName
	*  @param value
	**/
   public void setPgmName(char[] value) throws CFException {
      work.setPgmName(value);
   } 

	/**
	 *	Returns the value of callType
	 *	@return callType
	 */
   public char[] getCallType() throws CFException  {              
   		return work.getCallType();
   }

  
	/**
	*  set variable callType
	*  @param value
	**/
   public void setCallType(char[] value) throws CFException {
      work.setCallType(value);
   } 

	/**
	 *	Returns the value of retCode
	 *	@return retCode
	 */
	public int getRetCode() throws CFException {
   		return retCodeGroup.getRetCode();
	}


	/**
	 *	Returns String value of retCode
	 *	@return retCode
	 */
	public char[]  getRetCodeString() throws CFException {
	     return String.valueOf(retCodeGroup.getRetCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean retCodeIsNumeric()  throws CFException{
	    return retCodeGroup.retCodeIsNumeric();
	}

	/**
	 * 	Update RetCode with the passed value
	 *	@param number
	 */
	public void setRetCode(int number)  throws CFException{
		retCodeGroup.setRetCode(number);
	}
	

	public void setRetCode(long number)  throws CFException{
	    retCodeGroup.setRetCode(number);
	}
	
	
	/**
	 * 	Update RetCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setRetCode(char[] value)  throws CFException {
		retCodeGroup.setRetCode(value);
	}
	
	/**
	 * 	Update RetCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRetCodeString(char[] value)  throws CFException{
		retCodeGroup.setRetCode(value);
	}	


        public ProgaCtx getProgaCtx() {
            return ProgaCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += retCodeGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.retCodeGroup = new RetCodeGroup();
        cloneObj.retCodeGroup.set(retCodeGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
