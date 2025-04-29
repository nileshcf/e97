package com.cloudframe.app.refmod3.dto;

/**
*  The class BS211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS211 extends BS211Serialized {
   

						private char[] bSFld1211 = Field.fillLowValue(30);

						private char[] bSFld2211 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS211
	**/
    public BS211() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld1211
	 *	@return bSFld1211
	 */
   public char[] getBSFld1211() throws CFException{
     if (isBSFld1211Modified()) { 
        bSFld1211 = refreshBSFld1211();
     }
   		return bSFld1211;
   }

  
	/**
	*  set variable bSFld1211
	*  Corresponding COBOL Variable is WS-2-11B-S-FLD1
	*  @param value
	**/
   public void setBSFld1211(char[] value) {
      bSFld1211 = checkBSFld1211Constraints(value);
      serializeBSFld1211(bSFld1211);
   } 

     /**
	 * 	Update BSFld1211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld1211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld1211,bSFld1211.length);
   	
   }
   
   public void setBSFld1211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1211,bSFld1211.length);
   	
   }
   
     /**
	 * 	Update BSFld1211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld1211 with another Field
	 *	@param value
	 */
   public void setBSFld1211(Field source) {
       replace(source,0,source.length(),beginBSFld1211,B_SFLD_1211_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld1211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld1211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld1211,B_SFLD_1211_LEN);
   	
   }
   
     /**
	 * 	Update BSFld1211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1211+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld2211
	 *	@return bSFld2211
	 */
   public char[] getBSFld2211() throws CFException{
     if (isBSFld2211Modified()) { 
        bSFld2211 = refreshBSFld2211();
     }
   		return bSFld2211;
   }

  
	/**
	*  set variable bSFld2211
	*  Corresponding COBOL Variable is WS-2-11B-S-FLD2
	*  @param value
	**/
   public void setBSFld2211(char[] value) {
      bSFld2211 = checkBSFld2211Constraints(value);
      serializeBSFld2211(bSFld2211);
   } 

     /**
	 * 	Update BSFld2211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld2211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld2211,bSFld2211.length);
   	
   }
   
   public void setBSFld2211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2211,bSFld2211.length);
   	
   }
   
     /**
	 * 	Update BSFld2211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld2211 with another Field
	 *	@param value
	 */
   public void setBSFld2211(Field source) {
       replace(source,0,source.length(),beginBSFld2211,B_SFLD_2211_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld2211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld2211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld2211,B_SFLD_2211_LEN);
   	
   }
   
     /**
	 * 	Update BSFld2211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2211+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS211
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1211(CONSTANTS.SPACE_30);
         setBSFld2211(CONSTANTS.SPACE_40);
   }

		public static int getBS211FieldLength() {
			return B_S_211_LENGTH;
		}

}
  
