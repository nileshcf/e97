package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse15aT extends Wse15aTSerialized { 
   

						private char[] wse15aTFld1 = Field.fillLowValue(30);

						private char[] wse15aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse15aT
	**/
    public Wse15aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse15aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse15aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse15aTFld1
	 *	@return wse15aTFld1
	 */
   public char[] getWse15aTFld1() throws CFException{
     if (isWse15aTFld1Modified()) { 
        wse15aTFld1 = refreshWse15aTFld1();
     }
   		return wse15aTFld1;
   }

  
	/**
	*  set variable wse15aTFld1
	*  Corresponding COBOL Variable is WSE-15A-T-FLD1
	*  @param value
	**/
   public void setWse15aTFld1(char[] value) {
      wse15aTFld1 = checkWse15aTFld1Constraints(value);
      serializeWse15aTFld1(wse15aTFld1);
   } 

     /**
	 * 	Update Wse15aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15aTFld1,wse15aTFld1.length);
   	
   }
   
   public void setWse15aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTFld1,wse15aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse15aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15aTFld1 with another Field
	 *	@param value
	 */
   public void setWse15aTFld1(Field source) {
       replace(source,0,source.length(),beginWse15aTFld1,WSE_15A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15aTFld1,WSE_15A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse15aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse15aTFld2
	 *	@return wse15aTFld2
	 */
   public char[] getWse15aTFld2() throws CFException{
     if (isWse15aTFld2Modified()) { 
        wse15aTFld2 = refreshWse15aTFld2();
     }
   		return wse15aTFld2;
   }

  
	/**
	*  set variable wse15aTFld2
	*  Corresponding COBOL Variable is WSE-15A-T-FLD2
	*  @param value
	**/
   public void setWse15aTFld2(char[] value) {
      wse15aTFld2 = checkWse15aTFld2Constraints(value);
      serializeWse15aTFld2(wse15aTFld2);
   } 

     /**
	 * 	Update Wse15aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15aTFld2,wse15aTFld2.length);
   	
   }
   
   public void setWse15aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTFld2,wse15aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse15aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15aTFld2 with another Field
	 *	@param value
	 */
   public void setWse15aTFld2(Field source) {
       replace(source,0,source.length(),beginWse15aTFld2,WSE_15A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15aTFld2,WSE_15A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse15aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse15aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse15aTFld1(CONSTANTS.SPACE_30);
         setWse15aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse15aTFieldLength() {
			return WSE_15A_T_LENGTH;
		}

}
  
