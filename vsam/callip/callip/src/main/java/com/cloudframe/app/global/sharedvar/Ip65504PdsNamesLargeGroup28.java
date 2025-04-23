package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup28 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup28 extends Ip65504PdsNamesLargeGroup28Serialized { 
   

								private short ip65504P838ReservdS;

								private short ip65504P838ReservdL;


								private short ip65504P839ReservdS;

								private short ip65504P839ReservdL;


								private short ip65504P840ReservdS;

								private short ip65504P840ReservdL;


								private short ip65504P841ReservdS;

								private short ip65504P841ReservdL;


								private short ip65504P842ReservdS;

								private short ip65504P842ReservdL;


								private short ip65504P843ReservdS;

								private short ip65504P843ReservdL;


								private short ip65504P844ReservdS;

								private short ip65504P844ReservdL;


								private short ip65504P845ReservdS;

								private short ip65504P845ReservdL;


								private short ip65504P846ReservdS;

								private short ip65504P846ReservdL;


								private short ip65504P847ReservdS;

								private short ip65504P847ReservdL;


								private short ip65504P848ReservdS;

								private short ip65504P848ReservdL;


								private short ip65504P849ReservdS;

								private short ip65504P849ReservdL;


								private short ip65504P850ReservdS;

								private short ip65504P850ReservdL;


								private short ip65504P851ReservdS;

								private short ip65504P851ReservdL;


								private short ip65504P852ReservdS;

								private short ip65504P852ReservdL;


								private short ip65504P853ReservdS;

								private short ip65504P853ReservdL;


								private short ip65504P854ReservdS;

								private short ip65504P854ReservdL;


								private short ip65504P855ReservdS;

								private short ip65504P855ReservdL;


								private short ip65504P856ReservdS;

								private short ip65504P856ReservdL;


								private short ip65504P857ReservdS;

								private short ip65504P857ReservdL;


								private short ip65504P858ReservdS;

								private short ip65504P858ReservdL;


								private short ip65504P859ReservdS;

								private short ip65504P859ReservdL;


								private short ip65504P860ReservdS;

								private short ip65504P860ReservdL;


								private short ip65504P861ReservdS;

								private short ip65504P861ReservdL;


								private short ip65504P862ReservdS;

								private short ip65504P862ReservdL;


								private short ip65504P863ReservdS;

								private short ip65504P863ReservdL;


								private short ip65504P864ReservdS;

								private short ip65504P864ReservdL;


								private short ip65504P865ReservdS;

								private short ip65504P865ReservdL;


								private short ip65504P866ReservdS;

								private short ip65504P866ReservdL;


								private short ip65504P867ReservdS;

								private short ip65504P867ReservdL;


								private short ip65504P868ReservdS;

								private short ip65504P868ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup28
	**/
    public Ip65504PdsNamesLargeGroup28() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup28. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup28(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P838ReservdS
	 *	@return ip65504P838ReservdS
	 */
	public short getIp65504P838ReservdS() throws CFException {
        if (isIp65504P838ReservdSModified()) { 
           ip65504P838ReservdS = refreshIp65504P838ReservdS();
        }
   		return ip65504P838ReservdS;
	}
	
	/**
	 * 	Update Ip65504P838ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P838-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P838ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P838ReservdS = checkIp65504P838ReservdSMaxLimit(number); 
		serializeIp65504P838ReservdS(ip65504P838ReservdS);
	}

	public void setIp65504P838ReservdS(int number) {
	    number = checkIp65504P838ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P838ReservdS((short)number);
	}
	public void setIp65504P838ReservdS(long number) {
	    number = checkIp65504P838ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P838ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P838ReservdL
	 *	@return ip65504P838ReservdL
	 */
	public short getIp65504P838ReservdL() throws CFException {
        if (isIp65504P838ReservdLModified()) { 
           ip65504P838ReservdL = refreshIp65504P838ReservdL();
        }
   		return ip65504P838ReservdL;
	}
	
	/**
	 * 	Update Ip65504P838ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P838-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P838ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P838ReservdL = checkIp65504P838ReservdLMaxLimit(number); 
		serializeIp65504P838ReservdL(ip65504P838ReservdL);
	}

	public void setIp65504P838ReservdL(int number) {
	    number = checkIp65504P838ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P838ReservdL((short)number);
	}
	public void setIp65504P838ReservdL(long number) {
	    number = checkIp65504P838ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P838ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P839ReservdS
	 *	@return ip65504P839ReservdS
	 */
	public short getIp65504P839ReservdS() throws CFException {
        if (isIp65504P839ReservdSModified()) { 
           ip65504P839ReservdS = refreshIp65504P839ReservdS();
        }
   		return ip65504P839ReservdS;
	}
	
	/**
	 * 	Update Ip65504P839ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P839-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P839ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P839ReservdS = checkIp65504P839ReservdSMaxLimit(number); 
		serializeIp65504P839ReservdS(ip65504P839ReservdS);
	}

	public void setIp65504P839ReservdS(int number) {
	    number = checkIp65504P839ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P839ReservdS((short)number);
	}
	public void setIp65504P839ReservdS(long number) {
	    number = checkIp65504P839ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P839ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P839ReservdL
	 *	@return ip65504P839ReservdL
	 */
	public short getIp65504P839ReservdL() throws CFException {
        if (isIp65504P839ReservdLModified()) { 
           ip65504P839ReservdL = refreshIp65504P839ReservdL();
        }
   		return ip65504P839ReservdL;
	}
	
	/**
	 * 	Update Ip65504P839ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P839-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P839ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P839ReservdL = checkIp65504P839ReservdLMaxLimit(number); 
		serializeIp65504P839ReservdL(ip65504P839ReservdL);
	}

	public void setIp65504P839ReservdL(int number) {
	    number = checkIp65504P839ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P839ReservdL((short)number);
	}
	public void setIp65504P839ReservdL(long number) {
	    number = checkIp65504P839ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P839ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P840ReservdS
	 *	@return ip65504P840ReservdS
	 */
	public short getIp65504P840ReservdS() throws CFException {
        if (isIp65504P840ReservdSModified()) { 
           ip65504P840ReservdS = refreshIp65504P840ReservdS();
        }
   		return ip65504P840ReservdS;
	}
	
	/**
	 * 	Update Ip65504P840ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P840-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P840ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P840ReservdS = checkIp65504P840ReservdSMaxLimit(number); 
		serializeIp65504P840ReservdS(ip65504P840ReservdS);
	}

	public void setIp65504P840ReservdS(int number) {
	    number = checkIp65504P840ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P840ReservdS((short)number);
	}
	public void setIp65504P840ReservdS(long number) {
	    number = checkIp65504P840ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P840ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P840ReservdL
	 *	@return ip65504P840ReservdL
	 */
	public short getIp65504P840ReservdL() throws CFException {
        if (isIp65504P840ReservdLModified()) { 
           ip65504P840ReservdL = refreshIp65504P840ReservdL();
        }
   		return ip65504P840ReservdL;
	}
	
	/**
	 * 	Update Ip65504P840ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P840-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P840ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P840ReservdL = checkIp65504P840ReservdLMaxLimit(number); 
		serializeIp65504P840ReservdL(ip65504P840ReservdL);
	}

	public void setIp65504P840ReservdL(int number) {
	    number = checkIp65504P840ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P840ReservdL((short)number);
	}
	public void setIp65504P840ReservdL(long number) {
	    number = checkIp65504P840ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P840ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P841ReservdS
	 *	@return ip65504P841ReservdS
	 */
	public short getIp65504P841ReservdS() throws CFException {
        if (isIp65504P841ReservdSModified()) { 
           ip65504P841ReservdS = refreshIp65504P841ReservdS();
        }
   		return ip65504P841ReservdS;
	}
	
	/**
	 * 	Update Ip65504P841ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P841-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P841ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P841ReservdS = checkIp65504P841ReservdSMaxLimit(number); 
		serializeIp65504P841ReservdS(ip65504P841ReservdS);
	}

	public void setIp65504P841ReservdS(int number) {
	    number = checkIp65504P841ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P841ReservdS((short)number);
	}
	public void setIp65504P841ReservdS(long number) {
	    number = checkIp65504P841ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P841ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P841ReservdL
	 *	@return ip65504P841ReservdL
	 */
	public short getIp65504P841ReservdL() throws CFException {
        if (isIp65504P841ReservdLModified()) { 
           ip65504P841ReservdL = refreshIp65504P841ReservdL();
        }
   		return ip65504P841ReservdL;
	}
	
	/**
	 * 	Update Ip65504P841ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P841-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P841ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P841ReservdL = checkIp65504P841ReservdLMaxLimit(number); 
		serializeIp65504P841ReservdL(ip65504P841ReservdL);
	}

	public void setIp65504P841ReservdL(int number) {
	    number = checkIp65504P841ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P841ReservdL((short)number);
	}
	public void setIp65504P841ReservdL(long number) {
	    number = checkIp65504P841ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P841ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P842ReservdS
	 *	@return ip65504P842ReservdS
	 */
	public short getIp65504P842ReservdS() throws CFException {
        if (isIp65504P842ReservdSModified()) { 
           ip65504P842ReservdS = refreshIp65504P842ReservdS();
        }
   		return ip65504P842ReservdS;
	}
	
	/**
	 * 	Update Ip65504P842ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P842-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P842ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P842ReservdS = checkIp65504P842ReservdSMaxLimit(number); 
		serializeIp65504P842ReservdS(ip65504P842ReservdS);
	}

	public void setIp65504P842ReservdS(int number) {
	    number = checkIp65504P842ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P842ReservdS((short)number);
	}
	public void setIp65504P842ReservdS(long number) {
	    number = checkIp65504P842ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P842ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P842ReservdL
	 *	@return ip65504P842ReservdL
	 */
	public short getIp65504P842ReservdL() throws CFException {
        if (isIp65504P842ReservdLModified()) { 
           ip65504P842ReservdL = refreshIp65504P842ReservdL();
        }
   		return ip65504P842ReservdL;
	}
	
	/**
	 * 	Update Ip65504P842ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P842-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P842ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P842ReservdL = checkIp65504P842ReservdLMaxLimit(number); 
		serializeIp65504P842ReservdL(ip65504P842ReservdL);
	}

	public void setIp65504P842ReservdL(int number) {
	    number = checkIp65504P842ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P842ReservdL((short)number);
	}
	public void setIp65504P842ReservdL(long number) {
	    number = checkIp65504P842ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P842ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P843ReservdS
	 *	@return ip65504P843ReservdS
	 */
	public short getIp65504P843ReservdS() throws CFException {
        if (isIp65504P843ReservdSModified()) { 
           ip65504P843ReservdS = refreshIp65504P843ReservdS();
        }
   		return ip65504P843ReservdS;
	}
	
	/**
	 * 	Update Ip65504P843ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P843-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P843ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P843ReservdS = checkIp65504P843ReservdSMaxLimit(number); 
		serializeIp65504P843ReservdS(ip65504P843ReservdS);
	}

	public void setIp65504P843ReservdS(int number) {
	    number = checkIp65504P843ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P843ReservdS((short)number);
	}
	public void setIp65504P843ReservdS(long number) {
	    number = checkIp65504P843ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P843ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P843ReservdL
	 *	@return ip65504P843ReservdL
	 */
	public short getIp65504P843ReservdL() throws CFException {
        if (isIp65504P843ReservdLModified()) { 
           ip65504P843ReservdL = refreshIp65504P843ReservdL();
        }
   		return ip65504P843ReservdL;
	}
	
	/**
	 * 	Update Ip65504P843ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P843-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P843ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P843ReservdL = checkIp65504P843ReservdLMaxLimit(number); 
		serializeIp65504P843ReservdL(ip65504P843ReservdL);
	}

	public void setIp65504P843ReservdL(int number) {
	    number = checkIp65504P843ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P843ReservdL((short)number);
	}
	public void setIp65504P843ReservdL(long number) {
	    number = checkIp65504P843ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P843ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P844ReservdS
	 *	@return ip65504P844ReservdS
	 */
	public short getIp65504P844ReservdS() throws CFException {
        if (isIp65504P844ReservdSModified()) { 
           ip65504P844ReservdS = refreshIp65504P844ReservdS();
        }
   		return ip65504P844ReservdS;
	}
	
	/**
	 * 	Update Ip65504P844ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P844-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P844ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P844ReservdS = checkIp65504P844ReservdSMaxLimit(number); 
		serializeIp65504P844ReservdS(ip65504P844ReservdS);
	}

	public void setIp65504P844ReservdS(int number) {
	    number = checkIp65504P844ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P844ReservdS((short)number);
	}
	public void setIp65504P844ReservdS(long number) {
	    number = checkIp65504P844ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P844ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P844ReservdL
	 *	@return ip65504P844ReservdL
	 */
	public short getIp65504P844ReservdL() throws CFException {
        if (isIp65504P844ReservdLModified()) { 
           ip65504P844ReservdL = refreshIp65504P844ReservdL();
        }
   		return ip65504P844ReservdL;
	}
	
	/**
	 * 	Update Ip65504P844ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P844-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P844ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P844ReservdL = checkIp65504P844ReservdLMaxLimit(number); 
		serializeIp65504P844ReservdL(ip65504P844ReservdL);
	}

	public void setIp65504P844ReservdL(int number) {
	    number = checkIp65504P844ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P844ReservdL((short)number);
	}
	public void setIp65504P844ReservdL(long number) {
	    number = checkIp65504P844ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P844ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P845ReservdS
	 *	@return ip65504P845ReservdS
	 */
	public short getIp65504P845ReservdS() throws CFException {
        if (isIp65504P845ReservdSModified()) { 
           ip65504P845ReservdS = refreshIp65504P845ReservdS();
        }
   		return ip65504P845ReservdS;
	}
	
	/**
	 * 	Update Ip65504P845ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P845-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P845ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P845ReservdS = checkIp65504P845ReservdSMaxLimit(number); 
		serializeIp65504P845ReservdS(ip65504P845ReservdS);
	}

	public void setIp65504P845ReservdS(int number) {
	    number = checkIp65504P845ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P845ReservdS((short)number);
	}
	public void setIp65504P845ReservdS(long number) {
	    number = checkIp65504P845ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P845ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P845ReservdL
	 *	@return ip65504P845ReservdL
	 */
	public short getIp65504P845ReservdL() throws CFException {
        if (isIp65504P845ReservdLModified()) { 
           ip65504P845ReservdL = refreshIp65504P845ReservdL();
        }
   		return ip65504P845ReservdL;
	}
	
	/**
	 * 	Update Ip65504P845ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P845-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P845ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P845ReservdL = checkIp65504P845ReservdLMaxLimit(number); 
		serializeIp65504P845ReservdL(ip65504P845ReservdL);
	}

	public void setIp65504P845ReservdL(int number) {
	    number = checkIp65504P845ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P845ReservdL((short)number);
	}
	public void setIp65504P845ReservdL(long number) {
	    number = checkIp65504P845ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P845ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P846ReservdS
	 *	@return ip65504P846ReservdS
	 */
	public short getIp65504P846ReservdS() throws CFException {
        if (isIp65504P846ReservdSModified()) { 
           ip65504P846ReservdS = refreshIp65504P846ReservdS();
        }
   		return ip65504P846ReservdS;
	}
	
	/**
	 * 	Update Ip65504P846ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P846-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P846ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P846ReservdS = checkIp65504P846ReservdSMaxLimit(number); 
		serializeIp65504P846ReservdS(ip65504P846ReservdS);
	}

	public void setIp65504P846ReservdS(int number) {
	    number = checkIp65504P846ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P846ReservdS((short)number);
	}
	public void setIp65504P846ReservdS(long number) {
	    number = checkIp65504P846ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P846ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P846ReservdL
	 *	@return ip65504P846ReservdL
	 */
	public short getIp65504P846ReservdL() throws CFException {
        if (isIp65504P846ReservdLModified()) { 
           ip65504P846ReservdL = refreshIp65504P846ReservdL();
        }
   		return ip65504P846ReservdL;
	}
	
	/**
	 * 	Update Ip65504P846ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P846-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P846ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P846ReservdL = checkIp65504P846ReservdLMaxLimit(number); 
		serializeIp65504P846ReservdL(ip65504P846ReservdL);
	}

	public void setIp65504P846ReservdL(int number) {
	    number = checkIp65504P846ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P846ReservdL((short)number);
	}
	public void setIp65504P846ReservdL(long number) {
	    number = checkIp65504P846ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P846ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P847ReservdS
	 *	@return ip65504P847ReservdS
	 */
	public short getIp65504P847ReservdS() throws CFException {
        if (isIp65504P847ReservdSModified()) { 
           ip65504P847ReservdS = refreshIp65504P847ReservdS();
        }
   		return ip65504P847ReservdS;
	}
	
	/**
	 * 	Update Ip65504P847ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P847-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P847ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P847ReservdS = checkIp65504P847ReservdSMaxLimit(number); 
		serializeIp65504P847ReservdS(ip65504P847ReservdS);
	}

	public void setIp65504P847ReservdS(int number) {
	    number = checkIp65504P847ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P847ReservdS((short)number);
	}
	public void setIp65504P847ReservdS(long number) {
	    number = checkIp65504P847ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P847ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P847ReservdL
	 *	@return ip65504P847ReservdL
	 */
	public short getIp65504P847ReservdL() throws CFException {
        if (isIp65504P847ReservdLModified()) { 
           ip65504P847ReservdL = refreshIp65504P847ReservdL();
        }
   		return ip65504P847ReservdL;
	}
	
	/**
	 * 	Update Ip65504P847ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P847-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P847ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P847ReservdL = checkIp65504P847ReservdLMaxLimit(number); 
		serializeIp65504P847ReservdL(ip65504P847ReservdL);
	}

	public void setIp65504P847ReservdL(int number) {
	    number = checkIp65504P847ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P847ReservdL((short)number);
	}
	public void setIp65504P847ReservdL(long number) {
	    number = checkIp65504P847ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P847ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P848ReservdS
	 *	@return ip65504P848ReservdS
	 */
	public short getIp65504P848ReservdS() throws CFException {
        if (isIp65504P848ReservdSModified()) { 
           ip65504P848ReservdS = refreshIp65504P848ReservdS();
        }
   		return ip65504P848ReservdS;
	}
	
	/**
	 * 	Update Ip65504P848ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P848-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P848ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P848ReservdS = checkIp65504P848ReservdSMaxLimit(number); 
		serializeIp65504P848ReservdS(ip65504P848ReservdS);
	}

	public void setIp65504P848ReservdS(int number) {
	    number = checkIp65504P848ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P848ReservdS((short)number);
	}
	public void setIp65504P848ReservdS(long number) {
	    number = checkIp65504P848ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P848ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P848ReservdL
	 *	@return ip65504P848ReservdL
	 */
	public short getIp65504P848ReservdL() throws CFException {
        if (isIp65504P848ReservdLModified()) { 
           ip65504P848ReservdL = refreshIp65504P848ReservdL();
        }
   		return ip65504P848ReservdL;
	}
	
	/**
	 * 	Update Ip65504P848ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P848-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P848ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P848ReservdL = checkIp65504P848ReservdLMaxLimit(number); 
		serializeIp65504P848ReservdL(ip65504P848ReservdL);
	}

	public void setIp65504P848ReservdL(int number) {
	    number = checkIp65504P848ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P848ReservdL((short)number);
	}
	public void setIp65504P848ReservdL(long number) {
	    number = checkIp65504P848ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P848ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P849ReservdS
	 *	@return ip65504P849ReservdS
	 */
	public short getIp65504P849ReservdS() throws CFException {
        if (isIp65504P849ReservdSModified()) { 
           ip65504P849ReservdS = refreshIp65504P849ReservdS();
        }
   		return ip65504P849ReservdS;
	}
	
	/**
	 * 	Update Ip65504P849ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P849-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P849ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P849ReservdS = checkIp65504P849ReservdSMaxLimit(number); 
		serializeIp65504P849ReservdS(ip65504P849ReservdS);
	}

	public void setIp65504P849ReservdS(int number) {
	    number = checkIp65504P849ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P849ReservdS((short)number);
	}
	public void setIp65504P849ReservdS(long number) {
	    number = checkIp65504P849ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P849ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P849ReservdL
	 *	@return ip65504P849ReservdL
	 */
	public short getIp65504P849ReservdL() throws CFException {
        if (isIp65504P849ReservdLModified()) { 
           ip65504P849ReservdL = refreshIp65504P849ReservdL();
        }
   		return ip65504P849ReservdL;
	}
	
	/**
	 * 	Update Ip65504P849ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P849-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P849ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P849ReservdL = checkIp65504P849ReservdLMaxLimit(number); 
		serializeIp65504P849ReservdL(ip65504P849ReservdL);
	}

	public void setIp65504P849ReservdL(int number) {
	    number = checkIp65504P849ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P849ReservdL((short)number);
	}
	public void setIp65504P849ReservdL(long number) {
	    number = checkIp65504P849ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P849ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P850ReservdS
	 *	@return ip65504P850ReservdS
	 */
	public short getIp65504P850ReservdS() throws CFException {
        if (isIp65504P850ReservdSModified()) { 
           ip65504P850ReservdS = refreshIp65504P850ReservdS();
        }
   		return ip65504P850ReservdS;
	}
	
	/**
	 * 	Update Ip65504P850ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P850-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P850ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P850ReservdS = checkIp65504P850ReservdSMaxLimit(number); 
		serializeIp65504P850ReservdS(ip65504P850ReservdS);
	}

	public void setIp65504P850ReservdS(int number) {
	    number = checkIp65504P850ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P850ReservdS((short)number);
	}
	public void setIp65504P850ReservdS(long number) {
	    number = checkIp65504P850ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P850ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P850ReservdL
	 *	@return ip65504P850ReservdL
	 */
	public short getIp65504P850ReservdL() throws CFException {
        if (isIp65504P850ReservdLModified()) { 
           ip65504P850ReservdL = refreshIp65504P850ReservdL();
        }
   		return ip65504P850ReservdL;
	}
	
	/**
	 * 	Update Ip65504P850ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P850-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P850ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P850ReservdL = checkIp65504P850ReservdLMaxLimit(number); 
		serializeIp65504P850ReservdL(ip65504P850ReservdL);
	}

	public void setIp65504P850ReservdL(int number) {
	    number = checkIp65504P850ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P850ReservdL((short)number);
	}
	public void setIp65504P850ReservdL(long number) {
	    number = checkIp65504P850ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P850ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P851ReservdS
	 *	@return ip65504P851ReservdS
	 */
	public short getIp65504P851ReservdS() throws CFException {
        if (isIp65504P851ReservdSModified()) { 
           ip65504P851ReservdS = refreshIp65504P851ReservdS();
        }
   		return ip65504P851ReservdS;
	}
	
	/**
	 * 	Update Ip65504P851ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P851-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P851ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P851ReservdS = checkIp65504P851ReservdSMaxLimit(number); 
		serializeIp65504P851ReservdS(ip65504P851ReservdS);
	}

	public void setIp65504P851ReservdS(int number) {
	    number = checkIp65504P851ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P851ReservdS((short)number);
	}
	public void setIp65504P851ReservdS(long number) {
	    number = checkIp65504P851ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P851ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P851ReservdL
	 *	@return ip65504P851ReservdL
	 */
	public short getIp65504P851ReservdL() throws CFException {
        if (isIp65504P851ReservdLModified()) { 
           ip65504P851ReservdL = refreshIp65504P851ReservdL();
        }
   		return ip65504P851ReservdL;
	}
	
	/**
	 * 	Update Ip65504P851ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P851-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P851ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P851ReservdL = checkIp65504P851ReservdLMaxLimit(number); 
		serializeIp65504P851ReservdL(ip65504P851ReservdL);
	}

	public void setIp65504P851ReservdL(int number) {
	    number = checkIp65504P851ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P851ReservdL((short)number);
	}
	public void setIp65504P851ReservdL(long number) {
	    number = checkIp65504P851ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P851ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P852ReservdS
	 *	@return ip65504P852ReservdS
	 */
	public short getIp65504P852ReservdS() throws CFException {
        if (isIp65504P852ReservdSModified()) { 
           ip65504P852ReservdS = refreshIp65504P852ReservdS();
        }
   		return ip65504P852ReservdS;
	}
	
	/**
	 * 	Update Ip65504P852ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P852-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P852ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P852ReservdS = checkIp65504P852ReservdSMaxLimit(number); 
		serializeIp65504P852ReservdS(ip65504P852ReservdS);
	}

	public void setIp65504P852ReservdS(int number) {
	    number = checkIp65504P852ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P852ReservdS((short)number);
	}
	public void setIp65504P852ReservdS(long number) {
	    number = checkIp65504P852ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P852ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P852ReservdL
	 *	@return ip65504P852ReservdL
	 */
	public short getIp65504P852ReservdL() throws CFException {
        if (isIp65504P852ReservdLModified()) { 
           ip65504P852ReservdL = refreshIp65504P852ReservdL();
        }
   		return ip65504P852ReservdL;
	}
	
	/**
	 * 	Update Ip65504P852ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P852-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P852ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P852ReservdL = checkIp65504P852ReservdLMaxLimit(number); 
		serializeIp65504P852ReservdL(ip65504P852ReservdL);
	}

	public void setIp65504P852ReservdL(int number) {
	    number = checkIp65504P852ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P852ReservdL((short)number);
	}
	public void setIp65504P852ReservdL(long number) {
	    number = checkIp65504P852ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P852ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P853ReservdS
	 *	@return ip65504P853ReservdS
	 */
	public short getIp65504P853ReservdS() throws CFException {
        if (isIp65504P853ReservdSModified()) { 
           ip65504P853ReservdS = refreshIp65504P853ReservdS();
        }
   		return ip65504P853ReservdS;
	}
	
	/**
	 * 	Update Ip65504P853ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P853-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P853ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P853ReservdS = checkIp65504P853ReservdSMaxLimit(number); 
		serializeIp65504P853ReservdS(ip65504P853ReservdS);
	}

	public void setIp65504P853ReservdS(int number) {
	    number = checkIp65504P853ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P853ReservdS((short)number);
	}
	public void setIp65504P853ReservdS(long number) {
	    number = checkIp65504P853ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P853ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P853ReservdL
	 *	@return ip65504P853ReservdL
	 */
	public short getIp65504P853ReservdL() throws CFException {
        if (isIp65504P853ReservdLModified()) { 
           ip65504P853ReservdL = refreshIp65504P853ReservdL();
        }
   		return ip65504P853ReservdL;
	}
	
	/**
	 * 	Update Ip65504P853ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P853-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P853ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P853ReservdL = checkIp65504P853ReservdLMaxLimit(number); 
		serializeIp65504P853ReservdL(ip65504P853ReservdL);
	}

	public void setIp65504P853ReservdL(int number) {
	    number = checkIp65504P853ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P853ReservdL((short)number);
	}
	public void setIp65504P853ReservdL(long number) {
	    number = checkIp65504P853ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P853ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P854ReservdS
	 *	@return ip65504P854ReservdS
	 */
	public short getIp65504P854ReservdS() throws CFException {
        if (isIp65504P854ReservdSModified()) { 
           ip65504P854ReservdS = refreshIp65504P854ReservdS();
        }
   		return ip65504P854ReservdS;
	}
	
	/**
	 * 	Update Ip65504P854ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P854-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P854ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P854ReservdS = checkIp65504P854ReservdSMaxLimit(number); 
		serializeIp65504P854ReservdS(ip65504P854ReservdS);
	}

	public void setIp65504P854ReservdS(int number) {
	    number = checkIp65504P854ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P854ReservdS((short)number);
	}
	public void setIp65504P854ReservdS(long number) {
	    number = checkIp65504P854ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P854ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P854ReservdL
	 *	@return ip65504P854ReservdL
	 */
	public short getIp65504P854ReservdL() throws CFException {
        if (isIp65504P854ReservdLModified()) { 
           ip65504P854ReservdL = refreshIp65504P854ReservdL();
        }
   		return ip65504P854ReservdL;
	}
	
	/**
	 * 	Update Ip65504P854ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P854-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P854ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P854ReservdL = checkIp65504P854ReservdLMaxLimit(number); 
		serializeIp65504P854ReservdL(ip65504P854ReservdL);
	}

	public void setIp65504P854ReservdL(int number) {
	    number = checkIp65504P854ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P854ReservdL((short)number);
	}
	public void setIp65504P854ReservdL(long number) {
	    number = checkIp65504P854ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P854ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P855ReservdS
	 *	@return ip65504P855ReservdS
	 */
	public short getIp65504P855ReservdS() throws CFException {
        if (isIp65504P855ReservdSModified()) { 
           ip65504P855ReservdS = refreshIp65504P855ReservdS();
        }
   		return ip65504P855ReservdS;
	}
	
	/**
	 * 	Update Ip65504P855ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P855-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P855ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P855ReservdS = checkIp65504P855ReservdSMaxLimit(number); 
		serializeIp65504P855ReservdS(ip65504P855ReservdS);
	}

	public void setIp65504P855ReservdS(int number) {
	    number = checkIp65504P855ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P855ReservdS((short)number);
	}
	public void setIp65504P855ReservdS(long number) {
	    number = checkIp65504P855ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P855ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P855ReservdL
	 *	@return ip65504P855ReservdL
	 */
	public short getIp65504P855ReservdL() throws CFException {
        if (isIp65504P855ReservdLModified()) { 
           ip65504P855ReservdL = refreshIp65504P855ReservdL();
        }
   		return ip65504P855ReservdL;
	}
	
	/**
	 * 	Update Ip65504P855ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P855-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P855ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P855ReservdL = checkIp65504P855ReservdLMaxLimit(number); 
		serializeIp65504P855ReservdL(ip65504P855ReservdL);
	}

	public void setIp65504P855ReservdL(int number) {
	    number = checkIp65504P855ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P855ReservdL((short)number);
	}
	public void setIp65504P855ReservdL(long number) {
	    number = checkIp65504P855ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P855ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P856ReservdS
	 *	@return ip65504P856ReservdS
	 */
	public short getIp65504P856ReservdS() throws CFException {
        if (isIp65504P856ReservdSModified()) { 
           ip65504P856ReservdS = refreshIp65504P856ReservdS();
        }
   		return ip65504P856ReservdS;
	}
	
	/**
	 * 	Update Ip65504P856ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P856-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P856ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P856ReservdS = checkIp65504P856ReservdSMaxLimit(number); 
		serializeIp65504P856ReservdS(ip65504P856ReservdS);
	}

	public void setIp65504P856ReservdS(int number) {
	    number = checkIp65504P856ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P856ReservdS((short)number);
	}
	public void setIp65504P856ReservdS(long number) {
	    number = checkIp65504P856ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P856ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P856ReservdL
	 *	@return ip65504P856ReservdL
	 */
	public short getIp65504P856ReservdL() throws CFException {
        if (isIp65504P856ReservdLModified()) { 
           ip65504P856ReservdL = refreshIp65504P856ReservdL();
        }
   		return ip65504P856ReservdL;
	}
	
	/**
	 * 	Update Ip65504P856ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P856-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P856ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P856ReservdL = checkIp65504P856ReservdLMaxLimit(number); 
		serializeIp65504P856ReservdL(ip65504P856ReservdL);
	}

	public void setIp65504P856ReservdL(int number) {
	    number = checkIp65504P856ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P856ReservdL((short)number);
	}
	public void setIp65504P856ReservdL(long number) {
	    number = checkIp65504P856ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P856ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P857ReservdS
	 *	@return ip65504P857ReservdS
	 */
	public short getIp65504P857ReservdS() throws CFException {
        if (isIp65504P857ReservdSModified()) { 
           ip65504P857ReservdS = refreshIp65504P857ReservdS();
        }
   		return ip65504P857ReservdS;
	}
	
	/**
	 * 	Update Ip65504P857ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P857-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P857ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P857ReservdS = checkIp65504P857ReservdSMaxLimit(number); 
		serializeIp65504P857ReservdS(ip65504P857ReservdS);
	}

	public void setIp65504P857ReservdS(int number) {
	    number = checkIp65504P857ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P857ReservdS((short)number);
	}
	public void setIp65504P857ReservdS(long number) {
	    number = checkIp65504P857ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P857ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P857ReservdL
	 *	@return ip65504P857ReservdL
	 */
	public short getIp65504P857ReservdL() throws CFException {
        if (isIp65504P857ReservdLModified()) { 
           ip65504P857ReservdL = refreshIp65504P857ReservdL();
        }
   		return ip65504P857ReservdL;
	}
	
	/**
	 * 	Update Ip65504P857ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P857-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P857ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P857ReservdL = checkIp65504P857ReservdLMaxLimit(number); 
		serializeIp65504P857ReservdL(ip65504P857ReservdL);
	}

	public void setIp65504P857ReservdL(int number) {
	    number = checkIp65504P857ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P857ReservdL((short)number);
	}
	public void setIp65504P857ReservdL(long number) {
	    number = checkIp65504P857ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P857ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P858ReservdS
	 *	@return ip65504P858ReservdS
	 */
	public short getIp65504P858ReservdS() throws CFException {
        if (isIp65504P858ReservdSModified()) { 
           ip65504P858ReservdS = refreshIp65504P858ReservdS();
        }
   		return ip65504P858ReservdS;
	}
	
	/**
	 * 	Update Ip65504P858ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P858-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P858ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P858ReservdS = checkIp65504P858ReservdSMaxLimit(number); 
		serializeIp65504P858ReservdS(ip65504P858ReservdS);
	}

	public void setIp65504P858ReservdS(int number) {
	    number = checkIp65504P858ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P858ReservdS((short)number);
	}
	public void setIp65504P858ReservdS(long number) {
	    number = checkIp65504P858ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P858ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P858ReservdL
	 *	@return ip65504P858ReservdL
	 */
	public short getIp65504P858ReservdL() throws CFException {
        if (isIp65504P858ReservdLModified()) { 
           ip65504P858ReservdL = refreshIp65504P858ReservdL();
        }
   		return ip65504P858ReservdL;
	}
	
	/**
	 * 	Update Ip65504P858ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P858-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P858ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P858ReservdL = checkIp65504P858ReservdLMaxLimit(number); 
		serializeIp65504P858ReservdL(ip65504P858ReservdL);
	}

	public void setIp65504P858ReservdL(int number) {
	    number = checkIp65504P858ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P858ReservdL((short)number);
	}
	public void setIp65504P858ReservdL(long number) {
	    number = checkIp65504P858ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P858ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P859ReservdS
	 *	@return ip65504P859ReservdS
	 */
	public short getIp65504P859ReservdS() throws CFException {
        if (isIp65504P859ReservdSModified()) { 
           ip65504P859ReservdS = refreshIp65504P859ReservdS();
        }
   		return ip65504P859ReservdS;
	}
	
	/**
	 * 	Update Ip65504P859ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P859-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P859ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P859ReservdS = checkIp65504P859ReservdSMaxLimit(number); 
		serializeIp65504P859ReservdS(ip65504P859ReservdS);
	}

	public void setIp65504P859ReservdS(int number) {
	    number = checkIp65504P859ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P859ReservdS((short)number);
	}
	public void setIp65504P859ReservdS(long number) {
	    number = checkIp65504P859ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P859ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P859ReservdL
	 *	@return ip65504P859ReservdL
	 */
	public short getIp65504P859ReservdL() throws CFException {
        if (isIp65504P859ReservdLModified()) { 
           ip65504P859ReservdL = refreshIp65504P859ReservdL();
        }
   		return ip65504P859ReservdL;
	}
	
	/**
	 * 	Update Ip65504P859ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P859-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P859ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P859ReservdL = checkIp65504P859ReservdLMaxLimit(number); 
		serializeIp65504P859ReservdL(ip65504P859ReservdL);
	}

	public void setIp65504P859ReservdL(int number) {
	    number = checkIp65504P859ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P859ReservdL((short)number);
	}
	public void setIp65504P859ReservdL(long number) {
	    number = checkIp65504P859ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P859ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P860ReservdS
	 *	@return ip65504P860ReservdS
	 */
	public short getIp65504P860ReservdS() throws CFException {
        if (isIp65504P860ReservdSModified()) { 
           ip65504P860ReservdS = refreshIp65504P860ReservdS();
        }
   		return ip65504P860ReservdS;
	}
	
	/**
	 * 	Update Ip65504P860ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P860-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P860ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P860ReservdS = checkIp65504P860ReservdSMaxLimit(number); 
		serializeIp65504P860ReservdS(ip65504P860ReservdS);
	}

	public void setIp65504P860ReservdS(int number) {
	    number = checkIp65504P860ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P860ReservdS((short)number);
	}
	public void setIp65504P860ReservdS(long number) {
	    number = checkIp65504P860ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P860ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P860ReservdL
	 *	@return ip65504P860ReservdL
	 */
	public short getIp65504P860ReservdL() throws CFException {
        if (isIp65504P860ReservdLModified()) { 
           ip65504P860ReservdL = refreshIp65504P860ReservdL();
        }
   		return ip65504P860ReservdL;
	}
	
	/**
	 * 	Update Ip65504P860ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P860-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P860ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P860ReservdL = checkIp65504P860ReservdLMaxLimit(number); 
		serializeIp65504P860ReservdL(ip65504P860ReservdL);
	}

	public void setIp65504P860ReservdL(int number) {
	    number = checkIp65504P860ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P860ReservdL((short)number);
	}
	public void setIp65504P860ReservdL(long number) {
	    number = checkIp65504P860ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P860ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P861ReservdS
	 *	@return ip65504P861ReservdS
	 */
	public short getIp65504P861ReservdS() throws CFException {
        if (isIp65504P861ReservdSModified()) { 
           ip65504P861ReservdS = refreshIp65504P861ReservdS();
        }
   		return ip65504P861ReservdS;
	}
	
	/**
	 * 	Update Ip65504P861ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P861-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P861ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P861ReservdS = checkIp65504P861ReservdSMaxLimit(number); 
		serializeIp65504P861ReservdS(ip65504P861ReservdS);
	}

	public void setIp65504P861ReservdS(int number) {
	    number = checkIp65504P861ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P861ReservdS((short)number);
	}
	public void setIp65504P861ReservdS(long number) {
	    number = checkIp65504P861ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P861ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P861ReservdL
	 *	@return ip65504P861ReservdL
	 */
	public short getIp65504P861ReservdL() throws CFException {
        if (isIp65504P861ReservdLModified()) { 
           ip65504P861ReservdL = refreshIp65504P861ReservdL();
        }
   		return ip65504P861ReservdL;
	}
	
	/**
	 * 	Update Ip65504P861ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P861-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P861ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P861ReservdL = checkIp65504P861ReservdLMaxLimit(number); 
		serializeIp65504P861ReservdL(ip65504P861ReservdL);
	}

	public void setIp65504P861ReservdL(int number) {
	    number = checkIp65504P861ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P861ReservdL((short)number);
	}
	public void setIp65504P861ReservdL(long number) {
	    number = checkIp65504P861ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P861ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P862ReservdS
	 *	@return ip65504P862ReservdS
	 */
	public short getIp65504P862ReservdS() throws CFException {
        if (isIp65504P862ReservdSModified()) { 
           ip65504P862ReservdS = refreshIp65504P862ReservdS();
        }
   		return ip65504P862ReservdS;
	}
	
	/**
	 * 	Update Ip65504P862ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P862-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P862ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P862ReservdS = checkIp65504P862ReservdSMaxLimit(number); 
		serializeIp65504P862ReservdS(ip65504P862ReservdS);
	}

	public void setIp65504P862ReservdS(int number) {
	    number = checkIp65504P862ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P862ReservdS((short)number);
	}
	public void setIp65504P862ReservdS(long number) {
	    number = checkIp65504P862ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P862ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P862ReservdL
	 *	@return ip65504P862ReservdL
	 */
	public short getIp65504P862ReservdL() throws CFException {
        if (isIp65504P862ReservdLModified()) { 
           ip65504P862ReservdL = refreshIp65504P862ReservdL();
        }
   		return ip65504P862ReservdL;
	}
	
	/**
	 * 	Update Ip65504P862ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P862-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P862ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P862ReservdL = checkIp65504P862ReservdLMaxLimit(number); 
		serializeIp65504P862ReservdL(ip65504P862ReservdL);
	}

	public void setIp65504P862ReservdL(int number) {
	    number = checkIp65504P862ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P862ReservdL((short)number);
	}
	public void setIp65504P862ReservdL(long number) {
	    number = checkIp65504P862ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P862ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P863ReservdS
	 *	@return ip65504P863ReservdS
	 */
	public short getIp65504P863ReservdS() throws CFException {
        if (isIp65504P863ReservdSModified()) { 
           ip65504P863ReservdS = refreshIp65504P863ReservdS();
        }
   		return ip65504P863ReservdS;
	}
	
	/**
	 * 	Update Ip65504P863ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P863-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P863ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P863ReservdS = checkIp65504P863ReservdSMaxLimit(number); 
		serializeIp65504P863ReservdS(ip65504P863ReservdS);
	}

	public void setIp65504P863ReservdS(int number) {
	    number = checkIp65504P863ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P863ReservdS((short)number);
	}
	public void setIp65504P863ReservdS(long number) {
	    number = checkIp65504P863ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P863ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P863ReservdL
	 *	@return ip65504P863ReservdL
	 */
	public short getIp65504P863ReservdL() throws CFException {
        if (isIp65504P863ReservdLModified()) { 
           ip65504P863ReservdL = refreshIp65504P863ReservdL();
        }
   		return ip65504P863ReservdL;
	}
	
	/**
	 * 	Update Ip65504P863ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P863-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P863ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P863ReservdL = checkIp65504P863ReservdLMaxLimit(number); 
		serializeIp65504P863ReservdL(ip65504P863ReservdL);
	}

	public void setIp65504P863ReservdL(int number) {
	    number = checkIp65504P863ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P863ReservdL((short)number);
	}
	public void setIp65504P863ReservdL(long number) {
	    number = checkIp65504P863ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P863ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P864ReservdS
	 *	@return ip65504P864ReservdS
	 */
	public short getIp65504P864ReservdS() throws CFException {
        if (isIp65504P864ReservdSModified()) { 
           ip65504P864ReservdS = refreshIp65504P864ReservdS();
        }
   		return ip65504P864ReservdS;
	}
	
	/**
	 * 	Update Ip65504P864ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P864-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P864ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P864ReservdS = checkIp65504P864ReservdSMaxLimit(number); 
		serializeIp65504P864ReservdS(ip65504P864ReservdS);
	}

	public void setIp65504P864ReservdS(int number) {
	    number = checkIp65504P864ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P864ReservdS((short)number);
	}
	public void setIp65504P864ReservdS(long number) {
	    number = checkIp65504P864ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P864ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P864ReservdL
	 *	@return ip65504P864ReservdL
	 */
	public short getIp65504P864ReservdL() throws CFException {
        if (isIp65504P864ReservdLModified()) { 
           ip65504P864ReservdL = refreshIp65504P864ReservdL();
        }
   		return ip65504P864ReservdL;
	}
	
	/**
	 * 	Update Ip65504P864ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P864-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P864ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P864ReservdL = checkIp65504P864ReservdLMaxLimit(number); 
		serializeIp65504P864ReservdL(ip65504P864ReservdL);
	}

	public void setIp65504P864ReservdL(int number) {
	    number = checkIp65504P864ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P864ReservdL((short)number);
	}
	public void setIp65504P864ReservdL(long number) {
	    number = checkIp65504P864ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P864ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P865ReservdS
	 *	@return ip65504P865ReservdS
	 */
	public short getIp65504P865ReservdS() throws CFException {
        if (isIp65504P865ReservdSModified()) { 
           ip65504P865ReservdS = refreshIp65504P865ReservdS();
        }
   		return ip65504P865ReservdS;
	}
	
	/**
	 * 	Update Ip65504P865ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P865-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P865ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P865ReservdS = checkIp65504P865ReservdSMaxLimit(number); 
		serializeIp65504P865ReservdS(ip65504P865ReservdS);
	}

	public void setIp65504P865ReservdS(int number) {
	    number = checkIp65504P865ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P865ReservdS((short)number);
	}
	public void setIp65504P865ReservdS(long number) {
	    number = checkIp65504P865ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P865ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P865ReservdL
	 *	@return ip65504P865ReservdL
	 */
	public short getIp65504P865ReservdL() throws CFException {
        if (isIp65504P865ReservdLModified()) { 
           ip65504P865ReservdL = refreshIp65504P865ReservdL();
        }
   		return ip65504P865ReservdL;
	}
	
	/**
	 * 	Update Ip65504P865ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P865-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P865ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P865ReservdL = checkIp65504P865ReservdLMaxLimit(number); 
		serializeIp65504P865ReservdL(ip65504P865ReservdL);
	}

	public void setIp65504P865ReservdL(int number) {
	    number = checkIp65504P865ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P865ReservdL((short)number);
	}
	public void setIp65504P865ReservdL(long number) {
	    number = checkIp65504P865ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P865ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P866ReservdS
	 *	@return ip65504P866ReservdS
	 */
	public short getIp65504P866ReservdS() throws CFException {
        if (isIp65504P866ReservdSModified()) { 
           ip65504P866ReservdS = refreshIp65504P866ReservdS();
        }
   		return ip65504P866ReservdS;
	}
	
	/**
	 * 	Update Ip65504P866ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P866-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P866ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P866ReservdS = checkIp65504P866ReservdSMaxLimit(number); 
		serializeIp65504P866ReservdS(ip65504P866ReservdS);
	}

	public void setIp65504P866ReservdS(int number) {
	    number = checkIp65504P866ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P866ReservdS((short)number);
	}
	public void setIp65504P866ReservdS(long number) {
	    number = checkIp65504P866ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P866ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P866ReservdL
	 *	@return ip65504P866ReservdL
	 */
	public short getIp65504P866ReservdL() throws CFException {
        if (isIp65504P866ReservdLModified()) { 
           ip65504P866ReservdL = refreshIp65504P866ReservdL();
        }
   		return ip65504P866ReservdL;
	}
	
	/**
	 * 	Update Ip65504P866ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P866-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P866ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P866ReservdL = checkIp65504P866ReservdLMaxLimit(number); 
		serializeIp65504P866ReservdL(ip65504P866ReservdL);
	}

	public void setIp65504P866ReservdL(int number) {
	    number = checkIp65504P866ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P866ReservdL((short)number);
	}
	public void setIp65504P866ReservdL(long number) {
	    number = checkIp65504P866ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P866ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P867ReservdS
	 *	@return ip65504P867ReservdS
	 */
	public short getIp65504P867ReservdS() throws CFException {
        if (isIp65504P867ReservdSModified()) { 
           ip65504P867ReservdS = refreshIp65504P867ReservdS();
        }
   		return ip65504P867ReservdS;
	}
	
	/**
	 * 	Update Ip65504P867ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P867-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P867ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P867ReservdS = checkIp65504P867ReservdSMaxLimit(number); 
		serializeIp65504P867ReservdS(ip65504P867ReservdS);
	}

	public void setIp65504P867ReservdS(int number) {
	    number = checkIp65504P867ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P867ReservdS((short)number);
	}
	public void setIp65504P867ReservdS(long number) {
	    number = checkIp65504P867ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P867ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P867ReservdL
	 *	@return ip65504P867ReservdL
	 */
	public short getIp65504P867ReservdL() throws CFException {
        if (isIp65504P867ReservdLModified()) { 
           ip65504P867ReservdL = refreshIp65504P867ReservdL();
        }
   		return ip65504P867ReservdL;
	}
	
	/**
	 * 	Update Ip65504P867ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P867-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P867ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P867ReservdL = checkIp65504P867ReservdLMaxLimit(number); 
		serializeIp65504P867ReservdL(ip65504P867ReservdL);
	}

	public void setIp65504P867ReservdL(int number) {
	    number = checkIp65504P867ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P867ReservdL((short)number);
	}
	public void setIp65504P867ReservdL(long number) {
	    number = checkIp65504P867ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P867ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P868ReservdS
	 *	@return ip65504P868ReservdS
	 */
	public short getIp65504P868ReservdS() throws CFException {
        if (isIp65504P868ReservdSModified()) { 
           ip65504P868ReservdS = refreshIp65504P868ReservdS();
        }
   		return ip65504P868ReservdS;
	}
	
	/**
	 * 	Update Ip65504P868ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P868-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P868ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P868ReservdS = checkIp65504P868ReservdSMaxLimit(number); 
		serializeIp65504P868ReservdS(ip65504P868ReservdS);
	}

	public void setIp65504P868ReservdS(int number) {
	    number = checkIp65504P868ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P868ReservdS((short)number);
	}
	public void setIp65504P868ReservdS(long number) {
	    number = checkIp65504P868ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P868ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P868ReservdL
	 *	@return ip65504P868ReservdL
	 */
	public short getIp65504P868ReservdL() throws CFException {
        if (isIp65504P868ReservdLModified()) { 
           ip65504P868ReservdL = refreshIp65504P868ReservdL();
        }
   		return ip65504P868ReservdL;
	}
	
	/**
	 * 	Update Ip65504P868ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P868-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P868ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P868ReservdL = checkIp65504P868ReservdLMaxLimit(number); 
		serializeIp65504P868ReservdL(ip65504P868ReservdL);
	}

	public void setIp65504P868ReservdL(int number) {
	    number = checkIp65504P868ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P868ReservdL((short)number);
	}
	public void setIp65504P868ReservdL(long number) {
	    number = checkIp65504P868ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P868ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup28
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P838ReservdS((short)0);
         	setIp65504P838ReservdL((short)0);
         	setIp65504P839ReservdS((short)0);
         	setIp65504P839ReservdL((short)0);
         	setIp65504P840ReservdS((short)0);
         	setIp65504P840ReservdL((short)0);
         	setIp65504P841ReservdS((short)0);
         	setIp65504P841ReservdL((short)0);
         	setIp65504P842ReservdS((short)0);
         	setIp65504P842ReservdL((short)0);
         	setIp65504P843ReservdS((short)0);
         	setIp65504P843ReservdL((short)0);
         	setIp65504P844ReservdS((short)0);
         	setIp65504P844ReservdL((short)0);
         	setIp65504P845ReservdS((short)0);
         	setIp65504P845ReservdL((short)0);
         	setIp65504P846ReservdS((short)0);
         	setIp65504P846ReservdL((short)0);
         	setIp65504P847ReservdS((short)0);
         	setIp65504P847ReservdL((short)0);
         	setIp65504P848ReservdS((short)0);
         	setIp65504P848ReservdL((short)0);
         	setIp65504P849ReservdS((short)0);
         	setIp65504P849ReservdL((short)0);
         	setIp65504P850ReservdS((short)0);
         	setIp65504P850ReservdL((short)0);
         	setIp65504P851ReservdS((short)0);
         	setIp65504P851ReservdL((short)0);
         	setIp65504P852ReservdS((short)0);
         	setIp65504P852ReservdL((short)0);
         	setIp65504P853ReservdS((short)0);
         	setIp65504P853ReservdL((short)0);
         	setIp65504P854ReservdS((short)0);
         	setIp65504P854ReservdL((short)0);
         	setIp65504P855ReservdS((short)0);
         	setIp65504P855ReservdL((short)0);
         	setIp65504P856ReservdS((short)0);
         	setIp65504P856ReservdL((short)0);
         	setIp65504P857ReservdS((short)0);
         	setIp65504P857ReservdL((short)0);
         	setIp65504P858ReservdS((short)0);
         	setIp65504P858ReservdL((short)0);
         	setIp65504P859ReservdS((short)0);
         	setIp65504P859ReservdL((short)0);
         	setIp65504P860ReservdS((short)0);
         	setIp65504P860ReservdL((short)0);
         	setIp65504P861ReservdS((short)0);
         	setIp65504P861ReservdL((short)0);
         	setIp65504P862ReservdS((short)0);
         	setIp65504P862ReservdL((short)0);
         	setIp65504P863ReservdS((short)0);
         	setIp65504P863ReservdL((short)0);
         	setIp65504P864ReservdS((short)0);
         	setIp65504P864ReservdL((short)0);
         	setIp65504P865ReservdS((short)0);
         	setIp65504P865ReservdL((short)0);
         	setIp65504P866ReservdS((short)0);
         	setIp65504P866ReservdL((short)0);
         	setIp65504P867ReservdS((short)0);
         	setIp65504P867ReservdL((short)0);
         	setIp65504P868ReservdS((short)0);
         	setIp65504P868ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup28FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_28_LENGTH;
		}

}
  
