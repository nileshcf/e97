package com.cloudframe.app.ip650010.file.records;

/**
*  The class Sys007TableKeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip650010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys007TableKeyAll extends Sys007TableKeyAllSerialized { 
   

						private char[] sys007TableKey = Field.fillLowValue(18);
	
	/**
	* Constructor for Sys007TableKeyAll
	**/
    public Sys007TableKeyAll() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys007TableKeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys007TableKeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys007TableKey
	 *	@return sys007TableKey
	 */
   public char[] getSys007TableKey() throws CFException{
     if (isSys007TableKeyModified()) { 
        sys007TableKey = refreshSys007TableKey();
     }
   		return sys007TableKey;
   }

  
	/**
	*  set variable sys007TableKey
	*  Corresponding COBOL Variable is SYS007-TABLE-KEY
	*  @param value
	**/
   public void setSys007TableKey(char[] value) {
      sys007TableKey = checkSys007TableKeyConstraints(value);
      serializeSys007TableKey(sys007TableKey);
   } 

     /**
	 * 	Update Sys007TableKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys007TableKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys007TableKey,sys007TableKey.length);
   	
   }
   
   public void setSys007TableKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys007TableKey,sys007TableKey.length);
   	
   }
   
     /**
	 * 	Update Sys007TableKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys007TableKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys007TableKey with another Field
	 *	@param value
	 */
   public void setSys007TableKey(Field source) {
       replace(source,0,source.length(),beginSys007TableKey,SYS_007_TABLE_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sys007TableKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys007TableKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys007TableKey,SYS_007_TABLE_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sys007TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys007TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys007TableKey+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys007TableKeyAllFieldLength() {
			return SYS_007_TABLE_KEY_ALL_LENGTH;
		}

}
  
