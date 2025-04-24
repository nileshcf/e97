package com.cloudframe.app.dbrowst2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.dbrowst2.dto.Work;
import java.sql.ResultSet;
import com.cloudframe.app.dbrowst2.dto.Sqlwarn;
import com.cloudframe.app.dbrowst2.dto.Sqlca;
import com.cloudframe.app.dbrowst2.dto.SecTable;


@Context
public class Dbrowst2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Sqlca sqlca;
    SecTable secTable;


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


    ResultSet secCursorResultSet;

    public ResultSet getSecCursorResultSet() {
        return this.secCursorResultSet;
    }

    public void setSecCursorResultSet(ResultSet secCursorResultSet) {
        this.secCursorResultSet = secCursorResultSet;
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
    public SecTable getSecTable() {
        if (secTable == null) {
            secTable = new SecTable();
        }

        return secTable;
    }

    public void setSecTable(SecTable secTable) {
        this.secTable = secTable;
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
        str += secTable.hashCode();
       return str.hashCode();
    }

    public Dbrowst2Ctx clone() {
        Dbrowst2Ctx cloneObj = new Dbrowst2Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.secTable = new SecTable();
        cloneObj.secTable.set(secTable.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InitializeOutCtx implements Cloneable {
     Work work = Dbrowst2Ctx.this.getWork();

	/**
	 *	Returns the value of maxRows
	 *	@return maxRows
	 */
	public int getMaxRows() throws CFException {        
   		return work.getMaxRows();
	}
	
	/**
	 * 	Update MaxRows with the passed value
	 *	@param number
	 */
	public void setMaxRows(int number)  throws CFException{
		work.setMaxRows(number);
	}


	public void setMaxRows(long number)  throws CFException{
		work.setMaxRows((int)number);
	}



        public Dbrowst2Ctx getDbrowst2Ctx() {
            return Dbrowst2Ctx.this;
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

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class FetchRowsInCtx implements Cloneable {
     Work work = Dbrowst2Ctx.this.getWork();
     Sqlca sqlca = Dbrowst2Ctx.this.getSqlca();
     SecTable secTable = Dbrowst2Ctx.this.getSecTable();

	/**
	 *	Returns the value of ix
	 *	@return ix
	 */
	public short getIx() throws CFException {        
   		return work.getIx();
	}
	
	/**
	 * 	Update Ix with the passed value
	 *	@param number
	 */
	public void setIx(short number)  throws CFException{
		work.setIx(number);
	}

	public void setIx(int number)  throws CFException{
		work.setIx((short)number);
	}

	public void setIx(long number)  throws CFException{
		work.setIx((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol(int index) throws CFException  {              
   		return secTable.getSedol(index);
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(int index,char[] value) throws CFException {
      secTable.setSedol((index),value);
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
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic(int index) throws CFException  {              
   		return secTable.getRic(index);
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(int index,char[] value) throws CFException {
      secTable.setRic((index),value);
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
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin(int index) throws CFException  {              
   		return secTable.getIsin(index);
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(int index,char[] value) throws CFException {
      secTable.setIsin((index),value);
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
	 *	Returns the value of maxRows
	 *	@return maxRows
	 */
	public int getMaxRows() throws CFException {        
   		return work.getMaxRows();
	}
	
	/**
	 * 	Update MaxRows with the passed value
	 *	@param number
	 */
	public void setMaxRows(int number)  throws CFException{
		work.setMaxRows(number);
	}


	public void setMaxRows(long number)  throws CFException{
		work.setMaxRows((int)number);
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
	 *	Returns the value of secTable
	 *	@return secTable
	 */   
	 public SecTable getSecTable() {
   	return secTable;
   }



        public Dbrowst2Ctx getDbrowst2Ctx() {
            return Dbrowst2Ctx.this;
        }

        public FetchRowsOutCtx getFetchRowsOutCtx() {
            return new FetchRowsOutCtx();
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
        str += secTable.hashCode();
       return str.hashCode();
    }

    public FetchRowsInCtx clone() {
        FetchRowsInCtx cloneObj = new FetchRowsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.secTable = new SecTable();
        cloneObj.secTable.set(secTable.getClonedField());
        return cloneObj;
    }

    }

    public FetchRowsInCtx getFetchRowsInCtx() {
            return new FetchRowsInCtx();
    }
     public class FetchRowsOutCtx implements Cloneable {
     Work work = Dbrowst2Ctx.this.getWork();
     Sqlca sqlca = Dbrowst2Ctx.this.getSqlca();
     SecTable secTable = Dbrowst2Ctx.this.getSecTable();

	/**
	 *	Returns the value of ix
	 *	@return ix
	 */
	public short getIx() throws CFException {        
   		return work.getIx();
	}
	
	/**
	 * 	Update Ix with the passed value
	 *	@param number
	 */
	public void setIx(short number)  throws CFException{
		work.setIx(number);
	}

	public void setIx(int number)  throws CFException{
		work.setIx((short)number);
	}

	public void setIx(long number)  throws CFException{
		work.setIx((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of dsnnrows
	 *	@return dsnnrows
	 */
	public int getDsnnrows() throws CFException {        
   		return work.getDsnnrows();
	}
	
	/**
	 * 	Update Dsnnrows with the passed value
	 *	@param number
	 */
	public void setDsnnrows(int number)  throws CFException{
		work.setDsnnrows(number);
	}


	public void setDsnnrows(long number)  throws CFException{
		work.setDsnnrows((int)number);
	}


	/**
	 *	Returns the value of secTable
	 *	@return secTable
	 */   
	 public SecTable getSecTable() {
   	return secTable;
   }



        public Dbrowst2Ctx getDbrowst2Ctx() {
            return Dbrowst2Ctx.this;
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
        str += secTable.hashCode();
       return str.hashCode();
    }

    public FetchRowsOutCtx clone() {
        FetchRowsOutCtx cloneObj = new FetchRowsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.secTable = new SecTable();
        cloneObj.secTable.set(secTable.getClonedField());
        return cloneObj;
    }

    }

    public FetchRowsOutCtx getFetchRowsOutCtx() {
            return new FetchRowsOutCtx();
    }
}
