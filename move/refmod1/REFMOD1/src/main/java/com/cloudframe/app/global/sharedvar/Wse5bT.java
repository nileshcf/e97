package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse5bT extends Wse5bTSerialized { 
   

						private char[] wse5bTFld1 = Field.fillLowValue(20);

						private char[] wse5bTFld2 = Field.fillLowValue(40);

						private char[] wse5bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse5bT
	**/
    public Wse5bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse5bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse5bTFld1
	 *	@return wse5bTFld1
	 */
   public char[] getWse5bTFld1() throws CFException{
     if (isWse5bTFld1Modified()) { 
        wse5bTFld1 = refreshWse5bTFld1();
     }
   		return wse5bTFld1;
   }

  
	/**
	*  set variable wse5bTFld1
	*  Corresponding COBOL Variable is WSE-5B-T-FLD1
	*  @param value
	**/
   public void setWse5bTFld1(char[] value) {
      wse5bTFld1 = checkWse5bTFld1Constraints(value);
      serializeWse5bTFld1(wse5bTFld1);
   } 

     /**
	 * 	Update Wse5bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5bTFld1,wse5bTFld1.length);
   	
   }
   
   public void setWse5bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld1,wse5bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse5bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5bTFld1 with another Field
	 *	@param value
	 */
   public void setWse5bTFld1(Field source) {
       replace(source,0,source.length(),beginWse5bTFld1,WSE_5B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5bTFld1,WSE_5B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse5bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse5bTFld2
	 *	@return wse5bTFld2
	 */
   public char[] getWse5bTFld2() throws CFException{
     if (isWse5bTFld2Modified()) { 
        wse5bTFld2 = refreshWse5bTFld2();
     }
   		return wse5bTFld2;
   }

  
	/**
	*  set variable wse5bTFld2
	*  Corresponding COBOL Variable is WSE-5B-T-FLD2
	*  @param value
	**/
   public void setWse5bTFld2(char[] value) {
      wse5bTFld2 = checkWse5bTFld2Constraints(value);
      serializeWse5bTFld2(wse5bTFld2);
   } 

     /**
	 * 	Update Wse5bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5bTFld2,wse5bTFld2.length);
   	
   }
   
   public void setWse5bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld2,wse5bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse5bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5bTFld2 with another Field
	 *	@param value
	 */
   public void setWse5bTFld2(Field source) {
       replace(source,0,source.length(),beginWse5bTFld2,WSE_5B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5bTFld2,WSE_5B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse5bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse5bTFld3
	 *	@return wse5bTFld3
	 */
   public char[] getWse5bTFld3() throws CFException{
     if (isWse5bTFld3Modified()) { 
        wse5bTFld3 = refreshWse5bTFld3();
     }
   		return wse5bTFld3;
   }

  
	/**
	*  set variable wse5bTFld3
	*  Corresponding COBOL Variable is WSE-5B-T-FLD3
	*  @param value
	**/
   public void setWse5bTFld3(char[] value) {
      wse5bTFld3 = checkWse5bTFld3Constraints(value);
      serializeWse5bTFld3(wse5bTFld3);
   } 

     /**
	 * 	Update Wse5bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5bTFld3,wse5bTFld3.length);
   	
   }
   
   public void setWse5bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld3,wse5bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse5bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5bTFld3 with another Field
	 *	@param value
	 */
   public void setWse5bTFld3(Field source) {
       replace(source,0,source.length(),beginWse5bTFld3,WSE_5B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5bTFld3,WSE_5B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse5bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse5bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse5bTFld1(CONSTANTS.SPACE_20);
         setWse5bTFld2(CONSTANTS.SPACE_40);
         setWse5bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse5bTFieldLength() {
			return WSE_5B_T_LENGTH;
		}

}
  
