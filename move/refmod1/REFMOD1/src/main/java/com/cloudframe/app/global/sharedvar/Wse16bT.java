package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse16bT extends Wse16bTSerialized { 
   

						private char[] wse16bTFld1 = Field.fillLowValue(10);

						private char[] wse16bTFld2 = Field.fillLowValue(20);

						private char[] wse16bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse16bT
	**/
    public Wse16bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse16bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse16bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse16bTFld1
	 *	@return wse16bTFld1
	 */
   public char[] getWse16bTFld1() throws CFException{
     if (isWse16bTFld1Modified()) { 
        wse16bTFld1 = refreshWse16bTFld1();
     }
   		return wse16bTFld1;
   }

  
	/**
	*  set variable wse16bTFld1
	*  Corresponding COBOL Variable is WSE-16B-T-FLD1
	*  @param value
	**/
   public void setWse16bTFld1(char[] value) {
      wse16bTFld1 = checkWse16bTFld1Constraints(value);
      serializeWse16bTFld1(wse16bTFld1);
   } 

     /**
	 * 	Update Wse16bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16bTFld1,wse16bTFld1.length);
   	
   }
   
   public void setWse16bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld1,wse16bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse16bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16bTFld1 with another Field
	 *	@param value
	 */
   public void setWse16bTFld1(Field source) {
       replace(source,0,source.length(),beginWse16bTFld1,WSE_16B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16bTFld1,WSE_16B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse16bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse16bTFld2
	 *	@return wse16bTFld2
	 */
   public char[] getWse16bTFld2() throws CFException{
     if (isWse16bTFld2Modified()) { 
        wse16bTFld2 = refreshWse16bTFld2();
     }
   		return wse16bTFld2;
   }

  
	/**
	*  set variable wse16bTFld2
	*  Corresponding COBOL Variable is WSE-16B-T-FLD2
	*  @param value
	**/
   public void setWse16bTFld2(char[] value) {
      wse16bTFld2 = checkWse16bTFld2Constraints(value);
      serializeWse16bTFld2(wse16bTFld2);
   } 

     /**
	 * 	Update Wse16bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16bTFld2,wse16bTFld2.length);
   	
   }
   
   public void setWse16bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld2,wse16bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse16bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16bTFld2 with another Field
	 *	@param value
	 */
   public void setWse16bTFld2(Field source) {
       replace(source,0,source.length(),beginWse16bTFld2,WSE_16B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16bTFld2,WSE_16B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse16bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse16bTFld3
	 *	@return wse16bTFld3
	 */
   public char[] getWse16bTFld3() throws CFException{
     if (isWse16bTFld3Modified()) { 
        wse16bTFld3 = refreshWse16bTFld3();
     }
   		return wse16bTFld3;
   }

  
	/**
	*  set variable wse16bTFld3
	*  Corresponding COBOL Variable is WSE-16B-T-FLD3
	*  @param value
	**/
   public void setWse16bTFld3(char[] value) {
      wse16bTFld3 = checkWse16bTFld3Constraints(value);
      serializeWse16bTFld3(wse16bTFld3);
   } 

     /**
	 * 	Update Wse16bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16bTFld3,wse16bTFld3.length);
   	
   }
   
   public void setWse16bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld3,wse16bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse16bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16bTFld3 with another Field
	 *	@param value
	 */
   public void setWse16bTFld3(Field source) {
       replace(source,0,source.length(),beginWse16bTFld3,WSE_16B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16bTFld3,WSE_16B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse16bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse16bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse16bTFld1(CONSTANTS.SPACE_10);
         setWse16bTFld2(CONSTANTS.SPACE_20);
         setWse16bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse16bTFieldLength() {
			return WSE_16B_T_LENGTH;
		}

}
  
