package com.cloudframe.app.var88grp;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.var88grp.dto.Group;
import com.cloudframe.app.var88grp.dto.Livelli88;
import com.cloudframe.app.var88grp.dto.Work;


@Context
public class Var88grpCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Group group;
    Livelli88 livelli88;


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
    public Group getGroup() {
        if (group == null) {
            group = new Group();
        }

        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    public Livelli88 getLivelli88() {
        if (livelli88 == null) {
            livelli88 = new Livelli88();
        }

        return livelli88;
    }

    public void setLivelli88(Livelli88 livelli88) {
        this.livelli88 = livelli88;
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
        str += group.hashCode();
        str += livelli88.hashCode();
       return str.hashCode();
    }

    public Var88grpCtx clone() {
        Var88grpCtx cloneObj = new Var88grpCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.livelli88 = new Livelli88();
        cloneObj.livelli88.set(livelli88.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainParaInCtx implements Cloneable {
     Group group = Var88grpCtx.this.getGroup();
     Livelli88 livelli88 = Var88grpCtx.this.getLivelli88();

	/**
	 *	Returns the value of group
	 *	@return group
	 */   
	 public Group getGroup() {
   	return group;
   }


	/**
	 *	Returns the value of livelli88
	 *	@return livelli88
	 */   
	 public Livelli88 getLivelli88() {
   	return livelli88;
   }



        public Var88grpCtx getVar88grpCtx() {
            return Var88grpCtx.this;
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
        str += livelli88.hashCode();
       return str.hashCode();
    }

    public MainParaInCtx clone() {
        MainParaInCtx cloneObj = new MainParaInCtx();
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.livelli88 = new Livelli88();
        cloneObj.livelli88.set(livelli88.getClonedField());
        return cloneObj;
    }

    }

    public MainParaInCtx getMainParaInCtx() {
            return new MainParaInCtx();
    }
     public class MainParaOutCtx implements Cloneable {
     Group group = Var88grpCtx.this.getGroup();
     Livelli88 livelli88 = Var88grpCtx.this.getLivelli88();

	/**
	 *	Returns the value of group
	 *	@return group
	 */   
	 public Group getGroup() {
   	return group;
   }


	/**
	 *	Returns the value of swCurvaChild
	 *	@return swCurvaChild
	 */
	public int getSwCurvaChild() throws CFException {
   		return livelli88.getSwCurvaChild();
	}


	/**
	 *	Returns String value of swCurvaChild
	 *	@return swCurvaChild
	 */
	public char[]  getSwCurvaChildString() throws CFException {
	     return String.valueOf(livelli88.getSwCurvaChildString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean swCurvaChildIsNumeric()  throws CFException{
	    return livelli88.swCurvaChildIsNumeric();
	}

	/**
	 * 	Update SwCurvaChild with the passed value
	 *	@param number
	 */
	public void setSwCurvaChild(int number)  throws CFException{
		livelli88.setSwCurvaChild(number);
	}
	

	public void setSwCurvaChild(long number)  throws CFException{
	    livelli88.setSwCurvaChild(number);
	}
	
	
	/**
	 * 	Update SwCurvaChild with the passed value
	 *	@param value (String or char[])
	 */
	public void setSwCurvaChild(char[] value)  throws CFException {
		livelli88.setSwCurvaChild(value);
	}
	
	/**
	 * 	Update SwCurvaChild with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSwCurvaChildString(char[] value)  throws CFException{
		livelli88.setSwCurvaChild(value);
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
	 *	Test condition 5 6 7 for isChildAll()
	 *	@return  Returns true if isChildAll() is 5 6 7
	 */
   public boolean isChildAll() throws CFException {
      return livelli88.isChildAll();
   }

	/**
	*  set values 5 6 7
	*/
   	public void setChildAllTrue()  throws CFException{  			
    	livelli88.setChildAllTrue();
   	}
	/**
	 *	Returns the value of livelli88
	 *	@return livelli88
	 */   
	 public Livelli88 getLivelli88() {
   	return livelli88;
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


        public Var88grpCtx getVar88grpCtx() {
            return Var88grpCtx.this;
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
        str += livelli88.hashCode();
       return str.hashCode();
    }

    public MainParaOutCtx clone() {
        MainParaOutCtx cloneObj = new MainParaOutCtx();
        cloneObj.group = new Group();
        cloneObj.group.set(group.getClonedField());
        cloneObj.livelli88 = new Livelli88();
        cloneObj.livelli88.set(livelli88.getClonedField());
        return cloneObj;
    }

    }

    public MainParaOutCtx getMainParaOutCtx() {
            return new MainParaOutCtx();
    }
}
