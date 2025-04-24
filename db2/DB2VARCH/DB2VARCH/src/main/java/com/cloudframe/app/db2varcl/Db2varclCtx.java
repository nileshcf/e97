package com.cloudframe.app.db2varcl;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.db2varcl.dto.Nullvars;
import com.cloudframe.app.db2varcl.dto.BookReqArea;
import com.cloudframe.app.db2varcl.dto.BookWorkArea;
import com.cloudframe.app.db2varcl.dto.Sqlwarn;
import com.cloudframe.app.db2varcl.dto.BreqPublishedDate;
import com.cloudframe.app.db2varcl.dto.Work;
import com.cloudframe.app.db2varcl.dto.BreqTitleGrp;
import com.cloudframe.app.db2varcl.dto.Sqlca;


@Context
public class Db2varclCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Nullvars nullvars;
    BookWorkArea bookWorkArea;
    Sqlca sqlca;
    Work work;
    BookReqArea bookReqArea;


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


    public Nullvars getNullvars() {
        if (nullvars == null) {
            nullvars = new Nullvars();
        }

        return nullvars;
    }

    public void setNullvars(Nullvars nullvars) {
        this.nullvars = nullvars;
    }
    public BookWorkArea getBookWorkArea() {
        if (bookWorkArea == null) {
            bookWorkArea = new BookWorkArea();
        }

        return bookWorkArea;
    }

    public void setBookWorkArea(BookWorkArea bookWorkArea) {
        this.bookWorkArea = bookWorkArea;
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
    public BookReqArea getBookReqArea() {
        if (bookReqArea == null) {
            bookReqArea = new BookReqArea();
        }

        return bookReqArea;
    }

    public void setBookReqArea(BookReqArea bookReqArea) {
        this.bookReqArea = bookReqArea;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += nullvars.hashCode();
        str += bookWorkArea.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
        str += bookReqArea.hashCode();
       return str.hashCode();
    }

    public Db2varclCtx clone() {
        Db2varclCtx cloneObj = new Db2varclCtx();
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.bookWorkArea = new BookWorkArea();
        cloneObj.bookWorkArea.set(bookWorkArea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.bookReqArea = new BookReqArea();
        cloneObj.bookReqArea.set(bookReqArea.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     BookWorkArea bookWorkArea = Db2varclCtx.this.getBookWorkArea();
     Sqlca sqlca = Db2varclCtx.this.getSqlca();
     BookReqArea bookReqArea = Db2varclCtx.this.getBookReqArea();


        public Db2varclCtx getDb2varclCtx() {
            return Db2varclCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bookWorkArea.hashCode();
        str += sqlca.hashCode();
        str += bookReqArea.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.bookWorkArea = new BookWorkArea();
        cloneObj.bookWorkArea.set(bookWorkArea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bookReqArea = new BookReqArea();
        cloneObj.bookReqArea.set(bookReqArea.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainInCtx implements Cloneable {
     Nullvars nullvars = Db2varclCtx.this.getNullvars();
     Sqlca sqlca = Db2varclCtx.this.getSqlca();
     BookReqArea bookReqArea = Db2varclCtx.this.getBookReqArea();

	/**
	 *	Returns the value of breqIsbn
	 *	@return breqIsbn
	 */
	public int getBreqIsbn() throws CFException {        
   		return bookReqArea.getBreqIsbn();
	}
	
	/**
	 * 	Update BreqIsbn with the passed value
	 *	@param number
	 */
	public void setBreqIsbn(int number)  throws CFException{
		bookReqArea.setBreqIsbn(number);
	}


	public void setBreqIsbn(long number)  throws CFException{
		bookReqArea.setBreqIsbn((int)number);
	}


	/**
	 *	Returns the value of breqPublishedDateLen
	 *	@return breqPublishedDateLen
	 */
	public short getBreqPublishedDateLen() throws CFException {        
   		return bookReqArea.getBreqPublishedDate().getBreqPublishedDateLen();
	}
	
	/**
	 * 	Update BreqPublishedDateLen with the passed value
	 *	@param number
	 */
	public void setBreqPublishedDateLen(short number)  throws CFException{
		bookReqArea.getBreqPublishedDate().setBreqPublishedDateLen(number);
	}

	public void setBreqPublishedDateLen(int number)  throws CFException{
		bookReqArea.getBreqPublishedDate().setBreqPublishedDateLen((short)number);
	}

	public void setBreqPublishedDateLen(long number)  throws CFException{
		bookReqArea.getBreqPublishedDate().setBreqPublishedDateLen((short)number);
	}



	/**
	 *	Returns the value of breqTitleText
	 *	@return breqTitleText
	 */
   public char[] getBreqTitleText() throws CFException  {              
   		return bookReqArea.getBreqTitleGrp().getBreqTitleText();
   }

  
	/**
	*  set variable breqTitleText
	*  @param value
	**/
   public void setBreqTitleText(char[] value) throws CFException {
      bookReqArea.getBreqTitleGrp().setBreqTitleText(value);
   } 

     /**
	 * 	Update BreqTitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBreqTitleText(char[] source, int sourceIndex) throws CFException {
      bookReqArea.getBreqTitleGrp().setBreqTitleText(source, sourceIndex);
   	
   }
   
   public void setBreqTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bookReqArea.getBreqTitleGrp().setBreqTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BreqTitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bookReqArea.getBreqTitleGrp().setBreqTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BreqTitleText with another Field
	 *	@param value
	 */
   public void setBreqTitleText(Field source) {
      bookReqArea.getBreqTitleGrp().setBreqTitleText(source);
   }  
   
     /**
	 * 	Update BreqTitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBreqTitleText(Field source, int sourceIndex,int sourceLen) {
      bookReqArea.getBreqTitleGrp().setBreqTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BreqTitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bookReqArea.getBreqTitleGrp().setBreqTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
   }


	/**
	 *	Returns the value of breqBookId
	 *	@return breqBookId
	 */
	public int getBreqBookId() throws CFException {        
   		return bookReqArea.getBreqBookId();
	}
	
	/**
	 * 	Update BreqBookId with the passed value
	 *	@param number
	 */
	public void setBreqBookId(int number)  throws CFException{
		bookReqArea.setBreqBookId(number);
	}


	public void setBreqBookId(long number)  throws CFException{
		bookReqArea.setBreqBookId((int)number);
	}


	/**
	 *	Returns the value of breqTitleGrp
	 *	@return breqTitleGrp
	 */   
	 public BreqTitleGrp getBreqTitleGrp() {
   	return bookReqArea.getBreqTitleGrp();
   }

   /**
	* 	Update BreqTitleGrp with the passed value
	*	@param value
	*/
   public void setBreqTitleGrp(char[] value) throws CFException {
      bookReqArea.setBreqTitleGrp(value);
   }   

     /**
	 * 	Update BreqTitleGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBreqTitleGrp(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	bookReqArea.setBreqTitleGrp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BreqTitleGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bookReqArea.setBreqTitleGrp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BreqTitleGrp with another Field
	 *	@param value
	 */
   public void setBreqTitleGrp(Field source) {
   	bookReqArea.setBreqTitleGrp(source);
   }  
   
     /**
	 * 	Update BreqTitleGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBreqTitleGrp(Field source, int sourceIndex,int sourceLen) {
   	bookReqArea.setBreqTitleGrp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BreqTitleGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bookReqArea.setBreqTitleGrp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of breqPublishedDateText
	 *	@return breqPublishedDateText
	 */
   public char[] getBreqPublishedDateText() throws CFException  {              
   		return bookReqArea.getBreqPublishedDate().getBreqPublishedDateText();
   }

  
	/**
	*  set variable breqPublishedDateText
	*  @param value
	**/
   public void setBreqPublishedDateText(char[] value) throws CFException {
      bookReqArea.getBreqPublishedDate().setBreqPublishedDateText(value);
   } 

     /**
	 * 	Update BreqPublishedDateText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBreqPublishedDateText(char[] source, int sourceIndex) throws CFException {
      bookReqArea.getBreqPublishedDate().setBreqPublishedDateText(source, sourceIndex);
   	
   }
   
   public void setBreqPublishedDateText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bookReqArea.getBreqPublishedDate().setBreqPublishedDateText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BreqPublishedDateText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDateText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bookReqArea.getBreqPublishedDate().setBreqPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BreqPublishedDateText with another Field
	 *	@param value
	 */
   public void setBreqPublishedDateText(Field source) {
      bookReqArea.getBreqPublishedDate().setBreqPublishedDateText(source);
   }  
   
     /**
	 * 	Update BreqPublishedDateText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBreqPublishedDateText(Field source, int sourceIndex,int sourceLen) {
      bookReqArea.getBreqPublishedDate().setBreqPublishedDateText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BreqPublishedDateText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDateText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bookReqArea.getBreqPublishedDate().setBreqPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of breqRating
	 *	@return breqRating
	 */
	public int getBreqRating() throws CFException {        
   		return bookReqArea.getBreqRating();
	}
	
	/**
	 * 	Update BreqRating with the passed value
	 *	@param number
	 */
	public void setBreqRating(int number)  throws CFException{
		bookReqArea.setBreqRating(number);
	}


	public void setBreqRating(long number)  throws CFException{
		bookReqArea.setBreqRating((int)number);
	}


	/**
	 *	Returns the value of bookReqArea
	 *	@return bookReqArea
	 */   
	 public BookReqArea getBookReqArea() {
   	return bookReqArea;
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
	 *	Returns the value of breqTitleLen
	 *	@return breqTitleLen
	 */
	public short getBreqTitleLen() throws CFException {        
   		return bookReqArea.getBreqTitleGrp().getBreqTitleLen();
	}
	
	/**
	 * 	Update BreqTitleLen with the passed value
	 *	@param number
	 */
	public void setBreqTitleLen(short number)  throws CFException{
		bookReqArea.getBreqTitleGrp().setBreqTitleLen(number);
	}

	public void setBreqTitleLen(int number)  throws CFException{
		bookReqArea.getBreqTitleGrp().setBreqTitleLen((short)number);
	}

	public void setBreqTitleLen(long number)  throws CFException{
		bookReqArea.getBreqTitleGrp().setBreqTitleLen((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of breqTotalPages
	 *	@return breqTotalPages
	 */
	public int getBreqTotalPages() throws CFException {        
   		return bookReqArea.getBreqTotalPages();
	}
	
	/**
	 * 	Update BreqTotalPages with the passed value
	 *	@param number
	 */
	public void setBreqTotalPages(int number)  throws CFException{
		bookReqArea.setBreqTotalPages(number);
	}


	public void setBreqTotalPages(long number)  throws CFException{
		bookReqArea.setBreqTotalPages((int)number);
	}


	/**
	 *	Returns the value of breqPublishedDate
	 *	@return breqPublishedDate
	 */   
	 public BreqPublishedDate getBreqPublishedDate() {
   	return bookReqArea.getBreqPublishedDate();
   }

   /**
	* 	Update BreqPublishedDate with the passed value
	*	@param value
	*/
   public void setBreqPublishedDate(char[] value) throws CFException {
      bookReqArea.setBreqPublishedDate(value);
   }   

     /**
	 * 	Update BreqPublishedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBreqPublishedDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	bookReqArea.setBreqPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BreqPublishedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bookReqArea.setBreqPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BreqPublishedDate with another Field
	 *	@param value
	 */
   public void setBreqPublishedDate(Field source) {
   	bookReqArea.setBreqPublishedDate(source);
   }  
   
     /**
	 * 	Update BreqPublishedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBreqPublishedDate(Field source, int sourceIndex,int sourceLen) {
   	bookReqArea.setBreqPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BreqPublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bookReqArea.setBreqPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of breqPublisherId
	 *	@return breqPublisherId
	 */
	public int getBreqPublisherId() throws CFException {        
   		return bookReqArea.getBreqPublisherId();
	}
	
	/**
	 * 	Update BreqPublisherId with the passed value
	 *	@param number
	 */
	public void setBreqPublisherId(int number)  throws CFException{
		bookReqArea.setBreqPublisherId(number);
	}


	public void setBreqPublisherId(long number)  throws CFException{
		bookReqArea.setBreqPublisherId((int)number);
	}



        public Db2varclCtx getDb2varclCtx() {
            return Db2varclCtx.this;
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
        str += nullvars.hashCode();
        str += sqlca.hashCode();
        str += bookReqArea.hashCode();
       return str.hashCode();
    }

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bookReqArea = new BookReqArea();
        cloneObj.bookReqArea.set(bookReqArea.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class MainOutCtx implements Cloneable {
     Nullvars nullvars = Db2varclCtx.this.getNullvars();
     Sqlca sqlca = Db2varclCtx.this.getSqlca();
     BookReqArea bookReqArea = Db2varclCtx.this.getBookReqArea();

	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
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


	/**
	 *	Returns the value of rateNull
	 *	@return rateNull
	 */
	public short getRateNull() throws CFException {        
   		return nullvars.getRateNull();
	}
	
	/**
	 * 	Update RateNull with the passed value
	 *	@param number
	 */
	public void setRateNull(short number)  throws CFException{
		nullvars.setRateNull(number);
	}

	public void setRateNull(int number)  throws CFException{
		nullvars.setRateNull((short)number);
	}

	public void setRateNull(long number)  throws CFException{
		nullvars.setRateNull((short)number);
	}




        public Db2varclCtx getDb2varclCtx() {
            return Db2varclCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += nullvars.hashCode();
        str += sqlca.hashCode();
        str += bookReqArea.hashCode();
       return str.hashCode();
    }

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bookReqArea = new BookReqArea();
        cloneObj.bookReqArea.set(bookReqArea.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
     public class SqlErrChkInCtx implements Cloneable {
     BookWorkArea bookWorkArea = Db2varclCtx.this.getBookWorkArea();
     Sqlca sqlca = Db2varclCtx.this.getSqlca();
     Work work = Db2varclCtx.this.getWork();

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



        public Db2varclCtx getDb2varclCtx() {
            return Db2varclCtx.this;
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
        str += bookWorkArea.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SqlErrChkInCtx clone() {
        SqlErrChkInCtx cloneObj = new SqlErrChkInCtx();
        cloneObj.bookWorkArea = new BookWorkArea();
        cloneObj.bookWorkArea.set(bookWorkArea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SqlErrChkInCtx getSqlErrChkInCtx() {
            return new SqlErrChkInCtx();
    }
     public class SqlErrChkOutCtx implements Cloneable {
     BookWorkArea bookWorkArea = Db2varclCtx.this.getBookWorkArea();
     Sqlca sqlca = Db2varclCtx.this.getSqlca();
     Work work = Db2varclCtx.this.getWork();

	/**
	 *	Test condition 3 for isBookIoDuplicate()
	 *	@return  Returns true if isBookIoDuplicate() is 3
	 */
   public boolean isBookIoDuplicate() throws CFException {
      return bookWorkArea.isBookIoDuplicate();
   }

	/**
	*  set values 3
	*/
   	public void setBookIoDuplicateTrue()  throws CFException{  			
    	bookWorkArea.setBookIoDuplicateTrue();
   	}
	/**
	 *	Test condition 0 for isBookIoOk()
	 *	@return  Returns true if isBookIoOk() is 0
	 */
   public boolean isBookIoOk() throws CFException {
      return bookWorkArea.isBookIoOk();
   }

	/**
	*  set values 0
	*/
   	public void setBookIoOkTrue()  throws CFException{  			
    	bookWorkArea.setBookIoOkTrue();
   	}
	/**
	 *	Test condition 7 for isBookIoNotOk()
	 *	@return  Returns true if isBookIoNotOk() is 7
	 */
   public boolean isBookIoNotOk() throws CFException {
      return bookWorkArea.isBookIoNotOk();
   }

	/**
	*  set values 7
	*/
   	public void setBookIoNotOkTrue()  throws CFException{  			
    	bookWorkArea.setBookIoNotOkTrue();
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


        public Db2varclCtx getDb2varclCtx() {
            return Db2varclCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bookWorkArea.hashCode();
        str += sqlca.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SqlErrChkOutCtx clone() {
        SqlErrChkOutCtx cloneObj = new SqlErrChkOutCtx();
        cloneObj.bookWorkArea = new BookWorkArea();
        cloneObj.bookWorkArea.set(bookWorkArea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SqlErrChkOutCtx getSqlErrChkOutCtx() {
            return new SqlErrChkOutCtx();
    }
}
