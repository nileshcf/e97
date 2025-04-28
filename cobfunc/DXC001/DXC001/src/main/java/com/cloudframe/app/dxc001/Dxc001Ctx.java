package com.cloudframe.app.dxc001;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.dxc001.dto.CurrDate1;
import com.cloudframe.app.dxc001.dto.Work;


@Context
public class Dxc001Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    CurrDate1 currDate1;


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
    public CurrDate1 getCurrDate1() {
        if (currDate1 == null) {
            currDate1 = new CurrDate1();
        }

        return currDate1;
    }

    public void setCurrDate1(CurrDate1 currDate1) {
        this.currDate1 = currDate1;
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
        str += currDate1.hashCode();
       return str.hashCode();
    }

    public Dxc001Ctx clone() {
        Dxc001Ctx cloneObj = new Dxc001Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.currDate1 = new CurrDate1();
        cloneObj.currDate1.set(currDate1.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Dxc001Ctx.this.getWork();
     CurrDate1 currDate1 = Dxc001Ctx.this.getCurrDate1();

	/**
	 *	Returns the value of currDate1
	 *	@return currDate1
	 */   
	 public CurrDate1 getCurrDate1() {
   	return currDate1;
   }



        public Dxc001Ctx getDxc001Ctx() {
            return Dxc001Ctx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
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
        str += currDate1.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.currDate1 = new CurrDate1();
        cloneObj.currDate1.set(currDate1.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Dxc001Ctx.this.getWork();
     CurrDate1 currDate1 = Dxc001Ctx.this.getCurrDate1();

	/**
	 *	Returns the value of chckDay1
	 *	@return chckDay1
	 */
	public int getChckDay1() throws CFException {
   		return currDate1.getChckDay1();
	}


	/**
	 *	Returns String value of chckDay1
	 *	@return chckDay1
	 */
	public char[]  getChckDay1String() throws CFException {
	     return String.valueOf(currDate1.getChckDay1String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chckDay1IsNumeric()  throws CFException{
	    return currDate1.chckDay1IsNumeric();
	}

	/**
	 * 	Update ChckDay1 with the passed value
	 *	@param number
	 */
	public void setChckDay1(int number)  throws CFException{
		currDate1.setChckDay1(number);
	}
	

	public void setChckDay1(long number)  throws CFException{
	    currDate1.setChckDay1(number);
	}
	
	
	/**
	 * 	Update ChckDay1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChckDay1(char[] value)  throws CFException {
		currDate1.setChckDay1(value);
	}
	
	/**
	 * 	Update ChckDay1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChckDay1String(char[] value)  throws CFException{
		currDate1.setChckDay1(value);
	}	

	/**
	 *	Returns the value of currDate1
	 *	@return currDate1
	 */   
	 public CurrDate1 getCurrDate1() {
   	return currDate1;
   }


	/**
	 *	Returns the value of chckMonth1
	 *	@return chckMonth1
	 */
	public int getChckMonth1() throws CFException {
   		return currDate1.getChckMonth1();
	}


	/**
	 *	Returns String value of chckMonth1
	 *	@return chckMonth1
	 */
	public char[]  getChckMonth1String() throws CFException {
	     return String.valueOf(currDate1.getChckMonth1String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chckMonth1IsNumeric()  throws CFException{
	    return currDate1.chckMonth1IsNumeric();
	}

	/**
	 * 	Update ChckMonth1 with the passed value
	 *	@param number
	 */
	public void setChckMonth1(int number)  throws CFException{
		currDate1.setChckMonth1(number);
	}
	

	public void setChckMonth1(long number)  throws CFException{
	    currDate1.setChckMonth1(number);
	}
	
	
	/**
	 * 	Update ChckMonth1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChckMonth1(char[] value)  throws CFException {
		currDate1.setChckMonth1(value);
	}
	
	/**
	 * 	Update ChckMonth1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChckMonth1String(char[] value)  throws CFException{
		currDate1.setChckMonth1(value);
	}	

	/**
	 *	Returns the value of currDat1
	 *	@return currDat1
	 */
	public long getCurrDat1() throws CFException {        
   		return work.getCurrDat1();
	}
	
	/**
	 * 	Update CurrDat1 with the passed value
	 *	@param number
	 */
	public void setCurrDat1(long number)  throws CFException{
		work.setCurrDat1(number);
	}



	/**
	 *	Returns the value of chckYear1
	 *	@return chckYear1
	 */
	public int getChckYear1() throws CFException {
   		return currDate1.getChckYear1();
	}


	/**
	 *	Returns String value of chckYear1
	 *	@return chckYear1
	 */
	public char[]  getChckYear1String() throws CFException {
	     return String.valueOf(currDate1.getChckYear1String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean chckYear1IsNumeric()  throws CFException{
	    return currDate1.chckYear1IsNumeric();
	}

	/**
	 * 	Update ChckYear1 with the passed value
	 *	@param number
	 */
	public void setChckYear1(int number)  throws CFException{
		currDate1.setChckYear1(number);
	}
	

	public void setChckYear1(long number)  throws CFException{
	    currDate1.setChckYear1(number);
	}
	
	
	/**
	 * 	Update ChckYear1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChckYear1(char[] value)  throws CFException {
		currDate1.setChckYear1(value);
	}
	
	/**
	 * 	Update ChckYear1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChckYear1String(char[] value)  throws CFException{
		currDate1.setChckYear1(value);
	}	


        public Dxc001Ctx getDxc001Ctx() {
            return Dxc001Ctx.this;
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
        str += currDate1.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.currDate1 = new CurrDate1();
        cloneObj.currDate1.set(currDate1.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
