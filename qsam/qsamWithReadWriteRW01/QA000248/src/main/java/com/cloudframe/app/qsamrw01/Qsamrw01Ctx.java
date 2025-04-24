package com.cloudframe.app.qsamrw01;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.qsamrw01.file.records.Sys103FileIdHistoryRec;
import com.cloudframe.app.qsamrw01.dto.Work;
import com.cloudframe.app.qsamrw01.dto.HistoryRec;


@Context
public class Qsamrw01Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    HistoryRec historyRec;
    Sys103FileIdHistoryRec sys103FileIdHistoryRec;
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


    public HistoryRec getHistoryRec() {
        if (historyRec == null) {
            historyRec = new HistoryRec();
        }

        return historyRec;
    }

    public void setHistoryRec(HistoryRec historyRec) {
        this.historyRec = historyRec;
    }
    public Sys103FileIdHistoryRec getSys103FileIdHistoryRec() {
        if (sys103FileIdHistoryRec == null) {
            sys103FileIdHistoryRec = new Sys103FileIdHistoryRec();
        }

        return sys103FileIdHistoryRec;
    }

    public void setSys103FileIdHistoryRec(Sys103FileIdHistoryRec sys103FileIdHistoryRec) {
        this.sys103FileIdHistoryRec = sys103FileIdHistoryRec;
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
        str += historyRec.hashCode();
        str += sys103FileIdHistoryRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Qsamrw01Ctx clone() {
        Qsamrw01Ctx cloneObj = new Qsamrw01Ctx();
        cloneObj.historyRec = new HistoryRec();
        cloneObj.historyRec.set(historyRec.getClonedField());
        cloneObj.sys103FileIdHistoryRec = new Sys103FileIdHistoryRec();
        cloneObj.sys103FileIdHistoryRec.set(sys103FileIdHistoryRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ExecuteInitializationInCtx implements Cloneable {
     Work work = Qsamrw01Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isItIsTheFirstTime88()
	 *	@return  Returns true if isItIsTheFirstTime88() is "Y"
	 */
   public boolean isItIsTheFirstTime88() throws CFException {
      return work.isItIsTheFirstTime88();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88True()  throws CFException{  			
    	work.setItIsTheFirstTime88True();
   	}

        public Qsamrw01Ctx getQsamrw01Ctx() {
            return Qsamrw01Ctx.this;
        }

        public ExecuteInitializationOutCtx getExecuteInitializationOutCtx() {
            return new ExecuteInitializationOutCtx();
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

    public ExecuteInitializationInCtx clone() {
        ExecuteInitializationInCtx cloneObj = new ExecuteInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteInitializationInCtx getExecuteInitializationInCtx() {
            return new ExecuteInitializationInCtx();
    }
     public class ExecuteInitializationOutCtx implements Cloneable {
     Work work = Qsamrw01Ctx.this.getWork();

	/**
	 *	Returns the value of fileSeqNbr400
	 *	@return fileSeqNbr400
	 */
	public int getFileSeqNbr400() throws CFException {
   		return work.getFileSeqNbr400();
	}


	/**
	 *	Returns String value of fileSeqNbr400
	 *	@return fileSeqNbr400
	 */
	public char[]  getFileSeqNbr400String() throws CFException {
	     return String.valueOf(work.getFileSeqNbr400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fileSeqNbr400IsNumeric()  throws CFException{
	    return work.fileSeqNbr400IsNumeric();
	}

	/**
	 * 	Update FileSeqNbr400 with the passed value
	 *	@param number
	 */
	public void setFileSeqNbr400(int number)  throws CFException{
		work.setFileSeqNbr400(number);
	}
	

	public void setFileSeqNbr400(long number)  throws CFException{
	    work.setFileSeqNbr400(number);
	}
	
	
	/**
	 * 	Update FileSeqNbr400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFileSeqNbr400(char[] value)  throws CFException {
		work.setFileSeqNbr400(value);
	}
	
	/**
	 * 	Update FileSeqNbr400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFileSeqNbr400String(char[] value)  throws CFException{
		work.setFileSeqNbr400(value);
	}	

	/**
	 *	Test condition "N" for isItIsNotFirstTime88()
	 *	@return  Returns true if isItIsNotFirstTime88() is "N"
	 */
   public boolean isItIsNotFirstTime88() throws CFException {
      return work.isItIsNotFirstTime88();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88True()  throws CFException{  			
    	work.setItIsNotFirstTime88True();
   	}

        public Qsamrw01Ctx getQsamrw01Ctx() {
            return Qsamrw01Ctx.this;
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

    public ExecuteInitializationOutCtx clone() {
        ExecuteInitializationOutCtx cloneObj = new ExecuteInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteInitializationOutCtx getExecuteInitializationOutCtx() {
            return new ExecuteInitializationOutCtx();
    }
     public class DisplayExecuteMsgOutCtx implements Cloneable {
     HistoryRec historyRec = Qsamrw01Ctx.this.getHistoryRec();
     Work work = Qsamrw01Ctx.this.getWork();
     Sys103FileIdHistoryRec sys103FileIdHistoryRec = Qsamrw01Ctx.this.getSys103FileIdHistoryRec();

	/**
	 *	Test condition "Y" for isHistFileEmpty88100()
	 *	@return  Returns true if isHistFileEmpty88100() is "Y"
	 */
   public boolean isHistFileEmpty88100() throws CFException {
      return work.isHistFileEmpty88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setHistFileEmpty88100True()  throws CFException{  			
    	work.setHistFileEmpty88100True();
   	}
	/**
	 *	Returns the value of historyRec
	 *	@return historyRec
	 */   
	 public HistoryRec getHistoryRec() {
   	return historyRec;
   }


	/**
	 *	Returns the value of sys103FileIdHistoryRec
	 *	@return sys103FileIdHistoryRec
	 */   
	 public Sys103FileIdHistoryRec getSys103FileIdHistoryRec() {
   	return sys103FileIdHistoryRec;
   }



        public Qsamrw01Ctx getQsamrw01Ctx() {
            return Qsamrw01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += historyRec.hashCode();
        str += work.hashCode();
        str += sys103FileIdHistoryRec.hashCode();
       return str.hashCode();
    }

    public DisplayExecuteMsgOutCtx clone() {
        DisplayExecuteMsgOutCtx cloneObj = new DisplayExecuteMsgOutCtx();
        cloneObj.historyRec = new HistoryRec();
        cloneObj.historyRec.set(historyRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys103FileIdHistoryRec = new Sys103FileIdHistoryRec();
        cloneObj.sys103FileIdHistoryRec.set(sys103FileIdHistoryRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecuteMsgOutCtx getDisplayExecuteMsgOutCtx() {
            return new DisplayExecuteMsgOutCtx();
    }
     public class ProcessMessageInCtx implements Cloneable {
     HistoryRec historyRec = Qsamrw01Ctx.this.getHistoryRec();

	/**
	 *	Returns the value of historyRows
	 *	@return historyRows
	 */
   public char[] getHistoryRows(int index) throws CFException  {              
   		return historyRec.getHistoryRows(index);
   }

  
	/**
	*  set variable historyRows
	*  @param value
	**/
   public void setHistoryRows(int index,char[] value) throws CFException {
      historyRec.setHistoryRows((index),value);
   } 

	/**
	 *	Returns the value of historyRec
	 *	@return historyRec
	 */   
	 public HistoryRec getHistoryRec() {
   	return historyRec;
   }



        public Qsamrw01Ctx getQsamrw01Ctx() {
            return Qsamrw01Ctx.this;
        }

        public ProcessMessageOutCtx getProcessMessageOutCtx() {
            return new ProcessMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += historyRec.hashCode();
       return str.hashCode();
    }

    public ProcessMessageInCtx clone() {
        ProcessMessageInCtx cloneObj = new ProcessMessageInCtx();
        cloneObj.historyRec = new HistoryRec();
        cloneObj.historyRec.set(historyRec.getClonedField());
        return cloneObj;
    }

    }

    public ProcessMessageInCtx getProcessMessageInCtx() {
            return new ProcessMessageInCtx();
    }
     public class ProcessMessageOutCtx implements Cloneable {
     HistoryRec historyRec = Qsamrw01Ctx.this.getHistoryRec();

	/**
	 *	Returns the value of historyRows
	 *	@return historyRows
	 */
   public char[] getHistoryRows(int index) throws CFException  {              
   		return historyRec.getHistoryRows(index);
   }

  
	/**
	*  set variable historyRows
	*  @param value
	**/
   public void setHistoryRows(int index,char[] value) throws CFException {
      historyRec.setHistoryRows((index),value);
   } 


        public Qsamrw01Ctx getQsamrw01Ctx() {
            return Qsamrw01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += historyRec.hashCode();
       return str.hashCode();
    }

    public ProcessMessageOutCtx clone() {
        ProcessMessageOutCtx cloneObj = new ProcessMessageOutCtx();
        cloneObj.historyRec = new HistoryRec();
        cloneObj.historyRec.set(historyRec.getClonedField());
        return cloneObj;
    }

    }

    public ProcessMessageOutCtx getProcessMessageOutCtx() {
            return new ProcessMessageOutCtx();
    }
     public class WriteFileIdHistInCtx implements Cloneable {
     HistoryRec historyRec = Qsamrw01Ctx.this.getHistoryRec();
     Work work = Qsamrw01Ctx.this.getWork();
     Sys103FileIdHistoryRec sys103FileIdHistoryRec = Qsamrw01Ctx.this.getSys103FileIdHistoryRec();

	/**
	 *	Test condition "Y" for isHistFileEmpty88100()
	 *	@return  Returns true if isHistFileEmpty88100() is "Y"
	 */
   public boolean isHistFileEmpty88100() throws CFException {
      return work.isHistFileEmpty88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setHistFileEmpty88100True()  throws CFException{  			
    	work.setHistFileEmpty88100True();
   	}
	/**
	 *	Returns the value of historyRec
	 *	@return historyRec
	 */   
	 public HistoryRec getHistoryRec() {
   	return historyRec;
   }


	/**
	 *	Returns the value of sys103FileIdHistoryRec
	 *	@return sys103FileIdHistoryRec
	 */   
	 public Sys103FileIdHistoryRec getSys103FileIdHistoryRec() {
   	return sys103FileIdHistoryRec;
   }



        public Qsamrw01Ctx getQsamrw01Ctx() {
            return Qsamrw01Ctx.this;
        }

        public WriteFileIdHistOutCtx getWriteFileIdHistOutCtx() {
            return new WriteFileIdHistOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += historyRec.hashCode();
        str += work.hashCode();
        str += sys103FileIdHistoryRec.hashCode();
       return str.hashCode();
    }

    public WriteFileIdHistInCtx clone() {
        WriteFileIdHistInCtx cloneObj = new WriteFileIdHistInCtx();
        cloneObj.historyRec = new HistoryRec();
        cloneObj.historyRec.set(historyRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys103FileIdHistoryRec = new Sys103FileIdHistoryRec();
        cloneObj.sys103FileIdHistoryRec.set(sys103FileIdHistoryRec.getClonedField());
        return cloneObj;
    }

    }

    public WriteFileIdHistInCtx getWriteFileIdHistInCtx() {
            return new WriteFileIdHistInCtx();
    }
     public class WriteFileIdHistOutCtx implements Cloneable {
     HistoryRec historyRec = Qsamrw01Ctx.this.getHistoryRec();
     Sys103FileIdHistoryRec sys103FileIdHistoryRec = Qsamrw01Ctx.this.getSys103FileIdHistoryRec();
     Work work = Qsamrw01Ctx.this.getWork();

	/**
	 *	Returns the value of sys103FileIdHistoryRec
	 *	@return sys103FileIdHistoryRec
	 */   
	 public Sys103FileIdHistoryRec getSys103FileIdHistoryRec() {
   	return sys103FileIdHistoryRec;
   }



        public Qsamrw01Ctx getQsamrw01Ctx() {
            return Qsamrw01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += historyRec.hashCode();
        str += sys103FileIdHistoryRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteFileIdHistOutCtx clone() {
        WriteFileIdHistOutCtx cloneObj = new WriteFileIdHistOutCtx();
        cloneObj.historyRec = new HistoryRec();
        cloneObj.historyRec.set(historyRec.getClonedField());
        cloneObj.sys103FileIdHistoryRec = new Sys103FileIdHistoryRec();
        cloneObj.sys103FileIdHistoryRec.set(sys103FileIdHistoryRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteFileIdHistOutCtx getWriteFileIdHistOutCtx() {
            return new WriteFileIdHistOutCtx();
    }
}
