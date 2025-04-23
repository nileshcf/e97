package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse25bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse25bT extends Wse25bTSerialized {
   

						private char[] wse25bTFld1 = Field.fillLowValue(20);

						private char[] wse25bTFld2 = Field.fillLowValue(40);

						private char[] wse25bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse25bT
	**/
    public Wse25bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse25bTFld1
	 *	@return wse25bTFld1
	 */
   public char[] getWse25bTFld1() throws CFException{
     if (isWse25bTFld1Modified()) { 
        wse25bTFld1 = refreshWse25bTFld1();
     }
   		return wse25bTFld1;
   }

  
	/**
	*  set variable wse25bTFld1
	*  Corresponding COBOL Variable is WSE-2-5B-T-FLD1
	*  @param value
	**/
   public void setWse25bTFld1(char[] value) {
      wse25bTFld1 = checkWse25bTFld1Constraints(value);
      serializeWse25bTFld1(wse25bTFld1);
   } 

     /**
	 * 	Update Wse25bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25bTFld1,wse25bTFld1.length);
   	
   }
   
   public void setWse25bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld1,wse25bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse25bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25bTFld1 with another Field
	 *	@param value
	 */
   public void setWse25bTFld1(Field source) {
       replace(source,0,source.length(),beginWse25bTFld1,WSE_25B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25bTFld1,WSE_25B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse25bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse25bTFld2
	 *	@return wse25bTFld2
	 */
   public char[] getWse25bTFld2() throws CFException{
     if (isWse25bTFld2Modified()) { 
        wse25bTFld2 = refreshWse25bTFld2();
     }
   		return wse25bTFld2;
   }

  
	/**
	*  set variable wse25bTFld2
	*  Corresponding COBOL Variable is WSE-2-5B-T-FLD2
	*  @param value
	**/
   public void setWse25bTFld2(char[] value) {
      wse25bTFld2 = checkWse25bTFld2Constraints(value);
      serializeWse25bTFld2(wse25bTFld2);
   } 

     /**
	 * 	Update Wse25bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25bTFld2,wse25bTFld2.length);
   	
   }
   
   public void setWse25bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld2,wse25bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse25bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25bTFld2 with another Field
	 *	@param value
	 */
   public void setWse25bTFld2(Field source) {
       replace(source,0,source.length(),beginWse25bTFld2,WSE_25B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25bTFld2,WSE_25B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse25bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse25bTFld3
	 *	@return wse25bTFld3
	 */
   public char[] getWse25bTFld3() throws CFException{
     if (isWse25bTFld3Modified()) { 
        wse25bTFld3 = refreshWse25bTFld3();
     }
   		return wse25bTFld3;
   }

  
	/**
	*  set variable wse25bTFld3
	*  Corresponding COBOL Variable is WSE-2-5B-T-FLD3
	*  @param value
	**/
   public void setWse25bTFld3(char[] value) {
      wse25bTFld3 = checkWse25bTFld3Constraints(value);
      serializeWse25bTFld3(wse25bTFld3);
   } 

     /**
	 * 	Update Wse25bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25bTFld3,wse25bTFld3.length);
   	
   }
   
   public void setWse25bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld3,wse25bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse25bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25bTFld3 with another Field
	 *	@param value
	 */
   public void setWse25bTFld3(Field source) {
       replace(source,0,source.length(),beginWse25bTFld3,WSE_25B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25bTFld3,WSE_25B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse25bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse25bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse25bTFld1(CONSTANTS.SPACE_20);
         setWse25bTFld2(CONSTANTS.SPACE_40);
         setWse25bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse25bTFieldLength() {
			return WSE_25B_T_LENGTH;
		}

}
  
