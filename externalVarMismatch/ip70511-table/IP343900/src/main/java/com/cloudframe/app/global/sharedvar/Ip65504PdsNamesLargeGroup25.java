package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup25 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup25 extends Ip65504PdsNamesLargeGroup25Serialized { 
   

								private short ip65504P745ReservdS;

								private short ip65504P745ReservdL;


								private short ip65504P746ReservdS;

								private short ip65504P746ReservdL;


								private short ip65504P747ReservdS;

								private short ip65504P747ReservdL;


								private short ip65504P748ReservdS;

								private short ip65504P748ReservdL;


								private short ip65504P749ReservdS;

								private short ip65504P749ReservdL;


								private short ip65504P750ReservdS;

								private short ip65504P750ReservdL;


								private short ip65504P751ReservdS;

								private short ip65504P751ReservdL;


								private short ip65504P752ReservdS;

								private short ip65504P752ReservdL;


								private short ip65504P753ReservdS;

								private short ip65504P753ReservdL;


								private short ip65504P754ReservdS;

								private short ip65504P754ReservdL;


								private short ip65504P755ReservdS;

								private short ip65504P755ReservdL;


								private short ip65504P756ReservdS;

								private short ip65504P756ReservdL;


								private short ip65504P757ReservdS;

								private short ip65504P757ReservdL;


								private short ip65504P758ReservdS;

								private short ip65504P758ReservdL;


								private short ip65504P759ReservdS;

								private short ip65504P759ReservdL;


								private short ip65504P760ReservdS;

								private short ip65504P760ReservdL;


								private short ip65504P761ReservdS;

								private short ip65504P761ReservdL;


								private short ip65504P762ReservdS;

								private short ip65504P762ReservdL;


								private short ip65504P763ReservdS;

								private short ip65504P763ReservdL;


								private short ip65504P764ReservdS;

								private short ip65504P764ReservdL;


								private short ip65504P765ReservdS;

								private short ip65504P765ReservdL;


								private short ip65504P766ReservdS;

								private short ip65504P766ReservdL;


								private short ip65504P767ReservdS;

								private short ip65504P767ReservdL;


								private short ip65504P768ReservdS;

								private short ip65504P768ReservdL;


								private short ip65504P769ReservdS;

								private short ip65504P769ReservdL;


								private short ip65504P770ReservdS;

								private short ip65504P770ReservdL;


								private short ip65504P771ReservdS;

								private short ip65504P771ReservdL;


								private short ip65504P772ReservdS;

								private short ip65504P772ReservdL;


								private short ip65504P773ReservdS;

								private short ip65504P773ReservdL;


								private short ip65504P774ReservdS;

								private short ip65504P774ReservdL;


								private short ip65504P775ReservdS;

								private short ip65504P775ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup25
	**/
    public Ip65504PdsNamesLargeGroup25() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup25. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup25(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P745ReservdS
	 *	@return ip65504P745ReservdS
	 */
	public short getIp65504P745ReservdS() throws CFException {
        if (isIp65504P745ReservdSModified()) { 
           ip65504P745ReservdS = refreshIp65504P745ReservdS();
        }
   		return ip65504P745ReservdS;
	}
	
	/**
	 * 	Update Ip65504P745ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P745-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P745ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P745ReservdS = checkIp65504P745ReservdSMaxLimit(number); 
		serializeIp65504P745ReservdS(ip65504P745ReservdS);
	}

	public void setIp65504P745ReservdS(int number) {
	    number = checkIp65504P745ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P745ReservdS((short)number);
	}
	public void setIp65504P745ReservdS(long number) {
	    number = checkIp65504P745ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P745ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P745ReservdL
	 *	@return ip65504P745ReservdL
	 */
	public short getIp65504P745ReservdL() throws CFException {
        if (isIp65504P745ReservdLModified()) { 
           ip65504P745ReservdL = refreshIp65504P745ReservdL();
        }
   		return ip65504P745ReservdL;
	}
	
	/**
	 * 	Update Ip65504P745ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P745-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P745ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P745ReservdL = checkIp65504P745ReservdLMaxLimit(number); 
		serializeIp65504P745ReservdL(ip65504P745ReservdL);
	}

	public void setIp65504P745ReservdL(int number) {
	    number = checkIp65504P745ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P745ReservdL((short)number);
	}
	public void setIp65504P745ReservdL(long number) {
	    number = checkIp65504P745ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P745ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P746ReservdS
	 *	@return ip65504P746ReservdS
	 */
	public short getIp65504P746ReservdS() throws CFException {
        if (isIp65504P746ReservdSModified()) { 
           ip65504P746ReservdS = refreshIp65504P746ReservdS();
        }
   		return ip65504P746ReservdS;
	}
	
	/**
	 * 	Update Ip65504P746ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P746-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P746ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P746ReservdS = checkIp65504P746ReservdSMaxLimit(number); 
		serializeIp65504P746ReservdS(ip65504P746ReservdS);
	}

	public void setIp65504P746ReservdS(int number) {
	    number = checkIp65504P746ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P746ReservdS((short)number);
	}
	public void setIp65504P746ReservdS(long number) {
	    number = checkIp65504P746ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P746ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P746ReservdL
	 *	@return ip65504P746ReservdL
	 */
	public short getIp65504P746ReservdL() throws CFException {
        if (isIp65504P746ReservdLModified()) { 
           ip65504P746ReservdL = refreshIp65504P746ReservdL();
        }
   		return ip65504P746ReservdL;
	}
	
	/**
	 * 	Update Ip65504P746ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P746-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P746ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P746ReservdL = checkIp65504P746ReservdLMaxLimit(number); 
		serializeIp65504P746ReservdL(ip65504P746ReservdL);
	}

	public void setIp65504P746ReservdL(int number) {
	    number = checkIp65504P746ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P746ReservdL((short)number);
	}
	public void setIp65504P746ReservdL(long number) {
	    number = checkIp65504P746ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P746ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P747ReservdS
	 *	@return ip65504P747ReservdS
	 */
	public short getIp65504P747ReservdS() throws CFException {
        if (isIp65504P747ReservdSModified()) { 
           ip65504P747ReservdS = refreshIp65504P747ReservdS();
        }
   		return ip65504P747ReservdS;
	}
	
	/**
	 * 	Update Ip65504P747ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P747-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P747ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P747ReservdS = checkIp65504P747ReservdSMaxLimit(number); 
		serializeIp65504P747ReservdS(ip65504P747ReservdS);
	}

	public void setIp65504P747ReservdS(int number) {
	    number = checkIp65504P747ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P747ReservdS((short)number);
	}
	public void setIp65504P747ReservdS(long number) {
	    number = checkIp65504P747ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P747ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P747ReservdL
	 *	@return ip65504P747ReservdL
	 */
	public short getIp65504P747ReservdL() throws CFException {
        if (isIp65504P747ReservdLModified()) { 
           ip65504P747ReservdL = refreshIp65504P747ReservdL();
        }
   		return ip65504P747ReservdL;
	}
	
	/**
	 * 	Update Ip65504P747ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P747-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P747ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P747ReservdL = checkIp65504P747ReservdLMaxLimit(number); 
		serializeIp65504P747ReservdL(ip65504P747ReservdL);
	}

	public void setIp65504P747ReservdL(int number) {
	    number = checkIp65504P747ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P747ReservdL((short)number);
	}
	public void setIp65504P747ReservdL(long number) {
	    number = checkIp65504P747ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P747ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P748ReservdS
	 *	@return ip65504P748ReservdS
	 */
	public short getIp65504P748ReservdS() throws CFException {
        if (isIp65504P748ReservdSModified()) { 
           ip65504P748ReservdS = refreshIp65504P748ReservdS();
        }
   		return ip65504P748ReservdS;
	}
	
	/**
	 * 	Update Ip65504P748ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P748-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P748ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P748ReservdS = checkIp65504P748ReservdSMaxLimit(number); 
		serializeIp65504P748ReservdS(ip65504P748ReservdS);
	}

	public void setIp65504P748ReservdS(int number) {
	    number = checkIp65504P748ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P748ReservdS((short)number);
	}
	public void setIp65504P748ReservdS(long number) {
	    number = checkIp65504P748ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P748ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P748ReservdL
	 *	@return ip65504P748ReservdL
	 */
	public short getIp65504P748ReservdL() throws CFException {
        if (isIp65504P748ReservdLModified()) { 
           ip65504P748ReservdL = refreshIp65504P748ReservdL();
        }
   		return ip65504P748ReservdL;
	}
	
	/**
	 * 	Update Ip65504P748ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P748-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P748ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P748ReservdL = checkIp65504P748ReservdLMaxLimit(number); 
		serializeIp65504P748ReservdL(ip65504P748ReservdL);
	}

	public void setIp65504P748ReservdL(int number) {
	    number = checkIp65504P748ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P748ReservdL((short)number);
	}
	public void setIp65504P748ReservdL(long number) {
	    number = checkIp65504P748ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P748ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P749ReservdS
	 *	@return ip65504P749ReservdS
	 */
	public short getIp65504P749ReservdS() throws CFException {
        if (isIp65504P749ReservdSModified()) { 
           ip65504P749ReservdS = refreshIp65504P749ReservdS();
        }
   		return ip65504P749ReservdS;
	}
	
	/**
	 * 	Update Ip65504P749ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P749-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P749ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P749ReservdS = checkIp65504P749ReservdSMaxLimit(number); 
		serializeIp65504P749ReservdS(ip65504P749ReservdS);
	}

	public void setIp65504P749ReservdS(int number) {
	    number = checkIp65504P749ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P749ReservdS((short)number);
	}
	public void setIp65504P749ReservdS(long number) {
	    number = checkIp65504P749ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P749ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P749ReservdL
	 *	@return ip65504P749ReservdL
	 */
	public short getIp65504P749ReservdL() throws CFException {
        if (isIp65504P749ReservdLModified()) { 
           ip65504P749ReservdL = refreshIp65504P749ReservdL();
        }
   		return ip65504P749ReservdL;
	}
	
	/**
	 * 	Update Ip65504P749ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P749-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P749ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P749ReservdL = checkIp65504P749ReservdLMaxLimit(number); 
		serializeIp65504P749ReservdL(ip65504P749ReservdL);
	}

	public void setIp65504P749ReservdL(int number) {
	    number = checkIp65504P749ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P749ReservdL((short)number);
	}
	public void setIp65504P749ReservdL(long number) {
	    number = checkIp65504P749ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P749ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P750ReservdS
	 *	@return ip65504P750ReservdS
	 */
	public short getIp65504P750ReservdS() throws CFException {
        if (isIp65504P750ReservdSModified()) { 
           ip65504P750ReservdS = refreshIp65504P750ReservdS();
        }
   		return ip65504P750ReservdS;
	}
	
	/**
	 * 	Update Ip65504P750ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P750-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P750ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P750ReservdS = checkIp65504P750ReservdSMaxLimit(number); 
		serializeIp65504P750ReservdS(ip65504P750ReservdS);
	}

	public void setIp65504P750ReservdS(int number) {
	    number = checkIp65504P750ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P750ReservdS((short)number);
	}
	public void setIp65504P750ReservdS(long number) {
	    number = checkIp65504P750ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P750ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P750ReservdL
	 *	@return ip65504P750ReservdL
	 */
	public short getIp65504P750ReservdL() throws CFException {
        if (isIp65504P750ReservdLModified()) { 
           ip65504P750ReservdL = refreshIp65504P750ReservdL();
        }
   		return ip65504P750ReservdL;
	}
	
	/**
	 * 	Update Ip65504P750ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P750-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P750ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P750ReservdL = checkIp65504P750ReservdLMaxLimit(number); 
		serializeIp65504P750ReservdL(ip65504P750ReservdL);
	}

	public void setIp65504P750ReservdL(int number) {
	    number = checkIp65504P750ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P750ReservdL((short)number);
	}
	public void setIp65504P750ReservdL(long number) {
	    number = checkIp65504P750ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P750ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P751ReservdS
	 *	@return ip65504P751ReservdS
	 */
	public short getIp65504P751ReservdS() throws CFException {
        if (isIp65504P751ReservdSModified()) { 
           ip65504P751ReservdS = refreshIp65504P751ReservdS();
        }
   		return ip65504P751ReservdS;
	}
	
	/**
	 * 	Update Ip65504P751ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P751-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P751ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P751ReservdS = checkIp65504P751ReservdSMaxLimit(number); 
		serializeIp65504P751ReservdS(ip65504P751ReservdS);
	}

	public void setIp65504P751ReservdS(int number) {
	    number = checkIp65504P751ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P751ReservdS((short)number);
	}
	public void setIp65504P751ReservdS(long number) {
	    number = checkIp65504P751ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P751ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P751ReservdL
	 *	@return ip65504P751ReservdL
	 */
	public short getIp65504P751ReservdL() throws CFException {
        if (isIp65504P751ReservdLModified()) { 
           ip65504P751ReservdL = refreshIp65504P751ReservdL();
        }
   		return ip65504P751ReservdL;
	}
	
	/**
	 * 	Update Ip65504P751ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P751-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P751ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P751ReservdL = checkIp65504P751ReservdLMaxLimit(number); 
		serializeIp65504P751ReservdL(ip65504P751ReservdL);
	}

	public void setIp65504P751ReservdL(int number) {
	    number = checkIp65504P751ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P751ReservdL((short)number);
	}
	public void setIp65504P751ReservdL(long number) {
	    number = checkIp65504P751ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P751ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P752ReservdS
	 *	@return ip65504P752ReservdS
	 */
	public short getIp65504P752ReservdS() throws CFException {
        if (isIp65504P752ReservdSModified()) { 
           ip65504P752ReservdS = refreshIp65504P752ReservdS();
        }
   		return ip65504P752ReservdS;
	}
	
	/**
	 * 	Update Ip65504P752ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P752-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P752ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P752ReservdS = checkIp65504P752ReservdSMaxLimit(number); 
		serializeIp65504P752ReservdS(ip65504P752ReservdS);
	}

	public void setIp65504P752ReservdS(int number) {
	    number = checkIp65504P752ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P752ReservdS((short)number);
	}
	public void setIp65504P752ReservdS(long number) {
	    number = checkIp65504P752ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P752ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P752ReservdL
	 *	@return ip65504P752ReservdL
	 */
	public short getIp65504P752ReservdL() throws CFException {
        if (isIp65504P752ReservdLModified()) { 
           ip65504P752ReservdL = refreshIp65504P752ReservdL();
        }
   		return ip65504P752ReservdL;
	}
	
	/**
	 * 	Update Ip65504P752ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P752-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P752ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P752ReservdL = checkIp65504P752ReservdLMaxLimit(number); 
		serializeIp65504P752ReservdL(ip65504P752ReservdL);
	}

	public void setIp65504P752ReservdL(int number) {
	    number = checkIp65504P752ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P752ReservdL((short)number);
	}
	public void setIp65504P752ReservdL(long number) {
	    number = checkIp65504P752ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P752ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P753ReservdS
	 *	@return ip65504P753ReservdS
	 */
	public short getIp65504P753ReservdS() throws CFException {
        if (isIp65504P753ReservdSModified()) { 
           ip65504P753ReservdS = refreshIp65504P753ReservdS();
        }
   		return ip65504P753ReservdS;
	}
	
	/**
	 * 	Update Ip65504P753ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P753-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P753ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P753ReservdS = checkIp65504P753ReservdSMaxLimit(number); 
		serializeIp65504P753ReservdS(ip65504P753ReservdS);
	}

	public void setIp65504P753ReservdS(int number) {
	    number = checkIp65504P753ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P753ReservdS((short)number);
	}
	public void setIp65504P753ReservdS(long number) {
	    number = checkIp65504P753ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P753ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P753ReservdL
	 *	@return ip65504P753ReservdL
	 */
	public short getIp65504P753ReservdL() throws CFException {
        if (isIp65504P753ReservdLModified()) { 
           ip65504P753ReservdL = refreshIp65504P753ReservdL();
        }
   		return ip65504P753ReservdL;
	}
	
	/**
	 * 	Update Ip65504P753ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P753-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P753ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P753ReservdL = checkIp65504P753ReservdLMaxLimit(number); 
		serializeIp65504P753ReservdL(ip65504P753ReservdL);
	}

	public void setIp65504P753ReservdL(int number) {
	    number = checkIp65504P753ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P753ReservdL((short)number);
	}
	public void setIp65504P753ReservdL(long number) {
	    number = checkIp65504P753ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P753ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P754ReservdS
	 *	@return ip65504P754ReservdS
	 */
	public short getIp65504P754ReservdS() throws CFException {
        if (isIp65504P754ReservdSModified()) { 
           ip65504P754ReservdS = refreshIp65504P754ReservdS();
        }
   		return ip65504P754ReservdS;
	}
	
	/**
	 * 	Update Ip65504P754ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P754-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P754ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P754ReservdS = checkIp65504P754ReservdSMaxLimit(number); 
		serializeIp65504P754ReservdS(ip65504P754ReservdS);
	}

	public void setIp65504P754ReservdS(int number) {
	    number = checkIp65504P754ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P754ReservdS((short)number);
	}
	public void setIp65504P754ReservdS(long number) {
	    number = checkIp65504P754ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P754ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P754ReservdL
	 *	@return ip65504P754ReservdL
	 */
	public short getIp65504P754ReservdL() throws CFException {
        if (isIp65504P754ReservdLModified()) { 
           ip65504P754ReservdL = refreshIp65504P754ReservdL();
        }
   		return ip65504P754ReservdL;
	}
	
	/**
	 * 	Update Ip65504P754ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P754-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P754ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P754ReservdL = checkIp65504P754ReservdLMaxLimit(number); 
		serializeIp65504P754ReservdL(ip65504P754ReservdL);
	}

	public void setIp65504P754ReservdL(int number) {
	    number = checkIp65504P754ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P754ReservdL((short)number);
	}
	public void setIp65504P754ReservdL(long number) {
	    number = checkIp65504P754ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P754ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P755ReservdS
	 *	@return ip65504P755ReservdS
	 */
	public short getIp65504P755ReservdS() throws CFException {
        if (isIp65504P755ReservdSModified()) { 
           ip65504P755ReservdS = refreshIp65504P755ReservdS();
        }
   		return ip65504P755ReservdS;
	}
	
	/**
	 * 	Update Ip65504P755ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P755-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P755ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P755ReservdS = checkIp65504P755ReservdSMaxLimit(number); 
		serializeIp65504P755ReservdS(ip65504P755ReservdS);
	}

	public void setIp65504P755ReservdS(int number) {
	    number = checkIp65504P755ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P755ReservdS((short)number);
	}
	public void setIp65504P755ReservdS(long number) {
	    number = checkIp65504P755ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P755ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P755ReservdL
	 *	@return ip65504P755ReservdL
	 */
	public short getIp65504P755ReservdL() throws CFException {
        if (isIp65504P755ReservdLModified()) { 
           ip65504P755ReservdL = refreshIp65504P755ReservdL();
        }
   		return ip65504P755ReservdL;
	}
	
	/**
	 * 	Update Ip65504P755ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P755-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P755ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P755ReservdL = checkIp65504P755ReservdLMaxLimit(number); 
		serializeIp65504P755ReservdL(ip65504P755ReservdL);
	}

	public void setIp65504P755ReservdL(int number) {
	    number = checkIp65504P755ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P755ReservdL((short)number);
	}
	public void setIp65504P755ReservdL(long number) {
	    number = checkIp65504P755ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P755ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P756ReservdS
	 *	@return ip65504P756ReservdS
	 */
	public short getIp65504P756ReservdS() throws CFException {
        if (isIp65504P756ReservdSModified()) { 
           ip65504P756ReservdS = refreshIp65504P756ReservdS();
        }
   		return ip65504P756ReservdS;
	}
	
	/**
	 * 	Update Ip65504P756ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P756-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P756ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P756ReservdS = checkIp65504P756ReservdSMaxLimit(number); 
		serializeIp65504P756ReservdS(ip65504P756ReservdS);
	}

	public void setIp65504P756ReservdS(int number) {
	    number = checkIp65504P756ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P756ReservdS((short)number);
	}
	public void setIp65504P756ReservdS(long number) {
	    number = checkIp65504P756ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P756ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P756ReservdL
	 *	@return ip65504P756ReservdL
	 */
	public short getIp65504P756ReservdL() throws CFException {
        if (isIp65504P756ReservdLModified()) { 
           ip65504P756ReservdL = refreshIp65504P756ReservdL();
        }
   		return ip65504P756ReservdL;
	}
	
	/**
	 * 	Update Ip65504P756ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P756-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P756ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P756ReservdL = checkIp65504P756ReservdLMaxLimit(number); 
		serializeIp65504P756ReservdL(ip65504P756ReservdL);
	}

	public void setIp65504P756ReservdL(int number) {
	    number = checkIp65504P756ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P756ReservdL((short)number);
	}
	public void setIp65504P756ReservdL(long number) {
	    number = checkIp65504P756ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P756ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P757ReservdS
	 *	@return ip65504P757ReservdS
	 */
	public short getIp65504P757ReservdS() throws CFException {
        if (isIp65504P757ReservdSModified()) { 
           ip65504P757ReservdS = refreshIp65504P757ReservdS();
        }
   		return ip65504P757ReservdS;
	}
	
	/**
	 * 	Update Ip65504P757ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P757-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P757ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P757ReservdS = checkIp65504P757ReservdSMaxLimit(number); 
		serializeIp65504P757ReservdS(ip65504P757ReservdS);
	}

	public void setIp65504P757ReservdS(int number) {
	    number = checkIp65504P757ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P757ReservdS((short)number);
	}
	public void setIp65504P757ReservdS(long number) {
	    number = checkIp65504P757ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P757ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P757ReservdL
	 *	@return ip65504P757ReservdL
	 */
	public short getIp65504P757ReservdL() throws CFException {
        if (isIp65504P757ReservdLModified()) { 
           ip65504P757ReservdL = refreshIp65504P757ReservdL();
        }
   		return ip65504P757ReservdL;
	}
	
	/**
	 * 	Update Ip65504P757ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P757-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P757ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P757ReservdL = checkIp65504P757ReservdLMaxLimit(number); 
		serializeIp65504P757ReservdL(ip65504P757ReservdL);
	}

	public void setIp65504P757ReservdL(int number) {
	    number = checkIp65504P757ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P757ReservdL((short)number);
	}
	public void setIp65504P757ReservdL(long number) {
	    number = checkIp65504P757ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P757ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P758ReservdS
	 *	@return ip65504P758ReservdS
	 */
	public short getIp65504P758ReservdS() throws CFException {
        if (isIp65504P758ReservdSModified()) { 
           ip65504P758ReservdS = refreshIp65504P758ReservdS();
        }
   		return ip65504P758ReservdS;
	}
	
	/**
	 * 	Update Ip65504P758ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P758-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P758ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P758ReservdS = checkIp65504P758ReservdSMaxLimit(number); 
		serializeIp65504P758ReservdS(ip65504P758ReservdS);
	}

	public void setIp65504P758ReservdS(int number) {
	    number = checkIp65504P758ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P758ReservdS((short)number);
	}
	public void setIp65504P758ReservdS(long number) {
	    number = checkIp65504P758ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P758ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P758ReservdL
	 *	@return ip65504P758ReservdL
	 */
	public short getIp65504P758ReservdL() throws CFException {
        if (isIp65504P758ReservdLModified()) { 
           ip65504P758ReservdL = refreshIp65504P758ReservdL();
        }
   		return ip65504P758ReservdL;
	}
	
	/**
	 * 	Update Ip65504P758ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P758-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P758ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P758ReservdL = checkIp65504P758ReservdLMaxLimit(number); 
		serializeIp65504P758ReservdL(ip65504P758ReservdL);
	}

	public void setIp65504P758ReservdL(int number) {
	    number = checkIp65504P758ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P758ReservdL((short)number);
	}
	public void setIp65504P758ReservdL(long number) {
	    number = checkIp65504P758ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P758ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P759ReservdS
	 *	@return ip65504P759ReservdS
	 */
	public short getIp65504P759ReservdS() throws CFException {
        if (isIp65504P759ReservdSModified()) { 
           ip65504P759ReservdS = refreshIp65504P759ReservdS();
        }
   		return ip65504P759ReservdS;
	}
	
	/**
	 * 	Update Ip65504P759ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P759-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P759ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P759ReservdS = checkIp65504P759ReservdSMaxLimit(number); 
		serializeIp65504P759ReservdS(ip65504P759ReservdS);
	}

	public void setIp65504P759ReservdS(int number) {
	    number = checkIp65504P759ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P759ReservdS((short)number);
	}
	public void setIp65504P759ReservdS(long number) {
	    number = checkIp65504P759ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P759ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P759ReservdL
	 *	@return ip65504P759ReservdL
	 */
	public short getIp65504P759ReservdL() throws CFException {
        if (isIp65504P759ReservdLModified()) { 
           ip65504P759ReservdL = refreshIp65504P759ReservdL();
        }
   		return ip65504P759ReservdL;
	}
	
	/**
	 * 	Update Ip65504P759ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P759-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P759ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P759ReservdL = checkIp65504P759ReservdLMaxLimit(number); 
		serializeIp65504P759ReservdL(ip65504P759ReservdL);
	}

	public void setIp65504P759ReservdL(int number) {
	    number = checkIp65504P759ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P759ReservdL((short)number);
	}
	public void setIp65504P759ReservdL(long number) {
	    number = checkIp65504P759ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P759ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P760ReservdS
	 *	@return ip65504P760ReservdS
	 */
	public short getIp65504P760ReservdS() throws CFException {
        if (isIp65504P760ReservdSModified()) { 
           ip65504P760ReservdS = refreshIp65504P760ReservdS();
        }
   		return ip65504P760ReservdS;
	}
	
	/**
	 * 	Update Ip65504P760ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P760-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P760ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P760ReservdS = checkIp65504P760ReservdSMaxLimit(number); 
		serializeIp65504P760ReservdS(ip65504P760ReservdS);
	}

	public void setIp65504P760ReservdS(int number) {
	    number = checkIp65504P760ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P760ReservdS((short)number);
	}
	public void setIp65504P760ReservdS(long number) {
	    number = checkIp65504P760ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P760ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P760ReservdL
	 *	@return ip65504P760ReservdL
	 */
	public short getIp65504P760ReservdL() throws CFException {
        if (isIp65504P760ReservdLModified()) { 
           ip65504P760ReservdL = refreshIp65504P760ReservdL();
        }
   		return ip65504P760ReservdL;
	}
	
	/**
	 * 	Update Ip65504P760ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P760-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P760ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P760ReservdL = checkIp65504P760ReservdLMaxLimit(number); 
		serializeIp65504P760ReservdL(ip65504P760ReservdL);
	}

	public void setIp65504P760ReservdL(int number) {
	    number = checkIp65504P760ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P760ReservdL((short)number);
	}
	public void setIp65504P760ReservdL(long number) {
	    number = checkIp65504P760ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P760ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P761ReservdS
	 *	@return ip65504P761ReservdS
	 */
	public short getIp65504P761ReservdS() throws CFException {
        if (isIp65504P761ReservdSModified()) { 
           ip65504P761ReservdS = refreshIp65504P761ReservdS();
        }
   		return ip65504P761ReservdS;
	}
	
	/**
	 * 	Update Ip65504P761ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P761-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P761ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P761ReservdS = checkIp65504P761ReservdSMaxLimit(number); 
		serializeIp65504P761ReservdS(ip65504P761ReservdS);
	}

	public void setIp65504P761ReservdS(int number) {
	    number = checkIp65504P761ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P761ReservdS((short)number);
	}
	public void setIp65504P761ReservdS(long number) {
	    number = checkIp65504P761ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P761ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P761ReservdL
	 *	@return ip65504P761ReservdL
	 */
	public short getIp65504P761ReservdL() throws CFException {
        if (isIp65504P761ReservdLModified()) { 
           ip65504P761ReservdL = refreshIp65504P761ReservdL();
        }
   		return ip65504P761ReservdL;
	}
	
	/**
	 * 	Update Ip65504P761ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P761-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P761ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P761ReservdL = checkIp65504P761ReservdLMaxLimit(number); 
		serializeIp65504P761ReservdL(ip65504P761ReservdL);
	}

	public void setIp65504P761ReservdL(int number) {
	    number = checkIp65504P761ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P761ReservdL((short)number);
	}
	public void setIp65504P761ReservdL(long number) {
	    number = checkIp65504P761ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P761ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P762ReservdS
	 *	@return ip65504P762ReservdS
	 */
	public short getIp65504P762ReservdS() throws CFException {
        if (isIp65504P762ReservdSModified()) { 
           ip65504P762ReservdS = refreshIp65504P762ReservdS();
        }
   		return ip65504P762ReservdS;
	}
	
	/**
	 * 	Update Ip65504P762ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P762-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P762ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P762ReservdS = checkIp65504P762ReservdSMaxLimit(number); 
		serializeIp65504P762ReservdS(ip65504P762ReservdS);
	}

	public void setIp65504P762ReservdS(int number) {
	    number = checkIp65504P762ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P762ReservdS((short)number);
	}
	public void setIp65504P762ReservdS(long number) {
	    number = checkIp65504P762ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P762ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P762ReservdL
	 *	@return ip65504P762ReservdL
	 */
	public short getIp65504P762ReservdL() throws CFException {
        if (isIp65504P762ReservdLModified()) { 
           ip65504P762ReservdL = refreshIp65504P762ReservdL();
        }
   		return ip65504P762ReservdL;
	}
	
	/**
	 * 	Update Ip65504P762ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P762-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P762ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P762ReservdL = checkIp65504P762ReservdLMaxLimit(number); 
		serializeIp65504P762ReservdL(ip65504P762ReservdL);
	}

	public void setIp65504P762ReservdL(int number) {
	    number = checkIp65504P762ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P762ReservdL((short)number);
	}
	public void setIp65504P762ReservdL(long number) {
	    number = checkIp65504P762ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P762ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P763ReservdS
	 *	@return ip65504P763ReservdS
	 */
	public short getIp65504P763ReservdS() throws CFException {
        if (isIp65504P763ReservdSModified()) { 
           ip65504P763ReservdS = refreshIp65504P763ReservdS();
        }
   		return ip65504P763ReservdS;
	}
	
	/**
	 * 	Update Ip65504P763ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P763-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P763ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P763ReservdS = checkIp65504P763ReservdSMaxLimit(number); 
		serializeIp65504P763ReservdS(ip65504P763ReservdS);
	}

	public void setIp65504P763ReservdS(int number) {
	    number = checkIp65504P763ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P763ReservdS((short)number);
	}
	public void setIp65504P763ReservdS(long number) {
	    number = checkIp65504P763ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P763ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P763ReservdL
	 *	@return ip65504P763ReservdL
	 */
	public short getIp65504P763ReservdL() throws CFException {
        if (isIp65504P763ReservdLModified()) { 
           ip65504P763ReservdL = refreshIp65504P763ReservdL();
        }
   		return ip65504P763ReservdL;
	}
	
	/**
	 * 	Update Ip65504P763ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P763-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P763ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P763ReservdL = checkIp65504P763ReservdLMaxLimit(number); 
		serializeIp65504P763ReservdL(ip65504P763ReservdL);
	}

	public void setIp65504P763ReservdL(int number) {
	    number = checkIp65504P763ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P763ReservdL((short)number);
	}
	public void setIp65504P763ReservdL(long number) {
	    number = checkIp65504P763ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P763ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P764ReservdS
	 *	@return ip65504P764ReservdS
	 */
	public short getIp65504P764ReservdS() throws CFException {
        if (isIp65504P764ReservdSModified()) { 
           ip65504P764ReservdS = refreshIp65504P764ReservdS();
        }
   		return ip65504P764ReservdS;
	}
	
	/**
	 * 	Update Ip65504P764ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P764-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P764ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P764ReservdS = checkIp65504P764ReservdSMaxLimit(number); 
		serializeIp65504P764ReservdS(ip65504P764ReservdS);
	}

	public void setIp65504P764ReservdS(int number) {
	    number = checkIp65504P764ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P764ReservdS((short)number);
	}
	public void setIp65504P764ReservdS(long number) {
	    number = checkIp65504P764ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P764ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P764ReservdL
	 *	@return ip65504P764ReservdL
	 */
	public short getIp65504P764ReservdL() throws CFException {
        if (isIp65504P764ReservdLModified()) { 
           ip65504P764ReservdL = refreshIp65504P764ReservdL();
        }
   		return ip65504P764ReservdL;
	}
	
	/**
	 * 	Update Ip65504P764ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P764-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P764ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P764ReservdL = checkIp65504P764ReservdLMaxLimit(number); 
		serializeIp65504P764ReservdL(ip65504P764ReservdL);
	}

	public void setIp65504P764ReservdL(int number) {
	    number = checkIp65504P764ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P764ReservdL((short)number);
	}
	public void setIp65504P764ReservdL(long number) {
	    number = checkIp65504P764ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P764ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P765ReservdS
	 *	@return ip65504P765ReservdS
	 */
	public short getIp65504P765ReservdS() throws CFException {
        if (isIp65504P765ReservdSModified()) { 
           ip65504P765ReservdS = refreshIp65504P765ReservdS();
        }
   		return ip65504P765ReservdS;
	}
	
	/**
	 * 	Update Ip65504P765ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P765-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P765ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P765ReservdS = checkIp65504P765ReservdSMaxLimit(number); 
		serializeIp65504P765ReservdS(ip65504P765ReservdS);
	}

	public void setIp65504P765ReservdS(int number) {
	    number = checkIp65504P765ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P765ReservdS((short)number);
	}
	public void setIp65504P765ReservdS(long number) {
	    number = checkIp65504P765ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P765ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P765ReservdL
	 *	@return ip65504P765ReservdL
	 */
	public short getIp65504P765ReservdL() throws CFException {
        if (isIp65504P765ReservdLModified()) { 
           ip65504P765ReservdL = refreshIp65504P765ReservdL();
        }
   		return ip65504P765ReservdL;
	}
	
	/**
	 * 	Update Ip65504P765ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P765-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P765ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P765ReservdL = checkIp65504P765ReservdLMaxLimit(number); 
		serializeIp65504P765ReservdL(ip65504P765ReservdL);
	}

	public void setIp65504P765ReservdL(int number) {
	    number = checkIp65504P765ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P765ReservdL((short)number);
	}
	public void setIp65504P765ReservdL(long number) {
	    number = checkIp65504P765ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P765ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P766ReservdS
	 *	@return ip65504P766ReservdS
	 */
	public short getIp65504P766ReservdS() throws CFException {
        if (isIp65504P766ReservdSModified()) { 
           ip65504P766ReservdS = refreshIp65504P766ReservdS();
        }
   		return ip65504P766ReservdS;
	}
	
	/**
	 * 	Update Ip65504P766ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P766-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P766ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P766ReservdS = checkIp65504P766ReservdSMaxLimit(number); 
		serializeIp65504P766ReservdS(ip65504P766ReservdS);
	}

	public void setIp65504P766ReservdS(int number) {
	    number = checkIp65504P766ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P766ReservdS((short)number);
	}
	public void setIp65504P766ReservdS(long number) {
	    number = checkIp65504P766ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P766ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P766ReservdL
	 *	@return ip65504P766ReservdL
	 */
	public short getIp65504P766ReservdL() throws CFException {
        if (isIp65504P766ReservdLModified()) { 
           ip65504P766ReservdL = refreshIp65504P766ReservdL();
        }
   		return ip65504P766ReservdL;
	}
	
	/**
	 * 	Update Ip65504P766ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P766-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P766ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P766ReservdL = checkIp65504P766ReservdLMaxLimit(number); 
		serializeIp65504P766ReservdL(ip65504P766ReservdL);
	}

	public void setIp65504P766ReservdL(int number) {
	    number = checkIp65504P766ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P766ReservdL((short)number);
	}
	public void setIp65504P766ReservdL(long number) {
	    number = checkIp65504P766ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P766ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P767ReservdS
	 *	@return ip65504P767ReservdS
	 */
	public short getIp65504P767ReservdS() throws CFException {
        if (isIp65504P767ReservdSModified()) { 
           ip65504P767ReservdS = refreshIp65504P767ReservdS();
        }
   		return ip65504P767ReservdS;
	}
	
	/**
	 * 	Update Ip65504P767ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P767-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P767ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P767ReservdS = checkIp65504P767ReservdSMaxLimit(number); 
		serializeIp65504P767ReservdS(ip65504P767ReservdS);
	}

	public void setIp65504P767ReservdS(int number) {
	    number = checkIp65504P767ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P767ReservdS((short)number);
	}
	public void setIp65504P767ReservdS(long number) {
	    number = checkIp65504P767ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P767ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P767ReservdL
	 *	@return ip65504P767ReservdL
	 */
	public short getIp65504P767ReservdL() throws CFException {
        if (isIp65504P767ReservdLModified()) { 
           ip65504P767ReservdL = refreshIp65504P767ReservdL();
        }
   		return ip65504P767ReservdL;
	}
	
	/**
	 * 	Update Ip65504P767ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P767-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P767ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P767ReservdL = checkIp65504P767ReservdLMaxLimit(number); 
		serializeIp65504P767ReservdL(ip65504P767ReservdL);
	}

	public void setIp65504P767ReservdL(int number) {
	    number = checkIp65504P767ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P767ReservdL((short)number);
	}
	public void setIp65504P767ReservdL(long number) {
	    number = checkIp65504P767ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P767ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P768ReservdS
	 *	@return ip65504P768ReservdS
	 */
	public short getIp65504P768ReservdS() throws CFException {
        if (isIp65504P768ReservdSModified()) { 
           ip65504P768ReservdS = refreshIp65504P768ReservdS();
        }
   		return ip65504P768ReservdS;
	}
	
	/**
	 * 	Update Ip65504P768ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P768-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P768ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P768ReservdS = checkIp65504P768ReservdSMaxLimit(number); 
		serializeIp65504P768ReservdS(ip65504P768ReservdS);
	}

	public void setIp65504P768ReservdS(int number) {
	    number = checkIp65504P768ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P768ReservdS((short)number);
	}
	public void setIp65504P768ReservdS(long number) {
	    number = checkIp65504P768ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P768ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P768ReservdL
	 *	@return ip65504P768ReservdL
	 */
	public short getIp65504P768ReservdL() throws CFException {
        if (isIp65504P768ReservdLModified()) { 
           ip65504P768ReservdL = refreshIp65504P768ReservdL();
        }
   		return ip65504P768ReservdL;
	}
	
	/**
	 * 	Update Ip65504P768ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P768-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P768ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P768ReservdL = checkIp65504P768ReservdLMaxLimit(number); 
		serializeIp65504P768ReservdL(ip65504P768ReservdL);
	}

	public void setIp65504P768ReservdL(int number) {
	    number = checkIp65504P768ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P768ReservdL((short)number);
	}
	public void setIp65504P768ReservdL(long number) {
	    number = checkIp65504P768ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P768ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P769ReservdS
	 *	@return ip65504P769ReservdS
	 */
	public short getIp65504P769ReservdS() throws CFException {
        if (isIp65504P769ReservdSModified()) { 
           ip65504P769ReservdS = refreshIp65504P769ReservdS();
        }
   		return ip65504P769ReservdS;
	}
	
	/**
	 * 	Update Ip65504P769ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P769-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P769ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P769ReservdS = checkIp65504P769ReservdSMaxLimit(number); 
		serializeIp65504P769ReservdS(ip65504P769ReservdS);
	}

	public void setIp65504P769ReservdS(int number) {
	    number = checkIp65504P769ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P769ReservdS((short)number);
	}
	public void setIp65504P769ReservdS(long number) {
	    number = checkIp65504P769ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P769ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P769ReservdL
	 *	@return ip65504P769ReservdL
	 */
	public short getIp65504P769ReservdL() throws CFException {
        if (isIp65504P769ReservdLModified()) { 
           ip65504P769ReservdL = refreshIp65504P769ReservdL();
        }
   		return ip65504P769ReservdL;
	}
	
	/**
	 * 	Update Ip65504P769ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P769-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P769ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P769ReservdL = checkIp65504P769ReservdLMaxLimit(number); 
		serializeIp65504P769ReservdL(ip65504P769ReservdL);
	}

	public void setIp65504P769ReservdL(int number) {
	    number = checkIp65504P769ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P769ReservdL((short)number);
	}
	public void setIp65504P769ReservdL(long number) {
	    number = checkIp65504P769ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P769ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P770ReservdS
	 *	@return ip65504P770ReservdS
	 */
	public short getIp65504P770ReservdS() throws CFException {
        if (isIp65504P770ReservdSModified()) { 
           ip65504P770ReservdS = refreshIp65504P770ReservdS();
        }
   		return ip65504P770ReservdS;
	}
	
	/**
	 * 	Update Ip65504P770ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P770-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P770ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P770ReservdS = checkIp65504P770ReservdSMaxLimit(number); 
		serializeIp65504P770ReservdS(ip65504P770ReservdS);
	}

	public void setIp65504P770ReservdS(int number) {
	    number = checkIp65504P770ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P770ReservdS((short)number);
	}
	public void setIp65504P770ReservdS(long number) {
	    number = checkIp65504P770ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P770ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P770ReservdL
	 *	@return ip65504P770ReservdL
	 */
	public short getIp65504P770ReservdL() throws CFException {
        if (isIp65504P770ReservdLModified()) { 
           ip65504P770ReservdL = refreshIp65504P770ReservdL();
        }
   		return ip65504P770ReservdL;
	}
	
	/**
	 * 	Update Ip65504P770ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P770-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P770ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P770ReservdL = checkIp65504P770ReservdLMaxLimit(number); 
		serializeIp65504P770ReservdL(ip65504P770ReservdL);
	}

	public void setIp65504P770ReservdL(int number) {
	    number = checkIp65504P770ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P770ReservdL((short)number);
	}
	public void setIp65504P770ReservdL(long number) {
	    number = checkIp65504P770ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P770ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P771ReservdS
	 *	@return ip65504P771ReservdS
	 */
	public short getIp65504P771ReservdS() throws CFException {
        if (isIp65504P771ReservdSModified()) { 
           ip65504P771ReservdS = refreshIp65504P771ReservdS();
        }
   		return ip65504P771ReservdS;
	}
	
	/**
	 * 	Update Ip65504P771ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P771-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P771ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P771ReservdS = checkIp65504P771ReservdSMaxLimit(number); 
		serializeIp65504P771ReservdS(ip65504P771ReservdS);
	}

	public void setIp65504P771ReservdS(int number) {
	    number = checkIp65504P771ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P771ReservdS((short)number);
	}
	public void setIp65504P771ReservdS(long number) {
	    number = checkIp65504P771ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P771ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P771ReservdL
	 *	@return ip65504P771ReservdL
	 */
	public short getIp65504P771ReservdL() throws CFException {
        if (isIp65504P771ReservdLModified()) { 
           ip65504P771ReservdL = refreshIp65504P771ReservdL();
        }
   		return ip65504P771ReservdL;
	}
	
	/**
	 * 	Update Ip65504P771ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P771-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P771ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P771ReservdL = checkIp65504P771ReservdLMaxLimit(number); 
		serializeIp65504P771ReservdL(ip65504P771ReservdL);
	}

	public void setIp65504P771ReservdL(int number) {
	    number = checkIp65504P771ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P771ReservdL((short)number);
	}
	public void setIp65504P771ReservdL(long number) {
	    number = checkIp65504P771ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P771ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P772ReservdS
	 *	@return ip65504P772ReservdS
	 */
	public short getIp65504P772ReservdS() throws CFException {
        if (isIp65504P772ReservdSModified()) { 
           ip65504P772ReservdS = refreshIp65504P772ReservdS();
        }
   		return ip65504P772ReservdS;
	}
	
	/**
	 * 	Update Ip65504P772ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P772-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P772ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P772ReservdS = checkIp65504P772ReservdSMaxLimit(number); 
		serializeIp65504P772ReservdS(ip65504P772ReservdS);
	}

	public void setIp65504P772ReservdS(int number) {
	    number = checkIp65504P772ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P772ReservdS((short)number);
	}
	public void setIp65504P772ReservdS(long number) {
	    number = checkIp65504P772ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P772ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P772ReservdL
	 *	@return ip65504P772ReservdL
	 */
	public short getIp65504P772ReservdL() throws CFException {
        if (isIp65504P772ReservdLModified()) { 
           ip65504P772ReservdL = refreshIp65504P772ReservdL();
        }
   		return ip65504P772ReservdL;
	}
	
	/**
	 * 	Update Ip65504P772ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P772-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P772ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P772ReservdL = checkIp65504P772ReservdLMaxLimit(number); 
		serializeIp65504P772ReservdL(ip65504P772ReservdL);
	}

	public void setIp65504P772ReservdL(int number) {
	    number = checkIp65504P772ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P772ReservdL((short)number);
	}
	public void setIp65504P772ReservdL(long number) {
	    number = checkIp65504P772ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P772ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P773ReservdS
	 *	@return ip65504P773ReservdS
	 */
	public short getIp65504P773ReservdS() throws CFException {
        if (isIp65504P773ReservdSModified()) { 
           ip65504P773ReservdS = refreshIp65504P773ReservdS();
        }
   		return ip65504P773ReservdS;
	}
	
	/**
	 * 	Update Ip65504P773ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P773-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P773ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P773ReservdS = checkIp65504P773ReservdSMaxLimit(number); 
		serializeIp65504P773ReservdS(ip65504P773ReservdS);
	}

	public void setIp65504P773ReservdS(int number) {
	    number = checkIp65504P773ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P773ReservdS((short)number);
	}
	public void setIp65504P773ReservdS(long number) {
	    number = checkIp65504P773ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P773ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P773ReservdL
	 *	@return ip65504P773ReservdL
	 */
	public short getIp65504P773ReservdL() throws CFException {
        if (isIp65504P773ReservdLModified()) { 
           ip65504P773ReservdL = refreshIp65504P773ReservdL();
        }
   		return ip65504P773ReservdL;
	}
	
	/**
	 * 	Update Ip65504P773ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P773-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P773ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P773ReservdL = checkIp65504P773ReservdLMaxLimit(number); 
		serializeIp65504P773ReservdL(ip65504P773ReservdL);
	}

	public void setIp65504P773ReservdL(int number) {
	    number = checkIp65504P773ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P773ReservdL((short)number);
	}
	public void setIp65504P773ReservdL(long number) {
	    number = checkIp65504P773ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P773ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P774ReservdS
	 *	@return ip65504P774ReservdS
	 */
	public short getIp65504P774ReservdS() throws CFException {
        if (isIp65504P774ReservdSModified()) { 
           ip65504P774ReservdS = refreshIp65504P774ReservdS();
        }
   		return ip65504P774ReservdS;
	}
	
	/**
	 * 	Update Ip65504P774ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P774-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P774ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P774ReservdS = checkIp65504P774ReservdSMaxLimit(number); 
		serializeIp65504P774ReservdS(ip65504P774ReservdS);
	}

	public void setIp65504P774ReservdS(int number) {
	    number = checkIp65504P774ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P774ReservdS((short)number);
	}
	public void setIp65504P774ReservdS(long number) {
	    number = checkIp65504P774ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P774ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P774ReservdL
	 *	@return ip65504P774ReservdL
	 */
	public short getIp65504P774ReservdL() throws CFException {
        if (isIp65504P774ReservdLModified()) { 
           ip65504P774ReservdL = refreshIp65504P774ReservdL();
        }
   		return ip65504P774ReservdL;
	}
	
	/**
	 * 	Update Ip65504P774ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P774-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P774ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P774ReservdL = checkIp65504P774ReservdLMaxLimit(number); 
		serializeIp65504P774ReservdL(ip65504P774ReservdL);
	}

	public void setIp65504P774ReservdL(int number) {
	    number = checkIp65504P774ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P774ReservdL((short)number);
	}
	public void setIp65504P774ReservdL(long number) {
	    number = checkIp65504P774ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P774ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P775ReservdS
	 *	@return ip65504P775ReservdS
	 */
	public short getIp65504P775ReservdS() throws CFException {
        if (isIp65504P775ReservdSModified()) { 
           ip65504P775ReservdS = refreshIp65504P775ReservdS();
        }
   		return ip65504P775ReservdS;
	}
	
	/**
	 * 	Update Ip65504P775ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P775-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P775ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P775ReservdS = checkIp65504P775ReservdSMaxLimit(number); 
		serializeIp65504P775ReservdS(ip65504P775ReservdS);
	}

	public void setIp65504P775ReservdS(int number) {
	    number = checkIp65504P775ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P775ReservdS((short)number);
	}
	public void setIp65504P775ReservdS(long number) {
	    number = checkIp65504P775ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P775ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P775ReservdL
	 *	@return ip65504P775ReservdL
	 */
	public short getIp65504P775ReservdL() throws CFException {
        if (isIp65504P775ReservdLModified()) { 
           ip65504P775ReservdL = refreshIp65504P775ReservdL();
        }
   		return ip65504P775ReservdL;
	}
	
	/**
	 * 	Update Ip65504P775ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P775-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P775ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P775ReservdL = checkIp65504P775ReservdLMaxLimit(number); 
		serializeIp65504P775ReservdL(ip65504P775ReservdL);
	}

	public void setIp65504P775ReservdL(int number) {
	    number = checkIp65504P775ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P775ReservdL((short)number);
	}
	public void setIp65504P775ReservdL(long number) {
	    number = checkIp65504P775ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P775ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup25
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P745ReservdS((short)0);
         	setIp65504P745ReservdL((short)0);
         	setIp65504P746ReservdS((short)0);
         	setIp65504P746ReservdL((short)0);
         	setIp65504P747ReservdS((short)0);
         	setIp65504P747ReservdL((short)0);
         	setIp65504P748ReservdS((short)0);
         	setIp65504P748ReservdL((short)0);
         	setIp65504P749ReservdS((short)0);
         	setIp65504P749ReservdL((short)0);
         	setIp65504P750ReservdS((short)0);
         	setIp65504P750ReservdL((short)0);
         	setIp65504P751ReservdS((short)0);
         	setIp65504P751ReservdL((short)0);
         	setIp65504P752ReservdS((short)0);
         	setIp65504P752ReservdL((short)0);
         	setIp65504P753ReservdS((short)0);
         	setIp65504P753ReservdL((short)0);
         	setIp65504P754ReservdS((short)0);
         	setIp65504P754ReservdL((short)0);
         	setIp65504P755ReservdS((short)0);
         	setIp65504P755ReservdL((short)0);
         	setIp65504P756ReservdS((short)0);
         	setIp65504P756ReservdL((short)0);
         	setIp65504P757ReservdS((short)0);
         	setIp65504P757ReservdL((short)0);
         	setIp65504P758ReservdS((short)0);
         	setIp65504P758ReservdL((short)0);
         	setIp65504P759ReservdS((short)0);
         	setIp65504P759ReservdL((short)0);
         	setIp65504P760ReservdS((short)0);
         	setIp65504P760ReservdL((short)0);
         	setIp65504P761ReservdS((short)0);
         	setIp65504P761ReservdL((short)0);
         	setIp65504P762ReservdS((short)0);
         	setIp65504P762ReservdL((short)0);
         	setIp65504P763ReservdS((short)0);
         	setIp65504P763ReservdL((short)0);
         	setIp65504P764ReservdS((short)0);
         	setIp65504P764ReservdL((short)0);
         	setIp65504P765ReservdS((short)0);
         	setIp65504P765ReservdL((short)0);
         	setIp65504P766ReservdS((short)0);
         	setIp65504P766ReservdL((short)0);
         	setIp65504P767ReservdS((short)0);
         	setIp65504P767ReservdL((short)0);
         	setIp65504P768ReservdS((short)0);
         	setIp65504P768ReservdL((short)0);
         	setIp65504P769ReservdS((short)0);
         	setIp65504P769ReservdL((short)0);
         	setIp65504P770ReservdS((short)0);
         	setIp65504P770ReservdL((short)0);
         	setIp65504P771ReservdS((short)0);
         	setIp65504P771ReservdL((short)0);
         	setIp65504P772ReservdS((short)0);
         	setIp65504P772ReservdL((short)0);
         	setIp65504P773ReservdS((short)0);
         	setIp65504P773ReservdL((short)0);
         	setIp65504P774ReservdS((short)0);
         	setIp65504P774ReservdL((short)0);
         	setIp65504P775ReservdS((short)0);
         	setIp65504P775ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup25FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_25_LENGTH;
		}

}
  
