package com.cloudframe.app.refmod3.dto;

/**
*  The class AS215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS215 extends AS215Serialized { 
   

						private char[] aSFld1215 = Field.fillLowValue(30);

						private char[] aSFld2215 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS215
	**/
    public AS215() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AS215. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AS215(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aSFld1215
	 *	@return aSFld1215
	 */
   public char[] getASFld1215() throws CFException{
     if (isASFld1215Modified()) { 
        aSFld1215 = refreshASFld1215();
     }
   		return aSFld1215;
   }

  
	/**
	*  set variable aSFld1215
	*  Corresponding COBOL Variable is WS-2-15A-S-FLD1
	*  @param value
	**/
   public void setASFld1215(char[] value) {
      aSFld1215 = checkASFld1215Constraints(value);
      serializeASFld1215(aSFld1215);
   } 

     /**
	 * 	Update ASFld1215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld1215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld1215,aSFld1215.length);
   	
   }
   
   public void setASFld1215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1215,aSFld1215.length);
   	
   }
   
     /**
	 * 	Update ASFld1215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld1215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld1215 with another Field
	 *	@param value
	 */
   public void setASFld1215(Field source) {
       replace(source,0,source.length(),beginASFld1215,A_SFLD_1215_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld1215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld1215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld1215,A_SFLD_1215_LEN);
   	
   }
   
     /**
	 * 	Update ASFld1215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld1215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld1215+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld2215
	 *	@return aSFld2215
	 */
   public char[] getASFld2215() throws CFException{
     if (isASFld2215Modified()) { 
        aSFld2215 = refreshASFld2215();
     }
   		return aSFld2215;
   }

  
	/**
	*  set variable aSFld2215
	*  Corresponding COBOL Variable is WS-2-15A-S-FLD2
	*  @param value
	**/
   public void setASFld2215(char[] value) {
      aSFld2215 = checkASFld2215Constraints(value);
      serializeASFld2215(aSFld2215);
   } 

     /**
	 * 	Update ASFld2215 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld2215(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld2215,aSFld2215.length);
   	
   }
   
   public void setASFld2215(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2215,aSFld2215.length);
   	
   }
   
     /**
	 * 	Update ASFld2215 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld2215(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2215+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld2215 with another Field
	 *	@param value
	 */
   public void setASFld2215(Field source) {
       replace(source,0,source.length(),beginASFld2215,A_SFLD_2215_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld2215 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld2215(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld2215,A_SFLD_2215_LEN);
   	
   }
   
     /**
	 * 	Update ASFld2215 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld2215(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld2215+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS215
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld1215(CONSTANTS.SPACE_30);
         setASFld2215(CONSTANTS.SPACE_40);
   }

		public static int getAS215FieldLength() {
			return A_S_215_LENGTH;
		}

}
  
