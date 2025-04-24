package com.cloudframe.app.proga1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.proga1.dto.Jobname800;
import com.cloudframe.app.proga1.dto.Work;


@Context
public class Proga1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Jobname800 jobname800;


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
    public Jobname800 getJobname800() {
        if (jobname800 == null) {
            jobname800 = new Jobname800();
        }

        return jobname800;
    }

    public void setJobname800(Jobname800 jobname800) {
        this.jobname800 = jobname800;
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
        str += jobname800.hashCode();
       return str.hashCode();
    }

    public Proga1Ctx clone() {
        Proga1Ctx cloneObj = new Proga1Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.jobname800 = new Jobname800();
        cloneObj.jobname800.set(jobname800.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ExecuteInCtx implements Cloneable {
     Jobname800 jobname800 = Proga1Ctx.this.getJobname800();

	/**
	 *	Returns the value of jobname800
	 *	@return jobname800
	 */   
	 public Jobname800 getJobname800() {
   	return jobname800;
   }



        public Proga1Ctx getProga1Ctx() {
            return Proga1Ctx.this;
        }

        public ExecuteOutCtx getExecuteOutCtx() {
            return new ExecuteOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += jobname800.hashCode();
       return str.hashCode();
    }

    public ExecuteInCtx clone() {
        ExecuteInCtx cloneObj = new ExecuteInCtx();
        cloneObj.jobname800 = new Jobname800();
        cloneObj.jobname800.set(jobname800.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteInCtx getExecuteInCtx() {
            return new ExecuteInCtx();
    }
     public class ExecuteOutCtx implements Cloneable {
     Jobname800 jobname800 = Proga1Ctx.this.getJobname800();

	/**
	 *	Returns the value of pgmModule800
	 *	@return pgmModule800
	 */
   public char[] getPgmModule800() throws CFException  {              
   		return jobname800.getPgmModule800();
   }

  
	/**
	*  set variable pgmModule800
	*  @param value
	**/
   public void setPgmModule800(char[] value) throws CFException {
      jobname800.setPgmModule800(value);
   } 

     /**
	 * 	Update PgmModule800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmModule800(char[] source, int sourceIndex) throws CFException {
      jobname800.setPgmModule800(source, sourceIndex);
   	
   }
   
   public void setPgmModule800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      jobname800.setPgmModule800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmModule800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmModule800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      jobname800.setPgmModule800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmModule800 with another Field
	 *	@param value
	 */
   public void setPgmModule800(Field source) {
      jobname800.setPgmModule800(source);
   }  
   
     /**
	 * 	Update PgmModule800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmModule800(Field source, int sourceIndex,int sourceLen) {
      jobname800.setPgmModule800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmModule800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmModule800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      jobname800.setPgmModule800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of jobname800
	 *	@return jobname800
	 */   
	 public Jobname800 getJobname800() {
   	return jobname800;
   }


	/**
	 *	Returns the value of jobGroup800
	 *	@return jobGroup800
	 */
   public char[] getJobGroup800() throws CFException  {              
   		return jobname800.getJobGroup800();
   }

  
	/**
	*  set variable jobGroup800
	*  @param value
	**/
   public void setJobGroup800(char[] value) throws CFException {
      jobname800.setJobGroup800(value);
   } 

     /**
	 * 	Update JobGroup800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setJobGroup800(char[] source, int sourceIndex) throws CFException {
      jobname800.setJobGroup800(source, sourceIndex);
   	
   }
   
   public void setJobGroup800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      jobname800.setJobGroup800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update JobGroup800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setJobGroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      jobname800.setJobGroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update JobGroup800 with another Field
	 *	@param value
	 */
   public void setJobGroup800(Field source) {
      jobname800.setJobGroup800(source);
   }  
   
     /**
	 * 	Update JobGroup800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setJobGroup800(Field source, int sourceIndex,int sourceLen) {
      jobname800.setJobGroup800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update JobGroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setJobGroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      jobname800.setJobGroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Proga1Ctx getProga1Ctx() {
            return Proga1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += jobname800.hashCode();
       return str.hashCode();
    }

    public ExecuteOutCtx clone() {
        ExecuteOutCtx cloneObj = new ExecuteOutCtx();
        cloneObj.jobname800 = new Jobname800();
        cloneObj.jobname800.set(jobname800.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteOutCtx getExecuteOutCtx() {
            return new ExecuteOutCtx();
    }
}
