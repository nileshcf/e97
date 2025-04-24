package com.cloudframe.app.evaluat0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.evaluat0.dto.Work;


@Context
public class Evaluat0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

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
        str += work.hashCode();
       return str.hashCode();
    }

    public Evaluat0Ctx clone() {
        Evaluat0Ctx cloneObj = new Evaluat0Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainRoutineInCtx implements Cloneable {
     Work work = Evaluat0Ctx.this.getWork();

	/**
	 *	Returns the value of exchangeCd
	 *	@return exchangeCd
	 */
   public char[] getExchangeCd() throws CFException  {              
   		return work.getExchangeCd();
   }

  
	/**
	*  set variable exchangeCd
	*  @param value
	**/
   public void setExchangeCd(char[] value) throws CFException {
      work.setExchangeCd(value);
   } 


        public Evaluat0Ctx getEvaluat0Ctx() {
            return Evaluat0Ctx.this;
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
       return str.hashCode();
    }

    public MainRoutineInCtx clone() {
        MainRoutineInCtx cloneObj = new MainRoutineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainRoutineInCtx getMainRoutineInCtx() {
            return new MainRoutineInCtx();
    }
     public class MainRoutineOutCtx implements Cloneable {
     Work work = Evaluat0Ctx.this.getWork();

	/**
	 *	Returns the value of num1
	 *	@return num1
	 */
	public short getNum1() throws CFException {        
   		return work.getNum1();
	}
	
	/**
	 * 	Update Num1 with the passed value
	 *	@param number
	 */
	public void setNum1(short number)  throws CFException{
		work.setNum1(number);
	}

	public void setNum1(int number)  throws CFException{
		work.setNum1((short)number);
	}

	public void setNum1(long number)  throws CFException{
		work.setNum1((short)number);
	}



	/**
	 *	Returns the value of rgstrCd
	 *	@return rgstrCd
	 */
   public char[] getRgstrCd() throws CFException  {              
   		return work.getRgstrCd();
   }

  
	/**
	*  set variable rgstrCd
	*  @param value
	**/
   public void setRgstrCd(char[] value) throws CFException {
      work.setRgstrCd(value);
   } 

	/**
	 *	Returns the value of num2
	 *	@return num2
	 */
	public short getNum2() throws CFException {        
   		return work.getNum2();
	}
	
	/**
	 * 	Update Num2 with the passed value
	 *	@param number
	 */
	public void setNum2(short number)  throws CFException{
		work.setNum2(number);
	}

	public void setNum2(int number)  throws CFException{
		work.setNum2((short)number);
	}

	public void setNum2(long number)  throws CFException{
		work.setNum2((short)number);
	}



	/**
	 *	Returns the value of age
	 *	@return age
	 */
	public short getAge() throws CFException {        
   		return work.getAge();
	}
	
	/**
	 * 	Update Age with the passed value
	 *	@param number
	 */
	public void setAge(short number)  throws CFException{
		work.setAge(number);
	}

	public void setAge(int number)  throws CFException{
		work.setAge((short)number);
	}

	public void setAge(long number)  throws CFException{
		work.setAge((short)number);
	}



	/**
	 *	Returns the value of gender
	 *	@return gender
	 */
   public char[] getGender() throws CFException  {              
   		return work.getGender();
   }

  
	/**
	*  set variable gender
	*  @param value
	**/
   public void setGender(char[] value) throws CFException {
      work.setGender(value);
   } 

	/**
	 *	Returns the value of crossReferenceCd
	 *	@return crossReferenceCd
	 */
   public char[] getCrossReferenceCd() throws CFException  {              
   		return work.getCrossReferenceCd();
   }

  
	/**
	*  set variable crossReferenceCd
	*  @param value
	**/
   public void setCrossReferenceCd(char[] value) throws CFException {
      work.setCrossReferenceCd(value);
   } 

	/**
	 *	Returns the value of exchangeCd
	 *	@return exchangeCd
	 */
   public char[] getExchangeCd() throws CFException  {              
   		return work.getExchangeCd();
   }

  
	/**
	*  set variable exchangeCd
	*  @param value
	**/
   public void setExchangeCd(char[] value) throws CFException {
      work.setExchangeCd(value);
   } 

	/**
	 *	Returns the value of msdExchangeCode
	 *	@return msdExchangeCode
	 */
   public char[] getMsdExchangeCode() throws CFException  {              
   		return work.getMsdExchangeCode();
   }

  
	/**
	*  set variable msdExchangeCode
	*  @param value
	**/
   public void setMsdExchangeCode(char[] value) throws CFException {
      work.setMsdExchangeCode(value);
   } 


        public Evaluat0Ctx getEvaluat0Ctx() {
            return Evaluat0Ctx.this;
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

    public MainRoutineOutCtx clone() {
        MainRoutineOutCtx cloneObj = new MainRoutineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainRoutineOutCtx getMainRoutineOutCtx() {
            return new MainRoutineOutCtx();
    }
     public class CheckNumsInCtx implements Cloneable {
     Work work = Evaluat0Ctx.this.getWork();

	/**
	 *	Returns the value of num1
	 *	@return num1
	 */
	public short getNum1() throws CFException {        
   		return work.getNum1();
	}
	
	/**
	 * 	Update Num1 with the passed value
	 *	@param number
	 */
	public void setNum1(short number)  throws CFException{
		work.setNum1(number);
	}

	public void setNum1(int number)  throws CFException{
		work.setNum1((short)number);
	}

	public void setNum1(long number)  throws CFException{
		work.setNum1((short)number);
	}



	/**
	 *	Returns the value of num2
	 *	@return num2
	 */
	public short getNum2() throws CFException {        
   		return work.getNum2();
	}
	
	/**
	 * 	Update Num2 with the passed value
	 *	@param number
	 */
	public void setNum2(short number)  throws CFException{
		work.setNum2(number);
	}

	public void setNum2(int number)  throws CFException{
		work.setNum2((short)number);
	}

	public void setNum2(long number)  throws CFException{
		work.setNum2((short)number);
	}




        public Evaluat0Ctx getEvaluat0Ctx() {
            return Evaluat0Ctx.this;
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

    public CheckNumsInCtx clone() {
        CheckNumsInCtx cloneObj = new CheckNumsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckNumsInCtx getCheckNumsInCtx() {
            return new CheckNumsInCtx();
    }
     public class EvaluateInCtx implements Cloneable {
     Work work = Evaluat0Ctx.this.getWork();

	/**
	 *	Returns the value of age
	 *	@return age
	 */
	public short getAge() throws CFException {        
   		return work.getAge();
	}
	
	/**
	 * 	Update Age with the passed value
	 *	@param number
	 */
	public void setAge(short number)  throws CFException{
		work.setAge(number);
	}

	public void setAge(int number)  throws CFException{
		work.setAge((short)number);
	}

	public void setAge(long number)  throws CFException{
		work.setAge((short)number);
	}



	/**
	 *	Returns the value of gender
	 *	@return gender
	 */
   public char[] getGender() throws CFException  {              
   		return work.getGender();
   }

  
	/**
	*  set variable gender
	*  @param value
	**/
   public void setGender(char[] value) throws CFException {
      work.setGender(value);
   } 

	/**
	 *	Returns the value of income
	 *	@return income
	 */
	public int getIncome() throws CFException {        
   		return work.getIncome();
	}
	
	/**
	 * 	Update Income with the passed value
	 *	@param number
	 */
	public void setIncome(int number)  throws CFException{
		work.setIncome(number);
	}


	public void setIncome(long number)  throws CFException{
		work.setIncome((int)number);
	}



        public Evaluat0Ctx getEvaluat0Ctx() {
            return Evaluat0Ctx.this;
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

    public EvaluateInCtx clone() {
        EvaluateInCtx cloneObj = new EvaluateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EvaluateInCtx getEvaluateInCtx() {
            return new EvaluateInCtx();
    }
}
