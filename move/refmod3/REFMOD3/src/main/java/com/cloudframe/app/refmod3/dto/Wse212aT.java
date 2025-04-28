package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse212aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse212aT extends Wse212aTSerialized { 
   

						private char[] wse212aTFld1 = Field.fillLowValue(30);

						private char[] wse212aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse212aT
	**/
    public Wse212aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse212aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse212aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse212aTFld1
	 *	@return wse212aTFld1
	 */
   public char[] getWse212aTFld1() throws CFException{
     if (isWse212aTFld1Modified()) { 
        wse212aTFld1 = refreshWse212aTFld1();
     }
   		return wse212aTFld1;
   }

  
	/**
	*  set variable wse212aTFld1
	*  Corresponding COBOL Variable is WSE-2-12A-T-FLD1
	*  @param value
	**/
   public void setWse212aTFld1(char[] value) {
      wse212aTFld1 = checkWse212aTFld1Constraints(value);
      serializeWse212aTFld1(wse212aTFld1);
   } 

     /**
	 * 	Update Wse212aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse212aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse212aTFld1,wse212aTFld1.length);
   	
   }
   
   public void setWse212aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse212aTFld1,wse212aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse212aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse212aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse212aTFld1 with another Field
	 *	@param value
	 */
   public void setWse212aTFld1(Field source) {
       replace(source,0,source.length(),beginWse212aTFld1,WSE_212A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse212aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse212aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse212aTFld1,WSE_212A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse212aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse212aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse212aTFld2
	 *	@return wse212aTFld2
	 */
   public char[] getWse212aTFld2() throws CFException{
     if (isWse212aTFld2Modified()) { 
        wse212aTFld2 = refreshWse212aTFld2();
     }
   		return wse212aTFld2;
   }

  
	/**
	*  set variable wse212aTFld2
	*  Corresponding COBOL Variable is WSE-2-12A-T-FLD2
	*  @param value
	**/
   public void setWse212aTFld2(char[] value) {
      wse212aTFld2 = checkWse212aTFld2Constraints(value);
      serializeWse212aTFld2(wse212aTFld2);
   } 

     /**
	 * 	Update Wse212aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse212aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse212aTFld2,wse212aTFld2.length);
   	
   }
   
   public void setWse212aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse212aTFld2,wse212aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse212aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse212aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse212aTFld2 with another Field
	 *	@param value
	 */
   public void setWse212aTFld2(Field source) {
       replace(source,0,source.length(),beginWse212aTFld2,WSE_212A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse212aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse212aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse212aTFld2,WSE_212A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse212aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse212aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse212aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse212aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse212aTFld1(CONSTANTS.SPACE_30);
         setWse212aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse212aTFieldLength() {
			return WSE_212A_T_LENGTH;
		}

}
  
