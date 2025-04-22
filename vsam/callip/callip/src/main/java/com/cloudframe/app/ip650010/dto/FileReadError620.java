package com.cloudframe.app.ip650010.dto;

/**
*  The class FileReadError620 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip650010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileReadError620 extends FileReadError620Serialized {
   



						private char[] badStatusCode620 = new char[2];

	
	/**
	* Constructor for FileReadError620
	**/
    public FileReadError620() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("I/O ERROR READING OPTIMIZED PARM FILE.").toCharArray()
             , getStartOffset() + 0
             ,38
             );
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 38
             ,16
             );
								setBadStatusCode620(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 56
             ,2
             );
    }


 

	/**
	 *	Returns the value of badStatusCode620
	 *	@return badStatusCode620
	 */
   public char[] getBadStatusCode620() throws CFException{
     if (isBadStatusCode620Modified()) { 
        badStatusCode620 = refreshBadStatusCode620();
     }
   		return badStatusCode620;
   }

  
	/**
	*  set variable badStatusCode620
	*  Corresponding COBOL Variable is 620-BAD-STATUS-CODE
	*  @param value
	**/
   public void setBadStatusCode620(char[] value) {
      badStatusCode620 = checkBadStatusCode620Constraints(value);
      serializeBadStatusCode620(badStatusCode620);
   } 

     /**
	 * 	Update BadStatusCode620 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode620(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBadStatusCode620,badStatusCode620.length);
   	
   }
   
   public void setBadStatusCode620(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode620,badStatusCode620.length);
   	
   }
   
     /**
	 * 	Update BadStatusCode620 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode620(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode620+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BadStatusCode620 with another Field
	 *	@param value
	 */
   public void setBadStatusCode620(Field source) {
       replace(source,0,source.length(),beginBadStatusCode620,BAD_STATUS_CODE_620_LEN);
   	
   }  
   
     /**
	 * 	Update BadStatusCode620 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode620(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBadStatusCode620,BAD_STATUS_CODE_620_LEN);
   	
   }
   
     /**
	 * 	Update BadStatusCode620 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode620(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode620+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileReadError620FieldLength() {
			return FILE_READ_ERROR_620_LENGTH;
		}

}
  
