package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup6 extends Ip65504PdsNamesLargeGroup6Serialized { 
   

								private short ip65504P156ReservdS;

								private short ip65504P156ReservdL;


								private short ip65504P157AcqCurS;

								private short ip65504P157AcqCurL;


								private short ip65504P158BusActS;

								private short ip65504P158BusActL;


								private short ip65504P159Settle1S;

								private short ip65504P159Settle1L;


								private short ip65504P160ReservdS;

								private short ip65504P160ReservdL;


								private short ip65504P161Settle2S;

								private short ip65504P161Settle2L;


								private short ip65504P162ReservdS;

								private short ip65504P162ReservdL;


								private short ip65504P163ReservdS;

								private short ip65504P163ReservdL;


								private short ip65504P164CurRteS;

								private short ip65504P164CurRteL;


								private short ip65504P165SetlIdS;

								private short ip65504P165SetlIdL;


								private short ip65504P166ReservdS;

								private short ip65504P166ReservdL;


								private short ip65504P167ReservdS;

								private short ip65504P167ReservdL;


								private short ip65504P168ReservdS;

								private short ip65504P168ReservdL;


								private short ip65504P169ReservdS;

								private short ip65504P169ReservdL;


								private short ip65504P170MerInqS;

								private short ip65504P170MerInqL;


								private short ip65504P171AltmdesS;

								private short ip65504P171AltmdesL;


								private short ip65504P172PropNmS;

								private short ip65504P172PropNmL;


								private short ip65504P173CorpNmS;

								private short ip65504P173CorpNmL;


								private short ip65504P174DunbradS;

								private short ip65504P174DunbradL;


								private short ip65504P175CardAccptUrlS;

								private short ip65504P175CardAccptUrlL;


								private short ip65504P176ReservdS;

								private short ip65504P176ReservdL;


								private short ip65504P177ReservdS;

								private short ip65504P177ReservdL;


								private short ip65504P178ReservdS;

								private short ip65504P178ReservdL;


								private short ip65504P179ReservdS;

								private short ip65504P179ReservdL;


								private short ip65504P180ReservdS;

								private short ip65504P180ReservdL;


								private short ip65504P181ReservdS;

								private short ip65504P181ReservdL;


								private short ip65504P182ReservdS;

								private short ip65504P182ReservdL;


								private short ip65504P183ReservdS;

								private short ip65504P183ReservdL;


								private short ip65504P184ReservdS;

								private short ip65504P184ReservdL;


								private short ip65504P185ReservdS;

								private short ip65504P185ReservdL;


								private short ip65504P186ReservdS;

								private short ip65504P186ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup6
	**/
    public Ip65504PdsNamesLargeGroup6() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup6. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup6(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P156ReservdS
	 *	@return ip65504P156ReservdS
	 */
	public short getIp65504P156ReservdS() throws CFException {
        if (isIp65504P156ReservdSModified()) { 
           ip65504P156ReservdS = refreshIp65504P156ReservdS();
        }
   		return ip65504P156ReservdS;
	}
	
	/**
	 * 	Update Ip65504P156ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P156-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P156ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P156ReservdS = checkIp65504P156ReservdSMaxLimit(number); 
		serializeIp65504P156ReservdS(ip65504P156ReservdS);
	}

	public void setIp65504P156ReservdS(int number) {
	    number = checkIp65504P156ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P156ReservdS((short)number);
	}
	public void setIp65504P156ReservdS(long number) {
	    number = checkIp65504P156ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P156ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P156ReservdL
	 *	@return ip65504P156ReservdL
	 */
	public short getIp65504P156ReservdL() throws CFException {
        if (isIp65504P156ReservdLModified()) { 
           ip65504P156ReservdL = refreshIp65504P156ReservdL();
        }
   		return ip65504P156ReservdL;
	}
	
	/**
	 * 	Update Ip65504P156ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P156-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P156ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P156ReservdL = checkIp65504P156ReservdLMaxLimit(number); 
		serializeIp65504P156ReservdL(ip65504P156ReservdL);
	}

	public void setIp65504P156ReservdL(int number) {
	    number = checkIp65504P156ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P156ReservdL((short)number);
	}
	public void setIp65504P156ReservdL(long number) {
	    number = checkIp65504P156ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P156ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P157AcqCurS
	 *	@return ip65504P157AcqCurS
	 */
	public short getIp65504P157AcqCurS() throws CFException {
        if (isIp65504P157AcqCurSModified()) { 
           ip65504P157AcqCurS = refreshIp65504P157AcqCurS();
        }
   		return ip65504P157AcqCurS;
	}
	
	/**
	 * 	Update Ip65504P157AcqCurS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P157-ACQ-CUR-S
	 *	@param number
	 */
	public void setIp65504P157AcqCurS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P157AcqCurS = checkIp65504P157AcqCurSMaxLimit(number); 
		serializeIp65504P157AcqCurS(ip65504P157AcqCurS);
	}

	public void setIp65504P157AcqCurS(int number) {
	    number = checkIp65504P157AcqCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P157AcqCurS((short)number);
	}
	public void setIp65504P157AcqCurS(long number) {
	    number = checkIp65504P157AcqCurSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P157AcqCurS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P157AcqCurL
	 *	@return ip65504P157AcqCurL
	 */
	public short getIp65504P157AcqCurL() throws CFException {
        if (isIp65504P157AcqCurLModified()) { 
           ip65504P157AcqCurL = refreshIp65504P157AcqCurL();
        }
   		return ip65504P157AcqCurL;
	}
	
	/**
	 * 	Update Ip65504P157AcqCurL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P157-ACQ-CUR-L
	 *	@param number
	 */
	public void setIp65504P157AcqCurL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P157AcqCurL = checkIp65504P157AcqCurLMaxLimit(number); 
		serializeIp65504P157AcqCurL(ip65504P157AcqCurL);
	}

	public void setIp65504P157AcqCurL(int number) {
	    number = checkIp65504P157AcqCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P157AcqCurL((short)number);
	}
	public void setIp65504P157AcqCurL(long number) {
	    number = checkIp65504P157AcqCurLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P157AcqCurL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P158BusActS
	 *	@return ip65504P158BusActS
	 */
	public short getIp65504P158BusActS() throws CFException {
        if (isIp65504P158BusActSModified()) { 
           ip65504P158BusActS = refreshIp65504P158BusActS();
        }
   		return ip65504P158BusActS;
	}
	
	/**
	 * 	Update Ip65504P158BusActS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P158-BUS-ACT-S
	 *	@param number
	 */
	public void setIp65504P158BusActS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P158BusActS = checkIp65504P158BusActSMaxLimit(number); 
		serializeIp65504P158BusActS(ip65504P158BusActS);
	}

	public void setIp65504P158BusActS(int number) {
	    number = checkIp65504P158BusActSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P158BusActS((short)number);
	}
	public void setIp65504P158BusActS(long number) {
	    number = checkIp65504P158BusActSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P158BusActS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P158BusActL
	 *	@return ip65504P158BusActL
	 */
	public short getIp65504P158BusActL() throws CFException {
        if (isIp65504P158BusActLModified()) { 
           ip65504P158BusActL = refreshIp65504P158BusActL();
        }
   		return ip65504P158BusActL;
	}
	
	/**
	 * 	Update Ip65504P158BusActL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P158-BUS-ACT-L
	 *	@param number
	 */
	public void setIp65504P158BusActL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P158BusActL = checkIp65504P158BusActLMaxLimit(number); 
		serializeIp65504P158BusActL(ip65504P158BusActL);
	}

	public void setIp65504P158BusActL(int number) {
	    number = checkIp65504P158BusActLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P158BusActL((short)number);
	}
	public void setIp65504P158BusActL(long number) {
	    number = checkIp65504P158BusActLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P158BusActL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P159Settle1S
	 *	@return ip65504P159Settle1S
	 */
	public short getIp65504P159Settle1S() throws CFException {
        if (isIp65504P159Settle1SModified()) { 
           ip65504P159Settle1S = refreshIp65504P159Settle1S();
        }
   		return ip65504P159Settle1S;
	}
	
	/**
	 * 	Update Ip65504P159Settle1S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P159-SETTLE1-S
	 *	@param number
	 */
	public void setIp65504P159Settle1S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P159Settle1S = checkIp65504P159Settle1SMaxLimit(number); 
		serializeIp65504P159Settle1S(ip65504P159Settle1S);
	}

	public void setIp65504P159Settle1S(int number) {
	    number = checkIp65504P159Settle1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P159Settle1S((short)number);
	}
	public void setIp65504P159Settle1S(long number) {
	    number = checkIp65504P159Settle1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P159Settle1S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P159Settle1L
	 *	@return ip65504P159Settle1L
	 */
	public short getIp65504P159Settle1L() throws CFException {
        if (isIp65504P159Settle1LModified()) { 
           ip65504P159Settle1L = refreshIp65504P159Settle1L();
        }
   		return ip65504P159Settle1L;
	}
	
	/**
	 * 	Update Ip65504P159Settle1L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P159-SETTLE1-L
	 *	@param number
	 */
	public void setIp65504P159Settle1L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P159Settle1L = checkIp65504P159Settle1LMaxLimit(number); 
		serializeIp65504P159Settle1L(ip65504P159Settle1L);
	}

	public void setIp65504P159Settle1L(int number) {
	    number = checkIp65504P159Settle1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P159Settle1L((short)number);
	}
	public void setIp65504P159Settle1L(long number) {
	    number = checkIp65504P159Settle1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P159Settle1L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P160ReservdS
	 *	@return ip65504P160ReservdS
	 */
	public short getIp65504P160ReservdS() throws CFException {
        if (isIp65504P160ReservdSModified()) { 
           ip65504P160ReservdS = refreshIp65504P160ReservdS();
        }
   		return ip65504P160ReservdS;
	}
	
	/**
	 * 	Update Ip65504P160ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P160-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P160ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P160ReservdS = checkIp65504P160ReservdSMaxLimit(number); 
		serializeIp65504P160ReservdS(ip65504P160ReservdS);
	}

	public void setIp65504P160ReservdS(int number) {
	    number = checkIp65504P160ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P160ReservdS((short)number);
	}
	public void setIp65504P160ReservdS(long number) {
	    number = checkIp65504P160ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P160ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P160ReservdL
	 *	@return ip65504P160ReservdL
	 */
	public short getIp65504P160ReservdL() throws CFException {
        if (isIp65504P160ReservdLModified()) { 
           ip65504P160ReservdL = refreshIp65504P160ReservdL();
        }
   		return ip65504P160ReservdL;
	}
	
	/**
	 * 	Update Ip65504P160ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P160-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P160ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P160ReservdL = checkIp65504P160ReservdLMaxLimit(number); 
		serializeIp65504P160ReservdL(ip65504P160ReservdL);
	}

	public void setIp65504P160ReservdL(int number) {
	    number = checkIp65504P160ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P160ReservdL((short)number);
	}
	public void setIp65504P160ReservdL(long number) {
	    number = checkIp65504P160ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P160ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P161Settle2S
	 *	@return ip65504P161Settle2S
	 */
	public short getIp65504P161Settle2S() throws CFException {
        if (isIp65504P161Settle2SModified()) { 
           ip65504P161Settle2S = refreshIp65504P161Settle2S();
        }
   		return ip65504P161Settle2S;
	}
	
	/**
	 * 	Update Ip65504P161Settle2S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P161-SETTLE2-S
	 *	@param number
	 */
	public void setIp65504P161Settle2S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P161Settle2S = checkIp65504P161Settle2SMaxLimit(number); 
		serializeIp65504P161Settle2S(ip65504P161Settle2S);
	}

	public void setIp65504P161Settle2S(int number) {
	    number = checkIp65504P161Settle2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P161Settle2S((short)number);
	}
	public void setIp65504P161Settle2S(long number) {
	    number = checkIp65504P161Settle2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P161Settle2S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P161Settle2L
	 *	@return ip65504P161Settle2L
	 */
	public short getIp65504P161Settle2L() throws CFException {
        if (isIp65504P161Settle2LModified()) { 
           ip65504P161Settle2L = refreshIp65504P161Settle2L();
        }
   		return ip65504P161Settle2L;
	}
	
	/**
	 * 	Update Ip65504P161Settle2L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P161-SETTLE2-L
	 *	@param number
	 */
	public void setIp65504P161Settle2L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P161Settle2L = checkIp65504P161Settle2LMaxLimit(number); 
		serializeIp65504P161Settle2L(ip65504P161Settle2L);
	}

	public void setIp65504P161Settle2L(int number) {
	    number = checkIp65504P161Settle2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P161Settle2L((short)number);
	}
	public void setIp65504P161Settle2L(long number) {
	    number = checkIp65504P161Settle2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P161Settle2L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P162ReservdS
	 *	@return ip65504P162ReservdS
	 */
	public short getIp65504P162ReservdS() throws CFException {
        if (isIp65504P162ReservdSModified()) { 
           ip65504P162ReservdS = refreshIp65504P162ReservdS();
        }
   		return ip65504P162ReservdS;
	}
	
	/**
	 * 	Update Ip65504P162ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P162-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P162ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P162ReservdS = checkIp65504P162ReservdSMaxLimit(number); 
		serializeIp65504P162ReservdS(ip65504P162ReservdS);
	}

	public void setIp65504P162ReservdS(int number) {
	    number = checkIp65504P162ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P162ReservdS((short)number);
	}
	public void setIp65504P162ReservdS(long number) {
	    number = checkIp65504P162ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P162ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P162ReservdL
	 *	@return ip65504P162ReservdL
	 */
	public short getIp65504P162ReservdL() throws CFException {
        if (isIp65504P162ReservdLModified()) { 
           ip65504P162ReservdL = refreshIp65504P162ReservdL();
        }
   		return ip65504P162ReservdL;
	}
	
	/**
	 * 	Update Ip65504P162ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P162-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P162ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P162ReservdL = checkIp65504P162ReservdLMaxLimit(number); 
		serializeIp65504P162ReservdL(ip65504P162ReservdL);
	}

	public void setIp65504P162ReservdL(int number) {
	    number = checkIp65504P162ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P162ReservdL((short)number);
	}
	public void setIp65504P162ReservdL(long number) {
	    number = checkIp65504P162ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P162ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P163ReservdS
	 *	@return ip65504P163ReservdS
	 */
	public short getIp65504P163ReservdS() throws CFException {
        if (isIp65504P163ReservdSModified()) { 
           ip65504P163ReservdS = refreshIp65504P163ReservdS();
        }
   		return ip65504P163ReservdS;
	}
	
	/**
	 * 	Update Ip65504P163ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P163-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P163ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P163ReservdS = checkIp65504P163ReservdSMaxLimit(number); 
		serializeIp65504P163ReservdS(ip65504P163ReservdS);
	}

	public void setIp65504P163ReservdS(int number) {
	    number = checkIp65504P163ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P163ReservdS((short)number);
	}
	public void setIp65504P163ReservdS(long number) {
	    number = checkIp65504P163ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P163ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P163ReservdL
	 *	@return ip65504P163ReservdL
	 */
	public short getIp65504P163ReservdL() throws CFException {
        if (isIp65504P163ReservdLModified()) { 
           ip65504P163ReservdL = refreshIp65504P163ReservdL();
        }
   		return ip65504P163ReservdL;
	}
	
	/**
	 * 	Update Ip65504P163ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P163-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P163ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P163ReservdL = checkIp65504P163ReservdLMaxLimit(number); 
		serializeIp65504P163ReservdL(ip65504P163ReservdL);
	}

	public void setIp65504P163ReservdL(int number) {
	    number = checkIp65504P163ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P163ReservdL((short)number);
	}
	public void setIp65504P163ReservdL(long number) {
	    number = checkIp65504P163ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P163ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P164CurRteS
	 *	@return ip65504P164CurRteS
	 */
	public short getIp65504P164CurRteS() throws CFException {
        if (isIp65504P164CurRteSModified()) { 
           ip65504P164CurRteS = refreshIp65504P164CurRteS();
        }
   		return ip65504P164CurRteS;
	}
	
	/**
	 * 	Update Ip65504P164CurRteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P164-CUR-RTE-S
	 *	@param number
	 */
	public void setIp65504P164CurRteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P164CurRteS = checkIp65504P164CurRteSMaxLimit(number); 
		serializeIp65504P164CurRteS(ip65504P164CurRteS);
	}

	public void setIp65504P164CurRteS(int number) {
	    number = checkIp65504P164CurRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P164CurRteS((short)number);
	}
	public void setIp65504P164CurRteS(long number) {
	    number = checkIp65504P164CurRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P164CurRteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P164CurRteL
	 *	@return ip65504P164CurRteL
	 */
	public short getIp65504P164CurRteL() throws CFException {
        if (isIp65504P164CurRteLModified()) { 
           ip65504P164CurRteL = refreshIp65504P164CurRteL();
        }
   		return ip65504P164CurRteL;
	}
	
	/**
	 * 	Update Ip65504P164CurRteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P164-CUR-RTE-L
	 *	@param number
	 */
	public void setIp65504P164CurRteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P164CurRteL = checkIp65504P164CurRteLMaxLimit(number); 
		serializeIp65504P164CurRteL(ip65504P164CurRteL);
	}

	public void setIp65504P164CurRteL(int number) {
	    number = checkIp65504P164CurRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P164CurRteL((short)number);
	}
	public void setIp65504P164CurRteL(long number) {
	    number = checkIp65504P164CurRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P164CurRteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P165SetlIdS
	 *	@return ip65504P165SetlIdS
	 */
	public short getIp65504P165SetlIdS() throws CFException {
        if (isIp65504P165SetlIdSModified()) { 
           ip65504P165SetlIdS = refreshIp65504P165SetlIdS();
        }
   		return ip65504P165SetlIdS;
	}
	
	/**
	 * 	Update Ip65504P165SetlIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P165-SETL-ID-S
	 *	@param number
	 */
	public void setIp65504P165SetlIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P165SetlIdS = checkIp65504P165SetlIdSMaxLimit(number); 
		serializeIp65504P165SetlIdS(ip65504P165SetlIdS);
	}

	public void setIp65504P165SetlIdS(int number) {
	    number = checkIp65504P165SetlIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P165SetlIdS((short)number);
	}
	public void setIp65504P165SetlIdS(long number) {
	    number = checkIp65504P165SetlIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P165SetlIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P165SetlIdL
	 *	@return ip65504P165SetlIdL
	 */
	public short getIp65504P165SetlIdL() throws CFException {
        if (isIp65504P165SetlIdLModified()) { 
           ip65504P165SetlIdL = refreshIp65504P165SetlIdL();
        }
   		return ip65504P165SetlIdL;
	}
	
	/**
	 * 	Update Ip65504P165SetlIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P165-SETL-ID-L
	 *	@param number
	 */
	public void setIp65504P165SetlIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P165SetlIdL = checkIp65504P165SetlIdLMaxLimit(number); 
		serializeIp65504P165SetlIdL(ip65504P165SetlIdL);
	}

	public void setIp65504P165SetlIdL(int number) {
	    number = checkIp65504P165SetlIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P165SetlIdL((short)number);
	}
	public void setIp65504P165SetlIdL(long number) {
	    number = checkIp65504P165SetlIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P165SetlIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P166ReservdS
	 *	@return ip65504P166ReservdS
	 */
	public short getIp65504P166ReservdS() throws CFException {
        if (isIp65504P166ReservdSModified()) { 
           ip65504P166ReservdS = refreshIp65504P166ReservdS();
        }
   		return ip65504P166ReservdS;
	}
	
	/**
	 * 	Update Ip65504P166ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P166-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P166ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P166ReservdS = checkIp65504P166ReservdSMaxLimit(number); 
		serializeIp65504P166ReservdS(ip65504P166ReservdS);
	}

	public void setIp65504P166ReservdS(int number) {
	    number = checkIp65504P166ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P166ReservdS((short)number);
	}
	public void setIp65504P166ReservdS(long number) {
	    number = checkIp65504P166ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P166ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P166ReservdL
	 *	@return ip65504P166ReservdL
	 */
	public short getIp65504P166ReservdL() throws CFException {
        if (isIp65504P166ReservdLModified()) { 
           ip65504P166ReservdL = refreshIp65504P166ReservdL();
        }
   		return ip65504P166ReservdL;
	}
	
	/**
	 * 	Update Ip65504P166ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P166-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P166ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P166ReservdL = checkIp65504P166ReservdLMaxLimit(number); 
		serializeIp65504P166ReservdL(ip65504P166ReservdL);
	}

	public void setIp65504P166ReservdL(int number) {
	    number = checkIp65504P166ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P166ReservdL((short)number);
	}
	public void setIp65504P166ReservdL(long number) {
	    number = checkIp65504P166ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P166ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P167ReservdS
	 *	@return ip65504P167ReservdS
	 */
	public short getIp65504P167ReservdS() throws CFException {
        if (isIp65504P167ReservdSModified()) { 
           ip65504P167ReservdS = refreshIp65504P167ReservdS();
        }
   		return ip65504P167ReservdS;
	}
	
	/**
	 * 	Update Ip65504P167ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P167-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P167ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P167ReservdS = checkIp65504P167ReservdSMaxLimit(number); 
		serializeIp65504P167ReservdS(ip65504P167ReservdS);
	}

	public void setIp65504P167ReservdS(int number) {
	    number = checkIp65504P167ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P167ReservdS((short)number);
	}
	public void setIp65504P167ReservdS(long number) {
	    number = checkIp65504P167ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P167ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P167ReservdL
	 *	@return ip65504P167ReservdL
	 */
	public short getIp65504P167ReservdL() throws CFException {
        if (isIp65504P167ReservdLModified()) { 
           ip65504P167ReservdL = refreshIp65504P167ReservdL();
        }
   		return ip65504P167ReservdL;
	}
	
	/**
	 * 	Update Ip65504P167ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P167-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P167ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P167ReservdL = checkIp65504P167ReservdLMaxLimit(number); 
		serializeIp65504P167ReservdL(ip65504P167ReservdL);
	}

	public void setIp65504P167ReservdL(int number) {
	    number = checkIp65504P167ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P167ReservdL((short)number);
	}
	public void setIp65504P167ReservdL(long number) {
	    number = checkIp65504P167ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P167ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P168ReservdS
	 *	@return ip65504P168ReservdS
	 */
	public short getIp65504P168ReservdS() throws CFException {
        if (isIp65504P168ReservdSModified()) { 
           ip65504P168ReservdS = refreshIp65504P168ReservdS();
        }
   		return ip65504P168ReservdS;
	}
	
	/**
	 * 	Update Ip65504P168ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P168-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P168ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P168ReservdS = checkIp65504P168ReservdSMaxLimit(number); 
		serializeIp65504P168ReservdS(ip65504P168ReservdS);
	}

	public void setIp65504P168ReservdS(int number) {
	    number = checkIp65504P168ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P168ReservdS((short)number);
	}
	public void setIp65504P168ReservdS(long number) {
	    number = checkIp65504P168ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P168ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P168ReservdL
	 *	@return ip65504P168ReservdL
	 */
	public short getIp65504P168ReservdL() throws CFException {
        if (isIp65504P168ReservdLModified()) { 
           ip65504P168ReservdL = refreshIp65504P168ReservdL();
        }
   		return ip65504P168ReservdL;
	}
	
	/**
	 * 	Update Ip65504P168ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P168-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P168ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P168ReservdL = checkIp65504P168ReservdLMaxLimit(number); 
		serializeIp65504P168ReservdL(ip65504P168ReservdL);
	}

	public void setIp65504P168ReservdL(int number) {
	    number = checkIp65504P168ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P168ReservdL((short)number);
	}
	public void setIp65504P168ReservdL(long number) {
	    number = checkIp65504P168ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P168ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P169ReservdS
	 *	@return ip65504P169ReservdS
	 */
	public short getIp65504P169ReservdS() throws CFException {
        if (isIp65504P169ReservdSModified()) { 
           ip65504P169ReservdS = refreshIp65504P169ReservdS();
        }
   		return ip65504P169ReservdS;
	}
	
	/**
	 * 	Update Ip65504P169ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P169-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P169ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P169ReservdS = checkIp65504P169ReservdSMaxLimit(number); 
		serializeIp65504P169ReservdS(ip65504P169ReservdS);
	}

	public void setIp65504P169ReservdS(int number) {
	    number = checkIp65504P169ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P169ReservdS((short)number);
	}
	public void setIp65504P169ReservdS(long number) {
	    number = checkIp65504P169ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P169ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P169ReservdL
	 *	@return ip65504P169ReservdL
	 */
	public short getIp65504P169ReservdL() throws CFException {
        if (isIp65504P169ReservdLModified()) { 
           ip65504P169ReservdL = refreshIp65504P169ReservdL();
        }
   		return ip65504P169ReservdL;
	}
	
	/**
	 * 	Update Ip65504P169ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P169-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P169ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P169ReservdL = checkIp65504P169ReservdLMaxLimit(number); 
		serializeIp65504P169ReservdL(ip65504P169ReservdL);
	}

	public void setIp65504P169ReservdL(int number) {
	    number = checkIp65504P169ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P169ReservdL((short)number);
	}
	public void setIp65504P169ReservdL(long number) {
	    number = checkIp65504P169ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P169ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P170MerInqS
	 *	@return ip65504P170MerInqS
	 */
	public short getIp65504P170MerInqS() throws CFException {
        if (isIp65504P170MerInqSModified()) { 
           ip65504P170MerInqS = refreshIp65504P170MerInqS();
        }
   		return ip65504P170MerInqS;
	}
	
	/**
	 * 	Update Ip65504P170MerInqS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P170-MER-INQ-S
	 *	@param number
	 */
	public void setIp65504P170MerInqS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P170MerInqS = checkIp65504P170MerInqSMaxLimit(number); 
		serializeIp65504P170MerInqS(ip65504P170MerInqS);
	}

	public void setIp65504P170MerInqS(int number) {
	    number = checkIp65504P170MerInqSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P170MerInqS((short)number);
	}
	public void setIp65504P170MerInqS(long number) {
	    number = checkIp65504P170MerInqSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P170MerInqS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P170MerInqL
	 *	@return ip65504P170MerInqL
	 */
	public short getIp65504P170MerInqL() throws CFException {
        if (isIp65504P170MerInqLModified()) { 
           ip65504P170MerInqL = refreshIp65504P170MerInqL();
        }
   		return ip65504P170MerInqL;
	}
	
	/**
	 * 	Update Ip65504P170MerInqL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P170-MER-INQ-L
	 *	@param number
	 */
	public void setIp65504P170MerInqL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P170MerInqL = checkIp65504P170MerInqLMaxLimit(number); 
		serializeIp65504P170MerInqL(ip65504P170MerInqL);
	}

	public void setIp65504P170MerInqL(int number) {
	    number = checkIp65504P170MerInqLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P170MerInqL((short)number);
	}
	public void setIp65504P170MerInqL(long number) {
	    number = checkIp65504P170MerInqLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P170MerInqL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P171AltmdesS
	 *	@return ip65504P171AltmdesS
	 */
	public short getIp65504P171AltmdesS() throws CFException {
        if (isIp65504P171AltmdesSModified()) { 
           ip65504P171AltmdesS = refreshIp65504P171AltmdesS();
        }
   		return ip65504P171AltmdesS;
	}
	
	/**
	 * 	Update Ip65504P171AltmdesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P171-ALTMDES-S
	 *	@param number
	 */
	public void setIp65504P171AltmdesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P171AltmdesS = checkIp65504P171AltmdesSMaxLimit(number); 
		serializeIp65504P171AltmdesS(ip65504P171AltmdesS);
	}

	public void setIp65504P171AltmdesS(int number) {
	    number = checkIp65504P171AltmdesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P171AltmdesS((short)number);
	}
	public void setIp65504P171AltmdesS(long number) {
	    number = checkIp65504P171AltmdesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P171AltmdesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P171AltmdesL
	 *	@return ip65504P171AltmdesL
	 */
	public short getIp65504P171AltmdesL() throws CFException {
        if (isIp65504P171AltmdesLModified()) { 
           ip65504P171AltmdesL = refreshIp65504P171AltmdesL();
        }
   		return ip65504P171AltmdesL;
	}
	
	/**
	 * 	Update Ip65504P171AltmdesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P171-ALTMDES-L
	 *	@param number
	 */
	public void setIp65504P171AltmdesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P171AltmdesL = checkIp65504P171AltmdesLMaxLimit(number); 
		serializeIp65504P171AltmdesL(ip65504P171AltmdesL);
	}

	public void setIp65504P171AltmdesL(int number) {
	    number = checkIp65504P171AltmdesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P171AltmdesL((short)number);
	}
	public void setIp65504P171AltmdesL(long number) {
	    number = checkIp65504P171AltmdesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P171AltmdesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P172PropNmS
	 *	@return ip65504P172PropNmS
	 */
	public short getIp65504P172PropNmS() throws CFException {
        if (isIp65504P172PropNmSModified()) { 
           ip65504P172PropNmS = refreshIp65504P172PropNmS();
        }
   		return ip65504P172PropNmS;
	}
	
	/**
	 * 	Update Ip65504P172PropNmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P172-PROP-NM-S
	 *	@param number
	 */
	public void setIp65504P172PropNmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P172PropNmS = checkIp65504P172PropNmSMaxLimit(number); 
		serializeIp65504P172PropNmS(ip65504P172PropNmS);
	}

	public void setIp65504P172PropNmS(int number) {
	    number = checkIp65504P172PropNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P172PropNmS((short)number);
	}
	public void setIp65504P172PropNmS(long number) {
	    number = checkIp65504P172PropNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P172PropNmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P172PropNmL
	 *	@return ip65504P172PropNmL
	 */
	public short getIp65504P172PropNmL() throws CFException {
        if (isIp65504P172PropNmLModified()) { 
           ip65504P172PropNmL = refreshIp65504P172PropNmL();
        }
   		return ip65504P172PropNmL;
	}
	
	/**
	 * 	Update Ip65504P172PropNmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P172-PROP-NM-L
	 *	@param number
	 */
	public void setIp65504P172PropNmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P172PropNmL = checkIp65504P172PropNmLMaxLimit(number); 
		serializeIp65504P172PropNmL(ip65504P172PropNmL);
	}

	public void setIp65504P172PropNmL(int number) {
	    number = checkIp65504P172PropNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P172PropNmL((short)number);
	}
	public void setIp65504P172PropNmL(long number) {
	    number = checkIp65504P172PropNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P172PropNmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P173CorpNmS
	 *	@return ip65504P173CorpNmS
	 */
	public short getIp65504P173CorpNmS() throws CFException {
        if (isIp65504P173CorpNmSModified()) { 
           ip65504P173CorpNmS = refreshIp65504P173CorpNmS();
        }
   		return ip65504P173CorpNmS;
	}
	
	/**
	 * 	Update Ip65504P173CorpNmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P173-CORP-NM-S
	 *	@param number
	 */
	public void setIp65504P173CorpNmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P173CorpNmS = checkIp65504P173CorpNmSMaxLimit(number); 
		serializeIp65504P173CorpNmS(ip65504P173CorpNmS);
	}

	public void setIp65504P173CorpNmS(int number) {
	    number = checkIp65504P173CorpNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P173CorpNmS((short)number);
	}
	public void setIp65504P173CorpNmS(long number) {
	    number = checkIp65504P173CorpNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P173CorpNmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P173CorpNmL
	 *	@return ip65504P173CorpNmL
	 */
	public short getIp65504P173CorpNmL() throws CFException {
        if (isIp65504P173CorpNmLModified()) { 
           ip65504P173CorpNmL = refreshIp65504P173CorpNmL();
        }
   		return ip65504P173CorpNmL;
	}
	
	/**
	 * 	Update Ip65504P173CorpNmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P173-CORP-NM-L
	 *	@param number
	 */
	public void setIp65504P173CorpNmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P173CorpNmL = checkIp65504P173CorpNmLMaxLimit(number); 
		serializeIp65504P173CorpNmL(ip65504P173CorpNmL);
	}

	public void setIp65504P173CorpNmL(int number) {
	    number = checkIp65504P173CorpNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P173CorpNmL((short)number);
	}
	public void setIp65504P173CorpNmL(long number) {
	    number = checkIp65504P173CorpNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P173CorpNmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P174DunbradS
	 *	@return ip65504P174DunbradS
	 */
	public short getIp65504P174DunbradS() throws CFException {
        if (isIp65504P174DunbradSModified()) { 
           ip65504P174DunbradS = refreshIp65504P174DunbradS();
        }
   		return ip65504P174DunbradS;
	}
	
	/**
	 * 	Update Ip65504P174DunbradS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P174-DUNBRAD-S
	 *	@param number
	 */
	public void setIp65504P174DunbradS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P174DunbradS = checkIp65504P174DunbradSMaxLimit(number); 
		serializeIp65504P174DunbradS(ip65504P174DunbradS);
	}

	public void setIp65504P174DunbradS(int number) {
	    number = checkIp65504P174DunbradSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P174DunbradS((short)number);
	}
	public void setIp65504P174DunbradS(long number) {
	    number = checkIp65504P174DunbradSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P174DunbradS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P174DunbradL
	 *	@return ip65504P174DunbradL
	 */
	public short getIp65504P174DunbradL() throws CFException {
        if (isIp65504P174DunbradLModified()) { 
           ip65504P174DunbradL = refreshIp65504P174DunbradL();
        }
   		return ip65504P174DunbradL;
	}
	
	/**
	 * 	Update Ip65504P174DunbradL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P174-DUNBRAD-L
	 *	@param number
	 */
	public void setIp65504P174DunbradL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P174DunbradL = checkIp65504P174DunbradLMaxLimit(number); 
		serializeIp65504P174DunbradL(ip65504P174DunbradL);
	}

	public void setIp65504P174DunbradL(int number) {
	    number = checkIp65504P174DunbradLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P174DunbradL((short)number);
	}
	public void setIp65504P174DunbradL(long number) {
	    number = checkIp65504P174DunbradLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P174DunbradL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P175CardAccptUrlS
	 *	@return ip65504P175CardAccptUrlS
	 */
	public short getIp65504P175CardAccptUrlS() throws CFException {
        if (isIp65504P175CardAccptUrlSModified()) { 
           ip65504P175CardAccptUrlS = refreshIp65504P175CardAccptUrlS();
        }
   		return ip65504P175CardAccptUrlS;
	}
	
	/**
	 * 	Update Ip65504P175CardAccptUrlS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P175-CARD-ACCPT-URL-S
	 *	@param number
	 */
	public void setIp65504P175CardAccptUrlS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P175CardAccptUrlS = checkIp65504P175CardAccptUrlSMaxLimit(number); 
		serializeIp65504P175CardAccptUrlS(ip65504P175CardAccptUrlS);
	}

	public void setIp65504P175CardAccptUrlS(int number) {
	    number = checkIp65504P175CardAccptUrlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P175CardAccptUrlS((short)number);
	}
	public void setIp65504P175CardAccptUrlS(long number) {
	    number = checkIp65504P175CardAccptUrlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P175CardAccptUrlS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P175CardAccptUrlL
	 *	@return ip65504P175CardAccptUrlL
	 */
	public short getIp65504P175CardAccptUrlL() throws CFException {
        if (isIp65504P175CardAccptUrlLModified()) { 
           ip65504P175CardAccptUrlL = refreshIp65504P175CardAccptUrlL();
        }
   		return ip65504P175CardAccptUrlL;
	}
	
	/**
	 * 	Update Ip65504P175CardAccptUrlL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P175-CARD-ACCPT-URL-L
	 *	@param number
	 */
	public void setIp65504P175CardAccptUrlL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P175CardAccptUrlL = checkIp65504P175CardAccptUrlLMaxLimit(number); 
		serializeIp65504P175CardAccptUrlL(ip65504P175CardAccptUrlL);
	}

	public void setIp65504P175CardAccptUrlL(int number) {
	    number = checkIp65504P175CardAccptUrlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P175CardAccptUrlL((short)number);
	}
	public void setIp65504P175CardAccptUrlL(long number) {
	    number = checkIp65504P175CardAccptUrlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P175CardAccptUrlL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P176ReservdS
	 *	@return ip65504P176ReservdS
	 */
	public short getIp65504P176ReservdS() throws CFException {
        if (isIp65504P176ReservdSModified()) { 
           ip65504P176ReservdS = refreshIp65504P176ReservdS();
        }
   		return ip65504P176ReservdS;
	}
	
	/**
	 * 	Update Ip65504P176ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P176-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P176ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P176ReservdS = checkIp65504P176ReservdSMaxLimit(number); 
		serializeIp65504P176ReservdS(ip65504P176ReservdS);
	}

	public void setIp65504P176ReservdS(int number) {
	    number = checkIp65504P176ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P176ReservdS((short)number);
	}
	public void setIp65504P176ReservdS(long number) {
	    number = checkIp65504P176ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P176ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P176ReservdL
	 *	@return ip65504P176ReservdL
	 */
	public short getIp65504P176ReservdL() throws CFException {
        if (isIp65504P176ReservdLModified()) { 
           ip65504P176ReservdL = refreshIp65504P176ReservdL();
        }
   		return ip65504P176ReservdL;
	}
	
	/**
	 * 	Update Ip65504P176ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P176-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P176ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P176ReservdL = checkIp65504P176ReservdLMaxLimit(number); 
		serializeIp65504P176ReservdL(ip65504P176ReservdL);
	}

	public void setIp65504P176ReservdL(int number) {
	    number = checkIp65504P176ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P176ReservdL((short)number);
	}
	public void setIp65504P176ReservdL(long number) {
	    number = checkIp65504P176ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P176ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P177ReservdS
	 *	@return ip65504P177ReservdS
	 */
	public short getIp65504P177ReservdS() throws CFException {
        if (isIp65504P177ReservdSModified()) { 
           ip65504P177ReservdS = refreshIp65504P177ReservdS();
        }
   		return ip65504P177ReservdS;
	}
	
	/**
	 * 	Update Ip65504P177ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P177-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P177ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P177ReservdS = checkIp65504P177ReservdSMaxLimit(number); 
		serializeIp65504P177ReservdS(ip65504P177ReservdS);
	}

	public void setIp65504P177ReservdS(int number) {
	    number = checkIp65504P177ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P177ReservdS((short)number);
	}
	public void setIp65504P177ReservdS(long number) {
	    number = checkIp65504P177ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P177ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P177ReservdL
	 *	@return ip65504P177ReservdL
	 */
	public short getIp65504P177ReservdL() throws CFException {
        if (isIp65504P177ReservdLModified()) { 
           ip65504P177ReservdL = refreshIp65504P177ReservdL();
        }
   		return ip65504P177ReservdL;
	}
	
	/**
	 * 	Update Ip65504P177ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P177-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P177ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P177ReservdL = checkIp65504P177ReservdLMaxLimit(number); 
		serializeIp65504P177ReservdL(ip65504P177ReservdL);
	}

	public void setIp65504P177ReservdL(int number) {
	    number = checkIp65504P177ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P177ReservdL((short)number);
	}
	public void setIp65504P177ReservdL(long number) {
	    number = checkIp65504P177ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P177ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P178ReservdS
	 *	@return ip65504P178ReservdS
	 */
	public short getIp65504P178ReservdS() throws CFException {
        if (isIp65504P178ReservdSModified()) { 
           ip65504P178ReservdS = refreshIp65504P178ReservdS();
        }
   		return ip65504P178ReservdS;
	}
	
	/**
	 * 	Update Ip65504P178ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P178-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P178ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P178ReservdS = checkIp65504P178ReservdSMaxLimit(number); 
		serializeIp65504P178ReservdS(ip65504P178ReservdS);
	}

	public void setIp65504P178ReservdS(int number) {
	    number = checkIp65504P178ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P178ReservdS((short)number);
	}
	public void setIp65504P178ReservdS(long number) {
	    number = checkIp65504P178ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P178ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P178ReservdL
	 *	@return ip65504P178ReservdL
	 */
	public short getIp65504P178ReservdL() throws CFException {
        if (isIp65504P178ReservdLModified()) { 
           ip65504P178ReservdL = refreshIp65504P178ReservdL();
        }
   		return ip65504P178ReservdL;
	}
	
	/**
	 * 	Update Ip65504P178ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P178-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P178ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P178ReservdL = checkIp65504P178ReservdLMaxLimit(number); 
		serializeIp65504P178ReservdL(ip65504P178ReservdL);
	}

	public void setIp65504P178ReservdL(int number) {
	    number = checkIp65504P178ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P178ReservdL((short)number);
	}
	public void setIp65504P178ReservdL(long number) {
	    number = checkIp65504P178ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P178ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P179ReservdS
	 *	@return ip65504P179ReservdS
	 */
	public short getIp65504P179ReservdS() throws CFException {
        if (isIp65504P179ReservdSModified()) { 
           ip65504P179ReservdS = refreshIp65504P179ReservdS();
        }
   		return ip65504P179ReservdS;
	}
	
	/**
	 * 	Update Ip65504P179ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P179-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P179ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P179ReservdS = checkIp65504P179ReservdSMaxLimit(number); 
		serializeIp65504P179ReservdS(ip65504P179ReservdS);
	}

	public void setIp65504P179ReservdS(int number) {
	    number = checkIp65504P179ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P179ReservdS((short)number);
	}
	public void setIp65504P179ReservdS(long number) {
	    number = checkIp65504P179ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P179ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P179ReservdL
	 *	@return ip65504P179ReservdL
	 */
	public short getIp65504P179ReservdL() throws CFException {
        if (isIp65504P179ReservdLModified()) { 
           ip65504P179ReservdL = refreshIp65504P179ReservdL();
        }
   		return ip65504P179ReservdL;
	}
	
	/**
	 * 	Update Ip65504P179ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P179-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P179ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P179ReservdL = checkIp65504P179ReservdLMaxLimit(number); 
		serializeIp65504P179ReservdL(ip65504P179ReservdL);
	}

	public void setIp65504P179ReservdL(int number) {
	    number = checkIp65504P179ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P179ReservdL((short)number);
	}
	public void setIp65504P179ReservdL(long number) {
	    number = checkIp65504P179ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P179ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P180ReservdS
	 *	@return ip65504P180ReservdS
	 */
	public short getIp65504P180ReservdS() throws CFException {
        if (isIp65504P180ReservdSModified()) { 
           ip65504P180ReservdS = refreshIp65504P180ReservdS();
        }
   		return ip65504P180ReservdS;
	}
	
	/**
	 * 	Update Ip65504P180ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P180-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P180ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P180ReservdS = checkIp65504P180ReservdSMaxLimit(number); 
		serializeIp65504P180ReservdS(ip65504P180ReservdS);
	}

	public void setIp65504P180ReservdS(int number) {
	    number = checkIp65504P180ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P180ReservdS((short)number);
	}
	public void setIp65504P180ReservdS(long number) {
	    number = checkIp65504P180ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P180ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P180ReservdL
	 *	@return ip65504P180ReservdL
	 */
	public short getIp65504P180ReservdL() throws CFException {
        if (isIp65504P180ReservdLModified()) { 
           ip65504P180ReservdL = refreshIp65504P180ReservdL();
        }
   		return ip65504P180ReservdL;
	}
	
	/**
	 * 	Update Ip65504P180ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P180-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P180ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P180ReservdL = checkIp65504P180ReservdLMaxLimit(number); 
		serializeIp65504P180ReservdL(ip65504P180ReservdL);
	}

	public void setIp65504P180ReservdL(int number) {
	    number = checkIp65504P180ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P180ReservdL((short)number);
	}
	public void setIp65504P180ReservdL(long number) {
	    number = checkIp65504P180ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P180ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P181ReservdS
	 *	@return ip65504P181ReservdS
	 */
	public short getIp65504P181ReservdS() throws CFException {
        if (isIp65504P181ReservdSModified()) { 
           ip65504P181ReservdS = refreshIp65504P181ReservdS();
        }
   		return ip65504P181ReservdS;
	}
	
	/**
	 * 	Update Ip65504P181ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P181-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P181ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P181ReservdS = checkIp65504P181ReservdSMaxLimit(number); 
		serializeIp65504P181ReservdS(ip65504P181ReservdS);
	}

	public void setIp65504P181ReservdS(int number) {
	    number = checkIp65504P181ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P181ReservdS((short)number);
	}
	public void setIp65504P181ReservdS(long number) {
	    number = checkIp65504P181ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P181ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P181ReservdL
	 *	@return ip65504P181ReservdL
	 */
	public short getIp65504P181ReservdL() throws CFException {
        if (isIp65504P181ReservdLModified()) { 
           ip65504P181ReservdL = refreshIp65504P181ReservdL();
        }
   		return ip65504P181ReservdL;
	}
	
	/**
	 * 	Update Ip65504P181ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P181-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P181ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P181ReservdL = checkIp65504P181ReservdLMaxLimit(number); 
		serializeIp65504P181ReservdL(ip65504P181ReservdL);
	}

	public void setIp65504P181ReservdL(int number) {
	    number = checkIp65504P181ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P181ReservdL((short)number);
	}
	public void setIp65504P181ReservdL(long number) {
	    number = checkIp65504P181ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P181ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P182ReservdS
	 *	@return ip65504P182ReservdS
	 */
	public short getIp65504P182ReservdS() throws CFException {
        if (isIp65504P182ReservdSModified()) { 
           ip65504P182ReservdS = refreshIp65504P182ReservdS();
        }
   		return ip65504P182ReservdS;
	}
	
	/**
	 * 	Update Ip65504P182ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P182-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P182ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P182ReservdS = checkIp65504P182ReservdSMaxLimit(number); 
		serializeIp65504P182ReservdS(ip65504P182ReservdS);
	}

	public void setIp65504P182ReservdS(int number) {
	    number = checkIp65504P182ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P182ReservdS((short)number);
	}
	public void setIp65504P182ReservdS(long number) {
	    number = checkIp65504P182ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P182ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P182ReservdL
	 *	@return ip65504P182ReservdL
	 */
	public short getIp65504P182ReservdL() throws CFException {
        if (isIp65504P182ReservdLModified()) { 
           ip65504P182ReservdL = refreshIp65504P182ReservdL();
        }
   		return ip65504P182ReservdL;
	}
	
	/**
	 * 	Update Ip65504P182ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P182-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P182ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P182ReservdL = checkIp65504P182ReservdLMaxLimit(number); 
		serializeIp65504P182ReservdL(ip65504P182ReservdL);
	}

	public void setIp65504P182ReservdL(int number) {
	    number = checkIp65504P182ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P182ReservdL((short)number);
	}
	public void setIp65504P182ReservdL(long number) {
	    number = checkIp65504P182ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P182ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P183ReservdS
	 *	@return ip65504P183ReservdS
	 */
	public short getIp65504P183ReservdS() throws CFException {
        if (isIp65504P183ReservdSModified()) { 
           ip65504P183ReservdS = refreshIp65504P183ReservdS();
        }
   		return ip65504P183ReservdS;
	}
	
	/**
	 * 	Update Ip65504P183ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P183-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P183ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P183ReservdS = checkIp65504P183ReservdSMaxLimit(number); 
		serializeIp65504P183ReservdS(ip65504P183ReservdS);
	}

	public void setIp65504P183ReservdS(int number) {
	    number = checkIp65504P183ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P183ReservdS((short)number);
	}
	public void setIp65504P183ReservdS(long number) {
	    number = checkIp65504P183ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P183ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P183ReservdL
	 *	@return ip65504P183ReservdL
	 */
	public short getIp65504P183ReservdL() throws CFException {
        if (isIp65504P183ReservdLModified()) { 
           ip65504P183ReservdL = refreshIp65504P183ReservdL();
        }
   		return ip65504P183ReservdL;
	}
	
	/**
	 * 	Update Ip65504P183ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P183-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P183ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P183ReservdL = checkIp65504P183ReservdLMaxLimit(number); 
		serializeIp65504P183ReservdL(ip65504P183ReservdL);
	}

	public void setIp65504P183ReservdL(int number) {
	    number = checkIp65504P183ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P183ReservdL((short)number);
	}
	public void setIp65504P183ReservdL(long number) {
	    number = checkIp65504P183ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P183ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P184ReservdS
	 *	@return ip65504P184ReservdS
	 */
	public short getIp65504P184ReservdS() throws CFException {
        if (isIp65504P184ReservdSModified()) { 
           ip65504P184ReservdS = refreshIp65504P184ReservdS();
        }
   		return ip65504P184ReservdS;
	}
	
	/**
	 * 	Update Ip65504P184ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P184-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P184ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P184ReservdS = checkIp65504P184ReservdSMaxLimit(number); 
		serializeIp65504P184ReservdS(ip65504P184ReservdS);
	}

	public void setIp65504P184ReservdS(int number) {
	    number = checkIp65504P184ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P184ReservdS((short)number);
	}
	public void setIp65504P184ReservdS(long number) {
	    number = checkIp65504P184ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P184ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P184ReservdL
	 *	@return ip65504P184ReservdL
	 */
	public short getIp65504P184ReservdL() throws CFException {
        if (isIp65504P184ReservdLModified()) { 
           ip65504P184ReservdL = refreshIp65504P184ReservdL();
        }
   		return ip65504P184ReservdL;
	}
	
	/**
	 * 	Update Ip65504P184ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P184-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P184ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P184ReservdL = checkIp65504P184ReservdLMaxLimit(number); 
		serializeIp65504P184ReservdL(ip65504P184ReservdL);
	}

	public void setIp65504P184ReservdL(int number) {
	    number = checkIp65504P184ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P184ReservdL((short)number);
	}
	public void setIp65504P184ReservdL(long number) {
	    number = checkIp65504P184ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P184ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P185ReservdS
	 *	@return ip65504P185ReservdS
	 */
	public short getIp65504P185ReservdS() throws CFException {
        if (isIp65504P185ReservdSModified()) { 
           ip65504P185ReservdS = refreshIp65504P185ReservdS();
        }
   		return ip65504P185ReservdS;
	}
	
	/**
	 * 	Update Ip65504P185ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P185-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P185ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P185ReservdS = checkIp65504P185ReservdSMaxLimit(number); 
		serializeIp65504P185ReservdS(ip65504P185ReservdS);
	}

	public void setIp65504P185ReservdS(int number) {
	    number = checkIp65504P185ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P185ReservdS((short)number);
	}
	public void setIp65504P185ReservdS(long number) {
	    number = checkIp65504P185ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P185ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P185ReservdL
	 *	@return ip65504P185ReservdL
	 */
	public short getIp65504P185ReservdL() throws CFException {
        if (isIp65504P185ReservdLModified()) { 
           ip65504P185ReservdL = refreshIp65504P185ReservdL();
        }
   		return ip65504P185ReservdL;
	}
	
	/**
	 * 	Update Ip65504P185ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P185-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P185ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P185ReservdL = checkIp65504P185ReservdLMaxLimit(number); 
		serializeIp65504P185ReservdL(ip65504P185ReservdL);
	}

	public void setIp65504P185ReservdL(int number) {
	    number = checkIp65504P185ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P185ReservdL((short)number);
	}
	public void setIp65504P185ReservdL(long number) {
	    number = checkIp65504P185ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P185ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P186ReservdS
	 *	@return ip65504P186ReservdS
	 */
	public short getIp65504P186ReservdS() throws CFException {
        if (isIp65504P186ReservdSModified()) { 
           ip65504P186ReservdS = refreshIp65504P186ReservdS();
        }
   		return ip65504P186ReservdS;
	}
	
	/**
	 * 	Update Ip65504P186ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P186-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P186ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P186ReservdS = checkIp65504P186ReservdSMaxLimit(number); 
		serializeIp65504P186ReservdS(ip65504P186ReservdS);
	}

	public void setIp65504P186ReservdS(int number) {
	    number = checkIp65504P186ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P186ReservdS((short)number);
	}
	public void setIp65504P186ReservdS(long number) {
	    number = checkIp65504P186ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P186ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P186ReservdL
	 *	@return ip65504P186ReservdL
	 */
	public short getIp65504P186ReservdL() throws CFException {
        if (isIp65504P186ReservdLModified()) { 
           ip65504P186ReservdL = refreshIp65504P186ReservdL();
        }
   		return ip65504P186ReservdL;
	}
	
	/**
	 * 	Update Ip65504P186ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P186-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P186ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P186ReservdL = checkIp65504P186ReservdLMaxLimit(number); 
		serializeIp65504P186ReservdL(ip65504P186ReservdL);
	}

	public void setIp65504P186ReservdL(int number) {
	    number = checkIp65504P186ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P186ReservdL((short)number);
	}
	public void setIp65504P186ReservdL(long number) {
	    number = checkIp65504P186ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P186ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup6
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P156ReservdS((short)0);
         	setIp65504P156ReservdL((short)0);
         	setIp65504P157AcqCurS((short)0);
         	setIp65504P157AcqCurL((short)0);
         	setIp65504P158BusActS((short)0);
         	setIp65504P158BusActL((short)0);
         	setIp65504P159Settle1S((short)0);
         	setIp65504P159Settle1L((short)0);
         	setIp65504P160ReservdS((short)0);
         	setIp65504P160ReservdL((short)0);
         	setIp65504P161Settle2S((short)0);
         	setIp65504P161Settle2L((short)0);
         	setIp65504P162ReservdS((short)0);
         	setIp65504P162ReservdL((short)0);
         	setIp65504P163ReservdS((short)0);
         	setIp65504P163ReservdL((short)0);
         	setIp65504P164CurRteS((short)0);
         	setIp65504P164CurRteL((short)0);
         	setIp65504P165SetlIdS((short)0);
         	setIp65504P165SetlIdL((short)0);
         	setIp65504P166ReservdS((short)0);
         	setIp65504P166ReservdL((short)0);
         	setIp65504P167ReservdS((short)0);
         	setIp65504P167ReservdL((short)0);
         	setIp65504P168ReservdS((short)0);
         	setIp65504P168ReservdL((short)0);
         	setIp65504P169ReservdS((short)0);
         	setIp65504P169ReservdL((short)0);
         	setIp65504P170MerInqS((short)0);
         	setIp65504P170MerInqL((short)0);
         	setIp65504P171AltmdesS((short)0);
         	setIp65504P171AltmdesL((short)0);
         	setIp65504P172PropNmS((short)0);
         	setIp65504P172PropNmL((short)0);
         	setIp65504P173CorpNmS((short)0);
         	setIp65504P173CorpNmL((short)0);
         	setIp65504P174DunbradS((short)0);
         	setIp65504P174DunbradL((short)0);
         	setIp65504P175CardAccptUrlS((short)0);
         	setIp65504P175CardAccptUrlL((short)0);
         	setIp65504P176ReservdS((short)0);
         	setIp65504P176ReservdL((short)0);
         	setIp65504P177ReservdS((short)0);
         	setIp65504P177ReservdL((short)0);
         	setIp65504P178ReservdS((short)0);
         	setIp65504P178ReservdL((short)0);
         	setIp65504P179ReservdS((short)0);
         	setIp65504P179ReservdL((short)0);
         	setIp65504P180ReservdS((short)0);
         	setIp65504P180ReservdL((short)0);
         	setIp65504P181ReservdS((short)0);
         	setIp65504P181ReservdL((short)0);
         	setIp65504P182ReservdS((short)0);
         	setIp65504P182ReservdL((short)0);
         	setIp65504P183ReservdS((short)0);
         	setIp65504P183ReservdL((short)0);
         	setIp65504P184ReservdS((short)0);
         	setIp65504P184ReservdL((short)0);
         	setIp65504P185ReservdS((short)0);
         	setIp65504P185ReservdL((short)0);
         	setIp65504P186ReservdS((short)0);
         	setIp65504P186ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup6FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_6_LENGTH;
		}

}
  
