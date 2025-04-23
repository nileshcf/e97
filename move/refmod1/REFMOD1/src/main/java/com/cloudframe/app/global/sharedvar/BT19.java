package com.cloudframe.app.global.sharedvar;

/**
*  The class BT19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT19 extends BT19Serialized { 
   

						private char[] bTFld119 = Field.fillLowValue(20);

						private char[] bTFld219 = Field.fillLowValue(40);

						private char[] bTFld319 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT19
	**/
    public BT19() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT19. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT19(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld119
	 *	@return bTFld119
	 */
   public char[] getBTFld119() throws CFException{
     if (isBTFld119Modified()) { 
        bTFld119 = refreshBTFld119();
     }
   		return bTFld119;
   }

  
	/**
	*  set variable bTFld119
	*  Corresponding COBOL Variable is WS-19B-T-FLD1
	*  @param value
	**/
   public void setBTFld119(char[] value) {
      bTFld119 = checkBTFld119Constraints(value);
      serializeBTFld119(bTFld119);
   } 

     /**
	 * 	Update BTFld119 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld119(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld119,bTFld119.length);
   	
   }
   
   public void setBTFld119(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld119,bTFld119.length);
   	
   }
   
     /**
	 * 	Update BTFld119 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld119(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld119+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld119 with another Field
	 *	@param value
	 */
   public void setBTFld119(Field source) {
       replace(source,0,source.length(),beginBTFld119,B_TFLD_119_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld119 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld119(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld119,B_TFLD_119_LEN);
   	
   }
   
     /**
	 * 	Update BTFld119 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld119(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld119+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld219
	 *	@return bTFld219
	 */
   public char[] getBTFld219() throws CFException{
     if (isBTFld219Modified()) { 
        bTFld219 = refreshBTFld219();
     }
   		return bTFld219;
   }

  
	/**
	*  set variable bTFld219
	*  Corresponding COBOL Variable is WS-19B-T-FLD2
	*  @param value
	**/
   public void setBTFld219(char[] value) {
      bTFld219 = checkBTFld219Constraints(value);
      serializeBTFld219(bTFld219);
   } 

     /**
	 * 	Update BTFld219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld219,bTFld219.length);
   	
   }
   
   public void setBTFld219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld219,bTFld219.length);
   	
   }
   
     /**
	 * 	Update BTFld219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld219 with another Field
	 *	@param value
	 */
   public void setBTFld219(Field source) {
       replace(source,0,source.length(),beginBTFld219,B_TFLD_219_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld219,B_TFLD_219_LEN);
   	
   }
   
     /**
	 * 	Update BTFld219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld219+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld319
	 *	@return bTFld319
	 */
   public char[] getBTFld319() throws CFException{
     if (isBTFld319Modified()) { 
        bTFld319 = refreshBTFld319();
     }
   		return bTFld319;
   }

  
	/**
	*  set variable bTFld319
	*  Corresponding COBOL Variable is WS-19B-T-FLD3
	*  @param value
	**/
   public void setBTFld319(char[] value) {
      bTFld319 = checkBTFld319Constraints(value);
      serializeBTFld319(bTFld319);
   } 

     /**
	 * 	Update BTFld319 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld319(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld319,bTFld319.length);
   	
   }
   
   public void setBTFld319(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld319,bTFld319.length);
   	
   }
   
     /**
	 * 	Update BTFld319 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld319(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld319+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld319 with another Field
	 *	@param value
	 */
   public void setBTFld319(Field source) {
       replace(source,0,source.length(),beginBTFld319,B_TFLD_319_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld319 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld319(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld319,B_TFLD_319_LEN);
   	
   }
   
     /**
	 * 	Update BTFld319 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld319(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld319+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld119(CONSTANTS.SPACE_20);
         setBTFld219(CONSTANTS.SPACE_40);
         setBTFld319(CONSTANTS.SPACE_30);
   }

		public static int getBT19FieldLength() {
			return B_T_19_LENGTH;
		}

}
  
