package com.cloudframe.app.move0.dto;

/**
*  The class PackedTo1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class PackedTo1 extends PackedTo1Serialized {
   

								private BigDecimal t10 = BigDecimal.ZERO;
	
	/**
	* Constructor for PackedTo1
	**/
    public PackedTo1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	public BigDecimal getT10() throws CFException {
        if (isT10Modified()) { 
           t10 = refreshT10();
        }
   		return t10;
	}

    public char[] getT10String() {
          return  t10String();
    }
	
	/**
	 * 	Update T10 with the passed number
	 *  Corresponding COBOL Variable is WS-T10
	 *	@param number
	 */
	public void setT10(BigDecimal number) {	
     t10 = checkT10MaxLimit(number);
	    serializeT10(t10);
   }

	
	
	

		public static int getPackedTo1FieldLength() {
			return PACKED_TO_1_LENGTH;
		}

}
  
