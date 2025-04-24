package com.cloudframe.app.mc071;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mc071.dto.Work;
import com.cloudframe.app.mc071.file.records.OutputRecord;


@Context
public class Mc071Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    OutputRecord outputRecord;
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


    public OutputRecord getOutputRecord() {
        if (outputRecord == null) {
            outputRecord = new OutputRecord();
        }

        return outputRecord;
    }

    public void setOutputRecord(OutputRecord outputRecord) {
        this.outputRecord = outputRecord;
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
        str += outputRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Mc071Ctx clone() {
        Mc071Ctx cloneObj = new Mc071Ctx();
        cloneObj.outputRecord = new OutputRecord();
        cloneObj.outputRecord.set(outputRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessOutCtx implements Cloneable {
     OutputRecord outputRecord = Mc071Ctx.this.getOutputRecord();
     Work work = Mc071Ctx.this.getWork();

	/**
	 *	Returns the value of outputRecord
	 *	@return outputRecord
	 */   
	 public OutputRecord getOutputRecord() {
   	return outputRecord;
   }


	/**
	 *	Returns the value of outputFileStatus
	 *	@return outputFileStatus
	 */
   public char[] getOutputFileStatus() throws CFException  {              
   		return work.getOutputFileStatus();
   }

  
	/**
	*  set variable outputFileStatus
	*  @param value
	**/
   public void setOutputFileStatus(char[] value) throws CFException {
      work.setOutputFileStatus(value);
   } 


        public Mc071Ctx getMc071Ctx() {
            return Mc071Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.outputRecord = new OutputRecord();
        cloneObj.outputRecord.set(outputRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
