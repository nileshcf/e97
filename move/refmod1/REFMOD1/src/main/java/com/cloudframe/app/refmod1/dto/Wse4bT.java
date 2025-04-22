package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse4bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse4bT extends Wse4bTSerialized { 
   

						private char[] wse4bTFld1 = Field.fillLowValue(10);

						private char[] wse4bTFld2 = Field.fillLowValue(20);

						private char[] wse4bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse4bT
	**/
    public Wse4bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse4bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse4bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse4bTFld1
	 *	@return wse4bTFld1
	 */
   public char[] getWse4bTFld1() throws CFException{
     if (isWse4bTFld1Modified()) { 
        wse4bTFld1 = refreshWse4bTFld1();
     }
   		return wse4bTFld1;
   }

  
	/**
	*  set variable wse4bTFld1
	*  Corresponding COBOL Variable is WSE-4B-T-FLD1
	*  @param value
	**/
   public void setWse4bTFld1(char[] value) {
      wse4bTFld1 = checkWse4bTFld1Constraints(value);
      serializeWse4bTFld1(wse4bTFld1);
   } 

     /**
	 * 	Update Wse4bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse4bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse4bTFld1,wse4bTFld1.length);
   	
   }
   
   public void setWse4bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld1,wse4bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse4bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse4bTFld1 with another Field
	 *	@param value
	 */
   public void setWse4bTFld1(Field source) {
       replace(source,0,source.length(),beginWse4bTFld1,WSE_4B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse4bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse4bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse4bTFld1,WSE_4B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse4bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse4bTFld2
	 *	@return wse4bTFld2
	 */
   public char[] getWse4bTFld2() throws CFException{
     if (isWse4bTFld2Modified()) { 
        wse4bTFld2 = refreshWse4bTFld2();
     }
   		return wse4bTFld2;
   }

  
	/**
	*  set variable wse4bTFld2
	*  Corresponding COBOL Variable is WSE-4B-T-FLD2
	*  @param value
	**/
   public void setWse4bTFld2(char[] value) {
      wse4bTFld2 = checkWse4bTFld2Constraints(value);
      serializeWse4bTFld2(wse4bTFld2);
   } 

     /**
	 * 	Update Wse4bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse4bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse4bTFld2,wse4bTFld2.length);
   	
   }
   
   public void setWse4bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld2,wse4bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse4bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse4bTFld2 with another Field
	 *	@param value
	 */
   public void setWse4bTFld2(Field source) {
       replace(source,0,source.length(),beginWse4bTFld2,WSE_4B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse4bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse4bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse4bTFld2,WSE_4B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse4bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse4bTFld3
	 *	@return wse4bTFld3
	 */
   public char[] getWse4bTFld3() throws CFException{
     if (isWse4bTFld3Modified()) { 
        wse4bTFld3 = refreshWse4bTFld3();
     }
   		return wse4bTFld3;
   }

  
	/**
	*  set variable wse4bTFld3
	*  Corresponding COBOL Variable is WSE-4B-T-FLD3
	*  @param value
	**/
   public void setWse4bTFld3(char[] value) {
      wse4bTFld3 = checkWse4bTFld3Constraints(value);
      serializeWse4bTFld3(wse4bTFld3);
   } 

     /**
	 * 	Update Wse4bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse4bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse4bTFld3,wse4bTFld3.length);
   	
   }
   
   public void setWse4bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld3,wse4bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse4bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse4bTFld3 with another Field
	 *	@param value
	 */
   public void setWse4bTFld3(Field source) {
       replace(source,0,source.length(),beginWse4bTFld3,WSE_4B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse4bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse4bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse4bTFld3,WSE_4B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse4bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse4bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse4bTFld1(CONSTANTS.SPACE_10);
         setWse4bTFld2(CONSTANTS.SPACE_20);
         setWse4bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse4bTFieldLength() {
			return WSE_4B_T_LENGTH;
		}

}
  
