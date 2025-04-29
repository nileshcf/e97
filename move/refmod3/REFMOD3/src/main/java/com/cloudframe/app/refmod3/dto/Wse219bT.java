package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse219bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse219bT extends Wse219bTSerialized { 
   

						private char[] wse219bTFld1 = Field.fillLowValue(10);

						private char[] wse219bTFld2 = Field.fillLowValue(20);

						private char[] wse219bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse219bT
	**/
    public Wse219bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse219bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse219bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse219bTFld1
	 *	@return wse219bTFld1
	 */
   public char[] getWse219bTFld1() throws CFException{
     if (isWse219bTFld1Modified()) { 
        wse219bTFld1 = refreshWse219bTFld1();
     }
   		return wse219bTFld1;
   }

  
	/**
	*  set variable wse219bTFld1
	*  Corresponding COBOL Variable is WSE-2-19B-T-FLD1
	*  @param value
	**/
   public void setWse219bTFld1(char[] value) {
      wse219bTFld1 = checkWse219bTFld1Constraints(value);
      serializeWse219bTFld1(wse219bTFld1);
   } 

     /**
	 * 	Update Wse219bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219bTFld1,wse219bTFld1.length);
   	
   }
   
   public void setWse219bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld1,wse219bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse219bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219bTFld1 with another Field
	 *	@param value
	 */
   public void setWse219bTFld1(Field source) {
       replace(source,0,source.length(),beginWse219bTFld1,WSE_219B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219bTFld1,WSE_219B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse219bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse219bTFld2
	 *	@return wse219bTFld2
	 */
   public char[] getWse219bTFld2() throws CFException{
     if (isWse219bTFld2Modified()) { 
        wse219bTFld2 = refreshWse219bTFld2();
     }
   		return wse219bTFld2;
   }

  
	/**
	*  set variable wse219bTFld2
	*  Corresponding COBOL Variable is WSE-2-19B-T-FLD2
	*  @param value
	**/
   public void setWse219bTFld2(char[] value) {
      wse219bTFld2 = checkWse219bTFld2Constraints(value);
      serializeWse219bTFld2(wse219bTFld2);
   } 

     /**
	 * 	Update Wse219bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219bTFld2,wse219bTFld2.length);
   	
   }
   
   public void setWse219bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld2,wse219bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse219bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219bTFld2 with another Field
	 *	@param value
	 */
   public void setWse219bTFld2(Field source) {
       replace(source,0,source.length(),beginWse219bTFld2,WSE_219B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219bTFld2,WSE_219B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse219bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse219bTFld3
	 *	@return wse219bTFld3
	 */
   public char[] getWse219bTFld3() throws CFException{
     if (isWse219bTFld3Modified()) { 
        wse219bTFld3 = refreshWse219bTFld3();
     }
   		return wse219bTFld3;
   }

  
	/**
	*  set variable wse219bTFld3
	*  Corresponding COBOL Variable is WSE-2-19B-T-FLD3
	*  @param value
	**/
   public void setWse219bTFld3(char[] value) {
      wse219bTFld3 = checkWse219bTFld3Constraints(value);
      serializeWse219bTFld3(wse219bTFld3);
   } 

     /**
	 * 	Update Wse219bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219bTFld3,wse219bTFld3.length);
   	
   }
   
   public void setWse219bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld3,wse219bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse219bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219bTFld3 with another Field
	 *	@param value
	 */
   public void setWse219bTFld3(Field source) {
       replace(source,0,source.length(),beginWse219bTFld3,WSE_219B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219bTFld3,WSE_219B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse219bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse219bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse219bTFld1(CONSTANTS.SPACE_10);
         setWse219bTFld2(CONSTANTS.SPACE_20);
         setWse219bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse219bTFieldLength() {
			return WSE_219B_T_LENGTH;
		}

}
  
