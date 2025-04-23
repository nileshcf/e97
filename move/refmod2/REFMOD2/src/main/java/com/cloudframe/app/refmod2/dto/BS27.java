package com.cloudframe.app.refmod2.dto;

/**
*  The class BS27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS27 extends BS27Serialized {
   

						private char[] bSFld127 = Field.fillLowValue(30);

						private char[] bSFld227 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS27
	**/
    public BS27() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of bSFld127
	 *	@return bSFld127
	 */
   public char[] getBSFld127() throws CFException{
     if (isBSFld127Modified()) { 
        bSFld127 = refreshBSFld127();
     }
   		return bSFld127;
   }

  
	/**
	*  set variable bSFld127
	*  Corresponding COBOL Variable is WS-2-7B-S-FLD1
	*  @param value
	**/
   public void setBSFld127(char[] value) {
      bSFld127 = checkBSFld127Constraints(value);
      serializeBSFld127(bSFld127);
   } 

     /**
	 * 	Update BSFld127 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld127(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld127,bSFld127.length);
   	
   }
   
   public void setBSFld127(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld127,bSFld127.length);
   	
   }
   
     /**
	 * 	Update BSFld127 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld127(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld127+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld127 with another Field
	 *	@param value
	 */
   public void setBSFld127(Field source) {
       replace(source,0,source.length(),beginBSFld127,B_SFLD_127_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld127 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld127(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld127,B_SFLD_127_LEN);
   	
   }
   
     /**
	 * 	Update BSFld127 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld127(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld127+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld227
	 *	@return bSFld227
	 */
   public char[] getBSFld227() throws CFException{
     if (isBSFld227Modified()) { 
        bSFld227 = refreshBSFld227();
     }
   		return bSFld227;
   }

  
	/**
	*  set variable bSFld227
	*  Corresponding COBOL Variable is WS-2-7B-S-FLD2
	*  @param value
	**/
   public void setBSFld227(char[] value) {
      bSFld227 = checkBSFld227Constraints(value);
      serializeBSFld227(bSFld227);
   } 

     /**
	 * 	Update BSFld227 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld227(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld227,bSFld227.length);
   	
   }
   
   public void setBSFld227(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld227,bSFld227.length);
   	
   }
   
     /**
	 * 	Update BSFld227 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld227(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld227+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld227 with another Field
	 *	@param value
	 */
   public void setBSFld227(Field source) {
       replace(source,0,source.length(),beginBSFld227,B_SFLD_227_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld227 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld227(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld227,B_SFLD_227_LEN);
   	
   }
   
     /**
	 * 	Update BSFld227 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld227(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld227+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS27
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld127(CONSTANTS.SPACE_30);
         setBSFld227(CONSTANTS.SPACE_40);
   }

		public static int getBS27FieldLength() {
			return B_S_27_LENGTH;
		}

}
  
