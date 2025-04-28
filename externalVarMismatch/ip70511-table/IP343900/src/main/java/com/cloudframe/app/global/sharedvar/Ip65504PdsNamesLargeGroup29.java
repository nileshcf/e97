package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup29 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup29 extends Ip65504PdsNamesLargeGroup29Serialized { 
   

								private short ip65504P869ReservdS;

								private short ip65504P869ReservdL;


								private short ip65504P870ReservdS;

								private short ip65504P870ReservdL;


								private short ip65504P871ReservdS;

								private short ip65504P871ReservdL;


								private short ip65504P872ReservdS;

								private short ip65504P872ReservdL;


								private short ip65504P873ReservdS;

								private short ip65504P873ReservdL;


								private short ip65504P874ReservdS;

								private short ip65504P874ReservdL;


								private short ip65504P875ReservdS;

								private short ip65504P875ReservdL;


								private short ip65504P876ReservdS;

								private short ip65504P876ReservdL;


								private short ip65504P877ReservdS;

								private short ip65504P877ReservdL;


								private short ip65504P878ReservdS;

								private short ip65504P878ReservdL;


								private short ip65504P879ReservdS;

								private short ip65504P879ReservdL;


								private short ip65504P880ReservdS;

								private short ip65504P880ReservdL;


								private short ip65504P881ReservdS;

								private short ip65504P881ReservdL;


								private short ip65504P882ReservdS;

								private short ip65504P882ReservdL;


								private short ip65504P883ReservdS;

								private short ip65504P883ReservdL;


								private short ip65504P884ReservdS;

								private short ip65504P884ReservdL;


								private short ip65504P885ReservdS;

								private short ip65504P885ReservdL;


								private short ip65504P886ReservdS;

								private short ip65504P886ReservdL;


								private short ip65504P887ReservdS;

								private short ip65504P887ReservdL;


								private short ip65504P888ReservdS;

								private short ip65504P888ReservdL;


								private short ip65504P889ReservdS;

								private short ip65504P889ReservdL;


								private short ip65504P890ReservdS;

								private short ip65504P890ReservdL;


								private short ip65504P891ReservdS;

								private short ip65504P891ReservdL;


								private short ip65504P892ReservdS;

								private short ip65504P892ReservdL;


								private short ip65504P893ReservdS;

								private short ip65504P893ReservdL;


								private short ip65504P894ReservdS;

								private short ip65504P894ReservdL;


								private short ip65504P895ReservdS;

								private short ip65504P895ReservdL;


								private short ip65504P896ReservdS;

								private short ip65504P896ReservdL;


								private short ip65504P897ReservdS;

								private short ip65504P897ReservdL;


								private short ip65504P898ReservdS;

								private short ip65504P898ReservdL;


								private short ip65504P899ReservdS;

								private short ip65504P899ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup29
	**/
    public Ip65504PdsNamesLargeGroup29() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup29. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup29(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P869ReservdS
	 *	@return ip65504P869ReservdS
	 */
	public short getIp65504P869ReservdS() throws CFException {
        if (isIp65504P869ReservdSModified()) { 
           ip65504P869ReservdS = refreshIp65504P869ReservdS();
        }
   		return ip65504P869ReservdS;
	}
	
	/**
	 * 	Update Ip65504P869ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P869-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P869ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P869ReservdS = checkIp65504P869ReservdSMaxLimit(number); 
		serializeIp65504P869ReservdS(ip65504P869ReservdS);
	}

	public void setIp65504P869ReservdS(int number) {
	    number = checkIp65504P869ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P869ReservdS((short)number);
	}
	public void setIp65504P869ReservdS(long number) {
	    number = checkIp65504P869ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P869ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P869ReservdL
	 *	@return ip65504P869ReservdL
	 */
	public short getIp65504P869ReservdL() throws CFException {
        if (isIp65504P869ReservdLModified()) { 
           ip65504P869ReservdL = refreshIp65504P869ReservdL();
        }
   		return ip65504P869ReservdL;
	}
	
	/**
	 * 	Update Ip65504P869ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P869-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P869ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P869ReservdL = checkIp65504P869ReservdLMaxLimit(number); 
		serializeIp65504P869ReservdL(ip65504P869ReservdL);
	}

	public void setIp65504P869ReservdL(int number) {
	    number = checkIp65504P869ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P869ReservdL((short)number);
	}
	public void setIp65504P869ReservdL(long number) {
	    number = checkIp65504P869ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P869ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P870ReservdS
	 *	@return ip65504P870ReservdS
	 */
	public short getIp65504P870ReservdS() throws CFException {
        if (isIp65504P870ReservdSModified()) { 
           ip65504P870ReservdS = refreshIp65504P870ReservdS();
        }
   		return ip65504P870ReservdS;
	}
	
	/**
	 * 	Update Ip65504P870ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P870-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P870ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P870ReservdS = checkIp65504P870ReservdSMaxLimit(number); 
		serializeIp65504P870ReservdS(ip65504P870ReservdS);
	}

	public void setIp65504P870ReservdS(int number) {
	    number = checkIp65504P870ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P870ReservdS((short)number);
	}
	public void setIp65504P870ReservdS(long number) {
	    number = checkIp65504P870ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P870ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P870ReservdL
	 *	@return ip65504P870ReservdL
	 */
	public short getIp65504P870ReservdL() throws CFException {
        if (isIp65504P870ReservdLModified()) { 
           ip65504P870ReservdL = refreshIp65504P870ReservdL();
        }
   		return ip65504P870ReservdL;
	}
	
	/**
	 * 	Update Ip65504P870ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P870-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P870ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P870ReservdL = checkIp65504P870ReservdLMaxLimit(number); 
		serializeIp65504P870ReservdL(ip65504P870ReservdL);
	}

	public void setIp65504P870ReservdL(int number) {
	    number = checkIp65504P870ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P870ReservdL((short)number);
	}
	public void setIp65504P870ReservdL(long number) {
	    number = checkIp65504P870ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P870ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P871ReservdS
	 *	@return ip65504P871ReservdS
	 */
	public short getIp65504P871ReservdS() throws CFException {
        if (isIp65504P871ReservdSModified()) { 
           ip65504P871ReservdS = refreshIp65504P871ReservdS();
        }
   		return ip65504P871ReservdS;
	}
	
	/**
	 * 	Update Ip65504P871ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P871-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P871ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P871ReservdS = checkIp65504P871ReservdSMaxLimit(number); 
		serializeIp65504P871ReservdS(ip65504P871ReservdS);
	}

	public void setIp65504P871ReservdS(int number) {
	    number = checkIp65504P871ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P871ReservdS((short)number);
	}
	public void setIp65504P871ReservdS(long number) {
	    number = checkIp65504P871ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P871ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P871ReservdL
	 *	@return ip65504P871ReservdL
	 */
	public short getIp65504P871ReservdL() throws CFException {
        if (isIp65504P871ReservdLModified()) { 
           ip65504P871ReservdL = refreshIp65504P871ReservdL();
        }
   		return ip65504P871ReservdL;
	}
	
	/**
	 * 	Update Ip65504P871ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P871-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P871ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P871ReservdL = checkIp65504P871ReservdLMaxLimit(number); 
		serializeIp65504P871ReservdL(ip65504P871ReservdL);
	}

	public void setIp65504P871ReservdL(int number) {
	    number = checkIp65504P871ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P871ReservdL((short)number);
	}
	public void setIp65504P871ReservdL(long number) {
	    number = checkIp65504P871ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P871ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P872ReservdS
	 *	@return ip65504P872ReservdS
	 */
	public short getIp65504P872ReservdS() throws CFException {
        if (isIp65504P872ReservdSModified()) { 
           ip65504P872ReservdS = refreshIp65504P872ReservdS();
        }
   		return ip65504P872ReservdS;
	}
	
	/**
	 * 	Update Ip65504P872ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P872-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P872ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P872ReservdS = checkIp65504P872ReservdSMaxLimit(number); 
		serializeIp65504P872ReservdS(ip65504P872ReservdS);
	}

	public void setIp65504P872ReservdS(int number) {
	    number = checkIp65504P872ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P872ReservdS((short)number);
	}
	public void setIp65504P872ReservdS(long number) {
	    number = checkIp65504P872ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P872ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P872ReservdL
	 *	@return ip65504P872ReservdL
	 */
	public short getIp65504P872ReservdL() throws CFException {
        if (isIp65504P872ReservdLModified()) { 
           ip65504P872ReservdL = refreshIp65504P872ReservdL();
        }
   		return ip65504P872ReservdL;
	}
	
	/**
	 * 	Update Ip65504P872ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P872-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P872ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P872ReservdL = checkIp65504P872ReservdLMaxLimit(number); 
		serializeIp65504P872ReservdL(ip65504P872ReservdL);
	}

	public void setIp65504P872ReservdL(int number) {
	    number = checkIp65504P872ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P872ReservdL((short)number);
	}
	public void setIp65504P872ReservdL(long number) {
	    number = checkIp65504P872ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P872ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P873ReservdS
	 *	@return ip65504P873ReservdS
	 */
	public short getIp65504P873ReservdS() throws CFException {
        if (isIp65504P873ReservdSModified()) { 
           ip65504P873ReservdS = refreshIp65504P873ReservdS();
        }
   		return ip65504P873ReservdS;
	}
	
	/**
	 * 	Update Ip65504P873ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P873-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P873ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P873ReservdS = checkIp65504P873ReservdSMaxLimit(number); 
		serializeIp65504P873ReservdS(ip65504P873ReservdS);
	}

	public void setIp65504P873ReservdS(int number) {
	    number = checkIp65504P873ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P873ReservdS((short)number);
	}
	public void setIp65504P873ReservdS(long number) {
	    number = checkIp65504P873ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P873ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P873ReservdL
	 *	@return ip65504P873ReservdL
	 */
	public short getIp65504P873ReservdL() throws CFException {
        if (isIp65504P873ReservdLModified()) { 
           ip65504P873ReservdL = refreshIp65504P873ReservdL();
        }
   		return ip65504P873ReservdL;
	}
	
	/**
	 * 	Update Ip65504P873ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P873-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P873ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P873ReservdL = checkIp65504P873ReservdLMaxLimit(number); 
		serializeIp65504P873ReservdL(ip65504P873ReservdL);
	}

	public void setIp65504P873ReservdL(int number) {
	    number = checkIp65504P873ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P873ReservdL((short)number);
	}
	public void setIp65504P873ReservdL(long number) {
	    number = checkIp65504P873ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P873ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P874ReservdS
	 *	@return ip65504P874ReservdS
	 */
	public short getIp65504P874ReservdS() throws CFException {
        if (isIp65504P874ReservdSModified()) { 
           ip65504P874ReservdS = refreshIp65504P874ReservdS();
        }
   		return ip65504P874ReservdS;
	}
	
	/**
	 * 	Update Ip65504P874ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P874-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P874ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P874ReservdS = checkIp65504P874ReservdSMaxLimit(number); 
		serializeIp65504P874ReservdS(ip65504P874ReservdS);
	}

	public void setIp65504P874ReservdS(int number) {
	    number = checkIp65504P874ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P874ReservdS((short)number);
	}
	public void setIp65504P874ReservdS(long number) {
	    number = checkIp65504P874ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P874ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P874ReservdL
	 *	@return ip65504P874ReservdL
	 */
	public short getIp65504P874ReservdL() throws CFException {
        if (isIp65504P874ReservdLModified()) { 
           ip65504P874ReservdL = refreshIp65504P874ReservdL();
        }
   		return ip65504P874ReservdL;
	}
	
	/**
	 * 	Update Ip65504P874ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P874-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P874ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P874ReservdL = checkIp65504P874ReservdLMaxLimit(number); 
		serializeIp65504P874ReservdL(ip65504P874ReservdL);
	}

	public void setIp65504P874ReservdL(int number) {
	    number = checkIp65504P874ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P874ReservdL((short)number);
	}
	public void setIp65504P874ReservdL(long number) {
	    number = checkIp65504P874ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P874ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P875ReservdS
	 *	@return ip65504P875ReservdS
	 */
	public short getIp65504P875ReservdS() throws CFException {
        if (isIp65504P875ReservdSModified()) { 
           ip65504P875ReservdS = refreshIp65504P875ReservdS();
        }
   		return ip65504P875ReservdS;
	}
	
	/**
	 * 	Update Ip65504P875ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P875-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P875ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P875ReservdS = checkIp65504P875ReservdSMaxLimit(number); 
		serializeIp65504P875ReservdS(ip65504P875ReservdS);
	}

	public void setIp65504P875ReservdS(int number) {
	    number = checkIp65504P875ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P875ReservdS((short)number);
	}
	public void setIp65504P875ReservdS(long number) {
	    number = checkIp65504P875ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P875ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P875ReservdL
	 *	@return ip65504P875ReservdL
	 */
	public short getIp65504P875ReservdL() throws CFException {
        if (isIp65504P875ReservdLModified()) { 
           ip65504P875ReservdL = refreshIp65504P875ReservdL();
        }
   		return ip65504P875ReservdL;
	}
	
	/**
	 * 	Update Ip65504P875ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P875-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P875ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P875ReservdL = checkIp65504P875ReservdLMaxLimit(number); 
		serializeIp65504P875ReservdL(ip65504P875ReservdL);
	}

	public void setIp65504P875ReservdL(int number) {
	    number = checkIp65504P875ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P875ReservdL((short)number);
	}
	public void setIp65504P875ReservdL(long number) {
	    number = checkIp65504P875ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P875ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P876ReservdS
	 *	@return ip65504P876ReservdS
	 */
	public short getIp65504P876ReservdS() throws CFException {
        if (isIp65504P876ReservdSModified()) { 
           ip65504P876ReservdS = refreshIp65504P876ReservdS();
        }
   		return ip65504P876ReservdS;
	}
	
	/**
	 * 	Update Ip65504P876ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P876-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P876ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P876ReservdS = checkIp65504P876ReservdSMaxLimit(number); 
		serializeIp65504P876ReservdS(ip65504P876ReservdS);
	}

	public void setIp65504P876ReservdS(int number) {
	    number = checkIp65504P876ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P876ReservdS((short)number);
	}
	public void setIp65504P876ReservdS(long number) {
	    number = checkIp65504P876ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P876ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P876ReservdL
	 *	@return ip65504P876ReservdL
	 */
	public short getIp65504P876ReservdL() throws CFException {
        if (isIp65504P876ReservdLModified()) { 
           ip65504P876ReservdL = refreshIp65504P876ReservdL();
        }
   		return ip65504P876ReservdL;
	}
	
	/**
	 * 	Update Ip65504P876ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P876-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P876ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P876ReservdL = checkIp65504P876ReservdLMaxLimit(number); 
		serializeIp65504P876ReservdL(ip65504P876ReservdL);
	}

	public void setIp65504P876ReservdL(int number) {
	    number = checkIp65504P876ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P876ReservdL((short)number);
	}
	public void setIp65504P876ReservdL(long number) {
	    number = checkIp65504P876ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P876ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P877ReservdS
	 *	@return ip65504P877ReservdS
	 */
	public short getIp65504P877ReservdS() throws CFException {
        if (isIp65504P877ReservdSModified()) { 
           ip65504P877ReservdS = refreshIp65504P877ReservdS();
        }
   		return ip65504P877ReservdS;
	}
	
	/**
	 * 	Update Ip65504P877ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P877-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P877ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P877ReservdS = checkIp65504P877ReservdSMaxLimit(number); 
		serializeIp65504P877ReservdS(ip65504P877ReservdS);
	}

	public void setIp65504P877ReservdS(int number) {
	    number = checkIp65504P877ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P877ReservdS((short)number);
	}
	public void setIp65504P877ReservdS(long number) {
	    number = checkIp65504P877ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P877ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P877ReservdL
	 *	@return ip65504P877ReservdL
	 */
	public short getIp65504P877ReservdL() throws CFException {
        if (isIp65504P877ReservdLModified()) { 
           ip65504P877ReservdL = refreshIp65504P877ReservdL();
        }
   		return ip65504P877ReservdL;
	}
	
	/**
	 * 	Update Ip65504P877ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P877-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P877ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P877ReservdL = checkIp65504P877ReservdLMaxLimit(number); 
		serializeIp65504P877ReservdL(ip65504P877ReservdL);
	}

	public void setIp65504P877ReservdL(int number) {
	    number = checkIp65504P877ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P877ReservdL((short)number);
	}
	public void setIp65504P877ReservdL(long number) {
	    number = checkIp65504P877ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P877ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P878ReservdS
	 *	@return ip65504P878ReservdS
	 */
	public short getIp65504P878ReservdS() throws CFException {
        if (isIp65504P878ReservdSModified()) { 
           ip65504P878ReservdS = refreshIp65504P878ReservdS();
        }
   		return ip65504P878ReservdS;
	}
	
	/**
	 * 	Update Ip65504P878ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P878-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P878ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P878ReservdS = checkIp65504P878ReservdSMaxLimit(number); 
		serializeIp65504P878ReservdS(ip65504P878ReservdS);
	}

	public void setIp65504P878ReservdS(int number) {
	    number = checkIp65504P878ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P878ReservdS((short)number);
	}
	public void setIp65504P878ReservdS(long number) {
	    number = checkIp65504P878ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P878ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P878ReservdL
	 *	@return ip65504P878ReservdL
	 */
	public short getIp65504P878ReservdL() throws CFException {
        if (isIp65504P878ReservdLModified()) { 
           ip65504P878ReservdL = refreshIp65504P878ReservdL();
        }
   		return ip65504P878ReservdL;
	}
	
	/**
	 * 	Update Ip65504P878ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P878-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P878ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P878ReservdL = checkIp65504P878ReservdLMaxLimit(number); 
		serializeIp65504P878ReservdL(ip65504P878ReservdL);
	}

	public void setIp65504P878ReservdL(int number) {
	    number = checkIp65504P878ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P878ReservdL((short)number);
	}
	public void setIp65504P878ReservdL(long number) {
	    number = checkIp65504P878ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P878ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P879ReservdS
	 *	@return ip65504P879ReservdS
	 */
	public short getIp65504P879ReservdS() throws CFException {
        if (isIp65504P879ReservdSModified()) { 
           ip65504P879ReservdS = refreshIp65504P879ReservdS();
        }
   		return ip65504P879ReservdS;
	}
	
	/**
	 * 	Update Ip65504P879ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P879-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P879ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P879ReservdS = checkIp65504P879ReservdSMaxLimit(number); 
		serializeIp65504P879ReservdS(ip65504P879ReservdS);
	}

	public void setIp65504P879ReservdS(int number) {
	    number = checkIp65504P879ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P879ReservdS((short)number);
	}
	public void setIp65504P879ReservdS(long number) {
	    number = checkIp65504P879ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P879ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P879ReservdL
	 *	@return ip65504P879ReservdL
	 */
	public short getIp65504P879ReservdL() throws CFException {
        if (isIp65504P879ReservdLModified()) { 
           ip65504P879ReservdL = refreshIp65504P879ReservdL();
        }
   		return ip65504P879ReservdL;
	}
	
	/**
	 * 	Update Ip65504P879ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P879-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P879ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P879ReservdL = checkIp65504P879ReservdLMaxLimit(number); 
		serializeIp65504P879ReservdL(ip65504P879ReservdL);
	}

	public void setIp65504P879ReservdL(int number) {
	    number = checkIp65504P879ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P879ReservdL((short)number);
	}
	public void setIp65504P879ReservdL(long number) {
	    number = checkIp65504P879ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P879ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P880ReservdS
	 *	@return ip65504P880ReservdS
	 */
	public short getIp65504P880ReservdS() throws CFException {
        if (isIp65504P880ReservdSModified()) { 
           ip65504P880ReservdS = refreshIp65504P880ReservdS();
        }
   		return ip65504P880ReservdS;
	}
	
	/**
	 * 	Update Ip65504P880ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P880-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P880ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P880ReservdS = checkIp65504P880ReservdSMaxLimit(number); 
		serializeIp65504P880ReservdS(ip65504P880ReservdS);
	}

	public void setIp65504P880ReservdS(int number) {
	    number = checkIp65504P880ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P880ReservdS((short)number);
	}
	public void setIp65504P880ReservdS(long number) {
	    number = checkIp65504P880ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P880ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P880ReservdL
	 *	@return ip65504P880ReservdL
	 */
	public short getIp65504P880ReservdL() throws CFException {
        if (isIp65504P880ReservdLModified()) { 
           ip65504P880ReservdL = refreshIp65504P880ReservdL();
        }
   		return ip65504P880ReservdL;
	}
	
	/**
	 * 	Update Ip65504P880ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P880-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P880ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P880ReservdL = checkIp65504P880ReservdLMaxLimit(number); 
		serializeIp65504P880ReservdL(ip65504P880ReservdL);
	}

	public void setIp65504P880ReservdL(int number) {
	    number = checkIp65504P880ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P880ReservdL((short)number);
	}
	public void setIp65504P880ReservdL(long number) {
	    number = checkIp65504P880ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P880ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P881ReservdS
	 *	@return ip65504P881ReservdS
	 */
	public short getIp65504P881ReservdS() throws CFException {
        if (isIp65504P881ReservdSModified()) { 
           ip65504P881ReservdS = refreshIp65504P881ReservdS();
        }
   		return ip65504P881ReservdS;
	}
	
	/**
	 * 	Update Ip65504P881ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P881-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P881ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P881ReservdS = checkIp65504P881ReservdSMaxLimit(number); 
		serializeIp65504P881ReservdS(ip65504P881ReservdS);
	}

	public void setIp65504P881ReservdS(int number) {
	    number = checkIp65504P881ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P881ReservdS((short)number);
	}
	public void setIp65504P881ReservdS(long number) {
	    number = checkIp65504P881ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P881ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P881ReservdL
	 *	@return ip65504P881ReservdL
	 */
	public short getIp65504P881ReservdL() throws CFException {
        if (isIp65504P881ReservdLModified()) { 
           ip65504P881ReservdL = refreshIp65504P881ReservdL();
        }
   		return ip65504P881ReservdL;
	}
	
	/**
	 * 	Update Ip65504P881ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P881-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P881ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P881ReservdL = checkIp65504P881ReservdLMaxLimit(number); 
		serializeIp65504P881ReservdL(ip65504P881ReservdL);
	}

	public void setIp65504P881ReservdL(int number) {
	    number = checkIp65504P881ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P881ReservdL((short)number);
	}
	public void setIp65504P881ReservdL(long number) {
	    number = checkIp65504P881ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P881ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P882ReservdS
	 *	@return ip65504P882ReservdS
	 */
	public short getIp65504P882ReservdS() throws CFException {
        if (isIp65504P882ReservdSModified()) { 
           ip65504P882ReservdS = refreshIp65504P882ReservdS();
        }
   		return ip65504P882ReservdS;
	}
	
	/**
	 * 	Update Ip65504P882ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P882-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P882ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P882ReservdS = checkIp65504P882ReservdSMaxLimit(number); 
		serializeIp65504P882ReservdS(ip65504P882ReservdS);
	}

	public void setIp65504P882ReservdS(int number) {
	    number = checkIp65504P882ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P882ReservdS((short)number);
	}
	public void setIp65504P882ReservdS(long number) {
	    number = checkIp65504P882ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P882ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P882ReservdL
	 *	@return ip65504P882ReservdL
	 */
	public short getIp65504P882ReservdL() throws CFException {
        if (isIp65504P882ReservdLModified()) { 
           ip65504P882ReservdL = refreshIp65504P882ReservdL();
        }
   		return ip65504P882ReservdL;
	}
	
	/**
	 * 	Update Ip65504P882ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P882-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P882ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P882ReservdL = checkIp65504P882ReservdLMaxLimit(number); 
		serializeIp65504P882ReservdL(ip65504P882ReservdL);
	}

	public void setIp65504P882ReservdL(int number) {
	    number = checkIp65504P882ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P882ReservdL((short)number);
	}
	public void setIp65504P882ReservdL(long number) {
	    number = checkIp65504P882ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P882ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P883ReservdS
	 *	@return ip65504P883ReservdS
	 */
	public short getIp65504P883ReservdS() throws CFException {
        if (isIp65504P883ReservdSModified()) { 
           ip65504P883ReservdS = refreshIp65504P883ReservdS();
        }
   		return ip65504P883ReservdS;
	}
	
	/**
	 * 	Update Ip65504P883ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P883-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P883ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P883ReservdS = checkIp65504P883ReservdSMaxLimit(number); 
		serializeIp65504P883ReservdS(ip65504P883ReservdS);
	}

	public void setIp65504P883ReservdS(int number) {
	    number = checkIp65504P883ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P883ReservdS((short)number);
	}
	public void setIp65504P883ReservdS(long number) {
	    number = checkIp65504P883ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P883ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P883ReservdL
	 *	@return ip65504P883ReservdL
	 */
	public short getIp65504P883ReservdL() throws CFException {
        if (isIp65504P883ReservdLModified()) { 
           ip65504P883ReservdL = refreshIp65504P883ReservdL();
        }
   		return ip65504P883ReservdL;
	}
	
	/**
	 * 	Update Ip65504P883ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P883-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P883ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P883ReservdL = checkIp65504P883ReservdLMaxLimit(number); 
		serializeIp65504P883ReservdL(ip65504P883ReservdL);
	}

	public void setIp65504P883ReservdL(int number) {
	    number = checkIp65504P883ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P883ReservdL((short)number);
	}
	public void setIp65504P883ReservdL(long number) {
	    number = checkIp65504P883ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P883ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P884ReservdS
	 *	@return ip65504P884ReservdS
	 */
	public short getIp65504P884ReservdS() throws CFException {
        if (isIp65504P884ReservdSModified()) { 
           ip65504P884ReservdS = refreshIp65504P884ReservdS();
        }
   		return ip65504P884ReservdS;
	}
	
	/**
	 * 	Update Ip65504P884ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P884-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P884ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P884ReservdS = checkIp65504P884ReservdSMaxLimit(number); 
		serializeIp65504P884ReservdS(ip65504P884ReservdS);
	}

	public void setIp65504P884ReservdS(int number) {
	    number = checkIp65504P884ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P884ReservdS((short)number);
	}
	public void setIp65504P884ReservdS(long number) {
	    number = checkIp65504P884ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P884ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P884ReservdL
	 *	@return ip65504P884ReservdL
	 */
	public short getIp65504P884ReservdL() throws CFException {
        if (isIp65504P884ReservdLModified()) { 
           ip65504P884ReservdL = refreshIp65504P884ReservdL();
        }
   		return ip65504P884ReservdL;
	}
	
	/**
	 * 	Update Ip65504P884ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P884-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P884ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P884ReservdL = checkIp65504P884ReservdLMaxLimit(number); 
		serializeIp65504P884ReservdL(ip65504P884ReservdL);
	}

	public void setIp65504P884ReservdL(int number) {
	    number = checkIp65504P884ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P884ReservdL((short)number);
	}
	public void setIp65504P884ReservdL(long number) {
	    number = checkIp65504P884ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P884ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P885ReservdS
	 *	@return ip65504P885ReservdS
	 */
	public short getIp65504P885ReservdS() throws CFException {
        if (isIp65504P885ReservdSModified()) { 
           ip65504P885ReservdS = refreshIp65504P885ReservdS();
        }
   		return ip65504P885ReservdS;
	}
	
	/**
	 * 	Update Ip65504P885ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P885-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P885ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P885ReservdS = checkIp65504P885ReservdSMaxLimit(number); 
		serializeIp65504P885ReservdS(ip65504P885ReservdS);
	}

	public void setIp65504P885ReservdS(int number) {
	    number = checkIp65504P885ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P885ReservdS((short)number);
	}
	public void setIp65504P885ReservdS(long number) {
	    number = checkIp65504P885ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P885ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P885ReservdL
	 *	@return ip65504P885ReservdL
	 */
	public short getIp65504P885ReservdL() throws CFException {
        if (isIp65504P885ReservdLModified()) { 
           ip65504P885ReservdL = refreshIp65504P885ReservdL();
        }
   		return ip65504P885ReservdL;
	}
	
	/**
	 * 	Update Ip65504P885ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P885-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P885ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P885ReservdL = checkIp65504P885ReservdLMaxLimit(number); 
		serializeIp65504P885ReservdL(ip65504P885ReservdL);
	}

	public void setIp65504P885ReservdL(int number) {
	    number = checkIp65504P885ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P885ReservdL((short)number);
	}
	public void setIp65504P885ReservdL(long number) {
	    number = checkIp65504P885ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P885ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P886ReservdS
	 *	@return ip65504P886ReservdS
	 */
	public short getIp65504P886ReservdS() throws CFException {
        if (isIp65504P886ReservdSModified()) { 
           ip65504P886ReservdS = refreshIp65504P886ReservdS();
        }
   		return ip65504P886ReservdS;
	}
	
	/**
	 * 	Update Ip65504P886ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P886-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P886ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P886ReservdS = checkIp65504P886ReservdSMaxLimit(number); 
		serializeIp65504P886ReservdS(ip65504P886ReservdS);
	}

	public void setIp65504P886ReservdS(int number) {
	    number = checkIp65504P886ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P886ReservdS((short)number);
	}
	public void setIp65504P886ReservdS(long number) {
	    number = checkIp65504P886ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P886ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P886ReservdL
	 *	@return ip65504P886ReservdL
	 */
	public short getIp65504P886ReservdL() throws CFException {
        if (isIp65504P886ReservdLModified()) { 
           ip65504P886ReservdL = refreshIp65504P886ReservdL();
        }
   		return ip65504P886ReservdL;
	}
	
	/**
	 * 	Update Ip65504P886ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P886-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P886ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P886ReservdL = checkIp65504P886ReservdLMaxLimit(number); 
		serializeIp65504P886ReservdL(ip65504P886ReservdL);
	}

	public void setIp65504P886ReservdL(int number) {
	    number = checkIp65504P886ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P886ReservdL((short)number);
	}
	public void setIp65504P886ReservdL(long number) {
	    number = checkIp65504P886ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P886ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P887ReservdS
	 *	@return ip65504P887ReservdS
	 */
	public short getIp65504P887ReservdS() throws CFException {
        if (isIp65504P887ReservdSModified()) { 
           ip65504P887ReservdS = refreshIp65504P887ReservdS();
        }
   		return ip65504P887ReservdS;
	}
	
	/**
	 * 	Update Ip65504P887ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P887-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P887ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P887ReservdS = checkIp65504P887ReservdSMaxLimit(number); 
		serializeIp65504P887ReservdS(ip65504P887ReservdS);
	}

	public void setIp65504P887ReservdS(int number) {
	    number = checkIp65504P887ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P887ReservdS((short)number);
	}
	public void setIp65504P887ReservdS(long number) {
	    number = checkIp65504P887ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P887ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P887ReservdL
	 *	@return ip65504P887ReservdL
	 */
	public short getIp65504P887ReservdL() throws CFException {
        if (isIp65504P887ReservdLModified()) { 
           ip65504P887ReservdL = refreshIp65504P887ReservdL();
        }
   		return ip65504P887ReservdL;
	}
	
	/**
	 * 	Update Ip65504P887ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P887-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P887ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P887ReservdL = checkIp65504P887ReservdLMaxLimit(number); 
		serializeIp65504P887ReservdL(ip65504P887ReservdL);
	}

	public void setIp65504P887ReservdL(int number) {
	    number = checkIp65504P887ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P887ReservdL((short)number);
	}
	public void setIp65504P887ReservdL(long number) {
	    number = checkIp65504P887ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P887ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P888ReservdS
	 *	@return ip65504P888ReservdS
	 */
	public short getIp65504P888ReservdS() throws CFException {
        if (isIp65504P888ReservdSModified()) { 
           ip65504P888ReservdS = refreshIp65504P888ReservdS();
        }
   		return ip65504P888ReservdS;
	}
	
	/**
	 * 	Update Ip65504P888ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P888-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P888ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P888ReservdS = checkIp65504P888ReservdSMaxLimit(number); 
		serializeIp65504P888ReservdS(ip65504P888ReservdS);
	}

	public void setIp65504P888ReservdS(int number) {
	    number = checkIp65504P888ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P888ReservdS((short)number);
	}
	public void setIp65504P888ReservdS(long number) {
	    number = checkIp65504P888ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P888ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P888ReservdL
	 *	@return ip65504P888ReservdL
	 */
	public short getIp65504P888ReservdL() throws CFException {
        if (isIp65504P888ReservdLModified()) { 
           ip65504P888ReservdL = refreshIp65504P888ReservdL();
        }
   		return ip65504P888ReservdL;
	}
	
	/**
	 * 	Update Ip65504P888ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P888-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P888ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P888ReservdL = checkIp65504P888ReservdLMaxLimit(number); 
		serializeIp65504P888ReservdL(ip65504P888ReservdL);
	}

	public void setIp65504P888ReservdL(int number) {
	    number = checkIp65504P888ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P888ReservdL((short)number);
	}
	public void setIp65504P888ReservdL(long number) {
	    number = checkIp65504P888ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P888ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P889ReservdS
	 *	@return ip65504P889ReservdS
	 */
	public short getIp65504P889ReservdS() throws CFException {
        if (isIp65504P889ReservdSModified()) { 
           ip65504P889ReservdS = refreshIp65504P889ReservdS();
        }
   		return ip65504P889ReservdS;
	}
	
	/**
	 * 	Update Ip65504P889ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P889-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P889ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P889ReservdS = checkIp65504P889ReservdSMaxLimit(number); 
		serializeIp65504P889ReservdS(ip65504P889ReservdS);
	}

	public void setIp65504P889ReservdS(int number) {
	    number = checkIp65504P889ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P889ReservdS((short)number);
	}
	public void setIp65504P889ReservdS(long number) {
	    number = checkIp65504P889ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P889ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P889ReservdL
	 *	@return ip65504P889ReservdL
	 */
	public short getIp65504P889ReservdL() throws CFException {
        if (isIp65504P889ReservdLModified()) { 
           ip65504P889ReservdL = refreshIp65504P889ReservdL();
        }
   		return ip65504P889ReservdL;
	}
	
	/**
	 * 	Update Ip65504P889ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P889-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P889ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P889ReservdL = checkIp65504P889ReservdLMaxLimit(number); 
		serializeIp65504P889ReservdL(ip65504P889ReservdL);
	}

	public void setIp65504P889ReservdL(int number) {
	    number = checkIp65504P889ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P889ReservdL((short)number);
	}
	public void setIp65504P889ReservdL(long number) {
	    number = checkIp65504P889ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P889ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P890ReservdS
	 *	@return ip65504P890ReservdS
	 */
	public short getIp65504P890ReservdS() throws CFException {
        if (isIp65504P890ReservdSModified()) { 
           ip65504P890ReservdS = refreshIp65504P890ReservdS();
        }
   		return ip65504P890ReservdS;
	}
	
	/**
	 * 	Update Ip65504P890ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P890-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P890ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P890ReservdS = checkIp65504P890ReservdSMaxLimit(number); 
		serializeIp65504P890ReservdS(ip65504P890ReservdS);
	}

	public void setIp65504P890ReservdS(int number) {
	    number = checkIp65504P890ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P890ReservdS((short)number);
	}
	public void setIp65504P890ReservdS(long number) {
	    number = checkIp65504P890ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P890ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P890ReservdL
	 *	@return ip65504P890ReservdL
	 */
	public short getIp65504P890ReservdL() throws CFException {
        if (isIp65504P890ReservdLModified()) { 
           ip65504P890ReservdL = refreshIp65504P890ReservdL();
        }
   		return ip65504P890ReservdL;
	}
	
	/**
	 * 	Update Ip65504P890ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P890-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P890ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P890ReservdL = checkIp65504P890ReservdLMaxLimit(number); 
		serializeIp65504P890ReservdL(ip65504P890ReservdL);
	}

	public void setIp65504P890ReservdL(int number) {
	    number = checkIp65504P890ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P890ReservdL((short)number);
	}
	public void setIp65504P890ReservdL(long number) {
	    number = checkIp65504P890ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P890ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P891ReservdS
	 *	@return ip65504P891ReservdS
	 */
	public short getIp65504P891ReservdS() throws CFException {
        if (isIp65504P891ReservdSModified()) { 
           ip65504P891ReservdS = refreshIp65504P891ReservdS();
        }
   		return ip65504P891ReservdS;
	}
	
	/**
	 * 	Update Ip65504P891ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P891-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P891ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P891ReservdS = checkIp65504P891ReservdSMaxLimit(number); 
		serializeIp65504P891ReservdS(ip65504P891ReservdS);
	}

	public void setIp65504P891ReservdS(int number) {
	    number = checkIp65504P891ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P891ReservdS((short)number);
	}
	public void setIp65504P891ReservdS(long number) {
	    number = checkIp65504P891ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P891ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P891ReservdL
	 *	@return ip65504P891ReservdL
	 */
	public short getIp65504P891ReservdL() throws CFException {
        if (isIp65504P891ReservdLModified()) { 
           ip65504P891ReservdL = refreshIp65504P891ReservdL();
        }
   		return ip65504P891ReservdL;
	}
	
	/**
	 * 	Update Ip65504P891ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P891-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P891ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P891ReservdL = checkIp65504P891ReservdLMaxLimit(number); 
		serializeIp65504P891ReservdL(ip65504P891ReservdL);
	}

	public void setIp65504P891ReservdL(int number) {
	    number = checkIp65504P891ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P891ReservdL((short)number);
	}
	public void setIp65504P891ReservdL(long number) {
	    number = checkIp65504P891ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P891ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P892ReservdS
	 *	@return ip65504P892ReservdS
	 */
	public short getIp65504P892ReservdS() throws CFException {
        if (isIp65504P892ReservdSModified()) { 
           ip65504P892ReservdS = refreshIp65504P892ReservdS();
        }
   		return ip65504P892ReservdS;
	}
	
	/**
	 * 	Update Ip65504P892ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P892-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P892ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P892ReservdS = checkIp65504P892ReservdSMaxLimit(number); 
		serializeIp65504P892ReservdS(ip65504P892ReservdS);
	}

	public void setIp65504P892ReservdS(int number) {
	    number = checkIp65504P892ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P892ReservdS((short)number);
	}
	public void setIp65504P892ReservdS(long number) {
	    number = checkIp65504P892ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P892ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P892ReservdL
	 *	@return ip65504P892ReservdL
	 */
	public short getIp65504P892ReservdL() throws CFException {
        if (isIp65504P892ReservdLModified()) { 
           ip65504P892ReservdL = refreshIp65504P892ReservdL();
        }
   		return ip65504P892ReservdL;
	}
	
	/**
	 * 	Update Ip65504P892ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P892-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P892ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P892ReservdL = checkIp65504P892ReservdLMaxLimit(number); 
		serializeIp65504P892ReservdL(ip65504P892ReservdL);
	}

	public void setIp65504P892ReservdL(int number) {
	    number = checkIp65504P892ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P892ReservdL((short)number);
	}
	public void setIp65504P892ReservdL(long number) {
	    number = checkIp65504P892ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P892ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P893ReservdS
	 *	@return ip65504P893ReservdS
	 */
	public short getIp65504P893ReservdS() throws CFException {
        if (isIp65504P893ReservdSModified()) { 
           ip65504P893ReservdS = refreshIp65504P893ReservdS();
        }
   		return ip65504P893ReservdS;
	}
	
	/**
	 * 	Update Ip65504P893ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P893-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P893ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P893ReservdS = checkIp65504P893ReservdSMaxLimit(number); 
		serializeIp65504P893ReservdS(ip65504P893ReservdS);
	}

	public void setIp65504P893ReservdS(int number) {
	    number = checkIp65504P893ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P893ReservdS((short)number);
	}
	public void setIp65504P893ReservdS(long number) {
	    number = checkIp65504P893ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P893ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P893ReservdL
	 *	@return ip65504P893ReservdL
	 */
	public short getIp65504P893ReservdL() throws CFException {
        if (isIp65504P893ReservdLModified()) { 
           ip65504P893ReservdL = refreshIp65504P893ReservdL();
        }
   		return ip65504P893ReservdL;
	}
	
	/**
	 * 	Update Ip65504P893ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P893-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P893ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P893ReservdL = checkIp65504P893ReservdLMaxLimit(number); 
		serializeIp65504P893ReservdL(ip65504P893ReservdL);
	}

	public void setIp65504P893ReservdL(int number) {
	    number = checkIp65504P893ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P893ReservdL((short)number);
	}
	public void setIp65504P893ReservdL(long number) {
	    number = checkIp65504P893ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P893ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P894ReservdS
	 *	@return ip65504P894ReservdS
	 */
	public short getIp65504P894ReservdS() throws CFException {
        if (isIp65504P894ReservdSModified()) { 
           ip65504P894ReservdS = refreshIp65504P894ReservdS();
        }
   		return ip65504P894ReservdS;
	}
	
	/**
	 * 	Update Ip65504P894ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P894-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P894ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P894ReservdS = checkIp65504P894ReservdSMaxLimit(number); 
		serializeIp65504P894ReservdS(ip65504P894ReservdS);
	}

	public void setIp65504P894ReservdS(int number) {
	    number = checkIp65504P894ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P894ReservdS((short)number);
	}
	public void setIp65504P894ReservdS(long number) {
	    number = checkIp65504P894ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P894ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P894ReservdL
	 *	@return ip65504P894ReservdL
	 */
	public short getIp65504P894ReservdL() throws CFException {
        if (isIp65504P894ReservdLModified()) { 
           ip65504P894ReservdL = refreshIp65504P894ReservdL();
        }
   		return ip65504P894ReservdL;
	}
	
	/**
	 * 	Update Ip65504P894ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P894-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P894ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P894ReservdL = checkIp65504P894ReservdLMaxLimit(number); 
		serializeIp65504P894ReservdL(ip65504P894ReservdL);
	}

	public void setIp65504P894ReservdL(int number) {
	    number = checkIp65504P894ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P894ReservdL((short)number);
	}
	public void setIp65504P894ReservdL(long number) {
	    number = checkIp65504P894ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P894ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P895ReservdS
	 *	@return ip65504P895ReservdS
	 */
	public short getIp65504P895ReservdS() throws CFException {
        if (isIp65504P895ReservdSModified()) { 
           ip65504P895ReservdS = refreshIp65504P895ReservdS();
        }
   		return ip65504P895ReservdS;
	}
	
	/**
	 * 	Update Ip65504P895ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P895-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P895ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P895ReservdS = checkIp65504P895ReservdSMaxLimit(number); 
		serializeIp65504P895ReservdS(ip65504P895ReservdS);
	}

	public void setIp65504P895ReservdS(int number) {
	    number = checkIp65504P895ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P895ReservdS((short)number);
	}
	public void setIp65504P895ReservdS(long number) {
	    number = checkIp65504P895ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P895ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P895ReservdL
	 *	@return ip65504P895ReservdL
	 */
	public short getIp65504P895ReservdL() throws CFException {
        if (isIp65504P895ReservdLModified()) { 
           ip65504P895ReservdL = refreshIp65504P895ReservdL();
        }
   		return ip65504P895ReservdL;
	}
	
	/**
	 * 	Update Ip65504P895ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P895-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P895ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P895ReservdL = checkIp65504P895ReservdLMaxLimit(number); 
		serializeIp65504P895ReservdL(ip65504P895ReservdL);
	}

	public void setIp65504P895ReservdL(int number) {
	    number = checkIp65504P895ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P895ReservdL((short)number);
	}
	public void setIp65504P895ReservdL(long number) {
	    number = checkIp65504P895ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P895ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P896ReservdS
	 *	@return ip65504P896ReservdS
	 */
	public short getIp65504P896ReservdS() throws CFException {
        if (isIp65504P896ReservdSModified()) { 
           ip65504P896ReservdS = refreshIp65504P896ReservdS();
        }
   		return ip65504P896ReservdS;
	}
	
	/**
	 * 	Update Ip65504P896ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P896-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P896ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P896ReservdS = checkIp65504P896ReservdSMaxLimit(number); 
		serializeIp65504P896ReservdS(ip65504P896ReservdS);
	}

	public void setIp65504P896ReservdS(int number) {
	    number = checkIp65504P896ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P896ReservdS((short)number);
	}
	public void setIp65504P896ReservdS(long number) {
	    number = checkIp65504P896ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P896ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P896ReservdL
	 *	@return ip65504P896ReservdL
	 */
	public short getIp65504P896ReservdL() throws CFException {
        if (isIp65504P896ReservdLModified()) { 
           ip65504P896ReservdL = refreshIp65504P896ReservdL();
        }
   		return ip65504P896ReservdL;
	}
	
	/**
	 * 	Update Ip65504P896ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P896-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P896ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P896ReservdL = checkIp65504P896ReservdLMaxLimit(number); 
		serializeIp65504P896ReservdL(ip65504P896ReservdL);
	}

	public void setIp65504P896ReservdL(int number) {
	    number = checkIp65504P896ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P896ReservdL((short)number);
	}
	public void setIp65504P896ReservdL(long number) {
	    number = checkIp65504P896ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P896ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P897ReservdS
	 *	@return ip65504P897ReservdS
	 */
	public short getIp65504P897ReservdS() throws CFException {
        if (isIp65504P897ReservdSModified()) { 
           ip65504P897ReservdS = refreshIp65504P897ReservdS();
        }
   		return ip65504P897ReservdS;
	}
	
	/**
	 * 	Update Ip65504P897ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P897-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P897ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P897ReservdS = checkIp65504P897ReservdSMaxLimit(number); 
		serializeIp65504P897ReservdS(ip65504P897ReservdS);
	}

	public void setIp65504P897ReservdS(int number) {
	    number = checkIp65504P897ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P897ReservdS((short)number);
	}
	public void setIp65504P897ReservdS(long number) {
	    number = checkIp65504P897ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P897ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P897ReservdL
	 *	@return ip65504P897ReservdL
	 */
	public short getIp65504P897ReservdL() throws CFException {
        if (isIp65504P897ReservdLModified()) { 
           ip65504P897ReservdL = refreshIp65504P897ReservdL();
        }
   		return ip65504P897ReservdL;
	}
	
	/**
	 * 	Update Ip65504P897ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P897-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P897ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P897ReservdL = checkIp65504P897ReservdLMaxLimit(number); 
		serializeIp65504P897ReservdL(ip65504P897ReservdL);
	}

	public void setIp65504P897ReservdL(int number) {
	    number = checkIp65504P897ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P897ReservdL((short)number);
	}
	public void setIp65504P897ReservdL(long number) {
	    number = checkIp65504P897ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P897ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P898ReservdS
	 *	@return ip65504P898ReservdS
	 */
	public short getIp65504P898ReservdS() throws CFException {
        if (isIp65504P898ReservdSModified()) { 
           ip65504P898ReservdS = refreshIp65504P898ReservdS();
        }
   		return ip65504P898ReservdS;
	}
	
	/**
	 * 	Update Ip65504P898ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P898-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P898ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P898ReservdS = checkIp65504P898ReservdSMaxLimit(number); 
		serializeIp65504P898ReservdS(ip65504P898ReservdS);
	}

	public void setIp65504P898ReservdS(int number) {
	    number = checkIp65504P898ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P898ReservdS((short)number);
	}
	public void setIp65504P898ReservdS(long number) {
	    number = checkIp65504P898ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P898ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P898ReservdL
	 *	@return ip65504P898ReservdL
	 */
	public short getIp65504P898ReservdL() throws CFException {
        if (isIp65504P898ReservdLModified()) { 
           ip65504P898ReservdL = refreshIp65504P898ReservdL();
        }
   		return ip65504P898ReservdL;
	}
	
	/**
	 * 	Update Ip65504P898ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P898-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P898ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P898ReservdL = checkIp65504P898ReservdLMaxLimit(number); 
		serializeIp65504P898ReservdL(ip65504P898ReservdL);
	}

	public void setIp65504P898ReservdL(int number) {
	    number = checkIp65504P898ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P898ReservdL((short)number);
	}
	public void setIp65504P898ReservdL(long number) {
	    number = checkIp65504P898ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P898ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P899ReservdS
	 *	@return ip65504P899ReservdS
	 */
	public short getIp65504P899ReservdS() throws CFException {
        if (isIp65504P899ReservdSModified()) { 
           ip65504P899ReservdS = refreshIp65504P899ReservdS();
        }
   		return ip65504P899ReservdS;
	}
	
	/**
	 * 	Update Ip65504P899ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P899-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P899ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P899ReservdS = checkIp65504P899ReservdSMaxLimit(number); 
		serializeIp65504P899ReservdS(ip65504P899ReservdS);
	}

	public void setIp65504P899ReservdS(int number) {
	    number = checkIp65504P899ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P899ReservdS((short)number);
	}
	public void setIp65504P899ReservdS(long number) {
	    number = checkIp65504P899ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P899ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P899ReservdL
	 *	@return ip65504P899ReservdL
	 */
	public short getIp65504P899ReservdL() throws CFException {
        if (isIp65504P899ReservdLModified()) { 
           ip65504P899ReservdL = refreshIp65504P899ReservdL();
        }
   		return ip65504P899ReservdL;
	}
	
	/**
	 * 	Update Ip65504P899ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P899-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P899ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P899ReservdL = checkIp65504P899ReservdLMaxLimit(number); 
		serializeIp65504P899ReservdL(ip65504P899ReservdL);
	}

	public void setIp65504P899ReservdL(int number) {
	    number = checkIp65504P899ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P899ReservdL((short)number);
	}
	public void setIp65504P899ReservdL(long number) {
	    number = checkIp65504P899ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P899ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup29
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P869ReservdS((short)0);
         	setIp65504P869ReservdL((short)0);
         	setIp65504P870ReservdS((short)0);
         	setIp65504P870ReservdL((short)0);
         	setIp65504P871ReservdS((short)0);
         	setIp65504P871ReservdL((short)0);
         	setIp65504P872ReservdS((short)0);
         	setIp65504P872ReservdL((short)0);
         	setIp65504P873ReservdS((short)0);
         	setIp65504P873ReservdL((short)0);
         	setIp65504P874ReservdS((short)0);
         	setIp65504P874ReservdL((short)0);
         	setIp65504P875ReservdS((short)0);
         	setIp65504P875ReservdL((short)0);
         	setIp65504P876ReservdS((short)0);
         	setIp65504P876ReservdL((short)0);
         	setIp65504P877ReservdS((short)0);
         	setIp65504P877ReservdL((short)0);
         	setIp65504P878ReservdS((short)0);
         	setIp65504P878ReservdL((short)0);
         	setIp65504P879ReservdS((short)0);
         	setIp65504P879ReservdL((short)0);
         	setIp65504P880ReservdS((short)0);
         	setIp65504P880ReservdL((short)0);
         	setIp65504P881ReservdS((short)0);
         	setIp65504P881ReservdL((short)0);
         	setIp65504P882ReservdS((short)0);
         	setIp65504P882ReservdL((short)0);
         	setIp65504P883ReservdS((short)0);
         	setIp65504P883ReservdL((short)0);
         	setIp65504P884ReservdS((short)0);
         	setIp65504P884ReservdL((short)0);
         	setIp65504P885ReservdS((short)0);
         	setIp65504P885ReservdL((short)0);
         	setIp65504P886ReservdS((short)0);
         	setIp65504P886ReservdL((short)0);
         	setIp65504P887ReservdS((short)0);
         	setIp65504P887ReservdL((short)0);
         	setIp65504P888ReservdS((short)0);
         	setIp65504P888ReservdL((short)0);
         	setIp65504P889ReservdS((short)0);
         	setIp65504P889ReservdL((short)0);
         	setIp65504P890ReservdS((short)0);
         	setIp65504P890ReservdL((short)0);
         	setIp65504P891ReservdS((short)0);
         	setIp65504P891ReservdL((short)0);
         	setIp65504P892ReservdS((short)0);
         	setIp65504P892ReservdL((short)0);
         	setIp65504P893ReservdS((short)0);
         	setIp65504P893ReservdL((short)0);
         	setIp65504P894ReservdS((short)0);
         	setIp65504P894ReservdL((short)0);
         	setIp65504P895ReservdS((short)0);
         	setIp65504P895ReservdL((short)0);
         	setIp65504P896ReservdS((short)0);
         	setIp65504P896ReservdL((short)0);
         	setIp65504P897ReservdS((short)0);
         	setIp65504P897ReservdL((short)0);
         	setIp65504P898ReservdS((short)0);
         	setIp65504P898ReservdL((short)0);
         	setIp65504P899ReservdS((short)0);
         	setIp65504P899ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup29FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_29_LENGTH;
		}

}
  
