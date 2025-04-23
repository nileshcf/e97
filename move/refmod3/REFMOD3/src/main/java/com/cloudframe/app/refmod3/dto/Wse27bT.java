package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse27bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse27bT extends Wse27bTSerialized { 
   

						private char[] wse27bTFld1 = Field.fillLowValue(10);

						private char[] wse27bTFld2 = Field.fillLowValue(20);

						private char[] wse27bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse27bT
	**/
    public Wse27bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse27bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse27bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse27bTFld1
	 *	@return wse27bTFld1
	 */
   public char[] getWse27bTFld1() throws CFException{
     if (isWse27bTFld1Modified()) { 
        wse27bTFld1 = refreshWse27bTFld1();
     }
   		return wse27bTFld1;
   }

  
	/**
	*  set variable wse27bTFld1
	*  Corresponding COBOL Variable is WSE-2-7B-T-FLD1
	*  @param value
	**/
   public void setWse27bTFld1(char[] value) {
      wse27bTFld1 = checkWse27bTFld1Constraints(value);
      serializeWse27bTFld1(wse27bTFld1);
   } 

     /**
	 * 	Update Wse27bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27bTFld1,wse27bTFld1.length);
   	
   }
   
   public void setWse27bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld1,wse27bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse27bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27bTFld1 with another Field
	 *	@param value
	 */
   public void setWse27bTFld1(Field source) {
       replace(source,0,source.length(),beginWse27bTFld1,WSE_27B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27bTFld1,WSE_27B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse27bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse27bTFld2
	 *	@return wse27bTFld2
	 */
   public char[] getWse27bTFld2() throws CFException{
     if (isWse27bTFld2Modified()) { 
        wse27bTFld2 = refreshWse27bTFld2();
     }
   		return wse27bTFld2;
   }

  
	/**
	*  set variable wse27bTFld2
	*  Corresponding COBOL Variable is WSE-2-7B-T-FLD2
	*  @param value
	**/
   public void setWse27bTFld2(char[] value) {
      wse27bTFld2 = checkWse27bTFld2Constraints(value);
      serializeWse27bTFld2(wse27bTFld2);
   } 

     /**
	 * 	Update Wse27bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27bTFld2,wse27bTFld2.length);
   	
   }
   
   public void setWse27bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld2,wse27bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse27bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27bTFld2 with another Field
	 *	@param value
	 */
   public void setWse27bTFld2(Field source) {
       replace(source,0,source.length(),beginWse27bTFld2,WSE_27B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27bTFld2,WSE_27B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse27bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse27bTFld3
	 *	@return wse27bTFld3
	 */
   public char[] getWse27bTFld3() throws CFException{
     if (isWse27bTFld3Modified()) { 
        wse27bTFld3 = refreshWse27bTFld3();
     }
   		return wse27bTFld3;
   }

  
	/**
	*  set variable wse27bTFld3
	*  Corresponding COBOL Variable is WSE-2-7B-T-FLD3
	*  @param value
	**/
   public void setWse27bTFld3(char[] value) {
      wse27bTFld3 = checkWse27bTFld3Constraints(value);
      serializeWse27bTFld3(wse27bTFld3);
   } 

     /**
	 * 	Update Wse27bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27bTFld3,wse27bTFld3.length);
   	
   }
   
   public void setWse27bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld3,wse27bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse27bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27bTFld3 with another Field
	 *	@param value
	 */
   public void setWse27bTFld3(Field source) {
       replace(source,0,source.length(),beginWse27bTFld3,WSE_27B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27bTFld3,WSE_27B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse27bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse27bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse27bTFld1(CONSTANTS.SPACE_10);
         setWse27bTFld2(CONSTANTS.SPACE_20);
         setWse27bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse27bTFieldLength() {
			return WSE_27B_T_LENGTH;
		}

}
  
