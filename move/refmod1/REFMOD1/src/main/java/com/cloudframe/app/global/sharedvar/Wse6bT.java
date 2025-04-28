package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse6bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse6bT extends Wse6bTSerialized { 
   

						private char[] wse6bTFld1 = Field.fillLowValue(10);

						private char[] wse6bTFld2 = Field.fillLowValue(20);

						private char[] wse6bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse6bT
	**/
    public Wse6bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse6bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse6bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse6bTFld1
	 *	@return wse6bTFld1
	 */
   public char[] getWse6bTFld1() throws CFException{
     if (isWse6bTFld1Modified()) { 
        wse6bTFld1 = refreshWse6bTFld1();
     }
   		return wse6bTFld1;
   }

  
	/**
	*  set variable wse6bTFld1
	*  Corresponding COBOL Variable is WSE-6B-T-FLD1
	*  @param value
	**/
   public void setWse6bTFld1(char[] value) {
      wse6bTFld1 = checkWse6bTFld1Constraints(value);
      serializeWse6bTFld1(wse6bTFld1);
   } 

     /**
	 * 	Update Wse6bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6bTFld1,wse6bTFld1.length);
   	
   }
   
   public void setWse6bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld1,wse6bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse6bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6bTFld1 with another Field
	 *	@param value
	 */
   public void setWse6bTFld1(Field source) {
       replace(source,0,source.length(),beginWse6bTFld1,WSE_6B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6bTFld1,WSE_6B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse6bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse6bTFld2
	 *	@return wse6bTFld2
	 */
   public char[] getWse6bTFld2() throws CFException{
     if (isWse6bTFld2Modified()) { 
        wse6bTFld2 = refreshWse6bTFld2();
     }
   		return wse6bTFld2;
   }

  
	/**
	*  set variable wse6bTFld2
	*  Corresponding COBOL Variable is WSE-6B-T-FLD2
	*  @param value
	**/
   public void setWse6bTFld2(char[] value) {
      wse6bTFld2 = checkWse6bTFld2Constraints(value);
      serializeWse6bTFld2(wse6bTFld2);
   } 

     /**
	 * 	Update Wse6bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6bTFld2,wse6bTFld2.length);
   	
   }
   
   public void setWse6bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld2,wse6bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse6bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6bTFld2 with another Field
	 *	@param value
	 */
   public void setWse6bTFld2(Field source) {
       replace(source,0,source.length(),beginWse6bTFld2,WSE_6B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6bTFld2,WSE_6B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse6bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse6bTFld3
	 *	@return wse6bTFld3
	 */
   public char[] getWse6bTFld3() throws CFException{
     if (isWse6bTFld3Modified()) { 
        wse6bTFld3 = refreshWse6bTFld3();
     }
   		return wse6bTFld3;
   }

  
	/**
	*  set variable wse6bTFld3
	*  Corresponding COBOL Variable is WSE-6B-T-FLD3
	*  @param value
	**/
   public void setWse6bTFld3(char[] value) {
      wse6bTFld3 = checkWse6bTFld3Constraints(value);
      serializeWse6bTFld3(wse6bTFld3);
   } 

     /**
	 * 	Update Wse6bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6bTFld3,wse6bTFld3.length);
   	
   }
   
   public void setWse6bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld3,wse6bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse6bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6bTFld3 with another Field
	 *	@param value
	 */
   public void setWse6bTFld3(Field source) {
       replace(source,0,source.length(),beginWse6bTFld3,WSE_6B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6bTFld3,WSE_6B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse6bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse6bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse6bTFld1(CONSTANTS.SPACE_10);
         setWse6bTFld2(CONSTANTS.SPACE_20);
         setWse6bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse6bTFieldLength() {
			return WSE_6B_T_LENGTH;
		}

}
  
