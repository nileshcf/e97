package com.cloudframe.app.refmod1.dto;

/**
*  The class BT1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT1 extends BT1Serialized { 
   

						private char[] bTFld11 = Field.fillLowValue(20);

						private char[] bTFld21 = Field.fillLowValue(40);

						private char[] bTFld31 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT1
	**/
    public BT1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld11
	 *	@return bTFld11
	 */
   public char[] getBTFld11() throws CFException{
     if (isBTFld11Modified()) { 
        bTFld11 = refreshBTFld11();
     }
   		return bTFld11;
   }

  
	/**
	*  set variable bTFld11
	*  Corresponding COBOL Variable is WS-1B-T-FLD1
	*  @param value
	**/
   public void setBTFld11(char[] value) {
      bTFld11 = checkBTFld11Constraints(value);
      serializeBTFld11(bTFld11);
   } 

     /**
	 * 	Update BTFld11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld11,bTFld11.length);
   	
   }
   
   public void setBTFld11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld11,bTFld11.length);
   	
   }
   
     /**
	 * 	Update BTFld11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld11 with another Field
	 *	@param value
	 */
   public void setBTFld11(Field source) {
       replace(source,0,source.length(),beginBTFld11,B_TFLD_11_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld11,B_TFLD_11_LEN);
   	
   }
   
     /**
	 * 	Update BTFld11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld21
	 *	@return bTFld21
	 */
   public char[] getBTFld21() throws CFException{
     if (isBTFld21Modified()) { 
        bTFld21 = refreshBTFld21();
     }
   		return bTFld21;
   }

  
	/**
	*  set variable bTFld21
	*  Corresponding COBOL Variable is WS-1B-T-FLD2
	*  @param value
	**/
   public void setBTFld21(char[] value) {
      bTFld21 = checkBTFld21Constraints(value);
      serializeBTFld21(bTFld21);
   } 

     /**
	 * 	Update BTFld21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld21,bTFld21.length);
   	
   }
   
   public void setBTFld21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld21,bTFld21.length);
   	
   }
   
     /**
	 * 	Update BTFld21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld21 with another Field
	 *	@param value
	 */
   public void setBTFld21(Field source) {
       replace(source,0,source.length(),beginBTFld21,B_TFLD_21_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld21,B_TFLD_21_LEN);
   	
   }
   
     /**
	 * 	Update BTFld21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld21+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld31
	 *	@return bTFld31
	 */
   public char[] getBTFld31() throws CFException{
     if (isBTFld31Modified()) { 
        bTFld31 = refreshBTFld31();
     }
   		return bTFld31;
   }

  
	/**
	*  set variable bTFld31
	*  Corresponding COBOL Variable is WS-1B-T-FLD3
	*  @param value
	**/
   public void setBTFld31(char[] value) {
      bTFld31 = checkBTFld31Constraints(value);
      serializeBTFld31(bTFld31);
   } 

     /**
	 * 	Update BTFld31 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld31(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld31,bTFld31.length);
   	
   }
   
   public void setBTFld31(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld31,bTFld31.length);
   	
   }
   
     /**
	 * 	Update BTFld31 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld31(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld31+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld31 with another Field
	 *	@param value
	 */
   public void setBTFld31(Field source) {
       replace(source,0,source.length(),beginBTFld31,B_TFLD_31_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld31 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld31(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld31,B_TFLD_31_LEN);
   	
   }
   
     /**
	 * 	Update BTFld31 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld31(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld31+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld11(CONSTANTS.SPACE_20);
         setBTFld21(CONSTANTS.SPACE_40);
         setBTFld31(CONSTANTS.SPACE_30);
   }

		public static int getBT1FieldLength() {
			return B_T_1_LENGTH;
		}

}
  
