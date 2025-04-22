package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse213aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse213aS extends Wse213aSSerialized { 
   

						private char[] wse213aSFld1 = Field.fillLowValue(30);

						private char[] wse213aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse213aS
	**/
    public Wse213aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse213aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse213aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse213aSFld1
	 *	@return wse213aSFld1
	 */
   public char[] getWse213aSFld1() throws CFException{
     if (isWse213aSFld1Modified()) { 
        wse213aSFld1 = refreshWse213aSFld1();
     }
   		return wse213aSFld1;
   }

  
	/**
	*  set variable wse213aSFld1
	*  Corresponding COBOL Variable is WSE-2-13A-S-FLD1
	*  @param value
	**/
   public void setWse213aSFld1(char[] value) {
      wse213aSFld1 = checkWse213aSFld1Constraints(value);
      serializeWse213aSFld1(wse213aSFld1);
   } 

     /**
	 * 	Update Wse213aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse213aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse213aSFld1,wse213aSFld1.length);
   	
   }
   
   public void setWse213aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse213aSFld1,wse213aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse213aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse213aSFld1 with another Field
	 *	@param value
	 */
   public void setWse213aSFld1(Field source) {
       replace(source,0,source.length(),beginWse213aSFld1,WSE_213A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse213aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse213aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse213aSFld1,WSE_213A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse213aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse213aSFld2
	 *	@return wse213aSFld2
	 */
   public char[] getWse213aSFld2() throws CFException{
     if (isWse213aSFld2Modified()) { 
        wse213aSFld2 = refreshWse213aSFld2();
     }
   		return wse213aSFld2;
   }

  
	/**
	*  set variable wse213aSFld2
	*  Corresponding COBOL Variable is WSE-2-13A-S-FLD2
	*  @param value
	**/
   public void setWse213aSFld2(char[] value) {
      wse213aSFld2 = checkWse213aSFld2Constraints(value);
      serializeWse213aSFld2(wse213aSFld2);
   } 

     /**
	 * 	Update Wse213aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse213aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse213aSFld2,wse213aSFld2.length);
   	
   }
   
   public void setWse213aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse213aSFld2,wse213aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse213aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse213aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse213aSFld2 with another Field
	 *	@param value
	 */
   public void setWse213aSFld2(Field source) {
       replace(source,0,source.length(),beginWse213aSFld2,WSE_213A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse213aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse213aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse213aSFld2,WSE_213A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse213aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse213aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse213aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse213aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse213aSFld1(CONSTANTS.SPACE_30);
         setWse213aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse213aSFieldLength() {
			return WSE_213A_S_LENGTH;
		}

}
  
