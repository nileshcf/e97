package com.cloudframe.app.sf311010.file.records;

/**
*  The class IssAcqVer2Record is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IssAcqVer2Record extends IssAcqVer2RecordSerialized {
   

						private char[] issAcqVer2RecordString = Field.fillLowValue(900);
	
	/**
	* Constructor for IssAcqVer2Record
	**/
    public IssAcqVer2Record() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of issAcqVer2RecordString
	 *	@return issAcqVer2RecordString
	 */
   public char[] getIssAcqVer2RecordString() throws CFException{
     if (isIssAcqVer2RecordStringModified()) { 
        issAcqVer2RecordString = refreshIssAcqVer2RecordString();
     }
   		return issAcqVer2RecordString;
   }

  
	/**
	*  set variable issAcqVer2RecordString
	*  Corresponding COBOL Variable is ISS-ACQ-VER2-RECORD-STRING
	*  @param value
	**/
   public void setIssAcqVer2RecordString(char[] value) {
      issAcqVer2RecordString = checkIssAcqVer2RecordStringConstraints(value);
      serializeIssAcqVer2RecordString(issAcqVer2RecordString);
   } 

     /**
	 * 	Update IssAcqVer2RecordString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIssAcqVer2RecordString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIssAcqVer2RecordString,issAcqVer2RecordString.length);
   	
   }
   
   public void setIssAcqVer2RecordString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIssAcqVer2RecordString,issAcqVer2RecordString.length);
   	
   }
   
     /**
	 * 	Update IssAcqVer2RecordString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIssAcqVer2RecordString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIssAcqVer2RecordString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IssAcqVer2RecordString with another Field
	 *	@param value
	 */
   public void setIssAcqVer2RecordString(Field source) {
       replace(source,0,source.length(),beginIssAcqVer2RecordString,ISS_ACQ_VER_2_RECORD_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update IssAcqVer2RecordString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIssAcqVer2RecordString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIssAcqVer2RecordString,ISS_ACQ_VER_2_RECORD_STRING_LEN);
   	
   }
   
     /**
	 * 	Update IssAcqVer2RecordString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIssAcqVer2RecordString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIssAcqVer2RecordString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIssAcqVer2RecordFieldLength() {
			return ISS_ACQ_VER_2_RECORD_LENGTH;
		}

}
  
