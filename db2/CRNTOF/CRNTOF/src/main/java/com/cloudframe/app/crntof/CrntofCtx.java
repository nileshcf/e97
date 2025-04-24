package com.cloudframe.app.crntof;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.crntof.dto.Sqlca;
import com.cloudframe.app.crntof.dto.Work;
import java.sql.ResultSet;
import com.cloudframe.app.crntof.dto.Sqlwarn;
import com.cloudframe.app.crntof.dto.CrntofTable;


@Context
public class CrntofCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Sqlca sqlca;
    Work work;
    CrntofTable crntofTable;


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


    ResultSet pmaCursorResultSet;

    public ResultSet getPmaCursorResultSet() {
        return this.pmaCursorResultSet;
    }

    public void setPmaCursorResultSet(ResultSet pmaCursorResultSet) {
        this.pmaCursorResultSet = pmaCursorResultSet;
    }
    ResultSet pmaCursor2ResultSet;

    public ResultSet getPmaCursor2ResultSet() {
        return this.pmaCursor2ResultSet;
    }

    public void setPmaCursor2ResultSet(ResultSet pmaCursor2ResultSet) {
        this.pmaCursor2ResultSet = pmaCursor2ResultSet;
    }
    ResultSet pmaCursor3ResultSet;

    public ResultSet getPmaCursor3ResultSet() {
        return this.pmaCursor3ResultSet;
    }

    public void setPmaCursor3ResultSet(ResultSet pmaCursor3ResultSet) {
        this.pmaCursor3ResultSet = pmaCursor3ResultSet;
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
    public CrntofTable getCrntofTable() {
        if (crntofTable == null) {
            crntofTable = new CrntofTable();
        }

        return crntofTable;
    }

    public void setCrntofTable(CrntofTable crntofTable) {
        this.crntofTable = crntofTable;
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
        str += crntofTable.hashCode();
       return str.hashCode();
    }

    public CrntofCtx clone() {
        CrntofCtx cloneObj = new CrntofCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.crntofTable = new CrntofTable();
        cloneObj.crntofTable.set(crntofTable.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ExecuteQueryInCtx implements Cloneable {
     Sqlca sqlca = CrntofCtx.this.getSqlca();
     Work work = CrntofCtx.this.getWork();
     CrntofTable crntofTable = CrntofCtx.this.getCrntofTable();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of crntofName01
	 *	@return crntofName01
	 */
   public char[] getCrntofName01() throws CFException  {              
   		return crntofTable.getCrntofName01();
   }

  
	/**
	*  set variable crntofName01
	*  @param value
	**/
   public void setCrntofName01(char[] value) throws CFException {
      crntofTable.setCrntofName01(value);
   } 

     /**
	 * 	Update CrntofName01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrntofName01(char[] source, int sourceIndex) throws CFException {
      crntofTable.setCrntofName01(source, sourceIndex);
   	
   }
   
   public void setCrntofName01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CrntofName01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrntofName01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CrntofName01 with another Field
	 *	@param value
	 */
   public void setCrntofName01(Field source) {
      crntofTable.setCrntofName01(source);
   }  
   
     /**
	 * 	Update CrntofName01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrntofName01(Field source, int sourceIndex,int sourceLen) {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CrntofName01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrntofName01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of crntofId
	 *	@return crntofId
	 */
   public char[] getCrntofId() throws CFException  {              
   		return crntofTable.getCrntofId();
   }

  
	/**
	*  set variable crntofId
	*  @param value
	**/
   public void setCrntofId(char[] value) throws CFException {
      crntofTable.setCrntofId(value);
   } 

     /**
	 * 	Update CrntofId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrntofId(char[] source, int sourceIndex) throws CFException {
      crntofTable.setCrntofId(source, sourceIndex);
   	
   }
   
   public void setCrntofId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CrntofId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrntofId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CrntofId with another Field
	 *	@param value
	 */
   public void setCrntofId(Field source) {
      crntofTable.setCrntofId(source);
   }  
   
     /**
	 * 	Update CrntofId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrntofId(Field source, int sourceIndex,int sourceLen) {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CrntofId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrntofId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of crntofTable
	 *	@return crntofTable
	 */   
	 public CrntofTable getCrntofTable() {
   	return crntofTable;
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


        public CrntofCtx getCrntofCtx() {
            return CrntofCtx.this;
        }

        public ExecuteQueryOutCtx getExecuteQueryOutCtx() {
            return new ExecuteQueryOutCtx();
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
        str += crntofTable.hashCode();
       return str.hashCode();
    }

    public ExecuteQueryInCtx clone() {
        ExecuteQueryInCtx cloneObj = new ExecuteQueryInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.crntofTable = new CrntofTable();
        cloneObj.crntofTable.set(crntofTable.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteQueryInCtx getExecuteQueryInCtx() {
            return new ExecuteQueryInCtx();
    }
     public class ExecuteQueryOutCtx implements Cloneable {
     Sqlca sqlca = CrntofCtx.this.getSqlca();
     Work work = CrntofCtx.this.getWork();
     CrntofTable crntofTable = CrntofCtx.this.getCrntofTable();

	/**
	 *	Returns the value of crntofName
	 *	@return crntofName
	 */
   public char[] getCrntofName() throws CFException  {              
   		return work.getCrntofName();
   }

  
	/**
	*  set variable crntofName
	*  @param value
	**/
   public void setCrntofName(char[] value) throws CFException {
      work.setCrntofName(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of crntofName01
	 *	@return crntofName01
	 */
   public char[] getCrntofName01() throws CFException  {              
   		return crntofTable.getCrntofName01();
   }

  
	/**
	*  set variable crntofName01
	*  @param value
	**/
   public void setCrntofName01(char[] value) throws CFException {
      crntofTable.setCrntofName01(value);
   } 

     /**
	 * 	Update CrntofName01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrntofName01(char[] source, int sourceIndex) throws CFException {
      crntofTable.setCrntofName01(source, sourceIndex);
   	
   }
   
   public void setCrntofName01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CrntofName01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrntofName01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CrntofName01 with another Field
	 *	@param value
	 */
   public void setCrntofName01(Field source) {
      crntofTable.setCrntofName01(source);
   }  
   
     /**
	 * 	Update CrntofName01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrntofName01(Field source, int sourceIndex,int sourceLen) {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CrntofName01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrntofName01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofName01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of crntofTable
	 *	@return crntofTable
	 */   
	 public CrntofTable getCrntofTable() {
   	return crntofTable;
   }


	/**
	 *	Returns the value of crntofNameN
	 *	@return crntofNameN
	 */
	public short getCrntofNameN() throws CFException {        
   		return crntofTable.getCrntofNameN();
	}
	
	/**
	 * 	Update CrntofNameN with the passed value
	 *	@param number
	 */
	public void setCrntofNameN(short number)  throws CFException{
		crntofTable.setCrntofNameN(number);
	}

	public void setCrntofNameN(int number)  throws CFException{
		crntofTable.setCrntofNameN((short)number);
	}

	public void setCrntofNameN(long number)  throws CFException{
		crntofTable.setCrntofNameN((short)number);
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



        public CrntofCtx getCrntofCtx() {
            return CrntofCtx.this;
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
        str += crntofTable.hashCode();
       return str.hashCode();
    }

    public ExecuteQueryOutCtx clone() {
        ExecuteQueryOutCtx cloneObj = new ExecuteQueryOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.crntofTable = new CrntofTable();
        cloneObj.crntofTable.set(crntofTable.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteQueryOutCtx getExecuteQueryOutCtx() {
            return new ExecuteQueryOutCtx();
    }
     public class FetchCursorInCtx implements Cloneable {
     Sqlca sqlca = CrntofCtx.this.getSqlca();
     CrntofTable crntofTable = CrntofCtx.this.getCrntofTable();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Returns the value of crntofId
	 *	@return crntofId
	 */
   public char[] getCrntofId() throws CFException  {              
   		return crntofTable.getCrntofId();
   }

  
	/**
	*  set variable crntofId
	*  @param value
	**/
   public void setCrntofId(char[] value) throws CFException {
      crntofTable.setCrntofId(value);
   } 

     /**
	 * 	Update CrntofId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrntofId(char[] source, int sourceIndex) throws CFException {
      crntofTable.setCrntofId(source, sourceIndex);
   	
   }
   
   public void setCrntofId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CrntofId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrntofId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CrntofId with another Field
	 *	@param value
	 */
   public void setCrntofId(Field source) {
      crntofTable.setCrntofId(source);
   }  
   
     /**
	 * 	Update CrntofId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrntofId(Field source, int sourceIndex,int sourceLen) {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CrntofId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrntofId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      crntofTable.setCrntofId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of crntofTable
	 *	@return crntofTable
	 */   
	 public CrntofTable getCrntofTable() {
   	return crntofTable;
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


        public CrntofCtx getCrntofCtx() {
            return CrntofCtx.this;
        }

        public FetchCursorOutCtx getFetchCursorOutCtx() {
            return new FetchCursorOutCtx();
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
        str += crntofTable.hashCode();
       return str.hashCode();
    }

    public FetchCursorInCtx clone() {
        FetchCursorInCtx cloneObj = new FetchCursorInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.crntofTable = new CrntofTable();
        cloneObj.crntofTable.set(crntofTable.getClonedField());
        return cloneObj;
    }

    }

    public FetchCursorInCtx getFetchCursorInCtx() {
            return new FetchCursorInCtx();
    }
     public class FetchCursorOutCtx implements Cloneable {
     Sqlca sqlca = CrntofCtx.this.getSqlca();
     CrntofTable crntofTable = CrntofCtx.this.getCrntofTable();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of crntofTable
	 *	@return crntofTable
	 */   
	 public CrntofTable getCrntofTable() {
   	return crntofTable;
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



        public CrntofCtx getCrntofCtx() {
            return CrntofCtx.this;
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
        str += crntofTable.hashCode();
       return str.hashCode();
    }

    public FetchCursorOutCtx clone() {
        FetchCursorOutCtx cloneObj = new FetchCursorOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.crntofTable = new CrntofTable();
        cloneObj.crntofTable.set(crntofTable.getClonedField());
        return cloneObj;
    }

    }

    public FetchCursorOutCtx getFetchCursorOutCtx() {
            return new FetchCursorOutCtx();
    }
}
