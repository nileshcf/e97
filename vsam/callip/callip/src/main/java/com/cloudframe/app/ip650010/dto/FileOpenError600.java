package com.cloudframe.app.ip650010.dto;

/**
*  The class FileOpenError600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip650010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileOpenError600 extends FileOpenError600Serialized {
   



						private char[] badStatusCode600 = new char[2];

	
	/**
	* Constructor for FileOpenError600
	**/
    public FileOpenError600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("I/O ERROR OPENING OPTIMIZED PARM FILE.").toCharArray()
             , getStartOffset() + 0
             ,38
             );
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 38
             ,16
             );
								setBadStatusCode600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 56
             ,2
             );
    }


 

	/**
	 *	Returns the value of badStatusCode600
	 *	@return badStatusCode600
	 */
   public char[] getBadStatusCode600() throws CFException{
     if (isBadStatusCode600Modified()) { 
        badStatusCode600 = refreshBadStatusCode600();
     }
   		return badStatusCode600;
   }

  
	/**
	*  set variable badStatusCode600
	*  Corresponding COBOL Variable is 600-BAD-STATUS-CODE
	*  @param value
	**/
   public void setBadStatusCode600(char[] value) {
      badStatusCode600 = checkBadStatusCode600Constraints(value);
      serializeBadStatusCode600(badStatusCode600);
   } 

     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBadStatusCode600,badStatusCode600.length);
   	
   }
   
   public void setBadStatusCode600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode600,badStatusCode600.length);
   	
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BadStatusCode600 with another Field
	 *	@param value
	 */
   public void setBadStatusCode600(Field source) {
       replace(source,0,source.length(),beginBadStatusCode600,BAD_STATUS_CODE_600_LEN);
   	
   }  
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBadStatusCode600,BAD_STATUS_CODE_600_LEN);
   	
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileOpenError600FieldLength() {
			return FILE_OPEN_ERROR_600_LENGTH;
		}

}
  
