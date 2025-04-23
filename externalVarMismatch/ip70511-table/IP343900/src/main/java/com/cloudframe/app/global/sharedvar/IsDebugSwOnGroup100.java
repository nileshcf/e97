package com.cloudframe.app.global.sharedvar;

/**
*  The class IsDebugSwOnGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_isDebugSwOnGroup100")

public class IsDebugSwOnGroup100 extends IsDebugSwOnGroup100Serialized  implements InitializingBean {
   

						private char[] isDebugSwOn100 = Field.fillLowValue(1);
	
	/**
	* Constructor for IsDebugSwOnGroup100
	**/
    public IsDebugSwOnGroup100() {
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
	 *	Returns the value of isDebugSwOn100
	 *	@return isDebugSwOn100
	 */
   public char[] getIsDebugSwOn100() throws CFException{
     if (isIsDebugSwOn100Modified()) { 
        isDebugSwOn100 = refreshIsDebugSwOn100();
     }
   		return isDebugSwOn100;
   }

  
	/**
	*  set variable isDebugSwOn100
	*  Corresponding COBOL Variable is 100-IS-DEBUG-SW-ON
	*  @param value
	**/
   public void setIsDebugSwOn100(char[] value) {
      isDebugSwOn100 = checkIsDebugSwOn100Constraints(value);
      serializeIsDebugSwOn100(isDebugSwOn100);
   } 

     /**
	 * 	Update IsDebugSwOn100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsDebugSwOn100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsDebugSwOn100,isDebugSwOn100.length);
   	
   }
   
   public void setIsDebugSwOn100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsDebugSwOn100,isDebugSwOn100.length);
   	
   }
   
     /**
	 * 	Update IsDebugSwOn100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsDebugSwOn100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsDebugSwOn100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsDebugSwOn100 with another Field
	 *	@param value
	 */
   public void setIsDebugSwOn100(Field source) {
       replace(source,0,source.length(),beginIsDebugSwOn100,IS_DEBUG_SW_ON_100_LEN);
   	
   }  
   
     /**
	 * 	Update IsDebugSwOn100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsDebugSwOn100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsDebugSwOn100,IS_DEBUG_SW_ON_100_LEN);
   	
   }
   
     /**
	 * 	Update IsDebugSwOn100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsDebugSwOn100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsDebugSwOn100+targetIndex,targetLen);
    
   }
	char[] debugSwY8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDebugSwY88100()
	 *	@return  Returns true if isDebugSwY88100() is "N"
	 */
   public boolean isDebugSwY88100() throws CFException {
      return (  compareChars( getIsDebugSwOn100() , debugSwY8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDebugSwY88100True() {  			
    	setIsDebugSwOn100( debugSwY8810088Value);
   	}
	char[] debugSwN8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDebugSwN88100()
	 *	@return  Returns true if isDebugSwN88100() is "Y"
	 */
   public boolean isDebugSwN88100() throws CFException {
      return (  compareChars( getIsDebugSwOn100() , debugSwN8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDebugSwN88100True() {  			
    	setIsDebugSwOn100( debugSwN8810088Value);
   	}

	
	
	

		public static int getIsDebugSwOnGroup100FieldLength() {
			return IS_DEBUG_SW_ON_GROUP_100_LENGTH;
		}

}
  
