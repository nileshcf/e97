package com.cloudframe.app.refmod2.dto;

/**
*  The class BT218 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT218 extends BT218Serialized { 
   

						private char[] bTFld1218 = Field.fillLowValue(20);

						private char[] bTFld2218 = Field.fillLowValue(40);

						private char[] bTFld3218 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT218
	**/
    public BT218() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT218. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT218(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1218
	 *	@return bTFld1218
	 */
   public char[] getBTFld1218() throws CFException{
     if (isBTFld1218Modified()) { 
        bTFld1218 = refreshBTFld1218();
     }
   		return bTFld1218;
   }

  
	/**
	*  set variable bTFld1218
	*  Corresponding COBOL Variable is WS-2-18B-T-FLD1
	*  @param value
	**/
   public void setBTFld1218(char[] value) {
      bTFld1218 = checkBTFld1218Constraints(value);
      serializeBTFld1218(bTFld1218);
   } 

     /**
	 * 	Update BTFld1218 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1218(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1218,bTFld1218.length);
   	
   }
   
   public void setBTFld1218(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1218,bTFld1218.length);
   	
   }
   
     /**
	 * 	Update BTFld1218 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1218+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1218 with another Field
	 *	@param value
	 */
   public void setBTFld1218(Field source) {
       replace(source,0,source.length(),beginBTFld1218,B_TFLD_1218_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1218 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1218(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1218,B_TFLD_1218_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1218+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2218
	 *	@return bTFld2218
	 */
   public char[] getBTFld2218() throws CFException{
     if (isBTFld2218Modified()) { 
        bTFld2218 = refreshBTFld2218();
     }
   		return bTFld2218;
   }

  
	/**
	*  set variable bTFld2218
	*  Corresponding COBOL Variable is WS-2-18B-T-FLD2
	*  @param value
	**/
   public void setBTFld2218(char[] value) {
      bTFld2218 = checkBTFld2218Constraints(value);
      serializeBTFld2218(bTFld2218);
   } 

     /**
	 * 	Update BTFld2218 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2218(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2218,bTFld2218.length);
   	
   }
   
   public void setBTFld2218(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2218,bTFld2218.length);
   	
   }
   
     /**
	 * 	Update BTFld2218 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2218+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2218 with another Field
	 *	@param value
	 */
   public void setBTFld2218(Field source) {
       replace(source,0,source.length(),beginBTFld2218,B_TFLD_2218_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2218 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2218(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2218,B_TFLD_2218_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2218+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3218
	 *	@return bTFld3218
	 */
   public char[] getBTFld3218() throws CFException{
     if (isBTFld3218Modified()) { 
        bTFld3218 = refreshBTFld3218();
     }
   		return bTFld3218;
   }

  
	/**
	*  set variable bTFld3218
	*  Corresponding COBOL Variable is WS-2-18B-T-FLD3
	*  @param value
	**/
   public void setBTFld3218(char[] value) {
      bTFld3218 = checkBTFld3218Constraints(value);
      serializeBTFld3218(bTFld3218);
   } 

     /**
	 * 	Update BTFld3218 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3218(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3218,bTFld3218.length);
   	
   }
   
   public void setBTFld3218(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3218,bTFld3218.length);
   	
   }
   
     /**
	 * 	Update BTFld3218 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3218+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3218 with another Field
	 *	@param value
	 */
   public void setBTFld3218(Field source) {
       replace(source,0,source.length(),beginBTFld3218,B_TFLD_3218_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3218 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3218(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3218,B_TFLD_3218_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3218+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT218
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1218(CONSTANTS.SPACE_20);
         setBTFld2218(CONSTANTS.SPACE_40);
         setBTFld3218(CONSTANTS.SPACE_30);
   }

		public static int getBT218FieldLength() {
			return B_T_218_LENGTH;
		}

}
  
