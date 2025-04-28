package com.cloudframe.app.refmod2.dto;

/**
*  The class AT212 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT212 extends AT212Serialized { 
   

						private char[] aTFld1212 = Field.fillLowValue(20);

						private char[] aTFld2212 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT212
	**/
    public AT212() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT212. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT212(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1212
	 *	@return aTFld1212
	 */
   public char[] getATFld1212() throws CFException{
     if (isATFld1212Modified()) { 
        aTFld1212 = refreshATFld1212();
     }
   		return aTFld1212;
   }

  
	/**
	*  set variable aTFld1212
	*  Corresponding COBOL Variable is WS-2-12A-T-FLD1
	*  @param value
	**/
   public void setATFld1212(char[] value) {
      aTFld1212 = checkATFld1212Constraints(value);
      serializeATFld1212(aTFld1212);
   } 

     /**
	 * 	Update ATFld1212 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1212(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1212,aTFld1212.length);
   	
   }
   
   public void setATFld1212(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1212,aTFld1212.length);
   	
   }
   
     /**
	 * 	Update ATFld1212 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1212+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1212 with another Field
	 *	@param value
	 */
   public void setATFld1212(Field source) {
       replace(source,0,source.length(),beginATFld1212,A_TFLD_1212_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1212 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1212(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1212,A_TFLD_1212_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1212+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2212
	 *	@return aTFld2212
	 */
   public char[] getATFld2212() throws CFException{
     if (isATFld2212Modified()) { 
        aTFld2212 = refreshATFld2212();
     }
   		return aTFld2212;
   }

  
	/**
	*  set variable aTFld2212
	*  Corresponding COBOL Variable is WS-2-12A-T-FLD2
	*  @param value
	**/
   public void setATFld2212(char[] value) {
      aTFld2212 = checkATFld2212Constraints(value);
      serializeATFld2212(aTFld2212);
   } 

     /**
	 * 	Update ATFld2212 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2212(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2212,aTFld2212.length);
   	
   }
   
   public void setATFld2212(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2212,aTFld2212.length);
   	
   }
   
     /**
	 * 	Update ATFld2212 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2212(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2212+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2212 with another Field
	 *	@param value
	 */
   public void setATFld2212(Field source) {
       replace(source,0,source.length(),beginATFld2212,A_TFLD_2212_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2212 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2212(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2212,A_TFLD_2212_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2212 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2212(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2212+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT212
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1212(CONSTANTS.SPACE_20);
         setATFld2212(CONSTANTS.SPACE_40);
   }

		public static int getAT212FieldLength() {
			return A_T_212_LENGTH;
		}

}
  
