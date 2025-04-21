package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse15bT extends Wse15bTSerialized { 
   

						private char[] wse15bTFld1 = Field.fillLowValue(10);

						private char[] wse15bTFld2 = Field.fillLowValue(20);

						private char[] wse15bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse15bT
	**/
    public Wse15bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse15bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse15bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse15bTFld1
	 *	@return wse15bTFld1
	 */
   public char[] getWse15bTFld1() throws CFException{
     if (isWse15bTFld1Modified()) { 
        wse15bTFld1 = refreshWse15bTFld1();
     }
   		return wse15bTFld1;
   }

  
	/**
	*  set variable wse15bTFld1
	*  Corresponding COBOL Variable is WSE-15B-T-FLD1
	*  @param value
	**/
   public void setWse15bTFld1(char[] value) {
      wse15bTFld1 = checkWse15bTFld1Constraints(value);
      serializeWse15bTFld1(wse15bTFld1);
   } 

     /**
	 * 	Update Wse15bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15bTFld1,wse15bTFld1.length);
   	
   }
   
   public void setWse15bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld1,wse15bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse15bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15bTFld1 with another Field
	 *	@param value
	 */
   public void setWse15bTFld1(Field source) {
       replace(source,0,source.length(),beginWse15bTFld1,WSE_15B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15bTFld1,WSE_15B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse15bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse15bTFld2
	 *	@return wse15bTFld2
	 */
   public char[] getWse15bTFld2() throws CFException{
     if (isWse15bTFld2Modified()) { 
        wse15bTFld2 = refreshWse15bTFld2();
     }
   		return wse15bTFld2;
   }

  
	/**
	*  set variable wse15bTFld2
	*  Corresponding COBOL Variable is WSE-15B-T-FLD2
	*  @param value
	**/
   public void setWse15bTFld2(char[] value) {
      wse15bTFld2 = checkWse15bTFld2Constraints(value);
      serializeWse15bTFld2(wse15bTFld2);
   } 

     /**
	 * 	Update Wse15bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15bTFld2,wse15bTFld2.length);
   	
   }
   
   public void setWse15bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld2,wse15bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse15bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15bTFld2 with another Field
	 *	@param value
	 */
   public void setWse15bTFld2(Field source) {
       replace(source,0,source.length(),beginWse15bTFld2,WSE_15B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15bTFld2,WSE_15B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse15bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse15bTFld3
	 *	@return wse15bTFld3
	 */
   public char[] getWse15bTFld3() throws CFException{
     if (isWse15bTFld3Modified()) { 
        wse15bTFld3 = refreshWse15bTFld3();
     }
   		return wse15bTFld3;
   }

  
	/**
	*  set variable wse15bTFld3
	*  Corresponding COBOL Variable is WSE-15B-T-FLD3
	*  @param value
	**/
   public void setWse15bTFld3(char[] value) {
      wse15bTFld3 = checkWse15bTFld3Constraints(value);
      serializeWse15bTFld3(wse15bTFld3);
   } 

     /**
	 * 	Update Wse15bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15bTFld3,wse15bTFld3.length);
   	
   }
   
   public void setWse15bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld3,wse15bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse15bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15bTFld3 with another Field
	 *	@param value
	 */
   public void setWse15bTFld3(Field source) {
       replace(source,0,source.length(),beginWse15bTFld3,WSE_15B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15bTFld3,WSE_15B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse15bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse15bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse15bTFld1(CONSTANTS.SPACE_10);
         setWse15bTFld2(CONSTANTS.SPACE_20);
         setWse15bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse15bTFieldLength() {
			return WSE_15B_T_LENGTH;
		}

}
  
