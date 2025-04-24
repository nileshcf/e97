package com.cloudframe.app.db2prog2.dto;

/**
*  The class Dclbooks is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.db2prog2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dclbooks extends DclbooksSerialized { 
   

								private int booksBookId;
				private BooksTitle booksTitle = new BooksTitle();
	
	/**
	* Constructor for Dclbooks
	**/
    public Dclbooks() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			booksTitle.setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of booksBookId
	 *	@return booksBookId
	 */
	public int getBooksBookId() throws CFException {
        if (isBooksBookIdModified()) { 
           booksBookId = refreshBooksBookId();
        }
   		return booksBookId;
	}
	
	/**
	 * 	Update BooksBookId with the passed value
	 *  Corresponding COBOL Variable is BOOKS-BOOK-ID
	 *	@param number
	 */
	public void setBooksBookId(int number) {
	     // Truncate if the number is beyond +/- Max range
	    booksBookId = checkBooksBookIdMaxLimit(number); 
		serializeBooksBookId(booksBookId);
	}


	public void setBooksBookId(long number) {
	    number = checkBooksBookIdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBooksBookId((int)number);
	}
	
	/**
	 *	Returns the value of booksTitle
	 *	@return booksTitle
	 */   
	 public BooksTitle getBooksTitle() {
   	return booksTitle;
   }
   /**
	* 	Update BooksTitle with the passed value
	*   Corresponding COBOL Variable is BOOKS-TITLE
	*	@param value
	*/
   public void setBooksTitle(char[] value) {
      booksTitle.setString(value); 
   }   
    
     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin,booksTitle.length());
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BooksTitle with another Field
	 *	@param value
	 */
   public void setBooksTitle(Field source) {
   	replace(source,0,source.length(),booksTitle.begin,booksTitle.length());
   }  
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin,booksTitle.length());
   }
   
     /**
	 * 	Update BooksTitle 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBooksTitle(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,booksTitle.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDclbooksFieldLength() {
			return DCLBOOKS_LENGTH;
		}

}
  
