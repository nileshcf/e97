package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup5 extends Ip65504PdsNamesLargeGroup5Serialized { 
   

								private short ip65504P125ReservdS;

								private short ip65504P125ReservdL;


								private short ip65504P126ReservdS;

								private short ip65504P126ReservdL;


								private short ip65504P127ReservdS;

								private short ip65504P127ReservdL;


								private short ip65504P128ReservdS;

								private short ip65504P128ReservdL;


								private short ip65504P129ReservdS;

								private short ip65504P129ReservdL;


								private short ip65504P130ReservdS;

								private short ip65504P130ReservdL;


								private short ip65504P131ReservdS;

								private short ip65504P131ReservdL;


								private short ip65504P132ReservdS;

								private short ip65504P132ReservdL;


								private short ip65504P133ReservdS;

								private short ip65504P133ReservdL;


								private short ip65504P134ReservdS;

								private short ip65504P134ReservdL;


								private short ip65504P135FlrejreS;

								private short ip65504P135FlrejreL;


								private short ip65504P136ReservdS;

								private short ip65504P136ReservdL;


								private short ip65504P137FeeCtlS;

								private short ip65504P137FeeCtlL;


								private short ip65504P138SrcMsgS;

								private short ip65504P138SrcMsgL;


								private short ip65504P139ReservdS;

								private short ip65504P139ReservdL;


								private short ip65504P140ReservdS;

								private short ip65504P140ReservdL;


								private short ip65504P141ReservdS;

								private short ip65504P141ReservdL;


								private short ip65504P142ReservdS;

								private short ip65504P142ReservdL;


								private short ip65504P143ReservdS;

								private short ip65504P143ReservdL;


								private short ip65504P144ReservdS;

								private short ip65504P144ReservdL;


								private short ip65504P145ReservdS;

								private short ip65504P145ReservdL;


								private short ip65504P146TrxAmtS;

								private short ip65504P146TrxAmtL;


								private short ip65504P147OrgAmtS;

								private short ip65504P147OrgAmtL;


								private short ip65504P148CurExpS;

								private short ip65504P148CurExpL;


								private short ip65504P149CurCdsS;

								private short ip65504P149CurCdsL;


								private short ip65504P150ReservdS;

								private short ip65504P150ReservdL;


								private short ip65504P151ReservdS;

								private short ip65504P151ReservdL;


								private short ip65504P152ReservdS;

								private short ip65504P152ReservdL;


								private short ip65504P153ReservdS;

								private short ip65504P153ReservdL;


								private short ip65504P154ReservdS;

								private short ip65504P154ReservdL;


								private short ip65504P155ReservdS;

								private short ip65504P155ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup5
	**/
    public Ip65504PdsNamesLargeGroup5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P125ReservdS
	 *	@return ip65504P125ReservdS
	 */
	public short getIp65504P125ReservdS() throws CFException {
        if (isIp65504P125ReservdSModified()) { 
           ip65504P125ReservdS = refreshIp65504P125ReservdS();
        }
   		return ip65504P125ReservdS;
	}
	
	/**
	 * 	Update Ip65504P125ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P125-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P125ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P125ReservdS = checkIp65504P125ReservdSMaxLimit(number); 
		serializeIp65504P125ReservdS(ip65504P125ReservdS);
	}

	public void setIp65504P125ReservdS(int number) {
	    number = checkIp65504P125ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P125ReservdS((short)number);
	}
	public void setIp65504P125ReservdS(long number) {
	    number = checkIp65504P125ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P125ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P125ReservdL
	 *	@return ip65504P125ReservdL
	 */
	public short getIp65504P125ReservdL() throws CFException {
        if (isIp65504P125ReservdLModified()) { 
           ip65504P125ReservdL = refreshIp65504P125ReservdL();
        }
   		return ip65504P125ReservdL;
	}
	
	/**
	 * 	Update Ip65504P125ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P125-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P125ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P125ReservdL = checkIp65504P125ReservdLMaxLimit(number); 
		serializeIp65504P125ReservdL(ip65504P125ReservdL);
	}

	public void setIp65504P125ReservdL(int number) {
	    number = checkIp65504P125ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P125ReservdL((short)number);
	}
	public void setIp65504P125ReservdL(long number) {
	    number = checkIp65504P125ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P125ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P126ReservdS
	 *	@return ip65504P126ReservdS
	 */
	public short getIp65504P126ReservdS() throws CFException {
        if (isIp65504P126ReservdSModified()) { 
           ip65504P126ReservdS = refreshIp65504P126ReservdS();
        }
   		return ip65504P126ReservdS;
	}
	
	/**
	 * 	Update Ip65504P126ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P126-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P126ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P126ReservdS = checkIp65504P126ReservdSMaxLimit(number); 
		serializeIp65504P126ReservdS(ip65504P126ReservdS);
	}

	public void setIp65504P126ReservdS(int number) {
	    number = checkIp65504P126ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P126ReservdS((short)number);
	}
	public void setIp65504P126ReservdS(long number) {
	    number = checkIp65504P126ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P126ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P126ReservdL
	 *	@return ip65504P126ReservdL
	 */
	public short getIp65504P126ReservdL() throws CFException {
        if (isIp65504P126ReservdLModified()) { 
           ip65504P126ReservdL = refreshIp65504P126ReservdL();
        }
   		return ip65504P126ReservdL;
	}
	
	/**
	 * 	Update Ip65504P126ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P126-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P126ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P126ReservdL = checkIp65504P126ReservdLMaxLimit(number); 
		serializeIp65504P126ReservdL(ip65504P126ReservdL);
	}

	public void setIp65504P126ReservdL(int number) {
	    number = checkIp65504P126ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P126ReservdL((short)number);
	}
	public void setIp65504P126ReservdL(long number) {
	    number = checkIp65504P126ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P126ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P127ReservdS
	 *	@return ip65504P127ReservdS
	 */
	public short getIp65504P127ReservdS() throws CFException {
        if (isIp65504P127ReservdSModified()) { 
           ip65504P127ReservdS = refreshIp65504P127ReservdS();
        }
   		return ip65504P127ReservdS;
	}
	
	/**
	 * 	Update Ip65504P127ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P127-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P127ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P127ReservdS = checkIp65504P127ReservdSMaxLimit(number); 
		serializeIp65504P127ReservdS(ip65504P127ReservdS);
	}

	public void setIp65504P127ReservdS(int number) {
	    number = checkIp65504P127ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P127ReservdS((short)number);
	}
	public void setIp65504P127ReservdS(long number) {
	    number = checkIp65504P127ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P127ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P127ReservdL
	 *	@return ip65504P127ReservdL
	 */
	public short getIp65504P127ReservdL() throws CFException {
        if (isIp65504P127ReservdLModified()) { 
           ip65504P127ReservdL = refreshIp65504P127ReservdL();
        }
   		return ip65504P127ReservdL;
	}
	
	/**
	 * 	Update Ip65504P127ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P127-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P127ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P127ReservdL = checkIp65504P127ReservdLMaxLimit(number); 
		serializeIp65504P127ReservdL(ip65504P127ReservdL);
	}

	public void setIp65504P127ReservdL(int number) {
	    number = checkIp65504P127ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P127ReservdL((short)number);
	}
	public void setIp65504P127ReservdL(long number) {
	    number = checkIp65504P127ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P127ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P128ReservdS
	 *	@return ip65504P128ReservdS
	 */
	public short getIp65504P128ReservdS() throws CFException {
        if (isIp65504P128ReservdSModified()) { 
           ip65504P128ReservdS = refreshIp65504P128ReservdS();
        }
   		return ip65504P128ReservdS;
	}
	
	/**
	 * 	Update Ip65504P128ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P128-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P128ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P128ReservdS = checkIp65504P128ReservdSMaxLimit(number); 
		serializeIp65504P128ReservdS(ip65504P128ReservdS);
	}

	public void setIp65504P128ReservdS(int number) {
	    number = checkIp65504P128ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P128ReservdS((short)number);
	}
	public void setIp65504P128ReservdS(long number) {
	    number = checkIp65504P128ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P128ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P128ReservdL
	 *	@return ip65504P128ReservdL
	 */
	public short getIp65504P128ReservdL() throws CFException {
        if (isIp65504P128ReservdLModified()) { 
           ip65504P128ReservdL = refreshIp65504P128ReservdL();
        }
   		return ip65504P128ReservdL;
	}
	
	/**
	 * 	Update Ip65504P128ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P128-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P128ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P128ReservdL = checkIp65504P128ReservdLMaxLimit(number); 
		serializeIp65504P128ReservdL(ip65504P128ReservdL);
	}

	public void setIp65504P128ReservdL(int number) {
	    number = checkIp65504P128ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P128ReservdL((short)number);
	}
	public void setIp65504P128ReservdL(long number) {
	    number = checkIp65504P128ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P128ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P129ReservdS
	 *	@return ip65504P129ReservdS
	 */
	public short getIp65504P129ReservdS() throws CFException {
        if (isIp65504P129ReservdSModified()) { 
           ip65504P129ReservdS = refreshIp65504P129ReservdS();
        }
   		return ip65504P129ReservdS;
	}
	
	/**
	 * 	Update Ip65504P129ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P129-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P129ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P129ReservdS = checkIp65504P129ReservdSMaxLimit(number); 
		serializeIp65504P129ReservdS(ip65504P129ReservdS);
	}

	public void setIp65504P129ReservdS(int number) {
	    number = checkIp65504P129ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P129ReservdS((short)number);
	}
	public void setIp65504P129ReservdS(long number) {
	    number = checkIp65504P129ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P129ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P129ReservdL
	 *	@return ip65504P129ReservdL
	 */
	public short getIp65504P129ReservdL() throws CFException {
        if (isIp65504P129ReservdLModified()) { 
           ip65504P129ReservdL = refreshIp65504P129ReservdL();
        }
   		return ip65504P129ReservdL;
	}
	
	/**
	 * 	Update Ip65504P129ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P129-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P129ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P129ReservdL = checkIp65504P129ReservdLMaxLimit(number); 
		serializeIp65504P129ReservdL(ip65504P129ReservdL);
	}

	public void setIp65504P129ReservdL(int number) {
	    number = checkIp65504P129ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P129ReservdL((short)number);
	}
	public void setIp65504P129ReservdL(long number) {
	    number = checkIp65504P129ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P129ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P130ReservdS
	 *	@return ip65504P130ReservdS
	 */
	public short getIp65504P130ReservdS() throws CFException {
        if (isIp65504P130ReservdSModified()) { 
           ip65504P130ReservdS = refreshIp65504P130ReservdS();
        }
   		return ip65504P130ReservdS;
	}
	
	/**
	 * 	Update Ip65504P130ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P130-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P130ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P130ReservdS = checkIp65504P130ReservdSMaxLimit(number); 
		serializeIp65504P130ReservdS(ip65504P130ReservdS);
	}

	public void setIp65504P130ReservdS(int number) {
	    number = checkIp65504P130ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P130ReservdS((short)number);
	}
	public void setIp65504P130ReservdS(long number) {
	    number = checkIp65504P130ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P130ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P130ReservdL
	 *	@return ip65504P130ReservdL
	 */
	public short getIp65504P130ReservdL() throws CFException {
        if (isIp65504P130ReservdLModified()) { 
           ip65504P130ReservdL = refreshIp65504P130ReservdL();
        }
   		return ip65504P130ReservdL;
	}
	
	/**
	 * 	Update Ip65504P130ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P130-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P130ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P130ReservdL = checkIp65504P130ReservdLMaxLimit(number); 
		serializeIp65504P130ReservdL(ip65504P130ReservdL);
	}

	public void setIp65504P130ReservdL(int number) {
	    number = checkIp65504P130ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P130ReservdL((short)number);
	}
	public void setIp65504P130ReservdL(long number) {
	    number = checkIp65504P130ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P130ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P131ReservdS
	 *	@return ip65504P131ReservdS
	 */
	public short getIp65504P131ReservdS() throws CFException {
        if (isIp65504P131ReservdSModified()) { 
           ip65504P131ReservdS = refreshIp65504P131ReservdS();
        }
   		return ip65504P131ReservdS;
	}
	
	/**
	 * 	Update Ip65504P131ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P131-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P131ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P131ReservdS = checkIp65504P131ReservdSMaxLimit(number); 
		serializeIp65504P131ReservdS(ip65504P131ReservdS);
	}

	public void setIp65504P131ReservdS(int number) {
	    number = checkIp65504P131ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P131ReservdS((short)number);
	}
	public void setIp65504P131ReservdS(long number) {
	    number = checkIp65504P131ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P131ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P131ReservdL
	 *	@return ip65504P131ReservdL
	 */
	public short getIp65504P131ReservdL() throws CFException {
        if (isIp65504P131ReservdLModified()) { 
           ip65504P131ReservdL = refreshIp65504P131ReservdL();
        }
   		return ip65504P131ReservdL;
	}
	
	/**
	 * 	Update Ip65504P131ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P131-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P131ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P131ReservdL = checkIp65504P131ReservdLMaxLimit(number); 
		serializeIp65504P131ReservdL(ip65504P131ReservdL);
	}

	public void setIp65504P131ReservdL(int number) {
	    number = checkIp65504P131ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P131ReservdL((short)number);
	}
	public void setIp65504P131ReservdL(long number) {
	    number = checkIp65504P131ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P131ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P132ReservdS
	 *	@return ip65504P132ReservdS
	 */
	public short getIp65504P132ReservdS() throws CFException {
        if (isIp65504P132ReservdSModified()) { 
           ip65504P132ReservdS = refreshIp65504P132ReservdS();
        }
   		return ip65504P132ReservdS;
	}
	
	/**
	 * 	Update Ip65504P132ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P132-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P132ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P132ReservdS = checkIp65504P132ReservdSMaxLimit(number); 
		serializeIp65504P132ReservdS(ip65504P132ReservdS);
	}

	public void setIp65504P132ReservdS(int number) {
	    number = checkIp65504P132ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P132ReservdS((short)number);
	}
	public void setIp65504P132ReservdS(long number) {
	    number = checkIp65504P132ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P132ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P132ReservdL
	 *	@return ip65504P132ReservdL
	 */
	public short getIp65504P132ReservdL() throws CFException {
        if (isIp65504P132ReservdLModified()) { 
           ip65504P132ReservdL = refreshIp65504P132ReservdL();
        }
   		return ip65504P132ReservdL;
	}
	
	/**
	 * 	Update Ip65504P132ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P132-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P132ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P132ReservdL = checkIp65504P132ReservdLMaxLimit(number); 
		serializeIp65504P132ReservdL(ip65504P132ReservdL);
	}

	public void setIp65504P132ReservdL(int number) {
	    number = checkIp65504P132ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P132ReservdL((short)number);
	}
	public void setIp65504P132ReservdL(long number) {
	    number = checkIp65504P132ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P132ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P133ReservdS
	 *	@return ip65504P133ReservdS
	 */
	public short getIp65504P133ReservdS() throws CFException {
        if (isIp65504P133ReservdSModified()) { 
           ip65504P133ReservdS = refreshIp65504P133ReservdS();
        }
   		return ip65504P133ReservdS;
	}
	
	/**
	 * 	Update Ip65504P133ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P133-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P133ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P133ReservdS = checkIp65504P133ReservdSMaxLimit(number); 
		serializeIp65504P133ReservdS(ip65504P133ReservdS);
	}

	public void setIp65504P133ReservdS(int number) {
	    number = checkIp65504P133ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P133ReservdS((short)number);
	}
	public void setIp65504P133ReservdS(long number) {
	    number = checkIp65504P133ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P133ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P133ReservdL
	 *	@return ip65504P133ReservdL
	 */
	public short getIp65504P133ReservdL() throws CFException {
        if (isIp65504P133ReservdLModified()) { 
           ip65504P133ReservdL = refreshIp65504P133ReservdL();
        }
   		return ip65504P133ReservdL;
	}
	
	/**
	 * 	Update Ip65504P133ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P133-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P133ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P133ReservdL = checkIp65504P133ReservdLMaxLimit(number); 
		serializeIp65504P133ReservdL(ip65504P133ReservdL);
	}

	public void setIp65504P133ReservdL(int number) {
	    number = checkIp65504P133ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P133ReservdL((short)number);
	}
	public void setIp65504P133ReservdL(long number) {
	    number = checkIp65504P133ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P133ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P134ReservdS
	 *	@return ip65504P134ReservdS
	 */
	public short getIp65504P134ReservdS() throws CFException {
        if (isIp65504P134ReservdSModified()) { 
           ip65504P134ReservdS = refreshIp65504P134ReservdS();
        }
   		return ip65504P134ReservdS;
	}
	
	/**
	 * 	Update Ip65504P134ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P134-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P134ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P134ReservdS = checkIp65504P134ReservdSMaxLimit(number); 
		serializeIp65504P134ReservdS(ip65504P134ReservdS);
	}

	public void setIp65504P134ReservdS(int number) {
	    number = checkIp65504P134ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P134ReservdS((short)number);
	}
	public void setIp65504P134ReservdS(long number) {
	    number = checkIp65504P134ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P134ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P134ReservdL
	 *	@return ip65504P134ReservdL
	 */
	public short getIp65504P134ReservdL() throws CFException {
        if (isIp65504P134ReservdLModified()) { 
           ip65504P134ReservdL = refreshIp65504P134ReservdL();
        }
   		return ip65504P134ReservdL;
	}
	
	/**
	 * 	Update Ip65504P134ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P134-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P134ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P134ReservdL = checkIp65504P134ReservdLMaxLimit(number); 
		serializeIp65504P134ReservdL(ip65504P134ReservdL);
	}

	public void setIp65504P134ReservdL(int number) {
	    number = checkIp65504P134ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P134ReservdL((short)number);
	}
	public void setIp65504P134ReservdL(long number) {
	    number = checkIp65504P134ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P134ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P135FlrejreS
	 *	@return ip65504P135FlrejreS
	 */
	public short getIp65504P135FlrejreS() throws CFException {
        if (isIp65504P135FlrejreSModified()) { 
           ip65504P135FlrejreS = refreshIp65504P135FlrejreS();
        }
   		return ip65504P135FlrejreS;
	}
	
	/**
	 * 	Update Ip65504P135FlrejreS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P135-FLREJRE-S
	 *	@param number
	 */
	public void setIp65504P135FlrejreS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P135FlrejreS = checkIp65504P135FlrejreSMaxLimit(number); 
		serializeIp65504P135FlrejreS(ip65504P135FlrejreS);
	}

	public void setIp65504P135FlrejreS(int number) {
	    number = checkIp65504P135FlrejreSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P135FlrejreS((short)number);
	}
	public void setIp65504P135FlrejreS(long number) {
	    number = checkIp65504P135FlrejreSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P135FlrejreS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P135FlrejreL
	 *	@return ip65504P135FlrejreL
	 */
	public short getIp65504P135FlrejreL() throws CFException {
        if (isIp65504P135FlrejreLModified()) { 
           ip65504P135FlrejreL = refreshIp65504P135FlrejreL();
        }
   		return ip65504P135FlrejreL;
	}
	
	/**
	 * 	Update Ip65504P135FlrejreL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P135-FLREJRE-L
	 *	@param number
	 */
	public void setIp65504P135FlrejreL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P135FlrejreL = checkIp65504P135FlrejreLMaxLimit(number); 
		serializeIp65504P135FlrejreL(ip65504P135FlrejreL);
	}

	public void setIp65504P135FlrejreL(int number) {
	    number = checkIp65504P135FlrejreLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P135FlrejreL((short)number);
	}
	public void setIp65504P135FlrejreL(long number) {
	    number = checkIp65504P135FlrejreLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P135FlrejreL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P136ReservdS
	 *	@return ip65504P136ReservdS
	 */
	public short getIp65504P136ReservdS() throws CFException {
        if (isIp65504P136ReservdSModified()) { 
           ip65504P136ReservdS = refreshIp65504P136ReservdS();
        }
   		return ip65504P136ReservdS;
	}
	
	/**
	 * 	Update Ip65504P136ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P136-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P136ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P136ReservdS = checkIp65504P136ReservdSMaxLimit(number); 
		serializeIp65504P136ReservdS(ip65504P136ReservdS);
	}

	public void setIp65504P136ReservdS(int number) {
	    number = checkIp65504P136ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P136ReservdS((short)number);
	}
	public void setIp65504P136ReservdS(long number) {
	    number = checkIp65504P136ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P136ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P136ReservdL
	 *	@return ip65504P136ReservdL
	 */
	public short getIp65504P136ReservdL() throws CFException {
        if (isIp65504P136ReservdLModified()) { 
           ip65504P136ReservdL = refreshIp65504P136ReservdL();
        }
   		return ip65504P136ReservdL;
	}
	
	/**
	 * 	Update Ip65504P136ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P136-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P136ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P136ReservdL = checkIp65504P136ReservdLMaxLimit(number); 
		serializeIp65504P136ReservdL(ip65504P136ReservdL);
	}

	public void setIp65504P136ReservdL(int number) {
	    number = checkIp65504P136ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P136ReservdL((short)number);
	}
	public void setIp65504P136ReservdL(long number) {
	    number = checkIp65504P136ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P136ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P137FeeCtlS
	 *	@return ip65504P137FeeCtlS
	 */
	public short getIp65504P137FeeCtlS() throws CFException {
        if (isIp65504P137FeeCtlSModified()) { 
           ip65504P137FeeCtlS = refreshIp65504P137FeeCtlS();
        }
   		return ip65504P137FeeCtlS;
	}
	
	/**
	 * 	Update Ip65504P137FeeCtlS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P137-FEE-CTL-S
	 *	@param number
	 */
	public void setIp65504P137FeeCtlS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P137FeeCtlS = checkIp65504P137FeeCtlSMaxLimit(number); 
		serializeIp65504P137FeeCtlS(ip65504P137FeeCtlS);
	}

	public void setIp65504P137FeeCtlS(int number) {
	    number = checkIp65504P137FeeCtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P137FeeCtlS((short)number);
	}
	public void setIp65504P137FeeCtlS(long number) {
	    number = checkIp65504P137FeeCtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P137FeeCtlS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P137FeeCtlL
	 *	@return ip65504P137FeeCtlL
	 */
	public short getIp65504P137FeeCtlL() throws CFException {
        if (isIp65504P137FeeCtlLModified()) { 
           ip65504P137FeeCtlL = refreshIp65504P137FeeCtlL();
        }
   		return ip65504P137FeeCtlL;
	}
	
	/**
	 * 	Update Ip65504P137FeeCtlL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P137-FEE-CTL-L
	 *	@param number
	 */
	public void setIp65504P137FeeCtlL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P137FeeCtlL = checkIp65504P137FeeCtlLMaxLimit(number); 
		serializeIp65504P137FeeCtlL(ip65504P137FeeCtlL);
	}

	public void setIp65504P137FeeCtlL(int number) {
	    number = checkIp65504P137FeeCtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P137FeeCtlL((short)number);
	}
	public void setIp65504P137FeeCtlL(long number) {
	    number = checkIp65504P137FeeCtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P137FeeCtlL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P138SrcMsgS
	 *	@return ip65504P138SrcMsgS
	 */
	public short getIp65504P138SrcMsgS() throws CFException {
        if (isIp65504P138SrcMsgSModified()) { 
           ip65504P138SrcMsgS = refreshIp65504P138SrcMsgS();
        }
   		return ip65504P138SrcMsgS;
	}
	
	/**
	 * 	Update Ip65504P138SrcMsgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P138-SRC-MSG-S
	 *	@param number
	 */
	public void setIp65504P138SrcMsgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P138SrcMsgS = checkIp65504P138SrcMsgSMaxLimit(number); 
		serializeIp65504P138SrcMsgS(ip65504P138SrcMsgS);
	}

	public void setIp65504P138SrcMsgS(int number) {
	    number = checkIp65504P138SrcMsgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P138SrcMsgS((short)number);
	}
	public void setIp65504P138SrcMsgS(long number) {
	    number = checkIp65504P138SrcMsgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P138SrcMsgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P138SrcMsgL
	 *	@return ip65504P138SrcMsgL
	 */
	public short getIp65504P138SrcMsgL() throws CFException {
        if (isIp65504P138SrcMsgLModified()) { 
           ip65504P138SrcMsgL = refreshIp65504P138SrcMsgL();
        }
   		return ip65504P138SrcMsgL;
	}
	
	/**
	 * 	Update Ip65504P138SrcMsgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P138-SRC-MSG-L
	 *	@param number
	 */
	public void setIp65504P138SrcMsgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P138SrcMsgL = checkIp65504P138SrcMsgLMaxLimit(number); 
		serializeIp65504P138SrcMsgL(ip65504P138SrcMsgL);
	}

	public void setIp65504P138SrcMsgL(int number) {
	    number = checkIp65504P138SrcMsgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P138SrcMsgL((short)number);
	}
	public void setIp65504P138SrcMsgL(long number) {
	    number = checkIp65504P138SrcMsgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P138SrcMsgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P139ReservdS
	 *	@return ip65504P139ReservdS
	 */
	public short getIp65504P139ReservdS() throws CFException {
        if (isIp65504P139ReservdSModified()) { 
           ip65504P139ReservdS = refreshIp65504P139ReservdS();
        }
   		return ip65504P139ReservdS;
	}
	
	/**
	 * 	Update Ip65504P139ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P139-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P139ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P139ReservdS = checkIp65504P139ReservdSMaxLimit(number); 
		serializeIp65504P139ReservdS(ip65504P139ReservdS);
	}

	public void setIp65504P139ReservdS(int number) {
	    number = checkIp65504P139ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P139ReservdS((short)number);
	}
	public void setIp65504P139ReservdS(long number) {
	    number = checkIp65504P139ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P139ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P139ReservdL
	 *	@return ip65504P139ReservdL
	 */
	public short getIp65504P139ReservdL() throws CFException {
        if (isIp65504P139ReservdLModified()) { 
           ip65504P139ReservdL = refreshIp65504P139ReservdL();
        }
   		return ip65504P139ReservdL;
	}
	
	/**
	 * 	Update Ip65504P139ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P139-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P139ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P139ReservdL = checkIp65504P139ReservdLMaxLimit(number); 
		serializeIp65504P139ReservdL(ip65504P139ReservdL);
	}

	public void setIp65504P139ReservdL(int number) {
	    number = checkIp65504P139ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P139ReservdL((short)number);
	}
	public void setIp65504P139ReservdL(long number) {
	    number = checkIp65504P139ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P139ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P140ReservdS
	 *	@return ip65504P140ReservdS
	 */
	public short getIp65504P140ReservdS() throws CFException {
        if (isIp65504P140ReservdSModified()) { 
           ip65504P140ReservdS = refreshIp65504P140ReservdS();
        }
   		return ip65504P140ReservdS;
	}
	
	/**
	 * 	Update Ip65504P140ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P140-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P140ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P140ReservdS = checkIp65504P140ReservdSMaxLimit(number); 
		serializeIp65504P140ReservdS(ip65504P140ReservdS);
	}

	public void setIp65504P140ReservdS(int number) {
	    number = checkIp65504P140ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P140ReservdS((short)number);
	}
	public void setIp65504P140ReservdS(long number) {
	    number = checkIp65504P140ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P140ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P140ReservdL
	 *	@return ip65504P140ReservdL
	 */
	public short getIp65504P140ReservdL() throws CFException {
        if (isIp65504P140ReservdLModified()) { 
           ip65504P140ReservdL = refreshIp65504P140ReservdL();
        }
   		return ip65504P140ReservdL;
	}
	
	/**
	 * 	Update Ip65504P140ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P140-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P140ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P140ReservdL = checkIp65504P140ReservdLMaxLimit(number); 
		serializeIp65504P140ReservdL(ip65504P140ReservdL);
	}

	public void setIp65504P140ReservdL(int number) {
	    number = checkIp65504P140ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P140ReservdL((short)number);
	}
	public void setIp65504P140ReservdL(long number) {
	    number = checkIp65504P140ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P140ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P141ReservdS
	 *	@return ip65504P141ReservdS
	 */
	public short getIp65504P141ReservdS() throws CFException {
        if (isIp65504P141ReservdSModified()) { 
           ip65504P141ReservdS = refreshIp65504P141ReservdS();
        }
   		return ip65504P141ReservdS;
	}
	
	/**
	 * 	Update Ip65504P141ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P141-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P141ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P141ReservdS = checkIp65504P141ReservdSMaxLimit(number); 
		serializeIp65504P141ReservdS(ip65504P141ReservdS);
	}

	public void setIp65504P141ReservdS(int number) {
	    number = checkIp65504P141ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P141ReservdS((short)number);
	}
	public void setIp65504P141ReservdS(long number) {
	    number = checkIp65504P141ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P141ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P141ReservdL
	 *	@return ip65504P141ReservdL
	 */
	public short getIp65504P141ReservdL() throws CFException {
        if (isIp65504P141ReservdLModified()) { 
           ip65504P141ReservdL = refreshIp65504P141ReservdL();
        }
   		return ip65504P141ReservdL;
	}
	
	/**
	 * 	Update Ip65504P141ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P141-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P141ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P141ReservdL = checkIp65504P141ReservdLMaxLimit(number); 
		serializeIp65504P141ReservdL(ip65504P141ReservdL);
	}

	public void setIp65504P141ReservdL(int number) {
	    number = checkIp65504P141ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P141ReservdL((short)number);
	}
	public void setIp65504P141ReservdL(long number) {
	    number = checkIp65504P141ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P141ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P142ReservdS
	 *	@return ip65504P142ReservdS
	 */
	public short getIp65504P142ReservdS() throws CFException {
        if (isIp65504P142ReservdSModified()) { 
           ip65504P142ReservdS = refreshIp65504P142ReservdS();
        }
   		return ip65504P142ReservdS;
	}
	
	/**
	 * 	Update Ip65504P142ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P142-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P142ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P142ReservdS = checkIp65504P142ReservdSMaxLimit(number); 
		serializeIp65504P142ReservdS(ip65504P142ReservdS);
	}

	public void setIp65504P142ReservdS(int number) {
	    number = checkIp65504P142ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P142ReservdS((short)number);
	}
	public void setIp65504P142ReservdS(long number) {
	    number = checkIp65504P142ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P142ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P142ReservdL
	 *	@return ip65504P142ReservdL
	 */
	public short getIp65504P142ReservdL() throws CFException {
        if (isIp65504P142ReservdLModified()) { 
           ip65504P142ReservdL = refreshIp65504P142ReservdL();
        }
   		return ip65504P142ReservdL;
	}
	
	/**
	 * 	Update Ip65504P142ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P142-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P142ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P142ReservdL = checkIp65504P142ReservdLMaxLimit(number); 
		serializeIp65504P142ReservdL(ip65504P142ReservdL);
	}

	public void setIp65504P142ReservdL(int number) {
	    number = checkIp65504P142ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P142ReservdL((short)number);
	}
	public void setIp65504P142ReservdL(long number) {
	    number = checkIp65504P142ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P142ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P143ReservdS
	 *	@return ip65504P143ReservdS
	 */
	public short getIp65504P143ReservdS() throws CFException {
        if (isIp65504P143ReservdSModified()) { 
           ip65504P143ReservdS = refreshIp65504P143ReservdS();
        }
   		return ip65504P143ReservdS;
	}
	
	/**
	 * 	Update Ip65504P143ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P143-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P143ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P143ReservdS = checkIp65504P143ReservdSMaxLimit(number); 
		serializeIp65504P143ReservdS(ip65504P143ReservdS);
	}

	public void setIp65504P143ReservdS(int number) {
	    number = checkIp65504P143ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P143ReservdS((short)number);
	}
	public void setIp65504P143ReservdS(long number) {
	    number = checkIp65504P143ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P143ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P143ReservdL
	 *	@return ip65504P143ReservdL
	 */
	public short getIp65504P143ReservdL() throws CFException {
        if (isIp65504P143ReservdLModified()) { 
           ip65504P143ReservdL = refreshIp65504P143ReservdL();
        }
   		return ip65504P143ReservdL;
	}
	
	/**
	 * 	Update Ip65504P143ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P143-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P143ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P143ReservdL = checkIp65504P143ReservdLMaxLimit(number); 
		serializeIp65504P143ReservdL(ip65504P143ReservdL);
	}

	public void setIp65504P143ReservdL(int number) {
	    number = checkIp65504P143ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P143ReservdL((short)number);
	}
	public void setIp65504P143ReservdL(long number) {
	    number = checkIp65504P143ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P143ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P144ReservdS
	 *	@return ip65504P144ReservdS
	 */
	public short getIp65504P144ReservdS() throws CFException {
        if (isIp65504P144ReservdSModified()) { 
           ip65504P144ReservdS = refreshIp65504P144ReservdS();
        }
   		return ip65504P144ReservdS;
	}
	
	/**
	 * 	Update Ip65504P144ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P144-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P144ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P144ReservdS = checkIp65504P144ReservdSMaxLimit(number); 
		serializeIp65504P144ReservdS(ip65504P144ReservdS);
	}

	public void setIp65504P144ReservdS(int number) {
	    number = checkIp65504P144ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P144ReservdS((short)number);
	}
	public void setIp65504P144ReservdS(long number) {
	    number = checkIp65504P144ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P144ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P144ReservdL
	 *	@return ip65504P144ReservdL
	 */
	public short getIp65504P144ReservdL() throws CFException {
        if (isIp65504P144ReservdLModified()) { 
           ip65504P144ReservdL = refreshIp65504P144ReservdL();
        }
   		return ip65504P144ReservdL;
	}
	
	/**
	 * 	Update Ip65504P144ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P144-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P144ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P144ReservdL = checkIp65504P144ReservdLMaxLimit(number); 
		serializeIp65504P144ReservdL(ip65504P144ReservdL);
	}

	public void setIp65504P144ReservdL(int number) {
	    number = checkIp65504P144ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P144ReservdL((short)number);
	}
	public void setIp65504P144ReservdL(long number) {
	    number = checkIp65504P144ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P144ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P145ReservdS
	 *	@return ip65504P145ReservdS
	 */
	public short getIp65504P145ReservdS() throws CFException {
        if (isIp65504P145ReservdSModified()) { 
           ip65504P145ReservdS = refreshIp65504P145ReservdS();
        }
   		return ip65504P145ReservdS;
	}
	
	/**
	 * 	Update Ip65504P145ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P145-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P145ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P145ReservdS = checkIp65504P145ReservdSMaxLimit(number); 
		serializeIp65504P145ReservdS(ip65504P145ReservdS);
	}

	public void setIp65504P145ReservdS(int number) {
	    number = checkIp65504P145ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P145ReservdS((short)number);
	}
	public void setIp65504P145ReservdS(long number) {
	    number = checkIp65504P145ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P145ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P145ReservdL
	 *	@return ip65504P145ReservdL
	 */
	public short getIp65504P145ReservdL() throws CFException {
        if (isIp65504P145ReservdLModified()) { 
           ip65504P145ReservdL = refreshIp65504P145ReservdL();
        }
   		return ip65504P145ReservdL;
	}
	
	/**
	 * 	Update Ip65504P145ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P145-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P145ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P145ReservdL = checkIp65504P145ReservdLMaxLimit(number); 
		serializeIp65504P145ReservdL(ip65504P145ReservdL);
	}

	public void setIp65504P145ReservdL(int number) {
	    number = checkIp65504P145ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P145ReservdL((short)number);
	}
	public void setIp65504P145ReservdL(long number) {
	    number = checkIp65504P145ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P145ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P146TrxAmtS
	 *	@return ip65504P146TrxAmtS
	 */
	public short getIp65504P146TrxAmtS() throws CFException {
        if (isIp65504P146TrxAmtSModified()) { 
           ip65504P146TrxAmtS = refreshIp65504P146TrxAmtS();
        }
   		return ip65504P146TrxAmtS;
	}
	
	/**
	 * 	Update Ip65504P146TrxAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P146-TRX-AMT-S
	 *	@param number
	 */
	public void setIp65504P146TrxAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P146TrxAmtS = checkIp65504P146TrxAmtSMaxLimit(number); 
		serializeIp65504P146TrxAmtS(ip65504P146TrxAmtS);
	}

	public void setIp65504P146TrxAmtS(int number) {
	    number = checkIp65504P146TrxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P146TrxAmtS((short)number);
	}
	public void setIp65504P146TrxAmtS(long number) {
	    number = checkIp65504P146TrxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P146TrxAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P146TrxAmtL
	 *	@return ip65504P146TrxAmtL
	 */
	public short getIp65504P146TrxAmtL() throws CFException {
        if (isIp65504P146TrxAmtLModified()) { 
           ip65504P146TrxAmtL = refreshIp65504P146TrxAmtL();
        }
   		return ip65504P146TrxAmtL;
	}
	
	/**
	 * 	Update Ip65504P146TrxAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P146-TRX-AMT-L
	 *	@param number
	 */
	public void setIp65504P146TrxAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P146TrxAmtL = checkIp65504P146TrxAmtLMaxLimit(number); 
		serializeIp65504P146TrxAmtL(ip65504P146TrxAmtL);
	}

	public void setIp65504P146TrxAmtL(int number) {
	    number = checkIp65504P146TrxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P146TrxAmtL((short)number);
	}
	public void setIp65504P146TrxAmtL(long number) {
	    number = checkIp65504P146TrxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P146TrxAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P147OrgAmtS
	 *	@return ip65504P147OrgAmtS
	 */
	public short getIp65504P147OrgAmtS() throws CFException {
        if (isIp65504P147OrgAmtSModified()) { 
           ip65504P147OrgAmtS = refreshIp65504P147OrgAmtS();
        }
   		return ip65504P147OrgAmtS;
	}
	
	/**
	 * 	Update Ip65504P147OrgAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P147-ORG-AMT-S
	 *	@param number
	 */
	public void setIp65504P147OrgAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P147OrgAmtS = checkIp65504P147OrgAmtSMaxLimit(number); 
		serializeIp65504P147OrgAmtS(ip65504P147OrgAmtS);
	}

	public void setIp65504P147OrgAmtS(int number) {
	    number = checkIp65504P147OrgAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P147OrgAmtS((short)number);
	}
	public void setIp65504P147OrgAmtS(long number) {
	    number = checkIp65504P147OrgAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P147OrgAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P147OrgAmtL
	 *	@return ip65504P147OrgAmtL
	 */
	public short getIp65504P147OrgAmtL() throws CFException {
        if (isIp65504P147OrgAmtLModified()) { 
           ip65504P147OrgAmtL = refreshIp65504P147OrgAmtL();
        }
   		return ip65504P147OrgAmtL;
	}
	
	/**
	 * 	Update Ip65504P147OrgAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P147-ORG-AMT-L
	 *	@param number
	 */
	public void setIp65504P147OrgAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P147OrgAmtL = checkIp65504P147OrgAmtLMaxLimit(number); 
		serializeIp65504P147OrgAmtL(ip65504P147OrgAmtL);
	}

	public void setIp65504P147OrgAmtL(int number) {
	    number = checkIp65504P147OrgAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P147OrgAmtL((short)number);
	}
	public void setIp65504P147OrgAmtL(long number) {
	    number = checkIp65504P147OrgAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P147OrgAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P148CurExpS
	 *	@return ip65504P148CurExpS
	 */
	public short getIp65504P148CurExpS() throws CFException {
        if (isIp65504P148CurExpSModified()) { 
           ip65504P148CurExpS = refreshIp65504P148CurExpS();
        }
   		return ip65504P148CurExpS;
	}
	
	/**
	 * 	Update Ip65504P148CurExpS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P148-CUR-EXP-S
	 *	@param number
	 */
	public void setIp65504P148CurExpS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P148CurExpS = checkIp65504P148CurExpSMaxLimit(number); 
		serializeIp65504P148CurExpS(ip65504P148CurExpS);
	}

	public void setIp65504P148CurExpS(int number) {
	    number = checkIp65504P148CurExpSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P148CurExpS((short)number);
	}
	public void setIp65504P148CurExpS(long number) {
	    number = checkIp65504P148CurExpSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P148CurExpS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P148CurExpL
	 *	@return ip65504P148CurExpL
	 */
	public short getIp65504P148CurExpL() throws CFException {
        if (isIp65504P148CurExpLModified()) { 
           ip65504P148CurExpL = refreshIp65504P148CurExpL();
        }
   		return ip65504P148CurExpL;
	}
	
	/**
	 * 	Update Ip65504P148CurExpL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P148-CUR-EXP-L
	 *	@param number
	 */
	public void setIp65504P148CurExpL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P148CurExpL = checkIp65504P148CurExpLMaxLimit(number); 
		serializeIp65504P148CurExpL(ip65504P148CurExpL);
	}

	public void setIp65504P148CurExpL(int number) {
	    number = checkIp65504P148CurExpLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P148CurExpL((short)number);
	}
	public void setIp65504P148CurExpL(long number) {
	    number = checkIp65504P148CurExpLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P148CurExpL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P149CurCdsS
	 *	@return ip65504P149CurCdsS
	 */
	public short getIp65504P149CurCdsS() throws CFException {
        if (isIp65504P149CurCdsSModified()) { 
           ip65504P149CurCdsS = refreshIp65504P149CurCdsS();
        }
   		return ip65504P149CurCdsS;
	}
	
	/**
	 * 	Update Ip65504P149CurCdsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P149-CUR-CDS-S
	 *	@param number
	 */
	public void setIp65504P149CurCdsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P149CurCdsS = checkIp65504P149CurCdsSMaxLimit(number); 
		serializeIp65504P149CurCdsS(ip65504P149CurCdsS);
	}

	public void setIp65504P149CurCdsS(int number) {
	    number = checkIp65504P149CurCdsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P149CurCdsS((short)number);
	}
	public void setIp65504P149CurCdsS(long number) {
	    number = checkIp65504P149CurCdsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P149CurCdsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P149CurCdsL
	 *	@return ip65504P149CurCdsL
	 */
	public short getIp65504P149CurCdsL() throws CFException {
        if (isIp65504P149CurCdsLModified()) { 
           ip65504P149CurCdsL = refreshIp65504P149CurCdsL();
        }
   		return ip65504P149CurCdsL;
	}
	
	/**
	 * 	Update Ip65504P149CurCdsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P149-CUR-CDS-L
	 *	@param number
	 */
	public void setIp65504P149CurCdsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P149CurCdsL = checkIp65504P149CurCdsLMaxLimit(number); 
		serializeIp65504P149CurCdsL(ip65504P149CurCdsL);
	}

	public void setIp65504P149CurCdsL(int number) {
	    number = checkIp65504P149CurCdsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P149CurCdsL((short)number);
	}
	public void setIp65504P149CurCdsL(long number) {
	    number = checkIp65504P149CurCdsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P149CurCdsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P150ReservdS
	 *	@return ip65504P150ReservdS
	 */
	public short getIp65504P150ReservdS() throws CFException {
        if (isIp65504P150ReservdSModified()) { 
           ip65504P150ReservdS = refreshIp65504P150ReservdS();
        }
   		return ip65504P150ReservdS;
	}
	
	/**
	 * 	Update Ip65504P150ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P150-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P150ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P150ReservdS = checkIp65504P150ReservdSMaxLimit(number); 
		serializeIp65504P150ReservdS(ip65504P150ReservdS);
	}

	public void setIp65504P150ReservdS(int number) {
	    number = checkIp65504P150ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P150ReservdS((short)number);
	}
	public void setIp65504P150ReservdS(long number) {
	    number = checkIp65504P150ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P150ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P150ReservdL
	 *	@return ip65504P150ReservdL
	 */
	public short getIp65504P150ReservdL() throws CFException {
        if (isIp65504P150ReservdLModified()) { 
           ip65504P150ReservdL = refreshIp65504P150ReservdL();
        }
   		return ip65504P150ReservdL;
	}
	
	/**
	 * 	Update Ip65504P150ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P150-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P150ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P150ReservdL = checkIp65504P150ReservdLMaxLimit(number); 
		serializeIp65504P150ReservdL(ip65504P150ReservdL);
	}

	public void setIp65504P150ReservdL(int number) {
	    number = checkIp65504P150ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P150ReservdL((short)number);
	}
	public void setIp65504P150ReservdL(long number) {
	    number = checkIp65504P150ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P150ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P151ReservdS
	 *	@return ip65504P151ReservdS
	 */
	public short getIp65504P151ReservdS() throws CFException {
        if (isIp65504P151ReservdSModified()) { 
           ip65504P151ReservdS = refreshIp65504P151ReservdS();
        }
   		return ip65504P151ReservdS;
	}
	
	/**
	 * 	Update Ip65504P151ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P151-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P151ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P151ReservdS = checkIp65504P151ReservdSMaxLimit(number); 
		serializeIp65504P151ReservdS(ip65504P151ReservdS);
	}

	public void setIp65504P151ReservdS(int number) {
	    number = checkIp65504P151ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P151ReservdS((short)number);
	}
	public void setIp65504P151ReservdS(long number) {
	    number = checkIp65504P151ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P151ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P151ReservdL
	 *	@return ip65504P151ReservdL
	 */
	public short getIp65504P151ReservdL() throws CFException {
        if (isIp65504P151ReservdLModified()) { 
           ip65504P151ReservdL = refreshIp65504P151ReservdL();
        }
   		return ip65504P151ReservdL;
	}
	
	/**
	 * 	Update Ip65504P151ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P151-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P151ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P151ReservdL = checkIp65504P151ReservdLMaxLimit(number); 
		serializeIp65504P151ReservdL(ip65504P151ReservdL);
	}

	public void setIp65504P151ReservdL(int number) {
	    number = checkIp65504P151ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P151ReservdL((short)number);
	}
	public void setIp65504P151ReservdL(long number) {
	    number = checkIp65504P151ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P151ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P152ReservdS
	 *	@return ip65504P152ReservdS
	 */
	public short getIp65504P152ReservdS() throws CFException {
        if (isIp65504P152ReservdSModified()) { 
           ip65504P152ReservdS = refreshIp65504P152ReservdS();
        }
   		return ip65504P152ReservdS;
	}
	
	/**
	 * 	Update Ip65504P152ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P152-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P152ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P152ReservdS = checkIp65504P152ReservdSMaxLimit(number); 
		serializeIp65504P152ReservdS(ip65504P152ReservdS);
	}

	public void setIp65504P152ReservdS(int number) {
	    number = checkIp65504P152ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P152ReservdS((short)number);
	}
	public void setIp65504P152ReservdS(long number) {
	    number = checkIp65504P152ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P152ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P152ReservdL
	 *	@return ip65504P152ReservdL
	 */
	public short getIp65504P152ReservdL() throws CFException {
        if (isIp65504P152ReservdLModified()) { 
           ip65504P152ReservdL = refreshIp65504P152ReservdL();
        }
   		return ip65504P152ReservdL;
	}
	
	/**
	 * 	Update Ip65504P152ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P152-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P152ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P152ReservdL = checkIp65504P152ReservdLMaxLimit(number); 
		serializeIp65504P152ReservdL(ip65504P152ReservdL);
	}

	public void setIp65504P152ReservdL(int number) {
	    number = checkIp65504P152ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P152ReservdL((short)number);
	}
	public void setIp65504P152ReservdL(long number) {
	    number = checkIp65504P152ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P152ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P153ReservdS
	 *	@return ip65504P153ReservdS
	 */
	public short getIp65504P153ReservdS() throws CFException {
        if (isIp65504P153ReservdSModified()) { 
           ip65504P153ReservdS = refreshIp65504P153ReservdS();
        }
   		return ip65504P153ReservdS;
	}
	
	/**
	 * 	Update Ip65504P153ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P153-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P153ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P153ReservdS = checkIp65504P153ReservdSMaxLimit(number); 
		serializeIp65504P153ReservdS(ip65504P153ReservdS);
	}

	public void setIp65504P153ReservdS(int number) {
	    number = checkIp65504P153ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P153ReservdS((short)number);
	}
	public void setIp65504P153ReservdS(long number) {
	    number = checkIp65504P153ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P153ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P153ReservdL
	 *	@return ip65504P153ReservdL
	 */
	public short getIp65504P153ReservdL() throws CFException {
        if (isIp65504P153ReservdLModified()) { 
           ip65504P153ReservdL = refreshIp65504P153ReservdL();
        }
   		return ip65504P153ReservdL;
	}
	
	/**
	 * 	Update Ip65504P153ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P153-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P153ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P153ReservdL = checkIp65504P153ReservdLMaxLimit(number); 
		serializeIp65504P153ReservdL(ip65504P153ReservdL);
	}

	public void setIp65504P153ReservdL(int number) {
	    number = checkIp65504P153ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P153ReservdL((short)number);
	}
	public void setIp65504P153ReservdL(long number) {
	    number = checkIp65504P153ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P153ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P154ReservdS
	 *	@return ip65504P154ReservdS
	 */
	public short getIp65504P154ReservdS() throws CFException {
        if (isIp65504P154ReservdSModified()) { 
           ip65504P154ReservdS = refreshIp65504P154ReservdS();
        }
   		return ip65504P154ReservdS;
	}
	
	/**
	 * 	Update Ip65504P154ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P154-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P154ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P154ReservdS = checkIp65504P154ReservdSMaxLimit(number); 
		serializeIp65504P154ReservdS(ip65504P154ReservdS);
	}

	public void setIp65504P154ReservdS(int number) {
	    number = checkIp65504P154ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P154ReservdS((short)number);
	}
	public void setIp65504P154ReservdS(long number) {
	    number = checkIp65504P154ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P154ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P154ReservdL
	 *	@return ip65504P154ReservdL
	 */
	public short getIp65504P154ReservdL() throws CFException {
        if (isIp65504P154ReservdLModified()) { 
           ip65504P154ReservdL = refreshIp65504P154ReservdL();
        }
   		return ip65504P154ReservdL;
	}
	
	/**
	 * 	Update Ip65504P154ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P154-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P154ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P154ReservdL = checkIp65504P154ReservdLMaxLimit(number); 
		serializeIp65504P154ReservdL(ip65504P154ReservdL);
	}

	public void setIp65504P154ReservdL(int number) {
	    number = checkIp65504P154ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P154ReservdL((short)number);
	}
	public void setIp65504P154ReservdL(long number) {
	    number = checkIp65504P154ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P154ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P155ReservdS
	 *	@return ip65504P155ReservdS
	 */
	public short getIp65504P155ReservdS() throws CFException {
        if (isIp65504P155ReservdSModified()) { 
           ip65504P155ReservdS = refreshIp65504P155ReservdS();
        }
   		return ip65504P155ReservdS;
	}
	
	/**
	 * 	Update Ip65504P155ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P155-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P155ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P155ReservdS = checkIp65504P155ReservdSMaxLimit(number); 
		serializeIp65504P155ReservdS(ip65504P155ReservdS);
	}

	public void setIp65504P155ReservdS(int number) {
	    number = checkIp65504P155ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P155ReservdS((short)number);
	}
	public void setIp65504P155ReservdS(long number) {
	    number = checkIp65504P155ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P155ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P155ReservdL
	 *	@return ip65504P155ReservdL
	 */
	public short getIp65504P155ReservdL() throws CFException {
        if (isIp65504P155ReservdLModified()) { 
           ip65504P155ReservdL = refreshIp65504P155ReservdL();
        }
   		return ip65504P155ReservdL;
	}
	
	/**
	 * 	Update Ip65504P155ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P155-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P155ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P155ReservdL = checkIp65504P155ReservdLMaxLimit(number); 
		serializeIp65504P155ReservdL(ip65504P155ReservdL);
	}

	public void setIp65504P155ReservdL(int number) {
	    number = checkIp65504P155ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P155ReservdL((short)number);
	}
	public void setIp65504P155ReservdL(long number) {
	    number = checkIp65504P155ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P155ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P125ReservdS((short)0);
         	setIp65504P125ReservdL((short)0);
         	setIp65504P126ReservdS((short)0);
         	setIp65504P126ReservdL((short)0);
         	setIp65504P127ReservdS((short)0);
         	setIp65504P127ReservdL((short)0);
         	setIp65504P128ReservdS((short)0);
         	setIp65504P128ReservdL((short)0);
         	setIp65504P129ReservdS((short)0);
         	setIp65504P129ReservdL((short)0);
         	setIp65504P130ReservdS((short)0);
         	setIp65504P130ReservdL((short)0);
         	setIp65504P131ReservdS((short)0);
         	setIp65504P131ReservdL((short)0);
         	setIp65504P132ReservdS((short)0);
         	setIp65504P132ReservdL((short)0);
         	setIp65504P133ReservdS((short)0);
         	setIp65504P133ReservdL((short)0);
         	setIp65504P134ReservdS((short)0);
         	setIp65504P134ReservdL((short)0);
         	setIp65504P135FlrejreS((short)0);
         	setIp65504P135FlrejreL((short)0);
         	setIp65504P136ReservdS((short)0);
         	setIp65504P136ReservdL((short)0);
         	setIp65504P137FeeCtlS((short)0);
         	setIp65504P137FeeCtlL((short)0);
         	setIp65504P138SrcMsgS((short)0);
         	setIp65504P138SrcMsgL((short)0);
         	setIp65504P139ReservdS((short)0);
         	setIp65504P139ReservdL((short)0);
         	setIp65504P140ReservdS((short)0);
         	setIp65504P140ReservdL((short)0);
         	setIp65504P141ReservdS((short)0);
         	setIp65504P141ReservdL((short)0);
         	setIp65504P142ReservdS((short)0);
         	setIp65504P142ReservdL((short)0);
         	setIp65504P143ReservdS((short)0);
         	setIp65504P143ReservdL((short)0);
         	setIp65504P144ReservdS((short)0);
         	setIp65504P144ReservdL((short)0);
         	setIp65504P145ReservdS((short)0);
         	setIp65504P145ReservdL((short)0);
         	setIp65504P146TrxAmtS((short)0);
         	setIp65504P146TrxAmtL((short)0);
         	setIp65504P147OrgAmtS((short)0);
         	setIp65504P147OrgAmtL((short)0);
         	setIp65504P148CurExpS((short)0);
         	setIp65504P148CurExpL((short)0);
         	setIp65504P149CurCdsS((short)0);
         	setIp65504P149CurCdsL((short)0);
         	setIp65504P150ReservdS((short)0);
         	setIp65504P150ReservdL((short)0);
         	setIp65504P151ReservdS((short)0);
         	setIp65504P151ReservdL((short)0);
         	setIp65504P152ReservdS((short)0);
         	setIp65504P152ReservdL((short)0);
         	setIp65504P153ReservdS((short)0);
         	setIp65504P153ReservdL((short)0);
         	setIp65504P154ReservdS((short)0);
         	setIp65504P154ReservdL((short)0);
         	setIp65504P155ReservdS((short)0);
         	setIp65504P155ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup5FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_5_LENGTH;
		}

}
  
