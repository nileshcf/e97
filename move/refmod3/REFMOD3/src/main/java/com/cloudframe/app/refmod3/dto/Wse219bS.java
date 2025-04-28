package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse219bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse219bS extends Wse219bSSerialized {
   

						private char[] wse219bSFld1 = Field.fillLowValue(30);

						private char[] wse219bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse219bS
	**/
    public Wse219bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse219bSFld1
	 *	@return wse219bSFld1
	 */
   public char[] getWse219bSFld1() throws CFException{
     if (isWse219bSFld1Modified()) { 
        wse219bSFld1 = refreshWse219bSFld1();
     }
   		return wse219bSFld1;
   }

  
	/**
	*  set variable wse219bSFld1
	*  Corresponding COBOL Variable is WSE-2-19B-S-FLD1
	*  @param value
	**/
   public void setWse219bSFld1(char[] value) {
      wse219bSFld1 = checkWse219bSFld1Constraints(value);
      serializeWse219bSFld1(wse219bSFld1);
   } 

     /**
	 * 	Update Wse219bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219bSFld1,wse219bSFld1.length);
   	
   }
   
   public void setWse219bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bSFld1,wse219bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse219bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219bSFld1 with another Field
	 *	@param value
	 */
   public void setWse219bSFld1(Field source) {
       replace(source,0,source.length(),beginWse219bSFld1,WSE_219B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219bSFld1,WSE_219B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse219bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse219bSFld2
	 *	@return wse219bSFld2
	 */
   public char[] getWse219bSFld2() throws CFException{
     if (isWse219bSFld2Modified()) { 
        wse219bSFld2 = refreshWse219bSFld2();
     }
   		return wse219bSFld2;
   }

  
	/**
	*  set variable wse219bSFld2
	*  Corresponding COBOL Variable is WSE-2-19B-S-FLD2
	*  @param value
	**/
   public void setWse219bSFld2(char[] value) {
      wse219bSFld2 = checkWse219bSFld2Constraints(value);
      serializeWse219bSFld2(wse219bSFld2);
   } 

     /**
	 * 	Update Wse219bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219bSFld2,wse219bSFld2.length);
   	
   }
   
   public void setWse219bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bSFld2,wse219bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse219bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219bSFld2 with another Field
	 *	@param value
	 */
   public void setWse219bSFld2(Field source) {
       replace(source,0,source.length(),beginWse219bSFld2,WSE_219B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219bSFld2,WSE_219B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse219bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse219bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse219bSFld1(CONSTANTS.SPACE_30);
         setWse219bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse219bSFieldLength() {
			return WSE_219B_S_LENGTH;
		}

}
  
