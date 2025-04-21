package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaAcceptTime is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WsaAcceptTime extends WsaAcceptTimeSerialized {
   

								private long wsaTimeOfDay;

	
	/**
	* Constructor for WsaAcceptTime
	**/
    public WsaAcceptTime() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaTimeOfDay(0L);
       replaceValue(pad(2,"0","0",LEFT_PAD),getStartOffset() + 6,2);
    }


 

	/**
	 *	Returns the value of wsaTimeOfDay
	 *	@return wsaTimeOfDay
	 */
	public long getWsaTimeOfDay() throws CFException {
       if (isWsaTimeOfDayModified()) { 
           wsaTimeOfDay = refreshWsaTimeOfDay();
        }
   		return wsaTimeOfDay;
	}
	

	
	   
	/**
	 * 	Update WsaTimeOfDay with the passed value
	 *  Corresponding COBOL Variable is WSA-TIME-OF-DAY
	 *	@param number
	 */
	public void setWsaTimeOfDay(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsaTimeOfDay = checkWsaTimeOfDayMaxLimit(number); 
		serializeWsaTimeOfDay(wsaTimeOfDay);
	}
	

	/**
	 * 	Update WsaTimeOfDay with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsaTimeOfDay(char[] value) throws CFException {
		 wsaTimeOfDay = serializeWsaTimeOfDay(value);
	}
	/**
	 * 	Update WsaTimeOfDay with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsaTimeOfDayString(char[] value) throws CFException {
		 setWsaTimeOfDay(value);
	}

	
	
	

		public static int getWsaAcceptTimeFieldLength() {
			return WSA_ACCEPT_TIME_LENGTH;
		}

}
  
