package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503X92ActivityLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503X92ActivityLog extends Sf503X92ActivityLogSerialized { 
   

						private char[] sf503X92RecordType = Field.fillLowValue(2);
	
	/**
	* Constructor for Sf503X92ActivityLog
	**/
    public Sf503X92ActivityLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503X92ActivityLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503X92ActivityLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503X92RecordType
	 *	@return sf503X92RecordType
	 */
   public char[] getSf503X92RecordType() throws CFException{
     if (isSf503X92RecordTypeModified()) { 
        sf503X92RecordType = refreshSf503X92RecordType();
     }
   		return sf503X92RecordType;
   }

  
	/**
	*  set variable sf503X92RecordType
	*  Corresponding COBOL Variable is SF503-X92-RECORD-TYPE
	*  @param value
	**/
   public void setSf503X92RecordType(char[] value) {
      sf503X92RecordType = checkSf503X92RecordTypeConstraints(value);
      serializeSf503X92RecordType(sf503X92RecordType);
   } 

     /**
	 * 	Update Sf503X92RecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503X92RecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503X92RecordType,sf503X92RecordType.length);
   	
   }
   
   public void setSf503X92RecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503X92RecordType,sf503X92RecordType.length);
   	
   }
   
     /**
	 * 	Update Sf503X92RecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503X92RecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503X92RecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503X92RecordType with another Field
	 *	@param value
	 */
   public void setSf503X92RecordType(Field source) {
       replace(source,0,source.length(),beginSf503X92RecordType,SF_503_X_92_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503X92RecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503X92RecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503X92RecordType,SF_503_X_92_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503X92RecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503X92RecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503X92RecordType+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503X92ActivityLogFieldLength() {
			return SF_503_X_92_ACTIVITY_LOG_LENGTH;
		}

}
  
