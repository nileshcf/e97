package com.cloudframe.app.calldrvr.dto;

/**
*  The class Pgm4Parm2Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:31. using version 5.0.0.257
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pgm4Parm2Group extends Pgm4Parm2GroupSerialized { 
   

								private short pgm4Parm2;
	
	/**
	* Constructor for Pgm4Parm2Group
	**/
    public Pgm4Parm2Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pgm4Parm2Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm2Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of pgm4Parm2
	 *	@return pgm4Parm2
	 */
	public short getPgm4Parm2() throws CFException {
        if (isPgm4Parm2Modified()) { 
           pgm4Parm2 = refreshPgm4Parm2();
        }
   		return pgm4Parm2;
	}
	
	/**
	 * 	Update Pgm4Parm2 with the passed value
	 *  Corresponding COBOL Variable is WS-PGM4-PARM2
	 *	@param number
	 */
	public void setPgm4Parm2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pgm4Parm2 = checkPgm4Parm2MaxLimit(number); 
		serializePgm4Parm2(pgm4Parm2);
	}

	public void setPgm4Parm2(int number) {
	    number = checkPgm4Parm2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPgm4Parm2((short)number);
	}
	public void setPgm4Parm2(long number) {
	    number = checkPgm4Parm2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPgm4Parm2((short)number);
	}
	


	
	
	

		public static int getPgm4Parm2GroupFieldLength() {
			return PGM_4_PARM_2_GROUP_LENGTH;
		}

}
  
