package com.cloudframe.app.db2varch;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.db2varch.dto.Sqlca;
import com.cloudframe.app.db2varch.dto.Dclbook;
import com.cloudframe.app.db2varch.dto.Work;
import com.cloudframe.app.db2varch.dto.Sqlwarn;
import com.cloudframe.app.db2varch.dto.Nullvars;
import com.cloudframe.app.db2varch.dto.BookWorkArea;
import com.cloudframe.app.db2varch.dto.Ibook;
import com.cloudframe.app.db2varch.dto.TitleGrp;
import com.cloudframe.app.db2varch.dto.BookReqArea;
import com.cloudframe.app.db2varch.dto.PublishedDate;


@Context
public class Db2varchCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Dclbook dclbook;
    BookReqArea bookReqArea;
    Sqlca sqlca;
    Nullvars nullvars;
    BookWorkArea bookWorkArea;
    Ibook ibook;


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
    public Dclbook getDclbook() {
        if (dclbook == null) {
            dclbook = new Dclbook();
        }

        return dclbook;
    }

    public void setDclbook(Dclbook dclbook) {
        this.dclbook = dclbook;
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
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
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
    public Ibook getIbook() {
        if (ibook == null) {
            ibook = new Ibook();
        }

        return ibook;
    }

    public void setIbook(Ibook ibook) {
        this.ibook = ibook;
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
        str += dclbook.hashCode();
        str += bookReqArea.hashCode();
        str += sqlca.hashCode();
        str += nullvars.hashCode();
        str += bookWorkArea.hashCode();
        str += ibook.hashCode();
       return str.hashCode();
    }

    public Db2varchCtx clone() {
        Db2varchCtx cloneObj = new Db2varchCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclbook = new Dclbook();
        cloneObj.dclbook.set(dclbook.getClonedField());
        cloneObj.bookReqArea = new BookReqArea();
        cloneObj.bookReqArea.set(bookReqArea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.bookWorkArea = new BookWorkArea();
        cloneObj.bookWorkArea.set(bookWorkArea.getClonedField());
        cloneObj.ibook = new Ibook();
        cloneObj.ibook.set(ibook.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainInCtx implements Cloneable {
     Work work = Db2varchCtx.this.getWork();
     Dclbook dclbook = Db2varchCtx.this.getDclbook();
     BookReqArea bookReqArea = Db2varchCtx.this.getBookReqArea();
     Sqlca sqlca = Db2varchCtx.this.getSqlca();
     Nullvars nullvars = Db2varchCtx.this.getNullvars();
     BookWorkArea bookWorkArea = Db2varchCtx.this.getBookWorkArea();
     Ibook ibook = Db2varchCtx.this.getIbook();

	/**
	 *	Returns the value of dclbook
	 *	@return dclbook
	 */   
	 public Dclbook getDclbook() {
   	return dclbook;
   }


	/**
	 *	Returns the value of publishedDate
	 *	@return publishedDate
	 */   
	 public PublishedDate getPublishedDate() {
   	return dclbook.getPublishedDate();
   }

   /**
	* 	Update PublishedDate with the passed value
	*	@param value
	*/
   public void setPublishedDate(char[] value) throws CFException {
      dclbook.setPublishedDate(value);
   }   

     /**
	 * 	Update PublishedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPublishedDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PublishedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PublishedDate with another Field
	 *	@param value
	 */
   public void setPublishedDate(Field source) {
   	dclbook.setPublishedDate(source);
   }  
   
     /**
	 * 	Update PublishedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPublishedDate(Field source, int sourceIndex,int sourceLen) {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of bookWorkArea
	 *	@return bookWorkArea
	 */   
	 public BookWorkArea getBookWorkArea() {
   	return bookWorkArea;
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
	 *	Returns the value of publishedDateLen
	 *	@return publishedDateLen
	 */
	public short getPublishedDateLen() throws CFException {        
   		return dclbook.getPublishedDate().getPublishedDateLen();
	}
	
	/**
	 * 	Update PublishedDateLen with the passed value
	 *	@param number
	 */
	public void setPublishedDateLen(short number)  throws CFException{
		dclbook.getPublishedDate().setPublishedDateLen(number);
	}

	public void setPublishedDateLen(int number)  throws CFException{
		dclbook.getPublishedDate().setPublishedDateLen((short)number);
	}

	public void setPublishedDateLen(long number)  throws CFException{
		dclbook.getPublishedDate().setPublishedDateLen((short)number);
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
	 *	Returns the value of bookReqArea
	 *	@return bookReqArea
	 */   
	 public BookReqArea getBookReqArea() {
   	return bookReqArea;
   }


	/**
	 *	Returns the value of db2varcl01
	 *	@return db2varcl01
	 */
   public char[] getDb2varcl01() throws CFException  {              
   		return work.getDb2varcl01();
   }

  
	/**
	*  set variable db2varcl01
	*  @param value
	**/
   public void setDb2varcl01(char[] value) throws CFException {
      work.setDb2varcl01(value);
   } 

	/**
	 *	Returns the value of publishedDateText
	 *	@return publishedDateText
	 */
   public char[] getPublishedDateText() throws CFException  {              
   		return dclbook.getPublishedDate().getPublishedDateText();
   }

  
	/**
	*  set variable publishedDateText
	*  @param value
	**/
   public void setPublishedDateText(char[] value) throws CFException {
      dclbook.getPublishedDate().setPublishedDateText(value);
   } 

     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex) throws CFException {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex);
   	
   }
   
   public void setPublishedDateText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PublishedDateText with another Field
	 *	@param value
	 */
   public void setPublishedDateText(Field source) {
      dclbook.getPublishedDate().setPublishedDateText(source);
   }  
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
   }



        public Db2varchCtx getDb2varchCtx() {
            return Db2varchCtx.this;
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
        str += dclbook.hashCode();
        str += bookReqArea.hashCode();
        str += sqlca.hashCode();
        str += nullvars.hashCode();
        str += bookWorkArea.hashCode();
        str += ibook.hashCode();
       return str.hashCode();
    }

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclbook = new Dclbook();
        cloneObj.dclbook.set(dclbook.getClonedField());
        cloneObj.bookReqArea = new BookReqArea();
        cloneObj.bookReqArea.set(bookReqArea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.bookWorkArea = new BookWorkArea();
        cloneObj.bookWorkArea.set(bookWorkArea.getClonedField());
        cloneObj.ibook = new Ibook();
        cloneObj.ibook.set(ibook.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class MainOutCtx implements Cloneable {
     Work work = Db2varchCtx.this.getWork();
     Dclbook dclbook = Db2varchCtx.this.getDclbook();
     BookReqArea bookReqArea = Db2varchCtx.this.getBookReqArea();
     Sqlca sqlca = Db2varchCtx.this.getSqlca();
     Nullvars nullvars = Db2varchCtx.this.getNullvars();
     BookWorkArea bookWorkArea = Db2varchCtx.this.getBookWorkArea();
     Ibook ibook = Db2varchCtx.this.getIbook();

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
	 *	Returns the value of dclbook
	 *	@return dclbook
	 */   
	 public Dclbook getDclbook() {
   	return dclbook;
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
	 *	Returns the value of dateNull
	 *	@return dateNull
	 */
	public short getDateNull() throws CFException {        
   		return nullvars.getDateNull();
	}
	
	/**
	 * 	Update DateNull with the passed value
	 *	@param number
	 */
	public void setDateNull(short number)  throws CFException{
		nullvars.setDateNull(number);
	}

	public void setDateNull(int number)  throws CFException{
		nullvars.setDateNull((short)number);
	}

	public void setDateNull(long number)  throws CFException{
		nullvars.setDateNull((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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


	/**
	 *	Returns the value of bookWorkArea
	 *	@return bookWorkArea
	 */   
	 public BookWorkArea getBookWorkArea() {
   	return bookWorkArea;
   }


	/**
	 *	Returns the value of bookId
	 *	@return bookId
	 */
	public int getBookId() throws CFException {        
   		return dclbook.getBookId();
	}
	
	/**
	 * 	Update BookId with the passed value
	 *	@param number
	 */
	public void setBookId(int number)  throws CFException{
		dclbook.setBookId(number);
	}


	public void setBookId(long number)  throws CFException{
		dclbook.setBookId((int)number);
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
	 *	Returns the value of bookReqArea
	 *	@return bookReqArea
	 */   
	 public BookReqArea getBookReqArea() {
   	return bookReqArea;
   }


	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
   }


	/**
	 *	Returns the value of ibook
	 *	@return ibook
	 */   
	 public Ibook getIbook() {
   	return ibook;
   }



        public Db2varchCtx getDb2varchCtx() {
            return Db2varchCtx.this;
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
        str += dclbook.hashCode();
        str += bookReqArea.hashCode();
        str += sqlca.hashCode();
        str += nullvars.hashCode();
        str += bookWorkArea.hashCode();
        str += ibook.hashCode();
       return str.hashCode();
    }

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclbook = new Dclbook();
        cloneObj.dclbook.set(dclbook.getClonedField());
        cloneObj.bookReqArea = new BookReqArea();
        cloneObj.bookReqArea.set(bookReqArea.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.bookWorkArea = new BookWorkArea();
        cloneObj.bookWorkArea.set(bookWorkArea.getClonedField());
        cloneObj.ibook = new Ibook();
        cloneObj.ibook.set(ibook.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
     public class SelectBookInCtx implements Cloneable {
     Work work = Db2varchCtx.this.getWork();
     Dclbook dclbook = Db2varchCtx.this.getDclbook();
     Sqlca sqlca = Db2varchCtx.this.getSqlca();
     Nullvars nullvars = Db2varchCtx.this.getNullvars();
     Ibook ibook = Db2varchCtx.this.getIbook();

	/**
	 *	Returns the value of rating
	 *	@return rating
	 */
	public int getRating() throws CFException {        
   		return dclbook.getRating();
	}
	
	/**
	 * 	Update Rating with the passed value
	 *	@param number
	 */
	public void setRating(int number)  throws CFException{
		dclbook.setRating(number);
	}


	public void setRating(long number)  throws CFException{
		dclbook.setRating((int)number);
	}


	/**
	 *	Returns the value of dclbook
	 *	@return dclbook
	 */   
	 public Dclbook getDclbook() {
   	return dclbook;
   }


	/**
	 *	Returns the value of publishedDate
	 *	@return publishedDate
	 */   
	 public PublishedDate getPublishedDate() {
   	return dclbook.getPublishedDate();
   }

   /**
	* 	Update PublishedDate with the passed value
	*	@param value
	*/
   public void setPublishedDate(char[] value) throws CFException {
      dclbook.setPublishedDate(value);
   }   

     /**
	 * 	Update PublishedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPublishedDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PublishedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PublishedDate with another Field
	 *	@param value
	 */
   public void setPublishedDate(Field source) {
   	dclbook.setPublishedDate(source);
   }  
   
     /**
	 * 	Update PublishedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPublishedDate(Field source, int sourceIndex,int sourceLen) {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbook.setPublishedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtPublishedDateLen
	 *	@return prtPublishedDateLen
	 */
	public int getPrtPublishedDateLen() throws CFException {
   		return work.getPrtPublishedDateLen();
	}


	/**
	 *	Returns String value of prtPublishedDateLen
	 *	@return prtPublishedDateLen
	 */
	public char[]  getPrtPublishedDateLenString() throws CFException {
	     return String.valueOf(work.getPrtPublishedDateLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prtPublishedDateLenIsNumeric()  throws CFException{
	    return work.prtPublishedDateLenIsNumeric();
	}

	/**
	 * 	Update PrtPublishedDateLen with the passed value
	 *	@param number
	 */
	public void setPrtPublishedDateLen(int number)  throws CFException{
		work.setPrtPublishedDateLen(number);
	}
	

	public void setPrtPublishedDateLen(long number)  throws CFException{
	    work.setPrtPublishedDateLen(number);
	}
	
	
	/**
	 * 	Update PrtPublishedDateLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrtPublishedDateLen(char[] value)  throws CFException {
		work.setPrtPublishedDateLen(value);
	}
	
	/**
	 * 	Update PrtPublishedDateLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrtPublishedDateLenString(char[] value)  throws CFException{
		work.setPrtPublishedDateLen(value);
	}	

	/**
	 *	Returns the value of dateNull
	 *	@return dateNull
	 */
	public short getDateNull() throws CFException {        
   		return nullvars.getDateNull();
	}
	
	/**
	 * 	Update DateNull with the passed value
	 *	@param number
	 */
	public void setDateNull(short number)  throws CFException{
		nullvars.setDateNull(number);
	}

	public void setDateNull(int number)  throws CFException{
		nullvars.setDateNull((short)number);
	}

	public void setDateNull(long number)  throws CFException{
		nullvars.setDateNull((short)number);
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
	 *	Returns the value of bookId
	 *	@return bookId
	 */
	public int getBookId() throws CFException {        
   		return dclbook.getBookId();
	}
	
	/**
	 * 	Update BookId with the passed value
	 *	@param number
	 */
	public void setBookId(int number)  throws CFException{
		dclbook.setBookId(number);
	}


	public void setBookId(long number)  throws CFException{
		dclbook.setBookId((int)number);
	}


	/**
	 *	Returns the value of titleGrp
	 *	@return titleGrp
	 */   
	 public TitleGrp getTitleGrp() {
   	return dclbook.getTitleGrp();
   }

   /**
	* 	Update TitleGrp with the passed value
	*	@param value
	*/
   public void setTitleGrp(char[] value) throws CFException {
      dclbook.setTitleGrp(value);
   }   

     /**
	 * 	Update TitleGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTitleGrp(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dclbook.setTitleGrp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TitleGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTitleGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbook.setTitleGrp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TitleGrp with another Field
	 *	@param value
	 */
   public void setTitleGrp(Field source) {
   	dclbook.setTitleGrp(source);
   }  
   
     /**
	 * 	Update TitleGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTitleGrp(Field source, int sourceIndex,int sourceLen) {
   	dclbook.setTitleGrp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TitleGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTitleGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dclbook.setTitleGrp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of titleText
	 *	@return titleText
	 */
   public char[] getTitleText() throws CFException  {              
   		return dclbook.getTitleGrp().getTitleText();
   }

  
	/**
	*  set variable titleText
	*  @param value
	**/
   public void setTitleText(char[] value) throws CFException {
      dclbook.getTitleGrp().setTitleText(value);
   } 

     /**
	 * 	Update TitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTitleText(char[] source, int sourceIndex) throws CFException {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex);
   	
   }
   
   public void setTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TitleText with another Field
	 *	@param value
	 */
   public void setTitleText(Field source) {
      dclbook.getTitleGrp().setTitleText(source);
   }  
   
     /**
	 * 	Update TitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTitleText(Field source, int sourceIndex,int sourceLen) {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of totalPages
	 *	@return totalPages
	 */
	public int getTotalPages() throws CFException {        
   		return dclbook.getTotalPages();
	}
	
	/**
	 * 	Update TotalPages with the passed value
	 *	@param number
	 */
	public void setTotalPages(int number)  throws CFException{
		dclbook.setTotalPages(number);
	}


	public void setTotalPages(long number)  throws CFException{
		dclbook.setTotalPages((int)number);
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
	 *	Returns the value of publishedDateText
	 *	@return publishedDateText
	 */
   public char[] getPublishedDateText() throws CFException  {              
   		return dclbook.getPublishedDate().getPublishedDateText();
   }

  
	/**
	*  set variable publishedDateText
	*  @param value
	**/
   public void setPublishedDateText(char[] value) throws CFException {
      dclbook.getPublishedDate().setPublishedDateText(value);
   } 

     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex) throws CFException {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex);
   	
   }
   
   public void setPublishedDateText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PublishedDateText with another Field
	 *	@param value
	 */
   public void setPublishedDateText(Field source) {
      dclbook.getPublishedDate().setPublishedDateText(source);
   }  
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
   }


	/**
	 *	Returns the value of isbn
	 *	@return isbn
	 */
	public int getIsbn() throws CFException {        
   		return dclbook.getIsbn();
	}
	
	/**
	 * 	Update Isbn with the passed value
	 *	@param number
	 */
	public void setIsbn(int number)  throws CFException{
		dclbook.setIsbn(number);
	}


	public void setIsbn(long number)  throws CFException{
		dclbook.setIsbn((int)number);
	}


	/**
	 *	Returns the value of prtTitleLen
	 *	@return prtTitleLen
	 */
	public int getPrtTitleLen() throws CFException {
   		return work.getPrtTitleLen();
	}


	/**
	 *	Returns String value of prtTitleLen
	 *	@return prtTitleLen
	 */
	public char[]  getPrtTitleLenString() throws CFException {
	     return String.valueOf(work.getPrtTitleLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prtTitleLenIsNumeric()  throws CFException{
	    return work.prtTitleLenIsNumeric();
	}

	/**
	 * 	Update PrtTitleLen with the passed value
	 *	@param number
	 */
	public void setPrtTitleLen(int number)  throws CFException{
		work.setPrtTitleLen(number);
	}
	

	public void setPrtTitleLen(long number)  throws CFException{
	    work.setPrtTitleLen(number);
	}
	
	
	/**
	 * 	Update PrtTitleLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrtTitleLen(char[] value)  throws CFException {
		work.setPrtTitleLen(value);
	}
	
	/**
	 * 	Update PrtTitleLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrtTitleLenString(char[] value)  throws CFException{
		work.setPrtTitleLen(value);
	}	

	/**
	 *	Returns the value of publisherId
	 *	@return publisherId
	 */
	public int getPublisherId() throws CFException {        
   		return dclbook.getPublisherId();
	}
	
	/**
	 * 	Update PublisherId with the passed value
	 *	@param number
	 */
	public void setPublisherId(int number)  throws CFException{
		dclbook.setPublisherId(number);
	}


	public void setPublisherId(long number)  throws CFException{
		dclbook.setPublisherId((int)number);
	}



        public Db2varchCtx getDb2varchCtx() {
            return Db2varchCtx.this;
        }

        public SelectBookOutCtx getSelectBookOutCtx() {
            return new SelectBookOutCtx();
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
        str += dclbook.hashCode();
        str += sqlca.hashCode();
        str += nullvars.hashCode();
        str += ibook.hashCode();
       return str.hashCode();
    }

    public SelectBookInCtx clone() {
        SelectBookInCtx cloneObj = new SelectBookInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclbook = new Dclbook();
        cloneObj.dclbook.set(dclbook.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.ibook = new Ibook();
        cloneObj.ibook.set(ibook.getClonedField());
        return cloneObj;
    }

    }

    public SelectBookInCtx getSelectBookInCtx() {
            return new SelectBookInCtx();
    }
     public class SelectBookOutCtx implements Cloneable {
     Work work = Db2varchCtx.this.getWork();
     Dclbook dclbook = Db2varchCtx.this.getDclbook();
     Sqlca sqlca = Db2varchCtx.this.getSqlca();
     Nullvars nullvars = Db2varchCtx.this.getNullvars();
     Ibook ibook = Db2varchCtx.this.getIbook();

	/**
	 *	Returns the value of rating
	 *	@return rating
	 */
	public int getRating() throws CFException {        
   		return dclbook.getRating();
	}
	
	/**
	 * 	Update Rating with the passed value
	 *	@param number
	 */
	public void setRating(int number)  throws CFException{
		dclbook.setRating(number);
	}


	public void setRating(long number)  throws CFException{
		dclbook.setRating((int)number);
	}


	/**
	 *	Returns the value of prtIsbn
	 *	@return prtIsbn
	 */
   public char[] getPrtIsbn() throws CFException  {              
   		return work.getPrtIsbn();
   }

  
	/**
	*  set variable prtIsbn
	*  @param value
	**/
   public void setPrtIsbn(char[] value) throws CFException {
      work.setPrtIsbn(value);
   } 

     /**
	 * 	Update PrtIsbn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtIsbn(char[] source, int sourceIndex) throws CFException {
      work.setPrtIsbn(source, sourceIndex);
   	
   }
   
   public void setPrtIsbn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setPrtIsbn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtIsbn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtIsbn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtIsbn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtIsbn with another Field
	 *	@param value
	 */
   public void setPrtIsbn(Field source) {
      work.setPrtIsbn(source);
   }  
   
     /**
	 * 	Update PrtIsbn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtIsbn(Field source, int sourceIndex,int sourceLen) {
      work.setPrtIsbn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtIsbn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtIsbn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtIsbn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dclbook
	 *	@return dclbook
	 */   
	 public Dclbook getDclbook() {
   	return dclbook;
   }


	/**
	 *	Returns the value of prtPublishedDateLen
	 *	@return prtPublishedDateLen
	 */
	public int getPrtPublishedDateLen() throws CFException {
   		return work.getPrtPublishedDateLen();
	}


	/**
	 *	Returns String value of prtPublishedDateLen
	 *	@return prtPublishedDateLen
	 */
	public char[]  getPrtPublishedDateLenString() throws CFException {
	     return String.valueOf(work.getPrtPublishedDateLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prtPublishedDateLenIsNumeric()  throws CFException{
	    return work.prtPublishedDateLenIsNumeric();
	}

	/**
	 * 	Update PrtPublishedDateLen with the passed value
	 *	@param number
	 */
	public void setPrtPublishedDateLen(int number)  throws CFException{
		work.setPrtPublishedDateLen(number);
	}
	

	public void setPrtPublishedDateLen(long number)  throws CFException{
	    work.setPrtPublishedDateLen(number);
	}
	
	
	/**
	 * 	Update PrtPublishedDateLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrtPublishedDateLen(char[] value)  throws CFException {
		work.setPrtPublishedDateLen(value);
	}
	
	/**
	 * 	Update PrtPublishedDateLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrtPublishedDateLenString(char[] value)  throws CFException{
		work.setPrtPublishedDateLen(value);
	}	

	/**
	 *	Returns the value of prtPublishedDateText
	 *	@return prtPublishedDateText
	 */
   public char[] getPrtPublishedDateText() throws CFException  {              
   		return work.getPrtPublishedDateText();
   }

  
	/**
	*  set variable prtPublishedDateText
	*  @param value
	**/
   public void setPrtPublishedDateText(char[] value) throws CFException {
      work.setPrtPublishedDateText(value);
   } 

	/**
	 *	Returns the value of titleLen
	 *	@return titleLen
	 */
	public short getTitleLen() throws CFException {        
   		return dclbook.getTitleGrp().getTitleLen();
	}
	
	/**
	 * 	Update TitleLen with the passed value
	 *	@param number
	 */
	public void setTitleLen(short number)  throws CFException{
		dclbook.getTitleGrp().setTitleLen(number);
	}

	public void setTitleLen(int number)  throws CFException{
		dclbook.getTitleGrp().setTitleLen((short)number);
	}

	public void setTitleLen(long number)  throws CFException{
		dclbook.getTitleGrp().setTitleLen((short)number);
	}



	/**
	 *	Returns the value of prtTotalPages
	 *	@return prtTotalPages
	 */
   public char[] getPrtTotalPages() throws CFException  {              
   		return work.getPrtTotalPages();
   }

  
	/**
	*  set variable prtTotalPages
	*  @param value
	**/
   public void setPrtTotalPages(char[] value) throws CFException {
      work.setPrtTotalPages(value);
   } 

     /**
	 * 	Update PrtTotalPages 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtTotalPages(char[] source, int sourceIndex) throws CFException {
      work.setPrtTotalPages(source, sourceIndex);
   	
   }
   
   public void setPrtTotalPages(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setPrtTotalPages(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtTotalPages 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtTotalPages(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtTotalPages(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtTotalPages with another Field
	 *	@param value
	 */
   public void setPrtTotalPages(Field source) {
      work.setPrtTotalPages(source);
   }  
   
     /**
	 * 	Update PrtTotalPages 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtTotalPages(Field source, int sourceIndex,int sourceLen) {
      work.setPrtTotalPages(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtTotalPages 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtTotalPages(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtTotalPages(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of prtRating
	 *	@return prtRating
	 */
   public char[] getPrtRating() throws CFException  {              
   		return work.getPrtRating();
   }

  
	/**
	*  set variable prtRating
	*  @param value
	**/
   public void setPrtRating(char[] value) throws CFException {
      work.setPrtRating(value);
   } 

     /**
	 * 	Update PrtRating 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtRating(char[] source, int sourceIndex) throws CFException {
      work.setPrtRating(source, sourceIndex);
   	
   }
   
   public void setPrtRating(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setPrtRating(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtRating 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtRating(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtRating(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtRating with another Field
	 *	@param value
	 */
   public void setPrtRating(Field source) {
      work.setPrtRating(source);
   }  
   
     /**
	 * 	Update PrtRating 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtRating(Field source, int sourceIndex,int sourceLen) {
      work.setPrtRating(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtRating 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtRating(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtRating(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prtTitleText
	 *	@return prtTitleText
	 */
   public char[] getPrtTitleText() throws CFException  {              
   		return work.getPrtTitleText();
   }

  
	/**
	*  set variable prtTitleText
	*  @param value
	**/
   public void setPrtTitleText(char[] value) throws CFException {
      work.setPrtTitleText(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of prtPublisherId
	 *	@return prtPublisherId
	 */
   public char[] getPrtPublisherId() throws CFException  {              
   		return work.getPrtPublisherId();
   }

  
	/**
	*  set variable prtPublisherId
	*  @param value
	**/
   public void setPrtPublisherId(char[] value) throws CFException {
      work.setPrtPublisherId(value);
   } 

     /**
	 * 	Update PrtPublisherId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtPublisherId(char[] source, int sourceIndex) throws CFException {
      work.setPrtPublisherId(source, sourceIndex);
   	
   }
   
   public void setPrtPublisherId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setPrtPublisherId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtPublisherId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtPublisherId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtPublisherId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtPublisherId with another Field
	 *	@param value
	 */
   public void setPrtPublisherId(Field source) {
      work.setPrtPublisherId(source);
   }  
   
     /**
	 * 	Update PrtPublisherId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtPublisherId(Field source, int sourceIndex,int sourceLen) {
      work.setPrtPublisherId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtPublisherId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtPublisherId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtPublisherId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bookId
	 *	@return bookId
	 */
	public int getBookId() throws CFException {        
   		return dclbook.getBookId();
	}
	
	/**
	 * 	Update BookId with the passed value
	 *	@param number
	 */
	public void setBookId(int number)  throws CFException{
		dclbook.setBookId(number);
	}


	public void setBookId(long number)  throws CFException{
		dclbook.setBookId((int)number);
	}


	/**
	 *	Returns the value of titleText
	 *	@return titleText
	 */
   public char[] getTitleText() throws CFException  {              
   		return dclbook.getTitleGrp().getTitleText();
   }

  
	/**
	*  set variable titleText
	*  @param value
	**/
   public void setTitleText(char[] value) throws CFException {
      dclbook.getTitleGrp().setTitleText(value);
   } 

     /**
	 * 	Update TitleText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTitleText(char[] source, int sourceIndex) throws CFException {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex);
   	
   }
   
   public void setTitleText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TitleText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTitleText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TitleText with another Field
	 *	@param value
	 */
   public void setTitleText(Field source) {
      dclbook.getTitleGrp().setTitleText(source);
   }  
   
     /**
	 * 	Update TitleText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTitleText(Field source, int sourceIndex,int sourceLen) {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TitleText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTitleText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getTitleGrp().setTitleText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of publishedDateLen
	 *	@return publishedDateLen
	 */
	public short getPublishedDateLen() throws CFException {        
   		return dclbook.getPublishedDate().getPublishedDateLen();
	}
	
	/**
	 * 	Update PublishedDateLen with the passed value
	 *	@param number
	 */
	public void setPublishedDateLen(short number)  throws CFException{
		dclbook.getPublishedDate().setPublishedDateLen(number);
	}

	public void setPublishedDateLen(int number)  throws CFException{
		dclbook.getPublishedDate().setPublishedDateLen((short)number);
	}

	public void setPublishedDateLen(long number)  throws CFException{
		dclbook.getPublishedDate().setPublishedDateLen((short)number);
	}



	/**
	 *	Returns the value of totalPages
	 *	@return totalPages
	 */
	public int getTotalPages() throws CFException {        
   		return dclbook.getTotalPages();
	}
	
	/**
	 * 	Update TotalPages with the passed value
	 *	@param number
	 */
	public void setTotalPages(int number)  throws CFException{
		dclbook.setTotalPages(number);
	}


	public void setTotalPages(long number)  throws CFException{
		dclbook.setTotalPages((int)number);
	}


	/**
	 *	Returns the value of publishedDateText
	 *	@return publishedDateText
	 */
   public char[] getPublishedDateText() throws CFException  {              
   		return dclbook.getPublishedDate().getPublishedDateText();
   }

  
	/**
	*  set variable publishedDateText
	*  @param value
	**/
   public void setPublishedDateText(char[] value) throws CFException {
      dclbook.getPublishedDate().setPublishedDateText(value);
   } 

     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex) throws CFException {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex);
   	
   }
   
   public void setPublishedDateText(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PublishedDateText with another Field
	 *	@param value
	 */
   public void setPublishedDateText(Field source) {
      dclbook.getPublishedDate().setPublishedDateText(source);
   }  
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PublishedDateText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDateText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclbook.getPublishedDate().setPublishedDateText(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of nullvars
	 *	@return nullvars
	 */   
	 public Nullvars getNullvars() {
   	return nullvars;
   }


	/**
	 *	Returns the value of prtBookId
	 *	@return prtBookId
	 */
   public char[] getPrtBookId() throws CFException  {              
   		return work.getPrtBookId();
   }

  
	/**
	*  set variable prtBookId
	*  @param value
	**/
   public void setPrtBookId(char[] value) throws CFException {
      work.setPrtBookId(value);
   } 

     /**
	 * 	Update PrtBookId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrtBookId(char[] source, int sourceIndex) throws CFException {
      work.setPrtBookId(source, sourceIndex);
   	
   }
   
   public void setPrtBookId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setPrtBookId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrtBookId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrtBookId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtBookId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrtBookId with another Field
	 *	@param value
	 */
   public void setPrtBookId(Field source) {
      work.setPrtBookId(source);
   }  
   
     /**
	 * 	Update PrtBookId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrtBookId(Field source, int sourceIndex,int sourceLen) {
      work.setPrtBookId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrtBookId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrtBookId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPrtBookId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isbn
	 *	@return isbn
	 */
	public int getIsbn() throws CFException {        
   		return dclbook.getIsbn();
	}
	
	/**
	 * 	Update Isbn with the passed value
	 *	@param number
	 */
	public void setIsbn(int number)  throws CFException{
		dclbook.setIsbn(number);
	}


	public void setIsbn(long number)  throws CFException{
		dclbook.setIsbn((int)number);
	}


	/**
	 *	Returns the value of prtTitleLen
	 *	@return prtTitleLen
	 */
	public int getPrtTitleLen() throws CFException {
   		return work.getPrtTitleLen();
	}


	/**
	 *	Returns String value of prtTitleLen
	 *	@return prtTitleLen
	 */
	public char[]  getPrtTitleLenString() throws CFException {
	     return String.valueOf(work.getPrtTitleLenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prtTitleLenIsNumeric()  throws CFException{
	    return work.prtTitleLenIsNumeric();
	}

	/**
	 * 	Update PrtTitleLen with the passed value
	 *	@param number
	 */
	public void setPrtTitleLen(int number)  throws CFException{
		work.setPrtTitleLen(number);
	}
	

	public void setPrtTitleLen(long number)  throws CFException{
	    work.setPrtTitleLen(number);
	}
	
	
	/**
	 * 	Update PrtTitleLen with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrtTitleLen(char[] value)  throws CFException {
		work.setPrtTitleLen(value);
	}
	
	/**
	 * 	Update PrtTitleLen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrtTitleLenString(char[] value)  throws CFException{
		work.setPrtTitleLen(value);
	}	

	/**
	 *	Returns the value of ibook
	 *	@return ibook
	 */   
	 public Ibook getIbook() {
   	return ibook;
   }


	/**
	 *	Returns the value of publisherId
	 *	@return publisherId
	 */
	public int getPublisherId() throws CFException {        
   		return dclbook.getPublisherId();
	}
	
	/**
	 * 	Update PublisherId with the passed value
	 *	@param number
	 */
	public void setPublisherId(int number)  throws CFException{
		dclbook.setPublisherId(number);
	}


	public void setPublisherId(long number)  throws CFException{
		dclbook.setPublisherId((int)number);
	}



        public Db2varchCtx getDb2varchCtx() {
            return Db2varchCtx.this;
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
        str += dclbook.hashCode();
        str += sqlca.hashCode();
        str += nullvars.hashCode();
        str += ibook.hashCode();
       return str.hashCode();
    }

    public SelectBookOutCtx clone() {
        SelectBookOutCtx cloneObj = new SelectBookOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclbook = new Dclbook();
        cloneObj.dclbook.set(dclbook.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.nullvars = new Nullvars();
        cloneObj.nullvars.set(nullvars.getClonedField());
        cloneObj.ibook = new Ibook();
        cloneObj.ibook.set(ibook.getClonedField());
        return cloneObj;
    }

    }

    public SelectBookOutCtx getSelectBookOutCtx() {
            return new SelectBookOutCtx();
    }
     public class SqlErrChkInCtx implements Cloneable {
     Work work = Db2varchCtx.this.getWork();
     Sqlca sqlca = Db2varchCtx.this.getSqlca();

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



        public Db2varchCtx getDb2varchCtx() {
            return Db2varchCtx.this;
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
     Work work = Db2varchCtx.this.getWork();
     Sqlca sqlca = Db2varchCtx.this.getSqlca();

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


        public Db2varchCtx getDb2varchCtx() {
            return Db2varchCtx.this;
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
