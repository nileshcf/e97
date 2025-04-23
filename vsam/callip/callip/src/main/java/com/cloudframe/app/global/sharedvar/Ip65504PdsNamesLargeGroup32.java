package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup32 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup32 extends Ip65504PdsNamesLargeGroup32Serialized { 
   

								private short ip65504P962ReservdS;

								private short ip65504P962ReservdL;


								private short ip65504P963ReservdS;

								private short ip65504P963ReservdL;


								private short ip65504P964ReservdS;

								private short ip65504P964ReservdL;


								private short ip65504P965ReservdS;

								private short ip65504P965ReservdL;


								private short ip65504P966ReservdS;

								private short ip65504P966ReservdL;


								private short ip65504P967ReservdS;

								private short ip65504P967ReservdL;


								private short ip65504P968ReservdS;

								private short ip65504P968ReservdL;


								private short ip65504P969ReservdS;

								private short ip65504P969ReservdL;


								private short ip65504P970ReservdS;

								private short ip65504P970ReservdL;


								private short ip65504P971ReservdS;

								private short ip65504P971ReservdL;


								private short ip65504P972ReservdS;

								private short ip65504P972ReservdL;


								private short ip65504P973ReservdS;

								private short ip65504P973ReservdL;


								private short ip65504P974ReservdS;

								private short ip65504P974ReservdL;


								private short ip65504P975ReservdS;

								private short ip65504P975ReservdL;


								private short ip65504P976ReservdS;

								private short ip65504P976ReservdL;


								private short ip65504P977ReservdS;

								private short ip65504P977ReservdL;


								private short ip65504P978ReservdS;

								private short ip65504P978ReservdL;


								private short ip65504P979ReservdS;

								private short ip65504P979ReservdL;


								private short ip65504P980ReservdS;

								private short ip65504P980ReservdL;


								private short ip65504P981ReservdS;

								private short ip65504P981ReservdL;


								private short ip65504P982ReservdS;

								private short ip65504P982ReservdL;


								private short ip65504P983ReservdS;

								private short ip65504P983ReservdL;


								private short ip65504P984ReservdS;

								private short ip65504P984ReservdL;


								private short ip65504P985ReservdS;

								private short ip65504P985ReservdL;


								private short ip65504P986ReservdS;

								private short ip65504P986ReservdL;


								private short ip65504P987ReservdS;

								private short ip65504P987ReservdL;


								private short ip65504P988ReservdS;

								private short ip65504P988ReservdL;


								private short ip65504P989ReservdS;

								private short ip65504P989ReservdL;


								private short ip65504P990ReservdS;

								private short ip65504P990ReservdL;


								private short ip65504P991ReservdS;

								private short ip65504P991ReservdL;


								private short ip65504P992ReservdS;

								private short ip65504P992ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup32
	**/
    public Ip65504PdsNamesLargeGroup32() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup32. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup32(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P962ReservdS
	 *	@return ip65504P962ReservdS
	 */
	public short getIp65504P962ReservdS() throws CFException {
        if (isIp65504P962ReservdSModified()) { 
           ip65504P962ReservdS = refreshIp65504P962ReservdS();
        }
   		return ip65504P962ReservdS;
	}
	
	/**
	 * 	Update Ip65504P962ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P962-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P962ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P962ReservdS = checkIp65504P962ReservdSMaxLimit(number); 
		serializeIp65504P962ReservdS(ip65504P962ReservdS);
	}

	public void setIp65504P962ReservdS(int number) {
	    number = checkIp65504P962ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P962ReservdS((short)number);
	}
	public void setIp65504P962ReservdS(long number) {
	    number = checkIp65504P962ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P962ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P962ReservdL
	 *	@return ip65504P962ReservdL
	 */
	public short getIp65504P962ReservdL() throws CFException {
        if (isIp65504P962ReservdLModified()) { 
           ip65504P962ReservdL = refreshIp65504P962ReservdL();
        }
   		return ip65504P962ReservdL;
	}
	
	/**
	 * 	Update Ip65504P962ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P962-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P962ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P962ReservdL = checkIp65504P962ReservdLMaxLimit(number); 
		serializeIp65504P962ReservdL(ip65504P962ReservdL);
	}

	public void setIp65504P962ReservdL(int number) {
	    number = checkIp65504P962ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P962ReservdL((short)number);
	}
	public void setIp65504P962ReservdL(long number) {
	    number = checkIp65504P962ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P962ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P963ReservdS
	 *	@return ip65504P963ReservdS
	 */
	public short getIp65504P963ReservdS() throws CFException {
        if (isIp65504P963ReservdSModified()) { 
           ip65504P963ReservdS = refreshIp65504P963ReservdS();
        }
   		return ip65504P963ReservdS;
	}
	
	/**
	 * 	Update Ip65504P963ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P963-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P963ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P963ReservdS = checkIp65504P963ReservdSMaxLimit(number); 
		serializeIp65504P963ReservdS(ip65504P963ReservdS);
	}

	public void setIp65504P963ReservdS(int number) {
	    number = checkIp65504P963ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P963ReservdS((short)number);
	}
	public void setIp65504P963ReservdS(long number) {
	    number = checkIp65504P963ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P963ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P963ReservdL
	 *	@return ip65504P963ReservdL
	 */
	public short getIp65504P963ReservdL() throws CFException {
        if (isIp65504P963ReservdLModified()) { 
           ip65504P963ReservdL = refreshIp65504P963ReservdL();
        }
   		return ip65504P963ReservdL;
	}
	
	/**
	 * 	Update Ip65504P963ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P963-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P963ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P963ReservdL = checkIp65504P963ReservdLMaxLimit(number); 
		serializeIp65504P963ReservdL(ip65504P963ReservdL);
	}

	public void setIp65504P963ReservdL(int number) {
	    number = checkIp65504P963ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P963ReservdL((short)number);
	}
	public void setIp65504P963ReservdL(long number) {
	    number = checkIp65504P963ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P963ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P964ReservdS
	 *	@return ip65504P964ReservdS
	 */
	public short getIp65504P964ReservdS() throws CFException {
        if (isIp65504P964ReservdSModified()) { 
           ip65504P964ReservdS = refreshIp65504P964ReservdS();
        }
   		return ip65504P964ReservdS;
	}
	
	/**
	 * 	Update Ip65504P964ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P964-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P964ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P964ReservdS = checkIp65504P964ReservdSMaxLimit(number); 
		serializeIp65504P964ReservdS(ip65504P964ReservdS);
	}

	public void setIp65504P964ReservdS(int number) {
	    number = checkIp65504P964ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P964ReservdS((short)number);
	}
	public void setIp65504P964ReservdS(long number) {
	    number = checkIp65504P964ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P964ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P964ReservdL
	 *	@return ip65504P964ReservdL
	 */
	public short getIp65504P964ReservdL() throws CFException {
        if (isIp65504P964ReservdLModified()) { 
           ip65504P964ReservdL = refreshIp65504P964ReservdL();
        }
   		return ip65504P964ReservdL;
	}
	
	/**
	 * 	Update Ip65504P964ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P964-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P964ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P964ReservdL = checkIp65504P964ReservdLMaxLimit(number); 
		serializeIp65504P964ReservdL(ip65504P964ReservdL);
	}

	public void setIp65504P964ReservdL(int number) {
	    number = checkIp65504P964ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P964ReservdL((short)number);
	}
	public void setIp65504P964ReservdL(long number) {
	    number = checkIp65504P964ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P964ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P965ReservdS
	 *	@return ip65504P965ReservdS
	 */
	public short getIp65504P965ReservdS() throws CFException {
        if (isIp65504P965ReservdSModified()) { 
           ip65504P965ReservdS = refreshIp65504P965ReservdS();
        }
   		return ip65504P965ReservdS;
	}
	
	/**
	 * 	Update Ip65504P965ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P965-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P965ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P965ReservdS = checkIp65504P965ReservdSMaxLimit(number); 
		serializeIp65504P965ReservdS(ip65504P965ReservdS);
	}

	public void setIp65504P965ReservdS(int number) {
	    number = checkIp65504P965ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P965ReservdS((short)number);
	}
	public void setIp65504P965ReservdS(long number) {
	    number = checkIp65504P965ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P965ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P965ReservdL
	 *	@return ip65504P965ReservdL
	 */
	public short getIp65504P965ReservdL() throws CFException {
        if (isIp65504P965ReservdLModified()) { 
           ip65504P965ReservdL = refreshIp65504P965ReservdL();
        }
   		return ip65504P965ReservdL;
	}
	
	/**
	 * 	Update Ip65504P965ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P965-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P965ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P965ReservdL = checkIp65504P965ReservdLMaxLimit(number); 
		serializeIp65504P965ReservdL(ip65504P965ReservdL);
	}

	public void setIp65504P965ReservdL(int number) {
	    number = checkIp65504P965ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P965ReservdL((short)number);
	}
	public void setIp65504P965ReservdL(long number) {
	    number = checkIp65504P965ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P965ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P966ReservdS
	 *	@return ip65504P966ReservdS
	 */
	public short getIp65504P966ReservdS() throws CFException {
        if (isIp65504P966ReservdSModified()) { 
           ip65504P966ReservdS = refreshIp65504P966ReservdS();
        }
   		return ip65504P966ReservdS;
	}
	
	/**
	 * 	Update Ip65504P966ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P966-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P966ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P966ReservdS = checkIp65504P966ReservdSMaxLimit(number); 
		serializeIp65504P966ReservdS(ip65504P966ReservdS);
	}

	public void setIp65504P966ReservdS(int number) {
	    number = checkIp65504P966ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P966ReservdS((short)number);
	}
	public void setIp65504P966ReservdS(long number) {
	    number = checkIp65504P966ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P966ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P966ReservdL
	 *	@return ip65504P966ReservdL
	 */
	public short getIp65504P966ReservdL() throws CFException {
        if (isIp65504P966ReservdLModified()) { 
           ip65504P966ReservdL = refreshIp65504P966ReservdL();
        }
   		return ip65504P966ReservdL;
	}
	
	/**
	 * 	Update Ip65504P966ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P966-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P966ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P966ReservdL = checkIp65504P966ReservdLMaxLimit(number); 
		serializeIp65504P966ReservdL(ip65504P966ReservdL);
	}

	public void setIp65504P966ReservdL(int number) {
	    number = checkIp65504P966ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P966ReservdL((short)number);
	}
	public void setIp65504P966ReservdL(long number) {
	    number = checkIp65504P966ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P966ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P967ReservdS
	 *	@return ip65504P967ReservdS
	 */
	public short getIp65504P967ReservdS() throws CFException {
        if (isIp65504P967ReservdSModified()) { 
           ip65504P967ReservdS = refreshIp65504P967ReservdS();
        }
   		return ip65504P967ReservdS;
	}
	
	/**
	 * 	Update Ip65504P967ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P967-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P967ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P967ReservdS = checkIp65504P967ReservdSMaxLimit(number); 
		serializeIp65504P967ReservdS(ip65504P967ReservdS);
	}

	public void setIp65504P967ReservdS(int number) {
	    number = checkIp65504P967ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P967ReservdS((short)number);
	}
	public void setIp65504P967ReservdS(long number) {
	    number = checkIp65504P967ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P967ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P967ReservdL
	 *	@return ip65504P967ReservdL
	 */
	public short getIp65504P967ReservdL() throws CFException {
        if (isIp65504P967ReservdLModified()) { 
           ip65504P967ReservdL = refreshIp65504P967ReservdL();
        }
   		return ip65504P967ReservdL;
	}
	
	/**
	 * 	Update Ip65504P967ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P967-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P967ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P967ReservdL = checkIp65504P967ReservdLMaxLimit(number); 
		serializeIp65504P967ReservdL(ip65504P967ReservdL);
	}

	public void setIp65504P967ReservdL(int number) {
	    number = checkIp65504P967ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P967ReservdL((short)number);
	}
	public void setIp65504P967ReservdL(long number) {
	    number = checkIp65504P967ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P967ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P968ReservdS
	 *	@return ip65504P968ReservdS
	 */
	public short getIp65504P968ReservdS() throws CFException {
        if (isIp65504P968ReservdSModified()) { 
           ip65504P968ReservdS = refreshIp65504P968ReservdS();
        }
   		return ip65504P968ReservdS;
	}
	
	/**
	 * 	Update Ip65504P968ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P968-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P968ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P968ReservdS = checkIp65504P968ReservdSMaxLimit(number); 
		serializeIp65504P968ReservdS(ip65504P968ReservdS);
	}

	public void setIp65504P968ReservdS(int number) {
	    number = checkIp65504P968ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P968ReservdS((short)number);
	}
	public void setIp65504P968ReservdS(long number) {
	    number = checkIp65504P968ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P968ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P968ReservdL
	 *	@return ip65504P968ReservdL
	 */
	public short getIp65504P968ReservdL() throws CFException {
        if (isIp65504P968ReservdLModified()) { 
           ip65504P968ReservdL = refreshIp65504P968ReservdL();
        }
   		return ip65504P968ReservdL;
	}
	
	/**
	 * 	Update Ip65504P968ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P968-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P968ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P968ReservdL = checkIp65504P968ReservdLMaxLimit(number); 
		serializeIp65504P968ReservdL(ip65504P968ReservdL);
	}

	public void setIp65504P968ReservdL(int number) {
	    number = checkIp65504P968ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P968ReservdL((short)number);
	}
	public void setIp65504P968ReservdL(long number) {
	    number = checkIp65504P968ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P968ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P969ReservdS
	 *	@return ip65504P969ReservdS
	 */
	public short getIp65504P969ReservdS() throws CFException {
        if (isIp65504P969ReservdSModified()) { 
           ip65504P969ReservdS = refreshIp65504P969ReservdS();
        }
   		return ip65504P969ReservdS;
	}
	
	/**
	 * 	Update Ip65504P969ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P969-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P969ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P969ReservdS = checkIp65504P969ReservdSMaxLimit(number); 
		serializeIp65504P969ReservdS(ip65504P969ReservdS);
	}

	public void setIp65504P969ReservdS(int number) {
	    number = checkIp65504P969ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P969ReservdS((short)number);
	}
	public void setIp65504P969ReservdS(long number) {
	    number = checkIp65504P969ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P969ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P969ReservdL
	 *	@return ip65504P969ReservdL
	 */
	public short getIp65504P969ReservdL() throws CFException {
        if (isIp65504P969ReservdLModified()) { 
           ip65504P969ReservdL = refreshIp65504P969ReservdL();
        }
   		return ip65504P969ReservdL;
	}
	
	/**
	 * 	Update Ip65504P969ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P969-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P969ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P969ReservdL = checkIp65504P969ReservdLMaxLimit(number); 
		serializeIp65504P969ReservdL(ip65504P969ReservdL);
	}

	public void setIp65504P969ReservdL(int number) {
	    number = checkIp65504P969ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P969ReservdL((short)number);
	}
	public void setIp65504P969ReservdL(long number) {
	    number = checkIp65504P969ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P969ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P970ReservdS
	 *	@return ip65504P970ReservdS
	 */
	public short getIp65504P970ReservdS() throws CFException {
        if (isIp65504P970ReservdSModified()) { 
           ip65504P970ReservdS = refreshIp65504P970ReservdS();
        }
   		return ip65504P970ReservdS;
	}
	
	/**
	 * 	Update Ip65504P970ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P970-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P970ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P970ReservdS = checkIp65504P970ReservdSMaxLimit(number); 
		serializeIp65504P970ReservdS(ip65504P970ReservdS);
	}

	public void setIp65504P970ReservdS(int number) {
	    number = checkIp65504P970ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P970ReservdS((short)number);
	}
	public void setIp65504P970ReservdS(long number) {
	    number = checkIp65504P970ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P970ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P970ReservdL
	 *	@return ip65504P970ReservdL
	 */
	public short getIp65504P970ReservdL() throws CFException {
        if (isIp65504P970ReservdLModified()) { 
           ip65504P970ReservdL = refreshIp65504P970ReservdL();
        }
   		return ip65504P970ReservdL;
	}
	
	/**
	 * 	Update Ip65504P970ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P970-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P970ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P970ReservdL = checkIp65504P970ReservdLMaxLimit(number); 
		serializeIp65504P970ReservdL(ip65504P970ReservdL);
	}

	public void setIp65504P970ReservdL(int number) {
	    number = checkIp65504P970ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P970ReservdL((short)number);
	}
	public void setIp65504P970ReservdL(long number) {
	    number = checkIp65504P970ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P970ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P971ReservdS
	 *	@return ip65504P971ReservdS
	 */
	public short getIp65504P971ReservdS() throws CFException {
        if (isIp65504P971ReservdSModified()) { 
           ip65504P971ReservdS = refreshIp65504P971ReservdS();
        }
   		return ip65504P971ReservdS;
	}
	
	/**
	 * 	Update Ip65504P971ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P971-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P971ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P971ReservdS = checkIp65504P971ReservdSMaxLimit(number); 
		serializeIp65504P971ReservdS(ip65504P971ReservdS);
	}

	public void setIp65504P971ReservdS(int number) {
	    number = checkIp65504P971ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P971ReservdS((short)number);
	}
	public void setIp65504P971ReservdS(long number) {
	    number = checkIp65504P971ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P971ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P971ReservdL
	 *	@return ip65504P971ReservdL
	 */
	public short getIp65504P971ReservdL() throws CFException {
        if (isIp65504P971ReservdLModified()) { 
           ip65504P971ReservdL = refreshIp65504P971ReservdL();
        }
   		return ip65504P971ReservdL;
	}
	
	/**
	 * 	Update Ip65504P971ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P971-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P971ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P971ReservdL = checkIp65504P971ReservdLMaxLimit(number); 
		serializeIp65504P971ReservdL(ip65504P971ReservdL);
	}

	public void setIp65504P971ReservdL(int number) {
	    number = checkIp65504P971ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P971ReservdL((short)number);
	}
	public void setIp65504P971ReservdL(long number) {
	    number = checkIp65504P971ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P971ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P972ReservdS
	 *	@return ip65504P972ReservdS
	 */
	public short getIp65504P972ReservdS() throws CFException {
        if (isIp65504P972ReservdSModified()) { 
           ip65504P972ReservdS = refreshIp65504P972ReservdS();
        }
   		return ip65504P972ReservdS;
	}
	
	/**
	 * 	Update Ip65504P972ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P972-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P972ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P972ReservdS = checkIp65504P972ReservdSMaxLimit(number); 
		serializeIp65504P972ReservdS(ip65504P972ReservdS);
	}

	public void setIp65504P972ReservdS(int number) {
	    number = checkIp65504P972ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P972ReservdS((short)number);
	}
	public void setIp65504P972ReservdS(long number) {
	    number = checkIp65504P972ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P972ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P972ReservdL
	 *	@return ip65504P972ReservdL
	 */
	public short getIp65504P972ReservdL() throws CFException {
        if (isIp65504P972ReservdLModified()) { 
           ip65504P972ReservdL = refreshIp65504P972ReservdL();
        }
   		return ip65504P972ReservdL;
	}
	
	/**
	 * 	Update Ip65504P972ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P972-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P972ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P972ReservdL = checkIp65504P972ReservdLMaxLimit(number); 
		serializeIp65504P972ReservdL(ip65504P972ReservdL);
	}

	public void setIp65504P972ReservdL(int number) {
	    number = checkIp65504P972ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P972ReservdL((short)number);
	}
	public void setIp65504P972ReservdL(long number) {
	    number = checkIp65504P972ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P972ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P973ReservdS
	 *	@return ip65504P973ReservdS
	 */
	public short getIp65504P973ReservdS() throws CFException {
        if (isIp65504P973ReservdSModified()) { 
           ip65504P973ReservdS = refreshIp65504P973ReservdS();
        }
   		return ip65504P973ReservdS;
	}
	
	/**
	 * 	Update Ip65504P973ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P973-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P973ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P973ReservdS = checkIp65504P973ReservdSMaxLimit(number); 
		serializeIp65504P973ReservdS(ip65504P973ReservdS);
	}

	public void setIp65504P973ReservdS(int number) {
	    number = checkIp65504P973ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P973ReservdS((short)number);
	}
	public void setIp65504P973ReservdS(long number) {
	    number = checkIp65504P973ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P973ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P973ReservdL
	 *	@return ip65504P973ReservdL
	 */
	public short getIp65504P973ReservdL() throws CFException {
        if (isIp65504P973ReservdLModified()) { 
           ip65504P973ReservdL = refreshIp65504P973ReservdL();
        }
   		return ip65504P973ReservdL;
	}
	
	/**
	 * 	Update Ip65504P973ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P973-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P973ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P973ReservdL = checkIp65504P973ReservdLMaxLimit(number); 
		serializeIp65504P973ReservdL(ip65504P973ReservdL);
	}

	public void setIp65504P973ReservdL(int number) {
	    number = checkIp65504P973ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P973ReservdL((short)number);
	}
	public void setIp65504P973ReservdL(long number) {
	    number = checkIp65504P973ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P973ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P974ReservdS
	 *	@return ip65504P974ReservdS
	 */
	public short getIp65504P974ReservdS() throws CFException {
        if (isIp65504P974ReservdSModified()) { 
           ip65504P974ReservdS = refreshIp65504P974ReservdS();
        }
   		return ip65504P974ReservdS;
	}
	
	/**
	 * 	Update Ip65504P974ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P974-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P974ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P974ReservdS = checkIp65504P974ReservdSMaxLimit(number); 
		serializeIp65504P974ReservdS(ip65504P974ReservdS);
	}

	public void setIp65504P974ReservdS(int number) {
	    number = checkIp65504P974ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P974ReservdS((short)number);
	}
	public void setIp65504P974ReservdS(long number) {
	    number = checkIp65504P974ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P974ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P974ReservdL
	 *	@return ip65504P974ReservdL
	 */
	public short getIp65504P974ReservdL() throws CFException {
        if (isIp65504P974ReservdLModified()) { 
           ip65504P974ReservdL = refreshIp65504P974ReservdL();
        }
   		return ip65504P974ReservdL;
	}
	
	/**
	 * 	Update Ip65504P974ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P974-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P974ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P974ReservdL = checkIp65504P974ReservdLMaxLimit(number); 
		serializeIp65504P974ReservdL(ip65504P974ReservdL);
	}

	public void setIp65504P974ReservdL(int number) {
	    number = checkIp65504P974ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P974ReservdL((short)number);
	}
	public void setIp65504P974ReservdL(long number) {
	    number = checkIp65504P974ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P974ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P975ReservdS
	 *	@return ip65504P975ReservdS
	 */
	public short getIp65504P975ReservdS() throws CFException {
        if (isIp65504P975ReservdSModified()) { 
           ip65504P975ReservdS = refreshIp65504P975ReservdS();
        }
   		return ip65504P975ReservdS;
	}
	
	/**
	 * 	Update Ip65504P975ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P975-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P975ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P975ReservdS = checkIp65504P975ReservdSMaxLimit(number); 
		serializeIp65504P975ReservdS(ip65504P975ReservdS);
	}

	public void setIp65504P975ReservdS(int number) {
	    number = checkIp65504P975ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P975ReservdS((short)number);
	}
	public void setIp65504P975ReservdS(long number) {
	    number = checkIp65504P975ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P975ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P975ReservdL
	 *	@return ip65504P975ReservdL
	 */
	public short getIp65504P975ReservdL() throws CFException {
        if (isIp65504P975ReservdLModified()) { 
           ip65504P975ReservdL = refreshIp65504P975ReservdL();
        }
   		return ip65504P975ReservdL;
	}
	
	/**
	 * 	Update Ip65504P975ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P975-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P975ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P975ReservdL = checkIp65504P975ReservdLMaxLimit(number); 
		serializeIp65504P975ReservdL(ip65504P975ReservdL);
	}

	public void setIp65504P975ReservdL(int number) {
	    number = checkIp65504P975ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P975ReservdL((short)number);
	}
	public void setIp65504P975ReservdL(long number) {
	    number = checkIp65504P975ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P975ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P976ReservdS
	 *	@return ip65504P976ReservdS
	 */
	public short getIp65504P976ReservdS() throws CFException {
        if (isIp65504P976ReservdSModified()) { 
           ip65504P976ReservdS = refreshIp65504P976ReservdS();
        }
   		return ip65504P976ReservdS;
	}
	
	/**
	 * 	Update Ip65504P976ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P976-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P976ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P976ReservdS = checkIp65504P976ReservdSMaxLimit(number); 
		serializeIp65504P976ReservdS(ip65504P976ReservdS);
	}

	public void setIp65504P976ReservdS(int number) {
	    number = checkIp65504P976ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P976ReservdS((short)number);
	}
	public void setIp65504P976ReservdS(long number) {
	    number = checkIp65504P976ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P976ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P976ReservdL
	 *	@return ip65504P976ReservdL
	 */
	public short getIp65504P976ReservdL() throws CFException {
        if (isIp65504P976ReservdLModified()) { 
           ip65504P976ReservdL = refreshIp65504P976ReservdL();
        }
   		return ip65504P976ReservdL;
	}
	
	/**
	 * 	Update Ip65504P976ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P976-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P976ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P976ReservdL = checkIp65504P976ReservdLMaxLimit(number); 
		serializeIp65504P976ReservdL(ip65504P976ReservdL);
	}

	public void setIp65504P976ReservdL(int number) {
	    number = checkIp65504P976ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P976ReservdL((short)number);
	}
	public void setIp65504P976ReservdL(long number) {
	    number = checkIp65504P976ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P976ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P977ReservdS
	 *	@return ip65504P977ReservdS
	 */
	public short getIp65504P977ReservdS() throws CFException {
        if (isIp65504P977ReservdSModified()) { 
           ip65504P977ReservdS = refreshIp65504P977ReservdS();
        }
   		return ip65504P977ReservdS;
	}
	
	/**
	 * 	Update Ip65504P977ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P977-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P977ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P977ReservdS = checkIp65504P977ReservdSMaxLimit(number); 
		serializeIp65504P977ReservdS(ip65504P977ReservdS);
	}

	public void setIp65504P977ReservdS(int number) {
	    number = checkIp65504P977ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P977ReservdS((short)number);
	}
	public void setIp65504P977ReservdS(long number) {
	    number = checkIp65504P977ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P977ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P977ReservdL
	 *	@return ip65504P977ReservdL
	 */
	public short getIp65504P977ReservdL() throws CFException {
        if (isIp65504P977ReservdLModified()) { 
           ip65504P977ReservdL = refreshIp65504P977ReservdL();
        }
   		return ip65504P977ReservdL;
	}
	
	/**
	 * 	Update Ip65504P977ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P977-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P977ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P977ReservdL = checkIp65504P977ReservdLMaxLimit(number); 
		serializeIp65504P977ReservdL(ip65504P977ReservdL);
	}

	public void setIp65504P977ReservdL(int number) {
	    number = checkIp65504P977ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P977ReservdL((short)number);
	}
	public void setIp65504P977ReservdL(long number) {
	    number = checkIp65504P977ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P977ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P978ReservdS
	 *	@return ip65504P978ReservdS
	 */
	public short getIp65504P978ReservdS() throws CFException {
        if (isIp65504P978ReservdSModified()) { 
           ip65504P978ReservdS = refreshIp65504P978ReservdS();
        }
   		return ip65504P978ReservdS;
	}
	
	/**
	 * 	Update Ip65504P978ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P978-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P978ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P978ReservdS = checkIp65504P978ReservdSMaxLimit(number); 
		serializeIp65504P978ReservdS(ip65504P978ReservdS);
	}

	public void setIp65504P978ReservdS(int number) {
	    number = checkIp65504P978ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P978ReservdS((short)number);
	}
	public void setIp65504P978ReservdS(long number) {
	    number = checkIp65504P978ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P978ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P978ReservdL
	 *	@return ip65504P978ReservdL
	 */
	public short getIp65504P978ReservdL() throws CFException {
        if (isIp65504P978ReservdLModified()) { 
           ip65504P978ReservdL = refreshIp65504P978ReservdL();
        }
   		return ip65504P978ReservdL;
	}
	
	/**
	 * 	Update Ip65504P978ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P978-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P978ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P978ReservdL = checkIp65504P978ReservdLMaxLimit(number); 
		serializeIp65504P978ReservdL(ip65504P978ReservdL);
	}

	public void setIp65504P978ReservdL(int number) {
	    number = checkIp65504P978ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P978ReservdL((short)number);
	}
	public void setIp65504P978ReservdL(long number) {
	    number = checkIp65504P978ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P978ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P979ReservdS
	 *	@return ip65504P979ReservdS
	 */
	public short getIp65504P979ReservdS() throws CFException {
        if (isIp65504P979ReservdSModified()) { 
           ip65504P979ReservdS = refreshIp65504P979ReservdS();
        }
   		return ip65504P979ReservdS;
	}
	
	/**
	 * 	Update Ip65504P979ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P979-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P979ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P979ReservdS = checkIp65504P979ReservdSMaxLimit(number); 
		serializeIp65504P979ReservdS(ip65504P979ReservdS);
	}

	public void setIp65504P979ReservdS(int number) {
	    number = checkIp65504P979ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P979ReservdS((short)number);
	}
	public void setIp65504P979ReservdS(long number) {
	    number = checkIp65504P979ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P979ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P979ReservdL
	 *	@return ip65504P979ReservdL
	 */
	public short getIp65504P979ReservdL() throws CFException {
        if (isIp65504P979ReservdLModified()) { 
           ip65504P979ReservdL = refreshIp65504P979ReservdL();
        }
   		return ip65504P979ReservdL;
	}
	
	/**
	 * 	Update Ip65504P979ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P979-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P979ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P979ReservdL = checkIp65504P979ReservdLMaxLimit(number); 
		serializeIp65504P979ReservdL(ip65504P979ReservdL);
	}

	public void setIp65504P979ReservdL(int number) {
	    number = checkIp65504P979ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P979ReservdL((short)number);
	}
	public void setIp65504P979ReservdL(long number) {
	    number = checkIp65504P979ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P979ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P980ReservdS
	 *	@return ip65504P980ReservdS
	 */
	public short getIp65504P980ReservdS() throws CFException {
        if (isIp65504P980ReservdSModified()) { 
           ip65504P980ReservdS = refreshIp65504P980ReservdS();
        }
   		return ip65504P980ReservdS;
	}
	
	/**
	 * 	Update Ip65504P980ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P980-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P980ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P980ReservdS = checkIp65504P980ReservdSMaxLimit(number); 
		serializeIp65504P980ReservdS(ip65504P980ReservdS);
	}

	public void setIp65504P980ReservdS(int number) {
	    number = checkIp65504P980ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P980ReservdS((short)number);
	}
	public void setIp65504P980ReservdS(long number) {
	    number = checkIp65504P980ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P980ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P980ReservdL
	 *	@return ip65504P980ReservdL
	 */
	public short getIp65504P980ReservdL() throws CFException {
        if (isIp65504P980ReservdLModified()) { 
           ip65504P980ReservdL = refreshIp65504P980ReservdL();
        }
   		return ip65504P980ReservdL;
	}
	
	/**
	 * 	Update Ip65504P980ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P980-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P980ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P980ReservdL = checkIp65504P980ReservdLMaxLimit(number); 
		serializeIp65504P980ReservdL(ip65504P980ReservdL);
	}

	public void setIp65504P980ReservdL(int number) {
	    number = checkIp65504P980ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P980ReservdL((short)number);
	}
	public void setIp65504P980ReservdL(long number) {
	    number = checkIp65504P980ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P980ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P981ReservdS
	 *	@return ip65504P981ReservdS
	 */
	public short getIp65504P981ReservdS() throws CFException {
        if (isIp65504P981ReservdSModified()) { 
           ip65504P981ReservdS = refreshIp65504P981ReservdS();
        }
   		return ip65504P981ReservdS;
	}
	
	/**
	 * 	Update Ip65504P981ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P981-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P981ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P981ReservdS = checkIp65504P981ReservdSMaxLimit(number); 
		serializeIp65504P981ReservdS(ip65504P981ReservdS);
	}

	public void setIp65504P981ReservdS(int number) {
	    number = checkIp65504P981ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P981ReservdS((short)number);
	}
	public void setIp65504P981ReservdS(long number) {
	    number = checkIp65504P981ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P981ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P981ReservdL
	 *	@return ip65504P981ReservdL
	 */
	public short getIp65504P981ReservdL() throws CFException {
        if (isIp65504P981ReservdLModified()) { 
           ip65504P981ReservdL = refreshIp65504P981ReservdL();
        }
   		return ip65504P981ReservdL;
	}
	
	/**
	 * 	Update Ip65504P981ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P981-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P981ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P981ReservdL = checkIp65504P981ReservdLMaxLimit(number); 
		serializeIp65504P981ReservdL(ip65504P981ReservdL);
	}

	public void setIp65504P981ReservdL(int number) {
	    number = checkIp65504P981ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P981ReservdL((short)number);
	}
	public void setIp65504P981ReservdL(long number) {
	    number = checkIp65504P981ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P981ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P982ReservdS
	 *	@return ip65504P982ReservdS
	 */
	public short getIp65504P982ReservdS() throws CFException {
        if (isIp65504P982ReservdSModified()) { 
           ip65504P982ReservdS = refreshIp65504P982ReservdS();
        }
   		return ip65504P982ReservdS;
	}
	
	/**
	 * 	Update Ip65504P982ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P982-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P982ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P982ReservdS = checkIp65504P982ReservdSMaxLimit(number); 
		serializeIp65504P982ReservdS(ip65504P982ReservdS);
	}

	public void setIp65504P982ReservdS(int number) {
	    number = checkIp65504P982ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P982ReservdS((short)number);
	}
	public void setIp65504P982ReservdS(long number) {
	    number = checkIp65504P982ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P982ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P982ReservdL
	 *	@return ip65504P982ReservdL
	 */
	public short getIp65504P982ReservdL() throws CFException {
        if (isIp65504P982ReservdLModified()) { 
           ip65504P982ReservdL = refreshIp65504P982ReservdL();
        }
   		return ip65504P982ReservdL;
	}
	
	/**
	 * 	Update Ip65504P982ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P982-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P982ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P982ReservdL = checkIp65504P982ReservdLMaxLimit(number); 
		serializeIp65504P982ReservdL(ip65504P982ReservdL);
	}

	public void setIp65504P982ReservdL(int number) {
	    number = checkIp65504P982ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P982ReservdL((short)number);
	}
	public void setIp65504P982ReservdL(long number) {
	    number = checkIp65504P982ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P982ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P983ReservdS
	 *	@return ip65504P983ReservdS
	 */
	public short getIp65504P983ReservdS() throws CFException {
        if (isIp65504P983ReservdSModified()) { 
           ip65504P983ReservdS = refreshIp65504P983ReservdS();
        }
   		return ip65504P983ReservdS;
	}
	
	/**
	 * 	Update Ip65504P983ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P983-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P983ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P983ReservdS = checkIp65504P983ReservdSMaxLimit(number); 
		serializeIp65504P983ReservdS(ip65504P983ReservdS);
	}

	public void setIp65504P983ReservdS(int number) {
	    number = checkIp65504P983ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P983ReservdS((short)number);
	}
	public void setIp65504P983ReservdS(long number) {
	    number = checkIp65504P983ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P983ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P983ReservdL
	 *	@return ip65504P983ReservdL
	 */
	public short getIp65504P983ReservdL() throws CFException {
        if (isIp65504P983ReservdLModified()) { 
           ip65504P983ReservdL = refreshIp65504P983ReservdL();
        }
   		return ip65504P983ReservdL;
	}
	
	/**
	 * 	Update Ip65504P983ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P983-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P983ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P983ReservdL = checkIp65504P983ReservdLMaxLimit(number); 
		serializeIp65504P983ReservdL(ip65504P983ReservdL);
	}

	public void setIp65504P983ReservdL(int number) {
	    number = checkIp65504P983ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P983ReservdL((short)number);
	}
	public void setIp65504P983ReservdL(long number) {
	    number = checkIp65504P983ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P983ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P984ReservdS
	 *	@return ip65504P984ReservdS
	 */
	public short getIp65504P984ReservdS() throws CFException {
        if (isIp65504P984ReservdSModified()) { 
           ip65504P984ReservdS = refreshIp65504P984ReservdS();
        }
   		return ip65504P984ReservdS;
	}
	
	/**
	 * 	Update Ip65504P984ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P984-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P984ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P984ReservdS = checkIp65504P984ReservdSMaxLimit(number); 
		serializeIp65504P984ReservdS(ip65504P984ReservdS);
	}

	public void setIp65504P984ReservdS(int number) {
	    number = checkIp65504P984ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P984ReservdS((short)number);
	}
	public void setIp65504P984ReservdS(long number) {
	    number = checkIp65504P984ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P984ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P984ReservdL
	 *	@return ip65504P984ReservdL
	 */
	public short getIp65504P984ReservdL() throws CFException {
        if (isIp65504P984ReservdLModified()) { 
           ip65504P984ReservdL = refreshIp65504P984ReservdL();
        }
   		return ip65504P984ReservdL;
	}
	
	/**
	 * 	Update Ip65504P984ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P984-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P984ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P984ReservdL = checkIp65504P984ReservdLMaxLimit(number); 
		serializeIp65504P984ReservdL(ip65504P984ReservdL);
	}

	public void setIp65504P984ReservdL(int number) {
	    number = checkIp65504P984ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P984ReservdL((short)number);
	}
	public void setIp65504P984ReservdL(long number) {
	    number = checkIp65504P984ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P984ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P985ReservdS
	 *	@return ip65504P985ReservdS
	 */
	public short getIp65504P985ReservdS() throws CFException {
        if (isIp65504P985ReservdSModified()) { 
           ip65504P985ReservdS = refreshIp65504P985ReservdS();
        }
   		return ip65504P985ReservdS;
	}
	
	/**
	 * 	Update Ip65504P985ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P985-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P985ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P985ReservdS = checkIp65504P985ReservdSMaxLimit(number); 
		serializeIp65504P985ReservdS(ip65504P985ReservdS);
	}

	public void setIp65504P985ReservdS(int number) {
	    number = checkIp65504P985ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P985ReservdS((short)number);
	}
	public void setIp65504P985ReservdS(long number) {
	    number = checkIp65504P985ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P985ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P985ReservdL
	 *	@return ip65504P985ReservdL
	 */
	public short getIp65504P985ReservdL() throws CFException {
        if (isIp65504P985ReservdLModified()) { 
           ip65504P985ReservdL = refreshIp65504P985ReservdL();
        }
   		return ip65504P985ReservdL;
	}
	
	/**
	 * 	Update Ip65504P985ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P985-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P985ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P985ReservdL = checkIp65504P985ReservdLMaxLimit(number); 
		serializeIp65504P985ReservdL(ip65504P985ReservdL);
	}

	public void setIp65504P985ReservdL(int number) {
	    number = checkIp65504P985ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P985ReservdL((short)number);
	}
	public void setIp65504P985ReservdL(long number) {
	    number = checkIp65504P985ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P985ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P986ReservdS
	 *	@return ip65504P986ReservdS
	 */
	public short getIp65504P986ReservdS() throws CFException {
        if (isIp65504P986ReservdSModified()) { 
           ip65504P986ReservdS = refreshIp65504P986ReservdS();
        }
   		return ip65504P986ReservdS;
	}
	
	/**
	 * 	Update Ip65504P986ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P986-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P986ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P986ReservdS = checkIp65504P986ReservdSMaxLimit(number); 
		serializeIp65504P986ReservdS(ip65504P986ReservdS);
	}

	public void setIp65504P986ReservdS(int number) {
	    number = checkIp65504P986ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P986ReservdS((short)number);
	}
	public void setIp65504P986ReservdS(long number) {
	    number = checkIp65504P986ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P986ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P986ReservdL
	 *	@return ip65504P986ReservdL
	 */
	public short getIp65504P986ReservdL() throws CFException {
        if (isIp65504P986ReservdLModified()) { 
           ip65504P986ReservdL = refreshIp65504P986ReservdL();
        }
   		return ip65504P986ReservdL;
	}
	
	/**
	 * 	Update Ip65504P986ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P986-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P986ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P986ReservdL = checkIp65504P986ReservdLMaxLimit(number); 
		serializeIp65504P986ReservdL(ip65504P986ReservdL);
	}

	public void setIp65504P986ReservdL(int number) {
	    number = checkIp65504P986ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P986ReservdL((short)number);
	}
	public void setIp65504P986ReservdL(long number) {
	    number = checkIp65504P986ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P986ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P987ReservdS
	 *	@return ip65504P987ReservdS
	 */
	public short getIp65504P987ReservdS() throws CFException {
        if (isIp65504P987ReservdSModified()) { 
           ip65504P987ReservdS = refreshIp65504P987ReservdS();
        }
   		return ip65504P987ReservdS;
	}
	
	/**
	 * 	Update Ip65504P987ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P987-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P987ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P987ReservdS = checkIp65504P987ReservdSMaxLimit(number); 
		serializeIp65504P987ReservdS(ip65504P987ReservdS);
	}

	public void setIp65504P987ReservdS(int number) {
	    number = checkIp65504P987ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P987ReservdS((short)number);
	}
	public void setIp65504P987ReservdS(long number) {
	    number = checkIp65504P987ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P987ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P987ReservdL
	 *	@return ip65504P987ReservdL
	 */
	public short getIp65504P987ReservdL() throws CFException {
        if (isIp65504P987ReservdLModified()) { 
           ip65504P987ReservdL = refreshIp65504P987ReservdL();
        }
   		return ip65504P987ReservdL;
	}
	
	/**
	 * 	Update Ip65504P987ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P987-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P987ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P987ReservdL = checkIp65504P987ReservdLMaxLimit(number); 
		serializeIp65504P987ReservdL(ip65504P987ReservdL);
	}

	public void setIp65504P987ReservdL(int number) {
	    number = checkIp65504P987ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P987ReservdL((short)number);
	}
	public void setIp65504P987ReservdL(long number) {
	    number = checkIp65504P987ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P987ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P988ReservdS
	 *	@return ip65504P988ReservdS
	 */
	public short getIp65504P988ReservdS() throws CFException {
        if (isIp65504P988ReservdSModified()) { 
           ip65504P988ReservdS = refreshIp65504P988ReservdS();
        }
   		return ip65504P988ReservdS;
	}
	
	/**
	 * 	Update Ip65504P988ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P988-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P988ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P988ReservdS = checkIp65504P988ReservdSMaxLimit(number); 
		serializeIp65504P988ReservdS(ip65504P988ReservdS);
	}

	public void setIp65504P988ReservdS(int number) {
	    number = checkIp65504P988ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P988ReservdS((short)number);
	}
	public void setIp65504P988ReservdS(long number) {
	    number = checkIp65504P988ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P988ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P988ReservdL
	 *	@return ip65504P988ReservdL
	 */
	public short getIp65504P988ReservdL() throws CFException {
        if (isIp65504P988ReservdLModified()) { 
           ip65504P988ReservdL = refreshIp65504P988ReservdL();
        }
   		return ip65504P988ReservdL;
	}
	
	/**
	 * 	Update Ip65504P988ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P988-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P988ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P988ReservdL = checkIp65504P988ReservdLMaxLimit(number); 
		serializeIp65504P988ReservdL(ip65504P988ReservdL);
	}

	public void setIp65504P988ReservdL(int number) {
	    number = checkIp65504P988ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P988ReservdL((short)number);
	}
	public void setIp65504P988ReservdL(long number) {
	    number = checkIp65504P988ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P988ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P989ReservdS
	 *	@return ip65504P989ReservdS
	 */
	public short getIp65504P989ReservdS() throws CFException {
        if (isIp65504P989ReservdSModified()) { 
           ip65504P989ReservdS = refreshIp65504P989ReservdS();
        }
   		return ip65504P989ReservdS;
	}
	
	/**
	 * 	Update Ip65504P989ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P989-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P989ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P989ReservdS = checkIp65504P989ReservdSMaxLimit(number); 
		serializeIp65504P989ReservdS(ip65504P989ReservdS);
	}

	public void setIp65504P989ReservdS(int number) {
	    number = checkIp65504P989ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P989ReservdS((short)number);
	}
	public void setIp65504P989ReservdS(long number) {
	    number = checkIp65504P989ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P989ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P989ReservdL
	 *	@return ip65504P989ReservdL
	 */
	public short getIp65504P989ReservdL() throws CFException {
        if (isIp65504P989ReservdLModified()) { 
           ip65504P989ReservdL = refreshIp65504P989ReservdL();
        }
   		return ip65504P989ReservdL;
	}
	
	/**
	 * 	Update Ip65504P989ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P989-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P989ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P989ReservdL = checkIp65504P989ReservdLMaxLimit(number); 
		serializeIp65504P989ReservdL(ip65504P989ReservdL);
	}

	public void setIp65504P989ReservdL(int number) {
	    number = checkIp65504P989ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P989ReservdL((short)number);
	}
	public void setIp65504P989ReservdL(long number) {
	    number = checkIp65504P989ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P989ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P990ReservdS
	 *	@return ip65504P990ReservdS
	 */
	public short getIp65504P990ReservdS() throws CFException {
        if (isIp65504P990ReservdSModified()) { 
           ip65504P990ReservdS = refreshIp65504P990ReservdS();
        }
   		return ip65504P990ReservdS;
	}
	
	/**
	 * 	Update Ip65504P990ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P990-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P990ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P990ReservdS = checkIp65504P990ReservdSMaxLimit(number); 
		serializeIp65504P990ReservdS(ip65504P990ReservdS);
	}

	public void setIp65504P990ReservdS(int number) {
	    number = checkIp65504P990ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P990ReservdS((short)number);
	}
	public void setIp65504P990ReservdS(long number) {
	    number = checkIp65504P990ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P990ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P990ReservdL
	 *	@return ip65504P990ReservdL
	 */
	public short getIp65504P990ReservdL() throws CFException {
        if (isIp65504P990ReservdLModified()) { 
           ip65504P990ReservdL = refreshIp65504P990ReservdL();
        }
   		return ip65504P990ReservdL;
	}
	
	/**
	 * 	Update Ip65504P990ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P990-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P990ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P990ReservdL = checkIp65504P990ReservdLMaxLimit(number); 
		serializeIp65504P990ReservdL(ip65504P990ReservdL);
	}

	public void setIp65504P990ReservdL(int number) {
	    number = checkIp65504P990ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P990ReservdL((short)number);
	}
	public void setIp65504P990ReservdL(long number) {
	    number = checkIp65504P990ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P990ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P991ReservdS
	 *	@return ip65504P991ReservdS
	 */
	public short getIp65504P991ReservdS() throws CFException {
        if (isIp65504P991ReservdSModified()) { 
           ip65504P991ReservdS = refreshIp65504P991ReservdS();
        }
   		return ip65504P991ReservdS;
	}
	
	/**
	 * 	Update Ip65504P991ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P991-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P991ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P991ReservdS = checkIp65504P991ReservdSMaxLimit(number); 
		serializeIp65504P991ReservdS(ip65504P991ReservdS);
	}

	public void setIp65504P991ReservdS(int number) {
	    number = checkIp65504P991ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P991ReservdS((short)number);
	}
	public void setIp65504P991ReservdS(long number) {
	    number = checkIp65504P991ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P991ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P991ReservdL
	 *	@return ip65504P991ReservdL
	 */
	public short getIp65504P991ReservdL() throws CFException {
        if (isIp65504P991ReservdLModified()) { 
           ip65504P991ReservdL = refreshIp65504P991ReservdL();
        }
   		return ip65504P991ReservdL;
	}
	
	/**
	 * 	Update Ip65504P991ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P991-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P991ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P991ReservdL = checkIp65504P991ReservdLMaxLimit(number); 
		serializeIp65504P991ReservdL(ip65504P991ReservdL);
	}

	public void setIp65504P991ReservdL(int number) {
	    number = checkIp65504P991ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P991ReservdL((short)number);
	}
	public void setIp65504P991ReservdL(long number) {
	    number = checkIp65504P991ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P991ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P992ReservdS
	 *	@return ip65504P992ReservdS
	 */
	public short getIp65504P992ReservdS() throws CFException {
        if (isIp65504P992ReservdSModified()) { 
           ip65504P992ReservdS = refreshIp65504P992ReservdS();
        }
   		return ip65504P992ReservdS;
	}
	
	/**
	 * 	Update Ip65504P992ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P992-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P992ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P992ReservdS = checkIp65504P992ReservdSMaxLimit(number); 
		serializeIp65504P992ReservdS(ip65504P992ReservdS);
	}

	public void setIp65504P992ReservdS(int number) {
	    number = checkIp65504P992ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P992ReservdS((short)number);
	}
	public void setIp65504P992ReservdS(long number) {
	    number = checkIp65504P992ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P992ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P992ReservdL
	 *	@return ip65504P992ReservdL
	 */
	public short getIp65504P992ReservdL() throws CFException {
        if (isIp65504P992ReservdLModified()) { 
           ip65504P992ReservdL = refreshIp65504P992ReservdL();
        }
   		return ip65504P992ReservdL;
	}
	
	/**
	 * 	Update Ip65504P992ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P992-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P992ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P992ReservdL = checkIp65504P992ReservdLMaxLimit(number); 
		serializeIp65504P992ReservdL(ip65504P992ReservdL);
	}

	public void setIp65504P992ReservdL(int number) {
	    number = checkIp65504P992ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P992ReservdL((short)number);
	}
	public void setIp65504P992ReservdL(long number) {
	    number = checkIp65504P992ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P992ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup32
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P962ReservdS((short)0);
         	setIp65504P962ReservdL((short)0);
         	setIp65504P963ReservdS((short)0);
         	setIp65504P963ReservdL((short)0);
         	setIp65504P964ReservdS((short)0);
         	setIp65504P964ReservdL((short)0);
         	setIp65504P965ReservdS((short)0);
         	setIp65504P965ReservdL((short)0);
         	setIp65504P966ReservdS((short)0);
         	setIp65504P966ReservdL((short)0);
         	setIp65504P967ReservdS((short)0);
         	setIp65504P967ReservdL((short)0);
         	setIp65504P968ReservdS((short)0);
         	setIp65504P968ReservdL((short)0);
         	setIp65504P969ReservdS((short)0);
         	setIp65504P969ReservdL((short)0);
         	setIp65504P970ReservdS((short)0);
         	setIp65504P970ReservdL((short)0);
         	setIp65504P971ReservdS((short)0);
         	setIp65504P971ReservdL((short)0);
         	setIp65504P972ReservdS((short)0);
         	setIp65504P972ReservdL((short)0);
         	setIp65504P973ReservdS((short)0);
         	setIp65504P973ReservdL((short)0);
         	setIp65504P974ReservdS((short)0);
         	setIp65504P974ReservdL((short)0);
         	setIp65504P975ReservdS((short)0);
         	setIp65504P975ReservdL((short)0);
         	setIp65504P976ReservdS((short)0);
         	setIp65504P976ReservdL((short)0);
         	setIp65504P977ReservdS((short)0);
         	setIp65504P977ReservdL((short)0);
         	setIp65504P978ReservdS((short)0);
         	setIp65504P978ReservdL((short)0);
         	setIp65504P979ReservdS((short)0);
         	setIp65504P979ReservdL((short)0);
         	setIp65504P980ReservdS((short)0);
         	setIp65504P980ReservdL((short)0);
         	setIp65504P981ReservdS((short)0);
         	setIp65504P981ReservdL((short)0);
         	setIp65504P982ReservdS((short)0);
         	setIp65504P982ReservdL((short)0);
         	setIp65504P983ReservdS((short)0);
         	setIp65504P983ReservdL((short)0);
         	setIp65504P984ReservdS((short)0);
         	setIp65504P984ReservdL((short)0);
         	setIp65504P985ReservdS((short)0);
         	setIp65504P985ReservdL((short)0);
         	setIp65504P986ReservdS((short)0);
         	setIp65504P986ReservdL((short)0);
         	setIp65504P987ReservdS((short)0);
         	setIp65504P987ReservdL((short)0);
         	setIp65504P988ReservdS((short)0);
         	setIp65504P988ReservdL((short)0);
         	setIp65504P989ReservdS((short)0);
         	setIp65504P989ReservdL((short)0);
         	setIp65504P990ReservdS((short)0);
         	setIp65504P990ReservdL((short)0);
         	setIp65504P991ReservdS((short)0);
         	setIp65504P991ReservdL((short)0);
         	setIp65504P992ReservdS((short)0);
         	setIp65504P992ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup32FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_32_LENGTH;
		}

}
  
