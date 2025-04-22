package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse5bS extends Wse5bSSerialized { 
   

						private char[] wse5bSFld1 = Field.fillLowValue(30);

						private char[] wse5bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse5bS
	**/
    public Wse5bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse5bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse5bSFld1
	 *	@return wse5bSFld1
	 */
   public char[] getWse5bSFld1() throws CFException{
     if (isWse5bSFld1Modified()) { 
        wse5bSFld1 = refreshWse5bSFld1();
     }
   		return wse5bSFld1;
   }

  
	/**
	*  set variable wse5bSFld1
	*  Corresponding COBOL Variable is WSE-5B-S-FLD1
	*  @param value
	**/
   public void setWse5bSFld1(char[] value) {
      wse5bSFld1 = checkWse5bSFld1Constraints(value);
      serializeWse5bSFld1(wse5bSFld1);
   } 

     /**
	 * 	Update Wse5bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5bSFld1,wse5bSFld1.length);
   	
   }
   
   public void setWse5bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bSFld1,wse5bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse5bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5bSFld1 with another Field
	 *	@param value
	 */
   public void setWse5bSFld1(Field source) {
       replace(source,0,source.length(),beginWse5bSFld1,WSE_5B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5bSFld1,WSE_5B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse5bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse5bSFld2
	 *	@return wse5bSFld2
	 */
   public char[] getWse5bSFld2() throws CFException{
     if (isWse5bSFld2Modified()) { 
        wse5bSFld2 = refreshWse5bSFld2();
     }
   		return wse5bSFld2;
   }

  
	/**
	*  set variable wse5bSFld2
	*  Corresponding COBOL Variable is WSE-5B-S-FLD2
	*  @param value
	**/
   public void setWse5bSFld2(char[] value) {
      wse5bSFld2 = checkWse5bSFld2Constraints(value);
      serializeWse5bSFld2(wse5bSFld2);
   } 

     /**
	 * 	Update Wse5bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5bSFld2,wse5bSFld2.length);
   	
   }
   
   public void setWse5bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bSFld2,wse5bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse5bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5bSFld2 with another Field
	 *	@param value
	 */
   public void setWse5bSFld2(Field source) {
       replace(source,0,source.length(),beginWse5bSFld2,WSE_5B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5bSFld2,WSE_5B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse5bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse5bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse5bSFld1(CONSTANTS.SPACE_30);
         setWse5bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse5bSFieldLength() {
			return WSE_5B_S_LENGTH;
		}

}
  
