package com.cloudframe.app.numeric0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.numeric0.dto.C584HbEqupSurchageOcc06;
import com.cloudframe.app.numeric0.dto.IntlRec;
import com.cloudframe.app.numeric0.dto.Work;
import com.cloudframe.app.numeric0.dto.C587HbEqupSurchageOcc06;
import com.cloudframe.app.numeric0.dto.MainHbEqupSurchageOcc06;
import com.cloudframe.app.numeric0.dto.C588HbEqupSurchageOcc06;
import com.cloudframe.app.numeric0.dto.C586HbEqupSurchageOcc06;
import com.cloudframe.app.numeric0.dto.C585HbEqupSurchageOcc06;


@Context
public class Numeric0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    C587HbEqupSurchageOcc06 c587HbEqupSurchageOcc06;
    MainHbEqupSurchageOcc06 mainHbEqupSurchageOcc06;
    Work work;
    C584HbEqupSurchageOcc06 c584HbEqupSurchageOcc06;
    C588HbEqupSurchageOcc06 c588HbEqupSurchageOcc06;
    C585HbEqupSurchageOcc06 c585HbEqupSurchageOcc06;
    C586HbEqupSurchageOcc06 c586HbEqupSurchageOcc06;
    IntlRec intlRec;


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


    public C587HbEqupSurchageOcc06 getC587HbEqupSurchageOcc06() {
        if (c587HbEqupSurchageOcc06 == null) {
            c587HbEqupSurchageOcc06 = new C587HbEqupSurchageOcc06();
        }

        return c587HbEqupSurchageOcc06;
    }

    public void setC587HbEqupSurchageOcc06(C587HbEqupSurchageOcc06 c587HbEqupSurchageOcc06) {
        this.c587HbEqupSurchageOcc06 = c587HbEqupSurchageOcc06;
    }
    public MainHbEqupSurchageOcc06 getMainHbEqupSurchageOcc06() {
        if (mainHbEqupSurchageOcc06 == null) {
            mainHbEqupSurchageOcc06 = new MainHbEqupSurchageOcc06();
        }

        return mainHbEqupSurchageOcc06;
    }

    public void setMainHbEqupSurchageOcc06(MainHbEqupSurchageOcc06 mainHbEqupSurchageOcc06) {
        this.mainHbEqupSurchageOcc06 = mainHbEqupSurchageOcc06;
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
    public C584HbEqupSurchageOcc06 getC584HbEqupSurchageOcc06() {
        if (c584HbEqupSurchageOcc06 == null) {
            c584HbEqupSurchageOcc06 = new C584HbEqupSurchageOcc06();
        }

        return c584HbEqupSurchageOcc06;
    }

    public void setC584HbEqupSurchageOcc06(C584HbEqupSurchageOcc06 c584HbEqupSurchageOcc06) {
        this.c584HbEqupSurchageOcc06 = c584HbEqupSurchageOcc06;
    }
    public C588HbEqupSurchageOcc06 getC588HbEqupSurchageOcc06() {
        if (c588HbEqupSurchageOcc06 == null) {
            c588HbEqupSurchageOcc06 = new C588HbEqupSurchageOcc06();
        }

        return c588HbEqupSurchageOcc06;
    }

    public void setC588HbEqupSurchageOcc06(C588HbEqupSurchageOcc06 c588HbEqupSurchageOcc06) {
        this.c588HbEqupSurchageOcc06 = c588HbEqupSurchageOcc06;
    }
    public C585HbEqupSurchageOcc06 getC585HbEqupSurchageOcc06() {
        if (c585HbEqupSurchageOcc06 == null) {
            c585HbEqupSurchageOcc06 = new C585HbEqupSurchageOcc06();
        }

        return c585HbEqupSurchageOcc06;
    }

    public void setC585HbEqupSurchageOcc06(C585HbEqupSurchageOcc06 c585HbEqupSurchageOcc06) {
        this.c585HbEqupSurchageOcc06 = c585HbEqupSurchageOcc06;
    }
    public C586HbEqupSurchageOcc06 getC586HbEqupSurchageOcc06() {
        if (c586HbEqupSurchageOcc06 == null) {
            c586HbEqupSurchageOcc06 = new C586HbEqupSurchageOcc06();
        }

        return c586HbEqupSurchageOcc06;
    }

    public void setC586HbEqupSurchageOcc06(C586HbEqupSurchageOcc06 c586HbEqupSurchageOcc06) {
        this.c586HbEqupSurchageOcc06 = c586HbEqupSurchageOcc06;
    }
    public IntlRec getIntlRec() {
        if (intlRec == null) {
            intlRec = new IntlRec();
        }

        return intlRec;
    }

    public void setIntlRec(IntlRec intlRec) {
        this.intlRec = intlRec;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += c587HbEqupSurchageOcc06.hashCode();
        str += mainHbEqupSurchageOcc06.hashCode();
        str += work.hashCode();
        str += c584HbEqupSurchageOcc06.hashCode();
        str += c588HbEqupSurchageOcc06.hashCode();
        str += c585HbEqupSurchageOcc06.hashCode();
        str += c586HbEqupSurchageOcc06.hashCode();
        str += intlRec.hashCode();
       return str.hashCode();
    }

    public Numeric0Ctx clone() {
        Numeric0Ctx cloneObj = new Numeric0Ctx();
        cloneObj.c587HbEqupSurchageOcc06 = new C587HbEqupSurchageOcc06();
        cloneObj.c587HbEqupSurchageOcc06.set(c587HbEqupSurchageOcc06.getClonedField());
        cloneObj.mainHbEqupSurchageOcc06 = new MainHbEqupSurchageOcc06();
        cloneObj.mainHbEqupSurchageOcc06.set(mainHbEqupSurchageOcc06.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.c584HbEqupSurchageOcc06 = new C584HbEqupSurchageOcc06();
        cloneObj.c584HbEqupSurchageOcc06.set(c584HbEqupSurchageOcc06.getClonedField());
        cloneObj.c588HbEqupSurchageOcc06 = new C588HbEqupSurchageOcc06();
        cloneObj.c588HbEqupSurchageOcc06.set(c588HbEqupSurchageOcc06.getClonedField());
        cloneObj.c585HbEqupSurchageOcc06 = new C585HbEqupSurchageOcc06();
        cloneObj.c585HbEqupSurchageOcc06.set(c585HbEqupSurchageOcc06.getClonedField());
        cloneObj.c586HbEqupSurchageOcc06 = new C586HbEqupSurchageOcc06();
        cloneObj.c586HbEqupSurchageOcc06.set(c586HbEqupSurchageOcc06.getClonedField());
        cloneObj.intlRec = new IntlRec();
        cloneObj.intlRec.set(intlRec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class SignLeadingInCtx implements Cloneable {
     MainHbEqupSurchageOcc06 mainHbEqupSurchageOcc06 = Numeric0Ctx.this.getMainHbEqupSurchageOcc06();
     C587HbEqupSurchageOcc06 c587HbEqupSurchageOcc06 = Numeric0Ctx.this.getC587HbEqupSurchageOcc06();
     Work work = Numeric0Ctx.this.getWork();
     C584HbEqupSurchageOcc06 c584HbEqupSurchageOcc06 = Numeric0Ctx.this.getC584HbEqupSurchageOcc06();
     C585HbEqupSurchageOcc06 c585HbEqupSurchageOcc06 = Numeric0Ctx.this.getC585HbEqupSurchageOcc06();
     C588HbEqupSurchageOcc06 c588HbEqupSurchageOcc06 = Numeric0Ctx.this.getC588HbEqupSurchageOcc06();
     C586HbEqupSurchageOcc06 c586HbEqupSurchageOcc06 = Numeric0Ctx.this.getC586HbEqupSurchageOcc06();

	/**
	 *	Returns the value of mainHbEqupSurchageOcc06
	 *	@return mainHbEqupSurchageOcc06
	 */   
	 public MainHbEqupSurchageOcc06 getMainHbEqupSurchageOcc06() {
   	return mainHbEqupSurchageOcc06;
   }


	/**
	 *	Returns the value of c587HbEqupSurchageOcc06
	 *	@return c587HbEqupSurchageOcc06
	 */   
	 public C587HbEqupSurchageOcc06 getC587HbEqupSurchageOcc06() {
   	return c587HbEqupSurchageOcc06;
   }


	/**
	 *	Returns the value of c584HbEqupSurchageOcc06
	 *	@return c584HbEqupSurchageOcc06
	 */   
	 public C584HbEqupSurchageOcc06 getC584HbEqupSurchageOcc06() {
   	return c584HbEqupSurchageOcc06;
   }


	/**
	 *	Returns the value of c585HbEqupSurchageOcc06
	 *	@return c585HbEqupSurchageOcc06
	 */   
	 public C585HbEqupSurchageOcc06 getC585HbEqupSurchageOcc06() {
   	return c585HbEqupSurchageOcc06;
   }


	/**
	 *	Returns the value of c588HbEqupSurchageOcc06
	 *	@return c588HbEqupSurchageOcc06
	 */   
	 public C588HbEqupSurchageOcc06 getC588HbEqupSurchageOcc06() {
   	return c588HbEqupSurchageOcc06;
   }


	/**
	 *	Returns the value of c586HbEqupSurchageOcc06
	 *	@return c586HbEqupSurchageOcc06
	 */   
	 public C586HbEqupSurchageOcc06 getC586HbEqupSurchageOcc06() {
   	return c586HbEqupSurchageOcc06;
   }



        public Numeric0Ctx getNumeric0Ctx() {
            return Numeric0Ctx.this;
        }

        public SignLeadingOutCtx getSignLeadingOutCtx() {
            return new SignLeadingOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mainHbEqupSurchageOcc06.hashCode();
        str += c587HbEqupSurchageOcc06.hashCode();
        str += work.hashCode();
        str += c584HbEqupSurchageOcc06.hashCode();
        str += c585HbEqupSurchageOcc06.hashCode();
        str += c588HbEqupSurchageOcc06.hashCode();
        str += c586HbEqupSurchageOcc06.hashCode();
       return str.hashCode();
    }

    public SignLeadingInCtx clone() {
        SignLeadingInCtx cloneObj = new SignLeadingInCtx();
        cloneObj.mainHbEqupSurchageOcc06 = new MainHbEqupSurchageOcc06();
        cloneObj.mainHbEqupSurchageOcc06.set(mainHbEqupSurchageOcc06.getClonedField());
        cloneObj.c587HbEqupSurchageOcc06 = new C587HbEqupSurchageOcc06();
        cloneObj.c587HbEqupSurchageOcc06.set(c587HbEqupSurchageOcc06.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.c584HbEqupSurchageOcc06 = new C584HbEqupSurchageOcc06();
        cloneObj.c584HbEqupSurchageOcc06.set(c584HbEqupSurchageOcc06.getClonedField());
        cloneObj.c585HbEqupSurchageOcc06 = new C585HbEqupSurchageOcc06();
        cloneObj.c585HbEqupSurchageOcc06.set(c585HbEqupSurchageOcc06.getClonedField());
        cloneObj.c588HbEqupSurchageOcc06 = new C588HbEqupSurchageOcc06();
        cloneObj.c588HbEqupSurchageOcc06.set(c588HbEqupSurchageOcc06.getClonedField());
        cloneObj.c586HbEqupSurchageOcc06 = new C586HbEqupSurchageOcc06();
        cloneObj.c586HbEqupSurchageOcc06.set(c586HbEqupSurchageOcc06.getClonedField());
        return cloneObj;
    }

    }

    public SignLeadingInCtx getSignLeadingInCtx() {
            return new SignLeadingInCtx();
    }
     public class SignLeadingOutCtx implements Cloneable {
     MainHbEqupSurchageOcc06 mainHbEqupSurchageOcc06 = Numeric0Ctx.this.getMainHbEqupSurchageOcc06();
     C587HbEqupSurchageOcc06 c587HbEqupSurchageOcc06 = Numeric0Ctx.this.getC587HbEqupSurchageOcc06();
     Work work = Numeric0Ctx.this.getWork();
     C584HbEqupSurchageOcc06 c584HbEqupSurchageOcc06 = Numeric0Ctx.this.getC584HbEqupSurchageOcc06();
     C585HbEqupSurchageOcc06 c585HbEqupSurchageOcc06 = Numeric0Ctx.this.getC585HbEqupSurchageOcc06();
     C588HbEqupSurchageOcc06 c588HbEqupSurchageOcc06 = Numeric0Ctx.this.getC588HbEqupSurchageOcc06();
     C586HbEqupSurchageOcc06 c586HbEqupSurchageOcc06 = Numeric0Ctx.this.getC586HbEqupSurchageOcc06();

	/**
	 *	Returns the value of c587HbTotVzwSurchgAmt
	 *	@return c587HbTotVzwSurchgAmt
	 */
	public BigDecimal getC587HbTotVzwSurchgAmt() throws CFException {
   		return c587HbEqupSurchageOcc06.getC587HbTotVzwSurchgAmt();
	}

    /**
	 *	Returns the String value of c587HbTotVzwSurchgAmt
	 *	@return c587HbTotVzwSurchgAmt
	 */
	public char[]  getC587HbTotVzwSurchgAmtActualString()  throws CFException{
	    return c587HbEqupSurchageOcc06.getC587HbTotVzwSurchgAmtActualString();
	}

	 /**
     *	Returns String value of c587HbTotVzwSurchgAmt
     *	@return c587HbTotVzwSurchgAmt
     */
    public char[]  getC587HbTotVzwSurchgAmtString() throws CFException {
         return c587HbEqupSurchageOcc06.getC587HbTotVzwSurchgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c587HbTotVzwSurchgAmtIsNumeric() {
        return c587HbEqupSurchageOcc06.c587HbTotVzwSurchgAmtIsNumeric();
    }
	/**
	 * 	Update C587HbTotVzwSurchgAmt with the passed number
	 *	@param number
	 */
	public void setC587HbTotVzwSurchgAmt(BigDecimal number)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbTotVzwSurchgAmt(number);
   }

	/**
	 * 	Update C587HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC587HbTotVzwSurchgAmt(char[] value)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbTotVzwSurchgAmt(value);
	}   

	/**
	 *	Returns the value of mainHbEqupSurchageOcc06
	 *	@return mainHbEqupSurchageOcc06
	 */   
	 public MainHbEqupSurchageOcc06 getMainHbEqupSurchageOcc06() {
   	return mainHbEqupSurchageOcc06;
   }


	/**
	 *	Returns the value of c587HbVzwAdminChgAmt
	 *	@return c587HbVzwAdminChgAmt
	 */
	public BigDecimal getC587HbVzwAdminChgAmt() throws CFException {
   		return c587HbEqupSurchageOcc06.getC587HbVzwAdminChgAmt();
	}

    /**
	 *	Returns the String value of c587HbVzwAdminChgAmt
	 *	@return c587HbVzwAdminChgAmt
	 */
	public char[]  getC587HbVzwAdminChgAmtActualString()  throws CFException{
	    return c587HbEqupSurchageOcc06.getC587HbVzwAdminChgAmtActualString();
	}

	 /**
     *	Returns String value of c587HbVzwAdminChgAmt
     *	@return c587HbVzwAdminChgAmt
     */
    public char[]  getC587HbVzwAdminChgAmtString() throws CFException {
         return c587HbEqupSurchageOcc06.getC587HbVzwAdminChgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c587HbVzwAdminChgAmtIsNumeric() {
        return c587HbEqupSurchageOcc06.c587HbVzwAdminChgAmtIsNumeric();
    }
	/**
	 * 	Update C587HbVzwAdminChgAmt with the passed number
	 *	@param number
	 */
	public void setC587HbVzwAdminChgAmt(BigDecimal number)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbVzwAdminChgAmt(number);
   }

	/**
	 * 	Update C587HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC587HbVzwAdminChgAmt(char[] value)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbVzwAdminChgAmt(value);
	}   

	/**
	 *	Returns the value of c584HbRegulatoryCharg
	 *	@return c584HbRegulatoryCharg
	 */
	public BigDecimal getC584HbRegulatoryCharg() throws CFException {
   		return c584HbEqupSurchageOcc06.getC584HbRegulatoryCharg();
	}

    /**
	 *	Returns the String value of c584HbRegulatoryCharg
	 *	@return c584HbRegulatoryCharg
	 */
	public char[]  getC584HbRegulatoryChargActualString()  throws CFException{
	    return c584HbEqupSurchageOcc06.getC584HbRegulatoryChargActualString();
	}

	 /**
     *	Returns String value of c584HbRegulatoryCharg
     *	@return c584HbRegulatoryCharg
     */
    public char[]  getC584HbRegulatoryChargString() throws CFException {
         return c584HbEqupSurchageOcc06.getC584HbRegulatoryChargString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c584HbRegulatoryChargIsNumeric() {
        return c584HbEqupSurchageOcc06.c584HbRegulatoryChargIsNumeric();
    }
	/**
	 * 	Update C584HbRegulatoryCharg with the passed number
	 *	@param number
	 */
	public void setC584HbRegulatoryCharg(BigDecimal number)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbRegulatoryCharg(number);
   }

	/**
	 * 	Update C584HbRegulatoryCharg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC584HbRegulatoryCharg(char[] value)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbRegulatoryCharg(value);
	}   

	/**
	 *	Returns the value of c587HbFusfRate
	 *	@return c587HbFusfRate
	 */
	public BigDecimal getC587HbFusfRate() throws CFException {
   		return c587HbEqupSurchageOcc06.getC587HbFusfRate();
	}

    /**
	 *	Returns the String value of c587HbFusfRate
	 *	@return c587HbFusfRate
	 */
	public char[]  getC587HbFusfRateActualString()  throws CFException{
	    return c587HbEqupSurchageOcc06.getC587HbFusfRateActualString();
	}

	 /**
     *	Returns String value of c587HbFusfRate
     *	@return c587HbFusfRate
     */
    public char[]  getC587HbFusfRateString() throws CFException {
         return c587HbEqupSurchageOcc06.getC587HbFusfRateString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c587HbFusfRateIsNumeric() {
        return c587HbEqupSurchageOcc06.c587HbFusfRateIsNumeric();
    }
	/**
	 * 	Update C587HbFusfRate with the passed number
	 *	@param number
	 */
	public void setC587HbFusfRate(BigDecimal number)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbFusfRate(number);
   }

	/**
	 * 	Update C587HbFusfRate with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC587HbFusfRate(char[] value)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbFusfRate(value);
	}   

	/**
	 *	Returns the value of c584HbFusfRate
	 *	@return c584HbFusfRate
	 */
	public BigDecimal getC584HbFusfRate() throws CFException {
   		return c584HbEqupSurchageOcc06.getC584HbFusfRate();
	}

    /**
	 *	Returns the String value of c584HbFusfRate
	 *	@return c584HbFusfRate
	 */
	public char[]  getC584HbFusfRateActualString()  throws CFException{
	    return c584HbEqupSurchageOcc06.getC584HbFusfRateActualString();
	}

	 /**
     *	Returns String value of c584HbFusfRate
     *	@return c584HbFusfRate
     */
    public char[]  getC584HbFusfRateString() throws CFException {
         return c584HbEqupSurchageOcc06.getC584HbFusfRateString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c584HbFusfRateIsNumeric() {
        return c584HbEqupSurchageOcc06.c584HbFusfRateIsNumeric();
    }
	/**
	 * 	Update C584HbFusfRate with the passed number
	 *	@param number
	 */
	public void setC584HbFusfRate(BigDecimal number)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbFusfRate(number);
   }

	/**
	 * 	Update C584HbFusfRate with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC584HbFusfRate(char[] value)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbFusfRate(value);
	}   

	/**
	 *	Returns the value of c588HbTotVzwSurchgAmt
	 *	@return c588HbTotVzwSurchgAmt
	 */
	public BigDecimal getC588HbTotVzwSurchgAmt() throws CFException {
   		return c588HbEqupSurchageOcc06.getC588HbTotVzwSurchgAmt();
	}

    /**
	 *	Returns the String value of c588HbTotVzwSurchgAmt
	 *	@return c588HbTotVzwSurchgAmt
	 */
	public char[]  getC588HbTotVzwSurchgAmtActualString()  throws CFException{
	    return c588HbEqupSurchageOcc06.getC588HbTotVzwSurchgAmtActualString();
	}

	 /**
     *	Returns String value of c588HbTotVzwSurchgAmt
     *	@return c588HbTotVzwSurchgAmt
     */
    public char[]  getC588HbTotVzwSurchgAmtString() throws CFException {
         return c588HbEqupSurchageOcc06.getC588HbTotVzwSurchgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c588HbTotVzwSurchgAmtIsNumeric() {
        return c588HbEqupSurchageOcc06.c588HbTotVzwSurchgAmtIsNumeric();
    }
	/**
	 * 	Update C588HbTotVzwSurchgAmt with the passed number
	 *	@param number
	 */
	public void setC588HbTotVzwSurchgAmt(BigDecimal number)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbTotVzwSurchgAmt(number);
   }

	/**
	 * 	Update C588HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC588HbTotVzwSurchgAmt(char[] value)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbTotVzwSurchgAmt(value);
	}   

	/**
	 *	Returns the value of c585HbTotVzwSurchgAmt
	 *	@return c585HbTotVzwSurchgAmt
	 */
	public BigDecimal getC585HbTotVzwSurchgAmt() throws CFException {
   		return c585HbEqupSurchageOcc06.getC585HbTotVzwSurchgAmt();
	}

    /**
	 *	Returns the String value of c585HbTotVzwSurchgAmt
	 *	@return c585HbTotVzwSurchgAmt
	 */
	public char[]  getC585HbTotVzwSurchgAmtActualString()  throws CFException{
	    return c585HbEqupSurchageOcc06.getC585HbTotVzwSurchgAmtActualString();
	}

	 /**
     *	Returns String value of c585HbTotVzwSurchgAmt
     *	@return c585HbTotVzwSurchgAmt
     */
    public char[]  getC585HbTotVzwSurchgAmtString() throws CFException {
         return c585HbEqupSurchageOcc06.getC585HbTotVzwSurchgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c585HbTotVzwSurchgAmtIsNumeric() {
        return c585HbEqupSurchageOcc06.c585HbTotVzwSurchgAmtIsNumeric();
    }
	/**
	 * 	Update C585HbTotVzwSurchgAmt with the passed number
	 *	@param number
	 */
	public void setC585HbTotVzwSurchgAmt(BigDecimal number)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbTotVzwSurchgAmt(number);
   }

	/**
	 * 	Update C585HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC585HbTotVzwSurchgAmt(char[] value)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbTotVzwSurchgAmt(value);
	}   

	/**
	 *	Returns the value of c587HbRegulatoryCharg
	 *	@return c587HbRegulatoryCharg
	 */
	public BigDecimal getC587HbRegulatoryCharg() throws CFException {
   		return c587HbEqupSurchageOcc06.getC587HbRegulatoryCharg();
	}

    /**
	 *	Returns the String value of c587HbRegulatoryCharg
	 *	@return c587HbRegulatoryCharg
	 */
	public char[]  getC587HbRegulatoryChargActualString()  throws CFException{
	    return c587HbEqupSurchageOcc06.getC587HbRegulatoryChargActualString();
	}

	 /**
     *	Returns String value of c587HbRegulatoryCharg
     *	@return c587HbRegulatoryCharg
     */
    public char[]  getC587HbRegulatoryChargString() throws CFException {
         return c587HbEqupSurchageOcc06.getC587HbRegulatoryChargString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c587HbRegulatoryChargIsNumeric() {
        return c587HbEqupSurchageOcc06.c587HbRegulatoryChargIsNumeric();
    }
	/**
	 * 	Update C587HbRegulatoryCharg with the passed number
	 *	@param number
	 */
	public void setC587HbRegulatoryCharg(BigDecimal number)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbRegulatoryCharg(number);
   }

	/**
	 * 	Update C587HbRegulatoryCharg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC587HbRegulatoryCharg(char[] value)  throws CFException{
		c587HbEqupSurchageOcc06.setC587HbRegulatoryCharg(value);
	}   

	/**
	 *	Returns the value of c588HbVzwAdminChgAmt
	 *	@return c588HbVzwAdminChgAmt
	 */
	public BigDecimal getC588HbVzwAdminChgAmt() throws CFException {
   		return c588HbEqupSurchageOcc06.getC588HbVzwAdminChgAmt();
	}

    /**
	 *	Returns the String value of c588HbVzwAdminChgAmt
	 *	@return c588HbVzwAdminChgAmt
	 */
	public char[]  getC588HbVzwAdminChgAmtActualString()  throws CFException{
	    return c588HbEqupSurchageOcc06.getC588HbVzwAdminChgAmtActualString();
	}

	 /**
     *	Returns String value of c588HbVzwAdminChgAmt
     *	@return c588HbVzwAdminChgAmt
     */
    public char[]  getC588HbVzwAdminChgAmtString() throws CFException {
         return c588HbEqupSurchageOcc06.getC588HbVzwAdminChgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c588HbVzwAdminChgAmtIsNumeric() {
        return c588HbEqupSurchageOcc06.c588HbVzwAdminChgAmtIsNumeric();
    }
	/**
	 * 	Update C588HbVzwAdminChgAmt with the passed number
	 *	@param number
	 */
	public void setC588HbVzwAdminChgAmt(BigDecimal number)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbVzwAdminChgAmt(number);
   }

	/**
	 * 	Update C588HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC588HbVzwAdminChgAmt(char[] value)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbVzwAdminChgAmt(value);
	}   

	/**
	 *	Returns the value of c584HbVzwAdminChgAmt
	 *	@return c584HbVzwAdminChgAmt
	 */
	public BigDecimal getC584HbVzwAdminChgAmt() throws CFException {
   		return c584HbEqupSurchageOcc06.getC584HbVzwAdminChgAmt();
	}

    /**
	 *	Returns the String value of c584HbVzwAdminChgAmt
	 *	@return c584HbVzwAdminChgAmt
	 */
	public char[]  getC584HbVzwAdminChgAmtActualString()  throws CFException{
	    return c584HbEqupSurchageOcc06.getC584HbVzwAdminChgAmtActualString();
	}

	 /**
     *	Returns String value of c584HbVzwAdminChgAmt
     *	@return c584HbVzwAdminChgAmt
     */
    public char[]  getC584HbVzwAdminChgAmtString() throws CFException {
         return c584HbEqupSurchageOcc06.getC584HbVzwAdminChgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c584HbVzwAdminChgAmtIsNumeric() {
        return c584HbEqupSurchageOcc06.c584HbVzwAdminChgAmtIsNumeric();
    }
	/**
	 * 	Update C584HbVzwAdminChgAmt with the passed number
	 *	@param number
	 */
	public void setC584HbVzwAdminChgAmt(BigDecimal number)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbVzwAdminChgAmt(number);
   }

	/**
	 * 	Update C584HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC584HbVzwAdminChgAmt(char[] value)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbVzwAdminChgAmt(value);
	}   

	/**
	 *	Returns the value of c585HbRegulatoryCharg
	 *	@return c585HbRegulatoryCharg
	 */
	public BigDecimal getC585HbRegulatoryCharg() throws CFException {
   		return c585HbEqupSurchageOcc06.getC585HbRegulatoryCharg();
	}

    /**
	 *	Returns the String value of c585HbRegulatoryCharg
	 *	@return c585HbRegulatoryCharg
	 */
	public char[]  getC585HbRegulatoryChargActualString()  throws CFException{
	    return c585HbEqupSurchageOcc06.getC585HbRegulatoryChargActualString();
	}

	 /**
     *	Returns String value of c585HbRegulatoryCharg
     *	@return c585HbRegulatoryCharg
     */
    public char[]  getC585HbRegulatoryChargString() throws CFException {
         return c585HbEqupSurchageOcc06.getC585HbRegulatoryChargString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c585HbRegulatoryChargIsNumeric() {
        return c585HbEqupSurchageOcc06.c585HbRegulatoryChargIsNumeric();
    }
	/**
	 * 	Update C585HbRegulatoryCharg with the passed number
	 *	@param number
	 */
	public void setC585HbRegulatoryCharg(BigDecimal number)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbRegulatoryCharg(number);
   }

	/**
	 * 	Update C585HbRegulatoryCharg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC585HbRegulatoryCharg(char[] value)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbRegulatoryCharg(value);
	}   

	/**
	 *	Returns the value of c586HbTotVzwSurchgAmt
	 *	@return c586HbTotVzwSurchgAmt
	 */
	public BigDecimal getC586HbTotVzwSurchgAmt() throws CFException {
   		return c586HbEqupSurchageOcc06.getC586HbTotVzwSurchgAmt();
	}

    /**
	 *	Returns the String value of c586HbTotVzwSurchgAmt
	 *	@return c586HbTotVzwSurchgAmt
	 */
	public char[]  getC586HbTotVzwSurchgAmtActualString()  throws CFException{
	    return c586HbEqupSurchageOcc06.getC586HbTotVzwSurchgAmtActualString();
	}

	 /**
     *	Returns String value of c586HbTotVzwSurchgAmt
     *	@return c586HbTotVzwSurchgAmt
     */
    public char[]  getC586HbTotVzwSurchgAmtString() throws CFException {
         return c586HbEqupSurchageOcc06.getC586HbTotVzwSurchgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c586HbTotVzwSurchgAmtIsNumeric() {
        return c586HbEqupSurchageOcc06.c586HbTotVzwSurchgAmtIsNumeric();
    }
	/**
	 * 	Update C586HbTotVzwSurchgAmt with the passed number
	 *	@param number
	 */
	public void setC586HbTotVzwSurchgAmt(BigDecimal number)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbTotVzwSurchgAmt(number);
   }

	/**
	 * 	Update C586HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC586HbTotVzwSurchgAmt(char[] value)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbTotVzwSurchgAmt(value);
	}   

	/**
	 *	Returns the value of mainHbFusfRate
	 *	@return mainHbFusfRate
	 */
	public BigDecimal getMainHbFusfRate() throws CFException {
   		return mainHbEqupSurchageOcc06.getMainHbFusfRate();
	}

    /**
	 *	Returns the String value of mainHbFusfRate
	 *	@return mainHbFusfRate
	 */
	public char[]  getMainHbFusfRateActualString()  throws CFException{
	    return mainHbEqupSurchageOcc06.getMainHbFusfRateActualString();
	}

	 /**
     *	Returns String value of mainHbFusfRate
     *	@return mainHbFusfRate
     */
    public char[]  getMainHbFusfRateString() throws CFException {
         return mainHbEqupSurchageOcc06.getMainHbFusfRateString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean mainHbFusfRateIsNumeric() {
        return mainHbEqupSurchageOcc06.mainHbFusfRateIsNumeric();
    }
	/**
	 * 	Update MainHbFusfRate with the passed number
	 *	@param number
	 */
	public void setMainHbFusfRate(BigDecimal number)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbFusfRate(number);
   }

	/**
	 * 	Update MainHbFusfRate with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMainHbFusfRate(char[] value)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbFusfRate(value);
	}   

	/**
	 *	Returns the value of c588HbFusfRate
	 *	@return c588HbFusfRate
	 */
	public BigDecimal getC588HbFusfRate() throws CFException {
   		return c588HbEqupSurchageOcc06.getC588HbFusfRate();
	}

    /**
	 *	Returns the String value of c588HbFusfRate
	 *	@return c588HbFusfRate
	 */
	public char[]  getC588HbFusfRateActualString()  throws CFException{
	    return c588HbEqupSurchageOcc06.getC588HbFusfRateActualString();
	}

	 /**
     *	Returns String value of c588HbFusfRate
     *	@return c588HbFusfRate
     */
    public char[]  getC588HbFusfRateString() throws CFException {
         return c588HbEqupSurchageOcc06.getC588HbFusfRateString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c588HbFusfRateIsNumeric() {
        return c588HbEqupSurchageOcc06.c588HbFusfRateIsNumeric();
    }
	/**
	 * 	Update C588HbFusfRate with the passed number
	 *	@param number
	 */
	public void setC588HbFusfRate(BigDecimal number)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbFusfRate(number);
   }

	/**
	 * 	Update C588HbFusfRate with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC588HbFusfRate(char[] value)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbFusfRate(value);
	}   

	/**
	 *	Returns the value of c586HbFusfRate
	 *	@return c586HbFusfRate
	 */
	public BigDecimal getC586HbFusfRate() throws CFException {
   		return c586HbEqupSurchageOcc06.getC586HbFusfRate();
	}

    /**
	 *	Returns the String value of c586HbFusfRate
	 *	@return c586HbFusfRate
	 */
	public char[]  getC586HbFusfRateActualString()  throws CFException{
	    return c586HbEqupSurchageOcc06.getC586HbFusfRateActualString();
	}

	 /**
     *	Returns String value of c586HbFusfRate
     *	@return c586HbFusfRate
     */
    public char[]  getC586HbFusfRateString() throws CFException {
         return c586HbEqupSurchageOcc06.getC586HbFusfRateString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c586HbFusfRateIsNumeric() {
        return c586HbEqupSurchageOcc06.c586HbFusfRateIsNumeric();
    }
	/**
	 * 	Update C586HbFusfRate with the passed number
	 *	@param number
	 */
	public void setC586HbFusfRate(BigDecimal number)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbFusfRate(number);
   }

	/**
	 * 	Update C586HbFusfRate with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC586HbFusfRate(char[] value)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbFusfRate(value);
	}   

	/**
	 *	Returns the value of c585HbVzwAdminChgAmt
	 *	@return c585HbVzwAdminChgAmt
	 */
	public BigDecimal getC585HbVzwAdminChgAmt() throws CFException {
   		return c585HbEqupSurchageOcc06.getC585HbVzwAdminChgAmt();
	}

    /**
	 *	Returns the String value of c585HbVzwAdminChgAmt
	 *	@return c585HbVzwAdminChgAmt
	 */
	public char[]  getC585HbVzwAdminChgAmtActualString()  throws CFException{
	    return c585HbEqupSurchageOcc06.getC585HbVzwAdminChgAmtActualString();
	}

	 /**
     *	Returns String value of c585HbVzwAdminChgAmt
     *	@return c585HbVzwAdminChgAmt
     */
    public char[]  getC585HbVzwAdminChgAmtString() throws CFException {
         return c585HbEqupSurchageOcc06.getC585HbVzwAdminChgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c585HbVzwAdminChgAmtIsNumeric() {
        return c585HbEqupSurchageOcc06.c585HbVzwAdminChgAmtIsNumeric();
    }
	/**
	 * 	Update C585HbVzwAdminChgAmt with the passed number
	 *	@param number
	 */
	public void setC585HbVzwAdminChgAmt(BigDecimal number)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbVzwAdminChgAmt(number);
   }

	/**
	 * 	Update C585HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC585HbVzwAdminChgAmt(char[] value)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbVzwAdminChgAmt(value);
	}   

	/**
	 *	Returns the value of acctHbEqupSurchageOcc06
	 *	@return acctHbEqupSurchageOcc06
	 */
   public char[] getAcctHbEqupSurchageOcc06() throws CFException  {              
   		return work.getAcctHbEqupSurchageOcc06();
   }

  
	/**
	*  set variable acctHbEqupSurchageOcc06
	*  @param value
	**/
   public void setAcctHbEqupSurchageOcc06(char[] value) throws CFException {
      work.setAcctHbEqupSurchageOcc06(value);
   } 

	/**
	 *	Returns the value of c585HbFusfRate
	 *	@return c585HbFusfRate
	 */
	public BigDecimal getC585HbFusfRate() throws CFException {
   		return c585HbEqupSurchageOcc06.getC585HbFusfRate();
	}

    /**
	 *	Returns the String value of c585HbFusfRate
	 *	@return c585HbFusfRate
	 */
	public char[]  getC585HbFusfRateActualString()  throws CFException{
	    return c585HbEqupSurchageOcc06.getC585HbFusfRateActualString();
	}

	 /**
     *	Returns String value of c585HbFusfRate
     *	@return c585HbFusfRate
     */
    public char[]  getC585HbFusfRateString() throws CFException {
         return c585HbEqupSurchageOcc06.getC585HbFusfRateString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c585HbFusfRateIsNumeric() {
        return c585HbEqupSurchageOcc06.c585HbFusfRateIsNumeric();
    }
	/**
	 * 	Update C585HbFusfRate with the passed number
	 *	@param number
	 */
	public void setC585HbFusfRate(BigDecimal number)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbFusfRate(number);
   }

	/**
	 * 	Update C585HbFusfRate with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC585HbFusfRate(char[] value)  throws CFException{
		c585HbEqupSurchageOcc06.setC585HbFusfRate(value);
	}   

	/**
	 *	Returns the value of c588HbRegulatoryCharg
	 *	@return c588HbRegulatoryCharg
	 */
	public BigDecimal getC588HbRegulatoryCharg() throws CFException {
   		return c588HbEqupSurchageOcc06.getC588HbRegulatoryCharg();
	}

    /**
	 *	Returns the String value of c588HbRegulatoryCharg
	 *	@return c588HbRegulatoryCharg
	 */
	public char[]  getC588HbRegulatoryChargActualString()  throws CFException{
	    return c588HbEqupSurchageOcc06.getC588HbRegulatoryChargActualString();
	}

	 /**
     *	Returns String value of c588HbRegulatoryCharg
     *	@return c588HbRegulatoryCharg
     */
    public char[]  getC588HbRegulatoryChargString() throws CFException {
         return c588HbEqupSurchageOcc06.getC588HbRegulatoryChargString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c588HbRegulatoryChargIsNumeric() {
        return c588HbEqupSurchageOcc06.c588HbRegulatoryChargIsNumeric();
    }
	/**
	 * 	Update C588HbRegulatoryCharg with the passed number
	 *	@param number
	 */
	public void setC588HbRegulatoryCharg(BigDecimal number)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbRegulatoryCharg(number);
   }

	/**
	 * 	Update C588HbRegulatoryCharg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC588HbRegulatoryCharg(char[] value)  throws CFException{
		c588HbEqupSurchageOcc06.setC588HbRegulatoryCharg(value);
	}   

	/**
	 *	Returns the value of mainHbVzwAdminChgAmt
	 *	@return mainHbVzwAdminChgAmt
	 */
	public BigDecimal getMainHbVzwAdminChgAmt() throws CFException {
   		return mainHbEqupSurchageOcc06.getMainHbVzwAdminChgAmt();
	}

    /**
	 *	Returns the String value of mainHbVzwAdminChgAmt
	 *	@return mainHbVzwAdminChgAmt
	 */
	public char[]  getMainHbVzwAdminChgAmtActualString()  throws CFException{
	    return mainHbEqupSurchageOcc06.getMainHbVzwAdminChgAmtActualString();
	}

	 /**
     *	Returns String value of mainHbVzwAdminChgAmt
     *	@return mainHbVzwAdminChgAmt
     */
    public char[]  getMainHbVzwAdminChgAmtString() throws CFException {
         return mainHbEqupSurchageOcc06.getMainHbVzwAdminChgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean mainHbVzwAdminChgAmtIsNumeric() {
        return mainHbEqupSurchageOcc06.mainHbVzwAdminChgAmtIsNumeric();
    }
	/**
	 * 	Update MainHbVzwAdminChgAmt with the passed number
	 *	@param number
	 */
	public void setMainHbVzwAdminChgAmt(BigDecimal number)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbVzwAdminChgAmt(number);
   }

	/**
	 * 	Update MainHbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMainHbVzwAdminChgAmt(char[] value)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbVzwAdminChgAmt(value);
	}   

	/**
	 *	Returns the value of mainHbRegulatoryCharg
	 *	@return mainHbRegulatoryCharg
	 */
	public BigDecimal getMainHbRegulatoryCharg() throws CFException {
   		return mainHbEqupSurchageOcc06.getMainHbRegulatoryCharg();
	}

    /**
	 *	Returns the String value of mainHbRegulatoryCharg
	 *	@return mainHbRegulatoryCharg
	 */
	public char[]  getMainHbRegulatoryChargActualString()  throws CFException{
	    return mainHbEqupSurchageOcc06.getMainHbRegulatoryChargActualString();
	}

	 /**
     *	Returns String value of mainHbRegulatoryCharg
     *	@return mainHbRegulatoryCharg
     */
    public char[]  getMainHbRegulatoryChargString() throws CFException {
         return mainHbEqupSurchageOcc06.getMainHbRegulatoryChargString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean mainHbRegulatoryChargIsNumeric() {
        return mainHbEqupSurchageOcc06.mainHbRegulatoryChargIsNumeric();
    }
	/**
	 * 	Update MainHbRegulatoryCharg with the passed number
	 *	@param number
	 */
	public void setMainHbRegulatoryCharg(BigDecimal number)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbRegulatoryCharg(number);
   }

	/**
	 * 	Update MainHbRegulatoryCharg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMainHbRegulatoryCharg(char[] value)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbRegulatoryCharg(value);
	}   

	/**
	 *	Returns the value of c584HbTotVzwSurchgAmt
	 *	@return c584HbTotVzwSurchgAmt
	 */
	public BigDecimal getC584HbTotVzwSurchgAmt() throws CFException {
   		return c584HbEqupSurchageOcc06.getC584HbTotVzwSurchgAmt();
	}

    /**
	 *	Returns the String value of c584HbTotVzwSurchgAmt
	 *	@return c584HbTotVzwSurchgAmt
	 */
	public char[]  getC584HbTotVzwSurchgAmtActualString()  throws CFException{
	    return c584HbEqupSurchageOcc06.getC584HbTotVzwSurchgAmtActualString();
	}

	 /**
     *	Returns String value of c584HbTotVzwSurchgAmt
     *	@return c584HbTotVzwSurchgAmt
     */
    public char[]  getC584HbTotVzwSurchgAmtString() throws CFException {
         return c584HbEqupSurchageOcc06.getC584HbTotVzwSurchgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c584HbTotVzwSurchgAmtIsNumeric() {
        return c584HbEqupSurchageOcc06.c584HbTotVzwSurchgAmtIsNumeric();
    }
	/**
	 * 	Update C584HbTotVzwSurchgAmt with the passed number
	 *	@param number
	 */
	public void setC584HbTotVzwSurchgAmt(BigDecimal number)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbTotVzwSurchgAmt(number);
   }

	/**
	 * 	Update C584HbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC584HbTotVzwSurchgAmt(char[] value)  throws CFException{
		c584HbEqupSurchageOcc06.setC584HbTotVzwSurchgAmt(value);
	}   

	/**
	 *	Returns the value of c586HbVzwAdminChgAmt
	 *	@return c586HbVzwAdminChgAmt
	 */
	public BigDecimal getC586HbVzwAdminChgAmt() throws CFException {
   		return c586HbEqupSurchageOcc06.getC586HbVzwAdminChgAmt();
	}

    /**
	 *	Returns the String value of c586HbVzwAdminChgAmt
	 *	@return c586HbVzwAdminChgAmt
	 */
	public char[]  getC586HbVzwAdminChgAmtActualString()  throws CFException{
	    return c586HbEqupSurchageOcc06.getC586HbVzwAdminChgAmtActualString();
	}

	 /**
     *	Returns String value of c586HbVzwAdminChgAmt
     *	@return c586HbVzwAdminChgAmt
     */
    public char[]  getC586HbVzwAdminChgAmtString() throws CFException {
         return c586HbEqupSurchageOcc06.getC586HbVzwAdminChgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c586HbVzwAdminChgAmtIsNumeric() {
        return c586HbEqupSurchageOcc06.c586HbVzwAdminChgAmtIsNumeric();
    }
	/**
	 * 	Update C586HbVzwAdminChgAmt with the passed number
	 *	@param number
	 */
	public void setC586HbVzwAdminChgAmt(BigDecimal number)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbVzwAdminChgAmt(number);
   }

	/**
	 * 	Update C586HbVzwAdminChgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC586HbVzwAdminChgAmt(char[] value)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbVzwAdminChgAmt(value);
	}   

	/**
	 *	Returns the value of mainHbTotVzwSurchgAmt
	 *	@return mainHbTotVzwSurchgAmt
	 */
	public BigDecimal getMainHbTotVzwSurchgAmt() throws CFException {
   		return mainHbEqupSurchageOcc06.getMainHbTotVzwSurchgAmt();
	}

    /**
	 *	Returns the String value of mainHbTotVzwSurchgAmt
	 *	@return mainHbTotVzwSurchgAmt
	 */
	public char[]  getMainHbTotVzwSurchgAmtActualString()  throws CFException{
	    return mainHbEqupSurchageOcc06.getMainHbTotVzwSurchgAmtActualString();
	}

	 /**
     *	Returns String value of mainHbTotVzwSurchgAmt
     *	@return mainHbTotVzwSurchgAmt
     */
    public char[]  getMainHbTotVzwSurchgAmtString() throws CFException {
         return mainHbEqupSurchageOcc06.getMainHbTotVzwSurchgAmtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean mainHbTotVzwSurchgAmtIsNumeric() {
        return mainHbEqupSurchageOcc06.mainHbTotVzwSurchgAmtIsNumeric();
    }
	/**
	 * 	Update MainHbTotVzwSurchgAmt with the passed number
	 *	@param number
	 */
	public void setMainHbTotVzwSurchgAmt(BigDecimal number)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbTotVzwSurchgAmt(number);
   }

	/**
	 * 	Update MainHbTotVzwSurchgAmt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMainHbTotVzwSurchgAmt(char[] value)  throws CFException{
		mainHbEqupSurchageOcc06.setMainHbTotVzwSurchgAmt(value);
	}   

	/**
	 *	Returns the value of c586HbRegulatoryCharg
	 *	@return c586HbRegulatoryCharg
	 */
	public BigDecimal getC586HbRegulatoryCharg() throws CFException {
   		return c586HbEqupSurchageOcc06.getC586HbRegulatoryCharg();
	}

    /**
	 *	Returns the String value of c586HbRegulatoryCharg
	 *	@return c586HbRegulatoryCharg
	 */
	public char[]  getC586HbRegulatoryChargActualString()  throws CFException{
	    return c586HbEqupSurchageOcc06.getC586HbRegulatoryChargActualString();
	}

	 /**
     *	Returns String value of c586HbRegulatoryCharg
     *	@return c586HbRegulatoryCharg
     */
    public char[]  getC586HbRegulatoryChargString() throws CFException {
         return c586HbEqupSurchageOcc06.getC586HbRegulatoryChargString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean c586HbRegulatoryChargIsNumeric() {
        return c586HbEqupSurchageOcc06.c586HbRegulatoryChargIsNumeric();
    }
	/**
	 * 	Update C586HbRegulatoryCharg with the passed number
	 *	@param number
	 */
	public void setC586HbRegulatoryCharg(BigDecimal number)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbRegulatoryCharg(number);
   }

	/**
	 * 	Update C586HbRegulatoryCharg with the passed value
	 *	@param value (String or char[]);
	 */
	public void setC586HbRegulatoryCharg(char[] value)  throws CFException{
		c586HbEqupSurchageOcc06.setC586HbRegulatoryCharg(value);
	}   


        public Numeric0Ctx getNumeric0Ctx() {
            return Numeric0Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mainHbEqupSurchageOcc06.hashCode();
        str += c587HbEqupSurchageOcc06.hashCode();
        str += work.hashCode();
        str += c584HbEqupSurchageOcc06.hashCode();
        str += c585HbEqupSurchageOcc06.hashCode();
        str += c588HbEqupSurchageOcc06.hashCode();
        str += c586HbEqupSurchageOcc06.hashCode();
       return str.hashCode();
    }

    public SignLeadingOutCtx clone() {
        SignLeadingOutCtx cloneObj = new SignLeadingOutCtx();
        cloneObj.mainHbEqupSurchageOcc06 = new MainHbEqupSurchageOcc06();
        cloneObj.mainHbEqupSurchageOcc06.set(mainHbEqupSurchageOcc06.getClonedField());
        cloneObj.c587HbEqupSurchageOcc06 = new C587HbEqupSurchageOcc06();
        cloneObj.c587HbEqupSurchageOcc06.set(c587HbEqupSurchageOcc06.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.c584HbEqupSurchageOcc06 = new C584HbEqupSurchageOcc06();
        cloneObj.c584HbEqupSurchageOcc06.set(c584HbEqupSurchageOcc06.getClonedField());
        cloneObj.c585HbEqupSurchageOcc06 = new C585HbEqupSurchageOcc06();
        cloneObj.c585HbEqupSurchageOcc06.set(c585HbEqupSurchageOcc06.getClonedField());
        cloneObj.c588HbEqupSurchageOcc06 = new C588HbEqupSurchageOcc06();
        cloneObj.c588HbEqupSurchageOcc06.set(c588HbEqupSurchageOcc06.getClonedField());
        cloneObj.c586HbEqupSurchageOcc06 = new C586HbEqupSurchageOcc06();
        cloneObj.c586HbEqupSurchageOcc06.set(c586HbEqupSurchageOcc06.getClonedField());
        return cloneObj;
    }

    }

    public SignLeadingOutCtx getSignLeadingOutCtx() {
            return new SignLeadingOutCtx();
    }
     public class InitNumbersOutCtx implements Cloneable {
     Work work = Numeric0Ctx.this.getWork();

	/**
	 *	Returns the value of int1
	 *	@return int1
	 */
	public long getInt1() throws CFException {        
   		return work.getInt1();
	}
	
	/**
	 * 	Update Int1 with the passed value
	 *	@param number
	 */
	public void setInt1(long number)  throws CFException{
		work.setInt1(number);
	}



	/**
	 *	Returns the value of int2
	 *	@return int2
	 */
	public long getInt2() throws CFException {        
   		return work.getInt2();
	}
	
	/**
	 * 	Update Int2 with the passed value
	 *	@param number
	 */
	public void setInt2(long number)  throws CFException{
		work.setInt2(number);
	}



	public BigDecimal getNumDec1() throws CFException{      
   		return work.getNumDec1();
	}

    public char[] getNumDec1String() throws CFException {
          return  work.getNumDec1().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec1 with the passed number
	 *	@param number
	 */
	public void setNumDec1(BigDecimal number)  throws CFException{
		work.setNumDec1(number);
   }

	/**
	 *	Returns the value of numDisp2
	 *	@return numDisp2
	 */
	public BigDecimal getNumDisp2() throws CFException {
   		return work.getNumDisp2();
	}


	 /**
     *	Returns String value of numDisp2
     *	@return numDisp2
     */
    public char[]  getNumDisp2String() throws CFException {
         return work.getNumDisp2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp2IsNumeric() {
        return work.numDisp2IsNumeric();
    }
	/**
	 * 	Update NumDisp2 with the passed number
	 *	@param number
	 */
	public void setNumDisp2(BigDecimal number)  throws CFException{
		work.setNumDisp2(number);
   }

	/**
	 * 	Update NumDisp2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp2(char[] value)  throws CFException{
		work.setNumDisp2(value);
	}   

	public BigDecimal getNumDec2() throws CFException{      
   		return work.getNumDec2();
	}

    public char[] getNumDec2String() throws CFException {
          return  work.getNumDec2().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec2 with the passed number
	 *	@param number
	 */
	public void setNumDec2(BigDecimal number)  throws CFException{
		work.setNumDec2(number);
   }

	/**
	 *	Returns the value of short1
	 *	@return short1
	 */
	public int getShort1() throws CFException {        
   		return work.getShort1();
	}
	
	/**
	 * 	Update Short1 with the passed value
	 *	@param number
	 */
	public void setShort1(int number)  throws CFException{
		work.setShort1(number);
	}


	public void setShort1(long number)  throws CFException{
		work.setShort1((int)number);
	}


	/**
	 *	Returns the value of short2
	 *	@return short2
	 */
	public int getShort2() throws CFException {        
   		return work.getShort2();
	}
	
	/**
	 * 	Update Short2 with the passed value
	 *	@param number
	 */
	public void setShort2(int number)  throws CFException{
		work.setShort2(number);
	}


	public void setShort2(long number)  throws CFException{
		work.setShort2((int)number);
	}


	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {        
   		return work.getLong1();
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *	@param number
	 */
	public void setLong1(long number)  throws CFException{
		work.setLong1(number);
	}



	/**
	 *	Returns the value of numDisp1
	 *	@return numDisp1
	 */
	public BigDecimal getNumDisp1() throws CFException {
   		return work.getNumDisp1();
	}


	 /**
     *	Returns String value of numDisp1
     *	@return numDisp1
     */
    public char[]  getNumDisp1String() throws CFException {
         return work.getNumDisp1String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp1IsNumeric() {
        return work.numDisp1IsNumeric();
    }
	/**
	 * 	Update NumDisp1 with the passed number
	 *	@param number
	 */
	public void setNumDisp1(BigDecimal number)  throws CFException{
		work.setNumDisp1(number);
   }

	/**
	 * 	Update NumDisp1 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp1(char[] value)  throws CFException{
		work.setNumDisp1(value);
	}   

	/**
	 *	Returns the value of long2
	 *	@return long2
	 */
	public long getLong2() throws CFException {        
   		return work.getLong2();
	}
	
	/**
	 * 	Update Long2 with the passed value
	 *	@param number
	 */
	public void setLong2(long number)  throws CFException{
		work.setLong2(number);
	}




        public Numeric0Ctx getNumeric0Ctx() {
            return Numeric0Ctx.this;
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

    public InitNumbersOutCtx clone() {
        InitNumbersOutCtx cloneObj = new InitNumbersOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitNumbersOutCtx getInitNumbersOutCtx() {
            return new InitNumbersOutCtx();
    }
     public class CompareEqualsInCtx implements Cloneable {
     Work work = Numeric0Ctx.this.getWork();
     IntlRec intlRec = Numeric0Ctx.this.getIntlRec();

	/**
	 *	Returns the value of int1
	 *	@return int1
	 */
	public long getInt1() throws CFException {        
   		return work.getInt1();
	}
	
	/**
	 * 	Update Int1 with the passed value
	 *	@param number
	 */
	public void setInt1(long number)  throws CFException{
		work.setInt1(number);
	}



	/**
	 *	Returns the value of int2
	 *	@return int2
	 */
	public long getInt2() throws CFException {        
   		return work.getInt2();
	}
	
	/**
	 * 	Update Int2 with the passed value
	 *	@param number
	 */
	public void setInt2(long number)  throws CFException{
		work.setInt2(number);
	}



	public BigDecimal getNumDec1() throws CFException{      
   		return work.getNumDec1();
	}

    public char[] getNumDec1String() throws CFException {
          return  work.getNumDec1().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec1 with the passed number
	 *	@param number
	 */
	public void setNumDec1(BigDecimal number)  throws CFException{
		work.setNumDec1(number);
   }

	/**
	 *	Returns the value of short1
	 *	@return short1
	 */
	public int getShort1() throws CFException {        
   		return work.getShort1();
	}
	
	/**
	 * 	Update Short1 with the passed value
	 *	@param number
	 */
	public void setShort1(int number)  throws CFException{
		work.setShort1(number);
	}


	public void setShort1(long number)  throws CFException{
		work.setShort1((int)number);
	}


	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {        
   		return work.getLong1();
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *	@param number
	 */
	public void setLong1(long number)  throws CFException{
		work.setLong1(number);
	}



	public BigDecimal getV93915() throws CFException{      
   		return work.getV93915();
	}

    public char[] getV93915String() throws CFException {
          return  work.getV93915().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update V93915 with the passed number
	 *	@param number
	 */
	public void setV93915(BigDecimal number)  throws CFException{
		work.setV93915(number);
   }

	/**
	 *	Returns the value of count
	 *	@return count
	 */
	public short getCount() throws CFException {        
   		return work.getCount();
	}
	
	/**
	 * 	Update Count with the passed value
	 *	@param number
	 */
	public void setCount(short number)  throws CFException{
		work.setCount(number);
	}

	public void setCount(int number)  throws CFException{
		work.setCount((short)number);
	}

	public void setCount(long number)  throws CFException{
		work.setCount((short)number);
	}



	/**
	 *	Returns the value of numDisp2
	 *	@return numDisp2
	 */
	public BigDecimal getNumDisp2() throws CFException {
   		return work.getNumDisp2();
	}


	 /**
     *	Returns String value of numDisp2
     *	@return numDisp2
     */
    public char[]  getNumDisp2String() throws CFException {
         return work.getNumDisp2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp2IsNumeric() {
        return work.numDisp2IsNumeric();
    }
	/**
	 * 	Update NumDisp2 with the passed number
	 *	@param number
	 */
	public void setNumDisp2(BigDecimal number)  throws CFException{
		work.setNumDisp2(number);
   }

	/**
	 * 	Update NumDisp2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp2(char[] value)  throws CFException{
		work.setNumDisp2(value);
	}   

	public BigDecimal getNumDec2() throws CFException{      
   		return work.getNumDec2();
	}

    public char[] getNumDec2String() throws CFException {
          return  work.getNumDec2().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec2 with the passed number
	 *	@param number
	 */
	public void setNumDec2(BigDecimal number)  throws CFException{
		work.setNumDec2(number);
   }

	/**
	 *	Returns the value of short2
	 *	@return short2
	 */
	public int getShort2() throws CFException {        
   		return work.getShort2();
	}
	
	/**
	 * 	Update Short2 with the passed value
	 *	@param number
	 */
	public void setShort2(int number)  throws CFException{
		work.setShort2(number);
	}


	public void setShort2(long number)  throws CFException{
		work.setShort2((int)number);
	}


	/**
	 *	Returns the value of numDisp1
	 *	@return numDisp1
	 */
	public BigDecimal getNumDisp1() throws CFException {
   		return work.getNumDisp1();
	}


	 /**
     *	Returns String value of numDisp1
     *	@return numDisp1
     */
    public char[]  getNumDisp1String() throws CFException {
         return work.getNumDisp1String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp1IsNumeric() {
        return work.numDisp1IsNumeric();
    }
	/**
	 * 	Update NumDisp1 with the passed number
	 *	@param number
	 */
	public void setNumDisp1(BigDecimal number)  throws CFException{
		work.setNumDisp1(number);
   }

	/**
	 * 	Update NumDisp1 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp1(char[] value)  throws CFException{
		work.setNumDisp1(value);
	}   

	/**
	 *	Returns the value of long2
	 *	@return long2
	 */
	public long getLong2() throws CFException {        
   		return work.getLong2();
	}
	
	/**
	 * 	Update Long2 with the passed value
	 *	@param number
	 */
	public void setLong2(long number)  throws CFException{
		work.setLong2(number);
	}



	/**
	 *	Returns the value of intlRec
	 *	@return intlRec
	 */   
	 public IntlRec getIntlRec() {
   	return intlRec;
   }



        public Numeric0Ctx getNumeric0Ctx() {
            return Numeric0Ctx.this;
        }

        public CompareEqualsOutCtx getCompareEqualsOutCtx() {
            return new CompareEqualsOutCtx();
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
        str += intlRec.hashCode();
       return str.hashCode();
    }

    public CompareEqualsInCtx clone() {
        CompareEqualsInCtx cloneObj = new CompareEqualsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.intlRec = new IntlRec();
        cloneObj.intlRec.set(intlRec.getClonedField());
        return cloneObj;
    }

    }

    public CompareEqualsInCtx getCompareEqualsInCtx() {
            return new CompareEqualsInCtx();
    }
     public class CompareEqualsOutCtx implements Cloneable {
     Work work = Numeric0Ctx.this.getWork();
     IntlRec intlRec = Numeric0Ctx.this.getIntlRec();

	/**
	 *	Returns the value of totAmt
	 *	@return totAmt
	 */
	public BigDecimal getTotAmt() throws CFException {           
   		return work.getTotAmt();
	}
	
	
	/**
	 * 	Update TotAmt with the passed value
	 *	@param number
	 */
	public void setTotAmt(BigDecimal number)  throws CFException{
		work.setTotAmt(number);
   }
              

	/**
	 *	Returns the value of comp918
	 *	@return comp918
	 */
	public long getComp918() throws CFException {        
   		return work.getComp918();
	}
	
	/**
	 * 	Update Comp918 with the passed value
	 *	@param number
	 */
	public void setComp918(long number)  throws CFException{
		work.setComp918(number);
	}



	public BigDecimal getV9299() throws CFException{      
   		return work.getV9299();
	}

    public char[] getV9299String() throws CFException {
          return  work.getV9299().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update V9299 with the passed number
	 *	@param number
	 */
	public void setV9299(BigDecimal number)  throws CFException{
		work.setV9299(number);
   }

	public BigDecimal getV93915() throws CFException{      
   		return work.getV93915();
	}

    public char[] getV93915String() throws CFException {
          return  work.getV93915().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update V93915 with the passed number
	 *	@param number
	 */
	public void setV93915(BigDecimal number)  throws CFException{
		work.setV93915(number);
   }

	/**
	 *	Returns the value of count
	 *	@return count
	 */
	public short getCount() throws CFException {        
   		return work.getCount();
	}
	
	/**
	 * 	Update Count with the passed value
	 *	@param number
	 */
	public void setCount(short number)  throws CFException{
		work.setCount(number);
	}

	public void setCount(int number)  throws CFException{
		work.setCount((short)number);
	}

	public void setCount(long number)  throws CFException{
		work.setCount((short)number);
	}



	/**
	 *	Returns the value of rlu7jPerUnitRate
	 *	@return rlu7jPerUnitRate
	 */
   public char[] getRlu7jPerUnitRate() throws CFException  {              
   		return work.getRlu7jPerUnitRate();
   }

  
	/**
	*  set variable rlu7jPerUnitRate
	*  @param value
	**/
   public void setRlu7jPerUnitRate(char[] value) throws CFException {
      work.setRlu7jPerUnitRate(value);
   } 

public long getComp3918() throws CFException {  
        return work.getComp3918();
}
	/**
	 * 	Update Comp3918 with the passed value
	 *	@param number
	 */
	public void setComp3918(long number)  throws CFException{
		work.setComp3918(number);
	}



	/**
	 *	Returns the value of dispPerUnitRate
	 *	@return dispPerUnitRate
	 */
   public char[] getDispPerUnitRate() throws CFException  {              
   		return work.getDispPerUnitRate();
   }

  
	/**
	*  set variable dispPerUnitRate
	*  @param value
	**/
   public void setDispPerUnitRate(char[] value) throws CFException {
      work.setDispPerUnitRate(value);
   } 

     /**
	 * 	Update DispPerUnitRate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDispPerUnitRate(char[] source, int sourceIndex) throws CFException {
      work.setDispPerUnitRate(source, sourceIndex);
   	
   }
   
   public void setDispPerUnitRate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDispPerUnitRate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DispPerUnitRate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDispPerUnitRate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDispPerUnitRate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DispPerUnitRate with another Field
	 *	@param value
	 */
   public void setDispPerUnitRate(Field source) {
      work.setDispPerUnitRate(source);
   }  
   
     /**
	 * 	Update DispPerUnitRate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDispPerUnitRate(Field source, int sourceIndex,int sourceLen) {
      work.setDispPerUnitRate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DispPerUnitRate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDispPerUnitRate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDispPerUnitRate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getV9399() throws CFException{      
   		return work.getV9399();
	}

    public char[] getV9399String() throws CFException {
          return  work.getV9399().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update V9399 with the passed number
	 *	@param number
	 */
	public void setV9399(BigDecimal number)  throws CFException{
		work.setV9399(number);
   }

	public BigDecimal getV93Comp399() throws CFException{      
   		return work.getV93Comp399();
	}

    public char[] getV93Comp399String() throws CFException {
          return  work.getV93Comp399().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update V93Comp399 with the passed number
	 *	@param number
	 */
	public void setV93Comp399(BigDecimal number)  throws CFException{
		work.setV93Comp399(number);
   }

	/**
	 *	Returns the value of intlRec
	 *	@return intlRec
	 */   
	 public IntlRec getIntlRec() {
   	return intlRec;
   }


	public BigDecimal getV9297() throws CFException{      
   		return work.getV9297();
	}

    public char[] getV9297String() throws CFException {
          return  work.getV9297().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update V9297 with the passed number
	 *	@param number
	 */
	public void setV9297(BigDecimal number)  throws CFException{
		work.setV9297(number);
   }

	public BigDecimal getIntlRateAmount() throws CFException{      
   		return intlRec.getIntlRateAmount();
	}

    public char[] getIntlRateAmountString() throws CFException {
          return  intlRec.getIntlRateAmount().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update IntlRateAmount with the passed number
	 *	@param number
	 */
	public void setIntlRateAmount(BigDecimal number)  throws CFException{
		intlRec.setIntlRateAmount(number);
   }


        public Numeric0Ctx getNumeric0Ctx() {
            return Numeric0Ctx.this;
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
        str += intlRec.hashCode();
       return str.hashCode();
    }

    public CompareEqualsOutCtx clone() {
        CompareEqualsOutCtx cloneObj = new CompareEqualsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.intlRec = new IntlRec();
        cloneObj.intlRec.set(intlRec.getClonedField());
        return cloneObj;
    }

    }

    public CompareEqualsOutCtx getCompareEqualsOutCtx() {
            return new CompareEqualsOutCtx();
    }
}
