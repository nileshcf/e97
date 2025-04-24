package com.cloudframe.app.global.sharedvar;

/**
*  The class AT14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT14 extends AT14Serialized { 
   

						private char[] aTFld114 = Field.fillLowValue(20);

						private char[] aTFld214 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT14
	**/
    public AT14() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld114
	 *	@return aTFld114
	 */
   public char[] getATFld114() throws CFException{
     if (isATFld114Modified()) { 
        aTFld114 = refreshATFld114();
     }
   		return aTFld114;
   }

  
	/**
	*  set variable aTFld114
	*  Corresponding COBOL Variable is WS-14A-T-FLD1
	*  @param value
	**/
   public void setATFld114(char[] value) {
      aTFld114 = checkATFld114Constraints(value);
      serializeATFld114(aTFld114);
   } 

     /**
	 * 	Update ATFld114 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld114(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld114,aTFld114.length);
   	
   }
   
   public void setATFld114(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld114,aTFld114.length);
   	
   }
   
     /**
	 * 	Update ATFld114 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld114(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld114+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld114 with another Field
	 *	@param value
	 */
   public void setATFld114(Field source) {
       replace(source,0,source.length(),beginATFld114,A_TFLD_114_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld114 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld114(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld114,A_TFLD_114_LEN);
   	
   }
   
     /**
	 * 	Update ATFld114 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld114(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld114+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld214
	 *	@return aTFld214
	 */
   public char[] getATFld214() throws CFException{
     if (isATFld214Modified()) { 
        aTFld214 = refreshATFld214();
     }
   		return aTFld214;
   }

  
	/**
	*  set variable aTFld214
	*  Corresponding COBOL Variable is WS-14A-T-FLD2
	*  @param value
	**/
   public void setATFld214(char[] value) {
      aTFld214 = checkATFld214Constraints(value);
      serializeATFld214(aTFld214);
   } 

     /**
	 * 	Update ATFld214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld214,aTFld214.length);
   	
   }
   
   public void setATFld214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld214,aTFld214.length);
   	
   }
   
     /**
	 * 	Update ATFld214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld214 with another Field
	 *	@param value
	 */
   public void setATFld214(Field source) {
       replace(source,0,source.length(),beginATFld214,A_TFLD_214_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld214,A_TFLD_214_LEN);
   	
   }
   
     /**
	 * 	Update ATFld214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld214+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld114(CONSTANTS.SPACE_20);
         setATFld214(CONSTANTS.SPACE_40);
   }

		public static int getAT14FieldLength() {
			return A_T_14_LENGTH;
		}

}
  
