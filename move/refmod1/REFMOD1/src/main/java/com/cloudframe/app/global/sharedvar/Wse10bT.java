package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse10bT extends Wse10bTSerialized { 
   

						private char[] wse10bTFld1 = Field.fillLowValue(10);

						private char[] wse10bTFld2 = Field.fillLowValue(20);

						private char[] wse10bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse10bT
	**/
    public Wse10bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse10bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse10bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse10bTFld1
	 *	@return wse10bTFld1
	 */
   public char[] getWse10bTFld1() throws CFException{
     if (isWse10bTFld1Modified()) { 
        wse10bTFld1 = refreshWse10bTFld1();
     }
   		return wse10bTFld1;
   }

  
	/**
	*  set variable wse10bTFld1
	*  Corresponding COBOL Variable is WSE-10B-T-FLD1
	*  @param value
	**/
   public void setWse10bTFld1(char[] value) {
      wse10bTFld1 = checkWse10bTFld1Constraints(value);
      serializeWse10bTFld1(wse10bTFld1);
   } 

     /**
	 * 	Update Wse10bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10bTFld1,wse10bTFld1.length);
   	
   }
   
   public void setWse10bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld1,wse10bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse10bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10bTFld1 with another Field
	 *	@param value
	 */
   public void setWse10bTFld1(Field source) {
       replace(source,0,source.length(),beginWse10bTFld1,WSE_10B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10bTFld1,WSE_10B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse10bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse10bTFld2
	 *	@return wse10bTFld2
	 */
   public char[] getWse10bTFld2() throws CFException{
     if (isWse10bTFld2Modified()) { 
        wse10bTFld2 = refreshWse10bTFld2();
     }
   		return wse10bTFld2;
   }

  
	/**
	*  set variable wse10bTFld2
	*  Corresponding COBOL Variable is WSE-10B-T-FLD2
	*  @param value
	**/
   public void setWse10bTFld2(char[] value) {
      wse10bTFld2 = checkWse10bTFld2Constraints(value);
      serializeWse10bTFld2(wse10bTFld2);
   } 

     /**
	 * 	Update Wse10bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10bTFld2,wse10bTFld2.length);
   	
   }
   
   public void setWse10bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld2,wse10bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse10bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10bTFld2 with another Field
	 *	@param value
	 */
   public void setWse10bTFld2(Field source) {
       replace(source,0,source.length(),beginWse10bTFld2,WSE_10B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10bTFld2,WSE_10B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse10bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse10bTFld3
	 *	@return wse10bTFld3
	 */
   public char[] getWse10bTFld3() throws CFException{
     if (isWse10bTFld3Modified()) { 
        wse10bTFld3 = refreshWse10bTFld3();
     }
   		return wse10bTFld3;
   }

  
	/**
	*  set variable wse10bTFld3
	*  Corresponding COBOL Variable is WSE-10B-T-FLD3
	*  @param value
	**/
   public void setWse10bTFld3(char[] value) {
      wse10bTFld3 = checkWse10bTFld3Constraints(value);
      serializeWse10bTFld3(wse10bTFld3);
   } 

     /**
	 * 	Update Wse10bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10bTFld3,wse10bTFld3.length);
   	
   }
   
   public void setWse10bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld3,wse10bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse10bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10bTFld3 with another Field
	 *	@param value
	 */
   public void setWse10bTFld3(Field source) {
       replace(source,0,source.length(),beginWse10bTFld3,WSE_10B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10bTFld3,WSE_10B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse10bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse10bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse10bTFld1(CONSTANTS.SPACE_10);
         setWse10bTFld2(CONSTANTS.SPACE_20);
         setWse10bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse10bTFieldLength() {
			return WSE_10B_T_LENGTH;
		}

}
  
