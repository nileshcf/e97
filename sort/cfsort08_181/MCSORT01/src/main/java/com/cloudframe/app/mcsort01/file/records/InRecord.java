package com.cloudframe.app.mcsort01.file.records;

/**
*  The class InRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcsort01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InRecord extends InRecordSerialized {
   

						private char[] inRecordString = Field.fillLowValue(32752);
	
	/**
	* Constructor for InRecord
	**/
    public InRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inRecordString
	 *	@return inRecordString
	 */
   public char[] getInRecordString() throws CFException{
     if (isInRecordStringModified()) { 
        inRecordString = refreshInRecordString();
     }
   		return inRecordString;
   }

  
	/**
	*  set variable inRecordString
	*  Corresponding COBOL Variable is IN-RECORD-STRING
	*  @param value
	**/
   public void setInRecordString(char[] value) {
      inRecordString = checkInRecordStringConstraints(value);
      serializeInRecordString(inRecordString);
   } 

     /**
	 * 	Update InRecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInRecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInRecordString,inRecordString.length);
   	
   }
   
   public void setInRecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInRecordString,inRecordString.length);
   	
   }
   
     /**
	 * 	Update InRecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInRecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInRecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InRecordString with another Field
	 *	@param value
	 */
   public void setInRecordString(Field source) {
       replace(source,0,source.length(),beginInRecordString,IN_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update InRecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInRecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInRecordString,IN_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update InRecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInRecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInRecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInRecordFieldLength() {
			return IN_RECORD_LENGTH;
		}

}
  
