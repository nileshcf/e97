package com.cloudframe.app.refmod2.dto;

/**
*  The class AT214 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT214 extends AT214Serialized { 
   

						private char[] aTFld1214 = Field.fillLowValue(20);

						private char[] aTFld2214 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT214
	**/
    public AT214() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT214. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT214(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1214
	 *	@return aTFld1214
	 */
   public char[] getATFld1214() throws CFException{
     if (isATFld1214Modified()) { 
        aTFld1214 = refreshATFld1214();
     }
   		return aTFld1214;
   }

  
	/**
	*  set variable aTFld1214
	*  Corresponding COBOL Variable is WS-2-14A-T-FLD1
	*  @param value
	**/
   public void setATFld1214(char[] value) {
      aTFld1214 = checkATFld1214Constraints(value);
      serializeATFld1214(aTFld1214);
   } 

     /**
	 * 	Update ATFld1214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1214,aTFld1214.length);
   	
   }
   
   public void setATFld1214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1214,aTFld1214.length);
   	
   }
   
     /**
	 * 	Update ATFld1214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1214 with another Field
	 *	@param value
	 */
   public void setATFld1214(Field source) {
       replace(source,0,source.length(),beginATFld1214,A_TFLD_1214_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1214,A_TFLD_1214_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1214+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2214
	 *	@return aTFld2214
	 */
   public char[] getATFld2214() throws CFException{
     if (isATFld2214Modified()) { 
        aTFld2214 = refreshATFld2214();
     }
   		return aTFld2214;
   }

  
	/**
	*  set variable aTFld2214
	*  Corresponding COBOL Variable is WS-2-14A-T-FLD2
	*  @param value
	**/
   public void setATFld2214(char[] value) {
      aTFld2214 = checkATFld2214Constraints(value);
      serializeATFld2214(aTFld2214);
   } 

     /**
	 * 	Update ATFld2214 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2214(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2214,aTFld2214.length);
   	
   }
   
   public void setATFld2214(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2214,aTFld2214.length);
   	
   }
   
     /**
	 * 	Update ATFld2214 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2214(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2214+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2214 with another Field
	 *	@param value
	 */
   public void setATFld2214(Field source) {
       replace(source,0,source.length(),beginATFld2214,A_TFLD_2214_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2214 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2214(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2214,A_TFLD_2214_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2214 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2214(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2214+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT214
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1214(CONSTANTS.SPACE_20);
         setATFld2214(CONSTANTS.SPACE_40);
   }

		public static int getAT214FieldLength() {
			return A_T_214_LENGTH;
		}

}
  
