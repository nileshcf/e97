package com.cloudframe.app.db2varch.dto;

/**
*  The class BookWorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.db2varch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BookWorkArea extends BookWorkAreaSerialized {
   

						private char[] bookTableName = new char[4];

								private int bookIoStatus;
	
	/**
	* Constructor for BookWorkArea
	**/
    public BookWorkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBookTableName(("BOOK").toCharArray());
								setBookIoStatus(7);
    }


 

	/**
	 *	Returns the value of bookTableName
	 *	@return bookTableName
	 */
   public char[] getBookTableName() throws CFException{
     if (isBookTableNameModified()) { 
        bookTableName = refreshBookTableName();
     }
   		return bookTableName;
   }

  
	/**
	*  set variable bookTableName
	*  Corresponding COBOL Variable is BOOK-TABLE-NAME
	*  @param value
	**/
   public void setBookTableName(char[] value) {
      bookTableName = checkBookTableNameConstraints(value);
      serializeBookTableName(bookTableName);
   } 

     /**
	 * 	Update BookTableName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBookTableName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBookTableName,bookTableName.length);
   	
   }
   
   public void setBookTableName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBookTableName,bookTableName.length);
   	
   }
   
     /**
	 * 	Update BookTableName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBookTableName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBookTableName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BookTableName with another Field
	 *	@param value
	 */
   public void setBookTableName(Field source) {
       replace(source,0,source.length(),beginBookTableName,BOOK_TABLE_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update BookTableName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBookTableName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBookTableName,BOOK_TABLE_NAME_LEN);
   	
   }
   
     /**
	 * 	Update BookTableName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBookTableName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBookTableName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bookIoStatus
	 *	@return bookIoStatus
	 */
	public int getBookIoStatus() throws CFException {
       if (isBookIoStatusModified()) { 
           bookIoStatus = refreshBookIoStatus();
        }
   		return bookIoStatus;
	}
	

	
	   
	/**
	 * 	Update BookIoStatus with the passed value
	 *  Corresponding COBOL Variable is BOOK-IO-STATUS
	 *	@param number
	 */
	public void setBookIoStatus(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bookIoStatus = checkBookIoStatusMaxLimit(number); 
		serializeBookIoStatus(bookIoStatus);
	}
	

	public void setBookIoStatus(long number) {
	    number = checkBookIoStatusMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBookIoStatus((int)number);
	}
	
	/**
	 * 	Update BookIoStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setBookIoStatus(char[] value) throws CFException {
		 bookIoStatus = serializeBookIoStatus(value);
	}
	/**
	 * 	Update BookIoStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBookIoStatusString(char[] value) throws CFException {
		 setBookIoStatus(value);
	}
	
	/**
	 *	Test condition 0 for isBookIoOk()
	 *	@return  Returns true if isBookIoOk() is 0
	 */
   public boolean isBookIoOk() throws CFException {
      return (  getBookIoStatus()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setBookIoOkTrue() {  			
    	setBookIoStatus( 0);
   	}
	
	/**
	 *	Test condition 3 for isBookIoDuplicate()
	 *	@return  Returns true if isBookIoDuplicate() is 3
	 */
   public boolean isBookIoDuplicate() throws CFException {
      return (  getBookIoStatus()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setBookIoDuplicateTrue() {  			
    	setBookIoStatus( 3);
   	}
	
	/**
	 *	Test condition 7 for isBookIoNotOk()
	 *	@return  Returns true if isBookIoNotOk() is 7
	 */
   public boolean isBookIoNotOk() throws CFException {
      return (  getBookIoStatus()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setBookIoNotOkTrue() {  			
    	setBookIoStatus( 7);
   	}

	
	
	

		public static int getBookWorkAreaFieldLength() {
			return BOOK_WORK_AREA_LENGTH;
		}

}
  
