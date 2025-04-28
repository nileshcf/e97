package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup31 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup31 extends Ip65504PdsNamesLargeGroup31Serialized { 
   

								private short ip65504P931ReservdS;

								private short ip65504P931ReservdL;


								private short ip65504P932ReservdS;

								private short ip65504P932ReservdL;


								private short ip65504P933ReservdS;

								private short ip65504P933ReservdL;


								private short ip65504P934ReservdS;

								private short ip65504P934ReservdL;


								private short ip65504P935ReservdS;

								private short ip65504P935ReservdL;


								private short ip65504P936ReservdS;

								private short ip65504P936ReservdL;


								private short ip65504P937ReservdS;

								private short ip65504P937ReservdL;


								private short ip65504P938ReservdS;

								private short ip65504P938ReservdL;


								private short ip65504P939ReservdS;

								private short ip65504P939ReservdL;


								private short ip65504P940ReservdS;

								private short ip65504P940ReservdL;


								private short ip65504P941ReservdS;

								private short ip65504P941ReservdL;


								private short ip65504P942ReservdS;

								private short ip65504P942ReservdL;


								private short ip65504P943ReservdS;

								private short ip65504P943ReservdL;


								private short ip65504P944ReservdS;

								private short ip65504P944ReservdL;


								private short ip65504P945ReservdS;

								private short ip65504P945ReservdL;


								private short ip65504P946ReservdS;

								private short ip65504P946ReservdL;


								private short ip65504P947ReservdS;

								private short ip65504P947ReservdL;


								private short ip65504P948ReservdS;

								private short ip65504P948ReservdL;


								private short ip65504P949ReservdS;

								private short ip65504P949ReservdL;


								private short ip65504P950ReservdS;

								private short ip65504P950ReservdL;


								private short ip65504P951ReservdS;

								private short ip65504P951ReservdL;


								private short ip65504P952ReservdS;

								private short ip65504P952ReservdL;


								private short ip65504P953ReservdS;

								private short ip65504P953ReservdL;


								private short ip65504P954ReservdS;

								private short ip65504P954ReservdL;


								private short ip65504P955ReservdS;

								private short ip65504P955ReservdL;


								private short ip65504P956ReservdS;

								private short ip65504P956ReservdL;


								private short ip65504P957ReservdS;

								private short ip65504P957ReservdL;


								private short ip65504P958ReservdS;

								private short ip65504P958ReservdL;


								private short ip65504P959ReservdS;

								private short ip65504P959ReservdL;


								private short ip65504P960ReservdS;

								private short ip65504P960ReservdL;


								private short ip65504P961ReservdS;

								private short ip65504P961ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup31
	**/
    public Ip65504PdsNamesLargeGroup31() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup31. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup31(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P931ReservdS
	 *	@return ip65504P931ReservdS
	 */
	public short getIp65504P931ReservdS() throws CFException {
        if (isIp65504P931ReservdSModified()) { 
           ip65504P931ReservdS = refreshIp65504P931ReservdS();
        }
   		return ip65504P931ReservdS;
	}
	
	/**
	 * 	Update Ip65504P931ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P931-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P931ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P931ReservdS = checkIp65504P931ReservdSMaxLimit(number); 
		serializeIp65504P931ReservdS(ip65504P931ReservdS);
	}

	public void setIp65504P931ReservdS(int number) {
	    number = checkIp65504P931ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P931ReservdS((short)number);
	}
	public void setIp65504P931ReservdS(long number) {
	    number = checkIp65504P931ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P931ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P931ReservdL
	 *	@return ip65504P931ReservdL
	 */
	public short getIp65504P931ReservdL() throws CFException {
        if (isIp65504P931ReservdLModified()) { 
           ip65504P931ReservdL = refreshIp65504P931ReservdL();
        }
   		return ip65504P931ReservdL;
	}
	
	/**
	 * 	Update Ip65504P931ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P931-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P931ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P931ReservdL = checkIp65504P931ReservdLMaxLimit(number); 
		serializeIp65504P931ReservdL(ip65504P931ReservdL);
	}

	public void setIp65504P931ReservdL(int number) {
	    number = checkIp65504P931ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P931ReservdL((short)number);
	}
	public void setIp65504P931ReservdL(long number) {
	    number = checkIp65504P931ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P931ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P932ReservdS
	 *	@return ip65504P932ReservdS
	 */
	public short getIp65504P932ReservdS() throws CFException {
        if (isIp65504P932ReservdSModified()) { 
           ip65504P932ReservdS = refreshIp65504P932ReservdS();
        }
   		return ip65504P932ReservdS;
	}
	
	/**
	 * 	Update Ip65504P932ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P932-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P932ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P932ReservdS = checkIp65504P932ReservdSMaxLimit(number); 
		serializeIp65504P932ReservdS(ip65504P932ReservdS);
	}

	public void setIp65504P932ReservdS(int number) {
	    number = checkIp65504P932ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P932ReservdS((short)number);
	}
	public void setIp65504P932ReservdS(long number) {
	    number = checkIp65504P932ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P932ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P932ReservdL
	 *	@return ip65504P932ReservdL
	 */
	public short getIp65504P932ReservdL() throws CFException {
        if (isIp65504P932ReservdLModified()) { 
           ip65504P932ReservdL = refreshIp65504P932ReservdL();
        }
   		return ip65504P932ReservdL;
	}
	
	/**
	 * 	Update Ip65504P932ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P932-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P932ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P932ReservdL = checkIp65504P932ReservdLMaxLimit(number); 
		serializeIp65504P932ReservdL(ip65504P932ReservdL);
	}

	public void setIp65504P932ReservdL(int number) {
	    number = checkIp65504P932ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P932ReservdL((short)number);
	}
	public void setIp65504P932ReservdL(long number) {
	    number = checkIp65504P932ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P932ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P933ReservdS
	 *	@return ip65504P933ReservdS
	 */
	public short getIp65504P933ReservdS() throws CFException {
        if (isIp65504P933ReservdSModified()) { 
           ip65504P933ReservdS = refreshIp65504P933ReservdS();
        }
   		return ip65504P933ReservdS;
	}
	
	/**
	 * 	Update Ip65504P933ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P933-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P933ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P933ReservdS = checkIp65504P933ReservdSMaxLimit(number); 
		serializeIp65504P933ReservdS(ip65504P933ReservdS);
	}

	public void setIp65504P933ReservdS(int number) {
	    number = checkIp65504P933ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P933ReservdS((short)number);
	}
	public void setIp65504P933ReservdS(long number) {
	    number = checkIp65504P933ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P933ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P933ReservdL
	 *	@return ip65504P933ReservdL
	 */
	public short getIp65504P933ReservdL() throws CFException {
        if (isIp65504P933ReservdLModified()) { 
           ip65504P933ReservdL = refreshIp65504P933ReservdL();
        }
   		return ip65504P933ReservdL;
	}
	
	/**
	 * 	Update Ip65504P933ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P933-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P933ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P933ReservdL = checkIp65504P933ReservdLMaxLimit(number); 
		serializeIp65504P933ReservdL(ip65504P933ReservdL);
	}

	public void setIp65504P933ReservdL(int number) {
	    number = checkIp65504P933ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P933ReservdL((short)number);
	}
	public void setIp65504P933ReservdL(long number) {
	    number = checkIp65504P933ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P933ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P934ReservdS
	 *	@return ip65504P934ReservdS
	 */
	public short getIp65504P934ReservdS() throws CFException {
        if (isIp65504P934ReservdSModified()) { 
           ip65504P934ReservdS = refreshIp65504P934ReservdS();
        }
   		return ip65504P934ReservdS;
	}
	
	/**
	 * 	Update Ip65504P934ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P934-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P934ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P934ReservdS = checkIp65504P934ReservdSMaxLimit(number); 
		serializeIp65504P934ReservdS(ip65504P934ReservdS);
	}

	public void setIp65504P934ReservdS(int number) {
	    number = checkIp65504P934ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P934ReservdS((short)number);
	}
	public void setIp65504P934ReservdS(long number) {
	    number = checkIp65504P934ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P934ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P934ReservdL
	 *	@return ip65504P934ReservdL
	 */
	public short getIp65504P934ReservdL() throws CFException {
        if (isIp65504P934ReservdLModified()) { 
           ip65504P934ReservdL = refreshIp65504P934ReservdL();
        }
   		return ip65504P934ReservdL;
	}
	
	/**
	 * 	Update Ip65504P934ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P934-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P934ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P934ReservdL = checkIp65504P934ReservdLMaxLimit(number); 
		serializeIp65504P934ReservdL(ip65504P934ReservdL);
	}

	public void setIp65504P934ReservdL(int number) {
	    number = checkIp65504P934ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P934ReservdL((short)number);
	}
	public void setIp65504P934ReservdL(long number) {
	    number = checkIp65504P934ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P934ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P935ReservdS
	 *	@return ip65504P935ReservdS
	 */
	public short getIp65504P935ReservdS() throws CFException {
        if (isIp65504P935ReservdSModified()) { 
           ip65504P935ReservdS = refreshIp65504P935ReservdS();
        }
   		return ip65504P935ReservdS;
	}
	
	/**
	 * 	Update Ip65504P935ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P935-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P935ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P935ReservdS = checkIp65504P935ReservdSMaxLimit(number); 
		serializeIp65504P935ReservdS(ip65504P935ReservdS);
	}

	public void setIp65504P935ReservdS(int number) {
	    number = checkIp65504P935ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P935ReservdS((short)number);
	}
	public void setIp65504P935ReservdS(long number) {
	    number = checkIp65504P935ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P935ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P935ReservdL
	 *	@return ip65504P935ReservdL
	 */
	public short getIp65504P935ReservdL() throws CFException {
        if (isIp65504P935ReservdLModified()) { 
           ip65504P935ReservdL = refreshIp65504P935ReservdL();
        }
   		return ip65504P935ReservdL;
	}
	
	/**
	 * 	Update Ip65504P935ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P935-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P935ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P935ReservdL = checkIp65504P935ReservdLMaxLimit(number); 
		serializeIp65504P935ReservdL(ip65504P935ReservdL);
	}

	public void setIp65504P935ReservdL(int number) {
	    number = checkIp65504P935ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P935ReservdL((short)number);
	}
	public void setIp65504P935ReservdL(long number) {
	    number = checkIp65504P935ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P935ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P936ReservdS
	 *	@return ip65504P936ReservdS
	 */
	public short getIp65504P936ReservdS() throws CFException {
        if (isIp65504P936ReservdSModified()) { 
           ip65504P936ReservdS = refreshIp65504P936ReservdS();
        }
   		return ip65504P936ReservdS;
	}
	
	/**
	 * 	Update Ip65504P936ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P936-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P936ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P936ReservdS = checkIp65504P936ReservdSMaxLimit(number); 
		serializeIp65504P936ReservdS(ip65504P936ReservdS);
	}

	public void setIp65504P936ReservdS(int number) {
	    number = checkIp65504P936ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P936ReservdS((short)number);
	}
	public void setIp65504P936ReservdS(long number) {
	    number = checkIp65504P936ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P936ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P936ReservdL
	 *	@return ip65504P936ReservdL
	 */
	public short getIp65504P936ReservdL() throws CFException {
        if (isIp65504P936ReservdLModified()) { 
           ip65504P936ReservdL = refreshIp65504P936ReservdL();
        }
   		return ip65504P936ReservdL;
	}
	
	/**
	 * 	Update Ip65504P936ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P936-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P936ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P936ReservdL = checkIp65504P936ReservdLMaxLimit(number); 
		serializeIp65504P936ReservdL(ip65504P936ReservdL);
	}

	public void setIp65504P936ReservdL(int number) {
	    number = checkIp65504P936ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P936ReservdL((short)number);
	}
	public void setIp65504P936ReservdL(long number) {
	    number = checkIp65504P936ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P936ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P937ReservdS
	 *	@return ip65504P937ReservdS
	 */
	public short getIp65504P937ReservdS() throws CFException {
        if (isIp65504P937ReservdSModified()) { 
           ip65504P937ReservdS = refreshIp65504P937ReservdS();
        }
   		return ip65504P937ReservdS;
	}
	
	/**
	 * 	Update Ip65504P937ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P937-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P937ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P937ReservdS = checkIp65504P937ReservdSMaxLimit(number); 
		serializeIp65504P937ReservdS(ip65504P937ReservdS);
	}

	public void setIp65504P937ReservdS(int number) {
	    number = checkIp65504P937ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P937ReservdS((short)number);
	}
	public void setIp65504P937ReservdS(long number) {
	    number = checkIp65504P937ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P937ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P937ReservdL
	 *	@return ip65504P937ReservdL
	 */
	public short getIp65504P937ReservdL() throws CFException {
        if (isIp65504P937ReservdLModified()) { 
           ip65504P937ReservdL = refreshIp65504P937ReservdL();
        }
   		return ip65504P937ReservdL;
	}
	
	/**
	 * 	Update Ip65504P937ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P937-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P937ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P937ReservdL = checkIp65504P937ReservdLMaxLimit(number); 
		serializeIp65504P937ReservdL(ip65504P937ReservdL);
	}

	public void setIp65504P937ReservdL(int number) {
	    number = checkIp65504P937ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P937ReservdL((short)number);
	}
	public void setIp65504P937ReservdL(long number) {
	    number = checkIp65504P937ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P937ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P938ReservdS
	 *	@return ip65504P938ReservdS
	 */
	public short getIp65504P938ReservdS() throws CFException {
        if (isIp65504P938ReservdSModified()) { 
           ip65504P938ReservdS = refreshIp65504P938ReservdS();
        }
   		return ip65504P938ReservdS;
	}
	
	/**
	 * 	Update Ip65504P938ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P938-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P938ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P938ReservdS = checkIp65504P938ReservdSMaxLimit(number); 
		serializeIp65504P938ReservdS(ip65504P938ReservdS);
	}

	public void setIp65504P938ReservdS(int number) {
	    number = checkIp65504P938ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P938ReservdS((short)number);
	}
	public void setIp65504P938ReservdS(long number) {
	    number = checkIp65504P938ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P938ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P938ReservdL
	 *	@return ip65504P938ReservdL
	 */
	public short getIp65504P938ReservdL() throws CFException {
        if (isIp65504P938ReservdLModified()) { 
           ip65504P938ReservdL = refreshIp65504P938ReservdL();
        }
   		return ip65504P938ReservdL;
	}
	
	/**
	 * 	Update Ip65504P938ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P938-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P938ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P938ReservdL = checkIp65504P938ReservdLMaxLimit(number); 
		serializeIp65504P938ReservdL(ip65504P938ReservdL);
	}

	public void setIp65504P938ReservdL(int number) {
	    number = checkIp65504P938ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P938ReservdL((short)number);
	}
	public void setIp65504P938ReservdL(long number) {
	    number = checkIp65504P938ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P938ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P939ReservdS
	 *	@return ip65504P939ReservdS
	 */
	public short getIp65504P939ReservdS() throws CFException {
        if (isIp65504P939ReservdSModified()) { 
           ip65504P939ReservdS = refreshIp65504P939ReservdS();
        }
   		return ip65504P939ReservdS;
	}
	
	/**
	 * 	Update Ip65504P939ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P939-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P939ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P939ReservdS = checkIp65504P939ReservdSMaxLimit(number); 
		serializeIp65504P939ReservdS(ip65504P939ReservdS);
	}

	public void setIp65504P939ReservdS(int number) {
	    number = checkIp65504P939ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P939ReservdS((short)number);
	}
	public void setIp65504P939ReservdS(long number) {
	    number = checkIp65504P939ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P939ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P939ReservdL
	 *	@return ip65504P939ReservdL
	 */
	public short getIp65504P939ReservdL() throws CFException {
        if (isIp65504P939ReservdLModified()) { 
           ip65504P939ReservdL = refreshIp65504P939ReservdL();
        }
   		return ip65504P939ReservdL;
	}
	
	/**
	 * 	Update Ip65504P939ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P939-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P939ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P939ReservdL = checkIp65504P939ReservdLMaxLimit(number); 
		serializeIp65504P939ReservdL(ip65504P939ReservdL);
	}

	public void setIp65504P939ReservdL(int number) {
	    number = checkIp65504P939ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P939ReservdL((short)number);
	}
	public void setIp65504P939ReservdL(long number) {
	    number = checkIp65504P939ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P939ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P940ReservdS
	 *	@return ip65504P940ReservdS
	 */
	public short getIp65504P940ReservdS() throws CFException {
        if (isIp65504P940ReservdSModified()) { 
           ip65504P940ReservdS = refreshIp65504P940ReservdS();
        }
   		return ip65504P940ReservdS;
	}
	
	/**
	 * 	Update Ip65504P940ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P940-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P940ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P940ReservdS = checkIp65504P940ReservdSMaxLimit(number); 
		serializeIp65504P940ReservdS(ip65504P940ReservdS);
	}

	public void setIp65504P940ReservdS(int number) {
	    number = checkIp65504P940ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P940ReservdS((short)number);
	}
	public void setIp65504P940ReservdS(long number) {
	    number = checkIp65504P940ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P940ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P940ReservdL
	 *	@return ip65504P940ReservdL
	 */
	public short getIp65504P940ReservdL() throws CFException {
        if (isIp65504P940ReservdLModified()) { 
           ip65504P940ReservdL = refreshIp65504P940ReservdL();
        }
   		return ip65504P940ReservdL;
	}
	
	/**
	 * 	Update Ip65504P940ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P940-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P940ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P940ReservdL = checkIp65504P940ReservdLMaxLimit(number); 
		serializeIp65504P940ReservdL(ip65504P940ReservdL);
	}

	public void setIp65504P940ReservdL(int number) {
	    number = checkIp65504P940ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P940ReservdL((short)number);
	}
	public void setIp65504P940ReservdL(long number) {
	    number = checkIp65504P940ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P940ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P941ReservdS
	 *	@return ip65504P941ReservdS
	 */
	public short getIp65504P941ReservdS() throws CFException {
        if (isIp65504P941ReservdSModified()) { 
           ip65504P941ReservdS = refreshIp65504P941ReservdS();
        }
   		return ip65504P941ReservdS;
	}
	
	/**
	 * 	Update Ip65504P941ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P941-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P941ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P941ReservdS = checkIp65504P941ReservdSMaxLimit(number); 
		serializeIp65504P941ReservdS(ip65504P941ReservdS);
	}

	public void setIp65504P941ReservdS(int number) {
	    number = checkIp65504P941ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P941ReservdS((short)number);
	}
	public void setIp65504P941ReservdS(long number) {
	    number = checkIp65504P941ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P941ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P941ReservdL
	 *	@return ip65504P941ReservdL
	 */
	public short getIp65504P941ReservdL() throws CFException {
        if (isIp65504P941ReservdLModified()) { 
           ip65504P941ReservdL = refreshIp65504P941ReservdL();
        }
   		return ip65504P941ReservdL;
	}
	
	/**
	 * 	Update Ip65504P941ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P941-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P941ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P941ReservdL = checkIp65504P941ReservdLMaxLimit(number); 
		serializeIp65504P941ReservdL(ip65504P941ReservdL);
	}

	public void setIp65504P941ReservdL(int number) {
	    number = checkIp65504P941ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P941ReservdL((short)number);
	}
	public void setIp65504P941ReservdL(long number) {
	    number = checkIp65504P941ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P941ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P942ReservdS
	 *	@return ip65504P942ReservdS
	 */
	public short getIp65504P942ReservdS() throws CFException {
        if (isIp65504P942ReservdSModified()) { 
           ip65504P942ReservdS = refreshIp65504P942ReservdS();
        }
   		return ip65504P942ReservdS;
	}
	
	/**
	 * 	Update Ip65504P942ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P942-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P942ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P942ReservdS = checkIp65504P942ReservdSMaxLimit(number); 
		serializeIp65504P942ReservdS(ip65504P942ReservdS);
	}

	public void setIp65504P942ReservdS(int number) {
	    number = checkIp65504P942ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P942ReservdS((short)number);
	}
	public void setIp65504P942ReservdS(long number) {
	    number = checkIp65504P942ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P942ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P942ReservdL
	 *	@return ip65504P942ReservdL
	 */
	public short getIp65504P942ReservdL() throws CFException {
        if (isIp65504P942ReservdLModified()) { 
           ip65504P942ReservdL = refreshIp65504P942ReservdL();
        }
   		return ip65504P942ReservdL;
	}
	
	/**
	 * 	Update Ip65504P942ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P942-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P942ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P942ReservdL = checkIp65504P942ReservdLMaxLimit(number); 
		serializeIp65504P942ReservdL(ip65504P942ReservdL);
	}

	public void setIp65504P942ReservdL(int number) {
	    number = checkIp65504P942ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P942ReservdL((short)number);
	}
	public void setIp65504P942ReservdL(long number) {
	    number = checkIp65504P942ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P942ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P943ReservdS
	 *	@return ip65504P943ReservdS
	 */
	public short getIp65504P943ReservdS() throws CFException {
        if (isIp65504P943ReservdSModified()) { 
           ip65504P943ReservdS = refreshIp65504P943ReservdS();
        }
   		return ip65504P943ReservdS;
	}
	
	/**
	 * 	Update Ip65504P943ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P943-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P943ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P943ReservdS = checkIp65504P943ReservdSMaxLimit(number); 
		serializeIp65504P943ReservdS(ip65504P943ReservdS);
	}

	public void setIp65504P943ReservdS(int number) {
	    number = checkIp65504P943ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P943ReservdS((short)number);
	}
	public void setIp65504P943ReservdS(long number) {
	    number = checkIp65504P943ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P943ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P943ReservdL
	 *	@return ip65504P943ReservdL
	 */
	public short getIp65504P943ReservdL() throws CFException {
        if (isIp65504P943ReservdLModified()) { 
           ip65504P943ReservdL = refreshIp65504P943ReservdL();
        }
   		return ip65504P943ReservdL;
	}
	
	/**
	 * 	Update Ip65504P943ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P943-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P943ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P943ReservdL = checkIp65504P943ReservdLMaxLimit(number); 
		serializeIp65504P943ReservdL(ip65504P943ReservdL);
	}

	public void setIp65504P943ReservdL(int number) {
	    number = checkIp65504P943ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P943ReservdL((short)number);
	}
	public void setIp65504P943ReservdL(long number) {
	    number = checkIp65504P943ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P943ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P944ReservdS
	 *	@return ip65504P944ReservdS
	 */
	public short getIp65504P944ReservdS() throws CFException {
        if (isIp65504P944ReservdSModified()) { 
           ip65504P944ReservdS = refreshIp65504P944ReservdS();
        }
   		return ip65504P944ReservdS;
	}
	
	/**
	 * 	Update Ip65504P944ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P944-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P944ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P944ReservdS = checkIp65504P944ReservdSMaxLimit(number); 
		serializeIp65504P944ReservdS(ip65504P944ReservdS);
	}

	public void setIp65504P944ReservdS(int number) {
	    number = checkIp65504P944ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P944ReservdS((short)number);
	}
	public void setIp65504P944ReservdS(long number) {
	    number = checkIp65504P944ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P944ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P944ReservdL
	 *	@return ip65504P944ReservdL
	 */
	public short getIp65504P944ReservdL() throws CFException {
        if (isIp65504P944ReservdLModified()) { 
           ip65504P944ReservdL = refreshIp65504P944ReservdL();
        }
   		return ip65504P944ReservdL;
	}
	
	/**
	 * 	Update Ip65504P944ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P944-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P944ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P944ReservdL = checkIp65504P944ReservdLMaxLimit(number); 
		serializeIp65504P944ReservdL(ip65504P944ReservdL);
	}

	public void setIp65504P944ReservdL(int number) {
	    number = checkIp65504P944ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P944ReservdL((short)number);
	}
	public void setIp65504P944ReservdL(long number) {
	    number = checkIp65504P944ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P944ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P945ReservdS
	 *	@return ip65504P945ReservdS
	 */
	public short getIp65504P945ReservdS() throws CFException {
        if (isIp65504P945ReservdSModified()) { 
           ip65504P945ReservdS = refreshIp65504P945ReservdS();
        }
   		return ip65504P945ReservdS;
	}
	
	/**
	 * 	Update Ip65504P945ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P945-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P945ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P945ReservdS = checkIp65504P945ReservdSMaxLimit(number); 
		serializeIp65504P945ReservdS(ip65504P945ReservdS);
	}

	public void setIp65504P945ReservdS(int number) {
	    number = checkIp65504P945ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P945ReservdS((short)number);
	}
	public void setIp65504P945ReservdS(long number) {
	    number = checkIp65504P945ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P945ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P945ReservdL
	 *	@return ip65504P945ReservdL
	 */
	public short getIp65504P945ReservdL() throws CFException {
        if (isIp65504P945ReservdLModified()) { 
           ip65504P945ReservdL = refreshIp65504P945ReservdL();
        }
   		return ip65504P945ReservdL;
	}
	
	/**
	 * 	Update Ip65504P945ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P945-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P945ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P945ReservdL = checkIp65504P945ReservdLMaxLimit(number); 
		serializeIp65504P945ReservdL(ip65504P945ReservdL);
	}

	public void setIp65504P945ReservdL(int number) {
	    number = checkIp65504P945ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P945ReservdL((short)number);
	}
	public void setIp65504P945ReservdL(long number) {
	    number = checkIp65504P945ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P945ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P946ReservdS
	 *	@return ip65504P946ReservdS
	 */
	public short getIp65504P946ReservdS() throws CFException {
        if (isIp65504P946ReservdSModified()) { 
           ip65504P946ReservdS = refreshIp65504P946ReservdS();
        }
   		return ip65504P946ReservdS;
	}
	
	/**
	 * 	Update Ip65504P946ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P946-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P946ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P946ReservdS = checkIp65504P946ReservdSMaxLimit(number); 
		serializeIp65504P946ReservdS(ip65504P946ReservdS);
	}

	public void setIp65504P946ReservdS(int number) {
	    number = checkIp65504P946ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P946ReservdS((short)number);
	}
	public void setIp65504P946ReservdS(long number) {
	    number = checkIp65504P946ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P946ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P946ReservdL
	 *	@return ip65504P946ReservdL
	 */
	public short getIp65504P946ReservdL() throws CFException {
        if (isIp65504P946ReservdLModified()) { 
           ip65504P946ReservdL = refreshIp65504P946ReservdL();
        }
   		return ip65504P946ReservdL;
	}
	
	/**
	 * 	Update Ip65504P946ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P946-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P946ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P946ReservdL = checkIp65504P946ReservdLMaxLimit(number); 
		serializeIp65504P946ReservdL(ip65504P946ReservdL);
	}

	public void setIp65504P946ReservdL(int number) {
	    number = checkIp65504P946ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P946ReservdL((short)number);
	}
	public void setIp65504P946ReservdL(long number) {
	    number = checkIp65504P946ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P946ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P947ReservdS
	 *	@return ip65504P947ReservdS
	 */
	public short getIp65504P947ReservdS() throws CFException {
        if (isIp65504P947ReservdSModified()) { 
           ip65504P947ReservdS = refreshIp65504P947ReservdS();
        }
   		return ip65504P947ReservdS;
	}
	
	/**
	 * 	Update Ip65504P947ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P947-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P947ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P947ReservdS = checkIp65504P947ReservdSMaxLimit(number); 
		serializeIp65504P947ReservdS(ip65504P947ReservdS);
	}

	public void setIp65504P947ReservdS(int number) {
	    number = checkIp65504P947ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P947ReservdS((short)number);
	}
	public void setIp65504P947ReservdS(long number) {
	    number = checkIp65504P947ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P947ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P947ReservdL
	 *	@return ip65504P947ReservdL
	 */
	public short getIp65504P947ReservdL() throws CFException {
        if (isIp65504P947ReservdLModified()) { 
           ip65504P947ReservdL = refreshIp65504P947ReservdL();
        }
   		return ip65504P947ReservdL;
	}
	
	/**
	 * 	Update Ip65504P947ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P947-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P947ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P947ReservdL = checkIp65504P947ReservdLMaxLimit(number); 
		serializeIp65504P947ReservdL(ip65504P947ReservdL);
	}

	public void setIp65504P947ReservdL(int number) {
	    number = checkIp65504P947ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P947ReservdL((short)number);
	}
	public void setIp65504P947ReservdL(long number) {
	    number = checkIp65504P947ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P947ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P948ReservdS
	 *	@return ip65504P948ReservdS
	 */
	public short getIp65504P948ReservdS() throws CFException {
        if (isIp65504P948ReservdSModified()) { 
           ip65504P948ReservdS = refreshIp65504P948ReservdS();
        }
   		return ip65504P948ReservdS;
	}
	
	/**
	 * 	Update Ip65504P948ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P948-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P948ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P948ReservdS = checkIp65504P948ReservdSMaxLimit(number); 
		serializeIp65504P948ReservdS(ip65504P948ReservdS);
	}

	public void setIp65504P948ReservdS(int number) {
	    number = checkIp65504P948ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P948ReservdS((short)number);
	}
	public void setIp65504P948ReservdS(long number) {
	    number = checkIp65504P948ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P948ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P948ReservdL
	 *	@return ip65504P948ReservdL
	 */
	public short getIp65504P948ReservdL() throws CFException {
        if (isIp65504P948ReservdLModified()) { 
           ip65504P948ReservdL = refreshIp65504P948ReservdL();
        }
   		return ip65504P948ReservdL;
	}
	
	/**
	 * 	Update Ip65504P948ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P948-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P948ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P948ReservdL = checkIp65504P948ReservdLMaxLimit(number); 
		serializeIp65504P948ReservdL(ip65504P948ReservdL);
	}

	public void setIp65504P948ReservdL(int number) {
	    number = checkIp65504P948ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P948ReservdL((short)number);
	}
	public void setIp65504P948ReservdL(long number) {
	    number = checkIp65504P948ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P948ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P949ReservdS
	 *	@return ip65504P949ReservdS
	 */
	public short getIp65504P949ReservdS() throws CFException {
        if (isIp65504P949ReservdSModified()) { 
           ip65504P949ReservdS = refreshIp65504P949ReservdS();
        }
   		return ip65504P949ReservdS;
	}
	
	/**
	 * 	Update Ip65504P949ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P949-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P949ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P949ReservdS = checkIp65504P949ReservdSMaxLimit(number); 
		serializeIp65504P949ReservdS(ip65504P949ReservdS);
	}

	public void setIp65504P949ReservdS(int number) {
	    number = checkIp65504P949ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P949ReservdS((short)number);
	}
	public void setIp65504P949ReservdS(long number) {
	    number = checkIp65504P949ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P949ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P949ReservdL
	 *	@return ip65504P949ReservdL
	 */
	public short getIp65504P949ReservdL() throws CFException {
        if (isIp65504P949ReservdLModified()) { 
           ip65504P949ReservdL = refreshIp65504P949ReservdL();
        }
   		return ip65504P949ReservdL;
	}
	
	/**
	 * 	Update Ip65504P949ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P949-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P949ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P949ReservdL = checkIp65504P949ReservdLMaxLimit(number); 
		serializeIp65504P949ReservdL(ip65504P949ReservdL);
	}

	public void setIp65504P949ReservdL(int number) {
	    number = checkIp65504P949ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P949ReservdL((short)number);
	}
	public void setIp65504P949ReservdL(long number) {
	    number = checkIp65504P949ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P949ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P950ReservdS
	 *	@return ip65504P950ReservdS
	 */
	public short getIp65504P950ReservdS() throws CFException {
        if (isIp65504P950ReservdSModified()) { 
           ip65504P950ReservdS = refreshIp65504P950ReservdS();
        }
   		return ip65504P950ReservdS;
	}
	
	/**
	 * 	Update Ip65504P950ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P950-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P950ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P950ReservdS = checkIp65504P950ReservdSMaxLimit(number); 
		serializeIp65504P950ReservdS(ip65504P950ReservdS);
	}

	public void setIp65504P950ReservdS(int number) {
	    number = checkIp65504P950ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P950ReservdS((short)number);
	}
	public void setIp65504P950ReservdS(long number) {
	    number = checkIp65504P950ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P950ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P950ReservdL
	 *	@return ip65504P950ReservdL
	 */
	public short getIp65504P950ReservdL() throws CFException {
        if (isIp65504P950ReservdLModified()) { 
           ip65504P950ReservdL = refreshIp65504P950ReservdL();
        }
   		return ip65504P950ReservdL;
	}
	
	/**
	 * 	Update Ip65504P950ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P950-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P950ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P950ReservdL = checkIp65504P950ReservdLMaxLimit(number); 
		serializeIp65504P950ReservdL(ip65504P950ReservdL);
	}

	public void setIp65504P950ReservdL(int number) {
	    number = checkIp65504P950ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P950ReservdL((short)number);
	}
	public void setIp65504P950ReservdL(long number) {
	    number = checkIp65504P950ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P950ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P951ReservdS
	 *	@return ip65504P951ReservdS
	 */
	public short getIp65504P951ReservdS() throws CFException {
        if (isIp65504P951ReservdSModified()) { 
           ip65504P951ReservdS = refreshIp65504P951ReservdS();
        }
   		return ip65504P951ReservdS;
	}
	
	/**
	 * 	Update Ip65504P951ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P951-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P951ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P951ReservdS = checkIp65504P951ReservdSMaxLimit(number); 
		serializeIp65504P951ReservdS(ip65504P951ReservdS);
	}

	public void setIp65504P951ReservdS(int number) {
	    number = checkIp65504P951ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P951ReservdS((short)number);
	}
	public void setIp65504P951ReservdS(long number) {
	    number = checkIp65504P951ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P951ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P951ReservdL
	 *	@return ip65504P951ReservdL
	 */
	public short getIp65504P951ReservdL() throws CFException {
        if (isIp65504P951ReservdLModified()) { 
           ip65504P951ReservdL = refreshIp65504P951ReservdL();
        }
   		return ip65504P951ReservdL;
	}
	
	/**
	 * 	Update Ip65504P951ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P951-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P951ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P951ReservdL = checkIp65504P951ReservdLMaxLimit(number); 
		serializeIp65504P951ReservdL(ip65504P951ReservdL);
	}

	public void setIp65504P951ReservdL(int number) {
	    number = checkIp65504P951ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P951ReservdL((short)number);
	}
	public void setIp65504P951ReservdL(long number) {
	    number = checkIp65504P951ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P951ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P952ReservdS
	 *	@return ip65504P952ReservdS
	 */
	public short getIp65504P952ReservdS() throws CFException {
        if (isIp65504P952ReservdSModified()) { 
           ip65504P952ReservdS = refreshIp65504P952ReservdS();
        }
   		return ip65504P952ReservdS;
	}
	
	/**
	 * 	Update Ip65504P952ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P952-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P952ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P952ReservdS = checkIp65504P952ReservdSMaxLimit(number); 
		serializeIp65504P952ReservdS(ip65504P952ReservdS);
	}

	public void setIp65504P952ReservdS(int number) {
	    number = checkIp65504P952ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P952ReservdS((short)number);
	}
	public void setIp65504P952ReservdS(long number) {
	    number = checkIp65504P952ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P952ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P952ReservdL
	 *	@return ip65504P952ReservdL
	 */
	public short getIp65504P952ReservdL() throws CFException {
        if (isIp65504P952ReservdLModified()) { 
           ip65504P952ReservdL = refreshIp65504P952ReservdL();
        }
   		return ip65504P952ReservdL;
	}
	
	/**
	 * 	Update Ip65504P952ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P952-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P952ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P952ReservdL = checkIp65504P952ReservdLMaxLimit(number); 
		serializeIp65504P952ReservdL(ip65504P952ReservdL);
	}

	public void setIp65504P952ReservdL(int number) {
	    number = checkIp65504P952ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P952ReservdL((short)number);
	}
	public void setIp65504P952ReservdL(long number) {
	    number = checkIp65504P952ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P952ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P953ReservdS
	 *	@return ip65504P953ReservdS
	 */
	public short getIp65504P953ReservdS() throws CFException {
        if (isIp65504P953ReservdSModified()) { 
           ip65504P953ReservdS = refreshIp65504P953ReservdS();
        }
   		return ip65504P953ReservdS;
	}
	
	/**
	 * 	Update Ip65504P953ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P953-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P953ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P953ReservdS = checkIp65504P953ReservdSMaxLimit(number); 
		serializeIp65504P953ReservdS(ip65504P953ReservdS);
	}

	public void setIp65504P953ReservdS(int number) {
	    number = checkIp65504P953ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P953ReservdS((short)number);
	}
	public void setIp65504P953ReservdS(long number) {
	    number = checkIp65504P953ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P953ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P953ReservdL
	 *	@return ip65504P953ReservdL
	 */
	public short getIp65504P953ReservdL() throws CFException {
        if (isIp65504P953ReservdLModified()) { 
           ip65504P953ReservdL = refreshIp65504P953ReservdL();
        }
   		return ip65504P953ReservdL;
	}
	
	/**
	 * 	Update Ip65504P953ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P953-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P953ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P953ReservdL = checkIp65504P953ReservdLMaxLimit(number); 
		serializeIp65504P953ReservdL(ip65504P953ReservdL);
	}

	public void setIp65504P953ReservdL(int number) {
	    number = checkIp65504P953ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P953ReservdL((short)number);
	}
	public void setIp65504P953ReservdL(long number) {
	    number = checkIp65504P953ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P953ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P954ReservdS
	 *	@return ip65504P954ReservdS
	 */
	public short getIp65504P954ReservdS() throws CFException {
        if (isIp65504P954ReservdSModified()) { 
           ip65504P954ReservdS = refreshIp65504P954ReservdS();
        }
   		return ip65504P954ReservdS;
	}
	
	/**
	 * 	Update Ip65504P954ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P954-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P954ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P954ReservdS = checkIp65504P954ReservdSMaxLimit(number); 
		serializeIp65504P954ReservdS(ip65504P954ReservdS);
	}

	public void setIp65504P954ReservdS(int number) {
	    number = checkIp65504P954ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P954ReservdS((short)number);
	}
	public void setIp65504P954ReservdS(long number) {
	    number = checkIp65504P954ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P954ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P954ReservdL
	 *	@return ip65504P954ReservdL
	 */
	public short getIp65504P954ReservdL() throws CFException {
        if (isIp65504P954ReservdLModified()) { 
           ip65504P954ReservdL = refreshIp65504P954ReservdL();
        }
   		return ip65504P954ReservdL;
	}
	
	/**
	 * 	Update Ip65504P954ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P954-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P954ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P954ReservdL = checkIp65504P954ReservdLMaxLimit(number); 
		serializeIp65504P954ReservdL(ip65504P954ReservdL);
	}

	public void setIp65504P954ReservdL(int number) {
	    number = checkIp65504P954ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P954ReservdL((short)number);
	}
	public void setIp65504P954ReservdL(long number) {
	    number = checkIp65504P954ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P954ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P955ReservdS
	 *	@return ip65504P955ReservdS
	 */
	public short getIp65504P955ReservdS() throws CFException {
        if (isIp65504P955ReservdSModified()) { 
           ip65504P955ReservdS = refreshIp65504P955ReservdS();
        }
   		return ip65504P955ReservdS;
	}
	
	/**
	 * 	Update Ip65504P955ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P955-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P955ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P955ReservdS = checkIp65504P955ReservdSMaxLimit(number); 
		serializeIp65504P955ReservdS(ip65504P955ReservdS);
	}

	public void setIp65504P955ReservdS(int number) {
	    number = checkIp65504P955ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P955ReservdS((short)number);
	}
	public void setIp65504P955ReservdS(long number) {
	    number = checkIp65504P955ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P955ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P955ReservdL
	 *	@return ip65504P955ReservdL
	 */
	public short getIp65504P955ReservdL() throws CFException {
        if (isIp65504P955ReservdLModified()) { 
           ip65504P955ReservdL = refreshIp65504P955ReservdL();
        }
   		return ip65504P955ReservdL;
	}
	
	/**
	 * 	Update Ip65504P955ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P955-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P955ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P955ReservdL = checkIp65504P955ReservdLMaxLimit(number); 
		serializeIp65504P955ReservdL(ip65504P955ReservdL);
	}

	public void setIp65504P955ReservdL(int number) {
	    number = checkIp65504P955ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P955ReservdL((short)number);
	}
	public void setIp65504P955ReservdL(long number) {
	    number = checkIp65504P955ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P955ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P956ReservdS
	 *	@return ip65504P956ReservdS
	 */
	public short getIp65504P956ReservdS() throws CFException {
        if (isIp65504P956ReservdSModified()) { 
           ip65504P956ReservdS = refreshIp65504P956ReservdS();
        }
   		return ip65504P956ReservdS;
	}
	
	/**
	 * 	Update Ip65504P956ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P956-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P956ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P956ReservdS = checkIp65504P956ReservdSMaxLimit(number); 
		serializeIp65504P956ReservdS(ip65504P956ReservdS);
	}

	public void setIp65504P956ReservdS(int number) {
	    number = checkIp65504P956ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P956ReservdS((short)number);
	}
	public void setIp65504P956ReservdS(long number) {
	    number = checkIp65504P956ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P956ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P956ReservdL
	 *	@return ip65504P956ReservdL
	 */
	public short getIp65504P956ReservdL() throws CFException {
        if (isIp65504P956ReservdLModified()) { 
           ip65504P956ReservdL = refreshIp65504P956ReservdL();
        }
   		return ip65504P956ReservdL;
	}
	
	/**
	 * 	Update Ip65504P956ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P956-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P956ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P956ReservdL = checkIp65504P956ReservdLMaxLimit(number); 
		serializeIp65504P956ReservdL(ip65504P956ReservdL);
	}

	public void setIp65504P956ReservdL(int number) {
	    number = checkIp65504P956ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P956ReservdL((short)number);
	}
	public void setIp65504P956ReservdL(long number) {
	    number = checkIp65504P956ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P956ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P957ReservdS
	 *	@return ip65504P957ReservdS
	 */
	public short getIp65504P957ReservdS() throws CFException {
        if (isIp65504P957ReservdSModified()) { 
           ip65504P957ReservdS = refreshIp65504P957ReservdS();
        }
   		return ip65504P957ReservdS;
	}
	
	/**
	 * 	Update Ip65504P957ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P957-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P957ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P957ReservdS = checkIp65504P957ReservdSMaxLimit(number); 
		serializeIp65504P957ReservdS(ip65504P957ReservdS);
	}

	public void setIp65504P957ReservdS(int number) {
	    number = checkIp65504P957ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P957ReservdS((short)number);
	}
	public void setIp65504P957ReservdS(long number) {
	    number = checkIp65504P957ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P957ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P957ReservdL
	 *	@return ip65504P957ReservdL
	 */
	public short getIp65504P957ReservdL() throws CFException {
        if (isIp65504P957ReservdLModified()) { 
           ip65504P957ReservdL = refreshIp65504P957ReservdL();
        }
   		return ip65504P957ReservdL;
	}
	
	/**
	 * 	Update Ip65504P957ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P957-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P957ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P957ReservdL = checkIp65504P957ReservdLMaxLimit(number); 
		serializeIp65504P957ReservdL(ip65504P957ReservdL);
	}

	public void setIp65504P957ReservdL(int number) {
	    number = checkIp65504P957ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P957ReservdL((short)number);
	}
	public void setIp65504P957ReservdL(long number) {
	    number = checkIp65504P957ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P957ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P958ReservdS
	 *	@return ip65504P958ReservdS
	 */
	public short getIp65504P958ReservdS() throws CFException {
        if (isIp65504P958ReservdSModified()) { 
           ip65504P958ReservdS = refreshIp65504P958ReservdS();
        }
   		return ip65504P958ReservdS;
	}
	
	/**
	 * 	Update Ip65504P958ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P958-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P958ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P958ReservdS = checkIp65504P958ReservdSMaxLimit(number); 
		serializeIp65504P958ReservdS(ip65504P958ReservdS);
	}

	public void setIp65504P958ReservdS(int number) {
	    number = checkIp65504P958ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P958ReservdS((short)number);
	}
	public void setIp65504P958ReservdS(long number) {
	    number = checkIp65504P958ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P958ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P958ReservdL
	 *	@return ip65504P958ReservdL
	 */
	public short getIp65504P958ReservdL() throws CFException {
        if (isIp65504P958ReservdLModified()) { 
           ip65504P958ReservdL = refreshIp65504P958ReservdL();
        }
   		return ip65504P958ReservdL;
	}
	
	/**
	 * 	Update Ip65504P958ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P958-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P958ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P958ReservdL = checkIp65504P958ReservdLMaxLimit(number); 
		serializeIp65504P958ReservdL(ip65504P958ReservdL);
	}

	public void setIp65504P958ReservdL(int number) {
	    number = checkIp65504P958ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P958ReservdL((short)number);
	}
	public void setIp65504P958ReservdL(long number) {
	    number = checkIp65504P958ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P958ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P959ReservdS
	 *	@return ip65504P959ReservdS
	 */
	public short getIp65504P959ReservdS() throws CFException {
        if (isIp65504P959ReservdSModified()) { 
           ip65504P959ReservdS = refreshIp65504P959ReservdS();
        }
   		return ip65504P959ReservdS;
	}
	
	/**
	 * 	Update Ip65504P959ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P959-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P959ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P959ReservdS = checkIp65504P959ReservdSMaxLimit(number); 
		serializeIp65504P959ReservdS(ip65504P959ReservdS);
	}

	public void setIp65504P959ReservdS(int number) {
	    number = checkIp65504P959ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P959ReservdS((short)number);
	}
	public void setIp65504P959ReservdS(long number) {
	    number = checkIp65504P959ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P959ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P959ReservdL
	 *	@return ip65504P959ReservdL
	 */
	public short getIp65504P959ReservdL() throws CFException {
        if (isIp65504P959ReservdLModified()) { 
           ip65504P959ReservdL = refreshIp65504P959ReservdL();
        }
   		return ip65504P959ReservdL;
	}
	
	/**
	 * 	Update Ip65504P959ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P959-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P959ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P959ReservdL = checkIp65504P959ReservdLMaxLimit(number); 
		serializeIp65504P959ReservdL(ip65504P959ReservdL);
	}

	public void setIp65504P959ReservdL(int number) {
	    number = checkIp65504P959ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P959ReservdL((short)number);
	}
	public void setIp65504P959ReservdL(long number) {
	    number = checkIp65504P959ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P959ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P960ReservdS
	 *	@return ip65504P960ReservdS
	 */
	public short getIp65504P960ReservdS() throws CFException {
        if (isIp65504P960ReservdSModified()) { 
           ip65504P960ReservdS = refreshIp65504P960ReservdS();
        }
   		return ip65504P960ReservdS;
	}
	
	/**
	 * 	Update Ip65504P960ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P960-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P960ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P960ReservdS = checkIp65504P960ReservdSMaxLimit(number); 
		serializeIp65504P960ReservdS(ip65504P960ReservdS);
	}

	public void setIp65504P960ReservdS(int number) {
	    number = checkIp65504P960ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P960ReservdS((short)number);
	}
	public void setIp65504P960ReservdS(long number) {
	    number = checkIp65504P960ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P960ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P960ReservdL
	 *	@return ip65504P960ReservdL
	 */
	public short getIp65504P960ReservdL() throws CFException {
        if (isIp65504P960ReservdLModified()) { 
           ip65504P960ReservdL = refreshIp65504P960ReservdL();
        }
   		return ip65504P960ReservdL;
	}
	
	/**
	 * 	Update Ip65504P960ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P960-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P960ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P960ReservdL = checkIp65504P960ReservdLMaxLimit(number); 
		serializeIp65504P960ReservdL(ip65504P960ReservdL);
	}

	public void setIp65504P960ReservdL(int number) {
	    number = checkIp65504P960ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P960ReservdL((short)number);
	}
	public void setIp65504P960ReservdL(long number) {
	    number = checkIp65504P960ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P960ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P961ReservdS
	 *	@return ip65504P961ReservdS
	 */
	public short getIp65504P961ReservdS() throws CFException {
        if (isIp65504P961ReservdSModified()) { 
           ip65504P961ReservdS = refreshIp65504P961ReservdS();
        }
   		return ip65504P961ReservdS;
	}
	
	/**
	 * 	Update Ip65504P961ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P961-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P961ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P961ReservdS = checkIp65504P961ReservdSMaxLimit(number); 
		serializeIp65504P961ReservdS(ip65504P961ReservdS);
	}

	public void setIp65504P961ReservdS(int number) {
	    number = checkIp65504P961ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P961ReservdS((short)number);
	}
	public void setIp65504P961ReservdS(long number) {
	    number = checkIp65504P961ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P961ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P961ReservdL
	 *	@return ip65504P961ReservdL
	 */
	public short getIp65504P961ReservdL() throws CFException {
        if (isIp65504P961ReservdLModified()) { 
           ip65504P961ReservdL = refreshIp65504P961ReservdL();
        }
   		return ip65504P961ReservdL;
	}
	
	/**
	 * 	Update Ip65504P961ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P961-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P961ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P961ReservdL = checkIp65504P961ReservdLMaxLimit(number); 
		serializeIp65504P961ReservdL(ip65504P961ReservdL);
	}

	public void setIp65504P961ReservdL(int number) {
	    number = checkIp65504P961ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P961ReservdL((short)number);
	}
	public void setIp65504P961ReservdL(long number) {
	    number = checkIp65504P961ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P961ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup31
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P931ReservdS((short)0);
         	setIp65504P931ReservdL((short)0);
         	setIp65504P932ReservdS((short)0);
         	setIp65504P932ReservdL((short)0);
         	setIp65504P933ReservdS((short)0);
         	setIp65504P933ReservdL((short)0);
         	setIp65504P934ReservdS((short)0);
         	setIp65504P934ReservdL((short)0);
         	setIp65504P935ReservdS((short)0);
         	setIp65504P935ReservdL((short)0);
         	setIp65504P936ReservdS((short)0);
         	setIp65504P936ReservdL((short)0);
         	setIp65504P937ReservdS((short)0);
         	setIp65504P937ReservdL((short)0);
         	setIp65504P938ReservdS((short)0);
         	setIp65504P938ReservdL((short)0);
         	setIp65504P939ReservdS((short)0);
         	setIp65504P939ReservdL((short)0);
         	setIp65504P940ReservdS((short)0);
         	setIp65504P940ReservdL((short)0);
         	setIp65504P941ReservdS((short)0);
         	setIp65504P941ReservdL((short)0);
         	setIp65504P942ReservdS((short)0);
         	setIp65504P942ReservdL((short)0);
         	setIp65504P943ReservdS((short)0);
         	setIp65504P943ReservdL((short)0);
         	setIp65504P944ReservdS((short)0);
         	setIp65504P944ReservdL((short)0);
         	setIp65504P945ReservdS((short)0);
         	setIp65504P945ReservdL((short)0);
         	setIp65504P946ReservdS((short)0);
         	setIp65504P946ReservdL((short)0);
         	setIp65504P947ReservdS((short)0);
         	setIp65504P947ReservdL((short)0);
         	setIp65504P948ReservdS((short)0);
         	setIp65504P948ReservdL((short)0);
         	setIp65504P949ReservdS((short)0);
         	setIp65504P949ReservdL((short)0);
         	setIp65504P950ReservdS((short)0);
         	setIp65504P950ReservdL((short)0);
         	setIp65504P951ReservdS((short)0);
         	setIp65504P951ReservdL((short)0);
         	setIp65504P952ReservdS((short)0);
         	setIp65504P952ReservdL((short)0);
         	setIp65504P953ReservdS((short)0);
         	setIp65504P953ReservdL((short)0);
         	setIp65504P954ReservdS((short)0);
         	setIp65504P954ReservdL((short)0);
         	setIp65504P955ReservdS((short)0);
         	setIp65504P955ReservdL((short)0);
         	setIp65504P956ReservdS((short)0);
         	setIp65504P956ReservdL((short)0);
         	setIp65504P957ReservdS((short)0);
         	setIp65504P957ReservdL((short)0);
         	setIp65504P958ReservdS((short)0);
         	setIp65504P958ReservdL((short)0);
         	setIp65504P959ReservdS((short)0);
         	setIp65504P959ReservdL((short)0);
         	setIp65504P960ReservdS((short)0);
         	setIp65504P960ReservdL((short)0);
         	setIp65504P961ReservdS((short)0);
         	setIp65504P961ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup31FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_31_LENGTH;
		}

}
  
