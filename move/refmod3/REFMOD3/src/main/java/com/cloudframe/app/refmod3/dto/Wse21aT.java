package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse21aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse21aT extends Wse21aTSerialized {
   

						private char[] wse21aTFld1 = Field.fillLowValue(20);

						private char[] wse21aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse21aT
	**/
    public Wse21aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse21aTFld1
	 *	@return wse21aTFld1
	 */
   public char[] getWse21aTFld1() throws CFException{
     if (isWse21aTFld1Modified()) { 
        wse21aTFld1 = refreshWse21aTFld1();
     }
   		return wse21aTFld1;
   }

  
	/**
	*  set variable wse21aTFld1
	*  Corresponding COBOL Variable is WSE-2-1A-T-FLD1
	*  @param value
	**/
   public void setWse21aTFld1(char[] value) {
      wse21aTFld1 = checkWse21aTFld1Constraints(value);
      serializeWse21aTFld1(wse21aTFld1);
   } 

     /**
	 * 	Update Wse21aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21aTFld1,wse21aTFld1.length);
   	
   }
   
   public void setWse21aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aTFld1,wse21aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse21aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21aTFld1 with another Field
	 *	@param value
	 */
   public void setWse21aTFld1(Field source) {
       replace(source,0,source.length(),beginWse21aTFld1,WSE_21A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21aTFld1,WSE_21A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse21aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse21aTFld2
	 *	@return wse21aTFld2
	 */
   public char[] getWse21aTFld2() throws CFException{
     if (isWse21aTFld2Modified()) { 
        wse21aTFld2 = refreshWse21aTFld2();
     }
   		return wse21aTFld2;
   }

  
	/**
	*  set variable wse21aTFld2
	*  Corresponding COBOL Variable is WSE-2-1A-T-FLD2
	*  @param value
	**/
   public void setWse21aTFld2(char[] value) {
      wse21aTFld2 = checkWse21aTFld2Constraints(value);
      serializeWse21aTFld2(wse21aTFld2);
   } 

     /**
	 * 	Update Wse21aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse21aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse21aTFld2,wse21aTFld2.length);
   	
   }
   
   public void setWse21aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aTFld2,wse21aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse21aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse21aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse21aTFld2 with another Field
	 *	@param value
	 */
   public void setWse21aTFld2(Field source) {
       replace(source,0,source.length(),beginWse21aTFld2,WSE_21A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse21aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse21aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse21aTFld2,WSE_21A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse21aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse21aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse21aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse21aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse21aTFld1(CONSTANTS.SPACE_20);
         setWse21aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse21aTFieldLength() {
			return WSE_21A_T_LENGTH;
		}

}
  
