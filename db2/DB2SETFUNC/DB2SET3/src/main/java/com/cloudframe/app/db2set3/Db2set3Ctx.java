package com.cloudframe.app.db2set3;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.db2set3.dto.Sqlwarn;
import com.cloudframe.app.db2set3.dto.Work;
import com.cloudframe.app.db2set3.dto.Sqlca;
import com.cloudframe.app.db2set3.dto.Vars;


@Context
public class Db2set3Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Sqlca sqlca;
    Work work;
    Vars vars;


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


    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
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
    public Vars getVars() {
        if (vars == null) {
            vars = new Vars();
        }

        return vars;
    }

    public void setVars(Vars vars) {
        this.vars = vars;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += work.hashCode();
        str += vars.hashCode();
       return str.hashCode();
    }

    public Db2set3Ctx clone() {
        Db2set3Ctx cloneObj = new Db2set3Ctx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InitializeInCtx implements Cloneable {
     Sqlca sqlca = Db2set3Ctx.this.getSqlca();
     Vars vars = Db2set3Ctx.this.getVars();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of firstDayMnth
	 *	@return firstDayMnth
	 */
   public char[] getFirstDayMnth() throws CFException  {              
   		return vars.getFirstDayMnth();
   }

  
	/**
	*  set variable firstDayMnth
	*  @param value
	**/
   public void setFirstDayMnth(char[] value) throws CFException {
      vars.setFirstDayMnth(value);
   } 

     /**
	 * 	Update FirstDayMnth 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFirstDayMnth(char[] source, int sourceIndex) throws CFException {
      vars.setFirstDayMnth(source, sourceIndex);
   	
   }
   
   public void setFirstDayMnth(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setFirstDayMnth(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FirstDayMnth 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFirstDayMnth(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setFirstDayMnth(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FirstDayMnth with another Field
	 *	@param value
	 */
   public void setFirstDayMnth(Field source) {
      vars.setFirstDayMnth(source);
   }  
   
     /**
	 * 	Update FirstDayMnth 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFirstDayMnth(Field source, int sourceIndex,int sourceLen) {
      vars.setFirstDayMnth(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FirstDayMnth 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFirstDayMnth(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setFirstDayMnth(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lastDate
	 *	@return lastDate
	 */
   public char[] getLastDate() throws CFException  {              
   		return vars.getLastDate();
   }

  
	/**
	*  set variable lastDate
	*  @param value
	**/
   public void setLastDate(char[] value) throws CFException {
      vars.setLastDate(value);
   } 

     /**
	 * 	Update LastDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLastDate(char[] source, int sourceIndex) throws CFException {
      vars.setLastDate(source, sourceIndex);
   	
   }
   
   public void setLastDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setLastDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LastDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLastDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setLastDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LastDate with another Field
	 *	@param value
	 */
   public void setLastDate(Field source) {
      vars.setLastDate(source);
   }  
   
     /**
	 * 	Update LastDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLastDate(Field source, int sourceIndex,int sourceLen) {
      vars.setLastDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LastDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLastDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setLastDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vars
	 *	@return vars
	 */   
	 public Vars getVars() {
   	return vars;
   }


	/**
	 *	Returns the value of effEndDateCalc
	 *	@return effEndDateCalc
	 */
   public char[] getEffEndDateCalc() throws CFException  {              
   		return vars.getEffEndDateCalc();
   }

  
	/**
	*  set variable effEndDateCalc
	*  @param value
	**/
   public void setEffEndDateCalc(char[] value) throws CFException {
      vars.setEffEndDateCalc(value);
   } 

     /**
	 * 	Update EffEndDateCalc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffEndDateCalc(char[] source, int sourceIndex) throws CFException {
      vars.setEffEndDateCalc(source, sourceIndex);
   	
   }
   
   public void setEffEndDateCalc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setEffEndDateCalc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EffEndDateCalc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateCalc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setEffEndDateCalc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EffEndDateCalc with another Field
	 *	@param value
	 */
   public void setEffEndDateCalc(Field source) {
      vars.setEffEndDateCalc(source);
   }  
   
     /**
	 * 	Update EffEndDateCalc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffEndDateCalc(Field source, int sourceIndex,int sourceLen) {
      vars.setEffEndDateCalc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EffEndDateCalc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateCalc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setEffEndDateCalc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}



        public Db2set3Ctx getDb2set3Ctx() {
            return Db2set3Ctx.this;
        }

        public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += vars.hashCode();
       return str.hashCode();
    }

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Sqlca sqlca = Db2set3Ctx.this.getSqlca();
     Vars vars = Db2set3Ctx.this.getVars();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of vars
	 *	@return vars
	 */   
	 public Vars getVars() {
   	return vars;
   }


	/**
	 *	Returns the value of inputDate
	 *	@return inputDate
	 */
   public char[] getInputDate() throws CFException  {              
   		return vars.getInputDate();
   }

  
	/**
	*  set variable inputDate
	*  @param value
	**/
   public void setInputDate(char[] value) throws CFException {
      vars.setInputDate(value);
   } 

     /**
	 * 	Update InputDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputDate(char[] source, int sourceIndex) throws CFException {
      vars.setInputDate(source, sourceIndex);
   	
   }
   
   public void setInputDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setInputDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update InputDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setInputDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update InputDate with another Field
	 *	@param value
	 */
   public void setInputDate(Field source) {
      vars.setInputDate(source);
   }  
   
     /**
	 * 	Update InputDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputDate(Field source, int sourceIndex,int sourceLen) {
      vars.setInputDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update InputDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setInputDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of effEndDateBuild
	 *	@return effEndDateBuild
	 */
   public char[] getEffEndDateBuild() throws CFException  {              
   		return vars.getEffEndDateBuild();
   }

  
	/**
	*  set variable effEndDateBuild
	*  @param value
	**/
   public void setEffEndDateBuild(char[] value) throws CFException {
      vars.setEffEndDateBuild(value);
   } 

     /**
	 * 	Update EffEndDateBuild 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEffEndDateBuild(char[] source, int sourceIndex) throws CFException {
      vars.setEffEndDateBuild(source, sourceIndex);
   	
   }
   
   public void setEffEndDateBuild(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      vars.setEffEndDateBuild(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EffEndDateBuild 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateBuild(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setEffEndDateBuild(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EffEndDateBuild with another Field
	 *	@param value
	 */
   public void setEffEndDateBuild(Field source) {
      vars.setEffEndDateBuild(source);
   }  
   
     /**
	 * 	Update EffEndDateBuild 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEffEndDateBuild(Field source, int sourceIndex,int sourceLen) {
      vars.setEffEndDateBuild(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EffEndDateBuild 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEffEndDateBuild(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      vars.setEffEndDateBuild(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2set3Ctx getDb2set3Ctx() {
            return Db2set3Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += vars.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.vars = new Vars();
        cloneObj.vars.set(vars.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
}
