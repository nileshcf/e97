package com.cloudframe.app.s918test;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.s918test.dto.Src160Grp;
import com.cloudframe.app.s918test.dto.Work;
import com.cloudframe.app.s918test.dto.Src162Grp;
import com.cloudframe.app.s918test.dto.Tgt177Grp;
import com.cloudframe.app.s918test.dto.Tgt178Grp;
import com.cloudframe.app.s918test.dto.Src178Grp;
import com.cloudframe.app.s918test.dto.Src212Grp;
import com.cloudframe.app.s918test.dto.Tgt162Grp;
import com.cloudframe.app.s918test.dto.Src166Grp;
import com.cloudframe.app.s918test.dto.Src164Grp;
import com.cloudframe.app.s918test.dto.Tgt161Grp;
import com.cloudframe.app.s918test.dto.Tgt211Grp;
import com.cloudframe.app.s918test.dto.Tgt212Grp;
import com.cloudframe.app.s918test.dto.Tgt170Grp;
import com.cloudframe.app.s918test.dto.Src170Grp;
import com.cloudframe.app.s918test.dto.Tgt165Grp;
import com.cloudframe.app.s918test.dto.Src168Grp;
import com.cloudframe.app.s918test.dto.Src210Grp;
import com.cloudframe.app.s918test.dto.Src176Grp;
import com.cloudframe.app.s918test.dto.Tgt169Grp;
import com.cloudframe.app.s918test.dto.Tgt166Grp;
import com.cloudframe.app.s918test.dto.Tgt173Grp;
import com.cloudframe.app.s918test.dto.Tgt174Grp;


@Context
public class S918testCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Tgt165Grp tgt165Grp;
    Src212Grp src212Grp;
    Src176Grp src176Grp;
    Src162Grp src162Grp;
    Tgt169Grp tgt169Grp;
    Src164Grp src164Grp;
    Work work;
    Src168Grp src168Grp;
    Src170Grp src170Grp;
    Src166Grp src166Grp;
    Tgt166Grp tgt166Grp;
    Src160Grp src160Grp;
    Src178Grp src178Grp;
    Src210Grp src210Grp;
    Tgt174Grp tgt174Grp;
    Tgt162Grp tgt162Grp;
    Tgt173Grp tgt173Grp;
    Tgt211Grp tgt211Grp;
    Tgt212Grp tgt212Grp;
    Tgt170Grp tgt170Grp;
    Tgt178Grp tgt178Grp;
    Tgt161Grp tgt161Grp;
    Tgt177Grp tgt177Grp;


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


    public Tgt165Grp getTgt165Grp() {
        if (tgt165Grp == null) {
            tgt165Grp = new Tgt165Grp();
        }

        return tgt165Grp;
    }

    public void setTgt165Grp(Tgt165Grp tgt165Grp) {
        this.tgt165Grp = tgt165Grp;
    }
    public Src212Grp getSrc212Grp() {
        if (src212Grp == null) {
            src212Grp = new Src212Grp();
        }

        return src212Grp;
    }

    public void setSrc212Grp(Src212Grp src212Grp) {
        this.src212Grp = src212Grp;
    }
    public Src176Grp getSrc176Grp() {
        if (src176Grp == null) {
            src176Grp = new Src176Grp();
        }

        return src176Grp;
    }

    public void setSrc176Grp(Src176Grp src176Grp) {
        this.src176Grp = src176Grp;
    }
    public Src162Grp getSrc162Grp() {
        if (src162Grp == null) {
            src162Grp = new Src162Grp();
        }

        return src162Grp;
    }

    public void setSrc162Grp(Src162Grp src162Grp) {
        this.src162Grp = src162Grp;
    }
    public Tgt169Grp getTgt169Grp() {
        if (tgt169Grp == null) {
            tgt169Grp = new Tgt169Grp();
        }

        return tgt169Grp;
    }

    public void setTgt169Grp(Tgt169Grp tgt169Grp) {
        this.tgt169Grp = tgt169Grp;
    }
    public Src164Grp getSrc164Grp() {
        if (src164Grp == null) {
            src164Grp = new Src164Grp();
        }

        return src164Grp;
    }

    public void setSrc164Grp(Src164Grp src164Grp) {
        this.src164Grp = src164Grp;
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
    public Src168Grp getSrc168Grp() {
        if (src168Grp == null) {
            src168Grp = new Src168Grp();
        }

        return src168Grp;
    }

    public void setSrc168Grp(Src168Grp src168Grp) {
        this.src168Grp = src168Grp;
    }
    public Src170Grp getSrc170Grp() {
        if (src170Grp == null) {
            src170Grp = new Src170Grp();
        }

        return src170Grp;
    }

    public void setSrc170Grp(Src170Grp src170Grp) {
        this.src170Grp = src170Grp;
    }
    public Src166Grp getSrc166Grp() {
        if (src166Grp == null) {
            src166Grp = new Src166Grp();
        }

        return src166Grp;
    }

    public void setSrc166Grp(Src166Grp src166Grp) {
        this.src166Grp = src166Grp;
    }
    public Tgt166Grp getTgt166Grp() {
        if (tgt166Grp == null) {
            tgt166Grp = new Tgt166Grp();
        }

        return tgt166Grp;
    }

    public void setTgt166Grp(Tgt166Grp tgt166Grp) {
        this.tgt166Grp = tgt166Grp;
    }
    public Src160Grp getSrc160Grp() {
        if (src160Grp == null) {
            src160Grp = new Src160Grp();
        }

        return src160Grp;
    }

    public void setSrc160Grp(Src160Grp src160Grp) {
        this.src160Grp = src160Grp;
    }
    public Src178Grp getSrc178Grp() {
        if (src178Grp == null) {
            src178Grp = new Src178Grp();
        }

        return src178Grp;
    }

    public void setSrc178Grp(Src178Grp src178Grp) {
        this.src178Grp = src178Grp;
    }
    public Src210Grp getSrc210Grp() {
        if (src210Grp == null) {
            src210Grp = new Src210Grp();
        }

        return src210Grp;
    }

    public void setSrc210Grp(Src210Grp src210Grp) {
        this.src210Grp = src210Grp;
    }
    public Tgt174Grp getTgt174Grp() {
        if (tgt174Grp == null) {
            tgt174Grp = new Tgt174Grp();
        }

        return tgt174Grp;
    }

    public void setTgt174Grp(Tgt174Grp tgt174Grp) {
        this.tgt174Grp = tgt174Grp;
    }
    public Tgt162Grp getTgt162Grp() {
        if (tgt162Grp == null) {
            tgt162Grp = new Tgt162Grp();
        }

        return tgt162Grp;
    }

    public void setTgt162Grp(Tgt162Grp tgt162Grp) {
        this.tgt162Grp = tgt162Grp;
    }
    public Tgt173Grp getTgt173Grp() {
        if (tgt173Grp == null) {
            tgt173Grp = new Tgt173Grp();
        }

        return tgt173Grp;
    }

    public void setTgt173Grp(Tgt173Grp tgt173Grp) {
        this.tgt173Grp = tgt173Grp;
    }
    public Tgt211Grp getTgt211Grp() {
        if (tgt211Grp == null) {
            tgt211Grp = new Tgt211Grp();
        }

        return tgt211Grp;
    }

    public void setTgt211Grp(Tgt211Grp tgt211Grp) {
        this.tgt211Grp = tgt211Grp;
    }
    public Tgt212Grp getTgt212Grp() {
        if (tgt212Grp == null) {
            tgt212Grp = new Tgt212Grp();
        }

        return tgt212Grp;
    }

    public void setTgt212Grp(Tgt212Grp tgt212Grp) {
        this.tgt212Grp = tgt212Grp;
    }
    public Tgt170Grp getTgt170Grp() {
        if (tgt170Grp == null) {
            tgt170Grp = new Tgt170Grp();
        }

        return tgt170Grp;
    }

    public void setTgt170Grp(Tgt170Grp tgt170Grp) {
        this.tgt170Grp = tgt170Grp;
    }
    public Tgt178Grp getTgt178Grp() {
        if (tgt178Grp == null) {
            tgt178Grp = new Tgt178Grp();
        }

        return tgt178Grp;
    }

    public void setTgt178Grp(Tgt178Grp tgt178Grp) {
        this.tgt178Grp = tgt178Grp;
    }
    public Tgt161Grp getTgt161Grp() {
        if (tgt161Grp == null) {
            tgt161Grp = new Tgt161Grp();
        }

        return tgt161Grp;
    }

    public void setTgt161Grp(Tgt161Grp tgt161Grp) {
        this.tgt161Grp = tgt161Grp;
    }
    public Tgt177Grp getTgt177Grp() {
        if (tgt177Grp == null) {
            tgt177Grp = new Tgt177Grp();
        }

        return tgt177Grp;
    }

    public void setTgt177Grp(Tgt177Grp tgt177Grp) {
        this.tgt177Grp = tgt177Grp;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt165Grp.hashCode();
        str += src212Grp.hashCode();
        str += src176Grp.hashCode();
        str += src162Grp.hashCode();
        str += tgt169Grp.hashCode();
        str += src164Grp.hashCode();
        str += work.hashCode();
        str += src168Grp.hashCode();
        str += src170Grp.hashCode();
        str += src166Grp.hashCode();
        str += tgt166Grp.hashCode();
        str += src160Grp.hashCode();
        str += src178Grp.hashCode();
        str += src210Grp.hashCode();
        str += tgt174Grp.hashCode();
        str += tgt162Grp.hashCode();
        str += tgt173Grp.hashCode();
        str += tgt211Grp.hashCode();
        str += tgt212Grp.hashCode();
        str += tgt170Grp.hashCode();
        str += tgt178Grp.hashCode();
        str += tgt161Grp.hashCode();
        str += tgt177Grp.hashCode();
       return str.hashCode();
    }

    public S918testCtx clone() {
        S918testCtx cloneObj = new S918testCtx();
        cloneObj.tgt165Grp = new Tgt165Grp();
        cloneObj.tgt165Grp.set(tgt165Grp.getClonedField());
        cloneObj.src212Grp = new Src212Grp();
        cloneObj.src212Grp.set(src212Grp.getClonedField());
        cloneObj.src176Grp = new Src176Grp();
        cloneObj.src176Grp.set(src176Grp.getClonedField());
        cloneObj.src162Grp = new Src162Grp();
        cloneObj.src162Grp.set(src162Grp.getClonedField());
        cloneObj.tgt169Grp = new Tgt169Grp();
        cloneObj.tgt169Grp.set(tgt169Grp.getClonedField());
        cloneObj.src164Grp = new Src164Grp();
        cloneObj.src164Grp.set(src164Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.src168Grp = new Src168Grp();
        cloneObj.src168Grp.set(src168Grp.getClonedField());
        cloneObj.src170Grp = new Src170Grp();
        cloneObj.src170Grp.set(src170Grp.getClonedField());
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt166Grp = new Tgt166Grp();
        cloneObj.tgt166Grp.set(tgt166Grp.getClonedField());
        cloneObj.src160Grp = new Src160Grp();
        cloneObj.src160Grp.set(src160Grp.getClonedField());
        cloneObj.src178Grp = new Src178Grp();
        cloneObj.src178Grp.set(src178Grp.getClonedField());
        cloneObj.src210Grp = new Src210Grp();
        cloneObj.src210Grp.set(src210Grp.getClonedField());
        cloneObj.tgt174Grp = new Tgt174Grp();
        cloneObj.tgt174Grp.set(tgt174Grp.getClonedField());
        cloneObj.tgt162Grp = new Tgt162Grp();
        cloneObj.tgt162Grp.set(tgt162Grp.getClonedField());
        cloneObj.tgt173Grp = new Tgt173Grp();
        cloneObj.tgt173Grp.set(tgt173Grp.getClonedField());
        cloneObj.tgt211Grp = new Tgt211Grp();
        cloneObj.tgt211Grp.set(tgt211Grp.getClonedField());
        cloneObj.tgt212Grp = new Tgt212Grp();
        cloneObj.tgt212Grp.set(tgt212Grp.getClonedField());
        cloneObj.tgt170Grp = new Tgt170Grp();
        cloneObj.tgt170Grp.set(tgt170Grp.getClonedField());
        cloneObj.tgt178Grp = new Tgt178Grp();
        cloneObj.tgt178Grp.set(tgt178Grp.getClonedField());
        cloneObj.tgt161Grp = new Tgt161Grp();
        cloneObj.tgt161Grp.set(tgt161Grp.getClonedField());
        cloneObj.tgt177Grp = new Tgt177Grp();
        cloneObj.tgt177Grp.set(tgt177Grp.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessOutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt11
	 *	@return tgt11
	 */
   public char[] getTgt11() throws CFException  {              
   		return work.getTgt11();
   }

  
	/**
	*  set variable tgt11
	*  @param value
	**/
   public void setTgt11(char[] value) throws CFException {
      work.setTgt11(value);
   } 

	/**
	 *	Returns the value of src6
	 *	@return src6
	 */
	public long getSrc6() throws CFException {        
   		return work.getSrc6();
	}
	
	/**
	 * 	Update Src6 with the passed value
	 *	@param number
	 */
	public void setSrc6(long number)  throws CFException{
		work.setSrc6(number);
	}



	/**
	 *	Returns the value of src4
	 *	@return src4
	 */
	public int getSrc4() throws CFException {        
   		return work.getSrc4();
	}
	
	/**
	 * 	Update Src4 with the passed value
	 *	@param number
	 */
	public void setSrc4(int number)  throws CFException{
		work.setSrc4(number);
	}


	public void setSrc4(long number)  throws CFException{
		work.setSrc4((int)number);
	}


	/**
	 *	Returns the value of src11
	 *	@return src11
	 */
	public long getSrc11() throws CFException {        
   		return work.getSrc11();
	}
	
	/**
	 * 	Update Src11 with the passed value
	 *	@param number
	 */
	public void setSrc11(long number)  throws CFException{
		work.setSrc11(number);
	}



	/**
	 *	Returns the value of tgt4
	 *	@return tgt4
	 */
   public char[] getTgt4() throws CFException  {              
   		return work.getTgt4();
   }

  
	/**
	*  set variable tgt4
	*  @param value
	**/
   public void setTgt4(char[] value) throws CFException {
      work.setTgt4(value);
   } 

	/**
	 *	Returns the value of src5
	 *	@return src5
	 */
	public long getSrc5() throws CFException {        
   		return work.getSrc5();
	}
	
	/**
	 * 	Update Src5 with the passed value
	 *	@param number
	 */
	public void setSrc5(long number)  throws CFException{
		work.setSrc5(number);
	}



	/**
	 *	Returns the value of tgt6
	 *	@return tgt6
	 */
   public char[] getTgt6() throws CFException  {              
   		return work.getTgt6();
   }

  
	/**
	*  set variable tgt6
	*  @param value
	**/
   public void setTgt6(char[] value) throws CFException {
      work.setTgt6(value);
   } 

	/**
	 *	Returns the value of tgt5
	 *	@return tgt5
	 */
   public char[] getTgt5() throws CFException  {              
   		return work.getTgt5();
   }

  
	/**
	*  set variable tgt5
	*  @param value
	**/
   public void setTgt5(char[] value) throws CFException {
      work.setTgt5(value);
   } 

	/**
	 *	Returns the value of src3
	 *	@return src3
	 */
	public int getSrc3() throws CFException {        
   		return work.getSrc3();
	}
	
	/**
	 * 	Update Src3 with the passed value
	 *	@param number
	 */
	public void setSrc3(int number)  throws CFException{
		work.setSrc3(number);
	}


	public void setSrc3(long number)  throws CFException{
		work.setSrc3((int)number);
	}


	/**
	 *	Returns the value of tgt3
	 *	@return tgt3
	 */
   public char[] getTgt3() throws CFException  {              
   		return work.getTgt3();
   }

  
	/**
	*  set variable tgt3
	*  @param value
	**/
   public void setTgt3(char[] value) throws CFException {
      work.setTgt3(value);
   } 


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class Process1Split46InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src15
	 *	@return src15
	 */
	public long getSrc15() throws CFException {        
   		return work.getSrc15();
	}
	
	/**
	 * 	Update Src15 with the passed value
	 *	@param number
	 */
	public void setSrc15(long number)  throws CFException{
		work.setSrc15(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process1Split46OutCtx getProcess1Split46OutCtx() {
            return new Process1Split46OutCtx();
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

    public Process1Split46InCtx clone() {
        Process1Split46InCtx cloneObj = new Process1Split46InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split46InCtx getProcess1Split46InCtx() {
            return new Process1Split46InCtx();
    }
     public class Process1Split46OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt14
	 *	@return tgt14
	 */
   public char[] getTgt14() throws CFException  {              
   		return work.getTgt14();
   }

  
	/**
	*  set variable tgt14
	*  @param value
	**/
   public void setTgt14(char[] value) throws CFException {
      work.setTgt14(value);
   } 

	/**
	 *	Returns the value of src12
	 *	@return src12
	 */
	public long getSrc12() throws CFException {        
   		return work.getSrc12();
	}
	
	/**
	 * 	Update Src12 with the passed value
	 *	@param number
	 */
	public void setSrc12(long number)  throws CFException{
		work.setSrc12(number);
	}



	/**
	 *	Returns the value of src15
	 *	@return src15
	 */
	public long getSrc15() throws CFException {        
   		return work.getSrc15();
	}
	
	/**
	 * 	Update Src15 with the passed value
	 *	@param number
	 */
	public void setSrc15(long number)  throws CFException{
		work.setSrc15(number);
	}



	/**
	 *	Returns the value of tgt13
	 *	@return tgt13
	 */
   public char[] getTgt13() throws CFException  {              
   		return work.getTgt13();
   }

  
	/**
	*  set variable tgt13
	*  @param value
	**/
   public void setTgt13(char[] value) throws CFException {
      work.setTgt13(value);
   } 

	/**
	 *	Returns the value of src14
	 *	@return src14
	 */
	public long getSrc14() throws CFException {        
   		return work.getSrc14();
	}
	
	/**
	 * 	Update Src14 with the passed value
	 *	@param number
	 */
	public void setSrc14(long number)  throws CFException{
		work.setSrc14(number);
	}



	/**
	 *	Returns the value of tgt15
	 *	@return tgt15
	 */
	public int getTgt15() throws CFException {        
   		return work.getTgt15();
	}
	
	/**
	 * 	Update Tgt15 with the passed value
	 *	@param number
	 */
	public void setTgt15(int number)  throws CFException{
		work.setTgt15(number);
	}


	public void setTgt15(long number)  throws CFException{
		work.setTgt15((int)number);
	}


	/**
	 *	Returns the value of src13
	 *	@return src13
	 */
	public long getSrc13() throws CFException {        
   		return work.getSrc13();
	}
	
	/**
	 * 	Update Src13 with the passed value
	 *	@param number
	 */
	public void setSrc13(long number)  throws CFException{
		work.setSrc13(number);
	}



	/**
	 *	Returns the value of src16
	 *	@return src16
	 */
	public long getSrc16() throws CFException {        
   		return work.getSrc16();
	}
	
	/**
	 * 	Update Src16 with the passed value
	 *	@param number
	 */
	public void setSrc16(long number)  throws CFException{
		work.setSrc16(number);
	}



	/**
	 *	Returns the value of tgt12
	 *	@return tgt12
	 */
   public char[] getTgt12() throws CFException  {              
   		return work.getTgt12();
   }

  
	/**
	*  set variable tgt12
	*  @param value
	**/
   public void setTgt12(char[] value) throws CFException {
      work.setTgt12(value);
   } 

	/**
	 *	Returns the value of tgt16
	 *	@return tgt16
	 */
	public long getTgt16() throws CFException {        
   		return work.getTgt16();
	}
	
	/**
	 * 	Update Tgt16 with the passed value
	 *	@param number
	 */
	public void setTgt16(long number)  throws CFException{
		work.setTgt16(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process1Split46OutCtx clone() {
        Process1Split46OutCtx cloneObj = new Process1Split46OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split46OutCtx getProcess1Split46OutCtx() {
            return new Process1Split46OutCtx();
    }
     public class Process2Split48InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src17
	 *	@return src17
	 */
	public long getSrc17() throws CFException {        
   		return work.getSrc17();
	}
	
	/**
	 * 	Update Src17 with the passed value
	 *	@param number
	 */
	public void setSrc17(long number)  throws CFException{
		work.setSrc17(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process2Split48OutCtx getProcess2Split48OutCtx() {
            return new Process2Split48OutCtx();
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

    public Process2Split48InCtx clone() {
        Process2Split48InCtx cloneObj = new Process2Split48InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split48InCtx getProcess2Split48InCtx() {
            return new Process2Split48InCtx();
    }
     public class Process2Split48OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt17
	 *	@return tgt17
	 */
	public long getTgt17() throws CFException {        
   		return work.getTgt17();
	}
	
	/**
	 * 	Update Tgt17 with the passed value
	 *	@param number
	 */
	public void setTgt17(long number)  throws CFException{
		work.setTgt17(number);
	}



	/**
	 *	Returns the value of tgt19
	 *	@return tgt19
	 */
	public short getTgt19() throws CFException {        
   		return work.getTgt19();
	}
	
	/**
	 * 	Update Tgt19 with the passed value
	 *	@param number
	 */
	public void setTgt19(short number)  throws CFException{
		work.setTgt19(number);
	}

	public void setTgt19(int number)  throws CFException{
		work.setTgt19((short)number);
	}

	public void setTgt19(long number)  throws CFException{
		work.setTgt19((short)number);
	}



	/**
	 *	Returns the value of src18
	 *	@return src18
	 */
	public long getSrc18() throws CFException {        
   		return work.getSrc18();
	}
	
	/**
	 * 	Update Src18 with the passed value
	 *	@param number
	 */
	public void setSrc18(long number)  throws CFException{
		work.setSrc18(number);
	}



	/**
	 *	Returns the value of tgt18
	 *	@return tgt18
	 */
	public long getTgt18() throws CFException {        
   		return work.getTgt18();
	}
	
	/**
	 * 	Update Tgt18 with the passed value
	 *	@param number
	 */
	public void setTgt18(long number)  throws CFException{
		work.setTgt18(number);
	}



	/**
	 *	Returns the value of src19
	 *	@return src19
	 */
	public long getSrc19() throws CFException {        
   		return work.getSrc19();
	}
	
	/**
	 * 	Update Src19 with the passed value
	 *	@param number
	 */
	public void setSrc19(long number)  throws CFException{
		work.setSrc19(number);
	}



	/**
	 *	Returns the value of src17
	 *	@return src17
	 */
	public long getSrc17() throws CFException {        
   		return work.getSrc17();
	}
	
	/**
	 * 	Update Src17 with the passed value
	 *	@param number
	 */
	public void setSrc17(long number)  throws CFException{
		work.setSrc17(number);
	}



	/**
	 *	Returns the value of src20
	 *	@return src20
	 */
	public long getSrc20() throws CFException {        
   		return work.getSrc20();
	}
	
	/**
	 * 	Update Src20 with the passed value
	 *	@param number
	 */
	public void setSrc20(long number)  throws CFException{
		work.setSrc20(number);
	}



	/**
	 *	Returns the value of src16
	 *	@return src16
	 */
	public long getSrc16() throws CFException {        
   		return work.getSrc16();
	}
	
	/**
	 * 	Update Src16 with the passed value
	 *	@param number
	 */
	public void setSrc16(long number)  throws CFException{
		work.setSrc16(number);
	}



	/**
	 *	Returns the value of tgt20
	 *	@return tgt20
	 */
	public int getTgt20() throws CFException {        
   		return work.getTgt20();
	}
	
	/**
	 * 	Update Tgt20 with the passed value
	 *	@param number
	 */
	public void setTgt20(int number)  throws CFException{
		work.setTgt20(number);
	}


	public void setTgt20(long number)  throws CFException{
		work.setTgt20((int)number);
	}


	/**
	 *	Returns the value of tgt16
	 *	@return tgt16
	 */
	public long getTgt16() throws CFException {        
   		return work.getTgt16();
	}
	
	/**
	 * 	Update Tgt16 with the passed value
	 *	@param number
	 */
	public void setTgt16(long number)  throws CFException{
		work.setTgt16(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process2Split48OutCtx clone() {
        Process2Split48OutCtx cloneObj = new Process2Split48OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split48OutCtx getProcess2Split48OutCtx() {
            return new Process2Split48OutCtx();
    }
     public class Process3Split50InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src22
	 *	@return src22
	 */
	public long getSrc22() throws CFException {        
   		return work.getSrc22();
	}
	
	/**
	 * 	Update Src22 with the passed value
	 *	@param number
	 */
	public void setSrc22(long number)  throws CFException{
		work.setSrc22(number);
	}



	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public long getSrc21() throws CFException {        
   		return work.getSrc21();
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *	@param number
	 */
	public void setSrc21(long number)  throws CFException{
		work.setSrc21(number);
	}



	/**
	 *	Returns the value of src24
	 *	@return src24
	 */
	public long getSrc24() throws CFException {        
   		return work.getSrc24();
	}
	
	/**
	 * 	Update Src24 with the passed value
	 *	@param number
	 */
	public void setSrc24(long number)  throws CFException{
		work.setSrc24(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process3Split50OutCtx getProcess3Split50OutCtx() {
            return new Process3Split50OutCtx();
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

    public Process3Split50InCtx clone() {
        Process3Split50InCtx cloneObj = new Process3Split50InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split50InCtx getProcess3Split50InCtx() {
            return new Process3Split50InCtx();
    }
     public class Process3Split50OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src22
	 *	@return src22
	 */
	public long getSrc22() throws CFException {        
   		return work.getSrc22();
	}
	
	/**
	 * 	Update Src22 with the passed value
	 *	@param number
	 */
	public void setSrc22(long number)  throws CFException{
		work.setSrc22(number);
	}



	/**
	 *	Returns the value of tgt21
	 *	@return tgt21
	 */
	public int getTgt21() throws CFException {        
   		return work.getTgt21();
	}
	
	/**
	 * 	Update Tgt21 with the passed value
	 *	@param number
	 */
	public void setTgt21(int number)  throws CFException{
		work.setTgt21(number);
	}


	public void setTgt21(long number)  throws CFException{
		work.setTgt21((int)number);
	}


	/**
	 *	Returns the value of tgt23
	 *	@return tgt23
	 */
	public long getTgt23() throws CFException {        
   		return work.getTgt23();
	}
	
	/**
	 * 	Update Tgt23 with the passed value
	 *	@param number
	 */
	public void setTgt23(long number)  throws CFException{
		work.setTgt23(number);
	}



	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public long getSrc21() throws CFException {        
   		return work.getSrc21();
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *	@param number
	 */
	public void setSrc21(long number)  throws CFException{
		work.setSrc21(number);
	}



	/**
	 *	Returns the value of src24
	 *	@return src24
	 */
	public long getSrc24() throws CFException {        
   		return work.getSrc24();
	}
	
	/**
	 * 	Update Src24 with the passed value
	 *	@param number
	 */
	public void setSrc24(long number)  throws CFException{
		work.setSrc24(number);
	}



	/**
	 *	Returns the value of src20
	 *	@return src20
	 */
	public long getSrc20() throws CFException {        
   		return work.getSrc20();
	}
	
	/**
	 * 	Update Src20 with the passed value
	 *	@param number
	 */
	public void setSrc20(long number)  throws CFException{
		work.setSrc20(number);
	}



	/**
	 *	Returns the value of tgt24
	 *	@return tgt24
	 */
	public long getTgt24() throws CFException {        
   		return work.getTgt24();
	}
	
	/**
	 * 	Update Tgt24 with the passed value
	 *	@param number
	 */
	public void setTgt24(long number)  throws CFException{
		work.setTgt24(number);
	}



	/**
	 *	Returns the value of tgt20
	 *	@return tgt20
	 */
	public int getTgt20() throws CFException {        
   		return work.getTgt20();
	}
	
	/**
	 * 	Update Tgt20 with the passed value
	 *	@param number
	 */
	public void setTgt20(int number)  throws CFException{
		work.setTgt20(number);
	}


	public void setTgt20(long number)  throws CFException{
		work.setTgt20((int)number);
	}


	/**
	 *	Returns the value of tgt22
	 *	@return tgt22
	 */
	public long getTgt22() throws CFException {        
   		return work.getTgt22();
	}
	
	/**
	 * 	Update Tgt22 with the passed value
	 *	@param number
	 */
	public void setTgt22(long number)  throws CFException{
		work.setTgt22(number);
	}



	/**
	 *	Returns the value of src23
	 *	@return src23
	 */
	public long getSrc23() throws CFException {        
   		return work.getSrc23();
	}
	
	/**
	 * 	Update Src23 with the passed value
	 *	@param number
	 */
	public void setSrc23(long number)  throws CFException{
		work.setSrc23(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process3Split50OutCtx clone() {
        Process3Split50OutCtx cloneObj = new Process3Split50OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split50OutCtx getProcess3Split50OutCtx() {
            return new Process3Split50OutCtx();
    }
     public class Process4Split52OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt25
	 *	@return tgt25
	 */
	public short getTgt25() throws CFException {        
   		return work.getTgt25();
	}
	
	/**
	 * 	Update Tgt25 with the passed value
	 *	@param number
	 */
	public void setTgt25(short number)  throws CFException{
		work.setTgt25(number);
	}

	public void setTgt25(int number)  throws CFException{
		work.setTgt25((short)number);
	}

	public void setTgt25(long number)  throws CFException{
		work.setTgt25((short)number);
	}



	/**
	 *	Returns the value of tgt27
	 *	@return tgt27
	 */
	public int getTgt27() throws CFException {        
   		return work.getTgt27();
	}
	
	/**
	 * 	Update Tgt27 with the passed value
	 *	@param number
	 */
	public void setTgt27(int number)  throws CFException{
		work.setTgt27(number);
	}


	public void setTgt27(long number)  throws CFException{
		work.setTgt27((int)number);
	}


	/**
	 *	Returns the value of src26
	 *	@return src26
	 */
	public long getSrc26() throws CFException {        
   		return work.getSrc26();
	}
	
	/**
	 * 	Update Src26 with the passed value
	 *	@param number
	 */
	public void setSrc26(long number)  throws CFException{
		work.setSrc26(number);
	}



	/**
	 *	Returns the value of tgt26
	 *	@return tgt26
	 */
	public int getTgt26() throws CFException {        
   		return work.getTgt26();
	}
	
	/**
	 * 	Update Tgt26 with the passed value
	 *	@param number
	 */
	public void setTgt26(int number)  throws CFException{
		work.setTgt26(number);
	}


	public void setTgt26(long number)  throws CFException{
		work.setTgt26((int)number);
	}


	/**
	 *	Returns the value of tgt28
	 *	@return tgt28
	 */
	public long getTgt28() throws CFException {        
   		return work.getTgt28();
	}
	
	/**
	 * 	Update Tgt28 with the passed value
	 *	@param number
	 */
	public void setTgt28(long number)  throws CFException{
		work.setTgt28(number);
	}



	/**
	 *	Returns the value of src25
	 *	@return src25
	 */
	public long getSrc25() throws CFException {        
   		return work.getSrc25();
	}
	
	/**
	 * 	Update Src25 with the passed value
	 *	@param number
	 */
	public void setSrc25(long number)  throws CFException{
		work.setSrc25(number);
	}



	/**
	 *	Returns the value of src27
	 *	@return src27
	 */
	public int getSrc27() throws CFException {        
   		return work.getSrc27();
	}
	
	/**
	 * 	Update Src27 with the passed value
	 *	@param number
	 */
	public void setSrc27(int number)  throws CFException{
		work.setSrc27(number);
	}


	public void setSrc27(long number)  throws CFException{
		work.setSrc27((int)number);
	}


	/**
	 *	Returns the value of src28
	 *	@return src28
	 */
	public int getSrc28() throws CFException {        
   		return work.getSrc28();
	}
	
	/**
	 * 	Update Src28 with the passed value
	 *	@param number
	 */
	public void setSrc28(int number)  throws CFException{
		work.setSrc28(number);
	}


	public void setSrc28(long number)  throws CFException{
		work.setSrc28((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process4Split52OutCtx clone() {
        Process4Split52OutCtx cloneObj = new Process4Split52OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process4Split52OutCtx getProcess4Split52OutCtx() {
            return new Process4Split52OutCtx();
    }
     public class Process5Split54OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt29
	 *	@return tgt29
	 */
	public long getTgt29() throws CFException {        
   		return work.getTgt29();
	}
	
	/**
	 * 	Update Tgt29 with the passed value
	 *	@param number
	 */
	public void setTgt29(long number)  throws CFException{
		work.setTgt29(number);
	}



	/**
	 *	Returns the value of src32
	 *	@return src32
	 */
	public int getSrc32() throws CFException {        
   		return work.getSrc32();
	}
	
	/**
	 * 	Update Src32 with the passed value
	 *	@param number
	 */
	public void setSrc32(int number)  throws CFException{
		work.setSrc32(number);
	}


	public void setSrc32(long number)  throws CFException{
		work.setSrc32((int)number);
	}


	/**
	 *	Returns the value of tgt32
	 *	@return tgt32
	 */
	public int getTgt32() throws CFException {        
   		return work.getTgt32();
	}
	
	/**
	 * 	Update Tgt32 with the passed value
	 *	@param number
	 */
	public void setTgt32(int number)  throws CFException{
		work.setTgt32(number);
	}


	public void setTgt32(long number)  throws CFException{
		work.setTgt32((int)number);
	}


	/**
	 *	Returns the value of src30
	 *	@return src30
	 */
	public int getSrc30() throws CFException {        
   		return work.getSrc30();
	}
	
	/**
	 * 	Update Src30 with the passed value
	 *	@param number
	 */
	public void setSrc30(int number)  throws CFException{
		work.setSrc30(number);
	}


	public void setSrc30(long number)  throws CFException{
		work.setSrc30((int)number);
	}


	/**
	 *	Returns the value of tgt30
	 *	@return tgt30
	 */
	public long getTgt30() throws CFException {        
   		return work.getTgt30();
	}
	
	/**
	 * 	Update Tgt30 with the passed value
	 *	@param number
	 */
	public void setTgt30(long number)  throws CFException{
		work.setTgt30(number);
	}



	/**
	 *	Returns the value of src31
	 *	@return src31
	 */
	public int getSrc31() throws CFException {        
   		return work.getSrc31();
	}
	
	/**
	 * 	Update Src31 with the passed value
	 *	@param number
	 */
	public void setSrc31(int number)  throws CFException{
		work.setSrc31(number);
	}


	public void setSrc31(long number)  throws CFException{
		work.setSrc31((int)number);
	}


	/**
	 *	Returns the value of src29
	 *	@return src29
	 */
	public int getSrc29() throws CFException {        
   		return work.getSrc29();
	}
	
	/**
	 * 	Update Src29 with the passed value
	 *	@param number
	 */
	public void setSrc29(int number)  throws CFException{
		work.setSrc29(number);
	}


	public void setSrc29(long number)  throws CFException{
		work.setSrc29((int)number);
	}


	/**
	 *	Returns the value of tgt31
	 *	@return tgt31
	 */
	public short getTgt31() throws CFException {        
   		return work.getTgt31();
	}
	
	/**
	 * 	Update Tgt31 with the passed value
	 *	@param number
	 */
	public void setTgt31(short number)  throws CFException{
		work.setTgt31(number);
	}

	public void setTgt31(int number)  throws CFException{
		work.setTgt31((short)number);
	}

	public void setTgt31(long number)  throws CFException{
		work.setTgt31((short)number);
	}



	/**
	 *	Returns the value of src33
	 *	@return src33
	 */
	public short getSrc33() throws CFException {        
   		return work.getSrc33();
	}
	
	/**
	 * 	Update Src33 with the passed value
	 *	@param number
	 */
	public void setSrc33(short number)  throws CFException{
		work.setSrc33(number);
	}

	public void setSrc33(int number)  throws CFException{
		work.setSrc33((short)number);
	}

	public void setSrc33(long number)  throws CFException{
		work.setSrc33((short)number);
	}



	/**
	 *	Returns the value of tgt33
	 *	@return tgt33
	 */
	public int getTgt33() throws CFException {        
   		return work.getTgt33();
	}
	
	/**
	 * 	Update Tgt33 with the passed value
	 *	@param number
	 */
	public void setTgt33(int number)  throws CFException{
		work.setTgt33(number);
	}


	public void setTgt33(long number)  throws CFException{
		work.setTgt33((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process5Split54OutCtx clone() {
        Process5Split54OutCtx cloneObj = new Process5Split54OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process5Split54OutCtx getProcess5Split54OutCtx() {
            return new Process5Split54OutCtx();
    }
     public class Process6Split56OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src34
	 *	@return src34
	 */
	public short getSrc34() throws CFException {        
   		return work.getSrc34();
	}
	
	/**
	 * 	Update Src34 with the passed value
	 *	@param number
	 */
	public void setSrc34(short number)  throws CFException{
		work.setSrc34(number);
	}

	public void setSrc34(int number)  throws CFException{
		work.setSrc34((short)number);
	}

	public void setSrc34(long number)  throws CFException{
		work.setSrc34((short)number);
	}



	/**
	 *	Returns the value of src35
	 *	@return src35
	 */
	public short getSrc35() throws CFException {        
   		return work.getSrc35();
	}
	
	/**
	 * 	Update Src35 with the passed value
	 *	@param number
	 */
	public void setSrc35(short number)  throws CFException{
		work.setSrc35(number);
	}

	public void setSrc35(int number)  throws CFException{
		work.setSrc35((short)number);
	}

	public void setSrc35(long number)  throws CFException{
		work.setSrc35((short)number);
	}



	/**
	 *	Returns the value of src36
	 *	@return src36
	 */
	public short getSrc36() throws CFException {        
   		return work.getSrc36();
	}
	
	/**
	 * 	Update Src36 with the passed value
	 *	@param number
	 */
	public void setSrc36(short number)  throws CFException{
		work.setSrc36(number);
	}

	public void setSrc36(int number)  throws CFException{
		work.setSrc36((short)number);
	}

	public void setSrc36(long number)  throws CFException{
		work.setSrc36((short)number);
	}



	/**
	 *	Returns the value of tgt35
	 *	@return tgt35
	 */
	public long getTgt35() throws CFException {        
   		return work.getTgt35();
	}
	
	/**
	 * 	Update Tgt35 with the passed value
	 *	@param number
	 */
	public void setTgt35(long number)  throws CFException{
		work.setTgt35(number);
	}



	/**
	 *	Returns the value of tgt36
	 *	@return tgt36
	 */
	public long getTgt36() throws CFException {        
   		return work.getTgt36();
	}
	
	/**
	 * 	Update Tgt36 with the passed value
	 *	@param number
	 */
	public void setTgt36(long number)  throws CFException{
		work.setTgt36(number);
	}



	/**
	 *	Returns the value of src37
	 *	@return src37
	 */
	public short getSrc37() throws CFException {        
   		return work.getSrc37();
	}
	
	/**
	 * 	Update Src37 with the passed value
	 *	@param number
	 */
	public void setSrc37(short number)  throws CFException{
		work.setSrc37(number);
	}

	public void setSrc37(int number)  throws CFException{
		work.setSrc37((short)number);
	}

	public void setSrc37(long number)  throws CFException{
		work.setSrc37((short)number);
	}



	/**
	 *	Returns the value of tgt34
	 *	@return tgt34
	 */
	public long getTgt34() throws CFException {        
   		return work.getTgt34();
	}
	
	/**
	 * 	Update Tgt34 with the passed value
	 *	@param number
	 */
	public void setTgt34(long number)  throws CFException{
		work.setTgt34(number);
	}



	/**
	 *	Returns the value of src33
	 *	@return src33
	 */
	public short getSrc33() throws CFException {        
   		return work.getSrc33();
	}
	
	/**
	 * 	Update Src33 with the passed value
	 *	@param number
	 */
	public void setSrc33(short number)  throws CFException{
		work.setSrc33(number);
	}

	public void setSrc33(int number)  throws CFException{
		work.setSrc33((short)number);
	}

	public void setSrc33(long number)  throws CFException{
		work.setSrc33((short)number);
	}



	/**
	 *	Returns the value of tgt33
	 *	@return tgt33
	 */
	public int getTgt33() throws CFException {        
   		return work.getTgt33();
	}
	
	/**
	 * 	Update Tgt33 with the passed value
	 *	@param number
	 */
	public void setTgt33(int number)  throws CFException{
		work.setTgt33(number);
	}


	public void setTgt33(long number)  throws CFException{
		work.setTgt33((int)number);
	}


	/**
	 *	Returns the value of tgt37
	 *	@return tgt37
	 */
	public short getTgt37() throws CFException {        
   		return work.getTgt37();
	}
	
	/**
	 * 	Update Tgt37 with the passed value
	 *	@param number
	 */
	public void setTgt37(short number)  throws CFException{
		work.setTgt37(number);
	}

	public void setTgt37(int number)  throws CFException{
		work.setTgt37((short)number);
	}

	public void setTgt37(long number)  throws CFException{
		work.setTgt37((short)number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process6Split56OutCtx clone() {
        Process6Split56OutCtx cloneObj = new Process6Split56OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process6Split56OutCtx getProcess6Split56OutCtx() {
            return new Process6Split56OutCtx();
    }
     public class Process7Split58InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src40
	 *	@return src40
	 */
	public long getSrc40() throws CFException {        
   		return work.getSrc40();
	}
	
	/**
	 * 	Update Src40 with the passed value
	 *	@param number
	 */
	public void setSrc40(long number)  throws CFException{
		work.setSrc40(number);
	}



	/**
	 *	Returns the value of src39
	 *	@return src39
	 */
	public long getSrc39() throws CFException {        
   		return work.getSrc39();
	}
	
	/**
	 * 	Update Src39 with the passed value
	 *	@param number
	 */
	public void setSrc39(long number)  throws CFException{
		work.setSrc39(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process7Split58OutCtx getProcess7Split58OutCtx() {
            return new Process7Split58OutCtx();
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

    public Process7Split58InCtx clone() {
        Process7Split58InCtx cloneObj = new Process7Split58InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process7Split58InCtx getProcess7Split58InCtx() {
            return new Process7Split58InCtx();
    }
     public class Process7Split58OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt38
	 *	@return tgt38
	 */
	public int getTgt38() throws CFException {        
   		return work.getTgt38();
	}
	
	/**
	 * 	Update Tgt38 with the passed value
	 *	@param number
	 */
	public void setTgt38(int number)  throws CFException{
		work.setTgt38(number);
	}


	public void setTgt38(long number)  throws CFException{
		work.setTgt38((int)number);
	}


	/**
	 *	Returns the value of src40
	 *	@return src40
	 */
	public long getSrc40() throws CFException {        
   		return work.getSrc40();
	}
	
	/**
	 * 	Update Src40 with the passed value
	 *	@param number
	 */
	public void setSrc40(long number)  throws CFException{
		work.setSrc40(number);
	}



	/**
	 *	Returns the value of tgt39
	 *	@return tgt39
	 */
	public long getTgt39() throws CFException {        
   		return work.getTgt39();
	}
	
	/**
	 * 	Update Tgt39 with the passed value
	 *	@param number
	 */
	public void setTgt39(long number)  throws CFException{
		work.setTgt39(number);
	}



	/**
	 *	Returns the value of src38
	 *	@return src38
	 */
	public short getSrc38() throws CFException {        
   		return work.getSrc38();
	}
	
	/**
	 * 	Update Src38 with the passed value
	 *	@param number
	 */
	public void setSrc38(short number)  throws CFException{
		work.setSrc38(number);
	}

	public void setSrc38(int number)  throws CFException{
		work.setSrc38((short)number);
	}

	public void setSrc38(long number)  throws CFException{
		work.setSrc38((short)number);
	}



	/**
	 *	Returns the value of src41
	 *	@return src41
	 */
	public long getSrc41() throws CFException {        
   		return work.getSrc41();
	}
	
	/**
	 * 	Update Src41 with the passed value
	 *	@param number
	 */
	public void setSrc41(long number)  throws CFException{
		work.setSrc41(number);
	}



	/**
	 *	Returns the value of src37
	 *	@return src37
	 */
	public short getSrc37() throws CFException {        
   		return work.getSrc37();
	}
	
	/**
	 * 	Update Src37 with the passed value
	 *	@param number
	 */
	public void setSrc37(short number)  throws CFException{
		work.setSrc37(number);
	}

	public void setSrc37(int number)  throws CFException{
		work.setSrc37((short)number);
	}

	public void setSrc37(long number)  throws CFException{
		work.setSrc37((short)number);
	}



	/**
	 *	Returns the value of tgt40
	 *	@return tgt40
	 */
	public int getTgt40() throws CFException {        
   		return work.getTgt40();
	}
	
	/**
	 * 	Update Tgt40 with the passed value
	 *	@param number
	 */
	public void setTgt40(int number)  throws CFException{
		work.setTgt40(number);
	}


	public void setTgt40(long number)  throws CFException{
		work.setTgt40((int)number);
	}


	/**
	 *	Returns the value of src39
	 *	@return src39
	 */
	public long getSrc39() throws CFException {        
   		return work.getSrc39();
	}
	
	/**
	 * 	Update Src39 with the passed value
	 *	@param number
	 */
	public void setSrc39(long number)  throws CFException{
		work.setSrc39(number);
	}



	/**
	 *	Returns the value of tgt41
	 *	@return tgt41
	 */
	public long getTgt41() throws CFException {        
   		return work.getTgt41();
	}
	
	/**
	 * 	Update Tgt41 with the passed value
	 *	@param number
	 */
	public void setTgt41(long number)  throws CFException{
		work.setTgt41(number);
	}



	/**
	 *	Returns the value of tgt37
	 *	@return tgt37
	 */
	public short getTgt37() throws CFException {        
   		return work.getTgt37();
	}
	
	/**
	 * 	Update Tgt37 with the passed value
	 *	@param number
	 */
	public void setTgt37(short number)  throws CFException{
		work.setTgt37(number);
	}

	public void setTgt37(int number)  throws CFException{
		work.setTgt37((short)number);
	}

	public void setTgt37(long number)  throws CFException{
		work.setTgt37((short)number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process7Split58OutCtx clone() {
        Process7Split58OutCtx cloneObj = new Process7Split58OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process7Split58OutCtx getProcess7Split58OutCtx() {
            return new Process7Split58OutCtx();
    }
     public class Process8Split60InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src45
	 *	@return src45
	 */
	public int getSrc45() throws CFException {        
   		return work.getSrc45();
	}
	
	/**
	 * 	Update Src45 with the passed value
	 *	@param number
	 */
	public void setSrc45(int number)  throws CFException{
		work.setSrc45(number);
	}


	public void setSrc45(long number)  throws CFException{
		work.setSrc45((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process8Split60OutCtx getProcess8Split60OutCtx() {
            return new Process8Split60OutCtx();
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

    public Process8Split60InCtx clone() {
        Process8Split60InCtx cloneObj = new Process8Split60InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process8Split60InCtx getProcess8Split60InCtx() {
            return new Process8Split60InCtx();
    }
     public class Process8Split60OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt42
	 *	@return tgt42
	 */
	public long getTgt42() throws CFException {        
   		return work.getTgt42();
	}
	
	/**
	 * 	Update Tgt42 with the passed value
	 *	@param number
	 */
	public void setTgt42(long number)  throws CFException{
		work.setTgt42(number);
	}



	/**
	 *	Returns the value of tgt44
	 *	@return tgt44
	 */
	public int getTgt44() throws CFException {        
   		return work.getTgt44();
	}
	
	/**
	 * 	Update Tgt44 with the passed value
	 *	@param number
	 */
	public void setTgt44(int number)  throws CFException{
		work.setTgt44(number);
	}


	public void setTgt44(long number)  throws CFException{
		work.setTgt44((int)number);
	}


	/**
	 *	Returns the value of tgt45
	 *	@return tgt45
	 */
	public int getTgt45() throws CFException {        
   		return work.getTgt45();
	}
	
	/**
	 * 	Update Tgt45 with the passed value
	 *	@param number
	 */
	public void setTgt45(int number)  throws CFException{
		work.setTgt45(number);
	}


	public void setTgt45(long number)  throws CFException{
		work.setTgt45((int)number);
	}


	/**
	 *	Returns the value of tgt43
	 *	@return tgt43
	 */
	public short getTgt43() throws CFException {        
   		return work.getTgt43();
	}
	
	/**
	 * 	Update Tgt43 with the passed value
	 *	@param number
	 */
	public void setTgt43(short number)  throws CFException{
		work.setTgt43(number);
	}

	public void setTgt43(int number)  throws CFException{
		work.setTgt43((short)number);
	}

	public void setTgt43(long number)  throws CFException{
		work.setTgt43((short)number);
	}



	/**
	 *	Returns the value of src44
	 *	@return src44
	 */
	public long getSrc44() throws CFException {        
   		return work.getSrc44();
	}
	
	/**
	 * 	Update Src44 with the passed value
	 *	@param number
	 */
	public void setSrc44(long number)  throws CFException{
		work.setSrc44(number);
	}



	/**
	 *	Returns the value of src42
	 *	@return src42
	 */
	public long getSrc42() throws CFException {        
   		return work.getSrc42();
	}
	
	/**
	 * 	Update Src42 with the passed value
	 *	@param number
	 */
	public void setSrc42(long number)  throws CFException{
		work.setSrc42(number);
	}



	/**
	 *	Returns the value of src43
	 *	@return src43
	 */
	public long getSrc43() throws CFException {        
   		return work.getSrc43();
	}
	
	/**
	 * 	Update Src43 with the passed value
	 *	@param number
	 */
	public void setSrc43(long number)  throws CFException{
		work.setSrc43(number);
	}



	/**
	 *	Returns the value of src45
	 *	@return src45
	 */
	public int getSrc45() throws CFException {        
   		return work.getSrc45();
	}
	
	/**
	 * 	Update Src45 with the passed value
	 *	@param number
	 */
	public void setSrc45(int number)  throws CFException{
		work.setSrc45(number);
	}


	public void setSrc45(long number)  throws CFException{
		work.setSrc45((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process8Split60OutCtx clone() {
        Process8Split60OutCtx cloneObj = new Process8Split60OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process8Split60OutCtx getProcess8Split60OutCtx() {
            return new Process8Split60OutCtx();
    }
     public class Process9Split62InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src48
	 *	@return src48
	 */
	public int getSrc48() throws CFException {        
   		return work.getSrc48();
	}
	
	/**
	 * 	Update Src48 with the passed value
	 *	@param number
	 */
	public void setSrc48(int number)  throws CFException{
		work.setSrc48(number);
	}


	public void setSrc48(long number)  throws CFException{
		work.setSrc48((int)number);
	}


	/**
	 *	Returns the value of src46
	 *	@return src46
	 */
	public int getSrc46() throws CFException {        
   		return work.getSrc46();
	}
	
	/**
	 * 	Update Src46 with the passed value
	 *	@param number
	 */
	public void setSrc46(int number)  throws CFException{
		work.setSrc46(number);
	}


	public void setSrc46(long number)  throws CFException{
		work.setSrc46((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process9Split62OutCtx getProcess9Split62OutCtx() {
            return new Process9Split62OutCtx();
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

    public Process9Split62InCtx clone() {
        Process9Split62InCtx cloneObj = new Process9Split62InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process9Split62InCtx getProcess9Split62InCtx() {
            return new Process9Split62InCtx();
    }
     public class Process9Split62OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt49
	 *	@return tgt49
	 */
	public short getTgt49() throws CFException {        
   		return work.getTgt49();
	}
	
	/**
	 * 	Update Tgt49 with the passed value
	 *	@param number
	 */
	public void setTgt49(short number)  throws CFException{
		work.setTgt49(number);
	}

	public void setTgt49(int number)  throws CFException{
		work.setTgt49((short)number);
	}

	public void setTgt49(long number)  throws CFException{
		work.setTgt49((short)number);
	}



	/**
	 *	Returns the value of tgt47
	 *	@return tgt47
	 */
	public long getTgt47() throws CFException {        
   		return work.getTgt47();
	}
	
	/**
	 * 	Update Tgt47 with the passed value
	 *	@param number
	 */
	public void setTgt47(long number)  throws CFException{
		work.setTgt47(number);
	}



	/**
	 *	Returns the value of tgt48
	 *	@return tgt48
	 */
	public long getTgt48() throws CFException {        
   		return work.getTgt48();
	}
	
	/**
	 * 	Update Tgt48 with the passed value
	 *	@param number
	 */
	public void setTgt48(long number)  throws CFException{
		work.setTgt48(number);
	}



	/**
	 *	Returns the value of tgt46
	 *	@return tgt46
	 */
	public long getTgt46() throws CFException {        
   		return work.getTgt46();
	}
	
	/**
	 * 	Update Tgt46 with the passed value
	 *	@param number
	 */
	public void setTgt46(long number)  throws CFException{
		work.setTgt46(number);
	}



	/**
	 *	Returns the value of src48
	 *	@return src48
	 */
	public int getSrc48() throws CFException {        
   		return work.getSrc48();
	}
	
	/**
	 * 	Update Src48 with the passed value
	 *	@param number
	 */
	public void setSrc48(int number)  throws CFException{
		work.setSrc48(number);
	}


	public void setSrc48(long number)  throws CFException{
		work.setSrc48((int)number);
	}


	/**
	 *	Returns the value of src50
	 *	@return src50
	 */
	public int getSrc50() throws CFException {        
   		return work.getSrc50();
	}
	
	/**
	 * 	Update Src50 with the passed value
	 *	@param number
	 */
	public void setSrc50(int number)  throws CFException{
		work.setSrc50(number);
	}


	public void setSrc50(long number)  throws CFException{
		work.setSrc50((int)number);
	}


	/**
	 *	Returns the value of src49
	 *	@return src49
	 */
	public int getSrc49() throws CFException {        
   		return work.getSrc49();
	}
	
	/**
	 * 	Update Src49 with the passed value
	 *	@param number
	 */
	public void setSrc49(int number)  throws CFException{
		work.setSrc49(number);
	}


	public void setSrc49(long number)  throws CFException{
		work.setSrc49((int)number);
	}


	/**
	 *	Returns the value of tgt50
	 *	@return tgt50
	 */
	public int getTgt50() throws CFException {        
   		return work.getTgt50();
	}
	
	/**
	 * 	Update Tgt50 with the passed value
	 *	@param number
	 */
	public void setTgt50(int number)  throws CFException{
		work.setTgt50(number);
	}


	public void setTgt50(long number)  throws CFException{
		work.setTgt50((int)number);
	}


	/**
	 *	Returns the value of src46
	 *	@return src46
	 */
	public int getSrc46() throws CFException {        
   		return work.getSrc46();
	}
	
	/**
	 * 	Update Src46 with the passed value
	 *	@param number
	 */
	public void setSrc46(int number)  throws CFException{
		work.setSrc46(number);
	}


	public void setSrc46(long number)  throws CFException{
		work.setSrc46((int)number);
	}


	/**
	 *	Returns the value of src47
	 *	@return src47
	 */
	public int getSrc47() throws CFException {        
   		return work.getSrc47();
	}
	
	/**
	 * 	Update Src47 with the passed value
	 *	@param number
	 */
	public void setSrc47(int number)  throws CFException{
		work.setSrc47(number);
	}


	public void setSrc47(long number)  throws CFException{
		work.setSrc47((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process9Split62OutCtx clone() {
        Process9Split62OutCtx cloneObj = new Process9Split62OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process9Split62OutCtx getProcess9Split62OutCtx() {
            return new Process9Split62OutCtx();
    }
     public class Process10Split64OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src54
	 *	@return src54
	 */
	public short getSrc54() throws CFException {        
   		return work.getSrc54();
	}
	
	/**
	 * 	Update Src54 with the passed value
	 *	@param number
	 */
	public void setSrc54(short number)  throws CFException{
		work.setSrc54(number);
	}

	public void setSrc54(int number)  throws CFException{
		work.setSrc54((short)number);
	}

	public void setSrc54(long number)  throws CFException{
		work.setSrc54((short)number);
	}



	/**
	 *	Returns the value of src50
	 *	@return src50
	 */
	public int getSrc50() throws CFException {        
   		return work.getSrc50();
	}
	
	/**
	 * 	Update Src50 with the passed value
	 *	@param number
	 */
	public void setSrc50(int number)  throws CFException{
		work.setSrc50(number);
	}


	public void setSrc50(long number)  throws CFException{
		work.setSrc50((int)number);
	}


	/**
	 *	Returns the value of src53
	 *	@return src53
	 */
	public short getSrc53() throws CFException {        
   		return work.getSrc53();
	}
	
	/**
	 * 	Update Src53 with the passed value
	 *	@param number
	 */
	public void setSrc53(short number)  throws CFException{
		work.setSrc53(number);
	}

	public void setSrc53(int number)  throws CFException{
		work.setSrc53((short)number);
	}

	public void setSrc53(long number)  throws CFException{
		work.setSrc53((short)number);
	}



	public BigDecimal getTgt53() throws CFException{      
   		return work.getTgt53();
	}

    public char[] getTgt53String() throws CFException {
          return  work.getTgt53().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt53 with the passed number
	 *	@param number
	 */
	public void setTgt53(BigDecimal number)  throws CFException{
		work.setTgt53(number);
   }

	/**
	 *	Returns the value of src51
	 *	@return src51
	 */
	public short getSrc51() throws CFException {        
   		return work.getSrc51();
	}
	
	/**
	 * 	Update Src51 with the passed value
	 *	@param number
	 */
	public void setSrc51(short number)  throws CFException{
		work.setSrc51(number);
	}

	public void setSrc51(int number)  throws CFException{
		work.setSrc51((short)number);
	}

	public void setSrc51(long number)  throws CFException{
		work.setSrc51((short)number);
	}



	/**
	 *	Returns the value of tgt50
	 *	@return tgt50
	 */
	public int getTgt50() throws CFException {        
   		return work.getTgt50();
	}
	
	/**
	 * 	Update Tgt50 with the passed value
	 *	@param number
	 */
	public void setTgt50(int number)  throws CFException{
		work.setTgt50(number);
	}


	public void setTgt50(long number)  throws CFException{
		work.setTgt50((int)number);
	}


	/**
	 *	Returns the value of tgt51
	 *	@return tgt51
	 */
   public char[] getTgt51() throws CFException  {              
   		return work.getTgt51();
   }

  
	/**
	*  set variable tgt51
	*  @param value
	**/
   public void setTgt51(char[] value) throws CFException {
      work.setTgt51(value);
   } 

     /**
	 * 	Update Tgt51 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt51(char[] source, int sourceIndex) throws CFException {
      work.setTgt51(source, sourceIndex);
   	
   }
   
   public void setTgt51(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt51(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt51 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt51(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt51 with another Field
	 *	@param value
	 */
   public void setTgt51(Field source) {
      work.setTgt51(source);
   }  
   
     /**
	 * 	Update Tgt51 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt51(Field source, int sourceIndex,int sourceLen) {
      work.setTgt51(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt51(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getTgt54() throws CFException{      
   		return work.getTgt54();
	}

    public char[] getTgt54String() throws CFException {
          return  work.getTgt54().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt54 with the passed number
	 *	@param number
	 */
	public void setTgt54(BigDecimal number)  throws CFException{
		work.setTgt54(number);
   }

	/**
	 *	Returns the value of src52
	 *	@return src52
	 */
	public int getSrc52() throws CFException {        
   		return work.getSrc52();
	}
	
	/**
	 * 	Update Src52 with the passed value
	 *	@param number
	 */
	public void setSrc52(int number)  throws CFException{
		work.setSrc52(number);
	}


	public void setSrc52(long number)  throws CFException{
		work.setSrc52((int)number);
	}


	/**
	 *	Returns the value of tgt52
	 *	@return tgt52
	 */
   public char[] getTgt52() throws CFException  {              
   		return work.getTgt52();
   }

  
	/**
	*  set variable tgt52
	*  @param value
	**/
   public void setTgt52(char[] value) throws CFException {
      work.setTgt52(value);
   } 

     /**
	 * 	Update Tgt52 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt52(char[] source, int sourceIndex) throws CFException {
      work.setTgt52(source, sourceIndex);
   	
   }
   
   public void setTgt52(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt52(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt52 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt52(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt52(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt52 with another Field
	 *	@param value
	 */
   public void setTgt52(Field source) {
      work.setTgt52(source);
   }  
   
     /**
	 * 	Update Tgt52 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt52(Field source, int sourceIndex,int sourceLen) {
      work.setTgt52(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt52 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt52(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt52(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process10Split64OutCtx clone() {
        Process10Split64OutCtx cloneObj = new Process10Split64OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process10Split64OutCtx getProcess10Split64OutCtx() {
            return new Process10Split64OutCtx();
    }
     public class Process11Split66OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src56
	 *	@return src56
	 */
	public int getSrc56() throws CFException {        
   		return work.getSrc56();
	}
	
	/**
	 * 	Update Src56 with the passed value
	 *	@param number
	 */
	public void setSrc56(int number)  throws CFException{
		work.setSrc56(number);
	}


	public void setSrc56(long number)  throws CFException{
		work.setSrc56((int)number);
	}


	/**
	 *	Returns the value of src54
	 *	@return src54
	 */
	public short getSrc54() throws CFException {        
   		return work.getSrc54();
	}
	
	/**
	 * 	Update Src54 with the passed value
	 *	@param number
	 */
	public void setSrc54(short number)  throws CFException{
		work.setSrc54(number);
	}

	public void setSrc54(int number)  throws CFException{
		work.setSrc54((short)number);
	}

	public void setSrc54(long number)  throws CFException{
		work.setSrc54((short)number);
	}



	/**
	 *	Returns the value of src55
	 *	@return src55
	 */
	public int getSrc55() throws CFException {        
   		return work.getSrc55();
	}
	
	/**
	 * 	Update Src55 with the passed value
	 *	@param number
	 */
	public void setSrc55(int number)  throws CFException{
		work.setSrc55(number);
	}


	public void setSrc55(long number)  throws CFException{
		work.setSrc55((int)number);
	}


	/**
	 *	Returns the value of src58
	 *	@return src58
	 */
	public int getSrc58() throws CFException {        
   		return work.getSrc58();
	}
	
	/**
	 * 	Update Src58 with the passed value
	 *	@param number
	 */
	public void setSrc58(int number)  throws CFException{
		work.setSrc58(number);
	}


	public void setSrc58(long number)  throws CFException{
		work.setSrc58((int)number);
	}


	public BigDecimal getTgt55() throws CFException{      
   		return work.getTgt55();
	}

    public char[] getTgt55String() throws CFException {
          return  work.getTgt55().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt55 with the passed number
	 *	@param number
	 */
	public void setTgt55(BigDecimal number)  throws CFException{
		work.setTgt55(number);
   }

	/**
	 *	Returns the value of src57
	 *	@return src57
	 */
	public int getSrc57() throws CFException {        
   		return work.getSrc57();
	}
	
	/**
	 * 	Update Src57 with the passed value
	 *	@param number
	 */
	public void setSrc57(int number)  throws CFException{
		work.setSrc57(number);
	}


	public void setSrc57(long number)  throws CFException{
		work.setSrc57((int)number);
	}


	public BigDecimal getTgt57() throws CFException{      
   		return work.getTgt57();
	}

    public char[] getTgt57String() throws CFException {
          return  work.getTgt57().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt57 with the passed number
	 *	@param number
	 */
	public void setTgt57(BigDecimal number)  throws CFException{
		work.setTgt57(number);
   }

	public BigDecimal getTgt58() throws CFException{      
   		return work.getTgt58();
	}

    public char[] getTgt58String() throws CFException {
          return  work.getTgt58().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt58 with the passed number
	 *	@param number
	 */
	public void setTgt58(BigDecimal number)  throws CFException{
		work.setTgt58(number);
   }

	public BigDecimal getTgt54() throws CFException{      
   		return work.getTgt54();
	}

    public char[] getTgt54String() throws CFException {
          return  work.getTgt54().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt54 with the passed number
	 *	@param number
	 */
	public void setTgt54(BigDecimal number)  throws CFException{
		work.setTgt54(number);
   }

	public BigDecimal getTgt56() throws CFException{      
   		return work.getTgt56();
	}

    public char[] getTgt56String() throws CFException {
          return  work.getTgt56().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt56 with the passed number
	 *	@param number
	 */
	public void setTgt56(BigDecimal number)  throws CFException{
		work.setTgt56(number);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process11Split66OutCtx clone() {
        Process11Split66OutCtx cloneObj = new Process11Split66OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process11Split66OutCtx getProcess11Split66OutCtx() {
            return new Process11Split66OutCtx();
    }
     public class Process12Split68OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src59
	 *	@return src59
	 */
	public long getSrc59() throws CFException {        
   		return work.getSrc59();
	}
	
	/**
	 * 	Update Src59 with the passed value
	 *	@param number
	 */
	public void setSrc59(long number)  throws CFException{
		work.setSrc59(number);
	}



	public BigDecimal getTgt59() throws CFException{      
   		return work.getTgt59();
	}

    public char[] getTgt59String() throws CFException {
          return  work.getTgt59().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt59 with the passed number
	 *	@param number
	 */
	public void setTgt59(BigDecimal number)  throws CFException{
		work.setTgt59(number);
   }

	public BigDecimal getSrc61() throws CFException{      
   		return work.getSrc61();
	}

    public char[] getSrc61String() throws CFException {
          return  work.getSrc61().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src61 with the passed number
	 *	@param number
	 */
	public void setSrc61(BigDecimal number)  throws CFException{
		work.setSrc61(number);
   }

	public BigDecimal getTgt61() throws CFException{      
   		return work.getTgt61();
	}

    public char[] getTgt61String() throws CFException {
          return  work.getTgt61().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt61 with the passed number
	 *	@param number
	 */
	public void setTgt61(BigDecimal number)  throws CFException{
		work.setTgt61(number);
   }

	public BigDecimal getSrc62() throws CFException{      
   		return work.getSrc62();
	}

    public char[] getSrc62String() throws CFException {
          return  work.getSrc62().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src62 with the passed number
	 *	@param number
	 */
	public void setSrc62(BigDecimal number)  throws CFException{
		work.setSrc62(number);
   }

	public BigDecimal getTgt60() throws CFException{      
   		return work.getTgt60();
	}

    public char[] getTgt60String() throws CFException {
          return  work.getTgt60().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt60 with the passed number
	 *	@param number
	 */
	public void setTgt60(BigDecimal number)  throws CFException{
		work.setTgt60(number);
   }

	public BigDecimal getTgt62() throws CFException{      
   		return work.getTgt62();
	}

    public char[] getTgt62String() throws CFException {
          return  work.getTgt62().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt62 with the passed number
	 *	@param number
	 */
	public void setTgt62(BigDecimal number)  throws CFException{
		work.setTgt62(number);
   }

	/**
	 *	Returns the value of src60
	 *	@return src60
	 */
	public long getSrc60() throws CFException {        
   		return work.getSrc60();
	}
	
	/**
	 * 	Update Src60 with the passed value
	 *	@param number
	 */
	public void setSrc60(long number)  throws CFException{
		work.setSrc60(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process12Split68OutCtx clone() {
        Process12Split68OutCtx cloneObj = new Process12Split68OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process12Split68OutCtx getProcess12Split68OutCtx() {
            return new Process12Split68OutCtx();
    }
     public class Process13Split70OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	public BigDecimal getTgt65() throws CFException{      
   		return work.getTgt65();
	}

    public char[] getTgt65String() throws CFException {
          return  work.getTgt65().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt65 with the passed number
	 *	@param number
	 */
	public void setTgt65(BigDecimal number)  throws CFException{
		work.setTgt65(number);
   }

	/**
	 *	Returns the value of src66
	 *	@return src66
	 */
	public BigDecimal getSrc66() throws CFException {
   		return work.getSrc66();
	}


	 /**
     *	Returns String value of src66
     *	@return src66
     */
    public char[]  getSrc66String() throws CFException {
         return work.getSrc66String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src66IsNumeric() {
        return work.src66IsNumeric();
    }
	/**
	 * 	Update Src66 with the passed number
	 *	@param number
	 */
	public void setSrc66(BigDecimal number)  throws CFException{
		work.setSrc66(number);
   }

	/**
	 * 	Update Src66 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc66(char[] value)  throws CFException{
		work.setSrc66(value);
	}   

	public BigDecimal getTgt64() throws CFException{      
   		return work.getTgt64();
	}

    public char[] getTgt64String() throws CFException {
          return  work.getTgt64().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt64 with the passed number
	 *	@param number
	 */
	public void setTgt64(BigDecimal number)  throws CFException{
		work.setTgt64(number);
   }

	public BigDecimal getTgt66() throws CFException{      
   		return work.getTgt66();
	}

    public char[] getTgt66String() throws CFException {
          return  work.getTgt66().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt66 with the passed number
	 *	@param number
	 */
	public void setTgt66(BigDecimal number)  throws CFException{
		work.setTgt66(number);
   }

	/**
	 *	Returns the value of src63
	 *	@return src63
	 */
	public BigDecimal getSrc63() throws CFException {
   		return work.getSrc63();
	}

    /**
	 *	Returns the String value of src63
	 *	@return src63
	 */
	public char[]  getSrc63ActualString()  throws CFException{
	    return work.getSrc63ActualString();
	}

	 /**
     *	Returns String value of src63
     *	@return src63
     */
    public char[]  getSrc63String() throws CFException {
         return work.getSrc63String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src63IsNumeric() {
        return work.src63IsNumeric();
    }
	/**
	 * 	Update Src63 with the passed number
	 *	@param number
	 */
	public void setSrc63(BigDecimal number)  throws CFException{
		work.setSrc63(number);
   }

	/**
	 * 	Update Src63 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc63(char[] value)  throws CFException{
		work.setSrc63(value);
	}   

	public BigDecimal getTgt63() throws CFException{      
   		return work.getTgt63();
	}

    public char[] getTgt63String() throws CFException {
          return  work.getTgt63().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt63 with the passed number
	 *	@param number
	 */
	public void setTgt63(BigDecimal number)  throws CFException{
		work.setTgt63(number);
   }

	/**
	 *	Returns the value of src65
	 *	@return src65
	 */
	public BigDecimal getSrc65() throws CFException {
   		return work.getSrc65();
	}


	 /**
     *	Returns String value of src65
     *	@return src65
     */
    public char[]  getSrc65String() throws CFException {
         return work.getSrc65String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src65IsNumeric() {
        return work.src65IsNumeric();
    }
	/**
	 * 	Update Src65 with the passed number
	 *	@param number
	 */
	public void setSrc65(BigDecimal number)  throws CFException{
		work.setSrc65(number);
   }

	/**
	 * 	Update Src65 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc65(char[] value)  throws CFException{
		work.setSrc65(value);
	}   

	/**
	 *	Returns the value of src64
	 *	@return src64
	 */
	public BigDecimal getSrc64() throws CFException {
   		return work.getSrc64();
	}

    /**
	 *	Returns the String value of src64
	 *	@return src64
	 */
	public char[]  getSrc64ActualString()  throws CFException{
	    return work.getSrc64ActualString();
	}

	 /**
     *	Returns String value of src64
     *	@return src64
     */
    public char[]  getSrc64String() throws CFException {
         return work.getSrc64String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src64IsNumeric() {
        return work.src64IsNumeric();
    }
	/**
	 * 	Update Src64 with the passed number
	 *	@param number
	 */
	public void setSrc64(BigDecimal number)  throws CFException{
		work.setSrc64(number);
   }

	/**
	 * 	Update Src64 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc64(char[] value)  throws CFException{
		work.setSrc64(value);
	}   

	public BigDecimal getTgt67() throws CFException{      
   		return work.getTgt67();
	}

    public char[] getTgt67String() throws CFException {
          return  work.getTgt67().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt67 with the passed number
	 *	@param number
	 */
	public void setTgt67(BigDecimal number)  throws CFException{
		work.setTgt67(number);
   }

	/**
	 *	Returns the value of src67
	 *	@return src67
	 */
	public BigDecimal getSrc67() throws CFException {
   		return work.getSrc67();
	}


	 /**
     *	Returns String value of src67
     *	@return src67
     */
    public char[]  getSrc67String() throws CFException {
         return work.getSrc67String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src67IsNumeric() {
        return work.src67IsNumeric();
    }
	/**
	 * 	Update Src67 with the passed number
	 *	@param number
	 */
	public void setSrc67(BigDecimal number)  throws CFException{
		work.setSrc67(number);
   }

	/**
	 * 	Update Src67 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc67(char[] value)  throws CFException{
		work.setSrc67(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process13Split70OutCtx clone() {
        Process13Split70OutCtx cloneObj = new Process13Split70OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process13Split70OutCtx getProcess13Split70OutCtx() {
            return new Process13Split70OutCtx();
    }
     public class Process14Split72OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	public BigDecimal getTgt68() throws CFException{      
   		return work.getTgt68();
	}

    public char[] getTgt68String() throws CFException {
          return  work.getTgt68().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt68 with the passed number
	 *	@param number
	 */
	public void setTgt68(BigDecimal number)  throws CFException{
		work.setTgt68(number);
   }

	/**
	 *	Returns the value of src68
	 *	@return src68
	 */
	public BigDecimal getSrc68() throws CFException {
   		return work.getSrc68();
	}


	 /**
     *	Returns String value of src68
     *	@return src68
     */
    public char[]  getSrc68String() throws CFException {
         return work.getSrc68String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src68IsNumeric() {
        return work.src68IsNumeric();
    }
	/**
	 * 	Update Src68 with the passed number
	 *	@param number
	 */
	public void setSrc68(BigDecimal number)  throws CFException{
		work.setSrc68(number);
   }

	/**
	 * 	Update Src68 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc68(char[] value)  throws CFException{
		work.setSrc68(value);
	}   

	/**
	 *	Returns the value of tgt71
	 *	@return tgt71
	 */
	public BigDecimal getTgt71() throws CFException {
   		return work.getTgt71();
	}

    /**
	 *	Returns the String value of tgt71
	 *	@return tgt71
	 */
	public char[]  getTgt71ActualString()  throws CFException{
	    return work.getTgt71ActualString();
	}

	 /**
     *	Returns String value of tgt71
     *	@return tgt71
     */
    public char[]  getTgt71String() throws CFException {
         return work.getTgt71String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt71IsNumeric() {
        return work.tgt71IsNumeric();
    }
	/**
	 * 	Update Tgt71 with the passed number
	 *	@param number
	 */
	public void setTgt71(BigDecimal number)  throws CFException{
		work.setTgt71(number);
   }

	/**
	 * 	Update Tgt71 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt71(char[] value)  throws CFException{
		work.setTgt71(value);
	}   

	/**
	 *	Returns the value of tgt69
	 *	@return tgt69
	 */
	public BigDecimal getTgt69() throws CFException {
   		return work.getTgt69();
	}


	 /**
     *	Returns String value of tgt69
     *	@return tgt69
     */
    public char[]  getTgt69String() throws CFException {
         return work.getTgt69String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt69IsNumeric() {
        return work.tgt69IsNumeric();
    }
	/**
	 * 	Update Tgt69 with the passed number
	 *	@param number
	 */
	public void setTgt69(BigDecimal number)  throws CFException{
		work.setTgt69(number);
   }

	/**
	 * 	Update Tgt69 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt69(char[] value)  throws CFException{
		work.setTgt69(value);
	}   

	/**
	 *	Returns the value of tgt70
	 *	@return tgt70
	 */
	public BigDecimal getTgt70() throws CFException {
   		return work.getTgt70();
	}


	 /**
     *	Returns String value of tgt70
     *	@return tgt70
     */
    public char[]  getTgt70String() throws CFException {
         return work.getTgt70String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt70IsNumeric() {
        return work.tgt70IsNumeric();
    }
	/**
	 * 	Update Tgt70 with the passed number
	 *	@param number
	 */
	public void setTgt70(BigDecimal number)  throws CFException{
		work.setTgt70(number);
   }

	/**
	 * 	Update Tgt70 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt70(char[] value)  throws CFException{
		work.setTgt70(value);
	}   

	public BigDecimal getSrc69() throws CFException{      
   		return work.getSrc69();
	}

    public char[] getSrc69String() throws CFException {
          return  work.getSrc69().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src69 with the passed number
	 *	@param number
	 */
	public void setSrc69(BigDecimal number)  throws CFException{
		work.setSrc69(number);
   }

	public BigDecimal getSrc70() throws CFException{      
   		return work.getSrc70();
	}

    public char[] getSrc70String() throws CFException {
          return  work.getSrc70().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src70 with the passed number
	 *	@param number
	 */
	public void setSrc70(BigDecimal number)  throws CFException{
		work.setSrc70(number);
   }

	public BigDecimal getSrc71() throws CFException{      
   		return work.getSrc71();
	}

    public char[] getSrc71String() throws CFException {
          return  work.getSrc71().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src71 with the passed number
	 *	@param number
	 */
	public void setSrc71(BigDecimal number)  throws CFException{
		work.setSrc71(number);
   }

	public BigDecimal getTgt67() throws CFException{      
   		return work.getTgt67();
	}

    public char[] getTgt67String() throws CFException {
          return  work.getTgt67().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt67 with the passed number
	 *	@param number
	 */
	public void setTgt67(BigDecimal number)  throws CFException{
		work.setTgt67(number);
   }

	/**
	 *	Returns the value of src67
	 *	@return src67
	 */
	public BigDecimal getSrc67() throws CFException {
   		return work.getSrc67();
	}


	 /**
     *	Returns String value of src67
     *	@return src67
     */
    public char[]  getSrc67String() throws CFException {
         return work.getSrc67String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src67IsNumeric() {
        return work.src67IsNumeric();
    }
	/**
	 * 	Update Src67 with the passed number
	 *	@param number
	 */
	public void setSrc67(BigDecimal number)  throws CFException{
		work.setSrc67(number);
   }

	/**
	 * 	Update Src67 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc67(char[] value)  throws CFException{
		work.setSrc67(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process14Split72OutCtx clone() {
        Process14Split72OutCtx cloneObj = new Process14Split72OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process14Split72OutCtx getProcess14Split72OutCtx() {
            return new Process14Split72OutCtx();
    }
     public class Process15Split74OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt72
	 *	@return tgt72
	 */
	public BigDecimal getTgt72() throws CFException {
   		return work.getTgt72();
	}

    /**
	 *	Returns the String value of tgt72
	 *	@return tgt72
	 */
	public char[]  getTgt72ActualString()  throws CFException{
	    return work.getTgt72ActualString();
	}

	 /**
     *	Returns String value of tgt72
     *	@return tgt72
     */
    public char[]  getTgt72String() throws CFException {
         return work.getTgt72String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt72IsNumeric() {
        return work.tgt72IsNumeric();
    }
	/**
	 * 	Update Tgt72 with the passed number
	 *	@param number
	 */
	public void setTgt72(BigDecimal number)  throws CFException{
		work.setTgt72(number);
   }

	/**
	 * 	Update Tgt72 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt72(char[] value)  throws CFException{
		work.setTgt72(value);
	}   

	/**
	 *	Returns the value of tgt71
	 *	@return tgt71
	 */
	public BigDecimal getTgt71() throws CFException {
   		return work.getTgt71();
	}

    /**
	 *	Returns the String value of tgt71
	 *	@return tgt71
	 */
	public char[]  getTgt71ActualString()  throws CFException{
	    return work.getTgt71ActualString();
	}

	 /**
     *	Returns String value of tgt71
     *	@return tgt71
     */
    public char[]  getTgt71String() throws CFException {
         return work.getTgt71String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt71IsNumeric() {
        return work.tgt71IsNumeric();
    }
	/**
	 * 	Update Tgt71 with the passed number
	 *	@param number
	 */
	public void setTgt71(BigDecimal number)  throws CFException{
		work.setTgt71(number);
   }

	/**
	 * 	Update Tgt71 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt71(char[] value)  throws CFException{
		work.setTgt71(value);
	}   

	public BigDecimal getSrc73() throws CFException{      
   		return work.getSrc73();
	}

    public char[] getSrc73String() throws CFException {
          return  work.getSrc73().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src73 with the passed number
	 *	@param number
	 */
	public void setSrc73(BigDecimal number)  throws CFException{
		work.setSrc73(number);
   }

	/**
	 *	Returns the value of tgt73
	 *	@return tgt73
	 */
	public BigDecimal getTgt73() throws CFException {
   		return work.getTgt73();
	}


	 /**
     *	Returns String value of tgt73
     *	@return tgt73
     */
    public char[]  getTgt73String() throws CFException {
         return work.getTgt73String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt73IsNumeric() {
        return work.tgt73IsNumeric();
    }
	/**
	 * 	Update Tgt73 with the passed number
	 *	@param number
	 */
	public void setTgt73(BigDecimal number)  throws CFException{
		work.setTgt73(number);
   }

	/**
	 * 	Update Tgt73 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt73(char[] value)  throws CFException{
		work.setTgt73(value);
	}   

	/**
	 *	Returns the value of src75
	 *	@return src75
	 */
	public BigDecimal getSrc75() throws CFException {
   		return work.getSrc75();
	}

    /**
	 *	Returns the String value of src75
	 *	@return src75
	 */
	public char[]  getSrc75ActualString()  throws CFException{
	    return work.getSrc75ActualString();
	}

	 /**
     *	Returns String value of src75
     *	@return src75
     */
    public char[]  getSrc75String() throws CFException {
         return work.getSrc75String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src75IsNumeric() {
        return work.src75IsNumeric();
    }
	/**
	 * 	Update Src75 with the passed number
	 *	@param number
	 */
	public void setSrc75(BigDecimal number)  throws CFException{
		work.setSrc75(number);
   }

	/**
	 * 	Update Src75 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc75(char[] value)  throws CFException{
		work.setSrc75(value);
	}   

	public BigDecimal getSrc72() throws CFException{      
   		return work.getSrc72();
	}

    public char[] getSrc72String() throws CFException {
          return  work.getSrc72().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src72 with the passed number
	 *	@param number
	 */
	public void setSrc72(BigDecimal number)  throws CFException{
		work.setSrc72(number);
   }

	public BigDecimal getSrc71() throws CFException{      
   		return work.getSrc71();
	}

    public char[] getSrc71String() throws CFException {
          return  work.getSrc71().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src71 with the passed number
	 *	@param number
	 */
	public void setSrc71(BigDecimal number)  throws CFException{
		work.setSrc71(number);
   }

	/**
	 *	Returns the value of tgt75
	 *	@return tgt75
	 */
	public BigDecimal getTgt75() throws CFException {
   		return work.getTgt75();
	}


	 /**
     *	Returns String value of tgt75
     *	@return tgt75
     */
    public char[]  getTgt75String() throws CFException {
         return work.getTgt75String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt75IsNumeric() {
        return work.tgt75IsNumeric();
    }
	/**
	 * 	Update Tgt75 with the passed number
	 *	@param number
	 */
	public void setTgt75(BigDecimal number)  throws CFException{
		work.setTgt75(number);
   }

	/**
	 * 	Update Tgt75 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt75(char[] value)  throws CFException{
		work.setTgt75(value);
	}   

	public BigDecimal getSrc74() throws CFException{      
   		return work.getSrc74();
	}

    public char[] getSrc74String() throws CFException {
          return  work.getSrc74().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src74 with the passed number
	 *	@param number
	 */
	public void setSrc74(BigDecimal number)  throws CFException{
		work.setSrc74(number);
   }

	/**
	 *	Returns the value of tgt74
	 *	@return tgt74
	 */
	public BigDecimal getTgt74() throws CFException {
   		return work.getTgt74();
	}


	 /**
     *	Returns String value of tgt74
     *	@return tgt74
     */
    public char[]  getTgt74String() throws CFException {
         return work.getTgt74String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt74IsNumeric() {
        return work.tgt74IsNumeric();
    }
	/**
	 * 	Update Tgt74 with the passed number
	 *	@param number
	 */
	public void setTgt74(BigDecimal number)  throws CFException{
		work.setTgt74(number);
   }

	/**
	 * 	Update Tgt74 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt74(char[] value)  throws CFException{
		work.setTgt74(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process15Split74OutCtx clone() {
        Process15Split74OutCtx cloneObj = new Process15Split74OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process15Split74OutCtx getProcess15Split74OutCtx() {
            return new Process15Split74OutCtx();
    }
     public class Process16Split76OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src78
	 *	@return src78
	 */
	public BigDecimal getSrc78() throws CFException {
   		return work.getSrc78();
	}


	 /**
     *	Returns String value of src78
     *	@return src78
     */
    public char[]  getSrc78String() throws CFException {
         return work.getSrc78String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src78IsNumeric() {
        return work.src78IsNumeric();
    }
	/**
	 * 	Update Src78 with the passed number
	 *	@param number
	 */
	public void setSrc78(BigDecimal number)  throws CFException{
		work.setSrc78(number);
   }

	/**
	 * 	Update Src78 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc78(char[] value)  throws CFException{
		work.setSrc78(value);
	}   

	/**
	 *	Returns the value of tgt76
	 *	@return tgt76
	 */
	public BigDecimal getTgt76() throws CFException {
   		return work.getTgt76();
	}


	 /**
     *	Returns String value of tgt76
     *	@return tgt76
     */
    public char[]  getTgt76String() throws CFException {
         return work.getTgt76String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt76IsNumeric() {
        return work.tgt76IsNumeric();
    }
	/**
	 * 	Update Tgt76 with the passed number
	 *	@param number
	 */
	public void setTgt76(BigDecimal number)  throws CFException{
		work.setTgt76(number);
   }

	/**
	 * 	Update Tgt76 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt76(char[] value)  throws CFException{
		work.setTgt76(value);
	}   

	/**
	 *	Returns the value of tgt77
	 *	@return tgt77
	 */
	public BigDecimal getTgt77() throws CFException {
   		return work.getTgt77();
	}

    /**
	 *	Returns the String value of tgt77
	 *	@return tgt77
	 */
	public char[]  getTgt77ActualString()  throws CFException{
	    return work.getTgt77ActualString();
	}

	 /**
     *	Returns String value of tgt77
     *	@return tgt77
     */
    public char[]  getTgt77String() throws CFException {
         return work.getTgt77String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt77IsNumeric() {
        return work.tgt77IsNumeric();
    }
	/**
	 * 	Update Tgt77 with the passed number
	 *	@param number
	 */
	public void setTgt77(BigDecimal number)  throws CFException{
		work.setTgt77(number);
   }

	/**
	 * 	Update Tgt77 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt77(char[] value)  throws CFException{
		work.setTgt77(value);
	}   

	/**
	 *	Returns the value of tgt78
	 *	@return tgt78
	 */
	public BigDecimal getTgt78() throws CFException {
   		return work.getTgt78();
	}

    /**
	 *	Returns the String value of tgt78
	 *	@return tgt78
	 */
	public char[]  getTgt78ActualString()  throws CFException{
	    return work.getTgt78ActualString();
	}

	 /**
     *	Returns String value of tgt78
     *	@return tgt78
     */
    public char[]  getTgt78String() throws CFException {
         return work.getTgt78String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt78IsNumeric() {
        return work.tgt78IsNumeric();
    }
	/**
	 * 	Update Tgt78 with the passed number
	 *	@param number
	 */
	public void setTgt78(BigDecimal number)  throws CFException{
		work.setTgt78(number);
   }

	/**
	 * 	Update Tgt78 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt78(char[] value)  throws CFException{
		work.setTgt78(value);
	}   

	/**
	 *	Returns the value of src79
	 *	@return src79
	 */
	public BigDecimal getSrc79() throws CFException {
   		return work.getSrc79();
	}


	 /**
     *	Returns String value of src79
     *	@return src79
     */
    public char[]  getSrc79String() throws CFException {
         return work.getSrc79String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src79IsNumeric() {
        return work.src79IsNumeric();
    }
	/**
	 * 	Update Src79 with the passed number
	 *	@param number
	 */
	public void setSrc79(BigDecimal number)  throws CFException{
		work.setSrc79(number);
   }

	/**
	 * 	Update Src79 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc79(char[] value)  throws CFException{
		work.setSrc79(value);
	}   

	/**
	 *	Returns the value of src76
	 *	@return src76
	 */
	public BigDecimal getSrc76() throws CFException {
   		return work.getSrc76();
	}

    /**
	 *	Returns the String value of src76
	 *	@return src76
	 */
	public char[]  getSrc76ActualString()  throws CFException{
	    return work.getSrc76ActualString();
	}

	 /**
     *	Returns String value of src76
     *	@return src76
     */
    public char[]  getSrc76String() throws CFException {
         return work.getSrc76String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src76IsNumeric() {
        return work.src76IsNumeric();
    }
	/**
	 * 	Update Src76 with the passed number
	 *	@param number
	 */
	public void setSrc76(BigDecimal number)  throws CFException{
		work.setSrc76(number);
   }

	/**
	 * 	Update Src76 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc76(char[] value)  throws CFException{
		work.setSrc76(value);
	}   

	/**
	 *	Returns the value of src77
	 *	@return src77
	 */
	public BigDecimal getSrc77() throws CFException {
   		return work.getSrc77();
	}


	 /**
     *	Returns String value of src77
     *	@return src77
     */
    public char[]  getSrc77String() throws CFException {
         return work.getSrc77String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src77IsNumeric() {
        return work.src77IsNumeric();
    }
	/**
	 * 	Update Src77 with the passed number
	 *	@param number
	 */
	public void setSrc77(BigDecimal number)  throws CFException{
		work.setSrc77(number);
   }

	/**
	 * 	Update Src77 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc77(char[] value)  throws CFException{
		work.setSrc77(value);
	}   

	/**
	 *	Returns the value of tgt79
	 *	@return tgt79
	 */
	public BigDecimal getTgt79() throws CFException {
   		return work.getTgt79();
	}


	 /**
     *	Returns String value of tgt79
     *	@return tgt79
     */
    public char[]  getTgt79String() throws CFException {
         return work.getTgt79String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt79IsNumeric() {
        return work.tgt79IsNumeric();
    }
	/**
	 * 	Update Tgt79 with the passed number
	 *	@param number
	 */
	public void setTgt79(BigDecimal number)  throws CFException{
		work.setTgt79(number);
   }

	/**
	 * 	Update Tgt79 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt79(char[] value)  throws CFException{
		work.setTgt79(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process16Split76OutCtx clone() {
        Process16Split76OutCtx cloneObj = new Process16Split76OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process16Split76OutCtx getProcess16Split76OutCtx() {
            return new Process16Split76OutCtx();
    }
     public class Process17Split78InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src81
	 *	@return src81
	 */
	public int getSrc81() throws CFException {        
   		return work.getSrc81();
	}
	
	/**
	 * 	Update Src81 with the passed value
	 *	@param number
	 */
	public void setSrc81(int number)  throws CFException{
		work.setSrc81(number);
	}


	public void setSrc81(long number)  throws CFException{
		work.setSrc81((int)number);
	}


	/**
	 *	Returns the value of src83
	 *	@return src83
	 */
	public long getSrc83() throws CFException {        
   		return work.getSrc83();
	}
	
	/**
	 * 	Update Src83 with the passed value
	 *	@param number
	 */
	public void setSrc83(long number)  throws CFException{
		work.setSrc83(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process17Split78OutCtx getProcess17Split78OutCtx() {
            return new Process17Split78OutCtx();
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

    public Process17Split78InCtx clone() {
        Process17Split78InCtx cloneObj = new Process17Split78InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process17Split78InCtx getProcess17Split78InCtx() {
            return new Process17Split78InCtx();
    }
     public class Process17Split78OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src81
	 *	@return src81
	 */
	public int getSrc81() throws CFException {        
   		return work.getSrc81();
	}
	
	/**
	 * 	Update Src81 with the passed value
	 *	@param number
	 */
	public void setSrc81(int number)  throws CFException{
		work.setSrc81(number);
	}


	public void setSrc81(long number)  throws CFException{
		work.setSrc81((int)number);
	}


	/**
	 *	Returns the value of src82
	 *	@return src82
	 */
	public long getSrc82() throws CFException {        
   		return work.getSrc82();
	}
	
	/**
	 * 	Update Src82 with the passed value
	 *	@param number
	 */
	public void setSrc82(long number)  throws CFException{
		work.setSrc82(number);
	}



	/**
	 *	Returns the value of tgt82
	 *	@return tgt82
	 */
	public long getTgt82() throws CFException {
   		return work.getTgt82();
	}


	/**
	 *	Returns String value of tgt82
	 *	@return tgt82
	 */
	public char[]  getTgt82String() throws CFException {
	     return String.valueOf(work.getTgt82String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt82IsNumeric()  throws CFException{
	    return work.tgt82IsNumeric();
	}

	/**
	 * 	Update Tgt82 with the passed value
	 *	@param number
	 */
	public void setTgt82(long number)  throws CFException{
		work.setTgt82(number);
	}
	

	
	/**
	 * 	Update Tgt82 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt82(char[] value)  throws CFException {
		work.setTgt82(value);
	}
	
	/**
	 * 	Update Tgt82 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt82String(char[] value)  throws CFException{
		work.setTgt82(value);
	}	

	/**
	 *	Returns the value of src84
	 *	@return src84
	 */
	public long getSrc84() throws CFException {        
   		return work.getSrc84();
	}
	
	/**
	 * 	Update Src84 with the passed value
	 *	@param number
	 */
	public void setSrc84(long number)  throws CFException{
		work.setSrc84(number);
	}



	/**
	 *	Returns the value of src80
	 *	@return src80
	 */
	public BigDecimal getSrc80() throws CFException {
   		return work.getSrc80();
	}


	 /**
     *	Returns String value of src80
     *	@return src80
     */
    public char[]  getSrc80String() throws CFException {
         return work.getSrc80String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src80IsNumeric() {
        return work.src80IsNumeric();
    }
	/**
	 * 	Update Src80 with the passed number
	 *	@param number
	 */
	public void setSrc80(BigDecimal number)  throws CFException{
		work.setSrc80(number);
   }

	/**
	 * 	Update Src80 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc80(char[] value)  throws CFException{
		work.setSrc80(value);
	}   

	/**
	 *	Returns the value of tgt81
	 *	@return tgt81
	 */
	public long getTgt81() throws CFException {
   		return work.getTgt81();
	}


	/**
	 *	Returns String value of tgt81
	 *	@return tgt81
	 */
	public char[]  getTgt81String() throws CFException {
	     return String.valueOf(work.getTgt81String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt81IsNumeric()  throws CFException{
	    return work.tgt81IsNumeric();
	}

	/**
	 * 	Update Tgt81 with the passed value
	 *	@param number
	 */
	public void setTgt81(long number)  throws CFException{
		work.setTgt81(number);
	}
	

	
	/**
	 * 	Update Tgt81 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt81(char[] value)  throws CFException {
		work.setTgt81(value);
	}
	
	/**
	 * 	Update Tgt81 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt81String(char[] value)  throws CFException{
		work.setTgt81(value);
	}	

	/**
	 *	Returns the value of tgt80
	 *	@return tgt80
	 */
	public BigDecimal getTgt80() throws CFException {
   		return work.getTgt80();
	}


	 /**
     *	Returns String value of tgt80
     *	@return tgt80
     */
    public char[]  getTgt80String() throws CFException {
         return work.getTgt80String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt80IsNumeric() {
        return work.tgt80IsNumeric();
    }
	/**
	 * 	Update Tgt80 with the passed number
	 *	@param number
	 */
	public void setTgt80(BigDecimal number)  throws CFException{
		work.setTgt80(number);
   }

	/**
	 * 	Update Tgt80 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt80(char[] value)  throws CFException{
		work.setTgt80(value);
	}   

	/**
	 *	Returns the value of tgt83
	 *	@return tgt83
	 */
	public long getTgt83() throws CFException {
   		return work.getTgt83();
	}


	/**
	 *	Returns String value of tgt83
	 *	@return tgt83
	 */
	public char[]  getTgt83String() throws CFException {
	     return String.valueOf(work.getTgt83String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt83IsNumeric()  throws CFException{
	    return work.tgt83IsNumeric();
	}

	/**
	 * 	Update Tgt83 with the passed value
	 *	@param number
	 */
	public void setTgt83(long number)  throws CFException{
		work.setTgt83(number);
	}
	

	
	/**
	 * 	Update Tgt83 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt83(char[] value)  throws CFException {
		work.setTgt83(value);
	}
	
	/**
	 * 	Update Tgt83 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt83String(char[] value)  throws CFException{
		work.setTgt83(value);
	}	

	/**
	 *	Returns the value of tgt84
	 *	@return tgt84
	 */
	public long getTgt84() throws CFException {
   		return work.getTgt84();
	}


	/**
	 *	Returns String value of tgt84
	 *	@return tgt84
	 */
	public char[]  getTgt84String() throws CFException {
	     return String.valueOf(work.getTgt84String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt84IsNumeric()  throws CFException{
	    return work.tgt84IsNumeric();
	}

	/**
	 * 	Update Tgt84 with the passed value
	 *	@param number
	 */
	public void setTgt84(long number)  throws CFException{
		work.setTgt84(number);
	}
	

	
	/**
	 * 	Update Tgt84 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt84(char[] value)  throws CFException {
		work.setTgt84(value);
	}
	
	/**
	 * 	Update Tgt84 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt84String(char[] value)  throws CFException{
		work.setTgt84(value);
	}	

	/**
	 *	Returns the value of src83
	 *	@return src83
	 */
	public long getSrc83() throws CFException {        
   		return work.getSrc83();
	}
	
	/**
	 * 	Update Src83 with the passed value
	 *	@param number
	 */
	public void setSrc83(long number)  throws CFException{
		work.setSrc83(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process17Split78OutCtx clone() {
        Process17Split78OutCtx cloneObj = new Process17Split78OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process17Split78OutCtx getProcess17Split78OutCtx() {
            return new Process17Split78OutCtx();
    }
     public class Process18Split80InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src87
	 *	@return src87
	 */
	public long getSrc87() throws CFException {
   		return work.getSrc87();
	}


	/**
	 *	Returns String value of src87
	 *	@return src87
	 */
	public char[]  getSrc87String() throws CFException {
	     return String.valueOf(work.getSrc87String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src87IsNumeric()  throws CFException{
	    return work.src87IsNumeric();
	}

	/**
	 * 	Update Src87 with the passed value
	 *	@param number
	 */
	public void setSrc87(long number)  throws CFException{
		work.setSrc87(number);
	}
	

	
	/**
	 * 	Update Src87 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc87(char[] value)  throws CFException {
		work.setSrc87(value);
	}
	
	/**
	 * 	Update Src87 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc87String(char[] value)  throws CFException{
		work.setSrc87(value);
	}	

	/**
	 *	Returns the value of src88
	 *	@return src88
	 */
	public int getSrc88() throws CFException {
   		return work.getSrc88();
	}

    /**
	 *	Returns the String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88ActualString() {
		return work.getSrc88ActualString();
	}

	/**
	 *	Returns String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88String() throws CFException {
	     return String.valueOf(work.getSrc88String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src88IsNumeric()  throws CFException{
	    return work.src88IsNumeric();
	}

	/**
	 * 	Update Src88 with the passed value
	 *	@param number
	 */
	public void setSrc88(int number)  throws CFException{
		work.setSrc88(number);
	}
	

	public void setSrc88(long number)  throws CFException{
	    work.setSrc88(number);
	}
	
	
	/**
	 * 	Update Src88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc88(char[] value)  throws CFException {
		work.setSrc88(value);
	}
	
	/**
	 * 	Update Src88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc88String(char[] value)  throws CFException{
		work.setSrc88(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process18Split80OutCtx getProcess18Split80OutCtx() {
            return new Process18Split80OutCtx();
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

    public Process18Split80InCtx clone() {
        Process18Split80InCtx cloneObj = new Process18Split80InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process18Split80InCtx getProcess18Split80InCtx() {
            return new Process18Split80InCtx();
    }
     public class Process18Split80OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt88
	 *	@return tgt88
	 */
	public long getTgt88() throws CFException {
   		return work.getTgt88();
	}


	/**
	 *	Returns String value of tgt88
	 *	@return tgt88
	 */
	public char[]  getTgt88String() throws CFException {
	     return String.valueOf(work.getTgt88String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt88IsNumeric()  throws CFException{
	    return work.tgt88IsNumeric();
	}

	/**
	 * 	Update Tgt88 with the passed value
	 *	@param number
	 */
	public void setTgt88(long number)  throws CFException{
		work.setTgt88(number);
	}
	

	
	/**
	 * 	Update Tgt88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt88(char[] value)  throws CFException {
		work.setTgt88(value);
	}
	
	/**
	 * 	Update Tgt88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt88String(char[] value)  throws CFException{
		work.setTgt88(value);
	}	

	/**
	 *	Returns the value of tgt86
	 *	@return tgt86
	 */
	public long getTgt86() throws CFException {
   		return work.getTgt86();
	}


	/**
	 *	Returns String value of tgt86
	 *	@return tgt86
	 */
	public char[]  getTgt86String() throws CFException {
	     return String.valueOf(work.getTgt86String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt86IsNumeric()  throws CFException{
	    return work.tgt86IsNumeric();
	}

	/**
	 * 	Update Tgt86 with the passed value
	 *	@param number
	 */
	public void setTgt86(long number)  throws CFException{
		work.setTgt86(number);
	}
	

	
	/**
	 * 	Update Tgt86 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt86(char[] value)  throws CFException {
		work.setTgt86(value);
	}
	
	/**
	 * 	Update Tgt86 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt86String(char[] value)  throws CFException{
		work.setTgt86(value);
	}	

	/**
	 *	Returns the value of src87
	 *	@return src87
	 */
	public long getSrc87() throws CFException {
   		return work.getSrc87();
	}


	/**
	 *	Returns String value of src87
	 *	@return src87
	 */
	public char[]  getSrc87String() throws CFException {
	     return String.valueOf(work.getSrc87String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src87IsNumeric()  throws CFException{
	    return work.src87IsNumeric();
	}

	/**
	 * 	Update Src87 with the passed value
	 *	@param number
	 */
	public void setSrc87(long number)  throws CFException{
		work.setSrc87(number);
	}
	

	
	/**
	 * 	Update Src87 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc87(char[] value)  throws CFException {
		work.setSrc87(value);
	}
	
	/**
	 * 	Update Src87 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc87String(char[] value)  throws CFException{
		work.setSrc87(value);
	}	

	/**
	 *	Returns the value of src88
	 *	@return src88
	 */
	public int getSrc88() throws CFException {
   		return work.getSrc88();
	}

    /**
	 *	Returns the String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88ActualString() {
		return work.getSrc88ActualString();
	}

	/**
	 *	Returns String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88String() throws CFException {
	     return String.valueOf(work.getSrc88String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src88IsNumeric()  throws CFException{
	    return work.src88IsNumeric();
	}

	/**
	 * 	Update Src88 with the passed value
	 *	@param number
	 */
	public void setSrc88(int number)  throws CFException{
		work.setSrc88(number);
	}
	

	public void setSrc88(long number)  throws CFException{
	    work.setSrc88(number);
	}
	
	
	/**
	 * 	Update Src88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc88(char[] value)  throws CFException {
		work.setSrc88(value);
	}
	
	/**
	 * 	Update Src88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc88String(char[] value)  throws CFException{
		work.setSrc88(value);
	}	

	/**
	 *	Returns the value of src84
	 *	@return src84
	 */
	public long getSrc84() throws CFException {        
   		return work.getSrc84();
	}
	
	/**
	 * 	Update Src84 with the passed value
	 *	@param number
	 */
	public void setSrc84(long number)  throws CFException{
		work.setSrc84(number);
	}



	/**
	 *	Returns the value of tgt85
	 *	@return tgt85
	 */
	public long getTgt85() throws CFException {
   		return work.getTgt85();
	}


	/**
	 *	Returns String value of tgt85
	 *	@return tgt85
	 */
	public char[]  getTgt85String() throws CFException {
	     return String.valueOf(work.getTgt85String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt85IsNumeric()  throws CFException{
	    return work.tgt85IsNumeric();
	}

	/**
	 * 	Update Tgt85 with the passed value
	 *	@param number
	 */
	public void setTgt85(long number)  throws CFException{
		work.setTgt85(number);
	}
	

	
	/**
	 * 	Update Tgt85 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt85(char[] value)  throws CFException {
		work.setTgt85(value);
	}
	
	/**
	 * 	Update Tgt85 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt85String(char[] value)  throws CFException{
		work.setTgt85(value);
	}	

	/**
	 *	Returns the value of src85
	 *	@return src85
	 */
	public short getSrc85() throws CFException {        
   		return work.getSrc85();
	}
	
	/**
	 * 	Update Src85 with the passed value
	 *	@param number
	 */
	public void setSrc85(short number)  throws CFException{
		work.setSrc85(number);
	}

	public void setSrc85(int number)  throws CFException{
		work.setSrc85((short)number);
	}

	public void setSrc85(long number)  throws CFException{
		work.setSrc85((short)number);
	}



	/**
	 *	Returns the value of src86
	 *	@return src86
	 */
	public int getSrc86() throws CFException {        
   		return work.getSrc86();
	}
	
	/**
	 * 	Update Src86 with the passed value
	 *	@param number
	 */
	public void setSrc86(int number)  throws CFException{
		work.setSrc86(number);
	}


	public void setSrc86(long number)  throws CFException{
		work.setSrc86((int)number);
	}


	/**
	 *	Returns the value of tgt87
	 *	@return tgt87
	 */
	public long getTgt87() throws CFException {
   		return work.getTgt87();
	}


	/**
	 *	Returns String value of tgt87
	 *	@return tgt87
	 */
	public char[]  getTgt87String() throws CFException {
	     return String.valueOf(work.getTgt87String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt87IsNumeric()  throws CFException{
	    return work.tgt87IsNumeric();
	}

	/**
	 * 	Update Tgt87 with the passed value
	 *	@param number
	 */
	public void setTgt87(long number)  throws CFException{
		work.setTgt87(number);
	}
	

	
	/**
	 * 	Update Tgt87 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt87(char[] value)  throws CFException {
		work.setTgt87(value);
	}
	
	/**
	 * 	Update Tgt87 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt87String(char[] value)  throws CFException{
		work.setTgt87(value);
	}	

	/**
	 *	Returns the value of tgt84
	 *	@return tgt84
	 */
	public long getTgt84() throws CFException {
   		return work.getTgt84();
	}


	/**
	 *	Returns String value of tgt84
	 *	@return tgt84
	 */
	public char[]  getTgt84String() throws CFException {
	     return String.valueOf(work.getTgt84String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt84IsNumeric()  throws CFException{
	    return work.tgt84IsNumeric();
	}

	/**
	 * 	Update Tgt84 with the passed value
	 *	@param number
	 */
	public void setTgt84(long number)  throws CFException{
		work.setTgt84(number);
	}
	

	
	/**
	 * 	Update Tgt84 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt84(char[] value)  throws CFException {
		work.setTgt84(value);
	}
	
	/**
	 * 	Update Tgt84 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt84String(char[] value)  throws CFException{
		work.setTgt84(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process18Split80OutCtx clone() {
        Process18Split80OutCtx cloneObj = new Process18Split80OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process18Split80OutCtx getProcess18Split80OutCtx() {
            return new Process18Split80OutCtx();
    }
     public class Process19Split82InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src88
	 *	@return src88
	 */
	public int getSrc88() throws CFException {
   		return work.getSrc88();
	}

    /**
	 *	Returns the String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88ActualString() {
		return work.getSrc88ActualString();
	}

	/**
	 *	Returns String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88String() throws CFException {
	     return String.valueOf(work.getSrc88String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src88IsNumeric()  throws CFException{
	    return work.src88IsNumeric();
	}

	/**
	 * 	Update Src88 with the passed value
	 *	@param number
	 */
	public void setSrc88(int number)  throws CFException{
		work.setSrc88(number);
	}
	

	public void setSrc88(long number)  throws CFException{
	    work.setSrc88(number);
	}
	
	
	/**
	 * 	Update Src88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc88(char[] value)  throws CFException {
		work.setSrc88(value);
	}
	
	/**
	 * 	Update Src88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc88String(char[] value)  throws CFException{
		work.setSrc88(value);
	}	

	/**
	 *	Returns the value of src89
	 *	@return src89
	 */
	public long getSrc89() throws CFException {
   		return work.getSrc89();
	}


	/**
	 *	Returns String value of src89
	 *	@return src89
	 */
	public char[]  getSrc89String() throws CFException {
	     return String.valueOf(work.getSrc89String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src89IsNumeric()  throws CFException{
	    return work.src89IsNumeric();
	}

	/**
	 * 	Update Src89 with the passed value
	 *	@param number
	 */
	public void setSrc89(long number)  throws CFException{
		work.setSrc89(number);
	}
	

	
	/**
	 * 	Update Src89 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc89(char[] value)  throws CFException {
		work.setSrc89(value);
	}
	
	/**
	 * 	Update Src89 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc89String(char[] value)  throws CFException{
		work.setSrc89(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process19Split82OutCtx getProcess19Split82OutCtx() {
            return new Process19Split82OutCtx();
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

    public Process19Split82InCtx clone() {
        Process19Split82InCtx cloneObj = new Process19Split82InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process19Split82InCtx getProcess19Split82InCtx() {
            return new Process19Split82InCtx();
    }
     public class Process19Split82OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt88
	 *	@return tgt88
	 */
	public long getTgt88() throws CFException {
   		return work.getTgt88();
	}


	/**
	 *	Returns String value of tgt88
	 *	@return tgt88
	 */
	public char[]  getTgt88String() throws CFException {
	     return String.valueOf(work.getTgt88String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt88IsNumeric()  throws CFException{
	    return work.tgt88IsNumeric();
	}

	/**
	 * 	Update Tgt88 with the passed value
	 *	@param number
	 */
	public void setTgt88(long number)  throws CFException{
		work.setTgt88(number);
	}
	

	
	/**
	 * 	Update Tgt88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt88(char[] value)  throws CFException {
		work.setTgt88(value);
	}
	
	/**
	 * 	Update Tgt88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt88String(char[] value)  throws CFException{
		work.setTgt88(value);
	}	

	/**
	 *	Returns the value of src91
	 *	@return src91
	 */
	public long getSrc91() throws CFException {
   		return work.getSrc91();
	}


	/**
	 *	Returns String value of src91
	 *	@return src91
	 */
	public char[]  getSrc91String() throws CFException {
	     return String.valueOf(work.getSrc91String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src91IsNumeric()  throws CFException{
	    return work.src91IsNumeric();
	}

	/**
	 * 	Update Src91 with the passed value
	 *	@param number
	 */
	public void setSrc91(long number)  throws CFException{
		work.setSrc91(number);
	}
	

	
	/**
	 * 	Update Src91 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc91(char[] value)  throws CFException {
		work.setSrc91(value);
	}
	
	/**
	 * 	Update Src91 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc91String(char[] value)  throws CFException{
		work.setSrc91(value);
	}	

	/**
	 *	Returns the value of src88
	 *	@return src88
	 */
	public int getSrc88() throws CFException {
   		return work.getSrc88();
	}

    /**
	 *	Returns the String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88ActualString() {
		return work.getSrc88ActualString();
	}

	/**
	 *	Returns String value of src88
	 *	@return src88
	 */
	public char[]  getSrc88String() throws CFException {
	     return String.valueOf(work.getSrc88String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src88IsNumeric()  throws CFException{
	    return work.src88IsNumeric();
	}

	/**
	 * 	Update Src88 with the passed value
	 *	@param number
	 */
	public void setSrc88(int number)  throws CFException{
		work.setSrc88(number);
	}
	

	public void setSrc88(long number)  throws CFException{
	    work.setSrc88(number);
	}
	
	
	/**
	 * 	Update Src88 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc88(char[] value)  throws CFException {
		work.setSrc88(value);
	}
	
	/**
	 * 	Update Src88 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc88String(char[] value)  throws CFException{
		work.setSrc88(value);
	}	

	/**
	 *	Returns the value of src89
	 *	@return src89
	 */
	public long getSrc89() throws CFException {
   		return work.getSrc89();
	}


	/**
	 *	Returns String value of src89
	 *	@return src89
	 */
	public char[]  getSrc89String() throws CFException {
	     return String.valueOf(work.getSrc89String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src89IsNumeric()  throws CFException{
	    return work.src89IsNumeric();
	}

	/**
	 * 	Update Src89 with the passed value
	 *	@param number
	 */
	public void setSrc89(long number)  throws CFException{
		work.setSrc89(number);
	}
	

	
	/**
	 * 	Update Src89 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc89(char[] value)  throws CFException {
		work.setSrc89(value);
	}
	
	/**
	 * 	Update Src89 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc89String(char[] value)  throws CFException{
		work.setSrc89(value);
	}	

	/**
	 *	Returns the value of tgt89
	 *	@return tgt89
	 */
	public int getTgt89() throws CFException {        
   		return work.getTgt89();
	}
	
	/**
	 * 	Update Tgt89 with the passed value
	 *	@param number
	 */
	public void setTgt89(int number)  throws CFException{
		work.setTgt89(number);
	}


	public void setTgt89(long number)  throws CFException{
		work.setTgt89((int)number);
	}


	/**
	 *	Returns the value of tgt90
	 *	@return tgt90
	 */
	public long getTgt90() throws CFException {        
   		return work.getTgt90();
	}
	
	/**
	 * 	Update Tgt90 with the passed value
	 *	@param number
	 */
	public void setTgt90(long number)  throws CFException{
		work.setTgt90(number);
	}



	/**
	 *	Returns the value of src90
	 *	@return src90
	 */
	public long getSrc90() throws CFException {
   		return work.getSrc90();
	}


	/**
	 *	Returns String value of src90
	 *	@return src90
	 */
	public char[]  getSrc90String() throws CFException {
	     return String.valueOf(work.getSrc90String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src90IsNumeric()  throws CFException{
	    return work.src90IsNumeric();
	}

	/**
	 * 	Update Src90 with the passed value
	 *	@param number
	 */
	public void setSrc90(long number)  throws CFException{
		work.setSrc90(number);
	}
	

	
	/**
	 * 	Update Src90 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc90(char[] value)  throws CFException {
		work.setSrc90(value);
	}
	
	/**
	 * 	Update Src90 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc90String(char[] value)  throws CFException{
		work.setSrc90(value);
	}	

	/**
	 *	Returns the value of tgt92
	 *	@return tgt92
	 */
	public long getTgt92() throws CFException {        
   		return work.getTgt92();
	}
	
	/**
	 * 	Update Tgt92 with the passed value
	 *	@param number
	 */
	public void setTgt92(long number)  throws CFException{
		work.setTgt92(number);
	}



	/**
	 *	Returns the value of src92
	 *	@return src92
	 */
	public long getSrc92() throws CFException {
   		return work.getSrc92();
	}


	/**
	 *	Returns String value of src92
	 *	@return src92
	 */
	public char[]  getSrc92String() throws CFException {
	     return String.valueOf(work.getSrc92String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src92IsNumeric()  throws CFException{
	    return work.src92IsNumeric();
	}

	/**
	 * 	Update Src92 with the passed value
	 *	@param number
	 */
	public void setSrc92(long number)  throws CFException{
		work.setSrc92(number);
	}
	

	
	/**
	 * 	Update Src92 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc92(char[] value)  throws CFException {
		work.setSrc92(value);
	}
	
	/**
	 * 	Update Src92 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc92String(char[] value)  throws CFException{
		work.setSrc92(value);
	}	

	/**
	 *	Returns the value of tgt91
	 *	@return tgt91
	 */
	public long getTgt91() throws CFException {        
   		return work.getTgt91();
	}
	
	/**
	 * 	Update Tgt91 with the passed value
	 *	@param number
	 */
	public void setTgt91(long number)  throws CFException{
		work.setTgt91(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process19Split82OutCtx clone() {
        Process19Split82OutCtx cloneObj = new Process19Split82OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process19Split82OutCtx getProcess19Split82OutCtx() {
            return new Process19Split82OutCtx();
    }
     public class Process20Split84InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src95
	 *	@return src95
	 */
	public long getSrc95() throws CFException {
   		return work.getSrc95();
	}


	/**
	 *	Returns String value of src95
	 *	@return src95
	 */
	public char[]  getSrc95String() throws CFException {
	     return String.valueOf(work.getSrc95String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src95IsNumeric()  throws CFException{
	    return work.src95IsNumeric();
	}

	/**
	 * 	Update Src95 with the passed value
	 *	@param number
	 */
	public void setSrc95(long number)  throws CFException{
		work.setSrc95(number);
	}
	

	
	/**
	 * 	Update Src95 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc95(char[] value)  throws CFException {
		work.setSrc95(value);
	}
	
	/**
	 * 	Update Src95 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc95String(char[] value)  throws CFException{
		work.setSrc95(value);
	}	

	/**
	 *	Returns the value of src96
	 *	@return src96
	 */
	public long getSrc96() throws CFException {
   		return work.getSrc96();
	}


	/**
	 *	Returns String value of src96
	 *	@return src96
	 */
	public char[]  getSrc96String() throws CFException {
	     return String.valueOf(work.getSrc96String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src96IsNumeric()  throws CFException{
	    return work.src96IsNumeric();
	}

	/**
	 * 	Update Src96 with the passed value
	 *	@param number
	 */
	public void setSrc96(long number)  throws CFException{
		work.setSrc96(number);
	}
	

	
	/**
	 * 	Update Src96 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc96(char[] value)  throws CFException {
		work.setSrc96(value);
	}
	
	/**
	 * 	Update Src96 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc96String(char[] value)  throws CFException{
		work.setSrc96(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process20Split84OutCtx getProcess20Split84OutCtx() {
            return new Process20Split84OutCtx();
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

    public Process20Split84InCtx clone() {
        Process20Split84InCtx cloneObj = new Process20Split84InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process20Split84InCtx getProcess20Split84InCtx() {
            return new Process20Split84InCtx();
    }
     public class Process20Split84OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src94
	 *	@return src94
	 */
	public long getSrc94() throws CFException {
   		return work.getSrc94();
	}


	/**
	 *	Returns String value of src94
	 *	@return src94
	 */
	public char[]  getSrc94String() throws CFException {
	     return String.valueOf(work.getSrc94String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src94IsNumeric()  throws CFException{
	    return work.src94IsNumeric();
	}

	/**
	 * 	Update Src94 with the passed value
	 *	@param number
	 */
	public void setSrc94(long number)  throws CFException{
		work.setSrc94(number);
	}
	

	
	/**
	 * 	Update Src94 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc94(char[] value)  throws CFException {
		work.setSrc94(value);
	}
	
	/**
	 * 	Update Src94 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc94String(char[] value)  throws CFException{
		work.setSrc94(value);
	}	

	/**
	 *	Returns the value of tgt95
	 *	@return tgt95
	 */
	public long getTgt95() throws CFException {
   		return work.getTgt95();
	}


	/**
	 *	Returns String value of tgt95
	 *	@return tgt95
	 */
	public char[]  getTgt95String() throws CFException {
	     return String.valueOf(work.getTgt95String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt95IsNumeric()  throws CFException{
	    return work.tgt95IsNumeric();
	}

	/**
	 * 	Update Tgt95 with the passed value
	 *	@param number
	 */
	public void setTgt95(long number)  throws CFException{
		work.setTgt95(number);
	}
	

	
	/**
	 * 	Update Tgt95 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt95(char[] value)  throws CFException {
		work.setTgt95(value);
	}
	
	/**
	 * 	Update Tgt95 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt95String(char[] value)  throws CFException{
		work.setTgt95(value);
	}	

	/**
	 *	Returns the value of src93
	 *	@return src93
	 */
	public long getSrc93() throws CFException {
   		return work.getSrc93();
	}


	/**
	 *	Returns String value of src93
	 *	@return src93
	 */
	public char[]  getSrc93String() throws CFException {
	     return String.valueOf(work.getSrc93String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src93IsNumeric()  throws CFException{
	    return work.src93IsNumeric();
	}

	/**
	 * 	Update Src93 with the passed value
	 *	@param number
	 */
	public void setSrc93(long number)  throws CFException{
		work.setSrc93(number);
	}
	

	
	/**
	 * 	Update Src93 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc93(char[] value)  throws CFException {
		work.setSrc93(value);
	}
	
	/**
	 * 	Update Src93 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc93String(char[] value)  throws CFException{
		work.setSrc93(value);
	}	

	/**
	 *	Returns the value of tgt94
	 *	@return tgt94
	 */
	public int getTgt94() throws CFException {        
   		return work.getTgt94();
	}
	
	/**
	 * 	Update Tgt94 with the passed value
	 *	@param number
	 */
	public void setTgt94(int number)  throws CFException{
		work.setTgt94(number);
	}


	public void setTgt94(long number)  throws CFException{
		work.setTgt94((int)number);
	}


	/**
	 *	Returns the value of src95
	 *	@return src95
	 */
	public long getSrc95() throws CFException {
   		return work.getSrc95();
	}


	/**
	 *	Returns String value of src95
	 *	@return src95
	 */
	public char[]  getSrc95String() throws CFException {
	     return String.valueOf(work.getSrc95String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src95IsNumeric()  throws CFException{
	    return work.src95IsNumeric();
	}

	/**
	 * 	Update Src95 with the passed value
	 *	@param number
	 */
	public void setSrc95(long number)  throws CFException{
		work.setSrc95(number);
	}
	

	
	/**
	 * 	Update Src95 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc95(char[] value)  throws CFException {
		work.setSrc95(value);
	}
	
	/**
	 * 	Update Src95 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc95String(char[] value)  throws CFException{
		work.setSrc95(value);
	}	

	/**
	 *	Returns the value of src96
	 *	@return src96
	 */
	public long getSrc96() throws CFException {
   		return work.getSrc96();
	}


	/**
	 *	Returns String value of src96
	 *	@return src96
	 */
	public char[]  getSrc96String() throws CFException {
	     return String.valueOf(work.getSrc96String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src96IsNumeric()  throws CFException{
	    return work.src96IsNumeric();
	}

	/**
	 * 	Update Src96 with the passed value
	 *	@param number
	 */
	public void setSrc96(long number)  throws CFException{
		work.setSrc96(number);
	}
	

	
	/**
	 * 	Update Src96 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc96(char[] value)  throws CFException {
		work.setSrc96(value);
	}
	
	/**
	 * 	Update Src96 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc96String(char[] value)  throws CFException{
		work.setSrc96(value);
	}	

	/**
	 *	Returns the value of tgt96
	 *	@return tgt96
	 */
	public int getTgt96() throws CFException {
   		return work.getTgt96();
	}

    /**
	 *	Returns the String value of tgt96
	 *	@return tgt96
	 */
	public char[]  getTgt96ActualString() {
		return work.getTgt96ActualString();
	}

	/**
	 *	Returns String value of tgt96
	 *	@return tgt96
	 */
	public char[]  getTgt96String() throws CFException {
	     return String.valueOf(work.getTgt96String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt96IsNumeric()  throws CFException{
	    return work.tgt96IsNumeric();
	}

	/**
	 * 	Update Tgt96 with the passed value
	 *	@param number
	 */
	public void setTgt96(int number)  throws CFException{
		work.setTgt96(number);
	}
	

	public void setTgt96(long number)  throws CFException{
	    work.setTgt96(number);
	}
	
	
	/**
	 * 	Update Tgt96 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt96(char[] value)  throws CFException {
		work.setTgt96(value);
	}
	
	/**
	 * 	Update Tgt96 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt96String(char[] value)  throws CFException{
		work.setTgt96(value);
	}	

	/**
	 *	Returns the value of tgt93
	 *	@return tgt93
	 */
	public short getTgt93() throws CFException {        
   		return work.getTgt93();
	}
	
	/**
	 * 	Update Tgt93 with the passed value
	 *	@param number
	 */
	public void setTgt93(short number)  throws CFException{
		work.setTgt93(number);
	}

	public void setTgt93(int number)  throws CFException{
		work.setTgt93((short)number);
	}

	public void setTgt93(long number)  throws CFException{
		work.setTgt93((short)number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process20Split84OutCtx clone() {
        Process20Split84OutCtx cloneObj = new Process20Split84OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process20Split84OutCtx getProcess20Split84OutCtx() {
            return new Process20Split84OutCtx();
    }
     public class Process21Split86InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src99
	 *	@return src99
	 */
	public long getSrc99() throws CFException {
   		return work.getSrc99();
	}

    /**
	 *	Returns the String value of src99
	 *	@return src99
	 */
	public char[]  getSrc99ActualString() {
		return work.getSrc99ActualString();
	}

	/**
	 *	Returns String value of src99
	 *	@return src99
	 */
	public char[]  getSrc99String() throws CFException {
	     return String.valueOf(work.getSrc99String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src99IsNumeric()  throws CFException{
	    return work.src99IsNumeric();
	}

	/**
	 * 	Update Src99 with the passed value
	 *	@param number
	 */
	public void setSrc99(long number)  throws CFException{
		work.setSrc99(number);
	}
	

	
	/**
	 * 	Update Src99 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc99(char[] value)  throws CFException {
		work.setSrc99(value);
	}
	
	/**
	 * 	Update Src99 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc99String(char[] value)  throws CFException{
		work.setSrc99(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process21Split86OutCtx getProcess21Split86OutCtx() {
            return new Process21Split86OutCtx();
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

    public Process21Split86InCtx clone() {
        Process21Split86InCtx cloneObj = new Process21Split86InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process21Split86InCtx getProcess21Split86InCtx() {
            return new Process21Split86InCtx();
    }
     public class Process21Split86OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt98
	 *	@return tgt98
	 */
	public long getTgt98() throws CFException {        
   		return work.getTgt98();
	}
	
	/**
	 * 	Update Tgt98 with the passed value
	 *	@param number
	 */
	public void setTgt98(long number)  throws CFException{
		work.setTgt98(number);
	}



	/**
	 *	Returns the value of tgt97
	 *	@return tgt97
	 */
	public int getTgt97() throws CFException {        
   		return work.getTgt97();
	}
	
	/**
	 * 	Update Tgt97 with the passed value
	 *	@param number
	 */
	public void setTgt97(int number)  throws CFException{
		work.setTgt97(number);
	}


	public void setTgt97(long number)  throws CFException{
		work.setTgt97((int)number);
	}


	/**
	 *	Returns the value of tgt101
	 *	@return tgt101
	 */
	public short getTgt101() throws CFException {        
   		return work.getTgt101();
	}
	
	/**
	 * 	Update Tgt101 with the passed value
	 *	@param number
	 */
	public void setTgt101(short number)  throws CFException{
		work.setTgt101(number);
	}

	public void setTgt101(int number)  throws CFException{
		work.setTgt101((short)number);
	}

	public void setTgt101(long number)  throws CFException{
		work.setTgt101((short)number);
	}



	/**
	 *	Returns the value of tgt100
	 *	@return tgt100
	 */
	public long getTgt100() throws CFException {        
   		return work.getTgt100();
	}
	
	/**
	 * 	Update Tgt100 with the passed value
	 *	@param number
	 */
	public void setTgt100(long number)  throws CFException{
		work.setTgt100(number);
	}



	/**
	 *	Returns the value of src98
	 *	@return src98
	 */
	public long getSrc98() throws CFException {
   		return work.getSrc98();
	}

    /**
	 *	Returns the String value of src98
	 *	@return src98
	 */
	public char[]  getSrc98ActualString() {
		return work.getSrc98ActualString();
	}

	/**
	 *	Returns String value of src98
	 *	@return src98
	 */
	public char[]  getSrc98String() throws CFException {
	     return String.valueOf(work.getSrc98String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src98IsNumeric()  throws CFException{
	    return work.src98IsNumeric();
	}

	/**
	 * 	Update Src98 with the passed value
	 *	@param number
	 */
	public void setSrc98(long number)  throws CFException{
		work.setSrc98(number);
	}
	

	
	/**
	 * 	Update Src98 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc98(char[] value)  throws CFException {
		work.setSrc98(value);
	}
	
	/**
	 * 	Update Src98 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc98String(char[] value)  throws CFException{
		work.setSrc98(value);
	}	

	/**
	 *	Returns the value of tgt99
	 *	@return tgt99
	 */
	public long getTgt99() throws CFException {        
   		return work.getTgt99();
	}
	
	/**
	 * 	Update Tgt99 with the passed value
	 *	@param number
	 */
	public void setTgt99(long number)  throws CFException{
		work.setTgt99(number);
	}



	/**
	 *	Returns the value of src101
	 *	@return src101
	 */
	public long getSrc101() throws CFException {
   		return work.getSrc101();
	}

    /**
	 *	Returns the String value of src101
	 *	@return src101
	 */
	public char[]  getSrc101ActualString() {
		return work.getSrc101ActualString();
	}

	/**
	 *	Returns String value of src101
	 *	@return src101
	 */
	public char[]  getSrc101String() throws CFException {
	     return String.valueOf(work.getSrc101String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src101IsNumeric()  throws CFException{
	    return work.src101IsNumeric();
	}

	/**
	 * 	Update Src101 with the passed value
	 *	@param number
	 */
	public void setSrc101(long number)  throws CFException{
		work.setSrc101(number);
	}
	

	
	/**
	 * 	Update Src101 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc101(char[] value)  throws CFException {
		work.setSrc101(value);
	}
	
	/**
	 * 	Update Src101 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc101String(char[] value)  throws CFException{
		work.setSrc101(value);
	}	

	/**
	 *	Returns the value of src99
	 *	@return src99
	 */
	public long getSrc99() throws CFException {
   		return work.getSrc99();
	}

    /**
	 *	Returns the String value of src99
	 *	@return src99
	 */
	public char[]  getSrc99ActualString() {
		return work.getSrc99ActualString();
	}

	/**
	 *	Returns String value of src99
	 *	@return src99
	 */
	public char[]  getSrc99String() throws CFException {
	     return String.valueOf(work.getSrc99String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src99IsNumeric()  throws CFException{
	    return work.src99IsNumeric();
	}

	/**
	 * 	Update Src99 with the passed value
	 *	@param number
	 */
	public void setSrc99(long number)  throws CFException{
		work.setSrc99(number);
	}
	

	
	/**
	 * 	Update Src99 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc99(char[] value)  throws CFException {
		work.setSrc99(value);
	}
	
	/**
	 * 	Update Src99 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc99String(char[] value)  throws CFException{
		work.setSrc99(value);
	}	

	/**
	 *	Returns the value of src97
	 *	@return src97
	 */
	public long getSrc97() throws CFException {
   		return work.getSrc97();
	}

    /**
	 *	Returns the String value of src97
	 *	@return src97
	 */
	public char[]  getSrc97ActualString() {
		return work.getSrc97ActualString();
	}

	/**
	 *	Returns String value of src97
	 *	@return src97
	 */
	public char[]  getSrc97String() throws CFException {
	     return String.valueOf(work.getSrc97String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src97IsNumeric()  throws CFException{
	    return work.src97IsNumeric();
	}

	/**
	 * 	Update Src97 with the passed value
	 *	@param number
	 */
	public void setSrc97(long number)  throws CFException{
		work.setSrc97(number);
	}
	

	
	/**
	 * 	Update Src97 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc97(char[] value)  throws CFException {
		work.setSrc97(value);
	}
	
	/**
	 * 	Update Src97 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc97String(char[] value)  throws CFException{
		work.setSrc97(value);
	}	

	/**
	 *	Returns the value of src100
	 *	@return src100
	 */
	public long getSrc100() throws CFException {
   		return work.getSrc100();
	}

    /**
	 *	Returns the String value of src100
	 *	@return src100
	 */
	public char[]  getSrc100ActualString() {
		return work.getSrc100ActualString();
	}

	/**
	 *	Returns String value of src100
	 *	@return src100
	 */
	public char[]  getSrc100String() throws CFException {
	     return String.valueOf(work.getSrc100String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src100IsNumeric()  throws CFException{
	    return work.src100IsNumeric();
	}

	/**
	 * 	Update Src100 with the passed value
	 *	@param number
	 */
	public void setSrc100(long number)  throws CFException{
		work.setSrc100(number);
	}
	

	
	/**
	 * 	Update Src100 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc100(char[] value)  throws CFException {
		work.setSrc100(value);
	}
	
	/**
	 * 	Update Src100 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc100String(char[] value)  throws CFException{
		work.setSrc100(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process21Split86OutCtx clone() {
        Process21Split86OutCtx cloneObj = new Process21Split86OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process21Split86OutCtx getProcess21Split86OutCtx() {
            return new Process21Split86OutCtx();
    }
     public class Process22Split88InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src104
	 *	@return src104
	 */
	public long getSrc104() throws CFException {
   		return work.getSrc104();
	}


	/**
	 *	Returns String value of src104
	 *	@return src104
	 */
	public char[]  getSrc104String() throws CFException {
	     return String.valueOf(work.getSrc104String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src104IsNumeric()  throws CFException{
	    return work.src104IsNumeric();
	}

	/**
	 * 	Update Src104 with the passed value
	 *	@param number
	 */
	public void setSrc104(long number)  throws CFException{
		work.setSrc104(number);
	}
	

	
	/**
	 * 	Update Src104 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc104(char[] value)  throws CFException {
		work.setSrc104(value);
	}
	
	/**
	 * 	Update Src104 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc104String(char[] value)  throws CFException{
		work.setSrc104(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process22Split88OutCtx getProcess22Split88OutCtx() {
            return new Process22Split88OutCtx();
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

    public Process22Split88InCtx clone() {
        Process22Split88InCtx cloneObj = new Process22Split88InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process22Split88InCtx getProcess22Split88InCtx() {
            return new Process22Split88InCtx();
    }
     public class Process22Split88OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt103
	 *	@return tgt103
	 */
	public long getTgt103() throws CFException {
   		return work.getTgt103();
	}


	/**
	 *	Returns String value of tgt103
	 *	@return tgt103
	 */
	public char[]  getTgt103String() throws CFException {
	     return String.valueOf(work.getTgt103String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt103IsNumeric()  throws CFException{
	    return work.tgt103IsNumeric();
	}

	/**
	 * 	Update Tgt103 with the passed value
	 *	@param number
	 */
	public void setTgt103(long number)  throws CFException{
		work.setTgt103(number);
	}
	

	
	/**
	 * 	Update Tgt103 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt103(char[] value)  throws CFException {
		work.setTgt103(value);
	}
	
	/**
	 * 	Update Tgt103 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt103String(char[] value)  throws CFException{
		work.setTgt103(value);
	}	

	/**
	 *	Returns the value of src105
	 *	@return src105
	 */
	public short getSrc105() throws CFException {        
   		return work.getSrc105();
	}
	
	/**
	 * 	Update Src105 with the passed value
	 *	@param number
	 */
	public void setSrc105(short number)  throws CFException{
		work.setSrc105(number);
	}

	public void setSrc105(int number)  throws CFException{
		work.setSrc105((short)number);
	}

	public void setSrc105(long number)  throws CFException{
		work.setSrc105((short)number);
	}



	/**
	 *	Returns the value of tgt102
	 *	@return tgt102
	 */
	public int getTgt102() throws CFException {        
   		return work.getTgt102();
	}
	
	/**
	 * 	Update Tgt102 with the passed value
	 *	@param number
	 */
	public void setTgt102(int number)  throws CFException{
		work.setTgt102(number);
	}


	public void setTgt102(long number)  throws CFException{
		work.setTgt102((int)number);
	}


	/**
	 *	Returns the value of tgt101
	 *	@return tgt101
	 */
	public short getTgt101() throws CFException {        
   		return work.getTgt101();
	}
	
	/**
	 * 	Update Tgt101 with the passed value
	 *	@param number
	 */
	public void setTgt101(short number)  throws CFException{
		work.setTgt101(number);
	}

	public void setTgt101(int number)  throws CFException{
		work.setTgt101((short)number);
	}

	public void setTgt101(long number)  throws CFException{
		work.setTgt101((short)number);
	}



	/**
	 *	Returns the value of src101
	 *	@return src101
	 */
	public long getSrc101() throws CFException {
   		return work.getSrc101();
	}

    /**
	 *	Returns the String value of src101
	 *	@return src101
	 */
	public char[]  getSrc101ActualString() {
		return work.getSrc101ActualString();
	}

	/**
	 *	Returns String value of src101
	 *	@return src101
	 */
	public char[]  getSrc101String() throws CFException {
	     return String.valueOf(work.getSrc101String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src101IsNumeric()  throws CFException{
	    return work.src101IsNumeric();
	}

	/**
	 * 	Update Src101 with the passed value
	 *	@param number
	 */
	public void setSrc101(long number)  throws CFException{
		work.setSrc101(number);
	}
	

	
	/**
	 * 	Update Src101 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc101(char[] value)  throws CFException {
		work.setSrc101(value);
	}
	
	/**
	 * 	Update Src101 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc101String(char[] value)  throws CFException{
		work.setSrc101(value);
	}	

	/**
	 *	Returns the value of src103
	 *	@return src103
	 */
	public long getSrc103() throws CFException {
   		return work.getSrc103();
	}

    /**
	 *	Returns the String value of src103
	 *	@return src103
	 */
	public char[]  getSrc103ActualString() {
		return work.getSrc103ActualString();
	}

	/**
	 *	Returns String value of src103
	 *	@return src103
	 */
	public char[]  getSrc103String() throws CFException {
	     return String.valueOf(work.getSrc103String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src103IsNumeric()  throws CFException{
	    return work.src103IsNumeric();
	}

	/**
	 * 	Update Src103 with the passed value
	 *	@param number
	 */
	public void setSrc103(long number)  throws CFException{
		work.setSrc103(number);
	}
	

	
	/**
	 * 	Update Src103 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc103(char[] value)  throws CFException {
		work.setSrc103(value);
	}
	
	/**
	 * 	Update Src103 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc103String(char[] value)  throws CFException{
		work.setSrc103(value);
	}	

	/**
	 *	Returns the value of tgt105
	 *	@return tgt105
	 */
   public char[] getTgt105() throws CFException  {              
   		return work.getTgt105();
   }

  
	/**
	*  set variable tgt105
	*  @param value
	**/
   public void setTgt105(char[] value) throws CFException {
      work.setTgt105(value);
   } 

     /**
	 * 	Update Tgt105 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt105(char[] source, int sourceIndex) throws CFException {
      work.setTgt105(source, sourceIndex);
   	
   }
   
   public void setTgt105(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt105(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt105 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt105(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt105(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt105 with another Field
	 *	@param value
	 */
   public void setTgt105(Field source) {
      work.setTgt105(source);
   }  
   
     /**
	 * 	Update Tgt105 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt105(Field source, int sourceIndex,int sourceLen) {
      work.setTgt105(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt105 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt105(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt105(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src104
	 *	@return src104
	 */
	public long getSrc104() throws CFException {
   		return work.getSrc104();
	}


	/**
	 *	Returns String value of src104
	 *	@return src104
	 */
	public char[]  getSrc104String() throws CFException {
	     return String.valueOf(work.getSrc104String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src104IsNumeric()  throws CFException{
	    return work.src104IsNumeric();
	}

	/**
	 * 	Update Src104 with the passed value
	 *	@param number
	 */
	public void setSrc104(long number)  throws CFException{
		work.setSrc104(number);
	}
	

	
	/**
	 * 	Update Src104 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc104(char[] value)  throws CFException {
		work.setSrc104(value);
	}
	
	/**
	 * 	Update Src104 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc104String(char[] value)  throws CFException{
		work.setSrc104(value);
	}	

	/**
	 *	Returns the value of src102
	 *	@return src102
	 */
	public long getSrc102() throws CFException {
   		return work.getSrc102();
	}

    /**
	 *	Returns the String value of src102
	 *	@return src102
	 */
	public char[]  getSrc102ActualString() {
		return work.getSrc102ActualString();
	}

	/**
	 *	Returns String value of src102
	 *	@return src102
	 */
	public char[]  getSrc102String() throws CFException {
	     return String.valueOf(work.getSrc102String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src102IsNumeric()  throws CFException{
	    return work.src102IsNumeric();
	}

	/**
	 * 	Update Src102 with the passed value
	 *	@param number
	 */
	public void setSrc102(long number)  throws CFException{
		work.setSrc102(number);
	}
	

	
	/**
	 * 	Update Src102 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc102(char[] value)  throws CFException {
		work.setSrc102(value);
	}
	
	/**
	 * 	Update Src102 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc102String(char[] value)  throws CFException{
		work.setSrc102(value);
	}	

	/**
	 *	Returns the value of tgt104
	 *	@return tgt104
	 */
	public int getTgt104() throws CFException {
   		return work.getTgt104();
	}

    /**
	 *	Returns the String value of tgt104
	 *	@return tgt104
	 */
	public char[]  getTgt104ActualString() {
		return work.getTgt104ActualString();
	}

	/**
	 *	Returns String value of tgt104
	 *	@return tgt104
	 */
	public char[]  getTgt104String() throws CFException {
	     return String.valueOf(work.getTgt104String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt104IsNumeric()  throws CFException{
	    return work.tgt104IsNumeric();
	}

	/**
	 * 	Update Tgt104 with the passed value
	 *	@param number
	 */
	public void setTgt104(int number)  throws CFException{
		work.setTgt104(number);
	}
	

	public void setTgt104(long number)  throws CFException{
	    work.setTgt104(number);
	}
	
	
	/**
	 * 	Update Tgt104 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt104(char[] value)  throws CFException {
		work.setTgt104(value);
	}
	
	/**
	 * 	Update Tgt104 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt104String(char[] value)  throws CFException{
		work.setTgt104(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process22Split88OutCtx clone() {
        Process22Split88OutCtx cloneObj = new Process22Split88OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process22Split88OutCtx getProcess22Split88OutCtx() {
            return new Process22Split88OutCtx();
    }
     public class Process23Split90InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process23Split90OutCtx getProcess23Split90OutCtx() {
            return new Process23Split90OutCtx();
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

    public Process23Split90InCtx clone() {
        Process23Split90InCtx cloneObj = new Process23Split90InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process23Split90InCtx getProcess23Split90InCtx() {
            return new Process23Split90InCtx();
    }
     public class Process23Split90OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src107
	 *	@return src107
	 */
	public short getSrc107() throws CFException {        
   		return work.getSrc107();
	}
	
	/**
	 * 	Update Src107 with the passed value
	 *	@param number
	 */
	public void setSrc107(short number)  throws CFException{
		work.setSrc107(number);
	}

	public void setSrc107(int number)  throws CFException{
		work.setSrc107((short)number);
	}

	public void setSrc107(long number)  throws CFException{
		work.setSrc107((short)number);
	}



	/**
	 *	Returns the value of src105
	 *	@return src105
	 */
	public short getSrc105() throws CFException {        
   		return work.getSrc105();
	}
	
	/**
	 * 	Update Src105 with the passed value
	 *	@param number
	 */
	public void setSrc105(short number)  throws CFException{
		work.setSrc105(number);
	}

	public void setSrc105(int number)  throws CFException{
		work.setSrc105((short)number);
	}

	public void setSrc105(long number)  throws CFException{
		work.setSrc105((short)number);
	}



	/**
	 *	Returns the value of src106
	 *	@return src106
	 */
	public int getSrc106() throws CFException {        
   		return work.getSrc106();
	}
	
	/**
	 * 	Update Src106 with the passed value
	 *	@param number
	 */
	public void setSrc106(int number)  throws CFException{
		work.setSrc106(number);
	}


	public void setSrc106(long number)  throws CFException{
		work.setSrc106((int)number);
	}


	/**
	 *	Returns the value of src109
	 *	@return src109
	 */
	public int getSrc109() throws CFException {        
   		return work.getSrc109();
	}
	
	/**
	 * 	Update Src109 with the passed value
	 *	@param number
	 */
	public void setSrc109(int number)  throws CFException{
		work.setSrc109(number);
	}


	public void setSrc109(long number)  throws CFException{
		work.setSrc109((int)number);
	}


	/**
	 *	Returns the value of tgt105
	 *	@return tgt105
	 */
   public char[] getTgt105() throws CFException  {              
   		return work.getTgt105();
   }

  
	/**
	*  set variable tgt105
	*  @param value
	**/
   public void setTgt105(char[] value) throws CFException {
      work.setTgt105(value);
   } 

     /**
	 * 	Update Tgt105 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt105(char[] source, int sourceIndex) throws CFException {
      work.setTgt105(source, sourceIndex);
   	
   }
   
   public void setTgt105(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt105(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt105 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt105(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt105(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt105 with another Field
	 *	@param value
	 */
   public void setTgt105(Field source) {
      work.setTgt105(source);
   }  
   
     /**
	 * 	Update Tgt105 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt105(Field source, int sourceIndex,int sourceLen) {
      work.setTgt105(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt105 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt105(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt105(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src108
	 *	@return src108
	 */
	public short getSrc108() throws CFException {        
   		return work.getSrc108();
	}
	
	/**
	 * 	Update Src108 with the passed value
	 *	@param number
	 */
	public void setSrc108(short number)  throws CFException{
		work.setSrc108(number);
	}

	public void setSrc108(int number)  throws CFException{
		work.setSrc108((short)number);
	}

	public void setSrc108(long number)  throws CFException{
		work.setSrc108((short)number);
	}



	public BigDecimal getTgt109() throws CFException{      
   		return work.getTgt109();
	}

    public char[] getTgt109String() throws CFException {
          return  work.getTgt109().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt109 with the passed number
	 *	@param number
	 */
	public void setTgt109(BigDecimal number)  throws CFException{
		work.setTgt109(number);
   }

	public BigDecimal getTgt108() throws CFException{      
   		return work.getTgt108();
	}

    public char[] getTgt108String() throws CFException {
          return  work.getTgt108().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt108 with the passed number
	 *	@param number
	 */
	public void setTgt108(BigDecimal number)  throws CFException{
		work.setTgt108(number);
   }

	public BigDecimal getTgt107() throws CFException{      
   		return work.getTgt107();
	}

    public char[] getTgt107String() throws CFException {
          return  work.getTgt107().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt107 with the passed number
	 *	@param number
	 */
	public void setTgt107(BigDecimal number)  throws CFException{
		work.setTgt107(number);
   }

	/**
	 *	Returns the value of tgt106
	 *	@return tgt106
	 */
   public char[] getTgt106() throws CFException  {              
   		return work.getTgt106();
   }

  
	/**
	*  set variable tgt106
	*  @param value
	**/
   public void setTgt106(char[] value) throws CFException {
      work.setTgt106(value);
   } 

     /**
	 * 	Update Tgt106 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt106(char[] source, int sourceIndex) throws CFException {
      work.setTgt106(source, sourceIndex);
   	
   }
   
   public void setTgt106(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt106(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt106 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt106(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt106(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt106 with another Field
	 *	@param value
	 */
   public void setTgt106(Field source) {
      work.setTgt106(source);
   }  
   
     /**
	 * 	Update Tgt106 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt106(Field source, int sourceIndex,int sourceLen) {
      work.setTgt106(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt106 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt106(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt106(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process23Split90OutCtx clone() {
        Process23Split90OutCtx cloneObj = new Process23Split90OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process23Split90OutCtx getProcess23Split90OutCtx() {
            return new Process23Split90OutCtx();
    }
     public class Process24Split92InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process24Split92OutCtx getProcess24Split92OutCtx() {
            return new Process24Split92OutCtx();
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

    public Process24Split92InCtx clone() {
        Process24Split92InCtx cloneObj = new Process24Split92InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process24Split92InCtx getProcess24Split92InCtx() {
            return new Process24Split92InCtx();
    }
     public class Process24Split92OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	public BigDecimal getTgt112() throws CFException{      
   		return work.getTgt112();
	}

    public char[] getTgt112String() throws CFException {
          return  work.getTgt112().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt112 with the passed number
	 *	@param number
	 */
	public void setTgt112(BigDecimal number)  throws CFException{
		work.setTgt112(number);
   }

	/**
	 *	Returns the value of src112
	 *	@return src112
	 */
	public int getSrc112() throws CFException {        
   		return work.getSrc112();
	}
	
	/**
	 * 	Update Src112 with the passed value
	 *	@param number
	 */
	public void setSrc112(int number)  throws CFException{
		work.setSrc112(number);
	}


	public void setSrc112(long number)  throws CFException{
		work.setSrc112((int)number);
	}


	public BigDecimal getTgt110() throws CFException{      
   		return work.getTgt110();
	}

    public char[] getTgt110String() throws CFException {
          return  work.getTgt110().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt110 with the passed number
	 *	@param number
	 */
	public void setTgt110(BigDecimal number)  throws CFException{
		work.setTgt110(number);
   }

	public BigDecimal getTgt111() throws CFException{      
   		return work.getTgt111();
	}

    public char[] getTgt111String() throws CFException {
          return  work.getTgt111().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt111 with the passed number
	 *	@param number
	 */
	public void setTgt111(BigDecimal number)  throws CFException{
		work.setTgt111(number);
   }

	/**
	 *	Returns the value of src111
	 *	@return src111
	 */
	public int getSrc111() throws CFException {        
   		return work.getSrc111();
	}
	
	/**
	 * 	Update Src111 with the passed value
	 *	@param number
	 */
	public void setSrc111(int number)  throws CFException{
		work.setSrc111(number);
	}


	public void setSrc111(long number)  throws CFException{
		work.setSrc111((int)number);
	}


	/**
	 *	Returns the value of src110
	 *	@return src110
	 */
	public int getSrc110() throws CFException {        
   		return work.getSrc110();
	}
	
	/**
	 * 	Update Src110 with the passed value
	 *	@param number
	 */
	public void setSrc110(int number)  throws CFException{
		work.setSrc110(number);
	}


	public void setSrc110(long number)  throws CFException{
		work.setSrc110((int)number);
	}


	/**
	 *	Returns the value of src113
	 *	@return src113
	 */
	public long getSrc113() throws CFException {        
   		return work.getSrc113();
	}
	
	/**
	 * 	Update Src113 with the passed value
	 *	@param number
	 */
	public void setSrc113(long number)  throws CFException{
		work.setSrc113(number);
	}



	public BigDecimal getTgt113() throws CFException{      
   		return work.getTgt113();
	}

    public char[] getTgt113String() throws CFException {
          return  work.getTgt113().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt113 with the passed number
	 *	@param number
	 */
	public void setTgt113(BigDecimal number)  throws CFException{
		work.setTgt113(number);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process24Split92OutCtx clone() {
        Process24Split92OutCtx cloneObj = new Process24Split92OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process24Split92OutCtx getProcess24Split92OutCtx() {
            return new Process24Split92OutCtx();
    }
     public class Process25Split94InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process25Split94OutCtx getProcess25Split94OutCtx() {
            return new Process25Split94OutCtx();
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

    public Process25Split94InCtx clone() {
        Process25Split94InCtx cloneObj = new Process25Split94InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process25Split94InCtx getProcess25Split94InCtx() {
            return new Process25Split94InCtx();
    }
     public class Process25Split94OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	public BigDecimal getSrc116() throws CFException{      
   		return work.getSrc116();
	}

    public char[] getSrc116String() throws CFException {
          return  work.getSrc116().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src116 with the passed number
	 *	@param number
	 */
	public void setSrc116(BigDecimal number)  throws CFException{
		work.setSrc116(number);
   }

	public BigDecimal getTgt115() throws CFException{      
   		return work.getTgt115();
	}

    public char[] getTgt115String() throws CFException {
          return  work.getTgt115().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt115 with the passed number
	 *	@param number
	 */
	public void setTgt115(BigDecimal number)  throws CFException{
		work.setTgt115(number);
   }

	public BigDecimal getSrc115() throws CFException{      
   		return work.getSrc115();
	}

    public char[] getSrc115String() throws CFException {
          return  work.getSrc115().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src115 with the passed number
	 *	@param number
	 */
	public void setSrc115(BigDecimal number)  throws CFException{
		work.setSrc115(number);
   }

	public BigDecimal getTgt117() throws CFException{      
   		return work.getTgt117();
	}

    public char[] getTgt117String() throws CFException {
          return  work.getTgt117().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt117 with the passed number
	 *	@param number
	 */
	public void setTgt117(BigDecimal number)  throws CFException{
		work.setTgt117(number);
   }

	/**
	 *	Returns the value of src117
	 *	@return src117
	 */
	public BigDecimal getSrc117() throws CFException {
   		return work.getSrc117();
	}

    /**
	 *	Returns the String value of src117
	 *	@return src117
	 */
	public char[]  getSrc117ActualString()  throws CFException{
	    return work.getSrc117ActualString();
	}

	 /**
     *	Returns String value of src117
     *	@return src117
     */
    public char[]  getSrc117String() throws CFException {
         return work.getSrc117String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src117IsNumeric() {
        return work.src117IsNumeric();
    }
	/**
	 * 	Update Src117 with the passed number
	 *	@param number
	 */
	public void setSrc117(BigDecimal number)  throws CFException{
		work.setSrc117(number);
   }

	/**
	 * 	Update Src117 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc117(char[] value)  throws CFException{
		work.setSrc117(value);
	}   

	/**
	 *	Returns the value of src118
	 *	@return src118
	 */
	public BigDecimal getSrc118() throws CFException {
   		return work.getSrc118();
	}

    /**
	 *	Returns the String value of src118
	 *	@return src118
	 */
	public char[]  getSrc118ActualString()  throws CFException{
	    return work.getSrc118ActualString();
	}

	 /**
     *	Returns String value of src118
     *	@return src118
     */
    public char[]  getSrc118String() throws CFException {
         return work.getSrc118String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src118IsNumeric() {
        return work.src118IsNumeric();
    }
	/**
	 * 	Update Src118 with the passed number
	 *	@param number
	 */
	public void setSrc118(BigDecimal number)  throws CFException{
		work.setSrc118(number);
   }

	/**
	 * 	Update Src118 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc118(char[] value)  throws CFException{
		work.setSrc118(value);
	}   

	public BigDecimal getTgt114() throws CFException{      
   		return work.getTgt114();
	}

    public char[] getTgt114String() throws CFException {
          return  work.getTgt114().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt114 with the passed number
	 *	@param number
	 */
	public void setTgt114(BigDecimal number)  throws CFException{
		work.setTgt114(number);
   }

	/**
	 *	Returns the value of src114
	 *	@return src114
	 */
	public long getSrc114() throws CFException {        
   		return work.getSrc114();
	}
	
	/**
	 * 	Update Src114 with the passed value
	 *	@param number
	 */
	public void setSrc114(long number)  throws CFException{
		work.setSrc114(number);
	}



	public BigDecimal getTgt116() throws CFException{      
   		return work.getTgt116();
	}

    public char[] getTgt116String() throws CFException {
          return  work.getTgt116().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt116 with the passed number
	 *	@param number
	 */
	public void setTgt116(BigDecimal number)  throws CFException{
		work.setTgt116(number);
   }

	public BigDecimal getTgt118() throws CFException{      
   		return work.getTgt118();
	}

    public char[] getTgt118String() throws CFException {
          return  work.getTgt118().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt118 with the passed number
	 *	@param number
	 */
	public void setTgt118(BigDecimal number)  throws CFException{
		work.setTgt118(number);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process25Split94OutCtx clone() {
        Process25Split94OutCtx cloneObj = new Process25Split94OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process25Split94OutCtx getProcess25Split94OutCtx() {
            return new Process25Split94OutCtx();
    }
     public class Process26Split96InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process26Split96OutCtx getProcess26Split96OutCtx() {
            return new Process26Split96OutCtx();
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

    public Process26Split96InCtx clone() {
        Process26Split96InCtx cloneObj = new Process26Split96InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process26Split96InCtx getProcess26Split96InCtx() {
            return new Process26Split96InCtx();
    }
     public class Process26Split96OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	public BigDecimal getTgt121() throws CFException{      
   		return work.getTgt121();
	}

    public char[] getTgt121String() throws CFException {
          return  work.getTgt121().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt121 with the passed number
	 *	@param number
	 */
	public void setTgt121(BigDecimal number)  throws CFException{
		work.setTgt121(number);
   }

	/**
	 *	Returns the value of src119
	 *	@return src119
	 */
	public BigDecimal getSrc119() throws CFException {
   		return work.getSrc119();
	}


	 /**
     *	Returns String value of src119
     *	@return src119
     */
    public char[]  getSrc119String() throws CFException {
         return work.getSrc119String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src119IsNumeric() {
        return work.src119IsNumeric();
    }
	/**
	 * 	Update Src119 with the passed number
	 *	@param number
	 */
	public void setSrc119(BigDecimal number)  throws CFException{
		work.setSrc119(number);
   }

	/**
	 * 	Update Src119 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc119(char[] value)  throws CFException{
		work.setSrc119(value);
	}   

	/**
	 *	Returns the value of src118
	 *	@return src118
	 */
	public BigDecimal getSrc118() throws CFException {
   		return work.getSrc118();
	}

    /**
	 *	Returns the String value of src118
	 *	@return src118
	 */
	public char[]  getSrc118ActualString()  throws CFException{
	    return work.getSrc118ActualString();
	}

	 /**
     *	Returns String value of src118
     *	@return src118
     */
    public char[]  getSrc118String() throws CFException {
         return work.getSrc118String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src118IsNumeric() {
        return work.src118IsNumeric();
    }
	/**
	 * 	Update Src118 with the passed number
	 *	@param number
	 */
	public void setSrc118(BigDecimal number)  throws CFException{
		work.setSrc118(number);
   }

	/**
	 * 	Update Src118 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc118(char[] value)  throws CFException{
		work.setSrc118(value);
	}   

	public BigDecimal getTgt120() throws CFException{      
   		return work.getTgt120();
	}

    public char[] getTgt120String() throws CFException {
          return  work.getTgt120().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt120 with the passed number
	 *	@param number
	 */
	public void setTgt120(BigDecimal number)  throws CFException{
		work.setTgt120(number);
   }

	public BigDecimal getTgt122() throws CFException{      
   		return work.getTgt122();
	}

    public char[] getTgt122String() throws CFException {
          return  work.getTgt122().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt122 with the passed number
	 *	@param number
	 */
	public void setTgt122(BigDecimal number)  throws CFException{
		work.setTgt122(number);
   }

	public BigDecimal getTgt119() throws CFException{      
   		return work.getTgt119();
	}

    public char[] getTgt119String() throws CFException {
          return  work.getTgt119().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt119 with the passed number
	 *	@param number
	 */
	public void setTgt119(BigDecimal number)  throws CFException{
		work.setTgt119(number);
   }

	/**
	 *	Returns the value of src120
	 *	@return src120
	 */
	public BigDecimal getSrc120() throws CFException {
   		return work.getSrc120();
	}


	 /**
     *	Returns String value of src120
     *	@return src120
     */
    public char[]  getSrc120String() throws CFException {
         return work.getSrc120String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src120IsNumeric() {
        return work.src120IsNumeric();
    }
	/**
	 * 	Update Src120 with the passed number
	 *	@param number
	 */
	public void setSrc120(BigDecimal number)  throws CFException{
		work.setSrc120(number);
   }

	/**
	 * 	Update Src120 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc120(char[] value)  throws CFException{
		work.setSrc120(value);
	}   

	/**
	 *	Returns the value of src122
	 *	@return src122
	 */
	public BigDecimal getSrc122() throws CFException {
   		return work.getSrc122();
	}


	 /**
     *	Returns String value of src122
     *	@return src122
     */
    public char[]  getSrc122String() throws CFException {
         return work.getSrc122String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src122IsNumeric() {
        return work.src122IsNumeric();
    }
	/**
	 * 	Update Src122 with the passed number
	 *	@param number
	 */
	public void setSrc122(BigDecimal number)  throws CFException{
		work.setSrc122(number);
   }

	/**
	 * 	Update Src122 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc122(char[] value)  throws CFException{
		work.setSrc122(value);
	}   

	public BigDecimal getTgt118() throws CFException{      
   		return work.getTgt118();
	}

    public char[] getTgt118String() throws CFException {
          return  work.getTgt118().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt118 with the passed number
	 *	@param number
	 */
	public void setTgt118(BigDecimal number)  throws CFException{
		work.setTgt118(number);
   }

	/**
	 *	Returns the value of src121
	 *	@return src121
	 */
	public BigDecimal getSrc121() throws CFException {
   		return work.getSrc121();
	}


	 /**
     *	Returns String value of src121
     *	@return src121
     */
    public char[]  getSrc121String() throws CFException {
         return work.getSrc121String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src121IsNumeric() {
        return work.src121IsNumeric();
    }
	/**
	 * 	Update Src121 with the passed number
	 *	@param number
	 */
	public void setSrc121(BigDecimal number)  throws CFException{
		work.setSrc121(number);
   }

	/**
	 * 	Update Src121 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc121(char[] value)  throws CFException{
		work.setSrc121(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process26Split96OutCtx clone() {
        Process26Split96OutCtx cloneObj = new Process26Split96OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process26Split96OutCtx getProcess26Split96OutCtx() {
            return new Process26Split96OutCtx();
    }
     public class Process27Split98InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process27Split98OutCtx getProcess27Split98OutCtx() {
            return new Process27Split98OutCtx();
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

    public Process27Split98InCtx clone() {
        Process27Split98InCtx cloneObj = new Process27Split98InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process27Split98InCtx getProcess27Split98InCtx() {
            return new Process27Split98InCtx();
    }
     public class Process27Split98OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt126
	 *	@return tgt126
	 */
	public BigDecimal getTgt126() throws CFException {
   		return work.getTgt126();
	}

    /**
	 *	Returns the String value of tgt126
	 *	@return tgt126
	 */
	public char[]  getTgt126ActualString()  throws CFException{
	    return work.getTgt126ActualString();
	}

	 /**
     *	Returns String value of tgt126
     *	@return tgt126
     */
    public char[]  getTgt126String() throws CFException {
         return work.getTgt126String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt126IsNumeric() {
        return work.tgt126IsNumeric();
    }
	/**
	 * 	Update Tgt126 with the passed number
	 *	@param number
	 */
	public void setTgt126(BigDecimal number)  throws CFException{
		work.setTgt126(number);
   }

	/**
	 * 	Update Tgt126 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt126(char[] value)  throws CFException{
		work.setTgt126(value);
	}   

	public BigDecimal getSrc123() throws CFException{      
   		return work.getSrc123();
	}

    public char[] getSrc123String() throws CFException {
          return  work.getSrc123().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src123 with the passed number
	 *	@param number
	 */
	public void setSrc123(BigDecimal number)  throws CFException{
		work.setSrc123(number);
   }

	public BigDecimal getTgt122() throws CFException{      
   		return work.getTgt122();
	}

    public char[] getTgt122String() throws CFException {
          return  work.getTgt122().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt122 with the passed number
	 *	@param number
	 */
	public void setTgt122(BigDecimal number)  throws CFException{
		work.setTgt122(number);
   }

	/**
	 *	Returns the value of tgt123
	 *	@return tgt123
	 */
	public BigDecimal getTgt123() throws CFException {
   		return work.getTgt123();
	}


	 /**
     *	Returns String value of tgt123
     *	@return tgt123
     */
    public char[]  getTgt123String() throws CFException {
         return work.getTgt123String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt123IsNumeric() {
        return work.tgt123IsNumeric();
    }
	/**
	 * 	Update Tgt123 with the passed number
	 *	@param number
	 */
	public void setTgt123(BigDecimal number)  throws CFException{
		work.setTgt123(number);
   }

	/**
	 * 	Update Tgt123 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt123(char[] value)  throws CFException{
		work.setTgt123(value);
	}   

	public BigDecimal getSrc126() throws CFException{      
   		return work.getSrc126();
	}

    public char[] getSrc126String() throws CFException {
          return  work.getSrc126().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src126 with the passed number
	 *	@param number
	 */
	public void setSrc126(BigDecimal number)  throws CFException{
		work.setSrc126(number);
   }

	public BigDecimal getSrc125() throws CFException{      
   		return work.getSrc125();
	}

    public char[] getSrc125String() throws CFException {
          return  work.getSrc125().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src125 with the passed number
	 *	@param number
	 */
	public void setSrc125(BigDecimal number)  throws CFException{
		work.setSrc125(number);
   }

	/**
	 *	Returns the value of tgt125
	 *	@return tgt125
	 */
	public BigDecimal getTgt125() throws CFException {
   		return work.getTgt125();
	}

    /**
	 *	Returns the String value of tgt125
	 *	@return tgt125
	 */
	public char[]  getTgt125ActualString()  throws CFException{
	    return work.getTgt125ActualString();
	}

	 /**
     *	Returns String value of tgt125
     *	@return tgt125
     */
    public char[]  getTgt125String() throws CFException {
         return work.getTgt125String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt125IsNumeric() {
        return work.tgt125IsNumeric();
    }
	/**
	 * 	Update Tgt125 with the passed number
	 *	@param number
	 */
	public void setTgt125(BigDecimal number)  throws CFException{
		work.setTgt125(number);
   }

	/**
	 * 	Update Tgt125 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt125(char[] value)  throws CFException{
		work.setTgt125(value);
	}   

	/**
	 *	Returns the value of src122
	 *	@return src122
	 */
	public BigDecimal getSrc122() throws CFException {
   		return work.getSrc122();
	}


	 /**
     *	Returns String value of src122
     *	@return src122
     */
    public char[]  getSrc122String() throws CFException {
         return work.getSrc122String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src122IsNumeric() {
        return work.src122IsNumeric();
    }
	/**
	 * 	Update Src122 with the passed number
	 *	@param number
	 */
	public void setSrc122(BigDecimal number)  throws CFException{
		work.setSrc122(number);
   }

	/**
	 * 	Update Src122 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc122(char[] value)  throws CFException{
		work.setSrc122(value);
	}   

	public BigDecimal getSrc124() throws CFException{      
   		return work.getSrc124();
	}

    public char[] getSrc124String() throws CFException {
          return  work.getSrc124().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src124 with the passed number
	 *	@param number
	 */
	public void setSrc124(BigDecimal number)  throws CFException{
		work.setSrc124(number);
   }

	/**
	 *	Returns the value of tgt124
	 *	@return tgt124
	 */
	public BigDecimal getTgt124() throws CFException {
   		return work.getTgt124();
	}


	 /**
     *	Returns String value of tgt124
     *	@return tgt124
     */
    public char[]  getTgt124String() throws CFException {
         return work.getTgt124String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt124IsNumeric() {
        return work.tgt124IsNumeric();
    }
	/**
	 * 	Update Tgt124 with the passed number
	 *	@param number
	 */
	public void setTgt124(BigDecimal number)  throws CFException{
		work.setTgt124(number);
   }

	/**
	 * 	Update Tgt124 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt124(char[] value)  throws CFException{
		work.setTgt124(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process27Split98OutCtx clone() {
        Process27Split98OutCtx cloneObj = new Process27Split98OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process27Split98OutCtx getProcess27Split98OutCtx() {
            return new Process27Split98OutCtx();
    }
     public class Process28Split100InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process28Split100OutCtx getProcess28Split100OutCtx() {
            return new Process28Split100OutCtx();
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

    public Process28Split100InCtx clone() {
        Process28Split100InCtx cloneObj = new Process28Split100InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process28Split100InCtx getProcess28Split100InCtx() {
            return new Process28Split100InCtx();
    }
     public class Process28Split100OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	public BigDecimal getSrc128() throws CFException{      
   		return work.getSrc128();
	}

    public char[] getSrc128String() throws CFException {
          return  work.getSrc128().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src128 with the passed number
	 *	@param number
	 */
	public void setSrc128(BigDecimal number)  throws CFException{
		work.setSrc128(number);
   }

	/**
	 *	Returns the value of tgt129
	 *	@return tgt129
	 */
	public BigDecimal getTgt129() throws CFException {
   		return work.getTgt129();
	}


	 /**
     *	Returns String value of tgt129
     *	@return tgt129
     */
    public char[]  getTgt129String() throws CFException {
         return work.getTgt129String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt129IsNumeric() {
        return work.tgt129IsNumeric();
    }
	/**
	 * 	Update Tgt129 with the passed number
	 *	@param number
	 */
	public void setTgt129(BigDecimal number)  throws CFException{
		work.setTgt129(number);
   }

	/**
	 * 	Update Tgt129 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt129(char[] value)  throws CFException{
		work.setTgt129(value);
	}   

	/**
	 *	Returns the value of tgt127
	 *	@return tgt127
	 */
	public BigDecimal getTgt127() throws CFException {
   		return work.getTgt127();
	}


	 /**
     *	Returns String value of tgt127
     *	@return tgt127
     */
    public char[]  getTgt127String() throws CFException {
         return work.getTgt127String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt127IsNumeric() {
        return work.tgt127IsNumeric();
    }
	/**
	 * 	Update Tgt127 with the passed number
	 *	@param number
	 */
	public void setTgt127(BigDecimal number)  throws CFException{
		work.setTgt127(number);
   }

	/**
	 * 	Update Tgt127 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt127(char[] value)  throws CFException{
		work.setTgt127(value);
	}   

	/**
	 *	Returns the value of tgt130
	 *	@return tgt130
	 */
	public BigDecimal getTgt130() throws CFException {
   		return work.getTgt130();
	}


	 /**
     *	Returns String value of tgt130
     *	@return tgt130
     */
    public char[]  getTgt130String() throws CFException {
         return work.getTgt130String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt130IsNumeric() {
        return work.tgt130IsNumeric();
    }
	/**
	 * 	Update Tgt130 with the passed number
	 *	@param number
	 */
	public void setTgt130(BigDecimal number)  throws CFException{
		work.setTgt130(number);
   }

	/**
	 * 	Update Tgt130 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt130(char[] value)  throws CFException{
		work.setTgt130(value);
	}   

	/**
	 *	Returns the value of tgt128
	 *	@return tgt128
	 */
	public BigDecimal getTgt128() throws CFException {
   		return work.getTgt128();
	}


	 /**
     *	Returns String value of tgt128
     *	@return tgt128
     */
    public char[]  getTgt128String() throws CFException {
         return work.getTgt128String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt128IsNumeric() {
        return work.tgt128IsNumeric();
    }
	/**
	 * 	Update Tgt128 with the passed number
	 *	@param number
	 */
	public void setTgt128(BigDecimal number)  throws CFException{
		work.setTgt128(number);
   }

	/**
	 * 	Update Tgt128 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt128(char[] value)  throws CFException{
		work.setTgt128(value);
	}   

	public BigDecimal getSrc127() throws CFException{      
   		return work.getSrc127();
	}

    public char[] getSrc127String() throws CFException {
          return  work.getSrc127().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src127 with the passed number
	 *	@param number
	 */
	public void setSrc127(BigDecimal number)  throws CFException{
		work.setSrc127(number);
   }

	/**
	 *	Returns the value of src129
	 *	@return src129
	 */
	public BigDecimal getSrc129() throws CFException {
   		return work.getSrc129();
	}

    /**
	 *	Returns the String value of src129
	 *	@return src129
	 */
	public char[]  getSrc129ActualString()  throws CFException{
	    return work.getSrc129ActualString();
	}

	 /**
     *	Returns String value of src129
     *	@return src129
     */
    public char[]  getSrc129String() throws CFException {
         return work.getSrc129String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src129IsNumeric() {
        return work.src129IsNumeric();
    }
	/**
	 * 	Update Src129 with the passed number
	 *	@param number
	 */
	public void setSrc129(BigDecimal number)  throws CFException{
		work.setSrc129(number);
   }

	/**
	 * 	Update Src129 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc129(char[] value)  throws CFException{
		work.setSrc129(value);
	}   

	/**
	 *	Returns the value of src130
	 *	@return src130
	 */
	public BigDecimal getSrc130() throws CFException {
   		return work.getSrc130();
	}

    /**
	 *	Returns the String value of src130
	 *	@return src130
	 */
	public char[]  getSrc130ActualString()  throws CFException{
	    return work.getSrc130ActualString();
	}

	 /**
     *	Returns String value of src130
     *	@return src130
     */
    public char[]  getSrc130String() throws CFException {
         return work.getSrc130String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src130IsNumeric() {
        return work.src130IsNumeric();
    }
	/**
	 * 	Update Src130 with the passed number
	 *	@param number
	 */
	public void setSrc130(BigDecimal number)  throws CFException{
		work.setSrc130(number);
   }

	/**
	 * 	Update Src130 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc130(char[] value)  throws CFException{
		work.setSrc130(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process28Split100OutCtx clone() {
        Process28Split100OutCtx cloneObj = new Process28Split100OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process28Split100OutCtx getProcess28Split100OutCtx() {
            return new Process28Split100OutCtx();
    }
     public class Process29Split102InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process29Split102OutCtx getProcess29Split102OutCtx() {
            return new Process29Split102OutCtx();
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

    public Process29Split102InCtx clone() {
        Process29Split102InCtx cloneObj = new Process29Split102InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process29Split102InCtx getProcess29Split102InCtx() {
            return new Process29Split102InCtx();
    }
     public class Process29Split102OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt132
	 *	@return tgt132
	 */
	public BigDecimal getTgt132() throws CFException {
   		return work.getTgt132();
	}

    /**
	 *	Returns the String value of tgt132
	 *	@return tgt132
	 */
	public char[]  getTgt132ActualString()  throws CFException{
	    return work.getTgt132ActualString();
	}

	 /**
     *	Returns String value of tgt132
     *	@return tgt132
     */
    public char[]  getTgt132String() throws CFException {
         return work.getTgt132String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt132IsNumeric() {
        return work.tgt132IsNumeric();
    }
	/**
	 * 	Update Tgt132 with the passed number
	 *	@param number
	 */
	public void setTgt132(BigDecimal number)  throws CFException{
		work.setTgt132(number);
   }

	/**
	 * 	Update Tgt132 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt132(char[] value)  throws CFException{
		work.setTgt132(value);
	}   

	/**
	 *	Returns the value of tgt131
	 *	@return tgt131
	 */
	public BigDecimal getTgt131() throws CFException {
   		return work.getTgt131();
	}

    /**
	 *	Returns the String value of tgt131
	 *	@return tgt131
	 */
	public char[]  getTgt131ActualString()  throws CFException{
	    return work.getTgt131ActualString();
	}

	 /**
     *	Returns String value of tgt131
     *	@return tgt131
     */
    public char[]  getTgt131String() throws CFException {
         return work.getTgt131String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt131IsNumeric() {
        return work.tgt131IsNumeric();
    }
	/**
	 * 	Update Tgt131 with the passed number
	 *	@param number
	 */
	public void setTgt131(BigDecimal number)  throws CFException{
		work.setTgt131(number);
   }

	/**
	 * 	Update Tgt131 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt131(char[] value)  throws CFException{
		work.setTgt131(value);
	}   

	/**
	 *	Returns the value of src132
	 *	@return src132
	 */
	public BigDecimal getSrc132() throws CFException {
   		return work.getSrc132();
	}


	 /**
     *	Returns String value of src132
     *	@return src132
     */
    public char[]  getSrc132String() throws CFException {
         return work.getSrc132String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src132IsNumeric() {
        return work.src132IsNumeric();
    }
	/**
	 * 	Update Src132 with the passed number
	 *	@param number
	 */
	public void setSrc132(BigDecimal number)  throws CFException{
		work.setSrc132(number);
   }

	/**
	 * 	Update Src132 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc132(char[] value)  throws CFException{
		work.setSrc132(value);
	}   

	/**
	 *	Returns the value of src134
	 *	@return src134
	 */
	public BigDecimal getSrc134() throws CFException {
   		return work.getSrc134();
	}


	 /**
     *	Returns String value of src134
     *	@return src134
     */
    public char[]  getSrc134String() throws CFException {
         return work.getSrc134String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src134IsNumeric() {
        return work.src134IsNumeric();
    }
	/**
	 * 	Update Src134 with the passed number
	 *	@param number
	 */
	public void setSrc134(BigDecimal number)  throws CFException{
		work.setSrc134(number);
   }

	/**
	 * 	Update Src134 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc134(char[] value)  throws CFException{
		work.setSrc134(value);
	}   

	/**
	 *	Returns the value of tgt134
	 *	@return tgt134
	 */
	public BigDecimal getTgt134() throws CFException {
   		return work.getTgt134();
	}


	 /**
     *	Returns String value of tgt134
     *	@return tgt134
     */
    public char[]  getTgt134String() throws CFException {
         return work.getTgt134String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt134IsNumeric() {
        return work.tgt134IsNumeric();
    }
	/**
	 * 	Update Tgt134 with the passed number
	 *	@param number
	 */
	public void setTgt134(BigDecimal number)  throws CFException{
		work.setTgt134(number);
   }

	/**
	 * 	Update Tgt134 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt134(char[] value)  throws CFException{
		work.setTgt134(value);
	}   

	/**
	 *	Returns the value of tgt135
	 *	@return tgt135
	 */
	public long getTgt135() throws CFException {
   		return work.getTgt135();
	}


	/**
	 *	Returns String value of tgt135
	 *	@return tgt135
	 */
	public char[]  getTgt135String() throws CFException {
	     return String.valueOf(work.getTgt135String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt135IsNumeric()  throws CFException{
	    return work.tgt135IsNumeric();
	}

	/**
	 * 	Update Tgt135 with the passed value
	 *	@param number
	 */
	public void setTgt135(long number)  throws CFException{
		work.setTgt135(number);
	}
	

	
	/**
	 * 	Update Tgt135 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt135(char[] value)  throws CFException {
		work.setTgt135(value);
	}
	
	/**
	 * 	Update Tgt135 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt135String(char[] value)  throws CFException{
		work.setTgt135(value);
	}	

	/**
	 *	Returns the value of tgt133
	 *	@return tgt133
	 */
	public BigDecimal getTgt133() throws CFException {
   		return work.getTgt133();
	}


	 /**
     *	Returns String value of tgt133
     *	@return tgt133
     */
    public char[]  getTgt133String() throws CFException {
         return work.getTgt133String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt133IsNumeric() {
        return work.tgt133IsNumeric();
    }
	/**
	 * 	Update Tgt133 with the passed number
	 *	@param number
	 */
	public void setTgt133(BigDecimal number)  throws CFException{
		work.setTgt133(number);
   }

	/**
	 * 	Update Tgt133 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt133(char[] value)  throws CFException{
		work.setTgt133(value);
	}   

	/**
	 *	Returns the value of src135
	 *	@return src135
	 */
	public int getSrc135() throws CFException {        
   		return work.getSrc135();
	}
	
	/**
	 * 	Update Src135 with the passed value
	 *	@param number
	 */
	public void setSrc135(int number)  throws CFException{
		work.setSrc135(number);
	}


	public void setSrc135(long number)  throws CFException{
		work.setSrc135((int)number);
	}


	/**
	 *	Returns the value of src133
	 *	@return src133
	 */
	public BigDecimal getSrc133() throws CFException {
   		return work.getSrc133();
	}


	 /**
     *	Returns String value of src133
     *	@return src133
     */
    public char[]  getSrc133String() throws CFException {
         return work.getSrc133String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src133IsNumeric() {
        return work.src133IsNumeric();
    }
	/**
	 * 	Update Src133 with the passed number
	 *	@param number
	 */
	public void setSrc133(BigDecimal number)  throws CFException{
		work.setSrc133(number);
   }

	/**
	 * 	Update Src133 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc133(char[] value)  throws CFException{
		work.setSrc133(value);
	}   

	/**
	 *	Returns the value of src131
	 *	@return src131
	 */
	public BigDecimal getSrc131() throws CFException {
   		return work.getSrc131();
	}


	 /**
     *	Returns String value of src131
     *	@return src131
     */
    public char[]  getSrc131String() throws CFException {
         return work.getSrc131String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src131IsNumeric() {
        return work.src131IsNumeric();
    }
	/**
	 * 	Update Src131 with the passed number
	 *	@param number
	 */
	public void setSrc131(BigDecimal number)  throws CFException{
		work.setSrc131(number);
   }

	/**
	 * 	Update Src131 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc131(char[] value)  throws CFException{
		work.setSrc131(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process29Split102OutCtx clone() {
        Process29Split102OutCtx cloneObj = new Process29Split102OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process29Split102OutCtx getProcess29Split102OutCtx() {
            return new Process29Split102OutCtx();
    }
     public class Process30Split104InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process30Split104OutCtx getProcess30Split104OutCtx() {
            return new Process30Split104OutCtx();
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

    public Process30Split104InCtx clone() {
        Process30Split104InCtx cloneObj = new Process30Split104InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process30Split104InCtx getProcess30Split104InCtx() {
            return new Process30Split104InCtx();
    }
     public class Process30Split104OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt139
	 *	@return tgt139
	 */
	public long getTgt139() throws CFException {
   		return work.getTgt139();
	}


	/**
	 *	Returns String value of tgt139
	 *	@return tgt139
	 */
	public char[]  getTgt139String() throws CFException {
	     return String.valueOf(work.getTgt139String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt139IsNumeric()  throws CFException{
	    return work.tgt139IsNumeric();
	}

	/**
	 * 	Update Tgt139 with the passed value
	 *	@param number
	 */
	public void setTgt139(long number)  throws CFException{
		work.setTgt139(number);
	}
	

	
	/**
	 * 	Update Tgt139 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt139(char[] value)  throws CFException {
		work.setTgt139(value);
	}
	
	/**
	 * 	Update Tgt139 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt139String(char[] value)  throws CFException{
		work.setTgt139(value);
	}	

	/**
	 *	Returns the value of src136
	 *	@return src136
	 */
	public long getSrc136() throws CFException {        
   		return work.getSrc136();
	}
	
	/**
	 * 	Update Src136 with the passed value
	 *	@param number
	 */
	public void setSrc136(long number)  throws CFException{
		work.setSrc136(number);
	}



	/**
	 *	Returns the value of src138
	 *	@return src138
	 */
	public long getSrc138() throws CFException {        
   		return work.getSrc138();
	}
	
	/**
	 * 	Update Src138 with the passed value
	 *	@param number
	 */
	public void setSrc138(long number)  throws CFException{
		work.setSrc138(number);
	}



	/**
	 *	Returns the value of tgt135
	 *	@return tgt135
	 */
	public long getTgt135() throws CFException {
   		return work.getTgt135();
	}


	/**
	 *	Returns String value of tgt135
	 *	@return tgt135
	 */
	public char[]  getTgt135String() throws CFException {
	     return String.valueOf(work.getTgt135String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt135IsNumeric()  throws CFException{
	    return work.tgt135IsNumeric();
	}

	/**
	 * 	Update Tgt135 with the passed value
	 *	@param number
	 */
	public void setTgt135(long number)  throws CFException{
		work.setTgt135(number);
	}
	

	
	/**
	 * 	Update Tgt135 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt135(char[] value)  throws CFException {
		work.setTgt135(value);
	}
	
	/**
	 * 	Update Tgt135 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt135String(char[] value)  throws CFException{
		work.setTgt135(value);
	}	

	/**
	 *	Returns the value of tgt138
	 *	@return tgt138
	 */
	public long getTgt138() throws CFException {
   		return work.getTgt138();
	}


	/**
	 *	Returns String value of tgt138
	 *	@return tgt138
	 */
	public char[]  getTgt138String() throws CFException {
	     return String.valueOf(work.getTgt138String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt138IsNumeric()  throws CFException{
	    return work.tgt138IsNumeric();
	}

	/**
	 * 	Update Tgt138 with the passed value
	 *	@param number
	 */
	public void setTgt138(long number)  throws CFException{
		work.setTgt138(number);
	}
	

	
	/**
	 * 	Update Tgt138 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt138(char[] value)  throws CFException {
		work.setTgt138(value);
	}
	
	/**
	 * 	Update Tgt138 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt138String(char[] value)  throws CFException{
		work.setTgt138(value);
	}	

	/**
	 *	Returns the value of src139
	 *	@return src139
	 */
	public short getSrc139() throws CFException {        
   		return work.getSrc139();
	}
	
	/**
	 * 	Update Src139 with the passed value
	 *	@param number
	 */
	public void setSrc139(short number)  throws CFException{
		work.setSrc139(number);
	}

	public void setSrc139(int number)  throws CFException{
		work.setSrc139((short)number);
	}

	public void setSrc139(long number)  throws CFException{
		work.setSrc139((short)number);
	}



	/**
	 *	Returns the value of src135
	 *	@return src135
	 */
	public int getSrc135() throws CFException {        
   		return work.getSrc135();
	}
	
	/**
	 * 	Update Src135 with the passed value
	 *	@param number
	 */
	public void setSrc135(int number)  throws CFException{
		work.setSrc135(number);
	}


	public void setSrc135(long number)  throws CFException{
		work.setSrc135((int)number);
	}


	/**
	 *	Returns the value of tgt137
	 *	@return tgt137
	 */
	public long getTgt137() throws CFException {
   		return work.getTgt137();
	}


	/**
	 *	Returns String value of tgt137
	 *	@return tgt137
	 */
	public char[]  getTgt137String() throws CFException {
	     return String.valueOf(work.getTgt137String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt137IsNumeric()  throws CFException{
	    return work.tgt137IsNumeric();
	}

	/**
	 * 	Update Tgt137 with the passed value
	 *	@param number
	 */
	public void setTgt137(long number)  throws CFException{
		work.setTgt137(number);
	}
	

	
	/**
	 * 	Update Tgt137 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt137(char[] value)  throws CFException {
		work.setTgt137(value);
	}
	
	/**
	 * 	Update Tgt137 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt137String(char[] value)  throws CFException{
		work.setTgt137(value);
	}	

	/**
	 *	Returns the value of src137
	 *	@return src137
	 */
	public long getSrc137() throws CFException {        
   		return work.getSrc137();
	}
	
	/**
	 * 	Update Src137 with the passed value
	 *	@param number
	 */
	public void setSrc137(long number)  throws CFException{
		work.setSrc137(number);
	}



	/**
	 *	Returns the value of tgt136
	 *	@return tgt136
	 */
	public long getTgt136() throws CFException {
   		return work.getTgt136();
	}


	/**
	 *	Returns String value of tgt136
	 *	@return tgt136
	 */
	public char[]  getTgt136String() throws CFException {
	     return String.valueOf(work.getTgt136String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt136IsNumeric()  throws CFException{
	    return work.tgt136IsNumeric();
	}

	/**
	 * 	Update Tgt136 with the passed value
	 *	@param number
	 */
	public void setTgt136(long number)  throws CFException{
		work.setTgt136(number);
	}
	

	
	/**
	 * 	Update Tgt136 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt136(char[] value)  throws CFException {
		work.setTgt136(value);
	}
	
	/**
	 * 	Update Tgt136 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt136String(char[] value)  throws CFException{
		work.setTgt136(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process30Split104OutCtx clone() {
        Process30Split104OutCtx cloneObj = new Process30Split104OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process30Split104OutCtx getProcess30Split104OutCtx() {
            return new Process30Split104OutCtx();
    }
     public class Process31Split106InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process31Split106OutCtx getProcess31Split106OutCtx() {
            return new Process31Split106OutCtx();
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

    public Process31Split106InCtx clone() {
        Process31Split106InCtx cloneObj = new Process31Split106InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process31Split106InCtx getProcess31Split106InCtx() {
            return new Process31Split106InCtx();
    }
     public class Process31Split106OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt139
	 *	@return tgt139
	 */
	public long getTgt139() throws CFException {
   		return work.getTgt139();
	}


	/**
	 *	Returns String value of tgt139
	 *	@return tgt139
	 */
	public char[]  getTgt139String() throws CFException {
	     return String.valueOf(work.getTgt139String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt139IsNumeric()  throws CFException{
	    return work.tgt139IsNumeric();
	}

	/**
	 * 	Update Tgt139 with the passed value
	 *	@param number
	 */
	public void setTgt139(long number)  throws CFException{
		work.setTgt139(number);
	}
	

	
	/**
	 * 	Update Tgt139 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt139(char[] value)  throws CFException {
		work.setTgt139(value);
	}
	
	/**
	 * 	Update Tgt139 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt139String(char[] value)  throws CFException{
		work.setTgt139(value);
	}	

	/**
	 *	Returns the value of tgt142
	 *	@return tgt142
	 */
	public long getTgt142() throws CFException {
   		return work.getTgt142();
	}


	/**
	 *	Returns String value of tgt142
	 *	@return tgt142
	 */
	public char[]  getTgt142String() throws CFException {
	     return String.valueOf(work.getTgt142String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt142IsNumeric()  throws CFException{
	    return work.tgt142IsNumeric();
	}

	/**
	 * 	Update Tgt142 with the passed value
	 *	@param number
	 */
	public void setTgt142(long number)  throws CFException{
		work.setTgt142(number);
	}
	

	
	/**
	 * 	Update Tgt142 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt142(char[] value)  throws CFException {
		work.setTgt142(value);
	}
	
	/**
	 * 	Update Tgt142 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt142String(char[] value)  throws CFException{
		work.setTgt142(value);
	}	

	/**
	 *	Returns the value of src142
	 *	@return src142
	 */
	public int getSrc142() throws CFException {
   		return work.getSrc142();
	}

    /**
	 *	Returns the String value of src142
	 *	@return src142
	 */
	public char[]  getSrc142ActualString() {
		return work.getSrc142ActualString();
	}

	/**
	 *	Returns String value of src142
	 *	@return src142
	 */
	public char[]  getSrc142String() throws CFException {
	     return String.valueOf(work.getSrc142String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src142IsNumeric()  throws CFException{
	    return work.src142IsNumeric();
	}

	/**
	 * 	Update Src142 with the passed value
	 *	@param number
	 */
	public void setSrc142(int number)  throws CFException{
		work.setSrc142(number);
	}
	

	public void setSrc142(long number)  throws CFException{
	    work.setSrc142(number);
	}
	
	
	/**
	 * 	Update Src142 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc142(char[] value)  throws CFException {
		work.setSrc142(value);
	}
	
	/**
	 * 	Update Src142 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc142String(char[] value)  throws CFException{
		work.setSrc142(value);
	}	

	/**
	 *	Returns the value of tgt140
	 *	@return tgt140
	 */
	public long getTgt140() throws CFException {
   		return work.getTgt140();
	}


	/**
	 *	Returns String value of tgt140
	 *	@return tgt140
	 */
	public char[]  getTgt140String() throws CFException {
	     return String.valueOf(work.getTgt140String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt140IsNumeric()  throws CFException{
	    return work.tgt140IsNumeric();
	}

	/**
	 * 	Update Tgt140 with the passed value
	 *	@param number
	 */
	public void setTgt140(long number)  throws CFException{
		work.setTgt140(number);
	}
	

	
	/**
	 * 	Update Tgt140 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt140(char[] value)  throws CFException {
		work.setTgt140(value);
	}
	
	/**
	 * 	Update Tgt140 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt140String(char[] value)  throws CFException{
		work.setTgt140(value);
	}	

	/**
	 *	Returns the value of src139
	 *	@return src139
	 */
	public short getSrc139() throws CFException {        
   		return work.getSrc139();
	}
	
	/**
	 * 	Update Src139 with the passed value
	 *	@param number
	 */
	public void setSrc139(short number)  throws CFException{
		work.setSrc139(number);
	}

	public void setSrc139(int number)  throws CFException{
		work.setSrc139((short)number);
	}

	public void setSrc139(long number)  throws CFException{
		work.setSrc139((short)number);
	}



	/**
	 *	Returns the value of tgt143
	 *	@return tgt143
	 */
	public int getTgt143() throws CFException {        
   		return work.getTgt143();
	}
	
	/**
	 * 	Update Tgt143 with the passed value
	 *	@param number
	 */
	public void setTgt143(int number)  throws CFException{
		work.setTgt143(number);
	}


	public void setTgt143(long number)  throws CFException{
		work.setTgt143((int)number);
	}


	/**
	 *	Returns the value of src143
	 *	@return src143
	 */
	public long getSrc143() throws CFException {
   		return work.getSrc143();
	}


	/**
	 *	Returns String value of src143
	 *	@return src143
	 */
	public char[]  getSrc143String() throws CFException {
	     return String.valueOf(work.getSrc143String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src143IsNumeric()  throws CFException{
	    return work.src143IsNumeric();
	}

	/**
	 * 	Update Src143 with the passed value
	 *	@param number
	 */
	public void setSrc143(long number)  throws CFException{
		work.setSrc143(number);
	}
	

	
	/**
	 * 	Update Src143 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc143(char[] value)  throws CFException {
		work.setSrc143(value);
	}
	
	/**
	 * 	Update Src143 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc143String(char[] value)  throws CFException{
		work.setSrc143(value);
	}	

	/**
	 *	Returns the value of src140
	 *	@return src140
	 */
	public int getSrc140() throws CFException {        
   		return work.getSrc140();
	}
	
	/**
	 * 	Update Src140 with the passed value
	 *	@param number
	 */
	public void setSrc140(int number)  throws CFException{
		work.setSrc140(number);
	}


	public void setSrc140(long number)  throws CFException{
		work.setSrc140((int)number);
	}


	/**
	 *	Returns the value of src141
	 *	@return src141
	 */
	public long getSrc141() throws CFException {
   		return work.getSrc141();
	}


	/**
	 *	Returns String value of src141
	 *	@return src141
	 */
	public char[]  getSrc141String() throws CFException {
	     return String.valueOf(work.getSrc141String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src141IsNumeric()  throws CFException{
	    return work.src141IsNumeric();
	}

	/**
	 * 	Update Src141 with the passed value
	 *	@param number
	 */
	public void setSrc141(long number)  throws CFException{
		work.setSrc141(number);
	}
	

	
	/**
	 * 	Update Src141 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc141(char[] value)  throws CFException {
		work.setSrc141(value);
	}
	
	/**
	 * 	Update Src141 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc141String(char[] value)  throws CFException{
		work.setSrc141(value);
	}	

	/**
	 *	Returns the value of tgt141
	 *	@return tgt141
	 */
	public long getTgt141() throws CFException {
   		return work.getTgt141();
	}


	/**
	 *	Returns String value of tgt141
	 *	@return tgt141
	 */
	public char[]  getTgt141String() throws CFException {
	     return String.valueOf(work.getTgt141String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt141IsNumeric()  throws CFException{
	    return work.tgt141IsNumeric();
	}

	/**
	 * 	Update Tgt141 with the passed value
	 *	@param number
	 */
	public void setTgt141(long number)  throws CFException{
		work.setTgt141(number);
	}
	

	
	/**
	 * 	Update Tgt141 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt141(char[] value)  throws CFException {
		work.setTgt141(value);
	}
	
	/**
	 * 	Update Tgt141 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt141String(char[] value)  throws CFException{
		work.setTgt141(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process31Split106OutCtx clone() {
        Process31Split106OutCtx cloneObj = new Process31Split106OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process31Split106OutCtx getProcess31Split106OutCtx() {
            return new Process31Split106OutCtx();
    }
     public class Process32Split108InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process32Split108OutCtx getProcess32Split108OutCtx() {
            return new Process32Split108OutCtx();
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

    public Process32Split108InCtx clone() {
        Process32Split108InCtx cloneObj = new Process32Split108InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process32Split108InCtx getProcess32Split108InCtx() {
            return new Process32Split108InCtx();
    }
     public class Process32Split108OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src146
	 *	@return src146
	 */
	public long getSrc146() throws CFException {
   		return work.getSrc146();
	}


	/**
	 *	Returns String value of src146
	 *	@return src146
	 */
	public char[]  getSrc146String() throws CFException {
	     return String.valueOf(work.getSrc146String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src146IsNumeric()  throws CFException{
	    return work.src146IsNumeric();
	}

	/**
	 * 	Update Src146 with the passed value
	 *	@param number
	 */
	public void setSrc146(long number)  throws CFException{
		work.setSrc146(number);
	}
	

	
	/**
	 * 	Update Src146 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc146(char[] value)  throws CFException {
		work.setSrc146(value);
	}
	
	/**
	 * 	Update Src146 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc146String(char[] value)  throws CFException{
		work.setSrc146(value);
	}	

	/**
	 *	Returns the value of tgt146
	 *	@return tgt146
	 */
	public long getTgt146() throws CFException {        
   		return work.getTgt146();
	}
	
	/**
	 * 	Update Tgt146 with the passed value
	 *	@param number
	 */
	public void setTgt146(long number)  throws CFException{
		work.setTgt146(number);
	}



	/**
	 *	Returns the value of tgt147
	 *	@return tgt147
	 */
	public short getTgt147() throws CFException {        
   		return work.getTgt147();
	}
	
	/**
	 * 	Update Tgt147 with the passed value
	 *	@param number
	 */
	public void setTgt147(short number)  throws CFException{
		work.setTgt147(number);
	}

	public void setTgt147(int number)  throws CFException{
		work.setTgt147((short)number);
	}

	public void setTgt147(long number)  throws CFException{
		work.setTgt147((short)number);
	}



	/**
	 *	Returns the value of tgt145
	 *	@return tgt145
	 */
	public long getTgt145() throws CFException {        
   		return work.getTgt145();
	}
	
	/**
	 * 	Update Tgt145 with the passed value
	 *	@param number
	 */
	public void setTgt145(long number)  throws CFException{
		work.setTgt145(number);
	}



	/**
	 *	Returns the value of src145
	 *	@return src145
	 */
	public long getSrc145() throws CFException {
   		return work.getSrc145();
	}


	/**
	 *	Returns String value of src145
	 *	@return src145
	 */
	public char[]  getSrc145String() throws CFException {
	     return String.valueOf(work.getSrc145String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src145IsNumeric()  throws CFException{
	    return work.src145IsNumeric();
	}

	/**
	 * 	Update Src145 with the passed value
	 *	@param number
	 */
	public void setSrc145(long number)  throws CFException{
		work.setSrc145(number);
	}
	

	
	/**
	 * 	Update Src145 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc145(char[] value)  throws CFException {
		work.setSrc145(value);
	}
	
	/**
	 * 	Update Src145 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc145String(char[] value)  throws CFException{
		work.setSrc145(value);
	}	

	/**
	 *	Returns the value of tgt144
	 *	@return tgt144
	 */
	public long getTgt144() throws CFException {        
   		return work.getTgt144();
	}
	
	/**
	 * 	Update Tgt144 with the passed value
	 *	@param number
	 */
	public void setTgt144(long number)  throws CFException{
		work.setTgt144(number);
	}



	/**
	 *	Returns the value of src144
	 *	@return src144
	 */
	public long getSrc144() throws CFException {
   		return work.getSrc144();
	}


	/**
	 *	Returns String value of src144
	 *	@return src144
	 */
	public char[]  getSrc144String() throws CFException {
	     return String.valueOf(work.getSrc144String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src144IsNumeric()  throws CFException{
	    return work.src144IsNumeric();
	}

	/**
	 * 	Update Src144 with the passed value
	 *	@param number
	 */
	public void setSrc144(long number)  throws CFException{
		work.setSrc144(number);
	}
	

	
	/**
	 * 	Update Src144 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc144(char[] value)  throws CFException {
		work.setSrc144(value);
	}
	
	/**
	 * 	Update Src144 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc144String(char[] value)  throws CFException{
		work.setSrc144(value);
	}	

	/**
	 *	Returns the value of src147
	 *	@return src147
	 */
	public long getSrc147() throws CFException {
   		return work.getSrc147();
	}


	/**
	 *	Returns String value of src147
	 *	@return src147
	 */
	public char[]  getSrc147String() throws CFException {
	     return String.valueOf(work.getSrc147String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src147IsNumeric()  throws CFException{
	    return work.src147IsNumeric();
	}

	/**
	 * 	Update Src147 with the passed value
	 *	@param number
	 */
	public void setSrc147(long number)  throws CFException{
		work.setSrc147(number);
	}
	

	
	/**
	 * 	Update Src147 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc147(char[] value)  throws CFException {
		work.setSrc147(value);
	}
	
	/**
	 * 	Update Src147 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc147String(char[] value)  throws CFException{
		work.setSrc147(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process32Split108OutCtx clone() {
        Process32Split108OutCtx cloneObj = new Process32Split108OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process32Split108OutCtx getProcess32Split108OutCtx() {
            return new Process32Split108OutCtx();
    }
     public class Process33Split110InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process33Split110OutCtx getProcess33Split110OutCtx() {
            return new Process33Split110OutCtx();
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

    public Process33Split110InCtx clone() {
        Process33Split110InCtx cloneObj = new Process33Split110InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process33Split110InCtx getProcess33Split110InCtx() {
            return new Process33Split110InCtx();
    }
     public class Process33Split110OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt149
	 *	@return tgt149
	 */
	public long getTgt149() throws CFException {
   		return work.getTgt149();
	}


	/**
	 *	Returns String value of tgt149
	 *	@return tgt149
	 */
	public char[]  getTgt149String() throws CFException {
	     return String.valueOf(work.getTgt149String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt149IsNumeric()  throws CFException{
	    return work.tgt149IsNumeric();
	}

	/**
	 * 	Update Tgt149 with the passed value
	 *	@param number
	 */
	public void setTgt149(long number)  throws CFException{
		work.setTgt149(number);
	}
	

	
	/**
	 * 	Update Tgt149 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt149(char[] value)  throws CFException {
		work.setTgt149(value);
	}
	
	/**
	 * 	Update Tgt149 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt149String(char[] value)  throws CFException{
		work.setTgt149(value);
	}	

	/**
	 *	Returns the value of src152
	 *	@return src152
	 */
	public long getSrc152() throws CFException {
   		return work.getSrc152();
	}

    /**
	 *	Returns the String value of src152
	 *	@return src152
	 */
	public char[]  getSrc152ActualString() {
		return work.getSrc152ActualString();
	}

	/**
	 *	Returns String value of src152
	 *	@return src152
	 */
	public char[]  getSrc152String() throws CFException {
	     return String.valueOf(work.getSrc152String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src152IsNumeric()  throws CFException{
	    return work.src152IsNumeric();
	}

	/**
	 * 	Update Src152 with the passed value
	 *	@param number
	 */
	public void setSrc152(long number)  throws CFException{
		work.setSrc152(number);
	}
	

	
	/**
	 * 	Update Src152 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc152(char[] value)  throws CFException {
		work.setSrc152(value);
	}
	
	/**
	 * 	Update Src152 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc152String(char[] value)  throws CFException{
		work.setSrc152(value);
	}	

	/**
	 *	Returns the value of tgt148
	 *	@return tgt148
	 */
	public int getTgt148() throws CFException {        
   		return work.getTgt148();
	}
	
	/**
	 * 	Update Tgt148 with the passed value
	 *	@param number
	 */
	public void setTgt148(int number)  throws CFException{
		work.setTgt148(number);
	}


	public void setTgt148(long number)  throws CFException{
		work.setTgt148((int)number);
	}


	/**
	 *	Returns the value of tgt152
	 *	@return tgt152
	 */
	public long getTgt152() throws CFException {        
   		return work.getTgt152();
	}
	
	/**
	 * 	Update Tgt152 with the passed value
	 *	@param number
	 */
	public void setTgt152(long number)  throws CFException{
		work.setTgt152(number);
	}



	/**
	 *	Returns the value of src151
	 *	@return src151
	 */
	public long getSrc151() throws CFException {
   		return work.getSrc151();
	}

    /**
	 *	Returns the String value of src151
	 *	@return src151
	 */
	public char[]  getSrc151ActualString() {
		return work.getSrc151ActualString();
	}

	/**
	 *	Returns String value of src151
	 *	@return src151
	 */
	public char[]  getSrc151String() throws CFException {
	     return String.valueOf(work.getSrc151String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src151IsNumeric()  throws CFException{
	    return work.src151IsNumeric();
	}

	/**
	 * 	Update Src151 with the passed value
	 *	@param number
	 */
	public void setSrc151(long number)  throws CFException{
		work.setSrc151(number);
	}
	

	
	/**
	 * 	Update Src151 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc151(char[] value)  throws CFException {
		work.setSrc151(value);
	}
	
	/**
	 * 	Update Src151 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc151String(char[] value)  throws CFException{
		work.setSrc151(value);
	}	

	/**
	 *	Returns the value of src150
	 *	@return src150
	 */
	public long getSrc150() throws CFException {
   		return work.getSrc150();
	}


	/**
	 *	Returns String value of src150
	 *	@return src150
	 */
	public char[]  getSrc150String() throws CFException {
	     return String.valueOf(work.getSrc150String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src150IsNumeric()  throws CFException{
	    return work.src150IsNumeric();
	}

	/**
	 * 	Update Src150 with the passed value
	 *	@param number
	 */
	public void setSrc150(long number)  throws CFException{
		work.setSrc150(number);
	}
	

	
	/**
	 * 	Update Src150 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc150(char[] value)  throws CFException {
		work.setSrc150(value);
	}
	
	/**
	 * 	Update Src150 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc150String(char[] value)  throws CFException{
		work.setSrc150(value);
	}	

	/**
	 *	Returns the value of tgt151
	 *	@return tgt151
	 */
	public int getTgt151() throws CFException {        
   		return work.getTgt151();
	}
	
	/**
	 * 	Update Tgt151 with the passed value
	 *	@param number
	 */
	public void setTgt151(int number)  throws CFException{
		work.setTgt151(number);
	}


	public void setTgt151(long number)  throws CFException{
		work.setTgt151((int)number);
	}


	/**
	 *	Returns the value of tgt150
	 *	@return tgt150
	 */
	public int getTgt150() throws CFException {
   		return work.getTgt150();
	}

    /**
	 *	Returns the String value of tgt150
	 *	@return tgt150
	 */
	public char[]  getTgt150ActualString() {
		return work.getTgt150ActualString();
	}

	/**
	 *	Returns String value of tgt150
	 *	@return tgt150
	 */
	public char[]  getTgt150String() throws CFException {
	     return String.valueOf(work.getTgt150String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt150IsNumeric()  throws CFException{
	    return work.tgt150IsNumeric();
	}

	/**
	 * 	Update Tgt150 with the passed value
	 *	@param number
	 */
	public void setTgt150(int number)  throws CFException{
		work.setTgt150(number);
	}
	

	public void setTgt150(long number)  throws CFException{
	    work.setTgt150(number);
	}
	
	
	/**
	 * 	Update Tgt150 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt150(char[] value)  throws CFException {
		work.setTgt150(value);
	}
	
	/**
	 * 	Update Tgt150 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt150String(char[] value)  throws CFException{
		work.setTgt150(value);
	}	

	/**
	 *	Returns the value of src149
	 *	@return src149
	 */
	public long getSrc149() throws CFException {
   		return work.getSrc149();
	}


	/**
	 *	Returns String value of src149
	 *	@return src149
	 */
	public char[]  getSrc149String() throws CFException {
	     return String.valueOf(work.getSrc149String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src149IsNumeric()  throws CFException{
	    return work.src149IsNumeric();
	}

	/**
	 * 	Update Src149 with the passed value
	 *	@param number
	 */
	public void setSrc149(long number)  throws CFException{
		work.setSrc149(number);
	}
	

	
	/**
	 * 	Update Src149 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc149(char[] value)  throws CFException {
		work.setSrc149(value);
	}
	
	/**
	 * 	Update Src149 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc149String(char[] value)  throws CFException{
		work.setSrc149(value);
	}	

	/**
	 *	Returns the value of src148
	 *	@return src148
	 */
	public long getSrc148() throws CFException {
   		return work.getSrc148();
	}


	/**
	 *	Returns String value of src148
	 *	@return src148
	 */
	public char[]  getSrc148String() throws CFException {
	     return String.valueOf(work.getSrc148String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src148IsNumeric()  throws CFException{
	    return work.src148IsNumeric();
	}

	/**
	 * 	Update Src148 with the passed value
	 *	@param number
	 */
	public void setSrc148(long number)  throws CFException{
		work.setSrc148(number);
	}
	

	
	/**
	 * 	Update Src148 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc148(char[] value)  throws CFException {
		work.setSrc148(value);
	}
	
	/**
	 * 	Update Src148 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc148String(char[] value)  throws CFException{
		work.setSrc148(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process33Split110OutCtx clone() {
        Process33Split110OutCtx cloneObj = new Process33Split110OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process33Split110OutCtx getProcess33Split110OutCtx() {
            return new Process33Split110OutCtx();
    }
     public class Process34Split112InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process34Split112OutCtx getProcess34Split112OutCtx() {
            return new Process34Split112OutCtx();
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

    public Process34Split112InCtx clone() {
        Process34Split112InCtx cloneObj = new Process34Split112InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process34Split112InCtx getProcess34Split112InCtx() {
            return new Process34Split112InCtx();
    }
     public class Process34Split112OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src153
	 *	@return src153
	 */
	public long getSrc153() throws CFException {
   		return work.getSrc153();
	}

    /**
	 *	Returns the String value of src153
	 *	@return src153
	 */
	public char[]  getSrc153ActualString() {
		return work.getSrc153ActualString();
	}

	/**
	 *	Returns String value of src153
	 *	@return src153
	 */
	public char[]  getSrc153String() throws CFException {
	     return String.valueOf(work.getSrc153String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src153IsNumeric()  throws CFException{
	    return work.src153IsNumeric();
	}

	/**
	 * 	Update Src153 with the passed value
	 *	@param number
	 */
	public void setSrc153(long number)  throws CFException{
		work.setSrc153(number);
	}
	

	
	/**
	 * 	Update Src153 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc153(char[] value)  throws CFException {
		work.setSrc153(value);
	}
	
	/**
	 * 	Update Src153 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc153String(char[] value)  throws CFException{
		work.setSrc153(value);
	}	

	/**
	 *	Returns the value of src154
	 *	@return src154
	 */
	public long getSrc154() throws CFException {
   		return work.getSrc154();
	}

    /**
	 *	Returns the String value of src154
	 *	@return src154
	 */
	public char[]  getSrc154ActualString() {
		return work.getSrc154ActualString();
	}

	/**
	 *	Returns String value of src154
	 *	@return src154
	 */
	public char[]  getSrc154String() throws CFException {
	     return String.valueOf(work.getSrc154String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src154IsNumeric()  throws CFException{
	    return work.src154IsNumeric();
	}

	/**
	 * 	Update Src154 with the passed value
	 *	@param number
	 */
	public void setSrc154(long number)  throws CFException{
		work.setSrc154(number);
	}
	

	
	/**
	 * 	Update Src154 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc154(char[] value)  throws CFException {
		work.setSrc154(value);
	}
	
	/**
	 * 	Update Src154 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc154String(char[] value)  throws CFException{
		work.setSrc154(value);
	}	

	/**
	 *	Returns the value of src152
	 *	@return src152
	 */
	public long getSrc152() throws CFException {
   		return work.getSrc152();
	}

    /**
	 *	Returns the String value of src152
	 *	@return src152
	 */
	public char[]  getSrc152ActualString() {
		return work.getSrc152ActualString();
	}

	/**
	 *	Returns String value of src152
	 *	@return src152
	 */
	public char[]  getSrc152String() throws CFException {
	     return String.valueOf(work.getSrc152String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src152IsNumeric()  throws CFException{
	    return work.src152IsNumeric();
	}

	/**
	 * 	Update Src152 with the passed value
	 *	@param number
	 */
	public void setSrc152(long number)  throws CFException{
		work.setSrc152(number);
	}
	

	
	/**
	 * 	Update Src152 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc152(char[] value)  throws CFException {
		work.setSrc152(value);
	}
	
	/**
	 * 	Update Src152 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc152String(char[] value)  throws CFException{
		work.setSrc152(value);
	}	

	/**
	 *	Returns the value of tgt153
	 *	@return tgt153
	 */
	public long getTgt153() throws CFException {        
   		return work.getTgt153();
	}
	
	/**
	 * 	Update Tgt153 with the passed value
	 *	@param number
	 */
	public void setTgt153(long number)  throws CFException{
		work.setTgt153(number);
	}



	/**
	 *	Returns the value of tgt152
	 *	@return tgt152
	 */
	public long getTgt152() throws CFException {        
   		return work.getTgt152();
	}
	
	/**
	 * 	Update Tgt152 with the passed value
	 *	@param number
	 */
	public void setTgt152(long number)  throws CFException{
		work.setTgt152(number);
	}



	/**
	 *	Returns the value of tgt155
	 *	@return tgt155
	 */
	public short getTgt155() throws CFException {        
   		return work.getTgt155();
	}
	
	/**
	 * 	Update Tgt155 with the passed value
	 *	@param number
	 */
	public void setTgt155(short number)  throws CFException{
		work.setTgt155(number);
	}

	public void setTgt155(int number)  throws CFException{
		work.setTgt155((short)number);
	}

	public void setTgt155(long number)  throws CFException{
		work.setTgt155((short)number);
	}



	/**
	 *	Returns the value of tgt156
	 *	@return tgt156
	 */
	public int getTgt156() throws CFException {        
   		return work.getTgt156();
	}
	
	/**
	 * 	Update Tgt156 with the passed value
	 *	@param number
	 */
	public void setTgt156(int number)  throws CFException{
		work.setTgt156(number);
	}


	public void setTgt156(long number)  throws CFException{
		work.setTgt156((int)number);
	}


	/**
	 *	Returns the value of tgt154
	 *	@return tgt154
	 */
	public long getTgt154() throws CFException {        
   		return work.getTgt154();
	}
	
	/**
	 * 	Update Tgt154 with the passed value
	 *	@param number
	 */
	public void setTgt154(long number)  throws CFException{
		work.setTgt154(number);
	}



	/**
	 *	Returns the value of src155
	 *	@return src155
	 */
	public long getSrc155() throws CFException {
   		return work.getSrc155();
	}

    /**
	 *	Returns the String value of src155
	 *	@return src155
	 */
	public char[]  getSrc155ActualString() {
		return work.getSrc155ActualString();
	}

	/**
	 *	Returns String value of src155
	 *	@return src155
	 */
	public char[]  getSrc155String() throws CFException {
	     return String.valueOf(work.getSrc155String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src155IsNumeric()  throws CFException{
	    return work.src155IsNumeric();
	}

	/**
	 * 	Update Src155 with the passed value
	 *	@param number
	 */
	public void setSrc155(long number)  throws CFException{
		work.setSrc155(number);
	}
	

	
	/**
	 * 	Update Src155 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc155(char[] value)  throws CFException {
		work.setSrc155(value);
	}
	
	/**
	 * 	Update Src155 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc155String(char[] value)  throws CFException{
		work.setSrc155(value);
	}	

	/**
	 *	Returns the value of src156
	 *	@return src156
	 */
	public long getSrc156() throws CFException {
   		return work.getSrc156();
	}

    /**
	 *	Returns the String value of src156
	 *	@return src156
	 */
	public char[]  getSrc156ActualString() {
		return work.getSrc156ActualString();
	}

	/**
	 *	Returns String value of src156
	 *	@return src156
	 */
	public char[]  getSrc156String() throws CFException {
	     return String.valueOf(work.getSrc156String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src156IsNumeric()  throws CFException{
	    return work.src156IsNumeric();
	}

	/**
	 * 	Update Src156 with the passed value
	 *	@param number
	 */
	public void setSrc156(long number)  throws CFException{
		work.setSrc156(number);
	}
	

	
	/**
	 * 	Update Src156 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc156(char[] value)  throws CFException {
		work.setSrc156(value);
	}
	
	/**
	 * 	Update Src156 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc156String(char[] value)  throws CFException{
		work.setSrc156(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process34Split112OutCtx clone() {
        Process34Split112OutCtx cloneObj = new Process34Split112OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process34Split112OutCtx getProcess34Split112OutCtx() {
            return new Process34Split112OutCtx();
    }
     public class Process35Split114InCtx implements Cloneable {
     Src160Grp src160Grp = S918testCtx.this.getSrc160Grp();
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt160
	 *	@return tgt160
	 */
	public long getTgt160() throws CFException {
   		return work.getTgt160();
	}


	/**
	 *	Returns String value of tgt160
	 *	@return tgt160
	 */
	public char[]  getTgt160String() throws CFException {
	     return String.valueOf(work.getTgt160String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt160IsNumeric()  throws CFException{
	    return work.tgt160IsNumeric();
	}

	/**
	 * 	Update Tgt160 with the passed value
	 *	@param number
	 */
	public void setTgt160(long number)  throws CFException{
		work.setTgt160(number);
	}
	

	
	/**
	 * 	Update Tgt160 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt160(char[] value)  throws CFException {
		work.setTgt160(value);
	}
	
	/**
	 * 	Update Tgt160 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt160String(char[] value)  throws CFException{
		work.setTgt160(value);
	}	

	/**
	 *	Returns the value of tgt159
	 *	@return tgt159
	 */
	public long getTgt159() throws CFException {
   		return work.getTgt159();
	}


	/**
	 *	Returns String value of tgt159
	 *	@return tgt159
	 */
	public char[]  getTgt159String() throws CFException {
	     return String.valueOf(work.getTgt159String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt159IsNumeric()  throws CFException{
	    return work.tgt159IsNumeric();
	}

	/**
	 * 	Update Tgt159 with the passed value
	 *	@param number
	 */
	public void setTgt159(long number)  throws CFException{
		work.setTgt159(number);
	}
	

	
	/**
	 * 	Update Tgt159 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt159(char[] value)  throws CFException {
		work.setTgt159(value);
	}
	
	/**
	 * 	Update Tgt159 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt159String(char[] value)  throws CFException{
		work.setTgt159(value);
	}	

	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	

	/**
	 *	Returns the value of src160
	 *	@return src160
	 */
	public short getSrc160(int index) throws CFException {        
   		return src160Grp.getSrc160((index));
	}
	
	/**
	 * 	Update Src160 with the passed value
	 *	@param number
	 */
	public void setSrc160(int index,short number)  throws CFException{
		src160Grp.setSrc160((index),number);
	}

	public void setSrc160(int index,int number)  throws CFException{
		src160Grp.setSrc160((index),(short)number);
	}

	public void setSrc160(int index,long number)  throws CFException{
		src160Grp.setSrc160((index),(short)number);
	}



	/**
	 *	Returns the value of src159
	 *	@return src159
	 */
	public short getSrc159() throws CFException {        
   		return work.getSrc159();
	}
	
	/**
	 * 	Update Src159 with the passed value
	 *	@param number
	 */
	public void setSrc159(short number)  throws CFException{
		work.setSrc159(number);
	}

	public void setSrc159(int number)  throws CFException{
		work.setSrc159((short)number);
	}

	public void setSrc159(long number)  throws CFException{
		work.setSrc159((short)number);
	}



	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process35Split114OutCtx getProcess35Split114OutCtx() {
            return new Process35Split114OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src160Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process35Split114InCtx clone() {
        Process35Split114InCtx cloneObj = new Process35Split114InCtx();
        cloneObj.src160Grp = new Src160Grp();
        cloneObj.src160Grp.set(src160Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process35Split114InCtx getProcess35Split114InCtx() {
            return new Process35Split114InCtx();
    }
     public class Process35Split114OutCtx implements Cloneable {
     Src160Grp src160Grp = S918testCtx.this.getSrc160Grp();
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt160
	 *	@return tgt160
	 */
	public long getTgt160() throws CFException {
   		return work.getTgt160();
	}


	/**
	 *	Returns String value of tgt160
	 *	@return tgt160
	 */
	public char[]  getTgt160String() throws CFException {
	     return String.valueOf(work.getTgt160String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt160IsNumeric()  throws CFException{
	    return work.tgt160IsNumeric();
	}

	/**
	 * 	Update Tgt160 with the passed value
	 *	@param number
	 */
	public void setTgt160(long number)  throws CFException{
		work.setTgt160(number);
	}
	

	
	/**
	 * 	Update Tgt160 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt160(char[] value)  throws CFException {
		work.setTgt160(value);
	}
	
	/**
	 * 	Update Tgt160 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt160String(char[] value)  throws CFException{
		work.setTgt160(value);
	}	

	/**
	 *	Returns the value of tgt157
	 *	@return tgt157
	 */
	public long getTgt157() throws CFException {
   		return work.getTgt157();
	}


	/**
	 *	Returns String value of tgt157
	 *	@return tgt157
	 */
	public char[]  getTgt157String() throws CFException {
	     return String.valueOf(work.getTgt157String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt157IsNumeric()  throws CFException{
	    return work.tgt157IsNumeric();
	}

	/**
	 * 	Update Tgt157 with the passed value
	 *	@param number
	 */
	public void setTgt157(long number)  throws CFException{
		work.setTgt157(number);
	}
	

	
	/**
	 * 	Update Tgt157 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt157(char[] value)  throws CFException {
		work.setTgt157(value);
	}
	
	/**
	 * 	Update Tgt157 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt157String(char[] value)  throws CFException{
		work.setTgt157(value);
	}	

	/**
	 *	Returns the value of src158
	 *	@return src158
	 */
	public long getSrc158() throws CFException {
   		return work.getSrc158();
	}


	/**
	 *	Returns String value of src158
	 *	@return src158
	 */
	public char[]  getSrc158String() throws CFException {
	     return String.valueOf(work.getSrc158String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src158IsNumeric()  throws CFException{
	    return work.src158IsNumeric();
	}

	/**
	 * 	Update Src158 with the passed value
	 *	@param number
	 */
	public void setSrc158(long number)  throws CFException{
		work.setSrc158(number);
	}
	

	
	/**
	 * 	Update Src158 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc158(char[] value)  throws CFException {
		work.setSrc158(value);
	}
	
	/**
	 * 	Update Src158 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc158String(char[] value)  throws CFException{
		work.setSrc158(value);
	}	

	/**
	 *	Returns the value of src157
	 *	@return src157
	 */
	public long getSrc157() throws CFException {
   		return work.getSrc157();
	}

    /**
	 *	Returns the String value of src157
	 *	@return src157
	 */
	public char[]  getSrc157ActualString() {
		return work.getSrc157ActualString();
	}

	/**
	 *	Returns String value of src157
	 *	@return src157
	 */
	public char[]  getSrc157String() throws CFException {
	     return String.valueOf(work.getSrc157String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src157IsNumeric()  throws CFException{
	    return work.src157IsNumeric();
	}

	/**
	 * 	Update Src157 with the passed value
	 *	@param number
	 */
	public void setSrc157(long number)  throws CFException{
		work.setSrc157(number);
	}
	

	
	/**
	 * 	Update Src157 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc157(char[] value)  throws CFException {
		work.setSrc157(value);
	}
	
	/**
	 * 	Update Src157 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc157String(char[] value)  throws CFException{
		work.setSrc157(value);
	}	

	/**
	 *	Returns the value of tgt156
	 *	@return tgt156
	 */
	public int getTgt156() throws CFException {        
   		return work.getTgt156();
	}
	
	/**
	 * 	Update Tgt156 with the passed value
	 *	@param number
	 */
	public void setTgt156(int number)  throws CFException{
		work.setTgt156(number);
	}


	public void setTgt156(long number)  throws CFException{
		work.setTgt156((int)number);
	}


	/**
	 *	Returns the value of tgt159
	 *	@return tgt159
	 */
	public long getTgt159() throws CFException {
   		return work.getTgt159();
	}


	/**
	 *	Returns String value of tgt159
	 *	@return tgt159
	 */
	public char[]  getTgt159String() throws CFException {
	     return String.valueOf(work.getTgt159String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt159IsNumeric()  throws CFException{
	    return work.tgt159IsNumeric();
	}

	/**
	 * 	Update Tgt159 with the passed value
	 *	@param number
	 */
	public void setTgt159(long number)  throws CFException{
		work.setTgt159(number);
	}
	

	
	/**
	 * 	Update Tgt159 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt159(char[] value)  throws CFException {
		work.setTgt159(value);
	}
	
	/**
	 * 	Update Tgt159 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt159String(char[] value)  throws CFException{
		work.setTgt159(value);
	}	

	/**
	 *	Returns the value of src160
	 *	@return src160
	 */
	public short getSrc160(int index) throws CFException {        
   		return src160Grp.getSrc160((index));
	}
	
	/**
	 * 	Update Src160 with the passed value
	 *	@param number
	 */
	public void setSrc160(int index,short number)  throws CFException{
		src160Grp.setSrc160((index),number);
	}

	public void setSrc160(int index,int number)  throws CFException{
		src160Grp.setSrc160((index),(short)number);
	}

	public void setSrc160(int index,long number)  throws CFException{
		src160Grp.setSrc160((index),(short)number);
	}



	/**
	 *	Returns the value of tgt158
	 *	@return tgt158
	 */
	public int getTgt158() throws CFException {
   		return work.getTgt158();
	}

    /**
	 *	Returns the String value of tgt158
	 *	@return tgt158
	 */
	public char[]  getTgt158ActualString() {
		return work.getTgt158ActualString();
	}

	/**
	 *	Returns String value of tgt158
	 *	@return tgt158
	 */
	public char[]  getTgt158String() throws CFException {
	     return String.valueOf(work.getTgt158String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt158IsNumeric()  throws CFException{
	    return work.tgt158IsNumeric();
	}

	/**
	 * 	Update Tgt158 with the passed value
	 *	@param number
	 */
	public void setTgt158(int number)  throws CFException{
		work.setTgt158(number);
	}
	

	public void setTgt158(long number)  throws CFException{
	    work.setTgt158(number);
	}
	
	
	/**
	 * 	Update Tgt158 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt158(char[] value)  throws CFException {
		work.setTgt158(value);
	}
	
	/**
	 * 	Update Tgt158 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt158String(char[] value)  throws CFException{
		work.setTgt158(value);
	}	

	/**
	 *	Returns the value of src159
	 *	@return src159
	 */
	public short getSrc159() throws CFException {        
   		return work.getSrc159();
	}
	
	/**
	 * 	Update Src159 with the passed value
	 *	@param number
	 */
	public void setSrc159(short number)  throws CFException{
		work.setSrc159(number);
	}

	public void setSrc159(int number)  throws CFException{
		work.setSrc159((short)number);
	}

	public void setSrc159(long number)  throws CFException{
		work.setSrc159((short)number);
	}



	/**
	 *	Returns the value of src156
	 *	@return src156
	 */
	public long getSrc156() throws CFException {
   		return work.getSrc156();
	}

    /**
	 *	Returns the String value of src156
	 *	@return src156
	 */
	public char[]  getSrc156ActualString() {
		return work.getSrc156ActualString();
	}

	/**
	 *	Returns String value of src156
	 *	@return src156
	 */
	public char[]  getSrc156String() throws CFException {
	     return String.valueOf(work.getSrc156String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean src156IsNumeric()  throws CFException{
	    return work.src156IsNumeric();
	}

	/**
	 * 	Update Src156 with the passed value
	 *	@param number
	 */
	public void setSrc156(long number)  throws CFException{
		work.setSrc156(number);
	}
	

	
	/**
	 * 	Update Src156 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrc156(char[] value)  throws CFException {
		work.setSrc156(value);
	}
	
	/**
	 * 	Update Src156 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrc156String(char[] value)  throws CFException{
		work.setSrc156(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src160Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process35Split114OutCtx clone() {
        Process35Split114OutCtx cloneObj = new Process35Split114OutCtx();
        cloneObj.src160Grp = new Src160Grp();
        cloneObj.src160Grp.set(src160Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process35Split114OutCtx getProcess35Split114OutCtx() {
            return new Process35Split114OutCtx();
    }
     public class Process36Split116InCtx implements Cloneable {
     Src166Grp src166Grp = S918testCtx.this.getSrc166Grp();
     Tgt165Grp tgt165Grp = S918testCtx.this.getTgt165Grp();
     Src162Grp src162Grp = S918testCtx.this.getSrc162Grp();
     Tgt162Grp tgt162Grp = S918testCtx.this.getTgt162Grp();
     Src164Grp src164Grp = S918testCtx.this.getSrc164Grp();
     Work work = S918testCtx.this.getWork();
     Tgt161Grp tgt161Grp = S918testCtx.this.getTgt161Grp();

	/**
	 *	Returns the value of tgt164
	 *	@return tgt164
	 */
	public long getTgt164() throws CFException {
   		return work.getTgt164();
	}


	/**
	 *	Returns String value of tgt164
	 *	@return tgt164
	 */
	public char[]  getTgt164String() throws CFException {
	     return String.valueOf(work.getTgt164String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt164IsNumeric()  throws CFException{
	    return work.tgt164IsNumeric();
	}

	/**
	 * 	Update Tgt164 with the passed value
	 *	@param number
	 */
	public void setTgt164(long number)  throws CFException{
		work.setTgt164(number);
	}
	

	
	/**
	 * 	Update Tgt164 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt164(char[] value)  throws CFException {
		work.setTgt164(value);
	}
	
	/**
	 * 	Update Tgt164 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt164String(char[] value)  throws CFException{
		work.setTgt164(value);
	}	

	/**
	 *	Returns the value of tgt165Grp
	 *	@return tgt165Grp
	 */   
	 public Tgt165Grp getTgt165Grp() {
   	return tgt165Grp;
   }


	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of tgt163
	 *	@return tgt163
	 */
	public long getTgt163() throws CFException {
   		return work.getTgt163();
	}


	/**
	 *	Returns String value of tgt163
	 *	@return tgt163
	 */
	public char[]  getTgt163String() throws CFException {
	     return String.valueOf(work.getTgt163String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt163IsNumeric()  throws CFException{
	    return work.tgt163IsNumeric();
	}

	/**
	 * 	Update Tgt163 with the passed value
	 *	@param number
	 */
	public void setTgt163(long number)  throws CFException{
		work.setTgt163(number);
	}
	

	
	/**
	 * 	Update Tgt163 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt163(char[] value)  throws CFException {
		work.setTgt163(value);
	}
	
	/**
	 * 	Update Tgt163 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt163String(char[] value)  throws CFException{
		work.setTgt163(value);
	}	

	/**
	 *	Returns the value of tgt165
	 *	@return tgt165
	 */
	public long getTgt165(int index) throws CFException {
   		return tgt165Grp.getTgt165((index));
	}


	/**
	 *	Returns String value of tgt165
	 *	@return tgt165
	 */
	public char[]  getTgt165String(int index) throws CFException {
	     return String.valueOf(tgt165Grp.getTgt165String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt165IsNumeric(int index)  throws CFException{
	    return tgt165Grp.tgt165IsNumeric(index);
	}

	/**
	 * 	Update Tgt165 with the passed value
	 *	@param number
	 */
	public void setTgt165(int index,long number)  throws CFException{
		tgt165Grp.setTgt165((index),number);
	}
	

	
	/**
	 * 	Update Tgt165 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt165(int index,char[] value)  throws CFException {
		tgt165Grp.setTgt165((index),value);
	}
	
	/**
	 * 	Update Tgt165 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt165String(int index,char[] value)  throws CFException{
		tgt165Grp.setTgt165((index),value);
	}	

	/**
	 *	Returns the value of src165
	 *	@return src165
	 */
	public int getSrc165() throws CFException {        
   		return work.getSrc165();
	}
	
	/**
	 * 	Update Src165 with the passed value
	 *	@param number
	 */
	public void setSrc165(int number)  throws CFException{
		work.setSrc165(number);
	}


	public void setSrc165(long number)  throws CFException{
		work.setSrc165((int)number);
	}


	/**
	 *	Returns the value of tgt161
	 *	@return tgt161
	 */
	public long getTgt161(int index) throws CFException {
   		return tgt161Grp.getTgt161((index));
	}


	/**
	 *	Returns String value of tgt161
	 *	@return tgt161
	 */
	public char[]  getTgt161String(int index) throws CFException {
	     return String.valueOf(tgt161Grp.getTgt161String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt161IsNumeric(int index)  throws CFException{
	    return tgt161Grp.tgt161IsNumeric(index);
	}

	/**
	 * 	Update Tgt161 with the passed value
	 *	@param number
	 */
	public void setTgt161(int index,long number)  throws CFException{
		tgt161Grp.setTgt161((index),number);
	}
	

	
	/**
	 * 	Update Tgt161 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt161(int index,char[] value)  throws CFException {
		tgt161Grp.setTgt161((index),value);
	}
	
	/**
	 * 	Update Tgt161 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt161String(int index,char[] value)  throws CFException{
		tgt161Grp.setTgt161((index),value);
	}	

	/**
	 *	Returns the value of tgt162
	 *	@return tgt162
	 */
	public long getTgt162(int index) throws CFException {
   		return tgt162Grp.getTgt162((index));
	}


	/**
	 *	Returns String value of tgt162
	 *	@return tgt162
	 */
	public char[]  getTgt162String(int index) throws CFException {
	     return String.valueOf(tgt162Grp.getTgt162String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt162IsNumeric(int index)  throws CFException{
	    return tgt162Grp.tgt162IsNumeric(index);
	}

	/**
	 * 	Update Tgt162 with the passed value
	 *	@param number
	 */
	public void setTgt162(int index,long number)  throws CFException{
		tgt162Grp.setTgt162((index),number);
	}
	

	
	/**
	 * 	Update Tgt162 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt162(int index,char[] value)  throws CFException {
		tgt162Grp.setTgt162((index),value);
	}
	
	/**
	 * 	Update Tgt162 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt162String(int index,char[] value)  throws CFException{
		tgt162Grp.setTgt162((index),value);
	}	

	/**
	 *	Returns the value of src162
	 *	@return src162
	 */
	public short getSrc162(int index) throws CFException {        
   		return src162Grp.getSrc162((index));
	}
	
	/**
	 * 	Update Src162 with the passed value
	 *	@param number
	 */
	public void setSrc162(int index,short number)  throws CFException{
		src162Grp.setSrc162((index),number);
	}

	public void setSrc162(int index,int number)  throws CFException{
		src162Grp.setSrc162((index),(short)number);
	}

	public void setSrc162(int index,long number)  throws CFException{
		src162Grp.setSrc162((index),(short)number);
	}



	/**
	 *	Returns the value of tgt162Grp
	 *	@return tgt162Grp
	 */   
	 public Tgt162Grp getTgt162Grp() {
   	return tgt162Grp;
   }


	/**
	 *	Returns the value of src163
	 *	@return src163
	 */
	public int getSrc163() throws CFException {        
   		return work.getSrc163();
	}
	
	/**
	 * 	Update Src163 with the passed value
	 *	@param number
	 */
	public void setSrc163(int number)  throws CFException{
		work.setSrc163(number);
	}


	public void setSrc163(long number)  throws CFException{
		work.setSrc163((int)number);
	}


	/**
	 *	Returns the value of src164
	 *	@return src164
	 */
	public int getSrc164(int index) throws CFException {        
   		return src164Grp.getSrc164((index));
	}
	
	/**
	 * 	Update Src164 with the passed value
	 *	@param number
	 */
	public void setSrc164(int index,int number)  throws CFException{
		src164Grp.setSrc164((index),number);
	}


	public void setSrc164(int index,long number)  throws CFException{
		src164Grp.setSrc164((index),(int)number);
	}


	/**
	 *	Returns the value of src161
	 *	@return src161
	 */
	public short getSrc161() throws CFException {        
   		return work.getSrc161();
	}
	
	/**
	 * 	Update Src161 with the passed value
	 *	@param number
	 */
	public void setSrc161(short number)  throws CFException{
		work.setSrc161(number);
	}

	public void setSrc161(int number)  throws CFException{
		work.setSrc161((short)number);
	}

	public void setSrc161(long number)  throws CFException{
		work.setSrc161((short)number);
	}



	/**
	 *	Returns the value of tgt161Grp
	 *	@return tgt161Grp
	 */   
	 public Tgt161Grp getTgt161Grp() {
   	return tgt161Grp;
   }



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process36Split116OutCtx getProcess36Split116OutCtx() {
            return new Process36Split116OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src166Grp.hashCode();
        str += tgt165Grp.hashCode();
        str += src162Grp.hashCode();
        str += tgt162Grp.hashCode();
        str += src164Grp.hashCode();
        str += work.hashCode();
        str += tgt161Grp.hashCode();
       return str.hashCode();
    }

    public Process36Split116InCtx clone() {
        Process36Split116InCtx cloneObj = new Process36Split116InCtx();
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt165Grp = new Tgt165Grp();
        cloneObj.tgt165Grp.set(tgt165Grp.getClonedField());
        cloneObj.src162Grp = new Src162Grp();
        cloneObj.src162Grp.set(src162Grp.getClonedField());
        cloneObj.tgt162Grp = new Tgt162Grp();
        cloneObj.tgt162Grp.set(tgt162Grp.getClonedField());
        cloneObj.src164Grp = new Src164Grp();
        cloneObj.src164Grp.set(src164Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt161Grp = new Tgt161Grp();
        cloneObj.tgt161Grp.set(tgt161Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process36Split116InCtx getProcess36Split116InCtx() {
            return new Process36Split116InCtx();
    }
     public class Process36Split116OutCtx implements Cloneable {
     Src166Grp src166Grp = S918testCtx.this.getSrc166Grp();
     Tgt165Grp tgt165Grp = S918testCtx.this.getTgt165Grp();
     Src162Grp src162Grp = S918testCtx.this.getSrc162Grp();
     Tgt162Grp tgt162Grp = S918testCtx.this.getTgt162Grp();
     Src164Grp src164Grp = S918testCtx.this.getSrc164Grp();
     Work work = S918testCtx.this.getWork();
     Tgt161Grp tgt161Grp = S918testCtx.this.getTgt161Grp();

	/**
	 *	Returns the value of src165
	 *	@return src165
	 */
	public int getSrc165() throws CFException {        
   		return work.getSrc165();
	}
	
	/**
	 * 	Update Src165 with the passed value
	 *	@param number
	 */
	public void setSrc165(int number)  throws CFException{
		work.setSrc165(number);
	}


	public void setSrc165(long number)  throws CFException{
		work.setSrc165((int)number);
	}


	/**
	 *	Returns the value of tgt164
	 *	@return tgt164
	 */
	public long getTgt164() throws CFException {
   		return work.getTgt164();
	}


	/**
	 *	Returns String value of tgt164
	 *	@return tgt164
	 */
	public char[]  getTgt164String() throws CFException {
	     return String.valueOf(work.getTgt164String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt164IsNumeric()  throws CFException{
	    return work.tgt164IsNumeric();
	}

	/**
	 * 	Update Tgt164 with the passed value
	 *	@param number
	 */
	public void setTgt164(long number)  throws CFException{
		work.setTgt164(number);
	}
	

	
	/**
	 * 	Update Tgt164 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt164(char[] value)  throws CFException {
		work.setTgt164(value);
	}
	
	/**
	 * 	Update Tgt164 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt164String(char[] value)  throws CFException{
		work.setTgt164(value);
	}	

	/**
	 *	Returns the value of tgt161
	 *	@return tgt161
	 */
	public long getTgt161(int index) throws CFException {
   		return tgt161Grp.getTgt161((index));
	}


	/**
	 *	Returns String value of tgt161
	 *	@return tgt161
	 */
	public char[]  getTgt161String(int index) throws CFException {
	     return String.valueOf(tgt161Grp.getTgt161String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt161IsNumeric(int index)  throws CFException{
	    return tgt161Grp.tgt161IsNumeric(index);
	}

	/**
	 * 	Update Tgt161 with the passed value
	 *	@param number
	 */
	public void setTgt161(int index,long number)  throws CFException{
		tgt161Grp.setTgt161((index),number);
	}
	

	
	/**
	 * 	Update Tgt161 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt161(int index,char[] value)  throws CFException {
		tgt161Grp.setTgt161((index),value);
	}
	
	/**
	 * 	Update Tgt161 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt161String(int index,char[] value)  throws CFException{
		tgt161Grp.setTgt161((index),value);
	}	

	/**
	 *	Returns the value of tgt162
	 *	@return tgt162
	 */
	public long getTgt162(int index) throws CFException {
   		return tgt162Grp.getTgt162((index));
	}


	/**
	 *	Returns String value of tgt162
	 *	@return tgt162
	 */
	public char[]  getTgt162String(int index) throws CFException {
	     return String.valueOf(tgt162Grp.getTgt162String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt162IsNumeric(int index)  throws CFException{
	    return tgt162Grp.tgt162IsNumeric(index);
	}

	/**
	 * 	Update Tgt162 with the passed value
	 *	@param number
	 */
	public void setTgt162(int index,long number)  throws CFException{
		tgt162Grp.setTgt162((index),number);
	}
	

	
	/**
	 * 	Update Tgt162 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt162(int index,char[] value)  throws CFException {
		tgt162Grp.setTgt162((index),value);
	}
	
	/**
	 * 	Update Tgt162 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt162String(int index,char[] value)  throws CFException{
		tgt162Grp.setTgt162((index),value);
	}	

	/**
	 *	Returns the value of src162
	 *	@return src162
	 */
	public short getSrc162(int index) throws CFException {        
   		return src162Grp.getSrc162((index));
	}
	
	/**
	 * 	Update Src162 with the passed value
	 *	@param number
	 */
	public void setSrc162(int index,short number)  throws CFException{
		src162Grp.setSrc162((index),number);
	}

	public void setSrc162(int index,int number)  throws CFException{
		src162Grp.setSrc162((index),(short)number);
	}

	public void setSrc162(int index,long number)  throws CFException{
		src162Grp.setSrc162((index),(short)number);
	}



	/**
	 *	Returns the value of src166
	 *	@return src166
	 */
	public int getSrc166(int index) throws CFException {        
   		return src166Grp.getSrc166((index));
	}
	
	/**
	 * 	Update Src166 with the passed value
	 *	@param number
	 */
	public void setSrc166(int index,int number)  throws CFException{
		src166Grp.setSrc166((index),number);
	}


	public void setSrc166(int index,long number)  throws CFException{
		src166Grp.setSrc166((index),(int)number);
	}


	/**
	 *	Returns the value of src163
	 *	@return src163
	 */
	public int getSrc163() throws CFException {        
   		return work.getSrc163();
	}
	
	/**
	 * 	Update Src163 with the passed value
	 *	@param number
	 */
	public void setSrc163(int number)  throws CFException{
		work.setSrc163(number);
	}


	public void setSrc163(long number)  throws CFException{
		work.setSrc163((int)number);
	}


	/**
	 *	Returns the value of src164
	 *	@return src164
	 */
	public int getSrc164(int index) throws CFException {        
   		return src164Grp.getSrc164((index));
	}
	
	/**
	 * 	Update Src164 with the passed value
	 *	@param number
	 */
	public void setSrc164(int index,int number)  throws CFException{
		src164Grp.setSrc164((index),number);
	}


	public void setSrc164(int index,long number)  throws CFException{
		src164Grp.setSrc164((index),(int)number);
	}


	/**
	 *	Returns the value of src161
	 *	@return src161
	 */
	public short getSrc161() throws CFException {        
   		return work.getSrc161();
	}
	
	/**
	 * 	Update Src161 with the passed value
	 *	@param number
	 */
	public void setSrc161(short number)  throws CFException{
		work.setSrc161(number);
	}

	public void setSrc161(int number)  throws CFException{
		work.setSrc161((short)number);
	}

	public void setSrc161(long number)  throws CFException{
		work.setSrc161((short)number);
	}



	/**
	 *	Returns the value of tgt163
	 *	@return tgt163
	 */
	public long getTgt163() throws CFException {
   		return work.getTgt163();
	}


	/**
	 *	Returns String value of tgt163
	 *	@return tgt163
	 */
	public char[]  getTgt163String() throws CFException {
	     return String.valueOf(work.getTgt163String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt163IsNumeric()  throws CFException{
	    return work.tgt163IsNumeric();
	}

	/**
	 * 	Update Tgt163 with the passed value
	 *	@param number
	 */
	public void setTgt163(long number)  throws CFException{
		work.setTgt163(number);
	}
	

	
	/**
	 * 	Update Tgt163 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt163(char[] value)  throws CFException {
		work.setTgt163(value);
	}
	
	/**
	 * 	Update Tgt163 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt163String(char[] value)  throws CFException{
		work.setTgt163(value);
	}	

	/**
	 *	Returns the value of tgt165
	 *	@return tgt165
	 */
	public long getTgt165(int index) throws CFException {
   		return tgt165Grp.getTgt165((index));
	}


	/**
	 *	Returns String value of tgt165
	 *	@return tgt165
	 */
	public char[]  getTgt165String(int index) throws CFException {
	     return String.valueOf(tgt165Grp.getTgt165String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt165IsNumeric(int index)  throws CFException{
	    return tgt165Grp.tgt165IsNumeric(index);
	}

	/**
	 * 	Update Tgt165 with the passed value
	 *	@param number
	 */
	public void setTgt165(int index,long number)  throws CFException{
		tgt165Grp.setTgt165((index),number);
	}
	

	
	/**
	 * 	Update Tgt165 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt165(int index,char[] value)  throws CFException {
		tgt165Grp.setTgt165((index),value);
	}
	
	/**
	 * 	Update Tgt165 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt165String(int index,char[] value)  throws CFException{
		tgt165Grp.setTgt165((index),value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src166Grp.hashCode();
        str += tgt165Grp.hashCode();
        str += src162Grp.hashCode();
        str += tgt162Grp.hashCode();
        str += src164Grp.hashCode();
        str += work.hashCode();
        str += tgt161Grp.hashCode();
       return str.hashCode();
    }

    public Process36Split116OutCtx clone() {
        Process36Split116OutCtx cloneObj = new Process36Split116OutCtx();
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt165Grp = new Tgt165Grp();
        cloneObj.tgt165Grp.set(tgt165Grp.getClonedField());
        cloneObj.src162Grp = new Src162Grp();
        cloneObj.src162Grp.set(src162Grp.getClonedField());
        cloneObj.tgt162Grp = new Tgt162Grp();
        cloneObj.tgt162Grp.set(tgt162Grp.getClonedField());
        cloneObj.src164Grp = new Src164Grp();
        cloneObj.src164Grp.set(src164Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt161Grp = new Tgt161Grp();
        cloneObj.tgt161Grp.set(tgt161Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process36Split116OutCtx getProcess36Split116OutCtx() {
            return new Process36Split116OutCtx();
    }
     public class Process37Split118InCtx implements Cloneable {
     Tgt166Grp tgt166Grp = S918testCtx.this.getTgt166Grp();
     Src166Grp src166Grp = S918testCtx.this.getSrc166Grp();
     Tgt169Grp tgt169Grp = S918testCtx.this.getTgt169Grp();
     Work work = S918testCtx.this.getWork();
     Tgt170Grp tgt170Grp = S918testCtx.this.getTgt170Grp();
     Src168Grp src168Grp = S918testCtx.this.getSrc168Grp();
     Src170Grp src170Grp = S918testCtx.this.getSrc170Grp();

	/**
	 *	Returns the value of tgt166
	 *	@return tgt166
	 */
	public long getTgt166(int index) throws CFException {
   		return tgt166Grp.getTgt166((index));
	}


	/**
	 *	Returns String value of tgt166
	 *	@return tgt166
	 */
	public char[]  getTgt166String(int index) throws CFException {
	     return String.valueOf(tgt166Grp.getTgt166String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt166IsNumeric(int index)  throws CFException{
	    return tgt166Grp.tgt166IsNumeric(index);
	}

	/**
	 * 	Update Tgt166 with the passed value
	 *	@param number
	 */
	public void setTgt166(int index,long number)  throws CFException{
		tgt166Grp.setTgt166((index),number);
	}
	

	
	/**
	 * 	Update Tgt166 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt166(int index,char[] value)  throws CFException {
		tgt166Grp.setTgt166((index),value);
	}
	
	/**
	 * 	Update Tgt166 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt166String(int index,char[] value)  throws CFException{
		tgt166Grp.setTgt166((index),value);
	}	

	/**
	 *	Returns the value of tgt167
	 *	@return tgt167
	 */
	public long getTgt167() throws CFException {
   		return work.getTgt167();
	}


	/**
	 *	Returns String value of tgt167
	 *	@return tgt167
	 */
	public char[]  getTgt167String() throws CFException {
	     return String.valueOf(work.getTgt167String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt167IsNumeric()  throws CFException{
	    return work.tgt167IsNumeric();
	}

	/**
	 * 	Update Tgt167 with the passed value
	 *	@param number
	 */
	public void setTgt167(long number)  throws CFException{
		work.setTgt167(number);
	}
	

	
	/**
	 * 	Update Tgt167 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt167(char[] value)  throws CFException {
		work.setTgt167(value);
	}
	
	/**
	 * 	Update Tgt167 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt167String(char[] value)  throws CFException{
		work.setTgt167(value);
	}	

	/**
	 *	Returns the value of tgt169Grp
	 *	@return tgt169Grp
	 */   
	 public Tgt169Grp getTgt169Grp() {
   	return tgt169Grp;
   }


	public BigDecimal getSrc169() throws CFException{      
   		return work.getSrc169();
	}

    public char[] getSrc169String() throws CFException {
          return  work.getSrc169().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src169 with the passed number
	 *	@param number
	 */
	public void setSrc169(BigDecimal number)  throws CFException{
		work.setSrc169(number);
   }

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of tgt166Grp
	 *	@return tgt166Grp
	 */   
	 public Tgt166Grp getTgt166Grp() {
   	return tgt166Grp;
   }


	public BigDecimal getSrc170(int index) throws CFException{      
   		return src170Grp.getSrc170((index));
	}

    public char[] getSrc170String(int index) throws CFException {
          return  src170Grp.getSrc170((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src170 with the passed number
	 *	@param number
	 */
	public void setSrc170(int index,BigDecimal number)  throws CFException{
		src170Grp.setSrc170((index),number);
   }

	/**
	 *	Returns the value of src166
	 *	@return src166
	 */
	public int getSrc166(int index) throws CFException {        
   		return src166Grp.getSrc166((index));
	}
	
	/**
	 * 	Update Src166 with the passed value
	 *	@param number
	 */
	public void setSrc166(int index,int number)  throws CFException{
		src166Grp.setSrc166((index),number);
	}


	public void setSrc166(int index,long number)  throws CFException{
		src166Grp.setSrc166((index),(int)number);
	}


	/**
	 *	Returns the value of tgt168
	 *	@return tgt168
	 */
	public long getTgt168() throws CFException {
   		return work.getTgt168();
	}


	/**
	 *	Returns String value of tgt168
	 *	@return tgt168
	 */
	public char[]  getTgt168String() throws CFException {
	     return String.valueOf(work.getTgt168String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt168IsNumeric()  throws CFException{
	    return work.tgt168IsNumeric();
	}

	/**
	 * 	Update Tgt168 with the passed value
	 *	@param number
	 */
	public void setTgt168(long number)  throws CFException{
		work.setTgt168(number);
	}
	

	
	/**
	 * 	Update Tgt168 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt168(char[] value)  throws CFException {
		work.setTgt168(value);
	}
	
	/**
	 * 	Update Tgt168 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt168String(char[] value)  throws CFException{
		work.setTgt168(value);
	}	

	/**
	 *	Returns the value of tgt170
	 *	@return tgt170
	 */
	public long getTgt170(int index) throws CFException {
   		return tgt170Grp.getTgt170((index));
	}


	/**
	 *	Returns String value of tgt170
	 *	@return tgt170
	 */
	public char[]  getTgt170String(int index) throws CFException {
	     return String.valueOf(tgt170Grp.getTgt170String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt170IsNumeric(int index)  throws CFException{
	    return tgt170Grp.tgt170IsNumeric(index);
	}

	/**
	 * 	Update Tgt170 with the passed value
	 *	@param number
	 */
	public void setTgt170(int index,long number)  throws CFException{
		tgt170Grp.setTgt170((index),number);
	}
	

	
	/**
	 * 	Update Tgt170 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt170(int index,char[] value)  throws CFException {
		tgt170Grp.setTgt170((index),value);
	}
	
	/**
	 * 	Update Tgt170 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt170String(int index,char[] value)  throws CFException{
		tgt170Grp.setTgt170((index),value);
	}	

	public BigDecimal getSrc167() throws CFException{      
   		return work.getSrc167();
	}

    public char[] getSrc167String() throws CFException {
          return  work.getSrc167().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src167 with the passed number
	 *	@param number
	 */
	public void setSrc167(BigDecimal number)  throws CFException{
		work.setSrc167(number);
   }

	public BigDecimal getSrc168(int index) throws CFException{      
   		return src168Grp.getSrc168((index));
	}

    public char[] getSrc168String(int index) throws CFException {
          return  src168Grp.getSrc168((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src168 with the passed number
	 *	@param number
	 */
	public void setSrc168(int index,BigDecimal number)  throws CFException{
		src168Grp.setSrc168((index),number);
   }

	/**
	 *	Returns the value of tgt170Grp
	 *	@return tgt170Grp
	 */   
	 public Tgt170Grp getTgt170Grp() {
   	return tgt170Grp;
   }


	/**
	 *	Returns the value of tgt169
	 *	@return tgt169
	 */
	public long getTgt169(int index) throws CFException {
   		return tgt169Grp.getTgt169((index));
	}


	/**
	 *	Returns String value of tgt169
	 *	@return tgt169
	 */
	public char[]  getTgt169String(int index) throws CFException {
	     return String.valueOf(tgt169Grp.getTgt169String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt169IsNumeric(int index)  throws CFException{
	    return tgt169Grp.tgt169IsNumeric(index);
	}

	/**
	 * 	Update Tgt169 with the passed value
	 *	@param number
	 */
	public void setTgt169(int index,long number)  throws CFException{
		tgt169Grp.setTgt169((index),number);
	}
	

	
	/**
	 * 	Update Tgt169 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt169(int index,char[] value)  throws CFException {
		tgt169Grp.setTgt169((index),value);
	}
	
	/**
	 * 	Update Tgt169 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt169String(int index,char[] value)  throws CFException{
		tgt169Grp.setTgt169((index),value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process37Split118OutCtx getProcess37Split118OutCtx() {
            return new Process37Split118OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt166Grp.hashCode();
        str += src166Grp.hashCode();
        str += tgt169Grp.hashCode();
        str += work.hashCode();
        str += tgt170Grp.hashCode();
        str += src168Grp.hashCode();
        str += src170Grp.hashCode();
       return str.hashCode();
    }

    public Process37Split118InCtx clone() {
        Process37Split118InCtx cloneObj = new Process37Split118InCtx();
        cloneObj.tgt166Grp = new Tgt166Grp();
        cloneObj.tgt166Grp.set(tgt166Grp.getClonedField());
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt169Grp = new Tgt169Grp();
        cloneObj.tgt169Grp.set(tgt169Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt170Grp = new Tgt170Grp();
        cloneObj.tgt170Grp.set(tgt170Grp.getClonedField());
        cloneObj.src168Grp = new Src168Grp();
        cloneObj.src168Grp.set(src168Grp.getClonedField());
        cloneObj.src170Grp = new Src170Grp();
        cloneObj.src170Grp.set(src170Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process37Split118InCtx getProcess37Split118InCtx() {
            return new Process37Split118InCtx();
    }
     public class Process37Split118OutCtx implements Cloneable {
     Tgt166Grp tgt166Grp = S918testCtx.this.getTgt166Grp();
     Src166Grp src166Grp = S918testCtx.this.getSrc166Grp();
     Tgt169Grp tgt169Grp = S918testCtx.this.getTgt169Grp();
     Work work = S918testCtx.this.getWork();
     Tgt170Grp tgt170Grp = S918testCtx.this.getTgt170Grp();
     Src168Grp src168Grp = S918testCtx.this.getSrc168Grp();
     Src170Grp src170Grp = S918testCtx.this.getSrc170Grp();

	/**
	 *	Returns the value of tgt166
	 *	@return tgt166
	 */
	public long getTgt166(int index) throws CFException {
   		return tgt166Grp.getTgt166((index));
	}


	/**
	 *	Returns String value of tgt166
	 *	@return tgt166
	 */
	public char[]  getTgt166String(int index) throws CFException {
	     return String.valueOf(tgt166Grp.getTgt166String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt166IsNumeric(int index)  throws CFException{
	    return tgt166Grp.tgt166IsNumeric(index);
	}

	/**
	 * 	Update Tgt166 with the passed value
	 *	@param number
	 */
	public void setTgt166(int index,long number)  throws CFException{
		tgt166Grp.setTgt166((index),number);
	}
	

	
	/**
	 * 	Update Tgt166 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt166(int index,char[] value)  throws CFException {
		tgt166Grp.setTgt166((index),value);
	}
	
	/**
	 * 	Update Tgt166 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt166String(int index,char[] value)  throws CFException{
		tgt166Grp.setTgt166((index),value);
	}	

	/**
	 *	Returns the value of tgt167
	 *	@return tgt167
	 */
	public long getTgt167() throws CFException {
   		return work.getTgt167();
	}


	/**
	 *	Returns String value of tgt167
	 *	@return tgt167
	 */
	public char[]  getTgt167String() throws CFException {
	     return String.valueOf(work.getTgt167String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt167IsNumeric()  throws CFException{
	    return work.tgt167IsNumeric();
	}

	/**
	 * 	Update Tgt167 with the passed value
	 *	@param number
	 */
	public void setTgt167(long number)  throws CFException{
		work.setTgt167(number);
	}
	

	
	/**
	 * 	Update Tgt167 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt167(char[] value)  throws CFException {
		work.setTgt167(value);
	}
	
	/**
	 * 	Update Tgt167 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt167String(char[] value)  throws CFException{
		work.setTgt167(value);
	}	

	public BigDecimal getSrc170(int index) throws CFException{      
   		return src170Grp.getSrc170((index));
	}

    public char[] getSrc170String(int index) throws CFException {
          return  src170Grp.getSrc170((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src170 with the passed number
	 *	@param number
	 */
	public void setSrc170(int index,BigDecimal number)  throws CFException{
		src170Grp.setSrc170((index),number);
   }

	/**
	 *	Returns the value of tgt168
	 *	@return tgt168
	 */
	public long getTgt168() throws CFException {
   		return work.getTgt168();
	}


	/**
	 *	Returns String value of tgt168
	 *	@return tgt168
	 */
	public char[]  getTgt168String() throws CFException {
	     return String.valueOf(work.getTgt168String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt168IsNumeric()  throws CFException{
	    return work.tgt168IsNumeric();
	}

	/**
	 * 	Update Tgt168 with the passed value
	 *	@param number
	 */
	public void setTgt168(long number)  throws CFException{
		work.setTgt168(number);
	}
	

	
	/**
	 * 	Update Tgt168 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt168(char[] value)  throws CFException {
		work.setTgt168(value);
	}
	
	/**
	 * 	Update Tgt168 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt168String(char[] value)  throws CFException{
		work.setTgt168(value);
	}	

	/**
	 *	Returns the value of tgt170
	 *	@return tgt170
	 */
	public long getTgt170(int index) throws CFException {
   		return tgt170Grp.getTgt170((index));
	}


	/**
	 *	Returns String value of tgt170
	 *	@return tgt170
	 */
	public char[]  getTgt170String(int index) throws CFException {
	     return String.valueOf(tgt170Grp.getTgt170String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt170IsNumeric(int index)  throws CFException{
	    return tgt170Grp.tgt170IsNumeric(index);
	}

	/**
	 * 	Update Tgt170 with the passed value
	 *	@param number
	 */
	public void setTgt170(int index,long number)  throws CFException{
		tgt170Grp.setTgt170((index),number);
	}
	

	
	/**
	 * 	Update Tgt170 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt170(int index,char[] value)  throws CFException {
		tgt170Grp.setTgt170((index),value);
	}
	
	/**
	 * 	Update Tgt170 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt170String(int index,char[] value)  throws CFException{
		tgt170Grp.setTgt170((index),value);
	}	

	/**
	 *	Returns the value of src171
	 *	@return src171
	 */
	public BigDecimal getSrc171() throws CFException {
   		return work.getSrc171();
	}


	 /**
     *	Returns String value of src171
     *	@return src171
     */
    public char[]  getSrc171String() throws CFException {
         return work.getSrc171String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src171IsNumeric() {
        return work.src171IsNumeric();
    }
	/**
	 * 	Update Src171 with the passed number
	 *	@param number
	 */
	public void setSrc171(BigDecimal number)  throws CFException{
		work.setSrc171(number);
   }

	/**
	 * 	Update Src171 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc171(char[] value)  throws CFException{
		work.setSrc171(value);
	}   

	public BigDecimal getSrc167() throws CFException{      
   		return work.getSrc167();
	}

    public char[] getSrc167String() throws CFException {
          return  work.getSrc167().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src167 with the passed number
	 *	@param number
	 */
	public void setSrc167(BigDecimal number)  throws CFException{
		work.setSrc167(number);
   }

	public BigDecimal getSrc168(int index) throws CFException{      
   		return src168Grp.getSrc168((index));
	}

    public char[] getSrc168String(int index) throws CFException {
          return  src168Grp.getSrc168((index)).toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src168 with the passed number
	 *	@param number
	 */
	public void setSrc168(int index,BigDecimal number)  throws CFException{
		src168Grp.setSrc168((index),number);
   }

	public BigDecimal getSrc169() throws CFException{      
   		return work.getSrc169();
	}

    public char[] getSrc169String() throws CFException {
          return  work.getSrc169().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src169 with the passed number
	 *	@param number
	 */
	public void setSrc169(BigDecimal number)  throws CFException{
		work.setSrc169(number);
   }

	/**
	 *	Returns the value of tgt169
	 *	@return tgt169
	 */
	public long getTgt169(int index) throws CFException {
   		return tgt169Grp.getTgt169((index));
	}


	/**
	 *	Returns String value of tgt169
	 *	@return tgt169
	 */
	public char[]  getTgt169String(int index) throws CFException {
	     return String.valueOf(tgt169Grp.getTgt169String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt169IsNumeric(int index)  throws CFException{
	    return tgt169Grp.tgt169IsNumeric(index);
	}

	/**
	 * 	Update Tgt169 with the passed value
	 *	@param number
	 */
	public void setTgt169(int index,long number)  throws CFException{
		tgt169Grp.setTgt169((index),number);
	}
	

	
	/**
	 * 	Update Tgt169 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt169(int index,char[] value)  throws CFException {
		tgt169Grp.setTgt169((index),value);
	}
	
	/**
	 * 	Update Tgt169 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt169String(int index,char[] value)  throws CFException{
		tgt169Grp.setTgt169((index),value);
	}	

	/**
	 *	Returns the value of tgt171
	 *	@return tgt171
	 */
	public long getTgt171() throws CFException {
   		return work.getTgt171();
	}


	/**
	 *	Returns String value of tgt171
	 *	@return tgt171
	 */
	public char[]  getTgt171String() throws CFException {
	     return String.valueOf(work.getTgt171String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt171IsNumeric()  throws CFException{
	    return work.tgt171IsNumeric();
	}

	/**
	 * 	Update Tgt171 with the passed value
	 *	@param number
	 */
	public void setTgt171(long number)  throws CFException{
		work.setTgt171(number);
	}
	

	
	/**
	 * 	Update Tgt171 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt171(char[] value)  throws CFException {
		work.setTgt171(value);
	}
	
	/**
	 * 	Update Tgt171 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt171String(char[] value)  throws CFException{
		work.setTgt171(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt166Grp.hashCode();
        str += src166Grp.hashCode();
        str += tgt169Grp.hashCode();
        str += work.hashCode();
        str += tgt170Grp.hashCode();
        str += src168Grp.hashCode();
        str += src170Grp.hashCode();
       return str.hashCode();
    }

    public Process37Split118OutCtx clone() {
        Process37Split118OutCtx cloneObj = new Process37Split118OutCtx();
        cloneObj.tgt166Grp = new Tgt166Grp();
        cloneObj.tgt166Grp.set(tgt166Grp.getClonedField());
        cloneObj.src166Grp = new Src166Grp();
        cloneObj.src166Grp.set(src166Grp.getClonedField());
        cloneObj.tgt169Grp = new Tgt169Grp();
        cloneObj.tgt169Grp.set(tgt169Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt170Grp = new Tgt170Grp();
        cloneObj.tgt170Grp.set(tgt170Grp.getClonedField());
        cloneObj.src168Grp = new Src168Grp();
        cloneObj.src168Grp.set(src168Grp.getClonedField());
        cloneObj.src170Grp = new Src170Grp();
        cloneObj.src170Grp.set(src170Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process37Split118OutCtx getProcess37Split118OutCtx() {
            return new Process37Split118OutCtx();
    }
     public class Process38Split120InCtx implements Cloneable {
     Tgt174Grp tgt174Grp = S918testCtx.this.getTgt174Grp();
     Src176Grp src176Grp = S918testCtx.this.getSrc176Grp();
     Tgt173Grp tgt173Grp = S918testCtx.this.getTgt173Grp();
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt174
	 *	@return tgt174
	 */
	public long getTgt174(int index) throws CFException {
   		return tgt174Grp.getTgt174((index));
	}


	/**
	 *	Returns String value of tgt174
	 *	@return tgt174
	 */
	public char[]  getTgt174String(int index) throws CFException {
	     return String.valueOf(tgt174Grp.getTgt174String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt174IsNumeric(int index)  throws CFException{
	    return tgt174Grp.tgt174IsNumeric(index);
	}

	/**
	 * 	Update Tgt174 with the passed value
	 *	@param number
	 */
	public void setTgt174(int index,long number)  throws CFException{
		tgt174Grp.setTgt174((index),number);
	}
	

	
	/**
	 * 	Update Tgt174 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt174(int index,char[] value)  throws CFException {
		tgt174Grp.setTgt174((index),value);
	}
	
	/**
	 * 	Update Tgt174 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt174String(int index,char[] value)  throws CFException{
		tgt174Grp.setTgt174((index),value);
	}	

	/**
	 *	Returns the value of src173
	 *	@return src173
	 */
	public BigDecimal getSrc173() throws CFException {
   		return work.getSrc173();
	}


	 /**
     *	Returns String value of src173
     *	@return src173
     */
    public char[]  getSrc173String() throws CFException {
         return work.getSrc173String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src173IsNumeric() {
        return work.src173IsNumeric();
    }
	/**
	 * 	Update Src173 with the passed number
	 *	@param number
	 */
	public void setSrc173(BigDecimal number)  throws CFException{
		work.setSrc173(number);
   }

	/**
	 * 	Update Src173 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc173(char[] value)  throws CFException{
		work.setSrc173(value);
	}   

	/**
	 *	Returns the value of tgt172
	 *	@return tgt172
	 */
	public long getTgt172() throws CFException {
   		return work.getTgt172();
	}


	/**
	 *	Returns String value of tgt172
	 *	@return tgt172
	 */
	public char[]  getTgt172String() throws CFException {
	     return String.valueOf(work.getTgt172String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt172IsNumeric()  throws CFException{
	    return work.tgt172IsNumeric();
	}

	/**
	 * 	Update Tgt172 with the passed value
	 *	@param number
	 */
	public void setTgt172(long number)  throws CFException{
		work.setTgt172(number);
	}
	

	
	/**
	 * 	Update Tgt172 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt172(char[] value)  throws CFException {
		work.setTgt172(value);
	}
	
	/**
	 * 	Update Tgt172 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt172String(char[] value)  throws CFException{
		work.setTgt172(value);
	}	

	/**
	 *	Returns the value of tgt174Grp
	 *	@return tgt174Grp
	 */   
	 public Tgt174Grp getTgt174Grp() {
   	return tgt174Grp;
   }


	/**
	 *	Returns the value of tgt173
	 *	@return tgt173
	 */
	public long getTgt173(int index) throws CFException {
   		return tgt173Grp.getTgt173((index));
	}


	/**
	 *	Returns String value of tgt173
	 *	@return tgt173
	 */
	public char[]  getTgt173String(int index) throws CFException {
	     return String.valueOf(tgt173Grp.getTgt173String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt173IsNumeric(int index)  throws CFException{
	    return tgt173Grp.tgt173IsNumeric(index);
	}

	/**
	 * 	Update Tgt173 with the passed value
	 *	@param number
	 */
	public void setTgt173(int index,long number)  throws CFException{
		tgt173Grp.setTgt173((index),number);
	}
	

	
	/**
	 * 	Update Tgt173 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt173(int index,char[] value)  throws CFException {
		tgt173Grp.setTgt173((index),value);
	}
	
	/**
	 * 	Update Tgt173 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt173String(int index,char[] value)  throws CFException{
		tgt173Grp.setTgt173((index),value);
	}	

	/**
	 *	Returns the value of src171
	 *	@return src171
	 */
	public BigDecimal getSrc171() throws CFException {
   		return work.getSrc171();
	}


	 /**
     *	Returns String value of src171
     *	@return src171
     */
    public char[]  getSrc171String() throws CFException {
         return work.getSrc171String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src171IsNumeric() {
        return work.src171IsNumeric();
    }
	/**
	 * 	Update Src171 with the passed number
	 *	@param number
	 */
	public void setSrc171(BigDecimal number)  throws CFException{
		work.setSrc171(number);
   }

	/**
	 * 	Update Src171 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc171(char[] value)  throws CFException{
		work.setSrc171(value);
	}   

	/**
	 *	Returns the value of src174
	 *	@return src174
	 */
	public BigDecimal getSrc174() throws CFException {
   		return work.getSrc174();
	}


	 /**
     *	Returns String value of src174
     *	@return src174
     */
    public char[]  getSrc174String() throws CFException {
         return work.getSrc174String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src174IsNumeric() {
        return work.src174IsNumeric();
    }
	/**
	 * 	Update Src174 with the passed number
	 *	@param number
	 */
	public void setSrc174(BigDecimal number)  throws CFException{
		work.setSrc174(number);
   }

	/**
	 * 	Update Src174 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc174(char[] value)  throws CFException{
		work.setSrc174(value);
	}   

	/**
	 *	Returns the value of tgt173Grp
	 *	@return tgt173Grp
	 */   
	 public Tgt173Grp getTgt173Grp() {
   	return tgt173Grp;
   }


	/**
	 *	Returns the value of src172
	 *	@return src172
	 */
	public BigDecimal getSrc172() throws CFException {
   		return work.getSrc172();
	}


	 /**
     *	Returns String value of src172
     *	@return src172
     */
    public char[]  getSrc172String() throws CFException {
         return work.getSrc172String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src172IsNumeric() {
        return work.src172IsNumeric();
    }
	/**
	 * 	Update Src172 with the passed number
	 *	@param number
	 */
	public void setSrc172(BigDecimal number)  throws CFException{
		work.setSrc172(number);
   }

	/**
	 * 	Update Src172 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc172(char[] value)  throws CFException{
		work.setSrc172(value);
	}   

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of tgt171
	 *	@return tgt171
	 */
	public long getTgt171() throws CFException {
   		return work.getTgt171();
	}


	/**
	 *	Returns String value of tgt171
	 *	@return tgt171
	 */
	public char[]  getTgt171String() throws CFException {
	     return String.valueOf(work.getTgt171String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt171IsNumeric()  throws CFException{
	    return work.tgt171IsNumeric();
	}

	/**
	 * 	Update Tgt171 with the passed value
	 *	@param number
	 */
	public void setTgt171(long number)  throws CFException{
		work.setTgt171(number);
	}
	

	
	/**
	 * 	Update Tgt171 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt171(char[] value)  throws CFException {
		work.setTgt171(value);
	}
	
	/**
	 * 	Update Tgt171 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt171String(char[] value)  throws CFException{
		work.setTgt171(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process38Split120OutCtx getProcess38Split120OutCtx() {
            return new Process38Split120OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt174Grp.hashCode();
        str += src176Grp.hashCode();
        str += tgt173Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process38Split120InCtx clone() {
        Process38Split120InCtx cloneObj = new Process38Split120InCtx();
        cloneObj.tgt174Grp = new Tgt174Grp();
        cloneObj.tgt174Grp.set(tgt174Grp.getClonedField());
        cloneObj.src176Grp = new Src176Grp();
        cloneObj.src176Grp.set(src176Grp.getClonedField());
        cloneObj.tgt173Grp = new Tgt173Grp();
        cloneObj.tgt173Grp.set(tgt173Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process38Split120InCtx getProcess38Split120InCtx() {
            return new Process38Split120InCtx();
    }
     public class Process38Split120OutCtx implements Cloneable {
     Tgt174Grp tgt174Grp = S918testCtx.this.getTgt174Grp();
     Src176Grp src176Grp = S918testCtx.this.getSrc176Grp();
     Tgt173Grp tgt173Grp = S918testCtx.this.getTgt173Grp();
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt174
	 *	@return tgt174
	 */
	public long getTgt174(int index) throws CFException {
   		return tgt174Grp.getTgt174((index));
	}


	/**
	 *	Returns String value of tgt174
	 *	@return tgt174
	 */
	public char[]  getTgt174String(int index) throws CFException {
	     return String.valueOf(tgt174Grp.getTgt174String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt174IsNumeric(int index)  throws CFException{
	    return tgt174Grp.tgt174IsNumeric(index);
	}

	/**
	 * 	Update Tgt174 with the passed value
	 *	@param number
	 */
	public void setTgt174(int index,long number)  throws CFException{
		tgt174Grp.setTgt174((index),number);
	}
	

	
	/**
	 * 	Update Tgt174 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt174(int index,char[] value)  throws CFException {
		tgt174Grp.setTgt174((index),value);
	}
	
	/**
	 * 	Update Tgt174 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt174String(int index,char[] value)  throws CFException{
		tgt174Grp.setTgt174((index),value);
	}	

	/**
	 *	Returns the value of tgt176
	 *	@return tgt176
	 */
	public long getTgt176() throws CFException {
   		return work.getTgt176();
	}


	/**
	 *	Returns String value of tgt176
	 *	@return tgt176
	 */
	public char[]  getTgt176String() throws CFException {
	     return String.valueOf(work.getTgt176String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt176IsNumeric()  throws CFException{
	    return work.tgt176IsNumeric();
	}

	/**
	 * 	Update Tgt176 with the passed value
	 *	@param number
	 */
	public void setTgt176(long number)  throws CFException{
		work.setTgt176(number);
	}
	

	
	/**
	 * 	Update Tgt176 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt176(char[] value)  throws CFException {
		work.setTgt176(value);
	}
	
	/**
	 * 	Update Tgt176 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt176String(char[] value)  throws CFException{
		work.setTgt176(value);
	}	

	/**
	 *	Returns the value of src173
	 *	@return src173
	 */
	public BigDecimal getSrc173() throws CFException {
   		return work.getSrc173();
	}


	 /**
     *	Returns String value of src173
     *	@return src173
     */
    public char[]  getSrc173String() throws CFException {
         return work.getSrc173String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src173IsNumeric() {
        return work.src173IsNumeric();
    }
	/**
	 * 	Update Src173 with the passed number
	 *	@param number
	 */
	public void setSrc173(BigDecimal number)  throws CFException{
		work.setSrc173(number);
   }

	/**
	 * 	Update Src173 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc173(char[] value)  throws CFException{
		work.setSrc173(value);
	}   

	/**
	 *	Returns the value of tgt175
	 *	@return tgt175
	 */
	public long getTgt175() throws CFException {
   		return work.getTgt175();
	}


	/**
	 *	Returns String value of tgt175
	 *	@return tgt175
	 */
	public char[]  getTgt175String() throws CFException {
	     return String.valueOf(work.getTgt175String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt175IsNumeric()  throws CFException{
	    return work.tgt175IsNumeric();
	}

	/**
	 * 	Update Tgt175 with the passed value
	 *	@param number
	 */
	public void setTgt175(long number)  throws CFException{
		work.setTgt175(number);
	}
	

	
	/**
	 * 	Update Tgt175 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt175(char[] value)  throws CFException {
		work.setTgt175(value);
	}
	
	/**
	 * 	Update Tgt175 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt175String(char[] value)  throws CFException{
		work.setTgt175(value);
	}	

	/**
	 *	Returns the value of tgt172
	 *	@return tgt172
	 */
	public long getTgt172() throws CFException {
   		return work.getTgt172();
	}


	/**
	 *	Returns String value of tgt172
	 *	@return tgt172
	 */
	public char[]  getTgt172String() throws CFException {
	     return String.valueOf(work.getTgt172String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt172IsNumeric()  throws CFException{
	    return work.tgt172IsNumeric();
	}

	/**
	 * 	Update Tgt172 with the passed value
	 *	@param number
	 */
	public void setTgt172(long number)  throws CFException{
		work.setTgt172(number);
	}
	

	
	/**
	 * 	Update Tgt172 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt172(char[] value)  throws CFException {
		work.setTgt172(value);
	}
	
	/**
	 * 	Update Tgt172 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt172String(char[] value)  throws CFException{
		work.setTgt172(value);
	}	

	/**
	 *	Returns the value of tgt173
	 *	@return tgt173
	 */
	public long getTgt173(int index) throws CFException {
   		return tgt173Grp.getTgt173((index));
	}


	/**
	 *	Returns String value of tgt173
	 *	@return tgt173
	 */
	public char[]  getTgt173String(int index) throws CFException {
	     return String.valueOf(tgt173Grp.getTgt173String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt173IsNumeric(int index)  throws CFException{
	    return tgt173Grp.tgt173IsNumeric(index);
	}

	/**
	 * 	Update Tgt173 with the passed value
	 *	@param number
	 */
	public void setTgt173(int index,long number)  throws CFException{
		tgt173Grp.setTgt173((index),number);
	}
	

	
	/**
	 * 	Update Tgt173 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt173(int index,char[] value)  throws CFException {
		tgt173Grp.setTgt173((index),value);
	}
	
	/**
	 * 	Update Tgt173 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt173String(int index,char[] value)  throws CFException{
		tgt173Grp.setTgt173((index),value);
	}	

	/**
	 *	Returns the value of src176
	 *	@return src176
	 */
   public char[] getSrc176(int index) throws CFException  {              
   		return src176Grp.getSrc176(index);
   }

  
	/**
	*  set variable src176
	*  @param value
	**/
   public void setSrc176(int index,char[] value) throws CFException {
      src176Grp.setSrc176((index),value);
   } 

	/**
	 *	Returns the value of src174
	 *	@return src174
	 */
	public BigDecimal getSrc174() throws CFException {
   		return work.getSrc174();
	}


	 /**
     *	Returns String value of src174
     *	@return src174
     */
    public char[]  getSrc174String() throws CFException {
         return work.getSrc174String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src174IsNumeric() {
        return work.src174IsNumeric();
    }
	/**
	 * 	Update Src174 with the passed number
	 *	@param number
	 */
	public void setSrc174(BigDecimal number)  throws CFException{
		work.setSrc174(number);
   }

	/**
	 * 	Update Src174 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc174(char[] value)  throws CFException{
		work.setSrc174(value);
	}   

	/**
	 *	Returns the value of src172
	 *	@return src172
	 */
	public BigDecimal getSrc172() throws CFException {
   		return work.getSrc172();
	}


	 /**
     *	Returns String value of src172
     *	@return src172
     */
    public char[]  getSrc172String() throws CFException {
         return work.getSrc172String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src172IsNumeric() {
        return work.src172IsNumeric();
    }
	/**
	 * 	Update Src172 with the passed number
	 *	@param number
	 */
	public void setSrc172(BigDecimal number)  throws CFException{
		work.setSrc172(number);
   }

	/**
	 * 	Update Src172 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc172(char[] value)  throws CFException{
		work.setSrc172(value);
	}   

	/**
	 *	Returns the value of tgt171
	 *	@return tgt171
	 */
	public long getTgt171() throws CFException {
   		return work.getTgt171();
	}


	/**
	 *	Returns String value of tgt171
	 *	@return tgt171
	 */
	public char[]  getTgt171String() throws CFException {
	     return String.valueOf(work.getTgt171String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt171IsNumeric()  throws CFException{
	    return work.tgt171IsNumeric();
	}

	/**
	 * 	Update Tgt171 with the passed value
	 *	@param number
	 */
	public void setTgt171(long number)  throws CFException{
		work.setTgt171(number);
	}
	

	
	/**
	 * 	Update Tgt171 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt171(char[] value)  throws CFException {
		work.setTgt171(value);
	}
	
	/**
	 * 	Update Tgt171 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt171String(char[] value)  throws CFException{
		work.setTgt171(value);
	}	

	/**
	 *	Returns the value of src175
	 *	@return src175
	 */
   public char[] getSrc175() throws CFException  {              
   		return work.getSrc175();
   }

  
	/**
	*  set variable src175
	*  @param value
	**/
   public void setSrc175(char[] value) throws CFException {
      work.setSrc175(value);
   } 

     /**
	 * 	Update Src175 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc175(char[] source, int sourceIndex) throws CFException {
      work.setSrc175(source, sourceIndex);
   	
   }
   
   public void setSrc175(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc175(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src175 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc175(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc175(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src175 with another Field
	 *	@param value
	 */
   public void setSrc175(Field source) {
      work.setSrc175(source);
   }  
   
     /**
	 * 	Update Src175 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc175(Field source, int sourceIndex,int sourceLen) {
      work.setSrc175(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src175 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc175(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc175(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tgt174Grp.hashCode();
        str += src176Grp.hashCode();
        str += tgt173Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process38Split120OutCtx clone() {
        Process38Split120OutCtx cloneObj = new Process38Split120OutCtx();
        cloneObj.tgt174Grp = new Tgt174Grp();
        cloneObj.tgt174Grp.set(tgt174Grp.getClonedField());
        cloneObj.src176Grp = new Src176Grp();
        cloneObj.src176Grp.set(src176Grp.getClonedField());
        cloneObj.tgt173Grp = new Tgt173Grp();
        cloneObj.tgt173Grp.set(tgt173Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process38Split120OutCtx getProcess38Split120OutCtx() {
            return new Process38Split120OutCtx();
    }
     public class Process39Split122InCtx implements Cloneable {
     Src178Grp src178Grp = S918testCtx.this.getSrc178Grp();
     Src176Grp src176Grp = S918testCtx.this.getSrc176Grp();
     Work work = S918testCtx.this.getWork();
     Tgt178Grp tgt178Grp = S918testCtx.this.getTgt178Grp();
     Tgt177Grp tgt177Grp = S918testCtx.this.getTgt177Grp();

	/**
	 *	Returns the value of tgt176
	 *	@return tgt176
	 */
	public long getTgt176() throws CFException {
   		return work.getTgt176();
	}


	/**
	 *	Returns String value of tgt176
	 *	@return tgt176
	 */
	public char[]  getTgt176String() throws CFException {
	     return String.valueOf(work.getTgt176String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt176IsNumeric()  throws CFException{
	    return work.tgt176IsNumeric();
	}

	/**
	 * 	Update Tgt176 with the passed value
	 *	@param number
	 */
	public void setTgt176(long number)  throws CFException{
		work.setTgt176(number);
	}
	

	
	/**
	 * 	Update Tgt176 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt176(char[] value)  throws CFException {
		work.setTgt176(value);
	}
	
	/**
	 * 	Update Tgt176 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt176String(char[] value)  throws CFException{
		work.setTgt176(value);
	}	

	/**
	 *	Returns the value of src176
	 *	@return src176
	 */
   public char[] getSrc176(int index) throws CFException  {              
   		return src176Grp.getSrc176(index);
   }

  
	/**
	*  set variable src176
	*  @param value
	**/
   public void setSrc176(int index,char[] value) throws CFException {
      src176Grp.setSrc176((index),value);
   } 

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of tgt178Grp
	 *	@return tgt178Grp
	 */   
	 public Tgt178Grp getTgt178Grp() {
   	return tgt178Grp;
   }


	/**
	 *	Returns the value of tgt177Grp
	 *	@return tgt177Grp
	 */   
	 public Tgt177Grp getTgt177Grp() {
   	return tgt177Grp;
   }



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process39Split122OutCtx getProcess39Split122OutCtx() {
            return new Process39Split122OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src178Grp.hashCode();
        str += src176Grp.hashCode();
        str += work.hashCode();
        str += tgt178Grp.hashCode();
        str += tgt177Grp.hashCode();
       return str.hashCode();
    }

    public Process39Split122InCtx clone() {
        Process39Split122InCtx cloneObj = new Process39Split122InCtx();
        cloneObj.src178Grp = new Src178Grp();
        cloneObj.src178Grp.set(src178Grp.getClonedField());
        cloneObj.src176Grp = new Src176Grp();
        cloneObj.src176Grp.set(src176Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt178Grp = new Tgt178Grp();
        cloneObj.tgt178Grp.set(tgt178Grp.getClonedField());
        cloneObj.tgt177Grp = new Tgt177Grp();
        cloneObj.tgt177Grp.set(tgt177Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process39Split122InCtx getProcess39Split122InCtx() {
            return new Process39Split122InCtx();
    }
     public class Process39Split122OutCtx implements Cloneable {
     Src178Grp src178Grp = S918testCtx.this.getSrc178Grp();
     Src176Grp src176Grp = S918testCtx.this.getSrc176Grp();
     Work work = S918testCtx.this.getWork();
     Tgt178Grp tgt178Grp = S918testCtx.this.getTgt178Grp();
     Tgt177Grp tgt177Grp = S918testCtx.this.getTgt177Grp();

	/**
	 *	Returns the value of tgt176
	 *	@return tgt176
	 */
	public long getTgt176() throws CFException {
   		return work.getTgt176();
	}


	/**
	 *	Returns String value of tgt176
	 *	@return tgt176
	 */
	public char[]  getTgt176String() throws CFException {
	     return String.valueOf(work.getTgt176String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt176IsNumeric()  throws CFException{
	    return work.tgt176IsNumeric();
	}

	/**
	 * 	Update Tgt176 with the passed value
	 *	@param number
	 */
	public void setTgt176(long number)  throws CFException{
		work.setTgt176(number);
	}
	

	
	/**
	 * 	Update Tgt176 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt176(char[] value)  throws CFException {
		work.setTgt176(value);
	}
	
	/**
	 * 	Update Tgt176 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt176String(char[] value)  throws CFException{
		work.setTgt176(value);
	}	

	/**
	 *	Returns the value of src179
	 *	@return src179
	 */
	public short getSrc179() throws CFException {        
   		return work.getSrc179();
	}
	
	/**
	 * 	Update Src179 with the passed value
	 *	@param number
	 */
	public void setSrc179(short number)  throws CFException{
		work.setSrc179(number);
	}

	public void setSrc179(int number)  throws CFException{
		work.setSrc179((short)number);
	}

	public void setSrc179(long number)  throws CFException{
		work.setSrc179((short)number);
	}



	/**
	 *	Returns the value of tgt179
	 *	@return tgt179
	 */
   public char[] getTgt179() throws CFException  {              
   		return work.getTgt179();
   }

  
	/**
	*  set variable tgt179
	*  @param value
	**/
   public void setTgt179(char[] value) throws CFException {
      work.setTgt179(value);
   } 

     /**
	 * 	Update Tgt179 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt179(char[] source, int sourceIndex) throws CFException {
      work.setTgt179(source, sourceIndex);
   	
   }
   
   public void setTgt179(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt179(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt179 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt179(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt179(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt179 with another Field
	 *	@param value
	 */
   public void setTgt179(Field source) {
      work.setTgt179(source);
   }  
   
     /**
	 * 	Update Tgt179 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt179(Field source, int sourceIndex,int sourceLen) {
      work.setTgt179(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt179 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt179(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt179(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src177
	 *	@return src177
	 */
   public char[] getSrc177() throws CFException  {              
   		return work.getSrc177();
   }

  
	/**
	*  set variable src177
	*  @param value
	**/
   public void setSrc177(char[] value) throws CFException {
      work.setSrc177(value);
   } 

     /**
	 * 	Update Src177 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc177(char[] source, int sourceIndex) throws CFException {
      work.setSrc177(source, sourceIndex);
   	
   }
   
   public void setSrc177(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc177(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src177 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc177(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc177(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src177 with another Field
	 *	@param value
	 */
   public void setSrc177(Field source) {
      work.setSrc177(source);
   }  
   
     /**
	 * 	Update Src177 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc177(Field source, int sourceIndex,int sourceLen) {
      work.setSrc177(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src177 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc177(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc177(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src178
	 *	@return src178
	 */
   public char[] getSrc178(int index) throws CFException  {              
   		return src178Grp.getSrc178(index);
   }

  
	/**
	*  set variable src178
	*  @param value
	**/
   public void setSrc178(int index,char[] value) throws CFException {
      src178Grp.setSrc178((index),value);
   } 

	/**
	 *	Returns the value of src181
	 *	@return src181
	 */
	public short getSrc181() throws CFException {        
   		return work.getSrc181();
	}
	
	/**
	 * 	Update Src181 with the passed value
	 *	@param number
	 */
	public void setSrc181(short number)  throws CFException{
		work.setSrc181(number);
	}

	public void setSrc181(int number)  throws CFException{
		work.setSrc181((short)number);
	}

	public void setSrc181(long number)  throws CFException{
		work.setSrc181((short)number);
	}



	/**
	 *	Returns the value of tgt177
	 *	@return tgt177
	 */
	public long getTgt177(int index) throws CFException {
   		return tgt177Grp.getTgt177((index));
	}


	/**
	 *	Returns String value of tgt177
	 *	@return tgt177
	 */
	public char[]  getTgt177String(int index) throws CFException {
	     return String.valueOf(tgt177Grp.getTgt177String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt177IsNumeric(int index)  throws CFException{
	    return tgt177Grp.tgt177IsNumeric(index);
	}

	/**
	 * 	Update Tgt177 with the passed value
	 *	@param number
	 */
	public void setTgt177(int index,long number)  throws CFException{
		tgt177Grp.setTgt177((index),number);
	}
	

	
	/**
	 * 	Update Tgt177 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt177(int index,char[] value)  throws CFException {
		tgt177Grp.setTgt177((index),value);
	}
	
	/**
	 * 	Update Tgt177 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt177String(int index,char[] value)  throws CFException{
		tgt177Grp.setTgt177((index),value);
	}	

	/**
	 *	Returns the value of tgt178
	 *	@return tgt178
	 */
	public long getTgt178(int index) throws CFException {
   		return tgt178Grp.getTgt178((index));
	}


	/**
	 *	Returns String value of tgt178
	 *	@return tgt178
	 */
	public char[]  getTgt178String(int index) throws CFException {
	     return String.valueOf(tgt178Grp.getTgt178String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt178IsNumeric(int index)  throws CFException{
	    return tgt178Grp.tgt178IsNumeric(index);
	}

	/**
	 * 	Update Tgt178 with the passed value
	 *	@param number
	 */
	public void setTgt178(int index,long number)  throws CFException{
		tgt178Grp.setTgt178((index),number);
	}
	

	
	/**
	 * 	Update Tgt178 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt178(int index,char[] value)  throws CFException {
		tgt178Grp.setTgt178((index),value);
	}
	
	/**
	 * 	Update Tgt178 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt178String(int index,char[] value)  throws CFException{
		tgt178Grp.setTgt178((index),value);
	}	

	/**
	 *	Returns the value of src180
	 *	@return src180
	 */
	public short getSrc180() throws CFException {        
   		return work.getSrc180();
	}
	
	/**
	 * 	Update Src180 with the passed value
	 *	@param number
	 */
	public void setSrc180(short number)  throws CFException{
		work.setSrc180(number);
	}

	public void setSrc180(int number)  throws CFException{
		work.setSrc180((short)number);
	}

	public void setSrc180(long number)  throws CFException{
		work.setSrc180((short)number);
	}



	/**
	 *	Returns the value of tgt180
	 *	@return tgt180
	 */
	public int getTgt180() throws CFException {        
   		return work.getTgt180();
	}
	
	/**
	 * 	Update Tgt180 with the passed value
	 *	@param number
	 */
	public void setTgt180(int number)  throws CFException{
		work.setTgt180(number);
	}


	public void setTgt180(long number)  throws CFException{
		work.setTgt180((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src178Grp.hashCode();
        str += src176Grp.hashCode();
        str += work.hashCode();
        str += tgt178Grp.hashCode();
        str += tgt177Grp.hashCode();
       return str.hashCode();
    }

    public Process39Split122OutCtx clone() {
        Process39Split122OutCtx cloneObj = new Process39Split122OutCtx();
        cloneObj.src178Grp = new Src178Grp();
        cloneObj.src178Grp.set(src178Grp.getClonedField());
        cloneObj.src176Grp = new Src176Grp();
        cloneObj.src176Grp.set(src176Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.tgt178Grp = new Tgt178Grp();
        cloneObj.tgt178Grp.set(tgt178Grp.getClonedField());
        cloneObj.tgt177Grp = new Tgt177Grp();
        cloneObj.tgt177Grp.set(tgt177Grp.getClonedField());
        return cloneObj;
    }

    }

    public Process39Split122OutCtx getProcess39Split122OutCtx() {
            return new Process39Split122OutCtx();
    }
     public class Process40Split124InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src181
	 *	@return src181
	 */
	public short getSrc181() throws CFException {        
   		return work.getSrc181();
	}
	
	/**
	 * 	Update Src181 with the passed value
	 *	@param number
	 */
	public void setSrc181(short number)  throws CFException{
		work.setSrc181(number);
	}

	public void setSrc181(int number)  throws CFException{
		work.setSrc181((short)number);
	}

	public void setSrc181(long number)  throws CFException{
		work.setSrc181((short)number);
	}



	/**
	 *	Returns the value of src183
	 *	@return src183
	 */
	public int getSrc183() throws CFException {        
   		return work.getSrc183();
	}
	
	/**
	 * 	Update Src183 with the passed value
	 *	@param number
	 */
	public void setSrc183(int number)  throws CFException{
		work.setSrc183(number);
	}


	public void setSrc183(long number)  throws CFException{
		work.setSrc183((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process40Split124OutCtx getProcess40Split124OutCtx() {
            return new Process40Split124OutCtx();
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

    public Process40Split124InCtx clone() {
        Process40Split124InCtx cloneObj = new Process40Split124InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process40Split124InCtx getProcess40Split124InCtx() {
            return new Process40Split124InCtx();
    }
     public class Process40Split124OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt181
	 *	@return tgt181
	 */
	public long getTgt181() throws CFException {        
   		return work.getTgt181();
	}
	
	/**
	 * 	Update Tgt181 with the passed value
	 *	@param number
	 */
	public void setTgt181(long number)  throws CFException{
		work.setTgt181(number);
	}



	/**
	 *	Returns the value of tgt185
	 *	@return tgt185
	 */
	public long getTgt185() throws CFException {        
   		return work.getTgt185();
	}
	
	/**
	 * 	Update Tgt185 with the passed value
	 *	@param number
	 */
	public void setTgt185(long number)  throws CFException{
		work.setTgt185(number);
	}



	/**
	 *	Returns the value of src181
	 *	@return src181
	 */
	public short getSrc181() throws CFException {        
   		return work.getSrc181();
	}
	
	/**
	 * 	Update Src181 with the passed value
	 *	@param number
	 */
	public void setSrc181(short number)  throws CFException{
		work.setSrc181(number);
	}

	public void setSrc181(int number)  throws CFException{
		work.setSrc181((short)number);
	}

	public void setSrc181(long number)  throws CFException{
		work.setSrc181((short)number);
	}



	/**
	 *	Returns the value of src183
	 *	@return src183
	 */
	public int getSrc183() throws CFException {        
   		return work.getSrc183();
	}
	
	/**
	 * 	Update Src183 with the passed value
	 *	@param number
	 */
	public void setSrc183(int number)  throws CFException{
		work.setSrc183(number);
	}


	public void setSrc183(long number)  throws CFException{
		work.setSrc183((int)number);
	}


	/**
	 *	Returns the value of src185
	 *	@return src185
	 */
	public int getSrc185() throws CFException {        
   		return work.getSrc185();
	}
	
	/**
	 * 	Update Src185 with the passed value
	 *	@param number
	 */
	public void setSrc185(int number)  throws CFException{
		work.setSrc185(number);
	}


	public void setSrc185(long number)  throws CFException{
		work.setSrc185((int)number);
	}


	/**
	 *	Returns the value of tgt183
	 *	@return tgt183
	 */
	public int getTgt183() throws CFException {        
   		return work.getTgt183();
	}
	
	/**
	 * 	Update Tgt183 with the passed value
	 *	@param number
	 */
	public void setTgt183(int number)  throws CFException{
		work.setTgt183(number);
	}


	public void setTgt183(long number)  throws CFException{
		work.setTgt183((int)number);
	}


	/**
	 *	Returns the value of tgt182
	 *	@return tgt182
	 */
	public long getTgt182() throws CFException {        
   		return work.getTgt182();
	}
	
	/**
	 * 	Update Tgt182 with the passed value
	 *	@param number
	 */
	public void setTgt182(long number)  throws CFException{
		work.setTgt182(number);
	}



	/**
	 *	Returns the value of tgt184
	 *	@return tgt184
	 */
   public char[] getTgt184() throws CFException  {              
   		return work.getTgt184();
   }

  
	/**
	*  set variable tgt184
	*  @param value
	**/
   public void setTgt184(char[] value) throws CFException {
      work.setTgt184(value);
   } 

     /**
	 * 	Update Tgt184 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt184(char[] source, int sourceIndex) throws CFException {
      work.setTgt184(source, sourceIndex);
   	
   }
   
   public void setTgt184(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt184(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt184 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt184(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt184(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt184 with another Field
	 *	@param value
	 */
   public void setTgt184(Field source) {
      work.setTgt184(source);
   }  
   
     /**
	 * 	Update Tgt184 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt184(Field source, int sourceIndex,int sourceLen) {
      work.setTgt184(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt184 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt184(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt184(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src184
	 *	@return src184
	 */
	public int getSrc184() throws CFException {        
   		return work.getSrc184();
	}
	
	/**
	 * 	Update Src184 with the passed value
	 *	@param number
	 */
	public void setSrc184(int number)  throws CFException{
		work.setSrc184(number);
	}


	public void setSrc184(long number)  throws CFException{
		work.setSrc184((int)number);
	}


	/**
	 *	Returns the value of src182
	 *	@return src182
	 */
	public int getSrc182() throws CFException {        
   		return work.getSrc182();
	}
	
	/**
	 * 	Update Src182 with the passed value
	 *	@param number
	 */
	public void setSrc182(int number)  throws CFException{
		work.setSrc182(number);
	}


	public void setSrc182(long number)  throws CFException{
		work.setSrc182((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process40Split124OutCtx clone() {
        Process40Split124OutCtx cloneObj = new Process40Split124OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process40Split124OutCtx getProcess40Split124OutCtx() {
            return new Process40Split124OutCtx();
    }
     public class Process41Split126InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src185
	 *	@return src185
	 */
	public int getSrc185() throws CFException {        
   		return work.getSrc185();
	}
	
	/**
	 * 	Update Src185 with the passed value
	 *	@param number
	 */
	public void setSrc185(int number)  throws CFException{
		work.setSrc185(number);
	}


	public void setSrc185(long number)  throws CFException{
		work.setSrc185((int)number);
	}


	/**
	 *	Returns the value of addValue
	 *	@return addValue
	 */
	public int getAddValue() throws CFException {
   		return work.getAddValue();
	}


	/**
	 *	Returns String value of addValue
	 *	@return addValue
	 */
	public char[]  getAddValueString() throws CFException {
	     return String.valueOf(work.getAddValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean addValueIsNumeric()  throws CFException{
	    return work.addValueIsNumeric();
	}

	/**
	 * 	Update AddValue with the passed value
	 *	@param number
	 */
	public void setAddValue(int number)  throws CFException{
		work.setAddValue(number);
	}
	

	public void setAddValue(long number)  throws CFException{
	    work.setAddValue(number);
	}
	
	
	/**
	 * 	Update AddValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setAddValue(char[] value)  throws CFException {
		work.setAddValue(value);
	}
	
	/**
	 * 	Update AddValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAddValueString(char[] value)  throws CFException{
		work.setAddValue(value);
	}	


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process41Split126OutCtx getProcess41Split126OutCtx() {
            return new Process41Split126OutCtx();
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

    public Process41Split126InCtx clone() {
        Process41Split126InCtx cloneObj = new Process41Split126InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process41Split126InCtx getProcess41Split126InCtx() {
            return new Process41Split126InCtx();
    }
     public class Process41Split126OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src187
	 *	@return src187
	 */
	public long getSrc187() throws CFException {        
   		return work.getSrc187();
	}
	
	/**
	 * 	Update Src187 with the passed value
	 *	@param number
	 */
	public void setSrc187(long number)  throws CFException{
		work.setSrc187(number);
	}



	/**
	 *	Returns the value of tgt185
	 *	@return tgt185
	 */
	public long getTgt185() throws CFException {        
   		return work.getTgt185();
	}
	
	/**
	 * 	Update Tgt185 with the passed value
	 *	@param number
	 */
	public void setTgt185(long number)  throws CFException{
		work.setTgt185(number);
	}



	/**
	 *	Returns the value of tgt186
	 *	@return tgt186
	 */
	public long getTgt186() throws CFException {        
   		return work.getTgt186();
	}
	
	/**
	 * 	Update Tgt186 with the passed value
	 *	@param number
	 */
	public void setTgt186(long number)  throws CFException{
		work.setTgt186(number);
	}



	/**
	 *	Returns the value of tgt187
	 *	@return tgt187
	 */
	public long getTgt187() throws CFException {        
   		return work.getTgt187();
	}
	
	/**
	 * 	Update Tgt187 with the passed value
	 *	@param number
	 */
	public void setTgt187(long number)  throws CFException{
		work.setTgt187(number);
	}



	/**
	 *	Returns the value of src186
	 *	@return src186
	 */
	public int getSrc186() throws CFException {        
   		return work.getSrc186();
	}
	
	/**
	 * 	Update Src186 with the passed value
	 *	@param number
	 */
	public void setSrc186(int number)  throws CFException{
		work.setSrc186(number);
	}


	public void setSrc186(long number)  throws CFException{
		work.setSrc186((int)number);
	}


	/**
	 *	Returns the value of src188
	 *	@return src188
	 */
	public long getSrc188() throws CFException {        
   		return work.getSrc188();
	}
	
	/**
	 * 	Update Src188 with the passed value
	 *	@param number
	 */
	public void setSrc188(long number)  throws CFException{
		work.setSrc188(number);
	}



	/**
	 *	Returns the value of src185
	 *	@return src185
	 */
	public int getSrc185() throws CFException {        
   		return work.getSrc185();
	}
	
	/**
	 * 	Update Src185 with the passed value
	 *	@param number
	 */
	public void setSrc185(int number)  throws CFException{
		work.setSrc185(number);
	}


	public void setSrc185(long number)  throws CFException{
		work.setSrc185((int)number);
	}


	/**
	 *	Returns the value of tgt188
	 *	@return tgt188
	 */
	public long getTgt188() throws CFException {        
   		return work.getTgt188();
	}
	
	/**
	 * 	Update Tgt188 with the passed value
	 *	@param number
	 */
	public void setTgt188(long number)  throws CFException{
		work.setTgt188(number);
	}



	/**
	 *	Returns the value of tgt189
	 *	@return tgt189
	 */
   public char[] getTgt189() throws CFException  {              
   		return work.getTgt189();
   }

  
	/**
	*  set variable tgt189
	*  @param value
	**/
   public void setTgt189(char[] value) throws CFException {
      work.setTgt189(value);
   } 

     /**
	 * 	Update Tgt189 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt189(char[] source, int sourceIndex) throws CFException {
      work.setTgt189(source, sourceIndex);
   	
   }
   
   public void setTgt189(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt189(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt189 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt189(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt189(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt189 with another Field
	 *	@param value
	 */
   public void setTgt189(Field source) {
      work.setTgt189(source);
   }  
   
     /**
	 * 	Update Tgt189 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt189(Field source, int sourceIndex,int sourceLen) {
      work.setTgt189(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt189 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt189(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt189(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src190
	 *	@return src190
	 */
	public int getSrc190() throws CFException {        
   		return work.getSrc190();
	}
	
	/**
	 * 	Update Src190 with the passed value
	 *	@param number
	 */
	public void setSrc190(int number)  throws CFException{
		work.setSrc190(number);
	}


	public void setSrc190(long number)  throws CFException{
		work.setSrc190((int)number);
	}


	/**
	 *	Returns the value of src189
	 *	@return src189
	 */
	public short getSrc189() throws CFException {        
   		return work.getSrc189();
	}
	
	/**
	 * 	Update Src189 with the passed value
	 *	@param number
	 */
	public void setSrc189(short number)  throws CFException{
		work.setSrc189(number);
	}

	public void setSrc189(int number)  throws CFException{
		work.setSrc189((short)number);
	}

	public void setSrc189(long number)  throws CFException{
		work.setSrc189((short)number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process41Split126OutCtx clone() {
        Process41Split126OutCtx cloneObj = new Process41Split126OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process41Split126OutCtx getProcess41Split126OutCtx() {
            return new Process41Split126OutCtx();
    }
     public class Process42Split128InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of subValue
	 *	@return subValue
	 */
	public int getSubValue() throws CFException {
   		return work.getSubValue();
	}


	/**
	 *	Returns String value of subValue
	 *	@return subValue
	 */
	public char[]  getSubValueString() throws CFException {
	     return String.valueOf(work.getSubValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean subValueIsNumeric()  throws CFException{
	    return work.subValueIsNumeric();
	}

	/**
	 * 	Update SubValue with the passed value
	 *	@param number
	 */
	public void setSubValue(int number)  throws CFException{
		work.setSubValue(number);
	}
	

	public void setSubValue(long number)  throws CFException{
	    work.setSubValue(number);
	}
	
	
	/**
	 * 	Update SubValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setSubValue(char[] value)  throws CFException {
		work.setSubValue(value);
	}
	
	/**
	 * 	Update SubValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSubValueString(char[] value)  throws CFException{
		work.setSubValue(value);
	}	

	/**
	 *	Returns the value of src190
	 *	@return src190
	 */
	public int getSrc190() throws CFException {        
   		return work.getSrc190();
	}
	
	/**
	 * 	Update Src190 with the passed value
	 *	@param number
	 */
	public void setSrc190(int number)  throws CFException{
		work.setSrc190(number);
	}


	public void setSrc190(long number)  throws CFException{
		work.setSrc190((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process42Split128OutCtx getProcess42Split128OutCtx() {
            return new Process42Split128OutCtx();
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

    public Process42Split128InCtx clone() {
        Process42Split128InCtx cloneObj = new Process42Split128InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process42Split128InCtx getProcess42Split128InCtx() {
            return new Process42Split128InCtx();
    }
     public class Process42Split128OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src193
	 *	@return src193
	 */
	public int getSrc193() throws CFException {        
   		return work.getSrc193();
	}
	
	/**
	 * 	Update Src193 with the passed value
	 *	@param number
	 */
	public void setSrc193(int number)  throws CFException{
		work.setSrc193(number);
	}


	public void setSrc193(long number)  throws CFException{
		work.setSrc193((int)number);
	}


	/**
	 *	Returns the value of tgt191
	 *	@return tgt191
	 */
   public char[] getTgt191() throws CFException  {              
   		return work.getTgt191();
   }

  
	/**
	*  set variable tgt191
	*  @param value
	**/
   public void setTgt191(char[] value) throws CFException {
      work.setTgt191(value);
   } 

     /**
	 * 	Update Tgt191 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt191(char[] source, int sourceIndex) throws CFException {
      work.setTgt191(source, sourceIndex);
   	
   }
   
   public void setTgt191(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt191(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt191 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt191(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt191(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt191 with another Field
	 *	@param value
	 */
   public void setTgt191(Field source) {
      work.setTgt191(source);
   }  
   
     /**
	 * 	Update Tgt191 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt191(Field source, int sourceIndex,int sourceLen) {
      work.setTgt191(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt191 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt191(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt191(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src192
	 *	@return src192
	 */
	public long getSrc192() throws CFException {        
   		return work.getSrc192();
	}
	
	/**
	 * 	Update Src192 with the passed value
	 *	@param number
	 */
	public void setSrc192(long number)  throws CFException{
		work.setSrc192(number);
	}



	/**
	 *	Returns the value of tgt194
	 *	@return tgt194
	 */
	public BigDecimal getTgt194() throws CFException {
   		return work.getTgt194();
	}

    /**
	 *	Returns the String value of tgt194
	 *	@return tgt194
	 */
	public char[]  getTgt194ActualString()  throws CFException{
	    return work.getTgt194ActualString();
	}

	 /**
     *	Returns String value of tgt194
     *	@return tgt194
     */
    public char[]  getTgt194String() throws CFException {
         return work.getTgt194String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt194IsNumeric() {
        return work.tgt194IsNumeric();
    }
	/**
	 * 	Update Tgt194 with the passed number
	 *	@param number
	 */
	public void setTgt194(BigDecimal number)  throws CFException{
		work.setTgt194(number);
   }

	/**
	 * 	Update Tgt194 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt194(char[] value)  throws CFException{
		work.setTgt194(value);
	}   

	/**
	 *	Returns the value of src190
	 *	@return src190
	 */
	public int getSrc190() throws CFException {        
   		return work.getSrc190();
	}
	
	/**
	 * 	Update Src190 with the passed value
	 *	@param number
	 */
	public void setSrc190(int number)  throws CFException{
		work.setSrc190(number);
	}


	public void setSrc190(long number)  throws CFException{
		work.setSrc190((int)number);
	}


	/**
	 *	Returns the value of src191
	 *	@return src191
	 */
	public short getSrc191() throws CFException {        
   		return work.getSrc191();
	}
	
	/**
	 * 	Update Src191 with the passed value
	 *	@param number
	 */
	public void setSrc191(short number)  throws CFException{
		work.setSrc191(number);
	}

	public void setSrc191(int number)  throws CFException{
		work.setSrc191((short)number);
	}

	public void setSrc191(long number)  throws CFException{
		work.setSrc191((short)number);
	}



	/**
	 *	Returns the value of tgt193
	 *	@return tgt193
	 */
   public char[] getTgt193() throws CFException  {              
   		return work.getTgt193();
   }

  
	/**
	*  set variable tgt193
	*  @param value
	**/
   public void setTgt193(char[] value) throws CFException {
      work.setTgt193(value);
   } 

     /**
	 * 	Update Tgt193 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt193(char[] source, int sourceIndex) throws CFException {
      work.setTgt193(source, sourceIndex);
   	
   }
   
   public void setTgt193(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt193(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt193 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt193(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt193(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt193 with another Field
	 *	@param value
	 */
   public void setTgt193(Field source) {
      work.setTgt193(source);
   }  
   
     /**
	 * 	Update Tgt193 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt193(Field source, int sourceIndex,int sourceLen) {
      work.setTgt193(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt193 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt193(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt193(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt192
	 *	@return tgt192
	 */
   public char[] getTgt192() throws CFException  {              
   		return work.getTgt192();
   }

  
	/**
	*  set variable tgt192
	*  @param value
	**/
   public void setTgt192(char[] value) throws CFException {
      work.setTgt192(value);
   } 

     /**
	 * 	Update Tgt192 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt192(char[] source, int sourceIndex) throws CFException {
      work.setTgt192(source, sourceIndex);
   	
   }
   
   public void setTgt192(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt192(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt192 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt192(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt192(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt192 with another Field
	 *	@param value
	 */
   public void setTgt192(Field source) {
      work.setTgt192(source);
   }  
   
     /**
	 * 	Update Tgt192 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt192(Field source, int sourceIndex,int sourceLen) {
      work.setTgt192(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt192 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt192(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt192(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getSrc194() throws CFException{      
   		return work.getSrc194();
	}

    public char[] getSrc194String() throws CFException {
          return  work.getSrc194().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src194 with the passed number
	 *	@param number
	 */
	public void setSrc194(BigDecimal number)  throws CFException{
		work.setSrc194(number);
   }

	/**
	 *	Returns the value of tgt190
	 *	@return tgt190
	 */
   public char[] getTgt190() throws CFException  {              
   		return work.getTgt190();
   }

  
	/**
	*  set variable tgt190
	*  @param value
	**/
   public void setTgt190(char[] value) throws CFException {
      work.setTgt190(value);
   } 

     /**
	 * 	Update Tgt190 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt190(char[] source, int sourceIndex) throws CFException {
      work.setTgt190(source, sourceIndex);
   	
   }
   
   public void setTgt190(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt190(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt190 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt190(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt190(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt190 with another Field
	 *	@param value
	 */
   public void setTgt190(Field source) {
      work.setTgt190(source);
   }  
   
     /**
	 * 	Update Tgt190 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt190(Field source, int sourceIndex,int sourceLen) {
      work.setTgt190(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt190 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt190(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt190(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process42Split128OutCtx clone() {
        Process42Split128OutCtx cloneObj = new Process42Split128OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process42Split128OutCtx getProcess42Split128OutCtx() {
            return new Process42Split128OutCtx();
    }
     public class Process43Split130OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src195
	 *	@return src195
	 */
	public BigDecimal getSrc195() throws CFException {
   		return work.getSrc195();
	}

    /**
	 *	Returns the String value of src195
	 *	@return src195
	 */
	public char[]  getSrc195ActualString()  throws CFException{
	    return work.getSrc195ActualString();
	}

	 /**
     *	Returns String value of src195
     *	@return src195
     */
    public char[]  getSrc195String() throws CFException {
         return work.getSrc195String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src195IsNumeric() {
        return work.src195IsNumeric();
    }
	/**
	 * 	Update Src195 with the passed number
	 *	@param number
	 */
	public void setSrc195(BigDecimal number)  throws CFException{
		work.setSrc195(number);
   }

	/**
	 * 	Update Src195 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc195(char[] value)  throws CFException{
		work.setSrc195(value);
	}   

	/**
	 *	Returns the value of src196
	 *	@return src196
	 */
	public BigDecimal getSrc196() throws CFException {
   		return work.getSrc196();
	}

    /**
	 *	Returns the String value of src196
	 *	@return src196
	 */
	public char[]  getSrc196ActualString()  throws CFException{
	    return work.getSrc196ActualString();
	}

	 /**
     *	Returns String value of src196
     *	@return src196
     */
    public char[]  getSrc196String() throws CFException {
         return work.getSrc196String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src196IsNumeric() {
        return work.src196IsNumeric();
    }
	/**
	 * 	Update Src196 with the passed number
	 *	@param number
	 */
	public void setSrc196(BigDecimal number)  throws CFException{
		work.setSrc196(number);
   }

	/**
	 * 	Update Src196 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc196(char[] value)  throws CFException{
		work.setSrc196(value);
	}   

	public BigDecimal getTgt195() throws CFException{      
   		return work.getTgt195();
	}

    public char[] getTgt195String() throws CFException {
          return  work.getTgt195().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt195 with the passed number
	 *	@param number
	 */
	public void setTgt195(BigDecimal number)  throws CFException{
		work.setTgt195(number);
   }

	public BigDecimal getSrc198() throws CFException{      
   		return work.getSrc198();
	}

    public char[] getSrc198String() throws CFException {
          return  work.getSrc198().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src198 with the passed number
	 *	@param number
	 */
	public void setSrc198(BigDecimal number)  throws CFException{
		work.setSrc198(number);
   }

	/**
	 *	Returns the value of tgt197
	 *	@return tgt197
	 */
	public int getTgt197() throws CFException {        
   		return work.getTgt197();
	}
	
	/**
	 * 	Update Tgt197 with the passed value
	 *	@param number
	 */
	public void setTgt197(int number)  throws CFException{
		work.setTgt197(number);
	}


	public void setTgt197(long number)  throws CFException{
		work.setTgt197((int)number);
	}


	public BigDecimal getSrc197() throws CFException{      
   		return work.getSrc197();
	}

    public char[] getSrc197String() throws CFException {
          return  work.getSrc197().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src197 with the passed number
	 *	@param number
	 */
	public void setSrc197(BigDecimal number)  throws CFException{
		work.setSrc197(number);
   }

	public BigDecimal getSrc199() throws CFException{      
   		return work.getSrc199();
	}

    public char[] getSrc199String() throws CFException {
          return  work.getSrc199().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src199 with the passed number
	 *	@param number
	 */
	public void setSrc199(BigDecimal number)  throws CFException{
		work.setSrc199(number);
   }

	/**
	 *	Returns the value of tgt198
	 *	@return tgt198
	 */
	public int getTgt198() throws CFException {        
   		return work.getTgt198();
	}
	
	/**
	 * 	Update Tgt198 with the passed value
	 *	@param number
	 */
	public void setTgt198(int number)  throws CFException{
		work.setTgt198(number);
	}


	public void setTgt198(long number)  throws CFException{
		work.setTgt198((int)number);
	}


	/**
	 *	Returns the value of tgt196
	 *	@return tgt196
	 */
	public int getTgt196() throws CFException {        
   		return work.getTgt196();
	}
	
	/**
	 * 	Update Tgt196 with the passed value
	 *	@param number
	 */
	public void setTgt196(int number)  throws CFException{
		work.setTgt196(number);
	}


	public void setTgt196(long number)  throws CFException{
		work.setTgt196((int)number);
	}



        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process43Split130OutCtx clone() {
        Process43Split130OutCtx cloneObj = new Process43Split130OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process43Split130OutCtx getProcess43Split130OutCtx() {
            return new Process43Split130OutCtx();
    }
     public class Process44Split132InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	public BigDecimal getSrc199() throws CFException{      
   		return work.getSrc199();
	}

    public char[] getSrc199String() throws CFException {
          return  work.getSrc199().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src199 with the passed number
	 *	@param number
	 */
	public void setSrc199(BigDecimal number)  throws CFException{
		work.setSrc199(number);
   }


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process44Split132OutCtx getProcess44Split132OutCtx() {
            return new Process44Split132OutCtx();
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

    public Process44Split132InCtx clone() {
        Process44Split132InCtx cloneObj = new Process44Split132InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process44Split132InCtx getProcess44Split132InCtx() {
            return new Process44Split132InCtx();
    }
     public class Process44Split132OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src203
	 *	@return src203
	 */
	public BigDecimal getSrc203() throws CFException {
   		return work.getSrc203();
	}

    /**
	 *	Returns the String value of src203
	 *	@return src203
	 */
	public char[]  getSrc203ActualString()  throws CFException{
	    return work.getSrc203ActualString();
	}

	 /**
     *	Returns String value of src203
     *	@return src203
     */
    public char[]  getSrc203String() throws CFException {
         return work.getSrc203String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src203IsNumeric() {
        return work.src203IsNumeric();
    }
	/**
	 * 	Update Src203 with the passed number
	 *	@param number
	 */
	public void setSrc203(BigDecimal number)  throws CFException{
		work.setSrc203(number);
   }

	/**
	 * 	Update Src203 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc203(char[] value)  throws CFException{
		work.setSrc203(value);
	}   

	/**
	 *	Returns the value of tgt201
	 *	@return tgt201
	 */
	public int getTgt201() throws CFException {        
   		return work.getTgt201();
	}
	
	/**
	 * 	Update Tgt201 with the passed value
	 *	@param number
	 */
	public void setTgt201(int number)  throws CFException{
		work.setTgt201(number);
	}


	public void setTgt201(long number)  throws CFException{
		work.setTgt201((int)number);
	}


	/**
	 *	Returns the value of src202
	 *	@return src202
	 */
	public BigDecimal getSrc202() throws CFException {
   		return work.getSrc202();
	}

    /**
	 *	Returns the String value of src202
	 *	@return src202
	 */
	public char[]  getSrc202ActualString()  throws CFException{
	    return work.getSrc202ActualString();
	}

	 /**
     *	Returns String value of src202
     *	@return src202
     */
    public char[]  getSrc202String() throws CFException {
         return work.getSrc202String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src202IsNumeric() {
        return work.src202IsNumeric();
    }
	/**
	 * 	Update Src202 with the passed number
	 *	@param number
	 */
	public void setSrc202(BigDecimal number)  throws CFException{
		work.setSrc202(number);
   }

	/**
	 * 	Update Src202 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc202(char[] value)  throws CFException{
		work.setSrc202(value);
	}   

	/**
	 *	Returns the value of tgt200
	 *	@return tgt200
	 */
	public int getTgt200() throws CFException {        
   		return work.getTgt200();
	}
	
	/**
	 * 	Update Tgt200 with the passed value
	 *	@param number
	 */
	public void setTgt200(int number)  throws CFException{
		work.setTgt200(number);
	}


	public void setTgt200(long number)  throws CFException{
		work.setTgt200((int)number);
	}


	public BigDecimal getSrc199() throws CFException{      
   		return work.getSrc199();
	}

    public char[] getSrc199String() throws CFException {
          return  work.getSrc199().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src199 with the passed number
	 *	@param number
	 */
	public void setSrc199(BigDecimal number)  throws CFException{
		work.setSrc199(number);
   }

	/**
	 *	Returns the value of tgt199
	 *	@return tgt199
	 */
	public short getTgt199() throws CFException {        
   		return work.getTgt199();
	}
	
	/**
	 * 	Update Tgt199 with the passed value
	 *	@param number
	 */
	public void setTgt199(short number)  throws CFException{
		work.setTgt199(number);
	}

	public void setTgt199(int number)  throws CFException{
		work.setTgt199((short)number);
	}

	public void setTgt199(long number)  throws CFException{
		work.setTgt199((short)number);
	}



	/**
	 *	Returns the value of src200
	 *	@return src200
	 */
	public BigDecimal getSrc200() throws CFException {
   		return work.getSrc200();
	}

    /**
	 *	Returns the String value of src200
	 *	@return src200
	 */
	public char[]  getSrc200ActualString()  throws CFException{
	    return work.getSrc200ActualString();
	}

	 /**
     *	Returns String value of src200
     *	@return src200
     */
    public char[]  getSrc200String() throws CFException {
         return work.getSrc200String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src200IsNumeric() {
        return work.src200IsNumeric();
    }
	/**
	 * 	Update Src200 with the passed number
	 *	@param number
	 */
	public void setSrc200(BigDecimal number)  throws CFException{
		work.setSrc200(number);
   }

	/**
	 * 	Update Src200 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc200(char[] value)  throws CFException{
		work.setSrc200(value);
	}   

	/**
	 *	Returns the value of tgt203
	 *	@return tgt203
	 */
	public short getTgt203() throws CFException {        
   		return work.getTgt203();
	}
	
	/**
	 * 	Update Tgt203 with the passed value
	 *	@param number
	 */
	public void setTgt203(short number)  throws CFException{
		work.setTgt203(number);
	}

	public void setTgt203(int number)  throws CFException{
		work.setTgt203((short)number);
	}

	public void setTgt203(long number)  throws CFException{
		work.setTgt203((short)number);
	}



	/**
	 *	Returns the value of src201
	 *	@return src201
	 */
	public BigDecimal getSrc201() throws CFException {
   		return work.getSrc201();
	}

    /**
	 *	Returns the String value of src201
	 *	@return src201
	 */
	public char[]  getSrc201ActualString()  throws CFException{
	    return work.getSrc201ActualString();
	}

	 /**
     *	Returns String value of src201
     *	@return src201
     */
    public char[]  getSrc201String() throws CFException {
         return work.getSrc201String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src201IsNumeric() {
        return work.src201IsNumeric();
    }
	/**
	 * 	Update Src201 with the passed number
	 *	@param number
	 */
	public void setSrc201(BigDecimal number)  throws CFException{
		work.setSrc201(number);
   }

	/**
	 * 	Update Src201 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc201(char[] value)  throws CFException{
		work.setSrc201(value);
	}   

	/**
	 *	Returns the value of tgt202
	 *	@return tgt202
	 */
	public long getTgt202() throws CFException {        
   		return work.getTgt202();
	}
	
	/**
	 * 	Update Tgt202 with the passed value
	 *	@param number
	 */
	public void setTgt202(long number)  throws CFException{
		work.setTgt202(number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process44Split132OutCtx clone() {
        Process44Split132OutCtx cloneObj = new Process44Split132OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process44Split132OutCtx getProcess44Split132OutCtx() {
            return new Process44Split132OutCtx();
    }
     public class Process45Split134InCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of src203
	 *	@return src203
	 */
	public BigDecimal getSrc203() throws CFException {
   		return work.getSrc203();
	}

    /**
	 *	Returns the String value of src203
	 *	@return src203
	 */
	public char[]  getSrc203ActualString()  throws CFException{
	    return work.getSrc203ActualString();
	}

	 /**
     *	Returns String value of src203
     *	@return src203
     */
    public char[]  getSrc203String() throws CFException {
         return work.getSrc203String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src203IsNumeric() {
        return work.src203IsNumeric();
    }
	/**
	 * 	Update Src203 with the passed number
	 *	@param number
	 */
	public void setSrc203(BigDecimal number)  throws CFException{
		work.setSrc203(number);
   }

	/**
	 * 	Update Src203 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc203(char[] value)  throws CFException{
		work.setSrc203(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process45Split134OutCtx getProcess45Split134OutCtx() {
            return new Process45Split134OutCtx();
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

    public Process45Split134InCtx clone() {
        Process45Split134InCtx cloneObj = new Process45Split134InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process45Split134InCtx getProcess45Split134InCtx() {
            return new Process45Split134InCtx();
    }
     public class Process45Split134OutCtx implements Cloneable {
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt204
	 *	@return tgt204
	 */
   public char[] getTgt204() throws CFException  {              
   		return work.getTgt204();
   }

  
	/**
	*  set variable tgt204
	*  @param value
	**/
   public void setTgt204(char[] value) throws CFException {
      work.setTgt204(value);
   } 

     /**
	 * 	Update Tgt204 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt204(char[] source, int sourceIndex) throws CFException {
      work.setTgt204(source, sourceIndex);
   	
   }
   
   public void setTgt204(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt204(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt204 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt204(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt204(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt204 with another Field
	 *	@param value
	 */
   public void setTgt204(Field source) {
      work.setTgt204(source);
   }  
   
     /**
	 * 	Update Tgt204 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt204(Field source, int sourceIndex,int sourceLen) {
      work.setTgt204(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt204 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt204(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt204(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getTgt208() throws CFException{      
   		return work.getTgt208();
	}

    public char[] getTgt208String() throws CFException {
          return  work.getTgt208().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt208 with the passed number
	 *	@param number
	 */
	public void setTgt208(BigDecimal number)  throws CFException{
		work.setTgt208(number);
   }

	/**
	 *	Returns the value of src203
	 *	@return src203
	 */
	public BigDecimal getSrc203() throws CFException {
   		return work.getSrc203();
	}

    /**
	 *	Returns the String value of src203
	 *	@return src203
	 */
	public char[]  getSrc203ActualString()  throws CFException{
	    return work.getSrc203ActualString();
	}

	 /**
     *	Returns String value of src203
     *	@return src203
     */
    public char[]  getSrc203String() throws CFException {
         return work.getSrc203String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src203IsNumeric() {
        return work.src203IsNumeric();
    }
	/**
	 * 	Update Src203 with the passed number
	 *	@param number
	 */
	public void setSrc203(BigDecimal number)  throws CFException{
		work.setSrc203(number);
   }

	/**
	 * 	Update Src203 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc203(char[] value)  throws CFException{
		work.setSrc203(value);
	}   

	/**
	 *	Returns the value of tgt205
	 *	@return tgt205
	 */
   public char[] getTgt205() throws CFException  {              
   		return work.getTgt205();
   }

  
	/**
	*  set variable tgt205
	*  @param value
	**/
   public void setTgt205(char[] value) throws CFException {
      work.setTgt205(value);
   } 

     /**
	 * 	Update Tgt205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt205(char[] source, int sourceIndex) throws CFException {
      work.setTgt205(source, sourceIndex);
   	
   }
   
   public void setTgt205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt205 with another Field
	 *	@param value
	 */
   public void setTgt205(Field source) {
      work.setTgt205(source);
   }  
   
     /**
	 * 	Update Tgt205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt205(Field source, int sourceIndex,int sourceLen) {
      work.setTgt205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of src207
	 *	@return src207
	 */
   public char[] getSrc207() throws CFException  {              
   		return work.getSrc207();
   }

  
	/**
	*  set variable src207
	*  @param value
	**/
   public void setSrc207(char[] value) throws CFException {
      work.setSrc207(value);
   } 

     /**
	 * 	Update Src207 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc207(char[] source, int sourceIndex) throws CFException {
      work.setSrc207(source, sourceIndex);
   	
   }
   
   public void setSrc207(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc207(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src207 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc207(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc207(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src207 with another Field
	 *	@param value
	 */
   public void setSrc207(Field source) {
      work.setSrc207(source);
   }  
   
     /**
	 * 	Update Src207 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc207(Field source, int sourceIndex,int sourceLen) {
      work.setSrc207(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src207 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc207(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc207(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt207
	 *	@return tgt207
	 */
	public BigDecimal getTgt207() throws CFException {
   		return work.getTgt207();
	}

    /**
	 *	Returns the String value of tgt207
	 *	@return tgt207
	 */
	public char[]  getTgt207ActualString()  throws CFException{
	    return work.getTgt207ActualString();
	}

	 /**
     *	Returns String value of tgt207
     *	@return tgt207
     */
    public char[]  getTgt207String() throws CFException {
         return work.getTgt207String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean tgt207IsNumeric() {
        return work.tgt207IsNumeric();
    }
	/**
	 * 	Update Tgt207 with the passed number
	 *	@param number
	 */
	public void setTgt207(BigDecimal number)  throws CFException{
		work.setTgt207(number);
   }

	/**
	 * 	Update Tgt207 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setTgt207(char[] value)  throws CFException{
		work.setTgt207(value);
	}   

	/**
	 *	Returns the value of src208
	 *	@return src208
	 */
   public char[] getSrc208() throws CFException  {              
   		return work.getSrc208();
   }

  
	/**
	*  set variable src208
	*  @param value
	**/
   public void setSrc208(char[] value) throws CFException {
      work.setSrc208(value);
   } 

     /**
	 * 	Update Src208 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc208(char[] source, int sourceIndex) throws CFException {
      work.setSrc208(source, sourceIndex);
   	
   }
   
   public void setSrc208(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc208(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src208 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc208(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc208(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src208 with another Field
	 *	@param value
	 */
   public void setSrc208(Field source) {
      work.setSrc208(source);
   }  
   
     /**
	 * 	Update Src208 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc208(Field source, int sourceIndex,int sourceLen) {
      work.setSrc208(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src208 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc208(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc208(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt203
	 *	@return tgt203
	 */
	public short getTgt203() throws CFException {        
   		return work.getTgt203();
	}
	
	/**
	 * 	Update Tgt203 with the passed value
	 *	@param number
	 */
	public void setTgt203(short number)  throws CFException{
		work.setTgt203(number);
	}

	public void setTgt203(int number)  throws CFException{
		work.setTgt203((short)number);
	}

	public void setTgt203(long number)  throws CFException{
		work.setTgt203((short)number);
	}



	public BigDecimal getSrc205() throws CFException{      
   		return work.getSrc205();
	}

    public char[] getSrc205String() throws CFException {
          return  work.getSrc205().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Src205 with the passed number
	 *	@param number
	 */
	public void setSrc205(BigDecimal number)  throws CFException{
		work.setSrc205(number);
   }

	/**
	 *	Returns the value of src204
	 *	@return src204
	 */
	public BigDecimal getSrc204() throws CFException {
   		return work.getSrc204();
	}

    /**
	 *	Returns the String value of src204
	 *	@return src204
	 */
	public char[]  getSrc204ActualString()  throws CFException{
	    return work.getSrc204ActualString();
	}

	 /**
     *	Returns String value of src204
     *	@return src204
     */
    public char[]  getSrc204String() throws CFException {
         return work.getSrc204String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean src204IsNumeric() {
        return work.src204IsNumeric();
    }
	/**
	 * 	Update Src204 with the passed number
	 *	@param number
	 */
	public void setSrc204(BigDecimal number)  throws CFException{
		work.setSrc204(number);
   }

	/**
	 * 	Update Src204 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSrc204(char[] value)  throws CFException{
		work.setSrc204(value);
	}   


        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
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

    public Process45Split134OutCtx clone() {
        Process45Split134OutCtx cloneObj = new Process45Split134OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process45Split134OutCtx getProcess45Split134OutCtx() {
            return new Process45Split134OutCtx();
    }
     public class Process46InCtx implements Cloneable {
     Src210Grp src210Grp = S918testCtx.this.getSrc210Grp();
     Src212Grp src212Grp = S918testCtx.this.getSrc212Grp();
     Tgt211Grp tgt211Grp = S918testCtx.this.getTgt211Grp();
     Tgt212Grp tgt212Grp = S918testCtx.this.getTgt212Grp();
     Work work = S918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt211
	 *	@return tgt211
	 */
	public long getTgt211(int index) throws CFException {
   		return tgt211Grp.getTgt211((index));
	}


	/**
	 *	Returns String value of tgt211
	 *	@return tgt211
	 */
	public char[]  getTgt211String(int index) throws CFException {
	     return String.valueOf(tgt211Grp.getTgt211String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt211IsNumeric(int index)  throws CFException{
	    return tgt211Grp.tgt211IsNumeric(index);
	}

	/**
	 * 	Update Tgt211 with the passed value
	 *	@param number
	 */
	public void setTgt211(int index,long number)  throws CFException{
		tgt211Grp.setTgt211((index),number);
	}
	

	
	/**
	 * 	Update Tgt211 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt211(int index,char[] value)  throws CFException {
		tgt211Grp.setTgt211((index),value);
	}
	
	/**
	 * 	Update Tgt211 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt211String(int index,char[] value)  throws CFException{
		tgt211Grp.setTgt211((index),value);
	}	

	/**
	 *	Returns the value of tgt212
	 *	@return tgt212
	 */
	public long getTgt212(int index) throws CFException {
   		return tgt212Grp.getTgt212((index));
	}


	/**
	 *	Returns String value of tgt212
	 *	@return tgt212
	 */
	public char[]  getTgt212String(int index) throws CFException {
	     return String.valueOf(tgt212Grp.getTgt212String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt212IsNumeric(int index)  throws CFException{
	    return tgt212Grp.tgt212IsNumeric(index);
	}

	/**
	 * 	Update Tgt212 with the passed value
	 *	@param number
	 */
	public void setTgt212(int index,long number)  throws CFException{
		tgt212Grp.setTgt212((index),number);
	}
	

	
	/**
	 * 	Update Tgt212 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt212(int index,char[] value)  throws CFException {
		tgt212Grp.setTgt212((index),value);
	}
	
	/**
	 * 	Update Tgt212 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt212String(int index,char[] value)  throws CFException{
		tgt212Grp.setTgt212((index),value);
	}	

	/**
	 *	Returns the value of src210
	 *	@return src210
	 */
	public short getSrc210(int index) throws CFException {        
   		return src210Grp.getSrc210((index));
	}
	
	/**
	 * 	Update Src210 with the passed value
	 *	@param number
	 */
	public void setSrc210(int index,short number)  throws CFException{
		src210Grp.setSrc210((index),number);
	}

	public void setSrc210(int index,int number)  throws CFException{
		src210Grp.setSrc210((index),(short)number);
	}

	public void setSrc210(int index,long number)  throws CFException{
		src210Grp.setSrc210((index),(short)number);
	}



	/**
	 *	Returns the value of tgt210
	 *	@return tgt210
	 */
	public long getTgt210() throws CFException {
   		return work.getTgt210();
	}


	/**
	 *	Returns String value of tgt210
	 *	@return tgt210
	 */
	public char[]  getTgt210String() throws CFException {
	     return String.valueOf(work.getTgt210String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt210IsNumeric()  throws CFException{
	    return work.tgt210IsNumeric();
	}

	/**
	 * 	Update Tgt210 with the passed value
	 *	@param number
	 */
	public void setTgt210(long number)  throws CFException{
		work.setTgt210(number);
	}
	

	
	/**
	 * 	Update Tgt210 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt210(char[] value)  throws CFException {
		work.setTgt210(value);
	}
	
	/**
	 * 	Update Tgt210 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt210String(char[] value)  throws CFException{
		work.setTgt210(value);
	}	

	/**
	 *	Returns the value of src212
	 *	@return src212
	 */
	public short getSrc212(int index) throws CFException {        
   		return src212Grp.getSrc212((index));
	}
	
	/**
	 * 	Update Src212 with the passed value
	 *	@param number
	 */
	public void setSrc212(int index,short number)  throws CFException{
		src212Grp.setSrc212((index),number);
	}

	public void setSrc212(int index,int number)  throws CFException{
		src212Grp.setSrc212((index),(short)number);
	}

	public void setSrc212(int index,long number)  throws CFException{
		src212Grp.setSrc212((index),(short)number);
	}



	/**
	 *	Returns the value of src211
	 *	@return src211
	 */
	public short getSrc211() throws CFException {        
   		return work.getSrc211();
	}
	
	/**
	 * 	Update Src211 with the passed value
	 *	@param number
	 */
	public void setSrc211(short number)  throws CFException{
		work.setSrc211(number);
	}

	public void setSrc211(int number)  throws CFException{
		work.setSrc211((short)number);
	}

	public void setSrc211(long number)  throws CFException{
		work.setSrc211((short)number);
	}



	/**
	 *	Returns the value of src208
	 *	@return src208
	 */
   public char[] getSrc208() throws CFException  {              
   		return work.getSrc208();
   }

  
	/**
	*  set variable src208
	*  @param value
	**/
   public void setSrc208(char[] value) throws CFException {
      work.setSrc208(value);
   } 

     /**
	 * 	Update Src208 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc208(char[] source, int sourceIndex) throws CFException {
      work.setSrc208(source, sourceIndex);
   	
   }
   
   public void setSrc208(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc208(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src208 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc208(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc208(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src208 with another Field
	 *	@param value
	 */
   public void setSrc208(Field source) {
      work.setSrc208(source);
   }  
   
     /**
	 * 	Update Src208 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc208(Field source, int sourceIndex,int sourceLen) {
      work.setSrc208(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src208 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc208(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc208(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt211Grp
	 *	@return tgt211Grp
	 */   
	 public Tgt211Grp getTgt211Grp() {
   	return tgt211Grp;
   }


	/**
	 *	Returns the value of tgt212Grp
	 *	@return tgt212Grp
	 */   
	 public Tgt212Grp getTgt212Grp() {
   	return tgt212Grp;
   }


	/**
	 *	Returns the value of tgt209
	 *	@return tgt209
	 */
	public long getTgt209() throws CFException {
   		return work.getTgt209();
	}


	/**
	 *	Returns String value of tgt209
	 *	@return tgt209
	 */
	public char[]  getTgt209String() throws CFException {
	     return String.valueOf(work.getTgt209String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt209IsNumeric()  throws CFException{
	    return work.tgt209IsNumeric();
	}

	/**
	 * 	Update Tgt209 with the passed value
	 *	@param number
	 */
	public void setTgt209(long number)  throws CFException{
		work.setTgt209(number);
	}
	

	
	/**
	 * 	Update Tgt209 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt209(char[] value)  throws CFException {
		work.setTgt209(value);
	}
	
	/**
	 * 	Update Tgt209 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt209String(char[] value)  throws CFException{
		work.setTgt209(value);
	}	

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of src209
	 *	@return src209
	 */
	public short getSrc209() throws CFException {        
   		return work.getSrc209();
	}
	
	/**
	 * 	Update Src209 with the passed value
	 *	@param number
	 */
	public void setSrc209(short number)  throws CFException{
		work.setSrc209(number);
	}

	public void setSrc209(int number)  throws CFException{
		work.setSrc209((short)number);
	}

	public void setSrc209(long number)  throws CFException{
		work.setSrc209((short)number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }

        public Process46OutCtx getProcess46OutCtx() {
            return new Process46OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src210Grp.hashCode();
        str += src212Grp.hashCode();
        str += tgt211Grp.hashCode();
        str += tgt212Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process46InCtx clone() {
        Process46InCtx cloneObj = new Process46InCtx();
        cloneObj.src210Grp = new Src210Grp();
        cloneObj.src210Grp.set(src210Grp.getClonedField());
        cloneObj.src212Grp = new Src212Grp();
        cloneObj.src212Grp.set(src212Grp.getClonedField());
        cloneObj.tgt211Grp = new Tgt211Grp();
        cloneObj.tgt211Grp.set(tgt211Grp.getClonedField());
        cloneObj.tgt212Grp = new Tgt212Grp();
        cloneObj.tgt212Grp.set(tgt212Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process46InCtx getProcess46InCtx() {
            return new Process46InCtx();
    }
     public class Process46OutCtx implements Cloneable {
     Src210Grp src210Grp = S918testCtx.this.getSrc210Grp();
     Src212Grp src212Grp = S918testCtx.this.getSrc212Grp();
     Tgt211Grp tgt211Grp = S918testCtx.this.getTgt211Grp();
     Tgt212Grp tgt212Grp = S918testCtx.this.getTgt212Grp();
     Work work = S918testCtx.this.getWork();

	public BigDecimal getTgt208() throws CFException{      
   		return work.getTgt208();
	}

    public char[] getTgt208String() throws CFException {
          return  work.getTgt208().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt208 with the passed number
	 *	@param number
	 */
	public void setTgt208(BigDecimal number)  throws CFException{
		work.setTgt208(number);
   }

	/**
	 *	Returns the value of tgt211
	 *	@return tgt211
	 */
	public long getTgt211(int index) throws CFException {
   		return tgt211Grp.getTgt211((index));
	}


	/**
	 *	Returns String value of tgt211
	 *	@return tgt211
	 */
	public char[]  getTgt211String(int index) throws CFException {
	     return String.valueOf(tgt211Grp.getTgt211String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt211IsNumeric(int index)  throws CFException{
	    return tgt211Grp.tgt211IsNumeric(index);
	}

	/**
	 * 	Update Tgt211 with the passed value
	 *	@param number
	 */
	public void setTgt211(int index,long number)  throws CFException{
		tgt211Grp.setTgt211((index),number);
	}
	

	
	/**
	 * 	Update Tgt211 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt211(int index,char[] value)  throws CFException {
		tgt211Grp.setTgt211((index),value);
	}
	
	/**
	 * 	Update Tgt211 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt211String(int index,char[] value)  throws CFException{
		tgt211Grp.setTgt211((index),value);
	}	

	/**
	 *	Returns the value of tgt212
	 *	@return tgt212
	 */
	public long getTgt212(int index) throws CFException {
   		return tgt212Grp.getTgt212((index));
	}


	/**
	 *	Returns String value of tgt212
	 *	@return tgt212
	 */
	public char[]  getTgt212String(int index) throws CFException {
	     return String.valueOf(tgt212Grp.getTgt212String((index))).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt212IsNumeric(int index)  throws CFException{
	    return tgt212Grp.tgt212IsNumeric(index);
	}

	/**
	 * 	Update Tgt212 with the passed value
	 *	@param number
	 */
	public void setTgt212(int index,long number)  throws CFException{
		tgt212Grp.setTgt212((index),number);
	}
	

	
	/**
	 * 	Update Tgt212 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt212(int index,char[] value)  throws CFException {
		tgt212Grp.setTgt212((index),value);
	}
	
	/**
	 * 	Update Tgt212 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt212String(int index,char[] value)  throws CFException{
		tgt212Grp.setTgt212((index),value);
	}	

	/**
	 *	Returns the value of src210
	 *	@return src210
	 */
	public short getSrc210(int index) throws CFException {        
   		return src210Grp.getSrc210((index));
	}
	
	/**
	 * 	Update Src210 with the passed value
	 *	@param number
	 */
	public void setSrc210(int index,short number)  throws CFException{
		src210Grp.setSrc210((index),number);
	}

	public void setSrc210(int index,int number)  throws CFException{
		src210Grp.setSrc210((index),(short)number);
	}

	public void setSrc210(int index,long number)  throws CFException{
		src210Grp.setSrc210((index),(short)number);
	}



	/**
	 *	Returns the value of tgt210
	 *	@return tgt210
	 */
	public long getTgt210() throws CFException {
   		return work.getTgt210();
	}


	/**
	 *	Returns String value of tgt210
	 *	@return tgt210
	 */
	public char[]  getTgt210String() throws CFException {
	     return String.valueOf(work.getTgt210String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt210IsNumeric()  throws CFException{
	    return work.tgt210IsNumeric();
	}

	/**
	 * 	Update Tgt210 with the passed value
	 *	@param number
	 */
	public void setTgt210(long number)  throws CFException{
		work.setTgt210(number);
	}
	

	
	/**
	 * 	Update Tgt210 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt210(char[] value)  throws CFException {
		work.setTgt210(value);
	}
	
	/**
	 * 	Update Tgt210 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt210String(char[] value)  throws CFException{
		work.setTgt210(value);
	}	

	/**
	 *	Returns the value of src212
	 *	@return src212
	 */
	public short getSrc212(int index) throws CFException {        
   		return src212Grp.getSrc212((index));
	}
	
	/**
	 * 	Update Src212 with the passed value
	 *	@param number
	 */
	public void setSrc212(int index,short number)  throws CFException{
		src212Grp.setSrc212((index),number);
	}

	public void setSrc212(int index,int number)  throws CFException{
		src212Grp.setSrc212((index),(short)number);
	}

	public void setSrc212(int index,long number)  throws CFException{
		src212Grp.setSrc212((index),(short)number);
	}



	/**
	 *	Returns the value of src211
	 *	@return src211
	 */
	public short getSrc211() throws CFException {        
   		return work.getSrc211();
	}
	
	/**
	 * 	Update Src211 with the passed value
	 *	@param number
	 */
	public void setSrc211(short number)  throws CFException{
		work.setSrc211(number);
	}

	public void setSrc211(int number)  throws CFException{
		work.setSrc211((short)number);
	}

	public void setSrc211(long number)  throws CFException{
		work.setSrc211((short)number);
	}



	/**
	 *	Returns the value of src208
	 *	@return src208
	 */
   public char[] getSrc208() throws CFException  {              
   		return work.getSrc208();
   }

  
	/**
	*  set variable src208
	*  @param value
	**/
   public void setSrc208(char[] value) throws CFException {
      work.setSrc208(value);
   } 

     /**
	 * 	Update Src208 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrc208(char[] source, int sourceIndex) throws CFException {
      work.setSrc208(source, sourceIndex);
   	
   }
   
   public void setSrc208(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSrc208(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Src208 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrc208(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc208(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Src208 with another Field
	 *	@param value
	 */
   public void setSrc208(Field source) {
      work.setSrc208(source);
   }  
   
     /**
	 * 	Update Src208 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrc208(Field source, int sourceIndex,int sourceLen) {
      work.setSrc208(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Src208 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrc208(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSrc208(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt209
	 *	@return tgt209
	 */
	public long getTgt209() throws CFException {
   		return work.getTgt209();
	}


	/**
	 *	Returns String value of tgt209
	 *	@return tgt209
	 */
	public char[]  getTgt209String() throws CFException {
	     return String.valueOf(work.getTgt209String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt209IsNumeric()  throws CFException{
	    return work.tgt209IsNumeric();
	}

	/**
	 * 	Update Tgt209 with the passed value
	 *	@param number
	 */
	public void setTgt209(long number)  throws CFException{
		work.setTgt209(number);
	}
	

	
	/**
	 * 	Update Tgt209 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt209(char[] value)  throws CFException {
		work.setTgt209(value);
	}
	
	/**
	 * 	Update Tgt209 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt209String(char[] value)  throws CFException{
		work.setTgt209(value);
	}	

	/**
	 *	Returns the value of src209
	 *	@return src209
	 */
	public short getSrc209() throws CFException {        
   		return work.getSrc209();
	}
	
	/**
	 * 	Update Src209 with the passed value
	 *	@param number
	 */
	public void setSrc209(short number)  throws CFException{
		work.setSrc209(number);
	}

	public void setSrc209(int number)  throws CFException{
		work.setSrc209((short)number);
	}

	public void setSrc209(long number)  throws CFException{
		work.setSrc209((short)number);
	}




        public S918testCtx getS918testCtx() {
            return S918testCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += src210Grp.hashCode();
        str += src212Grp.hashCode();
        str += tgt211Grp.hashCode();
        str += tgt212Grp.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process46OutCtx clone() {
        Process46OutCtx cloneObj = new Process46OutCtx();
        cloneObj.src210Grp = new Src210Grp();
        cloneObj.src210Grp.set(src210Grp.getClonedField());
        cloneObj.src212Grp = new Src212Grp();
        cloneObj.src212Grp.set(src212Grp.getClonedField());
        cloneObj.tgt211Grp = new Tgt211Grp();
        cloneObj.tgt211Grp.set(tgt211Grp.getClonedField());
        cloneObj.tgt212Grp = new Tgt212Grp();
        cloneObj.tgt212Grp.set(tgt212Grp.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process46OutCtx getProcess46OutCtx() {
            return new Process46OutCtx();
    }
}
