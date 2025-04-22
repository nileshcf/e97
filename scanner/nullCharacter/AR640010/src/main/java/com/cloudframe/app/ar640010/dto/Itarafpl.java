package com.cloudframe.app.ar640010.dto;

/**
*  The class Itarafpl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Itarafpl extends ItarafplSerialized {
   

								private short tarafplAppEndptIdN;
	
	/**
	* Constructor for Itarafpl
	**/
    public Itarafpl() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tarafplAppEndptIdN
	 *	@return tarafplAppEndptIdN
	 */
	public short getTarafplAppEndptIdN() throws CFException {
        if (isTarafplAppEndptIdNModified()) { 
           tarafplAppEndptIdN = refreshTarafplAppEndptIdN();
        }
   		return tarafplAppEndptIdN;
	}
	
	/**
	 * 	Update TarafplAppEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFPL-APP-ENDPT-ID-N
	 *	@param number
	 */
	public void setTarafplAppEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafplAppEndptIdN = checkTarafplAppEndptIdNMaxLimit(number); 
		serializeTarafplAppEndptIdN(tarafplAppEndptIdN);
	}

	public void setTarafplAppEndptIdN(int number) {
	    number = checkTarafplAppEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafplAppEndptIdN((short)number);
	}
	public void setTarafplAppEndptIdN(long number) {
	    number = checkTarafplAppEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafplAppEndptIdN((short)number);
	}
	


	
	
	

		public static int getItarafplFieldLength() {
			return ITARAFPL_LENGTH;
		}

}
  
