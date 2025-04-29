package com.cloudframe.app.blkdblk.dto;

/**
*  The class AsciiBytes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:39. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsciiBytes extends AsciiBytesSerialized { 
   

						private char[] nullByte = Field.fillLowValue(1);

						private char[] asciiChar = Field.fillLowValue(1);
	
	/**
	* Constructor for AsciiBytes
	**/
    public AsciiBytes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AsciiBytes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiBytes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of nullByte
	 *	@return nullByte
	 */
   public char[] getNullByte() throws CFException{
     if (isNullByteModified()) { 
        nullByte = refreshNullByte();
     }
   		return nullByte;
   }

  
	/**
	*  set variable nullByte
	*  Corresponding COBOL Variable is NULL-BYTE
	*  @param value
	**/
   public void setNullByte(char[] value) {
      nullByte = checkNullByteConstraints(value);
      serializeNullByte(nullByte);
   } 

     /**
	 * 	Update NullByte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNullByte(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNullByte,nullByte.length);
   	
   }
   
   public void setNullByte(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNullByte,nullByte.length);
   	
   }
   
     /**
	 * 	Update NullByte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNullByte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNullByte+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NullByte with another Field
	 *	@param value
	 */
   public void setNullByte(Field source) {
       replace(source,0,source.length(),beginNullByte,NULL_BYTE_LEN);
   	
   }  
   
     /**
	 * 	Update NullByte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNullByte(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNullByte,NULL_BYTE_LEN);
   	
   }
   
     /**
	 * 	Update NullByte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNullByte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNullByte+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of asciiChar
	 *	@return asciiChar
	 */
   public char[] getAsciiChar() throws CFException{
     if (isAsciiCharModified()) { 
        asciiChar = refreshAsciiChar();
     }
   		return asciiChar;
   }

  
	/**
	*  set variable asciiChar
	*  Corresponding COBOL Variable is ASCII-CHAR
	*  @param value
	**/
   public void setAsciiChar(char[] value) {
      asciiChar = checkAsciiCharConstraints(value);
      serializeAsciiChar(asciiChar);
   } 

     /**
	 * 	Update AsciiChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAsciiChar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAsciiChar,asciiChar.length);
   	
   }
   
   public void setAsciiChar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAsciiChar,asciiChar.length);
   	
   }
   
     /**
	 * 	Update AsciiChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsciiChar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AsciiChar with another Field
	 *	@param value
	 */
   public void setAsciiChar(Field source) {
       replace(source,0,source.length(),beginAsciiChar,ASCII_CHAR_LEN);
   	
   }  
   
     /**
	 * 	Update AsciiChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAsciiChar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAsciiChar,ASCII_CHAR_LEN);
   	
   }
   
     /**
	 * 	Update AsciiChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAsciiChar+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAsciiBytesFieldLength() {
			return ASCII_BYTES_LENGTH;
		}

}
  
