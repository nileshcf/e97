package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcMmdd802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CtcMmdd802 extends CtcMmdd802Serialized { 
   

								private int ctcMm802;

								private int ctcDd802;
	
	/**
	* Constructor for CtcMmdd802
	**/
    public CtcMmdd802() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CtcMmdd802. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcMmdd802(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ctcMm802
	 *	@return ctcMm802
	 */
	public int getCtcMm802() throws CFException {
       if (isCtcMm802Modified()) { 
           ctcMm802 = refreshCtcMm802();
        }
   		return ctcMm802;
	}
	

	
	   
	/**
	 * 	Update CtcMm802 with the passed value
	 *  Corresponding COBOL Variable is 802-CTC-MM
	 *	@param number
	 */
	public void setCtcMm802(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ctcMm802 = checkCtcMm802MaxLimit(number); 
		serializeCtcMm802(ctcMm802);
	}
	

	public void setCtcMm802(long number) {
	    number = checkCtcMm802MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtcMm802((int)number);
	}
	
	/**
	 * 	Update CtcMm802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcMm802(char[] value) throws CFException {
		 ctcMm802 = serializeCtcMm802(value);
	}
	/**
	 * 	Update CtcMm802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcMm802String(char[] value) throws CFException {
		 setCtcMm802(value);
	}
	/**
	 *	Returns the value of ctcDd802
	 *	@return ctcDd802
	 */
	public int getCtcDd802() throws CFException {
       if (isCtcDd802Modified()) { 
           ctcDd802 = refreshCtcDd802();
        }
   		return ctcDd802;
	}
	

	
	   
	/**
	 * 	Update CtcDd802 with the passed value
	 *  Corresponding COBOL Variable is 802-CTC-DD
	 *	@param number
	 */
	public void setCtcDd802(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ctcDd802 = checkCtcDd802MaxLimit(number); 
		serializeCtcDd802(ctcDd802);
	}
	

	public void setCtcDd802(long number) {
	    number = checkCtcDd802MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtcDd802((int)number);
	}
	
	/**
	 * 	Update CtcDd802 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcDd802(char[] value) throws CFException {
		 ctcDd802 = serializeCtcDd802(value);
	}
	/**
	 * 	Update CtcDd802 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcDd802String(char[] value) throws CFException {
		 setCtcDd802(value);
	}

	
	
	

		public static int getCtcMmdd802FieldLength() {
			return CTC_MMDD_802_LENGTH;
		}

}
  
