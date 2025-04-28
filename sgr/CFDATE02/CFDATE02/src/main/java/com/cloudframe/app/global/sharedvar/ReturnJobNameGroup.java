package com.cloudframe.app.global.sharedvar;

/**
*  The class ReturnJobNameGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_returnJobNameGroup")

public class ReturnJobNameGroup extends ReturnJobNameGroupSerialized  implements InitializingBean {
   

						private char[] returnJobName = Field.fillLowValue(8);
	
	/**
	* Constructor for ReturnJobNameGroup
	**/
    public ReturnJobNameGroup() {
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
	 *	Returns the value of returnJobName
	 *	@return returnJobName
	 */
   public char[] getReturnJobName() throws CFException{
     if (isReturnJobNameModified()) { 
        returnJobName = refreshReturnJobName();
     }
   		return returnJobName;
   }

  
	/**
	*  set variable returnJobName
	*  Corresponding COBOL Variable is WS-RETURN-JOB-NAME
	*  @param value
	**/
   public void setReturnJobName(char[] value) {
      returnJobName = checkReturnJobNameConstraints(value);
      serializeReturnJobName(returnJobName);
   } 

     /**
	 * 	Update ReturnJobName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReturnJobName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReturnJobName,returnJobName.length);
   	
   }
   
   public void setReturnJobName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReturnJobName,returnJobName.length);
   	
   }
   
     /**
	 * 	Update ReturnJobName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReturnJobName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReturnJobName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReturnJobName with another Field
	 *	@param value
	 */
   public void setReturnJobName(Field source) {
       replace(source,0,source.length(),beginReturnJobName,RETURN_JOB_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update ReturnJobName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReturnJobName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReturnJobName,RETURN_JOB_NAME_LEN);
   	
   }
   
     /**
	 * 	Update ReturnJobName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReturnJobName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReturnJobName+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReturnJobNameGroupFieldLength() {
			return RETURN_JOB_NAME_GROUP_LENGTH;
		}

}
  
