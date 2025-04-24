package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse14aT extends Wse14aTSerialized { 
   

						private char[] wse14aTFld1 = Field.fillLowValue(30);

						private char[] wse14aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse14aT
	**/
    public Wse14aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse14aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse14aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse14aTFld1
	 *	@return wse14aTFld1
	 */
   public char[] getWse14aTFld1() throws CFException{
     if (isWse14aTFld1Modified()) { 
        wse14aTFld1 = refreshWse14aTFld1();
     }
   		return wse14aTFld1;
   }

  
	/**
	*  set variable wse14aTFld1
	*  Corresponding COBOL Variable is WSE-14A-T-FLD1
	*  @param value
	**/
   public void setWse14aTFld1(char[] value) {
      wse14aTFld1 = checkWse14aTFld1Constraints(value);
      serializeWse14aTFld1(wse14aTFld1);
   } 

     /**
	 * 	Update Wse14aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14aTFld1,wse14aTFld1.length);
   	
   }
   
   public void setWse14aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTFld1,wse14aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse14aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14aTFld1 with another Field
	 *	@param value
	 */
   public void setWse14aTFld1(Field source) {
       replace(source,0,source.length(),beginWse14aTFld1,WSE_14A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14aTFld1,WSE_14A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse14aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse14aTFld2
	 *	@return wse14aTFld2
	 */
   public char[] getWse14aTFld2() throws CFException{
     if (isWse14aTFld2Modified()) { 
        wse14aTFld2 = refreshWse14aTFld2();
     }
   		return wse14aTFld2;
   }

  
	/**
	*  set variable wse14aTFld2
	*  Corresponding COBOL Variable is WSE-14A-T-FLD2
	*  @param value
	**/
   public void setWse14aTFld2(char[] value) {
      wse14aTFld2 = checkWse14aTFld2Constraints(value);
      serializeWse14aTFld2(wse14aTFld2);
   } 

     /**
	 * 	Update Wse14aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14aTFld2,wse14aTFld2.length);
   	
   }
   
   public void setWse14aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTFld2,wse14aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse14aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14aTFld2 with another Field
	 *	@param value
	 */
   public void setWse14aTFld2(Field source) {
       replace(source,0,source.length(),beginWse14aTFld2,WSE_14A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14aTFld2,WSE_14A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse14aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse14aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse14aTFld1(CONSTANTS.SPACE_30);
         setWse14aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse14aTFieldLength() {
			return WSE_14A_T_LENGTH;
		}

}
  
