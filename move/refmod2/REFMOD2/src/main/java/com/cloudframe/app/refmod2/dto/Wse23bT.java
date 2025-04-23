package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse23bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse23bT extends Wse23bTSerialized {
   

						private char[] wse23bTFld1 = Field.fillLowValue(10);

						private char[] wse23bTFld2 = Field.fillLowValue(20);

						private char[] wse23bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse23bT
	**/
    public Wse23bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse23bTFld1
	 *	@return wse23bTFld1
	 */
   public char[] getWse23bTFld1() throws CFException{
     if (isWse23bTFld1Modified()) { 
        wse23bTFld1 = refreshWse23bTFld1();
     }
   		return wse23bTFld1;
   }

  
	/**
	*  set variable wse23bTFld1
	*  Corresponding COBOL Variable is WSE-2-3B-T-FLD1
	*  @param value
	**/
   public void setWse23bTFld1(char[] value) {
      wse23bTFld1 = checkWse23bTFld1Constraints(value);
      serializeWse23bTFld1(wse23bTFld1);
   } 

     /**
	 * 	Update Wse23bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse23bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse23bTFld1,wse23bTFld1.length);
   	
   }
   
   public void setWse23bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld1,wse23bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse23bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse23bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse23bTFld1 with another Field
	 *	@param value
	 */
   public void setWse23bTFld1(Field source) {
       replace(source,0,source.length(),beginWse23bTFld1,WSE_23B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse23bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse23bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse23bTFld1,WSE_23B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse23bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse23bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse23bTFld2
	 *	@return wse23bTFld2
	 */
   public char[] getWse23bTFld2() throws CFException{
     if (isWse23bTFld2Modified()) { 
        wse23bTFld2 = refreshWse23bTFld2();
     }
   		return wse23bTFld2;
   }

  
	/**
	*  set variable wse23bTFld2
	*  Corresponding COBOL Variable is WSE-2-3B-T-FLD2
	*  @param value
	**/
   public void setWse23bTFld2(char[] value) {
      wse23bTFld2 = checkWse23bTFld2Constraints(value);
      serializeWse23bTFld2(wse23bTFld2);
   } 

     /**
	 * 	Update Wse23bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse23bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse23bTFld2,wse23bTFld2.length);
   	
   }
   
   public void setWse23bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld2,wse23bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse23bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse23bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse23bTFld2 with another Field
	 *	@param value
	 */
   public void setWse23bTFld2(Field source) {
       replace(source,0,source.length(),beginWse23bTFld2,WSE_23B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse23bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse23bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse23bTFld2,WSE_23B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse23bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse23bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse23bTFld3
	 *	@return wse23bTFld3
	 */
   public char[] getWse23bTFld3() throws CFException{
     if (isWse23bTFld3Modified()) { 
        wse23bTFld3 = refreshWse23bTFld3();
     }
   		return wse23bTFld3;
   }

  
	/**
	*  set variable wse23bTFld3
	*  Corresponding COBOL Variable is WSE-2-3B-T-FLD3
	*  @param value
	**/
   public void setWse23bTFld3(char[] value) {
      wse23bTFld3 = checkWse23bTFld3Constraints(value);
      serializeWse23bTFld3(wse23bTFld3);
   } 

     /**
	 * 	Update Wse23bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse23bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse23bTFld3,wse23bTFld3.length);
   	
   }
   
   public void setWse23bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld3,wse23bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse23bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse23bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse23bTFld3 with another Field
	 *	@param value
	 */
   public void setWse23bTFld3(Field source) {
       replace(source,0,source.length(),beginWse23bTFld3,WSE_23B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse23bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse23bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse23bTFld3,WSE_23B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse23bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse23bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse23bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse23bTFld1(CONSTANTS.SPACE_10);
         setWse23bTFld2(CONSTANTS.SPACE_20);
         setWse23bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse23bTFieldLength() {
			return WSE_23B_T_LENGTH;
		}

}
  
