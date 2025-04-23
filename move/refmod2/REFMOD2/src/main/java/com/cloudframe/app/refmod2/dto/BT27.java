package com.cloudframe.app.refmod2.dto;

/**
*  The class BT27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT27 extends BT27Serialized { 
   

						private char[] bTFld127 = Field.fillLowValue(20);

						private char[] bTFld227 = Field.fillLowValue(40);

						private char[] bTFld327 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT27
	**/
    public BT27() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT27. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT27(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld127
	 *	@return bTFld127
	 */
   public char[] getBTFld127() throws CFException{
     if (isBTFld127Modified()) { 
        bTFld127 = refreshBTFld127();
     }
   		return bTFld127;
   }

  
	/**
	*  set variable bTFld127
	*  Corresponding COBOL Variable is WS-2-7B-T-FLD1
	*  @param value
	**/
   public void setBTFld127(char[] value) {
      bTFld127 = checkBTFld127Constraints(value);
      serializeBTFld127(bTFld127);
   } 

     /**
	 * 	Update BTFld127 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld127(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld127,bTFld127.length);
   	
   }
   
   public void setBTFld127(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld127,bTFld127.length);
   	
   }
   
     /**
	 * 	Update BTFld127 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld127(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld127+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld127 with another Field
	 *	@param value
	 */
   public void setBTFld127(Field source) {
       replace(source,0,source.length(),beginBTFld127,B_TFLD_127_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld127 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld127(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld127,B_TFLD_127_LEN);
   	
   }
   
     /**
	 * 	Update BTFld127 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld127(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld127+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld227
	 *	@return bTFld227
	 */
   public char[] getBTFld227() throws CFException{
     if (isBTFld227Modified()) { 
        bTFld227 = refreshBTFld227();
     }
   		return bTFld227;
   }

  
	/**
	*  set variable bTFld227
	*  Corresponding COBOL Variable is WS-2-7B-T-FLD2
	*  @param value
	**/
   public void setBTFld227(char[] value) {
      bTFld227 = checkBTFld227Constraints(value);
      serializeBTFld227(bTFld227);
   } 

     /**
	 * 	Update BTFld227 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld227(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld227,bTFld227.length);
   	
   }
   
   public void setBTFld227(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld227,bTFld227.length);
   	
   }
   
     /**
	 * 	Update BTFld227 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld227(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld227+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld227 with another Field
	 *	@param value
	 */
   public void setBTFld227(Field source) {
       replace(source,0,source.length(),beginBTFld227,B_TFLD_227_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld227 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld227(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld227,B_TFLD_227_LEN);
   	
   }
   
     /**
	 * 	Update BTFld227 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld227(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld227+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld327
	 *	@return bTFld327
	 */
   public char[] getBTFld327() throws CFException{
     if (isBTFld327Modified()) { 
        bTFld327 = refreshBTFld327();
     }
   		return bTFld327;
   }

  
	/**
	*  set variable bTFld327
	*  Corresponding COBOL Variable is WS-2-7B-T-FLD3
	*  @param value
	**/
   public void setBTFld327(char[] value) {
      bTFld327 = checkBTFld327Constraints(value);
      serializeBTFld327(bTFld327);
   } 

     /**
	 * 	Update BTFld327 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld327(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld327,bTFld327.length);
   	
   }
   
   public void setBTFld327(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld327,bTFld327.length);
   	
   }
   
     /**
	 * 	Update BTFld327 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld327(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld327+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld327 with another Field
	 *	@param value
	 */
   public void setBTFld327(Field source) {
       replace(source,0,source.length(),beginBTFld327,B_TFLD_327_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld327 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld327(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld327,B_TFLD_327_LEN);
   	
   }
   
     /**
	 * 	Update BTFld327 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld327(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld327+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT27
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld127(CONSTANTS.SPACE_20);
         setBTFld227(CONSTANTS.SPACE_40);
         setBTFld327(CONSTANTS.SPACE_30);
   }

		public static int getBT27FieldLength() {
			return B_T_27_LENGTH;
		}

}
  
