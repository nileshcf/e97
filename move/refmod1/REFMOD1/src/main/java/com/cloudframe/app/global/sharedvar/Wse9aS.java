package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse9aS extends Wse9aSSerialized { 
   

						private char[] wse9aSFld1 = Field.fillLowValue(30);

						private char[] wse9aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse9aS
	**/
    public Wse9aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse9aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse9aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse9aSFld1
	 *	@return wse9aSFld1
	 */
   public char[] getWse9aSFld1() throws CFException{
     if (isWse9aSFld1Modified()) { 
        wse9aSFld1 = refreshWse9aSFld1();
     }
   		return wse9aSFld1;
   }

  
	/**
	*  set variable wse9aSFld1
	*  Corresponding COBOL Variable is WSE-9A-S-FLD1
	*  @param value
	**/
   public void setWse9aSFld1(char[] value) {
      wse9aSFld1 = checkWse9aSFld1Constraints(value);
      serializeWse9aSFld1(wse9aSFld1);
   } 

     /**
	 * 	Update Wse9aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9aSFld1,wse9aSFld1.length);
   	
   }
   
   public void setWse9aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aSFld1,wse9aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse9aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9aSFld1 with another Field
	 *	@param value
	 */
   public void setWse9aSFld1(Field source) {
       replace(source,0,source.length(),beginWse9aSFld1,WSE_9A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9aSFld1,WSE_9A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse9aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse9aSFld2
	 *	@return wse9aSFld2
	 */
   public char[] getWse9aSFld2() throws CFException{
     if (isWse9aSFld2Modified()) { 
        wse9aSFld2 = refreshWse9aSFld2();
     }
   		return wse9aSFld2;
   }

  
	/**
	*  set variable wse9aSFld2
	*  Corresponding COBOL Variable is WSE-9A-S-FLD2
	*  @param value
	**/
   public void setWse9aSFld2(char[] value) {
      wse9aSFld2 = checkWse9aSFld2Constraints(value);
      serializeWse9aSFld2(wse9aSFld2);
   } 

     /**
	 * 	Update Wse9aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9aSFld2,wse9aSFld2.length);
   	
   }
   
   public void setWse9aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aSFld2,wse9aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse9aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9aSFld2 with another Field
	 *	@param value
	 */
   public void setWse9aSFld2(Field source) {
       replace(source,0,source.length(),beginWse9aSFld2,WSE_9A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9aSFld2,WSE_9A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse9aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse9aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse9aSFld1(CONSTANTS.SPACE_30);
         setWse9aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse9aSFieldLength() {
			return WSE_9A_S_LENGTH;
		}

}
  
