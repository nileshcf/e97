package com.cloudframe.app.global.sharedvar;

/**
*  The class BT7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT7 extends BT7Serialized { 
   

						private char[] bTFld17 = Field.fillLowValue(20);

						private char[] bTFld27 = Field.fillLowValue(40);

						private char[] bTFld37 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT7
	**/
    public BT7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld17
	 *	@return bTFld17
	 */
   public char[] getBTFld17() throws CFException{
     if (isBTFld17Modified()) { 
        bTFld17 = refreshBTFld17();
     }
   		return bTFld17;
   }

  
	/**
	*  set variable bTFld17
	*  Corresponding COBOL Variable is WS-7B-T-FLD1
	*  @param value
	**/
   public void setBTFld17(char[] value) {
      bTFld17 = checkBTFld17Constraints(value);
      serializeBTFld17(bTFld17);
   } 

     /**
	 * 	Update BTFld17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld17,bTFld17.length);
   	
   }
   
   public void setBTFld17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld17,bTFld17.length);
   	
   }
   
     /**
	 * 	Update BTFld17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld17 with another Field
	 *	@param value
	 */
   public void setBTFld17(Field source) {
       replace(source,0,source.length(),beginBTFld17,B_TFLD_17_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld17,B_TFLD_17_LEN);
   	
   }
   
     /**
	 * 	Update BTFld17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld27
	 *	@return bTFld27
	 */
   public char[] getBTFld27() throws CFException{
     if (isBTFld27Modified()) { 
        bTFld27 = refreshBTFld27();
     }
   		return bTFld27;
   }

  
	/**
	*  set variable bTFld27
	*  Corresponding COBOL Variable is WS-7B-T-FLD2
	*  @param value
	**/
   public void setBTFld27(char[] value) {
      bTFld27 = checkBTFld27Constraints(value);
      serializeBTFld27(bTFld27);
   } 

     /**
	 * 	Update BTFld27 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld27(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld27,bTFld27.length);
   	
   }
   
   public void setBTFld27(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld27,bTFld27.length);
   	
   }
   
     /**
	 * 	Update BTFld27 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld27+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld27 with another Field
	 *	@param value
	 */
   public void setBTFld27(Field source) {
       replace(source,0,source.length(),beginBTFld27,B_TFLD_27_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld27 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld27(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld27,B_TFLD_27_LEN);
   	
   }
   
     /**
	 * 	Update BTFld27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld27+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld37
	 *	@return bTFld37
	 */
   public char[] getBTFld37() throws CFException{
     if (isBTFld37Modified()) { 
        bTFld37 = refreshBTFld37();
     }
   		return bTFld37;
   }

  
	/**
	*  set variable bTFld37
	*  Corresponding COBOL Variable is WS-7B-T-FLD3
	*  @param value
	**/
   public void setBTFld37(char[] value) {
      bTFld37 = checkBTFld37Constraints(value);
      serializeBTFld37(bTFld37);
   } 

     /**
	 * 	Update BTFld37 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld37(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld37,bTFld37.length);
   	
   }
   
   public void setBTFld37(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld37,bTFld37.length);
   	
   }
   
     /**
	 * 	Update BTFld37 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld37(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld37+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld37 with another Field
	 *	@param value
	 */
   public void setBTFld37(Field source) {
       replace(source,0,source.length(),beginBTFld37,B_TFLD_37_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld37 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld37(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld37,B_TFLD_37_LEN);
   	
   }
   
     /**
	 * 	Update BTFld37 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld37(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld37+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld17(CONSTANTS.SPACE_20);
         setBTFld27(CONSTANTS.SPACE_40);
         setBTFld37(CONSTANTS.SPACE_30);
   }

		public static int getBT7FieldLength() {
			return B_T_7_LENGTH;
		}

}
  
