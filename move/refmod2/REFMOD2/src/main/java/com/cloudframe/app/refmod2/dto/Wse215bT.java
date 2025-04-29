package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse215bT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse215bT extends Wse215bTSerialized {
   

						private char[] wse215bTFld1 = Field.fillLowValue(10);

						private char[] wse215bTFld2 = Field.fillLowValue(20);

						private char[] wse215bTFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse215bT
	**/
    public Wse215bT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse215bTFld1
	 *	@return wse215bTFld1
	 */
   public char[] getWse215bTFld1() throws CFException{
     if (isWse215bTFld1Modified()) { 
        wse215bTFld1 = refreshWse215bTFld1();
     }
   		return wse215bTFld1;
   }

  
	/**
	*  set variable wse215bTFld1
	*  Corresponding COBOL Variable is WSE-2-15B-T-FLD1
	*  @param value
	**/
   public void setWse215bTFld1(char[] value) {
      wse215bTFld1 = checkWse215bTFld1Constraints(value);
      serializeWse215bTFld1(wse215bTFld1);
   } 

     /**
	 * 	Update Wse215bTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215bTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215bTFld1,wse215bTFld1.length);
   	
   }
   
   public void setWse215bTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld1,wse215bTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse215bTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215bTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215bTFld1 with another Field
	 *	@param value
	 */
   public void setWse215bTFld1(Field source) {
       replace(source,0,source.length(),beginWse215bTFld1,WSE_215B_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215bTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215bTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215bTFld1,WSE_215B_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse215bTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215bTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse215bTFld2
	 *	@return wse215bTFld2
	 */
   public char[] getWse215bTFld2() throws CFException{
     if (isWse215bTFld2Modified()) { 
        wse215bTFld2 = refreshWse215bTFld2();
     }
   		return wse215bTFld2;
   }

  
	/**
	*  set variable wse215bTFld2
	*  Corresponding COBOL Variable is WSE-2-15B-T-FLD2
	*  @param value
	**/
   public void setWse215bTFld2(char[] value) {
      wse215bTFld2 = checkWse215bTFld2Constraints(value);
      serializeWse215bTFld2(wse215bTFld2);
   } 

     /**
	 * 	Update Wse215bTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215bTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215bTFld2,wse215bTFld2.length);
   	
   }
   
   public void setWse215bTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld2,wse215bTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse215bTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215bTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215bTFld2 with another Field
	 *	@param value
	 */
   public void setWse215bTFld2(Field source) {
       replace(source,0,source.length(),beginWse215bTFld2,WSE_215B_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215bTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215bTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215bTFld2,WSE_215B_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse215bTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215bTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse215bTFld3
	 *	@return wse215bTFld3
	 */
   public char[] getWse215bTFld3() throws CFException{
     if (isWse215bTFld3Modified()) { 
        wse215bTFld3 = refreshWse215bTFld3();
     }
   		return wse215bTFld3;
   }

  
	/**
	*  set variable wse215bTFld3
	*  Corresponding COBOL Variable is WSE-2-15B-T-FLD3
	*  @param value
	**/
   public void setWse215bTFld3(char[] value) {
      wse215bTFld3 = checkWse215bTFld3Constraints(value);
      serializeWse215bTFld3(wse215bTFld3);
   } 

     /**
	 * 	Update Wse215bTFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215bTFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215bTFld3,wse215bTFld3.length);
   	
   }
   
   public void setWse215bTFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld3,wse215bTFld3.length);
   	
   }
   
     /**
	 * 	Update Wse215bTFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215bTFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215bTFld3 with another Field
	 *	@param value
	 */
   public void setWse215bTFld3(Field source) {
       replace(source,0,source.length(),beginWse215bTFld3,WSE_215B_TFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215bTFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215bTFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215bTFld3,WSE_215B_TFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse215bTFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215bTFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bTFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse215bT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse215bTFld1(CONSTANTS.SPACE_10);
         setWse215bTFld2(CONSTANTS.SPACE_20);
         setWse215bTFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse215bTFieldLength() {
			return WSE_215B_T_LENGTH;
		}

}
  
