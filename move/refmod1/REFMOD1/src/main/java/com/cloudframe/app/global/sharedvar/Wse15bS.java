package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse15bS extends Wse15bSSerialized { 
   

						private char[] wse15bSFld1 = Field.fillLowValue(30);

						private char[] wse15bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse15bS
	**/
    public Wse15bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse15bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse15bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse15bSFld1
	 *	@return wse15bSFld1
	 */
   public char[] getWse15bSFld1() throws CFException{
     if (isWse15bSFld1Modified()) { 
        wse15bSFld1 = refreshWse15bSFld1();
     }
   		return wse15bSFld1;
   }

  
	/**
	*  set variable wse15bSFld1
	*  Corresponding COBOL Variable is WSE-15B-S-FLD1
	*  @param value
	**/
   public void setWse15bSFld1(char[] value) {
      wse15bSFld1 = checkWse15bSFld1Constraints(value);
      serializeWse15bSFld1(wse15bSFld1);
   } 

     /**
	 * 	Update Wse15bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15bSFld1,wse15bSFld1.length);
   	
   }
   
   public void setWse15bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bSFld1,wse15bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse15bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15bSFld1 with another Field
	 *	@param value
	 */
   public void setWse15bSFld1(Field source) {
       replace(source,0,source.length(),beginWse15bSFld1,WSE_15B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15bSFld1,WSE_15B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse15bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse15bSFld2
	 *	@return wse15bSFld2
	 */
   public char[] getWse15bSFld2() throws CFException{
     if (isWse15bSFld2Modified()) { 
        wse15bSFld2 = refreshWse15bSFld2();
     }
   		return wse15bSFld2;
   }

  
	/**
	*  set variable wse15bSFld2
	*  Corresponding COBOL Variable is WSE-15B-S-FLD2
	*  @param value
	**/
   public void setWse15bSFld2(char[] value) {
      wse15bSFld2 = checkWse15bSFld2Constraints(value);
      serializeWse15bSFld2(wse15bSFld2);
   } 

     /**
	 * 	Update Wse15bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15bSFld2,wse15bSFld2.length);
   	
   }
   
   public void setWse15bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bSFld2,wse15bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse15bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15bSFld2 with another Field
	 *	@param value
	 */
   public void setWse15bSFld2(Field source) {
       replace(source,0,source.length(),beginWse15bSFld2,WSE_15B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15bSFld2,WSE_15B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse15bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse15bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse15bSFld1(CONSTANTS.SPACE_30);
         setWse15bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse15bSFieldLength() {
			return WSE_15B_S_LENGTH;
		}

}
  
