package com.cloudframe.app.calldrvr.dto;

/**
*  The class Parm2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:35. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm2Group extends Parm2GroupSerialized { 
   

								private short parm2;
	
	/**
	* Constructor for Parm2Group
	**/
    public Parm2Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parm2Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm2Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of parm2
	 *	@return parm2
	 */
	public short getParm2() throws CFException {
        if (isParm2Modified()) { 
           parm2 = refreshParm2();
        }
   		return parm2;
	}
	
	/**
	 * 	Update Parm2 with the passed value
	 *  Corresponding COBOL Variable is WS-PARM2
	 *	@param number
	 */
	public void setParm2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    parm2 = checkParm2MaxLimit(number); 
		serializeParm2(parm2);
	}

	public void setParm2(int number) {
	    number = checkParm2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParm2((short)number);
	}
	public void setParm2(long number) {
	    number = checkParm2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setParm2((short)number);
	}
	


	
	
	

		public static int getParm2GroupFieldLength() {
			return PARM_2_GROUP_LENGTH;
		}

}
  
