package com.cloudframe.app.db2hst1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.db2hst1.dto.Work;
import com.cloudframe.app.db2hst1.dto.Dcltemp06;
import com.cloudframe.app.db2hst1.dto.Sqlca;
import com.cloudframe.app.db2hst1.dto.Sqlwarn;


@Context
public class Db2hst1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Dcltemp06 dcltemp06;
    Sqlca sqlca;


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
    public Dcltemp06 getDcltemp06() {
        if (dcltemp06 == null) {
            dcltemp06 = new Dcltemp06();
        }

        return dcltemp06;
    }

    public void setDcltemp06(Dcltemp06 dcltemp06) {
        this.dcltemp06 = dcltemp06;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += dcltemp06.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Db2hst1Ctx clone() {
        Db2hst1Ctx cloneObj = new Db2hst1Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltemp06 = new Dcltemp06();
        cloneObj.dcltemp06.set(dcltemp06.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class SelectParaInCtx implements Cloneable {
     Work work = Db2hst1Ctx.this.getWork();
     Dcltemp06 dcltemp06 = Db2hst1Ctx.this.getDcltemp06();
     Sqlca sqlca = Db2hst1Ctx.this.getSqlca();

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of hvEmpThru
	 *	@return hvEmpThru
	 */
   public char[] getHvEmpThru() throws CFException  {              
   		return work.getHvEmpThru();
   }

  
	/**
	*  set variable hvEmpThru
	*  @param value
	**/
   public void setHvEmpThru(char[] value) throws CFException {
      work.setHvEmpThru(value);
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
	 *	Returns the value of dcltemp06
	 *	@return dcltemp06
	 */   
	 public Dcltemp06 getDcltemp06() {
   	return dcltemp06;
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
	 *	Returns the value of hvEmpSal
	 *	@return hvEmpSal
	 */
   public char[] getHvEmpSal() throws CFException  {              
   		return dcltemp06.getHvEmpSal();
   }

  
	/**
	*  set variable hvEmpSal
	*  @param value
	**/
   public void setHvEmpSal(char[] value) throws CFException {
      dcltemp06.setHvEmpSal(value);
   } 

     /**
	 * 	Update HvEmpSal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvEmpSal(char[] source, int sourceIndex) throws CFException {
      dcltemp06.setHvEmpSal(source, sourceIndex);
   	
   }
   
   public void setHvEmpSal(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltemp06.setHvEmpSal(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HvEmpSal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpSal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltemp06.setHvEmpSal(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HvEmpSal with another Field
	 *	@param value
	 */
   public void setHvEmpSal(Field source) {
      dcltemp06.setHvEmpSal(source);
   }  
   
     /**
	 * 	Update HvEmpSal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvEmpSal(Field source, int sourceIndex,int sourceLen) {
      dcltemp06.setHvEmpSal(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HvEmpSal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpSal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltemp06.setHvEmpSal(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


	/**
	 *	Returns the value of hvEmpFrom
	 *	@return hvEmpFrom
	 */
   public char[] getHvEmpFrom() throws CFException  {              
   		return work.getHvEmpFrom();
   }

  
	/**
	*  set variable hvEmpFrom
	*  @param value
	**/
   public void setHvEmpFrom(char[] value) throws CFException {
      work.setHvEmpFrom(value);
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Db2hst1Ctx getDb2hst1Ctx() {
            return Db2hst1Ctx.this;
        }

        public SelectParaOutCtx getSelectParaOutCtx() {
            return new SelectParaOutCtx();
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
        str += dcltemp06.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectParaInCtx clone() {
        SelectParaInCtx cloneObj = new SelectParaInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltemp06 = new Dcltemp06();
        cloneObj.dcltemp06.set(dcltemp06.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectParaInCtx getSelectParaInCtx() {
            return new SelectParaInCtx();
    }
     public class SelectParaOutCtx implements Cloneable {
     Work work = Db2hst1Ctx.this.getWork();
     Dcltemp06 dcltemp06 = Db2hst1Ctx.this.getDcltemp06();
     Sqlca sqlca = Db2hst1Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public short getSqlcode_Ws() throws CFException {
   		return work.getSqlcode_Ws();
	}

    /**
	 *	Returns the String value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public char[]  getSqlcode_WsActualString() {
		return work.getSqlcode_WsActualString();
	}

	/**
	 *	Returns String value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
	public char[]  getSqlcode_WsString() throws CFException {
	     return String.valueOf(work.getSqlcode_WsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sqlcode_WsIsNumeric()  throws CFException{
	    return work.sqlcode_WsIsNumeric();
	}

	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *	@param number
	 */
	public void setSqlcode_Ws(short number)  throws CFException{
		work.setSqlcode_Ws(number);
	}
	
	public void setSqlcode_Ws(int number)  throws CFException{
	    work.setSqlcode_Ws(number);
	}
	public void setSqlcode_Ws(long number)  throws CFException{
	    work.setSqlcode_Ws(number);
	}
	

	
	/**
	 * 	Update Sqlcode_Ws with the passed value
	 *	@param value (String or char[])
	 */
	public void setSqlcode_Ws(char[] value)  throws CFException {
		work.setSqlcode_Ws(value);
	}
	
	/**
	 * 	Update Sqlcode_Ws with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSqlcode_WsString(char[] value)  throws CFException{
		work.setSqlcode_Ws(value);
	}	

	/**
	 *	Returns the value of hvEmpNo
	 *	@return hvEmpNo
	 */
   public char[] getHvEmpNo() throws CFException  {              
   		return dcltemp06.getHvEmpNo();
   }

  
	/**
	*  set variable hvEmpNo
	*  @param value
	**/
   public void setHvEmpNo(char[] value) throws CFException {
      dcltemp06.setHvEmpNo(value);
   } 

     /**
	 * 	Update HvEmpNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvEmpNo(char[] source, int sourceIndex) throws CFException {
      dcltemp06.setHvEmpNo(source, sourceIndex);
   	
   }
   
   public void setHvEmpNo(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltemp06.setHvEmpNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HvEmpNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltemp06.setHvEmpNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HvEmpNo with another Field
	 *	@param value
	 */
   public void setHvEmpNo(Field source) {
      dcltemp06.setHvEmpNo(source);
   }  
   
     /**
	 * 	Update HvEmpNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvEmpNo(Field source, int sourceIndex,int sourceLen) {
      dcltemp06.setHvEmpNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HvEmpNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltemp06.setHvEmpNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltemp06
	 *	@return dcltemp06
	 */   
	 public Dcltemp06 getDcltemp06() {
   	return dcltemp06;
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
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Db2hst1Ctx getDb2hst1Ctx() {
            return Db2hst1Ctx.this;
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
        str += dcltemp06.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectParaOutCtx clone() {
        SelectParaOutCtx cloneObj = new SelectParaOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dcltemp06 = new Dcltemp06();
        cloneObj.dcltemp06.set(dcltemp06.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectParaOutCtx getSelectParaOutCtx() {
            return new SelectParaOutCtx();
    }
}
