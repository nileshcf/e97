package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse22bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse22bT extends Wse22bTSerialized {
   

						private char[] wse22bTFld1 = Field.fillLowValue(10);

						private char[] wse22bTFld2 = Field.fillLowValue(20);

						private char[] wse22bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse22bT
	**/
    public Wse22bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse22bTFld1
	 *	@return wse22bTFld1
	 */
   public char[] getWse22bTFld1() throws CFException{
     if (isWse22bTFld1Modified()) { 
        wse22bTFld1 = refreshWse22bTFld1();
     }
   		return wse22bTFld1;
   }

  
	/**
	*  set variable wse22bTFld1
	*  Corresponding COBOL Variable is WSE-2-2B-T-FLD1
	*  @param value
	**/
   public void setWse22bTFld1(char[] value) {
      wse22bTFld1 = checkWse22bTFld1Constraints(value);
      serializeWse22bTFld1(wse22bTFld1);
   } 

     /**
	 * 	Update Wse22bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse22bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse22bTFld1,wse22bTFld1.length);
   	
   }
   
   public void setWse22bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld1,wse22bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse22bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse22bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse22bTFld1 with another Field
	 *	@param value
	 */
   public void setWse22bTFld1(Field source) {
       replace(source,0,source.length(),beginWse22bTFld1,WSE_22B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse22bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse22bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse22bTFld1,WSE_22B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse22bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse22bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse22bTFld2
	 *	@return wse22bTFld2
	 */
   public char[] getWse22bTFld2() throws CFException{
     if (isWse22bTFld2Modified()) { 
        wse22bTFld2 = refreshWse22bTFld2();
     }
   		return wse22bTFld2;
   }

  
	/**
	*  set variable wse22bTFld2
	*  Corresponding COBOL Variable is WSE-2-2B-T-FLD2
	*  @param value
	**/
   public void setWse22bTFld2(char[] value) {
      wse22bTFld2 = checkWse22bTFld2Constraints(value);
      serializeWse22bTFld2(wse22bTFld2);
   } 

     /**
	 * 	Update Wse22bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse22bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse22bTFld2,wse22bTFld2.length);
   	
   }
   
   public void setWse22bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld2,wse22bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse22bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse22bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse22bTFld2 with another Field
	 *	@param value
	 */
   public void setWse22bTFld2(Field source) {
       replace(source,0,source.length(),beginWse22bTFld2,WSE_22B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse22bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse22bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse22bTFld2,WSE_22B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse22bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse22bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse22bTFld3
	 *	@return wse22bTFld3
	 */
   public char[] getWse22bTFld3() throws CFException{
     if (isWse22bTFld3Modified()) { 
        wse22bTFld3 = refreshWse22bTFld3();
     }
   		return wse22bTFld3;
   }

  
	/**
	*  set variable wse22bTFld3
	*  Corresponding COBOL Variable is WSE-2-2B-T-FLD3
	*  @param value
	**/
   public void setWse22bTFld3(char[] value) {
      wse22bTFld3 = checkWse22bTFld3Constraints(value);
      serializeWse22bTFld3(wse22bTFld3);
   } 

     /**
	 * 	Update Wse22bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse22bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse22bTFld3,wse22bTFld3.length);
   	
   }
   
   public void setWse22bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld3,wse22bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse22bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse22bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse22bTFld3 with another Field
	 *	@param value
	 */
   public void setWse22bTFld3(Field source) {
       replace(source,0,source.length(),beginWse22bTFld3,WSE_22B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse22bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse22bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse22bTFld3,WSE_22B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse22bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse22bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse22bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse22bTFld1(CONSTANTS.SPACE_10);
         setWse22bTFld2(CONSTANTS.SPACE_20);
         setWse22bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse22bTFieldLength() {
			return WSE_22B_T_LENGTH;
		}

}
  
