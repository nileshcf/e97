package com.cloudframe.app.inspct0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.inspct0.dto.Work;
import com.cloudframe.app.inspct0.dto.Misc;


@Context
public class Inspct0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Misc misc;
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


    public Misc getMisc() {
        if (misc == null) {
            misc = new Misc();
        }

        return misc;
    }

    public void setMisc(Misc misc) {
        this.misc = misc;
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
        str += misc.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Inspct0Ctx clone() {
        Inspct0Ctx cloneObj = new Inspct0Ctx();
        cloneObj.misc = new Misc();
        cloneObj.misc.set(misc.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Misc misc = Inspct0Ctx.this.getMisc();

	/**
	 *	Returns the value of cnt
	 *	@return cnt
	 */
	public int getCnt() throws CFException {
   		return misc.getCnt();
	}


	/**
	 *	Returns String value of cnt
	 *	@return cnt
	 */
	public char[]  getCntString() throws CFException {
	     return String.valueOf(misc.getCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cntIsNumeric()  throws CFException{
	    return misc.cntIsNumeric();
	}

	/**
	 * 	Update Cnt with the passed value
	 *	@param number
	 */
	public void setCnt(int number)  throws CFException{
		misc.setCnt(number);
	}
	

	public void setCnt(long number)  throws CFException{
	    misc.setCnt(number);
	}
	
	
	/**
	 * 	Update Cnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnt(char[] value)  throws CFException {
		misc.setCnt(value);
	}
	
	/**
	 * 	Update Cnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCntString(char[] value)  throws CFException{
		misc.setCnt(value);
	}	


        public Inspct0Ctx getInspct0Ctx() {
            return Inspct0Ctx.this;
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
        str += misc.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.misc = new Misc();
        cloneObj.misc.set(misc.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Misc misc = Inspct0Ctx.this.getMisc();

	/**
	 *	Returns the value of parm
	 *	@return parm
	 */
   public char[] getParm() throws CFException  {              
   		return misc.getParm();
   }

  
	/**
	*  set variable parm
	*  @param value
	**/
   public void setParm(char[] value) throws CFException {
      misc.setParm(value);
   } 

     /**
	 * 	Update Parm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParm(char[] source, int sourceIndex) throws CFException {
      misc.setParm(source, sourceIndex);
   	
   }
   
   public void setParm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      misc.setParm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Parm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      misc.setParm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Parm with another Field
	 *	@param value
	 */
   public void setParm(Field source) {
      misc.setParm(source);
   }  
   
     /**
	 * 	Update Parm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParm(Field source, int sourceIndex,int sourceLen) {
      misc.setParm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Parm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      misc.setParm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cnt
	 *	@return cnt
	 */
	public int getCnt() throws CFException {
   		return misc.getCnt();
	}


	/**
	 *	Returns String value of cnt
	 *	@return cnt
	 */
	public char[]  getCntString() throws CFException {
	     return String.valueOf(misc.getCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cntIsNumeric()  throws CFException{
	    return misc.cntIsNumeric();
	}

	/**
	 * 	Update Cnt with the passed value
	 *	@param number
	 */
	public void setCnt(int number)  throws CFException{
		misc.setCnt(number);
	}
	

	public void setCnt(long number)  throws CFException{
	    misc.setCnt(number);
	}
	
	
	/**
	 * 	Update Cnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnt(char[] value)  throws CFException {
		misc.setCnt(value);
	}
	
	/**
	 * 	Update Cnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCntString(char[] value)  throws CFException{
		misc.setCnt(value);
	}	


        public Inspct0Ctx getInspct0Ctx() {
            return Inspct0Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += misc.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.misc = new Misc();
        cloneObj.misc.set(misc.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
