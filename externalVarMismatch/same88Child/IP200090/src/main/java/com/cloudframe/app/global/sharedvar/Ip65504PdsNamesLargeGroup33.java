package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup33 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup33 extends Ip65504PdsNamesLargeGroup33Serialized { 
   

								private short ip65504P993ReservdS;

								private short ip65504P993ReservdL;


								private short ip65504P994ReservdS;

								private short ip65504P994ReservdL;


								private short ip65504P995ReservdS;

								private short ip65504P995ReservdL;


								private short ip65504P996ReservdS;

								private short ip65504P996ReservdL;


								private short ip65504P997ReservdS;

								private short ip65504P997ReservdL;


								private short ip65504P998ReservdS;

								private short ip65504P998ReservdL;


								private short ip65504P999ReservdS;

								private short ip65504P999ReservdL;


								private short ip65504P1000MemdataS;

								private short ip65504P1000MemdataL;


								private short ip65504P1001MemdataS;

								private short ip65504P1001MemdataL;


								private short ip65504P1002MemdataS;

								private short ip65504P1002MemdataL;


								private short ip65504P1003MemdataS;

								private short ip65504P1003MemdataL;


								private short ip65504P1004MemdataS;

								private short ip65504P1004MemdataL;


								private short ip65504P1005MemdataS;

								private short ip65504P1005MemdataL;


								private short ip65504P1006MemdataS;

								private short ip65504P1006MemdataL;


								private short ip65504P1007MemdataS;

								private short ip65504P1007MemdataL;


								private short ip65504P1008MemdataS;

								private short ip65504P1008MemdataL;


								private short ip65504P1009MemdataS;

								private short ip65504P1009MemdataL;


								private short ip65504P1010MemdataS;

								private short ip65504P1010MemdataL;


								private short ip65504P1011MemdataS;

								private short ip65504P1011MemdataL;


								private short ip65504P1012MemdataS;

								private short ip65504P1012MemdataL;


								private short ip65504P1013MemdataS;

								private short ip65504P1013MemdataL;


								private short ip65504P1014MemdataS;

								private short ip65504P1014MemdataL;


								private short ip65504P1015MemdataS;

								private short ip65504P1015MemdataL;


								private short ip65504P1016MemdataS;

								private short ip65504P1016MemdataL;


								private short ip65504P1017MemdataS;

								private short ip65504P1017MemdataL;


								private short ip65504P1018MemdataS;

								private short ip65504P1018MemdataL;


								private short ip65504P1019MemdataS;

								private short ip65504P1019MemdataL;


								private short ip65504P1020MemdataS;

								private short ip65504P1020MemdataL;


								private short ip65504P1021MemdataS;

								private short ip65504P1021MemdataL;


								private short ip65504P1022MemdataS;

								private short ip65504P1022MemdataL;


								private short ip65504P1023MemdataS;

								private short ip65504P1023MemdataL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup33
	**/
    public Ip65504PdsNamesLargeGroup33() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup33. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup33(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P993ReservdS
	 *	@return ip65504P993ReservdS
	 */
	public short getIp65504P993ReservdS() throws CFException {
        if (isIp65504P993ReservdSModified()) { 
           ip65504P993ReservdS = refreshIp65504P993ReservdS();
        }
   		return ip65504P993ReservdS;
	}
	
	/**
	 * 	Update Ip65504P993ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P993-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P993ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P993ReservdS = checkIp65504P993ReservdSMaxLimit(number); 
		serializeIp65504P993ReservdS(ip65504P993ReservdS);
	}

	public void setIp65504P993ReservdS(int number) {
	    number = checkIp65504P993ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P993ReservdS((short)number);
	}
	public void setIp65504P993ReservdS(long number) {
	    number = checkIp65504P993ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P993ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P993ReservdL
	 *	@return ip65504P993ReservdL
	 */
	public short getIp65504P993ReservdL() throws CFException {
        if (isIp65504P993ReservdLModified()) { 
           ip65504P993ReservdL = refreshIp65504P993ReservdL();
        }
   		return ip65504P993ReservdL;
	}
	
	/**
	 * 	Update Ip65504P993ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P993-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P993ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P993ReservdL = checkIp65504P993ReservdLMaxLimit(number); 
		serializeIp65504P993ReservdL(ip65504P993ReservdL);
	}

	public void setIp65504P993ReservdL(int number) {
	    number = checkIp65504P993ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P993ReservdL((short)number);
	}
	public void setIp65504P993ReservdL(long number) {
	    number = checkIp65504P993ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P993ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P994ReservdS
	 *	@return ip65504P994ReservdS
	 */
	public short getIp65504P994ReservdS() throws CFException {
        if (isIp65504P994ReservdSModified()) { 
           ip65504P994ReservdS = refreshIp65504P994ReservdS();
        }
   		return ip65504P994ReservdS;
	}
	
	/**
	 * 	Update Ip65504P994ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P994-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P994ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P994ReservdS = checkIp65504P994ReservdSMaxLimit(number); 
		serializeIp65504P994ReservdS(ip65504P994ReservdS);
	}

	public void setIp65504P994ReservdS(int number) {
	    number = checkIp65504P994ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P994ReservdS((short)number);
	}
	public void setIp65504P994ReservdS(long number) {
	    number = checkIp65504P994ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P994ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P994ReservdL
	 *	@return ip65504P994ReservdL
	 */
	public short getIp65504P994ReservdL() throws CFException {
        if (isIp65504P994ReservdLModified()) { 
           ip65504P994ReservdL = refreshIp65504P994ReservdL();
        }
   		return ip65504P994ReservdL;
	}
	
	/**
	 * 	Update Ip65504P994ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P994-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P994ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P994ReservdL = checkIp65504P994ReservdLMaxLimit(number); 
		serializeIp65504P994ReservdL(ip65504P994ReservdL);
	}

	public void setIp65504P994ReservdL(int number) {
	    number = checkIp65504P994ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P994ReservdL((short)number);
	}
	public void setIp65504P994ReservdL(long number) {
	    number = checkIp65504P994ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P994ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P995ReservdS
	 *	@return ip65504P995ReservdS
	 */
	public short getIp65504P995ReservdS() throws CFException {
        if (isIp65504P995ReservdSModified()) { 
           ip65504P995ReservdS = refreshIp65504P995ReservdS();
        }
   		return ip65504P995ReservdS;
	}
	
	/**
	 * 	Update Ip65504P995ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P995-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P995ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P995ReservdS = checkIp65504P995ReservdSMaxLimit(number); 
		serializeIp65504P995ReservdS(ip65504P995ReservdS);
	}

	public void setIp65504P995ReservdS(int number) {
	    number = checkIp65504P995ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P995ReservdS((short)number);
	}
	public void setIp65504P995ReservdS(long number) {
	    number = checkIp65504P995ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P995ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P995ReservdL
	 *	@return ip65504P995ReservdL
	 */
	public short getIp65504P995ReservdL() throws CFException {
        if (isIp65504P995ReservdLModified()) { 
           ip65504P995ReservdL = refreshIp65504P995ReservdL();
        }
   		return ip65504P995ReservdL;
	}
	
	/**
	 * 	Update Ip65504P995ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P995-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P995ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P995ReservdL = checkIp65504P995ReservdLMaxLimit(number); 
		serializeIp65504P995ReservdL(ip65504P995ReservdL);
	}

	public void setIp65504P995ReservdL(int number) {
	    number = checkIp65504P995ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P995ReservdL((short)number);
	}
	public void setIp65504P995ReservdL(long number) {
	    number = checkIp65504P995ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P995ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P996ReservdS
	 *	@return ip65504P996ReservdS
	 */
	public short getIp65504P996ReservdS() throws CFException {
        if (isIp65504P996ReservdSModified()) { 
           ip65504P996ReservdS = refreshIp65504P996ReservdS();
        }
   		return ip65504P996ReservdS;
	}
	
	/**
	 * 	Update Ip65504P996ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P996-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P996ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P996ReservdS = checkIp65504P996ReservdSMaxLimit(number); 
		serializeIp65504P996ReservdS(ip65504P996ReservdS);
	}

	public void setIp65504P996ReservdS(int number) {
	    number = checkIp65504P996ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P996ReservdS((short)number);
	}
	public void setIp65504P996ReservdS(long number) {
	    number = checkIp65504P996ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P996ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P996ReservdL
	 *	@return ip65504P996ReservdL
	 */
	public short getIp65504P996ReservdL() throws CFException {
        if (isIp65504P996ReservdLModified()) { 
           ip65504P996ReservdL = refreshIp65504P996ReservdL();
        }
   		return ip65504P996ReservdL;
	}
	
	/**
	 * 	Update Ip65504P996ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P996-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P996ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P996ReservdL = checkIp65504P996ReservdLMaxLimit(number); 
		serializeIp65504P996ReservdL(ip65504P996ReservdL);
	}

	public void setIp65504P996ReservdL(int number) {
	    number = checkIp65504P996ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P996ReservdL((short)number);
	}
	public void setIp65504P996ReservdL(long number) {
	    number = checkIp65504P996ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P996ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P997ReservdS
	 *	@return ip65504P997ReservdS
	 */
	public short getIp65504P997ReservdS() throws CFException {
        if (isIp65504P997ReservdSModified()) { 
           ip65504P997ReservdS = refreshIp65504P997ReservdS();
        }
   		return ip65504P997ReservdS;
	}
	
	/**
	 * 	Update Ip65504P997ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P997-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P997ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P997ReservdS = checkIp65504P997ReservdSMaxLimit(number); 
		serializeIp65504P997ReservdS(ip65504P997ReservdS);
	}

	public void setIp65504P997ReservdS(int number) {
	    number = checkIp65504P997ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P997ReservdS((short)number);
	}
	public void setIp65504P997ReservdS(long number) {
	    number = checkIp65504P997ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P997ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P997ReservdL
	 *	@return ip65504P997ReservdL
	 */
	public short getIp65504P997ReservdL() throws CFException {
        if (isIp65504P997ReservdLModified()) { 
           ip65504P997ReservdL = refreshIp65504P997ReservdL();
        }
   		return ip65504P997ReservdL;
	}
	
	/**
	 * 	Update Ip65504P997ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P997-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P997ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P997ReservdL = checkIp65504P997ReservdLMaxLimit(number); 
		serializeIp65504P997ReservdL(ip65504P997ReservdL);
	}

	public void setIp65504P997ReservdL(int number) {
	    number = checkIp65504P997ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P997ReservdL((short)number);
	}
	public void setIp65504P997ReservdL(long number) {
	    number = checkIp65504P997ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P997ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P998ReservdS
	 *	@return ip65504P998ReservdS
	 */
	public short getIp65504P998ReservdS() throws CFException {
        if (isIp65504P998ReservdSModified()) { 
           ip65504P998ReservdS = refreshIp65504P998ReservdS();
        }
   		return ip65504P998ReservdS;
	}
	
	/**
	 * 	Update Ip65504P998ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P998-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P998ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P998ReservdS = checkIp65504P998ReservdSMaxLimit(number); 
		serializeIp65504P998ReservdS(ip65504P998ReservdS);
	}

	public void setIp65504P998ReservdS(int number) {
	    number = checkIp65504P998ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P998ReservdS((short)number);
	}
	public void setIp65504P998ReservdS(long number) {
	    number = checkIp65504P998ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P998ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P998ReservdL
	 *	@return ip65504P998ReservdL
	 */
	public short getIp65504P998ReservdL() throws CFException {
        if (isIp65504P998ReservdLModified()) { 
           ip65504P998ReservdL = refreshIp65504P998ReservdL();
        }
   		return ip65504P998ReservdL;
	}
	
	/**
	 * 	Update Ip65504P998ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P998-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P998ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P998ReservdL = checkIp65504P998ReservdLMaxLimit(number); 
		serializeIp65504P998ReservdL(ip65504P998ReservdL);
	}

	public void setIp65504P998ReservdL(int number) {
	    number = checkIp65504P998ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P998ReservdL((short)number);
	}
	public void setIp65504P998ReservdL(long number) {
	    number = checkIp65504P998ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P998ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P999ReservdS
	 *	@return ip65504P999ReservdS
	 */
	public short getIp65504P999ReservdS() throws CFException {
        if (isIp65504P999ReservdSModified()) { 
           ip65504P999ReservdS = refreshIp65504P999ReservdS();
        }
   		return ip65504P999ReservdS;
	}
	
	/**
	 * 	Update Ip65504P999ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P999-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P999ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P999ReservdS = checkIp65504P999ReservdSMaxLimit(number); 
		serializeIp65504P999ReservdS(ip65504P999ReservdS);
	}

	public void setIp65504P999ReservdS(int number) {
	    number = checkIp65504P999ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P999ReservdS((short)number);
	}
	public void setIp65504P999ReservdS(long number) {
	    number = checkIp65504P999ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P999ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P999ReservdL
	 *	@return ip65504P999ReservdL
	 */
	public short getIp65504P999ReservdL() throws CFException {
        if (isIp65504P999ReservdLModified()) { 
           ip65504P999ReservdL = refreshIp65504P999ReservdL();
        }
   		return ip65504P999ReservdL;
	}
	
	/**
	 * 	Update Ip65504P999ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P999-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P999ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P999ReservdL = checkIp65504P999ReservdLMaxLimit(number); 
		serializeIp65504P999ReservdL(ip65504P999ReservdL);
	}

	public void setIp65504P999ReservdL(int number) {
	    number = checkIp65504P999ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P999ReservdL((short)number);
	}
	public void setIp65504P999ReservdL(long number) {
	    number = checkIp65504P999ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P999ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1000MemdataS
	 *	@return ip65504P1000MemdataS
	 */
	public short getIp65504P1000MemdataS() throws CFException {
        if (isIp65504P1000MemdataSModified()) { 
           ip65504P1000MemdataS = refreshIp65504P1000MemdataS();
        }
   		return ip65504P1000MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1000MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1000-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1000MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1000MemdataS = checkIp65504P1000MemdataSMaxLimit(number); 
		serializeIp65504P1000MemdataS(ip65504P1000MemdataS);
	}

	public void setIp65504P1000MemdataS(int number) {
	    number = checkIp65504P1000MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1000MemdataS((short)number);
	}
	public void setIp65504P1000MemdataS(long number) {
	    number = checkIp65504P1000MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1000MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1000MemdataL
	 *	@return ip65504P1000MemdataL
	 */
	public short getIp65504P1000MemdataL() throws CFException {
        if (isIp65504P1000MemdataLModified()) { 
           ip65504P1000MemdataL = refreshIp65504P1000MemdataL();
        }
   		return ip65504P1000MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1000MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1000-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1000MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1000MemdataL = checkIp65504P1000MemdataLMaxLimit(number); 
		serializeIp65504P1000MemdataL(ip65504P1000MemdataL);
	}

	public void setIp65504P1000MemdataL(int number) {
	    number = checkIp65504P1000MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1000MemdataL((short)number);
	}
	public void setIp65504P1000MemdataL(long number) {
	    number = checkIp65504P1000MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1000MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1001MemdataS
	 *	@return ip65504P1001MemdataS
	 */
	public short getIp65504P1001MemdataS() throws CFException {
        if (isIp65504P1001MemdataSModified()) { 
           ip65504P1001MemdataS = refreshIp65504P1001MemdataS();
        }
   		return ip65504P1001MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1001MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1001-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1001MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1001MemdataS = checkIp65504P1001MemdataSMaxLimit(number); 
		serializeIp65504P1001MemdataS(ip65504P1001MemdataS);
	}

	public void setIp65504P1001MemdataS(int number) {
	    number = checkIp65504P1001MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1001MemdataS((short)number);
	}
	public void setIp65504P1001MemdataS(long number) {
	    number = checkIp65504P1001MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1001MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1001MemdataL
	 *	@return ip65504P1001MemdataL
	 */
	public short getIp65504P1001MemdataL() throws CFException {
        if (isIp65504P1001MemdataLModified()) { 
           ip65504P1001MemdataL = refreshIp65504P1001MemdataL();
        }
   		return ip65504P1001MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1001MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1001-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1001MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1001MemdataL = checkIp65504P1001MemdataLMaxLimit(number); 
		serializeIp65504P1001MemdataL(ip65504P1001MemdataL);
	}

	public void setIp65504P1001MemdataL(int number) {
	    number = checkIp65504P1001MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1001MemdataL((short)number);
	}
	public void setIp65504P1001MemdataL(long number) {
	    number = checkIp65504P1001MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1001MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1002MemdataS
	 *	@return ip65504P1002MemdataS
	 */
	public short getIp65504P1002MemdataS() throws CFException {
        if (isIp65504P1002MemdataSModified()) { 
           ip65504P1002MemdataS = refreshIp65504P1002MemdataS();
        }
   		return ip65504P1002MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1002MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1002-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1002MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1002MemdataS = checkIp65504P1002MemdataSMaxLimit(number); 
		serializeIp65504P1002MemdataS(ip65504P1002MemdataS);
	}

	public void setIp65504P1002MemdataS(int number) {
	    number = checkIp65504P1002MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1002MemdataS((short)number);
	}
	public void setIp65504P1002MemdataS(long number) {
	    number = checkIp65504P1002MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1002MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1002MemdataL
	 *	@return ip65504P1002MemdataL
	 */
	public short getIp65504P1002MemdataL() throws CFException {
        if (isIp65504P1002MemdataLModified()) { 
           ip65504P1002MemdataL = refreshIp65504P1002MemdataL();
        }
   		return ip65504P1002MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1002MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1002-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1002MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1002MemdataL = checkIp65504P1002MemdataLMaxLimit(number); 
		serializeIp65504P1002MemdataL(ip65504P1002MemdataL);
	}

	public void setIp65504P1002MemdataL(int number) {
	    number = checkIp65504P1002MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1002MemdataL((short)number);
	}
	public void setIp65504P1002MemdataL(long number) {
	    number = checkIp65504P1002MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1002MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1003MemdataS
	 *	@return ip65504P1003MemdataS
	 */
	public short getIp65504P1003MemdataS() throws CFException {
        if (isIp65504P1003MemdataSModified()) { 
           ip65504P1003MemdataS = refreshIp65504P1003MemdataS();
        }
   		return ip65504P1003MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1003MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1003-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1003MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1003MemdataS = checkIp65504P1003MemdataSMaxLimit(number); 
		serializeIp65504P1003MemdataS(ip65504P1003MemdataS);
	}

	public void setIp65504P1003MemdataS(int number) {
	    number = checkIp65504P1003MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1003MemdataS((short)number);
	}
	public void setIp65504P1003MemdataS(long number) {
	    number = checkIp65504P1003MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1003MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1003MemdataL
	 *	@return ip65504P1003MemdataL
	 */
	public short getIp65504P1003MemdataL() throws CFException {
        if (isIp65504P1003MemdataLModified()) { 
           ip65504P1003MemdataL = refreshIp65504P1003MemdataL();
        }
   		return ip65504P1003MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1003MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1003-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1003MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1003MemdataL = checkIp65504P1003MemdataLMaxLimit(number); 
		serializeIp65504P1003MemdataL(ip65504P1003MemdataL);
	}

	public void setIp65504P1003MemdataL(int number) {
	    number = checkIp65504P1003MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1003MemdataL((short)number);
	}
	public void setIp65504P1003MemdataL(long number) {
	    number = checkIp65504P1003MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1003MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1004MemdataS
	 *	@return ip65504P1004MemdataS
	 */
	public short getIp65504P1004MemdataS() throws CFException {
        if (isIp65504P1004MemdataSModified()) { 
           ip65504P1004MemdataS = refreshIp65504P1004MemdataS();
        }
   		return ip65504P1004MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1004MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1004-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1004MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1004MemdataS = checkIp65504P1004MemdataSMaxLimit(number); 
		serializeIp65504P1004MemdataS(ip65504P1004MemdataS);
	}

	public void setIp65504P1004MemdataS(int number) {
	    number = checkIp65504P1004MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1004MemdataS((short)number);
	}
	public void setIp65504P1004MemdataS(long number) {
	    number = checkIp65504P1004MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1004MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1004MemdataL
	 *	@return ip65504P1004MemdataL
	 */
	public short getIp65504P1004MemdataL() throws CFException {
        if (isIp65504P1004MemdataLModified()) { 
           ip65504P1004MemdataL = refreshIp65504P1004MemdataL();
        }
   		return ip65504P1004MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1004MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1004-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1004MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1004MemdataL = checkIp65504P1004MemdataLMaxLimit(number); 
		serializeIp65504P1004MemdataL(ip65504P1004MemdataL);
	}

	public void setIp65504P1004MemdataL(int number) {
	    number = checkIp65504P1004MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1004MemdataL((short)number);
	}
	public void setIp65504P1004MemdataL(long number) {
	    number = checkIp65504P1004MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1004MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1005MemdataS
	 *	@return ip65504P1005MemdataS
	 */
	public short getIp65504P1005MemdataS() throws CFException {
        if (isIp65504P1005MemdataSModified()) { 
           ip65504P1005MemdataS = refreshIp65504P1005MemdataS();
        }
   		return ip65504P1005MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1005MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1005-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1005MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1005MemdataS = checkIp65504P1005MemdataSMaxLimit(number); 
		serializeIp65504P1005MemdataS(ip65504P1005MemdataS);
	}

	public void setIp65504P1005MemdataS(int number) {
	    number = checkIp65504P1005MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1005MemdataS((short)number);
	}
	public void setIp65504P1005MemdataS(long number) {
	    number = checkIp65504P1005MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1005MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1005MemdataL
	 *	@return ip65504P1005MemdataL
	 */
	public short getIp65504P1005MemdataL() throws CFException {
        if (isIp65504P1005MemdataLModified()) { 
           ip65504P1005MemdataL = refreshIp65504P1005MemdataL();
        }
   		return ip65504P1005MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1005MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1005-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1005MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1005MemdataL = checkIp65504P1005MemdataLMaxLimit(number); 
		serializeIp65504P1005MemdataL(ip65504P1005MemdataL);
	}

	public void setIp65504P1005MemdataL(int number) {
	    number = checkIp65504P1005MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1005MemdataL((short)number);
	}
	public void setIp65504P1005MemdataL(long number) {
	    number = checkIp65504P1005MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1005MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1006MemdataS
	 *	@return ip65504P1006MemdataS
	 */
	public short getIp65504P1006MemdataS() throws CFException {
        if (isIp65504P1006MemdataSModified()) { 
           ip65504P1006MemdataS = refreshIp65504P1006MemdataS();
        }
   		return ip65504P1006MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1006MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1006-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1006MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1006MemdataS = checkIp65504P1006MemdataSMaxLimit(number); 
		serializeIp65504P1006MemdataS(ip65504P1006MemdataS);
	}

	public void setIp65504P1006MemdataS(int number) {
	    number = checkIp65504P1006MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1006MemdataS((short)number);
	}
	public void setIp65504P1006MemdataS(long number) {
	    number = checkIp65504P1006MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1006MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1006MemdataL
	 *	@return ip65504P1006MemdataL
	 */
	public short getIp65504P1006MemdataL() throws CFException {
        if (isIp65504P1006MemdataLModified()) { 
           ip65504P1006MemdataL = refreshIp65504P1006MemdataL();
        }
   		return ip65504P1006MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1006MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1006-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1006MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1006MemdataL = checkIp65504P1006MemdataLMaxLimit(number); 
		serializeIp65504P1006MemdataL(ip65504P1006MemdataL);
	}

	public void setIp65504P1006MemdataL(int number) {
	    number = checkIp65504P1006MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1006MemdataL((short)number);
	}
	public void setIp65504P1006MemdataL(long number) {
	    number = checkIp65504P1006MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1006MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1007MemdataS
	 *	@return ip65504P1007MemdataS
	 */
	public short getIp65504P1007MemdataS() throws CFException {
        if (isIp65504P1007MemdataSModified()) { 
           ip65504P1007MemdataS = refreshIp65504P1007MemdataS();
        }
   		return ip65504P1007MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1007MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1007-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1007MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1007MemdataS = checkIp65504P1007MemdataSMaxLimit(number); 
		serializeIp65504P1007MemdataS(ip65504P1007MemdataS);
	}

	public void setIp65504P1007MemdataS(int number) {
	    number = checkIp65504P1007MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1007MemdataS((short)number);
	}
	public void setIp65504P1007MemdataS(long number) {
	    number = checkIp65504P1007MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1007MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1007MemdataL
	 *	@return ip65504P1007MemdataL
	 */
	public short getIp65504P1007MemdataL() throws CFException {
        if (isIp65504P1007MemdataLModified()) { 
           ip65504P1007MemdataL = refreshIp65504P1007MemdataL();
        }
   		return ip65504P1007MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1007MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1007-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1007MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1007MemdataL = checkIp65504P1007MemdataLMaxLimit(number); 
		serializeIp65504P1007MemdataL(ip65504P1007MemdataL);
	}

	public void setIp65504P1007MemdataL(int number) {
	    number = checkIp65504P1007MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1007MemdataL((short)number);
	}
	public void setIp65504P1007MemdataL(long number) {
	    number = checkIp65504P1007MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1007MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1008MemdataS
	 *	@return ip65504P1008MemdataS
	 */
	public short getIp65504P1008MemdataS() throws CFException {
        if (isIp65504P1008MemdataSModified()) { 
           ip65504P1008MemdataS = refreshIp65504P1008MemdataS();
        }
   		return ip65504P1008MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1008MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1008-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1008MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1008MemdataS = checkIp65504P1008MemdataSMaxLimit(number); 
		serializeIp65504P1008MemdataS(ip65504P1008MemdataS);
	}

	public void setIp65504P1008MemdataS(int number) {
	    number = checkIp65504P1008MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1008MemdataS((short)number);
	}
	public void setIp65504P1008MemdataS(long number) {
	    number = checkIp65504P1008MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1008MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1008MemdataL
	 *	@return ip65504P1008MemdataL
	 */
	public short getIp65504P1008MemdataL() throws CFException {
        if (isIp65504P1008MemdataLModified()) { 
           ip65504P1008MemdataL = refreshIp65504P1008MemdataL();
        }
   		return ip65504P1008MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1008MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1008-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1008MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1008MemdataL = checkIp65504P1008MemdataLMaxLimit(number); 
		serializeIp65504P1008MemdataL(ip65504P1008MemdataL);
	}

	public void setIp65504P1008MemdataL(int number) {
	    number = checkIp65504P1008MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1008MemdataL((short)number);
	}
	public void setIp65504P1008MemdataL(long number) {
	    number = checkIp65504P1008MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1008MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1009MemdataS
	 *	@return ip65504P1009MemdataS
	 */
	public short getIp65504P1009MemdataS() throws CFException {
        if (isIp65504P1009MemdataSModified()) { 
           ip65504P1009MemdataS = refreshIp65504P1009MemdataS();
        }
   		return ip65504P1009MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1009MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1009-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1009MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1009MemdataS = checkIp65504P1009MemdataSMaxLimit(number); 
		serializeIp65504P1009MemdataS(ip65504P1009MemdataS);
	}

	public void setIp65504P1009MemdataS(int number) {
	    number = checkIp65504P1009MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1009MemdataS((short)number);
	}
	public void setIp65504P1009MemdataS(long number) {
	    number = checkIp65504P1009MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1009MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1009MemdataL
	 *	@return ip65504P1009MemdataL
	 */
	public short getIp65504P1009MemdataL() throws CFException {
        if (isIp65504P1009MemdataLModified()) { 
           ip65504P1009MemdataL = refreshIp65504P1009MemdataL();
        }
   		return ip65504P1009MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1009MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1009-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1009MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1009MemdataL = checkIp65504P1009MemdataLMaxLimit(number); 
		serializeIp65504P1009MemdataL(ip65504P1009MemdataL);
	}

	public void setIp65504P1009MemdataL(int number) {
	    number = checkIp65504P1009MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1009MemdataL((short)number);
	}
	public void setIp65504P1009MemdataL(long number) {
	    number = checkIp65504P1009MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1009MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1010MemdataS
	 *	@return ip65504P1010MemdataS
	 */
	public short getIp65504P1010MemdataS() throws CFException {
        if (isIp65504P1010MemdataSModified()) { 
           ip65504P1010MemdataS = refreshIp65504P1010MemdataS();
        }
   		return ip65504P1010MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1010MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1010-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1010MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1010MemdataS = checkIp65504P1010MemdataSMaxLimit(number); 
		serializeIp65504P1010MemdataS(ip65504P1010MemdataS);
	}

	public void setIp65504P1010MemdataS(int number) {
	    number = checkIp65504P1010MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1010MemdataS((short)number);
	}
	public void setIp65504P1010MemdataS(long number) {
	    number = checkIp65504P1010MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1010MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1010MemdataL
	 *	@return ip65504P1010MemdataL
	 */
	public short getIp65504P1010MemdataL() throws CFException {
        if (isIp65504P1010MemdataLModified()) { 
           ip65504P1010MemdataL = refreshIp65504P1010MemdataL();
        }
   		return ip65504P1010MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1010MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1010-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1010MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1010MemdataL = checkIp65504P1010MemdataLMaxLimit(number); 
		serializeIp65504P1010MemdataL(ip65504P1010MemdataL);
	}

	public void setIp65504P1010MemdataL(int number) {
	    number = checkIp65504P1010MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1010MemdataL((short)number);
	}
	public void setIp65504P1010MemdataL(long number) {
	    number = checkIp65504P1010MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1010MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1011MemdataS
	 *	@return ip65504P1011MemdataS
	 */
	public short getIp65504P1011MemdataS() throws CFException {
        if (isIp65504P1011MemdataSModified()) { 
           ip65504P1011MemdataS = refreshIp65504P1011MemdataS();
        }
   		return ip65504P1011MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1011MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1011-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1011MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1011MemdataS = checkIp65504P1011MemdataSMaxLimit(number); 
		serializeIp65504P1011MemdataS(ip65504P1011MemdataS);
	}

	public void setIp65504P1011MemdataS(int number) {
	    number = checkIp65504P1011MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1011MemdataS((short)number);
	}
	public void setIp65504P1011MemdataS(long number) {
	    number = checkIp65504P1011MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1011MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1011MemdataL
	 *	@return ip65504P1011MemdataL
	 */
	public short getIp65504P1011MemdataL() throws CFException {
        if (isIp65504P1011MemdataLModified()) { 
           ip65504P1011MemdataL = refreshIp65504P1011MemdataL();
        }
   		return ip65504P1011MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1011MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1011-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1011MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1011MemdataL = checkIp65504P1011MemdataLMaxLimit(number); 
		serializeIp65504P1011MemdataL(ip65504P1011MemdataL);
	}

	public void setIp65504P1011MemdataL(int number) {
	    number = checkIp65504P1011MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1011MemdataL((short)number);
	}
	public void setIp65504P1011MemdataL(long number) {
	    number = checkIp65504P1011MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1011MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1012MemdataS
	 *	@return ip65504P1012MemdataS
	 */
	public short getIp65504P1012MemdataS() throws CFException {
        if (isIp65504P1012MemdataSModified()) { 
           ip65504P1012MemdataS = refreshIp65504P1012MemdataS();
        }
   		return ip65504P1012MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1012MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1012-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1012MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1012MemdataS = checkIp65504P1012MemdataSMaxLimit(number); 
		serializeIp65504P1012MemdataS(ip65504P1012MemdataS);
	}

	public void setIp65504P1012MemdataS(int number) {
	    number = checkIp65504P1012MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1012MemdataS((short)number);
	}
	public void setIp65504P1012MemdataS(long number) {
	    number = checkIp65504P1012MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1012MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1012MemdataL
	 *	@return ip65504P1012MemdataL
	 */
	public short getIp65504P1012MemdataL() throws CFException {
        if (isIp65504P1012MemdataLModified()) { 
           ip65504P1012MemdataL = refreshIp65504P1012MemdataL();
        }
   		return ip65504P1012MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1012MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1012-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1012MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1012MemdataL = checkIp65504P1012MemdataLMaxLimit(number); 
		serializeIp65504P1012MemdataL(ip65504P1012MemdataL);
	}

	public void setIp65504P1012MemdataL(int number) {
	    number = checkIp65504P1012MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1012MemdataL((short)number);
	}
	public void setIp65504P1012MemdataL(long number) {
	    number = checkIp65504P1012MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1012MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1013MemdataS
	 *	@return ip65504P1013MemdataS
	 */
	public short getIp65504P1013MemdataS() throws CFException {
        if (isIp65504P1013MemdataSModified()) { 
           ip65504P1013MemdataS = refreshIp65504P1013MemdataS();
        }
   		return ip65504P1013MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1013MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1013-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1013MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1013MemdataS = checkIp65504P1013MemdataSMaxLimit(number); 
		serializeIp65504P1013MemdataS(ip65504P1013MemdataS);
	}

	public void setIp65504P1013MemdataS(int number) {
	    number = checkIp65504P1013MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1013MemdataS((short)number);
	}
	public void setIp65504P1013MemdataS(long number) {
	    number = checkIp65504P1013MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1013MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1013MemdataL
	 *	@return ip65504P1013MemdataL
	 */
	public short getIp65504P1013MemdataL() throws CFException {
        if (isIp65504P1013MemdataLModified()) { 
           ip65504P1013MemdataL = refreshIp65504P1013MemdataL();
        }
   		return ip65504P1013MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1013MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1013-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1013MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1013MemdataL = checkIp65504P1013MemdataLMaxLimit(number); 
		serializeIp65504P1013MemdataL(ip65504P1013MemdataL);
	}

	public void setIp65504P1013MemdataL(int number) {
	    number = checkIp65504P1013MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1013MemdataL((short)number);
	}
	public void setIp65504P1013MemdataL(long number) {
	    number = checkIp65504P1013MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1013MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1014MemdataS
	 *	@return ip65504P1014MemdataS
	 */
	public short getIp65504P1014MemdataS() throws CFException {
        if (isIp65504P1014MemdataSModified()) { 
           ip65504P1014MemdataS = refreshIp65504P1014MemdataS();
        }
   		return ip65504P1014MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1014MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1014-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1014MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1014MemdataS = checkIp65504P1014MemdataSMaxLimit(number); 
		serializeIp65504P1014MemdataS(ip65504P1014MemdataS);
	}

	public void setIp65504P1014MemdataS(int number) {
	    number = checkIp65504P1014MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1014MemdataS((short)number);
	}
	public void setIp65504P1014MemdataS(long number) {
	    number = checkIp65504P1014MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1014MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1014MemdataL
	 *	@return ip65504P1014MemdataL
	 */
	public short getIp65504P1014MemdataL() throws CFException {
        if (isIp65504P1014MemdataLModified()) { 
           ip65504P1014MemdataL = refreshIp65504P1014MemdataL();
        }
   		return ip65504P1014MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1014MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1014-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1014MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1014MemdataL = checkIp65504P1014MemdataLMaxLimit(number); 
		serializeIp65504P1014MemdataL(ip65504P1014MemdataL);
	}

	public void setIp65504P1014MemdataL(int number) {
	    number = checkIp65504P1014MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1014MemdataL((short)number);
	}
	public void setIp65504P1014MemdataL(long number) {
	    number = checkIp65504P1014MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1014MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1015MemdataS
	 *	@return ip65504P1015MemdataS
	 */
	public short getIp65504P1015MemdataS() throws CFException {
        if (isIp65504P1015MemdataSModified()) { 
           ip65504P1015MemdataS = refreshIp65504P1015MemdataS();
        }
   		return ip65504P1015MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1015MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1015-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1015MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1015MemdataS = checkIp65504P1015MemdataSMaxLimit(number); 
		serializeIp65504P1015MemdataS(ip65504P1015MemdataS);
	}

	public void setIp65504P1015MemdataS(int number) {
	    number = checkIp65504P1015MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1015MemdataS((short)number);
	}
	public void setIp65504P1015MemdataS(long number) {
	    number = checkIp65504P1015MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1015MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1015MemdataL
	 *	@return ip65504P1015MemdataL
	 */
	public short getIp65504P1015MemdataL() throws CFException {
        if (isIp65504P1015MemdataLModified()) { 
           ip65504P1015MemdataL = refreshIp65504P1015MemdataL();
        }
   		return ip65504P1015MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1015MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1015-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1015MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1015MemdataL = checkIp65504P1015MemdataLMaxLimit(number); 
		serializeIp65504P1015MemdataL(ip65504P1015MemdataL);
	}

	public void setIp65504P1015MemdataL(int number) {
	    number = checkIp65504P1015MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1015MemdataL((short)number);
	}
	public void setIp65504P1015MemdataL(long number) {
	    number = checkIp65504P1015MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1015MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1016MemdataS
	 *	@return ip65504P1016MemdataS
	 */
	public short getIp65504P1016MemdataS() throws CFException {
        if (isIp65504P1016MemdataSModified()) { 
           ip65504P1016MemdataS = refreshIp65504P1016MemdataS();
        }
   		return ip65504P1016MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1016MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1016-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1016MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1016MemdataS = checkIp65504P1016MemdataSMaxLimit(number); 
		serializeIp65504P1016MemdataS(ip65504P1016MemdataS);
	}

	public void setIp65504P1016MemdataS(int number) {
	    number = checkIp65504P1016MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1016MemdataS((short)number);
	}
	public void setIp65504P1016MemdataS(long number) {
	    number = checkIp65504P1016MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1016MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1016MemdataL
	 *	@return ip65504P1016MemdataL
	 */
	public short getIp65504P1016MemdataL() throws CFException {
        if (isIp65504P1016MemdataLModified()) { 
           ip65504P1016MemdataL = refreshIp65504P1016MemdataL();
        }
   		return ip65504P1016MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1016MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1016-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1016MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1016MemdataL = checkIp65504P1016MemdataLMaxLimit(number); 
		serializeIp65504P1016MemdataL(ip65504P1016MemdataL);
	}

	public void setIp65504P1016MemdataL(int number) {
	    number = checkIp65504P1016MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1016MemdataL((short)number);
	}
	public void setIp65504P1016MemdataL(long number) {
	    number = checkIp65504P1016MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1016MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1017MemdataS
	 *	@return ip65504P1017MemdataS
	 */
	public short getIp65504P1017MemdataS() throws CFException {
        if (isIp65504P1017MemdataSModified()) { 
           ip65504P1017MemdataS = refreshIp65504P1017MemdataS();
        }
   		return ip65504P1017MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1017MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1017-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1017MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1017MemdataS = checkIp65504P1017MemdataSMaxLimit(number); 
		serializeIp65504P1017MemdataS(ip65504P1017MemdataS);
	}

	public void setIp65504P1017MemdataS(int number) {
	    number = checkIp65504P1017MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1017MemdataS((short)number);
	}
	public void setIp65504P1017MemdataS(long number) {
	    number = checkIp65504P1017MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1017MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1017MemdataL
	 *	@return ip65504P1017MemdataL
	 */
	public short getIp65504P1017MemdataL() throws CFException {
        if (isIp65504P1017MemdataLModified()) { 
           ip65504P1017MemdataL = refreshIp65504P1017MemdataL();
        }
   		return ip65504P1017MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1017MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1017-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1017MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1017MemdataL = checkIp65504P1017MemdataLMaxLimit(number); 
		serializeIp65504P1017MemdataL(ip65504P1017MemdataL);
	}

	public void setIp65504P1017MemdataL(int number) {
	    number = checkIp65504P1017MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1017MemdataL((short)number);
	}
	public void setIp65504P1017MemdataL(long number) {
	    number = checkIp65504P1017MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1017MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1018MemdataS
	 *	@return ip65504P1018MemdataS
	 */
	public short getIp65504P1018MemdataS() throws CFException {
        if (isIp65504P1018MemdataSModified()) { 
           ip65504P1018MemdataS = refreshIp65504P1018MemdataS();
        }
   		return ip65504P1018MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1018MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1018-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1018MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1018MemdataS = checkIp65504P1018MemdataSMaxLimit(number); 
		serializeIp65504P1018MemdataS(ip65504P1018MemdataS);
	}

	public void setIp65504P1018MemdataS(int number) {
	    number = checkIp65504P1018MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1018MemdataS((short)number);
	}
	public void setIp65504P1018MemdataS(long number) {
	    number = checkIp65504P1018MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1018MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1018MemdataL
	 *	@return ip65504P1018MemdataL
	 */
	public short getIp65504P1018MemdataL() throws CFException {
        if (isIp65504P1018MemdataLModified()) { 
           ip65504P1018MemdataL = refreshIp65504P1018MemdataL();
        }
   		return ip65504P1018MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1018MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1018-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1018MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1018MemdataL = checkIp65504P1018MemdataLMaxLimit(number); 
		serializeIp65504P1018MemdataL(ip65504P1018MemdataL);
	}

	public void setIp65504P1018MemdataL(int number) {
	    number = checkIp65504P1018MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1018MemdataL((short)number);
	}
	public void setIp65504P1018MemdataL(long number) {
	    number = checkIp65504P1018MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1018MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1019MemdataS
	 *	@return ip65504P1019MemdataS
	 */
	public short getIp65504P1019MemdataS() throws CFException {
        if (isIp65504P1019MemdataSModified()) { 
           ip65504P1019MemdataS = refreshIp65504P1019MemdataS();
        }
   		return ip65504P1019MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1019MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1019-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1019MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1019MemdataS = checkIp65504P1019MemdataSMaxLimit(number); 
		serializeIp65504P1019MemdataS(ip65504P1019MemdataS);
	}

	public void setIp65504P1019MemdataS(int number) {
	    number = checkIp65504P1019MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1019MemdataS((short)number);
	}
	public void setIp65504P1019MemdataS(long number) {
	    number = checkIp65504P1019MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1019MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1019MemdataL
	 *	@return ip65504P1019MemdataL
	 */
	public short getIp65504P1019MemdataL() throws CFException {
        if (isIp65504P1019MemdataLModified()) { 
           ip65504P1019MemdataL = refreshIp65504P1019MemdataL();
        }
   		return ip65504P1019MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1019MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1019-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1019MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1019MemdataL = checkIp65504P1019MemdataLMaxLimit(number); 
		serializeIp65504P1019MemdataL(ip65504P1019MemdataL);
	}

	public void setIp65504P1019MemdataL(int number) {
	    number = checkIp65504P1019MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1019MemdataL((short)number);
	}
	public void setIp65504P1019MemdataL(long number) {
	    number = checkIp65504P1019MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1019MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1020MemdataS
	 *	@return ip65504P1020MemdataS
	 */
	public short getIp65504P1020MemdataS() throws CFException {
        if (isIp65504P1020MemdataSModified()) { 
           ip65504P1020MemdataS = refreshIp65504P1020MemdataS();
        }
   		return ip65504P1020MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1020MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1020-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1020MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1020MemdataS = checkIp65504P1020MemdataSMaxLimit(number); 
		serializeIp65504P1020MemdataS(ip65504P1020MemdataS);
	}

	public void setIp65504P1020MemdataS(int number) {
	    number = checkIp65504P1020MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1020MemdataS((short)number);
	}
	public void setIp65504P1020MemdataS(long number) {
	    number = checkIp65504P1020MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1020MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1020MemdataL
	 *	@return ip65504P1020MemdataL
	 */
	public short getIp65504P1020MemdataL() throws CFException {
        if (isIp65504P1020MemdataLModified()) { 
           ip65504P1020MemdataL = refreshIp65504P1020MemdataL();
        }
   		return ip65504P1020MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1020MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1020-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1020MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1020MemdataL = checkIp65504P1020MemdataLMaxLimit(number); 
		serializeIp65504P1020MemdataL(ip65504P1020MemdataL);
	}

	public void setIp65504P1020MemdataL(int number) {
	    number = checkIp65504P1020MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1020MemdataL((short)number);
	}
	public void setIp65504P1020MemdataL(long number) {
	    number = checkIp65504P1020MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1020MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1021MemdataS
	 *	@return ip65504P1021MemdataS
	 */
	public short getIp65504P1021MemdataS() throws CFException {
        if (isIp65504P1021MemdataSModified()) { 
           ip65504P1021MemdataS = refreshIp65504P1021MemdataS();
        }
   		return ip65504P1021MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1021MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1021-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1021MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1021MemdataS = checkIp65504P1021MemdataSMaxLimit(number); 
		serializeIp65504P1021MemdataS(ip65504P1021MemdataS);
	}

	public void setIp65504P1021MemdataS(int number) {
	    number = checkIp65504P1021MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1021MemdataS((short)number);
	}
	public void setIp65504P1021MemdataS(long number) {
	    number = checkIp65504P1021MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1021MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1021MemdataL
	 *	@return ip65504P1021MemdataL
	 */
	public short getIp65504P1021MemdataL() throws CFException {
        if (isIp65504P1021MemdataLModified()) { 
           ip65504P1021MemdataL = refreshIp65504P1021MemdataL();
        }
   		return ip65504P1021MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1021MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1021-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1021MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1021MemdataL = checkIp65504P1021MemdataLMaxLimit(number); 
		serializeIp65504P1021MemdataL(ip65504P1021MemdataL);
	}

	public void setIp65504P1021MemdataL(int number) {
	    number = checkIp65504P1021MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1021MemdataL((short)number);
	}
	public void setIp65504P1021MemdataL(long number) {
	    number = checkIp65504P1021MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1021MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1022MemdataS
	 *	@return ip65504P1022MemdataS
	 */
	public short getIp65504P1022MemdataS() throws CFException {
        if (isIp65504P1022MemdataSModified()) { 
           ip65504P1022MemdataS = refreshIp65504P1022MemdataS();
        }
   		return ip65504P1022MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1022MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1022-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1022MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1022MemdataS = checkIp65504P1022MemdataSMaxLimit(number); 
		serializeIp65504P1022MemdataS(ip65504P1022MemdataS);
	}

	public void setIp65504P1022MemdataS(int number) {
	    number = checkIp65504P1022MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1022MemdataS((short)number);
	}
	public void setIp65504P1022MemdataS(long number) {
	    number = checkIp65504P1022MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1022MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1022MemdataL
	 *	@return ip65504P1022MemdataL
	 */
	public short getIp65504P1022MemdataL() throws CFException {
        if (isIp65504P1022MemdataLModified()) { 
           ip65504P1022MemdataL = refreshIp65504P1022MemdataL();
        }
   		return ip65504P1022MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1022MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1022-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1022MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1022MemdataL = checkIp65504P1022MemdataLMaxLimit(number); 
		serializeIp65504P1022MemdataL(ip65504P1022MemdataL);
	}

	public void setIp65504P1022MemdataL(int number) {
	    number = checkIp65504P1022MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1022MemdataL((short)number);
	}
	public void setIp65504P1022MemdataL(long number) {
	    number = checkIp65504P1022MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1022MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1023MemdataS
	 *	@return ip65504P1023MemdataS
	 */
	public short getIp65504P1023MemdataS() throws CFException {
        if (isIp65504P1023MemdataSModified()) { 
           ip65504P1023MemdataS = refreshIp65504P1023MemdataS();
        }
   		return ip65504P1023MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1023MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1023-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1023MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1023MemdataS = checkIp65504P1023MemdataSMaxLimit(number); 
		serializeIp65504P1023MemdataS(ip65504P1023MemdataS);
	}

	public void setIp65504P1023MemdataS(int number) {
	    number = checkIp65504P1023MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1023MemdataS((short)number);
	}
	public void setIp65504P1023MemdataS(long number) {
	    number = checkIp65504P1023MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1023MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1023MemdataL
	 *	@return ip65504P1023MemdataL
	 */
	public short getIp65504P1023MemdataL() throws CFException {
        if (isIp65504P1023MemdataLModified()) { 
           ip65504P1023MemdataL = refreshIp65504P1023MemdataL();
        }
   		return ip65504P1023MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1023MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1023-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1023MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1023MemdataL = checkIp65504P1023MemdataLMaxLimit(number); 
		serializeIp65504P1023MemdataL(ip65504P1023MemdataL);
	}

	public void setIp65504P1023MemdataL(int number) {
	    number = checkIp65504P1023MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1023MemdataL((short)number);
	}
	public void setIp65504P1023MemdataL(long number) {
	    number = checkIp65504P1023MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1023MemdataL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup33
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P993ReservdS((short)0);
         	setIp65504P993ReservdL((short)0);
         	setIp65504P994ReservdS((short)0);
         	setIp65504P994ReservdL((short)0);
         	setIp65504P995ReservdS((short)0);
         	setIp65504P995ReservdL((short)0);
         	setIp65504P996ReservdS((short)0);
         	setIp65504P996ReservdL((short)0);
         	setIp65504P997ReservdS((short)0);
         	setIp65504P997ReservdL((short)0);
         	setIp65504P998ReservdS((short)0);
         	setIp65504P998ReservdL((short)0);
         	setIp65504P999ReservdS((short)0);
         	setIp65504P999ReservdL((short)0);
         	setIp65504P1000MemdataS((short)0);
         	setIp65504P1000MemdataL((short)0);
         	setIp65504P1001MemdataS((short)0);
         	setIp65504P1001MemdataL((short)0);
         	setIp65504P1002MemdataS((short)0);
         	setIp65504P1002MemdataL((short)0);
         	setIp65504P1003MemdataS((short)0);
         	setIp65504P1003MemdataL((short)0);
         	setIp65504P1004MemdataS((short)0);
         	setIp65504P1004MemdataL((short)0);
         	setIp65504P1005MemdataS((short)0);
         	setIp65504P1005MemdataL((short)0);
         	setIp65504P1006MemdataS((short)0);
         	setIp65504P1006MemdataL((short)0);
         	setIp65504P1007MemdataS((short)0);
         	setIp65504P1007MemdataL((short)0);
         	setIp65504P1008MemdataS((short)0);
         	setIp65504P1008MemdataL((short)0);
         	setIp65504P1009MemdataS((short)0);
         	setIp65504P1009MemdataL((short)0);
         	setIp65504P1010MemdataS((short)0);
         	setIp65504P1010MemdataL((short)0);
         	setIp65504P1011MemdataS((short)0);
         	setIp65504P1011MemdataL((short)0);
         	setIp65504P1012MemdataS((short)0);
         	setIp65504P1012MemdataL((short)0);
         	setIp65504P1013MemdataS((short)0);
         	setIp65504P1013MemdataL((short)0);
         	setIp65504P1014MemdataS((short)0);
         	setIp65504P1014MemdataL((short)0);
         	setIp65504P1015MemdataS((short)0);
         	setIp65504P1015MemdataL((short)0);
         	setIp65504P1016MemdataS((short)0);
         	setIp65504P1016MemdataL((short)0);
         	setIp65504P1017MemdataS((short)0);
         	setIp65504P1017MemdataL((short)0);
         	setIp65504P1018MemdataS((short)0);
         	setIp65504P1018MemdataL((short)0);
         	setIp65504P1019MemdataS((short)0);
         	setIp65504P1019MemdataL((short)0);
         	setIp65504P1020MemdataS((short)0);
         	setIp65504P1020MemdataL((short)0);
         	setIp65504P1021MemdataS((short)0);
         	setIp65504P1021MemdataL((short)0);
         	setIp65504P1022MemdataS((short)0);
         	setIp65504P1022MemdataL((short)0);
         	setIp65504P1023MemdataS((short)0);
         	setIp65504P1023MemdataL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup33FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_33_LENGTH;
		}

}
  
