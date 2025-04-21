package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse220aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse220aT extends Wse220aTSerialized { 
   

						private char[] wse220aTFld1 = Field.fillLowValue(30);

						private char[] wse220aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse220aT
	**/
    public Wse220aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse220aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse220aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse220aTFld1
	 *	@return wse220aTFld1
	 */
   public char[] getWse220aTFld1() throws CFException{
     if (isWse220aTFld1Modified()) { 
        wse220aTFld1 = refreshWse220aTFld1();
     }
   		return wse220aTFld1;
   }

  
	/**
	*  set variable wse220aTFld1
	*  Corresponding COBOL Variable is WSE-2-20A-T-FLD1
	*  @param value
	**/
   public void setWse220aTFld1(char[] value) {
      wse220aTFld1 = checkWse220aTFld1Constraints(value);
      serializeWse220aTFld1(wse220aTFld1);
   } 

     /**
	 * 	Update Wse220aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220aTFld1,wse220aTFld1.length);
   	
   }
   
   public void setWse220aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220aTFld1,wse220aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse220aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220aTFld1 with another Field
	 *	@param value
	 */
   public void setWse220aTFld1(Field source) {
       replace(source,0,source.length(),beginWse220aTFld1,WSE_220A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220aTFld1,WSE_220A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse220aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse220aTFld2
	 *	@return wse220aTFld2
	 */
   public char[] getWse220aTFld2() throws CFException{
     if (isWse220aTFld2Modified()) { 
        wse220aTFld2 = refreshWse220aTFld2();
     }
   		return wse220aTFld2;
   }

  
	/**
	*  set variable wse220aTFld2
	*  Corresponding COBOL Variable is WSE-2-20A-T-FLD2
	*  @param value
	**/
   public void setWse220aTFld2(char[] value) {
      wse220aTFld2 = checkWse220aTFld2Constraints(value);
      serializeWse220aTFld2(wse220aTFld2);
   } 

     /**
	 * 	Update Wse220aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220aTFld2,wse220aTFld2.length);
   	
   }
   
   public void setWse220aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220aTFld2,wse220aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse220aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220aTFld2 with another Field
	 *	@param value
	 */
   public void setWse220aTFld2(Field source) {
       replace(source,0,source.length(),beginWse220aTFld2,WSE_220A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220aTFld2,WSE_220A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse220aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse220aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse220aTFld1(CONSTANTS.SPACE_30);
         setWse220aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse220aTFieldLength() {
			return WSE_220A_T_LENGTH;
		}

}
  
