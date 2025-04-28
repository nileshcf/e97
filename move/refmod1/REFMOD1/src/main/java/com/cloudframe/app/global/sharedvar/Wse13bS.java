package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse13bS extends Wse13bSSerialized { 
   

						private char[] wse13bSFld1 = Field.fillLowValue(30);

						private char[] wse13bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse13bS
	**/
    public Wse13bS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse13bS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13bS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse13bSFld1
	 *	@return wse13bSFld1
	 */
   public char[] getWse13bSFld1() throws CFException{
     if (isWse13bSFld1Modified()) { 
        wse13bSFld1 = refreshWse13bSFld1();
     }
   		return wse13bSFld1;
   }

  
	/**
	*  set variable wse13bSFld1
	*  Corresponding COBOL Variable is WSE-13B-S-FLD1
	*  @param value
	**/
   public void setWse13bSFld1(char[] value) {
      wse13bSFld1 = checkWse13bSFld1Constraints(value);
      serializeWse13bSFld1(wse13bSFld1);
   } 

     /**
	 * 	Update Wse13bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13bSFld1,wse13bSFld1.length);
   	
   }
   
   public void setWse13bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bSFld1,wse13bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse13bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13bSFld1 with another Field
	 *	@param value
	 */
   public void setWse13bSFld1(Field source) {
       replace(source,0,source.length(),beginWse13bSFld1,WSE_13B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13bSFld1,WSE_13B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse13bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13bSFld2
	 *	@return wse13bSFld2
	 */
   public char[] getWse13bSFld2() throws CFException{
     if (isWse13bSFld2Modified()) { 
        wse13bSFld2 = refreshWse13bSFld2();
     }
   		return wse13bSFld2;
   }

  
	/**
	*  set variable wse13bSFld2
	*  Corresponding COBOL Variable is WSE-13B-S-FLD2
	*  @param value
	**/
   public void setWse13bSFld2(char[] value) {
      wse13bSFld2 = checkWse13bSFld2Constraints(value);
      serializeWse13bSFld2(wse13bSFld2);
   } 

     /**
	 * 	Update Wse13bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13bSFld2,wse13bSFld2.length);
   	
   }
   
   public void setWse13bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bSFld2,wse13bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse13bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13bSFld2 with another Field
	 *	@param value
	 */
   public void setWse13bSFld2(Field source) {
       replace(source,0,source.length(),beginWse13bSFld2,WSE_13B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13bSFld2,WSE_13B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse13bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse13bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse13bSFld1(CONSTANTS.SPACE_30);
         setWse13bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse13bSFieldLength() {
			return WSE_13B_S_LENGTH;
		}

}
  
