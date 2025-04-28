package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup24 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup24 extends Ip65504PdsNamesLargeGroup24Serialized { 
   

								private short ip65504P714ExchngTktamtS;

								private short ip65504P714ExchngTktamtL;


								private short ip65504P715ExchngFeeamtS;

								private short ip65504P715ExchngFeeamtL;


								private short ip65504P716TravlAuthCdS;

								private short ip65504P716TravlAuthCdL;


								private short ip65504P717IataClientS;

								private short ip65504P717IataClientL;


								private short ip65504P718CardAccPhnoS;

								private short ip65504P718CardAccPhnoL;


								private short ip65504P719ReservdS;

								private short ip65504P719ReservdL;


								private short ip65504P720ReservdS;

								private short ip65504P720ReservdL;


								private short ip65504P721ReservdS;

								private short ip65504P721ReservdL;


								private short ip65504P722ReservdS;

								private short ip65504P722ReservdL;


								private short ip65504P723ReservdS;

								private short ip65504P723ReservdL;


								private short ip65504P724ReservdS;

								private short ip65504P724ReservdL;


								private short ip65504P725ReservdS;

								private short ip65504P725ReservdL;


								private short ip65504P726ReservdS;

								private short ip65504P726ReservdL;


								private short ip65504P727ReservdS;

								private short ip65504P727ReservdL;


								private short ip65504P728ReservdS;

								private short ip65504P728ReservdL;


								private short ip65504P729ReservdS;

								private short ip65504P729ReservdL;


								private short ip65504P730ReservdS;

								private short ip65504P730ReservdL;


								private short ip65504P731ReservdS;

								private short ip65504P731ReservdL;


								private short ip65504P732ReservdS;

								private short ip65504P732ReservdL;


								private short ip65504P733ReservdS;

								private short ip65504P733ReservdL;


								private short ip65504P734ReservdS;

								private short ip65504P734ReservdL;


								private short ip65504P735ReservdS;

								private short ip65504P735ReservdL;


								private short ip65504P736ReservdS;

								private short ip65504P736ReservdL;


								private short ip65504P737ReservdS;

								private short ip65504P737ReservdL;


								private short ip65504P738ReservdS;

								private short ip65504P738ReservdL;


								private short ip65504P739ReservdS;

								private short ip65504P739ReservdL;


								private short ip65504P740ReservdS;

								private short ip65504P740ReservdL;


								private short ip65504P741ReservdS;

								private short ip65504P741ReservdL;


								private short ip65504P742ReservdS;

								private short ip65504P742ReservdL;


								private short ip65504P743ReservdS;

								private short ip65504P743ReservdL;


								private short ip65504P744ReservdS;

								private short ip65504P744ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup24
	**/
    public Ip65504PdsNamesLargeGroup24() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup24. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup24(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P714ExchngTktamtS
	 *	@return ip65504P714ExchngTktamtS
	 */
	public short getIp65504P714ExchngTktamtS() throws CFException {
        if (isIp65504P714ExchngTktamtSModified()) { 
           ip65504P714ExchngTktamtS = refreshIp65504P714ExchngTktamtS();
        }
   		return ip65504P714ExchngTktamtS;
	}
	
	/**
	 * 	Update Ip65504P714ExchngTktamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P714-EXCHNG-TKTAMT-S
	 *	@param number
	 */
	public void setIp65504P714ExchngTktamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P714ExchngTktamtS = checkIp65504P714ExchngTktamtSMaxLimit(number); 
		serializeIp65504P714ExchngTktamtS(ip65504P714ExchngTktamtS);
	}

	public void setIp65504P714ExchngTktamtS(int number) {
	    number = checkIp65504P714ExchngTktamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P714ExchngTktamtS((short)number);
	}
	public void setIp65504P714ExchngTktamtS(long number) {
	    number = checkIp65504P714ExchngTktamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P714ExchngTktamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P714ExchngTktamtL
	 *	@return ip65504P714ExchngTktamtL
	 */
	public short getIp65504P714ExchngTktamtL() throws CFException {
        if (isIp65504P714ExchngTktamtLModified()) { 
           ip65504P714ExchngTktamtL = refreshIp65504P714ExchngTktamtL();
        }
   		return ip65504P714ExchngTktamtL;
	}
	
	/**
	 * 	Update Ip65504P714ExchngTktamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P714-EXCHNG-TKTAMT-L
	 *	@param number
	 */
	public void setIp65504P714ExchngTktamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P714ExchngTktamtL = checkIp65504P714ExchngTktamtLMaxLimit(number); 
		serializeIp65504P714ExchngTktamtL(ip65504P714ExchngTktamtL);
	}

	public void setIp65504P714ExchngTktamtL(int number) {
	    number = checkIp65504P714ExchngTktamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P714ExchngTktamtL((short)number);
	}
	public void setIp65504P714ExchngTktamtL(long number) {
	    number = checkIp65504P714ExchngTktamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P714ExchngTktamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P715ExchngFeeamtS
	 *	@return ip65504P715ExchngFeeamtS
	 */
	public short getIp65504P715ExchngFeeamtS() throws CFException {
        if (isIp65504P715ExchngFeeamtSModified()) { 
           ip65504P715ExchngFeeamtS = refreshIp65504P715ExchngFeeamtS();
        }
   		return ip65504P715ExchngFeeamtS;
	}
	
	/**
	 * 	Update Ip65504P715ExchngFeeamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P715-EXCHNG-FEEAMT-S
	 *	@param number
	 */
	public void setIp65504P715ExchngFeeamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P715ExchngFeeamtS = checkIp65504P715ExchngFeeamtSMaxLimit(number); 
		serializeIp65504P715ExchngFeeamtS(ip65504P715ExchngFeeamtS);
	}

	public void setIp65504P715ExchngFeeamtS(int number) {
	    number = checkIp65504P715ExchngFeeamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P715ExchngFeeamtS((short)number);
	}
	public void setIp65504P715ExchngFeeamtS(long number) {
	    number = checkIp65504P715ExchngFeeamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P715ExchngFeeamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P715ExchngFeeamtL
	 *	@return ip65504P715ExchngFeeamtL
	 */
	public short getIp65504P715ExchngFeeamtL() throws CFException {
        if (isIp65504P715ExchngFeeamtLModified()) { 
           ip65504P715ExchngFeeamtL = refreshIp65504P715ExchngFeeamtL();
        }
   		return ip65504P715ExchngFeeamtL;
	}
	
	/**
	 * 	Update Ip65504P715ExchngFeeamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P715-EXCHNG-FEEAMT-L
	 *	@param number
	 */
	public void setIp65504P715ExchngFeeamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P715ExchngFeeamtL = checkIp65504P715ExchngFeeamtLMaxLimit(number); 
		serializeIp65504P715ExchngFeeamtL(ip65504P715ExchngFeeamtL);
	}

	public void setIp65504P715ExchngFeeamtL(int number) {
	    number = checkIp65504P715ExchngFeeamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P715ExchngFeeamtL((short)number);
	}
	public void setIp65504P715ExchngFeeamtL(long number) {
	    number = checkIp65504P715ExchngFeeamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P715ExchngFeeamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P716TravlAuthCdS
	 *	@return ip65504P716TravlAuthCdS
	 */
	public short getIp65504P716TravlAuthCdS() throws CFException {
        if (isIp65504P716TravlAuthCdSModified()) { 
           ip65504P716TravlAuthCdS = refreshIp65504P716TravlAuthCdS();
        }
   		return ip65504P716TravlAuthCdS;
	}
	
	/**
	 * 	Update Ip65504P716TravlAuthCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P716-TRAVL-AUTH-CD-S
	 *	@param number
	 */
	public void setIp65504P716TravlAuthCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P716TravlAuthCdS = checkIp65504P716TravlAuthCdSMaxLimit(number); 
		serializeIp65504P716TravlAuthCdS(ip65504P716TravlAuthCdS);
	}

	public void setIp65504P716TravlAuthCdS(int number) {
	    number = checkIp65504P716TravlAuthCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P716TravlAuthCdS((short)number);
	}
	public void setIp65504P716TravlAuthCdS(long number) {
	    number = checkIp65504P716TravlAuthCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P716TravlAuthCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P716TravlAuthCdL
	 *	@return ip65504P716TravlAuthCdL
	 */
	public short getIp65504P716TravlAuthCdL() throws CFException {
        if (isIp65504P716TravlAuthCdLModified()) { 
           ip65504P716TravlAuthCdL = refreshIp65504P716TravlAuthCdL();
        }
   		return ip65504P716TravlAuthCdL;
	}
	
	/**
	 * 	Update Ip65504P716TravlAuthCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P716-TRAVL-AUTH-CD-L
	 *	@param number
	 */
	public void setIp65504P716TravlAuthCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P716TravlAuthCdL = checkIp65504P716TravlAuthCdLMaxLimit(number); 
		serializeIp65504P716TravlAuthCdL(ip65504P716TravlAuthCdL);
	}

	public void setIp65504P716TravlAuthCdL(int number) {
	    number = checkIp65504P716TravlAuthCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P716TravlAuthCdL((short)number);
	}
	public void setIp65504P716TravlAuthCdL(long number) {
	    number = checkIp65504P716TravlAuthCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P716TravlAuthCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P717IataClientS
	 *	@return ip65504P717IataClientS
	 */
	public short getIp65504P717IataClientS() throws CFException {
        if (isIp65504P717IataClientSModified()) { 
           ip65504P717IataClientS = refreshIp65504P717IataClientS();
        }
   		return ip65504P717IataClientS;
	}
	
	/**
	 * 	Update Ip65504P717IataClientS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P717-IATA-CLIENT-S
	 *	@param number
	 */
	public void setIp65504P717IataClientS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P717IataClientS = checkIp65504P717IataClientSMaxLimit(number); 
		serializeIp65504P717IataClientS(ip65504P717IataClientS);
	}

	public void setIp65504P717IataClientS(int number) {
	    number = checkIp65504P717IataClientSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P717IataClientS((short)number);
	}
	public void setIp65504P717IataClientS(long number) {
	    number = checkIp65504P717IataClientSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P717IataClientS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P717IataClientL
	 *	@return ip65504P717IataClientL
	 */
	public short getIp65504P717IataClientL() throws CFException {
        if (isIp65504P717IataClientLModified()) { 
           ip65504P717IataClientL = refreshIp65504P717IataClientL();
        }
   		return ip65504P717IataClientL;
	}
	
	/**
	 * 	Update Ip65504P717IataClientL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P717-IATA-CLIENT-L
	 *	@param number
	 */
	public void setIp65504P717IataClientL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P717IataClientL = checkIp65504P717IataClientLMaxLimit(number); 
		serializeIp65504P717IataClientL(ip65504P717IataClientL);
	}

	public void setIp65504P717IataClientL(int number) {
	    number = checkIp65504P717IataClientLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P717IataClientL((short)number);
	}
	public void setIp65504P717IataClientL(long number) {
	    number = checkIp65504P717IataClientLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P717IataClientL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P718CardAccPhnoS
	 *	@return ip65504P718CardAccPhnoS
	 */
	public short getIp65504P718CardAccPhnoS() throws CFException {
        if (isIp65504P718CardAccPhnoSModified()) { 
           ip65504P718CardAccPhnoS = refreshIp65504P718CardAccPhnoS();
        }
   		return ip65504P718CardAccPhnoS;
	}
	
	/**
	 * 	Update Ip65504P718CardAccPhnoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P718-CARD-ACC-PHNO-S
	 *	@param number
	 */
	public void setIp65504P718CardAccPhnoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P718CardAccPhnoS = checkIp65504P718CardAccPhnoSMaxLimit(number); 
		serializeIp65504P718CardAccPhnoS(ip65504P718CardAccPhnoS);
	}

	public void setIp65504P718CardAccPhnoS(int number) {
	    number = checkIp65504P718CardAccPhnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P718CardAccPhnoS((short)number);
	}
	public void setIp65504P718CardAccPhnoS(long number) {
	    number = checkIp65504P718CardAccPhnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P718CardAccPhnoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P718CardAccPhnoL
	 *	@return ip65504P718CardAccPhnoL
	 */
	public short getIp65504P718CardAccPhnoL() throws CFException {
        if (isIp65504P718CardAccPhnoLModified()) { 
           ip65504P718CardAccPhnoL = refreshIp65504P718CardAccPhnoL();
        }
   		return ip65504P718CardAccPhnoL;
	}
	
	/**
	 * 	Update Ip65504P718CardAccPhnoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P718-CARD-ACC-PHNO-L
	 *	@param number
	 */
	public void setIp65504P718CardAccPhnoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P718CardAccPhnoL = checkIp65504P718CardAccPhnoLMaxLimit(number); 
		serializeIp65504P718CardAccPhnoL(ip65504P718CardAccPhnoL);
	}

	public void setIp65504P718CardAccPhnoL(int number) {
	    number = checkIp65504P718CardAccPhnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P718CardAccPhnoL((short)number);
	}
	public void setIp65504P718CardAccPhnoL(long number) {
	    number = checkIp65504P718CardAccPhnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P718CardAccPhnoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P719ReservdS
	 *	@return ip65504P719ReservdS
	 */
	public short getIp65504P719ReservdS() throws CFException {
        if (isIp65504P719ReservdSModified()) { 
           ip65504P719ReservdS = refreshIp65504P719ReservdS();
        }
   		return ip65504P719ReservdS;
	}
	
	/**
	 * 	Update Ip65504P719ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P719-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P719ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P719ReservdS = checkIp65504P719ReservdSMaxLimit(number); 
		serializeIp65504P719ReservdS(ip65504P719ReservdS);
	}

	public void setIp65504P719ReservdS(int number) {
	    number = checkIp65504P719ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P719ReservdS((short)number);
	}
	public void setIp65504P719ReservdS(long number) {
	    number = checkIp65504P719ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P719ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P719ReservdL
	 *	@return ip65504P719ReservdL
	 */
	public short getIp65504P719ReservdL() throws CFException {
        if (isIp65504P719ReservdLModified()) { 
           ip65504P719ReservdL = refreshIp65504P719ReservdL();
        }
   		return ip65504P719ReservdL;
	}
	
	/**
	 * 	Update Ip65504P719ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P719-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P719ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P719ReservdL = checkIp65504P719ReservdLMaxLimit(number); 
		serializeIp65504P719ReservdL(ip65504P719ReservdL);
	}

	public void setIp65504P719ReservdL(int number) {
	    number = checkIp65504P719ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P719ReservdL((short)number);
	}
	public void setIp65504P719ReservdL(long number) {
	    number = checkIp65504P719ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P719ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P720ReservdS
	 *	@return ip65504P720ReservdS
	 */
	public short getIp65504P720ReservdS() throws CFException {
        if (isIp65504P720ReservdSModified()) { 
           ip65504P720ReservdS = refreshIp65504P720ReservdS();
        }
   		return ip65504P720ReservdS;
	}
	
	/**
	 * 	Update Ip65504P720ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P720-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P720ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P720ReservdS = checkIp65504P720ReservdSMaxLimit(number); 
		serializeIp65504P720ReservdS(ip65504P720ReservdS);
	}

	public void setIp65504P720ReservdS(int number) {
	    number = checkIp65504P720ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P720ReservdS((short)number);
	}
	public void setIp65504P720ReservdS(long number) {
	    number = checkIp65504P720ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P720ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P720ReservdL
	 *	@return ip65504P720ReservdL
	 */
	public short getIp65504P720ReservdL() throws CFException {
        if (isIp65504P720ReservdLModified()) { 
           ip65504P720ReservdL = refreshIp65504P720ReservdL();
        }
   		return ip65504P720ReservdL;
	}
	
	/**
	 * 	Update Ip65504P720ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P720-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P720ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P720ReservdL = checkIp65504P720ReservdLMaxLimit(number); 
		serializeIp65504P720ReservdL(ip65504P720ReservdL);
	}

	public void setIp65504P720ReservdL(int number) {
	    number = checkIp65504P720ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P720ReservdL((short)number);
	}
	public void setIp65504P720ReservdL(long number) {
	    number = checkIp65504P720ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P720ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P721ReservdS
	 *	@return ip65504P721ReservdS
	 */
	public short getIp65504P721ReservdS() throws CFException {
        if (isIp65504P721ReservdSModified()) { 
           ip65504P721ReservdS = refreshIp65504P721ReservdS();
        }
   		return ip65504P721ReservdS;
	}
	
	/**
	 * 	Update Ip65504P721ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P721-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P721ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P721ReservdS = checkIp65504P721ReservdSMaxLimit(number); 
		serializeIp65504P721ReservdS(ip65504P721ReservdS);
	}

	public void setIp65504P721ReservdS(int number) {
	    number = checkIp65504P721ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P721ReservdS((short)number);
	}
	public void setIp65504P721ReservdS(long number) {
	    number = checkIp65504P721ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P721ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P721ReservdL
	 *	@return ip65504P721ReservdL
	 */
	public short getIp65504P721ReservdL() throws CFException {
        if (isIp65504P721ReservdLModified()) { 
           ip65504P721ReservdL = refreshIp65504P721ReservdL();
        }
   		return ip65504P721ReservdL;
	}
	
	/**
	 * 	Update Ip65504P721ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P721-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P721ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P721ReservdL = checkIp65504P721ReservdLMaxLimit(number); 
		serializeIp65504P721ReservdL(ip65504P721ReservdL);
	}

	public void setIp65504P721ReservdL(int number) {
	    number = checkIp65504P721ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P721ReservdL((short)number);
	}
	public void setIp65504P721ReservdL(long number) {
	    number = checkIp65504P721ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P721ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P722ReservdS
	 *	@return ip65504P722ReservdS
	 */
	public short getIp65504P722ReservdS() throws CFException {
        if (isIp65504P722ReservdSModified()) { 
           ip65504P722ReservdS = refreshIp65504P722ReservdS();
        }
   		return ip65504P722ReservdS;
	}
	
	/**
	 * 	Update Ip65504P722ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P722-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P722ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P722ReservdS = checkIp65504P722ReservdSMaxLimit(number); 
		serializeIp65504P722ReservdS(ip65504P722ReservdS);
	}

	public void setIp65504P722ReservdS(int number) {
	    number = checkIp65504P722ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P722ReservdS((short)number);
	}
	public void setIp65504P722ReservdS(long number) {
	    number = checkIp65504P722ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P722ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P722ReservdL
	 *	@return ip65504P722ReservdL
	 */
	public short getIp65504P722ReservdL() throws CFException {
        if (isIp65504P722ReservdLModified()) { 
           ip65504P722ReservdL = refreshIp65504P722ReservdL();
        }
   		return ip65504P722ReservdL;
	}
	
	/**
	 * 	Update Ip65504P722ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P722-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P722ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P722ReservdL = checkIp65504P722ReservdLMaxLimit(number); 
		serializeIp65504P722ReservdL(ip65504P722ReservdL);
	}

	public void setIp65504P722ReservdL(int number) {
	    number = checkIp65504P722ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P722ReservdL((short)number);
	}
	public void setIp65504P722ReservdL(long number) {
	    number = checkIp65504P722ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P722ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P723ReservdS
	 *	@return ip65504P723ReservdS
	 */
	public short getIp65504P723ReservdS() throws CFException {
        if (isIp65504P723ReservdSModified()) { 
           ip65504P723ReservdS = refreshIp65504P723ReservdS();
        }
   		return ip65504P723ReservdS;
	}
	
	/**
	 * 	Update Ip65504P723ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P723-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P723ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P723ReservdS = checkIp65504P723ReservdSMaxLimit(number); 
		serializeIp65504P723ReservdS(ip65504P723ReservdS);
	}

	public void setIp65504P723ReservdS(int number) {
	    number = checkIp65504P723ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P723ReservdS((short)number);
	}
	public void setIp65504P723ReservdS(long number) {
	    number = checkIp65504P723ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P723ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P723ReservdL
	 *	@return ip65504P723ReservdL
	 */
	public short getIp65504P723ReservdL() throws CFException {
        if (isIp65504P723ReservdLModified()) { 
           ip65504P723ReservdL = refreshIp65504P723ReservdL();
        }
   		return ip65504P723ReservdL;
	}
	
	/**
	 * 	Update Ip65504P723ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P723-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P723ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P723ReservdL = checkIp65504P723ReservdLMaxLimit(number); 
		serializeIp65504P723ReservdL(ip65504P723ReservdL);
	}

	public void setIp65504P723ReservdL(int number) {
	    number = checkIp65504P723ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P723ReservdL((short)number);
	}
	public void setIp65504P723ReservdL(long number) {
	    number = checkIp65504P723ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P723ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P724ReservdS
	 *	@return ip65504P724ReservdS
	 */
	public short getIp65504P724ReservdS() throws CFException {
        if (isIp65504P724ReservdSModified()) { 
           ip65504P724ReservdS = refreshIp65504P724ReservdS();
        }
   		return ip65504P724ReservdS;
	}
	
	/**
	 * 	Update Ip65504P724ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P724-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P724ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P724ReservdS = checkIp65504P724ReservdSMaxLimit(number); 
		serializeIp65504P724ReservdS(ip65504P724ReservdS);
	}

	public void setIp65504P724ReservdS(int number) {
	    number = checkIp65504P724ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P724ReservdS((short)number);
	}
	public void setIp65504P724ReservdS(long number) {
	    number = checkIp65504P724ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P724ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P724ReservdL
	 *	@return ip65504P724ReservdL
	 */
	public short getIp65504P724ReservdL() throws CFException {
        if (isIp65504P724ReservdLModified()) { 
           ip65504P724ReservdL = refreshIp65504P724ReservdL();
        }
   		return ip65504P724ReservdL;
	}
	
	/**
	 * 	Update Ip65504P724ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P724-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P724ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P724ReservdL = checkIp65504P724ReservdLMaxLimit(number); 
		serializeIp65504P724ReservdL(ip65504P724ReservdL);
	}

	public void setIp65504P724ReservdL(int number) {
	    number = checkIp65504P724ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P724ReservdL((short)number);
	}
	public void setIp65504P724ReservdL(long number) {
	    number = checkIp65504P724ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P724ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P725ReservdS
	 *	@return ip65504P725ReservdS
	 */
	public short getIp65504P725ReservdS() throws CFException {
        if (isIp65504P725ReservdSModified()) { 
           ip65504P725ReservdS = refreshIp65504P725ReservdS();
        }
   		return ip65504P725ReservdS;
	}
	
	/**
	 * 	Update Ip65504P725ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P725-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P725ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P725ReservdS = checkIp65504P725ReservdSMaxLimit(number); 
		serializeIp65504P725ReservdS(ip65504P725ReservdS);
	}

	public void setIp65504P725ReservdS(int number) {
	    number = checkIp65504P725ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P725ReservdS((short)number);
	}
	public void setIp65504P725ReservdS(long number) {
	    number = checkIp65504P725ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P725ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P725ReservdL
	 *	@return ip65504P725ReservdL
	 */
	public short getIp65504P725ReservdL() throws CFException {
        if (isIp65504P725ReservdLModified()) { 
           ip65504P725ReservdL = refreshIp65504P725ReservdL();
        }
   		return ip65504P725ReservdL;
	}
	
	/**
	 * 	Update Ip65504P725ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P725-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P725ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P725ReservdL = checkIp65504P725ReservdLMaxLimit(number); 
		serializeIp65504P725ReservdL(ip65504P725ReservdL);
	}

	public void setIp65504P725ReservdL(int number) {
	    number = checkIp65504P725ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P725ReservdL((short)number);
	}
	public void setIp65504P725ReservdL(long number) {
	    number = checkIp65504P725ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P725ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P726ReservdS
	 *	@return ip65504P726ReservdS
	 */
	public short getIp65504P726ReservdS() throws CFException {
        if (isIp65504P726ReservdSModified()) { 
           ip65504P726ReservdS = refreshIp65504P726ReservdS();
        }
   		return ip65504P726ReservdS;
	}
	
	/**
	 * 	Update Ip65504P726ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P726-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P726ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P726ReservdS = checkIp65504P726ReservdSMaxLimit(number); 
		serializeIp65504P726ReservdS(ip65504P726ReservdS);
	}

	public void setIp65504P726ReservdS(int number) {
	    number = checkIp65504P726ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P726ReservdS((short)number);
	}
	public void setIp65504P726ReservdS(long number) {
	    number = checkIp65504P726ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P726ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P726ReservdL
	 *	@return ip65504P726ReservdL
	 */
	public short getIp65504P726ReservdL() throws CFException {
        if (isIp65504P726ReservdLModified()) { 
           ip65504P726ReservdL = refreshIp65504P726ReservdL();
        }
   		return ip65504P726ReservdL;
	}
	
	/**
	 * 	Update Ip65504P726ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P726-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P726ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P726ReservdL = checkIp65504P726ReservdLMaxLimit(number); 
		serializeIp65504P726ReservdL(ip65504P726ReservdL);
	}

	public void setIp65504P726ReservdL(int number) {
	    number = checkIp65504P726ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P726ReservdL((short)number);
	}
	public void setIp65504P726ReservdL(long number) {
	    number = checkIp65504P726ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P726ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P727ReservdS
	 *	@return ip65504P727ReservdS
	 */
	public short getIp65504P727ReservdS() throws CFException {
        if (isIp65504P727ReservdSModified()) { 
           ip65504P727ReservdS = refreshIp65504P727ReservdS();
        }
   		return ip65504P727ReservdS;
	}
	
	/**
	 * 	Update Ip65504P727ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P727-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P727ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P727ReservdS = checkIp65504P727ReservdSMaxLimit(number); 
		serializeIp65504P727ReservdS(ip65504P727ReservdS);
	}

	public void setIp65504P727ReservdS(int number) {
	    number = checkIp65504P727ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P727ReservdS((short)number);
	}
	public void setIp65504P727ReservdS(long number) {
	    number = checkIp65504P727ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P727ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P727ReservdL
	 *	@return ip65504P727ReservdL
	 */
	public short getIp65504P727ReservdL() throws CFException {
        if (isIp65504P727ReservdLModified()) { 
           ip65504P727ReservdL = refreshIp65504P727ReservdL();
        }
   		return ip65504P727ReservdL;
	}
	
	/**
	 * 	Update Ip65504P727ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P727-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P727ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P727ReservdL = checkIp65504P727ReservdLMaxLimit(number); 
		serializeIp65504P727ReservdL(ip65504P727ReservdL);
	}

	public void setIp65504P727ReservdL(int number) {
	    number = checkIp65504P727ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P727ReservdL((short)number);
	}
	public void setIp65504P727ReservdL(long number) {
	    number = checkIp65504P727ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P727ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P728ReservdS
	 *	@return ip65504P728ReservdS
	 */
	public short getIp65504P728ReservdS() throws CFException {
        if (isIp65504P728ReservdSModified()) { 
           ip65504P728ReservdS = refreshIp65504P728ReservdS();
        }
   		return ip65504P728ReservdS;
	}
	
	/**
	 * 	Update Ip65504P728ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P728-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P728ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P728ReservdS = checkIp65504P728ReservdSMaxLimit(number); 
		serializeIp65504P728ReservdS(ip65504P728ReservdS);
	}

	public void setIp65504P728ReservdS(int number) {
	    number = checkIp65504P728ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P728ReservdS((short)number);
	}
	public void setIp65504P728ReservdS(long number) {
	    number = checkIp65504P728ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P728ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P728ReservdL
	 *	@return ip65504P728ReservdL
	 */
	public short getIp65504P728ReservdL() throws CFException {
        if (isIp65504P728ReservdLModified()) { 
           ip65504P728ReservdL = refreshIp65504P728ReservdL();
        }
   		return ip65504P728ReservdL;
	}
	
	/**
	 * 	Update Ip65504P728ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P728-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P728ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P728ReservdL = checkIp65504P728ReservdLMaxLimit(number); 
		serializeIp65504P728ReservdL(ip65504P728ReservdL);
	}

	public void setIp65504P728ReservdL(int number) {
	    number = checkIp65504P728ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P728ReservdL((short)number);
	}
	public void setIp65504P728ReservdL(long number) {
	    number = checkIp65504P728ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P728ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P729ReservdS
	 *	@return ip65504P729ReservdS
	 */
	public short getIp65504P729ReservdS() throws CFException {
        if (isIp65504P729ReservdSModified()) { 
           ip65504P729ReservdS = refreshIp65504P729ReservdS();
        }
   		return ip65504P729ReservdS;
	}
	
	/**
	 * 	Update Ip65504P729ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P729-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P729ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P729ReservdS = checkIp65504P729ReservdSMaxLimit(number); 
		serializeIp65504P729ReservdS(ip65504P729ReservdS);
	}

	public void setIp65504P729ReservdS(int number) {
	    number = checkIp65504P729ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P729ReservdS((short)number);
	}
	public void setIp65504P729ReservdS(long number) {
	    number = checkIp65504P729ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P729ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P729ReservdL
	 *	@return ip65504P729ReservdL
	 */
	public short getIp65504P729ReservdL() throws CFException {
        if (isIp65504P729ReservdLModified()) { 
           ip65504P729ReservdL = refreshIp65504P729ReservdL();
        }
   		return ip65504P729ReservdL;
	}
	
	/**
	 * 	Update Ip65504P729ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P729-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P729ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P729ReservdL = checkIp65504P729ReservdLMaxLimit(number); 
		serializeIp65504P729ReservdL(ip65504P729ReservdL);
	}

	public void setIp65504P729ReservdL(int number) {
	    number = checkIp65504P729ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P729ReservdL((short)number);
	}
	public void setIp65504P729ReservdL(long number) {
	    number = checkIp65504P729ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P729ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P730ReservdS
	 *	@return ip65504P730ReservdS
	 */
	public short getIp65504P730ReservdS() throws CFException {
        if (isIp65504P730ReservdSModified()) { 
           ip65504P730ReservdS = refreshIp65504P730ReservdS();
        }
   		return ip65504P730ReservdS;
	}
	
	/**
	 * 	Update Ip65504P730ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P730-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P730ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P730ReservdS = checkIp65504P730ReservdSMaxLimit(number); 
		serializeIp65504P730ReservdS(ip65504P730ReservdS);
	}

	public void setIp65504P730ReservdS(int number) {
	    number = checkIp65504P730ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P730ReservdS((short)number);
	}
	public void setIp65504P730ReservdS(long number) {
	    number = checkIp65504P730ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P730ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P730ReservdL
	 *	@return ip65504P730ReservdL
	 */
	public short getIp65504P730ReservdL() throws CFException {
        if (isIp65504P730ReservdLModified()) { 
           ip65504P730ReservdL = refreshIp65504P730ReservdL();
        }
   		return ip65504P730ReservdL;
	}
	
	/**
	 * 	Update Ip65504P730ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P730-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P730ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P730ReservdL = checkIp65504P730ReservdLMaxLimit(number); 
		serializeIp65504P730ReservdL(ip65504P730ReservdL);
	}

	public void setIp65504P730ReservdL(int number) {
	    number = checkIp65504P730ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P730ReservdL((short)number);
	}
	public void setIp65504P730ReservdL(long number) {
	    number = checkIp65504P730ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P730ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P731ReservdS
	 *	@return ip65504P731ReservdS
	 */
	public short getIp65504P731ReservdS() throws CFException {
        if (isIp65504P731ReservdSModified()) { 
           ip65504P731ReservdS = refreshIp65504P731ReservdS();
        }
   		return ip65504P731ReservdS;
	}
	
	/**
	 * 	Update Ip65504P731ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P731-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P731ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P731ReservdS = checkIp65504P731ReservdSMaxLimit(number); 
		serializeIp65504P731ReservdS(ip65504P731ReservdS);
	}

	public void setIp65504P731ReservdS(int number) {
	    number = checkIp65504P731ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P731ReservdS((short)number);
	}
	public void setIp65504P731ReservdS(long number) {
	    number = checkIp65504P731ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P731ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P731ReservdL
	 *	@return ip65504P731ReservdL
	 */
	public short getIp65504P731ReservdL() throws CFException {
        if (isIp65504P731ReservdLModified()) { 
           ip65504P731ReservdL = refreshIp65504P731ReservdL();
        }
   		return ip65504P731ReservdL;
	}
	
	/**
	 * 	Update Ip65504P731ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P731-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P731ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P731ReservdL = checkIp65504P731ReservdLMaxLimit(number); 
		serializeIp65504P731ReservdL(ip65504P731ReservdL);
	}

	public void setIp65504P731ReservdL(int number) {
	    number = checkIp65504P731ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P731ReservdL((short)number);
	}
	public void setIp65504P731ReservdL(long number) {
	    number = checkIp65504P731ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P731ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P732ReservdS
	 *	@return ip65504P732ReservdS
	 */
	public short getIp65504P732ReservdS() throws CFException {
        if (isIp65504P732ReservdSModified()) { 
           ip65504P732ReservdS = refreshIp65504P732ReservdS();
        }
   		return ip65504P732ReservdS;
	}
	
	/**
	 * 	Update Ip65504P732ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P732-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P732ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P732ReservdS = checkIp65504P732ReservdSMaxLimit(number); 
		serializeIp65504P732ReservdS(ip65504P732ReservdS);
	}

	public void setIp65504P732ReservdS(int number) {
	    number = checkIp65504P732ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P732ReservdS((short)number);
	}
	public void setIp65504P732ReservdS(long number) {
	    number = checkIp65504P732ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P732ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P732ReservdL
	 *	@return ip65504P732ReservdL
	 */
	public short getIp65504P732ReservdL() throws CFException {
        if (isIp65504P732ReservdLModified()) { 
           ip65504P732ReservdL = refreshIp65504P732ReservdL();
        }
   		return ip65504P732ReservdL;
	}
	
	/**
	 * 	Update Ip65504P732ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P732-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P732ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P732ReservdL = checkIp65504P732ReservdLMaxLimit(number); 
		serializeIp65504P732ReservdL(ip65504P732ReservdL);
	}

	public void setIp65504P732ReservdL(int number) {
	    number = checkIp65504P732ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P732ReservdL((short)number);
	}
	public void setIp65504P732ReservdL(long number) {
	    number = checkIp65504P732ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P732ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P733ReservdS
	 *	@return ip65504P733ReservdS
	 */
	public short getIp65504P733ReservdS() throws CFException {
        if (isIp65504P733ReservdSModified()) { 
           ip65504P733ReservdS = refreshIp65504P733ReservdS();
        }
   		return ip65504P733ReservdS;
	}
	
	/**
	 * 	Update Ip65504P733ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P733-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P733ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P733ReservdS = checkIp65504P733ReservdSMaxLimit(number); 
		serializeIp65504P733ReservdS(ip65504P733ReservdS);
	}

	public void setIp65504P733ReservdS(int number) {
	    number = checkIp65504P733ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P733ReservdS((short)number);
	}
	public void setIp65504P733ReservdS(long number) {
	    number = checkIp65504P733ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P733ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P733ReservdL
	 *	@return ip65504P733ReservdL
	 */
	public short getIp65504P733ReservdL() throws CFException {
        if (isIp65504P733ReservdLModified()) { 
           ip65504P733ReservdL = refreshIp65504P733ReservdL();
        }
   		return ip65504P733ReservdL;
	}
	
	/**
	 * 	Update Ip65504P733ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P733-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P733ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P733ReservdL = checkIp65504P733ReservdLMaxLimit(number); 
		serializeIp65504P733ReservdL(ip65504P733ReservdL);
	}

	public void setIp65504P733ReservdL(int number) {
	    number = checkIp65504P733ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P733ReservdL((short)number);
	}
	public void setIp65504P733ReservdL(long number) {
	    number = checkIp65504P733ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P733ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P734ReservdS
	 *	@return ip65504P734ReservdS
	 */
	public short getIp65504P734ReservdS() throws CFException {
        if (isIp65504P734ReservdSModified()) { 
           ip65504P734ReservdS = refreshIp65504P734ReservdS();
        }
   		return ip65504P734ReservdS;
	}
	
	/**
	 * 	Update Ip65504P734ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P734-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P734ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P734ReservdS = checkIp65504P734ReservdSMaxLimit(number); 
		serializeIp65504P734ReservdS(ip65504P734ReservdS);
	}

	public void setIp65504P734ReservdS(int number) {
	    number = checkIp65504P734ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P734ReservdS((short)number);
	}
	public void setIp65504P734ReservdS(long number) {
	    number = checkIp65504P734ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P734ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P734ReservdL
	 *	@return ip65504P734ReservdL
	 */
	public short getIp65504P734ReservdL() throws CFException {
        if (isIp65504P734ReservdLModified()) { 
           ip65504P734ReservdL = refreshIp65504P734ReservdL();
        }
   		return ip65504P734ReservdL;
	}
	
	/**
	 * 	Update Ip65504P734ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P734-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P734ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P734ReservdL = checkIp65504P734ReservdLMaxLimit(number); 
		serializeIp65504P734ReservdL(ip65504P734ReservdL);
	}

	public void setIp65504P734ReservdL(int number) {
	    number = checkIp65504P734ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P734ReservdL((short)number);
	}
	public void setIp65504P734ReservdL(long number) {
	    number = checkIp65504P734ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P734ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P735ReservdS
	 *	@return ip65504P735ReservdS
	 */
	public short getIp65504P735ReservdS() throws CFException {
        if (isIp65504P735ReservdSModified()) { 
           ip65504P735ReservdS = refreshIp65504P735ReservdS();
        }
   		return ip65504P735ReservdS;
	}
	
	/**
	 * 	Update Ip65504P735ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P735-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P735ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P735ReservdS = checkIp65504P735ReservdSMaxLimit(number); 
		serializeIp65504P735ReservdS(ip65504P735ReservdS);
	}

	public void setIp65504P735ReservdS(int number) {
	    number = checkIp65504P735ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P735ReservdS((short)number);
	}
	public void setIp65504P735ReservdS(long number) {
	    number = checkIp65504P735ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P735ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P735ReservdL
	 *	@return ip65504P735ReservdL
	 */
	public short getIp65504P735ReservdL() throws CFException {
        if (isIp65504P735ReservdLModified()) { 
           ip65504P735ReservdL = refreshIp65504P735ReservdL();
        }
   		return ip65504P735ReservdL;
	}
	
	/**
	 * 	Update Ip65504P735ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P735-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P735ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P735ReservdL = checkIp65504P735ReservdLMaxLimit(number); 
		serializeIp65504P735ReservdL(ip65504P735ReservdL);
	}

	public void setIp65504P735ReservdL(int number) {
	    number = checkIp65504P735ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P735ReservdL((short)number);
	}
	public void setIp65504P735ReservdL(long number) {
	    number = checkIp65504P735ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P735ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P736ReservdS
	 *	@return ip65504P736ReservdS
	 */
	public short getIp65504P736ReservdS() throws CFException {
        if (isIp65504P736ReservdSModified()) { 
           ip65504P736ReservdS = refreshIp65504P736ReservdS();
        }
   		return ip65504P736ReservdS;
	}
	
	/**
	 * 	Update Ip65504P736ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P736-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P736ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P736ReservdS = checkIp65504P736ReservdSMaxLimit(number); 
		serializeIp65504P736ReservdS(ip65504P736ReservdS);
	}

	public void setIp65504P736ReservdS(int number) {
	    number = checkIp65504P736ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P736ReservdS((short)number);
	}
	public void setIp65504P736ReservdS(long number) {
	    number = checkIp65504P736ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P736ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P736ReservdL
	 *	@return ip65504P736ReservdL
	 */
	public short getIp65504P736ReservdL() throws CFException {
        if (isIp65504P736ReservdLModified()) { 
           ip65504P736ReservdL = refreshIp65504P736ReservdL();
        }
   		return ip65504P736ReservdL;
	}
	
	/**
	 * 	Update Ip65504P736ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P736-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P736ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P736ReservdL = checkIp65504P736ReservdLMaxLimit(number); 
		serializeIp65504P736ReservdL(ip65504P736ReservdL);
	}

	public void setIp65504P736ReservdL(int number) {
	    number = checkIp65504P736ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P736ReservdL((short)number);
	}
	public void setIp65504P736ReservdL(long number) {
	    number = checkIp65504P736ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P736ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P737ReservdS
	 *	@return ip65504P737ReservdS
	 */
	public short getIp65504P737ReservdS() throws CFException {
        if (isIp65504P737ReservdSModified()) { 
           ip65504P737ReservdS = refreshIp65504P737ReservdS();
        }
   		return ip65504P737ReservdS;
	}
	
	/**
	 * 	Update Ip65504P737ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P737-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P737ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P737ReservdS = checkIp65504P737ReservdSMaxLimit(number); 
		serializeIp65504P737ReservdS(ip65504P737ReservdS);
	}

	public void setIp65504P737ReservdS(int number) {
	    number = checkIp65504P737ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P737ReservdS((short)number);
	}
	public void setIp65504P737ReservdS(long number) {
	    number = checkIp65504P737ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P737ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P737ReservdL
	 *	@return ip65504P737ReservdL
	 */
	public short getIp65504P737ReservdL() throws CFException {
        if (isIp65504P737ReservdLModified()) { 
           ip65504P737ReservdL = refreshIp65504P737ReservdL();
        }
   		return ip65504P737ReservdL;
	}
	
	/**
	 * 	Update Ip65504P737ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P737-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P737ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P737ReservdL = checkIp65504P737ReservdLMaxLimit(number); 
		serializeIp65504P737ReservdL(ip65504P737ReservdL);
	}

	public void setIp65504P737ReservdL(int number) {
	    number = checkIp65504P737ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P737ReservdL((short)number);
	}
	public void setIp65504P737ReservdL(long number) {
	    number = checkIp65504P737ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P737ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P738ReservdS
	 *	@return ip65504P738ReservdS
	 */
	public short getIp65504P738ReservdS() throws CFException {
        if (isIp65504P738ReservdSModified()) { 
           ip65504P738ReservdS = refreshIp65504P738ReservdS();
        }
   		return ip65504P738ReservdS;
	}
	
	/**
	 * 	Update Ip65504P738ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P738-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P738ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P738ReservdS = checkIp65504P738ReservdSMaxLimit(number); 
		serializeIp65504P738ReservdS(ip65504P738ReservdS);
	}

	public void setIp65504P738ReservdS(int number) {
	    number = checkIp65504P738ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P738ReservdS((short)number);
	}
	public void setIp65504P738ReservdS(long number) {
	    number = checkIp65504P738ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P738ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P738ReservdL
	 *	@return ip65504P738ReservdL
	 */
	public short getIp65504P738ReservdL() throws CFException {
        if (isIp65504P738ReservdLModified()) { 
           ip65504P738ReservdL = refreshIp65504P738ReservdL();
        }
   		return ip65504P738ReservdL;
	}
	
	/**
	 * 	Update Ip65504P738ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P738-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P738ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P738ReservdL = checkIp65504P738ReservdLMaxLimit(number); 
		serializeIp65504P738ReservdL(ip65504P738ReservdL);
	}

	public void setIp65504P738ReservdL(int number) {
	    number = checkIp65504P738ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P738ReservdL((short)number);
	}
	public void setIp65504P738ReservdL(long number) {
	    number = checkIp65504P738ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P738ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P739ReservdS
	 *	@return ip65504P739ReservdS
	 */
	public short getIp65504P739ReservdS() throws CFException {
        if (isIp65504P739ReservdSModified()) { 
           ip65504P739ReservdS = refreshIp65504P739ReservdS();
        }
   		return ip65504P739ReservdS;
	}
	
	/**
	 * 	Update Ip65504P739ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P739-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P739ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P739ReservdS = checkIp65504P739ReservdSMaxLimit(number); 
		serializeIp65504P739ReservdS(ip65504P739ReservdS);
	}

	public void setIp65504P739ReservdS(int number) {
	    number = checkIp65504P739ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P739ReservdS((short)number);
	}
	public void setIp65504P739ReservdS(long number) {
	    number = checkIp65504P739ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P739ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P739ReservdL
	 *	@return ip65504P739ReservdL
	 */
	public short getIp65504P739ReservdL() throws CFException {
        if (isIp65504P739ReservdLModified()) { 
           ip65504P739ReservdL = refreshIp65504P739ReservdL();
        }
   		return ip65504P739ReservdL;
	}
	
	/**
	 * 	Update Ip65504P739ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P739-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P739ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P739ReservdL = checkIp65504P739ReservdLMaxLimit(number); 
		serializeIp65504P739ReservdL(ip65504P739ReservdL);
	}

	public void setIp65504P739ReservdL(int number) {
	    number = checkIp65504P739ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P739ReservdL((short)number);
	}
	public void setIp65504P739ReservdL(long number) {
	    number = checkIp65504P739ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P739ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P740ReservdS
	 *	@return ip65504P740ReservdS
	 */
	public short getIp65504P740ReservdS() throws CFException {
        if (isIp65504P740ReservdSModified()) { 
           ip65504P740ReservdS = refreshIp65504P740ReservdS();
        }
   		return ip65504P740ReservdS;
	}
	
	/**
	 * 	Update Ip65504P740ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P740-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P740ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P740ReservdS = checkIp65504P740ReservdSMaxLimit(number); 
		serializeIp65504P740ReservdS(ip65504P740ReservdS);
	}

	public void setIp65504P740ReservdS(int number) {
	    number = checkIp65504P740ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P740ReservdS((short)number);
	}
	public void setIp65504P740ReservdS(long number) {
	    number = checkIp65504P740ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P740ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P740ReservdL
	 *	@return ip65504P740ReservdL
	 */
	public short getIp65504P740ReservdL() throws CFException {
        if (isIp65504P740ReservdLModified()) { 
           ip65504P740ReservdL = refreshIp65504P740ReservdL();
        }
   		return ip65504P740ReservdL;
	}
	
	/**
	 * 	Update Ip65504P740ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P740-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P740ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P740ReservdL = checkIp65504P740ReservdLMaxLimit(number); 
		serializeIp65504P740ReservdL(ip65504P740ReservdL);
	}

	public void setIp65504P740ReservdL(int number) {
	    number = checkIp65504P740ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P740ReservdL((short)number);
	}
	public void setIp65504P740ReservdL(long number) {
	    number = checkIp65504P740ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P740ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P741ReservdS
	 *	@return ip65504P741ReservdS
	 */
	public short getIp65504P741ReservdS() throws CFException {
        if (isIp65504P741ReservdSModified()) { 
           ip65504P741ReservdS = refreshIp65504P741ReservdS();
        }
   		return ip65504P741ReservdS;
	}
	
	/**
	 * 	Update Ip65504P741ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P741-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P741ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P741ReservdS = checkIp65504P741ReservdSMaxLimit(number); 
		serializeIp65504P741ReservdS(ip65504P741ReservdS);
	}

	public void setIp65504P741ReservdS(int number) {
	    number = checkIp65504P741ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P741ReservdS((short)number);
	}
	public void setIp65504P741ReservdS(long number) {
	    number = checkIp65504P741ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P741ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P741ReservdL
	 *	@return ip65504P741ReservdL
	 */
	public short getIp65504P741ReservdL() throws CFException {
        if (isIp65504P741ReservdLModified()) { 
           ip65504P741ReservdL = refreshIp65504P741ReservdL();
        }
   		return ip65504P741ReservdL;
	}
	
	/**
	 * 	Update Ip65504P741ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P741-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P741ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P741ReservdL = checkIp65504P741ReservdLMaxLimit(number); 
		serializeIp65504P741ReservdL(ip65504P741ReservdL);
	}

	public void setIp65504P741ReservdL(int number) {
	    number = checkIp65504P741ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P741ReservdL((short)number);
	}
	public void setIp65504P741ReservdL(long number) {
	    number = checkIp65504P741ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P741ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P742ReservdS
	 *	@return ip65504P742ReservdS
	 */
	public short getIp65504P742ReservdS() throws CFException {
        if (isIp65504P742ReservdSModified()) { 
           ip65504P742ReservdS = refreshIp65504P742ReservdS();
        }
   		return ip65504P742ReservdS;
	}
	
	/**
	 * 	Update Ip65504P742ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P742-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P742ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P742ReservdS = checkIp65504P742ReservdSMaxLimit(number); 
		serializeIp65504P742ReservdS(ip65504P742ReservdS);
	}

	public void setIp65504P742ReservdS(int number) {
	    number = checkIp65504P742ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P742ReservdS((short)number);
	}
	public void setIp65504P742ReservdS(long number) {
	    number = checkIp65504P742ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P742ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P742ReservdL
	 *	@return ip65504P742ReservdL
	 */
	public short getIp65504P742ReservdL() throws CFException {
        if (isIp65504P742ReservdLModified()) { 
           ip65504P742ReservdL = refreshIp65504P742ReservdL();
        }
   		return ip65504P742ReservdL;
	}
	
	/**
	 * 	Update Ip65504P742ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P742-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P742ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P742ReservdL = checkIp65504P742ReservdLMaxLimit(number); 
		serializeIp65504P742ReservdL(ip65504P742ReservdL);
	}

	public void setIp65504P742ReservdL(int number) {
	    number = checkIp65504P742ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P742ReservdL((short)number);
	}
	public void setIp65504P742ReservdL(long number) {
	    number = checkIp65504P742ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P742ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P743ReservdS
	 *	@return ip65504P743ReservdS
	 */
	public short getIp65504P743ReservdS() throws CFException {
        if (isIp65504P743ReservdSModified()) { 
           ip65504P743ReservdS = refreshIp65504P743ReservdS();
        }
   		return ip65504P743ReservdS;
	}
	
	/**
	 * 	Update Ip65504P743ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P743-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P743ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P743ReservdS = checkIp65504P743ReservdSMaxLimit(number); 
		serializeIp65504P743ReservdS(ip65504P743ReservdS);
	}

	public void setIp65504P743ReservdS(int number) {
	    number = checkIp65504P743ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P743ReservdS((short)number);
	}
	public void setIp65504P743ReservdS(long number) {
	    number = checkIp65504P743ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P743ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P743ReservdL
	 *	@return ip65504P743ReservdL
	 */
	public short getIp65504P743ReservdL() throws CFException {
        if (isIp65504P743ReservdLModified()) { 
           ip65504P743ReservdL = refreshIp65504P743ReservdL();
        }
   		return ip65504P743ReservdL;
	}
	
	/**
	 * 	Update Ip65504P743ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P743-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P743ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P743ReservdL = checkIp65504P743ReservdLMaxLimit(number); 
		serializeIp65504P743ReservdL(ip65504P743ReservdL);
	}

	public void setIp65504P743ReservdL(int number) {
	    number = checkIp65504P743ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P743ReservdL((short)number);
	}
	public void setIp65504P743ReservdL(long number) {
	    number = checkIp65504P743ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P743ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P744ReservdS
	 *	@return ip65504P744ReservdS
	 */
	public short getIp65504P744ReservdS() throws CFException {
        if (isIp65504P744ReservdSModified()) { 
           ip65504P744ReservdS = refreshIp65504P744ReservdS();
        }
   		return ip65504P744ReservdS;
	}
	
	/**
	 * 	Update Ip65504P744ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P744-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P744ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P744ReservdS = checkIp65504P744ReservdSMaxLimit(number); 
		serializeIp65504P744ReservdS(ip65504P744ReservdS);
	}

	public void setIp65504P744ReservdS(int number) {
	    number = checkIp65504P744ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P744ReservdS((short)number);
	}
	public void setIp65504P744ReservdS(long number) {
	    number = checkIp65504P744ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P744ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P744ReservdL
	 *	@return ip65504P744ReservdL
	 */
	public short getIp65504P744ReservdL() throws CFException {
        if (isIp65504P744ReservdLModified()) { 
           ip65504P744ReservdL = refreshIp65504P744ReservdL();
        }
   		return ip65504P744ReservdL;
	}
	
	/**
	 * 	Update Ip65504P744ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P744-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P744ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P744ReservdL = checkIp65504P744ReservdLMaxLimit(number); 
		serializeIp65504P744ReservdL(ip65504P744ReservdL);
	}

	public void setIp65504P744ReservdL(int number) {
	    number = checkIp65504P744ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P744ReservdL((short)number);
	}
	public void setIp65504P744ReservdL(long number) {
	    number = checkIp65504P744ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P744ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup24
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P714ExchngTktamtS((short)0);
         	setIp65504P714ExchngTktamtL((short)0);
         	setIp65504P715ExchngFeeamtS((short)0);
         	setIp65504P715ExchngFeeamtL((short)0);
         	setIp65504P716TravlAuthCdS((short)0);
         	setIp65504P716TravlAuthCdL((short)0);
         	setIp65504P717IataClientS((short)0);
         	setIp65504P717IataClientL((short)0);
         	setIp65504P718CardAccPhnoS((short)0);
         	setIp65504P718CardAccPhnoL((short)0);
         	setIp65504P719ReservdS((short)0);
         	setIp65504P719ReservdL((short)0);
         	setIp65504P720ReservdS((short)0);
         	setIp65504P720ReservdL((short)0);
         	setIp65504P721ReservdS((short)0);
         	setIp65504P721ReservdL((short)0);
         	setIp65504P722ReservdS((short)0);
         	setIp65504P722ReservdL((short)0);
         	setIp65504P723ReservdS((short)0);
         	setIp65504P723ReservdL((short)0);
         	setIp65504P724ReservdS((short)0);
         	setIp65504P724ReservdL((short)0);
         	setIp65504P725ReservdS((short)0);
         	setIp65504P725ReservdL((short)0);
         	setIp65504P726ReservdS((short)0);
         	setIp65504P726ReservdL((short)0);
         	setIp65504P727ReservdS((short)0);
         	setIp65504P727ReservdL((short)0);
         	setIp65504P728ReservdS((short)0);
         	setIp65504P728ReservdL((short)0);
         	setIp65504P729ReservdS((short)0);
         	setIp65504P729ReservdL((short)0);
         	setIp65504P730ReservdS((short)0);
         	setIp65504P730ReservdL((short)0);
         	setIp65504P731ReservdS((short)0);
         	setIp65504P731ReservdL((short)0);
         	setIp65504P732ReservdS((short)0);
         	setIp65504P732ReservdL((short)0);
         	setIp65504P733ReservdS((short)0);
         	setIp65504P733ReservdL((short)0);
         	setIp65504P734ReservdS((short)0);
         	setIp65504P734ReservdL((short)0);
         	setIp65504P735ReservdS((short)0);
         	setIp65504P735ReservdL((short)0);
         	setIp65504P736ReservdS((short)0);
         	setIp65504P736ReservdL((short)0);
         	setIp65504P737ReservdS((short)0);
         	setIp65504P737ReservdL((short)0);
         	setIp65504P738ReservdS((short)0);
         	setIp65504P738ReservdL((short)0);
         	setIp65504P739ReservdS((short)0);
         	setIp65504P739ReservdL((short)0);
         	setIp65504P740ReservdS((short)0);
         	setIp65504P740ReservdL((short)0);
         	setIp65504P741ReservdS((short)0);
         	setIp65504P741ReservdL((short)0);
         	setIp65504P742ReservdS((short)0);
         	setIp65504P742ReservdL((short)0);
         	setIp65504P743ReservdS((short)0);
         	setIp65504P743ReservdL((short)0);
         	setIp65504P744ReservdS((short)0);
         	setIp65504P744ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup24FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_24_LENGTH;
		}

}
  
