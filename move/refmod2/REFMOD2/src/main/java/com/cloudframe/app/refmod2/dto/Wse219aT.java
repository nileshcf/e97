package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse219aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse219aT extends Wse219aTSerialized { 
   

						private char[] wse219aTFld1 = Field.fillLowValue(30);

						private char[] wse219aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse219aT
	**/
    public Wse219aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse219aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse219aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse219aTFld1
	 *	@return wse219aTFld1
	 */
   public char[] getWse219aTFld1() throws CFException{
     if (isWse219aTFld1Modified()) { 
        wse219aTFld1 = refreshWse219aTFld1();
     }
   		return wse219aTFld1;
   }

  
	/**
	*  set variable wse219aTFld1
	*  Corresponding COBOL Variable is WSE-2-19A-T-FLD1
	*  @param value
	**/
   public void setWse219aTFld1(char[] value) {
      wse219aTFld1 = checkWse219aTFld1Constraints(value);
      serializeWse219aTFld1(wse219aTFld1);
   } 

     /**
	 * 	Update Wse219aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219aTFld1,wse219aTFld1.length);
   	
   }
   
   public void setWse219aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aTFld1,wse219aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse219aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219aTFld1 with another Field
	 *	@param value
	 */
   public void setWse219aTFld1(Field source) {
       replace(source,0,source.length(),beginWse219aTFld1,WSE_219A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219aTFld1,WSE_219A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse219aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse219aTFld2
	 *	@return wse219aTFld2
	 */
   public char[] getWse219aTFld2() throws CFException{
     if (isWse219aTFld2Modified()) { 
        wse219aTFld2 = refreshWse219aTFld2();
     }
   		return wse219aTFld2;
   }

  
	/**
	*  set variable wse219aTFld2
	*  Corresponding COBOL Variable is WSE-2-19A-T-FLD2
	*  @param value
	**/
   public void setWse219aTFld2(char[] value) {
      wse219aTFld2 = checkWse219aTFld2Constraints(value);
      serializeWse219aTFld2(wse219aTFld2);
   } 

     /**
	 * 	Update Wse219aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse219aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse219aTFld2,wse219aTFld2.length);
   	
   }
   
   public void setWse219aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aTFld2,wse219aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse219aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse219aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse219aTFld2 with another Field
	 *	@param value
	 */
   public void setWse219aTFld2(Field source) {
       replace(source,0,source.length(),beginWse219aTFld2,WSE_219A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse219aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse219aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse219aTFld2,WSE_219A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse219aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse219aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse219aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse219aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse219aTFld1(CONSTANTS.SPACE_30);
         setWse219aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse219aTFieldLength() {
			return WSE_219A_T_LENGTH;
		}

}
  
