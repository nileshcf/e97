package com.cloudframe.app.abprog8;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.abprog8.dto.Work;
import com.cloudframe.app.abprog8.dto.EndFlagGroup;


@Context
public class Abprog8Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    EndFlagGroup endFlagGroup;
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


    public EndFlagGroup getEndFlagGroup() {
        if (endFlagGroup == null) {
            endFlagGroup = new EndFlagGroup();
        }

        return endFlagGroup;
    }

    public void setEndFlagGroup(EndFlagGroup endFlagGroup) {
        this.endFlagGroup = endFlagGroup;
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
        str += endFlagGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Abprog8Ctx clone() {
        Abprog8Ctx cloneObj = new Abprog8Ctx();
        cloneObj.endFlagGroup = new EndFlagGroup();
        cloneObj.endFlagGroup.set(endFlagGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class CallAbprog9InCtx implements Cloneable {
     EndFlagGroup endFlagGroup = Abprog8Ctx.this.getEndFlagGroup();
     Work work = Abprog8Ctx.this.getWork();

	/**
	 *	Returns the value of endFlagGroup
	 *	@return endFlagGroup
	 */   
	 public EndFlagGroup getEndFlagGroup() {
   	return endFlagGroup;
   }


	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
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
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

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


        public Abprog8Ctx getAbprog8Ctx() {
            return Abprog8Ctx.this;
        }

        public CallAbprog9OutCtx getCallAbprog9OutCtx() {
            return new CallAbprog9OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += endFlagGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CallAbprog9InCtx clone() {
        CallAbprog9InCtx cloneObj = new CallAbprog9InCtx();
        cloneObj.endFlagGroup = new EndFlagGroup();
        cloneObj.endFlagGroup.set(endFlagGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallAbprog9InCtx getCallAbprog9InCtx() {
            return new CallAbprog9InCtx();
    }
     public class CallAbprog9OutCtx implements Cloneable {
     EndFlagGroup endFlagGroup = Abprog8Ctx.this.getEndFlagGroup();
     Work work = Abprog8Ctx.this.getWork();

	/**
	 *	Test condition "A" for isAbnormalEnd()
	 *	@return  Returns true if isAbnormalEnd() is "A"
	 */
   public boolean isAbnormalEnd() throws CFException {
      return endFlagGroup.isAbnormalEnd();
   }

	/**
	*  set values "A"
	*/
   	public void setAbnormalEndTrue()  throws CFException{  			
    	endFlagGroup.setAbnormalEndTrue();
   	}
	/**
	 *	Test condition "N" for isNormalEnd()
	 *	@return  Returns true if isNormalEnd() is "N"
	 */
   public boolean isNormalEnd() throws CFException {
      return endFlagGroup.isNormalEnd();
   }

	/**
	*  set values "N"
	*/
   	public void setNormalEndTrue()  throws CFException{  			
    	endFlagGroup.setNormalEndTrue();
   	}
	/**
	 *	Returns the value of endFlagGroup
	 *	@return endFlagGroup
	 */   
	 public EndFlagGroup getEndFlagGroup() {
   	return endFlagGroup;
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
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
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
	public void setI(int number)  throws CFException{
		work.setI(number);
	}
	

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


        public Abprog8Ctx getAbprog8Ctx() {
            return Abprog8Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += endFlagGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CallAbprog9OutCtx clone() {
        CallAbprog9OutCtx cloneObj = new CallAbprog9OutCtx();
        cloneObj.endFlagGroup = new EndFlagGroup();
        cloneObj.endFlagGroup.set(endFlagGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CallAbprog9OutCtx getCallAbprog9OutCtx() {
            return new CallAbprog9OutCtx();
    }
}
