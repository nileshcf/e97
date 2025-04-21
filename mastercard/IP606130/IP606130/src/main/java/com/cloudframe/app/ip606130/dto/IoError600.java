package com.cloudframe.app.ip606130.dto;

/**
*  The class IoError600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IoError600 extends IoError600Serialized {
   


						private char[] fileName600 = new char[21];


						private char[] badIoStatusCode600 = new char[4];

	
	/**
	* Constructor for IoError600
	**/
    public IoError600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR IN FILE HANDLING   ").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setFileName600(fillSpace(21));
       replaceValue( // serialize and save the value
             (" STATUS CODE = \"").toCharArray()
             , getStartOffset() + 46
             ,16
             );
								setBadIoStatusCode600(fillSpace(4));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 66
             ,2
             );
    }


 

	/**
	 *	Returns the value of fileName600
	 *	@return fileName600
	 */
   public char[] getFileName600() throws CFException{
     if (isFileName600Modified()) { 
        fileName600 = refreshFileName600();
     }
   		return fileName600;
   }

  
	/**
	*  set variable fileName600
	*  Corresponding COBOL Variable is 600-FILE-NAME
	*  @param value
	**/
   public void setFileName600(char[] value) {
      fileName600 = checkFileName600Constraints(value);
      serializeFileName600(fileName600);
   } 

     /**
	 * 	Update FileName600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileName600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileName600,fileName600.length);
   	
   }
   
   public void setFileName600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileName600,fileName600.length);
   	
   }
   
     /**
	 * 	Update FileName600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileName600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileName600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileName600 with another Field
	 *	@param value
	 */
   public void setFileName600(Field source) {
       replace(source,0,source.length(),beginFileName600,FILE_NAME_600_LEN);
   	
   }  
   
     /**
	 * 	Update FileName600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileName600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileName600,FILE_NAME_600_LEN);
   	
   }
   
     /**
	 * 	Update FileName600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileName600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileName600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of badIoStatusCode600
	 *	@return badIoStatusCode600
	 */
   public char[] getBadIoStatusCode600() throws CFException{
     if (isBadIoStatusCode600Modified()) { 
        badIoStatusCode600 = refreshBadIoStatusCode600();
     }
   		return badIoStatusCode600;
   }

  
	/**
	*  set variable badIoStatusCode600
	*  Corresponding COBOL Variable is 600-BAD-IO-STATUS-CODE
	*  @param value
	**/
   public void setBadIoStatusCode600(char[] value) {
      badIoStatusCode600 = checkBadIoStatusCode600Constraints(value);
      serializeBadIoStatusCode600(badIoStatusCode600);
   } 

     /**
	 * 	Update BadIoStatusCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadIoStatusCode600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBadIoStatusCode600,badIoStatusCode600.length);
   	
   }
   
   public void setBadIoStatusCode600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBadIoStatusCode600,badIoStatusCode600.length);
   	
   }
   
     /**
	 * 	Update BadIoStatusCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadIoStatusCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadIoStatusCode600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BadIoStatusCode600 with another Field
	 *	@param value
	 */
   public void setBadIoStatusCode600(Field source) {
       replace(source,0,source.length(),beginBadIoStatusCode600,BAD_IO_STATUS_CODE_600_LEN);
   	
   }  
   
     /**
	 * 	Update BadIoStatusCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadIoStatusCode600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBadIoStatusCode600,BAD_IO_STATUS_CODE_600_LEN);
   	
   }
   
     /**
	 * 	Update BadIoStatusCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadIoStatusCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadIoStatusCode600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIoError600FieldLength() {
			return IO_ERROR_600_LENGTH;
		}

}
  
