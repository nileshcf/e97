package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse1aT extends Wse1aTSerialized { 
   

						private char[] wse1aTFld1 = Field.fillLowValue(20);

						private char[] wse1aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse1aT
	**/
    public Wse1aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse1aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse1aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse1aTFld1
	 *	@return wse1aTFld1
	 */
   public char[] getWse1aTFld1() throws CFException{
     if (isWse1aTFld1Modified()) { 
        wse1aTFld1 = refreshWse1aTFld1();
     }
   		return wse1aTFld1;
   }

  
	/**
	*  set variable wse1aTFld1
	*  Corresponding COBOL Variable is WSE-1A-T-FLD1
	*  @param value
	**/
   public void setWse1aTFld1(char[] value) {
      wse1aTFld1 = checkWse1aTFld1Constraints(value);
      serializeWse1aTFld1(wse1aTFld1);
   } 

     /**
	 * 	Update Wse1aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1aTFld1,wse1aTFld1.length);
   	
   }
   
   public void setWse1aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTFld1,wse1aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse1aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1aTFld1 with another Field
	 *	@param value
	 */
   public void setWse1aTFld1(Field source) {
       replace(source,0,source.length(),beginWse1aTFld1,WSE_1A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1aTFld1,WSE_1A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse1aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse1aTFld2
	 *	@return wse1aTFld2
	 */
   public char[] getWse1aTFld2() throws CFException{
     if (isWse1aTFld2Modified()) { 
        wse1aTFld2 = refreshWse1aTFld2();
     }
   		return wse1aTFld2;
   }

  
	/**
	*  set variable wse1aTFld2
	*  Corresponding COBOL Variable is WSE-1A-T-FLD2
	*  @param value
	**/
   public void setWse1aTFld2(char[] value) {
      wse1aTFld2 = checkWse1aTFld2Constraints(value);
      serializeWse1aTFld2(wse1aTFld2);
   } 

     /**
	 * 	Update Wse1aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1aTFld2,wse1aTFld2.length);
   	
   }
   
   public void setWse1aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTFld2,wse1aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse1aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1aTFld2 with another Field
	 *	@param value
	 */
   public void setWse1aTFld2(Field source) {
       replace(source,0,source.length(),beginWse1aTFld2,WSE_1A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1aTFld2,WSE_1A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse1aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse1aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse1aTFld1(CONSTANTS.SPACE_20);
         setWse1aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse1aTFieldLength() {
			return WSE_1A_T_LENGTH;
		}

}
  
