package com.cloudframe.app.ar640010.dto;

/**
*  The class McinfoErrorMsg621 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class McinfoErrorMsg621 extends McinfoErrorMsg621Serialized {
   


								private int mcinfoReturnCode621;
	
	/**
	* Constructor for McinfoErrorMsg621
	**/
    public McinfoErrorMsg621() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("2010-MCINFO ERROR ENCOUNTERED, RETURN-CODE: ").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setMcinfoReturnCode621(0);
    }


 

	/**
	 *	Returns the value of mcinfoReturnCode621
	 *	@return mcinfoReturnCode621
	 */
	public int getMcinfoReturnCode621() throws CFException {
       if (isMcinfoReturnCode621Modified()) { 
           mcinfoReturnCode621 = refreshMcinfoReturnCode621();
        }
   		return mcinfoReturnCode621;
	}
	

	
	   
	/**
	 * 	Update McinfoReturnCode621 with the passed value
	 *  Corresponding COBOL Variable is 621-MCINFO-RETURN-CODE
	 *	@param number
	 */
	public void setMcinfoReturnCode621(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mcinfoReturnCode621 = checkMcinfoReturnCode621MaxLimit(number); 
		serializeMcinfoReturnCode621(mcinfoReturnCode621);
	}
	

	public void setMcinfoReturnCode621(long number) {
	    number = checkMcinfoReturnCode621MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMcinfoReturnCode621((int)number);
	}
	
	/**
	 * 	Update McinfoReturnCode621 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMcinfoReturnCode621(char[] value) throws CFException {
		 mcinfoReturnCode621 = serializeMcinfoReturnCode621(value);
	}
	/**
	 * 	Update McinfoReturnCode621 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMcinfoReturnCode621String(char[] value) throws CFException {
		 setMcinfoReturnCode621(value);
	}

	
	
	

		public static int getMcinfoErrorMsg621FieldLength() {
			return MCINFO_ERROR_MSG_621_LENGTH;
		}

}
  
