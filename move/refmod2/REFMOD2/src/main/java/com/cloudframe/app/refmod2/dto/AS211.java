package com.cloudframe.app.refmod2.dto;

/**
*  The class AS211 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS211 extends AS211Serialized { 
   

						private char[] aSFld1211 = Field.fillLowValue(30);

						private char[] aSFld2211 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS211
	**/
    public AS211() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld1211
	 *	@return aSFld1211
	 */
   public char[] getASFld1211() throws CFException{
     if (isASFld1211Modified()) { 
        aSFld1211 = refreshASFld1211();
     }
   		return aSFld1211;
   }

  
	/**
	*  set variable aSFld1211
	*  Corresponding COBOL Variable is WS-2-11A-S-FLD1
	*  @param value
	**/
   public void setASFld1211(char[] value) {
      aSFld1211 = checkASFld1211Constraints(value);
      serializeASFld1211(aSFld1211);
   } 

     /**
	 * 	Update ASFld1211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld1211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld1211,aSFld1211.length);
   	
   }
   
   public void setASFld1211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1211,aSFld1211.length);
   	
   }
   
     /**
	 * 	Update ASFld1211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld1211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld1211 with another Field
	 *	@param value
	 */
   public void setASFld1211(Field source) {
       replace(source,0,source.length(),beginASFld1211,A_SFLD_1211_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld1211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld1211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld1211,A_SFLD_1211_LEN);
   	
   }
   
     /**
	 * 	Update ASFld1211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld1211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1211+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld2211
	 *	@return aSFld2211
	 */
   public char[] getASFld2211() throws CFException{
     if (isASFld2211Modified()) { 
        aSFld2211 = refreshASFld2211();
     }
   		return aSFld2211;
   }

  
	/**
	*  set variable aSFld2211
	*  Corresponding COBOL Variable is WS-2-11A-S-FLD2
	*  @param value
	**/
   public void setASFld2211(char[] value) {
      aSFld2211 = checkASFld2211Constraints(value);
      serializeASFld2211(aSFld2211);
   } 

     /**
	 * 	Update ASFld2211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld2211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld2211,aSFld2211.length);
   	
   }
   
   public void setASFld2211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2211,aSFld2211.length);
   	
   }
   
     /**
	 * 	Update ASFld2211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld2211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld2211 with another Field
	 *	@param value
	 */
   public void setASFld2211(Field source) {
       replace(source,0,source.length(),beginASFld2211,A_SFLD_2211_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld2211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld2211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld2211,A_SFLD_2211_LEN);
   	
   }
   
     /**
	 * 	Update ASFld2211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld2211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2211+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS211
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld1211(CONSTANTS.SPACE_30);
         setASFld2211(CONSTANTS.SPACE_40);
   }

		public static int getAS211FieldLength() {
			return A_S_211_LENGTH;
		}

}
  
