package com.cloudframe.app.global.sharedvar;

/**
*  The class AS19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aS19")

public class AS19 extends AS19Serialized  implements InitializingBean {
   

						private char[] aSFld119 = Field.fillLowValue(30);

						private char[] aSFld219 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS19
	**/
    public AS19() {
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
	 *	Returns the value of aSFld119
	 *	@return aSFld119
	 */
   public char[] getASFld119() throws CFException{
     if (isASFld119Modified()) { 
        aSFld119 = refreshASFld119();
     }
   		return aSFld119;
   }

  
	/**
	*  set variable aSFld119
	*  Corresponding COBOL Variable is WS-19A-S-FLD1
	*  @param value
	**/
   public void setASFld119(char[] value) {
      aSFld119 = checkASFld119Constraints(value);
      serializeASFld119(aSFld119);
   } 

     /**
	 * 	Update ASFld119 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld119(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld119,aSFld119.length);
   	
   }
   
   public void setASFld119(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld119,aSFld119.length);
   	
   }
   
     /**
	 * 	Update ASFld119 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld119(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld119+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld119 with another Field
	 *	@param value
	 */
   public void setASFld119(Field source) {
       replace(source,0,source.length(),beginASFld119,A_SFLD_119_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld119 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld119(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld119,A_SFLD_119_LEN);
   	
   }
   
     /**
	 * 	Update ASFld119 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld119(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld119+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld219
	 *	@return aSFld219
	 */
   public char[] getASFld219() throws CFException{
     if (isASFld219Modified()) { 
        aSFld219 = refreshASFld219();
     }
   		return aSFld219;
   }

  
	/**
	*  set variable aSFld219
	*  Corresponding COBOL Variable is WS-19A-S-FLD2
	*  @param value
	**/
   public void setASFld219(char[] value) {
      aSFld219 = checkASFld219Constraints(value);
      serializeASFld219(aSFld219);
   } 

     /**
	 * 	Update ASFld219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld219,aSFld219.length);
   	
   }
   
   public void setASFld219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld219,aSFld219.length);
   	
   }
   
     /**
	 * 	Update ASFld219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld219 with another Field
	 *	@param value
	 */
   public void setASFld219(Field source) {
       replace(source,0,source.length(),beginASFld219,A_SFLD_219_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld219,A_SFLD_219_LEN);
   	
   }
   
     /**
	 * 	Update ASFld219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld219+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld119(CONSTANTS.SPACE_30);
         setASFld219(CONSTANTS.SPACE_40);
   }

		public static int getAS19FieldLength() {
			return A_S_19_LENGTH;
		}

}
  
