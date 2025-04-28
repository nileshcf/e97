package com.cloudframe.app.global.sharedvar;

/**
*  The class AS15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS15 extends AS15Serialized { 
   

						private char[] aSFld115 = Field.fillLowValue(30);

						private char[] aSFld215 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS15
	**/
    public AS15() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld115
	 *	@return aSFld115
	 */
   public char[] getASFld115() throws CFException{
     if (isASFld115Modified()) { 
        aSFld115 = refreshASFld115();
     }
   		return aSFld115;
   }

  
	/**
	*  set variable aSFld115
	*  Corresponding COBOL Variable is WS-15A-S-FLD1
	*  @param value
	**/
   public void setASFld115(char[] value) {
      aSFld115 = checkASFld115Constraints(value);
      serializeASFld115(aSFld115);
   } 

     /**
	 * 	Update ASFld115 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld115(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld115,aSFld115.length);
   	
   }
   
   public void setASFld115(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld115,aSFld115.length);
   	
   }
   
     /**
	 * 	Update ASFld115 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld115(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld115+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld115 with another Field
	 *	@param value
	 */
   public void setASFld115(Field source) {
       replace(source,0,source.length(),beginASFld115,A_SFLD_115_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld115 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld115(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld115,A_SFLD_115_LEN);
   	
   }
   
     /**
	 * 	Update ASFld115 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld115(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld115+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld215
	 *	@return aSFld215
	 */
   public char[] getASFld215() throws CFException{
     if (isASFld215Modified()) { 
        aSFld215 = refreshASFld215();
     }
   		return aSFld215;
   }

  
	/**
	*  set variable aSFld215
	*  Corresponding COBOL Variable is WS-15A-S-FLD2
	*  @param value
	**/
   public void setASFld215(char[] value) {
      aSFld215 = checkASFld215Constraints(value);
      serializeASFld215(aSFld215);
   } 

     /**
	 * 	Update ASFld215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld215,aSFld215.length);
   	
   }
   
   public void setASFld215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld215,aSFld215.length);
   	
   }
   
     /**
	 * 	Update ASFld215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld215 with another Field
	 *	@param value
	 */
   public void setASFld215(Field source) {
       replace(source,0,source.length(),beginASFld215,A_SFLD_215_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld215,A_SFLD_215_LEN);
   	
   }
   
     /**
	 * 	Update ASFld215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld215+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld115(CONSTANTS.SPACE_30);
         setASFld215(CONSTANTS.SPACE_40);
   }

		public static int getAS15FieldLength() {
			return A_S_15_LENGTH;
		}

}
  
