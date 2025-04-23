package com.cloudframe.app.refmod2.dto;

/**
*  The class AT211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT211 extends AT211Serialized { 
   

						private char[] aTFld1211 = Field.fillLowValue(20);

						private char[] aTFld2211 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT211
	**/
    public AT211() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT211. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT211(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld1211
	 *	@return aTFld1211
	 */
   public char[] getATFld1211() throws CFException{
     if (isATFld1211Modified()) { 
        aTFld1211 = refreshATFld1211();
     }
   		return aTFld1211;
   }

  
	/**
	*  set variable aTFld1211
	*  Corresponding COBOL Variable is WS-2-11A-T-FLD1
	*  @param value
	**/
   public void setATFld1211(char[] value) {
      aTFld1211 = checkATFld1211Constraints(value);
      serializeATFld1211(aTFld1211);
   } 

     /**
	 * 	Update ATFld1211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1211,aTFld1211.length);
   	
   }
   
   public void setATFld1211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1211,aTFld1211.length);
   	
   }
   
     /**
	 * 	Update ATFld1211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1211 with another Field
	 *	@param value
	 */
   public void setATFld1211(Field source) {
       replace(source,0,source.length(),beginATFld1211,A_TFLD_1211_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1211,A_TFLD_1211_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1211+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2211
	 *	@return aTFld2211
	 */
   public char[] getATFld2211() throws CFException{
     if (isATFld2211Modified()) { 
        aTFld2211 = refreshATFld2211();
     }
   		return aTFld2211;
   }

  
	/**
	*  set variable aTFld2211
	*  Corresponding COBOL Variable is WS-2-11A-T-FLD2
	*  @param value
	**/
   public void setATFld2211(char[] value) {
      aTFld2211 = checkATFld2211Constraints(value);
      serializeATFld2211(aTFld2211);
   } 

     /**
	 * 	Update ATFld2211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2211,aTFld2211.length);
   	
   }
   
   public void setATFld2211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2211,aTFld2211.length);
   	
   }
   
     /**
	 * 	Update ATFld2211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2211 with another Field
	 *	@param value
	 */
   public void setATFld2211(Field source) {
       replace(source,0,source.length(),beginATFld2211,A_TFLD_2211_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2211,A_TFLD_2211_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2211+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT211
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1211(CONSTANTS.SPACE_20);
         setATFld2211(CONSTANTS.SPACE_40);
   }

		public static int getAT211FieldLength() {
			return A_T_211_LENGTH;
		}

}
  
