package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar642FunctionMsg660 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ar642FunctionMsg660 extends Ar642FunctionMsg660Serialized {
   


								private long ar642FunctionReturn660;


								private long ar642FunctionReason660;


								private long ar642FunctionAbend660;
	
	/**
	* Constructor for Ar642FunctionMsg660
	**/
    public Ar642FunctionMsg660() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6001-INTERNAL FUNCTION - RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,38
             );
								setAr642FunctionReturn660(0L);
       replaceValue( // serialize and save the value
             (", REASON-CODE: ").toCharArray()
             , getStartOffset() + 47
             ,15
             );
								setAr642FunctionReason660(0L);
       replaceValue( // serialize and save the value
             (", ABEND-CODE: ").toCharArray()
             , getStartOffset() + 71
             ,14
             );
								setAr642FunctionAbend660(0L);
    }


 

	/**
	 *	Returns the value of ar642FunctionReturn660
	 *	@return ar642FunctionReturn660
	 */
	public long getAr642FunctionReturn660() throws CFException {
       if (isAr642FunctionReturn660Modified()) { 
           ar642FunctionReturn660 = refreshAr642FunctionReturn660();
        }
   		return ar642FunctionReturn660;
	}
	

	
	   
	/**
	 * 	Update Ar642FunctionReturn660 with the passed value
	 *  Corresponding COBOL Variable is 660-AR642-FUNCTION-RETURN
	 *	@param number
	 */
	public void setAr642FunctionReturn660(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar642FunctionReturn660 = checkAr642FunctionReturn660MaxLimit(number); 
		serializeAr642FunctionReturn660(ar642FunctionReturn660);
	}
	

	/**
	 * 	Update Ar642FunctionReturn660 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr642FunctionReturn660(char[] value) throws CFException {
		 ar642FunctionReturn660 = serializeAr642FunctionReturn660(value);
	}
	/**
	 * 	Update Ar642FunctionReturn660 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr642FunctionReturn660String(char[] value) throws CFException {
		 setAr642FunctionReturn660(value);
	}
	/**
	 *	Returns the value of ar642FunctionReason660
	 *	@return ar642FunctionReason660
	 */
	public long getAr642FunctionReason660() throws CFException {
       if (isAr642FunctionReason660Modified()) { 
           ar642FunctionReason660 = refreshAr642FunctionReason660();
        }
   		return ar642FunctionReason660;
	}
	

	
	   
	/**
	 * 	Update Ar642FunctionReason660 with the passed value
	 *  Corresponding COBOL Variable is 660-AR642-FUNCTION-REASON
	 *	@param number
	 */
	public void setAr642FunctionReason660(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar642FunctionReason660 = checkAr642FunctionReason660MaxLimit(number); 
		serializeAr642FunctionReason660(ar642FunctionReason660);
	}
	

	/**
	 * 	Update Ar642FunctionReason660 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr642FunctionReason660(char[] value) throws CFException {
		 ar642FunctionReason660 = serializeAr642FunctionReason660(value);
	}
	/**
	 * 	Update Ar642FunctionReason660 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr642FunctionReason660String(char[] value) throws CFException {
		 setAr642FunctionReason660(value);
	}
	/**
	 *	Returns the value of ar642FunctionAbend660
	 *	@return ar642FunctionAbend660
	 */
	public long getAr642FunctionAbend660() throws CFException {
       if (isAr642FunctionAbend660Modified()) { 
           ar642FunctionAbend660 = refreshAr642FunctionAbend660();
        }
   		return ar642FunctionAbend660;
	}
	

	
	   
	/**
	 * 	Update Ar642FunctionAbend660 with the passed value
	 *  Corresponding COBOL Variable is 660-AR642-FUNCTION-ABEND
	 *	@param number
	 */
	public void setAr642FunctionAbend660(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar642FunctionAbend660 = checkAr642FunctionAbend660MaxLimit(number); 
		serializeAr642FunctionAbend660(ar642FunctionAbend660);
	}
	

	/**
	 * 	Update Ar642FunctionAbend660 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr642FunctionAbend660(char[] value) throws CFException {
		 ar642FunctionAbend660 = serializeAr642FunctionAbend660(value);
	}
	/**
	 * 	Update Ar642FunctionAbend660 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr642FunctionAbend660String(char[] value) throws CFException {
		 setAr642FunctionAbend660(value);
	}

	
	
	

		public static int getAr642FunctionMsg660FieldLength() {
			return AR_642_FUNCTION_MSG_660_LENGTH;
		}

}
  
