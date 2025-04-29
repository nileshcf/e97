package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup23 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup23 extends Ip65504PdsNamesLargeGroup23Serialized { 
   

								private short ip65504P683TaxAmount4S;

								private short ip65504P683TaxAmount4L;


								private short ip65504P684TaxAmount5S;

								private short ip65504P684TaxAmount5L;


								private short ip65504P685TypeOfSupplyS;

								private short ip65504P685TypeOfSupplyL;


								private short ip65504P686TaxExmptIndS;

								private short ip65504P686TaxExmptIndL;


								private short ip65504P687UnqvatInvrfnoS;

								private short ip65504P687UnqvatInvrfnoL;


								private short ip65504P688ReservdS;

								private short ip65504P688ReservdL;


								private short ip65504P689CorpIdS;

								private short ip65504P689CorpIdL;


								private short ip65504P690NoShowIndS;

								private short ip65504P690NoShowIndL;


								private short ip65504P691DaysRentedS;

								private short ip65504P691DaysRentedL;


								private short ip65504P692WeekRentAmtS;

								private short ip65504P692WeekRentAmtL;


								private short ip65504P693TotAuthAmtS;

								private short ip65504P693TotAuthAmtL;


								private short ip65504P6941waydropChrgeS;

								private short ip65504P6941waydropChrgeL;


								private short ip65504P695RegMileChrgeS;

								private short ip65504P695RegMileChrgeL;


								private short ip65504P696ExtMileChrgeS;

								private short ip65504P696ExtMileChrgeL;


								private short ip65504P697LateChrgeS;

								private short ip65504P697LateChrgeL;


								private short ip65504P698FuelChrgeS;

								private short ip65504P698FuelChrgeL;


								private short ip65504P699TotTaxAmtS;

								private short ip65504P699TotTaxAmtL;


								private short ip65504P700TowingChrgeS;

								private short ip65504P700TowingChrgeL;


								private short ip65504P701ExtraChrgeS;

								private short ip65504P701ExtraChrgeL;


								private short ip65504P702OtherChrgeS;

								private short ip65504P702OtherChrgeL;


								private short ip65504P703TotRoomNightS;

								private short ip65504P703TotRoomNightL;


								private short ip65504P704PrepaidExpnseS;

								private short ip65504P704PrepaidExpnseL;


								private short ip65504P705TotroomTaxamtS;

								private short ip65504P705TotroomTaxamtL;


								private short ip65504P706CashAdvanceS;

								private short ip65504P706CashAdvanceL;


								private short ip65504P707ValetChrgeS;

								private short ip65504P707ValetChrgeL;


								private short ip65504P708MovieChrgeS;

								private short ip65504P708MovieChrgeL;


								private short ip65504P709BsnsCntrChrgS;

								private short ip65504P709BsnsCntrChrgL;


								private short ip65504P710HelthclubChrgS;

								private short ip65504P710HelthclubChrgL;


								private short ip65504P711FireSfactIndS;

								private short ip65504P711FireSfactIndL;


								private short ip65504P712NetFuelPriceS;

								private short ip65504P712NetFuelPriceL;


								private short ip65504P713RestrctTktindS;

								private short ip65504P713RestrctTktindL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup23
	**/
    public Ip65504PdsNamesLargeGroup23() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup23. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup23(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P683TaxAmount4S
	 *	@return ip65504P683TaxAmount4S
	 */
	public short getIp65504P683TaxAmount4S() throws CFException {
        if (isIp65504P683TaxAmount4SModified()) { 
           ip65504P683TaxAmount4S = refreshIp65504P683TaxAmount4S();
        }
   		return ip65504P683TaxAmount4S;
	}
	
	/**
	 * 	Update Ip65504P683TaxAmount4S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P683-TAX-AMOUNT4-S
	 *	@param number
	 */
	public void setIp65504P683TaxAmount4S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P683TaxAmount4S = checkIp65504P683TaxAmount4SMaxLimit(number); 
		serializeIp65504P683TaxAmount4S(ip65504P683TaxAmount4S);
	}

	public void setIp65504P683TaxAmount4S(int number) {
	    number = checkIp65504P683TaxAmount4SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P683TaxAmount4S((short)number);
	}
	public void setIp65504P683TaxAmount4S(long number) {
	    number = checkIp65504P683TaxAmount4SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P683TaxAmount4S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P683TaxAmount4L
	 *	@return ip65504P683TaxAmount4L
	 */
	public short getIp65504P683TaxAmount4L() throws CFException {
        if (isIp65504P683TaxAmount4LModified()) { 
           ip65504P683TaxAmount4L = refreshIp65504P683TaxAmount4L();
        }
   		return ip65504P683TaxAmount4L;
	}
	
	/**
	 * 	Update Ip65504P683TaxAmount4L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P683-TAX-AMOUNT4-L
	 *	@param number
	 */
	public void setIp65504P683TaxAmount4L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P683TaxAmount4L = checkIp65504P683TaxAmount4LMaxLimit(number); 
		serializeIp65504P683TaxAmount4L(ip65504P683TaxAmount4L);
	}

	public void setIp65504P683TaxAmount4L(int number) {
	    number = checkIp65504P683TaxAmount4LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P683TaxAmount4L((short)number);
	}
	public void setIp65504P683TaxAmount4L(long number) {
	    number = checkIp65504P683TaxAmount4LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P683TaxAmount4L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P684TaxAmount5S
	 *	@return ip65504P684TaxAmount5S
	 */
	public short getIp65504P684TaxAmount5S() throws CFException {
        if (isIp65504P684TaxAmount5SModified()) { 
           ip65504P684TaxAmount5S = refreshIp65504P684TaxAmount5S();
        }
   		return ip65504P684TaxAmount5S;
	}
	
	/**
	 * 	Update Ip65504P684TaxAmount5S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P684-TAX-AMOUNT5-S
	 *	@param number
	 */
	public void setIp65504P684TaxAmount5S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P684TaxAmount5S = checkIp65504P684TaxAmount5SMaxLimit(number); 
		serializeIp65504P684TaxAmount5S(ip65504P684TaxAmount5S);
	}

	public void setIp65504P684TaxAmount5S(int number) {
	    number = checkIp65504P684TaxAmount5SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P684TaxAmount5S((short)number);
	}
	public void setIp65504P684TaxAmount5S(long number) {
	    number = checkIp65504P684TaxAmount5SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P684TaxAmount5S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P684TaxAmount5L
	 *	@return ip65504P684TaxAmount5L
	 */
	public short getIp65504P684TaxAmount5L() throws CFException {
        if (isIp65504P684TaxAmount5LModified()) { 
           ip65504P684TaxAmount5L = refreshIp65504P684TaxAmount5L();
        }
   		return ip65504P684TaxAmount5L;
	}
	
	/**
	 * 	Update Ip65504P684TaxAmount5L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P684-TAX-AMOUNT5-L
	 *	@param number
	 */
	public void setIp65504P684TaxAmount5L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P684TaxAmount5L = checkIp65504P684TaxAmount5LMaxLimit(number); 
		serializeIp65504P684TaxAmount5L(ip65504P684TaxAmount5L);
	}

	public void setIp65504P684TaxAmount5L(int number) {
	    number = checkIp65504P684TaxAmount5LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P684TaxAmount5L((short)number);
	}
	public void setIp65504P684TaxAmount5L(long number) {
	    number = checkIp65504P684TaxAmount5LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P684TaxAmount5L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P685TypeOfSupplyS
	 *	@return ip65504P685TypeOfSupplyS
	 */
	public short getIp65504P685TypeOfSupplyS() throws CFException {
        if (isIp65504P685TypeOfSupplySModified()) { 
           ip65504P685TypeOfSupplyS = refreshIp65504P685TypeOfSupplyS();
        }
   		return ip65504P685TypeOfSupplyS;
	}
	
	/**
	 * 	Update Ip65504P685TypeOfSupplyS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P685-TYPE-OF-SUPPLY-S
	 *	@param number
	 */
	public void setIp65504P685TypeOfSupplyS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P685TypeOfSupplyS = checkIp65504P685TypeOfSupplySMaxLimit(number); 
		serializeIp65504P685TypeOfSupplyS(ip65504P685TypeOfSupplyS);
	}

	public void setIp65504P685TypeOfSupplyS(int number) {
	    number = checkIp65504P685TypeOfSupplySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P685TypeOfSupplyS((short)number);
	}
	public void setIp65504P685TypeOfSupplyS(long number) {
	    number = checkIp65504P685TypeOfSupplySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P685TypeOfSupplyS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P685TypeOfSupplyL
	 *	@return ip65504P685TypeOfSupplyL
	 */
	public short getIp65504P685TypeOfSupplyL() throws CFException {
        if (isIp65504P685TypeOfSupplyLModified()) { 
           ip65504P685TypeOfSupplyL = refreshIp65504P685TypeOfSupplyL();
        }
   		return ip65504P685TypeOfSupplyL;
	}
	
	/**
	 * 	Update Ip65504P685TypeOfSupplyL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P685-TYPE-OF-SUPPLY-L
	 *	@param number
	 */
	public void setIp65504P685TypeOfSupplyL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P685TypeOfSupplyL = checkIp65504P685TypeOfSupplyLMaxLimit(number); 
		serializeIp65504P685TypeOfSupplyL(ip65504P685TypeOfSupplyL);
	}

	public void setIp65504P685TypeOfSupplyL(int number) {
	    number = checkIp65504P685TypeOfSupplyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P685TypeOfSupplyL((short)number);
	}
	public void setIp65504P685TypeOfSupplyL(long number) {
	    number = checkIp65504P685TypeOfSupplyLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P685TypeOfSupplyL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P686TaxExmptIndS
	 *	@return ip65504P686TaxExmptIndS
	 */
	public short getIp65504P686TaxExmptIndS() throws CFException {
        if (isIp65504P686TaxExmptIndSModified()) { 
           ip65504P686TaxExmptIndS = refreshIp65504P686TaxExmptIndS();
        }
   		return ip65504P686TaxExmptIndS;
	}
	
	/**
	 * 	Update Ip65504P686TaxExmptIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P686-TAX-EXMPT-IND-S
	 *	@param number
	 */
	public void setIp65504P686TaxExmptIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P686TaxExmptIndS = checkIp65504P686TaxExmptIndSMaxLimit(number); 
		serializeIp65504P686TaxExmptIndS(ip65504P686TaxExmptIndS);
	}

	public void setIp65504P686TaxExmptIndS(int number) {
	    number = checkIp65504P686TaxExmptIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P686TaxExmptIndS((short)number);
	}
	public void setIp65504P686TaxExmptIndS(long number) {
	    number = checkIp65504P686TaxExmptIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P686TaxExmptIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P686TaxExmptIndL
	 *	@return ip65504P686TaxExmptIndL
	 */
	public short getIp65504P686TaxExmptIndL() throws CFException {
        if (isIp65504P686TaxExmptIndLModified()) { 
           ip65504P686TaxExmptIndL = refreshIp65504P686TaxExmptIndL();
        }
   		return ip65504P686TaxExmptIndL;
	}
	
	/**
	 * 	Update Ip65504P686TaxExmptIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P686-TAX-EXMPT-IND-L
	 *	@param number
	 */
	public void setIp65504P686TaxExmptIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P686TaxExmptIndL = checkIp65504P686TaxExmptIndLMaxLimit(number); 
		serializeIp65504P686TaxExmptIndL(ip65504P686TaxExmptIndL);
	}

	public void setIp65504P686TaxExmptIndL(int number) {
	    number = checkIp65504P686TaxExmptIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P686TaxExmptIndL((short)number);
	}
	public void setIp65504P686TaxExmptIndL(long number) {
	    number = checkIp65504P686TaxExmptIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P686TaxExmptIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P687UnqvatInvrfnoS
	 *	@return ip65504P687UnqvatInvrfnoS
	 */
	public short getIp65504P687UnqvatInvrfnoS() throws CFException {
        if (isIp65504P687UnqvatInvrfnoSModified()) { 
           ip65504P687UnqvatInvrfnoS = refreshIp65504P687UnqvatInvrfnoS();
        }
   		return ip65504P687UnqvatInvrfnoS;
	}
	
	/**
	 * 	Update Ip65504P687UnqvatInvrfnoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P687-UNQVAT-INVRFNO-S
	 *	@param number
	 */
	public void setIp65504P687UnqvatInvrfnoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P687UnqvatInvrfnoS = checkIp65504P687UnqvatInvrfnoSMaxLimit(number); 
		serializeIp65504P687UnqvatInvrfnoS(ip65504P687UnqvatInvrfnoS);
	}

	public void setIp65504P687UnqvatInvrfnoS(int number) {
	    number = checkIp65504P687UnqvatInvrfnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P687UnqvatInvrfnoS((short)number);
	}
	public void setIp65504P687UnqvatInvrfnoS(long number) {
	    number = checkIp65504P687UnqvatInvrfnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P687UnqvatInvrfnoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P687UnqvatInvrfnoL
	 *	@return ip65504P687UnqvatInvrfnoL
	 */
	public short getIp65504P687UnqvatInvrfnoL() throws CFException {
        if (isIp65504P687UnqvatInvrfnoLModified()) { 
           ip65504P687UnqvatInvrfnoL = refreshIp65504P687UnqvatInvrfnoL();
        }
   		return ip65504P687UnqvatInvrfnoL;
	}
	
	/**
	 * 	Update Ip65504P687UnqvatInvrfnoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P687-UNQVAT-INVRFNO-L
	 *	@param number
	 */
	public void setIp65504P687UnqvatInvrfnoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P687UnqvatInvrfnoL = checkIp65504P687UnqvatInvrfnoLMaxLimit(number); 
		serializeIp65504P687UnqvatInvrfnoL(ip65504P687UnqvatInvrfnoL);
	}

	public void setIp65504P687UnqvatInvrfnoL(int number) {
	    number = checkIp65504P687UnqvatInvrfnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P687UnqvatInvrfnoL((short)number);
	}
	public void setIp65504P687UnqvatInvrfnoL(long number) {
	    number = checkIp65504P687UnqvatInvrfnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P687UnqvatInvrfnoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P688ReservdS
	 *	@return ip65504P688ReservdS
	 */
	public short getIp65504P688ReservdS() throws CFException {
        if (isIp65504P688ReservdSModified()) { 
           ip65504P688ReservdS = refreshIp65504P688ReservdS();
        }
   		return ip65504P688ReservdS;
	}
	
	/**
	 * 	Update Ip65504P688ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P688-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P688ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P688ReservdS = checkIp65504P688ReservdSMaxLimit(number); 
		serializeIp65504P688ReservdS(ip65504P688ReservdS);
	}

	public void setIp65504P688ReservdS(int number) {
	    number = checkIp65504P688ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P688ReservdS((short)number);
	}
	public void setIp65504P688ReservdS(long number) {
	    number = checkIp65504P688ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P688ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P688ReservdL
	 *	@return ip65504P688ReservdL
	 */
	public short getIp65504P688ReservdL() throws CFException {
        if (isIp65504P688ReservdLModified()) { 
           ip65504P688ReservdL = refreshIp65504P688ReservdL();
        }
   		return ip65504P688ReservdL;
	}
	
	/**
	 * 	Update Ip65504P688ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P688-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P688ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P688ReservdL = checkIp65504P688ReservdLMaxLimit(number); 
		serializeIp65504P688ReservdL(ip65504P688ReservdL);
	}

	public void setIp65504P688ReservdL(int number) {
	    number = checkIp65504P688ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P688ReservdL((short)number);
	}
	public void setIp65504P688ReservdL(long number) {
	    number = checkIp65504P688ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P688ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P689CorpIdS
	 *	@return ip65504P689CorpIdS
	 */
	public short getIp65504P689CorpIdS() throws CFException {
        if (isIp65504P689CorpIdSModified()) { 
           ip65504P689CorpIdS = refreshIp65504P689CorpIdS();
        }
   		return ip65504P689CorpIdS;
	}
	
	/**
	 * 	Update Ip65504P689CorpIdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P689-CORP-ID-S
	 *	@param number
	 */
	public void setIp65504P689CorpIdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P689CorpIdS = checkIp65504P689CorpIdSMaxLimit(number); 
		serializeIp65504P689CorpIdS(ip65504P689CorpIdS);
	}

	public void setIp65504P689CorpIdS(int number) {
	    number = checkIp65504P689CorpIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P689CorpIdS((short)number);
	}
	public void setIp65504P689CorpIdS(long number) {
	    number = checkIp65504P689CorpIdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P689CorpIdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P689CorpIdL
	 *	@return ip65504P689CorpIdL
	 */
	public short getIp65504P689CorpIdL() throws CFException {
        if (isIp65504P689CorpIdLModified()) { 
           ip65504P689CorpIdL = refreshIp65504P689CorpIdL();
        }
   		return ip65504P689CorpIdL;
	}
	
	/**
	 * 	Update Ip65504P689CorpIdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P689-CORP-ID-L
	 *	@param number
	 */
	public void setIp65504P689CorpIdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P689CorpIdL = checkIp65504P689CorpIdLMaxLimit(number); 
		serializeIp65504P689CorpIdL(ip65504P689CorpIdL);
	}

	public void setIp65504P689CorpIdL(int number) {
	    number = checkIp65504P689CorpIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P689CorpIdL((short)number);
	}
	public void setIp65504P689CorpIdL(long number) {
	    number = checkIp65504P689CorpIdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P689CorpIdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P690NoShowIndS
	 *	@return ip65504P690NoShowIndS
	 */
	public short getIp65504P690NoShowIndS() throws CFException {
        if (isIp65504P690NoShowIndSModified()) { 
           ip65504P690NoShowIndS = refreshIp65504P690NoShowIndS();
        }
   		return ip65504P690NoShowIndS;
	}
	
	/**
	 * 	Update Ip65504P690NoShowIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P690-NO-SHOW-IND-S
	 *	@param number
	 */
	public void setIp65504P690NoShowIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P690NoShowIndS = checkIp65504P690NoShowIndSMaxLimit(number); 
		serializeIp65504P690NoShowIndS(ip65504P690NoShowIndS);
	}

	public void setIp65504P690NoShowIndS(int number) {
	    number = checkIp65504P690NoShowIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P690NoShowIndS((short)number);
	}
	public void setIp65504P690NoShowIndS(long number) {
	    number = checkIp65504P690NoShowIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P690NoShowIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P690NoShowIndL
	 *	@return ip65504P690NoShowIndL
	 */
	public short getIp65504P690NoShowIndL() throws CFException {
        if (isIp65504P690NoShowIndLModified()) { 
           ip65504P690NoShowIndL = refreshIp65504P690NoShowIndL();
        }
   		return ip65504P690NoShowIndL;
	}
	
	/**
	 * 	Update Ip65504P690NoShowIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P690-NO-SHOW-IND-L
	 *	@param number
	 */
	public void setIp65504P690NoShowIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P690NoShowIndL = checkIp65504P690NoShowIndLMaxLimit(number); 
		serializeIp65504P690NoShowIndL(ip65504P690NoShowIndL);
	}

	public void setIp65504P690NoShowIndL(int number) {
	    number = checkIp65504P690NoShowIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P690NoShowIndL((short)number);
	}
	public void setIp65504P690NoShowIndL(long number) {
	    number = checkIp65504P690NoShowIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P690NoShowIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P691DaysRentedS
	 *	@return ip65504P691DaysRentedS
	 */
	public short getIp65504P691DaysRentedS() throws CFException {
        if (isIp65504P691DaysRentedSModified()) { 
           ip65504P691DaysRentedS = refreshIp65504P691DaysRentedS();
        }
   		return ip65504P691DaysRentedS;
	}
	
	/**
	 * 	Update Ip65504P691DaysRentedS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P691-DAYS-RENTED-S
	 *	@param number
	 */
	public void setIp65504P691DaysRentedS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P691DaysRentedS = checkIp65504P691DaysRentedSMaxLimit(number); 
		serializeIp65504P691DaysRentedS(ip65504P691DaysRentedS);
	}

	public void setIp65504P691DaysRentedS(int number) {
	    number = checkIp65504P691DaysRentedSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P691DaysRentedS((short)number);
	}
	public void setIp65504P691DaysRentedS(long number) {
	    number = checkIp65504P691DaysRentedSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P691DaysRentedS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P691DaysRentedL
	 *	@return ip65504P691DaysRentedL
	 */
	public short getIp65504P691DaysRentedL() throws CFException {
        if (isIp65504P691DaysRentedLModified()) { 
           ip65504P691DaysRentedL = refreshIp65504P691DaysRentedL();
        }
   		return ip65504P691DaysRentedL;
	}
	
	/**
	 * 	Update Ip65504P691DaysRentedL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P691-DAYS-RENTED-L
	 *	@param number
	 */
	public void setIp65504P691DaysRentedL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P691DaysRentedL = checkIp65504P691DaysRentedLMaxLimit(number); 
		serializeIp65504P691DaysRentedL(ip65504P691DaysRentedL);
	}

	public void setIp65504P691DaysRentedL(int number) {
	    number = checkIp65504P691DaysRentedLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P691DaysRentedL((short)number);
	}
	public void setIp65504P691DaysRentedL(long number) {
	    number = checkIp65504P691DaysRentedLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P691DaysRentedL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P692WeekRentAmtS
	 *	@return ip65504P692WeekRentAmtS
	 */
	public short getIp65504P692WeekRentAmtS() throws CFException {
        if (isIp65504P692WeekRentAmtSModified()) { 
           ip65504P692WeekRentAmtS = refreshIp65504P692WeekRentAmtS();
        }
   		return ip65504P692WeekRentAmtS;
	}
	
	/**
	 * 	Update Ip65504P692WeekRentAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P692-WEEK-RENT-AMT-S
	 *	@param number
	 */
	public void setIp65504P692WeekRentAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P692WeekRentAmtS = checkIp65504P692WeekRentAmtSMaxLimit(number); 
		serializeIp65504P692WeekRentAmtS(ip65504P692WeekRentAmtS);
	}

	public void setIp65504P692WeekRentAmtS(int number) {
	    number = checkIp65504P692WeekRentAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P692WeekRentAmtS((short)number);
	}
	public void setIp65504P692WeekRentAmtS(long number) {
	    number = checkIp65504P692WeekRentAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P692WeekRentAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P692WeekRentAmtL
	 *	@return ip65504P692WeekRentAmtL
	 */
	public short getIp65504P692WeekRentAmtL() throws CFException {
        if (isIp65504P692WeekRentAmtLModified()) { 
           ip65504P692WeekRentAmtL = refreshIp65504P692WeekRentAmtL();
        }
   		return ip65504P692WeekRentAmtL;
	}
	
	/**
	 * 	Update Ip65504P692WeekRentAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P692-WEEK-RENT-AMT-L
	 *	@param number
	 */
	public void setIp65504P692WeekRentAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P692WeekRentAmtL = checkIp65504P692WeekRentAmtLMaxLimit(number); 
		serializeIp65504P692WeekRentAmtL(ip65504P692WeekRentAmtL);
	}

	public void setIp65504P692WeekRentAmtL(int number) {
	    number = checkIp65504P692WeekRentAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P692WeekRentAmtL((short)number);
	}
	public void setIp65504P692WeekRentAmtL(long number) {
	    number = checkIp65504P692WeekRentAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P692WeekRentAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P693TotAuthAmtS
	 *	@return ip65504P693TotAuthAmtS
	 */
	public short getIp65504P693TotAuthAmtS() throws CFException {
        if (isIp65504P693TotAuthAmtSModified()) { 
           ip65504P693TotAuthAmtS = refreshIp65504P693TotAuthAmtS();
        }
   		return ip65504P693TotAuthAmtS;
	}
	
	/**
	 * 	Update Ip65504P693TotAuthAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P693-TOT-AUTH-AMT-S
	 *	@param number
	 */
	public void setIp65504P693TotAuthAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P693TotAuthAmtS = checkIp65504P693TotAuthAmtSMaxLimit(number); 
		serializeIp65504P693TotAuthAmtS(ip65504P693TotAuthAmtS);
	}

	public void setIp65504P693TotAuthAmtS(int number) {
	    number = checkIp65504P693TotAuthAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P693TotAuthAmtS((short)number);
	}
	public void setIp65504P693TotAuthAmtS(long number) {
	    number = checkIp65504P693TotAuthAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P693TotAuthAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P693TotAuthAmtL
	 *	@return ip65504P693TotAuthAmtL
	 */
	public short getIp65504P693TotAuthAmtL() throws CFException {
        if (isIp65504P693TotAuthAmtLModified()) { 
           ip65504P693TotAuthAmtL = refreshIp65504P693TotAuthAmtL();
        }
   		return ip65504P693TotAuthAmtL;
	}
	
	/**
	 * 	Update Ip65504P693TotAuthAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P693-TOT-AUTH-AMT-L
	 *	@param number
	 */
	public void setIp65504P693TotAuthAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P693TotAuthAmtL = checkIp65504P693TotAuthAmtLMaxLimit(number); 
		serializeIp65504P693TotAuthAmtL(ip65504P693TotAuthAmtL);
	}

	public void setIp65504P693TotAuthAmtL(int number) {
	    number = checkIp65504P693TotAuthAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P693TotAuthAmtL((short)number);
	}
	public void setIp65504P693TotAuthAmtL(long number) {
	    number = checkIp65504P693TotAuthAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P693TotAuthAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P6941waydropChrgeS
	 *	@return ip65504P6941waydropChrgeS
	 */
	public short getIp65504P6941waydropChrgeS() throws CFException {
        if (isIp65504P6941waydropChrgeSModified()) { 
           ip65504P6941waydropChrgeS = refreshIp65504P6941waydropChrgeS();
        }
   		return ip65504P6941waydropChrgeS;
	}
	
	/**
	 * 	Update Ip65504P6941waydropChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P694-1WAYDROP-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P6941waydropChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P6941waydropChrgeS = checkIp65504P6941waydropChrgeSMaxLimit(number); 
		serializeIp65504P6941waydropChrgeS(ip65504P6941waydropChrgeS);
	}

	public void setIp65504P6941waydropChrgeS(int number) {
	    number = checkIp65504P6941waydropChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P6941waydropChrgeS((short)number);
	}
	public void setIp65504P6941waydropChrgeS(long number) {
	    number = checkIp65504P6941waydropChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P6941waydropChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P6941waydropChrgeL
	 *	@return ip65504P6941waydropChrgeL
	 */
	public short getIp65504P6941waydropChrgeL() throws CFException {
        if (isIp65504P6941waydropChrgeLModified()) { 
           ip65504P6941waydropChrgeL = refreshIp65504P6941waydropChrgeL();
        }
   		return ip65504P6941waydropChrgeL;
	}
	
	/**
	 * 	Update Ip65504P6941waydropChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P694-1WAYDROP-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P6941waydropChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P6941waydropChrgeL = checkIp65504P6941waydropChrgeLMaxLimit(number); 
		serializeIp65504P6941waydropChrgeL(ip65504P6941waydropChrgeL);
	}

	public void setIp65504P6941waydropChrgeL(int number) {
	    number = checkIp65504P6941waydropChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P6941waydropChrgeL((short)number);
	}
	public void setIp65504P6941waydropChrgeL(long number) {
	    number = checkIp65504P6941waydropChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P6941waydropChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P695RegMileChrgeS
	 *	@return ip65504P695RegMileChrgeS
	 */
	public short getIp65504P695RegMileChrgeS() throws CFException {
        if (isIp65504P695RegMileChrgeSModified()) { 
           ip65504P695RegMileChrgeS = refreshIp65504P695RegMileChrgeS();
        }
   		return ip65504P695RegMileChrgeS;
	}
	
	/**
	 * 	Update Ip65504P695RegMileChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P695-REG-MILE-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P695RegMileChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P695RegMileChrgeS = checkIp65504P695RegMileChrgeSMaxLimit(number); 
		serializeIp65504P695RegMileChrgeS(ip65504P695RegMileChrgeS);
	}

	public void setIp65504P695RegMileChrgeS(int number) {
	    number = checkIp65504P695RegMileChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P695RegMileChrgeS((short)number);
	}
	public void setIp65504P695RegMileChrgeS(long number) {
	    number = checkIp65504P695RegMileChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P695RegMileChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P695RegMileChrgeL
	 *	@return ip65504P695RegMileChrgeL
	 */
	public short getIp65504P695RegMileChrgeL() throws CFException {
        if (isIp65504P695RegMileChrgeLModified()) { 
           ip65504P695RegMileChrgeL = refreshIp65504P695RegMileChrgeL();
        }
   		return ip65504P695RegMileChrgeL;
	}
	
	/**
	 * 	Update Ip65504P695RegMileChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P695-REG-MILE-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P695RegMileChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P695RegMileChrgeL = checkIp65504P695RegMileChrgeLMaxLimit(number); 
		serializeIp65504P695RegMileChrgeL(ip65504P695RegMileChrgeL);
	}

	public void setIp65504P695RegMileChrgeL(int number) {
	    number = checkIp65504P695RegMileChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P695RegMileChrgeL((short)number);
	}
	public void setIp65504P695RegMileChrgeL(long number) {
	    number = checkIp65504P695RegMileChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P695RegMileChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P696ExtMileChrgeS
	 *	@return ip65504P696ExtMileChrgeS
	 */
	public short getIp65504P696ExtMileChrgeS() throws CFException {
        if (isIp65504P696ExtMileChrgeSModified()) { 
           ip65504P696ExtMileChrgeS = refreshIp65504P696ExtMileChrgeS();
        }
   		return ip65504P696ExtMileChrgeS;
	}
	
	/**
	 * 	Update Ip65504P696ExtMileChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P696-EXT-MILE-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P696ExtMileChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P696ExtMileChrgeS = checkIp65504P696ExtMileChrgeSMaxLimit(number); 
		serializeIp65504P696ExtMileChrgeS(ip65504P696ExtMileChrgeS);
	}

	public void setIp65504P696ExtMileChrgeS(int number) {
	    number = checkIp65504P696ExtMileChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P696ExtMileChrgeS((short)number);
	}
	public void setIp65504P696ExtMileChrgeS(long number) {
	    number = checkIp65504P696ExtMileChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P696ExtMileChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P696ExtMileChrgeL
	 *	@return ip65504P696ExtMileChrgeL
	 */
	public short getIp65504P696ExtMileChrgeL() throws CFException {
        if (isIp65504P696ExtMileChrgeLModified()) { 
           ip65504P696ExtMileChrgeL = refreshIp65504P696ExtMileChrgeL();
        }
   		return ip65504P696ExtMileChrgeL;
	}
	
	/**
	 * 	Update Ip65504P696ExtMileChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P696-EXT-MILE-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P696ExtMileChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P696ExtMileChrgeL = checkIp65504P696ExtMileChrgeLMaxLimit(number); 
		serializeIp65504P696ExtMileChrgeL(ip65504P696ExtMileChrgeL);
	}

	public void setIp65504P696ExtMileChrgeL(int number) {
	    number = checkIp65504P696ExtMileChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P696ExtMileChrgeL((short)number);
	}
	public void setIp65504P696ExtMileChrgeL(long number) {
	    number = checkIp65504P696ExtMileChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P696ExtMileChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P697LateChrgeS
	 *	@return ip65504P697LateChrgeS
	 */
	public short getIp65504P697LateChrgeS() throws CFException {
        if (isIp65504P697LateChrgeSModified()) { 
           ip65504P697LateChrgeS = refreshIp65504P697LateChrgeS();
        }
   		return ip65504P697LateChrgeS;
	}
	
	/**
	 * 	Update Ip65504P697LateChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P697-LATE-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P697LateChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P697LateChrgeS = checkIp65504P697LateChrgeSMaxLimit(number); 
		serializeIp65504P697LateChrgeS(ip65504P697LateChrgeS);
	}

	public void setIp65504P697LateChrgeS(int number) {
	    number = checkIp65504P697LateChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P697LateChrgeS((short)number);
	}
	public void setIp65504P697LateChrgeS(long number) {
	    number = checkIp65504P697LateChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P697LateChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P697LateChrgeL
	 *	@return ip65504P697LateChrgeL
	 */
	public short getIp65504P697LateChrgeL() throws CFException {
        if (isIp65504P697LateChrgeLModified()) { 
           ip65504P697LateChrgeL = refreshIp65504P697LateChrgeL();
        }
   		return ip65504P697LateChrgeL;
	}
	
	/**
	 * 	Update Ip65504P697LateChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P697-LATE-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P697LateChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P697LateChrgeL = checkIp65504P697LateChrgeLMaxLimit(number); 
		serializeIp65504P697LateChrgeL(ip65504P697LateChrgeL);
	}

	public void setIp65504P697LateChrgeL(int number) {
	    number = checkIp65504P697LateChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P697LateChrgeL((short)number);
	}
	public void setIp65504P697LateChrgeL(long number) {
	    number = checkIp65504P697LateChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P697LateChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P698FuelChrgeS
	 *	@return ip65504P698FuelChrgeS
	 */
	public short getIp65504P698FuelChrgeS() throws CFException {
        if (isIp65504P698FuelChrgeSModified()) { 
           ip65504P698FuelChrgeS = refreshIp65504P698FuelChrgeS();
        }
   		return ip65504P698FuelChrgeS;
	}
	
	/**
	 * 	Update Ip65504P698FuelChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P698-FUEL-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P698FuelChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P698FuelChrgeS = checkIp65504P698FuelChrgeSMaxLimit(number); 
		serializeIp65504P698FuelChrgeS(ip65504P698FuelChrgeS);
	}

	public void setIp65504P698FuelChrgeS(int number) {
	    number = checkIp65504P698FuelChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P698FuelChrgeS((short)number);
	}
	public void setIp65504P698FuelChrgeS(long number) {
	    number = checkIp65504P698FuelChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P698FuelChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P698FuelChrgeL
	 *	@return ip65504P698FuelChrgeL
	 */
	public short getIp65504P698FuelChrgeL() throws CFException {
        if (isIp65504P698FuelChrgeLModified()) { 
           ip65504P698FuelChrgeL = refreshIp65504P698FuelChrgeL();
        }
   		return ip65504P698FuelChrgeL;
	}
	
	/**
	 * 	Update Ip65504P698FuelChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P698-FUEL-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P698FuelChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P698FuelChrgeL = checkIp65504P698FuelChrgeLMaxLimit(number); 
		serializeIp65504P698FuelChrgeL(ip65504P698FuelChrgeL);
	}

	public void setIp65504P698FuelChrgeL(int number) {
	    number = checkIp65504P698FuelChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P698FuelChrgeL((short)number);
	}
	public void setIp65504P698FuelChrgeL(long number) {
	    number = checkIp65504P698FuelChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P698FuelChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P699TotTaxAmtS
	 *	@return ip65504P699TotTaxAmtS
	 */
	public short getIp65504P699TotTaxAmtS() throws CFException {
        if (isIp65504P699TotTaxAmtSModified()) { 
           ip65504P699TotTaxAmtS = refreshIp65504P699TotTaxAmtS();
        }
   		return ip65504P699TotTaxAmtS;
	}
	
	/**
	 * 	Update Ip65504P699TotTaxAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P699-TOT-TAX-AMT-S
	 *	@param number
	 */
	public void setIp65504P699TotTaxAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P699TotTaxAmtS = checkIp65504P699TotTaxAmtSMaxLimit(number); 
		serializeIp65504P699TotTaxAmtS(ip65504P699TotTaxAmtS);
	}

	public void setIp65504P699TotTaxAmtS(int number) {
	    number = checkIp65504P699TotTaxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P699TotTaxAmtS((short)number);
	}
	public void setIp65504P699TotTaxAmtS(long number) {
	    number = checkIp65504P699TotTaxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P699TotTaxAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P699TotTaxAmtL
	 *	@return ip65504P699TotTaxAmtL
	 */
	public short getIp65504P699TotTaxAmtL() throws CFException {
        if (isIp65504P699TotTaxAmtLModified()) { 
           ip65504P699TotTaxAmtL = refreshIp65504P699TotTaxAmtL();
        }
   		return ip65504P699TotTaxAmtL;
	}
	
	/**
	 * 	Update Ip65504P699TotTaxAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P699-TOT-TAX-AMT-L
	 *	@param number
	 */
	public void setIp65504P699TotTaxAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P699TotTaxAmtL = checkIp65504P699TotTaxAmtLMaxLimit(number); 
		serializeIp65504P699TotTaxAmtL(ip65504P699TotTaxAmtL);
	}

	public void setIp65504P699TotTaxAmtL(int number) {
	    number = checkIp65504P699TotTaxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P699TotTaxAmtL((short)number);
	}
	public void setIp65504P699TotTaxAmtL(long number) {
	    number = checkIp65504P699TotTaxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P699TotTaxAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P700TowingChrgeS
	 *	@return ip65504P700TowingChrgeS
	 */
	public short getIp65504P700TowingChrgeS() throws CFException {
        if (isIp65504P700TowingChrgeSModified()) { 
           ip65504P700TowingChrgeS = refreshIp65504P700TowingChrgeS();
        }
   		return ip65504P700TowingChrgeS;
	}
	
	/**
	 * 	Update Ip65504P700TowingChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P700-TOWING-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P700TowingChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P700TowingChrgeS = checkIp65504P700TowingChrgeSMaxLimit(number); 
		serializeIp65504P700TowingChrgeS(ip65504P700TowingChrgeS);
	}

	public void setIp65504P700TowingChrgeS(int number) {
	    number = checkIp65504P700TowingChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P700TowingChrgeS((short)number);
	}
	public void setIp65504P700TowingChrgeS(long number) {
	    number = checkIp65504P700TowingChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P700TowingChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P700TowingChrgeL
	 *	@return ip65504P700TowingChrgeL
	 */
	public short getIp65504P700TowingChrgeL() throws CFException {
        if (isIp65504P700TowingChrgeLModified()) { 
           ip65504P700TowingChrgeL = refreshIp65504P700TowingChrgeL();
        }
   		return ip65504P700TowingChrgeL;
	}
	
	/**
	 * 	Update Ip65504P700TowingChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P700-TOWING-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P700TowingChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P700TowingChrgeL = checkIp65504P700TowingChrgeLMaxLimit(number); 
		serializeIp65504P700TowingChrgeL(ip65504P700TowingChrgeL);
	}

	public void setIp65504P700TowingChrgeL(int number) {
	    number = checkIp65504P700TowingChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P700TowingChrgeL((short)number);
	}
	public void setIp65504P700TowingChrgeL(long number) {
	    number = checkIp65504P700TowingChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P700TowingChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P701ExtraChrgeS
	 *	@return ip65504P701ExtraChrgeS
	 */
	public short getIp65504P701ExtraChrgeS() throws CFException {
        if (isIp65504P701ExtraChrgeSModified()) { 
           ip65504P701ExtraChrgeS = refreshIp65504P701ExtraChrgeS();
        }
   		return ip65504P701ExtraChrgeS;
	}
	
	/**
	 * 	Update Ip65504P701ExtraChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P701-EXTRA-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P701ExtraChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P701ExtraChrgeS = checkIp65504P701ExtraChrgeSMaxLimit(number); 
		serializeIp65504P701ExtraChrgeS(ip65504P701ExtraChrgeS);
	}

	public void setIp65504P701ExtraChrgeS(int number) {
	    number = checkIp65504P701ExtraChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P701ExtraChrgeS((short)number);
	}
	public void setIp65504P701ExtraChrgeS(long number) {
	    number = checkIp65504P701ExtraChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P701ExtraChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P701ExtraChrgeL
	 *	@return ip65504P701ExtraChrgeL
	 */
	public short getIp65504P701ExtraChrgeL() throws CFException {
        if (isIp65504P701ExtraChrgeLModified()) { 
           ip65504P701ExtraChrgeL = refreshIp65504P701ExtraChrgeL();
        }
   		return ip65504P701ExtraChrgeL;
	}
	
	/**
	 * 	Update Ip65504P701ExtraChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P701-EXTRA-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P701ExtraChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P701ExtraChrgeL = checkIp65504P701ExtraChrgeLMaxLimit(number); 
		serializeIp65504P701ExtraChrgeL(ip65504P701ExtraChrgeL);
	}

	public void setIp65504P701ExtraChrgeL(int number) {
	    number = checkIp65504P701ExtraChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P701ExtraChrgeL((short)number);
	}
	public void setIp65504P701ExtraChrgeL(long number) {
	    number = checkIp65504P701ExtraChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P701ExtraChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P702OtherChrgeS
	 *	@return ip65504P702OtherChrgeS
	 */
	public short getIp65504P702OtherChrgeS() throws CFException {
        if (isIp65504P702OtherChrgeSModified()) { 
           ip65504P702OtherChrgeS = refreshIp65504P702OtherChrgeS();
        }
   		return ip65504P702OtherChrgeS;
	}
	
	/**
	 * 	Update Ip65504P702OtherChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P702-OTHER-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P702OtherChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P702OtherChrgeS = checkIp65504P702OtherChrgeSMaxLimit(number); 
		serializeIp65504P702OtherChrgeS(ip65504P702OtherChrgeS);
	}

	public void setIp65504P702OtherChrgeS(int number) {
	    number = checkIp65504P702OtherChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P702OtherChrgeS((short)number);
	}
	public void setIp65504P702OtherChrgeS(long number) {
	    number = checkIp65504P702OtherChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P702OtherChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P702OtherChrgeL
	 *	@return ip65504P702OtherChrgeL
	 */
	public short getIp65504P702OtherChrgeL() throws CFException {
        if (isIp65504P702OtherChrgeLModified()) { 
           ip65504P702OtherChrgeL = refreshIp65504P702OtherChrgeL();
        }
   		return ip65504P702OtherChrgeL;
	}
	
	/**
	 * 	Update Ip65504P702OtherChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P702-OTHER-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P702OtherChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P702OtherChrgeL = checkIp65504P702OtherChrgeLMaxLimit(number); 
		serializeIp65504P702OtherChrgeL(ip65504P702OtherChrgeL);
	}

	public void setIp65504P702OtherChrgeL(int number) {
	    number = checkIp65504P702OtherChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P702OtherChrgeL((short)number);
	}
	public void setIp65504P702OtherChrgeL(long number) {
	    number = checkIp65504P702OtherChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P702OtherChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P703TotRoomNightS
	 *	@return ip65504P703TotRoomNightS
	 */
	public short getIp65504P703TotRoomNightS() throws CFException {
        if (isIp65504P703TotRoomNightSModified()) { 
           ip65504P703TotRoomNightS = refreshIp65504P703TotRoomNightS();
        }
   		return ip65504P703TotRoomNightS;
	}
	
	/**
	 * 	Update Ip65504P703TotRoomNightS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P703-TOT-ROOM-NIGHT-S
	 *	@param number
	 */
	public void setIp65504P703TotRoomNightS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P703TotRoomNightS = checkIp65504P703TotRoomNightSMaxLimit(number); 
		serializeIp65504P703TotRoomNightS(ip65504P703TotRoomNightS);
	}

	public void setIp65504P703TotRoomNightS(int number) {
	    number = checkIp65504P703TotRoomNightSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P703TotRoomNightS((short)number);
	}
	public void setIp65504P703TotRoomNightS(long number) {
	    number = checkIp65504P703TotRoomNightSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P703TotRoomNightS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P703TotRoomNightL
	 *	@return ip65504P703TotRoomNightL
	 */
	public short getIp65504P703TotRoomNightL() throws CFException {
        if (isIp65504P703TotRoomNightLModified()) { 
           ip65504P703TotRoomNightL = refreshIp65504P703TotRoomNightL();
        }
   		return ip65504P703TotRoomNightL;
	}
	
	/**
	 * 	Update Ip65504P703TotRoomNightL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P703-TOT-ROOM-NIGHT-L
	 *	@param number
	 */
	public void setIp65504P703TotRoomNightL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P703TotRoomNightL = checkIp65504P703TotRoomNightLMaxLimit(number); 
		serializeIp65504P703TotRoomNightL(ip65504P703TotRoomNightL);
	}

	public void setIp65504P703TotRoomNightL(int number) {
	    number = checkIp65504P703TotRoomNightLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P703TotRoomNightL((short)number);
	}
	public void setIp65504P703TotRoomNightL(long number) {
	    number = checkIp65504P703TotRoomNightLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P703TotRoomNightL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P704PrepaidExpnseS
	 *	@return ip65504P704PrepaidExpnseS
	 */
	public short getIp65504P704PrepaidExpnseS() throws CFException {
        if (isIp65504P704PrepaidExpnseSModified()) { 
           ip65504P704PrepaidExpnseS = refreshIp65504P704PrepaidExpnseS();
        }
   		return ip65504P704PrepaidExpnseS;
	}
	
	/**
	 * 	Update Ip65504P704PrepaidExpnseS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P704-PREPAID-EXPNSE-S
	 *	@param number
	 */
	public void setIp65504P704PrepaidExpnseS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P704PrepaidExpnseS = checkIp65504P704PrepaidExpnseSMaxLimit(number); 
		serializeIp65504P704PrepaidExpnseS(ip65504P704PrepaidExpnseS);
	}

	public void setIp65504P704PrepaidExpnseS(int number) {
	    number = checkIp65504P704PrepaidExpnseSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P704PrepaidExpnseS((short)number);
	}
	public void setIp65504P704PrepaidExpnseS(long number) {
	    number = checkIp65504P704PrepaidExpnseSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P704PrepaidExpnseS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P704PrepaidExpnseL
	 *	@return ip65504P704PrepaidExpnseL
	 */
	public short getIp65504P704PrepaidExpnseL() throws CFException {
        if (isIp65504P704PrepaidExpnseLModified()) { 
           ip65504P704PrepaidExpnseL = refreshIp65504P704PrepaidExpnseL();
        }
   		return ip65504P704PrepaidExpnseL;
	}
	
	/**
	 * 	Update Ip65504P704PrepaidExpnseL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P704-PREPAID-EXPNSE-L
	 *	@param number
	 */
	public void setIp65504P704PrepaidExpnseL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P704PrepaidExpnseL = checkIp65504P704PrepaidExpnseLMaxLimit(number); 
		serializeIp65504P704PrepaidExpnseL(ip65504P704PrepaidExpnseL);
	}

	public void setIp65504P704PrepaidExpnseL(int number) {
	    number = checkIp65504P704PrepaidExpnseLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P704PrepaidExpnseL((short)number);
	}
	public void setIp65504P704PrepaidExpnseL(long number) {
	    number = checkIp65504P704PrepaidExpnseLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P704PrepaidExpnseL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P705TotroomTaxamtS
	 *	@return ip65504P705TotroomTaxamtS
	 */
	public short getIp65504P705TotroomTaxamtS() throws CFException {
        if (isIp65504P705TotroomTaxamtSModified()) { 
           ip65504P705TotroomTaxamtS = refreshIp65504P705TotroomTaxamtS();
        }
   		return ip65504P705TotroomTaxamtS;
	}
	
	/**
	 * 	Update Ip65504P705TotroomTaxamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P705-TOTROOM-TAXAMT-S
	 *	@param number
	 */
	public void setIp65504P705TotroomTaxamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P705TotroomTaxamtS = checkIp65504P705TotroomTaxamtSMaxLimit(number); 
		serializeIp65504P705TotroomTaxamtS(ip65504P705TotroomTaxamtS);
	}

	public void setIp65504P705TotroomTaxamtS(int number) {
	    number = checkIp65504P705TotroomTaxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P705TotroomTaxamtS((short)number);
	}
	public void setIp65504P705TotroomTaxamtS(long number) {
	    number = checkIp65504P705TotroomTaxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P705TotroomTaxamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P705TotroomTaxamtL
	 *	@return ip65504P705TotroomTaxamtL
	 */
	public short getIp65504P705TotroomTaxamtL() throws CFException {
        if (isIp65504P705TotroomTaxamtLModified()) { 
           ip65504P705TotroomTaxamtL = refreshIp65504P705TotroomTaxamtL();
        }
   		return ip65504P705TotroomTaxamtL;
	}
	
	/**
	 * 	Update Ip65504P705TotroomTaxamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P705-TOTROOM-TAXAMT-L
	 *	@param number
	 */
	public void setIp65504P705TotroomTaxamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P705TotroomTaxamtL = checkIp65504P705TotroomTaxamtLMaxLimit(number); 
		serializeIp65504P705TotroomTaxamtL(ip65504P705TotroomTaxamtL);
	}

	public void setIp65504P705TotroomTaxamtL(int number) {
	    number = checkIp65504P705TotroomTaxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P705TotroomTaxamtL((short)number);
	}
	public void setIp65504P705TotroomTaxamtL(long number) {
	    number = checkIp65504P705TotroomTaxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P705TotroomTaxamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P706CashAdvanceS
	 *	@return ip65504P706CashAdvanceS
	 */
	public short getIp65504P706CashAdvanceS() throws CFException {
        if (isIp65504P706CashAdvanceSModified()) { 
           ip65504P706CashAdvanceS = refreshIp65504P706CashAdvanceS();
        }
   		return ip65504P706CashAdvanceS;
	}
	
	/**
	 * 	Update Ip65504P706CashAdvanceS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P706-CASH-ADVANCE-S
	 *	@param number
	 */
	public void setIp65504P706CashAdvanceS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P706CashAdvanceS = checkIp65504P706CashAdvanceSMaxLimit(number); 
		serializeIp65504P706CashAdvanceS(ip65504P706CashAdvanceS);
	}

	public void setIp65504P706CashAdvanceS(int number) {
	    number = checkIp65504P706CashAdvanceSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P706CashAdvanceS((short)number);
	}
	public void setIp65504P706CashAdvanceS(long number) {
	    number = checkIp65504P706CashAdvanceSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P706CashAdvanceS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P706CashAdvanceL
	 *	@return ip65504P706CashAdvanceL
	 */
	public short getIp65504P706CashAdvanceL() throws CFException {
        if (isIp65504P706CashAdvanceLModified()) { 
           ip65504P706CashAdvanceL = refreshIp65504P706CashAdvanceL();
        }
   		return ip65504P706CashAdvanceL;
	}
	
	/**
	 * 	Update Ip65504P706CashAdvanceL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P706-CASH-ADVANCE-L
	 *	@param number
	 */
	public void setIp65504P706CashAdvanceL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P706CashAdvanceL = checkIp65504P706CashAdvanceLMaxLimit(number); 
		serializeIp65504P706CashAdvanceL(ip65504P706CashAdvanceL);
	}

	public void setIp65504P706CashAdvanceL(int number) {
	    number = checkIp65504P706CashAdvanceLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P706CashAdvanceL((short)number);
	}
	public void setIp65504P706CashAdvanceL(long number) {
	    number = checkIp65504P706CashAdvanceLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P706CashAdvanceL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P707ValetChrgeS
	 *	@return ip65504P707ValetChrgeS
	 */
	public short getIp65504P707ValetChrgeS() throws CFException {
        if (isIp65504P707ValetChrgeSModified()) { 
           ip65504P707ValetChrgeS = refreshIp65504P707ValetChrgeS();
        }
   		return ip65504P707ValetChrgeS;
	}
	
	/**
	 * 	Update Ip65504P707ValetChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P707-VALET-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P707ValetChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P707ValetChrgeS = checkIp65504P707ValetChrgeSMaxLimit(number); 
		serializeIp65504P707ValetChrgeS(ip65504P707ValetChrgeS);
	}

	public void setIp65504P707ValetChrgeS(int number) {
	    number = checkIp65504P707ValetChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P707ValetChrgeS((short)number);
	}
	public void setIp65504P707ValetChrgeS(long number) {
	    number = checkIp65504P707ValetChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P707ValetChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P707ValetChrgeL
	 *	@return ip65504P707ValetChrgeL
	 */
	public short getIp65504P707ValetChrgeL() throws CFException {
        if (isIp65504P707ValetChrgeLModified()) { 
           ip65504P707ValetChrgeL = refreshIp65504P707ValetChrgeL();
        }
   		return ip65504P707ValetChrgeL;
	}
	
	/**
	 * 	Update Ip65504P707ValetChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P707-VALET-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P707ValetChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P707ValetChrgeL = checkIp65504P707ValetChrgeLMaxLimit(number); 
		serializeIp65504P707ValetChrgeL(ip65504P707ValetChrgeL);
	}

	public void setIp65504P707ValetChrgeL(int number) {
	    number = checkIp65504P707ValetChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P707ValetChrgeL((short)number);
	}
	public void setIp65504P707ValetChrgeL(long number) {
	    number = checkIp65504P707ValetChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P707ValetChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P708MovieChrgeS
	 *	@return ip65504P708MovieChrgeS
	 */
	public short getIp65504P708MovieChrgeS() throws CFException {
        if (isIp65504P708MovieChrgeSModified()) { 
           ip65504P708MovieChrgeS = refreshIp65504P708MovieChrgeS();
        }
   		return ip65504P708MovieChrgeS;
	}
	
	/**
	 * 	Update Ip65504P708MovieChrgeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P708-MOVIE-CHRGE-S
	 *	@param number
	 */
	public void setIp65504P708MovieChrgeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P708MovieChrgeS = checkIp65504P708MovieChrgeSMaxLimit(number); 
		serializeIp65504P708MovieChrgeS(ip65504P708MovieChrgeS);
	}

	public void setIp65504P708MovieChrgeS(int number) {
	    number = checkIp65504P708MovieChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P708MovieChrgeS((short)number);
	}
	public void setIp65504P708MovieChrgeS(long number) {
	    number = checkIp65504P708MovieChrgeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P708MovieChrgeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P708MovieChrgeL
	 *	@return ip65504P708MovieChrgeL
	 */
	public short getIp65504P708MovieChrgeL() throws CFException {
        if (isIp65504P708MovieChrgeLModified()) { 
           ip65504P708MovieChrgeL = refreshIp65504P708MovieChrgeL();
        }
   		return ip65504P708MovieChrgeL;
	}
	
	/**
	 * 	Update Ip65504P708MovieChrgeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P708-MOVIE-CHRGE-L
	 *	@param number
	 */
	public void setIp65504P708MovieChrgeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P708MovieChrgeL = checkIp65504P708MovieChrgeLMaxLimit(number); 
		serializeIp65504P708MovieChrgeL(ip65504P708MovieChrgeL);
	}

	public void setIp65504P708MovieChrgeL(int number) {
	    number = checkIp65504P708MovieChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P708MovieChrgeL((short)number);
	}
	public void setIp65504P708MovieChrgeL(long number) {
	    number = checkIp65504P708MovieChrgeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P708MovieChrgeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P709BsnsCntrChrgS
	 *	@return ip65504P709BsnsCntrChrgS
	 */
	public short getIp65504P709BsnsCntrChrgS() throws CFException {
        if (isIp65504P709BsnsCntrChrgSModified()) { 
           ip65504P709BsnsCntrChrgS = refreshIp65504P709BsnsCntrChrgS();
        }
   		return ip65504P709BsnsCntrChrgS;
	}
	
	/**
	 * 	Update Ip65504P709BsnsCntrChrgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P709-BSNS-CNTR-CHRG-S
	 *	@param number
	 */
	public void setIp65504P709BsnsCntrChrgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P709BsnsCntrChrgS = checkIp65504P709BsnsCntrChrgSMaxLimit(number); 
		serializeIp65504P709BsnsCntrChrgS(ip65504P709BsnsCntrChrgS);
	}

	public void setIp65504P709BsnsCntrChrgS(int number) {
	    number = checkIp65504P709BsnsCntrChrgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P709BsnsCntrChrgS((short)number);
	}
	public void setIp65504P709BsnsCntrChrgS(long number) {
	    number = checkIp65504P709BsnsCntrChrgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P709BsnsCntrChrgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P709BsnsCntrChrgL
	 *	@return ip65504P709BsnsCntrChrgL
	 */
	public short getIp65504P709BsnsCntrChrgL() throws CFException {
        if (isIp65504P709BsnsCntrChrgLModified()) { 
           ip65504P709BsnsCntrChrgL = refreshIp65504P709BsnsCntrChrgL();
        }
   		return ip65504P709BsnsCntrChrgL;
	}
	
	/**
	 * 	Update Ip65504P709BsnsCntrChrgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P709-BSNS-CNTR-CHRG-L
	 *	@param number
	 */
	public void setIp65504P709BsnsCntrChrgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P709BsnsCntrChrgL = checkIp65504P709BsnsCntrChrgLMaxLimit(number); 
		serializeIp65504P709BsnsCntrChrgL(ip65504P709BsnsCntrChrgL);
	}

	public void setIp65504P709BsnsCntrChrgL(int number) {
	    number = checkIp65504P709BsnsCntrChrgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P709BsnsCntrChrgL((short)number);
	}
	public void setIp65504P709BsnsCntrChrgL(long number) {
	    number = checkIp65504P709BsnsCntrChrgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P709BsnsCntrChrgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P710HelthclubChrgS
	 *	@return ip65504P710HelthclubChrgS
	 */
	public short getIp65504P710HelthclubChrgS() throws CFException {
        if (isIp65504P710HelthclubChrgSModified()) { 
           ip65504P710HelthclubChrgS = refreshIp65504P710HelthclubChrgS();
        }
   		return ip65504P710HelthclubChrgS;
	}
	
	/**
	 * 	Update Ip65504P710HelthclubChrgS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P710-HELTHCLUB-CHRG-S
	 *	@param number
	 */
	public void setIp65504P710HelthclubChrgS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P710HelthclubChrgS = checkIp65504P710HelthclubChrgSMaxLimit(number); 
		serializeIp65504P710HelthclubChrgS(ip65504P710HelthclubChrgS);
	}

	public void setIp65504P710HelthclubChrgS(int number) {
	    number = checkIp65504P710HelthclubChrgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P710HelthclubChrgS((short)number);
	}
	public void setIp65504P710HelthclubChrgS(long number) {
	    number = checkIp65504P710HelthclubChrgSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P710HelthclubChrgS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P710HelthclubChrgL
	 *	@return ip65504P710HelthclubChrgL
	 */
	public short getIp65504P710HelthclubChrgL() throws CFException {
        if (isIp65504P710HelthclubChrgLModified()) { 
           ip65504P710HelthclubChrgL = refreshIp65504P710HelthclubChrgL();
        }
   		return ip65504P710HelthclubChrgL;
	}
	
	/**
	 * 	Update Ip65504P710HelthclubChrgL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P710-HELTHCLUB-CHRG-L
	 *	@param number
	 */
	public void setIp65504P710HelthclubChrgL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P710HelthclubChrgL = checkIp65504P710HelthclubChrgLMaxLimit(number); 
		serializeIp65504P710HelthclubChrgL(ip65504P710HelthclubChrgL);
	}

	public void setIp65504P710HelthclubChrgL(int number) {
	    number = checkIp65504P710HelthclubChrgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P710HelthclubChrgL((short)number);
	}
	public void setIp65504P710HelthclubChrgL(long number) {
	    number = checkIp65504P710HelthclubChrgLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P710HelthclubChrgL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P711FireSfactIndS
	 *	@return ip65504P711FireSfactIndS
	 */
	public short getIp65504P711FireSfactIndS() throws CFException {
        if (isIp65504P711FireSfactIndSModified()) { 
           ip65504P711FireSfactIndS = refreshIp65504P711FireSfactIndS();
        }
   		return ip65504P711FireSfactIndS;
	}
	
	/**
	 * 	Update Ip65504P711FireSfactIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P711-FIRE-SFACT-IND-S
	 *	@param number
	 */
	public void setIp65504P711FireSfactIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P711FireSfactIndS = checkIp65504P711FireSfactIndSMaxLimit(number); 
		serializeIp65504P711FireSfactIndS(ip65504P711FireSfactIndS);
	}

	public void setIp65504P711FireSfactIndS(int number) {
	    number = checkIp65504P711FireSfactIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P711FireSfactIndS((short)number);
	}
	public void setIp65504P711FireSfactIndS(long number) {
	    number = checkIp65504P711FireSfactIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P711FireSfactIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P711FireSfactIndL
	 *	@return ip65504P711FireSfactIndL
	 */
	public short getIp65504P711FireSfactIndL() throws CFException {
        if (isIp65504P711FireSfactIndLModified()) { 
           ip65504P711FireSfactIndL = refreshIp65504P711FireSfactIndL();
        }
   		return ip65504P711FireSfactIndL;
	}
	
	/**
	 * 	Update Ip65504P711FireSfactIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P711-FIRE-SFACT-IND-L
	 *	@param number
	 */
	public void setIp65504P711FireSfactIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P711FireSfactIndL = checkIp65504P711FireSfactIndLMaxLimit(number); 
		serializeIp65504P711FireSfactIndL(ip65504P711FireSfactIndL);
	}

	public void setIp65504P711FireSfactIndL(int number) {
	    number = checkIp65504P711FireSfactIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P711FireSfactIndL((short)number);
	}
	public void setIp65504P711FireSfactIndL(long number) {
	    number = checkIp65504P711FireSfactIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P711FireSfactIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P712NetFuelPriceS
	 *	@return ip65504P712NetFuelPriceS
	 */
	public short getIp65504P712NetFuelPriceS() throws CFException {
        if (isIp65504P712NetFuelPriceSModified()) { 
           ip65504P712NetFuelPriceS = refreshIp65504P712NetFuelPriceS();
        }
   		return ip65504P712NetFuelPriceS;
	}
	
	/**
	 * 	Update Ip65504P712NetFuelPriceS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P712-NET-FUEL-PRICE-S
	 *	@param number
	 */
	public void setIp65504P712NetFuelPriceS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P712NetFuelPriceS = checkIp65504P712NetFuelPriceSMaxLimit(number); 
		serializeIp65504P712NetFuelPriceS(ip65504P712NetFuelPriceS);
	}

	public void setIp65504P712NetFuelPriceS(int number) {
	    number = checkIp65504P712NetFuelPriceSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P712NetFuelPriceS((short)number);
	}
	public void setIp65504P712NetFuelPriceS(long number) {
	    number = checkIp65504P712NetFuelPriceSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P712NetFuelPriceS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P712NetFuelPriceL
	 *	@return ip65504P712NetFuelPriceL
	 */
	public short getIp65504P712NetFuelPriceL() throws CFException {
        if (isIp65504P712NetFuelPriceLModified()) { 
           ip65504P712NetFuelPriceL = refreshIp65504P712NetFuelPriceL();
        }
   		return ip65504P712NetFuelPriceL;
	}
	
	/**
	 * 	Update Ip65504P712NetFuelPriceL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P712-NET-FUEL-PRICE-L
	 *	@param number
	 */
	public void setIp65504P712NetFuelPriceL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P712NetFuelPriceL = checkIp65504P712NetFuelPriceLMaxLimit(number); 
		serializeIp65504P712NetFuelPriceL(ip65504P712NetFuelPriceL);
	}

	public void setIp65504P712NetFuelPriceL(int number) {
	    number = checkIp65504P712NetFuelPriceLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P712NetFuelPriceL((short)number);
	}
	public void setIp65504P712NetFuelPriceL(long number) {
	    number = checkIp65504P712NetFuelPriceLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P712NetFuelPriceL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P713RestrctTktindS
	 *	@return ip65504P713RestrctTktindS
	 */
	public short getIp65504P713RestrctTktindS() throws CFException {
        if (isIp65504P713RestrctTktindSModified()) { 
           ip65504P713RestrctTktindS = refreshIp65504P713RestrctTktindS();
        }
   		return ip65504P713RestrctTktindS;
	}
	
	/**
	 * 	Update Ip65504P713RestrctTktindS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P713-RESTRCT-TKTIND-S
	 *	@param number
	 */
	public void setIp65504P713RestrctTktindS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P713RestrctTktindS = checkIp65504P713RestrctTktindSMaxLimit(number); 
		serializeIp65504P713RestrctTktindS(ip65504P713RestrctTktindS);
	}

	public void setIp65504P713RestrctTktindS(int number) {
	    number = checkIp65504P713RestrctTktindSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P713RestrctTktindS((short)number);
	}
	public void setIp65504P713RestrctTktindS(long number) {
	    number = checkIp65504P713RestrctTktindSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P713RestrctTktindS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P713RestrctTktindL
	 *	@return ip65504P713RestrctTktindL
	 */
	public short getIp65504P713RestrctTktindL() throws CFException {
        if (isIp65504P713RestrctTktindLModified()) { 
           ip65504P713RestrctTktindL = refreshIp65504P713RestrctTktindL();
        }
   		return ip65504P713RestrctTktindL;
	}
	
	/**
	 * 	Update Ip65504P713RestrctTktindL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P713-RESTRCT-TKTIND-L
	 *	@param number
	 */
	public void setIp65504P713RestrctTktindL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P713RestrctTktindL = checkIp65504P713RestrctTktindLMaxLimit(number); 
		serializeIp65504P713RestrctTktindL(ip65504P713RestrctTktindL);
	}

	public void setIp65504P713RestrctTktindL(int number) {
	    number = checkIp65504P713RestrctTktindLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P713RestrctTktindL((short)number);
	}
	public void setIp65504P713RestrctTktindL(long number) {
	    number = checkIp65504P713RestrctTktindLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P713RestrctTktindL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup23
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P683TaxAmount4S((short)0);
         	setIp65504P683TaxAmount4L((short)0);
         	setIp65504P684TaxAmount5S((short)0);
         	setIp65504P684TaxAmount5L((short)0);
         	setIp65504P685TypeOfSupplyS((short)0);
         	setIp65504P685TypeOfSupplyL((short)0);
         	setIp65504P686TaxExmptIndS((short)0);
         	setIp65504P686TaxExmptIndL((short)0);
         	setIp65504P687UnqvatInvrfnoS((short)0);
         	setIp65504P687UnqvatInvrfnoL((short)0);
         	setIp65504P688ReservdS((short)0);
         	setIp65504P688ReservdL((short)0);
         	setIp65504P689CorpIdS((short)0);
         	setIp65504P689CorpIdL((short)0);
         	setIp65504P690NoShowIndS((short)0);
         	setIp65504P690NoShowIndL((short)0);
         	setIp65504P691DaysRentedS((short)0);
         	setIp65504P691DaysRentedL((short)0);
         	setIp65504P692WeekRentAmtS((short)0);
         	setIp65504P692WeekRentAmtL((short)0);
         	setIp65504P693TotAuthAmtS((short)0);
         	setIp65504P693TotAuthAmtL((short)0);
         	setIp65504P6941waydropChrgeS((short)0);
         	setIp65504P6941waydropChrgeL((short)0);
         	setIp65504P695RegMileChrgeS((short)0);
         	setIp65504P695RegMileChrgeL((short)0);
         	setIp65504P696ExtMileChrgeS((short)0);
         	setIp65504P696ExtMileChrgeL((short)0);
         	setIp65504P697LateChrgeS((short)0);
         	setIp65504P697LateChrgeL((short)0);
         	setIp65504P698FuelChrgeS((short)0);
         	setIp65504P698FuelChrgeL((short)0);
         	setIp65504P699TotTaxAmtS((short)0);
         	setIp65504P699TotTaxAmtL((short)0);
         	setIp65504P700TowingChrgeS((short)0);
         	setIp65504P700TowingChrgeL((short)0);
         	setIp65504P701ExtraChrgeS((short)0);
         	setIp65504P701ExtraChrgeL((short)0);
         	setIp65504P702OtherChrgeS((short)0);
         	setIp65504P702OtherChrgeL((short)0);
         	setIp65504P703TotRoomNightS((short)0);
         	setIp65504P703TotRoomNightL((short)0);
         	setIp65504P704PrepaidExpnseS((short)0);
         	setIp65504P704PrepaidExpnseL((short)0);
         	setIp65504P705TotroomTaxamtS((short)0);
         	setIp65504P705TotroomTaxamtL((short)0);
         	setIp65504P706CashAdvanceS((short)0);
         	setIp65504P706CashAdvanceL((short)0);
         	setIp65504P707ValetChrgeS((short)0);
         	setIp65504P707ValetChrgeL((short)0);
         	setIp65504P708MovieChrgeS((short)0);
         	setIp65504P708MovieChrgeL((short)0);
         	setIp65504P709BsnsCntrChrgS((short)0);
         	setIp65504P709BsnsCntrChrgL((short)0);
         	setIp65504P710HelthclubChrgS((short)0);
         	setIp65504P710HelthclubChrgL((short)0);
         	setIp65504P711FireSfactIndS((short)0);
         	setIp65504P711FireSfactIndL((short)0);
         	setIp65504P712NetFuelPriceS((short)0);
         	setIp65504P712NetFuelPriceL((short)0);
         	setIp65504P713RestrctTktindS((short)0);
         	setIp65504P713RestrctTktindL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup23FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_23_LENGTH;
		}

}
  
