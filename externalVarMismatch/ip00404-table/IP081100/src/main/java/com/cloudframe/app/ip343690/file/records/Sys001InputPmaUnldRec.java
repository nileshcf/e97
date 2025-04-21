package com.cloudframe.app.ip343690.file.records;

/**
*  The class Sys001InputPmaUnldRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip343690.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001InputPmaUnldRec extends Sys001InputPmaUnldRecSerialized {
   

						private char[] sys001InputPmaUnldRecString = Field.fillLowValue(116);
	
	/**
	* Constructor for Sys001InputPmaUnldRec
	**/
    public Sys001InputPmaUnldRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001InputPmaUnldRecString
	 *	@return sys001InputPmaUnldRecString
	 */
   public char[] getSys001InputPmaUnldRecString() throws CFException{
     if (isSys001InputPmaUnldRecStringModified()) { 
        sys001InputPmaUnldRecString = refreshSys001InputPmaUnldRecString();
     }
   		return sys001InputPmaUnldRecString;
   }

  
	/**
	*  set variable sys001InputPmaUnldRecString
	*  Corresponding COBOL Variable is SYS001-INPUT-PMA-UNLD-REC-STRING
	*  @param value
	**/
   public void setSys001InputPmaUnldRecString(char[] value) {
      sys001InputPmaUnldRecString = checkSys001InputPmaUnldRecStringConstraints(value);
      serializeSys001InputPmaUnldRecString(sys001InputPmaUnldRecString);
   } 

     /**
	 * 	Update Sys001InputPmaUnldRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001InputPmaUnldRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001InputPmaUnldRecString,sys001InputPmaUnldRecString.length);
   	
   }
   
   public void setSys001InputPmaUnldRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001InputPmaUnldRecString,sys001InputPmaUnldRecString.length);
   	
   }
   
     /**
	 * 	Update Sys001InputPmaUnldRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001InputPmaUnldRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001InputPmaUnldRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001InputPmaUnldRecString with another Field
	 *	@param value
	 */
   public void setSys001InputPmaUnldRecString(Field source) {
       replace(source,0,source.length(),beginSys001InputPmaUnldRecString,SYS_001_INPUT_PMA_UNLD_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001InputPmaUnldRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001InputPmaUnldRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001InputPmaUnldRecString,SYS_001_INPUT_PMA_UNLD_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys001InputPmaUnldRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001InputPmaUnldRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001InputPmaUnldRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001InputPmaUnldRecFieldLength() {
			return SYS_001_INPUT_PMA_UNLD_REC_LENGTH;
		}

}
  
