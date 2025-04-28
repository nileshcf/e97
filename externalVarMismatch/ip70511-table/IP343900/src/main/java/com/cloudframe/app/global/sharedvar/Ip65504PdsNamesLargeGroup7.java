package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup7 extends Ip65504PdsNamesLargeGroup7Serialized { 
   

								private short ip65504P187ReservdS;

								private short ip65504P187ReservdL;


								private short ip65504P188ReservdS;

								private short ip65504P188ReservdL;


								private short ip65504P189PoiTelS;

								private short ip65504P189PoiTelL;


								private short ip65504P190PntrIdS;

								private short ip65504P190PntrIdL;


								private short ip65504P191OrgFmtS;

								private short ip65504P191OrgFmtL;


								private short ip65504P192ReservdS;

								private short ip65504P192ReservdL;


								private short ip65504P193ReservdS;

								private short ip65504P193ReservdL;


								private short ip65504P194ReservdS;

								private short ip65504P194ReservdL;


								private short ip65504P195ReservdS;

								private short ip65504P195ReservdL;


								private short ip65504P196ReservdS;

								private short ip65504P196ReservdL;


								private short ip65504P197ReservdS;

								private short ip65504P197ReservdL;


								private short ip65504P198ReservdS;

								private short ip65504P198ReservdL;


								private short ip65504P199ReservdS;

								private short ip65504P199ReservdL;


								private short ip65504P200ReservdS;

								private short ip65504P200ReservdL;


								private short ip65504P201ReservdS;

								private short ip65504P201ReservdL;


								private short ip65504P202ReservdS;

								private short ip65504P202ReservdL;


								private short ip65504P203ReservdS;

								private short ip65504P203ReservdL;


								private short ip65504P204ReservdS;

								private short ip65504P204ReservdL;


								private short ip65504P205ReservdS;

								private short ip65504P205ReservdL;


								private short ip65504P206ReservdS;

								private short ip65504P206ReservdL;


								private short ip65504P207ReservdS;

								private short ip65504P207ReservdL;


								private short ip65504P208ReservdS;

								private short ip65504P208ReservdL;


								private short ip65504P209ReservdS;

								private short ip65504P209ReservdL;


								private short ip65504P210ReservdS;

								private short ip65504P210ReservdL;


								private short ip65504P211ReservdS;

								private short ip65504P211ReservdL;


								private short ip65504P212ReservdS;

								private short ip65504P212ReservdL;


								private short ip65504P213ReservdS;

								private short ip65504P213ReservdL;


								private short ip65504P214ReservdS;

								private short ip65504P214ReservdL;


								private short ip65504P215ReservdS;

								private short ip65504P215ReservdL;


								private short ip65504P216ReservdS;

								private short ip65504P216ReservdL;


								private short ip65504P217ReservdS;

								private short ip65504P217ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup7
	**/
    public Ip65504PdsNamesLargeGroup7() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup7. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup7(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P187ReservdS
	 *	@return ip65504P187ReservdS
	 */
	public short getIp65504P187ReservdS() throws CFException {
        if (isIp65504P187ReservdSModified()) { 
           ip65504P187ReservdS = refreshIp65504P187ReservdS();
        }
   		return ip65504P187ReservdS;
	}
	
	/**
	 * 	Update Ip65504P187ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P187-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P187ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P187ReservdS = checkIp65504P187ReservdSMaxLimit(number); 
		serializeIp65504P187ReservdS(ip65504P187ReservdS);
	}

	public void setIp65504P187ReservdS(int number) {
	    number = checkIp65504P187ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P187ReservdS((short)number);
	}
	public void setIp65504P187ReservdS(long number) {
	    number = checkIp65504P187ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P187ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P187ReservdL
	 *	@return ip65504P187ReservdL
	 */
	public short getIp65504P187ReservdL() throws CFException {
        if (isIp65504P187ReservdLModified()) { 
           ip65504P187ReservdL = refreshIp65504P187ReservdL();
        }
   		return ip65504P187ReservdL;
	}
	
	/**
	 * 	Update Ip65504P187ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P187-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P187ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P187ReservdL = checkIp65504P187ReservdLMaxLimit(number); 
		serializeIp65504P187ReservdL(ip65504P187ReservdL);
	}

	public void setIp65504P187ReservdL(int number) {
	    number = checkIp65504P187ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P187ReservdL((short)number);
	}
	public void setIp65504P187ReservdL(long number) {
	    number = checkIp65504P187ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P187ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P188ReservdS
	 *	@return ip65504P188ReservdS
	 */
	public short getIp65504P188ReservdS() throws CFException {
        if (isIp65504P188ReservdSModified()) { 
           ip65504P188ReservdS = refreshIp65504P188ReservdS();
        }
   		return ip65504P188ReservdS;
	}
	
	/**
	 * 	Update Ip65504P188ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P188-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P188ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P188ReservdS = checkIp65504P188ReservdSMaxLimit(number); 
		serializeIp65504P188ReservdS(ip65504P188ReservdS);
	}

	public void setIp65504P188ReservdS(int number) {
	    number = checkIp65504P188ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P188ReservdS((short)number);
	}
	public void setIp65504P188ReservdS(long number) {
	    number = checkIp65504P188ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P188ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P188ReservdL
	 *	@return ip65504P188ReservdL
	 */
	public short getIp65504P188ReservdL() throws CFException {
        if (isIp65504P188ReservdLModified()) { 
           ip65504P188ReservdL = refreshIp65504P188ReservdL();
        }
   		return ip65504P188ReservdL;
	}
	
	/**
	 * 	Update Ip65504P188ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P188-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P188ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P188ReservdL = checkIp65504P188ReservdLMaxLimit(number); 
		serializeIp65504P188ReservdL(ip65504P188ReservdL);
	}

	public void setIp65504P188ReservdL(int number) {
	    number = checkIp65504P188ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P188ReservdL((short)number);
	}
	public void setIp65504P188ReservdL(long number) {
	    number = checkIp65504P188ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P188ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P189PoiTelS
	 *	@return ip65504P189PoiTelS
	 */
	public short getIp65504P189PoiTelS() throws CFException {
        if (isIp65504P189PoiTelSModified()) { 
           ip65504P189PoiTelS = refreshIp65504P189PoiTelS();
        }
   		return ip65504P189PoiTelS;
	}
	
	/**
	 * 	Update Ip65504P189PoiTelS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P189-POI-TEL-S
	 *	@param number
	 */
	public void setIp65504P189PoiTelS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P189PoiTelS = checkIp65504P189PoiTelSMaxLimit(number); 
		serializeIp65504P189PoiTelS(ip65504P189PoiTelS);
	}

	public void setIp65504P189PoiTelS(int number) {
	    number = checkIp65504P189PoiTelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P189PoiTelS((short)number);
	}
	public void setIp65504P189PoiTelS(long number) {
	    number = checkIp65504P189PoiTelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P189PoiTelS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P189PoiTelL
	 *	@return ip65504P189PoiTelL
	 */
	public short getIp65504P189PoiTelL() throws CFException {
        if (isIp65504P189PoiTelLModified()) { 
           ip65504P189PoiTelL = refreshIp65504P189PoiTelL();
        }
   		return ip65504P189PoiTelL;
	}
	
	/**
	 * 	Update Ip65504P189PoiTelL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P189-POI-TEL-L
	 *	@param number
	 */
	public void setIp65504P189PoiTelL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P189PoiTelL = checkIp65504P189PoiTelLMaxLimit(number); 
		serializeIp65504P189PoiTelL(ip65504P189PoiTelL);
	}

	public void setIp65504P189PoiTelL(int number) {
	    number = checkIp65504P189PoiTelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P189PoiTelL((short)number);
	}
	public void setIp65504P189PoiTelL(long number) {
	    number = checkIp65504P189PoiTelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P189PoiTelL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P190PntrIdS
	 *	@return ip65504P190PntrIdS
	 */
	public short getIp65504P190PntrIdS() throws CFException {
        if (isIp65504P190PntrIdSModified()) { 
           ip65504P190PntrIdS = refreshIp65504P190PntrIdS();
        }
   		return ip65504P190PntrIdS;
	}
	
	/**
	 * 	Update Ip65504P190PntrIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P190-PNTR-ID-S
	 *	@param number
	 */
	public void setIp65504P190PntrIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P190PntrIdS = checkIp65504P190PntrIdSMaxLimit(number); 
		serializeIp65504P190PntrIdS(ip65504P190PntrIdS);
	}

	public void setIp65504P190PntrIdS(int number) {
	    number = checkIp65504P190PntrIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P190PntrIdS((short)number);
	}
	public void setIp65504P190PntrIdS(long number) {
	    number = checkIp65504P190PntrIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P190PntrIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P190PntrIdL
	 *	@return ip65504P190PntrIdL
	 */
	public short getIp65504P190PntrIdL() throws CFException {
        if (isIp65504P190PntrIdLModified()) { 
           ip65504P190PntrIdL = refreshIp65504P190PntrIdL();
        }
   		return ip65504P190PntrIdL;
	}
	
	/**
	 * 	Update Ip65504P190PntrIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P190-PNTR-ID-L
	 *	@param number
	 */
	public void setIp65504P190PntrIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P190PntrIdL = checkIp65504P190PntrIdLMaxLimit(number); 
		serializeIp65504P190PntrIdL(ip65504P190PntrIdL);
	}

	public void setIp65504P190PntrIdL(int number) {
	    number = checkIp65504P190PntrIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P190PntrIdL((short)number);
	}
	public void setIp65504P190PntrIdL(long number) {
	    number = checkIp65504P190PntrIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P190PntrIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P191OrgFmtS
	 *	@return ip65504P191OrgFmtS
	 */
	public short getIp65504P191OrgFmtS() throws CFException {
        if (isIp65504P191OrgFmtSModified()) { 
           ip65504P191OrgFmtS = refreshIp65504P191OrgFmtS();
        }
   		return ip65504P191OrgFmtS;
	}
	
	/**
	 * 	Update Ip65504P191OrgFmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P191-ORG-FMT-S
	 *	@param number
	 */
	public void setIp65504P191OrgFmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P191OrgFmtS = checkIp65504P191OrgFmtSMaxLimit(number); 
		serializeIp65504P191OrgFmtS(ip65504P191OrgFmtS);
	}

	public void setIp65504P191OrgFmtS(int number) {
	    number = checkIp65504P191OrgFmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P191OrgFmtS((short)number);
	}
	public void setIp65504P191OrgFmtS(long number) {
	    number = checkIp65504P191OrgFmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P191OrgFmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P191OrgFmtL
	 *	@return ip65504P191OrgFmtL
	 */
	public short getIp65504P191OrgFmtL() throws CFException {
        if (isIp65504P191OrgFmtLModified()) { 
           ip65504P191OrgFmtL = refreshIp65504P191OrgFmtL();
        }
   		return ip65504P191OrgFmtL;
	}
	
	/**
	 * 	Update Ip65504P191OrgFmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P191-ORG-FMT-L
	 *	@param number
	 */
	public void setIp65504P191OrgFmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P191OrgFmtL = checkIp65504P191OrgFmtLMaxLimit(number); 
		serializeIp65504P191OrgFmtL(ip65504P191OrgFmtL);
	}

	public void setIp65504P191OrgFmtL(int number) {
	    number = checkIp65504P191OrgFmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P191OrgFmtL((short)number);
	}
	public void setIp65504P191OrgFmtL(long number) {
	    number = checkIp65504P191OrgFmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P191OrgFmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P192ReservdS
	 *	@return ip65504P192ReservdS
	 */
	public short getIp65504P192ReservdS() throws CFException {
        if (isIp65504P192ReservdSModified()) { 
           ip65504P192ReservdS = refreshIp65504P192ReservdS();
        }
   		return ip65504P192ReservdS;
	}
	
	/**
	 * 	Update Ip65504P192ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P192-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P192ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P192ReservdS = checkIp65504P192ReservdSMaxLimit(number); 
		serializeIp65504P192ReservdS(ip65504P192ReservdS);
	}

	public void setIp65504P192ReservdS(int number) {
	    number = checkIp65504P192ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P192ReservdS((short)number);
	}
	public void setIp65504P192ReservdS(long number) {
	    number = checkIp65504P192ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P192ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P192ReservdL
	 *	@return ip65504P192ReservdL
	 */
	public short getIp65504P192ReservdL() throws CFException {
        if (isIp65504P192ReservdLModified()) { 
           ip65504P192ReservdL = refreshIp65504P192ReservdL();
        }
   		return ip65504P192ReservdL;
	}
	
	/**
	 * 	Update Ip65504P192ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P192-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P192ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P192ReservdL = checkIp65504P192ReservdLMaxLimit(number); 
		serializeIp65504P192ReservdL(ip65504P192ReservdL);
	}

	public void setIp65504P192ReservdL(int number) {
	    number = checkIp65504P192ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P192ReservdL((short)number);
	}
	public void setIp65504P192ReservdL(long number) {
	    number = checkIp65504P192ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P192ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P193ReservdS
	 *	@return ip65504P193ReservdS
	 */
	public short getIp65504P193ReservdS() throws CFException {
        if (isIp65504P193ReservdSModified()) { 
           ip65504P193ReservdS = refreshIp65504P193ReservdS();
        }
   		return ip65504P193ReservdS;
	}
	
	/**
	 * 	Update Ip65504P193ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P193-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P193ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P193ReservdS = checkIp65504P193ReservdSMaxLimit(number); 
		serializeIp65504P193ReservdS(ip65504P193ReservdS);
	}

	public void setIp65504P193ReservdS(int number) {
	    number = checkIp65504P193ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P193ReservdS((short)number);
	}
	public void setIp65504P193ReservdS(long number) {
	    number = checkIp65504P193ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P193ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P193ReservdL
	 *	@return ip65504P193ReservdL
	 */
	public short getIp65504P193ReservdL() throws CFException {
        if (isIp65504P193ReservdLModified()) { 
           ip65504P193ReservdL = refreshIp65504P193ReservdL();
        }
   		return ip65504P193ReservdL;
	}
	
	/**
	 * 	Update Ip65504P193ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P193-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P193ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P193ReservdL = checkIp65504P193ReservdLMaxLimit(number); 
		serializeIp65504P193ReservdL(ip65504P193ReservdL);
	}

	public void setIp65504P193ReservdL(int number) {
	    number = checkIp65504P193ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P193ReservdL((short)number);
	}
	public void setIp65504P193ReservdL(long number) {
	    number = checkIp65504P193ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P193ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P194ReservdS
	 *	@return ip65504P194ReservdS
	 */
	public short getIp65504P194ReservdS() throws CFException {
        if (isIp65504P194ReservdSModified()) { 
           ip65504P194ReservdS = refreshIp65504P194ReservdS();
        }
   		return ip65504P194ReservdS;
	}
	
	/**
	 * 	Update Ip65504P194ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P194-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P194ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P194ReservdS = checkIp65504P194ReservdSMaxLimit(number); 
		serializeIp65504P194ReservdS(ip65504P194ReservdS);
	}

	public void setIp65504P194ReservdS(int number) {
	    number = checkIp65504P194ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P194ReservdS((short)number);
	}
	public void setIp65504P194ReservdS(long number) {
	    number = checkIp65504P194ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P194ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P194ReservdL
	 *	@return ip65504P194ReservdL
	 */
	public short getIp65504P194ReservdL() throws CFException {
        if (isIp65504P194ReservdLModified()) { 
           ip65504P194ReservdL = refreshIp65504P194ReservdL();
        }
   		return ip65504P194ReservdL;
	}
	
	/**
	 * 	Update Ip65504P194ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P194-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P194ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P194ReservdL = checkIp65504P194ReservdLMaxLimit(number); 
		serializeIp65504P194ReservdL(ip65504P194ReservdL);
	}

	public void setIp65504P194ReservdL(int number) {
	    number = checkIp65504P194ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P194ReservdL((short)number);
	}
	public void setIp65504P194ReservdL(long number) {
	    number = checkIp65504P194ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P194ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P195ReservdS
	 *	@return ip65504P195ReservdS
	 */
	public short getIp65504P195ReservdS() throws CFException {
        if (isIp65504P195ReservdSModified()) { 
           ip65504P195ReservdS = refreshIp65504P195ReservdS();
        }
   		return ip65504P195ReservdS;
	}
	
	/**
	 * 	Update Ip65504P195ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P195-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P195ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P195ReservdS = checkIp65504P195ReservdSMaxLimit(number); 
		serializeIp65504P195ReservdS(ip65504P195ReservdS);
	}

	public void setIp65504P195ReservdS(int number) {
	    number = checkIp65504P195ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P195ReservdS((short)number);
	}
	public void setIp65504P195ReservdS(long number) {
	    number = checkIp65504P195ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P195ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P195ReservdL
	 *	@return ip65504P195ReservdL
	 */
	public short getIp65504P195ReservdL() throws CFException {
        if (isIp65504P195ReservdLModified()) { 
           ip65504P195ReservdL = refreshIp65504P195ReservdL();
        }
   		return ip65504P195ReservdL;
	}
	
	/**
	 * 	Update Ip65504P195ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P195-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P195ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P195ReservdL = checkIp65504P195ReservdLMaxLimit(number); 
		serializeIp65504P195ReservdL(ip65504P195ReservdL);
	}

	public void setIp65504P195ReservdL(int number) {
	    number = checkIp65504P195ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P195ReservdL((short)number);
	}
	public void setIp65504P195ReservdL(long number) {
	    number = checkIp65504P195ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P195ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P196ReservdS
	 *	@return ip65504P196ReservdS
	 */
	public short getIp65504P196ReservdS() throws CFException {
        if (isIp65504P196ReservdSModified()) { 
           ip65504P196ReservdS = refreshIp65504P196ReservdS();
        }
   		return ip65504P196ReservdS;
	}
	
	/**
	 * 	Update Ip65504P196ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P196-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P196ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P196ReservdS = checkIp65504P196ReservdSMaxLimit(number); 
		serializeIp65504P196ReservdS(ip65504P196ReservdS);
	}

	public void setIp65504P196ReservdS(int number) {
	    number = checkIp65504P196ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P196ReservdS((short)number);
	}
	public void setIp65504P196ReservdS(long number) {
	    number = checkIp65504P196ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P196ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P196ReservdL
	 *	@return ip65504P196ReservdL
	 */
	public short getIp65504P196ReservdL() throws CFException {
        if (isIp65504P196ReservdLModified()) { 
           ip65504P196ReservdL = refreshIp65504P196ReservdL();
        }
   		return ip65504P196ReservdL;
	}
	
	/**
	 * 	Update Ip65504P196ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P196-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P196ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P196ReservdL = checkIp65504P196ReservdLMaxLimit(number); 
		serializeIp65504P196ReservdL(ip65504P196ReservdL);
	}

	public void setIp65504P196ReservdL(int number) {
	    number = checkIp65504P196ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P196ReservdL((short)number);
	}
	public void setIp65504P196ReservdL(long number) {
	    number = checkIp65504P196ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P196ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P197ReservdS
	 *	@return ip65504P197ReservdS
	 */
	public short getIp65504P197ReservdS() throws CFException {
        if (isIp65504P197ReservdSModified()) { 
           ip65504P197ReservdS = refreshIp65504P197ReservdS();
        }
   		return ip65504P197ReservdS;
	}
	
	/**
	 * 	Update Ip65504P197ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P197-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P197ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P197ReservdS = checkIp65504P197ReservdSMaxLimit(number); 
		serializeIp65504P197ReservdS(ip65504P197ReservdS);
	}

	public void setIp65504P197ReservdS(int number) {
	    number = checkIp65504P197ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P197ReservdS((short)number);
	}
	public void setIp65504P197ReservdS(long number) {
	    number = checkIp65504P197ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P197ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P197ReservdL
	 *	@return ip65504P197ReservdL
	 */
	public short getIp65504P197ReservdL() throws CFException {
        if (isIp65504P197ReservdLModified()) { 
           ip65504P197ReservdL = refreshIp65504P197ReservdL();
        }
   		return ip65504P197ReservdL;
	}
	
	/**
	 * 	Update Ip65504P197ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P197-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P197ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P197ReservdL = checkIp65504P197ReservdLMaxLimit(number); 
		serializeIp65504P197ReservdL(ip65504P197ReservdL);
	}

	public void setIp65504P197ReservdL(int number) {
	    number = checkIp65504P197ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P197ReservdL((short)number);
	}
	public void setIp65504P197ReservdL(long number) {
	    number = checkIp65504P197ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P197ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P198ReservdS
	 *	@return ip65504P198ReservdS
	 */
	public short getIp65504P198ReservdS() throws CFException {
        if (isIp65504P198ReservdSModified()) { 
           ip65504P198ReservdS = refreshIp65504P198ReservdS();
        }
   		return ip65504P198ReservdS;
	}
	
	/**
	 * 	Update Ip65504P198ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P198-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P198ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P198ReservdS = checkIp65504P198ReservdSMaxLimit(number); 
		serializeIp65504P198ReservdS(ip65504P198ReservdS);
	}

	public void setIp65504P198ReservdS(int number) {
	    number = checkIp65504P198ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P198ReservdS((short)number);
	}
	public void setIp65504P198ReservdS(long number) {
	    number = checkIp65504P198ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P198ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P198ReservdL
	 *	@return ip65504P198ReservdL
	 */
	public short getIp65504P198ReservdL() throws CFException {
        if (isIp65504P198ReservdLModified()) { 
           ip65504P198ReservdL = refreshIp65504P198ReservdL();
        }
   		return ip65504P198ReservdL;
	}
	
	/**
	 * 	Update Ip65504P198ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P198-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P198ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P198ReservdL = checkIp65504P198ReservdLMaxLimit(number); 
		serializeIp65504P198ReservdL(ip65504P198ReservdL);
	}

	public void setIp65504P198ReservdL(int number) {
	    number = checkIp65504P198ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P198ReservdL((short)number);
	}
	public void setIp65504P198ReservdL(long number) {
	    number = checkIp65504P198ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P198ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P199ReservdS
	 *	@return ip65504P199ReservdS
	 */
	public short getIp65504P199ReservdS() throws CFException {
        if (isIp65504P199ReservdSModified()) { 
           ip65504P199ReservdS = refreshIp65504P199ReservdS();
        }
   		return ip65504P199ReservdS;
	}
	
	/**
	 * 	Update Ip65504P199ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P199-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P199ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P199ReservdS = checkIp65504P199ReservdSMaxLimit(number); 
		serializeIp65504P199ReservdS(ip65504P199ReservdS);
	}

	public void setIp65504P199ReservdS(int number) {
	    number = checkIp65504P199ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P199ReservdS((short)number);
	}
	public void setIp65504P199ReservdS(long number) {
	    number = checkIp65504P199ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P199ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P199ReservdL
	 *	@return ip65504P199ReservdL
	 */
	public short getIp65504P199ReservdL() throws CFException {
        if (isIp65504P199ReservdLModified()) { 
           ip65504P199ReservdL = refreshIp65504P199ReservdL();
        }
   		return ip65504P199ReservdL;
	}
	
	/**
	 * 	Update Ip65504P199ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P199-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P199ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P199ReservdL = checkIp65504P199ReservdLMaxLimit(number); 
		serializeIp65504P199ReservdL(ip65504P199ReservdL);
	}

	public void setIp65504P199ReservdL(int number) {
	    number = checkIp65504P199ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P199ReservdL((short)number);
	}
	public void setIp65504P199ReservdL(long number) {
	    number = checkIp65504P199ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P199ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P200ReservdS
	 *	@return ip65504P200ReservdS
	 */
	public short getIp65504P200ReservdS() throws CFException {
        if (isIp65504P200ReservdSModified()) { 
           ip65504P200ReservdS = refreshIp65504P200ReservdS();
        }
   		return ip65504P200ReservdS;
	}
	
	/**
	 * 	Update Ip65504P200ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P200-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P200ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P200ReservdS = checkIp65504P200ReservdSMaxLimit(number); 
		serializeIp65504P200ReservdS(ip65504P200ReservdS);
	}

	public void setIp65504P200ReservdS(int number) {
	    number = checkIp65504P200ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P200ReservdS((short)number);
	}
	public void setIp65504P200ReservdS(long number) {
	    number = checkIp65504P200ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P200ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P200ReservdL
	 *	@return ip65504P200ReservdL
	 */
	public short getIp65504P200ReservdL() throws CFException {
        if (isIp65504P200ReservdLModified()) { 
           ip65504P200ReservdL = refreshIp65504P200ReservdL();
        }
   		return ip65504P200ReservdL;
	}
	
	/**
	 * 	Update Ip65504P200ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P200-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P200ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P200ReservdL = checkIp65504P200ReservdLMaxLimit(number); 
		serializeIp65504P200ReservdL(ip65504P200ReservdL);
	}

	public void setIp65504P200ReservdL(int number) {
	    number = checkIp65504P200ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P200ReservdL((short)number);
	}
	public void setIp65504P200ReservdL(long number) {
	    number = checkIp65504P200ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P200ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P201ReservdS
	 *	@return ip65504P201ReservdS
	 */
	public short getIp65504P201ReservdS() throws CFException {
        if (isIp65504P201ReservdSModified()) { 
           ip65504P201ReservdS = refreshIp65504P201ReservdS();
        }
   		return ip65504P201ReservdS;
	}
	
	/**
	 * 	Update Ip65504P201ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P201-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P201ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P201ReservdS = checkIp65504P201ReservdSMaxLimit(number); 
		serializeIp65504P201ReservdS(ip65504P201ReservdS);
	}

	public void setIp65504P201ReservdS(int number) {
	    number = checkIp65504P201ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P201ReservdS((short)number);
	}
	public void setIp65504P201ReservdS(long number) {
	    number = checkIp65504P201ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P201ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P201ReservdL
	 *	@return ip65504P201ReservdL
	 */
	public short getIp65504P201ReservdL() throws CFException {
        if (isIp65504P201ReservdLModified()) { 
           ip65504P201ReservdL = refreshIp65504P201ReservdL();
        }
   		return ip65504P201ReservdL;
	}
	
	/**
	 * 	Update Ip65504P201ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P201-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P201ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P201ReservdL = checkIp65504P201ReservdLMaxLimit(number); 
		serializeIp65504P201ReservdL(ip65504P201ReservdL);
	}

	public void setIp65504P201ReservdL(int number) {
	    number = checkIp65504P201ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P201ReservdL((short)number);
	}
	public void setIp65504P201ReservdL(long number) {
	    number = checkIp65504P201ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P201ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P202ReservdS
	 *	@return ip65504P202ReservdS
	 */
	public short getIp65504P202ReservdS() throws CFException {
        if (isIp65504P202ReservdSModified()) { 
           ip65504P202ReservdS = refreshIp65504P202ReservdS();
        }
   		return ip65504P202ReservdS;
	}
	
	/**
	 * 	Update Ip65504P202ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P202-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P202ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P202ReservdS = checkIp65504P202ReservdSMaxLimit(number); 
		serializeIp65504P202ReservdS(ip65504P202ReservdS);
	}

	public void setIp65504P202ReservdS(int number) {
	    number = checkIp65504P202ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P202ReservdS((short)number);
	}
	public void setIp65504P202ReservdS(long number) {
	    number = checkIp65504P202ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P202ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P202ReservdL
	 *	@return ip65504P202ReservdL
	 */
	public short getIp65504P202ReservdL() throws CFException {
        if (isIp65504P202ReservdLModified()) { 
           ip65504P202ReservdL = refreshIp65504P202ReservdL();
        }
   		return ip65504P202ReservdL;
	}
	
	/**
	 * 	Update Ip65504P202ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P202-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P202ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P202ReservdL = checkIp65504P202ReservdLMaxLimit(number); 
		serializeIp65504P202ReservdL(ip65504P202ReservdL);
	}

	public void setIp65504P202ReservdL(int number) {
	    number = checkIp65504P202ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P202ReservdL((short)number);
	}
	public void setIp65504P202ReservdL(long number) {
	    number = checkIp65504P202ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P202ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P203ReservdS
	 *	@return ip65504P203ReservdS
	 */
	public short getIp65504P203ReservdS() throws CFException {
        if (isIp65504P203ReservdSModified()) { 
           ip65504P203ReservdS = refreshIp65504P203ReservdS();
        }
   		return ip65504P203ReservdS;
	}
	
	/**
	 * 	Update Ip65504P203ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P203-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P203ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P203ReservdS = checkIp65504P203ReservdSMaxLimit(number); 
		serializeIp65504P203ReservdS(ip65504P203ReservdS);
	}

	public void setIp65504P203ReservdS(int number) {
	    number = checkIp65504P203ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P203ReservdS((short)number);
	}
	public void setIp65504P203ReservdS(long number) {
	    number = checkIp65504P203ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P203ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P203ReservdL
	 *	@return ip65504P203ReservdL
	 */
	public short getIp65504P203ReservdL() throws CFException {
        if (isIp65504P203ReservdLModified()) { 
           ip65504P203ReservdL = refreshIp65504P203ReservdL();
        }
   		return ip65504P203ReservdL;
	}
	
	/**
	 * 	Update Ip65504P203ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P203-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P203ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P203ReservdL = checkIp65504P203ReservdLMaxLimit(number); 
		serializeIp65504P203ReservdL(ip65504P203ReservdL);
	}

	public void setIp65504P203ReservdL(int number) {
	    number = checkIp65504P203ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P203ReservdL((short)number);
	}
	public void setIp65504P203ReservdL(long number) {
	    number = checkIp65504P203ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P203ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P204ReservdS
	 *	@return ip65504P204ReservdS
	 */
	public short getIp65504P204ReservdS() throws CFException {
        if (isIp65504P204ReservdSModified()) { 
           ip65504P204ReservdS = refreshIp65504P204ReservdS();
        }
   		return ip65504P204ReservdS;
	}
	
	/**
	 * 	Update Ip65504P204ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P204-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P204ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P204ReservdS = checkIp65504P204ReservdSMaxLimit(number); 
		serializeIp65504P204ReservdS(ip65504P204ReservdS);
	}

	public void setIp65504P204ReservdS(int number) {
	    number = checkIp65504P204ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P204ReservdS((short)number);
	}
	public void setIp65504P204ReservdS(long number) {
	    number = checkIp65504P204ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P204ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P204ReservdL
	 *	@return ip65504P204ReservdL
	 */
	public short getIp65504P204ReservdL() throws CFException {
        if (isIp65504P204ReservdLModified()) { 
           ip65504P204ReservdL = refreshIp65504P204ReservdL();
        }
   		return ip65504P204ReservdL;
	}
	
	/**
	 * 	Update Ip65504P204ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P204-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P204ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P204ReservdL = checkIp65504P204ReservdLMaxLimit(number); 
		serializeIp65504P204ReservdL(ip65504P204ReservdL);
	}

	public void setIp65504P204ReservdL(int number) {
	    number = checkIp65504P204ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P204ReservdL((short)number);
	}
	public void setIp65504P204ReservdL(long number) {
	    number = checkIp65504P204ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P204ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P205ReservdS
	 *	@return ip65504P205ReservdS
	 */
	public short getIp65504P205ReservdS() throws CFException {
        if (isIp65504P205ReservdSModified()) { 
           ip65504P205ReservdS = refreshIp65504P205ReservdS();
        }
   		return ip65504P205ReservdS;
	}
	
	/**
	 * 	Update Ip65504P205ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P205-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P205ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P205ReservdS = checkIp65504P205ReservdSMaxLimit(number); 
		serializeIp65504P205ReservdS(ip65504P205ReservdS);
	}

	public void setIp65504P205ReservdS(int number) {
	    number = checkIp65504P205ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P205ReservdS((short)number);
	}
	public void setIp65504P205ReservdS(long number) {
	    number = checkIp65504P205ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P205ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P205ReservdL
	 *	@return ip65504P205ReservdL
	 */
	public short getIp65504P205ReservdL() throws CFException {
        if (isIp65504P205ReservdLModified()) { 
           ip65504P205ReservdL = refreshIp65504P205ReservdL();
        }
   		return ip65504P205ReservdL;
	}
	
	/**
	 * 	Update Ip65504P205ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P205-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P205ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P205ReservdL = checkIp65504P205ReservdLMaxLimit(number); 
		serializeIp65504P205ReservdL(ip65504P205ReservdL);
	}

	public void setIp65504P205ReservdL(int number) {
	    number = checkIp65504P205ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P205ReservdL((short)number);
	}
	public void setIp65504P205ReservdL(long number) {
	    number = checkIp65504P205ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P205ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P206ReservdS
	 *	@return ip65504P206ReservdS
	 */
	public short getIp65504P206ReservdS() throws CFException {
        if (isIp65504P206ReservdSModified()) { 
           ip65504P206ReservdS = refreshIp65504P206ReservdS();
        }
   		return ip65504P206ReservdS;
	}
	
	/**
	 * 	Update Ip65504P206ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P206-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P206ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P206ReservdS = checkIp65504P206ReservdSMaxLimit(number); 
		serializeIp65504P206ReservdS(ip65504P206ReservdS);
	}

	public void setIp65504P206ReservdS(int number) {
	    number = checkIp65504P206ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P206ReservdS((short)number);
	}
	public void setIp65504P206ReservdS(long number) {
	    number = checkIp65504P206ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P206ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P206ReservdL
	 *	@return ip65504P206ReservdL
	 */
	public short getIp65504P206ReservdL() throws CFException {
        if (isIp65504P206ReservdLModified()) { 
           ip65504P206ReservdL = refreshIp65504P206ReservdL();
        }
   		return ip65504P206ReservdL;
	}
	
	/**
	 * 	Update Ip65504P206ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P206-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P206ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P206ReservdL = checkIp65504P206ReservdLMaxLimit(number); 
		serializeIp65504P206ReservdL(ip65504P206ReservdL);
	}

	public void setIp65504P206ReservdL(int number) {
	    number = checkIp65504P206ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P206ReservdL((short)number);
	}
	public void setIp65504P206ReservdL(long number) {
	    number = checkIp65504P206ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P206ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P207ReservdS
	 *	@return ip65504P207ReservdS
	 */
	public short getIp65504P207ReservdS() throws CFException {
        if (isIp65504P207ReservdSModified()) { 
           ip65504P207ReservdS = refreshIp65504P207ReservdS();
        }
   		return ip65504P207ReservdS;
	}
	
	/**
	 * 	Update Ip65504P207ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P207-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P207ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P207ReservdS = checkIp65504P207ReservdSMaxLimit(number); 
		serializeIp65504P207ReservdS(ip65504P207ReservdS);
	}

	public void setIp65504P207ReservdS(int number) {
	    number = checkIp65504P207ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P207ReservdS((short)number);
	}
	public void setIp65504P207ReservdS(long number) {
	    number = checkIp65504P207ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P207ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P207ReservdL
	 *	@return ip65504P207ReservdL
	 */
	public short getIp65504P207ReservdL() throws CFException {
        if (isIp65504P207ReservdLModified()) { 
           ip65504P207ReservdL = refreshIp65504P207ReservdL();
        }
   		return ip65504P207ReservdL;
	}
	
	/**
	 * 	Update Ip65504P207ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P207-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P207ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P207ReservdL = checkIp65504P207ReservdLMaxLimit(number); 
		serializeIp65504P207ReservdL(ip65504P207ReservdL);
	}

	public void setIp65504P207ReservdL(int number) {
	    number = checkIp65504P207ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P207ReservdL((short)number);
	}
	public void setIp65504P207ReservdL(long number) {
	    number = checkIp65504P207ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P207ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P208ReservdS
	 *	@return ip65504P208ReservdS
	 */
	public short getIp65504P208ReservdS() throws CFException {
        if (isIp65504P208ReservdSModified()) { 
           ip65504P208ReservdS = refreshIp65504P208ReservdS();
        }
   		return ip65504P208ReservdS;
	}
	
	/**
	 * 	Update Ip65504P208ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P208-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P208ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P208ReservdS = checkIp65504P208ReservdSMaxLimit(number); 
		serializeIp65504P208ReservdS(ip65504P208ReservdS);
	}

	public void setIp65504P208ReservdS(int number) {
	    number = checkIp65504P208ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P208ReservdS((short)number);
	}
	public void setIp65504P208ReservdS(long number) {
	    number = checkIp65504P208ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P208ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P208ReservdL
	 *	@return ip65504P208ReservdL
	 */
	public short getIp65504P208ReservdL() throws CFException {
        if (isIp65504P208ReservdLModified()) { 
           ip65504P208ReservdL = refreshIp65504P208ReservdL();
        }
   		return ip65504P208ReservdL;
	}
	
	/**
	 * 	Update Ip65504P208ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P208-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P208ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P208ReservdL = checkIp65504P208ReservdLMaxLimit(number); 
		serializeIp65504P208ReservdL(ip65504P208ReservdL);
	}

	public void setIp65504P208ReservdL(int number) {
	    number = checkIp65504P208ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P208ReservdL((short)number);
	}
	public void setIp65504P208ReservdL(long number) {
	    number = checkIp65504P208ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P208ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P209ReservdS
	 *	@return ip65504P209ReservdS
	 */
	public short getIp65504P209ReservdS() throws CFException {
        if (isIp65504P209ReservdSModified()) { 
           ip65504P209ReservdS = refreshIp65504P209ReservdS();
        }
   		return ip65504P209ReservdS;
	}
	
	/**
	 * 	Update Ip65504P209ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P209-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P209ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P209ReservdS = checkIp65504P209ReservdSMaxLimit(number); 
		serializeIp65504P209ReservdS(ip65504P209ReservdS);
	}

	public void setIp65504P209ReservdS(int number) {
	    number = checkIp65504P209ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P209ReservdS((short)number);
	}
	public void setIp65504P209ReservdS(long number) {
	    number = checkIp65504P209ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P209ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P209ReservdL
	 *	@return ip65504P209ReservdL
	 */
	public short getIp65504P209ReservdL() throws CFException {
        if (isIp65504P209ReservdLModified()) { 
           ip65504P209ReservdL = refreshIp65504P209ReservdL();
        }
   		return ip65504P209ReservdL;
	}
	
	/**
	 * 	Update Ip65504P209ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P209-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P209ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P209ReservdL = checkIp65504P209ReservdLMaxLimit(number); 
		serializeIp65504P209ReservdL(ip65504P209ReservdL);
	}

	public void setIp65504P209ReservdL(int number) {
	    number = checkIp65504P209ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P209ReservdL((short)number);
	}
	public void setIp65504P209ReservdL(long number) {
	    number = checkIp65504P209ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P209ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P210ReservdS
	 *	@return ip65504P210ReservdS
	 */
	public short getIp65504P210ReservdS() throws CFException {
        if (isIp65504P210ReservdSModified()) { 
           ip65504P210ReservdS = refreshIp65504P210ReservdS();
        }
   		return ip65504P210ReservdS;
	}
	
	/**
	 * 	Update Ip65504P210ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P210-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P210ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P210ReservdS = checkIp65504P210ReservdSMaxLimit(number); 
		serializeIp65504P210ReservdS(ip65504P210ReservdS);
	}

	public void setIp65504P210ReservdS(int number) {
	    number = checkIp65504P210ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P210ReservdS((short)number);
	}
	public void setIp65504P210ReservdS(long number) {
	    number = checkIp65504P210ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P210ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P210ReservdL
	 *	@return ip65504P210ReservdL
	 */
	public short getIp65504P210ReservdL() throws CFException {
        if (isIp65504P210ReservdLModified()) { 
           ip65504P210ReservdL = refreshIp65504P210ReservdL();
        }
   		return ip65504P210ReservdL;
	}
	
	/**
	 * 	Update Ip65504P210ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P210-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P210ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P210ReservdL = checkIp65504P210ReservdLMaxLimit(number); 
		serializeIp65504P210ReservdL(ip65504P210ReservdL);
	}

	public void setIp65504P210ReservdL(int number) {
	    number = checkIp65504P210ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P210ReservdL((short)number);
	}
	public void setIp65504P210ReservdL(long number) {
	    number = checkIp65504P210ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P210ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P211ReservdS
	 *	@return ip65504P211ReservdS
	 */
	public short getIp65504P211ReservdS() throws CFException {
        if (isIp65504P211ReservdSModified()) { 
           ip65504P211ReservdS = refreshIp65504P211ReservdS();
        }
   		return ip65504P211ReservdS;
	}
	
	/**
	 * 	Update Ip65504P211ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P211-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P211ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P211ReservdS = checkIp65504P211ReservdSMaxLimit(number); 
		serializeIp65504P211ReservdS(ip65504P211ReservdS);
	}

	public void setIp65504P211ReservdS(int number) {
	    number = checkIp65504P211ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P211ReservdS((short)number);
	}
	public void setIp65504P211ReservdS(long number) {
	    number = checkIp65504P211ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P211ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P211ReservdL
	 *	@return ip65504P211ReservdL
	 */
	public short getIp65504P211ReservdL() throws CFException {
        if (isIp65504P211ReservdLModified()) { 
           ip65504P211ReservdL = refreshIp65504P211ReservdL();
        }
   		return ip65504P211ReservdL;
	}
	
	/**
	 * 	Update Ip65504P211ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P211-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P211ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P211ReservdL = checkIp65504P211ReservdLMaxLimit(number); 
		serializeIp65504P211ReservdL(ip65504P211ReservdL);
	}

	public void setIp65504P211ReservdL(int number) {
	    number = checkIp65504P211ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P211ReservdL((short)number);
	}
	public void setIp65504P211ReservdL(long number) {
	    number = checkIp65504P211ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P211ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P212ReservdS
	 *	@return ip65504P212ReservdS
	 */
	public short getIp65504P212ReservdS() throws CFException {
        if (isIp65504P212ReservdSModified()) { 
           ip65504P212ReservdS = refreshIp65504P212ReservdS();
        }
   		return ip65504P212ReservdS;
	}
	
	/**
	 * 	Update Ip65504P212ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P212-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P212ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P212ReservdS = checkIp65504P212ReservdSMaxLimit(number); 
		serializeIp65504P212ReservdS(ip65504P212ReservdS);
	}

	public void setIp65504P212ReservdS(int number) {
	    number = checkIp65504P212ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P212ReservdS((short)number);
	}
	public void setIp65504P212ReservdS(long number) {
	    number = checkIp65504P212ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P212ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P212ReservdL
	 *	@return ip65504P212ReservdL
	 */
	public short getIp65504P212ReservdL() throws CFException {
        if (isIp65504P212ReservdLModified()) { 
           ip65504P212ReservdL = refreshIp65504P212ReservdL();
        }
   		return ip65504P212ReservdL;
	}
	
	/**
	 * 	Update Ip65504P212ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P212-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P212ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P212ReservdL = checkIp65504P212ReservdLMaxLimit(number); 
		serializeIp65504P212ReservdL(ip65504P212ReservdL);
	}

	public void setIp65504P212ReservdL(int number) {
	    number = checkIp65504P212ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P212ReservdL((short)number);
	}
	public void setIp65504P212ReservdL(long number) {
	    number = checkIp65504P212ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P212ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P213ReservdS
	 *	@return ip65504P213ReservdS
	 */
	public short getIp65504P213ReservdS() throws CFException {
        if (isIp65504P213ReservdSModified()) { 
           ip65504P213ReservdS = refreshIp65504P213ReservdS();
        }
   		return ip65504P213ReservdS;
	}
	
	/**
	 * 	Update Ip65504P213ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P213-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P213ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P213ReservdS = checkIp65504P213ReservdSMaxLimit(number); 
		serializeIp65504P213ReservdS(ip65504P213ReservdS);
	}

	public void setIp65504P213ReservdS(int number) {
	    number = checkIp65504P213ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P213ReservdS((short)number);
	}
	public void setIp65504P213ReservdS(long number) {
	    number = checkIp65504P213ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P213ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P213ReservdL
	 *	@return ip65504P213ReservdL
	 */
	public short getIp65504P213ReservdL() throws CFException {
        if (isIp65504P213ReservdLModified()) { 
           ip65504P213ReservdL = refreshIp65504P213ReservdL();
        }
   		return ip65504P213ReservdL;
	}
	
	/**
	 * 	Update Ip65504P213ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P213-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P213ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P213ReservdL = checkIp65504P213ReservdLMaxLimit(number); 
		serializeIp65504P213ReservdL(ip65504P213ReservdL);
	}

	public void setIp65504P213ReservdL(int number) {
	    number = checkIp65504P213ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P213ReservdL((short)number);
	}
	public void setIp65504P213ReservdL(long number) {
	    number = checkIp65504P213ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P213ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P214ReservdS
	 *	@return ip65504P214ReservdS
	 */
	public short getIp65504P214ReservdS() throws CFException {
        if (isIp65504P214ReservdSModified()) { 
           ip65504P214ReservdS = refreshIp65504P214ReservdS();
        }
   		return ip65504P214ReservdS;
	}
	
	/**
	 * 	Update Ip65504P214ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P214-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P214ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P214ReservdS = checkIp65504P214ReservdSMaxLimit(number); 
		serializeIp65504P214ReservdS(ip65504P214ReservdS);
	}

	public void setIp65504P214ReservdS(int number) {
	    number = checkIp65504P214ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P214ReservdS((short)number);
	}
	public void setIp65504P214ReservdS(long number) {
	    number = checkIp65504P214ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P214ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P214ReservdL
	 *	@return ip65504P214ReservdL
	 */
	public short getIp65504P214ReservdL() throws CFException {
        if (isIp65504P214ReservdLModified()) { 
           ip65504P214ReservdL = refreshIp65504P214ReservdL();
        }
   		return ip65504P214ReservdL;
	}
	
	/**
	 * 	Update Ip65504P214ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P214-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P214ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P214ReservdL = checkIp65504P214ReservdLMaxLimit(number); 
		serializeIp65504P214ReservdL(ip65504P214ReservdL);
	}

	public void setIp65504P214ReservdL(int number) {
	    number = checkIp65504P214ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P214ReservdL((short)number);
	}
	public void setIp65504P214ReservdL(long number) {
	    number = checkIp65504P214ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P214ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P215ReservdS
	 *	@return ip65504P215ReservdS
	 */
	public short getIp65504P215ReservdS() throws CFException {
        if (isIp65504P215ReservdSModified()) { 
           ip65504P215ReservdS = refreshIp65504P215ReservdS();
        }
   		return ip65504P215ReservdS;
	}
	
	/**
	 * 	Update Ip65504P215ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P215-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P215ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P215ReservdS = checkIp65504P215ReservdSMaxLimit(number); 
		serializeIp65504P215ReservdS(ip65504P215ReservdS);
	}

	public void setIp65504P215ReservdS(int number) {
	    number = checkIp65504P215ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P215ReservdS((short)number);
	}
	public void setIp65504P215ReservdS(long number) {
	    number = checkIp65504P215ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P215ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P215ReservdL
	 *	@return ip65504P215ReservdL
	 */
	public short getIp65504P215ReservdL() throws CFException {
        if (isIp65504P215ReservdLModified()) { 
           ip65504P215ReservdL = refreshIp65504P215ReservdL();
        }
   		return ip65504P215ReservdL;
	}
	
	/**
	 * 	Update Ip65504P215ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P215-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P215ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P215ReservdL = checkIp65504P215ReservdLMaxLimit(number); 
		serializeIp65504P215ReservdL(ip65504P215ReservdL);
	}

	public void setIp65504P215ReservdL(int number) {
	    number = checkIp65504P215ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P215ReservdL((short)number);
	}
	public void setIp65504P215ReservdL(long number) {
	    number = checkIp65504P215ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P215ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P216ReservdS
	 *	@return ip65504P216ReservdS
	 */
	public short getIp65504P216ReservdS() throws CFException {
        if (isIp65504P216ReservdSModified()) { 
           ip65504P216ReservdS = refreshIp65504P216ReservdS();
        }
   		return ip65504P216ReservdS;
	}
	
	/**
	 * 	Update Ip65504P216ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P216-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P216ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P216ReservdS = checkIp65504P216ReservdSMaxLimit(number); 
		serializeIp65504P216ReservdS(ip65504P216ReservdS);
	}

	public void setIp65504P216ReservdS(int number) {
	    number = checkIp65504P216ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P216ReservdS((short)number);
	}
	public void setIp65504P216ReservdS(long number) {
	    number = checkIp65504P216ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P216ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P216ReservdL
	 *	@return ip65504P216ReservdL
	 */
	public short getIp65504P216ReservdL() throws CFException {
        if (isIp65504P216ReservdLModified()) { 
           ip65504P216ReservdL = refreshIp65504P216ReservdL();
        }
   		return ip65504P216ReservdL;
	}
	
	/**
	 * 	Update Ip65504P216ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P216-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P216ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P216ReservdL = checkIp65504P216ReservdLMaxLimit(number); 
		serializeIp65504P216ReservdL(ip65504P216ReservdL);
	}

	public void setIp65504P216ReservdL(int number) {
	    number = checkIp65504P216ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P216ReservdL((short)number);
	}
	public void setIp65504P216ReservdL(long number) {
	    number = checkIp65504P216ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P216ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P217ReservdS
	 *	@return ip65504P217ReservdS
	 */
	public short getIp65504P217ReservdS() throws CFException {
        if (isIp65504P217ReservdSModified()) { 
           ip65504P217ReservdS = refreshIp65504P217ReservdS();
        }
   		return ip65504P217ReservdS;
	}
	
	/**
	 * 	Update Ip65504P217ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P217-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P217ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P217ReservdS = checkIp65504P217ReservdSMaxLimit(number); 
		serializeIp65504P217ReservdS(ip65504P217ReservdS);
	}

	public void setIp65504P217ReservdS(int number) {
	    number = checkIp65504P217ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P217ReservdS((short)number);
	}
	public void setIp65504P217ReservdS(long number) {
	    number = checkIp65504P217ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P217ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P217ReservdL
	 *	@return ip65504P217ReservdL
	 */
	public short getIp65504P217ReservdL() throws CFException {
        if (isIp65504P217ReservdLModified()) { 
           ip65504P217ReservdL = refreshIp65504P217ReservdL();
        }
   		return ip65504P217ReservdL;
	}
	
	/**
	 * 	Update Ip65504P217ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P217-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P217ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P217ReservdL = checkIp65504P217ReservdLMaxLimit(number); 
		serializeIp65504P217ReservdL(ip65504P217ReservdL);
	}

	public void setIp65504P217ReservdL(int number) {
	    number = checkIp65504P217ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P217ReservdL((short)number);
	}
	public void setIp65504P217ReservdL(long number) {
	    number = checkIp65504P217ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P217ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P187ReservdS((short)0);
         	setIp65504P187ReservdL((short)0);
         	setIp65504P188ReservdS((short)0);
         	setIp65504P188ReservdL((short)0);
         	setIp65504P189PoiTelS((short)0);
         	setIp65504P189PoiTelL((short)0);
         	setIp65504P190PntrIdS((short)0);
         	setIp65504P190PntrIdL((short)0);
         	setIp65504P191OrgFmtS((short)0);
         	setIp65504P191OrgFmtL((short)0);
         	setIp65504P192ReservdS((short)0);
         	setIp65504P192ReservdL((short)0);
         	setIp65504P193ReservdS((short)0);
         	setIp65504P193ReservdL((short)0);
         	setIp65504P194ReservdS((short)0);
         	setIp65504P194ReservdL((short)0);
         	setIp65504P195ReservdS((short)0);
         	setIp65504P195ReservdL((short)0);
         	setIp65504P196ReservdS((short)0);
         	setIp65504P196ReservdL((short)0);
         	setIp65504P197ReservdS((short)0);
         	setIp65504P197ReservdL((short)0);
         	setIp65504P198ReservdS((short)0);
         	setIp65504P198ReservdL((short)0);
         	setIp65504P199ReservdS((short)0);
         	setIp65504P199ReservdL((short)0);
         	setIp65504P200ReservdS((short)0);
         	setIp65504P200ReservdL((short)0);
         	setIp65504P201ReservdS((short)0);
         	setIp65504P201ReservdL((short)0);
         	setIp65504P202ReservdS((short)0);
         	setIp65504P202ReservdL((short)0);
         	setIp65504P203ReservdS((short)0);
         	setIp65504P203ReservdL((short)0);
         	setIp65504P204ReservdS((short)0);
         	setIp65504P204ReservdL((short)0);
         	setIp65504P205ReservdS((short)0);
         	setIp65504P205ReservdL((short)0);
         	setIp65504P206ReservdS((short)0);
         	setIp65504P206ReservdL((short)0);
         	setIp65504P207ReservdS((short)0);
         	setIp65504P207ReservdL((short)0);
         	setIp65504P208ReservdS((short)0);
         	setIp65504P208ReservdL((short)0);
         	setIp65504P209ReservdS((short)0);
         	setIp65504P209ReservdL((short)0);
         	setIp65504P210ReservdS((short)0);
         	setIp65504P210ReservdL((short)0);
         	setIp65504P211ReservdS((short)0);
         	setIp65504P211ReservdL((short)0);
         	setIp65504P212ReservdS((short)0);
         	setIp65504P212ReservdL((short)0);
         	setIp65504P213ReservdS((short)0);
         	setIp65504P213ReservdL((short)0);
         	setIp65504P214ReservdS((short)0);
         	setIp65504P214ReservdL((short)0);
         	setIp65504P215ReservdS((short)0);
         	setIp65504P215ReservdL((short)0);
         	setIp65504P216ReservdS((short)0);
         	setIp65504P216ReservdL((short)0);
         	setIp65504P217ReservdS((short)0);
         	setIp65504P217ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup7FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_7_LENGTH;
		}

}
  
