package com.cloudframe.app.move0.dto;

/**
*  The class PackedTo2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class PackedTo2 extends PackedTo2Serialized {
   

								private BigDecimal t11 = BigDecimal.ZERO;
	
	/**
	* Constructor for PackedTo2
	**/
    public PackedTo2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public BigDecimal getT11() throws CFException {
        if (isT11Modified()) { 
           t11 = refreshT11();
        }
   		return t11;
	}

    public char[] getT11String() {
          return  t11String();
    }
	
	/**
	 * 	Update T11 with the passed number
	 *  Corresponding COBOL Variable is WS-T11
	 *	@param number
	 */
	public void setT11(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     t11 = checkT11MaxLimit(number);
	    serializeT11(t11);
   }

	
	
	

		public static int getPackedTo2FieldLength() {
			return PACKED_TO_2_LENGTH;
		}

}
  
