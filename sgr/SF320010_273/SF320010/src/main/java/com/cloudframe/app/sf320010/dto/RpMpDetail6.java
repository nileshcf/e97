package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpMpDetail6 extends RpMpDetail6Serialized {
   

						private char[] rpMpCc6 = new char[1];


								private char[] rpMpIpq15 = Field.fillLowValue(4);


								private char[] rpMpIpq16 = Field.fillLowValue(4);


								private char[] rpMpIpq17 = Field.fillLowValue(4);


								private char[] rpMpIpq18 = Field.fillLowValue(4);


								private char[] rpMpIpq19 = Field.fillLowValue(4);


								private char[] rpMpIpq20 = Field.fillLowValue(4);

	
	/**
	* Constructor for RpMpDetail6
	**/
    public RpMpDetail6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc6(fillSpace(1));
       replaceValue( // serialize and save the value
             ("IPQ15 - ").toCharArray()
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("  IPQ16 - ").toCharArray()
             , getStartOffset() + 13
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ17 - ").toCharArray()
             , getStartOffset() + 27
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ18 - ").toCharArray()
             , getStartOffset() + 41
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ19 - ").toCharArray()
             , getStartOffset() + 55
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ20 - ").toCharArray()
             , getStartOffset() + 69
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 83
             ,50
             );
    }


 

	/**
	 *	Returns the value of rpMpCc6
	 *	@return rpMpCc6
	 */
   public char[] getRpMpCc6() throws CFException{
     if (isRpMpCc6Modified()) { 
        rpMpCc6 = refreshRpMpCc6();
     }
   		return rpMpCc6;
   }

  
	/**
	*  set variable rpMpCc6
	*  Corresponding COBOL Variable is RP-MP-CC-6
	*  @param value
	**/
   public void setRpMpCc6(char[] value) {
      rpMpCc6 = checkRpMpCc6Constraints(value);
      serializeRpMpCc6(rpMpCc6);
   } 

     /**
	 * 	Update RpMpCc6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpCc6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpCc6,rpMpCc6.length);
   	
   }
   
   public void setRpMpCc6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc6,rpMpCc6.length);
   	
   }
   
     /**
	 * 	Update RpMpCc6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpCc6 with another Field
	 *	@param value
	 */
   public void setRpMpCc6(Field source) {
       replace(source,0,source.length(),beginRpMpCc6,RP_MP_CC_6_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpCc6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpCc6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpCc6,RP_MP_CC_6_LEN);
   	
   }
   
     /**
	 * 	Update RpMpCc6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpCc6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpCc6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq15
	 *	@return rpMpIpq15
	 */
   public char[] getRpMpIpq15() throws CFException{
     if (isRpMpIpq15Modified()) { 
        rpMpIpq15 = refreshRpMpIpq15();
     }
   		return rpMpIpq15;
   }

  
	/**
	*  set variable rpMpIpq15
	*  Corresponding COBOL Variable is RP-MP-IPQ15
	*  @param value
	**/
   public void setRpMpIpq15(char[] value) {
      rpMpIpq15 = checkRpMpIpq15Constraints(value);
      serializeRpMpIpq15(rpMpIpq15);
   } 

     /**
	 * 	Update RpMpIpq15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq15,rpMpIpq15.length);
   	
   }
   
   public void setRpMpIpq15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq15,rpMpIpq15.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq15 with another Field
	 *	@param value
	 */
   public void setRpMpIpq15(Field source) {
       replace(source,0,source.length(),beginRpMpIpq15,RP_MP_IPQ_15_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq15,RP_MP_IPQ_15_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq16
	 *	@return rpMpIpq16
	 */
   public char[] getRpMpIpq16() throws CFException{
     if (isRpMpIpq16Modified()) { 
        rpMpIpq16 = refreshRpMpIpq16();
     }
   		return rpMpIpq16;
   }

  
	/**
	*  set variable rpMpIpq16
	*  Corresponding COBOL Variable is RP-MP-IPQ16
	*  @param value
	**/
   public void setRpMpIpq16(char[] value) {
      rpMpIpq16 = checkRpMpIpq16Constraints(value);
      serializeRpMpIpq16(rpMpIpq16);
   } 

     /**
	 * 	Update RpMpIpq16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq16,rpMpIpq16.length);
   	
   }
   
   public void setRpMpIpq16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq16,rpMpIpq16.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq16 with another Field
	 *	@param value
	 */
   public void setRpMpIpq16(Field source) {
       replace(source,0,source.length(),beginRpMpIpq16,RP_MP_IPQ_16_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq16,RP_MP_IPQ_16_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq17
	 *	@return rpMpIpq17
	 */
   public char[] getRpMpIpq17() throws CFException{
     if (isRpMpIpq17Modified()) { 
        rpMpIpq17 = refreshRpMpIpq17();
     }
   		return rpMpIpq17;
   }

  
	/**
	*  set variable rpMpIpq17
	*  Corresponding COBOL Variable is RP-MP-IPQ17
	*  @param value
	**/
   public void setRpMpIpq17(char[] value) {
      rpMpIpq17 = checkRpMpIpq17Constraints(value);
      serializeRpMpIpq17(rpMpIpq17);
   } 

     /**
	 * 	Update RpMpIpq17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq17,rpMpIpq17.length);
   	
   }
   
   public void setRpMpIpq17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq17,rpMpIpq17.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq17 with another Field
	 *	@param value
	 */
   public void setRpMpIpq17(Field source) {
       replace(source,0,source.length(),beginRpMpIpq17,RP_MP_IPQ_17_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq17,RP_MP_IPQ_17_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq18
	 *	@return rpMpIpq18
	 */
   public char[] getRpMpIpq18() throws CFException{
     if (isRpMpIpq18Modified()) { 
        rpMpIpq18 = refreshRpMpIpq18();
     }
   		return rpMpIpq18;
   }

  
	/**
	*  set variable rpMpIpq18
	*  Corresponding COBOL Variable is RP-MP-IPQ18
	*  @param value
	**/
   public void setRpMpIpq18(char[] value) {
      rpMpIpq18 = checkRpMpIpq18Constraints(value);
      serializeRpMpIpq18(rpMpIpq18);
   } 

     /**
	 * 	Update RpMpIpq18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq18,rpMpIpq18.length);
   	
   }
   
   public void setRpMpIpq18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq18,rpMpIpq18.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq18 with another Field
	 *	@param value
	 */
   public void setRpMpIpq18(Field source) {
       replace(source,0,source.length(),beginRpMpIpq18,RP_MP_IPQ_18_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq18,RP_MP_IPQ_18_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq19
	 *	@return rpMpIpq19
	 */
   public char[] getRpMpIpq19() throws CFException{
     if (isRpMpIpq19Modified()) { 
        rpMpIpq19 = refreshRpMpIpq19();
     }
   		return rpMpIpq19;
   }

  
	/**
	*  set variable rpMpIpq19
	*  Corresponding COBOL Variable is RP-MP-IPQ19
	*  @param value
	**/
   public void setRpMpIpq19(char[] value) {
      rpMpIpq19 = checkRpMpIpq19Constraints(value);
      serializeRpMpIpq19(rpMpIpq19);
   } 

     /**
	 * 	Update RpMpIpq19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq19,rpMpIpq19.length);
   	
   }
   
   public void setRpMpIpq19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq19,rpMpIpq19.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq19 with another Field
	 *	@param value
	 */
   public void setRpMpIpq19(Field source) {
       replace(source,0,source.length(),beginRpMpIpq19,RP_MP_IPQ_19_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq19,RP_MP_IPQ_19_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpMpIpq20
	 *	@return rpMpIpq20
	 */
   public char[] getRpMpIpq20() throws CFException{
     if (isRpMpIpq20Modified()) { 
        rpMpIpq20 = refreshRpMpIpq20();
     }
   		return rpMpIpq20;
   }

  
	/**
	*  set variable rpMpIpq20
	*  Corresponding COBOL Variable is RP-MP-IPQ20
	*  @param value
	**/
   public void setRpMpIpq20(char[] value) {
      rpMpIpq20 = checkRpMpIpq20Constraints(value);
      serializeRpMpIpq20(rpMpIpq20);
   } 

     /**
	 * 	Update RpMpIpq20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpMpIpq20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpMpIpq20,rpMpIpq20.length);
   	
   }
   
   public void setRpMpIpq20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq20,rpMpIpq20.length);
   	
   }
   
     /**
	 * 	Update RpMpIpq20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpMpIpq20 with another Field
	 *	@param value
	 */
   public void setRpMpIpq20(Field source) {
       replace(source,0,source.length(),beginRpMpIpq20,RP_MP_IPQ_20_LEN);
   	
   }  
   
     /**
	 * 	Update RpMpIpq20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpMpIpq20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpMpIpq20,RP_MP_IPQ_20_LEN);
   	
   }
   
     /**
	 * 	Update RpMpIpq20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpMpIpq20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpMpIpq20+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpMpDetail6FieldLength() {
			return RP_MP_DETAIL_6_LENGTH;
		}

}
  
