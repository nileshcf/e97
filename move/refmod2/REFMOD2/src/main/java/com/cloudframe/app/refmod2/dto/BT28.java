package com.cloudframe.app.refmod2.dto;

/**
*  The class BT28 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT28 extends BT28Serialized { 
   

						private char[] bTFld128 = Field.fillLowValue(20);

						private char[] bTFld228 = Field.fillLowValue(40);

						private char[] bTFld328 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT28
	**/
    public BT28() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT28. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT28(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld128
	 *	@return bTFld128
	 */
   public char[] getBTFld128() throws CFException{
     if (isBTFld128Modified()) { 
        bTFld128 = refreshBTFld128();
     }
   		return bTFld128;
   }

  
	/**
	*  set variable bTFld128
	*  Corresponding COBOL Variable is WS-2-8B-T-FLD1
	*  @param value
	**/
   public void setBTFld128(char[] value) {
      bTFld128 = checkBTFld128Constraints(value);
      serializeBTFld128(bTFld128);
   } 

     /**
	 * 	Update BTFld128 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld128(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld128,bTFld128.length);
   	
   }
   
   public void setBTFld128(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld128,bTFld128.length);
   	
   }
   
     /**
	 * 	Update BTFld128 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld128(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld128+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld128 with another Field
	 *	@param value
	 */
   public void setBTFld128(Field source) {
       replace(source,0,source.length(),beginBTFld128,B_TFLD_128_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld128 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld128(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld128,B_TFLD_128_LEN);
   	
   }
   
     /**
	 * 	Update BTFld128 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld128(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld128+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld228
	 *	@return bTFld228
	 */
   public char[] getBTFld228() throws CFException{
     if (isBTFld228Modified()) { 
        bTFld228 = refreshBTFld228();
     }
   		return bTFld228;
   }

  
	/**
	*  set variable bTFld228
	*  Corresponding COBOL Variable is WS-2-8B-T-FLD2
	*  @param value
	**/
   public void setBTFld228(char[] value) {
      bTFld228 = checkBTFld228Constraints(value);
      serializeBTFld228(bTFld228);
   } 

     /**
	 * 	Update BTFld228 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld228(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld228,bTFld228.length);
   	
   }
   
   public void setBTFld228(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld228,bTFld228.length);
   	
   }
   
     /**
	 * 	Update BTFld228 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld228(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld228+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld228 with another Field
	 *	@param value
	 */
   public void setBTFld228(Field source) {
       replace(source,0,source.length(),beginBTFld228,B_TFLD_228_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld228 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld228(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld228,B_TFLD_228_LEN);
   	
   }
   
     /**
	 * 	Update BTFld228 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld228(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld228+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld328
	 *	@return bTFld328
	 */
   public char[] getBTFld328() throws CFException{
     if (isBTFld328Modified()) { 
        bTFld328 = refreshBTFld328();
     }
   		return bTFld328;
   }

  
	/**
	*  set variable bTFld328
	*  Corresponding COBOL Variable is WS-2-8B-T-FLD3
	*  @param value
	**/
   public void setBTFld328(char[] value) {
      bTFld328 = checkBTFld328Constraints(value);
      serializeBTFld328(bTFld328);
   } 

     /**
	 * 	Update BTFld328 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld328(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld328,bTFld328.length);
   	
   }
   
   public void setBTFld328(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld328,bTFld328.length);
   	
   }
   
     /**
	 * 	Update BTFld328 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld328(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld328+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld328 with another Field
	 *	@param value
	 */
   public void setBTFld328(Field source) {
       replace(source,0,source.length(),beginBTFld328,B_TFLD_328_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld328 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld328(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld328,B_TFLD_328_LEN);
   	
   }
   
     /**
	 * 	Update BTFld328 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld328(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld328+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT28
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld128(CONSTANTS.SPACE_20);
         setBTFld228(CONSTANTS.SPACE_40);
         setBTFld328(CONSTANTS.SPACE_30);
   }

		public static int getBT28FieldLength() {
			return B_T_28_LENGTH;
		}

}
  
