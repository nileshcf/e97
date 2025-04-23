package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503TypeIiTranLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503TypeIiTranLog extends Sf503TypeIiTranLogSerialized { 
   

						private char[] sf503T2RecordType = Field.fillLowValue(1);
	
	/**
	* Constructor for Sf503TypeIiTranLog
	**/
    public Sf503TypeIiTranLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503TypeIiTranLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503TypeIiTranLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503T2RecordType
	 *	@return sf503T2RecordType
	 */
   public char[] getSf503T2RecordType() throws CFException{
     if (isSf503T2RecordTypeModified()) { 
        sf503T2RecordType = refreshSf503T2RecordType();
     }
   		return sf503T2RecordType;
   }

  
	/**
	*  set variable sf503T2RecordType
	*  Corresponding COBOL Variable is SF503-T2-RECORD-TYPE
	*  @param value
	**/
   public void setSf503T2RecordType(char[] value) {
      sf503T2RecordType = checkSf503T2RecordTypeConstraints(value);
      serializeSf503T2RecordType(sf503T2RecordType);
   } 

     /**
	 * 	Update Sf503T2RecordType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503T2RecordType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503T2RecordType,sf503T2RecordType.length);
   	
   }
   
   public void setSf503T2RecordType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503T2RecordType,sf503T2RecordType.length);
   	
   }
   
     /**
	 * 	Update Sf503T2RecordType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503T2RecordType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503T2RecordType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503T2RecordType with another Field
	 *	@param value
	 */
   public void setSf503T2RecordType(Field source) {
       replace(source,0,source.length(),beginSf503T2RecordType,SF_503_T_2_RECORD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503T2RecordType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503T2RecordType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503T2RecordType,SF_503_T_2_RECORD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503T2RecordType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503T2RecordType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503T2RecordType+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503TypeIiTranLogFieldLength() {
			return SF_503_TYPE_II_TRAN_LOG_LENGTH;
		}

}
  
