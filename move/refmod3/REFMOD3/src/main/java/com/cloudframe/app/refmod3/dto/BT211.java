package com.cloudframe.app.refmod3.dto;

/**
*  The class BT211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT211 extends BT211Serialized { 
   

						private char[] bTFld1211 = Field.fillLowValue(20);

						private char[] bTFld2211 = Field.fillLowValue(40);

						private char[] bTFld3211 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT211
	**/
    public BT211() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT211. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT211(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1211
	 *	@return bTFld1211
	 */
   public char[] getBTFld1211() throws CFException{
     if (isBTFld1211Modified()) { 
        bTFld1211 = refreshBTFld1211();
     }
   		return bTFld1211;
   }

  
	/**
	*  set variable bTFld1211
	*  Corresponding COBOL Variable is WS-2-11B-T-FLD1
	*  @param value
	**/
   public void setBTFld1211(char[] value) {
      bTFld1211 = checkBTFld1211Constraints(value);
      serializeBTFld1211(bTFld1211);
   } 

     /**
	 * 	Update BTFld1211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1211,bTFld1211.length);
   	
   }
   
   public void setBTFld1211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1211,bTFld1211.length);
   	
   }
   
     /**
	 * 	Update BTFld1211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1211 with another Field
	 *	@param value
	 */
   public void setBTFld1211(Field source) {
       replace(source,0,source.length(),beginBTFld1211,B_TFLD_1211_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1211,B_TFLD_1211_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1211+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2211
	 *	@return bTFld2211
	 */
   public char[] getBTFld2211() throws CFException{
     if (isBTFld2211Modified()) { 
        bTFld2211 = refreshBTFld2211();
     }
   		return bTFld2211;
   }

  
	/**
	*  set variable bTFld2211
	*  Corresponding COBOL Variable is WS-2-11B-T-FLD2
	*  @param value
	**/
   public void setBTFld2211(char[] value) {
      bTFld2211 = checkBTFld2211Constraints(value);
      serializeBTFld2211(bTFld2211);
   } 

     /**
	 * 	Update BTFld2211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2211,bTFld2211.length);
   	
   }
   
   public void setBTFld2211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2211,bTFld2211.length);
   	
   }
   
     /**
	 * 	Update BTFld2211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2211 with another Field
	 *	@param value
	 */
   public void setBTFld2211(Field source) {
       replace(source,0,source.length(),beginBTFld2211,B_TFLD_2211_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2211,B_TFLD_2211_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2211+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3211
	 *	@return bTFld3211
	 */
   public char[] getBTFld3211() throws CFException{
     if (isBTFld3211Modified()) { 
        bTFld3211 = refreshBTFld3211();
     }
   		return bTFld3211;
   }

  
	/**
	*  set variable bTFld3211
	*  Corresponding COBOL Variable is WS-2-11B-T-FLD3
	*  @param value
	**/
   public void setBTFld3211(char[] value) {
      bTFld3211 = checkBTFld3211Constraints(value);
      serializeBTFld3211(bTFld3211);
   } 

     /**
	 * 	Update BTFld3211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3211,bTFld3211.length);
   	
   }
   
   public void setBTFld3211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3211,bTFld3211.length);
   	
   }
   
     /**
	 * 	Update BTFld3211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3211 with another Field
	 *	@param value
	 */
   public void setBTFld3211(Field source) {
       replace(source,0,source.length(),beginBTFld3211,B_TFLD_3211_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3211,B_TFLD_3211_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3211+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT211
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1211(CONSTANTS.SPACE_20);
         setBTFld2211(CONSTANTS.SPACE_40);
         setBTFld3211(CONSTANTS.SPACE_30);
   }

		public static int getBT211FieldLength() {
			return B_T_211_LENGTH;
		}

}
  
