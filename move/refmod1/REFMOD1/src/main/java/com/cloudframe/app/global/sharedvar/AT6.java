package com.cloudframe.app.global.sharedvar;

/**
*  The class AT6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT6 extends AT6Serialized { 
   

						private char[] aTFld16 = Field.fillLowValue(20);

						private char[] aTFld26 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT6
	**/
    public AT6() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld16
	 *	@return aTFld16
	 */
   public char[] getATFld16() throws CFException{
     if (isATFld16Modified()) { 
        aTFld16 = refreshATFld16();
     }
   		return aTFld16;
   }

  
	/**
	*  set variable aTFld16
	*  Corresponding COBOL Variable is WS-6A-T-FLD1
	*  @param value
	**/
   public void setATFld16(char[] value) {
      aTFld16 = checkATFld16Constraints(value);
      serializeATFld16(aTFld16);
   } 

     /**
	 * 	Update ATFld16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld16,aTFld16.length);
   	
   }
   
   public void setATFld16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld16,aTFld16.length);
   	
   }
   
     /**
	 * 	Update ATFld16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld16 with another Field
	 *	@param value
	 */
   public void setATFld16(Field source) {
       replace(source,0,source.length(),beginATFld16,A_TFLD_16_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld16,A_TFLD_16_LEN);
   	
   }
   
     /**
	 * 	Update ATFld16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld26
	 *	@return aTFld26
	 */
   public char[] getATFld26() throws CFException{
     if (isATFld26Modified()) { 
        aTFld26 = refreshATFld26();
     }
   		return aTFld26;
   }

  
	/**
	*  set variable aTFld26
	*  Corresponding COBOL Variable is WS-6A-T-FLD2
	*  @param value
	**/
   public void setATFld26(char[] value) {
      aTFld26 = checkATFld26Constraints(value);
      serializeATFld26(aTFld26);
   } 

     /**
	 * 	Update ATFld26 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld26(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld26,aTFld26.length);
   	
   }
   
   public void setATFld26(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld26,aTFld26.length);
   	
   }
   
     /**
	 * 	Update ATFld26 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld26(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld26+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld26 with another Field
	 *	@param value
	 */
   public void setATFld26(Field source) {
       replace(source,0,source.length(),beginATFld26,A_TFLD_26_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld26 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld26(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld26,A_TFLD_26_LEN);
   	
   }
   
     /**
	 * 	Update ATFld26 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld26(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld26+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld16(CONSTANTS.SPACE_20);
         setATFld26(CONSTANTS.SPACE_40);
   }

		public static int getAT6FieldLength() {
			return A_T_6_LENGTH;
		}

}
  
