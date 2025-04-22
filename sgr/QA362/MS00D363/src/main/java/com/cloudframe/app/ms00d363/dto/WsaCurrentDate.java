package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaCurrentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class WsaCurrentDate extends WsaCurrentDateSerialized {
   

								private int wsaCurrentDateMm;


								private int wsaCurrentDateDd;


								private int wsaCurrentDateYy;
	
	/**
	* Constructor for WsaCurrentDate
	**/
    public WsaCurrentDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaCurrentDateMm(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setWsaCurrentDateDd(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setWsaCurrentDateYy(0);
    }


 

	/**
	 *	Returns the value of wsaCurrentDateMm
	 *	@return wsaCurrentDateMm
	 */
	public int getWsaCurrentDateMm() throws CFException {
       if (isWsaCurrentDateMmModified()) { 
           wsaCurrentDateMm = refreshWsaCurrentDateMm();
        }
   		return wsaCurrentDateMm;
	}
	

	
	   
	/**
	 * 	Update WsaCurrentDateMm with the passed value
	 *  Corresponding COBOL Variable is WSA-CURRENT-DATE-MM
	 *	@param number
	 */
	public void setWsaCurrentDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsaCurrentDateMm = checkWsaCurrentDateMmMaxLimit(number); 
		serializeWsaCurrentDateMm(wsaCurrentDateMm);
	}
	

	public void setWsaCurrentDateMm(long number) {
	    number = checkWsaCurrentDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaCurrentDateMm((int)number);
	}
	
	/**
	 * 	Update WsaCurrentDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsaCurrentDateMm(char[] value) throws CFException {
		 wsaCurrentDateMm = serializeWsaCurrentDateMm(value);
	}
	/**
	 * 	Update WsaCurrentDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsaCurrentDateMmString(char[] value) throws CFException {
		 setWsaCurrentDateMm(value);
	}
	/**
	 *	Returns the value of wsaCurrentDateDd
	 *	@return wsaCurrentDateDd
	 */
	public int getWsaCurrentDateDd() throws CFException {
       if (isWsaCurrentDateDdModified()) { 
           wsaCurrentDateDd = refreshWsaCurrentDateDd();
        }
   		return wsaCurrentDateDd;
	}
	

	
	   
	/**
	 * 	Update WsaCurrentDateDd with the passed value
	 *  Corresponding COBOL Variable is WSA-CURRENT-DATE-DD
	 *	@param number
	 */
	public void setWsaCurrentDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsaCurrentDateDd = checkWsaCurrentDateDdMaxLimit(number); 
		serializeWsaCurrentDateDd(wsaCurrentDateDd);
	}
	

	public void setWsaCurrentDateDd(long number) {
	    number = checkWsaCurrentDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaCurrentDateDd((int)number);
	}
	
	/**
	 * 	Update WsaCurrentDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsaCurrentDateDd(char[] value) throws CFException {
		 wsaCurrentDateDd = serializeWsaCurrentDateDd(value);
	}
	/**
	 * 	Update WsaCurrentDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsaCurrentDateDdString(char[] value) throws CFException {
		 setWsaCurrentDateDd(value);
	}
	/**
	 *	Returns the value of wsaCurrentDateYy
	 *	@return wsaCurrentDateYy
	 */
	public int getWsaCurrentDateYy() throws CFException {
       if (isWsaCurrentDateYyModified()) { 
           wsaCurrentDateYy = refreshWsaCurrentDateYy();
        }
   		return wsaCurrentDateYy;
	}
	

	
	   
	/**
	 * 	Update WsaCurrentDateYy with the passed value
	 *  Corresponding COBOL Variable is WSA-CURRENT-DATE-YY
	 *	@param number
	 */
	public void setWsaCurrentDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wsaCurrentDateYy = checkWsaCurrentDateYyMaxLimit(number); 
		serializeWsaCurrentDateYy(wsaCurrentDateYy);
	}
	

	public void setWsaCurrentDateYy(long number) {
	    number = checkWsaCurrentDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWsaCurrentDateYy((int)number);
	}
	
	/**
	 * 	Update WsaCurrentDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWsaCurrentDateYy(char[] value) throws CFException {
		 wsaCurrentDateYy = serializeWsaCurrentDateYy(value);
	}
	/**
	 * 	Update WsaCurrentDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWsaCurrentDateYyString(char[] value) throws CFException {
		 setWsaCurrentDateYy(value);
	}

	
	
	

		public static int getWsaCurrentDateFieldLength() {
			return WSA_CURRENT_DATE_LENGTH;
		}

}
  
