package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse3bS extends Wse3bSSerialized {
   

						private char[] wse3bSFld1 = Field.fillLowValue(30);

						private char[] wse3bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse3bS
	**/
    public Wse3bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse3bSFld1
	 *	@return wse3bSFld1
	 */
   public char[] getWse3bSFld1() throws CFException{
     if (isWse3bSFld1Modified()) { 
        wse3bSFld1 = refreshWse3bSFld1();
     }
   		return wse3bSFld1;
   }

  
	/**
	*  set variable wse3bSFld1
	*  Corresponding COBOL Variable is WSE-3B-S-FLD1
	*  @param value
	**/
   public void setWse3bSFld1(char[] value) {
      wse3bSFld1 = checkWse3bSFld1Constraints(value);
      serializeWse3bSFld1(wse3bSFld1);
   } 

     /**
	 * 	Update Wse3bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3bSFld1,wse3bSFld1.length);
   	
   }
   
   public void setWse3bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bSFld1,wse3bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse3bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3bSFld1 with another Field
	 *	@param value
	 */
   public void setWse3bSFld1(Field source) {
       replace(source,0,source.length(),beginWse3bSFld1,WSE_3B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3bSFld1,WSE_3B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse3bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse3bSFld2
	 *	@return wse3bSFld2
	 */
   public char[] getWse3bSFld2() throws CFException{
     if (isWse3bSFld2Modified()) { 
        wse3bSFld2 = refreshWse3bSFld2();
     }
   		return wse3bSFld2;
   }

  
	/**
	*  set variable wse3bSFld2
	*  Corresponding COBOL Variable is WSE-3B-S-FLD2
	*  @param value
	**/
   public void setWse3bSFld2(char[] value) {
      wse3bSFld2 = checkWse3bSFld2Constraints(value);
      serializeWse3bSFld2(wse3bSFld2);
   } 

     /**
	 * 	Update Wse3bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3bSFld2,wse3bSFld2.length);
   	
   }
   
   public void setWse3bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bSFld2,wse3bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse3bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3bSFld2 with another Field
	 *	@param value
	 */
   public void setWse3bSFld2(Field source) {
       replace(source,0,source.length(),beginWse3bSFld2,WSE_3B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3bSFld2,WSE_3B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse3bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse3bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse3bSFld1(CONSTANTS.SPACE_30);
         setWse3bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse3bSFieldLength() {
			return WSE_3B_S_LENGTH;
		}

}
  
