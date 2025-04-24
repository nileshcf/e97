package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse211bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse211bS extends Wse211bSSerialized { 
   

						private char[] wse211bSFld1 = Field.fillLowValue(30);

						private char[] wse211bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse211bS
	**/
    public Wse211bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse211bSFld1
	 *	@return wse211bSFld1
	 */
   public char[] getWse211bSFld1() throws CFException{
     if (isWse211bSFld1Modified()) { 
        wse211bSFld1 = refreshWse211bSFld1();
     }
   		return wse211bSFld1;
   }

  
	/**
	*  set variable wse211bSFld1
	*  Corresponding COBOL Variable is WSE-2-11B-S-FLD1
	*  @param value
	**/
   public void setWse211bSFld1(char[] value) {
      wse211bSFld1 = checkWse211bSFld1Constraints(value);
      serializeWse211bSFld1(wse211bSFld1);
   } 

     /**
	 * 	Update Wse211bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse211bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse211bSFld1,wse211bSFld1.length);
   	
   }
   
   public void setWse211bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse211bSFld1,wse211bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse211bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse211bSFld1 with another Field
	 *	@param value
	 */
   public void setWse211bSFld1(Field source) {
       replace(source,0,source.length(),beginWse211bSFld1,WSE_211B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse211bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse211bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse211bSFld1,WSE_211B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse211bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse211bSFld2
	 *	@return wse211bSFld2
	 */
   public char[] getWse211bSFld2() throws CFException{
     if (isWse211bSFld2Modified()) { 
        wse211bSFld2 = refreshWse211bSFld2();
     }
   		return wse211bSFld2;
   }

  
	/**
	*  set variable wse211bSFld2
	*  Corresponding COBOL Variable is WSE-2-11B-S-FLD2
	*  @param value
	**/
   public void setWse211bSFld2(char[] value) {
      wse211bSFld2 = checkWse211bSFld2Constraints(value);
      serializeWse211bSFld2(wse211bSFld2);
   } 

     /**
	 * 	Update Wse211bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse211bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse211bSFld2,wse211bSFld2.length);
   	
   }
   
   public void setWse211bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse211bSFld2,wse211bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse211bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse211bSFld2 with another Field
	 *	@param value
	 */
   public void setWse211bSFld2(Field source) {
       replace(source,0,source.length(),beginWse211bSFld2,WSE_211B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse211bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse211bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse211bSFld2,WSE_211B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse211bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse211bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse211bSFld1(CONSTANTS.SPACE_30);
         setWse211bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse211bSFieldLength() {
			return WSE_211B_S_LENGTH;
		}

}
  
