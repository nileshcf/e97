package com.cloudframe.app.global.sharedvar;

/**
*  The class AS5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS5 extends AS5Serialized { 
   

						private char[] aSFld15 = Field.fillLowValue(30);

						private char[] aSFld25 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS5
	**/
    public AS5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld15
	 *	@return aSFld15
	 */
   public char[] getASFld15() throws CFException{
     if (isASFld15Modified()) { 
        aSFld15 = refreshASFld15();
     }
   		return aSFld15;
   }

  
	/**
	*  set variable aSFld15
	*  Corresponding COBOL Variable is WS-5A-S-FLD1
	*  @param value
	**/
   public void setASFld15(char[] value) {
      aSFld15 = checkASFld15Constraints(value);
      serializeASFld15(aSFld15);
   } 

     /**
	 * 	Update ASFld15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld15,aSFld15.length);
   	
   }
   
   public void setASFld15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld15,aSFld15.length);
   	
   }
   
     /**
	 * 	Update ASFld15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld15 with another Field
	 *	@param value
	 */
   public void setASFld15(Field source) {
       replace(source,0,source.length(),beginASFld15,A_SFLD_15_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld15,A_SFLD_15_LEN);
   	
   }
   
     /**
	 * 	Update ASFld15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld25
	 *	@return aSFld25
	 */
   public char[] getASFld25() throws CFException{
     if (isASFld25Modified()) { 
        aSFld25 = refreshASFld25();
     }
   		return aSFld25;
   }

  
	/**
	*  set variable aSFld25
	*  Corresponding COBOL Variable is WS-5A-S-FLD2
	*  @param value
	**/
   public void setASFld25(char[] value) {
      aSFld25 = checkASFld25Constraints(value);
      serializeASFld25(aSFld25);
   } 

     /**
	 * 	Update ASFld25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld25,aSFld25.length);
   	
   }
   
   public void setASFld25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld25,aSFld25.length);
   	
   }
   
     /**
	 * 	Update ASFld25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld25 with another Field
	 *	@param value
	 */
   public void setASFld25(Field source) {
       replace(source,0,source.length(),beginASFld25,A_SFLD_25_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld25,A_SFLD_25_LEN);
   	
   }
   
     /**
	 * 	Update ASFld25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld25+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld15(CONSTANTS.SPACE_30);
         setASFld25(CONSTANTS.SPACE_40);
   }

		public static int getAS5FieldLength() {
			return A_S_5_LENGTH;
		}

}
  
