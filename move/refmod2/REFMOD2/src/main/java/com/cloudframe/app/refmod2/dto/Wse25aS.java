package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse25aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse25aS extends Wse25aSSerialized { 
   

						private char[] wse25aSFld1 = Field.fillLowValue(30);

						private char[] wse25aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse25aS
	**/
    public Wse25aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse25aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse25aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse25aSFld1
	 *	@return wse25aSFld1
	 */
   public char[] getWse25aSFld1() throws CFException{
     if (isWse25aSFld1Modified()) { 
        wse25aSFld1 = refreshWse25aSFld1();
     }
   		return wse25aSFld1;
   }

  
	/**
	*  set variable wse25aSFld1
	*  Corresponding COBOL Variable is WSE-2-5A-S-FLD1
	*  @param value
	**/
   public void setWse25aSFld1(char[] value) {
      wse25aSFld1 = checkWse25aSFld1Constraints(value);
      serializeWse25aSFld1(wse25aSFld1);
   } 

     /**
	 * 	Update Wse25aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25aSFld1,wse25aSFld1.length);
   	
   }
   
   public void setWse25aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aSFld1,wse25aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse25aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25aSFld1 with another Field
	 *	@param value
	 */
   public void setWse25aSFld1(Field source) {
       replace(source,0,source.length(),beginWse25aSFld1,WSE_25A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25aSFld1,WSE_25A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse25aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse25aSFld2
	 *	@return wse25aSFld2
	 */
   public char[] getWse25aSFld2() throws CFException{
     if (isWse25aSFld2Modified()) { 
        wse25aSFld2 = refreshWse25aSFld2();
     }
   		return wse25aSFld2;
   }

  
	/**
	*  set variable wse25aSFld2
	*  Corresponding COBOL Variable is WSE-2-5A-S-FLD2
	*  @param value
	**/
   public void setWse25aSFld2(char[] value) {
      wse25aSFld2 = checkWse25aSFld2Constraints(value);
      serializeWse25aSFld2(wse25aSFld2);
   } 

     /**
	 * 	Update Wse25aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse25aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse25aSFld2,wse25aSFld2.length);
   	
   }
   
   public void setWse25aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aSFld2,wse25aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse25aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse25aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse25aSFld2 with another Field
	 *	@param value
	 */
   public void setWse25aSFld2(Field source) {
       replace(source,0,source.length(),beginWse25aSFld2,WSE_25A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse25aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse25aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse25aSFld2,WSE_25A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse25aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse25aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse25aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse25aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse25aSFld1(CONSTANTS.SPACE_30);
         setWse25aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse25aSFieldLength() {
			return WSE_25A_S_LENGTH;
		}

}
  
