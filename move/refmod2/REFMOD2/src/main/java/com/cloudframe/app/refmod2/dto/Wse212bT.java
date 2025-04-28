package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse212bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse212bT extends Wse212bTSerialized { 
   

						private char[] wse212bTFld1 = Field.fillLowValue(10);

						private char[] wse212bTFld2 = Field.fillLowValue(20);

						private char[] wse212bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse212bT
	**/
    public Wse212bT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse212bT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse212bT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse212bTFld1
	 *	@return wse212bTFld1
	 */
   public char[] getWse212bTFld1() throws CFException{
     if (isWse212bTFld1Modified()) { 
        wse212bTFld1 = refreshWse212bTFld1();
     }
   		return wse212bTFld1;
   }

  
	/**
	*  set variable wse212bTFld1
	*  Corresponding COBOL Variable is WSE-2-12B-T-FLD1
	*  @param value
	**/
   public void setWse212bTFld1(char[] value) {
      wse212bTFld1 = checkWse212bTFld1Constraints(value);
      serializeWse212bTFld1(wse212bTFld1);
   } 

     /**
	 * 	Update Wse212bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse212bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse212bTFld1,wse212bTFld1.length);
   	
   }
   
   public void setWse212bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld1,wse212bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse212bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse212bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse212bTFld1 with another Field
	 *	@param value
	 */
   public void setWse212bTFld1(Field source) {
       replace(source,0,source.length(),beginWse212bTFld1,WSE_212B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse212bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse212bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse212bTFld1,WSE_212B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse212bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse212bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse212bTFld2
	 *	@return wse212bTFld2
	 */
   public char[] getWse212bTFld2() throws CFException{
     if (isWse212bTFld2Modified()) { 
        wse212bTFld2 = refreshWse212bTFld2();
     }
   		return wse212bTFld2;
   }

  
	/**
	*  set variable wse212bTFld2
	*  Corresponding COBOL Variable is WSE-2-12B-T-FLD2
	*  @param value
	**/
   public void setWse212bTFld2(char[] value) {
      wse212bTFld2 = checkWse212bTFld2Constraints(value);
      serializeWse212bTFld2(wse212bTFld2);
   } 

     /**
	 * 	Update Wse212bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse212bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse212bTFld2,wse212bTFld2.length);
   	
   }
   
   public void setWse212bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld2,wse212bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse212bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse212bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse212bTFld2 with another Field
	 *	@param value
	 */
   public void setWse212bTFld2(Field source) {
       replace(source,0,source.length(),beginWse212bTFld2,WSE_212B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse212bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse212bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse212bTFld2,WSE_212B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse212bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse212bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse212bTFld3
	 *	@return wse212bTFld3
	 */
   public char[] getWse212bTFld3() throws CFException{
     if (isWse212bTFld3Modified()) { 
        wse212bTFld3 = refreshWse212bTFld3();
     }
   		return wse212bTFld3;
   }

  
	/**
	*  set variable wse212bTFld3
	*  Corresponding COBOL Variable is WSE-2-12B-T-FLD3
	*  @param value
	**/
   public void setWse212bTFld3(char[] value) {
      wse212bTFld3 = checkWse212bTFld3Constraints(value);
      serializeWse212bTFld3(wse212bTFld3);
   } 

     /**
	 * 	Update Wse212bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse212bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse212bTFld3,wse212bTFld3.length);
   	
   }
   
   public void setWse212bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld3,wse212bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse212bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse212bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse212bTFld3 with another Field
	 *	@param value
	 */
   public void setWse212bTFld3(Field source) {
       replace(source,0,source.length(),beginWse212bTFld3,WSE_212B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse212bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse212bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse212bTFld3,WSE_212B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse212bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse212bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse212bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse212bTFld1(CONSTANTS.SPACE_10);
         setWse212bTFld2(CONSTANTS.SPACE_20);
         setWse212bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse212bTFieldLength() {
			return WSE_212B_T_LENGTH;
		}

}
  
