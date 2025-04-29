package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse13bT extends Wse13bTSerialized { 
   

						private char[] wse13bTFld1 = Field.fillLowValue(10);

						private char[] wse13bTFld2 = Field.fillLowValue(20);

						private char[] wse13bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse13bT
	**/
    public Wse13bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse13bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse13bTFld1
	 *	@return wse13bTFld1
	 */
   public char[] getWse13bTFld1() throws CFException{
     if (isWse13bTFld1Modified()) { 
        wse13bTFld1 = refreshWse13bTFld1();
     }
   		return wse13bTFld1;
   }

  
	/**
	*  set variable wse13bTFld1
	*  Corresponding COBOL Variable is WSE-13B-T-FLD1
	*  @param value
	**/
   public void setWse13bTFld1(char[] value) {
      wse13bTFld1 = checkWse13bTFld1Constraints(value);
      serializeWse13bTFld1(wse13bTFld1);
   } 

     /**
	 * 	Update Wse13bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13bTFld1,wse13bTFld1.length);
   	
   }
   
   public void setWse13bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld1,wse13bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse13bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13bTFld1 with another Field
	 *	@param value
	 */
   public void setWse13bTFld1(Field source) {
       replace(source,0,source.length(),beginWse13bTFld1,WSE_13B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13bTFld1,WSE_13B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse13bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13bTFld2
	 *	@return wse13bTFld2
	 */
   public char[] getWse13bTFld2() throws CFException{
     if (isWse13bTFld2Modified()) { 
        wse13bTFld2 = refreshWse13bTFld2();
     }
   		return wse13bTFld2;
   }

  
	/**
	*  set variable wse13bTFld2
	*  Corresponding COBOL Variable is WSE-13B-T-FLD2
	*  @param value
	**/
   public void setWse13bTFld2(char[] value) {
      wse13bTFld2 = checkWse13bTFld2Constraints(value);
      serializeWse13bTFld2(wse13bTFld2);
   } 

     /**
	 * 	Update Wse13bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13bTFld2,wse13bTFld2.length);
   	
   }
   
   public void setWse13bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld2,wse13bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse13bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13bTFld2 with another Field
	 *	@param value
	 */
   public void setWse13bTFld2(Field source) {
       replace(source,0,source.length(),beginWse13bTFld2,WSE_13B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13bTFld2,WSE_13B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse13bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13bTFld3
	 *	@return wse13bTFld3
	 */
   public char[] getWse13bTFld3() throws CFException{
     if (isWse13bTFld3Modified()) { 
        wse13bTFld3 = refreshWse13bTFld3();
     }
   		return wse13bTFld3;
   }

  
	/**
	*  set variable wse13bTFld3
	*  Corresponding COBOL Variable is WSE-13B-T-FLD3
	*  @param value
	**/
   public void setWse13bTFld3(char[] value) {
      wse13bTFld3 = checkWse13bTFld3Constraints(value);
      serializeWse13bTFld3(wse13bTFld3);
   } 

     /**
	 * 	Update Wse13bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13bTFld3,wse13bTFld3.length);
   	
   }
   
   public void setWse13bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld3,wse13bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse13bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13bTFld3 with another Field
	 *	@param value
	 */
   public void setWse13bTFld3(Field source) {
       replace(source,0,source.length(),beginWse13bTFld3,WSE_13B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13bTFld3,WSE_13B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse13bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse13bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse13bTFld1(CONSTANTS.SPACE_10);
         setWse13bTFld2(CONSTANTS.SPACE_20);
         setWse13bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse13bTFieldLength() {
			return WSE_13B_T_LENGTH;
		}

}
  
