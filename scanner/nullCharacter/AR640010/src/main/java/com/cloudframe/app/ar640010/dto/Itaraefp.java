package com.cloudframe.app.ar640010.dto;

/**
*  The class Itaraefp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Itaraefp extends ItaraefpSerialized {
   

								private short taraefpStatusCdN;
	
	/**
	* Constructor for Itaraefp
	**/
    public Itaraefp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of taraefpStatusCdN
	 *	@return taraefpStatusCdN
	 */
	public short getTaraefpStatusCdN() throws CFException {
        if (isTaraefpStatusCdNModified()) { 
           taraefpStatusCdN = refreshTaraefpStatusCdN();
        }
   		return taraefpStatusCdN;
	}
	
	/**
	 * 	Update TaraefpStatusCdN with the passed value
	 *  Corresponding COBOL Variable is TARAEFP-STATUS-CD-N
	 *	@param number
	 */
	public void setTaraefpStatusCdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraefpStatusCdN = checkTaraefpStatusCdNMaxLimit(number); 
		serializeTaraefpStatusCdN(taraefpStatusCdN);
	}

	public void setTaraefpStatusCdN(int number) {
	    number = checkTaraefpStatusCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpStatusCdN((short)number);
	}
	public void setTaraefpStatusCdN(long number) {
	    number = checkTaraefpStatusCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpStatusCdN((short)number);
	}
	


	
	
	

		public static int getItaraefpFieldLength() {
			return ITARAEFP_LENGTH;
		}

}
  
