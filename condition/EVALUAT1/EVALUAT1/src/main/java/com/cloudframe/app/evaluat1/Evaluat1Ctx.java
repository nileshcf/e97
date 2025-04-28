package com.cloudframe.app.evaluat1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.evaluat1.dto.MonthsGrp;
import com.cloudframe.app.evaluat1.dto.Work;


@Context
public class Evaluat1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    MonthsGrp monthsGrp;


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
    public MonthsGrp getMonthsGrp() {
        if (monthsGrp == null) {
            monthsGrp = new MonthsGrp();
        }

        return monthsGrp;
    }

    public void setMonthsGrp(MonthsGrp monthsGrp) {
        this.monthsGrp = monthsGrp;
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
        str += monthsGrp.hashCode();
       return str.hashCode();
    }

    public Evaluat1Ctx clone() {
        Evaluat1Ctx cloneObj = new Evaluat1Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.monthsGrp = new MonthsGrp();
        cloneObj.monthsGrp.set(monthsGrp.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainRoutineInCtx implements Cloneable {
     Work work = Evaluat1Ctx.this.getWork();
     MonthsGrp monthsGrp = Evaluat1Ctx.this.getMonthsGrp();

	/**
	 *	Returns the value of monthsR
	 *	@return monthsR
	 */
   public char[] getMonthsR(int index) throws CFException  {              
   		return monthsGrp.getMonthsR(index);
   }

  
	/**
	*  set variable monthsR
	*  @param value
	**/
   public void setMonthsR(int index,char[] value) throws CFException {
      monthsGrp.setMonthsR((index),value);
   } 

	/**
	 *	Returns the value of mmNota
	 *	@return mmNota
	 */
   public char[] getMmNota() throws CFException  {              
   		return work.getMmNota();
   }

  
	/**
	*  set variable mmNota
	*  @param value
	**/
   public void setMmNota(char[] value) throws CFException {
      work.setMmNota(value);
   } 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
	}




        public Evaluat1Ctx getEvaluat1Ctx() {
            return Evaluat1Ctx.this;
        }

        public MainRoutineOutCtx getMainRoutineOutCtx() {
            return new MainRoutineOutCtx();
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
        str += monthsGrp.hashCode();
       return str.hashCode();
    }

    public MainRoutineInCtx clone() {
        MainRoutineInCtx cloneObj = new MainRoutineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.monthsGrp = new MonthsGrp();
        cloneObj.monthsGrp.set(monthsGrp.getClonedField());
        return cloneObj;
    }

    }

    public MainRoutineInCtx getMainRoutineInCtx() {
            return new MainRoutineInCtx();
    }
     public class MainRoutineOutCtx implements Cloneable {
     Work work = Evaluat1Ctx.this.getWork();
     MonthsGrp monthsGrp = Evaluat1Ctx.this.getMonthsGrp();

	/**
	 *	Returns the value of monthsR
	 *	@return monthsR
	 */
   public char[] getMonthsR(int index) throws CFException  {              
   		return monthsGrp.getMonthsR(index);
   }

  
	/**
	*  set variable monthsR
	*  @param value
	**/
   public void setMonthsR(int index,char[] value) throws CFException {
      monthsGrp.setMonthsR((index),value);
   } 

	/**
	 *	Returns the value of mmDb
	 *	@return mmDb
	 */
   public char[] getMmDb() throws CFException  {              
   		return work.getMmDb();
   }

  
	/**
	*  set variable mmDb
	*  @param value
	**/
   public void setMmDb(char[] value) throws CFException {
      work.setMmDb(value);
   } 

	/**
	 *	Returns the value of mmNota
	 *	@return mmNota
	 */
   public char[] getMmNota() throws CFException  {              
   		return work.getMmNota();
   }

  
	/**
	*  set variable mmNota
	*  @param value
	**/
   public void setMmNota(char[] value) throws CFException {
      work.setMmNota(value);
   } 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
	}




        public Evaluat1Ctx getEvaluat1Ctx() {
            return Evaluat1Ctx.this;
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
        str += monthsGrp.hashCode();
       return str.hashCode();
    }

    public MainRoutineOutCtx clone() {
        MainRoutineOutCtx cloneObj = new MainRoutineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.monthsGrp = new MonthsGrp();
        cloneObj.monthsGrp.set(monthsGrp.getClonedField());
        return cloneObj;
    }

    }

    public MainRoutineOutCtx getMainRoutineOutCtx() {
            return new MainRoutineOutCtx();
    }
}
