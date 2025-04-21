package com.cloudframe.app.refmod3.dto;

/**
*  The class AT27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT27 extends AT27Serialized { 
   

						private char[] aTFld127 = Field.fillLowValue(20);

						private char[] aTFld227 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT27
	**/
    public AT27() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT27. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT27(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld127
	 *	@return aTFld127
	 */
   public char[] getATFld127() throws CFException{
     if (isATFld127Modified()) { 
        aTFld127 = refreshATFld127();
     }
   		return aTFld127;
   }

  
	/**
	*  set variable aTFld127
	*  Corresponding COBOL Variable is WS-2-7A-T-FLD1
	*  @param value
	**/
   public void setATFld127(char[] value) {
      aTFld127 = checkATFld127Constraints(value);
      serializeATFld127(aTFld127);
   } 

     /**
	 * 	Update ATFld127 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld127(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld127,aTFld127.length);
   	
   }
   
   public void setATFld127(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld127,aTFld127.length);
   	
   }
   
     /**
	 * 	Update ATFld127 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld127(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld127+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld127 with another Field
	 *	@param value
	 */
   public void setATFld127(Field source) {
       replace(source,0,source.length(),beginATFld127,A_TFLD_127_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld127 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld127(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld127,A_TFLD_127_LEN);
   	
   }
   
     /**
	 * 	Update ATFld127 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld127(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld127+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld227
	 *	@return aTFld227
	 */
   public char[] getATFld227() throws CFException{
     if (isATFld227Modified()) { 
        aTFld227 = refreshATFld227();
     }
   		return aTFld227;
   }

  
	/**
	*  set variable aTFld227
	*  Corresponding COBOL Variable is WS-2-7A-T-FLD2
	*  @param value
	**/
   public void setATFld227(char[] value) {
      aTFld227 = checkATFld227Constraints(value);
      serializeATFld227(aTFld227);
   } 

     /**
	 * 	Update ATFld227 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld227(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld227,aTFld227.length);
   	
   }
   
   public void setATFld227(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld227,aTFld227.length);
   	
   }
   
     /**
	 * 	Update ATFld227 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld227(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld227+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld227 with another Field
	 *	@param value
	 */
   public void setATFld227(Field source) {
       replace(source,0,source.length(),beginATFld227,A_TFLD_227_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld227 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld227(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld227,A_TFLD_227_LEN);
   	
   }
   
     /**
	 * 	Update ATFld227 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld227(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld227+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT27
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld127(CONSTANTS.SPACE_20);
         setATFld227(CONSTANTS.SPACE_40);
   }

		public static int getAT27FieldLength() {
			return A_T_27_LENGTH;
		}

}
  
