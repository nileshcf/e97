package com.cloudframe.app.global.sharedvar;

/**
*  The class AS17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aS17")

public class AS17 extends AS17Serialized  implements InitializingBean {
   

						private char[] aSFld117 = Field.fillLowValue(30);

						private char[] aSFld217 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS17
	**/
    public AS17() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aSFld117
	 *	@return aSFld117
	 */
   public char[] getASFld117() throws CFException{
     if (isASFld117Modified()) { 
        aSFld117 = refreshASFld117();
     }
   		return aSFld117;
   }

  
	/**
	*  set variable aSFld117
	*  Corresponding COBOL Variable is WS-17A-S-FLD1
	*  @param value
	**/
   public void setASFld117(char[] value) {
      aSFld117 = checkASFld117Constraints(value);
      serializeASFld117(aSFld117);
   } 

     /**
	 * 	Update ASFld117 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld117(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld117,aSFld117.length);
   	
   }
   
   public void setASFld117(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld117,aSFld117.length);
   	
   }
   
     /**
	 * 	Update ASFld117 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld117(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld117+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld117 with another Field
	 *	@param value
	 */
   public void setASFld117(Field source) {
       replace(source,0,source.length(),beginASFld117,A_SFLD_117_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld117 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld117(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld117,A_SFLD_117_LEN);
   	
   }
   
     /**
	 * 	Update ASFld117 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld117(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld117+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld217
	 *	@return aSFld217
	 */
   public char[] getASFld217() throws CFException{
     if (isASFld217Modified()) { 
        aSFld217 = refreshASFld217();
     }
   		return aSFld217;
   }

  
	/**
	*  set variable aSFld217
	*  Corresponding COBOL Variable is WS-17A-S-FLD2
	*  @param value
	**/
   public void setASFld217(char[] value) {
      aSFld217 = checkASFld217Constraints(value);
      serializeASFld217(aSFld217);
   } 

     /**
	 * 	Update ASFld217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld217,aSFld217.length);
   	
   }
   
   public void setASFld217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld217,aSFld217.length);
   	
   }
   
     /**
	 * 	Update ASFld217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld217 with another Field
	 *	@param value
	 */
   public void setASFld217(Field source) {
       replace(source,0,source.length(),beginASFld217,A_SFLD_217_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld217,A_SFLD_217_LEN);
   	
   }
   
     /**
	 * 	Update ASFld217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld217+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld117(CONSTANTS.SPACE_30);
         setASFld217(CONSTANTS.SPACE_40);
   }

		public static int getAS17FieldLength() {
			return A_S_17_LENGTH;
		}

}
  
