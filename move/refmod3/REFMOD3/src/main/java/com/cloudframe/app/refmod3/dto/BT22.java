package com.cloudframe.app.refmod3.dto;

/**
*  The class BT22 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT22 extends BT22Serialized {
   

						private char[] bTFld122 = Field.fillLowValue(20);

						private char[] bTFld222 = Field.fillLowValue(40);

						private char[] bTFld322 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT22
	**/
    public BT22() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld122
	 *	@return bTFld122
	 */
   public char[] getBTFld122() throws CFException{
     if (isBTFld122Modified()) { 
        bTFld122 = refreshBTFld122();
     }
   		return bTFld122;
   }

  
	/**
	*  set variable bTFld122
	*  Corresponding COBOL Variable is WS-2-2B-T-FLD1
	*  @param value
	**/
   public void setBTFld122(char[] value) {
      bTFld122 = checkBTFld122Constraints(value);
      serializeBTFld122(bTFld122);
   } 

     /**
	 * 	Update BTFld122 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld122(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld122,bTFld122.length);
   	
   }
   
   public void setBTFld122(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld122,bTFld122.length);
   	
   }
   
     /**
	 * 	Update BTFld122 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld122(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld122+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld122 with another Field
	 *	@param value
	 */
   public void setBTFld122(Field source) {
       replace(source,0,source.length(),beginBTFld122,B_TFLD_122_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld122 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld122(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld122,B_TFLD_122_LEN);
   	
   }
   
     /**
	 * 	Update BTFld122 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld122(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld122+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld222
	 *	@return bTFld222
	 */
   public char[] getBTFld222() throws CFException{
     if (isBTFld222Modified()) { 
        bTFld222 = refreshBTFld222();
     }
   		return bTFld222;
   }

  
	/**
	*  set variable bTFld222
	*  Corresponding COBOL Variable is WS-2-2B-T-FLD2
	*  @param value
	**/
   public void setBTFld222(char[] value) {
      bTFld222 = checkBTFld222Constraints(value);
      serializeBTFld222(bTFld222);
   } 

     /**
	 * 	Update BTFld222 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld222(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld222,bTFld222.length);
   	
   }
   
   public void setBTFld222(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld222,bTFld222.length);
   	
   }
   
     /**
	 * 	Update BTFld222 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld222(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld222+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld222 with another Field
	 *	@param value
	 */
   public void setBTFld222(Field source) {
       replace(source,0,source.length(),beginBTFld222,B_TFLD_222_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld222 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld222(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld222,B_TFLD_222_LEN);
   	
   }
   
     /**
	 * 	Update BTFld222 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld222(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld222+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld322
	 *	@return bTFld322
	 */
   public char[] getBTFld322() throws CFException{
     if (isBTFld322Modified()) { 
        bTFld322 = refreshBTFld322();
     }
   		return bTFld322;
   }

  
	/**
	*  set variable bTFld322
	*  Corresponding COBOL Variable is WS-2-2B-T-FLD3
	*  @param value
	**/
   public void setBTFld322(char[] value) {
      bTFld322 = checkBTFld322Constraints(value);
      serializeBTFld322(bTFld322);
   } 

     /**
	 * 	Update BTFld322 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld322(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld322,bTFld322.length);
   	
   }
   
   public void setBTFld322(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld322,bTFld322.length);
   	
   }
   
     /**
	 * 	Update BTFld322 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld322(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld322+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld322 with another Field
	 *	@param value
	 */
   public void setBTFld322(Field source) {
       replace(source,0,source.length(),beginBTFld322,B_TFLD_322_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld322 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld322(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld322,B_TFLD_322_LEN);
   	
   }
   
     /**
	 * 	Update BTFld322 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld322(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld322+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT22
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld122(CONSTANTS.SPACE_20);
         setBTFld222(CONSTANTS.SPACE_40);
         setBTFld322(CONSTANTS.SPACE_30);
   }

		public static int getBT22FieldLength() {
			return B_T_22_LENGTH;
		}

}
  
