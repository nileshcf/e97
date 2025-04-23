package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse13aS extends Wse13aSSerialized { 
   

						private char[] wse13aSFld1 = Field.fillLowValue(30);

						private char[] wse13aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse13aS
	**/
    public Wse13aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse13aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse13aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse13aSFld1
	 *	@return wse13aSFld1
	 */
   public char[] getWse13aSFld1() throws CFException{
     if (isWse13aSFld1Modified()) { 
        wse13aSFld1 = refreshWse13aSFld1();
     }
   		return wse13aSFld1;
   }

  
	/**
	*  set variable wse13aSFld1
	*  Corresponding COBOL Variable is WSE-13A-S-FLD1
	*  @param value
	**/
   public void setWse13aSFld1(char[] value) {
      wse13aSFld1 = checkWse13aSFld1Constraints(value);
      serializeWse13aSFld1(wse13aSFld1);
   } 

     /**
	 * 	Update Wse13aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13aSFld1,wse13aSFld1.length);
   	
   }
   
   public void setWse13aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aSFld1,wse13aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse13aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13aSFld1 with another Field
	 *	@param value
	 */
   public void setWse13aSFld1(Field source) {
       replace(source,0,source.length(),beginWse13aSFld1,WSE_13A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13aSFld1,WSE_13A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse13aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13aSFld2
	 *	@return wse13aSFld2
	 */
   public char[] getWse13aSFld2() throws CFException{
     if (isWse13aSFld2Modified()) { 
        wse13aSFld2 = refreshWse13aSFld2();
     }
   		return wse13aSFld2;
   }

  
	/**
	*  set variable wse13aSFld2
	*  Corresponding COBOL Variable is WSE-13A-S-FLD2
	*  @param value
	**/
   public void setWse13aSFld2(char[] value) {
      wse13aSFld2 = checkWse13aSFld2Constraints(value);
      serializeWse13aSFld2(wse13aSFld2);
   } 

     /**
	 * 	Update Wse13aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13aSFld2,wse13aSFld2.length);
   	
   }
   
   public void setWse13aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aSFld2,wse13aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse13aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13aSFld2 with another Field
	 *	@param value
	 */
   public void setWse13aSFld2(Field source) {
       replace(source,0,source.length(),beginWse13aSFld2,WSE_13A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13aSFld2,WSE_13A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse13aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse13aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse13aSFld1(CONSTANTS.SPACE_30);
         setWse13aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse13aSFieldLength() {
			return WSE_13A_S_LENGTH;
		}

}
  
