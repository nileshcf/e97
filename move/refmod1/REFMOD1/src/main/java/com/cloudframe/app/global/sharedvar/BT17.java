package com.cloudframe.app.global.sharedvar;

/**
*  The class BT17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT17 extends BT17Serialized { 
   

						private char[] bTFld117 = Field.fillLowValue(20);

						private char[] bTFld217 = Field.fillLowValue(40);

						private char[] bTFld317 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT17
	**/
    public BT17() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld117
	 *	@return bTFld117
	 */
   public char[] getBTFld117() throws CFException{
     if (isBTFld117Modified()) { 
        bTFld117 = refreshBTFld117();
     }
   		return bTFld117;
   }

  
	/**
	*  set variable bTFld117
	*  Corresponding COBOL Variable is WS-17B-T-FLD1
	*  @param value
	**/
   public void setBTFld117(char[] value) {
      bTFld117 = checkBTFld117Constraints(value);
      serializeBTFld117(bTFld117);
   } 

     /**
	 * 	Update BTFld117 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld117(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld117,bTFld117.length);
   	
   }
   
   public void setBTFld117(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld117,bTFld117.length);
   	
   }
   
     /**
	 * 	Update BTFld117 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld117(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld117+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld117 with another Field
	 *	@param value
	 */
   public void setBTFld117(Field source) {
       replace(source,0,source.length(),beginBTFld117,B_TFLD_117_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld117 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld117(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld117,B_TFLD_117_LEN);
   	
   }
   
     /**
	 * 	Update BTFld117 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld117(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld117+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld217
	 *	@return bTFld217
	 */
   public char[] getBTFld217() throws CFException{
     if (isBTFld217Modified()) { 
        bTFld217 = refreshBTFld217();
     }
   		return bTFld217;
   }

  
	/**
	*  set variable bTFld217
	*  Corresponding COBOL Variable is WS-17B-T-FLD2
	*  @param value
	**/
   public void setBTFld217(char[] value) {
      bTFld217 = checkBTFld217Constraints(value);
      serializeBTFld217(bTFld217);
   } 

     /**
	 * 	Update BTFld217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld217,bTFld217.length);
   	
   }
   
   public void setBTFld217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld217,bTFld217.length);
   	
   }
   
     /**
	 * 	Update BTFld217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld217 with another Field
	 *	@param value
	 */
   public void setBTFld217(Field source) {
       replace(source,0,source.length(),beginBTFld217,B_TFLD_217_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld217,B_TFLD_217_LEN);
   	
   }
   
     /**
	 * 	Update BTFld217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld217+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld317
	 *	@return bTFld317
	 */
   public char[] getBTFld317() throws CFException{
     if (isBTFld317Modified()) { 
        bTFld317 = refreshBTFld317();
     }
   		return bTFld317;
   }

  
	/**
	*  set variable bTFld317
	*  Corresponding COBOL Variable is WS-17B-T-FLD3
	*  @param value
	**/
   public void setBTFld317(char[] value) {
      bTFld317 = checkBTFld317Constraints(value);
      serializeBTFld317(bTFld317);
   } 

     /**
	 * 	Update BTFld317 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld317(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld317,bTFld317.length);
   	
   }
   
   public void setBTFld317(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld317,bTFld317.length);
   	
   }
   
     /**
	 * 	Update BTFld317 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld317(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld317+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld317 with another Field
	 *	@param value
	 */
   public void setBTFld317(Field source) {
       replace(source,0,source.length(),beginBTFld317,B_TFLD_317_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld317 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld317(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld317,B_TFLD_317_LEN);
   	
   }
   
     /**
	 * 	Update BTFld317 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld317(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld317+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld117(CONSTANTS.SPACE_20);
         setBTFld217(CONSTANTS.SPACE_40);
         setBTFld317(CONSTANTS.SPACE_30);
   }

		public static int getBT17FieldLength() {
			return B_T_17_LENGTH;
		}

}
  
