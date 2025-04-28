package com.cloudframe.app.refmod3.dto;

/**
*  The class AT217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT217 extends AT217Serialized { 
   

						private char[] aTFld1217 = Field.fillLowValue(20);

						private char[] aTFld2217 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT217
	**/
    public AT217() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT217. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT217(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1217
	 *	@return aTFld1217
	 */
   public char[] getATFld1217() throws CFException{
     if (isATFld1217Modified()) { 
        aTFld1217 = refreshATFld1217();
     }
   		return aTFld1217;
   }

  
	/**
	*  set variable aTFld1217
	*  Corresponding COBOL Variable is WS-2-17A-T-FLD1
	*  @param value
	**/
   public void setATFld1217(char[] value) {
      aTFld1217 = checkATFld1217Constraints(value);
      serializeATFld1217(aTFld1217);
   } 

     /**
	 * 	Update ATFld1217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1217,aTFld1217.length);
   	
   }
   
   public void setATFld1217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1217,aTFld1217.length);
   	
   }
   
     /**
	 * 	Update ATFld1217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1217 with another Field
	 *	@param value
	 */
   public void setATFld1217(Field source) {
       replace(source,0,source.length(),beginATFld1217,A_TFLD_1217_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1217,A_TFLD_1217_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1217+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2217
	 *	@return aTFld2217
	 */
   public char[] getATFld2217() throws CFException{
     if (isATFld2217Modified()) { 
        aTFld2217 = refreshATFld2217();
     }
   		return aTFld2217;
   }

  
	/**
	*  set variable aTFld2217
	*  Corresponding COBOL Variable is WS-2-17A-T-FLD2
	*  @param value
	**/
   public void setATFld2217(char[] value) {
      aTFld2217 = checkATFld2217Constraints(value);
      serializeATFld2217(aTFld2217);
   } 

     /**
	 * 	Update ATFld2217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2217,aTFld2217.length);
   	
   }
   
   public void setATFld2217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2217,aTFld2217.length);
   	
   }
   
     /**
	 * 	Update ATFld2217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2217 with another Field
	 *	@param value
	 */
   public void setATFld2217(Field source) {
       replace(source,0,source.length(),beginATFld2217,A_TFLD_2217_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2217,A_TFLD_2217_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2217+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT217
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1217(CONSTANTS.SPACE_20);
         setATFld2217(CONSTANTS.SPACE_40);
   }

		public static int getAT217FieldLength() {
			return A_T_217_LENGTH;
		}

}
  
