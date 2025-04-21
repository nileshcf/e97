package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup16 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup16 extends Ip65504PdsNamesLargeGroup16Serialized { 
   

								private short ip65504P466ReservdS;

								private short ip65504P466ReservdL;


								private short ip65504P467ReservdS;

								private short ip65504P467ReservdL;


								private short ip65504P468ReservdS;

								private short ip65504P468ReservdL;


								private short ip65504P469ReservdS;

								private short ip65504P469ReservdL;


								private short ip65504P470ReservdS;

								private short ip65504P470ReservdL;


								private short ip65504P471ReservdS;

								private short ip65504P471ReservdL;


								private short ip65504P472ReservdS;

								private short ip65504P472ReservdL;


								private short ip65504P473ReservdS;

								private short ip65504P473ReservdL;


								private short ip65504P474ReservdS;

								private short ip65504P474ReservdL;


								private short ip65504P475ReservdS;

								private short ip65504P475ReservdL;


								private short ip65504P476ReservdS;

								private short ip65504P476ReservdL;


								private short ip65504P477ReservdS;

								private short ip65504P477ReservdL;


								private short ip65504P478ReservdS;

								private short ip65504P478ReservdL;


								private short ip65504P479ReservdS;

								private short ip65504P479ReservdL;


								private short ip65504P480ReservdS;

								private short ip65504P480ReservdL;


								private short ip65504P481ReservdS;

								private short ip65504P481ReservdL;


								private short ip65504P482ReservdS;

								private short ip65504P482ReservdL;


								private short ip65504P483ReservdS;

								private short ip65504P483ReservdL;


								private short ip65504P484ReservdS;

								private short ip65504P484ReservdL;


								private short ip65504P485ReservdS;

								private short ip65504P485ReservdL;


								private short ip65504P486ReservdS;

								private short ip65504P486ReservdL;


								private short ip65504P487ReservdS;

								private short ip65504P487ReservdL;


								private short ip65504P488ReservdS;

								private short ip65504P488ReservdL;


								private short ip65504P489ReservdS;

								private short ip65504P489ReservdL;


								private short ip65504P490ReservdS;

								private short ip65504P490ReservdL;


								private short ip65504P491ReservdS;

								private short ip65504P491ReservdL;


								private short ip65504P492ReservdS;

								private short ip65504P492ReservdL;


								private short ip65504P493ReservdS;

								private short ip65504P493ReservdL;


								private short ip65504P494ReservdS;

								private short ip65504P494ReservdL;


								private short ip65504P495ReservdS;

								private short ip65504P495ReservdL;


								private short ip65504P496ReservdS;

								private short ip65504P496ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup16
	**/
    public Ip65504PdsNamesLargeGroup16() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup16. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup16(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P466ReservdS
	 *	@return ip65504P466ReservdS
	 */
	public short getIp65504P466ReservdS() throws CFException {
        if (isIp65504P466ReservdSModified()) { 
           ip65504P466ReservdS = refreshIp65504P466ReservdS();
        }
   		return ip65504P466ReservdS;
	}
	
	/**
	 * 	Update Ip65504P466ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P466-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P466ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P466ReservdS = checkIp65504P466ReservdSMaxLimit(number); 
		serializeIp65504P466ReservdS(ip65504P466ReservdS);
	}

	public void setIp65504P466ReservdS(int number) {
	    number = checkIp65504P466ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P466ReservdS((short)number);
	}
	public void setIp65504P466ReservdS(long number) {
	    number = checkIp65504P466ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P466ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P466ReservdL
	 *	@return ip65504P466ReservdL
	 */
	public short getIp65504P466ReservdL() throws CFException {
        if (isIp65504P466ReservdLModified()) { 
           ip65504P466ReservdL = refreshIp65504P466ReservdL();
        }
   		return ip65504P466ReservdL;
	}
	
	/**
	 * 	Update Ip65504P466ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P466-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P466ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P466ReservdL = checkIp65504P466ReservdLMaxLimit(number); 
		serializeIp65504P466ReservdL(ip65504P466ReservdL);
	}

	public void setIp65504P466ReservdL(int number) {
	    number = checkIp65504P466ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P466ReservdL((short)number);
	}
	public void setIp65504P466ReservdL(long number) {
	    number = checkIp65504P466ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P466ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P467ReservdS
	 *	@return ip65504P467ReservdS
	 */
	public short getIp65504P467ReservdS() throws CFException {
        if (isIp65504P467ReservdSModified()) { 
           ip65504P467ReservdS = refreshIp65504P467ReservdS();
        }
   		return ip65504P467ReservdS;
	}
	
	/**
	 * 	Update Ip65504P467ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P467-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P467ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P467ReservdS = checkIp65504P467ReservdSMaxLimit(number); 
		serializeIp65504P467ReservdS(ip65504P467ReservdS);
	}

	public void setIp65504P467ReservdS(int number) {
	    number = checkIp65504P467ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P467ReservdS((short)number);
	}
	public void setIp65504P467ReservdS(long number) {
	    number = checkIp65504P467ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P467ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P467ReservdL
	 *	@return ip65504P467ReservdL
	 */
	public short getIp65504P467ReservdL() throws CFException {
        if (isIp65504P467ReservdLModified()) { 
           ip65504P467ReservdL = refreshIp65504P467ReservdL();
        }
   		return ip65504P467ReservdL;
	}
	
	/**
	 * 	Update Ip65504P467ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P467-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P467ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P467ReservdL = checkIp65504P467ReservdLMaxLimit(number); 
		serializeIp65504P467ReservdL(ip65504P467ReservdL);
	}

	public void setIp65504P467ReservdL(int number) {
	    number = checkIp65504P467ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P467ReservdL((short)number);
	}
	public void setIp65504P467ReservdL(long number) {
	    number = checkIp65504P467ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P467ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P468ReservdS
	 *	@return ip65504P468ReservdS
	 */
	public short getIp65504P468ReservdS() throws CFException {
        if (isIp65504P468ReservdSModified()) { 
           ip65504P468ReservdS = refreshIp65504P468ReservdS();
        }
   		return ip65504P468ReservdS;
	}
	
	/**
	 * 	Update Ip65504P468ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P468-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P468ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P468ReservdS = checkIp65504P468ReservdSMaxLimit(number); 
		serializeIp65504P468ReservdS(ip65504P468ReservdS);
	}

	public void setIp65504P468ReservdS(int number) {
	    number = checkIp65504P468ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P468ReservdS((short)number);
	}
	public void setIp65504P468ReservdS(long number) {
	    number = checkIp65504P468ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P468ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P468ReservdL
	 *	@return ip65504P468ReservdL
	 */
	public short getIp65504P468ReservdL() throws CFException {
        if (isIp65504P468ReservdLModified()) { 
           ip65504P468ReservdL = refreshIp65504P468ReservdL();
        }
   		return ip65504P468ReservdL;
	}
	
	/**
	 * 	Update Ip65504P468ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P468-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P468ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P468ReservdL = checkIp65504P468ReservdLMaxLimit(number); 
		serializeIp65504P468ReservdL(ip65504P468ReservdL);
	}

	public void setIp65504P468ReservdL(int number) {
	    number = checkIp65504P468ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P468ReservdL((short)number);
	}
	public void setIp65504P468ReservdL(long number) {
	    number = checkIp65504P468ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P468ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P469ReservdS
	 *	@return ip65504P469ReservdS
	 */
	public short getIp65504P469ReservdS() throws CFException {
        if (isIp65504P469ReservdSModified()) { 
           ip65504P469ReservdS = refreshIp65504P469ReservdS();
        }
   		return ip65504P469ReservdS;
	}
	
	/**
	 * 	Update Ip65504P469ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P469-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P469ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P469ReservdS = checkIp65504P469ReservdSMaxLimit(number); 
		serializeIp65504P469ReservdS(ip65504P469ReservdS);
	}

	public void setIp65504P469ReservdS(int number) {
	    number = checkIp65504P469ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P469ReservdS((short)number);
	}
	public void setIp65504P469ReservdS(long number) {
	    number = checkIp65504P469ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P469ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P469ReservdL
	 *	@return ip65504P469ReservdL
	 */
	public short getIp65504P469ReservdL() throws CFException {
        if (isIp65504P469ReservdLModified()) { 
           ip65504P469ReservdL = refreshIp65504P469ReservdL();
        }
   		return ip65504P469ReservdL;
	}
	
	/**
	 * 	Update Ip65504P469ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P469-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P469ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P469ReservdL = checkIp65504P469ReservdLMaxLimit(number); 
		serializeIp65504P469ReservdL(ip65504P469ReservdL);
	}

	public void setIp65504P469ReservdL(int number) {
	    number = checkIp65504P469ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P469ReservdL((short)number);
	}
	public void setIp65504P469ReservdL(long number) {
	    number = checkIp65504P469ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P469ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P470ReservdS
	 *	@return ip65504P470ReservdS
	 */
	public short getIp65504P470ReservdS() throws CFException {
        if (isIp65504P470ReservdSModified()) { 
           ip65504P470ReservdS = refreshIp65504P470ReservdS();
        }
   		return ip65504P470ReservdS;
	}
	
	/**
	 * 	Update Ip65504P470ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P470-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P470ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P470ReservdS = checkIp65504P470ReservdSMaxLimit(number); 
		serializeIp65504P470ReservdS(ip65504P470ReservdS);
	}

	public void setIp65504P470ReservdS(int number) {
	    number = checkIp65504P470ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P470ReservdS((short)number);
	}
	public void setIp65504P470ReservdS(long number) {
	    number = checkIp65504P470ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P470ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P470ReservdL
	 *	@return ip65504P470ReservdL
	 */
	public short getIp65504P470ReservdL() throws CFException {
        if (isIp65504P470ReservdLModified()) { 
           ip65504P470ReservdL = refreshIp65504P470ReservdL();
        }
   		return ip65504P470ReservdL;
	}
	
	/**
	 * 	Update Ip65504P470ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P470-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P470ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P470ReservdL = checkIp65504P470ReservdLMaxLimit(number); 
		serializeIp65504P470ReservdL(ip65504P470ReservdL);
	}

	public void setIp65504P470ReservdL(int number) {
	    number = checkIp65504P470ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P470ReservdL((short)number);
	}
	public void setIp65504P470ReservdL(long number) {
	    number = checkIp65504P470ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P470ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P471ReservdS
	 *	@return ip65504P471ReservdS
	 */
	public short getIp65504P471ReservdS() throws CFException {
        if (isIp65504P471ReservdSModified()) { 
           ip65504P471ReservdS = refreshIp65504P471ReservdS();
        }
   		return ip65504P471ReservdS;
	}
	
	/**
	 * 	Update Ip65504P471ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P471-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P471ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P471ReservdS = checkIp65504P471ReservdSMaxLimit(number); 
		serializeIp65504P471ReservdS(ip65504P471ReservdS);
	}

	public void setIp65504P471ReservdS(int number) {
	    number = checkIp65504P471ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P471ReservdS((short)number);
	}
	public void setIp65504P471ReservdS(long number) {
	    number = checkIp65504P471ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P471ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P471ReservdL
	 *	@return ip65504P471ReservdL
	 */
	public short getIp65504P471ReservdL() throws CFException {
        if (isIp65504P471ReservdLModified()) { 
           ip65504P471ReservdL = refreshIp65504P471ReservdL();
        }
   		return ip65504P471ReservdL;
	}
	
	/**
	 * 	Update Ip65504P471ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P471-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P471ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P471ReservdL = checkIp65504P471ReservdLMaxLimit(number); 
		serializeIp65504P471ReservdL(ip65504P471ReservdL);
	}

	public void setIp65504P471ReservdL(int number) {
	    number = checkIp65504P471ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P471ReservdL((short)number);
	}
	public void setIp65504P471ReservdL(long number) {
	    number = checkIp65504P471ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P471ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P472ReservdS
	 *	@return ip65504P472ReservdS
	 */
	public short getIp65504P472ReservdS() throws CFException {
        if (isIp65504P472ReservdSModified()) { 
           ip65504P472ReservdS = refreshIp65504P472ReservdS();
        }
   		return ip65504P472ReservdS;
	}
	
	/**
	 * 	Update Ip65504P472ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P472-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P472ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P472ReservdS = checkIp65504P472ReservdSMaxLimit(number); 
		serializeIp65504P472ReservdS(ip65504P472ReservdS);
	}

	public void setIp65504P472ReservdS(int number) {
	    number = checkIp65504P472ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P472ReservdS((short)number);
	}
	public void setIp65504P472ReservdS(long number) {
	    number = checkIp65504P472ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P472ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P472ReservdL
	 *	@return ip65504P472ReservdL
	 */
	public short getIp65504P472ReservdL() throws CFException {
        if (isIp65504P472ReservdLModified()) { 
           ip65504P472ReservdL = refreshIp65504P472ReservdL();
        }
   		return ip65504P472ReservdL;
	}
	
	/**
	 * 	Update Ip65504P472ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P472-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P472ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P472ReservdL = checkIp65504P472ReservdLMaxLimit(number); 
		serializeIp65504P472ReservdL(ip65504P472ReservdL);
	}

	public void setIp65504P472ReservdL(int number) {
	    number = checkIp65504P472ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P472ReservdL((short)number);
	}
	public void setIp65504P472ReservdL(long number) {
	    number = checkIp65504P472ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P472ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P473ReservdS
	 *	@return ip65504P473ReservdS
	 */
	public short getIp65504P473ReservdS() throws CFException {
        if (isIp65504P473ReservdSModified()) { 
           ip65504P473ReservdS = refreshIp65504P473ReservdS();
        }
   		return ip65504P473ReservdS;
	}
	
	/**
	 * 	Update Ip65504P473ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P473-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P473ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P473ReservdS = checkIp65504P473ReservdSMaxLimit(number); 
		serializeIp65504P473ReservdS(ip65504P473ReservdS);
	}

	public void setIp65504P473ReservdS(int number) {
	    number = checkIp65504P473ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P473ReservdS((short)number);
	}
	public void setIp65504P473ReservdS(long number) {
	    number = checkIp65504P473ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P473ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P473ReservdL
	 *	@return ip65504P473ReservdL
	 */
	public short getIp65504P473ReservdL() throws CFException {
        if (isIp65504P473ReservdLModified()) { 
           ip65504P473ReservdL = refreshIp65504P473ReservdL();
        }
   		return ip65504P473ReservdL;
	}
	
	/**
	 * 	Update Ip65504P473ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P473-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P473ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P473ReservdL = checkIp65504P473ReservdLMaxLimit(number); 
		serializeIp65504P473ReservdL(ip65504P473ReservdL);
	}

	public void setIp65504P473ReservdL(int number) {
	    number = checkIp65504P473ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P473ReservdL((short)number);
	}
	public void setIp65504P473ReservdL(long number) {
	    number = checkIp65504P473ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P473ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P474ReservdS
	 *	@return ip65504P474ReservdS
	 */
	public short getIp65504P474ReservdS() throws CFException {
        if (isIp65504P474ReservdSModified()) { 
           ip65504P474ReservdS = refreshIp65504P474ReservdS();
        }
   		return ip65504P474ReservdS;
	}
	
	/**
	 * 	Update Ip65504P474ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P474-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P474ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P474ReservdS = checkIp65504P474ReservdSMaxLimit(number); 
		serializeIp65504P474ReservdS(ip65504P474ReservdS);
	}

	public void setIp65504P474ReservdS(int number) {
	    number = checkIp65504P474ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P474ReservdS((short)number);
	}
	public void setIp65504P474ReservdS(long number) {
	    number = checkIp65504P474ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P474ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P474ReservdL
	 *	@return ip65504P474ReservdL
	 */
	public short getIp65504P474ReservdL() throws CFException {
        if (isIp65504P474ReservdLModified()) { 
           ip65504P474ReservdL = refreshIp65504P474ReservdL();
        }
   		return ip65504P474ReservdL;
	}
	
	/**
	 * 	Update Ip65504P474ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P474-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P474ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P474ReservdL = checkIp65504P474ReservdLMaxLimit(number); 
		serializeIp65504P474ReservdL(ip65504P474ReservdL);
	}

	public void setIp65504P474ReservdL(int number) {
	    number = checkIp65504P474ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P474ReservdL((short)number);
	}
	public void setIp65504P474ReservdL(long number) {
	    number = checkIp65504P474ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P474ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P475ReservdS
	 *	@return ip65504P475ReservdS
	 */
	public short getIp65504P475ReservdS() throws CFException {
        if (isIp65504P475ReservdSModified()) { 
           ip65504P475ReservdS = refreshIp65504P475ReservdS();
        }
   		return ip65504P475ReservdS;
	}
	
	/**
	 * 	Update Ip65504P475ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P475-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P475ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P475ReservdS = checkIp65504P475ReservdSMaxLimit(number); 
		serializeIp65504P475ReservdS(ip65504P475ReservdS);
	}

	public void setIp65504P475ReservdS(int number) {
	    number = checkIp65504P475ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P475ReservdS((short)number);
	}
	public void setIp65504P475ReservdS(long number) {
	    number = checkIp65504P475ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P475ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P475ReservdL
	 *	@return ip65504P475ReservdL
	 */
	public short getIp65504P475ReservdL() throws CFException {
        if (isIp65504P475ReservdLModified()) { 
           ip65504P475ReservdL = refreshIp65504P475ReservdL();
        }
   		return ip65504P475ReservdL;
	}
	
	/**
	 * 	Update Ip65504P475ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P475-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P475ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P475ReservdL = checkIp65504P475ReservdLMaxLimit(number); 
		serializeIp65504P475ReservdL(ip65504P475ReservdL);
	}

	public void setIp65504P475ReservdL(int number) {
	    number = checkIp65504P475ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P475ReservdL((short)number);
	}
	public void setIp65504P475ReservdL(long number) {
	    number = checkIp65504P475ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P475ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P476ReservdS
	 *	@return ip65504P476ReservdS
	 */
	public short getIp65504P476ReservdS() throws CFException {
        if (isIp65504P476ReservdSModified()) { 
           ip65504P476ReservdS = refreshIp65504P476ReservdS();
        }
   		return ip65504P476ReservdS;
	}
	
	/**
	 * 	Update Ip65504P476ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P476-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P476ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P476ReservdS = checkIp65504P476ReservdSMaxLimit(number); 
		serializeIp65504P476ReservdS(ip65504P476ReservdS);
	}

	public void setIp65504P476ReservdS(int number) {
	    number = checkIp65504P476ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P476ReservdS((short)number);
	}
	public void setIp65504P476ReservdS(long number) {
	    number = checkIp65504P476ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P476ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P476ReservdL
	 *	@return ip65504P476ReservdL
	 */
	public short getIp65504P476ReservdL() throws CFException {
        if (isIp65504P476ReservdLModified()) { 
           ip65504P476ReservdL = refreshIp65504P476ReservdL();
        }
   		return ip65504P476ReservdL;
	}
	
	/**
	 * 	Update Ip65504P476ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P476-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P476ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P476ReservdL = checkIp65504P476ReservdLMaxLimit(number); 
		serializeIp65504P476ReservdL(ip65504P476ReservdL);
	}

	public void setIp65504P476ReservdL(int number) {
	    number = checkIp65504P476ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P476ReservdL((short)number);
	}
	public void setIp65504P476ReservdL(long number) {
	    number = checkIp65504P476ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P476ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P477ReservdS
	 *	@return ip65504P477ReservdS
	 */
	public short getIp65504P477ReservdS() throws CFException {
        if (isIp65504P477ReservdSModified()) { 
           ip65504P477ReservdS = refreshIp65504P477ReservdS();
        }
   		return ip65504P477ReservdS;
	}
	
	/**
	 * 	Update Ip65504P477ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P477-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P477ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P477ReservdS = checkIp65504P477ReservdSMaxLimit(number); 
		serializeIp65504P477ReservdS(ip65504P477ReservdS);
	}

	public void setIp65504P477ReservdS(int number) {
	    number = checkIp65504P477ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P477ReservdS((short)number);
	}
	public void setIp65504P477ReservdS(long number) {
	    number = checkIp65504P477ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P477ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P477ReservdL
	 *	@return ip65504P477ReservdL
	 */
	public short getIp65504P477ReservdL() throws CFException {
        if (isIp65504P477ReservdLModified()) { 
           ip65504P477ReservdL = refreshIp65504P477ReservdL();
        }
   		return ip65504P477ReservdL;
	}
	
	/**
	 * 	Update Ip65504P477ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P477-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P477ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P477ReservdL = checkIp65504P477ReservdLMaxLimit(number); 
		serializeIp65504P477ReservdL(ip65504P477ReservdL);
	}

	public void setIp65504P477ReservdL(int number) {
	    number = checkIp65504P477ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P477ReservdL((short)number);
	}
	public void setIp65504P477ReservdL(long number) {
	    number = checkIp65504P477ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P477ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P478ReservdS
	 *	@return ip65504P478ReservdS
	 */
	public short getIp65504P478ReservdS() throws CFException {
        if (isIp65504P478ReservdSModified()) { 
           ip65504P478ReservdS = refreshIp65504P478ReservdS();
        }
   		return ip65504P478ReservdS;
	}
	
	/**
	 * 	Update Ip65504P478ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P478-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P478ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P478ReservdS = checkIp65504P478ReservdSMaxLimit(number); 
		serializeIp65504P478ReservdS(ip65504P478ReservdS);
	}

	public void setIp65504P478ReservdS(int number) {
	    number = checkIp65504P478ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P478ReservdS((short)number);
	}
	public void setIp65504P478ReservdS(long number) {
	    number = checkIp65504P478ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P478ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P478ReservdL
	 *	@return ip65504P478ReservdL
	 */
	public short getIp65504P478ReservdL() throws CFException {
        if (isIp65504P478ReservdLModified()) { 
           ip65504P478ReservdL = refreshIp65504P478ReservdL();
        }
   		return ip65504P478ReservdL;
	}
	
	/**
	 * 	Update Ip65504P478ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P478-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P478ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P478ReservdL = checkIp65504P478ReservdLMaxLimit(number); 
		serializeIp65504P478ReservdL(ip65504P478ReservdL);
	}

	public void setIp65504P478ReservdL(int number) {
	    number = checkIp65504P478ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P478ReservdL((short)number);
	}
	public void setIp65504P478ReservdL(long number) {
	    number = checkIp65504P478ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P478ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P479ReservdS
	 *	@return ip65504P479ReservdS
	 */
	public short getIp65504P479ReservdS() throws CFException {
        if (isIp65504P479ReservdSModified()) { 
           ip65504P479ReservdS = refreshIp65504P479ReservdS();
        }
   		return ip65504P479ReservdS;
	}
	
	/**
	 * 	Update Ip65504P479ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P479-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P479ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P479ReservdS = checkIp65504P479ReservdSMaxLimit(number); 
		serializeIp65504P479ReservdS(ip65504P479ReservdS);
	}

	public void setIp65504P479ReservdS(int number) {
	    number = checkIp65504P479ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P479ReservdS((short)number);
	}
	public void setIp65504P479ReservdS(long number) {
	    number = checkIp65504P479ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P479ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P479ReservdL
	 *	@return ip65504P479ReservdL
	 */
	public short getIp65504P479ReservdL() throws CFException {
        if (isIp65504P479ReservdLModified()) { 
           ip65504P479ReservdL = refreshIp65504P479ReservdL();
        }
   		return ip65504P479ReservdL;
	}
	
	/**
	 * 	Update Ip65504P479ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P479-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P479ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P479ReservdL = checkIp65504P479ReservdLMaxLimit(number); 
		serializeIp65504P479ReservdL(ip65504P479ReservdL);
	}

	public void setIp65504P479ReservdL(int number) {
	    number = checkIp65504P479ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P479ReservdL((short)number);
	}
	public void setIp65504P479ReservdL(long number) {
	    number = checkIp65504P479ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P479ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P480ReservdS
	 *	@return ip65504P480ReservdS
	 */
	public short getIp65504P480ReservdS() throws CFException {
        if (isIp65504P480ReservdSModified()) { 
           ip65504P480ReservdS = refreshIp65504P480ReservdS();
        }
   		return ip65504P480ReservdS;
	}
	
	/**
	 * 	Update Ip65504P480ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P480-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P480ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P480ReservdS = checkIp65504P480ReservdSMaxLimit(number); 
		serializeIp65504P480ReservdS(ip65504P480ReservdS);
	}

	public void setIp65504P480ReservdS(int number) {
	    number = checkIp65504P480ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P480ReservdS((short)number);
	}
	public void setIp65504P480ReservdS(long number) {
	    number = checkIp65504P480ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P480ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P480ReservdL
	 *	@return ip65504P480ReservdL
	 */
	public short getIp65504P480ReservdL() throws CFException {
        if (isIp65504P480ReservdLModified()) { 
           ip65504P480ReservdL = refreshIp65504P480ReservdL();
        }
   		return ip65504P480ReservdL;
	}
	
	/**
	 * 	Update Ip65504P480ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P480-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P480ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P480ReservdL = checkIp65504P480ReservdLMaxLimit(number); 
		serializeIp65504P480ReservdL(ip65504P480ReservdL);
	}

	public void setIp65504P480ReservdL(int number) {
	    number = checkIp65504P480ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P480ReservdL((short)number);
	}
	public void setIp65504P480ReservdL(long number) {
	    number = checkIp65504P480ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P480ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P481ReservdS
	 *	@return ip65504P481ReservdS
	 */
	public short getIp65504P481ReservdS() throws CFException {
        if (isIp65504P481ReservdSModified()) { 
           ip65504P481ReservdS = refreshIp65504P481ReservdS();
        }
   		return ip65504P481ReservdS;
	}
	
	/**
	 * 	Update Ip65504P481ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P481-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P481ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P481ReservdS = checkIp65504P481ReservdSMaxLimit(number); 
		serializeIp65504P481ReservdS(ip65504P481ReservdS);
	}

	public void setIp65504P481ReservdS(int number) {
	    number = checkIp65504P481ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P481ReservdS((short)number);
	}
	public void setIp65504P481ReservdS(long number) {
	    number = checkIp65504P481ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P481ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P481ReservdL
	 *	@return ip65504P481ReservdL
	 */
	public short getIp65504P481ReservdL() throws CFException {
        if (isIp65504P481ReservdLModified()) { 
           ip65504P481ReservdL = refreshIp65504P481ReservdL();
        }
   		return ip65504P481ReservdL;
	}
	
	/**
	 * 	Update Ip65504P481ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P481-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P481ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P481ReservdL = checkIp65504P481ReservdLMaxLimit(number); 
		serializeIp65504P481ReservdL(ip65504P481ReservdL);
	}

	public void setIp65504P481ReservdL(int number) {
	    number = checkIp65504P481ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P481ReservdL((short)number);
	}
	public void setIp65504P481ReservdL(long number) {
	    number = checkIp65504P481ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P481ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P482ReservdS
	 *	@return ip65504P482ReservdS
	 */
	public short getIp65504P482ReservdS() throws CFException {
        if (isIp65504P482ReservdSModified()) { 
           ip65504P482ReservdS = refreshIp65504P482ReservdS();
        }
   		return ip65504P482ReservdS;
	}
	
	/**
	 * 	Update Ip65504P482ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P482-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P482ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P482ReservdS = checkIp65504P482ReservdSMaxLimit(number); 
		serializeIp65504P482ReservdS(ip65504P482ReservdS);
	}

	public void setIp65504P482ReservdS(int number) {
	    number = checkIp65504P482ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P482ReservdS((short)number);
	}
	public void setIp65504P482ReservdS(long number) {
	    number = checkIp65504P482ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P482ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P482ReservdL
	 *	@return ip65504P482ReservdL
	 */
	public short getIp65504P482ReservdL() throws CFException {
        if (isIp65504P482ReservdLModified()) { 
           ip65504P482ReservdL = refreshIp65504P482ReservdL();
        }
   		return ip65504P482ReservdL;
	}
	
	/**
	 * 	Update Ip65504P482ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P482-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P482ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P482ReservdL = checkIp65504P482ReservdLMaxLimit(number); 
		serializeIp65504P482ReservdL(ip65504P482ReservdL);
	}

	public void setIp65504P482ReservdL(int number) {
	    number = checkIp65504P482ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P482ReservdL((short)number);
	}
	public void setIp65504P482ReservdL(long number) {
	    number = checkIp65504P482ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P482ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P483ReservdS
	 *	@return ip65504P483ReservdS
	 */
	public short getIp65504P483ReservdS() throws CFException {
        if (isIp65504P483ReservdSModified()) { 
           ip65504P483ReservdS = refreshIp65504P483ReservdS();
        }
   		return ip65504P483ReservdS;
	}
	
	/**
	 * 	Update Ip65504P483ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P483-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P483ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P483ReservdS = checkIp65504P483ReservdSMaxLimit(number); 
		serializeIp65504P483ReservdS(ip65504P483ReservdS);
	}

	public void setIp65504P483ReservdS(int number) {
	    number = checkIp65504P483ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P483ReservdS((short)number);
	}
	public void setIp65504P483ReservdS(long number) {
	    number = checkIp65504P483ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P483ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P483ReservdL
	 *	@return ip65504P483ReservdL
	 */
	public short getIp65504P483ReservdL() throws CFException {
        if (isIp65504P483ReservdLModified()) { 
           ip65504P483ReservdL = refreshIp65504P483ReservdL();
        }
   		return ip65504P483ReservdL;
	}
	
	/**
	 * 	Update Ip65504P483ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P483-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P483ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P483ReservdL = checkIp65504P483ReservdLMaxLimit(number); 
		serializeIp65504P483ReservdL(ip65504P483ReservdL);
	}

	public void setIp65504P483ReservdL(int number) {
	    number = checkIp65504P483ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P483ReservdL((short)number);
	}
	public void setIp65504P483ReservdL(long number) {
	    number = checkIp65504P483ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P483ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P484ReservdS
	 *	@return ip65504P484ReservdS
	 */
	public short getIp65504P484ReservdS() throws CFException {
        if (isIp65504P484ReservdSModified()) { 
           ip65504P484ReservdS = refreshIp65504P484ReservdS();
        }
   		return ip65504P484ReservdS;
	}
	
	/**
	 * 	Update Ip65504P484ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P484-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P484ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P484ReservdS = checkIp65504P484ReservdSMaxLimit(number); 
		serializeIp65504P484ReservdS(ip65504P484ReservdS);
	}

	public void setIp65504P484ReservdS(int number) {
	    number = checkIp65504P484ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P484ReservdS((short)number);
	}
	public void setIp65504P484ReservdS(long number) {
	    number = checkIp65504P484ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P484ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P484ReservdL
	 *	@return ip65504P484ReservdL
	 */
	public short getIp65504P484ReservdL() throws CFException {
        if (isIp65504P484ReservdLModified()) { 
           ip65504P484ReservdL = refreshIp65504P484ReservdL();
        }
   		return ip65504P484ReservdL;
	}
	
	/**
	 * 	Update Ip65504P484ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P484-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P484ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P484ReservdL = checkIp65504P484ReservdLMaxLimit(number); 
		serializeIp65504P484ReservdL(ip65504P484ReservdL);
	}

	public void setIp65504P484ReservdL(int number) {
	    number = checkIp65504P484ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P484ReservdL((short)number);
	}
	public void setIp65504P484ReservdL(long number) {
	    number = checkIp65504P484ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P484ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P485ReservdS
	 *	@return ip65504P485ReservdS
	 */
	public short getIp65504P485ReservdS() throws CFException {
        if (isIp65504P485ReservdSModified()) { 
           ip65504P485ReservdS = refreshIp65504P485ReservdS();
        }
   		return ip65504P485ReservdS;
	}
	
	/**
	 * 	Update Ip65504P485ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P485-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P485ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P485ReservdS = checkIp65504P485ReservdSMaxLimit(number); 
		serializeIp65504P485ReservdS(ip65504P485ReservdS);
	}

	public void setIp65504P485ReservdS(int number) {
	    number = checkIp65504P485ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P485ReservdS((short)number);
	}
	public void setIp65504P485ReservdS(long number) {
	    number = checkIp65504P485ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P485ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P485ReservdL
	 *	@return ip65504P485ReservdL
	 */
	public short getIp65504P485ReservdL() throws CFException {
        if (isIp65504P485ReservdLModified()) { 
           ip65504P485ReservdL = refreshIp65504P485ReservdL();
        }
   		return ip65504P485ReservdL;
	}
	
	/**
	 * 	Update Ip65504P485ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P485-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P485ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P485ReservdL = checkIp65504P485ReservdLMaxLimit(number); 
		serializeIp65504P485ReservdL(ip65504P485ReservdL);
	}

	public void setIp65504P485ReservdL(int number) {
	    number = checkIp65504P485ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P485ReservdL((short)number);
	}
	public void setIp65504P485ReservdL(long number) {
	    number = checkIp65504P485ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P485ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P486ReservdS
	 *	@return ip65504P486ReservdS
	 */
	public short getIp65504P486ReservdS() throws CFException {
        if (isIp65504P486ReservdSModified()) { 
           ip65504P486ReservdS = refreshIp65504P486ReservdS();
        }
   		return ip65504P486ReservdS;
	}
	
	/**
	 * 	Update Ip65504P486ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P486-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P486ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P486ReservdS = checkIp65504P486ReservdSMaxLimit(number); 
		serializeIp65504P486ReservdS(ip65504P486ReservdS);
	}

	public void setIp65504P486ReservdS(int number) {
	    number = checkIp65504P486ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P486ReservdS((short)number);
	}
	public void setIp65504P486ReservdS(long number) {
	    number = checkIp65504P486ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P486ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P486ReservdL
	 *	@return ip65504P486ReservdL
	 */
	public short getIp65504P486ReservdL() throws CFException {
        if (isIp65504P486ReservdLModified()) { 
           ip65504P486ReservdL = refreshIp65504P486ReservdL();
        }
   		return ip65504P486ReservdL;
	}
	
	/**
	 * 	Update Ip65504P486ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P486-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P486ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P486ReservdL = checkIp65504P486ReservdLMaxLimit(number); 
		serializeIp65504P486ReservdL(ip65504P486ReservdL);
	}

	public void setIp65504P486ReservdL(int number) {
	    number = checkIp65504P486ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P486ReservdL((short)number);
	}
	public void setIp65504P486ReservdL(long number) {
	    number = checkIp65504P486ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P486ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P487ReservdS
	 *	@return ip65504P487ReservdS
	 */
	public short getIp65504P487ReservdS() throws CFException {
        if (isIp65504P487ReservdSModified()) { 
           ip65504P487ReservdS = refreshIp65504P487ReservdS();
        }
   		return ip65504P487ReservdS;
	}
	
	/**
	 * 	Update Ip65504P487ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P487-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P487ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P487ReservdS = checkIp65504P487ReservdSMaxLimit(number); 
		serializeIp65504P487ReservdS(ip65504P487ReservdS);
	}

	public void setIp65504P487ReservdS(int number) {
	    number = checkIp65504P487ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P487ReservdS((short)number);
	}
	public void setIp65504P487ReservdS(long number) {
	    number = checkIp65504P487ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P487ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P487ReservdL
	 *	@return ip65504P487ReservdL
	 */
	public short getIp65504P487ReservdL() throws CFException {
        if (isIp65504P487ReservdLModified()) { 
           ip65504P487ReservdL = refreshIp65504P487ReservdL();
        }
   		return ip65504P487ReservdL;
	}
	
	/**
	 * 	Update Ip65504P487ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P487-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P487ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P487ReservdL = checkIp65504P487ReservdLMaxLimit(number); 
		serializeIp65504P487ReservdL(ip65504P487ReservdL);
	}

	public void setIp65504P487ReservdL(int number) {
	    number = checkIp65504P487ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P487ReservdL((short)number);
	}
	public void setIp65504P487ReservdL(long number) {
	    number = checkIp65504P487ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P487ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P488ReservdS
	 *	@return ip65504P488ReservdS
	 */
	public short getIp65504P488ReservdS() throws CFException {
        if (isIp65504P488ReservdSModified()) { 
           ip65504P488ReservdS = refreshIp65504P488ReservdS();
        }
   		return ip65504P488ReservdS;
	}
	
	/**
	 * 	Update Ip65504P488ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P488-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P488ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P488ReservdS = checkIp65504P488ReservdSMaxLimit(number); 
		serializeIp65504P488ReservdS(ip65504P488ReservdS);
	}

	public void setIp65504P488ReservdS(int number) {
	    number = checkIp65504P488ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P488ReservdS((short)number);
	}
	public void setIp65504P488ReservdS(long number) {
	    number = checkIp65504P488ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P488ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P488ReservdL
	 *	@return ip65504P488ReservdL
	 */
	public short getIp65504P488ReservdL() throws CFException {
        if (isIp65504P488ReservdLModified()) { 
           ip65504P488ReservdL = refreshIp65504P488ReservdL();
        }
   		return ip65504P488ReservdL;
	}
	
	/**
	 * 	Update Ip65504P488ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P488-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P488ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P488ReservdL = checkIp65504P488ReservdLMaxLimit(number); 
		serializeIp65504P488ReservdL(ip65504P488ReservdL);
	}

	public void setIp65504P488ReservdL(int number) {
	    number = checkIp65504P488ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P488ReservdL((short)number);
	}
	public void setIp65504P488ReservdL(long number) {
	    number = checkIp65504P488ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P488ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P489ReservdS
	 *	@return ip65504P489ReservdS
	 */
	public short getIp65504P489ReservdS() throws CFException {
        if (isIp65504P489ReservdSModified()) { 
           ip65504P489ReservdS = refreshIp65504P489ReservdS();
        }
   		return ip65504P489ReservdS;
	}
	
	/**
	 * 	Update Ip65504P489ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P489-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P489ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P489ReservdS = checkIp65504P489ReservdSMaxLimit(number); 
		serializeIp65504P489ReservdS(ip65504P489ReservdS);
	}

	public void setIp65504P489ReservdS(int number) {
	    number = checkIp65504P489ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P489ReservdS((short)number);
	}
	public void setIp65504P489ReservdS(long number) {
	    number = checkIp65504P489ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P489ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P489ReservdL
	 *	@return ip65504P489ReservdL
	 */
	public short getIp65504P489ReservdL() throws CFException {
        if (isIp65504P489ReservdLModified()) { 
           ip65504P489ReservdL = refreshIp65504P489ReservdL();
        }
   		return ip65504P489ReservdL;
	}
	
	/**
	 * 	Update Ip65504P489ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P489-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P489ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P489ReservdL = checkIp65504P489ReservdLMaxLimit(number); 
		serializeIp65504P489ReservdL(ip65504P489ReservdL);
	}

	public void setIp65504P489ReservdL(int number) {
	    number = checkIp65504P489ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P489ReservdL((short)number);
	}
	public void setIp65504P489ReservdL(long number) {
	    number = checkIp65504P489ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P489ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P490ReservdS
	 *	@return ip65504P490ReservdS
	 */
	public short getIp65504P490ReservdS() throws CFException {
        if (isIp65504P490ReservdSModified()) { 
           ip65504P490ReservdS = refreshIp65504P490ReservdS();
        }
   		return ip65504P490ReservdS;
	}
	
	/**
	 * 	Update Ip65504P490ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P490-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P490ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P490ReservdS = checkIp65504P490ReservdSMaxLimit(number); 
		serializeIp65504P490ReservdS(ip65504P490ReservdS);
	}

	public void setIp65504P490ReservdS(int number) {
	    number = checkIp65504P490ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P490ReservdS((short)number);
	}
	public void setIp65504P490ReservdS(long number) {
	    number = checkIp65504P490ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P490ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P490ReservdL
	 *	@return ip65504P490ReservdL
	 */
	public short getIp65504P490ReservdL() throws CFException {
        if (isIp65504P490ReservdLModified()) { 
           ip65504P490ReservdL = refreshIp65504P490ReservdL();
        }
   		return ip65504P490ReservdL;
	}
	
	/**
	 * 	Update Ip65504P490ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P490-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P490ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P490ReservdL = checkIp65504P490ReservdLMaxLimit(number); 
		serializeIp65504P490ReservdL(ip65504P490ReservdL);
	}

	public void setIp65504P490ReservdL(int number) {
	    number = checkIp65504P490ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P490ReservdL((short)number);
	}
	public void setIp65504P490ReservdL(long number) {
	    number = checkIp65504P490ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P490ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P491ReservdS
	 *	@return ip65504P491ReservdS
	 */
	public short getIp65504P491ReservdS() throws CFException {
        if (isIp65504P491ReservdSModified()) { 
           ip65504P491ReservdS = refreshIp65504P491ReservdS();
        }
   		return ip65504P491ReservdS;
	}
	
	/**
	 * 	Update Ip65504P491ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P491-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P491ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P491ReservdS = checkIp65504P491ReservdSMaxLimit(number); 
		serializeIp65504P491ReservdS(ip65504P491ReservdS);
	}

	public void setIp65504P491ReservdS(int number) {
	    number = checkIp65504P491ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P491ReservdS((short)number);
	}
	public void setIp65504P491ReservdS(long number) {
	    number = checkIp65504P491ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P491ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P491ReservdL
	 *	@return ip65504P491ReservdL
	 */
	public short getIp65504P491ReservdL() throws CFException {
        if (isIp65504P491ReservdLModified()) { 
           ip65504P491ReservdL = refreshIp65504P491ReservdL();
        }
   		return ip65504P491ReservdL;
	}
	
	/**
	 * 	Update Ip65504P491ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P491-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P491ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P491ReservdL = checkIp65504P491ReservdLMaxLimit(number); 
		serializeIp65504P491ReservdL(ip65504P491ReservdL);
	}

	public void setIp65504P491ReservdL(int number) {
	    number = checkIp65504P491ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P491ReservdL((short)number);
	}
	public void setIp65504P491ReservdL(long number) {
	    number = checkIp65504P491ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P491ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P492ReservdS
	 *	@return ip65504P492ReservdS
	 */
	public short getIp65504P492ReservdS() throws CFException {
        if (isIp65504P492ReservdSModified()) { 
           ip65504P492ReservdS = refreshIp65504P492ReservdS();
        }
   		return ip65504P492ReservdS;
	}
	
	/**
	 * 	Update Ip65504P492ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P492-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P492ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P492ReservdS = checkIp65504P492ReservdSMaxLimit(number); 
		serializeIp65504P492ReservdS(ip65504P492ReservdS);
	}

	public void setIp65504P492ReservdS(int number) {
	    number = checkIp65504P492ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P492ReservdS((short)number);
	}
	public void setIp65504P492ReservdS(long number) {
	    number = checkIp65504P492ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P492ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P492ReservdL
	 *	@return ip65504P492ReservdL
	 */
	public short getIp65504P492ReservdL() throws CFException {
        if (isIp65504P492ReservdLModified()) { 
           ip65504P492ReservdL = refreshIp65504P492ReservdL();
        }
   		return ip65504P492ReservdL;
	}
	
	/**
	 * 	Update Ip65504P492ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P492-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P492ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P492ReservdL = checkIp65504P492ReservdLMaxLimit(number); 
		serializeIp65504P492ReservdL(ip65504P492ReservdL);
	}

	public void setIp65504P492ReservdL(int number) {
	    number = checkIp65504P492ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P492ReservdL((short)number);
	}
	public void setIp65504P492ReservdL(long number) {
	    number = checkIp65504P492ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P492ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P493ReservdS
	 *	@return ip65504P493ReservdS
	 */
	public short getIp65504P493ReservdS() throws CFException {
        if (isIp65504P493ReservdSModified()) { 
           ip65504P493ReservdS = refreshIp65504P493ReservdS();
        }
   		return ip65504P493ReservdS;
	}
	
	/**
	 * 	Update Ip65504P493ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P493-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P493ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P493ReservdS = checkIp65504P493ReservdSMaxLimit(number); 
		serializeIp65504P493ReservdS(ip65504P493ReservdS);
	}

	public void setIp65504P493ReservdS(int number) {
	    number = checkIp65504P493ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P493ReservdS((short)number);
	}
	public void setIp65504P493ReservdS(long number) {
	    number = checkIp65504P493ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P493ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P493ReservdL
	 *	@return ip65504P493ReservdL
	 */
	public short getIp65504P493ReservdL() throws CFException {
        if (isIp65504P493ReservdLModified()) { 
           ip65504P493ReservdL = refreshIp65504P493ReservdL();
        }
   		return ip65504P493ReservdL;
	}
	
	/**
	 * 	Update Ip65504P493ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P493-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P493ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P493ReservdL = checkIp65504P493ReservdLMaxLimit(number); 
		serializeIp65504P493ReservdL(ip65504P493ReservdL);
	}

	public void setIp65504P493ReservdL(int number) {
	    number = checkIp65504P493ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P493ReservdL((short)number);
	}
	public void setIp65504P493ReservdL(long number) {
	    number = checkIp65504P493ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P493ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P494ReservdS
	 *	@return ip65504P494ReservdS
	 */
	public short getIp65504P494ReservdS() throws CFException {
        if (isIp65504P494ReservdSModified()) { 
           ip65504P494ReservdS = refreshIp65504P494ReservdS();
        }
   		return ip65504P494ReservdS;
	}
	
	/**
	 * 	Update Ip65504P494ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P494-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P494ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P494ReservdS = checkIp65504P494ReservdSMaxLimit(number); 
		serializeIp65504P494ReservdS(ip65504P494ReservdS);
	}

	public void setIp65504P494ReservdS(int number) {
	    number = checkIp65504P494ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P494ReservdS((short)number);
	}
	public void setIp65504P494ReservdS(long number) {
	    number = checkIp65504P494ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P494ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P494ReservdL
	 *	@return ip65504P494ReservdL
	 */
	public short getIp65504P494ReservdL() throws CFException {
        if (isIp65504P494ReservdLModified()) { 
           ip65504P494ReservdL = refreshIp65504P494ReservdL();
        }
   		return ip65504P494ReservdL;
	}
	
	/**
	 * 	Update Ip65504P494ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P494-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P494ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P494ReservdL = checkIp65504P494ReservdLMaxLimit(number); 
		serializeIp65504P494ReservdL(ip65504P494ReservdL);
	}

	public void setIp65504P494ReservdL(int number) {
	    number = checkIp65504P494ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P494ReservdL((short)number);
	}
	public void setIp65504P494ReservdL(long number) {
	    number = checkIp65504P494ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P494ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P495ReservdS
	 *	@return ip65504P495ReservdS
	 */
	public short getIp65504P495ReservdS() throws CFException {
        if (isIp65504P495ReservdSModified()) { 
           ip65504P495ReservdS = refreshIp65504P495ReservdS();
        }
   		return ip65504P495ReservdS;
	}
	
	/**
	 * 	Update Ip65504P495ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P495-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P495ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P495ReservdS = checkIp65504P495ReservdSMaxLimit(number); 
		serializeIp65504P495ReservdS(ip65504P495ReservdS);
	}

	public void setIp65504P495ReservdS(int number) {
	    number = checkIp65504P495ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P495ReservdS((short)number);
	}
	public void setIp65504P495ReservdS(long number) {
	    number = checkIp65504P495ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P495ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P495ReservdL
	 *	@return ip65504P495ReservdL
	 */
	public short getIp65504P495ReservdL() throws CFException {
        if (isIp65504P495ReservdLModified()) { 
           ip65504P495ReservdL = refreshIp65504P495ReservdL();
        }
   		return ip65504P495ReservdL;
	}
	
	/**
	 * 	Update Ip65504P495ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P495-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P495ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P495ReservdL = checkIp65504P495ReservdLMaxLimit(number); 
		serializeIp65504P495ReservdL(ip65504P495ReservdL);
	}

	public void setIp65504P495ReservdL(int number) {
	    number = checkIp65504P495ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P495ReservdL((short)number);
	}
	public void setIp65504P495ReservdL(long number) {
	    number = checkIp65504P495ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P495ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P496ReservdS
	 *	@return ip65504P496ReservdS
	 */
	public short getIp65504P496ReservdS() throws CFException {
        if (isIp65504P496ReservdSModified()) { 
           ip65504P496ReservdS = refreshIp65504P496ReservdS();
        }
   		return ip65504P496ReservdS;
	}
	
	/**
	 * 	Update Ip65504P496ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P496-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P496ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P496ReservdS = checkIp65504P496ReservdSMaxLimit(number); 
		serializeIp65504P496ReservdS(ip65504P496ReservdS);
	}

	public void setIp65504P496ReservdS(int number) {
	    number = checkIp65504P496ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P496ReservdS((short)number);
	}
	public void setIp65504P496ReservdS(long number) {
	    number = checkIp65504P496ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P496ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P496ReservdL
	 *	@return ip65504P496ReservdL
	 */
	public short getIp65504P496ReservdL() throws CFException {
        if (isIp65504P496ReservdLModified()) { 
           ip65504P496ReservdL = refreshIp65504P496ReservdL();
        }
   		return ip65504P496ReservdL;
	}
	
	/**
	 * 	Update Ip65504P496ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P496-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P496ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P496ReservdL = checkIp65504P496ReservdLMaxLimit(number); 
		serializeIp65504P496ReservdL(ip65504P496ReservdL);
	}

	public void setIp65504P496ReservdL(int number) {
	    number = checkIp65504P496ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P496ReservdL((short)number);
	}
	public void setIp65504P496ReservdL(long number) {
	    number = checkIp65504P496ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P496ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup16
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P466ReservdS((short)0);
         	setIp65504P466ReservdL((short)0);
         	setIp65504P467ReservdS((short)0);
         	setIp65504P467ReservdL((short)0);
         	setIp65504P468ReservdS((short)0);
         	setIp65504P468ReservdL((short)0);
         	setIp65504P469ReservdS((short)0);
         	setIp65504P469ReservdL((short)0);
         	setIp65504P470ReservdS((short)0);
         	setIp65504P470ReservdL((short)0);
         	setIp65504P471ReservdS((short)0);
         	setIp65504P471ReservdL((short)0);
         	setIp65504P472ReservdS((short)0);
         	setIp65504P472ReservdL((short)0);
         	setIp65504P473ReservdS((short)0);
         	setIp65504P473ReservdL((short)0);
         	setIp65504P474ReservdS((short)0);
         	setIp65504P474ReservdL((short)0);
         	setIp65504P475ReservdS((short)0);
         	setIp65504P475ReservdL((short)0);
         	setIp65504P476ReservdS((short)0);
         	setIp65504P476ReservdL((short)0);
         	setIp65504P477ReservdS((short)0);
         	setIp65504P477ReservdL((short)0);
         	setIp65504P478ReservdS((short)0);
         	setIp65504P478ReservdL((short)0);
         	setIp65504P479ReservdS((short)0);
         	setIp65504P479ReservdL((short)0);
         	setIp65504P480ReservdS((short)0);
         	setIp65504P480ReservdL((short)0);
         	setIp65504P481ReservdS((short)0);
         	setIp65504P481ReservdL((short)0);
         	setIp65504P482ReservdS((short)0);
         	setIp65504P482ReservdL((short)0);
         	setIp65504P483ReservdS((short)0);
         	setIp65504P483ReservdL((short)0);
         	setIp65504P484ReservdS((short)0);
         	setIp65504P484ReservdL((short)0);
         	setIp65504P485ReservdS((short)0);
         	setIp65504P485ReservdL((short)0);
         	setIp65504P486ReservdS((short)0);
         	setIp65504P486ReservdL((short)0);
         	setIp65504P487ReservdS((short)0);
         	setIp65504P487ReservdL((short)0);
         	setIp65504P488ReservdS((short)0);
         	setIp65504P488ReservdL((short)0);
         	setIp65504P489ReservdS((short)0);
         	setIp65504P489ReservdL((short)0);
         	setIp65504P490ReservdS((short)0);
         	setIp65504P490ReservdL((short)0);
         	setIp65504P491ReservdS((short)0);
         	setIp65504P491ReservdL((short)0);
         	setIp65504P492ReservdS((short)0);
         	setIp65504P492ReservdL((short)0);
         	setIp65504P493ReservdS((short)0);
         	setIp65504P493ReservdL((short)0);
         	setIp65504P494ReservdS((short)0);
         	setIp65504P494ReservdL((short)0);
         	setIp65504P495ReservdS((short)0);
         	setIp65504P495ReservdL((short)0);
         	setIp65504P496ReservdS((short)0);
         	setIp65504P496ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup16FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_16_LENGTH;
		}

}
  
