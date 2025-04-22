package com.cloudframe.app.blkdblk.dto;

/**
*  The class EbcdicBytes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.blkdblk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EbcdicBytes extends EbcdicBytesSerialized { 
   

						private char[] nullByte01 = Field.fillLowValue(1);

						private char[] ebcdicChar = Field.fillLowValue(1);
	
	/**
	* Constructor for EbcdicBytes
	**/
    public EbcdicBytes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EbcdicBytes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EbcdicBytes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of nullByte01
	 *	@return nullByte01
	 */
   public char[] getNullByte01() throws CFException{
     if (isNullByte01Modified()) { 
        nullByte01 = refreshNullByte01();
     }
   		return nullByte01;
   }

  
	/**
	*  set variable nullByte01
	*  Corresponding COBOL Variable is NULL-BYTE
	*  @param value
	**/
   public void setNullByte01(char[] value) {
      nullByte01 = checkNullByte01Constraints(value);
      serializeNullByte01(nullByte01);
   } 

     /**
	 * 	Update NullByte01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNullByte01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNullByte01,nullByte01.length);
   	
   }
   
   public void setNullByte01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNullByte01,nullByte01.length);
   	
   }
   
     /**
	 * 	Update NullByte01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNullByte01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNullByte01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NullByte01 with another Field
	 *	@param value
	 */
   public void setNullByte01(Field source) {
       replace(source,0,source.length(),beginNullByte01,NULL_BYTE_01_LEN);
   	
   }  
   
     /**
	 * 	Update NullByte01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNullByte01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNullByte01,NULL_BYTE_01_LEN);
   	
   }
   
     /**
	 * 	Update NullByte01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNullByte01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNullByte01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ebcdicChar
	 *	@return ebcdicChar
	 */
   public char[] getEbcdicChar() throws CFException{
     if (isEbcdicCharModified()) { 
        ebcdicChar = refreshEbcdicChar();
     }
   		return ebcdicChar;
   }

  
	/**
	*  set variable ebcdicChar
	*  Corresponding COBOL Variable is EBCDIC-CHAR
	*  @param value
	**/
   public void setEbcdicChar(char[] value) {
      ebcdicChar = checkEbcdicCharConstraints(value);
      serializeEbcdicChar(ebcdicChar);
   } 

     /**
	 * 	Update EbcdicChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEbcdicChar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEbcdicChar,ebcdicChar.length);
   	
   }
   
   public void setEbcdicChar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEbcdicChar,ebcdicChar.length);
   	
   }
   
     /**
	 * 	Update EbcdicChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEbcdicChar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EbcdicChar with another Field
	 *	@param value
	 */
   public void setEbcdicChar(Field source) {
       replace(source,0,source.length(),beginEbcdicChar,EBCDIC_CHAR_LEN);
   	
   }  
   
     /**
	 * 	Update EbcdicChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEbcdicChar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEbcdicChar,EBCDIC_CHAR_LEN);
   	
   }
   
     /**
	 * 	Update EbcdicChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEbcdicChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEbcdicChar+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEbcdicBytesFieldLength() {
			return EBCDIC_BYTES_LENGTH;
		}

}
  
