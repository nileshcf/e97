package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4CycleDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4CycleDateRedefined extends Ov4CycleDateRedefinedSerialized { 
   

								private int ov4CycleDateMm;

								private int ov4CycleDateDd;

								private int ov4CycleDateYy;
	
	/**
	* Constructor for Ov4CycleDateRedefined
	**/
    public Ov4CycleDateRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4CycleDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4CycleDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ov4CycleDateMm
	 *	@return ov4CycleDateMm
	 */
	public int getOv4CycleDateMm() throws CFException {
       if (isOv4CycleDateMmModified()) { 
           ov4CycleDateMm = refreshOv4CycleDateMm();
        }
   		return ov4CycleDateMm;
	}
	

	
	   
	/**
	 * 	Update Ov4CycleDateMm with the passed value
	 *  Corresponding COBOL Variable is OV4-CYCLE-DATE-MM
	 *	@param number
	 */
	public void setOv4CycleDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4CycleDateMm = checkOv4CycleDateMmMaxLimit(number); 
		serializeOv4CycleDateMm(ov4CycleDateMm);
	}
	

	public void setOv4CycleDateMm(long number) {
	    number = checkOv4CycleDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4CycleDateMm((int)number);
	}
	
	/**
	 * 	Update Ov4CycleDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateMm(char[] value) throws CFException {
		 ov4CycleDateMm = serializeOv4CycleDateMm(value);
	}
	/**
	 * 	Update Ov4CycleDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateMmString(char[] value) throws CFException {
		 setOv4CycleDateMm(value);
	}
	/**
	 *	Returns the value of ov4CycleDateDd
	 *	@return ov4CycleDateDd
	 */
	public int getOv4CycleDateDd() throws CFException {
       if (isOv4CycleDateDdModified()) { 
           ov4CycleDateDd = refreshOv4CycleDateDd();
        }
   		return ov4CycleDateDd;
	}
	

	
	   
	/**
	 * 	Update Ov4CycleDateDd with the passed value
	 *  Corresponding COBOL Variable is OV4-CYCLE-DATE-DD
	 *	@param number
	 */
	public void setOv4CycleDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4CycleDateDd = checkOv4CycleDateDdMaxLimit(number); 
		serializeOv4CycleDateDd(ov4CycleDateDd);
	}
	

	public void setOv4CycleDateDd(long number) {
	    number = checkOv4CycleDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4CycleDateDd((int)number);
	}
	
	/**
	 * 	Update Ov4CycleDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateDd(char[] value) throws CFException {
		 ov4CycleDateDd = serializeOv4CycleDateDd(value);
	}
	/**
	 * 	Update Ov4CycleDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateDdString(char[] value) throws CFException {
		 setOv4CycleDateDd(value);
	}
	/**
	 *	Returns the value of ov4CycleDateYy
	 *	@return ov4CycleDateYy
	 */
	public int getOv4CycleDateYy() throws CFException {
       if (isOv4CycleDateYyModified()) { 
           ov4CycleDateYy = refreshOv4CycleDateYy();
        }
   		return ov4CycleDateYy;
	}
	

	
	   
	/**
	 * 	Update Ov4CycleDateYy with the passed value
	 *  Corresponding COBOL Variable is OV4-CYCLE-DATE-YY
	 *	@param number
	 */
	public void setOv4CycleDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4CycleDateYy = checkOv4CycleDateYyMaxLimit(number); 
		serializeOv4CycleDateYy(ov4CycleDateYy);
	}
	

	public void setOv4CycleDateYy(long number) {
	    number = checkOv4CycleDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4CycleDateYy((int)number);
	}
	
	/**
	 * 	Update Ov4CycleDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateYy(char[] value) throws CFException {
		 ov4CycleDateYy = serializeOv4CycleDateYy(value);
	}
	/**
	 * 	Update Ov4CycleDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4CycleDateYyString(char[] value) throws CFException {
		 setOv4CycleDateYy(value);
	}

	
	
	

		public static int getOv4CycleDateRedefinedFieldLength() {
			return OV_4_CYCLE_DATE_REDEFINED_LENGTH;
		}

}
  
