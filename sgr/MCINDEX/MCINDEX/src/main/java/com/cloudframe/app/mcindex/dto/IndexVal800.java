package com.cloudframe.app.mcindex.dto;

/**
*  The class IndexVal800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.mcindex.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class IndexVal800 extends IndexVal800Serialized {
   

								private int index800;
	
	/**
	* Constructor for IndexVal800
	**/
    public IndexVal800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of index800
	 *	@return index800
	 */
	public int getIndex800() throws CFException {
        if (isIndex800Modified()) { 
           index800 = refreshIndex800();
        }
   		return index800;
	}
	
	/**
	 * 	Update Index800 with the passed value
	 *  Corresponding COBOL Variable is 800-INDEX
	 *	@param number
	 */
	public void setIndex800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    index800 = checkIndex800MaxLimit(number); 
		serializeIndex800(index800);
	}


	public void setIndex800(long number) {
	    number = checkIndex800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIndex800((int)number);
	}
	

	
	
	

		public static int getIndexVal800FieldLength() {
			return INDEX_VAL_800_LENGTH;
		}

}
  
