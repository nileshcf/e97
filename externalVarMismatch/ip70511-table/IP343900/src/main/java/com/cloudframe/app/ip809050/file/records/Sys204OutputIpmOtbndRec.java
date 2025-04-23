package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys204OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys204OutputIpmOtbndRec extends Sys204OutputIpmOtbndRecSerialized {
   

						private char[] sys204OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys204OutputIpmOtbndRec
	**/
    public Sys204OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys204OutputIpmOtbndRecString
	 *	@return sys204OutputIpmOtbndRecString
	 */
   public char[] getSys204OutputIpmOtbndRecString() throws CFException{
     if (isSys204OutputIpmOtbndRecStringModified()) { 
        sys204OutputIpmOtbndRecString = refreshSys204OutputIpmOtbndRecString();
     }
   		return sys204OutputIpmOtbndRecString;
   }

  
	/**
	*  set variable sys204OutputIpmOtbndRecString
	*  Corresponding COBOL Variable is SYS204-OUTPUT-IPM-OTBND-REC-STRING
	*  @param value
	**/
   public void setSys204OutputIpmOtbndRecString(char[] value) {
      sys204OutputIpmOtbndRecString = checkSys204OutputIpmOtbndRecStringConstraints(value);
      serializeSys204OutputIpmOtbndRecString(sys204OutputIpmOtbndRecString);
   } 

     /**
	 * 	Update Sys204OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys204OutputIpmOtbndRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys204OutputIpmOtbndRecString,sys204OutputIpmOtbndRecString.length);
   	
   }
   
   public void setSys204OutputIpmOtbndRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys204OutputIpmOtbndRecString,sys204OutputIpmOtbndRecString.length);
   	
   }
   
     /**
	 * 	Update Sys204OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys204OutputIpmOtbndRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204OutputIpmOtbndRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys204OutputIpmOtbndRecString with another Field
	 *	@param value
	 */
   public void setSys204OutputIpmOtbndRecString(Field source) {
       replace(source,0,source.length(),beginSys204OutputIpmOtbndRecString,SYS_204_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys204OutputIpmOtbndRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys204OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys204OutputIpmOtbndRecString,SYS_204_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys204OutputIpmOtbndRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys204OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys204OutputIpmOtbndRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys204OutputIpmOtbndRecFieldLength() {
			return SYS_204_OUTPUT_IPM_OTBND_REC_LENGTH;
		}

}
  
