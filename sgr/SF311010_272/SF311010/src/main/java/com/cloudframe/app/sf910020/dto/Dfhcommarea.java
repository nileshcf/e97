package com.cloudframe.app.sf910020.dto;

/**
*  The class Dfhcommarea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf910020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dfhcommarea extends DfhcommareaSerialized {
   

						private char[] bytePassed2000 = new char[1];

						private char[] bitValue02000 = new char[1];

						private char[] bitValue12000 = new char[1];

						private char[] bitValue22000 = new char[1];

						private char[] bitValue32000 = new char[1];

						private char[] bitValue42000 = new char[1];

						private char[] bitValue52000 = new char[1];

						private char[] bitValue62000 = new char[1];

						private char[] bitValue72000 = new char[1];
	
	/**
	* Constructor for Dfhcommarea
	**/
    public Dfhcommarea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBytePassed2000(fillSpace(1));
								setBitValue02000(("0").toCharArray());
								setBitValue12000(("0").toCharArray());
								setBitValue22000(("0").toCharArray());
								setBitValue32000(("0").toCharArray());
								setBitValue42000(("0").toCharArray());
								setBitValue52000(("0").toCharArray());
								setBitValue62000(("0").toCharArray());
								setBitValue72000(("0").toCharArray());
    }


 

	/**
	 *	Returns the value of bytePassed2000
	 *	@return bytePassed2000
	 */
   public char[] getBytePassed2000() throws CFException{
     if (isBytePassed2000Modified()) { 
        bytePassed2000 = refreshBytePassed2000();
     }
   		return bytePassed2000;
   }

  
	/**
	*  set variable bytePassed2000
	*  Corresponding COBOL Variable is 2000-BYTE-PASSED
	*  @param value
	**/
   public void setBytePassed2000(char[] value) {
      bytePassed2000 = checkBytePassed2000Constraints(value);
      serializeBytePassed2000(bytePassed2000);
   } 

     /**
	 * 	Update BytePassed2000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytePassed2000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBytePassed2000,bytePassed2000.length);
   	
   }
   
   public void setBytePassed2000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBytePassed2000,bytePassed2000.length);
   	
   }
   
     /**
	 * 	Update BytePassed2000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytePassed2000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytePassed2000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BytePassed2000 with another Field
	 *	@param value
	 */
   public void setBytePassed2000(Field source) {
       replace(source,0,source.length(),beginBytePassed2000,BYTE_PASSED_2000_LEN);
   	
   }  
   
     /**
	 * 	Update BytePassed2000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytePassed2000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBytePassed2000,BYTE_PASSED_2000_LEN);
   	
   }
   
     /**
	 * 	Update BytePassed2000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytePassed2000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBytePassed2000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue02000
	 *	@return bitValue02000
	 */
   public char[] getBitValue02000() throws CFException{
     if (isBitValue02000Modified()) { 
        bitValue02000 = refreshBitValue02000();
     }
   		return bitValue02000;
   }

  
	/**
	*  set variable bitValue02000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-0
	*  @param value
	**/
   public void setBitValue02000(char[] value) {
      bitValue02000 = checkBitValue02000Constraints(value);
      serializeBitValue02000(bitValue02000);
   } 

     /**
	 * 	Update BitValue02000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue02000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue02000,bitValue02000.length);
   	
   }
   
   public void setBitValue02000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue02000,bitValue02000.length);
   	
   }
   
     /**
	 * 	Update BitValue02000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue02000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue02000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue02000 with another Field
	 *	@param value
	 */
   public void setBitValue02000(Field source) {
       replace(source,0,source.length(),beginBitValue02000,BIT_VALUE_02000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue02000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue02000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue02000,BIT_VALUE_02000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue02000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue02000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue02000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue12000
	 *	@return bitValue12000
	 */
   public char[] getBitValue12000() throws CFException{
     if (isBitValue12000Modified()) { 
        bitValue12000 = refreshBitValue12000();
     }
   		return bitValue12000;
   }

  
	/**
	*  set variable bitValue12000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-1
	*  @param value
	**/
   public void setBitValue12000(char[] value) {
      bitValue12000 = checkBitValue12000Constraints(value);
      serializeBitValue12000(bitValue12000);
   } 

     /**
	 * 	Update BitValue12000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue12000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue12000,bitValue12000.length);
   	
   }
   
   public void setBitValue12000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue12000,bitValue12000.length);
   	
   }
   
     /**
	 * 	Update BitValue12000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue12000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue12000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue12000 with another Field
	 *	@param value
	 */
   public void setBitValue12000(Field source) {
       replace(source,0,source.length(),beginBitValue12000,BIT_VALUE_12000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue12000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue12000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue12000,BIT_VALUE_12000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue12000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue12000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue12000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue22000
	 *	@return bitValue22000
	 */
   public char[] getBitValue22000() throws CFException{
     if (isBitValue22000Modified()) { 
        bitValue22000 = refreshBitValue22000();
     }
   		return bitValue22000;
   }

  
	/**
	*  set variable bitValue22000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-2
	*  @param value
	**/
   public void setBitValue22000(char[] value) {
      bitValue22000 = checkBitValue22000Constraints(value);
      serializeBitValue22000(bitValue22000);
   } 

     /**
	 * 	Update BitValue22000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue22000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue22000,bitValue22000.length);
   	
   }
   
   public void setBitValue22000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue22000,bitValue22000.length);
   	
   }
   
     /**
	 * 	Update BitValue22000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue22000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue22000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue22000 with another Field
	 *	@param value
	 */
   public void setBitValue22000(Field source) {
       replace(source,0,source.length(),beginBitValue22000,BIT_VALUE_22000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue22000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue22000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue22000,BIT_VALUE_22000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue22000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue22000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue22000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue32000
	 *	@return bitValue32000
	 */
   public char[] getBitValue32000() throws CFException{
     if (isBitValue32000Modified()) { 
        bitValue32000 = refreshBitValue32000();
     }
   		return bitValue32000;
   }

  
	/**
	*  set variable bitValue32000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-3
	*  @param value
	**/
   public void setBitValue32000(char[] value) {
      bitValue32000 = checkBitValue32000Constraints(value);
      serializeBitValue32000(bitValue32000);
   } 

     /**
	 * 	Update BitValue32000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue32000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue32000,bitValue32000.length);
   	
   }
   
   public void setBitValue32000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue32000,bitValue32000.length);
   	
   }
   
     /**
	 * 	Update BitValue32000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue32000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue32000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue32000 with another Field
	 *	@param value
	 */
   public void setBitValue32000(Field source) {
       replace(source,0,source.length(),beginBitValue32000,BIT_VALUE_32000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue32000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue32000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue32000,BIT_VALUE_32000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue32000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue32000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue32000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue42000
	 *	@return bitValue42000
	 */
   public char[] getBitValue42000() throws CFException{
     if (isBitValue42000Modified()) { 
        bitValue42000 = refreshBitValue42000();
     }
   		return bitValue42000;
   }

  
	/**
	*  set variable bitValue42000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-4
	*  @param value
	**/
   public void setBitValue42000(char[] value) {
      bitValue42000 = checkBitValue42000Constraints(value);
      serializeBitValue42000(bitValue42000);
   } 

     /**
	 * 	Update BitValue42000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue42000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue42000,bitValue42000.length);
   	
   }
   
   public void setBitValue42000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue42000,bitValue42000.length);
   	
   }
   
     /**
	 * 	Update BitValue42000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue42000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue42000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue42000 with another Field
	 *	@param value
	 */
   public void setBitValue42000(Field source) {
       replace(source,0,source.length(),beginBitValue42000,BIT_VALUE_42000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue42000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue42000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue42000,BIT_VALUE_42000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue42000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue42000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue42000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue52000
	 *	@return bitValue52000
	 */
   public char[] getBitValue52000() throws CFException{
     if (isBitValue52000Modified()) { 
        bitValue52000 = refreshBitValue52000();
     }
   		return bitValue52000;
   }

  
	/**
	*  set variable bitValue52000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-5
	*  @param value
	**/
   public void setBitValue52000(char[] value) {
      bitValue52000 = checkBitValue52000Constraints(value);
      serializeBitValue52000(bitValue52000);
   } 

     /**
	 * 	Update BitValue52000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue52000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue52000,bitValue52000.length);
   	
   }
   
   public void setBitValue52000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue52000,bitValue52000.length);
   	
   }
   
     /**
	 * 	Update BitValue52000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue52000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue52000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue52000 with another Field
	 *	@param value
	 */
   public void setBitValue52000(Field source) {
       replace(source,0,source.length(),beginBitValue52000,BIT_VALUE_52000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue52000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue52000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue52000,BIT_VALUE_52000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue52000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue52000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue52000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue62000
	 *	@return bitValue62000
	 */
   public char[] getBitValue62000() throws CFException{
     if (isBitValue62000Modified()) { 
        bitValue62000 = refreshBitValue62000();
     }
   		return bitValue62000;
   }

  
	/**
	*  set variable bitValue62000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-6
	*  @param value
	**/
   public void setBitValue62000(char[] value) {
      bitValue62000 = checkBitValue62000Constraints(value);
      serializeBitValue62000(bitValue62000);
   } 

     /**
	 * 	Update BitValue62000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue62000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue62000,bitValue62000.length);
   	
   }
   
   public void setBitValue62000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue62000,bitValue62000.length);
   	
   }
   
     /**
	 * 	Update BitValue62000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue62000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue62000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue62000 with another Field
	 *	@param value
	 */
   public void setBitValue62000(Field source) {
       replace(source,0,source.length(),beginBitValue62000,BIT_VALUE_62000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue62000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue62000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue62000,BIT_VALUE_62000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue62000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue62000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue62000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bitValue72000
	 *	@return bitValue72000
	 */
   public char[] getBitValue72000() throws CFException{
     if (isBitValue72000Modified()) { 
        bitValue72000 = refreshBitValue72000();
     }
   		return bitValue72000;
   }

  
	/**
	*  set variable bitValue72000
	*  Corresponding COBOL Variable is 2000-BIT-VALUE-7
	*  @param value
	**/
   public void setBitValue72000(char[] value) {
      bitValue72000 = checkBitValue72000Constraints(value);
      serializeBitValue72000(bitValue72000);
   } 

     /**
	 * 	Update BitValue72000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue72000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBitValue72000,bitValue72000.length);
   	
   }
   
   public void setBitValue72000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue72000,bitValue72000.length);
   	
   }
   
     /**
	 * 	Update BitValue72000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue72000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue72000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BitValue72000 with another Field
	 *	@param value
	 */
   public void setBitValue72000(Field source) {
       replace(source,0,source.length(),beginBitValue72000,BIT_VALUE_72000_LEN);
   	
   }  
   
     /**
	 * 	Update BitValue72000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue72000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBitValue72000,BIT_VALUE_72000_LEN);
   	
   }
   
     /**
	 * 	Update BitValue72000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue72000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBitValue72000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDfhcommareaFieldLength() {
			return DFHCOMMAREA_LENGTH;
		}

}
  
