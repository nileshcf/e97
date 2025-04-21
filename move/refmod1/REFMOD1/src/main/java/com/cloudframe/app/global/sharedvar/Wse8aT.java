package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse8aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse8aT extends Wse8aTSerialized { 
   

						private char[] wse8aTFld1 = Field.fillLowValue(30);

						private char[] wse8aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse8aT
	**/
    public Wse8aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse8aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse8aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse8aTFld1
	 *	@return wse8aTFld1
	 */
   public char[] getWse8aTFld1() throws CFException{
     if (isWse8aTFld1Modified()) { 
        wse8aTFld1 = refreshWse8aTFld1();
     }
   		return wse8aTFld1;
   }

  
	/**
	*  set variable wse8aTFld1
	*  Corresponding COBOL Variable is WSE-8A-T-FLD1
	*  @param value
	**/
   public void setWse8aTFld1(char[] value) {
      wse8aTFld1 = checkWse8aTFld1Constraints(value);
      serializeWse8aTFld1(wse8aTFld1);
   } 

     /**
	 * 	Update Wse8aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse8aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse8aTFld1,wse8aTFld1.length);
   	
   }
   
   public void setWse8aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTFld1,wse8aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse8aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse8aTFld1 with another Field
	 *	@param value
	 */
   public void setWse8aTFld1(Field source) {
       replace(source,0,source.length(),beginWse8aTFld1,WSE_8A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse8aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse8aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse8aTFld1,WSE_8A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse8aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse8aTFld2
	 *	@return wse8aTFld2
	 */
   public char[] getWse8aTFld2() throws CFException{
     if (isWse8aTFld2Modified()) { 
        wse8aTFld2 = refreshWse8aTFld2();
     }
   		return wse8aTFld2;
   }

  
	/**
	*  set variable wse8aTFld2
	*  Corresponding COBOL Variable is WSE-8A-T-FLD2
	*  @param value
	**/
   public void setWse8aTFld2(char[] value) {
      wse8aTFld2 = checkWse8aTFld2Constraints(value);
      serializeWse8aTFld2(wse8aTFld2);
   } 

     /**
	 * 	Update Wse8aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse8aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse8aTFld2,wse8aTFld2.length);
   	
   }
   
   public void setWse8aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTFld2,wse8aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse8aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse8aTFld2 with another Field
	 *	@param value
	 */
   public void setWse8aTFld2(Field source) {
       replace(source,0,source.length(),beginWse8aTFld2,WSE_8A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse8aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse8aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse8aTFld2,WSE_8A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse8aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse8aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse8aTFld1(CONSTANTS.SPACE_30);
         setWse8aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse8aTFieldLength() {
			return WSE_8A_T_LENGTH;
		}

}
  
