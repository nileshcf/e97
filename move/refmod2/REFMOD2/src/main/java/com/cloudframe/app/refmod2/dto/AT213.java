package com.cloudframe.app.refmod2.dto;

/**
*  The class AT213 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT213 extends AT213Serialized { 
   

						private char[] aTFld1213 = Field.fillLowValue(20);

						private char[] aTFld2213 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT213
	**/
    public AT213() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT213. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT213(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1213
	 *	@return aTFld1213
	 */
   public char[] getATFld1213() throws CFException{
     if (isATFld1213Modified()) { 
        aTFld1213 = refreshATFld1213();
     }
   		return aTFld1213;
   }

  
	/**
	*  set variable aTFld1213
	*  Corresponding COBOL Variable is WS-2-13A-T-FLD1
	*  @param value
	**/
   public void setATFld1213(char[] value) {
      aTFld1213 = checkATFld1213Constraints(value);
      serializeATFld1213(aTFld1213);
   } 

     /**
	 * 	Update ATFld1213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1213,aTFld1213.length);
   	
   }
   
   public void setATFld1213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1213,aTFld1213.length);
   	
   }
   
     /**
	 * 	Update ATFld1213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1213 with another Field
	 *	@param value
	 */
   public void setATFld1213(Field source) {
       replace(source,0,source.length(),beginATFld1213,A_TFLD_1213_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1213,A_TFLD_1213_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1213+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2213
	 *	@return aTFld2213
	 */
   public char[] getATFld2213() throws CFException{
     if (isATFld2213Modified()) { 
        aTFld2213 = refreshATFld2213();
     }
   		return aTFld2213;
   }

  
	/**
	*  set variable aTFld2213
	*  Corresponding COBOL Variable is WS-2-13A-T-FLD2
	*  @param value
	**/
   public void setATFld2213(char[] value) {
      aTFld2213 = checkATFld2213Constraints(value);
      serializeATFld2213(aTFld2213);
   } 

     /**
	 * 	Update ATFld2213 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2213(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2213,aTFld2213.length);
   	
   }
   
   public void setATFld2213(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2213,aTFld2213.length);
   	
   }
   
     /**
	 * 	Update ATFld2213 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2213(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2213+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2213 with another Field
	 *	@param value
	 */
   public void setATFld2213(Field source) {
       replace(source,0,source.length(),beginATFld2213,A_TFLD_2213_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2213 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2213(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2213,A_TFLD_2213_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2213 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2213(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2213+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT213
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1213(CONSTANTS.SPACE_20);
         setATFld2213(CONSTANTS.SPACE_40);
   }

		public static int getAT213FieldLength() {
			return A_T_213_LENGTH;
		}

}
  
