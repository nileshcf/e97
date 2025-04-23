package com.cloudframe.app.refmod2.dto;

/**
*  The class BT24 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT24 extends BT24Serialized {
   

						private char[] bTFld124 = Field.fillLowValue(20);

						private char[] bTFld224 = Field.fillLowValue(40);

						private char[] bTFld324 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT24
	**/
    public BT24() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld124
	 *	@return bTFld124
	 */
   public char[] getBTFld124() throws CFException{
     if (isBTFld124Modified()) { 
        bTFld124 = refreshBTFld124();
     }
   		return bTFld124;
   }

  
	/**
	*  set variable bTFld124
	*  Corresponding COBOL Variable is WS-2-4B-T-FLD1
	*  @param value
	**/
   public void setBTFld124(char[] value) {
      bTFld124 = checkBTFld124Constraints(value);
      serializeBTFld124(bTFld124);
   } 

     /**
	 * 	Update BTFld124 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld124(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld124,bTFld124.length);
   	
   }
   
   public void setBTFld124(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld124,bTFld124.length);
   	
   }
   
     /**
	 * 	Update BTFld124 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld124(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld124+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld124 with another Field
	 *	@param value
	 */
   public void setBTFld124(Field source) {
       replace(source,0,source.length(),beginBTFld124,B_TFLD_124_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld124 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld124(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld124,B_TFLD_124_LEN);
   	
   }
   
     /**
	 * 	Update BTFld124 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld124(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld124+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld224
	 *	@return bTFld224
	 */
   public char[] getBTFld224() throws CFException{
     if (isBTFld224Modified()) { 
        bTFld224 = refreshBTFld224();
     }
   		return bTFld224;
   }

  
	/**
	*  set variable bTFld224
	*  Corresponding COBOL Variable is WS-2-4B-T-FLD2
	*  @param value
	**/
   public void setBTFld224(char[] value) {
      bTFld224 = checkBTFld224Constraints(value);
      serializeBTFld224(bTFld224);
   } 

     /**
	 * 	Update BTFld224 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld224(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld224,bTFld224.length);
   	
   }
   
   public void setBTFld224(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld224,bTFld224.length);
   	
   }
   
     /**
	 * 	Update BTFld224 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld224(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld224+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld224 with another Field
	 *	@param value
	 */
   public void setBTFld224(Field source) {
       replace(source,0,source.length(),beginBTFld224,B_TFLD_224_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld224 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld224(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld224,B_TFLD_224_LEN);
   	
   }
   
     /**
	 * 	Update BTFld224 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld224(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld224+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld324
	 *	@return bTFld324
	 */
   public char[] getBTFld324() throws CFException{
     if (isBTFld324Modified()) { 
        bTFld324 = refreshBTFld324();
     }
   		return bTFld324;
   }

  
	/**
	*  set variable bTFld324
	*  Corresponding COBOL Variable is WS-2-4B-T-FLD3
	*  @param value
	**/
   public void setBTFld324(char[] value) {
      bTFld324 = checkBTFld324Constraints(value);
      serializeBTFld324(bTFld324);
   } 

     /**
	 * 	Update BTFld324 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld324(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld324,bTFld324.length);
   	
   }
   
   public void setBTFld324(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld324,bTFld324.length);
   	
   }
   
     /**
	 * 	Update BTFld324 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld324(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld324+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld324 with another Field
	 *	@param value
	 */
   public void setBTFld324(Field source) {
       replace(source,0,source.length(),beginBTFld324,B_TFLD_324_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld324 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld324(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld324,B_TFLD_324_LEN);
   	
   }
   
     /**
	 * 	Update BTFld324 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld324(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld324+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT24
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld124(CONSTANTS.SPACE_20);
         setBTFld224(CONSTANTS.SPACE_40);
         setBTFld324(CONSTANTS.SPACE_30);
   }

		public static int getBT24FieldLength() {
			return B_T_24_LENGTH;
		}

}
  
