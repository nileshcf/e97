package com.cloudframe.app.ip662010.dto;

/**
*  The class UndefinedPds600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class UndefinedPds600 extends UndefinedPds600Serialized {
   


								private int undefinedPdsNo600;
	
	/**
	* Constructor for UndefinedPds600
	**/
    public UndefinedPds600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NO PDS IS DEFINED WITH THIS NUMBER: ").toCharArray()
             , getStartOffset() + 0
             ,36
             );
    }


 

	/**
	 *	Returns the value of undefinedPdsNo600
	 *	@return undefinedPdsNo600
	 */
	public int getUndefinedPdsNo600() throws CFException {
       if (isUndefinedPdsNo600Modified()) { 
           undefinedPdsNo600 = refreshUndefinedPdsNo600();
        }
   		return undefinedPdsNo600;
	}
	

	
	   
	/**
	 * 	Update UndefinedPdsNo600 with the passed value
	 *  Corresponding COBOL Variable is 600-UNDEFINED-PDS-NO
	 *	@param number
	 */
	public void setUndefinedPdsNo600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    undefinedPdsNo600 = checkUndefinedPdsNo600MaxLimit(number); 
		serializeUndefinedPdsNo600(undefinedPdsNo600);
	}
	

	public void setUndefinedPdsNo600(long number) {
	    number = checkUndefinedPdsNo600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setUndefinedPdsNo600((int)number);
	}
	
	/**
	 * 	Update UndefinedPdsNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUndefinedPdsNo600(char[] value) throws CFException {
		 undefinedPdsNo600 = serializeUndefinedPdsNo600(value);
	}
	/**
	 * 	Update UndefinedPdsNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUndefinedPdsNo600String(char[] value) throws CFException {
		 setUndefinedPdsNo600(value);
	}

	
	
	

		public static int getUndefinedPds600FieldLength() {
			return UNDEFINED_PDS_600_LENGTH;
		}

}
  
