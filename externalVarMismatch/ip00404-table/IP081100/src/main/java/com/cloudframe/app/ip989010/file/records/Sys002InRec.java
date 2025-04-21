package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys002InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys002InRec extends Sys002InRecSerialized {
   

						private char[] sys002InRecString = Field.fillLowValue(200);
	
	/**
	* Constructor for Sys002InRec
	**/
    public Sys002InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys002InRecString
	 *	@return sys002InRecString
	 */
   public char[] getSys002InRecString() throws CFException{
     if (isSys002InRecStringModified()) { 
        sys002InRecString = refreshSys002InRecString();
     }
   		return sys002InRecString;
   }

  
	/**
	*  set variable sys002InRecString
	*  Corresponding COBOL Variable is SYS002-IN-REC-STRING
	*  @param value
	**/
   public void setSys002InRecString(char[] value) {
      sys002InRecString = checkSys002InRecStringConstraints(value);
      serializeSys002InRecString(sys002InRecString);
   } 

     /**
	 * 	Update Sys002InRecString 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys002InRecString(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys002InRecString,sys002InRecString.length);
   	
   }
   
   public void setSys002InRecString(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys002InRecString,sys002InRecString.length);
   	
   }
   
     /**
	 * 	Update Sys002InRecString 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys002InRecString(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys002InRecString+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys002InRecString with another Field
	 *	@param value
	 */
   public void setSys002InRecString(Field source) {
       replace(source,0,source.length(),beginSys002InRecString,SYS_002_IN_REC_STRING_LEN);
   	
   }  
   
     /**
	 * 	Update Sys002InRecString 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys002InRecString(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys002InRecString,SYS_002_IN_REC_STRING_LEN);
   	
   }
   
     /**
	 * 	Update Sys002InRecString 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys002InRecString(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys002InRecString+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys002InRecFieldLength() {
			return SYS_002_IN_REC_LENGTH;
		}

}
  
