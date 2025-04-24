package com.cloudframe.app.sqlcount;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sqlcount.dto.Sqlca;
import com.cloudframe.app.sqlcount.dto.Work;
import com.cloudframe.app.sqlcount.dto.Sqlwarn;


@Context
public class SqlcountCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SqlcountCtx clone() {
        SqlcountCtx cloneObj = new SqlcountCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class SelectInCtx implements Cloneable {
     Work work = SqlcountCtx.this.getWork();
     Sqlca sqlca = SqlcountCtx.this.getSqlca();

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

public long getCountComp314() throws CFException {  
        return work.getCountComp314();
}
	/**
	 * 	Update CountComp314 with the passed value
	 *	@param number
	 */
	public void setCountComp314(long number)  throws CFException{
		work.setCountComp314(number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


public long getCountComp311() throws CFException {  
        return work.getCountComp311();
}
	/**
	 * 	Update CountComp311 with the passed value
	 *	@param number
	 */
	public void setCountComp311(long number)  throws CFException{
		work.setCountComp311(number);
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

public short getCountComp34() throws CFException {  
        return work.getCountComp34();
}
	/**
	 * 	Update CountComp34 with the passed value
	 *	@param number
	 */
	public void setCountComp34(short number)  throws CFException{
		work.setCountComp34(number);
	}

	public void setCountComp34(int number)  throws CFException{
	   work.setCountComp34(number);
	}
	public void setCountComp34(long number)  throws CFException {
	    work.setCountComp34(number);
	}
	


	public BigDecimal getCountComp3104() throws CFException{      
   		return work.getCountComp3104();
	}

    public char[] getCountComp3104String() throws CFException {
          return  work.getCountComp3104().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CountComp3104 with the passed number
	 *	@param number
	 */
	public void setCountComp3104(BigDecimal number)  throws CFException{
		work.setCountComp3104(number);
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
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


public int getCountComp38() throws CFException {  
        return work.getCountComp38();
}
	/**
	 * 	Update CountComp38 with the passed value
	 *	@param number
	 */
	public void setCountComp38(int number)  throws CFException{
		work.setCountComp38(number);
	}


	public void setCountComp38(long number)  throws CFException{
	    work.setCountComp38(number);
	}
	

	/**
	 *	Returns the value of intCountComp
	 *	@return intCountComp
	 */
	public int getIntCountComp() throws CFException {        
   		return work.getIntCountComp();
	}
	
	/**
	 * 	Update IntCountComp with the passed value
	 *	@param number
	 */
	public void setIntCountComp(int number)  throws CFException{
		work.setIntCountComp(number);
	}


	public void setIntCountComp(long number)  throws CFException{
		work.setIntCountComp((int)number);
	}


	/**
	 *	Returns the value of shortCountComp
	 *	@return shortCountComp
	 */
	public short getShortCountComp() throws CFException {        
   		return work.getShortCountComp();
	}
	
	/**
	 * 	Update ShortCountComp with the passed value
	 *	@param number
	 */
	public void setShortCountComp(short number)  throws CFException{
		work.setShortCountComp(number);
	}

	public void setShortCountComp(int number)  throws CFException{
		work.setShortCountComp((short)number);
	}

	public void setShortCountComp(long number)  throws CFException{
		work.setShortCountComp((short)number);
	}



	/**
	 *	Returns the value of longCountComp
	 *	@return longCountComp
	 */
	public long getLongCountComp() throws CFException {        
   		return work.getLongCountComp();
	}
	
	/**
	 * 	Update LongCountComp with the passed value
	 *	@param number
	 */
	public void setLongCountComp(long number)  throws CFException{
		work.setLongCountComp(number);
	}




        public SqlcountCtx getSqlcountCtx() {
            return SqlcountCtx.this;
        }

        public SelectOutCtx getSelectOutCtx() {
            return new SelectOutCtx();
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectInCtx clone() {
        SelectInCtx cloneObj = new SelectInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectInCtx getSelectInCtx() {
            return new SelectInCtx();
    }
     public class SelectOutCtx implements Cloneable {
     Work work = SqlcountCtx.this.getWork();
     Sqlca sqlca = SqlcountCtx.this.getSqlca();

public long getCountComp314() throws CFException {  
        return work.getCountComp314();
}
	/**
	 * 	Update CountComp314 with the passed value
	 *	@param number
	 */
	public void setCountComp314(long number)  throws CFException{
		work.setCountComp314(number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


public long getCountComp311() throws CFException {  
        return work.getCountComp311();
}
	/**
	 * 	Update CountComp311 with the passed value
	 *	@param number
	 */
	public void setCountComp311(long number)  throws CFException{
		work.setCountComp311(number);
	}



public short getCountComp34() throws CFException {  
        return work.getCountComp34();
}
	/**
	 * 	Update CountComp34 with the passed value
	 *	@param number
	 */
	public void setCountComp34(short number)  throws CFException{
		work.setCountComp34(number);
	}

	public void setCountComp34(int number)  throws CFException{
	   work.setCountComp34(number);
	}
	public void setCountComp34(long number)  throws CFException {
	    work.setCountComp34(number);
	}
	


	public BigDecimal getCountComp3104() throws CFException{      
   		return work.getCountComp3104();
	}

    public char[] getCountComp3104String() throws CFException {
          return  work.getCountComp3104().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CountComp3104 with the passed number
	 *	@param number
	 */
	public void setCountComp3104(BigDecimal number)  throws CFException{
		work.setCountComp3104(number);
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
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


public int getCountComp38() throws CFException {  
        return work.getCountComp38();
}
	/**
	 * 	Update CountComp38 with the passed value
	 *	@param number
	 */
	public void setCountComp38(int number)  throws CFException{
		work.setCountComp38(number);
	}


	public void setCountComp38(long number)  throws CFException{
	    work.setCountComp38(number);
	}
	

	/**
	 *	Returns the value of intCountComp
	 *	@return intCountComp
	 */
	public int getIntCountComp() throws CFException {        
   		return work.getIntCountComp();
	}
	
	/**
	 * 	Update IntCountComp with the passed value
	 *	@param number
	 */
	public void setIntCountComp(int number)  throws CFException{
		work.setIntCountComp(number);
	}


	public void setIntCountComp(long number)  throws CFException{
		work.setIntCountComp((int)number);
	}


	/**
	 *	Returns the value of shortCountComp
	 *	@return shortCountComp
	 */
	public short getShortCountComp() throws CFException {        
   		return work.getShortCountComp();
	}
	
	/**
	 * 	Update ShortCountComp with the passed value
	 *	@param number
	 */
	public void setShortCountComp(short number)  throws CFException{
		work.setShortCountComp(number);
	}

	public void setShortCountComp(int number)  throws CFException{
		work.setShortCountComp((short)number);
	}

	public void setShortCountComp(long number)  throws CFException{
		work.setShortCountComp((short)number);
	}



	/**
	 *	Returns the value of sqlcode_Ws
	 *	@return sqlcode_Ws
	 */
   public char[] getSqlcode_Ws() throws CFException  {              
   		return work.getSqlcode_Ws();
   }

  
	/**
	*  set variable sqlcode_Ws
	*  @param value
	**/
   public void setSqlcode_Ws(char[] value) throws CFException {
      work.setSqlcode_Ws(value);
   } 

     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex) throws CFException {
      work.setSqlcode_Ws(source, sourceIndex);
   	
   }
   
   public void setSqlcode_Ws(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlcode_Ws with another Field
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source) {
      work.setSqlcode_Ws(source);
   }  
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlcode_Ws 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcode_Ws(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcode_Ws(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of longCountComp
	 *	@return longCountComp
	 */
	public long getLongCountComp() throws CFException {        
   		return work.getLongCountComp();
	}
	
	/**
	 * 	Update LongCountComp with the passed value
	 *	@param number
	 */
	public void setLongCountComp(long number)  throws CFException{
		work.setLongCountComp(number);
	}



	/**
	 *	Returns the value of countEdit2
	 *	@return countEdit2
	 */
   public char[] getCountEdit2() throws CFException  {              
   		return work.getCountEdit2();
   }

  
	/**
	*  set variable countEdit2
	*  @param value
	**/
   public void setCountEdit2(char[] value) throws CFException {
      work.setCountEdit2(value);
   } 

     /**
	 * 	Update CountEdit2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountEdit2(char[] source, int sourceIndex) throws CFException {
      work.setCountEdit2(source, sourceIndex);
   	
   }
   
   public void setCountEdit2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setCountEdit2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CountEdit2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCountEdit2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CountEdit2 with another Field
	 *	@param value
	 */
   public void setCountEdit2(Field source) {
      work.setCountEdit2(source);
   }  
   
     /**
	 * 	Update CountEdit2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountEdit2(Field source, int sourceIndex,int sourceLen) {
      work.setCountEdit2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CountEdit2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCountEdit2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of countEdit
	 *	@return countEdit
	 */
   public char[] getCountEdit() throws CFException  {              
   		return work.getCountEdit();
   }

  
	/**
	*  set variable countEdit
	*  @param value
	**/
   public void setCountEdit(char[] value) throws CFException {
      work.setCountEdit(value);
   } 

     /**
	 * 	Update CountEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountEdit(char[] source, int sourceIndex) throws CFException {
      work.setCountEdit(source, sourceIndex);
   	
   }
   
   public void setCountEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setCountEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CountEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCountEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CountEdit with another Field
	 *	@param value
	 */
   public void setCountEdit(Field source) {
      work.setCountEdit(source);
   }  
   
     /**
	 * 	Update CountEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountEdit(Field source, int sourceIndex,int sourceLen) {
      work.setCountEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CountEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setCountEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public SqlcountCtx getSqlcountCtx() {
            return SqlcountCtx.this;
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectOutCtx clone() {
        SelectOutCtx cloneObj = new SelectOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectOutCtx getSelectOutCtx() {
            return new SelectOutCtx();
    }
}
