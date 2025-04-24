package com.cloudframe.app.caller2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.caller2.dto.Parm;
import com.cloudframe.app.global.sharedvar.ExExternal;
import com.cloudframe.app.caller2.dto.Work;


@Context
public class Caller2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    ExExternal exExternal;
    Parm parm;
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


    public ExExternal getExExternal() {
        if (exExternal == null) {
            exExternal = globalCtx.getGlobalDto(ExExternal.class);
        }

        return exExternal;
    }

    public Parm getParm() {
        if (parm == null) {
            parm = new Parm();
        }

        return parm;
    }

    public void setParm(Parm parm) {
        this.parm = parm;
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
        str += exExternal.hashCode();
        str += parm.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Caller2Ctx clone() {
        Caller2Ctx cloneObj = new Caller2Ctx();
        cloneObj.exExternal = new ExExternal();
        cloneObj.exExternal.set(exExternal.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     ExExternal exExternal = Caller2Ctx.this.getExExternal();
     Parm parm = Caller2Ctx.this.getParm();
     Work work = Caller2Ctx.this.getWork();

	/**
	 *	Returns the value of prog1
	 *	@return prog1
	 */
   public char[] getProg1() throws CFException  {              
   		return work.getProg1();
   }

  
	/**
	*  set variable prog1
	*  @param value
	**/
   public void setProg1(char[] value) throws CFException {
      work.setProg1(value);
   } 

	/**
	 *	Returns the value of parm
	 *	@return parm
	 */   
	 public Parm getParm() {
   	return parm;
   }



        public Caller2Ctx getCaller2Ctx() {
            return Caller2Ctx.this;
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
        str += exExternal.hashCode();
        str += parm.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.exExternal = new ExExternal();
        cloneObj.exExternal.set(exExternal.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     ExExternal exExternal = Caller2Ctx.this.getExExternal();
     Parm parm = Caller2Ctx.this.getParm();
     Work work = Caller2Ctx.this.getWork();

	/**
	 *	Returns the value of exProgramName
	 *	@return exProgramName
	 */
   public char[] getExProgramName() throws CFException  {              
   		return exExternal.getExProgramName();
   }

  
	/**
	*  set variable exProgramName
	*  @param value
	**/
   public void setExProgramName(char[] value) throws CFException {
      exExternal.setExProgramName(value);
   } 

     /**
	 * 	Update ExProgramName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExProgramName(char[] source, int sourceIndex) throws CFException {
      exExternal.setExProgramName(source, sourceIndex);
   	
   }
   
   public void setExProgramName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      exExternal.setExProgramName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExProgramName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExProgramName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exExternal.setExProgramName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExProgramName with another Field
	 *	@param value
	 */
   public void setExProgramName(Field source) {
      exExternal.setExProgramName(source);
   }  
   
     /**
	 * 	Update ExProgramName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExProgramName(Field source, int sourceIndex,int sourceLen) {
      exExternal.setExProgramName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExProgramName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExProgramName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      exExternal.setExProgramName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of parm
	 *	@return parm
	 */   
	 public Parm getParm() {
   	return parm;
   }


	/**
	 *	Returns the value of prog
	 *	@return prog
	 */
   public char[] getProg() throws CFException  {              
   		return work.getProg();
   }

  
	/**
	*  set variable prog
	*  @param value
	**/
   public void setProg(char[] value) throws CFException {
      work.setProg(value);
   } 


        public Caller2Ctx getCaller2Ctx() {
            return Caller2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += exExternal.hashCode();
        str += parm.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.exExternal = new ExExternal();
        cloneObj.exExternal.set(exExternal.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
