package com.cloudframe.app.global.sharedvar;

/**
*  The class AT7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT7 extends AT7Serialized { 
   

						private char[] aTFld17 = Field.fillLowValue(20);

						private char[] aTFld27 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT7
	**/
    public AT7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld17
	 *	@return aTFld17
	 */
   public char[] getATFld17() throws CFException{
     if (isATFld17Modified()) { 
        aTFld17 = refreshATFld17();
     }
   		return aTFld17;
   }

  
	/**
	*  set variable aTFld17
	*  Corresponding COBOL Variable is WS-7A-T-FLD1
	*  @param value
	**/
   public void setATFld17(char[] value) {
      aTFld17 = checkATFld17Constraints(value);
      serializeATFld17(aTFld17);
   } 

     /**
	 * 	Update ATFld17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld17,aTFld17.length);
   	
   }
   
   public void setATFld17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld17,aTFld17.length);
   	
   }
   
     /**
	 * 	Update ATFld17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld17 with another Field
	 *	@param value
	 */
   public void setATFld17(Field source) {
       replace(source,0,source.length(),beginATFld17,A_TFLD_17_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld17,A_TFLD_17_LEN);
   	
   }
   
     /**
	 * 	Update ATFld17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld27
	 *	@return aTFld27
	 */
   public char[] getATFld27() throws CFException{
     if (isATFld27Modified()) { 
        aTFld27 = refreshATFld27();
     }
   		return aTFld27;
   }

  
	/**
	*  set variable aTFld27
	*  Corresponding COBOL Variable is WS-7A-T-FLD2
	*  @param value
	**/
   public void setATFld27(char[] value) {
      aTFld27 = checkATFld27Constraints(value);
      serializeATFld27(aTFld27);
   } 

     /**
	 * 	Update ATFld27 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld27(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld27,aTFld27.length);
   	
   }
   
   public void setATFld27(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld27,aTFld27.length);
   	
   }
   
     /**
	 * 	Update ATFld27 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld27+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld27 with another Field
	 *	@param value
	 */
   public void setATFld27(Field source) {
       replace(source,0,source.length(),beginATFld27,A_TFLD_27_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld27 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld27(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld27,A_TFLD_27_LEN);
   	
   }
   
     /**
	 * 	Update ATFld27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld27+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld17(CONSTANTS.SPACE_20);
         setATFld27(CONSTANTS.SPACE_40);
   }

		public static int getAT7FieldLength() {
			return A_T_7_LENGTH;
		}

}
  
