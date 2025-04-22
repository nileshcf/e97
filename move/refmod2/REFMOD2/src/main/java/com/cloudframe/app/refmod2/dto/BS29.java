package com.cloudframe.app.refmod2.dto;

/**
*  The class BS29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BS29 extends BS29Serialized { 
   

						private char[] bSFld129 = Field.fillLowValue(30);

						private char[] bSFld229 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS29
	**/
    public BS29() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BS29. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BS29(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bSFld129
	 *	@return bSFld129
	 */
   public char[] getBSFld129() throws CFException{
     if (isBSFld129Modified()) { 
        bSFld129 = refreshBSFld129();
     }
   		return bSFld129;
   }

  
	/**
	*  set variable bSFld129
	*  Corresponding COBOL Variable is WS-2-9B-S-FLD1
	*  @param value
	**/
   public void setBSFld129(char[] value) {
      bSFld129 = checkBSFld129Constraints(value);
      serializeBSFld129(bSFld129);
   } 

     /**
	 * 	Update BSFld129 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld129(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld129,bSFld129.length);
   	
   }
   
   public void setBSFld129(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld129,bSFld129.length);
   	
   }
   
     /**
	 * 	Update BSFld129 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld129(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld129+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld129 with another Field
	 *	@param value
	 */
   public void setBSFld129(Field source) {
       replace(source,0,source.length(),beginBSFld129,B_SFLD_129_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld129 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld129(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld129,B_SFLD_129_LEN);
   	
   }
   
     /**
	 * 	Update BSFld129 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld129(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld129+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld229
	 *	@return bSFld229
	 */
   public char[] getBSFld229() throws CFException{
     if (isBSFld229Modified()) { 
        bSFld229 = refreshBSFld229();
     }
   		return bSFld229;
   }

  
	/**
	*  set variable bSFld229
	*  Corresponding COBOL Variable is WS-2-9B-S-FLD2
	*  @param value
	**/
   public void setBSFld229(char[] value) {
      bSFld229 = checkBSFld229Constraints(value);
      serializeBSFld229(bSFld229);
   } 

     /**
	 * 	Update BSFld229 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld229(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld229,bSFld229.length);
   	
   }
   
   public void setBSFld229(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld229,bSFld229.length);
   	
   }
   
     /**
	 * 	Update BSFld229 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld229(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld229+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld229 with another Field
	 *	@param value
	 */
   public void setBSFld229(Field source) {
       replace(source,0,source.length(),beginBSFld229,B_SFLD_229_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld229 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld229(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld229,B_SFLD_229_LEN);
   	
   }
   
     /**
	 * 	Update BSFld229 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld229(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld229+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS29
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld129(CONSTANTS.SPACE_30);
         setBSFld229(CONSTANTS.SPACE_40);
   }

		public static int getBS29FieldLength() {
			return B_S_29_LENGTH;
		}

}
  
