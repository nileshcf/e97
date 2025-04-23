package com.cloudframe.app.tmsmmcpy.file.records;

/**
*  The class SmmRecordOut is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.tmsmmcpy.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SmmRecordOut extends SmmRecordOutSerialized {
   

						private char[] smmRecordOutString = Field.fillLowValue(822);
	
	/**
	* Constructor for SmmRecordOut
	**/
    public SmmRecordOut() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of smmRecordOutString
	 *	@return smmRecordOutString
	 */
   public char[] getSmmRecordOutString() throws CFException{
     if (isSmmRecordOutStringModified()) { 
        smmRecordOutString = refreshSmmRecordOutString();
     }
   		return smmRecordOutString;
   }

  
	/**
	*  set variable smmRecordOutString
	*  Corresponding COBOL Variable is SMM-RECORD-OUT-STRING
	*  @param value
	**/
   public void setSmmRecordOutString(char[] value) {
      smmRecordOutString = checkSmmRecordOutStringConstraints(value);
      serializeSmmRecordOutString(smmRecordOutString);
   } 

     /**
	 * 	Update SmmRecordOutString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmRecordOutString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmRecordOutString,smmRecordOutString.length);
   	
   }
   
   public void setSmmRecordOutString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRecordOutString,smmRecordOutString.length);
   	
   }
   
     /**
	 * 	Update SmmRecordOutString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmRecordOutString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRecordOutString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmRecordOutString with another Field
	 *	@param value
	 */
   public void setSmmRecordOutString(Field source) {
       replace(source,0,source.length(),beginSmmRecordOutString,SMM_RECORD_OUT_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update SmmRecordOutString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmRecordOutString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmRecordOutString,SMM_RECORD_OUT_STRING_LEN);
   	
   }
   
     /**
	 * 	Update SmmRecordOutString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmRecordOutString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmRecordOutString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSmmRecordOutFieldLength() {
			return SMM_RECORD_OUT_LENGTH;
		}

}
  
