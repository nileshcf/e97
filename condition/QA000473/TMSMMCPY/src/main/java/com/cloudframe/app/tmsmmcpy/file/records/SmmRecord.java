package com.cloudframe.app.tmsmmcpy.file.records;

/**
*  The class SmmRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.tmsmmcpy.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SmmRecord extends SmmRecordSerialized {
   

						private char[] smmRecordString = Field.fillLowValue(3996);
	
	/**
	* Constructor for SmmRecord
	**/
    public SmmRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of smmRecordString
	 *	@return smmRecordString
	 */
   public char[] getSmmRecordString() throws CFException{
     if (isSmmRecordStringModified()) { 
        smmRecordString = refreshSmmRecordString();
     }
   		return smmRecordString;
   }

  
	/**
	*  set variable smmRecordString
	*  Corresponding COBOL Variable is SMM-RECORD-STRING
	*  @param value
	**/
   public void setSmmRecordString(char[] value) {
      smmRecordString = checkSmmRecordStringConstraints(value);
      serializeSmmRecordString(smmRecordString);
   } 

     /**
	 * 	Update SmmRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRecordString,smmRecordString.length);
   	
   }
   
   public void setSmmRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRecordString,smmRecordString.length);
   	
   }
   
     /**
	 * 	Update SmmRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRecordString with another Field
	 *	@param value
	 */
   public void setSmmRecordString(Field source) {
       replace(source,0,source.length(),beginSmmRecordString,SMM_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRecordString,SMM_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update SmmRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSmmRecordFieldLength() {
			return SMM_RECORD_LENGTH;
		}

}
  
