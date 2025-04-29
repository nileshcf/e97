package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse12aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse12aT extends Wse12aTSerialized { 
   

						private char[] wse12aTFld1 = Field.fillLowValue(30);

						private char[] wse12aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse12aT
	**/
    public Wse12aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse12aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse12aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse12aTFld1
	 *	@return wse12aTFld1
	 */
   public char[] getWse12aTFld1() throws CFException{
     if (isWse12aTFld1Modified()) { 
        wse12aTFld1 = refreshWse12aTFld1();
     }
   		return wse12aTFld1;
   }

  
	/**
	*  set variable wse12aTFld1
	*  Corresponding COBOL Variable is WSE-12A-T-FLD1
	*  @param value
	**/
   public void setWse12aTFld1(char[] value) {
      wse12aTFld1 = checkWse12aTFld1Constraints(value);
      serializeWse12aTFld1(wse12aTFld1);
   } 

     /**
	 * 	Update Wse12aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse12aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse12aTFld1,wse12aTFld1.length);
   	
   }
   
   public void setWse12aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTFld1,wse12aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse12aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse12aTFld1 with another Field
	 *	@param value
	 */
   public void setWse12aTFld1(Field source) {
       replace(source,0,source.length(),beginWse12aTFld1,WSE_12A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse12aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse12aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse12aTFld1,WSE_12A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse12aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse12aTFld2
	 *	@return wse12aTFld2
	 */
   public char[] getWse12aTFld2() throws CFException{
     if (isWse12aTFld2Modified()) { 
        wse12aTFld2 = refreshWse12aTFld2();
     }
   		return wse12aTFld2;
   }

  
	/**
	*  set variable wse12aTFld2
	*  Corresponding COBOL Variable is WSE-12A-T-FLD2
	*  @param value
	**/
   public void setWse12aTFld2(char[] value) {
      wse12aTFld2 = checkWse12aTFld2Constraints(value);
      serializeWse12aTFld2(wse12aTFld2);
   } 

     /**
	 * 	Update Wse12aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse12aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse12aTFld2,wse12aTFld2.length);
   	
   }
   
   public void setWse12aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTFld2,wse12aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse12aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse12aTFld2 with another Field
	 *	@param value
	 */
   public void setWse12aTFld2(Field source) {
       replace(source,0,source.length(),beginWse12aTFld2,WSE_12A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse12aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse12aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse12aTFld2,WSE_12A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse12aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse12aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse12aTFld1(CONSTANTS.SPACE_30);
         setWse12aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse12aTFieldLength() {
			return WSE_12A_T_LENGTH;
		}

}
  
