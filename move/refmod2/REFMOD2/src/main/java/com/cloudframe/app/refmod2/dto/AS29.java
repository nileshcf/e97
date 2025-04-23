package com.cloudframe.app.refmod2.dto;

/**
*  The class AS29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS29 extends AS29Serialized { 
   

						private char[] aSFld129 = Field.fillLowValue(30);

						private char[] aSFld229 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS29
	**/
    public AS29() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS29. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS29(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld129
	 *	@return aSFld129
	 */
   public char[] getASFld129() throws CFException{
     if (isASFld129Modified()) { 
        aSFld129 = refreshASFld129();
     }
   		return aSFld129;
   }

  
	/**
	*  set variable aSFld129
	*  Corresponding COBOL Variable is WS-2-9A-S-FLD1
	*  @param value
	**/
   public void setASFld129(char[] value) {
      aSFld129 = checkASFld129Constraints(value);
      serializeASFld129(aSFld129);
   } 

     /**
	 * 	Update ASFld129 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld129(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld129,aSFld129.length);
   	
   }
   
   public void setASFld129(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld129,aSFld129.length);
   	
   }
   
     /**
	 * 	Update ASFld129 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld129(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld129+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld129 with another Field
	 *	@param value
	 */
   public void setASFld129(Field source) {
       replace(source,0,source.length(),beginASFld129,A_SFLD_129_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld129 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld129(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld129,A_SFLD_129_LEN);
   	
   }
   
     /**
	 * 	Update ASFld129 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld129(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld129+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld229
	 *	@return aSFld229
	 */
   public char[] getASFld229() throws CFException{
     if (isASFld229Modified()) { 
        aSFld229 = refreshASFld229();
     }
   		return aSFld229;
   }

  
	/**
	*  set variable aSFld229
	*  Corresponding COBOL Variable is WS-2-9A-S-FLD2
	*  @param value
	**/
   public void setASFld229(char[] value) {
      aSFld229 = checkASFld229Constraints(value);
      serializeASFld229(aSFld229);
   } 

     /**
	 * 	Update ASFld229 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld229(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld229,aSFld229.length);
   	
   }
   
   public void setASFld229(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld229,aSFld229.length);
   	
   }
   
     /**
	 * 	Update ASFld229 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld229(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld229+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld229 with another Field
	 *	@param value
	 */
   public void setASFld229(Field source) {
       replace(source,0,source.length(),beginASFld229,A_SFLD_229_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld229 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld229(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld229,A_SFLD_229_LEN);
   	
   }
   
     /**
	 * 	Update ASFld229 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld229(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld229+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS29
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld129(CONSTANTS.SPACE_30);
         setASFld229(CONSTANTS.SPACE_40);
   }

		public static int getAS29FieldLength() {
			return A_S_29_LENGTH;
		}

}
  
