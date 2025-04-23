package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse24aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse24aT extends Wse24aTSerialized {
   

						private char[] wse24aTFld1 = Field.fillLowValue(20);

						private char[] wse24aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse24aT
	**/
    public Wse24aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse24aTFld1
	 *	@return wse24aTFld1
	 */
   public char[] getWse24aTFld1() throws CFException{
     if (isWse24aTFld1Modified()) { 
        wse24aTFld1 = refreshWse24aTFld1();
     }
   		return wse24aTFld1;
   }

  
	/**
	*  set variable wse24aTFld1
	*  Corresponding COBOL Variable is WSE-2-4A-T-FLD1
	*  @param value
	**/
   public void setWse24aTFld1(char[] value) {
      wse24aTFld1 = checkWse24aTFld1Constraints(value);
      serializeWse24aTFld1(wse24aTFld1);
   } 

     /**
	 * 	Update Wse24aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse24aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse24aTFld1,wse24aTFld1.length);
   	
   }
   
   public void setWse24aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse24aTFld1,wse24aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse24aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse24aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse24aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse24aTFld1 with another Field
	 *	@param value
	 */
   public void setWse24aTFld1(Field source) {
       replace(source,0,source.length(),beginWse24aTFld1,WSE_24A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse24aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse24aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse24aTFld1,WSE_24A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse24aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse24aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse24aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse24aTFld2
	 *	@return wse24aTFld2
	 */
   public char[] getWse24aTFld2() throws CFException{
     if (isWse24aTFld2Modified()) { 
        wse24aTFld2 = refreshWse24aTFld2();
     }
   		return wse24aTFld2;
   }

  
	/**
	*  set variable wse24aTFld2
	*  Corresponding COBOL Variable is WSE-2-4A-T-FLD2
	*  @param value
	**/
   public void setWse24aTFld2(char[] value) {
      wse24aTFld2 = checkWse24aTFld2Constraints(value);
      serializeWse24aTFld2(wse24aTFld2);
   } 

     /**
	 * 	Update Wse24aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse24aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse24aTFld2,wse24aTFld2.length);
   	
   }
   
   public void setWse24aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse24aTFld2,wse24aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse24aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse24aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse24aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse24aTFld2 with another Field
	 *	@param value
	 */
   public void setWse24aTFld2(Field source) {
       replace(source,0,source.length(),beginWse24aTFld2,WSE_24A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse24aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse24aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse24aTFld2,WSE_24A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse24aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse24aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse24aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse24aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse24aTFld1(CONSTANTS.SPACE_20);
         setWse24aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse24aTFieldLength() {
			return WSE_24A_T_LENGTH;
		}

}
  
