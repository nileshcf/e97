package com.cloudframe.app.ms00d363.file.records;

/**
*  The class InputRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputRecord extends InputRecordSerialized {
   

						private char[] inputRecordString = Field.fillLowValue(1400);
	
	/**
	* Constructor for InputRecord
	**/
    public InputRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inputRecordString
	 *	@return inputRecordString
	 */
   public char[] getInputRecordString() throws CFException{
     if (isInputRecordStringModified()) { 
        inputRecordString = refreshInputRecordString();
     }
   		return inputRecordString;
   }

  
	/**
	*  set variable inputRecordString
	*  Corresponding COBOL Variable is INPUT-RECORD-STRING
	*  @param value
	**/
   public void setInputRecordString(char[] value) {
      inputRecordString = checkInputRecordStringConstraints(value);
      serializeInputRecordString(inputRecordString);
   } 

     /**
	 * 	Update InputRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputRecordString,inputRecordString.length);
   	
   }
   
   public void setInputRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputRecordString,inputRecordString.length);
   	
   }
   
     /**
	 * 	Update InputRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputRecordString with another Field
	 *	@param value
	 */
   public void setInputRecordString(Field source) {
       replace(source,0,source.length(),beginInputRecordString,INPUT_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update InputRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputRecordString,INPUT_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update InputRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInputRecordFieldLength() {
			return INPUT_RECORD_LENGTH;
		}

}
  
