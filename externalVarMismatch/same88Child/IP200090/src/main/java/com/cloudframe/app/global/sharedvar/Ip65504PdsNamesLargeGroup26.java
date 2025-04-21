package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup26 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup26 extends Ip65504PdsNamesLargeGroup26Serialized { 
   

								private short ip65504P776ReservdS;

								private short ip65504P776ReservdL;


								private short ip65504P777ReservdS;

								private short ip65504P777ReservdL;


								private short ip65504P778ReservdS;

								private short ip65504P778ReservdL;


								private short ip65504P779ReservdS;

								private short ip65504P779ReservdL;


								private short ip65504P780ReservdS;

								private short ip65504P780ReservdL;


								private short ip65504P781ReservdS;

								private short ip65504P781ReservdL;


								private short ip65504P782ReservdS;

								private short ip65504P782ReservdL;


								private short ip65504P783ReservdS;

								private short ip65504P783ReservdL;


								private short ip65504P784ReservdS;

								private short ip65504P784ReservdL;


								private short ip65504P785ReservdS;

								private short ip65504P785ReservdL;


								private short ip65504P786ReservdS;

								private short ip65504P786ReservdL;


								private short ip65504P787ReservdS;

								private short ip65504P787ReservdL;


								private short ip65504P788ReservdS;

								private short ip65504P788ReservdL;


								private short ip65504P789ReservdS;

								private short ip65504P789ReservdL;


								private short ip65504P790ReservdS;

								private short ip65504P790ReservdL;


								private short ip65504P791ReservdS;

								private short ip65504P791ReservdL;


								private short ip65504P792ReservdS;

								private short ip65504P792ReservdL;


								private short ip65504P793ReservdS;

								private short ip65504P793ReservdL;


								private short ip65504P794ReservdS;

								private short ip65504P794ReservdL;


								private short ip65504P795ReservdS;

								private short ip65504P795ReservdL;


								private short ip65504P796ReservdS;

								private short ip65504P796ReservdL;


								private short ip65504P797ReservdS;

								private short ip65504P797ReservdL;


								private short ip65504P798ReservdS;

								private short ip65504P798ReservdL;


								private short ip65504P799ReservdS;

								private short ip65504P799ReservdL;


								private short ip65504P800ReservdS;

								private short ip65504P800ReservdL;


								private short ip65504P801ReservdS;

								private short ip65504P801ReservdL;


								private short ip65504P802ReservdS;

								private short ip65504P802ReservdL;


								private short ip65504P803ReservdS;

								private short ip65504P803ReservdL;


								private short ip65504P804ReservdS;

								private short ip65504P804ReservdL;


								private short ip65504P805ReservdS;

								private short ip65504P805ReservdL;


								private short ip65504P806ReservdS;

								private short ip65504P806ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup26
	**/
    public Ip65504PdsNamesLargeGroup26() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup26. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup26(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P776ReservdS
	 *	@return ip65504P776ReservdS
	 */
	public short getIp65504P776ReservdS() throws CFException {
        if (isIp65504P776ReservdSModified()) { 
           ip65504P776ReservdS = refreshIp65504P776ReservdS();
        }
   		return ip65504P776ReservdS;
	}
	
	/**
	 * 	Update Ip65504P776ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P776-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P776ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P776ReservdS = checkIp65504P776ReservdSMaxLimit(number); 
		serializeIp65504P776ReservdS(ip65504P776ReservdS);
	}

	public void setIp65504P776ReservdS(int number) {
	    number = checkIp65504P776ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P776ReservdS((short)number);
	}
	public void setIp65504P776ReservdS(long number) {
	    number = checkIp65504P776ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P776ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P776ReservdL
	 *	@return ip65504P776ReservdL
	 */
	public short getIp65504P776ReservdL() throws CFException {
        if (isIp65504P776ReservdLModified()) { 
           ip65504P776ReservdL = refreshIp65504P776ReservdL();
        }
   		return ip65504P776ReservdL;
	}
	
	/**
	 * 	Update Ip65504P776ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P776-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P776ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P776ReservdL = checkIp65504P776ReservdLMaxLimit(number); 
		serializeIp65504P776ReservdL(ip65504P776ReservdL);
	}

	public void setIp65504P776ReservdL(int number) {
	    number = checkIp65504P776ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P776ReservdL((short)number);
	}
	public void setIp65504P776ReservdL(long number) {
	    number = checkIp65504P776ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P776ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P777ReservdS
	 *	@return ip65504P777ReservdS
	 */
	public short getIp65504P777ReservdS() throws CFException {
        if (isIp65504P777ReservdSModified()) { 
           ip65504P777ReservdS = refreshIp65504P777ReservdS();
        }
   		return ip65504P777ReservdS;
	}
	
	/**
	 * 	Update Ip65504P777ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P777-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P777ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P777ReservdS = checkIp65504P777ReservdSMaxLimit(number); 
		serializeIp65504P777ReservdS(ip65504P777ReservdS);
	}

	public void setIp65504P777ReservdS(int number) {
	    number = checkIp65504P777ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P777ReservdS((short)number);
	}
	public void setIp65504P777ReservdS(long number) {
	    number = checkIp65504P777ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P777ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P777ReservdL
	 *	@return ip65504P777ReservdL
	 */
	public short getIp65504P777ReservdL() throws CFException {
        if (isIp65504P777ReservdLModified()) { 
           ip65504P777ReservdL = refreshIp65504P777ReservdL();
        }
   		return ip65504P777ReservdL;
	}
	
	/**
	 * 	Update Ip65504P777ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P777-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P777ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P777ReservdL = checkIp65504P777ReservdLMaxLimit(number); 
		serializeIp65504P777ReservdL(ip65504P777ReservdL);
	}

	public void setIp65504P777ReservdL(int number) {
	    number = checkIp65504P777ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P777ReservdL((short)number);
	}
	public void setIp65504P777ReservdL(long number) {
	    number = checkIp65504P777ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P777ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P778ReservdS
	 *	@return ip65504P778ReservdS
	 */
	public short getIp65504P778ReservdS() throws CFException {
        if (isIp65504P778ReservdSModified()) { 
           ip65504P778ReservdS = refreshIp65504P778ReservdS();
        }
   		return ip65504P778ReservdS;
	}
	
	/**
	 * 	Update Ip65504P778ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P778-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P778ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P778ReservdS = checkIp65504P778ReservdSMaxLimit(number); 
		serializeIp65504P778ReservdS(ip65504P778ReservdS);
	}

	public void setIp65504P778ReservdS(int number) {
	    number = checkIp65504P778ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P778ReservdS((short)number);
	}
	public void setIp65504P778ReservdS(long number) {
	    number = checkIp65504P778ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P778ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P778ReservdL
	 *	@return ip65504P778ReservdL
	 */
	public short getIp65504P778ReservdL() throws CFException {
        if (isIp65504P778ReservdLModified()) { 
           ip65504P778ReservdL = refreshIp65504P778ReservdL();
        }
   		return ip65504P778ReservdL;
	}
	
	/**
	 * 	Update Ip65504P778ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P778-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P778ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P778ReservdL = checkIp65504P778ReservdLMaxLimit(number); 
		serializeIp65504P778ReservdL(ip65504P778ReservdL);
	}

	public void setIp65504P778ReservdL(int number) {
	    number = checkIp65504P778ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P778ReservdL((short)number);
	}
	public void setIp65504P778ReservdL(long number) {
	    number = checkIp65504P778ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P778ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P779ReservdS
	 *	@return ip65504P779ReservdS
	 */
	public short getIp65504P779ReservdS() throws CFException {
        if (isIp65504P779ReservdSModified()) { 
           ip65504P779ReservdS = refreshIp65504P779ReservdS();
        }
   		return ip65504P779ReservdS;
	}
	
	/**
	 * 	Update Ip65504P779ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P779-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P779ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P779ReservdS = checkIp65504P779ReservdSMaxLimit(number); 
		serializeIp65504P779ReservdS(ip65504P779ReservdS);
	}

	public void setIp65504P779ReservdS(int number) {
	    number = checkIp65504P779ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P779ReservdS((short)number);
	}
	public void setIp65504P779ReservdS(long number) {
	    number = checkIp65504P779ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P779ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P779ReservdL
	 *	@return ip65504P779ReservdL
	 */
	public short getIp65504P779ReservdL() throws CFException {
        if (isIp65504P779ReservdLModified()) { 
           ip65504P779ReservdL = refreshIp65504P779ReservdL();
        }
   		return ip65504P779ReservdL;
	}
	
	/**
	 * 	Update Ip65504P779ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P779-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P779ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P779ReservdL = checkIp65504P779ReservdLMaxLimit(number); 
		serializeIp65504P779ReservdL(ip65504P779ReservdL);
	}

	public void setIp65504P779ReservdL(int number) {
	    number = checkIp65504P779ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P779ReservdL((short)number);
	}
	public void setIp65504P779ReservdL(long number) {
	    number = checkIp65504P779ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P779ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P780ReservdS
	 *	@return ip65504P780ReservdS
	 */
	public short getIp65504P780ReservdS() throws CFException {
        if (isIp65504P780ReservdSModified()) { 
           ip65504P780ReservdS = refreshIp65504P780ReservdS();
        }
   		return ip65504P780ReservdS;
	}
	
	/**
	 * 	Update Ip65504P780ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P780-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P780ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P780ReservdS = checkIp65504P780ReservdSMaxLimit(number); 
		serializeIp65504P780ReservdS(ip65504P780ReservdS);
	}

	public void setIp65504P780ReservdS(int number) {
	    number = checkIp65504P780ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P780ReservdS((short)number);
	}
	public void setIp65504P780ReservdS(long number) {
	    number = checkIp65504P780ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P780ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P780ReservdL
	 *	@return ip65504P780ReservdL
	 */
	public short getIp65504P780ReservdL() throws CFException {
        if (isIp65504P780ReservdLModified()) { 
           ip65504P780ReservdL = refreshIp65504P780ReservdL();
        }
   		return ip65504P780ReservdL;
	}
	
	/**
	 * 	Update Ip65504P780ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P780-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P780ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P780ReservdL = checkIp65504P780ReservdLMaxLimit(number); 
		serializeIp65504P780ReservdL(ip65504P780ReservdL);
	}

	public void setIp65504P780ReservdL(int number) {
	    number = checkIp65504P780ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P780ReservdL((short)number);
	}
	public void setIp65504P780ReservdL(long number) {
	    number = checkIp65504P780ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P780ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P781ReservdS
	 *	@return ip65504P781ReservdS
	 */
	public short getIp65504P781ReservdS() throws CFException {
        if (isIp65504P781ReservdSModified()) { 
           ip65504P781ReservdS = refreshIp65504P781ReservdS();
        }
   		return ip65504P781ReservdS;
	}
	
	/**
	 * 	Update Ip65504P781ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P781-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P781ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P781ReservdS = checkIp65504P781ReservdSMaxLimit(number); 
		serializeIp65504P781ReservdS(ip65504P781ReservdS);
	}

	public void setIp65504P781ReservdS(int number) {
	    number = checkIp65504P781ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P781ReservdS((short)number);
	}
	public void setIp65504P781ReservdS(long number) {
	    number = checkIp65504P781ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P781ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P781ReservdL
	 *	@return ip65504P781ReservdL
	 */
	public short getIp65504P781ReservdL() throws CFException {
        if (isIp65504P781ReservdLModified()) { 
           ip65504P781ReservdL = refreshIp65504P781ReservdL();
        }
   		return ip65504P781ReservdL;
	}
	
	/**
	 * 	Update Ip65504P781ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P781-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P781ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P781ReservdL = checkIp65504P781ReservdLMaxLimit(number); 
		serializeIp65504P781ReservdL(ip65504P781ReservdL);
	}

	public void setIp65504P781ReservdL(int number) {
	    number = checkIp65504P781ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P781ReservdL((short)number);
	}
	public void setIp65504P781ReservdL(long number) {
	    number = checkIp65504P781ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P781ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P782ReservdS
	 *	@return ip65504P782ReservdS
	 */
	public short getIp65504P782ReservdS() throws CFException {
        if (isIp65504P782ReservdSModified()) { 
           ip65504P782ReservdS = refreshIp65504P782ReservdS();
        }
   		return ip65504P782ReservdS;
	}
	
	/**
	 * 	Update Ip65504P782ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P782-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P782ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P782ReservdS = checkIp65504P782ReservdSMaxLimit(number); 
		serializeIp65504P782ReservdS(ip65504P782ReservdS);
	}

	public void setIp65504P782ReservdS(int number) {
	    number = checkIp65504P782ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P782ReservdS((short)number);
	}
	public void setIp65504P782ReservdS(long number) {
	    number = checkIp65504P782ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P782ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P782ReservdL
	 *	@return ip65504P782ReservdL
	 */
	public short getIp65504P782ReservdL() throws CFException {
        if (isIp65504P782ReservdLModified()) { 
           ip65504P782ReservdL = refreshIp65504P782ReservdL();
        }
   		return ip65504P782ReservdL;
	}
	
	/**
	 * 	Update Ip65504P782ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P782-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P782ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P782ReservdL = checkIp65504P782ReservdLMaxLimit(number); 
		serializeIp65504P782ReservdL(ip65504P782ReservdL);
	}

	public void setIp65504P782ReservdL(int number) {
	    number = checkIp65504P782ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P782ReservdL((short)number);
	}
	public void setIp65504P782ReservdL(long number) {
	    number = checkIp65504P782ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P782ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P783ReservdS
	 *	@return ip65504P783ReservdS
	 */
	public short getIp65504P783ReservdS() throws CFException {
        if (isIp65504P783ReservdSModified()) { 
           ip65504P783ReservdS = refreshIp65504P783ReservdS();
        }
   		return ip65504P783ReservdS;
	}
	
	/**
	 * 	Update Ip65504P783ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P783-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P783ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P783ReservdS = checkIp65504P783ReservdSMaxLimit(number); 
		serializeIp65504P783ReservdS(ip65504P783ReservdS);
	}

	public void setIp65504P783ReservdS(int number) {
	    number = checkIp65504P783ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P783ReservdS((short)number);
	}
	public void setIp65504P783ReservdS(long number) {
	    number = checkIp65504P783ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P783ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P783ReservdL
	 *	@return ip65504P783ReservdL
	 */
	public short getIp65504P783ReservdL() throws CFException {
        if (isIp65504P783ReservdLModified()) { 
           ip65504P783ReservdL = refreshIp65504P783ReservdL();
        }
   		return ip65504P783ReservdL;
	}
	
	/**
	 * 	Update Ip65504P783ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P783-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P783ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P783ReservdL = checkIp65504P783ReservdLMaxLimit(number); 
		serializeIp65504P783ReservdL(ip65504P783ReservdL);
	}

	public void setIp65504P783ReservdL(int number) {
	    number = checkIp65504P783ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P783ReservdL((short)number);
	}
	public void setIp65504P783ReservdL(long number) {
	    number = checkIp65504P783ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P783ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P784ReservdS
	 *	@return ip65504P784ReservdS
	 */
	public short getIp65504P784ReservdS() throws CFException {
        if (isIp65504P784ReservdSModified()) { 
           ip65504P784ReservdS = refreshIp65504P784ReservdS();
        }
   		return ip65504P784ReservdS;
	}
	
	/**
	 * 	Update Ip65504P784ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P784-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P784ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P784ReservdS = checkIp65504P784ReservdSMaxLimit(number); 
		serializeIp65504P784ReservdS(ip65504P784ReservdS);
	}

	public void setIp65504P784ReservdS(int number) {
	    number = checkIp65504P784ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P784ReservdS((short)number);
	}
	public void setIp65504P784ReservdS(long number) {
	    number = checkIp65504P784ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P784ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P784ReservdL
	 *	@return ip65504P784ReservdL
	 */
	public short getIp65504P784ReservdL() throws CFException {
        if (isIp65504P784ReservdLModified()) { 
           ip65504P784ReservdL = refreshIp65504P784ReservdL();
        }
   		return ip65504P784ReservdL;
	}
	
	/**
	 * 	Update Ip65504P784ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P784-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P784ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P784ReservdL = checkIp65504P784ReservdLMaxLimit(number); 
		serializeIp65504P784ReservdL(ip65504P784ReservdL);
	}

	public void setIp65504P784ReservdL(int number) {
	    number = checkIp65504P784ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P784ReservdL((short)number);
	}
	public void setIp65504P784ReservdL(long number) {
	    number = checkIp65504P784ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P784ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P785ReservdS
	 *	@return ip65504P785ReservdS
	 */
	public short getIp65504P785ReservdS() throws CFException {
        if (isIp65504P785ReservdSModified()) { 
           ip65504P785ReservdS = refreshIp65504P785ReservdS();
        }
   		return ip65504P785ReservdS;
	}
	
	/**
	 * 	Update Ip65504P785ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P785-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P785ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P785ReservdS = checkIp65504P785ReservdSMaxLimit(number); 
		serializeIp65504P785ReservdS(ip65504P785ReservdS);
	}

	public void setIp65504P785ReservdS(int number) {
	    number = checkIp65504P785ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P785ReservdS((short)number);
	}
	public void setIp65504P785ReservdS(long number) {
	    number = checkIp65504P785ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P785ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P785ReservdL
	 *	@return ip65504P785ReservdL
	 */
	public short getIp65504P785ReservdL() throws CFException {
        if (isIp65504P785ReservdLModified()) { 
           ip65504P785ReservdL = refreshIp65504P785ReservdL();
        }
   		return ip65504P785ReservdL;
	}
	
	/**
	 * 	Update Ip65504P785ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P785-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P785ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P785ReservdL = checkIp65504P785ReservdLMaxLimit(number); 
		serializeIp65504P785ReservdL(ip65504P785ReservdL);
	}

	public void setIp65504P785ReservdL(int number) {
	    number = checkIp65504P785ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P785ReservdL((short)number);
	}
	public void setIp65504P785ReservdL(long number) {
	    number = checkIp65504P785ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P785ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P786ReservdS
	 *	@return ip65504P786ReservdS
	 */
	public short getIp65504P786ReservdS() throws CFException {
        if (isIp65504P786ReservdSModified()) { 
           ip65504P786ReservdS = refreshIp65504P786ReservdS();
        }
   		return ip65504P786ReservdS;
	}
	
	/**
	 * 	Update Ip65504P786ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P786-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P786ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P786ReservdS = checkIp65504P786ReservdSMaxLimit(number); 
		serializeIp65504P786ReservdS(ip65504P786ReservdS);
	}

	public void setIp65504P786ReservdS(int number) {
	    number = checkIp65504P786ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P786ReservdS((short)number);
	}
	public void setIp65504P786ReservdS(long number) {
	    number = checkIp65504P786ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P786ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P786ReservdL
	 *	@return ip65504P786ReservdL
	 */
	public short getIp65504P786ReservdL() throws CFException {
        if (isIp65504P786ReservdLModified()) { 
           ip65504P786ReservdL = refreshIp65504P786ReservdL();
        }
   		return ip65504P786ReservdL;
	}
	
	/**
	 * 	Update Ip65504P786ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P786-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P786ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P786ReservdL = checkIp65504P786ReservdLMaxLimit(number); 
		serializeIp65504P786ReservdL(ip65504P786ReservdL);
	}

	public void setIp65504P786ReservdL(int number) {
	    number = checkIp65504P786ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P786ReservdL((short)number);
	}
	public void setIp65504P786ReservdL(long number) {
	    number = checkIp65504P786ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P786ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P787ReservdS
	 *	@return ip65504P787ReservdS
	 */
	public short getIp65504P787ReservdS() throws CFException {
        if (isIp65504P787ReservdSModified()) { 
           ip65504P787ReservdS = refreshIp65504P787ReservdS();
        }
   		return ip65504P787ReservdS;
	}
	
	/**
	 * 	Update Ip65504P787ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P787-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P787ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P787ReservdS = checkIp65504P787ReservdSMaxLimit(number); 
		serializeIp65504P787ReservdS(ip65504P787ReservdS);
	}

	public void setIp65504P787ReservdS(int number) {
	    number = checkIp65504P787ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P787ReservdS((short)number);
	}
	public void setIp65504P787ReservdS(long number) {
	    number = checkIp65504P787ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P787ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P787ReservdL
	 *	@return ip65504P787ReservdL
	 */
	public short getIp65504P787ReservdL() throws CFException {
        if (isIp65504P787ReservdLModified()) { 
           ip65504P787ReservdL = refreshIp65504P787ReservdL();
        }
   		return ip65504P787ReservdL;
	}
	
	/**
	 * 	Update Ip65504P787ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P787-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P787ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P787ReservdL = checkIp65504P787ReservdLMaxLimit(number); 
		serializeIp65504P787ReservdL(ip65504P787ReservdL);
	}

	public void setIp65504P787ReservdL(int number) {
	    number = checkIp65504P787ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P787ReservdL((short)number);
	}
	public void setIp65504P787ReservdL(long number) {
	    number = checkIp65504P787ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P787ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P788ReservdS
	 *	@return ip65504P788ReservdS
	 */
	public short getIp65504P788ReservdS() throws CFException {
        if (isIp65504P788ReservdSModified()) { 
           ip65504P788ReservdS = refreshIp65504P788ReservdS();
        }
   		return ip65504P788ReservdS;
	}
	
	/**
	 * 	Update Ip65504P788ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P788-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P788ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P788ReservdS = checkIp65504P788ReservdSMaxLimit(number); 
		serializeIp65504P788ReservdS(ip65504P788ReservdS);
	}

	public void setIp65504P788ReservdS(int number) {
	    number = checkIp65504P788ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P788ReservdS((short)number);
	}
	public void setIp65504P788ReservdS(long number) {
	    number = checkIp65504P788ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P788ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P788ReservdL
	 *	@return ip65504P788ReservdL
	 */
	public short getIp65504P788ReservdL() throws CFException {
        if (isIp65504P788ReservdLModified()) { 
           ip65504P788ReservdL = refreshIp65504P788ReservdL();
        }
   		return ip65504P788ReservdL;
	}
	
	/**
	 * 	Update Ip65504P788ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P788-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P788ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P788ReservdL = checkIp65504P788ReservdLMaxLimit(number); 
		serializeIp65504P788ReservdL(ip65504P788ReservdL);
	}

	public void setIp65504P788ReservdL(int number) {
	    number = checkIp65504P788ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P788ReservdL((short)number);
	}
	public void setIp65504P788ReservdL(long number) {
	    number = checkIp65504P788ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P788ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P789ReservdS
	 *	@return ip65504P789ReservdS
	 */
	public short getIp65504P789ReservdS() throws CFException {
        if (isIp65504P789ReservdSModified()) { 
           ip65504P789ReservdS = refreshIp65504P789ReservdS();
        }
   		return ip65504P789ReservdS;
	}
	
	/**
	 * 	Update Ip65504P789ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P789-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P789ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P789ReservdS = checkIp65504P789ReservdSMaxLimit(number); 
		serializeIp65504P789ReservdS(ip65504P789ReservdS);
	}

	public void setIp65504P789ReservdS(int number) {
	    number = checkIp65504P789ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P789ReservdS((short)number);
	}
	public void setIp65504P789ReservdS(long number) {
	    number = checkIp65504P789ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P789ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P789ReservdL
	 *	@return ip65504P789ReservdL
	 */
	public short getIp65504P789ReservdL() throws CFException {
        if (isIp65504P789ReservdLModified()) { 
           ip65504P789ReservdL = refreshIp65504P789ReservdL();
        }
   		return ip65504P789ReservdL;
	}
	
	/**
	 * 	Update Ip65504P789ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P789-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P789ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P789ReservdL = checkIp65504P789ReservdLMaxLimit(number); 
		serializeIp65504P789ReservdL(ip65504P789ReservdL);
	}

	public void setIp65504P789ReservdL(int number) {
	    number = checkIp65504P789ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P789ReservdL((short)number);
	}
	public void setIp65504P789ReservdL(long number) {
	    number = checkIp65504P789ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P789ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P790ReservdS
	 *	@return ip65504P790ReservdS
	 */
	public short getIp65504P790ReservdS() throws CFException {
        if (isIp65504P790ReservdSModified()) { 
           ip65504P790ReservdS = refreshIp65504P790ReservdS();
        }
   		return ip65504P790ReservdS;
	}
	
	/**
	 * 	Update Ip65504P790ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P790-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P790ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P790ReservdS = checkIp65504P790ReservdSMaxLimit(number); 
		serializeIp65504P790ReservdS(ip65504P790ReservdS);
	}

	public void setIp65504P790ReservdS(int number) {
	    number = checkIp65504P790ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P790ReservdS((short)number);
	}
	public void setIp65504P790ReservdS(long number) {
	    number = checkIp65504P790ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P790ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P790ReservdL
	 *	@return ip65504P790ReservdL
	 */
	public short getIp65504P790ReservdL() throws CFException {
        if (isIp65504P790ReservdLModified()) { 
           ip65504P790ReservdL = refreshIp65504P790ReservdL();
        }
   		return ip65504P790ReservdL;
	}
	
	/**
	 * 	Update Ip65504P790ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P790-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P790ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P790ReservdL = checkIp65504P790ReservdLMaxLimit(number); 
		serializeIp65504P790ReservdL(ip65504P790ReservdL);
	}

	public void setIp65504P790ReservdL(int number) {
	    number = checkIp65504P790ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P790ReservdL((short)number);
	}
	public void setIp65504P790ReservdL(long number) {
	    number = checkIp65504P790ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P790ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P791ReservdS
	 *	@return ip65504P791ReservdS
	 */
	public short getIp65504P791ReservdS() throws CFException {
        if (isIp65504P791ReservdSModified()) { 
           ip65504P791ReservdS = refreshIp65504P791ReservdS();
        }
   		return ip65504P791ReservdS;
	}
	
	/**
	 * 	Update Ip65504P791ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P791-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P791ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P791ReservdS = checkIp65504P791ReservdSMaxLimit(number); 
		serializeIp65504P791ReservdS(ip65504P791ReservdS);
	}

	public void setIp65504P791ReservdS(int number) {
	    number = checkIp65504P791ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P791ReservdS((short)number);
	}
	public void setIp65504P791ReservdS(long number) {
	    number = checkIp65504P791ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P791ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P791ReservdL
	 *	@return ip65504P791ReservdL
	 */
	public short getIp65504P791ReservdL() throws CFException {
        if (isIp65504P791ReservdLModified()) { 
           ip65504P791ReservdL = refreshIp65504P791ReservdL();
        }
   		return ip65504P791ReservdL;
	}
	
	/**
	 * 	Update Ip65504P791ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P791-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P791ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P791ReservdL = checkIp65504P791ReservdLMaxLimit(number); 
		serializeIp65504P791ReservdL(ip65504P791ReservdL);
	}

	public void setIp65504P791ReservdL(int number) {
	    number = checkIp65504P791ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P791ReservdL((short)number);
	}
	public void setIp65504P791ReservdL(long number) {
	    number = checkIp65504P791ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P791ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P792ReservdS
	 *	@return ip65504P792ReservdS
	 */
	public short getIp65504P792ReservdS() throws CFException {
        if (isIp65504P792ReservdSModified()) { 
           ip65504P792ReservdS = refreshIp65504P792ReservdS();
        }
   		return ip65504P792ReservdS;
	}
	
	/**
	 * 	Update Ip65504P792ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P792-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P792ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P792ReservdS = checkIp65504P792ReservdSMaxLimit(number); 
		serializeIp65504P792ReservdS(ip65504P792ReservdS);
	}

	public void setIp65504P792ReservdS(int number) {
	    number = checkIp65504P792ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P792ReservdS((short)number);
	}
	public void setIp65504P792ReservdS(long number) {
	    number = checkIp65504P792ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P792ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P792ReservdL
	 *	@return ip65504P792ReservdL
	 */
	public short getIp65504P792ReservdL() throws CFException {
        if (isIp65504P792ReservdLModified()) { 
           ip65504P792ReservdL = refreshIp65504P792ReservdL();
        }
   		return ip65504P792ReservdL;
	}
	
	/**
	 * 	Update Ip65504P792ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P792-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P792ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P792ReservdL = checkIp65504P792ReservdLMaxLimit(number); 
		serializeIp65504P792ReservdL(ip65504P792ReservdL);
	}

	public void setIp65504P792ReservdL(int number) {
	    number = checkIp65504P792ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P792ReservdL((short)number);
	}
	public void setIp65504P792ReservdL(long number) {
	    number = checkIp65504P792ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P792ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P793ReservdS
	 *	@return ip65504P793ReservdS
	 */
	public short getIp65504P793ReservdS() throws CFException {
        if (isIp65504P793ReservdSModified()) { 
           ip65504P793ReservdS = refreshIp65504P793ReservdS();
        }
   		return ip65504P793ReservdS;
	}
	
	/**
	 * 	Update Ip65504P793ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P793-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P793ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P793ReservdS = checkIp65504P793ReservdSMaxLimit(number); 
		serializeIp65504P793ReservdS(ip65504P793ReservdS);
	}

	public void setIp65504P793ReservdS(int number) {
	    number = checkIp65504P793ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P793ReservdS((short)number);
	}
	public void setIp65504P793ReservdS(long number) {
	    number = checkIp65504P793ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P793ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P793ReservdL
	 *	@return ip65504P793ReservdL
	 */
	public short getIp65504P793ReservdL() throws CFException {
        if (isIp65504P793ReservdLModified()) { 
           ip65504P793ReservdL = refreshIp65504P793ReservdL();
        }
   		return ip65504P793ReservdL;
	}
	
	/**
	 * 	Update Ip65504P793ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P793-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P793ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P793ReservdL = checkIp65504P793ReservdLMaxLimit(number); 
		serializeIp65504P793ReservdL(ip65504P793ReservdL);
	}

	public void setIp65504P793ReservdL(int number) {
	    number = checkIp65504P793ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P793ReservdL((short)number);
	}
	public void setIp65504P793ReservdL(long number) {
	    number = checkIp65504P793ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P793ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P794ReservdS
	 *	@return ip65504P794ReservdS
	 */
	public short getIp65504P794ReservdS() throws CFException {
        if (isIp65504P794ReservdSModified()) { 
           ip65504P794ReservdS = refreshIp65504P794ReservdS();
        }
   		return ip65504P794ReservdS;
	}
	
	/**
	 * 	Update Ip65504P794ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P794-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P794ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P794ReservdS = checkIp65504P794ReservdSMaxLimit(number); 
		serializeIp65504P794ReservdS(ip65504P794ReservdS);
	}

	public void setIp65504P794ReservdS(int number) {
	    number = checkIp65504P794ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P794ReservdS((short)number);
	}
	public void setIp65504P794ReservdS(long number) {
	    number = checkIp65504P794ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P794ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P794ReservdL
	 *	@return ip65504P794ReservdL
	 */
	public short getIp65504P794ReservdL() throws CFException {
        if (isIp65504P794ReservdLModified()) { 
           ip65504P794ReservdL = refreshIp65504P794ReservdL();
        }
   		return ip65504P794ReservdL;
	}
	
	/**
	 * 	Update Ip65504P794ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P794-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P794ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P794ReservdL = checkIp65504P794ReservdLMaxLimit(number); 
		serializeIp65504P794ReservdL(ip65504P794ReservdL);
	}

	public void setIp65504P794ReservdL(int number) {
	    number = checkIp65504P794ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P794ReservdL((short)number);
	}
	public void setIp65504P794ReservdL(long number) {
	    number = checkIp65504P794ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P794ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P795ReservdS
	 *	@return ip65504P795ReservdS
	 */
	public short getIp65504P795ReservdS() throws CFException {
        if (isIp65504P795ReservdSModified()) { 
           ip65504P795ReservdS = refreshIp65504P795ReservdS();
        }
   		return ip65504P795ReservdS;
	}
	
	/**
	 * 	Update Ip65504P795ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P795-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P795ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P795ReservdS = checkIp65504P795ReservdSMaxLimit(number); 
		serializeIp65504P795ReservdS(ip65504P795ReservdS);
	}

	public void setIp65504P795ReservdS(int number) {
	    number = checkIp65504P795ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P795ReservdS((short)number);
	}
	public void setIp65504P795ReservdS(long number) {
	    number = checkIp65504P795ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P795ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P795ReservdL
	 *	@return ip65504P795ReservdL
	 */
	public short getIp65504P795ReservdL() throws CFException {
        if (isIp65504P795ReservdLModified()) { 
           ip65504P795ReservdL = refreshIp65504P795ReservdL();
        }
   		return ip65504P795ReservdL;
	}
	
	/**
	 * 	Update Ip65504P795ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P795-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P795ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P795ReservdL = checkIp65504P795ReservdLMaxLimit(number); 
		serializeIp65504P795ReservdL(ip65504P795ReservdL);
	}

	public void setIp65504P795ReservdL(int number) {
	    number = checkIp65504P795ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P795ReservdL((short)number);
	}
	public void setIp65504P795ReservdL(long number) {
	    number = checkIp65504P795ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P795ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P796ReservdS
	 *	@return ip65504P796ReservdS
	 */
	public short getIp65504P796ReservdS() throws CFException {
        if (isIp65504P796ReservdSModified()) { 
           ip65504P796ReservdS = refreshIp65504P796ReservdS();
        }
   		return ip65504P796ReservdS;
	}
	
	/**
	 * 	Update Ip65504P796ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P796-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P796ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P796ReservdS = checkIp65504P796ReservdSMaxLimit(number); 
		serializeIp65504P796ReservdS(ip65504P796ReservdS);
	}

	public void setIp65504P796ReservdS(int number) {
	    number = checkIp65504P796ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P796ReservdS((short)number);
	}
	public void setIp65504P796ReservdS(long number) {
	    number = checkIp65504P796ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P796ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P796ReservdL
	 *	@return ip65504P796ReservdL
	 */
	public short getIp65504P796ReservdL() throws CFException {
        if (isIp65504P796ReservdLModified()) { 
           ip65504P796ReservdL = refreshIp65504P796ReservdL();
        }
   		return ip65504P796ReservdL;
	}
	
	/**
	 * 	Update Ip65504P796ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P796-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P796ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P796ReservdL = checkIp65504P796ReservdLMaxLimit(number); 
		serializeIp65504P796ReservdL(ip65504P796ReservdL);
	}

	public void setIp65504P796ReservdL(int number) {
	    number = checkIp65504P796ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P796ReservdL((short)number);
	}
	public void setIp65504P796ReservdL(long number) {
	    number = checkIp65504P796ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P796ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P797ReservdS
	 *	@return ip65504P797ReservdS
	 */
	public short getIp65504P797ReservdS() throws CFException {
        if (isIp65504P797ReservdSModified()) { 
           ip65504P797ReservdS = refreshIp65504P797ReservdS();
        }
   		return ip65504P797ReservdS;
	}
	
	/**
	 * 	Update Ip65504P797ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P797-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P797ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P797ReservdS = checkIp65504P797ReservdSMaxLimit(number); 
		serializeIp65504P797ReservdS(ip65504P797ReservdS);
	}

	public void setIp65504P797ReservdS(int number) {
	    number = checkIp65504P797ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P797ReservdS((short)number);
	}
	public void setIp65504P797ReservdS(long number) {
	    number = checkIp65504P797ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P797ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P797ReservdL
	 *	@return ip65504P797ReservdL
	 */
	public short getIp65504P797ReservdL() throws CFException {
        if (isIp65504P797ReservdLModified()) { 
           ip65504P797ReservdL = refreshIp65504P797ReservdL();
        }
   		return ip65504P797ReservdL;
	}
	
	/**
	 * 	Update Ip65504P797ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P797-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P797ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P797ReservdL = checkIp65504P797ReservdLMaxLimit(number); 
		serializeIp65504P797ReservdL(ip65504P797ReservdL);
	}

	public void setIp65504P797ReservdL(int number) {
	    number = checkIp65504P797ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P797ReservdL((short)number);
	}
	public void setIp65504P797ReservdL(long number) {
	    number = checkIp65504P797ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P797ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P798ReservdS
	 *	@return ip65504P798ReservdS
	 */
	public short getIp65504P798ReservdS() throws CFException {
        if (isIp65504P798ReservdSModified()) { 
           ip65504P798ReservdS = refreshIp65504P798ReservdS();
        }
   		return ip65504P798ReservdS;
	}
	
	/**
	 * 	Update Ip65504P798ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P798-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P798ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P798ReservdS = checkIp65504P798ReservdSMaxLimit(number); 
		serializeIp65504P798ReservdS(ip65504P798ReservdS);
	}

	public void setIp65504P798ReservdS(int number) {
	    number = checkIp65504P798ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P798ReservdS((short)number);
	}
	public void setIp65504P798ReservdS(long number) {
	    number = checkIp65504P798ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P798ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P798ReservdL
	 *	@return ip65504P798ReservdL
	 */
	public short getIp65504P798ReservdL() throws CFException {
        if (isIp65504P798ReservdLModified()) { 
           ip65504P798ReservdL = refreshIp65504P798ReservdL();
        }
   		return ip65504P798ReservdL;
	}
	
	/**
	 * 	Update Ip65504P798ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P798-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P798ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P798ReservdL = checkIp65504P798ReservdLMaxLimit(number); 
		serializeIp65504P798ReservdL(ip65504P798ReservdL);
	}

	public void setIp65504P798ReservdL(int number) {
	    number = checkIp65504P798ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P798ReservdL((short)number);
	}
	public void setIp65504P798ReservdL(long number) {
	    number = checkIp65504P798ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P798ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P799ReservdS
	 *	@return ip65504P799ReservdS
	 */
	public short getIp65504P799ReservdS() throws CFException {
        if (isIp65504P799ReservdSModified()) { 
           ip65504P799ReservdS = refreshIp65504P799ReservdS();
        }
   		return ip65504P799ReservdS;
	}
	
	/**
	 * 	Update Ip65504P799ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P799-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P799ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P799ReservdS = checkIp65504P799ReservdSMaxLimit(number); 
		serializeIp65504P799ReservdS(ip65504P799ReservdS);
	}

	public void setIp65504P799ReservdS(int number) {
	    number = checkIp65504P799ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P799ReservdS((short)number);
	}
	public void setIp65504P799ReservdS(long number) {
	    number = checkIp65504P799ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P799ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P799ReservdL
	 *	@return ip65504P799ReservdL
	 */
	public short getIp65504P799ReservdL() throws CFException {
        if (isIp65504P799ReservdLModified()) { 
           ip65504P799ReservdL = refreshIp65504P799ReservdL();
        }
   		return ip65504P799ReservdL;
	}
	
	/**
	 * 	Update Ip65504P799ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P799-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P799ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P799ReservdL = checkIp65504P799ReservdLMaxLimit(number); 
		serializeIp65504P799ReservdL(ip65504P799ReservdL);
	}

	public void setIp65504P799ReservdL(int number) {
	    number = checkIp65504P799ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P799ReservdL((short)number);
	}
	public void setIp65504P799ReservdL(long number) {
	    number = checkIp65504P799ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P799ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P800ReservdS
	 *	@return ip65504P800ReservdS
	 */
	public short getIp65504P800ReservdS() throws CFException {
        if (isIp65504P800ReservdSModified()) { 
           ip65504P800ReservdS = refreshIp65504P800ReservdS();
        }
   		return ip65504P800ReservdS;
	}
	
	/**
	 * 	Update Ip65504P800ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P800-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P800ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P800ReservdS = checkIp65504P800ReservdSMaxLimit(number); 
		serializeIp65504P800ReservdS(ip65504P800ReservdS);
	}

	public void setIp65504P800ReservdS(int number) {
	    number = checkIp65504P800ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P800ReservdS((short)number);
	}
	public void setIp65504P800ReservdS(long number) {
	    number = checkIp65504P800ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P800ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P800ReservdL
	 *	@return ip65504P800ReservdL
	 */
	public short getIp65504P800ReservdL() throws CFException {
        if (isIp65504P800ReservdLModified()) { 
           ip65504P800ReservdL = refreshIp65504P800ReservdL();
        }
   		return ip65504P800ReservdL;
	}
	
	/**
	 * 	Update Ip65504P800ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P800-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P800ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P800ReservdL = checkIp65504P800ReservdLMaxLimit(number); 
		serializeIp65504P800ReservdL(ip65504P800ReservdL);
	}

	public void setIp65504P800ReservdL(int number) {
	    number = checkIp65504P800ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P800ReservdL((short)number);
	}
	public void setIp65504P800ReservdL(long number) {
	    number = checkIp65504P800ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P800ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P801ReservdS
	 *	@return ip65504P801ReservdS
	 */
	public short getIp65504P801ReservdS() throws CFException {
        if (isIp65504P801ReservdSModified()) { 
           ip65504P801ReservdS = refreshIp65504P801ReservdS();
        }
   		return ip65504P801ReservdS;
	}
	
	/**
	 * 	Update Ip65504P801ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P801-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P801ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P801ReservdS = checkIp65504P801ReservdSMaxLimit(number); 
		serializeIp65504P801ReservdS(ip65504P801ReservdS);
	}

	public void setIp65504P801ReservdS(int number) {
	    number = checkIp65504P801ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P801ReservdS((short)number);
	}
	public void setIp65504P801ReservdS(long number) {
	    number = checkIp65504P801ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P801ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P801ReservdL
	 *	@return ip65504P801ReservdL
	 */
	public short getIp65504P801ReservdL() throws CFException {
        if (isIp65504P801ReservdLModified()) { 
           ip65504P801ReservdL = refreshIp65504P801ReservdL();
        }
   		return ip65504P801ReservdL;
	}
	
	/**
	 * 	Update Ip65504P801ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P801-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P801ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P801ReservdL = checkIp65504P801ReservdLMaxLimit(number); 
		serializeIp65504P801ReservdL(ip65504P801ReservdL);
	}

	public void setIp65504P801ReservdL(int number) {
	    number = checkIp65504P801ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P801ReservdL((short)number);
	}
	public void setIp65504P801ReservdL(long number) {
	    number = checkIp65504P801ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P801ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P802ReservdS
	 *	@return ip65504P802ReservdS
	 */
	public short getIp65504P802ReservdS() throws CFException {
        if (isIp65504P802ReservdSModified()) { 
           ip65504P802ReservdS = refreshIp65504P802ReservdS();
        }
   		return ip65504P802ReservdS;
	}
	
	/**
	 * 	Update Ip65504P802ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P802-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P802ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P802ReservdS = checkIp65504P802ReservdSMaxLimit(number); 
		serializeIp65504P802ReservdS(ip65504P802ReservdS);
	}

	public void setIp65504P802ReservdS(int number) {
	    number = checkIp65504P802ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P802ReservdS((short)number);
	}
	public void setIp65504P802ReservdS(long number) {
	    number = checkIp65504P802ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P802ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P802ReservdL
	 *	@return ip65504P802ReservdL
	 */
	public short getIp65504P802ReservdL() throws CFException {
        if (isIp65504P802ReservdLModified()) { 
           ip65504P802ReservdL = refreshIp65504P802ReservdL();
        }
   		return ip65504P802ReservdL;
	}
	
	/**
	 * 	Update Ip65504P802ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P802-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P802ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P802ReservdL = checkIp65504P802ReservdLMaxLimit(number); 
		serializeIp65504P802ReservdL(ip65504P802ReservdL);
	}

	public void setIp65504P802ReservdL(int number) {
	    number = checkIp65504P802ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P802ReservdL((short)number);
	}
	public void setIp65504P802ReservdL(long number) {
	    number = checkIp65504P802ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P802ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P803ReservdS
	 *	@return ip65504P803ReservdS
	 */
	public short getIp65504P803ReservdS() throws CFException {
        if (isIp65504P803ReservdSModified()) { 
           ip65504P803ReservdS = refreshIp65504P803ReservdS();
        }
   		return ip65504P803ReservdS;
	}
	
	/**
	 * 	Update Ip65504P803ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P803-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P803ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P803ReservdS = checkIp65504P803ReservdSMaxLimit(number); 
		serializeIp65504P803ReservdS(ip65504P803ReservdS);
	}

	public void setIp65504P803ReservdS(int number) {
	    number = checkIp65504P803ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P803ReservdS((short)number);
	}
	public void setIp65504P803ReservdS(long number) {
	    number = checkIp65504P803ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P803ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P803ReservdL
	 *	@return ip65504P803ReservdL
	 */
	public short getIp65504P803ReservdL() throws CFException {
        if (isIp65504P803ReservdLModified()) { 
           ip65504P803ReservdL = refreshIp65504P803ReservdL();
        }
   		return ip65504P803ReservdL;
	}
	
	/**
	 * 	Update Ip65504P803ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P803-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P803ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P803ReservdL = checkIp65504P803ReservdLMaxLimit(number); 
		serializeIp65504P803ReservdL(ip65504P803ReservdL);
	}

	public void setIp65504P803ReservdL(int number) {
	    number = checkIp65504P803ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P803ReservdL((short)number);
	}
	public void setIp65504P803ReservdL(long number) {
	    number = checkIp65504P803ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P803ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P804ReservdS
	 *	@return ip65504P804ReservdS
	 */
	public short getIp65504P804ReservdS() throws CFException {
        if (isIp65504P804ReservdSModified()) { 
           ip65504P804ReservdS = refreshIp65504P804ReservdS();
        }
   		return ip65504P804ReservdS;
	}
	
	/**
	 * 	Update Ip65504P804ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P804-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P804ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P804ReservdS = checkIp65504P804ReservdSMaxLimit(number); 
		serializeIp65504P804ReservdS(ip65504P804ReservdS);
	}

	public void setIp65504P804ReservdS(int number) {
	    number = checkIp65504P804ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P804ReservdS((short)number);
	}
	public void setIp65504P804ReservdS(long number) {
	    number = checkIp65504P804ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P804ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P804ReservdL
	 *	@return ip65504P804ReservdL
	 */
	public short getIp65504P804ReservdL() throws CFException {
        if (isIp65504P804ReservdLModified()) { 
           ip65504P804ReservdL = refreshIp65504P804ReservdL();
        }
   		return ip65504P804ReservdL;
	}
	
	/**
	 * 	Update Ip65504P804ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P804-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P804ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P804ReservdL = checkIp65504P804ReservdLMaxLimit(number); 
		serializeIp65504P804ReservdL(ip65504P804ReservdL);
	}

	public void setIp65504P804ReservdL(int number) {
	    number = checkIp65504P804ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P804ReservdL((short)number);
	}
	public void setIp65504P804ReservdL(long number) {
	    number = checkIp65504P804ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P804ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P805ReservdS
	 *	@return ip65504P805ReservdS
	 */
	public short getIp65504P805ReservdS() throws CFException {
        if (isIp65504P805ReservdSModified()) { 
           ip65504P805ReservdS = refreshIp65504P805ReservdS();
        }
   		return ip65504P805ReservdS;
	}
	
	/**
	 * 	Update Ip65504P805ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P805-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P805ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P805ReservdS = checkIp65504P805ReservdSMaxLimit(number); 
		serializeIp65504P805ReservdS(ip65504P805ReservdS);
	}

	public void setIp65504P805ReservdS(int number) {
	    number = checkIp65504P805ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P805ReservdS((short)number);
	}
	public void setIp65504P805ReservdS(long number) {
	    number = checkIp65504P805ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P805ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P805ReservdL
	 *	@return ip65504P805ReservdL
	 */
	public short getIp65504P805ReservdL() throws CFException {
        if (isIp65504P805ReservdLModified()) { 
           ip65504P805ReservdL = refreshIp65504P805ReservdL();
        }
   		return ip65504P805ReservdL;
	}
	
	/**
	 * 	Update Ip65504P805ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P805-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P805ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P805ReservdL = checkIp65504P805ReservdLMaxLimit(number); 
		serializeIp65504P805ReservdL(ip65504P805ReservdL);
	}

	public void setIp65504P805ReservdL(int number) {
	    number = checkIp65504P805ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P805ReservdL((short)number);
	}
	public void setIp65504P805ReservdL(long number) {
	    number = checkIp65504P805ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P805ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P806ReservdS
	 *	@return ip65504P806ReservdS
	 */
	public short getIp65504P806ReservdS() throws CFException {
        if (isIp65504P806ReservdSModified()) { 
           ip65504P806ReservdS = refreshIp65504P806ReservdS();
        }
   		return ip65504P806ReservdS;
	}
	
	/**
	 * 	Update Ip65504P806ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P806-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P806ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P806ReservdS = checkIp65504P806ReservdSMaxLimit(number); 
		serializeIp65504P806ReservdS(ip65504P806ReservdS);
	}

	public void setIp65504P806ReservdS(int number) {
	    number = checkIp65504P806ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P806ReservdS((short)number);
	}
	public void setIp65504P806ReservdS(long number) {
	    number = checkIp65504P806ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P806ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P806ReservdL
	 *	@return ip65504P806ReservdL
	 */
	public short getIp65504P806ReservdL() throws CFException {
        if (isIp65504P806ReservdLModified()) { 
           ip65504P806ReservdL = refreshIp65504P806ReservdL();
        }
   		return ip65504P806ReservdL;
	}
	
	/**
	 * 	Update Ip65504P806ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P806-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P806ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P806ReservdL = checkIp65504P806ReservdLMaxLimit(number); 
		serializeIp65504P806ReservdL(ip65504P806ReservdL);
	}

	public void setIp65504P806ReservdL(int number) {
	    number = checkIp65504P806ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P806ReservdL((short)number);
	}
	public void setIp65504P806ReservdL(long number) {
	    number = checkIp65504P806ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P806ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup26
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P776ReservdS((short)0);
         	setIp65504P776ReservdL((short)0);
         	setIp65504P777ReservdS((short)0);
         	setIp65504P777ReservdL((short)0);
         	setIp65504P778ReservdS((short)0);
         	setIp65504P778ReservdL((short)0);
         	setIp65504P779ReservdS((short)0);
         	setIp65504P779ReservdL((short)0);
         	setIp65504P780ReservdS((short)0);
         	setIp65504P780ReservdL((short)0);
         	setIp65504P781ReservdS((short)0);
         	setIp65504P781ReservdL((short)0);
         	setIp65504P782ReservdS((short)0);
         	setIp65504P782ReservdL((short)0);
         	setIp65504P783ReservdS((short)0);
         	setIp65504P783ReservdL((short)0);
         	setIp65504P784ReservdS((short)0);
         	setIp65504P784ReservdL((short)0);
         	setIp65504P785ReservdS((short)0);
         	setIp65504P785ReservdL((short)0);
         	setIp65504P786ReservdS((short)0);
         	setIp65504P786ReservdL((short)0);
         	setIp65504P787ReservdS((short)0);
         	setIp65504P787ReservdL((short)0);
         	setIp65504P788ReservdS((short)0);
         	setIp65504P788ReservdL((short)0);
         	setIp65504P789ReservdS((short)0);
         	setIp65504P789ReservdL((short)0);
         	setIp65504P790ReservdS((short)0);
         	setIp65504P790ReservdL((short)0);
         	setIp65504P791ReservdS((short)0);
         	setIp65504P791ReservdL((short)0);
         	setIp65504P792ReservdS((short)0);
         	setIp65504P792ReservdL((short)0);
         	setIp65504P793ReservdS((short)0);
         	setIp65504P793ReservdL((short)0);
         	setIp65504P794ReservdS((short)0);
         	setIp65504P794ReservdL((short)0);
         	setIp65504P795ReservdS((short)0);
         	setIp65504P795ReservdL((short)0);
         	setIp65504P796ReservdS((short)0);
         	setIp65504P796ReservdL((short)0);
         	setIp65504P797ReservdS((short)0);
         	setIp65504P797ReservdL((short)0);
         	setIp65504P798ReservdS((short)0);
         	setIp65504P798ReservdL((short)0);
         	setIp65504P799ReservdS((short)0);
         	setIp65504P799ReservdL((short)0);
         	setIp65504P800ReservdS((short)0);
         	setIp65504P800ReservdL((short)0);
         	setIp65504P801ReservdS((short)0);
         	setIp65504P801ReservdL((short)0);
         	setIp65504P802ReservdS((short)0);
         	setIp65504P802ReservdL((short)0);
         	setIp65504P803ReservdS((short)0);
         	setIp65504P803ReservdL((short)0);
         	setIp65504P804ReservdS((short)0);
         	setIp65504P804ReservdL((short)0);
         	setIp65504P805ReservdS((short)0);
         	setIp65504P805ReservdL((short)0);
         	setIp65504P806ReservdS((short)0);
         	setIp65504P806ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup26FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_26_LENGTH;
		}

}
  
