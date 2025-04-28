package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup18 extends Ip65504PdsNamesLargeGroup18Serialized { 
   

								private short ip65504P528CoupNoS;

								private short ip65504P528CoupNoL;


								private short ip65504P529FarebasS;

								private short ip65504P529FarebasL;


								private short ip65504P530FltNbrS;

								private short ip65504P530FltNbrL;


								private short ip65504P531DeptTmS;

								private short ip65504P531DeptTmL;


								private short ip65504P532ReservdS;

								private short ip65504P532ReservdL;


								private short ip65504P533ArrvTmS;

								private short ip65504P533ArrvTmL;


								private short ip65504P534ReservdS;

								private short ip65504P534ReservdL;


								private short ip65504P535FareXxS;

								private short ip65504P535FareXxL;


								private short ip65504P536FeeXxxS;

								private short ip65504P536FeeXxxL;


								private short ip65504P537TaxesXS;

								private short ip65504P537TaxesSL;


								private short ip65504P538EndorseS;

								private short ip65504P538EndorseL;


								private short ip65504P539ReservdS;

								private short ip65504P539ReservdL;


								private short ip65504P540ReservdS;

								private short ip65504P540ReservdL;


								private short ip65504P541ReservdS;

								private short ip65504P541ReservdL;


								private short ip65504P542ReservdS;

								private short ip65504P542ReservdL;


								private short ip65504P543ReservdS;

								private short ip65504P543ReservdL;


								private short ip65504P544RentNoS;

								private short ip65504P544RentNoL;


								private short ip65504P545RentNmS;

								private short ip65504P545RentNmL;


								private short ip65504P546RentCyS;

								private short ip65504P546RentCyL;


								private short ip65504P547RentStS;

								private short ip65504P547RentStL;


								private short ip65504P548RntCtyS;

								private short ip65504P548RntCtyL;


								private short ip65504P549RntLocS;

								private short ip65504P549RntLocL;


								private short ip65504P550RntRetS;

								private short ip65504P550RntRetL;


								private short ip65504P551RntChkS;

								private short ip65504P551RntChkL;


								private short ip65504P552CusSvcS;

								private short ip65504P552CusSvcL;


								private short ip65504P553RntRteS;

								private short ip65504P553RntRteL;


								private short ip65504P554ReservdS;

								private short ip65504P554ReservdL;


								private short ip65504P555RtPMlS;

								private short ip65504P555RtPMlL;


								private short ip65504P556TtlMlsS;

								private short ip65504P556TtlMlsL;


								private short ip65504P557MaxfreeS;

								private short ip65504P557MaxfreeL;


								private short ip65504P558MiKmIS;

								private short ip65504P558MiKmIL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup18
	**/
    public Ip65504PdsNamesLargeGroup18() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P528CoupNoS
	 *	@return ip65504P528CoupNoS
	 */
	public short getIp65504P528CoupNoS() throws CFException {
        if (isIp65504P528CoupNoSModified()) { 
           ip65504P528CoupNoS = refreshIp65504P528CoupNoS();
        }
   		return ip65504P528CoupNoS;
	}
	
	/**
	 * 	Update Ip65504P528CoupNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P528-COUP-NO-S
	 *	@param number
	 */
	public void setIp65504P528CoupNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P528CoupNoS = checkIp65504P528CoupNoSMaxLimit(number); 
		serializeIp65504P528CoupNoS(ip65504P528CoupNoS);
	}

	public void setIp65504P528CoupNoS(int number) {
	    number = checkIp65504P528CoupNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P528CoupNoS((short)number);
	}
	public void setIp65504P528CoupNoS(long number) {
	    number = checkIp65504P528CoupNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P528CoupNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P528CoupNoL
	 *	@return ip65504P528CoupNoL
	 */
	public short getIp65504P528CoupNoL() throws CFException {
        if (isIp65504P528CoupNoLModified()) { 
           ip65504P528CoupNoL = refreshIp65504P528CoupNoL();
        }
   		return ip65504P528CoupNoL;
	}
	
	/**
	 * 	Update Ip65504P528CoupNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P528-COUP-NO-L
	 *	@param number
	 */
	public void setIp65504P528CoupNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P528CoupNoL = checkIp65504P528CoupNoLMaxLimit(number); 
		serializeIp65504P528CoupNoL(ip65504P528CoupNoL);
	}

	public void setIp65504P528CoupNoL(int number) {
	    number = checkIp65504P528CoupNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P528CoupNoL((short)number);
	}
	public void setIp65504P528CoupNoL(long number) {
	    number = checkIp65504P528CoupNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P528CoupNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P529FarebasS
	 *	@return ip65504P529FarebasS
	 */
	public short getIp65504P529FarebasS() throws CFException {
        if (isIp65504P529FarebasSModified()) { 
           ip65504P529FarebasS = refreshIp65504P529FarebasS();
        }
   		return ip65504P529FarebasS;
	}
	
	/**
	 * 	Update Ip65504P529FarebasS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P529-FAREBAS-S
	 *	@param number
	 */
	public void setIp65504P529FarebasS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P529FarebasS = checkIp65504P529FarebasSMaxLimit(number); 
		serializeIp65504P529FarebasS(ip65504P529FarebasS);
	}

	public void setIp65504P529FarebasS(int number) {
	    number = checkIp65504P529FarebasSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P529FarebasS((short)number);
	}
	public void setIp65504P529FarebasS(long number) {
	    number = checkIp65504P529FarebasSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P529FarebasS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P529FarebasL
	 *	@return ip65504P529FarebasL
	 */
	public short getIp65504P529FarebasL() throws CFException {
        if (isIp65504P529FarebasLModified()) { 
           ip65504P529FarebasL = refreshIp65504P529FarebasL();
        }
   		return ip65504P529FarebasL;
	}
	
	/**
	 * 	Update Ip65504P529FarebasL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P529-FAREBAS-L
	 *	@param number
	 */
	public void setIp65504P529FarebasL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P529FarebasL = checkIp65504P529FarebasLMaxLimit(number); 
		serializeIp65504P529FarebasL(ip65504P529FarebasL);
	}

	public void setIp65504P529FarebasL(int number) {
	    number = checkIp65504P529FarebasLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P529FarebasL((short)number);
	}
	public void setIp65504P529FarebasL(long number) {
	    number = checkIp65504P529FarebasLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P529FarebasL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P530FltNbrS
	 *	@return ip65504P530FltNbrS
	 */
	public short getIp65504P530FltNbrS() throws CFException {
        if (isIp65504P530FltNbrSModified()) { 
           ip65504P530FltNbrS = refreshIp65504P530FltNbrS();
        }
   		return ip65504P530FltNbrS;
	}
	
	/**
	 * 	Update Ip65504P530FltNbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P530-FLT-NBR-S
	 *	@param number
	 */
	public void setIp65504P530FltNbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P530FltNbrS = checkIp65504P530FltNbrSMaxLimit(number); 
		serializeIp65504P530FltNbrS(ip65504P530FltNbrS);
	}

	public void setIp65504P530FltNbrS(int number) {
	    number = checkIp65504P530FltNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P530FltNbrS((short)number);
	}
	public void setIp65504P530FltNbrS(long number) {
	    number = checkIp65504P530FltNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P530FltNbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P530FltNbrL
	 *	@return ip65504P530FltNbrL
	 */
	public short getIp65504P530FltNbrL() throws CFException {
        if (isIp65504P530FltNbrLModified()) { 
           ip65504P530FltNbrL = refreshIp65504P530FltNbrL();
        }
   		return ip65504P530FltNbrL;
	}
	
	/**
	 * 	Update Ip65504P530FltNbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P530-FLT-NBR-L
	 *	@param number
	 */
	public void setIp65504P530FltNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P530FltNbrL = checkIp65504P530FltNbrLMaxLimit(number); 
		serializeIp65504P530FltNbrL(ip65504P530FltNbrL);
	}

	public void setIp65504P530FltNbrL(int number) {
	    number = checkIp65504P530FltNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P530FltNbrL((short)number);
	}
	public void setIp65504P530FltNbrL(long number) {
	    number = checkIp65504P530FltNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P530FltNbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P531DeptTmS
	 *	@return ip65504P531DeptTmS
	 */
	public short getIp65504P531DeptTmS() throws CFException {
        if (isIp65504P531DeptTmSModified()) { 
           ip65504P531DeptTmS = refreshIp65504P531DeptTmS();
        }
   		return ip65504P531DeptTmS;
	}
	
	/**
	 * 	Update Ip65504P531DeptTmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P531-DEPT-TM-S
	 *	@param number
	 */
	public void setIp65504P531DeptTmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P531DeptTmS = checkIp65504P531DeptTmSMaxLimit(number); 
		serializeIp65504P531DeptTmS(ip65504P531DeptTmS);
	}

	public void setIp65504P531DeptTmS(int number) {
	    number = checkIp65504P531DeptTmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P531DeptTmS((short)number);
	}
	public void setIp65504P531DeptTmS(long number) {
	    number = checkIp65504P531DeptTmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P531DeptTmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P531DeptTmL
	 *	@return ip65504P531DeptTmL
	 */
	public short getIp65504P531DeptTmL() throws CFException {
        if (isIp65504P531DeptTmLModified()) { 
           ip65504P531DeptTmL = refreshIp65504P531DeptTmL();
        }
   		return ip65504P531DeptTmL;
	}
	
	/**
	 * 	Update Ip65504P531DeptTmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P531-DEPT-TM-L
	 *	@param number
	 */
	public void setIp65504P531DeptTmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P531DeptTmL = checkIp65504P531DeptTmLMaxLimit(number); 
		serializeIp65504P531DeptTmL(ip65504P531DeptTmL);
	}

	public void setIp65504P531DeptTmL(int number) {
	    number = checkIp65504P531DeptTmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P531DeptTmL((short)number);
	}
	public void setIp65504P531DeptTmL(long number) {
	    number = checkIp65504P531DeptTmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P531DeptTmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P532ReservdS
	 *	@return ip65504P532ReservdS
	 */
	public short getIp65504P532ReservdS() throws CFException {
        if (isIp65504P532ReservdSModified()) { 
           ip65504P532ReservdS = refreshIp65504P532ReservdS();
        }
   		return ip65504P532ReservdS;
	}
	
	/**
	 * 	Update Ip65504P532ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P532-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P532ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P532ReservdS = checkIp65504P532ReservdSMaxLimit(number); 
		serializeIp65504P532ReservdS(ip65504P532ReservdS);
	}

	public void setIp65504P532ReservdS(int number) {
	    number = checkIp65504P532ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P532ReservdS((short)number);
	}
	public void setIp65504P532ReservdS(long number) {
	    number = checkIp65504P532ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P532ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P532ReservdL
	 *	@return ip65504P532ReservdL
	 */
	public short getIp65504P532ReservdL() throws CFException {
        if (isIp65504P532ReservdLModified()) { 
           ip65504P532ReservdL = refreshIp65504P532ReservdL();
        }
   		return ip65504P532ReservdL;
	}
	
	/**
	 * 	Update Ip65504P532ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P532-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P532ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P532ReservdL = checkIp65504P532ReservdLMaxLimit(number); 
		serializeIp65504P532ReservdL(ip65504P532ReservdL);
	}

	public void setIp65504P532ReservdL(int number) {
	    number = checkIp65504P532ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P532ReservdL((short)number);
	}
	public void setIp65504P532ReservdL(long number) {
	    number = checkIp65504P532ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P532ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P533ArrvTmS
	 *	@return ip65504P533ArrvTmS
	 */
	public short getIp65504P533ArrvTmS() throws CFException {
        if (isIp65504P533ArrvTmSModified()) { 
           ip65504P533ArrvTmS = refreshIp65504P533ArrvTmS();
        }
   		return ip65504P533ArrvTmS;
	}
	
	/**
	 * 	Update Ip65504P533ArrvTmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P533-ARRV-TM-S
	 *	@param number
	 */
	public void setIp65504P533ArrvTmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P533ArrvTmS = checkIp65504P533ArrvTmSMaxLimit(number); 
		serializeIp65504P533ArrvTmS(ip65504P533ArrvTmS);
	}

	public void setIp65504P533ArrvTmS(int number) {
	    number = checkIp65504P533ArrvTmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P533ArrvTmS((short)number);
	}
	public void setIp65504P533ArrvTmS(long number) {
	    number = checkIp65504P533ArrvTmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P533ArrvTmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P533ArrvTmL
	 *	@return ip65504P533ArrvTmL
	 */
	public short getIp65504P533ArrvTmL() throws CFException {
        if (isIp65504P533ArrvTmLModified()) { 
           ip65504P533ArrvTmL = refreshIp65504P533ArrvTmL();
        }
   		return ip65504P533ArrvTmL;
	}
	
	/**
	 * 	Update Ip65504P533ArrvTmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P533-ARRV-TM-L
	 *	@param number
	 */
	public void setIp65504P533ArrvTmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P533ArrvTmL = checkIp65504P533ArrvTmLMaxLimit(number); 
		serializeIp65504P533ArrvTmL(ip65504P533ArrvTmL);
	}

	public void setIp65504P533ArrvTmL(int number) {
	    number = checkIp65504P533ArrvTmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P533ArrvTmL((short)number);
	}
	public void setIp65504P533ArrvTmL(long number) {
	    number = checkIp65504P533ArrvTmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P533ArrvTmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P534ReservdS
	 *	@return ip65504P534ReservdS
	 */
	public short getIp65504P534ReservdS() throws CFException {
        if (isIp65504P534ReservdSModified()) { 
           ip65504P534ReservdS = refreshIp65504P534ReservdS();
        }
   		return ip65504P534ReservdS;
	}
	
	/**
	 * 	Update Ip65504P534ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P534-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P534ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P534ReservdS = checkIp65504P534ReservdSMaxLimit(number); 
		serializeIp65504P534ReservdS(ip65504P534ReservdS);
	}

	public void setIp65504P534ReservdS(int number) {
	    number = checkIp65504P534ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P534ReservdS((short)number);
	}
	public void setIp65504P534ReservdS(long number) {
	    number = checkIp65504P534ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P534ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P534ReservdL
	 *	@return ip65504P534ReservdL
	 */
	public short getIp65504P534ReservdL() throws CFException {
        if (isIp65504P534ReservdLModified()) { 
           ip65504P534ReservdL = refreshIp65504P534ReservdL();
        }
   		return ip65504P534ReservdL;
	}
	
	/**
	 * 	Update Ip65504P534ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P534-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P534ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P534ReservdL = checkIp65504P534ReservdLMaxLimit(number); 
		serializeIp65504P534ReservdL(ip65504P534ReservdL);
	}

	public void setIp65504P534ReservdL(int number) {
	    number = checkIp65504P534ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P534ReservdL((short)number);
	}
	public void setIp65504P534ReservdL(long number) {
	    number = checkIp65504P534ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P534ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P535FareXxS
	 *	@return ip65504P535FareXxS
	 */
	public short getIp65504P535FareXxS() throws CFException {
        if (isIp65504P535FareXxSModified()) { 
           ip65504P535FareXxS = refreshIp65504P535FareXxS();
        }
   		return ip65504P535FareXxS;
	}
	
	/**
	 * 	Update Ip65504P535FareXxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P535-FARE-XX-S
	 *	@param number
	 */
	public void setIp65504P535FareXxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P535FareXxS = checkIp65504P535FareXxSMaxLimit(number); 
		serializeIp65504P535FareXxS(ip65504P535FareXxS);
	}

	public void setIp65504P535FareXxS(int number) {
	    number = checkIp65504P535FareXxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P535FareXxS((short)number);
	}
	public void setIp65504P535FareXxS(long number) {
	    number = checkIp65504P535FareXxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P535FareXxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P535FareXxL
	 *	@return ip65504P535FareXxL
	 */
	public short getIp65504P535FareXxL() throws CFException {
        if (isIp65504P535FareXxLModified()) { 
           ip65504P535FareXxL = refreshIp65504P535FareXxL();
        }
   		return ip65504P535FareXxL;
	}
	
	/**
	 * 	Update Ip65504P535FareXxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P535-FARE-XX-L
	 *	@param number
	 */
	public void setIp65504P535FareXxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P535FareXxL = checkIp65504P535FareXxLMaxLimit(number); 
		serializeIp65504P535FareXxL(ip65504P535FareXxL);
	}

	public void setIp65504P535FareXxL(int number) {
	    number = checkIp65504P535FareXxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P535FareXxL((short)number);
	}
	public void setIp65504P535FareXxL(long number) {
	    number = checkIp65504P535FareXxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P535FareXxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P536FeeXxxS
	 *	@return ip65504P536FeeXxxS
	 */
	public short getIp65504P536FeeXxxS() throws CFException {
        if (isIp65504P536FeeXxxSModified()) { 
           ip65504P536FeeXxxS = refreshIp65504P536FeeXxxS();
        }
   		return ip65504P536FeeXxxS;
	}
	
	/**
	 * 	Update Ip65504P536FeeXxxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P536-FEE-XXX-S
	 *	@param number
	 */
	public void setIp65504P536FeeXxxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P536FeeXxxS = checkIp65504P536FeeXxxSMaxLimit(number); 
		serializeIp65504P536FeeXxxS(ip65504P536FeeXxxS);
	}

	public void setIp65504P536FeeXxxS(int number) {
	    number = checkIp65504P536FeeXxxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P536FeeXxxS((short)number);
	}
	public void setIp65504P536FeeXxxS(long number) {
	    number = checkIp65504P536FeeXxxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P536FeeXxxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P536FeeXxxL
	 *	@return ip65504P536FeeXxxL
	 */
	public short getIp65504P536FeeXxxL() throws CFException {
        if (isIp65504P536FeeXxxLModified()) { 
           ip65504P536FeeXxxL = refreshIp65504P536FeeXxxL();
        }
   		return ip65504P536FeeXxxL;
	}
	
	/**
	 * 	Update Ip65504P536FeeXxxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P536-FEE-XXX-L
	 *	@param number
	 */
	public void setIp65504P536FeeXxxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P536FeeXxxL = checkIp65504P536FeeXxxLMaxLimit(number); 
		serializeIp65504P536FeeXxxL(ip65504P536FeeXxxL);
	}

	public void setIp65504P536FeeXxxL(int number) {
	    number = checkIp65504P536FeeXxxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P536FeeXxxL((short)number);
	}
	public void setIp65504P536FeeXxxL(long number) {
	    number = checkIp65504P536FeeXxxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P536FeeXxxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P537TaxesXS
	 *	@return ip65504P537TaxesXS
	 */
	public short getIp65504P537TaxesXS() throws CFException {
        if (isIp65504P537TaxesXSModified()) { 
           ip65504P537TaxesXS = refreshIp65504P537TaxesXS();
        }
   		return ip65504P537TaxesXS;
	}
	
	/**
	 * 	Update Ip65504P537TaxesXS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P537-TAXES-X-S
	 *	@param number
	 */
	public void setIp65504P537TaxesXS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P537TaxesXS = checkIp65504P537TaxesXSMaxLimit(number); 
		serializeIp65504P537TaxesXS(ip65504P537TaxesXS);
	}

	public void setIp65504P537TaxesXS(int number) {
	    number = checkIp65504P537TaxesXSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P537TaxesXS((short)number);
	}
	public void setIp65504P537TaxesXS(long number) {
	    number = checkIp65504P537TaxesXSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P537TaxesXS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P537TaxesSL
	 *	@return ip65504P537TaxesSL
	 */
	public short getIp65504P537TaxesSL() throws CFException {
        if (isIp65504P537TaxesSLModified()) { 
           ip65504P537TaxesSL = refreshIp65504P537TaxesSL();
        }
   		return ip65504P537TaxesSL;
	}
	
	/**
	 * 	Update Ip65504P537TaxesSL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P537-TAXES-S-L
	 *	@param number
	 */
	public void setIp65504P537TaxesSL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P537TaxesSL = checkIp65504P537TaxesSLMaxLimit(number); 
		serializeIp65504P537TaxesSL(ip65504P537TaxesSL);
	}

	public void setIp65504P537TaxesSL(int number) {
	    number = checkIp65504P537TaxesSLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P537TaxesSL((short)number);
	}
	public void setIp65504P537TaxesSL(long number) {
	    number = checkIp65504P537TaxesSLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P537TaxesSL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P538EndorseS
	 *	@return ip65504P538EndorseS
	 */
	public short getIp65504P538EndorseS() throws CFException {
        if (isIp65504P538EndorseSModified()) { 
           ip65504P538EndorseS = refreshIp65504P538EndorseS();
        }
   		return ip65504P538EndorseS;
	}
	
	/**
	 * 	Update Ip65504P538EndorseS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P538-ENDORSE-S
	 *	@param number
	 */
	public void setIp65504P538EndorseS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P538EndorseS = checkIp65504P538EndorseSMaxLimit(number); 
		serializeIp65504P538EndorseS(ip65504P538EndorseS);
	}

	public void setIp65504P538EndorseS(int number) {
	    number = checkIp65504P538EndorseSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P538EndorseS((short)number);
	}
	public void setIp65504P538EndorseS(long number) {
	    number = checkIp65504P538EndorseSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P538EndorseS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P538EndorseL
	 *	@return ip65504P538EndorseL
	 */
	public short getIp65504P538EndorseL() throws CFException {
        if (isIp65504P538EndorseLModified()) { 
           ip65504P538EndorseL = refreshIp65504P538EndorseL();
        }
   		return ip65504P538EndorseL;
	}
	
	/**
	 * 	Update Ip65504P538EndorseL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P538-ENDORSE-L
	 *	@param number
	 */
	public void setIp65504P538EndorseL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P538EndorseL = checkIp65504P538EndorseLMaxLimit(number); 
		serializeIp65504P538EndorseL(ip65504P538EndorseL);
	}

	public void setIp65504P538EndorseL(int number) {
	    number = checkIp65504P538EndorseLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P538EndorseL((short)number);
	}
	public void setIp65504P538EndorseL(long number) {
	    number = checkIp65504P538EndorseLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P538EndorseL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P539ReservdS
	 *	@return ip65504P539ReservdS
	 */
	public short getIp65504P539ReservdS() throws CFException {
        if (isIp65504P539ReservdSModified()) { 
           ip65504P539ReservdS = refreshIp65504P539ReservdS();
        }
   		return ip65504P539ReservdS;
	}
	
	/**
	 * 	Update Ip65504P539ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P539-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P539ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P539ReservdS = checkIp65504P539ReservdSMaxLimit(number); 
		serializeIp65504P539ReservdS(ip65504P539ReservdS);
	}

	public void setIp65504P539ReservdS(int number) {
	    number = checkIp65504P539ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P539ReservdS((short)number);
	}
	public void setIp65504P539ReservdS(long number) {
	    number = checkIp65504P539ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P539ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P539ReservdL
	 *	@return ip65504P539ReservdL
	 */
	public short getIp65504P539ReservdL() throws CFException {
        if (isIp65504P539ReservdLModified()) { 
           ip65504P539ReservdL = refreshIp65504P539ReservdL();
        }
   		return ip65504P539ReservdL;
	}
	
	/**
	 * 	Update Ip65504P539ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P539-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P539ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P539ReservdL = checkIp65504P539ReservdLMaxLimit(number); 
		serializeIp65504P539ReservdL(ip65504P539ReservdL);
	}

	public void setIp65504P539ReservdL(int number) {
	    number = checkIp65504P539ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P539ReservdL((short)number);
	}
	public void setIp65504P539ReservdL(long number) {
	    number = checkIp65504P539ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P539ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P540ReservdS
	 *	@return ip65504P540ReservdS
	 */
	public short getIp65504P540ReservdS() throws CFException {
        if (isIp65504P540ReservdSModified()) { 
           ip65504P540ReservdS = refreshIp65504P540ReservdS();
        }
   		return ip65504P540ReservdS;
	}
	
	/**
	 * 	Update Ip65504P540ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P540-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P540ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P540ReservdS = checkIp65504P540ReservdSMaxLimit(number); 
		serializeIp65504P540ReservdS(ip65504P540ReservdS);
	}

	public void setIp65504P540ReservdS(int number) {
	    number = checkIp65504P540ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P540ReservdS((short)number);
	}
	public void setIp65504P540ReservdS(long number) {
	    number = checkIp65504P540ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P540ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P540ReservdL
	 *	@return ip65504P540ReservdL
	 */
	public short getIp65504P540ReservdL() throws CFException {
        if (isIp65504P540ReservdLModified()) { 
           ip65504P540ReservdL = refreshIp65504P540ReservdL();
        }
   		return ip65504P540ReservdL;
	}
	
	/**
	 * 	Update Ip65504P540ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P540-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P540ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P540ReservdL = checkIp65504P540ReservdLMaxLimit(number); 
		serializeIp65504P540ReservdL(ip65504P540ReservdL);
	}

	public void setIp65504P540ReservdL(int number) {
	    number = checkIp65504P540ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P540ReservdL((short)number);
	}
	public void setIp65504P540ReservdL(long number) {
	    number = checkIp65504P540ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P540ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P541ReservdS
	 *	@return ip65504P541ReservdS
	 */
	public short getIp65504P541ReservdS() throws CFException {
        if (isIp65504P541ReservdSModified()) { 
           ip65504P541ReservdS = refreshIp65504P541ReservdS();
        }
   		return ip65504P541ReservdS;
	}
	
	/**
	 * 	Update Ip65504P541ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P541-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P541ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P541ReservdS = checkIp65504P541ReservdSMaxLimit(number); 
		serializeIp65504P541ReservdS(ip65504P541ReservdS);
	}

	public void setIp65504P541ReservdS(int number) {
	    number = checkIp65504P541ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P541ReservdS((short)number);
	}
	public void setIp65504P541ReservdS(long number) {
	    number = checkIp65504P541ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P541ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P541ReservdL
	 *	@return ip65504P541ReservdL
	 */
	public short getIp65504P541ReservdL() throws CFException {
        if (isIp65504P541ReservdLModified()) { 
           ip65504P541ReservdL = refreshIp65504P541ReservdL();
        }
   		return ip65504P541ReservdL;
	}
	
	/**
	 * 	Update Ip65504P541ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P541-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P541ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P541ReservdL = checkIp65504P541ReservdLMaxLimit(number); 
		serializeIp65504P541ReservdL(ip65504P541ReservdL);
	}

	public void setIp65504P541ReservdL(int number) {
	    number = checkIp65504P541ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P541ReservdL((short)number);
	}
	public void setIp65504P541ReservdL(long number) {
	    number = checkIp65504P541ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P541ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P542ReservdS
	 *	@return ip65504P542ReservdS
	 */
	public short getIp65504P542ReservdS() throws CFException {
        if (isIp65504P542ReservdSModified()) { 
           ip65504P542ReservdS = refreshIp65504P542ReservdS();
        }
   		return ip65504P542ReservdS;
	}
	
	/**
	 * 	Update Ip65504P542ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P542-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P542ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P542ReservdS = checkIp65504P542ReservdSMaxLimit(number); 
		serializeIp65504P542ReservdS(ip65504P542ReservdS);
	}

	public void setIp65504P542ReservdS(int number) {
	    number = checkIp65504P542ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P542ReservdS((short)number);
	}
	public void setIp65504P542ReservdS(long number) {
	    number = checkIp65504P542ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P542ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P542ReservdL
	 *	@return ip65504P542ReservdL
	 */
	public short getIp65504P542ReservdL() throws CFException {
        if (isIp65504P542ReservdLModified()) { 
           ip65504P542ReservdL = refreshIp65504P542ReservdL();
        }
   		return ip65504P542ReservdL;
	}
	
	/**
	 * 	Update Ip65504P542ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P542-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P542ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P542ReservdL = checkIp65504P542ReservdLMaxLimit(number); 
		serializeIp65504P542ReservdL(ip65504P542ReservdL);
	}

	public void setIp65504P542ReservdL(int number) {
	    number = checkIp65504P542ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P542ReservdL((short)number);
	}
	public void setIp65504P542ReservdL(long number) {
	    number = checkIp65504P542ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P542ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P543ReservdS
	 *	@return ip65504P543ReservdS
	 */
	public short getIp65504P543ReservdS() throws CFException {
        if (isIp65504P543ReservdSModified()) { 
           ip65504P543ReservdS = refreshIp65504P543ReservdS();
        }
   		return ip65504P543ReservdS;
	}
	
	/**
	 * 	Update Ip65504P543ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P543-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P543ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P543ReservdS = checkIp65504P543ReservdSMaxLimit(number); 
		serializeIp65504P543ReservdS(ip65504P543ReservdS);
	}

	public void setIp65504P543ReservdS(int number) {
	    number = checkIp65504P543ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P543ReservdS((short)number);
	}
	public void setIp65504P543ReservdS(long number) {
	    number = checkIp65504P543ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P543ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P543ReservdL
	 *	@return ip65504P543ReservdL
	 */
	public short getIp65504P543ReservdL() throws CFException {
        if (isIp65504P543ReservdLModified()) { 
           ip65504P543ReservdL = refreshIp65504P543ReservdL();
        }
   		return ip65504P543ReservdL;
	}
	
	/**
	 * 	Update Ip65504P543ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P543-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P543ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P543ReservdL = checkIp65504P543ReservdLMaxLimit(number); 
		serializeIp65504P543ReservdL(ip65504P543ReservdL);
	}

	public void setIp65504P543ReservdL(int number) {
	    number = checkIp65504P543ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P543ReservdL((short)number);
	}
	public void setIp65504P543ReservdL(long number) {
	    number = checkIp65504P543ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P543ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P544RentNoS
	 *	@return ip65504P544RentNoS
	 */
	public short getIp65504P544RentNoS() throws CFException {
        if (isIp65504P544RentNoSModified()) { 
           ip65504P544RentNoS = refreshIp65504P544RentNoS();
        }
   		return ip65504P544RentNoS;
	}
	
	/**
	 * 	Update Ip65504P544RentNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P544-RENT-NO-S
	 *	@param number
	 */
	public void setIp65504P544RentNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P544RentNoS = checkIp65504P544RentNoSMaxLimit(number); 
		serializeIp65504P544RentNoS(ip65504P544RentNoS);
	}

	public void setIp65504P544RentNoS(int number) {
	    number = checkIp65504P544RentNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P544RentNoS((short)number);
	}
	public void setIp65504P544RentNoS(long number) {
	    number = checkIp65504P544RentNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P544RentNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P544RentNoL
	 *	@return ip65504P544RentNoL
	 */
	public short getIp65504P544RentNoL() throws CFException {
        if (isIp65504P544RentNoLModified()) { 
           ip65504P544RentNoL = refreshIp65504P544RentNoL();
        }
   		return ip65504P544RentNoL;
	}
	
	/**
	 * 	Update Ip65504P544RentNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P544-RENT-NO-L
	 *	@param number
	 */
	public void setIp65504P544RentNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P544RentNoL = checkIp65504P544RentNoLMaxLimit(number); 
		serializeIp65504P544RentNoL(ip65504P544RentNoL);
	}

	public void setIp65504P544RentNoL(int number) {
	    number = checkIp65504P544RentNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P544RentNoL((short)number);
	}
	public void setIp65504P544RentNoL(long number) {
	    number = checkIp65504P544RentNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P544RentNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P545RentNmS
	 *	@return ip65504P545RentNmS
	 */
	public short getIp65504P545RentNmS() throws CFException {
        if (isIp65504P545RentNmSModified()) { 
           ip65504P545RentNmS = refreshIp65504P545RentNmS();
        }
   		return ip65504P545RentNmS;
	}
	
	/**
	 * 	Update Ip65504P545RentNmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P545-RENT-NM-S
	 *	@param number
	 */
	public void setIp65504P545RentNmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P545RentNmS = checkIp65504P545RentNmSMaxLimit(number); 
		serializeIp65504P545RentNmS(ip65504P545RentNmS);
	}

	public void setIp65504P545RentNmS(int number) {
	    number = checkIp65504P545RentNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P545RentNmS((short)number);
	}
	public void setIp65504P545RentNmS(long number) {
	    number = checkIp65504P545RentNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P545RentNmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P545RentNmL
	 *	@return ip65504P545RentNmL
	 */
	public short getIp65504P545RentNmL() throws CFException {
        if (isIp65504P545RentNmLModified()) { 
           ip65504P545RentNmL = refreshIp65504P545RentNmL();
        }
   		return ip65504P545RentNmL;
	}
	
	/**
	 * 	Update Ip65504P545RentNmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P545-RENT-NM-L
	 *	@param number
	 */
	public void setIp65504P545RentNmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P545RentNmL = checkIp65504P545RentNmLMaxLimit(number); 
		serializeIp65504P545RentNmL(ip65504P545RentNmL);
	}

	public void setIp65504P545RentNmL(int number) {
	    number = checkIp65504P545RentNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P545RentNmL((short)number);
	}
	public void setIp65504P545RentNmL(long number) {
	    number = checkIp65504P545RentNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P545RentNmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P546RentCyS
	 *	@return ip65504P546RentCyS
	 */
	public short getIp65504P546RentCyS() throws CFException {
        if (isIp65504P546RentCySModified()) { 
           ip65504P546RentCyS = refreshIp65504P546RentCyS();
        }
   		return ip65504P546RentCyS;
	}
	
	/**
	 * 	Update Ip65504P546RentCyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P546-RENT-CY-S
	 *	@param number
	 */
	public void setIp65504P546RentCyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P546RentCyS = checkIp65504P546RentCySMaxLimit(number); 
		serializeIp65504P546RentCyS(ip65504P546RentCyS);
	}

	public void setIp65504P546RentCyS(int number) {
	    number = checkIp65504P546RentCySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P546RentCyS((short)number);
	}
	public void setIp65504P546RentCyS(long number) {
	    number = checkIp65504P546RentCySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P546RentCyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P546RentCyL
	 *	@return ip65504P546RentCyL
	 */
	public short getIp65504P546RentCyL() throws CFException {
        if (isIp65504P546RentCyLModified()) { 
           ip65504P546RentCyL = refreshIp65504P546RentCyL();
        }
   		return ip65504P546RentCyL;
	}
	
	/**
	 * 	Update Ip65504P546RentCyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P546-RENT-CY-L
	 *	@param number
	 */
	public void setIp65504P546RentCyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P546RentCyL = checkIp65504P546RentCyLMaxLimit(number); 
		serializeIp65504P546RentCyL(ip65504P546RentCyL);
	}

	public void setIp65504P546RentCyL(int number) {
	    number = checkIp65504P546RentCyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P546RentCyL((short)number);
	}
	public void setIp65504P546RentCyL(long number) {
	    number = checkIp65504P546RentCyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P546RentCyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P547RentStS
	 *	@return ip65504P547RentStS
	 */
	public short getIp65504P547RentStS() throws CFException {
        if (isIp65504P547RentStSModified()) { 
           ip65504P547RentStS = refreshIp65504P547RentStS();
        }
   		return ip65504P547RentStS;
	}
	
	/**
	 * 	Update Ip65504P547RentStS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P547-RENT-ST-S
	 *	@param number
	 */
	public void setIp65504P547RentStS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P547RentStS = checkIp65504P547RentStSMaxLimit(number); 
		serializeIp65504P547RentStS(ip65504P547RentStS);
	}

	public void setIp65504P547RentStS(int number) {
	    number = checkIp65504P547RentStSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P547RentStS((short)number);
	}
	public void setIp65504P547RentStS(long number) {
	    number = checkIp65504P547RentStSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P547RentStS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P547RentStL
	 *	@return ip65504P547RentStL
	 */
	public short getIp65504P547RentStL() throws CFException {
        if (isIp65504P547RentStLModified()) { 
           ip65504P547RentStL = refreshIp65504P547RentStL();
        }
   		return ip65504P547RentStL;
	}
	
	/**
	 * 	Update Ip65504P547RentStL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P547-RENT-ST-L
	 *	@param number
	 */
	public void setIp65504P547RentStL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P547RentStL = checkIp65504P547RentStLMaxLimit(number); 
		serializeIp65504P547RentStL(ip65504P547RentStL);
	}

	public void setIp65504P547RentStL(int number) {
	    number = checkIp65504P547RentStLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P547RentStL((short)number);
	}
	public void setIp65504P547RentStL(long number) {
	    number = checkIp65504P547RentStLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P547RentStL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P548RntCtyS
	 *	@return ip65504P548RntCtyS
	 */
	public short getIp65504P548RntCtyS() throws CFException {
        if (isIp65504P548RntCtySModified()) { 
           ip65504P548RntCtyS = refreshIp65504P548RntCtyS();
        }
   		return ip65504P548RntCtyS;
	}
	
	/**
	 * 	Update Ip65504P548RntCtyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P548-RNT-CTY-S
	 *	@param number
	 */
	public void setIp65504P548RntCtyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P548RntCtyS = checkIp65504P548RntCtySMaxLimit(number); 
		serializeIp65504P548RntCtyS(ip65504P548RntCtyS);
	}

	public void setIp65504P548RntCtyS(int number) {
	    number = checkIp65504P548RntCtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P548RntCtyS((short)number);
	}
	public void setIp65504P548RntCtyS(long number) {
	    number = checkIp65504P548RntCtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P548RntCtyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P548RntCtyL
	 *	@return ip65504P548RntCtyL
	 */
	public short getIp65504P548RntCtyL() throws CFException {
        if (isIp65504P548RntCtyLModified()) { 
           ip65504P548RntCtyL = refreshIp65504P548RntCtyL();
        }
   		return ip65504P548RntCtyL;
	}
	
	/**
	 * 	Update Ip65504P548RntCtyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P548-RNT-CTY-L
	 *	@param number
	 */
	public void setIp65504P548RntCtyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P548RntCtyL = checkIp65504P548RntCtyLMaxLimit(number); 
		serializeIp65504P548RntCtyL(ip65504P548RntCtyL);
	}

	public void setIp65504P548RntCtyL(int number) {
	    number = checkIp65504P548RntCtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P548RntCtyL((short)number);
	}
	public void setIp65504P548RntCtyL(long number) {
	    number = checkIp65504P548RntCtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P548RntCtyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P549RntLocS
	 *	@return ip65504P549RntLocS
	 */
	public short getIp65504P549RntLocS() throws CFException {
        if (isIp65504P549RntLocSModified()) { 
           ip65504P549RntLocS = refreshIp65504P549RntLocS();
        }
   		return ip65504P549RntLocS;
	}
	
	/**
	 * 	Update Ip65504P549RntLocS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P549-RNT-LOC-S
	 *	@param number
	 */
	public void setIp65504P549RntLocS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P549RntLocS = checkIp65504P549RntLocSMaxLimit(number); 
		serializeIp65504P549RntLocS(ip65504P549RntLocS);
	}

	public void setIp65504P549RntLocS(int number) {
	    number = checkIp65504P549RntLocSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P549RntLocS((short)number);
	}
	public void setIp65504P549RntLocS(long number) {
	    number = checkIp65504P549RntLocSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P549RntLocS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P549RntLocL
	 *	@return ip65504P549RntLocL
	 */
	public short getIp65504P549RntLocL() throws CFException {
        if (isIp65504P549RntLocLModified()) { 
           ip65504P549RntLocL = refreshIp65504P549RntLocL();
        }
   		return ip65504P549RntLocL;
	}
	
	/**
	 * 	Update Ip65504P549RntLocL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P549-RNT-LOC-L
	 *	@param number
	 */
	public void setIp65504P549RntLocL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P549RntLocL = checkIp65504P549RntLocLMaxLimit(number); 
		serializeIp65504P549RntLocL(ip65504P549RntLocL);
	}

	public void setIp65504P549RntLocL(int number) {
	    number = checkIp65504P549RntLocLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P549RntLocL((short)number);
	}
	public void setIp65504P549RntLocL(long number) {
	    number = checkIp65504P549RntLocLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P549RntLocL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P550RntRetS
	 *	@return ip65504P550RntRetS
	 */
	public short getIp65504P550RntRetS() throws CFException {
        if (isIp65504P550RntRetSModified()) { 
           ip65504P550RntRetS = refreshIp65504P550RntRetS();
        }
   		return ip65504P550RntRetS;
	}
	
	/**
	 * 	Update Ip65504P550RntRetS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P550-RNT-RET-S
	 *	@param number
	 */
	public void setIp65504P550RntRetS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P550RntRetS = checkIp65504P550RntRetSMaxLimit(number); 
		serializeIp65504P550RntRetS(ip65504P550RntRetS);
	}

	public void setIp65504P550RntRetS(int number) {
	    number = checkIp65504P550RntRetSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P550RntRetS((short)number);
	}
	public void setIp65504P550RntRetS(long number) {
	    number = checkIp65504P550RntRetSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P550RntRetS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P550RntRetL
	 *	@return ip65504P550RntRetL
	 */
	public short getIp65504P550RntRetL() throws CFException {
        if (isIp65504P550RntRetLModified()) { 
           ip65504P550RntRetL = refreshIp65504P550RntRetL();
        }
   		return ip65504P550RntRetL;
	}
	
	/**
	 * 	Update Ip65504P550RntRetL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P550-RNT-RET-L
	 *	@param number
	 */
	public void setIp65504P550RntRetL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P550RntRetL = checkIp65504P550RntRetLMaxLimit(number); 
		serializeIp65504P550RntRetL(ip65504P550RntRetL);
	}

	public void setIp65504P550RntRetL(int number) {
	    number = checkIp65504P550RntRetLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P550RntRetL((short)number);
	}
	public void setIp65504P550RntRetL(long number) {
	    number = checkIp65504P550RntRetLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P550RntRetL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P551RntChkS
	 *	@return ip65504P551RntChkS
	 */
	public short getIp65504P551RntChkS() throws CFException {
        if (isIp65504P551RntChkSModified()) { 
           ip65504P551RntChkS = refreshIp65504P551RntChkS();
        }
   		return ip65504P551RntChkS;
	}
	
	/**
	 * 	Update Ip65504P551RntChkS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P551-RNT-CHK-S
	 *	@param number
	 */
	public void setIp65504P551RntChkS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P551RntChkS = checkIp65504P551RntChkSMaxLimit(number); 
		serializeIp65504P551RntChkS(ip65504P551RntChkS);
	}

	public void setIp65504P551RntChkS(int number) {
	    number = checkIp65504P551RntChkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P551RntChkS((short)number);
	}
	public void setIp65504P551RntChkS(long number) {
	    number = checkIp65504P551RntChkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P551RntChkS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P551RntChkL
	 *	@return ip65504P551RntChkL
	 */
	public short getIp65504P551RntChkL() throws CFException {
        if (isIp65504P551RntChkLModified()) { 
           ip65504P551RntChkL = refreshIp65504P551RntChkL();
        }
   		return ip65504P551RntChkL;
	}
	
	/**
	 * 	Update Ip65504P551RntChkL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P551-RNT-CHK-L
	 *	@param number
	 */
	public void setIp65504P551RntChkL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P551RntChkL = checkIp65504P551RntChkLMaxLimit(number); 
		serializeIp65504P551RntChkL(ip65504P551RntChkL);
	}

	public void setIp65504P551RntChkL(int number) {
	    number = checkIp65504P551RntChkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P551RntChkL((short)number);
	}
	public void setIp65504P551RntChkL(long number) {
	    number = checkIp65504P551RntChkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P551RntChkL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P552CusSvcS
	 *	@return ip65504P552CusSvcS
	 */
	public short getIp65504P552CusSvcS() throws CFException {
        if (isIp65504P552CusSvcSModified()) { 
           ip65504P552CusSvcS = refreshIp65504P552CusSvcS();
        }
   		return ip65504P552CusSvcS;
	}
	
	/**
	 * 	Update Ip65504P552CusSvcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P552-CUS-SVC-S
	 *	@param number
	 */
	public void setIp65504P552CusSvcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P552CusSvcS = checkIp65504P552CusSvcSMaxLimit(number); 
		serializeIp65504P552CusSvcS(ip65504P552CusSvcS);
	}

	public void setIp65504P552CusSvcS(int number) {
	    number = checkIp65504P552CusSvcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P552CusSvcS((short)number);
	}
	public void setIp65504P552CusSvcS(long number) {
	    number = checkIp65504P552CusSvcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P552CusSvcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P552CusSvcL
	 *	@return ip65504P552CusSvcL
	 */
	public short getIp65504P552CusSvcL() throws CFException {
        if (isIp65504P552CusSvcLModified()) { 
           ip65504P552CusSvcL = refreshIp65504P552CusSvcL();
        }
   		return ip65504P552CusSvcL;
	}
	
	/**
	 * 	Update Ip65504P552CusSvcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P552-CUS-SVC-L
	 *	@param number
	 */
	public void setIp65504P552CusSvcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P552CusSvcL = checkIp65504P552CusSvcLMaxLimit(number); 
		serializeIp65504P552CusSvcL(ip65504P552CusSvcL);
	}

	public void setIp65504P552CusSvcL(int number) {
	    number = checkIp65504P552CusSvcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P552CusSvcL((short)number);
	}
	public void setIp65504P552CusSvcL(long number) {
	    number = checkIp65504P552CusSvcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P552CusSvcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P553RntRteS
	 *	@return ip65504P553RntRteS
	 */
	public short getIp65504P553RntRteS() throws CFException {
        if (isIp65504P553RntRteSModified()) { 
           ip65504P553RntRteS = refreshIp65504P553RntRteS();
        }
   		return ip65504P553RntRteS;
	}
	
	/**
	 * 	Update Ip65504P553RntRteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P553-RNT-RTE-S
	 *	@param number
	 */
	public void setIp65504P553RntRteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P553RntRteS = checkIp65504P553RntRteSMaxLimit(number); 
		serializeIp65504P553RntRteS(ip65504P553RntRteS);
	}

	public void setIp65504P553RntRteS(int number) {
	    number = checkIp65504P553RntRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P553RntRteS((short)number);
	}
	public void setIp65504P553RntRteS(long number) {
	    number = checkIp65504P553RntRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P553RntRteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P553RntRteL
	 *	@return ip65504P553RntRteL
	 */
	public short getIp65504P553RntRteL() throws CFException {
        if (isIp65504P553RntRteLModified()) { 
           ip65504P553RntRteL = refreshIp65504P553RntRteL();
        }
   		return ip65504P553RntRteL;
	}
	
	/**
	 * 	Update Ip65504P553RntRteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P553-RNT-RTE-L
	 *	@param number
	 */
	public void setIp65504P553RntRteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P553RntRteL = checkIp65504P553RntRteLMaxLimit(number); 
		serializeIp65504P553RntRteL(ip65504P553RntRteL);
	}

	public void setIp65504P553RntRteL(int number) {
	    number = checkIp65504P553RntRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P553RntRteL((short)number);
	}
	public void setIp65504P553RntRteL(long number) {
	    number = checkIp65504P553RntRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P553RntRteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P554ReservdS
	 *	@return ip65504P554ReservdS
	 */
	public short getIp65504P554ReservdS() throws CFException {
        if (isIp65504P554ReservdSModified()) { 
           ip65504P554ReservdS = refreshIp65504P554ReservdS();
        }
   		return ip65504P554ReservdS;
	}
	
	/**
	 * 	Update Ip65504P554ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P554-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P554ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P554ReservdS = checkIp65504P554ReservdSMaxLimit(number); 
		serializeIp65504P554ReservdS(ip65504P554ReservdS);
	}

	public void setIp65504P554ReservdS(int number) {
	    number = checkIp65504P554ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P554ReservdS((short)number);
	}
	public void setIp65504P554ReservdS(long number) {
	    number = checkIp65504P554ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P554ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P554ReservdL
	 *	@return ip65504P554ReservdL
	 */
	public short getIp65504P554ReservdL() throws CFException {
        if (isIp65504P554ReservdLModified()) { 
           ip65504P554ReservdL = refreshIp65504P554ReservdL();
        }
   		return ip65504P554ReservdL;
	}
	
	/**
	 * 	Update Ip65504P554ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P554-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P554ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P554ReservdL = checkIp65504P554ReservdLMaxLimit(number); 
		serializeIp65504P554ReservdL(ip65504P554ReservdL);
	}

	public void setIp65504P554ReservdL(int number) {
	    number = checkIp65504P554ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P554ReservdL((short)number);
	}
	public void setIp65504P554ReservdL(long number) {
	    number = checkIp65504P554ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P554ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P555RtPMlS
	 *	@return ip65504P555RtPMlS
	 */
	public short getIp65504P555RtPMlS() throws CFException {
        if (isIp65504P555RtPMlSModified()) { 
           ip65504P555RtPMlS = refreshIp65504P555RtPMlS();
        }
   		return ip65504P555RtPMlS;
	}
	
	/**
	 * 	Update Ip65504P555RtPMlS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P555-RT-P-ML-S
	 *	@param number
	 */
	public void setIp65504P555RtPMlS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P555RtPMlS = checkIp65504P555RtPMlSMaxLimit(number); 
		serializeIp65504P555RtPMlS(ip65504P555RtPMlS);
	}

	public void setIp65504P555RtPMlS(int number) {
	    number = checkIp65504P555RtPMlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P555RtPMlS((short)number);
	}
	public void setIp65504P555RtPMlS(long number) {
	    number = checkIp65504P555RtPMlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P555RtPMlS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P555RtPMlL
	 *	@return ip65504P555RtPMlL
	 */
	public short getIp65504P555RtPMlL() throws CFException {
        if (isIp65504P555RtPMlLModified()) { 
           ip65504P555RtPMlL = refreshIp65504P555RtPMlL();
        }
   		return ip65504P555RtPMlL;
	}
	
	/**
	 * 	Update Ip65504P555RtPMlL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P555-RT-P-ML-L
	 *	@param number
	 */
	public void setIp65504P555RtPMlL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P555RtPMlL = checkIp65504P555RtPMlLMaxLimit(number); 
		serializeIp65504P555RtPMlL(ip65504P555RtPMlL);
	}

	public void setIp65504P555RtPMlL(int number) {
	    number = checkIp65504P555RtPMlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P555RtPMlL((short)number);
	}
	public void setIp65504P555RtPMlL(long number) {
	    number = checkIp65504P555RtPMlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P555RtPMlL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P556TtlMlsS
	 *	@return ip65504P556TtlMlsS
	 */
	public short getIp65504P556TtlMlsS() throws CFException {
        if (isIp65504P556TtlMlsSModified()) { 
           ip65504P556TtlMlsS = refreshIp65504P556TtlMlsS();
        }
   		return ip65504P556TtlMlsS;
	}
	
	/**
	 * 	Update Ip65504P556TtlMlsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P556-TTL-MLS-S
	 *	@param number
	 */
	public void setIp65504P556TtlMlsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P556TtlMlsS = checkIp65504P556TtlMlsSMaxLimit(number); 
		serializeIp65504P556TtlMlsS(ip65504P556TtlMlsS);
	}

	public void setIp65504P556TtlMlsS(int number) {
	    number = checkIp65504P556TtlMlsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P556TtlMlsS((short)number);
	}
	public void setIp65504P556TtlMlsS(long number) {
	    number = checkIp65504P556TtlMlsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P556TtlMlsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P556TtlMlsL
	 *	@return ip65504P556TtlMlsL
	 */
	public short getIp65504P556TtlMlsL() throws CFException {
        if (isIp65504P556TtlMlsLModified()) { 
           ip65504P556TtlMlsL = refreshIp65504P556TtlMlsL();
        }
   		return ip65504P556TtlMlsL;
	}
	
	/**
	 * 	Update Ip65504P556TtlMlsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P556-TTL-MLS-L
	 *	@param number
	 */
	public void setIp65504P556TtlMlsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P556TtlMlsL = checkIp65504P556TtlMlsLMaxLimit(number); 
		serializeIp65504P556TtlMlsL(ip65504P556TtlMlsL);
	}

	public void setIp65504P556TtlMlsL(int number) {
	    number = checkIp65504P556TtlMlsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P556TtlMlsL((short)number);
	}
	public void setIp65504P556TtlMlsL(long number) {
	    number = checkIp65504P556TtlMlsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P556TtlMlsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P557MaxfreeS
	 *	@return ip65504P557MaxfreeS
	 */
	public short getIp65504P557MaxfreeS() throws CFException {
        if (isIp65504P557MaxfreeSModified()) { 
           ip65504P557MaxfreeS = refreshIp65504P557MaxfreeS();
        }
   		return ip65504P557MaxfreeS;
	}
	
	/**
	 * 	Update Ip65504P557MaxfreeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P557-MAXFREE-S
	 *	@param number
	 */
	public void setIp65504P557MaxfreeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P557MaxfreeS = checkIp65504P557MaxfreeSMaxLimit(number); 
		serializeIp65504P557MaxfreeS(ip65504P557MaxfreeS);
	}

	public void setIp65504P557MaxfreeS(int number) {
	    number = checkIp65504P557MaxfreeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P557MaxfreeS((short)number);
	}
	public void setIp65504P557MaxfreeS(long number) {
	    number = checkIp65504P557MaxfreeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P557MaxfreeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P557MaxfreeL
	 *	@return ip65504P557MaxfreeL
	 */
	public short getIp65504P557MaxfreeL() throws CFException {
        if (isIp65504P557MaxfreeLModified()) { 
           ip65504P557MaxfreeL = refreshIp65504P557MaxfreeL();
        }
   		return ip65504P557MaxfreeL;
	}
	
	/**
	 * 	Update Ip65504P557MaxfreeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P557-MAXFREE-L
	 *	@param number
	 */
	public void setIp65504P557MaxfreeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P557MaxfreeL = checkIp65504P557MaxfreeLMaxLimit(number); 
		serializeIp65504P557MaxfreeL(ip65504P557MaxfreeL);
	}

	public void setIp65504P557MaxfreeL(int number) {
	    number = checkIp65504P557MaxfreeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P557MaxfreeL((short)number);
	}
	public void setIp65504P557MaxfreeL(long number) {
	    number = checkIp65504P557MaxfreeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P557MaxfreeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P558MiKmIS
	 *	@return ip65504P558MiKmIS
	 */
	public short getIp65504P558MiKmIS() throws CFException {
        if (isIp65504P558MiKmISModified()) { 
           ip65504P558MiKmIS = refreshIp65504P558MiKmIS();
        }
   		return ip65504P558MiKmIS;
	}
	
	/**
	 * 	Update Ip65504P558MiKmIS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P558-MI-KM-I-S
	 *	@param number
	 */
	public void setIp65504P558MiKmIS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P558MiKmIS = checkIp65504P558MiKmISMaxLimit(number); 
		serializeIp65504P558MiKmIS(ip65504P558MiKmIS);
	}

	public void setIp65504P558MiKmIS(int number) {
	    number = checkIp65504P558MiKmISMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P558MiKmIS((short)number);
	}
	public void setIp65504P558MiKmIS(long number) {
	    number = checkIp65504P558MiKmISMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P558MiKmIS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P558MiKmIL
	 *	@return ip65504P558MiKmIL
	 */
	public short getIp65504P558MiKmIL() throws CFException {
        if (isIp65504P558MiKmILModified()) { 
           ip65504P558MiKmIL = refreshIp65504P558MiKmIL();
        }
   		return ip65504P558MiKmIL;
	}
	
	/**
	 * 	Update Ip65504P558MiKmIL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P558-MI-KM-I-L
	 *	@param number
	 */
	public void setIp65504P558MiKmIL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P558MiKmIL = checkIp65504P558MiKmILMaxLimit(number); 
		serializeIp65504P558MiKmIL(ip65504P558MiKmIL);
	}

	public void setIp65504P558MiKmIL(int number) {
	    number = checkIp65504P558MiKmILMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P558MiKmIL((short)number);
	}
	public void setIp65504P558MiKmIL(long number) {
	    number = checkIp65504P558MiKmILMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P558MiKmIL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P528CoupNoS((short)0);
         	setIp65504P528CoupNoL((short)0);
         	setIp65504P529FarebasS((short)0);
         	setIp65504P529FarebasL((short)0);
         	setIp65504P530FltNbrS((short)0);
         	setIp65504P530FltNbrL((short)0);
         	setIp65504P531DeptTmS((short)0);
         	setIp65504P531DeptTmL((short)0);
         	setIp65504P532ReservdS((short)0);
         	setIp65504P532ReservdL((short)0);
         	setIp65504P533ArrvTmS((short)0);
         	setIp65504P533ArrvTmL((short)0);
         	setIp65504P534ReservdS((short)0);
         	setIp65504P534ReservdL((short)0);
         	setIp65504P535FareXxS((short)0);
         	setIp65504P535FareXxL((short)0);
         	setIp65504P536FeeXxxS((short)0);
         	setIp65504P536FeeXxxL((short)0);
         	setIp65504P537TaxesXS((short)0);
         	setIp65504P537TaxesSL((short)0);
         	setIp65504P538EndorseS((short)0);
         	setIp65504P538EndorseL((short)0);
         	setIp65504P539ReservdS((short)0);
         	setIp65504P539ReservdL((short)0);
         	setIp65504P540ReservdS((short)0);
         	setIp65504P540ReservdL((short)0);
         	setIp65504P541ReservdS((short)0);
         	setIp65504P541ReservdL((short)0);
         	setIp65504P542ReservdS((short)0);
         	setIp65504P542ReservdL((short)0);
         	setIp65504P543ReservdS((short)0);
         	setIp65504P543ReservdL((short)0);
         	setIp65504P544RentNoS((short)0);
         	setIp65504P544RentNoL((short)0);
         	setIp65504P545RentNmS((short)0);
         	setIp65504P545RentNmL((short)0);
         	setIp65504P546RentCyS((short)0);
         	setIp65504P546RentCyL((short)0);
         	setIp65504P547RentStS((short)0);
         	setIp65504P547RentStL((short)0);
         	setIp65504P548RntCtyS((short)0);
         	setIp65504P548RntCtyL((short)0);
         	setIp65504P549RntLocS((short)0);
         	setIp65504P549RntLocL((short)0);
         	setIp65504P550RntRetS((short)0);
         	setIp65504P550RntRetL((short)0);
         	setIp65504P551RntChkS((short)0);
         	setIp65504P551RntChkL((short)0);
         	setIp65504P552CusSvcS((short)0);
         	setIp65504P552CusSvcL((short)0);
         	setIp65504P553RntRteS((short)0);
         	setIp65504P553RntRteL((short)0);
         	setIp65504P554ReservdS((short)0);
         	setIp65504P554ReservdL((short)0);
         	setIp65504P555RtPMlS((short)0);
         	setIp65504P555RtPMlL((short)0);
         	setIp65504P556TtlMlsS((short)0);
         	setIp65504P556TtlMlsL((short)0);
         	setIp65504P557MaxfreeS((short)0);
         	setIp65504P557MaxfreeL((short)0);
         	setIp65504P558MiKmIS((short)0);
         	setIp65504P558MiKmIL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup18FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_18_LENGTH;
		}

}
  
