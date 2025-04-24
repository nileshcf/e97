package com.cloudframe.app.gdgpgm2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.gdgpgm2.dto.Work;
import com.cloudframe.app.gdgpgm2.file.records.FsOutrec1;
import com.cloudframe.app.gdgpgm2.file.records.FsOutrec2;
import com.cloudframe.app.gdgpgm2.file.records.FsRecord1;
import com.cloudframe.app.gdgpgm2.file.records.FsRecord2;


@Context
public class Gdgpgm2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    FsOutrec1 fsOutrec1;
    FsRecord2 fsRecord2;
    Work work;
    FsRecord1 fsRecord1;
    FsOutrec2 fsOutrec2;


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


    public FsOutrec1 getFsOutrec1() {
        if (fsOutrec1 == null) {
            fsOutrec1 = new FsOutrec1();
        }

        return fsOutrec1;
    }

    public void setFsOutrec1(FsOutrec1 fsOutrec1) {
        this.fsOutrec1 = fsOutrec1;
    }
    public FsRecord2 getFsRecord2() {
        if (fsRecord2 == null) {
            fsRecord2 = new FsRecord2();
        }

        return fsRecord2;
    }

    public void setFsRecord2(FsRecord2 fsRecord2) {
        this.fsRecord2 = fsRecord2;
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
    public FsRecord1 getFsRecord1() {
        if (fsRecord1 == null) {
            fsRecord1 = new FsRecord1();
        }

        return fsRecord1;
    }

    public void setFsRecord1(FsRecord1 fsRecord1) {
        this.fsRecord1 = fsRecord1;
    }
    public FsOutrec2 getFsOutrec2() {
        if (fsOutrec2 == null) {
            fsOutrec2 = new FsOutrec2();
        }

        return fsOutrec2;
    }

    public void setFsOutrec2(FsOutrec2 fsOutrec2) {
        this.fsOutrec2 = fsOutrec2;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsOutrec1.hashCode();
        str += fsRecord2.hashCode();
        str += work.hashCode();
        str += fsRecord1.hashCode();
        str += fsOutrec2.hashCode();
       return str.hashCode();
    }

    public Gdgpgm2Ctx clone() {
        Gdgpgm2Ctx cloneObj = new Gdgpgm2Ctx();
        cloneObj.fsOutrec1 = new FsOutrec1();
        cloneObj.fsOutrec1.set(fsOutrec1.getClonedField());
        cloneObj.fsRecord2 = new FsRecord2();
        cloneObj.fsRecord2.set(fsRecord2.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fsRecord1 = new FsRecord1();
        cloneObj.fsRecord1.set(fsRecord1.getClonedField());
        cloneObj.fsOutrec2 = new FsOutrec2();
        cloneObj.fsOutrec2.set(fsOutrec2.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class CopyFile1InCtx implements Cloneable {
     FsOutrec1 fsOutrec1 = Gdgpgm2Ctx.this.getFsOutrec1();
     Work work = Gdgpgm2Ctx.this.getWork();
     FsRecord1 fsRecord1 = Gdgpgm2Ctx.this.getFsRecord1();

	/**
	 *	Returns the value of fsOutrec1
	 *	@return fsOutrec1
	 */   
	 public FsOutrec1 getFsOutrec1() {
   	return fsOutrec1;
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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
        }

        public CopyFile1OutCtx getCopyFile1OutCtx() {
            return new CopyFile1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsOutrec1.hashCode();
        str += work.hashCode();
        str += fsRecord1.hashCode();
       return str.hashCode();
    }

    public CopyFile1InCtx clone() {
        CopyFile1InCtx cloneObj = new CopyFile1InCtx();
        cloneObj.fsOutrec1 = new FsOutrec1();
        cloneObj.fsOutrec1.set(fsOutrec1.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fsRecord1 = new FsRecord1();
        cloneObj.fsRecord1.set(fsRecord1.getClonedField());
        return cloneObj;
    }

    }

    public CopyFile1InCtx getCopyFile1InCtx() {
            return new CopyFile1InCtx();
    }
     public class CopyFile1OutCtx implements Cloneable {
     FsOutrec1 fsOutrec1 = Gdgpgm2Ctx.this.getFsOutrec1();
     Work work = Gdgpgm2Ctx.this.getWork();
     FsRecord1 fsRecord1 = Gdgpgm2Ctx.this.getFsRecord1();

	/**
	 *	Returns the value of fsRecord1
	 *	@return fsRecord1
	 */   
	 public FsRecord1 getFsRecord1() {
   	return fsRecord1;
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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsOutrec1.hashCode();
        str += work.hashCode();
        str += fsRecord1.hashCode();
       return str.hashCode();
    }

    public CopyFile1OutCtx clone() {
        CopyFile1OutCtx cloneObj = new CopyFile1OutCtx();
        cloneObj.fsOutrec1 = new FsOutrec1();
        cloneObj.fsOutrec1.set(fsOutrec1.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fsRecord1 = new FsRecord1();
        cloneObj.fsRecord1.set(fsRecord1.getClonedField());
        return cloneObj;
    }

    }

    public CopyFile1OutCtx getCopyFile1OutCtx() {
            return new CopyFile1OutCtx();
    }
     public class WriteParaInCtx implements Cloneable {
     FsOutrec1 fsOutrec1 = Gdgpgm2Ctx.this.getFsOutrec1();
     Work work = Gdgpgm2Ctx.this.getWork();

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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
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
        str += fsOutrec1.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteParaInCtx clone() {
        WriteParaInCtx cloneObj = new WriteParaInCtx();
        cloneObj.fsOutrec1 = new FsOutrec1();
        cloneObj.fsOutrec1.set(fsOutrec1.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteParaInCtx getWriteParaInCtx() {
            return new WriteParaInCtx();
    }
     public class WriteParaOutCtx implements Cloneable {
     FsOutrec1 fsOutrec1 = Gdgpgm2Ctx.this.getFsOutrec1();
     Work work = Gdgpgm2Ctx.this.getWork();

	/**
	 *	Returns the value of fsOutrec1
	 *	@return fsOutrec1
	 */   
	 public FsOutrec1 getFsOutrec1() {
   	return fsOutrec1;
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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsOutrec1.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteParaOutCtx clone() {
        WriteParaOutCtx cloneObj = new WriteParaOutCtx();
        cloneObj.fsOutrec1 = new FsOutrec1();
        cloneObj.fsOutrec1.set(fsOutrec1.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteParaOutCtx getWriteParaOutCtx() {
            return new WriteParaOutCtx();
    }
     public class CopyFile2InCtx implements Cloneable {
     FsRecord2 fsRecord2 = Gdgpgm2Ctx.this.getFsRecord2();
     Work work = Gdgpgm2Ctx.this.getWork();
     FsOutrec2 fsOutrec2 = Gdgpgm2Ctx.this.getFsOutrec2();

	/**
	 *	Returns the value of fsOutrec2
	 *	@return fsOutrec2
	 */   
	 public FsOutrec2 getFsOutrec2() {
   	return fsOutrec2;
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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
        }

        public CopyFile2OutCtx getCopyFile2OutCtx() {
            return new CopyFile2OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsRecord2.hashCode();
        str += work.hashCode();
        str += fsOutrec2.hashCode();
       return str.hashCode();
    }

    public CopyFile2InCtx clone() {
        CopyFile2InCtx cloneObj = new CopyFile2InCtx();
        cloneObj.fsRecord2 = new FsRecord2();
        cloneObj.fsRecord2.set(fsRecord2.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fsOutrec2 = new FsOutrec2();
        cloneObj.fsOutrec2.set(fsOutrec2.getClonedField());
        return cloneObj;
    }

    }

    public CopyFile2InCtx getCopyFile2InCtx() {
            return new CopyFile2InCtx();
    }
     public class CopyFile2OutCtx implements Cloneable {
     FsRecord2 fsRecord2 = Gdgpgm2Ctx.this.getFsRecord2();
     Work work = Gdgpgm2Ctx.this.getWork();
     FsOutrec2 fsOutrec2 = Gdgpgm2Ctx.this.getFsOutrec2();

	/**
	 *	Returns the value of fsRecord2
	 *	@return fsRecord2
	 */   
	 public FsRecord2 getFsRecord2() {
   	return fsRecord2;
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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fsRecord2.hashCode();
        str += work.hashCode();
        str += fsOutrec2.hashCode();
       return str.hashCode();
    }

    public CopyFile2OutCtx clone() {
        CopyFile2OutCtx cloneObj = new CopyFile2OutCtx();
        cloneObj.fsRecord2 = new FsRecord2();
        cloneObj.fsRecord2.set(fsRecord2.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fsOutrec2 = new FsOutrec2();
        cloneObj.fsOutrec2.set(fsOutrec2.getClonedField());
        return cloneObj;
    }

    }

    public CopyFile2OutCtx getCopyFile2OutCtx() {
            return new CopyFile2OutCtx();
    }
     public class WritePara2001InCtx implements Cloneable {
     Work work = Gdgpgm2Ctx.this.getWork();
     FsOutrec2 fsOutrec2 = Gdgpgm2Ctx.this.getFsOutrec2();

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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
        }

        public WritePara2001OutCtx getWritePara2001OutCtx() {
            return new WritePara2001OutCtx();
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
        str += fsOutrec2.hashCode();
       return str.hashCode();
    }

    public WritePara2001InCtx clone() {
        WritePara2001InCtx cloneObj = new WritePara2001InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fsOutrec2 = new FsOutrec2();
        cloneObj.fsOutrec2.set(fsOutrec2.getClonedField());
        return cloneObj;
    }

    }

    public WritePara2001InCtx getWritePara2001InCtx() {
            return new WritePara2001InCtx();
    }
     public class WritePara2001OutCtx implements Cloneable {
     Work work = Gdgpgm2Ctx.this.getWork();
     FsOutrec2 fsOutrec2 = Gdgpgm2Ctx.this.getFsOutrec2();

	/**
	 *	Returns the value of fsOutrec2
	 *	@return fsOutrec2
	 */   
	 public FsOutrec2 getFsOutrec2() {
   	return fsOutrec2;
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


        public Gdgpgm2Ctx getGdgpgm2Ctx() {
            return Gdgpgm2Ctx.this;
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
        str += fsOutrec2.hashCode();
       return str.hashCode();
    }

    public WritePara2001OutCtx clone() {
        WritePara2001OutCtx cloneObj = new WritePara2001OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fsOutrec2 = new FsOutrec2();
        cloneObj.fsOutrec2.set(fsOutrec2.getClonedField());
        return cloneObj;
    }

    }

    public WritePara2001OutCtx getWritePara2001OutCtx() {
            return new WritePara2001OutCtx();
    }
}
