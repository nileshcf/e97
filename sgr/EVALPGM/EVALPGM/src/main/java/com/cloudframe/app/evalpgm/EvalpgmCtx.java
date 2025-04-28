package com.cloudframe.app.evalpgm;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.evalpgm.dto.Work;


@Context
public class EvalpgmCtx implements ProgramContext, Cloneable {
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

    public EvalpgmCtx clone() {
        EvalpgmCtx cloneObj = new EvalpgmCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class TestValuesInCtx implements Cloneable {
     Work work = EvalpgmCtx.this.getWork();

	/**
	 *	Returns the value of inpCountd
	 *	@return inpCountd
	 */
	public int getInpCountd() throws CFException {
   		return work.getInpCountd();
	}


	/**
	 *	Returns String value of inpCountd
	 *	@return inpCountd
	 */
	public char[]  getInpCountdString() throws CFException {
	     return String.valueOf(work.getInpCountdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inpCountdIsNumeric()  throws CFException{
	    return work.inpCountdIsNumeric();
	}

	/**
	 * 	Update InpCountd with the passed value
	 *	@param number
	 */
	public void setInpCountd(int number)  throws CFException{
		work.setInpCountd(number);
	}
	

	public void setInpCountd(long number)  throws CFException{
	    work.setInpCountd(number);
	}
	
	
	/**
	 * 	Update InpCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setInpCountd(char[] value)  throws CFException {
		work.setInpCountd(value);
	}
	
	/**
	 * 	Update InpCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInpCountdString(char[] value)  throws CFException{
		work.setInpCountd(value);
	}	


        public EvalpgmCtx getEvalpgmCtx() {
            return EvalpgmCtx.this;
        }

        public TestValuesOutCtx getTestValuesOutCtx() {
            return new TestValuesOutCtx();
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

    public TestValuesInCtx clone() {
        TestValuesInCtx cloneObj = new TestValuesInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TestValuesInCtx getTestValuesInCtx() {
            return new TestValuesInCtx();
    }
     public class TestValuesOutCtx implements Cloneable {
     Work work = EvalpgmCtx.this.getWork();

	/**
	 *	Returns the value of inpCountd
	 *	@return inpCountd
	 */
	public int getInpCountd() throws CFException {
   		return work.getInpCountd();
	}


	/**
	 *	Returns String value of inpCountd
	 *	@return inpCountd
	 */
	public char[]  getInpCountdString() throws CFException {
	     return String.valueOf(work.getInpCountdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inpCountdIsNumeric()  throws CFException{
	    return work.inpCountdIsNumeric();
	}

	/**
	 * 	Update InpCountd with the passed value
	 *	@param number
	 */
	public void setInpCountd(int number)  throws CFException{
		work.setInpCountd(number);
	}
	

	public void setInpCountd(long number)  throws CFException{
	    work.setInpCountd(number);
	}
	
	
	/**
	 * 	Update InpCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setInpCountd(char[] value)  throws CFException {
		work.setInpCountd(value);
	}
	
	/**
	 * 	Update InpCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInpCountdString(char[] value)  throws CFException{
		work.setInpCountd(value);
	}	


        public EvalpgmCtx getEvalpgmCtx() {
            return EvalpgmCtx.this;
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

    public TestValuesOutCtx clone() {
        TestValuesOutCtx cloneObj = new TestValuesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TestValuesOutCtx getTestValuesOutCtx() {
            return new TestValuesOutCtx();
    }
     public class TestEvaluateInCtx implements Cloneable {
     Work work = EvalpgmCtx.this.getWork();

	/**
	 *	Returns the value of outCountd
	 *	@return outCountd
	 */
	public int getOutCountd() throws CFException {
   		return work.getOutCountd();
	}


	/**
	 *	Returns String value of outCountd
	 *	@return outCountd
	 */
	public char[]  getOutCountdString() throws CFException {
	     return String.valueOf(work.getOutCountdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outCountdIsNumeric()  throws CFException{
	    return work.outCountdIsNumeric();
	}

	/**
	 * 	Update OutCountd with the passed value
	 *	@param number
	 */
	public void setOutCountd(int number)  throws CFException{
		work.setOutCountd(number);
	}
	

	public void setOutCountd(long number)  throws CFException{
	    work.setOutCountd(number);
	}
	
	
	/**
	 * 	Update OutCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutCountd(char[] value)  throws CFException {
		work.setOutCountd(value);
	}
	
	/**
	 * 	Update OutCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutCountdString(char[] value)  throws CFException{
		work.setOutCountd(value);
	}	


        public EvalpgmCtx getEvalpgmCtx() {
            return EvalpgmCtx.this;
        }

        public TestEvaluateOutCtx getTestEvaluateOutCtx() {
            return new TestEvaluateOutCtx();
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

    public TestEvaluateInCtx clone() {
        TestEvaluateInCtx cloneObj = new TestEvaluateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TestEvaluateInCtx getTestEvaluateInCtx() {
            return new TestEvaluateInCtx();
    }
     public class TestEvaluateOutCtx implements Cloneable {
     Work work = EvalpgmCtx.this.getWork();

	/**
	 *	Returns the value of outCountd
	 *	@return outCountd
	 */
	public int getOutCountd() throws CFException {
   		return work.getOutCountd();
	}


	/**
	 *	Returns String value of outCountd
	 *	@return outCountd
	 */
	public char[]  getOutCountdString() throws CFException {
	     return String.valueOf(work.getOutCountdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outCountdIsNumeric()  throws CFException{
	    return work.outCountdIsNumeric();
	}

	/**
	 * 	Update OutCountd with the passed value
	 *	@param number
	 */
	public void setOutCountd(int number)  throws CFException{
		work.setOutCountd(number);
	}
	

	public void setOutCountd(long number)  throws CFException{
	    work.setOutCountd(number);
	}
	
	
	/**
	 * 	Update OutCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutCountd(char[] value)  throws CFException {
		work.setOutCountd(value);
	}
	
	/**
	 * 	Update OutCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutCountdString(char[] value)  throws CFException{
		work.setOutCountd(value);
	}	


        public EvalpgmCtx getEvalpgmCtx() {
            return EvalpgmCtx.this;
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

    public TestEvaluateOutCtx clone() {
        TestEvaluateOutCtx cloneObj = new TestEvaluateOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TestEvaluateOutCtx getTestEvaluateOutCtx() {
            return new TestEvaluateOutCtx();
    }
     public class TestOutInCtx implements Cloneable {
     Work work = EvalpgmCtx.this.getWork();

	/**
	 *	Returns the value of inpCountd
	 *	@return inpCountd
	 */
	public int getInpCountd() throws CFException {
   		return work.getInpCountd();
	}


	/**
	 *	Returns String value of inpCountd
	 *	@return inpCountd
	 */
	public char[]  getInpCountdString() throws CFException {
	     return String.valueOf(work.getInpCountdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inpCountdIsNumeric()  throws CFException{
	    return work.inpCountdIsNumeric();
	}

	/**
	 * 	Update InpCountd with the passed value
	 *	@param number
	 */
	public void setInpCountd(int number)  throws CFException{
		work.setInpCountd(number);
	}
	

	public void setInpCountd(long number)  throws CFException{
	    work.setInpCountd(number);
	}
	
	
	/**
	 * 	Update InpCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setInpCountd(char[] value)  throws CFException {
		work.setInpCountd(value);
	}
	
	/**
	 * 	Update InpCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInpCountdString(char[] value)  throws CFException{
		work.setInpCountd(value);
	}	

	/**
	 *	Returns the value of outCountd
	 *	@return outCountd
	 */
	public int getOutCountd() throws CFException {
   		return work.getOutCountd();
	}


	/**
	 *	Returns String value of outCountd
	 *	@return outCountd
	 */
	public char[]  getOutCountdString() throws CFException {
	     return String.valueOf(work.getOutCountdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outCountdIsNumeric()  throws CFException{
	    return work.outCountdIsNumeric();
	}

	/**
	 * 	Update OutCountd with the passed value
	 *	@param number
	 */
	public void setOutCountd(int number)  throws CFException{
		work.setOutCountd(number);
	}
	

	public void setOutCountd(long number)  throws CFException{
	    work.setOutCountd(number);
	}
	
	
	/**
	 * 	Update OutCountd with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutCountd(char[] value)  throws CFException {
		work.setOutCountd(value);
	}
	
	/**
	 * 	Update OutCountd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutCountdString(char[] value)  throws CFException{
		work.setOutCountd(value);
	}	


        public EvalpgmCtx getEvalpgmCtx() {
            return EvalpgmCtx.this;
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

    public TestOutInCtx clone() {
        TestOutInCtx cloneObj = new TestOutInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TestOutInCtx getTestOutInCtx() {
            return new TestOutInCtx();
    }
}
