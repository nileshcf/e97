package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse1bS extends Wse1bSSerialized {
   

						private char[] wse1bSFld1 = Field.fillLowValue(30);

						private char[] wse1bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse1bS
	**/
    public Wse1bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse1bSFld1
	 *	@return wse1bSFld1
	 */
   public char[] getWse1bSFld1() throws CFException{
     if (isWse1bSFld1Modified()) { 
        wse1bSFld1 = refreshWse1bSFld1();
     }
   		return wse1bSFld1;
   }

  
	/**
	*  set variable wse1bSFld1
	*  Corresponding COBOL Variable is WSE-1B-S-FLD1
	*  @param value
	**/
   public void setWse1bSFld1(char[] value) {
      wse1bSFld1 = checkWse1bSFld1Constraints(value);
      serializeWse1bSFld1(wse1bSFld1);
   } 

     /**
	 * 	Update Wse1bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1bSFld1,wse1bSFld1.length);
   	
   }
   
   public void setWse1bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bSFld1,wse1bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse1bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1bSFld1 with another Field
	 *	@param value
	 */
   public void setWse1bSFld1(Field source) {
       replace(source,0,source.length(),beginWse1bSFld1,WSE_1B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1bSFld1,WSE_1B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse1bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse1bSFld2
	 *	@return wse1bSFld2
	 */
   public char[] getWse1bSFld2() throws CFException{
     if (isWse1bSFld2Modified()) { 
        wse1bSFld2 = refreshWse1bSFld2();
     }
   		return wse1bSFld2;
   }

  
	/**
	*  set variable wse1bSFld2
	*  Corresponding COBOL Variable is WSE-1B-S-FLD2
	*  @param value
	**/
   public void setWse1bSFld2(char[] value) {
      wse1bSFld2 = checkWse1bSFld2Constraints(value);
      serializeWse1bSFld2(wse1bSFld2);
   } 

     /**
	 * 	Update Wse1bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1bSFld2,wse1bSFld2.length);
   	
   }
   
   public void setWse1bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bSFld2,wse1bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse1bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1bSFld2 with another Field
	 *	@param value
	 */
   public void setWse1bSFld2(Field source) {
       replace(source,0,source.length(),beginWse1bSFld2,WSE_1B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1bSFld2,WSE_1B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse1bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse1bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse1bSFld1(CONSTANTS.SPACE_30);
         setWse1bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse1bSFieldLength() {
			return WSE_1B_S_LENGTH;
		}

}
  
