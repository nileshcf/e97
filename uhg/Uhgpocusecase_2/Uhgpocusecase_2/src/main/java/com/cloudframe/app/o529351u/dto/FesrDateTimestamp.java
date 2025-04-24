package com.cloudframe.app.o529351u.dto;

/**
*  The class FesrDateTimestamp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesrDateTimestamp extends FesrDateTimestampSerialized { 
   

								private int fesrDatestamp;

								private int fesrTimestamp;
	
	/**
	* Constructor for FesrDateTimestamp
	**/
    public FesrDateTimestamp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesrDateTimestamp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrDateTimestamp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getFesrDatestamp() throws CFException {
        if (isFesrDatestampModified()) { 
           fesrDatestamp = refreshFesrDatestamp();
        }
   		return fesrDatestamp;
	}
	
	/**
	 * 	Update FesrDatestamp with the passed value
	 *  Corresponding COBOL Variable is FESR-DATESTAMP
	 *	@param number
	 */
	public void setFesrDatestamp(int number) {
			fesrDatestamp = checkFesrDatestampMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesrDatestamp(fesrDatestamp);
	}


	public void setFesrDatestamp(long number) {
	    number = checkFesrDatestampMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesrDatestamp((int)number);
	}
	
	public int getFesrTimestamp() throws CFException {
        if (isFesrTimestampModified()) { 
           fesrTimestamp = refreshFesrTimestamp();
        }
   		return fesrTimestamp;
	}
	
	/**
	 * 	Update FesrTimestamp with the passed value
	 *  Corresponding COBOL Variable is FESR-TIMESTAMP
	 *	@param number
	 */
	public void setFesrTimestamp(int number) {
			fesrTimestamp = checkFesrTimestampMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesrTimestamp(fesrTimestamp);
	}


	public void setFesrTimestamp(long number) {
	    number = checkFesrTimestampMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesrTimestamp((int)number);
	}
	

	
	
	

		public static int getFesrDateTimestampFieldLength() {
			return FESR_DATE_TIMESTAMP_LENGTH;
		}

}
  
