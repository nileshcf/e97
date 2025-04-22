package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse11bT extends Wse11bTSerialized { 
   

						private char[] wse11bTFld1 = Field.fillLowValue(10);

						private char[] wse11bTFld2 = Field.fillLowValue(20);

						private char[] wse11bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse11bT
	**/
    public Wse11bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse11bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse11bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse11bTFld1
	 *	@return wse11bTFld1
	 */
   public char[] getWse11bTFld1() throws CFException{
     if (isWse11bTFld1Modified()) { 
        wse11bTFld1 = refreshWse11bTFld1();
     }
   		return wse11bTFld1;
   }

  
	/**
	*  set variable wse11bTFld1
	*  Corresponding COBOL Variable is WSE-11B-T-FLD1
	*  @param value
	**/
   public void setWse11bTFld1(char[] value) {
      wse11bTFld1 = checkWse11bTFld1Constraints(value);
      serializeWse11bTFld1(wse11bTFld1);
   } 

     /**
	 * 	Update Wse11bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse11bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse11bTFld1,wse11bTFld1.length);
   	
   }
   
   public void setWse11bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld1,wse11bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse11bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse11bTFld1 with another Field
	 *	@param value
	 */
   public void setWse11bTFld1(Field source) {
       replace(source,0,source.length(),beginWse11bTFld1,WSE_11B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse11bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse11bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse11bTFld1,WSE_11B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse11bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse11bTFld2
	 *	@return wse11bTFld2
	 */
   public char[] getWse11bTFld2() throws CFException{
     if (isWse11bTFld2Modified()) { 
        wse11bTFld2 = refreshWse11bTFld2();
     }
   		return wse11bTFld2;
   }

  
	/**
	*  set variable wse11bTFld2
	*  Corresponding COBOL Variable is WSE-11B-T-FLD2
	*  @param value
	**/
   public void setWse11bTFld2(char[] value) {
      wse11bTFld2 = checkWse11bTFld2Constraints(value);
      serializeWse11bTFld2(wse11bTFld2);
   } 

     /**
	 * 	Update Wse11bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse11bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse11bTFld2,wse11bTFld2.length);
   	
   }
   
   public void setWse11bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld2,wse11bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse11bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse11bTFld2 with another Field
	 *	@param value
	 */
   public void setWse11bTFld2(Field source) {
       replace(source,0,source.length(),beginWse11bTFld2,WSE_11B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse11bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse11bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse11bTFld2,WSE_11B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse11bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse11bTFld3
	 *	@return wse11bTFld3
	 */
   public char[] getWse11bTFld3() throws CFException{
     if (isWse11bTFld3Modified()) { 
        wse11bTFld3 = refreshWse11bTFld3();
     }
   		return wse11bTFld3;
   }

  
	/**
	*  set variable wse11bTFld3
	*  Corresponding COBOL Variable is WSE-11B-T-FLD3
	*  @param value
	**/
   public void setWse11bTFld3(char[] value) {
      wse11bTFld3 = checkWse11bTFld3Constraints(value);
      serializeWse11bTFld3(wse11bTFld3);
   } 

     /**
	 * 	Update Wse11bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse11bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse11bTFld3,wse11bTFld3.length);
   	
   }
   
   public void setWse11bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld3,wse11bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse11bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse11bTFld3 with another Field
	 *	@param value
	 */
   public void setWse11bTFld3(Field source) {
       replace(source,0,source.length(),beginWse11bTFld3,WSE_11B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse11bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse11bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse11bTFld3,WSE_11B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse11bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse11bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse11bTFld1(CONSTANTS.SPACE_10);
         setWse11bTFld2(CONSTANTS.SPACE_20);
         setWse11bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse11bTFieldLength() {
			return WSE_11B_T_LENGTH;
		}

}
  
