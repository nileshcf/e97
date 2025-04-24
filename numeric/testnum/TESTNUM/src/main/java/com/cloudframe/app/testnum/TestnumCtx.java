package com.cloudframe.app.testnum;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.testnum.dto.Work;
import com.cloudframe.app.testnum.dto.Src152Grp;
import com.cloudframe.app.testnum.dto.Tgt149Grp;
import com.cloudframe.app.testnum.dto.Src148Grp;
import com.cloudframe.app.testnum.dto.Src150Grp;
import com.cloudframe.app.testnum.dto.Tgt153Grp;
import com.cloudframe.app.testnum.dto.Src156Grp;
import com.cloudframe.app.testnum.dto.Tgt150Grp;
import com.cloudframe.app.testnum.dto.Src154Grp;
import com.cloudframe.app.testnum.dto.Src158Grp;
import com.cloudframe.app.testnum.dto.Tgt154Grp;
import com.cloudframe.app.testnum.dto.Tgt157Grp;
import com.cloudframe.app.testnum.dto.Src198Grp;
import com.cloudframe.app.testnum.dto.Tgt199Grp;
import com.cloudframe.app.testnum.dto.Src164Grp;
import com.cloudframe.app.testnum.dto.Tgt161Grp;
import com.cloudframe.app.testnum.dto.Tgt162Grp;
import com.cloudframe.app.testnum.dto.Src200Grp;
import com.cloudframe.app.testnum.dto.Tgt158Grp;
import com.cloudframe.app.testnum.dto.Src166Grp;
import com.cloudframe.app.testnum.dto.Tgt165Grp;
import com.cloudframe.app.testnum.dto.Tgt166Grp;
import com.cloudframe.app.testnum.dto.Tgt200Grp;


@Context
public class TestnumCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Tgt162Grp tgt162Grp;
    Src148Grp src148Grp;
    Src166Grp src166Grp;
    Tgt199Grp tgt199Grp;
    Tgt166Grp tgt166Grp;
    Tgt157Grp tgt157Grp;
    Work work;
    Src150Grp src150Grp;
    Tgt150Grp tgt150Grp;
    Src158Grp src158Grp;
    Src200Grp src200Grp;
    Tgt200Grp tgt200Grp;
    Tgt165Grp tgt165Grp;
    Tgt153Grp tgt153Grp;
    Src154Grp src154Grp;
    Src152Grp src152Grp;
    Src156Grp src156Grp;
    Tgt149Grp tgt149Grp;
    Src198Grp src198Grp;
    Tgt158Grp tgt158Grp;
    Src164Grp src164Grp;
    Tgt154Grp tgt154Grp;
    Tgt161Grp tgt161Grp;


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


    public Tgt162Grp getTgt162Grp() {
        if (tgt162Grp == null) {
            tgt162Grp = new Tgt162Grp();
        }

        return tgt162Grp;
    }

    public void setTgt162Grp(Tgt162Grp tgt162Grp) {
        this.tgt162Grp = tgt162Grp;
    }
    public Src148Grp getSrc148Grp() {
        if (src148Grp == null) {
            src148Grp = new Src148Grp();
        }

        return src148Grp;
    }

    public void setSrc148Grp(Src148Grp src148Grp) {
        this.src148Grp = src148Grp;
    }
    public Src166Grp getSrc166Grp() {
        if (src166Grp == null) {
            src166Grp = new Src166Grp();
        }

        return src166Grp;
    }

    public void setSrc166Grp(Src166Grp src166Grp) {
        this.src166Grp = src166Grp;
    }
    public Tgt199Grp getTgt199Grp() {
        if (tgt199Grp == null) {
            tgt199Grp = new Tgt199Grp();
        }

        return tgt199Grp;
    }

    public void setTgt199Grp(Tgt199Grp tgt199Grp) {
        this.tgt199Grp = tgt199Grp;
    }
    public Tgt166Grp getTgt166Grp() {
        if (tgt166Grp == null) {
            tgt166Grp = new Tgt166Grp();
        }

        return tgt166Grp;
    }

    public void setTgt166Grp(Tgt166Grp tgt166Grp) {
        this.tgt166Grp = tgt166Grp;
    }
    public Tgt157Grp getTgt157Grp() {
        if (tgt157Grp == null) {
            tgt157Grp = new Tgt157Grp();
        }

        return tgt157Grp;
    }

    public void setTgt157Grp(Tgt157Grp tgt157Grp) {
        this.tgt157Grp = tgt157Grp;
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
    public Src150Grp getSrc150Grp() {
        if (src150Grp == null) {
            src150Grp = new Src150Grp();
        }

        return src150Grp;
    }

    public void setSrc150Grp(Src150Grp src150Grp) {
        this.src150Grp = src150Grp;
    }
    public Tgt150Grp getTgt150Grp() {
        if (tgt150Grp == null) {
            tgt150Grp = new Tgt150Grp();
        }

        return tgt150Grp;
    }

    public void setTgt150Grp(Tgt150Grp tgt150Grp) {
        this.tgt150Grp = tgt150Grp;
    }
    public Src158Grp getSrc158Grp() {
        if (src158Grp == null) {
            src158Grp = new Src158Grp();
        }

        return src158Grp;
    }

    public void setSrc158Grp(Src158Grp src158Grp) {
        this.src158Grp = src158Grp;
    }
    public Src200Grp getSrc200Grp() {
        if (src200Grp == null) {
            src200Grp = new Src200Grp();
        }

        return src200Grp;
    }

    public void setSrc200Grp(Src200Grp src200Grp) {
        this.src200Grp = src200Grp;
    }
    public Tgt200Grp getTgt200Grp() {
        if (tgt200Grp == null) {
            tgt200Grp = new Tgt200Grp();
        }

        return tgt200Grp;
    }

    public void setTgt200Grp(Tgt200Grp tgt200Grp) {
        this.tgt200Grp = tgt200Grp;
    }
    public Tgt165Grp getTgt165Grp() {
        if (tgt165Grp == null) {
            tgt165Grp = new Tgt165Grp();
        }

        return tgt165Grp;
    }

    public void setTgt165Grp(Tgt165Grp tgt165Grp) {
        this.tgt165Grp = tgt165Grp;
    }
    public Tgt153Grp getTgt153Grp() {
        if (tgt153Grp == null) {
            tgt153Grp = new Tgt153Grp();
        }

        return tgt153Grp;
    }

    public void setTgt153Grp(Tgt153Grp tgt153Grp) {
        this.tgt153Grp = tgt153Grp;
    }
    public Src154Grp getSrc154Grp() {
        if (src154Grp == null) {
            src154Grp = new Src154Grp();
        }

        return src154Grp;
    }

    public void setSrc154Grp(Src154Grp src154Grp) {
        this.src154Grp = src154Grp;
    }
    public Src152Grp getSrc152Grp() {
        if (src152Grp == null) {
            src152Grp = new Src152Grp();
        }

        return src152Grp;
    }

    public void setSrc152Grp(Src152Grp src152Grp) {
        this.src152Grp = src152Grp;
    }
    public Src156Grp getSrc156Grp() {
        if (src156Grp == null) {
            src156Grp = new Src156Grp();
        }

        return src156Grp;
    }

    public void setSrc156Grp(Src156Grp src156Grp) {
        this.src156Grp = src156Grp;
    }
    public Tgt149Grp getTgt149Grp() {
        if (tgt149Grp == null) {
            tgt149Grp = new Tgt149Grp();
        }

        return tgt149Grp;
    }

    public void setTgt149Grp(Tgt149Grp tgt149Grp) {
        this.tgt149Grp = tgt149Grp;
    }
    public Src198Grp getSrc198Grp() {
        if (src198Grp == null) {
            src198Grp = new Src198Grp();
        }

        return src198Grp;
    }

    public void setSrc198Grp(Src198Grp src198Grp) {
        this.src198Grp = src198Grp;
    }
    public Tgt158Grp getTgt158Grp() {
        if (tgt158Grp == null) {
            tgt158Grp = new Tgt158Grp();
        }

        return tgt158Grp;
    }

    public void setTgt158Grp(Tgt158Grp tgt158Grp) {
        this.tgt158Grp = tgt158Grp;
    }
    public Src164Grp getSrc164Grp() {
        if (src164Grp == null) {
            src164Grp = new Src164Grp();
        }

        return src164Grp;
    }

    public void setSrc164Grp(Src164Grp src164Grp) {
        this.src164Grp = src164Grp;
    }
    public Tgt154Grp getTgt154Grp() {
        if (tgt154Grp == null) {
            tgt154Grp = new Tgt154Grp();
        }

        return tgt154Grp;
    }

    public void setTgt154Grp(Tgt154Grp tgt154Grp) {
        this.tgt154Grp = tgt154Grp;
    }
    public Tgt161Grp getTgt161Grp() {
        if (tgt161Grp == null) {
            tgt161Grp = new Tgt161Grp();
        }

        return tgt161Grp;
    }

    public void setTgt161Grp(Tgt161Grp tgt161Grp) {
        this.tgt161Grp = tgt161Grp;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt162Grp.hashCode();
        str += src148Grp.hashCode();
        str += src166Grp.hashCode();
        str += tgt199Grp.hashCode();
        str += tgt166Grp.hashCode();
        str += tgt157Grp.hashCode();
        str += work.hashCode();
        str += src150Grp.hashCode();
        str += tgt150Grp.hashCode();
        str += src158Grp.hashCode();
        str += src200Grp.hashCode();
        str += tgt200Grp.hashCode();
        str += tgt165Grp.hashCode();
        str += tgt153Grp.hashCode();
        str += src154Grp.hashCode();
        str += src152Grp.hashCode();
        str += src156Grp.hashCode();
        str += tgt149Grp.hashCode();
        str += src198Grp.hashCode();
        str += tgt158Grp.hashCode();
        str += src164Grp.hashCode();
        str += tgt154Grp.hashCode();
        str += tgt161Grp.hashCode();
       return str.hashCode();
    }

    public TestnumCtx clone() {
        TestnumCtx cloneObj = new TestnumCtx();
        cloneObj.tgt162Grp = new Tgt162Grp();
        cloneObj.tgt162Grp.set(tgt162Grp.getClonedField());
        cloneObj.src148Grp = new Src148Grp();
        cloneObj.src148Grp.set(src148Grp.getClonedField());
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt199Grp = new Tgt199Grp();
        cloneObj.tgt199Grp.set(tgt199Grp.getClonedField());
        cloneObj.tgt166Grp = new Tgt166Grp();
        cloneObj.tgt166Grp.set(tgt166Grp.getClonedField());
        cloneObj.tgt157Grp = new Tgt157Grp();
        cloneObj.tgt157Grp.set(tgt157Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.src150Grp = new Src150Grp();
        cloneObj.src150Grp.set(src150Grp.getClonedField());
        cloneObj.tgt150Grp = new Tgt150Grp();
        cloneObj.tgt150Grp.set(tgt150Grp.getClonedField());
        cloneObj.src158Grp = new Src158Grp();
        cloneObj.src158Grp.set(src158Grp.getClonedField());
        cloneObj.src200Grp = new Src200Grp();
        cloneObj.src200Grp.set(src200Grp.getClonedField());
        cloneObj.tgt200Grp = new Tgt200Grp();
        cloneObj.tgt200Grp.set(tgt200Grp.getClonedField());
        cloneObj.tgt165Grp = new Tgt165Grp();
        cloneObj.tgt165Grp.set(tgt165Grp.getClonedField());
        cloneObj.tgt153Grp = new Tgt153Grp();
        cloneObj.tgt153Grp.set(tgt153Grp.getClonedField());
        cloneObj.src154Grp = new Src154Grp();
        cloneObj.src154Grp.set(src154Grp.getClonedField());
        cloneObj.src152Grp = new Src152Grp();
        cloneObj.src152Grp.set(src152Grp.getClonedField());
        cloneObj.src156Grp = new Src156Grp();
        cloneObj.src156Grp.set(src156Grp.getClonedField());
        cloneObj.tgt149Grp = new Tgt149Grp();
        cloneObj.tgt149Grp.set(tgt149Grp.getClonedField());
        cloneObj.src198Grp = new Src198Grp();
        cloneObj.src198Grp.set(src198Grp.getClonedField());
        cloneObj.tgt158Grp = new Tgt158Grp();
        cloneObj.tgt158Grp.set(tgt158Grp.getClonedField());
        cloneObj.src164Grp = new Src164Grp();
        cloneObj.src164Grp.set(src164Grp.getClonedField());
        cloneObj.tgt154Grp = new Tgt154Grp();
        cloneObj.tgt154Grp.set(tgt154Grp.getClonedField());
        cloneObj.tgt161Grp = new Tgt161Grp();
        cloneObj.tgt161Grp.set(tgt161Grp.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src5
	 *	@return src5
	 */
	public long getSrc5() throws CFException {        
   		return work.getSrc5();
	}
	
	/**
	 * 	Update Src5 with the passed value
	 *	@param number
	 */
	public void setSrc5(long number)  throws CFException{
		work.setSrc5(number);
	}



	/**
	 *	Returns the value of src3
	 *	@return src3
	 */
	public long getSrc3() throws CFException {        
   		return work.getSrc3();
	}
	
	/**
	 * 	Update Src3 with the passed value
	 *	@param number
	 */
	public void setSrc3(long number)  throws CFException{
		work.setSrc3(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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
     Work work = TestnumCtx.this.getWork();

	public BigDecimal getReturnRelative() throws CFException{      
   		return work.getReturnRelative();
	}

    public char[] getReturnRelativeString() throws CFException {
          return  work.getReturnRelative().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ReturnRelative with the passed number
	 *	@param number
	 */
	public void setReturnRelative(BigDecimal number)  throws CFException{
		work.setReturnRelative(number);
   }

	/**
	 *	Returns the value of tgt5
	 *	@return tgt5
	 */
	public long getTgt5() throws CFException {        
   		return work.getTgt5();
	}
	
	/**
	 * 	Update Tgt5 with the passed value
	 *	@param number
	 */
	public void setTgt5(long number)  throws CFException{
		work.setTgt5(number);
	}



	/**
	 *	Returns the value of src4
	 *	@return src4
	 */
	public long getSrc4() throws CFException {        
   		return work.getSrc4();
	}
	
	/**
	 * 	Update Src4 with the passed value
	 *	@param number
	 */
	public void setSrc4(long number)  throws CFException{
		work.setSrc4(number);
	}



	/**
	 *	Returns the value of tgt3
	 *	@return tgt3
	 */
	public int getTgt3() throws CFException {        
   		return work.getTgt3();
	}
	
	/**
	 * 	Update Tgt3 with the passed value
	 *	@param number
	 */
	public void setTgt3(int number)  throws CFException{
		work.setTgt3(number);
	}


	public void setTgt3(long number)  throws CFException{
		work.setTgt3((int)number);
	}


	/**
	 *	Returns the value of tempResL1
	 *	@return tempResL1
	 */
   public BigDecimal getTempResL1() throws CFException {
   	return work.getTempResL1();
   }

  
	/**
	*  set variable tempResL1
	*  @param value
	**/
   public void setTempResL1(BigDecimal value)  throws CFException{
	work.setTempResL1(value);
   } 
	
	

	public BigDecimal getBpAdjust() throws CFException{      
   		return work.getBpAdjust();
	}

    public char[] getBpAdjustString() throws CFException {
          return  work.getBpAdjust().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update BpAdjust with the passed number
	 *	@param number
	 */
	public void setBpAdjust(BigDecimal number)  throws CFException{
		work.setBpAdjust(number);
   }

	/**
	 *	Returns the value of tgt4
	 *	@return tgt4
	 */
	public long getTgt4() throws CFException {        
   		return work.getTgt4();
	}
	
	/**
	 * 	Update Tgt4 with the passed value
	 *	@param number
	 */
	public void setTgt4(long number)  throws CFException{
		work.setTgt4(number);
	}



	public BigDecimal getUpdTotReturn() throws CFException{      
   		return work.getUpdTotReturn();
	}

    public char[] getUpdTotReturnString() throws CFException {
          return  work.getUpdTotReturn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update UpdTotReturn with the passed number
	 *	@param number
	 */
	public void setUpdTotReturn(BigDecimal number)  throws CFException{
		work.setUpdTotReturn(number);
   }

	/**
	 *	Returns the value of src5
	 *	@return src5
	 */
	public long getSrc5() throws CFException {        
   		return work.getSrc5();
	}
	
	/**
	 * 	Update Src5 with the passed value
	 *	@param number
	 */
	public void setSrc5(long number)  throws CFException{
		work.setSrc5(number);
	}



	/**
	 *	Returns the value of nperInv
	 *	@return nperInv
	 */
   public BigDecimal getNperInv() throws CFException {
   	return work.getNperInv();
   }

  
	/**
	*  set variable nperInv
	*  @param value
	**/
   public void setNperInv(BigDecimal value)  throws CFException{
	work.setNperInv(value);
   } 
	
	

	/**
	 *	Returns the value of tempResL2
	 *	@return tempResL2
	 */
   public BigDecimal getTempResL2() throws CFException {
   	return work.getTempResL2();
   }

  
	/**
	*  set variable tempResL2
	*  @param value
	**/
   public void setTempResL2(BigDecimal value)  throws CFException{
	work.setTempResL2(value);
   } 
	
	

	/**
	 *	Returns the value of src3
	 *	@return src3
	 */
	public long getSrc3() throws CFException {        
   		return work.getSrc3();
	}
	
	/**
	 * 	Update Src3 with the passed value
	 *	@param number
	 */
	public void setSrc3(long number)  throws CFException{
		work.setSrc3(number);
	}



	/**
	 *	Returns the value of nper
	 *	@return nper
	 */
	public short getNper() throws CFException {        
   		return work.getNper();
	}
	
	/**
	 * 	Update Nper with the passed value
	 *	@param number
	 */
	public void setNper(short number)  throws CFException{
		work.setNper(number);
	}

	public void setNper(int number)  throws CFException{
		work.setNper((short)number);
	}

	public void setNper(long number)  throws CFException{
		work.setNper((short)number);
	}



	public BigDecimal getBpAdjustRelative() throws CFException{      
   		return work.getBpAdjustRelative();
	}

    public char[] getBpAdjustRelativeString() throws CFException {
          return  work.getBpAdjustRelative().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update BpAdjustRelative with the passed number
	 *	@param number
	 */
	public void setBpAdjustRelative(BigDecimal number)  throws CFException{
		work.setBpAdjustRelative(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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
     public class Comp2Comp3InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of msdOptStrikePriceS
	 *	@return msdOptStrikePriceS
	 */
	public BigDecimal getMsdOptStrikePriceS() throws CFException {
   		return work.getMsdOptStrikePriceS();
	}

    /**
	 *	Returns the String value of msdOptStrikePriceS
	 *	@return msdOptStrikePriceS
	 */
	public char[]  getMsdOptStrikePriceSActualString()  throws CFException{
	    return work.getMsdOptStrikePriceSActualString();
	}

	 /**
     *	Returns String value of msdOptStrikePriceS
     *	@return msdOptStrikePriceS
     */
    public char[]  getMsdOptStrikePriceSString() throws CFException {
         return work.getMsdOptStrikePriceSString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean msdOptStrikePriceSIsNumeric() {
        return work.msdOptStrikePriceSIsNumeric();
    }
	/**
	 * 	Update MsdOptStrikePriceS with the passed number
	 *	@param number
	 */
	public void setMsdOptStrikePriceS(BigDecimal number)  throws CFException{
		work.setMsdOptStrikePriceS(number);
   }

	/**
	 * 	Update MsdOptStrikePriceS with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMsdOptStrikePriceS(char[] value)  throws CFException{
		work.setMsdOptStrikePriceS(value);
	}   

	public BigDecimal getScsecxStrikePrc() throws CFException{      
   		return work.getScsecxStrikePrc();
	}

    public char[] getScsecxStrikePrcString() throws CFException {
          return  work.getScsecxStrikePrc().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ScsecxStrikePrc with the passed number
	 *	@param number
	 */
	public void setScsecxStrikePrc(BigDecimal number)  throws CFException{
		work.setScsecxStrikePrc(number);
   }

	/**
	 *	Returns the value of msdOptStrikePrice
	 *	@return msdOptStrikePrice
	 */
	public BigDecimal getMsdOptStrikePrice() throws CFException {
   		return work.getMsdOptStrikePrice();
	}


	 /**
     *	Returns String value of msdOptStrikePrice
     *	@return msdOptStrikePrice
     */
    public char[]  getMsdOptStrikePriceString() throws CFException {
         return work.getMsdOptStrikePriceString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean msdOptStrikePriceIsNumeric() {
        return work.msdOptStrikePriceIsNumeric();
    }
	/**
	 * 	Update MsdOptStrikePrice with the passed number
	 *	@param number
	 */
	public void setMsdOptStrikePrice(BigDecimal number)  throws CFException{
		work.setMsdOptStrikePrice(number);
   }

	/**
	 * 	Update MsdOptStrikePrice with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMsdOptStrikePrice(char[] value)  throws CFException{
		work.setMsdOptStrikePrice(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Comp2Comp3OutCtx getComp2Comp3OutCtx() {
            return new Comp2Comp3OutCtx();
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

    public Comp2Comp3InCtx clone() {
        Comp2Comp3InCtx cloneObj = new Comp2Comp3InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Comp2Comp3InCtx getComp2Comp3InCtx() {
            return new Comp2Comp3InCtx();
    }
     public class Comp2Comp3OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of msdOptStrikePriceS
	 *	@return msdOptStrikePriceS
	 */
	public BigDecimal getMsdOptStrikePriceS() throws CFException {
   		return work.getMsdOptStrikePriceS();
	}

    /**
	 *	Returns the String value of msdOptStrikePriceS
	 *	@return msdOptStrikePriceS
	 */
	public char[]  getMsdOptStrikePriceSActualString()  throws CFException{
	    return work.getMsdOptStrikePriceSActualString();
	}

	 /**
     *	Returns String value of msdOptStrikePriceS
     *	@return msdOptStrikePriceS
     */
    public char[]  getMsdOptStrikePriceSString() throws CFException {
         return work.getMsdOptStrikePriceSString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean msdOptStrikePriceSIsNumeric() {
        return work.msdOptStrikePriceSIsNumeric();
    }
	/**
	 * 	Update MsdOptStrikePriceS with the passed number
	 *	@param number
	 */
	public void setMsdOptStrikePriceS(BigDecimal number)  throws CFException{
		work.setMsdOptStrikePriceS(number);
   }

	/**
	 * 	Update MsdOptStrikePriceS with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMsdOptStrikePriceS(char[] value)  throws CFException{
		work.setMsdOptStrikePriceS(value);
	}   

	public BigDecimal getScsecxStrikePrc() throws CFException{      
   		return work.getScsecxStrikePrc();
	}

    public char[] getScsecxStrikePrcString() throws CFException {
          return  work.getScsecxStrikePrc().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ScsecxStrikePrc with the passed number
	 *	@param number
	 */
	public void setScsecxStrikePrc(BigDecimal number)  throws CFException{
		work.setScsecxStrikePrc(number);
   }

	/**
	 *	Returns the value of strikeAmt
	 *	@return strikeAmt
	 */
   public BigDecimal getStrikeAmt() throws CFException {
   	return work.getStrikeAmt();
   }

  
	/**
	*  set variable strikeAmt
	*  @param value
	**/
   public void setStrikeAmt(BigDecimal value)  throws CFException{
	work.setStrikeAmt(value);
   } 
	
	

	/**
	 *	Returns the value of msdOptStrikePrice
	 *	@return msdOptStrikePrice
	 */
	public BigDecimal getMsdOptStrikePrice() throws CFException {
   		return work.getMsdOptStrikePrice();
	}


	 /**
     *	Returns String value of msdOptStrikePrice
     *	@return msdOptStrikePrice
     */
    public char[]  getMsdOptStrikePriceString() throws CFException {
         return work.getMsdOptStrikePriceString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean msdOptStrikePriceIsNumeric() {
        return work.msdOptStrikePriceIsNumeric();
    }
	/**
	 * 	Update MsdOptStrikePrice with the passed number
	 *	@param number
	 */
	public void setMsdOptStrikePrice(BigDecimal number)  throws CFException{
		work.setMsdOptStrikePrice(number);
   }

	/**
	 * 	Update MsdOptStrikePrice with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMsdOptStrikePrice(char[] value)  throws CFException{
		work.setMsdOptStrikePrice(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Comp2Comp3OutCtx clone() {
        Comp2Comp3OutCtx cloneObj = new Comp2Comp3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Comp2Comp3OutCtx getComp2Comp3OutCtx() {
            return new Comp2Comp3OutCtx();
    }
     public class Process1Split45InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src5
	 *	@return src5
	 */
	public long getSrc5() throws CFException {        
   		return work.getSrc5();
	}
	
	/**
	 * 	Update Src5 with the passed value
	 *	@param number
	 */
	public void setSrc5(long number)  throws CFException{
		work.setSrc5(number);
	}



	/**
	 *	Returns the value of src9
	 *	@return src9
	 */
	public long getSrc9() throws CFException {        
   		return work.getSrc9();
	}
	
	/**
	 * 	Update Src9 with the passed value
	 *	@param number
	 */
	public void setSrc9(long number)  throws CFException{
		work.setSrc9(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process1Split45OutCtx getProcess1Split45OutCtx() {
            return new Process1Split45OutCtx();
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

    public Process1Split45InCtx clone() {
        Process1Split45InCtx cloneObj = new Process1Split45InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split45InCtx getProcess1Split45InCtx() {
            return new Process1Split45InCtx();
    }
     public class Process1Split45OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt7
	 *	@return tgt7
	 */
	public short getTgt7() throws CFException {        
   		return work.getTgt7();
	}
	
	/**
	 * 	Update Tgt7 with the passed value
	 *	@param number
	 */
	public void setTgt7(short number)  throws CFException{
		work.setTgt7(number);
	}

	public void setTgt7(int number)  throws CFException{
		work.setTgt7((short)number);
	}

	public void setTgt7(long number)  throws CFException{
		work.setTgt7((short)number);
	}



	/**
	 *	Returns the value of tgt5
	 *	@return tgt5
	 */
	public long getTgt5() throws CFException {        
   		return work.getTgt5();
	}
	
	/**
	 * 	Update Tgt5 with the passed value
	 *	@param number
	 */
	public void setTgt5(long number)  throws CFException{
		work.setTgt5(number);
	}



	/**
	 *	Returns the value of src8
	 *	@return src8
	 */
	public long getSrc8() throws CFException {        
   		return work.getSrc8();
	}
	
	/**
	 * 	Update Src8 with the passed value
	 *	@param number
	 */
	public void setSrc8(long number)  throws CFException{
		work.setSrc8(number);
	}



	/**
	 *	Returns the value of src7
	 *	@return src7
	 */
	public long getSrc7() throws CFException {        
   		return work.getSrc7();
	}
	
	/**
	 * 	Update Src7 with the passed value
	 *	@param number
	 */
	public void setSrc7(long number)  throws CFException{
		work.setSrc7(number);
	}



	/**
	 *	Returns the value of src5
	 *	@return src5
	 */
	public long getSrc5() throws CFException {        
   		return work.getSrc5();
	}
	
	/**
	 * 	Update Src5 with the passed value
	 *	@param number
	 */
	public void setSrc5(long number)  throws CFException{
		work.setSrc5(number);
	}



	/**
	 *	Returns the value of src9
	 *	@return src9
	 */
	public long getSrc9() throws CFException {        
   		return work.getSrc9();
	}
	
	/**
	 * 	Update Src9 with the passed value
	 *	@param number
	 */
	public void setSrc9(long number)  throws CFException{
		work.setSrc9(number);
	}



	/**
	 *	Returns the value of tgt6
	 *	@return tgt6
	 */
	public long getTgt6() throws CFException {        
   		return work.getTgt6();
	}
	
	/**
	 * 	Update Tgt6 with the passed value
	 *	@param number
	 */
	public void setTgt6(long number)  throws CFException{
		work.setTgt6(number);
	}



	/**
	 *	Returns the value of tgt8
	 *	@return tgt8
	 */
	public int getTgt8() throws CFException {        
   		return work.getTgt8();
	}
	
	/**
	 * 	Update Tgt8 with the passed value
	 *	@param number
	 */
	public void setTgt8(int number)  throws CFException{
		work.setTgt8(number);
	}


	public void setTgt8(long number)  throws CFException{
		work.setTgt8((int)number);
	}


	/**
	 *	Returns the value of src6
	 *	@return src6
	 */
	public long getSrc6() throws CFException {        
   		return work.getSrc6();
	}
	
	/**
	 * 	Update Src6 with the passed value
	 *	@param number
	 */
	public void setSrc6(long number)  throws CFException{
		work.setSrc6(number);
	}



	/**
	 *	Returns the value of tgt9
	 *	@return tgt9
	 */
	public int getTgt9() throws CFException {        
   		return work.getTgt9();
	}
	
	/**
	 * 	Update Tgt9 with the passed value
	 *	@param number
	 */
	public void setTgt9(int number)  throws CFException{
		work.setTgt9(number);
	}


	public void setTgt9(long number)  throws CFException{
		work.setTgt9((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process1Split45OutCtx clone() {
        Process1Split45OutCtx cloneObj = new Process1Split45OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split45OutCtx getProcess1Split45OutCtx() {
            return new Process1Split45OutCtx();
    }
     public class Process2Split47InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src10
	 *	@return src10
	 */
	public long getSrc10() throws CFException {        
   		return work.getSrc10();
	}
	
	/**
	 * 	Update Src10 with the passed value
	 *	@param number
	 */
	public void setSrc10(long number)  throws CFException{
		work.setSrc10(number);
	}



	/**
	 *	Returns the value of src12
	 *	@return src12
	 */
	public long getSrc12() throws CFException {        
   		return work.getSrc12();
	}
	
	/**
	 * 	Update Src12 with the passed value
	 *	@param number
	 */
	public void setSrc12(long number)  throws CFException{
		work.setSrc12(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process2Split47OutCtx getProcess2Split47OutCtx() {
            return new Process2Split47OutCtx();
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

    public Process2Split47InCtx clone() {
        Process2Split47InCtx cloneObj = new Process2Split47InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split47InCtx getProcess2Split47InCtx() {
            return new Process2Split47InCtx();
    }
     public class Process2Split47OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt10
	 *	@return tgt10
	 */
	public long getTgt10() throws CFException {        
   		return work.getTgt10();
	}
	
	/**
	 * 	Update Tgt10 with the passed value
	 *	@param number
	 */
	public void setTgt10(long number)  throws CFException{
		work.setTgt10(number);
	}



	/**
	 *	Returns the value of tgt11
	 *	@return tgt11
	 */
	public long getTgt11() throws CFException {        
   		return work.getTgt11();
	}
	
	/**
	 * 	Update Tgt11 with the passed value
	 *	@param number
	 */
	public void setTgt11(long number)  throws CFException{
		work.setTgt11(number);
	}



	/**
	 *	Returns the value of tgt12
	 *	@return tgt12
	 */
	public long getTgt12() throws CFException {        
   		return work.getTgt12();
	}
	
	/**
	 * 	Update Tgt12 with the passed value
	 *	@param number
	 */
	public void setTgt12(long number)  throws CFException{
		work.setTgt12(number);
	}



	/**
	 *	Returns the value of src10
	 *	@return src10
	 */
	public long getSrc10() throws CFException {        
   		return work.getSrc10();
	}
	
	/**
	 * 	Update Src10 with the passed value
	 *	@param number
	 */
	public void setSrc10(long number)  throws CFException{
		work.setSrc10(number);
	}



	/**
	 *	Returns the value of src11
	 *	@return src11
	 */
	public long getSrc11() throws CFException {        
   		return work.getSrc11();
	}
	
	/**
	 * 	Update Src11 with the passed value
	 *	@param number
	 */
	public void setSrc11(long number)  throws CFException{
		work.setSrc11(number);
	}



	/**
	 *	Returns the value of src12
	 *	@return src12
	 */
	public long getSrc12() throws CFException {        
   		return work.getSrc12();
	}
	
	/**
	 * 	Update Src12 with the passed value
	 *	@param number
	 */
	public void setSrc12(long number)  throws CFException{
		work.setSrc12(number);
	}



	/**
	 *	Returns the value of src14
	 *	@return src14
	 */
	public long getSrc14() throws CFException {        
   		return work.getSrc14();
	}
	
	/**
	 * 	Update Src14 with the passed value
	 *	@param number
	 */
	public void setSrc14(long number)  throws CFException{
		work.setSrc14(number);
	}



	/**
	 *	Returns the value of tgt13
	 *	@return tgt13
	 */
	public short getTgt13() throws CFException {        
   		return work.getTgt13();
	}
	
	/**
	 * 	Update Tgt13 with the passed value
	 *	@param number
	 */
	public void setTgt13(short number)  throws CFException{
		work.setTgt13(number);
	}

	public void setTgt13(int number)  throws CFException{
		work.setTgt13((short)number);
	}

	public void setTgt13(long number)  throws CFException{
		work.setTgt13((short)number);
	}



	/**
	 *	Returns the value of src13
	 *	@return src13
	 */
	public long getSrc13() throws CFException {        
   		return work.getSrc13();
	}
	
	/**
	 * 	Update Src13 with the passed value
	 *	@param number
	 */
	public void setSrc13(long number)  throws CFException{
		work.setSrc13(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process2Split47OutCtx clone() {
        Process2Split47OutCtx cloneObj = new Process2Split47OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split47OutCtx getProcess2Split47OutCtx() {
            return new Process2Split47OutCtx();
    }
     public class Process3Split49InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src14
	 *	@return src14
	 */
	public long getSrc14() throws CFException {        
   		return work.getSrc14();
	}
	
	/**
	 * 	Update Src14 with the passed value
	 *	@param number
	 */
	public void setSrc14(long number)  throws CFException{
		work.setSrc14(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process3Split49OutCtx getProcess3Split49OutCtx() {
            return new Process3Split49OutCtx();
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

    public Process3Split49InCtx clone() {
        Process3Split49InCtx cloneObj = new Process3Split49InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split49InCtx getProcess3Split49InCtx() {
            return new Process3Split49InCtx();
    }
     public class Process3Split49OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src17
	 *	@return src17
	 */
	public int getSrc17() throws CFException {        
   		return work.getSrc17();
	}
	
	/**
	 * 	Update Src17 with the passed value
	 *	@param number
	 */
	public void setSrc17(int number)  throws CFException{
		work.setSrc17(number);
	}


	public void setSrc17(long number)  throws CFException{
		work.setSrc17((int)number);
	}


	/**
	 *	Returns the value of tgt15
	 *	@return tgt15
	 */
	public int getTgt15() throws CFException {        
   		return work.getTgt15();
	}
	
	/**
	 * 	Update Tgt15 with the passed value
	 *	@param number
	 */
	public void setTgt15(int number)  throws CFException{
		work.setTgt15(number);
	}


	public void setTgt15(long number)  throws CFException{
		work.setTgt15((int)number);
	}


	/**
	 *	Returns the value of tgt14
	 *	@return tgt14
	 */
	public int getTgt14() throws CFException {        
   		return work.getTgt14();
	}
	
	/**
	 * 	Update Tgt14 with the passed value
	 *	@param number
	 */
	public void setTgt14(int number)  throws CFException{
		work.setTgt14(number);
	}


	public void setTgt14(long number)  throws CFException{
		work.setTgt14((int)number);
	}


	/**
	 *	Returns the value of src16
	 *	@return src16
	 */
	public int getSrc16() throws CFException {        
   		return work.getSrc16();
	}
	
	/**
	 * 	Update Src16 with the passed value
	 *	@param number
	 */
	public void setSrc16(int number)  throws CFException{
		work.setSrc16(number);
	}


	public void setSrc16(long number)  throws CFException{
		work.setSrc16((int)number);
	}


	/**
	 *	Returns the value of tgt17
	 *	@return tgt17
	 */
	public long getTgt17() throws CFException {        
   		return work.getTgt17();
	}
	
	/**
	 * 	Update Tgt17 with the passed value
	 *	@param number
	 */
	public void setTgt17(long number)  throws CFException{
		work.setTgt17(number);
	}



	/**
	 *	Returns the value of tgt18
	 *	@return tgt18
	 */
	public long getTgt18() throws CFException {        
   		return work.getTgt18();
	}
	
	/**
	 * 	Update Tgt18 with the passed value
	 *	@param number
	 */
	public void setTgt18(long number)  throws CFException{
		work.setTgt18(number);
	}



	/**
	 *	Returns the value of src15
	 *	@return src15
	 */
	public int getSrc15() throws CFException {        
   		return work.getSrc15();
	}
	
	/**
	 * 	Update Src15 with the passed value
	 *	@param number
	 */
	public void setSrc15(int number)  throws CFException{
		work.setSrc15(number);
	}


	public void setSrc15(long number)  throws CFException{
		work.setSrc15((int)number);
	}


	/**
	 *	Returns the value of src14
	 *	@return src14
	 */
	public long getSrc14() throws CFException {        
   		return work.getSrc14();
	}
	
	/**
	 * 	Update Src14 with the passed value
	 *	@param number
	 */
	public void setSrc14(long number)  throws CFException{
		work.setSrc14(number);
	}



	/**
	 *	Returns the value of tgt16
	 *	@return tgt16
	 */
	public long getTgt16() throws CFException {        
   		return work.getTgt16();
	}
	
	/**
	 * 	Update Tgt16 with the passed value
	 *	@param number
	 */
	public void setTgt16(long number)  throws CFException{
		work.setTgt16(number);
	}



	/**
	 *	Returns the value of src18
	 *	@return src18
	 */
	public int getSrc18() throws CFException {        
   		return work.getSrc18();
	}
	
	/**
	 * 	Update Src18 with the passed value
	 *	@param number
	 */
	public void setSrc18(int number)  throws CFException{
		work.setSrc18(number);
	}


	public void setSrc18(long number)  throws CFException{
		work.setSrc18((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process3Split49OutCtx clone() {
        Process3Split49OutCtx cloneObj = new Process3Split49OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split49OutCtx getProcess3Split49OutCtx() {
            return new Process3Split49OutCtx();
    }
     public class Process4Split51InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src18
	 *	@return src18
	 */
	public int getSrc18() throws CFException {        
   		return work.getSrc18();
	}
	
	/**
	 * 	Update Src18 with the passed value
	 *	@param number
	 */
	public void setSrc18(int number)  throws CFException{
		work.setSrc18(number);
	}


	public void setSrc18(long number)  throws CFException{
		work.setSrc18((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process4Split51OutCtx getProcess4Split51OutCtx() {
            return new Process4Split51OutCtx();
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

    public Process4Split51InCtx clone() {
        Process4Split51InCtx cloneObj = new Process4Split51InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process4Split51InCtx getProcess4Split51InCtx() {
            return new Process4Split51InCtx();
    }
     public class Process4Split51OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public short getSrc21() throws CFException {        
   		return work.getSrc21();
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *	@param number
	 */
	public void setSrc21(short number)  throws CFException{
		work.setSrc21(number);
	}

	public void setSrc21(int number)  throws CFException{
		work.setSrc21((short)number);
	}

	public void setSrc21(long number)  throws CFException{
		work.setSrc21((short)number);
	}



	/**
	 *	Returns the value of src20
	 *	@return src20
	 */
	public int getSrc20() throws CFException {        
   		return work.getSrc20();
	}
	
	/**
	 * 	Update Src20 with the passed value
	 *	@param number
	 */
	public void setSrc20(int number)  throws CFException{
		work.setSrc20(number);
	}


	public void setSrc20(long number)  throws CFException{
		work.setSrc20((int)number);
	}


	/**
	 *	Returns the value of tgt18
	 *	@return tgt18
	 */
	public long getTgt18() throws CFException {        
   		return work.getTgt18();
	}
	
	/**
	 * 	Update Tgt18 with the passed value
	 *	@param number
	 */
	public void setTgt18(long number)  throws CFException{
		work.setTgt18(number);
	}



	/**
	 *	Returns the value of tgt20
	 *	@return tgt20
	 */
	public int getTgt20() throws CFException {        
   		return work.getTgt20();
	}
	
	/**
	 * 	Update Tgt20 with the passed value
	 *	@param number
	 */
	public void setTgt20(int number)  throws CFException{
		work.setTgt20(number);
	}


	public void setTgt20(long number)  throws CFException{
		work.setTgt20((int)number);
	}


	/**
	 *	Returns the value of tgt19
	 *	@return tgt19
	 */
	public short getTgt19() throws CFException {        
   		return work.getTgt19();
	}
	
	/**
	 * 	Update Tgt19 with the passed value
	 *	@param number
	 */
	public void setTgt19(short number)  throws CFException{
		work.setTgt19(number);
	}

	public void setTgt19(int number)  throws CFException{
		work.setTgt19((short)number);
	}

	public void setTgt19(long number)  throws CFException{
		work.setTgt19((short)number);
	}



	/**
	 *	Returns the value of tgt21
	 *	@return tgt21
	 */
	public int getTgt21() throws CFException {        
   		return work.getTgt21();
	}
	
	/**
	 * 	Update Tgt21 with the passed value
	 *	@param number
	 */
	public void setTgt21(int number)  throws CFException{
		work.setTgt21(number);
	}


	public void setTgt21(long number)  throws CFException{
		work.setTgt21((int)number);
	}


	/**
	 *	Returns the value of src22
	 *	@return src22
	 */
	public short getSrc22() throws CFException {        
   		return work.getSrc22();
	}
	
	/**
	 * 	Update Src22 with the passed value
	 *	@param number
	 */
	public void setSrc22(short number)  throws CFException{
		work.setSrc22(number);
	}

	public void setSrc22(int number)  throws CFException{
		work.setSrc22((short)number);
	}

	public void setSrc22(long number)  throws CFException{
		work.setSrc22((short)number);
	}



	/**
	 *	Returns the value of tgt22
	 *	@return tgt22
	 */
	public long getTgt22() throws CFException {        
   		return work.getTgt22();
	}
	
	/**
	 * 	Update Tgt22 with the passed value
	 *	@param number
	 */
	public void setTgt22(long number)  throws CFException{
		work.setTgt22(number);
	}



	/**
	 *	Returns the value of src18
	 *	@return src18
	 */
	public int getSrc18() throws CFException {        
   		return work.getSrc18();
	}
	
	/**
	 * 	Update Src18 with the passed value
	 *	@param number
	 */
	public void setSrc18(int number)  throws CFException{
		work.setSrc18(number);
	}


	public void setSrc18(long number)  throws CFException{
		work.setSrc18((int)number);
	}


	/**
	 *	Returns the value of src19
	 *	@return src19
	 */
	public int getSrc19() throws CFException {        
   		return work.getSrc19();
	}
	
	/**
	 * 	Update Src19 with the passed value
	 *	@param number
	 */
	public void setSrc19(int number)  throws CFException{
		work.setSrc19(number);
	}


	public void setSrc19(long number)  throws CFException{
		work.setSrc19((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process4Split51OutCtx clone() {
        Process4Split51OutCtx cloneObj = new Process4Split51OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process4Split51OutCtx getProcess4Split51OutCtx() {
            return new Process4Split51OutCtx();
    }
     public class Process5Split53InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src22
	 *	@return src22
	 */
	public short getSrc22() throws CFException {        
   		return work.getSrc22();
	}
	
	/**
	 * 	Update Src22 with the passed value
	 *	@param number
	 */
	public void setSrc22(short number)  throws CFException{
		work.setSrc22(number);
	}

	public void setSrc22(int number)  throws CFException{
		work.setSrc22((short)number);
	}

	public void setSrc22(long number)  throws CFException{
		work.setSrc22((short)number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process5Split53OutCtx getProcess5Split53OutCtx() {
            return new Process5Split53OutCtx();
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

    public Process5Split53InCtx clone() {
        Process5Split53InCtx cloneObj = new Process5Split53InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process5Split53InCtx getProcess5Split53InCtx() {
            return new Process5Split53InCtx();
    }
     public class Process5Split53OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src24
	 *	@return src24
	 */
	public short getSrc24() throws CFException {        
   		return work.getSrc24();
	}
	
	/**
	 * 	Update Src24 with the passed value
	 *	@param number
	 */
	public void setSrc24(short number)  throws CFException{
		work.setSrc24(number);
	}

	public void setSrc24(int number)  throws CFException{
		work.setSrc24((short)number);
	}

	public void setSrc24(long number)  throws CFException{
		work.setSrc24((short)number);
	}



	/**
	 *	Returns the value of tgt24
	 *	@return tgt24
	 */
	public long getTgt24() throws CFException {        
   		return work.getTgt24();
	}
	
	/**
	 * 	Update Tgt24 with the passed value
	 *	@param number
	 */
	public void setTgt24(long number)  throws CFException{
		work.setTgt24(number);
	}



	/**
	 *	Returns the value of tgt23
	 *	@return tgt23
	 */
	public long getTgt23() throws CFException {        
   		return work.getTgt23();
	}
	
	/**
	 * 	Update Tgt23 with the passed value
	 *	@param number
	 */
	public void setTgt23(long number)  throws CFException{
		work.setTgt23(number);
	}



	/**
	 *	Returns the value of tgt22
	 *	@return tgt22
	 */
	public long getTgt22() throws CFException {        
   		return work.getTgt22();
	}
	
	/**
	 * 	Update Tgt22 with the passed value
	 *	@param number
	 */
	public void setTgt22(long number)  throws CFException{
		work.setTgt22(number);
	}



	/**
	 *	Returns the value of src22
	 *	@return src22
	 */
	public short getSrc22() throws CFException {        
   		return work.getSrc22();
	}
	
	/**
	 * 	Update Src22 with the passed value
	 *	@param number
	 */
	public void setSrc22(short number)  throws CFException{
		work.setSrc22(number);
	}

	public void setSrc22(int number)  throws CFException{
		work.setSrc22((short)number);
	}

	public void setSrc22(long number)  throws CFException{
		work.setSrc22((short)number);
	}



	/**
	 *	Returns the value of src26
	 *	@return src26
	 */
	public short getSrc26() throws CFException {        
   		return work.getSrc26();
	}
	
	/**
	 * 	Update Src26 with the passed value
	 *	@param number
	 */
	public void setSrc26(short number)  throws CFException{
		work.setSrc26(number);
	}

	public void setSrc26(int number)  throws CFException{
		work.setSrc26((short)number);
	}

	public void setSrc26(long number)  throws CFException{
		work.setSrc26((short)number);
	}



	/**
	 *	Returns the value of tgt25
	 *	@return tgt25
	 */
	public short getTgt25() throws CFException {        
   		return work.getTgt25();
	}
	
	/**
	 * 	Update Tgt25 with the passed value
	 *	@param number
	 */
	public void setTgt25(short number)  throws CFException{
		work.setTgt25(number);
	}

	public void setTgt25(int number)  throws CFException{
		work.setTgt25((short)number);
	}

	public void setTgt25(long number)  throws CFException{
		work.setTgt25((short)number);
	}



	/**
	 *	Returns the value of tgt26
	 *	@return tgt26
	 */
	public int getTgt26() throws CFException {        
   		return work.getTgt26();
	}
	
	/**
	 * 	Update Tgt26 with the passed value
	 *	@param number
	 */
	public void setTgt26(int number)  throws CFException{
		work.setTgt26(number);
	}


	public void setTgt26(long number)  throws CFException{
		work.setTgt26((int)number);
	}


	/**
	 *	Returns the value of src23
	 *	@return src23
	 */
	public short getSrc23() throws CFException {        
   		return work.getSrc23();
	}
	
	/**
	 * 	Update Src23 with the passed value
	 *	@param number
	 */
	public void setSrc23(short number)  throws CFException{
		work.setSrc23(number);
	}

	public void setSrc23(int number)  throws CFException{
		work.setSrc23((short)number);
	}

	public void setSrc23(long number)  throws CFException{
		work.setSrc23((short)number);
	}



	/**
	 *	Returns the value of src25
	 *	@return src25
	 */
	public short getSrc25() throws CFException {        
   		return work.getSrc25();
	}
	
	/**
	 * 	Update Src25 with the passed value
	 *	@param number
	 */
	public void setSrc25(short number)  throws CFException{
		work.setSrc25(number);
	}

	public void setSrc25(int number)  throws CFException{
		work.setSrc25((short)number);
	}

	public void setSrc25(long number)  throws CFException{
		work.setSrc25((short)number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process5Split53OutCtx clone() {
        Process5Split53OutCtx cloneObj = new Process5Split53OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process5Split53OutCtx getProcess5Split53OutCtx() {
            return new Process5Split53OutCtx();
    }
     public class Process6Split55InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src28
	 *	@return src28
	 */
	public long getSrc28() throws CFException {        
   		return work.getSrc28();
	}
	
	/**
	 * 	Update Src28 with the passed value
	 *	@param number
	 */
	public void setSrc28(long number)  throws CFException{
		work.setSrc28(number);
	}



	/**
	 *	Returns the value of src27
	 *	@return src27
	 */
	public long getSrc27() throws CFException {        
   		return work.getSrc27();
	}
	
	/**
	 * 	Update Src27 with the passed value
	 *	@param number
	 */
	public void setSrc27(long number)  throws CFException{
		work.setSrc27(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process6Split55OutCtx getProcess6Split55OutCtx() {
            return new Process6Split55OutCtx();
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

    public Process6Split55InCtx clone() {
        Process6Split55InCtx cloneObj = new Process6Split55InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process6Split55InCtx getProcess6Split55InCtx() {
            return new Process6Split55InCtx();
    }
     public class Process6Split55OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src28
	 *	@return src28
	 */
	public long getSrc28() throws CFException {        
   		return work.getSrc28();
	}
	
	/**
	 * 	Update Src28 with the passed value
	 *	@param number
	 */
	public void setSrc28(long number)  throws CFException{
		work.setSrc28(number);
	}



	/**
	 *	Returns the value of tgt29
	 *	@return tgt29
	 */
	public long getTgt29() throws CFException {        
   		return work.getTgt29();
	}
	
	/**
	 * 	Update Tgt29 with the passed value
	 *	@param number
	 */
	public void setTgt29(long number)  throws CFException{
		work.setTgt29(number);
	}



	/**
	 *	Returns the value of src30
	 *	@return src30
	 */
	public long getSrc30() throws CFException {        
   		return work.getSrc30();
	}
	
	/**
	 * 	Update Src30 with the passed value
	 *	@param number
	 */
	public void setSrc30(long number)  throws CFException{
		work.setSrc30(number);
	}



	/**
	 *	Returns the value of src27
	 *	@return src27
	 */
	public long getSrc27() throws CFException {        
   		return work.getSrc27();
	}
	
	/**
	 * 	Update Src27 with the passed value
	 *	@param number
	 */
	public void setSrc27(long number)  throws CFException{
		work.setSrc27(number);
	}



	/**
	 *	Returns the value of src29
	 *	@return src29
	 */
	public long getSrc29() throws CFException {        
   		return work.getSrc29();
	}
	
	/**
	 * 	Update Src29 with the passed value
	 *	@param number
	 */
	public void setSrc29(long number)  throws CFException{
		work.setSrc29(number);
	}



	/**
	 *	Returns the value of src31
	 *	@return src31
	 */
	public long getSrc31() throws CFException {        
   		return work.getSrc31();
	}
	
	/**
	 * 	Update Src31 with the passed value
	 *	@param number
	 */
	public void setSrc31(long number)  throws CFException{
		work.setSrc31(number);
	}



	/**
	 *	Returns the value of tgt30
	 *	@return tgt30
	 */
	public long getTgt30() throws CFException {        
   		return work.getTgt30();
	}
	
	/**
	 * 	Update Tgt30 with the passed value
	 *	@param number
	 */
	public void setTgt30(long number)  throws CFException{
		work.setTgt30(number);
	}



	/**
	 *	Returns the value of tgt27
	 *	@return tgt27
	 */
	public long getTgt27() throws CFException {        
   		return work.getTgt27();
	}
	
	/**
	 * 	Update Tgt27 with the passed value
	 *	@param number
	 */
	public void setTgt27(long number)  throws CFException{
		work.setTgt27(number);
	}



	/**
	 *	Returns the value of tgt28
	 *	@return tgt28
	 */
	public int getTgt28() throws CFException {        
   		return work.getTgt28();
	}
	
	/**
	 * 	Update Tgt28 with the passed value
	 *	@param number
	 */
	public void setTgt28(int number)  throws CFException{
		work.setTgt28(number);
	}


	public void setTgt28(long number)  throws CFException{
		work.setTgt28((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process6Split55OutCtx clone() {
        Process6Split55OutCtx cloneObj = new Process6Split55OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process6Split55OutCtx getProcess6Split55OutCtx() {
            return new Process6Split55OutCtx();
    }
     public class Process7Split57InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src33
	 *	@return src33
	 */
	public int getSrc33() throws CFException {        
   		return work.getSrc33();
	}
	
	/**
	 * 	Update Src33 with the passed value
	 *	@param number
	 */
	public void setSrc33(int number)  throws CFException{
		work.setSrc33(number);
	}


	public void setSrc33(long number)  throws CFException{
		work.setSrc33((int)number);
	}


	/**
	 *	Returns the value of src31
	 *	@return src31
	 */
	public long getSrc31() throws CFException {        
   		return work.getSrc31();
	}
	
	/**
	 * 	Update Src31 with the passed value
	 *	@param number
	 */
	public void setSrc31(long number)  throws CFException{
		work.setSrc31(number);
	}



	/**
	 *	Returns the value of src34
	 *	@return src34
	 */
	public int getSrc34() throws CFException {        
   		return work.getSrc34();
	}
	
	/**
	 * 	Update Src34 with the passed value
	 *	@param number
	 */
	public void setSrc34(int number)  throws CFException{
		work.setSrc34(number);
	}


	public void setSrc34(long number)  throws CFException{
		work.setSrc34((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process7Split57OutCtx getProcess7Split57OutCtx() {
            return new Process7Split57OutCtx();
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

    public Process7Split57InCtx clone() {
        Process7Split57InCtx cloneObj = new Process7Split57InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process7Split57InCtx getProcess7Split57InCtx() {
            return new Process7Split57InCtx();
    }
     public class Process7Split57OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src32
	 *	@return src32
	 */
	public long getSrc32() throws CFException {        
   		return work.getSrc32();
	}
	
	/**
	 * 	Update Src32 with the passed value
	 *	@param number
	 */
	public void setSrc32(long number)  throws CFException{
		work.setSrc32(number);
	}



	/**
	 *	Returns the value of tgt33
	 *	@return tgt33
	 */
	public int getTgt33() throws CFException {        
   		return work.getTgt33();
	}
	
	/**
	 * 	Update Tgt33 with the passed value
	 *	@param number
	 */
	public void setTgt33(int number)  throws CFException{
		work.setTgt33(number);
	}


	public void setTgt33(long number)  throws CFException{
		work.setTgt33((int)number);
	}


	/**
	 *	Returns the value of tgt31
	 *	@return tgt31
	 */
	public short getTgt31() throws CFException {        
   		return work.getTgt31();
	}
	
	/**
	 * 	Update Tgt31 with the passed value
	 *	@param number
	 */
	public void setTgt31(short number)  throws CFException{
		work.setTgt31(number);
	}

	public void setTgt31(int number)  throws CFException{
		work.setTgt31((short)number);
	}

	public void setTgt31(long number)  throws CFException{
		work.setTgt31((short)number);
	}



	/**
	 *	Returns the value of src33
	 *	@return src33
	 */
	public int getSrc33() throws CFException {        
   		return work.getSrc33();
	}
	
	/**
	 * 	Update Src33 with the passed value
	 *	@param number
	 */
	public void setSrc33(int number)  throws CFException{
		work.setSrc33(number);
	}


	public void setSrc33(long number)  throws CFException{
		work.setSrc33((int)number);
	}


	/**
	 *	Returns the value of tgt34
	 *	@return tgt34
	 */
	public long getTgt34() throws CFException {        
   		return work.getTgt34();
	}
	
	/**
	 * 	Update Tgt34 with the passed value
	 *	@param number
	 */
	public void setTgt34(long number)  throws CFException{
		work.setTgt34(number);
	}



	/**
	 *	Returns the value of src31
	 *	@return src31
	 */
	public long getSrc31() throws CFException {        
   		return work.getSrc31();
	}
	
	/**
	 * 	Update Src31 with the passed value
	 *	@param number
	 */
	public void setSrc31(long number)  throws CFException{
		work.setSrc31(number);
	}



	/**
	 *	Returns the value of tgt32
	 *	@return tgt32
	 */
	public int getTgt32() throws CFException {        
   		return work.getTgt32();
	}
	
	/**
	 * 	Update Tgt32 with the passed value
	 *	@param number
	 */
	public void setTgt32(int number)  throws CFException{
		work.setTgt32(number);
	}


	public void setTgt32(long number)  throws CFException{
		work.setTgt32((int)number);
	}


	/**
	 *	Returns the value of src34
	 *	@return src34
	 */
	public int getSrc34() throws CFException {        
   		return work.getSrc34();
	}
	
	/**
	 * 	Update Src34 with the passed value
	 *	@param number
	 */
	public void setSrc34(int number)  throws CFException{
		work.setSrc34(number);
	}


	public void setSrc34(long number)  throws CFException{
		work.setSrc34((int)number);
	}


	/**
	 *	Returns the value of src35
	 *	@return src35
	 */
	public int getSrc35() throws CFException {        
   		return work.getSrc35();
	}
	
	/**
	 * 	Update Src35 with the passed value
	 *	@param number
	 */
	public void setSrc35(int number)  throws CFException{
		work.setSrc35(number);
	}


	public void setSrc35(long number)  throws CFException{
		work.setSrc35((int)number);
	}


	/**
	 *	Returns the value of tgt35
	 *	@return tgt35
	 */
	public long getTgt35() throws CFException {        
   		return work.getTgt35();
	}
	
	/**
	 * 	Update Tgt35 with the passed value
	 *	@param number
	 */
	public void setTgt35(long number)  throws CFException{
		work.setTgt35(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process7Split57OutCtx clone() {
        Process7Split57OutCtx cloneObj = new Process7Split57OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process7Split57OutCtx getProcess7Split57OutCtx() {
            return new Process7Split57OutCtx();
    }
     public class Process8Split59InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src36
	 *	@return src36
	 */
	public int getSrc36() throws CFException {        
   		return work.getSrc36();
	}
	
	/**
	 * 	Update Src36 with the passed value
	 *	@param number
	 */
	public void setSrc36(int number)  throws CFException{
		work.setSrc36(number);
	}


	public void setSrc36(long number)  throws CFException{
		work.setSrc36((int)number);
	}


	/**
	 *	Returns the value of src35
	 *	@return src35
	 */
	public int getSrc35() throws CFException {        
   		return work.getSrc35();
	}
	
	/**
	 * 	Update Src35 with the passed value
	 *	@param number
	 */
	public void setSrc35(int number)  throws CFException{
		work.setSrc35(number);
	}


	public void setSrc35(long number)  throws CFException{
		work.setSrc35((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process8Split59OutCtx getProcess8Split59OutCtx() {
            return new Process8Split59OutCtx();
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

    public Process8Split59InCtx clone() {
        Process8Split59InCtx cloneObj = new Process8Split59InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process8Split59InCtx getProcess8Split59InCtx() {
            return new Process8Split59InCtx();
    }
     public class Process8Split59OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt39
	 *	@return tgt39
	 */
   public char[] getTgt39() throws CFException  {              
   		return work.getTgt39();
   }

  
	/**
	*  set variable tgt39
	*  @param value
	**/
   public void setTgt39(char[] value) throws CFException {
      work.setTgt39(value);
   } 

     /**
	 * 	Update Tgt39 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt39(char[] source, int sourceIndex) throws CFException {
      work.setTgt39(source, sourceIndex);
   	
   }
   
   public void setTgt39(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt39(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt39 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt39(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt39(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt39 with another Field
	 *	@param value
	 */
   public void setTgt39(Field source) {
      work.setTgt39(source);
   }  
   
     /**
	 * 	Update Tgt39 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt39(Field source, int sourceIndex,int sourceLen) {
      work.setTgt39(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt39 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt39(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt39(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src36
	 *	@return src36
	 */
	public int getSrc36() throws CFException {        
   		return work.getSrc36();
	}
	
	/**
	 * 	Update Src36 with the passed value
	 *	@param number
	 */
	public void setSrc36(int number)  throws CFException{
		work.setSrc36(number);
	}


	public void setSrc36(long number)  throws CFException{
		work.setSrc36((int)number);
	}


	/**
	 *	Returns the value of src38
	 *	@return src38
	 */
	public int getSrc38() throws CFException {        
   		return work.getSrc38();
	}
	
	/**
	 * 	Update Src38 with the passed value
	 *	@param number
	 */
	public void setSrc38(int number)  throws CFException{
		work.setSrc38(number);
	}


	public void setSrc38(long number)  throws CFException{
		work.setSrc38((int)number);
	}


	/**
	 *	Returns the value of tgt38
	 *	@return tgt38
	 */
	public int getTgt38() throws CFException {        
   		return work.getTgt38();
	}
	
	/**
	 * 	Update Tgt38 with the passed value
	 *	@param number
	 */
	public void setTgt38(int number)  throws CFException{
		work.setTgt38(number);
	}


	public void setTgt38(long number)  throws CFException{
		work.setTgt38((int)number);
	}


	/**
	 *	Returns the value of src37
	 *	@return src37
	 */
	public int getSrc37() throws CFException {        
   		return work.getSrc37();
	}
	
	/**
	 * 	Update Src37 with the passed value
	 *	@param number
	 */
	public void setSrc37(int number)  throws CFException{
		work.setSrc37(number);
	}


	public void setSrc37(long number)  throws CFException{
		work.setSrc37((int)number);
	}


	/**
	 *	Returns the value of src35
	 *	@return src35
	 */
	public int getSrc35() throws CFException {        
   		return work.getSrc35();
	}
	
	/**
	 * 	Update Src35 with the passed value
	 *	@param number
	 */
	public void setSrc35(int number)  throws CFException{
		work.setSrc35(number);
	}


	public void setSrc35(long number)  throws CFException{
		work.setSrc35((int)number);
	}


	/**
	 *	Returns the value of tgt35
	 *	@return tgt35
	 */
	public long getTgt35() throws CFException {        
   		return work.getTgt35();
	}
	
	/**
	 * 	Update Tgt35 with the passed value
	 *	@param number
	 */
	public void setTgt35(long number)  throws CFException{
		work.setTgt35(number);
	}



	/**
	 *	Returns the value of src39
	 *	@return src39
	 */
	public short getSrc39() throws CFException {        
   		return work.getSrc39();
	}
	
	/**
	 * 	Update Src39 with the passed value
	 *	@param number
	 */
	public void setSrc39(short number)  throws CFException{
		work.setSrc39(number);
	}

	public void setSrc39(int number)  throws CFException{
		work.setSrc39((short)number);
	}

	public void setSrc39(long number)  throws CFException{
		work.setSrc39((short)number);
	}



	/**
	 *	Returns the value of tgt36
	 *	@return tgt36
	 */
	public long getTgt36() throws CFException {        
   		return work.getTgt36();
	}
	
	/**
	 * 	Update Tgt36 with the passed value
	 *	@param number
	 */
	public void setTgt36(long number)  throws CFException{
		work.setTgt36(number);
	}



	/**
	 *	Returns the value of tgt37
	 *	@return tgt37
	 */
	public short getTgt37() throws CFException {        
   		return work.getTgt37();
	}
	
	/**
	 * 	Update Tgt37 with the passed value
	 *	@param number
	 */
	public void setTgt37(short number)  throws CFException{
		work.setTgt37(number);
	}

	public void setTgt37(int number)  throws CFException{
		work.setTgt37((short)number);
	}

	public void setTgt37(long number)  throws CFException{
		work.setTgt37((short)number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process8Split59OutCtx clone() {
        Process8Split59OutCtx cloneObj = new Process8Split59OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process8Split59OutCtx getProcess8Split59OutCtx() {
            return new Process8Split59OutCtx();
    }
     public class Process9Split61InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src39
	 *	@return src39
	 */
	public short getSrc39() throws CFException {        
   		return work.getSrc39();
	}
	
	/**
	 * 	Update Src39 with the passed value
	 *	@param number
	 */
	public void setSrc39(short number)  throws CFException{
		work.setSrc39(number);
	}

	public void setSrc39(int number)  throws CFException{
		work.setSrc39((short)number);
	}

	public void setSrc39(long number)  throws CFException{
		work.setSrc39((short)number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process9Split61OutCtx getProcess9Split61OutCtx() {
            return new Process9Split61OutCtx();
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

    public Process9Split61InCtx clone() {
        Process9Split61InCtx cloneObj = new Process9Split61InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process9Split61InCtx getProcess9Split61InCtx() {
            return new Process9Split61InCtx();
    }
     public class Process9Split61OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt39
	 *	@return tgt39
	 */
   public char[] getTgt39() throws CFException  {              
   		return work.getTgt39();
   }

  
	/**
	*  set variable tgt39
	*  @param value
	**/
   public void setTgt39(char[] value) throws CFException {
      work.setTgt39(value);
   } 

     /**
	 * 	Update Tgt39 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt39(char[] source, int sourceIndex) throws CFException {
      work.setTgt39(source, sourceIndex);
   	
   }
   
   public void setTgt39(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt39(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt39 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt39(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt39(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt39 with another Field
	 *	@param value
	 */
   public void setTgt39(Field source) {
      work.setTgt39(source);
   }  
   
     /**
	 * 	Update Tgt39 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt39(Field source, int sourceIndex,int sourceLen) {
      work.setTgt39(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt39 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt39(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt39(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src40
	 *	@return src40
	 */
	public int getSrc40() throws CFException {        
   		return work.getSrc40();
	}
	
	/**
	 * 	Update Src40 with the passed value
	 *	@param number
	 */
	public void setSrc40(int number)  throws CFException{
		work.setSrc40(number);
	}


	public void setSrc40(long number)  throws CFException{
		work.setSrc40((int)number);
	}


	public BigDecimal getTgt42() throws CFException{      
   		return work.getTgt42();
	}

    public char[] getTgt42String() throws CFException {
          return  work.getTgt42().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt42 with the passed number
	 *	@param number
	 */
	public void setTgt42(BigDecimal number)  throws CFException{
		work.setTgt42(number);
   }

	public BigDecimal getTgt41() throws CFException{      
   		return work.getTgt41();
	}

    public char[] getTgt41String() throws CFException {
          return  work.getTgt41().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt41 with the passed number
	 *	@param number
	 */
	public void setTgt41(BigDecimal number)  throws CFException{
		work.setTgt41(number);
   }

	/**
	 *	Returns the value of src39
	 *	@return src39
	 */
	public short getSrc39() throws CFException {        
   		return work.getSrc39();
	}
	
	/**
	 * 	Update Src39 with the passed value
	 *	@param number
	 */
	public void setSrc39(short number)  throws CFException{
		work.setSrc39(number);
	}

	public void setSrc39(int number)  throws CFException{
		work.setSrc39((short)number);
	}

	public void setSrc39(long number)  throws CFException{
		work.setSrc39((short)number);
	}



	/**
	 *	Returns the value of src43
	 *	@return src43
	 */
	public int getSrc43() throws CFException {        
   		return work.getSrc43();
	}
	
	/**
	 * 	Update Src43 with the passed value
	 *	@param number
	 */
	public void setSrc43(int number)  throws CFException{
		work.setSrc43(number);
	}


	public void setSrc43(long number)  throws CFException{
		work.setSrc43((int)number);
	}


	/**
	 *	Returns the value of tgt40
	 *	@return tgt40
	 */
   public char[] getTgt40() throws CFException  {              
   		return work.getTgt40();
   }

  
	/**
	*  set variable tgt40
	*  @param value
	**/
   public void setTgt40(char[] value) throws CFException {
      work.setTgt40(value);
   } 

     /**
	 * 	Update Tgt40 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt40(char[] source, int sourceIndex) throws CFException {
      work.setTgt40(source, sourceIndex);
   	
   }
   
   public void setTgt40(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt40(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt40 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt40(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt40(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt40 with another Field
	 *	@param value
	 */
   public void setTgt40(Field source) {
      work.setTgt40(source);
   }  
   
     /**
	 * 	Update Tgt40 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt40(Field source, int sourceIndex,int sourceLen) {
      work.setTgt40(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt40 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt40(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt40(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src42
	 *	@return src42
	 */
	public short getSrc42() throws CFException {        
   		return work.getSrc42();
	}
	
	/**
	 * 	Update Src42 with the passed value
	 *	@param number
	 */
	public void setSrc42(short number)  throws CFException{
		work.setSrc42(number);
	}

	public void setSrc42(int number)  throws CFException{
		work.setSrc42((short)number);
	}

	public void setSrc42(long number)  throws CFException{
		work.setSrc42((short)number);
	}



	/**
	 *	Returns the value of src41
	 *	@return src41
	 */
	public short getSrc41() throws CFException {        
   		return work.getSrc41();
	}
	
	/**
	 * 	Update Src41 with the passed value
	 *	@param number
	 */
	public void setSrc41(short number)  throws CFException{
		work.setSrc41(number);
	}

	public void setSrc41(int number)  throws CFException{
		work.setSrc41((short)number);
	}

	public void setSrc41(long number)  throws CFException{
		work.setSrc41((short)number);
	}



	public BigDecimal getTgt43() throws CFException{      
   		return work.getTgt43();
	}

    public char[] getTgt43String() throws CFException {
          return  work.getTgt43().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt43 with the passed number
	 *	@param number
	 */
	public void setTgt43(BigDecimal number)  throws CFException{
		work.setTgt43(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process9Split61OutCtx clone() {
        Process9Split61OutCtx cloneObj = new Process9Split61OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process9Split61OutCtx getProcess9Split61OutCtx() {
            return new Process9Split61OutCtx();
    }
     public class Process10Split63OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src46
	 *	@return src46
	 */
	public int getSrc46() throws CFException {        
   		return work.getSrc46();
	}
	
	/**
	 * 	Update Src46 with the passed value
	 *	@param number
	 */
	public void setSrc46(int number)  throws CFException{
		work.setSrc46(number);
	}


	public void setSrc46(long number)  throws CFException{
		work.setSrc46((int)number);
	}


	public BigDecimal getTgt45() throws CFException{      
   		return work.getTgt45();
	}

    public char[] getTgt45String() throws CFException {
          return  work.getTgt45().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt45 with the passed number
	 *	@param number
	 */
	public void setTgt45(BigDecimal number)  throws CFException{
		work.setTgt45(number);
   }

	public BigDecimal getTgt46() throws CFException{      
   		return work.getTgt46();
	}

    public char[] getTgt46String() throws CFException {
          return  work.getTgt46().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt46 with the passed number
	 *	@param number
	 */
	public void setTgt46(BigDecimal number)  throws CFException{
		work.setTgt46(number);
   }

	public BigDecimal getTgt44() throws CFException{      
   		return work.getTgt44();
	}

    public char[] getTgt44String() throws CFException {
          return  work.getTgt44().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt44 with the passed number
	 *	@param number
	 */
	public void setTgt44(BigDecimal number)  throws CFException{
		work.setTgt44(number);
   }

	/**
	 *	Returns the value of src45
	 *	@return src45
	 */
	public int getSrc45() throws CFException {        
   		return work.getSrc45();
	}
	
	/**
	 * 	Update Src45 with the passed value
	 *	@param number
	 */
	public void setSrc45(int number)  throws CFException{
		work.setSrc45(number);
	}


	public void setSrc45(long number)  throws CFException{
		work.setSrc45((int)number);
	}


	public BigDecimal getTgt47() throws CFException{      
   		return work.getTgt47();
	}

    public char[] getTgt47String() throws CFException {
          return  work.getTgt47().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt47 with the passed number
	 *	@param number
	 */
	public void setTgt47(BigDecimal number)  throws CFException{
		work.setTgt47(number);
   }

	/**
	 *	Returns the value of src44
	 *	@return src44
	 */
	public int getSrc44() throws CFException {        
   		return work.getSrc44();
	}
	
	/**
	 * 	Update Src44 with the passed value
	 *	@param number
	 */
	public void setSrc44(int number)  throws CFException{
		work.setSrc44(number);
	}


	public void setSrc44(long number)  throws CFException{
		work.setSrc44((int)number);
	}


	/**
	 *	Returns the value of src47
	 *	@return src47
	 */
	public long getSrc47() throws CFException {        
   		return work.getSrc47();
	}
	
	/**
	 * 	Update Src47 with the passed value
	 *	@param number
	 */
	public void setSrc47(long number)  throws CFException{
		work.setSrc47(number);
	}



	/**
	 *	Returns the value of src48
	 *	@return src48
	 */
	public long getSrc48() throws CFException {        
   		return work.getSrc48();
	}
	
	/**
	 * 	Update Src48 with the passed value
	 *	@param number
	 */
	public void setSrc48(long number)  throws CFException{
		work.setSrc48(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process10Split63OutCtx clone() {
        Process10Split63OutCtx cloneObj = new Process10Split63OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process10Split63OutCtx getProcess10Split63OutCtx() {
            return new Process10Split63OutCtx();
    }
     public class Process11Split65InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src48
	 *	@return src48
	 */
	public long getSrc48() throws CFException {        
   		return work.getSrc48();
	}
	
	/**
	 * 	Update Src48 with the passed value
	 *	@param number
	 */
	public void setSrc48(long number)  throws CFException{
		work.setSrc48(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process11Split65OutCtx getProcess11Split65OutCtx() {
            return new Process11Split65OutCtx();
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

    public Process11Split65InCtx clone() {
        Process11Split65InCtx cloneObj = new Process11Split65InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process11Split65InCtx getProcess11Split65InCtx() {
            return new Process11Split65InCtx();
    }
     public class Process11Split65OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	public BigDecimal getSrc49() throws CFException{      
   		return work.getSrc49();
	}

    public char[] getSrc49String() throws CFException {
          return  work.getSrc49().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src49 with the passed number
	 *	@param number
	 */
	public void setSrc49(BigDecimal number)  throws CFException{
		work.setSrc49(number);
   }

	public BigDecimal getTgt48() throws CFException{      
   		return work.getTgt48();
	}

    public char[] getTgt48String() throws CFException {
          return  work.getTgt48().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt48 with the passed number
	 *	@param number
	 */
	public void setTgt48(BigDecimal number)  throws CFException{
		work.setTgt48(number);
   }

	public BigDecimal getTgt50() throws CFException{      
   		return work.getTgt50();
	}

    public char[] getTgt50String() throws CFException {
          return  work.getTgt50().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt50 with the passed number
	 *	@param number
	 */
	public void setTgt50(BigDecimal number)  throws CFException{
		work.setTgt50(number);
   }

	public BigDecimal getTgt51() throws CFException{      
   		return work.getTgt51();
	}

    public char[] getTgt51String() throws CFException {
          return  work.getTgt51().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt51 with the passed number
	 *	@param number
	 */
	public void setTgt51(BigDecimal number)  throws CFException{
		work.setTgt51(number);
   }

	public BigDecimal getTgt52() throws CFException{      
   		return work.getTgt52();
	}

    public char[] getTgt52String() throws CFException {
          return  work.getTgt52().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt52 with the passed number
	 *	@param number
	 */
	public void setTgt52(BigDecimal number)  throws CFException{
		work.setTgt52(number);
   }

	public BigDecimal getTgt49() throws CFException{      
   		return work.getTgt49();
	}

    public char[] getTgt49String() throws CFException {
          return  work.getTgt49().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt49 with the passed number
	 *	@param number
	 */
	public void setTgt49(BigDecimal number)  throws CFException{
		work.setTgt49(number);
   }

	public BigDecimal getSrc50() throws CFException{      
   		return work.getSrc50();
	}

    public char[] getSrc50String() throws CFException {
          return  work.getSrc50().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src50 with the passed number
	 *	@param number
	 */
	public void setSrc50(BigDecimal number)  throws CFException{
		work.setSrc50(number);
   }

	/**
	 *	Returns the value of src52
	 *	@return src52
	 */
	public BigDecimal getSrc52() throws CFException {
   		return work.getSrc52();
	}

    /**
	 *	Returns the String value of src52
	 *	@return src52
	 */
	public char[]  getSrc52ActualString()  throws CFException{
	    return work.getSrc52ActualString();
	}

	 /**
     *	Returns String value of src52
     *	@return src52
     */
    public char[]  getSrc52String() throws CFException {
         return work.getSrc52String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src52IsNumeric() {
        return work.src52IsNumeric();
    }
	/**
	 * 	Update Src52 with the passed number
	 *	@param number
	 */
	public void setSrc52(BigDecimal number)  throws CFException{
		work.setSrc52(number);
   }

	/**
	 * 	Update Src52 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc52(char[] value)  throws CFException{
		work.setSrc52(value);
	}   

	/**
	 *	Returns the value of src51
	 *	@return src51
	 */
	public BigDecimal getSrc51() throws CFException {
   		return work.getSrc51();
	}

    /**
	 *	Returns the String value of src51
	 *	@return src51
	 */
	public char[]  getSrc51ActualString()  throws CFException{
	    return work.getSrc51ActualString();
	}

	 /**
     *	Returns String value of src51
     *	@return src51
     */
    public char[]  getSrc51String() throws CFException {
         return work.getSrc51String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src51IsNumeric() {
        return work.src51IsNumeric();
    }
	/**
	 * 	Update Src51 with the passed number
	 *	@param number
	 */
	public void setSrc51(BigDecimal number)  throws CFException{
		work.setSrc51(number);
   }

	/**
	 * 	Update Src51 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc51(char[] value)  throws CFException{
		work.setSrc51(value);
	}   

	/**
	 *	Returns the value of src48
	 *	@return src48
	 */
	public long getSrc48() throws CFException {        
   		return work.getSrc48();
	}
	
	/**
	 * 	Update Src48 with the passed value
	 *	@param number
	 */
	public void setSrc48(long number)  throws CFException{
		work.setSrc48(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process11Split65OutCtx clone() {
        Process11Split65OutCtx cloneObj = new Process11Split65OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process11Split65OutCtx getProcess11Split65OutCtx() {
            return new Process11Split65OutCtx();
    }
     public class Process12Split67InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src52
	 *	@return src52
	 */
	public BigDecimal getSrc52() throws CFException {
   		return work.getSrc52();
	}

    /**
	 *	Returns the String value of src52
	 *	@return src52
	 */
	public char[]  getSrc52ActualString()  throws CFException{
	    return work.getSrc52ActualString();
	}

	 /**
     *	Returns String value of src52
     *	@return src52
     */
    public char[]  getSrc52String() throws CFException {
         return work.getSrc52String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src52IsNumeric() {
        return work.src52IsNumeric();
    }
	/**
	 * 	Update Src52 with the passed number
	 *	@param number
	 */
	public void setSrc52(BigDecimal number)  throws CFException{
		work.setSrc52(number);
   }

	/**
	 * 	Update Src52 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc52(char[] value)  throws CFException{
		work.setSrc52(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process12Split67OutCtx getProcess12Split67OutCtx() {
            return new Process12Split67OutCtx();
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

    public Process12Split67InCtx clone() {
        Process12Split67InCtx cloneObj = new Process12Split67InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process12Split67InCtx getProcess12Split67InCtx() {
            return new Process12Split67InCtx();
    }
     public class Process12Split67OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src54
	 *	@return src54
	 */
	public BigDecimal getSrc54() throws CFException {
   		return work.getSrc54();
	}


	 /**
     *	Returns String value of src54
     *	@return src54
     */
    public char[]  getSrc54String() throws CFException {
         return work.getSrc54String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src54IsNumeric() {
        return work.src54IsNumeric();
    }
	/**
	 * 	Update Src54 with the passed number
	 *	@param number
	 */
	public void setSrc54(BigDecimal number)  throws CFException{
		work.setSrc54(number);
   }

	/**
	 * 	Update Src54 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc54(char[] value)  throws CFException{
		work.setSrc54(value);
	}   

	public BigDecimal getTgt54() throws CFException{      
   		return work.getTgt54();
	}

    public char[] getTgt54String() throws CFException {
          return  work.getTgt54().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt54 with the passed number
	 *	@param number
	 */
	public void setTgt54(BigDecimal number)  throws CFException{
		work.setTgt54(number);
   }

	public BigDecimal getTgt52() throws CFException{      
   		return work.getTgt52();
	}

    public char[] getTgt52String() throws CFException {
          return  work.getTgt52().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt52 with the passed number
	 *	@param number
	 */
	public void setTgt52(BigDecimal number)  throws CFException{
		work.setTgt52(number);
   }

	/**
	 *	Returns the value of src56
	 *	@return src56
	 */
	public BigDecimal getSrc56() throws CFException {
   		return work.getSrc56();
	}


	 /**
     *	Returns String value of src56
     *	@return src56
     */
    public char[]  getSrc56String() throws CFException {
         return work.getSrc56String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src56IsNumeric() {
        return work.src56IsNumeric();
    }
	/**
	 * 	Update Src56 with the passed number
	 *	@param number
	 */
	public void setSrc56(BigDecimal number)  throws CFException{
		work.setSrc56(number);
   }

	/**
	 * 	Update Src56 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc56(char[] value)  throws CFException{
		work.setSrc56(value);
	}   

	public BigDecimal getTgt56() throws CFException{      
   		return work.getTgt56();
	}

    public char[] getTgt56String() throws CFException {
          return  work.getTgt56().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt56 with the passed number
	 *	@param number
	 */
	public void setTgt56(BigDecimal number)  throws CFException{
		work.setTgt56(number);
   }

	/**
	 *	Returns the value of src52
	 *	@return src52
	 */
	public BigDecimal getSrc52() throws CFException {
   		return work.getSrc52();
	}

    /**
	 *	Returns the String value of src52
	 *	@return src52
	 */
	public char[]  getSrc52ActualString()  throws CFException{
	    return work.getSrc52ActualString();
	}

	 /**
     *	Returns String value of src52
     *	@return src52
     */
    public char[]  getSrc52String() throws CFException {
         return work.getSrc52String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src52IsNumeric() {
        return work.src52IsNumeric();
    }
	/**
	 * 	Update Src52 with the passed number
	 *	@param number
	 */
	public void setSrc52(BigDecimal number)  throws CFException{
		work.setSrc52(number);
   }

	/**
	 * 	Update Src52 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc52(char[] value)  throws CFException{
		work.setSrc52(value);
	}   

	/**
	 *	Returns the value of src53
	 *	@return src53
	 */
	public BigDecimal getSrc53() throws CFException {
   		return work.getSrc53();
	}


	 /**
     *	Returns String value of src53
     *	@return src53
     */
    public char[]  getSrc53String() throws CFException {
         return work.getSrc53String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src53IsNumeric() {
        return work.src53IsNumeric();
    }
	/**
	 * 	Update Src53 with the passed number
	 *	@param number
	 */
	public void setSrc53(BigDecimal number)  throws CFException{
		work.setSrc53(number);
   }

	/**
	 * 	Update Src53 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc53(char[] value)  throws CFException{
		work.setSrc53(value);
	}   

	/**
	 *	Returns the value of src55
	 *	@return src55
	 */
	public BigDecimal getSrc55() throws CFException {
   		return work.getSrc55();
	}


	 /**
     *	Returns String value of src55
     *	@return src55
     */
    public char[]  getSrc55String() throws CFException {
         return work.getSrc55String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src55IsNumeric() {
        return work.src55IsNumeric();
    }
	/**
	 * 	Update Src55 with the passed number
	 *	@param number
	 */
	public void setSrc55(BigDecimal number)  throws CFException{
		work.setSrc55(number);
   }

	/**
	 * 	Update Src55 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc55(char[] value)  throws CFException{
		work.setSrc55(value);
	}   

	public BigDecimal getTgt55() throws CFException{      
   		return work.getTgt55();
	}

    public char[] getTgt55String() throws CFException {
          return  work.getTgt55().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt55 with the passed number
	 *	@param number
	 */
	public void setTgt55(BigDecimal number)  throws CFException{
		work.setTgt55(number);
   }

	public BigDecimal getTgt53() throws CFException{      
   		return work.getTgt53();
	}

    public char[] getTgt53String() throws CFException {
          return  work.getTgt53().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt53 with the passed number
	 *	@param number
	 */
	public void setTgt53(BigDecimal number)  throws CFException{
		work.setTgt53(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process12Split67OutCtx clone() {
        Process12Split67OutCtx cloneObj = new Process12Split67OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process12Split67OutCtx getProcess12Split67OutCtx() {
            return new Process12Split67OutCtx();
    }
     public class Process13Split69InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src56
	 *	@return src56
	 */
	public BigDecimal getSrc56() throws CFException {
   		return work.getSrc56();
	}


	 /**
     *	Returns String value of src56
     *	@return src56
     */
    public char[]  getSrc56String() throws CFException {
         return work.getSrc56String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src56IsNumeric() {
        return work.src56IsNumeric();
    }
	/**
	 * 	Update Src56 with the passed number
	 *	@param number
	 */
	public void setSrc56(BigDecimal number)  throws CFException{
		work.setSrc56(number);
   }

	/**
	 * 	Update Src56 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc56(char[] value)  throws CFException{
		work.setSrc56(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process13Split69OutCtx getProcess13Split69OutCtx() {
            return new Process13Split69OutCtx();
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

    public Process13Split69InCtx clone() {
        Process13Split69InCtx cloneObj = new Process13Split69InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process13Split69InCtx getProcess13Split69InCtx() {
            return new Process13Split69InCtx();
    }
     public class Process13Split69OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	public BigDecimal getSrc57() throws CFException{      
   		return work.getSrc57();
	}

    public char[] getSrc57String() throws CFException {
          return  work.getSrc57().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src57 with the passed number
	 *	@param number
	 */
	public void setSrc57(BigDecimal number)  throws CFException{
		work.setSrc57(number);
   }

	/**
	 *	Returns the value of tgt58
	 *	@return tgt58
	 */
	public BigDecimal getTgt58() throws CFException {
   		return work.getTgt58();
	}


	 /**
     *	Returns String value of tgt58
     *	@return tgt58
     */
    public char[]  getTgt58String() throws CFException {
         return work.getTgt58String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt58IsNumeric() {
        return work.tgt58IsNumeric();
    }
	/**
	 * 	Update Tgt58 with the passed number
	 *	@param number
	 */
	public void setTgt58(BigDecimal number)  throws CFException{
		work.setTgt58(number);
   }

	/**
	 * 	Update Tgt58 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt58(char[] value)  throws CFException{
		work.setTgt58(value);
	}   

	public BigDecimal getSrc59() throws CFException{      
   		return work.getSrc59();
	}

    public char[] getSrc59String() throws CFException {
          return  work.getSrc59().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src59 with the passed number
	 *	@param number
	 */
	public void setSrc59(BigDecimal number)  throws CFException{
		work.setSrc59(number);
   }

	/**
	 *	Returns the value of tgt59
	 *	@return tgt59
	 */
	public BigDecimal getTgt59() throws CFException {
   		return work.getTgt59();
	}

    /**
	 *	Returns the String value of tgt59
	 *	@return tgt59
	 */
	public char[]  getTgt59ActualString()  throws CFException{
	    return work.getTgt59ActualString();
	}

	 /**
     *	Returns String value of tgt59
     *	@return tgt59
     */
    public char[]  getTgt59String() throws CFException {
         return work.getTgt59String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt59IsNumeric() {
        return work.tgt59IsNumeric();
    }
	/**
	 * 	Update Tgt59 with the passed number
	 *	@param number
	 */
	public void setTgt59(BigDecimal number)  throws CFException{
		work.setTgt59(number);
   }

	/**
	 * 	Update Tgt59 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt59(char[] value)  throws CFException{
		work.setTgt59(value);
	}   

	/**
	 *	Returns the value of tgt57
	 *	@return tgt57
	 */
	public BigDecimal getTgt57() throws CFException {
   		return work.getTgt57();
	}


	 /**
     *	Returns String value of tgt57
     *	@return tgt57
     */
    public char[]  getTgt57String() throws CFException {
         return work.getTgt57String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt57IsNumeric() {
        return work.tgt57IsNumeric();
    }
	/**
	 * 	Update Tgt57 with the passed number
	 *	@param number
	 */
	public void setTgt57(BigDecimal number)  throws CFException{
		work.setTgt57(number);
   }

	/**
	 * 	Update Tgt57 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt57(char[] value)  throws CFException{
		work.setTgt57(value);
	}   

	public BigDecimal getSrc58() throws CFException{      
   		return work.getSrc58();
	}

    public char[] getSrc58String() throws CFException {
          return  work.getSrc58().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src58 with the passed number
	 *	@param number
	 */
	public void setSrc58(BigDecimal number)  throws CFException{
		work.setSrc58(number);
   }

	public BigDecimal getTgt56() throws CFException{      
   		return work.getTgt56();
	}

    public char[] getTgt56String() throws CFException {
          return  work.getTgt56().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt56 with the passed number
	 *	@param number
	 */
	public void setTgt56(BigDecimal number)  throws CFException{
		work.setTgt56(number);
   }

	/**
	 *	Returns the value of src56
	 *	@return src56
	 */
	public BigDecimal getSrc56() throws CFException {
   		return work.getSrc56();
	}


	 /**
     *	Returns String value of src56
     *	@return src56
     */
    public char[]  getSrc56String() throws CFException {
         return work.getSrc56String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src56IsNumeric() {
        return work.src56IsNumeric();
    }
	/**
	 * 	Update Src56 with the passed number
	 *	@param number
	 */
	public void setSrc56(BigDecimal number)  throws CFException{
		work.setSrc56(number);
   }

	/**
	 * 	Update Src56 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc56(char[] value)  throws CFException{
		work.setSrc56(value);
	}   

	/**
	 *	Returns the value of tgt60
	 *	@return tgt60
	 */
	public BigDecimal getTgt60() throws CFException {
   		return work.getTgt60();
	}

    /**
	 *	Returns the String value of tgt60
	 *	@return tgt60
	 */
	public char[]  getTgt60ActualString()  throws CFException{
	    return work.getTgt60ActualString();
	}

	 /**
     *	Returns String value of tgt60
     *	@return tgt60
     */
    public char[]  getTgt60String() throws CFException {
         return work.getTgt60String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt60IsNumeric() {
        return work.tgt60IsNumeric();
    }
	/**
	 * 	Update Tgt60 with the passed number
	 *	@param number
	 */
	public void setTgt60(BigDecimal number)  throws CFException{
		work.setTgt60(number);
   }

	/**
	 * 	Update Tgt60 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt60(char[] value)  throws CFException{
		work.setTgt60(value);
	}   

	public BigDecimal getSrc60() throws CFException{      
   		return work.getSrc60();
	}

    public char[] getSrc60String() throws CFException {
          return  work.getSrc60().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src60 with the passed number
	 *	@param number
	 */
	public void setSrc60(BigDecimal number)  throws CFException{
		work.setSrc60(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process13Split69OutCtx clone() {
        Process13Split69OutCtx cloneObj = new Process13Split69OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process13Split69OutCtx getProcess13Split69OutCtx() {
            return new Process13Split69OutCtx();
    }
     public class Process14Split71OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	public BigDecimal getSrc62() throws CFException{      
   		return work.getSrc62();
	}

    public char[] getSrc62String() throws CFException {
          return  work.getSrc62().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src62 with the passed number
	 *	@param number
	 */
	public void setSrc62(BigDecimal number)  throws CFException{
		work.setSrc62(number);
   }

	public BigDecimal getSrc61() throws CFException{      
   		return work.getSrc61();
	}

    public char[] getSrc61String() throws CFException {
          return  work.getSrc61().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src61 with the passed number
	 *	@param number
	 */
	public void setSrc61(BigDecimal number)  throws CFException{
		work.setSrc61(number);
   }

	/**
	 *	Returns the value of tgt63
	 *	@return tgt63
	 */
	public BigDecimal getTgt63() throws CFException {
   		return work.getTgt63();
	}


	 /**
     *	Returns String value of tgt63
     *	@return tgt63
     */
    public char[]  getTgt63String() throws CFException {
         return work.getTgt63String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt63IsNumeric() {
        return work.tgt63IsNumeric();
    }
	/**
	 * 	Update Tgt63 with the passed number
	 *	@param number
	 */
	public void setTgt63(BigDecimal number)  throws CFException{
		work.setTgt63(number);
   }

	/**
	 * 	Update Tgt63 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt63(char[] value)  throws CFException{
		work.setTgt63(value);
	}   

	/**
	 *	Returns the value of src64
	 *	@return src64
	 */
	public BigDecimal getSrc64() throws CFException {
   		return work.getSrc64();
	}

    /**
	 *	Returns the String value of src64
	 *	@return src64
	 */
	public char[]  getSrc64ActualString()  throws CFException{
	    return work.getSrc64ActualString();
	}

	 /**
     *	Returns String value of src64
     *	@return src64
     */
    public char[]  getSrc64String() throws CFException {
         return work.getSrc64String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src64IsNumeric() {
        return work.src64IsNumeric();
    }
	/**
	 * 	Update Src64 with the passed number
	 *	@param number
	 */
	public void setSrc64(BigDecimal number)  throws CFException{
		work.setSrc64(number);
   }

	/**
	 * 	Update Src64 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc64(char[] value)  throws CFException{
		work.setSrc64(value);
	}   

	/**
	 *	Returns the value of src63
	 *	@return src63
	 */
	public BigDecimal getSrc63() throws CFException {
   		return work.getSrc63();
	}

    /**
	 *	Returns the String value of src63
	 *	@return src63
	 */
	public char[]  getSrc63ActualString()  throws CFException{
	    return work.getSrc63ActualString();
	}

	 /**
     *	Returns String value of src63
     *	@return src63
     */
    public char[]  getSrc63String() throws CFException {
         return work.getSrc63String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src63IsNumeric() {
        return work.src63IsNumeric();
    }
	/**
	 * 	Update Src63 with the passed number
	 *	@param number
	 */
	public void setSrc63(BigDecimal number)  throws CFException{
		work.setSrc63(number);
   }

	/**
	 * 	Update Src63 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc63(char[] value)  throws CFException{
		work.setSrc63(value);
	}   

	/**
	 *	Returns the value of tgt61
	 *	@return tgt61
	 */
	public BigDecimal getTgt61() throws CFException {
   		return work.getTgt61();
	}


	 /**
     *	Returns String value of tgt61
     *	@return tgt61
     */
    public char[]  getTgt61String() throws CFException {
         return work.getTgt61String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt61IsNumeric() {
        return work.tgt61IsNumeric();
    }
	/**
	 * 	Update Tgt61 with the passed number
	 *	@param number
	 */
	public void setTgt61(BigDecimal number)  throws CFException{
		work.setTgt61(number);
   }

	/**
	 * 	Update Tgt61 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt61(char[] value)  throws CFException{
		work.setTgt61(value);
	}   

	/**
	 *	Returns the value of src65
	 *	@return src65
	 */
	public BigDecimal getSrc65() throws CFException {
   		return work.getSrc65();
	}


	 /**
     *	Returns String value of src65
     *	@return src65
     */
    public char[]  getSrc65String() throws CFException {
         return work.getSrc65String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src65IsNumeric() {
        return work.src65IsNumeric();
    }
	/**
	 * 	Update Src65 with the passed number
	 *	@param number
	 */
	public void setSrc65(BigDecimal number)  throws CFException{
		work.setSrc65(number);
   }

	/**
	 * 	Update Src65 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc65(char[] value)  throws CFException{
		work.setSrc65(value);
	}   

	/**
	 *	Returns the value of tgt62
	 *	@return tgt62
	 */
	public BigDecimal getTgt62() throws CFException {
   		return work.getTgt62();
	}


	 /**
     *	Returns String value of tgt62
     *	@return tgt62
     */
    public char[]  getTgt62String() throws CFException {
         return work.getTgt62String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt62IsNumeric() {
        return work.tgt62IsNumeric();
    }
	/**
	 * 	Update Tgt62 with the passed number
	 *	@param number
	 */
	public void setTgt62(BigDecimal number)  throws CFException{
		work.setTgt62(number);
   }

	/**
	 * 	Update Tgt62 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt62(char[] value)  throws CFException{
		work.setTgt62(value);
	}   

	/**
	 *	Returns the value of tgt64
	 *	@return tgt64
	 */
	public BigDecimal getTgt64() throws CFException {
   		return work.getTgt64();
	}


	 /**
     *	Returns String value of tgt64
     *	@return tgt64
     */
    public char[]  getTgt64String() throws CFException {
         return work.getTgt64String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt64IsNumeric() {
        return work.tgt64IsNumeric();
    }
	/**
	 * 	Update Tgt64 with the passed number
	 *	@param number
	 */
	public void setTgt64(BigDecimal number)  throws CFException{
		work.setTgt64(number);
   }

	/**
	 * 	Update Tgt64 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt64(char[] value)  throws CFException{
		work.setTgt64(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process14Split71OutCtx clone() {
        Process14Split71OutCtx cloneObj = new Process14Split71OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process14Split71OutCtx getProcess14Split71OutCtx() {
            return new Process14Split71OutCtx();
    }
     public class Process15Split73InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src69
	 *	@return src69
	 */
	public int getSrc69() throws CFException {        
   		return work.getSrc69();
	}
	
	/**
	 * 	Update Src69 with the passed value
	 *	@param number
	 */
	public void setSrc69(int number)  throws CFException{
		work.setSrc69(number);
	}


	public void setSrc69(long number)  throws CFException{
		work.setSrc69((int)number);
	}


	/**
	 *	Returns the value of src65
	 *	@return src65
	 */
	public BigDecimal getSrc65() throws CFException {
   		return work.getSrc65();
	}


	 /**
     *	Returns String value of src65
     *	@return src65
     */
    public char[]  getSrc65String() throws CFException {
         return work.getSrc65String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src65IsNumeric() {
        return work.src65IsNumeric();
    }
	/**
	 * 	Update Src65 with the passed number
	 *	@param number
	 */
	public void setSrc65(BigDecimal number)  throws CFException{
		work.setSrc65(number);
   }

	/**
	 * 	Update Src65 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc65(char[] value)  throws CFException{
		work.setSrc65(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process15Split73OutCtx getProcess15Split73OutCtx() {
            return new Process15Split73OutCtx();
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

    public Process15Split73InCtx clone() {
        Process15Split73InCtx cloneObj = new Process15Split73InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process15Split73InCtx getProcess15Split73InCtx() {
            return new Process15Split73InCtx();
    }
     public class Process15Split73OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src69
	 *	@return src69
	 */
	public int getSrc69() throws CFException {        
   		return work.getSrc69();
	}
	
	/**
	 * 	Update Src69 with the passed value
	 *	@param number
	 */
	public void setSrc69(int number)  throws CFException{
		work.setSrc69(number);
	}


	public void setSrc69(long number)  throws CFException{
		work.setSrc69((int)number);
	}


	/**
	 *	Returns the value of tgt66
	 *	@return tgt66
	 */
	public BigDecimal getTgt66() throws CFException {
   		return work.getTgt66();
	}

    /**
	 *	Returns the String value of tgt66
	 *	@return tgt66
	 */
	public char[]  getTgt66ActualString()  throws CFException{
	    return work.getTgt66ActualString();
	}

	 /**
     *	Returns String value of tgt66
     *	@return tgt66
     */
    public char[]  getTgt66String() throws CFException {
         return work.getTgt66String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt66IsNumeric() {
        return work.tgt66IsNumeric();
    }
	/**
	 * 	Update Tgt66 with the passed number
	 *	@param number
	 */
	public void setTgt66(BigDecimal number)  throws CFException{
		work.setTgt66(number);
   }

	/**
	 * 	Update Tgt66 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt66(char[] value)  throws CFException{
		work.setTgt66(value);
	}   

	/**
	 *	Returns the value of tgt67
	 *	@return tgt67
	 */
	public BigDecimal getTgt67() throws CFException {
   		return work.getTgt67();
	}


	 /**
     *	Returns String value of tgt67
     *	@return tgt67
     */
    public char[]  getTgt67String() throws CFException {
         return work.getTgt67String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt67IsNumeric() {
        return work.tgt67IsNumeric();
    }
	/**
	 * 	Update Tgt67 with the passed number
	 *	@param number
	 */
	public void setTgt67(BigDecimal number)  throws CFException{
		work.setTgt67(number);
   }

	/**
	 * 	Update Tgt67 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt67(char[] value)  throws CFException{
		work.setTgt67(value);
	}   

	/**
	 *	Returns the value of tgt69
	 *	@return tgt69
	 */
	public long getTgt69() throws CFException {
   		return work.getTgt69();
	}


	/**
	 *	Returns String value of tgt69
	 *	@return tgt69
	 */
	public char[]  getTgt69String() throws CFException {
	     return String.valueOf(work.getTgt69String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt69IsNumeric()  throws CFException{
	    return work.tgt69IsNumeric();
	}

	/**
	 * 	Update Tgt69 with the passed value
	 *	@param number
	 */
	public void setTgt69(long number)  throws CFException{
		work.setTgt69(number);
	}
	

	
	/**
	 * 	Update Tgt69 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt69(char[] value)  throws CFException {
		work.setTgt69(value);
	}
	
	/**
	 * 	Update Tgt69 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt69String(char[] value)  throws CFException{
		work.setTgt69(value);
	}	

	/**
	 *	Returns the value of src68
	 *	@return src68
	 */
	public BigDecimal getSrc68() throws CFException {
   		return work.getSrc68();
	}


	 /**
     *	Returns String value of src68
     *	@return src68
     */
    public char[]  getSrc68String() throws CFException {
         return work.getSrc68String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src68IsNumeric() {
        return work.src68IsNumeric();
    }
	/**
	 * 	Update Src68 with the passed number
	 *	@param number
	 */
	public void setSrc68(BigDecimal number)  throws CFException{
		work.setSrc68(number);
   }

	/**
	 * 	Update Src68 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc68(char[] value)  throws CFException{
		work.setSrc68(value);
	}   

	/**
	 *	Returns the value of src66
	 *	@return src66
	 */
	public BigDecimal getSrc66() throws CFException {
   		return work.getSrc66();
	}


	 /**
     *	Returns String value of src66
     *	@return src66
     */
    public char[]  getSrc66String() throws CFException {
         return work.getSrc66String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src66IsNumeric() {
        return work.src66IsNumeric();
    }
	/**
	 * 	Update Src66 with the passed number
	 *	@param number
	 */
	public void setSrc66(BigDecimal number)  throws CFException{
		work.setSrc66(number);
   }

	/**
	 * 	Update Src66 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc66(char[] value)  throws CFException{
		work.setSrc66(value);
	}   

	/**
	 *	Returns the value of tgt65
	 *	@return tgt65
	 */
	public BigDecimal getTgt65() throws CFException {
   		return work.getTgt65();
	}

    /**
	 *	Returns the String value of tgt65
	 *	@return tgt65
	 */
	public char[]  getTgt65ActualString()  throws CFException{
	    return work.getTgt65ActualString();
	}

	 /**
     *	Returns String value of tgt65
     *	@return tgt65
     */
    public char[]  getTgt65String() throws CFException {
         return work.getTgt65String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt65IsNumeric() {
        return work.tgt65IsNumeric();
    }
	/**
	 * 	Update Tgt65 with the passed number
	 *	@param number
	 */
	public void setTgt65(BigDecimal number)  throws CFException{
		work.setTgt65(number);
   }

	/**
	 * 	Update Tgt65 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt65(char[] value)  throws CFException{
		work.setTgt65(value);
	}   

	/**
	 *	Returns the value of src65
	 *	@return src65
	 */
	public BigDecimal getSrc65() throws CFException {
   		return work.getSrc65();
	}


	 /**
     *	Returns String value of src65
     *	@return src65
     */
    public char[]  getSrc65String() throws CFException {
         return work.getSrc65String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src65IsNumeric() {
        return work.src65IsNumeric();
    }
	/**
	 * 	Update Src65 with the passed number
	 *	@param number
	 */
	public void setSrc65(BigDecimal number)  throws CFException{
		work.setSrc65(number);
   }

	/**
	 * 	Update Src65 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc65(char[] value)  throws CFException{
		work.setSrc65(value);
	}   

	/**
	 *	Returns the value of src67
	 *	@return src67
	 */
	public BigDecimal getSrc67() throws CFException {
   		return work.getSrc67();
	}


	 /**
     *	Returns String value of src67
     *	@return src67
     */
    public char[]  getSrc67String() throws CFException {
         return work.getSrc67String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src67IsNumeric() {
        return work.src67IsNumeric();
    }
	/**
	 * 	Update Src67 with the passed number
	 *	@param number
	 */
	public void setSrc67(BigDecimal number)  throws CFException{
		work.setSrc67(number);
   }

	/**
	 * 	Update Src67 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc67(char[] value)  throws CFException{
		work.setSrc67(value);
	}   

	/**
	 *	Returns the value of tgt68
	 *	@return tgt68
	 */
	public BigDecimal getTgt68() throws CFException {
   		return work.getTgt68();
	}


	 /**
     *	Returns String value of tgt68
     *	@return tgt68
     */
    public char[]  getTgt68String() throws CFException {
         return work.getTgt68String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt68IsNumeric() {
        return work.tgt68IsNumeric();
    }
	/**
	 * 	Update Tgt68 with the passed number
	 *	@param number
	 */
	public void setTgt68(BigDecimal number)  throws CFException{
		work.setTgt68(number);
   }

	/**
	 * 	Update Tgt68 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt68(char[] value)  throws CFException{
		work.setTgt68(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process15Split73OutCtx clone() {
        Process15Split73OutCtx cloneObj = new Process15Split73OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process15Split73OutCtx getProcess15Split73OutCtx() {
            return new Process15Split73OutCtx();
    }
     public class Process16Split75InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src69
	 *	@return src69
	 */
	public int getSrc69() throws CFException {        
   		return work.getSrc69();
	}
	
	/**
	 * 	Update Src69 with the passed value
	 *	@param number
	 */
	public void setSrc69(int number)  throws CFException{
		work.setSrc69(number);
	}


	public void setSrc69(long number)  throws CFException{
		work.setSrc69((int)number);
	}


	/**
	 *	Returns the value of src71
	 *	@return src71
	 */
	public long getSrc71() throws CFException {        
   		return work.getSrc71();
	}
	
	/**
	 * 	Update Src71 with the passed value
	 *	@param number
	 */
	public void setSrc71(long number)  throws CFException{
		work.setSrc71(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process16Split75OutCtx getProcess16Split75OutCtx() {
            return new Process16Split75OutCtx();
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

    public Process16Split75InCtx clone() {
        Process16Split75InCtx cloneObj = new Process16Split75InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process16Split75InCtx getProcess16Split75InCtx() {
            return new Process16Split75InCtx();
    }
     public class Process16Split75OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt71
	 *	@return tgt71
	 */
	public long getTgt71() throws CFException {
   		return work.getTgt71();
	}


	/**
	 *	Returns String value of tgt71
	 *	@return tgt71
	 */
	public char[]  getTgt71String() throws CFException {
	     return String.valueOf(work.getTgt71String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt71IsNumeric()  throws CFException{
	    return work.tgt71IsNumeric();
	}

	/**
	 * 	Update Tgt71 with the passed value
	 *	@param number
	 */
	public void setTgt71(long number)  throws CFException{
		work.setTgt71(number);
	}
	

	
	/**
	 * 	Update Tgt71 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt71(char[] value)  throws CFException {
		work.setTgt71(value);
	}
	
	/**
	 * 	Update Tgt71 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt71String(char[] value)  throws CFException{
		work.setTgt71(value);
	}	

	/**
	 *	Returns the value of src69
	 *	@return src69
	 */
	public int getSrc69() throws CFException {        
   		return work.getSrc69();
	}
	
	/**
	 * 	Update Src69 with the passed value
	 *	@param number
	 */
	public void setSrc69(int number)  throws CFException{
		work.setSrc69(number);
	}


	public void setSrc69(long number)  throws CFException{
		work.setSrc69((int)number);
	}


	/**
	 *	Returns the value of src70
	 *	@return src70
	 */
	public long getSrc70() throws CFException {        
   		return work.getSrc70();
	}
	
	/**
	 * 	Update Src70 with the passed value
	 *	@param number
	 */
	public void setSrc70(long number)  throws CFException{
		work.setSrc70(number);
	}



	/**
	 *	Returns the value of src71
	 *	@return src71
	 */
	public long getSrc71() throws CFException {        
   		return work.getSrc71();
	}
	
	/**
	 * 	Update Src71 with the passed value
	 *	@param number
	 */
	public void setSrc71(long number)  throws CFException{
		work.setSrc71(number);
	}



	/**
	 *	Returns the value of tgt69
	 *	@return tgt69
	 */
	public long getTgt69() throws CFException {
   		return work.getTgt69();
	}


	/**
	 *	Returns String value of tgt69
	 *	@return tgt69
	 */
	public char[]  getTgt69String() throws CFException {
	     return String.valueOf(work.getTgt69String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt69IsNumeric()  throws CFException{
	    return work.tgt69IsNumeric();
	}

	/**
	 * 	Update Tgt69 with the passed value
	 *	@param number
	 */
	public void setTgt69(long number)  throws CFException{
		work.setTgt69(number);
	}
	

	
	/**
	 * 	Update Tgt69 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt69(char[] value)  throws CFException {
		work.setTgt69(value);
	}
	
	/**
	 * 	Update Tgt69 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt69String(char[] value)  throws CFException{
		work.setTgt69(value);
	}	

	/**
	 *	Returns the value of tgt70
	 *	@return tgt70
	 */
	public long getTgt70() throws CFException {
   		return work.getTgt70();
	}


	/**
	 *	Returns String value of tgt70
	 *	@return tgt70
	 */
	public char[]  getTgt70String() throws CFException {
	     return String.valueOf(work.getTgt70String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt70IsNumeric()  throws CFException{
	    return work.tgt70IsNumeric();
	}

	/**
	 * 	Update Tgt70 with the passed value
	 *	@param number
	 */
	public void setTgt70(long number)  throws CFException{
		work.setTgt70(number);
	}
	

	
	/**
	 * 	Update Tgt70 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt70(char[] value)  throws CFException {
		work.setTgt70(value);
	}
	
	/**
	 * 	Update Tgt70 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt70String(char[] value)  throws CFException{
		work.setTgt70(value);
	}	

	/**
	 *	Returns the value of tgt73
	 *	@return tgt73
	 */
	public long getTgt73() throws CFException {
   		return work.getTgt73();
	}


	/**
	 *	Returns String value of tgt73
	 *	@return tgt73
	 */
	public char[]  getTgt73String() throws CFException {
	     return String.valueOf(work.getTgt73String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt73IsNumeric()  throws CFException{
	    return work.tgt73IsNumeric();
	}

	/**
	 * 	Update Tgt73 with the passed value
	 *	@param number
	 */
	public void setTgt73(long number)  throws CFException{
		work.setTgt73(number);
	}
	

	
	/**
	 * 	Update Tgt73 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt73(char[] value)  throws CFException {
		work.setTgt73(value);
	}
	
	/**
	 * 	Update Tgt73 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt73String(char[] value)  throws CFException{
		work.setTgt73(value);
	}	

	/**
	 *	Returns the value of tgt72
	 *	@return tgt72
	 */
	public long getTgt72() throws CFException {
   		return work.getTgt72();
	}


	/**
	 *	Returns String value of tgt72
	 *	@return tgt72
	 */
	public char[]  getTgt72String() throws CFException {
	     return String.valueOf(work.getTgt72String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt72IsNumeric()  throws CFException{
	    return work.tgt72IsNumeric();
	}

	/**
	 * 	Update Tgt72 with the passed value
	 *	@param number
	 */
	public void setTgt72(long number)  throws CFException{
		work.setTgt72(number);
	}
	

	
	/**
	 * 	Update Tgt72 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt72(char[] value)  throws CFException {
		work.setTgt72(value);
	}
	
	/**
	 * 	Update Tgt72 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt72String(char[] value)  throws CFException{
		work.setTgt72(value);
	}	

	/**
	 *	Returns the value of src73
	 *	@return src73
	 */
	public short getSrc73() throws CFException {        
   		return work.getSrc73();
	}
	
	/**
	 * 	Update Src73 with the passed value
	 *	@param number
	 */
	public void setSrc73(short number)  throws CFException{
		work.setSrc73(number);
	}

	public void setSrc73(int number)  throws CFException{
		work.setSrc73((short)number);
	}

	public void setSrc73(long number)  throws CFException{
		work.setSrc73((short)number);
	}



	/**
	 *	Returns the value of src72
	 *	@return src72
	 */
	public long getSrc72() throws CFException {        
   		return work.getSrc72();
	}
	
	/**
	 * 	Update Src72 with the passed value
	 *	@param number
	 */
	public void setSrc72(long number)  throws CFException{
		work.setSrc72(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process16Split75OutCtx clone() {
        Process16Split75OutCtx cloneObj = new Process16Split75OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process16Split75OutCtx getProcess16Split75OutCtx() {
            return new Process16Split75OutCtx();
    }
     public class Process17Split77InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src76
	 *	@return src76
	 */
	public int getSrc76() throws CFException {
   		return work.getSrc76();
	}

    /**
	 *	Returns the String value of src76
	 *	@return src76
	 */
	public char[]  getSrc76ActualString() {
		return work.getSrc76ActualString();
	}

	/**
	 *	Returns String value of src76
	 *	@return src76
	 */
	public char[]  getSrc76String() throws CFException {
	     return String.valueOf(work.getSrc76String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src76IsNumeric()  throws CFException{
	    return work.src76IsNumeric();
	}

	/**
	 * 	Update Src76 with the passed value
	 *	@param number
	 */
	public void setSrc76(int number)  throws CFException{
		work.setSrc76(number);
	}
	

	public void setSrc76(long number)  throws CFException{
	    work.setSrc76(number);
	}
	
	
	/**
	 * 	Update Src76 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc76(char[] value)  throws CFException {
		work.setSrc76(value);
	}
	
	/**
	 * 	Update Src76 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc76String(char[] value)  throws CFException{
		work.setSrc76(value);
	}	

	/**
	 *	Returns the value of src77
	 *	@return src77
	 */
	public long getSrc77() throws CFException {
   		return work.getSrc77();
	}


	/**
	 *	Returns String value of src77
	 *	@return src77
	 */
	public char[]  getSrc77String() throws CFException {
	     return String.valueOf(work.getSrc77String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src77IsNumeric()  throws CFException{
	    return work.src77IsNumeric();
	}

	/**
	 * 	Update Src77 with the passed value
	 *	@param number
	 */
	public void setSrc77(long number)  throws CFException{
		work.setSrc77(number);
	}
	

	
	/**
	 * 	Update Src77 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc77(char[] value)  throws CFException {
		work.setSrc77(value);
	}
	
	/**
	 * 	Update Src77 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc77String(char[] value)  throws CFException{
		work.setSrc77(value);
	}	

	/**
	 *	Returns the value of src73
	 *	@return src73
	 */
	public short getSrc73() throws CFException {        
   		return work.getSrc73();
	}
	
	/**
	 * 	Update Src73 with the passed value
	 *	@param number
	 */
	public void setSrc73(short number)  throws CFException{
		work.setSrc73(number);
	}

	public void setSrc73(int number)  throws CFException{
		work.setSrc73((short)number);
	}

	public void setSrc73(long number)  throws CFException{
		work.setSrc73((short)number);
	}



	/**
	 *	Returns the value of src75
	 *	@return src75
	 */
	public long getSrc75() throws CFException {
   		return work.getSrc75();
	}


	/**
	 *	Returns String value of src75
	 *	@return src75
	 */
	public char[]  getSrc75String() throws CFException {
	     return String.valueOf(work.getSrc75String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src75IsNumeric()  throws CFException{
	    return work.src75IsNumeric();
	}

	/**
	 * 	Update Src75 with the passed value
	 *	@param number
	 */
	public void setSrc75(long number)  throws CFException{
		work.setSrc75(number);
	}
	

	
	/**
	 * 	Update Src75 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc75(char[] value)  throws CFException {
		work.setSrc75(value);
	}
	
	/**
	 * 	Update Src75 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc75String(char[] value)  throws CFException{
		work.setSrc75(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process17Split77OutCtx getProcess17Split77OutCtx() {
            return new Process17Split77OutCtx();
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

    public Process17Split77InCtx clone() {
        Process17Split77InCtx cloneObj = new Process17Split77InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process17Split77InCtx getProcess17Split77InCtx() {
            return new Process17Split77InCtx();
    }
     public class Process17Split77OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src74
	 *	@return src74
	 */
	public int getSrc74() throws CFException {        
   		return work.getSrc74();
	}
	
	/**
	 * 	Update Src74 with the passed value
	 *	@param number
	 */
	public void setSrc74(int number)  throws CFException{
		work.setSrc74(number);
	}


	public void setSrc74(long number)  throws CFException{
		work.setSrc74((int)number);
	}


	/**
	 *	Returns the value of tgt74
	 *	@return tgt74
	 */
	public long getTgt74() throws CFException {
   		return work.getTgt74();
	}


	/**
	 *	Returns String value of tgt74
	 *	@return tgt74
	 */
	public char[]  getTgt74String() throws CFException {
	     return String.valueOf(work.getTgt74String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt74IsNumeric()  throws CFException{
	    return work.tgt74IsNumeric();
	}

	/**
	 * 	Update Tgt74 with the passed value
	 *	@param number
	 */
	public void setTgt74(long number)  throws CFException{
		work.setTgt74(number);
	}
	

	
	/**
	 * 	Update Tgt74 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt74(char[] value)  throws CFException {
		work.setTgt74(value);
	}
	
	/**
	 * 	Update Tgt74 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt74String(char[] value)  throws CFException{
		work.setTgt74(value);
	}	

	/**
	 *	Returns the value of src76
	 *	@return src76
	 */
	public int getSrc76() throws CFException {
   		return work.getSrc76();
	}

    /**
	 *	Returns the String value of src76
	 *	@return src76
	 */
	public char[]  getSrc76ActualString() {
		return work.getSrc76ActualString();
	}

	/**
	 *	Returns String value of src76
	 *	@return src76
	 */
	public char[]  getSrc76String() throws CFException {
	     return String.valueOf(work.getSrc76String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src76IsNumeric()  throws CFException{
	    return work.src76IsNumeric();
	}

	/**
	 * 	Update Src76 with the passed value
	 *	@param number
	 */
	public void setSrc76(int number)  throws CFException{
		work.setSrc76(number);
	}
	

	public void setSrc76(long number)  throws CFException{
	    work.setSrc76(number);
	}
	
	
	/**
	 * 	Update Src76 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc76(char[] value)  throws CFException {
		work.setSrc76(value);
	}
	
	/**
	 * 	Update Src76 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc76String(char[] value)  throws CFException{
		work.setSrc76(value);
	}	

	/**
	 *	Returns the value of tgt77
	 *	@return tgt77
	 */
	public int getTgt77() throws CFException {        
   		return work.getTgt77();
	}
	
	/**
	 * 	Update Tgt77 with the passed value
	 *	@param number
	 */
	public void setTgt77(int number)  throws CFException{
		work.setTgt77(number);
	}


	public void setTgt77(long number)  throws CFException{
		work.setTgt77((int)number);
	}


	/**
	 *	Returns the value of tgt73
	 *	@return tgt73
	 */
	public long getTgt73() throws CFException {
   		return work.getTgt73();
	}


	/**
	 *	Returns String value of tgt73
	 *	@return tgt73
	 */
	public char[]  getTgt73String() throws CFException {
	     return String.valueOf(work.getTgt73String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt73IsNumeric()  throws CFException{
	    return work.tgt73IsNumeric();
	}

	/**
	 * 	Update Tgt73 with the passed value
	 *	@param number
	 */
	public void setTgt73(long number)  throws CFException{
		work.setTgt73(number);
	}
	

	
	/**
	 * 	Update Tgt73 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt73(char[] value)  throws CFException {
		work.setTgt73(value);
	}
	
	/**
	 * 	Update Tgt73 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt73String(char[] value)  throws CFException{
		work.setTgt73(value);
	}	

	/**
	 *	Returns the value of src77
	 *	@return src77
	 */
	public long getSrc77() throws CFException {
   		return work.getSrc77();
	}


	/**
	 *	Returns String value of src77
	 *	@return src77
	 */
	public char[]  getSrc77String() throws CFException {
	     return String.valueOf(work.getSrc77String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src77IsNumeric()  throws CFException{
	    return work.src77IsNumeric();
	}

	/**
	 * 	Update Src77 with the passed value
	 *	@param number
	 */
	public void setSrc77(long number)  throws CFException{
		work.setSrc77(number);
	}
	

	
	/**
	 * 	Update Src77 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc77(char[] value)  throws CFException {
		work.setSrc77(value);
	}
	
	/**
	 * 	Update Src77 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc77String(char[] value)  throws CFException{
		work.setSrc77(value);
	}	

	/**
	 *	Returns the value of src73
	 *	@return src73
	 */
	public short getSrc73() throws CFException {        
   		return work.getSrc73();
	}
	
	/**
	 * 	Update Src73 with the passed value
	 *	@param number
	 */
	public void setSrc73(short number)  throws CFException{
		work.setSrc73(number);
	}

	public void setSrc73(int number)  throws CFException{
		work.setSrc73((short)number);
	}

	public void setSrc73(long number)  throws CFException{
		work.setSrc73((short)number);
	}



	/**
	 *	Returns the value of tgt75
	 *	@return tgt75
	 */
	public long getTgt75() throws CFException {
   		return work.getTgt75();
	}


	/**
	 *	Returns String value of tgt75
	 *	@return tgt75
	 */
	public char[]  getTgt75String() throws CFException {
	     return String.valueOf(work.getTgt75String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt75IsNumeric()  throws CFException{
	    return work.tgt75IsNumeric();
	}

	/**
	 * 	Update Tgt75 with the passed value
	 *	@param number
	 */
	public void setTgt75(long number)  throws CFException{
		work.setTgt75(number);
	}
	

	
	/**
	 * 	Update Tgt75 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt75(char[] value)  throws CFException {
		work.setTgt75(value);
	}
	
	/**
	 * 	Update Tgt75 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt75String(char[] value)  throws CFException{
		work.setTgt75(value);
	}	

	/**
	 *	Returns the value of src75
	 *	@return src75
	 */
	public long getSrc75() throws CFException {
   		return work.getSrc75();
	}


	/**
	 *	Returns String value of src75
	 *	@return src75
	 */
	public char[]  getSrc75String() throws CFException {
	     return String.valueOf(work.getSrc75String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src75IsNumeric()  throws CFException{
	    return work.src75IsNumeric();
	}

	/**
	 * 	Update Src75 with the passed value
	 *	@param number
	 */
	public void setSrc75(long number)  throws CFException{
		work.setSrc75(number);
	}
	

	
	/**
	 * 	Update Src75 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc75(char[] value)  throws CFException {
		work.setSrc75(value);
	}
	
	/**
	 * 	Update Src75 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc75String(char[] value)  throws CFException{
		work.setSrc75(value);
	}	

	/**
	 *	Returns the value of tgt76
	 *	@return tgt76
	 */
	public long getTgt76() throws CFException {
   		return work.getTgt76();
	}


	/**
	 *	Returns String value of tgt76
	 *	@return tgt76
	 */
	public char[]  getTgt76String() throws CFException {
	     return String.valueOf(work.getTgt76String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt76IsNumeric()  throws CFException{
	    return work.tgt76IsNumeric();
	}

	/**
	 * 	Update Tgt76 with the passed value
	 *	@param number
	 */
	public void setTgt76(long number)  throws CFException{
		work.setTgt76(number);
	}
	

	
	/**
	 * 	Update Tgt76 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt76(char[] value)  throws CFException {
		work.setTgt76(value);
	}
	
	/**
	 * 	Update Tgt76 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt76String(char[] value)  throws CFException{
		work.setTgt76(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process17Split77OutCtx clone() {
        Process17Split77OutCtx cloneObj = new Process17Split77OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process17Split77OutCtx getProcess17Split77OutCtx() {
            return new Process17Split77OutCtx();
    }
     public class Process18Split79OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt81
	 *	@return tgt81
	 */
	public short getTgt81() throws CFException {        
   		return work.getTgt81();
	}
	
	/**
	 * 	Update Tgt81 with the passed value
	 *	@param number
	 */
	public void setTgt81(short number)  throws CFException{
		work.setTgt81(number);
	}

	public void setTgt81(int number)  throws CFException{
		work.setTgt81((short)number);
	}

	public void setTgt81(long number)  throws CFException{
		work.setTgt81((short)number);
	}



	/**
	 *	Returns the value of src81
	 *	@return src81
	 */
	public long getSrc81() throws CFException {
   		return work.getSrc81();
	}


	/**
	 *	Returns String value of src81
	 *	@return src81
	 */
	public char[]  getSrc81String() throws CFException {
	     return String.valueOf(work.getSrc81String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src81IsNumeric()  throws CFException{
	    return work.src81IsNumeric();
	}

	/**
	 * 	Update Src81 with the passed value
	 *	@param number
	 */
	public void setSrc81(long number)  throws CFException{
		work.setSrc81(number);
	}
	

	
	/**
	 * 	Update Src81 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc81(char[] value)  throws CFException {
		work.setSrc81(value);
	}
	
	/**
	 * 	Update Src81 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc81String(char[] value)  throws CFException{
		work.setSrc81(value);
	}	

	/**
	 *	Returns the value of src80
	 *	@return src80
	 */
	public long getSrc80() throws CFException {
   		return work.getSrc80();
	}


	/**
	 *	Returns String value of src80
	 *	@return src80
	 */
	public char[]  getSrc80String() throws CFException {
	     return String.valueOf(work.getSrc80String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src80IsNumeric()  throws CFException{
	    return work.src80IsNumeric();
	}

	/**
	 * 	Update Src80 with the passed value
	 *	@param number
	 */
	public void setSrc80(long number)  throws CFException{
		work.setSrc80(number);
	}
	

	
	/**
	 * 	Update Src80 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc80(char[] value)  throws CFException {
		work.setSrc80(value);
	}
	
	/**
	 * 	Update Src80 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc80String(char[] value)  throws CFException{
		work.setSrc80(value);
	}	

	/**
	 *	Returns the value of tgt80
	 *	@return tgt80
	 */
	public long getTgt80() throws CFException {        
   		return work.getTgt80();
	}
	
	/**
	 * 	Update Tgt80 with the passed value
	 *	@param number
	 */
	public void setTgt80(long number)  throws CFException{
		work.setTgt80(number);
	}



	/**
	 *	Returns the value of src78
	 *	@return src78
	 */
	public long getSrc78() throws CFException {
   		return work.getSrc78();
	}


	/**
	 *	Returns String value of src78
	 *	@return src78
	 */
	public char[]  getSrc78String() throws CFException {
	     return String.valueOf(work.getSrc78String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src78IsNumeric()  throws CFException{
	    return work.src78IsNumeric();
	}

	/**
	 * 	Update Src78 with the passed value
	 *	@param number
	 */
	public void setSrc78(long number)  throws CFException{
		work.setSrc78(number);
	}
	

	
	/**
	 * 	Update Src78 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc78(char[] value)  throws CFException {
		work.setSrc78(value);
	}
	
	/**
	 * 	Update Src78 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc78String(char[] value)  throws CFException{
		work.setSrc78(value);
	}	

	/**
	 *	Returns the value of src79
	 *	@return src79
	 */
	public long getSrc79() throws CFException {
   		return work.getSrc79();
	}


	/**
	 *	Returns String value of src79
	 *	@return src79
	 */
	public char[]  getSrc79String() throws CFException {
	     return String.valueOf(work.getSrc79String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src79IsNumeric()  throws CFException{
	    return work.src79IsNumeric();
	}

	/**
	 * 	Update Src79 with the passed value
	 *	@param number
	 */
	public void setSrc79(long number)  throws CFException{
		work.setSrc79(number);
	}
	

	
	/**
	 * 	Update Src79 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc79(char[] value)  throws CFException {
		work.setSrc79(value);
	}
	
	/**
	 * 	Update Src79 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc79String(char[] value)  throws CFException{
		work.setSrc79(value);
	}	

	/**
	 *	Returns the value of tgt78
	 *	@return tgt78
	 */
	public long getTgt78() throws CFException {        
   		return work.getTgt78();
	}
	
	/**
	 * 	Update Tgt78 with the passed value
	 *	@param number
	 */
	public void setTgt78(long number)  throws CFException{
		work.setTgt78(number);
	}



	/**
	 *	Returns the value of tgt79
	 *	@return tgt79
	 */
	public long getTgt79() throws CFException {        
   		return work.getTgt79();
	}
	
	/**
	 * 	Update Tgt79 with the passed value
	 *	@param number
	 */
	public void setTgt79(long number)  throws CFException{
		work.setTgt79(number);
	}



	/**
	 *	Returns the value of src82
	 *	@return src82
	 */
	public long getSrc82() throws CFException {
   		return work.getSrc82();
	}


	/**
	 *	Returns String value of src82
	 *	@return src82
	 */
	public char[]  getSrc82String() throws CFException {
	     return String.valueOf(work.getSrc82String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src82IsNumeric()  throws CFException{
	    return work.src82IsNumeric();
	}

	/**
	 * 	Update Src82 with the passed value
	 *	@param number
	 */
	public void setSrc82(long number)  throws CFException{
		work.setSrc82(number);
	}
	

	
	/**
	 * 	Update Src82 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc82(char[] value)  throws CFException {
		work.setSrc82(value);
	}
	
	/**
	 * 	Update Src82 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc82String(char[] value)  throws CFException{
		work.setSrc82(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process18Split79OutCtx clone() {
        Process18Split79OutCtx cloneObj = new Process18Split79OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process18Split79OutCtx getProcess18Split79OutCtx() {
            return new Process18Split79OutCtx();
    }
     public class Process19Split81InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src83
	 *	@return src83
	 */
	public long getSrc83() throws CFException {
   		return work.getSrc83();
	}


	/**
	 *	Returns String value of src83
	 *	@return src83
	 */
	public char[]  getSrc83String() throws CFException {
	     return String.valueOf(work.getSrc83String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src83IsNumeric()  throws CFException{
	    return work.src83IsNumeric();
	}

	/**
	 * 	Update Src83 with the passed value
	 *	@param number
	 */
	public void setSrc83(long number)  throws CFException{
		work.setSrc83(number);
	}
	

	
	/**
	 * 	Update Src83 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc83(char[] value)  throws CFException {
		work.setSrc83(value);
	}
	
	/**
	 * 	Update Src83 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc83String(char[] value)  throws CFException{
		work.setSrc83(value);
	}	

	/**
	 *	Returns the value of src84
	 *	@return src84
	 */
	public long getSrc84() throws CFException {
   		return work.getSrc84();
	}


	/**
	 *	Returns String value of src84
	 *	@return src84
	 */
	public char[]  getSrc84String() throws CFException {
	     return String.valueOf(work.getSrc84String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src84IsNumeric()  throws CFException{
	    return work.src84IsNumeric();
	}

	/**
	 * 	Update Src84 with the passed value
	 *	@param number
	 */
	public void setSrc84(long number)  throws CFException{
		work.setSrc84(number);
	}
	

	
	/**
	 * 	Update Src84 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc84(char[] value)  throws CFException {
		work.setSrc84(value);
	}
	
	/**
	 * 	Update Src84 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc84String(char[] value)  throws CFException{
		work.setSrc84(value);
	}	

	/**
	 *	Returns the value of src82
	 *	@return src82
	 */
	public long getSrc82() throws CFException {
   		return work.getSrc82();
	}


	/**
	 *	Returns String value of src82
	 *	@return src82
	 */
	public char[]  getSrc82String() throws CFException {
	     return String.valueOf(work.getSrc82String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src82IsNumeric()  throws CFException{
	    return work.src82IsNumeric();
	}

	/**
	 * 	Update Src82 with the passed value
	 *	@param number
	 */
	public void setSrc82(long number)  throws CFException{
		work.setSrc82(number);
	}
	

	
	/**
	 * 	Update Src82 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc82(char[] value)  throws CFException {
		work.setSrc82(value);
	}
	
	/**
	 * 	Update Src82 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc82String(char[] value)  throws CFException{
		work.setSrc82(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process19Split81OutCtx getProcess19Split81OutCtx() {
            return new Process19Split81OutCtx();
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

    public Process19Split81InCtx clone() {
        Process19Split81InCtx cloneObj = new Process19Split81InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process19Split81InCtx getProcess19Split81InCtx() {
            return new Process19Split81InCtx();
    }
     public class Process19Split81OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt84
	 *	@return tgt84
	 */
	public int getTgt84() throws CFException {
   		return work.getTgt84();
	}

    /**
	 *	Returns the String value of tgt84
	 *	@return tgt84
	 */
	public char[]  getTgt84ActualString() {
		return work.getTgt84ActualString();
	}

	/**
	 *	Returns String value of tgt84
	 *	@return tgt84
	 */
	public char[]  getTgt84String() throws CFException {
	     return String.valueOf(work.getTgt84String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt84IsNumeric()  throws CFException{
	    return work.tgt84IsNumeric();
	}

	/**
	 * 	Update Tgt84 with the passed value
	 *	@param number
	 */
	public void setTgt84(int number)  throws CFException{
		work.setTgt84(number);
	}
	

	public void setTgt84(long number)  throws CFException{
	    work.setTgt84(number);
	}
	
	
	/**
	 * 	Update Tgt84 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt84(char[] value)  throws CFException {
		work.setTgt84(value);
	}
	
	/**
	 * 	Update Tgt84 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt84String(char[] value)  throws CFException{
		work.setTgt84(value);
	}	

	/**
	 *	Returns the value of tgt85
	 *	@return tgt85
	 */
	public int getTgt85() throws CFException {        
   		return work.getTgt85();
	}
	
	/**
	 * 	Update Tgt85 with the passed value
	 *	@param number
	 */
	public void setTgt85(int number)  throws CFException{
		work.setTgt85(number);
	}


	public void setTgt85(long number)  throws CFException{
		work.setTgt85((int)number);
	}


	/**
	 *	Returns the value of src86
	 *	@return src86
	 */
	public long getSrc86() throws CFException {
   		return work.getSrc86();
	}

    /**
	 *	Returns the String value of src86
	 *	@return src86
	 */
	public char[]  getSrc86ActualString() {
		return work.getSrc86ActualString();
	}

	/**
	 *	Returns String value of src86
	 *	@return src86
	 */
	public char[]  getSrc86String() throws CFException {
	     return String.valueOf(work.getSrc86String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src86IsNumeric()  throws CFException{
	    return work.src86IsNumeric();
	}

	/**
	 * 	Update Src86 with the passed value
	 *	@param number
	 */
	public void setSrc86(long number)  throws CFException{
		work.setSrc86(number);
	}
	

	
	/**
	 * 	Update Src86 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc86(char[] value)  throws CFException {
		work.setSrc86(value);
	}
	
	/**
	 * 	Update Src86 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc86String(char[] value)  throws CFException{
		work.setSrc86(value);
	}	

	/**
	 *	Returns the value of tgt86
	 *	@return tgt86
	 */
	public long getTgt86() throws CFException {        
   		return work.getTgt86();
	}
	
	/**
	 * 	Update Tgt86 with the passed value
	 *	@param number
	 */
	public void setTgt86(long number)  throws CFException{
		work.setTgt86(number);
	}



	/**
	 *	Returns the value of tgt82
	 *	@return tgt82
	 */
	public int getTgt82() throws CFException {        
   		return work.getTgt82();
	}
	
	/**
	 * 	Update Tgt82 with the passed value
	 *	@param number
	 */
	public void setTgt82(int number)  throws CFException{
		work.setTgt82(number);
	}


	public void setTgt82(long number)  throws CFException{
		work.setTgt82((int)number);
	}


	/**
	 *	Returns the value of src83
	 *	@return src83
	 */
	public long getSrc83() throws CFException {
   		return work.getSrc83();
	}


	/**
	 *	Returns String value of src83
	 *	@return src83
	 */
	public char[]  getSrc83String() throws CFException {
	     return String.valueOf(work.getSrc83String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src83IsNumeric()  throws CFException{
	    return work.src83IsNumeric();
	}

	/**
	 * 	Update Src83 with the passed value
	 *	@param number
	 */
	public void setSrc83(long number)  throws CFException{
		work.setSrc83(number);
	}
	

	
	/**
	 * 	Update Src83 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc83(char[] value)  throws CFException {
		work.setSrc83(value);
	}
	
	/**
	 * 	Update Src83 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc83String(char[] value)  throws CFException{
		work.setSrc83(value);
	}	

	/**
	 *	Returns the value of src84
	 *	@return src84
	 */
	public long getSrc84() throws CFException {
   		return work.getSrc84();
	}


	/**
	 *	Returns String value of src84
	 *	@return src84
	 */
	public char[]  getSrc84String() throws CFException {
	     return String.valueOf(work.getSrc84String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src84IsNumeric()  throws CFException{
	    return work.src84IsNumeric();
	}

	/**
	 * 	Update Src84 with the passed value
	 *	@param number
	 */
	public void setSrc84(long number)  throws CFException{
		work.setSrc84(number);
	}
	

	
	/**
	 * 	Update Src84 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc84(char[] value)  throws CFException {
		work.setSrc84(value);
	}
	
	/**
	 * 	Update Src84 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc84String(char[] value)  throws CFException{
		work.setSrc84(value);
	}	

	/**
	 *	Returns the value of tgt83
	 *	@return tgt83
	 */
	public long getTgt83() throws CFException {
   		return work.getTgt83();
	}


	/**
	 *	Returns String value of tgt83
	 *	@return tgt83
	 */
	public char[]  getTgt83String() throws CFException {
	     return String.valueOf(work.getTgt83String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt83IsNumeric()  throws CFException{
	    return work.tgt83IsNumeric();
	}

	/**
	 * 	Update Tgt83 with the passed value
	 *	@param number
	 */
	public void setTgt83(long number)  throws CFException{
		work.setTgt83(number);
	}
	

	
	/**
	 * 	Update Tgt83 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt83(char[] value)  throws CFException {
		work.setTgt83(value);
	}
	
	/**
	 * 	Update Tgt83 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt83String(char[] value)  throws CFException{
		work.setTgt83(value);
	}	

	/**
	 *	Returns the value of src85
	 *	@return src85
	 */
	public long getSrc85() throws CFException {
   		return work.getSrc85();
	}

    /**
	 *	Returns the String value of src85
	 *	@return src85
	 */
	public char[]  getSrc85ActualString() {
		return work.getSrc85ActualString();
	}

	/**
	 *	Returns String value of src85
	 *	@return src85
	 */
	public char[]  getSrc85String() throws CFException {
	     return String.valueOf(work.getSrc85String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src85IsNumeric()  throws CFException{
	    return work.src85IsNumeric();
	}

	/**
	 * 	Update Src85 with the passed value
	 *	@param number
	 */
	public void setSrc85(long number)  throws CFException{
		work.setSrc85(number);
	}
	

	
	/**
	 * 	Update Src85 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc85(char[] value)  throws CFException {
		work.setSrc85(value);
	}
	
	/**
	 * 	Update Src85 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc85String(char[] value)  throws CFException{
		work.setSrc85(value);
	}	

	/**
	 *	Returns the value of src82
	 *	@return src82
	 */
	public long getSrc82() throws CFException {
   		return work.getSrc82();
	}


	/**
	 *	Returns String value of src82
	 *	@return src82
	 */
	public char[]  getSrc82String() throws CFException {
	     return String.valueOf(work.getSrc82String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src82IsNumeric()  throws CFException{
	    return work.src82IsNumeric();
	}

	/**
	 * 	Update Src82 with the passed value
	 *	@param number
	 */
	public void setSrc82(long number)  throws CFException{
		work.setSrc82(number);
	}
	

	
	/**
	 * 	Update Src82 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc82(char[] value)  throws CFException {
		work.setSrc82(value);
	}
	
	/**
	 * 	Update Src82 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc82String(char[] value)  throws CFException{
		work.setSrc82(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process19Split81OutCtx clone() {
        Process19Split81OutCtx cloneObj = new Process19Split81OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process19Split81OutCtx getProcess19Split81OutCtx() {
            return new Process19Split81OutCtx();
    }
     public class Process20Split83InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src86
	 *	@return src86
	 */
	public long getSrc86() throws CFException {
   		return work.getSrc86();
	}

    /**
	 *	Returns the String value of src86
	 *	@return src86
	 */
	public char[]  getSrc86ActualString() {
		return work.getSrc86ActualString();
	}

	/**
	 *	Returns String value of src86
	 *	@return src86
	 */
	public char[]  getSrc86String() throws CFException {
	     return String.valueOf(work.getSrc86String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src86IsNumeric()  throws CFException{
	    return work.src86IsNumeric();
	}

	/**
	 * 	Update Src86 with the passed value
	 *	@param number
	 */
	public void setSrc86(long number)  throws CFException{
		work.setSrc86(number);
	}
	

	
	/**
	 * 	Update Src86 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc86(char[] value)  throws CFException {
		work.setSrc86(value);
	}
	
	/**
	 * 	Update Src86 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc86String(char[] value)  throws CFException{
		work.setSrc86(value);
	}	

	/**
	 *	Returns the value of src87
	 *	@return src87
	 */
	public long getSrc87() throws CFException {
   		return work.getSrc87();
	}

    /**
	 *	Returns the String value of src87
	 *	@return src87
	 */
	public char[]  getSrc87ActualString() {
		return work.getSrc87ActualString();
	}

	/**
	 *	Returns String value of src87
	 *	@return src87
	 */
	public char[]  getSrc87String() throws CFException {
	     return String.valueOf(work.getSrc87String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src87IsNumeric()  throws CFException{
	    return work.src87IsNumeric();
	}

	/**
	 * 	Update Src87 with the passed value
	 *	@param number
	 */
	public void setSrc87(long number)  throws CFException{
		work.setSrc87(number);
	}
	

	
	/**
	 * 	Update Src87 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc87(char[] value)  throws CFException {
		work.setSrc87(value);
	}
	
	/**
	 * 	Update Src87 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc87String(char[] value)  throws CFException{
		work.setSrc87(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process20Split83OutCtx getProcess20Split83OutCtx() {
            return new Process20Split83OutCtx();
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

    public Process20Split83InCtx clone() {
        Process20Split83InCtx cloneObj = new Process20Split83InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process20Split83InCtx getProcess20Split83InCtx() {
            return new Process20Split83InCtx();
    }
     public class Process20Split83OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt86
	 *	@return tgt86
	 */
	public long getTgt86() throws CFException {        
   		return work.getTgt86();
	}
	
	/**
	 * 	Update Tgt86 with the passed value
	 *	@param number
	 */
	public void setTgt86(long number)  throws CFException{
		work.setTgt86(number);
	}



	/**
	 *	Returns the value of src86
	 *	@return src86
	 */
	public long getSrc86() throws CFException {
   		return work.getSrc86();
	}

    /**
	 *	Returns the String value of src86
	 *	@return src86
	 */
	public char[]  getSrc86ActualString() {
		return work.getSrc86ActualString();
	}

	/**
	 *	Returns String value of src86
	 *	@return src86
	 */
	public char[]  getSrc86String() throws CFException {
	     return String.valueOf(work.getSrc86String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src86IsNumeric()  throws CFException{
	    return work.src86IsNumeric();
	}

	/**
	 * 	Update Src86 with the passed value
	 *	@param number
	 */
	public void setSrc86(long number)  throws CFException{
		work.setSrc86(number);
	}
	

	
	/**
	 * 	Update Src86 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc86(char[] value)  throws CFException {
		work.setSrc86(value);
	}
	
	/**
	 * 	Update Src86 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc86String(char[] value)  throws CFException{
		work.setSrc86(value);
	}	

	/**
	 *	Returns the value of tgt90
	 *	@return tgt90
	 */
	public int getTgt90() throws CFException {        
   		return work.getTgt90();
	}
	
	/**
	 * 	Update Tgt90 with the passed value
	 *	@param number
	 */
	public void setTgt90(int number)  throws CFException{
		work.setTgt90(number);
	}


	public void setTgt90(long number)  throws CFException{
		work.setTgt90((int)number);
	}


	/**
	 *	Returns the value of src89
	 *	@return src89
	 */
	public long getSrc89() throws CFException {
   		return work.getSrc89();
	}

    /**
	 *	Returns the String value of src89
	 *	@return src89
	 */
	public char[]  getSrc89ActualString() {
		return work.getSrc89ActualString();
	}

	/**
	 *	Returns String value of src89
	 *	@return src89
	 */
	public char[]  getSrc89String() throws CFException {
	     return String.valueOf(work.getSrc89String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src89IsNumeric()  throws CFException{
	    return work.src89IsNumeric();
	}

	/**
	 * 	Update Src89 with the passed value
	 *	@param number
	 */
	public void setSrc89(long number)  throws CFException{
		work.setSrc89(number);
	}
	

	
	/**
	 * 	Update Src89 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc89(char[] value)  throws CFException {
		work.setSrc89(value);
	}
	
	/**
	 * 	Update Src89 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc89String(char[] value)  throws CFException{
		work.setSrc89(value);
	}	

	/**
	 *	Returns the value of src88
	 *	@return src88
	 */
	public long getSrc88() throws CFException {
   		return work.getSrc88();
	}

    /**
	 *	Returns the String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88ActualString() {
		return work.getSrc88ActualString();
	}

	/**
	 *	Returns String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88String() throws CFException {
	     return String.valueOf(work.getSrc88String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src88IsNumeric()  throws CFException{
	    return work.src88IsNumeric();
	}

	/**
	 * 	Update Src88 with the passed value
	 *	@param number
	 */
	public void setSrc88(long number)  throws CFException{
		work.setSrc88(number);
	}
	

	
	/**
	 * 	Update Src88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc88(char[] value)  throws CFException {
		work.setSrc88(value);
	}
	
	/**
	 * 	Update Src88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc88String(char[] value)  throws CFException{
		work.setSrc88(value);
	}	

	/**
	 *	Returns the value of src90
	 *	@return src90
	 */
	public long getSrc90() throws CFException {
   		return work.getSrc90();
	}

    /**
	 *	Returns the String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90ActualString() {
		return work.getSrc90ActualString();
	}

	/**
	 *	Returns String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90String() throws CFException {
	     return String.valueOf(work.getSrc90String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src90IsNumeric()  throws CFException{
	    return work.src90IsNumeric();
	}

	/**
	 * 	Update Src90 with the passed value
	 *	@param number
	 */
	public void setSrc90(long number)  throws CFException{
		work.setSrc90(number);
	}
	

	
	/**
	 * 	Update Src90 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc90(char[] value)  throws CFException {
		work.setSrc90(value);
	}
	
	/**
	 * 	Update Src90 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc90String(char[] value)  throws CFException{
		work.setSrc90(value);
	}	

	/**
	 *	Returns the value of src87
	 *	@return src87
	 */
	public long getSrc87() throws CFException {
   		return work.getSrc87();
	}

    /**
	 *	Returns the String value of src87
	 *	@return src87
	 */
	public char[]  getSrc87ActualString() {
		return work.getSrc87ActualString();
	}

	/**
	 *	Returns String value of src87
	 *	@return src87
	 */
	public char[]  getSrc87String() throws CFException {
	     return String.valueOf(work.getSrc87String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src87IsNumeric()  throws CFException{
	    return work.src87IsNumeric();
	}

	/**
	 * 	Update Src87 with the passed value
	 *	@param number
	 */
	public void setSrc87(long number)  throws CFException{
		work.setSrc87(number);
	}
	

	
	/**
	 * 	Update Src87 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc87(char[] value)  throws CFException {
		work.setSrc87(value);
	}
	
	/**
	 * 	Update Src87 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc87String(char[] value)  throws CFException{
		work.setSrc87(value);
	}	

	/**
	 *	Returns the value of tgt87
	 *	@return tgt87
	 */
	public long getTgt87() throws CFException {        
   		return work.getTgt87();
	}
	
	/**
	 * 	Update Tgt87 with the passed value
	 *	@param number
	 */
	public void setTgt87(long number)  throws CFException{
		work.setTgt87(number);
	}



	/**
	 *	Returns the value of tgt88
	 *	@return tgt88
	 */
	public long getTgt88() throws CFException {        
   		return work.getTgt88();
	}
	
	/**
	 * 	Update Tgt88 with the passed value
	 *	@param number
	 */
	public void setTgt88(long number)  throws CFException{
		work.setTgt88(number);
	}



	/**
	 *	Returns the value of tgt89
	 *	@return tgt89
	 */
	public short getTgt89() throws CFException {        
   		return work.getTgt89();
	}
	
	/**
	 * 	Update Tgt89 with the passed value
	 *	@param number
	 */
	public void setTgt89(short number)  throws CFException{
		work.setTgt89(number);
	}

	public void setTgt89(int number)  throws CFException{
		work.setTgt89((short)number);
	}

	public void setTgt89(long number)  throws CFException{
		work.setTgt89((short)number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process20Split83OutCtx clone() {
        Process20Split83OutCtx cloneObj = new Process20Split83OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process20Split83OutCtx getProcess20Split83OutCtx() {
            return new Process20Split83OutCtx();
    }
     public class Process21Split85InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src92
	 *	@return src92
	 */
	public long getSrc92() throws CFException {
   		return work.getSrc92();
	}


	/**
	 *	Returns String value of src92
	 *	@return src92
	 */
	public char[]  getSrc92String() throws CFException {
	     return String.valueOf(work.getSrc92String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src92IsNumeric()  throws CFException{
	    return work.src92IsNumeric();
	}

	/**
	 * 	Update Src92 with the passed value
	 *	@param number
	 */
	public void setSrc92(long number)  throws CFException{
		work.setSrc92(number);
	}
	

	
	/**
	 * 	Update Src92 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc92(char[] value)  throws CFException {
		work.setSrc92(value);
	}
	
	/**
	 * 	Update Src92 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc92String(char[] value)  throws CFException{
		work.setSrc92(value);
	}	

	/**
	 *	Returns the value of src90
	 *	@return src90
	 */
	public long getSrc90() throws CFException {
   		return work.getSrc90();
	}

    /**
	 *	Returns the String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90ActualString() {
		return work.getSrc90ActualString();
	}

	/**
	 *	Returns String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90String() throws CFException {
	     return String.valueOf(work.getSrc90String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src90IsNumeric()  throws CFException{
	    return work.src90IsNumeric();
	}

	/**
	 * 	Update Src90 with the passed value
	 *	@param number
	 */
	public void setSrc90(long number)  throws CFException{
		work.setSrc90(number);
	}
	

	
	/**
	 * 	Update Src90 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc90(char[] value)  throws CFException {
		work.setSrc90(value);
	}
	
	/**
	 * 	Update Src90 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc90String(char[] value)  throws CFException{
		work.setSrc90(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process21Split85OutCtx getProcess21Split85OutCtx() {
            return new Process21Split85OutCtx();
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

    public Process21Split85InCtx clone() {
        Process21Split85InCtx cloneObj = new Process21Split85InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process21Split85InCtx getProcess21Split85InCtx() {
            return new Process21Split85InCtx();
    }
     public class Process21Split85OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt92
	 *	@return tgt92
	 */
	public int getTgt92() throws CFException {
   		return work.getTgt92();
	}

    /**
	 *	Returns the String value of tgt92
	 *	@return tgt92
	 */
	public char[]  getTgt92ActualString() {
		return work.getTgt92ActualString();
	}

	/**
	 *	Returns String value of tgt92
	 *	@return tgt92
	 */
	public char[]  getTgt92String() throws CFException {
	     return String.valueOf(work.getTgt92String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt92IsNumeric()  throws CFException{
	    return work.tgt92IsNumeric();
	}

	/**
	 * 	Update Tgt92 with the passed value
	 *	@param number
	 */
	public void setTgt92(int number)  throws CFException{
		work.setTgt92(number);
	}
	

	public void setTgt92(long number)  throws CFException{
	    work.setTgt92(number);
	}
	
	
	/**
	 * 	Update Tgt92 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt92(char[] value)  throws CFException {
		work.setTgt92(value);
	}
	
	/**
	 * 	Update Tgt92 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt92String(char[] value)  throws CFException{
		work.setTgt92(value);
	}	

	/**
	 *	Returns the value of tgt94
	 *	@return tgt94
	 */
   public char[] getTgt94() throws CFException  {              
   		return work.getTgt94();
   }

  
	/**
	*  set variable tgt94
	*  @param value
	**/
   public void setTgt94(char[] value) throws CFException {
      work.setTgt94(value);
   } 

     /**
	 * 	Update Tgt94 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt94(char[] source, int sourceIndex) throws CFException {
      work.setTgt94(source, sourceIndex);
   	
   }
   
   public void setTgt94(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt94(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt94 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt94(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt94(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt94 with another Field
	 *	@param value
	 */
   public void setTgt94(Field source) {
      work.setTgt94(source);
   }  
   
     /**
	 * 	Update Tgt94 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt94(Field source, int sourceIndex,int sourceLen) {
      work.setTgt94(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt94 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt94(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt94(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt90
	 *	@return tgt90
	 */
	public int getTgt90() throws CFException {        
   		return work.getTgt90();
	}
	
	/**
	 * 	Update Tgt90 with the passed value
	 *	@param number
	 */
	public void setTgt90(int number)  throws CFException{
		work.setTgt90(number);
	}


	public void setTgt90(long number)  throws CFException{
		work.setTgt90((int)number);
	}


	/**
	 *	Returns the value of src93
	 *	@return src93
	 */
	public short getSrc93() throws CFException {        
   		return work.getSrc93();
	}
	
	/**
	 * 	Update Src93 with the passed value
	 *	@param number
	 */
	public void setSrc93(short number)  throws CFException{
		work.setSrc93(number);
	}

	public void setSrc93(int number)  throws CFException{
		work.setSrc93((short)number);
	}

	public void setSrc93(long number)  throws CFException{
		work.setSrc93((short)number);
	}



	/**
	 *	Returns the value of tgt93
	 *	@return tgt93
	 */
   public char[] getTgt93() throws CFException  {              
   		return work.getTgt93();
   }

  
	/**
	*  set variable tgt93
	*  @param value
	**/
   public void setTgt93(char[] value) throws CFException {
      work.setTgt93(value);
   } 

     /**
	 * 	Update Tgt93 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt93(char[] source, int sourceIndex) throws CFException {
      work.setTgt93(source, sourceIndex);
   	
   }
   
   public void setTgt93(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt93(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt93 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt93(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt93(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt93 with another Field
	 *	@param value
	 */
   public void setTgt93(Field source) {
      work.setTgt93(source);
   }  
   
     /**
	 * 	Update Tgt93 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt93(Field source, int sourceIndex,int sourceLen) {
      work.setTgt93(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt93 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt93(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt93(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src92
	 *	@return src92
	 */
	public long getSrc92() throws CFException {
   		return work.getSrc92();
	}


	/**
	 *	Returns String value of src92
	 *	@return src92
	 */
	public char[]  getSrc92String() throws CFException {
	     return String.valueOf(work.getSrc92String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src92IsNumeric()  throws CFException{
	    return work.src92IsNumeric();
	}

	/**
	 * 	Update Src92 with the passed value
	 *	@param number
	 */
	public void setSrc92(long number)  throws CFException{
		work.setSrc92(number);
	}
	

	
	/**
	 * 	Update Src92 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc92(char[] value)  throws CFException {
		work.setSrc92(value);
	}
	
	/**
	 * 	Update Src92 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc92String(char[] value)  throws CFException{
		work.setSrc92(value);
	}	

	/**
	 *	Returns the value of tgt91
	 *	@return tgt91
	 */
	public long getTgt91() throws CFException {
   		return work.getTgt91();
	}


	/**
	 *	Returns String value of tgt91
	 *	@return tgt91
	 */
	public char[]  getTgt91String() throws CFException {
	     return String.valueOf(work.getTgt91String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt91IsNumeric()  throws CFException{
	    return work.tgt91IsNumeric();
	}

	/**
	 * 	Update Tgt91 with the passed value
	 *	@param number
	 */
	public void setTgt91(long number)  throws CFException{
		work.setTgt91(number);
	}
	

	
	/**
	 * 	Update Tgt91 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt91(char[] value)  throws CFException {
		work.setTgt91(value);
	}
	
	/**
	 * 	Update Tgt91 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt91String(char[] value)  throws CFException{
		work.setTgt91(value);
	}	

	/**
	 *	Returns the value of src90
	 *	@return src90
	 */
	public long getSrc90() throws CFException {
   		return work.getSrc90();
	}

    /**
	 *	Returns the String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90ActualString() {
		return work.getSrc90ActualString();
	}

	/**
	 *	Returns String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90String() throws CFException {
	     return String.valueOf(work.getSrc90String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src90IsNumeric()  throws CFException{
	    return work.src90IsNumeric();
	}

	/**
	 * 	Update Src90 with the passed value
	 *	@param number
	 */
	public void setSrc90(long number)  throws CFException{
		work.setSrc90(number);
	}
	

	
	/**
	 * 	Update Src90 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc90(char[] value)  throws CFException {
		work.setSrc90(value);
	}
	
	/**
	 * 	Update Src90 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc90String(char[] value)  throws CFException{
		work.setSrc90(value);
	}	

	/**
	 *	Returns the value of src91
	 *	@return src91
	 */
	public long getSrc91() throws CFException {
   		return work.getSrc91();
	}

    /**
	 *	Returns the String value of src91
	 *	@return src91
	 */
	public char[]  getSrc91ActualString() {
		return work.getSrc91ActualString();
	}

	/**
	 *	Returns String value of src91
	 *	@return src91
	 */
	public char[]  getSrc91String() throws CFException {
	     return String.valueOf(work.getSrc91String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src91IsNumeric()  throws CFException{
	    return work.src91IsNumeric();
	}

	/**
	 * 	Update Src91 with the passed value
	 *	@param number
	 */
	public void setSrc91(long number)  throws CFException{
		work.setSrc91(number);
	}
	

	
	/**
	 * 	Update Src91 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc91(char[] value)  throws CFException {
		work.setSrc91(value);
	}
	
	/**
	 * 	Update Src91 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc91String(char[] value)  throws CFException{
		work.setSrc91(value);
	}	

	/**
	 *	Returns the value of src94
	 *	@return src94
	 */
	public int getSrc94() throws CFException {        
   		return work.getSrc94();
	}
	
	/**
	 * 	Update Src94 with the passed value
	 *	@param number
	 */
	public void setSrc94(int number)  throws CFException{
		work.setSrc94(number);
	}


	public void setSrc94(long number)  throws CFException{
		work.setSrc94((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process21Split85OutCtx clone() {
        Process21Split85OutCtx cloneObj = new Process21Split85OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process21Split85OutCtx getProcess21Split85OutCtx() {
            return new Process21Split85OutCtx();
    }
     public class Process22Split87InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process22Split87OutCtx getProcess22Split87OutCtx() {
            return new Process22Split87OutCtx();
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

    public Process22Split87InCtx clone() {
        Process22Split87InCtx cloneObj = new Process22Split87InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process22Split87InCtx getProcess22Split87InCtx() {
            return new Process22Split87InCtx();
    }
     public class Process22Split87OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src97
	 *	@return src97
	 */
	public int getSrc97() throws CFException {        
   		return work.getSrc97();
	}
	
	/**
	 * 	Update Src97 with the passed value
	 *	@param number
	 */
	public void setSrc97(int number)  throws CFException{
		work.setSrc97(number);
	}


	public void setSrc97(long number)  throws CFException{
		work.setSrc97((int)number);
	}


	public BigDecimal getTgt96() throws CFException{      
   		return work.getTgt96();
	}

    public char[] getTgt96String() throws CFException {
          return  work.getTgt96().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt96 with the passed number
	 *	@param number
	 */
	public void setTgt96(BigDecimal number)  throws CFException{
		work.setTgt96(number);
   }

	/**
	 *	Returns the value of src96
	 *	@return src96
	 */
	public short getSrc96() throws CFException {        
   		return work.getSrc96();
	}
	
	/**
	 * 	Update Src96 with the passed value
	 *	@param number
	 */
	public void setSrc96(short number)  throws CFException{
		work.setSrc96(number);
	}

	public void setSrc96(int number)  throws CFException{
		work.setSrc96((short)number);
	}

	public void setSrc96(long number)  throws CFException{
		work.setSrc96((short)number);
	}



	/**
	 *	Returns the value of src98
	 *	@return src98
	 */
	public int getSrc98() throws CFException {        
   		return work.getSrc98();
	}
	
	/**
	 * 	Update Src98 with the passed value
	 *	@param number
	 */
	public void setSrc98(int number)  throws CFException{
		work.setSrc98(number);
	}


	public void setSrc98(long number)  throws CFException{
		work.setSrc98((int)number);
	}


	/**
	 *	Returns the value of src99
	 *	@return src99
	 */
	public int getSrc99() throws CFException {        
   		return work.getSrc99();
	}
	
	/**
	 * 	Update Src99 with the passed value
	 *	@param number
	 */
	public void setSrc99(int number)  throws CFException{
		work.setSrc99(number);
	}


	public void setSrc99(long number)  throws CFException{
		work.setSrc99((int)number);
	}


	/**
	 *	Returns the value of src95
	 *	@return src95
	 */
	public short getSrc95() throws CFException {        
   		return work.getSrc95();
	}
	
	/**
	 * 	Update Src95 with the passed value
	 *	@param number
	 */
	public void setSrc95(short number)  throws CFException{
		work.setSrc95(number);
	}

	public void setSrc95(int number)  throws CFException{
		work.setSrc95((short)number);
	}

	public void setSrc95(long number)  throws CFException{
		work.setSrc95((short)number);
	}



	public BigDecimal getTgt95() throws CFException{      
   		return work.getTgt95();
	}

    public char[] getTgt95String() throws CFException {
          return  work.getTgt95().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt95 with the passed number
	 *	@param number
	 */
	public void setTgt95(BigDecimal number)  throws CFException{
		work.setTgt95(number);
   }

	public BigDecimal getTgt98() throws CFException{      
   		return work.getTgt98();
	}

    public char[] getTgt98String() throws CFException {
          return  work.getTgt98().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt98 with the passed number
	 *	@param number
	 */
	public void setTgt98(BigDecimal number)  throws CFException{
		work.setTgt98(number);
   }

	public BigDecimal getTgt97() throws CFException{      
   		return work.getTgt97();
	}

    public char[] getTgt97String() throws CFException {
          return  work.getTgt97().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt97 with the passed number
	 *	@param number
	 */
	public void setTgt97(BigDecimal number)  throws CFException{
		work.setTgt97(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process22Split87OutCtx clone() {
        Process22Split87OutCtx cloneObj = new Process22Split87OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process22Split87OutCtx getProcess22Split87OutCtx() {
            return new Process22Split87OutCtx();
    }
     public class Process23Split89InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src99
	 *	@return src99
	 */
	public int getSrc99() throws CFException {        
   		return work.getSrc99();
	}
	
	/**
	 * 	Update Src99 with the passed value
	 *	@param number
	 */
	public void setSrc99(int number)  throws CFException{
		work.setSrc99(number);
	}


	public void setSrc99(long number)  throws CFException{
		work.setSrc99((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process23Split89OutCtx getProcess23Split89OutCtx() {
            return new Process23Split89OutCtx();
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

    public Process23Split89InCtx clone() {
        Process23Split89InCtx cloneObj = new Process23Split89InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process23Split89InCtx getProcess23Split89InCtx() {
            return new Process23Split89InCtx();
    }
     public class Process23Split89OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	public BigDecimal getTgt102() throws CFException{      
   		return work.getTgt102();
	}

    public char[] getTgt102String() throws CFException {
          return  work.getTgt102().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt102 with the passed number
	 *	@param number
	 */
	public void setTgt102(BigDecimal number)  throws CFException{
		work.setTgt102(number);
   }

	/**
	 *	Returns the value of src101
	 *	@return src101
	 */
	public long getSrc101() throws CFException {        
   		return work.getSrc101();
	}
	
	/**
	 * 	Update Src101 with the passed value
	 *	@param number
	 */
	public void setSrc101(long number)  throws CFException{
		work.setSrc101(number);
	}



	public BigDecimal getTgt101() throws CFException{      
   		return work.getTgt101();
	}

    public char[] getTgt101String() throws CFException {
          return  work.getTgt101().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt101 with the passed number
	 *	@param number
	 */
	public void setTgt101(BigDecimal number)  throws CFException{
		work.setTgt101(number);
   }

	public BigDecimal getTgt103() throws CFException{      
   		return work.getTgt103();
	}

    public char[] getTgt103String() throws CFException {
          return  work.getTgt103().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt103 with the passed number
	 *	@param number
	 */
	public void setTgt103(BigDecimal number)  throws CFException{
		work.setTgt103(number);
   }

	public BigDecimal getSrc103() throws CFException{      
   		return work.getSrc103();
	}

    public char[] getSrc103String() throws CFException {
          return  work.getSrc103().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src103 with the passed number
	 *	@param number
	 */
	public void setSrc103(BigDecimal number)  throws CFException{
		work.setSrc103(number);
   }

	/**
	 *	Returns the value of src99
	 *	@return src99
	 */
	public int getSrc99() throws CFException {        
   		return work.getSrc99();
	}
	
	/**
	 * 	Update Src99 with the passed value
	 *	@param number
	 */
	public void setSrc99(int number)  throws CFException{
		work.setSrc99(number);
	}


	public void setSrc99(long number)  throws CFException{
		work.setSrc99((int)number);
	}


	public BigDecimal getTgt99() throws CFException{      
   		return work.getTgt99();
	}

    public char[] getTgt99String() throws CFException {
          return  work.getTgt99().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt99 with the passed number
	 *	@param number
	 */
	public void setTgt99(BigDecimal number)  throws CFException{
		work.setTgt99(number);
   }

	public BigDecimal getTgt100() throws CFException{      
   		return work.getTgt100();
	}

    public char[] getTgt100String() throws CFException {
          return  work.getTgt100().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt100 with the passed number
	 *	@param number
	 */
	public void setTgt100(BigDecimal number)  throws CFException{
		work.setTgt100(number);
   }

	/**
	 *	Returns the value of src100
	 *	@return src100
	 */
	public int getSrc100() throws CFException {        
   		return work.getSrc100();
	}
	
	/**
	 * 	Update Src100 with the passed value
	 *	@param number
	 */
	public void setSrc100(int number)  throws CFException{
		work.setSrc100(number);
	}


	public void setSrc100(long number)  throws CFException{
		work.setSrc100((int)number);
	}


	/**
	 *	Returns the value of src102
	 *	@return src102
	 */
	public long getSrc102() throws CFException {        
   		return work.getSrc102();
	}
	
	/**
	 * 	Update Src102 with the passed value
	 *	@param number
	 */
	public void setSrc102(long number)  throws CFException{
		work.setSrc102(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process23Split89OutCtx clone() {
        Process23Split89OutCtx cloneObj = new Process23Split89OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process23Split89OutCtx getProcess23Split89OutCtx() {
            return new Process23Split89OutCtx();
    }
     public class Process24Split91InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	public BigDecimal getSrc103() throws CFException{      
   		return work.getSrc103();
	}

    public char[] getSrc103String() throws CFException {
          return  work.getSrc103().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src103 with the passed number
	 *	@param number
	 */
	public void setSrc103(BigDecimal number)  throws CFException{
		work.setSrc103(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process24Split91OutCtx getProcess24Split91OutCtx() {
            return new Process24Split91OutCtx();
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

    public Process24Split91InCtx clone() {
        Process24Split91InCtx cloneObj = new Process24Split91InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process24Split91InCtx getProcess24Split91InCtx() {
            return new Process24Split91InCtx();
    }
     public class Process24Split91OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	public BigDecimal getTgt104() throws CFException{      
   		return work.getTgt104();
	}

    public char[] getTgt104String() throws CFException {
          return  work.getTgt104().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt104 with the passed number
	 *	@param number
	 */
	public void setTgt104(BigDecimal number)  throws CFException{
		work.setTgt104(number);
   }

	public BigDecimal getTgt105() throws CFException{      
   		return work.getTgt105();
	}

    public char[] getTgt105String() throws CFException {
          return  work.getTgt105().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt105 with the passed number
	 *	@param number
	 */
	public void setTgt105(BigDecimal number)  throws CFException{
		work.setTgt105(number);
   }

	public BigDecimal getSrc104() throws CFException{      
   		return work.getSrc104();
	}

    public char[] getSrc104String() throws CFException {
          return  work.getSrc104().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src104 with the passed number
	 *	@param number
	 */
	public void setSrc104(BigDecimal number)  throws CFException{
		work.setSrc104(number);
   }

	public BigDecimal getTgt103() throws CFException{      
   		return work.getTgt103();
	}

    public char[] getTgt103String() throws CFException {
          return  work.getTgt103().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt103 with the passed number
	 *	@param number
	 */
	public void setTgt103(BigDecimal number)  throws CFException{
		work.setTgt103(number);
   }

	public BigDecimal getSrc103() throws CFException{      
   		return work.getSrc103();
	}

    public char[] getSrc103String() throws CFException {
          return  work.getSrc103().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src103 with the passed number
	 *	@param number
	 */
	public void setSrc103(BigDecimal number)  throws CFException{
		work.setSrc103(number);
   }

	public BigDecimal getTgt107() throws CFException{      
   		return work.getTgt107();
	}

    public char[] getTgt107String() throws CFException {
          return  work.getTgt107().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt107 with the passed number
	 *	@param number
	 */
	public void setTgt107(BigDecimal number)  throws CFException{
		work.setTgt107(number);
   }

	/**
	 *	Returns the value of src106
	 *	@return src106
	 */
	public BigDecimal getSrc106() throws CFException {
   		return work.getSrc106();
	}

    /**
	 *	Returns the String value of src106
	 *	@return src106
	 */
	public char[]  getSrc106ActualString()  throws CFException{
	    return work.getSrc106ActualString();
	}

	 /**
     *	Returns String value of src106
     *	@return src106
     */
    public char[]  getSrc106String() throws CFException {
         return work.getSrc106String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src106IsNumeric() {
        return work.src106IsNumeric();
    }
	/**
	 * 	Update Src106 with the passed number
	 *	@param number
	 */
	public void setSrc106(BigDecimal number)  throws CFException{
		work.setSrc106(number);
   }

	/**
	 * 	Update Src106 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc106(char[] value)  throws CFException{
		work.setSrc106(value);
	}   

	/**
	 *	Returns the value of src107
	 *	@return src107
	 */
	public BigDecimal getSrc107() throws CFException {
   		return work.getSrc107();
	}


	 /**
     *	Returns String value of src107
     *	@return src107
     */
    public char[]  getSrc107String() throws CFException {
         return work.getSrc107String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src107IsNumeric() {
        return work.src107IsNumeric();
    }
	/**
	 * 	Update Src107 with the passed number
	 *	@param number
	 */
	public void setSrc107(BigDecimal number)  throws CFException{
		work.setSrc107(number);
   }

	/**
	 * 	Update Src107 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc107(char[] value)  throws CFException{
		work.setSrc107(value);
	}   

	public BigDecimal getTgt106() throws CFException{      
   		return work.getTgt106();
	}

    public char[] getTgt106String() throws CFException {
          return  work.getTgt106().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt106 with the passed number
	 *	@param number
	 */
	public void setTgt106(BigDecimal number)  throws CFException{
		work.setTgt106(number);
   }

	/**
	 *	Returns the value of src105
	 *	@return src105
	 */
	public BigDecimal getSrc105() throws CFException {
   		return work.getSrc105();
	}

    /**
	 *	Returns the String value of src105
	 *	@return src105
	 */
	public char[]  getSrc105ActualString()  throws CFException{
	    return work.getSrc105ActualString();
	}

	 /**
     *	Returns String value of src105
     *	@return src105
     */
    public char[]  getSrc105String() throws CFException {
         return work.getSrc105String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src105IsNumeric() {
        return work.src105IsNumeric();
    }
	/**
	 * 	Update Src105 with the passed number
	 *	@param number
	 */
	public void setSrc105(BigDecimal number)  throws CFException{
		work.setSrc105(number);
   }

	/**
	 * 	Update Src105 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc105(char[] value)  throws CFException{
		work.setSrc105(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process24Split91OutCtx clone() {
        Process24Split91OutCtx cloneObj = new Process24Split91OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process24Split91OutCtx getProcess24Split91OutCtx() {
            return new Process24Split91OutCtx();
    }
     public class Process25Split93InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src107
	 *	@return src107
	 */
	public BigDecimal getSrc107() throws CFException {
   		return work.getSrc107();
	}


	 /**
     *	Returns String value of src107
     *	@return src107
     */
    public char[]  getSrc107String() throws CFException {
         return work.getSrc107String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src107IsNumeric() {
        return work.src107IsNumeric();
    }
	/**
	 * 	Update Src107 with the passed number
	 *	@param number
	 */
	public void setSrc107(BigDecimal number)  throws CFException{
		work.setSrc107(number);
   }

	/**
	 * 	Update Src107 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc107(char[] value)  throws CFException{
		work.setSrc107(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process25Split93OutCtx getProcess25Split93OutCtx() {
            return new Process25Split93OutCtx();
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

    public Process25Split93InCtx clone() {
        Process25Split93InCtx cloneObj = new Process25Split93InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process25Split93InCtx getProcess25Split93InCtx() {
            return new Process25Split93InCtx();
    }
     public class Process25Split93OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt111
	 *	@return tgt111
	 */
	public BigDecimal getTgt111() throws CFException {
   		return work.getTgt111();
	}


	 /**
     *	Returns String value of tgt111
     *	@return tgt111
     */
    public char[]  getTgt111String() throws CFException {
         return work.getTgt111String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt111IsNumeric() {
        return work.tgt111IsNumeric();
    }
	/**
	 * 	Update Tgt111 with the passed number
	 *	@param number
	 */
	public void setTgt111(BigDecimal number)  throws CFException{
		work.setTgt111(number);
   }

	/**
	 * 	Update Tgt111 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt111(char[] value)  throws CFException{
		work.setTgt111(value);
	}   

	public BigDecimal getTgt110() throws CFException{      
   		return work.getTgt110();
	}

    public char[] getTgt110String() throws CFException {
          return  work.getTgt110().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt110 with the passed number
	 *	@param number
	 */
	public void setTgt110(BigDecimal number)  throws CFException{
		work.setTgt110(number);
   }

	public BigDecimal getTgt107() throws CFException{      
   		return work.getTgt107();
	}

    public char[] getTgt107String() throws CFException {
          return  work.getTgt107().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt107 with the passed number
	 *	@param number
	 */
	public void setTgt107(BigDecimal number)  throws CFException{
		work.setTgt107(number);
   }

	/**
	 *	Returns the value of src108
	 *	@return src108
	 */
	public BigDecimal getSrc108() throws CFException {
   		return work.getSrc108();
	}


	 /**
     *	Returns String value of src108
     *	@return src108
     */
    public char[]  getSrc108String() throws CFException {
         return work.getSrc108String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src108IsNumeric() {
        return work.src108IsNumeric();
    }
	/**
	 * 	Update Src108 with the passed number
	 *	@param number
	 */
	public void setSrc108(BigDecimal number)  throws CFException{
		work.setSrc108(number);
   }

	/**
	 * 	Update Src108 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc108(char[] value)  throws CFException{
		work.setSrc108(value);
	}   

	public BigDecimal getTgt109() throws CFException{      
   		return work.getTgt109();
	}

    public char[] getTgt109String() throws CFException {
          return  work.getTgt109().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt109 with the passed number
	 *	@param number
	 */
	public void setTgt109(BigDecimal number)  throws CFException{
		work.setTgt109(number);
   }

	/**
	 *	Returns the value of src110
	 *	@return src110
	 */
	public BigDecimal getSrc110() throws CFException {
   		return work.getSrc110();
	}


	 /**
     *	Returns String value of src110
     *	@return src110
     */
    public char[]  getSrc110String() throws CFException {
         return work.getSrc110String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src110IsNumeric() {
        return work.src110IsNumeric();
    }
	/**
	 * 	Update Src110 with the passed number
	 *	@param number
	 */
	public void setSrc110(BigDecimal number)  throws CFException{
		work.setSrc110(number);
   }

	/**
	 * 	Update Src110 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc110(char[] value)  throws CFException{
		work.setSrc110(value);
	}   

	/**
	 *	Returns the value of src109
	 *	@return src109
	 */
	public BigDecimal getSrc109() throws CFException {
   		return work.getSrc109();
	}


	 /**
     *	Returns String value of src109
     *	@return src109
     */
    public char[]  getSrc109String() throws CFException {
         return work.getSrc109String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src109IsNumeric() {
        return work.src109IsNumeric();
    }
	/**
	 * 	Update Src109 with the passed number
	 *	@param number
	 */
	public void setSrc109(BigDecimal number)  throws CFException{
		work.setSrc109(number);
   }

	/**
	 * 	Update Src109 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc109(char[] value)  throws CFException{
		work.setSrc109(value);
	}   

	public BigDecimal getTgt108() throws CFException{      
   		return work.getTgt108();
	}

    public char[] getTgt108String() throws CFException {
          return  work.getTgt108().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt108 with the passed number
	 *	@param number
	 */
	public void setTgt108(BigDecimal number)  throws CFException{
		work.setTgt108(number);
   }

	public BigDecimal getSrc111() throws CFException{      
   		return work.getSrc111();
	}

    public char[] getSrc111String() throws CFException {
          return  work.getSrc111().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src111 with the passed number
	 *	@param number
	 */
	public void setSrc111(BigDecimal number)  throws CFException{
		work.setSrc111(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process25Split93OutCtx clone() {
        Process25Split93OutCtx cloneObj = new Process25Split93OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process25Split93OutCtx getProcess25Split93OutCtx() {
            return new Process25Split93OutCtx();
    }
     public class Process26Split95InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process26Split95OutCtx getProcess26Split95OutCtx() {
            return new Process26Split95OutCtx();
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

    public Process26Split95InCtx clone() {
        Process26Split95InCtx cloneObj = new Process26Split95InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process26Split95InCtx getProcess26Split95InCtx() {
            return new Process26Split95InCtx();
    }
     public class Process26Split95OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	public BigDecimal getSrc114() throws CFException{      
   		return work.getSrc114();
	}

    public char[] getSrc114String() throws CFException {
          return  work.getSrc114().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src114 with the passed number
	 *	@param number
	 */
	public void setSrc114(BigDecimal number)  throws CFException{
		work.setSrc114(number);
   }

	public BigDecimal getSrc116() throws CFException{      
   		return work.getSrc116();
	}

    public char[] getSrc116String() throws CFException {
          return  work.getSrc116().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src116 with the passed number
	 *	@param number
	 */
	public void setSrc116(BigDecimal number)  throws CFException{
		work.setSrc116(number);
   }

	public BigDecimal getSrc112() throws CFException{      
   		return work.getSrc112();
	}

    public char[] getSrc112String() throws CFException {
          return  work.getSrc112().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src112 with the passed number
	 *	@param number
	 */
	public void setSrc112(BigDecimal number)  throws CFException{
		work.setSrc112(number);
   }

	public BigDecimal getSrc113() throws CFException{      
   		return work.getSrc113();
	}

    public char[] getSrc113String() throws CFException {
          return  work.getSrc113().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src113 with the passed number
	 *	@param number
	 */
	public void setSrc113(BigDecimal number)  throws CFException{
		work.setSrc113(number);
   }

	/**
	 *	Returns the value of tgt112
	 *	@return tgt112
	 */
	public BigDecimal getTgt112() throws CFException {
   		return work.getTgt112();
	}


	 /**
     *	Returns String value of tgt112
     *	@return tgt112
     */
    public char[]  getTgt112String() throws CFException {
         return work.getTgt112String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt112IsNumeric() {
        return work.tgt112IsNumeric();
    }
	/**
	 * 	Update Tgt112 with the passed number
	 *	@param number
	 */
	public void setTgt112(BigDecimal number)  throws CFException{
		work.setTgt112(number);
   }

	/**
	 * 	Update Tgt112 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt112(char[] value)  throws CFException{
		work.setTgt112(value);
	}   

	/**
	 *	Returns the value of tgt113
	 *	@return tgt113
	 */
	public BigDecimal getTgt113() throws CFException {
   		return work.getTgt113();
	}

    /**
	 *	Returns the String value of tgt113
	 *	@return tgt113
	 */
	public char[]  getTgt113ActualString()  throws CFException{
	    return work.getTgt113ActualString();
	}

	 /**
     *	Returns String value of tgt113
     *	@return tgt113
     */
    public char[]  getTgt113String() throws CFException {
         return work.getTgt113String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt113IsNumeric() {
        return work.tgt113IsNumeric();
    }
	/**
	 * 	Update Tgt113 with the passed number
	 *	@param number
	 */
	public void setTgt113(BigDecimal number)  throws CFException{
		work.setTgt113(number);
   }

	/**
	 * 	Update Tgt113 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt113(char[] value)  throws CFException{
		work.setTgt113(value);
	}   

	/**
	 *	Returns the value of tgt114
	 *	@return tgt114
	 */
	public BigDecimal getTgt114() throws CFException {
   		return work.getTgt114();
	}

    /**
	 *	Returns the String value of tgt114
	 *	@return tgt114
	 */
	public char[]  getTgt114ActualString()  throws CFException{
	    return work.getTgt114ActualString();
	}

	 /**
     *	Returns String value of tgt114
     *	@return tgt114
     */
    public char[]  getTgt114String() throws CFException {
         return work.getTgt114String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt114IsNumeric() {
        return work.tgt114IsNumeric();
    }
	/**
	 * 	Update Tgt114 with the passed number
	 *	@param number
	 */
	public void setTgt114(BigDecimal number)  throws CFException{
		work.setTgt114(number);
   }

	/**
	 * 	Update Tgt114 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt114(char[] value)  throws CFException{
		work.setTgt114(value);
	}   

	public BigDecimal getSrc115() throws CFException{      
   		return work.getSrc115();
	}

    public char[] getSrc115String() throws CFException {
          return  work.getSrc115().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src115 with the passed number
	 *	@param number
	 */
	public void setSrc115(BigDecimal number)  throws CFException{
		work.setSrc115(number);
   }

	/**
	 *	Returns the value of tgt115
	 *	@return tgt115
	 */
	public BigDecimal getTgt115() throws CFException {
   		return work.getTgt115();
	}


	 /**
     *	Returns String value of tgt115
     *	@return tgt115
     */
    public char[]  getTgt115String() throws CFException {
         return work.getTgt115String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt115IsNumeric() {
        return work.tgt115IsNumeric();
    }
	/**
	 * 	Update Tgt115 with the passed number
	 *	@param number
	 */
	public void setTgt115(BigDecimal number)  throws CFException{
		work.setTgt115(number);
   }

	/**
	 * 	Update Tgt115 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt115(char[] value)  throws CFException{
		work.setTgt115(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process26Split95OutCtx clone() {
        Process26Split95OutCtx cloneObj = new Process26Split95OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process26Split95OutCtx getProcess26Split95OutCtx() {
            return new Process26Split95OutCtx();
    }
     public class Process27Split97InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	public BigDecimal getSrc116() throws CFException{      
   		return work.getSrc116();
	}

    public char[] getSrc116String() throws CFException {
          return  work.getSrc116().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src116 with the passed number
	 *	@param number
	 */
	public void setSrc116(BigDecimal number)  throws CFException{
		work.setSrc116(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process27Split97OutCtx getProcess27Split97OutCtx() {
            return new Process27Split97OutCtx();
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

    public Process27Split97InCtx clone() {
        Process27Split97InCtx cloneObj = new Process27Split97InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process27Split97InCtx getProcess27Split97InCtx() {
            return new Process27Split97InCtx();
    }
     public class Process27Split97OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src117
	 *	@return src117
	 */
	public BigDecimal getSrc117() throws CFException {
   		return work.getSrc117();
	}

    /**
	 *	Returns the String value of src117
	 *	@return src117
	 */
	public char[]  getSrc117ActualString()  throws CFException{
	    return work.getSrc117ActualString();
	}

	 /**
     *	Returns String value of src117
     *	@return src117
     */
    public char[]  getSrc117String() throws CFException {
         return work.getSrc117String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src117IsNumeric() {
        return work.src117IsNumeric();
    }
	/**
	 * 	Update Src117 with the passed number
	 *	@param number
	 */
	public void setSrc117(BigDecimal number)  throws CFException{
		work.setSrc117(number);
   }

	/**
	 * 	Update Src117 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc117(char[] value)  throws CFException{
		work.setSrc117(value);
	}   

	/**
	 *	Returns the value of src120
	 *	@return src120
	 */
	public BigDecimal getSrc120() throws CFException {
   		return work.getSrc120();
	}


	 /**
     *	Returns String value of src120
     *	@return src120
     */
    public char[]  getSrc120String() throws CFException {
         return work.getSrc120String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src120IsNumeric() {
        return work.src120IsNumeric();
    }
	/**
	 * 	Update Src120 with the passed number
	 *	@param number
	 */
	public void setSrc120(BigDecimal number)  throws CFException{
		work.setSrc120(number);
   }

	/**
	 * 	Update Src120 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc120(char[] value)  throws CFException{
		work.setSrc120(value);
	}   

	public BigDecimal getSrc116() throws CFException{      
   		return work.getSrc116();
	}

    public char[] getSrc116String() throws CFException {
          return  work.getSrc116().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src116 with the passed number
	 *	@param number
	 */
	public void setSrc116(BigDecimal number)  throws CFException{
		work.setSrc116(number);
   }

	/**
	 *	Returns the value of tgt120
	 *	@return tgt120
	 */
	public BigDecimal getTgt120() throws CFException {
   		return work.getTgt120();
	}

    /**
	 *	Returns the String value of tgt120
	 *	@return tgt120
	 */
	public char[]  getTgt120ActualString()  throws CFException{
	    return work.getTgt120ActualString();
	}

	 /**
     *	Returns String value of tgt120
     *	@return tgt120
     */
    public char[]  getTgt120String() throws CFException {
         return work.getTgt120String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt120IsNumeric() {
        return work.tgt120IsNumeric();
    }
	/**
	 * 	Update Tgt120 with the passed number
	 *	@param number
	 */
	public void setTgt120(BigDecimal number)  throws CFException{
		work.setTgt120(number);
   }

	/**
	 * 	Update Tgt120 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt120(char[] value)  throws CFException{
		work.setTgt120(value);
	}   

	/**
	 *	Returns the value of tgt118
	 *	@return tgt118
	 */
	public BigDecimal getTgt118() throws CFException {
   		return work.getTgt118();
	}


	 /**
     *	Returns String value of tgt118
     *	@return tgt118
     */
    public char[]  getTgt118String() throws CFException {
         return work.getTgt118String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt118IsNumeric() {
        return work.tgt118IsNumeric();
    }
	/**
	 * 	Update Tgt118 with the passed number
	 *	@param number
	 */
	public void setTgt118(BigDecimal number)  throws CFException{
		work.setTgt118(number);
   }

	/**
	 * 	Update Tgt118 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt118(char[] value)  throws CFException{
		work.setTgt118(value);
	}   

	/**
	 *	Returns the value of src118
	 *	@return src118
	 */
	public BigDecimal getSrc118() throws CFException {
   		return work.getSrc118();
	}

    /**
	 *	Returns the String value of src118
	 *	@return src118
	 */
	public char[]  getSrc118ActualString()  throws CFException{
	    return work.getSrc118ActualString();
	}

	 /**
     *	Returns String value of src118
     *	@return src118
     */
    public char[]  getSrc118String() throws CFException {
         return work.getSrc118String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src118IsNumeric() {
        return work.src118IsNumeric();
    }
	/**
	 * 	Update Src118 with the passed number
	 *	@param number
	 */
	public void setSrc118(BigDecimal number)  throws CFException{
		work.setSrc118(number);
   }

	/**
	 * 	Update Src118 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc118(char[] value)  throws CFException{
		work.setSrc118(value);
	}   

	/**
	 *	Returns the value of tgt117
	 *	@return tgt117
	 */
	public BigDecimal getTgt117() throws CFException {
   		return work.getTgt117();
	}


	 /**
     *	Returns String value of tgt117
     *	@return tgt117
     */
    public char[]  getTgt117String() throws CFException {
         return work.getTgt117String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt117IsNumeric() {
        return work.tgt117IsNumeric();
    }
	/**
	 * 	Update Tgt117 with the passed number
	 *	@param number
	 */
	public void setTgt117(BigDecimal number)  throws CFException{
		work.setTgt117(number);
   }

	/**
	 * 	Update Tgt117 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt117(char[] value)  throws CFException{
		work.setTgt117(value);
	}   

	/**
	 *	Returns the value of tgt116
	 *	@return tgt116
	 */
	public BigDecimal getTgt116() throws CFException {
   		return work.getTgt116();
	}


	 /**
     *	Returns String value of tgt116
     *	@return tgt116
     */
    public char[]  getTgt116String() throws CFException {
         return work.getTgt116String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt116IsNumeric() {
        return work.tgt116IsNumeric();
    }
	/**
	 * 	Update Tgt116 with the passed number
	 *	@param number
	 */
	public void setTgt116(BigDecimal number)  throws CFException{
		work.setTgt116(number);
   }

	/**
	 * 	Update Tgt116 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt116(char[] value)  throws CFException{
		work.setTgt116(value);
	}   

	/**
	 *	Returns the value of tgt119
	 *	@return tgt119
	 */
	public BigDecimal getTgt119() throws CFException {
   		return work.getTgt119();
	}

    /**
	 *	Returns the String value of tgt119
	 *	@return tgt119
	 */
	public char[]  getTgt119ActualString()  throws CFException{
	    return work.getTgt119ActualString();
	}

	 /**
     *	Returns String value of tgt119
     *	@return tgt119
     */
    public char[]  getTgt119String() throws CFException {
         return work.getTgt119String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt119IsNumeric() {
        return work.tgt119IsNumeric();
    }
	/**
	 * 	Update Tgt119 with the passed number
	 *	@param number
	 */
	public void setTgt119(BigDecimal number)  throws CFException{
		work.setTgt119(number);
   }

	/**
	 * 	Update Tgt119 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt119(char[] value)  throws CFException{
		work.setTgt119(value);
	}   

	/**
	 *	Returns the value of src119
	 *	@return src119
	 */
	public BigDecimal getSrc119() throws CFException {
   		return work.getSrc119();
	}


	 /**
     *	Returns String value of src119
     *	@return src119
     */
    public char[]  getSrc119String() throws CFException {
         return work.getSrc119String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src119IsNumeric() {
        return work.src119IsNumeric();
    }
	/**
	 * 	Update Src119 with the passed number
	 *	@param number
	 */
	public void setSrc119(BigDecimal number)  throws CFException{
		work.setSrc119(number);
   }

	/**
	 * 	Update Src119 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc119(char[] value)  throws CFException{
		work.setSrc119(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process27Split97OutCtx clone() {
        Process27Split97OutCtx cloneObj = new Process27Split97OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process27Split97OutCtx getProcess27Split97OutCtx() {
            return new Process27Split97OutCtx();
    }
     public class Process28Split99InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src120
	 *	@return src120
	 */
	public BigDecimal getSrc120() throws CFException {
   		return work.getSrc120();
	}


	 /**
     *	Returns String value of src120
     *	@return src120
     */
    public char[]  getSrc120String() throws CFException {
         return work.getSrc120String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src120IsNumeric() {
        return work.src120IsNumeric();
    }
	/**
	 * 	Update Src120 with the passed number
	 *	@param number
	 */
	public void setSrc120(BigDecimal number)  throws CFException{
		work.setSrc120(number);
   }

	/**
	 * 	Update Src120 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc120(char[] value)  throws CFException{
		work.setSrc120(value);
	}   

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process28Split99OutCtx getProcess28Split99OutCtx() {
            return new Process28Split99OutCtx();
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

    public Process28Split99InCtx clone() {
        Process28Split99InCtx cloneObj = new Process28Split99InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process28Split99InCtx getProcess28Split99InCtx() {
            return new Process28Split99InCtx();
    }
     public class Process28Split99OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src120
	 *	@return src120
	 */
	public BigDecimal getSrc120() throws CFException {
   		return work.getSrc120();
	}


	 /**
     *	Returns String value of src120
     *	@return src120
     */
    public char[]  getSrc120String() throws CFException {
         return work.getSrc120String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src120IsNumeric() {
        return work.src120IsNumeric();
    }
	/**
	 * 	Update Src120 with the passed number
	 *	@param number
	 */
	public void setSrc120(BigDecimal number)  throws CFException{
		work.setSrc120(number);
   }

	/**
	 * 	Update Src120 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc120(char[] value)  throws CFException{
		work.setSrc120(value);
	}   

	/**
	 *	Returns the value of tgt123
	 *	@return tgt123
	 */
	public long getTgt123() throws CFException {
   		return work.getTgt123();
	}


	/**
	 *	Returns String value of tgt123
	 *	@return tgt123
	 */
	public char[]  getTgt123String() throws CFException {
	     return String.valueOf(work.getTgt123String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt123IsNumeric()  throws CFException{
	    return work.tgt123IsNumeric();
	}

	/**
	 * 	Update Tgt123 with the passed value
	 *	@param number
	 */
	public void setTgt123(long number)  throws CFException{
		work.setTgt123(number);
	}
	

	
	/**
	 * 	Update Tgt123 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt123(char[] value)  throws CFException {
		work.setTgt123(value);
	}
	
	/**
	 * 	Update Tgt123 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt123String(char[] value)  throws CFException{
		work.setTgt123(value);
	}	

	/**
	 *	Returns the value of tgt121
	 *	@return tgt121
	 */
	public BigDecimal getTgt121() throws CFException {
   		return work.getTgt121();
	}


	 /**
     *	Returns String value of tgt121
     *	@return tgt121
     */
    public char[]  getTgt121String() throws CFException {
         return work.getTgt121String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt121IsNumeric() {
        return work.tgt121IsNumeric();
    }
	/**
	 * 	Update Tgt121 with the passed number
	 *	@param number
	 */
	public void setTgt121(BigDecimal number)  throws CFException{
		work.setTgt121(number);
   }

	/**
	 * 	Update Tgt121 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt121(char[] value)  throws CFException{
		work.setTgt121(value);
	}   

	/**
	 *	Returns the value of src121
	 *	@return src121
	 */
	public BigDecimal getSrc121() throws CFException {
   		return work.getSrc121();
	}


	 /**
     *	Returns String value of src121
     *	@return src121
     */
    public char[]  getSrc121String() throws CFException {
         return work.getSrc121String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src121IsNumeric() {
        return work.src121IsNumeric();
    }
	/**
	 * 	Update Src121 with the passed number
	 *	@param number
	 */
	public void setSrc121(BigDecimal number)  throws CFException{
		work.setSrc121(number);
   }

	/**
	 * 	Update Src121 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc121(char[] value)  throws CFException{
		work.setSrc121(value);
	}   

	/**
	 *	Returns the value of tgt124
	 *	@return tgt124
	 */
	public long getTgt124() throws CFException {
   		return work.getTgt124();
	}


	/**
	 *	Returns String value of tgt124
	 *	@return tgt124
	 */
	public char[]  getTgt124String() throws CFException {
	     return String.valueOf(work.getTgt124String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt124IsNumeric()  throws CFException{
	    return work.tgt124IsNumeric();
	}

	/**
	 * 	Update Tgt124 with the passed value
	 *	@param number
	 */
	public void setTgt124(long number)  throws CFException{
		work.setTgt124(number);
	}
	

	
	/**
	 * 	Update Tgt124 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt124(char[] value)  throws CFException {
		work.setTgt124(value);
	}
	
	/**
	 * 	Update Tgt124 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt124String(char[] value)  throws CFException{
		work.setTgt124(value);
	}	

	/**
	 *	Returns the value of tgt122
	 *	@return tgt122
	 */
	public BigDecimal getTgt122() throws CFException {
   		return work.getTgt122();
	}


	 /**
     *	Returns String value of tgt122
     *	@return tgt122
     */
    public char[]  getTgt122String() throws CFException {
         return work.getTgt122String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt122IsNumeric() {
        return work.tgt122IsNumeric();
    }
	/**
	 * 	Update Tgt122 with the passed number
	 *	@param number
	 */
	public void setTgt122(BigDecimal number)  throws CFException{
		work.setTgt122(number);
   }

	/**
	 * 	Update Tgt122 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt122(char[] value)  throws CFException{
		work.setTgt122(value);
	}   

	/**
	 *	Returns the value of tgt120
	 *	@return tgt120
	 */
	public BigDecimal getTgt120() throws CFException {
   		return work.getTgt120();
	}

    /**
	 *	Returns the String value of tgt120
	 *	@return tgt120
	 */
	public char[]  getTgt120ActualString()  throws CFException{
	    return work.getTgt120ActualString();
	}

	 /**
     *	Returns String value of tgt120
     *	@return tgt120
     */
    public char[]  getTgt120String() throws CFException {
         return work.getTgt120String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt120IsNumeric() {
        return work.tgt120IsNumeric();
    }
	/**
	 * 	Update Tgt120 with the passed number
	 *	@param number
	 */
	public void setTgt120(BigDecimal number)  throws CFException{
		work.setTgt120(number);
   }

	/**
	 * 	Update Tgt120 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt120(char[] value)  throws CFException{
		work.setTgt120(value);
	}   

	/**
	 *	Returns the value of src123
	 *	@return src123
	 */
	public int getSrc123() throws CFException {        
   		return work.getSrc123();
	}
	
	/**
	 * 	Update Src123 with the passed value
	 *	@param number
	 */
	public void setSrc123(int number)  throws CFException{
		work.setSrc123(number);
	}


	public void setSrc123(long number)  throws CFException{
		work.setSrc123((int)number);
	}


	/**
	 *	Returns the value of src122
	 *	@return src122
	 */
	public BigDecimal getSrc122() throws CFException {
   		return work.getSrc122();
	}


	 /**
     *	Returns String value of src122
     *	@return src122
     */
    public char[]  getSrc122String() throws CFException {
         return work.getSrc122String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src122IsNumeric() {
        return work.src122IsNumeric();
    }
	/**
	 * 	Update Src122 with the passed number
	 *	@param number
	 */
	public void setSrc122(BigDecimal number)  throws CFException{
		work.setSrc122(number);
   }

	/**
	 * 	Update Src122 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc122(char[] value)  throws CFException{
		work.setSrc122(value);
	}   

	/**
	 *	Returns the value of src124
	 *	@return src124
	 */
	public long getSrc124() throws CFException {        
   		return work.getSrc124();
	}
	
	/**
	 * 	Update Src124 with the passed value
	 *	@param number
	 */
	public void setSrc124(long number)  throws CFException{
		work.setSrc124(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process28Split99OutCtx clone() {
        Process28Split99OutCtx cloneObj = new Process28Split99OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process28Split99OutCtx getProcess28Split99OutCtx() {
            return new Process28Split99OutCtx();
    }
     public class Process29Split101InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src124
	 *	@return src124
	 */
	public long getSrc124() throws CFException {        
   		return work.getSrc124();
	}
	
	/**
	 * 	Update Src124 with the passed value
	 *	@param number
	 */
	public void setSrc124(long number)  throws CFException{
		work.setSrc124(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process29Split101OutCtx getProcess29Split101OutCtx() {
            return new Process29Split101OutCtx();
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

    public Process29Split101InCtx clone() {
        Process29Split101InCtx cloneObj = new Process29Split101InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process29Split101InCtx getProcess29Split101InCtx() {
            return new Process29Split101InCtx();
    }
     public class Process29Split101OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src125
	 *	@return src125
	 */
	public long getSrc125() throws CFException {        
   		return work.getSrc125();
	}
	
	/**
	 * 	Update Src125 with the passed value
	 *	@param number
	 */
	public void setSrc125(long number)  throws CFException{
		work.setSrc125(number);
	}



	/**
	 *	Returns the value of src127
	 *	@return src127
	 */
	public short getSrc127() throws CFException {        
   		return work.getSrc127();
	}
	
	/**
	 * 	Update Src127 with the passed value
	 *	@param number
	 */
	public void setSrc127(short number)  throws CFException{
		work.setSrc127(number);
	}

	public void setSrc127(int number)  throws CFException{
		work.setSrc127((short)number);
	}

	public void setSrc127(long number)  throws CFException{
		work.setSrc127((short)number);
	}



	/**
	 *	Returns the value of tgt124
	 *	@return tgt124
	 */
	public long getTgt124() throws CFException {
   		return work.getTgt124();
	}


	/**
	 *	Returns String value of tgt124
	 *	@return tgt124
	 */
	public char[]  getTgt124String() throws CFException {
	     return String.valueOf(work.getTgt124String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt124IsNumeric()  throws CFException{
	    return work.tgt124IsNumeric();
	}

	/**
	 * 	Update Tgt124 with the passed value
	 *	@param number
	 */
	public void setTgt124(long number)  throws CFException{
		work.setTgt124(number);
	}
	

	
	/**
	 * 	Update Tgt124 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt124(char[] value)  throws CFException {
		work.setTgt124(value);
	}
	
	/**
	 * 	Update Tgt124 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt124String(char[] value)  throws CFException{
		work.setTgt124(value);
	}	

	/**
	 *	Returns the value of tgt125
	 *	@return tgt125
	 */
	public long getTgt125() throws CFException {
   		return work.getTgt125();
	}


	/**
	 *	Returns String value of tgt125
	 *	@return tgt125
	 */
	public char[]  getTgt125String() throws CFException {
	     return String.valueOf(work.getTgt125String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt125IsNumeric()  throws CFException{
	    return work.tgt125IsNumeric();
	}

	/**
	 * 	Update Tgt125 with the passed value
	 *	@param number
	 */
	public void setTgt125(long number)  throws CFException{
		work.setTgt125(number);
	}
	

	
	/**
	 * 	Update Tgt125 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt125(char[] value)  throws CFException {
		work.setTgt125(value);
	}
	
	/**
	 * 	Update Tgt125 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt125String(char[] value)  throws CFException{
		work.setTgt125(value);
	}	

	/**
	 *	Returns the value of src126
	 *	@return src126
	 */
	public long getSrc126() throws CFException {        
   		return work.getSrc126();
	}
	
	/**
	 * 	Update Src126 with the passed value
	 *	@param number
	 */
	public void setSrc126(long number)  throws CFException{
		work.setSrc126(number);
	}



	/**
	 *	Returns the value of tgt126
	 *	@return tgt126
	 */
	public long getTgt126() throws CFException {
   		return work.getTgt126();
	}


	/**
	 *	Returns String value of tgt126
	 *	@return tgt126
	 */
	public char[]  getTgt126String() throws CFException {
	     return String.valueOf(work.getTgt126String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt126IsNumeric()  throws CFException{
	    return work.tgt126IsNumeric();
	}

	/**
	 * 	Update Tgt126 with the passed value
	 *	@param number
	 */
	public void setTgt126(long number)  throws CFException{
		work.setTgt126(number);
	}
	

	
	/**
	 * 	Update Tgt126 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt126(char[] value)  throws CFException {
		work.setTgt126(value);
	}
	
	/**
	 * 	Update Tgt126 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt126String(char[] value)  throws CFException{
		work.setTgt126(value);
	}	

	/**
	 *	Returns the value of src128
	 *	@return src128
	 */
	public int getSrc128() throws CFException {        
   		return work.getSrc128();
	}
	
	/**
	 * 	Update Src128 with the passed value
	 *	@param number
	 */
	public void setSrc128(int number)  throws CFException{
		work.setSrc128(number);
	}


	public void setSrc128(long number)  throws CFException{
		work.setSrc128((int)number);
	}


	/**
	 *	Returns the value of tgt127
	 *	@return tgt127
	 */
	public long getTgt127() throws CFException {
   		return work.getTgt127();
	}


	/**
	 *	Returns String value of tgt127
	 *	@return tgt127
	 */
	public char[]  getTgt127String() throws CFException {
	     return String.valueOf(work.getTgt127String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt127IsNumeric()  throws CFException{
	    return work.tgt127IsNumeric();
	}

	/**
	 * 	Update Tgt127 with the passed value
	 *	@param number
	 */
	public void setTgt127(long number)  throws CFException{
		work.setTgt127(number);
	}
	

	
	/**
	 * 	Update Tgt127 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt127(char[] value)  throws CFException {
		work.setTgt127(value);
	}
	
	/**
	 * 	Update Tgt127 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt127String(char[] value)  throws CFException{
		work.setTgt127(value);
	}	

	/**
	 *	Returns the value of tgt128
	 *	@return tgt128
	 */
	public long getTgt128() throws CFException {
   		return work.getTgt128();
	}


	/**
	 *	Returns String value of tgt128
	 *	@return tgt128
	 */
	public char[]  getTgt128String() throws CFException {
	     return String.valueOf(work.getTgt128String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt128IsNumeric()  throws CFException{
	    return work.tgt128IsNumeric();
	}

	/**
	 * 	Update Tgt128 with the passed value
	 *	@param number
	 */
	public void setTgt128(long number)  throws CFException{
		work.setTgt128(number);
	}
	

	
	/**
	 * 	Update Tgt128 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt128(char[] value)  throws CFException {
		work.setTgt128(value);
	}
	
	/**
	 * 	Update Tgt128 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt128String(char[] value)  throws CFException{
		work.setTgt128(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process29Split101OutCtx clone() {
        Process29Split101OutCtx cloneObj = new Process29Split101OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process29Split101OutCtx getProcess29Split101OutCtx() {
            return new Process29Split101OutCtx();
    }
     public class Process30Split103InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process30Split103OutCtx getProcess30Split103OutCtx() {
            return new Process30Split103OutCtx();
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

    public Process30Split103InCtx clone() {
        Process30Split103InCtx cloneObj = new Process30Split103InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process30Split103InCtx getProcess30Split103InCtx() {
            return new Process30Split103InCtx();
    }
     public class Process30Split103OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src130
	 *	@return src130
	 */
	public int getSrc130() throws CFException {
   		return work.getSrc130();
	}

    /**
	 *	Returns the String value of src130
	 *	@return src130
	 */
	public char[]  getSrc130ActualString() {
		return work.getSrc130ActualString();
	}

	/**
	 *	Returns String value of src130
	 *	@return src130
	 */
	public char[]  getSrc130String() throws CFException {
	     return String.valueOf(work.getSrc130String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src130IsNumeric()  throws CFException{
	    return work.src130IsNumeric();
	}

	/**
	 * 	Update Src130 with the passed value
	 *	@param number
	 */
	public void setSrc130(int number)  throws CFException{
		work.setSrc130(number);
	}
	

	public void setSrc130(long number)  throws CFException{
	    work.setSrc130(number);
	}
	
	
	/**
	 * 	Update Src130 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc130(char[] value)  throws CFException {
		work.setSrc130(value);
	}
	
	/**
	 * 	Update Src130 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc130String(char[] value)  throws CFException{
		work.setSrc130(value);
	}	

	/**
	 *	Returns the value of tgt131
	 *	@return tgt131
	 */
	public int getTgt131() throws CFException {        
   		return work.getTgt131();
	}
	
	/**
	 * 	Update Tgt131 with the passed value
	 *	@param number
	 */
	public void setTgt131(int number)  throws CFException{
		work.setTgt131(number);
	}


	public void setTgt131(long number)  throws CFException{
		work.setTgt131((int)number);
	}


	/**
	 *	Returns the value of tgt130
	 *	@return tgt130
	 */
	public long getTgt130() throws CFException {
   		return work.getTgt130();
	}


	/**
	 *	Returns String value of tgt130
	 *	@return tgt130
	 */
	public char[]  getTgt130String() throws CFException {
	     return String.valueOf(work.getTgt130String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt130IsNumeric()  throws CFException{
	    return work.tgt130IsNumeric();
	}

	/**
	 * 	Update Tgt130 with the passed value
	 *	@param number
	 */
	public void setTgt130(long number)  throws CFException{
		work.setTgt130(number);
	}
	

	
	/**
	 * 	Update Tgt130 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt130(char[] value)  throws CFException {
		work.setTgt130(value);
	}
	
	/**
	 * 	Update Tgt130 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt130String(char[] value)  throws CFException{
		work.setTgt130(value);
	}	

	/**
	 *	Returns the value of src132
	 *	@return src132
	 */
	public long getSrc132() throws CFException {
   		return work.getSrc132();
	}


	/**
	 *	Returns String value of src132
	 *	@return src132
	 */
	public char[]  getSrc132String() throws CFException {
	     return String.valueOf(work.getSrc132String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src132IsNumeric()  throws CFException{
	    return work.src132IsNumeric();
	}

	/**
	 * 	Update Src132 with the passed value
	 *	@param number
	 */
	public void setSrc132(long number)  throws CFException{
		work.setSrc132(number);
	}
	

	
	/**
	 * 	Update Src132 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc132(char[] value)  throws CFException {
		work.setSrc132(value);
	}
	
	/**
	 * 	Update Src132 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc132String(char[] value)  throws CFException{
		work.setSrc132(value);
	}	

	/**
	 *	Returns the value of tgt129
	 *	@return tgt129
	 */
	public long getTgt129() throws CFException {
   		return work.getTgt129();
	}


	/**
	 *	Returns String value of tgt129
	 *	@return tgt129
	 */
	public char[]  getTgt129String() throws CFException {
	     return String.valueOf(work.getTgt129String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt129IsNumeric()  throws CFException{
	    return work.tgt129IsNumeric();
	}

	/**
	 * 	Update Tgt129 with the passed value
	 *	@param number
	 */
	public void setTgt129(long number)  throws CFException{
		work.setTgt129(number);
	}
	

	
	/**
	 * 	Update Tgt129 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt129(char[] value)  throws CFException {
		work.setTgt129(value);
	}
	
	/**
	 * 	Update Tgt129 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt129String(char[] value)  throws CFException{
		work.setTgt129(value);
	}	

	/**
	 *	Returns the value of tgt132
	 *	@return tgt132
	 */
	public long getTgt132() throws CFException {        
   		return work.getTgt132();
	}
	
	/**
	 * 	Update Tgt132 with the passed value
	 *	@param number
	 */
	public void setTgt132(long number)  throws CFException{
		work.setTgt132(number);
	}



	/**
	 *	Returns the value of src133
	 *	@return src133
	 */
	public long getSrc133() throws CFException {
   		return work.getSrc133();
	}


	/**
	 *	Returns String value of src133
	 *	@return src133
	 */
	public char[]  getSrc133String() throws CFException {
	     return String.valueOf(work.getSrc133String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src133IsNumeric()  throws CFException{
	    return work.src133IsNumeric();
	}

	/**
	 * 	Update Src133 with the passed value
	 *	@param number
	 */
	public void setSrc133(long number)  throws CFException{
		work.setSrc133(number);
	}
	

	
	/**
	 * 	Update Src133 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc133(char[] value)  throws CFException {
		work.setSrc133(value);
	}
	
	/**
	 * 	Update Src133 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc133String(char[] value)  throws CFException{
		work.setSrc133(value);
	}	

	/**
	 *	Returns the value of src129
	 *	@return src129
	 */
	public long getSrc129() throws CFException {
   		return work.getSrc129();
	}


	/**
	 *	Returns String value of src129
	 *	@return src129
	 */
	public char[]  getSrc129String() throws CFException {
	     return String.valueOf(work.getSrc129String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src129IsNumeric()  throws CFException{
	    return work.src129IsNumeric();
	}

	/**
	 * 	Update Src129 with the passed value
	 *	@param number
	 */
	public void setSrc129(long number)  throws CFException{
		work.setSrc129(number);
	}
	

	
	/**
	 * 	Update Src129 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc129(char[] value)  throws CFException {
		work.setSrc129(value);
	}
	
	/**
	 * 	Update Src129 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc129String(char[] value)  throws CFException{
		work.setSrc129(value);
	}	

	/**
	 *	Returns the value of src131
	 *	@return src131
	 */
	public long getSrc131() throws CFException {
   		return work.getSrc131();
	}


	/**
	 *	Returns String value of src131
	 *	@return src131
	 */
	public char[]  getSrc131String() throws CFException {
	     return String.valueOf(work.getSrc131String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src131IsNumeric()  throws CFException{
	    return work.src131IsNumeric();
	}

	/**
	 * 	Update Src131 with the passed value
	 *	@param number
	 */
	public void setSrc131(long number)  throws CFException{
		work.setSrc131(number);
	}
	

	
	/**
	 * 	Update Src131 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc131(char[] value)  throws CFException {
		work.setSrc131(value);
	}
	
	/**
	 * 	Update Src131 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc131String(char[] value)  throws CFException{
		work.setSrc131(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process30Split103OutCtx clone() {
        Process30Split103OutCtx cloneObj = new Process30Split103OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process30Split103OutCtx getProcess30Split103OutCtx() {
            return new Process30Split103OutCtx();
    }
     public class Process31Split105InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src133
	 *	@return src133
	 */
	public long getSrc133() throws CFException {
   		return work.getSrc133();
	}


	/**
	 *	Returns String value of src133
	 *	@return src133
	 */
	public char[]  getSrc133String() throws CFException {
	     return String.valueOf(work.getSrc133String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src133IsNumeric()  throws CFException{
	    return work.src133IsNumeric();
	}

	/**
	 * 	Update Src133 with the passed value
	 *	@param number
	 */
	public void setSrc133(long number)  throws CFException{
		work.setSrc133(number);
	}
	

	
	/**
	 * 	Update Src133 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc133(char[] value)  throws CFException {
		work.setSrc133(value);
	}
	
	/**
	 * 	Update Src133 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc133String(char[] value)  throws CFException{
		work.setSrc133(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process31Split105OutCtx getProcess31Split105OutCtx() {
            return new Process31Split105OutCtx();
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

    public Process31Split105InCtx clone() {
        Process31Split105InCtx cloneObj = new Process31Split105InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process31Split105InCtx getProcess31Split105InCtx() {
            return new Process31Split105InCtx();
    }
     public class Process31Split105OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src137
	 *	@return src137
	 */
	public long getSrc137() throws CFException {
   		return work.getSrc137();
	}


	/**
	 *	Returns String value of src137
	 *	@return src137
	 */
	public char[]  getSrc137String() throws CFException {
	     return String.valueOf(work.getSrc137String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src137IsNumeric()  throws CFException{
	    return work.src137IsNumeric();
	}

	/**
	 * 	Update Src137 with the passed value
	 *	@param number
	 */
	public void setSrc137(long number)  throws CFException{
		work.setSrc137(number);
	}
	

	
	/**
	 * 	Update Src137 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc137(char[] value)  throws CFException {
		work.setSrc137(value);
	}
	
	/**
	 * 	Update Src137 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc137String(char[] value)  throws CFException{
		work.setSrc137(value);
	}	

	/**
	 *	Returns the value of tgt134
	 *	@return tgt134
	 */
	public long getTgt134() throws CFException {        
   		return work.getTgt134();
	}
	
	/**
	 * 	Update Tgt134 with the passed value
	 *	@param number
	 */
	public void setTgt134(long number)  throws CFException{
		work.setTgt134(number);
	}



	/**
	 *	Returns the value of tgt133
	 *	@return tgt133
	 */
	public long getTgt133() throws CFException {        
   		return work.getTgt133();
	}
	
	/**
	 * 	Update Tgt133 with the passed value
	 *	@param number
	 */
	public void setTgt133(long number)  throws CFException{
		work.setTgt133(number);
	}



	/**
	 *	Returns the value of src136
	 *	@return src136
	 */
	public long getSrc136() throws CFException {
   		return work.getSrc136();
	}


	/**
	 *	Returns String value of src136
	 *	@return src136
	 */
	public char[]  getSrc136String() throws CFException {
	     return String.valueOf(work.getSrc136String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src136IsNumeric()  throws CFException{
	    return work.src136IsNumeric();
	}

	/**
	 * 	Update Src136 with the passed value
	 *	@param number
	 */
	public void setSrc136(long number)  throws CFException{
		work.setSrc136(number);
	}
	

	
	/**
	 * 	Update Src136 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc136(char[] value)  throws CFException {
		work.setSrc136(value);
	}
	
	/**
	 * 	Update Src136 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc136String(char[] value)  throws CFException{
		work.setSrc136(value);
	}	

	/**
	 *	Returns the value of tgt136
	 *	@return tgt136
	 */
	public int getTgt136() throws CFException {        
   		return work.getTgt136();
	}
	
	/**
	 * 	Update Tgt136 with the passed value
	 *	@param number
	 */
	public void setTgt136(int number)  throws CFException{
		work.setTgt136(number);
	}


	public void setTgt136(long number)  throws CFException{
		work.setTgt136((int)number);
	}


	/**
	 *	Returns the value of tgt135
	 *	@return tgt135
	 */
	public short getTgt135() throws CFException {        
   		return work.getTgt135();
	}
	
	/**
	 * 	Update Tgt135 with the passed value
	 *	@param number
	 */
	public void setTgt135(short number)  throws CFException{
		work.setTgt135(number);
	}

	public void setTgt135(int number)  throws CFException{
		work.setTgt135((short)number);
	}

	public void setTgt135(long number)  throws CFException{
		work.setTgt135((short)number);
	}



	/**
	 *	Returns the value of src133
	 *	@return src133
	 */
	public long getSrc133() throws CFException {
   		return work.getSrc133();
	}


	/**
	 *	Returns String value of src133
	 *	@return src133
	 */
	public char[]  getSrc133String() throws CFException {
	     return String.valueOf(work.getSrc133String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src133IsNumeric()  throws CFException{
	    return work.src133IsNumeric();
	}

	/**
	 * 	Update Src133 with the passed value
	 *	@param number
	 */
	public void setSrc133(long number)  throws CFException{
		work.setSrc133(number);
	}
	

	
	/**
	 * 	Update Src133 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc133(char[] value)  throws CFException {
		work.setSrc133(value);
	}
	
	/**
	 * 	Update Src133 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc133String(char[] value)  throws CFException{
		work.setSrc133(value);
	}	

	/**
	 *	Returns the value of src135
	 *	@return src135
	 */
	public long getSrc135() throws CFException {
   		return work.getSrc135();
	}


	/**
	 *	Returns String value of src135
	 *	@return src135
	 */
	public char[]  getSrc135String() throws CFException {
	     return String.valueOf(work.getSrc135String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src135IsNumeric()  throws CFException{
	    return work.src135IsNumeric();
	}

	/**
	 * 	Update Src135 with the passed value
	 *	@param number
	 */
	public void setSrc135(long number)  throws CFException{
		work.setSrc135(number);
	}
	

	
	/**
	 * 	Update Src135 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc135(char[] value)  throws CFException {
		work.setSrc135(value);
	}
	
	/**
	 * 	Update Src135 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc135String(char[] value)  throws CFException{
		work.setSrc135(value);
	}	

	/**
	 *	Returns the value of src134
	 *	@return src134
	 */
	public long getSrc134() throws CFException {
   		return work.getSrc134();
	}


	/**
	 *	Returns String value of src134
	 *	@return src134
	 */
	public char[]  getSrc134String() throws CFException {
	     return String.valueOf(work.getSrc134String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src134IsNumeric()  throws CFException{
	    return work.src134IsNumeric();
	}

	/**
	 * 	Update Src134 with the passed value
	 *	@param number
	 */
	public void setSrc134(long number)  throws CFException{
		work.setSrc134(number);
	}
	

	
	/**
	 * 	Update Src134 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc134(char[] value)  throws CFException {
		work.setSrc134(value);
	}
	
	/**
	 * 	Update Src134 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc134String(char[] value)  throws CFException{
		work.setSrc134(value);
	}	

	/**
	 *	Returns the value of tgt137
	 *	@return tgt137
	 */
	public long getTgt137() throws CFException {
   		return work.getTgt137();
	}


	/**
	 *	Returns String value of tgt137
	 *	@return tgt137
	 */
	public char[]  getTgt137String() throws CFException {
	     return String.valueOf(work.getTgt137String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt137IsNumeric()  throws CFException{
	    return work.tgt137IsNumeric();
	}

	/**
	 * 	Update Tgt137 with the passed value
	 *	@param number
	 */
	public void setTgt137(long number)  throws CFException{
		work.setTgt137(number);
	}
	

	
	/**
	 * 	Update Tgt137 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt137(char[] value)  throws CFException {
		work.setTgt137(value);
	}
	
	/**
	 * 	Update Tgt137 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt137String(char[] value)  throws CFException{
		work.setTgt137(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process31Split105OutCtx clone() {
        Process31Split105OutCtx cloneObj = new Process31Split105OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process31Split105OutCtx getProcess31Split105OutCtx() {
            return new Process31Split105OutCtx();
    }
     public class Process32Split107InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src137
	 *	@return src137
	 */
	public long getSrc137() throws CFException {
   		return work.getSrc137();
	}


	/**
	 *	Returns String value of src137
	 *	@return src137
	 */
	public char[]  getSrc137String() throws CFException {
	     return String.valueOf(work.getSrc137String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src137IsNumeric()  throws CFException{
	    return work.src137IsNumeric();
	}

	/**
	 * 	Update Src137 with the passed value
	 *	@param number
	 */
	public void setSrc137(long number)  throws CFException{
		work.setSrc137(number);
	}
	

	
	/**
	 * 	Update Src137 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc137(char[] value)  throws CFException {
		work.setSrc137(value);
	}
	
	/**
	 * 	Update Src137 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc137String(char[] value)  throws CFException{
		work.setSrc137(value);
	}	

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process32Split107OutCtx getProcess32Split107OutCtx() {
            return new Process32Split107OutCtx();
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

    public Process32Split107InCtx clone() {
        Process32Split107InCtx cloneObj = new Process32Split107InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process32Split107InCtx getProcess32Split107InCtx() {
            return new Process32Split107InCtx();
    }
     public class Process32Split107OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src137
	 *	@return src137
	 */
	public long getSrc137() throws CFException {
   		return work.getSrc137();
	}


	/**
	 *	Returns String value of src137
	 *	@return src137
	 */
	public char[]  getSrc137String() throws CFException {
	     return String.valueOf(work.getSrc137String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src137IsNumeric()  throws CFException{
	    return work.src137IsNumeric();
	}

	/**
	 * 	Update Src137 with the passed value
	 *	@param number
	 */
	public void setSrc137(long number)  throws CFException{
		work.setSrc137(number);
	}
	

	
	/**
	 * 	Update Src137 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc137(char[] value)  throws CFException {
		work.setSrc137(value);
	}
	
	/**
	 * 	Update Src137 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc137String(char[] value)  throws CFException{
		work.setSrc137(value);
	}	

	/**
	 *	Returns the value of tgt138
	 *	@return tgt138
	 */
	public int getTgt138() throws CFException {
   		return work.getTgt138();
	}

    /**
	 *	Returns the String value of tgt138
	 *	@return tgt138
	 */
	public char[]  getTgt138ActualString() {
		return work.getTgt138ActualString();
	}

	/**
	 *	Returns String value of tgt138
	 *	@return tgt138
	 */
	public char[]  getTgt138String() throws CFException {
	     return String.valueOf(work.getTgt138String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt138IsNumeric()  throws CFException{
	    return work.tgt138IsNumeric();
	}

	/**
	 * 	Update Tgt138 with the passed value
	 *	@param number
	 */
	public void setTgt138(int number)  throws CFException{
		work.setTgt138(number);
	}
	

	public void setTgt138(long number)  throws CFException{
	    work.setTgt138(number);
	}
	
	
	/**
	 * 	Update Tgt138 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt138(char[] value)  throws CFException {
		work.setTgt138(value);
	}
	
	/**
	 * 	Update Tgt138 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt138String(char[] value)  throws CFException{
		work.setTgt138(value);
	}	

	/**
	 *	Returns the value of tgt139
	 *	@return tgt139
	 */
	public int getTgt139() throws CFException {        
   		return work.getTgt139();
	}
	
	/**
	 * 	Update Tgt139 with the passed value
	 *	@param number
	 */
	public void setTgt139(int number)  throws CFException{
		work.setTgt139(number);
	}


	public void setTgt139(long number)  throws CFException{
		work.setTgt139((int)number);
	}


	/**
	 *	Returns the value of src139
	 *	@return src139
	 */
	public long getSrc139() throws CFException {
   		return work.getSrc139();
	}

    /**
	 *	Returns the String value of src139
	 *	@return src139
	 */
	public char[]  getSrc139ActualString() {
		return work.getSrc139ActualString();
	}

	/**
	 *	Returns String value of src139
	 *	@return src139
	 */
	public char[]  getSrc139String() throws CFException {
	     return String.valueOf(work.getSrc139String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src139IsNumeric()  throws CFException{
	    return work.src139IsNumeric();
	}

	/**
	 * 	Update Src139 with the passed value
	 *	@param number
	 */
	public void setSrc139(long number)  throws CFException{
		work.setSrc139(number);
	}
	

	
	/**
	 * 	Update Src139 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc139(char[] value)  throws CFException {
		work.setSrc139(value);
	}
	
	/**
	 * 	Update Src139 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc139String(char[] value)  throws CFException{
		work.setSrc139(value);
	}	

	/**
	 *	Returns the value of tgt141
	 *	@return tgt141
	 */
	public long getTgt141() throws CFException {        
   		return work.getTgt141();
	}
	
	/**
	 * 	Update Tgt141 with the passed value
	 *	@param number
	 */
	public void setTgt141(long number)  throws CFException{
		work.setTgt141(number);
	}



	/**
	 *	Returns the value of src140
	 *	@return src140
	 */
	public long getSrc140() throws CFException {
   		return work.getSrc140();
	}

    /**
	 *	Returns the String value of src140
	 *	@return src140
	 */
	public char[]  getSrc140ActualString() {
		return work.getSrc140ActualString();
	}

	/**
	 *	Returns String value of src140
	 *	@return src140
	 */
	public char[]  getSrc140String() throws CFException {
	     return String.valueOf(work.getSrc140String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src140IsNumeric()  throws CFException{
	    return work.src140IsNumeric();
	}

	/**
	 * 	Update Src140 with the passed value
	 *	@param number
	 */
	public void setSrc140(long number)  throws CFException{
		work.setSrc140(number);
	}
	

	
	/**
	 * 	Update Src140 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc140(char[] value)  throws CFException {
		work.setSrc140(value);
	}
	
	/**
	 * 	Update Src140 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc140String(char[] value)  throws CFException{
		work.setSrc140(value);
	}	

	/**
	 *	Returns the value of src138
	 *	@return src138
	 */
	public long getSrc138() throws CFException {
   		return work.getSrc138();
	}


	/**
	 *	Returns String value of src138
	 *	@return src138
	 */
	public char[]  getSrc138String() throws CFException {
	     return String.valueOf(work.getSrc138String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src138IsNumeric()  throws CFException{
	    return work.src138IsNumeric();
	}

	/**
	 * 	Update Src138 with the passed value
	 *	@param number
	 */
	public void setSrc138(long number)  throws CFException{
		work.setSrc138(number);
	}
	

	
	/**
	 * 	Update Src138 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc138(char[] value)  throws CFException {
		work.setSrc138(value);
	}
	
	/**
	 * 	Update Src138 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc138String(char[] value)  throws CFException{
		work.setSrc138(value);
	}	

	/**
	 *	Returns the value of tgt140
	 *	@return tgt140
	 */
	public long getTgt140() throws CFException {        
   		return work.getTgt140();
	}
	
	/**
	 * 	Update Tgt140 with the passed value
	 *	@param number
	 */
	public void setTgt140(long number)  throws CFException{
		work.setTgt140(number);
	}



	/**
	 *	Returns the value of src141
	 *	@return src141
	 */
	public long getSrc141() throws CFException {
   		return work.getSrc141();
	}

    /**
	 *	Returns the String value of src141
	 *	@return src141
	 */
	public char[]  getSrc141ActualString() {
		return work.getSrc141ActualString();
	}

	/**
	 *	Returns String value of src141
	 *	@return src141
	 */
	public char[]  getSrc141String() throws CFException {
	     return String.valueOf(work.getSrc141String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src141IsNumeric()  throws CFException{
	    return work.src141IsNumeric();
	}

	/**
	 * 	Update Src141 with the passed value
	 *	@param number
	 */
	public void setSrc141(long number)  throws CFException{
		work.setSrc141(number);
	}
	

	
	/**
	 * 	Update Src141 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc141(char[] value)  throws CFException {
		work.setSrc141(value);
	}
	
	/**
	 * 	Update Src141 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc141String(char[] value)  throws CFException{
		work.setSrc141(value);
	}	

	/**
	 *	Returns the value of tgt137
	 *	@return tgt137
	 */
	public long getTgt137() throws CFException {
   		return work.getTgt137();
	}


	/**
	 *	Returns String value of tgt137
	 *	@return tgt137
	 */
	public char[]  getTgt137String() throws CFException {
	     return String.valueOf(work.getTgt137String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt137IsNumeric()  throws CFException{
	    return work.tgt137IsNumeric();
	}

	/**
	 * 	Update Tgt137 with the passed value
	 *	@param number
	 */
	public void setTgt137(long number)  throws CFException{
		work.setTgt137(number);
	}
	

	
	/**
	 * 	Update Tgt137 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt137(char[] value)  throws CFException {
		work.setTgt137(value);
	}
	
	/**
	 * 	Update Tgt137 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt137String(char[] value)  throws CFException{
		work.setTgt137(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process32Split107OutCtx clone() {
        Process32Split107OutCtx cloneObj = new Process32Split107OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process32Split107OutCtx getProcess32Split107OutCtx() {
            return new Process32Split107OutCtx();
    }
     public class Process33Split109InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src141
	 *	@return src141
	 */
	public long getSrc141() throws CFException {
   		return work.getSrc141();
	}

    /**
	 *	Returns the String value of src141
	 *	@return src141
	 */
	public char[]  getSrc141ActualString() {
		return work.getSrc141ActualString();
	}

	/**
	 *	Returns String value of src141
	 *	@return src141
	 */
	public char[]  getSrc141String() throws CFException {
	     return String.valueOf(work.getSrc141String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src141IsNumeric()  throws CFException{
	    return work.src141IsNumeric();
	}

	/**
	 * 	Update Src141 with the passed value
	 *	@param number
	 */
	public void setSrc141(long number)  throws CFException{
		work.setSrc141(number);
	}
	

	
	/**
	 * 	Update Src141 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc141(char[] value)  throws CFException {
		work.setSrc141(value);
	}
	
	/**
	 * 	Update Src141 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc141String(char[] value)  throws CFException{
		work.setSrc141(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process33Split109OutCtx getProcess33Split109OutCtx() {
            return new Process33Split109OutCtx();
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

    public Process33Split109InCtx clone() {
        Process33Split109InCtx cloneObj = new Process33Split109InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process33Split109InCtx getProcess33Split109InCtx() {
            return new Process33Split109InCtx();
    }
     public class Process33Split109OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src144
	 *	@return src144
	 */
	public long getSrc144() throws CFException {
   		return work.getSrc144();
	}

    /**
	 *	Returns the String value of src144
	 *	@return src144
	 */
	public char[]  getSrc144ActualString() {
		return work.getSrc144ActualString();
	}

	/**
	 *	Returns String value of src144
	 *	@return src144
	 */
	public char[]  getSrc144String() throws CFException {
	     return String.valueOf(work.getSrc144String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src144IsNumeric()  throws CFException{
	    return work.src144IsNumeric();
	}

	/**
	 * 	Update Src144 with the passed value
	 *	@param number
	 */
	public void setSrc144(long number)  throws CFException{
		work.setSrc144(number);
	}
	

	
	/**
	 * 	Update Src144 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc144(char[] value)  throws CFException {
		work.setSrc144(value);
	}
	
	/**
	 * 	Update Src144 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc144String(char[] value)  throws CFException{
		work.setSrc144(value);
	}	

	/**
	 *	Returns the value of tgt145
	 *	@return tgt145
	 */
	public long getTgt145() throws CFException {
   		return work.getTgt145();
	}


	/**
	 *	Returns String value of tgt145
	 *	@return tgt145
	 */
	public char[]  getTgt145String() throws CFException {
	     return String.valueOf(work.getTgt145String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt145IsNumeric()  throws CFException{
	    return work.tgt145IsNumeric();
	}

	/**
	 * 	Update Tgt145 with the passed value
	 *	@param number
	 */
	public void setTgt145(long number)  throws CFException{
		work.setTgt145(number);
	}
	

	
	/**
	 * 	Update Tgt145 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt145(char[] value)  throws CFException {
		work.setTgt145(value);
	}
	
	/**
	 * 	Update Tgt145 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt145String(char[] value)  throws CFException{
		work.setTgt145(value);
	}	

	/**
	 *	Returns the value of tgt142
	 *	@return tgt142
	 */
	public long getTgt142() throws CFException {        
   		return work.getTgt142();
	}
	
	/**
	 * 	Update Tgt142 with the passed value
	 *	@param number
	 */
	public void setTgt142(long number)  throws CFException{
		work.setTgt142(number);
	}



	/**
	 *	Returns the value of src143
	 *	@return src143
	 */
	public long getSrc143() throws CFException {
   		return work.getSrc143();
	}

    /**
	 *	Returns the String value of src143
	 *	@return src143
	 */
	public char[]  getSrc143ActualString() {
		return work.getSrc143ActualString();
	}

	/**
	 *	Returns String value of src143
	 *	@return src143
	 */
	public char[]  getSrc143String() throws CFException {
	     return String.valueOf(work.getSrc143String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src143IsNumeric()  throws CFException{
	    return work.src143IsNumeric();
	}

	/**
	 * 	Update Src143 with the passed value
	 *	@param number
	 */
	public void setSrc143(long number)  throws CFException{
		work.setSrc143(number);
	}
	

	
	/**
	 * 	Update Src143 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc143(char[] value)  throws CFException {
		work.setSrc143(value);
	}
	
	/**
	 * 	Update Src143 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc143String(char[] value)  throws CFException{
		work.setSrc143(value);
	}	

	/**
	 *	Returns the value of tgt141
	 *	@return tgt141
	 */
	public long getTgt141() throws CFException {        
   		return work.getTgt141();
	}
	
	/**
	 * 	Update Tgt141 with the passed value
	 *	@param number
	 */
	public void setTgt141(long number)  throws CFException{
		work.setTgt141(number);
	}



	/**
	 *	Returns the value of src142
	 *	@return src142
	 */
	public long getSrc142() throws CFException {
   		return work.getSrc142();
	}

    /**
	 *	Returns the String value of src142
	 *	@return src142
	 */
	public char[]  getSrc142ActualString() {
		return work.getSrc142ActualString();
	}

	/**
	 *	Returns String value of src142
	 *	@return src142
	 */
	public char[]  getSrc142String() throws CFException {
	     return String.valueOf(work.getSrc142String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src142IsNumeric()  throws CFException{
	    return work.src142IsNumeric();
	}

	/**
	 * 	Update Src142 with the passed value
	 *	@param number
	 */
	public void setSrc142(long number)  throws CFException{
		work.setSrc142(number);
	}
	

	
	/**
	 * 	Update Src142 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc142(char[] value)  throws CFException {
		work.setSrc142(value);
	}
	
	/**
	 * 	Update Src142 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc142String(char[] value)  throws CFException{
		work.setSrc142(value);
	}	

	/**
	 *	Returns the value of tgt143
	 *	@return tgt143
	 */
	public short getTgt143() throws CFException {        
   		return work.getTgt143();
	}
	
	/**
	 * 	Update Tgt143 with the passed value
	 *	@param number
	 */
	public void setTgt143(short number)  throws CFException{
		work.setTgt143(number);
	}

	public void setTgt143(int number)  throws CFException{
		work.setTgt143((short)number);
	}

	public void setTgt143(long number)  throws CFException{
		work.setTgt143((short)number);
	}



	/**
	 *	Returns the value of src145
	 *	@return src145
	 */
	public long getSrc145() throws CFException {
   		return work.getSrc145();
	}

    /**
	 *	Returns the String value of src145
	 *	@return src145
	 */
	public char[]  getSrc145ActualString() {
		return work.getSrc145ActualString();
	}

	/**
	 *	Returns String value of src145
	 *	@return src145
	 */
	public char[]  getSrc145String() throws CFException {
	     return String.valueOf(work.getSrc145String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src145IsNumeric()  throws CFException{
	    return work.src145IsNumeric();
	}

	/**
	 * 	Update Src145 with the passed value
	 *	@param number
	 */
	public void setSrc145(long number)  throws CFException{
		work.setSrc145(number);
	}
	

	
	/**
	 * 	Update Src145 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc145(char[] value)  throws CFException {
		work.setSrc145(value);
	}
	
	/**
	 * 	Update Src145 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc145String(char[] value)  throws CFException{
		work.setSrc145(value);
	}	

	/**
	 *	Returns the value of tgt144
	 *	@return tgt144
	 */
	public int getTgt144() throws CFException {        
   		return work.getTgt144();
	}
	
	/**
	 * 	Update Tgt144 with the passed value
	 *	@param number
	 */
	public void setTgt144(int number)  throws CFException{
		work.setTgt144(number);
	}


	public void setTgt144(long number)  throws CFException{
		work.setTgt144((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process33Split109OutCtx clone() {
        Process33Split109OutCtx cloneObj = new Process33Split109OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process33Split109OutCtx getProcess33Split109OutCtx() {
            return new Process33Split109OutCtx();
    }
     public class Process34Split111InCtx implements Cloneable {
     Src148Grp src148Grp = TestnumCtx.this.getSrc148Grp();
     Work work = TestnumCtx.this.getWork();
     Tgt149Grp tgt149Grp = TestnumCtx.this.getTgt149Grp();
     Tgt150Grp tgt150Grp = TestnumCtx.this.getTgt150Grp();
     Src150Grp src150Grp = TestnumCtx.this.getSrc150Grp();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of tgt150
	 *	@return tgt150
	 */
	public long getTgt150(int index) throws CFException {
   		return tgt150Grp.getTgt150((index));
	}


	/**
	 *	Returns String value of tgt150
	 *	@return tgt150
	 */
	public char[]  getTgt150String(int index) throws CFException {
	     return String.valueOf(tgt150Grp.getTgt150String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt150IsNumeric(int index)  throws CFException{
	    return tgt150Grp.tgt150IsNumeric(index);
	}

	/**
	 * 	Update Tgt150 with the passed value
	 *	@param number
	 */
	public void setTgt150(int index,long number)  throws CFException{
		tgt150Grp.setTgt150((index),number);
	}
	

	
	/**
	 * 	Update Tgt150 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt150(int index,char[] value)  throws CFException {
		tgt150Grp.setTgt150((index),value);
	}
	
	/**
	 * 	Update Tgt150 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt150String(int index,char[] value)  throws CFException{
		tgt150Grp.setTgt150((index),value);
	}	

	/**
	 *	Returns the value of tgt149
	 *	@return tgt149
	 */
	public long getTgt149(int index) throws CFException {
   		return tgt149Grp.getTgt149((index));
	}


	/**
	 *	Returns String value of tgt149
	 *	@return tgt149
	 */
	public char[]  getTgt149String(int index) throws CFException {
	     return String.valueOf(tgt149Grp.getTgt149String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt149IsNumeric(int index)  throws CFException{
	    return tgt149Grp.tgt149IsNumeric(index);
	}

	/**
	 * 	Update Tgt149 with the passed value
	 *	@param number
	 */
	public void setTgt149(int index,long number)  throws CFException{
		tgt149Grp.setTgt149((index),number);
	}
	

	
	/**
	 * 	Update Tgt149 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt149(int index,char[] value)  throws CFException {
		tgt149Grp.setTgt149((index),value);
	}
	
	/**
	 * 	Update Tgt149 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt149String(int index,char[] value)  throws CFException{
		tgt149Grp.setTgt149((index),value);
	}	

	/**
	 *	Returns the value of src150
	 *	@return src150
	 */
	public short getSrc150(int index) throws CFException {        
   		return src150Grp.getSrc150((index));
	}
	
	/**
	 * 	Update Src150 with the passed value
	 *	@param number
	 */
	public void setSrc150(int index,short number)  throws CFException{
		src150Grp.setSrc150((index),number);
	}

	public void setSrc150(int index,int number)  throws CFException{
		src150Grp.setSrc150((index),(short)number);
	}

	public void setSrc150(int index,long number)  throws CFException{
		src150Grp.setSrc150((index),(short)number);
	}



	/**
	 *	Returns the value of tgt147
	 *	@return tgt147
	 */
	public long getTgt147() throws CFException {
   		return work.getTgt147();
	}


	/**
	 *	Returns String value of tgt147
	 *	@return tgt147
	 */
	public char[]  getTgt147String() throws CFException {
	     return String.valueOf(work.getTgt147String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt147IsNumeric()  throws CFException{
	    return work.tgt147IsNumeric();
	}

	/**
	 * 	Update Tgt147 with the passed value
	 *	@param number
	 */
	public void setTgt147(long number)  throws CFException{
		work.setTgt147(number);
	}
	

	
	/**
	 * 	Update Tgt147 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt147(char[] value)  throws CFException {
		work.setTgt147(value);
	}
	
	/**
	 * 	Update Tgt147 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt147String(char[] value)  throws CFException{
		work.setTgt147(value);
	}	

	/**
	 *	Returns the value of src148
	 *	@return src148
	 */
	public short getSrc148(int index) throws CFException {        
   		return src148Grp.getSrc148((index));
	}
	
	/**
	 * 	Update Src148 with the passed value
	 *	@param number
	 */
	public void setSrc148(int index,short number)  throws CFException{
		src148Grp.setSrc148((index),number);
	}

	public void setSrc148(int index,int number)  throws CFException{
		src148Grp.setSrc148((index),(short)number);
	}

	public void setSrc148(int index,long number)  throws CFException{
		src148Grp.setSrc148((index),(short)number);
	}



	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of src149
	 *	@return src149
	 */
	public short getSrc149() throws CFException {        
   		return work.getSrc149();
	}
	
	/**
	 * 	Update Src149 with the passed value
	 *	@param number
	 */
	public void setSrc149(short number)  throws CFException{
		work.setSrc149(number);
	}

	public void setSrc149(int number)  throws CFException{
		work.setSrc149((short)number);
	}

	public void setSrc149(long number)  throws CFException{
		work.setSrc149((short)number);
	}



	/**
	 *	Returns the value of tgt149Grp
	 *	@return tgt149Grp
	 */   
	 public Tgt149Grp getTgt149Grp() {
   	return tgt149Grp;
   }


	/**
	 *	Returns the value of src147
	 *	@return src147
	 */
	public short getSrc147() throws CFException {        
   		return work.getSrc147();
	}
	
	/**
	 * 	Update Src147 with the passed value
	 *	@param number
	 */
	public void setSrc147(short number)  throws CFException{
		work.setSrc147(number);
	}

	public void setSrc147(int number)  throws CFException{
		work.setSrc147((short)number);
	}

	public void setSrc147(long number)  throws CFException{
		work.setSrc147((short)number);
	}



	/**
	 *	Returns the value of tgt150Grp
	 *	@return tgt150Grp
	 */   
	 public Tgt150Grp getTgt150Grp() {
   	return tgt150Grp;
   }


	/**
	 *	Returns the value of tgt148
	 *	@return tgt148
	 */
	public long getTgt148() throws CFException {
   		return work.getTgt148();
	}


	/**
	 *	Returns String value of tgt148
	 *	@return tgt148
	 */
	public char[]  getTgt148String() throws CFException {
	     return String.valueOf(work.getTgt148String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt148IsNumeric()  throws CFException{
	    return work.tgt148IsNumeric();
	}

	/**
	 * 	Update Tgt148 with the passed value
	 *	@param number
	 */
	public void setTgt148(long number)  throws CFException{
		work.setTgt148(number);
	}
	

	
	/**
	 * 	Update Tgt148 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt148(char[] value)  throws CFException {
		work.setTgt148(value);
	}
	
	/**
	 * 	Update Tgt148 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt148String(char[] value)  throws CFException{
		work.setTgt148(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process34Split111OutCtx getProcess34Split111OutCtx() {
            return new Process34Split111OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src148Grp.hashCode();
        str += work.hashCode();
        str += tgt149Grp.hashCode();
        str += tgt150Grp.hashCode();
        str += src150Grp.hashCode();
       return str.hashCode();
    }

    public Process34Split111InCtx clone() {
        Process34Split111InCtx cloneObj = new Process34Split111InCtx();
        cloneObj.src148Grp = new Src148Grp();
        cloneObj.src148Grp.set(src148Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt149Grp = new Tgt149Grp();
        cloneObj.tgt149Grp.set(tgt149Grp.getClonedField());
        cloneObj.tgt150Grp = new Tgt150Grp();
        cloneObj.tgt150Grp.set(tgt150Grp.getClonedField());
        cloneObj.src150Grp = new Src150Grp();
        cloneObj.src150Grp.set(src150Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process34Split111InCtx getProcess34Split111InCtx() {
            return new Process34Split111InCtx();
    }
     public class Process34Split111OutCtx implements Cloneable {
     Src148Grp src148Grp = TestnumCtx.this.getSrc148Grp();
     Work work = TestnumCtx.this.getWork();
     Tgt149Grp tgt149Grp = TestnumCtx.this.getTgt149Grp();
     Src150Grp src150Grp = TestnumCtx.this.getSrc150Grp();
     Tgt150Grp tgt150Grp = TestnumCtx.this.getTgt150Grp();

	/**
	 *	Returns the value of src146
	 *	@return src146
	 */
	public long getSrc146() throws CFException {
   		return work.getSrc146();
	}


	/**
	 *	Returns String value of src146
	 *	@return src146
	 */
	public char[]  getSrc146String() throws CFException {
	     return String.valueOf(work.getSrc146String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src146IsNumeric()  throws CFException{
	    return work.src146IsNumeric();
	}

	/**
	 * 	Update Src146 with the passed value
	 *	@param number
	 */
	public void setSrc146(long number)  throws CFException{
		work.setSrc146(number);
	}
	

	
	/**
	 * 	Update Src146 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc146(char[] value)  throws CFException {
		work.setSrc146(value);
	}
	
	/**
	 * 	Update Src146 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc146String(char[] value)  throws CFException{
		work.setSrc146(value);
	}	

	/**
	 *	Returns the value of tgt150
	 *	@return tgt150
	 */
	public long getTgt150(int index) throws CFException {
   		return tgt150Grp.getTgt150((index));
	}


	/**
	 *	Returns String value of tgt150
	 *	@return tgt150
	 */
	public char[]  getTgt150String(int index) throws CFException {
	     return String.valueOf(tgt150Grp.getTgt150String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt150IsNumeric(int index)  throws CFException{
	    return tgt150Grp.tgt150IsNumeric(index);
	}

	/**
	 * 	Update Tgt150 with the passed value
	 *	@param number
	 */
	public void setTgt150(int index,long number)  throws CFException{
		tgt150Grp.setTgt150((index),number);
	}
	

	
	/**
	 * 	Update Tgt150 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt150(int index,char[] value)  throws CFException {
		tgt150Grp.setTgt150((index),value);
	}
	
	/**
	 * 	Update Tgt150 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt150String(int index,char[] value)  throws CFException{
		tgt150Grp.setTgt150((index),value);
	}	

	/**
	 *	Returns the value of tgt149
	 *	@return tgt149
	 */
	public long getTgt149(int index) throws CFException {
   		return tgt149Grp.getTgt149((index));
	}


	/**
	 *	Returns String value of tgt149
	 *	@return tgt149
	 */
	public char[]  getTgt149String(int index) throws CFException {
	     return String.valueOf(tgt149Grp.getTgt149String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt149IsNumeric(int index)  throws CFException{
	    return tgt149Grp.tgt149IsNumeric(index);
	}

	/**
	 * 	Update Tgt149 with the passed value
	 *	@param number
	 */
	public void setTgt149(int index,long number)  throws CFException{
		tgt149Grp.setTgt149((index),number);
	}
	

	
	/**
	 * 	Update Tgt149 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt149(int index,char[] value)  throws CFException {
		tgt149Grp.setTgt149((index),value);
	}
	
	/**
	 * 	Update Tgt149 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt149String(int index,char[] value)  throws CFException{
		tgt149Grp.setTgt149((index),value);
	}	

	/**
	 *	Returns the value of src150
	 *	@return src150
	 */
	public short getSrc150(int index) throws CFException {        
   		return src150Grp.getSrc150((index));
	}
	
	/**
	 * 	Update Src150 with the passed value
	 *	@param number
	 */
	public void setSrc150(int index,short number)  throws CFException{
		src150Grp.setSrc150((index),number);
	}

	public void setSrc150(int index,int number)  throws CFException{
		src150Grp.setSrc150((index),(short)number);
	}

	public void setSrc150(int index,long number)  throws CFException{
		src150Grp.setSrc150((index),(short)number);
	}



	/**
	 *	Returns the value of tgt147
	 *	@return tgt147
	 */
	public long getTgt147() throws CFException {
   		return work.getTgt147();
	}


	/**
	 *	Returns String value of tgt147
	 *	@return tgt147
	 */
	public char[]  getTgt147String() throws CFException {
	     return String.valueOf(work.getTgt147String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt147IsNumeric()  throws CFException{
	    return work.tgt147IsNumeric();
	}

	/**
	 * 	Update Tgt147 with the passed value
	 *	@param number
	 */
	public void setTgt147(long number)  throws CFException{
		work.setTgt147(number);
	}
	

	
	/**
	 * 	Update Tgt147 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt147(char[] value)  throws CFException {
		work.setTgt147(value);
	}
	
	/**
	 * 	Update Tgt147 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt147String(char[] value)  throws CFException{
		work.setTgt147(value);
	}	

	/**
	 *	Returns the value of src148
	 *	@return src148
	 */
	public short getSrc148(int index) throws CFException {        
   		return src148Grp.getSrc148((index));
	}
	
	/**
	 * 	Update Src148 with the passed value
	 *	@param number
	 */
	public void setSrc148(int index,short number)  throws CFException{
		src148Grp.setSrc148((index),number);
	}

	public void setSrc148(int index,int number)  throws CFException{
		src148Grp.setSrc148((index),(short)number);
	}

	public void setSrc148(int index,long number)  throws CFException{
		src148Grp.setSrc148((index),(short)number);
	}



	/**
	 *	Returns the value of src149
	 *	@return src149
	 */
	public short getSrc149() throws CFException {        
   		return work.getSrc149();
	}
	
	/**
	 * 	Update Src149 with the passed value
	 *	@param number
	 */
	public void setSrc149(short number)  throws CFException{
		work.setSrc149(number);
	}

	public void setSrc149(int number)  throws CFException{
		work.setSrc149((short)number);
	}

	public void setSrc149(long number)  throws CFException{
		work.setSrc149((short)number);
	}



	/**
	 *	Returns the value of src147
	 *	@return src147
	 */
	public short getSrc147() throws CFException {        
   		return work.getSrc147();
	}
	
	/**
	 * 	Update Src147 with the passed value
	 *	@param number
	 */
	public void setSrc147(short number)  throws CFException{
		work.setSrc147(number);
	}

	public void setSrc147(int number)  throws CFException{
		work.setSrc147((short)number);
	}

	public void setSrc147(long number)  throws CFException{
		work.setSrc147((short)number);
	}



	/**
	 *	Returns the value of tgt146
	 *	@return tgt146
	 */
	public int getTgt146() throws CFException {
   		return work.getTgt146();
	}

    /**
	 *	Returns the String value of tgt146
	 *	@return tgt146
	 */
	public char[]  getTgt146ActualString() {
		return work.getTgt146ActualString();
	}

	/**
	 *	Returns String value of tgt146
	 *	@return tgt146
	 */
	public char[]  getTgt146String() throws CFException {
	     return String.valueOf(work.getTgt146String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt146IsNumeric()  throws CFException{
	    return work.tgt146IsNumeric();
	}

	/**
	 * 	Update Tgt146 with the passed value
	 *	@param number
	 */
	public void setTgt146(int number)  throws CFException{
		work.setTgt146(number);
	}
	

	public void setTgt146(long number)  throws CFException{
	    work.setTgt146(number);
	}
	
	
	/**
	 * 	Update Tgt146 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt146(char[] value)  throws CFException {
		work.setTgt146(value);
	}
	
	/**
	 * 	Update Tgt146 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt146String(char[] value)  throws CFException{
		work.setTgt146(value);
	}	

	/**
	 *	Returns the value of tgt148
	 *	@return tgt148
	 */
	public long getTgt148() throws CFException {
   		return work.getTgt148();
	}


	/**
	 *	Returns String value of tgt148
	 *	@return tgt148
	 */
	public char[]  getTgt148String() throws CFException {
	     return String.valueOf(work.getTgt148String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt148IsNumeric()  throws CFException{
	    return work.tgt148IsNumeric();
	}

	/**
	 * 	Update Tgt148 with the passed value
	 *	@param number
	 */
	public void setTgt148(long number)  throws CFException{
		work.setTgt148(number);
	}
	

	
	/**
	 * 	Update Tgt148 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt148(char[] value)  throws CFException {
		work.setTgt148(value);
	}
	
	/**
	 * 	Update Tgt148 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt148String(char[] value)  throws CFException{
		work.setTgt148(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src148Grp.hashCode();
        str += work.hashCode();
        str += tgt149Grp.hashCode();
        str += src150Grp.hashCode();
        str += tgt150Grp.hashCode();
       return str.hashCode();
    }

    public Process34Split111OutCtx clone() {
        Process34Split111OutCtx cloneObj = new Process34Split111OutCtx();
        cloneObj.src148Grp = new Src148Grp();
        cloneObj.src148Grp.set(src148Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt149Grp = new Tgt149Grp();
        cloneObj.tgt149Grp.set(tgt149Grp.getClonedField());
        cloneObj.src150Grp = new Src150Grp();
        cloneObj.src150Grp.set(src150Grp.getClonedField());
        cloneObj.tgt150Grp = new Tgt150Grp();
        cloneObj.tgt150Grp.set(tgt150Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process34Split111OutCtx getProcess34Split111OutCtx() {
            return new Process34Split111OutCtx();
    }
     public class Process35Split113InCtx implements Cloneable {
     Tgt153Grp tgt153Grp = TestnumCtx.this.getTgt153Grp();
     Src154Grp src154Grp = TestnumCtx.this.getSrc154Grp();
     Src152Grp src152Grp = TestnumCtx.this.getSrc152Grp();
     Work work = TestnumCtx.this.getWork();
     Tgt150Grp tgt150Grp = TestnumCtx.this.getTgt150Grp();
     Src150Grp src150Grp = TestnumCtx.this.getSrc150Grp();
     Tgt154Grp tgt154Grp = TestnumCtx.this.getTgt154Grp();

	/**
	 *	Returns the value of tgt150
	 *	@return tgt150
	 */
	public long getTgt150(int index) throws CFException {
   		return tgt150Grp.getTgt150((index));
	}


	/**
	 *	Returns String value of tgt150
	 *	@return tgt150
	 */
	public char[]  getTgt150String(int index) throws CFException {
	     return String.valueOf(tgt150Grp.getTgt150String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt150IsNumeric(int index)  throws CFException{
	    return tgt150Grp.tgt150IsNumeric(index);
	}

	/**
	 * 	Update Tgt150 with the passed value
	 *	@param number
	 */
	public void setTgt150(int index,long number)  throws CFException{
		tgt150Grp.setTgt150((index),number);
	}
	

	
	/**
	 * 	Update Tgt150 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt150(int index,char[] value)  throws CFException {
		tgt150Grp.setTgt150((index),value);
	}
	
	/**
	 * 	Update Tgt150 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt150String(int index,char[] value)  throws CFException{
		tgt150Grp.setTgt150((index),value);
	}	

	/**
	 *	Returns the value of src151
	 *	@return src151
	 */
	public int getSrc151() throws CFException {        
   		return work.getSrc151();
	}
	
	/**
	 * 	Update Src151 with the passed value
	 *	@param number
	 */
	public void setSrc151(int number)  throws CFException{
		work.setSrc151(number);
	}


	public void setSrc151(long number)  throws CFException{
		work.setSrc151((int)number);
	}


	/**
	 *	Returns the value of tgt152
	 *	@return tgt152
	 */
	public long getTgt152() throws CFException {
   		return work.getTgt152();
	}


	/**
	 *	Returns String value of tgt152
	 *	@return tgt152
	 */
	public char[]  getTgt152String() throws CFException {
	     return String.valueOf(work.getTgt152String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt152IsNumeric()  throws CFException{
	    return work.tgt152IsNumeric();
	}

	/**
	 * 	Update Tgt152 with the passed value
	 *	@param number
	 */
	public void setTgt152(long number)  throws CFException{
		work.setTgt152(number);
	}
	

	
	/**
	 * 	Update Tgt152 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt152(char[] value)  throws CFException {
		work.setTgt152(value);
	}
	
	/**
	 * 	Update Tgt152 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt152String(char[] value)  throws CFException{
		work.setTgt152(value);
	}	

	/**
	 *	Returns the value of tgt153
	 *	@return tgt153
	 */
	public long getTgt153(int index) throws CFException {
   		return tgt153Grp.getTgt153((index));
	}


	/**
	 *	Returns String value of tgt153
	 *	@return tgt153
	 */
	public char[]  getTgt153String(int index) throws CFException {
	     return String.valueOf(tgt153Grp.getTgt153String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt153IsNumeric(int index)  throws CFException{
	    return tgt153Grp.tgt153IsNumeric(index);
	}

	/**
	 * 	Update Tgt153 with the passed value
	 *	@param number
	 */
	public void setTgt153(int index,long number)  throws CFException{
		tgt153Grp.setTgt153((index),number);
	}
	

	
	/**
	 * 	Update Tgt153 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt153(int index,char[] value)  throws CFException {
		tgt153Grp.setTgt153((index),value);
	}
	
	/**
	 * 	Update Tgt153 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt153String(int index,char[] value)  throws CFException{
		tgt153Grp.setTgt153((index),value);
	}	

	/**
	 *	Returns the value of src153
	 *	@return src153
	 */
	public int getSrc153() throws CFException {        
   		return work.getSrc153();
	}
	
	/**
	 * 	Update Src153 with the passed value
	 *	@param number
	 */
	public void setSrc153(int number)  throws CFException{
		work.setSrc153(number);
	}


	public void setSrc153(long number)  throws CFException{
		work.setSrc153((int)number);
	}


	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of src152
	 *	@return src152
	 */
	public int getSrc152(int index) throws CFException {        
   		return src152Grp.getSrc152((index));
	}
	
	/**
	 * 	Update Src152 with the passed value
	 *	@param number
	 */
	public void setSrc152(int index,int number)  throws CFException{
		src152Grp.setSrc152((index),number);
	}


	public void setSrc152(int index,long number)  throws CFException{
		src152Grp.setSrc152((index),(int)number);
	}


	/**
	 *	Returns the value of tgt154
	 *	@return tgt154
	 */
	public long getTgt154(int index) throws CFException {
   		return tgt154Grp.getTgt154((index));
	}


	/**
	 *	Returns String value of tgt154
	 *	@return tgt154
	 */
	public char[]  getTgt154String(int index) throws CFException {
	     return String.valueOf(tgt154Grp.getTgt154String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt154IsNumeric(int index)  throws CFException{
	    return tgt154Grp.tgt154IsNumeric(index);
	}

	/**
	 * 	Update Tgt154 with the passed value
	 *	@param number
	 */
	public void setTgt154(int index,long number)  throws CFException{
		tgt154Grp.setTgt154((index),number);
	}
	

	
	/**
	 * 	Update Tgt154 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt154(int index,char[] value)  throws CFException {
		tgt154Grp.setTgt154((index),value);
	}
	
	/**
	 * 	Update Tgt154 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt154String(int index,char[] value)  throws CFException{
		tgt154Grp.setTgt154((index),value);
	}	

	public BigDecimal getSrc155() throws CFException{      
   		return work.getSrc155();
	}

    public char[] getSrc155String() throws CFException {
          return  work.getSrc155().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src155 with the passed number
	 *	@param number
	 */
	public void setSrc155(BigDecimal number)  throws CFException{
		work.setSrc155(number);
   }

	/**
	 *	Returns the value of src154
	 *	@return src154
	 */
	public int getSrc154(int index) throws CFException {        
   		return src154Grp.getSrc154((index));
	}
	
	/**
	 * 	Update Src154 with the passed value
	 *	@param number
	 */
	public void setSrc154(int index,int number)  throws CFException{
		src154Grp.setSrc154((index),number);
	}


	public void setSrc154(int index,long number)  throws CFException{
		src154Grp.setSrc154((index),(int)number);
	}


	/**
	 *	Returns the value of tgt153Grp
	 *	@return tgt153Grp
	 */   
	 public Tgt153Grp getTgt153Grp() {
   	return tgt153Grp;
   }


	/**
	 *	Returns the value of tgt155
	 *	@return tgt155
	 */
	public long getTgt155() throws CFException {
   		return work.getTgt155();
	}


	/**
	 *	Returns String value of tgt155
	 *	@return tgt155
	 */
	public char[]  getTgt155String() throws CFException {
	     return String.valueOf(work.getTgt155String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt155IsNumeric()  throws CFException{
	    return work.tgt155IsNumeric();
	}

	/**
	 * 	Update Tgt155 with the passed value
	 *	@param number
	 */
	public void setTgt155(long number)  throws CFException{
		work.setTgt155(number);
	}
	

	
	/**
	 * 	Update Tgt155 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt155(char[] value)  throws CFException {
		work.setTgt155(value);
	}
	
	/**
	 * 	Update Tgt155 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt155String(char[] value)  throws CFException{
		work.setTgt155(value);
	}	

	/**
	 *	Returns the value of src150
	 *	@return src150
	 */
	public short getSrc150(int index) throws CFException {        
   		return src150Grp.getSrc150((index));
	}
	
	/**
	 * 	Update Src150 with the passed value
	 *	@param number
	 */
	public void setSrc150(int index,short number)  throws CFException{
		src150Grp.setSrc150((index),number);
	}

	public void setSrc150(int index,int number)  throws CFException{
		src150Grp.setSrc150((index),(short)number);
	}

	public void setSrc150(int index,long number)  throws CFException{
		src150Grp.setSrc150((index),(short)number);
	}



	/**
	 *	Returns the value of tgt151
	 *	@return tgt151
	 */
	public long getTgt151() throws CFException {
   		return work.getTgt151();
	}


	/**
	 *	Returns String value of tgt151
	 *	@return tgt151
	 */
	public char[]  getTgt151String() throws CFException {
	     return String.valueOf(work.getTgt151String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt151IsNumeric()  throws CFException{
	    return work.tgt151IsNumeric();
	}

	/**
	 * 	Update Tgt151 with the passed value
	 *	@param number
	 */
	public void setTgt151(long number)  throws CFException{
		work.setTgt151(number);
	}
	

	
	/**
	 * 	Update Tgt151 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt151(char[] value)  throws CFException {
		work.setTgt151(value);
	}
	
	/**
	 * 	Update Tgt151 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt151String(char[] value)  throws CFException{
		work.setTgt151(value);
	}	

	/**
	 *	Returns the value of tgt154Grp
	 *	@return tgt154Grp
	 */   
	 public Tgt154Grp getTgt154Grp() {
   	return tgt154Grp;
   }



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process35Split113OutCtx getProcess35Split113OutCtx() {
            return new Process35Split113OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt153Grp.hashCode();
        str += src154Grp.hashCode();
        str += src152Grp.hashCode();
        str += work.hashCode();
        str += tgt150Grp.hashCode();
        str += src150Grp.hashCode();
        str += tgt154Grp.hashCode();
       return str.hashCode();
    }

    public Process35Split113InCtx clone() {
        Process35Split113InCtx cloneObj = new Process35Split113InCtx();
        cloneObj.tgt153Grp = new Tgt153Grp();
        cloneObj.tgt153Grp.set(tgt153Grp.getClonedField());
        cloneObj.src154Grp = new Src154Grp();
        cloneObj.src154Grp.set(src154Grp.getClonedField());
        cloneObj.src152Grp = new Src152Grp();
        cloneObj.src152Grp.set(src152Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt150Grp = new Tgt150Grp();
        cloneObj.tgt150Grp.set(tgt150Grp.getClonedField());
        cloneObj.src150Grp = new Src150Grp();
        cloneObj.src150Grp.set(src150Grp.getClonedField());
        cloneObj.tgt154Grp = new Tgt154Grp();
        cloneObj.tgt154Grp.set(tgt154Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process35Split113InCtx getProcess35Split113InCtx() {
            return new Process35Split113InCtx();
    }
     public class Process35Split113OutCtx implements Cloneable {
     Tgt153Grp tgt153Grp = TestnumCtx.this.getTgt153Grp();
     Src154Grp src154Grp = TestnumCtx.this.getSrc154Grp();
     Src152Grp src152Grp = TestnumCtx.this.getSrc152Grp();
     Work work = TestnumCtx.this.getWork();
     Tgt150Grp tgt150Grp = TestnumCtx.this.getTgt150Grp();
     Src150Grp src150Grp = TestnumCtx.this.getSrc150Grp();
     Tgt154Grp tgt154Grp = TestnumCtx.this.getTgt154Grp();

	/**
	 *	Returns the value of src151
	 *	@return src151
	 */
	public int getSrc151() throws CFException {        
   		return work.getSrc151();
	}
	
	/**
	 * 	Update Src151 with the passed value
	 *	@param number
	 */
	public void setSrc151(int number)  throws CFException{
		work.setSrc151(number);
	}


	public void setSrc151(long number)  throws CFException{
		work.setSrc151((int)number);
	}


	/**
	 *	Returns the value of tgt152
	 *	@return tgt152
	 */
	public long getTgt152() throws CFException {
   		return work.getTgt152();
	}


	/**
	 *	Returns String value of tgt152
	 *	@return tgt152
	 */
	public char[]  getTgt152String() throws CFException {
	     return String.valueOf(work.getTgt152String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt152IsNumeric()  throws CFException{
	    return work.tgt152IsNumeric();
	}

	/**
	 * 	Update Tgt152 with the passed value
	 *	@param number
	 */
	public void setTgt152(long number)  throws CFException{
		work.setTgt152(number);
	}
	

	
	/**
	 * 	Update Tgt152 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt152(char[] value)  throws CFException {
		work.setTgt152(value);
	}
	
	/**
	 * 	Update Tgt152 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt152String(char[] value)  throws CFException{
		work.setTgt152(value);
	}	

	/**
	 *	Returns the value of tgt153
	 *	@return tgt153
	 */
	public long getTgt153(int index) throws CFException {
   		return tgt153Grp.getTgt153((index));
	}


	/**
	 *	Returns String value of tgt153
	 *	@return tgt153
	 */
	public char[]  getTgt153String(int index) throws CFException {
	     return String.valueOf(tgt153Grp.getTgt153String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt153IsNumeric(int index)  throws CFException{
	    return tgt153Grp.tgt153IsNumeric(index);
	}

	/**
	 * 	Update Tgt153 with the passed value
	 *	@param number
	 */
	public void setTgt153(int index,long number)  throws CFException{
		tgt153Grp.setTgt153((index),number);
	}
	

	
	/**
	 * 	Update Tgt153 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt153(int index,char[] value)  throws CFException {
		tgt153Grp.setTgt153((index),value);
	}
	
	/**
	 * 	Update Tgt153 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt153String(int index,char[] value)  throws CFException{
		tgt153Grp.setTgt153((index),value);
	}	

	/**
	 *	Returns the value of tgt155
	 *	@return tgt155
	 */
	public long getTgt155() throws CFException {
   		return work.getTgt155();
	}


	/**
	 *	Returns String value of tgt155
	 *	@return tgt155
	 */
	public char[]  getTgt155String() throws CFException {
	     return String.valueOf(work.getTgt155String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt155IsNumeric()  throws CFException{
	    return work.tgt155IsNumeric();
	}

	/**
	 * 	Update Tgt155 with the passed value
	 *	@param number
	 */
	public void setTgt155(long number)  throws CFException{
		work.setTgt155(number);
	}
	

	
	/**
	 * 	Update Tgt155 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt155(char[] value)  throws CFException {
		work.setTgt155(value);
	}
	
	/**
	 * 	Update Tgt155 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt155String(char[] value)  throws CFException{
		work.setTgt155(value);
	}	

	/**
	 *	Returns the value of src153
	 *	@return src153
	 */
	public int getSrc153() throws CFException {        
   		return work.getSrc153();
	}
	
	/**
	 * 	Update Src153 with the passed value
	 *	@param number
	 */
	public void setSrc153(int number)  throws CFException{
		work.setSrc153(number);
	}


	public void setSrc153(long number)  throws CFException{
		work.setSrc153((int)number);
	}


	/**
	 *	Returns the value of src152
	 *	@return src152
	 */
	public int getSrc152(int index) throws CFException {        
   		return src152Grp.getSrc152((index));
	}
	
	/**
	 * 	Update Src152 with the passed value
	 *	@param number
	 */
	public void setSrc152(int index,int number)  throws CFException{
		src152Grp.setSrc152((index),number);
	}


	public void setSrc152(int index,long number)  throws CFException{
		src152Grp.setSrc152((index),(int)number);
	}


	/**
	 *	Returns the value of tgt151
	 *	@return tgt151
	 */
	public long getTgt151() throws CFException {
   		return work.getTgt151();
	}


	/**
	 *	Returns String value of tgt151
	 *	@return tgt151
	 */
	public char[]  getTgt151String() throws CFException {
	     return String.valueOf(work.getTgt151String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt151IsNumeric()  throws CFException{
	    return work.tgt151IsNumeric();
	}

	/**
	 * 	Update Tgt151 with the passed value
	 *	@param number
	 */
	public void setTgt151(long number)  throws CFException{
		work.setTgt151(number);
	}
	

	
	/**
	 * 	Update Tgt151 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt151(char[] value)  throws CFException {
		work.setTgt151(value);
	}
	
	/**
	 * 	Update Tgt151 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt151String(char[] value)  throws CFException{
		work.setTgt151(value);
	}	

	/**
	 *	Returns the value of tgt154
	 *	@return tgt154
	 */
	public long getTgt154(int index) throws CFException {
   		return tgt154Grp.getTgt154((index));
	}


	/**
	 *	Returns String value of tgt154
	 *	@return tgt154
	 */
	public char[]  getTgt154String(int index) throws CFException {
	     return String.valueOf(tgt154Grp.getTgt154String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt154IsNumeric(int index)  throws CFException{
	    return tgt154Grp.tgt154IsNumeric(index);
	}

	/**
	 * 	Update Tgt154 with the passed value
	 *	@param number
	 */
	public void setTgt154(int index,long number)  throws CFException{
		tgt154Grp.setTgt154((index),number);
	}
	

	
	/**
	 * 	Update Tgt154 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt154(int index,char[] value)  throws CFException {
		tgt154Grp.setTgt154((index),value);
	}
	
	/**
	 * 	Update Tgt154 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt154String(int index,char[] value)  throws CFException{
		tgt154Grp.setTgt154((index),value);
	}	

	public BigDecimal getSrc155() throws CFException{      
   		return work.getSrc155();
	}

    public char[] getSrc155String() throws CFException {
          return  work.getSrc155().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src155 with the passed number
	 *	@param number
	 */
	public void setSrc155(BigDecimal number)  throws CFException{
		work.setSrc155(number);
   }

	/**
	 *	Returns the value of src154
	 *	@return src154
	 */
	public int getSrc154(int index) throws CFException {        
   		return src154Grp.getSrc154((index));
	}
	
	/**
	 * 	Update Src154 with the passed value
	 *	@param number
	 */
	public void setSrc154(int index,int number)  throws CFException{
		src154Grp.setSrc154((index),number);
	}


	public void setSrc154(int index,long number)  throws CFException{
		src154Grp.setSrc154((index),(int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt153Grp.hashCode();
        str += src154Grp.hashCode();
        str += src152Grp.hashCode();
        str += work.hashCode();
        str += tgt150Grp.hashCode();
        str += src150Grp.hashCode();
        str += tgt154Grp.hashCode();
       return str.hashCode();
    }

    public Process35Split113OutCtx clone() {
        Process35Split113OutCtx cloneObj = new Process35Split113OutCtx();
        cloneObj.tgt153Grp = new Tgt153Grp();
        cloneObj.tgt153Grp.set(tgt153Grp.getClonedField());
        cloneObj.src154Grp = new Src154Grp();
        cloneObj.src154Grp.set(src154Grp.getClonedField());
        cloneObj.src152Grp = new Src152Grp();
        cloneObj.src152Grp.set(src152Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt150Grp = new Tgt150Grp();
        cloneObj.tgt150Grp.set(tgt150Grp.getClonedField());
        cloneObj.src150Grp = new Src150Grp();
        cloneObj.src150Grp.set(src150Grp.getClonedField());
        cloneObj.tgt154Grp = new Tgt154Grp();
        cloneObj.tgt154Grp.set(tgt154Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process35Split113OutCtx getProcess35Split113OutCtx() {
            return new Process35Split113OutCtx();
    }
     public class Process36Split115InCtx implements Cloneable {
     Src156Grp src156Grp = TestnumCtx.this.getSrc156Grp();
     Work work = TestnumCtx.this.getWork();
     Tgt157Grp tgt157Grp = TestnumCtx.this.getTgt157Grp();
     Tgt158Grp tgt158Grp = TestnumCtx.this.getTgt158Grp();
     Src158Grp src158Grp = TestnumCtx.this.getSrc158Grp();

	/**
	 *	Returns the value of src160
	 *	@return src160
	 */
	public BigDecimal getSrc160() throws CFException {
   		return work.getSrc160();
	}


	 /**
     *	Returns String value of src160
     *	@return src160
     */
    public char[]  getSrc160String() throws CFException {
         return work.getSrc160String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src160IsNumeric() {
        return work.src160IsNumeric();
    }
	/**
	 * 	Update Src160 with the passed number
	 *	@param number
	 */
	public void setSrc160(BigDecimal number)  throws CFException{
		work.setSrc160(number);
   }

	/**
	 * 	Update Src160 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc160(char[] value)  throws CFException{
		work.setSrc160(value);
	}   

	/**
	 *	Returns the value of tgt160
	 *	@return tgt160
	 */
	public long getTgt160() throws CFException {
   		return work.getTgt160();
	}


	/**
	 *	Returns String value of tgt160
	 *	@return tgt160
	 */
	public char[]  getTgt160String() throws CFException {
	     return String.valueOf(work.getTgt160String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt160IsNumeric()  throws CFException{
	    return work.tgt160IsNumeric();
	}

	/**
	 * 	Update Tgt160 with the passed value
	 *	@param number
	 */
	public void setTgt160(long number)  throws CFException{
		work.setTgt160(number);
	}
	

	
	/**
	 * 	Update Tgt160 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt160(char[] value)  throws CFException {
		work.setTgt160(value);
	}
	
	/**
	 * 	Update Tgt160 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt160String(char[] value)  throws CFException{
		work.setTgt160(value);
	}	

	/**
	 *	Returns the value of tgt158
	 *	@return tgt158
	 */
	public long getTgt158(int index) throws CFException {
   		return tgt158Grp.getTgt158((index));
	}


	/**
	 *	Returns String value of tgt158
	 *	@return tgt158
	 */
	public char[]  getTgt158String(int index) throws CFException {
	     return String.valueOf(tgt158Grp.getTgt158String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt158IsNumeric(int index)  throws CFException{
	    return tgt158Grp.tgt158IsNumeric(index);
	}

	/**
	 * 	Update Tgt158 with the passed value
	 *	@param number
	 */
	public void setTgt158(int index,long number)  throws CFException{
		tgt158Grp.setTgt158((index),number);
	}
	

	
	/**
	 * 	Update Tgt158 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt158(int index,char[] value)  throws CFException {
		tgt158Grp.setTgt158((index),value);
	}
	
	/**
	 * 	Update Tgt158 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt158String(int index,char[] value)  throws CFException{
		tgt158Grp.setTgt158((index),value);
	}	

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of tgt157Grp
	 *	@return tgt157Grp
	 */   
	 public Tgt157Grp getTgt157Grp() {
   	return tgt157Grp;
   }


	/**
	 *	Returns the value of src159
	 *	@return src159
	 */
	public BigDecimal getSrc159() throws CFException {
   		return work.getSrc159();
	}


	 /**
     *	Returns String value of src159
     *	@return src159
     */
    public char[]  getSrc159String() throws CFException {
         return work.getSrc159String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src159IsNumeric() {
        return work.src159IsNumeric();
    }
	/**
	 * 	Update Src159 with the passed number
	 *	@param number
	 */
	public void setSrc159(BigDecimal number)  throws CFException{
		work.setSrc159(number);
   }

	/**
	 * 	Update Src159 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc159(char[] value)  throws CFException{
		work.setSrc159(value);
	}   

	/**
	 *	Returns the value of tgt157
	 *	@return tgt157
	 */
	public long getTgt157(int index) throws CFException {
   		return tgt157Grp.getTgt157((index));
	}


	/**
	 *	Returns String value of tgt157
	 *	@return tgt157
	 */
	public char[]  getTgt157String(int index) throws CFException {
	     return String.valueOf(tgt157Grp.getTgt157String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt157IsNumeric(int index)  throws CFException{
	    return tgt157Grp.tgt157IsNumeric(index);
	}

	/**
	 * 	Update Tgt157 with the passed value
	 *	@param number
	 */
	public void setTgt157(int index,long number)  throws CFException{
		tgt157Grp.setTgt157((index),number);
	}
	

	
	/**
	 * 	Update Tgt157 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt157(int index,char[] value)  throws CFException {
		tgt157Grp.setTgt157((index),value);
	}
	
	/**
	 * 	Update Tgt157 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt157String(int index,char[] value)  throws CFException{
		tgt157Grp.setTgt157((index),value);
	}	

	public BigDecimal getSrc158(int index) throws CFException{      
   		return src158Grp.getSrc158((index));
	}

    public char[] getSrc158String(int index) throws CFException {
          return  src158Grp.getSrc158((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src158 with the passed number
	 *	@param number
	 */
	public void setSrc158(int index,BigDecimal number)  throws CFException{
		src158Grp.setSrc158((index),number);
   }

	/**
	 *	Returns the value of tgt158Grp
	 *	@return tgt158Grp
	 */   
	 public Tgt158Grp getTgt158Grp() {
   	return tgt158Grp;
   }


	/**
	 *	Returns the value of tgt156
	 *	@return tgt156
	 */
	public long getTgt156() throws CFException {
   		return work.getTgt156();
	}


	/**
	 *	Returns String value of tgt156
	 *	@return tgt156
	 */
	public char[]  getTgt156String() throws CFException {
	     return String.valueOf(work.getTgt156String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt156IsNumeric()  throws CFException{
	    return work.tgt156IsNumeric();
	}

	/**
	 * 	Update Tgt156 with the passed value
	 *	@param number
	 */
	public void setTgt156(long number)  throws CFException{
		work.setTgt156(number);
	}
	

	
	/**
	 * 	Update Tgt156 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt156(char[] value)  throws CFException {
		work.setTgt156(value);
	}
	
	/**
	 * 	Update Tgt156 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt156String(char[] value)  throws CFException{
		work.setTgt156(value);
	}	

	public BigDecimal getSrc156(int index) throws CFException{      
   		return src156Grp.getSrc156((index));
	}

    public char[] getSrc156String(int index) throws CFException {
          return  src156Grp.getSrc156((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src156 with the passed number
	 *	@param number
	 */
	public void setSrc156(int index,BigDecimal number)  throws CFException{
		src156Grp.setSrc156((index),number);
   }

	/**
	 *	Returns the value of tgt159
	 *	@return tgt159
	 */
	public long getTgt159() throws CFException {
   		return work.getTgt159();
	}


	/**
	 *	Returns String value of tgt159
	 *	@return tgt159
	 */
	public char[]  getTgt159String() throws CFException {
	     return String.valueOf(work.getTgt159String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt159IsNumeric()  throws CFException{
	    return work.tgt159IsNumeric();
	}

	/**
	 * 	Update Tgt159 with the passed value
	 *	@param number
	 */
	public void setTgt159(long number)  throws CFException{
		work.setTgt159(number);
	}
	

	
	/**
	 * 	Update Tgt159 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt159(char[] value)  throws CFException {
		work.setTgt159(value);
	}
	
	/**
	 * 	Update Tgt159 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt159String(char[] value)  throws CFException{
		work.setTgt159(value);
	}	

	public BigDecimal getSrc157() throws CFException{      
   		return work.getSrc157();
	}

    public char[] getSrc157String() throws CFException {
          return  work.getSrc157().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src157 with the passed number
	 *	@param number
	 */
	public void setSrc157(BigDecimal number)  throws CFException{
		work.setSrc157(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process36Split115OutCtx getProcess36Split115OutCtx() {
            return new Process36Split115OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src156Grp.hashCode();
        str += work.hashCode();
        str += tgt157Grp.hashCode();
        str += tgt158Grp.hashCode();
        str += src158Grp.hashCode();
       return str.hashCode();
    }

    public Process36Split115InCtx clone() {
        Process36Split115InCtx cloneObj = new Process36Split115InCtx();
        cloneObj.src156Grp = new Src156Grp();
        cloneObj.src156Grp.set(src156Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt157Grp = new Tgt157Grp();
        cloneObj.tgt157Grp.set(tgt157Grp.getClonedField());
        cloneObj.tgt158Grp = new Tgt158Grp();
        cloneObj.tgt158Grp.set(tgt158Grp.getClonedField());
        cloneObj.src158Grp = new Src158Grp();
        cloneObj.src158Grp.set(src158Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process36Split115InCtx getProcess36Split115InCtx() {
            return new Process36Split115InCtx();
    }
     public class Process36Split115OutCtx implements Cloneable {
     Src156Grp src156Grp = TestnumCtx.this.getSrc156Grp();
     Work work = TestnumCtx.this.getWork();
     Tgt157Grp tgt157Grp = TestnumCtx.this.getTgt157Grp();
     Tgt158Grp tgt158Grp = TestnumCtx.this.getTgt158Grp();
     Src158Grp src158Grp = TestnumCtx.this.getSrc158Grp();

	/**
	 *	Returns the value of src160
	 *	@return src160
	 */
	public BigDecimal getSrc160() throws CFException {
   		return work.getSrc160();
	}


	 /**
     *	Returns String value of src160
     *	@return src160
     */
    public char[]  getSrc160String() throws CFException {
         return work.getSrc160String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src160IsNumeric() {
        return work.src160IsNumeric();
    }
	/**
	 * 	Update Src160 with the passed number
	 *	@param number
	 */
	public void setSrc160(BigDecimal number)  throws CFException{
		work.setSrc160(number);
   }

	/**
	 * 	Update Src160 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc160(char[] value)  throws CFException{
		work.setSrc160(value);
	}   

	/**
	 *	Returns the value of tgt160
	 *	@return tgt160
	 */
	public long getTgt160() throws CFException {
   		return work.getTgt160();
	}


	/**
	 *	Returns String value of tgt160
	 *	@return tgt160
	 */
	public char[]  getTgt160String() throws CFException {
	     return String.valueOf(work.getTgt160String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt160IsNumeric()  throws CFException{
	    return work.tgt160IsNumeric();
	}

	/**
	 * 	Update Tgt160 with the passed value
	 *	@param number
	 */
	public void setTgt160(long number)  throws CFException{
		work.setTgt160(number);
	}
	

	
	/**
	 * 	Update Tgt160 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt160(char[] value)  throws CFException {
		work.setTgt160(value);
	}
	
	/**
	 * 	Update Tgt160 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt160String(char[] value)  throws CFException{
		work.setTgt160(value);
	}	

	/**
	 *	Returns the value of tgt158
	 *	@return tgt158
	 */
	public long getTgt158(int index) throws CFException {
   		return tgt158Grp.getTgt158((index));
	}


	/**
	 *	Returns String value of tgt158
	 *	@return tgt158
	 */
	public char[]  getTgt158String(int index) throws CFException {
	     return String.valueOf(tgt158Grp.getTgt158String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt158IsNumeric(int index)  throws CFException{
	    return tgt158Grp.tgt158IsNumeric(index);
	}

	/**
	 * 	Update Tgt158 with the passed value
	 *	@param number
	 */
	public void setTgt158(int index,long number)  throws CFException{
		tgt158Grp.setTgt158((index),number);
	}
	

	
	/**
	 * 	Update Tgt158 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt158(int index,char[] value)  throws CFException {
		tgt158Grp.setTgt158((index),value);
	}
	
	/**
	 * 	Update Tgt158 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt158String(int index,char[] value)  throws CFException{
		tgt158Grp.setTgt158((index),value);
	}	

	/**
	 *	Returns the value of tgt157
	 *	@return tgt157
	 */
	public long getTgt157(int index) throws CFException {
   		return tgt157Grp.getTgt157((index));
	}


	/**
	 *	Returns String value of tgt157
	 *	@return tgt157
	 */
	public char[]  getTgt157String(int index) throws CFException {
	     return String.valueOf(tgt157Grp.getTgt157String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt157IsNumeric(int index)  throws CFException{
	    return tgt157Grp.tgt157IsNumeric(index);
	}

	/**
	 * 	Update Tgt157 with the passed value
	 *	@param number
	 */
	public void setTgt157(int index,long number)  throws CFException{
		tgt157Grp.setTgt157((index),number);
	}
	

	
	/**
	 * 	Update Tgt157 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt157(int index,char[] value)  throws CFException {
		tgt157Grp.setTgt157((index),value);
	}
	
	/**
	 * 	Update Tgt157 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt157String(int index,char[] value)  throws CFException{
		tgt157Grp.setTgt157((index),value);
	}	

	public BigDecimal getSrc158(int index) throws CFException{      
   		return src158Grp.getSrc158((index));
	}

    public char[] getSrc158String(int index) throws CFException {
          return  src158Grp.getSrc158((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src158 with the passed number
	 *	@param number
	 */
	public void setSrc158(int index,BigDecimal number)  throws CFException{
		src158Grp.setSrc158((index),number);
   }

	/**
	 *	Returns the value of tgt156
	 *	@return tgt156
	 */
	public long getTgt156() throws CFException {
   		return work.getTgt156();
	}


	/**
	 *	Returns String value of tgt156
	 *	@return tgt156
	 */
	public char[]  getTgt156String() throws CFException {
	     return String.valueOf(work.getTgt156String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt156IsNumeric()  throws CFException{
	    return work.tgt156IsNumeric();
	}

	/**
	 * 	Update Tgt156 with the passed value
	 *	@param number
	 */
	public void setTgt156(long number)  throws CFException{
		work.setTgt156(number);
	}
	

	
	/**
	 * 	Update Tgt156 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt156(char[] value)  throws CFException {
		work.setTgt156(value);
	}
	
	/**
	 * 	Update Tgt156 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt156String(char[] value)  throws CFException{
		work.setTgt156(value);
	}	

	public BigDecimal getSrc156(int index) throws CFException{      
   		return src156Grp.getSrc156((index));
	}

    public char[] getSrc156String(int index) throws CFException {
          return  src156Grp.getSrc156((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src156 with the passed number
	 *	@param number
	 */
	public void setSrc156(int index,BigDecimal number)  throws CFException{
		src156Grp.setSrc156((index),number);
   }

	/**
	 *	Returns the value of src159
	 *	@return src159
	 */
	public BigDecimal getSrc159() throws CFException {
   		return work.getSrc159();
	}


	 /**
     *	Returns String value of src159
     *	@return src159
     */
    public char[]  getSrc159String() throws CFException {
         return work.getSrc159String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src159IsNumeric() {
        return work.src159IsNumeric();
    }
	/**
	 * 	Update Src159 with the passed number
	 *	@param number
	 */
	public void setSrc159(BigDecimal number)  throws CFException{
		work.setSrc159(number);
   }

	/**
	 * 	Update Src159 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc159(char[] value)  throws CFException{
		work.setSrc159(value);
	}   

	/**
	 *	Returns the value of tgt159
	 *	@return tgt159
	 */
	public long getTgt159() throws CFException {
   		return work.getTgt159();
	}


	/**
	 *	Returns String value of tgt159
	 *	@return tgt159
	 */
	public char[]  getTgt159String() throws CFException {
	     return String.valueOf(work.getTgt159String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt159IsNumeric()  throws CFException{
	    return work.tgt159IsNumeric();
	}

	/**
	 * 	Update Tgt159 with the passed value
	 *	@param number
	 */
	public void setTgt159(long number)  throws CFException{
		work.setTgt159(number);
	}
	

	
	/**
	 * 	Update Tgt159 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt159(char[] value)  throws CFException {
		work.setTgt159(value);
	}
	
	/**
	 * 	Update Tgt159 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt159String(char[] value)  throws CFException{
		work.setTgt159(value);
	}	

	public BigDecimal getSrc157() throws CFException{      
   		return work.getSrc157();
	}

    public char[] getSrc157String() throws CFException {
          return  work.getSrc157().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src157 with the passed number
	 *	@param number
	 */
	public void setSrc157(BigDecimal number)  throws CFException{
		work.setSrc157(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src156Grp.hashCode();
        str += work.hashCode();
        str += tgt157Grp.hashCode();
        str += tgt158Grp.hashCode();
        str += src158Grp.hashCode();
       return str.hashCode();
    }

    public Process36Split115OutCtx clone() {
        Process36Split115OutCtx cloneObj = new Process36Split115OutCtx();
        cloneObj.src156Grp = new Src156Grp();
        cloneObj.src156Grp.set(src156Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt157Grp = new Tgt157Grp();
        cloneObj.tgt157Grp.set(tgt157Grp.getClonedField());
        cloneObj.tgt158Grp = new Tgt158Grp();
        cloneObj.tgt158Grp.set(tgt158Grp.getClonedField());
        cloneObj.src158Grp = new Src158Grp();
        cloneObj.src158Grp.set(src158Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process36Split115OutCtx getProcess36Split115OutCtx() {
            return new Process36Split115OutCtx();
    }
     public class Process37Split117InCtx implements Cloneable {
     Tgt165Grp tgt165Grp = TestnumCtx.this.getTgt165Grp();
     Tgt162Grp tgt162Grp = TestnumCtx.this.getTgt162Grp();
     Work work = TestnumCtx.this.getWork();
     Src164Grp src164Grp = TestnumCtx.this.getSrc164Grp();
     Tgt161Grp tgt161Grp = TestnumCtx.this.getTgt161Grp();

	/**
	 *	Returns the value of tgt165Grp
	 *	@return tgt165Grp
	 */   
	 public Tgt165Grp getTgt165Grp() {
   	return tgt165Grp;
   }


	/**
	 *	Returns the value of tgt162Grp
	 *	@return tgt162Grp
	 */   
	 public Tgt162Grp getTgt162Grp() {
   	return tgt162Grp;
   }


	/**
	 *	Returns the value of tgt162
	 *	@return tgt162
	 */
	public long getTgt162(int index) throws CFException {
   		return tgt162Grp.getTgt162((index));
	}


	/**
	 *	Returns String value of tgt162
	 *	@return tgt162
	 */
	public char[]  getTgt162String(int index) throws CFException {
	     return String.valueOf(tgt162Grp.getTgt162String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt162IsNumeric(int index)  throws CFException{
	    return tgt162Grp.tgt162IsNumeric(index);
	}

	/**
	 * 	Update Tgt162 with the passed value
	 *	@param number
	 */
	public void setTgt162(int index,long number)  throws CFException{
		tgt162Grp.setTgt162((index),number);
	}
	

	
	/**
	 * 	Update Tgt162 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt162(int index,char[] value)  throws CFException {
		tgt162Grp.setTgt162((index),value);
	}
	
	/**
	 * 	Update Tgt162 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt162String(int index,char[] value)  throws CFException{
		tgt162Grp.setTgt162((index),value);
	}	

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of tgt161
	 *	@return tgt161
	 */
	public long getTgt161(int index) throws CFException {
   		return tgt161Grp.getTgt161((index));
	}


	/**
	 *	Returns String value of tgt161
	 *	@return tgt161
	 */
	public char[]  getTgt161String(int index) throws CFException {
	     return String.valueOf(tgt161Grp.getTgt161String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt161IsNumeric(int index)  throws CFException{
	    return tgt161Grp.tgt161IsNumeric(index);
	}

	/**
	 * 	Update Tgt161 with the passed value
	 *	@param number
	 */
	public void setTgt161(int index,long number)  throws CFException{
		tgt161Grp.setTgt161((index),number);
	}
	

	
	/**
	 * 	Update Tgt161 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt161(int index,char[] value)  throws CFException {
		tgt161Grp.setTgt161((index),value);
	}
	
	/**
	 * 	Update Tgt161 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt161String(int index,char[] value)  throws CFException{
		tgt161Grp.setTgt161((index),value);
	}	

	/**
	 *	Returns the value of src161
	 *	@return src161
	 */
	public BigDecimal getSrc161() throws CFException {
   		return work.getSrc161();
	}


	 /**
     *	Returns String value of src161
     *	@return src161
     */
    public char[]  getSrc161String() throws CFException {
         return work.getSrc161String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src161IsNumeric() {
        return work.src161IsNumeric();
    }
	/**
	 * 	Update Src161 with the passed number
	 *	@param number
	 */
	public void setSrc161(BigDecimal number)  throws CFException{
		work.setSrc161(number);
   }

	/**
	 * 	Update Src161 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc161(char[] value)  throws CFException{
		work.setSrc161(value);
	}   

	/**
	 *	Returns the value of src162
	 *	@return src162
	 */
	public BigDecimal getSrc162() throws CFException {
   		return work.getSrc162();
	}


	 /**
     *	Returns String value of src162
     *	@return src162
     */
    public char[]  getSrc162String() throws CFException {
         return work.getSrc162String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src162IsNumeric() {
        return work.src162IsNumeric();
    }
	/**
	 * 	Update Src162 with the passed number
	 *	@param number
	 */
	public void setSrc162(BigDecimal number)  throws CFException{
		work.setSrc162(number);
   }

	/**
	 * 	Update Src162 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc162(char[] value)  throws CFException{
		work.setSrc162(value);
	}   

	/**
	 *	Returns the value of tgt161Grp
	 *	@return tgt161Grp
	 */   
	 public Tgt161Grp getTgt161Grp() {
   	return tgt161Grp;
   }



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process37Split117OutCtx getProcess37Split117OutCtx() {
            return new Process37Split117OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt165Grp.hashCode();
        str += tgt162Grp.hashCode();
        str += work.hashCode();
        str += src164Grp.hashCode();
        str += tgt161Grp.hashCode();
       return str.hashCode();
    }

    public Process37Split117InCtx clone() {
        Process37Split117InCtx cloneObj = new Process37Split117InCtx();
        cloneObj.tgt165Grp = new Tgt165Grp();
        cloneObj.tgt165Grp.set(tgt165Grp.getClonedField());
        cloneObj.tgt162Grp = new Tgt162Grp();
        cloneObj.tgt162Grp.set(tgt162Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.src164Grp = new Src164Grp();
        cloneObj.src164Grp.set(src164Grp.getClonedField());
        cloneObj.tgt161Grp = new Tgt161Grp();
        cloneObj.tgt161Grp.set(tgt161Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process37Split117InCtx getProcess37Split117InCtx() {
            return new Process37Split117InCtx();
    }
     public class Process37Split117OutCtx implements Cloneable {
     Tgt165Grp tgt165Grp = TestnumCtx.this.getTgt165Grp();
     Tgt162Grp tgt162Grp = TestnumCtx.this.getTgt162Grp();
     Work work = TestnumCtx.this.getWork();
     Src164Grp src164Grp = TestnumCtx.this.getSrc164Grp();
     Tgt161Grp tgt161Grp = TestnumCtx.this.getTgt161Grp();

	/**
	 *	Returns the value of tgt163
	 *	@return tgt163
	 */
	public long getTgt163() throws CFException {
   		return work.getTgt163();
	}


	/**
	 *	Returns String value of tgt163
	 *	@return tgt163
	 */
	public char[]  getTgt163String() throws CFException {
	     return String.valueOf(work.getTgt163String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt163IsNumeric()  throws CFException{
	    return work.tgt163IsNumeric();
	}

	/**
	 * 	Update Tgt163 with the passed value
	 *	@param number
	 */
	public void setTgt163(long number)  throws CFException{
		work.setTgt163(number);
	}
	

	
	/**
	 * 	Update Tgt163 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt163(char[] value)  throws CFException {
		work.setTgt163(value);
	}
	
	/**
	 * 	Update Tgt163 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt163String(char[] value)  throws CFException{
		work.setTgt163(value);
	}	

	/**
	 *	Returns the value of src164
	 *	@return src164
	 */
   public char[] getSrc164(int index) throws CFException  {              
   		return src164Grp.getSrc164(index);
   }

  
	/**
	*  set variable src164
	*  @param value
	**/
   public void setSrc164(int index,char[] value) throws CFException {
      src164Grp.setSrc164((index),value);
   } 

	/**
	 *	Returns the value of tgt165
	 *	@return tgt165
	 */
	public long getTgt165(int index) throws CFException {
   		return tgt165Grp.getTgt165((index));
	}


	/**
	 *	Returns String value of tgt165
	 *	@return tgt165
	 */
	public char[]  getTgt165String(int index) throws CFException {
	     return String.valueOf(tgt165Grp.getTgt165String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt165IsNumeric(int index)  throws CFException{
	    return tgt165Grp.tgt165IsNumeric(index);
	}

	/**
	 * 	Update Tgt165 with the passed value
	 *	@param number
	 */
	public void setTgt165(int index,long number)  throws CFException{
		tgt165Grp.setTgt165((index),number);
	}
	

	
	/**
	 * 	Update Tgt165 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt165(int index,char[] value)  throws CFException {
		tgt165Grp.setTgt165((index),value);
	}
	
	/**
	 * 	Update Tgt165 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt165String(int index,char[] value)  throws CFException{
		tgt165Grp.setTgt165((index),value);
	}	

	/**
	 *	Returns the value of src165
	 *	@return src165
	 */
   public char[] getSrc165() throws CFException  {              
   		return work.getSrc165();
   }

  
	/**
	*  set variable src165
	*  @param value
	**/
   public void setSrc165(char[] value) throws CFException {
      work.setSrc165(value);
   } 

     /**
	 * 	Update Src165 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc165(char[] source, int sourceIndex) throws CFException {
      work.setSrc165(source, sourceIndex);
   	
   }
   
   public void setSrc165(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc165(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src165 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc165(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc165(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src165 with another Field
	 *	@param value
	 */
   public void setSrc165(Field source) {
      work.setSrc165(source);
   }  
   
     /**
	 * 	Update Src165 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc165(Field source, int sourceIndex,int sourceLen) {
      work.setSrc165(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src165 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc165(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc165(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt162
	 *	@return tgt162
	 */
	public long getTgt162(int index) throws CFException {
   		return tgt162Grp.getTgt162((index));
	}


	/**
	 *	Returns String value of tgt162
	 *	@return tgt162
	 */
	public char[]  getTgt162String(int index) throws CFException {
	     return String.valueOf(tgt162Grp.getTgt162String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt162IsNumeric(int index)  throws CFException{
	    return tgt162Grp.tgt162IsNumeric(index);
	}

	/**
	 * 	Update Tgt162 with the passed value
	 *	@param number
	 */
	public void setTgt162(int index,long number)  throws CFException{
		tgt162Grp.setTgt162((index),number);
	}
	

	
	/**
	 * 	Update Tgt162 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt162(int index,char[] value)  throws CFException {
		tgt162Grp.setTgt162((index),value);
	}
	
	/**
	 * 	Update Tgt162 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt162String(int index,char[] value)  throws CFException{
		tgt162Grp.setTgt162((index),value);
	}	

	/**
	 *	Returns the value of tgt164
	 *	@return tgt164
	 */
	public long getTgt164() throws CFException {
   		return work.getTgt164();
	}


	/**
	 *	Returns String value of tgt164
	 *	@return tgt164
	 */
	public char[]  getTgt164String() throws CFException {
	     return String.valueOf(work.getTgt164String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt164IsNumeric()  throws CFException{
	    return work.tgt164IsNumeric();
	}

	/**
	 * 	Update Tgt164 with the passed value
	 *	@param number
	 */
	public void setTgt164(long number)  throws CFException{
		work.setTgt164(number);
	}
	

	
	/**
	 * 	Update Tgt164 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt164(char[] value)  throws CFException {
		work.setTgt164(value);
	}
	
	/**
	 * 	Update Tgt164 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt164String(char[] value)  throws CFException{
		work.setTgt164(value);
	}	

	/**
	 *	Returns the value of tgt161
	 *	@return tgt161
	 */
	public long getTgt161(int index) throws CFException {
   		return tgt161Grp.getTgt161((index));
	}


	/**
	 *	Returns String value of tgt161
	 *	@return tgt161
	 */
	public char[]  getTgt161String(int index) throws CFException {
	     return String.valueOf(tgt161Grp.getTgt161String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt161IsNumeric(int index)  throws CFException{
	    return tgt161Grp.tgt161IsNumeric(index);
	}

	/**
	 * 	Update Tgt161 with the passed value
	 *	@param number
	 */
	public void setTgt161(int index,long number)  throws CFException{
		tgt161Grp.setTgt161((index),number);
	}
	

	
	/**
	 * 	Update Tgt161 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt161(int index,char[] value)  throws CFException {
		tgt161Grp.setTgt161((index),value);
	}
	
	/**
	 * 	Update Tgt161 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt161String(int index,char[] value)  throws CFException{
		tgt161Grp.setTgt161((index),value);
	}	

	/**
	 *	Returns the value of src163
	 *	@return src163
	 */
   public char[] getSrc163() throws CFException  {              
   		return work.getSrc163();
   }

  
	/**
	*  set variable src163
	*  @param value
	**/
   public void setSrc163(char[] value) throws CFException {
      work.setSrc163(value);
   } 

     /**
	 * 	Update Src163 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc163(char[] source, int sourceIndex) throws CFException {
      work.setSrc163(source, sourceIndex);
   	
   }
   
   public void setSrc163(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc163(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src163 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc163(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc163(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src163 with another Field
	 *	@param value
	 */
   public void setSrc163(Field source) {
      work.setSrc163(source);
   }  
   
     /**
	 * 	Update Src163 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc163(Field source, int sourceIndex,int sourceLen) {
      work.setSrc163(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src163 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc163(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc163(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src161
	 *	@return src161
	 */
	public BigDecimal getSrc161() throws CFException {
   		return work.getSrc161();
	}


	 /**
     *	Returns String value of src161
     *	@return src161
     */
    public char[]  getSrc161String() throws CFException {
         return work.getSrc161String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src161IsNumeric() {
        return work.src161IsNumeric();
    }
	/**
	 * 	Update Src161 with the passed number
	 *	@param number
	 */
	public void setSrc161(BigDecimal number)  throws CFException{
		work.setSrc161(number);
   }

	/**
	 * 	Update Src161 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc161(char[] value)  throws CFException{
		work.setSrc161(value);
	}   

	/**
	 *	Returns the value of src162
	 *	@return src162
	 */
	public BigDecimal getSrc162() throws CFException {
   		return work.getSrc162();
	}


	 /**
     *	Returns String value of src162
     *	@return src162
     */
    public char[]  getSrc162String() throws CFException {
         return work.getSrc162String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src162IsNumeric() {
        return work.src162IsNumeric();
    }
	/**
	 * 	Update Src162 with the passed number
	 *	@param number
	 */
	public void setSrc162(BigDecimal number)  throws CFException{
		work.setSrc162(number);
   }

	/**
	 * 	Update Src162 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc162(char[] value)  throws CFException{
		work.setSrc162(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt165Grp.hashCode();
        str += tgt162Grp.hashCode();
        str += work.hashCode();
        str += src164Grp.hashCode();
        str += tgt161Grp.hashCode();
       return str.hashCode();
    }

    public Process37Split117OutCtx clone() {
        Process37Split117OutCtx cloneObj = new Process37Split117OutCtx();
        cloneObj.tgt165Grp = new Tgt165Grp();
        cloneObj.tgt165Grp.set(tgt165Grp.getClonedField());
        cloneObj.tgt162Grp = new Tgt162Grp();
        cloneObj.tgt162Grp.set(tgt162Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.src164Grp = new Src164Grp();
        cloneObj.src164Grp.set(src164Grp.getClonedField());
        cloneObj.tgt161Grp = new Tgt161Grp();
        cloneObj.tgt161Grp.set(tgt161Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process37Split117OutCtx getProcess37Split117OutCtx() {
            return new Process37Split117OutCtx();
    }
     public class Process38Split119InCtx implements Cloneable {
     Src166Grp src166Grp = TestnumCtx.this.getSrc166Grp();
     Tgt166Grp tgt166Grp = TestnumCtx.this.getTgt166Grp();
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt166Grp
	 *	@return tgt166Grp
	 */   
	 public Tgt166Grp getTgt166Grp() {
   	return tgt166Grp;
   }



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process38Split119OutCtx getProcess38Split119OutCtx() {
            return new Process38Split119OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src166Grp.hashCode();
        str += tgt166Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process38Split119InCtx clone() {
        Process38Split119InCtx cloneObj = new Process38Split119InCtx();
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt166Grp = new Tgt166Grp();
        cloneObj.tgt166Grp.set(tgt166Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process38Split119InCtx getProcess38Split119InCtx() {
            return new Process38Split119InCtx();
    }
     public class Process38Split119OutCtx implements Cloneable {
     Src166Grp src166Grp = TestnumCtx.this.getSrc166Grp();
     Tgt166Grp tgt166Grp = TestnumCtx.this.getTgt166Grp();
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src168
	 *	@return src168
	 */
	public short getSrc168() throws CFException {        
   		return work.getSrc168();
	}
	
	/**
	 * 	Update Src168 with the passed value
	 *	@param number
	 */
	public void setSrc168(short number)  throws CFException{
		work.setSrc168(number);
	}

	public void setSrc168(int number)  throws CFException{
		work.setSrc168((short)number);
	}

	public void setSrc168(long number)  throws CFException{
		work.setSrc168((short)number);
	}



	/**
	 *	Returns the value of tgt170
	 *	@return tgt170
	 */
	public long getTgt170() throws CFException {        
   		return work.getTgt170();
	}
	
	/**
	 * 	Update Tgt170 with the passed value
	 *	@param number
	 */
	public void setTgt170(long number)  throws CFException{
		work.setTgt170(number);
	}



	/**
	 *	Returns the value of tgt166
	 *	@return tgt166
	 */
	public long getTgt166(int index) throws CFException {
   		return tgt166Grp.getTgt166((index));
	}


	/**
	 *	Returns String value of tgt166
	 *	@return tgt166
	 */
	public char[]  getTgt166String(int index) throws CFException {
	     return String.valueOf(tgt166Grp.getTgt166String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt166IsNumeric(int index)  throws CFException{
	    return tgt166Grp.tgt166IsNumeric(index);
	}

	/**
	 * 	Update Tgt166 with the passed value
	 *	@param number
	 */
	public void setTgt166(int index,long number)  throws CFException{
		tgt166Grp.setTgt166((index),number);
	}
	

	
	/**
	 * 	Update Tgt166 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt166(int index,char[] value)  throws CFException {
		tgt166Grp.setTgt166((index),value);
	}
	
	/**
	 * 	Update Tgt166 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt166String(int index,char[] value)  throws CFException{
		tgt166Grp.setTgt166((index),value);
	}	

	/**
	 *	Returns the value of src169
	 *	@return src169
	 */
	public short getSrc169() throws CFException {        
   		return work.getSrc169();
	}
	
	/**
	 * 	Update Src169 with the passed value
	 *	@param number
	 */
	public void setSrc169(short number)  throws CFException{
		work.setSrc169(number);
	}

	public void setSrc169(int number)  throws CFException{
		work.setSrc169((short)number);
	}

	public void setSrc169(long number)  throws CFException{
		work.setSrc169((short)number);
	}



	/**
	 *	Returns the value of src167
	 *	@return src167
	 */
	public short getSrc167() throws CFException {        
   		return work.getSrc167();
	}
	
	/**
	 * 	Update Src167 with the passed value
	 *	@param number
	 */
	public void setSrc167(short number)  throws CFException{
		work.setSrc167(number);
	}

	public void setSrc167(int number)  throws CFException{
		work.setSrc167((short)number);
	}

	public void setSrc167(long number)  throws CFException{
		work.setSrc167((short)number);
	}



	/**
	 *	Returns the value of tgt169
	 *	@return tgt169
	 */
	public long getTgt169() throws CFException {        
   		return work.getTgt169();
	}
	
	/**
	 * 	Update Tgt169 with the passed value
	 *	@param number
	 */
	public void setTgt169(long number)  throws CFException{
		work.setTgt169(number);
	}



	/**
	 *	Returns the value of src170
	 *	@return src170
	 */
	public int getSrc170() throws CFException {        
   		return work.getSrc170();
	}
	
	/**
	 * 	Update Src170 with the passed value
	 *	@param number
	 */
	public void setSrc170(int number)  throws CFException{
		work.setSrc170(number);
	}


	public void setSrc170(long number)  throws CFException{
		work.setSrc170((int)number);
	}


	/**
	 *	Returns the value of tgt168
	 *	@return tgt168
	 */
	public int getTgt168() throws CFException {        
   		return work.getTgt168();
	}
	
	/**
	 * 	Update Tgt168 with the passed value
	 *	@param number
	 */
	public void setTgt168(int number)  throws CFException{
		work.setTgt168(number);
	}


	public void setTgt168(long number)  throws CFException{
		work.setTgt168((int)number);
	}


	/**
	 *	Returns the value of src166
	 *	@return src166
	 */
   public char[] getSrc166(int index) throws CFException  {              
   		return src166Grp.getSrc166(index);
   }

  
	/**
	*  set variable src166
	*  @param value
	**/
   public void setSrc166(int index,char[] value) throws CFException {
      src166Grp.setSrc166((index),value);
   } 

	/**
	 *	Returns the value of tgt167
	 *	@return tgt167
	 */
   public char[] getTgt167() throws CFException  {              
   		return work.getTgt167();
   }

  
	/**
	*  set variable tgt167
	*  @param value
	**/
   public void setTgt167(char[] value) throws CFException {
      work.setTgt167(value);
   } 

     /**
	 * 	Update Tgt167 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt167(char[] source, int sourceIndex) throws CFException {
      work.setTgt167(source, sourceIndex);
   	
   }
   
   public void setTgt167(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt167(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt167 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt167(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt167(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt167 with another Field
	 *	@param value
	 */
   public void setTgt167(Field source) {
      work.setTgt167(source);
   }  
   
     /**
	 * 	Update Tgt167 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt167(Field source, int sourceIndex,int sourceLen) {
      work.setTgt167(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt167 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt167(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt167(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src166Grp.hashCode();
        str += tgt166Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process38Split119OutCtx clone() {
        Process38Split119OutCtx cloneObj = new Process38Split119OutCtx();
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt166Grp = new Tgt166Grp();
        cloneObj.tgt166Grp.set(tgt166Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process38Split119OutCtx getProcess38Split119OutCtx() {
            return new Process38Split119OutCtx();
    }
     public class Process39Split121InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt170
	 *	@return tgt170
	 */
	public long getTgt170() throws CFException {        
   		return work.getTgt170();
	}
	
	/**
	 * 	Update Tgt170 with the passed value
	 *	@param number
	 */
	public void setTgt170(long number)  throws CFException{
		work.setTgt170(number);
	}



	/**
	 *	Returns the value of src171
	 *	@return src171
	 */
	public int getSrc171() throws CFException {        
   		return work.getSrc171();
	}
	
	/**
	 * 	Update Src171 with the passed value
	 *	@param number
	 */
	public void setSrc171(int number)  throws CFException{
		work.setSrc171(number);
	}


	public void setSrc171(long number)  throws CFException{
		work.setSrc171((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process39Split121OutCtx getProcess39Split121OutCtx() {
            return new Process39Split121OutCtx();
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

    public Process39Split121InCtx clone() {
        Process39Split121InCtx cloneObj = new Process39Split121InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process39Split121InCtx getProcess39Split121InCtx() {
            return new Process39Split121InCtx();
    }
     public class Process39Split121OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt173
	 *	@return tgt173
	 */
	public long getTgt173() throws CFException {        
   		return work.getTgt173();
	}
	
	/**
	 * 	Update Tgt173 with the passed value
	 *	@param number
	 */
	public void setTgt173(long number)  throws CFException{
		work.setTgt173(number);
	}



	/**
	 *	Returns the value of tgt170
	 *	@return tgt170
	 */
	public long getTgt170() throws CFException {        
   		return work.getTgt170();
	}
	
	/**
	 * 	Update Tgt170 with the passed value
	 *	@param number
	 */
	public void setTgt170(long number)  throws CFException{
		work.setTgt170(number);
	}



	/**
	 *	Returns the value of src174
	 *	@return src174
	 */
	public int getSrc174() throws CFException {        
   		return work.getSrc174();
	}
	
	/**
	 * 	Update Src174 with the passed value
	 *	@param number
	 */
	public void setSrc174(int number)  throws CFException{
		work.setSrc174(number);
	}


	public void setSrc174(long number)  throws CFException{
		work.setSrc174((int)number);
	}


	/**
	 *	Returns the value of src171
	 *	@return src171
	 */
	public int getSrc171() throws CFException {        
   		return work.getSrc171();
	}
	
	/**
	 * 	Update Src171 with the passed value
	 *	@param number
	 */
	public void setSrc171(int number)  throws CFException{
		work.setSrc171(number);
	}


	public void setSrc171(long number)  throws CFException{
		work.setSrc171((int)number);
	}


	/**
	 *	Returns the value of tgt172
	 *	@return tgt172
	 */
   public char[] getTgt172() throws CFException  {              
   		return work.getTgt172();
   }

  
	/**
	*  set variable tgt172
	*  @param value
	**/
   public void setTgt172(char[] value) throws CFException {
      work.setTgt172(value);
   } 

     /**
	 * 	Update Tgt172 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt172(char[] source, int sourceIndex) throws CFException {
      work.setTgt172(source, sourceIndex);
   	
   }
   
   public void setTgt172(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt172(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt172 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt172(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt172(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt172 with another Field
	 *	@param value
	 */
   public void setTgt172(Field source) {
      work.setTgt172(source);
   }  
   
     /**
	 * 	Update Tgt172 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt172(Field source, int sourceIndex,int sourceLen) {
      work.setTgt172(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt172 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt172(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt172(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt174
	 *	@return tgt174
	 */
	public long getTgt174() throws CFException {        
   		return work.getTgt174();
	}
	
	/**
	 * 	Update Tgt174 with the passed value
	 *	@param number
	 */
	public void setTgt174(long number)  throws CFException{
		work.setTgt174(number);
	}



	/**
	 *	Returns the value of src170
	 *	@return src170
	 */
	public int getSrc170() throws CFException {        
   		return work.getSrc170();
	}
	
	/**
	 * 	Update Src170 with the passed value
	 *	@param number
	 */
	public void setSrc170(int number)  throws CFException{
		work.setSrc170(number);
	}


	public void setSrc170(long number)  throws CFException{
		work.setSrc170((int)number);
	}


	/**
	 *	Returns the value of tgt171
	 *	@return tgt171
	 */
	public int getTgt171() throws CFException {        
   		return work.getTgt171();
	}
	
	/**
	 * 	Update Tgt171 with the passed value
	 *	@param number
	 */
	public void setTgt171(int number)  throws CFException{
		work.setTgt171(number);
	}


	public void setTgt171(long number)  throws CFException{
		work.setTgt171((int)number);
	}


	/**
	 *	Returns the value of src172
	 *	@return src172
	 */
	public int getSrc172() throws CFException {        
   		return work.getSrc172();
	}
	
	/**
	 * 	Update Src172 with the passed value
	 *	@param number
	 */
	public void setSrc172(int number)  throws CFException{
		work.setSrc172(number);
	}


	public void setSrc172(long number)  throws CFException{
		work.setSrc172((int)number);
	}


	/**
	 *	Returns the value of src173
	 *	@return src173
	 */
	public int getSrc173() throws CFException {        
   		return work.getSrc173();
	}
	
	/**
	 * 	Update Src173 with the passed value
	 *	@param number
	 */
	public void setSrc173(int number)  throws CFException{
		work.setSrc173(number);
	}


	public void setSrc173(long number)  throws CFException{
		work.setSrc173((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process39Split121OutCtx clone() {
        Process39Split121OutCtx cloneObj = new Process39Split121OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process39Split121OutCtx getProcess39Split121OutCtx() {
            return new Process39Split121OutCtx();
    }
     public class Process40Split123InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of tgt174
	 *	@return tgt174
	 */
	public long getTgt174() throws CFException {        
   		return work.getTgt174();
	}
	
	/**
	 * 	Update Tgt174 with the passed value
	 *	@param number
	 */
	public void setTgt174(long number)  throws CFException{
		work.setTgt174(number);
	}



	/**
	 *	Returns the value of subValue
	 *	@return subValue
	 */
	public int getSubValue() throws CFException {
   		return work.getSubValue();
	}


	/**
	 *	Returns String value of subValue
	 *	@return subValue
	 */
	public char[]  getSubValueString() throws CFException {
	     return String.valueOf(work.getSubValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean subValueIsNumeric()  throws CFException{
	    return work.subValueIsNumeric();
	}

	/**
	 * 	Update SubValue with the passed value
	 *	@param number
	 */
	public void setSubValue(int number)  throws CFException{
		work.setSubValue(number);
	}
	

	public void setSubValue(long number)  throws CFException{
	    work.setSubValue(number);
	}
	
	
	/**
	 * 	Update SubValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setSubValue(char[] value)  throws CFException {
		work.setSubValue(value);
	}
	
	/**
	 * 	Update SubValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSubValueString(char[] value)  throws CFException{
		work.setSubValue(value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process40Split123OutCtx getProcess40Split123OutCtx() {
            return new Process40Split123OutCtx();
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

    public Process40Split123InCtx clone() {
        Process40Split123InCtx cloneObj = new Process40Split123InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process40Split123InCtx getProcess40Split123InCtx() {
            return new Process40Split123InCtx();
    }
     public class Process40Split123OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src175
	 *	@return src175
	 */
	public long getSrc175() throws CFException {        
   		return work.getSrc175();
	}
	
	/**
	 * 	Update Src175 with the passed value
	 *	@param number
	 */
	public void setSrc175(long number)  throws CFException{
		work.setSrc175(number);
	}



	/**
	 *	Returns the value of src177
	 *	@return src177
	 */
	public short getSrc177() throws CFException {        
   		return work.getSrc177();
	}
	
	/**
	 * 	Update Src177 with the passed value
	 *	@param number
	 */
	public void setSrc177(short number)  throws CFException{
		work.setSrc177(number);
	}

	public void setSrc177(int number)  throws CFException{
		work.setSrc177((short)number);
	}

	public void setSrc177(long number)  throws CFException{
		work.setSrc177((short)number);
	}



	/**
	 *	Returns the value of src176
	 *	@return src176
	 */
	public long getSrc176() throws CFException {        
   		return work.getSrc176();
	}
	
	/**
	 * 	Update Src176 with the passed value
	 *	@param number
	 */
	public void setSrc176(long number)  throws CFException{
		work.setSrc176(number);
	}



	/**
	 *	Returns the value of src179
	 *	@return src179
	 */
	public short getSrc179() throws CFException {        
   		return work.getSrc179();
	}
	
	/**
	 * 	Update Src179 with the passed value
	 *	@param number
	 */
	public void setSrc179(short number)  throws CFException{
		work.setSrc179(number);
	}

	public void setSrc179(int number)  throws CFException{
		work.setSrc179((short)number);
	}

	public void setSrc179(long number)  throws CFException{
		work.setSrc179((short)number);
	}



	/**
	 *	Returns the value of tgt179
	 *	@return tgt179
	 */
   public char[] getTgt179() throws CFException  {              
   		return work.getTgt179();
   }

  
	/**
	*  set variable tgt179
	*  @param value
	**/
   public void setTgt179(char[] value) throws CFException {
      work.setTgt179(value);
   } 

     /**
	 * 	Update Tgt179 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt179(char[] source, int sourceIndex) throws CFException {
      work.setTgt179(source, sourceIndex);
   	
   }
   
   public void setTgt179(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt179(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt179 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt179(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt179(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt179 with another Field
	 *	@param value
	 */
   public void setTgt179(Field source) {
      work.setTgt179(source);
   }  
   
     /**
	 * 	Update Tgt179 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt179(Field source, int sourceIndex,int sourceLen) {
      work.setTgt179(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt179 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt179(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt179(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt175
	 *	@return tgt175
	 */
	public long getTgt175() throws CFException {        
   		return work.getTgt175();
	}
	
	/**
	 * 	Update Tgt175 with the passed value
	 *	@param number
	 */
	public void setTgt175(long number)  throws CFException{
		work.setTgt175(number);
	}



	/**
	 *	Returns the value of tgt177
	 *	@return tgt177
	 */
   public char[] getTgt177() throws CFException  {              
   		return work.getTgt177();
   }

  
	/**
	*  set variable tgt177
	*  @param value
	**/
   public void setTgt177(char[] value) throws CFException {
      work.setTgt177(value);
   } 

     /**
	 * 	Update Tgt177 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt177(char[] source, int sourceIndex) throws CFException {
      work.setTgt177(source, sourceIndex);
   	
   }
   
   public void setTgt177(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt177(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt177 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt177(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt177(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt177 with another Field
	 *	@param value
	 */
   public void setTgt177(Field source) {
      work.setTgt177(source);
   }  
   
     /**
	 * 	Update Tgt177 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt177(Field source, int sourceIndex,int sourceLen) {
      work.setTgt177(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt177 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt177(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt177(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt178
	 *	@return tgt178
	 */
   public char[] getTgt178() throws CFException  {              
   		return work.getTgt178();
   }

  
	/**
	*  set variable tgt178
	*  @param value
	**/
   public void setTgt178(char[] value) throws CFException {
      work.setTgt178(value);
   } 

     /**
	 * 	Update Tgt178 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt178(char[] source, int sourceIndex) throws CFException {
      work.setTgt178(source, sourceIndex);
   	
   }
   
   public void setTgt178(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt178(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt178 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt178(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt178(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt178 with another Field
	 *	@param value
	 */
   public void setTgt178(Field source) {
      work.setTgt178(source);
   }  
   
     /**
	 * 	Update Tgt178 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt178(Field source, int sourceIndex,int sourceLen) {
      work.setTgt178(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt178 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt178(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt178(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src178
	 *	@return src178
	 */
	public int getSrc178() throws CFException {        
   		return work.getSrc178();
	}
	
	/**
	 * 	Update Src178 with the passed value
	 *	@param number
	 */
	public void setSrc178(int number)  throws CFException{
		work.setSrc178(number);
	}


	public void setSrc178(long number)  throws CFException{
		work.setSrc178((int)number);
	}


	/**
	 *	Returns the value of tgt176
	 *	@return tgt176
	 */
	public long getTgt176() throws CFException {        
   		return work.getTgt176();
	}
	
	/**
	 * 	Update Tgt176 with the passed value
	 *	@param number
	 */
	public void setTgt176(long number)  throws CFException{
		work.setTgt176(number);
	}




        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process40Split123OutCtx clone() {
        Process40Split123OutCtx cloneObj = new Process40Split123OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process40Split123OutCtx getProcess40Split123OutCtx() {
            return new Process40Split123OutCtx();
    }
     public class Process41Split125OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src181
	 *	@return src181
	 */
	public int getSrc181() throws CFException {        
   		return work.getSrc181();
	}
	
	/**
	 * 	Update Src181 with the passed value
	 *	@param number
	 */
	public void setSrc181(int number)  throws CFException{
		work.setSrc181(number);
	}


	public void setSrc181(long number)  throws CFException{
		work.setSrc181((int)number);
	}


	/**
	 *	Returns the value of tgt184
	 *	@return tgt184
	 */
	public int getTgt184() throws CFException {        
   		return work.getTgt184();
	}
	
	/**
	 * 	Update Tgt184 with the passed value
	 *	@param number
	 */
	public void setTgt184(int number)  throws CFException{
		work.setTgt184(number);
	}


	public void setTgt184(long number)  throws CFException{
		work.setTgt184((int)number);
	}


	/**
	 *	Returns the value of tgt181
	 *	@return tgt181
	 */
   public char[] getTgt181() throws CFException  {              
   		return work.getTgt181();
   }

  
	/**
	*  set variable tgt181
	*  @param value
	**/
   public void setTgt181(char[] value) throws CFException {
      work.setTgt181(value);
   } 

     /**
	 * 	Update Tgt181 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt181(char[] source, int sourceIndex) throws CFException {
      work.setTgt181(source, sourceIndex);
   	
   }
   
   public void setTgt181(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt181(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt181 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt181(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt181(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt181 with another Field
	 *	@param value
	 */
   public void setTgt181(Field source) {
      work.setTgt181(source);
   }  
   
     /**
	 * 	Update Tgt181 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt181(Field source, int sourceIndex,int sourceLen) {
      work.setTgt181(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt181 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt181(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt181(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt182
	 *	@return tgt182
	 */
	public BigDecimal getTgt182() throws CFException {
   		return work.getTgt182();
	}

    /**
	 *	Returns the String value of tgt182
	 *	@return tgt182
	 */
	public char[]  getTgt182ActualString()  throws CFException{
	    return work.getTgt182ActualString();
	}

	 /**
     *	Returns String value of tgt182
     *	@return tgt182
     */
    public char[]  getTgt182String() throws CFException {
         return work.getTgt182String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt182IsNumeric() {
        return work.tgt182IsNumeric();
    }
	/**
	 * 	Update Tgt182 with the passed number
	 *	@param number
	 */
	public void setTgt182(BigDecimal number)  throws CFException{
		work.setTgt182(number);
   }

	/**
	 * 	Update Tgt182 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt182(char[] value)  throws CFException{
		work.setTgt182(value);
	}   

	public BigDecimal getSrc182() throws CFException{      
   		return work.getSrc182();
	}

    public char[] getSrc182String() throws CFException {
          return  work.getSrc182().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src182 with the passed number
	 *	@param number
	 */
	public void setSrc182(BigDecimal number)  throws CFException{
		work.setSrc182(number);
   }

	/**
	 *	Returns the value of src184
	 *	@return src184
	 */
	public BigDecimal getSrc184() throws CFException {
   		return work.getSrc184();
	}

    /**
	 *	Returns the String value of src184
	 *	@return src184
	 */
	public char[]  getSrc184ActualString()  throws CFException{
	    return work.getSrc184ActualString();
	}

	 /**
     *	Returns String value of src184
     *	@return src184
     */
    public char[]  getSrc184String() throws CFException {
         return work.getSrc184String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src184IsNumeric() {
        return work.src184IsNumeric();
    }
	/**
	 * 	Update Src184 with the passed number
	 *	@param number
	 */
	public void setSrc184(BigDecimal number)  throws CFException{
		work.setSrc184(number);
   }

	/**
	 * 	Update Src184 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc184(char[] value)  throws CFException{
		work.setSrc184(value);
	}   

	/**
	 *	Returns the value of tgt180
	 *	@return tgt180
	 */
   public char[] getTgt180() throws CFException  {              
   		return work.getTgt180();
   }

  
	/**
	*  set variable tgt180
	*  @param value
	**/
   public void setTgt180(char[] value) throws CFException {
      work.setTgt180(value);
   } 

     /**
	 * 	Update Tgt180 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt180(char[] source, int sourceIndex) throws CFException {
      work.setTgt180(source, sourceIndex);
   	
   }
   
   public void setTgt180(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt180(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt180 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt180(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt180(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt180 with another Field
	 *	@param value
	 */
   public void setTgt180(Field source) {
      work.setTgt180(source);
   }  
   
     /**
	 * 	Update Tgt180 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt180(Field source, int sourceIndex,int sourceLen) {
      work.setTgt180(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt180 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt180(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt180(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src183
	 *	@return src183
	 */
	public BigDecimal getSrc183() throws CFException {
   		return work.getSrc183();
	}

    /**
	 *	Returns the String value of src183
	 *	@return src183
	 */
	public char[]  getSrc183ActualString()  throws CFException{
	    return work.getSrc183ActualString();
	}

	 /**
     *	Returns String value of src183
     *	@return src183
     */
    public char[]  getSrc183String() throws CFException {
         return work.getSrc183String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src183IsNumeric() {
        return work.src183IsNumeric();
    }
	/**
	 * 	Update Src183 with the passed number
	 *	@param number
	 */
	public void setSrc183(BigDecimal number)  throws CFException{
		work.setSrc183(number);
   }

	/**
	 * 	Update Src183 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc183(char[] value)  throws CFException{
		work.setSrc183(value);
	}   

	/**
	 *	Returns the value of src180
	 *	@return src180
	 */
	public long getSrc180() throws CFException {        
   		return work.getSrc180();
	}
	
	/**
	 * 	Update Src180 with the passed value
	 *	@param number
	 */
	public void setSrc180(long number)  throws CFException{
		work.setSrc180(number);
	}



	public BigDecimal getTgt183() throws CFException{      
   		return work.getTgt183();
	}

    public char[] getTgt183String() throws CFException {
          return  work.getTgt183().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt183 with the passed number
	 *	@param number
	 */
	public void setTgt183(BigDecimal number)  throws CFException{
		work.setTgt183(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process41Split125OutCtx clone() {
        Process41Split125OutCtx cloneObj = new Process41Split125OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process41Split125OutCtx getProcess41Split125OutCtx() {
            return new Process41Split125OutCtx();
    }
     public class Process42Split127InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt184
	 *	@return tgt184
	 */
	public int getTgt184() throws CFException {        
   		return work.getTgt184();
	}
	
	/**
	 * 	Update Tgt184 with the passed value
	 *	@param number
	 */
	public void setTgt184(int number)  throws CFException{
		work.setTgt184(number);
	}


	public void setTgt184(long number)  throws CFException{
		work.setTgt184((int)number);
	}


	/**
	 *	Returns the value of src184
	 *	@return src184
	 */
	public BigDecimal getSrc184() throws CFException {
   		return work.getSrc184();
	}

    /**
	 *	Returns the String value of src184
	 *	@return src184
	 */
	public char[]  getSrc184ActualString()  throws CFException{
	    return work.getSrc184ActualString();
	}

	 /**
     *	Returns String value of src184
     *	@return src184
     */
    public char[]  getSrc184String() throws CFException {
         return work.getSrc184String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src184IsNumeric() {
        return work.src184IsNumeric();
    }
	/**
	 * 	Update Src184 with the passed number
	 *	@param number
	 */
	public void setSrc184(BigDecimal number)  throws CFException{
		work.setSrc184(number);
   }

	/**
	 * 	Update Src184 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc184(char[] value)  throws CFException{
		work.setSrc184(value);
	}   


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process42Split127OutCtx getProcess42Split127OutCtx() {
            return new Process42Split127OutCtx();
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

    public Process42Split127InCtx clone() {
        Process42Split127InCtx cloneObj = new Process42Split127InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process42Split127InCtx getProcess42Split127InCtx() {
            return new Process42Split127InCtx();
    }
     public class Process42Split127OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt186
	 *	@return tgt186
	 */
	public int getTgt186() throws CFException {        
   		return work.getTgt186();
	}
	
	/**
	 * 	Update Tgt186 with the passed value
	 *	@param number
	 */
	public void setTgt186(int number)  throws CFException{
		work.setTgt186(number);
	}


	public void setTgt186(long number)  throws CFException{
		work.setTgt186((int)number);
	}


	public BigDecimal getSrc186() throws CFException{      
   		return work.getSrc186();
	}

    public char[] getSrc186String() throws CFException {
          return  work.getSrc186().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src186 with the passed number
	 *	@param number
	 */
	public void setSrc186(BigDecimal number)  throws CFException{
		work.setSrc186(number);
   }

	/**
	 *	Returns the value of tgt184
	 *	@return tgt184
	 */
	public int getTgt184() throws CFException {        
   		return work.getTgt184();
	}
	
	/**
	 * 	Update Tgt184 with the passed value
	 *	@param number
	 */
	public void setTgt184(int number)  throws CFException{
		work.setTgt184(number);
	}


	public void setTgt184(long number)  throws CFException{
		work.setTgt184((int)number);
	}


	/**
	 *	Returns the value of tgt188
	 *	@return tgt188
	 */
	public int getTgt188() throws CFException {        
   		return work.getTgt188();
	}
	
	/**
	 * 	Update Tgt188 with the passed value
	 *	@param number
	 */
	public void setTgt188(int number)  throws CFException{
		work.setTgt188(number);
	}


	public void setTgt188(long number)  throws CFException{
		work.setTgt188((int)number);
	}


	/**
	 *	Returns the value of src184
	 *	@return src184
	 */
	public BigDecimal getSrc184() throws CFException {
   		return work.getSrc184();
	}

    /**
	 *	Returns the String value of src184
	 *	@return src184
	 */
	public char[]  getSrc184ActualString()  throws CFException{
	    return work.getSrc184ActualString();
	}

	 /**
     *	Returns String value of src184
     *	@return src184
     */
    public char[]  getSrc184String() throws CFException {
         return work.getSrc184String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src184IsNumeric() {
        return work.src184IsNumeric();
    }
	/**
	 * 	Update Src184 with the passed number
	 *	@param number
	 */
	public void setSrc184(BigDecimal number)  throws CFException{
		work.setSrc184(number);
   }

	/**
	 * 	Update Src184 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc184(char[] value)  throws CFException{
		work.setSrc184(value);
	}   

	/**
	 *	Returns the value of tgt187
	 *	@return tgt187
	 */
	public short getTgt187() throws CFException {        
   		return work.getTgt187();
	}
	
	/**
	 * 	Update Tgt187 with the passed value
	 *	@param number
	 */
	public void setTgt187(short number)  throws CFException{
		work.setTgt187(number);
	}

	public void setTgt187(int number)  throws CFException{
		work.setTgt187((short)number);
	}

	public void setTgt187(long number)  throws CFException{
		work.setTgt187((short)number);
	}



	/**
	 *	Returns the value of tgt185
	 *	@return tgt185
	 */
	public int getTgt185() throws CFException {        
   		return work.getTgt185();
	}
	
	/**
	 * 	Update Tgt185 with the passed value
	 *	@param number
	 */
	public void setTgt185(int number)  throws CFException{
		work.setTgt185(number);
	}


	public void setTgt185(long number)  throws CFException{
		work.setTgt185((int)number);
	}


	/**
	 *	Returns the value of src188
	 *	@return src188
	 */
	public BigDecimal getSrc188() throws CFException {
   		return work.getSrc188();
	}

    /**
	 *	Returns the String value of src188
	 *	@return src188
	 */
	public char[]  getSrc188ActualString()  throws CFException{
	    return work.getSrc188ActualString();
	}

	 /**
     *	Returns String value of src188
     *	@return src188
     */
    public char[]  getSrc188String() throws CFException {
         return work.getSrc188String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src188IsNumeric() {
        return work.src188IsNumeric();
    }
	/**
	 * 	Update Src188 with the passed number
	 *	@param number
	 */
	public void setSrc188(BigDecimal number)  throws CFException{
		work.setSrc188(number);
   }

	/**
	 * 	Update Src188 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc188(char[] value)  throws CFException{
		work.setSrc188(value);
	}   

	public BigDecimal getSrc185() throws CFException{      
   		return work.getSrc185();
	}

    public char[] getSrc185String() throws CFException {
          return  work.getSrc185().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src185 with the passed number
	 *	@param number
	 */
	public void setSrc185(BigDecimal number)  throws CFException{
		work.setSrc185(number);
   }

	public BigDecimal getSrc187() throws CFException{      
   		return work.getSrc187();
	}

    public char[] getSrc187String() throws CFException {
          return  work.getSrc187().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src187 with the passed number
	 *	@param number
	 */
	public void setSrc187(BigDecimal number)  throws CFException{
		work.setSrc187(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process42Split127OutCtx clone() {
        Process42Split127OutCtx cloneObj = new Process42Split127OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process42Split127OutCtx getProcess42Split127OutCtx() {
            return new Process42Split127OutCtx();
    }
     public class Process43Split129InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt188
	 *	@return tgt188
	 */
	public int getTgt188() throws CFException {        
   		return work.getTgt188();
	}
	
	/**
	 * 	Update Tgt188 with the passed value
	 *	@param number
	 */
	public void setTgt188(int number)  throws CFException{
		work.setTgt188(number);
	}


	public void setTgt188(long number)  throws CFException{
		work.setTgt188((int)number);
	}



        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process43Split129OutCtx getProcess43Split129OutCtx() {
            return new Process43Split129OutCtx();
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

    public Process43Split129InCtx clone() {
        Process43Split129InCtx cloneObj = new Process43Split129InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process43Split129InCtx getProcess43Split129InCtx() {
            return new Process43Split129InCtx();
    }
     public class Process43Split129OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of tgt188
	 *	@return tgt188
	 */
	public int getTgt188() throws CFException {        
   		return work.getTgt188();
	}
	
	/**
	 * 	Update Tgt188 with the passed value
	 *	@param number
	 */
	public void setTgt188(int number)  throws CFException{
		work.setTgt188(number);
	}


	public void setTgt188(long number)  throws CFException{
		work.setTgt188((int)number);
	}


	/**
	 *	Returns the value of src190
	 *	@return src190
	 */
	public BigDecimal getSrc190() throws CFException {
   		return work.getSrc190();
	}

    /**
	 *	Returns the String value of src190
	 *	@return src190
	 */
	public char[]  getSrc190ActualString()  throws CFException{
	    return work.getSrc190ActualString();
	}

	 /**
     *	Returns String value of src190
     *	@return src190
     */
    public char[]  getSrc190String() throws CFException {
         return work.getSrc190String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src190IsNumeric() {
        return work.src190IsNumeric();
    }
	/**
	 * 	Update Src190 with the passed number
	 *	@param number
	 */
	public void setSrc190(BigDecimal number)  throws CFException{
		work.setSrc190(number);
   }

	/**
	 * 	Update Src190 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc190(char[] value)  throws CFException{
		work.setSrc190(value);
	}   

	/**
	 *	Returns the value of tgt190
	 *	@return tgt190
	 */
	public long getTgt190() throws CFException {        
   		return work.getTgt190();
	}
	
	/**
	 * 	Update Tgt190 with the passed value
	 *	@param number
	 */
	public void setTgt190(long number)  throws CFException{
		work.setTgt190(number);
	}



	/**
	 *	Returns the value of src191
	 *	@return src191
	 */
	public BigDecimal getSrc191() throws CFException {
   		return work.getSrc191();
	}

    /**
	 *	Returns the String value of src191
	 *	@return src191
	 */
	public char[]  getSrc191ActualString()  throws CFException{
	    return work.getSrc191ActualString();
	}

	 /**
     *	Returns String value of src191
     *	@return src191
     */
    public char[]  getSrc191String() throws CFException {
         return work.getSrc191String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src191IsNumeric() {
        return work.src191IsNumeric();
    }
	/**
	 * 	Update Src191 with the passed number
	 *	@param number
	 */
	public void setSrc191(BigDecimal number)  throws CFException{
		work.setSrc191(number);
   }

	/**
	 * 	Update Src191 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc191(char[] value)  throws CFException{
		work.setSrc191(value);
	}   

	/**
	 *	Returns the value of src189
	 *	@return src189
	 */
	public BigDecimal getSrc189() throws CFException {
   		return work.getSrc189();
	}

    /**
	 *	Returns the String value of src189
	 *	@return src189
	 */
	public char[]  getSrc189ActualString()  throws CFException{
	    return work.getSrc189ActualString();
	}

	 /**
     *	Returns String value of src189
     *	@return src189
     */
    public char[]  getSrc189String() throws CFException {
         return work.getSrc189String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src189IsNumeric() {
        return work.src189IsNumeric();
    }
	/**
	 * 	Update Src189 with the passed number
	 *	@param number
	 */
	public void setSrc189(BigDecimal number)  throws CFException{
		work.setSrc189(number);
   }

	/**
	 * 	Update Src189 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc189(char[] value)  throws CFException{
		work.setSrc189(value);
	}   

	/**
	 *	Returns the value of src192
	 *	@return src192
	 */
	public BigDecimal getSrc192() throws CFException {
   		return work.getSrc192();
	}

    /**
	 *	Returns the String value of src192
	 *	@return src192
	 */
	public char[]  getSrc192ActualString()  throws CFException{
	    return work.getSrc192ActualString();
	}

	 /**
     *	Returns String value of src192
     *	@return src192
     */
    public char[]  getSrc192String() throws CFException {
         return work.getSrc192String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src192IsNumeric() {
        return work.src192IsNumeric();
    }
	/**
	 * 	Update Src192 with the passed number
	 *	@param number
	 */
	public void setSrc192(BigDecimal number)  throws CFException{
		work.setSrc192(number);
   }

	/**
	 * 	Update Src192 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc192(char[] value)  throws CFException{
		work.setSrc192(value);
	}   

	/**
	 *	Returns the value of tgt189
	 *	@return tgt189
	 */
	public int getTgt189() throws CFException {        
   		return work.getTgt189();
	}
	
	/**
	 * 	Update Tgt189 with the passed value
	 *	@param number
	 */
	public void setTgt189(int number)  throws CFException{
		work.setTgt189(number);
	}


	public void setTgt189(long number)  throws CFException{
		work.setTgt189((int)number);
	}


	/**
	 *	Returns the value of src188
	 *	@return src188
	 */
	public BigDecimal getSrc188() throws CFException {
   		return work.getSrc188();
	}

    /**
	 *	Returns the String value of src188
	 *	@return src188
	 */
	public char[]  getSrc188ActualString()  throws CFException{
	    return work.getSrc188ActualString();
	}

	 /**
     *	Returns String value of src188
     *	@return src188
     */
    public char[]  getSrc188String() throws CFException {
         return work.getSrc188String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src188IsNumeric() {
        return work.src188IsNumeric();
    }
	/**
	 * 	Update Src188 with the passed number
	 *	@param number
	 */
	public void setSrc188(BigDecimal number)  throws CFException{
		work.setSrc188(number);
   }

	/**
	 * 	Update Src188 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc188(char[] value)  throws CFException{
		work.setSrc188(value);
	}   

	/**
	 *	Returns the value of tgt191
	 *	@return tgt191
	 */
	public short getTgt191() throws CFException {        
   		return work.getTgt191();
	}
	
	/**
	 * 	Update Tgt191 with the passed value
	 *	@param number
	 */
	public void setTgt191(short number)  throws CFException{
		work.setTgt191(number);
	}

	public void setTgt191(int number)  throws CFException{
		work.setTgt191((short)number);
	}

	public void setTgt191(long number)  throws CFException{
		work.setTgt191((short)number);
	}



	/**
	 *	Returns the value of tgt192
	 *	@return tgt192
	 */
   public char[] getTgt192() throws CFException  {              
   		return work.getTgt192();
   }

  
	/**
	*  set variable tgt192
	*  @param value
	**/
   public void setTgt192(char[] value) throws CFException {
      work.setTgt192(value);
   } 

     /**
	 * 	Update Tgt192 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt192(char[] source, int sourceIndex) throws CFException {
      work.setTgt192(source, sourceIndex);
   	
   }
   
   public void setTgt192(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt192(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt192 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt192(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt192(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt192 with another Field
	 *	@param value
	 */
   public void setTgt192(Field source) {
      work.setTgt192(source);
   }  
   
     /**
	 * 	Update Tgt192 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt192(Field source, int sourceIndex,int sourceLen) {
      work.setTgt192(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt192 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt192(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt192(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process43Split129OutCtx clone() {
        Process43Split129OutCtx cloneObj = new Process43Split129OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process43Split129OutCtx getProcess43Split129OutCtx() {
            return new Process43Split129OutCtx();
    }
     public class Process44Split131InCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src194
	 *	@return src194
	 */
   public char[] getSrc194() throws CFException  {              
   		return work.getSrc194();
   }

  
	/**
	*  set variable src194
	*  @param value
	**/
   public void setSrc194(char[] value) throws CFException {
      work.setSrc194(value);
   } 

     /**
	 * 	Update Src194 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc194(char[] source, int sourceIndex) throws CFException {
      work.setSrc194(source, sourceIndex);
   	
   }
   
   public void setSrc194(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc194(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src194 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc194(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc194(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src194 with another Field
	 *	@param value
	 */
   public void setSrc194(Field source) {
      work.setSrc194(source);
   }  
   
     /**
	 * 	Update Src194 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc194(Field source, int sourceIndex,int sourceLen) {
      work.setSrc194(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src194 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc194(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc194(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt192
	 *	@return tgt192
	 */
   public char[] getTgt192() throws CFException  {              
   		return work.getTgt192();
   }

  
	/**
	*  set variable tgt192
	*  @param value
	**/
   public void setTgt192(char[] value) throws CFException {
      work.setTgt192(value);
   } 

     /**
	 * 	Update Tgt192 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt192(char[] source, int sourceIndex) throws CFException {
      work.setTgt192(source, sourceIndex);
   	
   }
   
   public void setTgt192(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt192(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt192 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt192(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt192(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt192 with another Field
	 *	@param value
	 */
   public void setTgt192(Field source) {
      work.setTgt192(source);
   }  
   
     /**
	 * 	Update Tgt192 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt192(Field source, int sourceIndex,int sourceLen) {
      work.setTgt192(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt192 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt192(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt192(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process44Split131OutCtx getProcess44Split131OutCtx() {
            return new Process44Split131OutCtx();
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

    public Process44Split131InCtx clone() {
        Process44Split131InCtx cloneObj = new Process44Split131InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process44Split131InCtx getProcess44Split131InCtx() {
            return new Process44Split131InCtx();
    }
     public class Process44Split131OutCtx implements Cloneable {
     Work work = TestnumCtx.this.getWork();

	/**
	 *	Returns the value of src195
	 *	@return src195
	 */
   public char[] getSrc195() throws CFException  {              
   		return work.getSrc195();
   }

  
	/**
	*  set variable src195
	*  @param value
	**/
   public void setSrc195(char[] value) throws CFException {
      work.setSrc195(value);
   } 

     /**
	 * 	Update Src195 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc195(char[] source, int sourceIndex) throws CFException {
      work.setSrc195(source, sourceIndex);
   	
   }
   
   public void setSrc195(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc195(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src195 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc195(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc195(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src195 with another Field
	 *	@param value
	 */
   public void setSrc195(Field source) {
      work.setSrc195(source);
   }  
   
     /**
	 * 	Update Src195 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc195(Field source, int sourceIndex,int sourceLen) {
      work.setSrc195(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src195 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc195(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc195(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt194
	 *	@return tgt194
	 */
   public char[] getTgt194() throws CFException  {              
   		return work.getTgt194();
   }

  
	/**
	*  set variable tgt194
	*  @param value
	**/
   public void setTgt194(char[] value) throws CFException {
      work.setTgt194(value);
   } 

     /**
	 * 	Update Tgt194 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt194(char[] source, int sourceIndex) throws CFException {
      work.setTgt194(source, sourceIndex);
   	
   }
   
   public void setTgt194(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt194(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt194 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt194(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt194(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt194 with another Field
	 *	@param value
	 */
   public void setTgt194(Field source) {
      work.setTgt194(source);
   }  
   
     /**
	 * 	Update Tgt194 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt194(Field source, int sourceIndex,int sourceLen) {
      work.setTgt194(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt194 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt194(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt194(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt195
	 *	@return tgt195
	 */
	public BigDecimal getTgt195() throws CFException {
   		return work.getTgt195();
	}

    /**
	 *	Returns the String value of tgt195
	 *	@return tgt195
	 */
	public char[]  getTgt195ActualString()  throws CFException{
	    return work.getTgt195ActualString();
	}

	 /**
     *	Returns String value of tgt195
     *	@return tgt195
     */
    public char[]  getTgt195String() throws CFException {
         return work.getTgt195String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt195IsNumeric() {
        return work.tgt195IsNumeric();
    }
	/**
	 * 	Update Tgt195 with the passed number
	 *	@param number
	 */
	public void setTgt195(BigDecimal number)  throws CFException{
		work.setTgt195(number);
   }

	/**
	 * 	Update Tgt195 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt195(char[] value)  throws CFException{
		work.setTgt195(value);
	}   

	public BigDecimal getSrc193() throws CFException{      
   		return work.getSrc193();
	}

    public char[] getSrc193String() throws CFException {
          return  work.getSrc193().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src193 with the passed number
	 *	@param number
	 */
	public void setSrc193(BigDecimal number)  throws CFException{
		work.setSrc193(number);
   }

	/**
	 *	Returns the value of src194
	 *	@return src194
	 */
   public char[] getSrc194() throws CFException  {              
   		return work.getSrc194();
   }

  
	/**
	*  set variable src194
	*  @param value
	**/
   public void setSrc194(char[] value) throws CFException {
      work.setSrc194(value);
   } 

     /**
	 * 	Update Src194 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc194(char[] source, int sourceIndex) throws CFException {
      work.setSrc194(source, sourceIndex);
   	
   }
   
   public void setSrc194(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc194(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src194 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc194(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc194(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src194 with another Field
	 *	@param value
	 */
   public void setSrc194(Field source) {
      work.setSrc194(source);
   }  
   
     /**
	 * 	Update Src194 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc194(Field source, int sourceIndex,int sourceLen) {
      work.setSrc194(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src194 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc194(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc194(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt193
	 *	@return tgt193
	 */
   public char[] getTgt193() throws CFException  {              
   		return work.getTgt193();
   }

  
	/**
	*  set variable tgt193
	*  @param value
	**/
   public void setTgt193(char[] value) throws CFException {
      work.setTgt193(value);
   } 

     /**
	 * 	Update Tgt193 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt193(char[] source, int sourceIndex) throws CFException {
      work.setTgt193(source, sourceIndex);
   	
   }
   
   public void setTgt193(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt193(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt193 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt193(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt193(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt193 with another Field
	 *	@param value
	 */
   public void setTgt193(Field source) {
      work.setTgt193(source);
   }  
   
     /**
	 * 	Update Tgt193 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt193(Field source, int sourceIndex,int sourceLen) {
      work.setTgt193(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt193 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt193(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt193(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src196
	 *	@return src196
	 */
   public char[] getSrc196() throws CFException  {              
   		return work.getSrc196();
   }

  
	/**
	*  set variable src196
	*  @param value
	**/
   public void setSrc196(char[] value) throws CFException {
      work.setSrc196(value);
   } 

     /**
	 * 	Update Src196 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc196(char[] source, int sourceIndex) throws CFException {
      work.setSrc196(source, sourceIndex);
   	
   }
   
   public void setSrc196(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc196(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src196 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc196(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc196(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src196 with another Field
	 *	@param value
	 */
   public void setSrc196(Field source) {
      work.setSrc196(source);
   }  
   
     /**
	 * 	Update Src196 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc196(Field source, int sourceIndex,int sourceLen) {
      work.setSrc196(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src196 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc196(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc196(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getTgt196() throws CFException{      
   		return work.getTgt196();
	}

    public char[] getTgt196String() throws CFException {
          return  work.getTgt196().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt196 with the passed number
	 *	@param number
	 */
	public void setTgt196(BigDecimal number)  throws CFException{
		work.setTgt196(number);
   }


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
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

    public Process44Split131OutCtx clone() {
        Process44Split131OutCtx cloneObj = new Process44Split131OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process44Split131OutCtx getProcess44Split131OutCtx() {
            return new Process44Split131OutCtx();
    }
     public class Process45InCtx implements Cloneable {
     Tgt200Grp tgt200Grp = TestnumCtx.this.getTgt200Grp();
     Tgt199Grp tgt199Grp = TestnumCtx.this.getTgt199Grp();
     Work work = TestnumCtx.this.getWork();
     Src198Grp src198Grp = TestnumCtx.this.getSrc198Grp();
     Src200Grp src200Grp = TestnumCtx.this.getSrc200Grp();

	/**
	 *	Returns the value of src198
	 *	@return src198
	 */
	public short getSrc198(int index) throws CFException {        
   		return src198Grp.getSrc198((index));
	}
	
	/**
	 * 	Update Src198 with the passed value
	 *	@param number
	 */
	public void setSrc198(int index,short number)  throws CFException{
		src198Grp.setSrc198((index),number);
	}

	public void setSrc198(int index,int number)  throws CFException{
		src198Grp.setSrc198((index),(short)number);
	}

	public void setSrc198(int index,long number)  throws CFException{
		src198Grp.setSrc198((index),(short)number);
	}



	/**
	 *	Returns the value of src200
	 *	@return src200
	 */
	public short getSrc200(int index) throws CFException {        
   		return src200Grp.getSrc200((index));
	}
	
	/**
	 * 	Update Src200 with the passed value
	 *	@param number
	 */
	public void setSrc200(int index,short number)  throws CFException{
		src200Grp.setSrc200((index),number);
	}

	public void setSrc200(int index,int number)  throws CFException{
		src200Grp.setSrc200((index),(short)number);
	}

	public void setSrc200(int index,long number)  throws CFException{
		src200Grp.setSrc200((index),(short)number);
	}



	/**
	 *	Returns the value of tgt200Grp
	 *	@return tgt200Grp
	 */   
	 public Tgt200Grp getTgt200Grp() {
   	return tgt200Grp;
   }


	/**
	 *	Returns the value of src199
	 *	@return src199
	 */
	public short getSrc199() throws CFException {        
   		return work.getSrc199();
	}
	
	/**
	 * 	Update Src199 with the passed value
	 *	@param number
	 */
	public void setSrc199(short number)  throws CFException{
		work.setSrc199(number);
	}

	public void setSrc199(int number)  throws CFException{
		work.setSrc199((short)number);
	}

	public void setSrc199(long number)  throws CFException{
		work.setSrc199((short)number);
	}



	/**
	 *	Returns the value of tgt198
	 *	@return tgt198
	 */
	public long getTgt198() throws CFException {
   		return work.getTgt198();
	}


	/**
	 *	Returns String value of tgt198
	 *	@return tgt198
	 */
	public char[]  getTgt198String() throws CFException {
	     return String.valueOf(work.getTgt198String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt198IsNumeric()  throws CFException{
	    return work.tgt198IsNumeric();
	}

	/**
	 * 	Update Tgt198 with the passed value
	 *	@param number
	 */
	public void setTgt198(long number)  throws CFException{
		work.setTgt198(number);
	}
	

	
	/**
	 * 	Update Tgt198 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt198(char[] value)  throws CFException {
		work.setTgt198(value);
	}
	
	/**
	 * 	Update Tgt198 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt198String(char[] value)  throws CFException{
		work.setTgt198(value);
	}	

	/**
	 *	Returns the value of tgt199Grp
	 *	@return tgt199Grp
	 */   
	 public Tgt199Grp getTgt199Grp() {
   	return tgt199Grp;
   }


	/**
	 *	Returns the value of tgt197
	 *	@return tgt197
	 */
	public long getTgt197() throws CFException {
   		return work.getTgt197();
	}


	/**
	 *	Returns String value of tgt197
	 *	@return tgt197
	 */
	public char[]  getTgt197String() throws CFException {
	     return String.valueOf(work.getTgt197String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt197IsNumeric()  throws CFException{
	    return work.tgt197IsNumeric();
	}

	/**
	 * 	Update Tgt197 with the passed value
	 *	@param number
	 */
	public void setTgt197(long number)  throws CFException{
		work.setTgt197(number);
	}
	

	
	/**
	 * 	Update Tgt197 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt197(char[] value)  throws CFException {
		work.setTgt197(value);
	}
	
	/**
	 * 	Update Tgt197 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt197String(char[] value)  throws CFException{
		work.setTgt197(value);
	}	

	/**
	 *	Returns the value of src197
	 *	@return src197
	 */
	public short getSrc197() throws CFException {        
   		return work.getSrc197();
	}
	
	/**
	 * 	Update Src197 with the passed value
	 *	@param number
	 */
	public void setSrc197(short number)  throws CFException{
		work.setSrc197(number);
	}

	public void setSrc197(int number)  throws CFException{
		work.setSrc197((short)number);
	}

	public void setSrc197(long number)  throws CFException{
		work.setSrc197((short)number);
	}



	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of tgt200
	 *	@return tgt200
	 */
	public long getTgt200(int index) throws CFException {
   		return tgt200Grp.getTgt200((index));
	}


	/**
	 *	Returns String value of tgt200
	 *	@return tgt200
	 */
	public char[]  getTgt200String(int index) throws CFException {
	     return String.valueOf(tgt200Grp.getTgt200String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt200IsNumeric(int index)  throws CFException{
	    return tgt200Grp.tgt200IsNumeric(index);
	}

	/**
	 * 	Update Tgt200 with the passed value
	 *	@param number
	 */
	public void setTgt200(int index,long number)  throws CFException{
		tgt200Grp.setTgt200((index),number);
	}
	

	
	/**
	 * 	Update Tgt200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt200(int index,char[] value)  throws CFException {
		tgt200Grp.setTgt200((index),value);
	}
	
	/**
	 * 	Update Tgt200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt200String(int index,char[] value)  throws CFException{
		tgt200Grp.setTgt200((index),value);
	}	

	/**
	 *	Returns the value of tgt199
	 *	@return tgt199
	 */
	public long getTgt199(int index) throws CFException {
   		return tgt199Grp.getTgt199((index));
	}


	/**
	 *	Returns String value of tgt199
	 *	@return tgt199
	 */
	public char[]  getTgt199String(int index) throws CFException {
	     return String.valueOf(tgt199Grp.getTgt199String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt199IsNumeric(int index)  throws CFException{
	    return tgt199Grp.tgt199IsNumeric(index);
	}

	/**
	 * 	Update Tgt199 with the passed value
	 *	@param number
	 */
	public void setTgt199(int index,long number)  throws CFException{
		tgt199Grp.setTgt199((index),number);
	}
	

	
	/**
	 * 	Update Tgt199 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt199(int index,char[] value)  throws CFException {
		tgt199Grp.setTgt199((index),value);
	}
	
	/**
	 * 	Update Tgt199 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt199String(int index,char[] value)  throws CFException{
		tgt199Grp.setTgt199((index),value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }

        public Process45OutCtx getProcess45OutCtx() {
            return new Process45OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt200Grp.hashCode();
        str += tgt199Grp.hashCode();
        str += work.hashCode();
        str += src198Grp.hashCode();
        str += src200Grp.hashCode();
       return str.hashCode();
    }

    public Process45InCtx clone() {
        Process45InCtx cloneObj = new Process45InCtx();
        cloneObj.tgt200Grp = new Tgt200Grp();
        cloneObj.tgt200Grp.set(tgt200Grp.getClonedField());
        cloneObj.tgt199Grp = new Tgt199Grp();
        cloneObj.tgt199Grp.set(tgt199Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.src198Grp = new Src198Grp();
        cloneObj.src198Grp.set(src198Grp.getClonedField());
        cloneObj.src200Grp = new Src200Grp();
        cloneObj.src200Grp.set(src200Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process45InCtx getProcess45InCtx() {
            return new Process45InCtx();
    }
     public class Process45OutCtx implements Cloneable {
     Tgt200Grp tgt200Grp = TestnumCtx.this.getTgt200Grp();
     Tgt199Grp tgt199Grp = TestnumCtx.this.getTgt199Grp();
     Work work = TestnumCtx.this.getWork();
     Src198Grp src198Grp = TestnumCtx.this.getSrc198Grp();
     Src200Grp src200Grp = TestnumCtx.this.getSrc200Grp();

	/**
	 *	Returns the value of src198
	 *	@return src198
	 */
	public short getSrc198(int index) throws CFException {        
   		return src198Grp.getSrc198((index));
	}
	
	/**
	 * 	Update Src198 with the passed value
	 *	@param number
	 */
	public void setSrc198(int index,short number)  throws CFException{
		src198Grp.setSrc198((index),number);
	}

	public void setSrc198(int index,int number)  throws CFException{
		src198Grp.setSrc198((index),(short)number);
	}

	public void setSrc198(int index,long number)  throws CFException{
		src198Grp.setSrc198((index),(short)number);
	}



	/**
	 *	Returns the value of src200
	 *	@return src200
	 */
	public short getSrc200(int index) throws CFException {        
   		return src200Grp.getSrc200((index));
	}
	
	/**
	 * 	Update Src200 with the passed value
	 *	@param number
	 */
	public void setSrc200(int index,short number)  throws CFException{
		src200Grp.setSrc200((index),number);
	}

	public void setSrc200(int index,int number)  throws CFException{
		src200Grp.setSrc200((index),(short)number);
	}

	public void setSrc200(int index,long number)  throws CFException{
		src200Grp.setSrc200((index),(short)number);
	}



	/**
	 *	Returns the value of src199
	 *	@return src199
	 */
	public short getSrc199() throws CFException {        
   		return work.getSrc199();
	}
	
	/**
	 * 	Update Src199 with the passed value
	 *	@param number
	 */
	public void setSrc199(short number)  throws CFException{
		work.setSrc199(number);
	}

	public void setSrc199(int number)  throws CFException{
		work.setSrc199((short)number);
	}

	public void setSrc199(long number)  throws CFException{
		work.setSrc199((short)number);
	}



	/**
	 *	Returns the value of src201
	 *	@return src201
	 */
	public long getSrc201() throws CFException {
   		return work.getSrc201();
	}


	/**
	 *	Returns String value of src201
	 *	@return src201
	 */
	public char[]  getSrc201String() throws CFException {
	     return String.valueOf(work.getSrc201String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src201IsNumeric()  throws CFException{
	    return work.src201IsNumeric();
	}

	/**
	 * 	Update Src201 with the passed value
	 *	@param number
	 */
	public void setSrc201(long number)  throws CFException{
		work.setSrc201(number);
	}
	

	
	/**
	 * 	Update Src201 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc201(char[] value)  throws CFException {
		work.setSrc201(value);
	}
	
	/**
	 * 	Update Src201 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc201String(char[] value)  throws CFException{
		work.setSrc201(value);
	}	

	/**
	 *	Returns the value of tgt198
	 *	@return tgt198
	 */
	public long getTgt198() throws CFException {
   		return work.getTgt198();
	}


	/**
	 *	Returns String value of tgt198
	 *	@return tgt198
	 */
	public char[]  getTgt198String() throws CFException {
	     return String.valueOf(work.getTgt198String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt198IsNumeric()  throws CFException{
	    return work.tgt198IsNumeric();
	}

	/**
	 * 	Update Tgt198 with the passed value
	 *	@param number
	 */
	public void setTgt198(long number)  throws CFException{
		work.setTgt198(number);
	}
	

	
	/**
	 * 	Update Tgt198 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt198(char[] value)  throws CFException {
		work.setTgt198(value);
	}
	
	/**
	 * 	Update Tgt198 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt198String(char[] value)  throws CFException{
		work.setTgt198(value);
	}	

	/**
	 *	Returns the value of tgt197
	 *	@return tgt197
	 */
	public long getTgt197() throws CFException {
   		return work.getTgt197();
	}


	/**
	 *	Returns String value of tgt197
	 *	@return tgt197
	 */
	public char[]  getTgt197String() throws CFException {
	     return String.valueOf(work.getTgt197String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt197IsNumeric()  throws CFException{
	    return work.tgt197IsNumeric();
	}

	/**
	 * 	Update Tgt197 with the passed value
	 *	@param number
	 */
	public void setTgt197(long number)  throws CFException{
		work.setTgt197(number);
	}
	

	
	/**
	 * 	Update Tgt197 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt197(char[] value)  throws CFException {
		work.setTgt197(value);
	}
	
	/**
	 * 	Update Tgt197 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt197String(char[] value)  throws CFException{
		work.setTgt197(value);
	}	

	/**
	 *	Returns the value of tgt201
	 *	@return tgt201
	 */
   public char[] getTgt201() throws CFException  {              
   		return work.getTgt201();
   }

  
	/**
	*  set variable tgt201
	*  @param value
	**/
   public void setTgt201(char[] value) throws CFException {
      work.setTgt201(value);
   } 

	/**
	 *	Returns the value of src197
	 *	@return src197
	 */
	public short getSrc197() throws CFException {        
   		return work.getSrc197();
	}
	
	/**
	 * 	Update Src197 with the passed value
	 *	@param number
	 */
	public void setSrc197(short number)  throws CFException{
		work.setSrc197(number);
	}

	public void setSrc197(int number)  throws CFException{
		work.setSrc197((short)number);
	}

	public void setSrc197(long number)  throws CFException{
		work.setSrc197((short)number);
	}



	/**
	 *	Returns the value of tgt200
	 *	@return tgt200
	 */
	public long getTgt200(int index) throws CFException {
   		return tgt200Grp.getTgt200((index));
	}


	/**
	 *	Returns String value of tgt200
	 *	@return tgt200
	 */
	public char[]  getTgt200String(int index) throws CFException {
	     return String.valueOf(tgt200Grp.getTgt200String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt200IsNumeric(int index)  throws CFException{
	    return tgt200Grp.tgt200IsNumeric(index);
	}

	/**
	 * 	Update Tgt200 with the passed value
	 *	@param number
	 */
	public void setTgt200(int index,long number)  throws CFException{
		tgt200Grp.setTgt200((index),number);
	}
	

	
	/**
	 * 	Update Tgt200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt200(int index,char[] value)  throws CFException {
		tgt200Grp.setTgt200((index),value);
	}
	
	/**
	 * 	Update Tgt200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt200String(int index,char[] value)  throws CFException{
		tgt200Grp.setTgt200((index),value);
	}	

	/**
	 *	Returns the value of tgt199
	 *	@return tgt199
	 */
	public long getTgt199(int index) throws CFException {
   		return tgt199Grp.getTgt199((index));
	}


	/**
	 *	Returns String value of tgt199
	 *	@return tgt199
	 */
	public char[]  getTgt199String(int index) throws CFException {
	     return String.valueOf(tgt199Grp.getTgt199String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt199IsNumeric(int index)  throws CFException{
	    return tgt199Grp.tgt199IsNumeric(index);
	}

	/**
	 * 	Update Tgt199 with the passed value
	 *	@param number
	 */
	public void setTgt199(int index,long number)  throws CFException{
		tgt199Grp.setTgt199((index),number);
	}
	

	
	/**
	 * 	Update Tgt199 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt199(int index,char[] value)  throws CFException {
		tgt199Grp.setTgt199((index),value);
	}
	
	/**
	 * 	Update Tgt199 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt199String(int index,char[] value)  throws CFException{
		tgt199Grp.setTgt199((index),value);
	}	


        public TestnumCtx getTestnumCtx() {
            return TestnumCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt200Grp.hashCode();
        str += tgt199Grp.hashCode();
        str += work.hashCode();
        str += src198Grp.hashCode();
        str += src200Grp.hashCode();
       return str.hashCode();
    }

    public Process45OutCtx clone() {
        Process45OutCtx cloneObj = new Process45OutCtx();
        cloneObj.tgt200Grp = new Tgt200Grp();
        cloneObj.tgt200Grp.set(tgt200Grp.getClonedField());
        cloneObj.tgt199Grp = new Tgt199Grp();
        cloneObj.tgt199Grp.set(tgt199Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.src198Grp = new Src198Grp();
        cloneObj.src198Grp.set(src198Grp.getClonedField());
        cloneObj.src200Grp = new Src200Grp();
        cloneObj.src200Grp.set(src200Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process45OutCtx getProcess45OutCtx() {
            return new Process45OutCtx();
    }
}
