package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup2 extends Ip65504PdsNamesLargeGroup2Serialized { 
   

								private short ip65504P032ReservdS;

								private short ip65504P032ReservdL;


								private short ip65504P033ReservdS;

								private short ip65504P033ReservdL;


								private short ip65504P034ReservdS;

								private short ip65504P034ReservdL;


								private short ip65504P035AcqPsrS;

								private short ip65504P035AcqPsrL;


								private short ip65504P036IssCodS;

								private short ip65504P036IssCodL;


								private short ip65504P037CrdIssS;

								private short ip65504P037CrdIssL;


								private short ip65504P038ReservdS;

								private short ip65504P038ReservdL;


								private short ip65504P039ReservdS;

								private short ip65504P039ReservdL;


								private short ip65504P040ReservdS;

								private short ip65504P040ReservdL;


								private short ip65504P041ReservdS;

								private short ip65504P041ReservdL;


								private short ip65504P042PgmCodS;

								private short ip65504P042PgmCodL;


								private short ip65504P043PgmRegS;

								private short ip65504P043PgmRegL;


								private short ip65504P044ReservdS;

								private short ip65504P044ReservdL;


								private short ip65504P045ValAddS;

								private short ip65504P045ValAddL;


								private short ip65504P046ReservdS;

								private short ip65504P046ReservdL;


								private short ip65504P047CusNmeS;

								private short ip65504P047CusNmeL;


								private short ip65504P048ChbiadrS;

								private short ip65504P048ChbiadrL;


								private short ip65504P049ChspadrS;

								private short ip65504P049ChspadrL;


								private short ip65504P050CusId1S;

								private short ip65504P050CusId1L;


								private short ip65504P051CusId2S;

								private short ip65504P051CusId2L;


								private short ip65504P052CusActS;

								private short ip65504P052CusActL;


								private short ip65504P053CusDobS;

								private short ip65504P053CusDobL;


								private short ip65504P054ChdrVfS;

								private short ip65504P054ChdrVfL;


								private short ip65504P055MercIdS;

								private short ip65504P055MercIdL;


								private short ip65504P056ReservdS;

								private short ip65504P056ReservdL;


								private short ip65504P057ReservdS;

								private short ip65504P057ReservdL;


								private short ip65504P058ReservdS;

								private short ip65504P058ReservdL;


								private short ip65504P059ReservdS;

								private short ip65504P059ReservdL;


								private short ip65504P060ReservdS;

								private short ip65504P060ReservdL;


								private short ip65504P061RefTelS;

								private short ip65504P061RefTelL;


								private short ip65504P062ReservdS;

								private short ip65504P062ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup2
	**/
    public Ip65504PdsNamesLargeGroup2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P032ReservdS
	 *	@return ip65504P032ReservdS
	 */
	public short getIp65504P032ReservdS() throws CFException {
        if (isIp65504P032ReservdSModified()) { 
           ip65504P032ReservdS = refreshIp65504P032ReservdS();
        }
   		return ip65504P032ReservdS;
	}
	
	/**
	 * 	Update Ip65504P032ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P032-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P032ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P032ReservdS = checkIp65504P032ReservdSMaxLimit(number); 
		serializeIp65504P032ReservdS(ip65504P032ReservdS);
	}

	public void setIp65504P032ReservdS(int number) {
	    number = checkIp65504P032ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P032ReservdS((short)number);
	}
	public void setIp65504P032ReservdS(long number) {
	    number = checkIp65504P032ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P032ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P032ReservdL
	 *	@return ip65504P032ReservdL
	 */
	public short getIp65504P032ReservdL() throws CFException {
        if (isIp65504P032ReservdLModified()) { 
           ip65504P032ReservdL = refreshIp65504P032ReservdL();
        }
   		return ip65504P032ReservdL;
	}
	
	/**
	 * 	Update Ip65504P032ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P032-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P032ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P032ReservdL = checkIp65504P032ReservdLMaxLimit(number); 
		serializeIp65504P032ReservdL(ip65504P032ReservdL);
	}

	public void setIp65504P032ReservdL(int number) {
	    number = checkIp65504P032ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P032ReservdL((short)number);
	}
	public void setIp65504P032ReservdL(long number) {
	    number = checkIp65504P032ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P032ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P033ReservdS
	 *	@return ip65504P033ReservdS
	 */
	public short getIp65504P033ReservdS() throws CFException {
        if (isIp65504P033ReservdSModified()) { 
           ip65504P033ReservdS = refreshIp65504P033ReservdS();
        }
   		return ip65504P033ReservdS;
	}
	
	/**
	 * 	Update Ip65504P033ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P033-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P033ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P033ReservdS = checkIp65504P033ReservdSMaxLimit(number); 
		serializeIp65504P033ReservdS(ip65504P033ReservdS);
	}

	public void setIp65504P033ReservdS(int number) {
	    number = checkIp65504P033ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P033ReservdS((short)number);
	}
	public void setIp65504P033ReservdS(long number) {
	    number = checkIp65504P033ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P033ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P033ReservdL
	 *	@return ip65504P033ReservdL
	 */
	public short getIp65504P033ReservdL() throws CFException {
        if (isIp65504P033ReservdLModified()) { 
           ip65504P033ReservdL = refreshIp65504P033ReservdL();
        }
   		return ip65504P033ReservdL;
	}
	
	/**
	 * 	Update Ip65504P033ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P033-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P033ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P033ReservdL = checkIp65504P033ReservdLMaxLimit(number); 
		serializeIp65504P033ReservdL(ip65504P033ReservdL);
	}

	public void setIp65504P033ReservdL(int number) {
	    number = checkIp65504P033ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P033ReservdL((short)number);
	}
	public void setIp65504P033ReservdL(long number) {
	    number = checkIp65504P033ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P033ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P034ReservdS
	 *	@return ip65504P034ReservdS
	 */
	public short getIp65504P034ReservdS() throws CFException {
        if (isIp65504P034ReservdSModified()) { 
           ip65504P034ReservdS = refreshIp65504P034ReservdS();
        }
   		return ip65504P034ReservdS;
	}
	
	/**
	 * 	Update Ip65504P034ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P034-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P034ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P034ReservdS = checkIp65504P034ReservdSMaxLimit(number); 
		serializeIp65504P034ReservdS(ip65504P034ReservdS);
	}

	public void setIp65504P034ReservdS(int number) {
	    number = checkIp65504P034ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P034ReservdS((short)number);
	}
	public void setIp65504P034ReservdS(long number) {
	    number = checkIp65504P034ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P034ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P034ReservdL
	 *	@return ip65504P034ReservdL
	 */
	public short getIp65504P034ReservdL() throws CFException {
        if (isIp65504P034ReservdLModified()) { 
           ip65504P034ReservdL = refreshIp65504P034ReservdL();
        }
   		return ip65504P034ReservdL;
	}
	
	/**
	 * 	Update Ip65504P034ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P034-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P034ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P034ReservdL = checkIp65504P034ReservdLMaxLimit(number); 
		serializeIp65504P034ReservdL(ip65504P034ReservdL);
	}

	public void setIp65504P034ReservdL(int number) {
	    number = checkIp65504P034ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P034ReservdL((short)number);
	}
	public void setIp65504P034ReservdL(long number) {
	    number = checkIp65504P034ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P034ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P035AcqPsrS
	 *	@return ip65504P035AcqPsrS
	 */
	public short getIp65504P035AcqPsrS() throws CFException {
        if (isIp65504P035AcqPsrSModified()) { 
           ip65504P035AcqPsrS = refreshIp65504P035AcqPsrS();
        }
   		return ip65504P035AcqPsrS;
	}
	
	/**
	 * 	Update Ip65504P035AcqPsrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P035-ACQ-PSR-S
	 *	@param number
	 */
	public void setIp65504P035AcqPsrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P035AcqPsrS = checkIp65504P035AcqPsrSMaxLimit(number); 
		serializeIp65504P035AcqPsrS(ip65504P035AcqPsrS);
	}

	public void setIp65504P035AcqPsrS(int number) {
	    number = checkIp65504P035AcqPsrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P035AcqPsrS((short)number);
	}
	public void setIp65504P035AcqPsrS(long number) {
	    number = checkIp65504P035AcqPsrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P035AcqPsrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P035AcqPsrL
	 *	@return ip65504P035AcqPsrL
	 */
	public short getIp65504P035AcqPsrL() throws CFException {
        if (isIp65504P035AcqPsrLModified()) { 
           ip65504P035AcqPsrL = refreshIp65504P035AcqPsrL();
        }
   		return ip65504P035AcqPsrL;
	}
	
	/**
	 * 	Update Ip65504P035AcqPsrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P035-ACQ-PSR-L
	 *	@param number
	 */
	public void setIp65504P035AcqPsrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P035AcqPsrL = checkIp65504P035AcqPsrLMaxLimit(number); 
		serializeIp65504P035AcqPsrL(ip65504P035AcqPsrL);
	}

	public void setIp65504P035AcqPsrL(int number) {
	    number = checkIp65504P035AcqPsrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P035AcqPsrL((short)number);
	}
	public void setIp65504P035AcqPsrL(long number) {
	    number = checkIp65504P035AcqPsrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P035AcqPsrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P036IssCodS
	 *	@return ip65504P036IssCodS
	 */
	public short getIp65504P036IssCodS() throws CFException {
        if (isIp65504P036IssCodSModified()) { 
           ip65504P036IssCodS = refreshIp65504P036IssCodS();
        }
   		return ip65504P036IssCodS;
	}
	
	/**
	 * 	Update Ip65504P036IssCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P036-ISS-COD-S
	 *	@param number
	 */
	public void setIp65504P036IssCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P036IssCodS = checkIp65504P036IssCodSMaxLimit(number); 
		serializeIp65504P036IssCodS(ip65504P036IssCodS);
	}

	public void setIp65504P036IssCodS(int number) {
	    number = checkIp65504P036IssCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P036IssCodS((short)number);
	}
	public void setIp65504P036IssCodS(long number) {
	    number = checkIp65504P036IssCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P036IssCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P036IssCodL
	 *	@return ip65504P036IssCodL
	 */
	public short getIp65504P036IssCodL() throws CFException {
        if (isIp65504P036IssCodLModified()) { 
           ip65504P036IssCodL = refreshIp65504P036IssCodL();
        }
   		return ip65504P036IssCodL;
	}
	
	/**
	 * 	Update Ip65504P036IssCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P036-ISS-COD-L
	 *	@param number
	 */
	public void setIp65504P036IssCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P036IssCodL = checkIp65504P036IssCodLMaxLimit(number); 
		serializeIp65504P036IssCodL(ip65504P036IssCodL);
	}

	public void setIp65504P036IssCodL(int number) {
	    number = checkIp65504P036IssCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P036IssCodL((short)number);
	}
	public void setIp65504P036IssCodL(long number) {
	    number = checkIp65504P036IssCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P036IssCodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P037CrdIssS
	 *	@return ip65504P037CrdIssS
	 */
	public short getIp65504P037CrdIssS() throws CFException {
        if (isIp65504P037CrdIssSModified()) { 
           ip65504P037CrdIssS = refreshIp65504P037CrdIssS();
        }
   		return ip65504P037CrdIssS;
	}
	
	/**
	 * 	Update Ip65504P037CrdIssS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P037-CRD-ISS-S
	 *	@param number
	 */
	public void setIp65504P037CrdIssS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P037CrdIssS = checkIp65504P037CrdIssSMaxLimit(number); 
		serializeIp65504P037CrdIssS(ip65504P037CrdIssS);
	}

	public void setIp65504P037CrdIssS(int number) {
	    number = checkIp65504P037CrdIssSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P037CrdIssS((short)number);
	}
	public void setIp65504P037CrdIssS(long number) {
	    number = checkIp65504P037CrdIssSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P037CrdIssS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P037CrdIssL
	 *	@return ip65504P037CrdIssL
	 */
	public short getIp65504P037CrdIssL() throws CFException {
        if (isIp65504P037CrdIssLModified()) { 
           ip65504P037CrdIssL = refreshIp65504P037CrdIssL();
        }
   		return ip65504P037CrdIssL;
	}
	
	/**
	 * 	Update Ip65504P037CrdIssL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P037-CRD-ISS-L
	 *	@param number
	 */
	public void setIp65504P037CrdIssL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P037CrdIssL = checkIp65504P037CrdIssLMaxLimit(number); 
		serializeIp65504P037CrdIssL(ip65504P037CrdIssL);
	}

	public void setIp65504P037CrdIssL(int number) {
	    number = checkIp65504P037CrdIssLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P037CrdIssL((short)number);
	}
	public void setIp65504P037CrdIssL(long number) {
	    number = checkIp65504P037CrdIssLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P037CrdIssL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P038ReservdS
	 *	@return ip65504P038ReservdS
	 */
	public short getIp65504P038ReservdS() throws CFException {
        if (isIp65504P038ReservdSModified()) { 
           ip65504P038ReservdS = refreshIp65504P038ReservdS();
        }
   		return ip65504P038ReservdS;
	}
	
	/**
	 * 	Update Ip65504P038ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P038-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P038ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P038ReservdS = checkIp65504P038ReservdSMaxLimit(number); 
		serializeIp65504P038ReservdS(ip65504P038ReservdS);
	}

	public void setIp65504P038ReservdS(int number) {
	    number = checkIp65504P038ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P038ReservdS((short)number);
	}
	public void setIp65504P038ReservdS(long number) {
	    number = checkIp65504P038ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P038ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P038ReservdL
	 *	@return ip65504P038ReservdL
	 */
	public short getIp65504P038ReservdL() throws CFException {
        if (isIp65504P038ReservdLModified()) { 
           ip65504P038ReservdL = refreshIp65504P038ReservdL();
        }
   		return ip65504P038ReservdL;
	}
	
	/**
	 * 	Update Ip65504P038ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P038-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P038ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P038ReservdL = checkIp65504P038ReservdLMaxLimit(number); 
		serializeIp65504P038ReservdL(ip65504P038ReservdL);
	}

	public void setIp65504P038ReservdL(int number) {
	    number = checkIp65504P038ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P038ReservdL((short)number);
	}
	public void setIp65504P038ReservdL(long number) {
	    number = checkIp65504P038ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P038ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P039ReservdS
	 *	@return ip65504P039ReservdS
	 */
	public short getIp65504P039ReservdS() throws CFException {
        if (isIp65504P039ReservdSModified()) { 
           ip65504P039ReservdS = refreshIp65504P039ReservdS();
        }
   		return ip65504P039ReservdS;
	}
	
	/**
	 * 	Update Ip65504P039ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P039-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P039ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P039ReservdS = checkIp65504P039ReservdSMaxLimit(number); 
		serializeIp65504P039ReservdS(ip65504P039ReservdS);
	}

	public void setIp65504P039ReservdS(int number) {
	    number = checkIp65504P039ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P039ReservdS((short)number);
	}
	public void setIp65504P039ReservdS(long number) {
	    number = checkIp65504P039ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P039ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P039ReservdL
	 *	@return ip65504P039ReservdL
	 */
	public short getIp65504P039ReservdL() throws CFException {
        if (isIp65504P039ReservdLModified()) { 
           ip65504P039ReservdL = refreshIp65504P039ReservdL();
        }
   		return ip65504P039ReservdL;
	}
	
	/**
	 * 	Update Ip65504P039ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P039-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P039ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P039ReservdL = checkIp65504P039ReservdLMaxLimit(number); 
		serializeIp65504P039ReservdL(ip65504P039ReservdL);
	}

	public void setIp65504P039ReservdL(int number) {
	    number = checkIp65504P039ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P039ReservdL((short)number);
	}
	public void setIp65504P039ReservdL(long number) {
	    number = checkIp65504P039ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P039ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P040ReservdS
	 *	@return ip65504P040ReservdS
	 */
	public short getIp65504P040ReservdS() throws CFException {
        if (isIp65504P040ReservdSModified()) { 
           ip65504P040ReservdS = refreshIp65504P040ReservdS();
        }
   		return ip65504P040ReservdS;
	}
	
	/**
	 * 	Update Ip65504P040ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P040-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P040ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P040ReservdS = checkIp65504P040ReservdSMaxLimit(number); 
		serializeIp65504P040ReservdS(ip65504P040ReservdS);
	}

	public void setIp65504P040ReservdS(int number) {
	    number = checkIp65504P040ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P040ReservdS((short)number);
	}
	public void setIp65504P040ReservdS(long number) {
	    number = checkIp65504P040ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P040ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P040ReservdL
	 *	@return ip65504P040ReservdL
	 */
	public short getIp65504P040ReservdL() throws CFException {
        if (isIp65504P040ReservdLModified()) { 
           ip65504P040ReservdL = refreshIp65504P040ReservdL();
        }
   		return ip65504P040ReservdL;
	}
	
	/**
	 * 	Update Ip65504P040ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P040-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P040ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P040ReservdL = checkIp65504P040ReservdLMaxLimit(number); 
		serializeIp65504P040ReservdL(ip65504P040ReservdL);
	}

	public void setIp65504P040ReservdL(int number) {
	    number = checkIp65504P040ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P040ReservdL((short)number);
	}
	public void setIp65504P040ReservdL(long number) {
	    number = checkIp65504P040ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P040ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P041ReservdS
	 *	@return ip65504P041ReservdS
	 */
	public short getIp65504P041ReservdS() throws CFException {
        if (isIp65504P041ReservdSModified()) { 
           ip65504P041ReservdS = refreshIp65504P041ReservdS();
        }
   		return ip65504P041ReservdS;
	}
	
	/**
	 * 	Update Ip65504P041ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P041-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P041ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P041ReservdS = checkIp65504P041ReservdSMaxLimit(number); 
		serializeIp65504P041ReservdS(ip65504P041ReservdS);
	}

	public void setIp65504P041ReservdS(int number) {
	    number = checkIp65504P041ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P041ReservdS((short)number);
	}
	public void setIp65504P041ReservdS(long number) {
	    number = checkIp65504P041ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P041ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P041ReservdL
	 *	@return ip65504P041ReservdL
	 */
	public short getIp65504P041ReservdL() throws CFException {
        if (isIp65504P041ReservdLModified()) { 
           ip65504P041ReservdL = refreshIp65504P041ReservdL();
        }
   		return ip65504P041ReservdL;
	}
	
	/**
	 * 	Update Ip65504P041ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P041-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P041ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P041ReservdL = checkIp65504P041ReservdLMaxLimit(number); 
		serializeIp65504P041ReservdL(ip65504P041ReservdL);
	}

	public void setIp65504P041ReservdL(int number) {
	    number = checkIp65504P041ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P041ReservdL((short)number);
	}
	public void setIp65504P041ReservdL(long number) {
	    number = checkIp65504P041ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P041ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P042PgmCodS
	 *	@return ip65504P042PgmCodS
	 */
	public short getIp65504P042PgmCodS() throws CFException {
        if (isIp65504P042PgmCodSModified()) { 
           ip65504P042PgmCodS = refreshIp65504P042PgmCodS();
        }
   		return ip65504P042PgmCodS;
	}
	
	/**
	 * 	Update Ip65504P042PgmCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P042-PGM-COD-S
	 *	@param number
	 */
	public void setIp65504P042PgmCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P042PgmCodS = checkIp65504P042PgmCodSMaxLimit(number); 
		serializeIp65504P042PgmCodS(ip65504P042PgmCodS);
	}

	public void setIp65504P042PgmCodS(int number) {
	    number = checkIp65504P042PgmCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P042PgmCodS((short)number);
	}
	public void setIp65504P042PgmCodS(long number) {
	    number = checkIp65504P042PgmCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P042PgmCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P042PgmCodL
	 *	@return ip65504P042PgmCodL
	 */
	public short getIp65504P042PgmCodL() throws CFException {
        if (isIp65504P042PgmCodLModified()) { 
           ip65504P042PgmCodL = refreshIp65504P042PgmCodL();
        }
   		return ip65504P042PgmCodL;
	}
	
	/**
	 * 	Update Ip65504P042PgmCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P042-PGM-COD-L
	 *	@param number
	 */
	public void setIp65504P042PgmCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P042PgmCodL = checkIp65504P042PgmCodLMaxLimit(number); 
		serializeIp65504P042PgmCodL(ip65504P042PgmCodL);
	}

	public void setIp65504P042PgmCodL(int number) {
	    number = checkIp65504P042PgmCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P042PgmCodL((short)number);
	}
	public void setIp65504P042PgmCodL(long number) {
	    number = checkIp65504P042PgmCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P042PgmCodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P043PgmRegS
	 *	@return ip65504P043PgmRegS
	 */
	public short getIp65504P043PgmRegS() throws CFException {
        if (isIp65504P043PgmRegSModified()) { 
           ip65504P043PgmRegS = refreshIp65504P043PgmRegS();
        }
   		return ip65504P043PgmRegS;
	}
	
	/**
	 * 	Update Ip65504P043PgmRegS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P043-PGM-REG-S
	 *	@param number
	 */
	public void setIp65504P043PgmRegS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P043PgmRegS = checkIp65504P043PgmRegSMaxLimit(number); 
		serializeIp65504P043PgmRegS(ip65504P043PgmRegS);
	}

	public void setIp65504P043PgmRegS(int number) {
	    number = checkIp65504P043PgmRegSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P043PgmRegS((short)number);
	}
	public void setIp65504P043PgmRegS(long number) {
	    number = checkIp65504P043PgmRegSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P043PgmRegS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P043PgmRegL
	 *	@return ip65504P043PgmRegL
	 */
	public short getIp65504P043PgmRegL() throws CFException {
        if (isIp65504P043PgmRegLModified()) { 
           ip65504P043PgmRegL = refreshIp65504P043PgmRegL();
        }
   		return ip65504P043PgmRegL;
	}
	
	/**
	 * 	Update Ip65504P043PgmRegL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P043-PGM-REG-L
	 *	@param number
	 */
	public void setIp65504P043PgmRegL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P043PgmRegL = checkIp65504P043PgmRegLMaxLimit(number); 
		serializeIp65504P043PgmRegL(ip65504P043PgmRegL);
	}

	public void setIp65504P043PgmRegL(int number) {
	    number = checkIp65504P043PgmRegLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P043PgmRegL((short)number);
	}
	public void setIp65504P043PgmRegL(long number) {
	    number = checkIp65504P043PgmRegLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P043PgmRegL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P044ReservdS
	 *	@return ip65504P044ReservdS
	 */
	public short getIp65504P044ReservdS() throws CFException {
        if (isIp65504P044ReservdSModified()) { 
           ip65504P044ReservdS = refreshIp65504P044ReservdS();
        }
   		return ip65504P044ReservdS;
	}
	
	/**
	 * 	Update Ip65504P044ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P044-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P044ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P044ReservdS = checkIp65504P044ReservdSMaxLimit(number); 
		serializeIp65504P044ReservdS(ip65504P044ReservdS);
	}

	public void setIp65504P044ReservdS(int number) {
	    number = checkIp65504P044ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P044ReservdS((short)number);
	}
	public void setIp65504P044ReservdS(long number) {
	    number = checkIp65504P044ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P044ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P044ReservdL
	 *	@return ip65504P044ReservdL
	 */
	public short getIp65504P044ReservdL() throws CFException {
        if (isIp65504P044ReservdLModified()) { 
           ip65504P044ReservdL = refreshIp65504P044ReservdL();
        }
   		return ip65504P044ReservdL;
	}
	
	/**
	 * 	Update Ip65504P044ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P044-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P044ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P044ReservdL = checkIp65504P044ReservdLMaxLimit(number); 
		serializeIp65504P044ReservdL(ip65504P044ReservdL);
	}

	public void setIp65504P044ReservdL(int number) {
	    number = checkIp65504P044ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P044ReservdL((short)number);
	}
	public void setIp65504P044ReservdL(long number) {
	    number = checkIp65504P044ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P044ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P045ValAddS
	 *	@return ip65504P045ValAddS
	 */
	public short getIp65504P045ValAddS() throws CFException {
        if (isIp65504P045ValAddSModified()) { 
           ip65504P045ValAddS = refreshIp65504P045ValAddS();
        }
   		return ip65504P045ValAddS;
	}
	
	/**
	 * 	Update Ip65504P045ValAddS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P045-VAL-ADD-S
	 *	@param number
	 */
	public void setIp65504P045ValAddS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P045ValAddS = checkIp65504P045ValAddSMaxLimit(number); 
		serializeIp65504P045ValAddS(ip65504P045ValAddS);
	}

	public void setIp65504P045ValAddS(int number) {
	    number = checkIp65504P045ValAddSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P045ValAddS((short)number);
	}
	public void setIp65504P045ValAddS(long number) {
	    number = checkIp65504P045ValAddSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P045ValAddS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P045ValAddL
	 *	@return ip65504P045ValAddL
	 */
	public short getIp65504P045ValAddL() throws CFException {
        if (isIp65504P045ValAddLModified()) { 
           ip65504P045ValAddL = refreshIp65504P045ValAddL();
        }
   		return ip65504P045ValAddL;
	}
	
	/**
	 * 	Update Ip65504P045ValAddL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P045-VAL-ADD-L
	 *	@param number
	 */
	public void setIp65504P045ValAddL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P045ValAddL = checkIp65504P045ValAddLMaxLimit(number); 
		serializeIp65504P045ValAddL(ip65504P045ValAddL);
	}

	public void setIp65504P045ValAddL(int number) {
	    number = checkIp65504P045ValAddLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P045ValAddL((short)number);
	}
	public void setIp65504P045ValAddL(long number) {
	    number = checkIp65504P045ValAddLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P045ValAddL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P046ReservdS
	 *	@return ip65504P046ReservdS
	 */
	public short getIp65504P046ReservdS() throws CFException {
        if (isIp65504P046ReservdSModified()) { 
           ip65504P046ReservdS = refreshIp65504P046ReservdS();
        }
   		return ip65504P046ReservdS;
	}
	
	/**
	 * 	Update Ip65504P046ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P046-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P046ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P046ReservdS = checkIp65504P046ReservdSMaxLimit(number); 
		serializeIp65504P046ReservdS(ip65504P046ReservdS);
	}

	public void setIp65504P046ReservdS(int number) {
	    number = checkIp65504P046ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P046ReservdS((short)number);
	}
	public void setIp65504P046ReservdS(long number) {
	    number = checkIp65504P046ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P046ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P046ReservdL
	 *	@return ip65504P046ReservdL
	 */
	public short getIp65504P046ReservdL() throws CFException {
        if (isIp65504P046ReservdLModified()) { 
           ip65504P046ReservdL = refreshIp65504P046ReservdL();
        }
   		return ip65504P046ReservdL;
	}
	
	/**
	 * 	Update Ip65504P046ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P046-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P046ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P046ReservdL = checkIp65504P046ReservdLMaxLimit(number); 
		serializeIp65504P046ReservdL(ip65504P046ReservdL);
	}

	public void setIp65504P046ReservdL(int number) {
	    number = checkIp65504P046ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P046ReservdL((short)number);
	}
	public void setIp65504P046ReservdL(long number) {
	    number = checkIp65504P046ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P046ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P047CusNmeS
	 *	@return ip65504P047CusNmeS
	 */
	public short getIp65504P047CusNmeS() throws CFException {
        if (isIp65504P047CusNmeSModified()) { 
           ip65504P047CusNmeS = refreshIp65504P047CusNmeS();
        }
   		return ip65504P047CusNmeS;
	}
	
	/**
	 * 	Update Ip65504P047CusNmeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P047-CUS-NME-S
	 *	@param number
	 */
	public void setIp65504P047CusNmeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P047CusNmeS = checkIp65504P047CusNmeSMaxLimit(number); 
		serializeIp65504P047CusNmeS(ip65504P047CusNmeS);
	}

	public void setIp65504P047CusNmeS(int number) {
	    number = checkIp65504P047CusNmeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P047CusNmeS((short)number);
	}
	public void setIp65504P047CusNmeS(long number) {
	    number = checkIp65504P047CusNmeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P047CusNmeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P047CusNmeL
	 *	@return ip65504P047CusNmeL
	 */
	public short getIp65504P047CusNmeL() throws CFException {
        if (isIp65504P047CusNmeLModified()) { 
           ip65504P047CusNmeL = refreshIp65504P047CusNmeL();
        }
   		return ip65504P047CusNmeL;
	}
	
	/**
	 * 	Update Ip65504P047CusNmeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P047-CUS-NME-L
	 *	@param number
	 */
	public void setIp65504P047CusNmeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P047CusNmeL = checkIp65504P047CusNmeLMaxLimit(number); 
		serializeIp65504P047CusNmeL(ip65504P047CusNmeL);
	}

	public void setIp65504P047CusNmeL(int number) {
	    number = checkIp65504P047CusNmeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P047CusNmeL((short)number);
	}
	public void setIp65504P047CusNmeL(long number) {
	    number = checkIp65504P047CusNmeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P047CusNmeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P048ChbiadrS
	 *	@return ip65504P048ChbiadrS
	 */
	public short getIp65504P048ChbiadrS() throws CFException {
        if (isIp65504P048ChbiadrSModified()) { 
           ip65504P048ChbiadrS = refreshIp65504P048ChbiadrS();
        }
   		return ip65504P048ChbiadrS;
	}
	
	/**
	 * 	Update Ip65504P048ChbiadrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P048-CHBIADR-S
	 *	@param number
	 */
	public void setIp65504P048ChbiadrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P048ChbiadrS = checkIp65504P048ChbiadrSMaxLimit(number); 
		serializeIp65504P048ChbiadrS(ip65504P048ChbiadrS);
	}

	public void setIp65504P048ChbiadrS(int number) {
	    number = checkIp65504P048ChbiadrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P048ChbiadrS((short)number);
	}
	public void setIp65504P048ChbiadrS(long number) {
	    number = checkIp65504P048ChbiadrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P048ChbiadrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P048ChbiadrL
	 *	@return ip65504P048ChbiadrL
	 */
	public short getIp65504P048ChbiadrL() throws CFException {
        if (isIp65504P048ChbiadrLModified()) { 
           ip65504P048ChbiadrL = refreshIp65504P048ChbiadrL();
        }
   		return ip65504P048ChbiadrL;
	}
	
	/**
	 * 	Update Ip65504P048ChbiadrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P048-CHBIADR-L
	 *	@param number
	 */
	public void setIp65504P048ChbiadrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P048ChbiadrL = checkIp65504P048ChbiadrLMaxLimit(number); 
		serializeIp65504P048ChbiadrL(ip65504P048ChbiadrL);
	}

	public void setIp65504P048ChbiadrL(int number) {
	    number = checkIp65504P048ChbiadrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P048ChbiadrL((short)number);
	}
	public void setIp65504P048ChbiadrL(long number) {
	    number = checkIp65504P048ChbiadrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P048ChbiadrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P049ChspadrS
	 *	@return ip65504P049ChspadrS
	 */
	public short getIp65504P049ChspadrS() throws CFException {
        if (isIp65504P049ChspadrSModified()) { 
           ip65504P049ChspadrS = refreshIp65504P049ChspadrS();
        }
   		return ip65504P049ChspadrS;
	}
	
	/**
	 * 	Update Ip65504P049ChspadrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P049-CHSPADR-S
	 *	@param number
	 */
	public void setIp65504P049ChspadrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P049ChspadrS = checkIp65504P049ChspadrSMaxLimit(number); 
		serializeIp65504P049ChspadrS(ip65504P049ChspadrS);
	}

	public void setIp65504P049ChspadrS(int number) {
	    number = checkIp65504P049ChspadrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P049ChspadrS((short)number);
	}
	public void setIp65504P049ChspadrS(long number) {
	    number = checkIp65504P049ChspadrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P049ChspadrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P049ChspadrL
	 *	@return ip65504P049ChspadrL
	 */
	public short getIp65504P049ChspadrL() throws CFException {
        if (isIp65504P049ChspadrLModified()) { 
           ip65504P049ChspadrL = refreshIp65504P049ChspadrL();
        }
   		return ip65504P049ChspadrL;
	}
	
	/**
	 * 	Update Ip65504P049ChspadrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P049-CHSPADR-L
	 *	@param number
	 */
	public void setIp65504P049ChspadrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P049ChspadrL = checkIp65504P049ChspadrLMaxLimit(number); 
		serializeIp65504P049ChspadrL(ip65504P049ChspadrL);
	}

	public void setIp65504P049ChspadrL(int number) {
	    number = checkIp65504P049ChspadrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P049ChspadrL((short)number);
	}
	public void setIp65504P049ChspadrL(long number) {
	    number = checkIp65504P049ChspadrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P049ChspadrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P050CusId1S
	 *	@return ip65504P050CusId1S
	 */
	public short getIp65504P050CusId1S() throws CFException {
        if (isIp65504P050CusId1SModified()) { 
           ip65504P050CusId1S = refreshIp65504P050CusId1S();
        }
   		return ip65504P050CusId1S;
	}
	
	/**
	 * 	Update Ip65504P050CusId1S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P050-CUS-ID1-S
	 *	@param number
	 */
	public void setIp65504P050CusId1S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P050CusId1S = checkIp65504P050CusId1SMaxLimit(number); 
		serializeIp65504P050CusId1S(ip65504P050CusId1S);
	}

	public void setIp65504P050CusId1S(int number) {
	    number = checkIp65504P050CusId1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P050CusId1S((short)number);
	}
	public void setIp65504P050CusId1S(long number) {
	    number = checkIp65504P050CusId1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P050CusId1S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P050CusId1L
	 *	@return ip65504P050CusId1L
	 */
	public short getIp65504P050CusId1L() throws CFException {
        if (isIp65504P050CusId1LModified()) { 
           ip65504P050CusId1L = refreshIp65504P050CusId1L();
        }
   		return ip65504P050CusId1L;
	}
	
	/**
	 * 	Update Ip65504P050CusId1L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P050-CUS-ID1-L
	 *	@param number
	 */
	public void setIp65504P050CusId1L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P050CusId1L = checkIp65504P050CusId1LMaxLimit(number); 
		serializeIp65504P050CusId1L(ip65504P050CusId1L);
	}

	public void setIp65504P050CusId1L(int number) {
	    number = checkIp65504P050CusId1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P050CusId1L((short)number);
	}
	public void setIp65504P050CusId1L(long number) {
	    number = checkIp65504P050CusId1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P050CusId1L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P051CusId2S
	 *	@return ip65504P051CusId2S
	 */
	public short getIp65504P051CusId2S() throws CFException {
        if (isIp65504P051CusId2SModified()) { 
           ip65504P051CusId2S = refreshIp65504P051CusId2S();
        }
   		return ip65504P051CusId2S;
	}
	
	/**
	 * 	Update Ip65504P051CusId2S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P051-CUS-ID2-S
	 *	@param number
	 */
	public void setIp65504P051CusId2S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P051CusId2S = checkIp65504P051CusId2SMaxLimit(number); 
		serializeIp65504P051CusId2S(ip65504P051CusId2S);
	}

	public void setIp65504P051CusId2S(int number) {
	    number = checkIp65504P051CusId2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P051CusId2S((short)number);
	}
	public void setIp65504P051CusId2S(long number) {
	    number = checkIp65504P051CusId2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P051CusId2S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P051CusId2L
	 *	@return ip65504P051CusId2L
	 */
	public short getIp65504P051CusId2L() throws CFException {
        if (isIp65504P051CusId2LModified()) { 
           ip65504P051CusId2L = refreshIp65504P051CusId2L();
        }
   		return ip65504P051CusId2L;
	}
	
	/**
	 * 	Update Ip65504P051CusId2L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P051-CUS-ID2-L
	 *	@param number
	 */
	public void setIp65504P051CusId2L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P051CusId2L = checkIp65504P051CusId2LMaxLimit(number); 
		serializeIp65504P051CusId2L(ip65504P051CusId2L);
	}

	public void setIp65504P051CusId2L(int number) {
	    number = checkIp65504P051CusId2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P051CusId2L((short)number);
	}
	public void setIp65504P051CusId2L(long number) {
	    number = checkIp65504P051CusId2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P051CusId2L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P052CusActS
	 *	@return ip65504P052CusActS
	 */
	public short getIp65504P052CusActS() throws CFException {
        if (isIp65504P052CusActSModified()) { 
           ip65504P052CusActS = refreshIp65504P052CusActS();
        }
   		return ip65504P052CusActS;
	}
	
	/**
	 * 	Update Ip65504P052CusActS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P052-CUS-ACT-S
	 *	@param number
	 */
	public void setIp65504P052CusActS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P052CusActS = checkIp65504P052CusActSMaxLimit(number); 
		serializeIp65504P052CusActS(ip65504P052CusActS);
	}

	public void setIp65504P052CusActS(int number) {
	    number = checkIp65504P052CusActSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P052CusActS((short)number);
	}
	public void setIp65504P052CusActS(long number) {
	    number = checkIp65504P052CusActSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P052CusActS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P052CusActL
	 *	@return ip65504P052CusActL
	 */
	public short getIp65504P052CusActL() throws CFException {
        if (isIp65504P052CusActLModified()) { 
           ip65504P052CusActL = refreshIp65504P052CusActL();
        }
   		return ip65504P052CusActL;
	}
	
	/**
	 * 	Update Ip65504P052CusActL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P052-CUS-ACT-L
	 *	@param number
	 */
	public void setIp65504P052CusActL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P052CusActL = checkIp65504P052CusActLMaxLimit(number); 
		serializeIp65504P052CusActL(ip65504P052CusActL);
	}

	public void setIp65504P052CusActL(int number) {
	    number = checkIp65504P052CusActLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P052CusActL((short)number);
	}
	public void setIp65504P052CusActL(long number) {
	    number = checkIp65504P052CusActLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P052CusActL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P053CusDobS
	 *	@return ip65504P053CusDobS
	 */
	public short getIp65504P053CusDobS() throws CFException {
        if (isIp65504P053CusDobSModified()) { 
           ip65504P053CusDobS = refreshIp65504P053CusDobS();
        }
   		return ip65504P053CusDobS;
	}
	
	/**
	 * 	Update Ip65504P053CusDobS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P053-CUS-DOB-S
	 *	@param number
	 */
	public void setIp65504P053CusDobS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P053CusDobS = checkIp65504P053CusDobSMaxLimit(number); 
		serializeIp65504P053CusDobS(ip65504P053CusDobS);
	}

	public void setIp65504P053CusDobS(int number) {
	    number = checkIp65504P053CusDobSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P053CusDobS((short)number);
	}
	public void setIp65504P053CusDobS(long number) {
	    number = checkIp65504P053CusDobSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P053CusDobS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P053CusDobL
	 *	@return ip65504P053CusDobL
	 */
	public short getIp65504P053CusDobL() throws CFException {
        if (isIp65504P053CusDobLModified()) { 
           ip65504P053CusDobL = refreshIp65504P053CusDobL();
        }
   		return ip65504P053CusDobL;
	}
	
	/**
	 * 	Update Ip65504P053CusDobL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P053-CUS-DOB-L
	 *	@param number
	 */
	public void setIp65504P053CusDobL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P053CusDobL = checkIp65504P053CusDobLMaxLimit(number); 
		serializeIp65504P053CusDobL(ip65504P053CusDobL);
	}

	public void setIp65504P053CusDobL(int number) {
	    number = checkIp65504P053CusDobLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P053CusDobL((short)number);
	}
	public void setIp65504P053CusDobL(long number) {
	    number = checkIp65504P053CusDobLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P053CusDobL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P054ChdrVfS
	 *	@return ip65504P054ChdrVfS
	 */
	public short getIp65504P054ChdrVfS() throws CFException {
        if (isIp65504P054ChdrVfSModified()) { 
           ip65504P054ChdrVfS = refreshIp65504P054ChdrVfS();
        }
   		return ip65504P054ChdrVfS;
	}
	
	/**
	 * 	Update Ip65504P054ChdrVfS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P054-CHDR-VF-S
	 *	@param number
	 */
	public void setIp65504P054ChdrVfS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P054ChdrVfS = checkIp65504P054ChdrVfSMaxLimit(number); 
		serializeIp65504P054ChdrVfS(ip65504P054ChdrVfS);
	}

	public void setIp65504P054ChdrVfS(int number) {
	    number = checkIp65504P054ChdrVfSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P054ChdrVfS((short)number);
	}
	public void setIp65504P054ChdrVfS(long number) {
	    number = checkIp65504P054ChdrVfSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P054ChdrVfS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P054ChdrVfL
	 *	@return ip65504P054ChdrVfL
	 */
	public short getIp65504P054ChdrVfL() throws CFException {
        if (isIp65504P054ChdrVfLModified()) { 
           ip65504P054ChdrVfL = refreshIp65504P054ChdrVfL();
        }
   		return ip65504P054ChdrVfL;
	}
	
	/**
	 * 	Update Ip65504P054ChdrVfL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P054-CHDR-VF-L
	 *	@param number
	 */
	public void setIp65504P054ChdrVfL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P054ChdrVfL = checkIp65504P054ChdrVfLMaxLimit(number); 
		serializeIp65504P054ChdrVfL(ip65504P054ChdrVfL);
	}

	public void setIp65504P054ChdrVfL(int number) {
	    number = checkIp65504P054ChdrVfLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P054ChdrVfL((short)number);
	}
	public void setIp65504P054ChdrVfL(long number) {
	    number = checkIp65504P054ChdrVfLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P054ChdrVfL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P055MercIdS
	 *	@return ip65504P055MercIdS
	 */
	public short getIp65504P055MercIdS() throws CFException {
        if (isIp65504P055MercIdSModified()) { 
           ip65504P055MercIdS = refreshIp65504P055MercIdS();
        }
   		return ip65504P055MercIdS;
	}
	
	/**
	 * 	Update Ip65504P055MercIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P055-MERC-ID-S
	 *	@param number
	 */
	public void setIp65504P055MercIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P055MercIdS = checkIp65504P055MercIdSMaxLimit(number); 
		serializeIp65504P055MercIdS(ip65504P055MercIdS);
	}

	public void setIp65504P055MercIdS(int number) {
	    number = checkIp65504P055MercIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P055MercIdS((short)number);
	}
	public void setIp65504P055MercIdS(long number) {
	    number = checkIp65504P055MercIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P055MercIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P055MercIdL
	 *	@return ip65504P055MercIdL
	 */
	public short getIp65504P055MercIdL() throws CFException {
        if (isIp65504P055MercIdLModified()) { 
           ip65504P055MercIdL = refreshIp65504P055MercIdL();
        }
   		return ip65504P055MercIdL;
	}
	
	/**
	 * 	Update Ip65504P055MercIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P055-MERC-ID-L
	 *	@param number
	 */
	public void setIp65504P055MercIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P055MercIdL = checkIp65504P055MercIdLMaxLimit(number); 
		serializeIp65504P055MercIdL(ip65504P055MercIdL);
	}

	public void setIp65504P055MercIdL(int number) {
	    number = checkIp65504P055MercIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P055MercIdL((short)number);
	}
	public void setIp65504P055MercIdL(long number) {
	    number = checkIp65504P055MercIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P055MercIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P056ReservdS
	 *	@return ip65504P056ReservdS
	 */
	public short getIp65504P056ReservdS() throws CFException {
        if (isIp65504P056ReservdSModified()) { 
           ip65504P056ReservdS = refreshIp65504P056ReservdS();
        }
   		return ip65504P056ReservdS;
	}
	
	/**
	 * 	Update Ip65504P056ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P056-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P056ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P056ReservdS = checkIp65504P056ReservdSMaxLimit(number); 
		serializeIp65504P056ReservdS(ip65504P056ReservdS);
	}

	public void setIp65504P056ReservdS(int number) {
	    number = checkIp65504P056ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P056ReservdS((short)number);
	}
	public void setIp65504P056ReservdS(long number) {
	    number = checkIp65504P056ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P056ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P056ReservdL
	 *	@return ip65504P056ReservdL
	 */
	public short getIp65504P056ReservdL() throws CFException {
        if (isIp65504P056ReservdLModified()) { 
           ip65504P056ReservdL = refreshIp65504P056ReservdL();
        }
   		return ip65504P056ReservdL;
	}
	
	/**
	 * 	Update Ip65504P056ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P056-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P056ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P056ReservdL = checkIp65504P056ReservdLMaxLimit(number); 
		serializeIp65504P056ReservdL(ip65504P056ReservdL);
	}

	public void setIp65504P056ReservdL(int number) {
	    number = checkIp65504P056ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P056ReservdL((short)number);
	}
	public void setIp65504P056ReservdL(long number) {
	    number = checkIp65504P056ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P056ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P057ReservdS
	 *	@return ip65504P057ReservdS
	 */
	public short getIp65504P057ReservdS() throws CFException {
        if (isIp65504P057ReservdSModified()) { 
           ip65504P057ReservdS = refreshIp65504P057ReservdS();
        }
   		return ip65504P057ReservdS;
	}
	
	/**
	 * 	Update Ip65504P057ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P057-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P057ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P057ReservdS = checkIp65504P057ReservdSMaxLimit(number); 
		serializeIp65504P057ReservdS(ip65504P057ReservdS);
	}

	public void setIp65504P057ReservdS(int number) {
	    number = checkIp65504P057ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P057ReservdS((short)number);
	}
	public void setIp65504P057ReservdS(long number) {
	    number = checkIp65504P057ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P057ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P057ReservdL
	 *	@return ip65504P057ReservdL
	 */
	public short getIp65504P057ReservdL() throws CFException {
        if (isIp65504P057ReservdLModified()) { 
           ip65504P057ReservdL = refreshIp65504P057ReservdL();
        }
   		return ip65504P057ReservdL;
	}
	
	/**
	 * 	Update Ip65504P057ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P057-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P057ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P057ReservdL = checkIp65504P057ReservdLMaxLimit(number); 
		serializeIp65504P057ReservdL(ip65504P057ReservdL);
	}

	public void setIp65504P057ReservdL(int number) {
	    number = checkIp65504P057ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P057ReservdL((short)number);
	}
	public void setIp65504P057ReservdL(long number) {
	    number = checkIp65504P057ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P057ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P058ReservdS
	 *	@return ip65504P058ReservdS
	 */
	public short getIp65504P058ReservdS() throws CFException {
        if (isIp65504P058ReservdSModified()) { 
           ip65504P058ReservdS = refreshIp65504P058ReservdS();
        }
   		return ip65504P058ReservdS;
	}
	
	/**
	 * 	Update Ip65504P058ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P058-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P058ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P058ReservdS = checkIp65504P058ReservdSMaxLimit(number); 
		serializeIp65504P058ReservdS(ip65504P058ReservdS);
	}

	public void setIp65504P058ReservdS(int number) {
	    number = checkIp65504P058ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P058ReservdS((short)number);
	}
	public void setIp65504P058ReservdS(long number) {
	    number = checkIp65504P058ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P058ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P058ReservdL
	 *	@return ip65504P058ReservdL
	 */
	public short getIp65504P058ReservdL() throws CFException {
        if (isIp65504P058ReservdLModified()) { 
           ip65504P058ReservdL = refreshIp65504P058ReservdL();
        }
   		return ip65504P058ReservdL;
	}
	
	/**
	 * 	Update Ip65504P058ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P058-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P058ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P058ReservdL = checkIp65504P058ReservdLMaxLimit(number); 
		serializeIp65504P058ReservdL(ip65504P058ReservdL);
	}

	public void setIp65504P058ReservdL(int number) {
	    number = checkIp65504P058ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P058ReservdL((short)number);
	}
	public void setIp65504P058ReservdL(long number) {
	    number = checkIp65504P058ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P058ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P059ReservdS
	 *	@return ip65504P059ReservdS
	 */
	public short getIp65504P059ReservdS() throws CFException {
        if (isIp65504P059ReservdSModified()) { 
           ip65504P059ReservdS = refreshIp65504P059ReservdS();
        }
   		return ip65504P059ReservdS;
	}
	
	/**
	 * 	Update Ip65504P059ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P059-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P059ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P059ReservdS = checkIp65504P059ReservdSMaxLimit(number); 
		serializeIp65504P059ReservdS(ip65504P059ReservdS);
	}

	public void setIp65504P059ReservdS(int number) {
	    number = checkIp65504P059ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P059ReservdS((short)number);
	}
	public void setIp65504P059ReservdS(long number) {
	    number = checkIp65504P059ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P059ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P059ReservdL
	 *	@return ip65504P059ReservdL
	 */
	public short getIp65504P059ReservdL() throws CFException {
        if (isIp65504P059ReservdLModified()) { 
           ip65504P059ReservdL = refreshIp65504P059ReservdL();
        }
   		return ip65504P059ReservdL;
	}
	
	/**
	 * 	Update Ip65504P059ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P059-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P059ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P059ReservdL = checkIp65504P059ReservdLMaxLimit(number); 
		serializeIp65504P059ReservdL(ip65504P059ReservdL);
	}

	public void setIp65504P059ReservdL(int number) {
	    number = checkIp65504P059ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P059ReservdL((short)number);
	}
	public void setIp65504P059ReservdL(long number) {
	    number = checkIp65504P059ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P059ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P060ReservdS
	 *	@return ip65504P060ReservdS
	 */
	public short getIp65504P060ReservdS() throws CFException {
        if (isIp65504P060ReservdSModified()) { 
           ip65504P060ReservdS = refreshIp65504P060ReservdS();
        }
   		return ip65504P060ReservdS;
	}
	
	/**
	 * 	Update Ip65504P060ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P060-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P060ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P060ReservdS = checkIp65504P060ReservdSMaxLimit(number); 
		serializeIp65504P060ReservdS(ip65504P060ReservdS);
	}

	public void setIp65504P060ReservdS(int number) {
	    number = checkIp65504P060ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P060ReservdS((short)number);
	}
	public void setIp65504P060ReservdS(long number) {
	    number = checkIp65504P060ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P060ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P060ReservdL
	 *	@return ip65504P060ReservdL
	 */
	public short getIp65504P060ReservdL() throws CFException {
        if (isIp65504P060ReservdLModified()) { 
           ip65504P060ReservdL = refreshIp65504P060ReservdL();
        }
   		return ip65504P060ReservdL;
	}
	
	/**
	 * 	Update Ip65504P060ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P060-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P060ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P060ReservdL = checkIp65504P060ReservdLMaxLimit(number); 
		serializeIp65504P060ReservdL(ip65504P060ReservdL);
	}

	public void setIp65504P060ReservdL(int number) {
	    number = checkIp65504P060ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P060ReservdL((short)number);
	}
	public void setIp65504P060ReservdL(long number) {
	    number = checkIp65504P060ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P060ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P061RefTelS
	 *	@return ip65504P061RefTelS
	 */
	public short getIp65504P061RefTelS() throws CFException {
        if (isIp65504P061RefTelSModified()) { 
           ip65504P061RefTelS = refreshIp65504P061RefTelS();
        }
   		return ip65504P061RefTelS;
	}
	
	/**
	 * 	Update Ip65504P061RefTelS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P061-REF-TEL-S
	 *	@param number
	 */
	public void setIp65504P061RefTelS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P061RefTelS = checkIp65504P061RefTelSMaxLimit(number); 
		serializeIp65504P061RefTelS(ip65504P061RefTelS);
	}

	public void setIp65504P061RefTelS(int number) {
	    number = checkIp65504P061RefTelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P061RefTelS((short)number);
	}
	public void setIp65504P061RefTelS(long number) {
	    number = checkIp65504P061RefTelSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P061RefTelS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P061RefTelL
	 *	@return ip65504P061RefTelL
	 */
	public short getIp65504P061RefTelL() throws CFException {
        if (isIp65504P061RefTelLModified()) { 
           ip65504P061RefTelL = refreshIp65504P061RefTelL();
        }
   		return ip65504P061RefTelL;
	}
	
	/**
	 * 	Update Ip65504P061RefTelL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P061-REF-TEL-L
	 *	@param number
	 */
	public void setIp65504P061RefTelL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P061RefTelL = checkIp65504P061RefTelLMaxLimit(number); 
		serializeIp65504P061RefTelL(ip65504P061RefTelL);
	}

	public void setIp65504P061RefTelL(int number) {
	    number = checkIp65504P061RefTelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P061RefTelL((short)number);
	}
	public void setIp65504P061RefTelL(long number) {
	    number = checkIp65504P061RefTelLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P061RefTelL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P062ReservdS
	 *	@return ip65504P062ReservdS
	 */
	public short getIp65504P062ReservdS() throws CFException {
        if (isIp65504P062ReservdSModified()) { 
           ip65504P062ReservdS = refreshIp65504P062ReservdS();
        }
   		return ip65504P062ReservdS;
	}
	
	/**
	 * 	Update Ip65504P062ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P062-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P062ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P062ReservdS = checkIp65504P062ReservdSMaxLimit(number); 
		serializeIp65504P062ReservdS(ip65504P062ReservdS);
	}

	public void setIp65504P062ReservdS(int number) {
	    number = checkIp65504P062ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P062ReservdS((short)number);
	}
	public void setIp65504P062ReservdS(long number) {
	    number = checkIp65504P062ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P062ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P062ReservdL
	 *	@return ip65504P062ReservdL
	 */
	public short getIp65504P062ReservdL() throws CFException {
        if (isIp65504P062ReservdLModified()) { 
           ip65504P062ReservdL = refreshIp65504P062ReservdL();
        }
   		return ip65504P062ReservdL;
	}
	
	/**
	 * 	Update Ip65504P062ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P062-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P062ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P062ReservdL = checkIp65504P062ReservdLMaxLimit(number); 
		serializeIp65504P062ReservdL(ip65504P062ReservdL);
	}

	public void setIp65504P062ReservdL(int number) {
	    number = checkIp65504P062ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P062ReservdL((short)number);
	}
	public void setIp65504P062ReservdL(long number) {
	    number = checkIp65504P062ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P062ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P032ReservdS((short)0);
         	setIp65504P032ReservdL((short)0);
         	setIp65504P033ReservdS((short)0);
         	setIp65504P033ReservdL((short)0);
         	setIp65504P034ReservdS((short)0);
         	setIp65504P034ReservdL((short)0);
         	setIp65504P035AcqPsrS((short)0);
         	setIp65504P035AcqPsrL((short)0);
         	setIp65504P036IssCodS((short)0);
         	setIp65504P036IssCodL((short)0);
         	setIp65504P037CrdIssS((short)0);
         	setIp65504P037CrdIssL((short)0);
         	setIp65504P038ReservdS((short)0);
         	setIp65504P038ReservdL((short)0);
         	setIp65504P039ReservdS((short)0);
         	setIp65504P039ReservdL((short)0);
         	setIp65504P040ReservdS((short)0);
         	setIp65504P040ReservdL((short)0);
         	setIp65504P041ReservdS((short)0);
         	setIp65504P041ReservdL((short)0);
         	setIp65504P042PgmCodS((short)0);
         	setIp65504P042PgmCodL((short)0);
         	setIp65504P043PgmRegS((short)0);
         	setIp65504P043PgmRegL((short)0);
         	setIp65504P044ReservdS((short)0);
         	setIp65504P044ReservdL((short)0);
         	setIp65504P045ValAddS((short)0);
         	setIp65504P045ValAddL((short)0);
         	setIp65504P046ReservdS((short)0);
         	setIp65504P046ReservdL((short)0);
         	setIp65504P047CusNmeS((short)0);
         	setIp65504P047CusNmeL((short)0);
         	setIp65504P048ChbiadrS((short)0);
         	setIp65504P048ChbiadrL((short)0);
         	setIp65504P049ChspadrS((short)0);
         	setIp65504P049ChspadrL((short)0);
         	setIp65504P050CusId1S((short)0);
         	setIp65504P050CusId1L((short)0);
         	setIp65504P051CusId2S((short)0);
         	setIp65504P051CusId2L((short)0);
         	setIp65504P052CusActS((short)0);
         	setIp65504P052CusActL((short)0);
         	setIp65504P053CusDobS((short)0);
         	setIp65504P053CusDobL((short)0);
         	setIp65504P054ChdrVfS((short)0);
         	setIp65504P054ChdrVfL((short)0);
         	setIp65504P055MercIdS((short)0);
         	setIp65504P055MercIdL((short)0);
         	setIp65504P056ReservdS((short)0);
         	setIp65504P056ReservdL((short)0);
         	setIp65504P057ReservdS((short)0);
         	setIp65504P057ReservdL((short)0);
         	setIp65504P058ReservdS((short)0);
         	setIp65504P058ReservdL((short)0);
         	setIp65504P059ReservdS((short)0);
         	setIp65504P059ReservdL((short)0);
         	setIp65504P060ReservdS((short)0);
         	setIp65504P060ReservdL((short)0);
         	setIp65504P061RefTelS((short)0);
         	setIp65504P061RefTelL((short)0);
         	setIp65504P062ReservdS((short)0);
         	setIp65504P062ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup2FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_2_LENGTH;
		}

}
  
