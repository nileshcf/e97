package com.cloudframe.app.asaprnt2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.asaprnt2.dto.Work;
import com.cloudframe.app.asaprnt2.file.records.Reprec01;


@Context
public class Asaprnt2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Reprec01 reprec01;
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


    public Reprec01 getReprec01() {
        if (reprec01 == null) {
            reprec01 = new Reprec01();
        }

        return reprec01;
    }

    public void setReprec01(Reprec01 reprec01) {
        this.reprec01 = reprec01;
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
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Asaprnt2Ctx clone() {
        Asaprnt2Ctx cloneObj = new Asaprnt2Ctx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }



        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
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
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */
   public char[] getReprec() throws CFException  {              
   		return work.getReprec();
   }

  
	/**
	*  set variable reprec
	*  @param value
	**/
   public void setReprec(char[] value) throws CFException {
      work.setReprec(value);
   } 


        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class Process1Split3InCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }



        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
        }

        public Process1Split3OutCtx getProcess1Split3OutCtx() {
            return new Process1Split3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process1Split3InCtx clone() {
        Process1Split3InCtx cloneObj = new Process1Split3InCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split3InCtx getProcess1Split3InCtx() {
            return new Process1Split3InCtx();
    }
     public class Process1Split3OutCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */
   public char[] getReprec() throws CFException  {              
   		return work.getReprec();
   }

  
	/**
	*  set variable reprec
	*  @param value
	**/
   public void setReprec(char[] value) throws CFException {
      work.setReprec(value);
   } 


        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process1Split3OutCtx clone() {
        Process1Split3OutCtx cloneObj = new Process1Split3OutCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split3OutCtx getProcess1Split3OutCtx() {
            return new Process1Split3OutCtx();
    }
     public class Process2Split5InCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }



        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
        }

        public Process2Split5OutCtx getProcess2Split5OutCtx() {
            return new Process2Split5OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process2Split5InCtx clone() {
        Process2Split5InCtx cloneObj = new Process2Split5InCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split5InCtx getProcess2Split5InCtx() {
            return new Process2Split5InCtx();
    }
     public class Process2Split5OutCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }


	/**
	 *	Returns the value of lineSpace
	 *	@return lineSpace
	 */
	public short getLineSpace() throws CFException {        
   		return work.getLineSpace();
	}
	
	/**
	 * 	Update LineSpace with the passed value
	 *	@param number
	 */
	public void setLineSpace(short number)  throws CFException{
		work.setLineSpace(number);
	}

	public void setLineSpace(int number)  throws CFException{
		work.setLineSpace((short)number);
	}

	public void setLineSpace(long number)  throws CFException{
		work.setLineSpace((short)number);
	}



	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */
   public char[] getReprec() throws CFException  {              
   		return work.getReprec();
   }

  
	/**
	*  set variable reprec
	*  @param value
	**/
   public void setReprec(char[] value) throws CFException {
      work.setReprec(value);
   } 


        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process2Split5OutCtx clone() {
        Process2Split5OutCtx cloneObj = new Process2Split5OutCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split5OutCtx getProcess2Split5OutCtx() {
            return new Process2Split5OutCtx();
    }
     public class Process3InCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }



        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
        }

        public Process3OutCtx getProcess3OutCtx() {
            return new Process3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process3InCtx clone() {
        Process3InCtx cloneObj = new Process3InCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3InCtx getProcess3InCtx() {
            return new Process3InCtx();
    }
     public class Process3OutCtx implements Cloneable {
     Reprec01 reprec01 = Asaprnt2Ctx.this.getReprec01();
     Work work = Asaprnt2Ctx.this.getWork();

	/**
	 *	Returns the value of reprec01
	 *	@return reprec01
	 */   
	 public Reprec01 getReprec01() {
   	return reprec01;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */
   public char[] getReprec() throws CFException  {              
   		return work.getReprec();
   }

  
	/**
	*  set variable reprec
	*  @param value
	**/
   public void setReprec(char[] value) throws CFException {
      work.setReprec(value);
   } 


        public Asaprnt2Ctx getAsaprnt2Ctx() {
            return Asaprnt2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec01.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process3OutCtx clone() {
        Process3OutCtx cloneObj = new Process3OutCtx();
        cloneObj.reprec01 = new Reprec01();
        cloneObj.reprec01.set(reprec01.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3OutCtx getProcess3OutCtx() {
            return new Process3OutCtx();
    }
}
