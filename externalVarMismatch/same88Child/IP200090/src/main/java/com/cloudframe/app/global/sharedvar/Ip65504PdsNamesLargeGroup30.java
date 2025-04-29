package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup30 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup30 extends Ip65504PdsNamesLargeGroup30Serialized { 
   

								private short ip65504P900ReservdS;

								private short ip65504P900ReservdL;


								private short ip65504P901ReservdS;

								private short ip65504P901ReservdL;


								private short ip65504P902ReservdS;

								private short ip65504P902ReservdL;


								private short ip65504P903ReservdS;

								private short ip65504P903ReservdL;


								private short ip65504P904ReservdS;

								private short ip65504P904ReservdL;


								private short ip65504P905ReservdS;

								private short ip65504P905ReservdL;


								private short ip65504P906ReservdS;

								private short ip65504P906ReservdL;


								private short ip65504P907ReservdS;

								private short ip65504P907ReservdL;


								private short ip65504P908ReservdS;

								private short ip65504P908ReservdL;


								private short ip65504P909ReservdS;

								private short ip65504P909ReservdL;


								private short ip65504P910ReservdS;

								private short ip65504P910ReservdL;


								private short ip65504P911ReservdS;

								private short ip65504P911ReservdL;


								private short ip65504P912ReservdS;

								private short ip65504P912ReservdL;


								private short ip65504P913ReservdS;

								private short ip65504P913ReservdL;


								private short ip65504P914ReservdS;

								private short ip65504P914ReservdL;


								private short ip65504P915ReservdS;

								private short ip65504P915ReservdL;


								private short ip65504P916ReservdS;

								private short ip65504P916ReservdL;


								private short ip65504P917ReservdS;

								private short ip65504P917ReservdL;


								private short ip65504P918ReservdS;

								private short ip65504P918ReservdL;


								private short ip65504P919ReservdS;

								private short ip65504P919ReservdL;


								private short ip65504P920ReservdS;

								private short ip65504P920ReservdL;


								private short ip65504P921ReservdS;

								private short ip65504P921ReservdL;


								private short ip65504P922ReservdS;

								private short ip65504P922ReservdL;


								private short ip65504P923ReservdS;

								private short ip65504P923ReservdL;


								private short ip65504P924ReservdS;

								private short ip65504P924ReservdL;


								private short ip65504P925ReservdS;

								private short ip65504P925ReservdL;


								private short ip65504P926ReservdS;

								private short ip65504P926ReservdL;


								private short ip65504P927ReservdS;

								private short ip65504P927ReservdL;


								private short ip65504P928ReservdS;

								private short ip65504P928ReservdL;


								private short ip65504P929ReservdS;

								private short ip65504P929ReservdL;


								private short ip65504P930ReservdS;

								private short ip65504P930ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup30
	**/
    public Ip65504PdsNamesLargeGroup30() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup30. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup30(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P900ReservdS
	 *	@return ip65504P900ReservdS
	 */
	public short getIp65504P900ReservdS() throws CFException {
        if (isIp65504P900ReservdSModified()) { 
           ip65504P900ReservdS = refreshIp65504P900ReservdS();
        }
   		return ip65504P900ReservdS;
	}
	
	/**
	 * 	Update Ip65504P900ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P900-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P900ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P900ReservdS = checkIp65504P900ReservdSMaxLimit(number); 
		serializeIp65504P900ReservdS(ip65504P900ReservdS);
	}

	public void setIp65504P900ReservdS(int number) {
	    number = checkIp65504P900ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P900ReservdS((short)number);
	}
	public void setIp65504P900ReservdS(long number) {
	    number = checkIp65504P900ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P900ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P900ReservdL
	 *	@return ip65504P900ReservdL
	 */
	public short getIp65504P900ReservdL() throws CFException {
        if (isIp65504P900ReservdLModified()) { 
           ip65504P900ReservdL = refreshIp65504P900ReservdL();
        }
   		return ip65504P900ReservdL;
	}
	
	/**
	 * 	Update Ip65504P900ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P900-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P900ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P900ReservdL = checkIp65504P900ReservdLMaxLimit(number); 
		serializeIp65504P900ReservdL(ip65504P900ReservdL);
	}

	public void setIp65504P900ReservdL(int number) {
	    number = checkIp65504P900ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P900ReservdL((short)number);
	}
	public void setIp65504P900ReservdL(long number) {
	    number = checkIp65504P900ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P900ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P901ReservdS
	 *	@return ip65504P901ReservdS
	 */
	public short getIp65504P901ReservdS() throws CFException {
        if (isIp65504P901ReservdSModified()) { 
           ip65504P901ReservdS = refreshIp65504P901ReservdS();
        }
   		return ip65504P901ReservdS;
	}
	
	/**
	 * 	Update Ip65504P901ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P901-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P901ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P901ReservdS = checkIp65504P901ReservdSMaxLimit(number); 
		serializeIp65504P901ReservdS(ip65504P901ReservdS);
	}

	public void setIp65504P901ReservdS(int number) {
	    number = checkIp65504P901ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P901ReservdS((short)number);
	}
	public void setIp65504P901ReservdS(long number) {
	    number = checkIp65504P901ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P901ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P901ReservdL
	 *	@return ip65504P901ReservdL
	 */
	public short getIp65504P901ReservdL() throws CFException {
        if (isIp65504P901ReservdLModified()) { 
           ip65504P901ReservdL = refreshIp65504P901ReservdL();
        }
   		return ip65504P901ReservdL;
	}
	
	/**
	 * 	Update Ip65504P901ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P901-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P901ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P901ReservdL = checkIp65504P901ReservdLMaxLimit(number); 
		serializeIp65504P901ReservdL(ip65504P901ReservdL);
	}

	public void setIp65504P901ReservdL(int number) {
	    number = checkIp65504P901ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P901ReservdL((short)number);
	}
	public void setIp65504P901ReservdL(long number) {
	    number = checkIp65504P901ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P901ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P902ReservdS
	 *	@return ip65504P902ReservdS
	 */
	public short getIp65504P902ReservdS() throws CFException {
        if (isIp65504P902ReservdSModified()) { 
           ip65504P902ReservdS = refreshIp65504P902ReservdS();
        }
   		return ip65504P902ReservdS;
	}
	
	/**
	 * 	Update Ip65504P902ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P902-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P902ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P902ReservdS = checkIp65504P902ReservdSMaxLimit(number); 
		serializeIp65504P902ReservdS(ip65504P902ReservdS);
	}

	public void setIp65504P902ReservdS(int number) {
	    number = checkIp65504P902ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P902ReservdS((short)number);
	}
	public void setIp65504P902ReservdS(long number) {
	    number = checkIp65504P902ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P902ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P902ReservdL
	 *	@return ip65504P902ReservdL
	 */
	public short getIp65504P902ReservdL() throws CFException {
        if (isIp65504P902ReservdLModified()) { 
           ip65504P902ReservdL = refreshIp65504P902ReservdL();
        }
   		return ip65504P902ReservdL;
	}
	
	/**
	 * 	Update Ip65504P902ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P902-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P902ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P902ReservdL = checkIp65504P902ReservdLMaxLimit(number); 
		serializeIp65504P902ReservdL(ip65504P902ReservdL);
	}

	public void setIp65504P902ReservdL(int number) {
	    number = checkIp65504P902ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P902ReservdL((short)number);
	}
	public void setIp65504P902ReservdL(long number) {
	    number = checkIp65504P902ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P902ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P903ReservdS
	 *	@return ip65504P903ReservdS
	 */
	public short getIp65504P903ReservdS() throws CFException {
        if (isIp65504P903ReservdSModified()) { 
           ip65504P903ReservdS = refreshIp65504P903ReservdS();
        }
   		return ip65504P903ReservdS;
	}
	
	/**
	 * 	Update Ip65504P903ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P903-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P903ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P903ReservdS = checkIp65504P903ReservdSMaxLimit(number); 
		serializeIp65504P903ReservdS(ip65504P903ReservdS);
	}

	public void setIp65504P903ReservdS(int number) {
	    number = checkIp65504P903ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P903ReservdS((short)number);
	}
	public void setIp65504P903ReservdS(long number) {
	    number = checkIp65504P903ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P903ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P903ReservdL
	 *	@return ip65504P903ReservdL
	 */
	public short getIp65504P903ReservdL() throws CFException {
        if (isIp65504P903ReservdLModified()) { 
           ip65504P903ReservdL = refreshIp65504P903ReservdL();
        }
   		return ip65504P903ReservdL;
	}
	
	/**
	 * 	Update Ip65504P903ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P903-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P903ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P903ReservdL = checkIp65504P903ReservdLMaxLimit(number); 
		serializeIp65504P903ReservdL(ip65504P903ReservdL);
	}

	public void setIp65504P903ReservdL(int number) {
	    number = checkIp65504P903ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P903ReservdL((short)number);
	}
	public void setIp65504P903ReservdL(long number) {
	    number = checkIp65504P903ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P903ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P904ReservdS
	 *	@return ip65504P904ReservdS
	 */
	public short getIp65504P904ReservdS() throws CFException {
        if (isIp65504P904ReservdSModified()) { 
           ip65504P904ReservdS = refreshIp65504P904ReservdS();
        }
   		return ip65504P904ReservdS;
	}
	
	/**
	 * 	Update Ip65504P904ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P904-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P904ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P904ReservdS = checkIp65504P904ReservdSMaxLimit(number); 
		serializeIp65504P904ReservdS(ip65504P904ReservdS);
	}

	public void setIp65504P904ReservdS(int number) {
	    number = checkIp65504P904ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P904ReservdS((short)number);
	}
	public void setIp65504P904ReservdS(long number) {
	    number = checkIp65504P904ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P904ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P904ReservdL
	 *	@return ip65504P904ReservdL
	 */
	public short getIp65504P904ReservdL() throws CFException {
        if (isIp65504P904ReservdLModified()) { 
           ip65504P904ReservdL = refreshIp65504P904ReservdL();
        }
   		return ip65504P904ReservdL;
	}
	
	/**
	 * 	Update Ip65504P904ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P904-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P904ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P904ReservdL = checkIp65504P904ReservdLMaxLimit(number); 
		serializeIp65504P904ReservdL(ip65504P904ReservdL);
	}

	public void setIp65504P904ReservdL(int number) {
	    number = checkIp65504P904ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P904ReservdL((short)number);
	}
	public void setIp65504P904ReservdL(long number) {
	    number = checkIp65504P904ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P904ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P905ReservdS
	 *	@return ip65504P905ReservdS
	 */
	public short getIp65504P905ReservdS() throws CFException {
        if (isIp65504P905ReservdSModified()) { 
           ip65504P905ReservdS = refreshIp65504P905ReservdS();
        }
   		return ip65504P905ReservdS;
	}
	
	/**
	 * 	Update Ip65504P905ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P905-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P905ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P905ReservdS = checkIp65504P905ReservdSMaxLimit(number); 
		serializeIp65504P905ReservdS(ip65504P905ReservdS);
	}

	public void setIp65504P905ReservdS(int number) {
	    number = checkIp65504P905ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P905ReservdS((short)number);
	}
	public void setIp65504P905ReservdS(long number) {
	    number = checkIp65504P905ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P905ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P905ReservdL
	 *	@return ip65504P905ReservdL
	 */
	public short getIp65504P905ReservdL() throws CFException {
        if (isIp65504P905ReservdLModified()) { 
           ip65504P905ReservdL = refreshIp65504P905ReservdL();
        }
   		return ip65504P905ReservdL;
	}
	
	/**
	 * 	Update Ip65504P905ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P905-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P905ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P905ReservdL = checkIp65504P905ReservdLMaxLimit(number); 
		serializeIp65504P905ReservdL(ip65504P905ReservdL);
	}

	public void setIp65504P905ReservdL(int number) {
	    number = checkIp65504P905ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P905ReservdL((short)number);
	}
	public void setIp65504P905ReservdL(long number) {
	    number = checkIp65504P905ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P905ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P906ReservdS
	 *	@return ip65504P906ReservdS
	 */
	public short getIp65504P906ReservdS() throws CFException {
        if (isIp65504P906ReservdSModified()) { 
           ip65504P906ReservdS = refreshIp65504P906ReservdS();
        }
   		return ip65504P906ReservdS;
	}
	
	/**
	 * 	Update Ip65504P906ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P906-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P906ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P906ReservdS = checkIp65504P906ReservdSMaxLimit(number); 
		serializeIp65504P906ReservdS(ip65504P906ReservdS);
	}

	public void setIp65504P906ReservdS(int number) {
	    number = checkIp65504P906ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P906ReservdS((short)number);
	}
	public void setIp65504P906ReservdS(long number) {
	    number = checkIp65504P906ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P906ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P906ReservdL
	 *	@return ip65504P906ReservdL
	 */
	public short getIp65504P906ReservdL() throws CFException {
        if (isIp65504P906ReservdLModified()) { 
           ip65504P906ReservdL = refreshIp65504P906ReservdL();
        }
   		return ip65504P906ReservdL;
	}
	
	/**
	 * 	Update Ip65504P906ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P906-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P906ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P906ReservdL = checkIp65504P906ReservdLMaxLimit(number); 
		serializeIp65504P906ReservdL(ip65504P906ReservdL);
	}

	public void setIp65504P906ReservdL(int number) {
	    number = checkIp65504P906ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P906ReservdL((short)number);
	}
	public void setIp65504P906ReservdL(long number) {
	    number = checkIp65504P906ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P906ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P907ReservdS
	 *	@return ip65504P907ReservdS
	 */
	public short getIp65504P907ReservdS() throws CFException {
        if (isIp65504P907ReservdSModified()) { 
           ip65504P907ReservdS = refreshIp65504P907ReservdS();
        }
   		return ip65504P907ReservdS;
	}
	
	/**
	 * 	Update Ip65504P907ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P907-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P907ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P907ReservdS = checkIp65504P907ReservdSMaxLimit(number); 
		serializeIp65504P907ReservdS(ip65504P907ReservdS);
	}

	public void setIp65504P907ReservdS(int number) {
	    number = checkIp65504P907ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P907ReservdS((short)number);
	}
	public void setIp65504P907ReservdS(long number) {
	    number = checkIp65504P907ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P907ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P907ReservdL
	 *	@return ip65504P907ReservdL
	 */
	public short getIp65504P907ReservdL() throws CFException {
        if (isIp65504P907ReservdLModified()) { 
           ip65504P907ReservdL = refreshIp65504P907ReservdL();
        }
   		return ip65504P907ReservdL;
	}
	
	/**
	 * 	Update Ip65504P907ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P907-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P907ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P907ReservdL = checkIp65504P907ReservdLMaxLimit(number); 
		serializeIp65504P907ReservdL(ip65504P907ReservdL);
	}

	public void setIp65504P907ReservdL(int number) {
	    number = checkIp65504P907ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P907ReservdL((short)number);
	}
	public void setIp65504P907ReservdL(long number) {
	    number = checkIp65504P907ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P907ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P908ReservdS
	 *	@return ip65504P908ReservdS
	 */
	public short getIp65504P908ReservdS() throws CFException {
        if (isIp65504P908ReservdSModified()) { 
           ip65504P908ReservdS = refreshIp65504P908ReservdS();
        }
   		return ip65504P908ReservdS;
	}
	
	/**
	 * 	Update Ip65504P908ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P908-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P908ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P908ReservdS = checkIp65504P908ReservdSMaxLimit(number); 
		serializeIp65504P908ReservdS(ip65504P908ReservdS);
	}

	public void setIp65504P908ReservdS(int number) {
	    number = checkIp65504P908ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P908ReservdS((short)number);
	}
	public void setIp65504P908ReservdS(long number) {
	    number = checkIp65504P908ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P908ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P908ReservdL
	 *	@return ip65504P908ReservdL
	 */
	public short getIp65504P908ReservdL() throws CFException {
        if (isIp65504P908ReservdLModified()) { 
           ip65504P908ReservdL = refreshIp65504P908ReservdL();
        }
   		return ip65504P908ReservdL;
	}
	
	/**
	 * 	Update Ip65504P908ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P908-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P908ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P908ReservdL = checkIp65504P908ReservdLMaxLimit(number); 
		serializeIp65504P908ReservdL(ip65504P908ReservdL);
	}

	public void setIp65504P908ReservdL(int number) {
	    number = checkIp65504P908ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P908ReservdL((short)number);
	}
	public void setIp65504P908ReservdL(long number) {
	    number = checkIp65504P908ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P908ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P909ReservdS
	 *	@return ip65504P909ReservdS
	 */
	public short getIp65504P909ReservdS() throws CFException {
        if (isIp65504P909ReservdSModified()) { 
           ip65504P909ReservdS = refreshIp65504P909ReservdS();
        }
   		return ip65504P909ReservdS;
	}
	
	/**
	 * 	Update Ip65504P909ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P909-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P909ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P909ReservdS = checkIp65504P909ReservdSMaxLimit(number); 
		serializeIp65504P909ReservdS(ip65504P909ReservdS);
	}

	public void setIp65504P909ReservdS(int number) {
	    number = checkIp65504P909ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P909ReservdS((short)number);
	}
	public void setIp65504P909ReservdS(long number) {
	    number = checkIp65504P909ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P909ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P909ReservdL
	 *	@return ip65504P909ReservdL
	 */
	public short getIp65504P909ReservdL() throws CFException {
        if (isIp65504P909ReservdLModified()) { 
           ip65504P909ReservdL = refreshIp65504P909ReservdL();
        }
   		return ip65504P909ReservdL;
	}
	
	/**
	 * 	Update Ip65504P909ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P909-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P909ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P909ReservdL = checkIp65504P909ReservdLMaxLimit(number); 
		serializeIp65504P909ReservdL(ip65504P909ReservdL);
	}

	public void setIp65504P909ReservdL(int number) {
	    number = checkIp65504P909ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P909ReservdL((short)number);
	}
	public void setIp65504P909ReservdL(long number) {
	    number = checkIp65504P909ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P909ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P910ReservdS
	 *	@return ip65504P910ReservdS
	 */
	public short getIp65504P910ReservdS() throws CFException {
        if (isIp65504P910ReservdSModified()) { 
           ip65504P910ReservdS = refreshIp65504P910ReservdS();
        }
   		return ip65504P910ReservdS;
	}
	
	/**
	 * 	Update Ip65504P910ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P910-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P910ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P910ReservdS = checkIp65504P910ReservdSMaxLimit(number); 
		serializeIp65504P910ReservdS(ip65504P910ReservdS);
	}

	public void setIp65504P910ReservdS(int number) {
	    number = checkIp65504P910ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P910ReservdS((short)number);
	}
	public void setIp65504P910ReservdS(long number) {
	    number = checkIp65504P910ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P910ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P910ReservdL
	 *	@return ip65504P910ReservdL
	 */
	public short getIp65504P910ReservdL() throws CFException {
        if (isIp65504P910ReservdLModified()) { 
           ip65504P910ReservdL = refreshIp65504P910ReservdL();
        }
   		return ip65504P910ReservdL;
	}
	
	/**
	 * 	Update Ip65504P910ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P910-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P910ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P910ReservdL = checkIp65504P910ReservdLMaxLimit(number); 
		serializeIp65504P910ReservdL(ip65504P910ReservdL);
	}

	public void setIp65504P910ReservdL(int number) {
	    number = checkIp65504P910ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P910ReservdL((short)number);
	}
	public void setIp65504P910ReservdL(long number) {
	    number = checkIp65504P910ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P910ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P911ReservdS
	 *	@return ip65504P911ReservdS
	 */
	public short getIp65504P911ReservdS() throws CFException {
        if (isIp65504P911ReservdSModified()) { 
           ip65504P911ReservdS = refreshIp65504P911ReservdS();
        }
   		return ip65504P911ReservdS;
	}
	
	/**
	 * 	Update Ip65504P911ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P911-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P911ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P911ReservdS = checkIp65504P911ReservdSMaxLimit(number); 
		serializeIp65504P911ReservdS(ip65504P911ReservdS);
	}

	public void setIp65504P911ReservdS(int number) {
	    number = checkIp65504P911ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P911ReservdS((short)number);
	}
	public void setIp65504P911ReservdS(long number) {
	    number = checkIp65504P911ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P911ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P911ReservdL
	 *	@return ip65504P911ReservdL
	 */
	public short getIp65504P911ReservdL() throws CFException {
        if (isIp65504P911ReservdLModified()) { 
           ip65504P911ReservdL = refreshIp65504P911ReservdL();
        }
   		return ip65504P911ReservdL;
	}
	
	/**
	 * 	Update Ip65504P911ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P911-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P911ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P911ReservdL = checkIp65504P911ReservdLMaxLimit(number); 
		serializeIp65504P911ReservdL(ip65504P911ReservdL);
	}

	public void setIp65504P911ReservdL(int number) {
	    number = checkIp65504P911ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P911ReservdL((short)number);
	}
	public void setIp65504P911ReservdL(long number) {
	    number = checkIp65504P911ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P911ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P912ReservdS
	 *	@return ip65504P912ReservdS
	 */
	public short getIp65504P912ReservdS() throws CFException {
        if (isIp65504P912ReservdSModified()) { 
           ip65504P912ReservdS = refreshIp65504P912ReservdS();
        }
   		return ip65504P912ReservdS;
	}
	
	/**
	 * 	Update Ip65504P912ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P912-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P912ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P912ReservdS = checkIp65504P912ReservdSMaxLimit(number); 
		serializeIp65504P912ReservdS(ip65504P912ReservdS);
	}

	public void setIp65504P912ReservdS(int number) {
	    number = checkIp65504P912ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P912ReservdS((short)number);
	}
	public void setIp65504P912ReservdS(long number) {
	    number = checkIp65504P912ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P912ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P912ReservdL
	 *	@return ip65504P912ReservdL
	 */
	public short getIp65504P912ReservdL() throws CFException {
        if (isIp65504P912ReservdLModified()) { 
           ip65504P912ReservdL = refreshIp65504P912ReservdL();
        }
   		return ip65504P912ReservdL;
	}
	
	/**
	 * 	Update Ip65504P912ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P912-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P912ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P912ReservdL = checkIp65504P912ReservdLMaxLimit(number); 
		serializeIp65504P912ReservdL(ip65504P912ReservdL);
	}

	public void setIp65504P912ReservdL(int number) {
	    number = checkIp65504P912ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P912ReservdL((short)number);
	}
	public void setIp65504P912ReservdL(long number) {
	    number = checkIp65504P912ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P912ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P913ReservdS
	 *	@return ip65504P913ReservdS
	 */
	public short getIp65504P913ReservdS() throws CFException {
        if (isIp65504P913ReservdSModified()) { 
           ip65504P913ReservdS = refreshIp65504P913ReservdS();
        }
   		return ip65504P913ReservdS;
	}
	
	/**
	 * 	Update Ip65504P913ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P913-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P913ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P913ReservdS = checkIp65504P913ReservdSMaxLimit(number); 
		serializeIp65504P913ReservdS(ip65504P913ReservdS);
	}

	public void setIp65504P913ReservdS(int number) {
	    number = checkIp65504P913ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P913ReservdS((short)number);
	}
	public void setIp65504P913ReservdS(long number) {
	    number = checkIp65504P913ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P913ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P913ReservdL
	 *	@return ip65504P913ReservdL
	 */
	public short getIp65504P913ReservdL() throws CFException {
        if (isIp65504P913ReservdLModified()) { 
           ip65504P913ReservdL = refreshIp65504P913ReservdL();
        }
   		return ip65504P913ReservdL;
	}
	
	/**
	 * 	Update Ip65504P913ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P913-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P913ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P913ReservdL = checkIp65504P913ReservdLMaxLimit(number); 
		serializeIp65504P913ReservdL(ip65504P913ReservdL);
	}

	public void setIp65504P913ReservdL(int number) {
	    number = checkIp65504P913ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P913ReservdL((short)number);
	}
	public void setIp65504P913ReservdL(long number) {
	    number = checkIp65504P913ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P913ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P914ReservdS
	 *	@return ip65504P914ReservdS
	 */
	public short getIp65504P914ReservdS() throws CFException {
        if (isIp65504P914ReservdSModified()) { 
           ip65504P914ReservdS = refreshIp65504P914ReservdS();
        }
   		return ip65504P914ReservdS;
	}
	
	/**
	 * 	Update Ip65504P914ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P914-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P914ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P914ReservdS = checkIp65504P914ReservdSMaxLimit(number); 
		serializeIp65504P914ReservdS(ip65504P914ReservdS);
	}

	public void setIp65504P914ReservdS(int number) {
	    number = checkIp65504P914ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P914ReservdS((short)number);
	}
	public void setIp65504P914ReservdS(long number) {
	    number = checkIp65504P914ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P914ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P914ReservdL
	 *	@return ip65504P914ReservdL
	 */
	public short getIp65504P914ReservdL() throws CFException {
        if (isIp65504P914ReservdLModified()) { 
           ip65504P914ReservdL = refreshIp65504P914ReservdL();
        }
   		return ip65504P914ReservdL;
	}
	
	/**
	 * 	Update Ip65504P914ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P914-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P914ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P914ReservdL = checkIp65504P914ReservdLMaxLimit(number); 
		serializeIp65504P914ReservdL(ip65504P914ReservdL);
	}

	public void setIp65504P914ReservdL(int number) {
	    number = checkIp65504P914ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P914ReservdL((short)number);
	}
	public void setIp65504P914ReservdL(long number) {
	    number = checkIp65504P914ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P914ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P915ReservdS
	 *	@return ip65504P915ReservdS
	 */
	public short getIp65504P915ReservdS() throws CFException {
        if (isIp65504P915ReservdSModified()) { 
           ip65504P915ReservdS = refreshIp65504P915ReservdS();
        }
   		return ip65504P915ReservdS;
	}
	
	/**
	 * 	Update Ip65504P915ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P915-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P915ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P915ReservdS = checkIp65504P915ReservdSMaxLimit(number); 
		serializeIp65504P915ReservdS(ip65504P915ReservdS);
	}

	public void setIp65504P915ReservdS(int number) {
	    number = checkIp65504P915ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P915ReservdS((short)number);
	}
	public void setIp65504P915ReservdS(long number) {
	    number = checkIp65504P915ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P915ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P915ReservdL
	 *	@return ip65504P915ReservdL
	 */
	public short getIp65504P915ReservdL() throws CFException {
        if (isIp65504P915ReservdLModified()) { 
           ip65504P915ReservdL = refreshIp65504P915ReservdL();
        }
   		return ip65504P915ReservdL;
	}
	
	/**
	 * 	Update Ip65504P915ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P915-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P915ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P915ReservdL = checkIp65504P915ReservdLMaxLimit(number); 
		serializeIp65504P915ReservdL(ip65504P915ReservdL);
	}

	public void setIp65504P915ReservdL(int number) {
	    number = checkIp65504P915ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P915ReservdL((short)number);
	}
	public void setIp65504P915ReservdL(long number) {
	    number = checkIp65504P915ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P915ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P916ReservdS
	 *	@return ip65504P916ReservdS
	 */
	public short getIp65504P916ReservdS() throws CFException {
        if (isIp65504P916ReservdSModified()) { 
           ip65504P916ReservdS = refreshIp65504P916ReservdS();
        }
   		return ip65504P916ReservdS;
	}
	
	/**
	 * 	Update Ip65504P916ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P916-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P916ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P916ReservdS = checkIp65504P916ReservdSMaxLimit(number); 
		serializeIp65504P916ReservdS(ip65504P916ReservdS);
	}

	public void setIp65504P916ReservdS(int number) {
	    number = checkIp65504P916ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P916ReservdS((short)number);
	}
	public void setIp65504P916ReservdS(long number) {
	    number = checkIp65504P916ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P916ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P916ReservdL
	 *	@return ip65504P916ReservdL
	 */
	public short getIp65504P916ReservdL() throws CFException {
        if (isIp65504P916ReservdLModified()) { 
           ip65504P916ReservdL = refreshIp65504P916ReservdL();
        }
   		return ip65504P916ReservdL;
	}
	
	/**
	 * 	Update Ip65504P916ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P916-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P916ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P916ReservdL = checkIp65504P916ReservdLMaxLimit(number); 
		serializeIp65504P916ReservdL(ip65504P916ReservdL);
	}

	public void setIp65504P916ReservdL(int number) {
	    number = checkIp65504P916ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P916ReservdL((short)number);
	}
	public void setIp65504P916ReservdL(long number) {
	    number = checkIp65504P916ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P916ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P917ReservdS
	 *	@return ip65504P917ReservdS
	 */
	public short getIp65504P917ReservdS() throws CFException {
        if (isIp65504P917ReservdSModified()) { 
           ip65504P917ReservdS = refreshIp65504P917ReservdS();
        }
   		return ip65504P917ReservdS;
	}
	
	/**
	 * 	Update Ip65504P917ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P917-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P917ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P917ReservdS = checkIp65504P917ReservdSMaxLimit(number); 
		serializeIp65504P917ReservdS(ip65504P917ReservdS);
	}

	public void setIp65504P917ReservdS(int number) {
	    number = checkIp65504P917ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P917ReservdS((short)number);
	}
	public void setIp65504P917ReservdS(long number) {
	    number = checkIp65504P917ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P917ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P917ReservdL
	 *	@return ip65504P917ReservdL
	 */
	public short getIp65504P917ReservdL() throws CFException {
        if (isIp65504P917ReservdLModified()) { 
           ip65504P917ReservdL = refreshIp65504P917ReservdL();
        }
   		return ip65504P917ReservdL;
	}
	
	/**
	 * 	Update Ip65504P917ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P917-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P917ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P917ReservdL = checkIp65504P917ReservdLMaxLimit(number); 
		serializeIp65504P917ReservdL(ip65504P917ReservdL);
	}

	public void setIp65504P917ReservdL(int number) {
	    number = checkIp65504P917ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P917ReservdL((short)number);
	}
	public void setIp65504P917ReservdL(long number) {
	    number = checkIp65504P917ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P917ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P918ReservdS
	 *	@return ip65504P918ReservdS
	 */
	public short getIp65504P918ReservdS() throws CFException {
        if (isIp65504P918ReservdSModified()) { 
           ip65504P918ReservdS = refreshIp65504P918ReservdS();
        }
   		return ip65504P918ReservdS;
	}
	
	/**
	 * 	Update Ip65504P918ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P918-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P918ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P918ReservdS = checkIp65504P918ReservdSMaxLimit(number); 
		serializeIp65504P918ReservdS(ip65504P918ReservdS);
	}

	public void setIp65504P918ReservdS(int number) {
	    number = checkIp65504P918ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P918ReservdS((short)number);
	}
	public void setIp65504P918ReservdS(long number) {
	    number = checkIp65504P918ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P918ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P918ReservdL
	 *	@return ip65504P918ReservdL
	 */
	public short getIp65504P918ReservdL() throws CFException {
        if (isIp65504P918ReservdLModified()) { 
           ip65504P918ReservdL = refreshIp65504P918ReservdL();
        }
   		return ip65504P918ReservdL;
	}
	
	/**
	 * 	Update Ip65504P918ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P918-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P918ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P918ReservdL = checkIp65504P918ReservdLMaxLimit(number); 
		serializeIp65504P918ReservdL(ip65504P918ReservdL);
	}

	public void setIp65504P918ReservdL(int number) {
	    number = checkIp65504P918ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P918ReservdL((short)number);
	}
	public void setIp65504P918ReservdL(long number) {
	    number = checkIp65504P918ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P918ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P919ReservdS
	 *	@return ip65504P919ReservdS
	 */
	public short getIp65504P919ReservdS() throws CFException {
        if (isIp65504P919ReservdSModified()) { 
           ip65504P919ReservdS = refreshIp65504P919ReservdS();
        }
   		return ip65504P919ReservdS;
	}
	
	/**
	 * 	Update Ip65504P919ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P919-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P919ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P919ReservdS = checkIp65504P919ReservdSMaxLimit(number); 
		serializeIp65504P919ReservdS(ip65504P919ReservdS);
	}

	public void setIp65504P919ReservdS(int number) {
	    number = checkIp65504P919ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P919ReservdS((short)number);
	}
	public void setIp65504P919ReservdS(long number) {
	    number = checkIp65504P919ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P919ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P919ReservdL
	 *	@return ip65504P919ReservdL
	 */
	public short getIp65504P919ReservdL() throws CFException {
        if (isIp65504P919ReservdLModified()) { 
           ip65504P919ReservdL = refreshIp65504P919ReservdL();
        }
   		return ip65504P919ReservdL;
	}
	
	/**
	 * 	Update Ip65504P919ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P919-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P919ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P919ReservdL = checkIp65504P919ReservdLMaxLimit(number); 
		serializeIp65504P919ReservdL(ip65504P919ReservdL);
	}

	public void setIp65504P919ReservdL(int number) {
	    number = checkIp65504P919ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P919ReservdL((short)number);
	}
	public void setIp65504P919ReservdL(long number) {
	    number = checkIp65504P919ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P919ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P920ReservdS
	 *	@return ip65504P920ReservdS
	 */
	public short getIp65504P920ReservdS() throws CFException {
        if (isIp65504P920ReservdSModified()) { 
           ip65504P920ReservdS = refreshIp65504P920ReservdS();
        }
   		return ip65504P920ReservdS;
	}
	
	/**
	 * 	Update Ip65504P920ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P920-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P920ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P920ReservdS = checkIp65504P920ReservdSMaxLimit(number); 
		serializeIp65504P920ReservdS(ip65504P920ReservdS);
	}

	public void setIp65504P920ReservdS(int number) {
	    number = checkIp65504P920ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P920ReservdS((short)number);
	}
	public void setIp65504P920ReservdS(long number) {
	    number = checkIp65504P920ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P920ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P920ReservdL
	 *	@return ip65504P920ReservdL
	 */
	public short getIp65504P920ReservdL() throws CFException {
        if (isIp65504P920ReservdLModified()) { 
           ip65504P920ReservdL = refreshIp65504P920ReservdL();
        }
   		return ip65504P920ReservdL;
	}
	
	/**
	 * 	Update Ip65504P920ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P920-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P920ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P920ReservdL = checkIp65504P920ReservdLMaxLimit(number); 
		serializeIp65504P920ReservdL(ip65504P920ReservdL);
	}

	public void setIp65504P920ReservdL(int number) {
	    number = checkIp65504P920ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P920ReservdL((short)number);
	}
	public void setIp65504P920ReservdL(long number) {
	    number = checkIp65504P920ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P920ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P921ReservdS
	 *	@return ip65504P921ReservdS
	 */
	public short getIp65504P921ReservdS() throws CFException {
        if (isIp65504P921ReservdSModified()) { 
           ip65504P921ReservdS = refreshIp65504P921ReservdS();
        }
   		return ip65504P921ReservdS;
	}
	
	/**
	 * 	Update Ip65504P921ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P921-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P921ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P921ReservdS = checkIp65504P921ReservdSMaxLimit(number); 
		serializeIp65504P921ReservdS(ip65504P921ReservdS);
	}

	public void setIp65504P921ReservdS(int number) {
	    number = checkIp65504P921ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P921ReservdS((short)number);
	}
	public void setIp65504P921ReservdS(long number) {
	    number = checkIp65504P921ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P921ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P921ReservdL
	 *	@return ip65504P921ReservdL
	 */
	public short getIp65504P921ReservdL() throws CFException {
        if (isIp65504P921ReservdLModified()) { 
           ip65504P921ReservdL = refreshIp65504P921ReservdL();
        }
   		return ip65504P921ReservdL;
	}
	
	/**
	 * 	Update Ip65504P921ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P921-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P921ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P921ReservdL = checkIp65504P921ReservdLMaxLimit(number); 
		serializeIp65504P921ReservdL(ip65504P921ReservdL);
	}

	public void setIp65504P921ReservdL(int number) {
	    number = checkIp65504P921ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P921ReservdL((short)number);
	}
	public void setIp65504P921ReservdL(long number) {
	    number = checkIp65504P921ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P921ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P922ReservdS
	 *	@return ip65504P922ReservdS
	 */
	public short getIp65504P922ReservdS() throws CFException {
        if (isIp65504P922ReservdSModified()) { 
           ip65504P922ReservdS = refreshIp65504P922ReservdS();
        }
   		return ip65504P922ReservdS;
	}
	
	/**
	 * 	Update Ip65504P922ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P922-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P922ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P922ReservdS = checkIp65504P922ReservdSMaxLimit(number); 
		serializeIp65504P922ReservdS(ip65504P922ReservdS);
	}

	public void setIp65504P922ReservdS(int number) {
	    number = checkIp65504P922ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P922ReservdS((short)number);
	}
	public void setIp65504P922ReservdS(long number) {
	    number = checkIp65504P922ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P922ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P922ReservdL
	 *	@return ip65504P922ReservdL
	 */
	public short getIp65504P922ReservdL() throws CFException {
        if (isIp65504P922ReservdLModified()) { 
           ip65504P922ReservdL = refreshIp65504P922ReservdL();
        }
   		return ip65504P922ReservdL;
	}
	
	/**
	 * 	Update Ip65504P922ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P922-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P922ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P922ReservdL = checkIp65504P922ReservdLMaxLimit(number); 
		serializeIp65504P922ReservdL(ip65504P922ReservdL);
	}

	public void setIp65504P922ReservdL(int number) {
	    number = checkIp65504P922ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P922ReservdL((short)number);
	}
	public void setIp65504P922ReservdL(long number) {
	    number = checkIp65504P922ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P922ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P923ReservdS
	 *	@return ip65504P923ReservdS
	 */
	public short getIp65504P923ReservdS() throws CFException {
        if (isIp65504P923ReservdSModified()) { 
           ip65504P923ReservdS = refreshIp65504P923ReservdS();
        }
   		return ip65504P923ReservdS;
	}
	
	/**
	 * 	Update Ip65504P923ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P923-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P923ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P923ReservdS = checkIp65504P923ReservdSMaxLimit(number); 
		serializeIp65504P923ReservdS(ip65504P923ReservdS);
	}

	public void setIp65504P923ReservdS(int number) {
	    number = checkIp65504P923ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P923ReservdS((short)number);
	}
	public void setIp65504P923ReservdS(long number) {
	    number = checkIp65504P923ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P923ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P923ReservdL
	 *	@return ip65504P923ReservdL
	 */
	public short getIp65504P923ReservdL() throws CFException {
        if (isIp65504P923ReservdLModified()) { 
           ip65504P923ReservdL = refreshIp65504P923ReservdL();
        }
   		return ip65504P923ReservdL;
	}
	
	/**
	 * 	Update Ip65504P923ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P923-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P923ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P923ReservdL = checkIp65504P923ReservdLMaxLimit(number); 
		serializeIp65504P923ReservdL(ip65504P923ReservdL);
	}

	public void setIp65504P923ReservdL(int number) {
	    number = checkIp65504P923ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P923ReservdL((short)number);
	}
	public void setIp65504P923ReservdL(long number) {
	    number = checkIp65504P923ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P923ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P924ReservdS
	 *	@return ip65504P924ReservdS
	 */
	public short getIp65504P924ReservdS() throws CFException {
        if (isIp65504P924ReservdSModified()) { 
           ip65504P924ReservdS = refreshIp65504P924ReservdS();
        }
   		return ip65504P924ReservdS;
	}
	
	/**
	 * 	Update Ip65504P924ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P924-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P924ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P924ReservdS = checkIp65504P924ReservdSMaxLimit(number); 
		serializeIp65504P924ReservdS(ip65504P924ReservdS);
	}

	public void setIp65504P924ReservdS(int number) {
	    number = checkIp65504P924ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P924ReservdS((short)number);
	}
	public void setIp65504P924ReservdS(long number) {
	    number = checkIp65504P924ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P924ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P924ReservdL
	 *	@return ip65504P924ReservdL
	 */
	public short getIp65504P924ReservdL() throws CFException {
        if (isIp65504P924ReservdLModified()) { 
           ip65504P924ReservdL = refreshIp65504P924ReservdL();
        }
   		return ip65504P924ReservdL;
	}
	
	/**
	 * 	Update Ip65504P924ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P924-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P924ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P924ReservdL = checkIp65504P924ReservdLMaxLimit(number); 
		serializeIp65504P924ReservdL(ip65504P924ReservdL);
	}

	public void setIp65504P924ReservdL(int number) {
	    number = checkIp65504P924ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P924ReservdL((short)number);
	}
	public void setIp65504P924ReservdL(long number) {
	    number = checkIp65504P924ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P924ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P925ReservdS
	 *	@return ip65504P925ReservdS
	 */
	public short getIp65504P925ReservdS() throws CFException {
        if (isIp65504P925ReservdSModified()) { 
           ip65504P925ReservdS = refreshIp65504P925ReservdS();
        }
   		return ip65504P925ReservdS;
	}
	
	/**
	 * 	Update Ip65504P925ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P925-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P925ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P925ReservdS = checkIp65504P925ReservdSMaxLimit(number); 
		serializeIp65504P925ReservdS(ip65504P925ReservdS);
	}

	public void setIp65504P925ReservdS(int number) {
	    number = checkIp65504P925ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P925ReservdS((short)number);
	}
	public void setIp65504P925ReservdS(long number) {
	    number = checkIp65504P925ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P925ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P925ReservdL
	 *	@return ip65504P925ReservdL
	 */
	public short getIp65504P925ReservdL() throws CFException {
        if (isIp65504P925ReservdLModified()) { 
           ip65504P925ReservdL = refreshIp65504P925ReservdL();
        }
   		return ip65504P925ReservdL;
	}
	
	/**
	 * 	Update Ip65504P925ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P925-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P925ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P925ReservdL = checkIp65504P925ReservdLMaxLimit(number); 
		serializeIp65504P925ReservdL(ip65504P925ReservdL);
	}

	public void setIp65504P925ReservdL(int number) {
	    number = checkIp65504P925ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P925ReservdL((short)number);
	}
	public void setIp65504P925ReservdL(long number) {
	    number = checkIp65504P925ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P925ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P926ReservdS
	 *	@return ip65504P926ReservdS
	 */
	public short getIp65504P926ReservdS() throws CFException {
        if (isIp65504P926ReservdSModified()) { 
           ip65504P926ReservdS = refreshIp65504P926ReservdS();
        }
   		return ip65504P926ReservdS;
	}
	
	/**
	 * 	Update Ip65504P926ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P926-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P926ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P926ReservdS = checkIp65504P926ReservdSMaxLimit(number); 
		serializeIp65504P926ReservdS(ip65504P926ReservdS);
	}

	public void setIp65504P926ReservdS(int number) {
	    number = checkIp65504P926ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P926ReservdS((short)number);
	}
	public void setIp65504P926ReservdS(long number) {
	    number = checkIp65504P926ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P926ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P926ReservdL
	 *	@return ip65504P926ReservdL
	 */
	public short getIp65504P926ReservdL() throws CFException {
        if (isIp65504P926ReservdLModified()) { 
           ip65504P926ReservdL = refreshIp65504P926ReservdL();
        }
   		return ip65504P926ReservdL;
	}
	
	/**
	 * 	Update Ip65504P926ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P926-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P926ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P926ReservdL = checkIp65504P926ReservdLMaxLimit(number); 
		serializeIp65504P926ReservdL(ip65504P926ReservdL);
	}

	public void setIp65504P926ReservdL(int number) {
	    number = checkIp65504P926ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P926ReservdL((short)number);
	}
	public void setIp65504P926ReservdL(long number) {
	    number = checkIp65504P926ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P926ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P927ReservdS
	 *	@return ip65504P927ReservdS
	 */
	public short getIp65504P927ReservdS() throws CFException {
        if (isIp65504P927ReservdSModified()) { 
           ip65504P927ReservdS = refreshIp65504P927ReservdS();
        }
   		return ip65504P927ReservdS;
	}
	
	/**
	 * 	Update Ip65504P927ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P927-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P927ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P927ReservdS = checkIp65504P927ReservdSMaxLimit(number); 
		serializeIp65504P927ReservdS(ip65504P927ReservdS);
	}

	public void setIp65504P927ReservdS(int number) {
	    number = checkIp65504P927ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P927ReservdS((short)number);
	}
	public void setIp65504P927ReservdS(long number) {
	    number = checkIp65504P927ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P927ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P927ReservdL
	 *	@return ip65504P927ReservdL
	 */
	public short getIp65504P927ReservdL() throws CFException {
        if (isIp65504P927ReservdLModified()) { 
           ip65504P927ReservdL = refreshIp65504P927ReservdL();
        }
   		return ip65504P927ReservdL;
	}
	
	/**
	 * 	Update Ip65504P927ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P927-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P927ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P927ReservdL = checkIp65504P927ReservdLMaxLimit(number); 
		serializeIp65504P927ReservdL(ip65504P927ReservdL);
	}

	public void setIp65504P927ReservdL(int number) {
	    number = checkIp65504P927ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P927ReservdL((short)number);
	}
	public void setIp65504P927ReservdL(long number) {
	    number = checkIp65504P927ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P927ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P928ReservdS
	 *	@return ip65504P928ReservdS
	 */
	public short getIp65504P928ReservdS() throws CFException {
        if (isIp65504P928ReservdSModified()) { 
           ip65504P928ReservdS = refreshIp65504P928ReservdS();
        }
   		return ip65504P928ReservdS;
	}
	
	/**
	 * 	Update Ip65504P928ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P928-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P928ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P928ReservdS = checkIp65504P928ReservdSMaxLimit(number); 
		serializeIp65504P928ReservdS(ip65504P928ReservdS);
	}

	public void setIp65504P928ReservdS(int number) {
	    number = checkIp65504P928ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P928ReservdS((short)number);
	}
	public void setIp65504P928ReservdS(long number) {
	    number = checkIp65504P928ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P928ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P928ReservdL
	 *	@return ip65504P928ReservdL
	 */
	public short getIp65504P928ReservdL() throws CFException {
        if (isIp65504P928ReservdLModified()) { 
           ip65504P928ReservdL = refreshIp65504P928ReservdL();
        }
   		return ip65504P928ReservdL;
	}
	
	/**
	 * 	Update Ip65504P928ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P928-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P928ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P928ReservdL = checkIp65504P928ReservdLMaxLimit(number); 
		serializeIp65504P928ReservdL(ip65504P928ReservdL);
	}

	public void setIp65504P928ReservdL(int number) {
	    number = checkIp65504P928ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P928ReservdL((short)number);
	}
	public void setIp65504P928ReservdL(long number) {
	    number = checkIp65504P928ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P928ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P929ReservdS
	 *	@return ip65504P929ReservdS
	 */
	public short getIp65504P929ReservdS() throws CFException {
        if (isIp65504P929ReservdSModified()) { 
           ip65504P929ReservdS = refreshIp65504P929ReservdS();
        }
   		return ip65504P929ReservdS;
	}
	
	/**
	 * 	Update Ip65504P929ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P929-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P929ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P929ReservdS = checkIp65504P929ReservdSMaxLimit(number); 
		serializeIp65504P929ReservdS(ip65504P929ReservdS);
	}

	public void setIp65504P929ReservdS(int number) {
	    number = checkIp65504P929ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P929ReservdS((short)number);
	}
	public void setIp65504P929ReservdS(long number) {
	    number = checkIp65504P929ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P929ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P929ReservdL
	 *	@return ip65504P929ReservdL
	 */
	public short getIp65504P929ReservdL() throws CFException {
        if (isIp65504P929ReservdLModified()) { 
           ip65504P929ReservdL = refreshIp65504P929ReservdL();
        }
   		return ip65504P929ReservdL;
	}
	
	/**
	 * 	Update Ip65504P929ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P929-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P929ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P929ReservdL = checkIp65504P929ReservdLMaxLimit(number); 
		serializeIp65504P929ReservdL(ip65504P929ReservdL);
	}

	public void setIp65504P929ReservdL(int number) {
	    number = checkIp65504P929ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P929ReservdL((short)number);
	}
	public void setIp65504P929ReservdL(long number) {
	    number = checkIp65504P929ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P929ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P930ReservdS
	 *	@return ip65504P930ReservdS
	 */
	public short getIp65504P930ReservdS() throws CFException {
        if (isIp65504P930ReservdSModified()) { 
           ip65504P930ReservdS = refreshIp65504P930ReservdS();
        }
   		return ip65504P930ReservdS;
	}
	
	/**
	 * 	Update Ip65504P930ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P930-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P930ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P930ReservdS = checkIp65504P930ReservdSMaxLimit(number); 
		serializeIp65504P930ReservdS(ip65504P930ReservdS);
	}

	public void setIp65504P930ReservdS(int number) {
	    number = checkIp65504P930ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P930ReservdS((short)number);
	}
	public void setIp65504P930ReservdS(long number) {
	    number = checkIp65504P930ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P930ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P930ReservdL
	 *	@return ip65504P930ReservdL
	 */
	public short getIp65504P930ReservdL() throws CFException {
        if (isIp65504P930ReservdLModified()) { 
           ip65504P930ReservdL = refreshIp65504P930ReservdL();
        }
   		return ip65504P930ReservdL;
	}
	
	/**
	 * 	Update Ip65504P930ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P930-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P930ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P930ReservdL = checkIp65504P930ReservdLMaxLimit(number); 
		serializeIp65504P930ReservdL(ip65504P930ReservdL);
	}

	public void setIp65504P930ReservdL(int number) {
	    number = checkIp65504P930ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P930ReservdL((short)number);
	}
	public void setIp65504P930ReservdL(long number) {
	    number = checkIp65504P930ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P930ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup30
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P900ReservdS((short)0);
         	setIp65504P900ReservdL((short)0);
         	setIp65504P901ReservdS((short)0);
         	setIp65504P901ReservdL((short)0);
         	setIp65504P902ReservdS((short)0);
         	setIp65504P902ReservdL((short)0);
         	setIp65504P903ReservdS((short)0);
         	setIp65504P903ReservdL((short)0);
         	setIp65504P904ReservdS((short)0);
         	setIp65504P904ReservdL((short)0);
         	setIp65504P905ReservdS((short)0);
         	setIp65504P905ReservdL((short)0);
         	setIp65504P906ReservdS((short)0);
         	setIp65504P906ReservdL((short)0);
         	setIp65504P907ReservdS((short)0);
         	setIp65504P907ReservdL((short)0);
         	setIp65504P908ReservdS((short)0);
         	setIp65504P908ReservdL((short)0);
         	setIp65504P909ReservdS((short)0);
         	setIp65504P909ReservdL((short)0);
         	setIp65504P910ReservdS((short)0);
         	setIp65504P910ReservdL((short)0);
         	setIp65504P911ReservdS((short)0);
         	setIp65504P911ReservdL((short)0);
         	setIp65504P912ReservdS((short)0);
         	setIp65504P912ReservdL((short)0);
         	setIp65504P913ReservdS((short)0);
         	setIp65504P913ReservdL((short)0);
         	setIp65504P914ReservdS((short)0);
         	setIp65504P914ReservdL((short)0);
         	setIp65504P915ReservdS((short)0);
         	setIp65504P915ReservdL((short)0);
         	setIp65504P916ReservdS((short)0);
         	setIp65504P916ReservdL((short)0);
         	setIp65504P917ReservdS((short)0);
         	setIp65504P917ReservdL((short)0);
         	setIp65504P918ReservdS((short)0);
         	setIp65504P918ReservdL((short)0);
         	setIp65504P919ReservdS((short)0);
         	setIp65504P919ReservdL((short)0);
         	setIp65504P920ReservdS((short)0);
         	setIp65504P920ReservdL((short)0);
         	setIp65504P921ReservdS((short)0);
         	setIp65504P921ReservdL((short)0);
         	setIp65504P922ReservdS((short)0);
         	setIp65504P922ReservdL((short)0);
         	setIp65504P923ReservdS((short)0);
         	setIp65504P923ReservdL((short)0);
         	setIp65504P924ReservdS((short)0);
         	setIp65504P924ReservdL((short)0);
         	setIp65504P925ReservdS((short)0);
         	setIp65504P925ReservdL((short)0);
         	setIp65504P926ReservdS((short)0);
         	setIp65504P926ReservdL((short)0);
         	setIp65504P927ReservdS((short)0);
         	setIp65504P927ReservdL((short)0);
         	setIp65504P928ReservdS((short)0);
         	setIp65504P928ReservdL((short)0);
         	setIp65504P929ReservdS((short)0);
         	setIp65504P929ReservdL((short)0);
         	setIp65504P930ReservdS((short)0);
         	setIp65504P930ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup30FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_30_LENGTH;
		}

}
  
