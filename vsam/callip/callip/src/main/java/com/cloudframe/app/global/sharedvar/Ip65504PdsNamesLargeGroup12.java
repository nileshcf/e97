package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup12 extends Ip65504PdsNamesLargeGroup12Serialized { 
   

								private short ip65504P342ReservdS;

								private short ip65504P342ReservdL;


								private short ip65504P343ReservdS;

								private short ip65504P343ReservdL;


								private short ip65504P344ReservdS;

								private short ip65504P344ReservdL;


								private short ip65504P345ReservdS;

								private short ip65504P345ReservdL;


								private short ip65504P346ReservdS;

								private short ip65504P346ReservdL;


								private short ip65504P347ReservdS;

								private short ip65504P347ReservdL;


								private short ip65504P348ReservdS;

								private short ip65504P348ReservdL;


								private short ip65504P349ReservdS;

								private short ip65504P349ReservdL;


								private short ip65504P350ReservdS;

								private short ip65504P350ReservdL;


								private short ip65504P351ReservdS;

								private short ip65504P351ReservdL;


								private short ip65504P352ReservdS;

								private short ip65504P352ReservdL;


								private short ip65504P353ReservdS;

								private short ip65504P353ReservdL;


								private short ip65504P354ReservdS;

								private short ip65504P354ReservdL;


								private short ip65504P355ReservdS;

								private short ip65504P355ReservdL;


								private short ip65504P356ReservdS;

								private short ip65504P356ReservdL;


								private short ip65504P357ReservdS;

								private short ip65504P357ReservdL;


								private short ip65504P358ReservdS;

								private short ip65504P358ReservdL;


								private short ip65504P359ReActvS;

								private short ip65504P359ReActvL;


								private short ip65504P360ReservdS;

								private short ip65504P360ReservdL;


								private short ip65504P361ReservdS;

								private short ip65504P361ReservdL;


								private short ip65504P362ReservdS;

								private short ip65504P362ReservdL;


								private short ip65504P363ReservdS;

								private short ip65504P363ReservdL;


								private short ip65504P364ReservdS;

								private short ip65504P364ReservdL;


								private short ip65504P365ReservdS;

								private short ip65504P365ReservdL;


								private short ip65504P366ReservdS;

								private short ip65504P366ReservdL;


								private short ip65504P367ReservdS;

								private short ip65504P367ReservdL;


								private short ip65504P368ReservdS;

								private short ip65504P368ReservdL;


								private short ip65504P369ReservdS;

								private short ip65504P369ReservdL;


								private short ip65504P370RecRngS;

								private short ip65504P370RecRngL;


								private short ip65504P371RecRegS;

								private short ip65504P371RecRegL;


								private short ip65504P372RecTrxS;

								private short ip65504P372RecTrxL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup12
	**/
    public Ip65504PdsNamesLargeGroup12() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup12. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup12(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P342ReservdS
	 *	@return ip65504P342ReservdS
	 */
	public short getIp65504P342ReservdS() throws CFException {
        if (isIp65504P342ReservdSModified()) { 
           ip65504P342ReservdS = refreshIp65504P342ReservdS();
        }
   		return ip65504P342ReservdS;
	}
	
	/**
	 * 	Update Ip65504P342ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P342-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P342ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P342ReservdS = checkIp65504P342ReservdSMaxLimit(number); 
		serializeIp65504P342ReservdS(ip65504P342ReservdS);
	}

	public void setIp65504P342ReservdS(int number) {
	    number = checkIp65504P342ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P342ReservdS((short)number);
	}
	public void setIp65504P342ReservdS(long number) {
	    number = checkIp65504P342ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P342ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P342ReservdL
	 *	@return ip65504P342ReservdL
	 */
	public short getIp65504P342ReservdL() throws CFException {
        if (isIp65504P342ReservdLModified()) { 
           ip65504P342ReservdL = refreshIp65504P342ReservdL();
        }
   		return ip65504P342ReservdL;
	}
	
	/**
	 * 	Update Ip65504P342ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P342-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P342ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P342ReservdL = checkIp65504P342ReservdLMaxLimit(number); 
		serializeIp65504P342ReservdL(ip65504P342ReservdL);
	}

	public void setIp65504P342ReservdL(int number) {
	    number = checkIp65504P342ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P342ReservdL((short)number);
	}
	public void setIp65504P342ReservdL(long number) {
	    number = checkIp65504P342ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P342ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P343ReservdS
	 *	@return ip65504P343ReservdS
	 */
	public short getIp65504P343ReservdS() throws CFException {
        if (isIp65504P343ReservdSModified()) { 
           ip65504P343ReservdS = refreshIp65504P343ReservdS();
        }
   		return ip65504P343ReservdS;
	}
	
	/**
	 * 	Update Ip65504P343ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P343-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P343ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P343ReservdS = checkIp65504P343ReservdSMaxLimit(number); 
		serializeIp65504P343ReservdS(ip65504P343ReservdS);
	}

	public void setIp65504P343ReservdS(int number) {
	    number = checkIp65504P343ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P343ReservdS((short)number);
	}
	public void setIp65504P343ReservdS(long number) {
	    number = checkIp65504P343ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P343ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P343ReservdL
	 *	@return ip65504P343ReservdL
	 */
	public short getIp65504P343ReservdL() throws CFException {
        if (isIp65504P343ReservdLModified()) { 
           ip65504P343ReservdL = refreshIp65504P343ReservdL();
        }
   		return ip65504P343ReservdL;
	}
	
	/**
	 * 	Update Ip65504P343ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P343-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P343ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P343ReservdL = checkIp65504P343ReservdLMaxLimit(number); 
		serializeIp65504P343ReservdL(ip65504P343ReservdL);
	}

	public void setIp65504P343ReservdL(int number) {
	    number = checkIp65504P343ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P343ReservdL((short)number);
	}
	public void setIp65504P343ReservdL(long number) {
	    number = checkIp65504P343ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P343ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P344ReservdS
	 *	@return ip65504P344ReservdS
	 */
	public short getIp65504P344ReservdS() throws CFException {
        if (isIp65504P344ReservdSModified()) { 
           ip65504P344ReservdS = refreshIp65504P344ReservdS();
        }
   		return ip65504P344ReservdS;
	}
	
	/**
	 * 	Update Ip65504P344ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P344-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P344ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P344ReservdS = checkIp65504P344ReservdSMaxLimit(number); 
		serializeIp65504P344ReservdS(ip65504P344ReservdS);
	}

	public void setIp65504P344ReservdS(int number) {
	    number = checkIp65504P344ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P344ReservdS((short)number);
	}
	public void setIp65504P344ReservdS(long number) {
	    number = checkIp65504P344ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P344ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P344ReservdL
	 *	@return ip65504P344ReservdL
	 */
	public short getIp65504P344ReservdL() throws CFException {
        if (isIp65504P344ReservdLModified()) { 
           ip65504P344ReservdL = refreshIp65504P344ReservdL();
        }
   		return ip65504P344ReservdL;
	}
	
	/**
	 * 	Update Ip65504P344ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P344-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P344ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P344ReservdL = checkIp65504P344ReservdLMaxLimit(number); 
		serializeIp65504P344ReservdL(ip65504P344ReservdL);
	}

	public void setIp65504P344ReservdL(int number) {
	    number = checkIp65504P344ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P344ReservdL((short)number);
	}
	public void setIp65504P344ReservdL(long number) {
	    number = checkIp65504P344ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P344ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P345ReservdS
	 *	@return ip65504P345ReservdS
	 */
	public short getIp65504P345ReservdS() throws CFException {
        if (isIp65504P345ReservdSModified()) { 
           ip65504P345ReservdS = refreshIp65504P345ReservdS();
        }
   		return ip65504P345ReservdS;
	}
	
	/**
	 * 	Update Ip65504P345ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P345-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P345ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P345ReservdS = checkIp65504P345ReservdSMaxLimit(number); 
		serializeIp65504P345ReservdS(ip65504P345ReservdS);
	}

	public void setIp65504P345ReservdS(int number) {
	    number = checkIp65504P345ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P345ReservdS((short)number);
	}
	public void setIp65504P345ReservdS(long number) {
	    number = checkIp65504P345ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P345ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P345ReservdL
	 *	@return ip65504P345ReservdL
	 */
	public short getIp65504P345ReservdL() throws CFException {
        if (isIp65504P345ReservdLModified()) { 
           ip65504P345ReservdL = refreshIp65504P345ReservdL();
        }
   		return ip65504P345ReservdL;
	}
	
	/**
	 * 	Update Ip65504P345ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P345-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P345ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P345ReservdL = checkIp65504P345ReservdLMaxLimit(number); 
		serializeIp65504P345ReservdL(ip65504P345ReservdL);
	}

	public void setIp65504P345ReservdL(int number) {
	    number = checkIp65504P345ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P345ReservdL((short)number);
	}
	public void setIp65504P345ReservdL(long number) {
	    number = checkIp65504P345ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P345ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P346ReservdS
	 *	@return ip65504P346ReservdS
	 */
	public short getIp65504P346ReservdS() throws CFException {
        if (isIp65504P346ReservdSModified()) { 
           ip65504P346ReservdS = refreshIp65504P346ReservdS();
        }
   		return ip65504P346ReservdS;
	}
	
	/**
	 * 	Update Ip65504P346ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P346-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P346ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P346ReservdS = checkIp65504P346ReservdSMaxLimit(number); 
		serializeIp65504P346ReservdS(ip65504P346ReservdS);
	}

	public void setIp65504P346ReservdS(int number) {
	    number = checkIp65504P346ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P346ReservdS((short)number);
	}
	public void setIp65504P346ReservdS(long number) {
	    number = checkIp65504P346ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P346ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P346ReservdL
	 *	@return ip65504P346ReservdL
	 */
	public short getIp65504P346ReservdL() throws CFException {
        if (isIp65504P346ReservdLModified()) { 
           ip65504P346ReservdL = refreshIp65504P346ReservdL();
        }
   		return ip65504P346ReservdL;
	}
	
	/**
	 * 	Update Ip65504P346ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P346-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P346ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P346ReservdL = checkIp65504P346ReservdLMaxLimit(number); 
		serializeIp65504P346ReservdL(ip65504P346ReservdL);
	}

	public void setIp65504P346ReservdL(int number) {
	    number = checkIp65504P346ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P346ReservdL((short)number);
	}
	public void setIp65504P346ReservdL(long number) {
	    number = checkIp65504P346ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P346ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P347ReservdS
	 *	@return ip65504P347ReservdS
	 */
	public short getIp65504P347ReservdS() throws CFException {
        if (isIp65504P347ReservdSModified()) { 
           ip65504P347ReservdS = refreshIp65504P347ReservdS();
        }
   		return ip65504P347ReservdS;
	}
	
	/**
	 * 	Update Ip65504P347ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P347-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P347ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P347ReservdS = checkIp65504P347ReservdSMaxLimit(number); 
		serializeIp65504P347ReservdS(ip65504P347ReservdS);
	}

	public void setIp65504P347ReservdS(int number) {
	    number = checkIp65504P347ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P347ReservdS((short)number);
	}
	public void setIp65504P347ReservdS(long number) {
	    number = checkIp65504P347ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P347ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P347ReservdL
	 *	@return ip65504P347ReservdL
	 */
	public short getIp65504P347ReservdL() throws CFException {
        if (isIp65504P347ReservdLModified()) { 
           ip65504P347ReservdL = refreshIp65504P347ReservdL();
        }
   		return ip65504P347ReservdL;
	}
	
	/**
	 * 	Update Ip65504P347ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P347-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P347ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P347ReservdL = checkIp65504P347ReservdLMaxLimit(number); 
		serializeIp65504P347ReservdL(ip65504P347ReservdL);
	}

	public void setIp65504P347ReservdL(int number) {
	    number = checkIp65504P347ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P347ReservdL((short)number);
	}
	public void setIp65504P347ReservdL(long number) {
	    number = checkIp65504P347ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P347ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P348ReservdS
	 *	@return ip65504P348ReservdS
	 */
	public short getIp65504P348ReservdS() throws CFException {
        if (isIp65504P348ReservdSModified()) { 
           ip65504P348ReservdS = refreshIp65504P348ReservdS();
        }
   		return ip65504P348ReservdS;
	}
	
	/**
	 * 	Update Ip65504P348ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P348-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P348ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P348ReservdS = checkIp65504P348ReservdSMaxLimit(number); 
		serializeIp65504P348ReservdS(ip65504P348ReservdS);
	}

	public void setIp65504P348ReservdS(int number) {
	    number = checkIp65504P348ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P348ReservdS((short)number);
	}
	public void setIp65504P348ReservdS(long number) {
	    number = checkIp65504P348ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P348ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P348ReservdL
	 *	@return ip65504P348ReservdL
	 */
	public short getIp65504P348ReservdL() throws CFException {
        if (isIp65504P348ReservdLModified()) { 
           ip65504P348ReservdL = refreshIp65504P348ReservdL();
        }
   		return ip65504P348ReservdL;
	}
	
	/**
	 * 	Update Ip65504P348ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P348-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P348ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P348ReservdL = checkIp65504P348ReservdLMaxLimit(number); 
		serializeIp65504P348ReservdL(ip65504P348ReservdL);
	}

	public void setIp65504P348ReservdL(int number) {
	    number = checkIp65504P348ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P348ReservdL((short)number);
	}
	public void setIp65504P348ReservdL(long number) {
	    number = checkIp65504P348ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P348ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P349ReservdS
	 *	@return ip65504P349ReservdS
	 */
	public short getIp65504P349ReservdS() throws CFException {
        if (isIp65504P349ReservdSModified()) { 
           ip65504P349ReservdS = refreshIp65504P349ReservdS();
        }
   		return ip65504P349ReservdS;
	}
	
	/**
	 * 	Update Ip65504P349ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P349-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P349ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P349ReservdS = checkIp65504P349ReservdSMaxLimit(number); 
		serializeIp65504P349ReservdS(ip65504P349ReservdS);
	}

	public void setIp65504P349ReservdS(int number) {
	    number = checkIp65504P349ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P349ReservdS((short)number);
	}
	public void setIp65504P349ReservdS(long number) {
	    number = checkIp65504P349ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P349ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P349ReservdL
	 *	@return ip65504P349ReservdL
	 */
	public short getIp65504P349ReservdL() throws CFException {
        if (isIp65504P349ReservdLModified()) { 
           ip65504P349ReservdL = refreshIp65504P349ReservdL();
        }
   		return ip65504P349ReservdL;
	}
	
	/**
	 * 	Update Ip65504P349ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P349-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P349ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P349ReservdL = checkIp65504P349ReservdLMaxLimit(number); 
		serializeIp65504P349ReservdL(ip65504P349ReservdL);
	}

	public void setIp65504P349ReservdL(int number) {
	    number = checkIp65504P349ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P349ReservdL((short)number);
	}
	public void setIp65504P349ReservdL(long number) {
	    number = checkIp65504P349ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P349ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P350ReservdS
	 *	@return ip65504P350ReservdS
	 */
	public short getIp65504P350ReservdS() throws CFException {
        if (isIp65504P350ReservdSModified()) { 
           ip65504P350ReservdS = refreshIp65504P350ReservdS();
        }
   		return ip65504P350ReservdS;
	}
	
	/**
	 * 	Update Ip65504P350ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P350-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P350ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P350ReservdS = checkIp65504P350ReservdSMaxLimit(number); 
		serializeIp65504P350ReservdS(ip65504P350ReservdS);
	}

	public void setIp65504P350ReservdS(int number) {
	    number = checkIp65504P350ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P350ReservdS((short)number);
	}
	public void setIp65504P350ReservdS(long number) {
	    number = checkIp65504P350ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P350ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P350ReservdL
	 *	@return ip65504P350ReservdL
	 */
	public short getIp65504P350ReservdL() throws CFException {
        if (isIp65504P350ReservdLModified()) { 
           ip65504P350ReservdL = refreshIp65504P350ReservdL();
        }
   		return ip65504P350ReservdL;
	}
	
	/**
	 * 	Update Ip65504P350ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P350-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P350ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P350ReservdL = checkIp65504P350ReservdLMaxLimit(number); 
		serializeIp65504P350ReservdL(ip65504P350ReservdL);
	}

	public void setIp65504P350ReservdL(int number) {
	    number = checkIp65504P350ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P350ReservdL((short)number);
	}
	public void setIp65504P350ReservdL(long number) {
	    number = checkIp65504P350ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P350ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P351ReservdS
	 *	@return ip65504P351ReservdS
	 */
	public short getIp65504P351ReservdS() throws CFException {
        if (isIp65504P351ReservdSModified()) { 
           ip65504P351ReservdS = refreshIp65504P351ReservdS();
        }
   		return ip65504P351ReservdS;
	}
	
	/**
	 * 	Update Ip65504P351ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P351-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P351ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P351ReservdS = checkIp65504P351ReservdSMaxLimit(number); 
		serializeIp65504P351ReservdS(ip65504P351ReservdS);
	}

	public void setIp65504P351ReservdS(int number) {
	    number = checkIp65504P351ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P351ReservdS((short)number);
	}
	public void setIp65504P351ReservdS(long number) {
	    number = checkIp65504P351ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P351ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P351ReservdL
	 *	@return ip65504P351ReservdL
	 */
	public short getIp65504P351ReservdL() throws CFException {
        if (isIp65504P351ReservdLModified()) { 
           ip65504P351ReservdL = refreshIp65504P351ReservdL();
        }
   		return ip65504P351ReservdL;
	}
	
	/**
	 * 	Update Ip65504P351ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P351-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P351ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P351ReservdL = checkIp65504P351ReservdLMaxLimit(number); 
		serializeIp65504P351ReservdL(ip65504P351ReservdL);
	}

	public void setIp65504P351ReservdL(int number) {
	    number = checkIp65504P351ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P351ReservdL((short)number);
	}
	public void setIp65504P351ReservdL(long number) {
	    number = checkIp65504P351ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P351ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P352ReservdS
	 *	@return ip65504P352ReservdS
	 */
	public short getIp65504P352ReservdS() throws CFException {
        if (isIp65504P352ReservdSModified()) { 
           ip65504P352ReservdS = refreshIp65504P352ReservdS();
        }
   		return ip65504P352ReservdS;
	}
	
	/**
	 * 	Update Ip65504P352ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P352-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P352ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P352ReservdS = checkIp65504P352ReservdSMaxLimit(number); 
		serializeIp65504P352ReservdS(ip65504P352ReservdS);
	}

	public void setIp65504P352ReservdS(int number) {
	    number = checkIp65504P352ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P352ReservdS((short)number);
	}
	public void setIp65504P352ReservdS(long number) {
	    number = checkIp65504P352ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P352ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P352ReservdL
	 *	@return ip65504P352ReservdL
	 */
	public short getIp65504P352ReservdL() throws CFException {
        if (isIp65504P352ReservdLModified()) { 
           ip65504P352ReservdL = refreshIp65504P352ReservdL();
        }
   		return ip65504P352ReservdL;
	}
	
	/**
	 * 	Update Ip65504P352ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P352-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P352ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P352ReservdL = checkIp65504P352ReservdLMaxLimit(number); 
		serializeIp65504P352ReservdL(ip65504P352ReservdL);
	}

	public void setIp65504P352ReservdL(int number) {
	    number = checkIp65504P352ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P352ReservdL((short)number);
	}
	public void setIp65504P352ReservdL(long number) {
	    number = checkIp65504P352ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P352ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P353ReservdS
	 *	@return ip65504P353ReservdS
	 */
	public short getIp65504P353ReservdS() throws CFException {
        if (isIp65504P353ReservdSModified()) { 
           ip65504P353ReservdS = refreshIp65504P353ReservdS();
        }
   		return ip65504P353ReservdS;
	}
	
	/**
	 * 	Update Ip65504P353ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P353-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P353ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P353ReservdS = checkIp65504P353ReservdSMaxLimit(number); 
		serializeIp65504P353ReservdS(ip65504P353ReservdS);
	}

	public void setIp65504P353ReservdS(int number) {
	    number = checkIp65504P353ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P353ReservdS((short)number);
	}
	public void setIp65504P353ReservdS(long number) {
	    number = checkIp65504P353ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P353ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P353ReservdL
	 *	@return ip65504P353ReservdL
	 */
	public short getIp65504P353ReservdL() throws CFException {
        if (isIp65504P353ReservdLModified()) { 
           ip65504P353ReservdL = refreshIp65504P353ReservdL();
        }
   		return ip65504P353ReservdL;
	}
	
	/**
	 * 	Update Ip65504P353ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P353-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P353ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P353ReservdL = checkIp65504P353ReservdLMaxLimit(number); 
		serializeIp65504P353ReservdL(ip65504P353ReservdL);
	}

	public void setIp65504P353ReservdL(int number) {
	    number = checkIp65504P353ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P353ReservdL((short)number);
	}
	public void setIp65504P353ReservdL(long number) {
	    number = checkIp65504P353ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P353ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P354ReservdS
	 *	@return ip65504P354ReservdS
	 */
	public short getIp65504P354ReservdS() throws CFException {
        if (isIp65504P354ReservdSModified()) { 
           ip65504P354ReservdS = refreshIp65504P354ReservdS();
        }
   		return ip65504P354ReservdS;
	}
	
	/**
	 * 	Update Ip65504P354ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P354-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P354ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P354ReservdS = checkIp65504P354ReservdSMaxLimit(number); 
		serializeIp65504P354ReservdS(ip65504P354ReservdS);
	}

	public void setIp65504P354ReservdS(int number) {
	    number = checkIp65504P354ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P354ReservdS((short)number);
	}
	public void setIp65504P354ReservdS(long number) {
	    number = checkIp65504P354ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P354ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P354ReservdL
	 *	@return ip65504P354ReservdL
	 */
	public short getIp65504P354ReservdL() throws CFException {
        if (isIp65504P354ReservdLModified()) { 
           ip65504P354ReservdL = refreshIp65504P354ReservdL();
        }
   		return ip65504P354ReservdL;
	}
	
	/**
	 * 	Update Ip65504P354ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P354-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P354ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P354ReservdL = checkIp65504P354ReservdLMaxLimit(number); 
		serializeIp65504P354ReservdL(ip65504P354ReservdL);
	}

	public void setIp65504P354ReservdL(int number) {
	    number = checkIp65504P354ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P354ReservdL((short)number);
	}
	public void setIp65504P354ReservdL(long number) {
	    number = checkIp65504P354ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P354ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P355ReservdS
	 *	@return ip65504P355ReservdS
	 */
	public short getIp65504P355ReservdS() throws CFException {
        if (isIp65504P355ReservdSModified()) { 
           ip65504P355ReservdS = refreshIp65504P355ReservdS();
        }
   		return ip65504P355ReservdS;
	}
	
	/**
	 * 	Update Ip65504P355ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P355-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P355ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P355ReservdS = checkIp65504P355ReservdSMaxLimit(number); 
		serializeIp65504P355ReservdS(ip65504P355ReservdS);
	}

	public void setIp65504P355ReservdS(int number) {
	    number = checkIp65504P355ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P355ReservdS((short)number);
	}
	public void setIp65504P355ReservdS(long number) {
	    number = checkIp65504P355ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P355ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P355ReservdL
	 *	@return ip65504P355ReservdL
	 */
	public short getIp65504P355ReservdL() throws CFException {
        if (isIp65504P355ReservdLModified()) { 
           ip65504P355ReservdL = refreshIp65504P355ReservdL();
        }
   		return ip65504P355ReservdL;
	}
	
	/**
	 * 	Update Ip65504P355ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P355-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P355ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P355ReservdL = checkIp65504P355ReservdLMaxLimit(number); 
		serializeIp65504P355ReservdL(ip65504P355ReservdL);
	}

	public void setIp65504P355ReservdL(int number) {
	    number = checkIp65504P355ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P355ReservdL((short)number);
	}
	public void setIp65504P355ReservdL(long number) {
	    number = checkIp65504P355ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P355ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P356ReservdS
	 *	@return ip65504P356ReservdS
	 */
	public short getIp65504P356ReservdS() throws CFException {
        if (isIp65504P356ReservdSModified()) { 
           ip65504P356ReservdS = refreshIp65504P356ReservdS();
        }
   		return ip65504P356ReservdS;
	}
	
	/**
	 * 	Update Ip65504P356ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P356-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P356ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P356ReservdS = checkIp65504P356ReservdSMaxLimit(number); 
		serializeIp65504P356ReservdS(ip65504P356ReservdS);
	}

	public void setIp65504P356ReservdS(int number) {
	    number = checkIp65504P356ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P356ReservdS((short)number);
	}
	public void setIp65504P356ReservdS(long number) {
	    number = checkIp65504P356ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P356ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P356ReservdL
	 *	@return ip65504P356ReservdL
	 */
	public short getIp65504P356ReservdL() throws CFException {
        if (isIp65504P356ReservdLModified()) { 
           ip65504P356ReservdL = refreshIp65504P356ReservdL();
        }
   		return ip65504P356ReservdL;
	}
	
	/**
	 * 	Update Ip65504P356ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P356-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P356ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P356ReservdL = checkIp65504P356ReservdLMaxLimit(number); 
		serializeIp65504P356ReservdL(ip65504P356ReservdL);
	}

	public void setIp65504P356ReservdL(int number) {
	    number = checkIp65504P356ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P356ReservdL((short)number);
	}
	public void setIp65504P356ReservdL(long number) {
	    number = checkIp65504P356ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P356ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P357ReservdS
	 *	@return ip65504P357ReservdS
	 */
	public short getIp65504P357ReservdS() throws CFException {
        if (isIp65504P357ReservdSModified()) { 
           ip65504P357ReservdS = refreshIp65504P357ReservdS();
        }
   		return ip65504P357ReservdS;
	}
	
	/**
	 * 	Update Ip65504P357ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P357-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P357ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P357ReservdS = checkIp65504P357ReservdSMaxLimit(number); 
		serializeIp65504P357ReservdS(ip65504P357ReservdS);
	}

	public void setIp65504P357ReservdS(int number) {
	    number = checkIp65504P357ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P357ReservdS((short)number);
	}
	public void setIp65504P357ReservdS(long number) {
	    number = checkIp65504P357ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P357ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P357ReservdL
	 *	@return ip65504P357ReservdL
	 */
	public short getIp65504P357ReservdL() throws CFException {
        if (isIp65504P357ReservdLModified()) { 
           ip65504P357ReservdL = refreshIp65504P357ReservdL();
        }
   		return ip65504P357ReservdL;
	}
	
	/**
	 * 	Update Ip65504P357ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P357-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P357ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P357ReservdL = checkIp65504P357ReservdLMaxLimit(number); 
		serializeIp65504P357ReservdL(ip65504P357ReservdL);
	}

	public void setIp65504P357ReservdL(int number) {
	    number = checkIp65504P357ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P357ReservdL((short)number);
	}
	public void setIp65504P357ReservdL(long number) {
	    number = checkIp65504P357ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P357ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P358ReservdS
	 *	@return ip65504P358ReservdS
	 */
	public short getIp65504P358ReservdS() throws CFException {
        if (isIp65504P358ReservdSModified()) { 
           ip65504P358ReservdS = refreshIp65504P358ReservdS();
        }
   		return ip65504P358ReservdS;
	}
	
	/**
	 * 	Update Ip65504P358ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P358-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P358ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P358ReservdS = checkIp65504P358ReservdSMaxLimit(number); 
		serializeIp65504P358ReservdS(ip65504P358ReservdS);
	}

	public void setIp65504P358ReservdS(int number) {
	    number = checkIp65504P358ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P358ReservdS((short)number);
	}
	public void setIp65504P358ReservdS(long number) {
	    number = checkIp65504P358ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P358ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P358ReservdL
	 *	@return ip65504P358ReservdL
	 */
	public short getIp65504P358ReservdL() throws CFException {
        if (isIp65504P358ReservdLModified()) { 
           ip65504P358ReservdL = refreshIp65504P358ReservdL();
        }
   		return ip65504P358ReservdL;
	}
	
	/**
	 * 	Update Ip65504P358ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P358-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P358ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P358ReservdL = checkIp65504P358ReservdLMaxLimit(number); 
		serializeIp65504P358ReservdL(ip65504P358ReservdL);
	}

	public void setIp65504P358ReservdL(int number) {
	    number = checkIp65504P358ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P358ReservdL((short)number);
	}
	public void setIp65504P358ReservdL(long number) {
	    number = checkIp65504P358ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P358ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P359ReActvS
	 *	@return ip65504P359ReActvS
	 */
	public short getIp65504P359ReActvS() throws CFException {
        if (isIp65504P359ReActvSModified()) { 
           ip65504P359ReActvS = refreshIp65504P359ReActvS();
        }
   		return ip65504P359ReActvS;
	}
	
	/**
	 * 	Update Ip65504P359ReActvS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P359-RE-ACTV-S
	 *	@param number
	 */
	public void setIp65504P359ReActvS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P359ReActvS = checkIp65504P359ReActvSMaxLimit(number); 
		serializeIp65504P359ReActvS(ip65504P359ReActvS);
	}

	public void setIp65504P359ReActvS(int number) {
	    number = checkIp65504P359ReActvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P359ReActvS((short)number);
	}
	public void setIp65504P359ReActvS(long number) {
	    number = checkIp65504P359ReActvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P359ReActvS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P359ReActvL
	 *	@return ip65504P359ReActvL
	 */
	public short getIp65504P359ReActvL() throws CFException {
        if (isIp65504P359ReActvLModified()) { 
           ip65504P359ReActvL = refreshIp65504P359ReActvL();
        }
   		return ip65504P359ReActvL;
	}
	
	/**
	 * 	Update Ip65504P359ReActvL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P359-RE-ACTV-L
	 *	@param number
	 */
	public void setIp65504P359ReActvL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P359ReActvL = checkIp65504P359ReActvLMaxLimit(number); 
		serializeIp65504P359ReActvL(ip65504P359ReActvL);
	}

	public void setIp65504P359ReActvL(int number) {
	    number = checkIp65504P359ReActvLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P359ReActvL((short)number);
	}
	public void setIp65504P359ReActvL(long number) {
	    number = checkIp65504P359ReActvLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P359ReActvL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P360ReservdS
	 *	@return ip65504P360ReservdS
	 */
	public short getIp65504P360ReservdS() throws CFException {
        if (isIp65504P360ReservdSModified()) { 
           ip65504P360ReservdS = refreshIp65504P360ReservdS();
        }
   		return ip65504P360ReservdS;
	}
	
	/**
	 * 	Update Ip65504P360ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P360-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P360ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P360ReservdS = checkIp65504P360ReservdSMaxLimit(number); 
		serializeIp65504P360ReservdS(ip65504P360ReservdS);
	}

	public void setIp65504P360ReservdS(int number) {
	    number = checkIp65504P360ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P360ReservdS((short)number);
	}
	public void setIp65504P360ReservdS(long number) {
	    number = checkIp65504P360ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P360ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P360ReservdL
	 *	@return ip65504P360ReservdL
	 */
	public short getIp65504P360ReservdL() throws CFException {
        if (isIp65504P360ReservdLModified()) { 
           ip65504P360ReservdL = refreshIp65504P360ReservdL();
        }
   		return ip65504P360ReservdL;
	}
	
	/**
	 * 	Update Ip65504P360ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P360-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P360ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P360ReservdL = checkIp65504P360ReservdLMaxLimit(number); 
		serializeIp65504P360ReservdL(ip65504P360ReservdL);
	}

	public void setIp65504P360ReservdL(int number) {
	    number = checkIp65504P360ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P360ReservdL((short)number);
	}
	public void setIp65504P360ReservdL(long number) {
	    number = checkIp65504P360ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P360ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P361ReservdS
	 *	@return ip65504P361ReservdS
	 */
	public short getIp65504P361ReservdS() throws CFException {
        if (isIp65504P361ReservdSModified()) { 
           ip65504P361ReservdS = refreshIp65504P361ReservdS();
        }
   		return ip65504P361ReservdS;
	}
	
	/**
	 * 	Update Ip65504P361ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P361-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P361ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P361ReservdS = checkIp65504P361ReservdSMaxLimit(number); 
		serializeIp65504P361ReservdS(ip65504P361ReservdS);
	}

	public void setIp65504P361ReservdS(int number) {
	    number = checkIp65504P361ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P361ReservdS((short)number);
	}
	public void setIp65504P361ReservdS(long number) {
	    number = checkIp65504P361ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P361ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P361ReservdL
	 *	@return ip65504P361ReservdL
	 */
	public short getIp65504P361ReservdL() throws CFException {
        if (isIp65504P361ReservdLModified()) { 
           ip65504P361ReservdL = refreshIp65504P361ReservdL();
        }
   		return ip65504P361ReservdL;
	}
	
	/**
	 * 	Update Ip65504P361ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P361-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P361ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P361ReservdL = checkIp65504P361ReservdLMaxLimit(number); 
		serializeIp65504P361ReservdL(ip65504P361ReservdL);
	}

	public void setIp65504P361ReservdL(int number) {
	    number = checkIp65504P361ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P361ReservdL((short)number);
	}
	public void setIp65504P361ReservdL(long number) {
	    number = checkIp65504P361ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P361ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P362ReservdS
	 *	@return ip65504P362ReservdS
	 */
	public short getIp65504P362ReservdS() throws CFException {
        if (isIp65504P362ReservdSModified()) { 
           ip65504P362ReservdS = refreshIp65504P362ReservdS();
        }
   		return ip65504P362ReservdS;
	}
	
	/**
	 * 	Update Ip65504P362ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P362-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P362ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P362ReservdS = checkIp65504P362ReservdSMaxLimit(number); 
		serializeIp65504P362ReservdS(ip65504P362ReservdS);
	}

	public void setIp65504P362ReservdS(int number) {
	    number = checkIp65504P362ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P362ReservdS((short)number);
	}
	public void setIp65504P362ReservdS(long number) {
	    number = checkIp65504P362ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P362ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P362ReservdL
	 *	@return ip65504P362ReservdL
	 */
	public short getIp65504P362ReservdL() throws CFException {
        if (isIp65504P362ReservdLModified()) { 
           ip65504P362ReservdL = refreshIp65504P362ReservdL();
        }
   		return ip65504P362ReservdL;
	}
	
	/**
	 * 	Update Ip65504P362ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P362-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P362ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P362ReservdL = checkIp65504P362ReservdLMaxLimit(number); 
		serializeIp65504P362ReservdL(ip65504P362ReservdL);
	}

	public void setIp65504P362ReservdL(int number) {
	    number = checkIp65504P362ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P362ReservdL((short)number);
	}
	public void setIp65504P362ReservdL(long number) {
	    number = checkIp65504P362ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P362ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P363ReservdS
	 *	@return ip65504P363ReservdS
	 */
	public short getIp65504P363ReservdS() throws CFException {
        if (isIp65504P363ReservdSModified()) { 
           ip65504P363ReservdS = refreshIp65504P363ReservdS();
        }
   		return ip65504P363ReservdS;
	}
	
	/**
	 * 	Update Ip65504P363ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P363-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P363ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P363ReservdS = checkIp65504P363ReservdSMaxLimit(number); 
		serializeIp65504P363ReservdS(ip65504P363ReservdS);
	}

	public void setIp65504P363ReservdS(int number) {
	    number = checkIp65504P363ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P363ReservdS((short)number);
	}
	public void setIp65504P363ReservdS(long number) {
	    number = checkIp65504P363ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P363ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P363ReservdL
	 *	@return ip65504P363ReservdL
	 */
	public short getIp65504P363ReservdL() throws CFException {
        if (isIp65504P363ReservdLModified()) { 
           ip65504P363ReservdL = refreshIp65504P363ReservdL();
        }
   		return ip65504P363ReservdL;
	}
	
	/**
	 * 	Update Ip65504P363ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P363-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P363ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P363ReservdL = checkIp65504P363ReservdLMaxLimit(number); 
		serializeIp65504P363ReservdL(ip65504P363ReservdL);
	}

	public void setIp65504P363ReservdL(int number) {
	    number = checkIp65504P363ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P363ReservdL((short)number);
	}
	public void setIp65504P363ReservdL(long number) {
	    number = checkIp65504P363ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P363ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P364ReservdS
	 *	@return ip65504P364ReservdS
	 */
	public short getIp65504P364ReservdS() throws CFException {
        if (isIp65504P364ReservdSModified()) { 
           ip65504P364ReservdS = refreshIp65504P364ReservdS();
        }
   		return ip65504P364ReservdS;
	}
	
	/**
	 * 	Update Ip65504P364ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P364-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P364ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P364ReservdS = checkIp65504P364ReservdSMaxLimit(number); 
		serializeIp65504P364ReservdS(ip65504P364ReservdS);
	}

	public void setIp65504P364ReservdS(int number) {
	    number = checkIp65504P364ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P364ReservdS((short)number);
	}
	public void setIp65504P364ReservdS(long number) {
	    number = checkIp65504P364ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P364ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P364ReservdL
	 *	@return ip65504P364ReservdL
	 */
	public short getIp65504P364ReservdL() throws CFException {
        if (isIp65504P364ReservdLModified()) { 
           ip65504P364ReservdL = refreshIp65504P364ReservdL();
        }
   		return ip65504P364ReservdL;
	}
	
	/**
	 * 	Update Ip65504P364ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P364-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P364ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P364ReservdL = checkIp65504P364ReservdLMaxLimit(number); 
		serializeIp65504P364ReservdL(ip65504P364ReservdL);
	}

	public void setIp65504P364ReservdL(int number) {
	    number = checkIp65504P364ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P364ReservdL((short)number);
	}
	public void setIp65504P364ReservdL(long number) {
	    number = checkIp65504P364ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P364ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P365ReservdS
	 *	@return ip65504P365ReservdS
	 */
	public short getIp65504P365ReservdS() throws CFException {
        if (isIp65504P365ReservdSModified()) { 
           ip65504P365ReservdS = refreshIp65504P365ReservdS();
        }
   		return ip65504P365ReservdS;
	}
	
	/**
	 * 	Update Ip65504P365ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P365-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P365ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P365ReservdS = checkIp65504P365ReservdSMaxLimit(number); 
		serializeIp65504P365ReservdS(ip65504P365ReservdS);
	}

	public void setIp65504P365ReservdS(int number) {
	    number = checkIp65504P365ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P365ReservdS((short)number);
	}
	public void setIp65504P365ReservdS(long number) {
	    number = checkIp65504P365ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P365ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P365ReservdL
	 *	@return ip65504P365ReservdL
	 */
	public short getIp65504P365ReservdL() throws CFException {
        if (isIp65504P365ReservdLModified()) { 
           ip65504P365ReservdL = refreshIp65504P365ReservdL();
        }
   		return ip65504P365ReservdL;
	}
	
	/**
	 * 	Update Ip65504P365ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P365-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P365ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P365ReservdL = checkIp65504P365ReservdLMaxLimit(number); 
		serializeIp65504P365ReservdL(ip65504P365ReservdL);
	}

	public void setIp65504P365ReservdL(int number) {
	    number = checkIp65504P365ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P365ReservdL((short)number);
	}
	public void setIp65504P365ReservdL(long number) {
	    number = checkIp65504P365ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P365ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P366ReservdS
	 *	@return ip65504P366ReservdS
	 */
	public short getIp65504P366ReservdS() throws CFException {
        if (isIp65504P366ReservdSModified()) { 
           ip65504P366ReservdS = refreshIp65504P366ReservdS();
        }
   		return ip65504P366ReservdS;
	}
	
	/**
	 * 	Update Ip65504P366ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P366-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P366ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P366ReservdS = checkIp65504P366ReservdSMaxLimit(number); 
		serializeIp65504P366ReservdS(ip65504P366ReservdS);
	}

	public void setIp65504P366ReservdS(int number) {
	    number = checkIp65504P366ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P366ReservdS((short)number);
	}
	public void setIp65504P366ReservdS(long number) {
	    number = checkIp65504P366ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P366ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P366ReservdL
	 *	@return ip65504P366ReservdL
	 */
	public short getIp65504P366ReservdL() throws CFException {
        if (isIp65504P366ReservdLModified()) { 
           ip65504P366ReservdL = refreshIp65504P366ReservdL();
        }
   		return ip65504P366ReservdL;
	}
	
	/**
	 * 	Update Ip65504P366ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P366-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P366ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P366ReservdL = checkIp65504P366ReservdLMaxLimit(number); 
		serializeIp65504P366ReservdL(ip65504P366ReservdL);
	}

	public void setIp65504P366ReservdL(int number) {
	    number = checkIp65504P366ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P366ReservdL((short)number);
	}
	public void setIp65504P366ReservdL(long number) {
	    number = checkIp65504P366ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P366ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P367ReservdS
	 *	@return ip65504P367ReservdS
	 */
	public short getIp65504P367ReservdS() throws CFException {
        if (isIp65504P367ReservdSModified()) { 
           ip65504P367ReservdS = refreshIp65504P367ReservdS();
        }
   		return ip65504P367ReservdS;
	}
	
	/**
	 * 	Update Ip65504P367ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P367-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P367ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P367ReservdS = checkIp65504P367ReservdSMaxLimit(number); 
		serializeIp65504P367ReservdS(ip65504P367ReservdS);
	}

	public void setIp65504P367ReservdS(int number) {
	    number = checkIp65504P367ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P367ReservdS((short)number);
	}
	public void setIp65504P367ReservdS(long number) {
	    number = checkIp65504P367ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P367ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P367ReservdL
	 *	@return ip65504P367ReservdL
	 */
	public short getIp65504P367ReservdL() throws CFException {
        if (isIp65504P367ReservdLModified()) { 
           ip65504P367ReservdL = refreshIp65504P367ReservdL();
        }
   		return ip65504P367ReservdL;
	}
	
	/**
	 * 	Update Ip65504P367ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P367-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P367ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P367ReservdL = checkIp65504P367ReservdLMaxLimit(number); 
		serializeIp65504P367ReservdL(ip65504P367ReservdL);
	}

	public void setIp65504P367ReservdL(int number) {
	    number = checkIp65504P367ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P367ReservdL((short)number);
	}
	public void setIp65504P367ReservdL(long number) {
	    number = checkIp65504P367ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P367ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P368ReservdS
	 *	@return ip65504P368ReservdS
	 */
	public short getIp65504P368ReservdS() throws CFException {
        if (isIp65504P368ReservdSModified()) { 
           ip65504P368ReservdS = refreshIp65504P368ReservdS();
        }
   		return ip65504P368ReservdS;
	}
	
	/**
	 * 	Update Ip65504P368ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P368-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P368ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P368ReservdS = checkIp65504P368ReservdSMaxLimit(number); 
		serializeIp65504P368ReservdS(ip65504P368ReservdS);
	}

	public void setIp65504P368ReservdS(int number) {
	    number = checkIp65504P368ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P368ReservdS((short)number);
	}
	public void setIp65504P368ReservdS(long number) {
	    number = checkIp65504P368ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P368ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P368ReservdL
	 *	@return ip65504P368ReservdL
	 */
	public short getIp65504P368ReservdL() throws CFException {
        if (isIp65504P368ReservdLModified()) { 
           ip65504P368ReservdL = refreshIp65504P368ReservdL();
        }
   		return ip65504P368ReservdL;
	}
	
	/**
	 * 	Update Ip65504P368ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P368-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P368ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P368ReservdL = checkIp65504P368ReservdLMaxLimit(number); 
		serializeIp65504P368ReservdL(ip65504P368ReservdL);
	}

	public void setIp65504P368ReservdL(int number) {
	    number = checkIp65504P368ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P368ReservdL((short)number);
	}
	public void setIp65504P368ReservdL(long number) {
	    number = checkIp65504P368ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P368ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P369ReservdS
	 *	@return ip65504P369ReservdS
	 */
	public short getIp65504P369ReservdS() throws CFException {
        if (isIp65504P369ReservdSModified()) { 
           ip65504P369ReservdS = refreshIp65504P369ReservdS();
        }
   		return ip65504P369ReservdS;
	}
	
	/**
	 * 	Update Ip65504P369ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P369-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P369ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P369ReservdS = checkIp65504P369ReservdSMaxLimit(number); 
		serializeIp65504P369ReservdS(ip65504P369ReservdS);
	}

	public void setIp65504P369ReservdS(int number) {
	    number = checkIp65504P369ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P369ReservdS((short)number);
	}
	public void setIp65504P369ReservdS(long number) {
	    number = checkIp65504P369ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P369ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P369ReservdL
	 *	@return ip65504P369ReservdL
	 */
	public short getIp65504P369ReservdL() throws CFException {
        if (isIp65504P369ReservdLModified()) { 
           ip65504P369ReservdL = refreshIp65504P369ReservdL();
        }
   		return ip65504P369ReservdL;
	}
	
	/**
	 * 	Update Ip65504P369ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P369-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P369ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P369ReservdL = checkIp65504P369ReservdLMaxLimit(number); 
		serializeIp65504P369ReservdL(ip65504P369ReservdL);
	}

	public void setIp65504P369ReservdL(int number) {
	    number = checkIp65504P369ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P369ReservdL((short)number);
	}
	public void setIp65504P369ReservdL(long number) {
	    number = checkIp65504P369ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P369ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P370RecRngS
	 *	@return ip65504P370RecRngS
	 */
	public short getIp65504P370RecRngS() throws CFException {
        if (isIp65504P370RecRngSModified()) { 
           ip65504P370RecRngS = refreshIp65504P370RecRngS();
        }
   		return ip65504P370RecRngS;
	}
	
	/**
	 * 	Update Ip65504P370RecRngS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P370-REC-RNG-S
	 *	@param number
	 */
	public void setIp65504P370RecRngS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P370RecRngS = checkIp65504P370RecRngSMaxLimit(number); 
		serializeIp65504P370RecRngS(ip65504P370RecRngS);
	}

	public void setIp65504P370RecRngS(int number) {
	    number = checkIp65504P370RecRngSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P370RecRngS((short)number);
	}
	public void setIp65504P370RecRngS(long number) {
	    number = checkIp65504P370RecRngSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P370RecRngS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P370RecRngL
	 *	@return ip65504P370RecRngL
	 */
	public short getIp65504P370RecRngL() throws CFException {
        if (isIp65504P370RecRngLModified()) { 
           ip65504P370RecRngL = refreshIp65504P370RecRngL();
        }
   		return ip65504P370RecRngL;
	}
	
	/**
	 * 	Update Ip65504P370RecRngL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P370-REC-RNG-L
	 *	@param number
	 */
	public void setIp65504P370RecRngL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P370RecRngL = checkIp65504P370RecRngLMaxLimit(number); 
		serializeIp65504P370RecRngL(ip65504P370RecRngL);
	}

	public void setIp65504P370RecRngL(int number) {
	    number = checkIp65504P370RecRngLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P370RecRngL((short)number);
	}
	public void setIp65504P370RecRngL(long number) {
	    number = checkIp65504P370RecRngLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P370RecRngL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P371RecRegS
	 *	@return ip65504P371RecRegS
	 */
	public short getIp65504P371RecRegS() throws CFException {
        if (isIp65504P371RecRegSModified()) { 
           ip65504P371RecRegS = refreshIp65504P371RecRegS();
        }
   		return ip65504P371RecRegS;
	}
	
	/**
	 * 	Update Ip65504P371RecRegS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P371-REC-REG-S
	 *	@param number
	 */
	public void setIp65504P371RecRegS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P371RecRegS = checkIp65504P371RecRegSMaxLimit(number); 
		serializeIp65504P371RecRegS(ip65504P371RecRegS);
	}

	public void setIp65504P371RecRegS(int number) {
	    number = checkIp65504P371RecRegSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P371RecRegS((short)number);
	}
	public void setIp65504P371RecRegS(long number) {
	    number = checkIp65504P371RecRegSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P371RecRegS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P371RecRegL
	 *	@return ip65504P371RecRegL
	 */
	public short getIp65504P371RecRegL() throws CFException {
        if (isIp65504P371RecRegLModified()) { 
           ip65504P371RecRegL = refreshIp65504P371RecRegL();
        }
   		return ip65504P371RecRegL;
	}
	
	/**
	 * 	Update Ip65504P371RecRegL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P371-REC-REG-L
	 *	@param number
	 */
	public void setIp65504P371RecRegL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P371RecRegL = checkIp65504P371RecRegLMaxLimit(number); 
		serializeIp65504P371RecRegL(ip65504P371RecRegL);
	}

	public void setIp65504P371RecRegL(int number) {
	    number = checkIp65504P371RecRegLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P371RecRegL((short)number);
	}
	public void setIp65504P371RecRegL(long number) {
	    number = checkIp65504P371RecRegLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P371RecRegL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P372RecTrxS
	 *	@return ip65504P372RecTrxS
	 */
	public short getIp65504P372RecTrxS() throws CFException {
        if (isIp65504P372RecTrxSModified()) { 
           ip65504P372RecTrxS = refreshIp65504P372RecTrxS();
        }
   		return ip65504P372RecTrxS;
	}
	
	/**
	 * 	Update Ip65504P372RecTrxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P372-REC-TRX-S
	 *	@param number
	 */
	public void setIp65504P372RecTrxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P372RecTrxS = checkIp65504P372RecTrxSMaxLimit(number); 
		serializeIp65504P372RecTrxS(ip65504P372RecTrxS);
	}

	public void setIp65504P372RecTrxS(int number) {
	    number = checkIp65504P372RecTrxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P372RecTrxS((short)number);
	}
	public void setIp65504P372RecTrxS(long number) {
	    number = checkIp65504P372RecTrxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P372RecTrxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P372RecTrxL
	 *	@return ip65504P372RecTrxL
	 */
	public short getIp65504P372RecTrxL() throws CFException {
        if (isIp65504P372RecTrxLModified()) { 
           ip65504P372RecTrxL = refreshIp65504P372RecTrxL();
        }
   		return ip65504P372RecTrxL;
	}
	
	/**
	 * 	Update Ip65504P372RecTrxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P372-REC-TRX-L
	 *	@param number
	 */
	public void setIp65504P372RecTrxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P372RecTrxL = checkIp65504P372RecTrxLMaxLimit(number); 
		serializeIp65504P372RecTrxL(ip65504P372RecTrxL);
	}

	public void setIp65504P372RecTrxL(int number) {
	    number = checkIp65504P372RecTrxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P372RecTrxL((short)number);
	}
	public void setIp65504P372RecTrxL(long number) {
	    number = checkIp65504P372RecTrxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P372RecTrxL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup12
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P342ReservdS((short)0);
         	setIp65504P342ReservdL((short)0);
         	setIp65504P343ReservdS((short)0);
         	setIp65504P343ReservdL((short)0);
         	setIp65504P344ReservdS((short)0);
         	setIp65504P344ReservdL((short)0);
         	setIp65504P345ReservdS((short)0);
         	setIp65504P345ReservdL((short)0);
         	setIp65504P346ReservdS((short)0);
         	setIp65504P346ReservdL((short)0);
         	setIp65504P347ReservdS((short)0);
         	setIp65504P347ReservdL((short)0);
         	setIp65504P348ReservdS((short)0);
         	setIp65504P348ReservdL((short)0);
         	setIp65504P349ReservdS((short)0);
         	setIp65504P349ReservdL((short)0);
         	setIp65504P350ReservdS((short)0);
         	setIp65504P350ReservdL((short)0);
         	setIp65504P351ReservdS((short)0);
         	setIp65504P351ReservdL((short)0);
         	setIp65504P352ReservdS((short)0);
         	setIp65504P352ReservdL((short)0);
         	setIp65504P353ReservdS((short)0);
         	setIp65504P353ReservdL((short)0);
         	setIp65504P354ReservdS((short)0);
         	setIp65504P354ReservdL((short)0);
         	setIp65504P355ReservdS((short)0);
         	setIp65504P355ReservdL((short)0);
         	setIp65504P356ReservdS((short)0);
         	setIp65504P356ReservdL((short)0);
         	setIp65504P357ReservdS((short)0);
         	setIp65504P357ReservdL((short)0);
         	setIp65504P358ReservdS((short)0);
         	setIp65504P358ReservdL((short)0);
         	setIp65504P359ReActvS((short)0);
         	setIp65504P359ReActvL((short)0);
         	setIp65504P360ReservdS((short)0);
         	setIp65504P360ReservdL((short)0);
         	setIp65504P361ReservdS((short)0);
         	setIp65504P361ReservdL((short)0);
         	setIp65504P362ReservdS((short)0);
         	setIp65504P362ReservdL((short)0);
         	setIp65504P363ReservdS((short)0);
         	setIp65504P363ReservdL((short)0);
         	setIp65504P364ReservdS((short)0);
         	setIp65504P364ReservdL((short)0);
         	setIp65504P365ReservdS((short)0);
         	setIp65504P365ReservdL((short)0);
         	setIp65504P366ReservdS((short)0);
         	setIp65504P366ReservdL((short)0);
         	setIp65504P367ReservdS((short)0);
         	setIp65504P367ReservdL((short)0);
         	setIp65504P368ReservdS((short)0);
         	setIp65504P368ReservdL((short)0);
         	setIp65504P369ReservdS((short)0);
         	setIp65504P369ReservdL((short)0);
         	setIp65504P370RecRngS((short)0);
         	setIp65504P370RecRngL((short)0);
         	setIp65504P371RecRegS((short)0);
         	setIp65504P371RecRegL((short)0);
         	setIp65504P372RecTrxS((short)0);
         	setIp65504P372RecTrxL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup12FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_12_LENGTH;
		}

}
  
