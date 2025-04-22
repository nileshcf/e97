package com.cloudframe.app.global.sharedvar;

/**
*  The class AT12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT12 extends AT12Serialized { 
   

						private char[] aTFld112 = Field.fillLowValue(20);

						private char[] aTFld212 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT12
	**/
    public AT12() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld112
	 *	@return aTFld112
	 */
   public char[] getATFld112() throws CFException{
     if (isATFld112Modified()) { 
        aTFld112 = refreshATFld112();
     }
   		return aTFld112;
   }

  
	/**
	*  set variable aTFld112
	*  Corresponding COBOL Variable is WS-12A-T-FLD1
	*  @param value
	**/
   public void setATFld112(char[] value) {
      aTFld112 = checkATFld112Constraints(value);
      serializeATFld112(aTFld112);
   } 

     /**
	 * 	Update ATFld112 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld112(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld112,aTFld112.length);
   	
   }
   
   public void setATFld112(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld112,aTFld112.length);
   	
   }
   
     /**
	 * 	Update ATFld112 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld112(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld112+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld112 with another Field
	 *	@param value
	 */
   public void setATFld112(Field source) {
       replace(source,0,source.length(),beginATFld112,A_TFLD_112_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld112 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld112(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld112,A_TFLD_112_LEN);
   	
   }
   
     /**
	 * 	Update ATFld112 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld112(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld112+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld212
	 *	@return aTFld212
	 */
   public char[] getATFld212() throws CFException{
     if (isATFld212Modified()) { 
        aTFld212 = refreshATFld212();
     }
   		return aTFld212;
   }

  
	/**
	*  set variable aTFld212
	*  Corresponding COBOL Variable is WS-12A-T-FLD2
	*  @param value
	**/
   public void setATFld212(char[] value) {
      aTFld212 = checkATFld212Constraints(value);
      serializeATFld212(aTFld212);
   } 

     /**
	 * 	Update ATFld212 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld212(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld212,aTFld212.length);
   	
   }
   
   public void setATFld212(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld212,aTFld212.length);
   	
   }
   
     /**
	 * 	Update ATFld212 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld212+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld212 with another Field
	 *	@param value
	 */
   public void setATFld212(Field source) {
       replace(source,0,source.length(),beginATFld212,A_TFLD_212_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld212 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld212(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld212,A_TFLD_212_LEN);
   	
   }
   
     /**
	 * 	Update ATFld212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld212+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT12
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld112(CONSTANTS.SPACE_20);
         setATFld212(CONSTANTS.SPACE_40);
   }

		public static int getAT12FieldLength() {
			return A_T_12_LENGTH;
		}

}
  
