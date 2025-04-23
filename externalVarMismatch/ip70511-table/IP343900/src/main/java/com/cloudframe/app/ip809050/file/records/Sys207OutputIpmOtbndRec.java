package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys207OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys207OutputIpmOtbndRec extends Sys207OutputIpmOtbndRecSerialized {
   

						private char[] sys207OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys207OutputIpmOtbndRec
	**/
    public Sys207OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys207OutputIpmOtbndRecString
	 *	@return sys207OutputIpmOtbndRecString
	 */
   public char[] getSys207OutputIpmOtbndRecString() throws CFException{
     if (isSys207OutputIpmOtbndRecStringModified()) { 
        sys207OutputIpmOtbndRecString = refreshSys207OutputIpmOtbndRecString();
     }
   		return sys207OutputIpmOtbndRecString;
   }

  
	/**
	*  set variable sys207OutputIpmOtbndRecString
	*  Corresponding COBOL Variable is SYS207-OUTPUT-IPM-OTBND-REC-STRING
	*  @param value
	**/
   public void setSys207OutputIpmOtbndRecString(char[] value) {
      sys207OutputIpmOtbndRecString = checkSys207OutputIpmOtbndRecStringConstraints(value);
      serializeSys207OutputIpmOtbndRecString(sys207OutputIpmOtbndRecString);
   } 

     /**
	 * 	Update Sys207OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys207OutputIpmOtbndRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys207OutputIpmOtbndRecString,sys207OutputIpmOtbndRecString.length);
   	
   }
   
   public void setSys207OutputIpmOtbndRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys207OutputIpmOtbndRecString,sys207OutputIpmOtbndRecString.length);
   	
   }
   
     /**
	 * 	Update Sys207OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys207OutputIpmOtbndRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys207OutputIpmOtbndRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys207OutputIpmOtbndRecString with another Field
	 *	@param value
	 */
   public void setSys207OutputIpmOtbndRecString(Field source) {
       replace(source,0,source.length(),beginSys207OutputIpmOtbndRecString,SYS_207_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys207OutputIpmOtbndRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys207OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys207OutputIpmOtbndRecString,SYS_207_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys207OutputIpmOtbndRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys207OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys207OutputIpmOtbndRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys207OutputIpmOtbndRecFieldLength() {
			return SYS_207_OUTPUT_IPM_OTBND_REC_LENGTH;
		}

}
  
