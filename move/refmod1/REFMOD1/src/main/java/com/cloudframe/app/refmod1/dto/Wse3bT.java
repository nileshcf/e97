package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse3bT extends Wse3bTSerialized { 
   

						private char[] wse3bTFld1 = Field.fillLowValue(10);

						private char[] wse3bTFld2 = Field.fillLowValue(20);

						private char[] wse3bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse3bT
	**/
    public Wse3bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse3bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse3bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse3bTFld1
	 *	@return wse3bTFld1
	 */
   public char[] getWse3bTFld1() throws CFException{
     if (isWse3bTFld1Modified()) { 
        wse3bTFld1 = refreshWse3bTFld1();
     }
   		return wse3bTFld1;
   }

  
	/**
	*  set variable wse3bTFld1
	*  Corresponding COBOL Variable is WSE-3B-T-FLD1
	*  @param value
	**/
   public void setWse3bTFld1(char[] value) {
      wse3bTFld1 = checkWse3bTFld1Constraints(value);
      serializeWse3bTFld1(wse3bTFld1);
   } 

     /**
	 * 	Update Wse3bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3bTFld1,wse3bTFld1.length);
   	
   }
   
   public void setWse3bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld1,wse3bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse3bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3bTFld1 with another Field
	 *	@param value
	 */
   public void setWse3bTFld1(Field source) {
       replace(source,0,source.length(),beginWse3bTFld1,WSE_3B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3bTFld1,WSE_3B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse3bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse3bTFld2
	 *	@return wse3bTFld2
	 */
   public char[] getWse3bTFld2() throws CFException{
     if (isWse3bTFld2Modified()) { 
        wse3bTFld2 = refreshWse3bTFld2();
     }
   		return wse3bTFld2;
   }

  
	/**
	*  set variable wse3bTFld2
	*  Corresponding COBOL Variable is WSE-3B-T-FLD2
	*  @param value
	**/
   public void setWse3bTFld2(char[] value) {
      wse3bTFld2 = checkWse3bTFld2Constraints(value);
      serializeWse3bTFld2(wse3bTFld2);
   } 

     /**
	 * 	Update Wse3bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3bTFld2,wse3bTFld2.length);
   	
   }
   
   public void setWse3bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld2,wse3bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse3bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3bTFld2 with another Field
	 *	@param value
	 */
   public void setWse3bTFld2(Field source) {
       replace(source,0,source.length(),beginWse3bTFld2,WSE_3B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3bTFld2,WSE_3B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse3bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse3bTFld3
	 *	@return wse3bTFld3
	 */
   public char[] getWse3bTFld3() throws CFException{
     if (isWse3bTFld3Modified()) { 
        wse3bTFld3 = refreshWse3bTFld3();
     }
   		return wse3bTFld3;
   }

  
	/**
	*  set variable wse3bTFld3
	*  Corresponding COBOL Variable is WSE-3B-T-FLD3
	*  @param value
	**/
   public void setWse3bTFld3(char[] value) {
      wse3bTFld3 = checkWse3bTFld3Constraints(value);
      serializeWse3bTFld3(wse3bTFld3);
   } 

     /**
	 * 	Update Wse3bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3bTFld3,wse3bTFld3.length);
   	
   }
   
   public void setWse3bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld3,wse3bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse3bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3bTFld3 with another Field
	 *	@param value
	 */
   public void setWse3bTFld3(Field source) {
       replace(source,0,source.length(),beginWse3bTFld3,WSE_3B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3bTFld3,WSE_3B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse3bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse3bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse3bTFld1(CONSTANTS.SPACE_10);
         setWse3bTFld2(CONSTANTS.SPACE_20);
         setWse3bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse3bTFieldLength() {
			return WSE_3B_T_LENGTH;
		}

}
  
