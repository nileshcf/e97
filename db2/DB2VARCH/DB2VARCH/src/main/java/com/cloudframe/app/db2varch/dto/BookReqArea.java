package com.cloudframe.app.db2varch.dto;

/**
*  The class BookReqArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.db2varch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BookReqArea extends BookReqAreaSerialized {
   

								private int breqBookId;

								private int breqIsbn;
				private BreqPublishedDate breqPublishedDate = new BreqPublishedDate();

								private int breqPublisherId;

								private int breqRating;
				private BreqTitleGrp breqTitleGrp = new BreqTitleGrp();

								private int breqTotalPages;
	
	/**
	* Constructor for BookReqArea
	**/
    public BookReqArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			breqPublishedDate.setParent(this,getStartOffset() + 8);
	       			breqTitleGrp.setParent(this,getStartOffset() + 273);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of breqBookId
	 *	@return breqBookId
	 */
	public int getBreqBookId() throws CFException {
        if (isBreqBookIdModified()) { 
           breqBookId = refreshBreqBookId();
        }
   		return breqBookId;
	}
	
	/**
	 * 	Update BreqBookId with the passed value
	 *  Corresponding COBOL Variable is BREQ-BOOK-ID
	 *	@param number
	 */
	public void setBreqBookId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    breqBookId = checkBreqBookIdMaxLimit(number); 
		serializeBreqBookId(breqBookId);
	}


	public void setBreqBookId(long number) {
	    number = checkBreqBookIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBreqBookId((int)number);
	}
	
	/**
	 *	Returns the value of breqIsbn
	 *	@return breqIsbn
	 */
	public int getBreqIsbn() throws CFException {
        if (isBreqIsbnModified()) { 
           breqIsbn = refreshBreqIsbn();
        }
   		return breqIsbn;
	}
	
	/**
	 * 	Update BreqIsbn with the passed value
	 *  Corresponding COBOL Variable is BREQ-ISBN
	 *	@param number
	 */
	public void setBreqIsbn(int number) {
	     // Truncate if the number is beyond +/- Max range
	    breqIsbn = checkBreqIsbnMaxLimit(number); 
		serializeBreqIsbn(breqIsbn);
	}


	public void setBreqIsbn(long number) {
	    number = checkBreqIsbnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBreqIsbn((int)number);
	}
	
	/**
	 *	Returns the value of breqPublishedDate
	 *	@return breqPublishedDate
	 */   
	 public BreqPublishedDate getBreqPublishedDate() {
   	return breqPublishedDate;
   }
   /**
	* 	Update BreqPublishedDate with the passed value
	*   Corresponding COBOL Variable is BREQ-PUBLISHED-DATE
	*	@param value
	*/
   public void setBreqPublishedDate(char[] value) {
      breqPublishedDate.setString(value); 
   }   
    
     /**
	 * 	Update BreqPublishedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBreqPublishedDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,breqPublishedDate.begin,breqPublishedDate.length());
   }
   
     /**
	 * 	Update BreqPublishedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,breqPublishedDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BreqPublishedDate with another Field
	 *	@param value
	 */
   public void setBreqPublishedDate(Field source) {
   	replace(source,0,source.length(),breqPublishedDate.begin,breqPublishedDate.length());
   }  
   
     /**
	 * 	Update BreqPublishedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBreqPublishedDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,breqPublishedDate.begin,breqPublishedDate.length());
   }
   
     /**
	 * 	Update BreqPublishedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqPublishedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,breqPublishedDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of breqPublisherId
	 *	@return breqPublisherId
	 */
	public int getBreqPublisherId() throws CFException {
        if (isBreqPublisherIdModified()) { 
           breqPublisherId = refreshBreqPublisherId();
        }
   		return breqPublisherId;
	}
	
	/**
	 * 	Update BreqPublisherId with the passed value
	 *  Corresponding COBOL Variable is BREQ-PUBLISHER-ID
	 *	@param number
	 */
	public void setBreqPublisherId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    breqPublisherId = checkBreqPublisherIdMaxLimit(number); 
		serializeBreqPublisherId(breqPublisherId);
	}


	public void setBreqPublisherId(long number) {
	    number = checkBreqPublisherIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBreqPublisherId((int)number);
	}
	
	/**
	 *	Returns the value of breqRating
	 *	@return breqRating
	 */
	public int getBreqRating() throws CFException {
        if (isBreqRatingModified()) { 
           breqRating = refreshBreqRating();
        }
   		return breqRating;
	}
	
	/**
	 * 	Update BreqRating with the passed value
	 *  Corresponding COBOL Variable is BREQ-RATING
	 *	@param number
	 */
	public void setBreqRating(int number) {
	     // Truncate if the number is beyond +/- Max range
	    breqRating = checkBreqRatingMaxLimit(number); 
		serializeBreqRating(breqRating);
	}


	public void setBreqRating(long number) {
	    number = checkBreqRatingMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBreqRating((int)number);
	}
	
	/**
	 *	Returns the value of breqTitleGrp
	 *	@return breqTitleGrp
	 */   
	 public BreqTitleGrp getBreqTitleGrp() {
   	return breqTitleGrp;
   }
   /**
	* 	Update BreqTitleGrp with the passed value
	*   Corresponding COBOL Variable is BREQ-TITLE-GRP
	*	@param value
	*/
   public void setBreqTitleGrp(char[] value) {
      breqTitleGrp.setString(value); 
   }   
    
     /**
	 * 	Update BreqTitleGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBreqTitleGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,breqTitleGrp.begin,breqTitleGrp.length());
   }
   
     /**
	 * 	Update BreqTitleGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,breqTitleGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BreqTitleGrp with another Field
	 *	@param value
	 */
   public void setBreqTitleGrp(Field source) {
   	replace(source,0,source.length(),breqTitleGrp.begin,breqTitleGrp.length());
   }  
   
     /**
	 * 	Update BreqTitleGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBreqTitleGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,breqTitleGrp.begin,breqTitleGrp.length());
   }
   
     /**
	 * 	Update BreqTitleGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBreqTitleGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,breqTitleGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of breqTotalPages
	 *	@return breqTotalPages
	 */
	public int getBreqTotalPages() throws CFException {
        if (isBreqTotalPagesModified()) { 
           breqTotalPages = refreshBreqTotalPages();
        }
   		return breqTotalPages;
	}
	
	/**
	 * 	Update BreqTotalPages with the passed value
	 *  Corresponding COBOL Variable is BREQ-TOTAL-PAGES
	 *	@param number
	 */
	public void setBreqTotalPages(int number) {
	     // Truncate if the number is beyond +/- Max range
	    breqTotalPages = checkBreqTotalPagesMaxLimit(number); 
		serializeBreqTotalPages(breqTotalPages);
	}


	public void setBreqTotalPages(long number) {
	    number = checkBreqTotalPagesMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBreqTotalPages((int)number);
	}
	

	
	
	

		public static int getBookReqAreaFieldLength() {
			return BOOK_REQ_AREA_LENGTH;
		}

}
  
