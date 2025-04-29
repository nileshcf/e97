package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse25aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse25aT extends Wse25aTSerialized {
   

						private char[] wse25aTFld1 = Field.fillLowValue(20);

						private char[] wse25aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse25aT
	**/
    public Wse25aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse25aTFld1
	 *	@return wse25aTFld1
	 */
   public char[] getWse25aTFld1() throws CFException{
     if (isWse25aTFld1Modified()) { 
        wse25aTFld1 = refreshWse25aTFld1();
     }
   		return wse25aTFld1;
   }

  
	/**
	*  set variable wse25aTFld1
	*  Corresponding COBOL Variable is WSE-2-5A-T-FLD1
	*  @param value
	**/
   public void setWse25aTFld1(char[] value) {
      wse25aTFld1 = checkWse25aTFld1Constraints(value);
      serializeWse25aTFld1(wse25aTFld1);
   } 

     /**
	 * 	Update Wse25aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25aTFld1,wse25aTFld1.length);
   	
   }
   
   public void setWse25aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aTFld1,wse25aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse25aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25aTFld1 with another Field
	 *	@param value
	 */
   public void setWse25aTFld1(Field source) {
       replace(source,0,source.length(),beginWse25aTFld1,WSE_25A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25aTFld1,WSE_25A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse25aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse25aTFld2
	 *	@return wse25aTFld2
	 */
   public char[] getWse25aTFld2() throws CFException{
     if (isWse25aTFld2Modified()) { 
        wse25aTFld2 = refreshWse25aTFld2();
     }
   		return wse25aTFld2;
   }

  
	/**
	*  set variable wse25aTFld2
	*  Corresponding COBOL Variable is WSE-2-5A-T-FLD2
	*  @param value
	**/
   public void setWse25aTFld2(char[] value) {
      wse25aTFld2 = checkWse25aTFld2Constraints(value);
      serializeWse25aTFld2(wse25aTFld2);
   } 

     /**
	 * 	Update Wse25aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25aTFld2,wse25aTFld2.length);
   	
   }
   
   public void setWse25aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aTFld2,wse25aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse25aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25aTFld2 with another Field
	 *	@param value
	 */
   public void setWse25aTFld2(Field source) {
       replace(source,0,source.length(),beginWse25aTFld2,WSE_25A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25aTFld2,WSE_25A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse25aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse25aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse25aTFld1(CONSTANTS.SPACE_20);
         setWse25aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse25aTFieldLength() {
			return WSE_25A_T_LENGTH;
		}

}
  
