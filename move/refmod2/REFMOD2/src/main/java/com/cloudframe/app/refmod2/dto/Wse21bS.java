package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse21bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse21bS extends Wse21bSSerialized {
   

						private char[] wse21bSFld1 = Field.fillLowValue(30);

						private char[] wse21bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse21bS
	**/
    public Wse21bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse21bSFld1
	 *	@return wse21bSFld1
	 */
   public char[] getWse21bSFld1() throws CFException{
     if (isWse21bSFld1Modified()) { 
        wse21bSFld1 = refreshWse21bSFld1();
     }
   		return wse21bSFld1;
   }

  
	/**
	*  set variable wse21bSFld1
	*  Corresponding COBOL Variable is WSE-2-1B-S-FLD1
	*  @param value
	**/
   public void setWse21bSFld1(char[] value) {
      wse21bSFld1 = checkWse21bSFld1Constraints(value);
      serializeWse21bSFld1(wse21bSFld1);
   } 

     /**
	 * 	Update Wse21bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21bSFld1,wse21bSFld1.length);
   	
   }
   
   public void setWse21bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bSFld1,wse21bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse21bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21bSFld1 with another Field
	 *	@param value
	 */
   public void setWse21bSFld1(Field source) {
       replace(source,0,source.length(),beginWse21bSFld1,WSE_21B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21bSFld1,WSE_21B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse21bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse21bSFld2
	 *	@return wse21bSFld2
	 */
   public char[] getWse21bSFld2() throws CFException{
     if (isWse21bSFld2Modified()) { 
        wse21bSFld2 = refreshWse21bSFld2();
     }
   		return wse21bSFld2;
   }

  
	/**
	*  set variable wse21bSFld2
	*  Corresponding COBOL Variable is WSE-2-1B-S-FLD2
	*  @param value
	**/
   public void setWse21bSFld2(char[] value) {
      wse21bSFld2 = checkWse21bSFld2Constraints(value);
      serializeWse21bSFld2(wse21bSFld2);
   } 

     /**
	 * 	Update Wse21bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21bSFld2,wse21bSFld2.length);
   	
   }
   
   public void setWse21bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bSFld2,wse21bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse21bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21bSFld2 with another Field
	 *	@param value
	 */
   public void setWse21bSFld2(Field source) {
       replace(source,0,source.length(),beginWse21bSFld2,WSE_21B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21bSFld2,WSE_21B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse21bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse21bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse21bSFld1(CONSTANTS.SPACE_30);
         setWse21bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse21bSFieldLength() {
			return WSE_21B_S_LENGTH;
		}

}
  
