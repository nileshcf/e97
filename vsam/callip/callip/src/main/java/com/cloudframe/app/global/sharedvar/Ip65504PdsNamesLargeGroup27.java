package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup27 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup27 extends Ip65504PdsNamesLargeGroup27Serialized { 
   

								private short ip65504P807ReservdS;

								private short ip65504P807ReservdL;


								private short ip65504P808ReservdS;

								private short ip65504P808ReservdL;


								private short ip65504P809ReservdS;

								private short ip65504P809ReservdL;


								private short ip65504P810ReservdS;

								private short ip65504P810ReservdL;


								private short ip65504P811ReservdS;

								private short ip65504P811ReservdL;


								private short ip65504P812ReservdS;

								private short ip65504P812ReservdL;


								private short ip65504P813ReservdS;

								private short ip65504P813ReservdL;


								private short ip65504P814ReservdS;

								private short ip65504P814ReservdL;


								private short ip65504P815ReservdS;

								private short ip65504P815ReservdL;


								private short ip65504P816ReservdS;

								private short ip65504P816ReservdL;


								private short ip65504P817ReservdS;

								private short ip65504P817ReservdL;


								private short ip65504P818ReservdS;

								private short ip65504P818ReservdL;


								private short ip65504P819ReservdS;

								private short ip65504P819ReservdL;


								private short ip65504P820ReservdS;

								private short ip65504P820ReservdL;


								private short ip65504P821ReservdS;

								private short ip65504P821ReservdL;


								private short ip65504P822ReservdS;

								private short ip65504P822ReservdL;


								private short ip65504P823ReservdS;

								private short ip65504P823ReservdL;


								private short ip65504P824ReservdS;

								private short ip65504P824ReservdL;


								private short ip65504P825ReservdS;

								private short ip65504P825ReservdL;


								private short ip65504P826ReservdS;

								private short ip65504P826ReservdL;


								private short ip65504P827ReservdS;

								private short ip65504P827ReservdL;


								private short ip65504P828ReservdS;

								private short ip65504P828ReservdL;


								private short ip65504P829ReservdS;

								private short ip65504P829ReservdL;


								private short ip65504P830ReservdS;

								private short ip65504P830ReservdL;


								private short ip65504P831ReservdS;

								private short ip65504P831ReservdL;


								private short ip65504P832ReservdS;

								private short ip65504P832ReservdL;


								private short ip65504P833ReservdS;

								private short ip65504P833ReservdL;


								private short ip65504P834ReservdS;

								private short ip65504P834ReservdL;


								private short ip65504P835ReservdS;

								private short ip65504P835ReservdL;


								private short ip65504P836ReservdS;

								private short ip65504P836ReservdL;


								private short ip65504P837ReservdS;

								private short ip65504P837ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup27
	**/
    public Ip65504PdsNamesLargeGroup27() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup27. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup27(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P807ReservdS
	 *	@return ip65504P807ReservdS
	 */
	public short getIp65504P807ReservdS() throws CFException {
        if (isIp65504P807ReservdSModified()) { 
           ip65504P807ReservdS = refreshIp65504P807ReservdS();
        }
   		return ip65504P807ReservdS;
	}
	
	/**
	 * 	Update Ip65504P807ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P807-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P807ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P807ReservdS = checkIp65504P807ReservdSMaxLimit(number); 
		serializeIp65504P807ReservdS(ip65504P807ReservdS);
	}

	public void setIp65504P807ReservdS(int number) {
	    number = checkIp65504P807ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P807ReservdS((short)number);
	}
	public void setIp65504P807ReservdS(long number) {
	    number = checkIp65504P807ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P807ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P807ReservdL
	 *	@return ip65504P807ReservdL
	 */
	public short getIp65504P807ReservdL() throws CFException {
        if (isIp65504P807ReservdLModified()) { 
           ip65504P807ReservdL = refreshIp65504P807ReservdL();
        }
   		return ip65504P807ReservdL;
	}
	
	/**
	 * 	Update Ip65504P807ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P807-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P807ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P807ReservdL = checkIp65504P807ReservdLMaxLimit(number); 
		serializeIp65504P807ReservdL(ip65504P807ReservdL);
	}

	public void setIp65504P807ReservdL(int number) {
	    number = checkIp65504P807ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P807ReservdL((short)number);
	}
	public void setIp65504P807ReservdL(long number) {
	    number = checkIp65504P807ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P807ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P808ReservdS
	 *	@return ip65504P808ReservdS
	 */
	public short getIp65504P808ReservdS() throws CFException {
        if (isIp65504P808ReservdSModified()) { 
           ip65504P808ReservdS = refreshIp65504P808ReservdS();
        }
   		return ip65504P808ReservdS;
	}
	
	/**
	 * 	Update Ip65504P808ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P808-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P808ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P808ReservdS = checkIp65504P808ReservdSMaxLimit(number); 
		serializeIp65504P808ReservdS(ip65504P808ReservdS);
	}

	public void setIp65504P808ReservdS(int number) {
	    number = checkIp65504P808ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P808ReservdS((short)number);
	}
	public void setIp65504P808ReservdS(long number) {
	    number = checkIp65504P808ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P808ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P808ReservdL
	 *	@return ip65504P808ReservdL
	 */
	public short getIp65504P808ReservdL() throws CFException {
        if (isIp65504P808ReservdLModified()) { 
           ip65504P808ReservdL = refreshIp65504P808ReservdL();
        }
   		return ip65504P808ReservdL;
	}
	
	/**
	 * 	Update Ip65504P808ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P808-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P808ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P808ReservdL = checkIp65504P808ReservdLMaxLimit(number); 
		serializeIp65504P808ReservdL(ip65504P808ReservdL);
	}

	public void setIp65504P808ReservdL(int number) {
	    number = checkIp65504P808ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P808ReservdL((short)number);
	}
	public void setIp65504P808ReservdL(long number) {
	    number = checkIp65504P808ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P808ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P809ReservdS
	 *	@return ip65504P809ReservdS
	 */
	public short getIp65504P809ReservdS() throws CFException {
        if (isIp65504P809ReservdSModified()) { 
           ip65504P809ReservdS = refreshIp65504P809ReservdS();
        }
   		return ip65504P809ReservdS;
	}
	
	/**
	 * 	Update Ip65504P809ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P809-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P809ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P809ReservdS = checkIp65504P809ReservdSMaxLimit(number); 
		serializeIp65504P809ReservdS(ip65504P809ReservdS);
	}

	public void setIp65504P809ReservdS(int number) {
	    number = checkIp65504P809ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P809ReservdS((short)number);
	}
	public void setIp65504P809ReservdS(long number) {
	    number = checkIp65504P809ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P809ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P809ReservdL
	 *	@return ip65504P809ReservdL
	 */
	public short getIp65504P809ReservdL() throws CFException {
        if (isIp65504P809ReservdLModified()) { 
           ip65504P809ReservdL = refreshIp65504P809ReservdL();
        }
   		return ip65504P809ReservdL;
	}
	
	/**
	 * 	Update Ip65504P809ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P809-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P809ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P809ReservdL = checkIp65504P809ReservdLMaxLimit(number); 
		serializeIp65504P809ReservdL(ip65504P809ReservdL);
	}

	public void setIp65504P809ReservdL(int number) {
	    number = checkIp65504P809ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P809ReservdL((short)number);
	}
	public void setIp65504P809ReservdL(long number) {
	    number = checkIp65504P809ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P809ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P810ReservdS
	 *	@return ip65504P810ReservdS
	 */
	public short getIp65504P810ReservdS() throws CFException {
        if (isIp65504P810ReservdSModified()) { 
           ip65504P810ReservdS = refreshIp65504P810ReservdS();
        }
   		return ip65504P810ReservdS;
	}
	
	/**
	 * 	Update Ip65504P810ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P810-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P810ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P810ReservdS = checkIp65504P810ReservdSMaxLimit(number); 
		serializeIp65504P810ReservdS(ip65504P810ReservdS);
	}

	public void setIp65504P810ReservdS(int number) {
	    number = checkIp65504P810ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P810ReservdS((short)number);
	}
	public void setIp65504P810ReservdS(long number) {
	    number = checkIp65504P810ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P810ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P810ReservdL
	 *	@return ip65504P810ReservdL
	 */
	public short getIp65504P810ReservdL() throws CFException {
        if (isIp65504P810ReservdLModified()) { 
           ip65504P810ReservdL = refreshIp65504P810ReservdL();
        }
   		return ip65504P810ReservdL;
	}
	
	/**
	 * 	Update Ip65504P810ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P810-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P810ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P810ReservdL = checkIp65504P810ReservdLMaxLimit(number); 
		serializeIp65504P810ReservdL(ip65504P810ReservdL);
	}

	public void setIp65504P810ReservdL(int number) {
	    number = checkIp65504P810ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P810ReservdL((short)number);
	}
	public void setIp65504P810ReservdL(long number) {
	    number = checkIp65504P810ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P810ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P811ReservdS
	 *	@return ip65504P811ReservdS
	 */
	public short getIp65504P811ReservdS() throws CFException {
        if (isIp65504P811ReservdSModified()) { 
           ip65504P811ReservdS = refreshIp65504P811ReservdS();
        }
   		return ip65504P811ReservdS;
	}
	
	/**
	 * 	Update Ip65504P811ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P811-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P811ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P811ReservdS = checkIp65504P811ReservdSMaxLimit(number); 
		serializeIp65504P811ReservdS(ip65504P811ReservdS);
	}

	public void setIp65504P811ReservdS(int number) {
	    number = checkIp65504P811ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P811ReservdS((short)number);
	}
	public void setIp65504P811ReservdS(long number) {
	    number = checkIp65504P811ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P811ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P811ReservdL
	 *	@return ip65504P811ReservdL
	 */
	public short getIp65504P811ReservdL() throws CFException {
        if (isIp65504P811ReservdLModified()) { 
           ip65504P811ReservdL = refreshIp65504P811ReservdL();
        }
   		return ip65504P811ReservdL;
	}
	
	/**
	 * 	Update Ip65504P811ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P811-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P811ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P811ReservdL = checkIp65504P811ReservdLMaxLimit(number); 
		serializeIp65504P811ReservdL(ip65504P811ReservdL);
	}

	public void setIp65504P811ReservdL(int number) {
	    number = checkIp65504P811ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P811ReservdL((short)number);
	}
	public void setIp65504P811ReservdL(long number) {
	    number = checkIp65504P811ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P811ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P812ReservdS
	 *	@return ip65504P812ReservdS
	 */
	public short getIp65504P812ReservdS() throws CFException {
        if (isIp65504P812ReservdSModified()) { 
           ip65504P812ReservdS = refreshIp65504P812ReservdS();
        }
   		return ip65504P812ReservdS;
	}
	
	/**
	 * 	Update Ip65504P812ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P812-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P812ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P812ReservdS = checkIp65504P812ReservdSMaxLimit(number); 
		serializeIp65504P812ReservdS(ip65504P812ReservdS);
	}

	public void setIp65504P812ReservdS(int number) {
	    number = checkIp65504P812ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P812ReservdS((short)number);
	}
	public void setIp65504P812ReservdS(long number) {
	    number = checkIp65504P812ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P812ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P812ReservdL
	 *	@return ip65504P812ReservdL
	 */
	public short getIp65504P812ReservdL() throws CFException {
        if (isIp65504P812ReservdLModified()) { 
           ip65504P812ReservdL = refreshIp65504P812ReservdL();
        }
   		return ip65504P812ReservdL;
	}
	
	/**
	 * 	Update Ip65504P812ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P812-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P812ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P812ReservdL = checkIp65504P812ReservdLMaxLimit(number); 
		serializeIp65504P812ReservdL(ip65504P812ReservdL);
	}

	public void setIp65504P812ReservdL(int number) {
	    number = checkIp65504P812ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P812ReservdL((short)number);
	}
	public void setIp65504P812ReservdL(long number) {
	    number = checkIp65504P812ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P812ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P813ReservdS
	 *	@return ip65504P813ReservdS
	 */
	public short getIp65504P813ReservdS() throws CFException {
        if (isIp65504P813ReservdSModified()) { 
           ip65504P813ReservdS = refreshIp65504P813ReservdS();
        }
   		return ip65504P813ReservdS;
	}
	
	/**
	 * 	Update Ip65504P813ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P813-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P813ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P813ReservdS = checkIp65504P813ReservdSMaxLimit(number); 
		serializeIp65504P813ReservdS(ip65504P813ReservdS);
	}

	public void setIp65504P813ReservdS(int number) {
	    number = checkIp65504P813ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P813ReservdS((short)number);
	}
	public void setIp65504P813ReservdS(long number) {
	    number = checkIp65504P813ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P813ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P813ReservdL
	 *	@return ip65504P813ReservdL
	 */
	public short getIp65504P813ReservdL() throws CFException {
        if (isIp65504P813ReservdLModified()) { 
           ip65504P813ReservdL = refreshIp65504P813ReservdL();
        }
   		return ip65504P813ReservdL;
	}
	
	/**
	 * 	Update Ip65504P813ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P813-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P813ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P813ReservdL = checkIp65504P813ReservdLMaxLimit(number); 
		serializeIp65504P813ReservdL(ip65504P813ReservdL);
	}

	public void setIp65504P813ReservdL(int number) {
	    number = checkIp65504P813ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P813ReservdL((short)number);
	}
	public void setIp65504P813ReservdL(long number) {
	    number = checkIp65504P813ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P813ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P814ReservdS
	 *	@return ip65504P814ReservdS
	 */
	public short getIp65504P814ReservdS() throws CFException {
        if (isIp65504P814ReservdSModified()) { 
           ip65504P814ReservdS = refreshIp65504P814ReservdS();
        }
   		return ip65504P814ReservdS;
	}
	
	/**
	 * 	Update Ip65504P814ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P814-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P814ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P814ReservdS = checkIp65504P814ReservdSMaxLimit(number); 
		serializeIp65504P814ReservdS(ip65504P814ReservdS);
	}

	public void setIp65504P814ReservdS(int number) {
	    number = checkIp65504P814ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P814ReservdS((short)number);
	}
	public void setIp65504P814ReservdS(long number) {
	    number = checkIp65504P814ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P814ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P814ReservdL
	 *	@return ip65504P814ReservdL
	 */
	public short getIp65504P814ReservdL() throws CFException {
        if (isIp65504P814ReservdLModified()) { 
           ip65504P814ReservdL = refreshIp65504P814ReservdL();
        }
   		return ip65504P814ReservdL;
	}
	
	/**
	 * 	Update Ip65504P814ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P814-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P814ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P814ReservdL = checkIp65504P814ReservdLMaxLimit(number); 
		serializeIp65504P814ReservdL(ip65504P814ReservdL);
	}

	public void setIp65504P814ReservdL(int number) {
	    number = checkIp65504P814ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P814ReservdL((short)number);
	}
	public void setIp65504P814ReservdL(long number) {
	    number = checkIp65504P814ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P814ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P815ReservdS
	 *	@return ip65504P815ReservdS
	 */
	public short getIp65504P815ReservdS() throws CFException {
        if (isIp65504P815ReservdSModified()) { 
           ip65504P815ReservdS = refreshIp65504P815ReservdS();
        }
   		return ip65504P815ReservdS;
	}
	
	/**
	 * 	Update Ip65504P815ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P815-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P815ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P815ReservdS = checkIp65504P815ReservdSMaxLimit(number); 
		serializeIp65504P815ReservdS(ip65504P815ReservdS);
	}

	public void setIp65504P815ReservdS(int number) {
	    number = checkIp65504P815ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P815ReservdS((short)number);
	}
	public void setIp65504P815ReservdS(long number) {
	    number = checkIp65504P815ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P815ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P815ReservdL
	 *	@return ip65504P815ReservdL
	 */
	public short getIp65504P815ReservdL() throws CFException {
        if (isIp65504P815ReservdLModified()) { 
           ip65504P815ReservdL = refreshIp65504P815ReservdL();
        }
   		return ip65504P815ReservdL;
	}
	
	/**
	 * 	Update Ip65504P815ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P815-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P815ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P815ReservdL = checkIp65504P815ReservdLMaxLimit(number); 
		serializeIp65504P815ReservdL(ip65504P815ReservdL);
	}

	public void setIp65504P815ReservdL(int number) {
	    number = checkIp65504P815ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P815ReservdL((short)number);
	}
	public void setIp65504P815ReservdL(long number) {
	    number = checkIp65504P815ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P815ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P816ReservdS
	 *	@return ip65504P816ReservdS
	 */
	public short getIp65504P816ReservdS() throws CFException {
        if (isIp65504P816ReservdSModified()) { 
           ip65504P816ReservdS = refreshIp65504P816ReservdS();
        }
   		return ip65504P816ReservdS;
	}
	
	/**
	 * 	Update Ip65504P816ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P816-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P816ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P816ReservdS = checkIp65504P816ReservdSMaxLimit(number); 
		serializeIp65504P816ReservdS(ip65504P816ReservdS);
	}

	public void setIp65504P816ReservdS(int number) {
	    number = checkIp65504P816ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P816ReservdS((short)number);
	}
	public void setIp65504P816ReservdS(long number) {
	    number = checkIp65504P816ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P816ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P816ReservdL
	 *	@return ip65504P816ReservdL
	 */
	public short getIp65504P816ReservdL() throws CFException {
        if (isIp65504P816ReservdLModified()) { 
           ip65504P816ReservdL = refreshIp65504P816ReservdL();
        }
   		return ip65504P816ReservdL;
	}
	
	/**
	 * 	Update Ip65504P816ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P816-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P816ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P816ReservdL = checkIp65504P816ReservdLMaxLimit(number); 
		serializeIp65504P816ReservdL(ip65504P816ReservdL);
	}

	public void setIp65504P816ReservdL(int number) {
	    number = checkIp65504P816ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P816ReservdL((short)number);
	}
	public void setIp65504P816ReservdL(long number) {
	    number = checkIp65504P816ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P816ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P817ReservdS
	 *	@return ip65504P817ReservdS
	 */
	public short getIp65504P817ReservdS() throws CFException {
        if (isIp65504P817ReservdSModified()) { 
           ip65504P817ReservdS = refreshIp65504P817ReservdS();
        }
   		return ip65504P817ReservdS;
	}
	
	/**
	 * 	Update Ip65504P817ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P817-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P817ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P817ReservdS = checkIp65504P817ReservdSMaxLimit(number); 
		serializeIp65504P817ReservdS(ip65504P817ReservdS);
	}

	public void setIp65504P817ReservdS(int number) {
	    number = checkIp65504P817ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P817ReservdS((short)number);
	}
	public void setIp65504P817ReservdS(long number) {
	    number = checkIp65504P817ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P817ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P817ReservdL
	 *	@return ip65504P817ReservdL
	 */
	public short getIp65504P817ReservdL() throws CFException {
        if (isIp65504P817ReservdLModified()) { 
           ip65504P817ReservdL = refreshIp65504P817ReservdL();
        }
   		return ip65504P817ReservdL;
	}
	
	/**
	 * 	Update Ip65504P817ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P817-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P817ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P817ReservdL = checkIp65504P817ReservdLMaxLimit(number); 
		serializeIp65504P817ReservdL(ip65504P817ReservdL);
	}

	public void setIp65504P817ReservdL(int number) {
	    number = checkIp65504P817ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P817ReservdL((short)number);
	}
	public void setIp65504P817ReservdL(long number) {
	    number = checkIp65504P817ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P817ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P818ReservdS
	 *	@return ip65504P818ReservdS
	 */
	public short getIp65504P818ReservdS() throws CFException {
        if (isIp65504P818ReservdSModified()) { 
           ip65504P818ReservdS = refreshIp65504P818ReservdS();
        }
   		return ip65504P818ReservdS;
	}
	
	/**
	 * 	Update Ip65504P818ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P818-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P818ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P818ReservdS = checkIp65504P818ReservdSMaxLimit(number); 
		serializeIp65504P818ReservdS(ip65504P818ReservdS);
	}

	public void setIp65504P818ReservdS(int number) {
	    number = checkIp65504P818ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P818ReservdS((short)number);
	}
	public void setIp65504P818ReservdS(long number) {
	    number = checkIp65504P818ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P818ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P818ReservdL
	 *	@return ip65504P818ReservdL
	 */
	public short getIp65504P818ReservdL() throws CFException {
        if (isIp65504P818ReservdLModified()) { 
           ip65504P818ReservdL = refreshIp65504P818ReservdL();
        }
   		return ip65504P818ReservdL;
	}
	
	/**
	 * 	Update Ip65504P818ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P818-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P818ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P818ReservdL = checkIp65504P818ReservdLMaxLimit(number); 
		serializeIp65504P818ReservdL(ip65504P818ReservdL);
	}

	public void setIp65504P818ReservdL(int number) {
	    number = checkIp65504P818ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P818ReservdL((short)number);
	}
	public void setIp65504P818ReservdL(long number) {
	    number = checkIp65504P818ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P818ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P819ReservdS
	 *	@return ip65504P819ReservdS
	 */
	public short getIp65504P819ReservdS() throws CFException {
        if (isIp65504P819ReservdSModified()) { 
           ip65504P819ReservdS = refreshIp65504P819ReservdS();
        }
   		return ip65504P819ReservdS;
	}
	
	/**
	 * 	Update Ip65504P819ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P819-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P819ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P819ReservdS = checkIp65504P819ReservdSMaxLimit(number); 
		serializeIp65504P819ReservdS(ip65504P819ReservdS);
	}

	public void setIp65504P819ReservdS(int number) {
	    number = checkIp65504P819ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P819ReservdS((short)number);
	}
	public void setIp65504P819ReservdS(long number) {
	    number = checkIp65504P819ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P819ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P819ReservdL
	 *	@return ip65504P819ReservdL
	 */
	public short getIp65504P819ReservdL() throws CFException {
        if (isIp65504P819ReservdLModified()) { 
           ip65504P819ReservdL = refreshIp65504P819ReservdL();
        }
   		return ip65504P819ReservdL;
	}
	
	/**
	 * 	Update Ip65504P819ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P819-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P819ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P819ReservdL = checkIp65504P819ReservdLMaxLimit(number); 
		serializeIp65504P819ReservdL(ip65504P819ReservdL);
	}

	public void setIp65504P819ReservdL(int number) {
	    number = checkIp65504P819ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P819ReservdL((short)number);
	}
	public void setIp65504P819ReservdL(long number) {
	    number = checkIp65504P819ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P819ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P820ReservdS
	 *	@return ip65504P820ReservdS
	 */
	public short getIp65504P820ReservdS() throws CFException {
        if (isIp65504P820ReservdSModified()) { 
           ip65504P820ReservdS = refreshIp65504P820ReservdS();
        }
   		return ip65504P820ReservdS;
	}
	
	/**
	 * 	Update Ip65504P820ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P820-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P820ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P820ReservdS = checkIp65504P820ReservdSMaxLimit(number); 
		serializeIp65504P820ReservdS(ip65504P820ReservdS);
	}

	public void setIp65504P820ReservdS(int number) {
	    number = checkIp65504P820ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P820ReservdS((short)number);
	}
	public void setIp65504P820ReservdS(long number) {
	    number = checkIp65504P820ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P820ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P820ReservdL
	 *	@return ip65504P820ReservdL
	 */
	public short getIp65504P820ReservdL() throws CFException {
        if (isIp65504P820ReservdLModified()) { 
           ip65504P820ReservdL = refreshIp65504P820ReservdL();
        }
   		return ip65504P820ReservdL;
	}
	
	/**
	 * 	Update Ip65504P820ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P820-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P820ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P820ReservdL = checkIp65504P820ReservdLMaxLimit(number); 
		serializeIp65504P820ReservdL(ip65504P820ReservdL);
	}

	public void setIp65504P820ReservdL(int number) {
	    number = checkIp65504P820ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P820ReservdL((short)number);
	}
	public void setIp65504P820ReservdL(long number) {
	    number = checkIp65504P820ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P820ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P821ReservdS
	 *	@return ip65504P821ReservdS
	 */
	public short getIp65504P821ReservdS() throws CFException {
        if (isIp65504P821ReservdSModified()) { 
           ip65504P821ReservdS = refreshIp65504P821ReservdS();
        }
   		return ip65504P821ReservdS;
	}
	
	/**
	 * 	Update Ip65504P821ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P821-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P821ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P821ReservdS = checkIp65504P821ReservdSMaxLimit(number); 
		serializeIp65504P821ReservdS(ip65504P821ReservdS);
	}

	public void setIp65504P821ReservdS(int number) {
	    number = checkIp65504P821ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P821ReservdS((short)number);
	}
	public void setIp65504P821ReservdS(long number) {
	    number = checkIp65504P821ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P821ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P821ReservdL
	 *	@return ip65504P821ReservdL
	 */
	public short getIp65504P821ReservdL() throws CFException {
        if (isIp65504P821ReservdLModified()) { 
           ip65504P821ReservdL = refreshIp65504P821ReservdL();
        }
   		return ip65504P821ReservdL;
	}
	
	/**
	 * 	Update Ip65504P821ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P821-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P821ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P821ReservdL = checkIp65504P821ReservdLMaxLimit(number); 
		serializeIp65504P821ReservdL(ip65504P821ReservdL);
	}

	public void setIp65504P821ReservdL(int number) {
	    number = checkIp65504P821ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P821ReservdL((short)number);
	}
	public void setIp65504P821ReservdL(long number) {
	    number = checkIp65504P821ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P821ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P822ReservdS
	 *	@return ip65504P822ReservdS
	 */
	public short getIp65504P822ReservdS() throws CFException {
        if (isIp65504P822ReservdSModified()) { 
           ip65504P822ReservdS = refreshIp65504P822ReservdS();
        }
   		return ip65504P822ReservdS;
	}
	
	/**
	 * 	Update Ip65504P822ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P822-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P822ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P822ReservdS = checkIp65504P822ReservdSMaxLimit(number); 
		serializeIp65504P822ReservdS(ip65504P822ReservdS);
	}

	public void setIp65504P822ReservdS(int number) {
	    number = checkIp65504P822ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P822ReservdS((short)number);
	}
	public void setIp65504P822ReservdS(long number) {
	    number = checkIp65504P822ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P822ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P822ReservdL
	 *	@return ip65504P822ReservdL
	 */
	public short getIp65504P822ReservdL() throws CFException {
        if (isIp65504P822ReservdLModified()) { 
           ip65504P822ReservdL = refreshIp65504P822ReservdL();
        }
   		return ip65504P822ReservdL;
	}
	
	/**
	 * 	Update Ip65504P822ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P822-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P822ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P822ReservdL = checkIp65504P822ReservdLMaxLimit(number); 
		serializeIp65504P822ReservdL(ip65504P822ReservdL);
	}

	public void setIp65504P822ReservdL(int number) {
	    number = checkIp65504P822ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P822ReservdL((short)number);
	}
	public void setIp65504P822ReservdL(long number) {
	    number = checkIp65504P822ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P822ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P823ReservdS
	 *	@return ip65504P823ReservdS
	 */
	public short getIp65504P823ReservdS() throws CFException {
        if (isIp65504P823ReservdSModified()) { 
           ip65504P823ReservdS = refreshIp65504P823ReservdS();
        }
   		return ip65504P823ReservdS;
	}
	
	/**
	 * 	Update Ip65504P823ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P823-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P823ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P823ReservdS = checkIp65504P823ReservdSMaxLimit(number); 
		serializeIp65504P823ReservdS(ip65504P823ReservdS);
	}

	public void setIp65504P823ReservdS(int number) {
	    number = checkIp65504P823ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P823ReservdS((short)number);
	}
	public void setIp65504P823ReservdS(long number) {
	    number = checkIp65504P823ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P823ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P823ReservdL
	 *	@return ip65504P823ReservdL
	 */
	public short getIp65504P823ReservdL() throws CFException {
        if (isIp65504P823ReservdLModified()) { 
           ip65504P823ReservdL = refreshIp65504P823ReservdL();
        }
   		return ip65504P823ReservdL;
	}
	
	/**
	 * 	Update Ip65504P823ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P823-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P823ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P823ReservdL = checkIp65504P823ReservdLMaxLimit(number); 
		serializeIp65504P823ReservdL(ip65504P823ReservdL);
	}

	public void setIp65504P823ReservdL(int number) {
	    number = checkIp65504P823ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P823ReservdL((short)number);
	}
	public void setIp65504P823ReservdL(long number) {
	    number = checkIp65504P823ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P823ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P824ReservdS
	 *	@return ip65504P824ReservdS
	 */
	public short getIp65504P824ReservdS() throws CFException {
        if (isIp65504P824ReservdSModified()) { 
           ip65504P824ReservdS = refreshIp65504P824ReservdS();
        }
   		return ip65504P824ReservdS;
	}
	
	/**
	 * 	Update Ip65504P824ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P824-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P824ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P824ReservdS = checkIp65504P824ReservdSMaxLimit(number); 
		serializeIp65504P824ReservdS(ip65504P824ReservdS);
	}

	public void setIp65504P824ReservdS(int number) {
	    number = checkIp65504P824ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P824ReservdS((short)number);
	}
	public void setIp65504P824ReservdS(long number) {
	    number = checkIp65504P824ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P824ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P824ReservdL
	 *	@return ip65504P824ReservdL
	 */
	public short getIp65504P824ReservdL() throws CFException {
        if (isIp65504P824ReservdLModified()) { 
           ip65504P824ReservdL = refreshIp65504P824ReservdL();
        }
   		return ip65504P824ReservdL;
	}
	
	/**
	 * 	Update Ip65504P824ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P824-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P824ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P824ReservdL = checkIp65504P824ReservdLMaxLimit(number); 
		serializeIp65504P824ReservdL(ip65504P824ReservdL);
	}

	public void setIp65504P824ReservdL(int number) {
	    number = checkIp65504P824ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P824ReservdL((short)number);
	}
	public void setIp65504P824ReservdL(long number) {
	    number = checkIp65504P824ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P824ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P825ReservdS
	 *	@return ip65504P825ReservdS
	 */
	public short getIp65504P825ReservdS() throws CFException {
        if (isIp65504P825ReservdSModified()) { 
           ip65504P825ReservdS = refreshIp65504P825ReservdS();
        }
   		return ip65504P825ReservdS;
	}
	
	/**
	 * 	Update Ip65504P825ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P825-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P825ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P825ReservdS = checkIp65504P825ReservdSMaxLimit(number); 
		serializeIp65504P825ReservdS(ip65504P825ReservdS);
	}

	public void setIp65504P825ReservdS(int number) {
	    number = checkIp65504P825ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P825ReservdS((short)number);
	}
	public void setIp65504P825ReservdS(long number) {
	    number = checkIp65504P825ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P825ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P825ReservdL
	 *	@return ip65504P825ReservdL
	 */
	public short getIp65504P825ReservdL() throws CFException {
        if (isIp65504P825ReservdLModified()) { 
           ip65504P825ReservdL = refreshIp65504P825ReservdL();
        }
   		return ip65504P825ReservdL;
	}
	
	/**
	 * 	Update Ip65504P825ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P825-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P825ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P825ReservdL = checkIp65504P825ReservdLMaxLimit(number); 
		serializeIp65504P825ReservdL(ip65504P825ReservdL);
	}

	public void setIp65504P825ReservdL(int number) {
	    number = checkIp65504P825ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P825ReservdL((short)number);
	}
	public void setIp65504P825ReservdL(long number) {
	    number = checkIp65504P825ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P825ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P826ReservdS
	 *	@return ip65504P826ReservdS
	 */
	public short getIp65504P826ReservdS() throws CFException {
        if (isIp65504P826ReservdSModified()) { 
           ip65504P826ReservdS = refreshIp65504P826ReservdS();
        }
   		return ip65504P826ReservdS;
	}
	
	/**
	 * 	Update Ip65504P826ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P826-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P826ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P826ReservdS = checkIp65504P826ReservdSMaxLimit(number); 
		serializeIp65504P826ReservdS(ip65504P826ReservdS);
	}

	public void setIp65504P826ReservdS(int number) {
	    number = checkIp65504P826ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P826ReservdS((short)number);
	}
	public void setIp65504P826ReservdS(long number) {
	    number = checkIp65504P826ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P826ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P826ReservdL
	 *	@return ip65504P826ReservdL
	 */
	public short getIp65504P826ReservdL() throws CFException {
        if (isIp65504P826ReservdLModified()) { 
           ip65504P826ReservdL = refreshIp65504P826ReservdL();
        }
   		return ip65504P826ReservdL;
	}
	
	/**
	 * 	Update Ip65504P826ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P826-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P826ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P826ReservdL = checkIp65504P826ReservdLMaxLimit(number); 
		serializeIp65504P826ReservdL(ip65504P826ReservdL);
	}

	public void setIp65504P826ReservdL(int number) {
	    number = checkIp65504P826ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P826ReservdL((short)number);
	}
	public void setIp65504P826ReservdL(long number) {
	    number = checkIp65504P826ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P826ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P827ReservdS
	 *	@return ip65504P827ReservdS
	 */
	public short getIp65504P827ReservdS() throws CFException {
        if (isIp65504P827ReservdSModified()) { 
           ip65504P827ReservdS = refreshIp65504P827ReservdS();
        }
   		return ip65504P827ReservdS;
	}
	
	/**
	 * 	Update Ip65504P827ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P827-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P827ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P827ReservdS = checkIp65504P827ReservdSMaxLimit(number); 
		serializeIp65504P827ReservdS(ip65504P827ReservdS);
	}

	public void setIp65504P827ReservdS(int number) {
	    number = checkIp65504P827ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P827ReservdS((short)number);
	}
	public void setIp65504P827ReservdS(long number) {
	    number = checkIp65504P827ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P827ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P827ReservdL
	 *	@return ip65504P827ReservdL
	 */
	public short getIp65504P827ReservdL() throws CFException {
        if (isIp65504P827ReservdLModified()) { 
           ip65504P827ReservdL = refreshIp65504P827ReservdL();
        }
   		return ip65504P827ReservdL;
	}
	
	/**
	 * 	Update Ip65504P827ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P827-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P827ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P827ReservdL = checkIp65504P827ReservdLMaxLimit(number); 
		serializeIp65504P827ReservdL(ip65504P827ReservdL);
	}

	public void setIp65504P827ReservdL(int number) {
	    number = checkIp65504P827ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P827ReservdL((short)number);
	}
	public void setIp65504P827ReservdL(long number) {
	    number = checkIp65504P827ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P827ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P828ReservdS
	 *	@return ip65504P828ReservdS
	 */
	public short getIp65504P828ReservdS() throws CFException {
        if (isIp65504P828ReservdSModified()) { 
           ip65504P828ReservdS = refreshIp65504P828ReservdS();
        }
   		return ip65504P828ReservdS;
	}
	
	/**
	 * 	Update Ip65504P828ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P828-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P828ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P828ReservdS = checkIp65504P828ReservdSMaxLimit(number); 
		serializeIp65504P828ReservdS(ip65504P828ReservdS);
	}

	public void setIp65504P828ReservdS(int number) {
	    number = checkIp65504P828ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P828ReservdS((short)number);
	}
	public void setIp65504P828ReservdS(long number) {
	    number = checkIp65504P828ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P828ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P828ReservdL
	 *	@return ip65504P828ReservdL
	 */
	public short getIp65504P828ReservdL() throws CFException {
        if (isIp65504P828ReservdLModified()) { 
           ip65504P828ReservdL = refreshIp65504P828ReservdL();
        }
   		return ip65504P828ReservdL;
	}
	
	/**
	 * 	Update Ip65504P828ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P828-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P828ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P828ReservdL = checkIp65504P828ReservdLMaxLimit(number); 
		serializeIp65504P828ReservdL(ip65504P828ReservdL);
	}

	public void setIp65504P828ReservdL(int number) {
	    number = checkIp65504P828ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P828ReservdL((short)number);
	}
	public void setIp65504P828ReservdL(long number) {
	    number = checkIp65504P828ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P828ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P829ReservdS
	 *	@return ip65504P829ReservdS
	 */
	public short getIp65504P829ReservdS() throws CFException {
        if (isIp65504P829ReservdSModified()) { 
           ip65504P829ReservdS = refreshIp65504P829ReservdS();
        }
   		return ip65504P829ReservdS;
	}
	
	/**
	 * 	Update Ip65504P829ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P829-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P829ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P829ReservdS = checkIp65504P829ReservdSMaxLimit(number); 
		serializeIp65504P829ReservdS(ip65504P829ReservdS);
	}

	public void setIp65504P829ReservdS(int number) {
	    number = checkIp65504P829ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P829ReservdS((short)number);
	}
	public void setIp65504P829ReservdS(long number) {
	    number = checkIp65504P829ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P829ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P829ReservdL
	 *	@return ip65504P829ReservdL
	 */
	public short getIp65504P829ReservdL() throws CFException {
        if (isIp65504P829ReservdLModified()) { 
           ip65504P829ReservdL = refreshIp65504P829ReservdL();
        }
   		return ip65504P829ReservdL;
	}
	
	/**
	 * 	Update Ip65504P829ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P829-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P829ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P829ReservdL = checkIp65504P829ReservdLMaxLimit(number); 
		serializeIp65504P829ReservdL(ip65504P829ReservdL);
	}

	public void setIp65504P829ReservdL(int number) {
	    number = checkIp65504P829ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P829ReservdL((short)number);
	}
	public void setIp65504P829ReservdL(long number) {
	    number = checkIp65504P829ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P829ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P830ReservdS
	 *	@return ip65504P830ReservdS
	 */
	public short getIp65504P830ReservdS() throws CFException {
        if (isIp65504P830ReservdSModified()) { 
           ip65504P830ReservdS = refreshIp65504P830ReservdS();
        }
   		return ip65504P830ReservdS;
	}
	
	/**
	 * 	Update Ip65504P830ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P830-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P830ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P830ReservdS = checkIp65504P830ReservdSMaxLimit(number); 
		serializeIp65504P830ReservdS(ip65504P830ReservdS);
	}

	public void setIp65504P830ReservdS(int number) {
	    number = checkIp65504P830ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P830ReservdS((short)number);
	}
	public void setIp65504P830ReservdS(long number) {
	    number = checkIp65504P830ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P830ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P830ReservdL
	 *	@return ip65504P830ReservdL
	 */
	public short getIp65504P830ReservdL() throws CFException {
        if (isIp65504P830ReservdLModified()) { 
           ip65504P830ReservdL = refreshIp65504P830ReservdL();
        }
   		return ip65504P830ReservdL;
	}
	
	/**
	 * 	Update Ip65504P830ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P830-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P830ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P830ReservdL = checkIp65504P830ReservdLMaxLimit(number); 
		serializeIp65504P830ReservdL(ip65504P830ReservdL);
	}

	public void setIp65504P830ReservdL(int number) {
	    number = checkIp65504P830ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P830ReservdL((short)number);
	}
	public void setIp65504P830ReservdL(long number) {
	    number = checkIp65504P830ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P830ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P831ReservdS
	 *	@return ip65504P831ReservdS
	 */
	public short getIp65504P831ReservdS() throws CFException {
        if (isIp65504P831ReservdSModified()) { 
           ip65504P831ReservdS = refreshIp65504P831ReservdS();
        }
   		return ip65504P831ReservdS;
	}
	
	/**
	 * 	Update Ip65504P831ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P831-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P831ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P831ReservdS = checkIp65504P831ReservdSMaxLimit(number); 
		serializeIp65504P831ReservdS(ip65504P831ReservdS);
	}

	public void setIp65504P831ReservdS(int number) {
	    number = checkIp65504P831ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P831ReservdS((short)number);
	}
	public void setIp65504P831ReservdS(long number) {
	    number = checkIp65504P831ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P831ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P831ReservdL
	 *	@return ip65504P831ReservdL
	 */
	public short getIp65504P831ReservdL() throws CFException {
        if (isIp65504P831ReservdLModified()) { 
           ip65504P831ReservdL = refreshIp65504P831ReservdL();
        }
   		return ip65504P831ReservdL;
	}
	
	/**
	 * 	Update Ip65504P831ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P831-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P831ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P831ReservdL = checkIp65504P831ReservdLMaxLimit(number); 
		serializeIp65504P831ReservdL(ip65504P831ReservdL);
	}

	public void setIp65504P831ReservdL(int number) {
	    number = checkIp65504P831ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P831ReservdL((short)number);
	}
	public void setIp65504P831ReservdL(long number) {
	    number = checkIp65504P831ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P831ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P832ReservdS
	 *	@return ip65504P832ReservdS
	 */
	public short getIp65504P832ReservdS() throws CFException {
        if (isIp65504P832ReservdSModified()) { 
           ip65504P832ReservdS = refreshIp65504P832ReservdS();
        }
   		return ip65504P832ReservdS;
	}
	
	/**
	 * 	Update Ip65504P832ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P832-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P832ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P832ReservdS = checkIp65504P832ReservdSMaxLimit(number); 
		serializeIp65504P832ReservdS(ip65504P832ReservdS);
	}

	public void setIp65504P832ReservdS(int number) {
	    number = checkIp65504P832ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P832ReservdS((short)number);
	}
	public void setIp65504P832ReservdS(long number) {
	    number = checkIp65504P832ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P832ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P832ReservdL
	 *	@return ip65504P832ReservdL
	 */
	public short getIp65504P832ReservdL() throws CFException {
        if (isIp65504P832ReservdLModified()) { 
           ip65504P832ReservdL = refreshIp65504P832ReservdL();
        }
   		return ip65504P832ReservdL;
	}
	
	/**
	 * 	Update Ip65504P832ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P832-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P832ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P832ReservdL = checkIp65504P832ReservdLMaxLimit(number); 
		serializeIp65504P832ReservdL(ip65504P832ReservdL);
	}

	public void setIp65504P832ReservdL(int number) {
	    number = checkIp65504P832ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P832ReservdL((short)number);
	}
	public void setIp65504P832ReservdL(long number) {
	    number = checkIp65504P832ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P832ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P833ReservdS
	 *	@return ip65504P833ReservdS
	 */
	public short getIp65504P833ReservdS() throws CFException {
        if (isIp65504P833ReservdSModified()) { 
           ip65504P833ReservdS = refreshIp65504P833ReservdS();
        }
   		return ip65504P833ReservdS;
	}
	
	/**
	 * 	Update Ip65504P833ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P833-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P833ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P833ReservdS = checkIp65504P833ReservdSMaxLimit(number); 
		serializeIp65504P833ReservdS(ip65504P833ReservdS);
	}

	public void setIp65504P833ReservdS(int number) {
	    number = checkIp65504P833ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P833ReservdS((short)number);
	}
	public void setIp65504P833ReservdS(long number) {
	    number = checkIp65504P833ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P833ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P833ReservdL
	 *	@return ip65504P833ReservdL
	 */
	public short getIp65504P833ReservdL() throws CFException {
        if (isIp65504P833ReservdLModified()) { 
           ip65504P833ReservdL = refreshIp65504P833ReservdL();
        }
   		return ip65504P833ReservdL;
	}
	
	/**
	 * 	Update Ip65504P833ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P833-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P833ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P833ReservdL = checkIp65504P833ReservdLMaxLimit(number); 
		serializeIp65504P833ReservdL(ip65504P833ReservdL);
	}

	public void setIp65504P833ReservdL(int number) {
	    number = checkIp65504P833ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P833ReservdL((short)number);
	}
	public void setIp65504P833ReservdL(long number) {
	    number = checkIp65504P833ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P833ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P834ReservdS
	 *	@return ip65504P834ReservdS
	 */
	public short getIp65504P834ReservdS() throws CFException {
        if (isIp65504P834ReservdSModified()) { 
           ip65504P834ReservdS = refreshIp65504P834ReservdS();
        }
   		return ip65504P834ReservdS;
	}
	
	/**
	 * 	Update Ip65504P834ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P834-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P834ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P834ReservdS = checkIp65504P834ReservdSMaxLimit(number); 
		serializeIp65504P834ReservdS(ip65504P834ReservdS);
	}

	public void setIp65504P834ReservdS(int number) {
	    number = checkIp65504P834ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P834ReservdS((short)number);
	}
	public void setIp65504P834ReservdS(long number) {
	    number = checkIp65504P834ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P834ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P834ReservdL
	 *	@return ip65504P834ReservdL
	 */
	public short getIp65504P834ReservdL() throws CFException {
        if (isIp65504P834ReservdLModified()) { 
           ip65504P834ReservdL = refreshIp65504P834ReservdL();
        }
   		return ip65504P834ReservdL;
	}
	
	/**
	 * 	Update Ip65504P834ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P834-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P834ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P834ReservdL = checkIp65504P834ReservdLMaxLimit(number); 
		serializeIp65504P834ReservdL(ip65504P834ReservdL);
	}

	public void setIp65504P834ReservdL(int number) {
	    number = checkIp65504P834ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P834ReservdL((short)number);
	}
	public void setIp65504P834ReservdL(long number) {
	    number = checkIp65504P834ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P834ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P835ReservdS
	 *	@return ip65504P835ReservdS
	 */
	public short getIp65504P835ReservdS() throws CFException {
        if (isIp65504P835ReservdSModified()) { 
           ip65504P835ReservdS = refreshIp65504P835ReservdS();
        }
   		return ip65504P835ReservdS;
	}
	
	/**
	 * 	Update Ip65504P835ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P835-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P835ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P835ReservdS = checkIp65504P835ReservdSMaxLimit(number); 
		serializeIp65504P835ReservdS(ip65504P835ReservdS);
	}

	public void setIp65504P835ReservdS(int number) {
	    number = checkIp65504P835ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P835ReservdS((short)number);
	}
	public void setIp65504P835ReservdS(long number) {
	    number = checkIp65504P835ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P835ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P835ReservdL
	 *	@return ip65504P835ReservdL
	 */
	public short getIp65504P835ReservdL() throws CFException {
        if (isIp65504P835ReservdLModified()) { 
           ip65504P835ReservdL = refreshIp65504P835ReservdL();
        }
   		return ip65504P835ReservdL;
	}
	
	/**
	 * 	Update Ip65504P835ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P835-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P835ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P835ReservdL = checkIp65504P835ReservdLMaxLimit(number); 
		serializeIp65504P835ReservdL(ip65504P835ReservdL);
	}

	public void setIp65504P835ReservdL(int number) {
	    number = checkIp65504P835ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P835ReservdL((short)number);
	}
	public void setIp65504P835ReservdL(long number) {
	    number = checkIp65504P835ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P835ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P836ReservdS
	 *	@return ip65504P836ReservdS
	 */
	public short getIp65504P836ReservdS() throws CFException {
        if (isIp65504P836ReservdSModified()) { 
           ip65504P836ReservdS = refreshIp65504P836ReservdS();
        }
   		return ip65504P836ReservdS;
	}
	
	/**
	 * 	Update Ip65504P836ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P836-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P836ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P836ReservdS = checkIp65504P836ReservdSMaxLimit(number); 
		serializeIp65504P836ReservdS(ip65504P836ReservdS);
	}

	public void setIp65504P836ReservdS(int number) {
	    number = checkIp65504P836ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P836ReservdS((short)number);
	}
	public void setIp65504P836ReservdS(long number) {
	    number = checkIp65504P836ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P836ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P836ReservdL
	 *	@return ip65504P836ReservdL
	 */
	public short getIp65504P836ReservdL() throws CFException {
        if (isIp65504P836ReservdLModified()) { 
           ip65504P836ReservdL = refreshIp65504P836ReservdL();
        }
   		return ip65504P836ReservdL;
	}
	
	/**
	 * 	Update Ip65504P836ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P836-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P836ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P836ReservdL = checkIp65504P836ReservdLMaxLimit(number); 
		serializeIp65504P836ReservdL(ip65504P836ReservdL);
	}

	public void setIp65504P836ReservdL(int number) {
	    number = checkIp65504P836ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P836ReservdL((short)number);
	}
	public void setIp65504P836ReservdL(long number) {
	    number = checkIp65504P836ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P836ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P837ReservdS
	 *	@return ip65504P837ReservdS
	 */
	public short getIp65504P837ReservdS() throws CFException {
        if (isIp65504P837ReservdSModified()) { 
           ip65504P837ReservdS = refreshIp65504P837ReservdS();
        }
   		return ip65504P837ReservdS;
	}
	
	/**
	 * 	Update Ip65504P837ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P837-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P837ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P837ReservdS = checkIp65504P837ReservdSMaxLimit(number); 
		serializeIp65504P837ReservdS(ip65504P837ReservdS);
	}

	public void setIp65504P837ReservdS(int number) {
	    number = checkIp65504P837ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P837ReservdS((short)number);
	}
	public void setIp65504P837ReservdS(long number) {
	    number = checkIp65504P837ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P837ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P837ReservdL
	 *	@return ip65504P837ReservdL
	 */
	public short getIp65504P837ReservdL() throws CFException {
        if (isIp65504P837ReservdLModified()) { 
           ip65504P837ReservdL = refreshIp65504P837ReservdL();
        }
   		return ip65504P837ReservdL;
	}
	
	/**
	 * 	Update Ip65504P837ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P837-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P837ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P837ReservdL = checkIp65504P837ReservdLMaxLimit(number); 
		serializeIp65504P837ReservdL(ip65504P837ReservdL);
	}

	public void setIp65504P837ReservdL(int number) {
	    number = checkIp65504P837ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P837ReservdL((short)number);
	}
	public void setIp65504P837ReservdL(long number) {
	    number = checkIp65504P837ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P837ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup27
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P807ReservdS((short)0);
         	setIp65504P807ReservdL((short)0);
         	setIp65504P808ReservdS((short)0);
         	setIp65504P808ReservdL((short)0);
         	setIp65504P809ReservdS((short)0);
         	setIp65504P809ReservdL((short)0);
         	setIp65504P810ReservdS((short)0);
         	setIp65504P810ReservdL((short)0);
         	setIp65504P811ReservdS((short)0);
         	setIp65504P811ReservdL((short)0);
         	setIp65504P812ReservdS((short)0);
         	setIp65504P812ReservdL((short)0);
         	setIp65504P813ReservdS((short)0);
         	setIp65504P813ReservdL((short)0);
         	setIp65504P814ReservdS((short)0);
         	setIp65504P814ReservdL((short)0);
         	setIp65504P815ReservdS((short)0);
         	setIp65504P815ReservdL((short)0);
         	setIp65504P816ReservdS((short)0);
         	setIp65504P816ReservdL((short)0);
         	setIp65504P817ReservdS((short)0);
         	setIp65504P817ReservdL((short)0);
         	setIp65504P818ReservdS((short)0);
         	setIp65504P818ReservdL((short)0);
         	setIp65504P819ReservdS((short)0);
         	setIp65504P819ReservdL((short)0);
         	setIp65504P820ReservdS((short)0);
         	setIp65504P820ReservdL((short)0);
         	setIp65504P821ReservdS((short)0);
         	setIp65504P821ReservdL((short)0);
         	setIp65504P822ReservdS((short)0);
         	setIp65504P822ReservdL((short)0);
         	setIp65504P823ReservdS((short)0);
         	setIp65504P823ReservdL((short)0);
         	setIp65504P824ReservdS((short)0);
         	setIp65504P824ReservdL((short)0);
         	setIp65504P825ReservdS((short)0);
         	setIp65504P825ReservdL((short)0);
         	setIp65504P826ReservdS((short)0);
         	setIp65504P826ReservdL((short)0);
         	setIp65504P827ReservdS((short)0);
         	setIp65504P827ReservdL((short)0);
         	setIp65504P828ReservdS((short)0);
         	setIp65504P828ReservdL((short)0);
         	setIp65504P829ReservdS((short)0);
         	setIp65504P829ReservdL((short)0);
         	setIp65504P830ReservdS((short)0);
         	setIp65504P830ReservdL((short)0);
         	setIp65504P831ReservdS((short)0);
         	setIp65504P831ReservdL((short)0);
         	setIp65504P832ReservdS((short)0);
         	setIp65504P832ReservdL((short)0);
         	setIp65504P833ReservdS((short)0);
         	setIp65504P833ReservdL((short)0);
         	setIp65504P834ReservdS((short)0);
         	setIp65504P834ReservdL((short)0);
         	setIp65504P835ReservdS((short)0);
         	setIp65504P835ReservdL((short)0);
         	setIp65504P836ReservdS((short)0);
         	setIp65504P836ReservdL((short)0);
         	setIp65504P837ReservdS((short)0);
         	setIp65504P837ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup27FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_27_LENGTH;
		}

}
  
