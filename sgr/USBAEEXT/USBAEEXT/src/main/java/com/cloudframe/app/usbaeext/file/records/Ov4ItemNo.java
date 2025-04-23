package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4ItemNo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4ItemNo extends Ov4ItemNoSerialized { 
   

								private int ov4InJulYear;

								private int ov4InJulDay;

								private int ov4InBatch;

								private int ov4InSeqInBat;
	
	/**
	* Constructor for Ov4ItemNo
	**/
    public Ov4ItemNo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4ItemNo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4ItemNo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ov4InJulYear
	 *	@return ov4InJulYear
	 */
	public int getOv4InJulYear() throws CFException {
       if (isOv4InJulYearModified()) { 
           ov4InJulYear = refreshOv4InJulYear();
        }
   		return ov4InJulYear;
	}
	

	
	   
	/**
	 * 	Update Ov4InJulYear with the passed value
	 *  Corresponding COBOL Variable is OV4-IN-JUL-YEAR
	 *	@param number
	 */
	public void setOv4InJulYear(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4InJulYear = checkOv4InJulYearMaxLimit(number); 
		serializeOv4InJulYear(ov4InJulYear);
	}
	

	public void setOv4InJulYear(long number) {
	    number = checkOv4InJulYearMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4InJulYear((int)number);
	}
	
	/**
	 * 	Update Ov4InJulYear with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InJulYear(char[] value) throws CFException {
		 ov4InJulYear = serializeOv4InJulYear(value);
	}
	/**
	 * 	Update Ov4InJulYear with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InJulYearString(char[] value) throws CFException {
		 setOv4InJulYear(value);
	}
	/**
	 *	Returns the value of ov4InJulDay
	 *	@return ov4InJulDay
	 */
	public int getOv4InJulDay() throws CFException {
       if (isOv4InJulDayModified()) { 
           ov4InJulDay = refreshOv4InJulDay();
        }
   		return ov4InJulDay;
	}
	

	
	   
	/**
	 * 	Update Ov4InJulDay with the passed value
	 *  Corresponding COBOL Variable is OV4-IN-JUL-DAY
	 *	@param number
	 */
	public void setOv4InJulDay(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4InJulDay = checkOv4InJulDayMaxLimit(number); 
		serializeOv4InJulDay(ov4InJulDay);
	}
	

	public void setOv4InJulDay(long number) {
	    number = checkOv4InJulDayMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4InJulDay((int)number);
	}
	
	/**
	 * 	Update Ov4InJulDay with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InJulDay(char[] value) throws CFException {
		 ov4InJulDay = serializeOv4InJulDay(value);
	}
	/**
	 * 	Update Ov4InJulDay with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InJulDayString(char[] value) throws CFException {
		 setOv4InJulDay(value);
	}
	/**
	 *	Returns the value of ov4InBatch
	 *	@return ov4InBatch
	 */
	public int getOv4InBatch() throws CFException {
       if (isOv4InBatchModified()) { 
           ov4InBatch = refreshOv4InBatch();
        }
   		return ov4InBatch;
	}
	

	
	   
	/**
	 * 	Update Ov4InBatch with the passed value
	 *  Corresponding COBOL Variable is OV4-IN-BATCH
	 *	@param number
	 */
	public void setOv4InBatch(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4InBatch = checkOv4InBatchMaxLimit(number); 
		serializeOv4InBatch(ov4InBatch);
	}
	

	public void setOv4InBatch(long number) {
	    number = checkOv4InBatchMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4InBatch((int)number);
	}
	
	/**
	 * 	Update Ov4InBatch with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InBatch(char[] value) throws CFException {
		 ov4InBatch = serializeOv4InBatch(value);
	}
	/**
	 * 	Update Ov4InBatch with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InBatchString(char[] value) throws CFException {
		 setOv4InBatch(value);
	}
	/**
	 *	Returns the value of ov4InSeqInBat
	 *	@return ov4InSeqInBat
	 */
	public int getOv4InSeqInBat() throws CFException {
       if (isOv4InSeqInBatModified()) { 
           ov4InSeqInBat = refreshOv4InSeqInBat();
        }
   		return ov4InSeqInBat;
	}
	

	
	   
	/**
	 * 	Update Ov4InSeqInBat with the passed value
	 *  Corresponding COBOL Variable is OV4-IN-SEQ-IN-BAT
	 *	@param number
	 */
	public void setOv4InSeqInBat(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4InSeqInBat = checkOv4InSeqInBatMaxLimit(number); 
		serializeOv4InSeqInBat(ov4InSeqInBat);
	}
	

	public void setOv4InSeqInBat(long number) {
	    number = checkOv4InSeqInBatMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4InSeqInBat((int)number);
	}
	
	/**
	 * 	Update Ov4InSeqInBat with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4InSeqInBat(char[] value) throws CFException {
		 ov4InSeqInBat = serializeOv4InSeqInBat(value);
	}
	/**
	 * 	Update Ov4InSeqInBat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4InSeqInBatString(char[] value) throws CFException {
		 setOv4InSeqInBat(value);
	}

	
	
	

		public static int getOv4ItemNoFieldLength() {
			return OV_4_ITEM_NO_LENGTH;
		}

}
  
