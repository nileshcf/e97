package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse9bS extends Wse9bSSerialized { 
   

						private char[] wse9bSFld1 = Field.fillLowValue(30);

						private char[] wse9bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse9bS
	**/
    public Wse9bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse9bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse9bSFld1
	 *	@return wse9bSFld1
	 */
   public char[] getWse9bSFld1() throws CFException{
     if (isWse9bSFld1Modified()) { 
        wse9bSFld1 = refreshWse9bSFld1();
     }
   		return wse9bSFld1;
   }

  
	/**
	*  set variable wse9bSFld1
	*  Corresponding COBOL Variable is WSE-9B-S-FLD1
	*  @param value
	**/
   public void setWse9bSFld1(char[] value) {
      wse9bSFld1 = checkWse9bSFld1Constraints(value);
      serializeWse9bSFld1(wse9bSFld1);
   } 

     /**
	 * 	Update Wse9bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9bSFld1,wse9bSFld1.length);
   	
   }
   
   public void setWse9bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bSFld1,wse9bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse9bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9bSFld1 with another Field
	 *	@param value
	 */
   public void setWse9bSFld1(Field source) {
       replace(source,0,source.length(),beginWse9bSFld1,WSE_9B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9bSFld1,WSE_9B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse9bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9bSFld2
	 *	@return wse9bSFld2
	 */
   public char[] getWse9bSFld2() throws CFException{
     if (isWse9bSFld2Modified()) { 
        wse9bSFld2 = refreshWse9bSFld2();
     }
   		return wse9bSFld2;
   }

  
	/**
	*  set variable wse9bSFld2
	*  Corresponding COBOL Variable is WSE-9B-S-FLD2
	*  @param value
	**/
   public void setWse9bSFld2(char[] value) {
      wse9bSFld2 = checkWse9bSFld2Constraints(value);
      serializeWse9bSFld2(wse9bSFld2);
   } 

     /**
	 * 	Update Wse9bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9bSFld2,wse9bSFld2.length);
   	
   }
   
   public void setWse9bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bSFld2,wse9bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse9bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9bSFld2 with another Field
	 *	@param value
	 */
   public void setWse9bSFld2(Field source) {
       replace(source,0,source.length(),beginWse9bSFld2,WSE_9B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9bSFld2,WSE_9B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse9bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse9bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse9bSFld1(CONSTANTS.SPACE_30);
         setWse9bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse9bSFieldLength() {
			return WSE_9B_S_LENGTH;
		}

}
  
