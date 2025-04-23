package com.cloudframe.app.calldrvr.dto;

/**
*  The class Parm6Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Parm6Group extends Parm6GroupSerialized { 
   

								private BigDecimal parm6 = BigDecimal.ZERO;
	
	/**
	* Constructor for Parm6Group
	**/
    public Parm6Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parm6Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm6Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public BigDecimal getParm6() throws CFException {
        if (isParm6Modified()) { 
           parm6 = refreshParm6();
        }
   		return parm6;
	}

    public char[] getParm6String() {
          return  parm6String();
    }
	
	/**
	 * 	Update Parm6 with the passed number
	 *  Corresponding COBOL Variable is WS-PARM6
	 *	@param number
	 */
	public void setParm6(BigDecimal number) {	
     parm6 = checkParm6MaxLimit(number);
	    serializeParm6(parm6);
   }

	
	
	

		public static int getParm6GroupFieldLength() {
			return PARM_6_GROUP_LENGTH;
		}

}
  
