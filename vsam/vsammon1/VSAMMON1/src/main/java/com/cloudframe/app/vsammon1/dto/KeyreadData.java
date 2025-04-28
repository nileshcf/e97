package com.cloudframe.app.vsammon1.dto;

/**
*  The class KeyreadData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyreadData extends KeyreadDataSerialized { 
   

						private char[] iKeyread = Field.fillLowValue(65);
	
	/**
	* Constructor for KeyreadData
	**/
    public KeyreadData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyreadData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyreadData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iKeyread
	 *	@return iKeyread
	 */
   public char[] getIKeyread() throws CFException{
     if (isIKeyreadModified()) { 
        iKeyread = refreshIKeyread();
     }
   		return iKeyread;
   }

  
	/**
	*  set variable iKeyread
	*  Corresponding COBOL Variable is WS-I-KEYREAD
	*  @param value
	**/
   public void setIKeyread(char[] value) {
      iKeyread = checkIKeyreadConstraints(value);
      serializeIKeyread(iKeyread);
   } 

     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIKeyread,iKeyread.length);
   	
   }
   
   public void setIKeyread(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIKeyread,iKeyread.length);
   	
   }
   
     /**
	 * 	Update IKeyread 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIKeyread+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IKeyread with another Field
	 *	@param value
	 */
   public void setIKeyread(Field source) {
       replace(source,0,source.length(),beginIKeyread,I_KEYREAD_LEN);
   	
   }  
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIKeyread,I_KEYREAD_LEN);
   	
   }
   
     /**
	 * 	Update IKeyread 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIKeyread(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIKeyread+targetIndex,targetLen);
    
   }

	
	
	

		public static int getKeyreadDataFieldLength() {
			return KEYREAD_DATA_LENGTH;
		}

}
  
