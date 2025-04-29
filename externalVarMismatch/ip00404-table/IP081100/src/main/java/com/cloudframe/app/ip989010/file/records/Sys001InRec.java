package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys001InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001InRec extends Sys001InRecSerialized {
   

						private char[] sys001InRecString = Field.fillLowValue(200);
	
	/**
	* Constructor for Sys001InRec
	**/
    public Sys001InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys001InRecString
	 *	@return sys001InRecString
	 */
   public char[] getSys001InRecString() throws CFException{
     if (isSys001InRecStringModified()) { 
        sys001InRecString = refreshSys001InRecString();
     }
   		return sys001InRecString;
   }

  
	/**
	*  set variable sys001InRecString
	*  Corresponding COBOL Variable is SYS001-IN-REC-STRING
	*  @param value
	**/
   public void setSys001InRecString(char[] value) {
      sys001InRecString = checkSys001InRecStringConstraints(value);
      serializeSys001InRecString(sys001InRecString);
   } 

     /**
	 * 	Update Sys001InRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001InRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001InRecString,sys001InRecString.length);
   	
   }
   
   public void setSys001InRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001InRecString,sys001InRecString.length);
   	
   }
   
     /**
	 * 	Update Sys001InRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001InRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001InRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001InRecString with another Field
	 *	@param value
	 */
   public void setSys001InRecString(Field source) {
       replace(source,0,source.length(),beginSys001InRecString,SYS_001_IN_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001InRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001InRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001InRecString,SYS_001_IN_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys001InRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001InRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001InRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001InRecFieldLength() {
			return SYS_001_IN_REC_LENGTH;
		}

}
  
