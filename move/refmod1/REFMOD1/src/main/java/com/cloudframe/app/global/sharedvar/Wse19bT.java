package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse19bT extends Wse19bTSerialized { 
   

						private char[] wse19bTFld1 = Field.fillLowValue(10);

						private char[] wse19bTFld2 = Field.fillLowValue(20);

						private char[] wse19bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse19bT
	**/
    public Wse19bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse19bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse19bTFld1
	 *	@return wse19bTFld1
	 */
   public char[] getWse19bTFld1() throws CFException{
     if (isWse19bTFld1Modified()) { 
        wse19bTFld1 = refreshWse19bTFld1();
     }
   		return wse19bTFld1;
   }

  
	/**
	*  set variable wse19bTFld1
	*  Corresponding COBOL Variable is WSE-19B-T-FLD1
	*  @param value
	**/
   public void setWse19bTFld1(char[] value) {
      wse19bTFld1 = checkWse19bTFld1Constraints(value);
      serializeWse19bTFld1(wse19bTFld1);
   } 

     /**
	 * 	Update Wse19bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19bTFld1,wse19bTFld1.length);
   	
   }
   
   public void setWse19bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld1,wse19bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse19bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19bTFld1 with another Field
	 *	@param value
	 */
   public void setWse19bTFld1(Field source) {
       replace(source,0,source.length(),beginWse19bTFld1,WSE_19B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19bTFld1,WSE_19B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse19bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse19bTFld2
	 *	@return wse19bTFld2
	 */
   public char[] getWse19bTFld2() throws CFException{
     if (isWse19bTFld2Modified()) { 
        wse19bTFld2 = refreshWse19bTFld2();
     }
   		return wse19bTFld2;
   }

  
	/**
	*  set variable wse19bTFld2
	*  Corresponding COBOL Variable is WSE-19B-T-FLD2
	*  @param value
	**/
   public void setWse19bTFld2(char[] value) {
      wse19bTFld2 = checkWse19bTFld2Constraints(value);
      serializeWse19bTFld2(wse19bTFld2);
   } 

     /**
	 * 	Update Wse19bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19bTFld2,wse19bTFld2.length);
   	
   }
   
   public void setWse19bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld2,wse19bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse19bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19bTFld2 with another Field
	 *	@param value
	 */
   public void setWse19bTFld2(Field source) {
       replace(source,0,source.length(),beginWse19bTFld2,WSE_19B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19bTFld2,WSE_19B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse19bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse19bTFld3
	 *	@return wse19bTFld3
	 */
   public char[] getWse19bTFld3() throws CFException{
     if (isWse19bTFld3Modified()) { 
        wse19bTFld3 = refreshWse19bTFld3();
     }
   		return wse19bTFld3;
   }

  
	/**
	*  set variable wse19bTFld3
	*  Corresponding COBOL Variable is WSE-19B-T-FLD3
	*  @param value
	**/
   public void setWse19bTFld3(char[] value) {
      wse19bTFld3 = checkWse19bTFld3Constraints(value);
      serializeWse19bTFld3(wse19bTFld3);
   } 

     /**
	 * 	Update Wse19bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19bTFld3,wse19bTFld3.length);
   	
   }
   
   public void setWse19bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld3,wse19bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse19bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19bTFld3 with another Field
	 *	@param value
	 */
   public void setWse19bTFld3(Field source) {
       replace(source,0,source.length(),beginWse19bTFld3,WSE_19B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19bTFld3,WSE_19B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse19bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse19bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse19bTFld1(CONSTANTS.SPACE_10);
         setWse19bTFld2(CONSTANTS.SPACE_20);
         setWse19bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse19bTFieldLength() {
			return WSE_19B_T_LENGTH;
		}

}
  
