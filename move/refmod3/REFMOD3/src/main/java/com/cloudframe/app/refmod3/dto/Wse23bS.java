package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse23bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse23bS extends Wse23bSSerialized {
   

						private char[] wse23bSFld1 = Field.fillLowValue(30);

						private char[] wse23bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse23bS
	**/
    public Wse23bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse23bSFld1
	 *	@return wse23bSFld1
	 */
   public char[] getWse23bSFld1() throws CFException{
     if (isWse23bSFld1Modified()) { 
        wse23bSFld1 = refreshWse23bSFld1();
     }
   		return wse23bSFld1;
   }

  
	/**
	*  set variable wse23bSFld1
	*  Corresponding COBOL Variable is WSE-2-3B-S-FLD1
	*  @param value
	**/
   public void setWse23bSFld1(char[] value) {
      wse23bSFld1 = checkWse23bSFld1Constraints(value);
      serializeWse23bSFld1(wse23bSFld1);
   } 

     /**
	 * 	Update Wse23bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse23bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse23bSFld1,wse23bSFld1.length);
   	
   }
   
   public void setWse23bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bSFld1,wse23bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse23bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse23bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse23bSFld1 with another Field
	 *	@param value
	 */
   public void setWse23bSFld1(Field source) {
       replace(source,0,source.length(),beginWse23bSFld1,WSE_23B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse23bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse23bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse23bSFld1,WSE_23B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse23bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse23bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse23bSFld2
	 *	@return wse23bSFld2
	 */
   public char[] getWse23bSFld2() throws CFException{
     if (isWse23bSFld2Modified()) { 
        wse23bSFld2 = refreshWse23bSFld2();
     }
   		return wse23bSFld2;
   }

  
	/**
	*  set variable wse23bSFld2
	*  Corresponding COBOL Variable is WSE-2-3B-S-FLD2
	*  @param value
	**/
   public void setWse23bSFld2(char[] value) {
      wse23bSFld2 = checkWse23bSFld2Constraints(value);
      serializeWse23bSFld2(wse23bSFld2);
   } 

     /**
	 * 	Update Wse23bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse23bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse23bSFld2,wse23bSFld2.length);
   	
   }
   
   public void setWse23bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bSFld2,wse23bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse23bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse23bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse23bSFld2 with another Field
	 *	@param value
	 */
   public void setWse23bSFld2(Field source) {
       replace(source,0,source.length(),beginWse23bSFld2,WSE_23B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse23bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse23bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse23bSFld2,WSE_23B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse23bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse23bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse23bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse23bSFld1(CONSTANTS.SPACE_30);
         setWse23bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse23bSFieldLength() {
			return WSE_23B_S_LENGTH;
		}

}
  
