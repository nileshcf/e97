package com.cloudframe.app.refmod3.dto;

/**
*  The class AT210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT210 extends AT210Serialized { 
   

						private char[] aTFld1210 = Field.fillLowValue(20);

						private char[] aTFld2210 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT210
	**/
    public AT210() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT210. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT210(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1210
	 *	@return aTFld1210
	 */
   public char[] getATFld1210() throws CFException{
     if (isATFld1210Modified()) { 
        aTFld1210 = refreshATFld1210();
     }
   		return aTFld1210;
   }

  
	/**
	*  set variable aTFld1210
	*  Corresponding COBOL Variable is WS-2-10A-T-FLD1
	*  @param value
	**/
   public void setATFld1210(char[] value) {
      aTFld1210 = checkATFld1210Constraints(value);
      serializeATFld1210(aTFld1210);
   } 

     /**
	 * 	Update ATFld1210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1210,aTFld1210.length);
   	
   }
   
   public void setATFld1210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1210,aTFld1210.length);
   	
   }
   
     /**
	 * 	Update ATFld1210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1210 with another Field
	 *	@param value
	 */
   public void setATFld1210(Field source) {
       replace(source,0,source.length(),beginATFld1210,A_TFLD_1210_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1210,A_TFLD_1210_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2210
	 *	@return aTFld2210
	 */
   public char[] getATFld2210() throws CFException{
     if (isATFld2210Modified()) { 
        aTFld2210 = refreshATFld2210();
     }
   		return aTFld2210;
   }

  
	/**
	*  set variable aTFld2210
	*  Corresponding COBOL Variable is WS-2-10A-T-FLD2
	*  @param value
	**/
   public void setATFld2210(char[] value) {
      aTFld2210 = checkATFld2210Constraints(value);
      serializeATFld2210(aTFld2210);
   } 

     /**
	 * 	Update ATFld2210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2210,aTFld2210.length);
   	
   }
   
   public void setATFld2210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2210,aTFld2210.length);
   	
   }
   
     /**
	 * 	Update ATFld2210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2210 with another Field
	 *	@param value
	 */
   public void setATFld2210(Field source) {
       replace(source,0,source.length(),beginATFld2210,A_TFLD_2210_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2210,A_TFLD_2210_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2210+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT210
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1210(CONSTANTS.SPACE_20);
         setATFld2210(CONSTANTS.SPACE_40);
   }

		public static int getAT210FieldLength() {
			return A_T_210_LENGTH;
		}

}
  
