package com.cloudframe.app.global.sharedvar;

/**
*  The class AT17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT17 extends AT17Serialized { 
   

						private char[] aTFld117 = Field.fillLowValue(20);

						private char[] aTFld217 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT17
	**/
    public AT17() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld117
	 *	@return aTFld117
	 */
   public char[] getATFld117() throws CFException{
     if (isATFld117Modified()) { 
        aTFld117 = refreshATFld117();
     }
   		return aTFld117;
   }

  
	/**
	*  set variable aTFld117
	*  Corresponding COBOL Variable is WS-17A-T-FLD1
	*  @param value
	**/
   public void setATFld117(char[] value) {
      aTFld117 = checkATFld117Constraints(value);
      serializeATFld117(aTFld117);
   } 

     /**
	 * 	Update ATFld117 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld117(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld117,aTFld117.length);
   	
   }
   
   public void setATFld117(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld117,aTFld117.length);
   	
   }
   
     /**
	 * 	Update ATFld117 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld117(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld117+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld117 with another Field
	 *	@param value
	 */
   public void setATFld117(Field source) {
       replace(source,0,source.length(),beginATFld117,A_TFLD_117_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld117 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld117(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld117,A_TFLD_117_LEN);
   	
   }
   
     /**
	 * 	Update ATFld117 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld117(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld117+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld217
	 *	@return aTFld217
	 */
   public char[] getATFld217() throws CFException{
     if (isATFld217Modified()) { 
        aTFld217 = refreshATFld217();
     }
   		return aTFld217;
   }

  
	/**
	*  set variable aTFld217
	*  Corresponding COBOL Variable is WS-17A-T-FLD2
	*  @param value
	**/
   public void setATFld217(char[] value) {
      aTFld217 = checkATFld217Constraints(value);
      serializeATFld217(aTFld217);
   } 

     /**
	 * 	Update ATFld217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld217,aTFld217.length);
   	
   }
   
   public void setATFld217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld217,aTFld217.length);
   	
   }
   
     /**
	 * 	Update ATFld217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld217 with another Field
	 *	@param value
	 */
   public void setATFld217(Field source) {
       replace(source,0,source.length(),beginATFld217,A_TFLD_217_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld217,A_TFLD_217_LEN);
   	
   }
   
     /**
	 * 	Update ATFld217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld217+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld117(CONSTANTS.SPACE_20);
         setATFld217(CONSTANTS.SPACE_40);
   }

		public static int getAT17FieldLength() {
			return A_T_17_LENGTH;
		}

}
  
