package com.cloudframe.app.calldrvr.dto;

/**
*  The class Pgm4Parm3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Pgm4Parm3Group extends Pgm4Parm3GroupSerialized { 
   

								private BigDecimal pgm4Parm3 = BigDecimal.ZERO;
	
	/**
	* Constructor for Pgm4Parm3Group
	**/
    public Pgm4Parm3Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pgm4Parm3Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm3Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public BigDecimal getPgm4Parm3() throws CFException {
        if (isPgm4Parm3Modified()) { 
           pgm4Parm3 = refreshPgm4Parm3();
        }
   		return pgm4Parm3;
	}

    public char[] getPgm4Parm3String() {
          return  pgm4Parm3String();
    }
	
	/**
	 * 	Update Pgm4Parm3 with the passed number
	 *  Corresponding COBOL Variable is WS-PGM4-PARM3
	 *	@param number
	 */
	public void setPgm4Parm3(BigDecimal number) {	
     pgm4Parm3 = checkPgm4Parm3MaxLimit(number);
	    serializePgm4Parm3(pgm4Parm3);
   }

	
	
	

		public static int getPgm4Parm3GroupFieldLength() {
			return PGM_4_PARM_3_GROUP_LENGTH;
		}

}
  
