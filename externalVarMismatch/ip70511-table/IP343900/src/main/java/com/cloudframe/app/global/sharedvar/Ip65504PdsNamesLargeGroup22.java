package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup22 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup22 extends Ip65504PdsNamesLargeGroup22Serialized { 
   

								private short ip65504P652TaxtypeS;

								private short ip65504P652TaxtypeL;


								private short ip65504P653TaxAmtS;

								private short ip65504P653TaxAmtL;


								private short ip65504P654DbcdInS;

								private short ip65504P654DbcdInL;


								private short ip65504P655ReservdS;

								private short ip65504P655ReservdL;


								private short ip65504P656AltTaxS;

								private short ip65504P656AltTaxL;


								private short ip65504P657ReservdS;

								private short ip65504P657ReservdL;


								private short ip65504P658ReservdS;

								private short ip65504P658ReservdL;


								private short ip65504P659ReservdS;

								private short ip65504P659ReservdL;


								private short ip65504P660ReservdS;

								private short ip65504P660ReservdL;


								private short ip65504P661ReservdS;

								private short ip65504P661ReservdL;


								private short ip65504P662ReservdS;

								private short ip65504P662ReservdL;


								private short ip65504P663FreefrmS;

								private short ip65504P663FreefrmL;


								private short ip65504P664ReservdS;

								private short ip65504P664ReservdL;


								private short ip65504P665ReservdS;

								private short ip65504P665ReservdL;


								private short ip65504P666ReservdS;

								private short ip65504P666ReservdL;


								private short ip65504P667ReservdS;

								private short ip65504P667ReservdL;


								private short ip65504P668ReservdS;

								private short ip65504P668ReservdL;


								private short ip65504P669ReservdS;

								private short ip65504P669ReservdL;


								private short ip65504P670PayNamIdS;

								private short ip65504P670PayNamIdL;


								private short ip65504P671DofReqS;

								private short ip65504P671DofReqL;


								private short ip65504P672RcptNamS;

								private short ip65504P672RcptNamL;


								private short ip65504P673DtRcptFundS;

								private short ip65504P673DtRcptFundL;


								private short ip65504P674AdlTrcRefNoS;

								private short ip65504P674AdlTrcRefNoL;


								private short ip65504P675AdlTrnsDescS;

								private short ip65504P675AdlTrnsDescL;


								private short ip65504P676CardAccVatnoS;

								private short ip65504P676CardAccVatnoL;


								private short ip65504P677CustVatNoS;

								private short ip65504P677CustVatNoL;


								private short ip65504P678UniqInvNoS;

								private short ip65504P678UniqInvNoL;


								private short ip65504P679CommodityCodeS;

								private short ip65504P679CommodityCodeL;


								private short ip65504P680AuthContNameS;

								private short ip65504P680AuthContNameL;


								private short ip65504P681AuthContPhonS;

								private short ip65504P681AuthContPhonL;


								private short ip65504P682TaxAmount3S;

								private short ip65504P682TaxAmount3L;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup22
	**/
    public Ip65504PdsNamesLargeGroup22() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup22. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup22(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P652TaxtypeS
	 *	@return ip65504P652TaxtypeS
	 */
	public short getIp65504P652TaxtypeS() throws CFException {
        if (isIp65504P652TaxtypeSModified()) { 
           ip65504P652TaxtypeS = refreshIp65504P652TaxtypeS();
        }
   		return ip65504P652TaxtypeS;
	}
	
	/**
	 * 	Update Ip65504P652TaxtypeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P652-TAXTYPE-S
	 *	@param number
	 */
	public void setIp65504P652TaxtypeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P652TaxtypeS = checkIp65504P652TaxtypeSMaxLimit(number); 
		serializeIp65504P652TaxtypeS(ip65504P652TaxtypeS);
	}

	public void setIp65504P652TaxtypeS(int number) {
	    number = checkIp65504P652TaxtypeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P652TaxtypeS((short)number);
	}
	public void setIp65504P652TaxtypeS(long number) {
	    number = checkIp65504P652TaxtypeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P652TaxtypeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P652TaxtypeL
	 *	@return ip65504P652TaxtypeL
	 */
	public short getIp65504P652TaxtypeL() throws CFException {
        if (isIp65504P652TaxtypeLModified()) { 
           ip65504P652TaxtypeL = refreshIp65504P652TaxtypeL();
        }
   		return ip65504P652TaxtypeL;
	}
	
	/**
	 * 	Update Ip65504P652TaxtypeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P652-TAXTYPE-L
	 *	@param number
	 */
	public void setIp65504P652TaxtypeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P652TaxtypeL = checkIp65504P652TaxtypeLMaxLimit(number); 
		serializeIp65504P652TaxtypeL(ip65504P652TaxtypeL);
	}

	public void setIp65504P652TaxtypeL(int number) {
	    number = checkIp65504P652TaxtypeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P652TaxtypeL((short)number);
	}
	public void setIp65504P652TaxtypeL(long number) {
	    number = checkIp65504P652TaxtypeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P652TaxtypeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P653TaxAmtS
	 *	@return ip65504P653TaxAmtS
	 */
	public short getIp65504P653TaxAmtS() throws CFException {
        if (isIp65504P653TaxAmtSModified()) { 
           ip65504P653TaxAmtS = refreshIp65504P653TaxAmtS();
        }
   		return ip65504P653TaxAmtS;
	}
	
	/**
	 * 	Update Ip65504P653TaxAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P653-TAX-AMT-S
	 *	@param number
	 */
	public void setIp65504P653TaxAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P653TaxAmtS = checkIp65504P653TaxAmtSMaxLimit(number); 
		serializeIp65504P653TaxAmtS(ip65504P653TaxAmtS);
	}

	public void setIp65504P653TaxAmtS(int number) {
	    number = checkIp65504P653TaxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P653TaxAmtS((short)number);
	}
	public void setIp65504P653TaxAmtS(long number) {
	    number = checkIp65504P653TaxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P653TaxAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P653TaxAmtL
	 *	@return ip65504P653TaxAmtL
	 */
	public short getIp65504P653TaxAmtL() throws CFException {
        if (isIp65504P653TaxAmtLModified()) { 
           ip65504P653TaxAmtL = refreshIp65504P653TaxAmtL();
        }
   		return ip65504P653TaxAmtL;
	}
	
	/**
	 * 	Update Ip65504P653TaxAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P653-TAX-AMT-L
	 *	@param number
	 */
	public void setIp65504P653TaxAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P653TaxAmtL = checkIp65504P653TaxAmtLMaxLimit(number); 
		serializeIp65504P653TaxAmtL(ip65504P653TaxAmtL);
	}

	public void setIp65504P653TaxAmtL(int number) {
	    number = checkIp65504P653TaxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P653TaxAmtL((short)number);
	}
	public void setIp65504P653TaxAmtL(long number) {
	    number = checkIp65504P653TaxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P653TaxAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P654DbcdInS
	 *	@return ip65504P654DbcdInS
	 */
	public short getIp65504P654DbcdInS() throws CFException {
        if (isIp65504P654DbcdInSModified()) { 
           ip65504P654DbcdInS = refreshIp65504P654DbcdInS();
        }
   		return ip65504P654DbcdInS;
	}
	
	/**
	 * 	Update Ip65504P654DbcdInS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P654-DBCD-IN-S
	 *	@param number
	 */
	public void setIp65504P654DbcdInS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P654DbcdInS = checkIp65504P654DbcdInSMaxLimit(number); 
		serializeIp65504P654DbcdInS(ip65504P654DbcdInS);
	}

	public void setIp65504P654DbcdInS(int number) {
	    number = checkIp65504P654DbcdInSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P654DbcdInS((short)number);
	}
	public void setIp65504P654DbcdInS(long number) {
	    number = checkIp65504P654DbcdInSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P654DbcdInS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P654DbcdInL
	 *	@return ip65504P654DbcdInL
	 */
	public short getIp65504P654DbcdInL() throws CFException {
        if (isIp65504P654DbcdInLModified()) { 
           ip65504P654DbcdInL = refreshIp65504P654DbcdInL();
        }
   		return ip65504P654DbcdInL;
	}
	
	/**
	 * 	Update Ip65504P654DbcdInL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P654-DBCD-IN-L
	 *	@param number
	 */
	public void setIp65504P654DbcdInL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P654DbcdInL = checkIp65504P654DbcdInLMaxLimit(number); 
		serializeIp65504P654DbcdInL(ip65504P654DbcdInL);
	}

	public void setIp65504P654DbcdInL(int number) {
	    number = checkIp65504P654DbcdInLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P654DbcdInL((short)number);
	}
	public void setIp65504P654DbcdInL(long number) {
	    number = checkIp65504P654DbcdInLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P654DbcdInL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P655ReservdS
	 *	@return ip65504P655ReservdS
	 */
	public short getIp65504P655ReservdS() throws CFException {
        if (isIp65504P655ReservdSModified()) { 
           ip65504P655ReservdS = refreshIp65504P655ReservdS();
        }
   		return ip65504P655ReservdS;
	}
	
	/**
	 * 	Update Ip65504P655ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P655-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P655ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P655ReservdS = checkIp65504P655ReservdSMaxLimit(number); 
		serializeIp65504P655ReservdS(ip65504P655ReservdS);
	}

	public void setIp65504P655ReservdS(int number) {
	    number = checkIp65504P655ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P655ReservdS((short)number);
	}
	public void setIp65504P655ReservdS(long number) {
	    number = checkIp65504P655ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P655ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P655ReservdL
	 *	@return ip65504P655ReservdL
	 */
	public short getIp65504P655ReservdL() throws CFException {
        if (isIp65504P655ReservdLModified()) { 
           ip65504P655ReservdL = refreshIp65504P655ReservdL();
        }
   		return ip65504P655ReservdL;
	}
	
	/**
	 * 	Update Ip65504P655ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P655-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P655ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P655ReservdL = checkIp65504P655ReservdLMaxLimit(number); 
		serializeIp65504P655ReservdL(ip65504P655ReservdL);
	}

	public void setIp65504P655ReservdL(int number) {
	    number = checkIp65504P655ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P655ReservdL((short)number);
	}
	public void setIp65504P655ReservdL(long number) {
	    number = checkIp65504P655ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P655ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P656AltTaxS
	 *	@return ip65504P656AltTaxS
	 */
	public short getIp65504P656AltTaxS() throws CFException {
        if (isIp65504P656AltTaxSModified()) { 
           ip65504P656AltTaxS = refreshIp65504P656AltTaxS();
        }
   		return ip65504P656AltTaxS;
	}
	
	/**
	 * 	Update Ip65504P656AltTaxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P656-ALT-TAX-S
	 *	@param number
	 */
	public void setIp65504P656AltTaxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P656AltTaxS = checkIp65504P656AltTaxSMaxLimit(number); 
		serializeIp65504P656AltTaxS(ip65504P656AltTaxS);
	}

	public void setIp65504P656AltTaxS(int number) {
	    number = checkIp65504P656AltTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P656AltTaxS((short)number);
	}
	public void setIp65504P656AltTaxS(long number) {
	    number = checkIp65504P656AltTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P656AltTaxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P656AltTaxL
	 *	@return ip65504P656AltTaxL
	 */
	public short getIp65504P656AltTaxL() throws CFException {
        if (isIp65504P656AltTaxLModified()) { 
           ip65504P656AltTaxL = refreshIp65504P656AltTaxL();
        }
   		return ip65504P656AltTaxL;
	}
	
	/**
	 * 	Update Ip65504P656AltTaxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P656-ALT-TAX-L
	 *	@param number
	 */
	public void setIp65504P656AltTaxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P656AltTaxL = checkIp65504P656AltTaxLMaxLimit(number); 
		serializeIp65504P656AltTaxL(ip65504P656AltTaxL);
	}

	public void setIp65504P656AltTaxL(int number) {
	    number = checkIp65504P656AltTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P656AltTaxL((short)number);
	}
	public void setIp65504P656AltTaxL(long number) {
	    number = checkIp65504P656AltTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P656AltTaxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P657ReservdS
	 *	@return ip65504P657ReservdS
	 */
	public short getIp65504P657ReservdS() throws CFException {
        if (isIp65504P657ReservdSModified()) { 
           ip65504P657ReservdS = refreshIp65504P657ReservdS();
        }
   		return ip65504P657ReservdS;
	}
	
	/**
	 * 	Update Ip65504P657ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P657-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P657ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P657ReservdS = checkIp65504P657ReservdSMaxLimit(number); 
		serializeIp65504P657ReservdS(ip65504P657ReservdS);
	}

	public void setIp65504P657ReservdS(int number) {
	    number = checkIp65504P657ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P657ReservdS((short)number);
	}
	public void setIp65504P657ReservdS(long number) {
	    number = checkIp65504P657ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P657ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P657ReservdL
	 *	@return ip65504P657ReservdL
	 */
	public short getIp65504P657ReservdL() throws CFException {
        if (isIp65504P657ReservdLModified()) { 
           ip65504P657ReservdL = refreshIp65504P657ReservdL();
        }
   		return ip65504P657ReservdL;
	}
	
	/**
	 * 	Update Ip65504P657ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P657-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P657ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P657ReservdL = checkIp65504P657ReservdLMaxLimit(number); 
		serializeIp65504P657ReservdL(ip65504P657ReservdL);
	}

	public void setIp65504P657ReservdL(int number) {
	    number = checkIp65504P657ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P657ReservdL((short)number);
	}
	public void setIp65504P657ReservdL(long number) {
	    number = checkIp65504P657ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P657ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P658ReservdS
	 *	@return ip65504P658ReservdS
	 */
	public short getIp65504P658ReservdS() throws CFException {
        if (isIp65504P658ReservdSModified()) { 
           ip65504P658ReservdS = refreshIp65504P658ReservdS();
        }
   		return ip65504P658ReservdS;
	}
	
	/**
	 * 	Update Ip65504P658ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P658-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P658ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P658ReservdS = checkIp65504P658ReservdSMaxLimit(number); 
		serializeIp65504P658ReservdS(ip65504P658ReservdS);
	}

	public void setIp65504P658ReservdS(int number) {
	    number = checkIp65504P658ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P658ReservdS((short)number);
	}
	public void setIp65504P658ReservdS(long number) {
	    number = checkIp65504P658ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P658ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P658ReservdL
	 *	@return ip65504P658ReservdL
	 */
	public short getIp65504P658ReservdL() throws CFException {
        if (isIp65504P658ReservdLModified()) { 
           ip65504P658ReservdL = refreshIp65504P658ReservdL();
        }
   		return ip65504P658ReservdL;
	}
	
	/**
	 * 	Update Ip65504P658ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P658-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P658ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P658ReservdL = checkIp65504P658ReservdLMaxLimit(number); 
		serializeIp65504P658ReservdL(ip65504P658ReservdL);
	}

	public void setIp65504P658ReservdL(int number) {
	    number = checkIp65504P658ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P658ReservdL((short)number);
	}
	public void setIp65504P658ReservdL(long number) {
	    number = checkIp65504P658ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P658ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P659ReservdS
	 *	@return ip65504P659ReservdS
	 */
	public short getIp65504P659ReservdS() throws CFException {
        if (isIp65504P659ReservdSModified()) { 
           ip65504P659ReservdS = refreshIp65504P659ReservdS();
        }
   		return ip65504P659ReservdS;
	}
	
	/**
	 * 	Update Ip65504P659ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P659-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P659ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P659ReservdS = checkIp65504P659ReservdSMaxLimit(number); 
		serializeIp65504P659ReservdS(ip65504P659ReservdS);
	}

	public void setIp65504P659ReservdS(int number) {
	    number = checkIp65504P659ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P659ReservdS((short)number);
	}
	public void setIp65504P659ReservdS(long number) {
	    number = checkIp65504P659ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P659ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P659ReservdL
	 *	@return ip65504P659ReservdL
	 */
	public short getIp65504P659ReservdL() throws CFException {
        if (isIp65504P659ReservdLModified()) { 
           ip65504P659ReservdL = refreshIp65504P659ReservdL();
        }
   		return ip65504P659ReservdL;
	}
	
	/**
	 * 	Update Ip65504P659ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P659-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P659ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P659ReservdL = checkIp65504P659ReservdLMaxLimit(number); 
		serializeIp65504P659ReservdL(ip65504P659ReservdL);
	}

	public void setIp65504P659ReservdL(int number) {
	    number = checkIp65504P659ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P659ReservdL((short)number);
	}
	public void setIp65504P659ReservdL(long number) {
	    number = checkIp65504P659ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P659ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P660ReservdS
	 *	@return ip65504P660ReservdS
	 */
	public short getIp65504P660ReservdS() throws CFException {
        if (isIp65504P660ReservdSModified()) { 
           ip65504P660ReservdS = refreshIp65504P660ReservdS();
        }
   		return ip65504P660ReservdS;
	}
	
	/**
	 * 	Update Ip65504P660ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P660-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P660ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P660ReservdS = checkIp65504P660ReservdSMaxLimit(number); 
		serializeIp65504P660ReservdS(ip65504P660ReservdS);
	}

	public void setIp65504P660ReservdS(int number) {
	    number = checkIp65504P660ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P660ReservdS((short)number);
	}
	public void setIp65504P660ReservdS(long number) {
	    number = checkIp65504P660ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P660ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P660ReservdL
	 *	@return ip65504P660ReservdL
	 */
	public short getIp65504P660ReservdL() throws CFException {
        if (isIp65504P660ReservdLModified()) { 
           ip65504P660ReservdL = refreshIp65504P660ReservdL();
        }
   		return ip65504P660ReservdL;
	}
	
	/**
	 * 	Update Ip65504P660ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P660-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P660ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P660ReservdL = checkIp65504P660ReservdLMaxLimit(number); 
		serializeIp65504P660ReservdL(ip65504P660ReservdL);
	}

	public void setIp65504P660ReservdL(int number) {
	    number = checkIp65504P660ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P660ReservdL((short)number);
	}
	public void setIp65504P660ReservdL(long number) {
	    number = checkIp65504P660ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P660ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P661ReservdS
	 *	@return ip65504P661ReservdS
	 */
	public short getIp65504P661ReservdS() throws CFException {
        if (isIp65504P661ReservdSModified()) { 
           ip65504P661ReservdS = refreshIp65504P661ReservdS();
        }
   		return ip65504P661ReservdS;
	}
	
	/**
	 * 	Update Ip65504P661ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P661-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P661ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P661ReservdS = checkIp65504P661ReservdSMaxLimit(number); 
		serializeIp65504P661ReservdS(ip65504P661ReservdS);
	}

	public void setIp65504P661ReservdS(int number) {
	    number = checkIp65504P661ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P661ReservdS((short)number);
	}
	public void setIp65504P661ReservdS(long number) {
	    number = checkIp65504P661ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P661ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P661ReservdL
	 *	@return ip65504P661ReservdL
	 */
	public short getIp65504P661ReservdL() throws CFException {
        if (isIp65504P661ReservdLModified()) { 
           ip65504P661ReservdL = refreshIp65504P661ReservdL();
        }
   		return ip65504P661ReservdL;
	}
	
	/**
	 * 	Update Ip65504P661ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P661-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P661ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P661ReservdL = checkIp65504P661ReservdLMaxLimit(number); 
		serializeIp65504P661ReservdL(ip65504P661ReservdL);
	}

	public void setIp65504P661ReservdL(int number) {
	    number = checkIp65504P661ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P661ReservdL((short)number);
	}
	public void setIp65504P661ReservdL(long number) {
	    number = checkIp65504P661ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P661ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P662ReservdS
	 *	@return ip65504P662ReservdS
	 */
	public short getIp65504P662ReservdS() throws CFException {
        if (isIp65504P662ReservdSModified()) { 
           ip65504P662ReservdS = refreshIp65504P662ReservdS();
        }
   		return ip65504P662ReservdS;
	}
	
	/**
	 * 	Update Ip65504P662ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P662-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P662ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P662ReservdS = checkIp65504P662ReservdSMaxLimit(number); 
		serializeIp65504P662ReservdS(ip65504P662ReservdS);
	}

	public void setIp65504P662ReservdS(int number) {
	    number = checkIp65504P662ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P662ReservdS((short)number);
	}
	public void setIp65504P662ReservdS(long number) {
	    number = checkIp65504P662ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P662ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P662ReservdL
	 *	@return ip65504P662ReservdL
	 */
	public short getIp65504P662ReservdL() throws CFException {
        if (isIp65504P662ReservdLModified()) { 
           ip65504P662ReservdL = refreshIp65504P662ReservdL();
        }
   		return ip65504P662ReservdL;
	}
	
	/**
	 * 	Update Ip65504P662ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P662-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P662ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P662ReservdL = checkIp65504P662ReservdLMaxLimit(number); 
		serializeIp65504P662ReservdL(ip65504P662ReservdL);
	}

	public void setIp65504P662ReservdL(int number) {
	    number = checkIp65504P662ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P662ReservdL((short)number);
	}
	public void setIp65504P662ReservdL(long number) {
	    number = checkIp65504P662ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P662ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P663FreefrmS
	 *	@return ip65504P663FreefrmS
	 */
	public short getIp65504P663FreefrmS() throws CFException {
        if (isIp65504P663FreefrmSModified()) { 
           ip65504P663FreefrmS = refreshIp65504P663FreefrmS();
        }
   		return ip65504P663FreefrmS;
	}
	
	/**
	 * 	Update Ip65504P663FreefrmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P663-FREEFRM-S
	 *	@param number
	 */
	public void setIp65504P663FreefrmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P663FreefrmS = checkIp65504P663FreefrmSMaxLimit(number); 
		serializeIp65504P663FreefrmS(ip65504P663FreefrmS);
	}

	public void setIp65504P663FreefrmS(int number) {
	    number = checkIp65504P663FreefrmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P663FreefrmS((short)number);
	}
	public void setIp65504P663FreefrmS(long number) {
	    number = checkIp65504P663FreefrmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P663FreefrmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P663FreefrmL
	 *	@return ip65504P663FreefrmL
	 */
	public short getIp65504P663FreefrmL() throws CFException {
        if (isIp65504P663FreefrmLModified()) { 
           ip65504P663FreefrmL = refreshIp65504P663FreefrmL();
        }
   		return ip65504P663FreefrmL;
	}
	
	/**
	 * 	Update Ip65504P663FreefrmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P663-FREEFRM-L
	 *	@param number
	 */
	public void setIp65504P663FreefrmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P663FreefrmL = checkIp65504P663FreefrmLMaxLimit(number); 
		serializeIp65504P663FreefrmL(ip65504P663FreefrmL);
	}

	public void setIp65504P663FreefrmL(int number) {
	    number = checkIp65504P663FreefrmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P663FreefrmL((short)number);
	}
	public void setIp65504P663FreefrmL(long number) {
	    number = checkIp65504P663FreefrmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P663FreefrmL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P664ReservdS
	 *	@return ip65504P664ReservdS
	 */
	public short getIp65504P664ReservdS() throws CFException {
        if (isIp65504P664ReservdSModified()) { 
           ip65504P664ReservdS = refreshIp65504P664ReservdS();
        }
   		return ip65504P664ReservdS;
	}
	
	/**
	 * 	Update Ip65504P664ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P664-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P664ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P664ReservdS = checkIp65504P664ReservdSMaxLimit(number); 
		serializeIp65504P664ReservdS(ip65504P664ReservdS);
	}

	public void setIp65504P664ReservdS(int number) {
	    number = checkIp65504P664ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P664ReservdS((short)number);
	}
	public void setIp65504P664ReservdS(long number) {
	    number = checkIp65504P664ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P664ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P664ReservdL
	 *	@return ip65504P664ReservdL
	 */
	public short getIp65504P664ReservdL() throws CFException {
        if (isIp65504P664ReservdLModified()) { 
           ip65504P664ReservdL = refreshIp65504P664ReservdL();
        }
   		return ip65504P664ReservdL;
	}
	
	/**
	 * 	Update Ip65504P664ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P664-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P664ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P664ReservdL = checkIp65504P664ReservdLMaxLimit(number); 
		serializeIp65504P664ReservdL(ip65504P664ReservdL);
	}

	public void setIp65504P664ReservdL(int number) {
	    number = checkIp65504P664ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P664ReservdL((short)number);
	}
	public void setIp65504P664ReservdL(long number) {
	    number = checkIp65504P664ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P664ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P665ReservdS
	 *	@return ip65504P665ReservdS
	 */
	public short getIp65504P665ReservdS() throws CFException {
        if (isIp65504P665ReservdSModified()) { 
           ip65504P665ReservdS = refreshIp65504P665ReservdS();
        }
   		return ip65504P665ReservdS;
	}
	
	/**
	 * 	Update Ip65504P665ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P665-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P665ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P665ReservdS = checkIp65504P665ReservdSMaxLimit(number); 
		serializeIp65504P665ReservdS(ip65504P665ReservdS);
	}

	public void setIp65504P665ReservdS(int number) {
	    number = checkIp65504P665ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P665ReservdS((short)number);
	}
	public void setIp65504P665ReservdS(long number) {
	    number = checkIp65504P665ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P665ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P665ReservdL
	 *	@return ip65504P665ReservdL
	 */
	public short getIp65504P665ReservdL() throws CFException {
        if (isIp65504P665ReservdLModified()) { 
           ip65504P665ReservdL = refreshIp65504P665ReservdL();
        }
   		return ip65504P665ReservdL;
	}
	
	/**
	 * 	Update Ip65504P665ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P665-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P665ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P665ReservdL = checkIp65504P665ReservdLMaxLimit(number); 
		serializeIp65504P665ReservdL(ip65504P665ReservdL);
	}

	public void setIp65504P665ReservdL(int number) {
	    number = checkIp65504P665ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P665ReservdL((short)number);
	}
	public void setIp65504P665ReservdL(long number) {
	    number = checkIp65504P665ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P665ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P666ReservdS
	 *	@return ip65504P666ReservdS
	 */
	public short getIp65504P666ReservdS() throws CFException {
        if (isIp65504P666ReservdSModified()) { 
           ip65504P666ReservdS = refreshIp65504P666ReservdS();
        }
   		return ip65504P666ReservdS;
	}
	
	/**
	 * 	Update Ip65504P666ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P666-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P666ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P666ReservdS = checkIp65504P666ReservdSMaxLimit(number); 
		serializeIp65504P666ReservdS(ip65504P666ReservdS);
	}

	public void setIp65504P666ReservdS(int number) {
	    number = checkIp65504P666ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P666ReservdS((short)number);
	}
	public void setIp65504P666ReservdS(long number) {
	    number = checkIp65504P666ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P666ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P666ReservdL
	 *	@return ip65504P666ReservdL
	 */
	public short getIp65504P666ReservdL() throws CFException {
        if (isIp65504P666ReservdLModified()) { 
           ip65504P666ReservdL = refreshIp65504P666ReservdL();
        }
   		return ip65504P666ReservdL;
	}
	
	/**
	 * 	Update Ip65504P666ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P666-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P666ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P666ReservdL = checkIp65504P666ReservdLMaxLimit(number); 
		serializeIp65504P666ReservdL(ip65504P666ReservdL);
	}

	public void setIp65504P666ReservdL(int number) {
	    number = checkIp65504P666ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P666ReservdL((short)number);
	}
	public void setIp65504P666ReservdL(long number) {
	    number = checkIp65504P666ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P666ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P667ReservdS
	 *	@return ip65504P667ReservdS
	 */
	public short getIp65504P667ReservdS() throws CFException {
        if (isIp65504P667ReservdSModified()) { 
           ip65504P667ReservdS = refreshIp65504P667ReservdS();
        }
   		return ip65504P667ReservdS;
	}
	
	/**
	 * 	Update Ip65504P667ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P667-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P667ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P667ReservdS = checkIp65504P667ReservdSMaxLimit(number); 
		serializeIp65504P667ReservdS(ip65504P667ReservdS);
	}

	public void setIp65504P667ReservdS(int number) {
	    number = checkIp65504P667ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P667ReservdS((short)number);
	}
	public void setIp65504P667ReservdS(long number) {
	    number = checkIp65504P667ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P667ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P667ReservdL
	 *	@return ip65504P667ReservdL
	 */
	public short getIp65504P667ReservdL() throws CFException {
        if (isIp65504P667ReservdLModified()) { 
           ip65504P667ReservdL = refreshIp65504P667ReservdL();
        }
   		return ip65504P667ReservdL;
	}
	
	/**
	 * 	Update Ip65504P667ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P667-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P667ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P667ReservdL = checkIp65504P667ReservdLMaxLimit(number); 
		serializeIp65504P667ReservdL(ip65504P667ReservdL);
	}

	public void setIp65504P667ReservdL(int number) {
	    number = checkIp65504P667ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P667ReservdL((short)number);
	}
	public void setIp65504P667ReservdL(long number) {
	    number = checkIp65504P667ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P667ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P668ReservdS
	 *	@return ip65504P668ReservdS
	 */
	public short getIp65504P668ReservdS() throws CFException {
        if (isIp65504P668ReservdSModified()) { 
           ip65504P668ReservdS = refreshIp65504P668ReservdS();
        }
   		return ip65504P668ReservdS;
	}
	
	/**
	 * 	Update Ip65504P668ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P668-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P668ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P668ReservdS = checkIp65504P668ReservdSMaxLimit(number); 
		serializeIp65504P668ReservdS(ip65504P668ReservdS);
	}

	public void setIp65504P668ReservdS(int number) {
	    number = checkIp65504P668ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P668ReservdS((short)number);
	}
	public void setIp65504P668ReservdS(long number) {
	    number = checkIp65504P668ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P668ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P668ReservdL
	 *	@return ip65504P668ReservdL
	 */
	public short getIp65504P668ReservdL() throws CFException {
        if (isIp65504P668ReservdLModified()) { 
           ip65504P668ReservdL = refreshIp65504P668ReservdL();
        }
   		return ip65504P668ReservdL;
	}
	
	/**
	 * 	Update Ip65504P668ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P668-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P668ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P668ReservdL = checkIp65504P668ReservdLMaxLimit(number); 
		serializeIp65504P668ReservdL(ip65504P668ReservdL);
	}

	public void setIp65504P668ReservdL(int number) {
	    number = checkIp65504P668ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P668ReservdL((short)number);
	}
	public void setIp65504P668ReservdL(long number) {
	    number = checkIp65504P668ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P668ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P669ReservdS
	 *	@return ip65504P669ReservdS
	 */
	public short getIp65504P669ReservdS() throws CFException {
        if (isIp65504P669ReservdSModified()) { 
           ip65504P669ReservdS = refreshIp65504P669ReservdS();
        }
   		return ip65504P669ReservdS;
	}
	
	/**
	 * 	Update Ip65504P669ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P669-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P669ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P669ReservdS = checkIp65504P669ReservdSMaxLimit(number); 
		serializeIp65504P669ReservdS(ip65504P669ReservdS);
	}

	public void setIp65504P669ReservdS(int number) {
	    number = checkIp65504P669ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P669ReservdS((short)number);
	}
	public void setIp65504P669ReservdS(long number) {
	    number = checkIp65504P669ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P669ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P669ReservdL
	 *	@return ip65504P669ReservdL
	 */
	public short getIp65504P669ReservdL() throws CFException {
        if (isIp65504P669ReservdLModified()) { 
           ip65504P669ReservdL = refreshIp65504P669ReservdL();
        }
   		return ip65504P669ReservdL;
	}
	
	/**
	 * 	Update Ip65504P669ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P669-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P669ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P669ReservdL = checkIp65504P669ReservdLMaxLimit(number); 
		serializeIp65504P669ReservdL(ip65504P669ReservdL);
	}

	public void setIp65504P669ReservdL(int number) {
	    number = checkIp65504P669ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P669ReservdL((short)number);
	}
	public void setIp65504P669ReservdL(long number) {
	    number = checkIp65504P669ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P669ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P670PayNamIdS
	 *	@return ip65504P670PayNamIdS
	 */
	public short getIp65504P670PayNamIdS() throws CFException {
        if (isIp65504P670PayNamIdSModified()) { 
           ip65504P670PayNamIdS = refreshIp65504P670PayNamIdS();
        }
   		return ip65504P670PayNamIdS;
	}
	
	/**
	 * 	Update Ip65504P670PayNamIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P670-PAY-NAM-ID-S
	 *	@param number
	 */
	public void setIp65504P670PayNamIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P670PayNamIdS = checkIp65504P670PayNamIdSMaxLimit(number); 
		serializeIp65504P670PayNamIdS(ip65504P670PayNamIdS);
	}

	public void setIp65504P670PayNamIdS(int number) {
	    number = checkIp65504P670PayNamIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P670PayNamIdS((short)number);
	}
	public void setIp65504P670PayNamIdS(long number) {
	    number = checkIp65504P670PayNamIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P670PayNamIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P670PayNamIdL
	 *	@return ip65504P670PayNamIdL
	 */
	public short getIp65504P670PayNamIdL() throws CFException {
        if (isIp65504P670PayNamIdLModified()) { 
           ip65504P670PayNamIdL = refreshIp65504P670PayNamIdL();
        }
   		return ip65504P670PayNamIdL;
	}
	
	/**
	 * 	Update Ip65504P670PayNamIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P670-PAY-NAM-ID-L
	 *	@param number
	 */
	public void setIp65504P670PayNamIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P670PayNamIdL = checkIp65504P670PayNamIdLMaxLimit(number); 
		serializeIp65504P670PayNamIdL(ip65504P670PayNamIdL);
	}

	public void setIp65504P670PayNamIdL(int number) {
	    number = checkIp65504P670PayNamIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P670PayNamIdL((short)number);
	}
	public void setIp65504P670PayNamIdL(long number) {
	    number = checkIp65504P670PayNamIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P670PayNamIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P671DofReqS
	 *	@return ip65504P671DofReqS
	 */
	public short getIp65504P671DofReqS() throws CFException {
        if (isIp65504P671DofReqSModified()) { 
           ip65504P671DofReqS = refreshIp65504P671DofReqS();
        }
   		return ip65504P671DofReqS;
	}
	
	/**
	 * 	Update Ip65504P671DofReqS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P671-DOF-REQ-S
	 *	@param number
	 */
	public void setIp65504P671DofReqS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P671DofReqS = checkIp65504P671DofReqSMaxLimit(number); 
		serializeIp65504P671DofReqS(ip65504P671DofReqS);
	}

	public void setIp65504P671DofReqS(int number) {
	    number = checkIp65504P671DofReqSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P671DofReqS((short)number);
	}
	public void setIp65504P671DofReqS(long number) {
	    number = checkIp65504P671DofReqSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P671DofReqS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P671DofReqL
	 *	@return ip65504P671DofReqL
	 */
	public short getIp65504P671DofReqL() throws CFException {
        if (isIp65504P671DofReqLModified()) { 
           ip65504P671DofReqL = refreshIp65504P671DofReqL();
        }
   		return ip65504P671DofReqL;
	}
	
	/**
	 * 	Update Ip65504P671DofReqL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P671-DOF-REQ-L
	 *	@param number
	 */
	public void setIp65504P671DofReqL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P671DofReqL = checkIp65504P671DofReqLMaxLimit(number); 
		serializeIp65504P671DofReqL(ip65504P671DofReqL);
	}

	public void setIp65504P671DofReqL(int number) {
	    number = checkIp65504P671DofReqLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P671DofReqL((short)number);
	}
	public void setIp65504P671DofReqL(long number) {
	    number = checkIp65504P671DofReqLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P671DofReqL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P672RcptNamS
	 *	@return ip65504P672RcptNamS
	 */
	public short getIp65504P672RcptNamS() throws CFException {
        if (isIp65504P672RcptNamSModified()) { 
           ip65504P672RcptNamS = refreshIp65504P672RcptNamS();
        }
   		return ip65504P672RcptNamS;
	}
	
	/**
	 * 	Update Ip65504P672RcptNamS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P672-RCPT-NAM-S
	 *	@param number
	 */
	public void setIp65504P672RcptNamS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P672RcptNamS = checkIp65504P672RcptNamSMaxLimit(number); 
		serializeIp65504P672RcptNamS(ip65504P672RcptNamS);
	}

	public void setIp65504P672RcptNamS(int number) {
	    number = checkIp65504P672RcptNamSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P672RcptNamS((short)number);
	}
	public void setIp65504P672RcptNamS(long number) {
	    number = checkIp65504P672RcptNamSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P672RcptNamS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P672RcptNamL
	 *	@return ip65504P672RcptNamL
	 */
	public short getIp65504P672RcptNamL() throws CFException {
        if (isIp65504P672RcptNamLModified()) { 
           ip65504P672RcptNamL = refreshIp65504P672RcptNamL();
        }
   		return ip65504P672RcptNamL;
	}
	
	/**
	 * 	Update Ip65504P672RcptNamL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P672-RCPT-NAM-L
	 *	@param number
	 */
	public void setIp65504P672RcptNamL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P672RcptNamL = checkIp65504P672RcptNamLMaxLimit(number); 
		serializeIp65504P672RcptNamL(ip65504P672RcptNamL);
	}

	public void setIp65504P672RcptNamL(int number) {
	    number = checkIp65504P672RcptNamLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P672RcptNamL((short)number);
	}
	public void setIp65504P672RcptNamL(long number) {
	    number = checkIp65504P672RcptNamLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P672RcptNamL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P673DtRcptFundS
	 *	@return ip65504P673DtRcptFundS
	 */
	public short getIp65504P673DtRcptFundS() throws CFException {
        if (isIp65504P673DtRcptFundSModified()) { 
           ip65504P673DtRcptFundS = refreshIp65504P673DtRcptFundS();
        }
   		return ip65504P673DtRcptFundS;
	}
	
	/**
	 * 	Update Ip65504P673DtRcptFundS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P673-DT-RCPT-FUND-S
	 *	@param number
	 */
	public void setIp65504P673DtRcptFundS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P673DtRcptFundS = checkIp65504P673DtRcptFundSMaxLimit(number); 
		serializeIp65504P673DtRcptFundS(ip65504P673DtRcptFundS);
	}

	public void setIp65504P673DtRcptFundS(int number) {
	    number = checkIp65504P673DtRcptFundSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P673DtRcptFundS((short)number);
	}
	public void setIp65504P673DtRcptFundS(long number) {
	    number = checkIp65504P673DtRcptFundSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P673DtRcptFundS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P673DtRcptFundL
	 *	@return ip65504P673DtRcptFundL
	 */
	public short getIp65504P673DtRcptFundL() throws CFException {
        if (isIp65504P673DtRcptFundLModified()) { 
           ip65504P673DtRcptFundL = refreshIp65504P673DtRcptFundL();
        }
   		return ip65504P673DtRcptFundL;
	}
	
	/**
	 * 	Update Ip65504P673DtRcptFundL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P673-DT-RCPT-FUND-L
	 *	@param number
	 */
	public void setIp65504P673DtRcptFundL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P673DtRcptFundL = checkIp65504P673DtRcptFundLMaxLimit(number); 
		serializeIp65504P673DtRcptFundL(ip65504P673DtRcptFundL);
	}

	public void setIp65504P673DtRcptFundL(int number) {
	    number = checkIp65504P673DtRcptFundLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P673DtRcptFundL((short)number);
	}
	public void setIp65504P673DtRcptFundL(long number) {
	    number = checkIp65504P673DtRcptFundLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P673DtRcptFundL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P674AdlTrcRefNoS
	 *	@return ip65504P674AdlTrcRefNoS
	 */
	public short getIp65504P674AdlTrcRefNoS() throws CFException {
        if (isIp65504P674AdlTrcRefNoSModified()) { 
           ip65504P674AdlTrcRefNoS = refreshIp65504P674AdlTrcRefNoS();
        }
   		return ip65504P674AdlTrcRefNoS;
	}
	
	/**
	 * 	Update Ip65504P674AdlTrcRefNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P674-ADL-TRC-REF-NO-S
	 *	@param number
	 */
	public void setIp65504P674AdlTrcRefNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P674AdlTrcRefNoS = checkIp65504P674AdlTrcRefNoSMaxLimit(number); 
		serializeIp65504P674AdlTrcRefNoS(ip65504P674AdlTrcRefNoS);
	}

	public void setIp65504P674AdlTrcRefNoS(int number) {
	    number = checkIp65504P674AdlTrcRefNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P674AdlTrcRefNoS((short)number);
	}
	public void setIp65504P674AdlTrcRefNoS(long number) {
	    number = checkIp65504P674AdlTrcRefNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P674AdlTrcRefNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P674AdlTrcRefNoL
	 *	@return ip65504P674AdlTrcRefNoL
	 */
	public short getIp65504P674AdlTrcRefNoL() throws CFException {
        if (isIp65504P674AdlTrcRefNoLModified()) { 
           ip65504P674AdlTrcRefNoL = refreshIp65504P674AdlTrcRefNoL();
        }
   		return ip65504P674AdlTrcRefNoL;
	}
	
	/**
	 * 	Update Ip65504P674AdlTrcRefNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P674-ADL-TRC-REF-NO-L
	 *	@param number
	 */
	public void setIp65504P674AdlTrcRefNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P674AdlTrcRefNoL = checkIp65504P674AdlTrcRefNoLMaxLimit(number); 
		serializeIp65504P674AdlTrcRefNoL(ip65504P674AdlTrcRefNoL);
	}

	public void setIp65504P674AdlTrcRefNoL(int number) {
	    number = checkIp65504P674AdlTrcRefNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P674AdlTrcRefNoL((short)number);
	}
	public void setIp65504P674AdlTrcRefNoL(long number) {
	    number = checkIp65504P674AdlTrcRefNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P674AdlTrcRefNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P675AdlTrnsDescS
	 *	@return ip65504P675AdlTrnsDescS
	 */
	public short getIp65504P675AdlTrnsDescS() throws CFException {
        if (isIp65504P675AdlTrnsDescSModified()) { 
           ip65504P675AdlTrnsDescS = refreshIp65504P675AdlTrnsDescS();
        }
   		return ip65504P675AdlTrnsDescS;
	}
	
	/**
	 * 	Update Ip65504P675AdlTrnsDescS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P675-ADL-TRNS-DESC-S
	 *	@param number
	 */
	public void setIp65504P675AdlTrnsDescS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P675AdlTrnsDescS = checkIp65504P675AdlTrnsDescSMaxLimit(number); 
		serializeIp65504P675AdlTrnsDescS(ip65504P675AdlTrnsDescS);
	}

	public void setIp65504P675AdlTrnsDescS(int number) {
	    number = checkIp65504P675AdlTrnsDescSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P675AdlTrnsDescS((short)number);
	}
	public void setIp65504P675AdlTrnsDescS(long number) {
	    number = checkIp65504P675AdlTrnsDescSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P675AdlTrnsDescS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P675AdlTrnsDescL
	 *	@return ip65504P675AdlTrnsDescL
	 */
	public short getIp65504P675AdlTrnsDescL() throws CFException {
        if (isIp65504P675AdlTrnsDescLModified()) { 
           ip65504P675AdlTrnsDescL = refreshIp65504P675AdlTrnsDescL();
        }
   		return ip65504P675AdlTrnsDescL;
	}
	
	/**
	 * 	Update Ip65504P675AdlTrnsDescL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P675-ADL-TRNS-DESC-L
	 *	@param number
	 */
	public void setIp65504P675AdlTrnsDescL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P675AdlTrnsDescL = checkIp65504P675AdlTrnsDescLMaxLimit(number); 
		serializeIp65504P675AdlTrnsDescL(ip65504P675AdlTrnsDescL);
	}

	public void setIp65504P675AdlTrnsDescL(int number) {
	    number = checkIp65504P675AdlTrnsDescLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P675AdlTrnsDescL((short)number);
	}
	public void setIp65504P675AdlTrnsDescL(long number) {
	    number = checkIp65504P675AdlTrnsDescLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P675AdlTrnsDescL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P676CardAccVatnoS
	 *	@return ip65504P676CardAccVatnoS
	 */
	public short getIp65504P676CardAccVatnoS() throws CFException {
        if (isIp65504P676CardAccVatnoSModified()) { 
           ip65504P676CardAccVatnoS = refreshIp65504P676CardAccVatnoS();
        }
   		return ip65504P676CardAccVatnoS;
	}
	
	/**
	 * 	Update Ip65504P676CardAccVatnoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P676-CARD-ACC-VATNO-S
	 *	@param number
	 */
	public void setIp65504P676CardAccVatnoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P676CardAccVatnoS = checkIp65504P676CardAccVatnoSMaxLimit(number); 
		serializeIp65504P676CardAccVatnoS(ip65504P676CardAccVatnoS);
	}

	public void setIp65504P676CardAccVatnoS(int number) {
	    number = checkIp65504P676CardAccVatnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P676CardAccVatnoS((short)number);
	}
	public void setIp65504P676CardAccVatnoS(long number) {
	    number = checkIp65504P676CardAccVatnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P676CardAccVatnoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P676CardAccVatnoL
	 *	@return ip65504P676CardAccVatnoL
	 */
	public short getIp65504P676CardAccVatnoL() throws CFException {
        if (isIp65504P676CardAccVatnoLModified()) { 
           ip65504P676CardAccVatnoL = refreshIp65504P676CardAccVatnoL();
        }
   		return ip65504P676CardAccVatnoL;
	}
	
	/**
	 * 	Update Ip65504P676CardAccVatnoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P676-CARD-ACC-VATNO-L
	 *	@param number
	 */
	public void setIp65504P676CardAccVatnoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P676CardAccVatnoL = checkIp65504P676CardAccVatnoLMaxLimit(number); 
		serializeIp65504P676CardAccVatnoL(ip65504P676CardAccVatnoL);
	}

	public void setIp65504P676CardAccVatnoL(int number) {
	    number = checkIp65504P676CardAccVatnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P676CardAccVatnoL((short)number);
	}
	public void setIp65504P676CardAccVatnoL(long number) {
	    number = checkIp65504P676CardAccVatnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P676CardAccVatnoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P677CustVatNoS
	 *	@return ip65504P677CustVatNoS
	 */
	public short getIp65504P677CustVatNoS() throws CFException {
        if (isIp65504P677CustVatNoSModified()) { 
           ip65504P677CustVatNoS = refreshIp65504P677CustVatNoS();
        }
   		return ip65504P677CustVatNoS;
	}
	
	/**
	 * 	Update Ip65504P677CustVatNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P677-CUST-VAT-NO-S
	 *	@param number
	 */
	public void setIp65504P677CustVatNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P677CustVatNoS = checkIp65504P677CustVatNoSMaxLimit(number); 
		serializeIp65504P677CustVatNoS(ip65504P677CustVatNoS);
	}

	public void setIp65504P677CustVatNoS(int number) {
	    number = checkIp65504P677CustVatNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P677CustVatNoS((short)number);
	}
	public void setIp65504P677CustVatNoS(long number) {
	    number = checkIp65504P677CustVatNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P677CustVatNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P677CustVatNoL
	 *	@return ip65504P677CustVatNoL
	 */
	public short getIp65504P677CustVatNoL() throws CFException {
        if (isIp65504P677CustVatNoLModified()) { 
           ip65504P677CustVatNoL = refreshIp65504P677CustVatNoL();
        }
   		return ip65504P677CustVatNoL;
	}
	
	/**
	 * 	Update Ip65504P677CustVatNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P677-CUST-VAT-NO-L
	 *	@param number
	 */
	public void setIp65504P677CustVatNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P677CustVatNoL = checkIp65504P677CustVatNoLMaxLimit(number); 
		serializeIp65504P677CustVatNoL(ip65504P677CustVatNoL);
	}

	public void setIp65504P677CustVatNoL(int number) {
	    number = checkIp65504P677CustVatNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P677CustVatNoL((short)number);
	}
	public void setIp65504P677CustVatNoL(long number) {
	    number = checkIp65504P677CustVatNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P677CustVatNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P678UniqInvNoS
	 *	@return ip65504P678UniqInvNoS
	 */
	public short getIp65504P678UniqInvNoS() throws CFException {
        if (isIp65504P678UniqInvNoSModified()) { 
           ip65504P678UniqInvNoS = refreshIp65504P678UniqInvNoS();
        }
   		return ip65504P678UniqInvNoS;
	}
	
	/**
	 * 	Update Ip65504P678UniqInvNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P678-UNIQ-INV-NO-S
	 *	@param number
	 */
	public void setIp65504P678UniqInvNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P678UniqInvNoS = checkIp65504P678UniqInvNoSMaxLimit(number); 
		serializeIp65504P678UniqInvNoS(ip65504P678UniqInvNoS);
	}

	public void setIp65504P678UniqInvNoS(int number) {
	    number = checkIp65504P678UniqInvNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P678UniqInvNoS((short)number);
	}
	public void setIp65504P678UniqInvNoS(long number) {
	    number = checkIp65504P678UniqInvNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P678UniqInvNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P678UniqInvNoL
	 *	@return ip65504P678UniqInvNoL
	 */
	public short getIp65504P678UniqInvNoL() throws CFException {
        if (isIp65504P678UniqInvNoLModified()) { 
           ip65504P678UniqInvNoL = refreshIp65504P678UniqInvNoL();
        }
   		return ip65504P678UniqInvNoL;
	}
	
	/**
	 * 	Update Ip65504P678UniqInvNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P678-UNIQ-INV-NO-L
	 *	@param number
	 */
	public void setIp65504P678UniqInvNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P678UniqInvNoL = checkIp65504P678UniqInvNoLMaxLimit(number); 
		serializeIp65504P678UniqInvNoL(ip65504P678UniqInvNoL);
	}

	public void setIp65504P678UniqInvNoL(int number) {
	    number = checkIp65504P678UniqInvNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P678UniqInvNoL((short)number);
	}
	public void setIp65504P678UniqInvNoL(long number) {
	    number = checkIp65504P678UniqInvNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P678UniqInvNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P679CommodityCodeS
	 *	@return ip65504P679CommodityCodeS
	 */
	public short getIp65504P679CommodityCodeS() throws CFException {
        if (isIp65504P679CommodityCodeSModified()) { 
           ip65504P679CommodityCodeS = refreshIp65504P679CommodityCodeS();
        }
   		return ip65504P679CommodityCodeS;
	}
	
	/**
	 * 	Update Ip65504P679CommodityCodeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P679-COMMODITY-CODE-S
	 *	@param number
	 */
	public void setIp65504P679CommodityCodeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P679CommodityCodeS = checkIp65504P679CommodityCodeSMaxLimit(number); 
		serializeIp65504P679CommodityCodeS(ip65504P679CommodityCodeS);
	}

	public void setIp65504P679CommodityCodeS(int number) {
	    number = checkIp65504P679CommodityCodeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P679CommodityCodeS((short)number);
	}
	public void setIp65504P679CommodityCodeS(long number) {
	    number = checkIp65504P679CommodityCodeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P679CommodityCodeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P679CommodityCodeL
	 *	@return ip65504P679CommodityCodeL
	 */
	public short getIp65504P679CommodityCodeL() throws CFException {
        if (isIp65504P679CommodityCodeLModified()) { 
           ip65504P679CommodityCodeL = refreshIp65504P679CommodityCodeL();
        }
   		return ip65504P679CommodityCodeL;
	}
	
	/**
	 * 	Update Ip65504P679CommodityCodeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P679-COMMODITY-CODE-L
	 *	@param number
	 */
	public void setIp65504P679CommodityCodeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P679CommodityCodeL = checkIp65504P679CommodityCodeLMaxLimit(number); 
		serializeIp65504P679CommodityCodeL(ip65504P679CommodityCodeL);
	}

	public void setIp65504P679CommodityCodeL(int number) {
	    number = checkIp65504P679CommodityCodeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P679CommodityCodeL((short)number);
	}
	public void setIp65504P679CommodityCodeL(long number) {
	    number = checkIp65504P679CommodityCodeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P679CommodityCodeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P680AuthContNameS
	 *	@return ip65504P680AuthContNameS
	 */
	public short getIp65504P680AuthContNameS() throws CFException {
        if (isIp65504P680AuthContNameSModified()) { 
           ip65504P680AuthContNameS = refreshIp65504P680AuthContNameS();
        }
   		return ip65504P680AuthContNameS;
	}
	
	/**
	 * 	Update Ip65504P680AuthContNameS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P680-AUTH-CONT-NAME-S
	 *	@param number
	 */
	public void setIp65504P680AuthContNameS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P680AuthContNameS = checkIp65504P680AuthContNameSMaxLimit(number); 
		serializeIp65504P680AuthContNameS(ip65504P680AuthContNameS);
	}

	public void setIp65504P680AuthContNameS(int number) {
	    number = checkIp65504P680AuthContNameSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P680AuthContNameS((short)number);
	}
	public void setIp65504P680AuthContNameS(long number) {
	    number = checkIp65504P680AuthContNameSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P680AuthContNameS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P680AuthContNameL
	 *	@return ip65504P680AuthContNameL
	 */
	public short getIp65504P680AuthContNameL() throws CFException {
        if (isIp65504P680AuthContNameLModified()) { 
           ip65504P680AuthContNameL = refreshIp65504P680AuthContNameL();
        }
   		return ip65504P680AuthContNameL;
	}
	
	/**
	 * 	Update Ip65504P680AuthContNameL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P680-AUTH-CONT-NAME-L
	 *	@param number
	 */
	public void setIp65504P680AuthContNameL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P680AuthContNameL = checkIp65504P680AuthContNameLMaxLimit(number); 
		serializeIp65504P680AuthContNameL(ip65504P680AuthContNameL);
	}

	public void setIp65504P680AuthContNameL(int number) {
	    number = checkIp65504P680AuthContNameLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P680AuthContNameL((short)number);
	}
	public void setIp65504P680AuthContNameL(long number) {
	    number = checkIp65504P680AuthContNameLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P680AuthContNameL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P681AuthContPhonS
	 *	@return ip65504P681AuthContPhonS
	 */
	public short getIp65504P681AuthContPhonS() throws CFException {
        if (isIp65504P681AuthContPhonSModified()) { 
           ip65504P681AuthContPhonS = refreshIp65504P681AuthContPhonS();
        }
   		return ip65504P681AuthContPhonS;
	}
	
	/**
	 * 	Update Ip65504P681AuthContPhonS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P681-AUTH-CONT-PHON-S
	 *	@param number
	 */
	public void setIp65504P681AuthContPhonS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P681AuthContPhonS = checkIp65504P681AuthContPhonSMaxLimit(number); 
		serializeIp65504P681AuthContPhonS(ip65504P681AuthContPhonS);
	}

	public void setIp65504P681AuthContPhonS(int number) {
	    number = checkIp65504P681AuthContPhonSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P681AuthContPhonS((short)number);
	}
	public void setIp65504P681AuthContPhonS(long number) {
	    number = checkIp65504P681AuthContPhonSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P681AuthContPhonS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P681AuthContPhonL
	 *	@return ip65504P681AuthContPhonL
	 */
	public short getIp65504P681AuthContPhonL() throws CFException {
        if (isIp65504P681AuthContPhonLModified()) { 
           ip65504P681AuthContPhonL = refreshIp65504P681AuthContPhonL();
        }
   		return ip65504P681AuthContPhonL;
	}
	
	/**
	 * 	Update Ip65504P681AuthContPhonL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P681-AUTH-CONT-PHON-L
	 *	@param number
	 */
	public void setIp65504P681AuthContPhonL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P681AuthContPhonL = checkIp65504P681AuthContPhonLMaxLimit(number); 
		serializeIp65504P681AuthContPhonL(ip65504P681AuthContPhonL);
	}

	public void setIp65504P681AuthContPhonL(int number) {
	    number = checkIp65504P681AuthContPhonLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P681AuthContPhonL((short)number);
	}
	public void setIp65504P681AuthContPhonL(long number) {
	    number = checkIp65504P681AuthContPhonLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P681AuthContPhonL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P682TaxAmount3S
	 *	@return ip65504P682TaxAmount3S
	 */
	public short getIp65504P682TaxAmount3S() throws CFException {
        if (isIp65504P682TaxAmount3SModified()) { 
           ip65504P682TaxAmount3S = refreshIp65504P682TaxAmount3S();
        }
   		return ip65504P682TaxAmount3S;
	}
	
	/**
	 * 	Update Ip65504P682TaxAmount3S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P682-TAX-AMOUNT3-S
	 *	@param number
	 */
	public void setIp65504P682TaxAmount3S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P682TaxAmount3S = checkIp65504P682TaxAmount3SMaxLimit(number); 
		serializeIp65504P682TaxAmount3S(ip65504P682TaxAmount3S);
	}

	public void setIp65504P682TaxAmount3S(int number) {
	    number = checkIp65504P682TaxAmount3SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P682TaxAmount3S((short)number);
	}
	public void setIp65504P682TaxAmount3S(long number) {
	    number = checkIp65504P682TaxAmount3SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P682TaxAmount3S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P682TaxAmount3L
	 *	@return ip65504P682TaxAmount3L
	 */
	public short getIp65504P682TaxAmount3L() throws CFException {
        if (isIp65504P682TaxAmount3LModified()) { 
           ip65504P682TaxAmount3L = refreshIp65504P682TaxAmount3L();
        }
   		return ip65504P682TaxAmount3L;
	}
	
	/**
	 * 	Update Ip65504P682TaxAmount3L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P682-TAX-AMOUNT3-L
	 *	@param number
	 */
	public void setIp65504P682TaxAmount3L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P682TaxAmount3L = checkIp65504P682TaxAmount3LMaxLimit(number); 
		serializeIp65504P682TaxAmount3L(ip65504P682TaxAmount3L);
	}

	public void setIp65504P682TaxAmount3L(int number) {
	    number = checkIp65504P682TaxAmount3LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P682TaxAmount3L((short)number);
	}
	public void setIp65504P682TaxAmount3L(long number) {
	    number = checkIp65504P682TaxAmount3LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P682TaxAmount3L((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup22
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P652TaxtypeS((short)0);
         	setIp65504P652TaxtypeL((short)0);
         	setIp65504P653TaxAmtS((short)0);
         	setIp65504P653TaxAmtL((short)0);
         	setIp65504P654DbcdInS((short)0);
         	setIp65504P654DbcdInL((short)0);
         	setIp65504P655ReservdS((short)0);
         	setIp65504P655ReservdL((short)0);
         	setIp65504P656AltTaxS((short)0);
         	setIp65504P656AltTaxL((short)0);
         	setIp65504P657ReservdS((short)0);
         	setIp65504P657ReservdL((short)0);
         	setIp65504P658ReservdS((short)0);
         	setIp65504P658ReservdL((short)0);
         	setIp65504P659ReservdS((short)0);
         	setIp65504P659ReservdL((short)0);
         	setIp65504P660ReservdS((short)0);
         	setIp65504P660ReservdL((short)0);
         	setIp65504P661ReservdS((short)0);
         	setIp65504P661ReservdL((short)0);
         	setIp65504P662ReservdS((short)0);
         	setIp65504P662ReservdL((short)0);
         	setIp65504P663FreefrmS((short)0);
         	setIp65504P663FreefrmL((short)0);
         	setIp65504P664ReservdS((short)0);
         	setIp65504P664ReservdL((short)0);
         	setIp65504P665ReservdS((short)0);
         	setIp65504P665ReservdL((short)0);
         	setIp65504P666ReservdS((short)0);
         	setIp65504P666ReservdL((short)0);
         	setIp65504P667ReservdS((short)0);
         	setIp65504P667ReservdL((short)0);
         	setIp65504P668ReservdS((short)0);
         	setIp65504P668ReservdL((short)0);
         	setIp65504P669ReservdS((short)0);
         	setIp65504P669ReservdL((short)0);
         	setIp65504P670PayNamIdS((short)0);
         	setIp65504P670PayNamIdL((short)0);
         	setIp65504P671DofReqS((short)0);
         	setIp65504P671DofReqL((short)0);
         	setIp65504P672RcptNamS((short)0);
         	setIp65504P672RcptNamL((short)0);
         	setIp65504P673DtRcptFundS((short)0);
         	setIp65504P673DtRcptFundL((short)0);
         	setIp65504P674AdlTrcRefNoS((short)0);
         	setIp65504P674AdlTrcRefNoL((short)0);
         	setIp65504P675AdlTrnsDescS((short)0);
         	setIp65504P675AdlTrnsDescL((short)0);
         	setIp65504P676CardAccVatnoS((short)0);
         	setIp65504P676CardAccVatnoL((short)0);
         	setIp65504P677CustVatNoS((short)0);
         	setIp65504P677CustVatNoL((short)0);
         	setIp65504P678UniqInvNoS((short)0);
         	setIp65504P678UniqInvNoL((short)0);
         	setIp65504P679CommodityCodeS((short)0);
         	setIp65504P679CommodityCodeL((short)0);
         	setIp65504P680AuthContNameS((short)0);
         	setIp65504P680AuthContNameL((short)0);
         	setIp65504P681AuthContPhonS((short)0);
         	setIp65504P681AuthContPhonL((short)0);
         	setIp65504P682TaxAmount3S((short)0);
         	setIp65504P682TaxAmount3L((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup22FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_22_LENGTH;
		}

}
  
