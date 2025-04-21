package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse27bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse27bS extends Wse27bSSerialized {
   

						private char[] wse27bSFld1 = Field.fillLowValue(30);

						private char[] wse27bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse27bS
	**/
    public Wse27bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse27bSFld1
	 *	@return wse27bSFld1
	 */
   public char[] getWse27bSFld1() throws CFException{
     if (isWse27bSFld1Modified()) { 
        wse27bSFld1 = refreshWse27bSFld1();
     }
   		return wse27bSFld1;
   }

  
	/**
	*  set variable wse27bSFld1
	*  Corresponding COBOL Variable is WSE-2-7B-S-FLD1
	*  @param value
	**/
   public void setWse27bSFld1(char[] value) {
      wse27bSFld1 = checkWse27bSFld1Constraints(value);
      serializeWse27bSFld1(wse27bSFld1);
   } 

     /**
	 * 	Update Wse27bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27bSFld1,wse27bSFld1.length);
   	
   }
   
   public void setWse27bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bSFld1,wse27bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse27bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27bSFld1 with another Field
	 *	@param value
	 */
   public void setWse27bSFld1(Field source) {
       replace(source,0,source.length(),beginWse27bSFld1,WSE_27B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27bSFld1,WSE_27B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse27bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse27bSFld2
	 *	@return wse27bSFld2
	 */
   public char[] getWse27bSFld2() throws CFException{
     if (isWse27bSFld2Modified()) { 
        wse27bSFld2 = refreshWse27bSFld2();
     }
   		return wse27bSFld2;
   }

  
	/**
	*  set variable wse27bSFld2
	*  Corresponding COBOL Variable is WSE-2-7B-S-FLD2
	*  @param value
	**/
   public void setWse27bSFld2(char[] value) {
      wse27bSFld2 = checkWse27bSFld2Constraints(value);
      serializeWse27bSFld2(wse27bSFld2);
   } 

     /**
	 * 	Update Wse27bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27bSFld2,wse27bSFld2.length);
   	
   }
   
   public void setWse27bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bSFld2,wse27bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse27bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27bSFld2 with another Field
	 *	@param value
	 */
   public void setWse27bSFld2(Field source) {
       replace(source,0,source.length(),beginWse27bSFld2,WSE_27B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27bSFld2,WSE_27B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse27bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse27bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse27bSFld1(CONSTANTS.SPACE_30);
         setWse27bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse27bSFieldLength() {
			return WSE_27B_S_LENGTH;
		}

}
  
