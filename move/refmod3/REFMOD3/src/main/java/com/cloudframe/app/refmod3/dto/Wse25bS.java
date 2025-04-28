package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse25bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse25bS extends Wse25bSSerialized { 
   

						private char[] wse25bSFld1 = Field.fillLowValue(30);

						private char[] wse25bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse25bS
	**/
    public Wse25bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse25bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse25bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse25bSFld1
	 *	@return wse25bSFld1
	 */
   public char[] getWse25bSFld1() throws CFException{
     if (isWse25bSFld1Modified()) { 
        wse25bSFld1 = refreshWse25bSFld1();
     }
   		return wse25bSFld1;
   }

  
	/**
	*  set variable wse25bSFld1
	*  Corresponding COBOL Variable is WSE-2-5B-S-FLD1
	*  @param value
	**/
   public void setWse25bSFld1(char[] value) {
      wse25bSFld1 = checkWse25bSFld1Constraints(value);
      serializeWse25bSFld1(wse25bSFld1);
   } 

     /**
	 * 	Update Wse25bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25bSFld1,wse25bSFld1.length);
   	
   }
   
   public void setWse25bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bSFld1,wse25bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse25bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25bSFld1 with another Field
	 *	@param value
	 */
   public void setWse25bSFld1(Field source) {
       replace(source,0,source.length(),beginWse25bSFld1,WSE_25B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25bSFld1,WSE_25B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse25bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse25bSFld2
	 *	@return wse25bSFld2
	 */
   public char[] getWse25bSFld2() throws CFException{
     if (isWse25bSFld2Modified()) { 
        wse25bSFld2 = refreshWse25bSFld2();
     }
   		return wse25bSFld2;
   }

  
	/**
	*  set variable wse25bSFld2
	*  Corresponding COBOL Variable is WSE-2-5B-S-FLD2
	*  @param value
	**/
   public void setWse25bSFld2(char[] value) {
      wse25bSFld2 = checkWse25bSFld2Constraints(value);
      serializeWse25bSFld2(wse25bSFld2);
   } 

     /**
	 * 	Update Wse25bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25bSFld2,wse25bSFld2.length);
   	
   }
   
   public void setWse25bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bSFld2,wse25bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse25bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25bSFld2 with another Field
	 *	@param value
	 */
   public void setWse25bSFld2(Field source) {
       replace(source,0,source.length(),beginWse25bSFld2,WSE_25B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25bSFld2,WSE_25B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse25bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse25bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse25bSFld1(CONSTANTS.SPACE_30);
         setWse25bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse25bSFieldLength() {
			return WSE_25B_S_LENGTH;
		}

}
  
