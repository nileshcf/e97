package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse217bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse217bS extends Wse217bSSerialized {
   

						private char[] wse217bSFld1 = Field.fillLowValue(30);

						private char[] wse217bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse217bS
	**/
    public Wse217bS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse217bSFld1
	 *	@return wse217bSFld1
	 */
   public char[] getWse217bSFld1() throws CFException{
     if (isWse217bSFld1Modified()) { 
        wse217bSFld1 = refreshWse217bSFld1();
     }
   		return wse217bSFld1;
   }

  
	/**
	*  set variable wse217bSFld1
	*  Corresponding COBOL Variable is WSE-2-17B-S-FLD1
	*  @param value
	**/
   public void setWse217bSFld1(char[] value) {
      wse217bSFld1 = checkWse217bSFld1Constraints(value);
      serializeWse217bSFld1(wse217bSFld1);
   } 

     /**
	 * 	Update Wse217bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217bSFld1,wse217bSFld1.length);
   	
   }
   
   public void setWse217bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bSFld1,wse217bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse217bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217bSFld1 with another Field
	 *	@param value
	 */
   public void setWse217bSFld1(Field source) {
       replace(source,0,source.length(),beginWse217bSFld1,WSE_217B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217bSFld1,WSE_217B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse217bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse217bSFld2
	 *	@return wse217bSFld2
	 */
   public char[] getWse217bSFld2() throws CFException{
     if (isWse217bSFld2Modified()) { 
        wse217bSFld2 = refreshWse217bSFld2();
     }
   		return wse217bSFld2;
   }

  
	/**
	*  set variable wse217bSFld2
	*  Corresponding COBOL Variable is WSE-2-17B-S-FLD2
	*  @param value
	**/
   public void setWse217bSFld2(char[] value) {
      wse217bSFld2 = checkWse217bSFld2Constraints(value);
      serializeWse217bSFld2(wse217bSFld2);
   } 

     /**
	 * 	Update Wse217bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217bSFld2,wse217bSFld2.length);
   	
   }
   
   public void setWse217bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bSFld2,wse217bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse217bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217bSFld2 with another Field
	 *	@param value
	 */
   public void setWse217bSFld2(Field source) {
       replace(source,0,source.length(),beginWse217bSFld2,WSE_217B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217bSFld2,WSE_217B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse217bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse217bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse217bSFld1(CONSTANTS.SPACE_30);
         setWse217bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse217bSFieldLength() {
			return WSE_217B_S_LENGTH;
		}

}
  
