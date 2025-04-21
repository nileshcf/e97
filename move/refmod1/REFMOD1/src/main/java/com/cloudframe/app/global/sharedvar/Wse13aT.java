package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse13aT extends Wse13aTSerialized { 
   

						private char[] wse13aTFld1 = Field.fillLowValue(30);

						private char[] wse13aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse13aT
	**/
    public Wse13aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse13aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse13aTFld1
	 *	@return wse13aTFld1
	 */
   public char[] getWse13aTFld1() throws CFException{
     if (isWse13aTFld1Modified()) { 
        wse13aTFld1 = refreshWse13aTFld1();
     }
   		return wse13aTFld1;
   }

  
	/**
	*  set variable wse13aTFld1
	*  Corresponding COBOL Variable is WSE-13A-T-FLD1
	*  @param value
	**/
   public void setWse13aTFld1(char[] value) {
      wse13aTFld1 = checkWse13aTFld1Constraints(value);
      serializeWse13aTFld1(wse13aTFld1);
   } 

     /**
	 * 	Update Wse13aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13aTFld1,wse13aTFld1.length);
   	
   }
   
   public void setWse13aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTFld1,wse13aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse13aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13aTFld1 with another Field
	 *	@param value
	 */
   public void setWse13aTFld1(Field source) {
       replace(source,0,source.length(),beginWse13aTFld1,WSE_13A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13aTFld1,WSE_13A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse13aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13aTFld2
	 *	@return wse13aTFld2
	 */
   public char[] getWse13aTFld2() throws CFException{
     if (isWse13aTFld2Modified()) { 
        wse13aTFld2 = refreshWse13aTFld2();
     }
   		return wse13aTFld2;
   }

  
	/**
	*  set variable wse13aTFld2
	*  Corresponding COBOL Variable is WSE-13A-T-FLD2
	*  @param value
	**/
   public void setWse13aTFld2(char[] value) {
      wse13aTFld2 = checkWse13aTFld2Constraints(value);
      serializeWse13aTFld2(wse13aTFld2);
   } 

     /**
	 * 	Update Wse13aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13aTFld2,wse13aTFld2.length);
   	
   }
   
   public void setWse13aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTFld2,wse13aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse13aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13aTFld2 with another Field
	 *	@param value
	 */
   public void setWse13aTFld2(Field source) {
       replace(source,0,source.length(),beginWse13aTFld2,WSE_13A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13aTFld2,WSE_13A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse13aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse13aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse13aTFld1(CONSTANTS.SPACE_30);
         setWse13aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse13aTFieldLength() {
			return WSE_13A_T_LENGTH;
		}

}
  
