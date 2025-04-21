package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse21bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse21bT extends Wse21bTSerialized {
   

						private char[] wse21bTFld1 = Field.fillLowValue(10);

						private char[] wse21bTFld2 = Field.fillLowValue(20);

						private char[] wse21bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse21bT
	**/
    public Wse21bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse21bTFld1
	 *	@return wse21bTFld1
	 */
   public char[] getWse21bTFld1() throws CFException{
     if (isWse21bTFld1Modified()) { 
        wse21bTFld1 = refreshWse21bTFld1();
     }
   		return wse21bTFld1;
   }

  
	/**
	*  set variable wse21bTFld1
	*  Corresponding COBOL Variable is WSE-2-1B-T-FLD1
	*  @param value
	**/
   public void setWse21bTFld1(char[] value) {
      wse21bTFld1 = checkWse21bTFld1Constraints(value);
      serializeWse21bTFld1(wse21bTFld1);
   } 

     /**
	 * 	Update Wse21bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21bTFld1,wse21bTFld1.length);
   	
   }
   
   public void setWse21bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld1,wse21bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse21bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21bTFld1 with another Field
	 *	@param value
	 */
   public void setWse21bTFld1(Field source) {
       replace(source,0,source.length(),beginWse21bTFld1,WSE_21B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21bTFld1,WSE_21B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse21bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse21bTFld2
	 *	@return wse21bTFld2
	 */
   public char[] getWse21bTFld2() throws CFException{
     if (isWse21bTFld2Modified()) { 
        wse21bTFld2 = refreshWse21bTFld2();
     }
   		return wse21bTFld2;
   }

  
	/**
	*  set variable wse21bTFld2
	*  Corresponding COBOL Variable is WSE-2-1B-T-FLD2
	*  @param value
	**/
   public void setWse21bTFld2(char[] value) {
      wse21bTFld2 = checkWse21bTFld2Constraints(value);
      serializeWse21bTFld2(wse21bTFld2);
   } 

     /**
	 * 	Update Wse21bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21bTFld2,wse21bTFld2.length);
   	
   }
   
   public void setWse21bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld2,wse21bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse21bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21bTFld2 with another Field
	 *	@param value
	 */
   public void setWse21bTFld2(Field source) {
       replace(source,0,source.length(),beginWse21bTFld2,WSE_21B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21bTFld2,WSE_21B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse21bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse21bTFld3
	 *	@return wse21bTFld3
	 */
   public char[] getWse21bTFld3() throws CFException{
     if (isWse21bTFld3Modified()) { 
        wse21bTFld3 = refreshWse21bTFld3();
     }
   		return wse21bTFld3;
   }

  
	/**
	*  set variable wse21bTFld3
	*  Corresponding COBOL Variable is WSE-2-1B-T-FLD3
	*  @param value
	**/
   public void setWse21bTFld3(char[] value) {
      wse21bTFld3 = checkWse21bTFld3Constraints(value);
      serializeWse21bTFld3(wse21bTFld3);
   } 

     /**
	 * 	Update Wse21bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21bTFld3,wse21bTFld3.length);
   	
   }
   
   public void setWse21bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld3,wse21bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse21bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21bTFld3 with another Field
	 *	@param value
	 */
   public void setWse21bTFld3(Field source) {
       replace(source,0,source.length(),beginWse21bTFld3,WSE_21B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21bTFld3,WSE_21B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse21bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse21bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse21bTFld1(CONSTANTS.SPACE_10);
         setWse21bTFld2(CONSTANTS.SPACE_20);
         setWse21bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse21bTFieldLength() {
			return WSE_21B_T_LENGTH;
		}

}
  
