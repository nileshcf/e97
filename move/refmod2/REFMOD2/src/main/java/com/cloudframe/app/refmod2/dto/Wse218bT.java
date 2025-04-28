package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse218bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse218bT extends Wse218bTSerialized { 
   

						private char[] wse218bTFld1 = Field.fillLowValue(10);

						private char[] wse218bTFld2 = Field.fillLowValue(20);

						private char[] wse218bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse218bT
	**/
    public Wse218bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse218bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse218bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse218bTFld1
	 *	@return wse218bTFld1
	 */
   public char[] getWse218bTFld1() throws CFException{
     if (isWse218bTFld1Modified()) { 
        wse218bTFld1 = refreshWse218bTFld1();
     }
   		return wse218bTFld1;
   }

  
	/**
	*  set variable wse218bTFld1
	*  Corresponding COBOL Variable is WSE-2-18B-T-FLD1
	*  @param value
	**/
   public void setWse218bTFld1(char[] value) {
      wse218bTFld1 = checkWse218bTFld1Constraints(value);
      serializeWse218bTFld1(wse218bTFld1);
   } 

     /**
	 * 	Update Wse218bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse218bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse218bTFld1,wse218bTFld1.length);
   	
   }
   
   public void setWse218bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld1,wse218bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse218bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse218bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse218bTFld1 with another Field
	 *	@param value
	 */
   public void setWse218bTFld1(Field source) {
       replace(source,0,source.length(),beginWse218bTFld1,WSE_218B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse218bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse218bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse218bTFld1,WSE_218B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse218bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse218bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse218bTFld2
	 *	@return wse218bTFld2
	 */
   public char[] getWse218bTFld2() throws CFException{
     if (isWse218bTFld2Modified()) { 
        wse218bTFld2 = refreshWse218bTFld2();
     }
   		return wse218bTFld2;
   }

  
	/**
	*  set variable wse218bTFld2
	*  Corresponding COBOL Variable is WSE-2-18B-T-FLD2
	*  @param value
	**/
   public void setWse218bTFld2(char[] value) {
      wse218bTFld2 = checkWse218bTFld2Constraints(value);
      serializeWse218bTFld2(wse218bTFld2);
   } 

     /**
	 * 	Update Wse218bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse218bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse218bTFld2,wse218bTFld2.length);
   	
   }
   
   public void setWse218bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld2,wse218bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse218bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse218bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse218bTFld2 with another Field
	 *	@param value
	 */
   public void setWse218bTFld2(Field source) {
       replace(source,0,source.length(),beginWse218bTFld2,WSE_218B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse218bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse218bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse218bTFld2,WSE_218B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse218bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse218bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse218bTFld3
	 *	@return wse218bTFld3
	 */
   public char[] getWse218bTFld3() throws CFException{
     if (isWse218bTFld3Modified()) { 
        wse218bTFld3 = refreshWse218bTFld3();
     }
   		return wse218bTFld3;
   }

  
	/**
	*  set variable wse218bTFld3
	*  Corresponding COBOL Variable is WSE-2-18B-T-FLD3
	*  @param value
	**/
   public void setWse218bTFld3(char[] value) {
      wse218bTFld3 = checkWse218bTFld3Constraints(value);
      serializeWse218bTFld3(wse218bTFld3);
   } 

     /**
	 * 	Update Wse218bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse218bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse218bTFld3,wse218bTFld3.length);
   	
   }
   
   public void setWse218bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld3,wse218bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse218bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse218bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse218bTFld3 with another Field
	 *	@param value
	 */
   public void setWse218bTFld3(Field source) {
       replace(source,0,source.length(),beginWse218bTFld3,WSE_218B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse218bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse218bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse218bTFld3,WSE_218B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse218bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse218bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse218bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse218bTFld1(CONSTANTS.SPACE_10);
         setWse218bTFld2(CONSTANTS.SPACE_20);
         setWse218bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse218bTFieldLength() {
			return WSE_218B_T_LENGTH;
		}

}
  
