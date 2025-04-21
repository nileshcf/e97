package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpMpDetail5 extends RpMpDetail5Serialized {
   

						private char[] rpMpCc5 = new char[1];


								private char[] rpMpIpq8 = Field.fillLowValue(4);


								private char[] rpMpIpq9 = Field.fillLowValue(4);


								private char[] rpMpIpq10 = Field.fillLowValue(4);


								private char[] rpMpIpq11 = Field.fillLowValue(4);


								private char[] rpMpIpq12 = Field.fillLowValue(4);


								private char[] rpMpIpq13 = Field.fillLowValue(4);


								private char[] rpMpIpq14 = Field.fillLowValue(4);

	
	/**
	* Constructor for RpMpDetail5
	**/
    public RpMpDetail5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc5(fillSpace(1));
       replaceValue( // serialize and save the value
             (" IPQ8 - ").toCharArray()
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("   IPQ9 - ").toCharArray()
             , getStartOffset() + 13
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ10 - ").toCharArray()
             , getStartOffset() + 27
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ11 - ").toCharArray()
             , getStartOffset() + 41
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ12 - ").toCharArray()
             , getStartOffset() + 55
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ13 - ").toCharArray()
             , getStartOffset() + 69
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ14 - ").toCharArray()
             , getStartOffset() + 83
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 97
             ,36
             );
    }


 

	/**
	 *	Returns the value of rpMpCc5
	 *	@return rpMpCc5
	 */
   public char[] getRpMpCc5() throws CFException{
     if (isRpMpCc5Modified()) { 
        rpMpCc5 = refreshRpMpCc5();
     }
   		return rpMpCc5;
   }

  
	/**
	*  set variable rpMpCc5
	*  Corresponding COBOL Variable is RP-MP-CC-5
	*  @param value
	**/
   public void setRpMpCc5(char[] value) {
      rpMpCc5 = checkRpMpCc5Constraints(value);
      serializeRpMpCc5(rpMpCc5);
   } 

     /**
	 * 	Update RpMpCc5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpCc5(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpCc5,rpMpCc5.length);
   	
   }
   
   public void setRpMpCc5(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc5,rpMpCc5.length);
   	
   }
   
     /**
	 * 	Update RpMpCc5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc5+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpCc5 with another Field
	 *	@param value
	 */
   public void setRpMpCc5(Field source) {
       replace(source,0,source.length(),beginRpMpCc5,RP_MP_CC_5_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpCc5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpCc5(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpCc5,RP_MP_CC_5_LEN);
   	
   }
   
     /**
	 * 	Update RpMpCc5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc5+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq8
	 *	@return rpMpIpq8
	 */
   public char[] getRpMpIpq8() throws CFException{
     if (isRpMpIpq8Modified()) { 
        rpMpIpq8 = refreshRpMpIpq8();
     }
   		return rpMpIpq8;
   }

  
	/**
	*  set variable rpMpIpq8
	*  Corresponding COBOL Variable is RP-MP-IPQ8
	*  @param value
	**/
   public void setRpMpIpq8(char[] value) {
      rpMpIpq8 = checkRpMpIpq8Constraints(value);
      serializeRpMpIpq8(rpMpIpq8);
   } 

     /**
	 * 	Update RpMpIpq8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq8,rpMpIpq8.length);
   	
   }
   
   public void setRpMpIpq8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq8,rpMpIpq8.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq8 with another Field
	 *	@param value
	 */
   public void setRpMpIpq8(Field source) {
       replace(source,0,source.length(),beginRpMpIpq8,RP_MP_IPQ_8_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq8,RP_MP_IPQ_8_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq8+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq9
	 *	@return rpMpIpq9
	 */
   public char[] getRpMpIpq9() throws CFException{
     if (isRpMpIpq9Modified()) { 
        rpMpIpq9 = refreshRpMpIpq9();
     }
   		return rpMpIpq9;
   }

  
	/**
	*  set variable rpMpIpq9
	*  Corresponding COBOL Variable is RP-MP-IPQ9
	*  @param value
	**/
   public void setRpMpIpq9(char[] value) {
      rpMpIpq9 = checkRpMpIpq9Constraints(value);
      serializeRpMpIpq9(rpMpIpq9);
   } 

     /**
	 * 	Update RpMpIpq9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq9,rpMpIpq9.length);
   	
   }
   
   public void setRpMpIpq9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq9,rpMpIpq9.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq9 with another Field
	 *	@param value
	 */
   public void setRpMpIpq9(Field source) {
       replace(source,0,source.length(),beginRpMpIpq9,RP_MP_IPQ_9_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq9,RP_MP_IPQ_9_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq9+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq10
	 *	@return rpMpIpq10
	 */
   public char[] getRpMpIpq10() throws CFException{
     if (isRpMpIpq10Modified()) { 
        rpMpIpq10 = refreshRpMpIpq10();
     }
   		return rpMpIpq10;
   }

  
	/**
	*  set variable rpMpIpq10
	*  Corresponding COBOL Variable is RP-MP-IPQ10
	*  @param value
	**/
   public void setRpMpIpq10(char[] value) {
      rpMpIpq10 = checkRpMpIpq10Constraints(value);
      serializeRpMpIpq10(rpMpIpq10);
   } 

     /**
	 * 	Update RpMpIpq10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq10,rpMpIpq10.length);
   	
   }
   
   public void setRpMpIpq10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq10,rpMpIpq10.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq10 with another Field
	 *	@param value
	 */
   public void setRpMpIpq10(Field source) {
       replace(source,0,source.length(),beginRpMpIpq10,RP_MP_IPQ_10_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq10,RP_MP_IPQ_10_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq11
	 *	@return rpMpIpq11
	 */
   public char[] getRpMpIpq11() throws CFException{
     if (isRpMpIpq11Modified()) { 
        rpMpIpq11 = refreshRpMpIpq11();
     }
   		return rpMpIpq11;
   }

  
	/**
	*  set variable rpMpIpq11
	*  Corresponding COBOL Variable is RP-MP-IPQ11
	*  @param value
	**/
   public void setRpMpIpq11(char[] value) {
      rpMpIpq11 = checkRpMpIpq11Constraints(value);
      serializeRpMpIpq11(rpMpIpq11);
   } 

     /**
	 * 	Update RpMpIpq11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq11,rpMpIpq11.length);
   	
   }
   
   public void setRpMpIpq11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq11,rpMpIpq11.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq11 with another Field
	 *	@param value
	 */
   public void setRpMpIpq11(Field source) {
       replace(source,0,source.length(),beginRpMpIpq11,RP_MP_IPQ_11_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq11,RP_MP_IPQ_11_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq12
	 *	@return rpMpIpq12
	 */
   public char[] getRpMpIpq12() throws CFException{
     if (isRpMpIpq12Modified()) { 
        rpMpIpq12 = refreshRpMpIpq12();
     }
   		return rpMpIpq12;
   }

  
	/**
	*  set variable rpMpIpq12
	*  Corresponding COBOL Variable is RP-MP-IPQ12
	*  @param value
	**/
   public void setRpMpIpq12(char[] value) {
      rpMpIpq12 = checkRpMpIpq12Constraints(value);
      serializeRpMpIpq12(rpMpIpq12);
   } 

     /**
	 * 	Update RpMpIpq12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq12,rpMpIpq12.length);
   	
   }
   
   public void setRpMpIpq12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq12,rpMpIpq12.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq12 with another Field
	 *	@param value
	 */
   public void setRpMpIpq12(Field source) {
       replace(source,0,source.length(),beginRpMpIpq12,RP_MP_IPQ_12_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq12,RP_MP_IPQ_12_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq13
	 *	@return rpMpIpq13
	 */
   public char[] getRpMpIpq13() throws CFException{
     if (isRpMpIpq13Modified()) { 
        rpMpIpq13 = refreshRpMpIpq13();
     }
   		return rpMpIpq13;
   }

  
	/**
	*  set variable rpMpIpq13
	*  Corresponding COBOL Variable is RP-MP-IPQ13
	*  @param value
	**/
   public void setRpMpIpq13(char[] value) {
      rpMpIpq13 = checkRpMpIpq13Constraints(value);
      serializeRpMpIpq13(rpMpIpq13);
   } 

     /**
	 * 	Update RpMpIpq13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq13,rpMpIpq13.length);
   	
   }
   
   public void setRpMpIpq13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq13,rpMpIpq13.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq13 with another Field
	 *	@param value
	 */
   public void setRpMpIpq13(Field source) {
       replace(source,0,source.length(),beginRpMpIpq13,RP_MP_IPQ_13_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq13,RP_MP_IPQ_13_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq14
	 *	@return rpMpIpq14
	 */
   public char[] getRpMpIpq14() throws CFException{
     if (isRpMpIpq14Modified()) { 
        rpMpIpq14 = refreshRpMpIpq14();
     }
   		return rpMpIpq14;
   }

  
	/**
	*  set variable rpMpIpq14
	*  Corresponding COBOL Variable is RP-MP-IPQ14
	*  @param value
	**/
   public void setRpMpIpq14(char[] value) {
      rpMpIpq14 = checkRpMpIpq14Constraints(value);
      serializeRpMpIpq14(rpMpIpq14);
   } 

     /**
	 * 	Update RpMpIpq14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq14,rpMpIpq14.length);
   	
   }
   
   public void setRpMpIpq14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq14,rpMpIpq14.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq14 with another Field
	 *	@param value
	 */
   public void setRpMpIpq14(Field source) {
       replace(source,0,source.length(),beginRpMpIpq14,RP_MP_IPQ_14_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq14,RP_MP_IPQ_14_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq14+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpMpDetail5FieldLength() {
			return RP_MP_DETAIL_5_LENGTH;
		}

}
  
