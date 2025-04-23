package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse213bT extends Wse213bTSerialized { 
   

						private char[] wse213bTFld1 = Field.fillLowValue(10);

						private char[] wse213bTFld2 = Field.fillLowValue(20);

						private char[] wse213bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse213bT
	**/
    public Wse213bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse213bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse213bTFld1
	 *	@return wse213bTFld1
	 */
   public char[] getWse213bTFld1() throws CFException{
     if (isWse213bTFld1Modified()) { 
        wse213bTFld1 = refreshWse213bTFld1();
     }
   		return wse213bTFld1;
   }

  
	/**
	*  set variable wse213bTFld1
	*  Corresponding COBOL Variable is WSE-2-13B-T-FLD1
	*  @param value
	**/
   public void setWse213bTFld1(char[] value) {
      wse213bTFld1 = checkWse213bTFld1Constraints(value);
      serializeWse213bTFld1(wse213bTFld1);
   } 

     /**
	 * 	Update Wse213bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse213bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse213bTFld1,wse213bTFld1.length);
   	
   }
   
   public void setWse213bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld1,wse213bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse213bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse213bTFld1 with another Field
	 *	@param value
	 */
   public void setWse213bTFld1(Field source) {
       replace(source,0,source.length(),beginWse213bTFld1,WSE_213B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse213bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse213bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse213bTFld1,WSE_213B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse213bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse213bTFld2
	 *	@return wse213bTFld2
	 */
   public char[] getWse213bTFld2() throws CFException{
     if (isWse213bTFld2Modified()) { 
        wse213bTFld2 = refreshWse213bTFld2();
     }
   		return wse213bTFld2;
   }

  
	/**
	*  set variable wse213bTFld2
	*  Corresponding COBOL Variable is WSE-2-13B-T-FLD2
	*  @param value
	**/
   public void setWse213bTFld2(char[] value) {
      wse213bTFld2 = checkWse213bTFld2Constraints(value);
      serializeWse213bTFld2(wse213bTFld2);
   } 

     /**
	 * 	Update Wse213bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse213bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse213bTFld2,wse213bTFld2.length);
   	
   }
   
   public void setWse213bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld2,wse213bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse213bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse213bTFld2 with another Field
	 *	@param value
	 */
   public void setWse213bTFld2(Field source) {
       replace(source,0,source.length(),beginWse213bTFld2,WSE_213B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse213bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse213bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse213bTFld2,WSE_213B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse213bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse213bTFld3
	 *	@return wse213bTFld3
	 */
   public char[] getWse213bTFld3() throws CFException{
     if (isWse213bTFld3Modified()) { 
        wse213bTFld3 = refreshWse213bTFld3();
     }
   		return wse213bTFld3;
   }

  
	/**
	*  set variable wse213bTFld3
	*  Corresponding COBOL Variable is WSE-2-13B-T-FLD3
	*  @param value
	**/
   public void setWse213bTFld3(char[] value) {
      wse213bTFld3 = checkWse213bTFld3Constraints(value);
      serializeWse213bTFld3(wse213bTFld3);
   } 

     /**
	 * 	Update Wse213bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse213bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse213bTFld3,wse213bTFld3.length);
   	
   }
   
   public void setWse213bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld3,wse213bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse213bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse213bTFld3 with another Field
	 *	@param value
	 */
   public void setWse213bTFld3(Field source) {
       replace(source,0,source.length(),beginWse213bTFld3,WSE_213B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse213bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse213bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse213bTFld3,WSE_213B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse213bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse213bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse213bTFld1(CONSTANTS.SPACE_10);
         setWse213bTFld2(CONSTANTS.SPACE_20);
         setWse213bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse213bTFieldLength() {
			return WSE_213B_T_LENGTH;
		}

}
  
