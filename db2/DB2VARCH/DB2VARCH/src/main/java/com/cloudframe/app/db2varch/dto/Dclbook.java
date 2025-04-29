package com.cloudframe.app.db2varch.dto;

/**
*  The class Dclbook is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.db2varch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dclbook extends DclbookSerialized {
   

								private int bookId;

								private int isbn;
				private PublishedDate publishedDate = new PublishedDate();

								private int publisherId;

								private int rating;
				private TitleGrp titleGrp = new TitleGrp();

								private int totalPages;
	
	/**
	* Constructor for Dclbook
	**/
    public Dclbook() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			publishedDate.setParent(this,getStartOffset() + 8);
	       			titleGrp.setParent(this,getStartOffset() + 273);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bookId
	 *	@return bookId
	 */
	public int getBookId() throws CFException {
        if (isBookIdModified()) { 
           bookId = refreshBookId();
        }
   		return bookId;
	}
	
	/**
	 * 	Update BookId with the passed value
	 *  Corresponding COBOL Variable is BOOK-ID
	 *	@param number
	 */
	public void setBookId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    bookId = checkBookIdMaxLimit(number); 
		serializeBookId(bookId);
	}


	public void setBookId(long number) {
	    number = checkBookIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBookId((int)number);
	}
	
	/**
	 *	Returns the value of isbn
	 *	@return isbn
	 */
	public int getIsbn() throws CFException {
        if (isIsbnModified()) { 
           isbn = refreshIsbn();
        }
   		return isbn;
	}
	
	/**
	 * 	Update Isbn with the passed value
	 *  Corresponding COBOL Variable is ISBN
	 *	@param number
	 */
	public void setIsbn(int number) {
	     // Truncate if the number is beyond +/- Max range
	    isbn = checkIsbnMaxLimit(number); 
		serializeIsbn(isbn);
	}


	public void setIsbn(long number) {
	    number = checkIsbnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIsbn((int)number);
	}
	
	/**
	 *	Returns the value of publishedDate
	 *	@return publishedDate
	 */   
	 public PublishedDate getPublishedDate() {
   	return publishedDate;
   }
   /**
	* 	Update PublishedDate with the passed value
	*   Corresponding COBOL Variable is PUBLISHED-DATE
	*	@param value
	*/
   public void setPublishedDate(char[] value) {
      publishedDate.setString(value); 
   }   
    
     /**
	 * 	Update PublishedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPublishedDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,publishedDate.begin,publishedDate.length());
   }
   
     /**
	 * 	Update PublishedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,publishedDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PublishedDate with another Field
	 *	@param value
	 */
   public void setPublishedDate(Field source) {
   	replace(source,0,source.length(),publishedDate.begin,publishedDate.length());
   }  
   
     /**
	 * 	Update PublishedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPublishedDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,publishedDate.begin,publishedDate.length());
   }
   
     /**
	 * 	Update PublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,publishedDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of publisherId
	 *	@return publisherId
	 */
	public int getPublisherId() throws CFException {
        if (isPublisherIdModified()) { 
           publisherId = refreshPublisherId();
        }
   		return publisherId;
	}
	
	/**
	 * 	Update PublisherId with the passed value
	 *  Corresponding COBOL Variable is PUBLISHER-ID
	 *	@param number
	 */
	public void setPublisherId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    publisherId = checkPublisherIdMaxLimit(number); 
		serializePublisherId(publisherId);
	}


	public void setPublisherId(long number) {
	    number = checkPublisherIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setPublisherId((int)number);
	}
	
	/**
	 *	Returns the value of rating
	 *	@return rating
	 */
	public int getRating() throws CFException {
        if (isRatingModified()) { 
           rating = refreshRating();
        }
   		return rating;
	}
	
	/**
	 * 	Update Rating with the passed value
	 *  Corresponding COBOL Variable is RATING
	 *	@param number
	 */
	public void setRating(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rating = checkRatingMaxLimit(number); 
		serializeRating(rating);
	}


	public void setRating(long number) {
	    number = checkRatingMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRating((int)number);
	}
	
	/**
	 *	Returns the value of titleGrp
	 *	@return titleGrp
	 */   
	 public TitleGrp getTitleGrp() {
   	return titleGrp;
   }
   /**
	* 	Update TitleGrp with the passed value
	*   Corresponding COBOL Variable is TITLE-GRP
	*	@param value
	*/
   public void setTitleGrp(char[] value) {
      titleGrp.setString(value); 
   }   
    
     /**
	 * 	Update TitleGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTitleGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,titleGrp.begin,titleGrp.length());
   }
   
     /**
	 * 	Update TitleGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTitleGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,titleGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TitleGrp with another Field
	 *	@param value
	 */
   public void setTitleGrp(Field source) {
   	replace(source,0,source.length(),titleGrp.begin,titleGrp.length());
   }  
   
     /**
	 * 	Update TitleGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTitleGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,titleGrp.begin,titleGrp.length());
   }
   
     /**
	 * 	Update TitleGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTitleGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,titleGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of totalPages
	 *	@return totalPages
	 */
	public int getTotalPages() throws CFException {
        if (isTotalPagesModified()) { 
           totalPages = refreshTotalPages();
        }
   		return totalPages;
	}
	
	/**
	 * 	Update TotalPages with the passed value
	 *  Corresponding COBOL Variable is TOTAL-PAGES
	 *	@param number
	 */
	public void setTotalPages(int number) {
	     // Truncate if the number is beyond +/- Max range
	    totalPages = checkTotalPagesMaxLimit(number); 
		serializeTotalPages(totalPages);
	}


	public void setTotalPages(long number) {
	    number = checkTotalPagesMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTotalPages((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Dclbook
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBookId(0);
                     setIsbn(0);
          publishedDate.initialize();
     
                     setPublisherId(0);
                     setRating(0);
          titleGrp.initialize();
     
                     setTotalPages(0);
   }

		public static int getDclbookFieldLength() {
			return DCLBOOK_LENGTH;
		}

}
  
