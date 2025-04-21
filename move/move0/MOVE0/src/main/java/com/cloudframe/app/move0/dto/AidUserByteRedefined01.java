package com.cloudframe.app.move0.dto;

/**
*  The class AidUserByteRedefined01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AidUserByteRedefined01 extends AidUserByteRedefined01Serialized { 
   

								private int aidApplicationNum;
	
	/**
	* Constructor for AidUserByteRedefined01
	**/
    public AidUserByteRedefined01() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AidUserByteRedefined01. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AidUserByteRedefined01(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aidApplicationNum
	 *	@return aidApplicationNum
	 */
	public int getAidApplicationNum() throws CFException {
       if (isAidApplicationNumModified()) { 
           aidApplicationNum = refreshAidApplicationNum();
        }
   		return aidApplicationNum;
	}
	

	
	   
	/**
	 * 	Update AidApplicationNum with the passed value
	 *  Corresponding COBOL Variable is AID-APPLICATION-NUM
	 *	@param number
	 */
	public void setAidApplicationNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    aidApplicationNum = checkAidApplicationNumMaxLimit(number); 
		serializeAidApplicationNum(aidApplicationNum);
	}
	

	public void setAidApplicationNum(long number) {
	    number = checkAidApplicationNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setAidApplicationNum((int)number);
	}
	
	/**
	 * 	Update AidApplicationNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setAidApplicationNum(char[] value) throws CFException {
		 aidApplicationNum = serializeAidApplicationNum(value);
	}
	/**
	 * 	Update AidApplicationNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAidApplicationNumString(char[] value) throws CFException {
		 setAidApplicationNum(value);
	}

	
	
	

		public static int getAidUserByteRedefined01FieldLength() {
			return AID_USER_BYTE_REDEFINED_01_LENGTH;
		}

}
  
