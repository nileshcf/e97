package com.cloudframe.app.refmod2.dto;

/**
*  The class BT212 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT212 extends BT212Serialized { 
   

						private char[] bTFld1212 = Field.fillLowValue(20);

						private char[] bTFld2212 = Field.fillLowValue(40);

						private char[] bTFld3212 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT212
	**/
    public BT212() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT212. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT212(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1212
	 *	@return bTFld1212
	 */
   public char[] getBTFld1212() throws CFException{
     if (isBTFld1212Modified()) { 
        bTFld1212 = refreshBTFld1212();
     }
   		return bTFld1212;
   }

  
	/**
	*  set variable bTFld1212
	*  Corresponding COBOL Variable is WS-2-12B-T-FLD1
	*  @param value
	**/
   public void setBTFld1212(char[] value) {
      bTFld1212 = checkBTFld1212Constraints(value);
      serializeBTFld1212(bTFld1212);
   } 

     /**
	 * 	Update BTFld1212 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1212(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1212,bTFld1212.length);
   	
   }
   
   public void setBTFld1212(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1212,bTFld1212.length);
   	
   }
   
     /**
	 * 	Update BTFld1212 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1212+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1212 with another Field
	 *	@param value
	 */
   public void setBTFld1212(Field source) {
       replace(source,0,source.length(),beginBTFld1212,B_TFLD_1212_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1212 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1212(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1212,B_TFLD_1212_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1212+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2212
	 *	@return bTFld2212
	 */
   public char[] getBTFld2212() throws CFException{
     if (isBTFld2212Modified()) { 
        bTFld2212 = refreshBTFld2212();
     }
   		return bTFld2212;
   }

  
	/**
	*  set variable bTFld2212
	*  Corresponding COBOL Variable is WS-2-12B-T-FLD2
	*  @param value
	**/
   public void setBTFld2212(char[] value) {
      bTFld2212 = checkBTFld2212Constraints(value);
      serializeBTFld2212(bTFld2212);
   } 

     /**
	 * 	Update BTFld2212 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2212(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2212,bTFld2212.length);
   	
   }
   
   public void setBTFld2212(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2212,bTFld2212.length);
   	
   }
   
     /**
	 * 	Update BTFld2212 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2212+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2212 with another Field
	 *	@param value
	 */
   public void setBTFld2212(Field source) {
       replace(source,0,source.length(),beginBTFld2212,B_TFLD_2212_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2212 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2212(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2212,B_TFLD_2212_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2212+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3212
	 *	@return bTFld3212
	 */
   public char[] getBTFld3212() throws CFException{
     if (isBTFld3212Modified()) { 
        bTFld3212 = refreshBTFld3212();
     }
   		return bTFld3212;
   }

  
	/**
	*  set variable bTFld3212
	*  Corresponding COBOL Variable is WS-2-12B-T-FLD3
	*  @param value
	**/
   public void setBTFld3212(char[] value) {
      bTFld3212 = checkBTFld3212Constraints(value);
      serializeBTFld3212(bTFld3212);
   } 

     /**
	 * 	Update BTFld3212 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3212(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3212,bTFld3212.length);
   	
   }
   
   public void setBTFld3212(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3212,bTFld3212.length);
   	
   }
   
     /**
	 * 	Update BTFld3212 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3212+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3212 with another Field
	 *	@param value
	 */
   public void setBTFld3212(Field source) {
       replace(source,0,source.length(),beginBTFld3212,B_TFLD_3212_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3212 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3212(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3212,B_TFLD_3212_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3212+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT212
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1212(CONSTANTS.SPACE_20);
         setBTFld2212(CONSTANTS.SPACE_40);
         setBTFld3212(CONSTANTS.SPACE_30);
   }

		public static int getBT212FieldLength() {
			return B_T_212_LENGTH;
		}

}
  
