package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse26bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse26bT extends Wse26bTSerialized {
   

						private char[] wse26bTFld1 = Field.fillLowValue(10);

						private char[] wse26bTFld2 = Field.fillLowValue(20);

						private char[] wse26bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse26bT
	**/
    public Wse26bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse26bTFld1
	 *	@return wse26bTFld1
	 */
   public char[] getWse26bTFld1() throws CFException{
     if (isWse26bTFld1Modified()) { 
        wse26bTFld1 = refreshWse26bTFld1();
     }
   		return wse26bTFld1;
   }

  
	/**
	*  set variable wse26bTFld1
	*  Corresponding COBOL Variable is WSE-2-6B-T-FLD1
	*  @param value
	**/
   public void setWse26bTFld1(char[] value) {
      wse26bTFld1 = checkWse26bTFld1Constraints(value);
      serializeWse26bTFld1(wse26bTFld1);
   } 

     /**
	 * 	Update Wse26bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse26bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse26bTFld1,wse26bTFld1.length);
   	
   }
   
   public void setWse26bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld1,wse26bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse26bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse26bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse26bTFld1 with another Field
	 *	@param value
	 */
   public void setWse26bTFld1(Field source) {
       replace(source,0,source.length(),beginWse26bTFld1,WSE_26B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse26bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse26bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse26bTFld1,WSE_26B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse26bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse26bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse26bTFld2
	 *	@return wse26bTFld2
	 */
   public char[] getWse26bTFld2() throws CFException{
     if (isWse26bTFld2Modified()) { 
        wse26bTFld2 = refreshWse26bTFld2();
     }
   		return wse26bTFld2;
   }

  
	/**
	*  set variable wse26bTFld2
	*  Corresponding COBOL Variable is WSE-2-6B-T-FLD2
	*  @param value
	**/
   public void setWse26bTFld2(char[] value) {
      wse26bTFld2 = checkWse26bTFld2Constraints(value);
      serializeWse26bTFld2(wse26bTFld2);
   } 

     /**
	 * 	Update Wse26bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse26bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse26bTFld2,wse26bTFld2.length);
   	
   }
   
   public void setWse26bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld2,wse26bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse26bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse26bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse26bTFld2 with another Field
	 *	@param value
	 */
   public void setWse26bTFld2(Field source) {
       replace(source,0,source.length(),beginWse26bTFld2,WSE_26B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse26bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse26bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse26bTFld2,WSE_26B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse26bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse26bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse26bTFld3
	 *	@return wse26bTFld3
	 */
   public char[] getWse26bTFld3() throws CFException{
     if (isWse26bTFld3Modified()) { 
        wse26bTFld3 = refreshWse26bTFld3();
     }
   		return wse26bTFld3;
   }

  
	/**
	*  set variable wse26bTFld3
	*  Corresponding COBOL Variable is WSE-2-6B-T-FLD3
	*  @param value
	**/
   public void setWse26bTFld3(char[] value) {
      wse26bTFld3 = checkWse26bTFld3Constraints(value);
      serializeWse26bTFld3(wse26bTFld3);
   } 

     /**
	 * 	Update Wse26bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse26bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse26bTFld3,wse26bTFld3.length);
   	
   }
   
   public void setWse26bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld3,wse26bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse26bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse26bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse26bTFld3 with another Field
	 *	@param value
	 */
   public void setWse26bTFld3(Field source) {
       replace(source,0,source.length(),beginWse26bTFld3,WSE_26B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse26bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse26bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse26bTFld3,WSE_26B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse26bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse26bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse26bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse26bTFld1(CONSTANTS.SPACE_10);
         setWse26bTFld2(CONSTANTS.SPACE_20);
         setWse26bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse26bTFieldLength() {
			return WSE_26B_T_LENGTH;
		}

}
  
