package com.cloudframe.app.ip650010.dto;

/**
*  The class FileStartError610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip650010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileStartError610 extends FileStartError610Serialized {
   



						private char[] badStatusCode610 = new char[2];

	
	/**
	* Constructor for FileStartError610
	**/
    public FileStartError610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("I/O ERROR POSITIONING OPTIMIZED PARM FILE.").toCharArray()
             , getStartOffset() + 0
             ,42
             );
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 42
             ,16
             );
								setBadStatusCode610(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 60
             ,2
             );
    }


 

	/**
	 *	Returns the value of badStatusCode610
	 *	@return badStatusCode610
	 */
   public char[] getBadStatusCode610() throws CFException{
     if (isBadStatusCode610Modified()) { 
        badStatusCode610 = refreshBadStatusCode610();
     }
   		return badStatusCode610;
   }

  
	/**
	*  set variable badStatusCode610
	*  Corresponding COBOL Variable is 610-BAD-STATUS-CODE
	*  @param value
	**/
   public void setBadStatusCode610(char[] value) {
      badStatusCode610 = checkBadStatusCode610Constraints(value);
      serializeBadStatusCode610(badStatusCode610);
   } 

     /**
	 * 	Update BadStatusCode610 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode610(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBadStatusCode610,badStatusCode610.length);
   	
   }
   
   public void setBadStatusCode610(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode610,badStatusCode610.length);
   	
   }
   
     /**
	 * 	Update BadStatusCode610 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode610(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode610+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BadStatusCode610 with another Field
	 *	@param value
	 */
   public void setBadStatusCode610(Field source) {
       replace(source,0,source.length(),beginBadStatusCode610,BAD_STATUS_CODE_610_LEN);
   	
   }  
   
     /**
	 * 	Update BadStatusCode610 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode610(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBadStatusCode610,BAD_STATUS_CODE_610_LEN);
   	
   }
   
     /**
	 * 	Update BadStatusCode610 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode610(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode610+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFileStartError610FieldLength() {
			return FILE_START_ERROR_610_LENGTH;
		}

}
  
