package com.cloudframe.app.ip798030.file.records;

/**
*  The class Sys210MqDataRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.ip798030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys210MqDataRec extends Sys210MqDataRecSerialized {
   

						private char[] sys210MqDataRecString = Field.fillLowValue(500);
	
	/**
	* Constructor for Sys210MqDataRec
	**/
    public Sys210MqDataRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys210MqDataRecString
	 *	@return sys210MqDataRecString
	 */
   public char[] getSys210MqDataRecString() throws CFException{
     if (isSys210MqDataRecStringModified()) { 
        sys210MqDataRecString = refreshSys210MqDataRecString();
     }
   		return sys210MqDataRecString;
   }

  
	/**
	*  set variable sys210MqDataRecString
	*  Corresponding COBOL Variable is SYS210-MQ-DATA-REC-STRING
	*  @param value
	**/
   public void setSys210MqDataRecString(char[] value) {
      sys210MqDataRecString = checkSys210MqDataRecStringConstraints(value);
      serializeSys210MqDataRecString(sys210MqDataRecString);
   } 

     /**
	 * 	Update Sys210MqDataRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys210MqDataRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys210MqDataRecString,sys210MqDataRecString.length);
   	
   }
   
   public void setSys210MqDataRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys210MqDataRecString,sys210MqDataRecString.length);
   	
   }
   
     /**
	 * 	Update Sys210MqDataRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys210MqDataRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys210MqDataRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys210MqDataRecString with another Field
	 *	@param value
	 */
   public void setSys210MqDataRecString(Field source) {
       replace(source,0,source.length(),beginSys210MqDataRecString,SYS_210_MQ_DATA_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys210MqDataRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys210MqDataRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys210MqDataRecString,SYS_210_MQ_DATA_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys210MqDataRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys210MqDataRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys210MqDataRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys210MqDataRecFieldLength() {
			return SYS_210_MQ_DATA_REC_LENGTH;
		}

}
  
