package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup9 extends Ip65504PdsNamesLargeGroup9Serialized { 
   

								private short ip65504P249ReservdS;

								private short ip65504P249ReservdL;


								private short ip65504P250ReservdS;

								private short ip65504P250ReservdL;


								private short ip65504P251FeeBasS;

								private short ip65504P251FeeBasL;


								private short ip65504P252ReservdS;

								private short ip65504P252ReservdL;


								private short ip65504P253ReservdS;

								private short ip65504P253ReservdL;


								private short ip65504P254ReservdS;

								private short ip65504P254ReservdL;


								private short ip65504P255ReservdS;

								private short ip65504P255ReservdL;


								private short ip65504P256ReservdS;

								private short ip65504P256ReservdL;


								private short ip65504P257ReservdS;

								private short ip65504P257ReservdL;


								private short ip65504P258ReservdS;

								private short ip65504P258ReservdL;


								private short ip65504P259ReservdS;

								private short ip65504P259ReservdL;


								private short ip65504P260EdExclS;

								private short ip65504P260EdExclL;


								private short ip65504P261FrdTypS;

								private short ip65504P261FrdTypL;


								private short ip65504P262DocIndS;

								private short ip65504P262DocIndL;


								private short ip65504P263OrigCdS;

								private short ip65504P263OrigCdL;


								private short ip65504P264OrgReaS;

								private short ip65504P264OrgReaL;


								private short ip65504P265IntPreS;

								private short ip65504P265IntPreL;


								private short ip65504P2661stCbkS;

								private short ip65504P2661stCbkL;


								private short ip65504P2672ndPreS;

								private short ip65504P2672ndPreL;


								private short ip65504P268PtlAmtS;

								private short ip65504P268PtlAmtL;


								private short ip65504P269ReservdS;

								private short ip65504P269ReservdL;


								private short ip65504P270ReservdS;

								private short ip65504P270ReservdL;


								private short ip65504P271ReservdS;

								private short ip65504P271ReservdL;


								private short ip65504P272ReservdS;

								private short ip65504P272ReservdL;


								private short ip65504P273ReservdS;

								private short ip65504P273ReservdL;


								private short ip65504P274ReservdS;

								private short ip65504P274ReservdL;


								private short ip65504P275ReservdS;

								private short ip65504P275ReservdL;


								private short ip65504P276ReservdS;

								private short ip65504P276ReservdL;


								private short ip65504P277ReservdS;

								private short ip65504P277ReservdL;


								private short ip65504P278ReservdS;

								private short ip65504P278ReservdL;


								private short ip65504P279ReservdS;

								private short ip65504P279ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup9
	**/
    public Ip65504PdsNamesLargeGroup9() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup9. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup9(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P249ReservdS
	 *	@return ip65504P249ReservdS
	 */
	public short getIp65504P249ReservdS() throws CFException {
        if (isIp65504P249ReservdSModified()) { 
           ip65504P249ReservdS = refreshIp65504P249ReservdS();
        }
   		return ip65504P249ReservdS;
	}
	
	/**
	 * 	Update Ip65504P249ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P249-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P249ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P249ReservdS = checkIp65504P249ReservdSMaxLimit(number); 
		serializeIp65504P249ReservdS(ip65504P249ReservdS);
	}

	public void setIp65504P249ReservdS(int number) {
	    number = checkIp65504P249ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P249ReservdS((short)number);
	}
	public void setIp65504P249ReservdS(long number) {
	    number = checkIp65504P249ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P249ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P249ReservdL
	 *	@return ip65504P249ReservdL
	 */
	public short getIp65504P249ReservdL() throws CFException {
        if (isIp65504P249ReservdLModified()) { 
           ip65504P249ReservdL = refreshIp65504P249ReservdL();
        }
   		return ip65504P249ReservdL;
	}
	
	/**
	 * 	Update Ip65504P249ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P249-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P249ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P249ReservdL = checkIp65504P249ReservdLMaxLimit(number); 
		serializeIp65504P249ReservdL(ip65504P249ReservdL);
	}

	public void setIp65504P249ReservdL(int number) {
	    number = checkIp65504P249ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P249ReservdL((short)number);
	}
	public void setIp65504P249ReservdL(long number) {
	    number = checkIp65504P249ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P249ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P250ReservdS
	 *	@return ip65504P250ReservdS
	 */
	public short getIp65504P250ReservdS() throws CFException {
        if (isIp65504P250ReservdSModified()) { 
           ip65504P250ReservdS = refreshIp65504P250ReservdS();
        }
   		return ip65504P250ReservdS;
	}
	
	/**
	 * 	Update Ip65504P250ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P250-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P250ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P250ReservdS = checkIp65504P250ReservdSMaxLimit(number); 
		serializeIp65504P250ReservdS(ip65504P250ReservdS);
	}

	public void setIp65504P250ReservdS(int number) {
	    number = checkIp65504P250ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P250ReservdS((short)number);
	}
	public void setIp65504P250ReservdS(long number) {
	    number = checkIp65504P250ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P250ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P250ReservdL
	 *	@return ip65504P250ReservdL
	 */
	public short getIp65504P250ReservdL() throws CFException {
        if (isIp65504P250ReservdLModified()) { 
           ip65504P250ReservdL = refreshIp65504P250ReservdL();
        }
   		return ip65504P250ReservdL;
	}
	
	/**
	 * 	Update Ip65504P250ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P250-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P250ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P250ReservdL = checkIp65504P250ReservdLMaxLimit(number); 
		serializeIp65504P250ReservdL(ip65504P250ReservdL);
	}

	public void setIp65504P250ReservdL(int number) {
	    number = checkIp65504P250ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P250ReservdL((short)number);
	}
	public void setIp65504P250ReservdL(long number) {
	    number = checkIp65504P250ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P250ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P251FeeBasS
	 *	@return ip65504P251FeeBasS
	 */
	public short getIp65504P251FeeBasS() throws CFException {
        if (isIp65504P251FeeBasSModified()) { 
           ip65504P251FeeBasS = refreshIp65504P251FeeBasS();
        }
   		return ip65504P251FeeBasS;
	}
	
	/**
	 * 	Update Ip65504P251FeeBasS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P251-FEE-BAS-S
	 *	@param number
	 */
	public void setIp65504P251FeeBasS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P251FeeBasS = checkIp65504P251FeeBasSMaxLimit(number); 
		serializeIp65504P251FeeBasS(ip65504P251FeeBasS);
	}

	public void setIp65504P251FeeBasS(int number) {
	    number = checkIp65504P251FeeBasSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P251FeeBasS((short)number);
	}
	public void setIp65504P251FeeBasS(long number) {
	    number = checkIp65504P251FeeBasSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P251FeeBasS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P251FeeBasL
	 *	@return ip65504P251FeeBasL
	 */
	public short getIp65504P251FeeBasL() throws CFException {
        if (isIp65504P251FeeBasLModified()) { 
           ip65504P251FeeBasL = refreshIp65504P251FeeBasL();
        }
   		return ip65504P251FeeBasL;
	}
	
	/**
	 * 	Update Ip65504P251FeeBasL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P251-FEE-BAS-L
	 *	@param number
	 */
	public void setIp65504P251FeeBasL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P251FeeBasL = checkIp65504P251FeeBasLMaxLimit(number); 
		serializeIp65504P251FeeBasL(ip65504P251FeeBasL);
	}

	public void setIp65504P251FeeBasL(int number) {
	    number = checkIp65504P251FeeBasLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P251FeeBasL((short)number);
	}
	public void setIp65504P251FeeBasL(long number) {
	    number = checkIp65504P251FeeBasLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P251FeeBasL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P252ReservdS
	 *	@return ip65504P252ReservdS
	 */
	public short getIp65504P252ReservdS() throws CFException {
        if (isIp65504P252ReservdSModified()) { 
           ip65504P252ReservdS = refreshIp65504P252ReservdS();
        }
   		return ip65504P252ReservdS;
	}
	
	/**
	 * 	Update Ip65504P252ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P252-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P252ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P252ReservdS = checkIp65504P252ReservdSMaxLimit(number); 
		serializeIp65504P252ReservdS(ip65504P252ReservdS);
	}

	public void setIp65504P252ReservdS(int number) {
	    number = checkIp65504P252ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P252ReservdS((short)number);
	}
	public void setIp65504P252ReservdS(long number) {
	    number = checkIp65504P252ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P252ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P252ReservdL
	 *	@return ip65504P252ReservdL
	 */
	public short getIp65504P252ReservdL() throws CFException {
        if (isIp65504P252ReservdLModified()) { 
           ip65504P252ReservdL = refreshIp65504P252ReservdL();
        }
   		return ip65504P252ReservdL;
	}
	
	/**
	 * 	Update Ip65504P252ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P252-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P252ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P252ReservdL = checkIp65504P252ReservdLMaxLimit(number); 
		serializeIp65504P252ReservdL(ip65504P252ReservdL);
	}

	public void setIp65504P252ReservdL(int number) {
	    number = checkIp65504P252ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P252ReservdL((short)number);
	}
	public void setIp65504P252ReservdL(long number) {
	    number = checkIp65504P252ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P252ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P253ReservdS
	 *	@return ip65504P253ReservdS
	 */
	public short getIp65504P253ReservdS() throws CFException {
        if (isIp65504P253ReservdSModified()) { 
           ip65504P253ReservdS = refreshIp65504P253ReservdS();
        }
   		return ip65504P253ReservdS;
	}
	
	/**
	 * 	Update Ip65504P253ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P253-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P253ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P253ReservdS = checkIp65504P253ReservdSMaxLimit(number); 
		serializeIp65504P253ReservdS(ip65504P253ReservdS);
	}

	public void setIp65504P253ReservdS(int number) {
	    number = checkIp65504P253ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P253ReservdS((short)number);
	}
	public void setIp65504P253ReservdS(long number) {
	    number = checkIp65504P253ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P253ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P253ReservdL
	 *	@return ip65504P253ReservdL
	 */
	public short getIp65504P253ReservdL() throws CFException {
        if (isIp65504P253ReservdLModified()) { 
           ip65504P253ReservdL = refreshIp65504P253ReservdL();
        }
   		return ip65504P253ReservdL;
	}
	
	/**
	 * 	Update Ip65504P253ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P253-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P253ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P253ReservdL = checkIp65504P253ReservdLMaxLimit(number); 
		serializeIp65504P253ReservdL(ip65504P253ReservdL);
	}

	public void setIp65504P253ReservdL(int number) {
	    number = checkIp65504P253ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P253ReservdL((short)number);
	}
	public void setIp65504P253ReservdL(long number) {
	    number = checkIp65504P253ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P253ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P254ReservdS
	 *	@return ip65504P254ReservdS
	 */
	public short getIp65504P254ReservdS() throws CFException {
        if (isIp65504P254ReservdSModified()) { 
           ip65504P254ReservdS = refreshIp65504P254ReservdS();
        }
   		return ip65504P254ReservdS;
	}
	
	/**
	 * 	Update Ip65504P254ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P254-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P254ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P254ReservdS = checkIp65504P254ReservdSMaxLimit(number); 
		serializeIp65504P254ReservdS(ip65504P254ReservdS);
	}

	public void setIp65504P254ReservdS(int number) {
	    number = checkIp65504P254ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P254ReservdS((short)number);
	}
	public void setIp65504P254ReservdS(long number) {
	    number = checkIp65504P254ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P254ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P254ReservdL
	 *	@return ip65504P254ReservdL
	 */
	public short getIp65504P254ReservdL() throws CFException {
        if (isIp65504P254ReservdLModified()) { 
           ip65504P254ReservdL = refreshIp65504P254ReservdL();
        }
   		return ip65504P254ReservdL;
	}
	
	/**
	 * 	Update Ip65504P254ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P254-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P254ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P254ReservdL = checkIp65504P254ReservdLMaxLimit(number); 
		serializeIp65504P254ReservdL(ip65504P254ReservdL);
	}

	public void setIp65504P254ReservdL(int number) {
	    number = checkIp65504P254ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P254ReservdL((short)number);
	}
	public void setIp65504P254ReservdL(long number) {
	    number = checkIp65504P254ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P254ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P255ReservdS
	 *	@return ip65504P255ReservdS
	 */
	public short getIp65504P255ReservdS() throws CFException {
        if (isIp65504P255ReservdSModified()) { 
           ip65504P255ReservdS = refreshIp65504P255ReservdS();
        }
   		return ip65504P255ReservdS;
	}
	
	/**
	 * 	Update Ip65504P255ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P255-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P255ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P255ReservdS = checkIp65504P255ReservdSMaxLimit(number); 
		serializeIp65504P255ReservdS(ip65504P255ReservdS);
	}

	public void setIp65504P255ReservdS(int number) {
	    number = checkIp65504P255ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P255ReservdS((short)number);
	}
	public void setIp65504P255ReservdS(long number) {
	    number = checkIp65504P255ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P255ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P255ReservdL
	 *	@return ip65504P255ReservdL
	 */
	public short getIp65504P255ReservdL() throws CFException {
        if (isIp65504P255ReservdLModified()) { 
           ip65504P255ReservdL = refreshIp65504P255ReservdL();
        }
   		return ip65504P255ReservdL;
	}
	
	/**
	 * 	Update Ip65504P255ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P255-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P255ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P255ReservdL = checkIp65504P255ReservdLMaxLimit(number); 
		serializeIp65504P255ReservdL(ip65504P255ReservdL);
	}

	public void setIp65504P255ReservdL(int number) {
	    number = checkIp65504P255ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P255ReservdL((short)number);
	}
	public void setIp65504P255ReservdL(long number) {
	    number = checkIp65504P255ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P255ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P256ReservdS
	 *	@return ip65504P256ReservdS
	 */
	public short getIp65504P256ReservdS() throws CFException {
        if (isIp65504P256ReservdSModified()) { 
           ip65504P256ReservdS = refreshIp65504P256ReservdS();
        }
   		return ip65504P256ReservdS;
	}
	
	/**
	 * 	Update Ip65504P256ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P256-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P256ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P256ReservdS = checkIp65504P256ReservdSMaxLimit(number); 
		serializeIp65504P256ReservdS(ip65504P256ReservdS);
	}

	public void setIp65504P256ReservdS(int number) {
	    number = checkIp65504P256ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P256ReservdS((short)number);
	}
	public void setIp65504P256ReservdS(long number) {
	    number = checkIp65504P256ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P256ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P256ReservdL
	 *	@return ip65504P256ReservdL
	 */
	public short getIp65504P256ReservdL() throws CFException {
        if (isIp65504P256ReservdLModified()) { 
           ip65504P256ReservdL = refreshIp65504P256ReservdL();
        }
   		return ip65504P256ReservdL;
	}
	
	/**
	 * 	Update Ip65504P256ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P256-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P256ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P256ReservdL = checkIp65504P256ReservdLMaxLimit(number); 
		serializeIp65504P256ReservdL(ip65504P256ReservdL);
	}

	public void setIp65504P256ReservdL(int number) {
	    number = checkIp65504P256ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P256ReservdL((short)number);
	}
	public void setIp65504P256ReservdL(long number) {
	    number = checkIp65504P256ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P256ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P257ReservdS
	 *	@return ip65504P257ReservdS
	 */
	public short getIp65504P257ReservdS() throws CFException {
        if (isIp65504P257ReservdSModified()) { 
           ip65504P257ReservdS = refreshIp65504P257ReservdS();
        }
   		return ip65504P257ReservdS;
	}
	
	/**
	 * 	Update Ip65504P257ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P257-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P257ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P257ReservdS = checkIp65504P257ReservdSMaxLimit(number); 
		serializeIp65504P257ReservdS(ip65504P257ReservdS);
	}

	public void setIp65504P257ReservdS(int number) {
	    number = checkIp65504P257ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P257ReservdS((short)number);
	}
	public void setIp65504P257ReservdS(long number) {
	    number = checkIp65504P257ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P257ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P257ReservdL
	 *	@return ip65504P257ReservdL
	 */
	public short getIp65504P257ReservdL() throws CFException {
        if (isIp65504P257ReservdLModified()) { 
           ip65504P257ReservdL = refreshIp65504P257ReservdL();
        }
   		return ip65504P257ReservdL;
	}
	
	/**
	 * 	Update Ip65504P257ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P257-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P257ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P257ReservdL = checkIp65504P257ReservdLMaxLimit(number); 
		serializeIp65504P257ReservdL(ip65504P257ReservdL);
	}

	public void setIp65504P257ReservdL(int number) {
	    number = checkIp65504P257ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P257ReservdL((short)number);
	}
	public void setIp65504P257ReservdL(long number) {
	    number = checkIp65504P257ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P257ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P258ReservdS
	 *	@return ip65504P258ReservdS
	 */
	public short getIp65504P258ReservdS() throws CFException {
        if (isIp65504P258ReservdSModified()) { 
           ip65504P258ReservdS = refreshIp65504P258ReservdS();
        }
   		return ip65504P258ReservdS;
	}
	
	/**
	 * 	Update Ip65504P258ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P258-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P258ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P258ReservdS = checkIp65504P258ReservdSMaxLimit(number); 
		serializeIp65504P258ReservdS(ip65504P258ReservdS);
	}

	public void setIp65504P258ReservdS(int number) {
	    number = checkIp65504P258ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P258ReservdS((short)number);
	}
	public void setIp65504P258ReservdS(long number) {
	    number = checkIp65504P258ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P258ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P258ReservdL
	 *	@return ip65504P258ReservdL
	 */
	public short getIp65504P258ReservdL() throws CFException {
        if (isIp65504P258ReservdLModified()) { 
           ip65504P258ReservdL = refreshIp65504P258ReservdL();
        }
   		return ip65504P258ReservdL;
	}
	
	/**
	 * 	Update Ip65504P258ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P258-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P258ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P258ReservdL = checkIp65504P258ReservdLMaxLimit(number); 
		serializeIp65504P258ReservdL(ip65504P258ReservdL);
	}

	public void setIp65504P258ReservdL(int number) {
	    number = checkIp65504P258ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P258ReservdL((short)number);
	}
	public void setIp65504P258ReservdL(long number) {
	    number = checkIp65504P258ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P258ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P259ReservdS
	 *	@return ip65504P259ReservdS
	 */
	public short getIp65504P259ReservdS() throws CFException {
        if (isIp65504P259ReservdSModified()) { 
           ip65504P259ReservdS = refreshIp65504P259ReservdS();
        }
   		return ip65504P259ReservdS;
	}
	
	/**
	 * 	Update Ip65504P259ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P259-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P259ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P259ReservdS = checkIp65504P259ReservdSMaxLimit(number); 
		serializeIp65504P259ReservdS(ip65504P259ReservdS);
	}

	public void setIp65504P259ReservdS(int number) {
	    number = checkIp65504P259ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P259ReservdS((short)number);
	}
	public void setIp65504P259ReservdS(long number) {
	    number = checkIp65504P259ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P259ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P259ReservdL
	 *	@return ip65504P259ReservdL
	 */
	public short getIp65504P259ReservdL() throws CFException {
        if (isIp65504P259ReservdLModified()) { 
           ip65504P259ReservdL = refreshIp65504P259ReservdL();
        }
   		return ip65504P259ReservdL;
	}
	
	/**
	 * 	Update Ip65504P259ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P259-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P259ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P259ReservdL = checkIp65504P259ReservdLMaxLimit(number); 
		serializeIp65504P259ReservdL(ip65504P259ReservdL);
	}

	public void setIp65504P259ReservdL(int number) {
	    number = checkIp65504P259ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P259ReservdL((short)number);
	}
	public void setIp65504P259ReservdL(long number) {
	    number = checkIp65504P259ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P259ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P260EdExclS
	 *	@return ip65504P260EdExclS
	 */
	public short getIp65504P260EdExclS() throws CFException {
        if (isIp65504P260EdExclSModified()) { 
           ip65504P260EdExclS = refreshIp65504P260EdExclS();
        }
   		return ip65504P260EdExclS;
	}
	
	/**
	 * 	Update Ip65504P260EdExclS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P260-ED-EXCL-S
	 *	@param number
	 */
	public void setIp65504P260EdExclS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P260EdExclS = checkIp65504P260EdExclSMaxLimit(number); 
		serializeIp65504P260EdExclS(ip65504P260EdExclS);
	}

	public void setIp65504P260EdExclS(int number) {
	    number = checkIp65504P260EdExclSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P260EdExclS((short)number);
	}
	public void setIp65504P260EdExclS(long number) {
	    number = checkIp65504P260EdExclSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P260EdExclS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P260EdExclL
	 *	@return ip65504P260EdExclL
	 */
	public short getIp65504P260EdExclL() throws CFException {
        if (isIp65504P260EdExclLModified()) { 
           ip65504P260EdExclL = refreshIp65504P260EdExclL();
        }
   		return ip65504P260EdExclL;
	}
	
	/**
	 * 	Update Ip65504P260EdExclL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P260-ED-EXCL-L
	 *	@param number
	 */
	public void setIp65504P260EdExclL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P260EdExclL = checkIp65504P260EdExclLMaxLimit(number); 
		serializeIp65504P260EdExclL(ip65504P260EdExclL);
	}

	public void setIp65504P260EdExclL(int number) {
	    number = checkIp65504P260EdExclLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P260EdExclL((short)number);
	}
	public void setIp65504P260EdExclL(long number) {
	    number = checkIp65504P260EdExclLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P260EdExclL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P261FrdTypS
	 *	@return ip65504P261FrdTypS
	 */
	public short getIp65504P261FrdTypS() throws CFException {
        if (isIp65504P261FrdTypSModified()) { 
           ip65504P261FrdTypS = refreshIp65504P261FrdTypS();
        }
   		return ip65504P261FrdTypS;
	}
	
	/**
	 * 	Update Ip65504P261FrdTypS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P261-FRD-TYP-S
	 *	@param number
	 */
	public void setIp65504P261FrdTypS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P261FrdTypS = checkIp65504P261FrdTypSMaxLimit(number); 
		serializeIp65504P261FrdTypS(ip65504P261FrdTypS);
	}

	public void setIp65504P261FrdTypS(int number) {
	    number = checkIp65504P261FrdTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P261FrdTypS((short)number);
	}
	public void setIp65504P261FrdTypS(long number) {
	    number = checkIp65504P261FrdTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P261FrdTypS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P261FrdTypL
	 *	@return ip65504P261FrdTypL
	 */
	public short getIp65504P261FrdTypL() throws CFException {
        if (isIp65504P261FrdTypLModified()) { 
           ip65504P261FrdTypL = refreshIp65504P261FrdTypL();
        }
   		return ip65504P261FrdTypL;
	}
	
	/**
	 * 	Update Ip65504P261FrdTypL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P261-FRD-TYP-L
	 *	@param number
	 */
	public void setIp65504P261FrdTypL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P261FrdTypL = checkIp65504P261FrdTypLMaxLimit(number); 
		serializeIp65504P261FrdTypL(ip65504P261FrdTypL);
	}

	public void setIp65504P261FrdTypL(int number) {
	    number = checkIp65504P261FrdTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P261FrdTypL((short)number);
	}
	public void setIp65504P261FrdTypL(long number) {
	    number = checkIp65504P261FrdTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P261FrdTypL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P262DocIndS
	 *	@return ip65504P262DocIndS
	 */
	public short getIp65504P262DocIndS() throws CFException {
        if (isIp65504P262DocIndSModified()) { 
           ip65504P262DocIndS = refreshIp65504P262DocIndS();
        }
   		return ip65504P262DocIndS;
	}
	
	/**
	 * 	Update Ip65504P262DocIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P262-DOC-IND-S
	 *	@param number
	 */
	public void setIp65504P262DocIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P262DocIndS = checkIp65504P262DocIndSMaxLimit(number); 
		serializeIp65504P262DocIndS(ip65504P262DocIndS);
	}

	public void setIp65504P262DocIndS(int number) {
	    number = checkIp65504P262DocIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P262DocIndS((short)number);
	}
	public void setIp65504P262DocIndS(long number) {
	    number = checkIp65504P262DocIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P262DocIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P262DocIndL
	 *	@return ip65504P262DocIndL
	 */
	public short getIp65504P262DocIndL() throws CFException {
        if (isIp65504P262DocIndLModified()) { 
           ip65504P262DocIndL = refreshIp65504P262DocIndL();
        }
   		return ip65504P262DocIndL;
	}
	
	/**
	 * 	Update Ip65504P262DocIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P262-DOC-IND-L
	 *	@param number
	 */
	public void setIp65504P262DocIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P262DocIndL = checkIp65504P262DocIndLMaxLimit(number); 
		serializeIp65504P262DocIndL(ip65504P262DocIndL);
	}

	public void setIp65504P262DocIndL(int number) {
	    number = checkIp65504P262DocIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P262DocIndL((short)number);
	}
	public void setIp65504P262DocIndL(long number) {
	    number = checkIp65504P262DocIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P262DocIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P263OrigCdS
	 *	@return ip65504P263OrigCdS
	 */
	public short getIp65504P263OrigCdS() throws CFException {
        if (isIp65504P263OrigCdSModified()) { 
           ip65504P263OrigCdS = refreshIp65504P263OrigCdS();
        }
   		return ip65504P263OrigCdS;
	}
	
	/**
	 * 	Update Ip65504P263OrigCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P263-ORIG-CD-S
	 *	@param number
	 */
	public void setIp65504P263OrigCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P263OrigCdS = checkIp65504P263OrigCdSMaxLimit(number); 
		serializeIp65504P263OrigCdS(ip65504P263OrigCdS);
	}

	public void setIp65504P263OrigCdS(int number) {
	    number = checkIp65504P263OrigCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P263OrigCdS((short)number);
	}
	public void setIp65504P263OrigCdS(long number) {
	    number = checkIp65504P263OrigCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P263OrigCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P263OrigCdL
	 *	@return ip65504P263OrigCdL
	 */
	public short getIp65504P263OrigCdL() throws CFException {
        if (isIp65504P263OrigCdLModified()) { 
           ip65504P263OrigCdL = refreshIp65504P263OrigCdL();
        }
   		return ip65504P263OrigCdL;
	}
	
	/**
	 * 	Update Ip65504P263OrigCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P263-ORIG-CD-L
	 *	@param number
	 */
	public void setIp65504P263OrigCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P263OrigCdL = checkIp65504P263OrigCdLMaxLimit(number); 
		serializeIp65504P263OrigCdL(ip65504P263OrigCdL);
	}

	public void setIp65504P263OrigCdL(int number) {
	    number = checkIp65504P263OrigCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P263OrigCdL((short)number);
	}
	public void setIp65504P263OrigCdL(long number) {
	    number = checkIp65504P263OrigCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P263OrigCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P264OrgReaS
	 *	@return ip65504P264OrgReaS
	 */
	public short getIp65504P264OrgReaS() throws CFException {
        if (isIp65504P264OrgReaSModified()) { 
           ip65504P264OrgReaS = refreshIp65504P264OrgReaS();
        }
   		return ip65504P264OrgReaS;
	}
	
	/**
	 * 	Update Ip65504P264OrgReaS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P264-ORG-REA-S
	 *	@param number
	 */
	public void setIp65504P264OrgReaS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P264OrgReaS = checkIp65504P264OrgReaSMaxLimit(number); 
		serializeIp65504P264OrgReaS(ip65504P264OrgReaS);
	}

	public void setIp65504P264OrgReaS(int number) {
	    number = checkIp65504P264OrgReaSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P264OrgReaS((short)number);
	}
	public void setIp65504P264OrgReaS(long number) {
	    number = checkIp65504P264OrgReaSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P264OrgReaS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P264OrgReaL
	 *	@return ip65504P264OrgReaL
	 */
	public short getIp65504P264OrgReaL() throws CFException {
        if (isIp65504P264OrgReaLModified()) { 
           ip65504P264OrgReaL = refreshIp65504P264OrgReaL();
        }
   		return ip65504P264OrgReaL;
	}
	
	/**
	 * 	Update Ip65504P264OrgReaL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P264-ORG-REA-L
	 *	@param number
	 */
	public void setIp65504P264OrgReaL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P264OrgReaL = checkIp65504P264OrgReaLMaxLimit(number); 
		serializeIp65504P264OrgReaL(ip65504P264OrgReaL);
	}

	public void setIp65504P264OrgReaL(int number) {
	    number = checkIp65504P264OrgReaLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P264OrgReaL((short)number);
	}
	public void setIp65504P264OrgReaL(long number) {
	    number = checkIp65504P264OrgReaLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P264OrgReaL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P265IntPreS
	 *	@return ip65504P265IntPreS
	 */
	public short getIp65504P265IntPreS() throws CFException {
        if (isIp65504P265IntPreSModified()) { 
           ip65504P265IntPreS = refreshIp65504P265IntPreS();
        }
   		return ip65504P265IntPreS;
	}
	
	/**
	 * 	Update Ip65504P265IntPreS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P265-INT-PRE-S
	 *	@param number
	 */
	public void setIp65504P265IntPreS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P265IntPreS = checkIp65504P265IntPreSMaxLimit(number); 
		serializeIp65504P265IntPreS(ip65504P265IntPreS);
	}

	public void setIp65504P265IntPreS(int number) {
	    number = checkIp65504P265IntPreSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P265IntPreS((short)number);
	}
	public void setIp65504P265IntPreS(long number) {
	    number = checkIp65504P265IntPreSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P265IntPreS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P265IntPreL
	 *	@return ip65504P265IntPreL
	 */
	public short getIp65504P265IntPreL() throws CFException {
        if (isIp65504P265IntPreLModified()) { 
           ip65504P265IntPreL = refreshIp65504P265IntPreL();
        }
   		return ip65504P265IntPreL;
	}
	
	/**
	 * 	Update Ip65504P265IntPreL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P265-INT-PRE-L
	 *	@param number
	 */
	public void setIp65504P265IntPreL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P265IntPreL = checkIp65504P265IntPreLMaxLimit(number); 
		serializeIp65504P265IntPreL(ip65504P265IntPreL);
	}

	public void setIp65504P265IntPreL(int number) {
	    number = checkIp65504P265IntPreLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P265IntPreL((short)number);
	}
	public void setIp65504P265IntPreL(long number) {
	    number = checkIp65504P265IntPreLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P265IntPreL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2661stCbkS
	 *	@return ip65504P2661stCbkS
	 */
	public short getIp65504P2661stCbkS() throws CFException {
        if (isIp65504P2661stCbkSModified()) { 
           ip65504P2661stCbkS = refreshIp65504P2661stCbkS();
        }
   		return ip65504P2661stCbkS;
	}
	
	/**
	 * 	Update Ip65504P2661stCbkS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P266-1ST-CBK-S
	 *	@param number
	 */
	public void setIp65504P2661stCbkS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2661stCbkS = checkIp65504P2661stCbkSMaxLimit(number); 
		serializeIp65504P2661stCbkS(ip65504P2661stCbkS);
	}

	public void setIp65504P2661stCbkS(int number) {
	    number = checkIp65504P2661stCbkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2661stCbkS((short)number);
	}
	public void setIp65504P2661stCbkS(long number) {
	    number = checkIp65504P2661stCbkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2661stCbkS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2661stCbkL
	 *	@return ip65504P2661stCbkL
	 */
	public short getIp65504P2661stCbkL() throws CFException {
        if (isIp65504P2661stCbkLModified()) { 
           ip65504P2661stCbkL = refreshIp65504P2661stCbkL();
        }
   		return ip65504P2661stCbkL;
	}
	
	/**
	 * 	Update Ip65504P2661stCbkL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P266-1ST-CBK-L
	 *	@param number
	 */
	public void setIp65504P2661stCbkL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2661stCbkL = checkIp65504P2661stCbkLMaxLimit(number); 
		serializeIp65504P2661stCbkL(ip65504P2661stCbkL);
	}

	public void setIp65504P2661stCbkL(int number) {
	    number = checkIp65504P2661stCbkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2661stCbkL((short)number);
	}
	public void setIp65504P2661stCbkL(long number) {
	    number = checkIp65504P2661stCbkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2661stCbkL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2672ndPreS
	 *	@return ip65504P2672ndPreS
	 */
	public short getIp65504P2672ndPreS() throws CFException {
        if (isIp65504P2672ndPreSModified()) { 
           ip65504P2672ndPreS = refreshIp65504P2672ndPreS();
        }
   		return ip65504P2672ndPreS;
	}
	
	/**
	 * 	Update Ip65504P2672ndPreS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P267-2ND-PRE-S
	 *	@param number
	 */
	public void setIp65504P2672ndPreS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2672ndPreS = checkIp65504P2672ndPreSMaxLimit(number); 
		serializeIp65504P2672ndPreS(ip65504P2672ndPreS);
	}

	public void setIp65504P2672ndPreS(int number) {
	    number = checkIp65504P2672ndPreSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2672ndPreS((short)number);
	}
	public void setIp65504P2672ndPreS(long number) {
	    number = checkIp65504P2672ndPreSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2672ndPreS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2672ndPreL
	 *	@return ip65504P2672ndPreL
	 */
	public short getIp65504P2672ndPreL() throws CFException {
        if (isIp65504P2672ndPreLModified()) { 
           ip65504P2672ndPreL = refreshIp65504P2672ndPreL();
        }
   		return ip65504P2672ndPreL;
	}
	
	/**
	 * 	Update Ip65504P2672ndPreL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P267-2ND-PRE-L
	 *	@param number
	 */
	public void setIp65504P2672ndPreL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2672ndPreL = checkIp65504P2672ndPreLMaxLimit(number); 
		serializeIp65504P2672ndPreL(ip65504P2672ndPreL);
	}

	public void setIp65504P2672ndPreL(int number) {
	    number = checkIp65504P2672ndPreLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2672ndPreL((short)number);
	}
	public void setIp65504P2672ndPreL(long number) {
	    number = checkIp65504P2672ndPreLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2672ndPreL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P268PtlAmtS
	 *	@return ip65504P268PtlAmtS
	 */
	public short getIp65504P268PtlAmtS() throws CFException {
        if (isIp65504P268PtlAmtSModified()) { 
           ip65504P268PtlAmtS = refreshIp65504P268PtlAmtS();
        }
   		return ip65504P268PtlAmtS;
	}
	
	/**
	 * 	Update Ip65504P268PtlAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P268-PTL-AMT-S
	 *	@param number
	 */
	public void setIp65504P268PtlAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P268PtlAmtS = checkIp65504P268PtlAmtSMaxLimit(number); 
		serializeIp65504P268PtlAmtS(ip65504P268PtlAmtS);
	}

	public void setIp65504P268PtlAmtS(int number) {
	    number = checkIp65504P268PtlAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P268PtlAmtS((short)number);
	}
	public void setIp65504P268PtlAmtS(long number) {
	    number = checkIp65504P268PtlAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P268PtlAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P268PtlAmtL
	 *	@return ip65504P268PtlAmtL
	 */
	public short getIp65504P268PtlAmtL() throws CFException {
        if (isIp65504P268PtlAmtLModified()) { 
           ip65504P268PtlAmtL = refreshIp65504P268PtlAmtL();
        }
   		return ip65504P268PtlAmtL;
	}
	
	/**
	 * 	Update Ip65504P268PtlAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P268-PTL-AMT-L
	 *	@param number
	 */
	public void setIp65504P268PtlAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P268PtlAmtL = checkIp65504P268PtlAmtLMaxLimit(number); 
		serializeIp65504P268PtlAmtL(ip65504P268PtlAmtL);
	}

	public void setIp65504P268PtlAmtL(int number) {
	    number = checkIp65504P268PtlAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P268PtlAmtL((short)number);
	}
	public void setIp65504P268PtlAmtL(long number) {
	    number = checkIp65504P268PtlAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P268PtlAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P269ReservdS
	 *	@return ip65504P269ReservdS
	 */
	public short getIp65504P269ReservdS() throws CFException {
        if (isIp65504P269ReservdSModified()) { 
           ip65504P269ReservdS = refreshIp65504P269ReservdS();
        }
   		return ip65504P269ReservdS;
	}
	
	/**
	 * 	Update Ip65504P269ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P269-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P269ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P269ReservdS = checkIp65504P269ReservdSMaxLimit(number); 
		serializeIp65504P269ReservdS(ip65504P269ReservdS);
	}

	public void setIp65504P269ReservdS(int number) {
	    number = checkIp65504P269ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P269ReservdS((short)number);
	}
	public void setIp65504P269ReservdS(long number) {
	    number = checkIp65504P269ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P269ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P269ReservdL
	 *	@return ip65504P269ReservdL
	 */
	public short getIp65504P269ReservdL() throws CFException {
        if (isIp65504P269ReservdLModified()) { 
           ip65504P269ReservdL = refreshIp65504P269ReservdL();
        }
   		return ip65504P269ReservdL;
	}
	
	/**
	 * 	Update Ip65504P269ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P269-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P269ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P269ReservdL = checkIp65504P269ReservdLMaxLimit(number); 
		serializeIp65504P269ReservdL(ip65504P269ReservdL);
	}

	public void setIp65504P269ReservdL(int number) {
	    number = checkIp65504P269ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P269ReservdL((short)number);
	}
	public void setIp65504P269ReservdL(long number) {
	    number = checkIp65504P269ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P269ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P270ReservdS
	 *	@return ip65504P270ReservdS
	 */
	public short getIp65504P270ReservdS() throws CFException {
        if (isIp65504P270ReservdSModified()) { 
           ip65504P270ReservdS = refreshIp65504P270ReservdS();
        }
   		return ip65504P270ReservdS;
	}
	
	/**
	 * 	Update Ip65504P270ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P270-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P270ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P270ReservdS = checkIp65504P270ReservdSMaxLimit(number); 
		serializeIp65504P270ReservdS(ip65504P270ReservdS);
	}

	public void setIp65504P270ReservdS(int number) {
	    number = checkIp65504P270ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P270ReservdS((short)number);
	}
	public void setIp65504P270ReservdS(long number) {
	    number = checkIp65504P270ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P270ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P270ReservdL
	 *	@return ip65504P270ReservdL
	 */
	public short getIp65504P270ReservdL() throws CFException {
        if (isIp65504P270ReservdLModified()) { 
           ip65504P270ReservdL = refreshIp65504P270ReservdL();
        }
   		return ip65504P270ReservdL;
	}
	
	/**
	 * 	Update Ip65504P270ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P270-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P270ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P270ReservdL = checkIp65504P270ReservdLMaxLimit(number); 
		serializeIp65504P270ReservdL(ip65504P270ReservdL);
	}

	public void setIp65504P270ReservdL(int number) {
	    number = checkIp65504P270ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P270ReservdL((short)number);
	}
	public void setIp65504P270ReservdL(long number) {
	    number = checkIp65504P270ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P270ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P271ReservdS
	 *	@return ip65504P271ReservdS
	 */
	public short getIp65504P271ReservdS() throws CFException {
        if (isIp65504P271ReservdSModified()) { 
           ip65504P271ReservdS = refreshIp65504P271ReservdS();
        }
   		return ip65504P271ReservdS;
	}
	
	/**
	 * 	Update Ip65504P271ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P271-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P271ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P271ReservdS = checkIp65504P271ReservdSMaxLimit(number); 
		serializeIp65504P271ReservdS(ip65504P271ReservdS);
	}

	public void setIp65504P271ReservdS(int number) {
	    number = checkIp65504P271ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P271ReservdS((short)number);
	}
	public void setIp65504P271ReservdS(long number) {
	    number = checkIp65504P271ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P271ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P271ReservdL
	 *	@return ip65504P271ReservdL
	 */
	public short getIp65504P271ReservdL() throws CFException {
        if (isIp65504P271ReservdLModified()) { 
           ip65504P271ReservdL = refreshIp65504P271ReservdL();
        }
   		return ip65504P271ReservdL;
	}
	
	/**
	 * 	Update Ip65504P271ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P271-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P271ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P271ReservdL = checkIp65504P271ReservdLMaxLimit(number); 
		serializeIp65504P271ReservdL(ip65504P271ReservdL);
	}

	public void setIp65504P271ReservdL(int number) {
	    number = checkIp65504P271ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P271ReservdL((short)number);
	}
	public void setIp65504P271ReservdL(long number) {
	    number = checkIp65504P271ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P271ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P272ReservdS
	 *	@return ip65504P272ReservdS
	 */
	public short getIp65504P272ReservdS() throws CFException {
        if (isIp65504P272ReservdSModified()) { 
           ip65504P272ReservdS = refreshIp65504P272ReservdS();
        }
   		return ip65504P272ReservdS;
	}
	
	/**
	 * 	Update Ip65504P272ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P272-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P272ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P272ReservdS = checkIp65504P272ReservdSMaxLimit(number); 
		serializeIp65504P272ReservdS(ip65504P272ReservdS);
	}

	public void setIp65504P272ReservdS(int number) {
	    number = checkIp65504P272ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P272ReservdS((short)number);
	}
	public void setIp65504P272ReservdS(long number) {
	    number = checkIp65504P272ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P272ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P272ReservdL
	 *	@return ip65504P272ReservdL
	 */
	public short getIp65504P272ReservdL() throws CFException {
        if (isIp65504P272ReservdLModified()) { 
           ip65504P272ReservdL = refreshIp65504P272ReservdL();
        }
   		return ip65504P272ReservdL;
	}
	
	/**
	 * 	Update Ip65504P272ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P272-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P272ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P272ReservdL = checkIp65504P272ReservdLMaxLimit(number); 
		serializeIp65504P272ReservdL(ip65504P272ReservdL);
	}

	public void setIp65504P272ReservdL(int number) {
	    number = checkIp65504P272ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P272ReservdL((short)number);
	}
	public void setIp65504P272ReservdL(long number) {
	    number = checkIp65504P272ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P272ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P273ReservdS
	 *	@return ip65504P273ReservdS
	 */
	public short getIp65504P273ReservdS() throws CFException {
        if (isIp65504P273ReservdSModified()) { 
           ip65504P273ReservdS = refreshIp65504P273ReservdS();
        }
   		return ip65504P273ReservdS;
	}
	
	/**
	 * 	Update Ip65504P273ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P273-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P273ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P273ReservdS = checkIp65504P273ReservdSMaxLimit(number); 
		serializeIp65504P273ReservdS(ip65504P273ReservdS);
	}

	public void setIp65504P273ReservdS(int number) {
	    number = checkIp65504P273ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P273ReservdS((short)number);
	}
	public void setIp65504P273ReservdS(long number) {
	    number = checkIp65504P273ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P273ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P273ReservdL
	 *	@return ip65504P273ReservdL
	 */
	public short getIp65504P273ReservdL() throws CFException {
        if (isIp65504P273ReservdLModified()) { 
           ip65504P273ReservdL = refreshIp65504P273ReservdL();
        }
   		return ip65504P273ReservdL;
	}
	
	/**
	 * 	Update Ip65504P273ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P273-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P273ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P273ReservdL = checkIp65504P273ReservdLMaxLimit(number); 
		serializeIp65504P273ReservdL(ip65504P273ReservdL);
	}

	public void setIp65504P273ReservdL(int number) {
	    number = checkIp65504P273ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P273ReservdL((short)number);
	}
	public void setIp65504P273ReservdL(long number) {
	    number = checkIp65504P273ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P273ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P274ReservdS
	 *	@return ip65504P274ReservdS
	 */
	public short getIp65504P274ReservdS() throws CFException {
        if (isIp65504P274ReservdSModified()) { 
           ip65504P274ReservdS = refreshIp65504P274ReservdS();
        }
   		return ip65504P274ReservdS;
	}
	
	/**
	 * 	Update Ip65504P274ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P274-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P274ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P274ReservdS = checkIp65504P274ReservdSMaxLimit(number); 
		serializeIp65504P274ReservdS(ip65504P274ReservdS);
	}

	public void setIp65504P274ReservdS(int number) {
	    number = checkIp65504P274ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P274ReservdS((short)number);
	}
	public void setIp65504P274ReservdS(long number) {
	    number = checkIp65504P274ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P274ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P274ReservdL
	 *	@return ip65504P274ReservdL
	 */
	public short getIp65504P274ReservdL() throws CFException {
        if (isIp65504P274ReservdLModified()) { 
           ip65504P274ReservdL = refreshIp65504P274ReservdL();
        }
   		return ip65504P274ReservdL;
	}
	
	/**
	 * 	Update Ip65504P274ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P274-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P274ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P274ReservdL = checkIp65504P274ReservdLMaxLimit(number); 
		serializeIp65504P274ReservdL(ip65504P274ReservdL);
	}

	public void setIp65504P274ReservdL(int number) {
	    number = checkIp65504P274ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P274ReservdL((short)number);
	}
	public void setIp65504P274ReservdL(long number) {
	    number = checkIp65504P274ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P274ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P275ReservdS
	 *	@return ip65504P275ReservdS
	 */
	public short getIp65504P275ReservdS() throws CFException {
        if (isIp65504P275ReservdSModified()) { 
           ip65504P275ReservdS = refreshIp65504P275ReservdS();
        }
   		return ip65504P275ReservdS;
	}
	
	/**
	 * 	Update Ip65504P275ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P275-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P275ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P275ReservdS = checkIp65504P275ReservdSMaxLimit(number); 
		serializeIp65504P275ReservdS(ip65504P275ReservdS);
	}

	public void setIp65504P275ReservdS(int number) {
	    number = checkIp65504P275ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P275ReservdS((short)number);
	}
	public void setIp65504P275ReservdS(long number) {
	    number = checkIp65504P275ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P275ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P275ReservdL
	 *	@return ip65504P275ReservdL
	 */
	public short getIp65504P275ReservdL() throws CFException {
        if (isIp65504P275ReservdLModified()) { 
           ip65504P275ReservdL = refreshIp65504P275ReservdL();
        }
   		return ip65504P275ReservdL;
	}
	
	/**
	 * 	Update Ip65504P275ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P275-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P275ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P275ReservdL = checkIp65504P275ReservdLMaxLimit(number); 
		serializeIp65504P275ReservdL(ip65504P275ReservdL);
	}

	public void setIp65504P275ReservdL(int number) {
	    number = checkIp65504P275ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P275ReservdL((short)number);
	}
	public void setIp65504P275ReservdL(long number) {
	    number = checkIp65504P275ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P275ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P276ReservdS
	 *	@return ip65504P276ReservdS
	 */
	public short getIp65504P276ReservdS() throws CFException {
        if (isIp65504P276ReservdSModified()) { 
           ip65504P276ReservdS = refreshIp65504P276ReservdS();
        }
   		return ip65504P276ReservdS;
	}
	
	/**
	 * 	Update Ip65504P276ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P276-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P276ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P276ReservdS = checkIp65504P276ReservdSMaxLimit(number); 
		serializeIp65504P276ReservdS(ip65504P276ReservdS);
	}

	public void setIp65504P276ReservdS(int number) {
	    number = checkIp65504P276ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P276ReservdS((short)number);
	}
	public void setIp65504P276ReservdS(long number) {
	    number = checkIp65504P276ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P276ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P276ReservdL
	 *	@return ip65504P276ReservdL
	 */
	public short getIp65504P276ReservdL() throws CFException {
        if (isIp65504P276ReservdLModified()) { 
           ip65504P276ReservdL = refreshIp65504P276ReservdL();
        }
   		return ip65504P276ReservdL;
	}
	
	/**
	 * 	Update Ip65504P276ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P276-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P276ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P276ReservdL = checkIp65504P276ReservdLMaxLimit(number); 
		serializeIp65504P276ReservdL(ip65504P276ReservdL);
	}

	public void setIp65504P276ReservdL(int number) {
	    number = checkIp65504P276ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P276ReservdL((short)number);
	}
	public void setIp65504P276ReservdL(long number) {
	    number = checkIp65504P276ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P276ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P277ReservdS
	 *	@return ip65504P277ReservdS
	 */
	public short getIp65504P277ReservdS() throws CFException {
        if (isIp65504P277ReservdSModified()) { 
           ip65504P277ReservdS = refreshIp65504P277ReservdS();
        }
   		return ip65504P277ReservdS;
	}
	
	/**
	 * 	Update Ip65504P277ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P277-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P277ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P277ReservdS = checkIp65504P277ReservdSMaxLimit(number); 
		serializeIp65504P277ReservdS(ip65504P277ReservdS);
	}

	public void setIp65504P277ReservdS(int number) {
	    number = checkIp65504P277ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P277ReservdS((short)number);
	}
	public void setIp65504P277ReservdS(long number) {
	    number = checkIp65504P277ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P277ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P277ReservdL
	 *	@return ip65504P277ReservdL
	 */
	public short getIp65504P277ReservdL() throws CFException {
        if (isIp65504P277ReservdLModified()) { 
           ip65504P277ReservdL = refreshIp65504P277ReservdL();
        }
   		return ip65504P277ReservdL;
	}
	
	/**
	 * 	Update Ip65504P277ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P277-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P277ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P277ReservdL = checkIp65504P277ReservdLMaxLimit(number); 
		serializeIp65504P277ReservdL(ip65504P277ReservdL);
	}

	public void setIp65504P277ReservdL(int number) {
	    number = checkIp65504P277ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P277ReservdL((short)number);
	}
	public void setIp65504P277ReservdL(long number) {
	    number = checkIp65504P277ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P277ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P278ReservdS
	 *	@return ip65504P278ReservdS
	 */
	public short getIp65504P278ReservdS() throws CFException {
        if (isIp65504P278ReservdSModified()) { 
           ip65504P278ReservdS = refreshIp65504P278ReservdS();
        }
   		return ip65504P278ReservdS;
	}
	
	/**
	 * 	Update Ip65504P278ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P278-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P278ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P278ReservdS = checkIp65504P278ReservdSMaxLimit(number); 
		serializeIp65504P278ReservdS(ip65504P278ReservdS);
	}

	public void setIp65504P278ReservdS(int number) {
	    number = checkIp65504P278ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P278ReservdS((short)number);
	}
	public void setIp65504P278ReservdS(long number) {
	    number = checkIp65504P278ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P278ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P278ReservdL
	 *	@return ip65504P278ReservdL
	 */
	public short getIp65504P278ReservdL() throws CFException {
        if (isIp65504P278ReservdLModified()) { 
           ip65504P278ReservdL = refreshIp65504P278ReservdL();
        }
   		return ip65504P278ReservdL;
	}
	
	/**
	 * 	Update Ip65504P278ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P278-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P278ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P278ReservdL = checkIp65504P278ReservdLMaxLimit(number); 
		serializeIp65504P278ReservdL(ip65504P278ReservdL);
	}

	public void setIp65504P278ReservdL(int number) {
	    number = checkIp65504P278ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P278ReservdL((short)number);
	}
	public void setIp65504P278ReservdL(long number) {
	    number = checkIp65504P278ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P278ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P279ReservdS
	 *	@return ip65504P279ReservdS
	 */
	public short getIp65504P279ReservdS() throws CFException {
        if (isIp65504P279ReservdSModified()) { 
           ip65504P279ReservdS = refreshIp65504P279ReservdS();
        }
   		return ip65504P279ReservdS;
	}
	
	/**
	 * 	Update Ip65504P279ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P279-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P279ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P279ReservdS = checkIp65504P279ReservdSMaxLimit(number); 
		serializeIp65504P279ReservdS(ip65504P279ReservdS);
	}

	public void setIp65504P279ReservdS(int number) {
	    number = checkIp65504P279ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P279ReservdS((short)number);
	}
	public void setIp65504P279ReservdS(long number) {
	    number = checkIp65504P279ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P279ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P279ReservdL
	 *	@return ip65504P279ReservdL
	 */
	public short getIp65504P279ReservdL() throws CFException {
        if (isIp65504P279ReservdLModified()) { 
           ip65504P279ReservdL = refreshIp65504P279ReservdL();
        }
   		return ip65504P279ReservdL;
	}
	
	/**
	 * 	Update Ip65504P279ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P279-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P279ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P279ReservdL = checkIp65504P279ReservdLMaxLimit(number); 
		serializeIp65504P279ReservdL(ip65504P279ReservdL);
	}

	public void setIp65504P279ReservdL(int number) {
	    number = checkIp65504P279ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P279ReservdL((short)number);
	}
	public void setIp65504P279ReservdL(long number) {
	    number = checkIp65504P279ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P279ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup9
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P249ReservdS((short)0);
         	setIp65504P249ReservdL((short)0);
         	setIp65504P250ReservdS((short)0);
         	setIp65504P250ReservdL((short)0);
         	setIp65504P251FeeBasS((short)0);
         	setIp65504P251FeeBasL((short)0);
         	setIp65504P252ReservdS((short)0);
         	setIp65504P252ReservdL((short)0);
         	setIp65504P253ReservdS((short)0);
         	setIp65504P253ReservdL((short)0);
         	setIp65504P254ReservdS((short)0);
         	setIp65504P254ReservdL((short)0);
         	setIp65504P255ReservdS((short)0);
         	setIp65504P255ReservdL((short)0);
         	setIp65504P256ReservdS((short)0);
         	setIp65504P256ReservdL((short)0);
         	setIp65504P257ReservdS((short)0);
         	setIp65504P257ReservdL((short)0);
         	setIp65504P258ReservdS((short)0);
         	setIp65504P258ReservdL((short)0);
         	setIp65504P259ReservdS((short)0);
         	setIp65504P259ReservdL((short)0);
         	setIp65504P260EdExclS((short)0);
         	setIp65504P260EdExclL((short)0);
         	setIp65504P261FrdTypS((short)0);
         	setIp65504P261FrdTypL((short)0);
         	setIp65504P262DocIndS((short)0);
         	setIp65504P262DocIndL((short)0);
         	setIp65504P263OrigCdS((short)0);
         	setIp65504P263OrigCdL((short)0);
         	setIp65504P264OrgReaS((short)0);
         	setIp65504P264OrgReaL((short)0);
         	setIp65504P265IntPreS((short)0);
         	setIp65504P265IntPreL((short)0);
         	setIp65504P2661stCbkS((short)0);
         	setIp65504P2661stCbkL((short)0);
         	setIp65504P2672ndPreS((short)0);
         	setIp65504P2672ndPreL((short)0);
         	setIp65504P268PtlAmtS((short)0);
         	setIp65504P268PtlAmtL((short)0);
         	setIp65504P269ReservdS((short)0);
         	setIp65504P269ReservdL((short)0);
         	setIp65504P270ReservdS((short)0);
         	setIp65504P270ReservdL((short)0);
         	setIp65504P271ReservdS((short)0);
         	setIp65504P271ReservdL((short)0);
         	setIp65504P272ReservdS((short)0);
         	setIp65504P272ReservdL((short)0);
         	setIp65504P273ReservdS((short)0);
         	setIp65504P273ReservdL((short)0);
         	setIp65504P274ReservdS((short)0);
         	setIp65504P274ReservdL((short)0);
         	setIp65504P275ReservdS((short)0);
         	setIp65504P275ReservdL((short)0);
         	setIp65504P276ReservdS((short)0);
         	setIp65504P276ReservdL((short)0);
         	setIp65504P277ReservdS((short)0);
         	setIp65504P277ReservdL((short)0);
         	setIp65504P278ReservdS((short)0);
         	setIp65504P278ReservdL((short)0);
         	setIp65504P279ReservdS((short)0);
         	setIp65504P279ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup9FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_9_LENGTH;
		}

}
  
