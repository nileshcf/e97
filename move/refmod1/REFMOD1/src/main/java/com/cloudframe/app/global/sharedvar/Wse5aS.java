package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse5aS extends Wse5aSSerialized { 
   

						private char[] wse5aSFld1 = Field.fillLowValue(30);

						private char[] wse5aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse5aS
	**/
    public Wse5aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse5aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse5aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse5aSFld1
	 *	@return wse5aSFld1
	 */
   public char[] getWse5aSFld1() throws CFException{
     if (isWse5aSFld1Modified()) { 
        wse5aSFld1 = refreshWse5aSFld1();
     }
   		return wse5aSFld1;
   }

  
	/**
	*  set variable wse5aSFld1
	*  Corresponding COBOL Variable is WSE-5A-S-FLD1
	*  @param value
	**/
   public void setWse5aSFld1(char[] value) {
      wse5aSFld1 = checkWse5aSFld1Constraints(value);
      serializeWse5aSFld1(wse5aSFld1);
   } 

     /**
	 * 	Update Wse5aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5aSFld1,wse5aSFld1.length);
   	
   }
   
   public void setWse5aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aSFld1,wse5aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse5aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5aSFld1 with another Field
	 *	@param value
	 */
   public void setWse5aSFld1(Field source) {
       replace(source,0,source.length(),beginWse5aSFld1,WSE_5A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5aSFld1,WSE_5A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse5aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse5aSFld2
	 *	@return wse5aSFld2
	 */
   public char[] getWse5aSFld2() throws CFException{
     if (isWse5aSFld2Modified()) { 
        wse5aSFld2 = refreshWse5aSFld2();
     }
   		return wse5aSFld2;
   }

  
	/**
	*  set variable wse5aSFld2
	*  Corresponding COBOL Variable is WSE-5A-S-FLD2
	*  @param value
	**/
   public void setWse5aSFld2(char[] value) {
      wse5aSFld2 = checkWse5aSFld2Constraints(value);
      serializeWse5aSFld2(wse5aSFld2);
   } 

     /**
	 * 	Update Wse5aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5aSFld2,wse5aSFld2.length);
   	
   }
   
   public void setWse5aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aSFld2,wse5aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse5aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5aSFld2 with another Field
	 *	@param value
	 */
   public void setWse5aSFld2(Field source) {
       replace(source,0,source.length(),beginWse5aSFld2,WSE_5A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5aSFld2,WSE_5A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse5aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse5aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse5aSFld1(CONSTANTS.SPACE_30);
         setWse5aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse5aSFieldLength() {
			return WSE_5A_S_LENGTH;
		}

}
  
