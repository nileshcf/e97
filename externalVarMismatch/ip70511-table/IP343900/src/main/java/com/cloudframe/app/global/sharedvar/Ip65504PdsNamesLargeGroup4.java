package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup4 extends Ip65504PdsNamesLargeGroup4Serialized { 
   

								private short ip65504P094ReservdS;

								private short ip65504P094ReservdL;


								private short ip65504P095CardsecS;

								private short ip65504P095CardsecL;


								private short ip65504P096ReservdS;

								private short ip65504P096ReservdL;


								private short ip65504P097ReservdS;

								private short ip65504P097ReservdL;


								private short ip65504P098ReservdS;

								private short ip65504P098ReservdL;


								private short ip65504P099ReservdS;

								private short ip65504P099ReservdL;


								private short ip65504P100ReservdS;

								private short ip65504P100ReservdL;


								private short ip65504P101ReservdS;

								private short ip65504P101ReservdL;


								private short ip65504P102ReservdS;

								private short ip65504P102ReservdL;


								private short ip65504P103TrxDesS;

								private short ip65504P103TrxDesL;


								private short ip65504P104ReservdS;

								private short ip65504P104ReservdL;


								private short ip65504P105FileIdS;

								private short ip65504P105FileIdL;


								private short ip65504P106ReservdS;

								private short ip65504P106ReservdL;


								private short ip65504P107ReservdS;

								private short ip65504P107ReservdL;


								private short ip65504P108ReservdS;

								private short ip65504P108ReservdL;


								private short ip65504P109ReservdS;

								private short ip65504P109ReservdL;


								private short ip65504P110TranIdS;

								private short ip65504P110TranIdL;


								private short ip65504P111ReservdS;

								private short ip65504P111ReservdL;


								private short ip65504P112ReservdS;

								private short ip65504P112ReservdL;


								private short ip65504P113ReservdS;

								private short ip65504P113ReservdL;


								private short ip65504P114ReservdS;

								private short ip65504P114ReservdL;


								private short ip65504P115ReservdS;

								private short ip65504P115ReservdL;


								private short ip65504P116ReservdS;

								private short ip65504P116ReservdL;


								private short ip65504P117ReservdS;

								private short ip65504P117ReservdL;


								private short ip65504P118ReservdS;

								private short ip65504P118ReservdL;


								private short ip65504P119ReservdS;

								private short ip65504P119ReservdL;


								private short ip65504P120ReservdS;

								private short ip65504P120ReservdL;


								private short ip65504P121ReservdS;

								private short ip65504P121ReservdL;


								private short ip65504P122ProcMdS;

								private short ip65504P122ProcMdL;


								private short ip65504P123ReservdS;

								private short ip65504P123ReservdL;


								private short ip65504P124ReservdS;

								private short ip65504P124ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup4
	**/
    public Ip65504PdsNamesLargeGroup4() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P094ReservdS
	 *	@return ip65504P094ReservdS
	 */
	public short getIp65504P094ReservdS() throws CFException {
        if (isIp65504P094ReservdSModified()) { 
           ip65504P094ReservdS = refreshIp65504P094ReservdS();
        }
   		return ip65504P094ReservdS;
	}
	
	/**
	 * 	Update Ip65504P094ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P094-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P094ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P094ReservdS = checkIp65504P094ReservdSMaxLimit(number); 
		serializeIp65504P094ReservdS(ip65504P094ReservdS);
	}

	public void setIp65504P094ReservdS(int number) {
	    number = checkIp65504P094ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P094ReservdS((short)number);
	}
	public void setIp65504P094ReservdS(long number) {
	    number = checkIp65504P094ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P094ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P094ReservdL
	 *	@return ip65504P094ReservdL
	 */
	public short getIp65504P094ReservdL() throws CFException {
        if (isIp65504P094ReservdLModified()) { 
           ip65504P094ReservdL = refreshIp65504P094ReservdL();
        }
   		return ip65504P094ReservdL;
	}
	
	/**
	 * 	Update Ip65504P094ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P094-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P094ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P094ReservdL = checkIp65504P094ReservdLMaxLimit(number); 
		serializeIp65504P094ReservdL(ip65504P094ReservdL);
	}

	public void setIp65504P094ReservdL(int number) {
	    number = checkIp65504P094ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P094ReservdL((short)number);
	}
	public void setIp65504P094ReservdL(long number) {
	    number = checkIp65504P094ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P094ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P095CardsecS
	 *	@return ip65504P095CardsecS
	 */
	public short getIp65504P095CardsecS() throws CFException {
        if (isIp65504P095CardsecSModified()) { 
           ip65504P095CardsecS = refreshIp65504P095CardsecS();
        }
   		return ip65504P095CardsecS;
	}
	
	/**
	 * 	Update Ip65504P095CardsecS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P095-CARDSEC-S
	 *	@param number
	 */
	public void setIp65504P095CardsecS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P095CardsecS = checkIp65504P095CardsecSMaxLimit(number); 
		serializeIp65504P095CardsecS(ip65504P095CardsecS);
	}

	public void setIp65504P095CardsecS(int number) {
	    number = checkIp65504P095CardsecSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P095CardsecS((short)number);
	}
	public void setIp65504P095CardsecS(long number) {
	    number = checkIp65504P095CardsecSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P095CardsecS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P095CardsecL
	 *	@return ip65504P095CardsecL
	 */
	public short getIp65504P095CardsecL() throws CFException {
        if (isIp65504P095CardsecLModified()) { 
           ip65504P095CardsecL = refreshIp65504P095CardsecL();
        }
   		return ip65504P095CardsecL;
	}
	
	/**
	 * 	Update Ip65504P095CardsecL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P095-CARDSEC-L
	 *	@param number
	 */
	public void setIp65504P095CardsecL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P095CardsecL = checkIp65504P095CardsecLMaxLimit(number); 
		serializeIp65504P095CardsecL(ip65504P095CardsecL);
	}

	public void setIp65504P095CardsecL(int number) {
	    number = checkIp65504P095CardsecLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P095CardsecL((short)number);
	}
	public void setIp65504P095CardsecL(long number) {
	    number = checkIp65504P095CardsecLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P095CardsecL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P096ReservdS
	 *	@return ip65504P096ReservdS
	 */
	public short getIp65504P096ReservdS() throws CFException {
        if (isIp65504P096ReservdSModified()) { 
           ip65504P096ReservdS = refreshIp65504P096ReservdS();
        }
   		return ip65504P096ReservdS;
	}
	
	/**
	 * 	Update Ip65504P096ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P096-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P096ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P096ReservdS = checkIp65504P096ReservdSMaxLimit(number); 
		serializeIp65504P096ReservdS(ip65504P096ReservdS);
	}

	public void setIp65504P096ReservdS(int number) {
	    number = checkIp65504P096ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P096ReservdS((short)number);
	}
	public void setIp65504P096ReservdS(long number) {
	    number = checkIp65504P096ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P096ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P096ReservdL
	 *	@return ip65504P096ReservdL
	 */
	public short getIp65504P096ReservdL() throws CFException {
        if (isIp65504P096ReservdLModified()) { 
           ip65504P096ReservdL = refreshIp65504P096ReservdL();
        }
   		return ip65504P096ReservdL;
	}
	
	/**
	 * 	Update Ip65504P096ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P096-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P096ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P096ReservdL = checkIp65504P096ReservdLMaxLimit(number); 
		serializeIp65504P096ReservdL(ip65504P096ReservdL);
	}

	public void setIp65504P096ReservdL(int number) {
	    number = checkIp65504P096ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P096ReservdL((short)number);
	}
	public void setIp65504P096ReservdL(long number) {
	    number = checkIp65504P096ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P096ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P097ReservdS
	 *	@return ip65504P097ReservdS
	 */
	public short getIp65504P097ReservdS() throws CFException {
        if (isIp65504P097ReservdSModified()) { 
           ip65504P097ReservdS = refreshIp65504P097ReservdS();
        }
   		return ip65504P097ReservdS;
	}
	
	/**
	 * 	Update Ip65504P097ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P097-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P097ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P097ReservdS = checkIp65504P097ReservdSMaxLimit(number); 
		serializeIp65504P097ReservdS(ip65504P097ReservdS);
	}

	public void setIp65504P097ReservdS(int number) {
	    number = checkIp65504P097ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P097ReservdS((short)number);
	}
	public void setIp65504P097ReservdS(long number) {
	    number = checkIp65504P097ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P097ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P097ReservdL
	 *	@return ip65504P097ReservdL
	 */
	public short getIp65504P097ReservdL() throws CFException {
        if (isIp65504P097ReservdLModified()) { 
           ip65504P097ReservdL = refreshIp65504P097ReservdL();
        }
   		return ip65504P097ReservdL;
	}
	
	/**
	 * 	Update Ip65504P097ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P097-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P097ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P097ReservdL = checkIp65504P097ReservdLMaxLimit(number); 
		serializeIp65504P097ReservdL(ip65504P097ReservdL);
	}

	public void setIp65504P097ReservdL(int number) {
	    number = checkIp65504P097ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P097ReservdL((short)number);
	}
	public void setIp65504P097ReservdL(long number) {
	    number = checkIp65504P097ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P097ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P098ReservdS
	 *	@return ip65504P098ReservdS
	 */
	public short getIp65504P098ReservdS() throws CFException {
        if (isIp65504P098ReservdSModified()) { 
           ip65504P098ReservdS = refreshIp65504P098ReservdS();
        }
   		return ip65504P098ReservdS;
	}
	
	/**
	 * 	Update Ip65504P098ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P098-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P098ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P098ReservdS = checkIp65504P098ReservdSMaxLimit(number); 
		serializeIp65504P098ReservdS(ip65504P098ReservdS);
	}

	public void setIp65504P098ReservdS(int number) {
	    number = checkIp65504P098ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P098ReservdS((short)number);
	}
	public void setIp65504P098ReservdS(long number) {
	    number = checkIp65504P098ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P098ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P098ReservdL
	 *	@return ip65504P098ReservdL
	 */
	public short getIp65504P098ReservdL() throws CFException {
        if (isIp65504P098ReservdLModified()) { 
           ip65504P098ReservdL = refreshIp65504P098ReservdL();
        }
   		return ip65504P098ReservdL;
	}
	
	/**
	 * 	Update Ip65504P098ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P098-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P098ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P098ReservdL = checkIp65504P098ReservdLMaxLimit(number); 
		serializeIp65504P098ReservdL(ip65504P098ReservdL);
	}

	public void setIp65504P098ReservdL(int number) {
	    number = checkIp65504P098ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P098ReservdL((short)number);
	}
	public void setIp65504P098ReservdL(long number) {
	    number = checkIp65504P098ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P098ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P099ReservdS
	 *	@return ip65504P099ReservdS
	 */
	public short getIp65504P099ReservdS() throws CFException {
        if (isIp65504P099ReservdSModified()) { 
           ip65504P099ReservdS = refreshIp65504P099ReservdS();
        }
   		return ip65504P099ReservdS;
	}
	
	/**
	 * 	Update Ip65504P099ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P099-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P099ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P099ReservdS = checkIp65504P099ReservdSMaxLimit(number); 
		serializeIp65504P099ReservdS(ip65504P099ReservdS);
	}

	public void setIp65504P099ReservdS(int number) {
	    number = checkIp65504P099ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P099ReservdS((short)number);
	}
	public void setIp65504P099ReservdS(long number) {
	    number = checkIp65504P099ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P099ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P099ReservdL
	 *	@return ip65504P099ReservdL
	 */
	public short getIp65504P099ReservdL() throws CFException {
        if (isIp65504P099ReservdLModified()) { 
           ip65504P099ReservdL = refreshIp65504P099ReservdL();
        }
   		return ip65504P099ReservdL;
	}
	
	/**
	 * 	Update Ip65504P099ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P099-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P099ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P099ReservdL = checkIp65504P099ReservdLMaxLimit(number); 
		serializeIp65504P099ReservdL(ip65504P099ReservdL);
	}

	public void setIp65504P099ReservdL(int number) {
	    number = checkIp65504P099ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P099ReservdL((short)number);
	}
	public void setIp65504P099ReservdL(long number) {
	    number = checkIp65504P099ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P099ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P100ReservdS
	 *	@return ip65504P100ReservdS
	 */
	public short getIp65504P100ReservdS() throws CFException {
        if (isIp65504P100ReservdSModified()) { 
           ip65504P100ReservdS = refreshIp65504P100ReservdS();
        }
   		return ip65504P100ReservdS;
	}
	
	/**
	 * 	Update Ip65504P100ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P100-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P100ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P100ReservdS = checkIp65504P100ReservdSMaxLimit(number); 
		serializeIp65504P100ReservdS(ip65504P100ReservdS);
	}

	public void setIp65504P100ReservdS(int number) {
	    number = checkIp65504P100ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P100ReservdS((short)number);
	}
	public void setIp65504P100ReservdS(long number) {
	    number = checkIp65504P100ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P100ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P100ReservdL
	 *	@return ip65504P100ReservdL
	 */
	public short getIp65504P100ReservdL() throws CFException {
        if (isIp65504P100ReservdLModified()) { 
           ip65504P100ReservdL = refreshIp65504P100ReservdL();
        }
   		return ip65504P100ReservdL;
	}
	
	/**
	 * 	Update Ip65504P100ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P100-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P100ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P100ReservdL = checkIp65504P100ReservdLMaxLimit(number); 
		serializeIp65504P100ReservdL(ip65504P100ReservdL);
	}

	public void setIp65504P100ReservdL(int number) {
	    number = checkIp65504P100ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P100ReservdL((short)number);
	}
	public void setIp65504P100ReservdL(long number) {
	    number = checkIp65504P100ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P100ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P101ReservdS
	 *	@return ip65504P101ReservdS
	 */
	public short getIp65504P101ReservdS() throws CFException {
        if (isIp65504P101ReservdSModified()) { 
           ip65504P101ReservdS = refreshIp65504P101ReservdS();
        }
   		return ip65504P101ReservdS;
	}
	
	/**
	 * 	Update Ip65504P101ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P101-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P101ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P101ReservdS = checkIp65504P101ReservdSMaxLimit(number); 
		serializeIp65504P101ReservdS(ip65504P101ReservdS);
	}

	public void setIp65504P101ReservdS(int number) {
	    number = checkIp65504P101ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P101ReservdS((short)number);
	}
	public void setIp65504P101ReservdS(long number) {
	    number = checkIp65504P101ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P101ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P101ReservdL
	 *	@return ip65504P101ReservdL
	 */
	public short getIp65504P101ReservdL() throws CFException {
        if (isIp65504P101ReservdLModified()) { 
           ip65504P101ReservdL = refreshIp65504P101ReservdL();
        }
   		return ip65504P101ReservdL;
	}
	
	/**
	 * 	Update Ip65504P101ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P101-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P101ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P101ReservdL = checkIp65504P101ReservdLMaxLimit(number); 
		serializeIp65504P101ReservdL(ip65504P101ReservdL);
	}

	public void setIp65504P101ReservdL(int number) {
	    number = checkIp65504P101ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P101ReservdL((short)number);
	}
	public void setIp65504P101ReservdL(long number) {
	    number = checkIp65504P101ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P101ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P102ReservdS
	 *	@return ip65504P102ReservdS
	 */
	public short getIp65504P102ReservdS() throws CFException {
        if (isIp65504P102ReservdSModified()) { 
           ip65504P102ReservdS = refreshIp65504P102ReservdS();
        }
   		return ip65504P102ReservdS;
	}
	
	/**
	 * 	Update Ip65504P102ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P102-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P102ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P102ReservdS = checkIp65504P102ReservdSMaxLimit(number); 
		serializeIp65504P102ReservdS(ip65504P102ReservdS);
	}

	public void setIp65504P102ReservdS(int number) {
	    number = checkIp65504P102ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P102ReservdS((short)number);
	}
	public void setIp65504P102ReservdS(long number) {
	    number = checkIp65504P102ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P102ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P102ReservdL
	 *	@return ip65504P102ReservdL
	 */
	public short getIp65504P102ReservdL() throws CFException {
        if (isIp65504P102ReservdLModified()) { 
           ip65504P102ReservdL = refreshIp65504P102ReservdL();
        }
   		return ip65504P102ReservdL;
	}
	
	/**
	 * 	Update Ip65504P102ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P102-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P102ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P102ReservdL = checkIp65504P102ReservdLMaxLimit(number); 
		serializeIp65504P102ReservdL(ip65504P102ReservdL);
	}

	public void setIp65504P102ReservdL(int number) {
	    number = checkIp65504P102ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P102ReservdL((short)number);
	}
	public void setIp65504P102ReservdL(long number) {
	    number = checkIp65504P102ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P102ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P103TrxDesS
	 *	@return ip65504P103TrxDesS
	 */
	public short getIp65504P103TrxDesS() throws CFException {
        if (isIp65504P103TrxDesSModified()) { 
           ip65504P103TrxDesS = refreshIp65504P103TrxDesS();
        }
   		return ip65504P103TrxDesS;
	}
	
	/**
	 * 	Update Ip65504P103TrxDesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P103-TRX-DES-S
	 *	@param number
	 */
	public void setIp65504P103TrxDesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P103TrxDesS = checkIp65504P103TrxDesSMaxLimit(number); 
		serializeIp65504P103TrxDesS(ip65504P103TrxDesS);
	}

	public void setIp65504P103TrxDesS(int number) {
	    number = checkIp65504P103TrxDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P103TrxDesS((short)number);
	}
	public void setIp65504P103TrxDesS(long number) {
	    number = checkIp65504P103TrxDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P103TrxDesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P103TrxDesL
	 *	@return ip65504P103TrxDesL
	 */
	public short getIp65504P103TrxDesL() throws CFException {
        if (isIp65504P103TrxDesLModified()) { 
           ip65504P103TrxDesL = refreshIp65504P103TrxDesL();
        }
   		return ip65504P103TrxDesL;
	}
	
	/**
	 * 	Update Ip65504P103TrxDesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P103-TRX-DES-L
	 *	@param number
	 */
	public void setIp65504P103TrxDesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P103TrxDesL = checkIp65504P103TrxDesLMaxLimit(number); 
		serializeIp65504P103TrxDesL(ip65504P103TrxDesL);
	}

	public void setIp65504P103TrxDesL(int number) {
	    number = checkIp65504P103TrxDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P103TrxDesL((short)number);
	}
	public void setIp65504P103TrxDesL(long number) {
	    number = checkIp65504P103TrxDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P103TrxDesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P104ReservdS
	 *	@return ip65504P104ReservdS
	 */
	public short getIp65504P104ReservdS() throws CFException {
        if (isIp65504P104ReservdSModified()) { 
           ip65504P104ReservdS = refreshIp65504P104ReservdS();
        }
   		return ip65504P104ReservdS;
	}
	
	/**
	 * 	Update Ip65504P104ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P104-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P104ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P104ReservdS = checkIp65504P104ReservdSMaxLimit(number); 
		serializeIp65504P104ReservdS(ip65504P104ReservdS);
	}

	public void setIp65504P104ReservdS(int number) {
	    number = checkIp65504P104ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P104ReservdS((short)number);
	}
	public void setIp65504P104ReservdS(long number) {
	    number = checkIp65504P104ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P104ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P104ReservdL
	 *	@return ip65504P104ReservdL
	 */
	public short getIp65504P104ReservdL() throws CFException {
        if (isIp65504P104ReservdLModified()) { 
           ip65504P104ReservdL = refreshIp65504P104ReservdL();
        }
   		return ip65504P104ReservdL;
	}
	
	/**
	 * 	Update Ip65504P104ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P104-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P104ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P104ReservdL = checkIp65504P104ReservdLMaxLimit(number); 
		serializeIp65504P104ReservdL(ip65504P104ReservdL);
	}

	public void setIp65504P104ReservdL(int number) {
	    number = checkIp65504P104ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P104ReservdL((short)number);
	}
	public void setIp65504P104ReservdL(long number) {
	    number = checkIp65504P104ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P104ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P105FileIdS
	 *	@return ip65504P105FileIdS
	 */
	public short getIp65504P105FileIdS() throws CFException {
        if (isIp65504P105FileIdSModified()) { 
           ip65504P105FileIdS = refreshIp65504P105FileIdS();
        }
   		return ip65504P105FileIdS;
	}
	
	/**
	 * 	Update Ip65504P105FileIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P105-FILE-ID-S
	 *	@param number
	 */
	public void setIp65504P105FileIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P105FileIdS = checkIp65504P105FileIdSMaxLimit(number); 
		serializeIp65504P105FileIdS(ip65504P105FileIdS);
	}

	public void setIp65504P105FileIdS(int number) {
	    number = checkIp65504P105FileIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P105FileIdS((short)number);
	}
	public void setIp65504P105FileIdS(long number) {
	    number = checkIp65504P105FileIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P105FileIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P105FileIdL
	 *	@return ip65504P105FileIdL
	 */
	public short getIp65504P105FileIdL() throws CFException {
        if (isIp65504P105FileIdLModified()) { 
           ip65504P105FileIdL = refreshIp65504P105FileIdL();
        }
   		return ip65504P105FileIdL;
	}
	
	/**
	 * 	Update Ip65504P105FileIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P105-FILE-ID-L
	 *	@param number
	 */
	public void setIp65504P105FileIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P105FileIdL = checkIp65504P105FileIdLMaxLimit(number); 
		serializeIp65504P105FileIdL(ip65504P105FileIdL);
	}

	public void setIp65504P105FileIdL(int number) {
	    number = checkIp65504P105FileIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P105FileIdL((short)number);
	}
	public void setIp65504P105FileIdL(long number) {
	    number = checkIp65504P105FileIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P105FileIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P106ReservdS
	 *	@return ip65504P106ReservdS
	 */
	public short getIp65504P106ReservdS() throws CFException {
        if (isIp65504P106ReservdSModified()) { 
           ip65504P106ReservdS = refreshIp65504P106ReservdS();
        }
   		return ip65504P106ReservdS;
	}
	
	/**
	 * 	Update Ip65504P106ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P106-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P106ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P106ReservdS = checkIp65504P106ReservdSMaxLimit(number); 
		serializeIp65504P106ReservdS(ip65504P106ReservdS);
	}

	public void setIp65504P106ReservdS(int number) {
	    number = checkIp65504P106ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P106ReservdS((short)number);
	}
	public void setIp65504P106ReservdS(long number) {
	    number = checkIp65504P106ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P106ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P106ReservdL
	 *	@return ip65504P106ReservdL
	 */
	public short getIp65504P106ReservdL() throws CFException {
        if (isIp65504P106ReservdLModified()) { 
           ip65504P106ReservdL = refreshIp65504P106ReservdL();
        }
   		return ip65504P106ReservdL;
	}
	
	/**
	 * 	Update Ip65504P106ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P106-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P106ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P106ReservdL = checkIp65504P106ReservdLMaxLimit(number); 
		serializeIp65504P106ReservdL(ip65504P106ReservdL);
	}

	public void setIp65504P106ReservdL(int number) {
	    number = checkIp65504P106ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P106ReservdL((short)number);
	}
	public void setIp65504P106ReservdL(long number) {
	    number = checkIp65504P106ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P106ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P107ReservdS
	 *	@return ip65504P107ReservdS
	 */
	public short getIp65504P107ReservdS() throws CFException {
        if (isIp65504P107ReservdSModified()) { 
           ip65504P107ReservdS = refreshIp65504P107ReservdS();
        }
   		return ip65504P107ReservdS;
	}
	
	/**
	 * 	Update Ip65504P107ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P107-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P107ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P107ReservdS = checkIp65504P107ReservdSMaxLimit(number); 
		serializeIp65504P107ReservdS(ip65504P107ReservdS);
	}

	public void setIp65504P107ReservdS(int number) {
	    number = checkIp65504P107ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P107ReservdS((short)number);
	}
	public void setIp65504P107ReservdS(long number) {
	    number = checkIp65504P107ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P107ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P107ReservdL
	 *	@return ip65504P107ReservdL
	 */
	public short getIp65504P107ReservdL() throws CFException {
        if (isIp65504P107ReservdLModified()) { 
           ip65504P107ReservdL = refreshIp65504P107ReservdL();
        }
   		return ip65504P107ReservdL;
	}
	
	/**
	 * 	Update Ip65504P107ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P107-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P107ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P107ReservdL = checkIp65504P107ReservdLMaxLimit(number); 
		serializeIp65504P107ReservdL(ip65504P107ReservdL);
	}

	public void setIp65504P107ReservdL(int number) {
	    number = checkIp65504P107ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P107ReservdL((short)number);
	}
	public void setIp65504P107ReservdL(long number) {
	    number = checkIp65504P107ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P107ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P108ReservdS
	 *	@return ip65504P108ReservdS
	 */
	public short getIp65504P108ReservdS() throws CFException {
        if (isIp65504P108ReservdSModified()) { 
           ip65504P108ReservdS = refreshIp65504P108ReservdS();
        }
   		return ip65504P108ReservdS;
	}
	
	/**
	 * 	Update Ip65504P108ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P108-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P108ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P108ReservdS = checkIp65504P108ReservdSMaxLimit(number); 
		serializeIp65504P108ReservdS(ip65504P108ReservdS);
	}

	public void setIp65504P108ReservdS(int number) {
	    number = checkIp65504P108ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P108ReservdS((short)number);
	}
	public void setIp65504P108ReservdS(long number) {
	    number = checkIp65504P108ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P108ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P108ReservdL
	 *	@return ip65504P108ReservdL
	 */
	public short getIp65504P108ReservdL() throws CFException {
        if (isIp65504P108ReservdLModified()) { 
           ip65504P108ReservdL = refreshIp65504P108ReservdL();
        }
   		return ip65504P108ReservdL;
	}
	
	/**
	 * 	Update Ip65504P108ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P108-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P108ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P108ReservdL = checkIp65504P108ReservdLMaxLimit(number); 
		serializeIp65504P108ReservdL(ip65504P108ReservdL);
	}

	public void setIp65504P108ReservdL(int number) {
	    number = checkIp65504P108ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P108ReservdL((short)number);
	}
	public void setIp65504P108ReservdL(long number) {
	    number = checkIp65504P108ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P108ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P109ReservdS
	 *	@return ip65504P109ReservdS
	 */
	public short getIp65504P109ReservdS() throws CFException {
        if (isIp65504P109ReservdSModified()) { 
           ip65504P109ReservdS = refreshIp65504P109ReservdS();
        }
   		return ip65504P109ReservdS;
	}
	
	/**
	 * 	Update Ip65504P109ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P109-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P109ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P109ReservdS = checkIp65504P109ReservdSMaxLimit(number); 
		serializeIp65504P109ReservdS(ip65504P109ReservdS);
	}

	public void setIp65504P109ReservdS(int number) {
	    number = checkIp65504P109ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P109ReservdS((short)number);
	}
	public void setIp65504P109ReservdS(long number) {
	    number = checkIp65504P109ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P109ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P109ReservdL
	 *	@return ip65504P109ReservdL
	 */
	public short getIp65504P109ReservdL() throws CFException {
        if (isIp65504P109ReservdLModified()) { 
           ip65504P109ReservdL = refreshIp65504P109ReservdL();
        }
   		return ip65504P109ReservdL;
	}
	
	/**
	 * 	Update Ip65504P109ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P109-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P109ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P109ReservdL = checkIp65504P109ReservdLMaxLimit(number); 
		serializeIp65504P109ReservdL(ip65504P109ReservdL);
	}

	public void setIp65504P109ReservdL(int number) {
	    number = checkIp65504P109ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P109ReservdL((short)number);
	}
	public void setIp65504P109ReservdL(long number) {
	    number = checkIp65504P109ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P109ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P110TranIdS
	 *	@return ip65504P110TranIdS
	 */
	public short getIp65504P110TranIdS() throws CFException {
        if (isIp65504P110TranIdSModified()) { 
           ip65504P110TranIdS = refreshIp65504P110TranIdS();
        }
   		return ip65504P110TranIdS;
	}
	
	/**
	 * 	Update Ip65504P110TranIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P110-TRAN-ID-S
	 *	@param number
	 */
	public void setIp65504P110TranIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P110TranIdS = checkIp65504P110TranIdSMaxLimit(number); 
		serializeIp65504P110TranIdS(ip65504P110TranIdS);
	}

	public void setIp65504P110TranIdS(int number) {
	    number = checkIp65504P110TranIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P110TranIdS((short)number);
	}
	public void setIp65504P110TranIdS(long number) {
	    number = checkIp65504P110TranIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P110TranIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P110TranIdL
	 *	@return ip65504P110TranIdL
	 */
	public short getIp65504P110TranIdL() throws CFException {
        if (isIp65504P110TranIdLModified()) { 
           ip65504P110TranIdL = refreshIp65504P110TranIdL();
        }
   		return ip65504P110TranIdL;
	}
	
	/**
	 * 	Update Ip65504P110TranIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P110-TRAN-ID-L
	 *	@param number
	 */
	public void setIp65504P110TranIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P110TranIdL = checkIp65504P110TranIdLMaxLimit(number); 
		serializeIp65504P110TranIdL(ip65504P110TranIdL);
	}

	public void setIp65504P110TranIdL(int number) {
	    number = checkIp65504P110TranIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P110TranIdL((short)number);
	}
	public void setIp65504P110TranIdL(long number) {
	    number = checkIp65504P110TranIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P110TranIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P111ReservdS
	 *	@return ip65504P111ReservdS
	 */
	public short getIp65504P111ReservdS() throws CFException {
        if (isIp65504P111ReservdSModified()) { 
           ip65504P111ReservdS = refreshIp65504P111ReservdS();
        }
   		return ip65504P111ReservdS;
	}
	
	/**
	 * 	Update Ip65504P111ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P111-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P111ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P111ReservdS = checkIp65504P111ReservdSMaxLimit(number); 
		serializeIp65504P111ReservdS(ip65504P111ReservdS);
	}

	public void setIp65504P111ReservdS(int number) {
	    number = checkIp65504P111ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P111ReservdS((short)number);
	}
	public void setIp65504P111ReservdS(long number) {
	    number = checkIp65504P111ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P111ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P111ReservdL
	 *	@return ip65504P111ReservdL
	 */
	public short getIp65504P111ReservdL() throws CFException {
        if (isIp65504P111ReservdLModified()) { 
           ip65504P111ReservdL = refreshIp65504P111ReservdL();
        }
   		return ip65504P111ReservdL;
	}
	
	/**
	 * 	Update Ip65504P111ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P111-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P111ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P111ReservdL = checkIp65504P111ReservdLMaxLimit(number); 
		serializeIp65504P111ReservdL(ip65504P111ReservdL);
	}

	public void setIp65504P111ReservdL(int number) {
	    number = checkIp65504P111ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P111ReservdL((short)number);
	}
	public void setIp65504P111ReservdL(long number) {
	    number = checkIp65504P111ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P111ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P112ReservdS
	 *	@return ip65504P112ReservdS
	 */
	public short getIp65504P112ReservdS() throws CFException {
        if (isIp65504P112ReservdSModified()) { 
           ip65504P112ReservdS = refreshIp65504P112ReservdS();
        }
   		return ip65504P112ReservdS;
	}
	
	/**
	 * 	Update Ip65504P112ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P112-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P112ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P112ReservdS = checkIp65504P112ReservdSMaxLimit(number); 
		serializeIp65504P112ReservdS(ip65504P112ReservdS);
	}

	public void setIp65504P112ReservdS(int number) {
	    number = checkIp65504P112ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P112ReservdS((short)number);
	}
	public void setIp65504P112ReservdS(long number) {
	    number = checkIp65504P112ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P112ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P112ReservdL
	 *	@return ip65504P112ReservdL
	 */
	public short getIp65504P112ReservdL() throws CFException {
        if (isIp65504P112ReservdLModified()) { 
           ip65504P112ReservdL = refreshIp65504P112ReservdL();
        }
   		return ip65504P112ReservdL;
	}
	
	/**
	 * 	Update Ip65504P112ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P112-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P112ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P112ReservdL = checkIp65504P112ReservdLMaxLimit(number); 
		serializeIp65504P112ReservdL(ip65504P112ReservdL);
	}

	public void setIp65504P112ReservdL(int number) {
	    number = checkIp65504P112ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P112ReservdL((short)number);
	}
	public void setIp65504P112ReservdL(long number) {
	    number = checkIp65504P112ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P112ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P113ReservdS
	 *	@return ip65504P113ReservdS
	 */
	public short getIp65504P113ReservdS() throws CFException {
        if (isIp65504P113ReservdSModified()) { 
           ip65504P113ReservdS = refreshIp65504P113ReservdS();
        }
   		return ip65504P113ReservdS;
	}
	
	/**
	 * 	Update Ip65504P113ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P113-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P113ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P113ReservdS = checkIp65504P113ReservdSMaxLimit(number); 
		serializeIp65504P113ReservdS(ip65504P113ReservdS);
	}

	public void setIp65504P113ReservdS(int number) {
	    number = checkIp65504P113ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P113ReservdS((short)number);
	}
	public void setIp65504P113ReservdS(long number) {
	    number = checkIp65504P113ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P113ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P113ReservdL
	 *	@return ip65504P113ReservdL
	 */
	public short getIp65504P113ReservdL() throws CFException {
        if (isIp65504P113ReservdLModified()) { 
           ip65504P113ReservdL = refreshIp65504P113ReservdL();
        }
   		return ip65504P113ReservdL;
	}
	
	/**
	 * 	Update Ip65504P113ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P113-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P113ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P113ReservdL = checkIp65504P113ReservdLMaxLimit(number); 
		serializeIp65504P113ReservdL(ip65504P113ReservdL);
	}

	public void setIp65504P113ReservdL(int number) {
	    number = checkIp65504P113ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P113ReservdL((short)number);
	}
	public void setIp65504P113ReservdL(long number) {
	    number = checkIp65504P113ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P113ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P114ReservdS
	 *	@return ip65504P114ReservdS
	 */
	public short getIp65504P114ReservdS() throws CFException {
        if (isIp65504P114ReservdSModified()) { 
           ip65504P114ReservdS = refreshIp65504P114ReservdS();
        }
   		return ip65504P114ReservdS;
	}
	
	/**
	 * 	Update Ip65504P114ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P114-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P114ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P114ReservdS = checkIp65504P114ReservdSMaxLimit(number); 
		serializeIp65504P114ReservdS(ip65504P114ReservdS);
	}

	public void setIp65504P114ReservdS(int number) {
	    number = checkIp65504P114ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P114ReservdS((short)number);
	}
	public void setIp65504P114ReservdS(long number) {
	    number = checkIp65504P114ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P114ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P114ReservdL
	 *	@return ip65504P114ReservdL
	 */
	public short getIp65504P114ReservdL() throws CFException {
        if (isIp65504P114ReservdLModified()) { 
           ip65504P114ReservdL = refreshIp65504P114ReservdL();
        }
   		return ip65504P114ReservdL;
	}
	
	/**
	 * 	Update Ip65504P114ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P114-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P114ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P114ReservdL = checkIp65504P114ReservdLMaxLimit(number); 
		serializeIp65504P114ReservdL(ip65504P114ReservdL);
	}

	public void setIp65504P114ReservdL(int number) {
	    number = checkIp65504P114ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P114ReservdL((short)number);
	}
	public void setIp65504P114ReservdL(long number) {
	    number = checkIp65504P114ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P114ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P115ReservdS
	 *	@return ip65504P115ReservdS
	 */
	public short getIp65504P115ReservdS() throws CFException {
        if (isIp65504P115ReservdSModified()) { 
           ip65504P115ReservdS = refreshIp65504P115ReservdS();
        }
   		return ip65504P115ReservdS;
	}
	
	/**
	 * 	Update Ip65504P115ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P115-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P115ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P115ReservdS = checkIp65504P115ReservdSMaxLimit(number); 
		serializeIp65504P115ReservdS(ip65504P115ReservdS);
	}

	public void setIp65504P115ReservdS(int number) {
	    number = checkIp65504P115ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P115ReservdS((short)number);
	}
	public void setIp65504P115ReservdS(long number) {
	    number = checkIp65504P115ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P115ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P115ReservdL
	 *	@return ip65504P115ReservdL
	 */
	public short getIp65504P115ReservdL() throws CFException {
        if (isIp65504P115ReservdLModified()) { 
           ip65504P115ReservdL = refreshIp65504P115ReservdL();
        }
   		return ip65504P115ReservdL;
	}
	
	/**
	 * 	Update Ip65504P115ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P115-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P115ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P115ReservdL = checkIp65504P115ReservdLMaxLimit(number); 
		serializeIp65504P115ReservdL(ip65504P115ReservdL);
	}

	public void setIp65504P115ReservdL(int number) {
	    number = checkIp65504P115ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P115ReservdL((short)number);
	}
	public void setIp65504P115ReservdL(long number) {
	    number = checkIp65504P115ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P115ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P116ReservdS
	 *	@return ip65504P116ReservdS
	 */
	public short getIp65504P116ReservdS() throws CFException {
        if (isIp65504P116ReservdSModified()) { 
           ip65504P116ReservdS = refreshIp65504P116ReservdS();
        }
   		return ip65504P116ReservdS;
	}
	
	/**
	 * 	Update Ip65504P116ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P116-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P116ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P116ReservdS = checkIp65504P116ReservdSMaxLimit(number); 
		serializeIp65504P116ReservdS(ip65504P116ReservdS);
	}

	public void setIp65504P116ReservdS(int number) {
	    number = checkIp65504P116ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P116ReservdS((short)number);
	}
	public void setIp65504P116ReservdS(long number) {
	    number = checkIp65504P116ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P116ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P116ReservdL
	 *	@return ip65504P116ReservdL
	 */
	public short getIp65504P116ReservdL() throws CFException {
        if (isIp65504P116ReservdLModified()) { 
           ip65504P116ReservdL = refreshIp65504P116ReservdL();
        }
   		return ip65504P116ReservdL;
	}
	
	/**
	 * 	Update Ip65504P116ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P116-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P116ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P116ReservdL = checkIp65504P116ReservdLMaxLimit(number); 
		serializeIp65504P116ReservdL(ip65504P116ReservdL);
	}

	public void setIp65504P116ReservdL(int number) {
	    number = checkIp65504P116ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P116ReservdL((short)number);
	}
	public void setIp65504P116ReservdL(long number) {
	    number = checkIp65504P116ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P116ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P117ReservdS
	 *	@return ip65504P117ReservdS
	 */
	public short getIp65504P117ReservdS() throws CFException {
        if (isIp65504P117ReservdSModified()) { 
           ip65504P117ReservdS = refreshIp65504P117ReservdS();
        }
   		return ip65504P117ReservdS;
	}
	
	/**
	 * 	Update Ip65504P117ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P117-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P117ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P117ReservdS = checkIp65504P117ReservdSMaxLimit(number); 
		serializeIp65504P117ReservdS(ip65504P117ReservdS);
	}

	public void setIp65504P117ReservdS(int number) {
	    number = checkIp65504P117ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P117ReservdS((short)number);
	}
	public void setIp65504P117ReservdS(long number) {
	    number = checkIp65504P117ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P117ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P117ReservdL
	 *	@return ip65504P117ReservdL
	 */
	public short getIp65504P117ReservdL() throws CFException {
        if (isIp65504P117ReservdLModified()) { 
           ip65504P117ReservdL = refreshIp65504P117ReservdL();
        }
   		return ip65504P117ReservdL;
	}
	
	/**
	 * 	Update Ip65504P117ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P117-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P117ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P117ReservdL = checkIp65504P117ReservdLMaxLimit(number); 
		serializeIp65504P117ReservdL(ip65504P117ReservdL);
	}

	public void setIp65504P117ReservdL(int number) {
	    number = checkIp65504P117ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P117ReservdL((short)number);
	}
	public void setIp65504P117ReservdL(long number) {
	    number = checkIp65504P117ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P117ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P118ReservdS
	 *	@return ip65504P118ReservdS
	 */
	public short getIp65504P118ReservdS() throws CFException {
        if (isIp65504P118ReservdSModified()) { 
           ip65504P118ReservdS = refreshIp65504P118ReservdS();
        }
   		return ip65504P118ReservdS;
	}
	
	/**
	 * 	Update Ip65504P118ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P118-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P118ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P118ReservdS = checkIp65504P118ReservdSMaxLimit(number); 
		serializeIp65504P118ReservdS(ip65504P118ReservdS);
	}

	public void setIp65504P118ReservdS(int number) {
	    number = checkIp65504P118ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P118ReservdS((short)number);
	}
	public void setIp65504P118ReservdS(long number) {
	    number = checkIp65504P118ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P118ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P118ReservdL
	 *	@return ip65504P118ReservdL
	 */
	public short getIp65504P118ReservdL() throws CFException {
        if (isIp65504P118ReservdLModified()) { 
           ip65504P118ReservdL = refreshIp65504P118ReservdL();
        }
   		return ip65504P118ReservdL;
	}
	
	/**
	 * 	Update Ip65504P118ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P118-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P118ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P118ReservdL = checkIp65504P118ReservdLMaxLimit(number); 
		serializeIp65504P118ReservdL(ip65504P118ReservdL);
	}

	public void setIp65504P118ReservdL(int number) {
	    number = checkIp65504P118ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P118ReservdL((short)number);
	}
	public void setIp65504P118ReservdL(long number) {
	    number = checkIp65504P118ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P118ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P119ReservdS
	 *	@return ip65504P119ReservdS
	 */
	public short getIp65504P119ReservdS() throws CFException {
        if (isIp65504P119ReservdSModified()) { 
           ip65504P119ReservdS = refreshIp65504P119ReservdS();
        }
   		return ip65504P119ReservdS;
	}
	
	/**
	 * 	Update Ip65504P119ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P119-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P119ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P119ReservdS = checkIp65504P119ReservdSMaxLimit(number); 
		serializeIp65504P119ReservdS(ip65504P119ReservdS);
	}

	public void setIp65504P119ReservdS(int number) {
	    number = checkIp65504P119ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P119ReservdS((short)number);
	}
	public void setIp65504P119ReservdS(long number) {
	    number = checkIp65504P119ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P119ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P119ReservdL
	 *	@return ip65504P119ReservdL
	 */
	public short getIp65504P119ReservdL() throws CFException {
        if (isIp65504P119ReservdLModified()) { 
           ip65504P119ReservdL = refreshIp65504P119ReservdL();
        }
   		return ip65504P119ReservdL;
	}
	
	/**
	 * 	Update Ip65504P119ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P119-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P119ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P119ReservdL = checkIp65504P119ReservdLMaxLimit(number); 
		serializeIp65504P119ReservdL(ip65504P119ReservdL);
	}

	public void setIp65504P119ReservdL(int number) {
	    number = checkIp65504P119ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P119ReservdL((short)number);
	}
	public void setIp65504P119ReservdL(long number) {
	    number = checkIp65504P119ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P119ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P120ReservdS
	 *	@return ip65504P120ReservdS
	 */
	public short getIp65504P120ReservdS() throws CFException {
        if (isIp65504P120ReservdSModified()) { 
           ip65504P120ReservdS = refreshIp65504P120ReservdS();
        }
   		return ip65504P120ReservdS;
	}
	
	/**
	 * 	Update Ip65504P120ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P120-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P120ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P120ReservdS = checkIp65504P120ReservdSMaxLimit(number); 
		serializeIp65504P120ReservdS(ip65504P120ReservdS);
	}

	public void setIp65504P120ReservdS(int number) {
	    number = checkIp65504P120ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P120ReservdS((short)number);
	}
	public void setIp65504P120ReservdS(long number) {
	    number = checkIp65504P120ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P120ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P120ReservdL
	 *	@return ip65504P120ReservdL
	 */
	public short getIp65504P120ReservdL() throws CFException {
        if (isIp65504P120ReservdLModified()) { 
           ip65504P120ReservdL = refreshIp65504P120ReservdL();
        }
   		return ip65504P120ReservdL;
	}
	
	/**
	 * 	Update Ip65504P120ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P120-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P120ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P120ReservdL = checkIp65504P120ReservdLMaxLimit(number); 
		serializeIp65504P120ReservdL(ip65504P120ReservdL);
	}

	public void setIp65504P120ReservdL(int number) {
	    number = checkIp65504P120ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P120ReservdL((short)number);
	}
	public void setIp65504P120ReservdL(long number) {
	    number = checkIp65504P120ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P120ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P121ReservdS
	 *	@return ip65504P121ReservdS
	 */
	public short getIp65504P121ReservdS() throws CFException {
        if (isIp65504P121ReservdSModified()) { 
           ip65504P121ReservdS = refreshIp65504P121ReservdS();
        }
   		return ip65504P121ReservdS;
	}
	
	/**
	 * 	Update Ip65504P121ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P121-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P121ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P121ReservdS = checkIp65504P121ReservdSMaxLimit(number); 
		serializeIp65504P121ReservdS(ip65504P121ReservdS);
	}

	public void setIp65504P121ReservdS(int number) {
	    number = checkIp65504P121ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P121ReservdS((short)number);
	}
	public void setIp65504P121ReservdS(long number) {
	    number = checkIp65504P121ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P121ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P121ReservdL
	 *	@return ip65504P121ReservdL
	 */
	public short getIp65504P121ReservdL() throws CFException {
        if (isIp65504P121ReservdLModified()) { 
           ip65504P121ReservdL = refreshIp65504P121ReservdL();
        }
   		return ip65504P121ReservdL;
	}
	
	/**
	 * 	Update Ip65504P121ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P121-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P121ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P121ReservdL = checkIp65504P121ReservdLMaxLimit(number); 
		serializeIp65504P121ReservdL(ip65504P121ReservdL);
	}

	public void setIp65504P121ReservdL(int number) {
	    number = checkIp65504P121ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P121ReservdL((short)number);
	}
	public void setIp65504P121ReservdL(long number) {
	    number = checkIp65504P121ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P121ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P122ProcMdS
	 *	@return ip65504P122ProcMdS
	 */
	public short getIp65504P122ProcMdS() throws CFException {
        if (isIp65504P122ProcMdSModified()) { 
           ip65504P122ProcMdS = refreshIp65504P122ProcMdS();
        }
   		return ip65504P122ProcMdS;
	}
	
	/**
	 * 	Update Ip65504P122ProcMdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P122-PROC-MD-S
	 *	@param number
	 */
	public void setIp65504P122ProcMdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P122ProcMdS = checkIp65504P122ProcMdSMaxLimit(number); 
		serializeIp65504P122ProcMdS(ip65504P122ProcMdS);
	}

	public void setIp65504P122ProcMdS(int number) {
	    number = checkIp65504P122ProcMdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P122ProcMdS((short)number);
	}
	public void setIp65504P122ProcMdS(long number) {
	    number = checkIp65504P122ProcMdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P122ProcMdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P122ProcMdL
	 *	@return ip65504P122ProcMdL
	 */
	public short getIp65504P122ProcMdL() throws CFException {
        if (isIp65504P122ProcMdLModified()) { 
           ip65504P122ProcMdL = refreshIp65504P122ProcMdL();
        }
   		return ip65504P122ProcMdL;
	}
	
	/**
	 * 	Update Ip65504P122ProcMdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P122-PROC-MD-L
	 *	@param number
	 */
	public void setIp65504P122ProcMdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P122ProcMdL = checkIp65504P122ProcMdLMaxLimit(number); 
		serializeIp65504P122ProcMdL(ip65504P122ProcMdL);
	}

	public void setIp65504P122ProcMdL(int number) {
	    number = checkIp65504P122ProcMdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P122ProcMdL((short)number);
	}
	public void setIp65504P122ProcMdL(long number) {
	    number = checkIp65504P122ProcMdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P122ProcMdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P123ReservdS
	 *	@return ip65504P123ReservdS
	 */
	public short getIp65504P123ReservdS() throws CFException {
        if (isIp65504P123ReservdSModified()) { 
           ip65504P123ReservdS = refreshIp65504P123ReservdS();
        }
   		return ip65504P123ReservdS;
	}
	
	/**
	 * 	Update Ip65504P123ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P123-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P123ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P123ReservdS = checkIp65504P123ReservdSMaxLimit(number); 
		serializeIp65504P123ReservdS(ip65504P123ReservdS);
	}

	public void setIp65504P123ReservdS(int number) {
	    number = checkIp65504P123ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P123ReservdS((short)number);
	}
	public void setIp65504P123ReservdS(long number) {
	    number = checkIp65504P123ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P123ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P123ReservdL
	 *	@return ip65504P123ReservdL
	 */
	public short getIp65504P123ReservdL() throws CFException {
        if (isIp65504P123ReservdLModified()) { 
           ip65504P123ReservdL = refreshIp65504P123ReservdL();
        }
   		return ip65504P123ReservdL;
	}
	
	/**
	 * 	Update Ip65504P123ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P123-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P123ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P123ReservdL = checkIp65504P123ReservdLMaxLimit(number); 
		serializeIp65504P123ReservdL(ip65504P123ReservdL);
	}

	public void setIp65504P123ReservdL(int number) {
	    number = checkIp65504P123ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P123ReservdL((short)number);
	}
	public void setIp65504P123ReservdL(long number) {
	    number = checkIp65504P123ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P123ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P124ReservdS
	 *	@return ip65504P124ReservdS
	 */
	public short getIp65504P124ReservdS() throws CFException {
        if (isIp65504P124ReservdSModified()) { 
           ip65504P124ReservdS = refreshIp65504P124ReservdS();
        }
   		return ip65504P124ReservdS;
	}
	
	/**
	 * 	Update Ip65504P124ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P124-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P124ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P124ReservdS = checkIp65504P124ReservdSMaxLimit(number); 
		serializeIp65504P124ReservdS(ip65504P124ReservdS);
	}

	public void setIp65504P124ReservdS(int number) {
	    number = checkIp65504P124ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P124ReservdS((short)number);
	}
	public void setIp65504P124ReservdS(long number) {
	    number = checkIp65504P124ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P124ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P124ReservdL
	 *	@return ip65504P124ReservdL
	 */
	public short getIp65504P124ReservdL() throws CFException {
        if (isIp65504P124ReservdLModified()) { 
           ip65504P124ReservdL = refreshIp65504P124ReservdL();
        }
   		return ip65504P124ReservdL;
	}
	
	/**
	 * 	Update Ip65504P124ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P124-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P124ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P124ReservdL = checkIp65504P124ReservdLMaxLimit(number); 
		serializeIp65504P124ReservdL(ip65504P124ReservdL);
	}

	public void setIp65504P124ReservdL(int number) {
	    number = checkIp65504P124ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P124ReservdL((short)number);
	}
	public void setIp65504P124ReservdL(long number) {
	    number = checkIp65504P124ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P124ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup4
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P094ReservdS((short)0);
         	setIp65504P094ReservdL((short)0);
         	setIp65504P095CardsecS((short)0);
         	setIp65504P095CardsecL((short)0);
         	setIp65504P096ReservdS((short)0);
         	setIp65504P096ReservdL((short)0);
         	setIp65504P097ReservdS((short)0);
         	setIp65504P097ReservdL((short)0);
         	setIp65504P098ReservdS((short)0);
         	setIp65504P098ReservdL((short)0);
         	setIp65504P099ReservdS((short)0);
         	setIp65504P099ReservdL((short)0);
         	setIp65504P100ReservdS((short)0);
         	setIp65504P100ReservdL((short)0);
         	setIp65504P101ReservdS((short)0);
         	setIp65504P101ReservdL((short)0);
         	setIp65504P102ReservdS((short)0);
         	setIp65504P102ReservdL((short)0);
         	setIp65504P103TrxDesS((short)0);
         	setIp65504P103TrxDesL((short)0);
         	setIp65504P104ReservdS((short)0);
         	setIp65504P104ReservdL((short)0);
         	setIp65504P105FileIdS((short)0);
         	setIp65504P105FileIdL((short)0);
         	setIp65504P106ReservdS((short)0);
         	setIp65504P106ReservdL((short)0);
         	setIp65504P107ReservdS((short)0);
         	setIp65504P107ReservdL((short)0);
         	setIp65504P108ReservdS((short)0);
         	setIp65504P108ReservdL((short)0);
         	setIp65504P109ReservdS((short)0);
         	setIp65504P109ReservdL((short)0);
         	setIp65504P110TranIdS((short)0);
         	setIp65504P110TranIdL((short)0);
         	setIp65504P111ReservdS((short)0);
         	setIp65504P111ReservdL((short)0);
         	setIp65504P112ReservdS((short)0);
         	setIp65504P112ReservdL((short)0);
         	setIp65504P113ReservdS((short)0);
         	setIp65504P113ReservdL((short)0);
         	setIp65504P114ReservdS((short)0);
         	setIp65504P114ReservdL((short)0);
         	setIp65504P115ReservdS((short)0);
         	setIp65504P115ReservdL((short)0);
         	setIp65504P116ReservdS((short)0);
         	setIp65504P116ReservdL((short)0);
         	setIp65504P117ReservdS((short)0);
         	setIp65504P117ReservdL((short)0);
         	setIp65504P118ReservdS((short)0);
         	setIp65504P118ReservdL((short)0);
         	setIp65504P119ReservdS((short)0);
         	setIp65504P119ReservdL((short)0);
         	setIp65504P120ReservdS((short)0);
         	setIp65504P120ReservdL((short)0);
         	setIp65504P121ReservdS((short)0);
         	setIp65504P121ReservdL((short)0);
         	setIp65504P122ProcMdS((short)0);
         	setIp65504P122ProcMdL((short)0);
         	setIp65504P123ReservdS((short)0);
         	setIp65504P123ReservdL((short)0);
         	setIp65504P124ReservdS((short)0);
         	setIp65504P124ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup4FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_4_LENGTH;
		}

}
  
