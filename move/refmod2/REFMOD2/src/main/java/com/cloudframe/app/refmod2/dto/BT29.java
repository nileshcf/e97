package com.cloudframe.app.refmod2.dto;

/**
*  The class BT29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT29 extends BT29Serialized { 
   

						private char[] bTFld129 = Field.fillLowValue(20);

						private char[] bTFld229 = Field.fillLowValue(40);

						private char[] bTFld329 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT29
	**/
    public BT29() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT29. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT29(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld129
	 *	@return bTFld129
	 */
   public char[] getBTFld129() throws CFException{
     if (isBTFld129Modified()) { 
        bTFld129 = refreshBTFld129();
     }
   		return bTFld129;
   }

  
	/**
	*  set variable bTFld129
	*  Corresponding COBOL Variable is WS-2-9B-T-FLD1
	*  @param value
	**/
   public void setBTFld129(char[] value) {
      bTFld129 = checkBTFld129Constraints(value);
      serializeBTFld129(bTFld129);
   } 

     /**
	 * 	Update BTFld129 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld129(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld129,bTFld129.length);
   	
   }
   
   public void setBTFld129(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld129,bTFld129.length);
   	
   }
   
     /**
	 * 	Update BTFld129 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld129(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld129+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld129 with another Field
	 *	@param value
	 */
   public void setBTFld129(Field source) {
       replace(source,0,source.length(),beginBTFld129,B_TFLD_129_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld129 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld129(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld129,B_TFLD_129_LEN);
   	
   }
   
     /**
	 * 	Update BTFld129 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld129(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld129+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld229
	 *	@return bTFld229
	 */
   public char[] getBTFld229() throws CFException{
     if (isBTFld229Modified()) { 
        bTFld229 = refreshBTFld229();
     }
   		return bTFld229;
   }

  
	/**
	*  set variable bTFld229
	*  Corresponding COBOL Variable is WS-2-9B-T-FLD2
	*  @param value
	**/
   public void setBTFld229(char[] value) {
      bTFld229 = checkBTFld229Constraints(value);
      serializeBTFld229(bTFld229);
   } 

     /**
	 * 	Update BTFld229 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld229(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld229,bTFld229.length);
   	
   }
   
   public void setBTFld229(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld229,bTFld229.length);
   	
   }
   
     /**
	 * 	Update BTFld229 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld229(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld229+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld229 with another Field
	 *	@param value
	 */
   public void setBTFld229(Field source) {
       replace(source,0,source.length(),beginBTFld229,B_TFLD_229_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld229 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld229(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld229,B_TFLD_229_LEN);
   	
   }
   
     /**
	 * 	Update BTFld229 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld229(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld229+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld329
	 *	@return bTFld329
	 */
   public char[] getBTFld329() throws CFException{
     if (isBTFld329Modified()) { 
        bTFld329 = refreshBTFld329();
     }
   		return bTFld329;
   }

  
	/**
	*  set variable bTFld329
	*  Corresponding COBOL Variable is WS-2-9B-T-FLD3
	*  @param value
	**/
   public void setBTFld329(char[] value) {
      bTFld329 = checkBTFld329Constraints(value);
      serializeBTFld329(bTFld329);
   } 

     /**
	 * 	Update BTFld329 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld329(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld329,bTFld329.length);
   	
   }
   
   public void setBTFld329(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld329,bTFld329.length);
   	
   }
   
     /**
	 * 	Update BTFld329 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld329(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld329+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld329 with another Field
	 *	@param value
	 */
   public void setBTFld329(Field source) {
       replace(source,0,source.length(),beginBTFld329,B_TFLD_329_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld329 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld329(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld329,B_TFLD_329_LEN);
   	
   }
   
     /**
	 * 	Update BTFld329 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld329(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld329+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT29
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld129(CONSTANTS.SPACE_20);
         setBTFld229(CONSTANTS.SPACE_40);
         setBTFld329(CONSTANTS.SPACE_30);
   }

		public static int getBT29FieldLength() {
			return B_T_29_LENGTH;
		}

}
  
