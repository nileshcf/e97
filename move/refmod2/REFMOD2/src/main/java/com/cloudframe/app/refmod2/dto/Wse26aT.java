package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse26aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse26aT extends Wse26aTSerialized {
   

						private char[] wse26aTFld1 = Field.fillLowValue(20);

						private char[] wse26aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse26aT
	**/
    public Wse26aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse26aTFld1
	 *	@return wse26aTFld1
	 */
   public char[] getWse26aTFld1() throws CFException{
     if (isWse26aTFld1Modified()) { 
        wse26aTFld1 = refreshWse26aTFld1();
     }
   		return wse26aTFld1;
   }

  
	/**
	*  set variable wse26aTFld1
	*  Corresponding COBOL Variable is WSE-2-6A-T-FLD1
	*  @param value
	**/
   public void setWse26aTFld1(char[] value) {
      wse26aTFld1 = checkWse26aTFld1Constraints(value);
      serializeWse26aTFld1(wse26aTFld1);
   } 

     /**
	 * 	Update Wse26aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse26aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse26aTFld1,wse26aTFld1.length);
   	
   }
   
   public void setWse26aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aTFld1,wse26aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse26aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse26aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse26aTFld1 with another Field
	 *	@param value
	 */
   public void setWse26aTFld1(Field source) {
       replace(source,0,source.length(),beginWse26aTFld1,WSE_26A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse26aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse26aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse26aTFld1,WSE_26A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse26aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse26aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse26aTFld2
	 *	@return wse26aTFld2
	 */
   public char[] getWse26aTFld2() throws CFException{
     if (isWse26aTFld2Modified()) { 
        wse26aTFld2 = refreshWse26aTFld2();
     }
   		return wse26aTFld2;
   }

  
	/**
	*  set variable wse26aTFld2
	*  Corresponding COBOL Variable is WSE-2-6A-T-FLD2
	*  @param value
	**/
   public void setWse26aTFld2(char[] value) {
      wse26aTFld2 = checkWse26aTFld2Constraints(value);
      serializeWse26aTFld2(wse26aTFld2);
   } 

     /**
	 * 	Update Wse26aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse26aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse26aTFld2,wse26aTFld2.length);
   	
   }
   
   public void setWse26aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aTFld2,wse26aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse26aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse26aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse26aTFld2 with another Field
	 *	@param value
	 */
   public void setWse26aTFld2(Field source) {
       replace(source,0,source.length(),beginWse26aTFld2,WSE_26A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse26aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse26aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse26aTFld2,WSE_26A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse26aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse26aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse26aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse26aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse26aTFld1(CONSTANTS.SPACE_20);
         setWse26aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse26aTFieldLength() {
			return WSE_26A_T_LENGTH;
		}

}
  
