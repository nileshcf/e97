package com.cloudframe.app.refmod1.dto;

/**
*  The class AS3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS3 extends AS3Serialized {
   

						private char[] aSFld13 = Field.fillLowValue(30);

						private char[] aSFld23 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS3
	**/
    public AS3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld13
	 *	@return aSFld13
	 */
   public char[] getASFld13() throws CFException{
     if (isASFld13Modified()) { 
        aSFld13 = refreshASFld13();
     }
   		return aSFld13;
   }

  
	/**
	*  set variable aSFld13
	*  Corresponding COBOL Variable is WS-3A-S-FLD1
	*  @param value
	**/
   public void setASFld13(char[] value) {
      aSFld13 = checkASFld13Constraints(value);
      serializeASFld13(aSFld13);
   } 

     /**
	 * 	Update ASFld13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld13,aSFld13.length);
   	
   }
   
   public void setASFld13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld13,aSFld13.length);
   	
   }
   
     /**
	 * 	Update ASFld13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld13 with another Field
	 *	@param value
	 */
   public void setASFld13(Field source) {
       replace(source,0,source.length(),beginASFld13,A_SFLD_13_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld13,A_SFLD_13_LEN);
   	
   }
   
     /**
	 * 	Update ASFld13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld23
	 *	@return aSFld23
	 */
   public char[] getASFld23() throws CFException{
     if (isASFld23Modified()) { 
        aSFld23 = refreshASFld23();
     }
   		return aSFld23;
   }

  
	/**
	*  set variable aSFld23
	*  Corresponding COBOL Variable is WS-3A-S-FLD2
	*  @param value
	**/
   public void setASFld23(char[] value) {
      aSFld23 = checkASFld23Constraints(value);
      serializeASFld23(aSFld23);
   } 

     /**
	 * 	Update ASFld23 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld23(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld23,aSFld23.length);
   	
   }
   
   public void setASFld23(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld23,aSFld23.length);
   	
   }
   
     /**
	 * 	Update ASFld23 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld23(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld23+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld23 with another Field
	 *	@param value
	 */
   public void setASFld23(Field source) {
       replace(source,0,source.length(),beginASFld23,A_SFLD_23_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld23 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld23(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld23,A_SFLD_23_LEN);
   	
   }
   
     /**
	 * 	Update ASFld23 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld23(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld23+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld13(CONSTANTS.SPACE_30);
         setASFld23(CONSTANTS.SPACE_40);
   }

		public static int getAS3FieldLength() {
			return A_S_3_LENGTH;
		}

}
  
