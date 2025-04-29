package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse28bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse28bT extends Wse28bTSerialized { 
   

						private char[] wse28bTFld1 = Field.fillLowValue(10);

						private char[] wse28bTFld2 = Field.fillLowValue(20);

						private char[] wse28bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse28bT
	**/
    public Wse28bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse28bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse28bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse28bTFld1
	 *	@return wse28bTFld1
	 */
   public char[] getWse28bTFld1() throws CFException{
     if (isWse28bTFld1Modified()) { 
        wse28bTFld1 = refreshWse28bTFld1();
     }
   		return wse28bTFld1;
   }

  
	/**
	*  set variable wse28bTFld1
	*  Corresponding COBOL Variable is WSE-2-8B-T-FLD1
	*  @param value
	**/
   public void setWse28bTFld1(char[] value) {
      wse28bTFld1 = checkWse28bTFld1Constraints(value);
      serializeWse28bTFld1(wse28bTFld1);
   } 

     /**
	 * 	Update Wse28bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse28bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse28bTFld1,wse28bTFld1.length);
   	
   }
   
   public void setWse28bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld1,wse28bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse28bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse28bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse28bTFld1 with another Field
	 *	@param value
	 */
   public void setWse28bTFld1(Field source) {
       replace(source,0,source.length(),beginWse28bTFld1,WSE_28B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse28bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse28bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse28bTFld1,WSE_28B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse28bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse28bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse28bTFld2
	 *	@return wse28bTFld2
	 */
   public char[] getWse28bTFld2() throws CFException{
     if (isWse28bTFld2Modified()) { 
        wse28bTFld2 = refreshWse28bTFld2();
     }
   		return wse28bTFld2;
   }

  
	/**
	*  set variable wse28bTFld2
	*  Corresponding COBOL Variable is WSE-2-8B-T-FLD2
	*  @param value
	**/
   public void setWse28bTFld2(char[] value) {
      wse28bTFld2 = checkWse28bTFld2Constraints(value);
      serializeWse28bTFld2(wse28bTFld2);
   } 

     /**
	 * 	Update Wse28bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse28bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse28bTFld2,wse28bTFld2.length);
   	
   }
   
   public void setWse28bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld2,wse28bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse28bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse28bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse28bTFld2 with another Field
	 *	@param value
	 */
   public void setWse28bTFld2(Field source) {
       replace(source,0,source.length(),beginWse28bTFld2,WSE_28B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse28bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse28bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse28bTFld2,WSE_28B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse28bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse28bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse28bTFld3
	 *	@return wse28bTFld3
	 */
   public char[] getWse28bTFld3() throws CFException{
     if (isWse28bTFld3Modified()) { 
        wse28bTFld3 = refreshWse28bTFld3();
     }
   		return wse28bTFld3;
   }

  
	/**
	*  set variable wse28bTFld3
	*  Corresponding COBOL Variable is WSE-2-8B-T-FLD3
	*  @param value
	**/
   public void setWse28bTFld3(char[] value) {
      wse28bTFld3 = checkWse28bTFld3Constraints(value);
      serializeWse28bTFld3(wse28bTFld3);
   } 

     /**
	 * 	Update Wse28bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse28bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse28bTFld3,wse28bTFld3.length);
   	
   }
   
   public void setWse28bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld3,wse28bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse28bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse28bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse28bTFld3 with another Field
	 *	@param value
	 */
   public void setWse28bTFld3(Field source) {
       replace(source,0,source.length(),beginWse28bTFld3,WSE_28B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse28bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse28bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse28bTFld3,WSE_28B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse28bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse28bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse28bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse28bTFld1(CONSTANTS.SPACE_10);
         setWse28bTFld2(CONSTANTS.SPACE_20);
         setWse28bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse28bTFieldLength() {
			return WSE_28B_T_LENGTH;
		}

}
  
