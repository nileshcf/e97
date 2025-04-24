package com.cloudframe.app.vsammon4.dto;

/**
*  The class ReadallData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ReadallData extends ReadallDataSerialized { 
   

								private long rKey;
	
	/**
	* Constructor for ReadallData
	**/
    public ReadallData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ReadallData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ReadallData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rKey
	 *	@return rKey
	 */
	public long getRKey() throws CFException {
       if (isRKeyModified()) { 
           rKey = refreshRKey();
        }
   		return rKey;
	}
	

	
	   
	/**
	 * 	Update RKey with the passed value
	 *  Corresponding COBOL Variable is WS-R-KEY
	 *	@param number
	 */
	public void setRKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    rKey = checkRKeyMaxLimit(number); 
		serializeRKey(rKey);
	}
	

	/**
	 * 	Update RKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setRKey(char[] value) throws CFException {
		 rKey = serializeRKey(value);
	}
	/**
	 * 	Update RKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRKeyString(char[] value) throws CFException {
		 setRKey(value);
	}

	
	
	

		public static int getReadallDataFieldLength() {
			return READALL_DATA_LENGTH;
		}

}
  
