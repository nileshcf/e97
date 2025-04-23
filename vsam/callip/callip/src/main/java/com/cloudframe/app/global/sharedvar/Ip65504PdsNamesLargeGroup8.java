package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup8 extends Ip65504PdsNamesLargeGroup8Serialized { 
   

								private short ip65504P218ReservdS;

								private short ip65504P218ReservdL;


								private short ip65504P219ReservdS;

								private short ip65504P219ReservdL;


								private short ip65504P220ReservdS;

								private short ip65504P220ReservdL;


								private short ip65504P221ReservdS;

								private short ip65504P221ReservdL;


								private short ip65504P222ReservdS;

								private short ip65504P222ReservdL;


								private short ip65504P223ReservdS;

								private short ip65504P223ReservdL;


								private short ip65504P224ReservdS;

								private short ip65504P224ReservdL;


								private short ip65504P225CovacctS;

								private short ip65504P225CovacctL;


								private short ip65504P226ReservdS;

								private short ip65504P226ReservdL;


								private short ip65504P227ReservdS;

								private short ip65504P227ReservdL;


								private short ip65504P228RetrCdS;

								private short ip65504P228RetrCdL;


								private short ip65504P229ReservdS;

								private short ip65504P229ReservdL;


								private short ip65504P230FfillcdS;

								private short ip65504P230FfillcdL;


								private short ip65504P231ReservdS;

								private short ip65504P231ReservdL;


								private short ip65504P232ReservdS;

								private short ip65504P232ReservdL;


								private short ip65504P233ReservdS;

								private short ip65504P233ReservdL;


								private short ip65504P234ReservdS;

								private short ip65504P234ReservdL;


								private short ip65504P235ReservdS;

								private short ip65504P235ReservdL;


								private short ip65504P236ReservdS;

								private short ip65504P236ReservdL;


								private short ip65504P237ReservdS;

								private short ip65504P237ReservdL;


								private short ip65504P238ReservdS;

								private short ip65504P238ReservdL;


								private short ip65504P239ReservdS;

								private short ip65504P239ReservdL;


								private short ip65504P240ReservdS;

								private short ip65504P240ReservdL;


								private short ip65504P241McmNbrS;

								private short ip65504P241McmNbrL;


								private short ip65504P242McmIndS;

								private short ip65504P242McmIndL;


								private short ip65504P243McmRspS;

								private short ip65504P243McmRspL;


								private short ip65504P244McmcbdtS;

								private short ip65504P244McmcbdtL;


								private short ip65504P245ReservdS;

								private short ip65504P245ReservdL;


								private short ip65504P246ReservdS;

								private short ip65504P246ReservdL;


								private short ip65504P247ReservdS;

								private short ip65504P247ReservdL;


								private short ip65504P248ReservdS;

								private short ip65504P248ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup8
	**/
    public Ip65504PdsNamesLargeGroup8() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup8. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup8(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P218ReservdS
	 *	@return ip65504P218ReservdS
	 */
	public short getIp65504P218ReservdS() throws CFException {
        if (isIp65504P218ReservdSModified()) { 
           ip65504P218ReservdS = refreshIp65504P218ReservdS();
        }
   		return ip65504P218ReservdS;
	}
	
	/**
	 * 	Update Ip65504P218ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P218-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P218ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P218ReservdS = checkIp65504P218ReservdSMaxLimit(number); 
		serializeIp65504P218ReservdS(ip65504P218ReservdS);
	}

	public void setIp65504P218ReservdS(int number) {
	    number = checkIp65504P218ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P218ReservdS((short)number);
	}
	public void setIp65504P218ReservdS(long number) {
	    number = checkIp65504P218ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P218ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P218ReservdL
	 *	@return ip65504P218ReservdL
	 */
	public short getIp65504P218ReservdL() throws CFException {
        if (isIp65504P218ReservdLModified()) { 
           ip65504P218ReservdL = refreshIp65504P218ReservdL();
        }
   		return ip65504P218ReservdL;
	}
	
	/**
	 * 	Update Ip65504P218ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P218-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P218ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P218ReservdL = checkIp65504P218ReservdLMaxLimit(number); 
		serializeIp65504P218ReservdL(ip65504P218ReservdL);
	}

	public void setIp65504P218ReservdL(int number) {
	    number = checkIp65504P218ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P218ReservdL((short)number);
	}
	public void setIp65504P218ReservdL(long number) {
	    number = checkIp65504P218ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P218ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P219ReservdS
	 *	@return ip65504P219ReservdS
	 */
	public short getIp65504P219ReservdS() throws CFException {
        if (isIp65504P219ReservdSModified()) { 
           ip65504P219ReservdS = refreshIp65504P219ReservdS();
        }
   		return ip65504P219ReservdS;
	}
	
	/**
	 * 	Update Ip65504P219ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P219-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P219ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P219ReservdS = checkIp65504P219ReservdSMaxLimit(number); 
		serializeIp65504P219ReservdS(ip65504P219ReservdS);
	}

	public void setIp65504P219ReservdS(int number) {
	    number = checkIp65504P219ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P219ReservdS((short)number);
	}
	public void setIp65504P219ReservdS(long number) {
	    number = checkIp65504P219ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P219ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P219ReservdL
	 *	@return ip65504P219ReservdL
	 */
	public short getIp65504P219ReservdL() throws CFException {
        if (isIp65504P219ReservdLModified()) { 
           ip65504P219ReservdL = refreshIp65504P219ReservdL();
        }
   		return ip65504P219ReservdL;
	}
	
	/**
	 * 	Update Ip65504P219ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P219-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P219ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P219ReservdL = checkIp65504P219ReservdLMaxLimit(number); 
		serializeIp65504P219ReservdL(ip65504P219ReservdL);
	}

	public void setIp65504P219ReservdL(int number) {
	    number = checkIp65504P219ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P219ReservdL((short)number);
	}
	public void setIp65504P219ReservdL(long number) {
	    number = checkIp65504P219ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P219ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P220ReservdS
	 *	@return ip65504P220ReservdS
	 */
	public short getIp65504P220ReservdS() throws CFException {
        if (isIp65504P220ReservdSModified()) { 
           ip65504P220ReservdS = refreshIp65504P220ReservdS();
        }
   		return ip65504P220ReservdS;
	}
	
	/**
	 * 	Update Ip65504P220ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P220-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P220ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P220ReservdS = checkIp65504P220ReservdSMaxLimit(number); 
		serializeIp65504P220ReservdS(ip65504P220ReservdS);
	}

	public void setIp65504P220ReservdS(int number) {
	    number = checkIp65504P220ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P220ReservdS((short)number);
	}
	public void setIp65504P220ReservdS(long number) {
	    number = checkIp65504P220ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P220ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P220ReservdL
	 *	@return ip65504P220ReservdL
	 */
	public short getIp65504P220ReservdL() throws CFException {
        if (isIp65504P220ReservdLModified()) { 
           ip65504P220ReservdL = refreshIp65504P220ReservdL();
        }
   		return ip65504P220ReservdL;
	}
	
	/**
	 * 	Update Ip65504P220ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P220-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P220ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P220ReservdL = checkIp65504P220ReservdLMaxLimit(number); 
		serializeIp65504P220ReservdL(ip65504P220ReservdL);
	}

	public void setIp65504P220ReservdL(int number) {
	    number = checkIp65504P220ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P220ReservdL((short)number);
	}
	public void setIp65504P220ReservdL(long number) {
	    number = checkIp65504P220ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P220ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P221ReservdS
	 *	@return ip65504P221ReservdS
	 */
	public short getIp65504P221ReservdS() throws CFException {
        if (isIp65504P221ReservdSModified()) { 
           ip65504P221ReservdS = refreshIp65504P221ReservdS();
        }
   		return ip65504P221ReservdS;
	}
	
	/**
	 * 	Update Ip65504P221ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P221-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P221ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P221ReservdS = checkIp65504P221ReservdSMaxLimit(number); 
		serializeIp65504P221ReservdS(ip65504P221ReservdS);
	}

	public void setIp65504P221ReservdS(int number) {
	    number = checkIp65504P221ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P221ReservdS((short)number);
	}
	public void setIp65504P221ReservdS(long number) {
	    number = checkIp65504P221ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P221ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P221ReservdL
	 *	@return ip65504P221ReservdL
	 */
	public short getIp65504P221ReservdL() throws CFException {
        if (isIp65504P221ReservdLModified()) { 
           ip65504P221ReservdL = refreshIp65504P221ReservdL();
        }
   		return ip65504P221ReservdL;
	}
	
	/**
	 * 	Update Ip65504P221ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P221-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P221ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P221ReservdL = checkIp65504P221ReservdLMaxLimit(number); 
		serializeIp65504P221ReservdL(ip65504P221ReservdL);
	}

	public void setIp65504P221ReservdL(int number) {
	    number = checkIp65504P221ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P221ReservdL((short)number);
	}
	public void setIp65504P221ReservdL(long number) {
	    number = checkIp65504P221ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P221ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P222ReservdS
	 *	@return ip65504P222ReservdS
	 */
	public short getIp65504P222ReservdS() throws CFException {
        if (isIp65504P222ReservdSModified()) { 
           ip65504P222ReservdS = refreshIp65504P222ReservdS();
        }
   		return ip65504P222ReservdS;
	}
	
	/**
	 * 	Update Ip65504P222ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P222-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P222ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P222ReservdS = checkIp65504P222ReservdSMaxLimit(number); 
		serializeIp65504P222ReservdS(ip65504P222ReservdS);
	}

	public void setIp65504P222ReservdS(int number) {
	    number = checkIp65504P222ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P222ReservdS((short)number);
	}
	public void setIp65504P222ReservdS(long number) {
	    number = checkIp65504P222ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P222ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P222ReservdL
	 *	@return ip65504P222ReservdL
	 */
	public short getIp65504P222ReservdL() throws CFException {
        if (isIp65504P222ReservdLModified()) { 
           ip65504P222ReservdL = refreshIp65504P222ReservdL();
        }
   		return ip65504P222ReservdL;
	}
	
	/**
	 * 	Update Ip65504P222ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P222-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P222ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P222ReservdL = checkIp65504P222ReservdLMaxLimit(number); 
		serializeIp65504P222ReservdL(ip65504P222ReservdL);
	}

	public void setIp65504P222ReservdL(int number) {
	    number = checkIp65504P222ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P222ReservdL((short)number);
	}
	public void setIp65504P222ReservdL(long number) {
	    number = checkIp65504P222ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P222ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P223ReservdS
	 *	@return ip65504P223ReservdS
	 */
	public short getIp65504P223ReservdS() throws CFException {
        if (isIp65504P223ReservdSModified()) { 
           ip65504P223ReservdS = refreshIp65504P223ReservdS();
        }
   		return ip65504P223ReservdS;
	}
	
	/**
	 * 	Update Ip65504P223ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P223-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P223ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P223ReservdS = checkIp65504P223ReservdSMaxLimit(number); 
		serializeIp65504P223ReservdS(ip65504P223ReservdS);
	}

	public void setIp65504P223ReservdS(int number) {
	    number = checkIp65504P223ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P223ReservdS((short)number);
	}
	public void setIp65504P223ReservdS(long number) {
	    number = checkIp65504P223ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P223ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P223ReservdL
	 *	@return ip65504P223ReservdL
	 */
	public short getIp65504P223ReservdL() throws CFException {
        if (isIp65504P223ReservdLModified()) { 
           ip65504P223ReservdL = refreshIp65504P223ReservdL();
        }
   		return ip65504P223ReservdL;
	}
	
	/**
	 * 	Update Ip65504P223ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P223-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P223ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P223ReservdL = checkIp65504P223ReservdLMaxLimit(number); 
		serializeIp65504P223ReservdL(ip65504P223ReservdL);
	}

	public void setIp65504P223ReservdL(int number) {
	    number = checkIp65504P223ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P223ReservdL((short)number);
	}
	public void setIp65504P223ReservdL(long number) {
	    number = checkIp65504P223ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P223ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P224ReservdS
	 *	@return ip65504P224ReservdS
	 */
	public short getIp65504P224ReservdS() throws CFException {
        if (isIp65504P224ReservdSModified()) { 
           ip65504P224ReservdS = refreshIp65504P224ReservdS();
        }
   		return ip65504P224ReservdS;
	}
	
	/**
	 * 	Update Ip65504P224ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P224-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P224ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P224ReservdS = checkIp65504P224ReservdSMaxLimit(number); 
		serializeIp65504P224ReservdS(ip65504P224ReservdS);
	}

	public void setIp65504P224ReservdS(int number) {
	    number = checkIp65504P224ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P224ReservdS((short)number);
	}
	public void setIp65504P224ReservdS(long number) {
	    number = checkIp65504P224ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P224ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P224ReservdL
	 *	@return ip65504P224ReservdL
	 */
	public short getIp65504P224ReservdL() throws CFException {
        if (isIp65504P224ReservdLModified()) { 
           ip65504P224ReservdL = refreshIp65504P224ReservdL();
        }
   		return ip65504P224ReservdL;
	}
	
	/**
	 * 	Update Ip65504P224ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P224-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P224ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P224ReservdL = checkIp65504P224ReservdLMaxLimit(number); 
		serializeIp65504P224ReservdL(ip65504P224ReservdL);
	}

	public void setIp65504P224ReservdL(int number) {
	    number = checkIp65504P224ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P224ReservdL((short)number);
	}
	public void setIp65504P224ReservdL(long number) {
	    number = checkIp65504P224ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P224ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P225CovacctS
	 *	@return ip65504P225CovacctS
	 */
	public short getIp65504P225CovacctS() throws CFException {
        if (isIp65504P225CovacctSModified()) { 
           ip65504P225CovacctS = refreshIp65504P225CovacctS();
        }
   		return ip65504P225CovacctS;
	}
	
	/**
	 * 	Update Ip65504P225CovacctS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P225-COVACCT-S
	 *	@param number
	 */
	public void setIp65504P225CovacctS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P225CovacctS = checkIp65504P225CovacctSMaxLimit(number); 
		serializeIp65504P225CovacctS(ip65504P225CovacctS);
	}

	public void setIp65504P225CovacctS(int number) {
	    number = checkIp65504P225CovacctSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P225CovacctS((short)number);
	}
	public void setIp65504P225CovacctS(long number) {
	    number = checkIp65504P225CovacctSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P225CovacctS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P225CovacctL
	 *	@return ip65504P225CovacctL
	 */
	public short getIp65504P225CovacctL() throws CFException {
        if (isIp65504P225CovacctLModified()) { 
           ip65504P225CovacctL = refreshIp65504P225CovacctL();
        }
   		return ip65504P225CovacctL;
	}
	
	/**
	 * 	Update Ip65504P225CovacctL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P225-COVACCT-L
	 *	@param number
	 */
	public void setIp65504P225CovacctL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P225CovacctL = checkIp65504P225CovacctLMaxLimit(number); 
		serializeIp65504P225CovacctL(ip65504P225CovacctL);
	}

	public void setIp65504P225CovacctL(int number) {
	    number = checkIp65504P225CovacctLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P225CovacctL((short)number);
	}
	public void setIp65504P225CovacctL(long number) {
	    number = checkIp65504P225CovacctLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P225CovacctL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P226ReservdS
	 *	@return ip65504P226ReservdS
	 */
	public short getIp65504P226ReservdS() throws CFException {
        if (isIp65504P226ReservdSModified()) { 
           ip65504P226ReservdS = refreshIp65504P226ReservdS();
        }
   		return ip65504P226ReservdS;
	}
	
	/**
	 * 	Update Ip65504P226ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P226-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P226ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P226ReservdS = checkIp65504P226ReservdSMaxLimit(number); 
		serializeIp65504P226ReservdS(ip65504P226ReservdS);
	}

	public void setIp65504P226ReservdS(int number) {
	    number = checkIp65504P226ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P226ReservdS((short)number);
	}
	public void setIp65504P226ReservdS(long number) {
	    number = checkIp65504P226ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P226ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P226ReservdL
	 *	@return ip65504P226ReservdL
	 */
	public short getIp65504P226ReservdL() throws CFException {
        if (isIp65504P226ReservdLModified()) { 
           ip65504P226ReservdL = refreshIp65504P226ReservdL();
        }
   		return ip65504P226ReservdL;
	}
	
	/**
	 * 	Update Ip65504P226ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P226-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P226ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P226ReservdL = checkIp65504P226ReservdLMaxLimit(number); 
		serializeIp65504P226ReservdL(ip65504P226ReservdL);
	}

	public void setIp65504P226ReservdL(int number) {
	    number = checkIp65504P226ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P226ReservdL((short)number);
	}
	public void setIp65504P226ReservdL(long number) {
	    number = checkIp65504P226ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P226ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P227ReservdS
	 *	@return ip65504P227ReservdS
	 */
	public short getIp65504P227ReservdS() throws CFException {
        if (isIp65504P227ReservdSModified()) { 
           ip65504P227ReservdS = refreshIp65504P227ReservdS();
        }
   		return ip65504P227ReservdS;
	}
	
	/**
	 * 	Update Ip65504P227ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P227-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P227ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P227ReservdS = checkIp65504P227ReservdSMaxLimit(number); 
		serializeIp65504P227ReservdS(ip65504P227ReservdS);
	}

	public void setIp65504P227ReservdS(int number) {
	    number = checkIp65504P227ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P227ReservdS((short)number);
	}
	public void setIp65504P227ReservdS(long number) {
	    number = checkIp65504P227ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P227ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P227ReservdL
	 *	@return ip65504P227ReservdL
	 */
	public short getIp65504P227ReservdL() throws CFException {
        if (isIp65504P227ReservdLModified()) { 
           ip65504P227ReservdL = refreshIp65504P227ReservdL();
        }
   		return ip65504P227ReservdL;
	}
	
	/**
	 * 	Update Ip65504P227ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P227-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P227ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P227ReservdL = checkIp65504P227ReservdLMaxLimit(number); 
		serializeIp65504P227ReservdL(ip65504P227ReservdL);
	}

	public void setIp65504P227ReservdL(int number) {
	    number = checkIp65504P227ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P227ReservdL((short)number);
	}
	public void setIp65504P227ReservdL(long number) {
	    number = checkIp65504P227ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P227ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P228RetrCdS
	 *	@return ip65504P228RetrCdS
	 */
	public short getIp65504P228RetrCdS() throws CFException {
        if (isIp65504P228RetrCdSModified()) { 
           ip65504P228RetrCdS = refreshIp65504P228RetrCdS();
        }
   		return ip65504P228RetrCdS;
	}
	
	/**
	 * 	Update Ip65504P228RetrCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P228-RETR-CD-S
	 *	@param number
	 */
	public void setIp65504P228RetrCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P228RetrCdS = checkIp65504P228RetrCdSMaxLimit(number); 
		serializeIp65504P228RetrCdS(ip65504P228RetrCdS);
	}

	public void setIp65504P228RetrCdS(int number) {
	    number = checkIp65504P228RetrCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P228RetrCdS((short)number);
	}
	public void setIp65504P228RetrCdS(long number) {
	    number = checkIp65504P228RetrCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P228RetrCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P228RetrCdL
	 *	@return ip65504P228RetrCdL
	 */
	public short getIp65504P228RetrCdL() throws CFException {
        if (isIp65504P228RetrCdLModified()) { 
           ip65504P228RetrCdL = refreshIp65504P228RetrCdL();
        }
   		return ip65504P228RetrCdL;
	}
	
	/**
	 * 	Update Ip65504P228RetrCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P228-RETR-CD-L
	 *	@param number
	 */
	public void setIp65504P228RetrCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P228RetrCdL = checkIp65504P228RetrCdLMaxLimit(number); 
		serializeIp65504P228RetrCdL(ip65504P228RetrCdL);
	}

	public void setIp65504P228RetrCdL(int number) {
	    number = checkIp65504P228RetrCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P228RetrCdL((short)number);
	}
	public void setIp65504P228RetrCdL(long number) {
	    number = checkIp65504P228RetrCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P228RetrCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P229ReservdS
	 *	@return ip65504P229ReservdS
	 */
	public short getIp65504P229ReservdS() throws CFException {
        if (isIp65504P229ReservdSModified()) { 
           ip65504P229ReservdS = refreshIp65504P229ReservdS();
        }
   		return ip65504P229ReservdS;
	}
	
	/**
	 * 	Update Ip65504P229ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P229-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P229ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P229ReservdS = checkIp65504P229ReservdSMaxLimit(number); 
		serializeIp65504P229ReservdS(ip65504P229ReservdS);
	}

	public void setIp65504P229ReservdS(int number) {
	    number = checkIp65504P229ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P229ReservdS((short)number);
	}
	public void setIp65504P229ReservdS(long number) {
	    number = checkIp65504P229ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P229ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P229ReservdL
	 *	@return ip65504P229ReservdL
	 */
	public short getIp65504P229ReservdL() throws CFException {
        if (isIp65504P229ReservdLModified()) { 
           ip65504P229ReservdL = refreshIp65504P229ReservdL();
        }
   		return ip65504P229ReservdL;
	}
	
	/**
	 * 	Update Ip65504P229ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P229-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P229ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P229ReservdL = checkIp65504P229ReservdLMaxLimit(number); 
		serializeIp65504P229ReservdL(ip65504P229ReservdL);
	}

	public void setIp65504P229ReservdL(int number) {
	    number = checkIp65504P229ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P229ReservdL((short)number);
	}
	public void setIp65504P229ReservdL(long number) {
	    number = checkIp65504P229ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P229ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P230FfillcdS
	 *	@return ip65504P230FfillcdS
	 */
	public short getIp65504P230FfillcdS() throws CFException {
        if (isIp65504P230FfillcdSModified()) { 
           ip65504P230FfillcdS = refreshIp65504P230FfillcdS();
        }
   		return ip65504P230FfillcdS;
	}
	
	/**
	 * 	Update Ip65504P230FfillcdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P230-FFILLCD-S
	 *	@param number
	 */
	public void setIp65504P230FfillcdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P230FfillcdS = checkIp65504P230FfillcdSMaxLimit(number); 
		serializeIp65504P230FfillcdS(ip65504P230FfillcdS);
	}

	public void setIp65504P230FfillcdS(int number) {
	    number = checkIp65504P230FfillcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P230FfillcdS((short)number);
	}
	public void setIp65504P230FfillcdS(long number) {
	    number = checkIp65504P230FfillcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P230FfillcdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P230FfillcdL
	 *	@return ip65504P230FfillcdL
	 */
	public short getIp65504P230FfillcdL() throws CFException {
        if (isIp65504P230FfillcdLModified()) { 
           ip65504P230FfillcdL = refreshIp65504P230FfillcdL();
        }
   		return ip65504P230FfillcdL;
	}
	
	/**
	 * 	Update Ip65504P230FfillcdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P230-FFILLCD-L
	 *	@param number
	 */
	public void setIp65504P230FfillcdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P230FfillcdL = checkIp65504P230FfillcdLMaxLimit(number); 
		serializeIp65504P230FfillcdL(ip65504P230FfillcdL);
	}

	public void setIp65504P230FfillcdL(int number) {
	    number = checkIp65504P230FfillcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P230FfillcdL((short)number);
	}
	public void setIp65504P230FfillcdL(long number) {
	    number = checkIp65504P230FfillcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P230FfillcdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P231ReservdS
	 *	@return ip65504P231ReservdS
	 */
	public short getIp65504P231ReservdS() throws CFException {
        if (isIp65504P231ReservdSModified()) { 
           ip65504P231ReservdS = refreshIp65504P231ReservdS();
        }
   		return ip65504P231ReservdS;
	}
	
	/**
	 * 	Update Ip65504P231ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P231-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P231ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P231ReservdS = checkIp65504P231ReservdSMaxLimit(number); 
		serializeIp65504P231ReservdS(ip65504P231ReservdS);
	}

	public void setIp65504P231ReservdS(int number) {
	    number = checkIp65504P231ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P231ReservdS((short)number);
	}
	public void setIp65504P231ReservdS(long number) {
	    number = checkIp65504P231ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P231ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P231ReservdL
	 *	@return ip65504P231ReservdL
	 */
	public short getIp65504P231ReservdL() throws CFException {
        if (isIp65504P231ReservdLModified()) { 
           ip65504P231ReservdL = refreshIp65504P231ReservdL();
        }
   		return ip65504P231ReservdL;
	}
	
	/**
	 * 	Update Ip65504P231ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P231-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P231ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P231ReservdL = checkIp65504P231ReservdLMaxLimit(number); 
		serializeIp65504P231ReservdL(ip65504P231ReservdL);
	}

	public void setIp65504P231ReservdL(int number) {
	    number = checkIp65504P231ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P231ReservdL((short)number);
	}
	public void setIp65504P231ReservdL(long number) {
	    number = checkIp65504P231ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P231ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P232ReservdS
	 *	@return ip65504P232ReservdS
	 */
	public short getIp65504P232ReservdS() throws CFException {
        if (isIp65504P232ReservdSModified()) { 
           ip65504P232ReservdS = refreshIp65504P232ReservdS();
        }
   		return ip65504P232ReservdS;
	}
	
	/**
	 * 	Update Ip65504P232ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P232-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P232ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P232ReservdS = checkIp65504P232ReservdSMaxLimit(number); 
		serializeIp65504P232ReservdS(ip65504P232ReservdS);
	}

	public void setIp65504P232ReservdS(int number) {
	    number = checkIp65504P232ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P232ReservdS((short)number);
	}
	public void setIp65504P232ReservdS(long number) {
	    number = checkIp65504P232ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P232ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P232ReservdL
	 *	@return ip65504P232ReservdL
	 */
	public short getIp65504P232ReservdL() throws CFException {
        if (isIp65504P232ReservdLModified()) { 
           ip65504P232ReservdL = refreshIp65504P232ReservdL();
        }
   		return ip65504P232ReservdL;
	}
	
	/**
	 * 	Update Ip65504P232ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P232-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P232ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P232ReservdL = checkIp65504P232ReservdLMaxLimit(number); 
		serializeIp65504P232ReservdL(ip65504P232ReservdL);
	}

	public void setIp65504P232ReservdL(int number) {
	    number = checkIp65504P232ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P232ReservdL((short)number);
	}
	public void setIp65504P232ReservdL(long number) {
	    number = checkIp65504P232ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P232ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P233ReservdS
	 *	@return ip65504P233ReservdS
	 */
	public short getIp65504P233ReservdS() throws CFException {
        if (isIp65504P233ReservdSModified()) { 
           ip65504P233ReservdS = refreshIp65504P233ReservdS();
        }
   		return ip65504P233ReservdS;
	}
	
	/**
	 * 	Update Ip65504P233ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P233-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P233ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P233ReservdS = checkIp65504P233ReservdSMaxLimit(number); 
		serializeIp65504P233ReservdS(ip65504P233ReservdS);
	}

	public void setIp65504P233ReservdS(int number) {
	    number = checkIp65504P233ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P233ReservdS((short)number);
	}
	public void setIp65504P233ReservdS(long number) {
	    number = checkIp65504P233ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P233ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P233ReservdL
	 *	@return ip65504P233ReservdL
	 */
	public short getIp65504P233ReservdL() throws CFException {
        if (isIp65504P233ReservdLModified()) { 
           ip65504P233ReservdL = refreshIp65504P233ReservdL();
        }
   		return ip65504P233ReservdL;
	}
	
	/**
	 * 	Update Ip65504P233ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P233-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P233ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P233ReservdL = checkIp65504P233ReservdLMaxLimit(number); 
		serializeIp65504P233ReservdL(ip65504P233ReservdL);
	}

	public void setIp65504P233ReservdL(int number) {
	    number = checkIp65504P233ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P233ReservdL((short)number);
	}
	public void setIp65504P233ReservdL(long number) {
	    number = checkIp65504P233ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P233ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P234ReservdS
	 *	@return ip65504P234ReservdS
	 */
	public short getIp65504P234ReservdS() throws CFException {
        if (isIp65504P234ReservdSModified()) { 
           ip65504P234ReservdS = refreshIp65504P234ReservdS();
        }
   		return ip65504P234ReservdS;
	}
	
	/**
	 * 	Update Ip65504P234ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P234-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P234ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P234ReservdS = checkIp65504P234ReservdSMaxLimit(number); 
		serializeIp65504P234ReservdS(ip65504P234ReservdS);
	}

	public void setIp65504P234ReservdS(int number) {
	    number = checkIp65504P234ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P234ReservdS((short)number);
	}
	public void setIp65504P234ReservdS(long number) {
	    number = checkIp65504P234ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P234ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P234ReservdL
	 *	@return ip65504P234ReservdL
	 */
	public short getIp65504P234ReservdL() throws CFException {
        if (isIp65504P234ReservdLModified()) { 
           ip65504P234ReservdL = refreshIp65504P234ReservdL();
        }
   		return ip65504P234ReservdL;
	}
	
	/**
	 * 	Update Ip65504P234ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P234-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P234ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P234ReservdL = checkIp65504P234ReservdLMaxLimit(number); 
		serializeIp65504P234ReservdL(ip65504P234ReservdL);
	}

	public void setIp65504P234ReservdL(int number) {
	    number = checkIp65504P234ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P234ReservdL((short)number);
	}
	public void setIp65504P234ReservdL(long number) {
	    number = checkIp65504P234ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P234ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P235ReservdS
	 *	@return ip65504P235ReservdS
	 */
	public short getIp65504P235ReservdS() throws CFException {
        if (isIp65504P235ReservdSModified()) { 
           ip65504P235ReservdS = refreshIp65504P235ReservdS();
        }
   		return ip65504P235ReservdS;
	}
	
	/**
	 * 	Update Ip65504P235ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P235-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P235ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P235ReservdS = checkIp65504P235ReservdSMaxLimit(number); 
		serializeIp65504P235ReservdS(ip65504P235ReservdS);
	}

	public void setIp65504P235ReservdS(int number) {
	    number = checkIp65504P235ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P235ReservdS((short)number);
	}
	public void setIp65504P235ReservdS(long number) {
	    number = checkIp65504P235ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P235ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P235ReservdL
	 *	@return ip65504P235ReservdL
	 */
	public short getIp65504P235ReservdL() throws CFException {
        if (isIp65504P235ReservdLModified()) { 
           ip65504P235ReservdL = refreshIp65504P235ReservdL();
        }
   		return ip65504P235ReservdL;
	}
	
	/**
	 * 	Update Ip65504P235ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P235-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P235ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P235ReservdL = checkIp65504P235ReservdLMaxLimit(number); 
		serializeIp65504P235ReservdL(ip65504P235ReservdL);
	}

	public void setIp65504P235ReservdL(int number) {
	    number = checkIp65504P235ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P235ReservdL((short)number);
	}
	public void setIp65504P235ReservdL(long number) {
	    number = checkIp65504P235ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P235ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P236ReservdS
	 *	@return ip65504P236ReservdS
	 */
	public short getIp65504P236ReservdS() throws CFException {
        if (isIp65504P236ReservdSModified()) { 
           ip65504P236ReservdS = refreshIp65504P236ReservdS();
        }
   		return ip65504P236ReservdS;
	}
	
	/**
	 * 	Update Ip65504P236ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P236-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P236ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P236ReservdS = checkIp65504P236ReservdSMaxLimit(number); 
		serializeIp65504P236ReservdS(ip65504P236ReservdS);
	}

	public void setIp65504P236ReservdS(int number) {
	    number = checkIp65504P236ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P236ReservdS((short)number);
	}
	public void setIp65504P236ReservdS(long number) {
	    number = checkIp65504P236ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P236ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P236ReservdL
	 *	@return ip65504P236ReservdL
	 */
	public short getIp65504P236ReservdL() throws CFException {
        if (isIp65504P236ReservdLModified()) { 
           ip65504P236ReservdL = refreshIp65504P236ReservdL();
        }
   		return ip65504P236ReservdL;
	}
	
	/**
	 * 	Update Ip65504P236ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P236-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P236ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P236ReservdL = checkIp65504P236ReservdLMaxLimit(number); 
		serializeIp65504P236ReservdL(ip65504P236ReservdL);
	}

	public void setIp65504P236ReservdL(int number) {
	    number = checkIp65504P236ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P236ReservdL((short)number);
	}
	public void setIp65504P236ReservdL(long number) {
	    number = checkIp65504P236ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P236ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P237ReservdS
	 *	@return ip65504P237ReservdS
	 */
	public short getIp65504P237ReservdS() throws CFException {
        if (isIp65504P237ReservdSModified()) { 
           ip65504P237ReservdS = refreshIp65504P237ReservdS();
        }
   		return ip65504P237ReservdS;
	}
	
	/**
	 * 	Update Ip65504P237ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P237-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P237ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P237ReservdS = checkIp65504P237ReservdSMaxLimit(number); 
		serializeIp65504P237ReservdS(ip65504P237ReservdS);
	}

	public void setIp65504P237ReservdS(int number) {
	    number = checkIp65504P237ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P237ReservdS((short)number);
	}
	public void setIp65504P237ReservdS(long number) {
	    number = checkIp65504P237ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P237ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P237ReservdL
	 *	@return ip65504P237ReservdL
	 */
	public short getIp65504P237ReservdL() throws CFException {
        if (isIp65504P237ReservdLModified()) { 
           ip65504P237ReservdL = refreshIp65504P237ReservdL();
        }
   		return ip65504P237ReservdL;
	}
	
	/**
	 * 	Update Ip65504P237ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P237-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P237ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P237ReservdL = checkIp65504P237ReservdLMaxLimit(number); 
		serializeIp65504P237ReservdL(ip65504P237ReservdL);
	}

	public void setIp65504P237ReservdL(int number) {
	    number = checkIp65504P237ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P237ReservdL((short)number);
	}
	public void setIp65504P237ReservdL(long number) {
	    number = checkIp65504P237ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P237ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P238ReservdS
	 *	@return ip65504P238ReservdS
	 */
	public short getIp65504P238ReservdS() throws CFException {
        if (isIp65504P238ReservdSModified()) { 
           ip65504P238ReservdS = refreshIp65504P238ReservdS();
        }
   		return ip65504P238ReservdS;
	}
	
	/**
	 * 	Update Ip65504P238ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P238-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P238ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P238ReservdS = checkIp65504P238ReservdSMaxLimit(number); 
		serializeIp65504P238ReservdS(ip65504P238ReservdS);
	}

	public void setIp65504P238ReservdS(int number) {
	    number = checkIp65504P238ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P238ReservdS((short)number);
	}
	public void setIp65504P238ReservdS(long number) {
	    number = checkIp65504P238ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P238ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P238ReservdL
	 *	@return ip65504P238ReservdL
	 */
	public short getIp65504P238ReservdL() throws CFException {
        if (isIp65504P238ReservdLModified()) { 
           ip65504P238ReservdL = refreshIp65504P238ReservdL();
        }
   		return ip65504P238ReservdL;
	}
	
	/**
	 * 	Update Ip65504P238ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P238-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P238ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P238ReservdL = checkIp65504P238ReservdLMaxLimit(number); 
		serializeIp65504P238ReservdL(ip65504P238ReservdL);
	}

	public void setIp65504P238ReservdL(int number) {
	    number = checkIp65504P238ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P238ReservdL((short)number);
	}
	public void setIp65504P238ReservdL(long number) {
	    number = checkIp65504P238ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P238ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P239ReservdS
	 *	@return ip65504P239ReservdS
	 */
	public short getIp65504P239ReservdS() throws CFException {
        if (isIp65504P239ReservdSModified()) { 
           ip65504P239ReservdS = refreshIp65504P239ReservdS();
        }
   		return ip65504P239ReservdS;
	}
	
	/**
	 * 	Update Ip65504P239ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P239-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P239ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P239ReservdS = checkIp65504P239ReservdSMaxLimit(number); 
		serializeIp65504P239ReservdS(ip65504P239ReservdS);
	}

	public void setIp65504P239ReservdS(int number) {
	    number = checkIp65504P239ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P239ReservdS((short)number);
	}
	public void setIp65504P239ReservdS(long number) {
	    number = checkIp65504P239ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P239ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P239ReservdL
	 *	@return ip65504P239ReservdL
	 */
	public short getIp65504P239ReservdL() throws CFException {
        if (isIp65504P239ReservdLModified()) { 
           ip65504P239ReservdL = refreshIp65504P239ReservdL();
        }
   		return ip65504P239ReservdL;
	}
	
	/**
	 * 	Update Ip65504P239ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P239-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P239ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P239ReservdL = checkIp65504P239ReservdLMaxLimit(number); 
		serializeIp65504P239ReservdL(ip65504P239ReservdL);
	}

	public void setIp65504P239ReservdL(int number) {
	    number = checkIp65504P239ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P239ReservdL((short)number);
	}
	public void setIp65504P239ReservdL(long number) {
	    number = checkIp65504P239ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P239ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P240ReservdS
	 *	@return ip65504P240ReservdS
	 */
	public short getIp65504P240ReservdS() throws CFException {
        if (isIp65504P240ReservdSModified()) { 
           ip65504P240ReservdS = refreshIp65504P240ReservdS();
        }
   		return ip65504P240ReservdS;
	}
	
	/**
	 * 	Update Ip65504P240ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P240-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P240ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P240ReservdS = checkIp65504P240ReservdSMaxLimit(number); 
		serializeIp65504P240ReservdS(ip65504P240ReservdS);
	}

	public void setIp65504P240ReservdS(int number) {
	    number = checkIp65504P240ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P240ReservdS((short)number);
	}
	public void setIp65504P240ReservdS(long number) {
	    number = checkIp65504P240ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P240ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P240ReservdL
	 *	@return ip65504P240ReservdL
	 */
	public short getIp65504P240ReservdL() throws CFException {
        if (isIp65504P240ReservdLModified()) { 
           ip65504P240ReservdL = refreshIp65504P240ReservdL();
        }
   		return ip65504P240ReservdL;
	}
	
	/**
	 * 	Update Ip65504P240ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P240-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P240ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P240ReservdL = checkIp65504P240ReservdLMaxLimit(number); 
		serializeIp65504P240ReservdL(ip65504P240ReservdL);
	}

	public void setIp65504P240ReservdL(int number) {
	    number = checkIp65504P240ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P240ReservdL((short)number);
	}
	public void setIp65504P240ReservdL(long number) {
	    number = checkIp65504P240ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P240ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P241McmNbrS
	 *	@return ip65504P241McmNbrS
	 */
	public short getIp65504P241McmNbrS() throws CFException {
        if (isIp65504P241McmNbrSModified()) { 
           ip65504P241McmNbrS = refreshIp65504P241McmNbrS();
        }
   		return ip65504P241McmNbrS;
	}
	
	/**
	 * 	Update Ip65504P241McmNbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P241-MCM-NBR-S
	 *	@param number
	 */
	public void setIp65504P241McmNbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P241McmNbrS = checkIp65504P241McmNbrSMaxLimit(number); 
		serializeIp65504P241McmNbrS(ip65504P241McmNbrS);
	}

	public void setIp65504P241McmNbrS(int number) {
	    number = checkIp65504P241McmNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P241McmNbrS((short)number);
	}
	public void setIp65504P241McmNbrS(long number) {
	    number = checkIp65504P241McmNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P241McmNbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P241McmNbrL
	 *	@return ip65504P241McmNbrL
	 */
	public short getIp65504P241McmNbrL() throws CFException {
        if (isIp65504P241McmNbrLModified()) { 
           ip65504P241McmNbrL = refreshIp65504P241McmNbrL();
        }
   		return ip65504P241McmNbrL;
	}
	
	/**
	 * 	Update Ip65504P241McmNbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P241-MCM-NBR-L
	 *	@param number
	 */
	public void setIp65504P241McmNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P241McmNbrL = checkIp65504P241McmNbrLMaxLimit(number); 
		serializeIp65504P241McmNbrL(ip65504P241McmNbrL);
	}

	public void setIp65504P241McmNbrL(int number) {
	    number = checkIp65504P241McmNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P241McmNbrL((short)number);
	}
	public void setIp65504P241McmNbrL(long number) {
	    number = checkIp65504P241McmNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P241McmNbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P242McmIndS
	 *	@return ip65504P242McmIndS
	 */
	public short getIp65504P242McmIndS() throws CFException {
        if (isIp65504P242McmIndSModified()) { 
           ip65504P242McmIndS = refreshIp65504P242McmIndS();
        }
   		return ip65504P242McmIndS;
	}
	
	/**
	 * 	Update Ip65504P242McmIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P242-MCM-IND-S
	 *	@param number
	 */
	public void setIp65504P242McmIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P242McmIndS = checkIp65504P242McmIndSMaxLimit(number); 
		serializeIp65504P242McmIndS(ip65504P242McmIndS);
	}

	public void setIp65504P242McmIndS(int number) {
	    number = checkIp65504P242McmIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P242McmIndS((short)number);
	}
	public void setIp65504P242McmIndS(long number) {
	    number = checkIp65504P242McmIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P242McmIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P242McmIndL
	 *	@return ip65504P242McmIndL
	 */
	public short getIp65504P242McmIndL() throws CFException {
        if (isIp65504P242McmIndLModified()) { 
           ip65504P242McmIndL = refreshIp65504P242McmIndL();
        }
   		return ip65504P242McmIndL;
	}
	
	/**
	 * 	Update Ip65504P242McmIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P242-MCM-IND-L
	 *	@param number
	 */
	public void setIp65504P242McmIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P242McmIndL = checkIp65504P242McmIndLMaxLimit(number); 
		serializeIp65504P242McmIndL(ip65504P242McmIndL);
	}

	public void setIp65504P242McmIndL(int number) {
	    number = checkIp65504P242McmIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P242McmIndL((short)number);
	}
	public void setIp65504P242McmIndL(long number) {
	    number = checkIp65504P242McmIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P242McmIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P243McmRspS
	 *	@return ip65504P243McmRspS
	 */
	public short getIp65504P243McmRspS() throws CFException {
        if (isIp65504P243McmRspSModified()) { 
           ip65504P243McmRspS = refreshIp65504P243McmRspS();
        }
   		return ip65504P243McmRspS;
	}
	
	/**
	 * 	Update Ip65504P243McmRspS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P243-MCM-RSP-S
	 *	@param number
	 */
	public void setIp65504P243McmRspS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P243McmRspS = checkIp65504P243McmRspSMaxLimit(number); 
		serializeIp65504P243McmRspS(ip65504P243McmRspS);
	}

	public void setIp65504P243McmRspS(int number) {
	    number = checkIp65504P243McmRspSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P243McmRspS((short)number);
	}
	public void setIp65504P243McmRspS(long number) {
	    number = checkIp65504P243McmRspSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P243McmRspS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P243McmRspL
	 *	@return ip65504P243McmRspL
	 */
	public short getIp65504P243McmRspL() throws CFException {
        if (isIp65504P243McmRspLModified()) { 
           ip65504P243McmRspL = refreshIp65504P243McmRspL();
        }
   		return ip65504P243McmRspL;
	}
	
	/**
	 * 	Update Ip65504P243McmRspL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P243-MCM-RSP-L
	 *	@param number
	 */
	public void setIp65504P243McmRspL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P243McmRspL = checkIp65504P243McmRspLMaxLimit(number); 
		serializeIp65504P243McmRspL(ip65504P243McmRspL);
	}

	public void setIp65504P243McmRspL(int number) {
	    number = checkIp65504P243McmRspLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P243McmRspL((short)number);
	}
	public void setIp65504P243McmRspL(long number) {
	    number = checkIp65504P243McmRspLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P243McmRspL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P244McmcbdtS
	 *	@return ip65504P244McmcbdtS
	 */
	public short getIp65504P244McmcbdtS() throws CFException {
        if (isIp65504P244McmcbdtSModified()) { 
           ip65504P244McmcbdtS = refreshIp65504P244McmcbdtS();
        }
   		return ip65504P244McmcbdtS;
	}
	
	/**
	 * 	Update Ip65504P244McmcbdtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P244-MCMCBDT-S
	 *	@param number
	 */
	public void setIp65504P244McmcbdtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P244McmcbdtS = checkIp65504P244McmcbdtSMaxLimit(number); 
		serializeIp65504P244McmcbdtS(ip65504P244McmcbdtS);
	}

	public void setIp65504P244McmcbdtS(int number) {
	    number = checkIp65504P244McmcbdtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P244McmcbdtS((short)number);
	}
	public void setIp65504P244McmcbdtS(long number) {
	    number = checkIp65504P244McmcbdtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P244McmcbdtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P244McmcbdtL
	 *	@return ip65504P244McmcbdtL
	 */
	public short getIp65504P244McmcbdtL() throws CFException {
        if (isIp65504P244McmcbdtLModified()) { 
           ip65504P244McmcbdtL = refreshIp65504P244McmcbdtL();
        }
   		return ip65504P244McmcbdtL;
	}
	
	/**
	 * 	Update Ip65504P244McmcbdtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P244-MCMCBDT-L
	 *	@param number
	 */
	public void setIp65504P244McmcbdtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P244McmcbdtL = checkIp65504P244McmcbdtLMaxLimit(number); 
		serializeIp65504P244McmcbdtL(ip65504P244McmcbdtL);
	}

	public void setIp65504P244McmcbdtL(int number) {
	    number = checkIp65504P244McmcbdtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P244McmcbdtL((short)number);
	}
	public void setIp65504P244McmcbdtL(long number) {
	    number = checkIp65504P244McmcbdtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P244McmcbdtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P245ReservdS
	 *	@return ip65504P245ReservdS
	 */
	public short getIp65504P245ReservdS() throws CFException {
        if (isIp65504P245ReservdSModified()) { 
           ip65504P245ReservdS = refreshIp65504P245ReservdS();
        }
   		return ip65504P245ReservdS;
	}
	
	/**
	 * 	Update Ip65504P245ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P245-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P245ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P245ReservdS = checkIp65504P245ReservdSMaxLimit(number); 
		serializeIp65504P245ReservdS(ip65504P245ReservdS);
	}

	public void setIp65504P245ReservdS(int number) {
	    number = checkIp65504P245ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P245ReservdS((short)number);
	}
	public void setIp65504P245ReservdS(long number) {
	    number = checkIp65504P245ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P245ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P245ReservdL
	 *	@return ip65504P245ReservdL
	 */
	public short getIp65504P245ReservdL() throws CFException {
        if (isIp65504P245ReservdLModified()) { 
           ip65504P245ReservdL = refreshIp65504P245ReservdL();
        }
   		return ip65504P245ReservdL;
	}
	
	/**
	 * 	Update Ip65504P245ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P245-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P245ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P245ReservdL = checkIp65504P245ReservdLMaxLimit(number); 
		serializeIp65504P245ReservdL(ip65504P245ReservdL);
	}

	public void setIp65504P245ReservdL(int number) {
	    number = checkIp65504P245ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P245ReservdL((short)number);
	}
	public void setIp65504P245ReservdL(long number) {
	    number = checkIp65504P245ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P245ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P246ReservdS
	 *	@return ip65504P246ReservdS
	 */
	public short getIp65504P246ReservdS() throws CFException {
        if (isIp65504P246ReservdSModified()) { 
           ip65504P246ReservdS = refreshIp65504P246ReservdS();
        }
   		return ip65504P246ReservdS;
	}
	
	/**
	 * 	Update Ip65504P246ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P246-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P246ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P246ReservdS = checkIp65504P246ReservdSMaxLimit(number); 
		serializeIp65504P246ReservdS(ip65504P246ReservdS);
	}

	public void setIp65504P246ReservdS(int number) {
	    number = checkIp65504P246ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P246ReservdS((short)number);
	}
	public void setIp65504P246ReservdS(long number) {
	    number = checkIp65504P246ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P246ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P246ReservdL
	 *	@return ip65504P246ReservdL
	 */
	public short getIp65504P246ReservdL() throws CFException {
        if (isIp65504P246ReservdLModified()) { 
           ip65504P246ReservdL = refreshIp65504P246ReservdL();
        }
   		return ip65504P246ReservdL;
	}
	
	/**
	 * 	Update Ip65504P246ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P246-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P246ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P246ReservdL = checkIp65504P246ReservdLMaxLimit(number); 
		serializeIp65504P246ReservdL(ip65504P246ReservdL);
	}

	public void setIp65504P246ReservdL(int number) {
	    number = checkIp65504P246ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P246ReservdL((short)number);
	}
	public void setIp65504P246ReservdL(long number) {
	    number = checkIp65504P246ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P246ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P247ReservdS
	 *	@return ip65504P247ReservdS
	 */
	public short getIp65504P247ReservdS() throws CFException {
        if (isIp65504P247ReservdSModified()) { 
           ip65504P247ReservdS = refreshIp65504P247ReservdS();
        }
   		return ip65504P247ReservdS;
	}
	
	/**
	 * 	Update Ip65504P247ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P247-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P247ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P247ReservdS = checkIp65504P247ReservdSMaxLimit(number); 
		serializeIp65504P247ReservdS(ip65504P247ReservdS);
	}

	public void setIp65504P247ReservdS(int number) {
	    number = checkIp65504P247ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P247ReservdS((short)number);
	}
	public void setIp65504P247ReservdS(long number) {
	    number = checkIp65504P247ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P247ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P247ReservdL
	 *	@return ip65504P247ReservdL
	 */
	public short getIp65504P247ReservdL() throws CFException {
        if (isIp65504P247ReservdLModified()) { 
           ip65504P247ReservdL = refreshIp65504P247ReservdL();
        }
   		return ip65504P247ReservdL;
	}
	
	/**
	 * 	Update Ip65504P247ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P247-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P247ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P247ReservdL = checkIp65504P247ReservdLMaxLimit(number); 
		serializeIp65504P247ReservdL(ip65504P247ReservdL);
	}

	public void setIp65504P247ReservdL(int number) {
	    number = checkIp65504P247ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P247ReservdL((short)number);
	}
	public void setIp65504P247ReservdL(long number) {
	    number = checkIp65504P247ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P247ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P248ReservdS
	 *	@return ip65504P248ReservdS
	 */
	public short getIp65504P248ReservdS() throws CFException {
        if (isIp65504P248ReservdSModified()) { 
           ip65504P248ReservdS = refreshIp65504P248ReservdS();
        }
   		return ip65504P248ReservdS;
	}
	
	/**
	 * 	Update Ip65504P248ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P248-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P248ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P248ReservdS = checkIp65504P248ReservdSMaxLimit(number); 
		serializeIp65504P248ReservdS(ip65504P248ReservdS);
	}

	public void setIp65504P248ReservdS(int number) {
	    number = checkIp65504P248ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P248ReservdS((short)number);
	}
	public void setIp65504P248ReservdS(long number) {
	    number = checkIp65504P248ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P248ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P248ReservdL
	 *	@return ip65504P248ReservdL
	 */
	public short getIp65504P248ReservdL() throws CFException {
        if (isIp65504P248ReservdLModified()) { 
           ip65504P248ReservdL = refreshIp65504P248ReservdL();
        }
   		return ip65504P248ReservdL;
	}
	
	/**
	 * 	Update Ip65504P248ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P248-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P248ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P248ReservdL = checkIp65504P248ReservdLMaxLimit(number); 
		serializeIp65504P248ReservdL(ip65504P248ReservdL);
	}

	public void setIp65504P248ReservdL(int number) {
	    number = checkIp65504P248ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P248ReservdL((short)number);
	}
	public void setIp65504P248ReservdL(long number) {
	    number = checkIp65504P248ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P248ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup8
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P218ReservdS((short)0);
         	setIp65504P218ReservdL((short)0);
         	setIp65504P219ReservdS((short)0);
         	setIp65504P219ReservdL((short)0);
         	setIp65504P220ReservdS((short)0);
         	setIp65504P220ReservdL((short)0);
         	setIp65504P221ReservdS((short)0);
         	setIp65504P221ReservdL((short)0);
         	setIp65504P222ReservdS((short)0);
         	setIp65504P222ReservdL((short)0);
         	setIp65504P223ReservdS((short)0);
         	setIp65504P223ReservdL((short)0);
         	setIp65504P224ReservdS((short)0);
         	setIp65504P224ReservdL((short)0);
         	setIp65504P225CovacctS((short)0);
         	setIp65504P225CovacctL((short)0);
         	setIp65504P226ReservdS((short)0);
         	setIp65504P226ReservdL((short)0);
         	setIp65504P227ReservdS((short)0);
         	setIp65504P227ReservdL((short)0);
         	setIp65504P228RetrCdS((short)0);
         	setIp65504P228RetrCdL((short)0);
         	setIp65504P229ReservdS((short)0);
         	setIp65504P229ReservdL((short)0);
         	setIp65504P230FfillcdS((short)0);
         	setIp65504P230FfillcdL((short)0);
         	setIp65504P231ReservdS((short)0);
         	setIp65504P231ReservdL((short)0);
         	setIp65504P232ReservdS((short)0);
         	setIp65504P232ReservdL((short)0);
         	setIp65504P233ReservdS((short)0);
         	setIp65504P233ReservdL((short)0);
         	setIp65504P234ReservdS((short)0);
         	setIp65504P234ReservdL((short)0);
         	setIp65504P235ReservdS((short)0);
         	setIp65504P235ReservdL((short)0);
         	setIp65504P236ReservdS((short)0);
         	setIp65504P236ReservdL((short)0);
         	setIp65504P237ReservdS((short)0);
         	setIp65504P237ReservdL((short)0);
         	setIp65504P238ReservdS((short)0);
         	setIp65504P238ReservdL((short)0);
         	setIp65504P239ReservdS((short)0);
         	setIp65504P239ReservdL((short)0);
         	setIp65504P240ReservdS((short)0);
         	setIp65504P240ReservdL((short)0);
         	setIp65504P241McmNbrS((short)0);
         	setIp65504P241McmNbrL((short)0);
         	setIp65504P242McmIndS((short)0);
         	setIp65504P242McmIndL((short)0);
         	setIp65504P243McmRspS((short)0);
         	setIp65504P243McmRspL((short)0);
         	setIp65504P244McmcbdtS((short)0);
         	setIp65504P244McmcbdtL((short)0);
         	setIp65504P245ReservdS((short)0);
         	setIp65504P245ReservdL((short)0);
         	setIp65504P246ReservdS((short)0);
         	setIp65504P246ReservdL((short)0);
         	setIp65504P247ReservdS((short)0);
         	setIp65504P247ReservdL((short)0);
         	setIp65504P248ReservdS((short)0);
         	setIp65504P248ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup8FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_8_LENGTH;
		}

}
  
