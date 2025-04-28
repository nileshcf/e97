package com.cloudframe.app.global.sharedvar;

/**
*  The class BT5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT5 extends BT5Serialized { 
   

						private char[] bTFld15 = Field.fillLowValue(20);

						private char[] bTFld25 = Field.fillLowValue(40);

						private char[] bTFld35 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT5
	**/
    public BT5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld15
	 *	@return bTFld15
	 */
   public char[] getBTFld15() throws CFException{
     if (isBTFld15Modified()) { 
        bTFld15 = refreshBTFld15();
     }
   		return bTFld15;
   }

  
	/**
	*  set variable bTFld15
	*  Corresponding COBOL Variable is WS-5B-T-FLD1
	*  @param value
	**/
   public void setBTFld15(char[] value) {
      bTFld15 = checkBTFld15Constraints(value);
      serializeBTFld15(bTFld15);
   } 

     /**
	 * 	Update BTFld15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld15,bTFld15.length);
   	
   }
   
   public void setBTFld15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld15,bTFld15.length);
   	
   }
   
     /**
	 * 	Update BTFld15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld15 with another Field
	 *	@param value
	 */
   public void setBTFld15(Field source) {
       replace(source,0,source.length(),beginBTFld15,B_TFLD_15_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld15,B_TFLD_15_LEN);
   	
   }
   
     /**
	 * 	Update BTFld15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld25
	 *	@return bTFld25
	 */
   public char[] getBTFld25() throws CFException{
     if (isBTFld25Modified()) { 
        bTFld25 = refreshBTFld25();
     }
   		return bTFld25;
   }

  
	/**
	*  set variable bTFld25
	*  Corresponding COBOL Variable is WS-5B-T-FLD2
	*  @param value
	**/
   public void setBTFld25(char[] value) {
      bTFld25 = checkBTFld25Constraints(value);
      serializeBTFld25(bTFld25);
   } 

     /**
	 * 	Update BTFld25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld25,bTFld25.length);
   	
   }
   
   public void setBTFld25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld25,bTFld25.length);
   	
   }
   
     /**
	 * 	Update BTFld25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld25 with another Field
	 *	@param value
	 */
   public void setBTFld25(Field source) {
       replace(source,0,source.length(),beginBTFld25,B_TFLD_25_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld25,B_TFLD_25_LEN);
   	
   }
   
     /**
	 * 	Update BTFld25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld25+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld35
	 *	@return bTFld35
	 */
   public char[] getBTFld35() throws CFException{
     if (isBTFld35Modified()) { 
        bTFld35 = refreshBTFld35();
     }
   		return bTFld35;
   }

  
	/**
	*  set variable bTFld35
	*  Corresponding COBOL Variable is WS-5B-T-FLD3
	*  @param value
	**/
   public void setBTFld35(char[] value) {
      bTFld35 = checkBTFld35Constraints(value);
      serializeBTFld35(bTFld35);
   } 

     /**
	 * 	Update BTFld35 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld35(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld35,bTFld35.length);
   	
   }
   
   public void setBTFld35(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld35,bTFld35.length);
   	
   }
   
     /**
	 * 	Update BTFld35 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld35(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld35+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld35 with another Field
	 *	@param value
	 */
   public void setBTFld35(Field source) {
       replace(source,0,source.length(),beginBTFld35,B_TFLD_35_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld35 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld35(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld35,B_TFLD_35_LEN);
   	
   }
   
     /**
	 * 	Update BTFld35 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld35(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld35+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld15(CONSTANTS.SPACE_20);
         setBTFld25(CONSTANTS.SPACE_40);
         setBTFld35(CONSTANTS.SPACE_30);
   }

		public static int getBT5FieldLength() {
			return B_T_5_LENGTH;
		}

}
  
