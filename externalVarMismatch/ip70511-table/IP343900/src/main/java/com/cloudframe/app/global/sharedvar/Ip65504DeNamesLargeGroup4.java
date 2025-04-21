package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNamesLargeGroup4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504DeNamesLargeGroup4 extends Ip65504DeNamesLargeGroup4Serialized { 
   

								private short ip65504D94TrxOidS;

								private short ip65504D94TrxOidL;


								private short ip65504D95CardIsS;

								private short ip65504D95CardIsL;


								private short ip65504D96KeyMgtS;

								private short ip65504D96KeyMgtL;


								private short ip65504D97NetAmtS;

								private short ip65504D97NetAmtL;


								private short ip65504D98PayeeXS;

								private short ip65504D98PayeeXL;


								private short ip65504D99StlInsS;

								private short ip65504D99StlInsL;


								private short ip65504D100RecInsS;

								private short ip65504D100RecInsL;


								private short ip65504D101FileNmS;

								private short ip65504D101FileNmL;


								private short ip65504D102ActId1S;

								private short ip65504D102ActId1L;


								private short ip65504D103ActId2S;

								private short ip65504D103ActId2L;


								private short ip65504D104TrxDesS;

								private short ip65504D104TrxDesL;


								private short ip65504D105CrCbamS;

								private short ip65504D105CrCbamL;


								private short ip65504D106DbCbamS;

								private short ip65504D106DbCbamL;


								private short ip65504D107CrCbnoS;

								private short ip65504D107CrCbnoL;


								private short ip65504D108DbCbnoS;

								private short ip65504D108DbCbnoL;


								private short ip65504D109CrFeesS;

								private short ip65504D109CrFeesL;


								private short ip65504D110DbFeesS;

								private short ip65504D110DbFeesL;


								private short ip65504D111ReservdS;

								private short ip65504D111ReservdL;


								private short ip65504D112ReservdS;

								private short ip65504D112ReservdL;


								private short ip65504D113ReservdS;

								private short ip65504D113ReservdL;


								private short ip65504D114ReservdS;

								private short ip65504D114ReservdL;


								private short ip65504D115ReservdS;

								private short ip65504D115ReservdL;


								private short ip65504D116ReservdS;

								private short ip65504D116ReservdL;


								private short ip65504D117ReservdS;

								private short ip65504D117ReservdL;


								private short ip65504D118ReservdS;

								private short ip65504D118ReservdL;


								private short ip65504D119ReservdS;

								private short ip65504D119ReservdL;


								private short ip65504D120ReservdS;

								private short ip65504D120ReservdL;


								private short ip65504D121Addtl2S;

								private short ip65504D121Addtl2L;


								private short ip65504D122Addtl3S;

								private short ip65504D122Addtl3L;


								private short ip65504D123Addtl4S;

								private short ip65504D123Addtl4L;


								private short ip65504D124ReservdS;

								private short ip65504D124ReservdL;

	
	/**
	* Constructor for Ip65504DeNamesLargeGroup4
	**/
    public Ip65504DeNamesLargeGroup4() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeNamesLargeGroup4. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup4(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504D94TrxOidS
	 *	@return ip65504D94TrxOidS
	 */
	public short getIp65504D94TrxOidS() throws CFException {
        if (isIp65504D94TrxOidSModified()) { 
           ip65504D94TrxOidS = refreshIp65504D94TrxOidS();
        }
   		return ip65504D94TrxOidS;
	}
	
	/**
	 * 	Update Ip65504D94TrxOidS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D94-TRX-OID-S
	 *	@param number
	 */
	public void setIp65504D94TrxOidS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D94TrxOidS = checkIp65504D94TrxOidSMaxLimit(number); 
		serializeIp65504D94TrxOidS(ip65504D94TrxOidS);
	}

	public void setIp65504D94TrxOidS(int number) {
	    number = checkIp65504D94TrxOidSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D94TrxOidS((short)number);
	}
	public void setIp65504D94TrxOidS(long number) {
	    number = checkIp65504D94TrxOidSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D94TrxOidS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D94TrxOidL
	 *	@return ip65504D94TrxOidL
	 */
	public short getIp65504D94TrxOidL() throws CFException {
        if (isIp65504D94TrxOidLModified()) { 
           ip65504D94TrxOidL = refreshIp65504D94TrxOidL();
        }
   		return ip65504D94TrxOidL;
	}
	
	/**
	 * 	Update Ip65504D94TrxOidL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D94-TRX-OID-L
	 *	@param number
	 */
	public void setIp65504D94TrxOidL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D94TrxOidL = checkIp65504D94TrxOidLMaxLimit(number); 
		serializeIp65504D94TrxOidL(ip65504D94TrxOidL);
	}

	public void setIp65504D94TrxOidL(int number) {
	    number = checkIp65504D94TrxOidLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D94TrxOidL((short)number);
	}
	public void setIp65504D94TrxOidL(long number) {
	    number = checkIp65504D94TrxOidLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D94TrxOidL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D95CardIsS
	 *	@return ip65504D95CardIsS
	 */
	public short getIp65504D95CardIsS() throws CFException {
        if (isIp65504D95CardIsSModified()) { 
           ip65504D95CardIsS = refreshIp65504D95CardIsS();
        }
   		return ip65504D95CardIsS;
	}
	
	/**
	 * 	Update Ip65504D95CardIsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D95-CARD-IS-S
	 *	@param number
	 */
	public void setIp65504D95CardIsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D95CardIsS = checkIp65504D95CardIsSMaxLimit(number); 
		serializeIp65504D95CardIsS(ip65504D95CardIsS);
	}

	public void setIp65504D95CardIsS(int number) {
	    number = checkIp65504D95CardIsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D95CardIsS((short)number);
	}
	public void setIp65504D95CardIsS(long number) {
	    number = checkIp65504D95CardIsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D95CardIsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D95CardIsL
	 *	@return ip65504D95CardIsL
	 */
	public short getIp65504D95CardIsL() throws CFException {
        if (isIp65504D95CardIsLModified()) { 
           ip65504D95CardIsL = refreshIp65504D95CardIsL();
        }
   		return ip65504D95CardIsL;
	}
	
	/**
	 * 	Update Ip65504D95CardIsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D95-CARD-IS-L
	 *	@param number
	 */
	public void setIp65504D95CardIsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D95CardIsL = checkIp65504D95CardIsLMaxLimit(number); 
		serializeIp65504D95CardIsL(ip65504D95CardIsL);
	}

	public void setIp65504D95CardIsL(int number) {
	    number = checkIp65504D95CardIsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D95CardIsL((short)number);
	}
	public void setIp65504D95CardIsL(long number) {
	    number = checkIp65504D95CardIsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D95CardIsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D96KeyMgtS
	 *	@return ip65504D96KeyMgtS
	 */
	public short getIp65504D96KeyMgtS() throws CFException {
        if (isIp65504D96KeyMgtSModified()) { 
           ip65504D96KeyMgtS = refreshIp65504D96KeyMgtS();
        }
   		return ip65504D96KeyMgtS;
	}
	
	/**
	 * 	Update Ip65504D96KeyMgtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D96-KEY-MGT-S
	 *	@param number
	 */
	public void setIp65504D96KeyMgtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D96KeyMgtS = checkIp65504D96KeyMgtSMaxLimit(number); 
		serializeIp65504D96KeyMgtS(ip65504D96KeyMgtS);
	}

	public void setIp65504D96KeyMgtS(int number) {
	    number = checkIp65504D96KeyMgtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D96KeyMgtS((short)number);
	}
	public void setIp65504D96KeyMgtS(long number) {
	    number = checkIp65504D96KeyMgtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D96KeyMgtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D96KeyMgtL
	 *	@return ip65504D96KeyMgtL
	 */
	public short getIp65504D96KeyMgtL() throws CFException {
        if (isIp65504D96KeyMgtLModified()) { 
           ip65504D96KeyMgtL = refreshIp65504D96KeyMgtL();
        }
   		return ip65504D96KeyMgtL;
	}
	
	/**
	 * 	Update Ip65504D96KeyMgtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D96-KEY-MGT-L
	 *	@param number
	 */
	public void setIp65504D96KeyMgtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D96KeyMgtL = checkIp65504D96KeyMgtLMaxLimit(number); 
		serializeIp65504D96KeyMgtL(ip65504D96KeyMgtL);
	}

	public void setIp65504D96KeyMgtL(int number) {
	    number = checkIp65504D96KeyMgtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D96KeyMgtL((short)number);
	}
	public void setIp65504D96KeyMgtL(long number) {
	    number = checkIp65504D96KeyMgtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D96KeyMgtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D97NetAmtS
	 *	@return ip65504D97NetAmtS
	 */
	public short getIp65504D97NetAmtS() throws CFException {
        if (isIp65504D97NetAmtSModified()) { 
           ip65504D97NetAmtS = refreshIp65504D97NetAmtS();
        }
   		return ip65504D97NetAmtS;
	}
	
	/**
	 * 	Update Ip65504D97NetAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D97-NET-AMT-S
	 *	@param number
	 */
	public void setIp65504D97NetAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D97NetAmtS = checkIp65504D97NetAmtSMaxLimit(number); 
		serializeIp65504D97NetAmtS(ip65504D97NetAmtS);
	}

	public void setIp65504D97NetAmtS(int number) {
	    number = checkIp65504D97NetAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D97NetAmtS((short)number);
	}
	public void setIp65504D97NetAmtS(long number) {
	    number = checkIp65504D97NetAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D97NetAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D97NetAmtL
	 *	@return ip65504D97NetAmtL
	 */
	public short getIp65504D97NetAmtL() throws CFException {
        if (isIp65504D97NetAmtLModified()) { 
           ip65504D97NetAmtL = refreshIp65504D97NetAmtL();
        }
   		return ip65504D97NetAmtL;
	}
	
	/**
	 * 	Update Ip65504D97NetAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D97-NET-AMT-L
	 *	@param number
	 */
	public void setIp65504D97NetAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D97NetAmtL = checkIp65504D97NetAmtLMaxLimit(number); 
		serializeIp65504D97NetAmtL(ip65504D97NetAmtL);
	}

	public void setIp65504D97NetAmtL(int number) {
	    number = checkIp65504D97NetAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D97NetAmtL((short)number);
	}
	public void setIp65504D97NetAmtL(long number) {
	    number = checkIp65504D97NetAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D97NetAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D98PayeeXS
	 *	@return ip65504D98PayeeXS
	 */
	public short getIp65504D98PayeeXS() throws CFException {
        if (isIp65504D98PayeeXSModified()) { 
           ip65504D98PayeeXS = refreshIp65504D98PayeeXS();
        }
   		return ip65504D98PayeeXS;
	}
	
	/**
	 * 	Update Ip65504D98PayeeXS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D98-PAYEE-X-S
	 *	@param number
	 */
	public void setIp65504D98PayeeXS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D98PayeeXS = checkIp65504D98PayeeXSMaxLimit(number); 
		serializeIp65504D98PayeeXS(ip65504D98PayeeXS);
	}

	public void setIp65504D98PayeeXS(int number) {
	    number = checkIp65504D98PayeeXSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D98PayeeXS((short)number);
	}
	public void setIp65504D98PayeeXS(long number) {
	    number = checkIp65504D98PayeeXSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D98PayeeXS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D98PayeeXL
	 *	@return ip65504D98PayeeXL
	 */
	public short getIp65504D98PayeeXL() throws CFException {
        if (isIp65504D98PayeeXLModified()) { 
           ip65504D98PayeeXL = refreshIp65504D98PayeeXL();
        }
   		return ip65504D98PayeeXL;
	}
	
	/**
	 * 	Update Ip65504D98PayeeXL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D98-PAYEE-X-L
	 *	@param number
	 */
	public void setIp65504D98PayeeXL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D98PayeeXL = checkIp65504D98PayeeXLMaxLimit(number); 
		serializeIp65504D98PayeeXL(ip65504D98PayeeXL);
	}

	public void setIp65504D98PayeeXL(int number) {
	    number = checkIp65504D98PayeeXLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D98PayeeXL((short)number);
	}
	public void setIp65504D98PayeeXL(long number) {
	    number = checkIp65504D98PayeeXLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D98PayeeXL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D99StlInsS
	 *	@return ip65504D99StlInsS
	 */
	public short getIp65504D99StlInsS() throws CFException {
        if (isIp65504D99StlInsSModified()) { 
           ip65504D99StlInsS = refreshIp65504D99StlInsS();
        }
   		return ip65504D99StlInsS;
	}
	
	/**
	 * 	Update Ip65504D99StlInsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D99-STL-INS-S
	 *	@param number
	 */
	public void setIp65504D99StlInsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D99StlInsS = checkIp65504D99StlInsSMaxLimit(number); 
		serializeIp65504D99StlInsS(ip65504D99StlInsS);
	}

	public void setIp65504D99StlInsS(int number) {
	    number = checkIp65504D99StlInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D99StlInsS((short)number);
	}
	public void setIp65504D99StlInsS(long number) {
	    number = checkIp65504D99StlInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D99StlInsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D99StlInsL
	 *	@return ip65504D99StlInsL
	 */
	public short getIp65504D99StlInsL() throws CFException {
        if (isIp65504D99StlInsLModified()) { 
           ip65504D99StlInsL = refreshIp65504D99StlInsL();
        }
   		return ip65504D99StlInsL;
	}
	
	/**
	 * 	Update Ip65504D99StlInsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D99-STL-INS-L
	 *	@param number
	 */
	public void setIp65504D99StlInsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D99StlInsL = checkIp65504D99StlInsLMaxLimit(number); 
		serializeIp65504D99StlInsL(ip65504D99StlInsL);
	}

	public void setIp65504D99StlInsL(int number) {
	    number = checkIp65504D99StlInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D99StlInsL((short)number);
	}
	public void setIp65504D99StlInsL(long number) {
	    number = checkIp65504D99StlInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D99StlInsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D100RecInsS
	 *	@return ip65504D100RecInsS
	 */
	public short getIp65504D100RecInsS() throws CFException {
        if (isIp65504D100RecInsSModified()) { 
           ip65504D100RecInsS = refreshIp65504D100RecInsS();
        }
   		return ip65504D100RecInsS;
	}
	
	/**
	 * 	Update Ip65504D100RecInsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D100-REC-INS-S
	 *	@param number
	 */
	public void setIp65504D100RecInsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D100RecInsS = checkIp65504D100RecInsSMaxLimit(number); 
		serializeIp65504D100RecInsS(ip65504D100RecInsS);
	}

	public void setIp65504D100RecInsS(int number) {
	    number = checkIp65504D100RecInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D100RecInsS((short)number);
	}
	public void setIp65504D100RecInsS(long number) {
	    number = checkIp65504D100RecInsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D100RecInsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D100RecInsL
	 *	@return ip65504D100RecInsL
	 */
	public short getIp65504D100RecInsL() throws CFException {
        if (isIp65504D100RecInsLModified()) { 
           ip65504D100RecInsL = refreshIp65504D100RecInsL();
        }
   		return ip65504D100RecInsL;
	}
	
	/**
	 * 	Update Ip65504D100RecInsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D100-REC-INS-L
	 *	@param number
	 */
	public void setIp65504D100RecInsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D100RecInsL = checkIp65504D100RecInsLMaxLimit(number); 
		serializeIp65504D100RecInsL(ip65504D100RecInsL);
	}

	public void setIp65504D100RecInsL(int number) {
	    number = checkIp65504D100RecInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D100RecInsL((short)number);
	}
	public void setIp65504D100RecInsL(long number) {
	    number = checkIp65504D100RecInsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D100RecInsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D101FileNmS
	 *	@return ip65504D101FileNmS
	 */
	public short getIp65504D101FileNmS() throws CFException {
        if (isIp65504D101FileNmSModified()) { 
           ip65504D101FileNmS = refreshIp65504D101FileNmS();
        }
   		return ip65504D101FileNmS;
	}
	
	/**
	 * 	Update Ip65504D101FileNmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D101-FILE-NM-S
	 *	@param number
	 */
	public void setIp65504D101FileNmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D101FileNmS = checkIp65504D101FileNmSMaxLimit(number); 
		serializeIp65504D101FileNmS(ip65504D101FileNmS);
	}

	public void setIp65504D101FileNmS(int number) {
	    number = checkIp65504D101FileNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D101FileNmS((short)number);
	}
	public void setIp65504D101FileNmS(long number) {
	    number = checkIp65504D101FileNmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D101FileNmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D101FileNmL
	 *	@return ip65504D101FileNmL
	 */
	public short getIp65504D101FileNmL() throws CFException {
        if (isIp65504D101FileNmLModified()) { 
           ip65504D101FileNmL = refreshIp65504D101FileNmL();
        }
   		return ip65504D101FileNmL;
	}
	
	/**
	 * 	Update Ip65504D101FileNmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D101-FILE-NM-L
	 *	@param number
	 */
	public void setIp65504D101FileNmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D101FileNmL = checkIp65504D101FileNmLMaxLimit(number); 
		serializeIp65504D101FileNmL(ip65504D101FileNmL);
	}

	public void setIp65504D101FileNmL(int number) {
	    number = checkIp65504D101FileNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D101FileNmL((short)number);
	}
	public void setIp65504D101FileNmL(long number) {
	    number = checkIp65504D101FileNmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D101FileNmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D102ActId1S
	 *	@return ip65504D102ActId1S
	 */
	public short getIp65504D102ActId1S() throws CFException {
        if (isIp65504D102ActId1SModified()) { 
           ip65504D102ActId1S = refreshIp65504D102ActId1S();
        }
   		return ip65504D102ActId1S;
	}
	
	/**
	 * 	Update Ip65504D102ActId1S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D102-ACT-ID1-S
	 *	@param number
	 */
	public void setIp65504D102ActId1S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D102ActId1S = checkIp65504D102ActId1SMaxLimit(number); 
		serializeIp65504D102ActId1S(ip65504D102ActId1S);
	}

	public void setIp65504D102ActId1S(int number) {
	    number = checkIp65504D102ActId1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D102ActId1S((short)number);
	}
	public void setIp65504D102ActId1S(long number) {
	    number = checkIp65504D102ActId1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D102ActId1S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D102ActId1L
	 *	@return ip65504D102ActId1L
	 */
	public short getIp65504D102ActId1L() throws CFException {
        if (isIp65504D102ActId1LModified()) { 
           ip65504D102ActId1L = refreshIp65504D102ActId1L();
        }
   		return ip65504D102ActId1L;
	}
	
	/**
	 * 	Update Ip65504D102ActId1L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D102-ACT-ID1-L
	 *	@param number
	 */
	public void setIp65504D102ActId1L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D102ActId1L = checkIp65504D102ActId1LMaxLimit(number); 
		serializeIp65504D102ActId1L(ip65504D102ActId1L);
	}

	public void setIp65504D102ActId1L(int number) {
	    number = checkIp65504D102ActId1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D102ActId1L((short)number);
	}
	public void setIp65504D102ActId1L(long number) {
	    number = checkIp65504D102ActId1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D102ActId1L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D103ActId2S
	 *	@return ip65504D103ActId2S
	 */
	public short getIp65504D103ActId2S() throws CFException {
        if (isIp65504D103ActId2SModified()) { 
           ip65504D103ActId2S = refreshIp65504D103ActId2S();
        }
   		return ip65504D103ActId2S;
	}
	
	/**
	 * 	Update Ip65504D103ActId2S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D103-ACT-ID2-S
	 *	@param number
	 */
	public void setIp65504D103ActId2S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D103ActId2S = checkIp65504D103ActId2SMaxLimit(number); 
		serializeIp65504D103ActId2S(ip65504D103ActId2S);
	}

	public void setIp65504D103ActId2S(int number) {
	    number = checkIp65504D103ActId2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D103ActId2S((short)number);
	}
	public void setIp65504D103ActId2S(long number) {
	    number = checkIp65504D103ActId2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D103ActId2S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D103ActId2L
	 *	@return ip65504D103ActId2L
	 */
	public short getIp65504D103ActId2L() throws CFException {
        if (isIp65504D103ActId2LModified()) { 
           ip65504D103ActId2L = refreshIp65504D103ActId2L();
        }
   		return ip65504D103ActId2L;
	}
	
	/**
	 * 	Update Ip65504D103ActId2L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D103-ACT-ID2-L
	 *	@param number
	 */
	public void setIp65504D103ActId2L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D103ActId2L = checkIp65504D103ActId2LMaxLimit(number); 
		serializeIp65504D103ActId2L(ip65504D103ActId2L);
	}

	public void setIp65504D103ActId2L(int number) {
	    number = checkIp65504D103ActId2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D103ActId2L((short)number);
	}
	public void setIp65504D103ActId2L(long number) {
	    number = checkIp65504D103ActId2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D103ActId2L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D104TrxDesS
	 *	@return ip65504D104TrxDesS
	 */
	public short getIp65504D104TrxDesS() throws CFException {
        if (isIp65504D104TrxDesSModified()) { 
           ip65504D104TrxDesS = refreshIp65504D104TrxDesS();
        }
   		return ip65504D104TrxDesS;
	}
	
	/**
	 * 	Update Ip65504D104TrxDesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D104-TRX-DES-S
	 *	@param number
	 */
	public void setIp65504D104TrxDesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D104TrxDesS = checkIp65504D104TrxDesSMaxLimit(number); 
		serializeIp65504D104TrxDesS(ip65504D104TrxDesS);
	}

	public void setIp65504D104TrxDesS(int number) {
	    number = checkIp65504D104TrxDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D104TrxDesS((short)number);
	}
	public void setIp65504D104TrxDesS(long number) {
	    number = checkIp65504D104TrxDesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D104TrxDesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D104TrxDesL
	 *	@return ip65504D104TrxDesL
	 */
	public short getIp65504D104TrxDesL() throws CFException {
        if (isIp65504D104TrxDesLModified()) { 
           ip65504D104TrxDesL = refreshIp65504D104TrxDesL();
        }
   		return ip65504D104TrxDesL;
	}
	
	/**
	 * 	Update Ip65504D104TrxDesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D104-TRX-DES-L
	 *	@param number
	 */
	public void setIp65504D104TrxDesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D104TrxDesL = checkIp65504D104TrxDesLMaxLimit(number); 
		serializeIp65504D104TrxDesL(ip65504D104TrxDesL);
	}

	public void setIp65504D104TrxDesL(int number) {
	    number = checkIp65504D104TrxDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D104TrxDesL((short)number);
	}
	public void setIp65504D104TrxDesL(long number) {
	    number = checkIp65504D104TrxDesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D104TrxDesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D105CrCbamS
	 *	@return ip65504D105CrCbamS
	 */
	public short getIp65504D105CrCbamS() throws CFException {
        if (isIp65504D105CrCbamSModified()) { 
           ip65504D105CrCbamS = refreshIp65504D105CrCbamS();
        }
   		return ip65504D105CrCbamS;
	}
	
	/**
	 * 	Update Ip65504D105CrCbamS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D105-CR-CBAM-S
	 *	@param number
	 */
	public void setIp65504D105CrCbamS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D105CrCbamS = checkIp65504D105CrCbamSMaxLimit(number); 
		serializeIp65504D105CrCbamS(ip65504D105CrCbamS);
	}

	public void setIp65504D105CrCbamS(int number) {
	    number = checkIp65504D105CrCbamSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D105CrCbamS((short)number);
	}
	public void setIp65504D105CrCbamS(long number) {
	    number = checkIp65504D105CrCbamSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D105CrCbamS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D105CrCbamL
	 *	@return ip65504D105CrCbamL
	 */
	public short getIp65504D105CrCbamL() throws CFException {
        if (isIp65504D105CrCbamLModified()) { 
           ip65504D105CrCbamL = refreshIp65504D105CrCbamL();
        }
   		return ip65504D105CrCbamL;
	}
	
	/**
	 * 	Update Ip65504D105CrCbamL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D105-CR-CBAM-L
	 *	@param number
	 */
	public void setIp65504D105CrCbamL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D105CrCbamL = checkIp65504D105CrCbamLMaxLimit(number); 
		serializeIp65504D105CrCbamL(ip65504D105CrCbamL);
	}

	public void setIp65504D105CrCbamL(int number) {
	    number = checkIp65504D105CrCbamLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D105CrCbamL((short)number);
	}
	public void setIp65504D105CrCbamL(long number) {
	    number = checkIp65504D105CrCbamLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D105CrCbamL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D106DbCbamS
	 *	@return ip65504D106DbCbamS
	 */
	public short getIp65504D106DbCbamS() throws CFException {
        if (isIp65504D106DbCbamSModified()) { 
           ip65504D106DbCbamS = refreshIp65504D106DbCbamS();
        }
   		return ip65504D106DbCbamS;
	}
	
	/**
	 * 	Update Ip65504D106DbCbamS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D106-DB-CBAM-S
	 *	@param number
	 */
	public void setIp65504D106DbCbamS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D106DbCbamS = checkIp65504D106DbCbamSMaxLimit(number); 
		serializeIp65504D106DbCbamS(ip65504D106DbCbamS);
	}

	public void setIp65504D106DbCbamS(int number) {
	    number = checkIp65504D106DbCbamSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D106DbCbamS((short)number);
	}
	public void setIp65504D106DbCbamS(long number) {
	    number = checkIp65504D106DbCbamSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D106DbCbamS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D106DbCbamL
	 *	@return ip65504D106DbCbamL
	 */
	public short getIp65504D106DbCbamL() throws CFException {
        if (isIp65504D106DbCbamLModified()) { 
           ip65504D106DbCbamL = refreshIp65504D106DbCbamL();
        }
   		return ip65504D106DbCbamL;
	}
	
	/**
	 * 	Update Ip65504D106DbCbamL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D106-DB-CBAM-L
	 *	@param number
	 */
	public void setIp65504D106DbCbamL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D106DbCbamL = checkIp65504D106DbCbamLMaxLimit(number); 
		serializeIp65504D106DbCbamL(ip65504D106DbCbamL);
	}

	public void setIp65504D106DbCbamL(int number) {
	    number = checkIp65504D106DbCbamLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D106DbCbamL((short)number);
	}
	public void setIp65504D106DbCbamL(long number) {
	    number = checkIp65504D106DbCbamLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D106DbCbamL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D107CrCbnoS
	 *	@return ip65504D107CrCbnoS
	 */
	public short getIp65504D107CrCbnoS() throws CFException {
        if (isIp65504D107CrCbnoSModified()) { 
           ip65504D107CrCbnoS = refreshIp65504D107CrCbnoS();
        }
   		return ip65504D107CrCbnoS;
	}
	
	/**
	 * 	Update Ip65504D107CrCbnoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D107-CR-CBNO-S
	 *	@param number
	 */
	public void setIp65504D107CrCbnoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D107CrCbnoS = checkIp65504D107CrCbnoSMaxLimit(number); 
		serializeIp65504D107CrCbnoS(ip65504D107CrCbnoS);
	}

	public void setIp65504D107CrCbnoS(int number) {
	    number = checkIp65504D107CrCbnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D107CrCbnoS((short)number);
	}
	public void setIp65504D107CrCbnoS(long number) {
	    number = checkIp65504D107CrCbnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D107CrCbnoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D107CrCbnoL
	 *	@return ip65504D107CrCbnoL
	 */
	public short getIp65504D107CrCbnoL() throws CFException {
        if (isIp65504D107CrCbnoLModified()) { 
           ip65504D107CrCbnoL = refreshIp65504D107CrCbnoL();
        }
   		return ip65504D107CrCbnoL;
	}
	
	/**
	 * 	Update Ip65504D107CrCbnoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D107-CR-CBNO-L
	 *	@param number
	 */
	public void setIp65504D107CrCbnoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D107CrCbnoL = checkIp65504D107CrCbnoLMaxLimit(number); 
		serializeIp65504D107CrCbnoL(ip65504D107CrCbnoL);
	}

	public void setIp65504D107CrCbnoL(int number) {
	    number = checkIp65504D107CrCbnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D107CrCbnoL((short)number);
	}
	public void setIp65504D107CrCbnoL(long number) {
	    number = checkIp65504D107CrCbnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D107CrCbnoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D108DbCbnoS
	 *	@return ip65504D108DbCbnoS
	 */
	public short getIp65504D108DbCbnoS() throws CFException {
        if (isIp65504D108DbCbnoSModified()) { 
           ip65504D108DbCbnoS = refreshIp65504D108DbCbnoS();
        }
   		return ip65504D108DbCbnoS;
	}
	
	/**
	 * 	Update Ip65504D108DbCbnoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D108-DB-CBNO-S
	 *	@param number
	 */
	public void setIp65504D108DbCbnoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D108DbCbnoS = checkIp65504D108DbCbnoSMaxLimit(number); 
		serializeIp65504D108DbCbnoS(ip65504D108DbCbnoS);
	}

	public void setIp65504D108DbCbnoS(int number) {
	    number = checkIp65504D108DbCbnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D108DbCbnoS((short)number);
	}
	public void setIp65504D108DbCbnoS(long number) {
	    number = checkIp65504D108DbCbnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D108DbCbnoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D108DbCbnoL
	 *	@return ip65504D108DbCbnoL
	 */
	public short getIp65504D108DbCbnoL() throws CFException {
        if (isIp65504D108DbCbnoLModified()) { 
           ip65504D108DbCbnoL = refreshIp65504D108DbCbnoL();
        }
   		return ip65504D108DbCbnoL;
	}
	
	/**
	 * 	Update Ip65504D108DbCbnoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D108-DB-CBNO-L
	 *	@param number
	 */
	public void setIp65504D108DbCbnoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D108DbCbnoL = checkIp65504D108DbCbnoLMaxLimit(number); 
		serializeIp65504D108DbCbnoL(ip65504D108DbCbnoL);
	}

	public void setIp65504D108DbCbnoL(int number) {
	    number = checkIp65504D108DbCbnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D108DbCbnoL((short)number);
	}
	public void setIp65504D108DbCbnoL(long number) {
	    number = checkIp65504D108DbCbnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D108DbCbnoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D109CrFeesS
	 *	@return ip65504D109CrFeesS
	 */
	public short getIp65504D109CrFeesS() throws CFException {
        if (isIp65504D109CrFeesSModified()) { 
           ip65504D109CrFeesS = refreshIp65504D109CrFeesS();
        }
   		return ip65504D109CrFeesS;
	}
	
	/**
	 * 	Update Ip65504D109CrFeesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D109-CR-FEES-S
	 *	@param number
	 */
	public void setIp65504D109CrFeesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D109CrFeesS = checkIp65504D109CrFeesSMaxLimit(number); 
		serializeIp65504D109CrFeesS(ip65504D109CrFeesS);
	}

	public void setIp65504D109CrFeesS(int number) {
	    number = checkIp65504D109CrFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D109CrFeesS((short)number);
	}
	public void setIp65504D109CrFeesS(long number) {
	    number = checkIp65504D109CrFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D109CrFeesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D109CrFeesL
	 *	@return ip65504D109CrFeesL
	 */
	public short getIp65504D109CrFeesL() throws CFException {
        if (isIp65504D109CrFeesLModified()) { 
           ip65504D109CrFeesL = refreshIp65504D109CrFeesL();
        }
   		return ip65504D109CrFeesL;
	}
	
	/**
	 * 	Update Ip65504D109CrFeesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D109-CR-FEES-L
	 *	@param number
	 */
	public void setIp65504D109CrFeesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D109CrFeesL = checkIp65504D109CrFeesLMaxLimit(number); 
		serializeIp65504D109CrFeesL(ip65504D109CrFeesL);
	}

	public void setIp65504D109CrFeesL(int number) {
	    number = checkIp65504D109CrFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D109CrFeesL((short)number);
	}
	public void setIp65504D109CrFeesL(long number) {
	    number = checkIp65504D109CrFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D109CrFeesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D110DbFeesS
	 *	@return ip65504D110DbFeesS
	 */
	public short getIp65504D110DbFeesS() throws CFException {
        if (isIp65504D110DbFeesSModified()) { 
           ip65504D110DbFeesS = refreshIp65504D110DbFeesS();
        }
   		return ip65504D110DbFeesS;
	}
	
	/**
	 * 	Update Ip65504D110DbFeesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D110-DB-FEES-S
	 *	@param number
	 */
	public void setIp65504D110DbFeesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D110DbFeesS = checkIp65504D110DbFeesSMaxLimit(number); 
		serializeIp65504D110DbFeesS(ip65504D110DbFeesS);
	}

	public void setIp65504D110DbFeesS(int number) {
	    number = checkIp65504D110DbFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D110DbFeesS((short)number);
	}
	public void setIp65504D110DbFeesS(long number) {
	    number = checkIp65504D110DbFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D110DbFeesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D110DbFeesL
	 *	@return ip65504D110DbFeesL
	 */
	public short getIp65504D110DbFeesL() throws CFException {
        if (isIp65504D110DbFeesLModified()) { 
           ip65504D110DbFeesL = refreshIp65504D110DbFeesL();
        }
   		return ip65504D110DbFeesL;
	}
	
	/**
	 * 	Update Ip65504D110DbFeesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D110-DB-FEES-L
	 *	@param number
	 */
	public void setIp65504D110DbFeesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D110DbFeesL = checkIp65504D110DbFeesLMaxLimit(number); 
		serializeIp65504D110DbFeesL(ip65504D110DbFeesL);
	}

	public void setIp65504D110DbFeesL(int number) {
	    number = checkIp65504D110DbFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D110DbFeesL((short)number);
	}
	public void setIp65504D110DbFeesL(long number) {
	    number = checkIp65504D110DbFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D110DbFeesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D111ReservdS
	 *	@return ip65504D111ReservdS
	 */
	public short getIp65504D111ReservdS() throws CFException {
        if (isIp65504D111ReservdSModified()) { 
           ip65504D111ReservdS = refreshIp65504D111ReservdS();
        }
   		return ip65504D111ReservdS;
	}
	
	/**
	 * 	Update Ip65504D111ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D111-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D111ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D111ReservdS = checkIp65504D111ReservdSMaxLimit(number); 
		serializeIp65504D111ReservdS(ip65504D111ReservdS);
	}

	public void setIp65504D111ReservdS(int number) {
	    number = checkIp65504D111ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D111ReservdS((short)number);
	}
	public void setIp65504D111ReservdS(long number) {
	    number = checkIp65504D111ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D111ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D111ReservdL
	 *	@return ip65504D111ReservdL
	 */
	public short getIp65504D111ReservdL() throws CFException {
        if (isIp65504D111ReservdLModified()) { 
           ip65504D111ReservdL = refreshIp65504D111ReservdL();
        }
   		return ip65504D111ReservdL;
	}
	
	/**
	 * 	Update Ip65504D111ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D111-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D111ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D111ReservdL = checkIp65504D111ReservdLMaxLimit(number); 
		serializeIp65504D111ReservdL(ip65504D111ReservdL);
	}

	public void setIp65504D111ReservdL(int number) {
	    number = checkIp65504D111ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D111ReservdL((short)number);
	}
	public void setIp65504D111ReservdL(long number) {
	    number = checkIp65504D111ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D111ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D112ReservdS
	 *	@return ip65504D112ReservdS
	 */
	public short getIp65504D112ReservdS() throws CFException {
        if (isIp65504D112ReservdSModified()) { 
           ip65504D112ReservdS = refreshIp65504D112ReservdS();
        }
   		return ip65504D112ReservdS;
	}
	
	/**
	 * 	Update Ip65504D112ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D112-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D112ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D112ReservdS = checkIp65504D112ReservdSMaxLimit(number); 
		serializeIp65504D112ReservdS(ip65504D112ReservdS);
	}

	public void setIp65504D112ReservdS(int number) {
	    number = checkIp65504D112ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D112ReservdS((short)number);
	}
	public void setIp65504D112ReservdS(long number) {
	    number = checkIp65504D112ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D112ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D112ReservdL
	 *	@return ip65504D112ReservdL
	 */
	public short getIp65504D112ReservdL() throws CFException {
        if (isIp65504D112ReservdLModified()) { 
           ip65504D112ReservdL = refreshIp65504D112ReservdL();
        }
   		return ip65504D112ReservdL;
	}
	
	/**
	 * 	Update Ip65504D112ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D112-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D112ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D112ReservdL = checkIp65504D112ReservdLMaxLimit(number); 
		serializeIp65504D112ReservdL(ip65504D112ReservdL);
	}

	public void setIp65504D112ReservdL(int number) {
	    number = checkIp65504D112ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D112ReservdL((short)number);
	}
	public void setIp65504D112ReservdL(long number) {
	    number = checkIp65504D112ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D112ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D113ReservdS
	 *	@return ip65504D113ReservdS
	 */
	public short getIp65504D113ReservdS() throws CFException {
        if (isIp65504D113ReservdSModified()) { 
           ip65504D113ReservdS = refreshIp65504D113ReservdS();
        }
   		return ip65504D113ReservdS;
	}
	
	/**
	 * 	Update Ip65504D113ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D113-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D113ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D113ReservdS = checkIp65504D113ReservdSMaxLimit(number); 
		serializeIp65504D113ReservdS(ip65504D113ReservdS);
	}

	public void setIp65504D113ReservdS(int number) {
	    number = checkIp65504D113ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D113ReservdS((short)number);
	}
	public void setIp65504D113ReservdS(long number) {
	    number = checkIp65504D113ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D113ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D113ReservdL
	 *	@return ip65504D113ReservdL
	 */
	public short getIp65504D113ReservdL() throws CFException {
        if (isIp65504D113ReservdLModified()) { 
           ip65504D113ReservdL = refreshIp65504D113ReservdL();
        }
   		return ip65504D113ReservdL;
	}
	
	/**
	 * 	Update Ip65504D113ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D113-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D113ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D113ReservdL = checkIp65504D113ReservdLMaxLimit(number); 
		serializeIp65504D113ReservdL(ip65504D113ReservdL);
	}

	public void setIp65504D113ReservdL(int number) {
	    number = checkIp65504D113ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D113ReservdL((short)number);
	}
	public void setIp65504D113ReservdL(long number) {
	    number = checkIp65504D113ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D113ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D114ReservdS
	 *	@return ip65504D114ReservdS
	 */
	public short getIp65504D114ReservdS() throws CFException {
        if (isIp65504D114ReservdSModified()) { 
           ip65504D114ReservdS = refreshIp65504D114ReservdS();
        }
   		return ip65504D114ReservdS;
	}
	
	/**
	 * 	Update Ip65504D114ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D114-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D114ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D114ReservdS = checkIp65504D114ReservdSMaxLimit(number); 
		serializeIp65504D114ReservdS(ip65504D114ReservdS);
	}

	public void setIp65504D114ReservdS(int number) {
	    number = checkIp65504D114ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D114ReservdS((short)number);
	}
	public void setIp65504D114ReservdS(long number) {
	    number = checkIp65504D114ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D114ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D114ReservdL
	 *	@return ip65504D114ReservdL
	 */
	public short getIp65504D114ReservdL() throws CFException {
        if (isIp65504D114ReservdLModified()) { 
           ip65504D114ReservdL = refreshIp65504D114ReservdL();
        }
   		return ip65504D114ReservdL;
	}
	
	/**
	 * 	Update Ip65504D114ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D114-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D114ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D114ReservdL = checkIp65504D114ReservdLMaxLimit(number); 
		serializeIp65504D114ReservdL(ip65504D114ReservdL);
	}

	public void setIp65504D114ReservdL(int number) {
	    number = checkIp65504D114ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D114ReservdL((short)number);
	}
	public void setIp65504D114ReservdL(long number) {
	    number = checkIp65504D114ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D114ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D115ReservdS
	 *	@return ip65504D115ReservdS
	 */
	public short getIp65504D115ReservdS() throws CFException {
        if (isIp65504D115ReservdSModified()) { 
           ip65504D115ReservdS = refreshIp65504D115ReservdS();
        }
   		return ip65504D115ReservdS;
	}
	
	/**
	 * 	Update Ip65504D115ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D115-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D115ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D115ReservdS = checkIp65504D115ReservdSMaxLimit(number); 
		serializeIp65504D115ReservdS(ip65504D115ReservdS);
	}

	public void setIp65504D115ReservdS(int number) {
	    number = checkIp65504D115ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D115ReservdS((short)number);
	}
	public void setIp65504D115ReservdS(long number) {
	    number = checkIp65504D115ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D115ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D115ReservdL
	 *	@return ip65504D115ReservdL
	 */
	public short getIp65504D115ReservdL() throws CFException {
        if (isIp65504D115ReservdLModified()) { 
           ip65504D115ReservdL = refreshIp65504D115ReservdL();
        }
   		return ip65504D115ReservdL;
	}
	
	/**
	 * 	Update Ip65504D115ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D115-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D115ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D115ReservdL = checkIp65504D115ReservdLMaxLimit(number); 
		serializeIp65504D115ReservdL(ip65504D115ReservdL);
	}

	public void setIp65504D115ReservdL(int number) {
	    number = checkIp65504D115ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D115ReservdL((short)number);
	}
	public void setIp65504D115ReservdL(long number) {
	    number = checkIp65504D115ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D115ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D116ReservdS
	 *	@return ip65504D116ReservdS
	 */
	public short getIp65504D116ReservdS() throws CFException {
        if (isIp65504D116ReservdSModified()) { 
           ip65504D116ReservdS = refreshIp65504D116ReservdS();
        }
   		return ip65504D116ReservdS;
	}
	
	/**
	 * 	Update Ip65504D116ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D116-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D116ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D116ReservdS = checkIp65504D116ReservdSMaxLimit(number); 
		serializeIp65504D116ReservdS(ip65504D116ReservdS);
	}

	public void setIp65504D116ReservdS(int number) {
	    number = checkIp65504D116ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D116ReservdS((short)number);
	}
	public void setIp65504D116ReservdS(long number) {
	    number = checkIp65504D116ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D116ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D116ReservdL
	 *	@return ip65504D116ReservdL
	 */
	public short getIp65504D116ReservdL() throws CFException {
        if (isIp65504D116ReservdLModified()) { 
           ip65504D116ReservdL = refreshIp65504D116ReservdL();
        }
   		return ip65504D116ReservdL;
	}
	
	/**
	 * 	Update Ip65504D116ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D116-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D116ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D116ReservdL = checkIp65504D116ReservdLMaxLimit(number); 
		serializeIp65504D116ReservdL(ip65504D116ReservdL);
	}

	public void setIp65504D116ReservdL(int number) {
	    number = checkIp65504D116ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D116ReservdL((short)number);
	}
	public void setIp65504D116ReservdL(long number) {
	    number = checkIp65504D116ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D116ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D117ReservdS
	 *	@return ip65504D117ReservdS
	 */
	public short getIp65504D117ReservdS() throws CFException {
        if (isIp65504D117ReservdSModified()) { 
           ip65504D117ReservdS = refreshIp65504D117ReservdS();
        }
   		return ip65504D117ReservdS;
	}
	
	/**
	 * 	Update Ip65504D117ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D117-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D117ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D117ReservdS = checkIp65504D117ReservdSMaxLimit(number); 
		serializeIp65504D117ReservdS(ip65504D117ReservdS);
	}

	public void setIp65504D117ReservdS(int number) {
	    number = checkIp65504D117ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D117ReservdS((short)number);
	}
	public void setIp65504D117ReservdS(long number) {
	    number = checkIp65504D117ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D117ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D117ReservdL
	 *	@return ip65504D117ReservdL
	 */
	public short getIp65504D117ReservdL() throws CFException {
        if (isIp65504D117ReservdLModified()) { 
           ip65504D117ReservdL = refreshIp65504D117ReservdL();
        }
   		return ip65504D117ReservdL;
	}
	
	/**
	 * 	Update Ip65504D117ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D117-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D117ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D117ReservdL = checkIp65504D117ReservdLMaxLimit(number); 
		serializeIp65504D117ReservdL(ip65504D117ReservdL);
	}

	public void setIp65504D117ReservdL(int number) {
	    number = checkIp65504D117ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D117ReservdL((short)number);
	}
	public void setIp65504D117ReservdL(long number) {
	    number = checkIp65504D117ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D117ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D118ReservdS
	 *	@return ip65504D118ReservdS
	 */
	public short getIp65504D118ReservdS() throws CFException {
        if (isIp65504D118ReservdSModified()) { 
           ip65504D118ReservdS = refreshIp65504D118ReservdS();
        }
   		return ip65504D118ReservdS;
	}
	
	/**
	 * 	Update Ip65504D118ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D118-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D118ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D118ReservdS = checkIp65504D118ReservdSMaxLimit(number); 
		serializeIp65504D118ReservdS(ip65504D118ReservdS);
	}

	public void setIp65504D118ReservdS(int number) {
	    number = checkIp65504D118ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D118ReservdS((short)number);
	}
	public void setIp65504D118ReservdS(long number) {
	    number = checkIp65504D118ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D118ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D118ReservdL
	 *	@return ip65504D118ReservdL
	 */
	public short getIp65504D118ReservdL() throws CFException {
        if (isIp65504D118ReservdLModified()) { 
           ip65504D118ReservdL = refreshIp65504D118ReservdL();
        }
   		return ip65504D118ReservdL;
	}
	
	/**
	 * 	Update Ip65504D118ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D118-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D118ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D118ReservdL = checkIp65504D118ReservdLMaxLimit(number); 
		serializeIp65504D118ReservdL(ip65504D118ReservdL);
	}

	public void setIp65504D118ReservdL(int number) {
	    number = checkIp65504D118ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D118ReservdL((short)number);
	}
	public void setIp65504D118ReservdL(long number) {
	    number = checkIp65504D118ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D118ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D119ReservdS
	 *	@return ip65504D119ReservdS
	 */
	public short getIp65504D119ReservdS() throws CFException {
        if (isIp65504D119ReservdSModified()) { 
           ip65504D119ReservdS = refreshIp65504D119ReservdS();
        }
   		return ip65504D119ReservdS;
	}
	
	/**
	 * 	Update Ip65504D119ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D119-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D119ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D119ReservdS = checkIp65504D119ReservdSMaxLimit(number); 
		serializeIp65504D119ReservdS(ip65504D119ReservdS);
	}

	public void setIp65504D119ReservdS(int number) {
	    number = checkIp65504D119ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D119ReservdS((short)number);
	}
	public void setIp65504D119ReservdS(long number) {
	    number = checkIp65504D119ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D119ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D119ReservdL
	 *	@return ip65504D119ReservdL
	 */
	public short getIp65504D119ReservdL() throws CFException {
        if (isIp65504D119ReservdLModified()) { 
           ip65504D119ReservdL = refreshIp65504D119ReservdL();
        }
   		return ip65504D119ReservdL;
	}
	
	/**
	 * 	Update Ip65504D119ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D119-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D119ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D119ReservdL = checkIp65504D119ReservdLMaxLimit(number); 
		serializeIp65504D119ReservdL(ip65504D119ReservdL);
	}

	public void setIp65504D119ReservdL(int number) {
	    number = checkIp65504D119ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D119ReservdL((short)number);
	}
	public void setIp65504D119ReservdL(long number) {
	    number = checkIp65504D119ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D119ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D120ReservdS
	 *	@return ip65504D120ReservdS
	 */
	public short getIp65504D120ReservdS() throws CFException {
        if (isIp65504D120ReservdSModified()) { 
           ip65504D120ReservdS = refreshIp65504D120ReservdS();
        }
   		return ip65504D120ReservdS;
	}
	
	/**
	 * 	Update Ip65504D120ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D120-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D120ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D120ReservdS = checkIp65504D120ReservdSMaxLimit(number); 
		serializeIp65504D120ReservdS(ip65504D120ReservdS);
	}

	public void setIp65504D120ReservdS(int number) {
	    number = checkIp65504D120ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D120ReservdS((short)number);
	}
	public void setIp65504D120ReservdS(long number) {
	    number = checkIp65504D120ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D120ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D120ReservdL
	 *	@return ip65504D120ReservdL
	 */
	public short getIp65504D120ReservdL() throws CFException {
        if (isIp65504D120ReservdLModified()) { 
           ip65504D120ReservdL = refreshIp65504D120ReservdL();
        }
   		return ip65504D120ReservdL;
	}
	
	/**
	 * 	Update Ip65504D120ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D120-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D120ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D120ReservdL = checkIp65504D120ReservdLMaxLimit(number); 
		serializeIp65504D120ReservdL(ip65504D120ReservdL);
	}

	public void setIp65504D120ReservdL(int number) {
	    number = checkIp65504D120ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D120ReservdL((short)number);
	}
	public void setIp65504D120ReservdL(long number) {
	    number = checkIp65504D120ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D120ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D121Addtl2S
	 *	@return ip65504D121Addtl2S
	 */
	public short getIp65504D121Addtl2S() throws CFException {
        if (isIp65504D121Addtl2SModified()) { 
           ip65504D121Addtl2S = refreshIp65504D121Addtl2S();
        }
   		return ip65504D121Addtl2S;
	}
	
	/**
	 * 	Update Ip65504D121Addtl2S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D121-ADDTL-2-S
	 *	@param number
	 */
	public void setIp65504D121Addtl2S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D121Addtl2S = checkIp65504D121Addtl2SMaxLimit(number); 
		serializeIp65504D121Addtl2S(ip65504D121Addtl2S);
	}

	public void setIp65504D121Addtl2S(int number) {
	    number = checkIp65504D121Addtl2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D121Addtl2S((short)number);
	}
	public void setIp65504D121Addtl2S(long number) {
	    number = checkIp65504D121Addtl2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D121Addtl2S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D121Addtl2L
	 *	@return ip65504D121Addtl2L
	 */
	public short getIp65504D121Addtl2L() throws CFException {
        if (isIp65504D121Addtl2LModified()) { 
           ip65504D121Addtl2L = refreshIp65504D121Addtl2L();
        }
   		return ip65504D121Addtl2L;
	}
	
	/**
	 * 	Update Ip65504D121Addtl2L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D121-ADDTL-2-L
	 *	@param number
	 */
	public void setIp65504D121Addtl2L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D121Addtl2L = checkIp65504D121Addtl2LMaxLimit(number); 
		serializeIp65504D121Addtl2L(ip65504D121Addtl2L);
	}

	public void setIp65504D121Addtl2L(int number) {
	    number = checkIp65504D121Addtl2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D121Addtl2L((short)number);
	}
	public void setIp65504D121Addtl2L(long number) {
	    number = checkIp65504D121Addtl2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D121Addtl2L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D122Addtl3S
	 *	@return ip65504D122Addtl3S
	 */
	public short getIp65504D122Addtl3S() throws CFException {
        if (isIp65504D122Addtl3SModified()) { 
           ip65504D122Addtl3S = refreshIp65504D122Addtl3S();
        }
   		return ip65504D122Addtl3S;
	}
	
	/**
	 * 	Update Ip65504D122Addtl3S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D122-ADDTL-3-S
	 *	@param number
	 */
	public void setIp65504D122Addtl3S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D122Addtl3S = checkIp65504D122Addtl3SMaxLimit(number); 
		serializeIp65504D122Addtl3S(ip65504D122Addtl3S);
	}

	public void setIp65504D122Addtl3S(int number) {
	    number = checkIp65504D122Addtl3SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D122Addtl3S((short)number);
	}
	public void setIp65504D122Addtl3S(long number) {
	    number = checkIp65504D122Addtl3SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D122Addtl3S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D122Addtl3L
	 *	@return ip65504D122Addtl3L
	 */
	public short getIp65504D122Addtl3L() throws CFException {
        if (isIp65504D122Addtl3LModified()) { 
           ip65504D122Addtl3L = refreshIp65504D122Addtl3L();
        }
   		return ip65504D122Addtl3L;
	}
	
	/**
	 * 	Update Ip65504D122Addtl3L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D122-ADDTL-3-L
	 *	@param number
	 */
	public void setIp65504D122Addtl3L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D122Addtl3L = checkIp65504D122Addtl3LMaxLimit(number); 
		serializeIp65504D122Addtl3L(ip65504D122Addtl3L);
	}

	public void setIp65504D122Addtl3L(int number) {
	    number = checkIp65504D122Addtl3LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D122Addtl3L((short)number);
	}
	public void setIp65504D122Addtl3L(long number) {
	    number = checkIp65504D122Addtl3LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D122Addtl3L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D123Addtl4S
	 *	@return ip65504D123Addtl4S
	 */
	public short getIp65504D123Addtl4S() throws CFException {
        if (isIp65504D123Addtl4SModified()) { 
           ip65504D123Addtl4S = refreshIp65504D123Addtl4S();
        }
   		return ip65504D123Addtl4S;
	}
	
	/**
	 * 	Update Ip65504D123Addtl4S with the passed value
	 *  Corresponding COBOL Variable is IP65504-D123-ADDTL-4-S
	 *	@param number
	 */
	public void setIp65504D123Addtl4S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D123Addtl4S = checkIp65504D123Addtl4SMaxLimit(number); 
		serializeIp65504D123Addtl4S(ip65504D123Addtl4S);
	}

	public void setIp65504D123Addtl4S(int number) {
	    number = checkIp65504D123Addtl4SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D123Addtl4S((short)number);
	}
	public void setIp65504D123Addtl4S(long number) {
	    number = checkIp65504D123Addtl4SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D123Addtl4S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D123Addtl4L
	 *	@return ip65504D123Addtl4L
	 */
	public short getIp65504D123Addtl4L() throws CFException {
        if (isIp65504D123Addtl4LModified()) { 
           ip65504D123Addtl4L = refreshIp65504D123Addtl4L();
        }
   		return ip65504D123Addtl4L;
	}
	
	/**
	 * 	Update Ip65504D123Addtl4L with the passed value
	 *  Corresponding COBOL Variable is IP65504-D123-ADDTL-4-L
	 *	@param number
	 */
	public void setIp65504D123Addtl4L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D123Addtl4L = checkIp65504D123Addtl4LMaxLimit(number); 
		serializeIp65504D123Addtl4L(ip65504D123Addtl4L);
	}

	public void setIp65504D123Addtl4L(int number) {
	    number = checkIp65504D123Addtl4LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D123Addtl4L((short)number);
	}
	public void setIp65504D123Addtl4L(long number) {
	    number = checkIp65504D123Addtl4LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D123Addtl4L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D124ReservdS
	 *	@return ip65504D124ReservdS
	 */
	public short getIp65504D124ReservdS() throws CFException {
        if (isIp65504D124ReservdSModified()) { 
           ip65504D124ReservdS = refreshIp65504D124ReservdS();
        }
   		return ip65504D124ReservdS;
	}
	
	/**
	 * 	Update Ip65504D124ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D124-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D124ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D124ReservdS = checkIp65504D124ReservdSMaxLimit(number); 
		serializeIp65504D124ReservdS(ip65504D124ReservdS);
	}

	public void setIp65504D124ReservdS(int number) {
	    number = checkIp65504D124ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D124ReservdS((short)number);
	}
	public void setIp65504D124ReservdS(long number) {
	    number = checkIp65504D124ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D124ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D124ReservdL
	 *	@return ip65504D124ReservdL
	 */
	public short getIp65504D124ReservdL() throws CFException {
        if (isIp65504D124ReservdLModified()) { 
           ip65504D124ReservdL = refreshIp65504D124ReservdL();
        }
   		return ip65504D124ReservdL;
	}
	
	/**
	 * 	Update Ip65504D124ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D124-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D124ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D124ReservdL = checkIp65504D124ReservdLMaxLimit(number); 
		serializeIp65504D124ReservdL(ip65504D124ReservdL);
	}

	public void setIp65504D124ReservdL(int number) {
	    number = checkIp65504D124ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D124ReservdL((short)number);
	}
	public void setIp65504D124ReservdL(long number) {
	    number = checkIp65504D124ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D124ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504DeNamesLargeGroup4
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504D94TrxOidS((short)0);
         	setIp65504D94TrxOidL((short)0);
         	setIp65504D95CardIsS((short)0);
         	setIp65504D95CardIsL((short)0);
         	setIp65504D96KeyMgtS((short)0);
         	setIp65504D96KeyMgtL((short)0);
         	setIp65504D97NetAmtS((short)0);
         	setIp65504D97NetAmtL((short)0);
         	setIp65504D98PayeeXS((short)0);
         	setIp65504D98PayeeXL((short)0);
         	setIp65504D99StlInsS((short)0);
         	setIp65504D99StlInsL((short)0);
         	setIp65504D100RecInsS((short)0);
         	setIp65504D100RecInsL((short)0);
         	setIp65504D101FileNmS((short)0);
         	setIp65504D101FileNmL((short)0);
         	setIp65504D102ActId1S((short)0);
         	setIp65504D102ActId1L((short)0);
         	setIp65504D103ActId2S((short)0);
         	setIp65504D103ActId2L((short)0);
         	setIp65504D104TrxDesS((short)0);
         	setIp65504D104TrxDesL((short)0);
         	setIp65504D105CrCbamS((short)0);
         	setIp65504D105CrCbamL((short)0);
         	setIp65504D106DbCbamS((short)0);
         	setIp65504D106DbCbamL((short)0);
         	setIp65504D107CrCbnoS((short)0);
         	setIp65504D107CrCbnoL((short)0);
         	setIp65504D108DbCbnoS((short)0);
         	setIp65504D108DbCbnoL((short)0);
         	setIp65504D109CrFeesS((short)0);
         	setIp65504D109CrFeesL((short)0);
         	setIp65504D110DbFeesS((short)0);
         	setIp65504D110DbFeesL((short)0);
         	setIp65504D111ReservdS((short)0);
         	setIp65504D111ReservdL((short)0);
         	setIp65504D112ReservdS((short)0);
         	setIp65504D112ReservdL((short)0);
         	setIp65504D113ReservdS((short)0);
         	setIp65504D113ReservdL((short)0);
         	setIp65504D114ReservdS((short)0);
         	setIp65504D114ReservdL((short)0);
         	setIp65504D115ReservdS((short)0);
         	setIp65504D115ReservdL((short)0);
         	setIp65504D116ReservdS((short)0);
         	setIp65504D116ReservdL((short)0);
         	setIp65504D117ReservdS((short)0);
         	setIp65504D117ReservdL((short)0);
         	setIp65504D118ReservdS((short)0);
         	setIp65504D118ReservdL((short)0);
         	setIp65504D119ReservdS((short)0);
         	setIp65504D119ReservdL((short)0);
         	setIp65504D120ReservdS((short)0);
         	setIp65504D120ReservdL((short)0);
         	setIp65504D121Addtl2S((short)0);
         	setIp65504D121Addtl2L((short)0);
         	setIp65504D122Addtl3S((short)0);
         	setIp65504D122Addtl3L((short)0);
         	setIp65504D123Addtl4S((short)0);
         	setIp65504D123Addtl4L((short)0);
         	setIp65504D124ReservdS((short)0);
         	setIp65504D124ReservdL((short)0);
   }

		public static int getIp65504DeNamesLargeGroup4FieldLength() {
			return IP_65504_DE_NAMES_LARGE_GROUP_4_LENGTH;
		}

}
  
