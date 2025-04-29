package com.cloudframe.app.refmod2.dto;

/**
*  The class BT26 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT26 extends BT26Serialized {
   

						private char[] bTFld126 = Field.fillLowValue(20);

						private char[] bTFld226 = Field.fillLowValue(40);

						private char[] bTFld326 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT26
	**/
    public BT26() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld126
	 *	@return bTFld126
	 */
   public char[] getBTFld126() throws CFException{
     if (isBTFld126Modified()) { 
        bTFld126 = refreshBTFld126();
     }
   		return bTFld126;
   }

  
	/**
	*  set variable bTFld126
	*  Corresponding COBOL Variable is WS-2-6B-T-FLD1
	*  @param value
	**/
   public void setBTFld126(char[] value) {
      bTFld126 = checkBTFld126Constraints(value);
      serializeBTFld126(bTFld126);
   } 

     /**
	 * 	Update BTFld126 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld126(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld126,bTFld126.length);
   	
   }
   
   public void setBTFld126(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld126,bTFld126.length);
   	
   }
   
     /**
	 * 	Update BTFld126 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld126(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld126+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld126 with another Field
	 *	@param value
	 */
   public void setBTFld126(Field source) {
       replace(source,0,source.length(),beginBTFld126,B_TFLD_126_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld126 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld126(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld126,B_TFLD_126_LEN);
   	
   }
   
     /**
	 * 	Update BTFld126 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld126(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld126+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld226
	 *	@return bTFld226
	 */
   public char[] getBTFld226() throws CFException{
     if (isBTFld226Modified()) { 
        bTFld226 = refreshBTFld226();
     }
   		return bTFld226;
   }

  
	/**
	*  set variable bTFld226
	*  Corresponding COBOL Variable is WS-2-6B-T-FLD2
	*  @param value
	**/
   public void setBTFld226(char[] value) {
      bTFld226 = checkBTFld226Constraints(value);
      serializeBTFld226(bTFld226);
   } 

     /**
	 * 	Update BTFld226 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld226(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld226,bTFld226.length);
   	
   }
   
   public void setBTFld226(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld226,bTFld226.length);
   	
   }
   
     /**
	 * 	Update BTFld226 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld226(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld226+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld226 with another Field
	 *	@param value
	 */
   public void setBTFld226(Field source) {
       replace(source,0,source.length(),beginBTFld226,B_TFLD_226_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld226 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld226(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld226,B_TFLD_226_LEN);
   	
   }
   
     /**
	 * 	Update BTFld226 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld226(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld226+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld326
	 *	@return bTFld326
	 */
   public char[] getBTFld326() throws CFException{
     if (isBTFld326Modified()) { 
        bTFld326 = refreshBTFld326();
     }
   		return bTFld326;
   }

  
	/**
	*  set variable bTFld326
	*  Corresponding COBOL Variable is WS-2-6B-T-FLD3
	*  @param value
	**/
   public void setBTFld326(char[] value) {
      bTFld326 = checkBTFld326Constraints(value);
      serializeBTFld326(bTFld326);
   } 

     /**
	 * 	Update BTFld326 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld326(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld326,bTFld326.length);
   	
   }
   
   public void setBTFld326(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld326,bTFld326.length);
   	
   }
   
     /**
	 * 	Update BTFld326 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld326(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld326+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld326 with another Field
	 *	@param value
	 */
   public void setBTFld326(Field source) {
       replace(source,0,source.length(),beginBTFld326,B_TFLD_326_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld326 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld326(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld326,B_TFLD_326_LEN);
   	
   }
   
     /**
	 * 	Update BTFld326 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld326(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld326+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT26
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld126(CONSTANTS.SPACE_20);
         setBTFld226(CONSTANTS.SPACE_40);
         setBTFld326(CONSTANTS.SPACE_30);
   }

		public static int getBT26FieldLength() {
			return B_T_26_LENGTH;
		}

}
  
