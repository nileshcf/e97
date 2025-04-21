package com.cloudframe.app.refmod2.dto;

/**
*  The class BT219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT219 extends BT219Serialized { 
   

						private char[] bTFld1219 = Field.fillLowValue(20);

						private char[] bTFld2219 = Field.fillLowValue(40);

						private char[] bTFld3219 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT219
	**/
    public BT219() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT219. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT219(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1219
	 *	@return bTFld1219
	 */
   public char[] getBTFld1219() throws CFException{
     if (isBTFld1219Modified()) { 
        bTFld1219 = refreshBTFld1219();
     }
   		return bTFld1219;
   }

  
	/**
	*  set variable bTFld1219
	*  Corresponding COBOL Variable is WS-2-19B-T-FLD1
	*  @param value
	**/
   public void setBTFld1219(char[] value) {
      bTFld1219 = checkBTFld1219Constraints(value);
      serializeBTFld1219(bTFld1219);
   } 

     /**
	 * 	Update BTFld1219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1219,bTFld1219.length);
   	
   }
   
   public void setBTFld1219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1219,bTFld1219.length);
   	
   }
   
     /**
	 * 	Update BTFld1219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1219 with another Field
	 *	@param value
	 */
   public void setBTFld1219(Field source) {
       replace(source,0,source.length(),beginBTFld1219,B_TFLD_1219_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1219,B_TFLD_1219_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1219+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2219
	 *	@return bTFld2219
	 */
   public char[] getBTFld2219() throws CFException{
     if (isBTFld2219Modified()) { 
        bTFld2219 = refreshBTFld2219();
     }
   		return bTFld2219;
   }

  
	/**
	*  set variable bTFld2219
	*  Corresponding COBOL Variable is WS-2-19B-T-FLD2
	*  @param value
	**/
   public void setBTFld2219(char[] value) {
      bTFld2219 = checkBTFld2219Constraints(value);
      serializeBTFld2219(bTFld2219);
   } 

     /**
	 * 	Update BTFld2219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2219,bTFld2219.length);
   	
   }
   
   public void setBTFld2219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2219,bTFld2219.length);
   	
   }
   
     /**
	 * 	Update BTFld2219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2219 with another Field
	 *	@param value
	 */
   public void setBTFld2219(Field source) {
       replace(source,0,source.length(),beginBTFld2219,B_TFLD_2219_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2219,B_TFLD_2219_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2219+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3219
	 *	@return bTFld3219
	 */
   public char[] getBTFld3219() throws CFException{
     if (isBTFld3219Modified()) { 
        bTFld3219 = refreshBTFld3219();
     }
   		return bTFld3219;
   }

  
	/**
	*  set variable bTFld3219
	*  Corresponding COBOL Variable is WS-2-19B-T-FLD3
	*  @param value
	**/
   public void setBTFld3219(char[] value) {
      bTFld3219 = checkBTFld3219Constraints(value);
      serializeBTFld3219(bTFld3219);
   } 

     /**
	 * 	Update BTFld3219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3219,bTFld3219.length);
   	
   }
   
   public void setBTFld3219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3219,bTFld3219.length);
   	
   }
   
     /**
	 * 	Update BTFld3219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3219 with another Field
	 *	@param value
	 */
   public void setBTFld3219(Field source) {
       replace(source,0,source.length(),beginBTFld3219,B_TFLD_3219_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3219,B_TFLD_3219_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3219+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT219
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1219(CONSTANTS.SPACE_20);
         setBTFld2219(CONSTANTS.SPACE_40);
         setBTFld3219(CONSTANTS.SPACE_30);
   }

		public static int getBT219FieldLength() {
			return B_T_219_LENGTH;
		}

}
  
