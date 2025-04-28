package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup1 extends Ip65504PdsNamesLargeGroup1Serialized { 
   

								private short ip65504P001MsgMdeS;

								private short ip65504P001MsgMdeL;


								private short ip65504P002MsgIndS;

								private short ip65504P002MsgIndL;


								private short ip65504P003OrigDtS;

								private short ip65504P003OrigDtL;


								private short ip65504P004NtwkAcS;

								private short ip65504P004NtwkAcL;


								private short ip65504P005MsgeridS;

								private short ip65504P005MsgeridL;


								private short ip65504P006ReservdS;

								private short ip65504P006ReservdL;


								private short ip65504P007ReservdS;

								private short ip65504P007ReservdL;


								private short ip65504P008ReservdS;

								private short ip65504P008ReservdL;


								private short ip65504P009ReservdS;

								private short ip65504P009ReservdL;


								private short ip65504P010ReservdS;

								private short ip65504P010ReservdL;


								private short ip65504P011ReservdS;

								private short ip65504P011ReservdL;


								private short ip65504P012ReservdS;

								private short ip65504P012ReservdL;


								private short ip65504P013PasswrdS;

								private short ip65504P013PasswrdL;


								private short ip65504P014ReservdS;

								private short ip65504P014ReservdL;


								private short ip65504P015ReservdS;

								private short ip65504P015ReservdL;


								private short ip65504P016TrxRefS;

								private short ip65504P016TrxRefL;


								private short ip65504P017ReservdS;

								private short ip65504P017ReservdL;


								private short ip65504P018ReservdS;

								private short ip65504P018ReservdL;


								private short ip65504P019ReservdS;

								private short ip65504P019ReservdL;


								private short ip65504P020IccreffS;

								private short ip65504P020IccreffL;


								private short ip65504P021IccrpctS;

								private short ip65504P021IccrpctL;


								private short ip65504P022RecurpyS;

								private short ip65504P022RecurpyL;


								private short ip65504P023TermTpS;

								private short ip65504P023TermTpL;


								private short ip65504P024NwkMngS;

								private short ip65504P024NwkMngL;


								private short ip65504P025RevIndS;

								private short ip65504P025RevIndL;


								private short ip65504P026FrevIndS;

								private short ip65504P026FrevIndL;


								private short ip65504P027ReservdS;

								private short ip65504P027ReservdL;


								private short ip65504P028ReservdS;

								private short ip65504P028ReservdL;


								private short ip65504P029ReservdS;

								private short ip65504P029ReservdL;


								private short ip65504P030ReservdS;

								private short ip65504P030ReservdL;


								private short ip65504P031ReservdS;

								private short ip65504P031ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup1
	**/
    public Ip65504PdsNamesLargeGroup1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P001MsgMdeS
	 *	@return ip65504P001MsgMdeS
	 */
	public short getIp65504P001MsgMdeS() throws CFException {
        if (isIp65504P001MsgMdeSModified()) { 
           ip65504P001MsgMdeS = refreshIp65504P001MsgMdeS();
        }
   		return ip65504P001MsgMdeS;
	}
	
	/**
	 * 	Update Ip65504P001MsgMdeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P001-MSG-MDE-S
	 *	@param number
	 */
	public void setIp65504P001MsgMdeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P001MsgMdeS = checkIp65504P001MsgMdeSMaxLimit(number); 
		serializeIp65504P001MsgMdeS(ip65504P001MsgMdeS);
	}

	public void setIp65504P001MsgMdeS(int number) {
	    number = checkIp65504P001MsgMdeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P001MsgMdeS((short)number);
	}
	public void setIp65504P001MsgMdeS(long number) {
	    number = checkIp65504P001MsgMdeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P001MsgMdeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P001MsgMdeL
	 *	@return ip65504P001MsgMdeL
	 */
	public short getIp65504P001MsgMdeL() throws CFException {
        if (isIp65504P001MsgMdeLModified()) { 
           ip65504P001MsgMdeL = refreshIp65504P001MsgMdeL();
        }
   		return ip65504P001MsgMdeL;
	}
	
	/**
	 * 	Update Ip65504P001MsgMdeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P001-MSG-MDE-L
	 *	@param number
	 */
	public void setIp65504P001MsgMdeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P001MsgMdeL = checkIp65504P001MsgMdeLMaxLimit(number); 
		serializeIp65504P001MsgMdeL(ip65504P001MsgMdeL);
	}

	public void setIp65504P001MsgMdeL(int number) {
	    number = checkIp65504P001MsgMdeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P001MsgMdeL((short)number);
	}
	public void setIp65504P001MsgMdeL(long number) {
	    number = checkIp65504P001MsgMdeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P001MsgMdeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P002MsgIndS
	 *	@return ip65504P002MsgIndS
	 */
	public short getIp65504P002MsgIndS() throws CFException {
        if (isIp65504P002MsgIndSModified()) { 
           ip65504P002MsgIndS = refreshIp65504P002MsgIndS();
        }
   		return ip65504P002MsgIndS;
	}
	
	/**
	 * 	Update Ip65504P002MsgIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P002-MSG-IND-S
	 *	@param number
	 */
	public void setIp65504P002MsgIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P002MsgIndS = checkIp65504P002MsgIndSMaxLimit(number); 
		serializeIp65504P002MsgIndS(ip65504P002MsgIndS);
	}

	public void setIp65504P002MsgIndS(int number) {
	    number = checkIp65504P002MsgIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P002MsgIndS((short)number);
	}
	public void setIp65504P002MsgIndS(long number) {
	    number = checkIp65504P002MsgIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P002MsgIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P002MsgIndL
	 *	@return ip65504P002MsgIndL
	 */
	public short getIp65504P002MsgIndL() throws CFException {
        if (isIp65504P002MsgIndLModified()) { 
           ip65504P002MsgIndL = refreshIp65504P002MsgIndL();
        }
   		return ip65504P002MsgIndL;
	}
	
	/**
	 * 	Update Ip65504P002MsgIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P002-MSG-IND-L
	 *	@param number
	 */
	public void setIp65504P002MsgIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P002MsgIndL = checkIp65504P002MsgIndLMaxLimit(number); 
		serializeIp65504P002MsgIndL(ip65504P002MsgIndL);
	}

	public void setIp65504P002MsgIndL(int number) {
	    number = checkIp65504P002MsgIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P002MsgIndL((short)number);
	}
	public void setIp65504P002MsgIndL(long number) {
	    number = checkIp65504P002MsgIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P002MsgIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P003OrigDtS
	 *	@return ip65504P003OrigDtS
	 */
	public short getIp65504P003OrigDtS() throws CFException {
        if (isIp65504P003OrigDtSModified()) { 
           ip65504P003OrigDtS = refreshIp65504P003OrigDtS();
        }
   		return ip65504P003OrigDtS;
	}
	
	/**
	 * 	Update Ip65504P003OrigDtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P003-ORIG-DT-S
	 *	@param number
	 */
	public void setIp65504P003OrigDtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P003OrigDtS = checkIp65504P003OrigDtSMaxLimit(number); 
		serializeIp65504P003OrigDtS(ip65504P003OrigDtS);
	}

	public void setIp65504P003OrigDtS(int number) {
	    number = checkIp65504P003OrigDtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P003OrigDtS((short)number);
	}
	public void setIp65504P003OrigDtS(long number) {
	    number = checkIp65504P003OrigDtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P003OrigDtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P003OrigDtL
	 *	@return ip65504P003OrigDtL
	 */
	public short getIp65504P003OrigDtL() throws CFException {
        if (isIp65504P003OrigDtLModified()) { 
           ip65504P003OrigDtL = refreshIp65504P003OrigDtL();
        }
   		return ip65504P003OrigDtL;
	}
	
	/**
	 * 	Update Ip65504P003OrigDtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P003-ORIG-DT-L
	 *	@param number
	 */
	public void setIp65504P003OrigDtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P003OrigDtL = checkIp65504P003OrigDtLMaxLimit(number); 
		serializeIp65504P003OrigDtL(ip65504P003OrigDtL);
	}

	public void setIp65504P003OrigDtL(int number) {
	    number = checkIp65504P003OrigDtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P003OrigDtL((short)number);
	}
	public void setIp65504P003OrigDtL(long number) {
	    number = checkIp65504P003OrigDtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P003OrigDtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P004NtwkAcS
	 *	@return ip65504P004NtwkAcS
	 */
	public short getIp65504P004NtwkAcS() throws CFException {
        if (isIp65504P004NtwkAcSModified()) { 
           ip65504P004NtwkAcS = refreshIp65504P004NtwkAcS();
        }
   		return ip65504P004NtwkAcS;
	}
	
	/**
	 * 	Update Ip65504P004NtwkAcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P004-NTWK-AC-S
	 *	@param number
	 */
	public void setIp65504P004NtwkAcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P004NtwkAcS = checkIp65504P004NtwkAcSMaxLimit(number); 
		serializeIp65504P004NtwkAcS(ip65504P004NtwkAcS);
	}

	public void setIp65504P004NtwkAcS(int number) {
	    number = checkIp65504P004NtwkAcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P004NtwkAcS((short)number);
	}
	public void setIp65504P004NtwkAcS(long number) {
	    number = checkIp65504P004NtwkAcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P004NtwkAcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P004NtwkAcL
	 *	@return ip65504P004NtwkAcL
	 */
	public short getIp65504P004NtwkAcL() throws CFException {
        if (isIp65504P004NtwkAcLModified()) { 
           ip65504P004NtwkAcL = refreshIp65504P004NtwkAcL();
        }
   		return ip65504P004NtwkAcL;
	}
	
	/**
	 * 	Update Ip65504P004NtwkAcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P004-NTWK-AC-L
	 *	@param number
	 */
	public void setIp65504P004NtwkAcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P004NtwkAcL = checkIp65504P004NtwkAcLMaxLimit(number); 
		serializeIp65504P004NtwkAcL(ip65504P004NtwkAcL);
	}

	public void setIp65504P004NtwkAcL(int number) {
	    number = checkIp65504P004NtwkAcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P004NtwkAcL((short)number);
	}
	public void setIp65504P004NtwkAcL(long number) {
	    number = checkIp65504P004NtwkAcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P004NtwkAcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P005MsgeridS
	 *	@return ip65504P005MsgeridS
	 */
	public short getIp65504P005MsgeridS() throws CFException {
        if (isIp65504P005MsgeridSModified()) { 
           ip65504P005MsgeridS = refreshIp65504P005MsgeridS();
        }
   		return ip65504P005MsgeridS;
	}
	
	/**
	 * 	Update Ip65504P005MsgeridS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P005-MSGERID-S
	 *	@param number
	 */
	public void setIp65504P005MsgeridS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P005MsgeridS = checkIp65504P005MsgeridSMaxLimit(number); 
		serializeIp65504P005MsgeridS(ip65504P005MsgeridS);
	}

	public void setIp65504P005MsgeridS(int number) {
	    number = checkIp65504P005MsgeridSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P005MsgeridS((short)number);
	}
	public void setIp65504P005MsgeridS(long number) {
	    number = checkIp65504P005MsgeridSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P005MsgeridS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P005MsgeridL
	 *	@return ip65504P005MsgeridL
	 */
	public short getIp65504P005MsgeridL() throws CFException {
        if (isIp65504P005MsgeridLModified()) { 
           ip65504P005MsgeridL = refreshIp65504P005MsgeridL();
        }
   		return ip65504P005MsgeridL;
	}
	
	/**
	 * 	Update Ip65504P005MsgeridL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P005-MSGERID-L
	 *	@param number
	 */
	public void setIp65504P005MsgeridL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P005MsgeridL = checkIp65504P005MsgeridLMaxLimit(number); 
		serializeIp65504P005MsgeridL(ip65504P005MsgeridL);
	}

	public void setIp65504P005MsgeridL(int number) {
	    number = checkIp65504P005MsgeridLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P005MsgeridL((short)number);
	}
	public void setIp65504P005MsgeridL(long number) {
	    number = checkIp65504P005MsgeridLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P005MsgeridL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P006ReservdS
	 *	@return ip65504P006ReservdS
	 */
	public short getIp65504P006ReservdS() throws CFException {
        if (isIp65504P006ReservdSModified()) { 
           ip65504P006ReservdS = refreshIp65504P006ReservdS();
        }
   		return ip65504P006ReservdS;
	}
	
	/**
	 * 	Update Ip65504P006ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P006-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P006ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P006ReservdS = checkIp65504P006ReservdSMaxLimit(number); 
		serializeIp65504P006ReservdS(ip65504P006ReservdS);
	}

	public void setIp65504P006ReservdS(int number) {
	    number = checkIp65504P006ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P006ReservdS((short)number);
	}
	public void setIp65504P006ReservdS(long number) {
	    number = checkIp65504P006ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P006ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P006ReservdL
	 *	@return ip65504P006ReservdL
	 */
	public short getIp65504P006ReservdL() throws CFException {
        if (isIp65504P006ReservdLModified()) { 
           ip65504P006ReservdL = refreshIp65504P006ReservdL();
        }
   		return ip65504P006ReservdL;
	}
	
	/**
	 * 	Update Ip65504P006ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P006-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P006ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P006ReservdL = checkIp65504P006ReservdLMaxLimit(number); 
		serializeIp65504P006ReservdL(ip65504P006ReservdL);
	}

	public void setIp65504P006ReservdL(int number) {
	    number = checkIp65504P006ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P006ReservdL((short)number);
	}
	public void setIp65504P006ReservdL(long number) {
	    number = checkIp65504P006ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P006ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P007ReservdS
	 *	@return ip65504P007ReservdS
	 */
	public short getIp65504P007ReservdS() throws CFException {
        if (isIp65504P007ReservdSModified()) { 
           ip65504P007ReservdS = refreshIp65504P007ReservdS();
        }
   		return ip65504P007ReservdS;
	}
	
	/**
	 * 	Update Ip65504P007ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P007-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P007ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P007ReservdS = checkIp65504P007ReservdSMaxLimit(number); 
		serializeIp65504P007ReservdS(ip65504P007ReservdS);
	}

	public void setIp65504P007ReservdS(int number) {
	    number = checkIp65504P007ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P007ReservdS((short)number);
	}
	public void setIp65504P007ReservdS(long number) {
	    number = checkIp65504P007ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P007ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P007ReservdL
	 *	@return ip65504P007ReservdL
	 */
	public short getIp65504P007ReservdL() throws CFException {
        if (isIp65504P007ReservdLModified()) { 
           ip65504P007ReservdL = refreshIp65504P007ReservdL();
        }
   		return ip65504P007ReservdL;
	}
	
	/**
	 * 	Update Ip65504P007ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P007-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P007ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P007ReservdL = checkIp65504P007ReservdLMaxLimit(number); 
		serializeIp65504P007ReservdL(ip65504P007ReservdL);
	}

	public void setIp65504P007ReservdL(int number) {
	    number = checkIp65504P007ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P007ReservdL((short)number);
	}
	public void setIp65504P007ReservdL(long number) {
	    number = checkIp65504P007ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P007ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P008ReservdS
	 *	@return ip65504P008ReservdS
	 */
	public short getIp65504P008ReservdS() throws CFException {
        if (isIp65504P008ReservdSModified()) { 
           ip65504P008ReservdS = refreshIp65504P008ReservdS();
        }
   		return ip65504P008ReservdS;
	}
	
	/**
	 * 	Update Ip65504P008ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P008-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P008ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P008ReservdS = checkIp65504P008ReservdSMaxLimit(number); 
		serializeIp65504P008ReservdS(ip65504P008ReservdS);
	}

	public void setIp65504P008ReservdS(int number) {
	    number = checkIp65504P008ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P008ReservdS((short)number);
	}
	public void setIp65504P008ReservdS(long number) {
	    number = checkIp65504P008ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P008ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P008ReservdL
	 *	@return ip65504P008ReservdL
	 */
	public short getIp65504P008ReservdL() throws CFException {
        if (isIp65504P008ReservdLModified()) { 
           ip65504P008ReservdL = refreshIp65504P008ReservdL();
        }
   		return ip65504P008ReservdL;
	}
	
	/**
	 * 	Update Ip65504P008ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P008-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P008ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P008ReservdL = checkIp65504P008ReservdLMaxLimit(number); 
		serializeIp65504P008ReservdL(ip65504P008ReservdL);
	}

	public void setIp65504P008ReservdL(int number) {
	    number = checkIp65504P008ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P008ReservdL((short)number);
	}
	public void setIp65504P008ReservdL(long number) {
	    number = checkIp65504P008ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P008ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P009ReservdS
	 *	@return ip65504P009ReservdS
	 */
	public short getIp65504P009ReservdS() throws CFException {
        if (isIp65504P009ReservdSModified()) { 
           ip65504P009ReservdS = refreshIp65504P009ReservdS();
        }
   		return ip65504P009ReservdS;
	}
	
	/**
	 * 	Update Ip65504P009ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P009-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P009ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P009ReservdS = checkIp65504P009ReservdSMaxLimit(number); 
		serializeIp65504P009ReservdS(ip65504P009ReservdS);
	}

	public void setIp65504P009ReservdS(int number) {
	    number = checkIp65504P009ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P009ReservdS((short)number);
	}
	public void setIp65504P009ReservdS(long number) {
	    number = checkIp65504P009ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P009ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P009ReservdL
	 *	@return ip65504P009ReservdL
	 */
	public short getIp65504P009ReservdL() throws CFException {
        if (isIp65504P009ReservdLModified()) { 
           ip65504P009ReservdL = refreshIp65504P009ReservdL();
        }
   		return ip65504P009ReservdL;
	}
	
	/**
	 * 	Update Ip65504P009ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P009-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P009ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P009ReservdL = checkIp65504P009ReservdLMaxLimit(number); 
		serializeIp65504P009ReservdL(ip65504P009ReservdL);
	}

	public void setIp65504P009ReservdL(int number) {
	    number = checkIp65504P009ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P009ReservdL((short)number);
	}
	public void setIp65504P009ReservdL(long number) {
	    number = checkIp65504P009ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P009ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P010ReservdS
	 *	@return ip65504P010ReservdS
	 */
	public short getIp65504P010ReservdS() throws CFException {
        if (isIp65504P010ReservdSModified()) { 
           ip65504P010ReservdS = refreshIp65504P010ReservdS();
        }
   		return ip65504P010ReservdS;
	}
	
	/**
	 * 	Update Ip65504P010ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P010-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P010ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P010ReservdS = checkIp65504P010ReservdSMaxLimit(number); 
		serializeIp65504P010ReservdS(ip65504P010ReservdS);
	}

	public void setIp65504P010ReservdS(int number) {
	    number = checkIp65504P010ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P010ReservdS((short)number);
	}
	public void setIp65504P010ReservdS(long number) {
	    number = checkIp65504P010ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P010ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P010ReservdL
	 *	@return ip65504P010ReservdL
	 */
	public short getIp65504P010ReservdL() throws CFException {
        if (isIp65504P010ReservdLModified()) { 
           ip65504P010ReservdL = refreshIp65504P010ReservdL();
        }
   		return ip65504P010ReservdL;
	}
	
	/**
	 * 	Update Ip65504P010ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P010-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P010ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P010ReservdL = checkIp65504P010ReservdLMaxLimit(number); 
		serializeIp65504P010ReservdL(ip65504P010ReservdL);
	}

	public void setIp65504P010ReservdL(int number) {
	    number = checkIp65504P010ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P010ReservdL((short)number);
	}
	public void setIp65504P010ReservdL(long number) {
	    number = checkIp65504P010ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P010ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P011ReservdS
	 *	@return ip65504P011ReservdS
	 */
	public short getIp65504P011ReservdS() throws CFException {
        if (isIp65504P011ReservdSModified()) { 
           ip65504P011ReservdS = refreshIp65504P011ReservdS();
        }
   		return ip65504P011ReservdS;
	}
	
	/**
	 * 	Update Ip65504P011ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P011-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P011ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P011ReservdS = checkIp65504P011ReservdSMaxLimit(number); 
		serializeIp65504P011ReservdS(ip65504P011ReservdS);
	}

	public void setIp65504P011ReservdS(int number) {
	    number = checkIp65504P011ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P011ReservdS((short)number);
	}
	public void setIp65504P011ReservdS(long number) {
	    number = checkIp65504P011ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P011ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P011ReservdL
	 *	@return ip65504P011ReservdL
	 */
	public short getIp65504P011ReservdL() throws CFException {
        if (isIp65504P011ReservdLModified()) { 
           ip65504P011ReservdL = refreshIp65504P011ReservdL();
        }
   		return ip65504P011ReservdL;
	}
	
	/**
	 * 	Update Ip65504P011ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P011-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P011ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P011ReservdL = checkIp65504P011ReservdLMaxLimit(number); 
		serializeIp65504P011ReservdL(ip65504P011ReservdL);
	}

	public void setIp65504P011ReservdL(int number) {
	    number = checkIp65504P011ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P011ReservdL((short)number);
	}
	public void setIp65504P011ReservdL(long number) {
	    number = checkIp65504P011ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P011ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P012ReservdS
	 *	@return ip65504P012ReservdS
	 */
	public short getIp65504P012ReservdS() throws CFException {
        if (isIp65504P012ReservdSModified()) { 
           ip65504P012ReservdS = refreshIp65504P012ReservdS();
        }
   		return ip65504P012ReservdS;
	}
	
	/**
	 * 	Update Ip65504P012ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P012-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P012ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P012ReservdS = checkIp65504P012ReservdSMaxLimit(number); 
		serializeIp65504P012ReservdS(ip65504P012ReservdS);
	}

	public void setIp65504P012ReservdS(int number) {
	    number = checkIp65504P012ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P012ReservdS((short)number);
	}
	public void setIp65504P012ReservdS(long number) {
	    number = checkIp65504P012ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P012ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P012ReservdL
	 *	@return ip65504P012ReservdL
	 */
	public short getIp65504P012ReservdL() throws CFException {
        if (isIp65504P012ReservdLModified()) { 
           ip65504P012ReservdL = refreshIp65504P012ReservdL();
        }
   		return ip65504P012ReservdL;
	}
	
	/**
	 * 	Update Ip65504P012ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P012-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P012ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P012ReservdL = checkIp65504P012ReservdLMaxLimit(number); 
		serializeIp65504P012ReservdL(ip65504P012ReservdL);
	}

	public void setIp65504P012ReservdL(int number) {
	    number = checkIp65504P012ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P012ReservdL((short)number);
	}
	public void setIp65504P012ReservdL(long number) {
	    number = checkIp65504P012ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P012ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P013PasswrdS
	 *	@return ip65504P013PasswrdS
	 */
	public short getIp65504P013PasswrdS() throws CFException {
        if (isIp65504P013PasswrdSModified()) { 
           ip65504P013PasswrdS = refreshIp65504P013PasswrdS();
        }
   		return ip65504P013PasswrdS;
	}
	
	/**
	 * 	Update Ip65504P013PasswrdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P013-PASSWRD-S
	 *	@param number
	 */
	public void setIp65504P013PasswrdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P013PasswrdS = checkIp65504P013PasswrdSMaxLimit(number); 
		serializeIp65504P013PasswrdS(ip65504P013PasswrdS);
	}

	public void setIp65504P013PasswrdS(int number) {
	    number = checkIp65504P013PasswrdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P013PasswrdS((short)number);
	}
	public void setIp65504P013PasswrdS(long number) {
	    number = checkIp65504P013PasswrdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P013PasswrdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P013PasswrdL
	 *	@return ip65504P013PasswrdL
	 */
	public short getIp65504P013PasswrdL() throws CFException {
        if (isIp65504P013PasswrdLModified()) { 
           ip65504P013PasswrdL = refreshIp65504P013PasswrdL();
        }
   		return ip65504P013PasswrdL;
	}
	
	/**
	 * 	Update Ip65504P013PasswrdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P013-PASSWRD-L
	 *	@param number
	 */
	public void setIp65504P013PasswrdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P013PasswrdL = checkIp65504P013PasswrdLMaxLimit(number); 
		serializeIp65504P013PasswrdL(ip65504P013PasswrdL);
	}

	public void setIp65504P013PasswrdL(int number) {
	    number = checkIp65504P013PasswrdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P013PasswrdL((short)number);
	}
	public void setIp65504P013PasswrdL(long number) {
	    number = checkIp65504P013PasswrdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P013PasswrdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P014ReservdS
	 *	@return ip65504P014ReservdS
	 */
	public short getIp65504P014ReservdS() throws CFException {
        if (isIp65504P014ReservdSModified()) { 
           ip65504P014ReservdS = refreshIp65504P014ReservdS();
        }
   		return ip65504P014ReservdS;
	}
	
	/**
	 * 	Update Ip65504P014ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P014-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P014ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P014ReservdS = checkIp65504P014ReservdSMaxLimit(number); 
		serializeIp65504P014ReservdS(ip65504P014ReservdS);
	}

	public void setIp65504P014ReservdS(int number) {
	    number = checkIp65504P014ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P014ReservdS((short)number);
	}
	public void setIp65504P014ReservdS(long number) {
	    number = checkIp65504P014ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P014ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P014ReservdL
	 *	@return ip65504P014ReservdL
	 */
	public short getIp65504P014ReservdL() throws CFException {
        if (isIp65504P014ReservdLModified()) { 
           ip65504P014ReservdL = refreshIp65504P014ReservdL();
        }
   		return ip65504P014ReservdL;
	}
	
	/**
	 * 	Update Ip65504P014ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P014-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P014ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P014ReservdL = checkIp65504P014ReservdLMaxLimit(number); 
		serializeIp65504P014ReservdL(ip65504P014ReservdL);
	}

	public void setIp65504P014ReservdL(int number) {
	    number = checkIp65504P014ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P014ReservdL((short)number);
	}
	public void setIp65504P014ReservdL(long number) {
	    number = checkIp65504P014ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P014ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P015ReservdS
	 *	@return ip65504P015ReservdS
	 */
	public short getIp65504P015ReservdS() throws CFException {
        if (isIp65504P015ReservdSModified()) { 
           ip65504P015ReservdS = refreshIp65504P015ReservdS();
        }
   		return ip65504P015ReservdS;
	}
	
	/**
	 * 	Update Ip65504P015ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P015-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P015ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P015ReservdS = checkIp65504P015ReservdSMaxLimit(number); 
		serializeIp65504P015ReservdS(ip65504P015ReservdS);
	}

	public void setIp65504P015ReservdS(int number) {
	    number = checkIp65504P015ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P015ReservdS((short)number);
	}
	public void setIp65504P015ReservdS(long number) {
	    number = checkIp65504P015ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P015ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P015ReservdL
	 *	@return ip65504P015ReservdL
	 */
	public short getIp65504P015ReservdL() throws CFException {
        if (isIp65504P015ReservdLModified()) { 
           ip65504P015ReservdL = refreshIp65504P015ReservdL();
        }
   		return ip65504P015ReservdL;
	}
	
	/**
	 * 	Update Ip65504P015ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P015-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P015ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P015ReservdL = checkIp65504P015ReservdLMaxLimit(number); 
		serializeIp65504P015ReservdL(ip65504P015ReservdL);
	}

	public void setIp65504P015ReservdL(int number) {
	    number = checkIp65504P015ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P015ReservdL((short)number);
	}
	public void setIp65504P015ReservdL(long number) {
	    number = checkIp65504P015ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P015ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P016TrxRefS
	 *	@return ip65504P016TrxRefS
	 */
	public short getIp65504P016TrxRefS() throws CFException {
        if (isIp65504P016TrxRefSModified()) { 
           ip65504P016TrxRefS = refreshIp65504P016TrxRefS();
        }
   		return ip65504P016TrxRefS;
	}
	
	/**
	 * 	Update Ip65504P016TrxRefS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P016-TRX-REF-S
	 *	@param number
	 */
	public void setIp65504P016TrxRefS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P016TrxRefS = checkIp65504P016TrxRefSMaxLimit(number); 
		serializeIp65504P016TrxRefS(ip65504P016TrxRefS);
	}

	public void setIp65504P016TrxRefS(int number) {
	    number = checkIp65504P016TrxRefSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P016TrxRefS((short)number);
	}
	public void setIp65504P016TrxRefS(long number) {
	    number = checkIp65504P016TrxRefSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P016TrxRefS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P016TrxRefL
	 *	@return ip65504P016TrxRefL
	 */
	public short getIp65504P016TrxRefL() throws CFException {
        if (isIp65504P016TrxRefLModified()) { 
           ip65504P016TrxRefL = refreshIp65504P016TrxRefL();
        }
   		return ip65504P016TrxRefL;
	}
	
	/**
	 * 	Update Ip65504P016TrxRefL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P016-TRX-REF-L
	 *	@param number
	 */
	public void setIp65504P016TrxRefL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P016TrxRefL = checkIp65504P016TrxRefLMaxLimit(number); 
		serializeIp65504P016TrxRefL(ip65504P016TrxRefL);
	}

	public void setIp65504P016TrxRefL(int number) {
	    number = checkIp65504P016TrxRefLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P016TrxRefL((short)number);
	}
	public void setIp65504P016TrxRefL(long number) {
	    number = checkIp65504P016TrxRefLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P016TrxRefL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P017ReservdS
	 *	@return ip65504P017ReservdS
	 */
	public short getIp65504P017ReservdS() throws CFException {
        if (isIp65504P017ReservdSModified()) { 
           ip65504P017ReservdS = refreshIp65504P017ReservdS();
        }
   		return ip65504P017ReservdS;
	}
	
	/**
	 * 	Update Ip65504P017ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P017-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P017ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P017ReservdS = checkIp65504P017ReservdSMaxLimit(number); 
		serializeIp65504P017ReservdS(ip65504P017ReservdS);
	}

	public void setIp65504P017ReservdS(int number) {
	    number = checkIp65504P017ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P017ReservdS((short)number);
	}
	public void setIp65504P017ReservdS(long number) {
	    number = checkIp65504P017ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P017ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P017ReservdL
	 *	@return ip65504P017ReservdL
	 */
	public short getIp65504P017ReservdL() throws CFException {
        if (isIp65504P017ReservdLModified()) { 
           ip65504P017ReservdL = refreshIp65504P017ReservdL();
        }
   		return ip65504P017ReservdL;
	}
	
	/**
	 * 	Update Ip65504P017ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P017-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P017ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P017ReservdL = checkIp65504P017ReservdLMaxLimit(number); 
		serializeIp65504P017ReservdL(ip65504P017ReservdL);
	}

	public void setIp65504P017ReservdL(int number) {
	    number = checkIp65504P017ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P017ReservdL((short)number);
	}
	public void setIp65504P017ReservdL(long number) {
	    number = checkIp65504P017ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P017ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P018ReservdS
	 *	@return ip65504P018ReservdS
	 */
	public short getIp65504P018ReservdS() throws CFException {
        if (isIp65504P018ReservdSModified()) { 
           ip65504P018ReservdS = refreshIp65504P018ReservdS();
        }
   		return ip65504P018ReservdS;
	}
	
	/**
	 * 	Update Ip65504P018ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P018-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P018ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P018ReservdS = checkIp65504P018ReservdSMaxLimit(number); 
		serializeIp65504P018ReservdS(ip65504P018ReservdS);
	}

	public void setIp65504P018ReservdS(int number) {
	    number = checkIp65504P018ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P018ReservdS((short)number);
	}
	public void setIp65504P018ReservdS(long number) {
	    number = checkIp65504P018ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P018ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P018ReservdL
	 *	@return ip65504P018ReservdL
	 */
	public short getIp65504P018ReservdL() throws CFException {
        if (isIp65504P018ReservdLModified()) { 
           ip65504P018ReservdL = refreshIp65504P018ReservdL();
        }
   		return ip65504P018ReservdL;
	}
	
	/**
	 * 	Update Ip65504P018ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P018-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P018ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P018ReservdL = checkIp65504P018ReservdLMaxLimit(number); 
		serializeIp65504P018ReservdL(ip65504P018ReservdL);
	}

	public void setIp65504P018ReservdL(int number) {
	    number = checkIp65504P018ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P018ReservdL((short)number);
	}
	public void setIp65504P018ReservdL(long number) {
	    number = checkIp65504P018ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P018ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P019ReservdS
	 *	@return ip65504P019ReservdS
	 */
	public short getIp65504P019ReservdS() throws CFException {
        if (isIp65504P019ReservdSModified()) { 
           ip65504P019ReservdS = refreshIp65504P019ReservdS();
        }
   		return ip65504P019ReservdS;
	}
	
	/**
	 * 	Update Ip65504P019ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P019-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P019ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P019ReservdS = checkIp65504P019ReservdSMaxLimit(number); 
		serializeIp65504P019ReservdS(ip65504P019ReservdS);
	}

	public void setIp65504P019ReservdS(int number) {
	    number = checkIp65504P019ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P019ReservdS((short)number);
	}
	public void setIp65504P019ReservdS(long number) {
	    number = checkIp65504P019ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P019ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P019ReservdL
	 *	@return ip65504P019ReservdL
	 */
	public short getIp65504P019ReservdL() throws CFException {
        if (isIp65504P019ReservdLModified()) { 
           ip65504P019ReservdL = refreshIp65504P019ReservdL();
        }
   		return ip65504P019ReservdL;
	}
	
	/**
	 * 	Update Ip65504P019ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P019-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P019ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P019ReservdL = checkIp65504P019ReservdLMaxLimit(number); 
		serializeIp65504P019ReservdL(ip65504P019ReservdL);
	}

	public void setIp65504P019ReservdL(int number) {
	    number = checkIp65504P019ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P019ReservdL((short)number);
	}
	public void setIp65504P019ReservdL(long number) {
	    number = checkIp65504P019ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P019ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P020IccreffS
	 *	@return ip65504P020IccreffS
	 */
	public short getIp65504P020IccreffS() throws CFException {
        if (isIp65504P020IccreffSModified()) { 
           ip65504P020IccreffS = refreshIp65504P020IccreffS();
        }
   		return ip65504P020IccreffS;
	}
	
	/**
	 * 	Update Ip65504P020IccreffS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P020-ICCREFF-S
	 *	@param number
	 */
	public void setIp65504P020IccreffS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P020IccreffS = checkIp65504P020IccreffSMaxLimit(number); 
		serializeIp65504P020IccreffS(ip65504P020IccreffS);
	}

	public void setIp65504P020IccreffS(int number) {
	    number = checkIp65504P020IccreffSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P020IccreffS((short)number);
	}
	public void setIp65504P020IccreffS(long number) {
	    number = checkIp65504P020IccreffSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P020IccreffS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P020IccreffL
	 *	@return ip65504P020IccreffL
	 */
	public short getIp65504P020IccreffL() throws CFException {
        if (isIp65504P020IccreffLModified()) { 
           ip65504P020IccreffL = refreshIp65504P020IccreffL();
        }
   		return ip65504P020IccreffL;
	}
	
	/**
	 * 	Update Ip65504P020IccreffL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P020-ICCREFF-L
	 *	@param number
	 */
	public void setIp65504P020IccreffL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P020IccreffL = checkIp65504P020IccreffLMaxLimit(number); 
		serializeIp65504P020IccreffL(ip65504P020IccreffL);
	}

	public void setIp65504P020IccreffL(int number) {
	    number = checkIp65504P020IccreffLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P020IccreffL((short)number);
	}
	public void setIp65504P020IccreffL(long number) {
	    number = checkIp65504P020IccreffLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P020IccreffL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P021IccrpctS
	 *	@return ip65504P021IccrpctS
	 */
	public short getIp65504P021IccrpctS() throws CFException {
        if (isIp65504P021IccrpctSModified()) { 
           ip65504P021IccrpctS = refreshIp65504P021IccrpctS();
        }
   		return ip65504P021IccrpctS;
	}
	
	/**
	 * 	Update Ip65504P021IccrpctS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P021-ICCRPCT-S
	 *	@param number
	 */
	public void setIp65504P021IccrpctS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P021IccrpctS = checkIp65504P021IccrpctSMaxLimit(number); 
		serializeIp65504P021IccrpctS(ip65504P021IccrpctS);
	}

	public void setIp65504P021IccrpctS(int number) {
	    number = checkIp65504P021IccrpctSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P021IccrpctS((short)number);
	}
	public void setIp65504P021IccrpctS(long number) {
	    number = checkIp65504P021IccrpctSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P021IccrpctS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P021IccrpctL
	 *	@return ip65504P021IccrpctL
	 */
	public short getIp65504P021IccrpctL() throws CFException {
        if (isIp65504P021IccrpctLModified()) { 
           ip65504P021IccrpctL = refreshIp65504P021IccrpctL();
        }
   		return ip65504P021IccrpctL;
	}
	
	/**
	 * 	Update Ip65504P021IccrpctL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P021-ICCRPCT-L
	 *	@param number
	 */
	public void setIp65504P021IccrpctL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P021IccrpctL = checkIp65504P021IccrpctLMaxLimit(number); 
		serializeIp65504P021IccrpctL(ip65504P021IccrpctL);
	}

	public void setIp65504P021IccrpctL(int number) {
	    number = checkIp65504P021IccrpctLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P021IccrpctL((short)number);
	}
	public void setIp65504P021IccrpctL(long number) {
	    number = checkIp65504P021IccrpctLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P021IccrpctL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P022RecurpyS
	 *	@return ip65504P022RecurpyS
	 */
	public short getIp65504P022RecurpyS() throws CFException {
        if (isIp65504P022RecurpySModified()) { 
           ip65504P022RecurpyS = refreshIp65504P022RecurpyS();
        }
   		return ip65504P022RecurpyS;
	}
	
	/**
	 * 	Update Ip65504P022RecurpyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P022-RECURPY-S
	 *	@param number
	 */
	public void setIp65504P022RecurpyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P022RecurpyS = checkIp65504P022RecurpySMaxLimit(number); 
		serializeIp65504P022RecurpyS(ip65504P022RecurpyS);
	}

	public void setIp65504P022RecurpyS(int number) {
	    number = checkIp65504P022RecurpySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P022RecurpyS((short)number);
	}
	public void setIp65504P022RecurpyS(long number) {
	    number = checkIp65504P022RecurpySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P022RecurpyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P022RecurpyL
	 *	@return ip65504P022RecurpyL
	 */
	public short getIp65504P022RecurpyL() throws CFException {
        if (isIp65504P022RecurpyLModified()) { 
           ip65504P022RecurpyL = refreshIp65504P022RecurpyL();
        }
   		return ip65504P022RecurpyL;
	}
	
	/**
	 * 	Update Ip65504P022RecurpyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P022-RECURPY-L
	 *	@param number
	 */
	public void setIp65504P022RecurpyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P022RecurpyL = checkIp65504P022RecurpyLMaxLimit(number); 
		serializeIp65504P022RecurpyL(ip65504P022RecurpyL);
	}

	public void setIp65504P022RecurpyL(int number) {
	    number = checkIp65504P022RecurpyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P022RecurpyL((short)number);
	}
	public void setIp65504P022RecurpyL(long number) {
	    number = checkIp65504P022RecurpyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P022RecurpyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P023TermTpS
	 *	@return ip65504P023TermTpS
	 */
	public short getIp65504P023TermTpS() throws CFException {
        if (isIp65504P023TermTpSModified()) { 
           ip65504P023TermTpS = refreshIp65504P023TermTpS();
        }
   		return ip65504P023TermTpS;
	}
	
	/**
	 * 	Update Ip65504P023TermTpS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P023-TERM-TP-S
	 *	@param number
	 */
	public void setIp65504P023TermTpS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P023TermTpS = checkIp65504P023TermTpSMaxLimit(number); 
		serializeIp65504P023TermTpS(ip65504P023TermTpS);
	}

	public void setIp65504P023TermTpS(int number) {
	    number = checkIp65504P023TermTpSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P023TermTpS((short)number);
	}
	public void setIp65504P023TermTpS(long number) {
	    number = checkIp65504P023TermTpSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P023TermTpS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P023TermTpL
	 *	@return ip65504P023TermTpL
	 */
	public short getIp65504P023TermTpL() throws CFException {
        if (isIp65504P023TermTpLModified()) { 
           ip65504P023TermTpL = refreshIp65504P023TermTpL();
        }
   		return ip65504P023TermTpL;
	}
	
	/**
	 * 	Update Ip65504P023TermTpL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P023-TERM-TP-L
	 *	@param number
	 */
	public void setIp65504P023TermTpL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P023TermTpL = checkIp65504P023TermTpLMaxLimit(number); 
		serializeIp65504P023TermTpL(ip65504P023TermTpL);
	}

	public void setIp65504P023TermTpL(int number) {
	    number = checkIp65504P023TermTpLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P023TermTpL((short)number);
	}
	public void setIp65504P023TermTpL(long number) {
	    number = checkIp65504P023TermTpLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P023TermTpL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P024NwkMngS
	 *	@return ip65504P024NwkMngS
	 */
	public short getIp65504P024NwkMngS() throws CFException {
        if (isIp65504P024NwkMngSModified()) { 
           ip65504P024NwkMngS = refreshIp65504P024NwkMngS();
        }
   		return ip65504P024NwkMngS;
	}
	
	/**
	 * 	Update Ip65504P024NwkMngS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P024-NWK-MNG-S
	 *	@param number
	 */
	public void setIp65504P024NwkMngS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P024NwkMngS = checkIp65504P024NwkMngSMaxLimit(number); 
		serializeIp65504P024NwkMngS(ip65504P024NwkMngS);
	}

	public void setIp65504P024NwkMngS(int number) {
	    number = checkIp65504P024NwkMngSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P024NwkMngS((short)number);
	}
	public void setIp65504P024NwkMngS(long number) {
	    number = checkIp65504P024NwkMngSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P024NwkMngS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P024NwkMngL
	 *	@return ip65504P024NwkMngL
	 */
	public short getIp65504P024NwkMngL() throws CFException {
        if (isIp65504P024NwkMngLModified()) { 
           ip65504P024NwkMngL = refreshIp65504P024NwkMngL();
        }
   		return ip65504P024NwkMngL;
	}
	
	/**
	 * 	Update Ip65504P024NwkMngL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P024-NWK-MNG-L
	 *	@param number
	 */
	public void setIp65504P024NwkMngL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P024NwkMngL = checkIp65504P024NwkMngLMaxLimit(number); 
		serializeIp65504P024NwkMngL(ip65504P024NwkMngL);
	}

	public void setIp65504P024NwkMngL(int number) {
	    number = checkIp65504P024NwkMngLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P024NwkMngL((short)number);
	}
	public void setIp65504P024NwkMngL(long number) {
	    number = checkIp65504P024NwkMngLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P024NwkMngL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P025RevIndS
	 *	@return ip65504P025RevIndS
	 */
	public short getIp65504P025RevIndS() throws CFException {
        if (isIp65504P025RevIndSModified()) { 
           ip65504P025RevIndS = refreshIp65504P025RevIndS();
        }
   		return ip65504P025RevIndS;
	}
	
	/**
	 * 	Update Ip65504P025RevIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P025-REV-IND-S
	 *	@param number
	 */
	public void setIp65504P025RevIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P025RevIndS = checkIp65504P025RevIndSMaxLimit(number); 
		serializeIp65504P025RevIndS(ip65504P025RevIndS);
	}

	public void setIp65504P025RevIndS(int number) {
	    number = checkIp65504P025RevIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P025RevIndS((short)number);
	}
	public void setIp65504P025RevIndS(long number) {
	    number = checkIp65504P025RevIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P025RevIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P025RevIndL
	 *	@return ip65504P025RevIndL
	 */
	public short getIp65504P025RevIndL() throws CFException {
        if (isIp65504P025RevIndLModified()) { 
           ip65504P025RevIndL = refreshIp65504P025RevIndL();
        }
   		return ip65504P025RevIndL;
	}
	
	/**
	 * 	Update Ip65504P025RevIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P025-REV-IND-L
	 *	@param number
	 */
	public void setIp65504P025RevIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P025RevIndL = checkIp65504P025RevIndLMaxLimit(number); 
		serializeIp65504P025RevIndL(ip65504P025RevIndL);
	}

	public void setIp65504P025RevIndL(int number) {
	    number = checkIp65504P025RevIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P025RevIndL((short)number);
	}
	public void setIp65504P025RevIndL(long number) {
	    number = checkIp65504P025RevIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P025RevIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P026FrevIndS
	 *	@return ip65504P026FrevIndS
	 */
	public short getIp65504P026FrevIndS() throws CFException {
        if (isIp65504P026FrevIndSModified()) { 
           ip65504P026FrevIndS = refreshIp65504P026FrevIndS();
        }
   		return ip65504P026FrevIndS;
	}
	
	/**
	 * 	Update Ip65504P026FrevIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P026-FREV-IND-S
	 *	@param number
	 */
	public void setIp65504P026FrevIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P026FrevIndS = checkIp65504P026FrevIndSMaxLimit(number); 
		serializeIp65504P026FrevIndS(ip65504P026FrevIndS);
	}

	public void setIp65504P026FrevIndS(int number) {
	    number = checkIp65504P026FrevIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P026FrevIndS((short)number);
	}
	public void setIp65504P026FrevIndS(long number) {
	    number = checkIp65504P026FrevIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P026FrevIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P026FrevIndL
	 *	@return ip65504P026FrevIndL
	 */
	public short getIp65504P026FrevIndL() throws CFException {
        if (isIp65504P026FrevIndLModified()) { 
           ip65504P026FrevIndL = refreshIp65504P026FrevIndL();
        }
   		return ip65504P026FrevIndL;
	}
	
	/**
	 * 	Update Ip65504P026FrevIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P026-FREV-IND-L
	 *	@param number
	 */
	public void setIp65504P026FrevIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P026FrevIndL = checkIp65504P026FrevIndLMaxLimit(number); 
		serializeIp65504P026FrevIndL(ip65504P026FrevIndL);
	}

	public void setIp65504P026FrevIndL(int number) {
	    number = checkIp65504P026FrevIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P026FrevIndL((short)number);
	}
	public void setIp65504P026FrevIndL(long number) {
	    number = checkIp65504P026FrevIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P026FrevIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P027ReservdS
	 *	@return ip65504P027ReservdS
	 */
	public short getIp65504P027ReservdS() throws CFException {
        if (isIp65504P027ReservdSModified()) { 
           ip65504P027ReservdS = refreshIp65504P027ReservdS();
        }
   		return ip65504P027ReservdS;
	}
	
	/**
	 * 	Update Ip65504P027ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P027-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P027ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P027ReservdS = checkIp65504P027ReservdSMaxLimit(number); 
		serializeIp65504P027ReservdS(ip65504P027ReservdS);
	}

	public void setIp65504P027ReservdS(int number) {
	    number = checkIp65504P027ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P027ReservdS((short)number);
	}
	public void setIp65504P027ReservdS(long number) {
	    number = checkIp65504P027ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P027ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P027ReservdL
	 *	@return ip65504P027ReservdL
	 */
	public short getIp65504P027ReservdL() throws CFException {
        if (isIp65504P027ReservdLModified()) { 
           ip65504P027ReservdL = refreshIp65504P027ReservdL();
        }
   		return ip65504P027ReservdL;
	}
	
	/**
	 * 	Update Ip65504P027ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P027-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P027ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P027ReservdL = checkIp65504P027ReservdLMaxLimit(number); 
		serializeIp65504P027ReservdL(ip65504P027ReservdL);
	}

	public void setIp65504P027ReservdL(int number) {
	    number = checkIp65504P027ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P027ReservdL((short)number);
	}
	public void setIp65504P027ReservdL(long number) {
	    number = checkIp65504P027ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P027ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P028ReservdS
	 *	@return ip65504P028ReservdS
	 */
	public short getIp65504P028ReservdS() throws CFException {
        if (isIp65504P028ReservdSModified()) { 
           ip65504P028ReservdS = refreshIp65504P028ReservdS();
        }
   		return ip65504P028ReservdS;
	}
	
	/**
	 * 	Update Ip65504P028ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P028-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P028ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P028ReservdS = checkIp65504P028ReservdSMaxLimit(number); 
		serializeIp65504P028ReservdS(ip65504P028ReservdS);
	}

	public void setIp65504P028ReservdS(int number) {
	    number = checkIp65504P028ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P028ReservdS((short)number);
	}
	public void setIp65504P028ReservdS(long number) {
	    number = checkIp65504P028ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P028ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P028ReservdL
	 *	@return ip65504P028ReservdL
	 */
	public short getIp65504P028ReservdL() throws CFException {
        if (isIp65504P028ReservdLModified()) { 
           ip65504P028ReservdL = refreshIp65504P028ReservdL();
        }
   		return ip65504P028ReservdL;
	}
	
	/**
	 * 	Update Ip65504P028ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P028-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P028ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P028ReservdL = checkIp65504P028ReservdLMaxLimit(number); 
		serializeIp65504P028ReservdL(ip65504P028ReservdL);
	}

	public void setIp65504P028ReservdL(int number) {
	    number = checkIp65504P028ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P028ReservdL((short)number);
	}
	public void setIp65504P028ReservdL(long number) {
	    number = checkIp65504P028ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P028ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P029ReservdS
	 *	@return ip65504P029ReservdS
	 */
	public short getIp65504P029ReservdS() throws CFException {
        if (isIp65504P029ReservdSModified()) { 
           ip65504P029ReservdS = refreshIp65504P029ReservdS();
        }
   		return ip65504P029ReservdS;
	}
	
	/**
	 * 	Update Ip65504P029ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P029-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P029ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P029ReservdS = checkIp65504P029ReservdSMaxLimit(number); 
		serializeIp65504P029ReservdS(ip65504P029ReservdS);
	}

	public void setIp65504P029ReservdS(int number) {
	    number = checkIp65504P029ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P029ReservdS((short)number);
	}
	public void setIp65504P029ReservdS(long number) {
	    number = checkIp65504P029ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P029ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P029ReservdL
	 *	@return ip65504P029ReservdL
	 */
	public short getIp65504P029ReservdL() throws CFException {
        if (isIp65504P029ReservdLModified()) { 
           ip65504P029ReservdL = refreshIp65504P029ReservdL();
        }
   		return ip65504P029ReservdL;
	}
	
	/**
	 * 	Update Ip65504P029ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P029-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P029ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P029ReservdL = checkIp65504P029ReservdLMaxLimit(number); 
		serializeIp65504P029ReservdL(ip65504P029ReservdL);
	}

	public void setIp65504P029ReservdL(int number) {
	    number = checkIp65504P029ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P029ReservdL((short)number);
	}
	public void setIp65504P029ReservdL(long number) {
	    number = checkIp65504P029ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P029ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P030ReservdS
	 *	@return ip65504P030ReservdS
	 */
	public short getIp65504P030ReservdS() throws CFException {
        if (isIp65504P030ReservdSModified()) { 
           ip65504P030ReservdS = refreshIp65504P030ReservdS();
        }
   		return ip65504P030ReservdS;
	}
	
	/**
	 * 	Update Ip65504P030ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P030-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P030ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P030ReservdS = checkIp65504P030ReservdSMaxLimit(number); 
		serializeIp65504P030ReservdS(ip65504P030ReservdS);
	}

	public void setIp65504P030ReservdS(int number) {
	    number = checkIp65504P030ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P030ReservdS((short)number);
	}
	public void setIp65504P030ReservdS(long number) {
	    number = checkIp65504P030ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P030ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P030ReservdL
	 *	@return ip65504P030ReservdL
	 */
	public short getIp65504P030ReservdL() throws CFException {
        if (isIp65504P030ReservdLModified()) { 
           ip65504P030ReservdL = refreshIp65504P030ReservdL();
        }
   		return ip65504P030ReservdL;
	}
	
	/**
	 * 	Update Ip65504P030ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P030-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P030ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P030ReservdL = checkIp65504P030ReservdLMaxLimit(number); 
		serializeIp65504P030ReservdL(ip65504P030ReservdL);
	}

	public void setIp65504P030ReservdL(int number) {
	    number = checkIp65504P030ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P030ReservdL((short)number);
	}
	public void setIp65504P030ReservdL(long number) {
	    number = checkIp65504P030ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P030ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P031ReservdS
	 *	@return ip65504P031ReservdS
	 */
	public short getIp65504P031ReservdS() throws CFException {
        if (isIp65504P031ReservdSModified()) { 
           ip65504P031ReservdS = refreshIp65504P031ReservdS();
        }
   		return ip65504P031ReservdS;
	}
	
	/**
	 * 	Update Ip65504P031ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P031-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P031ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P031ReservdS = checkIp65504P031ReservdSMaxLimit(number); 
		serializeIp65504P031ReservdS(ip65504P031ReservdS);
	}

	public void setIp65504P031ReservdS(int number) {
	    number = checkIp65504P031ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P031ReservdS((short)number);
	}
	public void setIp65504P031ReservdS(long number) {
	    number = checkIp65504P031ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P031ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P031ReservdL
	 *	@return ip65504P031ReservdL
	 */
	public short getIp65504P031ReservdL() throws CFException {
        if (isIp65504P031ReservdLModified()) { 
           ip65504P031ReservdL = refreshIp65504P031ReservdL();
        }
   		return ip65504P031ReservdL;
	}
	
	/**
	 * 	Update Ip65504P031ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P031-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P031ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P031ReservdL = checkIp65504P031ReservdLMaxLimit(number); 
		serializeIp65504P031ReservdL(ip65504P031ReservdL);
	}

	public void setIp65504P031ReservdL(int number) {
	    number = checkIp65504P031ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P031ReservdL((short)number);
	}
	public void setIp65504P031ReservdL(long number) {
	    number = checkIp65504P031ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P031ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P001MsgMdeS((short)0);
         	setIp65504P001MsgMdeL((short)0);
         	setIp65504P002MsgIndS((short)0);
         	setIp65504P002MsgIndL((short)0);
         	setIp65504P003OrigDtS((short)0);
         	setIp65504P003OrigDtL((short)0);
         	setIp65504P004NtwkAcS((short)0);
         	setIp65504P004NtwkAcL((short)0);
         	setIp65504P005MsgeridS((short)0);
         	setIp65504P005MsgeridL((short)0);
         	setIp65504P006ReservdS((short)0);
         	setIp65504P006ReservdL((short)0);
         	setIp65504P007ReservdS((short)0);
         	setIp65504P007ReservdL((short)0);
         	setIp65504P008ReservdS((short)0);
         	setIp65504P008ReservdL((short)0);
         	setIp65504P009ReservdS((short)0);
         	setIp65504P009ReservdL((short)0);
         	setIp65504P010ReservdS((short)0);
         	setIp65504P010ReservdL((short)0);
         	setIp65504P011ReservdS((short)0);
         	setIp65504P011ReservdL((short)0);
         	setIp65504P012ReservdS((short)0);
         	setIp65504P012ReservdL((short)0);
         	setIp65504P013PasswrdS((short)0);
         	setIp65504P013PasswrdL((short)0);
         	setIp65504P014ReservdS((short)0);
         	setIp65504P014ReservdL((short)0);
         	setIp65504P015ReservdS((short)0);
         	setIp65504P015ReservdL((short)0);
         	setIp65504P016TrxRefS((short)0);
         	setIp65504P016TrxRefL((short)0);
         	setIp65504P017ReservdS((short)0);
         	setIp65504P017ReservdL((short)0);
         	setIp65504P018ReservdS((short)0);
         	setIp65504P018ReservdL((short)0);
         	setIp65504P019ReservdS((short)0);
         	setIp65504P019ReservdL((short)0);
         	setIp65504P020IccreffS((short)0);
         	setIp65504P020IccreffL((short)0);
         	setIp65504P021IccrpctS((short)0);
         	setIp65504P021IccrpctL((short)0);
         	setIp65504P022RecurpyS((short)0);
         	setIp65504P022RecurpyL((short)0);
         	setIp65504P023TermTpS((short)0);
         	setIp65504P023TermTpL((short)0);
         	setIp65504P024NwkMngS((short)0);
         	setIp65504P024NwkMngL((short)0);
         	setIp65504P025RevIndS((short)0);
         	setIp65504P025RevIndL((short)0);
         	setIp65504P026FrevIndS((short)0);
         	setIp65504P026FrevIndL((short)0);
         	setIp65504P027ReservdS((short)0);
         	setIp65504P027ReservdL((short)0);
         	setIp65504P028ReservdS((short)0);
         	setIp65504P028ReservdL((short)0);
         	setIp65504P029ReservdS((short)0);
         	setIp65504P029ReservdL((short)0);
         	setIp65504P030ReservdS((short)0);
         	setIp65504P030ReservdL((short)0);
         	setIp65504P031ReservdS((short)0);
         	setIp65504P031ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup1FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_1_LENGTH;
		}

}
  
