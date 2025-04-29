package com.cloudframe.app.ms00d363.dto;

/**
*  The class WaWorkOfDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WaWorkOfDate extends WaWorkOfDateSerialized {
   

								private int waWodYy;

								private int waWodMm;

								private int waWodDd;
	
	/**
	* Constructor for WaWorkOfDate
	**/
    public WaWorkOfDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of waWodYy
	 *	@return waWodYy
	 */
	public int getWaWodYy() throws CFException {
       if (isWaWodYyModified()) { 
           waWodYy = refreshWaWodYy();
        }
   		return waWodYy;
	}
	

	
	   
	/**
	 * 	Update WaWodYy with the passed value
	 *  Corresponding COBOL Variable is WA-WOD-YY
	 *	@param number
	 */
	public void setWaWodYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waWodYy = checkWaWodYyMaxLimit(number); 
		serializeWaWodYy(waWodYy);
	}
	

	public void setWaWodYy(long number) {
	    number = checkWaWodYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaWodYy((int)number);
	}
	
	/**
	 * 	Update WaWodYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaWodYy(char[] value) throws CFException {
		 waWodYy = serializeWaWodYy(value);
	}
	/**
	 * 	Update WaWodYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaWodYyString(char[] value) throws CFException {
		 setWaWodYy(value);
	}
	/**
	 *	Returns the value of waWodMm
	 *	@return waWodMm
	 */
	public int getWaWodMm() throws CFException {
       if (isWaWodMmModified()) { 
           waWodMm = refreshWaWodMm();
        }
   		return waWodMm;
	}
	

	
	   
	/**
	 * 	Update WaWodMm with the passed value
	 *  Corresponding COBOL Variable is WA-WOD-MM
	 *	@param number
	 */
	public void setWaWodMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waWodMm = checkWaWodMmMaxLimit(number); 
		serializeWaWodMm(waWodMm);
	}
	

	public void setWaWodMm(long number) {
	    number = checkWaWodMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaWodMm((int)number);
	}
	
	/**
	 * 	Update WaWodMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaWodMm(char[] value) throws CFException {
		 waWodMm = serializeWaWodMm(value);
	}
	/**
	 * 	Update WaWodMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaWodMmString(char[] value) throws CFException {
		 setWaWodMm(value);
	}
	/**
	 *	Returns the value of waWodDd
	 *	@return waWodDd
	 */
	public int getWaWodDd() throws CFException {
       if (isWaWodDdModified()) { 
           waWodDd = refreshWaWodDd();
        }
   		return waWodDd;
	}
	

	
	   
	/**
	 * 	Update WaWodDd with the passed value
	 *  Corresponding COBOL Variable is WA-WOD-DD
	 *	@param number
	 */
	public void setWaWodDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waWodDd = checkWaWodDdMaxLimit(number); 
		serializeWaWodDd(waWodDd);
	}
	

	public void setWaWodDd(long number) {
	    number = checkWaWodDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaWodDd((int)number);
	}
	
	/**
	 * 	Update WaWodDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaWodDd(char[] value) throws CFException {
		 waWodDd = serializeWaWodDd(value);
	}
	/**
	 * 	Update WaWodDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaWodDdString(char[] value) throws CFException {
		 setWaWodDd(value);
	}

	
	
	

		public static int getWaWorkOfDateFieldLength() {
			return WA_WORK_OF_DATE_LENGTH;
		}

}
  
