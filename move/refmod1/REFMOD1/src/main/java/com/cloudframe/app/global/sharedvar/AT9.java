package com.cloudframe.app.global.sharedvar;

/**
*  The class AT9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT9 extends AT9Serialized { 
   

						private char[] aTFld19 = Field.fillLowValue(20);

						private char[] aTFld29 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT9
	**/
    public AT9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld19
	 *	@return aTFld19
	 */
   public char[] getATFld19() throws CFException{
     if (isATFld19Modified()) { 
        aTFld19 = refreshATFld19();
     }
   		return aTFld19;
   }

  
	/**
	*  set variable aTFld19
	*  Corresponding COBOL Variable is WS-9A-T-FLD1
	*  @param value
	**/
   public void setATFld19(char[] value) {
      aTFld19 = checkATFld19Constraints(value);
      serializeATFld19(aTFld19);
   } 

     /**
	 * 	Update ATFld19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld19,aTFld19.length);
   	
   }
   
   public void setATFld19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld19,aTFld19.length);
   	
   }
   
     /**
	 * 	Update ATFld19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld19 with another Field
	 *	@param value
	 */
   public void setATFld19(Field source) {
       replace(source,0,source.length(),beginATFld19,A_TFLD_19_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld19,A_TFLD_19_LEN);
   	
   }
   
     /**
	 * 	Update ATFld19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld29
	 *	@return aTFld29
	 */
   public char[] getATFld29() throws CFException{
     if (isATFld29Modified()) { 
        aTFld29 = refreshATFld29();
     }
   		return aTFld29;
   }

  
	/**
	*  set variable aTFld29
	*  Corresponding COBOL Variable is WS-9A-T-FLD2
	*  @param value
	**/
   public void setATFld29(char[] value) {
      aTFld29 = checkATFld29Constraints(value);
      serializeATFld29(aTFld29);
   } 

     /**
	 * 	Update ATFld29 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld29(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld29,aTFld29.length);
   	
   }
   
   public void setATFld29(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld29,aTFld29.length);
   	
   }
   
     /**
	 * 	Update ATFld29 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld29(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld29+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld29 with another Field
	 *	@param value
	 */
   public void setATFld29(Field source) {
       replace(source,0,source.length(),beginATFld29,A_TFLD_29_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld29 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld29(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld29,A_TFLD_29_LEN);
   	
   }
   
     /**
	 * 	Update ATFld29 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld29(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld29+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld19(CONSTANTS.SPACE_20);
         setATFld29(CONSTANTS.SPACE_40);
   }

		public static int getAT9FieldLength() {
			return A_T_9_LENGTH;
		}

}
  
