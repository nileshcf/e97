package com.cloudframe.app.c88comm;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.c88comm.dto.Group;
import com.cloudframe.app.c88comm.dto.Work;


@Context
public class C88commCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Group group;
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


    public Group getGroup() {
        if (group == null) {
            group = new Group();
        }

        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
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
        str += group.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public C88commCtx clone() {
        C88commCtx cloneObj = new C88commCtx();
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainParaInCtx implements Cloneable {
     Group group = C88commCtx.this.getGroup();

	/**
	 *	Returns the value of group
	 *	@return group
	 */   
	 public Group getGroup() {
   	return group;
   }



        public C88commCtx getC88commCtx() {
            return C88commCtx.this;
        }

        public MainParaOutCtx getMainParaOutCtx() {
            return new MainParaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += group.hashCode();
       return str.hashCode();
    }

    public MainParaInCtx clone() {
        MainParaInCtx cloneObj = new MainParaInCtx();
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        return cloneObj;
    }

    }

    public MainParaInCtx getMainParaInCtx() {
            return new MainParaInCtx();
    }
     public class MainParaOutCtx implements Cloneable {
     Group group = C88commCtx.this.getGroup();

	/**
	 *	Returns the value of group
	 *	@return group
	 */   
	 public Group getGroup() {
   	return group;
   }


	/**
	 *	Test condition 5 6 7 for isAll()
	 *	@return  Returns true if isAll() is 5 6 7
	 */
   public boolean isAll() throws CFException {
      return group.isAll();
   }

	/**
	*  set values 5 6 7
	*/
   	public void setAllTrue()  throws CFException{  			
    	group.setAllTrue();
   	}
	/**
	 *	Returns the value of numbers
	 *	@return numbers
	 */
	public int getNumbers() throws CFException {
   		return group.getNumbers();
	}


	/**
	 *	Returns String value of numbers
	 *	@return numbers
	 */
	public char[]  getNumbersString() throws CFException {
	     return String.valueOf(group.getNumbersString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numbersIsNumeric()  throws CFException{
	    return group.numbersIsNumeric();
	}

	/**
	 * 	Update Numbers with the passed value
	 *	@param number
	 */
	public void setNumbers(int number)  throws CFException{
		group.setNumbers(number);
	}
	

	public void setNumbers(long number)  throws CFException{
	    group.setNumbers(number);
	}
	
	
	/**
	 * 	Update Numbers with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumbers(char[] value)  throws CFException {
		group.setNumbers(value);
	}
	
	/**
	 * 	Update Numbers with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumbersString(char[] value)  throws CFException{
		group.setNumbers(value);
	}	


        public C88commCtx getC88commCtx() {
            return C88commCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += group.hashCode();
       return str.hashCode();
    }

    public MainParaOutCtx clone() {
        MainParaOutCtx cloneObj = new MainParaOutCtx();
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        return cloneObj;
    }

    }

    public MainParaOutCtx getMainParaOutCtx() {
            return new MainParaOutCtx();
    }
}
