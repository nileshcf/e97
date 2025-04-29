package com.cloudframe.app.refmod2.dto;

/**
*  The class BT25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT25 extends BT25Serialized {
   

						private char[] bTFld125 = Field.fillLowValue(20);

						private char[] bTFld225 = Field.fillLowValue(40);

						private char[] bTFld325 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT25
	**/
    public BT25() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld125
	 *	@return bTFld125
	 */
   public char[] getBTFld125() throws CFException{
     if (isBTFld125Modified()) { 
        bTFld125 = refreshBTFld125();
     }
   		return bTFld125;
   }

  
	/**
	*  set variable bTFld125
	*  Corresponding COBOL Variable is WS-2-5B-T-FLD1
	*  @param value
	**/
   public void setBTFld125(char[] value) {
      bTFld125 = checkBTFld125Constraints(value);
      serializeBTFld125(bTFld125);
   } 

     /**
	 * 	Update BTFld125 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld125(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld125,bTFld125.length);
   	
   }
   
   public void setBTFld125(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld125,bTFld125.length);
   	
   }
   
     /**
	 * 	Update BTFld125 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld125(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld125+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld125 with another Field
	 *	@param value
	 */
   public void setBTFld125(Field source) {
       replace(source,0,source.length(),beginBTFld125,B_TFLD_125_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld125 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld125(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld125,B_TFLD_125_LEN);
   	
   }
   
     /**
	 * 	Update BTFld125 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld125(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld125+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld225
	 *	@return bTFld225
	 */
   public char[] getBTFld225() throws CFException{
     if (isBTFld225Modified()) { 
        bTFld225 = refreshBTFld225();
     }
   		return bTFld225;
   }

  
	/**
	*  set variable bTFld225
	*  Corresponding COBOL Variable is WS-2-5B-T-FLD2
	*  @param value
	**/
   public void setBTFld225(char[] value) {
      bTFld225 = checkBTFld225Constraints(value);
      serializeBTFld225(bTFld225);
   } 

     /**
	 * 	Update BTFld225 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld225(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld225,bTFld225.length);
   	
   }
   
   public void setBTFld225(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld225,bTFld225.length);
   	
   }
   
     /**
	 * 	Update BTFld225 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld225(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld225+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld225 with another Field
	 *	@param value
	 */
   public void setBTFld225(Field source) {
       replace(source,0,source.length(),beginBTFld225,B_TFLD_225_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld225 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld225(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld225,B_TFLD_225_LEN);
   	
   }
   
     /**
	 * 	Update BTFld225 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld225(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld225+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld325
	 *	@return bTFld325
	 */
   public char[] getBTFld325() throws CFException{
     if (isBTFld325Modified()) { 
        bTFld325 = refreshBTFld325();
     }
   		return bTFld325;
   }

  
	/**
	*  set variable bTFld325
	*  Corresponding COBOL Variable is WS-2-5B-T-FLD3
	*  @param value
	**/
   public void setBTFld325(char[] value) {
      bTFld325 = checkBTFld325Constraints(value);
      serializeBTFld325(bTFld325);
   } 

     /**
	 * 	Update BTFld325 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld325(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld325,bTFld325.length);
   	
   }
   
   public void setBTFld325(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld325,bTFld325.length);
   	
   }
   
     /**
	 * 	Update BTFld325 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld325(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld325+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld325 with another Field
	 *	@param value
	 */
   public void setBTFld325(Field source) {
       replace(source,0,source.length(),beginBTFld325,B_TFLD_325_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld325 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld325(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld325,B_TFLD_325_LEN);
   	
   }
   
     /**
	 * 	Update BTFld325 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld325(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld325+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT25
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld125(CONSTANTS.SPACE_20);
         setBTFld225(CONSTANTS.SPACE_40);
         setBTFld325(CONSTANTS.SPACE_30);
   }

		public static int getBT25FieldLength() {
			return B_T_25_LENGTH;
		}

}
  
