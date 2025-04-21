package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse19aT extends Wse19aTSerialized { 
   

						private char[] wse19aTFld1 = Field.fillLowValue(30);

						private char[] wse19aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse19aT
	**/
    public Wse19aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse19aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse19aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse19aTFld1
	 *	@return wse19aTFld1
	 */
   public char[] getWse19aTFld1() throws CFException{
     if (isWse19aTFld1Modified()) { 
        wse19aTFld1 = refreshWse19aTFld1();
     }
   		return wse19aTFld1;
   }

  
	/**
	*  set variable wse19aTFld1
	*  Corresponding COBOL Variable is WSE-19A-T-FLD1
	*  @param value
	**/
   public void setWse19aTFld1(char[] value) {
      wse19aTFld1 = checkWse19aTFld1Constraints(value);
      serializeWse19aTFld1(wse19aTFld1);
   } 

     /**
	 * 	Update Wse19aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19aTFld1,wse19aTFld1.length);
   	
   }
   
   public void setWse19aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTFld1,wse19aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse19aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19aTFld1 with another Field
	 *	@param value
	 */
   public void setWse19aTFld1(Field source) {
       replace(source,0,source.length(),beginWse19aTFld1,WSE_19A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19aTFld1,WSE_19A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse19aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse19aTFld2
	 *	@return wse19aTFld2
	 */
   public char[] getWse19aTFld2() throws CFException{
     if (isWse19aTFld2Modified()) { 
        wse19aTFld2 = refreshWse19aTFld2();
     }
   		return wse19aTFld2;
   }

  
	/**
	*  set variable wse19aTFld2
	*  Corresponding COBOL Variable is WSE-19A-T-FLD2
	*  @param value
	**/
   public void setWse19aTFld2(char[] value) {
      wse19aTFld2 = checkWse19aTFld2Constraints(value);
      serializeWse19aTFld2(wse19aTFld2);
   } 

     /**
	 * 	Update Wse19aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19aTFld2,wse19aTFld2.length);
   	
   }
   
   public void setWse19aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTFld2,wse19aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse19aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19aTFld2 with another Field
	 *	@param value
	 */
   public void setWse19aTFld2(Field source) {
       replace(source,0,source.length(),beginWse19aTFld2,WSE_19A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19aTFld2,WSE_19A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse19aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse19aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse19aTFld1(CONSTANTS.SPACE_30);
         setWse19aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse19aTFieldLength() {
			return WSE_19A_T_LENGTH;
		}

}
  
