package com.cloudframe.app.ms00d363.dto;

/**
*  The class WaCurrentDateRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WaCurrentDateRedefined extends WaCurrentDateRedefinedSerialized { 
   

								private int waCurrYy;

								private int waCurrMm;

								private int waCurrDd;
	
	/**
	* Constructor for WaCurrentDateRedefined
	**/
    public WaCurrentDateRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WaCurrentDateRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WaCurrentDateRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of waCurrYy
	 *	@return waCurrYy
	 */
	public int getWaCurrYy() throws CFException {
       if (isWaCurrYyModified()) { 
           waCurrYy = refreshWaCurrYy();
        }
   		return waCurrYy;
	}
	

	
	   
	/**
	 * 	Update WaCurrYy with the passed value
	 *  Corresponding COBOL Variable is WA-CURR-YY
	 *	@param number
	 */
	public void setWaCurrYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waCurrYy = checkWaCurrYyMaxLimit(number); 
		serializeWaCurrYy(waCurrYy);
	}
	

	public void setWaCurrYy(long number) {
	    number = checkWaCurrYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaCurrYy((int)number);
	}
	
	/**
	 * 	Update WaCurrYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaCurrYy(char[] value) throws CFException {
		 waCurrYy = serializeWaCurrYy(value);
	}
	/**
	 * 	Update WaCurrYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaCurrYyString(char[] value) throws CFException {
		 setWaCurrYy(value);
	}
	/**
	 *	Returns the value of waCurrMm
	 *	@return waCurrMm
	 */
	public int getWaCurrMm() throws CFException {
       if (isWaCurrMmModified()) { 
           waCurrMm = refreshWaCurrMm();
        }
   		return waCurrMm;
	}
	

	
	   
	/**
	 * 	Update WaCurrMm with the passed value
	 *  Corresponding COBOL Variable is WA-CURR-MM
	 *	@param number
	 */
	public void setWaCurrMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waCurrMm = checkWaCurrMmMaxLimit(number); 
		serializeWaCurrMm(waCurrMm);
	}
	

	public void setWaCurrMm(long number) {
	    number = checkWaCurrMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaCurrMm((int)number);
	}
	
	/**
	 * 	Update WaCurrMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaCurrMm(char[] value) throws CFException {
		 waCurrMm = serializeWaCurrMm(value);
	}
	/**
	 * 	Update WaCurrMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaCurrMmString(char[] value) throws CFException {
		 setWaCurrMm(value);
	}
	/**
	 *	Returns the value of waCurrDd
	 *	@return waCurrDd
	 */
	public int getWaCurrDd() throws CFException {
       if (isWaCurrDdModified()) { 
           waCurrDd = refreshWaCurrDd();
        }
   		return waCurrDd;
	}
	

	
	   
	/**
	 * 	Update WaCurrDd with the passed value
	 *  Corresponding COBOL Variable is WA-CURR-DD
	 *	@param number
	 */
	public void setWaCurrDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    waCurrDd = checkWaCurrDdMaxLimit(number); 
		serializeWaCurrDd(waCurrDd);
	}
	

	public void setWaCurrDd(long number) {
	    number = checkWaCurrDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWaCurrDd((int)number);
	}
	
	/**
	 * 	Update WaCurrDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWaCurrDd(char[] value) throws CFException {
		 waCurrDd = serializeWaCurrDd(value);
	}
	/**
	 * 	Update WaCurrDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWaCurrDdString(char[] value) throws CFException {
		 setWaCurrDd(value);
	}

	
	
	

		public static int getWaCurrentDateRedefinedFieldLength() {
			return WA_CURRENT_DATE_REDEFINED_LENGTH;
		}

}
  
