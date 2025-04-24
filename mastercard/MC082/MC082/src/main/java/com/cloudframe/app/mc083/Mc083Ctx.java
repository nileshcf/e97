package com.cloudframe.app.mc083;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.FirstTimeCallGroup;
import com.cloudframe.app.mc083.file.records.FbRecordOut;
import com.cloudframe.app.mc083.dto.Work;
import com.cloudframe.app.mc083.dto.Mc083ReadFileParm;


@Context
public class Mc083Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Mc083ReadFileParm mc083ReadFileParm;
    FbRecordOut fbRecordOut;
    FirstTimeCallGroup firstTimeCallGroup;
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


    public Mc083ReadFileParm getMc083ReadFileParm() {
        if (mc083ReadFileParm == null) {
            mc083ReadFileParm = new Mc083ReadFileParm();
        }

        return mc083ReadFileParm;
    }

    public void setMc083ReadFileParm(Mc083ReadFileParm mc083ReadFileParm) {
        this.mc083ReadFileParm = mc083ReadFileParm;
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
    public FirstTimeCallGroup getFirstTimeCallGroup() {
        if (firstTimeCallGroup == null) {
            firstTimeCallGroup = globalCtx.getGlobalDto(FirstTimeCallGroup.class);
        }

        return firstTimeCallGroup;
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
        str += mc083ReadFileParm.hashCode();
        str += fbRecordOut.hashCode();
        str += firstTimeCallGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Mc083Ctx clone() {
        Mc083Ctx cloneObj = new Mc083Ctx();
        cloneObj.mc083ReadFileParm = new Mc083ReadFileParm();
        cloneObj.mc083ReadFileParm.set(mc083ReadFileParm.getClonedField());
        cloneObj.fbRecordOut = new FbRecordOut();
        cloneObj.fbRecordOut.set(fbRecordOut.getClonedField());
        cloneObj.firstTimeCallGroup = new FirstTimeCallGroup();
        cloneObj.firstTimeCallGroup.set(firstTimeCallGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Mc083ReadFileParm mc083ReadFileParm = Mc083Ctx.this.getMc083ReadFileParm();
     FbRecordOut fbRecordOut = Mc083Ctx.this.getFbRecordOut();
     FirstTimeCallGroup firstTimeCallGroup = Mc083Ctx.this.getFirstTimeCallGroup();
     Work work = Mc083Ctx.this.getWork();

	/**
	 *	Returns the value of fbRecordOut
	 *	@return fbRecordOut
	 */   
	 public FbRecordOut getFbRecordOut() {
   	return fbRecordOut;
   }


	/**
	 *	Returns the value of firstTimeCall
	 *	@return firstTimeCall
	 */
   public char[] getFirstTimeCall() throws CFException  {              
   		return firstTimeCallGroup.getFirstTimeCall();
   }

  
	/**
	*  set variable firstTimeCall
	*  @param value
	**/
   public void setFirstTimeCall(char[] value) throws CFException {
      firstTimeCallGroup.setFirstTimeCall(value);
   } 

     /**
	 * 	Update FirstTimeCall 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFirstTimeCall(char[] source, int sourceIndex) throws CFException {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex);
   	
   }
   
   public void setFirstTimeCall(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FirstTimeCall 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFirstTimeCall(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FirstTimeCall with another Field
	 *	@param value
	 */
   public void setFirstTimeCall(Field source) {
      firstTimeCallGroup.setFirstTimeCall(source);
   }  
   
     /**
	 * 	Update FirstTimeCall 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFirstTimeCall(Field source, int sourceIndex,int sourceLen) {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FirstTimeCall 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFirstTimeCall(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mc083Ctx getMc083Ctx() {
            return Mc083Ctx.this;
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
        str += mc083ReadFileParm.hashCode();
        str += fbRecordOut.hashCode();
        str += firstTimeCallGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.mc083ReadFileParm = new Mc083ReadFileParm();
        cloneObj.mc083ReadFileParm.set(mc083ReadFileParm.getClonedField());
        cloneObj.fbRecordOut = new FbRecordOut();
        cloneObj.fbRecordOut.set(fbRecordOut.getClonedField());
        cloneObj.firstTimeCallGroup = new FirstTimeCallGroup();
        cloneObj.firstTimeCallGroup.set(firstTimeCallGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Mc083ReadFileParm mc083ReadFileParm = Mc083Ctx.this.getMc083ReadFileParm();
     FbRecordOut fbRecordOut = Mc083Ctx.this.getFbRecordOut();
     FirstTimeCallGroup firstTimeCallGroup = Mc083Ctx.this.getFirstTimeCallGroup();
     Work work = Mc083Ctx.this.getWork();

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
	 *	Returns the value of mc083FileStatus
	 *	@return mc083FileStatus
	 */
   public char[] getMc083FileStatus() throws CFException  {              
   		return mc083ReadFileParm.getMc083FileStatus();
   }

  
	/**
	*  set variable mc083FileStatus
	*  @param value
	**/
   public void setMc083FileStatus(char[] value) throws CFException {
      mc083ReadFileParm.setMc083FileStatus(value);
   } 

     /**
	 * 	Update Mc083FileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMc083FileStatus(char[] source, int sourceIndex) throws CFException {
      mc083ReadFileParm.setMc083FileStatus(source, sourceIndex);
   	
   }
   
   public void setMc083FileStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mc083ReadFileParm.setMc083FileStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Mc083FileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMc083FileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mc083ReadFileParm.setMc083FileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Mc083FileStatus with another Field
	 *	@param value
	 */
   public void setMc083FileStatus(Field source) {
      mc083ReadFileParm.setMc083FileStatus(source);
   }  
   
     /**
	 * 	Update Mc083FileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMc083FileStatus(Field source, int sourceIndex,int sourceLen) {
      mc083ReadFileParm.setMc083FileStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Mc083FileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMc083FileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mc083ReadFileParm.setMc083FileStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mc083Data
	 *	@return mc083Data
	 */
   public char[] getMc083Data() throws CFException  {              
   		return mc083ReadFileParm.getMc083Data();
   }

  
	/**
	*  set variable mc083Data
	*  @param value
	**/
   public void setMc083Data(char[] value) throws CFException {
      mc083ReadFileParm.setMc083Data(value);
   } 

     /**
	 * 	Update Mc083Data 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMc083Data(char[] source, int sourceIndex) throws CFException {
      mc083ReadFileParm.setMc083Data(source, sourceIndex);
   	
   }
   
   public void setMc083Data(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mc083ReadFileParm.setMc083Data(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Mc083Data 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMc083Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mc083ReadFileParm.setMc083Data(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Mc083Data with another Field
	 *	@param value
	 */
   public void setMc083Data(Field source) {
      mc083ReadFileParm.setMc083Data(source);
   }  
   
     /**
	 * 	Update Mc083Data 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMc083Data(Field source, int sourceIndex,int sourceLen) {
      mc083ReadFileParm.setMc083Data(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Mc083Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMc083Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mc083ReadFileParm.setMc083Data(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fbRecordOut
	 *	@return fbRecordOut
	 */   
	 public FbRecordOut getFbRecordOut() {
   	return fbRecordOut;
   }


	/**
	 *	Returns the value of firstTimeCall
	 *	@return firstTimeCall
	 */
   public char[] getFirstTimeCall() throws CFException  {              
   		return firstTimeCallGroup.getFirstTimeCall();
   }

  
	/**
	*  set variable firstTimeCall
	*  @param value
	**/
   public void setFirstTimeCall(char[] value) throws CFException {
      firstTimeCallGroup.setFirstTimeCall(value);
   } 

     /**
	 * 	Update FirstTimeCall 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFirstTimeCall(char[] source, int sourceIndex) throws CFException {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex);
   	
   }
   
   public void setFirstTimeCall(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FirstTimeCall 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFirstTimeCall(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FirstTimeCall with another Field
	 *	@param value
	 */
   public void setFirstTimeCall(Field source) {
      firstTimeCallGroup.setFirstTimeCall(source);
   }  
   
     /**
	 * 	Update FirstTimeCall 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFirstTimeCall(Field source, int sourceIndex,int sourceLen) {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FirstTimeCall 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFirstTimeCall(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      firstTimeCallGroup.setFirstTimeCall(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Mc083Ctx getMc083Ctx() {
            return Mc083Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mc083ReadFileParm.hashCode();
        str += fbRecordOut.hashCode();
        str += firstTimeCallGroup.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.mc083ReadFileParm = new Mc083ReadFileParm();
        cloneObj.mc083ReadFileParm.set(mc083ReadFileParm.getClonedField());
        cloneObj.fbRecordOut = new FbRecordOut();
        cloneObj.fbRecordOut.set(fbRecordOut.getClonedField());
        cloneObj.firstTimeCallGroup = new FirstTimeCallGroup();
        cloneObj.firstTimeCallGroup.set(firstTimeCallGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
