package com.cloudframe.app.global.sharedvar;

/**
*  The class FirstTimeCallGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:53. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_firstTimeCallGroup")

public class FirstTimeCallGroup extends FirstTimeCallGroupSerialized  implements InitializingBean {
   

						private char[] firstTimeCall = Field.fillLowValue(1);
	
	/**
	* Constructor for FirstTimeCallGroup
	**/
    public FirstTimeCallGroup() {
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
	 *	Returns the value of firstTimeCall
	 *	@return firstTimeCall
	 */
   public char[] getFirstTimeCall() throws CFException{
     if (isFirstTimeCallModified()) { 
        firstTimeCall = refreshFirstTimeCall();
     }
   		return firstTimeCall;
   }

  
	/**
	*  set variable firstTimeCall
	*  Corresponding COBOL Variable is FIRST-TIME-CALL
	*  @param value
	**/
   public void setFirstTimeCall(char[] value) {
      firstTimeCall = checkFirstTimeCallConstraints(value);
      serializeFirstTimeCall(firstTimeCall);
   } 

     /**
	 * 	Update FirstTimeCall 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFirstTimeCall(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFirstTimeCall,firstTimeCall.length);
   	
   }
   
   public void setFirstTimeCall(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFirstTimeCall,firstTimeCall.length);
   	
   }
   
     /**
	 * 	Update FirstTimeCall 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFirstTimeCall(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFirstTimeCall+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FirstTimeCall with another Field
	 *	@param value
	 */
   public void setFirstTimeCall(Field source) {
       replace(source,0,source.length(),beginFirstTimeCall,FIRST_TIME_CALL_LEN);
   	
   }  
   
     /**
	 * 	Update FirstTimeCall 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFirstTimeCall(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFirstTimeCall,FIRST_TIME_CALL_LEN);
   	
   }
   
     /**
	 * 	Update FirstTimeCall 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFirstTimeCall(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFirstTimeCall+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFirstTimeCallGroupFieldLength() {
			return FIRST_TIME_CALL_GROUP_LENGTH;
		}

}
  
