package com.cloudframe.app.refmod2.dto;

/**
*  The class AS27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS27 extends AS27Serialized {
   

						private char[] aSFld127 = Field.fillLowValue(30);

						private char[] aSFld227 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS27
	**/
    public AS27() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld127
	 *	@return aSFld127
	 */
   public char[] getASFld127() throws CFException{
     if (isASFld127Modified()) { 
        aSFld127 = refreshASFld127();
     }
   		return aSFld127;
   }

  
	/**
	*  set variable aSFld127
	*  Corresponding COBOL Variable is WS-2-7A-S-FLD1
	*  @param value
	**/
   public void setASFld127(char[] value) {
      aSFld127 = checkASFld127Constraints(value);
      serializeASFld127(aSFld127);
   } 

     /**
	 * 	Update ASFld127 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld127(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld127,aSFld127.length);
   	
   }
   
   public void setASFld127(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld127,aSFld127.length);
   	
   }
   
     /**
	 * 	Update ASFld127 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld127(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld127+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld127 with another Field
	 *	@param value
	 */
   public void setASFld127(Field source) {
       replace(source,0,source.length(),beginASFld127,A_SFLD_127_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld127 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld127(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld127,A_SFLD_127_LEN);
   	
   }
   
     /**
	 * 	Update ASFld127 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld127(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld127+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld227
	 *	@return aSFld227
	 */
   public char[] getASFld227() throws CFException{
     if (isASFld227Modified()) { 
        aSFld227 = refreshASFld227();
     }
   		return aSFld227;
   }

  
	/**
	*  set variable aSFld227
	*  Corresponding COBOL Variable is WS-2-7A-S-FLD2
	*  @param value
	**/
   public void setASFld227(char[] value) {
      aSFld227 = checkASFld227Constraints(value);
      serializeASFld227(aSFld227);
   } 

     /**
	 * 	Update ASFld227 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld227(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld227,aSFld227.length);
   	
   }
   
   public void setASFld227(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld227,aSFld227.length);
   	
   }
   
     /**
	 * 	Update ASFld227 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld227(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld227+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld227 with another Field
	 *	@param value
	 */
   public void setASFld227(Field source) {
       replace(source,0,source.length(),beginASFld227,A_SFLD_227_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld227 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld227(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld227,A_SFLD_227_LEN);
   	
   }
   
     /**
	 * 	Update ASFld227 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld227(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld227+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS27
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld127(CONSTANTS.SPACE_30);
         setASFld227(CONSTANTS.SPACE_40);
   }

		public static int getAS27FieldLength() {
			return A_S_27_LENGTH;
		}

}
  
