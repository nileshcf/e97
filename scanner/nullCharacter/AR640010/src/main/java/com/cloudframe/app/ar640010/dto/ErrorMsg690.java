package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorMsg690 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg690 extends ErrorMsg690Serialized {
   
				private ErrorPrefix690 errorPrefix690 = new ErrorPrefix690();


								private long errorRequest690;

	
	/**
	* Constructor for ErrorMsg690
	**/
    public ErrorMsg690() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			errorPrefix690.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								errorPrefix690.setString(("9000-").toCharArray());
       replaceValue( // serialize and save the value
             ("REQUEST NBR: ").toCharArray()
             , getStartOffset() + 5
             ,13
             );
								setErrorRequest690(0L);
       replaceValue( // serialize and save the value
             (" ERROR ENCOUNTERED").toCharArray()
             , getStartOffset() + 27
             ,18
             );
    }


 

	/**
	 *	Returns the value of errorPrefix690
	 *	@return errorPrefix690
	 */   
	 public ErrorPrefix690 getErrorPrefix690() {
   	return errorPrefix690;
   }
   /**
	* 	Update ErrorPrefix690 with the passed value
	*   Corresponding COBOL Variable is 690-ERROR-PREFIX
	*	@param value
	*/
   public void setErrorPrefix690(char[] value) {
      errorPrefix690.setString(value); 
   }   
    
     /**
	 * 	Update ErrorPrefix690 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrorPrefix690(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errorPrefix690.begin,errorPrefix690.length());
   }
   
     /**
	 * 	Update ErrorPrefix690 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorPrefix690(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errorPrefix690.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ErrorPrefix690 with another Field
	 *	@param value
	 */
   public void setErrorPrefix690(Field source) {
   	replace(source,0,source.length(),errorPrefix690.begin,errorPrefix690.length());
   }  
   
     /**
	 * 	Update ErrorPrefix690 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrorPrefix690(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errorPrefix690.begin,errorPrefix690.length());
   }
   
     /**
	 * 	Update ErrorPrefix690 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorPrefix690(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errorPrefix690.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of errorRequest690
	 *	@return errorRequest690
	 */
	public long getErrorRequest690() throws CFException {
       if (isErrorRequest690Modified()) { 
           errorRequest690 = refreshErrorRequest690();
        }
   		return errorRequest690;
	}
	

	
	   
	/**
	 * 	Update ErrorRequest690 with the passed value
	 *  Corresponding COBOL Variable is 690-ERROR-REQUEST
	 *	@param number
	 */
	public void setErrorRequest690(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    errorRequest690 = checkErrorRequest690MaxLimit(number); 
		serializeErrorRequest690(errorRequest690);
	}
	

	/**
	 * 	Update ErrorRequest690 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorRequest690(char[] value) throws CFException {
		 errorRequest690 = serializeErrorRequest690(value);
	}
	/**
	 * 	Update ErrorRequest690 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorRequest690String(char[] value) throws CFException {
		 setErrorRequest690(value);
	}

	
	
	

		public static int getErrorMsg690FieldLength() {
			return ERROR_MSG_690_LENGTH;
		}

}
  
