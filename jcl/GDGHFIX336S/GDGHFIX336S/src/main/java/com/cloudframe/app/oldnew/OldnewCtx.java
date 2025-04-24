package com.cloudframe.app.oldnew;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.oldnew.file.records.FsOutrec;
import com.cloudframe.app.oldnew.dto.Work;
import com.cloudframe.app.oldnew.file.records.FsRecord;


@Context
public class OldnewCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    FsOutrec fsOutrec;
    FsRecord fsRecord;
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


    public FsOutrec getFsOutrec() {
        if (fsOutrec == null) {
            fsOutrec = new FsOutrec();
        }

        return fsOutrec;
    }

    public void setFsOutrec(FsOutrec fsOutrec) {
        this.fsOutrec = fsOutrec;
    }
    public FsRecord getFsRecord() {
        if (fsRecord == null) {
            fsRecord = new FsRecord();
        }

        return fsRecord;
    }

    public void setFsRecord(FsRecord fsRecord) {
        this.fsRecord = fsRecord;
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
        str += fsOutrec.hashCode();
        str += fsRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OldnewCtx clone() {
        OldnewCtx cloneObj = new OldnewCtx();
        cloneObj.fsOutrec = new FsOutrec();
        cloneObj.fsOutrec.set(fsOutrec.getClonedField());
        cloneObj.fsRecord = new FsRecord();
        cloneObj.fsRecord.set(fsRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     FsOutrec fsOutrec = OldnewCtx.this.getFsOutrec();
     FsRecord fsRecord = OldnewCtx.this.getFsRecord();
     Work work = OldnewCtx.this.getWork();

	/**
	 *	Returns the value of fsOutrec
	 *	@return fsOutrec
	 */   
	 public FsOutrec getFsOutrec() {
   	return fsOutrec;
   }


	/**
	 *	Returns the value of eof
	 *	@return eof
	 */
   public char[] getEof() throws CFException  {              
   		return work.getEof();
   }

  
	/**
	*  set variable eof
	*  @param value
	**/
   public void setEof(char[] value) throws CFException {
      work.setEof(value);
   } 

	/**
	 *	Returns the value of recordWs
	 *	@return recordWs
	 */
   public char[] getRecordWs() throws CFException  {              
   		return work.getRecordWs();
   }

  
	/**
	*  set variable recordWs
	*  @param value
	**/
   public void setRecordWs(char[] value) throws CFException {
      work.setRecordWs(value);
   } 


        public OldnewCtx getOldnewCtx() {
            return OldnewCtx.this;
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
        str += fsOutrec.hashCode();
        str += fsRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.fsOutrec = new FsOutrec();
        cloneObj.fsOutrec.set(fsOutrec.getClonedField());
        cloneObj.fsRecord = new FsRecord();
        cloneObj.fsRecord.set(fsRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     FsOutrec fsOutrec = OldnewCtx.this.getFsOutrec();
     FsRecord fsRecord = OldnewCtx.this.getFsRecord();
     Work work = OldnewCtx.this.getWork();

	/**
	 *	Returns the value of eof
	 *	@return eof
	 */
   public char[] getEof() throws CFException  {              
   		return work.getEof();
   }

  
	/**
	*  set variable eof
	*  @param value
	**/
   public void setEof(char[] value) throws CFException {
      work.setEof(value);
   } 

	/**
	 *	Returns the value of fsRecord
	 *	@return fsRecord
	 */   
	 public FsRecord getFsRecord() {
   	return fsRecord;
   }



        public OldnewCtx getOldnewCtx() {
            return OldnewCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsOutrec.hashCode();
        str += fsRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.fsOutrec = new FsOutrec();
        cloneObj.fsOutrec.set(fsOutrec.getClonedField());
        cloneObj.fsRecord = new FsRecord();
        cloneObj.fsRecord.set(fsRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class WriteParaInCtx implements Cloneable {
     FsOutrec fsOutrec = OldnewCtx.this.getFsOutrec();
     Work work = OldnewCtx.this.getWork();

	/**
	 *	Returns the value of recordWs
	 *	@return recordWs
	 */
   public char[] getRecordWs() throws CFException  {              
   		return work.getRecordWs();
   }

  
	/**
	*  set variable recordWs
	*  @param value
	**/
   public void setRecordWs(char[] value) throws CFException {
      work.setRecordWs(value);
   } 


        public OldnewCtx getOldnewCtx() {
            return OldnewCtx.this;
        }

        public WriteParaOutCtx getWriteParaOutCtx() {
            return new WriteParaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsOutrec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteParaInCtx clone() {
        WriteParaInCtx cloneObj = new WriteParaInCtx();
        cloneObj.fsOutrec = new FsOutrec();
        cloneObj.fsOutrec.set(fsOutrec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteParaInCtx getWriteParaInCtx() {
            return new WriteParaInCtx();
    }
     public class WriteParaOutCtx implements Cloneable {
     FsOutrec fsOutrec = OldnewCtx.this.getFsOutrec();
     Work work = OldnewCtx.this.getWork();

	/**
	 *	Returns the value of fsOutrec
	 *	@return fsOutrec
	 */   
	 public FsOutrec getFsOutrec() {
   	return fsOutrec;
   }


	/**
	 *	Returns the value of recordWs
	 *	@return recordWs
	 */
   public char[] getRecordWs() throws CFException  {              
   		return work.getRecordWs();
   }

  
	/**
	*  set variable recordWs
	*  @param value
	**/
   public void setRecordWs(char[] value) throws CFException {
      work.setRecordWs(value);
   } 


        public OldnewCtx getOldnewCtx() {
            return OldnewCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsOutrec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteParaOutCtx clone() {
        WriteParaOutCtx cloneObj = new WriteParaOutCtx();
        cloneObj.fsOutrec = new FsOutrec();
        cloneObj.fsOutrec.set(fsOutrec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteParaOutCtx getWriteParaOutCtx() {
            return new WriteParaOutCtx();
    }
}
