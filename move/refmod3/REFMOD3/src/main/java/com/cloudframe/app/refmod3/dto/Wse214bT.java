package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse214bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse214bT extends Wse214bTSerialized { 
   

						private char[] wse214bTFld1 = Field.fillLowValue(10);

						private char[] wse214bTFld2 = Field.fillLowValue(20);

						private char[] wse214bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse214bT
	**/
    public Wse214bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse214bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse214bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse214bTFld1
	 *	@return wse214bTFld1
	 */
   public char[] getWse214bTFld1() throws CFException{
     if (isWse214bTFld1Modified()) { 
        wse214bTFld1 = refreshWse214bTFld1();
     }
   		return wse214bTFld1;
   }

  
	/**
	*  set variable wse214bTFld1
	*  Corresponding COBOL Variable is WSE-2-14B-T-FLD1
	*  @param value
	**/
   public void setWse214bTFld1(char[] value) {
      wse214bTFld1 = checkWse214bTFld1Constraints(value);
      serializeWse214bTFld1(wse214bTFld1);
   } 

     /**
	 * 	Update Wse214bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse214bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse214bTFld1,wse214bTFld1.length);
   	
   }
   
   public void setWse214bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld1,wse214bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse214bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse214bTFld1 with another Field
	 *	@param value
	 */
   public void setWse214bTFld1(Field source) {
       replace(source,0,source.length(),beginWse214bTFld1,WSE_214B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse214bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse214bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse214bTFld1,WSE_214B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse214bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse214bTFld2
	 *	@return wse214bTFld2
	 */
   public char[] getWse214bTFld2() throws CFException{
     if (isWse214bTFld2Modified()) { 
        wse214bTFld2 = refreshWse214bTFld2();
     }
   		return wse214bTFld2;
   }

  
	/**
	*  set variable wse214bTFld2
	*  Corresponding COBOL Variable is WSE-2-14B-T-FLD2
	*  @param value
	**/
   public void setWse214bTFld2(char[] value) {
      wse214bTFld2 = checkWse214bTFld2Constraints(value);
      serializeWse214bTFld2(wse214bTFld2);
   } 

     /**
	 * 	Update Wse214bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse214bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse214bTFld2,wse214bTFld2.length);
   	
   }
   
   public void setWse214bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld2,wse214bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse214bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse214bTFld2 with another Field
	 *	@param value
	 */
   public void setWse214bTFld2(Field source) {
       replace(source,0,source.length(),beginWse214bTFld2,WSE_214B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse214bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse214bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse214bTFld2,WSE_214B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse214bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse214bTFld3
	 *	@return wse214bTFld3
	 */
   public char[] getWse214bTFld3() throws CFException{
     if (isWse214bTFld3Modified()) { 
        wse214bTFld3 = refreshWse214bTFld3();
     }
   		return wse214bTFld3;
   }

  
	/**
	*  set variable wse214bTFld3
	*  Corresponding COBOL Variable is WSE-2-14B-T-FLD3
	*  @param value
	**/
   public void setWse214bTFld3(char[] value) {
      wse214bTFld3 = checkWse214bTFld3Constraints(value);
      serializeWse214bTFld3(wse214bTFld3);
   } 

     /**
	 * 	Update Wse214bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse214bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse214bTFld3,wse214bTFld3.length);
   	
   }
   
   public void setWse214bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld3,wse214bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse214bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse214bTFld3 with another Field
	 *	@param value
	 */
   public void setWse214bTFld3(Field source) {
       replace(source,0,source.length(),beginWse214bTFld3,WSE_214B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse214bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse214bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse214bTFld3,WSE_214B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse214bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse214bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse214bTFld1(CONSTANTS.SPACE_10);
         setWse214bTFld2(CONSTANTS.SPACE_20);
         setWse214bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse214bTFieldLength() {
			return WSE_214B_T_LENGTH;
		}

}
  
