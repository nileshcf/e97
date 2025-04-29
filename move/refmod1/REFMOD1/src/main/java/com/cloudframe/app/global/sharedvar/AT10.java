package com.cloudframe.app.global.sharedvar;

/**
*  The class AT10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT10 extends AT10Serialized { 
   

						private char[] aTFld110 = Field.fillLowValue(20);

						private char[] aTFld210 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT10
	**/
    public AT10() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld110
	 *	@return aTFld110
	 */
   public char[] getATFld110() throws CFException{
     if (isATFld110Modified()) { 
        aTFld110 = refreshATFld110();
     }
   		return aTFld110;
   }

  
	/**
	*  set variable aTFld110
	*  Corresponding COBOL Variable is WS-10A-T-FLD1
	*  @param value
	**/
   public void setATFld110(char[] value) {
      aTFld110 = checkATFld110Constraints(value);
      serializeATFld110(aTFld110);
   } 

     /**
	 * 	Update ATFld110 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld110(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld110,aTFld110.length);
   	
   }
   
   public void setATFld110(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld110,aTFld110.length);
   	
   }
   
     /**
	 * 	Update ATFld110 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld110(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld110+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld110 with another Field
	 *	@param value
	 */
   public void setATFld110(Field source) {
       replace(source,0,source.length(),beginATFld110,A_TFLD_110_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld110 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld110(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld110,A_TFLD_110_LEN);
   	
   }
   
     /**
	 * 	Update ATFld110 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld110(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld110+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld210
	 *	@return aTFld210
	 */
   public char[] getATFld210() throws CFException{
     if (isATFld210Modified()) { 
        aTFld210 = refreshATFld210();
     }
   		return aTFld210;
   }

  
	/**
	*  set variable aTFld210
	*  Corresponding COBOL Variable is WS-10A-T-FLD2
	*  @param value
	**/
   public void setATFld210(char[] value) {
      aTFld210 = checkATFld210Constraints(value);
      serializeATFld210(aTFld210);
   } 

     /**
	 * 	Update ATFld210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld210,aTFld210.length);
   	
   }
   
   public void setATFld210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld210,aTFld210.length);
   	
   }
   
     /**
	 * 	Update ATFld210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld210 with another Field
	 *	@param value
	 */
   public void setATFld210(Field source) {
       replace(source,0,source.length(),beginATFld210,A_TFLD_210_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld210,A_TFLD_210_LEN);
   	
   }
   
     /**
	 * 	Update ATFld210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld210+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld110(CONSTANTS.SPACE_20);
         setATFld210(CONSTANTS.SPACE_40);
   }

		public static int getAT10FieldLength() {
			return A_T_10_LENGTH;
		}

}
  
