package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse7bT extends Wse7bTSerialized { 
   

						private char[] wse7bTFld1 = Field.fillLowValue(10);

						private char[] wse7bTFld2 = Field.fillLowValue(20);

						private char[] wse7bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse7bT
	**/
    public Wse7bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse7bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse7bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse7bTFld1
	 *	@return wse7bTFld1
	 */
   public char[] getWse7bTFld1() throws CFException{
     if (isWse7bTFld1Modified()) { 
        wse7bTFld1 = refreshWse7bTFld1();
     }
   		return wse7bTFld1;
   }

  
	/**
	*  set variable wse7bTFld1
	*  Corresponding COBOL Variable is WSE-7B-T-FLD1
	*  @param value
	**/
   public void setWse7bTFld1(char[] value) {
      wse7bTFld1 = checkWse7bTFld1Constraints(value);
      serializeWse7bTFld1(wse7bTFld1);
   } 

     /**
	 * 	Update Wse7bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7bTFld1,wse7bTFld1.length);
   	
   }
   
   public void setWse7bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld1,wse7bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse7bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7bTFld1 with another Field
	 *	@param value
	 */
   public void setWse7bTFld1(Field source) {
       replace(source,0,source.length(),beginWse7bTFld1,WSE_7B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7bTFld1,WSE_7B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse7bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse7bTFld2
	 *	@return wse7bTFld2
	 */
   public char[] getWse7bTFld2() throws CFException{
     if (isWse7bTFld2Modified()) { 
        wse7bTFld2 = refreshWse7bTFld2();
     }
   		return wse7bTFld2;
   }

  
	/**
	*  set variable wse7bTFld2
	*  Corresponding COBOL Variable is WSE-7B-T-FLD2
	*  @param value
	**/
   public void setWse7bTFld2(char[] value) {
      wse7bTFld2 = checkWse7bTFld2Constraints(value);
      serializeWse7bTFld2(wse7bTFld2);
   } 

     /**
	 * 	Update Wse7bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7bTFld2,wse7bTFld2.length);
   	
   }
   
   public void setWse7bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld2,wse7bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse7bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7bTFld2 with another Field
	 *	@param value
	 */
   public void setWse7bTFld2(Field source) {
       replace(source,0,source.length(),beginWse7bTFld2,WSE_7B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7bTFld2,WSE_7B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse7bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse7bTFld3
	 *	@return wse7bTFld3
	 */
   public char[] getWse7bTFld3() throws CFException{
     if (isWse7bTFld3Modified()) { 
        wse7bTFld3 = refreshWse7bTFld3();
     }
   		return wse7bTFld3;
   }

  
	/**
	*  set variable wse7bTFld3
	*  Corresponding COBOL Variable is WSE-7B-T-FLD3
	*  @param value
	**/
   public void setWse7bTFld3(char[] value) {
      wse7bTFld3 = checkWse7bTFld3Constraints(value);
      serializeWse7bTFld3(wse7bTFld3);
   } 

     /**
	 * 	Update Wse7bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7bTFld3,wse7bTFld3.length);
   	
   }
   
   public void setWse7bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld3,wse7bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse7bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7bTFld3 with another Field
	 *	@param value
	 */
   public void setWse7bTFld3(Field source) {
       replace(source,0,source.length(),beginWse7bTFld3,WSE_7B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7bTFld3,WSE_7B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse7bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse7bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse7bTFld1(CONSTANTS.SPACE_10);
         setWse7bTFld2(CONSTANTS.SPACE_20);
         setWse7bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse7bTFieldLength() {
			return WSE_7B_T_LENGTH;
		}

}
  
