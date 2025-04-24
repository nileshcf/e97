package com.cloudframe.app.cfabcall;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfabcall.dto.AbendCodeGroup;
import com.cloudframe.app.cfabcall.dto.Work;
import com.cloudframe.app.cfabcall.dto.ErrorMessage;
import com.cloudframe.app.cfabcall.dto.Parm;


@Context
public class CfabcallCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Parm parm;
    Work work;
    ErrorMessage errorMessage;
    AbendCodeGroup abendCodeGroup;


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

    boolean doNotSkipInitialize = true;

    public boolean getDoNotSkipInitialize() {
        return this.doNotSkipInitialize;
    }

    public void setDoNotSkipInitialize(boolean doNotSkipInitialize) {
            this.doNotSkipInitialize = doNotSkipInitialize;
        }
    boolean doNotSkipAbend = true;

    public boolean getDoNotSkipAbend() {
        return this.doNotSkipAbend;
    }

    public void setDoNotSkipAbend(boolean doNotSkipAbend) {
            this.doNotSkipAbend = doNotSkipAbend;
        }

    public Parm getParm() {
        if (parm == null) {
            parm = new Parm();
        }

        return parm;
    }

    public void setParm(Parm parm) {
        this.parm = parm;
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
    public ErrorMessage getErrorMessage() {
        if (errorMessage == null) {
            errorMessage = new ErrorMessage();
        }

        return errorMessage;
    }

    public void setErrorMessage(ErrorMessage errorMessage) {
        this.errorMessage = errorMessage;
    }
    public AbendCodeGroup getAbendCodeGroup() {
        if (abendCodeGroup == null) {
            abendCodeGroup = new AbendCodeGroup();
        }

        return abendCodeGroup;
    }

    public void setAbendCodeGroup(AbendCodeGroup abendCodeGroup) {
        this.abendCodeGroup = abendCodeGroup;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parm.hashCode();
        str += work.hashCode();
        str += errorMessage.hashCode();
        str += abendCodeGroup.hashCode();
       return str.hashCode();
    }

    public CfabcallCtx clone() {
        CfabcallCtx cloneObj = new CfabcallCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.errorMessage = new ErrorMessage();
        cloneObj.errorMessage.set(errorMessage.getClonedField());
        cloneObj.abendCodeGroup = new AbendCodeGroup();
        cloneObj.abendCodeGroup.set(abendCodeGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parm parm = CfabcallCtx.this.getParm();


        public CfabcallCtx getCfabcallCtx() {
            return CfabcallCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parm.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class InitializeInCtx implements Cloneable {
     Parm parm = CfabcallCtx.this.getParm();
     Work work = CfabcallCtx.this.getWork();
     AbendCodeGroup abendCodeGroup = CfabcallCtx.this.getAbendCodeGroup();

	/**
	 *	Returns the value of abendCode01
	 *	@return abendCode01
	 */
	public int getAbendCode01() throws CFException {
   		return parm.getAbendCode01();
	}


	/**
	 *	Returns String value of abendCode01
	 *	@return abendCode01
	 */
	public char[]  getAbendCode01String() throws CFException {
	     return String.valueOf(parm.getAbendCode01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode01IsNumeric()  throws CFException{
	    return parm.abendCode01IsNumeric();
	}

	/**
	 * 	Update AbendCode01 with the passed value
	 *	@param number
	 */
	public void setAbendCode01(int number)  throws CFException{
		parm.setAbendCode01(number);
	}
	

	public void setAbendCode01(long number)  throws CFException{
	    parm.setAbendCode01(number);
	}
	
	
	/**
	 * 	Update AbendCode01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode01(char[] value)  throws CFException {
		parm.setAbendCode01(value);
	}
	
	/**
	 * 	Update AbendCode01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode01String(char[] value)  throws CFException{
		parm.setAbendCode01(value);
	}	


        public CfabcallCtx getCfabcallCtx() {
            return CfabcallCtx.this;
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
        str += parm.hashCode();
        str += work.hashCode();
        str += abendCodeGroup.hashCode();
       return str.hashCode();
    }

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendCodeGroup = new AbendCodeGroup();
        cloneObj.abendCodeGroup.set(abendCodeGroup.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Parm parm = CfabcallCtx.this.getParm();
     Work work = CfabcallCtx.this.getWork();
     AbendCodeGroup abendCodeGroup = CfabcallCtx.this.getAbendCodeGroup();

	/**
	 *	Returns the value of timing
	 *	@return timing
	 */
	public int getTiming() throws CFException {        
   		return work.getTiming();
	}
	
	/**
	 * 	Update Timing with the passed value
	 *	@param number
	 */
	public void setTiming(int number)  throws CFException{
		work.setTiming(number);
	}


	public void setTiming(long number)  throws CFException{
		work.setTiming((int)number);
	}


	/**
	 *	Returns the value of abendCode
	 *	@return abendCode
	 */
	public int getAbendCode() throws CFException {        
   		return abendCodeGroup.getAbendCode();
	}
	
	/**
	 * 	Update AbendCode with the passed value
	 *	@param number
	 */
	public void setAbendCode(int number)  throws CFException{
		abendCodeGroup.setAbendCode(number);
	}


	public void setAbendCode(long number)  throws CFException{
		abendCodeGroup.setAbendCode((int)number);
	}


	/**
	 *	Returns the value of abendCode01
	 *	@return abendCode01
	 */
	public int getAbendCode01() throws CFException {
   		return parm.getAbendCode01();
	}


	/**
	 *	Returns String value of abendCode01
	 *	@return abendCode01
	 */
	public char[]  getAbendCode01String() throws CFException {
	     return String.valueOf(parm.getAbendCode01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode01IsNumeric()  throws CFException{
	    return parm.abendCode01IsNumeric();
	}

	/**
	 * 	Update AbendCode01 with the passed value
	 *	@param number
	 */
	public void setAbendCode01(int number)  throws CFException{
		parm.setAbendCode01(number);
	}
	

	public void setAbendCode01(long number)  throws CFException{
	    parm.setAbendCode01(number);
	}
	
	
	/**
	 * 	Update AbendCode01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode01(char[] value)  throws CFException {
		parm.setAbendCode01(value);
	}
	
	/**
	 * 	Update AbendCode01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode01String(char[] value)  throws CFException{
		parm.setAbendCode01(value);
	}	

	/**
	 *	Returns the value of abendCodeCee
	 *	@return abendCodeCee
	 */
	public long getAbendCodeCee() throws CFException {        
   		return work.getAbendCodeCee();
	}
	
	/**
	 * 	Update AbendCodeCee with the passed value
	 *	@param number
	 */
	public void setAbendCodeCee(long number)  throws CFException{
		work.setAbendCodeCee(number);
	}




        public CfabcallCtx getCfabcallCtx() {
            return CfabcallCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parm.hashCode();
        str += work.hashCode();
        str += abendCodeGroup.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendCodeGroup = new AbendCodeGroup();
        cloneObj.abendCodeGroup.set(abendCodeGroup.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class AbendInCtx implements Cloneable {
     Parm parm = CfabcallCtx.this.getParm();
     Work work = CfabcallCtx.this.getWork();
     AbendCodeGroup abendCodeGroup = CfabcallCtx.this.getAbendCodeGroup();

	/**
	 *	Test condition "I" for isAbendIlboabn0()
	 *	@return  Returns true if isAbendIlboabn0() is "I"
	 */
   public boolean isAbendIlboabn0() throws CFException {
      return parm.isAbendIlboabn0();
   }

	/**
	*  set values "I"
	*/
   	public void setAbendIlboabn0True()  throws CFException{  			
    	parm.setAbendIlboabn0True();
   	}
	/**
	 *	Returns the value of timing
	 *	@return timing
	 */
	public int getTiming() throws CFException {        
   		return work.getTiming();
	}
	
	/**
	 * 	Update Timing with the passed value
	 *	@param number
	 */
	public void setTiming(int number)  throws CFException{
		work.setTiming(number);
	}


	public void setTiming(long number)  throws CFException{
		work.setTiming((int)number);
	}


	/**
	 *	Returns the value of abendCode
	 *	@return abendCode
	 */
	public int getAbendCode() throws CFException {        
   		return abendCodeGroup.getAbendCode();
	}
	
	/**
	 * 	Update AbendCode with the passed value
	 *	@param number
	 */
	public void setAbendCode(int number)  throws CFException{
		abendCodeGroup.setAbendCode(number);
	}


	public void setAbendCode(long number)  throws CFException{
		abendCodeGroup.setAbendCode((int)number);
	}


	/**
	 *	Test condition "C" for isAbendCee3abd()
	 *	@return  Returns true if isAbendCee3abd() is "C"
	 */
   public boolean isAbendCee3abd() throws CFException {
      return parm.isAbendCee3abd();
   }

	/**
	*  set values "C"
	*/
   	public void setAbendCee3abdTrue()  throws CFException{  			
    	parm.setAbendCee3abdTrue();
   	}
	/**
	 *	Returns the value of abendCodeCee
	 *	@return abendCodeCee
	 */
	public long getAbendCodeCee() throws CFException {        
   		return work.getAbendCodeCee();
	}
	
	/**
	 * 	Update AbendCodeCee with the passed value
	 *	@param number
	 */
	public void setAbendCodeCee(long number)  throws CFException{
		work.setAbendCodeCee(number);
	}




        public CfabcallCtx getCfabcallCtx() {
            return CfabcallCtx.this;
        }

        public AbendOutCtx getAbendOutCtx() {
            return new AbendOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parm.hashCode();
        str += work.hashCode();
        str += abendCodeGroup.hashCode();
       return str.hashCode();
    }

    public AbendInCtx clone() {
        AbendInCtx cloneObj = new AbendInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendCodeGroup = new AbendCodeGroup();
        cloneObj.abendCodeGroup.set(abendCodeGroup.getClonedField());
        return cloneObj;
    }

    }

    public AbendInCtx getAbendInCtx() {
            return new AbendInCtx();
    }
     public class AbendOutCtx implements Cloneable {
     Parm parm = CfabcallCtx.this.getParm();
     Work work = CfabcallCtx.this.getWork();
     AbendCodeGroup abendCodeGroup = CfabcallCtx.this.getAbendCodeGroup();

	/**
	 *	Returns the value of timing
	 *	@return timing
	 */
	public int getTiming() throws CFException {        
   		return work.getTiming();
	}
	
	/**
	 * 	Update Timing with the passed value
	 *	@param number
	 */
	public void setTiming(int number)  throws CFException{
		work.setTiming(number);
	}


	public void setTiming(long number)  throws CFException{
		work.setTiming((int)number);
	}


	/**
	 *	Returns the value of abendCode
	 *	@return abendCode
	 */
	public int getAbendCode() throws CFException {        
   		return abendCodeGroup.getAbendCode();
	}
	
	/**
	 * 	Update AbendCode with the passed value
	 *	@param number
	 */
	public void setAbendCode(int number)  throws CFException{
		abendCodeGroup.setAbendCode(number);
	}


	public void setAbendCode(long number)  throws CFException{
		abendCodeGroup.setAbendCode((int)number);
	}


	/**
	 *	Returns the value of abendCodeCee
	 *	@return abendCodeCee
	 */
	public long getAbendCodeCee() throws CFException {        
   		return work.getAbendCodeCee();
	}
	
	/**
	 * 	Update AbendCodeCee with the passed value
	 *	@param number
	 */
	public void setAbendCodeCee(long number)  throws CFException{
		work.setAbendCodeCee(number);
	}




        public CfabcallCtx getCfabcallCtx() {
            return CfabcallCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parm.hashCode();
        str += work.hashCode();
        str += abendCodeGroup.hashCode();
       return str.hashCode();
    }

    public AbendOutCtx clone() {
        AbendOutCtx cloneObj = new AbendOutCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendCodeGroup = new AbendCodeGroup();
        cloneObj.abendCodeGroup.set(abendCodeGroup.getClonedField());
        return cloneObj;
    }

    }

    public AbendOutCtx getAbendOutCtx() {
            return new AbendOutCtx();
    }
}
