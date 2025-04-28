package com.cloudframe.app.refmod1.dto;

/**
*  The class AT4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT4 extends AT4Serialized { 
   

						private char[] aTFld14 = Field.fillLowValue(20);

						private char[] aTFld24 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT4
	**/
    public AT4() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld14
	 *	@return aTFld14
	 */
   public char[] getATFld14() throws CFException{
     if (isATFld14Modified()) { 
        aTFld14 = refreshATFld14();
     }
   		return aTFld14;
   }

  
	/**
	*  set variable aTFld14
	*  Corresponding COBOL Variable is WS-4A-T-FLD1
	*  @param value
	**/
   public void setATFld14(char[] value) {
      aTFld14 = checkATFld14Constraints(value);
      serializeATFld14(aTFld14);
   } 

     /**
	 * 	Update ATFld14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld14,aTFld14.length);
   	
   }
   
   public void setATFld14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld14,aTFld14.length);
   	
   }
   
     /**
	 * 	Update ATFld14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld14 with another Field
	 *	@param value
	 */
   public void setATFld14(Field source) {
       replace(source,0,source.length(),beginATFld14,A_TFLD_14_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld14,A_TFLD_14_LEN);
   	
   }
   
     /**
	 * 	Update ATFld14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld24
	 *	@return aTFld24
	 */
   public char[] getATFld24() throws CFException{
     if (isATFld24Modified()) { 
        aTFld24 = refreshATFld24();
     }
   		return aTFld24;
   }

  
	/**
	*  set variable aTFld24
	*  Corresponding COBOL Variable is WS-4A-T-FLD2
	*  @param value
	**/
   public void setATFld24(char[] value) {
      aTFld24 = checkATFld24Constraints(value);
      serializeATFld24(aTFld24);
   } 

     /**
	 * 	Update ATFld24 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld24(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld24,aTFld24.length);
   	
   }
   
   public void setATFld24(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld24,aTFld24.length);
   	
   }
   
     /**
	 * 	Update ATFld24 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld24(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld24+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld24 with another Field
	 *	@param value
	 */
   public void setATFld24(Field source) {
       replace(source,0,source.length(),beginATFld24,A_TFLD_24_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld24 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld24(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld24,A_TFLD_24_LEN);
   	
   }
   
     /**
	 * 	Update ATFld24 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld24(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld24+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT4
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld14(CONSTANTS.SPACE_20);
         setATFld24(CONSTANTS.SPACE_40);
   }

		public static int getAT4FieldLength() {
			return A_T_4_LENGTH;
		}

}
  
