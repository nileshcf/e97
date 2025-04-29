package com.cloudframe.app.refmod3.dto;

/**
*  The class BS21 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS21 extends BS21Serialized {
   

						private char[] bSFld121 = Field.fillLowValue(30);

						private char[] bSFld221 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS21
	**/
    public BS21() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld121
	 *	@return bSFld121
	 */
   public char[] getBSFld121() throws CFException{
     if (isBSFld121Modified()) { 
        bSFld121 = refreshBSFld121();
     }
   		return bSFld121;
   }

  
	/**
	*  set variable bSFld121
	*  Corresponding COBOL Variable is WS-2-1B-S-FLD1
	*  @param value
	**/
   public void setBSFld121(char[] value) {
      bSFld121 = checkBSFld121Constraints(value);
      serializeBSFld121(bSFld121);
   } 

     /**
	 * 	Update BSFld121 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld121(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld121,bSFld121.length);
   	
   }
   
   public void setBSFld121(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld121,bSFld121.length);
   	
   }
   
     /**
	 * 	Update BSFld121 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld121(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld121+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld121 with another Field
	 *	@param value
	 */
   public void setBSFld121(Field source) {
       replace(source,0,source.length(),beginBSFld121,B_SFLD_121_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld121 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld121(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld121,B_SFLD_121_LEN);
   	
   }
   
     /**
	 * 	Update BSFld121 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld121(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld121+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld221
	 *	@return bSFld221
	 */
   public char[] getBSFld221() throws CFException{
     if (isBSFld221Modified()) { 
        bSFld221 = refreshBSFld221();
     }
   		return bSFld221;
   }

  
	/**
	*  set variable bSFld221
	*  Corresponding COBOL Variable is WS-2-1B-S-FLD2
	*  @param value
	**/
   public void setBSFld221(char[] value) {
      bSFld221 = checkBSFld221Constraints(value);
      serializeBSFld221(bSFld221);
   } 

     /**
	 * 	Update BSFld221 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld221(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld221,bSFld221.length);
   	
   }
   
   public void setBSFld221(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld221,bSFld221.length);
   	
   }
   
     /**
	 * 	Update BSFld221 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld221(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld221+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld221 with another Field
	 *	@param value
	 */
   public void setBSFld221(Field source) {
       replace(source,0,source.length(),beginBSFld221,B_SFLD_221_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld221 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld221(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld221,B_SFLD_221_LEN);
   	
   }
   
     /**
	 * 	Update BSFld221 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld221(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld221+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS21
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld121(CONSTANTS.SPACE_30);
         setBSFld221(CONSTANTS.SPACE_40);
   }

		public static int getBS21FieldLength() {
			return B_S_21_LENGTH;
		}

}
  
