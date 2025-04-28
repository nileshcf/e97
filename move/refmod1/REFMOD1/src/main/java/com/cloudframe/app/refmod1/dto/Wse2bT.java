package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse2bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse2bT extends Wse2bTSerialized { 
   

						private char[] wse2bTFld1 = Field.fillLowValue(10);

						private char[] wse2bTFld2 = Field.fillLowValue(20);

						private char[] wse2bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse2bT
	**/
    public Wse2bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse2bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse2bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse2bTFld1
	 *	@return wse2bTFld1
	 */
   public char[] getWse2bTFld1() throws CFException{
     if (isWse2bTFld1Modified()) { 
        wse2bTFld1 = refreshWse2bTFld1();
     }
   		return wse2bTFld1;
   }

  
	/**
	*  set variable wse2bTFld1
	*  Corresponding COBOL Variable is WSE-2B-T-FLD1
	*  @param value
	**/
   public void setWse2bTFld1(char[] value) {
      wse2bTFld1 = checkWse2bTFld1Constraints(value);
      serializeWse2bTFld1(wse2bTFld1);
   } 

     /**
	 * 	Update Wse2bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse2bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse2bTFld1,wse2bTFld1.length);
   	
   }
   
   public void setWse2bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld1,wse2bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse2bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse2bTFld1 with another Field
	 *	@param value
	 */
   public void setWse2bTFld1(Field source) {
       replace(source,0,source.length(),beginWse2bTFld1,WSE_2B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse2bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse2bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse2bTFld1,WSE_2B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse2bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse2bTFld2
	 *	@return wse2bTFld2
	 */
   public char[] getWse2bTFld2() throws CFException{
     if (isWse2bTFld2Modified()) { 
        wse2bTFld2 = refreshWse2bTFld2();
     }
   		return wse2bTFld2;
   }

  
	/**
	*  set variable wse2bTFld2
	*  Corresponding COBOL Variable is WSE-2B-T-FLD2
	*  @param value
	**/
   public void setWse2bTFld2(char[] value) {
      wse2bTFld2 = checkWse2bTFld2Constraints(value);
      serializeWse2bTFld2(wse2bTFld2);
   } 

     /**
	 * 	Update Wse2bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse2bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse2bTFld2,wse2bTFld2.length);
   	
   }
   
   public void setWse2bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld2,wse2bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse2bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse2bTFld2 with another Field
	 *	@param value
	 */
   public void setWse2bTFld2(Field source) {
       replace(source,0,source.length(),beginWse2bTFld2,WSE_2B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse2bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse2bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse2bTFld2,WSE_2B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse2bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse2bTFld3
	 *	@return wse2bTFld3
	 */
   public char[] getWse2bTFld3() throws CFException{
     if (isWse2bTFld3Modified()) { 
        wse2bTFld3 = refreshWse2bTFld3();
     }
   		return wse2bTFld3;
   }

  
	/**
	*  set variable wse2bTFld3
	*  Corresponding COBOL Variable is WSE-2B-T-FLD3
	*  @param value
	**/
   public void setWse2bTFld3(char[] value) {
      wse2bTFld3 = checkWse2bTFld3Constraints(value);
      serializeWse2bTFld3(wse2bTFld3);
   } 

     /**
	 * 	Update Wse2bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse2bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse2bTFld3,wse2bTFld3.length);
   	
   }
   
   public void setWse2bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld3,wse2bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse2bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse2bTFld3 with another Field
	 *	@param value
	 */
   public void setWse2bTFld3(Field source) {
       replace(source,0,source.length(),beginWse2bTFld3,WSE_2B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse2bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse2bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse2bTFld3,WSE_2B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse2bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse2bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse2bTFld1(CONSTANTS.SPACE_10);
         setWse2bTFld2(CONSTANTS.SPACE_20);
         setWse2bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse2bTFieldLength() {
			return WSE_2B_T_LENGTH;
		}

}
  
