package com.cloudframe.app.d5427dt1.dto;

/**
*  The class LilianGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.d5427dt1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class LilianGroup extends LilianGroupSerialized { 
   

								private int lilian;
	
	/**
	* Constructor for LilianGroup
	**/
    public LilianGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lilian
	 *	@return lilian
	 */
	public int getLilian() throws CFException {
        if (isLilianModified()) { 
           lilian = refreshLilian();
        }
   		return lilian;
	}
	
	/**
	 * 	Update Lilian with the passed value
	 *  Corresponding COBOL Variable is LILIAN
	 *	@param number
	 */
	public void setLilian(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lilian = checkLilianMaxLimit(number); 
		serializeLilian(lilian);
	}


	public void setLilian(long number) {
	    number = checkLilianMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLilian((int)number);
	}
	

	
	
	

		public static int getLilianGroupFieldLength() {
			return LILIAN_GROUP_LENGTH;
		}

}
  
