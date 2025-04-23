package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse210bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse210bT extends Wse210bTSerialized { 
   

						private char[] wse210bTFld1 = Field.fillLowValue(10);

						private char[] wse210bTFld2 = Field.fillLowValue(20);

						private char[] wse210bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse210bT
	**/
    public Wse210bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse210bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse210bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse210bTFld1
	 *	@return wse210bTFld1
	 */
   public char[] getWse210bTFld1() throws CFException{
     if (isWse210bTFld1Modified()) { 
        wse210bTFld1 = refreshWse210bTFld1();
     }
   		return wse210bTFld1;
   }

  
	/**
	*  set variable wse210bTFld1
	*  Corresponding COBOL Variable is WSE-2-10B-T-FLD1
	*  @param value
	**/
   public void setWse210bTFld1(char[] value) {
      wse210bTFld1 = checkWse210bTFld1Constraints(value);
      serializeWse210bTFld1(wse210bTFld1);
   } 

     /**
	 * 	Update Wse210bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse210bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse210bTFld1,wse210bTFld1.length);
   	
   }
   
   public void setWse210bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld1,wse210bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse210bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse210bTFld1 with another Field
	 *	@param value
	 */
   public void setWse210bTFld1(Field source) {
       replace(source,0,source.length(),beginWse210bTFld1,WSE_210B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse210bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse210bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse210bTFld1,WSE_210B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse210bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse210bTFld2
	 *	@return wse210bTFld2
	 */
   public char[] getWse210bTFld2() throws CFException{
     if (isWse210bTFld2Modified()) { 
        wse210bTFld2 = refreshWse210bTFld2();
     }
   		return wse210bTFld2;
   }

  
	/**
	*  set variable wse210bTFld2
	*  Corresponding COBOL Variable is WSE-2-10B-T-FLD2
	*  @param value
	**/
   public void setWse210bTFld2(char[] value) {
      wse210bTFld2 = checkWse210bTFld2Constraints(value);
      serializeWse210bTFld2(wse210bTFld2);
   } 

     /**
	 * 	Update Wse210bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse210bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse210bTFld2,wse210bTFld2.length);
   	
   }
   
   public void setWse210bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld2,wse210bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse210bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse210bTFld2 with another Field
	 *	@param value
	 */
   public void setWse210bTFld2(Field source) {
       replace(source,0,source.length(),beginWse210bTFld2,WSE_210B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse210bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse210bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse210bTFld2,WSE_210B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse210bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse210bTFld3
	 *	@return wse210bTFld3
	 */
   public char[] getWse210bTFld3() throws CFException{
     if (isWse210bTFld3Modified()) { 
        wse210bTFld3 = refreshWse210bTFld3();
     }
   		return wse210bTFld3;
   }

  
	/**
	*  set variable wse210bTFld3
	*  Corresponding COBOL Variable is WSE-2-10B-T-FLD3
	*  @param value
	**/
   public void setWse210bTFld3(char[] value) {
      wse210bTFld3 = checkWse210bTFld3Constraints(value);
      serializeWse210bTFld3(wse210bTFld3);
   } 

     /**
	 * 	Update Wse210bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse210bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse210bTFld3,wse210bTFld3.length);
   	
   }
   
   public void setWse210bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld3,wse210bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse210bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse210bTFld3 with another Field
	 *	@param value
	 */
   public void setWse210bTFld3(Field source) {
       replace(source,0,source.length(),beginWse210bTFld3,WSE_210B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse210bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse210bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse210bTFld3,WSE_210B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse210bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse210bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse210bTFld1(CONSTANTS.SPACE_10);
         setWse210bTFld2(CONSTANTS.SPACE_20);
         setWse210bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse210bTFieldLength() {
			return WSE_210B_T_LENGTH;
		}

}
  
