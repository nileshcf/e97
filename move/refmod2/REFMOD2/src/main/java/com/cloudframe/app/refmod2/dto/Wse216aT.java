package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse216aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse216aT extends Wse216aTSerialized {
   

						private char[] wse216aTFld1 = Field.fillLowValue(30);

						private char[] wse216aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse216aT
	**/
    public Wse216aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse216aTFld1
	 *	@return wse216aTFld1
	 */
   public char[] getWse216aTFld1() throws CFException{
     if (isWse216aTFld1Modified()) { 
        wse216aTFld1 = refreshWse216aTFld1();
     }
   		return wse216aTFld1;
   }

  
	/**
	*  set variable wse216aTFld1
	*  Corresponding COBOL Variable is WSE-2-16A-T-FLD1
	*  @param value
	**/
   public void setWse216aTFld1(char[] value) {
      wse216aTFld1 = checkWse216aTFld1Constraints(value);
      serializeWse216aTFld1(wse216aTFld1);
   } 

     /**
	 * 	Update Wse216aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse216aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse216aTFld1,wse216aTFld1.length);
   	
   }
   
   public void setWse216aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aTFld1,wse216aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse216aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse216aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse216aTFld1 with another Field
	 *	@param value
	 */
   public void setWse216aTFld1(Field source) {
       replace(source,0,source.length(),beginWse216aTFld1,WSE_216A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse216aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse216aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse216aTFld1,WSE_216A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse216aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse216aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse216aTFld2
	 *	@return wse216aTFld2
	 */
   public char[] getWse216aTFld2() throws CFException{
     if (isWse216aTFld2Modified()) { 
        wse216aTFld2 = refreshWse216aTFld2();
     }
   		return wse216aTFld2;
   }

  
	/**
	*  set variable wse216aTFld2
	*  Corresponding COBOL Variable is WSE-2-16A-T-FLD2
	*  @param value
	**/
   public void setWse216aTFld2(char[] value) {
      wse216aTFld2 = checkWse216aTFld2Constraints(value);
      serializeWse216aTFld2(wse216aTFld2);
   } 

     /**
	 * 	Update Wse216aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse216aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse216aTFld2,wse216aTFld2.length);
   	
   }
   
   public void setWse216aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aTFld2,wse216aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse216aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse216aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse216aTFld2 with another Field
	 *	@param value
	 */
   public void setWse216aTFld2(Field source) {
       replace(source,0,source.length(),beginWse216aTFld2,WSE_216A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse216aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse216aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse216aTFld2,WSE_216A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse216aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse216aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse216aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse216aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse216aTFld1(CONSTANTS.SPACE_30);
         setWse216aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse216aTFieldLength() {
			return WSE_216A_T_LENGTH;
		}

}
  
