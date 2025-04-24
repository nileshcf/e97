package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup3 extends Ip65504PdsNamesLargeGroup3Serialized { 
   

								private short ip65504P063ReservdS;

								private short ip65504P063ReservdL;


								private short ip65504P064ReservdS;

								private short ip65504P064ReservdL;


								private short ip65504P065ReservdS;

								private short ip65504P065ReservdL;


								private short ip65504P066ReservdS;

								private short ip65504P066ReservdL;


								private short ip65504P067ReservdS;

								private short ip65504P067ReservdL;


								private short ip65504P068ReservdS;

								private short ip65504P068ReservdL;


								private short ip65504P069ReservdS;

								private short ip65504P069ReservdL;


								private short ip65504P070ReservdS;

								private short ip65504P070ReservdL;


								private short ip65504P071ReservdS;

								private short ip65504P071ReservdL;


								private short ip65504P072ReservdS;

								private short ip65504P072ReservdL;


								private short ip65504P073ReservdS;

								private short ip65504P073ReservdL;


								private short ip65504P074ReservdS;

								private short ip65504P074ReservdL;


								private short ip65504P075ReservdS;

								private short ip65504P075ReservdL;


								private short ip65504P076ReservdS;

								private short ip65504P076ReservdL;


								private short ip65504P077ReservdS;

								private short ip65504P077ReservdL;


								private short ip65504P078ReservdS;

								private short ip65504P078ReservdL;


								private short ip65504P079ReservdS;

								private short ip65504P079ReservdL;


								private short ip65504P080ReservdS;

								private short ip65504P080ReservdL;


								private short ip65504P081ReservdS;

								private short ip65504P081ReservdL;


								private short ip65504P082ReservdS;

								private short ip65504P082ReservdL;


								private short ip65504P083AvsRspS;

								private short ip65504P083AvsRspL;


								private short ip65504P084AimMerS;

								private short ip65504P084AimMerL;


								private short ip65504P085AimFrdS;

								private short ip65504P085AimFrdL;


								private short ip65504P086AimOrdS;

								private short ip65504P086AimOrdL;


								private short ip65504P087ReservdS;

								private short ip65504P087ReservdL;


								private short ip65504P088CrdSecS;

								private short ip65504P088CrdSecL;


								private short ip65504P089ReservdS;

								private short ip65504P089ReservdL;


								private short ip65504P090ReservdS;

								private short ip65504P090ReservdL;


								private short ip65504P091ReservdS;

								private short ip65504P091ReservdL;


								private short ip65504P092ReservdS;

								private short ip65504P092ReservdL;


								private short ip65504P093AimRspS;

								private short ip65504P093AimRspL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup3
	**/
    public Ip65504PdsNamesLargeGroup3() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P063ReservdS
	 *	@return ip65504P063ReservdS
	 */
	public short getIp65504P063ReservdS() throws CFException {
        if (isIp65504P063ReservdSModified()) { 
           ip65504P063ReservdS = refreshIp65504P063ReservdS();
        }
   		return ip65504P063ReservdS;
	}
	
	/**
	 * 	Update Ip65504P063ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P063-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P063ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P063ReservdS = checkIp65504P063ReservdSMaxLimit(number); 
		serializeIp65504P063ReservdS(ip65504P063ReservdS);
	}

	public void setIp65504P063ReservdS(int number) {
	    number = checkIp65504P063ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P063ReservdS((short)number);
	}
	public void setIp65504P063ReservdS(long number) {
	    number = checkIp65504P063ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P063ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P063ReservdL
	 *	@return ip65504P063ReservdL
	 */
	public short getIp65504P063ReservdL() throws CFException {
        if (isIp65504P063ReservdLModified()) { 
           ip65504P063ReservdL = refreshIp65504P063ReservdL();
        }
   		return ip65504P063ReservdL;
	}
	
	/**
	 * 	Update Ip65504P063ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P063-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P063ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P063ReservdL = checkIp65504P063ReservdLMaxLimit(number); 
		serializeIp65504P063ReservdL(ip65504P063ReservdL);
	}

	public void setIp65504P063ReservdL(int number) {
	    number = checkIp65504P063ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P063ReservdL((short)number);
	}
	public void setIp65504P063ReservdL(long number) {
	    number = checkIp65504P063ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P063ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P064ReservdS
	 *	@return ip65504P064ReservdS
	 */
	public short getIp65504P064ReservdS() throws CFException {
        if (isIp65504P064ReservdSModified()) { 
           ip65504P064ReservdS = refreshIp65504P064ReservdS();
        }
   		return ip65504P064ReservdS;
	}
	
	/**
	 * 	Update Ip65504P064ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P064-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P064ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P064ReservdS = checkIp65504P064ReservdSMaxLimit(number); 
		serializeIp65504P064ReservdS(ip65504P064ReservdS);
	}

	public void setIp65504P064ReservdS(int number) {
	    number = checkIp65504P064ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P064ReservdS((short)number);
	}
	public void setIp65504P064ReservdS(long number) {
	    number = checkIp65504P064ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P064ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P064ReservdL
	 *	@return ip65504P064ReservdL
	 */
	public short getIp65504P064ReservdL() throws CFException {
        if (isIp65504P064ReservdLModified()) { 
           ip65504P064ReservdL = refreshIp65504P064ReservdL();
        }
   		return ip65504P064ReservdL;
	}
	
	/**
	 * 	Update Ip65504P064ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P064-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P064ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P064ReservdL = checkIp65504P064ReservdLMaxLimit(number); 
		serializeIp65504P064ReservdL(ip65504P064ReservdL);
	}

	public void setIp65504P064ReservdL(int number) {
	    number = checkIp65504P064ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P064ReservdL((short)number);
	}
	public void setIp65504P064ReservdL(long number) {
	    number = checkIp65504P064ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P064ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P065ReservdS
	 *	@return ip65504P065ReservdS
	 */
	public short getIp65504P065ReservdS() throws CFException {
        if (isIp65504P065ReservdSModified()) { 
           ip65504P065ReservdS = refreshIp65504P065ReservdS();
        }
   		return ip65504P065ReservdS;
	}
	
	/**
	 * 	Update Ip65504P065ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P065-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P065ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P065ReservdS = checkIp65504P065ReservdSMaxLimit(number); 
		serializeIp65504P065ReservdS(ip65504P065ReservdS);
	}

	public void setIp65504P065ReservdS(int number) {
	    number = checkIp65504P065ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P065ReservdS((short)number);
	}
	public void setIp65504P065ReservdS(long number) {
	    number = checkIp65504P065ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P065ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P065ReservdL
	 *	@return ip65504P065ReservdL
	 */
	public short getIp65504P065ReservdL() throws CFException {
        if (isIp65504P065ReservdLModified()) { 
           ip65504P065ReservdL = refreshIp65504P065ReservdL();
        }
   		return ip65504P065ReservdL;
	}
	
	/**
	 * 	Update Ip65504P065ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P065-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P065ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P065ReservdL = checkIp65504P065ReservdLMaxLimit(number); 
		serializeIp65504P065ReservdL(ip65504P065ReservdL);
	}

	public void setIp65504P065ReservdL(int number) {
	    number = checkIp65504P065ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P065ReservdL((short)number);
	}
	public void setIp65504P065ReservdL(long number) {
	    number = checkIp65504P065ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P065ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P066ReservdS
	 *	@return ip65504P066ReservdS
	 */
	public short getIp65504P066ReservdS() throws CFException {
        if (isIp65504P066ReservdSModified()) { 
           ip65504P066ReservdS = refreshIp65504P066ReservdS();
        }
   		return ip65504P066ReservdS;
	}
	
	/**
	 * 	Update Ip65504P066ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P066-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P066ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P066ReservdS = checkIp65504P066ReservdSMaxLimit(number); 
		serializeIp65504P066ReservdS(ip65504P066ReservdS);
	}

	public void setIp65504P066ReservdS(int number) {
	    number = checkIp65504P066ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P066ReservdS((short)number);
	}
	public void setIp65504P066ReservdS(long number) {
	    number = checkIp65504P066ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P066ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P066ReservdL
	 *	@return ip65504P066ReservdL
	 */
	public short getIp65504P066ReservdL() throws CFException {
        if (isIp65504P066ReservdLModified()) { 
           ip65504P066ReservdL = refreshIp65504P066ReservdL();
        }
   		return ip65504P066ReservdL;
	}
	
	/**
	 * 	Update Ip65504P066ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P066-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P066ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P066ReservdL = checkIp65504P066ReservdLMaxLimit(number); 
		serializeIp65504P066ReservdL(ip65504P066ReservdL);
	}

	public void setIp65504P066ReservdL(int number) {
	    number = checkIp65504P066ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P066ReservdL((short)number);
	}
	public void setIp65504P066ReservdL(long number) {
	    number = checkIp65504P066ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P066ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P067ReservdS
	 *	@return ip65504P067ReservdS
	 */
	public short getIp65504P067ReservdS() throws CFException {
        if (isIp65504P067ReservdSModified()) { 
           ip65504P067ReservdS = refreshIp65504P067ReservdS();
        }
   		return ip65504P067ReservdS;
	}
	
	/**
	 * 	Update Ip65504P067ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P067-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P067ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P067ReservdS = checkIp65504P067ReservdSMaxLimit(number); 
		serializeIp65504P067ReservdS(ip65504P067ReservdS);
	}

	public void setIp65504P067ReservdS(int number) {
	    number = checkIp65504P067ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P067ReservdS((short)number);
	}
	public void setIp65504P067ReservdS(long number) {
	    number = checkIp65504P067ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P067ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P067ReservdL
	 *	@return ip65504P067ReservdL
	 */
	public short getIp65504P067ReservdL() throws CFException {
        if (isIp65504P067ReservdLModified()) { 
           ip65504P067ReservdL = refreshIp65504P067ReservdL();
        }
   		return ip65504P067ReservdL;
	}
	
	/**
	 * 	Update Ip65504P067ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P067-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P067ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P067ReservdL = checkIp65504P067ReservdLMaxLimit(number); 
		serializeIp65504P067ReservdL(ip65504P067ReservdL);
	}

	public void setIp65504P067ReservdL(int number) {
	    number = checkIp65504P067ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P067ReservdL((short)number);
	}
	public void setIp65504P067ReservdL(long number) {
	    number = checkIp65504P067ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P067ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P068ReservdS
	 *	@return ip65504P068ReservdS
	 */
	public short getIp65504P068ReservdS() throws CFException {
        if (isIp65504P068ReservdSModified()) { 
           ip65504P068ReservdS = refreshIp65504P068ReservdS();
        }
   		return ip65504P068ReservdS;
	}
	
	/**
	 * 	Update Ip65504P068ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P068-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P068ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P068ReservdS = checkIp65504P068ReservdSMaxLimit(number); 
		serializeIp65504P068ReservdS(ip65504P068ReservdS);
	}

	public void setIp65504P068ReservdS(int number) {
	    number = checkIp65504P068ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P068ReservdS((short)number);
	}
	public void setIp65504P068ReservdS(long number) {
	    number = checkIp65504P068ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P068ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P068ReservdL
	 *	@return ip65504P068ReservdL
	 */
	public short getIp65504P068ReservdL() throws CFException {
        if (isIp65504P068ReservdLModified()) { 
           ip65504P068ReservdL = refreshIp65504P068ReservdL();
        }
   		return ip65504P068ReservdL;
	}
	
	/**
	 * 	Update Ip65504P068ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P068-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P068ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P068ReservdL = checkIp65504P068ReservdLMaxLimit(number); 
		serializeIp65504P068ReservdL(ip65504P068ReservdL);
	}

	public void setIp65504P068ReservdL(int number) {
	    number = checkIp65504P068ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P068ReservdL((short)number);
	}
	public void setIp65504P068ReservdL(long number) {
	    number = checkIp65504P068ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P068ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P069ReservdS
	 *	@return ip65504P069ReservdS
	 */
	public short getIp65504P069ReservdS() throws CFException {
        if (isIp65504P069ReservdSModified()) { 
           ip65504P069ReservdS = refreshIp65504P069ReservdS();
        }
   		return ip65504P069ReservdS;
	}
	
	/**
	 * 	Update Ip65504P069ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P069-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P069ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P069ReservdS = checkIp65504P069ReservdSMaxLimit(number); 
		serializeIp65504P069ReservdS(ip65504P069ReservdS);
	}

	public void setIp65504P069ReservdS(int number) {
	    number = checkIp65504P069ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P069ReservdS((short)number);
	}
	public void setIp65504P069ReservdS(long number) {
	    number = checkIp65504P069ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P069ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P069ReservdL
	 *	@return ip65504P069ReservdL
	 */
	public short getIp65504P069ReservdL() throws CFException {
        if (isIp65504P069ReservdLModified()) { 
           ip65504P069ReservdL = refreshIp65504P069ReservdL();
        }
   		return ip65504P069ReservdL;
	}
	
	/**
	 * 	Update Ip65504P069ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P069-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P069ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P069ReservdL = checkIp65504P069ReservdLMaxLimit(number); 
		serializeIp65504P069ReservdL(ip65504P069ReservdL);
	}

	public void setIp65504P069ReservdL(int number) {
	    number = checkIp65504P069ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P069ReservdL((short)number);
	}
	public void setIp65504P069ReservdL(long number) {
	    number = checkIp65504P069ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P069ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P070ReservdS
	 *	@return ip65504P070ReservdS
	 */
	public short getIp65504P070ReservdS() throws CFException {
        if (isIp65504P070ReservdSModified()) { 
           ip65504P070ReservdS = refreshIp65504P070ReservdS();
        }
   		return ip65504P070ReservdS;
	}
	
	/**
	 * 	Update Ip65504P070ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P070-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P070ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P070ReservdS = checkIp65504P070ReservdSMaxLimit(number); 
		serializeIp65504P070ReservdS(ip65504P070ReservdS);
	}

	public void setIp65504P070ReservdS(int number) {
	    number = checkIp65504P070ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P070ReservdS((short)number);
	}
	public void setIp65504P070ReservdS(long number) {
	    number = checkIp65504P070ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P070ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P070ReservdL
	 *	@return ip65504P070ReservdL
	 */
	public short getIp65504P070ReservdL() throws CFException {
        if (isIp65504P070ReservdLModified()) { 
           ip65504P070ReservdL = refreshIp65504P070ReservdL();
        }
   		return ip65504P070ReservdL;
	}
	
	/**
	 * 	Update Ip65504P070ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P070-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P070ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P070ReservdL = checkIp65504P070ReservdLMaxLimit(number); 
		serializeIp65504P070ReservdL(ip65504P070ReservdL);
	}

	public void setIp65504P070ReservdL(int number) {
	    number = checkIp65504P070ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P070ReservdL((short)number);
	}
	public void setIp65504P070ReservdL(long number) {
	    number = checkIp65504P070ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P070ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P071ReservdS
	 *	@return ip65504P071ReservdS
	 */
	public short getIp65504P071ReservdS() throws CFException {
        if (isIp65504P071ReservdSModified()) { 
           ip65504P071ReservdS = refreshIp65504P071ReservdS();
        }
   		return ip65504P071ReservdS;
	}
	
	/**
	 * 	Update Ip65504P071ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P071-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P071ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P071ReservdS = checkIp65504P071ReservdSMaxLimit(number); 
		serializeIp65504P071ReservdS(ip65504P071ReservdS);
	}

	public void setIp65504P071ReservdS(int number) {
	    number = checkIp65504P071ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P071ReservdS((short)number);
	}
	public void setIp65504P071ReservdS(long number) {
	    number = checkIp65504P071ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P071ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P071ReservdL
	 *	@return ip65504P071ReservdL
	 */
	public short getIp65504P071ReservdL() throws CFException {
        if (isIp65504P071ReservdLModified()) { 
           ip65504P071ReservdL = refreshIp65504P071ReservdL();
        }
   		return ip65504P071ReservdL;
	}
	
	/**
	 * 	Update Ip65504P071ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P071-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P071ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P071ReservdL = checkIp65504P071ReservdLMaxLimit(number); 
		serializeIp65504P071ReservdL(ip65504P071ReservdL);
	}

	public void setIp65504P071ReservdL(int number) {
	    number = checkIp65504P071ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P071ReservdL((short)number);
	}
	public void setIp65504P071ReservdL(long number) {
	    number = checkIp65504P071ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P071ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P072ReservdS
	 *	@return ip65504P072ReservdS
	 */
	public short getIp65504P072ReservdS() throws CFException {
        if (isIp65504P072ReservdSModified()) { 
           ip65504P072ReservdS = refreshIp65504P072ReservdS();
        }
   		return ip65504P072ReservdS;
	}
	
	/**
	 * 	Update Ip65504P072ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P072-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P072ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P072ReservdS = checkIp65504P072ReservdSMaxLimit(number); 
		serializeIp65504P072ReservdS(ip65504P072ReservdS);
	}

	public void setIp65504P072ReservdS(int number) {
	    number = checkIp65504P072ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P072ReservdS((short)number);
	}
	public void setIp65504P072ReservdS(long number) {
	    number = checkIp65504P072ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P072ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P072ReservdL
	 *	@return ip65504P072ReservdL
	 */
	public short getIp65504P072ReservdL() throws CFException {
        if (isIp65504P072ReservdLModified()) { 
           ip65504P072ReservdL = refreshIp65504P072ReservdL();
        }
   		return ip65504P072ReservdL;
	}
	
	/**
	 * 	Update Ip65504P072ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P072-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P072ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P072ReservdL = checkIp65504P072ReservdLMaxLimit(number); 
		serializeIp65504P072ReservdL(ip65504P072ReservdL);
	}

	public void setIp65504P072ReservdL(int number) {
	    number = checkIp65504P072ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P072ReservdL((short)number);
	}
	public void setIp65504P072ReservdL(long number) {
	    number = checkIp65504P072ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P072ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P073ReservdS
	 *	@return ip65504P073ReservdS
	 */
	public short getIp65504P073ReservdS() throws CFException {
        if (isIp65504P073ReservdSModified()) { 
           ip65504P073ReservdS = refreshIp65504P073ReservdS();
        }
   		return ip65504P073ReservdS;
	}
	
	/**
	 * 	Update Ip65504P073ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P073-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P073ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P073ReservdS = checkIp65504P073ReservdSMaxLimit(number); 
		serializeIp65504P073ReservdS(ip65504P073ReservdS);
	}

	public void setIp65504P073ReservdS(int number) {
	    number = checkIp65504P073ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P073ReservdS((short)number);
	}
	public void setIp65504P073ReservdS(long number) {
	    number = checkIp65504P073ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P073ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P073ReservdL
	 *	@return ip65504P073ReservdL
	 */
	public short getIp65504P073ReservdL() throws CFException {
        if (isIp65504P073ReservdLModified()) { 
           ip65504P073ReservdL = refreshIp65504P073ReservdL();
        }
   		return ip65504P073ReservdL;
	}
	
	/**
	 * 	Update Ip65504P073ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P073-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P073ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P073ReservdL = checkIp65504P073ReservdLMaxLimit(number); 
		serializeIp65504P073ReservdL(ip65504P073ReservdL);
	}

	public void setIp65504P073ReservdL(int number) {
	    number = checkIp65504P073ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P073ReservdL((short)number);
	}
	public void setIp65504P073ReservdL(long number) {
	    number = checkIp65504P073ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P073ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P074ReservdS
	 *	@return ip65504P074ReservdS
	 */
	public short getIp65504P074ReservdS() throws CFException {
        if (isIp65504P074ReservdSModified()) { 
           ip65504P074ReservdS = refreshIp65504P074ReservdS();
        }
   		return ip65504P074ReservdS;
	}
	
	/**
	 * 	Update Ip65504P074ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P074-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P074ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P074ReservdS = checkIp65504P074ReservdSMaxLimit(number); 
		serializeIp65504P074ReservdS(ip65504P074ReservdS);
	}

	public void setIp65504P074ReservdS(int number) {
	    number = checkIp65504P074ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P074ReservdS((short)number);
	}
	public void setIp65504P074ReservdS(long number) {
	    number = checkIp65504P074ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P074ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P074ReservdL
	 *	@return ip65504P074ReservdL
	 */
	public short getIp65504P074ReservdL() throws CFException {
        if (isIp65504P074ReservdLModified()) { 
           ip65504P074ReservdL = refreshIp65504P074ReservdL();
        }
   		return ip65504P074ReservdL;
	}
	
	/**
	 * 	Update Ip65504P074ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P074-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P074ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P074ReservdL = checkIp65504P074ReservdLMaxLimit(number); 
		serializeIp65504P074ReservdL(ip65504P074ReservdL);
	}

	public void setIp65504P074ReservdL(int number) {
	    number = checkIp65504P074ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P074ReservdL((short)number);
	}
	public void setIp65504P074ReservdL(long number) {
	    number = checkIp65504P074ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P074ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P075ReservdS
	 *	@return ip65504P075ReservdS
	 */
	public short getIp65504P075ReservdS() throws CFException {
        if (isIp65504P075ReservdSModified()) { 
           ip65504P075ReservdS = refreshIp65504P075ReservdS();
        }
   		return ip65504P075ReservdS;
	}
	
	/**
	 * 	Update Ip65504P075ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P075-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P075ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P075ReservdS = checkIp65504P075ReservdSMaxLimit(number); 
		serializeIp65504P075ReservdS(ip65504P075ReservdS);
	}

	public void setIp65504P075ReservdS(int number) {
	    number = checkIp65504P075ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P075ReservdS((short)number);
	}
	public void setIp65504P075ReservdS(long number) {
	    number = checkIp65504P075ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P075ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P075ReservdL
	 *	@return ip65504P075ReservdL
	 */
	public short getIp65504P075ReservdL() throws CFException {
        if (isIp65504P075ReservdLModified()) { 
           ip65504P075ReservdL = refreshIp65504P075ReservdL();
        }
   		return ip65504P075ReservdL;
	}
	
	/**
	 * 	Update Ip65504P075ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P075-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P075ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P075ReservdL = checkIp65504P075ReservdLMaxLimit(number); 
		serializeIp65504P075ReservdL(ip65504P075ReservdL);
	}

	public void setIp65504P075ReservdL(int number) {
	    number = checkIp65504P075ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P075ReservdL((short)number);
	}
	public void setIp65504P075ReservdL(long number) {
	    number = checkIp65504P075ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P075ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P076ReservdS
	 *	@return ip65504P076ReservdS
	 */
	public short getIp65504P076ReservdS() throws CFException {
        if (isIp65504P076ReservdSModified()) { 
           ip65504P076ReservdS = refreshIp65504P076ReservdS();
        }
   		return ip65504P076ReservdS;
	}
	
	/**
	 * 	Update Ip65504P076ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P076-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P076ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P076ReservdS = checkIp65504P076ReservdSMaxLimit(number); 
		serializeIp65504P076ReservdS(ip65504P076ReservdS);
	}

	public void setIp65504P076ReservdS(int number) {
	    number = checkIp65504P076ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P076ReservdS((short)number);
	}
	public void setIp65504P076ReservdS(long number) {
	    number = checkIp65504P076ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P076ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P076ReservdL
	 *	@return ip65504P076ReservdL
	 */
	public short getIp65504P076ReservdL() throws CFException {
        if (isIp65504P076ReservdLModified()) { 
           ip65504P076ReservdL = refreshIp65504P076ReservdL();
        }
   		return ip65504P076ReservdL;
	}
	
	/**
	 * 	Update Ip65504P076ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P076-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P076ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P076ReservdL = checkIp65504P076ReservdLMaxLimit(number); 
		serializeIp65504P076ReservdL(ip65504P076ReservdL);
	}

	public void setIp65504P076ReservdL(int number) {
	    number = checkIp65504P076ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P076ReservdL((short)number);
	}
	public void setIp65504P076ReservdL(long number) {
	    number = checkIp65504P076ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P076ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P077ReservdS
	 *	@return ip65504P077ReservdS
	 */
	public short getIp65504P077ReservdS() throws CFException {
        if (isIp65504P077ReservdSModified()) { 
           ip65504P077ReservdS = refreshIp65504P077ReservdS();
        }
   		return ip65504P077ReservdS;
	}
	
	/**
	 * 	Update Ip65504P077ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P077-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P077ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P077ReservdS = checkIp65504P077ReservdSMaxLimit(number); 
		serializeIp65504P077ReservdS(ip65504P077ReservdS);
	}

	public void setIp65504P077ReservdS(int number) {
	    number = checkIp65504P077ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P077ReservdS((short)number);
	}
	public void setIp65504P077ReservdS(long number) {
	    number = checkIp65504P077ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P077ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P077ReservdL
	 *	@return ip65504P077ReservdL
	 */
	public short getIp65504P077ReservdL() throws CFException {
        if (isIp65504P077ReservdLModified()) { 
           ip65504P077ReservdL = refreshIp65504P077ReservdL();
        }
   		return ip65504P077ReservdL;
	}
	
	/**
	 * 	Update Ip65504P077ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P077-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P077ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P077ReservdL = checkIp65504P077ReservdLMaxLimit(number); 
		serializeIp65504P077ReservdL(ip65504P077ReservdL);
	}

	public void setIp65504P077ReservdL(int number) {
	    number = checkIp65504P077ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P077ReservdL((short)number);
	}
	public void setIp65504P077ReservdL(long number) {
	    number = checkIp65504P077ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P077ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P078ReservdS
	 *	@return ip65504P078ReservdS
	 */
	public short getIp65504P078ReservdS() throws CFException {
        if (isIp65504P078ReservdSModified()) { 
           ip65504P078ReservdS = refreshIp65504P078ReservdS();
        }
   		return ip65504P078ReservdS;
	}
	
	/**
	 * 	Update Ip65504P078ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P078-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P078ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P078ReservdS = checkIp65504P078ReservdSMaxLimit(number); 
		serializeIp65504P078ReservdS(ip65504P078ReservdS);
	}

	public void setIp65504P078ReservdS(int number) {
	    number = checkIp65504P078ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P078ReservdS((short)number);
	}
	public void setIp65504P078ReservdS(long number) {
	    number = checkIp65504P078ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P078ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P078ReservdL
	 *	@return ip65504P078ReservdL
	 */
	public short getIp65504P078ReservdL() throws CFException {
        if (isIp65504P078ReservdLModified()) { 
           ip65504P078ReservdL = refreshIp65504P078ReservdL();
        }
   		return ip65504P078ReservdL;
	}
	
	/**
	 * 	Update Ip65504P078ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P078-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P078ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P078ReservdL = checkIp65504P078ReservdLMaxLimit(number); 
		serializeIp65504P078ReservdL(ip65504P078ReservdL);
	}

	public void setIp65504P078ReservdL(int number) {
	    number = checkIp65504P078ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P078ReservdL((short)number);
	}
	public void setIp65504P078ReservdL(long number) {
	    number = checkIp65504P078ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P078ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P079ReservdS
	 *	@return ip65504P079ReservdS
	 */
	public short getIp65504P079ReservdS() throws CFException {
        if (isIp65504P079ReservdSModified()) { 
           ip65504P079ReservdS = refreshIp65504P079ReservdS();
        }
   		return ip65504P079ReservdS;
	}
	
	/**
	 * 	Update Ip65504P079ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P079-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P079ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P079ReservdS = checkIp65504P079ReservdSMaxLimit(number); 
		serializeIp65504P079ReservdS(ip65504P079ReservdS);
	}

	public void setIp65504P079ReservdS(int number) {
	    number = checkIp65504P079ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P079ReservdS((short)number);
	}
	public void setIp65504P079ReservdS(long number) {
	    number = checkIp65504P079ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P079ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P079ReservdL
	 *	@return ip65504P079ReservdL
	 */
	public short getIp65504P079ReservdL() throws CFException {
        if (isIp65504P079ReservdLModified()) { 
           ip65504P079ReservdL = refreshIp65504P079ReservdL();
        }
   		return ip65504P079ReservdL;
	}
	
	/**
	 * 	Update Ip65504P079ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P079-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P079ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P079ReservdL = checkIp65504P079ReservdLMaxLimit(number); 
		serializeIp65504P079ReservdL(ip65504P079ReservdL);
	}

	public void setIp65504P079ReservdL(int number) {
	    number = checkIp65504P079ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P079ReservdL((short)number);
	}
	public void setIp65504P079ReservdL(long number) {
	    number = checkIp65504P079ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P079ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P080ReservdS
	 *	@return ip65504P080ReservdS
	 */
	public short getIp65504P080ReservdS() throws CFException {
        if (isIp65504P080ReservdSModified()) { 
           ip65504P080ReservdS = refreshIp65504P080ReservdS();
        }
   		return ip65504P080ReservdS;
	}
	
	/**
	 * 	Update Ip65504P080ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P080-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P080ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P080ReservdS = checkIp65504P080ReservdSMaxLimit(number); 
		serializeIp65504P080ReservdS(ip65504P080ReservdS);
	}

	public void setIp65504P080ReservdS(int number) {
	    number = checkIp65504P080ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P080ReservdS((short)number);
	}
	public void setIp65504P080ReservdS(long number) {
	    number = checkIp65504P080ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P080ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P080ReservdL
	 *	@return ip65504P080ReservdL
	 */
	public short getIp65504P080ReservdL() throws CFException {
        if (isIp65504P080ReservdLModified()) { 
           ip65504P080ReservdL = refreshIp65504P080ReservdL();
        }
   		return ip65504P080ReservdL;
	}
	
	/**
	 * 	Update Ip65504P080ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P080-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P080ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P080ReservdL = checkIp65504P080ReservdLMaxLimit(number); 
		serializeIp65504P080ReservdL(ip65504P080ReservdL);
	}

	public void setIp65504P080ReservdL(int number) {
	    number = checkIp65504P080ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P080ReservdL((short)number);
	}
	public void setIp65504P080ReservdL(long number) {
	    number = checkIp65504P080ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P080ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P081ReservdS
	 *	@return ip65504P081ReservdS
	 */
	public short getIp65504P081ReservdS() throws CFException {
        if (isIp65504P081ReservdSModified()) { 
           ip65504P081ReservdS = refreshIp65504P081ReservdS();
        }
   		return ip65504P081ReservdS;
	}
	
	/**
	 * 	Update Ip65504P081ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P081-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P081ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P081ReservdS = checkIp65504P081ReservdSMaxLimit(number); 
		serializeIp65504P081ReservdS(ip65504P081ReservdS);
	}

	public void setIp65504P081ReservdS(int number) {
	    number = checkIp65504P081ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P081ReservdS((short)number);
	}
	public void setIp65504P081ReservdS(long number) {
	    number = checkIp65504P081ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P081ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P081ReservdL
	 *	@return ip65504P081ReservdL
	 */
	public short getIp65504P081ReservdL() throws CFException {
        if (isIp65504P081ReservdLModified()) { 
           ip65504P081ReservdL = refreshIp65504P081ReservdL();
        }
   		return ip65504P081ReservdL;
	}
	
	/**
	 * 	Update Ip65504P081ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P081-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P081ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P081ReservdL = checkIp65504P081ReservdLMaxLimit(number); 
		serializeIp65504P081ReservdL(ip65504P081ReservdL);
	}

	public void setIp65504P081ReservdL(int number) {
	    number = checkIp65504P081ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P081ReservdL((short)number);
	}
	public void setIp65504P081ReservdL(long number) {
	    number = checkIp65504P081ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P081ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P082ReservdS
	 *	@return ip65504P082ReservdS
	 */
	public short getIp65504P082ReservdS() throws CFException {
        if (isIp65504P082ReservdSModified()) { 
           ip65504P082ReservdS = refreshIp65504P082ReservdS();
        }
   		return ip65504P082ReservdS;
	}
	
	/**
	 * 	Update Ip65504P082ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P082-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P082ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P082ReservdS = checkIp65504P082ReservdSMaxLimit(number); 
		serializeIp65504P082ReservdS(ip65504P082ReservdS);
	}

	public void setIp65504P082ReservdS(int number) {
	    number = checkIp65504P082ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P082ReservdS((short)number);
	}
	public void setIp65504P082ReservdS(long number) {
	    number = checkIp65504P082ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P082ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P082ReservdL
	 *	@return ip65504P082ReservdL
	 */
	public short getIp65504P082ReservdL() throws CFException {
        if (isIp65504P082ReservdLModified()) { 
           ip65504P082ReservdL = refreshIp65504P082ReservdL();
        }
   		return ip65504P082ReservdL;
	}
	
	/**
	 * 	Update Ip65504P082ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P082-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P082ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P082ReservdL = checkIp65504P082ReservdLMaxLimit(number); 
		serializeIp65504P082ReservdL(ip65504P082ReservdL);
	}

	public void setIp65504P082ReservdL(int number) {
	    number = checkIp65504P082ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P082ReservdL((short)number);
	}
	public void setIp65504P082ReservdL(long number) {
	    number = checkIp65504P082ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P082ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P083AvsRspS
	 *	@return ip65504P083AvsRspS
	 */
	public short getIp65504P083AvsRspS() throws CFException {
        if (isIp65504P083AvsRspSModified()) { 
           ip65504P083AvsRspS = refreshIp65504P083AvsRspS();
        }
   		return ip65504P083AvsRspS;
	}
	
	/**
	 * 	Update Ip65504P083AvsRspS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P083-AVS-RSP-S
	 *	@param number
	 */
	public void setIp65504P083AvsRspS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P083AvsRspS = checkIp65504P083AvsRspSMaxLimit(number); 
		serializeIp65504P083AvsRspS(ip65504P083AvsRspS);
	}

	public void setIp65504P083AvsRspS(int number) {
	    number = checkIp65504P083AvsRspSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P083AvsRspS((short)number);
	}
	public void setIp65504P083AvsRspS(long number) {
	    number = checkIp65504P083AvsRspSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P083AvsRspS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P083AvsRspL
	 *	@return ip65504P083AvsRspL
	 */
	public short getIp65504P083AvsRspL() throws CFException {
        if (isIp65504P083AvsRspLModified()) { 
           ip65504P083AvsRspL = refreshIp65504P083AvsRspL();
        }
   		return ip65504P083AvsRspL;
	}
	
	/**
	 * 	Update Ip65504P083AvsRspL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P083-AVS-RSP-L
	 *	@param number
	 */
	public void setIp65504P083AvsRspL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P083AvsRspL = checkIp65504P083AvsRspLMaxLimit(number); 
		serializeIp65504P083AvsRspL(ip65504P083AvsRspL);
	}

	public void setIp65504P083AvsRspL(int number) {
	    number = checkIp65504P083AvsRspLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P083AvsRspL((short)number);
	}
	public void setIp65504P083AvsRspL(long number) {
	    number = checkIp65504P083AvsRspLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P083AvsRspL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P084AimMerS
	 *	@return ip65504P084AimMerS
	 */
	public short getIp65504P084AimMerS() throws CFException {
        if (isIp65504P084AimMerSModified()) { 
           ip65504P084AimMerS = refreshIp65504P084AimMerS();
        }
   		return ip65504P084AimMerS;
	}
	
	/**
	 * 	Update Ip65504P084AimMerS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P084-AIM-MER-S
	 *	@param number
	 */
	public void setIp65504P084AimMerS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P084AimMerS = checkIp65504P084AimMerSMaxLimit(number); 
		serializeIp65504P084AimMerS(ip65504P084AimMerS);
	}

	public void setIp65504P084AimMerS(int number) {
	    number = checkIp65504P084AimMerSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P084AimMerS((short)number);
	}
	public void setIp65504P084AimMerS(long number) {
	    number = checkIp65504P084AimMerSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P084AimMerS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P084AimMerL
	 *	@return ip65504P084AimMerL
	 */
	public short getIp65504P084AimMerL() throws CFException {
        if (isIp65504P084AimMerLModified()) { 
           ip65504P084AimMerL = refreshIp65504P084AimMerL();
        }
   		return ip65504P084AimMerL;
	}
	
	/**
	 * 	Update Ip65504P084AimMerL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P084-AIM-MER-L
	 *	@param number
	 */
	public void setIp65504P084AimMerL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P084AimMerL = checkIp65504P084AimMerLMaxLimit(number); 
		serializeIp65504P084AimMerL(ip65504P084AimMerL);
	}

	public void setIp65504P084AimMerL(int number) {
	    number = checkIp65504P084AimMerLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P084AimMerL((short)number);
	}
	public void setIp65504P084AimMerL(long number) {
	    number = checkIp65504P084AimMerLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P084AimMerL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P085AimFrdS
	 *	@return ip65504P085AimFrdS
	 */
	public short getIp65504P085AimFrdS() throws CFException {
        if (isIp65504P085AimFrdSModified()) { 
           ip65504P085AimFrdS = refreshIp65504P085AimFrdS();
        }
   		return ip65504P085AimFrdS;
	}
	
	/**
	 * 	Update Ip65504P085AimFrdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P085-AIM-FRD-S
	 *	@param number
	 */
	public void setIp65504P085AimFrdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P085AimFrdS = checkIp65504P085AimFrdSMaxLimit(number); 
		serializeIp65504P085AimFrdS(ip65504P085AimFrdS);
	}

	public void setIp65504P085AimFrdS(int number) {
	    number = checkIp65504P085AimFrdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P085AimFrdS((short)number);
	}
	public void setIp65504P085AimFrdS(long number) {
	    number = checkIp65504P085AimFrdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P085AimFrdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P085AimFrdL
	 *	@return ip65504P085AimFrdL
	 */
	public short getIp65504P085AimFrdL() throws CFException {
        if (isIp65504P085AimFrdLModified()) { 
           ip65504P085AimFrdL = refreshIp65504P085AimFrdL();
        }
   		return ip65504P085AimFrdL;
	}
	
	/**
	 * 	Update Ip65504P085AimFrdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P085-AIM-FRD-L
	 *	@param number
	 */
	public void setIp65504P085AimFrdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P085AimFrdL = checkIp65504P085AimFrdLMaxLimit(number); 
		serializeIp65504P085AimFrdL(ip65504P085AimFrdL);
	}

	public void setIp65504P085AimFrdL(int number) {
	    number = checkIp65504P085AimFrdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P085AimFrdL((short)number);
	}
	public void setIp65504P085AimFrdL(long number) {
	    number = checkIp65504P085AimFrdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P085AimFrdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P086AimOrdS
	 *	@return ip65504P086AimOrdS
	 */
	public short getIp65504P086AimOrdS() throws CFException {
        if (isIp65504P086AimOrdSModified()) { 
           ip65504P086AimOrdS = refreshIp65504P086AimOrdS();
        }
   		return ip65504P086AimOrdS;
	}
	
	/**
	 * 	Update Ip65504P086AimOrdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P086-AIM-ORD-S
	 *	@param number
	 */
	public void setIp65504P086AimOrdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P086AimOrdS = checkIp65504P086AimOrdSMaxLimit(number); 
		serializeIp65504P086AimOrdS(ip65504P086AimOrdS);
	}

	public void setIp65504P086AimOrdS(int number) {
	    number = checkIp65504P086AimOrdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P086AimOrdS((short)number);
	}
	public void setIp65504P086AimOrdS(long number) {
	    number = checkIp65504P086AimOrdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P086AimOrdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P086AimOrdL
	 *	@return ip65504P086AimOrdL
	 */
	public short getIp65504P086AimOrdL() throws CFException {
        if (isIp65504P086AimOrdLModified()) { 
           ip65504P086AimOrdL = refreshIp65504P086AimOrdL();
        }
   		return ip65504P086AimOrdL;
	}
	
	/**
	 * 	Update Ip65504P086AimOrdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P086-AIM-ORD-L
	 *	@param number
	 */
	public void setIp65504P086AimOrdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P086AimOrdL = checkIp65504P086AimOrdLMaxLimit(number); 
		serializeIp65504P086AimOrdL(ip65504P086AimOrdL);
	}

	public void setIp65504P086AimOrdL(int number) {
	    number = checkIp65504P086AimOrdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P086AimOrdL((short)number);
	}
	public void setIp65504P086AimOrdL(long number) {
	    number = checkIp65504P086AimOrdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P086AimOrdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P087ReservdS
	 *	@return ip65504P087ReservdS
	 */
	public short getIp65504P087ReservdS() throws CFException {
        if (isIp65504P087ReservdSModified()) { 
           ip65504P087ReservdS = refreshIp65504P087ReservdS();
        }
   		return ip65504P087ReservdS;
	}
	
	/**
	 * 	Update Ip65504P087ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P087-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P087ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P087ReservdS = checkIp65504P087ReservdSMaxLimit(number); 
		serializeIp65504P087ReservdS(ip65504P087ReservdS);
	}

	public void setIp65504P087ReservdS(int number) {
	    number = checkIp65504P087ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P087ReservdS((short)number);
	}
	public void setIp65504P087ReservdS(long number) {
	    number = checkIp65504P087ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P087ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P087ReservdL
	 *	@return ip65504P087ReservdL
	 */
	public short getIp65504P087ReservdL() throws CFException {
        if (isIp65504P087ReservdLModified()) { 
           ip65504P087ReservdL = refreshIp65504P087ReservdL();
        }
   		return ip65504P087ReservdL;
	}
	
	/**
	 * 	Update Ip65504P087ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P087-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P087ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P087ReservdL = checkIp65504P087ReservdLMaxLimit(number); 
		serializeIp65504P087ReservdL(ip65504P087ReservdL);
	}

	public void setIp65504P087ReservdL(int number) {
	    number = checkIp65504P087ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P087ReservdL((short)number);
	}
	public void setIp65504P087ReservdL(long number) {
	    number = checkIp65504P087ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P087ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P088CrdSecS
	 *	@return ip65504P088CrdSecS
	 */
	public short getIp65504P088CrdSecS() throws CFException {
        if (isIp65504P088CrdSecSModified()) { 
           ip65504P088CrdSecS = refreshIp65504P088CrdSecS();
        }
   		return ip65504P088CrdSecS;
	}
	
	/**
	 * 	Update Ip65504P088CrdSecS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P088-CRD-SEC-S
	 *	@param number
	 */
	public void setIp65504P088CrdSecS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P088CrdSecS = checkIp65504P088CrdSecSMaxLimit(number); 
		serializeIp65504P088CrdSecS(ip65504P088CrdSecS);
	}

	public void setIp65504P088CrdSecS(int number) {
	    number = checkIp65504P088CrdSecSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P088CrdSecS((short)number);
	}
	public void setIp65504P088CrdSecS(long number) {
	    number = checkIp65504P088CrdSecSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P088CrdSecS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P088CrdSecL
	 *	@return ip65504P088CrdSecL
	 */
	public short getIp65504P088CrdSecL() throws CFException {
        if (isIp65504P088CrdSecLModified()) { 
           ip65504P088CrdSecL = refreshIp65504P088CrdSecL();
        }
   		return ip65504P088CrdSecL;
	}
	
	/**
	 * 	Update Ip65504P088CrdSecL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P088-CRD-SEC-L
	 *	@param number
	 */
	public void setIp65504P088CrdSecL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P088CrdSecL = checkIp65504P088CrdSecLMaxLimit(number); 
		serializeIp65504P088CrdSecL(ip65504P088CrdSecL);
	}

	public void setIp65504P088CrdSecL(int number) {
	    number = checkIp65504P088CrdSecLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P088CrdSecL((short)number);
	}
	public void setIp65504P088CrdSecL(long number) {
	    number = checkIp65504P088CrdSecLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P088CrdSecL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P089ReservdS
	 *	@return ip65504P089ReservdS
	 */
	public short getIp65504P089ReservdS() throws CFException {
        if (isIp65504P089ReservdSModified()) { 
           ip65504P089ReservdS = refreshIp65504P089ReservdS();
        }
   		return ip65504P089ReservdS;
	}
	
	/**
	 * 	Update Ip65504P089ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P089-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P089ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P089ReservdS = checkIp65504P089ReservdSMaxLimit(number); 
		serializeIp65504P089ReservdS(ip65504P089ReservdS);
	}

	public void setIp65504P089ReservdS(int number) {
	    number = checkIp65504P089ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P089ReservdS((short)number);
	}
	public void setIp65504P089ReservdS(long number) {
	    number = checkIp65504P089ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P089ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P089ReservdL
	 *	@return ip65504P089ReservdL
	 */
	public short getIp65504P089ReservdL() throws CFException {
        if (isIp65504P089ReservdLModified()) { 
           ip65504P089ReservdL = refreshIp65504P089ReservdL();
        }
   		return ip65504P089ReservdL;
	}
	
	/**
	 * 	Update Ip65504P089ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P089-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P089ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P089ReservdL = checkIp65504P089ReservdLMaxLimit(number); 
		serializeIp65504P089ReservdL(ip65504P089ReservdL);
	}

	public void setIp65504P089ReservdL(int number) {
	    number = checkIp65504P089ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P089ReservdL((short)number);
	}
	public void setIp65504P089ReservdL(long number) {
	    number = checkIp65504P089ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P089ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P090ReservdS
	 *	@return ip65504P090ReservdS
	 */
	public short getIp65504P090ReservdS() throws CFException {
        if (isIp65504P090ReservdSModified()) { 
           ip65504P090ReservdS = refreshIp65504P090ReservdS();
        }
   		return ip65504P090ReservdS;
	}
	
	/**
	 * 	Update Ip65504P090ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P090-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P090ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P090ReservdS = checkIp65504P090ReservdSMaxLimit(number); 
		serializeIp65504P090ReservdS(ip65504P090ReservdS);
	}

	public void setIp65504P090ReservdS(int number) {
	    number = checkIp65504P090ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P090ReservdS((short)number);
	}
	public void setIp65504P090ReservdS(long number) {
	    number = checkIp65504P090ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P090ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P090ReservdL
	 *	@return ip65504P090ReservdL
	 */
	public short getIp65504P090ReservdL() throws CFException {
        if (isIp65504P090ReservdLModified()) { 
           ip65504P090ReservdL = refreshIp65504P090ReservdL();
        }
   		return ip65504P090ReservdL;
	}
	
	/**
	 * 	Update Ip65504P090ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P090-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P090ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P090ReservdL = checkIp65504P090ReservdLMaxLimit(number); 
		serializeIp65504P090ReservdL(ip65504P090ReservdL);
	}

	public void setIp65504P090ReservdL(int number) {
	    number = checkIp65504P090ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P090ReservdL((short)number);
	}
	public void setIp65504P090ReservdL(long number) {
	    number = checkIp65504P090ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P090ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P091ReservdS
	 *	@return ip65504P091ReservdS
	 */
	public short getIp65504P091ReservdS() throws CFException {
        if (isIp65504P091ReservdSModified()) { 
           ip65504P091ReservdS = refreshIp65504P091ReservdS();
        }
   		return ip65504P091ReservdS;
	}
	
	/**
	 * 	Update Ip65504P091ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P091-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P091ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P091ReservdS = checkIp65504P091ReservdSMaxLimit(number); 
		serializeIp65504P091ReservdS(ip65504P091ReservdS);
	}

	public void setIp65504P091ReservdS(int number) {
	    number = checkIp65504P091ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P091ReservdS((short)number);
	}
	public void setIp65504P091ReservdS(long number) {
	    number = checkIp65504P091ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P091ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P091ReservdL
	 *	@return ip65504P091ReservdL
	 */
	public short getIp65504P091ReservdL() throws CFException {
        if (isIp65504P091ReservdLModified()) { 
           ip65504P091ReservdL = refreshIp65504P091ReservdL();
        }
   		return ip65504P091ReservdL;
	}
	
	/**
	 * 	Update Ip65504P091ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P091-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P091ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P091ReservdL = checkIp65504P091ReservdLMaxLimit(number); 
		serializeIp65504P091ReservdL(ip65504P091ReservdL);
	}

	public void setIp65504P091ReservdL(int number) {
	    number = checkIp65504P091ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P091ReservdL((short)number);
	}
	public void setIp65504P091ReservdL(long number) {
	    number = checkIp65504P091ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P091ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P092ReservdS
	 *	@return ip65504P092ReservdS
	 */
	public short getIp65504P092ReservdS() throws CFException {
        if (isIp65504P092ReservdSModified()) { 
           ip65504P092ReservdS = refreshIp65504P092ReservdS();
        }
   		return ip65504P092ReservdS;
	}
	
	/**
	 * 	Update Ip65504P092ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P092-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P092ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P092ReservdS = checkIp65504P092ReservdSMaxLimit(number); 
		serializeIp65504P092ReservdS(ip65504P092ReservdS);
	}

	public void setIp65504P092ReservdS(int number) {
	    number = checkIp65504P092ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P092ReservdS((short)number);
	}
	public void setIp65504P092ReservdS(long number) {
	    number = checkIp65504P092ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P092ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P092ReservdL
	 *	@return ip65504P092ReservdL
	 */
	public short getIp65504P092ReservdL() throws CFException {
        if (isIp65504P092ReservdLModified()) { 
           ip65504P092ReservdL = refreshIp65504P092ReservdL();
        }
   		return ip65504P092ReservdL;
	}
	
	/**
	 * 	Update Ip65504P092ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P092-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P092ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P092ReservdL = checkIp65504P092ReservdLMaxLimit(number); 
		serializeIp65504P092ReservdL(ip65504P092ReservdL);
	}

	public void setIp65504P092ReservdL(int number) {
	    number = checkIp65504P092ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P092ReservdL((short)number);
	}
	public void setIp65504P092ReservdL(long number) {
	    number = checkIp65504P092ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P092ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P093AimRspS
	 *	@return ip65504P093AimRspS
	 */
	public short getIp65504P093AimRspS() throws CFException {
        if (isIp65504P093AimRspSModified()) { 
           ip65504P093AimRspS = refreshIp65504P093AimRspS();
        }
   		return ip65504P093AimRspS;
	}
	
	/**
	 * 	Update Ip65504P093AimRspS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P093-AIM-RSP-S
	 *	@param number
	 */
	public void setIp65504P093AimRspS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P093AimRspS = checkIp65504P093AimRspSMaxLimit(number); 
		serializeIp65504P093AimRspS(ip65504P093AimRspS);
	}

	public void setIp65504P093AimRspS(int number) {
	    number = checkIp65504P093AimRspSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P093AimRspS((short)number);
	}
	public void setIp65504P093AimRspS(long number) {
	    number = checkIp65504P093AimRspSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P093AimRspS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P093AimRspL
	 *	@return ip65504P093AimRspL
	 */
	public short getIp65504P093AimRspL() throws CFException {
        if (isIp65504P093AimRspLModified()) { 
           ip65504P093AimRspL = refreshIp65504P093AimRspL();
        }
   		return ip65504P093AimRspL;
	}
	
	/**
	 * 	Update Ip65504P093AimRspL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P093-AIM-RSP-L
	 *	@param number
	 */
	public void setIp65504P093AimRspL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P093AimRspL = checkIp65504P093AimRspLMaxLimit(number); 
		serializeIp65504P093AimRspL(ip65504P093AimRspL);
	}

	public void setIp65504P093AimRspL(int number) {
	    number = checkIp65504P093AimRspLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P093AimRspL((short)number);
	}
	public void setIp65504P093AimRspL(long number) {
	    number = checkIp65504P093AimRspLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P093AimRspL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P063ReservdS((short)0);
         	setIp65504P063ReservdL((short)0);
         	setIp65504P064ReservdS((short)0);
         	setIp65504P064ReservdL((short)0);
         	setIp65504P065ReservdS((short)0);
         	setIp65504P065ReservdL((short)0);
         	setIp65504P066ReservdS((short)0);
         	setIp65504P066ReservdL((short)0);
         	setIp65504P067ReservdS((short)0);
         	setIp65504P067ReservdL((short)0);
         	setIp65504P068ReservdS((short)0);
         	setIp65504P068ReservdL((short)0);
         	setIp65504P069ReservdS((short)0);
         	setIp65504P069ReservdL((short)0);
         	setIp65504P070ReservdS((short)0);
         	setIp65504P070ReservdL((short)0);
         	setIp65504P071ReservdS((short)0);
         	setIp65504P071ReservdL((short)0);
         	setIp65504P072ReservdS((short)0);
         	setIp65504P072ReservdL((short)0);
         	setIp65504P073ReservdS((short)0);
         	setIp65504P073ReservdL((short)0);
         	setIp65504P074ReservdS((short)0);
         	setIp65504P074ReservdL((short)0);
         	setIp65504P075ReservdS((short)0);
         	setIp65504P075ReservdL((short)0);
         	setIp65504P076ReservdS((short)0);
         	setIp65504P076ReservdL((short)0);
         	setIp65504P077ReservdS((short)0);
         	setIp65504P077ReservdL((short)0);
         	setIp65504P078ReservdS((short)0);
         	setIp65504P078ReservdL((short)0);
         	setIp65504P079ReservdS((short)0);
         	setIp65504P079ReservdL((short)0);
         	setIp65504P080ReservdS((short)0);
         	setIp65504P080ReservdL((short)0);
         	setIp65504P081ReservdS((short)0);
         	setIp65504P081ReservdL((short)0);
         	setIp65504P082ReservdS((short)0);
         	setIp65504P082ReservdL((short)0);
         	setIp65504P083AvsRspS((short)0);
         	setIp65504P083AvsRspL((short)0);
         	setIp65504P084AimMerS((short)0);
         	setIp65504P084AimMerL((short)0);
         	setIp65504P085AimFrdS((short)0);
         	setIp65504P085AimFrdL((short)0);
         	setIp65504P086AimOrdS((short)0);
         	setIp65504P086AimOrdL((short)0);
         	setIp65504P087ReservdS((short)0);
         	setIp65504P087ReservdL((short)0);
         	setIp65504P088CrdSecS((short)0);
         	setIp65504P088CrdSecL((short)0);
         	setIp65504P089ReservdS((short)0);
         	setIp65504P089ReservdL((short)0);
         	setIp65504P090ReservdS((short)0);
         	setIp65504P090ReservdL((short)0);
         	setIp65504P091ReservdS((short)0);
         	setIp65504P091ReservdL((short)0);
         	setIp65504P092ReservdS((short)0);
         	setIp65504P092ReservdL((short)0);
         	setIp65504P093AimRspS((short)0);
         	setIp65504P093AimRspL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup3FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_3_LENGTH;
		}

}
  
