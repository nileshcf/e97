package com.cloudframe.app.global.sharedvar;

/**
*  The class BT20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT20 extends BT20Serialized { 
   

						private char[] bTFld120 = Field.fillLowValue(20);

						private char[] bTFld220 = Field.fillLowValue(40);

						private char[] bTFld320 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT20
	**/
    public BT20() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT20. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT20(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld120
	 *	@return bTFld120
	 */
   public char[] getBTFld120() throws CFException{
     if (isBTFld120Modified()) { 
        bTFld120 = refreshBTFld120();
     }
   		return bTFld120;
   }

  
	/**
	*  set variable bTFld120
	*  Corresponding COBOL Variable is WS-20B-T-FLD1
	*  @param value
	**/
   public void setBTFld120(char[] value) {
      bTFld120 = checkBTFld120Constraints(value);
      serializeBTFld120(bTFld120);
   } 

     /**
	 * 	Update BTFld120 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld120(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld120,bTFld120.length);
   	
   }
   
   public void setBTFld120(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld120,bTFld120.length);
   	
   }
   
     /**
	 * 	Update BTFld120 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld120(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld120+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld120 with another Field
	 *	@param value
	 */
   public void setBTFld120(Field source) {
       replace(source,0,source.length(),beginBTFld120,B_TFLD_120_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld120 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld120(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld120,B_TFLD_120_LEN);
   	
   }
   
     /**
	 * 	Update BTFld120 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld120(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld120+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld220
	 *	@return bTFld220
	 */
   public char[] getBTFld220() throws CFException{
     if (isBTFld220Modified()) { 
        bTFld220 = refreshBTFld220();
     }
   		return bTFld220;
   }

  
	/**
	*  set variable bTFld220
	*  Corresponding COBOL Variable is WS-20B-T-FLD2
	*  @param value
	**/
   public void setBTFld220(char[] value) {
      bTFld220 = checkBTFld220Constraints(value);
      serializeBTFld220(bTFld220);
   } 

     /**
	 * 	Update BTFld220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld220,bTFld220.length);
   	
   }
   
   public void setBTFld220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld220,bTFld220.length);
   	
   }
   
     /**
	 * 	Update BTFld220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld220 with another Field
	 *	@param value
	 */
   public void setBTFld220(Field source) {
       replace(source,0,source.length(),beginBTFld220,B_TFLD_220_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld220,B_TFLD_220_LEN);
   	
   }
   
     /**
	 * 	Update BTFld220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld220+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld320
	 *	@return bTFld320
	 */
   public char[] getBTFld320() throws CFException{
     if (isBTFld320Modified()) { 
        bTFld320 = refreshBTFld320();
     }
   		return bTFld320;
   }

  
	/**
	*  set variable bTFld320
	*  Corresponding COBOL Variable is WS-20B-T-FLD3
	*  @param value
	**/
   public void setBTFld320(char[] value) {
      bTFld320 = checkBTFld320Constraints(value);
      serializeBTFld320(bTFld320);
   } 

     /**
	 * 	Update BTFld320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld320,bTFld320.length);
   	
   }
   
   public void setBTFld320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld320,bTFld320.length);
   	
   }
   
     /**
	 * 	Update BTFld320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld320 with another Field
	 *	@param value
	 */
   public void setBTFld320(Field source) {
       replace(source,0,source.length(),beginBTFld320,B_TFLD_320_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld320,B_TFLD_320_LEN);
   	
   }
   
     /**
	 * 	Update BTFld320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld320+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT20
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld120(CONSTANTS.SPACE_20);
         setBTFld220(CONSTANTS.SPACE_40);
         setBTFld320(CONSTANTS.SPACE_30);
   }

		public static int getBT20FieldLength() {
			return B_T_20_LENGTH;
		}

}
  
