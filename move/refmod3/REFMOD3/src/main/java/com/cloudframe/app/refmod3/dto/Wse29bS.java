package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse29bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse29bS extends Wse29bSSerialized { 
   

						private char[] wse29bSFld1 = Field.fillLowValue(30);

						private char[] wse29bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse29bS
	**/
    public Wse29bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse29bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse29bSFld1
	 *	@return wse29bSFld1
	 */
   public char[] getWse29bSFld1() throws CFException{
     if (isWse29bSFld1Modified()) { 
        wse29bSFld1 = refreshWse29bSFld1();
     }
   		return wse29bSFld1;
   }

  
	/**
	*  set variable wse29bSFld1
	*  Corresponding COBOL Variable is WSE-2-9B-S-FLD1
	*  @param value
	**/
   public void setWse29bSFld1(char[] value) {
      wse29bSFld1 = checkWse29bSFld1Constraints(value);
      serializeWse29bSFld1(wse29bSFld1);
   } 

     /**
	 * 	Update Wse29bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse29bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse29bSFld1,wse29bSFld1.length);
   	
   }
   
   public void setWse29bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bSFld1,wse29bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse29bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse29bSFld1 with another Field
	 *	@param value
	 */
   public void setWse29bSFld1(Field source) {
       replace(source,0,source.length(),beginWse29bSFld1,WSE_29B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse29bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse29bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse29bSFld1,WSE_29B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse29bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse29bSFld2
	 *	@return wse29bSFld2
	 */
   public char[] getWse29bSFld2() throws CFException{
     if (isWse29bSFld2Modified()) { 
        wse29bSFld2 = refreshWse29bSFld2();
     }
   		return wse29bSFld2;
   }

  
	/**
	*  set variable wse29bSFld2
	*  Corresponding COBOL Variable is WSE-2-9B-S-FLD2
	*  @param value
	**/
   public void setWse29bSFld2(char[] value) {
      wse29bSFld2 = checkWse29bSFld2Constraints(value);
      serializeWse29bSFld2(wse29bSFld2);
   } 

     /**
	 * 	Update Wse29bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse29bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse29bSFld2,wse29bSFld2.length);
   	
   }
   
   public void setWse29bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bSFld2,wse29bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse29bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse29bSFld2 with another Field
	 *	@param value
	 */
   public void setWse29bSFld2(Field source) {
       replace(source,0,source.length(),beginWse29bSFld2,WSE_29B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse29bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse29bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse29bSFld2,WSE_29B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse29bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse29bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse29bSFld1(CONSTANTS.SPACE_30);
         setWse29bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse29bSFieldLength() {
			return WSE_29B_S_LENGTH;
		}

}
  
