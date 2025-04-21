package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse6aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse6aT extends Wse6aTSerialized { 
   

						private char[] wse6aTFld1 = Field.fillLowValue(20);

						private char[] wse6aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse6aT
	**/
    public Wse6aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse6aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse6aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse6aTFld1
	 *	@return wse6aTFld1
	 */
   public char[] getWse6aTFld1() throws CFException{
     if (isWse6aTFld1Modified()) { 
        wse6aTFld1 = refreshWse6aTFld1();
     }
   		return wse6aTFld1;
   }

  
	/**
	*  set variable wse6aTFld1
	*  Corresponding COBOL Variable is WSE-6A-T-FLD1
	*  @param value
	**/
   public void setWse6aTFld1(char[] value) {
      wse6aTFld1 = checkWse6aTFld1Constraints(value);
      serializeWse6aTFld1(wse6aTFld1);
   } 

     /**
	 * 	Update Wse6aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6aTFld1,wse6aTFld1.length);
   	
   }
   
   public void setWse6aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTFld1,wse6aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse6aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6aTFld1 with another Field
	 *	@param value
	 */
   public void setWse6aTFld1(Field source) {
       replace(source,0,source.length(),beginWse6aTFld1,WSE_6A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6aTFld1,WSE_6A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse6aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse6aTFld2
	 *	@return wse6aTFld2
	 */
   public char[] getWse6aTFld2() throws CFException{
     if (isWse6aTFld2Modified()) { 
        wse6aTFld2 = refreshWse6aTFld2();
     }
   		return wse6aTFld2;
   }

  
	/**
	*  set variable wse6aTFld2
	*  Corresponding COBOL Variable is WSE-6A-T-FLD2
	*  @param value
	**/
   public void setWse6aTFld2(char[] value) {
      wse6aTFld2 = checkWse6aTFld2Constraints(value);
      serializeWse6aTFld2(wse6aTFld2);
   } 

     /**
	 * 	Update Wse6aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6aTFld2,wse6aTFld2.length);
   	
   }
   
   public void setWse6aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTFld2,wse6aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse6aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6aTFld2 with another Field
	 *	@param value
	 */
   public void setWse6aTFld2(Field source) {
       replace(source,0,source.length(),beginWse6aTFld2,WSE_6A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6aTFld2,WSE_6A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse6aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse6aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse6aTFld1(CONSTANTS.SPACE_20);
         setWse6aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse6aTFieldLength() {
			return WSE_6A_T_LENGTH;
		}

}
  
