package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse18aT extends Wse18aTSerialized { 
   

						private char[] wse18aTFld1 = Field.fillLowValue(30);

						private char[] wse18aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse18aT
	**/
    public Wse18aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse18aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse18aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse18aTFld1
	 *	@return wse18aTFld1
	 */
   public char[] getWse18aTFld1() throws CFException{
     if (isWse18aTFld1Modified()) { 
        wse18aTFld1 = refreshWse18aTFld1();
     }
   		return wse18aTFld1;
   }

  
	/**
	*  set variable wse18aTFld1
	*  Corresponding COBOL Variable is WSE-18A-T-FLD1
	*  @param value
	**/
   public void setWse18aTFld1(char[] value) {
      wse18aTFld1 = checkWse18aTFld1Constraints(value);
      serializeWse18aTFld1(wse18aTFld1);
   } 

     /**
	 * 	Update Wse18aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse18aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse18aTFld1,wse18aTFld1.length);
   	
   }
   
   public void setWse18aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTFld1,wse18aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse18aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse18aTFld1 with another Field
	 *	@param value
	 */
   public void setWse18aTFld1(Field source) {
       replace(source,0,source.length(),beginWse18aTFld1,WSE_18A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse18aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse18aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse18aTFld1,WSE_18A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse18aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse18aTFld2
	 *	@return wse18aTFld2
	 */
   public char[] getWse18aTFld2() throws CFException{
     if (isWse18aTFld2Modified()) { 
        wse18aTFld2 = refreshWse18aTFld2();
     }
   		return wse18aTFld2;
   }

  
	/**
	*  set variable wse18aTFld2
	*  Corresponding COBOL Variable is WSE-18A-T-FLD2
	*  @param value
	**/
   public void setWse18aTFld2(char[] value) {
      wse18aTFld2 = checkWse18aTFld2Constraints(value);
      serializeWse18aTFld2(wse18aTFld2);
   } 

     /**
	 * 	Update Wse18aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse18aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse18aTFld2,wse18aTFld2.length);
   	
   }
   
   public void setWse18aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTFld2,wse18aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse18aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse18aTFld2 with another Field
	 *	@param value
	 */
   public void setWse18aTFld2(Field source) {
       replace(source,0,source.length(),beginWse18aTFld2,WSE_18A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse18aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse18aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse18aTFld2,WSE_18A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse18aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse18aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse18aTFld1(CONSTANTS.SPACE_30);
         setWse18aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse18aTFieldLength() {
			return WSE_18A_T_LENGTH;
		}

}
  
