package com.cloudframe.app.refmod3.dto;

/**
*  The class AT29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT29 extends AT29Serialized { 
   

						private char[] aTFld129 = Field.fillLowValue(20);

						private char[] aTFld229 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT29
	**/
    public AT29() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT29. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT29(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld129
	 *	@return aTFld129
	 */
   public char[] getATFld129() throws CFException{
     if (isATFld129Modified()) { 
        aTFld129 = refreshATFld129();
     }
   		return aTFld129;
   }

  
	/**
	*  set variable aTFld129
	*  Corresponding COBOL Variable is WS-2-9A-T-FLD1
	*  @param value
	**/
   public void setATFld129(char[] value) {
      aTFld129 = checkATFld129Constraints(value);
      serializeATFld129(aTFld129);
   } 

     /**
	 * 	Update ATFld129 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld129(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld129,aTFld129.length);
   	
   }
   
   public void setATFld129(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld129,aTFld129.length);
   	
   }
   
     /**
	 * 	Update ATFld129 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld129(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld129+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld129 with another Field
	 *	@param value
	 */
   public void setATFld129(Field source) {
       replace(source,0,source.length(),beginATFld129,A_TFLD_129_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld129 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld129(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld129,A_TFLD_129_LEN);
   	
   }
   
     /**
	 * 	Update ATFld129 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld129(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld129+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld229
	 *	@return aTFld229
	 */
   public char[] getATFld229() throws CFException{
     if (isATFld229Modified()) { 
        aTFld229 = refreshATFld229();
     }
   		return aTFld229;
   }

  
	/**
	*  set variable aTFld229
	*  Corresponding COBOL Variable is WS-2-9A-T-FLD2
	*  @param value
	**/
   public void setATFld229(char[] value) {
      aTFld229 = checkATFld229Constraints(value);
      serializeATFld229(aTFld229);
   } 

     /**
	 * 	Update ATFld229 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld229(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld229,aTFld229.length);
   	
   }
   
   public void setATFld229(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld229,aTFld229.length);
   	
   }
   
     /**
	 * 	Update ATFld229 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld229(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld229+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld229 with another Field
	 *	@param value
	 */
   public void setATFld229(Field source) {
       replace(source,0,source.length(),beginATFld229,A_TFLD_229_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld229 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld229(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld229,A_TFLD_229_LEN);
   	
   }
   
     /**
	 * 	Update ATFld229 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld229(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld229+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT29
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld129(CONSTANTS.SPACE_20);
         setATFld229(CONSTANTS.SPACE_40);
   }

		public static int getAT29FieldLength() {
			return A_T_29_LENGTH;
		}

}
  
