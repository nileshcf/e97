package com.cloudframe.app.refmod1.dto;

/**
*  The class AT1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT1 extends AT1Serialized { 
   

						private char[] aTFld11 = Field.fillLowValue(20);

						private char[] aTFld21 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT1
	**/
    public AT1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld11
	 *	@return aTFld11
	 */
   public char[] getATFld11() throws CFException{
     if (isATFld11Modified()) { 
        aTFld11 = refreshATFld11();
     }
   		return aTFld11;
   }

  
	/**
	*  set variable aTFld11
	*  Corresponding COBOL Variable is WS-1A-T-FLD1
	*  @param value
	**/
   public void setATFld11(char[] value) {
      aTFld11 = checkATFld11Constraints(value);
      serializeATFld11(aTFld11);
   } 

     /**
	 * 	Update ATFld11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld11,aTFld11.length);
   	
   }
   
   public void setATFld11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld11,aTFld11.length);
   	
   }
   
     /**
	 * 	Update ATFld11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld11 with another Field
	 *	@param value
	 */
   public void setATFld11(Field source) {
       replace(source,0,source.length(),beginATFld11,A_TFLD_11_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld11,A_TFLD_11_LEN);
   	
   }
   
     /**
	 * 	Update ATFld11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld21
	 *	@return aTFld21
	 */
   public char[] getATFld21() throws CFException{
     if (isATFld21Modified()) { 
        aTFld21 = refreshATFld21();
     }
   		return aTFld21;
   }

  
	/**
	*  set variable aTFld21
	*  Corresponding COBOL Variable is WS-1A-T-FLD2
	*  @param value
	**/
   public void setATFld21(char[] value) {
      aTFld21 = checkATFld21Constraints(value);
      serializeATFld21(aTFld21);
   } 

     /**
	 * 	Update ATFld21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld21,aTFld21.length);
   	
   }
   
   public void setATFld21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld21,aTFld21.length);
   	
   }
   
     /**
	 * 	Update ATFld21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld21 with another Field
	 *	@param value
	 */
   public void setATFld21(Field source) {
       replace(source,0,source.length(),beginATFld21,A_TFLD_21_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld21,A_TFLD_21_LEN);
   	
   }
   
     /**
	 * 	Update ATFld21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld21+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld11(CONSTANTS.SPACE_20);
         setATFld21(CONSTANTS.SPACE_40);
   }

		public static int getAT1FieldLength() {
			return A_T_1_LENGTH;
		}

}
  
