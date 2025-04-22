package com.cloudframe.app.sf328010.file.records;

/**
*  The class Sys201ServiceRptRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201ServiceRptRec extends Sys201ServiceRptRecSerialized {
   

						private char[] sys201ServiceRptRecString = Field.fillLowValue(132);
	
	/**
	* Constructor for Sys201ServiceRptRec
	**/
    public Sys201ServiceRptRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201ServiceRptRecString
	 *	@return sys201ServiceRptRecString
	 */
   public char[] getSys201ServiceRptRecString() throws CFException{
     if (isSys201ServiceRptRecStringModified()) { 
        sys201ServiceRptRecString = refreshSys201ServiceRptRecString();
     }
   		return sys201ServiceRptRecString;
   }

  
	/**
	*  set variable sys201ServiceRptRecString
	*  Corresponding COBOL Variable is SYS201-SERVICE-RPT-REC-STRING
	*  @param value
	**/
   public void setSys201ServiceRptRecString(char[] value) {
      sys201ServiceRptRecString = checkSys201ServiceRptRecStringConstraints(value);
      serializeSys201ServiceRptRecString(sys201ServiceRptRecString);
   } 

     /**
	 * 	Update Sys201ServiceRptRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201ServiceRptRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201ServiceRptRecString,sys201ServiceRptRecString.length);
   	
   }
   
   public void setSys201ServiceRptRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ServiceRptRecString,sys201ServiceRptRecString.length);
   	
   }
   
     /**
	 * 	Update Sys201ServiceRptRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201ServiceRptRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ServiceRptRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201ServiceRptRecString with another Field
	 *	@param value
	 */
   public void setSys201ServiceRptRecString(Field source) {
       replace(source,0,source.length(),beginSys201ServiceRptRecString,SYS_201_SERVICE_RPT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201ServiceRptRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201ServiceRptRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201ServiceRptRecString,SYS_201_SERVICE_RPT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys201ServiceRptRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201ServiceRptRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201ServiceRptRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201ServiceRptRecFieldLength() {
			return SYS_201_SERVICE_RPT_REC_LENGTH;
		}

}
  
