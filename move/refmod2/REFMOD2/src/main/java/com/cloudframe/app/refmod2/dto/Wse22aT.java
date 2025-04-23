package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse22aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse22aT extends Wse22aTSerialized {
   

						private char[] wse22aTFld1 = Field.fillLowValue(20);

						private char[] wse22aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse22aT
	**/
    public Wse22aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse22aTFld1
	 *	@return wse22aTFld1
	 */
   public char[] getWse22aTFld1() throws CFException{
     if (isWse22aTFld1Modified()) { 
        wse22aTFld1 = refreshWse22aTFld1();
     }
   		return wse22aTFld1;
   }

  
	/**
	*  set variable wse22aTFld1
	*  Corresponding COBOL Variable is WSE-2-2A-T-FLD1
	*  @param value
	**/
   public void setWse22aTFld1(char[] value) {
      wse22aTFld1 = checkWse22aTFld1Constraints(value);
      serializeWse22aTFld1(wse22aTFld1);
   } 

     /**
	 * 	Update Wse22aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse22aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse22aTFld1,wse22aTFld1.length);
   	
   }
   
   public void setWse22aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse22aTFld1,wse22aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse22aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse22aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse22aTFld1 with another Field
	 *	@param value
	 */
   public void setWse22aTFld1(Field source) {
       replace(source,0,source.length(),beginWse22aTFld1,WSE_22A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse22aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse22aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse22aTFld1,WSE_22A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse22aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse22aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse22aTFld2
	 *	@return wse22aTFld2
	 */
   public char[] getWse22aTFld2() throws CFException{
     if (isWse22aTFld2Modified()) { 
        wse22aTFld2 = refreshWse22aTFld2();
     }
   		return wse22aTFld2;
   }

  
	/**
	*  set variable wse22aTFld2
	*  Corresponding COBOL Variable is WSE-2-2A-T-FLD2
	*  @param value
	**/
   public void setWse22aTFld2(char[] value) {
      wse22aTFld2 = checkWse22aTFld2Constraints(value);
      serializeWse22aTFld2(wse22aTFld2);
   } 

     /**
	 * 	Update Wse22aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse22aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse22aTFld2,wse22aTFld2.length);
   	
   }
   
   public void setWse22aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse22aTFld2,wse22aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse22aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse22aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse22aTFld2 with another Field
	 *	@param value
	 */
   public void setWse22aTFld2(Field source) {
       replace(source,0,source.length(),beginWse22aTFld2,WSE_22A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse22aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse22aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse22aTFld2,WSE_22A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse22aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse22aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse22aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse22aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse22aTFld1(CONSTANTS.SPACE_20);
         setWse22aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse22aTFieldLength() {
			return WSE_22A_T_LENGTH;
		}

}
  
