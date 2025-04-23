package com.cloudframe.app.refmod2.dto;

/**
*  The class AS219 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS219 extends AS219Serialized {
   

						private char[] aSFld1219 = Field.fillLowValue(30);

						private char[] aSFld2219 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS219
	**/
    public AS219() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld1219
	 *	@return aSFld1219
	 */
   public char[] getASFld1219() throws CFException{
     if (isASFld1219Modified()) { 
        aSFld1219 = refreshASFld1219();
     }
   		return aSFld1219;
   }

  
	/**
	*  set variable aSFld1219
	*  Corresponding COBOL Variable is WS-2-19A-S-FLD1
	*  @param value
	**/
   public void setASFld1219(char[] value) {
      aSFld1219 = checkASFld1219Constraints(value);
      serializeASFld1219(aSFld1219);
   } 

     /**
	 * 	Update ASFld1219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld1219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld1219,aSFld1219.length);
   	
   }
   
   public void setASFld1219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1219,aSFld1219.length);
   	
   }
   
     /**
	 * 	Update ASFld1219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld1219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld1219 with another Field
	 *	@param value
	 */
   public void setASFld1219(Field source) {
       replace(source,0,source.length(),beginASFld1219,A_SFLD_1219_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld1219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld1219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld1219,A_SFLD_1219_LEN);
   	
   }
   
     /**
	 * 	Update ASFld1219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld1219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1219+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld2219
	 *	@return aSFld2219
	 */
   public char[] getASFld2219() throws CFException{
     if (isASFld2219Modified()) { 
        aSFld2219 = refreshASFld2219();
     }
   		return aSFld2219;
   }

  
	/**
	*  set variable aSFld2219
	*  Corresponding COBOL Variable is WS-2-19A-S-FLD2
	*  @param value
	**/
   public void setASFld2219(char[] value) {
      aSFld2219 = checkASFld2219Constraints(value);
      serializeASFld2219(aSFld2219);
   } 

     /**
	 * 	Update ASFld2219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld2219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld2219,aSFld2219.length);
   	
   }
   
   public void setASFld2219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2219,aSFld2219.length);
   	
   }
   
     /**
	 * 	Update ASFld2219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld2219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld2219 with another Field
	 *	@param value
	 */
   public void setASFld2219(Field source) {
       replace(source,0,source.length(),beginASFld2219,A_SFLD_2219_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld2219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld2219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld2219,A_SFLD_2219_LEN);
   	
   }
   
     /**
	 * 	Update ASFld2219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld2219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2219+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS219
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld1219(CONSTANTS.SPACE_30);
         setASFld2219(CONSTANTS.SPACE_40);
   }

		public static int getAS219FieldLength() {
			return A_S_219_LENGTH;
		}

}
  
