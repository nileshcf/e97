package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse213bS extends Wse213bSSerialized { 
   

						private char[] wse213bSFld1 = Field.fillLowValue(30);

						private char[] wse213bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse213bS
	**/
    public Wse213bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse213bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse213bSFld1
	 *	@return wse213bSFld1
	 */
   public char[] getWse213bSFld1() throws CFException{
     if (isWse213bSFld1Modified()) { 
        wse213bSFld1 = refreshWse213bSFld1();
     }
   		return wse213bSFld1;
   }

  
	/**
	*  set variable wse213bSFld1
	*  Corresponding COBOL Variable is WSE-2-13B-S-FLD1
	*  @param value
	**/
   public void setWse213bSFld1(char[] value) {
      wse213bSFld1 = checkWse213bSFld1Constraints(value);
      serializeWse213bSFld1(wse213bSFld1);
   } 

     /**
	 * 	Update Wse213bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse213bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse213bSFld1,wse213bSFld1.length);
   	
   }
   
   public void setWse213bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bSFld1,wse213bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse213bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse213bSFld1 with another Field
	 *	@param value
	 */
   public void setWse213bSFld1(Field source) {
       replace(source,0,source.length(),beginWse213bSFld1,WSE_213B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse213bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse213bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse213bSFld1,WSE_213B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse213bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse213bSFld2
	 *	@return wse213bSFld2
	 */
   public char[] getWse213bSFld2() throws CFException{
     if (isWse213bSFld2Modified()) { 
        wse213bSFld2 = refreshWse213bSFld2();
     }
   		return wse213bSFld2;
   }

  
	/**
	*  set variable wse213bSFld2
	*  Corresponding COBOL Variable is WSE-2-13B-S-FLD2
	*  @param value
	**/
   public void setWse213bSFld2(char[] value) {
      wse213bSFld2 = checkWse213bSFld2Constraints(value);
      serializeWse213bSFld2(wse213bSFld2);
   } 

     /**
	 * 	Update Wse213bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse213bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse213bSFld2,wse213bSFld2.length);
   	
   }
   
   public void setWse213bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bSFld2,wse213bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse213bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse213bSFld2 with another Field
	 *	@param value
	 */
   public void setWse213bSFld2(Field source) {
       replace(source,0,source.length(),beginWse213bSFld2,WSE_213B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse213bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse213bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse213bSFld2,WSE_213B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse213bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse213bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse213bSFld1(CONSTANTS.SPACE_30);
         setWse213bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse213bSFieldLength() {
			return WSE_213B_S_LENGTH;
		}

}
  
