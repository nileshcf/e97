package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse220bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse220bT extends Wse220bTSerialized { 
   

						private char[] wse220bTFld1 = Field.fillLowValue(10);

						private char[] wse220bTFld2 = Field.fillLowValue(20);

						private char[] wse220bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse220bT
	**/
    public Wse220bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse220bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse220bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse220bTFld1
	 *	@return wse220bTFld1
	 */
   public char[] getWse220bTFld1() throws CFException{
     if (isWse220bTFld1Modified()) { 
        wse220bTFld1 = refreshWse220bTFld1();
     }
   		return wse220bTFld1;
   }

  
	/**
	*  set variable wse220bTFld1
	*  Corresponding COBOL Variable is WSE-2-20B-T-FLD1
	*  @param value
	**/
   public void setWse220bTFld1(char[] value) {
      wse220bTFld1 = checkWse220bTFld1Constraints(value);
      serializeWse220bTFld1(wse220bTFld1);
   } 

     /**
	 * 	Update Wse220bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220bTFld1,wse220bTFld1.length);
   	
   }
   
   public void setWse220bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld1,wse220bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse220bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220bTFld1 with another Field
	 *	@param value
	 */
   public void setWse220bTFld1(Field source) {
       replace(source,0,source.length(),beginWse220bTFld1,WSE_220B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220bTFld1,WSE_220B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse220bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse220bTFld2
	 *	@return wse220bTFld2
	 */
   public char[] getWse220bTFld2() throws CFException{
     if (isWse220bTFld2Modified()) { 
        wse220bTFld2 = refreshWse220bTFld2();
     }
   		return wse220bTFld2;
   }

  
	/**
	*  set variable wse220bTFld2
	*  Corresponding COBOL Variable is WSE-2-20B-T-FLD2
	*  @param value
	**/
   public void setWse220bTFld2(char[] value) {
      wse220bTFld2 = checkWse220bTFld2Constraints(value);
      serializeWse220bTFld2(wse220bTFld2);
   } 

     /**
	 * 	Update Wse220bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220bTFld2,wse220bTFld2.length);
   	
   }
   
   public void setWse220bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld2,wse220bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse220bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220bTFld2 with another Field
	 *	@param value
	 */
   public void setWse220bTFld2(Field source) {
       replace(source,0,source.length(),beginWse220bTFld2,WSE_220B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220bTFld2,WSE_220B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse220bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse220bTFld3
	 *	@return wse220bTFld3
	 */
   public char[] getWse220bTFld3() throws CFException{
     if (isWse220bTFld3Modified()) { 
        wse220bTFld3 = refreshWse220bTFld3();
     }
   		return wse220bTFld3;
   }

  
	/**
	*  set variable wse220bTFld3
	*  Corresponding COBOL Variable is WSE-2-20B-T-FLD3
	*  @param value
	**/
   public void setWse220bTFld3(char[] value) {
      wse220bTFld3 = checkWse220bTFld3Constraints(value);
      serializeWse220bTFld3(wse220bTFld3);
   } 

     /**
	 * 	Update Wse220bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220bTFld3,wse220bTFld3.length);
   	
   }
   
   public void setWse220bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld3,wse220bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse220bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220bTFld3 with another Field
	 *	@param value
	 */
   public void setWse220bTFld3(Field source) {
       replace(source,0,source.length(),beginWse220bTFld3,WSE_220B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220bTFld3,WSE_220B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse220bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse220bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse220bTFld1(CONSTANTS.SPACE_10);
         setWse220bTFld2(CONSTANTS.SPACE_20);
         setWse220bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse220bTFieldLength() {
			return WSE_220B_T_LENGTH;
		}

}
  
