package com.cloudframe.app.ip343690.dto;

/**
*  The class SleepTimeGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SleepTimeGroup800 extends SleepTimeGroup800Serialized { 
   

								private long sleepTime800;
	
	/**
	* Constructor for SleepTimeGroup800
	**/
    public SleepTimeGroup800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SleepTimeGroup800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SleepTimeGroup800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSleepTime800(1000L);
    } 

	/**
	 *	Returns the value of sleepTime800
	 *	@return sleepTime800
	 */
	public long getSleepTime800() throws CFException {
       if (isSleepTime800Modified()) { 
           sleepTime800 = refreshSleepTime800();
        }
   		return sleepTime800;
	}
	

	
	   
	/**
	 * 	Update SleepTime800 with the passed value
	 *  Corresponding COBOL Variable is 800-SLEEP-TIME
	 *	@param number
	 */
	public void setSleepTime800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sleepTime800 = checkSleepTime800MaxLimit(number); 
		serializeSleepTime800(sleepTime800);
	}
	

	/**
	 * 	Update SleepTime800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSleepTime800(char[] value) throws CFException {
		 sleepTime800 = serializeSleepTime800(value);
	}
	/**
	 * 	Update SleepTime800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSleepTime800String(char[] value) throws CFException {
		 setSleepTime800(value);
	}

	
	
	

		public static int getSleepTimeGroup800FieldLength() {
			return SLEEP_TIME_GROUP_800_LENGTH;
		}

}
  
