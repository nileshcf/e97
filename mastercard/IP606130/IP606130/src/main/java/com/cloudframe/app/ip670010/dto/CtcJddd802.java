package com.cloudframe.app.ip670010.dto;

/**
*  The class CtcJddd802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CtcJddd802 extends CtcJddd802Serialized { 
   

								private int ctcJDdd80201;
	
	/**
	* Constructor for CtcJddd802
	**/
    public CtcJddd802() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CtcJddd802. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CtcJddd802(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ctcJDdd80201
	 *	@return ctcJDdd80201
	 */
	public int getCtcJDdd80201() throws CFException {
       if (isCtcJDdd80201Modified()) { 
           ctcJDdd80201 = refreshCtcJDdd80201();
        }
   		return ctcJDdd80201;
	}
	

	
	   
	/**
	 * 	Update CtcJDdd80201 with the passed value
	 *  Corresponding COBOL Variable is 802-CTC-J-DDD
	 *	@param number
	 */
	public void setCtcJDdd80201(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ctcJDdd80201 = checkCtcJDdd80201MaxLimit(number); 
		serializeCtcJDdd80201(ctcJDdd80201);
	}
	

	public void setCtcJDdd80201(long number) {
	    number = checkCtcJDdd80201MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCtcJDdd80201((int)number);
	}
	
	/**
	 * 	Update CtcJDdd80201 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCtcJDdd80201(char[] value) throws CFException {
		 ctcJDdd80201 = serializeCtcJDdd80201(value);
	}
	/**
	 * 	Update CtcJDdd80201 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCtcJDdd80201String(char[] value) throws CFException {
		 setCtcJDdd80201(value);
	}

	
	
	

		public static int getCtcJddd802FieldLength() {
			return CTC_JDDD_802_LENGTH;
		}

}
  
