package com.cloudframe.app.refmod3.dto;

/**
*  The class BS219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS219 extends BS219Serialized { 
   

						private char[] bSFld1219 = Field.fillLowValue(30);

						private char[] bSFld2219 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS219
	**/
    public BS219() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld1219
	 *	@return bSFld1219
	 */
   public char[] getBSFld1219() throws CFException{
     if (isBSFld1219Modified()) { 
        bSFld1219 = refreshBSFld1219();
     }
   		return bSFld1219;
   }

  
	/**
	*  set variable bSFld1219
	*  Corresponding COBOL Variable is WS-2-19B-S-FLD1
	*  @param value
	**/
   public void setBSFld1219(char[] value) {
      bSFld1219 = checkBSFld1219Constraints(value);
      serializeBSFld1219(bSFld1219);
   } 

     /**
	 * 	Update BSFld1219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld1219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld1219,bSFld1219.length);
   	
   }
   
   public void setBSFld1219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1219,bSFld1219.length);
   	
   }
   
     /**
	 * 	Update BSFld1219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld1219 with another Field
	 *	@param value
	 */
   public void setBSFld1219(Field source) {
       replace(source,0,source.length(),beginBSFld1219,B_SFLD_1219_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld1219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld1219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld1219,B_SFLD_1219_LEN);
   	
   }
   
     /**
	 * 	Update BSFld1219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1219+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld2219
	 *	@return bSFld2219
	 */
   public char[] getBSFld2219() throws CFException{
     if (isBSFld2219Modified()) { 
        bSFld2219 = refreshBSFld2219();
     }
   		return bSFld2219;
   }

  
	/**
	*  set variable bSFld2219
	*  Corresponding COBOL Variable is WS-2-19B-S-FLD2
	*  @param value
	**/
   public void setBSFld2219(char[] value) {
      bSFld2219 = checkBSFld2219Constraints(value);
      serializeBSFld2219(bSFld2219);
   } 

     /**
	 * 	Update BSFld2219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld2219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld2219,bSFld2219.length);
   	
   }
   
   public void setBSFld2219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2219,bSFld2219.length);
   	
   }
   
     /**
	 * 	Update BSFld2219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld2219 with another Field
	 *	@param value
	 */
   public void setBSFld2219(Field source) {
       replace(source,0,source.length(),beginBSFld2219,B_SFLD_2219_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld2219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld2219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld2219,B_SFLD_2219_LEN);
   	
   }
   
     /**
	 * 	Update BSFld2219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2219+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS219
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1219(CONSTANTS.SPACE_30);
         setBSFld2219(CONSTANTS.SPACE_40);
   }

		public static int getBS219FieldLength() {
			return B_S_219_LENGTH;
		}

}
  
