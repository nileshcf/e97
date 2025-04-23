package com.cloudframe.app.global.sharedvar;

/**
*  The class AT15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT15 extends AT15Serialized { 
   

						private char[] aTFld115 = Field.fillLowValue(20);

						private char[] aTFld215 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT15
	**/
    public AT15() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld115
	 *	@return aTFld115
	 */
   public char[] getATFld115() throws CFException{
     if (isATFld115Modified()) { 
        aTFld115 = refreshATFld115();
     }
   		return aTFld115;
   }

  
	/**
	*  set variable aTFld115
	*  Corresponding COBOL Variable is WS-15A-T-FLD1
	*  @param value
	**/
   public void setATFld115(char[] value) {
      aTFld115 = checkATFld115Constraints(value);
      serializeATFld115(aTFld115);
   } 

     /**
	 * 	Update ATFld115 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld115(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld115,aTFld115.length);
   	
   }
   
   public void setATFld115(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld115,aTFld115.length);
   	
   }
   
     /**
	 * 	Update ATFld115 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld115(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld115+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld115 with another Field
	 *	@param value
	 */
   public void setATFld115(Field source) {
       replace(source,0,source.length(),beginATFld115,A_TFLD_115_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld115 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld115(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld115,A_TFLD_115_LEN);
   	
   }
   
     /**
	 * 	Update ATFld115 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld115(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld115+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld215
	 *	@return aTFld215
	 */
   public char[] getATFld215() throws CFException{
     if (isATFld215Modified()) { 
        aTFld215 = refreshATFld215();
     }
   		return aTFld215;
   }

  
	/**
	*  set variable aTFld215
	*  Corresponding COBOL Variable is WS-15A-T-FLD2
	*  @param value
	**/
   public void setATFld215(char[] value) {
      aTFld215 = checkATFld215Constraints(value);
      serializeATFld215(aTFld215);
   } 

     /**
	 * 	Update ATFld215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld215,aTFld215.length);
   	
   }
   
   public void setATFld215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld215,aTFld215.length);
   	
   }
   
     /**
	 * 	Update ATFld215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld215 with another Field
	 *	@param value
	 */
   public void setATFld215(Field source) {
       replace(source,0,source.length(),beginATFld215,A_TFLD_215_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld215,A_TFLD_215_LEN);
   	
   }
   
     /**
	 * 	Update ATFld215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld215+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld115(CONSTANTS.SPACE_20);
         setATFld215(CONSTANTS.SPACE_40);
   }

		public static int getAT15FieldLength() {
			return A_T_15_LENGTH;
		}

}
  
