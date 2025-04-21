package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse218aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse218aT extends Wse218aTSerialized { 
   

						private char[] wse218aTFld1 = Field.fillLowValue(30);

						private char[] wse218aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse218aT
	**/
    public Wse218aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse218aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse218aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse218aTFld1
	 *	@return wse218aTFld1
	 */
   public char[] getWse218aTFld1() throws CFException{
     if (isWse218aTFld1Modified()) { 
        wse218aTFld1 = refreshWse218aTFld1();
     }
   		return wse218aTFld1;
   }

  
	/**
	*  set variable wse218aTFld1
	*  Corresponding COBOL Variable is WSE-2-18A-T-FLD1
	*  @param value
	**/
   public void setWse218aTFld1(char[] value) {
      wse218aTFld1 = checkWse218aTFld1Constraints(value);
      serializeWse218aTFld1(wse218aTFld1);
   } 

     /**
	 * 	Update Wse218aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse218aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse218aTFld1,wse218aTFld1.length);
   	
   }
   
   public void setWse218aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse218aTFld1,wse218aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse218aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse218aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse218aTFld1 with another Field
	 *	@param value
	 */
   public void setWse218aTFld1(Field source) {
       replace(source,0,source.length(),beginWse218aTFld1,WSE_218A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse218aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse218aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse218aTFld1,WSE_218A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse218aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse218aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse218aTFld2
	 *	@return wse218aTFld2
	 */
   public char[] getWse218aTFld2() throws CFException{
     if (isWse218aTFld2Modified()) { 
        wse218aTFld2 = refreshWse218aTFld2();
     }
   		return wse218aTFld2;
   }

  
	/**
	*  set variable wse218aTFld2
	*  Corresponding COBOL Variable is WSE-2-18A-T-FLD2
	*  @param value
	**/
   public void setWse218aTFld2(char[] value) {
      wse218aTFld2 = checkWse218aTFld2Constraints(value);
      serializeWse218aTFld2(wse218aTFld2);
   } 

     /**
	 * 	Update Wse218aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse218aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse218aTFld2,wse218aTFld2.length);
   	
   }
   
   public void setWse218aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse218aTFld2,wse218aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse218aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse218aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse218aTFld2 with another Field
	 *	@param value
	 */
   public void setWse218aTFld2(Field source) {
       replace(source,0,source.length(),beginWse218aTFld2,WSE_218A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse218aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse218aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse218aTFld2,WSE_218A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse218aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse218aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse218aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse218aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse218aTFld1(CONSTANTS.SPACE_30);
         setWse218aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse218aTFieldLength() {
			return WSE_218A_T_LENGTH;
		}

}
  
