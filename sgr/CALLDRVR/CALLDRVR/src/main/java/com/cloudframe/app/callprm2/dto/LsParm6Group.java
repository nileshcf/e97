package com.cloudframe.app.callprm2.dto;

/**
*  The class LsParm6Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:31. using version 5.0.0.257
**/


import com.cloudframe.app.callprm2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class LsParm6Group extends LsParm6GroupSerialized {
   

								private BigDecimal lsParm6 = BigDecimal.ZERO;
	
	/**
	* Constructor for LsParm6Group
	**/
    public LsParm6Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public BigDecimal getLsParm6() throws CFException {
        if (isLsParm6Modified()) { 
           lsParm6 = refreshLsParm6();
        }
   		return lsParm6;
	}

    public char[] getLsParm6String() {
          return  lsParm6String();
    }
	
	/**
	 * 	Update LsParm6 with the passed number
	 *  Corresponding COBOL Variable is LS-PARM6
	 *	@param number
	 */
	public void setLsParm6(BigDecimal number) {	
     lsParm6 = checkLsParm6MaxLimit(number);
	    serializeLsParm6(lsParm6);
   }

	
	
	

		public static int getLsParm6GroupFieldLength() {
			return LS_PARM_6_GROUP_LENGTH;
		}

}
  
