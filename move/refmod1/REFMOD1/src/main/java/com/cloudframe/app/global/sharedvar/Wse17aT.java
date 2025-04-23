package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse17aT extends Wse17aTSerialized { 
   

						private char[] wse17aTFld1 = Field.fillLowValue(30);

						private char[] wse17aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse17aT
	**/
    public Wse17aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse17aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse17aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse17aTFld1
	 *	@return wse17aTFld1
	 */
   public char[] getWse17aTFld1() throws CFException{
     if (isWse17aTFld1Modified()) { 
        wse17aTFld1 = refreshWse17aTFld1();
     }
   		return wse17aTFld1;
   }

  
	/**
	*  set variable wse17aTFld1
	*  Corresponding COBOL Variable is WSE-17A-T-FLD1
	*  @param value
	**/
   public void setWse17aTFld1(char[] value) {
      wse17aTFld1 = checkWse17aTFld1Constraints(value);
      serializeWse17aTFld1(wse17aTFld1);
   } 

     /**
	 * 	Update Wse17aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17aTFld1,wse17aTFld1.length);
   	
   }
   
   public void setWse17aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTFld1,wse17aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse17aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17aTFld1 with another Field
	 *	@param value
	 */
   public void setWse17aTFld1(Field source) {
       replace(source,0,source.length(),beginWse17aTFld1,WSE_17A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17aTFld1,WSE_17A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse17aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse17aTFld2
	 *	@return wse17aTFld2
	 */
   public char[] getWse17aTFld2() throws CFException{
     if (isWse17aTFld2Modified()) { 
        wse17aTFld2 = refreshWse17aTFld2();
     }
   		return wse17aTFld2;
   }

  
	/**
	*  set variable wse17aTFld2
	*  Corresponding COBOL Variable is WSE-17A-T-FLD2
	*  @param value
	**/
   public void setWse17aTFld2(char[] value) {
      wse17aTFld2 = checkWse17aTFld2Constraints(value);
      serializeWse17aTFld2(wse17aTFld2);
   } 

     /**
	 * 	Update Wse17aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17aTFld2,wse17aTFld2.length);
   	
   }
   
   public void setWse17aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTFld2,wse17aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse17aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17aTFld2 with another Field
	 *	@param value
	 */
   public void setWse17aTFld2(Field source) {
       replace(source,0,source.length(),beginWse17aTFld2,WSE_17A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17aTFld2,WSE_17A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse17aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse17aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse17aTFld1(CONSTANTS.SPACE_30);
         setWse17aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse17aTFieldLength() {
			return WSE_17A_T_LENGTH;
		}

}
  
