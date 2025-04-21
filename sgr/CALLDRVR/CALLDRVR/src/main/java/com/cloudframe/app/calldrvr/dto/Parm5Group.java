package com.cloudframe.app.calldrvr.dto;

/**
*  The class Parm5Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:15. using version 5.0.0.256
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm5Group extends Parm5GroupSerialized { 
   

								private short parm5;
	
	/**
	* Constructor for Parm5Group
	**/
    public Parm5Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parm5Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm5Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of parm5
	 *	@return parm5
	 */
	public short getParm5() throws CFException {
        if (isParm5Modified()) { 
           parm5 = refreshParm5();
        }
   		return parm5;
	}
	
	/**
	 * 	Update Parm5 with the passed value
	 *  Corresponding COBOL Variable is WS-PARM5
	 *	@param number
	 */
	public void setParm5(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parm5 = checkParm5MaxLimit(number); 
		serializeParm5(parm5);
	}

	public void setParm5(int number) {
	    number = checkParm5MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParm5((short)number);
	}
	public void setParm5(long number) {
	    number = checkParm5MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParm5((short)number);
	}
	


	
	
	

		public static int getParm5GroupFieldLength() {
			return PARM_5_GROUP_LENGTH;
		}

}
  
