package com.cloudframe.app.ip343690.dto;

/**
*  The class Parms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Parms1000 extends Parms1000Serialized {
   

								private short parmLngth1000;

								private long commitFreq1000;
	
	/**
	* Constructor for Parms1000
	**/
    public Parms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmLngth1000
	 *	@return parmLngth1000
	 */
	public short getParmLngth1000() throws CFException {
        if (isParmLngth1000Modified()) { 
           parmLngth1000 = refreshParmLngth1000();
        }
   		return parmLngth1000;
	}
	
	/**
	 * 	Update ParmLngth1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-PARM-LNGTH
	 *	@param number
	 */
	public void setParmLngth1000(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parmLngth1000 = checkParmLngth1000MaxLimit(number); 
		serializeParmLngth1000(parmLngth1000);
	}

	public void setParmLngth1000(int number) {
	    number = checkParmLngth1000MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLngth1000((short)number);
	}
	public void setParmLngth1000(long number) {
	    number = checkParmLngth1000MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParmLngth1000((short)number);
	}
	

	/**
	 *	Returns the value of commitFreq1000
	 *	@return commitFreq1000
	 */
	public long getCommitFreq1000() throws CFException {
       if (isCommitFreq1000Modified()) { 
           commitFreq1000 = refreshCommitFreq1000();
        }
   		return commitFreq1000;
	}
	

	
	   
	/**
	 * 	Update CommitFreq1000 with the passed value
	 *  Corresponding COBOL Variable is 1000-COMMIT-FREQ
	 *	@param number
	 */
	public void setCommitFreq1000(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    commitFreq1000 = checkCommitFreq1000MaxLimit(number); 
		serializeCommitFreq1000(commitFreq1000);
	}
	

	/**
	 * 	Update CommitFreq1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCommitFreq1000(char[] value) throws CFException {
		 commitFreq1000 = serializeCommitFreq1000(value);
	}
	/**
	 * 	Update CommitFreq1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCommitFreq1000String(char[] value) throws CFException {
		 setCommitFreq1000(value);
	}

	
	
	

		public static int getParms1000FieldLength() {
			return PARMS_1000_LENGTH;
		}

}
  
