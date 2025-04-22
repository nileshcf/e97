package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse9bT extends Wse9bTSerialized { 
   

						private char[] wse9bTFld1 = Field.fillLowValue(10);

						private char[] wse9bTFld2 = Field.fillLowValue(20);

						private char[] wse9bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse9bT
	**/
    public Wse9bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse9bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse9bTFld1
	 *	@return wse9bTFld1
	 */
   public char[] getWse9bTFld1() throws CFException{
     if (isWse9bTFld1Modified()) { 
        wse9bTFld1 = refreshWse9bTFld1();
     }
   		return wse9bTFld1;
   }

  
	/**
	*  set variable wse9bTFld1
	*  Corresponding COBOL Variable is WSE-9B-T-FLD1
	*  @param value
	**/
   public void setWse9bTFld1(char[] value) {
      wse9bTFld1 = checkWse9bTFld1Constraints(value);
      serializeWse9bTFld1(wse9bTFld1);
   } 

     /**
	 * 	Update Wse9bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9bTFld1,wse9bTFld1.length);
   	
   }
   
   public void setWse9bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld1,wse9bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse9bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9bTFld1 with another Field
	 *	@param value
	 */
   public void setWse9bTFld1(Field source) {
       replace(source,0,source.length(),beginWse9bTFld1,WSE_9B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9bTFld1,WSE_9B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse9bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9bTFld2
	 *	@return wse9bTFld2
	 */
   public char[] getWse9bTFld2() throws CFException{
     if (isWse9bTFld2Modified()) { 
        wse9bTFld2 = refreshWse9bTFld2();
     }
   		return wse9bTFld2;
   }

  
	/**
	*  set variable wse9bTFld2
	*  Corresponding COBOL Variable is WSE-9B-T-FLD2
	*  @param value
	**/
   public void setWse9bTFld2(char[] value) {
      wse9bTFld2 = checkWse9bTFld2Constraints(value);
      serializeWse9bTFld2(wse9bTFld2);
   } 

     /**
	 * 	Update Wse9bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9bTFld2,wse9bTFld2.length);
   	
   }
   
   public void setWse9bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld2,wse9bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse9bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9bTFld2 with another Field
	 *	@param value
	 */
   public void setWse9bTFld2(Field source) {
       replace(source,0,source.length(),beginWse9bTFld2,WSE_9B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9bTFld2,WSE_9B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse9bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9bTFld3
	 *	@return wse9bTFld3
	 */
   public char[] getWse9bTFld3() throws CFException{
     if (isWse9bTFld3Modified()) { 
        wse9bTFld3 = refreshWse9bTFld3();
     }
   		return wse9bTFld3;
   }

  
	/**
	*  set variable wse9bTFld3
	*  Corresponding COBOL Variable is WSE-9B-T-FLD3
	*  @param value
	**/
   public void setWse9bTFld3(char[] value) {
      wse9bTFld3 = checkWse9bTFld3Constraints(value);
      serializeWse9bTFld3(wse9bTFld3);
   } 

     /**
	 * 	Update Wse9bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9bTFld3,wse9bTFld3.length);
   	
   }
   
   public void setWse9bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld3,wse9bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse9bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9bTFld3 with another Field
	 *	@param value
	 */
   public void setWse9bTFld3(Field source) {
       replace(source,0,source.length(),beginWse9bTFld3,WSE_9B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9bTFld3,WSE_9B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse9bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse9bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse9bTFld1(CONSTANTS.SPACE_10);
         setWse9bTFld2(CONSTANTS.SPACE_20);
         setWse9bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse9bTFieldLength() {
			return WSE_9B_T_LENGTH;
		}

}
  
