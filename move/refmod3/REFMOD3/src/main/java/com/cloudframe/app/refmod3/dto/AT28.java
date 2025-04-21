package com.cloudframe.app.refmod3.dto;

/**
*  The class AT28 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT28 extends AT28Serialized { 
   

						private char[] aTFld128 = Field.fillLowValue(20);

						private char[] aTFld228 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT28
	**/
    public AT28() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT28. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT28(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld128
	 *	@return aTFld128
	 */
   public char[] getATFld128() throws CFException{
     if (isATFld128Modified()) { 
        aTFld128 = refreshATFld128();
     }
   		return aTFld128;
   }

  
	/**
	*  set variable aTFld128
	*  Corresponding COBOL Variable is WS-2-8A-T-FLD1
	*  @param value
	**/
   public void setATFld128(char[] value) {
      aTFld128 = checkATFld128Constraints(value);
      serializeATFld128(aTFld128);
   } 

     /**
	 * 	Update ATFld128 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld128(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld128,aTFld128.length);
   	
   }
   
   public void setATFld128(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld128,aTFld128.length);
   	
   }
   
     /**
	 * 	Update ATFld128 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld128(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld128+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld128 with another Field
	 *	@param value
	 */
   public void setATFld128(Field source) {
       replace(source,0,source.length(),beginATFld128,A_TFLD_128_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld128 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld128(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld128,A_TFLD_128_LEN);
   	
   }
   
     /**
	 * 	Update ATFld128 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld128(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld128+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld228
	 *	@return aTFld228
	 */
   public char[] getATFld228() throws CFException{
     if (isATFld228Modified()) { 
        aTFld228 = refreshATFld228();
     }
   		return aTFld228;
   }

  
	/**
	*  set variable aTFld228
	*  Corresponding COBOL Variable is WS-2-8A-T-FLD2
	*  @param value
	**/
   public void setATFld228(char[] value) {
      aTFld228 = checkATFld228Constraints(value);
      serializeATFld228(aTFld228);
   } 

     /**
	 * 	Update ATFld228 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld228(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld228,aTFld228.length);
   	
   }
   
   public void setATFld228(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld228,aTFld228.length);
   	
   }
   
     /**
	 * 	Update ATFld228 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld228(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld228+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld228 with another Field
	 *	@param value
	 */
   public void setATFld228(Field source) {
       replace(source,0,source.length(),beginATFld228,A_TFLD_228_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld228 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld228(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld228,A_TFLD_228_LEN);
   	
   }
   
     /**
	 * 	Update ATFld228 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld228(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld228+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT28
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld128(CONSTANTS.SPACE_20);
         setATFld228(CONSTANTS.SPACE_40);
   }

		public static int getAT28FieldLength() {
			return A_T_28_LENGTH;
		}

}
  
