package com.cloudframe.app.global.sharedvar;

/**
*  The class AT8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT8 extends AT8Serialized { 
   

						private char[] aTFld18 = Field.fillLowValue(20);

						private char[] aTFld28 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT8
	**/
    public AT8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld18
	 *	@return aTFld18
	 */
   public char[] getATFld18() throws CFException{
     if (isATFld18Modified()) { 
        aTFld18 = refreshATFld18();
     }
   		return aTFld18;
   }

  
	/**
	*  set variable aTFld18
	*  Corresponding COBOL Variable is WS-8A-T-FLD1
	*  @param value
	**/
   public void setATFld18(char[] value) {
      aTFld18 = checkATFld18Constraints(value);
      serializeATFld18(aTFld18);
   } 

     /**
	 * 	Update ATFld18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld18,aTFld18.length);
   	
   }
   
   public void setATFld18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld18,aTFld18.length);
   	
   }
   
     /**
	 * 	Update ATFld18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld18 with another Field
	 *	@param value
	 */
   public void setATFld18(Field source) {
       replace(source,0,source.length(),beginATFld18,A_TFLD_18_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld18,A_TFLD_18_LEN);
   	
   }
   
     /**
	 * 	Update ATFld18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld28
	 *	@return aTFld28
	 */
   public char[] getATFld28() throws CFException{
     if (isATFld28Modified()) { 
        aTFld28 = refreshATFld28();
     }
   		return aTFld28;
   }

  
	/**
	*  set variable aTFld28
	*  Corresponding COBOL Variable is WS-8A-T-FLD2
	*  @param value
	**/
   public void setATFld28(char[] value) {
      aTFld28 = checkATFld28Constraints(value);
      serializeATFld28(aTFld28);
   } 

     /**
	 * 	Update ATFld28 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld28(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld28,aTFld28.length);
   	
   }
   
   public void setATFld28(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld28,aTFld28.length);
   	
   }
   
     /**
	 * 	Update ATFld28 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld28(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld28+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld28 with another Field
	 *	@param value
	 */
   public void setATFld28(Field source) {
       replace(source,0,source.length(),beginATFld28,A_TFLD_28_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld28 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld28(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld28,A_TFLD_28_LEN);
   	
   }
   
     /**
	 * 	Update ATFld28 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld28(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld28+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld18(CONSTANTS.SPACE_20);
         setATFld28(CONSTANTS.SPACE_40);
   }

		public static int getAT8FieldLength() {
			return A_T_8_LENGTH;
		}

}
  
