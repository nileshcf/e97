package com.cloudframe.app.global.sharedvar;

/**
*  The class AT13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT13 extends AT13Serialized { 
   

						private char[] aTFld113 = Field.fillLowValue(20);

						private char[] aTFld213 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT13
	**/
    public AT13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld113
	 *	@return aTFld113
	 */
   public char[] getATFld113() throws CFException{
     if (isATFld113Modified()) { 
        aTFld113 = refreshATFld113();
     }
   		return aTFld113;
   }

  
	/**
	*  set variable aTFld113
	*  Corresponding COBOL Variable is WS-13A-T-FLD1
	*  @param value
	**/
   public void setATFld113(char[] value) {
      aTFld113 = checkATFld113Constraints(value);
      serializeATFld113(aTFld113);
   } 

     /**
	 * 	Update ATFld113 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld113(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld113,aTFld113.length);
   	
   }
   
   public void setATFld113(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld113,aTFld113.length);
   	
   }
   
     /**
	 * 	Update ATFld113 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld113(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld113+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld113 with another Field
	 *	@param value
	 */
   public void setATFld113(Field source) {
       replace(source,0,source.length(),beginATFld113,A_TFLD_113_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld113 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld113(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld113,A_TFLD_113_LEN);
   	
   }
   
     /**
	 * 	Update ATFld113 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld113(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld113+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld213
	 *	@return aTFld213
	 */
   public char[] getATFld213() throws CFException{
     if (isATFld213Modified()) { 
        aTFld213 = refreshATFld213();
     }
   		return aTFld213;
   }

  
	/**
	*  set variable aTFld213
	*  Corresponding COBOL Variable is WS-13A-T-FLD2
	*  @param value
	**/
   public void setATFld213(char[] value) {
      aTFld213 = checkATFld213Constraints(value);
      serializeATFld213(aTFld213);
   } 

     /**
	 * 	Update ATFld213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld213,aTFld213.length);
   	
   }
   
   public void setATFld213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld213,aTFld213.length);
   	
   }
   
     /**
	 * 	Update ATFld213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld213 with another Field
	 *	@param value
	 */
   public void setATFld213(Field source) {
       replace(source,0,source.length(),beginATFld213,A_TFLD_213_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld213,A_TFLD_213_LEN);
   	
   }
   
     /**
	 * 	Update ATFld213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld213+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld113(CONSTANTS.SPACE_20);
         setATFld213(CONSTANTS.SPACE_40);
   }

		public static int getAT13FieldLength() {
			return A_T_13_LENGTH;
		}

}
  
