package com.cloudframe.app.global.sharedvar;

/**
*  The class BT8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT8 extends BT8Serialized { 
   

						private char[] bTFld18 = Field.fillLowValue(20);

						private char[] bTFld28 = Field.fillLowValue(40);

						private char[] bTFld38 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT8
	**/
    public BT8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld18
	 *	@return bTFld18
	 */
   public char[] getBTFld18() throws CFException{
     if (isBTFld18Modified()) { 
        bTFld18 = refreshBTFld18();
     }
   		return bTFld18;
   }

  
	/**
	*  set variable bTFld18
	*  Corresponding COBOL Variable is WS-8B-T-FLD1
	*  @param value
	**/
   public void setBTFld18(char[] value) {
      bTFld18 = checkBTFld18Constraints(value);
      serializeBTFld18(bTFld18);
   } 

     /**
	 * 	Update BTFld18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld18,bTFld18.length);
   	
   }
   
   public void setBTFld18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld18,bTFld18.length);
   	
   }
   
     /**
	 * 	Update BTFld18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld18 with another Field
	 *	@param value
	 */
   public void setBTFld18(Field source) {
       replace(source,0,source.length(),beginBTFld18,B_TFLD_18_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld18,B_TFLD_18_LEN);
   	
   }
   
     /**
	 * 	Update BTFld18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld28
	 *	@return bTFld28
	 */
   public char[] getBTFld28() throws CFException{
     if (isBTFld28Modified()) { 
        bTFld28 = refreshBTFld28();
     }
   		return bTFld28;
   }

  
	/**
	*  set variable bTFld28
	*  Corresponding COBOL Variable is WS-8B-T-FLD2
	*  @param value
	**/
   public void setBTFld28(char[] value) {
      bTFld28 = checkBTFld28Constraints(value);
      serializeBTFld28(bTFld28);
   } 

     /**
	 * 	Update BTFld28 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld28(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld28,bTFld28.length);
   	
   }
   
   public void setBTFld28(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld28,bTFld28.length);
   	
   }
   
     /**
	 * 	Update BTFld28 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld28(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld28+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld28 with another Field
	 *	@param value
	 */
   public void setBTFld28(Field source) {
       replace(source,0,source.length(),beginBTFld28,B_TFLD_28_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld28 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld28(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld28,B_TFLD_28_LEN);
   	
   }
   
     /**
	 * 	Update BTFld28 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld28(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld28+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld38
	 *	@return bTFld38
	 */
   public char[] getBTFld38() throws CFException{
     if (isBTFld38Modified()) { 
        bTFld38 = refreshBTFld38();
     }
   		return bTFld38;
   }

  
	/**
	*  set variable bTFld38
	*  Corresponding COBOL Variable is WS-8B-T-FLD3
	*  @param value
	**/
   public void setBTFld38(char[] value) {
      bTFld38 = checkBTFld38Constraints(value);
      serializeBTFld38(bTFld38);
   } 

     /**
	 * 	Update BTFld38 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld38(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld38,bTFld38.length);
   	
   }
   
   public void setBTFld38(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld38,bTFld38.length);
   	
   }
   
     /**
	 * 	Update BTFld38 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld38(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld38+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld38 with another Field
	 *	@param value
	 */
   public void setBTFld38(Field source) {
       replace(source,0,source.length(),beginBTFld38,B_TFLD_38_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld38 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld38(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld38,B_TFLD_38_LEN);
   	
   }
   
     /**
	 * 	Update BTFld38 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld38(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld38+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld18(CONSTANTS.SPACE_20);
         setBTFld28(CONSTANTS.SPACE_40);
         setBTFld38(CONSTANTS.SPACE_30);
   }

		public static int getBT8FieldLength() {
			return B_T_8_LENGTH;
		}

}
  
