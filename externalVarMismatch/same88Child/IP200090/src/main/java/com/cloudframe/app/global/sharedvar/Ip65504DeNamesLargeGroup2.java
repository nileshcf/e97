package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNamesLargeGroup2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504DeNamesLargeGroup2 extends Ip65504DeNamesLargeGroup2Serialized { 
   

								private short ip65504D32AcqInsS;

								private short ip65504D32AcqInsL;


								private short ip65504D33FwdInsS;

								private short ip65504D33FwdInsL;


								private short ip65504D34PanExtS;

								private short ip65504D34PanExtL;


								private short ip65504D35Track2S;

								private short ip65504D35Track2L;


								private short ip65504D36Track3S;

								private short ip65504D36Track3L;


								private short ip65504D37RetrNoS;

								private short ip65504D37RetrNoL;


								private short ip65504D38AprvcodS;

								private short ip65504D38AprvcodL;


								private short ip65504D39ActnCdS;

								private short ip65504D39ActnCdL;


								private short ip65504D40ServCdS;

								private short ip65504D40ServCdL;


								private short ip65504D41TermIdS;

								private short ip65504D41TermIdL;


								private short ip65504D42CardIdS;

								private short ip65504D42CardIdL;


								private short ip65504D43NmeLocS;

								private short ip65504D43NmeLocL;


								private short ip65504D44AddldatS;

								private short ip65504D44AddldatL;


								private short ip65504D45Track1S;

								private short ip65504D45Track1L;


								private short ip65504D46AmtFeeS;

								private short ip65504D46AmtFeeL;


								private short ip65504D47AddldatS;

								private short ip65504D47AddldatL;


								private short ip65504D48AddldatS;

								private short ip65504D48AddldatL;


								private short ip65504D49TrxCurS;

								private short ip65504D49TrxCurL;


								private short ip65504D50RecCurS;

								private short ip65504D50RecCurL;


								private short ip65504D51BilCurS;

								private short ip65504D51BilCurL;


								private short ip65504D52PinDatS;

								private short ip65504D52PinDatL;


								private short ip65504D53SecCtlS;

								private short ip65504D53SecCtlL;


								private short ip65504D54AddlamtS;

								private short ip65504D54AddlamtL;


								private short ip65504D55IccDatS;

								private short ip65504D55IccDatL;


								private short ip65504D56OrigElS;

								private short ip65504D56OrigElL;


								private short ip65504D57AuthCyS;

								private short ip65504D57AuthCyL;


								private short ip65504D58AuthAgS;

								private short ip65504D58AuthAgL;


								private short ip65504D59TransptS;

								private short ip65504D59TransptL;


								private short ip65504D60ReservdS;

								private short ip65504D60ReservdL;


								private short ip65504D61ReservdS;

								private short ip65504D61ReservdL;


								private short ip65504D62FmtVerS;

								private short ip65504D62FmtVerL;

	
	/**
	* Constructor for Ip65504DeNamesLargeGroup2
	**/
    public Ip65504DeNamesLargeGroup2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeNamesLargeGroup2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504D32AcqInsS
	 *	@return ip65504D32AcqInsS
	 */
	public short getIp65504D32AcqInsS() throws CFException {
        if (isIp65504D32AcqInsSModified()) { 
           ip65504D32AcqInsS = refreshIp65504D32AcqInsS();
        }
   		return ip65504D32AcqInsS;
	}
	
	/**
	 * 	Update Ip65504D32AcqInsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D32-ACQ-INS-S
	 *	@param number
	 */
	public void setIp65504D32AcqInsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D32AcqInsS = checkIp65504D32AcqInsSMaxLimit(number); 
		serializeIp65504D32AcqInsS(ip65504D32AcqInsS);
	}

	public void setIp65504D32AcqInsS(int number) {
	    number = checkIp65504D32AcqInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D32AcqInsS((short)number);
	}
	public void setIp65504D32AcqInsS(long number) {
	    number = checkIp65504D32AcqInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D32AcqInsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D32AcqInsL
	 *	@return ip65504D32AcqInsL
	 */
	public short getIp65504D32AcqInsL() throws CFException {
        if (isIp65504D32AcqInsLModified()) { 
           ip65504D32AcqInsL = refreshIp65504D32AcqInsL();
        }
   		return ip65504D32AcqInsL;
	}
	
	/**
	 * 	Update Ip65504D32AcqInsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D32-ACQ-INS-L
	 *	@param number
	 */
	public void setIp65504D32AcqInsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D32AcqInsL = checkIp65504D32AcqInsLMaxLimit(number); 
		serializeIp65504D32AcqInsL(ip65504D32AcqInsL);
	}

	public void setIp65504D32AcqInsL(int number) {
	    number = checkIp65504D32AcqInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D32AcqInsL((short)number);
	}
	public void setIp65504D32AcqInsL(long number) {
	    number = checkIp65504D32AcqInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D32AcqInsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D33FwdInsS
	 *	@return ip65504D33FwdInsS
	 */
	public short getIp65504D33FwdInsS() throws CFException {
        if (isIp65504D33FwdInsSModified()) { 
           ip65504D33FwdInsS = refreshIp65504D33FwdInsS();
        }
   		return ip65504D33FwdInsS;
	}
	
	/**
	 * 	Update Ip65504D33FwdInsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D33-FWD-INS-S
	 *	@param number
	 */
	public void setIp65504D33FwdInsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D33FwdInsS = checkIp65504D33FwdInsSMaxLimit(number); 
		serializeIp65504D33FwdInsS(ip65504D33FwdInsS);
	}

	public void setIp65504D33FwdInsS(int number) {
	    number = checkIp65504D33FwdInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D33FwdInsS((short)number);
	}
	public void setIp65504D33FwdInsS(long number) {
	    number = checkIp65504D33FwdInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D33FwdInsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D33FwdInsL
	 *	@return ip65504D33FwdInsL
	 */
	public short getIp65504D33FwdInsL() throws CFException {
        if (isIp65504D33FwdInsLModified()) { 
           ip65504D33FwdInsL = refreshIp65504D33FwdInsL();
        }
   		return ip65504D33FwdInsL;
	}
	
	/**
	 * 	Update Ip65504D33FwdInsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D33-FWD-INS-L
	 *	@param number
	 */
	public void setIp65504D33FwdInsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D33FwdInsL = checkIp65504D33FwdInsLMaxLimit(number); 
		serializeIp65504D33FwdInsL(ip65504D33FwdInsL);
	}

	public void setIp65504D33FwdInsL(int number) {
	    number = checkIp65504D33FwdInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D33FwdInsL((short)number);
	}
	public void setIp65504D33FwdInsL(long number) {
	    number = checkIp65504D33FwdInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D33FwdInsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D34PanExtS
	 *	@return ip65504D34PanExtS
	 */
	public short getIp65504D34PanExtS() throws CFException {
        if (isIp65504D34PanExtSModified()) { 
           ip65504D34PanExtS = refreshIp65504D34PanExtS();
        }
   		return ip65504D34PanExtS;
	}
	
	/**
	 * 	Update Ip65504D34PanExtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D34-PAN-EXT-S
	 *	@param number
	 */
	public void setIp65504D34PanExtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D34PanExtS = checkIp65504D34PanExtSMaxLimit(number); 
		serializeIp65504D34PanExtS(ip65504D34PanExtS);
	}

	public void setIp65504D34PanExtS(int number) {
	    number = checkIp65504D34PanExtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D34PanExtS((short)number);
	}
	public void setIp65504D34PanExtS(long number) {
	    number = checkIp65504D34PanExtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D34PanExtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D34PanExtL
	 *	@return ip65504D34PanExtL
	 */
	public short getIp65504D34PanExtL() throws CFException {
        if (isIp65504D34PanExtLModified()) { 
           ip65504D34PanExtL = refreshIp65504D34PanExtL();
        }
   		return ip65504D34PanExtL;
	}
	
	/**
	 * 	Update Ip65504D34PanExtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D34-PAN-EXT-L
	 *	@param number
	 */
	public void setIp65504D34PanExtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D34PanExtL = checkIp65504D34PanExtLMaxLimit(number); 
		serializeIp65504D34PanExtL(ip65504D34PanExtL);
	}

	public void setIp65504D34PanExtL(int number) {
	    number = checkIp65504D34PanExtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D34PanExtL((short)number);
	}
	public void setIp65504D34PanExtL(long number) {
	    number = checkIp65504D34PanExtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D34PanExtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D35Track2S
	 *	@return ip65504D35Track2S
	 */
	public short getIp65504D35Track2S() throws CFException {
        if (isIp65504D35Track2SModified()) { 
           ip65504D35Track2S = refreshIp65504D35Track2S();
        }
   		return ip65504D35Track2S;
	}
	
	/**
	 * 	Update Ip65504D35Track2S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D35-TRACK-2-S
	 *	@param number
	 */
	public void setIp65504D35Track2S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D35Track2S = checkIp65504D35Track2SMaxLimit(number); 
		serializeIp65504D35Track2S(ip65504D35Track2S);
	}

	public void setIp65504D35Track2S(int number) {
	    number = checkIp65504D35Track2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D35Track2S((short)number);
	}
	public void setIp65504D35Track2S(long number) {
	    number = checkIp65504D35Track2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D35Track2S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D35Track2L
	 *	@return ip65504D35Track2L
	 */
	public short getIp65504D35Track2L() throws CFException {
        if (isIp65504D35Track2LModified()) { 
           ip65504D35Track2L = refreshIp65504D35Track2L();
        }
   		return ip65504D35Track2L;
	}
	
	/**
	 * 	Update Ip65504D35Track2L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D35-TRACK-2-L
	 *	@param number
	 */
	public void setIp65504D35Track2L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D35Track2L = checkIp65504D35Track2LMaxLimit(number); 
		serializeIp65504D35Track2L(ip65504D35Track2L);
	}

	public void setIp65504D35Track2L(int number) {
	    number = checkIp65504D35Track2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D35Track2L((short)number);
	}
	public void setIp65504D35Track2L(long number) {
	    number = checkIp65504D35Track2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D35Track2L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D36Track3S
	 *	@return ip65504D36Track3S
	 */
	public short getIp65504D36Track3S() throws CFException {
        if (isIp65504D36Track3SModified()) { 
           ip65504D36Track3S = refreshIp65504D36Track3S();
        }
   		return ip65504D36Track3S;
	}
	
	/**
	 * 	Update Ip65504D36Track3S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D36-TRACK-3-S
	 *	@param number
	 */
	public void setIp65504D36Track3S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D36Track3S = checkIp65504D36Track3SMaxLimit(number); 
		serializeIp65504D36Track3S(ip65504D36Track3S);
	}

	public void setIp65504D36Track3S(int number) {
	    number = checkIp65504D36Track3SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D36Track3S((short)number);
	}
	public void setIp65504D36Track3S(long number) {
	    number = checkIp65504D36Track3SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D36Track3S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D36Track3L
	 *	@return ip65504D36Track3L
	 */
	public short getIp65504D36Track3L() throws CFException {
        if (isIp65504D36Track3LModified()) { 
           ip65504D36Track3L = refreshIp65504D36Track3L();
        }
   		return ip65504D36Track3L;
	}
	
	/**
	 * 	Update Ip65504D36Track3L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D36-TRACK-3-L
	 *	@param number
	 */
	public void setIp65504D36Track3L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D36Track3L = checkIp65504D36Track3LMaxLimit(number); 
		serializeIp65504D36Track3L(ip65504D36Track3L);
	}

	public void setIp65504D36Track3L(int number) {
	    number = checkIp65504D36Track3LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D36Track3L((short)number);
	}
	public void setIp65504D36Track3L(long number) {
	    number = checkIp65504D36Track3LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D36Track3L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D37RetrNoS
	 *	@return ip65504D37RetrNoS
	 */
	public short getIp65504D37RetrNoS() throws CFException {
        if (isIp65504D37RetrNoSModified()) { 
           ip65504D37RetrNoS = refreshIp65504D37RetrNoS();
        }
   		return ip65504D37RetrNoS;
	}
	
	/**
	 * 	Update Ip65504D37RetrNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D37-RETR-NO-S
	 *	@param number
	 */
	public void setIp65504D37RetrNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D37RetrNoS = checkIp65504D37RetrNoSMaxLimit(number); 
		serializeIp65504D37RetrNoS(ip65504D37RetrNoS);
	}

	public void setIp65504D37RetrNoS(int number) {
	    number = checkIp65504D37RetrNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D37RetrNoS((short)number);
	}
	public void setIp65504D37RetrNoS(long number) {
	    number = checkIp65504D37RetrNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D37RetrNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D37RetrNoL
	 *	@return ip65504D37RetrNoL
	 */
	public short getIp65504D37RetrNoL() throws CFException {
        if (isIp65504D37RetrNoLModified()) { 
           ip65504D37RetrNoL = refreshIp65504D37RetrNoL();
        }
   		return ip65504D37RetrNoL;
	}
	
	/**
	 * 	Update Ip65504D37RetrNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D37-RETR-NO-L
	 *	@param number
	 */
	public void setIp65504D37RetrNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D37RetrNoL = checkIp65504D37RetrNoLMaxLimit(number); 
		serializeIp65504D37RetrNoL(ip65504D37RetrNoL);
	}

	public void setIp65504D37RetrNoL(int number) {
	    number = checkIp65504D37RetrNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D37RetrNoL((short)number);
	}
	public void setIp65504D37RetrNoL(long number) {
	    number = checkIp65504D37RetrNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D37RetrNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D38AprvcodS
	 *	@return ip65504D38AprvcodS
	 */
	public short getIp65504D38AprvcodS() throws CFException {
        if (isIp65504D38AprvcodSModified()) { 
           ip65504D38AprvcodS = refreshIp65504D38AprvcodS();
        }
   		return ip65504D38AprvcodS;
	}
	
	/**
	 * 	Update Ip65504D38AprvcodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D38-APRVCOD-S
	 *	@param number
	 */
	public void setIp65504D38AprvcodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D38AprvcodS = checkIp65504D38AprvcodSMaxLimit(number); 
		serializeIp65504D38AprvcodS(ip65504D38AprvcodS);
	}

	public void setIp65504D38AprvcodS(int number) {
	    number = checkIp65504D38AprvcodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D38AprvcodS((short)number);
	}
	public void setIp65504D38AprvcodS(long number) {
	    number = checkIp65504D38AprvcodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D38AprvcodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D38AprvcodL
	 *	@return ip65504D38AprvcodL
	 */
	public short getIp65504D38AprvcodL() throws CFException {
        if (isIp65504D38AprvcodLModified()) { 
           ip65504D38AprvcodL = refreshIp65504D38AprvcodL();
        }
   		return ip65504D38AprvcodL;
	}
	
	/**
	 * 	Update Ip65504D38AprvcodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D38-APRVCOD-L
	 *	@param number
	 */
	public void setIp65504D38AprvcodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D38AprvcodL = checkIp65504D38AprvcodLMaxLimit(number); 
		serializeIp65504D38AprvcodL(ip65504D38AprvcodL);
	}

	public void setIp65504D38AprvcodL(int number) {
	    number = checkIp65504D38AprvcodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D38AprvcodL((short)number);
	}
	public void setIp65504D38AprvcodL(long number) {
	    number = checkIp65504D38AprvcodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D38AprvcodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D39ActnCdS
	 *	@return ip65504D39ActnCdS
	 */
	public short getIp65504D39ActnCdS() throws CFException {
        if (isIp65504D39ActnCdSModified()) { 
           ip65504D39ActnCdS = refreshIp65504D39ActnCdS();
        }
   		return ip65504D39ActnCdS;
	}
	
	/**
	 * 	Update Ip65504D39ActnCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D39-ACTN-CD-S
	 *	@param number
	 */
	public void setIp65504D39ActnCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D39ActnCdS = checkIp65504D39ActnCdSMaxLimit(number); 
		serializeIp65504D39ActnCdS(ip65504D39ActnCdS);
	}

	public void setIp65504D39ActnCdS(int number) {
	    number = checkIp65504D39ActnCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D39ActnCdS((short)number);
	}
	public void setIp65504D39ActnCdS(long number) {
	    number = checkIp65504D39ActnCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D39ActnCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D39ActnCdL
	 *	@return ip65504D39ActnCdL
	 */
	public short getIp65504D39ActnCdL() throws CFException {
        if (isIp65504D39ActnCdLModified()) { 
           ip65504D39ActnCdL = refreshIp65504D39ActnCdL();
        }
   		return ip65504D39ActnCdL;
	}
	
	/**
	 * 	Update Ip65504D39ActnCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D39-ACTN-CD-L
	 *	@param number
	 */
	public void setIp65504D39ActnCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D39ActnCdL = checkIp65504D39ActnCdLMaxLimit(number); 
		serializeIp65504D39ActnCdL(ip65504D39ActnCdL);
	}

	public void setIp65504D39ActnCdL(int number) {
	    number = checkIp65504D39ActnCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D39ActnCdL((short)number);
	}
	public void setIp65504D39ActnCdL(long number) {
	    number = checkIp65504D39ActnCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D39ActnCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D40ServCdS
	 *	@return ip65504D40ServCdS
	 */
	public short getIp65504D40ServCdS() throws CFException {
        if (isIp65504D40ServCdSModified()) { 
           ip65504D40ServCdS = refreshIp65504D40ServCdS();
        }
   		return ip65504D40ServCdS;
	}
	
	/**
	 * 	Update Ip65504D40ServCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D40-SERV-CD-S
	 *	@param number
	 */
	public void setIp65504D40ServCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D40ServCdS = checkIp65504D40ServCdSMaxLimit(number); 
		serializeIp65504D40ServCdS(ip65504D40ServCdS);
	}

	public void setIp65504D40ServCdS(int number) {
	    number = checkIp65504D40ServCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D40ServCdS((short)number);
	}
	public void setIp65504D40ServCdS(long number) {
	    number = checkIp65504D40ServCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D40ServCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D40ServCdL
	 *	@return ip65504D40ServCdL
	 */
	public short getIp65504D40ServCdL() throws CFException {
        if (isIp65504D40ServCdLModified()) { 
           ip65504D40ServCdL = refreshIp65504D40ServCdL();
        }
   		return ip65504D40ServCdL;
	}
	
	/**
	 * 	Update Ip65504D40ServCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D40-SERV-CD-L
	 *	@param number
	 */
	public void setIp65504D40ServCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D40ServCdL = checkIp65504D40ServCdLMaxLimit(number); 
		serializeIp65504D40ServCdL(ip65504D40ServCdL);
	}

	public void setIp65504D40ServCdL(int number) {
	    number = checkIp65504D40ServCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D40ServCdL((short)number);
	}
	public void setIp65504D40ServCdL(long number) {
	    number = checkIp65504D40ServCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D40ServCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D41TermIdS
	 *	@return ip65504D41TermIdS
	 */
	public short getIp65504D41TermIdS() throws CFException {
        if (isIp65504D41TermIdSModified()) { 
           ip65504D41TermIdS = refreshIp65504D41TermIdS();
        }
   		return ip65504D41TermIdS;
	}
	
	/**
	 * 	Update Ip65504D41TermIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D41-TERM-ID-S
	 *	@param number
	 */
	public void setIp65504D41TermIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D41TermIdS = checkIp65504D41TermIdSMaxLimit(number); 
		serializeIp65504D41TermIdS(ip65504D41TermIdS);
	}

	public void setIp65504D41TermIdS(int number) {
	    number = checkIp65504D41TermIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D41TermIdS((short)number);
	}
	public void setIp65504D41TermIdS(long number) {
	    number = checkIp65504D41TermIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D41TermIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D41TermIdL
	 *	@return ip65504D41TermIdL
	 */
	public short getIp65504D41TermIdL() throws CFException {
        if (isIp65504D41TermIdLModified()) { 
           ip65504D41TermIdL = refreshIp65504D41TermIdL();
        }
   		return ip65504D41TermIdL;
	}
	
	/**
	 * 	Update Ip65504D41TermIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D41-TERM-ID-L
	 *	@param number
	 */
	public void setIp65504D41TermIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D41TermIdL = checkIp65504D41TermIdLMaxLimit(number); 
		serializeIp65504D41TermIdL(ip65504D41TermIdL);
	}

	public void setIp65504D41TermIdL(int number) {
	    number = checkIp65504D41TermIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D41TermIdL((short)number);
	}
	public void setIp65504D41TermIdL(long number) {
	    number = checkIp65504D41TermIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D41TermIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D42CardIdS
	 *	@return ip65504D42CardIdS
	 */
	public short getIp65504D42CardIdS() throws CFException {
        if (isIp65504D42CardIdSModified()) { 
           ip65504D42CardIdS = refreshIp65504D42CardIdS();
        }
   		return ip65504D42CardIdS;
	}
	
	/**
	 * 	Update Ip65504D42CardIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D42-CARD-ID-S
	 *	@param number
	 */
	public void setIp65504D42CardIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D42CardIdS = checkIp65504D42CardIdSMaxLimit(number); 
		serializeIp65504D42CardIdS(ip65504D42CardIdS);
	}

	public void setIp65504D42CardIdS(int number) {
	    number = checkIp65504D42CardIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D42CardIdS((short)number);
	}
	public void setIp65504D42CardIdS(long number) {
	    number = checkIp65504D42CardIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D42CardIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D42CardIdL
	 *	@return ip65504D42CardIdL
	 */
	public short getIp65504D42CardIdL() throws CFException {
        if (isIp65504D42CardIdLModified()) { 
           ip65504D42CardIdL = refreshIp65504D42CardIdL();
        }
   		return ip65504D42CardIdL;
	}
	
	/**
	 * 	Update Ip65504D42CardIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D42-CARD-ID-L
	 *	@param number
	 */
	public void setIp65504D42CardIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D42CardIdL = checkIp65504D42CardIdLMaxLimit(number); 
		serializeIp65504D42CardIdL(ip65504D42CardIdL);
	}

	public void setIp65504D42CardIdL(int number) {
	    number = checkIp65504D42CardIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D42CardIdL((short)number);
	}
	public void setIp65504D42CardIdL(long number) {
	    number = checkIp65504D42CardIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D42CardIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D43NmeLocS
	 *	@return ip65504D43NmeLocS
	 */
	public short getIp65504D43NmeLocS() throws CFException {
        if (isIp65504D43NmeLocSModified()) { 
           ip65504D43NmeLocS = refreshIp65504D43NmeLocS();
        }
   		return ip65504D43NmeLocS;
	}
	
	/**
	 * 	Update Ip65504D43NmeLocS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D43-NME-LOC-S
	 *	@param number
	 */
	public void setIp65504D43NmeLocS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D43NmeLocS = checkIp65504D43NmeLocSMaxLimit(number); 
		serializeIp65504D43NmeLocS(ip65504D43NmeLocS);
	}

	public void setIp65504D43NmeLocS(int number) {
	    number = checkIp65504D43NmeLocSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D43NmeLocS((short)number);
	}
	public void setIp65504D43NmeLocS(long number) {
	    number = checkIp65504D43NmeLocSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D43NmeLocS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D43NmeLocL
	 *	@return ip65504D43NmeLocL
	 */
	public short getIp65504D43NmeLocL() throws CFException {
        if (isIp65504D43NmeLocLModified()) { 
           ip65504D43NmeLocL = refreshIp65504D43NmeLocL();
        }
   		return ip65504D43NmeLocL;
	}
	
	/**
	 * 	Update Ip65504D43NmeLocL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D43-NME-LOC-L
	 *	@param number
	 */
	public void setIp65504D43NmeLocL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D43NmeLocL = checkIp65504D43NmeLocLMaxLimit(number); 
		serializeIp65504D43NmeLocL(ip65504D43NmeLocL);
	}

	public void setIp65504D43NmeLocL(int number) {
	    number = checkIp65504D43NmeLocLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D43NmeLocL((short)number);
	}
	public void setIp65504D43NmeLocL(long number) {
	    number = checkIp65504D43NmeLocLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D43NmeLocL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D44AddldatS
	 *	@return ip65504D44AddldatS
	 */
	public short getIp65504D44AddldatS() throws CFException {
        if (isIp65504D44AddldatSModified()) { 
           ip65504D44AddldatS = refreshIp65504D44AddldatS();
        }
   		return ip65504D44AddldatS;
	}
	
	/**
	 * 	Update Ip65504D44AddldatS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D44-ADDLDAT-S
	 *	@param number
	 */
	public void setIp65504D44AddldatS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D44AddldatS = checkIp65504D44AddldatSMaxLimit(number); 
		serializeIp65504D44AddldatS(ip65504D44AddldatS);
	}

	public void setIp65504D44AddldatS(int number) {
	    number = checkIp65504D44AddldatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D44AddldatS((short)number);
	}
	public void setIp65504D44AddldatS(long number) {
	    number = checkIp65504D44AddldatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D44AddldatS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D44AddldatL
	 *	@return ip65504D44AddldatL
	 */
	public short getIp65504D44AddldatL() throws CFException {
        if (isIp65504D44AddldatLModified()) { 
           ip65504D44AddldatL = refreshIp65504D44AddldatL();
        }
   		return ip65504D44AddldatL;
	}
	
	/**
	 * 	Update Ip65504D44AddldatL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D44-ADDLDAT-L
	 *	@param number
	 */
	public void setIp65504D44AddldatL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D44AddldatL = checkIp65504D44AddldatLMaxLimit(number); 
		serializeIp65504D44AddldatL(ip65504D44AddldatL);
	}

	public void setIp65504D44AddldatL(int number) {
	    number = checkIp65504D44AddldatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D44AddldatL((short)number);
	}
	public void setIp65504D44AddldatL(long number) {
	    number = checkIp65504D44AddldatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D44AddldatL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D45Track1S
	 *	@return ip65504D45Track1S
	 */
	public short getIp65504D45Track1S() throws CFException {
        if (isIp65504D45Track1SModified()) { 
           ip65504D45Track1S = refreshIp65504D45Track1S();
        }
   		return ip65504D45Track1S;
	}
	
	/**
	 * 	Update Ip65504D45Track1S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D45-TRACK-1-S
	 *	@param number
	 */
	public void setIp65504D45Track1S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D45Track1S = checkIp65504D45Track1SMaxLimit(number); 
		serializeIp65504D45Track1S(ip65504D45Track1S);
	}

	public void setIp65504D45Track1S(int number) {
	    number = checkIp65504D45Track1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D45Track1S((short)number);
	}
	public void setIp65504D45Track1S(long number) {
	    number = checkIp65504D45Track1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D45Track1S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D45Track1L
	 *	@return ip65504D45Track1L
	 */
	public short getIp65504D45Track1L() throws CFException {
        if (isIp65504D45Track1LModified()) { 
           ip65504D45Track1L = refreshIp65504D45Track1L();
        }
   		return ip65504D45Track1L;
	}
	
	/**
	 * 	Update Ip65504D45Track1L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D45-TRACK-1-L
	 *	@param number
	 */
	public void setIp65504D45Track1L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D45Track1L = checkIp65504D45Track1LMaxLimit(number); 
		serializeIp65504D45Track1L(ip65504D45Track1L);
	}

	public void setIp65504D45Track1L(int number) {
	    number = checkIp65504D45Track1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D45Track1L((short)number);
	}
	public void setIp65504D45Track1L(long number) {
	    number = checkIp65504D45Track1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D45Track1L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D46AmtFeeS
	 *	@return ip65504D46AmtFeeS
	 */
	public short getIp65504D46AmtFeeS() throws CFException {
        if (isIp65504D46AmtFeeSModified()) { 
           ip65504D46AmtFeeS = refreshIp65504D46AmtFeeS();
        }
   		return ip65504D46AmtFeeS;
	}
	
	/**
	 * 	Update Ip65504D46AmtFeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D46-AMT-FEE-S
	 *	@param number
	 */
	public void setIp65504D46AmtFeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D46AmtFeeS = checkIp65504D46AmtFeeSMaxLimit(number); 
		serializeIp65504D46AmtFeeS(ip65504D46AmtFeeS);
	}

	public void setIp65504D46AmtFeeS(int number) {
	    number = checkIp65504D46AmtFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D46AmtFeeS((short)number);
	}
	public void setIp65504D46AmtFeeS(long number) {
	    number = checkIp65504D46AmtFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D46AmtFeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D46AmtFeeL
	 *	@return ip65504D46AmtFeeL
	 */
	public short getIp65504D46AmtFeeL() throws CFException {
        if (isIp65504D46AmtFeeLModified()) { 
           ip65504D46AmtFeeL = refreshIp65504D46AmtFeeL();
        }
   		return ip65504D46AmtFeeL;
	}
	
	/**
	 * 	Update Ip65504D46AmtFeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D46-AMT-FEE-L
	 *	@param number
	 */
	public void setIp65504D46AmtFeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D46AmtFeeL = checkIp65504D46AmtFeeLMaxLimit(number); 
		serializeIp65504D46AmtFeeL(ip65504D46AmtFeeL);
	}

	public void setIp65504D46AmtFeeL(int number) {
	    number = checkIp65504D46AmtFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D46AmtFeeL((short)number);
	}
	public void setIp65504D46AmtFeeL(long number) {
	    number = checkIp65504D46AmtFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D46AmtFeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D47AddldatS
	 *	@return ip65504D47AddldatS
	 */
	public short getIp65504D47AddldatS() throws CFException {
        if (isIp65504D47AddldatSModified()) { 
           ip65504D47AddldatS = refreshIp65504D47AddldatS();
        }
   		return ip65504D47AddldatS;
	}
	
	/**
	 * 	Update Ip65504D47AddldatS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D47-ADDLDAT-S
	 *	@param number
	 */
	public void setIp65504D47AddldatS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D47AddldatS = checkIp65504D47AddldatSMaxLimit(number); 
		serializeIp65504D47AddldatS(ip65504D47AddldatS);
	}

	public void setIp65504D47AddldatS(int number) {
	    number = checkIp65504D47AddldatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D47AddldatS((short)number);
	}
	public void setIp65504D47AddldatS(long number) {
	    number = checkIp65504D47AddldatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D47AddldatS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D47AddldatL
	 *	@return ip65504D47AddldatL
	 */
	public short getIp65504D47AddldatL() throws CFException {
        if (isIp65504D47AddldatLModified()) { 
           ip65504D47AddldatL = refreshIp65504D47AddldatL();
        }
   		return ip65504D47AddldatL;
	}
	
	/**
	 * 	Update Ip65504D47AddldatL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D47-ADDLDAT-L
	 *	@param number
	 */
	public void setIp65504D47AddldatL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D47AddldatL = checkIp65504D47AddldatLMaxLimit(number); 
		serializeIp65504D47AddldatL(ip65504D47AddldatL);
	}

	public void setIp65504D47AddldatL(int number) {
	    number = checkIp65504D47AddldatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D47AddldatL((short)number);
	}
	public void setIp65504D47AddldatL(long number) {
	    number = checkIp65504D47AddldatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D47AddldatL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D48AddldatS
	 *	@return ip65504D48AddldatS
	 */
	public short getIp65504D48AddldatS() throws CFException {
        if (isIp65504D48AddldatSModified()) { 
           ip65504D48AddldatS = refreshIp65504D48AddldatS();
        }
   		return ip65504D48AddldatS;
	}
	
	/**
	 * 	Update Ip65504D48AddldatS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D48-ADDLDAT-S
	 *	@param number
	 */
	public void setIp65504D48AddldatS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D48AddldatS = checkIp65504D48AddldatSMaxLimit(number); 
		serializeIp65504D48AddldatS(ip65504D48AddldatS);
	}

	public void setIp65504D48AddldatS(int number) {
	    number = checkIp65504D48AddldatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D48AddldatS((short)number);
	}
	public void setIp65504D48AddldatS(long number) {
	    number = checkIp65504D48AddldatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D48AddldatS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D48AddldatL
	 *	@return ip65504D48AddldatL
	 */
	public short getIp65504D48AddldatL() throws CFException {
        if (isIp65504D48AddldatLModified()) { 
           ip65504D48AddldatL = refreshIp65504D48AddldatL();
        }
   		return ip65504D48AddldatL;
	}
	
	/**
	 * 	Update Ip65504D48AddldatL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D48-ADDLDAT-L
	 *	@param number
	 */
	public void setIp65504D48AddldatL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D48AddldatL = checkIp65504D48AddldatLMaxLimit(number); 
		serializeIp65504D48AddldatL(ip65504D48AddldatL);
	}

	public void setIp65504D48AddldatL(int number) {
	    number = checkIp65504D48AddldatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D48AddldatL((short)number);
	}
	public void setIp65504D48AddldatL(long number) {
	    number = checkIp65504D48AddldatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D48AddldatL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D49TrxCurS
	 *	@return ip65504D49TrxCurS
	 */
	public short getIp65504D49TrxCurS() throws CFException {
        if (isIp65504D49TrxCurSModified()) { 
           ip65504D49TrxCurS = refreshIp65504D49TrxCurS();
        }
   		return ip65504D49TrxCurS;
	}
	
	/**
	 * 	Update Ip65504D49TrxCurS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D49-TRX-CUR-S
	 *	@param number
	 */
	public void setIp65504D49TrxCurS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D49TrxCurS = checkIp65504D49TrxCurSMaxLimit(number); 
		serializeIp65504D49TrxCurS(ip65504D49TrxCurS);
	}

	public void setIp65504D49TrxCurS(int number) {
	    number = checkIp65504D49TrxCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D49TrxCurS((short)number);
	}
	public void setIp65504D49TrxCurS(long number) {
	    number = checkIp65504D49TrxCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D49TrxCurS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D49TrxCurL
	 *	@return ip65504D49TrxCurL
	 */
	public short getIp65504D49TrxCurL() throws CFException {
        if (isIp65504D49TrxCurLModified()) { 
           ip65504D49TrxCurL = refreshIp65504D49TrxCurL();
        }
   		return ip65504D49TrxCurL;
	}
	
	/**
	 * 	Update Ip65504D49TrxCurL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D49-TRX-CUR-L
	 *	@param number
	 */
	public void setIp65504D49TrxCurL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D49TrxCurL = checkIp65504D49TrxCurLMaxLimit(number); 
		serializeIp65504D49TrxCurL(ip65504D49TrxCurL);
	}

	public void setIp65504D49TrxCurL(int number) {
	    number = checkIp65504D49TrxCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D49TrxCurL((short)number);
	}
	public void setIp65504D49TrxCurL(long number) {
	    number = checkIp65504D49TrxCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D49TrxCurL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D50RecCurS
	 *	@return ip65504D50RecCurS
	 */
	public short getIp65504D50RecCurS() throws CFException {
        if (isIp65504D50RecCurSModified()) { 
           ip65504D50RecCurS = refreshIp65504D50RecCurS();
        }
   		return ip65504D50RecCurS;
	}
	
	/**
	 * 	Update Ip65504D50RecCurS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D50-REC-CUR-S
	 *	@param number
	 */
	public void setIp65504D50RecCurS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D50RecCurS = checkIp65504D50RecCurSMaxLimit(number); 
		serializeIp65504D50RecCurS(ip65504D50RecCurS);
	}

	public void setIp65504D50RecCurS(int number) {
	    number = checkIp65504D50RecCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D50RecCurS((short)number);
	}
	public void setIp65504D50RecCurS(long number) {
	    number = checkIp65504D50RecCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D50RecCurS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D50RecCurL
	 *	@return ip65504D50RecCurL
	 */
	public short getIp65504D50RecCurL() throws CFException {
        if (isIp65504D50RecCurLModified()) { 
           ip65504D50RecCurL = refreshIp65504D50RecCurL();
        }
   		return ip65504D50RecCurL;
	}
	
	/**
	 * 	Update Ip65504D50RecCurL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D50-REC-CUR-L
	 *	@param number
	 */
	public void setIp65504D50RecCurL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D50RecCurL = checkIp65504D50RecCurLMaxLimit(number); 
		serializeIp65504D50RecCurL(ip65504D50RecCurL);
	}

	public void setIp65504D50RecCurL(int number) {
	    number = checkIp65504D50RecCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D50RecCurL((short)number);
	}
	public void setIp65504D50RecCurL(long number) {
	    number = checkIp65504D50RecCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D50RecCurL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D51BilCurS
	 *	@return ip65504D51BilCurS
	 */
	public short getIp65504D51BilCurS() throws CFException {
        if (isIp65504D51BilCurSModified()) { 
           ip65504D51BilCurS = refreshIp65504D51BilCurS();
        }
   		return ip65504D51BilCurS;
	}
	
	/**
	 * 	Update Ip65504D51BilCurS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D51-BIL-CUR-S
	 *	@param number
	 */
	public void setIp65504D51BilCurS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D51BilCurS = checkIp65504D51BilCurSMaxLimit(number); 
		serializeIp65504D51BilCurS(ip65504D51BilCurS);
	}

	public void setIp65504D51BilCurS(int number) {
	    number = checkIp65504D51BilCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D51BilCurS((short)number);
	}
	public void setIp65504D51BilCurS(long number) {
	    number = checkIp65504D51BilCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D51BilCurS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D51BilCurL
	 *	@return ip65504D51BilCurL
	 */
	public short getIp65504D51BilCurL() throws CFException {
        if (isIp65504D51BilCurLModified()) { 
           ip65504D51BilCurL = refreshIp65504D51BilCurL();
        }
   		return ip65504D51BilCurL;
	}
	
	/**
	 * 	Update Ip65504D51BilCurL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D51-BIL-CUR-L
	 *	@param number
	 */
	public void setIp65504D51BilCurL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D51BilCurL = checkIp65504D51BilCurLMaxLimit(number); 
		serializeIp65504D51BilCurL(ip65504D51BilCurL);
	}

	public void setIp65504D51BilCurL(int number) {
	    number = checkIp65504D51BilCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D51BilCurL((short)number);
	}
	public void setIp65504D51BilCurL(long number) {
	    number = checkIp65504D51BilCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D51BilCurL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D52PinDatS
	 *	@return ip65504D52PinDatS
	 */
	public short getIp65504D52PinDatS() throws CFException {
        if (isIp65504D52PinDatSModified()) { 
           ip65504D52PinDatS = refreshIp65504D52PinDatS();
        }
   		return ip65504D52PinDatS;
	}
	
	/**
	 * 	Update Ip65504D52PinDatS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D52-PIN-DAT-S
	 *	@param number
	 */
	public void setIp65504D52PinDatS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D52PinDatS = checkIp65504D52PinDatSMaxLimit(number); 
		serializeIp65504D52PinDatS(ip65504D52PinDatS);
	}

	public void setIp65504D52PinDatS(int number) {
	    number = checkIp65504D52PinDatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D52PinDatS((short)number);
	}
	public void setIp65504D52PinDatS(long number) {
	    number = checkIp65504D52PinDatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D52PinDatS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D52PinDatL
	 *	@return ip65504D52PinDatL
	 */
	public short getIp65504D52PinDatL() throws CFException {
        if (isIp65504D52PinDatLModified()) { 
           ip65504D52PinDatL = refreshIp65504D52PinDatL();
        }
   		return ip65504D52PinDatL;
	}
	
	/**
	 * 	Update Ip65504D52PinDatL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D52-PIN-DAT-L
	 *	@param number
	 */
	public void setIp65504D52PinDatL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D52PinDatL = checkIp65504D52PinDatLMaxLimit(number); 
		serializeIp65504D52PinDatL(ip65504D52PinDatL);
	}

	public void setIp65504D52PinDatL(int number) {
	    number = checkIp65504D52PinDatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D52PinDatL((short)number);
	}
	public void setIp65504D52PinDatL(long number) {
	    number = checkIp65504D52PinDatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D52PinDatL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D53SecCtlS
	 *	@return ip65504D53SecCtlS
	 */
	public short getIp65504D53SecCtlS() throws CFException {
        if (isIp65504D53SecCtlSModified()) { 
           ip65504D53SecCtlS = refreshIp65504D53SecCtlS();
        }
   		return ip65504D53SecCtlS;
	}
	
	/**
	 * 	Update Ip65504D53SecCtlS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D53-SEC-CTL-S
	 *	@param number
	 */
	public void setIp65504D53SecCtlS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D53SecCtlS = checkIp65504D53SecCtlSMaxLimit(number); 
		serializeIp65504D53SecCtlS(ip65504D53SecCtlS);
	}

	public void setIp65504D53SecCtlS(int number) {
	    number = checkIp65504D53SecCtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D53SecCtlS((short)number);
	}
	public void setIp65504D53SecCtlS(long number) {
	    number = checkIp65504D53SecCtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D53SecCtlS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D53SecCtlL
	 *	@return ip65504D53SecCtlL
	 */
	public short getIp65504D53SecCtlL() throws CFException {
        if (isIp65504D53SecCtlLModified()) { 
           ip65504D53SecCtlL = refreshIp65504D53SecCtlL();
        }
   		return ip65504D53SecCtlL;
	}
	
	/**
	 * 	Update Ip65504D53SecCtlL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D53-SEC-CTL-L
	 *	@param number
	 */
	public void setIp65504D53SecCtlL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D53SecCtlL = checkIp65504D53SecCtlLMaxLimit(number); 
		serializeIp65504D53SecCtlL(ip65504D53SecCtlL);
	}

	public void setIp65504D53SecCtlL(int number) {
	    number = checkIp65504D53SecCtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D53SecCtlL((short)number);
	}
	public void setIp65504D53SecCtlL(long number) {
	    number = checkIp65504D53SecCtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D53SecCtlL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D54AddlamtS
	 *	@return ip65504D54AddlamtS
	 */
	public short getIp65504D54AddlamtS() throws CFException {
        if (isIp65504D54AddlamtSModified()) { 
           ip65504D54AddlamtS = refreshIp65504D54AddlamtS();
        }
   		return ip65504D54AddlamtS;
	}
	
	/**
	 * 	Update Ip65504D54AddlamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D54-ADDLAMT-S
	 *	@param number
	 */
	public void setIp65504D54AddlamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D54AddlamtS = checkIp65504D54AddlamtSMaxLimit(number); 
		serializeIp65504D54AddlamtS(ip65504D54AddlamtS);
	}

	public void setIp65504D54AddlamtS(int number) {
	    number = checkIp65504D54AddlamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D54AddlamtS((short)number);
	}
	public void setIp65504D54AddlamtS(long number) {
	    number = checkIp65504D54AddlamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D54AddlamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D54AddlamtL
	 *	@return ip65504D54AddlamtL
	 */
	public short getIp65504D54AddlamtL() throws CFException {
        if (isIp65504D54AddlamtLModified()) { 
           ip65504D54AddlamtL = refreshIp65504D54AddlamtL();
        }
   		return ip65504D54AddlamtL;
	}
	
	/**
	 * 	Update Ip65504D54AddlamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D54-ADDLAMT-L
	 *	@param number
	 */
	public void setIp65504D54AddlamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D54AddlamtL = checkIp65504D54AddlamtLMaxLimit(number); 
		serializeIp65504D54AddlamtL(ip65504D54AddlamtL);
	}

	public void setIp65504D54AddlamtL(int number) {
	    number = checkIp65504D54AddlamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D54AddlamtL((short)number);
	}
	public void setIp65504D54AddlamtL(long number) {
	    number = checkIp65504D54AddlamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D54AddlamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D55IccDatS
	 *	@return ip65504D55IccDatS
	 */
	public short getIp65504D55IccDatS() throws CFException {
        if (isIp65504D55IccDatSModified()) { 
           ip65504D55IccDatS = refreshIp65504D55IccDatS();
        }
   		return ip65504D55IccDatS;
	}
	
	/**
	 * 	Update Ip65504D55IccDatS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D55-ICC-DAT-S
	 *	@param number
	 */
	public void setIp65504D55IccDatS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D55IccDatS = checkIp65504D55IccDatSMaxLimit(number); 
		serializeIp65504D55IccDatS(ip65504D55IccDatS);
	}

	public void setIp65504D55IccDatS(int number) {
	    number = checkIp65504D55IccDatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D55IccDatS((short)number);
	}
	public void setIp65504D55IccDatS(long number) {
	    number = checkIp65504D55IccDatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D55IccDatS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D55IccDatL
	 *	@return ip65504D55IccDatL
	 */
	public short getIp65504D55IccDatL() throws CFException {
        if (isIp65504D55IccDatLModified()) { 
           ip65504D55IccDatL = refreshIp65504D55IccDatL();
        }
   		return ip65504D55IccDatL;
	}
	
	/**
	 * 	Update Ip65504D55IccDatL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D55-ICC-DAT-L
	 *	@param number
	 */
	public void setIp65504D55IccDatL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D55IccDatL = checkIp65504D55IccDatLMaxLimit(number); 
		serializeIp65504D55IccDatL(ip65504D55IccDatL);
	}

	public void setIp65504D55IccDatL(int number) {
	    number = checkIp65504D55IccDatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D55IccDatL((short)number);
	}
	public void setIp65504D55IccDatL(long number) {
	    number = checkIp65504D55IccDatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D55IccDatL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D56OrigElS
	 *	@return ip65504D56OrigElS
	 */
	public short getIp65504D56OrigElS() throws CFException {
        if (isIp65504D56OrigElSModified()) { 
           ip65504D56OrigElS = refreshIp65504D56OrigElS();
        }
   		return ip65504D56OrigElS;
	}
	
	/**
	 * 	Update Ip65504D56OrigElS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D56-ORIG-EL-S
	 *	@param number
	 */
	public void setIp65504D56OrigElS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D56OrigElS = checkIp65504D56OrigElSMaxLimit(number); 
		serializeIp65504D56OrigElS(ip65504D56OrigElS);
	}

	public void setIp65504D56OrigElS(int number) {
	    number = checkIp65504D56OrigElSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D56OrigElS((short)number);
	}
	public void setIp65504D56OrigElS(long number) {
	    number = checkIp65504D56OrigElSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D56OrigElS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D56OrigElL
	 *	@return ip65504D56OrigElL
	 */
	public short getIp65504D56OrigElL() throws CFException {
        if (isIp65504D56OrigElLModified()) { 
           ip65504D56OrigElL = refreshIp65504D56OrigElL();
        }
   		return ip65504D56OrigElL;
	}
	
	/**
	 * 	Update Ip65504D56OrigElL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D56-ORIG-EL-L
	 *	@param number
	 */
	public void setIp65504D56OrigElL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D56OrigElL = checkIp65504D56OrigElLMaxLimit(number); 
		serializeIp65504D56OrigElL(ip65504D56OrigElL);
	}

	public void setIp65504D56OrigElL(int number) {
	    number = checkIp65504D56OrigElLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D56OrigElL((short)number);
	}
	public void setIp65504D56OrigElL(long number) {
	    number = checkIp65504D56OrigElLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D56OrigElL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D57AuthCyS
	 *	@return ip65504D57AuthCyS
	 */
	public short getIp65504D57AuthCyS() throws CFException {
        if (isIp65504D57AuthCySModified()) { 
           ip65504D57AuthCyS = refreshIp65504D57AuthCyS();
        }
   		return ip65504D57AuthCyS;
	}
	
	/**
	 * 	Update Ip65504D57AuthCyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D57-AUTH-CY-S
	 *	@param number
	 */
	public void setIp65504D57AuthCyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D57AuthCyS = checkIp65504D57AuthCySMaxLimit(number); 
		serializeIp65504D57AuthCyS(ip65504D57AuthCyS);
	}

	public void setIp65504D57AuthCyS(int number) {
	    number = checkIp65504D57AuthCySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D57AuthCyS((short)number);
	}
	public void setIp65504D57AuthCyS(long number) {
	    number = checkIp65504D57AuthCySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D57AuthCyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D57AuthCyL
	 *	@return ip65504D57AuthCyL
	 */
	public short getIp65504D57AuthCyL() throws CFException {
        if (isIp65504D57AuthCyLModified()) { 
           ip65504D57AuthCyL = refreshIp65504D57AuthCyL();
        }
   		return ip65504D57AuthCyL;
	}
	
	/**
	 * 	Update Ip65504D57AuthCyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D57-AUTH-CY-L
	 *	@param number
	 */
	public void setIp65504D57AuthCyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D57AuthCyL = checkIp65504D57AuthCyLMaxLimit(number); 
		serializeIp65504D57AuthCyL(ip65504D57AuthCyL);
	}

	public void setIp65504D57AuthCyL(int number) {
	    number = checkIp65504D57AuthCyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D57AuthCyL((short)number);
	}
	public void setIp65504D57AuthCyL(long number) {
	    number = checkIp65504D57AuthCyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D57AuthCyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D58AuthAgS
	 *	@return ip65504D58AuthAgS
	 */
	public short getIp65504D58AuthAgS() throws CFException {
        if (isIp65504D58AuthAgSModified()) { 
           ip65504D58AuthAgS = refreshIp65504D58AuthAgS();
        }
   		return ip65504D58AuthAgS;
	}
	
	/**
	 * 	Update Ip65504D58AuthAgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D58-AUTH-AG-S
	 *	@param number
	 */
	public void setIp65504D58AuthAgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D58AuthAgS = checkIp65504D58AuthAgSMaxLimit(number); 
		serializeIp65504D58AuthAgS(ip65504D58AuthAgS);
	}

	public void setIp65504D58AuthAgS(int number) {
	    number = checkIp65504D58AuthAgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D58AuthAgS((short)number);
	}
	public void setIp65504D58AuthAgS(long number) {
	    number = checkIp65504D58AuthAgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D58AuthAgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D58AuthAgL
	 *	@return ip65504D58AuthAgL
	 */
	public short getIp65504D58AuthAgL() throws CFException {
        if (isIp65504D58AuthAgLModified()) { 
           ip65504D58AuthAgL = refreshIp65504D58AuthAgL();
        }
   		return ip65504D58AuthAgL;
	}
	
	/**
	 * 	Update Ip65504D58AuthAgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D58-AUTH-AG-L
	 *	@param number
	 */
	public void setIp65504D58AuthAgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D58AuthAgL = checkIp65504D58AuthAgLMaxLimit(number); 
		serializeIp65504D58AuthAgL(ip65504D58AuthAgL);
	}

	public void setIp65504D58AuthAgL(int number) {
	    number = checkIp65504D58AuthAgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D58AuthAgL((short)number);
	}
	public void setIp65504D58AuthAgL(long number) {
	    number = checkIp65504D58AuthAgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D58AuthAgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D59TransptS
	 *	@return ip65504D59TransptS
	 */
	public short getIp65504D59TransptS() throws CFException {
        if (isIp65504D59TransptSModified()) { 
           ip65504D59TransptS = refreshIp65504D59TransptS();
        }
   		return ip65504D59TransptS;
	}
	
	/**
	 * 	Update Ip65504D59TransptS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D59-TRANSPT-S
	 *	@param number
	 */
	public void setIp65504D59TransptS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D59TransptS = checkIp65504D59TransptSMaxLimit(number); 
		serializeIp65504D59TransptS(ip65504D59TransptS);
	}

	public void setIp65504D59TransptS(int number) {
	    number = checkIp65504D59TransptSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D59TransptS((short)number);
	}
	public void setIp65504D59TransptS(long number) {
	    number = checkIp65504D59TransptSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D59TransptS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D59TransptL
	 *	@return ip65504D59TransptL
	 */
	public short getIp65504D59TransptL() throws CFException {
        if (isIp65504D59TransptLModified()) { 
           ip65504D59TransptL = refreshIp65504D59TransptL();
        }
   		return ip65504D59TransptL;
	}
	
	/**
	 * 	Update Ip65504D59TransptL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D59-TRANSPT-L
	 *	@param number
	 */
	public void setIp65504D59TransptL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D59TransptL = checkIp65504D59TransptLMaxLimit(number); 
		serializeIp65504D59TransptL(ip65504D59TransptL);
	}

	public void setIp65504D59TransptL(int number) {
	    number = checkIp65504D59TransptLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D59TransptL((short)number);
	}
	public void setIp65504D59TransptL(long number) {
	    number = checkIp65504D59TransptLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D59TransptL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D60ReservdS
	 *	@return ip65504D60ReservdS
	 */
	public short getIp65504D60ReservdS() throws CFException {
        if (isIp65504D60ReservdSModified()) { 
           ip65504D60ReservdS = refreshIp65504D60ReservdS();
        }
   		return ip65504D60ReservdS;
	}
	
	/**
	 * 	Update Ip65504D60ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D60-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D60ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D60ReservdS = checkIp65504D60ReservdSMaxLimit(number); 
		serializeIp65504D60ReservdS(ip65504D60ReservdS);
	}

	public void setIp65504D60ReservdS(int number) {
	    number = checkIp65504D60ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D60ReservdS((short)number);
	}
	public void setIp65504D60ReservdS(long number) {
	    number = checkIp65504D60ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D60ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D60ReservdL
	 *	@return ip65504D60ReservdL
	 */
	public short getIp65504D60ReservdL() throws CFException {
        if (isIp65504D60ReservdLModified()) { 
           ip65504D60ReservdL = refreshIp65504D60ReservdL();
        }
   		return ip65504D60ReservdL;
	}
	
	/**
	 * 	Update Ip65504D60ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D60-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D60ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D60ReservdL = checkIp65504D60ReservdLMaxLimit(number); 
		serializeIp65504D60ReservdL(ip65504D60ReservdL);
	}

	public void setIp65504D60ReservdL(int number) {
	    number = checkIp65504D60ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D60ReservdL((short)number);
	}
	public void setIp65504D60ReservdL(long number) {
	    number = checkIp65504D60ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D60ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D61ReservdS
	 *	@return ip65504D61ReservdS
	 */
	public short getIp65504D61ReservdS() throws CFException {
        if (isIp65504D61ReservdSModified()) { 
           ip65504D61ReservdS = refreshIp65504D61ReservdS();
        }
   		return ip65504D61ReservdS;
	}
	
	/**
	 * 	Update Ip65504D61ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D61-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D61ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D61ReservdS = checkIp65504D61ReservdSMaxLimit(number); 
		serializeIp65504D61ReservdS(ip65504D61ReservdS);
	}

	public void setIp65504D61ReservdS(int number) {
	    number = checkIp65504D61ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D61ReservdS((short)number);
	}
	public void setIp65504D61ReservdS(long number) {
	    number = checkIp65504D61ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D61ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D61ReservdL
	 *	@return ip65504D61ReservdL
	 */
	public short getIp65504D61ReservdL() throws CFException {
        if (isIp65504D61ReservdLModified()) { 
           ip65504D61ReservdL = refreshIp65504D61ReservdL();
        }
   		return ip65504D61ReservdL;
	}
	
	/**
	 * 	Update Ip65504D61ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D61-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D61ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D61ReservdL = checkIp65504D61ReservdLMaxLimit(number); 
		serializeIp65504D61ReservdL(ip65504D61ReservdL);
	}

	public void setIp65504D61ReservdL(int number) {
	    number = checkIp65504D61ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D61ReservdL((short)number);
	}
	public void setIp65504D61ReservdL(long number) {
	    number = checkIp65504D61ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D61ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D62FmtVerS
	 *	@return ip65504D62FmtVerS
	 */
	public short getIp65504D62FmtVerS() throws CFException {
        if (isIp65504D62FmtVerSModified()) { 
           ip65504D62FmtVerS = refreshIp65504D62FmtVerS();
        }
   		return ip65504D62FmtVerS;
	}
	
	/**
	 * 	Update Ip65504D62FmtVerS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D62-FMT-VER-S
	 *	@param number
	 */
	public void setIp65504D62FmtVerS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D62FmtVerS = checkIp65504D62FmtVerSMaxLimit(number); 
		serializeIp65504D62FmtVerS(ip65504D62FmtVerS);
	}

	public void setIp65504D62FmtVerS(int number) {
	    number = checkIp65504D62FmtVerSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D62FmtVerS((short)number);
	}
	public void setIp65504D62FmtVerS(long number) {
	    number = checkIp65504D62FmtVerSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D62FmtVerS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D62FmtVerL
	 *	@return ip65504D62FmtVerL
	 */
	public short getIp65504D62FmtVerL() throws CFException {
        if (isIp65504D62FmtVerLModified()) { 
           ip65504D62FmtVerL = refreshIp65504D62FmtVerL();
        }
   		return ip65504D62FmtVerL;
	}
	
	/**
	 * 	Update Ip65504D62FmtVerL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D62-FMT-VER-L
	 *	@param number
	 */
	public void setIp65504D62FmtVerL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D62FmtVerL = checkIp65504D62FmtVerLMaxLimit(number); 
		serializeIp65504D62FmtVerL(ip65504D62FmtVerL);
	}

	public void setIp65504D62FmtVerL(int number) {
	    number = checkIp65504D62FmtVerLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D62FmtVerL((short)number);
	}
	public void setIp65504D62FmtVerL(long number) {
	    number = checkIp65504D62FmtVerLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D62FmtVerL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504DeNamesLargeGroup2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504D32AcqInsS((short)0);
         	setIp65504D32AcqInsL((short)0);
         	setIp65504D33FwdInsS((short)0);
         	setIp65504D33FwdInsL((short)0);
         	setIp65504D34PanExtS((short)0);
         	setIp65504D34PanExtL((short)0);
         	setIp65504D35Track2S((short)0);
         	setIp65504D35Track2L((short)0);
         	setIp65504D36Track3S((short)0);
         	setIp65504D36Track3L((short)0);
         	setIp65504D37RetrNoS((short)0);
         	setIp65504D37RetrNoL((short)0);
         	setIp65504D38AprvcodS((short)0);
         	setIp65504D38AprvcodL((short)0);
         	setIp65504D39ActnCdS((short)0);
         	setIp65504D39ActnCdL((short)0);
         	setIp65504D40ServCdS((short)0);
         	setIp65504D40ServCdL((short)0);
         	setIp65504D41TermIdS((short)0);
         	setIp65504D41TermIdL((short)0);
         	setIp65504D42CardIdS((short)0);
         	setIp65504D42CardIdL((short)0);
         	setIp65504D43NmeLocS((short)0);
         	setIp65504D43NmeLocL((short)0);
         	setIp65504D44AddldatS((short)0);
         	setIp65504D44AddldatL((short)0);
         	setIp65504D45Track1S((short)0);
         	setIp65504D45Track1L((short)0);
         	setIp65504D46AmtFeeS((short)0);
         	setIp65504D46AmtFeeL((short)0);
         	setIp65504D47AddldatS((short)0);
         	setIp65504D47AddldatL((short)0);
         	setIp65504D48AddldatS((short)0);
         	setIp65504D48AddldatL((short)0);
         	setIp65504D49TrxCurS((short)0);
         	setIp65504D49TrxCurL((short)0);
         	setIp65504D50RecCurS((short)0);
         	setIp65504D50RecCurL((short)0);
         	setIp65504D51BilCurS((short)0);
         	setIp65504D51BilCurL((short)0);
         	setIp65504D52PinDatS((short)0);
         	setIp65504D52PinDatL((short)0);
         	setIp65504D53SecCtlS((short)0);
         	setIp65504D53SecCtlL((short)0);
         	setIp65504D54AddlamtS((short)0);
         	setIp65504D54AddlamtL((short)0);
         	setIp65504D55IccDatS((short)0);
         	setIp65504D55IccDatL((short)0);
         	setIp65504D56OrigElS((short)0);
         	setIp65504D56OrigElL((short)0);
         	setIp65504D57AuthCyS((short)0);
         	setIp65504D57AuthCyL((short)0);
         	setIp65504D58AuthAgS((short)0);
         	setIp65504D58AuthAgL((short)0);
         	setIp65504D59TransptS((short)0);
         	setIp65504D59TransptL((short)0);
         	setIp65504D60ReservdS((short)0);
         	setIp65504D60ReservdL((short)0);
         	setIp65504D61ReservdS((short)0);
         	setIp65504D61ReservdL((short)0);
         	setIp65504D62FmtVerS((short)0);
         	setIp65504D62FmtVerL((short)0);
   }

		public static int getIp65504DeNamesLargeGroup2FieldLength() {
			return IP_65504_DE_NAMES_LARGE_GROUP_2_LENGTH;
		}

}
  
