package com.cloudframe.app.global.sharedvar;

/**
*  The class BT13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT13 extends BT13Serialized { 
   

						private char[] bTFld113 = Field.fillLowValue(20);

						private char[] bTFld213 = Field.fillLowValue(40);

						private char[] bTFld313 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT13
	**/
    public BT13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld113
	 *	@return bTFld113
	 */
   public char[] getBTFld113() throws CFException{
     if (isBTFld113Modified()) { 
        bTFld113 = refreshBTFld113();
     }
   		return bTFld113;
   }

  
	/**
	*  set variable bTFld113
	*  Corresponding COBOL Variable is WS-13B-T-FLD1
	*  @param value
	**/
   public void setBTFld113(char[] value) {
      bTFld113 = checkBTFld113Constraints(value);
      serializeBTFld113(bTFld113);
   } 

     /**
	 * 	Update BTFld113 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld113(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld113,bTFld113.length);
   	
   }
   
   public void setBTFld113(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld113,bTFld113.length);
   	
   }
   
     /**
	 * 	Update BTFld113 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld113(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld113+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld113 with another Field
	 *	@param value
	 */
   public void setBTFld113(Field source) {
       replace(source,0,source.length(),beginBTFld113,B_TFLD_113_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld113 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld113(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld113,B_TFLD_113_LEN);
   	
   }
   
     /**
	 * 	Update BTFld113 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld113(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld113+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld213
	 *	@return bTFld213
	 */
   public char[] getBTFld213() throws CFException{
     if (isBTFld213Modified()) { 
        bTFld213 = refreshBTFld213();
     }
   		return bTFld213;
   }

  
	/**
	*  set variable bTFld213
	*  Corresponding COBOL Variable is WS-13B-T-FLD2
	*  @param value
	**/
   public void setBTFld213(char[] value) {
      bTFld213 = checkBTFld213Constraints(value);
      serializeBTFld213(bTFld213);
   } 

     /**
	 * 	Update BTFld213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld213,bTFld213.length);
   	
   }
   
   public void setBTFld213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld213,bTFld213.length);
   	
   }
   
     /**
	 * 	Update BTFld213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld213 with another Field
	 *	@param value
	 */
   public void setBTFld213(Field source) {
       replace(source,0,source.length(),beginBTFld213,B_TFLD_213_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld213,B_TFLD_213_LEN);
   	
   }
   
     /**
	 * 	Update BTFld213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld213+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld313
	 *	@return bTFld313
	 */
   public char[] getBTFld313() throws CFException{
     if (isBTFld313Modified()) { 
        bTFld313 = refreshBTFld313();
     }
   		return bTFld313;
   }

  
	/**
	*  set variable bTFld313
	*  Corresponding COBOL Variable is WS-13B-T-FLD3
	*  @param value
	**/
   public void setBTFld313(char[] value) {
      bTFld313 = checkBTFld313Constraints(value);
      serializeBTFld313(bTFld313);
   } 

     /**
	 * 	Update BTFld313 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld313(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld313,bTFld313.length);
   	
   }
   
   public void setBTFld313(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld313,bTFld313.length);
   	
   }
   
     /**
	 * 	Update BTFld313 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld313(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld313+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld313 with another Field
	 *	@param value
	 */
   public void setBTFld313(Field source) {
       replace(source,0,source.length(),beginBTFld313,B_TFLD_313_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld313 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld313(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld313,B_TFLD_313_LEN);
   	
   }
   
     /**
	 * 	Update BTFld313 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld313(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld313+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld113(CONSTANTS.SPACE_20);
         setBTFld213(CONSTANTS.SPACE_40);
         setBTFld313(CONSTANTS.SPACE_30);
   }

		public static int getBT13FieldLength() {
			return B_T_13_LENGTH;
		}

}
  
