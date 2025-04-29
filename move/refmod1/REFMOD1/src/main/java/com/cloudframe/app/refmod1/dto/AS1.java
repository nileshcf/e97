package com.cloudframe.app.refmod1.dto;

/**
*  The class AS1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS1 extends AS1Serialized {
   

						private char[] aSFld11 = Field.fillLowValue(30);

						private char[] aSFld21 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS1
	**/
    public AS1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld11
	 *	@return aSFld11
	 */
   public char[] getASFld11() throws CFException{
     if (isASFld11Modified()) { 
        aSFld11 = refreshASFld11();
     }
   		return aSFld11;
   }

  
	/**
	*  set variable aSFld11
	*  Corresponding COBOL Variable is WS-1A-S-FLD1
	*  @param value
	**/
   public void setASFld11(char[] value) {
      aSFld11 = checkASFld11Constraints(value);
      serializeASFld11(aSFld11);
   } 

     /**
	 * 	Update ASFld11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld11,aSFld11.length);
   	
   }
   
   public void setASFld11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld11,aSFld11.length);
   	
   }
   
     /**
	 * 	Update ASFld11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld11 with another Field
	 *	@param value
	 */
   public void setASFld11(Field source) {
       replace(source,0,source.length(),beginASFld11,A_SFLD_11_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld11,A_SFLD_11_LEN);
   	
   }
   
     /**
	 * 	Update ASFld11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld21
	 *	@return aSFld21
	 */
   public char[] getASFld21() throws CFException{
     if (isASFld21Modified()) { 
        aSFld21 = refreshASFld21();
     }
   		return aSFld21;
   }

  
	/**
	*  set variable aSFld21
	*  Corresponding COBOL Variable is WS-1A-S-FLD2
	*  @param value
	**/
   public void setASFld21(char[] value) {
      aSFld21 = checkASFld21Constraints(value);
      serializeASFld21(aSFld21);
   } 

     /**
	 * 	Update ASFld21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld21,aSFld21.length);
   	
   }
   
   public void setASFld21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld21,aSFld21.length);
   	
   }
   
     /**
	 * 	Update ASFld21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld21 with another Field
	 *	@param value
	 */
   public void setASFld21(Field source) {
       replace(source,0,source.length(),beginASFld21,A_SFLD_21_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld21,A_SFLD_21_LEN);
   	
   }
   
     /**
	 * 	Update ASFld21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld21+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld11(CONSTANTS.SPACE_30);
         setASFld21(CONSTANTS.SPACE_40);
   }

		public static int getAS1FieldLength() {
			return A_S_1_LENGTH;
		}

}
  
