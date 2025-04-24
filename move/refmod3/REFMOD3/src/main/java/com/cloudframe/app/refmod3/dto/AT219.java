package com.cloudframe.app.refmod3.dto;

/**
*  The class AT219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT219 extends AT219Serialized { 
   

						private char[] aTFld1219 = Field.fillLowValue(20);

						private char[] aTFld2219 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT219
	**/
    public AT219() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT219. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT219(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1219
	 *	@return aTFld1219
	 */
   public char[] getATFld1219() throws CFException{
     if (isATFld1219Modified()) { 
        aTFld1219 = refreshATFld1219();
     }
   		return aTFld1219;
   }

  
	/**
	*  set variable aTFld1219
	*  Corresponding COBOL Variable is WS-2-19A-T-FLD1
	*  @param value
	**/
   public void setATFld1219(char[] value) {
      aTFld1219 = checkATFld1219Constraints(value);
      serializeATFld1219(aTFld1219);
   } 

     /**
	 * 	Update ATFld1219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1219,aTFld1219.length);
   	
   }
   
   public void setATFld1219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1219,aTFld1219.length);
   	
   }
   
     /**
	 * 	Update ATFld1219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1219 with another Field
	 *	@param value
	 */
   public void setATFld1219(Field source) {
       replace(source,0,source.length(),beginATFld1219,A_TFLD_1219_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1219,A_TFLD_1219_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1219+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2219
	 *	@return aTFld2219
	 */
   public char[] getATFld2219() throws CFException{
     if (isATFld2219Modified()) { 
        aTFld2219 = refreshATFld2219();
     }
   		return aTFld2219;
   }

  
	/**
	*  set variable aTFld2219
	*  Corresponding COBOL Variable is WS-2-19A-T-FLD2
	*  @param value
	**/
   public void setATFld2219(char[] value) {
      aTFld2219 = checkATFld2219Constraints(value);
      serializeATFld2219(aTFld2219);
   } 

     /**
	 * 	Update ATFld2219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2219,aTFld2219.length);
   	
   }
   
   public void setATFld2219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2219,aTFld2219.length);
   	
   }
   
     /**
	 * 	Update ATFld2219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2219 with another Field
	 *	@param value
	 */
   public void setATFld2219(Field source) {
       replace(source,0,source.length(),beginATFld2219,A_TFLD_2219_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2219,A_TFLD_2219_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2219+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT219
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1219(CONSTANTS.SPACE_20);
         setATFld2219(CONSTANTS.SPACE_40);
   }

		public static int getAT219FieldLength() {
			return A_T_219_LENGTH;
		}

}
  
