package com.cloudframe.app.callprm2.dto;

/**
*  The class LsParm3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/


import com.cloudframe.app.callprm2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class LsParm3Group extends LsParm3GroupSerialized {
   

								private BigDecimal lsParm3 = BigDecimal.ZERO;
	
	/**
	* Constructor for LsParm3Group
	**/
    public LsParm3Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public BigDecimal getLsParm3() throws CFException {
        if (isLsParm3Modified()) { 
           lsParm3 = refreshLsParm3();
        }
   		return lsParm3;
	}

    public char[] getLsParm3String() {
          return  lsParm3String();
    }
	
	/**
	 * 	Update LsParm3 with the passed number
	 *  Corresponding COBOL Variable is LS-PARM3
	 *	@param number
	 */
	public void setLsParm3(BigDecimal number) {	
     lsParm3 = checkLsParm3MaxLimit(number);
	    serializeLsParm3(lsParm3);
   }

	
	
	

		public static int getLsParm3GroupFieldLength() {
			return LS_PARM_3_GROUP_LENGTH;
		}

}
  
