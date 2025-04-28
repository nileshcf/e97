package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20cS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse20cS extends Wse20cSSerialized { 
   

						private char[] wse20cSFld1 = Field.fillLowValue(10);

						private char[] wse20cSFld2 = Field.fillLowValue(20);

						private char[] wse20cSFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse20cS
	**/
    public Wse20cS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse20cS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20cS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse20cSFld1
	 *	@return wse20cSFld1
	 */
   public char[] getWse20cSFld1() throws CFException{
     if (isWse20cSFld1Modified()) { 
        wse20cSFld1 = refreshWse20cSFld1();
     }
   		return wse20cSFld1;
   }

  
	/**
	*  set variable wse20cSFld1
	*  Corresponding COBOL Variable is WSE-20C-S-FLD1
	*  @param value
	**/
   public void setWse20cSFld1(char[] value) {
      wse20cSFld1 = checkWse20cSFld1Constraints(value);
      serializeWse20cSFld1(wse20cSFld1);
   } 

     /**
	 * 	Update Wse20cSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20cSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20cSFld1,wse20cSFld1.length);
   	
   }
   
   public void setWse20cSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld1,wse20cSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse20cSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20cSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20cSFld1 with another Field
	 *	@param value
	 */
   public void setWse20cSFld1(Field source) {
       replace(source,0,source.length(),beginWse20cSFld1,WSE_20C_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20cSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20cSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20cSFld1,WSE_20C_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse20cSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20cSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse20cSFld2
	 *	@return wse20cSFld2
	 */
   public char[] getWse20cSFld2() throws CFException{
     if (isWse20cSFld2Modified()) { 
        wse20cSFld2 = refreshWse20cSFld2();
     }
   		return wse20cSFld2;
   }

  
	/**
	*  set variable wse20cSFld2
	*  Corresponding COBOL Variable is WSE-20C-S-FLD2
	*  @param value
	**/
   public void setWse20cSFld2(char[] value) {
      wse20cSFld2 = checkWse20cSFld2Constraints(value);
      serializeWse20cSFld2(wse20cSFld2);
   } 

     /**
	 * 	Update Wse20cSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20cSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20cSFld2,wse20cSFld2.length);
   	
   }
   
   public void setWse20cSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld2,wse20cSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse20cSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20cSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20cSFld2 with another Field
	 *	@param value
	 */
   public void setWse20cSFld2(Field source) {
       replace(source,0,source.length(),beginWse20cSFld2,WSE_20C_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20cSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20cSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20cSFld2,WSE_20C_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse20cSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20cSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse20cSFld3
	 *	@return wse20cSFld3
	 */
   public char[] getWse20cSFld3() throws CFException{
     if (isWse20cSFld3Modified()) { 
        wse20cSFld3 = refreshWse20cSFld3();
     }
   		return wse20cSFld3;
   }

  
	/**
	*  set variable wse20cSFld3
	*  Corresponding COBOL Variable is WSE-20C-S-FLD3
	*  @param value
	**/
   public void setWse20cSFld3(char[] value) {
      wse20cSFld3 = checkWse20cSFld3Constraints(value);
      serializeWse20cSFld3(wse20cSFld3);
   } 

     /**
	 * 	Update Wse20cSFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20cSFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20cSFld3,wse20cSFld3.length);
   	
   }
   
   public void setWse20cSFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld3,wse20cSFld3.length);
   	
   }
   
     /**
	 * 	Update Wse20cSFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20cSFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20cSFld3 with another Field
	 *	@param value
	 */
   public void setWse20cSFld3(Field source) {
       replace(source,0,source.length(),beginWse20cSFld3,WSE_20C_SFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20cSFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20cSFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20cSFld3,WSE_20C_SFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse20cSFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20cSFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cSFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse20cS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse20cSFld1(CONSTANTS.SPACE_10);
         setWse20cSFld2(CONSTANTS.SPACE_20);
         setWse20cSFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse20cSFieldLength() {
			return WSE_20C_S_LENGTH;
		}

}
  
