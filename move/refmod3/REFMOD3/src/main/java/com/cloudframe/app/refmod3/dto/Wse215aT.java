package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse215aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse215aT extends Wse215aTSerialized {
   

						private char[] wse215aTFld1 = Field.fillLowValue(30);

						private char[] wse215aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse215aT
	**/
    public Wse215aT() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse215aTFld1
	 *	@return wse215aTFld1
	 */
   public char[] getWse215aTFld1() throws CFException{
     if (isWse215aTFld1Modified()) { 
        wse215aTFld1 = refreshWse215aTFld1();
     }
   		return wse215aTFld1;
   }

  
	/**
	*  set variable wse215aTFld1
	*  Corresponding COBOL Variable is WSE-2-15A-T-FLD1
	*  @param value
	**/
   public void setWse215aTFld1(char[] value) {
      wse215aTFld1 = checkWse215aTFld1Constraints(value);
      serializeWse215aTFld1(wse215aTFld1);
   } 

     /**
	 * 	Update Wse215aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215aTFld1,wse215aTFld1.length);
   	
   }
   
   public void setWse215aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aTFld1,wse215aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse215aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215aTFld1 with another Field
	 *	@param value
	 */
   public void setWse215aTFld1(Field source) {
       replace(source,0,source.length(),beginWse215aTFld1,WSE_215A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215aTFld1,WSE_215A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse215aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse215aTFld2
	 *	@return wse215aTFld2
	 */
   public char[] getWse215aTFld2() throws CFException{
     if (isWse215aTFld2Modified()) { 
        wse215aTFld2 = refreshWse215aTFld2();
     }
   		return wse215aTFld2;
   }

  
	/**
	*  set variable wse215aTFld2
	*  Corresponding COBOL Variable is WSE-2-15A-T-FLD2
	*  @param value
	**/
   public void setWse215aTFld2(char[] value) {
      wse215aTFld2 = checkWse215aTFld2Constraints(value);
      serializeWse215aTFld2(wse215aTFld2);
   } 

     /**
	 * 	Update Wse215aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215aTFld2,wse215aTFld2.length);
   	
   }
   
   public void setWse215aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aTFld2,wse215aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse215aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215aTFld2 with another Field
	 *	@param value
	 */
   public void setWse215aTFld2(Field source) {
       replace(source,0,source.length(),beginWse215aTFld2,WSE_215A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215aTFld2,WSE_215A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse215aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse215aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse215aTFld1(CONSTANTS.SPACE_30);
         setWse215aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse215aTFieldLength() {
			return WSE_215A_T_LENGTH;
		}

}
  
