package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup10 extends Ip65504PdsNamesLargeGroup10Serialized { 
   

								private short ip65504P280SrcFilS;

								private short ip65504P280SrcFilL;


								private short ip65504P281ReservdS;

								private short ip65504P281ReservdL;


								private short ip65504P282ReservdS;

								private short ip65504P282ReservdL;


								private short ip65504P283ReservdS;

								private short ip65504P283ReservdL;


								private short ip65504P284ReservdS;

								private short ip65504P284ReservdL;


								private short ip65504P285ReservdS;

								private short ip65504P285ReservdL;


								private short ip65504P286ReservdS;

								private short ip65504P286ReservdL;


								private short ip65504P287ReservdS;

								private short ip65504P287ReservdL;


								private short ip65504P288ReservdS;

								private short ip65504P288ReservdL;


								private short ip65504P289ReservdS;

								private short ip65504P289ReservdL;


								private short ip65504P290ReservdS;

								private short ip65504P290ReservdL;


								private short ip65504P291ReservdS;

								private short ip65504P291ReservdL;


								private short ip65504P292ReservdS;

								private short ip65504P292ReservdL;


								private short ip65504P293ReservdS;

								private short ip65504P293ReservdL;


								private short ip65504P294ReservdS;

								private short ip65504P294ReservdL;


								private short ip65504P295ReservdS;

								private short ip65504P295ReservdL;


								private short ip65504P296ReservdS;

								private short ip65504P296ReservdL;


								private short ip65504P297ReservdS;

								private short ip65504P297ReservdL;


								private short ip65504P298RecTrxS;

								private short ip65504P298RecTrxL;


								private short ip65504P299ReservdS;

								private short ip65504P299ReservdL;


								private short ip65504P300RecFilS;

								private short ip65504P300RecFilL;


								private short ip65504P301FilAmtS;

								private short ip65504P301FilAmtL;


								private short ip65504P302MbractyS;

								private short ip65504P302MbractyL;


								private short ip65504P303TrxTypS;

								private short ip65504P303TrxTypL;


								private short ip65504P304ReservdS;

								private short ip65504P304ReservdL;


								private short ip65504P305NetCntS;

								private short ip65504P305NetCntL;


								private short ip65504P306FilCntS;

								private short ip65504P306FilCntL;


								private short ip65504P307ReservdS;

								private short ip65504P307ReservdL;


								private short ip65504P308ReservdS;

								private short ip65504P308ReservdL;


								private short ip65504P309ReservdS;

								private short ip65504P309ReservdL;


								private short ip65504P310DbRamtS;

								private short ip65504P310DbRamtL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup10
	**/
    public Ip65504PdsNamesLargeGroup10() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P280SrcFilS
	 *	@return ip65504P280SrcFilS
	 */
	public short getIp65504P280SrcFilS() throws CFException {
        if (isIp65504P280SrcFilSModified()) { 
           ip65504P280SrcFilS = refreshIp65504P280SrcFilS();
        }
   		return ip65504P280SrcFilS;
	}
	
	/**
	 * 	Update Ip65504P280SrcFilS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P280-SRC-FIL-S
	 *	@param number
	 */
	public void setIp65504P280SrcFilS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P280SrcFilS = checkIp65504P280SrcFilSMaxLimit(number); 
		serializeIp65504P280SrcFilS(ip65504P280SrcFilS);
	}

	public void setIp65504P280SrcFilS(int number) {
	    number = checkIp65504P280SrcFilSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P280SrcFilS((short)number);
	}
	public void setIp65504P280SrcFilS(long number) {
	    number = checkIp65504P280SrcFilSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P280SrcFilS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P280SrcFilL
	 *	@return ip65504P280SrcFilL
	 */
	public short getIp65504P280SrcFilL() throws CFException {
        if (isIp65504P280SrcFilLModified()) { 
           ip65504P280SrcFilL = refreshIp65504P280SrcFilL();
        }
   		return ip65504P280SrcFilL;
	}
	
	/**
	 * 	Update Ip65504P280SrcFilL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P280-SRC-FIL-L
	 *	@param number
	 */
	public void setIp65504P280SrcFilL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P280SrcFilL = checkIp65504P280SrcFilLMaxLimit(number); 
		serializeIp65504P280SrcFilL(ip65504P280SrcFilL);
	}

	public void setIp65504P280SrcFilL(int number) {
	    number = checkIp65504P280SrcFilLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P280SrcFilL((short)number);
	}
	public void setIp65504P280SrcFilL(long number) {
	    number = checkIp65504P280SrcFilLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P280SrcFilL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P281ReservdS
	 *	@return ip65504P281ReservdS
	 */
	public short getIp65504P281ReservdS() throws CFException {
        if (isIp65504P281ReservdSModified()) { 
           ip65504P281ReservdS = refreshIp65504P281ReservdS();
        }
   		return ip65504P281ReservdS;
	}
	
	/**
	 * 	Update Ip65504P281ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P281-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P281ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P281ReservdS = checkIp65504P281ReservdSMaxLimit(number); 
		serializeIp65504P281ReservdS(ip65504P281ReservdS);
	}

	public void setIp65504P281ReservdS(int number) {
	    number = checkIp65504P281ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P281ReservdS((short)number);
	}
	public void setIp65504P281ReservdS(long number) {
	    number = checkIp65504P281ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P281ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P281ReservdL
	 *	@return ip65504P281ReservdL
	 */
	public short getIp65504P281ReservdL() throws CFException {
        if (isIp65504P281ReservdLModified()) { 
           ip65504P281ReservdL = refreshIp65504P281ReservdL();
        }
   		return ip65504P281ReservdL;
	}
	
	/**
	 * 	Update Ip65504P281ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P281-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P281ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P281ReservdL = checkIp65504P281ReservdLMaxLimit(number); 
		serializeIp65504P281ReservdL(ip65504P281ReservdL);
	}

	public void setIp65504P281ReservdL(int number) {
	    number = checkIp65504P281ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P281ReservdL((short)number);
	}
	public void setIp65504P281ReservdL(long number) {
	    number = checkIp65504P281ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P281ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P282ReservdS
	 *	@return ip65504P282ReservdS
	 */
	public short getIp65504P282ReservdS() throws CFException {
        if (isIp65504P282ReservdSModified()) { 
           ip65504P282ReservdS = refreshIp65504P282ReservdS();
        }
   		return ip65504P282ReservdS;
	}
	
	/**
	 * 	Update Ip65504P282ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P282-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P282ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P282ReservdS = checkIp65504P282ReservdSMaxLimit(number); 
		serializeIp65504P282ReservdS(ip65504P282ReservdS);
	}

	public void setIp65504P282ReservdS(int number) {
	    number = checkIp65504P282ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P282ReservdS((short)number);
	}
	public void setIp65504P282ReservdS(long number) {
	    number = checkIp65504P282ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P282ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P282ReservdL
	 *	@return ip65504P282ReservdL
	 */
	public short getIp65504P282ReservdL() throws CFException {
        if (isIp65504P282ReservdLModified()) { 
           ip65504P282ReservdL = refreshIp65504P282ReservdL();
        }
   		return ip65504P282ReservdL;
	}
	
	/**
	 * 	Update Ip65504P282ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P282-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P282ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P282ReservdL = checkIp65504P282ReservdLMaxLimit(number); 
		serializeIp65504P282ReservdL(ip65504P282ReservdL);
	}

	public void setIp65504P282ReservdL(int number) {
	    number = checkIp65504P282ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P282ReservdL((short)number);
	}
	public void setIp65504P282ReservdL(long number) {
	    number = checkIp65504P282ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P282ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P283ReservdS
	 *	@return ip65504P283ReservdS
	 */
	public short getIp65504P283ReservdS() throws CFException {
        if (isIp65504P283ReservdSModified()) { 
           ip65504P283ReservdS = refreshIp65504P283ReservdS();
        }
   		return ip65504P283ReservdS;
	}
	
	/**
	 * 	Update Ip65504P283ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P283-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P283ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P283ReservdS = checkIp65504P283ReservdSMaxLimit(number); 
		serializeIp65504P283ReservdS(ip65504P283ReservdS);
	}

	public void setIp65504P283ReservdS(int number) {
	    number = checkIp65504P283ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P283ReservdS((short)number);
	}
	public void setIp65504P283ReservdS(long number) {
	    number = checkIp65504P283ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P283ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P283ReservdL
	 *	@return ip65504P283ReservdL
	 */
	public short getIp65504P283ReservdL() throws CFException {
        if (isIp65504P283ReservdLModified()) { 
           ip65504P283ReservdL = refreshIp65504P283ReservdL();
        }
   		return ip65504P283ReservdL;
	}
	
	/**
	 * 	Update Ip65504P283ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P283-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P283ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P283ReservdL = checkIp65504P283ReservdLMaxLimit(number); 
		serializeIp65504P283ReservdL(ip65504P283ReservdL);
	}

	public void setIp65504P283ReservdL(int number) {
	    number = checkIp65504P283ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P283ReservdL((short)number);
	}
	public void setIp65504P283ReservdL(long number) {
	    number = checkIp65504P283ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P283ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P284ReservdS
	 *	@return ip65504P284ReservdS
	 */
	public short getIp65504P284ReservdS() throws CFException {
        if (isIp65504P284ReservdSModified()) { 
           ip65504P284ReservdS = refreshIp65504P284ReservdS();
        }
   		return ip65504P284ReservdS;
	}
	
	/**
	 * 	Update Ip65504P284ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P284-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P284ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P284ReservdS = checkIp65504P284ReservdSMaxLimit(number); 
		serializeIp65504P284ReservdS(ip65504P284ReservdS);
	}

	public void setIp65504P284ReservdS(int number) {
	    number = checkIp65504P284ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P284ReservdS((short)number);
	}
	public void setIp65504P284ReservdS(long number) {
	    number = checkIp65504P284ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P284ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P284ReservdL
	 *	@return ip65504P284ReservdL
	 */
	public short getIp65504P284ReservdL() throws CFException {
        if (isIp65504P284ReservdLModified()) { 
           ip65504P284ReservdL = refreshIp65504P284ReservdL();
        }
   		return ip65504P284ReservdL;
	}
	
	/**
	 * 	Update Ip65504P284ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P284-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P284ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P284ReservdL = checkIp65504P284ReservdLMaxLimit(number); 
		serializeIp65504P284ReservdL(ip65504P284ReservdL);
	}

	public void setIp65504P284ReservdL(int number) {
	    number = checkIp65504P284ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P284ReservdL((short)number);
	}
	public void setIp65504P284ReservdL(long number) {
	    number = checkIp65504P284ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P284ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P285ReservdS
	 *	@return ip65504P285ReservdS
	 */
	public short getIp65504P285ReservdS() throws CFException {
        if (isIp65504P285ReservdSModified()) { 
           ip65504P285ReservdS = refreshIp65504P285ReservdS();
        }
   		return ip65504P285ReservdS;
	}
	
	/**
	 * 	Update Ip65504P285ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P285-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P285ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P285ReservdS = checkIp65504P285ReservdSMaxLimit(number); 
		serializeIp65504P285ReservdS(ip65504P285ReservdS);
	}

	public void setIp65504P285ReservdS(int number) {
	    number = checkIp65504P285ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P285ReservdS((short)number);
	}
	public void setIp65504P285ReservdS(long number) {
	    number = checkIp65504P285ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P285ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P285ReservdL
	 *	@return ip65504P285ReservdL
	 */
	public short getIp65504P285ReservdL() throws CFException {
        if (isIp65504P285ReservdLModified()) { 
           ip65504P285ReservdL = refreshIp65504P285ReservdL();
        }
   		return ip65504P285ReservdL;
	}
	
	/**
	 * 	Update Ip65504P285ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P285-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P285ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P285ReservdL = checkIp65504P285ReservdLMaxLimit(number); 
		serializeIp65504P285ReservdL(ip65504P285ReservdL);
	}

	public void setIp65504P285ReservdL(int number) {
	    number = checkIp65504P285ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P285ReservdL((short)number);
	}
	public void setIp65504P285ReservdL(long number) {
	    number = checkIp65504P285ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P285ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P286ReservdS
	 *	@return ip65504P286ReservdS
	 */
	public short getIp65504P286ReservdS() throws CFException {
        if (isIp65504P286ReservdSModified()) { 
           ip65504P286ReservdS = refreshIp65504P286ReservdS();
        }
   		return ip65504P286ReservdS;
	}
	
	/**
	 * 	Update Ip65504P286ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P286-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P286ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P286ReservdS = checkIp65504P286ReservdSMaxLimit(number); 
		serializeIp65504P286ReservdS(ip65504P286ReservdS);
	}

	public void setIp65504P286ReservdS(int number) {
	    number = checkIp65504P286ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P286ReservdS((short)number);
	}
	public void setIp65504P286ReservdS(long number) {
	    number = checkIp65504P286ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P286ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P286ReservdL
	 *	@return ip65504P286ReservdL
	 */
	public short getIp65504P286ReservdL() throws CFException {
        if (isIp65504P286ReservdLModified()) { 
           ip65504P286ReservdL = refreshIp65504P286ReservdL();
        }
   		return ip65504P286ReservdL;
	}
	
	/**
	 * 	Update Ip65504P286ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P286-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P286ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P286ReservdL = checkIp65504P286ReservdLMaxLimit(number); 
		serializeIp65504P286ReservdL(ip65504P286ReservdL);
	}

	public void setIp65504P286ReservdL(int number) {
	    number = checkIp65504P286ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P286ReservdL((short)number);
	}
	public void setIp65504P286ReservdL(long number) {
	    number = checkIp65504P286ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P286ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P287ReservdS
	 *	@return ip65504P287ReservdS
	 */
	public short getIp65504P287ReservdS() throws CFException {
        if (isIp65504P287ReservdSModified()) { 
           ip65504P287ReservdS = refreshIp65504P287ReservdS();
        }
   		return ip65504P287ReservdS;
	}
	
	/**
	 * 	Update Ip65504P287ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P287-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P287ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P287ReservdS = checkIp65504P287ReservdSMaxLimit(number); 
		serializeIp65504P287ReservdS(ip65504P287ReservdS);
	}

	public void setIp65504P287ReservdS(int number) {
	    number = checkIp65504P287ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P287ReservdS((short)number);
	}
	public void setIp65504P287ReservdS(long number) {
	    number = checkIp65504P287ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P287ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P287ReservdL
	 *	@return ip65504P287ReservdL
	 */
	public short getIp65504P287ReservdL() throws CFException {
        if (isIp65504P287ReservdLModified()) { 
           ip65504P287ReservdL = refreshIp65504P287ReservdL();
        }
   		return ip65504P287ReservdL;
	}
	
	/**
	 * 	Update Ip65504P287ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P287-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P287ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P287ReservdL = checkIp65504P287ReservdLMaxLimit(number); 
		serializeIp65504P287ReservdL(ip65504P287ReservdL);
	}

	public void setIp65504P287ReservdL(int number) {
	    number = checkIp65504P287ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P287ReservdL((short)number);
	}
	public void setIp65504P287ReservdL(long number) {
	    number = checkIp65504P287ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P287ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P288ReservdS
	 *	@return ip65504P288ReservdS
	 */
	public short getIp65504P288ReservdS() throws CFException {
        if (isIp65504P288ReservdSModified()) { 
           ip65504P288ReservdS = refreshIp65504P288ReservdS();
        }
   		return ip65504P288ReservdS;
	}
	
	/**
	 * 	Update Ip65504P288ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P288-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P288ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P288ReservdS = checkIp65504P288ReservdSMaxLimit(number); 
		serializeIp65504P288ReservdS(ip65504P288ReservdS);
	}

	public void setIp65504P288ReservdS(int number) {
	    number = checkIp65504P288ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P288ReservdS((short)number);
	}
	public void setIp65504P288ReservdS(long number) {
	    number = checkIp65504P288ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P288ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P288ReservdL
	 *	@return ip65504P288ReservdL
	 */
	public short getIp65504P288ReservdL() throws CFException {
        if (isIp65504P288ReservdLModified()) { 
           ip65504P288ReservdL = refreshIp65504P288ReservdL();
        }
   		return ip65504P288ReservdL;
	}
	
	/**
	 * 	Update Ip65504P288ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P288-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P288ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P288ReservdL = checkIp65504P288ReservdLMaxLimit(number); 
		serializeIp65504P288ReservdL(ip65504P288ReservdL);
	}

	public void setIp65504P288ReservdL(int number) {
	    number = checkIp65504P288ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P288ReservdL((short)number);
	}
	public void setIp65504P288ReservdL(long number) {
	    number = checkIp65504P288ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P288ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P289ReservdS
	 *	@return ip65504P289ReservdS
	 */
	public short getIp65504P289ReservdS() throws CFException {
        if (isIp65504P289ReservdSModified()) { 
           ip65504P289ReservdS = refreshIp65504P289ReservdS();
        }
   		return ip65504P289ReservdS;
	}
	
	/**
	 * 	Update Ip65504P289ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P289-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P289ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P289ReservdS = checkIp65504P289ReservdSMaxLimit(number); 
		serializeIp65504P289ReservdS(ip65504P289ReservdS);
	}

	public void setIp65504P289ReservdS(int number) {
	    number = checkIp65504P289ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P289ReservdS((short)number);
	}
	public void setIp65504P289ReservdS(long number) {
	    number = checkIp65504P289ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P289ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P289ReservdL
	 *	@return ip65504P289ReservdL
	 */
	public short getIp65504P289ReservdL() throws CFException {
        if (isIp65504P289ReservdLModified()) { 
           ip65504P289ReservdL = refreshIp65504P289ReservdL();
        }
   		return ip65504P289ReservdL;
	}
	
	/**
	 * 	Update Ip65504P289ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P289-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P289ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P289ReservdL = checkIp65504P289ReservdLMaxLimit(number); 
		serializeIp65504P289ReservdL(ip65504P289ReservdL);
	}

	public void setIp65504P289ReservdL(int number) {
	    number = checkIp65504P289ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P289ReservdL((short)number);
	}
	public void setIp65504P289ReservdL(long number) {
	    number = checkIp65504P289ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P289ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P290ReservdS
	 *	@return ip65504P290ReservdS
	 */
	public short getIp65504P290ReservdS() throws CFException {
        if (isIp65504P290ReservdSModified()) { 
           ip65504P290ReservdS = refreshIp65504P290ReservdS();
        }
   		return ip65504P290ReservdS;
	}
	
	/**
	 * 	Update Ip65504P290ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P290-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P290ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P290ReservdS = checkIp65504P290ReservdSMaxLimit(number); 
		serializeIp65504P290ReservdS(ip65504P290ReservdS);
	}

	public void setIp65504P290ReservdS(int number) {
	    number = checkIp65504P290ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P290ReservdS((short)number);
	}
	public void setIp65504P290ReservdS(long number) {
	    number = checkIp65504P290ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P290ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P290ReservdL
	 *	@return ip65504P290ReservdL
	 */
	public short getIp65504P290ReservdL() throws CFException {
        if (isIp65504P290ReservdLModified()) { 
           ip65504P290ReservdL = refreshIp65504P290ReservdL();
        }
   		return ip65504P290ReservdL;
	}
	
	/**
	 * 	Update Ip65504P290ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P290-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P290ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P290ReservdL = checkIp65504P290ReservdLMaxLimit(number); 
		serializeIp65504P290ReservdL(ip65504P290ReservdL);
	}

	public void setIp65504P290ReservdL(int number) {
	    number = checkIp65504P290ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P290ReservdL((short)number);
	}
	public void setIp65504P290ReservdL(long number) {
	    number = checkIp65504P290ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P290ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P291ReservdS
	 *	@return ip65504P291ReservdS
	 */
	public short getIp65504P291ReservdS() throws CFException {
        if (isIp65504P291ReservdSModified()) { 
           ip65504P291ReservdS = refreshIp65504P291ReservdS();
        }
   		return ip65504P291ReservdS;
	}
	
	/**
	 * 	Update Ip65504P291ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P291-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P291ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P291ReservdS = checkIp65504P291ReservdSMaxLimit(number); 
		serializeIp65504P291ReservdS(ip65504P291ReservdS);
	}

	public void setIp65504P291ReservdS(int number) {
	    number = checkIp65504P291ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P291ReservdS((short)number);
	}
	public void setIp65504P291ReservdS(long number) {
	    number = checkIp65504P291ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P291ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P291ReservdL
	 *	@return ip65504P291ReservdL
	 */
	public short getIp65504P291ReservdL() throws CFException {
        if (isIp65504P291ReservdLModified()) { 
           ip65504P291ReservdL = refreshIp65504P291ReservdL();
        }
   		return ip65504P291ReservdL;
	}
	
	/**
	 * 	Update Ip65504P291ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P291-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P291ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P291ReservdL = checkIp65504P291ReservdLMaxLimit(number); 
		serializeIp65504P291ReservdL(ip65504P291ReservdL);
	}

	public void setIp65504P291ReservdL(int number) {
	    number = checkIp65504P291ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P291ReservdL((short)number);
	}
	public void setIp65504P291ReservdL(long number) {
	    number = checkIp65504P291ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P291ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P292ReservdS
	 *	@return ip65504P292ReservdS
	 */
	public short getIp65504P292ReservdS() throws CFException {
        if (isIp65504P292ReservdSModified()) { 
           ip65504P292ReservdS = refreshIp65504P292ReservdS();
        }
   		return ip65504P292ReservdS;
	}
	
	/**
	 * 	Update Ip65504P292ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P292-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P292ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P292ReservdS = checkIp65504P292ReservdSMaxLimit(number); 
		serializeIp65504P292ReservdS(ip65504P292ReservdS);
	}

	public void setIp65504P292ReservdS(int number) {
	    number = checkIp65504P292ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P292ReservdS((short)number);
	}
	public void setIp65504P292ReservdS(long number) {
	    number = checkIp65504P292ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P292ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P292ReservdL
	 *	@return ip65504P292ReservdL
	 */
	public short getIp65504P292ReservdL() throws CFException {
        if (isIp65504P292ReservdLModified()) { 
           ip65504P292ReservdL = refreshIp65504P292ReservdL();
        }
   		return ip65504P292ReservdL;
	}
	
	/**
	 * 	Update Ip65504P292ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P292-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P292ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P292ReservdL = checkIp65504P292ReservdLMaxLimit(number); 
		serializeIp65504P292ReservdL(ip65504P292ReservdL);
	}

	public void setIp65504P292ReservdL(int number) {
	    number = checkIp65504P292ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P292ReservdL((short)number);
	}
	public void setIp65504P292ReservdL(long number) {
	    number = checkIp65504P292ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P292ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P293ReservdS
	 *	@return ip65504P293ReservdS
	 */
	public short getIp65504P293ReservdS() throws CFException {
        if (isIp65504P293ReservdSModified()) { 
           ip65504P293ReservdS = refreshIp65504P293ReservdS();
        }
   		return ip65504P293ReservdS;
	}
	
	/**
	 * 	Update Ip65504P293ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P293-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P293ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P293ReservdS = checkIp65504P293ReservdSMaxLimit(number); 
		serializeIp65504P293ReservdS(ip65504P293ReservdS);
	}

	public void setIp65504P293ReservdS(int number) {
	    number = checkIp65504P293ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P293ReservdS((short)number);
	}
	public void setIp65504P293ReservdS(long number) {
	    number = checkIp65504P293ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P293ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P293ReservdL
	 *	@return ip65504P293ReservdL
	 */
	public short getIp65504P293ReservdL() throws CFException {
        if (isIp65504P293ReservdLModified()) { 
           ip65504P293ReservdL = refreshIp65504P293ReservdL();
        }
   		return ip65504P293ReservdL;
	}
	
	/**
	 * 	Update Ip65504P293ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P293-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P293ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P293ReservdL = checkIp65504P293ReservdLMaxLimit(number); 
		serializeIp65504P293ReservdL(ip65504P293ReservdL);
	}

	public void setIp65504P293ReservdL(int number) {
	    number = checkIp65504P293ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P293ReservdL((short)number);
	}
	public void setIp65504P293ReservdL(long number) {
	    number = checkIp65504P293ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P293ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P294ReservdS
	 *	@return ip65504P294ReservdS
	 */
	public short getIp65504P294ReservdS() throws CFException {
        if (isIp65504P294ReservdSModified()) { 
           ip65504P294ReservdS = refreshIp65504P294ReservdS();
        }
   		return ip65504P294ReservdS;
	}
	
	/**
	 * 	Update Ip65504P294ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P294-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P294ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P294ReservdS = checkIp65504P294ReservdSMaxLimit(number); 
		serializeIp65504P294ReservdS(ip65504P294ReservdS);
	}

	public void setIp65504P294ReservdS(int number) {
	    number = checkIp65504P294ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P294ReservdS((short)number);
	}
	public void setIp65504P294ReservdS(long number) {
	    number = checkIp65504P294ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P294ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P294ReservdL
	 *	@return ip65504P294ReservdL
	 */
	public short getIp65504P294ReservdL() throws CFException {
        if (isIp65504P294ReservdLModified()) { 
           ip65504P294ReservdL = refreshIp65504P294ReservdL();
        }
   		return ip65504P294ReservdL;
	}
	
	/**
	 * 	Update Ip65504P294ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P294-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P294ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P294ReservdL = checkIp65504P294ReservdLMaxLimit(number); 
		serializeIp65504P294ReservdL(ip65504P294ReservdL);
	}

	public void setIp65504P294ReservdL(int number) {
	    number = checkIp65504P294ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P294ReservdL((short)number);
	}
	public void setIp65504P294ReservdL(long number) {
	    number = checkIp65504P294ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P294ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P295ReservdS
	 *	@return ip65504P295ReservdS
	 */
	public short getIp65504P295ReservdS() throws CFException {
        if (isIp65504P295ReservdSModified()) { 
           ip65504P295ReservdS = refreshIp65504P295ReservdS();
        }
   		return ip65504P295ReservdS;
	}
	
	/**
	 * 	Update Ip65504P295ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P295-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P295ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P295ReservdS = checkIp65504P295ReservdSMaxLimit(number); 
		serializeIp65504P295ReservdS(ip65504P295ReservdS);
	}

	public void setIp65504P295ReservdS(int number) {
	    number = checkIp65504P295ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P295ReservdS((short)number);
	}
	public void setIp65504P295ReservdS(long number) {
	    number = checkIp65504P295ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P295ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P295ReservdL
	 *	@return ip65504P295ReservdL
	 */
	public short getIp65504P295ReservdL() throws CFException {
        if (isIp65504P295ReservdLModified()) { 
           ip65504P295ReservdL = refreshIp65504P295ReservdL();
        }
   		return ip65504P295ReservdL;
	}
	
	/**
	 * 	Update Ip65504P295ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P295-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P295ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P295ReservdL = checkIp65504P295ReservdLMaxLimit(number); 
		serializeIp65504P295ReservdL(ip65504P295ReservdL);
	}

	public void setIp65504P295ReservdL(int number) {
	    number = checkIp65504P295ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P295ReservdL((short)number);
	}
	public void setIp65504P295ReservdL(long number) {
	    number = checkIp65504P295ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P295ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P296ReservdS
	 *	@return ip65504P296ReservdS
	 */
	public short getIp65504P296ReservdS() throws CFException {
        if (isIp65504P296ReservdSModified()) { 
           ip65504P296ReservdS = refreshIp65504P296ReservdS();
        }
   		return ip65504P296ReservdS;
	}
	
	/**
	 * 	Update Ip65504P296ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P296-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P296ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P296ReservdS = checkIp65504P296ReservdSMaxLimit(number); 
		serializeIp65504P296ReservdS(ip65504P296ReservdS);
	}

	public void setIp65504P296ReservdS(int number) {
	    number = checkIp65504P296ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P296ReservdS((short)number);
	}
	public void setIp65504P296ReservdS(long number) {
	    number = checkIp65504P296ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P296ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P296ReservdL
	 *	@return ip65504P296ReservdL
	 */
	public short getIp65504P296ReservdL() throws CFException {
        if (isIp65504P296ReservdLModified()) { 
           ip65504P296ReservdL = refreshIp65504P296ReservdL();
        }
   		return ip65504P296ReservdL;
	}
	
	/**
	 * 	Update Ip65504P296ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P296-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P296ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P296ReservdL = checkIp65504P296ReservdLMaxLimit(number); 
		serializeIp65504P296ReservdL(ip65504P296ReservdL);
	}

	public void setIp65504P296ReservdL(int number) {
	    number = checkIp65504P296ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P296ReservdL((short)number);
	}
	public void setIp65504P296ReservdL(long number) {
	    number = checkIp65504P296ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P296ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P297ReservdS
	 *	@return ip65504P297ReservdS
	 */
	public short getIp65504P297ReservdS() throws CFException {
        if (isIp65504P297ReservdSModified()) { 
           ip65504P297ReservdS = refreshIp65504P297ReservdS();
        }
   		return ip65504P297ReservdS;
	}
	
	/**
	 * 	Update Ip65504P297ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P297-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P297ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P297ReservdS = checkIp65504P297ReservdSMaxLimit(number); 
		serializeIp65504P297ReservdS(ip65504P297ReservdS);
	}

	public void setIp65504P297ReservdS(int number) {
	    number = checkIp65504P297ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P297ReservdS((short)number);
	}
	public void setIp65504P297ReservdS(long number) {
	    number = checkIp65504P297ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P297ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P297ReservdL
	 *	@return ip65504P297ReservdL
	 */
	public short getIp65504P297ReservdL() throws CFException {
        if (isIp65504P297ReservdLModified()) { 
           ip65504P297ReservdL = refreshIp65504P297ReservdL();
        }
   		return ip65504P297ReservdL;
	}
	
	/**
	 * 	Update Ip65504P297ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P297-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P297ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P297ReservdL = checkIp65504P297ReservdLMaxLimit(number); 
		serializeIp65504P297ReservdL(ip65504P297ReservdL);
	}

	public void setIp65504P297ReservdL(int number) {
	    number = checkIp65504P297ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P297ReservdL((short)number);
	}
	public void setIp65504P297ReservdL(long number) {
	    number = checkIp65504P297ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P297ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P298RecTrxS
	 *	@return ip65504P298RecTrxS
	 */
	public short getIp65504P298RecTrxS() throws CFException {
        if (isIp65504P298RecTrxSModified()) { 
           ip65504P298RecTrxS = refreshIp65504P298RecTrxS();
        }
   		return ip65504P298RecTrxS;
	}
	
	/**
	 * 	Update Ip65504P298RecTrxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P298-REC-TRX-S
	 *	@param number
	 */
	public void setIp65504P298RecTrxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P298RecTrxS = checkIp65504P298RecTrxSMaxLimit(number); 
		serializeIp65504P298RecTrxS(ip65504P298RecTrxS);
	}

	public void setIp65504P298RecTrxS(int number) {
	    number = checkIp65504P298RecTrxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P298RecTrxS((short)number);
	}
	public void setIp65504P298RecTrxS(long number) {
	    number = checkIp65504P298RecTrxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P298RecTrxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P298RecTrxL
	 *	@return ip65504P298RecTrxL
	 */
	public short getIp65504P298RecTrxL() throws CFException {
        if (isIp65504P298RecTrxLModified()) { 
           ip65504P298RecTrxL = refreshIp65504P298RecTrxL();
        }
   		return ip65504P298RecTrxL;
	}
	
	/**
	 * 	Update Ip65504P298RecTrxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P298-REC-TRX-L
	 *	@param number
	 */
	public void setIp65504P298RecTrxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P298RecTrxL = checkIp65504P298RecTrxLMaxLimit(number); 
		serializeIp65504P298RecTrxL(ip65504P298RecTrxL);
	}

	public void setIp65504P298RecTrxL(int number) {
	    number = checkIp65504P298RecTrxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P298RecTrxL((short)number);
	}
	public void setIp65504P298RecTrxL(long number) {
	    number = checkIp65504P298RecTrxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P298RecTrxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P299ReservdS
	 *	@return ip65504P299ReservdS
	 */
	public short getIp65504P299ReservdS() throws CFException {
        if (isIp65504P299ReservdSModified()) { 
           ip65504P299ReservdS = refreshIp65504P299ReservdS();
        }
   		return ip65504P299ReservdS;
	}
	
	/**
	 * 	Update Ip65504P299ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P299-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P299ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P299ReservdS = checkIp65504P299ReservdSMaxLimit(number); 
		serializeIp65504P299ReservdS(ip65504P299ReservdS);
	}

	public void setIp65504P299ReservdS(int number) {
	    number = checkIp65504P299ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P299ReservdS((short)number);
	}
	public void setIp65504P299ReservdS(long number) {
	    number = checkIp65504P299ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P299ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P299ReservdL
	 *	@return ip65504P299ReservdL
	 */
	public short getIp65504P299ReservdL() throws CFException {
        if (isIp65504P299ReservdLModified()) { 
           ip65504P299ReservdL = refreshIp65504P299ReservdL();
        }
   		return ip65504P299ReservdL;
	}
	
	/**
	 * 	Update Ip65504P299ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P299-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P299ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P299ReservdL = checkIp65504P299ReservdLMaxLimit(number); 
		serializeIp65504P299ReservdL(ip65504P299ReservdL);
	}

	public void setIp65504P299ReservdL(int number) {
	    number = checkIp65504P299ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P299ReservdL((short)number);
	}
	public void setIp65504P299ReservdL(long number) {
	    number = checkIp65504P299ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P299ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P300RecFilS
	 *	@return ip65504P300RecFilS
	 */
	public short getIp65504P300RecFilS() throws CFException {
        if (isIp65504P300RecFilSModified()) { 
           ip65504P300RecFilS = refreshIp65504P300RecFilS();
        }
   		return ip65504P300RecFilS;
	}
	
	/**
	 * 	Update Ip65504P300RecFilS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P300-REC-FIL-S
	 *	@param number
	 */
	public void setIp65504P300RecFilS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P300RecFilS = checkIp65504P300RecFilSMaxLimit(number); 
		serializeIp65504P300RecFilS(ip65504P300RecFilS);
	}

	public void setIp65504P300RecFilS(int number) {
	    number = checkIp65504P300RecFilSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P300RecFilS((short)number);
	}
	public void setIp65504P300RecFilS(long number) {
	    number = checkIp65504P300RecFilSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P300RecFilS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P300RecFilL
	 *	@return ip65504P300RecFilL
	 */
	public short getIp65504P300RecFilL() throws CFException {
        if (isIp65504P300RecFilLModified()) { 
           ip65504P300RecFilL = refreshIp65504P300RecFilL();
        }
   		return ip65504P300RecFilL;
	}
	
	/**
	 * 	Update Ip65504P300RecFilL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P300-REC-FIL-L
	 *	@param number
	 */
	public void setIp65504P300RecFilL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P300RecFilL = checkIp65504P300RecFilLMaxLimit(number); 
		serializeIp65504P300RecFilL(ip65504P300RecFilL);
	}

	public void setIp65504P300RecFilL(int number) {
	    number = checkIp65504P300RecFilLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P300RecFilL((short)number);
	}
	public void setIp65504P300RecFilL(long number) {
	    number = checkIp65504P300RecFilLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P300RecFilL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P301FilAmtS
	 *	@return ip65504P301FilAmtS
	 */
	public short getIp65504P301FilAmtS() throws CFException {
        if (isIp65504P301FilAmtSModified()) { 
           ip65504P301FilAmtS = refreshIp65504P301FilAmtS();
        }
   		return ip65504P301FilAmtS;
	}
	
	/**
	 * 	Update Ip65504P301FilAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P301-FIL-AMT-S
	 *	@param number
	 */
	public void setIp65504P301FilAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P301FilAmtS = checkIp65504P301FilAmtSMaxLimit(number); 
		serializeIp65504P301FilAmtS(ip65504P301FilAmtS);
	}

	public void setIp65504P301FilAmtS(int number) {
	    number = checkIp65504P301FilAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P301FilAmtS((short)number);
	}
	public void setIp65504P301FilAmtS(long number) {
	    number = checkIp65504P301FilAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P301FilAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P301FilAmtL
	 *	@return ip65504P301FilAmtL
	 */
	public short getIp65504P301FilAmtL() throws CFException {
        if (isIp65504P301FilAmtLModified()) { 
           ip65504P301FilAmtL = refreshIp65504P301FilAmtL();
        }
   		return ip65504P301FilAmtL;
	}
	
	/**
	 * 	Update Ip65504P301FilAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P301-FIL-AMT-L
	 *	@param number
	 */
	public void setIp65504P301FilAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P301FilAmtL = checkIp65504P301FilAmtLMaxLimit(number); 
		serializeIp65504P301FilAmtL(ip65504P301FilAmtL);
	}

	public void setIp65504P301FilAmtL(int number) {
	    number = checkIp65504P301FilAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P301FilAmtL((short)number);
	}
	public void setIp65504P301FilAmtL(long number) {
	    number = checkIp65504P301FilAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P301FilAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P302MbractyS
	 *	@return ip65504P302MbractyS
	 */
	public short getIp65504P302MbractyS() throws CFException {
        if (isIp65504P302MbractySModified()) { 
           ip65504P302MbractyS = refreshIp65504P302MbractyS();
        }
   		return ip65504P302MbractyS;
	}
	
	/**
	 * 	Update Ip65504P302MbractyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P302-MBRACTY-S
	 *	@param number
	 */
	public void setIp65504P302MbractyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P302MbractyS = checkIp65504P302MbractySMaxLimit(number); 
		serializeIp65504P302MbractyS(ip65504P302MbractyS);
	}

	public void setIp65504P302MbractyS(int number) {
	    number = checkIp65504P302MbractySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P302MbractyS((short)number);
	}
	public void setIp65504P302MbractyS(long number) {
	    number = checkIp65504P302MbractySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P302MbractyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P302MbractyL
	 *	@return ip65504P302MbractyL
	 */
	public short getIp65504P302MbractyL() throws CFException {
        if (isIp65504P302MbractyLModified()) { 
           ip65504P302MbractyL = refreshIp65504P302MbractyL();
        }
   		return ip65504P302MbractyL;
	}
	
	/**
	 * 	Update Ip65504P302MbractyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P302-MBRACTY-L
	 *	@param number
	 */
	public void setIp65504P302MbractyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P302MbractyL = checkIp65504P302MbractyLMaxLimit(number); 
		serializeIp65504P302MbractyL(ip65504P302MbractyL);
	}

	public void setIp65504P302MbractyL(int number) {
	    number = checkIp65504P302MbractyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P302MbractyL((short)number);
	}
	public void setIp65504P302MbractyL(long number) {
	    number = checkIp65504P302MbractyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P302MbractyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P303TrxTypS
	 *	@return ip65504P303TrxTypS
	 */
	public short getIp65504P303TrxTypS() throws CFException {
        if (isIp65504P303TrxTypSModified()) { 
           ip65504P303TrxTypS = refreshIp65504P303TrxTypS();
        }
   		return ip65504P303TrxTypS;
	}
	
	/**
	 * 	Update Ip65504P303TrxTypS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P303-TRX-TYP-S
	 *	@param number
	 */
	public void setIp65504P303TrxTypS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P303TrxTypS = checkIp65504P303TrxTypSMaxLimit(number); 
		serializeIp65504P303TrxTypS(ip65504P303TrxTypS);
	}

	public void setIp65504P303TrxTypS(int number) {
	    number = checkIp65504P303TrxTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P303TrxTypS((short)number);
	}
	public void setIp65504P303TrxTypS(long number) {
	    number = checkIp65504P303TrxTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P303TrxTypS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P303TrxTypL
	 *	@return ip65504P303TrxTypL
	 */
	public short getIp65504P303TrxTypL() throws CFException {
        if (isIp65504P303TrxTypLModified()) { 
           ip65504P303TrxTypL = refreshIp65504P303TrxTypL();
        }
   		return ip65504P303TrxTypL;
	}
	
	/**
	 * 	Update Ip65504P303TrxTypL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P303-TRX-TYP-L
	 *	@param number
	 */
	public void setIp65504P303TrxTypL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P303TrxTypL = checkIp65504P303TrxTypLMaxLimit(number); 
		serializeIp65504P303TrxTypL(ip65504P303TrxTypL);
	}

	public void setIp65504P303TrxTypL(int number) {
	    number = checkIp65504P303TrxTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P303TrxTypL((short)number);
	}
	public void setIp65504P303TrxTypL(long number) {
	    number = checkIp65504P303TrxTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P303TrxTypL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P304ReservdS
	 *	@return ip65504P304ReservdS
	 */
	public short getIp65504P304ReservdS() throws CFException {
        if (isIp65504P304ReservdSModified()) { 
           ip65504P304ReservdS = refreshIp65504P304ReservdS();
        }
   		return ip65504P304ReservdS;
	}
	
	/**
	 * 	Update Ip65504P304ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P304-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P304ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P304ReservdS = checkIp65504P304ReservdSMaxLimit(number); 
		serializeIp65504P304ReservdS(ip65504P304ReservdS);
	}

	public void setIp65504P304ReservdS(int number) {
	    number = checkIp65504P304ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P304ReservdS((short)number);
	}
	public void setIp65504P304ReservdS(long number) {
	    number = checkIp65504P304ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P304ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P304ReservdL
	 *	@return ip65504P304ReservdL
	 */
	public short getIp65504P304ReservdL() throws CFException {
        if (isIp65504P304ReservdLModified()) { 
           ip65504P304ReservdL = refreshIp65504P304ReservdL();
        }
   		return ip65504P304ReservdL;
	}
	
	/**
	 * 	Update Ip65504P304ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P304-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P304ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P304ReservdL = checkIp65504P304ReservdLMaxLimit(number); 
		serializeIp65504P304ReservdL(ip65504P304ReservdL);
	}

	public void setIp65504P304ReservdL(int number) {
	    number = checkIp65504P304ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P304ReservdL((short)number);
	}
	public void setIp65504P304ReservdL(long number) {
	    number = checkIp65504P304ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P304ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P305NetCntS
	 *	@return ip65504P305NetCntS
	 */
	public short getIp65504P305NetCntS() throws CFException {
        if (isIp65504P305NetCntSModified()) { 
           ip65504P305NetCntS = refreshIp65504P305NetCntS();
        }
   		return ip65504P305NetCntS;
	}
	
	/**
	 * 	Update Ip65504P305NetCntS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P305-NET-CNT-S
	 *	@param number
	 */
	public void setIp65504P305NetCntS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P305NetCntS = checkIp65504P305NetCntSMaxLimit(number); 
		serializeIp65504P305NetCntS(ip65504P305NetCntS);
	}

	public void setIp65504P305NetCntS(int number) {
	    number = checkIp65504P305NetCntSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P305NetCntS((short)number);
	}
	public void setIp65504P305NetCntS(long number) {
	    number = checkIp65504P305NetCntSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P305NetCntS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P305NetCntL
	 *	@return ip65504P305NetCntL
	 */
	public short getIp65504P305NetCntL() throws CFException {
        if (isIp65504P305NetCntLModified()) { 
           ip65504P305NetCntL = refreshIp65504P305NetCntL();
        }
   		return ip65504P305NetCntL;
	}
	
	/**
	 * 	Update Ip65504P305NetCntL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P305-NET-CNT-L
	 *	@param number
	 */
	public void setIp65504P305NetCntL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P305NetCntL = checkIp65504P305NetCntLMaxLimit(number); 
		serializeIp65504P305NetCntL(ip65504P305NetCntL);
	}

	public void setIp65504P305NetCntL(int number) {
	    number = checkIp65504P305NetCntLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P305NetCntL((short)number);
	}
	public void setIp65504P305NetCntL(long number) {
	    number = checkIp65504P305NetCntLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P305NetCntL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P306FilCntS
	 *	@return ip65504P306FilCntS
	 */
	public short getIp65504P306FilCntS() throws CFException {
        if (isIp65504P306FilCntSModified()) { 
           ip65504P306FilCntS = refreshIp65504P306FilCntS();
        }
   		return ip65504P306FilCntS;
	}
	
	/**
	 * 	Update Ip65504P306FilCntS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P306-FIL-CNT-S
	 *	@param number
	 */
	public void setIp65504P306FilCntS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P306FilCntS = checkIp65504P306FilCntSMaxLimit(number); 
		serializeIp65504P306FilCntS(ip65504P306FilCntS);
	}

	public void setIp65504P306FilCntS(int number) {
	    number = checkIp65504P306FilCntSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P306FilCntS((short)number);
	}
	public void setIp65504P306FilCntS(long number) {
	    number = checkIp65504P306FilCntSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P306FilCntS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P306FilCntL
	 *	@return ip65504P306FilCntL
	 */
	public short getIp65504P306FilCntL() throws CFException {
        if (isIp65504P306FilCntLModified()) { 
           ip65504P306FilCntL = refreshIp65504P306FilCntL();
        }
   		return ip65504P306FilCntL;
	}
	
	/**
	 * 	Update Ip65504P306FilCntL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P306-FIL-CNT-L
	 *	@param number
	 */
	public void setIp65504P306FilCntL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P306FilCntL = checkIp65504P306FilCntLMaxLimit(number); 
		serializeIp65504P306FilCntL(ip65504P306FilCntL);
	}

	public void setIp65504P306FilCntL(int number) {
	    number = checkIp65504P306FilCntLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P306FilCntL((short)number);
	}
	public void setIp65504P306FilCntL(long number) {
	    number = checkIp65504P306FilCntLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P306FilCntL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P307ReservdS
	 *	@return ip65504P307ReservdS
	 */
	public short getIp65504P307ReservdS() throws CFException {
        if (isIp65504P307ReservdSModified()) { 
           ip65504P307ReservdS = refreshIp65504P307ReservdS();
        }
   		return ip65504P307ReservdS;
	}
	
	/**
	 * 	Update Ip65504P307ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P307-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P307ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P307ReservdS = checkIp65504P307ReservdSMaxLimit(number); 
		serializeIp65504P307ReservdS(ip65504P307ReservdS);
	}

	public void setIp65504P307ReservdS(int number) {
	    number = checkIp65504P307ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P307ReservdS((short)number);
	}
	public void setIp65504P307ReservdS(long number) {
	    number = checkIp65504P307ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P307ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P307ReservdL
	 *	@return ip65504P307ReservdL
	 */
	public short getIp65504P307ReservdL() throws CFException {
        if (isIp65504P307ReservdLModified()) { 
           ip65504P307ReservdL = refreshIp65504P307ReservdL();
        }
   		return ip65504P307ReservdL;
	}
	
	/**
	 * 	Update Ip65504P307ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P307-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P307ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P307ReservdL = checkIp65504P307ReservdLMaxLimit(number); 
		serializeIp65504P307ReservdL(ip65504P307ReservdL);
	}

	public void setIp65504P307ReservdL(int number) {
	    number = checkIp65504P307ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P307ReservdL((short)number);
	}
	public void setIp65504P307ReservdL(long number) {
	    number = checkIp65504P307ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P307ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P308ReservdS
	 *	@return ip65504P308ReservdS
	 */
	public short getIp65504P308ReservdS() throws CFException {
        if (isIp65504P308ReservdSModified()) { 
           ip65504P308ReservdS = refreshIp65504P308ReservdS();
        }
   		return ip65504P308ReservdS;
	}
	
	/**
	 * 	Update Ip65504P308ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P308-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P308ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P308ReservdS = checkIp65504P308ReservdSMaxLimit(number); 
		serializeIp65504P308ReservdS(ip65504P308ReservdS);
	}

	public void setIp65504P308ReservdS(int number) {
	    number = checkIp65504P308ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P308ReservdS((short)number);
	}
	public void setIp65504P308ReservdS(long number) {
	    number = checkIp65504P308ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P308ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P308ReservdL
	 *	@return ip65504P308ReservdL
	 */
	public short getIp65504P308ReservdL() throws CFException {
        if (isIp65504P308ReservdLModified()) { 
           ip65504P308ReservdL = refreshIp65504P308ReservdL();
        }
   		return ip65504P308ReservdL;
	}
	
	/**
	 * 	Update Ip65504P308ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P308-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P308ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P308ReservdL = checkIp65504P308ReservdLMaxLimit(number); 
		serializeIp65504P308ReservdL(ip65504P308ReservdL);
	}

	public void setIp65504P308ReservdL(int number) {
	    number = checkIp65504P308ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P308ReservdL((short)number);
	}
	public void setIp65504P308ReservdL(long number) {
	    number = checkIp65504P308ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P308ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P309ReservdS
	 *	@return ip65504P309ReservdS
	 */
	public short getIp65504P309ReservdS() throws CFException {
        if (isIp65504P309ReservdSModified()) { 
           ip65504P309ReservdS = refreshIp65504P309ReservdS();
        }
   		return ip65504P309ReservdS;
	}
	
	/**
	 * 	Update Ip65504P309ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P309-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P309ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P309ReservdS = checkIp65504P309ReservdSMaxLimit(number); 
		serializeIp65504P309ReservdS(ip65504P309ReservdS);
	}

	public void setIp65504P309ReservdS(int number) {
	    number = checkIp65504P309ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P309ReservdS((short)number);
	}
	public void setIp65504P309ReservdS(long number) {
	    number = checkIp65504P309ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P309ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P309ReservdL
	 *	@return ip65504P309ReservdL
	 */
	public short getIp65504P309ReservdL() throws CFException {
        if (isIp65504P309ReservdLModified()) { 
           ip65504P309ReservdL = refreshIp65504P309ReservdL();
        }
   		return ip65504P309ReservdL;
	}
	
	/**
	 * 	Update Ip65504P309ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P309-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P309ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P309ReservdL = checkIp65504P309ReservdLMaxLimit(number); 
		serializeIp65504P309ReservdL(ip65504P309ReservdL);
	}

	public void setIp65504P309ReservdL(int number) {
	    number = checkIp65504P309ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P309ReservdL((short)number);
	}
	public void setIp65504P309ReservdL(long number) {
	    number = checkIp65504P309ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P309ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P310DbRamtS
	 *	@return ip65504P310DbRamtS
	 */
	public short getIp65504P310DbRamtS() throws CFException {
        if (isIp65504P310DbRamtSModified()) { 
           ip65504P310DbRamtS = refreshIp65504P310DbRamtS();
        }
   		return ip65504P310DbRamtS;
	}
	
	/**
	 * 	Update Ip65504P310DbRamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P310-DB-RAMT-S
	 *	@param number
	 */
	public void setIp65504P310DbRamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P310DbRamtS = checkIp65504P310DbRamtSMaxLimit(number); 
		serializeIp65504P310DbRamtS(ip65504P310DbRamtS);
	}

	public void setIp65504P310DbRamtS(int number) {
	    number = checkIp65504P310DbRamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P310DbRamtS((short)number);
	}
	public void setIp65504P310DbRamtS(long number) {
	    number = checkIp65504P310DbRamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P310DbRamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P310DbRamtL
	 *	@return ip65504P310DbRamtL
	 */
	public short getIp65504P310DbRamtL() throws CFException {
        if (isIp65504P310DbRamtLModified()) { 
           ip65504P310DbRamtL = refreshIp65504P310DbRamtL();
        }
   		return ip65504P310DbRamtL;
	}
	
	/**
	 * 	Update Ip65504P310DbRamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P310-DB-RAMT-L
	 *	@param number
	 */
	public void setIp65504P310DbRamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P310DbRamtL = checkIp65504P310DbRamtLMaxLimit(number); 
		serializeIp65504P310DbRamtL(ip65504P310DbRamtL);
	}

	public void setIp65504P310DbRamtL(int number) {
	    number = checkIp65504P310DbRamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P310DbRamtL((short)number);
	}
	public void setIp65504P310DbRamtL(long number) {
	    number = checkIp65504P310DbRamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P310DbRamtL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P280SrcFilS((short)0);
         	setIp65504P280SrcFilL((short)0);
         	setIp65504P281ReservdS((short)0);
         	setIp65504P281ReservdL((short)0);
         	setIp65504P282ReservdS((short)0);
         	setIp65504P282ReservdL((short)0);
         	setIp65504P283ReservdS((short)0);
         	setIp65504P283ReservdL((short)0);
         	setIp65504P284ReservdS((short)0);
         	setIp65504P284ReservdL((short)0);
         	setIp65504P285ReservdS((short)0);
         	setIp65504P285ReservdL((short)0);
         	setIp65504P286ReservdS((short)0);
         	setIp65504P286ReservdL((short)0);
         	setIp65504P287ReservdS((short)0);
         	setIp65504P287ReservdL((short)0);
         	setIp65504P288ReservdS((short)0);
         	setIp65504P288ReservdL((short)0);
         	setIp65504P289ReservdS((short)0);
         	setIp65504P289ReservdL((short)0);
         	setIp65504P290ReservdS((short)0);
         	setIp65504P290ReservdL((short)0);
         	setIp65504P291ReservdS((short)0);
         	setIp65504P291ReservdL((short)0);
         	setIp65504P292ReservdS((short)0);
         	setIp65504P292ReservdL((short)0);
         	setIp65504P293ReservdS((short)0);
         	setIp65504P293ReservdL((short)0);
         	setIp65504P294ReservdS((short)0);
         	setIp65504P294ReservdL((short)0);
         	setIp65504P295ReservdS((short)0);
         	setIp65504P295ReservdL((short)0);
         	setIp65504P296ReservdS((short)0);
         	setIp65504P296ReservdL((short)0);
         	setIp65504P297ReservdS((short)0);
         	setIp65504P297ReservdL((short)0);
         	setIp65504P298RecTrxS((short)0);
         	setIp65504P298RecTrxL((short)0);
         	setIp65504P299ReservdS((short)0);
         	setIp65504P299ReservdL((short)0);
         	setIp65504P300RecFilS((short)0);
         	setIp65504P300RecFilL((short)0);
         	setIp65504P301FilAmtS((short)0);
         	setIp65504P301FilAmtL((short)0);
         	setIp65504P302MbractyS((short)0);
         	setIp65504P302MbractyL((short)0);
         	setIp65504P303TrxTypS((short)0);
         	setIp65504P303TrxTypL((short)0);
         	setIp65504P304ReservdS((short)0);
         	setIp65504P304ReservdL((short)0);
         	setIp65504P305NetCntS((short)0);
         	setIp65504P305NetCntL((short)0);
         	setIp65504P306FilCntS((short)0);
         	setIp65504P306FilCntL((short)0);
         	setIp65504P307ReservdS((short)0);
         	setIp65504P307ReservdL((short)0);
         	setIp65504P308ReservdS((short)0);
         	setIp65504P308ReservdL((short)0);
         	setIp65504P309ReservdS((short)0);
         	setIp65504P309ReservdL((short)0);
         	setIp65504P310DbRamtS((short)0);
         	setIp65504P310DbRamtL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup10FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_10_LENGTH;
		}

}
  
