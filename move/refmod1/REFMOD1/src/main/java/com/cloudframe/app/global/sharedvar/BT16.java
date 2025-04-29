package com.cloudframe.app.global.sharedvar;

/**
*  The class BT16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT16 extends BT16Serialized { 
   

						private char[] bTFld116 = Field.fillLowValue(20);

						private char[] bTFld216 = Field.fillLowValue(40);

						private char[] bTFld316 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT16
	**/
    public BT16() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT16. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT16(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld116
	 *	@return bTFld116
	 */
   public char[] getBTFld116() throws CFException{
     if (isBTFld116Modified()) { 
        bTFld116 = refreshBTFld116();
     }
   		return bTFld116;
   }

  
	/**
	*  set variable bTFld116
	*  Corresponding COBOL Variable is WS-16B-T-FLD1
	*  @param value
	**/
   public void setBTFld116(char[] value) {
      bTFld116 = checkBTFld116Constraints(value);
      serializeBTFld116(bTFld116);
   } 

     /**
	 * 	Update BTFld116 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld116(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld116,bTFld116.length);
   	
   }
   
   public void setBTFld116(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld116,bTFld116.length);
   	
   }
   
     /**
	 * 	Update BTFld116 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld116(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld116+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld116 with another Field
	 *	@param value
	 */
   public void setBTFld116(Field source) {
       replace(source,0,source.length(),beginBTFld116,B_TFLD_116_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld116 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld116(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld116,B_TFLD_116_LEN);
   	
   }
   
     /**
	 * 	Update BTFld116 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld116(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld116+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld216
	 *	@return bTFld216
	 */
   public char[] getBTFld216() throws CFException{
     if (isBTFld216Modified()) { 
        bTFld216 = refreshBTFld216();
     }
   		return bTFld216;
   }

  
	/**
	*  set variable bTFld216
	*  Corresponding COBOL Variable is WS-16B-T-FLD2
	*  @param value
	**/
   public void setBTFld216(char[] value) {
      bTFld216 = checkBTFld216Constraints(value);
      serializeBTFld216(bTFld216);
   } 

     /**
	 * 	Update BTFld216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld216,bTFld216.length);
   	
   }
   
   public void setBTFld216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld216,bTFld216.length);
   	
   }
   
     /**
	 * 	Update BTFld216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld216 with another Field
	 *	@param value
	 */
   public void setBTFld216(Field source) {
       replace(source,0,source.length(),beginBTFld216,B_TFLD_216_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld216,B_TFLD_216_LEN);
   	
   }
   
     /**
	 * 	Update BTFld216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld216+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld316
	 *	@return bTFld316
	 */
   public char[] getBTFld316() throws CFException{
     if (isBTFld316Modified()) { 
        bTFld316 = refreshBTFld316();
     }
   		return bTFld316;
   }

  
	/**
	*  set variable bTFld316
	*  Corresponding COBOL Variable is WS-16B-T-FLD3
	*  @param value
	**/
   public void setBTFld316(char[] value) {
      bTFld316 = checkBTFld316Constraints(value);
      serializeBTFld316(bTFld316);
   } 

     /**
	 * 	Update BTFld316 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld316(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld316,bTFld316.length);
   	
   }
   
   public void setBTFld316(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld316,bTFld316.length);
   	
   }
   
     /**
	 * 	Update BTFld316 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld316(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld316+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld316 with another Field
	 *	@param value
	 */
   public void setBTFld316(Field source) {
       replace(source,0,source.length(),beginBTFld316,B_TFLD_316_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld316 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld316(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld316,B_TFLD_316_LEN);
   	
   }
   
     /**
	 * 	Update BTFld316 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld316(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld316+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT16
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld116(CONSTANTS.SPACE_20);
         setBTFld216(CONSTANTS.SPACE_40);
         setBTFld316(CONSTANTS.SPACE_30);
   }

		public static int getBT16FieldLength() {
			return B_T_16_LENGTH;
		}

}
  
