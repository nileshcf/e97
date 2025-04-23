package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse1aS extends Wse1aSSerialized {
   

						private char[] wse1aSFld1 = Field.fillLowValue(30);

						private char[] wse1aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse1aS
	**/
    public Wse1aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse1aSFld1
	 *	@return wse1aSFld1
	 */
   public char[] getWse1aSFld1() throws CFException{
     if (isWse1aSFld1Modified()) { 
        wse1aSFld1 = refreshWse1aSFld1();
     }
   		return wse1aSFld1;
   }

  
	/**
	*  set variable wse1aSFld1
	*  Corresponding COBOL Variable is WSE-1A-S-FLD1
	*  @param value
	**/
   public void setWse1aSFld1(char[] value) {
      wse1aSFld1 = checkWse1aSFld1Constraints(value);
      serializeWse1aSFld1(wse1aSFld1);
   } 

     /**
	 * 	Update Wse1aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1aSFld1,wse1aSFld1.length);
   	
   }
   
   public void setWse1aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aSFld1,wse1aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse1aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1aSFld1 with another Field
	 *	@param value
	 */
   public void setWse1aSFld1(Field source) {
       replace(source,0,source.length(),beginWse1aSFld1,WSE_1A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1aSFld1,WSE_1A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse1aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse1aSFld2
	 *	@return wse1aSFld2
	 */
   public char[] getWse1aSFld2() throws CFException{
     if (isWse1aSFld2Modified()) { 
        wse1aSFld2 = refreshWse1aSFld2();
     }
   		return wse1aSFld2;
   }

  
	/**
	*  set variable wse1aSFld2
	*  Corresponding COBOL Variable is WSE-1A-S-FLD2
	*  @param value
	**/
   public void setWse1aSFld2(char[] value) {
      wse1aSFld2 = checkWse1aSFld2Constraints(value);
      serializeWse1aSFld2(wse1aSFld2);
   } 

     /**
	 * 	Update Wse1aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1aSFld2,wse1aSFld2.length);
   	
   }
   
   public void setWse1aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aSFld2,wse1aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse1aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1aSFld2 with another Field
	 *	@param value
	 */
   public void setWse1aSFld2(Field source) {
       replace(source,0,source.length(),beginWse1aSFld2,WSE_1A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1aSFld2,WSE_1A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse1aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse1aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse1aSFld1(CONSTANTS.SPACE_30);
         setWse1aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse1aSFieldLength() {
			return WSE_1A_S_LENGTH;
		}

}
  
