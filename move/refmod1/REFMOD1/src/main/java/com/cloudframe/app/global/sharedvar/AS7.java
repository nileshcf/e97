package com.cloudframe.app.global.sharedvar;

/**
*  The class AS7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aS7")

public class AS7 extends AS7Serialized  implements InitializingBean {
   

						private char[] aSFld17 = Field.fillLowValue(30);

						private char[] aSFld27 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS7
	**/
    public AS7() {
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
	 *	Returns the value of aSFld17
	 *	@return aSFld17
	 */
   public char[] getASFld17() throws CFException{
     if (isASFld17Modified()) { 
        aSFld17 = refreshASFld17();
     }
   		return aSFld17;
   }

  
	/**
	*  set variable aSFld17
	*  Corresponding COBOL Variable is WS-7A-S-FLD1
	*  @param value
	**/
   public void setASFld17(char[] value) {
      aSFld17 = checkASFld17Constraints(value);
      serializeASFld17(aSFld17);
   } 

     /**
	 * 	Update ASFld17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld17,aSFld17.length);
   	
   }
   
   public void setASFld17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld17,aSFld17.length);
   	
   }
   
     /**
	 * 	Update ASFld17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld17 with another Field
	 *	@param value
	 */
   public void setASFld17(Field source) {
       replace(source,0,source.length(),beginASFld17,A_SFLD_17_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld17,A_SFLD_17_LEN);
   	
   }
   
     /**
	 * 	Update ASFld17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld27
	 *	@return aSFld27
	 */
   public char[] getASFld27() throws CFException{
     if (isASFld27Modified()) { 
        aSFld27 = refreshASFld27();
     }
   		return aSFld27;
   }

  
	/**
	*  set variable aSFld27
	*  Corresponding COBOL Variable is WS-7A-S-FLD2
	*  @param value
	**/
   public void setASFld27(char[] value) {
      aSFld27 = checkASFld27Constraints(value);
      serializeASFld27(aSFld27);
   } 

     /**
	 * 	Update ASFld27 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld27(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld27,aSFld27.length);
   	
   }
   
   public void setASFld27(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld27,aSFld27.length);
   	
   }
   
     /**
	 * 	Update ASFld27 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld27+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld27 with another Field
	 *	@param value
	 */
   public void setASFld27(Field source) {
       replace(source,0,source.length(),beginASFld27,A_SFLD_27_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld27 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld27(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld27,A_SFLD_27_LEN);
   	
   }
   
     /**
	 * 	Update ASFld27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld27+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld17(CONSTANTS.SPACE_30);
         setASFld27(CONSTANTS.SPACE_40);
   }

		public static int getAS7FieldLength() {
			return A_S_7_LENGTH;
		}

}
  
