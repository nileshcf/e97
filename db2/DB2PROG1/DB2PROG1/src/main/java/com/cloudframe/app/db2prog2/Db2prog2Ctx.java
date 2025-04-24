package com.cloudframe.app.db2prog2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.db2prog2.dto.Tbwidget;
import com.cloudframe.app.db2prog2.dto.BooksTitle;
import com.cloudframe.app.db2prog2.dto.Work;
import com.cloudframe.app.db2prog2.dto.Dclbooks;
import java.sql.ResultSet;
import com.cloudframe.app.db2prog2.dto.Sqlwarn;
import com.cloudframe.app.db2prog2.dto.Sqlca;


@Context
public class Db2prog2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Sqlca sqlca;
    Tbwidget tbwidget;
    Work work;
    Dclbooks dclbooks;


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


    ResultSet widgetResultSet;

    public ResultSet getWidgetResultSet() {
        return this.widgetResultSet;
    }

    public void setWidgetResultSet(ResultSet widgetResultSet) {
        this.widgetResultSet = widgetResultSet;
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
    public Tbwidget getTbwidget() {
        if (tbwidget == null) {
            tbwidget = new Tbwidget();
        }

        return tbwidget;
    }

    public void setTbwidget(Tbwidget tbwidget) {
        this.tbwidget = tbwidget;
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
    public Dclbooks getDclbooks() {
        if (dclbooks == null) {
            dclbooks = new Dclbooks();
        }

        return dclbooks;
    }

    public void setDclbooks(Dclbooks dclbooks) {
        this.dclbooks = dclbooks;
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
        str += tbwidget.hashCode();
        str += work.hashCode();
        str += dclbooks.hashCode();
       return str.hashCode();
    }

    public Db2prog2Ctx clone() {
        Db2prog2Ctx cloneObj = new Db2prog2Ctx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class Process1000InCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Dclbooks dclbooks = Db2prog2Ctx.this.getDclbooks();

	/**
	 *	Returns the value of booksTitle
	 *	@return booksTitle
	 */   
	 public BooksTitle getBooksTitle() {
   	return dclbooks.getBooksTitle();
   }

   /**
	* 	Update BooksTitle with the passed value
	*	@param value
	*/
   public void setBooksTitle(char[] value) throws CFException {
      dclbooks.setBooksTitle(value);
   }   

     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksTitle with another Field
	 *	@param value
	 */
   public void setBooksTitle(Field source) {
   	dclbooks.setBooksTitle(source);
   }  
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen) {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbooks.setBooksTitle(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of booksTitleText
	 *	@return booksTitleText
	 */
   public char[] getBooksTitleText() throws CFException  {              
   		return dclbooks.getBooksTitle().getBooksTitleText();
   }

  
	/**
	*  set variable booksTitleText
	*  @param value
	**/
   public void setBooksTitleText(char[] value) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(value);
   } 

     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex) throws CFException {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex);
   	
   }
   
   public void setBooksTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BooksTitleText with another Field
	 *	@param value
	 */
   public void setBooksTitleText(Field source) {
      dclbooks.getBooksTitle().setBooksTitleText(source);
   }  
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BooksTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbooks.getBooksTitle().setBooksTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of booksTitleLen
	 *	@return booksTitleLen
	 */
	public short getBooksTitleLen() throws CFException {        
   		return dclbooks.getBooksTitle().getBooksTitleLen();
	}
	
	/**
	 * 	Update BooksTitleLen with the passed value
	 *	@param number
	 */
	public void setBooksTitleLen(short number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen(number);
	}

	public void setBooksTitleLen(int number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}

	public void setBooksTitleLen(long number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
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
	 *	Returns the value of dclbooks
	 *	@return dclbooks
	 */   
	 public Dclbooks getDclbooks() {
   	return dclbooks;
   }



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
        }

        public Process1000OutCtx getProcess1000OutCtx() {
            return new Process1000OutCtx();
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
        str += dclbooks.hashCode();
       return str.hashCode();
    }

    public Process1000InCtx clone() {
        Process1000InCtx cloneObj = new Process1000InCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        return cloneObj;
    }

    }

    public Process1000InCtx getProcess1000InCtx() {
            return new Process1000InCtx();
    }
     public class Process1000OutCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Dclbooks dclbooks = Db2prog2Ctx.this.getDclbooks();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of booksBookId
	 *	@return booksBookId
	 */
	public int getBooksBookId() throws CFException {        
   		return dclbooks.getBooksBookId();
	}
	
	/**
	 * 	Update BooksBookId with the passed value
	 *	@param number
	 */
	public void setBooksBookId(int number)  throws CFException{
		dclbooks.setBooksBookId(number);
	}


	public void setBooksBookId(long number)  throws CFException{
		dclbooks.setBooksBookId((int)number);
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
	 *	Returns the value of booksTitleLen
	 *	@return booksTitleLen
	 */
	public short getBooksTitleLen() throws CFException {        
   		return dclbooks.getBooksTitle().getBooksTitleLen();
	}
	
	/**
	 * 	Update BooksTitleLen with the passed value
	 *	@param number
	 */
	public void setBooksTitleLen(short number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen(number);
	}

	public void setBooksTitleLen(int number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}

	public void setBooksTitleLen(long number)  throws CFException{
		dclbooks.getBooksTitle().setBooksTitleLen((short)number);
	}



	/**
	 *	Returns the value of dclbooks
	 *	@return dclbooks
	 */   
	 public Dclbooks getDclbooks() {
   	return dclbooks;
   }



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
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
        str += dclbooks.hashCode();
       return str.hashCode();
    }

    public Process1000OutCtx clone() {
        Process1000OutCtx cloneObj = new Process1000OutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclbooks = new Dclbooks();
        cloneObj.dclbooks.set(dclbooks.getClonedField());
        return cloneObj;
    }

    }

    public Process1000OutCtx getProcess1000OutCtx() {
            return new Process1000OutCtx();
    }
     public class InsertWidgetsInCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

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
	 *	Returns the value of tbwidget
	 *	@return tbwidget
	 */   
	 public Tbwidget getTbwidget() {
   	return tbwidget;
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



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
        }

        public InsertWidgetsOutCtx getInsertWidgetsOutCtx() {
            return new InsertWidgetsOutCtx();
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertWidgetsInCtx clone() {
        InsertWidgetsInCtx cloneObj = new InsertWidgetsInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertWidgetsInCtx getInsertWidgetsInCtx() {
            return new InsertWidgetsInCtx();
    }
     public class InsertWidgetsOutCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

	public BigDecimal getWidgetPrice() throws CFException{      
   		return tbwidget.getWidgetPrice();
	}

    public char[] getWidgetPriceString() throws CFException {
          return  tbwidget.getWidgetPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number)  throws CFException{
		tbwidget.setWidgetPrice(number);
   }

	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException  {              
   		return tbwidget.getWidgetDesc();
   }

  
	/**
	*  set variable widgetDesc
	*  @param value
	**/
   public void setWidgetDesc(char[] value) throws CFException {
      tbwidget.setWidgetDesc(value);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetDesc(source, sourceIndex);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
      tbwidget.setWidgetDesc(source);
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getWidgetManuCost() throws CFException{      
   		return tbwidget.getWidgetManuCost();
	}

    public char[] getWidgetManuCostString() throws CFException {
          return  tbwidget.getWidgetManuCost().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetManuCost with the passed number
	 *	@param number
	 */
	public void setWidgetManuCost(BigDecimal number)  throws CFException{
		tbwidget.setWidgetManuCost(number);
   }

	/**
	 *	Returns the value of widgetSupplier
	 *	@return widgetSupplier
	 */
   public char[] getWidgetSupplier() throws CFException  {              
   		return tbwidget.getWidgetSupplier();
   }

  
	/**
	*  set variable widgetSupplier
	*  @param value
	**/
   public void setWidgetSupplier(char[] value) throws CFException {
      tbwidget.setWidgetSupplier(value);
   } 

     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSupplier(source, sourceIndex);
   	
   }
   
   public void setWidgetSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSupplier with another Field
	 *	@param value
	 */
   public void setWidgetSupplier(Field source) {
      tbwidget.setWidgetSupplier(source);
   }  
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbwidget.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbwidget.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbwidget.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetManuPlant
	 *	@return widgetManuPlant
	 */
   public char[] getWidgetManuPlant() throws CFException  {              
   		return tbwidget.getWidgetManuPlant();
   }

  
	/**
	*  set variable widgetManuPlant
	*  @param value
	**/
   public void setWidgetManuPlant(char[] value) throws CFException {
      tbwidget.setWidgetManuPlant(value);
   } 

     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetManuPlant(source, sourceIndex);
   	
   }
   
   public void setWidgetManuPlant(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetManuPlant with another Field
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source) {
      tbwidget.setWidgetManuPlant(source);
   }  
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbwidget.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbwidget.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbwidget.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetSize
	 *	@return widgetSize
	 */
   public char[] getWidgetSize() throws CFException  {              
   		return tbwidget.getWidgetSize();
   }

  
	/**
	*  set variable widgetSize
	*  @param value
	**/
   public void setWidgetSize(char[] value) throws CFException {
      tbwidget.setWidgetSize(value);
   } 

     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSize(source, sourceIndex);
   	
   }
   
   public void setWidgetSize(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSize with another Field
	 *	@param value
	 */
   public void setWidgetSize(Field source) {
      tbwidget.setWidgetSize(source);
   }  
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetLeadTime
	 *	@return widgetLeadTime
	 */
	public short getWidgetLeadTime() throws CFException {        
   		return tbwidget.getWidgetLeadTime();
	}
	
	/**
	 * 	Update WidgetLeadTime with the passed value
	 *	@param number
	 */
	public void setWidgetLeadTime(short number)  throws CFException{
		tbwidget.setWidgetLeadTime(number);
	}

	public void setWidgetLeadTime(int number)  throws CFException{
		tbwidget.setWidgetLeadTime((short)number);
	}

	public void setWidgetLeadTime(long number)  throws CFException{
		tbwidget.setWidgetLeadTime((short)number);
	}




        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertWidgetsOutCtx clone() {
        InsertWidgetsOutCtx cloneObj = new InsertWidgetsOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertWidgetsOutCtx getInsertWidgetsOutCtx() {
            return new InsertWidgetsOutCtx();
    }
     public class UpdateWidgetsInCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

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
	 *	Returns the value of tbwidget
	 *	@return tbwidget
	 */   
	 public Tbwidget getTbwidget() {
   	return tbwidget;
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



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
        }

        public UpdateWidgetsOutCtx getUpdateWidgetsOutCtx() {
            return new UpdateWidgetsOutCtx();
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public UpdateWidgetsInCtx clone() {
        UpdateWidgetsInCtx cloneObj = new UpdateWidgetsInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public UpdateWidgetsInCtx getUpdateWidgetsInCtx() {
            return new UpdateWidgetsInCtx();
    }
     public class UpdateWidgetsOutCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

	public BigDecimal getWidgetPrice() throws CFException{      
   		return tbwidget.getWidgetPrice();
	}

    public char[] getWidgetPriceString() throws CFException {
          return  tbwidget.getWidgetPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number)  throws CFException{
		tbwidget.setWidgetPrice(number);
   }

	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException  {              
   		return tbwidget.getWidgetDesc();
   }

  
	/**
	*  set variable widgetDesc
	*  @param value
	**/
   public void setWidgetDesc(char[] value) throws CFException {
      tbwidget.setWidgetDesc(value);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetDesc(source, sourceIndex);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
      tbwidget.setWidgetDesc(source);
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetSupplier
	 *	@return widgetSupplier
	 */
   public char[] getWidgetSupplier() throws CFException  {              
   		return tbwidget.getWidgetSupplier();
   }

  
	/**
	*  set variable widgetSupplier
	*  @param value
	**/
   public void setWidgetSupplier(char[] value) throws CFException {
      tbwidget.setWidgetSupplier(value);
   } 

     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSupplier(source, sourceIndex);
   	
   }
   
   public void setWidgetSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSupplier with another Field
	 *	@param value
	 */
   public void setWidgetSupplier(Field source) {
      tbwidget.setWidgetSupplier(source);
   }  
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbwidget.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbwidget.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbwidget.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbwidget.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbwidget.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbwidget.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetSize
	 *	@return widgetSize
	 */
   public char[] getWidgetSize() throws CFException  {              
   		return tbwidget.getWidgetSize();
   }

  
	/**
	*  set variable widgetSize
	*  @param value
	**/
   public void setWidgetSize(char[] value) throws CFException {
      tbwidget.setWidgetSize(value);
   } 

     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSize(source, sourceIndex);
   	
   }
   
   public void setWidgetSize(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSize with another Field
	 *	@param value
	 */
   public void setWidgetSize(Field source) {
      tbwidget.setWidgetSize(source);
   }  
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public UpdateWidgetsOutCtx clone() {
        UpdateWidgetsOutCtx cloneObj = new UpdateWidgetsOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public UpdateWidgetsOutCtx getUpdateWidgetsOutCtx() {
            return new UpdateWidgetsOutCtx();
    }
     public class PrintWidgetsInCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

	public BigDecimal getWidgetPrice() throws CFException{      
   		return tbwidget.getWidgetPrice();
	}

    public char[] getWidgetPriceString() throws CFException {
          return  tbwidget.getWidgetPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number)  throws CFException{
		tbwidget.setWidgetPrice(number);
   }

	public BigDecimal getWidgetManuCost() throws CFException{      
   		return tbwidget.getWidgetManuCost();
	}

    public char[] getWidgetManuCostString() throws CFException {
          return  tbwidget.getWidgetManuCost().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetManuCost with the passed number
	 *	@param number
	 */
	public void setWidgetManuCost(BigDecimal number)  throws CFException{
		tbwidget.setWidgetManuCost(number);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbwidget.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbwidget.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbwidget.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetManuPlant
	 *	@return widgetManuPlant
	 */
   public char[] getWidgetManuPlant() throws CFException  {              
   		return tbwidget.getWidgetManuPlant();
   }

  
	/**
	*  set variable widgetManuPlant
	*  @param value
	**/
   public void setWidgetManuPlant(char[] value) throws CFException {
      tbwidget.setWidgetManuPlant(value);
   } 

     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetManuPlant(source, sourceIndex);
   	
   }
   
   public void setWidgetManuPlant(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetManuPlant with another Field
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source) {
      tbwidget.setWidgetManuPlant(source);
   }  
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbwidget.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbwidget.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbwidget.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetSize
	 *	@return widgetSize
	 */
   public char[] getWidgetSize() throws CFException  {              
   		return tbwidget.getWidgetSize();
   }

  
	/**
	*  set variable widgetSize
	*  @param value
	**/
   public void setWidgetSize(char[] value) throws CFException {
      tbwidget.setWidgetSize(value);
   } 

     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSize(source, sourceIndex);
   	
   }
   
   public void setWidgetSize(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSize with another Field
	 *	@param value
	 */
   public void setWidgetSize(Field source) {
      tbwidget.setWidgetSize(source);
   }  
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException  {              
   		return tbwidget.getWidgetDesc();
   }

  
	/**
	*  set variable widgetDesc
	*  @param value
	**/
   public void setWidgetDesc(char[] value) throws CFException {
      tbwidget.setWidgetDesc(value);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetDesc(source, sourceIndex);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
      tbwidget.setWidgetDesc(source);
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tbwidget
	 *	@return tbwidget
	 */   
	 public Tbwidget getTbwidget() {
   	return tbwidget;
   }


	/**
	 *	Returns the value of widgetSupplier
	 *	@return widgetSupplier
	 */
   public char[] getWidgetSupplier() throws CFException  {              
   		return tbwidget.getWidgetSupplier();
   }

  
	/**
	*  set variable widgetSupplier
	*  @param value
	**/
   public void setWidgetSupplier(char[] value) throws CFException {
      tbwidget.setWidgetSupplier(value);
   } 

     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSupplier(source, sourceIndex);
   	
   }
   
   public void setWidgetSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSupplier with another Field
	 *	@param value
	 */
   public void setWidgetSupplier(Field source) {
      tbwidget.setWidgetSupplier(source);
   }  
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of widgetLeadTime
	 *	@return widgetLeadTime
	 */
	public short getWidgetLeadTime() throws CFException {        
   		return tbwidget.getWidgetLeadTime();
	}
	
	/**
	 * 	Update WidgetLeadTime with the passed value
	 *	@param number
	 */
	public void setWidgetLeadTime(short number)  throws CFException{
		tbwidget.setWidgetLeadTime(number);
	}

	public void setWidgetLeadTime(int number)  throws CFException{
		tbwidget.setWidgetLeadTime((short)number);
	}

	public void setWidgetLeadTime(long number)  throws CFException{
		tbwidget.setWidgetLeadTime((short)number);
	}




        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
        }

        public PrintWidgetsOutCtx getPrintWidgetsOutCtx() {
            return new PrintWidgetsOutCtx();
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrintWidgetsInCtx clone() {
        PrintWidgetsInCtx cloneObj = new PrintWidgetsInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrintWidgetsInCtx getPrintWidgetsInCtx() {
            return new PrintWidgetsInCtx();
    }
     public class PrintWidgetsOutCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tbwidget
	 *	@return tbwidget
	 */   
	 public Tbwidget getTbwidget() {
   	return tbwidget;
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



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrintWidgetsOutCtx clone() {
        PrintWidgetsOutCtx cloneObj = new PrintWidgetsOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrintWidgetsOutCtx getPrintWidgetsOutCtx() {
            return new PrintWidgetsOutCtx();
    }
     public class DeleteWidgetsInCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

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
	 *	Returns the value of tbwidget
	 *	@return tbwidget
	 */   
	 public Tbwidget getTbwidget() {
   	return tbwidget;
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



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
        }

        public DeleteWidgetsOutCtx getDeleteWidgetsOutCtx() {
            return new DeleteWidgetsOutCtx();
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DeleteWidgetsInCtx clone() {
        DeleteWidgetsInCtx cloneObj = new DeleteWidgetsInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DeleteWidgetsInCtx getDeleteWidgetsInCtx() {
            return new DeleteWidgetsInCtx();
    }
     public class DeleteWidgetsOutCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbwidget.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbwidget.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbwidget.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DeleteWidgetsOutCtx clone() {
        DeleteWidgetsOutCtx cloneObj = new DeleteWidgetsOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DeleteWidgetsOutCtx getDeleteWidgetsOutCtx() {
            return new DeleteWidgetsOutCtx();
    }
     public class SelectWidgetInCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

	public BigDecimal getWidgetPrice() throws CFException{      
   		return tbwidget.getWidgetPrice();
	}

    public char[] getWidgetPriceString() throws CFException {
          return  tbwidget.getWidgetPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number)  throws CFException{
		tbwidget.setWidgetPrice(number);
   }

	public BigDecimal getWidgetManuCost() throws CFException{      
   		return tbwidget.getWidgetManuCost();
	}

    public char[] getWidgetManuCostString() throws CFException {
          return  tbwidget.getWidgetManuCost().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WidgetManuCost with the passed number
	 *	@param number
	 */
	public void setWidgetManuCost(BigDecimal number)  throws CFException{
		tbwidget.setWidgetManuCost(number);
   }

	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException  {              
   		return tbwidget.getWidgetColor();
   }

  
	/**
	*  set variable widgetColor
	*  @param value
	**/
   public void setWidgetColor(char[] value) throws CFException {
      tbwidget.setWidgetColor(value);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetColor(source, sourceIndex);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
      tbwidget.setWidgetColor(source);
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetColor(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetManuPlant
	 *	@return widgetManuPlant
	 */
   public char[] getWidgetManuPlant() throws CFException  {              
   		return tbwidget.getWidgetManuPlant();
   }

  
	/**
	*  set variable widgetManuPlant
	*  @param value
	**/
   public void setWidgetManuPlant(char[] value) throws CFException {
      tbwidget.setWidgetManuPlant(value);
   } 

     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetManuPlant(source, sourceIndex);
   	
   }
   
   public void setWidgetManuPlant(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetManuPlant with another Field
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source) {
      tbwidget.setWidgetManuPlant(source);
   }  
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetManuPlant 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetManuPlant(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetManuPlant(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetSize
	 *	@return widgetSize
	 */
   public char[] getWidgetSize() throws CFException  {              
   		return tbwidget.getWidgetSize();
   }

  
	/**
	*  set variable widgetSize
	*  @param value
	**/
   public void setWidgetSize(char[] value) throws CFException {
      tbwidget.setWidgetSize(value);
   } 

     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSize(source, sourceIndex);
   	
   }
   
   public void setWidgetSize(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSize with another Field
	 *	@param value
	 */
   public void setWidgetSize(Field source) {
      tbwidget.setWidgetSize(source);
   }  
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSize 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSize(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSize(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException  {              
   		return tbwidget.getWidgetDesc();
   }

  
	/**
	*  set variable widgetDesc
	*  @param value
	**/
   public void setWidgetDesc(char[] value) throws CFException {
      tbwidget.setWidgetDesc(value);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetDesc(source, sourceIndex);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
      tbwidget.setWidgetDesc(source);
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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
	 *	Returns the value of tbwidget
	 *	@return tbwidget
	 */   
	 public Tbwidget getTbwidget() {
   	return tbwidget;
   }


	/**
	 *	Returns the value of widgetSupplier
	 *	@return widgetSupplier
	 */
   public char[] getWidgetSupplier() throws CFException  {              
   		return tbwidget.getWidgetSupplier();
   }

  
	/**
	*  set variable widgetSupplier
	*  @param value
	**/
   public void setWidgetSupplier(char[] value) throws CFException {
      tbwidget.setWidgetSupplier(value);
   } 

     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetSupplier(source, sourceIndex);
   	
   }
   
   public void setWidgetSupplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetSupplier with another Field
	 *	@param value
	 */
   public void setWidgetSupplier(Field source) {
      tbwidget.setWidgetSupplier(source);
   }  
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetSupplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetSupplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetSupplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of widgetLeadTime
	 *	@return widgetLeadTime
	 */
	public short getWidgetLeadTime() throws CFException {        
   		return tbwidget.getWidgetLeadTime();
	}
	
	/**
	 * 	Update WidgetLeadTime with the passed value
	 *	@param number
	 */
	public void setWidgetLeadTime(short number)  throws CFException{
		tbwidget.setWidgetLeadTime(number);
	}

	public void setWidgetLeadTime(int number)  throws CFException{
		tbwidget.setWidgetLeadTime((short)number);
	}

	public void setWidgetLeadTime(long number)  throws CFException{
		tbwidget.setWidgetLeadTime((short)number);
	}




        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
        }

        public SelectWidgetOutCtx getSelectWidgetOutCtx() {
            return new SelectWidgetOutCtx();
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SelectWidgetInCtx clone() {
        SelectWidgetInCtx cloneObj = new SelectWidgetInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SelectWidgetInCtx getSelectWidgetInCtx() {
            return new SelectWidgetInCtx();
    }
     public class SelectWidgetOutCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Tbwidget tbwidget = Db2prog2Ctx.this.getTbwidget();
     Work work = Db2prog2Ctx.this.getWork();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tbwidget
	 *	@return tbwidget
	 */   
	 public Tbwidget getTbwidget() {
   	return tbwidget;
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
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException  {              
   		return tbwidget.getWidgetNum();
   }

  
	/**
	*  set variable widgetNum
	*  @param value
	**/
   public void setWidgetNum(char[] value) throws CFException {
      tbwidget.setWidgetNum(value);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) throws CFException {
      tbwidget.setWidgetNum(source, sourceIndex);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
      tbwidget.setWidgetNum(source);
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tbwidget.setWidgetNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
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
        str += tbwidget.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SelectWidgetOutCtx clone() {
        SelectWidgetOutCtx cloneObj = new SelectWidgetOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tbwidget = new Tbwidget();
        cloneObj.tbwidget.set(tbwidget.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SelectWidgetOutCtx getSelectWidgetOutCtx() {
            return new SelectWidgetOutCtx();
    }
     public class CheckSqlcodeInCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Work work = Db2prog2Ctx.this.getWork();

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



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
        }

        public CheckSqlcodeOutCtx getCheckSqlcodeOutCtx() {
            return new CheckSqlcodeOutCtx();
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

    public CheckSqlcodeInCtx clone() {
        CheckSqlcodeInCtx cloneObj = new CheckSqlcodeInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckSqlcodeInCtx getCheckSqlcodeInCtx() {
            return new CheckSqlcodeInCtx();
    }
     public class CheckSqlcodeOutCtx implements Cloneable {
     Sqlca sqlca = Db2prog2Ctx.this.getSqlca();
     Work work = Db2prog2Ctx.this.getWork();

	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Db2prog2Ctx getDb2prog2Ctx() {
            return Db2prog2Ctx.this;
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

    public CheckSqlcodeOutCtx clone() {
        CheckSqlcodeOutCtx cloneObj = new CheckSqlcodeOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CheckSqlcodeOutCtx getCheckSqlcodeOutCtx() {
            return new CheckSqlcodeOutCtx();
    }
}
