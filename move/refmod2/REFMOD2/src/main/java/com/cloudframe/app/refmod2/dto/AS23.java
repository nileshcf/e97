package com.cloudframe.app.refmod2.dto;

/**
*  The class AS23 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS23 extends AS23Serialized {
   

						private char[] aSFld123 = Field.fillLowValue(30);

						private char[] aSFld223 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS23
	**/
    public AS23() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld123
	 *	@return aSFld123
	 */
   public char[] getASFld123() throws CFException{
     if (isASFld123Modified()) { 
        aSFld123 = refreshASFld123();
     }
   		return aSFld123;
   }

  
	/**
	*  set variable aSFld123
	*  Corresponding COBOL Variable is WS-2-3A-S-FLD1
	*  @param value
	**/
   public void setASFld123(char[] value) {
      aSFld123 = checkASFld123Constraints(value);
      serializeASFld123(aSFld123);
   } 

     /**
	 * 	Update ASFld123 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld123(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld123,aSFld123.length);
   	
   }
   
   public void setASFld123(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld123,aSFld123.length);
   	
   }
   
     /**
	 * 	Update ASFld123 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld123(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld123+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld123 with another Field
	 *	@param value
	 */
   public void setASFld123(Field source) {
       replace(source,0,source.length(),beginASFld123,A_SFLD_123_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld123 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld123(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld123,A_SFLD_123_LEN);
   	
   }
   
     /**
	 * 	Update ASFld123 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld123(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld123+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld223
	 *	@return aSFld223
	 */
   public char[] getASFld223() throws CFException{
     if (isASFld223Modified()) { 
        aSFld223 = refreshASFld223();
     }
   		return aSFld223;
   }

  
	/**
	*  set variable aSFld223
	*  Corresponding COBOL Variable is WS-2-3A-S-FLD2
	*  @param value
	**/
   public void setASFld223(char[] value) {
      aSFld223 = checkASFld223Constraints(value);
      serializeASFld223(aSFld223);
   } 

     /**
	 * 	Update ASFld223 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld223(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld223,aSFld223.length);
   	
   }
   
   public void setASFld223(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld223,aSFld223.length);
   	
   }
   
     /**
	 * 	Update ASFld223 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld223(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld223+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld223 with another Field
	 *	@param value
	 */
   public void setASFld223(Field source) {
       replace(source,0,source.length(),beginASFld223,A_SFLD_223_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld223 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld223(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld223,A_SFLD_223_LEN);
   	
   }
   
     /**
	 * 	Update ASFld223 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld223(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld223+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS23
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld123(CONSTANTS.SPACE_30);
         setASFld223(CONSTANTS.SPACE_40);
   }

		public static int getAS23FieldLength() {
			return A_S_23_LENGTH;
		}

}
  
