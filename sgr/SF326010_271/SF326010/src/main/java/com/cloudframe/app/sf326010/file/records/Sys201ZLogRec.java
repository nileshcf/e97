package com.cloudframe.app.sf326010.file.records;

/**
*  The class Sys201ZLogRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201ZLogRec extends Sys201ZLogRecSerialized {
   

						private char[] sys201ZLogRecString = Field.fillLowValue(75);
	
	/**
	* Constructor for Sys201ZLogRec
	**/
    public Sys201ZLogRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201ZLogRecString
	 *	@return sys201ZLogRecString
	 */
   public char[] getSys201ZLogRecString() throws CFException{
     if (isSys201ZLogRecStringModified()) { 
        sys201ZLogRecString = refreshSys201ZLogRecString();
     }
   		return sys201ZLogRecString;
   }

  
	/**
	*  set variable sys201ZLogRecString
	*  Corresponding COBOL Variable is SYS201-Z-LOG-REC-STRING
	*  @param value
	**/
   public void setSys201ZLogRecString(char[] value) {
      sys201ZLogRecString = checkSys201ZLogRecStringConstraints(value);
      serializeSys201ZLogRecString(sys201ZLogRecString);
   } 

     /**
	 * 	Update Sys201ZLogRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201ZLogRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201ZLogRecString,sys201ZLogRecString.length);
   	
   }
   
   public void setSys201ZLogRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogRecString,sys201ZLogRecString.length);
   	
   }
   
     /**
	 * 	Update Sys201ZLogRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201ZLogRecString with another Field
	 *	@param value
	 */
   public void setSys201ZLogRecString(Field source) {
       replace(source,0,source.length(),beginSys201ZLogRecString,SYS_201_ZLOG_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201ZLogRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201ZLogRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201ZLogRecString,SYS_201_ZLOG_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys201ZLogRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ZLogRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201ZLogRecFieldLength() {
			return SYS_201_ZLOG_REC_LENGTH;
		}

}
  
