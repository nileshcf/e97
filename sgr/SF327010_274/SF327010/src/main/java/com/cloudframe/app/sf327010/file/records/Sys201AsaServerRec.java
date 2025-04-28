package com.cloudframe.app.sf327010.file.records;

/**
*  The class Sys201AsaServerRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201AsaServerRec extends Sys201AsaServerRecSerialized {
   

						private char[] sys201AsaServerRecString = Field.fillLowValue(132);
	
	/**
	* Constructor for Sys201AsaServerRec
	**/
    public Sys201AsaServerRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201AsaServerRecString
	 *	@return sys201AsaServerRecString
	 */
   public char[] getSys201AsaServerRecString() throws CFException{
     if (isSys201AsaServerRecStringModified()) { 
        sys201AsaServerRecString = refreshSys201AsaServerRecString();
     }
   		return sys201AsaServerRecString;
   }

  
	/**
	*  set variable sys201AsaServerRecString
	*  Corresponding COBOL Variable is SYS201-ASA-SERVER-REC-STRING
	*  @param value
	**/
   public void setSys201AsaServerRecString(char[] value) {
      sys201AsaServerRecString = checkSys201AsaServerRecStringConstraints(value);
      serializeSys201AsaServerRecString(sys201AsaServerRecString);
   } 

     /**
	 * 	Update Sys201AsaServerRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201AsaServerRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201AsaServerRecString,sys201AsaServerRecString.length);
   	
   }
   
   public void setSys201AsaServerRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201AsaServerRecString,sys201AsaServerRecString.length);
   	
   }
   
     /**
	 * 	Update Sys201AsaServerRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201AsaServerRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201AsaServerRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201AsaServerRecString with another Field
	 *	@param value
	 */
   public void setSys201AsaServerRecString(Field source) {
       replace(source,0,source.length(),beginSys201AsaServerRecString,SYS_201_ASA_SERVER_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201AsaServerRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201AsaServerRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201AsaServerRecString,SYS_201_ASA_SERVER_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys201AsaServerRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201AsaServerRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201AsaServerRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201AsaServerRecFieldLength() {
			return SYS_201_ASA_SERVER_REC_LENGTH;
		}

}
  
