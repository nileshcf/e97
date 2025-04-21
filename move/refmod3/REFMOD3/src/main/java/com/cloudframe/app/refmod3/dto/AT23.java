package com.cloudframe.app.refmod3.dto;

/**
*  The class AT23 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT23 extends AT23Serialized {
   

						private char[] aTFld123 = Field.fillLowValue(20);

						private char[] aTFld223 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT23
	**/
    public AT23() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld123
	 *	@return aTFld123
	 */
   public char[] getATFld123() throws CFException{
     if (isATFld123Modified()) { 
        aTFld123 = refreshATFld123();
     }
   		return aTFld123;
   }

  
	/**
	*  set variable aTFld123
	*  Corresponding COBOL Variable is WS-2-3A-T-FLD1
	*  @param value
	**/
   public void setATFld123(char[] value) {
      aTFld123 = checkATFld123Constraints(value);
      serializeATFld123(aTFld123);
   } 

     /**
	 * 	Update ATFld123 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld123(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld123,aTFld123.length);
   	
   }
   
   public void setATFld123(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld123,aTFld123.length);
   	
   }
   
     /**
	 * 	Update ATFld123 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld123(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld123+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld123 with another Field
	 *	@param value
	 */
   public void setATFld123(Field source) {
       replace(source,0,source.length(),beginATFld123,A_TFLD_123_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld123 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld123(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld123,A_TFLD_123_LEN);
   	
   }
   
     /**
	 * 	Update ATFld123 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld123(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld123+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld223
	 *	@return aTFld223
	 */
   public char[] getATFld223() throws CFException{
     if (isATFld223Modified()) { 
        aTFld223 = refreshATFld223();
     }
   		return aTFld223;
   }

  
	/**
	*  set variable aTFld223
	*  Corresponding COBOL Variable is WS-2-3A-T-FLD2
	*  @param value
	**/
   public void setATFld223(char[] value) {
      aTFld223 = checkATFld223Constraints(value);
      serializeATFld223(aTFld223);
   } 

     /**
	 * 	Update ATFld223 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld223(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld223,aTFld223.length);
   	
   }
   
   public void setATFld223(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld223,aTFld223.length);
   	
   }
   
     /**
	 * 	Update ATFld223 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld223(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld223+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld223 with another Field
	 *	@param value
	 */
   public void setATFld223(Field source) {
       replace(source,0,source.length(),beginATFld223,A_TFLD_223_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld223 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld223(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld223,A_TFLD_223_LEN);
   	
   }
   
     /**
	 * 	Update ATFld223 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld223(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld223+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT23
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld123(CONSTANTS.SPACE_20);
         setATFld223(CONSTANTS.SPACE_40);
   }

		public static int getAT23FieldLength() {
			return A_T_23_LENGTH;
		}

}
  
