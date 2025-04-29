package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse215bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse215bS extends Wse215bSSerialized { 
   

						private char[] wse215bSFld1 = Field.fillLowValue(30);

						private char[] wse215bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse215bS
	**/
    public Wse215bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse215bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse215bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse215bSFld1
	 *	@return wse215bSFld1
	 */
   public char[] getWse215bSFld1() throws CFException{
     if (isWse215bSFld1Modified()) { 
        wse215bSFld1 = refreshWse215bSFld1();
     }
   		return wse215bSFld1;
   }

  
	/**
	*  set variable wse215bSFld1
	*  Corresponding COBOL Variable is WSE-2-15B-S-FLD1
	*  @param value
	**/
   public void setWse215bSFld1(char[] value) {
      wse215bSFld1 = checkWse215bSFld1Constraints(value);
      serializeWse215bSFld1(wse215bSFld1);
   } 

     /**
	 * 	Update Wse215bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215bSFld1,wse215bSFld1.length);
   	
   }
   
   public void setWse215bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bSFld1,wse215bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse215bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215bSFld1 with another Field
	 *	@param value
	 */
   public void setWse215bSFld1(Field source) {
       replace(source,0,source.length(),beginWse215bSFld1,WSE_215B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215bSFld1,WSE_215B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse215bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse215bSFld2
	 *	@return wse215bSFld2
	 */
   public char[] getWse215bSFld2() throws CFException{
     if (isWse215bSFld2Modified()) { 
        wse215bSFld2 = refreshWse215bSFld2();
     }
   		return wse215bSFld2;
   }

  
	/**
	*  set variable wse215bSFld2
	*  Corresponding COBOL Variable is WSE-2-15B-S-FLD2
	*  @param value
	**/
   public void setWse215bSFld2(char[] value) {
      wse215bSFld2 = checkWse215bSFld2Constraints(value);
      serializeWse215bSFld2(wse215bSFld2);
   } 

     /**
	 * 	Update Wse215bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215bSFld2,wse215bSFld2.length);
   	
   }
   
   public void setWse215bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bSFld2,wse215bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse215bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215bSFld2 with another Field
	 *	@param value
	 */
   public void setWse215bSFld2(Field source) {
       replace(source,0,source.length(),beginWse215bSFld2,WSE_215B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215bSFld2,WSE_215B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse215bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse215bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse215bSFld1(CONSTANTS.SPACE_30);
         setWse215bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse215bSFieldLength() {
			return WSE_215B_S_LENGTH;
		}

}
  
