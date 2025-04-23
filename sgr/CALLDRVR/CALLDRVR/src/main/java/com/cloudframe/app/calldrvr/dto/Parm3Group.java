package com.cloudframe.app.calldrvr.dto;

/**
*  The class Parm3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:35. using version 5.0.0.254
**/


import com.cloudframe.app.calldrvr.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class Parm3Group extends Parm3GroupSerialized { 
   

								private BigDecimal parm3 = BigDecimal.ZERO;
	
	/**
	* Constructor for Parm3Group
	**/
    public Parm3Group() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parm3Group. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm3Group(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public BigDecimal getParm3() throws CFException {
        if (isParm3Modified()) { 
           parm3 = refreshParm3();
        }
   		return parm3;
	}

    public char[] getParm3String() {
          return  parm3String();
    }
	
	/**
	 * 	Update Parm3 with the passed number
	 *  Corresponding COBOL Variable is WS-PARM3
	 *	@param number
	 */
	public void setParm3(BigDecimal number) {	
     parm3 = checkParm3MaxLimit(number);
	    serializeParm3(parm3);
   }

	
	
	

		public static int getParm3GroupFieldLength() {
			return PARM_3_GROUP_LENGTH;
		}

}
  
