package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse18bT extends Wse18bTSerialized { 
   

						private char[] wse18bTFld1 = Field.fillLowValue(10);

						private char[] wse18bTFld2 = Field.fillLowValue(20);

						private char[] wse18bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse18bT
	**/
    public Wse18bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse18bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse18bTFld1
	 *	@return wse18bTFld1
	 */
   public char[] getWse18bTFld1() throws CFException{
     if (isWse18bTFld1Modified()) { 
        wse18bTFld1 = refreshWse18bTFld1();
     }
   		return wse18bTFld1;
   }

  
	/**
	*  set variable wse18bTFld1
	*  Corresponding COBOL Variable is WSE-18B-T-FLD1
	*  @param value
	**/
   public void setWse18bTFld1(char[] value) {
      wse18bTFld1 = checkWse18bTFld1Constraints(value);
      serializeWse18bTFld1(wse18bTFld1);
   } 

     /**
	 * 	Update Wse18bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse18bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse18bTFld1,wse18bTFld1.length);
   	
   }
   
   public void setWse18bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld1,wse18bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse18bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse18bTFld1 with another Field
	 *	@param value
	 */
   public void setWse18bTFld1(Field source) {
       replace(source,0,source.length(),beginWse18bTFld1,WSE_18B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse18bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse18bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse18bTFld1,WSE_18B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse18bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse18bTFld2
	 *	@return wse18bTFld2
	 */
   public char[] getWse18bTFld2() throws CFException{
     if (isWse18bTFld2Modified()) { 
        wse18bTFld2 = refreshWse18bTFld2();
     }
   		return wse18bTFld2;
   }

  
	/**
	*  set variable wse18bTFld2
	*  Corresponding COBOL Variable is WSE-18B-T-FLD2
	*  @param value
	**/
   public void setWse18bTFld2(char[] value) {
      wse18bTFld2 = checkWse18bTFld2Constraints(value);
      serializeWse18bTFld2(wse18bTFld2);
   } 

     /**
	 * 	Update Wse18bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse18bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse18bTFld2,wse18bTFld2.length);
   	
   }
   
   public void setWse18bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld2,wse18bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse18bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse18bTFld2 with another Field
	 *	@param value
	 */
   public void setWse18bTFld2(Field source) {
       replace(source,0,source.length(),beginWse18bTFld2,WSE_18B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse18bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse18bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse18bTFld2,WSE_18B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse18bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse18bTFld3
	 *	@return wse18bTFld3
	 */
   public char[] getWse18bTFld3() throws CFException{
     if (isWse18bTFld3Modified()) { 
        wse18bTFld3 = refreshWse18bTFld3();
     }
   		return wse18bTFld3;
   }

  
	/**
	*  set variable wse18bTFld3
	*  Corresponding COBOL Variable is WSE-18B-T-FLD3
	*  @param value
	**/
   public void setWse18bTFld3(char[] value) {
      wse18bTFld3 = checkWse18bTFld3Constraints(value);
      serializeWse18bTFld3(wse18bTFld3);
   } 

     /**
	 * 	Update Wse18bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse18bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse18bTFld3,wse18bTFld3.length);
   	
   }
   
   public void setWse18bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld3,wse18bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse18bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse18bTFld3 with another Field
	 *	@param value
	 */
   public void setWse18bTFld3(Field source) {
       replace(source,0,source.length(),beginWse18bTFld3,WSE_18B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse18bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse18bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse18bTFld3,WSE_18B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse18bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse18bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse18bTFld1(CONSTANTS.SPACE_10);
         setWse18bTFld2(CONSTANTS.SPACE_20);
         setWse18bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse18bTFieldLength() {
			return WSE_18B_T_LENGTH;
		}

}
  
