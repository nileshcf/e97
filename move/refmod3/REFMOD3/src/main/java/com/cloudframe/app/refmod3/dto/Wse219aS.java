package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse219aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse219aS extends Wse219aSSerialized {
   

						private char[] wse219aSFld1 = Field.fillLowValue(30);

						private char[] wse219aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse219aS
	**/
    public Wse219aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse219aSFld1
	 *	@return wse219aSFld1
	 */
   public char[] getWse219aSFld1() throws CFException{
     if (isWse219aSFld1Modified()) { 
        wse219aSFld1 = refreshWse219aSFld1();
     }
   		return wse219aSFld1;
   }

  
	/**
	*  set variable wse219aSFld1
	*  Corresponding COBOL Variable is WSE-2-19A-S-FLD1
	*  @param value
	**/
   public void setWse219aSFld1(char[] value) {
      wse219aSFld1 = checkWse219aSFld1Constraints(value);
      serializeWse219aSFld1(wse219aSFld1);
   } 

     /**
	 * 	Update Wse219aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219aSFld1,wse219aSFld1.length);
   	
   }
   
   public void setWse219aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aSFld1,wse219aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse219aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219aSFld1 with another Field
	 *	@param value
	 */
   public void setWse219aSFld1(Field source) {
       replace(source,0,source.length(),beginWse219aSFld1,WSE_219A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219aSFld1,WSE_219A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse219aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse219aSFld2
	 *	@return wse219aSFld2
	 */
   public char[] getWse219aSFld2() throws CFException{
     if (isWse219aSFld2Modified()) { 
        wse219aSFld2 = refreshWse219aSFld2();
     }
   		return wse219aSFld2;
   }

  
	/**
	*  set variable wse219aSFld2
	*  Corresponding COBOL Variable is WSE-2-19A-S-FLD2
	*  @param value
	**/
   public void setWse219aSFld2(char[] value) {
      wse219aSFld2 = checkWse219aSFld2Constraints(value);
      serializeWse219aSFld2(wse219aSFld2);
   } 

     /**
	 * 	Update Wse219aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219aSFld2,wse219aSFld2.length);
   	
   }
   
   public void setWse219aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aSFld2,wse219aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse219aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219aSFld2 with another Field
	 *	@param value
	 */
   public void setWse219aSFld2(Field source) {
       replace(source,0,source.length(),beginWse219aSFld2,WSE_219A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219aSFld2,WSE_219A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse219aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse219aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse219aSFld1(CONSTANTS.SPACE_30);
         setWse219aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse219aSFieldLength() {
			return WSE_219A_S_LENGTH;
		}

}
  
