package com.cloudframe.app.si994010.dto;

/**
*  The class BitMap1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BitMap1800 extends BitMap1800Serialized {
   

						private char[] bitMapByte1800 = new char[1];

						private char[] bitMapByte2800 = new char[1];

						private char[] bitMapByte3800 = new char[1];

						private char[] bitMapByte4800 = new char[1];

						private char[] bitMapByte5800 = new char[1];

						private char[] bitMapByte6800 = new char[1];

						private char[] bitMapByte7800 = new char[1];

						private char[] bitMapByte8800 = new char[1];
	
	/**
	* Constructor for BitMap1800
	**/
    public BitMap1800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBitMapByte1800(fillSpace(1));
								setBitMapByte2800(fillSpace(1));
								setBitMapByte3800(fillSpace(1));
								setBitMapByte4800(fillSpace(1));
								setBitMapByte5800(fillSpace(1));
								setBitMapByte6800(fillSpace(1));
								setBitMapByte7800(fillSpace(1));
								setBitMapByte8800(fillSpace(1));
    }


 

	/**
	 *	Returns the value of bitMapByte1800
	 *	@return bitMapByte1800
	 */
   public char[] getBitMapByte1800() throws CFException{
     if (isBitMapByte1800Modified()) { 
        bitMapByte1800 = refreshBitMapByte1800();
     }
   		return bitMapByte1800;
   }

  
	/**
	*  set variable bitMapByte1800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-1
	*  @param value
	**/
   public void setBitMapByte1800(char[] value) {
      bitMapByte1800 = checkBitMapByte1800Constraints(value);
      serializeBitMapByte1800(bitMapByte1800);
   } 

     /**
	 * 	Update BitMapByte1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte1800,bitMapByte1800.length);
   	
   }
   
   public void setBitMapByte1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte1800,bitMapByte1800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte1800 with another Field
	 *	@param value
	 */
   public void setBitMapByte1800(Field source) {
       replace(source,0,source.length(),beginBitMapByte1800,BIT_MAP_BYTE_1800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte1800,BIT_MAP_BYTE_1800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte1800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte2800
	 *	@return bitMapByte2800
	 */
   public char[] getBitMapByte2800() throws CFException{
     if (isBitMapByte2800Modified()) { 
        bitMapByte2800 = refreshBitMapByte2800();
     }
   		return bitMapByte2800;
   }

  
	/**
	*  set variable bitMapByte2800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-2
	*  @param value
	**/
   public void setBitMapByte2800(char[] value) {
      bitMapByte2800 = checkBitMapByte2800Constraints(value);
      serializeBitMapByte2800(bitMapByte2800);
   } 

     /**
	 * 	Update BitMapByte2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte2800,bitMapByte2800.length);
   	
   }
   
   public void setBitMapByte2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte2800,bitMapByte2800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte2800 with another Field
	 *	@param value
	 */
   public void setBitMapByte2800(Field source) {
       replace(source,0,source.length(),beginBitMapByte2800,BIT_MAP_BYTE_2800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte2800,BIT_MAP_BYTE_2800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte2800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte3800
	 *	@return bitMapByte3800
	 */
   public char[] getBitMapByte3800() throws CFException{
     if (isBitMapByte3800Modified()) { 
        bitMapByte3800 = refreshBitMapByte3800();
     }
   		return bitMapByte3800;
   }

  
	/**
	*  set variable bitMapByte3800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-3
	*  @param value
	**/
   public void setBitMapByte3800(char[] value) {
      bitMapByte3800 = checkBitMapByte3800Constraints(value);
      serializeBitMapByte3800(bitMapByte3800);
   } 

     /**
	 * 	Update BitMapByte3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte3800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte3800,bitMapByte3800.length);
   	
   }
   
   public void setBitMapByte3800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte3800,bitMapByte3800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte3800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte3800 with another Field
	 *	@param value
	 */
   public void setBitMapByte3800(Field source) {
       replace(source,0,source.length(),beginBitMapByte3800,BIT_MAP_BYTE_3800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte3800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte3800,BIT_MAP_BYTE_3800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte3800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte4800
	 *	@return bitMapByte4800
	 */
   public char[] getBitMapByte4800() throws CFException{
     if (isBitMapByte4800Modified()) { 
        bitMapByte4800 = refreshBitMapByte4800();
     }
   		return bitMapByte4800;
   }

  
	/**
	*  set variable bitMapByte4800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-4
	*  @param value
	**/
   public void setBitMapByte4800(char[] value) {
      bitMapByte4800 = checkBitMapByte4800Constraints(value);
      serializeBitMapByte4800(bitMapByte4800);
   } 

     /**
	 * 	Update BitMapByte4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte4800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte4800,bitMapByte4800.length);
   	
   }
   
   public void setBitMapByte4800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte4800,bitMapByte4800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte4800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte4800 with another Field
	 *	@param value
	 */
   public void setBitMapByte4800(Field source) {
       replace(source,0,source.length(),beginBitMapByte4800,BIT_MAP_BYTE_4800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte4800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte4800,BIT_MAP_BYTE_4800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte4800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte5800
	 *	@return bitMapByte5800
	 */
   public char[] getBitMapByte5800() throws CFException{
     if (isBitMapByte5800Modified()) { 
        bitMapByte5800 = refreshBitMapByte5800();
     }
   		return bitMapByte5800;
   }

  
	/**
	*  set variable bitMapByte5800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-5
	*  @param value
	**/
   public void setBitMapByte5800(char[] value) {
      bitMapByte5800 = checkBitMapByte5800Constraints(value);
      serializeBitMapByte5800(bitMapByte5800);
   } 

     /**
	 * 	Update BitMapByte5800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte5800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte5800,bitMapByte5800.length);
   	
   }
   
   public void setBitMapByte5800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte5800,bitMapByte5800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte5800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte5800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte5800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte5800 with another Field
	 *	@param value
	 */
   public void setBitMapByte5800(Field source) {
       replace(source,0,source.length(),beginBitMapByte5800,BIT_MAP_BYTE_5800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte5800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte5800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte5800,BIT_MAP_BYTE_5800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte5800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte5800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte5800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte6800
	 *	@return bitMapByte6800
	 */
   public char[] getBitMapByte6800() throws CFException{
     if (isBitMapByte6800Modified()) { 
        bitMapByte6800 = refreshBitMapByte6800();
     }
   		return bitMapByte6800;
   }

  
	/**
	*  set variable bitMapByte6800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-6
	*  @param value
	**/
   public void setBitMapByte6800(char[] value) {
      bitMapByte6800 = checkBitMapByte6800Constraints(value);
      serializeBitMapByte6800(bitMapByte6800);
   } 

     /**
	 * 	Update BitMapByte6800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte6800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte6800,bitMapByte6800.length);
   	
   }
   
   public void setBitMapByte6800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte6800,bitMapByte6800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte6800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte6800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte6800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte6800 with another Field
	 *	@param value
	 */
   public void setBitMapByte6800(Field source) {
       replace(source,0,source.length(),beginBitMapByte6800,BIT_MAP_BYTE_6800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte6800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte6800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte6800,BIT_MAP_BYTE_6800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte6800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte6800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte6800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte7800
	 *	@return bitMapByte7800
	 */
   public char[] getBitMapByte7800() throws CFException{
     if (isBitMapByte7800Modified()) { 
        bitMapByte7800 = refreshBitMapByte7800();
     }
   		return bitMapByte7800;
   }

  
	/**
	*  set variable bitMapByte7800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-7
	*  @param value
	**/
   public void setBitMapByte7800(char[] value) {
      bitMapByte7800 = checkBitMapByte7800Constraints(value);
      serializeBitMapByte7800(bitMapByte7800);
   } 

     /**
	 * 	Update BitMapByte7800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte7800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte7800,bitMapByte7800.length);
   	
   }
   
   public void setBitMapByte7800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte7800,bitMapByte7800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte7800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte7800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte7800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte7800 with another Field
	 *	@param value
	 */
   public void setBitMapByte7800(Field source) {
       replace(source,0,source.length(),beginBitMapByte7800,BIT_MAP_BYTE_7800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte7800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte7800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte7800,BIT_MAP_BYTE_7800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte7800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte7800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte7800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte8800
	 *	@return bitMapByte8800
	 */
   public char[] getBitMapByte8800() throws CFException{
     if (isBitMapByte8800Modified()) { 
        bitMapByte8800 = refreshBitMapByte8800();
     }
   		return bitMapByte8800;
   }

  
	/**
	*  set variable bitMapByte8800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-8
	*  @param value
	**/
   public void setBitMapByte8800(char[] value) {
      bitMapByte8800 = checkBitMapByte8800Constraints(value);
      serializeBitMapByte8800(bitMapByte8800);
   } 

     /**
	 * 	Update BitMapByte8800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte8800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte8800,bitMapByte8800.length);
   	
   }
   
   public void setBitMapByte8800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte8800,bitMapByte8800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte8800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte8800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte8800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte8800 with another Field
	 *	@param value
	 */
   public void setBitMapByte8800(Field source) {
       replace(source,0,source.length(),beginBitMapByte8800,BIT_MAP_BYTE_8800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte8800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte8800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte8800,BIT_MAP_BYTE_8800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte8800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte8800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte8800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBitMap1800FieldLength() {
			return BIT_MAP_1800_LENGTH;
		}

}
  
