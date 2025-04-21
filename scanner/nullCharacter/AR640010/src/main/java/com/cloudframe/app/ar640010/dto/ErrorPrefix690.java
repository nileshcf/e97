package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorPrefix690 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorPrefix690 extends ErrorPrefix690Serialized { 
   


								private int errorSeqNbr690;

	
	/**
	* Constructor for ErrorPrefix690
	**/
    public ErrorPrefix690() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrorPrefix690. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorPrefix690(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("9000-").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("9000-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
    } 

	/**
	 *	Returns the value of errorSeqNbr690
	 *	@return errorSeqNbr690
	 */
	public int getErrorSeqNbr690() throws CFException {
       if (isErrorSeqNbr690Modified()) { 
           errorSeqNbr690 = refreshErrorSeqNbr690();
        }
   		return errorSeqNbr690;
	}
	

	
	   
	/**
	 * 	Update ErrorSeqNbr690 with the passed value
	 *  Corresponding COBOL Variable is 690-ERROR-SEQ-NBR
	 *	@param number
	 */
	public void setErrorSeqNbr690(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    errorSeqNbr690 = checkErrorSeqNbr690MaxLimit(number); 
		serializeErrorSeqNbr690(errorSeqNbr690);
	}
	

	public void setErrorSeqNbr690(long number) {
	    number = checkErrorSeqNbr690MaxLimit(number); // Truncate if value is beyond +/- Max range
		setErrorSeqNbr690((int)number);
	}
	
	/**
	 * 	Update ErrorSeqNbr690 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorSeqNbr690(char[] value) throws CFException {
		 errorSeqNbr690 = serializeErrorSeqNbr690(value);
	}
	/**
	 * 	Update ErrorSeqNbr690 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorSeqNbr690String(char[] value) throws CFException {
		 setErrorSeqNbr690(value);
	}

	
	
	

		public static int getErrorPrefix690FieldLength() {
			return ERROR_PREFIX_690_LENGTH;
		}

}
  
