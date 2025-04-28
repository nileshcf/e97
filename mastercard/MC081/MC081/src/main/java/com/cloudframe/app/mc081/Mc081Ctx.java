package com.cloudframe.app.mc081;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mc081.file.records.FbRecordOut;
import com.cloudframe.app.mc081.dto.Work;


@Context
public class Mc081Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    FbRecordOut fbRecordOut;
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


    public FbRecordOut getFbRecordOut() {
        if (fbRecordOut == null) {
            fbRecordOut = new FbRecordOut();
        }

        return fbRecordOut;
    }

    public void setFbRecordOut(FbRecordOut fbRecordOut) {
        this.fbRecordOut = fbRecordOut;
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
        str += fbRecordOut.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Mc081Ctx clone() {
        Mc081Ctx cloneObj = new Mc081Ctx();
        cloneObj.fbRecordOut = new FbRecordOut();
        cloneObj.fbRecordOut.set(fbRecordOut.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessOutCtx implements Cloneable {
     FbRecordOut fbRecordOut = Mc081Ctx.this.getFbRecordOut();
     Work work = Mc081Ctx.this.getWork();

	/**
	 *	Returns the value of fbFileStatus
	 *	@return fbFileStatus
	 */
   public char[] getFbFileStatus() throws CFException  {              
   		return work.getFbFileStatus();
   }

  
	/**
	*  set variable fbFileStatus
	*  @param value
	**/
   public void setFbFileStatus(char[] value) throws CFException {
      work.setFbFileStatus(value);
   } 

	/**
	 *	Returns the value of fbBigRec
	 *	@return fbBigRec
	 */
   public char[] getFbBigRec() throws CFException  {              
   		return work.getFbBigRec();
   }

  
	/**
	*  set variable fbBigRec
	*  @param value
	**/
   public void setFbBigRec(char[] value) throws CFException {
      work.setFbBigRec(value);
   } 

	/**
	 *	Returns the value of fbRecordOut
	 *	@return fbRecordOut
	 */   
	 public FbRecordOut getFbRecordOut() {
   	return fbRecordOut;
   }



        public Mc081Ctx getMc081Ctx() {
            return Mc081Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fbRecordOut.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.fbRecordOut = new FbRecordOut();
        cloneObj.fbRecordOut.set(fbRecordOut.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
