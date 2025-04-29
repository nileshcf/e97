package com.cloudframe.app.refmod2.dto;

/**
*  The class BS215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS215 extends BS215Serialized { 
   

						private char[] bSFld1215 = Field.fillLowValue(30);

						private char[] bSFld2215 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS215
	**/
    public BS215() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS215. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS215(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld1215
	 *	@return bSFld1215
	 */
   public char[] getBSFld1215() throws CFException{
     if (isBSFld1215Modified()) { 
        bSFld1215 = refreshBSFld1215();
     }
   		return bSFld1215;
   }

  
	/**
	*  set variable bSFld1215
	*  Corresponding COBOL Variable is WS-2-15B-S-FLD1
	*  @param value
	**/
   public void setBSFld1215(char[] value) {
      bSFld1215 = checkBSFld1215Constraints(value);
      serializeBSFld1215(bSFld1215);
   } 

     /**
	 * 	Update BSFld1215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld1215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld1215,bSFld1215.length);
   	
   }
   
   public void setBSFld1215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1215,bSFld1215.length);
   	
   }
   
     /**
	 * 	Update BSFld1215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld1215 with another Field
	 *	@param value
	 */
   public void setBSFld1215(Field source) {
       replace(source,0,source.length(),beginBSFld1215,B_SFLD_1215_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld1215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld1215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld1215,B_SFLD_1215_LEN);
   	
   }
   
     /**
	 * 	Update BSFld1215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld1215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld1215+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld2215
	 *	@return bSFld2215
	 */
   public char[] getBSFld2215() throws CFException{
     if (isBSFld2215Modified()) { 
        bSFld2215 = refreshBSFld2215();
     }
   		return bSFld2215;
   }

  
	/**
	*  set variable bSFld2215
	*  Corresponding COBOL Variable is WS-2-15B-S-FLD2
	*  @param value
	**/
   public void setBSFld2215(char[] value) {
      bSFld2215 = checkBSFld2215Constraints(value);
      serializeBSFld2215(bSFld2215);
   } 

     /**
	 * 	Update BSFld2215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld2215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld2215,bSFld2215.length);
   	
   }
   
   public void setBSFld2215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2215,bSFld2215.length);
   	
   }
   
     /**
	 * 	Update BSFld2215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld2215 with another Field
	 *	@param value
	 */
   public void setBSFld2215(Field source) {
       replace(source,0,source.length(),beginBSFld2215,B_SFLD_2215_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld2215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld2215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld2215,B_SFLD_2215_LEN);
   	
   }
   
     /**
	 * 	Update BSFld2215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld2215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld2215+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS215
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld1215(CONSTANTS.SPACE_30);
         setBSFld2215(CONSTANTS.SPACE_40);
   }

		public static int getBS215FieldLength() {
			return B_S_215_LENGTH;
		}

}
  
