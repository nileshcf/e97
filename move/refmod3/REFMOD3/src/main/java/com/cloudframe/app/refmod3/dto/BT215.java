package com.cloudframe.app.refmod3.dto;

/**
*  The class BT215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT215 extends BT215Serialized {
   

						private char[] bTFld1215 = Field.fillLowValue(20);

						private char[] bTFld2215 = Field.fillLowValue(40);

						private char[] bTFld3215 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT215
	**/
    public BT215() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bTFld1215
	 *	@return bTFld1215
	 */
   public char[] getBTFld1215() throws CFException{
     if (isBTFld1215Modified()) { 
        bTFld1215 = refreshBTFld1215();
     }
   		return bTFld1215;
   }

  
	/**
	*  set variable bTFld1215
	*  Corresponding COBOL Variable is WS-2-15B-T-FLD1
	*  @param value
	**/
   public void setBTFld1215(char[] value) {
      bTFld1215 = checkBTFld1215Constraints(value);
      serializeBTFld1215(bTFld1215);
   } 

     /**
	 * 	Update BTFld1215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1215,bTFld1215.length);
   	
   }
   
   public void setBTFld1215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1215,bTFld1215.length);
   	
   }
   
     /**
	 * 	Update BTFld1215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1215 with another Field
	 *	@param value
	 */
   public void setBTFld1215(Field source) {
       replace(source,0,source.length(),beginBTFld1215,B_TFLD_1215_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1215,B_TFLD_1215_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1215+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2215
	 *	@return bTFld2215
	 */
   public char[] getBTFld2215() throws CFException{
     if (isBTFld2215Modified()) { 
        bTFld2215 = refreshBTFld2215();
     }
   		return bTFld2215;
   }

  
	/**
	*  set variable bTFld2215
	*  Corresponding COBOL Variable is WS-2-15B-T-FLD2
	*  @param value
	**/
   public void setBTFld2215(char[] value) {
      bTFld2215 = checkBTFld2215Constraints(value);
      serializeBTFld2215(bTFld2215);
   } 

     /**
	 * 	Update BTFld2215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2215,bTFld2215.length);
   	
   }
   
   public void setBTFld2215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2215,bTFld2215.length);
   	
   }
   
     /**
	 * 	Update BTFld2215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2215 with another Field
	 *	@param value
	 */
   public void setBTFld2215(Field source) {
       replace(source,0,source.length(),beginBTFld2215,B_TFLD_2215_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2215,B_TFLD_2215_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2215+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3215
	 *	@return bTFld3215
	 */
   public char[] getBTFld3215() throws CFException{
     if (isBTFld3215Modified()) { 
        bTFld3215 = refreshBTFld3215();
     }
   		return bTFld3215;
   }

  
	/**
	*  set variable bTFld3215
	*  Corresponding COBOL Variable is WS-2-15B-T-FLD3
	*  @param value
	**/
   public void setBTFld3215(char[] value) {
      bTFld3215 = checkBTFld3215Constraints(value);
      serializeBTFld3215(bTFld3215);
   } 

     /**
	 * 	Update BTFld3215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3215,bTFld3215.length);
   	
   }
   
   public void setBTFld3215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3215,bTFld3215.length);
   	
   }
   
     /**
	 * 	Update BTFld3215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3215 with another Field
	 *	@param value
	 */
   public void setBTFld3215(Field source) {
       replace(source,0,source.length(),beginBTFld3215,B_TFLD_3215_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3215,B_TFLD_3215_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3215+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT215
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1215(CONSTANTS.SPACE_20);
         setBTFld2215(CONSTANTS.SPACE_40);
         setBTFld3215(CONSTANTS.SPACE_30);
   }

		public static int getBT215FieldLength() {
			return B_T_215_LENGTH;
		}

}
  
