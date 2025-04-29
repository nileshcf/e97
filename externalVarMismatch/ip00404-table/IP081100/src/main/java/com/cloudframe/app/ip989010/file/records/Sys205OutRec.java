package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys205OutRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys205OutRec extends Sys205OutRecSerialized {
   

						private char[] sys205OutRecString = Field.fillLowValue(200);
	
	/**
	* Constructor for Sys205OutRec
	**/
    public Sys205OutRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys205OutRecString
	 *	@return sys205OutRecString
	 */
   public char[] getSys205OutRecString() throws CFException{
     if (isSys205OutRecStringModified()) { 
        sys205OutRecString = refreshSys205OutRecString();
     }
   		return sys205OutRecString;
   }

  
	/**
	*  set variable sys205OutRecString
	*  Corresponding COBOL Variable is SYS205-OUT-REC-STRING
	*  @param value
	**/
   public void setSys205OutRecString(char[] value) {
      sys205OutRecString = checkSys205OutRecStringConstraints(value);
      serializeSys205OutRecString(sys205OutRecString);
   } 

     /**
	 * 	Update Sys205OutRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys205OutRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys205OutRecString,sys205OutRecString.length);
   	
   }
   
   public void setSys205OutRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys205OutRecString,sys205OutRecString.length);
   	
   }
   
     /**
	 * 	Update Sys205OutRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys205OutRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205OutRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys205OutRecString with another Field
	 *	@param value
	 */
   public void setSys205OutRecString(Field source) {
       replace(source,0,source.length(),beginSys205OutRecString,SYS_205_OUT_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys205OutRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys205OutRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys205OutRecString,SYS_205_OUT_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys205OutRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys205OutRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys205OutRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys205OutRecFieldLength() {
			return SYS_205_OUT_REC_LENGTH;
		}

}
  
