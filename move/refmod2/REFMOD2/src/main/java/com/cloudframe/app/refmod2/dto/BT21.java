package com.cloudframe.app.refmod2.dto;

/**
*  The class BT21 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT21 extends BT21Serialized {
   

						private char[] bTFld121 = Field.fillLowValue(20);

						private char[] bTFld221 = Field.fillLowValue(40);

						private char[] bTFld321 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT21
	**/
    public BT21() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld121
	 *	@return bTFld121
	 */
   public char[] getBTFld121() throws CFException{
     if (isBTFld121Modified()) { 
        bTFld121 = refreshBTFld121();
     }
   		return bTFld121;
   }

  
	/**
	*  set variable bTFld121
	*  Corresponding COBOL Variable is WS-2-1B-T-FLD1
	*  @param value
	**/
   public void setBTFld121(char[] value) {
      bTFld121 = checkBTFld121Constraints(value);
      serializeBTFld121(bTFld121);
   } 

     /**
	 * 	Update BTFld121 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld121(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld121,bTFld121.length);
   	
   }
   
   public void setBTFld121(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld121,bTFld121.length);
   	
   }
   
     /**
	 * 	Update BTFld121 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld121(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld121+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld121 with another Field
	 *	@param value
	 */
   public void setBTFld121(Field source) {
       replace(source,0,source.length(),beginBTFld121,B_TFLD_121_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld121 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld121(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld121,B_TFLD_121_LEN);
   	
   }
   
     /**
	 * 	Update BTFld121 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld121(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld121+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld221
	 *	@return bTFld221
	 */
   public char[] getBTFld221() throws CFException{
     if (isBTFld221Modified()) { 
        bTFld221 = refreshBTFld221();
     }
   		return bTFld221;
   }

  
	/**
	*  set variable bTFld221
	*  Corresponding COBOL Variable is WS-2-1B-T-FLD2
	*  @param value
	**/
   public void setBTFld221(char[] value) {
      bTFld221 = checkBTFld221Constraints(value);
      serializeBTFld221(bTFld221);
   } 

     /**
	 * 	Update BTFld221 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld221(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld221,bTFld221.length);
   	
   }
   
   public void setBTFld221(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld221,bTFld221.length);
   	
   }
   
     /**
	 * 	Update BTFld221 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld221(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld221+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld221 with another Field
	 *	@param value
	 */
   public void setBTFld221(Field source) {
       replace(source,0,source.length(),beginBTFld221,B_TFLD_221_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld221 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld221(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld221,B_TFLD_221_LEN);
   	
   }
   
     /**
	 * 	Update BTFld221 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld221(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld221+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld321
	 *	@return bTFld321
	 */
   public char[] getBTFld321() throws CFException{
     if (isBTFld321Modified()) { 
        bTFld321 = refreshBTFld321();
     }
   		return bTFld321;
   }

  
	/**
	*  set variable bTFld321
	*  Corresponding COBOL Variable is WS-2-1B-T-FLD3
	*  @param value
	**/
   public void setBTFld321(char[] value) {
      bTFld321 = checkBTFld321Constraints(value);
      serializeBTFld321(bTFld321);
   } 

     /**
	 * 	Update BTFld321 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld321(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld321,bTFld321.length);
   	
   }
   
   public void setBTFld321(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld321,bTFld321.length);
   	
   }
   
     /**
	 * 	Update BTFld321 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld321(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld321+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld321 with another Field
	 *	@param value
	 */
   public void setBTFld321(Field source) {
       replace(source,0,source.length(),beginBTFld321,B_TFLD_321_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld321 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld321(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld321,B_TFLD_321_LEN);
   	
   }
   
     /**
	 * 	Update BTFld321 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld321(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld321+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT21
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld121(CONSTANTS.SPACE_20);
         setBTFld221(CONSTANTS.SPACE_40);
         setBTFld321(CONSTANTS.SPACE_30);
   }

		public static int getBT21FieldLength() {
			return B_T_21_LENGTH;
		}

}
  
