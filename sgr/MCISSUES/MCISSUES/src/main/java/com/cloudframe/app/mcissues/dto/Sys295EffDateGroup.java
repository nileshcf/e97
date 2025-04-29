package com.cloudframe.app.mcissues.dto;

/**
*  The class Sys295EffDateGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Sys295EffDateGroup extends Sys295EffDateGroupSerialized {
   

								private long sys295EffDate;
	
	/**
	* Constructor for Sys295EffDateGroup
	**/
    public Sys295EffDateGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys295EffDate
	 *	@return sys295EffDate
	 */
	public long getSys295EffDate() throws CFException {
       if (isSys295EffDateModified()) { 
           sys295EffDate = refreshSys295EffDate();
        }
   		return sys295EffDate;
	}
	

	
	   
	/**
	 * 	Update Sys295EffDate with the passed value
	 *  Corresponding COBOL Variable is SYS295-EFF-DATE
	 *	@param number
	 */
	public void setSys295EffDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys295EffDate = checkSys295EffDateMaxLimit(number); 
		serializeSys295EffDate(sys295EffDate);
	}
	

	/**
	 * 	Update Sys295EffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys295EffDate(char[] value) throws CFException {
		 sys295EffDate = serializeSys295EffDate(value);
	}
	/**
	 * 	Update Sys295EffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys295EffDateString(char[] value) throws CFException {
		 setSys295EffDate(value);
	}

	
	
	

		public static int getSys295EffDateGroupFieldLength() {
			return SYS_295_EFF_DATE_GROUP_LENGTH;
		}

}
  
