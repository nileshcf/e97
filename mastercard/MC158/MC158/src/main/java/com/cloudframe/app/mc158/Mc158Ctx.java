package com.cloudframe.app.mc158;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mc158.dto.Work;


@Context
public class Mc158Ctx implements ProgramContext, Cloneable {
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

    public Mc158Ctx clone() {
        Mc158Ctx cloneObj = new Mc158Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Mc158Ctx.this.getWork();

	/**
	 *	Returns the value of normalIpmMsg
	 *	@return normalIpmMsg
	 */
   public char[] getNormalIpmMsg() throws CFException  {              
   		return work.getNormalIpmMsg();
   }

  
	/**
	*  set variable normalIpmMsg
	*  @param value
	**/
   public void setNormalIpmMsg(char[] value) throws CFException {
      work.setNormalIpmMsg(value);
   } 

	/**
	 *	Returns the value of posL
	 *	@return posL
	 */
	public short getPosL() throws CFException {        
   		return work.getPosL();
	}
	
	/**
	 * 	Update PosL with the passed value
	 *	@param number
	 */
	public void setPosL(short number)  throws CFException{
		work.setPosL(number);
	}

	public void setPosL(int number)  throws CFException{
		work.setPosL((short)number);
	}

	public void setPosL(long number)  throws CFException{
		work.setPosL((short)number);
	}



	/**
	 *	Returns the value of val1
	 *	@return val1
	 */
   public char[] getVal1() throws CFException  {              
   		return work.getVal1();
   }

  
	/**
	*  set variable val1
	*  @param value
	**/
   public void setVal1(char[] value) throws CFException {
      work.setVal1(value);
   } 

	/**
	 *	Returns the value of posS
	 *	@return posS
	 */
	public short getPosS() throws CFException {        
   		return work.getPosS();
	}
	
	/**
	 * 	Update PosS with the passed value
	 *	@param number
	 */
	public void setPosS(short number)  throws CFException{
		work.setPosS(number);
	}

	public void setPosS(int number)  throws CFException{
		work.setPosS((short)number);
	}

	public void setPosS(long number)  throws CFException{
		work.setPosS((short)number);
	}




        public Mc158Ctx getMc158Ctx() {
            return Mc158Ctx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
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

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Mc158Ctx.this.getWork();

	/**
	 *	Returns the value of posL
	 *	@return posL
	 */
	public short getPosL() throws CFException {        
   		return work.getPosL();
	}
	
	/**
	 * 	Update PosL with the passed value
	 *	@param number
	 */
	public void setPosL(short number)  throws CFException{
		work.setPosL(number);
	}

	public void setPosL(int number)  throws CFException{
		work.setPosL((short)number);
	}

	public void setPosL(long number)  throws CFException{
		work.setPosL((short)number);
	}



	/**
	 *	Returns the value of posS
	 *	@return posS
	 */
	public short getPosS() throws CFException {        
   		return work.getPosS();
	}
	
	/**
	 * 	Update PosS with the passed value
	 *	@param number
	 */
	public void setPosS(short number)  throws CFException{
		work.setPosS(number);
	}

	public void setPosS(int number)  throws CFException{
		work.setPosS((short)number);
	}

	public void setPosS(long number)  throws CFException{
		work.setPosS((short)number);
	}




        public Mc158Ctx getMc158Ctx() {
            return Mc158Ctx.this;
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

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
