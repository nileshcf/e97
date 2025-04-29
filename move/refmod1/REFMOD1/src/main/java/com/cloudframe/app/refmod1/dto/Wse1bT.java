package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse1bT extends Wse1bTSerialized { 
   

						private char[] wse1bTFld1 = Field.fillLowValue(10);

						private char[] wse1bTFld2 = Field.fillLowValue(20);

						private char[] wse1bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse1bT
	**/
    public Wse1bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse1bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse1bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse1bTFld1
	 *	@return wse1bTFld1
	 */
   public char[] getWse1bTFld1() throws CFException{
     if (isWse1bTFld1Modified()) { 
        wse1bTFld1 = refreshWse1bTFld1();
     }
   		return wse1bTFld1;
   }

  
	/**
	*  set variable wse1bTFld1
	*  Corresponding COBOL Variable is WSE-1B-T-FLD1
	*  @param value
	**/
   public void setWse1bTFld1(char[] value) {
      wse1bTFld1 = checkWse1bTFld1Constraints(value);
      serializeWse1bTFld1(wse1bTFld1);
   } 

     /**
	 * 	Update Wse1bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1bTFld1,wse1bTFld1.length);
   	
   }
   
   public void setWse1bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld1,wse1bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse1bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1bTFld1 with another Field
	 *	@param value
	 */
   public void setWse1bTFld1(Field source) {
       replace(source,0,source.length(),beginWse1bTFld1,WSE_1B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1bTFld1,WSE_1B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse1bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse1bTFld2
	 *	@return wse1bTFld2
	 */
   public char[] getWse1bTFld2() throws CFException{
     if (isWse1bTFld2Modified()) { 
        wse1bTFld2 = refreshWse1bTFld2();
     }
   		return wse1bTFld2;
   }

  
	/**
	*  set variable wse1bTFld2
	*  Corresponding COBOL Variable is WSE-1B-T-FLD2
	*  @param value
	**/
   public void setWse1bTFld2(char[] value) {
      wse1bTFld2 = checkWse1bTFld2Constraints(value);
      serializeWse1bTFld2(wse1bTFld2);
   } 

     /**
	 * 	Update Wse1bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1bTFld2,wse1bTFld2.length);
   	
   }
   
   public void setWse1bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld2,wse1bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse1bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1bTFld2 with another Field
	 *	@param value
	 */
   public void setWse1bTFld2(Field source) {
       replace(source,0,source.length(),beginWse1bTFld2,WSE_1B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1bTFld2,WSE_1B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse1bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse1bTFld3
	 *	@return wse1bTFld3
	 */
   public char[] getWse1bTFld3() throws CFException{
     if (isWse1bTFld3Modified()) { 
        wse1bTFld3 = refreshWse1bTFld3();
     }
   		return wse1bTFld3;
   }

  
	/**
	*  set variable wse1bTFld3
	*  Corresponding COBOL Variable is WSE-1B-T-FLD3
	*  @param value
	**/
   public void setWse1bTFld3(char[] value) {
      wse1bTFld3 = checkWse1bTFld3Constraints(value);
      serializeWse1bTFld3(wse1bTFld3);
   } 

     /**
	 * 	Update Wse1bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1bTFld3,wse1bTFld3.length);
   	
   }
   
   public void setWse1bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld3,wse1bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse1bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1bTFld3 with another Field
	 *	@param value
	 */
   public void setWse1bTFld3(Field source) {
       replace(source,0,source.length(),beginWse1bTFld3,WSE_1B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1bTFld3,WSE_1B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse1bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse1bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse1bTFld1(CONSTANTS.SPACE_10);
         setWse1bTFld2(CONSTANTS.SPACE_20);
         setWse1bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse1bTFieldLength() {
			return WSE_1B_T_LENGTH;
		}

}
  
