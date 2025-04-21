package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup17 extends Ip65504PdsNamesLargeGroup17Serialized { 
   

								private short ip65504P497ReservdS;

								private short ip65504P497ReservdL;


								private short ip65504P498ReservdS;

								private short ip65504P498ReservdL;


								private short ip65504P499ReservdS;

								private short ip65504P499ReservdL;


								private short ip65504P500ReservdS;

								private short ip65504P500ReservdL;


								private short ip65504P501TrxDesS;

								private short ip65504P501TrxDesL;


								private short ip65504P502ReservdS;

								private short ip65504P502ReservdL;


								private short ip65504P503ReservdS;

								private short ip65504P503ReservdL;


								private short ip65504P504ReservdS;

								private short ip65504P504ReservdL;


								private short ip65504P505PassNmS;

								private short ip65504P505PassNmL;


								private short ip65504P506TktNbrS;

								private short ip65504P506TktNbrL;


								private short ip65504P507IssCarS;

								private short ip65504P507IssCarL;


								private short ip65504P508CustCdS;

								private short ip65504P508CustCdL;


								private short ip65504P509IssDteS;

								private short ip65504P509IssDteL;


								private short ip65504P510AgcyCdS;

								private short ip65504P510AgcyCdL;


								private short ip65504P511AgcyNmS;

								private short ip65504P511AgcyNmL;


								private short ip65504P512TtlFarS;

								private short ip65504P512TtlFarL;


								private short ip65504P513TtlFeeS;

								private short ip65504P513TtlFeeL;


								private short ip65504P514TtlTaxS;

								private short ip65504P514TtlTaxL;


								private short ip65504P515ReservdS;

								private short ip65504P515ReservdL;


								private short ip65504P516ReservdS;

								private short ip65504P516ReservdL;


								private short ip65504P517ReservdS;

								private short ip65504P517ReservdL;


								private short ip65504P518ReservdS;

								private short ip65504P518ReservdL;


								private short ip65504P519ReservdS;

								private short ip65504P519ReservdL;


								private short ip65504P520TravldtS;

								private short ip65504P520TravldtL;


								private short ip65504P521CarrCdS;

								private short ip65504P521CarrCdL;


								private short ip65504P522ServCdS;

								private short ip65504P522ServCdL;


								private short ip65504P523OrgCtyS;

								private short ip65504P523OrgCtyL;


								private short ip65504P524DesCtyS;

								private short ip65504P524DesCtyL;


								private short ip65504P525StopCdS;

								private short ip65504P525StopCdL;


								private short ip65504P526ConjTkS;

								private short ip65504P526ConjTkL;


								private short ip65504P527ExchTkS;

								private short ip65504P527ExchTkL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup17
	**/
    public Ip65504PdsNamesLargeGroup17() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup17. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup17(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P497ReservdS
	 *	@return ip65504P497ReservdS
	 */
	public short getIp65504P497ReservdS() throws CFException {
        if (isIp65504P497ReservdSModified()) { 
           ip65504P497ReservdS = refreshIp65504P497ReservdS();
        }
   		return ip65504P497ReservdS;
	}
	
	/**
	 * 	Update Ip65504P497ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P497-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P497ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P497ReservdS = checkIp65504P497ReservdSMaxLimit(number); 
		serializeIp65504P497ReservdS(ip65504P497ReservdS);
	}

	public void setIp65504P497ReservdS(int number) {
	    number = checkIp65504P497ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P497ReservdS((short)number);
	}
	public void setIp65504P497ReservdS(long number) {
	    number = checkIp65504P497ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P497ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P497ReservdL
	 *	@return ip65504P497ReservdL
	 */
	public short getIp65504P497ReservdL() throws CFException {
        if (isIp65504P497ReservdLModified()) { 
           ip65504P497ReservdL = refreshIp65504P497ReservdL();
        }
   		return ip65504P497ReservdL;
	}
	
	/**
	 * 	Update Ip65504P497ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P497-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P497ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P497ReservdL = checkIp65504P497ReservdLMaxLimit(number); 
		serializeIp65504P497ReservdL(ip65504P497ReservdL);
	}

	public void setIp65504P497ReservdL(int number) {
	    number = checkIp65504P497ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P497ReservdL((short)number);
	}
	public void setIp65504P497ReservdL(long number) {
	    number = checkIp65504P497ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P497ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P498ReservdS
	 *	@return ip65504P498ReservdS
	 */
	public short getIp65504P498ReservdS() throws CFException {
        if (isIp65504P498ReservdSModified()) { 
           ip65504P498ReservdS = refreshIp65504P498ReservdS();
        }
   		return ip65504P498ReservdS;
	}
	
	/**
	 * 	Update Ip65504P498ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P498-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P498ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P498ReservdS = checkIp65504P498ReservdSMaxLimit(number); 
		serializeIp65504P498ReservdS(ip65504P498ReservdS);
	}

	public void setIp65504P498ReservdS(int number) {
	    number = checkIp65504P498ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P498ReservdS((short)number);
	}
	public void setIp65504P498ReservdS(long number) {
	    number = checkIp65504P498ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P498ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P498ReservdL
	 *	@return ip65504P498ReservdL
	 */
	public short getIp65504P498ReservdL() throws CFException {
        if (isIp65504P498ReservdLModified()) { 
           ip65504P498ReservdL = refreshIp65504P498ReservdL();
        }
   		return ip65504P498ReservdL;
	}
	
	/**
	 * 	Update Ip65504P498ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P498-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P498ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P498ReservdL = checkIp65504P498ReservdLMaxLimit(number); 
		serializeIp65504P498ReservdL(ip65504P498ReservdL);
	}

	public void setIp65504P498ReservdL(int number) {
	    number = checkIp65504P498ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P498ReservdL((short)number);
	}
	public void setIp65504P498ReservdL(long number) {
	    number = checkIp65504P498ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P498ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P499ReservdS
	 *	@return ip65504P499ReservdS
	 */
	public short getIp65504P499ReservdS() throws CFException {
        if (isIp65504P499ReservdSModified()) { 
           ip65504P499ReservdS = refreshIp65504P499ReservdS();
        }
   		return ip65504P499ReservdS;
	}
	
	/**
	 * 	Update Ip65504P499ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P499-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P499ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P499ReservdS = checkIp65504P499ReservdSMaxLimit(number); 
		serializeIp65504P499ReservdS(ip65504P499ReservdS);
	}

	public void setIp65504P499ReservdS(int number) {
	    number = checkIp65504P499ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P499ReservdS((short)number);
	}
	public void setIp65504P499ReservdS(long number) {
	    number = checkIp65504P499ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P499ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P499ReservdL
	 *	@return ip65504P499ReservdL
	 */
	public short getIp65504P499ReservdL() throws CFException {
        if (isIp65504P499ReservdLModified()) { 
           ip65504P499ReservdL = refreshIp65504P499ReservdL();
        }
   		return ip65504P499ReservdL;
	}
	
	/**
	 * 	Update Ip65504P499ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P499-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P499ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P499ReservdL = checkIp65504P499ReservdLMaxLimit(number); 
		serializeIp65504P499ReservdL(ip65504P499ReservdL);
	}

	public void setIp65504P499ReservdL(int number) {
	    number = checkIp65504P499ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P499ReservdL((short)number);
	}
	public void setIp65504P499ReservdL(long number) {
	    number = checkIp65504P499ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P499ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P500ReservdS
	 *	@return ip65504P500ReservdS
	 */
	public short getIp65504P500ReservdS() throws CFException {
        if (isIp65504P500ReservdSModified()) { 
           ip65504P500ReservdS = refreshIp65504P500ReservdS();
        }
   		return ip65504P500ReservdS;
	}
	
	/**
	 * 	Update Ip65504P500ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P500-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P500ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P500ReservdS = checkIp65504P500ReservdSMaxLimit(number); 
		serializeIp65504P500ReservdS(ip65504P500ReservdS);
	}

	public void setIp65504P500ReservdS(int number) {
	    number = checkIp65504P500ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P500ReservdS((short)number);
	}
	public void setIp65504P500ReservdS(long number) {
	    number = checkIp65504P500ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P500ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P500ReservdL
	 *	@return ip65504P500ReservdL
	 */
	public short getIp65504P500ReservdL() throws CFException {
        if (isIp65504P500ReservdLModified()) { 
           ip65504P500ReservdL = refreshIp65504P500ReservdL();
        }
   		return ip65504P500ReservdL;
	}
	
	/**
	 * 	Update Ip65504P500ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P500-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P500ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P500ReservdL = checkIp65504P500ReservdLMaxLimit(number); 
		serializeIp65504P500ReservdL(ip65504P500ReservdL);
	}

	public void setIp65504P500ReservdL(int number) {
	    number = checkIp65504P500ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P500ReservdL((short)number);
	}
	public void setIp65504P500ReservdL(long number) {
	    number = checkIp65504P500ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P500ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P501TrxDesS
	 *	@return ip65504P501TrxDesS
	 */
	public short getIp65504P501TrxDesS() throws CFException {
        if (isIp65504P501TrxDesSModified()) { 
           ip65504P501TrxDesS = refreshIp65504P501TrxDesS();
        }
   		return ip65504P501TrxDesS;
	}
	
	/**
	 * 	Update Ip65504P501TrxDesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P501-TRX-DES-S
	 *	@param number
	 */
	public void setIp65504P501TrxDesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P501TrxDesS = checkIp65504P501TrxDesSMaxLimit(number); 
		serializeIp65504P501TrxDesS(ip65504P501TrxDesS);
	}

	public void setIp65504P501TrxDesS(int number) {
	    number = checkIp65504P501TrxDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P501TrxDesS((short)number);
	}
	public void setIp65504P501TrxDesS(long number) {
	    number = checkIp65504P501TrxDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P501TrxDesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P501TrxDesL
	 *	@return ip65504P501TrxDesL
	 */
	public short getIp65504P501TrxDesL() throws CFException {
        if (isIp65504P501TrxDesLModified()) { 
           ip65504P501TrxDesL = refreshIp65504P501TrxDesL();
        }
   		return ip65504P501TrxDesL;
	}
	
	/**
	 * 	Update Ip65504P501TrxDesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P501-TRX-DES-L
	 *	@param number
	 */
	public void setIp65504P501TrxDesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P501TrxDesL = checkIp65504P501TrxDesLMaxLimit(number); 
		serializeIp65504P501TrxDesL(ip65504P501TrxDesL);
	}

	public void setIp65504P501TrxDesL(int number) {
	    number = checkIp65504P501TrxDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P501TrxDesL((short)number);
	}
	public void setIp65504P501TrxDesL(long number) {
	    number = checkIp65504P501TrxDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P501TrxDesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P502ReservdS
	 *	@return ip65504P502ReservdS
	 */
	public short getIp65504P502ReservdS() throws CFException {
        if (isIp65504P502ReservdSModified()) { 
           ip65504P502ReservdS = refreshIp65504P502ReservdS();
        }
   		return ip65504P502ReservdS;
	}
	
	/**
	 * 	Update Ip65504P502ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P502-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P502ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P502ReservdS = checkIp65504P502ReservdSMaxLimit(number); 
		serializeIp65504P502ReservdS(ip65504P502ReservdS);
	}

	public void setIp65504P502ReservdS(int number) {
	    number = checkIp65504P502ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P502ReservdS((short)number);
	}
	public void setIp65504P502ReservdS(long number) {
	    number = checkIp65504P502ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P502ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P502ReservdL
	 *	@return ip65504P502ReservdL
	 */
	public short getIp65504P502ReservdL() throws CFException {
        if (isIp65504P502ReservdLModified()) { 
           ip65504P502ReservdL = refreshIp65504P502ReservdL();
        }
   		return ip65504P502ReservdL;
	}
	
	/**
	 * 	Update Ip65504P502ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P502-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P502ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P502ReservdL = checkIp65504P502ReservdLMaxLimit(number); 
		serializeIp65504P502ReservdL(ip65504P502ReservdL);
	}

	public void setIp65504P502ReservdL(int number) {
	    number = checkIp65504P502ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P502ReservdL((short)number);
	}
	public void setIp65504P502ReservdL(long number) {
	    number = checkIp65504P502ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P502ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P503ReservdS
	 *	@return ip65504P503ReservdS
	 */
	public short getIp65504P503ReservdS() throws CFException {
        if (isIp65504P503ReservdSModified()) { 
           ip65504P503ReservdS = refreshIp65504P503ReservdS();
        }
   		return ip65504P503ReservdS;
	}
	
	/**
	 * 	Update Ip65504P503ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P503-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P503ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P503ReservdS = checkIp65504P503ReservdSMaxLimit(number); 
		serializeIp65504P503ReservdS(ip65504P503ReservdS);
	}

	public void setIp65504P503ReservdS(int number) {
	    number = checkIp65504P503ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P503ReservdS((short)number);
	}
	public void setIp65504P503ReservdS(long number) {
	    number = checkIp65504P503ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P503ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P503ReservdL
	 *	@return ip65504P503ReservdL
	 */
	public short getIp65504P503ReservdL() throws CFException {
        if (isIp65504P503ReservdLModified()) { 
           ip65504P503ReservdL = refreshIp65504P503ReservdL();
        }
   		return ip65504P503ReservdL;
	}
	
	/**
	 * 	Update Ip65504P503ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P503-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P503ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P503ReservdL = checkIp65504P503ReservdLMaxLimit(number); 
		serializeIp65504P503ReservdL(ip65504P503ReservdL);
	}

	public void setIp65504P503ReservdL(int number) {
	    number = checkIp65504P503ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P503ReservdL((short)number);
	}
	public void setIp65504P503ReservdL(long number) {
	    number = checkIp65504P503ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P503ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P504ReservdS
	 *	@return ip65504P504ReservdS
	 */
	public short getIp65504P504ReservdS() throws CFException {
        if (isIp65504P504ReservdSModified()) { 
           ip65504P504ReservdS = refreshIp65504P504ReservdS();
        }
   		return ip65504P504ReservdS;
	}
	
	/**
	 * 	Update Ip65504P504ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P504-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P504ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P504ReservdS = checkIp65504P504ReservdSMaxLimit(number); 
		serializeIp65504P504ReservdS(ip65504P504ReservdS);
	}

	public void setIp65504P504ReservdS(int number) {
	    number = checkIp65504P504ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P504ReservdS((short)number);
	}
	public void setIp65504P504ReservdS(long number) {
	    number = checkIp65504P504ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P504ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P504ReservdL
	 *	@return ip65504P504ReservdL
	 */
	public short getIp65504P504ReservdL() throws CFException {
        if (isIp65504P504ReservdLModified()) { 
           ip65504P504ReservdL = refreshIp65504P504ReservdL();
        }
   		return ip65504P504ReservdL;
	}
	
	/**
	 * 	Update Ip65504P504ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P504-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P504ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P504ReservdL = checkIp65504P504ReservdLMaxLimit(number); 
		serializeIp65504P504ReservdL(ip65504P504ReservdL);
	}

	public void setIp65504P504ReservdL(int number) {
	    number = checkIp65504P504ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P504ReservdL((short)number);
	}
	public void setIp65504P504ReservdL(long number) {
	    number = checkIp65504P504ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P504ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P505PassNmS
	 *	@return ip65504P505PassNmS
	 */
	public short getIp65504P505PassNmS() throws CFException {
        if (isIp65504P505PassNmSModified()) { 
           ip65504P505PassNmS = refreshIp65504P505PassNmS();
        }
   		return ip65504P505PassNmS;
	}
	
	/**
	 * 	Update Ip65504P505PassNmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P505-PASS-NM-S
	 *	@param number
	 */
	public void setIp65504P505PassNmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P505PassNmS = checkIp65504P505PassNmSMaxLimit(number); 
		serializeIp65504P505PassNmS(ip65504P505PassNmS);
	}

	public void setIp65504P505PassNmS(int number) {
	    number = checkIp65504P505PassNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P505PassNmS((short)number);
	}
	public void setIp65504P505PassNmS(long number) {
	    number = checkIp65504P505PassNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P505PassNmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P505PassNmL
	 *	@return ip65504P505PassNmL
	 */
	public short getIp65504P505PassNmL() throws CFException {
        if (isIp65504P505PassNmLModified()) { 
           ip65504P505PassNmL = refreshIp65504P505PassNmL();
        }
   		return ip65504P505PassNmL;
	}
	
	/**
	 * 	Update Ip65504P505PassNmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P505-PASS-NM-L
	 *	@param number
	 */
	public void setIp65504P505PassNmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P505PassNmL = checkIp65504P505PassNmLMaxLimit(number); 
		serializeIp65504P505PassNmL(ip65504P505PassNmL);
	}

	public void setIp65504P505PassNmL(int number) {
	    number = checkIp65504P505PassNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P505PassNmL((short)number);
	}
	public void setIp65504P505PassNmL(long number) {
	    number = checkIp65504P505PassNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P505PassNmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P506TktNbrS
	 *	@return ip65504P506TktNbrS
	 */
	public short getIp65504P506TktNbrS() throws CFException {
        if (isIp65504P506TktNbrSModified()) { 
           ip65504P506TktNbrS = refreshIp65504P506TktNbrS();
        }
   		return ip65504P506TktNbrS;
	}
	
	/**
	 * 	Update Ip65504P506TktNbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P506-TKT-NBR-S
	 *	@param number
	 */
	public void setIp65504P506TktNbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P506TktNbrS = checkIp65504P506TktNbrSMaxLimit(number); 
		serializeIp65504P506TktNbrS(ip65504P506TktNbrS);
	}

	public void setIp65504P506TktNbrS(int number) {
	    number = checkIp65504P506TktNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P506TktNbrS((short)number);
	}
	public void setIp65504P506TktNbrS(long number) {
	    number = checkIp65504P506TktNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P506TktNbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P506TktNbrL
	 *	@return ip65504P506TktNbrL
	 */
	public short getIp65504P506TktNbrL() throws CFException {
        if (isIp65504P506TktNbrLModified()) { 
           ip65504P506TktNbrL = refreshIp65504P506TktNbrL();
        }
   		return ip65504P506TktNbrL;
	}
	
	/**
	 * 	Update Ip65504P506TktNbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P506-TKT-NBR-L
	 *	@param number
	 */
	public void setIp65504P506TktNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P506TktNbrL = checkIp65504P506TktNbrLMaxLimit(number); 
		serializeIp65504P506TktNbrL(ip65504P506TktNbrL);
	}

	public void setIp65504P506TktNbrL(int number) {
	    number = checkIp65504P506TktNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P506TktNbrL((short)number);
	}
	public void setIp65504P506TktNbrL(long number) {
	    number = checkIp65504P506TktNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P506TktNbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P507IssCarS
	 *	@return ip65504P507IssCarS
	 */
	public short getIp65504P507IssCarS() throws CFException {
        if (isIp65504P507IssCarSModified()) { 
           ip65504P507IssCarS = refreshIp65504P507IssCarS();
        }
   		return ip65504P507IssCarS;
	}
	
	/**
	 * 	Update Ip65504P507IssCarS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P507-ISS-CAR-S
	 *	@param number
	 */
	public void setIp65504P507IssCarS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P507IssCarS = checkIp65504P507IssCarSMaxLimit(number); 
		serializeIp65504P507IssCarS(ip65504P507IssCarS);
	}

	public void setIp65504P507IssCarS(int number) {
	    number = checkIp65504P507IssCarSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P507IssCarS((short)number);
	}
	public void setIp65504P507IssCarS(long number) {
	    number = checkIp65504P507IssCarSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P507IssCarS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P507IssCarL
	 *	@return ip65504P507IssCarL
	 */
	public short getIp65504P507IssCarL() throws CFException {
        if (isIp65504P507IssCarLModified()) { 
           ip65504P507IssCarL = refreshIp65504P507IssCarL();
        }
   		return ip65504P507IssCarL;
	}
	
	/**
	 * 	Update Ip65504P507IssCarL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P507-ISS-CAR-L
	 *	@param number
	 */
	public void setIp65504P507IssCarL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P507IssCarL = checkIp65504P507IssCarLMaxLimit(number); 
		serializeIp65504P507IssCarL(ip65504P507IssCarL);
	}

	public void setIp65504P507IssCarL(int number) {
	    number = checkIp65504P507IssCarLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P507IssCarL((short)number);
	}
	public void setIp65504P507IssCarL(long number) {
	    number = checkIp65504P507IssCarLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P507IssCarL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P508CustCdS
	 *	@return ip65504P508CustCdS
	 */
	public short getIp65504P508CustCdS() throws CFException {
        if (isIp65504P508CustCdSModified()) { 
           ip65504P508CustCdS = refreshIp65504P508CustCdS();
        }
   		return ip65504P508CustCdS;
	}
	
	/**
	 * 	Update Ip65504P508CustCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P508-CUST-CD-S
	 *	@param number
	 */
	public void setIp65504P508CustCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P508CustCdS = checkIp65504P508CustCdSMaxLimit(number); 
		serializeIp65504P508CustCdS(ip65504P508CustCdS);
	}

	public void setIp65504P508CustCdS(int number) {
	    number = checkIp65504P508CustCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P508CustCdS((short)number);
	}
	public void setIp65504P508CustCdS(long number) {
	    number = checkIp65504P508CustCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P508CustCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P508CustCdL
	 *	@return ip65504P508CustCdL
	 */
	public short getIp65504P508CustCdL() throws CFException {
        if (isIp65504P508CustCdLModified()) { 
           ip65504P508CustCdL = refreshIp65504P508CustCdL();
        }
   		return ip65504P508CustCdL;
	}
	
	/**
	 * 	Update Ip65504P508CustCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P508-CUST-CD-L
	 *	@param number
	 */
	public void setIp65504P508CustCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P508CustCdL = checkIp65504P508CustCdLMaxLimit(number); 
		serializeIp65504P508CustCdL(ip65504P508CustCdL);
	}

	public void setIp65504P508CustCdL(int number) {
	    number = checkIp65504P508CustCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P508CustCdL((short)number);
	}
	public void setIp65504P508CustCdL(long number) {
	    number = checkIp65504P508CustCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P508CustCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P509IssDteS
	 *	@return ip65504P509IssDteS
	 */
	public short getIp65504P509IssDteS() throws CFException {
        if (isIp65504P509IssDteSModified()) { 
           ip65504P509IssDteS = refreshIp65504P509IssDteS();
        }
   		return ip65504P509IssDteS;
	}
	
	/**
	 * 	Update Ip65504P509IssDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P509-ISS-DTE-S
	 *	@param number
	 */
	public void setIp65504P509IssDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P509IssDteS = checkIp65504P509IssDteSMaxLimit(number); 
		serializeIp65504P509IssDteS(ip65504P509IssDteS);
	}

	public void setIp65504P509IssDteS(int number) {
	    number = checkIp65504P509IssDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P509IssDteS((short)number);
	}
	public void setIp65504P509IssDteS(long number) {
	    number = checkIp65504P509IssDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P509IssDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P509IssDteL
	 *	@return ip65504P509IssDteL
	 */
	public short getIp65504P509IssDteL() throws CFException {
        if (isIp65504P509IssDteLModified()) { 
           ip65504P509IssDteL = refreshIp65504P509IssDteL();
        }
   		return ip65504P509IssDteL;
	}
	
	/**
	 * 	Update Ip65504P509IssDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P509-ISS-DTE-L
	 *	@param number
	 */
	public void setIp65504P509IssDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P509IssDteL = checkIp65504P509IssDteLMaxLimit(number); 
		serializeIp65504P509IssDteL(ip65504P509IssDteL);
	}

	public void setIp65504P509IssDteL(int number) {
	    number = checkIp65504P509IssDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P509IssDteL((short)number);
	}
	public void setIp65504P509IssDteL(long number) {
	    number = checkIp65504P509IssDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P509IssDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P510AgcyCdS
	 *	@return ip65504P510AgcyCdS
	 */
	public short getIp65504P510AgcyCdS() throws CFException {
        if (isIp65504P510AgcyCdSModified()) { 
           ip65504P510AgcyCdS = refreshIp65504P510AgcyCdS();
        }
   		return ip65504P510AgcyCdS;
	}
	
	/**
	 * 	Update Ip65504P510AgcyCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P510-AGCY-CD-S
	 *	@param number
	 */
	public void setIp65504P510AgcyCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P510AgcyCdS = checkIp65504P510AgcyCdSMaxLimit(number); 
		serializeIp65504P510AgcyCdS(ip65504P510AgcyCdS);
	}

	public void setIp65504P510AgcyCdS(int number) {
	    number = checkIp65504P510AgcyCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P510AgcyCdS((short)number);
	}
	public void setIp65504P510AgcyCdS(long number) {
	    number = checkIp65504P510AgcyCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P510AgcyCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P510AgcyCdL
	 *	@return ip65504P510AgcyCdL
	 */
	public short getIp65504P510AgcyCdL() throws CFException {
        if (isIp65504P510AgcyCdLModified()) { 
           ip65504P510AgcyCdL = refreshIp65504P510AgcyCdL();
        }
   		return ip65504P510AgcyCdL;
	}
	
	/**
	 * 	Update Ip65504P510AgcyCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P510-AGCY-CD-L
	 *	@param number
	 */
	public void setIp65504P510AgcyCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P510AgcyCdL = checkIp65504P510AgcyCdLMaxLimit(number); 
		serializeIp65504P510AgcyCdL(ip65504P510AgcyCdL);
	}

	public void setIp65504P510AgcyCdL(int number) {
	    number = checkIp65504P510AgcyCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P510AgcyCdL((short)number);
	}
	public void setIp65504P510AgcyCdL(long number) {
	    number = checkIp65504P510AgcyCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P510AgcyCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P511AgcyNmS
	 *	@return ip65504P511AgcyNmS
	 */
	public short getIp65504P511AgcyNmS() throws CFException {
        if (isIp65504P511AgcyNmSModified()) { 
           ip65504P511AgcyNmS = refreshIp65504P511AgcyNmS();
        }
   		return ip65504P511AgcyNmS;
	}
	
	/**
	 * 	Update Ip65504P511AgcyNmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P511-AGCY-NM-S
	 *	@param number
	 */
	public void setIp65504P511AgcyNmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P511AgcyNmS = checkIp65504P511AgcyNmSMaxLimit(number); 
		serializeIp65504P511AgcyNmS(ip65504P511AgcyNmS);
	}

	public void setIp65504P511AgcyNmS(int number) {
	    number = checkIp65504P511AgcyNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P511AgcyNmS((short)number);
	}
	public void setIp65504P511AgcyNmS(long number) {
	    number = checkIp65504P511AgcyNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P511AgcyNmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P511AgcyNmL
	 *	@return ip65504P511AgcyNmL
	 */
	public short getIp65504P511AgcyNmL() throws CFException {
        if (isIp65504P511AgcyNmLModified()) { 
           ip65504P511AgcyNmL = refreshIp65504P511AgcyNmL();
        }
   		return ip65504P511AgcyNmL;
	}
	
	/**
	 * 	Update Ip65504P511AgcyNmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P511-AGCY-NM-L
	 *	@param number
	 */
	public void setIp65504P511AgcyNmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P511AgcyNmL = checkIp65504P511AgcyNmLMaxLimit(number); 
		serializeIp65504P511AgcyNmL(ip65504P511AgcyNmL);
	}

	public void setIp65504P511AgcyNmL(int number) {
	    number = checkIp65504P511AgcyNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P511AgcyNmL((short)number);
	}
	public void setIp65504P511AgcyNmL(long number) {
	    number = checkIp65504P511AgcyNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P511AgcyNmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P512TtlFarS
	 *	@return ip65504P512TtlFarS
	 */
	public short getIp65504P512TtlFarS() throws CFException {
        if (isIp65504P512TtlFarSModified()) { 
           ip65504P512TtlFarS = refreshIp65504P512TtlFarS();
        }
   		return ip65504P512TtlFarS;
	}
	
	/**
	 * 	Update Ip65504P512TtlFarS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P512-TTL-FAR-S
	 *	@param number
	 */
	public void setIp65504P512TtlFarS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P512TtlFarS = checkIp65504P512TtlFarSMaxLimit(number); 
		serializeIp65504P512TtlFarS(ip65504P512TtlFarS);
	}

	public void setIp65504P512TtlFarS(int number) {
	    number = checkIp65504P512TtlFarSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P512TtlFarS((short)number);
	}
	public void setIp65504P512TtlFarS(long number) {
	    number = checkIp65504P512TtlFarSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P512TtlFarS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P512TtlFarL
	 *	@return ip65504P512TtlFarL
	 */
	public short getIp65504P512TtlFarL() throws CFException {
        if (isIp65504P512TtlFarLModified()) { 
           ip65504P512TtlFarL = refreshIp65504P512TtlFarL();
        }
   		return ip65504P512TtlFarL;
	}
	
	/**
	 * 	Update Ip65504P512TtlFarL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P512-TTL-FAR-L
	 *	@param number
	 */
	public void setIp65504P512TtlFarL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P512TtlFarL = checkIp65504P512TtlFarLMaxLimit(number); 
		serializeIp65504P512TtlFarL(ip65504P512TtlFarL);
	}

	public void setIp65504P512TtlFarL(int number) {
	    number = checkIp65504P512TtlFarLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P512TtlFarL((short)number);
	}
	public void setIp65504P512TtlFarL(long number) {
	    number = checkIp65504P512TtlFarLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P512TtlFarL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P513TtlFeeS
	 *	@return ip65504P513TtlFeeS
	 */
	public short getIp65504P513TtlFeeS() throws CFException {
        if (isIp65504P513TtlFeeSModified()) { 
           ip65504P513TtlFeeS = refreshIp65504P513TtlFeeS();
        }
   		return ip65504P513TtlFeeS;
	}
	
	/**
	 * 	Update Ip65504P513TtlFeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P513-TTL-FEE-S
	 *	@param number
	 */
	public void setIp65504P513TtlFeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P513TtlFeeS = checkIp65504P513TtlFeeSMaxLimit(number); 
		serializeIp65504P513TtlFeeS(ip65504P513TtlFeeS);
	}

	public void setIp65504P513TtlFeeS(int number) {
	    number = checkIp65504P513TtlFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P513TtlFeeS((short)number);
	}
	public void setIp65504P513TtlFeeS(long number) {
	    number = checkIp65504P513TtlFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P513TtlFeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P513TtlFeeL
	 *	@return ip65504P513TtlFeeL
	 */
	public short getIp65504P513TtlFeeL() throws CFException {
        if (isIp65504P513TtlFeeLModified()) { 
           ip65504P513TtlFeeL = refreshIp65504P513TtlFeeL();
        }
   		return ip65504P513TtlFeeL;
	}
	
	/**
	 * 	Update Ip65504P513TtlFeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P513-TTL-FEE-L
	 *	@param number
	 */
	public void setIp65504P513TtlFeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P513TtlFeeL = checkIp65504P513TtlFeeLMaxLimit(number); 
		serializeIp65504P513TtlFeeL(ip65504P513TtlFeeL);
	}

	public void setIp65504P513TtlFeeL(int number) {
	    number = checkIp65504P513TtlFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P513TtlFeeL((short)number);
	}
	public void setIp65504P513TtlFeeL(long number) {
	    number = checkIp65504P513TtlFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P513TtlFeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P514TtlTaxS
	 *	@return ip65504P514TtlTaxS
	 */
	public short getIp65504P514TtlTaxS() throws CFException {
        if (isIp65504P514TtlTaxSModified()) { 
           ip65504P514TtlTaxS = refreshIp65504P514TtlTaxS();
        }
   		return ip65504P514TtlTaxS;
	}
	
	/**
	 * 	Update Ip65504P514TtlTaxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P514-TTL-TAX-S
	 *	@param number
	 */
	public void setIp65504P514TtlTaxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P514TtlTaxS = checkIp65504P514TtlTaxSMaxLimit(number); 
		serializeIp65504P514TtlTaxS(ip65504P514TtlTaxS);
	}

	public void setIp65504P514TtlTaxS(int number) {
	    number = checkIp65504P514TtlTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P514TtlTaxS((short)number);
	}
	public void setIp65504P514TtlTaxS(long number) {
	    number = checkIp65504P514TtlTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P514TtlTaxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P514TtlTaxL
	 *	@return ip65504P514TtlTaxL
	 */
	public short getIp65504P514TtlTaxL() throws CFException {
        if (isIp65504P514TtlTaxLModified()) { 
           ip65504P514TtlTaxL = refreshIp65504P514TtlTaxL();
        }
   		return ip65504P514TtlTaxL;
	}
	
	/**
	 * 	Update Ip65504P514TtlTaxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P514-TTL-TAX-L
	 *	@param number
	 */
	public void setIp65504P514TtlTaxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P514TtlTaxL = checkIp65504P514TtlTaxLMaxLimit(number); 
		serializeIp65504P514TtlTaxL(ip65504P514TtlTaxL);
	}

	public void setIp65504P514TtlTaxL(int number) {
	    number = checkIp65504P514TtlTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P514TtlTaxL((short)number);
	}
	public void setIp65504P514TtlTaxL(long number) {
	    number = checkIp65504P514TtlTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P514TtlTaxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P515ReservdS
	 *	@return ip65504P515ReservdS
	 */
	public short getIp65504P515ReservdS() throws CFException {
        if (isIp65504P515ReservdSModified()) { 
           ip65504P515ReservdS = refreshIp65504P515ReservdS();
        }
   		return ip65504P515ReservdS;
	}
	
	/**
	 * 	Update Ip65504P515ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P515-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P515ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P515ReservdS = checkIp65504P515ReservdSMaxLimit(number); 
		serializeIp65504P515ReservdS(ip65504P515ReservdS);
	}

	public void setIp65504P515ReservdS(int number) {
	    number = checkIp65504P515ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P515ReservdS((short)number);
	}
	public void setIp65504P515ReservdS(long number) {
	    number = checkIp65504P515ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P515ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P515ReservdL
	 *	@return ip65504P515ReservdL
	 */
	public short getIp65504P515ReservdL() throws CFException {
        if (isIp65504P515ReservdLModified()) { 
           ip65504P515ReservdL = refreshIp65504P515ReservdL();
        }
   		return ip65504P515ReservdL;
	}
	
	/**
	 * 	Update Ip65504P515ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P515-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P515ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P515ReservdL = checkIp65504P515ReservdLMaxLimit(number); 
		serializeIp65504P515ReservdL(ip65504P515ReservdL);
	}

	public void setIp65504P515ReservdL(int number) {
	    number = checkIp65504P515ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P515ReservdL((short)number);
	}
	public void setIp65504P515ReservdL(long number) {
	    number = checkIp65504P515ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P515ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P516ReservdS
	 *	@return ip65504P516ReservdS
	 */
	public short getIp65504P516ReservdS() throws CFException {
        if (isIp65504P516ReservdSModified()) { 
           ip65504P516ReservdS = refreshIp65504P516ReservdS();
        }
   		return ip65504P516ReservdS;
	}
	
	/**
	 * 	Update Ip65504P516ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P516-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P516ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P516ReservdS = checkIp65504P516ReservdSMaxLimit(number); 
		serializeIp65504P516ReservdS(ip65504P516ReservdS);
	}

	public void setIp65504P516ReservdS(int number) {
	    number = checkIp65504P516ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P516ReservdS((short)number);
	}
	public void setIp65504P516ReservdS(long number) {
	    number = checkIp65504P516ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P516ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P516ReservdL
	 *	@return ip65504P516ReservdL
	 */
	public short getIp65504P516ReservdL() throws CFException {
        if (isIp65504P516ReservdLModified()) { 
           ip65504P516ReservdL = refreshIp65504P516ReservdL();
        }
   		return ip65504P516ReservdL;
	}
	
	/**
	 * 	Update Ip65504P516ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P516-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P516ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P516ReservdL = checkIp65504P516ReservdLMaxLimit(number); 
		serializeIp65504P516ReservdL(ip65504P516ReservdL);
	}

	public void setIp65504P516ReservdL(int number) {
	    number = checkIp65504P516ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P516ReservdL((short)number);
	}
	public void setIp65504P516ReservdL(long number) {
	    number = checkIp65504P516ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P516ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P517ReservdS
	 *	@return ip65504P517ReservdS
	 */
	public short getIp65504P517ReservdS() throws CFException {
        if (isIp65504P517ReservdSModified()) { 
           ip65504P517ReservdS = refreshIp65504P517ReservdS();
        }
   		return ip65504P517ReservdS;
	}
	
	/**
	 * 	Update Ip65504P517ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P517-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P517ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P517ReservdS = checkIp65504P517ReservdSMaxLimit(number); 
		serializeIp65504P517ReservdS(ip65504P517ReservdS);
	}

	public void setIp65504P517ReservdS(int number) {
	    number = checkIp65504P517ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P517ReservdS((short)number);
	}
	public void setIp65504P517ReservdS(long number) {
	    number = checkIp65504P517ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P517ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P517ReservdL
	 *	@return ip65504P517ReservdL
	 */
	public short getIp65504P517ReservdL() throws CFException {
        if (isIp65504P517ReservdLModified()) { 
           ip65504P517ReservdL = refreshIp65504P517ReservdL();
        }
   		return ip65504P517ReservdL;
	}
	
	/**
	 * 	Update Ip65504P517ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P517-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P517ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P517ReservdL = checkIp65504P517ReservdLMaxLimit(number); 
		serializeIp65504P517ReservdL(ip65504P517ReservdL);
	}

	public void setIp65504P517ReservdL(int number) {
	    number = checkIp65504P517ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P517ReservdL((short)number);
	}
	public void setIp65504P517ReservdL(long number) {
	    number = checkIp65504P517ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P517ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P518ReservdS
	 *	@return ip65504P518ReservdS
	 */
	public short getIp65504P518ReservdS() throws CFException {
        if (isIp65504P518ReservdSModified()) { 
           ip65504P518ReservdS = refreshIp65504P518ReservdS();
        }
   		return ip65504P518ReservdS;
	}
	
	/**
	 * 	Update Ip65504P518ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P518-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P518ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P518ReservdS = checkIp65504P518ReservdSMaxLimit(number); 
		serializeIp65504P518ReservdS(ip65504P518ReservdS);
	}

	public void setIp65504P518ReservdS(int number) {
	    number = checkIp65504P518ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P518ReservdS((short)number);
	}
	public void setIp65504P518ReservdS(long number) {
	    number = checkIp65504P518ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P518ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P518ReservdL
	 *	@return ip65504P518ReservdL
	 */
	public short getIp65504P518ReservdL() throws CFException {
        if (isIp65504P518ReservdLModified()) { 
           ip65504P518ReservdL = refreshIp65504P518ReservdL();
        }
   		return ip65504P518ReservdL;
	}
	
	/**
	 * 	Update Ip65504P518ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P518-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P518ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P518ReservdL = checkIp65504P518ReservdLMaxLimit(number); 
		serializeIp65504P518ReservdL(ip65504P518ReservdL);
	}

	public void setIp65504P518ReservdL(int number) {
	    number = checkIp65504P518ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P518ReservdL((short)number);
	}
	public void setIp65504P518ReservdL(long number) {
	    number = checkIp65504P518ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P518ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P519ReservdS
	 *	@return ip65504P519ReservdS
	 */
	public short getIp65504P519ReservdS() throws CFException {
        if (isIp65504P519ReservdSModified()) { 
           ip65504P519ReservdS = refreshIp65504P519ReservdS();
        }
   		return ip65504P519ReservdS;
	}
	
	/**
	 * 	Update Ip65504P519ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P519-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P519ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P519ReservdS = checkIp65504P519ReservdSMaxLimit(number); 
		serializeIp65504P519ReservdS(ip65504P519ReservdS);
	}

	public void setIp65504P519ReservdS(int number) {
	    number = checkIp65504P519ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P519ReservdS((short)number);
	}
	public void setIp65504P519ReservdS(long number) {
	    number = checkIp65504P519ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P519ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P519ReservdL
	 *	@return ip65504P519ReservdL
	 */
	public short getIp65504P519ReservdL() throws CFException {
        if (isIp65504P519ReservdLModified()) { 
           ip65504P519ReservdL = refreshIp65504P519ReservdL();
        }
   		return ip65504P519ReservdL;
	}
	
	/**
	 * 	Update Ip65504P519ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P519-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P519ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P519ReservdL = checkIp65504P519ReservdLMaxLimit(number); 
		serializeIp65504P519ReservdL(ip65504P519ReservdL);
	}

	public void setIp65504P519ReservdL(int number) {
	    number = checkIp65504P519ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P519ReservdL((short)number);
	}
	public void setIp65504P519ReservdL(long number) {
	    number = checkIp65504P519ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P519ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P520TravldtS
	 *	@return ip65504P520TravldtS
	 */
	public short getIp65504P520TravldtS() throws CFException {
        if (isIp65504P520TravldtSModified()) { 
           ip65504P520TravldtS = refreshIp65504P520TravldtS();
        }
   		return ip65504P520TravldtS;
	}
	
	/**
	 * 	Update Ip65504P520TravldtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P520-TRAVLDT-S
	 *	@param number
	 */
	public void setIp65504P520TravldtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P520TravldtS = checkIp65504P520TravldtSMaxLimit(number); 
		serializeIp65504P520TravldtS(ip65504P520TravldtS);
	}

	public void setIp65504P520TravldtS(int number) {
	    number = checkIp65504P520TravldtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P520TravldtS((short)number);
	}
	public void setIp65504P520TravldtS(long number) {
	    number = checkIp65504P520TravldtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P520TravldtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P520TravldtL
	 *	@return ip65504P520TravldtL
	 */
	public short getIp65504P520TravldtL() throws CFException {
        if (isIp65504P520TravldtLModified()) { 
           ip65504P520TravldtL = refreshIp65504P520TravldtL();
        }
   		return ip65504P520TravldtL;
	}
	
	/**
	 * 	Update Ip65504P520TravldtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P520-TRAVLDT-L
	 *	@param number
	 */
	public void setIp65504P520TravldtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P520TravldtL = checkIp65504P520TravldtLMaxLimit(number); 
		serializeIp65504P520TravldtL(ip65504P520TravldtL);
	}

	public void setIp65504P520TravldtL(int number) {
	    number = checkIp65504P520TravldtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P520TravldtL((short)number);
	}
	public void setIp65504P520TravldtL(long number) {
	    number = checkIp65504P520TravldtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P520TravldtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P521CarrCdS
	 *	@return ip65504P521CarrCdS
	 */
	public short getIp65504P521CarrCdS() throws CFException {
        if (isIp65504P521CarrCdSModified()) { 
           ip65504P521CarrCdS = refreshIp65504P521CarrCdS();
        }
   		return ip65504P521CarrCdS;
	}
	
	/**
	 * 	Update Ip65504P521CarrCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P521-CARR-CD-S
	 *	@param number
	 */
	public void setIp65504P521CarrCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P521CarrCdS = checkIp65504P521CarrCdSMaxLimit(number); 
		serializeIp65504P521CarrCdS(ip65504P521CarrCdS);
	}

	public void setIp65504P521CarrCdS(int number) {
	    number = checkIp65504P521CarrCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P521CarrCdS((short)number);
	}
	public void setIp65504P521CarrCdS(long number) {
	    number = checkIp65504P521CarrCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P521CarrCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P521CarrCdL
	 *	@return ip65504P521CarrCdL
	 */
	public short getIp65504P521CarrCdL() throws CFException {
        if (isIp65504P521CarrCdLModified()) { 
           ip65504P521CarrCdL = refreshIp65504P521CarrCdL();
        }
   		return ip65504P521CarrCdL;
	}
	
	/**
	 * 	Update Ip65504P521CarrCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P521-CARR-CD-L
	 *	@param number
	 */
	public void setIp65504P521CarrCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P521CarrCdL = checkIp65504P521CarrCdLMaxLimit(number); 
		serializeIp65504P521CarrCdL(ip65504P521CarrCdL);
	}

	public void setIp65504P521CarrCdL(int number) {
	    number = checkIp65504P521CarrCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P521CarrCdL((short)number);
	}
	public void setIp65504P521CarrCdL(long number) {
	    number = checkIp65504P521CarrCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P521CarrCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P522ServCdS
	 *	@return ip65504P522ServCdS
	 */
	public short getIp65504P522ServCdS() throws CFException {
        if (isIp65504P522ServCdSModified()) { 
           ip65504P522ServCdS = refreshIp65504P522ServCdS();
        }
   		return ip65504P522ServCdS;
	}
	
	/**
	 * 	Update Ip65504P522ServCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P522-SERV-CD-S
	 *	@param number
	 */
	public void setIp65504P522ServCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P522ServCdS = checkIp65504P522ServCdSMaxLimit(number); 
		serializeIp65504P522ServCdS(ip65504P522ServCdS);
	}

	public void setIp65504P522ServCdS(int number) {
	    number = checkIp65504P522ServCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P522ServCdS((short)number);
	}
	public void setIp65504P522ServCdS(long number) {
	    number = checkIp65504P522ServCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P522ServCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P522ServCdL
	 *	@return ip65504P522ServCdL
	 */
	public short getIp65504P522ServCdL() throws CFException {
        if (isIp65504P522ServCdLModified()) { 
           ip65504P522ServCdL = refreshIp65504P522ServCdL();
        }
   		return ip65504P522ServCdL;
	}
	
	/**
	 * 	Update Ip65504P522ServCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P522-SERV-CD-L
	 *	@param number
	 */
	public void setIp65504P522ServCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P522ServCdL = checkIp65504P522ServCdLMaxLimit(number); 
		serializeIp65504P522ServCdL(ip65504P522ServCdL);
	}

	public void setIp65504P522ServCdL(int number) {
	    number = checkIp65504P522ServCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P522ServCdL((short)number);
	}
	public void setIp65504P522ServCdL(long number) {
	    number = checkIp65504P522ServCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P522ServCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P523OrgCtyS
	 *	@return ip65504P523OrgCtyS
	 */
	public short getIp65504P523OrgCtyS() throws CFException {
        if (isIp65504P523OrgCtySModified()) { 
           ip65504P523OrgCtyS = refreshIp65504P523OrgCtyS();
        }
   		return ip65504P523OrgCtyS;
	}
	
	/**
	 * 	Update Ip65504P523OrgCtyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P523-ORG-CTY-S
	 *	@param number
	 */
	public void setIp65504P523OrgCtyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P523OrgCtyS = checkIp65504P523OrgCtySMaxLimit(number); 
		serializeIp65504P523OrgCtyS(ip65504P523OrgCtyS);
	}

	public void setIp65504P523OrgCtyS(int number) {
	    number = checkIp65504P523OrgCtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P523OrgCtyS((short)number);
	}
	public void setIp65504P523OrgCtyS(long number) {
	    number = checkIp65504P523OrgCtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P523OrgCtyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P523OrgCtyL
	 *	@return ip65504P523OrgCtyL
	 */
	public short getIp65504P523OrgCtyL() throws CFException {
        if (isIp65504P523OrgCtyLModified()) { 
           ip65504P523OrgCtyL = refreshIp65504P523OrgCtyL();
        }
   		return ip65504P523OrgCtyL;
	}
	
	/**
	 * 	Update Ip65504P523OrgCtyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P523-ORG-CTY-L
	 *	@param number
	 */
	public void setIp65504P523OrgCtyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P523OrgCtyL = checkIp65504P523OrgCtyLMaxLimit(number); 
		serializeIp65504P523OrgCtyL(ip65504P523OrgCtyL);
	}

	public void setIp65504P523OrgCtyL(int number) {
	    number = checkIp65504P523OrgCtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P523OrgCtyL((short)number);
	}
	public void setIp65504P523OrgCtyL(long number) {
	    number = checkIp65504P523OrgCtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P523OrgCtyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P524DesCtyS
	 *	@return ip65504P524DesCtyS
	 */
	public short getIp65504P524DesCtyS() throws CFException {
        if (isIp65504P524DesCtySModified()) { 
           ip65504P524DesCtyS = refreshIp65504P524DesCtyS();
        }
   		return ip65504P524DesCtyS;
	}
	
	/**
	 * 	Update Ip65504P524DesCtyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P524-DES-CTY-S
	 *	@param number
	 */
	public void setIp65504P524DesCtyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P524DesCtyS = checkIp65504P524DesCtySMaxLimit(number); 
		serializeIp65504P524DesCtyS(ip65504P524DesCtyS);
	}

	public void setIp65504P524DesCtyS(int number) {
	    number = checkIp65504P524DesCtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P524DesCtyS((short)number);
	}
	public void setIp65504P524DesCtyS(long number) {
	    number = checkIp65504P524DesCtySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P524DesCtyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P524DesCtyL
	 *	@return ip65504P524DesCtyL
	 */
	public short getIp65504P524DesCtyL() throws CFException {
        if (isIp65504P524DesCtyLModified()) { 
           ip65504P524DesCtyL = refreshIp65504P524DesCtyL();
        }
   		return ip65504P524DesCtyL;
	}
	
	/**
	 * 	Update Ip65504P524DesCtyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P524-DES-CTY-L
	 *	@param number
	 */
	public void setIp65504P524DesCtyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P524DesCtyL = checkIp65504P524DesCtyLMaxLimit(number); 
		serializeIp65504P524DesCtyL(ip65504P524DesCtyL);
	}

	public void setIp65504P524DesCtyL(int number) {
	    number = checkIp65504P524DesCtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P524DesCtyL((short)number);
	}
	public void setIp65504P524DesCtyL(long number) {
	    number = checkIp65504P524DesCtyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P524DesCtyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P525StopCdS
	 *	@return ip65504P525StopCdS
	 */
	public short getIp65504P525StopCdS() throws CFException {
        if (isIp65504P525StopCdSModified()) { 
           ip65504P525StopCdS = refreshIp65504P525StopCdS();
        }
   		return ip65504P525StopCdS;
	}
	
	/**
	 * 	Update Ip65504P525StopCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P525-STOP-CD-S
	 *	@param number
	 */
	public void setIp65504P525StopCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P525StopCdS = checkIp65504P525StopCdSMaxLimit(number); 
		serializeIp65504P525StopCdS(ip65504P525StopCdS);
	}

	public void setIp65504P525StopCdS(int number) {
	    number = checkIp65504P525StopCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P525StopCdS((short)number);
	}
	public void setIp65504P525StopCdS(long number) {
	    number = checkIp65504P525StopCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P525StopCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P525StopCdL
	 *	@return ip65504P525StopCdL
	 */
	public short getIp65504P525StopCdL() throws CFException {
        if (isIp65504P525StopCdLModified()) { 
           ip65504P525StopCdL = refreshIp65504P525StopCdL();
        }
   		return ip65504P525StopCdL;
	}
	
	/**
	 * 	Update Ip65504P525StopCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P525-STOP-CD-L
	 *	@param number
	 */
	public void setIp65504P525StopCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P525StopCdL = checkIp65504P525StopCdLMaxLimit(number); 
		serializeIp65504P525StopCdL(ip65504P525StopCdL);
	}

	public void setIp65504P525StopCdL(int number) {
	    number = checkIp65504P525StopCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P525StopCdL((short)number);
	}
	public void setIp65504P525StopCdL(long number) {
	    number = checkIp65504P525StopCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P525StopCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P526ConjTkS
	 *	@return ip65504P526ConjTkS
	 */
	public short getIp65504P526ConjTkS() throws CFException {
        if (isIp65504P526ConjTkSModified()) { 
           ip65504P526ConjTkS = refreshIp65504P526ConjTkS();
        }
   		return ip65504P526ConjTkS;
	}
	
	/**
	 * 	Update Ip65504P526ConjTkS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P526-CONJ-TK-S
	 *	@param number
	 */
	public void setIp65504P526ConjTkS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P526ConjTkS = checkIp65504P526ConjTkSMaxLimit(number); 
		serializeIp65504P526ConjTkS(ip65504P526ConjTkS);
	}

	public void setIp65504P526ConjTkS(int number) {
	    number = checkIp65504P526ConjTkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P526ConjTkS((short)number);
	}
	public void setIp65504P526ConjTkS(long number) {
	    number = checkIp65504P526ConjTkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P526ConjTkS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P526ConjTkL
	 *	@return ip65504P526ConjTkL
	 */
	public short getIp65504P526ConjTkL() throws CFException {
        if (isIp65504P526ConjTkLModified()) { 
           ip65504P526ConjTkL = refreshIp65504P526ConjTkL();
        }
   		return ip65504P526ConjTkL;
	}
	
	/**
	 * 	Update Ip65504P526ConjTkL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P526-CONJ-TK-L
	 *	@param number
	 */
	public void setIp65504P526ConjTkL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P526ConjTkL = checkIp65504P526ConjTkLMaxLimit(number); 
		serializeIp65504P526ConjTkL(ip65504P526ConjTkL);
	}

	public void setIp65504P526ConjTkL(int number) {
	    number = checkIp65504P526ConjTkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P526ConjTkL((short)number);
	}
	public void setIp65504P526ConjTkL(long number) {
	    number = checkIp65504P526ConjTkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P526ConjTkL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P527ExchTkS
	 *	@return ip65504P527ExchTkS
	 */
	public short getIp65504P527ExchTkS() throws CFException {
        if (isIp65504P527ExchTkSModified()) { 
           ip65504P527ExchTkS = refreshIp65504P527ExchTkS();
        }
   		return ip65504P527ExchTkS;
	}
	
	/**
	 * 	Update Ip65504P527ExchTkS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P527-EXCH-TK-S
	 *	@param number
	 */
	public void setIp65504P527ExchTkS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P527ExchTkS = checkIp65504P527ExchTkSMaxLimit(number); 
		serializeIp65504P527ExchTkS(ip65504P527ExchTkS);
	}

	public void setIp65504P527ExchTkS(int number) {
	    number = checkIp65504P527ExchTkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P527ExchTkS((short)number);
	}
	public void setIp65504P527ExchTkS(long number) {
	    number = checkIp65504P527ExchTkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P527ExchTkS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P527ExchTkL
	 *	@return ip65504P527ExchTkL
	 */
	public short getIp65504P527ExchTkL() throws CFException {
        if (isIp65504P527ExchTkLModified()) { 
           ip65504P527ExchTkL = refreshIp65504P527ExchTkL();
        }
   		return ip65504P527ExchTkL;
	}
	
	/**
	 * 	Update Ip65504P527ExchTkL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P527-EXCH-TK-L
	 *	@param number
	 */
	public void setIp65504P527ExchTkL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P527ExchTkL = checkIp65504P527ExchTkLMaxLimit(number); 
		serializeIp65504P527ExchTkL(ip65504P527ExchTkL);
	}

	public void setIp65504P527ExchTkL(int number) {
	    number = checkIp65504P527ExchTkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P527ExchTkL((short)number);
	}
	public void setIp65504P527ExchTkL(long number) {
	    number = checkIp65504P527ExchTkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P527ExchTkL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P497ReservdS((short)0);
         	setIp65504P497ReservdL((short)0);
         	setIp65504P498ReservdS((short)0);
         	setIp65504P498ReservdL((short)0);
         	setIp65504P499ReservdS((short)0);
         	setIp65504P499ReservdL((short)0);
         	setIp65504P500ReservdS((short)0);
         	setIp65504P500ReservdL((short)0);
         	setIp65504P501TrxDesS((short)0);
         	setIp65504P501TrxDesL((short)0);
         	setIp65504P502ReservdS((short)0);
         	setIp65504P502ReservdL((short)0);
         	setIp65504P503ReservdS((short)0);
         	setIp65504P503ReservdL((short)0);
         	setIp65504P504ReservdS((short)0);
         	setIp65504P504ReservdL((short)0);
         	setIp65504P505PassNmS((short)0);
         	setIp65504P505PassNmL((short)0);
         	setIp65504P506TktNbrS((short)0);
         	setIp65504P506TktNbrL((short)0);
         	setIp65504P507IssCarS((short)0);
         	setIp65504P507IssCarL((short)0);
         	setIp65504P508CustCdS((short)0);
         	setIp65504P508CustCdL((short)0);
         	setIp65504P509IssDteS((short)0);
         	setIp65504P509IssDteL((short)0);
         	setIp65504P510AgcyCdS((short)0);
         	setIp65504P510AgcyCdL((short)0);
         	setIp65504P511AgcyNmS((short)0);
         	setIp65504P511AgcyNmL((short)0);
         	setIp65504P512TtlFarS((short)0);
         	setIp65504P512TtlFarL((short)0);
         	setIp65504P513TtlFeeS((short)0);
         	setIp65504P513TtlFeeL((short)0);
         	setIp65504P514TtlTaxS((short)0);
         	setIp65504P514TtlTaxL((short)0);
         	setIp65504P515ReservdS((short)0);
         	setIp65504P515ReservdL((short)0);
         	setIp65504P516ReservdS((short)0);
         	setIp65504P516ReservdL((short)0);
         	setIp65504P517ReservdS((short)0);
         	setIp65504P517ReservdL((short)0);
         	setIp65504P518ReservdS((short)0);
         	setIp65504P518ReservdL((short)0);
         	setIp65504P519ReservdS((short)0);
         	setIp65504P519ReservdL((short)0);
         	setIp65504P520TravldtS((short)0);
         	setIp65504P520TravldtL((short)0);
         	setIp65504P521CarrCdS((short)0);
         	setIp65504P521CarrCdL((short)0);
         	setIp65504P522ServCdS((short)0);
         	setIp65504P522ServCdL((short)0);
         	setIp65504P523OrgCtyS((short)0);
         	setIp65504P523OrgCtyL((short)0);
         	setIp65504P524DesCtyS((short)0);
         	setIp65504P524DesCtyL((short)0);
         	setIp65504P525StopCdS((short)0);
         	setIp65504P525StopCdL((short)0);
         	setIp65504P526ConjTkS((short)0);
         	setIp65504P526ConjTkL((short)0);
         	setIp65504P527ExchTkS((short)0);
         	setIp65504P527ExchTkL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup17FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_17_LENGTH;
		}

}
  
