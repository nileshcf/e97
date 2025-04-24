package com.cloudframe.app.dlcrntof;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.dlcrntof.dto.IsinEntry;
import com.cloudframe.app.dlcrntof.dto.Work;
import java.sql.ResultSet;
import com.cloudframe.app.dlcrntof.dto.IsinTableData;
import com.cloudframe.app.dlcrntof.dto.Sqlca;
import com.cloudframe.app.dlcrntof.dto.Sqlwarn;
import com.cloudframe.app.dlcrntof.dto.Dcltbdelsec;


@Context
public class DlcrntofCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Dcltbdelsec dcltbdelsec;
    Sqlca sqlca;
    Work work;
    IsinTableData isinTableData;

    int isinIdx;

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


    public Dcltbdelsec getDcltbdelsec() {
        if (dcltbdelsec == null) {
            dcltbdelsec = new Dcltbdelsec();
        }

        return dcltbdelsec;
    }

    public void setDcltbdelsec(Dcltbdelsec dcltbdelsec) {
        this.dcltbdelsec = dcltbdelsec;
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
    public IsinTableData getIsinTableData() {
        if (isinTableData == null) {
            isinTableData = new IsinTableData();
        }

        return isinTableData;
    }

    public void setIsinTableData(IsinTableData isinTableData) {
        this.isinTableData = isinTableData;
    }

    public int getIsinIdx() {
        return isinIdx;
    }

    public void setIsinIdx(int isinIdx) {
        this.isinIdx = isinIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbdelsec.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += isinTableData.hashCode();
       return str.hashCode();
    }

    public DlcrntofCtx clone() {
        DlcrntofCtx cloneObj = new DlcrntofCtx();
        cloneObj.dcltbdelsec = new Dcltbdelsec();
        cloneObj.dcltbdelsec.set(dcltbdelsec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.isinTableData = new IsinTableData();
        cloneObj.isinTableData.set(isinTableData.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineOutCtx implements Cloneable {
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();
     Work work = DlcrntofCtx.this.getWork();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of deleteCnt
	 *	@return deleteCnt
	 */
	public short getDeleteCnt() throws CFException {        
   		return work.getDeleteCnt();
	}
	
	/**
	 * 	Update DeleteCnt with the passed value
	 *	@param number
	 */
	public void setDeleteCnt(short number)  throws CFException{
		work.setDeleteCnt(number);
	}

	public void setDeleteCnt(int number)  throws CFException{
		work.setDeleteCnt((short)number);
	}

	public void setDeleteCnt(long number)  throws CFException{
		work.setDeleteCnt((short)number);
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



        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
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
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class InsertIntoTbdelsecInCtx implements Cloneable {
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();
     Work work = DlcrntofCtx.this.getWork();

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


        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
        }

        public InsertIntoTbdelsecOutCtx getInsertIntoTbdelsecOutCtx() {
            return new InsertIntoTbdelsecOutCtx();
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
       return str.hashCode();
    }

    public InsertIntoTbdelsecInCtx clone() {
        InsertIntoTbdelsecInCtx cloneObj = new InsertIntoTbdelsecInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertIntoTbdelsecInCtx getInsertIntoTbdelsecInCtx() {
            return new InsertIntoTbdelsecInCtx();
    }
     public class InsertIntoTbdelsecOutCtx implements Cloneable {
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();
     Work work = DlcrntofCtx.this.getWork();

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



        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
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
       return str.hashCode();
    }

    public InsertIntoTbdelsecOutCtx clone() {
        InsertIntoTbdelsecOutCtx cloneObj = new InsertIntoTbdelsecOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertIntoTbdelsecOutCtx getInsertIntoTbdelsecOutCtx() {
            return new InsertIntoTbdelsecOutCtx();
    }
     public class DeleteTbdelsecRowsInCtx implements Cloneable {
     Dcltbdelsec dcltbdelsec = DlcrntofCtx.this.getDcltbdelsec();
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();
     Work work = DlcrntofCtx.this.getWork();
     IsinTableData isinTableData = DlcrntofCtx.this.getIsinTableData();

	/**
	 *	Returns the value of dcltbdelsec
	 *	@return dcltbdelsec
	 */   
	 public Dcltbdelsec getDcltbdelsec() {
   	return dcltbdelsec;
   }


	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return dcltbdelsec.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      dcltbdelsec.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      dcltbdelsec.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdelsec.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      dcltbdelsec.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      dcltbdelsec.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of deleteCnt
	 *	@return deleteCnt
	 */
	public short getDeleteCnt() throws CFException {        
   		return work.getDeleteCnt();
	}
	
	/**
	 * 	Update DeleteCnt with the passed value
	 *	@param number
	 */
	public void setDeleteCnt(short number)  throws CFException{
		work.setDeleteCnt(number);
	}

	public void setDeleteCnt(int number)  throws CFException{
		work.setDeleteCnt((short)number);
	}

	public void setDeleteCnt(long number)  throws CFException{
		work.setDeleteCnt((short)number);
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

	/**
	 *	Returns the value of chkpFreq
	 *	@return chkpFreq
	 */
	public short getChkpFreq() throws CFException {        
   		return work.getChkpFreq();
	}
	
	/**
	 * 	Update ChkpFreq with the passed value
	 *	@param number
	 */
	public void setChkpFreq(short number)  throws CFException{
		work.setChkpFreq(number);
	}

	public void setChkpFreq(int number)  throws CFException{
		work.setChkpFreq((short)number);
	}

	public void setChkpFreq(long number)  throws CFException{
		work.setChkpFreq((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return dcltbdelsec.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      dcltbdelsec.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      dcltbdelsec.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdelsec.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      dcltbdelsec.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      dcltbdelsec.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return dcltbdelsec.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      dcltbdelsec.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      dcltbdelsec.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdelsec.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      dcltbdelsec.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      dcltbdelsec.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return dcltbdelsec.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      dcltbdelsec.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      dcltbdelsec.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdelsec.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      dcltbdelsec.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      dcltbdelsec.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return dcltbdelsec.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      dcltbdelsec.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      dcltbdelsec.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdelsec.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      dcltbdelsec.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      dcltbdelsec.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}



        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
        }

        public DeleteTbdelsecRowsOutCtx getDeleteTbdelsecRowsOutCtx() {
            return new DeleteTbdelsecRowsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbdelsec.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += isinTableData.hashCode();
       return str.hashCode();
    }

    public DeleteTbdelsecRowsInCtx clone() {
        DeleteTbdelsecRowsInCtx cloneObj = new DeleteTbdelsecRowsInCtx();
        cloneObj.dcltbdelsec = new Dcltbdelsec();
        cloneObj.dcltbdelsec.set(dcltbdelsec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.isinTableData = new IsinTableData();
        cloneObj.isinTableData.set(isinTableData.getClonedField());
        return cloneObj;
    }

    }

    public DeleteTbdelsecRowsInCtx getDeleteTbdelsecRowsInCtx() {
            return new DeleteTbdelsecRowsInCtx();
    }
     public class DeleteTbdelsecRowsOutCtx implements Cloneable {
     Dcltbdelsec dcltbdelsec = DlcrntofCtx.this.getDcltbdelsec();
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();
     Work work = DlcrntofCtx.this.getWork();
     IsinTableData isinTableData = DlcrntofCtx.this.getIsinTableData();

	/**
	 *	Returns the value of dcltbdelsec
	 *	@return dcltbdelsec
	 */   
	 public Dcltbdelsec getDcltbdelsec() {
   	return dcltbdelsec;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return dcltbdelsec.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      dcltbdelsec.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      dcltbdelsec.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdelsec.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      dcltbdelsec.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      dcltbdelsec.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdelsec.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of deleteCnt
	 *	@return deleteCnt
	 */
	public short getDeleteCnt() throws CFException {        
   		return work.getDeleteCnt();
	}
	
	/**
	 * 	Update DeleteCnt with the passed value
	 *	@param number
	 */
	public void setDeleteCnt(short number)  throws CFException{
		work.setDeleteCnt(number);
	}

	public void setDeleteCnt(int number)  throws CFException{
		work.setDeleteCnt((short)number);
	}

	public void setDeleteCnt(long number)  throws CFException{
		work.setDeleteCnt((short)number);
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
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of isinDeleted
	 *	@return isinDeleted
	 */
   public char[] getIsinDeleted(int index) throws CFException  {              
   		return isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().getIsinDeleted();
   }

  
	/**
	*  set variable isinDeleted
	*  @param value
	**/
   public void setIsinDeleted(int index,char[] value) throws CFException {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(value);
   } 

     /**
	 * 	Update IsinDeleted 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsinDeleted(int index,char[] source, int sourceIndex) throws CFException {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex);
   	
   }
   
   public void setIsinDeleted(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IsinDeleted 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsinDeleted(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IsinDeleted with another Field
	 *	@param value
	 */
   public void setIsinDeleted(int index,Field source) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source);
   }  
   
     /**
	 * 	Update IsinDeleted 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsinDeleted(int index,Field source, int sourceIndex,int sourceLen) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IsinDeleted 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsinDeleted(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dcltbdelsec.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += isinTableData.hashCode();
       return str.hashCode();
    }

    public DeleteTbdelsecRowsOutCtx clone() {
        DeleteTbdelsecRowsOutCtx cloneObj = new DeleteTbdelsecRowsOutCtx();
        cloneObj.dcltbdelsec = new Dcltbdelsec();
        cloneObj.dcltbdelsec.set(dcltbdelsec.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.isinTableData = new IsinTableData();
        cloneObj.isinTableData.set(isinTableData.getClonedField());
        return cloneObj;
    }

    }

    public DeleteTbdelsecRowsOutCtx getDeleteTbdelsecRowsOutCtx() {
            return new DeleteTbdelsecRowsOutCtx();
    }
     public class PrintDeletedIsinInCtx implements Cloneable {
     Work work = DlcrntofCtx.this.getWork();
     IsinTableData isinTableData = DlcrntofCtx.this.getIsinTableData();

	/**
	 *	Returns the value of isinEntry
	 *	@return isinEntry
	 */   
	 public IsinEntry getIsinEntry(int index) {
   	return isinTableData.getIsinTable().getIsinEntry(index);
   }

    public List<IsinEntry> getIsinEntry() {
        return isinTableData.getIsinTable().getIsinEntry();
    }
   /**
	* 	Update IsinEntry with the passed value
	*	@param value
	*/
   public void setIsinEntry(int index,char[] value) throws CFException {
      isinTableData.getIsinTable().setIsinEntry((index),value);
   }   



public void setIsinIdx(int isinIdx) { 
    DlcrntofCtx.this.isinIdx = isinIdx;
}

public int getIsinIdx() { 
    return DlcrntofCtx.this.isinIdx;
}
	/**
	 *	Returns the value of isinDeleted
	 *	@return isinDeleted
	 */
   public char[] getIsinDeleted(int index) throws CFException  {              
   		return isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().getIsinDeleted();
   }

  
	/**
	*  set variable isinDeleted
	*  @param value
	**/
   public void setIsinDeleted(int index,char[] value) throws CFException {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(value);
   } 

     /**
	 * 	Update IsinDeleted 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsinDeleted(int index,char[] source, int sourceIndex) throws CFException {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex);
   	
   }
   
   public void setIsinDeleted(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IsinDeleted 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsinDeleted(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IsinDeleted with another Field
	 *	@param value
	 */
   public void setIsinDeleted(int index,Field source) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source);
   }  
   
     /**
	 * 	Update IsinDeleted 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsinDeleted(int index,Field source, int sourceIndex,int sourceLen) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IsinDeleted 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsinDeleted(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      isinTableData.getIsinTable().getIsinEntry(index).getIsinTableData01().setIsinDeleted(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}



        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
        }

        public PrintDeletedIsinOutCtx getPrintDeletedIsinOutCtx() {
            return new PrintDeletedIsinOutCtx();
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
        str += isinTableData.hashCode();
       return str.hashCode();
    }

    public PrintDeletedIsinInCtx clone() {
        PrintDeletedIsinInCtx cloneObj = new PrintDeletedIsinInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.isinTableData = new IsinTableData();
        cloneObj.isinTableData.set(isinTableData.getClonedField());
        return cloneObj;
    }

    }

    public PrintDeletedIsinInCtx getPrintDeletedIsinInCtx() {
            return new PrintDeletedIsinInCtx();
    }
     public class PrintDeletedIsinOutCtx implements Cloneable {
     Work work = DlcrntofCtx.this.getWork();
     IsinTableData isinTableData = DlcrntofCtx.this.getIsinTableData();


public void setIsinIdx(int isinIdx) { 
    DlcrntofCtx.this.isinIdx = isinIdx;
}

public int getIsinIdx() { 
    return DlcrntofCtx.this.isinIdx;
}

        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
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
        str += isinTableData.hashCode();
       return str.hashCode();
    }

    public PrintDeletedIsinOutCtx clone() {
        PrintDeletedIsinOutCtx cloneObj = new PrintDeletedIsinOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.isinTableData = new IsinTableData();
        cloneObj.isinTableData.set(isinTableData.getClonedField());
        return cloneObj;
    }

    }

    public PrintDeletedIsinOutCtx getPrintDeletedIsinOutCtx() {
            return new PrintDeletedIsinOutCtx();
    }
     public class PrintTbdelsecRowcntInCtx implements Cloneable {
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();
     Work work = DlcrntofCtx.this.getWork();

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
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
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
	 *	Returns the value of secnt
	 *	@return secnt
	 */
	public short getSecnt() throws CFException {        
   		return work.getSecnt();
	}
	
	/**
	 * 	Update Secnt with the passed value
	 *	@param number
	 */
	public void setSecnt(short number)  throws CFException{
		work.setSecnt(number);
	}

	public void setSecnt(int number)  throws CFException{
		work.setSecnt((short)number);
	}

	public void setSecnt(long number)  throws CFException{
		work.setSecnt((short)number);
	}




        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
        }

        public PrintTbdelsecRowcntOutCtx getPrintTbdelsecRowcntOutCtx() {
            return new PrintTbdelsecRowcntOutCtx();
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
       return str.hashCode();
    }

    public PrintTbdelsecRowcntInCtx clone() {
        PrintTbdelsecRowcntInCtx cloneObj = new PrintTbdelsecRowcntInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrintTbdelsecRowcntInCtx getPrintTbdelsecRowcntInCtx() {
            return new PrintTbdelsecRowcntInCtx();
    }
     public class PrintTbdelsecRowcntOutCtx implements Cloneable {
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();
     Work work = DlcrntofCtx.this.getWork();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dispSecnt
	 *	@return dispSecnt
	 */
   public char[] getDispSecnt() throws CFException  {              
   		return work.getDispSecnt();
   }

  
	/**
	*  set variable dispSecnt
	*  @param value
	**/
   public void setDispSecnt(char[] value) throws CFException {
      work.setDispSecnt(value);
   } 

     /**
	 * 	Update DispSecnt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDispSecnt(char[] source, int sourceIndex) throws CFException {
      work.setDispSecnt(source, sourceIndex);
   	
   }
   
   public void setDispSecnt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDispSecnt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DispSecnt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDispSecnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDispSecnt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DispSecnt with another Field
	 *	@param value
	 */
   public void setDispSecnt(Field source) {
      work.setDispSecnt(source);
   }  
   
     /**
	 * 	Update DispSecnt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDispSecnt(Field source, int sourceIndex,int sourceLen) {
      work.setDispSecnt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DispSecnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDispSecnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDispSecnt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
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
	 *	Returns the value of secnt
	 *	@return secnt
	 */
	public short getSecnt() throws CFException {        
   		return work.getSecnt();
	}
	
	/**
	 * 	Update Secnt with the passed value
	 *	@param number
	 */
	public void setSecnt(short number)  throws CFException{
		work.setSecnt(number);
	}

	public void setSecnt(int number)  throws CFException{
		work.setSecnt((short)number);
	}

	public void setSecnt(long number)  throws CFException{
		work.setSecnt((short)number);
	}




        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
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
       return str.hashCode();
    }

    public PrintTbdelsecRowcntOutCtx clone() {
        PrintTbdelsecRowcntOutCtx cloneObj = new PrintTbdelsecRowcntOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrintTbdelsecRowcntOutCtx getPrintTbdelsecRowcntOutCtx() {
            return new PrintTbdelsecRowcntOutCtx();
    }
     public class RaiseErrorInCtx implements Cloneable {
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();

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


        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
        }

        public RaiseErrorOutCtx getRaiseErrorOutCtx() {
            return new RaiseErrorOutCtx();
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
       return str.hashCode();
    }

    public RaiseErrorInCtx clone() {
        RaiseErrorInCtx cloneObj = new RaiseErrorInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public RaiseErrorInCtx getRaiseErrorInCtx() {
            return new RaiseErrorInCtx();
    }
     public class RaiseErrorOutCtx implements Cloneable {
     Sqlca sqlca = DlcrntofCtx.this.getSqlca();

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



        public DlcrntofCtx getDlcrntofCtx() {
            return DlcrntofCtx.this;
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
       return str.hashCode();
    }

    public RaiseErrorOutCtx clone() {
        RaiseErrorOutCtx cloneObj = new RaiseErrorOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public RaiseErrorOutCtx getRaiseErrorOutCtx() {
            return new RaiseErrorOutCtx();
    }
}
