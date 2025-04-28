package com.cloudframe.app.refmod3.dto;

/**
*  The class AS217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS217 extends AS217Serialized {
   

						private char[] aSFld1217 = Field.fillLowValue(30);

						private char[] aSFld2217 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS217
	**/
    public AS217() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld1217
	 *	@return aSFld1217
	 */
   public char[] getASFld1217() throws CFException{
     if (isASFld1217Modified()) { 
        aSFld1217 = refreshASFld1217();
     }
   		return aSFld1217;
   }

  
	/**
	*  set variable aSFld1217
	*  Corresponding COBOL Variable is WS-2-17A-S-FLD1
	*  @param value
	**/
   public void setASFld1217(char[] value) {
      aSFld1217 = checkASFld1217Constraints(value);
      serializeASFld1217(aSFld1217);
   } 

     /**
	 * 	Update ASFld1217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld1217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld1217,aSFld1217.length);
   	
   }
   
   public void setASFld1217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1217,aSFld1217.length);
   	
   }
   
     /**
	 * 	Update ASFld1217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld1217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld1217 with another Field
	 *	@param value
	 */
   public void setASFld1217(Field source) {
       replace(source,0,source.length(),beginASFld1217,A_SFLD_1217_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld1217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld1217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld1217,A_SFLD_1217_LEN);
   	
   }
   
     /**
	 * 	Update ASFld1217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld1217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1217+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld2217
	 *	@return aSFld2217
	 */
   public char[] getASFld2217() throws CFException{
     if (isASFld2217Modified()) { 
        aSFld2217 = refreshASFld2217();
     }
   		return aSFld2217;
   }

  
	/**
	*  set variable aSFld2217
	*  Corresponding COBOL Variable is WS-2-17A-S-FLD2
	*  @param value
	**/
   public void setASFld2217(char[] value) {
      aSFld2217 = checkASFld2217Constraints(value);
      serializeASFld2217(aSFld2217);
   } 

     /**
	 * 	Update ASFld2217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld2217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld2217,aSFld2217.length);
   	
   }
   
   public void setASFld2217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2217,aSFld2217.length);
   	
   }
   
     /**
	 * 	Update ASFld2217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld2217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld2217 with another Field
	 *	@param value
	 */
   public void setASFld2217(Field source) {
       replace(source,0,source.length(),beginASFld2217,A_SFLD_2217_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld2217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld2217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld2217,A_SFLD_2217_LEN);
   	
   }
   
     /**
	 * 	Update ASFld2217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld2217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2217+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS217
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld1217(CONSTANTS.SPACE_30);
         setASFld2217(CONSTANTS.SPACE_40);
   }

		public static int getAS217FieldLength() {
			return A_S_217_LENGTH;
		}

}
  
