package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup11 extends Ip65504PdsNamesLargeGroup11Serialized { 
   

								private short ip65504P311CrRamtS;

								private short ip65504P311CrRamtL;


								private short ip65504P312DbNumbS;

								private short ip65504P312DbNumbL;


								private short ip65504P313CrNmbrS;

								private short ip65504P313CrNmbrL;


								private short ip65504P314DbcbamtS;

								private short ip65504P314DbcbamtL;


								private short ip65504P315CrcbamtS;

								private short ip65504P315CrcbamtL;


								private short ip65504P316DbrvamtS;

								private short ip65504P316DbrvamtL;


								private short ip65504P317CrrvamtS;

								private short ip65504P317CrrvamtL;


								private short ip65504P318DbrvfeeS;

								private short ip65504P318DbrvfeeL;


								private short ip65504P319CrrvfeeS;

								private short ip65504P319CrrvfeeL;


								private short ip65504P320DbrvnbrS;

								private short ip65504P320DbrvnbrL;


								private short ip65504P321CrrvnbrS;

								private short ip65504P321CrrvnbrL;


								private short ip65504P322DbcbnbrS;

								private short ip65504P322DbcbnbrL;


								private short ip65504P323CrcbnbrS;

								private short ip65504P323CrcbnbrL;


								private short ip65504P324Db2damtS;

								private short ip65504P324Db2damtL;


								private short ip65504P325Cr2damtS;

								private short ip65504P325Cr2damtL;


								private short ip65504P326Db2dfeeS;

								private short ip65504P326Db2dfeeL;


								private short ip65504P327Cr2dfeeS;

								private short ip65504P327Cr2dfeeL;


								private short ip65504P328Dbrv2atS;

								private short ip65504P328Dbrv2atL;


								private short ip65504P329Crrv2atS;

								private short ip65504P329Crrv2atL;


								private short ip65504P330Dbrv2feS;

								private short ip65504P330Dbrv2feL;


								private short ip65504P331Crrv2feS;

								private short ip65504P331Crrv2feL;


								private short ip65504P332ReservdS;

								private short ip65504P332ReservdL;


								private short ip65504P333ReservdS;

								private short ip65504P333ReservdL;


								private short ip65504P334ReservdS;

								private short ip65504P334ReservdL;


								private short ip65504P335ReservdS;

								private short ip65504P335ReservdL;


								private short ip65504P336ReservdS;

								private short ip65504P336ReservdL;


								private short ip65504P337ReservdS;

								private short ip65504P337ReservdL;


								private short ip65504P338ReservdS;

								private short ip65504P338ReservdL;


								private short ip65504P339ReservdS;

								private short ip65504P339ReservdL;


								private short ip65504P340ReservdS;

								private short ip65504P340ReservdL;


								private short ip65504P341ReservdS;

								private short ip65504P341ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup11
	**/
    public Ip65504PdsNamesLargeGroup11() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup11. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup11(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P311CrRamtS
	 *	@return ip65504P311CrRamtS
	 */
	public short getIp65504P311CrRamtS() throws CFException {
        if (isIp65504P311CrRamtSModified()) { 
           ip65504P311CrRamtS = refreshIp65504P311CrRamtS();
        }
   		return ip65504P311CrRamtS;
	}
	
	/**
	 * 	Update Ip65504P311CrRamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P311-CR-RAMT-S
	 *	@param number
	 */
	public void setIp65504P311CrRamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P311CrRamtS = checkIp65504P311CrRamtSMaxLimit(number); 
		serializeIp65504P311CrRamtS(ip65504P311CrRamtS);
	}

	public void setIp65504P311CrRamtS(int number) {
	    number = checkIp65504P311CrRamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P311CrRamtS((short)number);
	}
	public void setIp65504P311CrRamtS(long number) {
	    number = checkIp65504P311CrRamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P311CrRamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P311CrRamtL
	 *	@return ip65504P311CrRamtL
	 */
	public short getIp65504P311CrRamtL() throws CFException {
        if (isIp65504P311CrRamtLModified()) { 
           ip65504P311CrRamtL = refreshIp65504P311CrRamtL();
        }
   		return ip65504P311CrRamtL;
	}
	
	/**
	 * 	Update Ip65504P311CrRamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P311-CR-RAMT-L
	 *	@param number
	 */
	public void setIp65504P311CrRamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P311CrRamtL = checkIp65504P311CrRamtLMaxLimit(number); 
		serializeIp65504P311CrRamtL(ip65504P311CrRamtL);
	}

	public void setIp65504P311CrRamtL(int number) {
	    number = checkIp65504P311CrRamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P311CrRamtL((short)number);
	}
	public void setIp65504P311CrRamtL(long number) {
	    number = checkIp65504P311CrRamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P311CrRamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P312DbNumbS
	 *	@return ip65504P312DbNumbS
	 */
	public short getIp65504P312DbNumbS() throws CFException {
        if (isIp65504P312DbNumbSModified()) { 
           ip65504P312DbNumbS = refreshIp65504P312DbNumbS();
        }
   		return ip65504P312DbNumbS;
	}
	
	/**
	 * 	Update Ip65504P312DbNumbS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P312-DB-NUMB-S
	 *	@param number
	 */
	public void setIp65504P312DbNumbS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P312DbNumbS = checkIp65504P312DbNumbSMaxLimit(number); 
		serializeIp65504P312DbNumbS(ip65504P312DbNumbS);
	}

	public void setIp65504P312DbNumbS(int number) {
	    number = checkIp65504P312DbNumbSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P312DbNumbS((short)number);
	}
	public void setIp65504P312DbNumbS(long number) {
	    number = checkIp65504P312DbNumbSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P312DbNumbS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P312DbNumbL
	 *	@return ip65504P312DbNumbL
	 */
	public short getIp65504P312DbNumbL() throws CFException {
        if (isIp65504P312DbNumbLModified()) { 
           ip65504P312DbNumbL = refreshIp65504P312DbNumbL();
        }
   		return ip65504P312DbNumbL;
	}
	
	/**
	 * 	Update Ip65504P312DbNumbL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P312-DB-NUMB-L
	 *	@param number
	 */
	public void setIp65504P312DbNumbL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P312DbNumbL = checkIp65504P312DbNumbLMaxLimit(number); 
		serializeIp65504P312DbNumbL(ip65504P312DbNumbL);
	}

	public void setIp65504P312DbNumbL(int number) {
	    number = checkIp65504P312DbNumbLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P312DbNumbL((short)number);
	}
	public void setIp65504P312DbNumbL(long number) {
	    number = checkIp65504P312DbNumbLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P312DbNumbL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P313CrNmbrS
	 *	@return ip65504P313CrNmbrS
	 */
	public short getIp65504P313CrNmbrS() throws CFException {
        if (isIp65504P313CrNmbrSModified()) { 
           ip65504P313CrNmbrS = refreshIp65504P313CrNmbrS();
        }
   		return ip65504P313CrNmbrS;
	}
	
	/**
	 * 	Update Ip65504P313CrNmbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P313-CR-NMBR-S
	 *	@param number
	 */
	public void setIp65504P313CrNmbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P313CrNmbrS = checkIp65504P313CrNmbrSMaxLimit(number); 
		serializeIp65504P313CrNmbrS(ip65504P313CrNmbrS);
	}

	public void setIp65504P313CrNmbrS(int number) {
	    number = checkIp65504P313CrNmbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P313CrNmbrS((short)number);
	}
	public void setIp65504P313CrNmbrS(long number) {
	    number = checkIp65504P313CrNmbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P313CrNmbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P313CrNmbrL
	 *	@return ip65504P313CrNmbrL
	 */
	public short getIp65504P313CrNmbrL() throws CFException {
        if (isIp65504P313CrNmbrLModified()) { 
           ip65504P313CrNmbrL = refreshIp65504P313CrNmbrL();
        }
   		return ip65504P313CrNmbrL;
	}
	
	/**
	 * 	Update Ip65504P313CrNmbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P313-CR-NMBR-L
	 *	@param number
	 */
	public void setIp65504P313CrNmbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P313CrNmbrL = checkIp65504P313CrNmbrLMaxLimit(number); 
		serializeIp65504P313CrNmbrL(ip65504P313CrNmbrL);
	}

	public void setIp65504P313CrNmbrL(int number) {
	    number = checkIp65504P313CrNmbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P313CrNmbrL((short)number);
	}
	public void setIp65504P313CrNmbrL(long number) {
	    number = checkIp65504P313CrNmbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P313CrNmbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P314DbcbamtS
	 *	@return ip65504P314DbcbamtS
	 */
	public short getIp65504P314DbcbamtS() throws CFException {
        if (isIp65504P314DbcbamtSModified()) { 
           ip65504P314DbcbamtS = refreshIp65504P314DbcbamtS();
        }
   		return ip65504P314DbcbamtS;
	}
	
	/**
	 * 	Update Ip65504P314DbcbamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P314-DBCBAMT-S
	 *	@param number
	 */
	public void setIp65504P314DbcbamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P314DbcbamtS = checkIp65504P314DbcbamtSMaxLimit(number); 
		serializeIp65504P314DbcbamtS(ip65504P314DbcbamtS);
	}

	public void setIp65504P314DbcbamtS(int number) {
	    number = checkIp65504P314DbcbamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P314DbcbamtS((short)number);
	}
	public void setIp65504P314DbcbamtS(long number) {
	    number = checkIp65504P314DbcbamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P314DbcbamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P314DbcbamtL
	 *	@return ip65504P314DbcbamtL
	 */
	public short getIp65504P314DbcbamtL() throws CFException {
        if (isIp65504P314DbcbamtLModified()) { 
           ip65504P314DbcbamtL = refreshIp65504P314DbcbamtL();
        }
   		return ip65504P314DbcbamtL;
	}
	
	/**
	 * 	Update Ip65504P314DbcbamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P314-DBCBAMT-L
	 *	@param number
	 */
	public void setIp65504P314DbcbamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P314DbcbamtL = checkIp65504P314DbcbamtLMaxLimit(number); 
		serializeIp65504P314DbcbamtL(ip65504P314DbcbamtL);
	}

	public void setIp65504P314DbcbamtL(int number) {
	    number = checkIp65504P314DbcbamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P314DbcbamtL((short)number);
	}
	public void setIp65504P314DbcbamtL(long number) {
	    number = checkIp65504P314DbcbamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P314DbcbamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P315CrcbamtS
	 *	@return ip65504P315CrcbamtS
	 */
	public short getIp65504P315CrcbamtS() throws CFException {
        if (isIp65504P315CrcbamtSModified()) { 
           ip65504P315CrcbamtS = refreshIp65504P315CrcbamtS();
        }
   		return ip65504P315CrcbamtS;
	}
	
	/**
	 * 	Update Ip65504P315CrcbamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P315-CRCBAMT-S
	 *	@param number
	 */
	public void setIp65504P315CrcbamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P315CrcbamtS = checkIp65504P315CrcbamtSMaxLimit(number); 
		serializeIp65504P315CrcbamtS(ip65504P315CrcbamtS);
	}

	public void setIp65504P315CrcbamtS(int number) {
	    number = checkIp65504P315CrcbamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P315CrcbamtS((short)number);
	}
	public void setIp65504P315CrcbamtS(long number) {
	    number = checkIp65504P315CrcbamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P315CrcbamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P315CrcbamtL
	 *	@return ip65504P315CrcbamtL
	 */
	public short getIp65504P315CrcbamtL() throws CFException {
        if (isIp65504P315CrcbamtLModified()) { 
           ip65504P315CrcbamtL = refreshIp65504P315CrcbamtL();
        }
   		return ip65504P315CrcbamtL;
	}
	
	/**
	 * 	Update Ip65504P315CrcbamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P315-CRCBAMT-L
	 *	@param number
	 */
	public void setIp65504P315CrcbamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P315CrcbamtL = checkIp65504P315CrcbamtLMaxLimit(number); 
		serializeIp65504P315CrcbamtL(ip65504P315CrcbamtL);
	}

	public void setIp65504P315CrcbamtL(int number) {
	    number = checkIp65504P315CrcbamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P315CrcbamtL((short)number);
	}
	public void setIp65504P315CrcbamtL(long number) {
	    number = checkIp65504P315CrcbamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P315CrcbamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P316DbrvamtS
	 *	@return ip65504P316DbrvamtS
	 */
	public short getIp65504P316DbrvamtS() throws CFException {
        if (isIp65504P316DbrvamtSModified()) { 
           ip65504P316DbrvamtS = refreshIp65504P316DbrvamtS();
        }
   		return ip65504P316DbrvamtS;
	}
	
	/**
	 * 	Update Ip65504P316DbrvamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P316-DBRVAMT-S
	 *	@param number
	 */
	public void setIp65504P316DbrvamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P316DbrvamtS = checkIp65504P316DbrvamtSMaxLimit(number); 
		serializeIp65504P316DbrvamtS(ip65504P316DbrvamtS);
	}

	public void setIp65504P316DbrvamtS(int number) {
	    number = checkIp65504P316DbrvamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P316DbrvamtS((short)number);
	}
	public void setIp65504P316DbrvamtS(long number) {
	    number = checkIp65504P316DbrvamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P316DbrvamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P316DbrvamtL
	 *	@return ip65504P316DbrvamtL
	 */
	public short getIp65504P316DbrvamtL() throws CFException {
        if (isIp65504P316DbrvamtLModified()) { 
           ip65504P316DbrvamtL = refreshIp65504P316DbrvamtL();
        }
   		return ip65504P316DbrvamtL;
	}
	
	/**
	 * 	Update Ip65504P316DbrvamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P316-DBRVAMT-L
	 *	@param number
	 */
	public void setIp65504P316DbrvamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P316DbrvamtL = checkIp65504P316DbrvamtLMaxLimit(number); 
		serializeIp65504P316DbrvamtL(ip65504P316DbrvamtL);
	}

	public void setIp65504P316DbrvamtL(int number) {
	    number = checkIp65504P316DbrvamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P316DbrvamtL((short)number);
	}
	public void setIp65504P316DbrvamtL(long number) {
	    number = checkIp65504P316DbrvamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P316DbrvamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P317CrrvamtS
	 *	@return ip65504P317CrrvamtS
	 */
	public short getIp65504P317CrrvamtS() throws CFException {
        if (isIp65504P317CrrvamtSModified()) { 
           ip65504P317CrrvamtS = refreshIp65504P317CrrvamtS();
        }
   		return ip65504P317CrrvamtS;
	}
	
	/**
	 * 	Update Ip65504P317CrrvamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P317-CRRVAMT-S
	 *	@param number
	 */
	public void setIp65504P317CrrvamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P317CrrvamtS = checkIp65504P317CrrvamtSMaxLimit(number); 
		serializeIp65504P317CrrvamtS(ip65504P317CrrvamtS);
	}

	public void setIp65504P317CrrvamtS(int number) {
	    number = checkIp65504P317CrrvamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P317CrrvamtS((short)number);
	}
	public void setIp65504P317CrrvamtS(long number) {
	    number = checkIp65504P317CrrvamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P317CrrvamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P317CrrvamtL
	 *	@return ip65504P317CrrvamtL
	 */
	public short getIp65504P317CrrvamtL() throws CFException {
        if (isIp65504P317CrrvamtLModified()) { 
           ip65504P317CrrvamtL = refreshIp65504P317CrrvamtL();
        }
   		return ip65504P317CrrvamtL;
	}
	
	/**
	 * 	Update Ip65504P317CrrvamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P317-CRRVAMT-L
	 *	@param number
	 */
	public void setIp65504P317CrrvamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P317CrrvamtL = checkIp65504P317CrrvamtLMaxLimit(number); 
		serializeIp65504P317CrrvamtL(ip65504P317CrrvamtL);
	}

	public void setIp65504P317CrrvamtL(int number) {
	    number = checkIp65504P317CrrvamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P317CrrvamtL((short)number);
	}
	public void setIp65504P317CrrvamtL(long number) {
	    number = checkIp65504P317CrrvamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P317CrrvamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P318DbrvfeeS
	 *	@return ip65504P318DbrvfeeS
	 */
	public short getIp65504P318DbrvfeeS() throws CFException {
        if (isIp65504P318DbrvfeeSModified()) { 
           ip65504P318DbrvfeeS = refreshIp65504P318DbrvfeeS();
        }
   		return ip65504P318DbrvfeeS;
	}
	
	/**
	 * 	Update Ip65504P318DbrvfeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P318-DBRVFEE-S
	 *	@param number
	 */
	public void setIp65504P318DbrvfeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P318DbrvfeeS = checkIp65504P318DbrvfeeSMaxLimit(number); 
		serializeIp65504P318DbrvfeeS(ip65504P318DbrvfeeS);
	}

	public void setIp65504P318DbrvfeeS(int number) {
	    number = checkIp65504P318DbrvfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P318DbrvfeeS((short)number);
	}
	public void setIp65504P318DbrvfeeS(long number) {
	    number = checkIp65504P318DbrvfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P318DbrvfeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P318DbrvfeeL
	 *	@return ip65504P318DbrvfeeL
	 */
	public short getIp65504P318DbrvfeeL() throws CFException {
        if (isIp65504P318DbrvfeeLModified()) { 
           ip65504P318DbrvfeeL = refreshIp65504P318DbrvfeeL();
        }
   		return ip65504P318DbrvfeeL;
	}
	
	/**
	 * 	Update Ip65504P318DbrvfeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P318-DBRVFEE-L
	 *	@param number
	 */
	public void setIp65504P318DbrvfeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P318DbrvfeeL = checkIp65504P318DbrvfeeLMaxLimit(number); 
		serializeIp65504P318DbrvfeeL(ip65504P318DbrvfeeL);
	}

	public void setIp65504P318DbrvfeeL(int number) {
	    number = checkIp65504P318DbrvfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P318DbrvfeeL((short)number);
	}
	public void setIp65504P318DbrvfeeL(long number) {
	    number = checkIp65504P318DbrvfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P318DbrvfeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P319CrrvfeeS
	 *	@return ip65504P319CrrvfeeS
	 */
	public short getIp65504P319CrrvfeeS() throws CFException {
        if (isIp65504P319CrrvfeeSModified()) { 
           ip65504P319CrrvfeeS = refreshIp65504P319CrrvfeeS();
        }
   		return ip65504P319CrrvfeeS;
	}
	
	/**
	 * 	Update Ip65504P319CrrvfeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P319-CRRVFEE-S
	 *	@param number
	 */
	public void setIp65504P319CrrvfeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P319CrrvfeeS = checkIp65504P319CrrvfeeSMaxLimit(number); 
		serializeIp65504P319CrrvfeeS(ip65504P319CrrvfeeS);
	}

	public void setIp65504P319CrrvfeeS(int number) {
	    number = checkIp65504P319CrrvfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P319CrrvfeeS((short)number);
	}
	public void setIp65504P319CrrvfeeS(long number) {
	    number = checkIp65504P319CrrvfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P319CrrvfeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P319CrrvfeeL
	 *	@return ip65504P319CrrvfeeL
	 */
	public short getIp65504P319CrrvfeeL() throws CFException {
        if (isIp65504P319CrrvfeeLModified()) { 
           ip65504P319CrrvfeeL = refreshIp65504P319CrrvfeeL();
        }
   		return ip65504P319CrrvfeeL;
	}
	
	/**
	 * 	Update Ip65504P319CrrvfeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P319-CRRVFEE-L
	 *	@param number
	 */
	public void setIp65504P319CrrvfeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P319CrrvfeeL = checkIp65504P319CrrvfeeLMaxLimit(number); 
		serializeIp65504P319CrrvfeeL(ip65504P319CrrvfeeL);
	}

	public void setIp65504P319CrrvfeeL(int number) {
	    number = checkIp65504P319CrrvfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P319CrrvfeeL((short)number);
	}
	public void setIp65504P319CrrvfeeL(long number) {
	    number = checkIp65504P319CrrvfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P319CrrvfeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P320DbrvnbrS
	 *	@return ip65504P320DbrvnbrS
	 */
	public short getIp65504P320DbrvnbrS() throws CFException {
        if (isIp65504P320DbrvnbrSModified()) { 
           ip65504P320DbrvnbrS = refreshIp65504P320DbrvnbrS();
        }
   		return ip65504P320DbrvnbrS;
	}
	
	/**
	 * 	Update Ip65504P320DbrvnbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P320-DBRVNBR-S
	 *	@param number
	 */
	public void setIp65504P320DbrvnbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P320DbrvnbrS = checkIp65504P320DbrvnbrSMaxLimit(number); 
		serializeIp65504P320DbrvnbrS(ip65504P320DbrvnbrS);
	}

	public void setIp65504P320DbrvnbrS(int number) {
	    number = checkIp65504P320DbrvnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P320DbrvnbrS((short)number);
	}
	public void setIp65504P320DbrvnbrS(long number) {
	    number = checkIp65504P320DbrvnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P320DbrvnbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P320DbrvnbrL
	 *	@return ip65504P320DbrvnbrL
	 */
	public short getIp65504P320DbrvnbrL() throws CFException {
        if (isIp65504P320DbrvnbrLModified()) { 
           ip65504P320DbrvnbrL = refreshIp65504P320DbrvnbrL();
        }
   		return ip65504P320DbrvnbrL;
	}
	
	/**
	 * 	Update Ip65504P320DbrvnbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P320-DBRVNBR-L
	 *	@param number
	 */
	public void setIp65504P320DbrvnbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P320DbrvnbrL = checkIp65504P320DbrvnbrLMaxLimit(number); 
		serializeIp65504P320DbrvnbrL(ip65504P320DbrvnbrL);
	}

	public void setIp65504P320DbrvnbrL(int number) {
	    number = checkIp65504P320DbrvnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P320DbrvnbrL((short)number);
	}
	public void setIp65504P320DbrvnbrL(long number) {
	    number = checkIp65504P320DbrvnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P320DbrvnbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P321CrrvnbrS
	 *	@return ip65504P321CrrvnbrS
	 */
	public short getIp65504P321CrrvnbrS() throws CFException {
        if (isIp65504P321CrrvnbrSModified()) { 
           ip65504P321CrrvnbrS = refreshIp65504P321CrrvnbrS();
        }
   		return ip65504P321CrrvnbrS;
	}
	
	/**
	 * 	Update Ip65504P321CrrvnbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P321-CRRVNBR-S
	 *	@param number
	 */
	public void setIp65504P321CrrvnbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P321CrrvnbrS = checkIp65504P321CrrvnbrSMaxLimit(number); 
		serializeIp65504P321CrrvnbrS(ip65504P321CrrvnbrS);
	}

	public void setIp65504P321CrrvnbrS(int number) {
	    number = checkIp65504P321CrrvnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P321CrrvnbrS((short)number);
	}
	public void setIp65504P321CrrvnbrS(long number) {
	    number = checkIp65504P321CrrvnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P321CrrvnbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P321CrrvnbrL
	 *	@return ip65504P321CrrvnbrL
	 */
	public short getIp65504P321CrrvnbrL() throws CFException {
        if (isIp65504P321CrrvnbrLModified()) { 
           ip65504P321CrrvnbrL = refreshIp65504P321CrrvnbrL();
        }
   		return ip65504P321CrrvnbrL;
	}
	
	/**
	 * 	Update Ip65504P321CrrvnbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P321-CRRVNBR-L
	 *	@param number
	 */
	public void setIp65504P321CrrvnbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P321CrrvnbrL = checkIp65504P321CrrvnbrLMaxLimit(number); 
		serializeIp65504P321CrrvnbrL(ip65504P321CrrvnbrL);
	}

	public void setIp65504P321CrrvnbrL(int number) {
	    number = checkIp65504P321CrrvnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P321CrrvnbrL((short)number);
	}
	public void setIp65504P321CrrvnbrL(long number) {
	    number = checkIp65504P321CrrvnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P321CrrvnbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P322DbcbnbrS
	 *	@return ip65504P322DbcbnbrS
	 */
	public short getIp65504P322DbcbnbrS() throws CFException {
        if (isIp65504P322DbcbnbrSModified()) { 
           ip65504P322DbcbnbrS = refreshIp65504P322DbcbnbrS();
        }
   		return ip65504P322DbcbnbrS;
	}
	
	/**
	 * 	Update Ip65504P322DbcbnbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P322-DBCBNBR-S
	 *	@param number
	 */
	public void setIp65504P322DbcbnbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P322DbcbnbrS = checkIp65504P322DbcbnbrSMaxLimit(number); 
		serializeIp65504P322DbcbnbrS(ip65504P322DbcbnbrS);
	}

	public void setIp65504P322DbcbnbrS(int number) {
	    number = checkIp65504P322DbcbnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P322DbcbnbrS((short)number);
	}
	public void setIp65504P322DbcbnbrS(long number) {
	    number = checkIp65504P322DbcbnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P322DbcbnbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P322DbcbnbrL
	 *	@return ip65504P322DbcbnbrL
	 */
	public short getIp65504P322DbcbnbrL() throws CFException {
        if (isIp65504P322DbcbnbrLModified()) { 
           ip65504P322DbcbnbrL = refreshIp65504P322DbcbnbrL();
        }
   		return ip65504P322DbcbnbrL;
	}
	
	/**
	 * 	Update Ip65504P322DbcbnbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P322-DBCBNBR-L
	 *	@param number
	 */
	public void setIp65504P322DbcbnbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P322DbcbnbrL = checkIp65504P322DbcbnbrLMaxLimit(number); 
		serializeIp65504P322DbcbnbrL(ip65504P322DbcbnbrL);
	}

	public void setIp65504P322DbcbnbrL(int number) {
	    number = checkIp65504P322DbcbnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P322DbcbnbrL((short)number);
	}
	public void setIp65504P322DbcbnbrL(long number) {
	    number = checkIp65504P322DbcbnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P322DbcbnbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P323CrcbnbrS
	 *	@return ip65504P323CrcbnbrS
	 */
	public short getIp65504P323CrcbnbrS() throws CFException {
        if (isIp65504P323CrcbnbrSModified()) { 
           ip65504P323CrcbnbrS = refreshIp65504P323CrcbnbrS();
        }
   		return ip65504P323CrcbnbrS;
	}
	
	/**
	 * 	Update Ip65504P323CrcbnbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P323-CRCBNBR-S
	 *	@param number
	 */
	public void setIp65504P323CrcbnbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P323CrcbnbrS = checkIp65504P323CrcbnbrSMaxLimit(number); 
		serializeIp65504P323CrcbnbrS(ip65504P323CrcbnbrS);
	}

	public void setIp65504P323CrcbnbrS(int number) {
	    number = checkIp65504P323CrcbnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P323CrcbnbrS((short)number);
	}
	public void setIp65504P323CrcbnbrS(long number) {
	    number = checkIp65504P323CrcbnbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P323CrcbnbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P323CrcbnbrL
	 *	@return ip65504P323CrcbnbrL
	 */
	public short getIp65504P323CrcbnbrL() throws CFException {
        if (isIp65504P323CrcbnbrLModified()) { 
           ip65504P323CrcbnbrL = refreshIp65504P323CrcbnbrL();
        }
   		return ip65504P323CrcbnbrL;
	}
	
	/**
	 * 	Update Ip65504P323CrcbnbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P323-CRCBNBR-L
	 *	@param number
	 */
	public void setIp65504P323CrcbnbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P323CrcbnbrL = checkIp65504P323CrcbnbrLMaxLimit(number); 
		serializeIp65504P323CrcbnbrL(ip65504P323CrcbnbrL);
	}

	public void setIp65504P323CrcbnbrL(int number) {
	    number = checkIp65504P323CrcbnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P323CrcbnbrL((short)number);
	}
	public void setIp65504P323CrcbnbrL(long number) {
	    number = checkIp65504P323CrcbnbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P323CrcbnbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P324Db2damtS
	 *	@return ip65504P324Db2damtS
	 */
	public short getIp65504P324Db2damtS() throws CFException {
        if (isIp65504P324Db2damtSModified()) { 
           ip65504P324Db2damtS = refreshIp65504P324Db2damtS();
        }
   		return ip65504P324Db2damtS;
	}
	
	/**
	 * 	Update Ip65504P324Db2damtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P324-DB2DAMT-S
	 *	@param number
	 */
	public void setIp65504P324Db2damtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P324Db2damtS = checkIp65504P324Db2damtSMaxLimit(number); 
		serializeIp65504P324Db2damtS(ip65504P324Db2damtS);
	}

	public void setIp65504P324Db2damtS(int number) {
	    number = checkIp65504P324Db2damtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P324Db2damtS((short)number);
	}
	public void setIp65504P324Db2damtS(long number) {
	    number = checkIp65504P324Db2damtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P324Db2damtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P324Db2damtL
	 *	@return ip65504P324Db2damtL
	 */
	public short getIp65504P324Db2damtL() throws CFException {
        if (isIp65504P324Db2damtLModified()) { 
           ip65504P324Db2damtL = refreshIp65504P324Db2damtL();
        }
   		return ip65504P324Db2damtL;
	}
	
	/**
	 * 	Update Ip65504P324Db2damtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P324-DB2DAMT-L
	 *	@param number
	 */
	public void setIp65504P324Db2damtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P324Db2damtL = checkIp65504P324Db2damtLMaxLimit(number); 
		serializeIp65504P324Db2damtL(ip65504P324Db2damtL);
	}

	public void setIp65504P324Db2damtL(int number) {
	    number = checkIp65504P324Db2damtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P324Db2damtL((short)number);
	}
	public void setIp65504P324Db2damtL(long number) {
	    number = checkIp65504P324Db2damtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P324Db2damtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P325Cr2damtS
	 *	@return ip65504P325Cr2damtS
	 */
	public short getIp65504P325Cr2damtS() throws CFException {
        if (isIp65504P325Cr2damtSModified()) { 
           ip65504P325Cr2damtS = refreshIp65504P325Cr2damtS();
        }
   		return ip65504P325Cr2damtS;
	}
	
	/**
	 * 	Update Ip65504P325Cr2damtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P325-CR2DAMT-S
	 *	@param number
	 */
	public void setIp65504P325Cr2damtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P325Cr2damtS = checkIp65504P325Cr2damtSMaxLimit(number); 
		serializeIp65504P325Cr2damtS(ip65504P325Cr2damtS);
	}

	public void setIp65504P325Cr2damtS(int number) {
	    number = checkIp65504P325Cr2damtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P325Cr2damtS((short)number);
	}
	public void setIp65504P325Cr2damtS(long number) {
	    number = checkIp65504P325Cr2damtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P325Cr2damtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P325Cr2damtL
	 *	@return ip65504P325Cr2damtL
	 */
	public short getIp65504P325Cr2damtL() throws CFException {
        if (isIp65504P325Cr2damtLModified()) { 
           ip65504P325Cr2damtL = refreshIp65504P325Cr2damtL();
        }
   		return ip65504P325Cr2damtL;
	}
	
	/**
	 * 	Update Ip65504P325Cr2damtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P325-CR2DAMT-L
	 *	@param number
	 */
	public void setIp65504P325Cr2damtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P325Cr2damtL = checkIp65504P325Cr2damtLMaxLimit(number); 
		serializeIp65504P325Cr2damtL(ip65504P325Cr2damtL);
	}

	public void setIp65504P325Cr2damtL(int number) {
	    number = checkIp65504P325Cr2damtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P325Cr2damtL((short)number);
	}
	public void setIp65504P325Cr2damtL(long number) {
	    number = checkIp65504P325Cr2damtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P325Cr2damtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P326Db2dfeeS
	 *	@return ip65504P326Db2dfeeS
	 */
	public short getIp65504P326Db2dfeeS() throws CFException {
        if (isIp65504P326Db2dfeeSModified()) { 
           ip65504P326Db2dfeeS = refreshIp65504P326Db2dfeeS();
        }
   		return ip65504P326Db2dfeeS;
	}
	
	/**
	 * 	Update Ip65504P326Db2dfeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P326-DB2DFEE-S
	 *	@param number
	 */
	public void setIp65504P326Db2dfeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P326Db2dfeeS = checkIp65504P326Db2dfeeSMaxLimit(number); 
		serializeIp65504P326Db2dfeeS(ip65504P326Db2dfeeS);
	}

	public void setIp65504P326Db2dfeeS(int number) {
	    number = checkIp65504P326Db2dfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P326Db2dfeeS((short)number);
	}
	public void setIp65504P326Db2dfeeS(long number) {
	    number = checkIp65504P326Db2dfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P326Db2dfeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P326Db2dfeeL
	 *	@return ip65504P326Db2dfeeL
	 */
	public short getIp65504P326Db2dfeeL() throws CFException {
        if (isIp65504P326Db2dfeeLModified()) { 
           ip65504P326Db2dfeeL = refreshIp65504P326Db2dfeeL();
        }
   		return ip65504P326Db2dfeeL;
	}
	
	/**
	 * 	Update Ip65504P326Db2dfeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P326-DB2DFEE-L
	 *	@param number
	 */
	public void setIp65504P326Db2dfeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P326Db2dfeeL = checkIp65504P326Db2dfeeLMaxLimit(number); 
		serializeIp65504P326Db2dfeeL(ip65504P326Db2dfeeL);
	}

	public void setIp65504P326Db2dfeeL(int number) {
	    number = checkIp65504P326Db2dfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P326Db2dfeeL((short)number);
	}
	public void setIp65504P326Db2dfeeL(long number) {
	    number = checkIp65504P326Db2dfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P326Db2dfeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P327Cr2dfeeS
	 *	@return ip65504P327Cr2dfeeS
	 */
	public short getIp65504P327Cr2dfeeS() throws CFException {
        if (isIp65504P327Cr2dfeeSModified()) { 
           ip65504P327Cr2dfeeS = refreshIp65504P327Cr2dfeeS();
        }
   		return ip65504P327Cr2dfeeS;
	}
	
	/**
	 * 	Update Ip65504P327Cr2dfeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P327-CR2DFEE-S
	 *	@param number
	 */
	public void setIp65504P327Cr2dfeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P327Cr2dfeeS = checkIp65504P327Cr2dfeeSMaxLimit(number); 
		serializeIp65504P327Cr2dfeeS(ip65504P327Cr2dfeeS);
	}

	public void setIp65504P327Cr2dfeeS(int number) {
	    number = checkIp65504P327Cr2dfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P327Cr2dfeeS((short)number);
	}
	public void setIp65504P327Cr2dfeeS(long number) {
	    number = checkIp65504P327Cr2dfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P327Cr2dfeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P327Cr2dfeeL
	 *	@return ip65504P327Cr2dfeeL
	 */
	public short getIp65504P327Cr2dfeeL() throws CFException {
        if (isIp65504P327Cr2dfeeLModified()) { 
           ip65504P327Cr2dfeeL = refreshIp65504P327Cr2dfeeL();
        }
   		return ip65504P327Cr2dfeeL;
	}
	
	/**
	 * 	Update Ip65504P327Cr2dfeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P327-CR2DFEE-L
	 *	@param number
	 */
	public void setIp65504P327Cr2dfeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P327Cr2dfeeL = checkIp65504P327Cr2dfeeLMaxLimit(number); 
		serializeIp65504P327Cr2dfeeL(ip65504P327Cr2dfeeL);
	}

	public void setIp65504P327Cr2dfeeL(int number) {
	    number = checkIp65504P327Cr2dfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P327Cr2dfeeL((short)number);
	}
	public void setIp65504P327Cr2dfeeL(long number) {
	    number = checkIp65504P327Cr2dfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P327Cr2dfeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P328Dbrv2atS
	 *	@return ip65504P328Dbrv2atS
	 */
	public short getIp65504P328Dbrv2atS() throws CFException {
        if (isIp65504P328Dbrv2atSModified()) { 
           ip65504P328Dbrv2atS = refreshIp65504P328Dbrv2atS();
        }
   		return ip65504P328Dbrv2atS;
	}
	
	/**
	 * 	Update Ip65504P328Dbrv2atS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P328-DBRV2AT-S
	 *	@param number
	 */
	public void setIp65504P328Dbrv2atS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P328Dbrv2atS = checkIp65504P328Dbrv2atSMaxLimit(number); 
		serializeIp65504P328Dbrv2atS(ip65504P328Dbrv2atS);
	}

	public void setIp65504P328Dbrv2atS(int number) {
	    number = checkIp65504P328Dbrv2atSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P328Dbrv2atS((short)number);
	}
	public void setIp65504P328Dbrv2atS(long number) {
	    number = checkIp65504P328Dbrv2atSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P328Dbrv2atS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P328Dbrv2atL
	 *	@return ip65504P328Dbrv2atL
	 */
	public short getIp65504P328Dbrv2atL() throws CFException {
        if (isIp65504P328Dbrv2atLModified()) { 
           ip65504P328Dbrv2atL = refreshIp65504P328Dbrv2atL();
        }
   		return ip65504P328Dbrv2atL;
	}
	
	/**
	 * 	Update Ip65504P328Dbrv2atL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P328-DBRV2AT-L
	 *	@param number
	 */
	public void setIp65504P328Dbrv2atL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P328Dbrv2atL = checkIp65504P328Dbrv2atLMaxLimit(number); 
		serializeIp65504P328Dbrv2atL(ip65504P328Dbrv2atL);
	}

	public void setIp65504P328Dbrv2atL(int number) {
	    number = checkIp65504P328Dbrv2atLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P328Dbrv2atL((short)number);
	}
	public void setIp65504P328Dbrv2atL(long number) {
	    number = checkIp65504P328Dbrv2atLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P328Dbrv2atL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P329Crrv2atS
	 *	@return ip65504P329Crrv2atS
	 */
	public short getIp65504P329Crrv2atS() throws CFException {
        if (isIp65504P329Crrv2atSModified()) { 
           ip65504P329Crrv2atS = refreshIp65504P329Crrv2atS();
        }
   		return ip65504P329Crrv2atS;
	}
	
	/**
	 * 	Update Ip65504P329Crrv2atS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P329-CRRV2AT-S
	 *	@param number
	 */
	public void setIp65504P329Crrv2atS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P329Crrv2atS = checkIp65504P329Crrv2atSMaxLimit(number); 
		serializeIp65504P329Crrv2atS(ip65504P329Crrv2atS);
	}

	public void setIp65504P329Crrv2atS(int number) {
	    number = checkIp65504P329Crrv2atSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P329Crrv2atS((short)number);
	}
	public void setIp65504P329Crrv2atS(long number) {
	    number = checkIp65504P329Crrv2atSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P329Crrv2atS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P329Crrv2atL
	 *	@return ip65504P329Crrv2atL
	 */
	public short getIp65504P329Crrv2atL() throws CFException {
        if (isIp65504P329Crrv2atLModified()) { 
           ip65504P329Crrv2atL = refreshIp65504P329Crrv2atL();
        }
   		return ip65504P329Crrv2atL;
	}
	
	/**
	 * 	Update Ip65504P329Crrv2atL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P329-CRRV2AT-L
	 *	@param number
	 */
	public void setIp65504P329Crrv2atL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P329Crrv2atL = checkIp65504P329Crrv2atLMaxLimit(number); 
		serializeIp65504P329Crrv2atL(ip65504P329Crrv2atL);
	}

	public void setIp65504P329Crrv2atL(int number) {
	    number = checkIp65504P329Crrv2atLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P329Crrv2atL((short)number);
	}
	public void setIp65504P329Crrv2atL(long number) {
	    number = checkIp65504P329Crrv2atLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P329Crrv2atL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P330Dbrv2feS
	 *	@return ip65504P330Dbrv2feS
	 */
	public short getIp65504P330Dbrv2feS() throws CFException {
        if (isIp65504P330Dbrv2feSModified()) { 
           ip65504P330Dbrv2feS = refreshIp65504P330Dbrv2feS();
        }
   		return ip65504P330Dbrv2feS;
	}
	
	/**
	 * 	Update Ip65504P330Dbrv2feS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P330-DBRV2FE-S
	 *	@param number
	 */
	public void setIp65504P330Dbrv2feS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P330Dbrv2feS = checkIp65504P330Dbrv2feSMaxLimit(number); 
		serializeIp65504P330Dbrv2feS(ip65504P330Dbrv2feS);
	}

	public void setIp65504P330Dbrv2feS(int number) {
	    number = checkIp65504P330Dbrv2feSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P330Dbrv2feS((short)number);
	}
	public void setIp65504P330Dbrv2feS(long number) {
	    number = checkIp65504P330Dbrv2feSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P330Dbrv2feS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P330Dbrv2feL
	 *	@return ip65504P330Dbrv2feL
	 */
	public short getIp65504P330Dbrv2feL() throws CFException {
        if (isIp65504P330Dbrv2feLModified()) { 
           ip65504P330Dbrv2feL = refreshIp65504P330Dbrv2feL();
        }
   		return ip65504P330Dbrv2feL;
	}
	
	/**
	 * 	Update Ip65504P330Dbrv2feL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P330-DBRV2FE-L
	 *	@param number
	 */
	public void setIp65504P330Dbrv2feL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P330Dbrv2feL = checkIp65504P330Dbrv2feLMaxLimit(number); 
		serializeIp65504P330Dbrv2feL(ip65504P330Dbrv2feL);
	}

	public void setIp65504P330Dbrv2feL(int number) {
	    number = checkIp65504P330Dbrv2feLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P330Dbrv2feL((short)number);
	}
	public void setIp65504P330Dbrv2feL(long number) {
	    number = checkIp65504P330Dbrv2feLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P330Dbrv2feL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P331Crrv2feS
	 *	@return ip65504P331Crrv2feS
	 */
	public short getIp65504P331Crrv2feS() throws CFException {
        if (isIp65504P331Crrv2feSModified()) { 
           ip65504P331Crrv2feS = refreshIp65504P331Crrv2feS();
        }
   		return ip65504P331Crrv2feS;
	}
	
	/**
	 * 	Update Ip65504P331Crrv2feS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P331-CRRV2FE-S
	 *	@param number
	 */
	public void setIp65504P331Crrv2feS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P331Crrv2feS = checkIp65504P331Crrv2feSMaxLimit(number); 
		serializeIp65504P331Crrv2feS(ip65504P331Crrv2feS);
	}

	public void setIp65504P331Crrv2feS(int number) {
	    number = checkIp65504P331Crrv2feSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P331Crrv2feS((short)number);
	}
	public void setIp65504P331Crrv2feS(long number) {
	    number = checkIp65504P331Crrv2feSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P331Crrv2feS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P331Crrv2feL
	 *	@return ip65504P331Crrv2feL
	 */
	public short getIp65504P331Crrv2feL() throws CFException {
        if (isIp65504P331Crrv2feLModified()) { 
           ip65504P331Crrv2feL = refreshIp65504P331Crrv2feL();
        }
   		return ip65504P331Crrv2feL;
	}
	
	/**
	 * 	Update Ip65504P331Crrv2feL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P331-CRRV2FE-L
	 *	@param number
	 */
	public void setIp65504P331Crrv2feL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P331Crrv2feL = checkIp65504P331Crrv2feLMaxLimit(number); 
		serializeIp65504P331Crrv2feL(ip65504P331Crrv2feL);
	}

	public void setIp65504P331Crrv2feL(int number) {
	    number = checkIp65504P331Crrv2feLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P331Crrv2feL((short)number);
	}
	public void setIp65504P331Crrv2feL(long number) {
	    number = checkIp65504P331Crrv2feLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P331Crrv2feL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P332ReservdS
	 *	@return ip65504P332ReservdS
	 */
	public short getIp65504P332ReservdS() throws CFException {
        if (isIp65504P332ReservdSModified()) { 
           ip65504P332ReservdS = refreshIp65504P332ReservdS();
        }
   		return ip65504P332ReservdS;
	}
	
	/**
	 * 	Update Ip65504P332ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P332-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P332ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P332ReservdS = checkIp65504P332ReservdSMaxLimit(number); 
		serializeIp65504P332ReservdS(ip65504P332ReservdS);
	}

	public void setIp65504P332ReservdS(int number) {
	    number = checkIp65504P332ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P332ReservdS((short)number);
	}
	public void setIp65504P332ReservdS(long number) {
	    number = checkIp65504P332ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P332ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P332ReservdL
	 *	@return ip65504P332ReservdL
	 */
	public short getIp65504P332ReservdL() throws CFException {
        if (isIp65504P332ReservdLModified()) { 
           ip65504P332ReservdL = refreshIp65504P332ReservdL();
        }
   		return ip65504P332ReservdL;
	}
	
	/**
	 * 	Update Ip65504P332ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P332-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P332ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P332ReservdL = checkIp65504P332ReservdLMaxLimit(number); 
		serializeIp65504P332ReservdL(ip65504P332ReservdL);
	}

	public void setIp65504P332ReservdL(int number) {
	    number = checkIp65504P332ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P332ReservdL((short)number);
	}
	public void setIp65504P332ReservdL(long number) {
	    number = checkIp65504P332ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P332ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P333ReservdS
	 *	@return ip65504P333ReservdS
	 */
	public short getIp65504P333ReservdS() throws CFException {
        if (isIp65504P333ReservdSModified()) { 
           ip65504P333ReservdS = refreshIp65504P333ReservdS();
        }
   		return ip65504P333ReservdS;
	}
	
	/**
	 * 	Update Ip65504P333ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P333-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P333ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P333ReservdS = checkIp65504P333ReservdSMaxLimit(number); 
		serializeIp65504P333ReservdS(ip65504P333ReservdS);
	}

	public void setIp65504P333ReservdS(int number) {
	    number = checkIp65504P333ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P333ReservdS((short)number);
	}
	public void setIp65504P333ReservdS(long number) {
	    number = checkIp65504P333ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P333ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P333ReservdL
	 *	@return ip65504P333ReservdL
	 */
	public short getIp65504P333ReservdL() throws CFException {
        if (isIp65504P333ReservdLModified()) { 
           ip65504P333ReservdL = refreshIp65504P333ReservdL();
        }
   		return ip65504P333ReservdL;
	}
	
	/**
	 * 	Update Ip65504P333ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P333-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P333ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P333ReservdL = checkIp65504P333ReservdLMaxLimit(number); 
		serializeIp65504P333ReservdL(ip65504P333ReservdL);
	}

	public void setIp65504P333ReservdL(int number) {
	    number = checkIp65504P333ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P333ReservdL((short)number);
	}
	public void setIp65504P333ReservdL(long number) {
	    number = checkIp65504P333ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P333ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P334ReservdS
	 *	@return ip65504P334ReservdS
	 */
	public short getIp65504P334ReservdS() throws CFException {
        if (isIp65504P334ReservdSModified()) { 
           ip65504P334ReservdS = refreshIp65504P334ReservdS();
        }
   		return ip65504P334ReservdS;
	}
	
	/**
	 * 	Update Ip65504P334ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P334-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P334ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P334ReservdS = checkIp65504P334ReservdSMaxLimit(number); 
		serializeIp65504P334ReservdS(ip65504P334ReservdS);
	}

	public void setIp65504P334ReservdS(int number) {
	    number = checkIp65504P334ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P334ReservdS((short)number);
	}
	public void setIp65504P334ReservdS(long number) {
	    number = checkIp65504P334ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P334ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P334ReservdL
	 *	@return ip65504P334ReservdL
	 */
	public short getIp65504P334ReservdL() throws CFException {
        if (isIp65504P334ReservdLModified()) { 
           ip65504P334ReservdL = refreshIp65504P334ReservdL();
        }
   		return ip65504P334ReservdL;
	}
	
	/**
	 * 	Update Ip65504P334ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P334-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P334ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P334ReservdL = checkIp65504P334ReservdLMaxLimit(number); 
		serializeIp65504P334ReservdL(ip65504P334ReservdL);
	}

	public void setIp65504P334ReservdL(int number) {
	    number = checkIp65504P334ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P334ReservdL((short)number);
	}
	public void setIp65504P334ReservdL(long number) {
	    number = checkIp65504P334ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P334ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P335ReservdS
	 *	@return ip65504P335ReservdS
	 */
	public short getIp65504P335ReservdS() throws CFException {
        if (isIp65504P335ReservdSModified()) { 
           ip65504P335ReservdS = refreshIp65504P335ReservdS();
        }
   		return ip65504P335ReservdS;
	}
	
	/**
	 * 	Update Ip65504P335ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P335-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P335ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P335ReservdS = checkIp65504P335ReservdSMaxLimit(number); 
		serializeIp65504P335ReservdS(ip65504P335ReservdS);
	}

	public void setIp65504P335ReservdS(int number) {
	    number = checkIp65504P335ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P335ReservdS((short)number);
	}
	public void setIp65504P335ReservdS(long number) {
	    number = checkIp65504P335ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P335ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P335ReservdL
	 *	@return ip65504P335ReservdL
	 */
	public short getIp65504P335ReservdL() throws CFException {
        if (isIp65504P335ReservdLModified()) { 
           ip65504P335ReservdL = refreshIp65504P335ReservdL();
        }
   		return ip65504P335ReservdL;
	}
	
	/**
	 * 	Update Ip65504P335ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P335-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P335ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P335ReservdL = checkIp65504P335ReservdLMaxLimit(number); 
		serializeIp65504P335ReservdL(ip65504P335ReservdL);
	}

	public void setIp65504P335ReservdL(int number) {
	    number = checkIp65504P335ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P335ReservdL((short)number);
	}
	public void setIp65504P335ReservdL(long number) {
	    number = checkIp65504P335ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P335ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P336ReservdS
	 *	@return ip65504P336ReservdS
	 */
	public short getIp65504P336ReservdS() throws CFException {
        if (isIp65504P336ReservdSModified()) { 
           ip65504P336ReservdS = refreshIp65504P336ReservdS();
        }
   		return ip65504P336ReservdS;
	}
	
	/**
	 * 	Update Ip65504P336ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P336-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P336ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P336ReservdS = checkIp65504P336ReservdSMaxLimit(number); 
		serializeIp65504P336ReservdS(ip65504P336ReservdS);
	}

	public void setIp65504P336ReservdS(int number) {
	    number = checkIp65504P336ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P336ReservdS((short)number);
	}
	public void setIp65504P336ReservdS(long number) {
	    number = checkIp65504P336ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P336ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P336ReservdL
	 *	@return ip65504P336ReservdL
	 */
	public short getIp65504P336ReservdL() throws CFException {
        if (isIp65504P336ReservdLModified()) { 
           ip65504P336ReservdL = refreshIp65504P336ReservdL();
        }
   		return ip65504P336ReservdL;
	}
	
	/**
	 * 	Update Ip65504P336ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P336-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P336ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P336ReservdL = checkIp65504P336ReservdLMaxLimit(number); 
		serializeIp65504P336ReservdL(ip65504P336ReservdL);
	}

	public void setIp65504P336ReservdL(int number) {
	    number = checkIp65504P336ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P336ReservdL((short)number);
	}
	public void setIp65504P336ReservdL(long number) {
	    number = checkIp65504P336ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P336ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P337ReservdS
	 *	@return ip65504P337ReservdS
	 */
	public short getIp65504P337ReservdS() throws CFException {
        if (isIp65504P337ReservdSModified()) { 
           ip65504P337ReservdS = refreshIp65504P337ReservdS();
        }
   		return ip65504P337ReservdS;
	}
	
	/**
	 * 	Update Ip65504P337ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P337-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P337ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P337ReservdS = checkIp65504P337ReservdSMaxLimit(number); 
		serializeIp65504P337ReservdS(ip65504P337ReservdS);
	}

	public void setIp65504P337ReservdS(int number) {
	    number = checkIp65504P337ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P337ReservdS((short)number);
	}
	public void setIp65504P337ReservdS(long number) {
	    number = checkIp65504P337ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P337ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P337ReservdL
	 *	@return ip65504P337ReservdL
	 */
	public short getIp65504P337ReservdL() throws CFException {
        if (isIp65504P337ReservdLModified()) { 
           ip65504P337ReservdL = refreshIp65504P337ReservdL();
        }
   		return ip65504P337ReservdL;
	}
	
	/**
	 * 	Update Ip65504P337ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P337-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P337ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P337ReservdL = checkIp65504P337ReservdLMaxLimit(number); 
		serializeIp65504P337ReservdL(ip65504P337ReservdL);
	}

	public void setIp65504P337ReservdL(int number) {
	    number = checkIp65504P337ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P337ReservdL((short)number);
	}
	public void setIp65504P337ReservdL(long number) {
	    number = checkIp65504P337ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P337ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P338ReservdS
	 *	@return ip65504P338ReservdS
	 */
	public short getIp65504P338ReservdS() throws CFException {
        if (isIp65504P338ReservdSModified()) { 
           ip65504P338ReservdS = refreshIp65504P338ReservdS();
        }
   		return ip65504P338ReservdS;
	}
	
	/**
	 * 	Update Ip65504P338ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P338-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P338ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P338ReservdS = checkIp65504P338ReservdSMaxLimit(number); 
		serializeIp65504P338ReservdS(ip65504P338ReservdS);
	}

	public void setIp65504P338ReservdS(int number) {
	    number = checkIp65504P338ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P338ReservdS((short)number);
	}
	public void setIp65504P338ReservdS(long number) {
	    number = checkIp65504P338ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P338ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P338ReservdL
	 *	@return ip65504P338ReservdL
	 */
	public short getIp65504P338ReservdL() throws CFException {
        if (isIp65504P338ReservdLModified()) { 
           ip65504P338ReservdL = refreshIp65504P338ReservdL();
        }
   		return ip65504P338ReservdL;
	}
	
	/**
	 * 	Update Ip65504P338ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P338-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P338ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P338ReservdL = checkIp65504P338ReservdLMaxLimit(number); 
		serializeIp65504P338ReservdL(ip65504P338ReservdL);
	}

	public void setIp65504P338ReservdL(int number) {
	    number = checkIp65504P338ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P338ReservdL((short)number);
	}
	public void setIp65504P338ReservdL(long number) {
	    number = checkIp65504P338ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P338ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P339ReservdS
	 *	@return ip65504P339ReservdS
	 */
	public short getIp65504P339ReservdS() throws CFException {
        if (isIp65504P339ReservdSModified()) { 
           ip65504P339ReservdS = refreshIp65504P339ReservdS();
        }
   		return ip65504P339ReservdS;
	}
	
	/**
	 * 	Update Ip65504P339ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P339-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P339ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P339ReservdS = checkIp65504P339ReservdSMaxLimit(number); 
		serializeIp65504P339ReservdS(ip65504P339ReservdS);
	}

	public void setIp65504P339ReservdS(int number) {
	    number = checkIp65504P339ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P339ReservdS((short)number);
	}
	public void setIp65504P339ReservdS(long number) {
	    number = checkIp65504P339ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P339ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P339ReservdL
	 *	@return ip65504P339ReservdL
	 */
	public short getIp65504P339ReservdL() throws CFException {
        if (isIp65504P339ReservdLModified()) { 
           ip65504P339ReservdL = refreshIp65504P339ReservdL();
        }
   		return ip65504P339ReservdL;
	}
	
	/**
	 * 	Update Ip65504P339ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P339-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P339ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P339ReservdL = checkIp65504P339ReservdLMaxLimit(number); 
		serializeIp65504P339ReservdL(ip65504P339ReservdL);
	}

	public void setIp65504P339ReservdL(int number) {
	    number = checkIp65504P339ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P339ReservdL((short)number);
	}
	public void setIp65504P339ReservdL(long number) {
	    number = checkIp65504P339ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P339ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P340ReservdS
	 *	@return ip65504P340ReservdS
	 */
	public short getIp65504P340ReservdS() throws CFException {
        if (isIp65504P340ReservdSModified()) { 
           ip65504P340ReservdS = refreshIp65504P340ReservdS();
        }
   		return ip65504P340ReservdS;
	}
	
	/**
	 * 	Update Ip65504P340ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P340-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P340ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P340ReservdS = checkIp65504P340ReservdSMaxLimit(number); 
		serializeIp65504P340ReservdS(ip65504P340ReservdS);
	}

	public void setIp65504P340ReservdS(int number) {
	    number = checkIp65504P340ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P340ReservdS((short)number);
	}
	public void setIp65504P340ReservdS(long number) {
	    number = checkIp65504P340ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P340ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P340ReservdL
	 *	@return ip65504P340ReservdL
	 */
	public short getIp65504P340ReservdL() throws CFException {
        if (isIp65504P340ReservdLModified()) { 
           ip65504P340ReservdL = refreshIp65504P340ReservdL();
        }
   		return ip65504P340ReservdL;
	}
	
	/**
	 * 	Update Ip65504P340ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P340-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P340ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P340ReservdL = checkIp65504P340ReservdLMaxLimit(number); 
		serializeIp65504P340ReservdL(ip65504P340ReservdL);
	}

	public void setIp65504P340ReservdL(int number) {
	    number = checkIp65504P340ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P340ReservdL((short)number);
	}
	public void setIp65504P340ReservdL(long number) {
	    number = checkIp65504P340ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P340ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P341ReservdS
	 *	@return ip65504P341ReservdS
	 */
	public short getIp65504P341ReservdS() throws CFException {
        if (isIp65504P341ReservdSModified()) { 
           ip65504P341ReservdS = refreshIp65504P341ReservdS();
        }
   		return ip65504P341ReservdS;
	}
	
	/**
	 * 	Update Ip65504P341ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P341-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P341ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P341ReservdS = checkIp65504P341ReservdSMaxLimit(number); 
		serializeIp65504P341ReservdS(ip65504P341ReservdS);
	}

	public void setIp65504P341ReservdS(int number) {
	    number = checkIp65504P341ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P341ReservdS((short)number);
	}
	public void setIp65504P341ReservdS(long number) {
	    number = checkIp65504P341ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P341ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P341ReservdL
	 *	@return ip65504P341ReservdL
	 */
	public short getIp65504P341ReservdL() throws CFException {
        if (isIp65504P341ReservdLModified()) { 
           ip65504P341ReservdL = refreshIp65504P341ReservdL();
        }
   		return ip65504P341ReservdL;
	}
	
	/**
	 * 	Update Ip65504P341ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P341-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P341ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P341ReservdL = checkIp65504P341ReservdLMaxLimit(number); 
		serializeIp65504P341ReservdL(ip65504P341ReservdL);
	}

	public void setIp65504P341ReservdL(int number) {
	    number = checkIp65504P341ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P341ReservdL((short)number);
	}
	public void setIp65504P341ReservdL(long number) {
	    number = checkIp65504P341ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P341ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P311CrRamtS((short)0);
         	setIp65504P311CrRamtL((short)0);
         	setIp65504P312DbNumbS((short)0);
         	setIp65504P312DbNumbL((short)0);
         	setIp65504P313CrNmbrS((short)0);
         	setIp65504P313CrNmbrL((short)0);
         	setIp65504P314DbcbamtS((short)0);
         	setIp65504P314DbcbamtL((short)0);
         	setIp65504P315CrcbamtS((short)0);
         	setIp65504P315CrcbamtL((short)0);
         	setIp65504P316DbrvamtS((short)0);
         	setIp65504P316DbrvamtL((short)0);
         	setIp65504P317CrrvamtS((short)0);
         	setIp65504P317CrrvamtL((short)0);
         	setIp65504P318DbrvfeeS((short)0);
         	setIp65504P318DbrvfeeL((short)0);
         	setIp65504P319CrrvfeeS((short)0);
         	setIp65504P319CrrvfeeL((short)0);
         	setIp65504P320DbrvnbrS((short)0);
         	setIp65504P320DbrvnbrL((short)0);
         	setIp65504P321CrrvnbrS((short)0);
         	setIp65504P321CrrvnbrL((short)0);
         	setIp65504P322DbcbnbrS((short)0);
         	setIp65504P322DbcbnbrL((short)0);
         	setIp65504P323CrcbnbrS((short)0);
         	setIp65504P323CrcbnbrL((short)0);
         	setIp65504P324Db2damtS((short)0);
         	setIp65504P324Db2damtL((short)0);
         	setIp65504P325Cr2damtS((short)0);
         	setIp65504P325Cr2damtL((short)0);
         	setIp65504P326Db2dfeeS((short)0);
         	setIp65504P326Db2dfeeL((short)0);
         	setIp65504P327Cr2dfeeS((short)0);
         	setIp65504P327Cr2dfeeL((short)0);
         	setIp65504P328Dbrv2atS((short)0);
         	setIp65504P328Dbrv2atL((short)0);
         	setIp65504P329Crrv2atS((short)0);
         	setIp65504P329Crrv2atL((short)0);
         	setIp65504P330Dbrv2feS((short)0);
         	setIp65504P330Dbrv2feL((short)0);
         	setIp65504P331Crrv2feS((short)0);
         	setIp65504P331Crrv2feL((short)0);
         	setIp65504P332ReservdS((short)0);
         	setIp65504P332ReservdL((short)0);
         	setIp65504P333ReservdS((short)0);
         	setIp65504P333ReservdL((short)0);
         	setIp65504P334ReservdS((short)0);
         	setIp65504P334ReservdL((short)0);
         	setIp65504P335ReservdS((short)0);
         	setIp65504P335ReservdL((short)0);
         	setIp65504P336ReservdS((short)0);
         	setIp65504P336ReservdL((short)0);
         	setIp65504P337ReservdS((short)0);
         	setIp65504P337ReservdL((short)0);
         	setIp65504P338ReservdS((short)0);
         	setIp65504P338ReservdL((short)0);
         	setIp65504P339ReservdS((short)0);
         	setIp65504P339ReservdL((short)0);
         	setIp65504P340ReservdS((short)0);
         	setIp65504P340ReservdL((short)0);
         	setIp65504P341ReservdS((short)0);
         	setIp65504P341ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup11FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_11_LENGTH;
		}

}
  
