package com.cloudframe.app.refmod1.dto;

/**
*  The class BT2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT2 extends BT2Serialized { 
   

						private char[] bTFld12 = Field.fillLowValue(20);

						private char[] bTFld22 = Field.fillLowValue(40);

						private char[] bTFld32 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT2
	**/
    public BT2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld12
	 *	@return bTFld12
	 */
   public char[] getBTFld12() throws CFException{
     if (isBTFld12Modified()) { 
        bTFld12 = refreshBTFld12();
     }
   		return bTFld12;
   }

  
	/**
	*  set variable bTFld12
	*  Corresponding COBOL Variable is WS-2B-T-FLD1
	*  @param value
	**/
   public void setBTFld12(char[] value) {
      bTFld12 = checkBTFld12Constraints(value);
      serializeBTFld12(bTFld12);
   } 

     /**
	 * 	Update BTFld12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld12,bTFld12.length);
   	
   }
   
   public void setBTFld12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld12,bTFld12.length);
   	
   }
   
     /**
	 * 	Update BTFld12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld12 with another Field
	 *	@param value
	 */
   public void setBTFld12(Field source) {
       replace(source,0,source.length(),beginBTFld12,B_TFLD_12_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld12,B_TFLD_12_LEN);
   	
   }
   
     /**
	 * 	Update BTFld12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld22
	 *	@return bTFld22
	 */
   public char[] getBTFld22() throws CFException{
     if (isBTFld22Modified()) { 
        bTFld22 = refreshBTFld22();
     }
   		return bTFld22;
   }

  
	/**
	*  set variable bTFld22
	*  Corresponding COBOL Variable is WS-2B-T-FLD2
	*  @param value
	**/
   public void setBTFld22(char[] value) {
      bTFld22 = checkBTFld22Constraints(value);
      serializeBTFld22(bTFld22);
   } 

     /**
	 * 	Update BTFld22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld22,bTFld22.length);
   	
   }
   
   public void setBTFld22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld22,bTFld22.length);
   	
   }
   
     /**
	 * 	Update BTFld22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld22 with another Field
	 *	@param value
	 */
   public void setBTFld22(Field source) {
       replace(source,0,source.length(),beginBTFld22,B_TFLD_22_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld22,B_TFLD_22_LEN);
   	
   }
   
     /**
	 * 	Update BTFld22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld22+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld32
	 *	@return bTFld32
	 */
   public char[] getBTFld32() throws CFException{
     if (isBTFld32Modified()) { 
        bTFld32 = refreshBTFld32();
     }
   		return bTFld32;
   }

  
	/**
	*  set variable bTFld32
	*  Corresponding COBOL Variable is WS-2B-T-FLD3
	*  @param value
	**/
   public void setBTFld32(char[] value) {
      bTFld32 = checkBTFld32Constraints(value);
      serializeBTFld32(bTFld32);
   } 

     /**
	 * 	Update BTFld32 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld32(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld32,bTFld32.length);
   	
   }
   
   public void setBTFld32(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld32,bTFld32.length);
   	
   }
   
     /**
	 * 	Update BTFld32 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld32(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld32+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld32 with another Field
	 *	@param value
	 */
   public void setBTFld32(Field source) {
       replace(source,0,source.length(),beginBTFld32,B_TFLD_32_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld32 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld32(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld32,B_TFLD_32_LEN);
   	
   }
   
     /**
	 * 	Update BTFld32 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld32(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld32+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld12(CONSTANTS.SPACE_20);
         setBTFld22(CONSTANTS.SPACE_40);
         setBTFld32(CONSTANTS.SPACE_30);
   }

		public static int getBT2FieldLength() {
			return B_T_2_LENGTH;
		}

}
  
