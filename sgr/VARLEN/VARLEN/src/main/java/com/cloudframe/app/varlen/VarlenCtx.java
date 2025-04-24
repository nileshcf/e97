package com.cloudframe.app.varlen;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.varlen.dto.Work;
import com.cloudframe.app.varlen.dto.Revo3ExtractRecord;
import com.cloudframe.app.varlen.dto.RevoExtractRecord;


@Context
public class VarlenCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    RevoExtractRecord revoExtractRecord;
    Revo3ExtractRecord revo3ExtractRecord;
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


    public RevoExtractRecord getRevoExtractRecord() {
        if (revoExtractRecord == null) {
            revoExtractRecord = new RevoExtractRecord();
        }

        return revoExtractRecord;
    }

    public void setRevoExtractRecord(RevoExtractRecord revoExtractRecord) {
        this.revoExtractRecord = revoExtractRecord;
    }
    public Revo3ExtractRecord getRevo3ExtractRecord() {
        if (revo3ExtractRecord == null) {
            revo3ExtractRecord = new Revo3ExtractRecord();
        }

        return revo3ExtractRecord;
    }

    public void setRevo3ExtractRecord(Revo3ExtractRecord revo3ExtractRecord) {
        this.revo3ExtractRecord = revo3ExtractRecord;
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
        str += revoExtractRecord.hashCode();
        str += revo3ExtractRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public VarlenCtx clone() {
        VarlenCtx cloneObj = new VarlenCtx();
        cloneObj.revoExtractRecord = new RevoExtractRecord();
        cloneObj.revoExtractRecord.set(revoExtractRecord.getClonedField());
        cloneObj.revo3ExtractRecord = new Revo3ExtractRecord();
        cloneObj.revo3ExtractRecord.set(revo3ExtractRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     RevoExtractRecord revoExtractRecord = VarlenCtx.this.getRevoExtractRecord();
     Revo3ExtractRecord revo3ExtractRecord = VarlenCtx.this.getRevo3ExtractRecord();
     Work work = VarlenCtx.this.getWork();

	/**
	 *	Returns the value of revoExtractRecord
	 *	@return revoExtractRecord
	 */   
	 public RevoExtractRecord getRevoExtractRecord() {
   	return revoExtractRecord;
   }


	/**
	 *	Returns the value of revo3ExtractRecord
	 *	@return revo3ExtractRecord
	 */   
	 public Revo3ExtractRecord getRevo3ExtractRecord() {
   	return revo3ExtractRecord;
   }



        public VarlenCtx getVarlenCtx() {
            return VarlenCtx.this;
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
        str += revoExtractRecord.hashCode();
        str += revo3ExtractRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.revoExtractRecord = new RevoExtractRecord();
        cloneObj.revoExtractRecord.set(revoExtractRecord.getClonedField());
        cloneObj.revo3ExtractRecord = new Revo3ExtractRecord();
        cloneObj.revo3ExtractRecord.set(revo3ExtractRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     RevoExtractRecord revoExtractRecord = VarlenCtx.this.getRevoExtractRecord();
     Revo3ExtractRecord revo3ExtractRecord = VarlenCtx.this.getRevo3ExtractRecord();
     Work work = VarlenCtx.this.getWork();

	/**
	 *	Returns the value of activeSvcProdCnt
	 *	@return activeSvcProdCnt
	 */
	public short getActiveSvcProdCnt() throws CFException {        
   		return work.getActiveSvcProdCnt();
	}
	
	/**
	 * 	Update ActiveSvcProdCnt with the passed value
	 *	@param number
	 */
	public void setActiveSvcProdCnt(short number)  throws CFException{
		work.setActiveSvcProdCnt(number);
	}

	public void setActiveSvcProdCnt(int number)  throws CFException{
		work.setActiveSvcProdCnt((short)number);
	}

	public void setActiveSvcProdCnt(long number)  throws CFException{
		work.setActiveSvcProdCnt((short)number);
	}



	/**
	 *	Returns the value of revoExtractRecord
	 *	@return revoExtractRecord
	 */   
	 public RevoExtractRecord getRevoExtractRecord() {
   	return revoExtractRecord;
   }


	/**
	 *	Returns the value of revo3ExtractRecord
	 *	@return revo3ExtractRecord
	 */   
	 public Revo3ExtractRecord getRevo3ExtractRecord() {
   	return revo3ExtractRecord;
   }


	/**
	 *	Returns the value of activeFeatCnt
	 *	@return activeFeatCnt
	 */
	public short getActiveFeatCnt() throws CFException {        
   		return work.getActiveFeatCnt();
	}
	
	/**
	 * 	Update ActiveFeatCnt with the passed value
	 *	@param number
	 */
	public void setActiveFeatCnt(short number)  throws CFException{
		work.setActiveFeatCnt(number);
	}

	public void setActiveFeatCnt(int number)  throws CFException{
		work.setActiveFeatCnt((short)number);
	}

	public void setActiveFeatCnt(long number)  throws CFException{
		work.setActiveFeatCnt((short)number);
	}



	/**
	 *	Returns the value of displayLen
	 *	@return displayLen
	 */
	public int getDisplayLen() throws CFException {        
   		return work.getDisplayLen();
	}
	
	/**
	 * 	Update DisplayLen with the passed value
	 *	@param number
	 */
	public void setDisplayLen(int number)  throws CFException{
		work.setDisplayLen(number);
	}


	public void setDisplayLen(long number)  throws CFException{
		work.setDisplayLen((int)number);
	}



        public VarlenCtx getVarlenCtx() {
            return VarlenCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += revoExtractRecord.hashCode();
        str += revo3ExtractRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.revoExtractRecord = new RevoExtractRecord();
        cloneObj.revoExtractRecord.set(revoExtractRecord.getClonedField());
        cloneObj.revo3ExtractRecord = new Revo3ExtractRecord();
        cloneObj.revo3ExtractRecord.set(revo3ExtractRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
