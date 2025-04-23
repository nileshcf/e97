package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse29aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse29aS extends Wse29aSSerialized { 
   

						private char[] wse29aSFld1 = Field.fillLowValue(30);

						private char[] wse29aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse29aS
	**/
    public Wse29aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse29aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse29aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse29aSFld1
	 *	@return wse29aSFld1
	 */
   public char[] getWse29aSFld1() throws CFException{
     if (isWse29aSFld1Modified()) { 
        wse29aSFld1 = refreshWse29aSFld1();
     }
   		return wse29aSFld1;
   }

  
	/**
	*  set variable wse29aSFld1
	*  Corresponding COBOL Variable is WSE-2-9A-S-FLD1
	*  @param value
	**/
   public void setWse29aSFld1(char[] value) {
      wse29aSFld1 = checkWse29aSFld1Constraints(value);
      serializeWse29aSFld1(wse29aSFld1);
   } 

     /**
	 * 	Update Wse29aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse29aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse29aSFld1,wse29aSFld1.length);
   	
   }
   
   public void setWse29aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse29aSFld1,wse29aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse29aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse29aSFld1 with another Field
	 *	@param value
	 */
   public void setWse29aSFld1(Field source) {
       replace(source,0,source.length(),beginWse29aSFld1,WSE_29A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse29aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse29aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse29aSFld1,WSE_29A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse29aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse29aSFld2
	 *	@return wse29aSFld2
	 */
   public char[] getWse29aSFld2() throws CFException{
     if (isWse29aSFld2Modified()) { 
        wse29aSFld2 = refreshWse29aSFld2();
     }
   		return wse29aSFld2;
   }

  
	/**
	*  set variable wse29aSFld2
	*  Corresponding COBOL Variable is WSE-2-9A-S-FLD2
	*  @param value
	**/
   public void setWse29aSFld2(char[] value) {
      wse29aSFld2 = checkWse29aSFld2Constraints(value);
      serializeWse29aSFld2(wse29aSFld2);
   } 

     /**
	 * 	Update Wse29aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse29aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse29aSFld2,wse29aSFld2.length);
   	
   }
   
   public void setWse29aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse29aSFld2,wse29aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse29aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse29aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse29aSFld2 with another Field
	 *	@param value
	 */
   public void setWse29aSFld2(Field source) {
       replace(source,0,source.length(),beginWse29aSFld2,WSE_29A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse29aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse29aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse29aSFld2,WSE_29A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse29aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse29aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse29aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse29aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse29aSFld1(CONSTANTS.SPACE_30);
         setWse29aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse29aSFieldLength() {
			return WSE_29A_S_LENGTH;
		}

}
  
