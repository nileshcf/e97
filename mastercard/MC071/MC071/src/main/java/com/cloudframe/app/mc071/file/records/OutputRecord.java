package com.cloudframe.app.mc071.file.records;

/**
*  The class OutputRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.mc071.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutputRecord extends OutputRecordSerialized {
   

						private char[] outputRecordString = Field.fillLowValue(80);
	
	/**
	* Constructor for OutputRecord
	**/
    public OutputRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of outputRecordString
	 *	@return outputRecordString
	 */
   public char[] getOutputRecordString() throws CFException{
     if (isOutputRecordStringModified()) { 
        outputRecordString = refreshOutputRecordString();
     }
   		return outputRecordString;
   }

  
	/**
	*  set variable outputRecordString
	*  Corresponding COBOL Variable is OUTPUT-RECORD-STRING
	*  @param value
	**/
   public void setOutputRecordString(char[] value) {
      outputRecordString = checkOutputRecordStringConstraints(value);
      serializeOutputRecordString(outputRecordString);
   } 

     /**
	 * 	Update OutputRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutputRecordString,outputRecordString.length);
   	
   }
   
   public void setOutputRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutputRecordString,outputRecordString.length);
   	
   }
   
     /**
	 * 	Update OutputRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutputRecordString with another Field
	 *	@param value
	 */
   public void setOutputRecordString(Field source) {
       replace(source,0,source.length(),beginOutputRecordString,OUTPUT_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update OutputRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutputRecordString,OUTPUT_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update OutputRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOutputRecordFieldLength() {
			return OUTPUT_RECORD_LENGTH;
		}

}
  
