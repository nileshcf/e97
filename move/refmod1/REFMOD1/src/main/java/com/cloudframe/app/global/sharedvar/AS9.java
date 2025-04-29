package com.cloudframe.app.global.sharedvar;

/**
*  The class AS9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS9 extends AS9Serialized { 
   

						private char[] aSFld19 = Field.fillLowValue(30);

						private char[] aSFld29 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS9
	**/
    public AS9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld19
	 *	@return aSFld19
	 */
   public char[] getASFld19() throws CFException{
     if (isASFld19Modified()) { 
        aSFld19 = refreshASFld19();
     }
   		return aSFld19;
   }

  
	/**
	*  set variable aSFld19
	*  Corresponding COBOL Variable is WS-9A-S-FLD1
	*  @param value
	**/
   public void setASFld19(char[] value) {
      aSFld19 = checkASFld19Constraints(value);
      serializeASFld19(aSFld19);
   } 

     /**
	 * 	Update ASFld19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld19,aSFld19.length);
   	
   }
   
   public void setASFld19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld19,aSFld19.length);
   	
   }
   
     /**
	 * 	Update ASFld19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld19 with another Field
	 *	@param value
	 */
   public void setASFld19(Field source) {
       replace(source,0,source.length(),beginASFld19,A_SFLD_19_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld19,A_SFLD_19_LEN);
   	
   }
   
     /**
	 * 	Update ASFld19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld29
	 *	@return aSFld29
	 */
   public char[] getASFld29() throws CFException{
     if (isASFld29Modified()) { 
        aSFld29 = refreshASFld29();
     }
   		return aSFld29;
   }

  
	/**
	*  set variable aSFld29
	*  Corresponding COBOL Variable is WS-9A-S-FLD2
	*  @param value
	**/
   public void setASFld29(char[] value) {
      aSFld29 = checkASFld29Constraints(value);
      serializeASFld29(aSFld29);
   } 

     /**
	 * 	Update ASFld29 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld29(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld29,aSFld29.length);
   	
   }
   
   public void setASFld29(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld29,aSFld29.length);
   	
   }
   
     /**
	 * 	Update ASFld29 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld29+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld29 with another Field
	 *	@param value
	 */
   public void setASFld29(Field source) {
       replace(source,0,source.length(),beginASFld29,A_SFLD_29_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld29 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld29(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld29,A_SFLD_29_LEN);
   	
   }
   
     /**
	 * 	Update ASFld29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld29+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld19(CONSTANTS.SPACE_30);
         setASFld29(CONSTANTS.SPACE_40);
   }

		public static int getAS9FieldLength() {
			return A_S_9_LENGTH;
		}

}
  
