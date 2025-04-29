package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse15aS extends Wse15aSSerialized { 
   

						private char[] wse15aSFld1 = Field.fillLowValue(30);

						private char[] wse15aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse15aS
	**/
    public Wse15aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse15aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse15aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse15aSFld1
	 *	@return wse15aSFld1
	 */
   public char[] getWse15aSFld1() throws CFException{
     if (isWse15aSFld1Modified()) { 
        wse15aSFld1 = refreshWse15aSFld1();
     }
   		return wse15aSFld1;
   }

  
	/**
	*  set variable wse15aSFld1
	*  Corresponding COBOL Variable is WSE-15A-S-FLD1
	*  @param value
	**/
   public void setWse15aSFld1(char[] value) {
      wse15aSFld1 = checkWse15aSFld1Constraints(value);
      serializeWse15aSFld1(wse15aSFld1);
   } 

     /**
	 * 	Update Wse15aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15aSFld1,wse15aSFld1.length);
   	
   }
   
   public void setWse15aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aSFld1,wse15aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse15aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15aSFld1 with another Field
	 *	@param value
	 */
   public void setWse15aSFld1(Field source) {
       replace(source,0,source.length(),beginWse15aSFld1,WSE_15A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15aSFld1,WSE_15A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse15aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse15aSFld2
	 *	@return wse15aSFld2
	 */
   public char[] getWse15aSFld2() throws CFException{
     if (isWse15aSFld2Modified()) { 
        wse15aSFld2 = refreshWse15aSFld2();
     }
   		return wse15aSFld2;
   }

  
	/**
	*  set variable wse15aSFld2
	*  Corresponding COBOL Variable is WSE-15A-S-FLD2
	*  @param value
	**/
   public void setWse15aSFld2(char[] value) {
      wse15aSFld2 = checkWse15aSFld2Constraints(value);
      serializeWse15aSFld2(wse15aSFld2);
   } 

     /**
	 * 	Update Wse15aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15aSFld2,wse15aSFld2.length);
   	
   }
   
   public void setWse15aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aSFld2,wse15aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse15aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15aSFld2 with another Field
	 *	@param value
	 */
   public void setWse15aSFld2(Field source) {
       replace(source,0,source.length(),beginWse15aSFld2,WSE_15A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15aSFld2,WSE_15A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse15aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse15aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse15aSFld1(CONSTANTS.SPACE_30);
         setWse15aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse15aSFieldLength() {
			return WSE_15A_S_LENGTH;
		}

}
  
