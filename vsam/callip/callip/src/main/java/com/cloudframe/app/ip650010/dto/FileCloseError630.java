package com.cloudframe.app.ip650010.dto;

/**
*  The class FileCloseError630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip650010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileCloseError630 extends FileCloseError630Serialized {
   



						private char[] badStatusCode630 = new char[2];

	
	/**
	* Constructor for FileCloseError630
	**/
    public FileCloseError630() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("I/O ERROR CLOSING OPTIMIZED PARM FILE.").toCharArray()
             , getStartOffset() + 0
             ,38
             );
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 38
             ,16
             );
								setBadStatusCode630(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 56
             ,2
             );
    }


 

	/**
	 *	Returns the value of badStatusCode630
	 *	@return badStatusCode630
	 */
   public char[] getBadStatusCode630() throws CFException{
     if (isBadStatusCode630Modified()) { 
        badStatusCode630 = refreshBadStatusCode630();
     }
   		return badStatusCode630;
   }

  
	/**
	*  set variable badStatusCode630
	*  Corresponding COBOL Variable is 630-BAD-STATUS-CODE
	*  @param value
	**/
   public void setBadStatusCode630(char[] value) {
      badStatusCode630 = checkBadStatusCode630Constraints(value);
      serializeBadStatusCode630(badStatusCode630);
   } 

     /**
	 * 	Update BadStatusCode630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBadStatusCode630,badStatusCode630.length);
   	
   }
   
   public void setBadStatusCode630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode630,badStatusCode630.length);
   	
   }
   
     /**
	 * 	Update BadStatusCode630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BadStatusCode630 with another Field
	 *	@param value
	 */
   public void setBadStatusCode630(Field source) {
       replace(source,0,source.length(),beginBadStatusCode630,BAD_STATUS_CODE_630_LEN);
   	
   }  
   
     /**
	 * 	Update BadStatusCode630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBadStatusCode630,BAD_STATUS_CODE_630_LEN);
   	
   }
   
     /**
	 * 	Update BadStatusCode630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode630+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileCloseError630FieldLength() {
			return FILE_CLOSE_ERROR_630_LENGTH;
		}

}
  
