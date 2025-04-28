package com.cloudframe.app.ip202330.dto;

/**
*  The class FormatTypeErrorMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip202330.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FormatTypeErrorMessage600 extends FormatTypeErrorMessage600Serialized { 
   
				private ErrorText600 errorText600 = new ErrorText600();
	
	/**
	* Constructor for FormatTypeErrorMessage600
	**/
    public FormatTypeErrorMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			errorText600.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of errorText600
	 *	@return errorText600
	 */   
	 public ErrorText600 getErrorText600() {
   	return errorText600;
   }
   /**
	* 	Update ErrorText600 with the passed value
	*   Corresponding COBOL Variable is 600-ERROR-TEXT
	*	@param value
	*/
   public void setErrorText600(char[] value) {
      errorText600.setString(value); 
   }   
    
     /**
	 * 	Update ErrorText600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrorText600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errorText600.begin,errorText600.length());
   }
   
     /**
	 * 	Update ErrorText600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errorText600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ErrorText600 with another Field
	 *	@param value
	 */
   public void setErrorText600(Field source) {
   	replace(source,0,source.length(),errorText600.begin,errorText600.length());
   }  
   
     /**
	 * 	Update ErrorText600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrorText600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errorText600.begin,errorText600.length());
   }
   
     /**
	 * 	Update ErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errorText600.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFormatTypeErrorMessage600FieldLength() {
			return FORMAT_TYPE_ERROR_MESSAGE_600_LENGTH;
		}

}
  
