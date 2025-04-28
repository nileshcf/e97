package com.cloudframe.app.refmod2.dto;

/**
*  The class BT214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT214 extends BT214Serialized { 
   

						private char[] bTFld1214 = Field.fillLowValue(20);

						private char[] bTFld2214 = Field.fillLowValue(40);

						private char[] bTFld3214 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT214
	**/
    public BT214() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT214. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT214(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1214
	 *	@return bTFld1214
	 */
   public char[] getBTFld1214() throws CFException{
     if (isBTFld1214Modified()) { 
        bTFld1214 = refreshBTFld1214();
     }
   		return bTFld1214;
   }

  
	/**
	*  set variable bTFld1214
	*  Corresponding COBOL Variable is WS-2-14B-T-FLD1
	*  @param value
	**/
   public void setBTFld1214(char[] value) {
      bTFld1214 = checkBTFld1214Constraints(value);
      serializeBTFld1214(bTFld1214);
   } 

     /**
	 * 	Update BTFld1214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1214,bTFld1214.length);
   	
   }
   
   public void setBTFld1214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1214,bTFld1214.length);
   	
   }
   
     /**
	 * 	Update BTFld1214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1214 with another Field
	 *	@param value
	 */
   public void setBTFld1214(Field source) {
       replace(source,0,source.length(),beginBTFld1214,B_TFLD_1214_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1214,B_TFLD_1214_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1214+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2214
	 *	@return bTFld2214
	 */
   public char[] getBTFld2214() throws CFException{
     if (isBTFld2214Modified()) { 
        bTFld2214 = refreshBTFld2214();
     }
   		return bTFld2214;
   }

  
	/**
	*  set variable bTFld2214
	*  Corresponding COBOL Variable is WS-2-14B-T-FLD2
	*  @param value
	**/
   public void setBTFld2214(char[] value) {
      bTFld2214 = checkBTFld2214Constraints(value);
      serializeBTFld2214(bTFld2214);
   } 

     /**
	 * 	Update BTFld2214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2214,bTFld2214.length);
   	
   }
   
   public void setBTFld2214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2214,bTFld2214.length);
   	
   }
   
     /**
	 * 	Update BTFld2214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2214 with another Field
	 *	@param value
	 */
   public void setBTFld2214(Field source) {
       replace(source,0,source.length(),beginBTFld2214,B_TFLD_2214_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2214,B_TFLD_2214_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2214+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3214
	 *	@return bTFld3214
	 */
   public char[] getBTFld3214() throws CFException{
     if (isBTFld3214Modified()) { 
        bTFld3214 = refreshBTFld3214();
     }
   		return bTFld3214;
   }

  
	/**
	*  set variable bTFld3214
	*  Corresponding COBOL Variable is WS-2-14B-T-FLD3
	*  @param value
	**/
   public void setBTFld3214(char[] value) {
      bTFld3214 = checkBTFld3214Constraints(value);
      serializeBTFld3214(bTFld3214);
   } 

     /**
	 * 	Update BTFld3214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3214,bTFld3214.length);
   	
   }
   
   public void setBTFld3214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3214,bTFld3214.length);
   	
   }
   
     /**
	 * 	Update BTFld3214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3214 with another Field
	 *	@param value
	 */
   public void setBTFld3214(Field source) {
       replace(source,0,source.length(),beginBTFld3214,B_TFLD_3214_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3214,B_TFLD_3214_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3214+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT214
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1214(CONSTANTS.SPACE_20);
         setBTFld2214(CONSTANTS.SPACE_40);
         setBTFld3214(CONSTANTS.SPACE_30);
   }

		public static int getBT214FieldLength() {
			return B_T_214_LENGTH;
		}

}
  
