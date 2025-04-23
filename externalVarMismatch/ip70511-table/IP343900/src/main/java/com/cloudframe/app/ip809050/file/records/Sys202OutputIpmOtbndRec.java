package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys202OutputIpmOtbndRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys202OutputIpmOtbndRec extends Sys202OutputIpmOtbndRecSerialized {
   

						private char[] sys202OutputIpmOtbndRecString = Field.fillLowValue(600);
	
	/**
	* Constructor for Sys202OutputIpmOtbndRec
	**/
    public Sys202OutputIpmOtbndRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys202OutputIpmOtbndRecString
	 *	@return sys202OutputIpmOtbndRecString
	 */
   public char[] getSys202OutputIpmOtbndRecString() throws CFException{
     if (isSys202OutputIpmOtbndRecStringModified()) { 
        sys202OutputIpmOtbndRecString = refreshSys202OutputIpmOtbndRecString();
     }
   		return sys202OutputIpmOtbndRecString;
   }

  
	/**
	*  set variable sys202OutputIpmOtbndRecString
	*  Corresponding COBOL Variable is SYS202-OUTPUT-IPM-OTBND-REC-STRING
	*  @param value
	**/
   public void setSys202OutputIpmOtbndRecString(char[] value) {
      sys202OutputIpmOtbndRecString = checkSys202OutputIpmOtbndRecStringConstraints(value);
      serializeSys202OutputIpmOtbndRecString(sys202OutputIpmOtbndRecString);
   } 

     /**
	 * 	Update Sys202OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys202OutputIpmOtbndRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys202OutputIpmOtbndRecString,sys202OutputIpmOtbndRecString.length);
   	
   }
   
   public void setSys202OutputIpmOtbndRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys202OutputIpmOtbndRecString,sys202OutputIpmOtbndRecString.length);
   	
   }
   
     /**
	 * 	Update Sys202OutputIpmOtbndRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys202OutputIpmOtbndRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202OutputIpmOtbndRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys202OutputIpmOtbndRecString with another Field
	 *	@param value
	 */
   public void setSys202OutputIpmOtbndRecString(Field source) {
       replace(source,0,source.length(),beginSys202OutputIpmOtbndRecString,SYS_202_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys202OutputIpmOtbndRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys202OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys202OutputIpmOtbndRecString,SYS_202_OUTPUT_IPM_OTBND_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys202OutputIpmOtbndRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys202OutputIpmOtbndRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys202OutputIpmOtbndRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys202OutputIpmOtbndRecFieldLength() {
			return SYS_202_OUTPUT_IPM_OTBND_REC_LENGTH;
		}

}
  
