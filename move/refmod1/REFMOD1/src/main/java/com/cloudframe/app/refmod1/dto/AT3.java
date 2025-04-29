package com.cloudframe.app.refmod1.dto;

/**
*  The class AT3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT3 extends AT3Serialized { 
   

						private char[] aTFld13 = Field.fillLowValue(20);

						private char[] aTFld23 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT3
	**/
    public AT3() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld13
	 *	@return aTFld13
	 */
   public char[] getATFld13() throws CFException{
     if (isATFld13Modified()) { 
        aTFld13 = refreshATFld13();
     }
   		return aTFld13;
   }

  
	/**
	*  set variable aTFld13
	*  Corresponding COBOL Variable is WS-3A-T-FLD1
	*  @param value
	**/
   public void setATFld13(char[] value) {
      aTFld13 = checkATFld13Constraints(value);
      serializeATFld13(aTFld13);
   } 

     /**
	 * 	Update ATFld13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld13,aTFld13.length);
   	
   }
   
   public void setATFld13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld13,aTFld13.length);
   	
   }
   
     /**
	 * 	Update ATFld13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld13 with another Field
	 *	@param value
	 */
   public void setATFld13(Field source) {
       replace(source,0,source.length(),beginATFld13,A_TFLD_13_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld13,A_TFLD_13_LEN);
   	
   }
   
     /**
	 * 	Update ATFld13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld23
	 *	@return aTFld23
	 */
   public char[] getATFld23() throws CFException{
     if (isATFld23Modified()) { 
        aTFld23 = refreshATFld23();
     }
   		return aTFld23;
   }

  
	/**
	*  set variable aTFld23
	*  Corresponding COBOL Variable is WS-3A-T-FLD2
	*  @param value
	**/
   public void setATFld23(char[] value) {
      aTFld23 = checkATFld23Constraints(value);
      serializeATFld23(aTFld23);
   } 

     /**
	 * 	Update ATFld23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld23,aTFld23.length);
   	
   }
   
   public void setATFld23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld23,aTFld23.length);
   	
   }
   
     /**
	 * 	Update ATFld23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld23 with another Field
	 *	@param value
	 */
   public void setATFld23(Field source) {
       replace(source,0,source.length(),beginATFld23,A_TFLD_23_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld23,A_TFLD_23_LEN);
   	
   }
   
     /**
	 * 	Update ATFld23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld23+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld13(CONSTANTS.SPACE_20);
         setATFld23(CONSTANTS.SPACE_40);
   }

		public static int getAT3FieldLength() {
			return A_T_3_LENGTH;
		}

}
  
