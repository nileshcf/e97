package com.cloudframe.app.ar640010.dto;

/**
*  The class Itaraept is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Itaraept extends ItaraeptSerialized {
   

								private short taraeptUserSrvrIdN;

								private short taraeptBkupEndptIdN;

								private short taraeptCsMipIdN;

								private short taraeptRmMipIdN;
	
	/**
	* Constructor for Itaraept
	**/
    public Itaraept() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of taraeptUserSrvrIdN
	 *	@return taraeptUserSrvrIdN
	 */
	public short getTaraeptUserSrvrIdN() throws CFException {
        if (isTaraeptUserSrvrIdNModified()) { 
           taraeptUserSrvrIdN = refreshTaraeptUserSrvrIdN();
        }
   		return taraeptUserSrvrIdN;
	}
	
	/**
	 * 	Update TaraeptUserSrvrIdN with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-USER-SRVR-ID-N
	 *	@param number
	 */
	public void setTaraeptUserSrvrIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptUserSrvrIdN = checkTaraeptUserSrvrIdNMaxLimit(number); 
		serializeTaraeptUserSrvrIdN(taraeptUserSrvrIdN);
	}

	public void setTaraeptUserSrvrIdN(int number) {
	    number = checkTaraeptUserSrvrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptUserSrvrIdN((short)number);
	}
	public void setTaraeptUserSrvrIdN(long number) {
	    number = checkTaraeptUserSrvrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptUserSrvrIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraeptBkupEndptIdN
	 *	@return taraeptBkupEndptIdN
	 */
	public short getTaraeptBkupEndptIdN() throws CFException {
        if (isTaraeptBkupEndptIdNModified()) { 
           taraeptBkupEndptIdN = refreshTaraeptBkupEndptIdN();
        }
   		return taraeptBkupEndptIdN;
	}
	
	/**
	 * 	Update TaraeptBkupEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-BKUP-ENDPT-ID-N
	 *	@param number
	 */
	public void setTaraeptBkupEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptBkupEndptIdN = checkTaraeptBkupEndptIdNMaxLimit(number); 
		serializeTaraeptBkupEndptIdN(taraeptBkupEndptIdN);
	}

	public void setTaraeptBkupEndptIdN(int number) {
	    number = checkTaraeptBkupEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptBkupEndptIdN((short)number);
	}
	public void setTaraeptBkupEndptIdN(long number) {
	    number = checkTaraeptBkupEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptBkupEndptIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraeptCsMipIdN
	 *	@return taraeptCsMipIdN
	 */
	public short getTaraeptCsMipIdN() throws CFException {
        if (isTaraeptCsMipIdNModified()) { 
           taraeptCsMipIdN = refreshTaraeptCsMipIdN();
        }
   		return taraeptCsMipIdN;
	}
	
	/**
	 * 	Update TaraeptCsMipIdN with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-CS-MIP-ID-N
	 *	@param number
	 */
	public void setTaraeptCsMipIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptCsMipIdN = checkTaraeptCsMipIdNMaxLimit(number); 
		serializeTaraeptCsMipIdN(taraeptCsMipIdN);
	}

	public void setTaraeptCsMipIdN(int number) {
	    number = checkTaraeptCsMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptCsMipIdN((short)number);
	}
	public void setTaraeptCsMipIdN(long number) {
	    number = checkTaraeptCsMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptCsMipIdN((short)number);
	}
	

	/**
	 *	Returns the value of taraeptRmMipIdN
	 *	@return taraeptRmMipIdN
	 */
	public short getTaraeptRmMipIdN() throws CFException {
        if (isTaraeptRmMipIdNModified()) { 
           taraeptRmMipIdN = refreshTaraeptRmMipIdN();
        }
   		return taraeptRmMipIdN;
	}
	
	/**
	 * 	Update TaraeptRmMipIdN with the passed value
	 *  Corresponding COBOL Variable is TARAEPT-RM-MIP-ID-N
	 *	@param number
	 */
	public void setTaraeptRmMipIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraeptRmMipIdN = checkTaraeptRmMipIdNMaxLimit(number); 
		serializeTaraeptRmMipIdN(taraeptRmMipIdN);
	}

	public void setTaraeptRmMipIdN(int number) {
	    number = checkTaraeptRmMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptRmMipIdN((short)number);
	}
	public void setTaraeptRmMipIdN(long number) {
	    number = checkTaraeptRmMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraeptRmMipIdN((short)number);
	}
	


	
	
	

		public static int getItaraeptFieldLength() {
			return ITARAEPT_LENGTH;
		}

}
  
