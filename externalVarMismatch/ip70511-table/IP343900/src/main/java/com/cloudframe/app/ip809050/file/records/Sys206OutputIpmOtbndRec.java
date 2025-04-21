package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys206OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys206OutputIpmOtbndRec extends Sys206OutputIpmOtbndRecSerialized {
   

						private char[] sys206OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys206OutputIpmOtbndRec
	**/
    public Sys206OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys206OutputIpmOtbndRecString
	 *	@return sys206OutputIpmOtbndRecString
	 */
   public char[] getSys206OutputIpmOtbndRecString() throws CFException{
     if (isSys206OutputIpmOtbndRecStringModified()) { 
        sys206OutputIpmOtbndRecString = refreshSys206OutputIpmOtbndRecString();
     }
   		return sys206OutputIpmOtbndRecString;
   }

  
	/**
	*  set variable sys206OutputIpmOtbndRecString
	*  Corresponding COBOL Variable is SYS206-OUTPUT-IPM-OTBND-REC-STRING
	*  @param value
	**/
   public void setSys206OutputIpmOtbndRecString(char[] value) {
      sys206OutputIpmOtbndRecString = checkSys206OutputIpmOtbndRecStringConstraints(value);
      serializeSys206OutputIpmOtbndRecString(sys206OutputIpmOtbndRecString);
   } 

     /**
	 * 	Update Sys206OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys206OutputIpmOtbndRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys206OutputIpmOtbndRecString,sys206OutputIpmOtbndRecString.length);
   	
   }
   
   public void setSys206OutputIpmOtbndRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys206OutputIpmOtbndRecString,sys206OutputIpmOtbndRecString.length);
   	
   }
   
     /**
	 * 	Update Sys206OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys206OutputIpmOtbndRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys206OutputIpmOtbndRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys206OutputIpmOtbndRecString with another Field
	 *	@param value
	 */
   public void setSys206OutputIpmOtbndRecString(Field source) {
       replace(source,0,source.length(),beginSys206OutputIpmOtbndRecString,SYS_206_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys206OutputIpmOtbndRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys206OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys206OutputIpmOtbndRecString,SYS_206_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys206OutputIpmOtbndRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys206OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys206OutputIpmOtbndRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys206OutputIpmOtbndRecFieldLength() {
			return SYS_206_OUTPUT_IPM_OTBND_REC_LENGTH;
		}

}
  
