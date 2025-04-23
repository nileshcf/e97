package com.cloudframe.app.global.sharedvar;

/**
*  The class BT6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT6 extends BT6Serialized { 
   

						private char[] bTFld16 = Field.fillLowValue(20);

						private char[] bTFld26 = Field.fillLowValue(40);

						private char[] bTFld36 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT6
	**/
    public BT6() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld16
	 *	@return bTFld16
	 */
   public char[] getBTFld16() throws CFException{
     if (isBTFld16Modified()) { 
        bTFld16 = refreshBTFld16();
     }
   		return bTFld16;
   }

  
	/**
	*  set variable bTFld16
	*  Corresponding COBOL Variable is WS-6B-T-FLD1
	*  @param value
	**/
   public void setBTFld16(char[] value) {
      bTFld16 = checkBTFld16Constraints(value);
      serializeBTFld16(bTFld16);
   } 

     /**
	 * 	Update BTFld16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld16,bTFld16.length);
   	
   }
   
   public void setBTFld16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld16,bTFld16.length);
   	
   }
   
     /**
	 * 	Update BTFld16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld16 with another Field
	 *	@param value
	 */
   public void setBTFld16(Field source) {
       replace(source,0,source.length(),beginBTFld16,B_TFLD_16_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld16,B_TFLD_16_LEN);
   	
   }
   
     /**
	 * 	Update BTFld16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld26
	 *	@return bTFld26
	 */
   public char[] getBTFld26() throws CFException{
     if (isBTFld26Modified()) { 
        bTFld26 = refreshBTFld26();
     }
   		return bTFld26;
   }

  
	/**
	*  set variable bTFld26
	*  Corresponding COBOL Variable is WS-6B-T-FLD2
	*  @param value
	**/
   public void setBTFld26(char[] value) {
      bTFld26 = checkBTFld26Constraints(value);
      serializeBTFld26(bTFld26);
   } 

     /**
	 * 	Update BTFld26 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld26(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld26,bTFld26.length);
   	
   }
   
   public void setBTFld26(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld26,bTFld26.length);
   	
   }
   
     /**
	 * 	Update BTFld26 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld26(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld26+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld26 with another Field
	 *	@param value
	 */
   public void setBTFld26(Field source) {
       replace(source,0,source.length(),beginBTFld26,B_TFLD_26_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld26 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld26(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld26,B_TFLD_26_LEN);
   	
   }
   
     /**
	 * 	Update BTFld26 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld26(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld26+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld36
	 *	@return bTFld36
	 */
   public char[] getBTFld36() throws CFException{
     if (isBTFld36Modified()) { 
        bTFld36 = refreshBTFld36();
     }
   		return bTFld36;
   }

  
	/**
	*  set variable bTFld36
	*  Corresponding COBOL Variable is WS-6B-T-FLD3
	*  @param value
	**/
   public void setBTFld36(char[] value) {
      bTFld36 = checkBTFld36Constraints(value);
      serializeBTFld36(bTFld36);
   } 

     /**
	 * 	Update BTFld36 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld36(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld36,bTFld36.length);
   	
   }
   
   public void setBTFld36(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld36,bTFld36.length);
   	
   }
   
     /**
	 * 	Update BTFld36 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld36(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld36+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld36 with another Field
	 *	@param value
	 */
   public void setBTFld36(Field source) {
       replace(source,0,source.length(),beginBTFld36,B_TFLD_36_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld36 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld36(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld36,B_TFLD_36_LEN);
   	
   }
   
     /**
	 * 	Update BTFld36 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld36(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld36+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld16(CONSTANTS.SPACE_20);
         setBTFld26(CONSTANTS.SPACE_40);
         setBTFld36(CONSTANTS.SPACE_30);
   }

		public static int getBT6FieldLength() {
			return B_T_6_LENGTH;
		}

}
  
