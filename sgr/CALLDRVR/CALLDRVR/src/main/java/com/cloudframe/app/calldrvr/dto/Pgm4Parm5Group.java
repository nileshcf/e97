package com.cloudframe.app.calldrvr.dto;

/**
*  The class Pgm4Parm5Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pgm4Parm5Group extends Pgm4Parm5GroupSerialized { 
   

								private short pgm4Parm5;
	
	/**
	* Constructor for Pgm4Parm5Group
	**/
    public Pgm4Parm5Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pgm4Parm5Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm5Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of pgm4Parm5
	 *	@return pgm4Parm5
	 */
	public short getPgm4Parm5() throws CFException {
        if (isPgm4Parm5Modified()) { 
           pgm4Parm5 = refreshPgm4Parm5();
        }
   		return pgm4Parm5;
	}
	
	/**
	 * 	Update Pgm4Parm5 with the passed value
	 *  Corresponding COBOL Variable is WS-PGM4-PARM5
	 *	@param number
	 */
	public void setPgm4Parm5(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pgm4Parm5 = checkPgm4Parm5MaxLimit(number); 
		serializePgm4Parm5(pgm4Parm5);
	}

	public void setPgm4Parm5(int number) {
	    number = checkPgm4Parm5MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPgm4Parm5((short)number);
	}
	public void setPgm4Parm5(long number) {
	    number = checkPgm4Parm5MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPgm4Parm5((short)number);
	}
	


	
	
	

		public static int getPgm4Parm5GroupFieldLength() {
			return PGM_4_PARM_5_GROUP_LENGTH;
		}

}
  
