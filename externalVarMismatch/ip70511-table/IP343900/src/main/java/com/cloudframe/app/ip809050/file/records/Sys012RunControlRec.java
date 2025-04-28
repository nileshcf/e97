package com.cloudframe.app.ip809050.file.records;

/**
*  The class Sys012RunControlRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys012RunControlRec extends Sys012RunControlRecSerialized { 
   

						private char[] sys012RunControlRecString = Field.fillLowValue(80);
	
	/**
	* Constructor for Sys012RunControlRec
	**/
    public Sys012RunControlRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys012RunControlRecString
	 *	@return sys012RunControlRecString
	 */
   public char[] getSys012RunControlRecString() throws CFException{
     if (isSys012RunControlRecStringModified()) { 
        sys012RunControlRecString = refreshSys012RunControlRecString();
     }
   		return sys012RunControlRecString;
   }

  
	/**
	*  set variable sys012RunControlRecString
	*  Corresponding COBOL Variable is SYS012-RUN-CONTROL-REC-STRING
	*  @param value
	**/
   public void setSys012RunControlRecString(char[] value) {
      sys012RunControlRecString = checkSys012RunControlRecStringConstraints(value);
      serializeSys012RunControlRecString(sys012RunControlRecString);
   } 

     /**
	 * 	Update Sys012RunControlRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys012RunControlRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys012RunControlRecString,sys012RunControlRecString.length);
   	
   }
   
   public void setSys012RunControlRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys012RunControlRecString,sys012RunControlRecString.length);
   	
   }
   
     /**
	 * 	Update Sys012RunControlRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys012RunControlRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys012RunControlRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys012RunControlRecString with another Field
	 *	@param value
	 */
   public void setSys012RunControlRecString(Field source) {
       replace(source,0,source.length(),beginSys012RunControlRecString,SYS_012_RUN_CONTROL_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys012RunControlRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys012RunControlRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys012RunControlRecString,SYS_012_RUN_CONTROL_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys012RunControlRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys012RunControlRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys012RunControlRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys012RunControlRecFieldLength() {
			return SYS_012_RUN_CONTROL_REC_LENGTH;
		}

}
  
