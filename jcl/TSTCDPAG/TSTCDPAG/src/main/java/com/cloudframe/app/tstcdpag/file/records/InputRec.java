package com.cloudframe.app.tstcdpag.file.records;

/**
*  The class InputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.tstcdpag.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputRec extends InputRecSerialized { 
   

						private char[] inputByte = Field.fillLowValue(1);
	
	/**
	* Constructor for InputRec
	**/
    public InputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inputByte
	 *	@return inputByte
	 */
   public char[] getInputByte() throws CFException{
     if (isInputByteModified()) { 
        inputByte = refreshInputByte();
     }
   		return inputByte;
   }

  
	/**
	*  set variable inputByte
	*  Corresponding COBOL Variable is INPUT-BYTE
	*  @param value
	**/
   public void setInputByte(char[] value) {
      inputByte = checkInputByteConstraints(value);
      serializeInputByte(inputByte);
   } 

     /**
	 * 	Update InputByte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputByte(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputByte,inputByte.length);
   	
   }
   
   public void setInputByte(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputByte,inputByte.length);
   	
   }
   
     /**
	 * 	Update InputByte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputByte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputByte+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputByte with another Field
	 *	@param value
	 */
   public void setInputByte(Field source) {
       replace(source,0,source.length(),beginInputByte,INPUT_BYTE_LEN);
   	
   }  
   
     /**
	 * 	Update InputByte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputByte(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputByte,INPUT_BYTE_LEN);
   	
   }
   
     /**
	 * 	Update InputByte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputByte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputByte+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInputRecFieldLength() {
			return INPUT_REC_LENGTH;
		}

}
  
