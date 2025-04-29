package com.cloudframe.app.bm8090m.dto;

/**
*  The class WtipPer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WtipPer extends WtipPerSerialized { 
   

								private int wPer;
	
	/**
	* Constructor for WtipPer
	**/
    public WtipPer() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WtipPer. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtipPer(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wPer
	 *	@return wPer
	 */
	public int getWPer() throws CFException {
       if (isWPerModified()) { 
           wPer = refreshWPer();
        }
   		return wPer;
	}
	

	
	   
	/**
	 * 	Update WPer with the passed value
	 *  Corresponding COBOL Variable is W-PER
	 *	@param number
	 */
	public void setWPer(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wPer = checkWPerMaxLimit(number); 
		serializeWPer(wPer);
	}
	

	public void setWPer(long number) {
	    number = checkWPerMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWPer((int)number);
	}
	
	/**
	 * 	Update WPer with the passed value
	 *	@param value (String or char[])
	 */
	public void setWPer(char[] value) throws CFException {
		 wPer = serializeWPer(value);
	}
	/**
	 * 	Update WPer with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWPerString(char[] value) throws CFException {
		 setWPer(value);
	}

	
	
	

		public static int getWtipPerFieldLength() {
			return WTIP_PER_LENGTH;
		}

}
  
