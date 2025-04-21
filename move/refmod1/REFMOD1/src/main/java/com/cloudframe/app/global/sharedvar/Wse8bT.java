package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse8bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse8bT extends Wse8bTSerialized { 
   

						private char[] wse8bTFld1 = Field.fillLowValue(10);

						private char[] wse8bTFld2 = Field.fillLowValue(20);

						private char[] wse8bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse8bT
	**/
    public Wse8bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse8bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse8bTFld1
	 *	@return wse8bTFld1
	 */
   public char[] getWse8bTFld1() throws CFException{
     if (isWse8bTFld1Modified()) { 
        wse8bTFld1 = refreshWse8bTFld1();
     }
   		return wse8bTFld1;
   }

  
	/**
	*  set variable wse8bTFld1
	*  Corresponding COBOL Variable is WSE-8B-T-FLD1
	*  @param value
	**/
   public void setWse8bTFld1(char[] value) {
      wse8bTFld1 = checkWse8bTFld1Constraints(value);
      serializeWse8bTFld1(wse8bTFld1);
   } 

     /**
	 * 	Update Wse8bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse8bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse8bTFld1,wse8bTFld1.length);
   	
   }
   
   public void setWse8bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld1,wse8bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse8bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse8bTFld1 with another Field
	 *	@param value
	 */
   public void setWse8bTFld1(Field source) {
       replace(source,0,source.length(),beginWse8bTFld1,WSE_8B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse8bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse8bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse8bTFld1,WSE_8B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse8bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse8bTFld2
	 *	@return wse8bTFld2
	 */
   public char[] getWse8bTFld2() throws CFException{
     if (isWse8bTFld2Modified()) { 
        wse8bTFld2 = refreshWse8bTFld2();
     }
   		return wse8bTFld2;
   }

  
	/**
	*  set variable wse8bTFld2
	*  Corresponding COBOL Variable is WSE-8B-T-FLD2
	*  @param value
	**/
   public void setWse8bTFld2(char[] value) {
      wse8bTFld2 = checkWse8bTFld2Constraints(value);
      serializeWse8bTFld2(wse8bTFld2);
   } 

     /**
	 * 	Update Wse8bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse8bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse8bTFld2,wse8bTFld2.length);
   	
   }
   
   public void setWse8bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld2,wse8bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse8bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse8bTFld2 with another Field
	 *	@param value
	 */
   public void setWse8bTFld2(Field source) {
       replace(source,0,source.length(),beginWse8bTFld2,WSE_8B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse8bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse8bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse8bTFld2,WSE_8B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse8bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse8bTFld3
	 *	@return wse8bTFld3
	 */
   public char[] getWse8bTFld3() throws CFException{
     if (isWse8bTFld3Modified()) { 
        wse8bTFld3 = refreshWse8bTFld3();
     }
   		return wse8bTFld3;
   }

  
	/**
	*  set variable wse8bTFld3
	*  Corresponding COBOL Variable is WSE-8B-T-FLD3
	*  @param value
	**/
   public void setWse8bTFld3(char[] value) {
      wse8bTFld3 = checkWse8bTFld3Constraints(value);
      serializeWse8bTFld3(wse8bTFld3);
   } 

     /**
	 * 	Update Wse8bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse8bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse8bTFld3,wse8bTFld3.length);
   	
   }
   
   public void setWse8bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld3,wse8bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse8bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse8bTFld3 with another Field
	 *	@param value
	 */
   public void setWse8bTFld3(Field source) {
       replace(source,0,source.length(),beginWse8bTFld3,WSE_8B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse8bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse8bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse8bTFld3,WSE_8B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse8bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse8bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse8bTFld1(CONSTANTS.SPACE_10);
         setWse8bTFld2(CONSTANTS.SPACE_20);
         setWse8bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse8bTFieldLength() {
			return WSE_8B_T_LENGTH;
		}

}
  
