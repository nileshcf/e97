package com.cloudframe.app.refmod2.dto;

/**
*  The class AT25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT25 extends AT25Serialized {
   

						private char[] aTFld125 = Field.fillLowValue(20);

						private char[] aTFld225 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT25
	**/
    public AT25() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld125
	 *	@return aTFld125
	 */
   public char[] getATFld125() throws CFException{
     if (isATFld125Modified()) { 
        aTFld125 = refreshATFld125();
     }
   		return aTFld125;
   }

  
	/**
	*  set variable aTFld125
	*  Corresponding COBOL Variable is WS-2-5A-T-FLD1
	*  @param value
	**/
   public void setATFld125(char[] value) {
      aTFld125 = checkATFld125Constraints(value);
      serializeATFld125(aTFld125);
   } 

     /**
	 * 	Update ATFld125 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld125(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld125,aTFld125.length);
   	
   }
   
   public void setATFld125(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld125,aTFld125.length);
   	
   }
   
     /**
	 * 	Update ATFld125 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld125(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld125+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld125 with another Field
	 *	@param value
	 */
   public void setATFld125(Field source) {
       replace(source,0,source.length(),beginATFld125,A_TFLD_125_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld125 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld125(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld125,A_TFLD_125_LEN);
   	
   }
   
     /**
	 * 	Update ATFld125 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld125(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld125+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld225
	 *	@return aTFld225
	 */
   public char[] getATFld225() throws CFException{
     if (isATFld225Modified()) { 
        aTFld225 = refreshATFld225();
     }
   		return aTFld225;
   }

  
	/**
	*  set variable aTFld225
	*  Corresponding COBOL Variable is WS-2-5A-T-FLD2
	*  @param value
	**/
   public void setATFld225(char[] value) {
      aTFld225 = checkATFld225Constraints(value);
      serializeATFld225(aTFld225);
   } 

     /**
	 * 	Update ATFld225 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld225(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld225,aTFld225.length);
   	
   }
   
   public void setATFld225(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld225,aTFld225.length);
   	
   }
   
     /**
	 * 	Update ATFld225 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld225(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld225+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld225 with another Field
	 *	@param value
	 */
   public void setATFld225(Field source) {
       replace(source,0,source.length(),beginATFld225,A_TFLD_225_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld225 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld225(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld225,A_TFLD_225_LEN);
   	
   }
   
     /**
	 * 	Update ATFld225 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld225(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld225+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT25
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld125(CONSTANTS.SPACE_20);
         setATFld225(CONSTANTS.SPACE_40);
   }

		public static int getAT25FieldLength() {
			return A_T_25_LENGTH;
		}

}
  
