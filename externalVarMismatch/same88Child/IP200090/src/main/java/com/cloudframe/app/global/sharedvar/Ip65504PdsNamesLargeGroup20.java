package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup20 extends Ip65504PdsNamesLargeGroup20Serialized { 
   

								private short ip65504P590ReservdS;

								private short ip65504P590ReservdL;


								private short ip65504P591ReservdS;

								private short ip65504P591ReservdL;


								private short ip65504P592ReservdS;

								private short ip65504P592ReservdL;


								private short ip65504P593ReservdS;

								private short ip65504P593ReservdL;


								private short ip65504P594ReservdS;

								private short ip65504P594ReservdL;


								private short ip65504P595MerTypS;

								private short ip65504P595MerTypL;


								private short ip65504P596MerTaxS;

								private short ip65504P596MerTaxL;


								private short ip65504P597TaxAmtS;

								private short ip65504P597TaxAmtL;


								private short ip65504P598TaxcollS;

								private short ip65504P598TaxcollL;


								private short ip65504P599CorVatS;

								private short ip65504P599CorVatL;


								private short ip65504P600MerRefS;

								private short ip65504P600MerRefL;


								private short ip65504P601ReservdS;

								private short ip65504P601ReservdL;


								private short ip65504P602ReservdS;

								private short ip65504P602ReservdL;


								private short ip65504P603ReservdS;

								private short ip65504P603ReservdL;


								private short ip65504P604ReservdS;

								private short ip65504P604ReservdL;


								private short ip65504P605ReservdS;

								private short ip65504P605ReservdL;


								private short ip65504P606FrtAmtS;

								private short ip65504P606FrtAmtL;


								private short ip65504P607DtyAmtS;

								private short ip65504P607DtyAmtL;


								private short ip65504P608DestZpS;

								private short ip65504P608DestZpL;


								private short ip65504P609DestStS;

								private short ip65504P609DestStL;


								private short ip65504P610DestCyS;

								private short ip65504P610DestCyL;


								private short ip65504P611AltTaxS;

								private short ip65504P611AltTaxL;


								private short ip65504P612ReservdS;

								private short ip65504P612ReservdL;


								private short ip65504P613ShpZipS;

								private short ip65504P613ShpZipL;


								private short ip65504P614OrdDteS;

								private short ip65504P614OrdDteL;


								private short ip65504P615ReservdS;

								private short ip65504P615ReservdL;


								private short ip65504P616ReservdS;

								private short ip65504P616ReservdL;


								private short ip65504P617ReservdS;

								private short ip65504P617ReservdL;


								private short ip65504P618ReservdS;

								private short ip65504P618ReservdL;


								private short ip65504P619ReservdS;

								private short ip65504P619ReservdL;


								private short ip65504P620OilconmS;

								private short ip65504P620OilconmL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup20
	**/
    public Ip65504PdsNamesLargeGroup20() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup20. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup20(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P590ReservdS
	 *	@return ip65504P590ReservdS
	 */
	public short getIp65504P590ReservdS() throws CFException {
        if (isIp65504P590ReservdSModified()) { 
           ip65504P590ReservdS = refreshIp65504P590ReservdS();
        }
   		return ip65504P590ReservdS;
	}
	
	/**
	 * 	Update Ip65504P590ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P590-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P590ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P590ReservdS = checkIp65504P590ReservdSMaxLimit(number); 
		serializeIp65504P590ReservdS(ip65504P590ReservdS);
	}

	public void setIp65504P590ReservdS(int number) {
	    number = checkIp65504P590ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P590ReservdS((short)number);
	}
	public void setIp65504P590ReservdS(long number) {
	    number = checkIp65504P590ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P590ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P590ReservdL
	 *	@return ip65504P590ReservdL
	 */
	public short getIp65504P590ReservdL() throws CFException {
        if (isIp65504P590ReservdLModified()) { 
           ip65504P590ReservdL = refreshIp65504P590ReservdL();
        }
   		return ip65504P590ReservdL;
	}
	
	/**
	 * 	Update Ip65504P590ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P590-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P590ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P590ReservdL = checkIp65504P590ReservdLMaxLimit(number); 
		serializeIp65504P590ReservdL(ip65504P590ReservdL);
	}

	public void setIp65504P590ReservdL(int number) {
	    number = checkIp65504P590ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P590ReservdL((short)number);
	}
	public void setIp65504P590ReservdL(long number) {
	    number = checkIp65504P590ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P590ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P591ReservdS
	 *	@return ip65504P591ReservdS
	 */
	public short getIp65504P591ReservdS() throws CFException {
        if (isIp65504P591ReservdSModified()) { 
           ip65504P591ReservdS = refreshIp65504P591ReservdS();
        }
   		return ip65504P591ReservdS;
	}
	
	/**
	 * 	Update Ip65504P591ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P591-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P591ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P591ReservdS = checkIp65504P591ReservdSMaxLimit(number); 
		serializeIp65504P591ReservdS(ip65504P591ReservdS);
	}

	public void setIp65504P591ReservdS(int number) {
	    number = checkIp65504P591ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P591ReservdS((short)number);
	}
	public void setIp65504P591ReservdS(long number) {
	    number = checkIp65504P591ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P591ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P591ReservdL
	 *	@return ip65504P591ReservdL
	 */
	public short getIp65504P591ReservdL() throws CFException {
        if (isIp65504P591ReservdLModified()) { 
           ip65504P591ReservdL = refreshIp65504P591ReservdL();
        }
   		return ip65504P591ReservdL;
	}
	
	/**
	 * 	Update Ip65504P591ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P591-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P591ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P591ReservdL = checkIp65504P591ReservdLMaxLimit(number); 
		serializeIp65504P591ReservdL(ip65504P591ReservdL);
	}

	public void setIp65504P591ReservdL(int number) {
	    number = checkIp65504P591ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P591ReservdL((short)number);
	}
	public void setIp65504P591ReservdL(long number) {
	    number = checkIp65504P591ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P591ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P592ReservdS
	 *	@return ip65504P592ReservdS
	 */
	public short getIp65504P592ReservdS() throws CFException {
        if (isIp65504P592ReservdSModified()) { 
           ip65504P592ReservdS = refreshIp65504P592ReservdS();
        }
   		return ip65504P592ReservdS;
	}
	
	/**
	 * 	Update Ip65504P592ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P592-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P592ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P592ReservdS = checkIp65504P592ReservdSMaxLimit(number); 
		serializeIp65504P592ReservdS(ip65504P592ReservdS);
	}

	public void setIp65504P592ReservdS(int number) {
	    number = checkIp65504P592ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P592ReservdS((short)number);
	}
	public void setIp65504P592ReservdS(long number) {
	    number = checkIp65504P592ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P592ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P592ReservdL
	 *	@return ip65504P592ReservdL
	 */
	public short getIp65504P592ReservdL() throws CFException {
        if (isIp65504P592ReservdLModified()) { 
           ip65504P592ReservdL = refreshIp65504P592ReservdL();
        }
   		return ip65504P592ReservdL;
	}
	
	/**
	 * 	Update Ip65504P592ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P592-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P592ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P592ReservdL = checkIp65504P592ReservdLMaxLimit(number); 
		serializeIp65504P592ReservdL(ip65504P592ReservdL);
	}

	public void setIp65504P592ReservdL(int number) {
	    number = checkIp65504P592ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P592ReservdL((short)number);
	}
	public void setIp65504P592ReservdL(long number) {
	    number = checkIp65504P592ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P592ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P593ReservdS
	 *	@return ip65504P593ReservdS
	 */
	public short getIp65504P593ReservdS() throws CFException {
        if (isIp65504P593ReservdSModified()) { 
           ip65504P593ReservdS = refreshIp65504P593ReservdS();
        }
   		return ip65504P593ReservdS;
	}
	
	/**
	 * 	Update Ip65504P593ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P593-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P593ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P593ReservdS = checkIp65504P593ReservdSMaxLimit(number); 
		serializeIp65504P593ReservdS(ip65504P593ReservdS);
	}

	public void setIp65504P593ReservdS(int number) {
	    number = checkIp65504P593ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P593ReservdS((short)number);
	}
	public void setIp65504P593ReservdS(long number) {
	    number = checkIp65504P593ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P593ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P593ReservdL
	 *	@return ip65504P593ReservdL
	 */
	public short getIp65504P593ReservdL() throws CFException {
        if (isIp65504P593ReservdLModified()) { 
           ip65504P593ReservdL = refreshIp65504P593ReservdL();
        }
   		return ip65504P593ReservdL;
	}
	
	/**
	 * 	Update Ip65504P593ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P593-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P593ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P593ReservdL = checkIp65504P593ReservdLMaxLimit(number); 
		serializeIp65504P593ReservdL(ip65504P593ReservdL);
	}

	public void setIp65504P593ReservdL(int number) {
	    number = checkIp65504P593ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P593ReservdL((short)number);
	}
	public void setIp65504P593ReservdL(long number) {
	    number = checkIp65504P593ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P593ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P594ReservdS
	 *	@return ip65504P594ReservdS
	 */
	public short getIp65504P594ReservdS() throws CFException {
        if (isIp65504P594ReservdSModified()) { 
           ip65504P594ReservdS = refreshIp65504P594ReservdS();
        }
   		return ip65504P594ReservdS;
	}
	
	/**
	 * 	Update Ip65504P594ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P594-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P594ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P594ReservdS = checkIp65504P594ReservdSMaxLimit(number); 
		serializeIp65504P594ReservdS(ip65504P594ReservdS);
	}

	public void setIp65504P594ReservdS(int number) {
	    number = checkIp65504P594ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P594ReservdS((short)number);
	}
	public void setIp65504P594ReservdS(long number) {
	    number = checkIp65504P594ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P594ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P594ReservdL
	 *	@return ip65504P594ReservdL
	 */
	public short getIp65504P594ReservdL() throws CFException {
        if (isIp65504P594ReservdLModified()) { 
           ip65504P594ReservdL = refreshIp65504P594ReservdL();
        }
   		return ip65504P594ReservdL;
	}
	
	/**
	 * 	Update Ip65504P594ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P594-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P594ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P594ReservdL = checkIp65504P594ReservdLMaxLimit(number); 
		serializeIp65504P594ReservdL(ip65504P594ReservdL);
	}

	public void setIp65504P594ReservdL(int number) {
	    number = checkIp65504P594ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P594ReservdL((short)number);
	}
	public void setIp65504P594ReservdL(long number) {
	    number = checkIp65504P594ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P594ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P595MerTypS
	 *	@return ip65504P595MerTypS
	 */
	public short getIp65504P595MerTypS() throws CFException {
        if (isIp65504P595MerTypSModified()) { 
           ip65504P595MerTypS = refreshIp65504P595MerTypS();
        }
   		return ip65504P595MerTypS;
	}
	
	/**
	 * 	Update Ip65504P595MerTypS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P595-MER-TYP-S
	 *	@param number
	 */
	public void setIp65504P595MerTypS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P595MerTypS = checkIp65504P595MerTypSMaxLimit(number); 
		serializeIp65504P595MerTypS(ip65504P595MerTypS);
	}

	public void setIp65504P595MerTypS(int number) {
	    number = checkIp65504P595MerTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P595MerTypS((short)number);
	}
	public void setIp65504P595MerTypS(long number) {
	    number = checkIp65504P595MerTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P595MerTypS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P595MerTypL
	 *	@return ip65504P595MerTypL
	 */
	public short getIp65504P595MerTypL() throws CFException {
        if (isIp65504P595MerTypLModified()) { 
           ip65504P595MerTypL = refreshIp65504P595MerTypL();
        }
   		return ip65504P595MerTypL;
	}
	
	/**
	 * 	Update Ip65504P595MerTypL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P595-MER-TYP-L
	 *	@param number
	 */
	public void setIp65504P595MerTypL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P595MerTypL = checkIp65504P595MerTypLMaxLimit(number); 
		serializeIp65504P595MerTypL(ip65504P595MerTypL);
	}

	public void setIp65504P595MerTypL(int number) {
	    number = checkIp65504P595MerTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P595MerTypL((short)number);
	}
	public void setIp65504P595MerTypL(long number) {
	    number = checkIp65504P595MerTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P595MerTypL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P596MerTaxS
	 *	@return ip65504P596MerTaxS
	 */
	public short getIp65504P596MerTaxS() throws CFException {
        if (isIp65504P596MerTaxSModified()) { 
           ip65504P596MerTaxS = refreshIp65504P596MerTaxS();
        }
   		return ip65504P596MerTaxS;
	}
	
	/**
	 * 	Update Ip65504P596MerTaxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P596-MER-TAX-S
	 *	@param number
	 */
	public void setIp65504P596MerTaxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P596MerTaxS = checkIp65504P596MerTaxSMaxLimit(number); 
		serializeIp65504P596MerTaxS(ip65504P596MerTaxS);
	}

	public void setIp65504P596MerTaxS(int number) {
	    number = checkIp65504P596MerTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P596MerTaxS((short)number);
	}
	public void setIp65504P596MerTaxS(long number) {
	    number = checkIp65504P596MerTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P596MerTaxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P596MerTaxL
	 *	@return ip65504P596MerTaxL
	 */
	public short getIp65504P596MerTaxL() throws CFException {
        if (isIp65504P596MerTaxLModified()) { 
           ip65504P596MerTaxL = refreshIp65504P596MerTaxL();
        }
   		return ip65504P596MerTaxL;
	}
	
	/**
	 * 	Update Ip65504P596MerTaxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P596-MER-TAX-L
	 *	@param number
	 */
	public void setIp65504P596MerTaxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P596MerTaxL = checkIp65504P596MerTaxLMaxLimit(number); 
		serializeIp65504P596MerTaxL(ip65504P596MerTaxL);
	}

	public void setIp65504P596MerTaxL(int number) {
	    number = checkIp65504P596MerTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P596MerTaxL((short)number);
	}
	public void setIp65504P596MerTaxL(long number) {
	    number = checkIp65504P596MerTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P596MerTaxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P597TaxAmtS
	 *	@return ip65504P597TaxAmtS
	 */
	public short getIp65504P597TaxAmtS() throws CFException {
        if (isIp65504P597TaxAmtSModified()) { 
           ip65504P597TaxAmtS = refreshIp65504P597TaxAmtS();
        }
   		return ip65504P597TaxAmtS;
	}
	
	/**
	 * 	Update Ip65504P597TaxAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P597-TAX-AMT-S
	 *	@param number
	 */
	public void setIp65504P597TaxAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P597TaxAmtS = checkIp65504P597TaxAmtSMaxLimit(number); 
		serializeIp65504P597TaxAmtS(ip65504P597TaxAmtS);
	}

	public void setIp65504P597TaxAmtS(int number) {
	    number = checkIp65504P597TaxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P597TaxAmtS((short)number);
	}
	public void setIp65504P597TaxAmtS(long number) {
	    number = checkIp65504P597TaxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P597TaxAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P597TaxAmtL
	 *	@return ip65504P597TaxAmtL
	 */
	public short getIp65504P597TaxAmtL() throws CFException {
        if (isIp65504P597TaxAmtLModified()) { 
           ip65504P597TaxAmtL = refreshIp65504P597TaxAmtL();
        }
   		return ip65504P597TaxAmtL;
	}
	
	/**
	 * 	Update Ip65504P597TaxAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P597-TAX-AMT-L
	 *	@param number
	 */
	public void setIp65504P597TaxAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P597TaxAmtL = checkIp65504P597TaxAmtLMaxLimit(number); 
		serializeIp65504P597TaxAmtL(ip65504P597TaxAmtL);
	}

	public void setIp65504P597TaxAmtL(int number) {
	    number = checkIp65504P597TaxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P597TaxAmtL((short)number);
	}
	public void setIp65504P597TaxAmtL(long number) {
	    number = checkIp65504P597TaxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P597TaxAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P598TaxcollS
	 *	@return ip65504P598TaxcollS
	 */
	public short getIp65504P598TaxcollS() throws CFException {
        if (isIp65504P598TaxcollSModified()) { 
           ip65504P598TaxcollS = refreshIp65504P598TaxcollS();
        }
   		return ip65504P598TaxcollS;
	}
	
	/**
	 * 	Update Ip65504P598TaxcollS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P598-TAXCOLL-S
	 *	@param number
	 */
	public void setIp65504P598TaxcollS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P598TaxcollS = checkIp65504P598TaxcollSMaxLimit(number); 
		serializeIp65504P598TaxcollS(ip65504P598TaxcollS);
	}

	public void setIp65504P598TaxcollS(int number) {
	    number = checkIp65504P598TaxcollSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P598TaxcollS((short)number);
	}
	public void setIp65504P598TaxcollS(long number) {
	    number = checkIp65504P598TaxcollSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P598TaxcollS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P598TaxcollL
	 *	@return ip65504P598TaxcollL
	 */
	public short getIp65504P598TaxcollL() throws CFException {
        if (isIp65504P598TaxcollLModified()) { 
           ip65504P598TaxcollL = refreshIp65504P598TaxcollL();
        }
   		return ip65504P598TaxcollL;
	}
	
	/**
	 * 	Update Ip65504P598TaxcollL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P598-TAXCOLL-L
	 *	@param number
	 */
	public void setIp65504P598TaxcollL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P598TaxcollL = checkIp65504P598TaxcollLMaxLimit(number); 
		serializeIp65504P598TaxcollL(ip65504P598TaxcollL);
	}

	public void setIp65504P598TaxcollL(int number) {
	    number = checkIp65504P598TaxcollLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P598TaxcollL((short)number);
	}
	public void setIp65504P598TaxcollL(long number) {
	    number = checkIp65504P598TaxcollLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P598TaxcollL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P599CorVatS
	 *	@return ip65504P599CorVatS
	 */
	public short getIp65504P599CorVatS() throws CFException {
        if (isIp65504P599CorVatSModified()) { 
           ip65504P599CorVatS = refreshIp65504P599CorVatS();
        }
   		return ip65504P599CorVatS;
	}
	
	/**
	 * 	Update Ip65504P599CorVatS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P599-COR-VAT-S
	 *	@param number
	 */
	public void setIp65504P599CorVatS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P599CorVatS = checkIp65504P599CorVatSMaxLimit(number); 
		serializeIp65504P599CorVatS(ip65504P599CorVatS);
	}

	public void setIp65504P599CorVatS(int number) {
	    number = checkIp65504P599CorVatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P599CorVatS((short)number);
	}
	public void setIp65504P599CorVatS(long number) {
	    number = checkIp65504P599CorVatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P599CorVatS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P599CorVatL
	 *	@return ip65504P599CorVatL
	 */
	public short getIp65504P599CorVatL() throws CFException {
        if (isIp65504P599CorVatLModified()) { 
           ip65504P599CorVatL = refreshIp65504P599CorVatL();
        }
   		return ip65504P599CorVatL;
	}
	
	/**
	 * 	Update Ip65504P599CorVatL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P599-COR-VAT-L
	 *	@param number
	 */
	public void setIp65504P599CorVatL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P599CorVatL = checkIp65504P599CorVatLMaxLimit(number); 
		serializeIp65504P599CorVatL(ip65504P599CorVatL);
	}

	public void setIp65504P599CorVatL(int number) {
	    number = checkIp65504P599CorVatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P599CorVatL((short)number);
	}
	public void setIp65504P599CorVatL(long number) {
	    number = checkIp65504P599CorVatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P599CorVatL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P600MerRefS
	 *	@return ip65504P600MerRefS
	 */
	public short getIp65504P600MerRefS() throws CFException {
        if (isIp65504P600MerRefSModified()) { 
           ip65504P600MerRefS = refreshIp65504P600MerRefS();
        }
   		return ip65504P600MerRefS;
	}
	
	/**
	 * 	Update Ip65504P600MerRefS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P600-MER-REF-S
	 *	@param number
	 */
	public void setIp65504P600MerRefS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P600MerRefS = checkIp65504P600MerRefSMaxLimit(number); 
		serializeIp65504P600MerRefS(ip65504P600MerRefS);
	}

	public void setIp65504P600MerRefS(int number) {
	    number = checkIp65504P600MerRefSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P600MerRefS((short)number);
	}
	public void setIp65504P600MerRefS(long number) {
	    number = checkIp65504P600MerRefSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P600MerRefS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P600MerRefL
	 *	@return ip65504P600MerRefL
	 */
	public short getIp65504P600MerRefL() throws CFException {
        if (isIp65504P600MerRefLModified()) { 
           ip65504P600MerRefL = refreshIp65504P600MerRefL();
        }
   		return ip65504P600MerRefL;
	}
	
	/**
	 * 	Update Ip65504P600MerRefL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P600-MER-REF-L
	 *	@param number
	 */
	public void setIp65504P600MerRefL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P600MerRefL = checkIp65504P600MerRefLMaxLimit(number); 
		serializeIp65504P600MerRefL(ip65504P600MerRefL);
	}

	public void setIp65504P600MerRefL(int number) {
	    number = checkIp65504P600MerRefLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P600MerRefL((short)number);
	}
	public void setIp65504P600MerRefL(long number) {
	    number = checkIp65504P600MerRefLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P600MerRefL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P601ReservdS
	 *	@return ip65504P601ReservdS
	 */
	public short getIp65504P601ReservdS() throws CFException {
        if (isIp65504P601ReservdSModified()) { 
           ip65504P601ReservdS = refreshIp65504P601ReservdS();
        }
   		return ip65504P601ReservdS;
	}
	
	/**
	 * 	Update Ip65504P601ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P601-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P601ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P601ReservdS = checkIp65504P601ReservdSMaxLimit(number); 
		serializeIp65504P601ReservdS(ip65504P601ReservdS);
	}

	public void setIp65504P601ReservdS(int number) {
	    number = checkIp65504P601ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P601ReservdS((short)number);
	}
	public void setIp65504P601ReservdS(long number) {
	    number = checkIp65504P601ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P601ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P601ReservdL
	 *	@return ip65504P601ReservdL
	 */
	public short getIp65504P601ReservdL() throws CFException {
        if (isIp65504P601ReservdLModified()) { 
           ip65504P601ReservdL = refreshIp65504P601ReservdL();
        }
   		return ip65504P601ReservdL;
	}
	
	/**
	 * 	Update Ip65504P601ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P601-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P601ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P601ReservdL = checkIp65504P601ReservdLMaxLimit(number); 
		serializeIp65504P601ReservdL(ip65504P601ReservdL);
	}

	public void setIp65504P601ReservdL(int number) {
	    number = checkIp65504P601ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P601ReservdL((short)number);
	}
	public void setIp65504P601ReservdL(long number) {
	    number = checkIp65504P601ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P601ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P602ReservdS
	 *	@return ip65504P602ReservdS
	 */
	public short getIp65504P602ReservdS() throws CFException {
        if (isIp65504P602ReservdSModified()) { 
           ip65504P602ReservdS = refreshIp65504P602ReservdS();
        }
   		return ip65504P602ReservdS;
	}
	
	/**
	 * 	Update Ip65504P602ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P602-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P602ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P602ReservdS = checkIp65504P602ReservdSMaxLimit(number); 
		serializeIp65504P602ReservdS(ip65504P602ReservdS);
	}

	public void setIp65504P602ReservdS(int number) {
	    number = checkIp65504P602ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P602ReservdS((short)number);
	}
	public void setIp65504P602ReservdS(long number) {
	    number = checkIp65504P602ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P602ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P602ReservdL
	 *	@return ip65504P602ReservdL
	 */
	public short getIp65504P602ReservdL() throws CFException {
        if (isIp65504P602ReservdLModified()) { 
           ip65504P602ReservdL = refreshIp65504P602ReservdL();
        }
   		return ip65504P602ReservdL;
	}
	
	/**
	 * 	Update Ip65504P602ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P602-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P602ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P602ReservdL = checkIp65504P602ReservdLMaxLimit(number); 
		serializeIp65504P602ReservdL(ip65504P602ReservdL);
	}

	public void setIp65504P602ReservdL(int number) {
	    number = checkIp65504P602ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P602ReservdL((short)number);
	}
	public void setIp65504P602ReservdL(long number) {
	    number = checkIp65504P602ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P602ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P603ReservdS
	 *	@return ip65504P603ReservdS
	 */
	public short getIp65504P603ReservdS() throws CFException {
        if (isIp65504P603ReservdSModified()) { 
           ip65504P603ReservdS = refreshIp65504P603ReservdS();
        }
   		return ip65504P603ReservdS;
	}
	
	/**
	 * 	Update Ip65504P603ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P603-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P603ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P603ReservdS = checkIp65504P603ReservdSMaxLimit(number); 
		serializeIp65504P603ReservdS(ip65504P603ReservdS);
	}

	public void setIp65504P603ReservdS(int number) {
	    number = checkIp65504P603ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P603ReservdS((short)number);
	}
	public void setIp65504P603ReservdS(long number) {
	    number = checkIp65504P603ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P603ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P603ReservdL
	 *	@return ip65504P603ReservdL
	 */
	public short getIp65504P603ReservdL() throws CFException {
        if (isIp65504P603ReservdLModified()) { 
           ip65504P603ReservdL = refreshIp65504P603ReservdL();
        }
   		return ip65504P603ReservdL;
	}
	
	/**
	 * 	Update Ip65504P603ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P603-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P603ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P603ReservdL = checkIp65504P603ReservdLMaxLimit(number); 
		serializeIp65504P603ReservdL(ip65504P603ReservdL);
	}

	public void setIp65504P603ReservdL(int number) {
	    number = checkIp65504P603ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P603ReservdL((short)number);
	}
	public void setIp65504P603ReservdL(long number) {
	    number = checkIp65504P603ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P603ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P604ReservdS
	 *	@return ip65504P604ReservdS
	 */
	public short getIp65504P604ReservdS() throws CFException {
        if (isIp65504P604ReservdSModified()) { 
           ip65504P604ReservdS = refreshIp65504P604ReservdS();
        }
   		return ip65504P604ReservdS;
	}
	
	/**
	 * 	Update Ip65504P604ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P604-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P604ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P604ReservdS = checkIp65504P604ReservdSMaxLimit(number); 
		serializeIp65504P604ReservdS(ip65504P604ReservdS);
	}

	public void setIp65504P604ReservdS(int number) {
	    number = checkIp65504P604ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P604ReservdS((short)number);
	}
	public void setIp65504P604ReservdS(long number) {
	    number = checkIp65504P604ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P604ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P604ReservdL
	 *	@return ip65504P604ReservdL
	 */
	public short getIp65504P604ReservdL() throws CFException {
        if (isIp65504P604ReservdLModified()) { 
           ip65504P604ReservdL = refreshIp65504P604ReservdL();
        }
   		return ip65504P604ReservdL;
	}
	
	/**
	 * 	Update Ip65504P604ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P604-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P604ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P604ReservdL = checkIp65504P604ReservdLMaxLimit(number); 
		serializeIp65504P604ReservdL(ip65504P604ReservdL);
	}

	public void setIp65504P604ReservdL(int number) {
	    number = checkIp65504P604ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P604ReservdL((short)number);
	}
	public void setIp65504P604ReservdL(long number) {
	    number = checkIp65504P604ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P604ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P605ReservdS
	 *	@return ip65504P605ReservdS
	 */
	public short getIp65504P605ReservdS() throws CFException {
        if (isIp65504P605ReservdSModified()) { 
           ip65504P605ReservdS = refreshIp65504P605ReservdS();
        }
   		return ip65504P605ReservdS;
	}
	
	/**
	 * 	Update Ip65504P605ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P605-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P605ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P605ReservdS = checkIp65504P605ReservdSMaxLimit(number); 
		serializeIp65504P605ReservdS(ip65504P605ReservdS);
	}

	public void setIp65504P605ReservdS(int number) {
	    number = checkIp65504P605ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P605ReservdS((short)number);
	}
	public void setIp65504P605ReservdS(long number) {
	    number = checkIp65504P605ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P605ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P605ReservdL
	 *	@return ip65504P605ReservdL
	 */
	public short getIp65504P605ReservdL() throws CFException {
        if (isIp65504P605ReservdLModified()) { 
           ip65504P605ReservdL = refreshIp65504P605ReservdL();
        }
   		return ip65504P605ReservdL;
	}
	
	/**
	 * 	Update Ip65504P605ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P605-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P605ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P605ReservdL = checkIp65504P605ReservdLMaxLimit(number); 
		serializeIp65504P605ReservdL(ip65504P605ReservdL);
	}

	public void setIp65504P605ReservdL(int number) {
	    number = checkIp65504P605ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P605ReservdL((short)number);
	}
	public void setIp65504P605ReservdL(long number) {
	    number = checkIp65504P605ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P605ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P606FrtAmtS
	 *	@return ip65504P606FrtAmtS
	 */
	public short getIp65504P606FrtAmtS() throws CFException {
        if (isIp65504P606FrtAmtSModified()) { 
           ip65504P606FrtAmtS = refreshIp65504P606FrtAmtS();
        }
   		return ip65504P606FrtAmtS;
	}
	
	/**
	 * 	Update Ip65504P606FrtAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P606-FRT-AMT-S
	 *	@param number
	 */
	public void setIp65504P606FrtAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P606FrtAmtS = checkIp65504P606FrtAmtSMaxLimit(number); 
		serializeIp65504P606FrtAmtS(ip65504P606FrtAmtS);
	}

	public void setIp65504P606FrtAmtS(int number) {
	    number = checkIp65504P606FrtAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P606FrtAmtS((short)number);
	}
	public void setIp65504P606FrtAmtS(long number) {
	    number = checkIp65504P606FrtAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P606FrtAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P606FrtAmtL
	 *	@return ip65504P606FrtAmtL
	 */
	public short getIp65504P606FrtAmtL() throws CFException {
        if (isIp65504P606FrtAmtLModified()) { 
           ip65504P606FrtAmtL = refreshIp65504P606FrtAmtL();
        }
   		return ip65504P606FrtAmtL;
	}
	
	/**
	 * 	Update Ip65504P606FrtAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P606-FRT-AMT-L
	 *	@param number
	 */
	public void setIp65504P606FrtAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P606FrtAmtL = checkIp65504P606FrtAmtLMaxLimit(number); 
		serializeIp65504P606FrtAmtL(ip65504P606FrtAmtL);
	}

	public void setIp65504P606FrtAmtL(int number) {
	    number = checkIp65504P606FrtAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P606FrtAmtL((short)number);
	}
	public void setIp65504P606FrtAmtL(long number) {
	    number = checkIp65504P606FrtAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P606FrtAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P607DtyAmtS
	 *	@return ip65504P607DtyAmtS
	 */
	public short getIp65504P607DtyAmtS() throws CFException {
        if (isIp65504P607DtyAmtSModified()) { 
           ip65504P607DtyAmtS = refreshIp65504P607DtyAmtS();
        }
   		return ip65504P607DtyAmtS;
	}
	
	/**
	 * 	Update Ip65504P607DtyAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P607-DTY-AMT-S
	 *	@param number
	 */
	public void setIp65504P607DtyAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P607DtyAmtS = checkIp65504P607DtyAmtSMaxLimit(number); 
		serializeIp65504P607DtyAmtS(ip65504P607DtyAmtS);
	}

	public void setIp65504P607DtyAmtS(int number) {
	    number = checkIp65504P607DtyAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P607DtyAmtS((short)number);
	}
	public void setIp65504P607DtyAmtS(long number) {
	    number = checkIp65504P607DtyAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P607DtyAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P607DtyAmtL
	 *	@return ip65504P607DtyAmtL
	 */
	public short getIp65504P607DtyAmtL() throws CFException {
        if (isIp65504P607DtyAmtLModified()) { 
           ip65504P607DtyAmtL = refreshIp65504P607DtyAmtL();
        }
   		return ip65504P607DtyAmtL;
	}
	
	/**
	 * 	Update Ip65504P607DtyAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P607-DTY-AMT-L
	 *	@param number
	 */
	public void setIp65504P607DtyAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P607DtyAmtL = checkIp65504P607DtyAmtLMaxLimit(number); 
		serializeIp65504P607DtyAmtL(ip65504P607DtyAmtL);
	}

	public void setIp65504P607DtyAmtL(int number) {
	    number = checkIp65504P607DtyAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P607DtyAmtL((short)number);
	}
	public void setIp65504P607DtyAmtL(long number) {
	    number = checkIp65504P607DtyAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P607DtyAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P608DestZpS
	 *	@return ip65504P608DestZpS
	 */
	public short getIp65504P608DestZpS() throws CFException {
        if (isIp65504P608DestZpSModified()) { 
           ip65504P608DestZpS = refreshIp65504P608DestZpS();
        }
   		return ip65504P608DestZpS;
	}
	
	/**
	 * 	Update Ip65504P608DestZpS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P608-DEST-ZP-S
	 *	@param number
	 */
	public void setIp65504P608DestZpS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P608DestZpS = checkIp65504P608DestZpSMaxLimit(number); 
		serializeIp65504P608DestZpS(ip65504P608DestZpS);
	}

	public void setIp65504P608DestZpS(int number) {
	    number = checkIp65504P608DestZpSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P608DestZpS((short)number);
	}
	public void setIp65504P608DestZpS(long number) {
	    number = checkIp65504P608DestZpSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P608DestZpS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P608DestZpL
	 *	@return ip65504P608DestZpL
	 */
	public short getIp65504P608DestZpL() throws CFException {
        if (isIp65504P608DestZpLModified()) { 
           ip65504P608DestZpL = refreshIp65504P608DestZpL();
        }
   		return ip65504P608DestZpL;
	}
	
	/**
	 * 	Update Ip65504P608DestZpL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P608-DEST-ZP-L
	 *	@param number
	 */
	public void setIp65504P608DestZpL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P608DestZpL = checkIp65504P608DestZpLMaxLimit(number); 
		serializeIp65504P608DestZpL(ip65504P608DestZpL);
	}

	public void setIp65504P608DestZpL(int number) {
	    number = checkIp65504P608DestZpLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P608DestZpL((short)number);
	}
	public void setIp65504P608DestZpL(long number) {
	    number = checkIp65504P608DestZpLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P608DestZpL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P609DestStS
	 *	@return ip65504P609DestStS
	 */
	public short getIp65504P609DestStS() throws CFException {
        if (isIp65504P609DestStSModified()) { 
           ip65504P609DestStS = refreshIp65504P609DestStS();
        }
   		return ip65504P609DestStS;
	}
	
	/**
	 * 	Update Ip65504P609DestStS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P609-DEST-ST-S
	 *	@param number
	 */
	public void setIp65504P609DestStS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P609DestStS = checkIp65504P609DestStSMaxLimit(number); 
		serializeIp65504P609DestStS(ip65504P609DestStS);
	}

	public void setIp65504P609DestStS(int number) {
	    number = checkIp65504P609DestStSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P609DestStS((short)number);
	}
	public void setIp65504P609DestStS(long number) {
	    number = checkIp65504P609DestStSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P609DestStS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P609DestStL
	 *	@return ip65504P609DestStL
	 */
	public short getIp65504P609DestStL() throws CFException {
        if (isIp65504P609DestStLModified()) { 
           ip65504P609DestStL = refreshIp65504P609DestStL();
        }
   		return ip65504P609DestStL;
	}
	
	/**
	 * 	Update Ip65504P609DestStL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P609-DEST-ST-L
	 *	@param number
	 */
	public void setIp65504P609DestStL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P609DestStL = checkIp65504P609DestStLMaxLimit(number); 
		serializeIp65504P609DestStL(ip65504P609DestStL);
	}

	public void setIp65504P609DestStL(int number) {
	    number = checkIp65504P609DestStLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P609DestStL((short)number);
	}
	public void setIp65504P609DestStL(long number) {
	    number = checkIp65504P609DestStLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P609DestStL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P610DestCyS
	 *	@return ip65504P610DestCyS
	 */
	public short getIp65504P610DestCyS() throws CFException {
        if (isIp65504P610DestCySModified()) { 
           ip65504P610DestCyS = refreshIp65504P610DestCyS();
        }
   		return ip65504P610DestCyS;
	}
	
	/**
	 * 	Update Ip65504P610DestCyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P610-DEST-CY-S
	 *	@param number
	 */
	public void setIp65504P610DestCyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P610DestCyS = checkIp65504P610DestCySMaxLimit(number); 
		serializeIp65504P610DestCyS(ip65504P610DestCyS);
	}

	public void setIp65504P610DestCyS(int number) {
	    number = checkIp65504P610DestCySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P610DestCyS((short)number);
	}
	public void setIp65504P610DestCyS(long number) {
	    number = checkIp65504P610DestCySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P610DestCyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P610DestCyL
	 *	@return ip65504P610DestCyL
	 */
	public short getIp65504P610DestCyL() throws CFException {
        if (isIp65504P610DestCyLModified()) { 
           ip65504P610DestCyL = refreshIp65504P610DestCyL();
        }
   		return ip65504P610DestCyL;
	}
	
	/**
	 * 	Update Ip65504P610DestCyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P610-DEST-CY-L
	 *	@param number
	 */
	public void setIp65504P610DestCyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P610DestCyL = checkIp65504P610DestCyLMaxLimit(number); 
		serializeIp65504P610DestCyL(ip65504P610DestCyL);
	}

	public void setIp65504P610DestCyL(int number) {
	    number = checkIp65504P610DestCyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P610DestCyL((short)number);
	}
	public void setIp65504P610DestCyL(long number) {
	    number = checkIp65504P610DestCyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P610DestCyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P611AltTaxS
	 *	@return ip65504P611AltTaxS
	 */
	public short getIp65504P611AltTaxS() throws CFException {
        if (isIp65504P611AltTaxSModified()) { 
           ip65504P611AltTaxS = refreshIp65504P611AltTaxS();
        }
   		return ip65504P611AltTaxS;
	}
	
	/**
	 * 	Update Ip65504P611AltTaxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P611-ALT-TAX-S
	 *	@param number
	 */
	public void setIp65504P611AltTaxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P611AltTaxS = checkIp65504P611AltTaxSMaxLimit(number); 
		serializeIp65504P611AltTaxS(ip65504P611AltTaxS);
	}

	public void setIp65504P611AltTaxS(int number) {
	    number = checkIp65504P611AltTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P611AltTaxS((short)number);
	}
	public void setIp65504P611AltTaxS(long number) {
	    number = checkIp65504P611AltTaxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P611AltTaxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P611AltTaxL
	 *	@return ip65504P611AltTaxL
	 */
	public short getIp65504P611AltTaxL() throws CFException {
        if (isIp65504P611AltTaxLModified()) { 
           ip65504P611AltTaxL = refreshIp65504P611AltTaxL();
        }
   		return ip65504P611AltTaxL;
	}
	
	/**
	 * 	Update Ip65504P611AltTaxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P611-ALT-TAX-L
	 *	@param number
	 */
	public void setIp65504P611AltTaxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P611AltTaxL = checkIp65504P611AltTaxLMaxLimit(number); 
		serializeIp65504P611AltTaxL(ip65504P611AltTaxL);
	}

	public void setIp65504P611AltTaxL(int number) {
	    number = checkIp65504P611AltTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P611AltTaxL((short)number);
	}
	public void setIp65504P611AltTaxL(long number) {
	    number = checkIp65504P611AltTaxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P611AltTaxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P612ReservdS
	 *	@return ip65504P612ReservdS
	 */
	public short getIp65504P612ReservdS() throws CFException {
        if (isIp65504P612ReservdSModified()) { 
           ip65504P612ReservdS = refreshIp65504P612ReservdS();
        }
   		return ip65504P612ReservdS;
	}
	
	/**
	 * 	Update Ip65504P612ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P612-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P612ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P612ReservdS = checkIp65504P612ReservdSMaxLimit(number); 
		serializeIp65504P612ReservdS(ip65504P612ReservdS);
	}

	public void setIp65504P612ReservdS(int number) {
	    number = checkIp65504P612ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P612ReservdS((short)number);
	}
	public void setIp65504P612ReservdS(long number) {
	    number = checkIp65504P612ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P612ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P612ReservdL
	 *	@return ip65504P612ReservdL
	 */
	public short getIp65504P612ReservdL() throws CFException {
        if (isIp65504P612ReservdLModified()) { 
           ip65504P612ReservdL = refreshIp65504P612ReservdL();
        }
   		return ip65504P612ReservdL;
	}
	
	/**
	 * 	Update Ip65504P612ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P612-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P612ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P612ReservdL = checkIp65504P612ReservdLMaxLimit(number); 
		serializeIp65504P612ReservdL(ip65504P612ReservdL);
	}

	public void setIp65504P612ReservdL(int number) {
	    number = checkIp65504P612ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P612ReservdL((short)number);
	}
	public void setIp65504P612ReservdL(long number) {
	    number = checkIp65504P612ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P612ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P613ShpZipS
	 *	@return ip65504P613ShpZipS
	 */
	public short getIp65504P613ShpZipS() throws CFException {
        if (isIp65504P613ShpZipSModified()) { 
           ip65504P613ShpZipS = refreshIp65504P613ShpZipS();
        }
   		return ip65504P613ShpZipS;
	}
	
	/**
	 * 	Update Ip65504P613ShpZipS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P613-SHP-ZIP-S
	 *	@param number
	 */
	public void setIp65504P613ShpZipS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P613ShpZipS = checkIp65504P613ShpZipSMaxLimit(number); 
		serializeIp65504P613ShpZipS(ip65504P613ShpZipS);
	}

	public void setIp65504P613ShpZipS(int number) {
	    number = checkIp65504P613ShpZipSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P613ShpZipS((short)number);
	}
	public void setIp65504P613ShpZipS(long number) {
	    number = checkIp65504P613ShpZipSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P613ShpZipS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P613ShpZipL
	 *	@return ip65504P613ShpZipL
	 */
	public short getIp65504P613ShpZipL() throws CFException {
        if (isIp65504P613ShpZipLModified()) { 
           ip65504P613ShpZipL = refreshIp65504P613ShpZipL();
        }
   		return ip65504P613ShpZipL;
	}
	
	/**
	 * 	Update Ip65504P613ShpZipL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P613-SHP-ZIP-L
	 *	@param number
	 */
	public void setIp65504P613ShpZipL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P613ShpZipL = checkIp65504P613ShpZipLMaxLimit(number); 
		serializeIp65504P613ShpZipL(ip65504P613ShpZipL);
	}

	public void setIp65504P613ShpZipL(int number) {
	    number = checkIp65504P613ShpZipLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P613ShpZipL((short)number);
	}
	public void setIp65504P613ShpZipL(long number) {
	    number = checkIp65504P613ShpZipLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P613ShpZipL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P614OrdDteS
	 *	@return ip65504P614OrdDteS
	 */
	public short getIp65504P614OrdDteS() throws CFException {
        if (isIp65504P614OrdDteSModified()) { 
           ip65504P614OrdDteS = refreshIp65504P614OrdDteS();
        }
   		return ip65504P614OrdDteS;
	}
	
	/**
	 * 	Update Ip65504P614OrdDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P614-ORD-DTE-S
	 *	@param number
	 */
	public void setIp65504P614OrdDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P614OrdDteS = checkIp65504P614OrdDteSMaxLimit(number); 
		serializeIp65504P614OrdDteS(ip65504P614OrdDteS);
	}

	public void setIp65504P614OrdDteS(int number) {
	    number = checkIp65504P614OrdDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P614OrdDteS((short)number);
	}
	public void setIp65504P614OrdDteS(long number) {
	    number = checkIp65504P614OrdDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P614OrdDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P614OrdDteL
	 *	@return ip65504P614OrdDteL
	 */
	public short getIp65504P614OrdDteL() throws CFException {
        if (isIp65504P614OrdDteLModified()) { 
           ip65504P614OrdDteL = refreshIp65504P614OrdDteL();
        }
   		return ip65504P614OrdDteL;
	}
	
	/**
	 * 	Update Ip65504P614OrdDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P614-ORD-DTE-L
	 *	@param number
	 */
	public void setIp65504P614OrdDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P614OrdDteL = checkIp65504P614OrdDteLMaxLimit(number); 
		serializeIp65504P614OrdDteL(ip65504P614OrdDteL);
	}

	public void setIp65504P614OrdDteL(int number) {
	    number = checkIp65504P614OrdDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P614OrdDteL((short)number);
	}
	public void setIp65504P614OrdDteL(long number) {
	    number = checkIp65504P614OrdDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P614OrdDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P615ReservdS
	 *	@return ip65504P615ReservdS
	 */
	public short getIp65504P615ReservdS() throws CFException {
        if (isIp65504P615ReservdSModified()) { 
           ip65504P615ReservdS = refreshIp65504P615ReservdS();
        }
   		return ip65504P615ReservdS;
	}
	
	/**
	 * 	Update Ip65504P615ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P615-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P615ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P615ReservdS = checkIp65504P615ReservdSMaxLimit(number); 
		serializeIp65504P615ReservdS(ip65504P615ReservdS);
	}

	public void setIp65504P615ReservdS(int number) {
	    number = checkIp65504P615ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P615ReservdS((short)number);
	}
	public void setIp65504P615ReservdS(long number) {
	    number = checkIp65504P615ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P615ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P615ReservdL
	 *	@return ip65504P615ReservdL
	 */
	public short getIp65504P615ReservdL() throws CFException {
        if (isIp65504P615ReservdLModified()) { 
           ip65504P615ReservdL = refreshIp65504P615ReservdL();
        }
   		return ip65504P615ReservdL;
	}
	
	/**
	 * 	Update Ip65504P615ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P615-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P615ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P615ReservdL = checkIp65504P615ReservdLMaxLimit(number); 
		serializeIp65504P615ReservdL(ip65504P615ReservdL);
	}

	public void setIp65504P615ReservdL(int number) {
	    number = checkIp65504P615ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P615ReservdL((short)number);
	}
	public void setIp65504P615ReservdL(long number) {
	    number = checkIp65504P615ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P615ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P616ReservdS
	 *	@return ip65504P616ReservdS
	 */
	public short getIp65504P616ReservdS() throws CFException {
        if (isIp65504P616ReservdSModified()) { 
           ip65504P616ReservdS = refreshIp65504P616ReservdS();
        }
   		return ip65504P616ReservdS;
	}
	
	/**
	 * 	Update Ip65504P616ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P616-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P616ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P616ReservdS = checkIp65504P616ReservdSMaxLimit(number); 
		serializeIp65504P616ReservdS(ip65504P616ReservdS);
	}

	public void setIp65504P616ReservdS(int number) {
	    number = checkIp65504P616ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P616ReservdS((short)number);
	}
	public void setIp65504P616ReservdS(long number) {
	    number = checkIp65504P616ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P616ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P616ReservdL
	 *	@return ip65504P616ReservdL
	 */
	public short getIp65504P616ReservdL() throws CFException {
        if (isIp65504P616ReservdLModified()) { 
           ip65504P616ReservdL = refreshIp65504P616ReservdL();
        }
   		return ip65504P616ReservdL;
	}
	
	/**
	 * 	Update Ip65504P616ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P616-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P616ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P616ReservdL = checkIp65504P616ReservdLMaxLimit(number); 
		serializeIp65504P616ReservdL(ip65504P616ReservdL);
	}

	public void setIp65504P616ReservdL(int number) {
	    number = checkIp65504P616ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P616ReservdL((short)number);
	}
	public void setIp65504P616ReservdL(long number) {
	    number = checkIp65504P616ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P616ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P617ReservdS
	 *	@return ip65504P617ReservdS
	 */
	public short getIp65504P617ReservdS() throws CFException {
        if (isIp65504P617ReservdSModified()) { 
           ip65504P617ReservdS = refreshIp65504P617ReservdS();
        }
   		return ip65504P617ReservdS;
	}
	
	/**
	 * 	Update Ip65504P617ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P617-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P617ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P617ReservdS = checkIp65504P617ReservdSMaxLimit(number); 
		serializeIp65504P617ReservdS(ip65504P617ReservdS);
	}

	public void setIp65504P617ReservdS(int number) {
	    number = checkIp65504P617ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P617ReservdS((short)number);
	}
	public void setIp65504P617ReservdS(long number) {
	    number = checkIp65504P617ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P617ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P617ReservdL
	 *	@return ip65504P617ReservdL
	 */
	public short getIp65504P617ReservdL() throws CFException {
        if (isIp65504P617ReservdLModified()) { 
           ip65504P617ReservdL = refreshIp65504P617ReservdL();
        }
   		return ip65504P617ReservdL;
	}
	
	/**
	 * 	Update Ip65504P617ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P617-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P617ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P617ReservdL = checkIp65504P617ReservdLMaxLimit(number); 
		serializeIp65504P617ReservdL(ip65504P617ReservdL);
	}

	public void setIp65504P617ReservdL(int number) {
	    number = checkIp65504P617ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P617ReservdL((short)number);
	}
	public void setIp65504P617ReservdL(long number) {
	    number = checkIp65504P617ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P617ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P618ReservdS
	 *	@return ip65504P618ReservdS
	 */
	public short getIp65504P618ReservdS() throws CFException {
        if (isIp65504P618ReservdSModified()) { 
           ip65504P618ReservdS = refreshIp65504P618ReservdS();
        }
   		return ip65504P618ReservdS;
	}
	
	/**
	 * 	Update Ip65504P618ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P618-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P618ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P618ReservdS = checkIp65504P618ReservdSMaxLimit(number); 
		serializeIp65504P618ReservdS(ip65504P618ReservdS);
	}

	public void setIp65504P618ReservdS(int number) {
	    number = checkIp65504P618ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P618ReservdS((short)number);
	}
	public void setIp65504P618ReservdS(long number) {
	    number = checkIp65504P618ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P618ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P618ReservdL
	 *	@return ip65504P618ReservdL
	 */
	public short getIp65504P618ReservdL() throws CFException {
        if (isIp65504P618ReservdLModified()) { 
           ip65504P618ReservdL = refreshIp65504P618ReservdL();
        }
   		return ip65504P618ReservdL;
	}
	
	/**
	 * 	Update Ip65504P618ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P618-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P618ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P618ReservdL = checkIp65504P618ReservdLMaxLimit(number); 
		serializeIp65504P618ReservdL(ip65504P618ReservdL);
	}

	public void setIp65504P618ReservdL(int number) {
	    number = checkIp65504P618ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P618ReservdL((short)number);
	}
	public void setIp65504P618ReservdL(long number) {
	    number = checkIp65504P618ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P618ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P619ReservdS
	 *	@return ip65504P619ReservdS
	 */
	public short getIp65504P619ReservdS() throws CFException {
        if (isIp65504P619ReservdSModified()) { 
           ip65504P619ReservdS = refreshIp65504P619ReservdS();
        }
   		return ip65504P619ReservdS;
	}
	
	/**
	 * 	Update Ip65504P619ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P619-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P619ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P619ReservdS = checkIp65504P619ReservdSMaxLimit(number); 
		serializeIp65504P619ReservdS(ip65504P619ReservdS);
	}

	public void setIp65504P619ReservdS(int number) {
	    number = checkIp65504P619ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P619ReservdS((short)number);
	}
	public void setIp65504P619ReservdS(long number) {
	    number = checkIp65504P619ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P619ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P619ReservdL
	 *	@return ip65504P619ReservdL
	 */
	public short getIp65504P619ReservdL() throws CFException {
        if (isIp65504P619ReservdLModified()) { 
           ip65504P619ReservdL = refreshIp65504P619ReservdL();
        }
   		return ip65504P619ReservdL;
	}
	
	/**
	 * 	Update Ip65504P619ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P619-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P619ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P619ReservdL = checkIp65504P619ReservdLMaxLimit(number); 
		serializeIp65504P619ReservdL(ip65504P619ReservdL);
	}

	public void setIp65504P619ReservdL(int number) {
	    number = checkIp65504P619ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P619ReservdL((short)number);
	}
	public void setIp65504P619ReservdL(long number) {
	    number = checkIp65504P619ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P619ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P620OilconmS
	 *	@return ip65504P620OilconmS
	 */
	public short getIp65504P620OilconmS() throws CFException {
        if (isIp65504P620OilconmSModified()) { 
           ip65504P620OilconmS = refreshIp65504P620OilconmS();
        }
   		return ip65504P620OilconmS;
	}
	
	/**
	 * 	Update Ip65504P620OilconmS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P620-OILCONM-S
	 *	@param number
	 */
	public void setIp65504P620OilconmS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P620OilconmS = checkIp65504P620OilconmSMaxLimit(number); 
		serializeIp65504P620OilconmS(ip65504P620OilconmS);
	}

	public void setIp65504P620OilconmS(int number) {
	    number = checkIp65504P620OilconmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P620OilconmS((short)number);
	}
	public void setIp65504P620OilconmS(long number) {
	    number = checkIp65504P620OilconmSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P620OilconmS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P620OilconmL
	 *	@return ip65504P620OilconmL
	 */
	public short getIp65504P620OilconmL() throws CFException {
        if (isIp65504P620OilconmLModified()) { 
           ip65504P620OilconmL = refreshIp65504P620OilconmL();
        }
   		return ip65504P620OilconmL;
	}
	
	/**
	 * 	Update Ip65504P620OilconmL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P620-OILCONM-L
	 *	@param number
	 */
	public void setIp65504P620OilconmL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P620OilconmL = checkIp65504P620OilconmLMaxLimit(number); 
		serializeIp65504P620OilconmL(ip65504P620OilconmL);
	}

	public void setIp65504P620OilconmL(int number) {
	    number = checkIp65504P620OilconmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P620OilconmL((short)number);
	}
	public void setIp65504P620OilconmL(long number) {
	    number = checkIp65504P620OilconmLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P620OilconmL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup20
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P590ReservdS((short)0);
         	setIp65504P590ReservdL((short)0);
         	setIp65504P591ReservdS((short)0);
         	setIp65504P591ReservdL((short)0);
         	setIp65504P592ReservdS((short)0);
         	setIp65504P592ReservdL((short)0);
         	setIp65504P593ReservdS((short)0);
         	setIp65504P593ReservdL((short)0);
         	setIp65504P594ReservdS((short)0);
         	setIp65504P594ReservdL((short)0);
         	setIp65504P595MerTypS((short)0);
         	setIp65504P595MerTypL((short)0);
         	setIp65504P596MerTaxS((short)0);
         	setIp65504P596MerTaxL((short)0);
         	setIp65504P597TaxAmtS((short)0);
         	setIp65504P597TaxAmtL((short)0);
         	setIp65504P598TaxcollS((short)0);
         	setIp65504P598TaxcollL((short)0);
         	setIp65504P599CorVatS((short)0);
         	setIp65504P599CorVatL((short)0);
         	setIp65504P600MerRefS((short)0);
         	setIp65504P600MerRefL((short)0);
         	setIp65504P601ReservdS((short)0);
         	setIp65504P601ReservdL((short)0);
         	setIp65504P602ReservdS((short)0);
         	setIp65504P602ReservdL((short)0);
         	setIp65504P603ReservdS((short)0);
         	setIp65504P603ReservdL((short)0);
         	setIp65504P604ReservdS((short)0);
         	setIp65504P604ReservdL((short)0);
         	setIp65504P605ReservdS((short)0);
         	setIp65504P605ReservdL((short)0);
         	setIp65504P606FrtAmtS((short)0);
         	setIp65504P606FrtAmtL((short)0);
         	setIp65504P607DtyAmtS((short)0);
         	setIp65504P607DtyAmtL((short)0);
         	setIp65504P608DestZpS((short)0);
         	setIp65504P608DestZpL((short)0);
         	setIp65504P609DestStS((short)0);
         	setIp65504P609DestStL((short)0);
         	setIp65504P610DestCyS((short)0);
         	setIp65504P610DestCyL((short)0);
         	setIp65504P611AltTaxS((short)0);
         	setIp65504P611AltTaxL((short)0);
         	setIp65504P612ReservdS((short)0);
         	setIp65504P612ReservdL((short)0);
         	setIp65504P613ShpZipS((short)0);
         	setIp65504P613ShpZipL((short)0);
         	setIp65504P614OrdDteS((short)0);
         	setIp65504P614OrdDteL((short)0);
         	setIp65504P615ReservdS((short)0);
         	setIp65504P615ReservdL((short)0);
         	setIp65504P616ReservdS((short)0);
         	setIp65504P616ReservdL((short)0);
         	setIp65504P617ReservdS((short)0);
         	setIp65504P617ReservdL((short)0);
         	setIp65504P618ReservdS((short)0);
         	setIp65504P618ReservdL((short)0);
         	setIp65504P619ReservdS((short)0);
         	setIp65504P619ReservdL((short)0);
         	setIp65504P620OilconmS((short)0);
         	setIp65504P620OilconmL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup20FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_20_LENGTH;
		}

}
  
