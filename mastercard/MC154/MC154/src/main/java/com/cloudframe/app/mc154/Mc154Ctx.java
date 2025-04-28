package com.cloudframe.app.mc154;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mc154.dto.Work;


@Context
public class Mc154Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

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
        str += work.hashCode();
       return str.hashCode();
    }

    public Mc154Ctx clone() {
        Mc154Ctx cloneObj = new Mc154Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Mc154Ctx.this.getWork();

	/**
	 *	Returns the value of cnst4300
	 *	@return cnst4300
	 */
	public short getCnst4300() throws CFException {
   		return work.getCnst4300();
	}

    /**
	 *	Returns the String value of cnst4300
	 *	@return cnst4300
	 */
	public char[]  getCnst4300ActualString() {
		return work.getCnst4300ActualString();
	}

	/**
	 *	Returns String value of cnst4300
	 *	@return cnst4300
	 */
	public char[]  getCnst4300String() throws CFException {
	     return String.valueOf(work.getCnst4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst4300IsNumeric()  throws CFException{
	    return work.cnst4300IsNumeric();
	}

	/**
	 * 	Update Cnst4300 with the passed value
	 *	@param number
	 */
	public void setCnst4300(short number)  throws CFException{
		work.setCnst4300(number);
	}
	
	public void setCnst4300(int number)  throws CFException{
	    work.setCnst4300(number);
	}
	public void setCnst4300(long number)  throws CFException{
	    work.setCnst4300(number);
	}
	

	
	/**
	 * 	Update Cnst4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst4300(char[] value)  throws CFException {
		work.setCnst4300(value);
	}
	
	/**
	 * 	Update Cnst4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst4300String(char[] value)  throws CFException{
		work.setCnst4300(value);
	}	

	/**
	 *	Returns the value of cnst9999300
	 *	@return cnst9999300
	 */
	public short getCnst9999300() throws CFException {
   		return work.getCnst9999300();
	}

    /**
	 *	Returns the String value of cnst9999300
	 *	@return cnst9999300
	 */
	public char[]  getCnst9999300ActualString() {
		return work.getCnst9999300ActualString();
	}

	/**
	 *	Returns String value of cnst9999300
	 *	@return cnst9999300
	 */
	public char[]  getCnst9999300String() throws CFException {
	     return String.valueOf(work.getCnst9999300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst9999300IsNumeric()  throws CFException{
	    return work.cnst9999300IsNumeric();
	}

	/**
	 * 	Update Cnst9999300 with the passed value
	 *	@param number
	 */
	public void setCnst9999300(short number)  throws CFException{
		work.setCnst9999300(number);
	}
	
	public void setCnst9999300(int number)  throws CFException{
	    work.setCnst9999300(number);
	}
	public void setCnst9999300(long number)  throws CFException{
	    work.setCnst9999300(number);
	}
	

	
	/**
	 * 	Update Cnst9999300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst9999300(char[] value)  throws CFException {
		work.setCnst9999300(value);
	}
	
	/**
	 * 	Update Cnst9999300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst9999300String(char[] value)  throws CFException{
		work.setCnst9999300(value);
	}	

	/**
	 *	Returns the value of cnst1300
	 *	@return cnst1300
	 */
	public short getCnst1300() throws CFException {
   		return work.getCnst1300();
	}

    /**
	 *	Returns the String value of cnst1300
	 *	@return cnst1300
	 */
	public char[]  getCnst1300ActualString() {
		return work.getCnst1300ActualString();
	}

	/**
	 *	Returns String value of cnst1300
	 *	@return cnst1300
	 */
	public char[]  getCnst1300String() throws CFException {
	     return String.valueOf(work.getCnst1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst1300IsNumeric()  throws CFException{
	    return work.cnst1300IsNumeric();
	}

	/**
	 * 	Update Cnst1300 with the passed value
	 *	@param number
	 */
	public void setCnst1300(short number)  throws CFException{
		work.setCnst1300(number);
	}
	
	public void setCnst1300(int number)  throws CFException{
	    work.setCnst1300(number);
	}
	public void setCnst1300(long number)  throws CFException{
	    work.setCnst1300(number);
	}
	

	
	/**
	 * 	Update Cnst1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst1300(char[] value)  throws CFException {
		work.setCnst1300(value);
	}
	
	/**
	 * 	Update Cnst1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst1300String(char[] value)  throws CFException{
		work.setCnst1300(value);
	}	


        public Mc154Ctx getMc154Ctx() {
            return Mc154Ctx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = Mc154Ctx.this.getWork();

	/**
	 *	Returns the value of sys009CntlKey
	 *	@return sys009CntlKey
	 */
   public char[] getSys009CntlKey() throws CFException  {              
   		return work.getSys009CntlKey();
   }

  
	/**
	*  set variable sys009CntlKey
	*  @param value
	**/
   public void setSys009CntlKey(char[] value) throws CFException {
      work.setSys009CntlKey(value);
   } 

	/**
	 *	Returns the value of cnst4300
	 *	@return cnst4300
	 */
	public short getCnst4300() throws CFException {
   		return work.getCnst4300();
	}

    /**
	 *	Returns the String value of cnst4300
	 *	@return cnst4300
	 */
	public char[]  getCnst4300ActualString() {
		return work.getCnst4300ActualString();
	}

	/**
	 *	Returns String value of cnst4300
	 *	@return cnst4300
	 */
	public char[]  getCnst4300String() throws CFException {
	     return String.valueOf(work.getCnst4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst4300IsNumeric()  throws CFException{
	    return work.cnst4300IsNumeric();
	}

	/**
	 * 	Update Cnst4300 with the passed value
	 *	@param number
	 */
	public void setCnst4300(short number)  throws CFException{
		work.setCnst4300(number);
	}
	
	public void setCnst4300(int number)  throws CFException{
	    work.setCnst4300(number);
	}
	public void setCnst4300(long number)  throws CFException{
	    work.setCnst4300(number);
	}
	

	
	/**
	 * 	Update Cnst4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst4300(char[] value)  throws CFException {
		work.setCnst4300(value);
	}
	
	/**
	 * 	Update Cnst4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst4300String(char[] value)  throws CFException{
		work.setCnst4300(value);
	}	

	/**
	 *	Returns the value of cnst9999300
	 *	@return cnst9999300
	 */
	public short getCnst9999300() throws CFException {
   		return work.getCnst9999300();
	}

    /**
	 *	Returns the String value of cnst9999300
	 *	@return cnst9999300
	 */
	public char[]  getCnst9999300ActualString() {
		return work.getCnst9999300ActualString();
	}

	/**
	 *	Returns String value of cnst9999300
	 *	@return cnst9999300
	 */
	public char[]  getCnst9999300String() throws CFException {
	     return String.valueOf(work.getCnst9999300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst9999300IsNumeric()  throws CFException{
	    return work.cnst9999300IsNumeric();
	}

	/**
	 * 	Update Cnst9999300 with the passed value
	 *	@param number
	 */
	public void setCnst9999300(short number)  throws CFException{
		work.setCnst9999300(number);
	}
	
	public void setCnst9999300(int number)  throws CFException{
	    work.setCnst9999300(number);
	}
	public void setCnst9999300(long number)  throws CFException{
	    work.setCnst9999300(number);
	}
	

	
	/**
	 * 	Update Cnst9999300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst9999300(char[] value)  throws CFException {
		work.setCnst9999300(value);
	}
	
	/**
	 * 	Update Cnst9999300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst9999300String(char[] value)  throws CFException{
		work.setCnst9999300(value);
	}	

	/**
	 *	Returns the value of cnst1300
	 *	@return cnst1300
	 */
	public short getCnst1300() throws CFException {
   		return work.getCnst1300();
	}

    /**
	 *	Returns the String value of cnst1300
	 *	@return cnst1300
	 */
	public char[]  getCnst1300ActualString() {
		return work.getCnst1300ActualString();
	}

	/**
	 *	Returns String value of cnst1300
	 *	@return cnst1300
	 */
	public char[]  getCnst1300String() throws CFException {
	     return String.valueOf(work.getCnst1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cnst1300IsNumeric()  throws CFException{
	    return work.cnst1300IsNumeric();
	}

	/**
	 * 	Update Cnst1300 with the passed value
	 *	@param number
	 */
	public void setCnst1300(short number)  throws CFException{
		work.setCnst1300(number);
	}
	
	public void setCnst1300(int number)  throws CFException{
	    work.setCnst1300(number);
	}
	public void setCnst1300(long number)  throws CFException{
	    work.setCnst1300(number);
	}
	

	
	/**
	 * 	Update Cnst1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst1300(char[] value)  throws CFException {
		work.setCnst1300(value);
	}
	
	/**
	 * 	Update Cnst1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst1300String(char[] value)  throws CFException{
		work.setCnst1300(value);
	}	


        public Mc154Ctx getMc154Ctx() {
            return Mc154Ctx.this;
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

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
