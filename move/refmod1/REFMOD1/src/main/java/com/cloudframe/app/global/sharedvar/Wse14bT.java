package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse14bT extends Wse14bTSerialized { 
   

						private char[] wse14bTFld1 = Field.fillLowValue(10);

						private char[] wse14bTFld2 = Field.fillLowValue(20);

						private char[] wse14bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse14bT
	**/
    public Wse14bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse14bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse14bTFld1
	 *	@return wse14bTFld1
	 */
   public char[] getWse14bTFld1() throws CFException{
     if (isWse14bTFld1Modified()) { 
        wse14bTFld1 = refreshWse14bTFld1();
     }
   		return wse14bTFld1;
   }

  
	/**
	*  set variable wse14bTFld1
	*  Corresponding COBOL Variable is WSE-14B-T-FLD1
	*  @param value
	**/
   public void setWse14bTFld1(char[] value) {
      wse14bTFld1 = checkWse14bTFld1Constraints(value);
      serializeWse14bTFld1(wse14bTFld1);
   } 

     /**
	 * 	Update Wse14bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14bTFld1,wse14bTFld1.length);
   	
   }
   
   public void setWse14bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld1,wse14bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse14bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14bTFld1 with another Field
	 *	@param value
	 */
   public void setWse14bTFld1(Field source) {
       replace(source,0,source.length(),beginWse14bTFld1,WSE_14B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14bTFld1,WSE_14B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse14bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse14bTFld2
	 *	@return wse14bTFld2
	 */
   public char[] getWse14bTFld2() throws CFException{
     if (isWse14bTFld2Modified()) { 
        wse14bTFld2 = refreshWse14bTFld2();
     }
   		return wse14bTFld2;
   }

  
	/**
	*  set variable wse14bTFld2
	*  Corresponding COBOL Variable is WSE-14B-T-FLD2
	*  @param value
	**/
   public void setWse14bTFld2(char[] value) {
      wse14bTFld2 = checkWse14bTFld2Constraints(value);
      serializeWse14bTFld2(wse14bTFld2);
   } 

     /**
	 * 	Update Wse14bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14bTFld2,wse14bTFld2.length);
   	
   }
   
   public void setWse14bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld2,wse14bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse14bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14bTFld2 with another Field
	 *	@param value
	 */
   public void setWse14bTFld2(Field source) {
       replace(source,0,source.length(),beginWse14bTFld2,WSE_14B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14bTFld2,WSE_14B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse14bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse14bTFld3
	 *	@return wse14bTFld3
	 */
   public char[] getWse14bTFld3() throws CFException{
     if (isWse14bTFld3Modified()) { 
        wse14bTFld3 = refreshWse14bTFld3();
     }
   		return wse14bTFld3;
   }

  
	/**
	*  set variable wse14bTFld3
	*  Corresponding COBOL Variable is WSE-14B-T-FLD3
	*  @param value
	**/
   public void setWse14bTFld3(char[] value) {
      wse14bTFld3 = checkWse14bTFld3Constraints(value);
      serializeWse14bTFld3(wse14bTFld3);
   } 

     /**
	 * 	Update Wse14bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14bTFld3,wse14bTFld3.length);
   	
   }
   
   public void setWse14bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld3,wse14bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse14bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14bTFld3 with another Field
	 *	@param value
	 */
   public void setWse14bTFld3(Field source) {
       replace(source,0,source.length(),beginWse14bTFld3,WSE_14B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14bTFld3,WSE_14B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse14bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse14bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse14bTFld1(CONSTANTS.SPACE_10);
         setWse14bTFld2(CONSTANTS.SPACE_20);
         setWse14bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse14bTFieldLength() {
			return WSE_14B_T_LENGTH;
		}

}
  
