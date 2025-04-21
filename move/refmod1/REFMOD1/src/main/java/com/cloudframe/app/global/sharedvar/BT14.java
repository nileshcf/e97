package com.cloudframe.app.global.sharedvar;

/**
*  The class BT14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT14 extends BT14Serialized { 
   

						private char[] bTFld114 = Field.fillLowValue(20);

						private char[] bTFld214 = Field.fillLowValue(40);

						private char[] bTFld314 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT14
	**/
    public BT14() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld114
	 *	@return bTFld114
	 */
   public char[] getBTFld114() throws CFException{
     if (isBTFld114Modified()) { 
        bTFld114 = refreshBTFld114();
     }
   		return bTFld114;
   }

  
	/**
	*  set variable bTFld114
	*  Corresponding COBOL Variable is WS-14B-T-FLD1
	*  @param value
	**/
   public void setBTFld114(char[] value) {
      bTFld114 = checkBTFld114Constraints(value);
      serializeBTFld114(bTFld114);
   } 

     /**
	 * 	Update BTFld114 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld114(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld114,bTFld114.length);
   	
   }
   
   public void setBTFld114(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld114,bTFld114.length);
   	
   }
   
     /**
	 * 	Update BTFld114 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld114(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld114+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld114 with another Field
	 *	@param value
	 */
   public void setBTFld114(Field source) {
       replace(source,0,source.length(),beginBTFld114,B_TFLD_114_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld114 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld114(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld114,B_TFLD_114_LEN);
   	
   }
   
     /**
	 * 	Update BTFld114 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld114(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld114+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld214
	 *	@return bTFld214
	 */
   public char[] getBTFld214() throws CFException{
     if (isBTFld214Modified()) { 
        bTFld214 = refreshBTFld214();
     }
   		return bTFld214;
   }

  
	/**
	*  set variable bTFld214
	*  Corresponding COBOL Variable is WS-14B-T-FLD2
	*  @param value
	**/
   public void setBTFld214(char[] value) {
      bTFld214 = checkBTFld214Constraints(value);
      serializeBTFld214(bTFld214);
   } 

     /**
	 * 	Update BTFld214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld214,bTFld214.length);
   	
   }
   
   public void setBTFld214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld214,bTFld214.length);
   	
   }
   
     /**
	 * 	Update BTFld214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld214 with another Field
	 *	@param value
	 */
   public void setBTFld214(Field source) {
       replace(source,0,source.length(),beginBTFld214,B_TFLD_214_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld214,B_TFLD_214_LEN);
   	
   }
   
     /**
	 * 	Update BTFld214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld214+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld314
	 *	@return bTFld314
	 */
   public char[] getBTFld314() throws CFException{
     if (isBTFld314Modified()) { 
        bTFld314 = refreshBTFld314();
     }
   		return bTFld314;
   }

  
	/**
	*  set variable bTFld314
	*  Corresponding COBOL Variable is WS-14B-T-FLD3
	*  @param value
	**/
   public void setBTFld314(char[] value) {
      bTFld314 = checkBTFld314Constraints(value);
      serializeBTFld314(bTFld314);
   } 

     /**
	 * 	Update BTFld314 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld314(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld314,bTFld314.length);
   	
   }
   
   public void setBTFld314(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld314,bTFld314.length);
   	
   }
   
     /**
	 * 	Update BTFld314 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld314(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld314+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld314 with another Field
	 *	@param value
	 */
   public void setBTFld314(Field source) {
       replace(source,0,source.length(),beginBTFld314,B_TFLD_314_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld314 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld314(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld314,B_TFLD_314_LEN);
   	
   }
   
     /**
	 * 	Update BTFld314 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld314(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld314+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld114(CONSTANTS.SPACE_20);
         setBTFld214(CONSTANTS.SPACE_40);
         setBTFld314(CONSTANTS.SPACE_30);
   }

		public static int getBT14FieldLength() {
			return B_T_14_LENGTH;
		}

}
  
