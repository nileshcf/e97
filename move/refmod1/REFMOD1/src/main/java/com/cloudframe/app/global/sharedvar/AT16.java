package com.cloudframe.app.global.sharedvar;

/**
*  The class AT16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT16 extends AT16Serialized { 
   

						private char[] aTFld116 = Field.fillLowValue(20);

						private char[] aTFld216 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT16
	**/
    public AT16() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT16. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT16(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld116
	 *	@return aTFld116
	 */
   public char[] getATFld116() throws CFException{
     if (isATFld116Modified()) { 
        aTFld116 = refreshATFld116();
     }
   		return aTFld116;
   }

  
	/**
	*  set variable aTFld116
	*  Corresponding COBOL Variable is WS-16A-T-FLD1
	*  @param value
	**/
   public void setATFld116(char[] value) {
      aTFld116 = checkATFld116Constraints(value);
      serializeATFld116(aTFld116);
   } 

     /**
	 * 	Update ATFld116 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld116(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld116,aTFld116.length);
   	
   }
   
   public void setATFld116(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld116,aTFld116.length);
   	
   }
   
     /**
	 * 	Update ATFld116 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld116(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld116+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld116 with another Field
	 *	@param value
	 */
   public void setATFld116(Field source) {
       replace(source,0,source.length(),beginATFld116,A_TFLD_116_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld116 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld116(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld116,A_TFLD_116_LEN);
   	
   }
   
     /**
	 * 	Update ATFld116 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld116(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld116+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld216
	 *	@return aTFld216
	 */
   public char[] getATFld216() throws CFException{
     if (isATFld216Modified()) { 
        aTFld216 = refreshATFld216();
     }
   		return aTFld216;
   }

  
	/**
	*  set variable aTFld216
	*  Corresponding COBOL Variable is WS-16A-T-FLD2
	*  @param value
	**/
   public void setATFld216(char[] value) {
      aTFld216 = checkATFld216Constraints(value);
      serializeATFld216(aTFld216);
   } 

     /**
	 * 	Update ATFld216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld216,aTFld216.length);
   	
   }
   
   public void setATFld216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld216,aTFld216.length);
   	
   }
   
     /**
	 * 	Update ATFld216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld216 with another Field
	 *	@param value
	 */
   public void setATFld216(Field source) {
       replace(source,0,source.length(),beginATFld216,A_TFLD_216_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld216,A_TFLD_216_LEN);
   	
   }
   
     /**
	 * 	Update ATFld216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld216+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT16
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld116(CONSTANTS.SPACE_20);
         setATFld216(CONSTANTS.SPACE_40);
   }

		public static int getAT16FieldLength() {
			return A_T_16_LENGTH;
		}

}
  
