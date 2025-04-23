package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys205OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys205OutputIpmOtbndRec extends Sys205OutputIpmOtbndRecSerialized {
   

						private char[] sys205OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys205OutputIpmOtbndRec
	**/
    public Sys205OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys205OutputIpmOtbndRecString
	 *	@return sys205OutputIpmOtbndRecString
	 */
   public char[] getSys205OutputIpmOtbndRecString() throws CFException{
     if (isSys205OutputIpmOtbndRecStringModified()) { 
        sys205OutputIpmOtbndRecString = refreshSys205OutputIpmOtbndRecString();
     }
   		return sys205OutputIpmOtbndRecString;
   }

  
	/**
	*  set variable sys205OutputIpmOtbndRecString
	*  Corresponding COBOL Variable is SYS205-OUTPUT-IPM-OTBND-REC-STRING
	*  @param value
	**/
   public void setSys205OutputIpmOtbndRecString(char[] value) {
      sys205OutputIpmOtbndRecString = checkSys205OutputIpmOtbndRecStringConstraints(value);
      serializeSys205OutputIpmOtbndRecString(sys205OutputIpmOtbndRecString);
   } 

     /**
	 * 	Update Sys205OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys205OutputIpmOtbndRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys205OutputIpmOtbndRecString,sys205OutputIpmOtbndRecString.length);
   	
   }
   
   public void setSys205OutputIpmOtbndRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys205OutputIpmOtbndRecString,sys205OutputIpmOtbndRecString.length);
   	
   }
   
     /**
	 * 	Update Sys205OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys205OutputIpmOtbndRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205OutputIpmOtbndRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys205OutputIpmOtbndRecString with another Field
	 *	@param value
	 */
   public void setSys205OutputIpmOtbndRecString(Field source) {
       replace(source,0,source.length(),beginSys205OutputIpmOtbndRecString,SYS_205_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys205OutputIpmOtbndRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys205OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys205OutputIpmOtbndRecString,SYS_205_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys205OutputIpmOtbndRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys205OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205OutputIpmOtbndRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys205OutputIpmOtbndRecFieldLength() {
			return SYS_205_OUTPUT_IPM_OTBND_REC_LENGTH;
		}

}
  
