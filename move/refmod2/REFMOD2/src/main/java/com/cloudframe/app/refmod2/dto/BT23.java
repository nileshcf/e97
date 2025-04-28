package com.cloudframe.app.refmod2.dto;

/**
*  The class BT23 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT23 extends BT23Serialized { 
   

						private char[] bTFld123 = Field.fillLowValue(20);

						private char[] bTFld223 = Field.fillLowValue(40);

						private char[] bTFld323 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT23
	**/
    public BT23() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld123
	 *	@return bTFld123
	 */
   public char[] getBTFld123() throws CFException{
     if (isBTFld123Modified()) { 
        bTFld123 = refreshBTFld123();
     }
   		return bTFld123;
   }

  
	/**
	*  set variable bTFld123
	*  Corresponding COBOL Variable is WS-2-3B-T-FLD1
	*  @param value
	**/
   public void setBTFld123(char[] value) {
      bTFld123 = checkBTFld123Constraints(value);
      serializeBTFld123(bTFld123);
   } 

     /**
	 * 	Update BTFld123 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld123(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld123,bTFld123.length);
   	
   }
   
   public void setBTFld123(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld123,bTFld123.length);
   	
   }
   
     /**
	 * 	Update BTFld123 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld123(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld123+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld123 with another Field
	 *	@param value
	 */
   public void setBTFld123(Field source) {
       replace(source,0,source.length(),beginBTFld123,B_TFLD_123_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld123 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld123(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld123,B_TFLD_123_LEN);
   	
   }
   
     /**
	 * 	Update BTFld123 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld123(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld123+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld223
	 *	@return bTFld223
	 */
   public char[] getBTFld223() throws CFException{
     if (isBTFld223Modified()) { 
        bTFld223 = refreshBTFld223();
     }
   		return bTFld223;
   }

  
	/**
	*  set variable bTFld223
	*  Corresponding COBOL Variable is WS-2-3B-T-FLD2
	*  @param value
	**/
   public void setBTFld223(char[] value) {
      bTFld223 = checkBTFld223Constraints(value);
      serializeBTFld223(bTFld223);
   } 

     /**
	 * 	Update BTFld223 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld223(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld223,bTFld223.length);
   	
   }
   
   public void setBTFld223(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld223,bTFld223.length);
   	
   }
   
     /**
	 * 	Update BTFld223 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld223(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld223+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld223 with another Field
	 *	@param value
	 */
   public void setBTFld223(Field source) {
       replace(source,0,source.length(),beginBTFld223,B_TFLD_223_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld223 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld223(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld223,B_TFLD_223_LEN);
   	
   }
   
     /**
	 * 	Update BTFld223 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld223(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld223+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld323
	 *	@return bTFld323
	 */
   public char[] getBTFld323() throws CFException{
     if (isBTFld323Modified()) { 
        bTFld323 = refreshBTFld323();
     }
   		return bTFld323;
   }

  
	/**
	*  set variable bTFld323
	*  Corresponding COBOL Variable is WS-2-3B-T-FLD3
	*  @param value
	**/
   public void setBTFld323(char[] value) {
      bTFld323 = checkBTFld323Constraints(value);
      serializeBTFld323(bTFld323);
   } 

     /**
	 * 	Update BTFld323 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld323(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld323,bTFld323.length);
   	
   }
   
   public void setBTFld323(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld323,bTFld323.length);
   	
   }
   
     /**
	 * 	Update BTFld323 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld323(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld323+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld323 with another Field
	 *	@param value
	 */
   public void setBTFld323(Field source) {
       replace(source,0,source.length(),beginBTFld323,B_TFLD_323_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld323 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld323(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld323,B_TFLD_323_LEN);
   	
   }
   
     /**
	 * 	Update BTFld323 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld323(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld323+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT23
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld123(CONSTANTS.SPACE_20);
         setBTFld223(CONSTANTS.SPACE_40);
         setBTFld323(CONSTANTS.SPACE_30);
   }

		public static int getBT23FieldLength() {
			return B_T_23_LENGTH;
		}

}
  
