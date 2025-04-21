package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse217bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse217bT extends Wse217bTSerialized { 
   

						private char[] wse217bTFld1 = Field.fillLowValue(10);

						private char[] wse217bTFld2 = Field.fillLowValue(20);

						private char[] wse217bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse217bT
	**/
    public Wse217bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse217bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse217bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse217bTFld1
	 *	@return wse217bTFld1
	 */
   public char[] getWse217bTFld1() throws CFException{
     if (isWse217bTFld1Modified()) { 
        wse217bTFld1 = refreshWse217bTFld1();
     }
   		return wse217bTFld1;
   }

  
	/**
	*  set variable wse217bTFld1
	*  Corresponding COBOL Variable is WSE-2-17B-T-FLD1
	*  @param value
	**/
   public void setWse217bTFld1(char[] value) {
      wse217bTFld1 = checkWse217bTFld1Constraints(value);
      serializeWse217bTFld1(wse217bTFld1);
   } 

     /**
	 * 	Update Wse217bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217bTFld1,wse217bTFld1.length);
   	
   }
   
   public void setWse217bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld1,wse217bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse217bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217bTFld1 with another Field
	 *	@param value
	 */
   public void setWse217bTFld1(Field source) {
       replace(source,0,source.length(),beginWse217bTFld1,WSE_217B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217bTFld1,WSE_217B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse217bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse217bTFld2
	 *	@return wse217bTFld2
	 */
   public char[] getWse217bTFld2() throws CFException{
     if (isWse217bTFld2Modified()) { 
        wse217bTFld2 = refreshWse217bTFld2();
     }
   		return wse217bTFld2;
   }

  
	/**
	*  set variable wse217bTFld2
	*  Corresponding COBOL Variable is WSE-2-17B-T-FLD2
	*  @param value
	**/
   public void setWse217bTFld2(char[] value) {
      wse217bTFld2 = checkWse217bTFld2Constraints(value);
      serializeWse217bTFld2(wse217bTFld2);
   } 

     /**
	 * 	Update Wse217bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217bTFld2,wse217bTFld2.length);
   	
   }
   
   public void setWse217bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld2,wse217bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse217bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217bTFld2 with another Field
	 *	@param value
	 */
   public void setWse217bTFld2(Field source) {
       replace(source,0,source.length(),beginWse217bTFld2,WSE_217B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217bTFld2,WSE_217B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse217bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse217bTFld3
	 *	@return wse217bTFld3
	 */
   public char[] getWse217bTFld3() throws CFException{
     if (isWse217bTFld3Modified()) { 
        wse217bTFld3 = refreshWse217bTFld3();
     }
   		return wse217bTFld3;
   }

  
	/**
	*  set variable wse217bTFld3
	*  Corresponding COBOL Variable is WSE-2-17B-T-FLD3
	*  @param value
	**/
   public void setWse217bTFld3(char[] value) {
      wse217bTFld3 = checkWse217bTFld3Constraints(value);
      serializeWse217bTFld3(wse217bTFld3);
   } 

     /**
	 * 	Update Wse217bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217bTFld3,wse217bTFld3.length);
   	
   }
   
   public void setWse217bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld3,wse217bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse217bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217bTFld3 with another Field
	 *	@param value
	 */
   public void setWse217bTFld3(Field source) {
       replace(source,0,source.length(),beginWse217bTFld3,WSE_217B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217bTFld3,WSE_217B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse217bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse217bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse217bTFld1(CONSTANTS.SPACE_10);
         setWse217bTFld2(CONSTANTS.SPACE_20);
         setWse217bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse217bTFieldLength() {
			return WSE_217B_T_LENGTH;
		}

}
  
