package com.cloudframe.app.mcvsam2.file.records;

/**
*  The class Sys001KeyAll is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcvsam2.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001KeyAll extends Sys001KeyAllSerialized { 
   

						private char[] sys001Key = Field.fillLowValue(31);
	
	/**
	* Constructor for Sys001KeyAll
	**/
    public Sys001KeyAll() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys001KeyAll. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001KeyAll(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys001Key
	 *	@return sys001Key
	 */
   public char[] getSys001Key() throws CFException{
     if (isSys001KeyModified()) { 
        sys001Key = refreshSys001Key();
     }
   		return sys001Key;
   }

  
	/**
	*  set variable sys001Key
	*  Corresponding COBOL Variable is SYS001-KEY
	*  @param value
	**/
   public void setSys001Key(char[] value) {
      sys001Key = checkSys001KeyConstraints(value);
      serializeSys001Key(sys001Key);
   } 

     /**
	 * 	Update Sys001Key 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Key(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001Key,sys001Key.length);
   	
   }
   
   public void setSys001Key(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Key,sys001Key.length);
   	
   }
   
     /**
	 * 	Update Sys001Key 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Key(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Key+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001Key with another Field
	 *	@param value
	 */
   public void setSys001Key(Field source) {
       replace(source,0,source.length(),beginSys001Key,SYS_001_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001Key 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Key(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001Key,SYS_001_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sys001Key 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Key(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001Key+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001KeyAllFieldLength() {
			return SYS_001_KEY_ALL_LENGTH;
		}

}
  
