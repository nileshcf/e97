package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse27aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse27aS extends Wse27aSSerialized {
   

						private char[] wse27aSFld1 = Field.fillLowValue(30);

						private char[] wse27aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse27aS
	**/
    public Wse27aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse27aSFld1
	 *	@return wse27aSFld1
	 */
   public char[] getWse27aSFld1() throws CFException{
     if (isWse27aSFld1Modified()) { 
        wse27aSFld1 = refreshWse27aSFld1();
     }
   		return wse27aSFld1;
   }

  
	/**
	*  set variable wse27aSFld1
	*  Corresponding COBOL Variable is WSE-2-7A-S-FLD1
	*  @param value
	**/
   public void setWse27aSFld1(char[] value) {
      wse27aSFld1 = checkWse27aSFld1Constraints(value);
      serializeWse27aSFld1(wse27aSFld1);
   } 

     /**
	 * 	Update Wse27aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27aSFld1,wse27aSFld1.length);
   	
   }
   
   public void setWse27aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aSFld1,wse27aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse27aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27aSFld1 with another Field
	 *	@param value
	 */
   public void setWse27aSFld1(Field source) {
       replace(source,0,source.length(),beginWse27aSFld1,WSE_27A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27aSFld1,WSE_27A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse27aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse27aSFld2
	 *	@return wse27aSFld2
	 */
   public char[] getWse27aSFld2() throws CFException{
     if (isWse27aSFld2Modified()) { 
        wse27aSFld2 = refreshWse27aSFld2();
     }
   		return wse27aSFld2;
   }

  
	/**
	*  set variable wse27aSFld2
	*  Corresponding COBOL Variable is WSE-2-7A-S-FLD2
	*  @param value
	**/
   public void setWse27aSFld2(char[] value) {
      wse27aSFld2 = checkWse27aSFld2Constraints(value);
      serializeWse27aSFld2(wse27aSFld2);
   } 

     /**
	 * 	Update Wse27aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27aSFld2,wse27aSFld2.length);
   	
   }
   
   public void setWse27aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aSFld2,wse27aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse27aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27aSFld2 with another Field
	 *	@param value
	 */
   public void setWse27aSFld2(Field source) {
       replace(source,0,source.length(),beginWse27aSFld2,WSE_27A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27aSFld2,WSE_27A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse27aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse27aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse27aSFld1(CONSTANTS.SPACE_30);
         setWse27aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse27aSFieldLength() {
			return WSE_27A_S_LENGTH;
		}

}
  
