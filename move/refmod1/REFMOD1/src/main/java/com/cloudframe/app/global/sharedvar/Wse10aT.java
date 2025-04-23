package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse10aT extends Wse10aTSerialized { 
   

						private char[] wse10aTFld1 = Field.fillLowValue(30);

						private char[] wse10aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse10aT
	**/
    public Wse10aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse10aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse10aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse10aTFld1
	 *	@return wse10aTFld1
	 */
   public char[] getWse10aTFld1() throws CFException{
     if (isWse10aTFld1Modified()) { 
        wse10aTFld1 = refreshWse10aTFld1();
     }
   		return wse10aTFld1;
   }

  
	/**
	*  set variable wse10aTFld1
	*  Corresponding COBOL Variable is WSE-10A-T-FLD1
	*  @param value
	**/
   public void setWse10aTFld1(char[] value) {
      wse10aTFld1 = checkWse10aTFld1Constraints(value);
      serializeWse10aTFld1(wse10aTFld1);
   } 

     /**
	 * 	Update Wse10aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10aTFld1,wse10aTFld1.length);
   	
   }
   
   public void setWse10aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTFld1,wse10aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse10aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10aTFld1 with another Field
	 *	@param value
	 */
   public void setWse10aTFld1(Field source) {
       replace(source,0,source.length(),beginWse10aTFld1,WSE_10A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10aTFld1,WSE_10A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse10aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse10aTFld2
	 *	@return wse10aTFld2
	 */
   public char[] getWse10aTFld2() throws CFException{
     if (isWse10aTFld2Modified()) { 
        wse10aTFld2 = refreshWse10aTFld2();
     }
   		return wse10aTFld2;
   }

  
	/**
	*  set variable wse10aTFld2
	*  Corresponding COBOL Variable is WSE-10A-T-FLD2
	*  @param value
	**/
   public void setWse10aTFld2(char[] value) {
      wse10aTFld2 = checkWse10aTFld2Constraints(value);
      serializeWse10aTFld2(wse10aTFld2);
   } 

     /**
	 * 	Update Wse10aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10aTFld2,wse10aTFld2.length);
   	
   }
   
   public void setWse10aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTFld2,wse10aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse10aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10aTFld2 with another Field
	 *	@param value
	 */
   public void setWse10aTFld2(Field source) {
       replace(source,0,source.length(),beginWse10aTFld2,WSE_10A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10aTFld2,WSE_10A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse10aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse10aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse10aTFld1(CONSTANTS.SPACE_30);
         setWse10aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse10aTFieldLength() {
			return WSE_10A_T_LENGTH;
		}

}
  
