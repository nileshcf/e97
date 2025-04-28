package com.cloudframe.app.o529351u.dto;

/**
*  The class FesaDateTimestamp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FesaDateTimestamp extends FesaDateTimestampSerialized { 
   

								private int fesaDatestamp;

								private int fesaTimestamp;
	
	/**
	* Constructor for FesaDateTimestamp
	**/
    public FesaDateTimestamp() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FesaDateTimestamp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesaDateTimestamp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getFesaDatestamp() throws CFException {
        if (isFesaDatestampModified()) { 
           fesaDatestamp = refreshFesaDatestamp();
        }
   		return fesaDatestamp;
	}
	
	/**
	 * 	Update FesaDatestamp with the passed value
	 *  Corresponding COBOL Variable is FESA-DATESTAMP
	 *	@param number
	 */
	public void setFesaDatestamp(int number) {
			fesaDatestamp = checkFesaDatestampMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaDatestamp(fesaDatestamp);
	}


	public void setFesaDatestamp(long number) {
	    number = checkFesaDatestampMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaDatestamp((int)number);
	}
	
	public int getFesaTimestamp() throws CFException {
        if (isFesaTimestampModified()) { 
           fesaTimestamp = refreshFesaTimestamp();
        }
   		return fesaTimestamp;
	}
	
	/**
	 * 	Update FesaTimestamp with the passed value
	 *  Corresponding COBOL Variable is FESA-TIMESTAMP
	 *	@param number
	 */
	public void setFesaTimestamp(int number) {
			fesaTimestamp = checkFesaTimestampMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFesaTimestamp(fesaTimestamp);
	}


	public void setFesaTimestamp(long number) {
	    number = checkFesaTimestampMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFesaTimestamp((int)number);
	}
	

	
	
	

		public static int getFesaDateTimestampFieldLength() {
			return FESA_DATE_TIMESTAMP_LENGTH;
		}

}
  
