package com.cloudframe.app.refmod3.dto;

/**
*  The class BS217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS217 extends BS217Serialized {
   

						private char[] bSFld1217 = Field.fillLowValue(30);

						private char[] bSFld2217 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS217
	**/
    public BS217() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld1217
	 *	@return bSFld1217
	 */
   public char[] getBSFld1217() throws CFException{
     if (isBSFld1217Modified()) { 
        bSFld1217 = refreshBSFld1217();
     }
   		return bSFld1217;
   }

  
	/**
	*  set variable bSFld1217
	*  Corresponding COBOL Variable is WS-2-17B-S-FLD1
	*  @param value
	**/
   public void setBSFld1217(char[] value) {
      bSFld1217 = checkBSFld1217Constraints(value);
      serializeBSFld1217(bSFld1217);
   } 

     /**
	 * 	Update BSFld1217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld1217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld1217,bSFld1217.length);
   	
   }
   
   public void setBSFld1217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1217,bSFld1217.length);
   	
   }
   
     /**
	 * 	Update BSFld1217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld1217 with another Field
	 *	@param value
	 */
   public void setBSFld1217(Field source) {
       replace(source,0,source.length(),beginBSFld1217,B_SFLD_1217_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld1217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld1217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld1217,B_SFLD_1217_LEN);
   	
   }
   
     /**
	 * 	Update BSFld1217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1217+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld2217
	 *	@return bSFld2217
	 */
   public char[] getBSFld2217() throws CFException{
     if (isBSFld2217Modified()) { 
        bSFld2217 = refreshBSFld2217();
     }
   		return bSFld2217;
   }

  
	/**
	*  set variable bSFld2217
	*  Corresponding COBOL Variable is WS-2-17B-S-FLD2
	*  @param value
	**/
   public void setBSFld2217(char[] value) {
      bSFld2217 = checkBSFld2217Constraints(value);
      serializeBSFld2217(bSFld2217);
   } 

     /**
	 * 	Update BSFld2217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld2217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld2217,bSFld2217.length);
   	
   }
   
   public void setBSFld2217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2217,bSFld2217.length);
   	
   }
   
     /**
	 * 	Update BSFld2217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld2217 with another Field
	 *	@param value
	 */
   public void setBSFld2217(Field source) {
       replace(source,0,source.length(),beginBSFld2217,B_SFLD_2217_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld2217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld2217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld2217,B_SFLD_2217_LEN);
   	
   }
   
     /**
	 * 	Update BSFld2217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2217+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS217
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1217(CONSTANTS.SPACE_30);
         setBSFld2217(CONSTANTS.SPACE_40);
   }

		public static int getBS217FieldLength() {
			return B_S_217_LENGTH;
		}

}
  
