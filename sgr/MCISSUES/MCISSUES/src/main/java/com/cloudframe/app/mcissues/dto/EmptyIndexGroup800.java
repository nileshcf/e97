package com.cloudframe.app.mcissues.dto;

/**
*  The class EmptyIndexGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class EmptyIndexGroup800 extends EmptyIndexGroup800Serialized { 
   

								private int emptyIndex800;

								private int emptyIndexVal800;
	
	/**
	* Constructor for EmptyIndexGroup800
	**/
    public EmptyIndexGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of emptyIndex800
	 *	@return emptyIndex800
	 */
	public int getEmptyIndex800() throws CFException {
        if (isEmptyIndex800Modified()) { 
           emptyIndex800 = refreshEmptyIndex800();
        }
   		return emptyIndex800;
	}
	
	/**
	 * 	Update EmptyIndex800 with the passed value
	 *  Corresponding COBOL Variable is 800-EMPTY-INDEX
	 *	@param number
	 */
	public void setEmptyIndex800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    emptyIndex800 = checkEmptyIndex800MaxLimit(number); 
		serializeEmptyIndex800(emptyIndex800);
	}


	public void setEmptyIndex800(long number) {
	    number = checkEmptyIndex800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEmptyIndex800((int)number);
	}
	
	/**
	 *	Returns the value of emptyIndexVal800
	 *	@return emptyIndexVal800
	 */
	public int getEmptyIndexVal800() throws CFException {
        if (isEmptyIndexVal800Modified()) { 
           emptyIndexVal800 = refreshEmptyIndexVal800();
        }
   		return emptyIndexVal800;
	}
	
	/**
	 * 	Update EmptyIndexVal800 with the passed value
	 *  Corresponding COBOL Variable is 800-EMPTY-INDEX-VAL
	 *	@param number
	 */
	public void setEmptyIndexVal800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    emptyIndexVal800 = checkEmptyIndexVal800MaxLimit(number); 
		serializeEmptyIndexVal800(emptyIndexVal800);
	}


	public void setEmptyIndexVal800(long number) {
	    number = checkEmptyIndexVal800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEmptyIndexVal800((int)number);
	}
	

	
	
	

		public static int getEmptyIndexGroup800FieldLength() {
			return EMPTY_INDEX_GROUP_800_LENGTH;
		}

}
  
