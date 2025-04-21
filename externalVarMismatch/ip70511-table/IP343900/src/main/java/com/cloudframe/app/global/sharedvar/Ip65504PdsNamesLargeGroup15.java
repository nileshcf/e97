package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup15 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup15 extends Ip65504PdsNamesLargeGroup15Serialized { 
   

								private short ip65504P435ReservdS;

								private short ip65504P435ReservdL;


								private short ip65504P436ReservdS;

								private short ip65504P436ReservdL;


								private short ip65504P437ReservdS;

								private short ip65504P437ReservdL;


								private short ip65504P438ReservdS;

								private short ip65504P438ReservdL;


								private short ip65504P439ReservdS;

								private short ip65504P439ReservdL;


								private short ip65504P440ReservdS;

								private short ip65504P440ReservdL;


								private short ip65504P441ReservdS;

								private short ip65504P441ReservdL;


								private short ip65504P442ReservdS;

								private short ip65504P442ReservdL;


								private short ip65504P443ReservdS;

								private short ip65504P443ReservdL;


								private short ip65504P444ReservdS;

								private short ip65504P444ReservdL;


								private short ip65504P445ReservdS;

								private short ip65504P445ReservdL;


								private short ip65504P446ReservdS;

								private short ip65504P446ReservdL;


								private short ip65504P447ReservdS;

								private short ip65504P447ReservdL;


								private short ip65504P448ReservdS;

								private short ip65504P448ReservdL;


								private short ip65504P449ReservdS;

								private short ip65504P449ReservdL;


								private short ip65504P450ReservdS;

								private short ip65504P450ReservdL;


								private short ip65504P451ReservdS;

								private short ip65504P451ReservdL;


								private short ip65504P452ReservdS;

								private short ip65504P452ReservdL;


								private short ip65504P453ReservdS;

								private short ip65504P453ReservdL;


								private short ip65504P454ReservdS;

								private short ip65504P454ReservdL;


								private short ip65504P455ReservdS;

								private short ip65504P455ReservdL;


								private short ip65504P456ReservdS;

								private short ip65504P456ReservdL;


								private short ip65504P457ReservdS;

								private short ip65504P457ReservdL;


								private short ip65504P458ReservdS;

								private short ip65504P458ReservdL;


								private short ip65504P459ReservdS;

								private short ip65504P459ReservdL;


								private short ip65504P460ReservdS;

								private short ip65504P460ReservdL;


								private short ip65504P461ReservdS;

								private short ip65504P461ReservdL;


								private short ip65504P462ReservdS;

								private short ip65504P462ReservdL;


								private short ip65504P463ReservdS;

								private short ip65504P463ReservdL;


								private short ip65504P464ReservdS;

								private short ip65504P464ReservdL;


								private short ip65504P465ReservdS;

								private short ip65504P465ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup15
	**/
    public Ip65504PdsNamesLargeGroup15() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup15. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup15(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P435ReservdS
	 *	@return ip65504P435ReservdS
	 */
	public short getIp65504P435ReservdS() throws CFException {
        if (isIp65504P435ReservdSModified()) { 
           ip65504P435ReservdS = refreshIp65504P435ReservdS();
        }
   		return ip65504P435ReservdS;
	}
	
	/**
	 * 	Update Ip65504P435ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P435-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P435ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P435ReservdS = checkIp65504P435ReservdSMaxLimit(number); 
		serializeIp65504P435ReservdS(ip65504P435ReservdS);
	}

	public void setIp65504P435ReservdS(int number) {
	    number = checkIp65504P435ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P435ReservdS((short)number);
	}
	public void setIp65504P435ReservdS(long number) {
	    number = checkIp65504P435ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P435ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P435ReservdL
	 *	@return ip65504P435ReservdL
	 */
	public short getIp65504P435ReservdL() throws CFException {
        if (isIp65504P435ReservdLModified()) { 
           ip65504P435ReservdL = refreshIp65504P435ReservdL();
        }
   		return ip65504P435ReservdL;
	}
	
	/**
	 * 	Update Ip65504P435ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P435-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P435ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P435ReservdL = checkIp65504P435ReservdLMaxLimit(number); 
		serializeIp65504P435ReservdL(ip65504P435ReservdL);
	}

	public void setIp65504P435ReservdL(int number) {
	    number = checkIp65504P435ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P435ReservdL((short)number);
	}
	public void setIp65504P435ReservdL(long number) {
	    number = checkIp65504P435ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P435ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P436ReservdS
	 *	@return ip65504P436ReservdS
	 */
	public short getIp65504P436ReservdS() throws CFException {
        if (isIp65504P436ReservdSModified()) { 
           ip65504P436ReservdS = refreshIp65504P436ReservdS();
        }
   		return ip65504P436ReservdS;
	}
	
	/**
	 * 	Update Ip65504P436ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P436-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P436ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P436ReservdS = checkIp65504P436ReservdSMaxLimit(number); 
		serializeIp65504P436ReservdS(ip65504P436ReservdS);
	}

	public void setIp65504P436ReservdS(int number) {
	    number = checkIp65504P436ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P436ReservdS((short)number);
	}
	public void setIp65504P436ReservdS(long number) {
	    number = checkIp65504P436ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P436ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P436ReservdL
	 *	@return ip65504P436ReservdL
	 */
	public short getIp65504P436ReservdL() throws CFException {
        if (isIp65504P436ReservdLModified()) { 
           ip65504P436ReservdL = refreshIp65504P436ReservdL();
        }
   		return ip65504P436ReservdL;
	}
	
	/**
	 * 	Update Ip65504P436ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P436-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P436ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P436ReservdL = checkIp65504P436ReservdLMaxLimit(number); 
		serializeIp65504P436ReservdL(ip65504P436ReservdL);
	}

	public void setIp65504P436ReservdL(int number) {
	    number = checkIp65504P436ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P436ReservdL((short)number);
	}
	public void setIp65504P436ReservdL(long number) {
	    number = checkIp65504P436ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P436ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P437ReservdS
	 *	@return ip65504P437ReservdS
	 */
	public short getIp65504P437ReservdS() throws CFException {
        if (isIp65504P437ReservdSModified()) { 
           ip65504P437ReservdS = refreshIp65504P437ReservdS();
        }
   		return ip65504P437ReservdS;
	}
	
	/**
	 * 	Update Ip65504P437ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P437-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P437ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P437ReservdS = checkIp65504P437ReservdSMaxLimit(number); 
		serializeIp65504P437ReservdS(ip65504P437ReservdS);
	}

	public void setIp65504P437ReservdS(int number) {
	    number = checkIp65504P437ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P437ReservdS((short)number);
	}
	public void setIp65504P437ReservdS(long number) {
	    number = checkIp65504P437ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P437ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P437ReservdL
	 *	@return ip65504P437ReservdL
	 */
	public short getIp65504P437ReservdL() throws CFException {
        if (isIp65504P437ReservdLModified()) { 
           ip65504P437ReservdL = refreshIp65504P437ReservdL();
        }
   		return ip65504P437ReservdL;
	}
	
	/**
	 * 	Update Ip65504P437ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P437-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P437ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P437ReservdL = checkIp65504P437ReservdLMaxLimit(number); 
		serializeIp65504P437ReservdL(ip65504P437ReservdL);
	}

	public void setIp65504P437ReservdL(int number) {
	    number = checkIp65504P437ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P437ReservdL((short)number);
	}
	public void setIp65504P437ReservdL(long number) {
	    number = checkIp65504P437ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P437ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P438ReservdS
	 *	@return ip65504P438ReservdS
	 */
	public short getIp65504P438ReservdS() throws CFException {
        if (isIp65504P438ReservdSModified()) { 
           ip65504P438ReservdS = refreshIp65504P438ReservdS();
        }
   		return ip65504P438ReservdS;
	}
	
	/**
	 * 	Update Ip65504P438ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P438-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P438ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P438ReservdS = checkIp65504P438ReservdSMaxLimit(number); 
		serializeIp65504P438ReservdS(ip65504P438ReservdS);
	}

	public void setIp65504P438ReservdS(int number) {
	    number = checkIp65504P438ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P438ReservdS((short)number);
	}
	public void setIp65504P438ReservdS(long number) {
	    number = checkIp65504P438ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P438ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P438ReservdL
	 *	@return ip65504P438ReservdL
	 */
	public short getIp65504P438ReservdL() throws CFException {
        if (isIp65504P438ReservdLModified()) { 
           ip65504P438ReservdL = refreshIp65504P438ReservdL();
        }
   		return ip65504P438ReservdL;
	}
	
	/**
	 * 	Update Ip65504P438ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P438-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P438ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P438ReservdL = checkIp65504P438ReservdLMaxLimit(number); 
		serializeIp65504P438ReservdL(ip65504P438ReservdL);
	}

	public void setIp65504P438ReservdL(int number) {
	    number = checkIp65504P438ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P438ReservdL((short)number);
	}
	public void setIp65504P438ReservdL(long number) {
	    number = checkIp65504P438ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P438ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P439ReservdS
	 *	@return ip65504P439ReservdS
	 */
	public short getIp65504P439ReservdS() throws CFException {
        if (isIp65504P439ReservdSModified()) { 
           ip65504P439ReservdS = refreshIp65504P439ReservdS();
        }
   		return ip65504P439ReservdS;
	}
	
	/**
	 * 	Update Ip65504P439ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P439-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P439ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P439ReservdS = checkIp65504P439ReservdSMaxLimit(number); 
		serializeIp65504P439ReservdS(ip65504P439ReservdS);
	}

	public void setIp65504P439ReservdS(int number) {
	    number = checkIp65504P439ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P439ReservdS((short)number);
	}
	public void setIp65504P439ReservdS(long number) {
	    number = checkIp65504P439ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P439ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P439ReservdL
	 *	@return ip65504P439ReservdL
	 */
	public short getIp65504P439ReservdL() throws CFException {
        if (isIp65504P439ReservdLModified()) { 
           ip65504P439ReservdL = refreshIp65504P439ReservdL();
        }
   		return ip65504P439ReservdL;
	}
	
	/**
	 * 	Update Ip65504P439ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P439-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P439ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P439ReservdL = checkIp65504P439ReservdLMaxLimit(number); 
		serializeIp65504P439ReservdL(ip65504P439ReservdL);
	}

	public void setIp65504P439ReservdL(int number) {
	    number = checkIp65504P439ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P439ReservdL((short)number);
	}
	public void setIp65504P439ReservdL(long number) {
	    number = checkIp65504P439ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P439ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P440ReservdS
	 *	@return ip65504P440ReservdS
	 */
	public short getIp65504P440ReservdS() throws CFException {
        if (isIp65504P440ReservdSModified()) { 
           ip65504P440ReservdS = refreshIp65504P440ReservdS();
        }
   		return ip65504P440ReservdS;
	}
	
	/**
	 * 	Update Ip65504P440ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P440-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P440ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P440ReservdS = checkIp65504P440ReservdSMaxLimit(number); 
		serializeIp65504P440ReservdS(ip65504P440ReservdS);
	}

	public void setIp65504P440ReservdS(int number) {
	    number = checkIp65504P440ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P440ReservdS((short)number);
	}
	public void setIp65504P440ReservdS(long number) {
	    number = checkIp65504P440ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P440ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P440ReservdL
	 *	@return ip65504P440ReservdL
	 */
	public short getIp65504P440ReservdL() throws CFException {
        if (isIp65504P440ReservdLModified()) { 
           ip65504P440ReservdL = refreshIp65504P440ReservdL();
        }
   		return ip65504P440ReservdL;
	}
	
	/**
	 * 	Update Ip65504P440ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P440-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P440ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P440ReservdL = checkIp65504P440ReservdLMaxLimit(number); 
		serializeIp65504P440ReservdL(ip65504P440ReservdL);
	}

	public void setIp65504P440ReservdL(int number) {
	    number = checkIp65504P440ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P440ReservdL((short)number);
	}
	public void setIp65504P440ReservdL(long number) {
	    number = checkIp65504P440ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P440ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P441ReservdS
	 *	@return ip65504P441ReservdS
	 */
	public short getIp65504P441ReservdS() throws CFException {
        if (isIp65504P441ReservdSModified()) { 
           ip65504P441ReservdS = refreshIp65504P441ReservdS();
        }
   		return ip65504P441ReservdS;
	}
	
	/**
	 * 	Update Ip65504P441ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P441-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P441ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P441ReservdS = checkIp65504P441ReservdSMaxLimit(number); 
		serializeIp65504P441ReservdS(ip65504P441ReservdS);
	}

	public void setIp65504P441ReservdS(int number) {
	    number = checkIp65504P441ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P441ReservdS((short)number);
	}
	public void setIp65504P441ReservdS(long number) {
	    number = checkIp65504P441ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P441ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P441ReservdL
	 *	@return ip65504P441ReservdL
	 */
	public short getIp65504P441ReservdL() throws CFException {
        if (isIp65504P441ReservdLModified()) { 
           ip65504P441ReservdL = refreshIp65504P441ReservdL();
        }
   		return ip65504P441ReservdL;
	}
	
	/**
	 * 	Update Ip65504P441ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P441-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P441ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P441ReservdL = checkIp65504P441ReservdLMaxLimit(number); 
		serializeIp65504P441ReservdL(ip65504P441ReservdL);
	}

	public void setIp65504P441ReservdL(int number) {
	    number = checkIp65504P441ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P441ReservdL((short)number);
	}
	public void setIp65504P441ReservdL(long number) {
	    number = checkIp65504P441ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P441ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P442ReservdS
	 *	@return ip65504P442ReservdS
	 */
	public short getIp65504P442ReservdS() throws CFException {
        if (isIp65504P442ReservdSModified()) { 
           ip65504P442ReservdS = refreshIp65504P442ReservdS();
        }
   		return ip65504P442ReservdS;
	}
	
	/**
	 * 	Update Ip65504P442ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P442-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P442ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P442ReservdS = checkIp65504P442ReservdSMaxLimit(number); 
		serializeIp65504P442ReservdS(ip65504P442ReservdS);
	}

	public void setIp65504P442ReservdS(int number) {
	    number = checkIp65504P442ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P442ReservdS((short)number);
	}
	public void setIp65504P442ReservdS(long number) {
	    number = checkIp65504P442ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P442ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P442ReservdL
	 *	@return ip65504P442ReservdL
	 */
	public short getIp65504P442ReservdL() throws CFException {
        if (isIp65504P442ReservdLModified()) { 
           ip65504P442ReservdL = refreshIp65504P442ReservdL();
        }
   		return ip65504P442ReservdL;
	}
	
	/**
	 * 	Update Ip65504P442ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P442-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P442ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P442ReservdL = checkIp65504P442ReservdLMaxLimit(number); 
		serializeIp65504P442ReservdL(ip65504P442ReservdL);
	}

	public void setIp65504P442ReservdL(int number) {
	    number = checkIp65504P442ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P442ReservdL((short)number);
	}
	public void setIp65504P442ReservdL(long number) {
	    number = checkIp65504P442ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P442ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P443ReservdS
	 *	@return ip65504P443ReservdS
	 */
	public short getIp65504P443ReservdS() throws CFException {
        if (isIp65504P443ReservdSModified()) { 
           ip65504P443ReservdS = refreshIp65504P443ReservdS();
        }
   		return ip65504P443ReservdS;
	}
	
	/**
	 * 	Update Ip65504P443ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P443-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P443ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P443ReservdS = checkIp65504P443ReservdSMaxLimit(number); 
		serializeIp65504P443ReservdS(ip65504P443ReservdS);
	}

	public void setIp65504P443ReservdS(int number) {
	    number = checkIp65504P443ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P443ReservdS((short)number);
	}
	public void setIp65504P443ReservdS(long number) {
	    number = checkIp65504P443ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P443ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P443ReservdL
	 *	@return ip65504P443ReservdL
	 */
	public short getIp65504P443ReservdL() throws CFException {
        if (isIp65504P443ReservdLModified()) { 
           ip65504P443ReservdL = refreshIp65504P443ReservdL();
        }
   		return ip65504P443ReservdL;
	}
	
	/**
	 * 	Update Ip65504P443ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P443-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P443ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P443ReservdL = checkIp65504P443ReservdLMaxLimit(number); 
		serializeIp65504P443ReservdL(ip65504P443ReservdL);
	}

	public void setIp65504P443ReservdL(int number) {
	    number = checkIp65504P443ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P443ReservdL((short)number);
	}
	public void setIp65504P443ReservdL(long number) {
	    number = checkIp65504P443ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P443ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P444ReservdS
	 *	@return ip65504P444ReservdS
	 */
	public short getIp65504P444ReservdS() throws CFException {
        if (isIp65504P444ReservdSModified()) { 
           ip65504P444ReservdS = refreshIp65504P444ReservdS();
        }
   		return ip65504P444ReservdS;
	}
	
	/**
	 * 	Update Ip65504P444ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P444-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P444ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P444ReservdS = checkIp65504P444ReservdSMaxLimit(number); 
		serializeIp65504P444ReservdS(ip65504P444ReservdS);
	}

	public void setIp65504P444ReservdS(int number) {
	    number = checkIp65504P444ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P444ReservdS((short)number);
	}
	public void setIp65504P444ReservdS(long number) {
	    number = checkIp65504P444ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P444ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P444ReservdL
	 *	@return ip65504P444ReservdL
	 */
	public short getIp65504P444ReservdL() throws CFException {
        if (isIp65504P444ReservdLModified()) { 
           ip65504P444ReservdL = refreshIp65504P444ReservdL();
        }
   		return ip65504P444ReservdL;
	}
	
	/**
	 * 	Update Ip65504P444ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P444-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P444ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P444ReservdL = checkIp65504P444ReservdLMaxLimit(number); 
		serializeIp65504P444ReservdL(ip65504P444ReservdL);
	}

	public void setIp65504P444ReservdL(int number) {
	    number = checkIp65504P444ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P444ReservdL((short)number);
	}
	public void setIp65504P444ReservdL(long number) {
	    number = checkIp65504P444ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P444ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P445ReservdS
	 *	@return ip65504P445ReservdS
	 */
	public short getIp65504P445ReservdS() throws CFException {
        if (isIp65504P445ReservdSModified()) { 
           ip65504P445ReservdS = refreshIp65504P445ReservdS();
        }
   		return ip65504P445ReservdS;
	}
	
	/**
	 * 	Update Ip65504P445ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P445-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P445ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P445ReservdS = checkIp65504P445ReservdSMaxLimit(number); 
		serializeIp65504P445ReservdS(ip65504P445ReservdS);
	}

	public void setIp65504P445ReservdS(int number) {
	    number = checkIp65504P445ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P445ReservdS((short)number);
	}
	public void setIp65504P445ReservdS(long number) {
	    number = checkIp65504P445ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P445ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P445ReservdL
	 *	@return ip65504P445ReservdL
	 */
	public short getIp65504P445ReservdL() throws CFException {
        if (isIp65504P445ReservdLModified()) { 
           ip65504P445ReservdL = refreshIp65504P445ReservdL();
        }
   		return ip65504P445ReservdL;
	}
	
	/**
	 * 	Update Ip65504P445ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P445-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P445ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P445ReservdL = checkIp65504P445ReservdLMaxLimit(number); 
		serializeIp65504P445ReservdL(ip65504P445ReservdL);
	}

	public void setIp65504P445ReservdL(int number) {
	    number = checkIp65504P445ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P445ReservdL((short)number);
	}
	public void setIp65504P445ReservdL(long number) {
	    number = checkIp65504P445ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P445ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P446ReservdS
	 *	@return ip65504P446ReservdS
	 */
	public short getIp65504P446ReservdS() throws CFException {
        if (isIp65504P446ReservdSModified()) { 
           ip65504P446ReservdS = refreshIp65504P446ReservdS();
        }
   		return ip65504P446ReservdS;
	}
	
	/**
	 * 	Update Ip65504P446ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P446-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P446ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P446ReservdS = checkIp65504P446ReservdSMaxLimit(number); 
		serializeIp65504P446ReservdS(ip65504P446ReservdS);
	}

	public void setIp65504P446ReservdS(int number) {
	    number = checkIp65504P446ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P446ReservdS((short)number);
	}
	public void setIp65504P446ReservdS(long number) {
	    number = checkIp65504P446ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P446ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P446ReservdL
	 *	@return ip65504P446ReservdL
	 */
	public short getIp65504P446ReservdL() throws CFException {
        if (isIp65504P446ReservdLModified()) { 
           ip65504P446ReservdL = refreshIp65504P446ReservdL();
        }
   		return ip65504P446ReservdL;
	}
	
	/**
	 * 	Update Ip65504P446ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P446-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P446ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P446ReservdL = checkIp65504P446ReservdLMaxLimit(number); 
		serializeIp65504P446ReservdL(ip65504P446ReservdL);
	}

	public void setIp65504P446ReservdL(int number) {
	    number = checkIp65504P446ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P446ReservdL((short)number);
	}
	public void setIp65504P446ReservdL(long number) {
	    number = checkIp65504P446ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P446ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P447ReservdS
	 *	@return ip65504P447ReservdS
	 */
	public short getIp65504P447ReservdS() throws CFException {
        if (isIp65504P447ReservdSModified()) { 
           ip65504P447ReservdS = refreshIp65504P447ReservdS();
        }
   		return ip65504P447ReservdS;
	}
	
	/**
	 * 	Update Ip65504P447ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P447-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P447ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P447ReservdS = checkIp65504P447ReservdSMaxLimit(number); 
		serializeIp65504P447ReservdS(ip65504P447ReservdS);
	}

	public void setIp65504P447ReservdS(int number) {
	    number = checkIp65504P447ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P447ReservdS((short)number);
	}
	public void setIp65504P447ReservdS(long number) {
	    number = checkIp65504P447ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P447ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P447ReservdL
	 *	@return ip65504P447ReservdL
	 */
	public short getIp65504P447ReservdL() throws CFException {
        if (isIp65504P447ReservdLModified()) { 
           ip65504P447ReservdL = refreshIp65504P447ReservdL();
        }
   		return ip65504P447ReservdL;
	}
	
	/**
	 * 	Update Ip65504P447ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P447-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P447ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P447ReservdL = checkIp65504P447ReservdLMaxLimit(number); 
		serializeIp65504P447ReservdL(ip65504P447ReservdL);
	}

	public void setIp65504P447ReservdL(int number) {
	    number = checkIp65504P447ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P447ReservdL((short)number);
	}
	public void setIp65504P447ReservdL(long number) {
	    number = checkIp65504P447ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P447ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P448ReservdS
	 *	@return ip65504P448ReservdS
	 */
	public short getIp65504P448ReservdS() throws CFException {
        if (isIp65504P448ReservdSModified()) { 
           ip65504P448ReservdS = refreshIp65504P448ReservdS();
        }
   		return ip65504P448ReservdS;
	}
	
	/**
	 * 	Update Ip65504P448ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P448-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P448ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P448ReservdS = checkIp65504P448ReservdSMaxLimit(number); 
		serializeIp65504P448ReservdS(ip65504P448ReservdS);
	}

	public void setIp65504P448ReservdS(int number) {
	    number = checkIp65504P448ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P448ReservdS((short)number);
	}
	public void setIp65504P448ReservdS(long number) {
	    number = checkIp65504P448ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P448ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P448ReservdL
	 *	@return ip65504P448ReservdL
	 */
	public short getIp65504P448ReservdL() throws CFException {
        if (isIp65504P448ReservdLModified()) { 
           ip65504P448ReservdL = refreshIp65504P448ReservdL();
        }
   		return ip65504P448ReservdL;
	}
	
	/**
	 * 	Update Ip65504P448ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P448-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P448ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P448ReservdL = checkIp65504P448ReservdLMaxLimit(number); 
		serializeIp65504P448ReservdL(ip65504P448ReservdL);
	}

	public void setIp65504P448ReservdL(int number) {
	    number = checkIp65504P448ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P448ReservdL((short)number);
	}
	public void setIp65504P448ReservdL(long number) {
	    number = checkIp65504P448ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P448ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P449ReservdS
	 *	@return ip65504P449ReservdS
	 */
	public short getIp65504P449ReservdS() throws CFException {
        if (isIp65504P449ReservdSModified()) { 
           ip65504P449ReservdS = refreshIp65504P449ReservdS();
        }
   		return ip65504P449ReservdS;
	}
	
	/**
	 * 	Update Ip65504P449ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P449-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P449ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P449ReservdS = checkIp65504P449ReservdSMaxLimit(number); 
		serializeIp65504P449ReservdS(ip65504P449ReservdS);
	}

	public void setIp65504P449ReservdS(int number) {
	    number = checkIp65504P449ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P449ReservdS((short)number);
	}
	public void setIp65504P449ReservdS(long number) {
	    number = checkIp65504P449ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P449ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P449ReservdL
	 *	@return ip65504P449ReservdL
	 */
	public short getIp65504P449ReservdL() throws CFException {
        if (isIp65504P449ReservdLModified()) { 
           ip65504P449ReservdL = refreshIp65504P449ReservdL();
        }
   		return ip65504P449ReservdL;
	}
	
	/**
	 * 	Update Ip65504P449ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P449-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P449ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P449ReservdL = checkIp65504P449ReservdLMaxLimit(number); 
		serializeIp65504P449ReservdL(ip65504P449ReservdL);
	}

	public void setIp65504P449ReservdL(int number) {
	    number = checkIp65504P449ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P449ReservdL((short)number);
	}
	public void setIp65504P449ReservdL(long number) {
	    number = checkIp65504P449ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P449ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P450ReservdS
	 *	@return ip65504P450ReservdS
	 */
	public short getIp65504P450ReservdS() throws CFException {
        if (isIp65504P450ReservdSModified()) { 
           ip65504P450ReservdS = refreshIp65504P450ReservdS();
        }
   		return ip65504P450ReservdS;
	}
	
	/**
	 * 	Update Ip65504P450ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P450-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P450ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P450ReservdS = checkIp65504P450ReservdSMaxLimit(number); 
		serializeIp65504P450ReservdS(ip65504P450ReservdS);
	}

	public void setIp65504P450ReservdS(int number) {
	    number = checkIp65504P450ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P450ReservdS((short)number);
	}
	public void setIp65504P450ReservdS(long number) {
	    number = checkIp65504P450ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P450ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P450ReservdL
	 *	@return ip65504P450ReservdL
	 */
	public short getIp65504P450ReservdL() throws CFException {
        if (isIp65504P450ReservdLModified()) { 
           ip65504P450ReservdL = refreshIp65504P450ReservdL();
        }
   		return ip65504P450ReservdL;
	}
	
	/**
	 * 	Update Ip65504P450ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P450-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P450ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P450ReservdL = checkIp65504P450ReservdLMaxLimit(number); 
		serializeIp65504P450ReservdL(ip65504P450ReservdL);
	}

	public void setIp65504P450ReservdL(int number) {
	    number = checkIp65504P450ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P450ReservdL((short)number);
	}
	public void setIp65504P450ReservdL(long number) {
	    number = checkIp65504P450ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P450ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P451ReservdS
	 *	@return ip65504P451ReservdS
	 */
	public short getIp65504P451ReservdS() throws CFException {
        if (isIp65504P451ReservdSModified()) { 
           ip65504P451ReservdS = refreshIp65504P451ReservdS();
        }
   		return ip65504P451ReservdS;
	}
	
	/**
	 * 	Update Ip65504P451ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P451-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P451ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P451ReservdS = checkIp65504P451ReservdSMaxLimit(number); 
		serializeIp65504P451ReservdS(ip65504P451ReservdS);
	}

	public void setIp65504P451ReservdS(int number) {
	    number = checkIp65504P451ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P451ReservdS((short)number);
	}
	public void setIp65504P451ReservdS(long number) {
	    number = checkIp65504P451ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P451ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P451ReservdL
	 *	@return ip65504P451ReservdL
	 */
	public short getIp65504P451ReservdL() throws CFException {
        if (isIp65504P451ReservdLModified()) { 
           ip65504P451ReservdL = refreshIp65504P451ReservdL();
        }
   		return ip65504P451ReservdL;
	}
	
	/**
	 * 	Update Ip65504P451ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P451-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P451ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P451ReservdL = checkIp65504P451ReservdLMaxLimit(number); 
		serializeIp65504P451ReservdL(ip65504P451ReservdL);
	}

	public void setIp65504P451ReservdL(int number) {
	    number = checkIp65504P451ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P451ReservdL((short)number);
	}
	public void setIp65504P451ReservdL(long number) {
	    number = checkIp65504P451ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P451ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P452ReservdS
	 *	@return ip65504P452ReservdS
	 */
	public short getIp65504P452ReservdS() throws CFException {
        if (isIp65504P452ReservdSModified()) { 
           ip65504P452ReservdS = refreshIp65504P452ReservdS();
        }
   		return ip65504P452ReservdS;
	}
	
	/**
	 * 	Update Ip65504P452ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P452-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P452ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P452ReservdS = checkIp65504P452ReservdSMaxLimit(number); 
		serializeIp65504P452ReservdS(ip65504P452ReservdS);
	}

	public void setIp65504P452ReservdS(int number) {
	    number = checkIp65504P452ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P452ReservdS((short)number);
	}
	public void setIp65504P452ReservdS(long number) {
	    number = checkIp65504P452ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P452ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P452ReservdL
	 *	@return ip65504P452ReservdL
	 */
	public short getIp65504P452ReservdL() throws CFException {
        if (isIp65504P452ReservdLModified()) { 
           ip65504P452ReservdL = refreshIp65504P452ReservdL();
        }
   		return ip65504P452ReservdL;
	}
	
	/**
	 * 	Update Ip65504P452ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P452-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P452ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P452ReservdL = checkIp65504P452ReservdLMaxLimit(number); 
		serializeIp65504P452ReservdL(ip65504P452ReservdL);
	}

	public void setIp65504P452ReservdL(int number) {
	    number = checkIp65504P452ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P452ReservdL((short)number);
	}
	public void setIp65504P452ReservdL(long number) {
	    number = checkIp65504P452ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P452ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P453ReservdS
	 *	@return ip65504P453ReservdS
	 */
	public short getIp65504P453ReservdS() throws CFException {
        if (isIp65504P453ReservdSModified()) { 
           ip65504P453ReservdS = refreshIp65504P453ReservdS();
        }
   		return ip65504P453ReservdS;
	}
	
	/**
	 * 	Update Ip65504P453ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P453-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P453ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P453ReservdS = checkIp65504P453ReservdSMaxLimit(number); 
		serializeIp65504P453ReservdS(ip65504P453ReservdS);
	}

	public void setIp65504P453ReservdS(int number) {
	    number = checkIp65504P453ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P453ReservdS((short)number);
	}
	public void setIp65504P453ReservdS(long number) {
	    number = checkIp65504P453ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P453ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P453ReservdL
	 *	@return ip65504P453ReservdL
	 */
	public short getIp65504P453ReservdL() throws CFException {
        if (isIp65504P453ReservdLModified()) { 
           ip65504P453ReservdL = refreshIp65504P453ReservdL();
        }
   		return ip65504P453ReservdL;
	}
	
	/**
	 * 	Update Ip65504P453ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P453-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P453ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P453ReservdL = checkIp65504P453ReservdLMaxLimit(number); 
		serializeIp65504P453ReservdL(ip65504P453ReservdL);
	}

	public void setIp65504P453ReservdL(int number) {
	    number = checkIp65504P453ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P453ReservdL((short)number);
	}
	public void setIp65504P453ReservdL(long number) {
	    number = checkIp65504P453ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P453ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P454ReservdS
	 *	@return ip65504P454ReservdS
	 */
	public short getIp65504P454ReservdS() throws CFException {
        if (isIp65504P454ReservdSModified()) { 
           ip65504P454ReservdS = refreshIp65504P454ReservdS();
        }
   		return ip65504P454ReservdS;
	}
	
	/**
	 * 	Update Ip65504P454ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P454-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P454ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P454ReservdS = checkIp65504P454ReservdSMaxLimit(number); 
		serializeIp65504P454ReservdS(ip65504P454ReservdS);
	}

	public void setIp65504P454ReservdS(int number) {
	    number = checkIp65504P454ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P454ReservdS((short)number);
	}
	public void setIp65504P454ReservdS(long number) {
	    number = checkIp65504P454ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P454ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P454ReservdL
	 *	@return ip65504P454ReservdL
	 */
	public short getIp65504P454ReservdL() throws CFException {
        if (isIp65504P454ReservdLModified()) { 
           ip65504P454ReservdL = refreshIp65504P454ReservdL();
        }
   		return ip65504P454ReservdL;
	}
	
	/**
	 * 	Update Ip65504P454ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P454-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P454ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P454ReservdL = checkIp65504P454ReservdLMaxLimit(number); 
		serializeIp65504P454ReservdL(ip65504P454ReservdL);
	}

	public void setIp65504P454ReservdL(int number) {
	    number = checkIp65504P454ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P454ReservdL((short)number);
	}
	public void setIp65504P454ReservdL(long number) {
	    number = checkIp65504P454ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P454ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P455ReservdS
	 *	@return ip65504P455ReservdS
	 */
	public short getIp65504P455ReservdS() throws CFException {
        if (isIp65504P455ReservdSModified()) { 
           ip65504P455ReservdS = refreshIp65504P455ReservdS();
        }
   		return ip65504P455ReservdS;
	}
	
	/**
	 * 	Update Ip65504P455ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P455-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P455ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P455ReservdS = checkIp65504P455ReservdSMaxLimit(number); 
		serializeIp65504P455ReservdS(ip65504P455ReservdS);
	}

	public void setIp65504P455ReservdS(int number) {
	    number = checkIp65504P455ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P455ReservdS((short)number);
	}
	public void setIp65504P455ReservdS(long number) {
	    number = checkIp65504P455ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P455ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P455ReservdL
	 *	@return ip65504P455ReservdL
	 */
	public short getIp65504P455ReservdL() throws CFException {
        if (isIp65504P455ReservdLModified()) { 
           ip65504P455ReservdL = refreshIp65504P455ReservdL();
        }
   		return ip65504P455ReservdL;
	}
	
	/**
	 * 	Update Ip65504P455ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P455-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P455ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P455ReservdL = checkIp65504P455ReservdLMaxLimit(number); 
		serializeIp65504P455ReservdL(ip65504P455ReservdL);
	}

	public void setIp65504P455ReservdL(int number) {
	    number = checkIp65504P455ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P455ReservdL((short)number);
	}
	public void setIp65504P455ReservdL(long number) {
	    number = checkIp65504P455ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P455ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P456ReservdS
	 *	@return ip65504P456ReservdS
	 */
	public short getIp65504P456ReservdS() throws CFException {
        if (isIp65504P456ReservdSModified()) { 
           ip65504P456ReservdS = refreshIp65504P456ReservdS();
        }
   		return ip65504P456ReservdS;
	}
	
	/**
	 * 	Update Ip65504P456ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P456-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P456ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P456ReservdS = checkIp65504P456ReservdSMaxLimit(number); 
		serializeIp65504P456ReservdS(ip65504P456ReservdS);
	}

	public void setIp65504P456ReservdS(int number) {
	    number = checkIp65504P456ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P456ReservdS((short)number);
	}
	public void setIp65504P456ReservdS(long number) {
	    number = checkIp65504P456ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P456ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P456ReservdL
	 *	@return ip65504P456ReservdL
	 */
	public short getIp65504P456ReservdL() throws CFException {
        if (isIp65504P456ReservdLModified()) { 
           ip65504P456ReservdL = refreshIp65504P456ReservdL();
        }
   		return ip65504P456ReservdL;
	}
	
	/**
	 * 	Update Ip65504P456ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P456-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P456ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P456ReservdL = checkIp65504P456ReservdLMaxLimit(number); 
		serializeIp65504P456ReservdL(ip65504P456ReservdL);
	}

	public void setIp65504P456ReservdL(int number) {
	    number = checkIp65504P456ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P456ReservdL((short)number);
	}
	public void setIp65504P456ReservdL(long number) {
	    number = checkIp65504P456ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P456ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P457ReservdS
	 *	@return ip65504P457ReservdS
	 */
	public short getIp65504P457ReservdS() throws CFException {
        if (isIp65504P457ReservdSModified()) { 
           ip65504P457ReservdS = refreshIp65504P457ReservdS();
        }
   		return ip65504P457ReservdS;
	}
	
	/**
	 * 	Update Ip65504P457ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P457-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P457ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P457ReservdS = checkIp65504P457ReservdSMaxLimit(number); 
		serializeIp65504P457ReservdS(ip65504P457ReservdS);
	}

	public void setIp65504P457ReservdS(int number) {
	    number = checkIp65504P457ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P457ReservdS((short)number);
	}
	public void setIp65504P457ReservdS(long number) {
	    number = checkIp65504P457ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P457ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P457ReservdL
	 *	@return ip65504P457ReservdL
	 */
	public short getIp65504P457ReservdL() throws CFException {
        if (isIp65504P457ReservdLModified()) { 
           ip65504P457ReservdL = refreshIp65504P457ReservdL();
        }
   		return ip65504P457ReservdL;
	}
	
	/**
	 * 	Update Ip65504P457ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P457-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P457ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P457ReservdL = checkIp65504P457ReservdLMaxLimit(number); 
		serializeIp65504P457ReservdL(ip65504P457ReservdL);
	}

	public void setIp65504P457ReservdL(int number) {
	    number = checkIp65504P457ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P457ReservdL((short)number);
	}
	public void setIp65504P457ReservdL(long number) {
	    number = checkIp65504P457ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P457ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P458ReservdS
	 *	@return ip65504P458ReservdS
	 */
	public short getIp65504P458ReservdS() throws CFException {
        if (isIp65504P458ReservdSModified()) { 
           ip65504P458ReservdS = refreshIp65504P458ReservdS();
        }
   		return ip65504P458ReservdS;
	}
	
	/**
	 * 	Update Ip65504P458ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P458-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P458ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P458ReservdS = checkIp65504P458ReservdSMaxLimit(number); 
		serializeIp65504P458ReservdS(ip65504P458ReservdS);
	}

	public void setIp65504P458ReservdS(int number) {
	    number = checkIp65504P458ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P458ReservdS((short)number);
	}
	public void setIp65504P458ReservdS(long number) {
	    number = checkIp65504P458ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P458ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P458ReservdL
	 *	@return ip65504P458ReservdL
	 */
	public short getIp65504P458ReservdL() throws CFException {
        if (isIp65504P458ReservdLModified()) { 
           ip65504P458ReservdL = refreshIp65504P458ReservdL();
        }
   		return ip65504P458ReservdL;
	}
	
	/**
	 * 	Update Ip65504P458ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P458-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P458ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P458ReservdL = checkIp65504P458ReservdLMaxLimit(number); 
		serializeIp65504P458ReservdL(ip65504P458ReservdL);
	}

	public void setIp65504P458ReservdL(int number) {
	    number = checkIp65504P458ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P458ReservdL((short)number);
	}
	public void setIp65504P458ReservdL(long number) {
	    number = checkIp65504P458ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P458ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P459ReservdS
	 *	@return ip65504P459ReservdS
	 */
	public short getIp65504P459ReservdS() throws CFException {
        if (isIp65504P459ReservdSModified()) { 
           ip65504P459ReservdS = refreshIp65504P459ReservdS();
        }
   		return ip65504P459ReservdS;
	}
	
	/**
	 * 	Update Ip65504P459ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P459-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P459ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P459ReservdS = checkIp65504P459ReservdSMaxLimit(number); 
		serializeIp65504P459ReservdS(ip65504P459ReservdS);
	}

	public void setIp65504P459ReservdS(int number) {
	    number = checkIp65504P459ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P459ReservdS((short)number);
	}
	public void setIp65504P459ReservdS(long number) {
	    number = checkIp65504P459ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P459ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P459ReservdL
	 *	@return ip65504P459ReservdL
	 */
	public short getIp65504P459ReservdL() throws CFException {
        if (isIp65504P459ReservdLModified()) { 
           ip65504P459ReservdL = refreshIp65504P459ReservdL();
        }
   		return ip65504P459ReservdL;
	}
	
	/**
	 * 	Update Ip65504P459ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P459-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P459ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P459ReservdL = checkIp65504P459ReservdLMaxLimit(number); 
		serializeIp65504P459ReservdL(ip65504P459ReservdL);
	}

	public void setIp65504P459ReservdL(int number) {
	    number = checkIp65504P459ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P459ReservdL((short)number);
	}
	public void setIp65504P459ReservdL(long number) {
	    number = checkIp65504P459ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P459ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P460ReservdS
	 *	@return ip65504P460ReservdS
	 */
	public short getIp65504P460ReservdS() throws CFException {
        if (isIp65504P460ReservdSModified()) { 
           ip65504P460ReservdS = refreshIp65504P460ReservdS();
        }
   		return ip65504P460ReservdS;
	}
	
	/**
	 * 	Update Ip65504P460ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P460-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P460ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P460ReservdS = checkIp65504P460ReservdSMaxLimit(number); 
		serializeIp65504P460ReservdS(ip65504P460ReservdS);
	}

	public void setIp65504P460ReservdS(int number) {
	    number = checkIp65504P460ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P460ReservdS((short)number);
	}
	public void setIp65504P460ReservdS(long number) {
	    number = checkIp65504P460ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P460ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P460ReservdL
	 *	@return ip65504P460ReservdL
	 */
	public short getIp65504P460ReservdL() throws CFException {
        if (isIp65504P460ReservdLModified()) { 
           ip65504P460ReservdL = refreshIp65504P460ReservdL();
        }
   		return ip65504P460ReservdL;
	}
	
	/**
	 * 	Update Ip65504P460ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P460-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P460ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P460ReservdL = checkIp65504P460ReservdLMaxLimit(number); 
		serializeIp65504P460ReservdL(ip65504P460ReservdL);
	}

	public void setIp65504P460ReservdL(int number) {
	    number = checkIp65504P460ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P460ReservdL((short)number);
	}
	public void setIp65504P460ReservdL(long number) {
	    number = checkIp65504P460ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P460ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P461ReservdS
	 *	@return ip65504P461ReservdS
	 */
	public short getIp65504P461ReservdS() throws CFException {
        if (isIp65504P461ReservdSModified()) { 
           ip65504P461ReservdS = refreshIp65504P461ReservdS();
        }
   		return ip65504P461ReservdS;
	}
	
	/**
	 * 	Update Ip65504P461ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P461-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P461ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P461ReservdS = checkIp65504P461ReservdSMaxLimit(number); 
		serializeIp65504P461ReservdS(ip65504P461ReservdS);
	}

	public void setIp65504P461ReservdS(int number) {
	    number = checkIp65504P461ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P461ReservdS((short)number);
	}
	public void setIp65504P461ReservdS(long number) {
	    number = checkIp65504P461ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P461ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P461ReservdL
	 *	@return ip65504P461ReservdL
	 */
	public short getIp65504P461ReservdL() throws CFException {
        if (isIp65504P461ReservdLModified()) { 
           ip65504P461ReservdL = refreshIp65504P461ReservdL();
        }
   		return ip65504P461ReservdL;
	}
	
	/**
	 * 	Update Ip65504P461ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P461-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P461ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P461ReservdL = checkIp65504P461ReservdLMaxLimit(number); 
		serializeIp65504P461ReservdL(ip65504P461ReservdL);
	}

	public void setIp65504P461ReservdL(int number) {
	    number = checkIp65504P461ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P461ReservdL((short)number);
	}
	public void setIp65504P461ReservdL(long number) {
	    number = checkIp65504P461ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P461ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P462ReservdS
	 *	@return ip65504P462ReservdS
	 */
	public short getIp65504P462ReservdS() throws CFException {
        if (isIp65504P462ReservdSModified()) { 
           ip65504P462ReservdS = refreshIp65504P462ReservdS();
        }
   		return ip65504P462ReservdS;
	}
	
	/**
	 * 	Update Ip65504P462ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P462-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P462ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P462ReservdS = checkIp65504P462ReservdSMaxLimit(number); 
		serializeIp65504P462ReservdS(ip65504P462ReservdS);
	}

	public void setIp65504P462ReservdS(int number) {
	    number = checkIp65504P462ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P462ReservdS((short)number);
	}
	public void setIp65504P462ReservdS(long number) {
	    number = checkIp65504P462ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P462ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P462ReservdL
	 *	@return ip65504P462ReservdL
	 */
	public short getIp65504P462ReservdL() throws CFException {
        if (isIp65504P462ReservdLModified()) { 
           ip65504P462ReservdL = refreshIp65504P462ReservdL();
        }
   		return ip65504P462ReservdL;
	}
	
	/**
	 * 	Update Ip65504P462ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P462-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P462ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P462ReservdL = checkIp65504P462ReservdLMaxLimit(number); 
		serializeIp65504P462ReservdL(ip65504P462ReservdL);
	}

	public void setIp65504P462ReservdL(int number) {
	    number = checkIp65504P462ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P462ReservdL((short)number);
	}
	public void setIp65504P462ReservdL(long number) {
	    number = checkIp65504P462ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P462ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P463ReservdS
	 *	@return ip65504P463ReservdS
	 */
	public short getIp65504P463ReservdS() throws CFException {
        if (isIp65504P463ReservdSModified()) { 
           ip65504P463ReservdS = refreshIp65504P463ReservdS();
        }
   		return ip65504P463ReservdS;
	}
	
	/**
	 * 	Update Ip65504P463ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P463-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P463ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P463ReservdS = checkIp65504P463ReservdSMaxLimit(number); 
		serializeIp65504P463ReservdS(ip65504P463ReservdS);
	}

	public void setIp65504P463ReservdS(int number) {
	    number = checkIp65504P463ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P463ReservdS((short)number);
	}
	public void setIp65504P463ReservdS(long number) {
	    number = checkIp65504P463ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P463ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P463ReservdL
	 *	@return ip65504P463ReservdL
	 */
	public short getIp65504P463ReservdL() throws CFException {
        if (isIp65504P463ReservdLModified()) { 
           ip65504P463ReservdL = refreshIp65504P463ReservdL();
        }
   		return ip65504P463ReservdL;
	}
	
	/**
	 * 	Update Ip65504P463ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P463-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P463ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P463ReservdL = checkIp65504P463ReservdLMaxLimit(number); 
		serializeIp65504P463ReservdL(ip65504P463ReservdL);
	}

	public void setIp65504P463ReservdL(int number) {
	    number = checkIp65504P463ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P463ReservdL((short)number);
	}
	public void setIp65504P463ReservdL(long number) {
	    number = checkIp65504P463ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P463ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P464ReservdS
	 *	@return ip65504P464ReservdS
	 */
	public short getIp65504P464ReservdS() throws CFException {
        if (isIp65504P464ReservdSModified()) { 
           ip65504P464ReservdS = refreshIp65504P464ReservdS();
        }
   		return ip65504P464ReservdS;
	}
	
	/**
	 * 	Update Ip65504P464ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P464-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P464ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P464ReservdS = checkIp65504P464ReservdSMaxLimit(number); 
		serializeIp65504P464ReservdS(ip65504P464ReservdS);
	}

	public void setIp65504P464ReservdS(int number) {
	    number = checkIp65504P464ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P464ReservdS((short)number);
	}
	public void setIp65504P464ReservdS(long number) {
	    number = checkIp65504P464ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P464ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P464ReservdL
	 *	@return ip65504P464ReservdL
	 */
	public short getIp65504P464ReservdL() throws CFException {
        if (isIp65504P464ReservdLModified()) { 
           ip65504P464ReservdL = refreshIp65504P464ReservdL();
        }
   		return ip65504P464ReservdL;
	}
	
	/**
	 * 	Update Ip65504P464ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P464-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P464ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P464ReservdL = checkIp65504P464ReservdLMaxLimit(number); 
		serializeIp65504P464ReservdL(ip65504P464ReservdL);
	}

	public void setIp65504P464ReservdL(int number) {
	    number = checkIp65504P464ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P464ReservdL((short)number);
	}
	public void setIp65504P464ReservdL(long number) {
	    number = checkIp65504P464ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P464ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P465ReservdS
	 *	@return ip65504P465ReservdS
	 */
	public short getIp65504P465ReservdS() throws CFException {
        if (isIp65504P465ReservdSModified()) { 
           ip65504P465ReservdS = refreshIp65504P465ReservdS();
        }
   		return ip65504P465ReservdS;
	}
	
	/**
	 * 	Update Ip65504P465ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P465-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P465ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P465ReservdS = checkIp65504P465ReservdSMaxLimit(number); 
		serializeIp65504P465ReservdS(ip65504P465ReservdS);
	}

	public void setIp65504P465ReservdS(int number) {
	    number = checkIp65504P465ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P465ReservdS((short)number);
	}
	public void setIp65504P465ReservdS(long number) {
	    number = checkIp65504P465ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P465ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P465ReservdL
	 *	@return ip65504P465ReservdL
	 */
	public short getIp65504P465ReservdL() throws CFException {
        if (isIp65504P465ReservdLModified()) { 
           ip65504P465ReservdL = refreshIp65504P465ReservdL();
        }
   		return ip65504P465ReservdL;
	}
	
	/**
	 * 	Update Ip65504P465ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P465-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P465ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P465ReservdL = checkIp65504P465ReservdLMaxLimit(number); 
		serializeIp65504P465ReservdL(ip65504P465ReservdL);
	}

	public void setIp65504P465ReservdL(int number) {
	    number = checkIp65504P465ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P465ReservdL((short)number);
	}
	public void setIp65504P465ReservdL(long number) {
	    number = checkIp65504P465ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P465ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup15
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P435ReservdS((short)0);
         	setIp65504P435ReservdL((short)0);
         	setIp65504P436ReservdS((short)0);
         	setIp65504P436ReservdL((short)0);
         	setIp65504P437ReservdS((short)0);
         	setIp65504P437ReservdL((short)0);
         	setIp65504P438ReservdS((short)0);
         	setIp65504P438ReservdL((short)0);
         	setIp65504P439ReservdS((short)0);
         	setIp65504P439ReservdL((short)0);
         	setIp65504P440ReservdS((short)0);
         	setIp65504P440ReservdL((short)0);
         	setIp65504P441ReservdS((short)0);
         	setIp65504P441ReservdL((short)0);
         	setIp65504P442ReservdS((short)0);
         	setIp65504P442ReservdL((short)0);
         	setIp65504P443ReservdS((short)0);
         	setIp65504P443ReservdL((short)0);
         	setIp65504P444ReservdS((short)0);
         	setIp65504P444ReservdL((short)0);
         	setIp65504P445ReservdS((short)0);
         	setIp65504P445ReservdL((short)0);
         	setIp65504P446ReservdS((short)0);
         	setIp65504P446ReservdL((short)0);
         	setIp65504P447ReservdS((short)0);
         	setIp65504P447ReservdL((short)0);
         	setIp65504P448ReservdS((short)0);
         	setIp65504P448ReservdL((short)0);
         	setIp65504P449ReservdS((short)0);
         	setIp65504P449ReservdL((short)0);
         	setIp65504P450ReservdS((short)0);
         	setIp65504P450ReservdL((short)0);
         	setIp65504P451ReservdS((short)0);
         	setIp65504P451ReservdL((short)0);
         	setIp65504P452ReservdS((short)0);
         	setIp65504P452ReservdL((short)0);
         	setIp65504P453ReservdS((short)0);
         	setIp65504P453ReservdL((short)0);
         	setIp65504P454ReservdS((short)0);
         	setIp65504P454ReservdL((short)0);
         	setIp65504P455ReservdS((short)0);
         	setIp65504P455ReservdL((short)0);
         	setIp65504P456ReservdS((short)0);
         	setIp65504P456ReservdL((short)0);
         	setIp65504P457ReservdS((short)0);
         	setIp65504P457ReservdL((short)0);
         	setIp65504P458ReservdS((short)0);
         	setIp65504P458ReservdL((short)0);
         	setIp65504P459ReservdS((short)0);
         	setIp65504P459ReservdL((short)0);
         	setIp65504P460ReservdS((short)0);
         	setIp65504P460ReservdL((short)0);
         	setIp65504P461ReservdS((short)0);
         	setIp65504P461ReservdL((short)0);
         	setIp65504P462ReservdS((short)0);
         	setIp65504P462ReservdL((short)0);
         	setIp65504P463ReservdS((short)0);
         	setIp65504P463ReservdL((short)0);
         	setIp65504P464ReservdS((short)0);
         	setIp65504P464ReservdL((short)0);
         	setIp65504P465ReservdS((short)0);
         	setIp65504P465ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup15FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_15_LENGTH;
		}

}
  
