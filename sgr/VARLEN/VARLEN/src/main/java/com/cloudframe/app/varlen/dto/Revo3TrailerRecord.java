package com.cloudframe.app.varlen.dto;

/**
*  The class Revo3TrailerRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.varlen.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Revo3TrailerRecord extends Revo3TrailerRecordSerialized { 
   

								private long revo3TrlrRecordCount;
	
	/**
	* Constructor for Revo3TrailerRecord
	**/
    public Revo3TrailerRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Revo3TrailerRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Revo3TrailerRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of revo3TrlrRecordCount
	 *	@return revo3TrlrRecordCount
	 */
	public long getRevo3TrlrRecordCount() throws CFException {
       if (isRevo3TrlrRecordCountModified()) { 
           revo3TrlrRecordCount = refreshRevo3TrlrRecordCount();
        }
   		return revo3TrlrRecordCount;
	}
	

	
	   
	/**
	 * 	Update Revo3TrlrRecordCount with the passed value
	 *  Corresponding COBOL Variable is REVO3-TRLR-RECORD-COUNT
	 *	@param number
	 */
	public void setRevo3TrlrRecordCount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    revo3TrlrRecordCount = checkRevo3TrlrRecordCountMaxLimit(number); 
		serializeRevo3TrlrRecordCount(revo3TrlrRecordCount);
	}
	

	/**
	 * 	Update Revo3TrlrRecordCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setRevo3TrlrRecordCount(char[] value) throws CFException {
		 revo3TrlrRecordCount = serializeRevo3TrlrRecordCount(value);
	}
	/**
	 * 	Update Revo3TrlrRecordCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRevo3TrlrRecordCountString(char[] value) throws CFException {
		 setRevo3TrlrRecordCount(value);
	}

	
	
	

		public static int getRevo3TrailerRecordFieldLength() {
			return REVO_3_TRAILER_RECORD_LENGTH;
		}

}
  
