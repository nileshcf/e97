package com.cloudframe.app.comput2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.comput2.dto.Work;


@Context
public class Comput2Ctx implements ProgramContext, Cloneable {
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

    public Comput2Ctx clone() {
        Comput2Ctx cloneObj = new Comput2Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Comput2Ctx.this.getWork();

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



        public Comput2Ctx getComput2Ctx() {
            return Comput2Ctx.this;
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
     Work work = Comput2Ctx.this.getWork();

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




        public Comput2Ctx getComput2Ctx() {
            return Comput2Ctx.this;
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
