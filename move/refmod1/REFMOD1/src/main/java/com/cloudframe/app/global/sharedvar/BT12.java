package com.cloudframe.app.global.sharedvar;

/**
*  The class BT12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT12 extends BT12Serialized { 
   

						private char[] bTFld112 = Field.fillLowValue(20);

						private char[] bTFld212 = Field.fillLowValue(40);

						private char[] bTFld312 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT12
	**/
    public BT12() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld112
	 *	@return bTFld112
	 */
   public char[] getBTFld112() throws CFException{
     if (isBTFld112Modified()) { 
        bTFld112 = refreshBTFld112();
     }
   		return bTFld112;
   }

  
	/**
	*  set variable bTFld112
	*  Corresponding COBOL Variable is WS-12B-T-FLD1
	*  @param value
	**/
   public void setBTFld112(char[] value) {
      bTFld112 = checkBTFld112Constraints(value);
      serializeBTFld112(bTFld112);
   } 

     /**
	 * 	Update BTFld112 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld112(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld112,bTFld112.length);
   	
   }
   
   public void setBTFld112(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld112,bTFld112.length);
   	
   }
   
     /**
	 * 	Update BTFld112 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld112(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld112+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld112 with another Field
	 *	@param value
	 */
   public void setBTFld112(Field source) {
       replace(source,0,source.length(),beginBTFld112,B_TFLD_112_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld112 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld112(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld112,B_TFLD_112_LEN);
   	
   }
   
     /**
	 * 	Update BTFld112 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld112(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld112+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld212
	 *	@return bTFld212
	 */
   public char[] getBTFld212() throws CFException{
     if (isBTFld212Modified()) { 
        bTFld212 = refreshBTFld212();
     }
   		return bTFld212;
   }

  
	/**
	*  set variable bTFld212
	*  Corresponding COBOL Variable is WS-12B-T-FLD2
	*  @param value
	**/
   public void setBTFld212(char[] value) {
      bTFld212 = checkBTFld212Constraints(value);
      serializeBTFld212(bTFld212);
   } 

     /**
	 * 	Update BTFld212 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld212(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld212,bTFld212.length);
   	
   }
   
   public void setBTFld212(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld212,bTFld212.length);
   	
   }
   
     /**
	 * 	Update BTFld212 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld212+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld212 with another Field
	 *	@param value
	 */
   public void setBTFld212(Field source) {
       replace(source,0,source.length(),beginBTFld212,B_TFLD_212_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld212 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld212(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld212,B_TFLD_212_LEN);
   	
   }
   
     /**
	 * 	Update BTFld212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld212+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld312
	 *	@return bTFld312
	 */
   public char[] getBTFld312() throws CFException{
     if (isBTFld312Modified()) { 
        bTFld312 = refreshBTFld312();
     }
   		return bTFld312;
   }

  
	/**
	*  set variable bTFld312
	*  Corresponding COBOL Variable is WS-12B-T-FLD3
	*  @param value
	**/
   public void setBTFld312(char[] value) {
      bTFld312 = checkBTFld312Constraints(value);
      serializeBTFld312(bTFld312);
   } 

     /**
	 * 	Update BTFld312 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld312(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld312,bTFld312.length);
   	
   }
   
   public void setBTFld312(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld312,bTFld312.length);
   	
   }
   
     /**
	 * 	Update BTFld312 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld312(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld312+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld312 with another Field
	 *	@param value
	 */
   public void setBTFld312(Field source) {
       replace(source,0,source.length(),beginBTFld312,B_TFLD_312_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld312 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld312(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld312,B_TFLD_312_LEN);
   	
   }
   
     /**
	 * 	Update BTFld312 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld312(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld312+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT12
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld112(CONSTANTS.SPACE_20);
         setBTFld212(CONSTANTS.SPACE_40);
         setBTFld312(CONSTANTS.SPACE_30);
   }

		public static int getBT12FieldLength() {
			return B_T_12_LENGTH;
		}

}
  
