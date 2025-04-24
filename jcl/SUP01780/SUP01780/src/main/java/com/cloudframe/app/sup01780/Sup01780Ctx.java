package com.cloudframe.app.sup01780;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sup01780.file.records.TmPanRecord10;
import com.cloudframe.app.sup01780.dto.Work;
import com.cloudframe.app.sup01780.dto.WorkAreas;
import com.cloudframe.app.sup01780.file.records.TmPanRecord1;


@Context
public class Sup01780Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    TmPanRecord1 tmPanRecord1;
    WorkAreas workAreas;
    TmPanRecord10 tmPanRecord10;
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


    public TmPanRecord1 getTmPanRecord1() {
        if (tmPanRecord1 == null) {
            tmPanRecord1 = new TmPanRecord1();
        }

        return tmPanRecord1;
    }

    public void setTmPanRecord1(TmPanRecord1 tmPanRecord1) {
        this.tmPanRecord1 = tmPanRecord1;
    }
    public WorkAreas getWorkAreas() {
        if (workAreas == null) {
            workAreas = new WorkAreas();
        }

        return workAreas;
    }

    public void setWorkAreas(WorkAreas workAreas) {
        this.workAreas = workAreas;
    }
    public TmPanRecord10 getTmPanRecord10() {
        if (tmPanRecord10 == null) {
            tmPanRecord10 = new TmPanRecord10();
        }

        return tmPanRecord10;
    }

    public void setTmPanRecord10(TmPanRecord10 tmPanRecord10) {
        this.tmPanRecord10 = tmPanRecord10;
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
        str += tmPanRecord1.hashCode();
        str += workAreas.hashCode();
        str += tmPanRecord10.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Sup01780Ctx clone() {
        Sup01780Ctx cloneObj = new Sup01780Ctx();
        cloneObj.tmPanRecord1 = new TmPanRecord1();
        cloneObj.tmPanRecord1.set(tmPanRecord1.getClonedField());
        cloneObj.workAreas = new WorkAreas();
        cloneObj.workAreas.set(workAreas.getClonedField());
        cloneObj.tmPanRecord10 = new TmPanRecord10();
        cloneObj.tmPanRecord10.set(tmPanRecord10.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     TmPanRecord1 tmPanRecord1 = Sup01780Ctx.this.getTmPanRecord1();
     WorkAreas workAreas = Sup01780Ctx.this.getWorkAreas();
     TmPanRecord10 tmPanRecord10 = Sup01780Ctx.this.getTmPanRecord10();

	/**
	 *	Returns the value of tmPanRecord1
	 *	@return tmPanRecord1
	 */   
	 public TmPanRecord1 getTmPanRecord1() {
   	return tmPanRecord1;
   }


	/**
	 *	Returns the value of tmPanRecord10
	 *	@return tmPanRecord10
	 */   
	 public TmPanRecord10 getTmPanRecord10() {
   	return tmPanRecord10;
   }


	/**
	 *	Returns the value of panKey10
	 *	@return panKey10
	 */
   public char[] getPanKey10() throws CFException  {              
   		return tmPanRecord10.getPanKey10();
   }

  
	/**
	*  set variable panKey10
	*  @param value
	**/
   public void setPanKey10(char[] value) throws CFException {
      tmPanRecord10.setPanKey10(value);
   } 

     /**
	 * 	Update PanKey10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanKey10(char[] source, int sourceIndex) throws CFException {
      tmPanRecord10.setPanKey10(source, sourceIndex);
   	
   }
   
   public void setPanKey10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tmPanRecord10.setPanKey10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PanKey10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanKey10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmPanRecord10.setPanKey10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PanKey10 with another Field
	 *	@param value
	 */
   public void setPanKey10(Field source) {
      tmPanRecord10.setPanKey10(source);
   }  
   
     /**
	 * 	Update PanKey10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanKey10(Field source, int sourceIndex,int sourceLen) {
      tmPanRecord10.setPanKey10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PanKey10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanKey10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tmPanRecord10.setPanKey10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sup01780Ctx getSup01780Ctx() {
            return Sup01780Ctx.this;
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
        str += tmPanRecord1.hashCode();
        str += workAreas.hashCode();
        str += tmPanRecord10.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.tmPanRecord1 = new TmPanRecord1();
        cloneObj.tmPanRecord1.set(tmPanRecord1.getClonedField());
        cloneObj.workAreas = new WorkAreas();
        cloneObj.workAreas.set(workAreas.getClonedField());
        cloneObj.tmPanRecord10 = new TmPanRecord10();
        cloneObj.tmPanRecord10.set(tmPanRecord10.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     TmPanRecord1 tmPanRecord1 = Sup01780Ctx.this.getTmPanRecord1();
     WorkAreas workAreas = Sup01780Ctx.this.getWorkAreas();
     TmPanRecord10 tmPanRecord10 = Sup01780Ctx.this.getTmPanRecord10();

	/**
	 *	Returns the value of panStatus1
	 *	@return panStatus1
	 */
   public char[] getPanStatus1() throws CFException  {              
   		return workAreas.getPanStatus1();
   }

  
	/**
	*  set variable panStatus1
	*  @param value
	**/
   public void setPanStatus1(char[] value) throws CFException {
      workAreas.setPanStatus1(value);
   } 

     /**
	 * 	Update PanStatus1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanStatus1(char[] source, int sourceIndex) throws CFException {
      workAreas.setPanStatus1(source, sourceIndex);
   	
   }
   
   public void setPanStatus1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workAreas.setPanStatus1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PanStatus1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workAreas.setPanStatus1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PanStatus1 with another Field
	 *	@param value
	 */
   public void setPanStatus1(Field source) {
      workAreas.setPanStatus1(source);
   }  
   
     /**
	 * 	Update PanStatus1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanStatus1(Field source, int sourceIndex,int sourceLen) {
      workAreas.setPanStatus1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PanStatus1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workAreas.setPanStatus1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of panStatus10
	 *	@return panStatus10
	 */
   public char[] getPanStatus10() throws CFException  {              
   		return workAreas.getPanStatus10();
   }

  
	/**
	*  set variable panStatus10
	*  @param value
	**/
   public void setPanStatus10(char[] value) throws CFException {
      workAreas.setPanStatus10(value);
   } 

     /**
	 * 	Update PanStatus10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanStatus10(char[] source, int sourceIndex) throws CFException {
      workAreas.setPanStatus10(source, sourceIndex);
   	
   }
   
   public void setPanStatus10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workAreas.setPanStatus10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PanStatus10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workAreas.setPanStatus10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PanStatus10 with another Field
	 *	@param value
	 */
   public void setPanStatus10(Field source) {
      workAreas.setPanStatus10(source);
   }  
   
     /**
	 * 	Update PanStatus10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanStatus10(Field source, int sourceIndex,int sourceLen) {
      workAreas.setPanStatus10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PanStatus10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanStatus10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workAreas.setPanStatus10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of workAreas
	 *	@return workAreas
	 */   
	 public WorkAreas getWorkAreas() {
   	return workAreas;
   }



        public Sup01780Ctx getSup01780Ctx() {
            return Sup01780Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tmPanRecord1.hashCode();
        str += workAreas.hashCode();
        str += tmPanRecord10.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.tmPanRecord1 = new TmPanRecord1();
        cloneObj.tmPanRecord1.set(tmPanRecord1.getClonedField());
        cloneObj.workAreas = new WorkAreas();
        cloneObj.workAreas.set(workAreas.getClonedField());
        cloneObj.tmPanRecord10 = new TmPanRecord10();
        cloneObj.tmPanRecord10.set(tmPanRecord10.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
