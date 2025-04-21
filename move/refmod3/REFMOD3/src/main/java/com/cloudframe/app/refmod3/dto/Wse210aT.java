package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse210aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse210aT extends Wse210aTSerialized { 
   

						private char[] wse210aTFld1 = Field.fillLowValue(30);

						private char[] wse210aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse210aT
	**/
    public Wse210aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse210aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse210aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse210aTFld1
	 *	@return wse210aTFld1
	 */
   public char[] getWse210aTFld1() throws CFException{
     if (isWse210aTFld1Modified()) { 
        wse210aTFld1 = refreshWse210aTFld1();
     }
   		return wse210aTFld1;
   }

  
	/**
	*  set variable wse210aTFld1
	*  Corresponding COBOL Variable is WSE-2-10A-T-FLD1
	*  @param value
	**/
   public void setWse210aTFld1(char[] value) {
      wse210aTFld1 = checkWse210aTFld1Constraints(value);
      serializeWse210aTFld1(wse210aTFld1);
   } 

     /**
	 * 	Update Wse210aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse210aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse210aTFld1,wse210aTFld1.length);
   	
   }
   
   public void setWse210aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aTFld1,wse210aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse210aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse210aTFld1 with another Field
	 *	@param value
	 */
   public void setWse210aTFld1(Field source) {
       replace(source,0,source.length(),beginWse210aTFld1,WSE_210A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse210aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse210aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse210aTFld1,WSE_210A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse210aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse210aTFld2
	 *	@return wse210aTFld2
	 */
   public char[] getWse210aTFld2() throws CFException{
     if (isWse210aTFld2Modified()) { 
        wse210aTFld2 = refreshWse210aTFld2();
     }
   		return wse210aTFld2;
   }

  
	/**
	*  set variable wse210aTFld2
	*  Corresponding COBOL Variable is WSE-2-10A-T-FLD2
	*  @param value
	**/
   public void setWse210aTFld2(char[] value) {
      wse210aTFld2 = checkWse210aTFld2Constraints(value);
      serializeWse210aTFld2(wse210aTFld2);
   } 

     /**
	 * 	Update Wse210aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse210aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse210aTFld2,wse210aTFld2.length);
   	
   }
   
   public void setWse210aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aTFld2,wse210aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse210aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse210aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse210aTFld2 with another Field
	 *	@param value
	 */
   public void setWse210aTFld2(Field source) {
       replace(source,0,source.length(),beginWse210aTFld2,WSE_210A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse210aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse210aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse210aTFld2,WSE_210A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse210aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse210aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse210aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse210aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse210aTFld1(CONSTANTS.SPACE_30);
         setWse210aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse210aTFieldLength() {
			return WSE_210A_T_LENGTH;
		}

}
  
