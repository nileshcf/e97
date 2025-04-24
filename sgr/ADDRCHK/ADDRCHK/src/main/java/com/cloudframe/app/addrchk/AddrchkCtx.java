package com.cloudframe.app.addrchk;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.addrchk.dto.Var3;
import com.cloudframe.app.addrchk.dto.Var1;
import com.cloudframe.app.addrchk.dto.Work;
import com.cloudframe.app.addrchk.dto.Groupvar1;
import com.cloudframe.app.addrchk.dto.Groupvar2;


@Context
public class AddrchkCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Groupvar1 groupvar1;
    Groupvar2 groupvar2;
    Var3 var3;
    Work work;
    Var1 var1;


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


    public Groupvar1 getGroupvar1() {
        if (groupvar1 == null) {
            groupvar1 = new Groupvar1();
        }

        return groupvar1;
    }

    public void setGroupvar1(Groupvar1 groupvar1) {
        this.groupvar1 = groupvar1;
    }
    public Groupvar2 getGroupvar2() {
        if (groupvar2 == null) {
            groupvar2 = new Groupvar2();
        }

        return groupvar2;
    }

    public void setGroupvar2(Groupvar2 groupvar2) {
        this.groupvar2 = groupvar2;
    }
    public Var3 getVar3() {
        if (var3 == null) {
            var3 = new Var3();
        }

        return var3;
    }

    public void setVar3(Var3 var3) {
        this.var3 = var3;
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
    public Var1 getVar1() {
        if (var1 == null) {
            var1 = new Var1();
        }

        return var1;
    }

    public void setVar1(Var1 var1) {
        this.var1 = var1;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += groupvar1.hashCode();
        str += groupvar2.hashCode();
        str += var3.hashCode();
        str += work.hashCode();
        str += var1.hashCode();
       return str.hashCode();
    }

    public AddrchkCtx clone() {
        AddrchkCtx cloneObj = new AddrchkCtx();
        cloneObj.groupvar1 = new Groupvar1();
        cloneObj.groupvar1.set(groupvar1.getClonedField());
        cloneObj.groupvar2 = new Groupvar2();
        cloneObj.groupvar2.set(groupvar2.getClonedField());
        cloneObj.var3 = new Var3();
        cloneObj.var3.set(var3.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.var1 = new Var1();
        cloneObj.var1.set(var1.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Groupvar1 groupvar1 = AddrchkCtx.this.getGroupvar1();
     Groupvar2 groupvar2 = AddrchkCtx.this.getGroupvar2();
     Var3 var3 = AddrchkCtx.this.getVar3();
     Work work = AddrchkCtx.this.getWork();
     Var1 var1 = AddrchkCtx.this.getVar1();

	/**
	 *	Returns the value of primvar1
	 *	@return primvar1
	 */
	public int getPrimvar1() throws CFException {        
   		return work.getPrimvar1();
	}
	
	/**
	 * 	Update Primvar1 with the passed value
	 *	@param number
	 */
	public void setPrimvar1(int number)  throws CFException{
		work.setPrimvar1(number);
	}


	public void setPrimvar1(long number)  throws CFException{
		work.setPrimvar1((int)number);
	}


	/**
	 *	Returns the value of groupvar1
	 *	@return groupvar1
	 */   
	 public Groupvar1 getGroupvar1() {
   	return groupvar1;
   }


	/**
	 *	Returns the value of groupvar2
	 *	@return groupvar2
	 */   
	 public Groupvar2 getGroupvar2() {
   	return groupvar2;
   }


	/**
	 *	Returns the value of var3
	 *	@return var3
	 */   
	 public Var3 getVar3() {
   	return var3;
   }


	/**
	 *	Returns the value of primvar3
	 *	@return primvar3
	 */
	public int getPrimvar3() throws CFException {        
   		return work.getPrimvar3();
	}
	
	/**
	 * 	Update Primvar3 with the passed value
	 *	@param number
	 */
	public void setPrimvar3(int number)  throws CFException{
		work.setPrimvar3(number);
	}


	public void setPrimvar3(long number)  throws CFException{
		work.setPrimvar3((int)number);
	}


	/**
	 *	Returns the value of var1
	 *	@return var1
	 */   
	 public Var1 getVar1() {
   	return var1;
   }



        public AddrchkCtx getAddrchkCtx() {
            return AddrchkCtx.this;
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
        str += groupvar1.hashCode();
        str += groupvar2.hashCode();
        str += var3.hashCode();
        str += work.hashCode();
        str += var1.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.groupvar1 = new Groupvar1();
        cloneObj.groupvar1.set(groupvar1.getClonedField());
        cloneObj.groupvar2 = new Groupvar2();
        cloneObj.groupvar2.set(groupvar2.getClonedField());
        cloneObj.var3 = new Var3();
        cloneObj.var3.set(var3.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.var1 = new Var1();
        cloneObj.var1.set(var1.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Var3 var3 = AddrchkCtx.this.getVar3();
     Groupvar1 groupvar1 = AddrchkCtx.this.getGroupvar1();
     Groupvar2 groupvar2 = AddrchkCtx.this.getGroupvar2();
     Work work = AddrchkCtx.this.getWork();
     Var1 var1 = AddrchkCtx.this.getVar1();

	/**
	 *	Returns the value of primvar1
	 *	@return primvar1
	 */
	public int getPrimvar1() throws CFException {        
   		return work.getPrimvar1();
	}
	
	/**
	 * 	Update Primvar1 with the passed value
	 *	@param number
	 */
	public void setPrimvar1(int number)  throws CFException{
		work.setPrimvar1(number);
	}


	public void setPrimvar1(long number)  throws CFException{
		work.setPrimvar1((int)number);
	}


	/**
	 *	Returns the value of var3
	 *	@return var3
	 */   
	 public Var3 getVar3() {
   	return var3;
   }


	/**
	 *	Returns the value of primvar3
	 *	@return primvar3
	 */
	public int getPrimvar3() throws CFException {        
   		return work.getPrimvar3();
	}
	
	/**
	 * 	Update Primvar3 with the passed value
	 *	@param number
	 */
	public void setPrimvar3(int number)  throws CFException{
		work.setPrimvar3(number);
	}


	public void setPrimvar3(long number)  throws CFException{
		work.setPrimvar3((int)number);
	}


	/**
	 *	Returns the value of primvar2
	 *	@return primvar2
	 */
	public int getPrimvar2() throws CFException {        
   		return work.getPrimvar2();
	}
	
	/**
	 * 	Update Primvar2 with the passed value
	 *	@param number
	 */
	public void setPrimvar2(int number)  throws CFException{
		work.setPrimvar2(number);
	}


	public void setPrimvar2(long number)  throws CFException{
		work.setPrimvar2((int)number);
	}


	/**
	 *	Returns the value of var1
	 *	@return var1
	 */   
	 public Var1 getVar1() {
   	return var1;
   }



        public AddrchkCtx getAddrchkCtx() {
            return AddrchkCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += var3.hashCode();
        str += groupvar1.hashCode();
        str += groupvar2.hashCode();
        str += work.hashCode();
        str += var1.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.var3 = new Var3();
        cloneObj.var3.set(var3.getClonedField());
        cloneObj.groupvar1 = new Groupvar1();
        cloneObj.groupvar1.set(groupvar1.getClonedField());
        cloneObj.groupvar2 = new Groupvar2();
        cloneObj.groupvar2.set(groupvar2.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.var1 = new Var1();
        cloneObj.var1.set(var1.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
