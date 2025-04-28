package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys203OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys203OutputIpmOtbndRec extends Sys203OutputIpmOtbndRecSerialized { 
   

						private char[] sys203OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys203OutputIpmOtbndRec
	**/
    public Sys203OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys203OutputIpmOtbndRecString
	 *	@return sys203OutputIpmOtbndRecString
	 */
   public char[] getSys203OutputIpmOtbndRecString() throws CFException{
     if (isSys203OutputIpmOtbndRecStringModified()) { 
        sys203OutputIpmOtbndRecString = refreshSys203OutputIpmOtbndRecString();
     }
   		return sys203OutputIpmOtbndRecString;
   }

  
	/**
	*  set variable sys203OutputIpmOtbndRecString
	*  Corresponding COBOL Variable is SYS203-OUTPUT-IPM-OTBND-REC-STRING
	*  @param value
	**/
   public void setSys203OutputIpmOtbndRecString(char[] value) {
      sys203OutputIpmOtbndRecString = checkSys203OutputIpmOtbndRecStringConstraints(value);
      serializeSys203OutputIpmOtbndRecString(sys203OutputIpmOtbndRecString);
   } 

     /**
	 * 	Update Sys203OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys203OutputIpmOtbndRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys203OutputIpmOtbndRecString,sys203OutputIpmOtbndRecString.length);
   	
   }
   
   public void setSys203OutputIpmOtbndRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys203OutputIpmOtbndRecString,sys203OutputIpmOtbndRecString.length);
   	
   }
   
     /**
	 * 	Update Sys203OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys203OutputIpmOtbndRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys203OutputIpmOtbndRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys203OutputIpmOtbndRecString with another Field
	 *	@param value
	 */
   public void setSys203OutputIpmOtbndRecString(Field source) {
       replace(source,0,source.length(),beginSys203OutputIpmOtbndRecString,SYS_203_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys203OutputIpmOtbndRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys203OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys203OutputIpmOtbndRecString,SYS_203_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys203OutputIpmOtbndRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys203OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys203OutputIpmOtbndRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys203OutputIpmOtbndRecFieldLength() {
			return SYS_203_OUTPUT_IPM_OTBND_REC_LENGTH;
		}

}
  
