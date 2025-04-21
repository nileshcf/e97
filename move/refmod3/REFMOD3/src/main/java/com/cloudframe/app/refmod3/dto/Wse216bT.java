package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse216bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse216bT extends Wse216bTSerialized {
   

						private char[] wse216bTFld1 = Field.fillLowValue(10);

						private char[] wse216bTFld2 = Field.fillLowValue(20);

						private char[] wse216bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse216bT
	**/
    public Wse216bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse216bTFld1
	 *	@return wse216bTFld1
	 */
   public char[] getWse216bTFld1() throws CFException{
     if (isWse216bTFld1Modified()) { 
        wse216bTFld1 = refreshWse216bTFld1();
     }
   		return wse216bTFld1;
   }

  
	/**
	*  set variable wse216bTFld1
	*  Corresponding COBOL Variable is WSE-2-16B-T-FLD1
	*  @param value
	**/
   public void setWse216bTFld1(char[] value) {
      wse216bTFld1 = checkWse216bTFld1Constraints(value);
      serializeWse216bTFld1(wse216bTFld1);
   } 

     /**
	 * 	Update Wse216bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse216bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse216bTFld1,wse216bTFld1.length);
   	
   }
   
   public void setWse216bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld1,wse216bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse216bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse216bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse216bTFld1 with another Field
	 *	@param value
	 */
   public void setWse216bTFld1(Field source) {
       replace(source,0,source.length(),beginWse216bTFld1,WSE_216B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse216bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse216bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse216bTFld1,WSE_216B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse216bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse216bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse216bTFld2
	 *	@return wse216bTFld2
	 */
   public char[] getWse216bTFld2() throws CFException{
     if (isWse216bTFld2Modified()) { 
        wse216bTFld2 = refreshWse216bTFld2();
     }
   		return wse216bTFld2;
   }

  
	/**
	*  set variable wse216bTFld2
	*  Corresponding COBOL Variable is WSE-2-16B-T-FLD2
	*  @param value
	**/
   public void setWse216bTFld2(char[] value) {
      wse216bTFld2 = checkWse216bTFld2Constraints(value);
      serializeWse216bTFld2(wse216bTFld2);
   } 

     /**
	 * 	Update Wse216bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse216bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse216bTFld2,wse216bTFld2.length);
   	
   }
   
   public void setWse216bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld2,wse216bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse216bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse216bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse216bTFld2 with another Field
	 *	@param value
	 */
   public void setWse216bTFld2(Field source) {
       replace(source,0,source.length(),beginWse216bTFld2,WSE_216B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse216bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse216bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse216bTFld2,WSE_216B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse216bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse216bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse216bTFld3
	 *	@return wse216bTFld3
	 */
   public char[] getWse216bTFld3() throws CFException{
     if (isWse216bTFld3Modified()) { 
        wse216bTFld3 = refreshWse216bTFld3();
     }
   		return wse216bTFld3;
   }

  
	/**
	*  set variable wse216bTFld3
	*  Corresponding COBOL Variable is WSE-2-16B-T-FLD3
	*  @param value
	**/
   public void setWse216bTFld3(char[] value) {
      wse216bTFld3 = checkWse216bTFld3Constraints(value);
      serializeWse216bTFld3(wse216bTFld3);
   } 

     /**
	 * 	Update Wse216bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse216bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse216bTFld3,wse216bTFld3.length);
   	
   }
   
   public void setWse216bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld3,wse216bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse216bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse216bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse216bTFld3 with another Field
	 *	@param value
	 */
   public void setWse216bTFld3(Field source) {
       replace(source,0,source.length(),beginWse216bTFld3,WSE_216B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse216bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse216bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse216bTFld3,WSE_216B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse216bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse216bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse216bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse216bTFld1(CONSTANTS.SPACE_10);
         setWse216bTFld2(CONSTANTS.SPACE_20);
         setWse216bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse216bTFieldLength() {
			return WSE_216B_T_LENGTH;
		}

}
  
