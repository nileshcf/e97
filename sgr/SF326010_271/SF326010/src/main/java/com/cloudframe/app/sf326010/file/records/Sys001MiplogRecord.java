package com.cloudframe.app.sf326010.file.records;

/**
*  The class Sys001MiplogRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf326010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001MiplogRecord extends Sys001MiplogRecordSerialized {
   

						private char[] sys001MiplogRecordString = Field.fillLowValue(32752);
	
	/**
	* Constructor for Sys001MiplogRecord
	**/
    public Sys001MiplogRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001MiplogRecordString
	 *	@return sys001MiplogRecordString
	 */
   public char[] getSys001MiplogRecordString() throws CFException{
     if (isSys001MiplogRecordStringModified()) { 
        sys001MiplogRecordString = refreshSys001MiplogRecordString();
     }
   		return sys001MiplogRecordString;
   }

  
	/**
	*  set variable sys001MiplogRecordString
	*  Corresponding COBOL Variable is SYS001-MIPLOG-RECORD-STRING
	*  @param value
	**/
   public void setSys001MiplogRecordString(char[] value) {
      sys001MiplogRecordString = checkSys001MiplogRecordStringConstraints(value);
      serializeSys001MiplogRecordString(sys001MiplogRecordString);
   } 

     /**
	 * 	Update Sys001MiplogRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogRecordString,sys001MiplogRecordString.length);
   	
   }
   
   public void setSys001MiplogRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRecordString,sys001MiplogRecordString.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogRecordString with another Field
	 *	@param value
	 */
   public void setSys001MiplogRecordString(Field source) {
       replace(source,0,source.length(),beginSys001MiplogRecordString,SYS_001_MIPLOG_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogRecordString,SYS_001_MIPLOG_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001MiplogRecordFieldLength() {
			return SYS_001_MIPLOG_RECORD_LENGTH;
		}

}
  
