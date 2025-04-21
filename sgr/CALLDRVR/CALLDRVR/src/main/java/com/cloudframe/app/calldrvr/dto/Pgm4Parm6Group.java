package com.cloudframe.app.calldrvr.dto;

/**
*  The class Pgm4Parm6Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:15. using version 5.0.0.256
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Pgm4Parm6Group extends Pgm4Parm6GroupSerialized { 
   

								private BigDecimal pgm4Parm6 = BigDecimal.ZERO;
	
	/**
	* Constructor for Pgm4Parm6Group
	**/
    public Pgm4Parm6Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pgm4Parm6Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm6Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public BigDecimal getPgm4Parm6() throws CFException {
        if (isPgm4Parm6Modified()) { 
           pgm4Parm6 = refreshPgm4Parm6();
        }
   		return pgm4Parm6;
	}

    public char[] getPgm4Parm6String() {
          return  pgm4Parm6String();
    }
	
	/**
	 * 	Update Pgm4Parm6 with the passed number
	 *  Corresponding COBOL Variable is WS-PGM4-PARM6
	 *	@param number
	 */
	public void setPgm4Parm6(BigDecimal number) {	
     pgm4Parm6 = checkPgm4Parm6MaxLimit(number);
	    serializePgm4Parm6(pgm4Parm6);
   }

	
	
	

		public static int getPgm4Parm6GroupFieldLength() {
			return PGM_4_PARM_6_GROUP_LENGTH;
		}

}
  
