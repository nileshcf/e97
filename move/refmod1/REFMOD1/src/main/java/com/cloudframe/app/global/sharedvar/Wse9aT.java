package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse9aT extends Wse9aTSerialized { 
   

						private char[] wse9aTFld1 = Field.fillLowValue(30);

						private char[] wse9aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse9aT
	**/
    public Wse9aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse9aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse9aTFld1
	 *	@return wse9aTFld1
	 */
   public char[] getWse9aTFld1() throws CFException{
     if (isWse9aTFld1Modified()) { 
        wse9aTFld1 = refreshWse9aTFld1();
     }
   		return wse9aTFld1;
   }

  
	/**
	*  set variable wse9aTFld1
	*  Corresponding COBOL Variable is WSE-9A-T-FLD1
	*  @param value
	**/
   public void setWse9aTFld1(char[] value) {
      wse9aTFld1 = checkWse9aTFld1Constraints(value);
      serializeWse9aTFld1(wse9aTFld1);
   } 

     /**
	 * 	Update Wse9aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9aTFld1,wse9aTFld1.length);
   	
   }
   
   public void setWse9aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTFld1,wse9aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse9aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9aTFld1 with another Field
	 *	@param value
	 */
   public void setWse9aTFld1(Field source) {
       replace(source,0,source.length(),beginWse9aTFld1,WSE_9A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9aTFld1,WSE_9A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse9aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9aTFld2
	 *	@return wse9aTFld2
	 */
   public char[] getWse9aTFld2() throws CFException{
     if (isWse9aTFld2Modified()) { 
        wse9aTFld2 = refreshWse9aTFld2();
     }
   		return wse9aTFld2;
   }

  
	/**
	*  set variable wse9aTFld2
	*  Corresponding COBOL Variable is WSE-9A-T-FLD2
	*  @param value
	**/
   public void setWse9aTFld2(char[] value) {
      wse9aTFld2 = checkWse9aTFld2Constraints(value);
      serializeWse9aTFld2(wse9aTFld2);
   } 

     /**
	 * 	Update Wse9aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9aTFld2,wse9aTFld2.length);
   	
   }
   
   public void setWse9aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTFld2,wse9aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse9aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9aTFld2 with another Field
	 *	@param value
	 */
   public void setWse9aTFld2(Field source) {
       replace(source,0,source.length(),beginWse9aTFld2,WSE_9A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9aTFld2,WSE_9A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse9aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse9aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse9aTFld1(CONSTANTS.SPACE_30);
         setWse9aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse9aTFieldLength() {
			return WSE_9A_T_LENGTH;
		}

}
  
