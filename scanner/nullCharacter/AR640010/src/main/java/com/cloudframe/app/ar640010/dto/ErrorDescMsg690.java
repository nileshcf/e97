package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorDescMsg690 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorDescMsg690 extends ErrorDescMsg690Serialized {
   


						private char[] errorResponse690 = new char[4];

	
	/**
	* Constructor for ErrorDescMsg690
	**/
    public ErrorDescMsg690() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR DESC : ").toCharArray()
             , getStartOffset() + 0
             ,13
             );
								setErrorResponse690(fillSpace(4));
       replaceValue( // serialize and save the value
             (" - ").toCharArray()
             , getStartOffset() + 17
             ,3
             );
    }


 

	/**
	 *	Returns the value of errorResponse690
	 *	@return errorResponse690
	 */
   public char[] getErrorResponse690() throws CFException{
     if (isErrorResponse690Modified()) { 
        errorResponse690 = refreshErrorResponse690();
     }
   		return errorResponse690;
   }

  
	/**
	*  set variable errorResponse690
	*  Corresponding COBOL Variable is 690-ERROR-RESPONSE
	*  @param value
	**/
   public void setErrorResponse690(char[] value) {
      errorResponse690 = checkErrorResponse690Constraints(value);
      serializeErrorResponse690(errorResponse690);
   } 

     /**
	 * 	Update ErrorResponse690 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorResponse690(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorResponse690,errorResponse690.length);
   	
   }
   
   public void setErrorResponse690(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorResponse690,errorResponse690.length);
   	
   }
   
     /**
	 * 	Update ErrorResponse690 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorResponse690(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorResponse690+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorResponse690 with another Field
	 *	@param value
	 */
   public void setErrorResponse690(Field source) {
       replace(source,0,source.length(),beginErrorResponse690,ERROR_RESPONSE_690_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorResponse690 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorResponse690(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorResponse690,ERROR_RESPONSE_690_LEN);
   	
   }
   
     /**
	 * 	Update ErrorResponse690 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorResponse690(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorResponse690+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorDescMsg690FieldLength() {
			return ERROR_DESC_MSG_690_LENGTH;
		}

}
  
