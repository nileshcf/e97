package com.cloudframe.app.refmod1.dto;

/**
*  The class BT4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT4 extends BT4Serialized { 
   

						private char[] bTFld14 = Field.fillLowValue(20);

						private char[] bTFld24 = Field.fillLowValue(40);

						private char[] bTFld34 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT4
	**/
    public BT4() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld14
	 *	@return bTFld14
	 */
   public char[] getBTFld14() throws CFException{
     if (isBTFld14Modified()) { 
        bTFld14 = refreshBTFld14();
     }
   		return bTFld14;
   }

  
	/**
	*  set variable bTFld14
	*  Corresponding COBOL Variable is WS-4B-T-FLD1
	*  @param value
	**/
   public void setBTFld14(char[] value) {
      bTFld14 = checkBTFld14Constraints(value);
      serializeBTFld14(bTFld14);
   } 

     /**
	 * 	Update BTFld14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld14,bTFld14.length);
   	
   }
   
   public void setBTFld14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld14,bTFld14.length);
   	
   }
   
     /**
	 * 	Update BTFld14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld14 with another Field
	 *	@param value
	 */
   public void setBTFld14(Field source) {
       replace(source,0,source.length(),beginBTFld14,B_TFLD_14_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld14,B_TFLD_14_LEN);
   	
   }
   
     /**
	 * 	Update BTFld14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld24
	 *	@return bTFld24
	 */
   public char[] getBTFld24() throws CFException{
     if (isBTFld24Modified()) { 
        bTFld24 = refreshBTFld24();
     }
   		return bTFld24;
   }

  
	/**
	*  set variable bTFld24
	*  Corresponding COBOL Variable is WS-4B-T-FLD2
	*  @param value
	**/
   public void setBTFld24(char[] value) {
      bTFld24 = checkBTFld24Constraints(value);
      serializeBTFld24(bTFld24);
   } 

     /**
	 * 	Update BTFld24 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld24(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld24,bTFld24.length);
   	
   }
   
   public void setBTFld24(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld24,bTFld24.length);
   	
   }
   
     /**
	 * 	Update BTFld24 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld24(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld24+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld24 with another Field
	 *	@param value
	 */
   public void setBTFld24(Field source) {
       replace(source,0,source.length(),beginBTFld24,B_TFLD_24_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld24 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld24(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld24,B_TFLD_24_LEN);
   	
   }
   
     /**
	 * 	Update BTFld24 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld24(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld24+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld34
	 *	@return bTFld34
	 */
   public char[] getBTFld34() throws CFException{
     if (isBTFld34Modified()) { 
        bTFld34 = refreshBTFld34();
     }
   		return bTFld34;
   }

  
	/**
	*  set variable bTFld34
	*  Corresponding COBOL Variable is WS-4B-T-FLD3
	*  @param value
	**/
   public void setBTFld34(char[] value) {
      bTFld34 = checkBTFld34Constraints(value);
      serializeBTFld34(bTFld34);
   } 

     /**
	 * 	Update BTFld34 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld34(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld34,bTFld34.length);
   	
   }
   
   public void setBTFld34(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld34,bTFld34.length);
   	
   }
   
     /**
	 * 	Update BTFld34 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld34(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld34+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld34 with another Field
	 *	@param value
	 */
   public void setBTFld34(Field source) {
       replace(source,0,source.length(),beginBTFld34,B_TFLD_34_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld34 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld34(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld34,B_TFLD_34_LEN);
   	
   }
   
     /**
	 * 	Update BTFld34 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld34(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld34+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT4
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld14(CONSTANTS.SPACE_20);
         setBTFld24(CONSTANTS.SPACE_40);
         setBTFld34(CONSTANTS.SPACE_30);
   }

		public static int getBT4FieldLength() {
			return B_T_4_LENGTH;
		}

}
  
