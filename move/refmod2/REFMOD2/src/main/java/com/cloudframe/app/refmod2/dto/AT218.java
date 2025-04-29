package com.cloudframe.app.refmod2.dto;

/**
*  The class AT218 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT218 extends AT218Serialized { 
   

						private char[] aTFld1218 = Field.fillLowValue(20);

						private char[] aTFld2218 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT218
	**/
    public AT218() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT218. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT218(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1218
	 *	@return aTFld1218
	 */
   public char[] getATFld1218() throws CFException{
     if (isATFld1218Modified()) { 
        aTFld1218 = refreshATFld1218();
     }
   		return aTFld1218;
   }

  
	/**
	*  set variable aTFld1218
	*  Corresponding COBOL Variable is WS-2-18A-T-FLD1
	*  @param value
	**/
   public void setATFld1218(char[] value) {
      aTFld1218 = checkATFld1218Constraints(value);
      serializeATFld1218(aTFld1218);
   } 

     /**
	 * 	Update ATFld1218 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1218(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1218,aTFld1218.length);
   	
   }
   
   public void setATFld1218(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1218,aTFld1218.length);
   	
   }
   
     /**
	 * 	Update ATFld1218 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1218+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1218 with another Field
	 *	@param value
	 */
   public void setATFld1218(Field source) {
       replace(source,0,source.length(),beginATFld1218,A_TFLD_1218_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1218 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1218(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1218,A_TFLD_1218_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1218+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2218
	 *	@return aTFld2218
	 */
   public char[] getATFld2218() throws CFException{
     if (isATFld2218Modified()) { 
        aTFld2218 = refreshATFld2218();
     }
   		return aTFld2218;
   }

  
	/**
	*  set variable aTFld2218
	*  Corresponding COBOL Variable is WS-2-18A-T-FLD2
	*  @param value
	**/
   public void setATFld2218(char[] value) {
      aTFld2218 = checkATFld2218Constraints(value);
      serializeATFld2218(aTFld2218);
   } 

     /**
	 * 	Update ATFld2218 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2218(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2218,aTFld2218.length);
   	
   }
   
   public void setATFld2218(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2218,aTFld2218.length);
   	
   }
   
     /**
	 * 	Update ATFld2218 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2218+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2218 with another Field
	 *	@param value
	 */
   public void setATFld2218(Field source) {
       replace(source,0,source.length(),beginATFld2218,A_TFLD_2218_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2218 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2218(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2218,A_TFLD_2218_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2218+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT218
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1218(CONSTANTS.SPACE_20);
         setATFld2218(CONSTANTS.SPACE_40);
   }

		public static int getAT218FieldLength() {
			return A_T_218_LENGTH;
		}

}
  
