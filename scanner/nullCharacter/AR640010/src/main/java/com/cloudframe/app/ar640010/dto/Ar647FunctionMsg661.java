package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647FunctionMsg661 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ar647FunctionMsg661 extends Ar647FunctionMsg661Serialized {
   


								private long ar647FunctionReturn661;


								private long ar647FunctionReason661;


								private long ar647FunctionAbend661;

	
	/**
	* Constructor for Ar647FunctionMsg661
	**/
    public Ar647FunctionMsg661() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6023-RETURN-CODE:  ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setAr647FunctionReturn661(0L);
       replaceValue( // serialize and save the value
             (", REASON-CODE: ").toCharArray()
             , getStartOffset() + 28
             ,15
             );
								setAr647FunctionReason661(0L);
       replaceValue( // serialize and save the value
             (", ABEND-CODE: ").toCharArray()
             , getStartOffset() + 52
             ,14
             );
								setAr647FunctionAbend661(0L);
       replaceValue( // serialize and save the value
             (" - SEE \"9999-\" MESSAGE").toCharArray()
             , getStartOffset() + 75
             ,22
             );
    }


 

	/**
	 *	Returns the value of ar647FunctionReturn661
	 *	@return ar647FunctionReturn661
	 */
	public long getAr647FunctionReturn661() throws CFException {
       if (isAr647FunctionReturn661Modified()) { 
           ar647FunctionReturn661 = refreshAr647FunctionReturn661();
        }
   		return ar647FunctionReturn661;
	}
	

	
	   
	/**
	 * 	Update Ar647FunctionReturn661 with the passed value
	 *  Corresponding COBOL Variable is 661-AR647-FUNCTION-RETURN
	 *	@param number
	 */
	public void setAr647FunctionReturn661(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar647FunctionReturn661 = checkAr647FunctionReturn661MaxLimit(number); 
		serializeAr647FunctionReturn661(ar647FunctionReturn661);
	}
	

	/**
	 * 	Update Ar647FunctionReturn661 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr647FunctionReturn661(char[] value) throws CFException {
		 ar647FunctionReturn661 = serializeAr647FunctionReturn661(value);
	}
	/**
	 * 	Update Ar647FunctionReturn661 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr647FunctionReturn661String(char[] value) throws CFException {
		 setAr647FunctionReturn661(value);
	}
	/**
	 *	Returns the value of ar647FunctionReason661
	 *	@return ar647FunctionReason661
	 */
	public long getAr647FunctionReason661() throws CFException {
       if (isAr647FunctionReason661Modified()) { 
           ar647FunctionReason661 = refreshAr647FunctionReason661();
        }
   		return ar647FunctionReason661;
	}
	

	
	   
	/**
	 * 	Update Ar647FunctionReason661 with the passed value
	 *  Corresponding COBOL Variable is 661-AR647-FUNCTION-REASON
	 *	@param number
	 */
	public void setAr647FunctionReason661(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar647FunctionReason661 = checkAr647FunctionReason661MaxLimit(number); 
		serializeAr647FunctionReason661(ar647FunctionReason661);
	}
	

	/**
	 * 	Update Ar647FunctionReason661 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr647FunctionReason661(char[] value) throws CFException {
		 ar647FunctionReason661 = serializeAr647FunctionReason661(value);
	}
	/**
	 * 	Update Ar647FunctionReason661 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr647FunctionReason661String(char[] value) throws CFException {
		 setAr647FunctionReason661(value);
	}
	/**
	 *	Returns the value of ar647FunctionAbend661
	 *	@return ar647FunctionAbend661
	 */
	public long getAr647FunctionAbend661() throws CFException {
       if (isAr647FunctionAbend661Modified()) { 
           ar647FunctionAbend661 = refreshAr647FunctionAbend661();
        }
   		return ar647FunctionAbend661;
	}
	

	
	   
	/**
	 * 	Update Ar647FunctionAbend661 with the passed value
	 *  Corresponding COBOL Variable is 661-AR647-FUNCTION-ABEND
	 *	@param number
	 */
	public void setAr647FunctionAbend661(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar647FunctionAbend661 = checkAr647FunctionAbend661MaxLimit(number); 
		serializeAr647FunctionAbend661(ar647FunctionAbend661);
	}
	

	/**
	 * 	Update Ar647FunctionAbend661 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr647FunctionAbend661(char[] value) throws CFException {
		 ar647FunctionAbend661 = serializeAr647FunctionAbend661(value);
	}
	/**
	 * 	Update Ar647FunctionAbend661 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr647FunctionAbend661String(char[] value) throws CFException {
		 setAr647FunctionAbend661(value);
	}

	
	
	

		public static int getAr647FunctionMsg661FieldLength() {
			return AR_647_FUNCTION_MSG_661_LENGTH;
		}

}
  
