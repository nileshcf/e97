package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse29bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse29bT extends Wse29bTSerialized { 
   

						private char[] wse29bTFld1 = Field.fillLowValue(10);

						private char[] wse29bTFld2 = Field.fillLowValue(20);

						private char[] wse29bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse29bT
	**/
    public Wse29bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse29bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse29bTFld1
	 *	@return wse29bTFld1
	 */
   public char[] getWse29bTFld1() throws CFException{
     if (isWse29bTFld1Modified()) { 
        wse29bTFld1 = refreshWse29bTFld1();
     }
   		return wse29bTFld1;
   }

  
	/**
	*  set variable wse29bTFld1
	*  Corresponding COBOL Variable is WSE-2-9B-T-FLD1
	*  @param value
	**/
   public void setWse29bTFld1(char[] value) {
      wse29bTFld1 = checkWse29bTFld1Constraints(value);
      serializeWse29bTFld1(wse29bTFld1);
   } 

     /**
	 * 	Update Wse29bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse29bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse29bTFld1,wse29bTFld1.length);
   	
   }
   
   public void setWse29bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld1,wse29bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse29bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse29bTFld1 with another Field
	 *	@param value
	 */
   public void setWse29bTFld1(Field source) {
       replace(source,0,source.length(),beginWse29bTFld1,WSE_29B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse29bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse29bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse29bTFld1,WSE_29B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse29bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse29bTFld2
	 *	@return wse29bTFld2
	 */
   public char[] getWse29bTFld2() throws CFException{
     if (isWse29bTFld2Modified()) { 
        wse29bTFld2 = refreshWse29bTFld2();
     }
   		return wse29bTFld2;
   }

  
	/**
	*  set variable wse29bTFld2
	*  Corresponding COBOL Variable is WSE-2-9B-T-FLD2
	*  @param value
	**/
   public void setWse29bTFld2(char[] value) {
      wse29bTFld2 = checkWse29bTFld2Constraints(value);
      serializeWse29bTFld2(wse29bTFld2);
   } 

     /**
	 * 	Update Wse29bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse29bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse29bTFld2,wse29bTFld2.length);
   	
   }
   
   public void setWse29bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld2,wse29bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse29bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse29bTFld2 with another Field
	 *	@param value
	 */
   public void setWse29bTFld2(Field source) {
       replace(source,0,source.length(),beginWse29bTFld2,WSE_29B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse29bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse29bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse29bTFld2,WSE_29B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse29bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse29bTFld3
	 *	@return wse29bTFld3
	 */
   public char[] getWse29bTFld3() throws CFException{
     if (isWse29bTFld3Modified()) { 
        wse29bTFld3 = refreshWse29bTFld3();
     }
   		return wse29bTFld3;
   }

  
	/**
	*  set variable wse29bTFld3
	*  Corresponding COBOL Variable is WSE-2-9B-T-FLD3
	*  @param value
	**/
   public void setWse29bTFld3(char[] value) {
      wse29bTFld3 = checkWse29bTFld3Constraints(value);
      serializeWse29bTFld3(wse29bTFld3);
   } 

     /**
	 * 	Update Wse29bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse29bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse29bTFld3,wse29bTFld3.length);
   	
   }
   
   public void setWse29bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld3,wse29bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse29bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse29bTFld3 with another Field
	 *	@param value
	 */
   public void setWse29bTFld3(Field source) {
       replace(source,0,source.length(),beginWse29bTFld3,WSE_29B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse29bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse29bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse29bTFld3,WSE_29B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse29bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse29bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse29bTFld1(CONSTANTS.SPACE_10);
         setWse29bTFld2(CONSTANTS.SPACE_20);
         setWse29bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse29bTFieldLength() {
			return WSE_29B_T_LENGTH;
		}

}
  
