package com.cloudframe.app.global.sharedvar;

/**
*  The class AT5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT5 extends AT5Serialized { 
   

						private char[] aTFld15 = Field.fillLowValue(20);

						private char[] aTFld25 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT5
	**/
    public AT5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld15
	 *	@return aTFld15
	 */
   public char[] getATFld15() throws CFException{
     if (isATFld15Modified()) { 
        aTFld15 = refreshATFld15();
     }
   		return aTFld15;
   }

  
	/**
	*  set variable aTFld15
	*  Corresponding COBOL Variable is WS-5A-T-FLD1
	*  @param value
	**/
   public void setATFld15(char[] value) {
      aTFld15 = checkATFld15Constraints(value);
      serializeATFld15(aTFld15);
   } 

     /**
	 * 	Update ATFld15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld15,aTFld15.length);
   	
   }
   
   public void setATFld15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld15,aTFld15.length);
   	
   }
   
     /**
	 * 	Update ATFld15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld15 with another Field
	 *	@param value
	 */
   public void setATFld15(Field source) {
       replace(source,0,source.length(),beginATFld15,A_TFLD_15_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld15,A_TFLD_15_LEN);
   	
   }
   
     /**
	 * 	Update ATFld15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld25
	 *	@return aTFld25
	 */
   public char[] getATFld25() throws CFException{
     if (isATFld25Modified()) { 
        aTFld25 = refreshATFld25();
     }
   		return aTFld25;
   }

  
	/**
	*  set variable aTFld25
	*  Corresponding COBOL Variable is WS-5A-T-FLD2
	*  @param value
	**/
   public void setATFld25(char[] value) {
      aTFld25 = checkATFld25Constraints(value);
      serializeATFld25(aTFld25);
   } 

     /**
	 * 	Update ATFld25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld25(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld25,aTFld25.length);
   	
   }
   
   public void setATFld25(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld25,aTFld25.length);
   	
   }
   
     /**
	 * 	Update ATFld25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld25+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld25 with another Field
	 *	@param value
	 */
   public void setATFld25(Field source) {
       replace(source,0,source.length(),beginATFld25,A_TFLD_25_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld25(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld25,A_TFLD_25_LEN);
   	
   }
   
     /**
	 * 	Update ATFld25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld25+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld15(CONSTANTS.SPACE_20);
         setATFld25(CONSTANTS.SPACE_40);
   }

		public static int getAT5FieldLength() {
			return A_T_5_LENGTH;
		}

}
  
