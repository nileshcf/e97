package com.cloudframe.app.global.sharedvar;

/**
*  The class BT9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT9 extends BT9Serialized { 
   

						private char[] bTFld19 = Field.fillLowValue(20);

						private char[] bTFld29 = Field.fillLowValue(40);

						private char[] bTFld39 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT9
	**/
    public BT9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld19
	 *	@return bTFld19
	 */
   public char[] getBTFld19() throws CFException{
     if (isBTFld19Modified()) { 
        bTFld19 = refreshBTFld19();
     }
   		return bTFld19;
   }

  
	/**
	*  set variable bTFld19
	*  Corresponding COBOL Variable is WS-9B-T-FLD1
	*  @param value
	**/
   public void setBTFld19(char[] value) {
      bTFld19 = checkBTFld19Constraints(value);
      serializeBTFld19(bTFld19);
   } 

     /**
	 * 	Update BTFld19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld19,bTFld19.length);
   	
   }
   
   public void setBTFld19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld19,bTFld19.length);
   	
   }
   
     /**
	 * 	Update BTFld19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld19 with another Field
	 *	@param value
	 */
   public void setBTFld19(Field source) {
       replace(source,0,source.length(),beginBTFld19,B_TFLD_19_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld19,B_TFLD_19_LEN);
   	
   }
   
     /**
	 * 	Update BTFld19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld29
	 *	@return bTFld29
	 */
   public char[] getBTFld29() throws CFException{
     if (isBTFld29Modified()) { 
        bTFld29 = refreshBTFld29();
     }
   		return bTFld29;
   }

  
	/**
	*  set variable bTFld29
	*  Corresponding COBOL Variable is WS-9B-T-FLD2
	*  @param value
	**/
   public void setBTFld29(char[] value) {
      bTFld29 = checkBTFld29Constraints(value);
      serializeBTFld29(bTFld29);
   } 

     /**
	 * 	Update BTFld29 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld29(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld29,bTFld29.length);
   	
   }
   
   public void setBTFld29(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld29,bTFld29.length);
   	
   }
   
     /**
	 * 	Update BTFld29 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld29+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld29 with another Field
	 *	@param value
	 */
   public void setBTFld29(Field source) {
       replace(source,0,source.length(),beginBTFld29,B_TFLD_29_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld29 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld29(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld29,B_TFLD_29_LEN);
   	
   }
   
     /**
	 * 	Update BTFld29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld29+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld39
	 *	@return bTFld39
	 */
   public char[] getBTFld39() throws CFException{
     if (isBTFld39Modified()) { 
        bTFld39 = refreshBTFld39();
     }
   		return bTFld39;
   }

  
	/**
	*  set variable bTFld39
	*  Corresponding COBOL Variable is WS-9B-T-FLD3
	*  @param value
	**/
   public void setBTFld39(char[] value) {
      bTFld39 = checkBTFld39Constraints(value);
      serializeBTFld39(bTFld39);
   } 

     /**
	 * 	Update BTFld39 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld39(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld39,bTFld39.length);
   	
   }
   
   public void setBTFld39(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld39,bTFld39.length);
   	
   }
   
     /**
	 * 	Update BTFld39 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld39(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld39+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld39 with another Field
	 *	@param value
	 */
   public void setBTFld39(Field source) {
       replace(source,0,source.length(),beginBTFld39,B_TFLD_39_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld39 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld39(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld39,B_TFLD_39_LEN);
   	
   }
   
     /**
	 * 	Update BTFld39 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld39(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld39+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld19(CONSTANTS.SPACE_20);
         setBTFld29(CONSTANTS.SPACE_40);
         setBTFld39(CONSTANTS.SPACE_30);
   }

		public static int getBT9FieldLength() {
			return B_T_9_LENGTH;
		}

}
  
