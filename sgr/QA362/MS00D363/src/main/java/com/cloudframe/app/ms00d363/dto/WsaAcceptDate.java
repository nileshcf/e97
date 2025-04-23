package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaAcceptDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WsaAcceptDate extends WsaAcceptDateSerialized {
   

								private int wsaAcceptDateYy;

								private int wsaAcceptDateMm;

								private int wsaAcceptDateDd;
	
	/**
	* Constructor for WsaAcceptDate
	**/
    public WsaAcceptDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaAcceptDateYy(0);
								setWsaAcceptDateMm(0);
								setWsaAcceptDateDd(0);
    }


 

	/**
	 *	Returns the value of wsaAcceptDateYy
	 *	@return wsaAcceptDateYy
	 */
	public int getWsaAcceptDateYy() throws CFException {
       if (isWsaAcceptDateYyModified()) { 
           wsaAcceptDateYy = refreshWsaAcceptDateYy();
        }
   		return wsaAcceptDateYy;
	}
	

	
	   
	/**
	 * 	Update WsaAcceptDateYy with the passed value
	 *  Corresponding COBOL Variable is WSA-ACCEPT-DATE-YY
	 *	@param number
	 */
	public void setWsaAcceptDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsaAcceptDateYy = checkWsaAcceptDateYyMaxLimit(number); 
		serializeWsaAcceptDateYy(wsaAcceptDateYy);
	}
	

	public void setWsaAcceptDateYy(long number) {
	    number = checkWsaAcceptDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaAcceptDateYy((int)number);
	}
	
	/**
	 * 	Update WsaAcceptDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsaAcceptDateYy(char[] value) throws CFException {
		 wsaAcceptDateYy = serializeWsaAcceptDateYy(value);
	}
	/**
	 * 	Update WsaAcceptDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsaAcceptDateYyString(char[] value) throws CFException {
		 setWsaAcceptDateYy(value);
	}
	/**
	 *	Returns the value of wsaAcceptDateMm
	 *	@return wsaAcceptDateMm
	 */
	public int getWsaAcceptDateMm() throws CFException {
       if (isWsaAcceptDateMmModified()) { 
           wsaAcceptDateMm = refreshWsaAcceptDateMm();
        }
   		return wsaAcceptDateMm;
	}
	

	
	   
	/**
	 * 	Update WsaAcceptDateMm with the passed value
	 *  Corresponding COBOL Variable is WSA-ACCEPT-DATE-MM
	 *	@param number
	 */
	public void setWsaAcceptDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsaAcceptDateMm = checkWsaAcceptDateMmMaxLimit(number); 
		serializeWsaAcceptDateMm(wsaAcceptDateMm);
	}
	

	public void setWsaAcceptDateMm(long number) {
	    number = checkWsaAcceptDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaAcceptDateMm((int)number);
	}
	
	/**
	 * 	Update WsaAcceptDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsaAcceptDateMm(char[] value) throws CFException {
		 wsaAcceptDateMm = serializeWsaAcceptDateMm(value);
	}
	/**
	 * 	Update WsaAcceptDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsaAcceptDateMmString(char[] value) throws CFException {
		 setWsaAcceptDateMm(value);
	}
	/**
	 *	Returns the value of wsaAcceptDateDd
	 *	@return wsaAcceptDateDd
	 */
	public int getWsaAcceptDateDd() throws CFException {
       if (isWsaAcceptDateDdModified()) { 
           wsaAcceptDateDd = refreshWsaAcceptDateDd();
        }
   		return wsaAcceptDateDd;
	}
	

	
	   
	/**
	 * 	Update WsaAcceptDateDd with the passed value
	 *  Corresponding COBOL Variable is WSA-ACCEPT-DATE-DD
	 *	@param number
	 */
	public void setWsaAcceptDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsaAcceptDateDd = checkWsaAcceptDateDdMaxLimit(number); 
		serializeWsaAcceptDateDd(wsaAcceptDateDd);
	}
	

	public void setWsaAcceptDateDd(long number) {
	    number = checkWsaAcceptDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaAcceptDateDd((int)number);
	}
	
	/**
	 * 	Update WsaAcceptDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsaAcceptDateDd(char[] value) throws CFException {
		 wsaAcceptDateDd = serializeWsaAcceptDateDd(value);
	}
	/**
	 * 	Update WsaAcceptDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsaAcceptDateDdString(char[] value) throws CFException {
		 setWsaAcceptDateDd(value);
	}

	
	
	

		public static int getWsaAcceptDateFieldLength() {
			return WSA_ACCEPT_DATE_LENGTH;
		}

}
  
