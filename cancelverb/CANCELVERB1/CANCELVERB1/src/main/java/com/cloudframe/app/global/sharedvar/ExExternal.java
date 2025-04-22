package com.cloudframe.app.global.sharedvar;

/**
*  The class ExExternal is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_exExternal")

public class ExExternal extends ExExternalSerialized  implements InitializingBean {
   

						private char[] exProgramName = Field.fillLowValue(8);

						private char[] exJobName = Field.fillLowValue(8);
	
	/**
	* Constructor for ExExternal
	**/
    public ExExternal() {
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
	 *	Returns the value of exProgramName
	 *	@return exProgramName
	 */
   public char[] getExProgramName() throws CFException{
     if (isExProgramNameModified()) { 
        exProgramName = refreshExProgramName();
     }
   		return exProgramName;
   }

  
	/**
	*  set variable exProgramName
	*  Corresponding COBOL Variable is EX-PROGRAM-NAME
	*  @param value
	**/
   public void setExProgramName(char[] value) {
      exProgramName = checkExProgramNameConstraints(value);
      serializeExProgramName(exProgramName);
   } 

     /**
	 * 	Update ExProgramName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExProgramName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExProgramName,exProgramName.length);
   	
   }
   
   public void setExProgramName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExProgramName,exProgramName.length);
   	
   }
   
     /**
	 * 	Update ExProgramName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExProgramName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExProgramName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExProgramName with another Field
	 *	@param value
	 */
   public void setExProgramName(Field source) {
       replace(source,0,source.length(),beginExProgramName,EX_PROGRAM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExProgramName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExProgramName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExProgramName,EX_PROGRAM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update ExProgramName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExProgramName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExProgramName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exJobName
	 *	@return exJobName
	 */
   public char[] getExJobName() throws CFException{
     if (isExJobNameModified()) { 
        exJobName = refreshExJobName();
     }
   		return exJobName;
   }

  
	/**
	*  set variable exJobName
	*  Corresponding COBOL Variable is EX-JOB-NAME
	*  @param value
	**/
   public void setExJobName(char[] value) {
      exJobName = checkExJobNameConstraints(value);
      serializeExJobName(exJobName);
   } 

     /**
	 * 	Update ExJobName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExJobName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExJobName,exJobName.length);
   	
   }
   
   public void setExJobName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExJobName,exJobName.length);
   	
   }
   
     /**
	 * 	Update ExJobName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExJobName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExJobName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExJobName with another Field
	 *	@param value
	 */
   public void setExJobName(Field source) {
       replace(source,0,source.length(),beginExJobName,EX_JOB_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update ExJobName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExJobName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExJobName,EX_JOB_NAME_LEN);
   	
   }
   
     /**
	 * 	Update ExJobName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExJobName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExJobName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ExExternal
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setExProgramName(CONSTANTS.SPACE_8);
         setExJobName(CONSTANTS.SPACE_8);
   }

		public static int getExExternalFieldLength() {
			return EX_EXTERNAL_LENGTH;
		}

}
  
