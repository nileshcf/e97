package com.cloudframe.app.refmod1.dto;

/**
*  The class BT3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT3 extends BT3Serialized { 
   

						private char[] bTFld13 = Field.fillLowValue(20);

						private char[] bTFld23 = Field.fillLowValue(40);

						private char[] bTFld33 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT3
	**/
    public BT3() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld13
	 *	@return bTFld13
	 */
   public char[] getBTFld13() throws CFException{
     if (isBTFld13Modified()) { 
        bTFld13 = refreshBTFld13();
     }
   		return bTFld13;
   }

  
	/**
	*  set variable bTFld13
	*  Corresponding COBOL Variable is WS-3B-T-FLD1
	*  @param value
	**/
   public void setBTFld13(char[] value) {
      bTFld13 = checkBTFld13Constraints(value);
      serializeBTFld13(bTFld13);
   } 

     /**
	 * 	Update BTFld13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld13,bTFld13.length);
   	
   }
   
   public void setBTFld13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld13,bTFld13.length);
   	
   }
   
     /**
	 * 	Update BTFld13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld13 with another Field
	 *	@param value
	 */
   public void setBTFld13(Field source) {
       replace(source,0,source.length(),beginBTFld13,B_TFLD_13_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld13,B_TFLD_13_LEN);
   	
   }
   
     /**
	 * 	Update BTFld13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld23
	 *	@return bTFld23
	 */
   public char[] getBTFld23() throws CFException{
     if (isBTFld23Modified()) { 
        bTFld23 = refreshBTFld23();
     }
   		return bTFld23;
   }

  
	/**
	*  set variable bTFld23
	*  Corresponding COBOL Variable is WS-3B-T-FLD2
	*  @param value
	**/
   public void setBTFld23(char[] value) {
      bTFld23 = checkBTFld23Constraints(value);
      serializeBTFld23(bTFld23);
   } 

     /**
	 * 	Update BTFld23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld23,bTFld23.length);
   	
   }
   
   public void setBTFld23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld23,bTFld23.length);
   	
   }
   
     /**
	 * 	Update BTFld23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld23 with another Field
	 *	@param value
	 */
   public void setBTFld23(Field source) {
       replace(source,0,source.length(),beginBTFld23,B_TFLD_23_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld23,B_TFLD_23_LEN);
   	
   }
   
     /**
	 * 	Update BTFld23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld23+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld33
	 *	@return bTFld33
	 */
   public char[] getBTFld33() throws CFException{
     if (isBTFld33Modified()) { 
        bTFld33 = refreshBTFld33();
     }
   		return bTFld33;
   }

  
	/**
	*  set variable bTFld33
	*  Corresponding COBOL Variable is WS-3B-T-FLD3
	*  @param value
	**/
   public void setBTFld33(char[] value) {
      bTFld33 = checkBTFld33Constraints(value);
      serializeBTFld33(bTFld33);
   } 

     /**
	 * 	Update BTFld33 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld33(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld33,bTFld33.length);
   	
   }
   
   public void setBTFld33(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld33,bTFld33.length);
   	
   }
   
     /**
	 * 	Update BTFld33 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld33(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld33+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld33 with another Field
	 *	@param value
	 */
   public void setBTFld33(Field source) {
       replace(source,0,source.length(),beginBTFld33,B_TFLD_33_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld33 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld33(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld33,B_TFLD_33_LEN);
   	
   }
   
     /**
	 * 	Update BTFld33 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld33(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld33+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld13(CONSTANTS.SPACE_20);
         setBTFld23(CONSTANTS.SPACE_40);
         setBTFld33(CONSTANTS.SPACE_30);
   }

		public static int getBT3FieldLength() {
			return B_T_3_LENGTH;
		}

}
  
