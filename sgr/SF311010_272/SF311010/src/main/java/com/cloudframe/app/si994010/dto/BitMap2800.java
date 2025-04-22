package com.cloudframe.app.si994010.dto;

/**
*  The class BitMap2800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BitMap2800 extends BitMap2800Serialized {
   

						private char[] bitMapByte9800 = new char[1];

						private char[] bitMapByte10800 = new char[1];

						private char[] bitMapByte11800 = new char[1];

						private char[] bitMapByte12800 = new char[1];

						private char[] bitMapByte13800 = new char[1];

						private char[] bitMapByte14800 = new char[1];

						private char[] bitMapByte15800 = new char[1];

						private char[] bitMapByte16800 = new char[1];
	
	/**
	* Constructor for BitMap2800
	**/
    public BitMap2800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBitMapByte9800(fillSpace(1));
								setBitMapByte10800(fillSpace(1));
								setBitMapByte11800(fillSpace(1));
								setBitMapByte12800(fillSpace(1));
								setBitMapByte13800(fillSpace(1));
								setBitMapByte14800(fillSpace(1));
								setBitMapByte15800(fillSpace(1));
								setBitMapByte16800(fillSpace(1));
    }


 

	/**
	 *	Returns the value of bitMapByte9800
	 *	@return bitMapByte9800
	 */
   public char[] getBitMapByte9800() throws CFException{
     if (isBitMapByte9800Modified()) { 
        bitMapByte9800 = refreshBitMapByte9800();
     }
   		return bitMapByte9800;
   }

  
	/**
	*  set variable bitMapByte9800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-9
	*  @param value
	**/
   public void setBitMapByte9800(char[] value) {
      bitMapByte9800 = checkBitMapByte9800Constraints(value);
      serializeBitMapByte9800(bitMapByte9800);
   } 

     /**
	 * 	Update BitMapByte9800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte9800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte9800,bitMapByte9800.length);
   	
   }
   
   public void setBitMapByte9800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte9800,bitMapByte9800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte9800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte9800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte9800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte9800 with another Field
	 *	@param value
	 */
   public void setBitMapByte9800(Field source) {
       replace(source,0,source.length(),beginBitMapByte9800,BIT_MAP_BYTE_9800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte9800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte9800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte9800,BIT_MAP_BYTE_9800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte9800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte9800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte9800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte10800
	 *	@return bitMapByte10800
	 */
   public char[] getBitMapByte10800() throws CFException{
     if (isBitMapByte10800Modified()) { 
        bitMapByte10800 = refreshBitMapByte10800();
     }
   		return bitMapByte10800;
   }

  
	/**
	*  set variable bitMapByte10800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-10
	*  @param value
	**/
   public void setBitMapByte10800(char[] value) {
      bitMapByte10800 = checkBitMapByte10800Constraints(value);
      serializeBitMapByte10800(bitMapByte10800);
   } 

     /**
	 * 	Update BitMapByte10800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte10800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte10800,bitMapByte10800.length);
   	
   }
   
   public void setBitMapByte10800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte10800,bitMapByte10800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte10800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte10800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte10800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte10800 with another Field
	 *	@param value
	 */
   public void setBitMapByte10800(Field source) {
       replace(source,0,source.length(),beginBitMapByte10800,BIT_MAP_BYTE_10800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte10800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte10800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte10800,BIT_MAP_BYTE_10800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte10800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte10800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte10800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte11800
	 *	@return bitMapByte11800
	 */
   public char[] getBitMapByte11800() throws CFException{
     if (isBitMapByte11800Modified()) { 
        bitMapByte11800 = refreshBitMapByte11800();
     }
   		return bitMapByte11800;
   }

  
	/**
	*  set variable bitMapByte11800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-11
	*  @param value
	**/
   public void setBitMapByte11800(char[] value) {
      bitMapByte11800 = checkBitMapByte11800Constraints(value);
      serializeBitMapByte11800(bitMapByte11800);
   } 

     /**
	 * 	Update BitMapByte11800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte11800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte11800,bitMapByte11800.length);
   	
   }
   
   public void setBitMapByte11800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte11800,bitMapByte11800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte11800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte11800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte11800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte11800 with another Field
	 *	@param value
	 */
   public void setBitMapByte11800(Field source) {
       replace(source,0,source.length(),beginBitMapByte11800,BIT_MAP_BYTE_11800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte11800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte11800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte11800,BIT_MAP_BYTE_11800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte11800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte11800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte11800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte12800
	 *	@return bitMapByte12800
	 */
   public char[] getBitMapByte12800() throws CFException{
     if (isBitMapByte12800Modified()) { 
        bitMapByte12800 = refreshBitMapByte12800();
     }
   		return bitMapByte12800;
   }

  
	/**
	*  set variable bitMapByte12800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-12
	*  @param value
	**/
   public void setBitMapByte12800(char[] value) {
      bitMapByte12800 = checkBitMapByte12800Constraints(value);
      serializeBitMapByte12800(bitMapByte12800);
   } 

     /**
	 * 	Update BitMapByte12800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte12800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte12800,bitMapByte12800.length);
   	
   }
   
   public void setBitMapByte12800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte12800,bitMapByte12800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte12800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte12800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte12800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte12800 with another Field
	 *	@param value
	 */
   public void setBitMapByte12800(Field source) {
       replace(source,0,source.length(),beginBitMapByte12800,BIT_MAP_BYTE_12800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte12800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte12800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte12800,BIT_MAP_BYTE_12800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte12800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte12800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte12800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte13800
	 *	@return bitMapByte13800
	 */
   public char[] getBitMapByte13800() throws CFException{
     if (isBitMapByte13800Modified()) { 
        bitMapByte13800 = refreshBitMapByte13800();
     }
   		return bitMapByte13800;
   }

  
	/**
	*  set variable bitMapByte13800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-13
	*  @param value
	**/
   public void setBitMapByte13800(char[] value) {
      bitMapByte13800 = checkBitMapByte13800Constraints(value);
      serializeBitMapByte13800(bitMapByte13800);
   } 

     /**
	 * 	Update BitMapByte13800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte13800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte13800,bitMapByte13800.length);
   	
   }
   
   public void setBitMapByte13800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte13800,bitMapByte13800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte13800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte13800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte13800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte13800 with another Field
	 *	@param value
	 */
   public void setBitMapByte13800(Field source) {
       replace(source,0,source.length(),beginBitMapByte13800,BIT_MAP_BYTE_13800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte13800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte13800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte13800,BIT_MAP_BYTE_13800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte13800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte13800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte13800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte14800
	 *	@return bitMapByte14800
	 */
   public char[] getBitMapByte14800() throws CFException{
     if (isBitMapByte14800Modified()) { 
        bitMapByte14800 = refreshBitMapByte14800();
     }
   		return bitMapByte14800;
   }

  
	/**
	*  set variable bitMapByte14800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-14
	*  @param value
	**/
   public void setBitMapByte14800(char[] value) {
      bitMapByte14800 = checkBitMapByte14800Constraints(value);
      serializeBitMapByte14800(bitMapByte14800);
   } 

     /**
	 * 	Update BitMapByte14800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte14800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte14800,bitMapByte14800.length);
   	
   }
   
   public void setBitMapByte14800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte14800,bitMapByte14800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte14800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte14800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte14800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte14800 with another Field
	 *	@param value
	 */
   public void setBitMapByte14800(Field source) {
       replace(source,0,source.length(),beginBitMapByte14800,BIT_MAP_BYTE_14800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte14800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte14800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte14800,BIT_MAP_BYTE_14800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte14800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte14800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte14800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte15800
	 *	@return bitMapByte15800
	 */
   public char[] getBitMapByte15800() throws CFException{
     if (isBitMapByte15800Modified()) { 
        bitMapByte15800 = refreshBitMapByte15800();
     }
   		return bitMapByte15800;
   }

  
	/**
	*  set variable bitMapByte15800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-15
	*  @param value
	**/
   public void setBitMapByte15800(char[] value) {
      bitMapByte15800 = checkBitMapByte15800Constraints(value);
      serializeBitMapByte15800(bitMapByte15800);
   } 

     /**
	 * 	Update BitMapByte15800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte15800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte15800,bitMapByte15800.length);
   	
   }
   
   public void setBitMapByte15800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte15800,bitMapByte15800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte15800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte15800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte15800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte15800 with another Field
	 *	@param value
	 */
   public void setBitMapByte15800(Field source) {
       replace(source,0,source.length(),beginBitMapByte15800,BIT_MAP_BYTE_15800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte15800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte15800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte15800,BIT_MAP_BYTE_15800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte15800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte15800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte15800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitMapByte16800
	 *	@return bitMapByte16800
	 */
   public char[] getBitMapByte16800() throws CFException{
     if (isBitMapByte16800Modified()) { 
        bitMapByte16800 = refreshBitMapByte16800();
     }
   		return bitMapByte16800;
   }

  
	/**
	*  set variable bitMapByte16800
	*  Corresponding COBOL Variable is 800-BIT-MAP-BYTE-16
	*  @param value
	**/
   public void setBitMapByte16800(char[] value) {
      bitMapByte16800 = checkBitMapByte16800Constraints(value);
      serializeBitMapByte16800(bitMapByte16800);
   } 

     /**
	 * 	Update BitMapByte16800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte16800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitMapByte16800,bitMapByte16800.length);
   	
   }
   
   public void setBitMapByte16800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte16800,bitMapByte16800.length);
   	
   }
   
     /**
	 * 	Update BitMapByte16800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte16800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte16800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitMapByte16800 with another Field
	 *	@param value
	 */
   public void setBitMapByte16800(Field source) {
       replace(source,0,source.length(),beginBitMapByte16800,BIT_MAP_BYTE_16800_LEN);
   	
   }  
   
     /**
	 * 	Update BitMapByte16800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte16800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitMapByte16800,BIT_MAP_BYTE_16800_LEN);
   	
   }
   
     /**
	 * 	Update BitMapByte16800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte16800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitMapByte16800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBitMap2800FieldLength() {
			return BIT_MAP_2800_LENGTH;
		}

}
  
