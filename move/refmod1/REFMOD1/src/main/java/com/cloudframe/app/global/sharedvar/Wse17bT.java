package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse17bT extends Wse17bTSerialized { 
   

						private char[] wse17bTFld1 = Field.fillLowValue(10);

						private char[] wse17bTFld2 = Field.fillLowValue(20);

						private char[] wse17bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse17bT
	**/
    public Wse17bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse17bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse17bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse17bTFld1
	 *	@return wse17bTFld1
	 */
   public char[] getWse17bTFld1() throws CFException{
     if (isWse17bTFld1Modified()) { 
        wse17bTFld1 = refreshWse17bTFld1();
     }
   		return wse17bTFld1;
   }

  
	/**
	*  set variable wse17bTFld1
	*  Corresponding COBOL Variable is WSE-17B-T-FLD1
	*  @param value
	**/
   public void setWse17bTFld1(char[] value) {
      wse17bTFld1 = checkWse17bTFld1Constraints(value);
      serializeWse17bTFld1(wse17bTFld1);
   } 

     /**
	 * 	Update Wse17bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17bTFld1,wse17bTFld1.length);
   	
   }
   
   public void setWse17bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld1,wse17bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse17bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17bTFld1 with another Field
	 *	@param value
	 */
   public void setWse17bTFld1(Field source) {
       replace(source,0,source.length(),beginWse17bTFld1,WSE_17B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17bTFld1,WSE_17B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse17bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse17bTFld2
	 *	@return wse17bTFld2
	 */
   public char[] getWse17bTFld2() throws CFException{
     if (isWse17bTFld2Modified()) { 
        wse17bTFld2 = refreshWse17bTFld2();
     }
   		return wse17bTFld2;
   }

  
	/**
	*  set variable wse17bTFld2
	*  Corresponding COBOL Variable is WSE-17B-T-FLD2
	*  @param value
	**/
   public void setWse17bTFld2(char[] value) {
      wse17bTFld2 = checkWse17bTFld2Constraints(value);
      serializeWse17bTFld2(wse17bTFld2);
   } 

     /**
	 * 	Update Wse17bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17bTFld2,wse17bTFld2.length);
   	
   }
   
   public void setWse17bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld2,wse17bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse17bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17bTFld2 with another Field
	 *	@param value
	 */
   public void setWse17bTFld2(Field source) {
       replace(source,0,source.length(),beginWse17bTFld2,WSE_17B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17bTFld2,WSE_17B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse17bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse17bTFld3
	 *	@return wse17bTFld3
	 */
   public char[] getWse17bTFld3() throws CFException{
     if (isWse17bTFld3Modified()) { 
        wse17bTFld3 = refreshWse17bTFld3();
     }
   		return wse17bTFld3;
   }

  
	/**
	*  set variable wse17bTFld3
	*  Corresponding COBOL Variable is WSE-17B-T-FLD3
	*  @param value
	**/
   public void setWse17bTFld3(char[] value) {
      wse17bTFld3 = checkWse17bTFld3Constraints(value);
      serializeWse17bTFld3(wse17bTFld3);
   } 

     /**
	 * 	Update Wse17bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17bTFld3,wse17bTFld3.length);
   	
   }
   
   public void setWse17bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld3,wse17bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse17bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17bTFld3 with another Field
	 *	@param value
	 */
   public void setWse17bTFld3(Field source) {
       replace(source,0,source.length(),beginWse17bTFld3,WSE_17B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17bTFld3,WSE_17B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse17bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse17bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse17bTFld1(CONSTANTS.SPACE_10);
         setWse17bTFld2(CONSTANTS.SPACE_20);
         setWse17bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse17bTFieldLength() {
			return WSE_17B_T_LENGTH;
		}

}
  
