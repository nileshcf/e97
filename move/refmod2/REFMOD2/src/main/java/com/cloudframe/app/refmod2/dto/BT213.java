package com.cloudframe.app.refmod2.dto;

/**
*  The class BT213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT213 extends BT213Serialized { 
   

						private char[] bTFld1213 = Field.fillLowValue(20);

						private char[] bTFld2213 = Field.fillLowValue(40);

						private char[] bTFld3213 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT213
	**/
    public BT213() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT213. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT213(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1213
	 *	@return bTFld1213
	 */
   public char[] getBTFld1213() throws CFException{
     if (isBTFld1213Modified()) { 
        bTFld1213 = refreshBTFld1213();
     }
   		return bTFld1213;
   }

  
	/**
	*  set variable bTFld1213
	*  Corresponding COBOL Variable is WS-2-13B-T-FLD1
	*  @param value
	**/
   public void setBTFld1213(char[] value) {
      bTFld1213 = checkBTFld1213Constraints(value);
      serializeBTFld1213(bTFld1213);
   } 

     /**
	 * 	Update BTFld1213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1213,bTFld1213.length);
   	
   }
   
   public void setBTFld1213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1213,bTFld1213.length);
   	
   }
   
     /**
	 * 	Update BTFld1213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1213 with another Field
	 *	@param value
	 */
   public void setBTFld1213(Field source) {
       replace(source,0,source.length(),beginBTFld1213,B_TFLD_1213_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1213,B_TFLD_1213_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1213+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2213
	 *	@return bTFld2213
	 */
   public char[] getBTFld2213() throws CFException{
     if (isBTFld2213Modified()) { 
        bTFld2213 = refreshBTFld2213();
     }
   		return bTFld2213;
   }

  
	/**
	*  set variable bTFld2213
	*  Corresponding COBOL Variable is WS-2-13B-T-FLD2
	*  @param value
	**/
   public void setBTFld2213(char[] value) {
      bTFld2213 = checkBTFld2213Constraints(value);
      serializeBTFld2213(bTFld2213);
   } 

     /**
	 * 	Update BTFld2213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2213,bTFld2213.length);
   	
   }
   
   public void setBTFld2213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2213,bTFld2213.length);
   	
   }
   
     /**
	 * 	Update BTFld2213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2213 with another Field
	 *	@param value
	 */
   public void setBTFld2213(Field source) {
       replace(source,0,source.length(),beginBTFld2213,B_TFLD_2213_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2213,B_TFLD_2213_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2213+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3213
	 *	@return bTFld3213
	 */
   public char[] getBTFld3213() throws CFException{
     if (isBTFld3213Modified()) { 
        bTFld3213 = refreshBTFld3213();
     }
   		return bTFld3213;
   }

  
	/**
	*  set variable bTFld3213
	*  Corresponding COBOL Variable is WS-2-13B-T-FLD3
	*  @param value
	**/
   public void setBTFld3213(char[] value) {
      bTFld3213 = checkBTFld3213Constraints(value);
      serializeBTFld3213(bTFld3213);
   } 

     /**
	 * 	Update BTFld3213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3213,bTFld3213.length);
   	
   }
   
   public void setBTFld3213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3213,bTFld3213.length);
   	
   }
   
     /**
	 * 	Update BTFld3213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3213 with another Field
	 *	@param value
	 */
   public void setBTFld3213(Field source) {
       replace(source,0,source.length(),beginBTFld3213,B_TFLD_3213_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3213,B_TFLD_3213_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3213+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT213
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1213(CONSTANTS.SPACE_20);
         setBTFld2213(CONSTANTS.SPACE_40);
         setBTFld3213(CONSTANTS.SPACE_30);
   }

		public static int getBT213FieldLength() {
			return B_T_213_LENGTH;
		}

}
  
