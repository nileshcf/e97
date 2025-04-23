package com.cloudframe.app.ms00d363.file.records;

/**
*  The class RptkeyRec01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RptkeyRec01 extends RptkeyRec01Serialized {
   

						private char[] rptkeyRecString = Field.fillLowValue(80);
	
	/**
	* Constructor for RptkeyRec01
	**/
    public RptkeyRec01() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rptkeyRecString
	 *	@return rptkeyRecString
	 */
   public char[] getRptkeyRecString() throws CFException{
     if (isRptkeyRecStringModified()) { 
        rptkeyRecString = refreshRptkeyRecString();
     }
   		return rptkeyRecString;
   }

  
	/**
	*  set variable rptkeyRecString
	*  Corresponding COBOL Variable is RPTKEY-REC-STRING
	*  @param value
	**/
   public void setRptkeyRecString(char[] value) {
      rptkeyRecString = checkRptkeyRecStringConstraints(value);
      serializeRptkeyRecString(rptkeyRecString);
   } 

     /**
	 * 	Update RptkeyRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRptkeyRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRptkeyRecString,rptkeyRecString.length);
   	
   }
   
   public void setRptkeyRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyRecString,rptkeyRecString.length);
   	
   }
   
     /**
	 * 	Update RptkeyRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRptkeyRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RptkeyRecString with another Field
	 *	@param value
	 */
   public void setRptkeyRecString(Field source) {
       replace(source,0,source.length(),beginRptkeyRecString,RPTKEY_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update RptkeyRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRptkeyRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRptkeyRecString,RPTKEY_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update RptkeyRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRptkeyRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRptkeyRec01FieldLength() {
			return RPTKEY_REC_01_LENGTH;
		}

}
  
