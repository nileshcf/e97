package com.cloudframe.app.mc155.file.records;

/**
*  The class Sys109UniqueFileIdRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
**/


import com.cloudframe.app.mc155.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys109UniqueFileIdRec extends Sys109UniqueFileIdRecSerialized { 
   

						private char[] sys109FileIdKey = Field.fillLowValue(21);
	
	/**
	* Constructor for Sys109UniqueFileIdRec
	**/
    public Sys109UniqueFileIdRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys109UniqueFileIdRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys109UniqueFileIdRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys109FileIdKey
	 *	@return sys109FileIdKey
	 */
   public char[] getSys109FileIdKey() throws CFException{
     if (isSys109FileIdKeyModified()) { 
        sys109FileIdKey = refreshSys109FileIdKey();
     }
   		return sys109FileIdKey;
   }

  
	/**
	*  set variable sys109FileIdKey
	*  Corresponding COBOL Variable is SYS109-FILE-ID-KEY
	*  @param value
	**/
   public void setSys109FileIdKey(char[] value) {
      sys109FileIdKey = checkSys109FileIdKeyConstraints(value);
      serializeSys109FileIdKey(sys109FileIdKey);
   } 

     /**
	 * 	Update Sys109FileIdKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys109FileIdKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys109FileIdKey,sys109FileIdKey.length);
   	
   }
   
   public void setSys109FileIdKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys109FileIdKey,sys109FileIdKey.length);
   	
   }
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109FileIdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys109FileIdKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys109FileIdKey with another Field
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source) {
       replace(source,0,source.length(),beginSys109FileIdKey,SYS_109_FILE_ID_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys109FileIdKey,SYS_109_FILE_ID_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sys109FileIdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109FileIdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys109FileIdKey+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys109UniqueFileIdRecFieldLength() {
			return SYS_109_UNIQUE_FILE_ID_REC_LENGTH;
		}

}
  
