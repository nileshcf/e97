package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys201OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys201OutputIpmOtbndRec extends Sys201OutputIpmOtbndRecSerialized {
   

						private char[] sys201OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys201OutputIpmOtbndRec
	**/
    public Sys201OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys201OutputIpmOtbndRecString
	 *	@return sys201OutputIpmOtbndRecString
	 */
   public char[] getSys201OutputIpmOtbndRecString() throws CFException{
     if (isSys201OutputIpmOtbndRecStringModified()) { 
        sys201OutputIpmOtbndRecString = refreshSys201OutputIpmOtbndRecString();
     }
   		return sys201OutputIpmOtbndRecString;
   }

  
	/**
	*  set variable sys201OutputIpmOtbndRecString
	*  Corresponding COBOL Variable is SYS201-OUTPUT-IPM-OTBND-REC-STRING
	*  @param value
	**/
   public void setSys201OutputIpmOtbndRecString(char[] value) {
      sys201OutputIpmOtbndRecString = checkSys201OutputIpmOtbndRecStringConstraints(value);
      serializeSys201OutputIpmOtbndRecString(sys201OutputIpmOtbndRecString);
   } 

     /**
	 * 	Update Sys201OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201OutputIpmOtbndRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys201OutputIpmOtbndRecString,sys201OutputIpmOtbndRecString.length);
   	
   }
   
   public void setSys201OutputIpmOtbndRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys201OutputIpmOtbndRecString,sys201OutputIpmOtbndRecString.length);
   	
   }
   
     /**
	 * 	Update Sys201OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201OutputIpmOtbndRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201OutputIpmOtbndRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys201OutputIpmOtbndRecString with another Field
	 *	@param value
	 */
   public void setSys201OutputIpmOtbndRecString(Field source) {
       replace(source,0,source.length(),beginSys201OutputIpmOtbndRecString,SYS_201_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys201OutputIpmOtbndRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys201OutputIpmOtbndRecString,SYS_201_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys201OutputIpmOtbndRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys201OutputIpmOtbndRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys201OutputIpmOtbndRecFieldLength() {
			return SYS_201_OUTPUT_IPM_OTBND_REC_LENGTH;
		}

}
  
