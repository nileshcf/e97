package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse21aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse21aS extends Wse21aSSerialized {
   

						private char[] wse21aSFld1 = Field.fillLowValue(30);

						private char[] wse21aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse21aS
	**/
    public Wse21aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse21aSFld1
	 *	@return wse21aSFld1
	 */
   public char[] getWse21aSFld1() throws CFException{
     if (isWse21aSFld1Modified()) { 
        wse21aSFld1 = refreshWse21aSFld1();
     }
   		return wse21aSFld1;
   }

  
	/**
	*  set variable wse21aSFld1
	*  Corresponding COBOL Variable is WSE-2-1A-S-FLD1
	*  @param value
	**/
   public void setWse21aSFld1(char[] value) {
      wse21aSFld1 = checkWse21aSFld1Constraints(value);
      serializeWse21aSFld1(wse21aSFld1);
   } 

     /**
	 * 	Update Wse21aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21aSFld1,wse21aSFld1.length);
   	
   }
   
   public void setWse21aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aSFld1,wse21aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse21aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21aSFld1 with another Field
	 *	@param value
	 */
   public void setWse21aSFld1(Field source) {
       replace(source,0,source.length(),beginWse21aSFld1,WSE_21A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21aSFld1,WSE_21A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse21aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse21aSFld2
	 *	@return wse21aSFld2
	 */
   public char[] getWse21aSFld2() throws CFException{
     if (isWse21aSFld2Modified()) { 
        wse21aSFld2 = refreshWse21aSFld2();
     }
   		return wse21aSFld2;
   }

  
	/**
	*  set variable wse21aSFld2
	*  Corresponding COBOL Variable is WSE-2-1A-S-FLD2
	*  @param value
	**/
   public void setWse21aSFld2(char[] value) {
      wse21aSFld2 = checkWse21aSFld2Constraints(value);
      serializeWse21aSFld2(wse21aSFld2);
   } 

     /**
	 * 	Update Wse21aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21aSFld2,wse21aSFld2.length);
   	
   }
   
   public void setWse21aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aSFld2,wse21aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse21aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21aSFld2 with another Field
	 *	@param value
	 */
   public void setWse21aSFld2(Field source) {
       replace(source,0,source.length(),beginWse21aSFld2,WSE_21A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21aSFld2,WSE_21A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse21aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse21aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse21aSFld1(CONSTANTS.SPACE_30);
         setWse21aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse21aSFieldLength() {
			return WSE_21A_S_LENGTH;
		}

}
  
