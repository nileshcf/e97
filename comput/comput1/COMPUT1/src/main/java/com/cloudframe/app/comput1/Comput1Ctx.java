package com.cloudframe.app.comput1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.comput1.dto.Work;


@Context
public class Comput1Ctx implements ProgramContext, Cloneable {
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

    public Comput1Ctx clone() {
        Comput1Ctx cloneObj = new Comput1Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Comput1Ctx.this.getWork();

	/**
	 *	Returns the value of cKilobyteNum
	 *	@return cKilobyteNum
	 */
	public int getCKilobyteNum() throws CFException {        
   		return work.getCKilobyteNum();
	}
	
	/**
	 * 	Update CKilobyteNum with the passed value
	 *	@param number
	 */
	public void setCKilobyteNum(int number)  throws CFException{
		work.setCKilobyteNum(number);
	}


	public void setCKilobyteNum(long number)  throws CFException{
		work.setCKilobyteNum((int)number);
	}


	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
	}



	/**
	 *	Returns the value of cMegabyteNum
	 *	@return cMegabyteNum
	 */
	public int getCMegabyteNum() throws CFException {        
   		return work.getCMegabyteNum();
	}
	
	/**
	 * 	Update CMegabyteNum with the passed value
	 *	@param number
	 */
	public void setCMegabyteNum(int number)  throws CFException{
		work.setCMegabyteNum(number);
	}


	public void setCMegabyteNum(long number)  throws CFException{
		work.setCMegabyteNum((int)number);
	}


	/**
	 *	Returns the value of cGigabyteNum
	 *	@return cGigabyteNum
	 */
	public int getCGigabyteNum() throws CFException {        
   		return work.getCGigabyteNum();
	}
	
	/**
	 * 	Update CGigabyteNum with the passed value
	 *	@param number
	 */
	public void setCGigabyteNum(int number)  throws CFException{
		work.setCGigabyteNum(number);
	}


	public void setCGigabyteNum(long number)  throws CFException{
		work.setCGigabyteNum((int)number);
	}



        public Comput1Ctx getComput1Ctx() {
            return Comput1Ctx.this;
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
     Work work = Comput1Ctx.this.getWork();

	/**
	 *	Returns the value of cKilobyteNum
	 *	@return cKilobyteNum
	 */
	public int getCKilobyteNum() throws CFException {        
   		return work.getCKilobyteNum();
	}
	
	/**
	 * 	Update CKilobyteNum with the passed value
	 *	@param number
	 */
	public void setCKilobyteNum(int number)  throws CFException{
		work.setCKilobyteNum(number);
	}


	public void setCKilobyteNum(long number)  throws CFException{
		work.setCKilobyteNum((int)number);
	}


	public BigDecimal getRlu3aTotDataPromoAllow() throws CFException{      
   		return work.getRlu3aTotDataPromoAllow();
	}

    public char[] getRlu3aTotDataPromoAllowString() throws CFException {
          return  work.getRlu3aTotDataPromoAllow().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Rlu3aTotDataPromoAllow with the passed number
	 *	@param number
	 */
	public void setRlu3aTotDataPromoAllow(BigDecimal number)  throws CFException{
		work.setRlu3aTotDataPromoAllow(number);
   }

	public BigDecimal getRlu3aAcctPlanDataAllow() throws CFException{      
   		return work.getRlu3aAcctPlanDataAllow();
	}

    public char[] getRlu3aAcctPlanDataAllowString() throws CFException {
          return  work.getRlu3aAcctPlanDataAllow().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Rlu3aAcctPlanDataAllow with the passed number
	 *	@param number
	 */
	public void setRlu3aAcctPlanDataAllow(BigDecimal number)  throws CFException{
		work.setRlu3aAcctPlanDataAllow(number);
   }

	public BigDecimal getAllow() throws CFException{      
   		return work.getAllow();
	}

    public char[] getAllowString() throws CFException {
          return  work.getAllow().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Allow with the passed number
	 *	@param number
	 */
	public void setAllow(BigDecimal number)  throws CFException{
		work.setAllow(number);
   }

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
	}



	/**
	 *	Returns the value of cMegabyteNum
	 *	@return cMegabyteNum
	 */
	public int getCMegabyteNum() throws CFException {        
   		return work.getCMegabyteNum();
	}
	
	/**
	 * 	Update CMegabyteNum with the passed value
	 *	@param number
	 */
	public void setCMegabyteNum(int number)  throws CFException{
		work.setCMegabyteNum(number);
	}


	public void setCMegabyteNum(long number)  throws CFException{
		work.setCMegabyteNum((int)number);
	}


	public BigDecimal getOosuSharedAllow() throws CFException{      
   		return work.getOosuSharedAllow();
	}

    public char[] getOosuSharedAllowString() throws CFException {
          return  work.getOosuSharedAllow().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update OosuSharedAllow with the passed number
	 *	@param number
	 */
	public void setOosuSharedAllow(BigDecimal number)  throws CFException{
		work.setOosuSharedAllow(number);
   }

	/**
	 *	Returns the value of cGigabyteNum
	 *	@return cGigabyteNum
	 */
	public int getCGigabyteNum() throws CFException {        
   		return work.getCGigabyteNum();
	}
	
	/**
	 * 	Update CGigabyteNum with the passed value
	 *	@param number
	 */
	public void setCGigabyteNum(int number)  throws CFException{
		work.setCGigabyteNum(number);
	}


	public void setCGigabyteNum(long number)  throws CFException{
		work.setCGigabyteNum((int)number);
	}


public long getDiv() throws CFException {  
        return work.getDiv();
}
	/**
	 * 	Update Div with the passed value
	 *	@param number
	 */
	public void setDiv(long number)  throws CFException{
		work.setDiv(number);
	}




        public Comput1Ctx getComput1Ctx() {
            return Comput1Ctx.this;
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
