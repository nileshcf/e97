package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup14 extends Ip65504PdsNamesLargeGroup14Serialized { 
   

								private short ip65504P404ReservdS;

								private short ip65504P404ReservdL;


								private short ip65504P405ReservdS;

								private short ip65504P405ReservdL;


								private short ip65504P406ReservdS;

								private short ip65504P406ReservdL;


								private short ip65504P407ReservdS;

								private short ip65504P407ReservdL;


								private short ip65504P408ReservdS;

								private short ip65504P408ReservdL;


								private short ip65504P409ReservdS;

								private short ip65504P409ReservdL;


								private short ip65504P410ReservdS;

								private short ip65504P410ReservdL;


								private short ip65504P411ReservdS;

								private short ip65504P411ReservdL;


								private short ip65504P412ReservdS;

								private short ip65504P412ReservdL;


								private short ip65504P413ReservdS;

								private short ip65504P413ReservdL;


								private short ip65504P414ReservdS;

								private short ip65504P414ReservdL;


								private short ip65504P415ReservdS;

								private short ip65504P415ReservdL;


								private short ip65504P416ReservdS;

								private short ip65504P416ReservdL;


								private short ip65504P417ReservdS;

								private short ip65504P417ReservdL;


								private short ip65504P418ReservdS;

								private short ip65504P418ReservdL;


								private short ip65504P419ReservdS;

								private short ip65504P419ReservdL;


								private short ip65504P420ReservdS;

								private short ip65504P420ReservdL;


								private short ip65504P421ReservdS;

								private short ip65504P421ReservdL;


								private short ip65504P422ReservdS;

								private short ip65504P422ReservdL;


								private short ip65504P423ReservdS;

								private short ip65504P423ReservdL;


								private short ip65504P424ReservdS;

								private short ip65504P424ReservdL;


								private short ip65504P425ReservdS;

								private short ip65504P425ReservdL;


								private short ip65504P426ReservdS;

								private short ip65504P426ReservdL;


								private short ip65504P427ReservdS;

								private short ip65504P427ReservdL;


								private short ip65504P428ReservdS;

								private short ip65504P428ReservdL;


								private short ip65504P429ReservdS;

								private short ip65504P429ReservdL;


								private short ip65504P430ReservdS;

								private short ip65504P430ReservdL;


								private short ip65504P431ReservdS;

								private short ip65504P431ReservdL;


								private short ip65504P432ReservdS;

								private short ip65504P432ReservdL;


								private short ip65504P433ReservdS;

								private short ip65504P433ReservdL;


								private short ip65504P434ReservdS;

								private short ip65504P434ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup14
	**/
    public Ip65504PdsNamesLargeGroup14() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup14. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup14(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P404ReservdS
	 *	@return ip65504P404ReservdS
	 */
	public short getIp65504P404ReservdS() throws CFException {
        if (isIp65504P404ReservdSModified()) { 
           ip65504P404ReservdS = refreshIp65504P404ReservdS();
        }
   		return ip65504P404ReservdS;
	}
	
	/**
	 * 	Update Ip65504P404ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P404-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P404ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P404ReservdS = checkIp65504P404ReservdSMaxLimit(number); 
		serializeIp65504P404ReservdS(ip65504P404ReservdS);
	}

	public void setIp65504P404ReservdS(int number) {
	    number = checkIp65504P404ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P404ReservdS((short)number);
	}
	public void setIp65504P404ReservdS(long number) {
	    number = checkIp65504P404ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P404ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P404ReservdL
	 *	@return ip65504P404ReservdL
	 */
	public short getIp65504P404ReservdL() throws CFException {
        if (isIp65504P404ReservdLModified()) { 
           ip65504P404ReservdL = refreshIp65504P404ReservdL();
        }
   		return ip65504P404ReservdL;
	}
	
	/**
	 * 	Update Ip65504P404ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P404-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P404ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P404ReservdL = checkIp65504P404ReservdLMaxLimit(number); 
		serializeIp65504P404ReservdL(ip65504P404ReservdL);
	}

	public void setIp65504P404ReservdL(int number) {
	    number = checkIp65504P404ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P404ReservdL((short)number);
	}
	public void setIp65504P404ReservdL(long number) {
	    number = checkIp65504P404ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P404ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P405ReservdS
	 *	@return ip65504P405ReservdS
	 */
	public short getIp65504P405ReservdS() throws CFException {
        if (isIp65504P405ReservdSModified()) { 
           ip65504P405ReservdS = refreshIp65504P405ReservdS();
        }
   		return ip65504P405ReservdS;
	}
	
	/**
	 * 	Update Ip65504P405ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P405-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P405ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P405ReservdS = checkIp65504P405ReservdSMaxLimit(number); 
		serializeIp65504P405ReservdS(ip65504P405ReservdS);
	}

	public void setIp65504P405ReservdS(int number) {
	    number = checkIp65504P405ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P405ReservdS((short)number);
	}
	public void setIp65504P405ReservdS(long number) {
	    number = checkIp65504P405ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P405ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P405ReservdL
	 *	@return ip65504P405ReservdL
	 */
	public short getIp65504P405ReservdL() throws CFException {
        if (isIp65504P405ReservdLModified()) { 
           ip65504P405ReservdL = refreshIp65504P405ReservdL();
        }
   		return ip65504P405ReservdL;
	}
	
	/**
	 * 	Update Ip65504P405ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P405-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P405ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P405ReservdL = checkIp65504P405ReservdLMaxLimit(number); 
		serializeIp65504P405ReservdL(ip65504P405ReservdL);
	}

	public void setIp65504P405ReservdL(int number) {
	    number = checkIp65504P405ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P405ReservdL((short)number);
	}
	public void setIp65504P405ReservdL(long number) {
	    number = checkIp65504P405ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P405ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P406ReservdS
	 *	@return ip65504P406ReservdS
	 */
	public short getIp65504P406ReservdS() throws CFException {
        if (isIp65504P406ReservdSModified()) { 
           ip65504P406ReservdS = refreshIp65504P406ReservdS();
        }
   		return ip65504P406ReservdS;
	}
	
	/**
	 * 	Update Ip65504P406ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P406-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P406ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P406ReservdS = checkIp65504P406ReservdSMaxLimit(number); 
		serializeIp65504P406ReservdS(ip65504P406ReservdS);
	}

	public void setIp65504P406ReservdS(int number) {
	    number = checkIp65504P406ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P406ReservdS((short)number);
	}
	public void setIp65504P406ReservdS(long number) {
	    number = checkIp65504P406ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P406ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P406ReservdL
	 *	@return ip65504P406ReservdL
	 */
	public short getIp65504P406ReservdL() throws CFException {
        if (isIp65504P406ReservdLModified()) { 
           ip65504P406ReservdL = refreshIp65504P406ReservdL();
        }
   		return ip65504P406ReservdL;
	}
	
	/**
	 * 	Update Ip65504P406ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P406-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P406ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P406ReservdL = checkIp65504P406ReservdLMaxLimit(number); 
		serializeIp65504P406ReservdL(ip65504P406ReservdL);
	}

	public void setIp65504P406ReservdL(int number) {
	    number = checkIp65504P406ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P406ReservdL((short)number);
	}
	public void setIp65504P406ReservdL(long number) {
	    number = checkIp65504P406ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P406ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P407ReservdS
	 *	@return ip65504P407ReservdS
	 */
	public short getIp65504P407ReservdS() throws CFException {
        if (isIp65504P407ReservdSModified()) { 
           ip65504P407ReservdS = refreshIp65504P407ReservdS();
        }
   		return ip65504P407ReservdS;
	}
	
	/**
	 * 	Update Ip65504P407ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P407-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P407ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P407ReservdS = checkIp65504P407ReservdSMaxLimit(number); 
		serializeIp65504P407ReservdS(ip65504P407ReservdS);
	}

	public void setIp65504P407ReservdS(int number) {
	    number = checkIp65504P407ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P407ReservdS((short)number);
	}
	public void setIp65504P407ReservdS(long number) {
	    number = checkIp65504P407ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P407ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P407ReservdL
	 *	@return ip65504P407ReservdL
	 */
	public short getIp65504P407ReservdL() throws CFException {
        if (isIp65504P407ReservdLModified()) { 
           ip65504P407ReservdL = refreshIp65504P407ReservdL();
        }
   		return ip65504P407ReservdL;
	}
	
	/**
	 * 	Update Ip65504P407ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P407-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P407ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P407ReservdL = checkIp65504P407ReservdLMaxLimit(number); 
		serializeIp65504P407ReservdL(ip65504P407ReservdL);
	}

	public void setIp65504P407ReservdL(int number) {
	    number = checkIp65504P407ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P407ReservdL((short)number);
	}
	public void setIp65504P407ReservdL(long number) {
	    number = checkIp65504P407ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P407ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P408ReservdS
	 *	@return ip65504P408ReservdS
	 */
	public short getIp65504P408ReservdS() throws CFException {
        if (isIp65504P408ReservdSModified()) { 
           ip65504P408ReservdS = refreshIp65504P408ReservdS();
        }
   		return ip65504P408ReservdS;
	}
	
	/**
	 * 	Update Ip65504P408ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P408-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P408ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P408ReservdS = checkIp65504P408ReservdSMaxLimit(number); 
		serializeIp65504P408ReservdS(ip65504P408ReservdS);
	}

	public void setIp65504P408ReservdS(int number) {
	    number = checkIp65504P408ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P408ReservdS((short)number);
	}
	public void setIp65504P408ReservdS(long number) {
	    number = checkIp65504P408ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P408ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P408ReservdL
	 *	@return ip65504P408ReservdL
	 */
	public short getIp65504P408ReservdL() throws CFException {
        if (isIp65504P408ReservdLModified()) { 
           ip65504P408ReservdL = refreshIp65504P408ReservdL();
        }
   		return ip65504P408ReservdL;
	}
	
	/**
	 * 	Update Ip65504P408ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P408-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P408ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P408ReservdL = checkIp65504P408ReservdLMaxLimit(number); 
		serializeIp65504P408ReservdL(ip65504P408ReservdL);
	}

	public void setIp65504P408ReservdL(int number) {
	    number = checkIp65504P408ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P408ReservdL((short)number);
	}
	public void setIp65504P408ReservdL(long number) {
	    number = checkIp65504P408ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P408ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P409ReservdS
	 *	@return ip65504P409ReservdS
	 */
	public short getIp65504P409ReservdS() throws CFException {
        if (isIp65504P409ReservdSModified()) { 
           ip65504P409ReservdS = refreshIp65504P409ReservdS();
        }
   		return ip65504P409ReservdS;
	}
	
	/**
	 * 	Update Ip65504P409ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P409-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P409ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P409ReservdS = checkIp65504P409ReservdSMaxLimit(number); 
		serializeIp65504P409ReservdS(ip65504P409ReservdS);
	}

	public void setIp65504P409ReservdS(int number) {
	    number = checkIp65504P409ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P409ReservdS((short)number);
	}
	public void setIp65504P409ReservdS(long number) {
	    number = checkIp65504P409ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P409ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P409ReservdL
	 *	@return ip65504P409ReservdL
	 */
	public short getIp65504P409ReservdL() throws CFException {
        if (isIp65504P409ReservdLModified()) { 
           ip65504P409ReservdL = refreshIp65504P409ReservdL();
        }
   		return ip65504P409ReservdL;
	}
	
	/**
	 * 	Update Ip65504P409ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P409-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P409ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P409ReservdL = checkIp65504P409ReservdLMaxLimit(number); 
		serializeIp65504P409ReservdL(ip65504P409ReservdL);
	}

	public void setIp65504P409ReservdL(int number) {
	    number = checkIp65504P409ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P409ReservdL((short)number);
	}
	public void setIp65504P409ReservdL(long number) {
	    number = checkIp65504P409ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P409ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P410ReservdS
	 *	@return ip65504P410ReservdS
	 */
	public short getIp65504P410ReservdS() throws CFException {
        if (isIp65504P410ReservdSModified()) { 
           ip65504P410ReservdS = refreshIp65504P410ReservdS();
        }
   		return ip65504P410ReservdS;
	}
	
	/**
	 * 	Update Ip65504P410ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P410-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P410ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P410ReservdS = checkIp65504P410ReservdSMaxLimit(number); 
		serializeIp65504P410ReservdS(ip65504P410ReservdS);
	}

	public void setIp65504P410ReservdS(int number) {
	    number = checkIp65504P410ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P410ReservdS((short)number);
	}
	public void setIp65504P410ReservdS(long number) {
	    number = checkIp65504P410ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P410ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P410ReservdL
	 *	@return ip65504P410ReservdL
	 */
	public short getIp65504P410ReservdL() throws CFException {
        if (isIp65504P410ReservdLModified()) { 
           ip65504P410ReservdL = refreshIp65504P410ReservdL();
        }
   		return ip65504P410ReservdL;
	}
	
	/**
	 * 	Update Ip65504P410ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P410-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P410ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P410ReservdL = checkIp65504P410ReservdLMaxLimit(number); 
		serializeIp65504P410ReservdL(ip65504P410ReservdL);
	}

	public void setIp65504P410ReservdL(int number) {
	    number = checkIp65504P410ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P410ReservdL((short)number);
	}
	public void setIp65504P410ReservdL(long number) {
	    number = checkIp65504P410ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P410ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P411ReservdS
	 *	@return ip65504P411ReservdS
	 */
	public short getIp65504P411ReservdS() throws CFException {
        if (isIp65504P411ReservdSModified()) { 
           ip65504P411ReservdS = refreshIp65504P411ReservdS();
        }
   		return ip65504P411ReservdS;
	}
	
	/**
	 * 	Update Ip65504P411ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P411-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P411ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P411ReservdS = checkIp65504P411ReservdSMaxLimit(number); 
		serializeIp65504P411ReservdS(ip65504P411ReservdS);
	}

	public void setIp65504P411ReservdS(int number) {
	    number = checkIp65504P411ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P411ReservdS((short)number);
	}
	public void setIp65504P411ReservdS(long number) {
	    number = checkIp65504P411ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P411ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P411ReservdL
	 *	@return ip65504P411ReservdL
	 */
	public short getIp65504P411ReservdL() throws CFException {
        if (isIp65504P411ReservdLModified()) { 
           ip65504P411ReservdL = refreshIp65504P411ReservdL();
        }
   		return ip65504P411ReservdL;
	}
	
	/**
	 * 	Update Ip65504P411ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P411-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P411ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P411ReservdL = checkIp65504P411ReservdLMaxLimit(number); 
		serializeIp65504P411ReservdL(ip65504P411ReservdL);
	}

	public void setIp65504P411ReservdL(int number) {
	    number = checkIp65504P411ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P411ReservdL((short)number);
	}
	public void setIp65504P411ReservdL(long number) {
	    number = checkIp65504P411ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P411ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P412ReservdS
	 *	@return ip65504P412ReservdS
	 */
	public short getIp65504P412ReservdS() throws CFException {
        if (isIp65504P412ReservdSModified()) { 
           ip65504P412ReservdS = refreshIp65504P412ReservdS();
        }
   		return ip65504P412ReservdS;
	}
	
	/**
	 * 	Update Ip65504P412ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P412-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P412ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P412ReservdS = checkIp65504P412ReservdSMaxLimit(number); 
		serializeIp65504P412ReservdS(ip65504P412ReservdS);
	}

	public void setIp65504P412ReservdS(int number) {
	    number = checkIp65504P412ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P412ReservdS((short)number);
	}
	public void setIp65504P412ReservdS(long number) {
	    number = checkIp65504P412ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P412ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P412ReservdL
	 *	@return ip65504P412ReservdL
	 */
	public short getIp65504P412ReservdL() throws CFException {
        if (isIp65504P412ReservdLModified()) { 
           ip65504P412ReservdL = refreshIp65504P412ReservdL();
        }
   		return ip65504P412ReservdL;
	}
	
	/**
	 * 	Update Ip65504P412ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P412-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P412ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P412ReservdL = checkIp65504P412ReservdLMaxLimit(number); 
		serializeIp65504P412ReservdL(ip65504P412ReservdL);
	}

	public void setIp65504P412ReservdL(int number) {
	    number = checkIp65504P412ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P412ReservdL((short)number);
	}
	public void setIp65504P412ReservdL(long number) {
	    number = checkIp65504P412ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P412ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P413ReservdS
	 *	@return ip65504P413ReservdS
	 */
	public short getIp65504P413ReservdS() throws CFException {
        if (isIp65504P413ReservdSModified()) { 
           ip65504P413ReservdS = refreshIp65504P413ReservdS();
        }
   		return ip65504P413ReservdS;
	}
	
	/**
	 * 	Update Ip65504P413ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P413-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P413ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P413ReservdS = checkIp65504P413ReservdSMaxLimit(number); 
		serializeIp65504P413ReservdS(ip65504P413ReservdS);
	}

	public void setIp65504P413ReservdS(int number) {
	    number = checkIp65504P413ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P413ReservdS((short)number);
	}
	public void setIp65504P413ReservdS(long number) {
	    number = checkIp65504P413ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P413ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P413ReservdL
	 *	@return ip65504P413ReservdL
	 */
	public short getIp65504P413ReservdL() throws CFException {
        if (isIp65504P413ReservdLModified()) { 
           ip65504P413ReservdL = refreshIp65504P413ReservdL();
        }
   		return ip65504P413ReservdL;
	}
	
	/**
	 * 	Update Ip65504P413ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P413-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P413ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P413ReservdL = checkIp65504P413ReservdLMaxLimit(number); 
		serializeIp65504P413ReservdL(ip65504P413ReservdL);
	}

	public void setIp65504P413ReservdL(int number) {
	    number = checkIp65504P413ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P413ReservdL((short)number);
	}
	public void setIp65504P413ReservdL(long number) {
	    number = checkIp65504P413ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P413ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P414ReservdS
	 *	@return ip65504P414ReservdS
	 */
	public short getIp65504P414ReservdS() throws CFException {
        if (isIp65504P414ReservdSModified()) { 
           ip65504P414ReservdS = refreshIp65504P414ReservdS();
        }
   		return ip65504P414ReservdS;
	}
	
	/**
	 * 	Update Ip65504P414ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P414-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P414ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P414ReservdS = checkIp65504P414ReservdSMaxLimit(number); 
		serializeIp65504P414ReservdS(ip65504P414ReservdS);
	}

	public void setIp65504P414ReservdS(int number) {
	    number = checkIp65504P414ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P414ReservdS((short)number);
	}
	public void setIp65504P414ReservdS(long number) {
	    number = checkIp65504P414ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P414ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P414ReservdL
	 *	@return ip65504P414ReservdL
	 */
	public short getIp65504P414ReservdL() throws CFException {
        if (isIp65504P414ReservdLModified()) { 
           ip65504P414ReservdL = refreshIp65504P414ReservdL();
        }
   		return ip65504P414ReservdL;
	}
	
	/**
	 * 	Update Ip65504P414ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P414-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P414ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P414ReservdL = checkIp65504P414ReservdLMaxLimit(number); 
		serializeIp65504P414ReservdL(ip65504P414ReservdL);
	}

	public void setIp65504P414ReservdL(int number) {
	    number = checkIp65504P414ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P414ReservdL((short)number);
	}
	public void setIp65504P414ReservdL(long number) {
	    number = checkIp65504P414ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P414ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P415ReservdS
	 *	@return ip65504P415ReservdS
	 */
	public short getIp65504P415ReservdS() throws CFException {
        if (isIp65504P415ReservdSModified()) { 
           ip65504P415ReservdS = refreshIp65504P415ReservdS();
        }
   		return ip65504P415ReservdS;
	}
	
	/**
	 * 	Update Ip65504P415ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P415-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P415ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P415ReservdS = checkIp65504P415ReservdSMaxLimit(number); 
		serializeIp65504P415ReservdS(ip65504P415ReservdS);
	}

	public void setIp65504P415ReservdS(int number) {
	    number = checkIp65504P415ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P415ReservdS((short)number);
	}
	public void setIp65504P415ReservdS(long number) {
	    number = checkIp65504P415ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P415ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P415ReservdL
	 *	@return ip65504P415ReservdL
	 */
	public short getIp65504P415ReservdL() throws CFException {
        if (isIp65504P415ReservdLModified()) { 
           ip65504P415ReservdL = refreshIp65504P415ReservdL();
        }
   		return ip65504P415ReservdL;
	}
	
	/**
	 * 	Update Ip65504P415ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P415-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P415ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P415ReservdL = checkIp65504P415ReservdLMaxLimit(number); 
		serializeIp65504P415ReservdL(ip65504P415ReservdL);
	}

	public void setIp65504P415ReservdL(int number) {
	    number = checkIp65504P415ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P415ReservdL((short)number);
	}
	public void setIp65504P415ReservdL(long number) {
	    number = checkIp65504P415ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P415ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P416ReservdS
	 *	@return ip65504P416ReservdS
	 */
	public short getIp65504P416ReservdS() throws CFException {
        if (isIp65504P416ReservdSModified()) { 
           ip65504P416ReservdS = refreshIp65504P416ReservdS();
        }
   		return ip65504P416ReservdS;
	}
	
	/**
	 * 	Update Ip65504P416ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P416-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P416ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P416ReservdS = checkIp65504P416ReservdSMaxLimit(number); 
		serializeIp65504P416ReservdS(ip65504P416ReservdS);
	}

	public void setIp65504P416ReservdS(int number) {
	    number = checkIp65504P416ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P416ReservdS((short)number);
	}
	public void setIp65504P416ReservdS(long number) {
	    number = checkIp65504P416ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P416ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P416ReservdL
	 *	@return ip65504P416ReservdL
	 */
	public short getIp65504P416ReservdL() throws CFException {
        if (isIp65504P416ReservdLModified()) { 
           ip65504P416ReservdL = refreshIp65504P416ReservdL();
        }
   		return ip65504P416ReservdL;
	}
	
	/**
	 * 	Update Ip65504P416ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P416-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P416ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P416ReservdL = checkIp65504P416ReservdLMaxLimit(number); 
		serializeIp65504P416ReservdL(ip65504P416ReservdL);
	}

	public void setIp65504P416ReservdL(int number) {
	    number = checkIp65504P416ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P416ReservdL((short)number);
	}
	public void setIp65504P416ReservdL(long number) {
	    number = checkIp65504P416ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P416ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P417ReservdS
	 *	@return ip65504P417ReservdS
	 */
	public short getIp65504P417ReservdS() throws CFException {
        if (isIp65504P417ReservdSModified()) { 
           ip65504P417ReservdS = refreshIp65504P417ReservdS();
        }
   		return ip65504P417ReservdS;
	}
	
	/**
	 * 	Update Ip65504P417ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P417-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P417ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P417ReservdS = checkIp65504P417ReservdSMaxLimit(number); 
		serializeIp65504P417ReservdS(ip65504P417ReservdS);
	}

	public void setIp65504P417ReservdS(int number) {
	    number = checkIp65504P417ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P417ReservdS((short)number);
	}
	public void setIp65504P417ReservdS(long number) {
	    number = checkIp65504P417ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P417ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P417ReservdL
	 *	@return ip65504P417ReservdL
	 */
	public short getIp65504P417ReservdL() throws CFException {
        if (isIp65504P417ReservdLModified()) { 
           ip65504P417ReservdL = refreshIp65504P417ReservdL();
        }
   		return ip65504P417ReservdL;
	}
	
	/**
	 * 	Update Ip65504P417ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P417-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P417ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P417ReservdL = checkIp65504P417ReservdLMaxLimit(number); 
		serializeIp65504P417ReservdL(ip65504P417ReservdL);
	}

	public void setIp65504P417ReservdL(int number) {
	    number = checkIp65504P417ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P417ReservdL((short)number);
	}
	public void setIp65504P417ReservdL(long number) {
	    number = checkIp65504P417ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P417ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P418ReservdS
	 *	@return ip65504P418ReservdS
	 */
	public short getIp65504P418ReservdS() throws CFException {
        if (isIp65504P418ReservdSModified()) { 
           ip65504P418ReservdS = refreshIp65504P418ReservdS();
        }
   		return ip65504P418ReservdS;
	}
	
	/**
	 * 	Update Ip65504P418ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P418-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P418ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P418ReservdS = checkIp65504P418ReservdSMaxLimit(number); 
		serializeIp65504P418ReservdS(ip65504P418ReservdS);
	}

	public void setIp65504P418ReservdS(int number) {
	    number = checkIp65504P418ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P418ReservdS((short)number);
	}
	public void setIp65504P418ReservdS(long number) {
	    number = checkIp65504P418ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P418ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P418ReservdL
	 *	@return ip65504P418ReservdL
	 */
	public short getIp65504P418ReservdL() throws CFException {
        if (isIp65504P418ReservdLModified()) { 
           ip65504P418ReservdL = refreshIp65504P418ReservdL();
        }
   		return ip65504P418ReservdL;
	}
	
	/**
	 * 	Update Ip65504P418ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P418-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P418ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P418ReservdL = checkIp65504P418ReservdLMaxLimit(number); 
		serializeIp65504P418ReservdL(ip65504P418ReservdL);
	}

	public void setIp65504P418ReservdL(int number) {
	    number = checkIp65504P418ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P418ReservdL((short)number);
	}
	public void setIp65504P418ReservdL(long number) {
	    number = checkIp65504P418ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P418ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P419ReservdS
	 *	@return ip65504P419ReservdS
	 */
	public short getIp65504P419ReservdS() throws CFException {
        if (isIp65504P419ReservdSModified()) { 
           ip65504P419ReservdS = refreshIp65504P419ReservdS();
        }
   		return ip65504P419ReservdS;
	}
	
	/**
	 * 	Update Ip65504P419ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P419-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P419ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P419ReservdS = checkIp65504P419ReservdSMaxLimit(number); 
		serializeIp65504P419ReservdS(ip65504P419ReservdS);
	}

	public void setIp65504P419ReservdS(int number) {
	    number = checkIp65504P419ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P419ReservdS((short)number);
	}
	public void setIp65504P419ReservdS(long number) {
	    number = checkIp65504P419ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P419ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P419ReservdL
	 *	@return ip65504P419ReservdL
	 */
	public short getIp65504P419ReservdL() throws CFException {
        if (isIp65504P419ReservdLModified()) { 
           ip65504P419ReservdL = refreshIp65504P419ReservdL();
        }
   		return ip65504P419ReservdL;
	}
	
	/**
	 * 	Update Ip65504P419ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P419-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P419ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P419ReservdL = checkIp65504P419ReservdLMaxLimit(number); 
		serializeIp65504P419ReservdL(ip65504P419ReservdL);
	}

	public void setIp65504P419ReservdL(int number) {
	    number = checkIp65504P419ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P419ReservdL((short)number);
	}
	public void setIp65504P419ReservdL(long number) {
	    number = checkIp65504P419ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P419ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P420ReservdS
	 *	@return ip65504P420ReservdS
	 */
	public short getIp65504P420ReservdS() throws CFException {
        if (isIp65504P420ReservdSModified()) { 
           ip65504P420ReservdS = refreshIp65504P420ReservdS();
        }
   		return ip65504P420ReservdS;
	}
	
	/**
	 * 	Update Ip65504P420ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P420-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P420ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P420ReservdS = checkIp65504P420ReservdSMaxLimit(number); 
		serializeIp65504P420ReservdS(ip65504P420ReservdS);
	}

	public void setIp65504P420ReservdS(int number) {
	    number = checkIp65504P420ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P420ReservdS((short)number);
	}
	public void setIp65504P420ReservdS(long number) {
	    number = checkIp65504P420ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P420ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P420ReservdL
	 *	@return ip65504P420ReservdL
	 */
	public short getIp65504P420ReservdL() throws CFException {
        if (isIp65504P420ReservdLModified()) { 
           ip65504P420ReservdL = refreshIp65504P420ReservdL();
        }
   		return ip65504P420ReservdL;
	}
	
	/**
	 * 	Update Ip65504P420ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P420-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P420ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P420ReservdL = checkIp65504P420ReservdLMaxLimit(number); 
		serializeIp65504P420ReservdL(ip65504P420ReservdL);
	}

	public void setIp65504P420ReservdL(int number) {
	    number = checkIp65504P420ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P420ReservdL((short)number);
	}
	public void setIp65504P420ReservdL(long number) {
	    number = checkIp65504P420ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P420ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P421ReservdS
	 *	@return ip65504P421ReservdS
	 */
	public short getIp65504P421ReservdS() throws CFException {
        if (isIp65504P421ReservdSModified()) { 
           ip65504P421ReservdS = refreshIp65504P421ReservdS();
        }
   		return ip65504P421ReservdS;
	}
	
	/**
	 * 	Update Ip65504P421ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P421-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P421ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P421ReservdS = checkIp65504P421ReservdSMaxLimit(number); 
		serializeIp65504P421ReservdS(ip65504P421ReservdS);
	}

	public void setIp65504P421ReservdS(int number) {
	    number = checkIp65504P421ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P421ReservdS((short)number);
	}
	public void setIp65504P421ReservdS(long number) {
	    number = checkIp65504P421ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P421ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P421ReservdL
	 *	@return ip65504P421ReservdL
	 */
	public short getIp65504P421ReservdL() throws CFException {
        if (isIp65504P421ReservdLModified()) { 
           ip65504P421ReservdL = refreshIp65504P421ReservdL();
        }
   		return ip65504P421ReservdL;
	}
	
	/**
	 * 	Update Ip65504P421ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P421-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P421ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P421ReservdL = checkIp65504P421ReservdLMaxLimit(number); 
		serializeIp65504P421ReservdL(ip65504P421ReservdL);
	}

	public void setIp65504P421ReservdL(int number) {
	    number = checkIp65504P421ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P421ReservdL((short)number);
	}
	public void setIp65504P421ReservdL(long number) {
	    number = checkIp65504P421ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P421ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P422ReservdS
	 *	@return ip65504P422ReservdS
	 */
	public short getIp65504P422ReservdS() throws CFException {
        if (isIp65504P422ReservdSModified()) { 
           ip65504P422ReservdS = refreshIp65504P422ReservdS();
        }
   		return ip65504P422ReservdS;
	}
	
	/**
	 * 	Update Ip65504P422ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P422-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P422ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P422ReservdS = checkIp65504P422ReservdSMaxLimit(number); 
		serializeIp65504P422ReservdS(ip65504P422ReservdS);
	}

	public void setIp65504P422ReservdS(int number) {
	    number = checkIp65504P422ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P422ReservdS((short)number);
	}
	public void setIp65504P422ReservdS(long number) {
	    number = checkIp65504P422ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P422ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P422ReservdL
	 *	@return ip65504P422ReservdL
	 */
	public short getIp65504P422ReservdL() throws CFException {
        if (isIp65504P422ReservdLModified()) { 
           ip65504P422ReservdL = refreshIp65504P422ReservdL();
        }
   		return ip65504P422ReservdL;
	}
	
	/**
	 * 	Update Ip65504P422ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P422-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P422ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P422ReservdL = checkIp65504P422ReservdLMaxLimit(number); 
		serializeIp65504P422ReservdL(ip65504P422ReservdL);
	}

	public void setIp65504P422ReservdL(int number) {
	    number = checkIp65504P422ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P422ReservdL((short)number);
	}
	public void setIp65504P422ReservdL(long number) {
	    number = checkIp65504P422ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P422ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P423ReservdS
	 *	@return ip65504P423ReservdS
	 */
	public short getIp65504P423ReservdS() throws CFException {
        if (isIp65504P423ReservdSModified()) { 
           ip65504P423ReservdS = refreshIp65504P423ReservdS();
        }
   		return ip65504P423ReservdS;
	}
	
	/**
	 * 	Update Ip65504P423ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P423-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P423ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P423ReservdS = checkIp65504P423ReservdSMaxLimit(number); 
		serializeIp65504P423ReservdS(ip65504P423ReservdS);
	}

	public void setIp65504P423ReservdS(int number) {
	    number = checkIp65504P423ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P423ReservdS((short)number);
	}
	public void setIp65504P423ReservdS(long number) {
	    number = checkIp65504P423ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P423ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P423ReservdL
	 *	@return ip65504P423ReservdL
	 */
	public short getIp65504P423ReservdL() throws CFException {
        if (isIp65504P423ReservdLModified()) { 
           ip65504P423ReservdL = refreshIp65504P423ReservdL();
        }
   		return ip65504P423ReservdL;
	}
	
	/**
	 * 	Update Ip65504P423ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P423-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P423ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P423ReservdL = checkIp65504P423ReservdLMaxLimit(number); 
		serializeIp65504P423ReservdL(ip65504P423ReservdL);
	}

	public void setIp65504P423ReservdL(int number) {
	    number = checkIp65504P423ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P423ReservdL((short)number);
	}
	public void setIp65504P423ReservdL(long number) {
	    number = checkIp65504P423ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P423ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P424ReservdS
	 *	@return ip65504P424ReservdS
	 */
	public short getIp65504P424ReservdS() throws CFException {
        if (isIp65504P424ReservdSModified()) { 
           ip65504P424ReservdS = refreshIp65504P424ReservdS();
        }
   		return ip65504P424ReservdS;
	}
	
	/**
	 * 	Update Ip65504P424ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P424-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P424ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P424ReservdS = checkIp65504P424ReservdSMaxLimit(number); 
		serializeIp65504P424ReservdS(ip65504P424ReservdS);
	}

	public void setIp65504P424ReservdS(int number) {
	    number = checkIp65504P424ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P424ReservdS((short)number);
	}
	public void setIp65504P424ReservdS(long number) {
	    number = checkIp65504P424ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P424ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P424ReservdL
	 *	@return ip65504P424ReservdL
	 */
	public short getIp65504P424ReservdL() throws CFException {
        if (isIp65504P424ReservdLModified()) { 
           ip65504P424ReservdL = refreshIp65504P424ReservdL();
        }
   		return ip65504P424ReservdL;
	}
	
	/**
	 * 	Update Ip65504P424ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P424-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P424ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P424ReservdL = checkIp65504P424ReservdLMaxLimit(number); 
		serializeIp65504P424ReservdL(ip65504P424ReservdL);
	}

	public void setIp65504P424ReservdL(int number) {
	    number = checkIp65504P424ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P424ReservdL((short)number);
	}
	public void setIp65504P424ReservdL(long number) {
	    number = checkIp65504P424ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P424ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P425ReservdS
	 *	@return ip65504P425ReservdS
	 */
	public short getIp65504P425ReservdS() throws CFException {
        if (isIp65504P425ReservdSModified()) { 
           ip65504P425ReservdS = refreshIp65504P425ReservdS();
        }
   		return ip65504P425ReservdS;
	}
	
	/**
	 * 	Update Ip65504P425ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P425-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P425ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P425ReservdS = checkIp65504P425ReservdSMaxLimit(number); 
		serializeIp65504P425ReservdS(ip65504P425ReservdS);
	}

	public void setIp65504P425ReservdS(int number) {
	    number = checkIp65504P425ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P425ReservdS((short)number);
	}
	public void setIp65504P425ReservdS(long number) {
	    number = checkIp65504P425ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P425ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P425ReservdL
	 *	@return ip65504P425ReservdL
	 */
	public short getIp65504P425ReservdL() throws CFException {
        if (isIp65504P425ReservdLModified()) { 
           ip65504P425ReservdL = refreshIp65504P425ReservdL();
        }
   		return ip65504P425ReservdL;
	}
	
	/**
	 * 	Update Ip65504P425ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P425-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P425ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P425ReservdL = checkIp65504P425ReservdLMaxLimit(number); 
		serializeIp65504P425ReservdL(ip65504P425ReservdL);
	}

	public void setIp65504P425ReservdL(int number) {
	    number = checkIp65504P425ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P425ReservdL((short)number);
	}
	public void setIp65504P425ReservdL(long number) {
	    number = checkIp65504P425ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P425ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P426ReservdS
	 *	@return ip65504P426ReservdS
	 */
	public short getIp65504P426ReservdS() throws CFException {
        if (isIp65504P426ReservdSModified()) { 
           ip65504P426ReservdS = refreshIp65504P426ReservdS();
        }
   		return ip65504P426ReservdS;
	}
	
	/**
	 * 	Update Ip65504P426ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P426-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P426ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P426ReservdS = checkIp65504P426ReservdSMaxLimit(number); 
		serializeIp65504P426ReservdS(ip65504P426ReservdS);
	}

	public void setIp65504P426ReservdS(int number) {
	    number = checkIp65504P426ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P426ReservdS((short)number);
	}
	public void setIp65504P426ReservdS(long number) {
	    number = checkIp65504P426ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P426ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P426ReservdL
	 *	@return ip65504P426ReservdL
	 */
	public short getIp65504P426ReservdL() throws CFException {
        if (isIp65504P426ReservdLModified()) { 
           ip65504P426ReservdL = refreshIp65504P426ReservdL();
        }
   		return ip65504P426ReservdL;
	}
	
	/**
	 * 	Update Ip65504P426ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P426-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P426ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P426ReservdL = checkIp65504P426ReservdLMaxLimit(number); 
		serializeIp65504P426ReservdL(ip65504P426ReservdL);
	}

	public void setIp65504P426ReservdL(int number) {
	    number = checkIp65504P426ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P426ReservdL((short)number);
	}
	public void setIp65504P426ReservdL(long number) {
	    number = checkIp65504P426ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P426ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P427ReservdS
	 *	@return ip65504P427ReservdS
	 */
	public short getIp65504P427ReservdS() throws CFException {
        if (isIp65504P427ReservdSModified()) { 
           ip65504P427ReservdS = refreshIp65504P427ReservdS();
        }
   		return ip65504P427ReservdS;
	}
	
	/**
	 * 	Update Ip65504P427ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P427-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P427ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P427ReservdS = checkIp65504P427ReservdSMaxLimit(number); 
		serializeIp65504P427ReservdS(ip65504P427ReservdS);
	}

	public void setIp65504P427ReservdS(int number) {
	    number = checkIp65504P427ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P427ReservdS((short)number);
	}
	public void setIp65504P427ReservdS(long number) {
	    number = checkIp65504P427ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P427ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P427ReservdL
	 *	@return ip65504P427ReservdL
	 */
	public short getIp65504P427ReservdL() throws CFException {
        if (isIp65504P427ReservdLModified()) { 
           ip65504P427ReservdL = refreshIp65504P427ReservdL();
        }
   		return ip65504P427ReservdL;
	}
	
	/**
	 * 	Update Ip65504P427ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P427-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P427ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P427ReservdL = checkIp65504P427ReservdLMaxLimit(number); 
		serializeIp65504P427ReservdL(ip65504P427ReservdL);
	}

	public void setIp65504P427ReservdL(int number) {
	    number = checkIp65504P427ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P427ReservdL((short)number);
	}
	public void setIp65504P427ReservdL(long number) {
	    number = checkIp65504P427ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P427ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P428ReservdS
	 *	@return ip65504P428ReservdS
	 */
	public short getIp65504P428ReservdS() throws CFException {
        if (isIp65504P428ReservdSModified()) { 
           ip65504P428ReservdS = refreshIp65504P428ReservdS();
        }
   		return ip65504P428ReservdS;
	}
	
	/**
	 * 	Update Ip65504P428ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P428-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P428ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P428ReservdS = checkIp65504P428ReservdSMaxLimit(number); 
		serializeIp65504P428ReservdS(ip65504P428ReservdS);
	}

	public void setIp65504P428ReservdS(int number) {
	    number = checkIp65504P428ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P428ReservdS((short)number);
	}
	public void setIp65504P428ReservdS(long number) {
	    number = checkIp65504P428ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P428ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P428ReservdL
	 *	@return ip65504P428ReservdL
	 */
	public short getIp65504P428ReservdL() throws CFException {
        if (isIp65504P428ReservdLModified()) { 
           ip65504P428ReservdL = refreshIp65504P428ReservdL();
        }
   		return ip65504P428ReservdL;
	}
	
	/**
	 * 	Update Ip65504P428ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P428-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P428ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P428ReservdL = checkIp65504P428ReservdLMaxLimit(number); 
		serializeIp65504P428ReservdL(ip65504P428ReservdL);
	}

	public void setIp65504P428ReservdL(int number) {
	    number = checkIp65504P428ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P428ReservdL((short)number);
	}
	public void setIp65504P428ReservdL(long number) {
	    number = checkIp65504P428ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P428ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P429ReservdS
	 *	@return ip65504P429ReservdS
	 */
	public short getIp65504P429ReservdS() throws CFException {
        if (isIp65504P429ReservdSModified()) { 
           ip65504P429ReservdS = refreshIp65504P429ReservdS();
        }
   		return ip65504P429ReservdS;
	}
	
	/**
	 * 	Update Ip65504P429ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P429-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P429ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P429ReservdS = checkIp65504P429ReservdSMaxLimit(number); 
		serializeIp65504P429ReservdS(ip65504P429ReservdS);
	}

	public void setIp65504P429ReservdS(int number) {
	    number = checkIp65504P429ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P429ReservdS((short)number);
	}
	public void setIp65504P429ReservdS(long number) {
	    number = checkIp65504P429ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P429ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P429ReservdL
	 *	@return ip65504P429ReservdL
	 */
	public short getIp65504P429ReservdL() throws CFException {
        if (isIp65504P429ReservdLModified()) { 
           ip65504P429ReservdL = refreshIp65504P429ReservdL();
        }
   		return ip65504P429ReservdL;
	}
	
	/**
	 * 	Update Ip65504P429ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P429-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P429ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P429ReservdL = checkIp65504P429ReservdLMaxLimit(number); 
		serializeIp65504P429ReservdL(ip65504P429ReservdL);
	}

	public void setIp65504P429ReservdL(int number) {
	    number = checkIp65504P429ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P429ReservdL((short)number);
	}
	public void setIp65504P429ReservdL(long number) {
	    number = checkIp65504P429ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P429ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P430ReservdS
	 *	@return ip65504P430ReservdS
	 */
	public short getIp65504P430ReservdS() throws CFException {
        if (isIp65504P430ReservdSModified()) { 
           ip65504P430ReservdS = refreshIp65504P430ReservdS();
        }
   		return ip65504P430ReservdS;
	}
	
	/**
	 * 	Update Ip65504P430ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P430-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P430ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P430ReservdS = checkIp65504P430ReservdSMaxLimit(number); 
		serializeIp65504P430ReservdS(ip65504P430ReservdS);
	}

	public void setIp65504P430ReservdS(int number) {
	    number = checkIp65504P430ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P430ReservdS((short)number);
	}
	public void setIp65504P430ReservdS(long number) {
	    number = checkIp65504P430ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P430ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P430ReservdL
	 *	@return ip65504P430ReservdL
	 */
	public short getIp65504P430ReservdL() throws CFException {
        if (isIp65504P430ReservdLModified()) { 
           ip65504P430ReservdL = refreshIp65504P430ReservdL();
        }
   		return ip65504P430ReservdL;
	}
	
	/**
	 * 	Update Ip65504P430ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P430-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P430ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P430ReservdL = checkIp65504P430ReservdLMaxLimit(number); 
		serializeIp65504P430ReservdL(ip65504P430ReservdL);
	}

	public void setIp65504P430ReservdL(int number) {
	    number = checkIp65504P430ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P430ReservdL((short)number);
	}
	public void setIp65504P430ReservdL(long number) {
	    number = checkIp65504P430ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P430ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P431ReservdS
	 *	@return ip65504P431ReservdS
	 */
	public short getIp65504P431ReservdS() throws CFException {
        if (isIp65504P431ReservdSModified()) { 
           ip65504P431ReservdS = refreshIp65504P431ReservdS();
        }
   		return ip65504P431ReservdS;
	}
	
	/**
	 * 	Update Ip65504P431ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P431-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P431ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P431ReservdS = checkIp65504P431ReservdSMaxLimit(number); 
		serializeIp65504P431ReservdS(ip65504P431ReservdS);
	}

	public void setIp65504P431ReservdS(int number) {
	    number = checkIp65504P431ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P431ReservdS((short)number);
	}
	public void setIp65504P431ReservdS(long number) {
	    number = checkIp65504P431ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P431ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P431ReservdL
	 *	@return ip65504P431ReservdL
	 */
	public short getIp65504P431ReservdL() throws CFException {
        if (isIp65504P431ReservdLModified()) { 
           ip65504P431ReservdL = refreshIp65504P431ReservdL();
        }
   		return ip65504P431ReservdL;
	}
	
	/**
	 * 	Update Ip65504P431ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P431-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P431ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P431ReservdL = checkIp65504P431ReservdLMaxLimit(number); 
		serializeIp65504P431ReservdL(ip65504P431ReservdL);
	}

	public void setIp65504P431ReservdL(int number) {
	    number = checkIp65504P431ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P431ReservdL((short)number);
	}
	public void setIp65504P431ReservdL(long number) {
	    number = checkIp65504P431ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P431ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P432ReservdS
	 *	@return ip65504P432ReservdS
	 */
	public short getIp65504P432ReservdS() throws CFException {
        if (isIp65504P432ReservdSModified()) { 
           ip65504P432ReservdS = refreshIp65504P432ReservdS();
        }
   		return ip65504P432ReservdS;
	}
	
	/**
	 * 	Update Ip65504P432ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P432-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P432ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P432ReservdS = checkIp65504P432ReservdSMaxLimit(number); 
		serializeIp65504P432ReservdS(ip65504P432ReservdS);
	}

	public void setIp65504P432ReservdS(int number) {
	    number = checkIp65504P432ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P432ReservdS((short)number);
	}
	public void setIp65504P432ReservdS(long number) {
	    number = checkIp65504P432ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P432ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P432ReservdL
	 *	@return ip65504P432ReservdL
	 */
	public short getIp65504P432ReservdL() throws CFException {
        if (isIp65504P432ReservdLModified()) { 
           ip65504P432ReservdL = refreshIp65504P432ReservdL();
        }
   		return ip65504P432ReservdL;
	}
	
	/**
	 * 	Update Ip65504P432ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P432-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P432ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P432ReservdL = checkIp65504P432ReservdLMaxLimit(number); 
		serializeIp65504P432ReservdL(ip65504P432ReservdL);
	}

	public void setIp65504P432ReservdL(int number) {
	    number = checkIp65504P432ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P432ReservdL((short)number);
	}
	public void setIp65504P432ReservdL(long number) {
	    number = checkIp65504P432ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P432ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P433ReservdS
	 *	@return ip65504P433ReservdS
	 */
	public short getIp65504P433ReservdS() throws CFException {
        if (isIp65504P433ReservdSModified()) { 
           ip65504P433ReservdS = refreshIp65504P433ReservdS();
        }
   		return ip65504P433ReservdS;
	}
	
	/**
	 * 	Update Ip65504P433ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P433-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P433ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P433ReservdS = checkIp65504P433ReservdSMaxLimit(number); 
		serializeIp65504P433ReservdS(ip65504P433ReservdS);
	}

	public void setIp65504P433ReservdS(int number) {
	    number = checkIp65504P433ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P433ReservdS((short)number);
	}
	public void setIp65504P433ReservdS(long number) {
	    number = checkIp65504P433ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P433ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P433ReservdL
	 *	@return ip65504P433ReservdL
	 */
	public short getIp65504P433ReservdL() throws CFException {
        if (isIp65504P433ReservdLModified()) { 
           ip65504P433ReservdL = refreshIp65504P433ReservdL();
        }
   		return ip65504P433ReservdL;
	}
	
	/**
	 * 	Update Ip65504P433ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P433-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P433ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P433ReservdL = checkIp65504P433ReservdLMaxLimit(number); 
		serializeIp65504P433ReservdL(ip65504P433ReservdL);
	}

	public void setIp65504P433ReservdL(int number) {
	    number = checkIp65504P433ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P433ReservdL((short)number);
	}
	public void setIp65504P433ReservdL(long number) {
	    number = checkIp65504P433ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P433ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P434ReservdS
	 *	@return ip65504P434ReservdS
	 */
	public short getIp65504P434ReservdS() throws CFException {
        if (isIp65504P434ReservdSModified()) { 
           ip65504P434ReservdS = refreshIp65504P434ReservdS();
        }
   		return ip65504P434ReservdS;
	}
	
	/**
	 * 	Update Ip65504P434ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P434-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P434ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P434ReservdS = checkIp65504P434ReservdSMaxLimit(number); 
		serializeIp65504P434ReservdS(ip65504P434ReservdS);
	}

	public void setIp65504P434ReservdS(int number) {
	    number = checkIp65504P434ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P434ReservdS((short)number);
	}
	public void setIp65504P434ReservdS(long number) {
	    number = checkIp65504P434ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P434ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P434ReservdL
	 *	@return ip65504P434ReservdL
	 */
	public short getIp65504P434ReservdL() throws CFException {
        if (isIp65504P434ReservdLModified()) { 
           ip65504P434ReservdL = refreshIp65504P434ReservdL();
        }
   		return ip65504P434ReservdL;
	}
	
	/**
	 * 	Update Ip65504P434ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P434-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P434ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P434ReservdL = checkIp65504P434ReservdLMaxLimit(number); 
		serializeIp65504P434ReservdL(ip65504P434ReservdL);
	}

	public void setIp65504P434ReservdL(int number) {
	    number = checkIp65504P434ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P434ReservdL((short)number);
	}
	public void setIp65504P434ReservdL(long number) {
	    number = checkIp65504P434ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P434ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup14
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P404ReservdS((short)0);
         	setIp65504P404ReservdL((short)0);
         	setIp65504P405ReservdS((short)0);
         	setIp65504P405ReservdL((short)0);
         	setIp65504P406ReservdS((short)0);
         	setIp65504P406ReservdL((short)0);
         	setIp65504P407ReservdS((short)0);
         	setIp65504P407ReservdL((short)0);
         	setIp65504P408ReservdS((short)0);
         	setIp65504P408ReservdL((short)0);
         	setIp65504P409ReservdS((short)0);
         	setIp65504P409ReservdL((short)0);
         	setIp65504P410ReservdS((short)0);
         	setIp65504P410ReservdL((short)0);
         	setIp65504P411ReservdS((short)0);
         	setIp65504P411ReservdL((short)0);
         	setIp65504P412ReservdS((short)0);
         	setIp65504P412ReservdL((short)0);
         	setIp65504P413ReservdS((short)0);
         	setIp65504P413ReservdL((short)0);
         	setIp65504P414ReservdS((short)0);
         	setIp65504P414ReservdL((short)0);
         	setIp65504P415ReservdS((short)0);
         	setIp65504P415ReservdL((short)0);
         	setIp65504P416ReservdS((short)0);
         	setIp65504P416ReservdL((short)0);
         	setIp65504P417ReservdS((short)0);
         	setIp65504P417ReservdL((short)0);
         	setIp65504P418ReservdS((short)0);
         	setIp65504P418ReservdL((short)0);
         	setIp65504P419ReservdS((short)0);
         	setIp65504P419ReservdL((short)0);
         	setIp65504P420ReservdS((short)0);
         	setIp65504P420ReservdL((short)0);
         	setIp65504P421ReservdS((short)0);
         	setIp65504P421ReservdL((short)0);
         	setIp65504P422ReservdS((short)0);
         	setIp65504P422ReservdL((short)0);
         	setIp65504P423ReservdS((short)0);
         	setIp65504P423ReservdL((short)0);
         	setIp65504P424ReservdS((short)0);
         	setIp65504P424ReservdL((short)0);
         	setIp65504P425ReservdS((short)0);
         	setIp65504P425ReservdL((short)0);
         	setIp65504P426ReservdS((short)0);
         	setIp65504P426ReservdL((short)0);
         	setIp65504P427ReservdS((short)0);
         	setIp65504P427ReservdL((short)0);
         	setIp65504P428ReservdS((short)0);
         	setIp65504P428ReservdL((short)0);
         	setIp65504P429ReservdS((short)0);
         	setIp65504P429ReservdL((short)0);
         	setIp65504P430ReservdS((short)0);
         	setIp65504P430ReservdL((short)0);
         	setIp65504P431ReservdS((short)0);
         	setIp65504P431ReservdL((short)0);
         	setIp65504P432ReservdS((short)0);
         	setIp65504P432ReservdL((short)0);
         	setIp65504P433ReservdS((short)0);
         	setIp65504P433ReservdL((short)0);
         	setIp65504P434ReservdS((short)0);
         	setIp65504P434ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup14FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_14_LENGTH;
		}

}
  
