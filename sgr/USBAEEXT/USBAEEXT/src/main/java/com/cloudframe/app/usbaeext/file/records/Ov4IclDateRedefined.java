package com.cloudframe.app.usbaeext.file.records;

/**
*  The class Ov4IclDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.usbaeext.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ov4IclDateRedefined extends Ov4IclDateRedefinedSerialized { 
   

								private int ov4IclYy;
	
	/**
	* Constructor for Ov4IclDateRedefined
	**/
    public Ov4IclDateRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ov4IclDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4IclDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ov4IclYy
	 *	@return ov4IclYy
	 */
	public int getOv4IclYy() throws CFException {
       if (isOv4IclYyModified()) { 
           ov4IclYy = refreshOv4IclYy();
        }
   		return ov4IclYy;
	}
	

	
	   
	/**
	 * 	Update Ov4IclYy with the passed value
	 *  Corresponding COBOL Variable is OV4-ICL-YY
	 *	@param number
	 */
	public void setOv4IclYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ov4IclYy = checkOv4IclYyMaxLimit(number); 
		serializeOv4IclYy(ov4IclYy);
	}
	

	public void setOv4IclYy(long number) {
	    number = checkOv4IclYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setOv4IclYy((int)number);
	}
	
	/**
	 * 	Update Ov4IclYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setOv4IclYy(char[] value) throws CFException {
		 ov4IclYy = serializeOv4IclYy(value);
	}
	/**
	 * 	Update Ov4IclYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOv4IclYyString(char[] value) throws CFException {
		 setOv4IclYy(value);
	}

	
	
	

		public static int getOv4IclDateRedefinedFieldLength() {
			return OV_4_ICL_DATE_REDEFINED_LENGTH;
		}

}
  
