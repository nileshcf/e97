package org.optum.uhg.dto.cfwidget;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

 
 
import java.sql.ResultSet;
 
 


@Context
public class CfwidgetCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Tbxmlwgt tbxmlwgt;
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


    ResultSet widgetcurResultSet;

    public ResultSet getWidgetcurResultSet() {
        return this.widgetcurResultSet;
    }

    public void setWidgetcurResultSet(ResultSet widgetcurResultSet) {
        this.widgetcurResultSet = widgetcurResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public Tbxmlwgt getTbxmlwgt() {
        if (tbxmlwgt == null) {
            tbxmlwgt = new Tbxmlwgt();
        }

        return tbxmlwgt;
    }

    public void setTbxmlwgt(Tbxmlwgt tbxmlwgt) {
        this.tbxmlwgt = tbxmlwgt;
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
        str += tbxmlwgt.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CfwidgetCtx clone() {
        CfwidgetCtx cloneObj = new CfwidgetCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
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
     public class MainInCtx implements Cloneable {
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Returns the value of loSupplier
	 *	@return loSupplier
	 */
   public char[] getLoSupplier() throws CFException  {              
   		return work.getLoSupplier();
   }

  
	/**
	*  set variable loSupplier
	*  @param value
	**/
   public void setLoSupplier(char[] value) throws CFException {
      work.setLoSupplier(value);
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


	/**
	 *	Returns the value of hiSupplier
	 *	@return hiSupplier
	 */
   public char[] getHiSupplier() throws CFException  {              
   		return work.getHiSupplier();
   }

  
	/**
	*  set variable hiSupplier
	*  @param value
	**/
   public void setHiSupplier(char[] value) throws CFException {
      work.setHiSupplier(value);
   } 

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
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


	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return work.isEndOfFile();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue()  throws CFException{  			
    	work.setEndOfFileTrue();
   	}

        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
        }

        public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
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

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class MainOutCtx implements Cloneable {
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Test condition 1 for isDontWriteRec88()
	 *	@return  Returns true if isDontWriteRec88() is 1
	 */
   public boolean isDontWriteRec88() throws CFException {
      return work.isDontWriteRec88();
   }

	/**
	*  set values 1
	*/
   	public void setDontWriteRec88True()  throws CFException{  			
    	work.setDontWriteRec88True();
   	}
	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 

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



        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
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

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
     public class InitializeInCtx implements Cloneable {
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Returns the value of timestamp
	 *	@return timestamp
	 */
   public char[] getTimestamp() throws CFException  {              
   		return work.getTimestamp();
   }

  
	/**
	*  set variable timestamp
	*  @param value
	**/
   public void setTimestamp(char[] value) throws CFException {
      work.setTimestamp(value);
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


        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
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
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Returns the value of dateR
	 *	@return dateR
	 */
   public char[] getDateR() throws CFException  {              
   		return work.getDateR();
   }

  
	/**
	*  set variable dateR
	*  @param value
	**/
   public void setDateR(char[] value) throws CFException {
      work.setDateR(value);
   } 

	/**
	 *	Returns the value of timestamp
	 *	@return timestamp
	 */
   public char[] getTimestamp() throws CFException  {              
   		return work.getTimestamp();
   }

  
	/**
	*  set variable timestamp
	*  @param value
	**/
   public void setTimestamp(char[] value) throws CFException {
      work.setTimestamp(value);
   } 

	/**
	 *	Returns the value of loSupplier
	 *	@return loSupplier
	 */
   public char[] getLoSupplier() throws CFException  {              
   		return work.getLoSupplier();
   }

  
	/**
	*  set variable loSupplier
	*  @param value
	**/
   public void setLoSupplier(char[] value) throws CFException {
      work.setLoSupplier(value);
   } 

	/**
	 *	Returns the value of timeR
	 *	@return timeR
	 */
   public char[] getTimeR() throws CFException  {              
   		return work.getTimeR();
   }

  
	/**
	*  set variable timeR
	*  @param value
	**/
   public void setTimeR(char[] value) throws CFException {
      work.setTimeR(value);
   } 

	/**
	 *	Returns the value of hiSupplier
	 *	@return hiSupplier
	 */
   public char[] getHiSupplier() throws CFException  {              
   		return work.getHiSupplier();
   }

  
	/**
	*  set variable hiSupplier
	*  @param value
	**/
   public void setHiSupplier(char[] value) throws CFException {
      work.setHiSupplier(value);
   } 

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
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



        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
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

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class FetchCursorInCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = CfwidgetCtx.this.getTbxmlwgt();
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Returns the value of tbxmlwgt
	 *	@return tbxmlwgt
	 */   
	 public Tbxmlwgt getTbxmlwgt() {
   	return tbxmlwgt;
   }


	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbxmlwgt.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbxmlwgt.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbxmlwgt.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbxmlwgt.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbxmlwgt.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbxmlwgt.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
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
        str += tbxmlwgt.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public FetchCursorInCtx clone() {
        FetchCursorInCtx cloneObj = new FetchCursorInCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public FetchCursorInCtx getFetchCursorInCtx() {
            return new FetchCursorInCtx();
    }
     public class FetchCursorOutCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = CfwidgetCtx.this.getTbxmlwgt();
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Returns the value of tbxmlwgt
	 *	@return tbxmlwgt
	 */   
	 public Tbxmlwgt getTbxmlwgt() {
   	return tbxmlwgt;
   }


	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
   } 

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



        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tbxmlwgt.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public FetchCursorOutCtx clone() {
        FetchCursorOutCtx cloneObj = new FetchCursorOutCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public FetchCursorOutCtx getFetchCursorOutCtx() {
            return new FetchCursorOutCtx();
    }
     public class SqlmainInCtx implements Cloneable {
     Tbxmlwgt tbxmlwgt = CfwidgetCtx.this.getTbxmlwgt();

	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbxmlwgt.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbxmlwgt.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbxmlwgt.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbxmlwgt.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbxmlwgt.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbxmlwgt.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbxmlwgt.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbxmlwgt.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tbxmlwgt.hashCode();
       return str.hashCode();
    }

    public SqlmainInCtx clone() {
        SqlmainInCtx cloneObj = new SqlmainInCtx();
        cloneObj.tbxmlwgt = new Tbxmlwgt();
        cloneObj.tbxmlwgt.set(tbxmlwgt.getClonedField());
        return cloneObj;
    }

    }

    public SqlmainInCtx getSqlmainInCtx() {
            return new SqlmainInCtx();
    }
     public class HousekeepingOutCtx implements Cloneable {
     Work work = CfwidgetCtx.this.getWork();

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 


        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
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

    public HousekeepingOutCtx clone() {
        HousekeepingOutCtx cloneObj = new HousekeepingOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public HousekeepingOutCtx getHousekeepingOutCtx() {
            return new HousekeepingOutCtx();
    }
     public class SqlErrChkInCtx implements Cloneable {
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Returns the value of errLoc
	 *	@return errLoc
	 */
   public char[] getErrLoc() throws CFException  {              
   		return work.getErrLoc();
   }

  
	/**
	*  set variable errLoc
	*  @param value
	**/
   public void setErrLoc(char[] value) throws CFException {
      work.setErrLoc(value);
   } 

	/**
	 *	Returns the value of errPgm
	 *	@return errPgm
	 */
   public char[] getErrPgm() throws CFException  {              
   		return work.getErrPgm();
   }

  
	/**
	*  set variable errPgm
	*  @param value
	**/
   public void setErrPgm(char[] value) throws CFException {
      work.setErrPgm(value);
   } 

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of errMsg
	 *	@return errMsg
	 */
   public char[] getErrMsg() throws CFException  {              
   		return work.getErrMsg();
   }

  
	/**
	*  set variable errMsg
	*  @param value
	**/
   public void setErrMsg(char[] value) throws CFException {
      work.setErrMsg(value);
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



        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
        }

        public SqlErrChkOutCtx getSqlErrChkOutCtx() {
            return new SqlErrChkOutCtx();
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

    public SqlErrChkInCtx clone() {
        SqlErrChkInCtx cloneObj = new SqlErrChkInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SqlErrChkInCtx getSqlErrChkInCtx() {
            return new SqlErrChkInCtx();
    }
     public class SqlErrChkOutCtx implements Cloneable {
     Work work = CfwidgetCtx.this.getWork();
     Sqlca sqlca = CfwidgetCtx.this.getSqlca();

	/**
	 *	Returns the value of errCode
	 *	@return errCode
	 */
	public long getErrCode() throws CFException {
   		return work.getErrCode();
	}


	/**
	 *	Returns String value of errCode
	 *	@return errCode
	 */
	public char[]  getErrCodeString() throws CFException {
	     return String.valueOf(work.getErrCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errCodeIsNumeric()  throws CFException{
	    return work.errCodeIsNumeric();
	}

	/**
	 * 	Update ErrCode with the passed value
	 *	@param number
	 */
	public void setErrCode(long number)  throws CFException{
		work.setErrCode(number);
	}
	

	
	/**
	 * 	Update ErrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrCode(char[] value)  throws CFException {
		work.setErrCode(value);
	}
	
	/**
	 * 	Update ErrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrCodeString(char[] value)  throws CFException{
		work.setErrCode(value);
	}	

	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
   public char[] getEofFlag() throws CFException  {              
   		return work.getEofFlag();
   }

  
	/**
	*  set variable eofFlag
	*  @param value
	**/
   public void setEofFlag(char[] value) throws CFException {
      work.setEofFlag(value);
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



        public CfwidgetCtx getCfwidgetCtx() {
            return CfwidgetCtx.this;
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

    public SqlErrChkOutCtx clone() {
        SqlErrChkOutCtx cloneObj = new SqlErrChkOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SqlErrChkOutCtx getSqlErrChkOutCtx() {
            return new SqlErrChkOutCtx();
    }
}
