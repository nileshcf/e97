package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNamesLargeGroup1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504DeNamesLargeGroup1 extends Ip65504DeNamesLargeGroup1Serialized { 
   

								private short ip65504D01BitMapS;

								private short ip65504D01BitMapL;


								private short ip65504D02PanNbrS;

								private short ip65504D02PanNbrL;


								private short ip65504D03ProcCdS;

								private short ip65504D03ProcCdL;


								private short ip65504D04TrxAmtS;

								private short ip65504D04TrxAmtL;


								private short ip65504D05RecAmtS;

								private short ip65504D05RecAmtL;


								private short ip65504D06BilAmtS;

								private short ip65504D06BilAmtL;


								private short ip65504D07DteTimS;

								private short ip65504D07DteTimL;


								private short ip65504D08BilFeeS;

								private short ip65504D08BilFeeL;


								private short ip65504D09RecRteS;

								private short ip65504D09RecRteL;


								private short ip65504D10BilRteS;

								private short ip65504D10BilRteL;


								private short ip65504D11SysTrcS;

								private short ip65504D11SysTrcL;


								private short ip65504D12DteTimS;

								private short ip65504D12DteTimL;


								private short ip65504D13EffDteS;

								private short ip65504D13EffDteL;


								private short ip65504D14ExpDteS;

								private short ip65504D14ExpDteL;


								private short ip65504D15SetDteS;

								private short ip65504D15SetDteL;


								private short ip65504D16CnvDteS;

								private short ip65504D16CnvDteL;


								private short ip65504D17CapDteS;

								private short ip65504D17CapDteL;


								private short ip65504D18MerTypS;

								private short ip65504D18MerTypL;


								private short ip65504D19AcqCcdS;

								private short ip65504D19AcqCcdL;


								private short ip65504D20PanCcdS;

								private short ip65504D20PanCcdL;


								private short ip65504D21FwdCcdS;

								private short ip65504D21FwdCcdL;


								private short ip65504D22PoiDcdS;

								private short ip65504D22PoiDcdL;


								private short ip65504D23CardSqS;

								private short ip65504D23CardSqL;


								private short ip65504D24FuncCdS;

								private short ip65504D24FuncCdL;


								private short ip65504D25MsgReaS;

								private short ip65504D25MsgReaL;


								private short ip65504D26MccCodS;

								private short ip65504D26MccCodL;


								private short ip65504D27AprCodS;

								private short ip65504D27AprCodL;


								private short ip65504D28RecDteL;

								private short ip65504D28RecDteS;


								private short ip65504D29RecIndS;

								private short ip65504D29RecIndL;


								private short ip65504D30OrgAmtS;

								private short ip65504D30OrgAmtL;


								private short ip65504D31AcqRefS;

								private short ip65504D31AcqRefL;

	
	/**
	* Constructor for Ip65504DeNamesLargeGroup1
	**/
    public Ip65504DeNamesLargeGroup1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeNamesLargeGroup1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504D01BitMapS
	 *	@return ip65504D01BitMapS
	 */
	public short getIp65504D01BitMapS() throws CFException {
        if (isIp65504D01BitMapSModified()) { 
           ip65504D01BitMapS = refreshIp65504D01BitMapS();
        }
   		return ip65504D01BitMapS;
	}
	
	/**
	 * 	Update Ip65504D01BitMapS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D01-BIT-MAP-S
	 *	@param number
	 */
	public void setIp65504D01BitMapS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D01BitMapS = checkIp65504D01BitMapSMaxLimit(number); 
		serializeIp65504D01BitMapS(ip65504D01BitMapS);
	}

	public void setIp65504D01BitMapS(int number) {
	    number = checkIp65504D01BitMapSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D01BitMapS((short)number);
	}
	public void setIp65504D01BitMapS(long number) {
	    number = checkIp65504D01BitMapSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D01BitMapS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D01BitMapL
	 *	@return ip65504D01BitMapL
	 */
	public short getIp65504D01BitMapL() throws CFException {
        if (isIp65504D01BitMapLModified()) { 
           ip65504D01BitMapL = refreshIp65504D01BitMapL();
        }
   		return ip65504D01BitMapL;
	}
	
	/**
	 * 	Update Ip65504D01BitMapL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D01-BIT-MAP-L
	 *	@param number
	 */
	public void setIp65504D01BitMapL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D01BitMapL = checkIp65504D01BitMapLMaxLimit(number); 
		serializeIp65504D01BitMapL(ip65504D01BitMapL);
	}

	public void setIp65504D01BitMapL(int number) {
	    number = checkIp65504D01BitMapLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D01BitMapL((short)number);
	}
	public void setIp65504D01BitMapL(long number) {
	    number = checkIp65504D01BitMapLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D01BitMapL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D02PanNbrS
	 *	@return ip65504D02PanNbrS
	 */
	public short getIp65504D02PanNbrS() throws CFException {
        if (isIp65504D02PanNbrSModified()) { 
           ip65504D02PanNbrS = refreshIp65504D02PanNbrS();
        }
   		return ip65504D02PanNbrS;
	}
	
	/**
	 * 	Update Ip65504D02PanNbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D02-PAN-NBR-S
	 *	@param number
	 */
	public void setIp65504D02PanNbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D02PanNbrS = checkIp65504D02PanNbrSMaxLimit(number); 
		serializeIp65504D02PanNbrS(ip65504D02PanNbrS);
	}

	public void setIp65504D02PanNbrS(int number) {
	    number = checkIp65504D02PanNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D02PanNbrS((short)number);
	}
	public void setIp65504D02PanNbrS(long number) {
	    number = checkIp65504D02PanNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D02PanNbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D02PanNbrL
	 *	@return ip65504D02PanNbrL
	 */
	public short getIp65504D02PanNbrL() throws CFException {
        if (isIp65504D02PanNbrLModified()) { 
           ip65504D02PanNbrL = refreshIp65504D02PanNbrL();
        }
   		return ip65504D02PanNbrL;
	}
	
	/**
	 * 	Update Ip65504D02PanNbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D02-PAN-NBR-L
	 *	@param number
	 */
	public void setIp65504D02PanNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D02PanNbrL = checkIp65504D02PanNbrLMaxLimit(number); 
		serializeIp65504D02PanNbrL(ip65504D02PanNbrL);
	}

	public void setIp65504D02PanNbrL(int number) {
	    number = checkIp65504D02PanNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D02PanNbrL((short)number);
	}
	public void setIp65504D02PanNbrL(long number) {
	    number = checkIp65504D02PanNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D02PanNbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D03ProcCdS
	 *	@return ip65504D03ProcCdS
	 */
	public short getIp65504D03ProcCdS() throws CFException {
        if (isIp65504D03ProcCdSModified()) { 
           ip65504D03ProcCdS = refreshIp65504D03ProcCdS();
        }
   		return ip65504D03ProcCdS;
	}
	
	/**
	 * 	Update Ip65504D03ProcCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D03-PROC-CD-S
	 *	@param number
	 */
	public void setIp65504D03ProcCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D03ProcCdS = checkIp65504D03ProcCdSMaxLimit(number); 
		serializeIp65504D03ProcCdS(ip65504D03ProcCdS);
	}

	public void setIp65504D03ProcCdS(int number) {
	    number = checkIp65504D03ProcCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D03ProcCdS((short)number);
	}
	public void setIp65504D03ProcCdS(long number) {
	    number = checkIp65504D03ProcCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D03ProcCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D03ProcCdL
	 *	@return ip65504D03ProcCdL
	 */
	public short getIp65504D03ProcCdL() throws CFException {
        if (isIp65504D03ProcCdLModified()) { 
           ip65504D03ProcCdL = refreshIp65504D03ProcCdL();
        }
   		return ip65504D03ProcCdL;
	}
	
	/**
	 * 	Update Ip65504D03ProcCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D03-PROC-CD-L
	 *	@param number
	 */
	public void setIp65504D03ProcCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D03ProcCdL = checkIp65504D03ProcCdLMaxLimit(number); 
		serializeIp65504D03ProcCdL(ip65504D03ProcCdL);
	}

	public void setIp65504D03ProcCdL(int number) {
	    number = checkIp65504D03ProcCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D03ProcCdL((short)number);
	}
	public void setIp65504D03ProcCdL(long number) {
	    number = checkIp65504D03ProcCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D03ProcCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D04TrxAmtS
	 *	@return ip65504D04TrxAmtS
	 */
	public short getIp65504D04TrxAmtS() throws CFException {
        if (isIp65504D04TrxAmtSModified()) { 
           ip65504D04TrxAmtS = refreshIp65504D04TrxAmtS();
        }
   		return ip65504D04TrxAmtS;
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D04-TRX-AMT-S
	 *	@param number
	 */
	public void setIp65504D04TrxAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D04TrxAmtS = checkIp65504D04TrxAmtSMaxLimit(number); 
		serializeIp65504D04TrxAmtS(ip65504D04TrxAmtS);
	}

	public void setIp65504D04TrxAmtS(int number) {
	    number = checkIp65504D04TrxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D04TrxAmtS((short)number);
	}
	public void setIp65504D04TrxAmtS(long number) {
	    number = checkIp65504D04TrxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D04TrxAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D04TrxAmtL
	 *	@return ip65504D04TrxAmtL
	 */
	public short getIp65504D04TrxAmtL() throws CFException {
        if (isIp65504D04TrxAmtLModified()) { 
           ip65504D04TrxAmtL = refreshIp65504D04TrxAmtL();
        }
   		return ip65504D04TrxAmtL;
	}
	
	/**
	 * 	Update Ip65504D04TrxAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D04-TRX-AMT-L
	 *	@param number
	 */
	public void setIp65504D04TrxAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D04TrxAmtL = checkIp65504D04TrxAmtLMaxLimit(number); 
		serializeIp65504D04TrxAmtL(ip65504D04TrxAmtL);
	}

	public void setIp65504D04TrxAmtL(int number) {
	    number = checkIp65504D04TrxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D04TrxAmtL((short)number);
	}
	public void setIp65504D04TrxAmtL(long number) {
	    number = checkIp65504D04TrxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D04TrxAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D05RecAmtS
	 *	@return ip65504D05RecAmtS
	 */
	public short getIp65504D05RecAmtS() throws CFException {
        if (isIp65504D05RecAmtSModified()) { 
           ip65504D05RecAmtS = refreshIp65504D05RecAmtS();
        }
   		return ip65504D05RecAmtS;
	}
	
	/**
	 * 	Update Ip65504D05RecAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D05-REC-AMT-S
	 *	@param number
	 */
	public void setIp65504D05RecAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D05RecAmtS = checkIp65504D05RecAmtSMaxLimit(number); 
		serializeIp65504D05RecAmtS(ip65504D05RecAmtS);
	}

	public void setIp65504D05RecAmtS(int number) {
	    number = checkIp65504D05RecAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D05RecAmtS((short)number);
	}
	public void setIp65504D05RecAmtS(long number) {
	    number = checkIp65504D05RecAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D05RecAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D05RecAmtL
	 *	@return ip65504D05RecAmtL
	 */
	public short getIp65504D05RecAmtL() throws CFException {
        if (isIp65504D05RecAmtLModified()) { 
           ip65504D05RecAmtL = refreshIp65504D05RecAmtL();
        }
   		return ip65504D05RecAmtL;
	}
	
	/**
	 * 	Update Ip65504D05RecAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D05-REC-AMT-L
	 *	@param number
	 */
	public void setIp65504D05RecAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D05RecAmtL = checkIp65504D05RecAmtLMaxLimit(number); 
		serializeIp65504D05RecAmtL(ip65504D05RecAmtL);
	}

	public void setIp65504D05RecAmtL(int number) {
	    number = checkIp65504D05RecAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D05RecAmtL((short)number);
	}
	public void setIp65504D05RecAmtL(long number) {
	    number = checkIp65504D05RecAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D05RecAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D06BilAmtS
	 *	@return ip65504D06BilAmtS
	 */
	public short getIp65504D06BilAmtS() throws CFException {
        if (isIp65504D06BilAmtSModified()) { 
           ip65504D06BilAmtS = refreshIp65504D06BilAmtS();
        }
   		return ip65504D06BilAmtS;
	}
	
	/**
	 * 	Update Ip65504D06BilAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D06-BIL-AMT-S
	 *	@param number
	 */
	public void setIp65504D06BilAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D06BilAmtS = checkIp65504D06BilAmtSMaxLimit(number); 
		serializeIp65504D06BilAmtS(ip65504D06BilAmtS);
	}

	public void setIp65504D06BilAmtS(int number) {
	    number = checkIp65504D06BilAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D06BilAmtS((short)number);
	}
	public void setIp65504D06BilAmtS(long number) {
	    number = checkIp65504D06BilAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D06BilAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D06BilAmtL
	 *	@return ip65504D06BilAmtL
	 */
	public short getIp65504D06BilAmtL() throws CFException {
        if (isIp65504D06BilAmtLModified()) { 
           ip65504D06BilAmtL = refreshIp65504D06BilAmtL();
        }
   		return ip65504D06BilAmtL;
	}
	
	/**
	 * 	Update Ip65504D06BilAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D06-BIL-AMT-L
	 *	@param number
	 */
	public void setIp65504D06BilAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D06BilAmtL = checkIp65504D06BilAmtLMaxLimit(number); 
		serializeIp65504D06BilAmtL(ip65504D06BilAmtL);
	}

	public void setIp65504D06BilAmtL(int number) {
	    number = checkIp65504D06BilAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D06BilAmtL((short)number);
	}
	public void setIp65504D06BilAmtL(long number) {
	    number = checkIp65504D06BilAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D06BilAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D07DteTimS
	 *	@return ip65504D07DteTimS
	 */
	public short getIp65504D07DteTimS() throws CFException {
        if (isIp65504D07DteTimSModified()) { 
           ip65504D07DteTimS = refreshIp65504D07DteTimS();
        }
   		return ip65504D07DteTimS;
	}
	
	/**
	 * 	Update Ip65504D07DteTimS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D07-DTE-TIM-S
	 *	@param number
	 */
	public void setIp65504D07DteTimS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D07DteTimS = checkIp65504D07DteTimSMaxLimit(number); 
		serializeIp65504D07DteTimS(ip65504D07DteTimS);
	}

	public void setIp65504D07DteTimS(int number) {
	    number = checkIp65504D07DteTimSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D07DteTimS((short)number);
	}
	public void setIp65504D07DteTimS(long number) {
	    number = checkIp65504D07DteTimSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D07DteTimS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D07DteTimL
	 *	@return ip65504D07DteTimL
	 */
	public short getIp65504D07DteTimL() throws CFException {
        if (isIp65504D07DteTimLModified()) { 
           ip65504D07DteTimL = refreshIp65504D07DteTimL();
        }
   		return ip65504D07DteTimL;
	}
	
	/**
	 * 	Update Ip65504D07DteTimL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D07-DTE-TIM-L
	 *	@param number
	 */
	public void setIp65504D07DteTimL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D07DteTimL = checkIp65504D07DteTimLMaxLimit(number); 
		serializeIp65504D07DteTimL(ip65504D07DteTimL);
	}

	public void setIp65504D07DteTimL(int number) {
	    number = checkIp65504D07DteTimLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D07DteTimL((short)number);
	}
	public void setIp65504D07DteTimL(long number) {
	    number = checkIp65504D07DteTimLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D07DteTimL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D08BilFeeS
	 *	@return ip65504D08BilFeeS
	 */
	public short getIp65504D08BilFeeS() throws CFException {
        if (isIp65504D08BilFeeSModified()) { 
           ip65504D08BilFeeS = refreshIp65504D08BilFeeS();
        }
   		return ip65504D08BilFeeS;
	}
	
	/**
	 * 	Update Ip65504D08BilFeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D08-BIL-FEE-S
	 *	@param number
	 */
	public void setIp65504D08BilFeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D08BilFeeS = checkIp65504D08BilFeeSMaxLimit(number); 
		serializeIp65504D08BilFeeS(ip65504D08BilFeeS);
	}

	public void setIp65504D08BilFeeS(int number) {
	    number = checkIp65504D08BilFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D08BilFeeS((short)number);
	}
	public void setIp65504D08BilFeeS(long number) {
	    number = checkIp65504D08BilFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D08BilFeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D08BilFeeL
	 *	@return ip65504D08BilFeeL
	 */
	public short getIp65504D08BilFeeL() throws CFException {
        if (isIp65504D08BilFeeLModified()) { 
           ip65504D08BilFeeL = refreshIp65504D08BilFeeL();
        }
   		return ip65504D08BilFeeL;
	}
	
	/**
	 * 	Update Ip65504D08BilFeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D08-BIL-FEE-L
	 *	@param number
	 */
	public void setIp65504D08BilFeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D08BilFeeL = checkIp65504D08BilFeeLMaxLimit(number); 
		serializeIp65504D08BilFeeL(ip65504D08BilFeeL);
	}

	public void setIp65504D08BilFeeL(int number) {
	    number = checkIp65504D08BilFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D08BilFeeL((short)number);
	}
	public void setIp65504D08BilFeeL(long number) {
	    number = checkIp65504D08BilFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D08BilFeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D09RecRteS
	 *	@return ip65504D09RecRteS
	 */
	public short getIp65504D09RecRteS() throws CFException {
        if (isIp65504D09RecRteSModified()) { 
           ip65504D09RecRteS = refreshIp65504D09RecRteS();
        }
   		return ip65504D09RecRteS;
	}
	
	/**
	 * 	Update Ip65504D09RecRteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D09-REC-RTE-S
	 *	@param number
	 */
	public void setIp65504D09RecRteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D09RecRteS = checkIp65504D09RecRteSMaxLimit(number); 
		serializeIp65504D09RecRteS(ip65504D09RecRteS);
	}

	public void setIp65504D09RecRteS(int number) {
	    number = checkIp65504D09RecRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D09RecRteS((short)number);
	}
	public void setIp65504D09RecRteS(long number) {
	    number = checkIp65504D09RecRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D09RecRteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D09RecRteL
	 *	@return ip65504D09RecRteL
	 */
	public short getIp65504D09RecRteL() throws CFException {
        if (isIp65504D09RecRteLModified()) { 
           ip65504D09RecRteL = refreshIp65504D09RecRteL();
        }
   		return ip65504D09RecRteL;
	}
	
	/**
	 * 	Update Ip65504D09RecRteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D09-REC-RTE-L
	 *	@param number
	 */
	public void setIp65504D09RecRteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D09RecRteL = checkIp65504D09RecRteLMaxLimit(number); 
		serializeIp65504D09RecRteL(ip65504D09RecRteL);
	}

	public void setIp65504D09RecRteL(int number) {
	    number = checkIp65504D09RecRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D09RecRteL((short)number);
	}
	public void setIp65504D09RecRteL(long number) {
	    number = checkIp65504D09RecRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D09RecRteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D10BilRteS
	 *	@return ip65504D10BilRteS
	 */
	public short getIp65504D10BilRteS() throws CFException {
        if (isIp65504D10BilRteSModified()) { 
           ip65504D10BilRteS = refreshIp65504D10BilRteS();
        }
   		return ip65504D10BilRteS;
	}
	
	/**
	 * 	Update Ip65504D10BilRteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D10-BIL-RTE-S
	 *	@param number
	 */
	public void setIp65504D10BilRteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D10BilRteS = checkIp65504D10BilRteSMaxLimit(number); 
		serializeIp65504D10BilRteS(ip65504D10BilRteS);
	}

	public void setIp65504D10BilRteS(int number) {
	    number = checkIp65504D10BilRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D10BilRteS((short)number);
	}
	public void setIp65504D10BilRteS(long number) {
	    number = checkIp65504D10BilRteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D10BilRteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D10BilRteL
	 *	@return ip65504D10BilRteL
	 */
	public short getIp65504D10BilRteL() throws CFException {
        if (isIp65504D10BilRteLModified()) { 
           ip65504D10BilRteL = refreshIp65504D10BilRteL();
        }
   		return ip65504D10BilRteL;
	}
	
	/**
	 * 	Update Ip65504D10BilRteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D10-BIL-RTE-L
	 *	@param number
	 */
	public void setIp65504D10BilRteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D10BilRteL = checkIp65504D10BilRteLMaxLimit(number); 
		serializeIp65504D10BilRteL(ip65504D10BilRteL);
	}

	public void setIp65504D10BilRteL(int number) {
	    number = checkIp65504D10BilRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D10BilRteL((short)number);
	}
	public void setIp65504D10BilRteL(long number) {
	    number = checkIp65504D10BilRteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D10BilRteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D11SysTrcS
	 *	@return ip65504D11SysTrcS
	 */
	public short getIp65504D11SysTrcS() throws CFException {
        if (isIp65504D11SysTrcSModified()) { 
           ip65504D11SysTrcS = refreshIp65504D11SysTrcS();
        }
   		return ip65504D11SysTrcS;
	}
	
	/**
	 * 	Update Ip65504D11SysTrcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D11-SYS-TRC-S
	 *	@param number
	 */
	public void setIp65504D11SysTrcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D11SysTrcS = checkIp65504D11SysTrcSMaxLimit(number); 
		serializeIp65504D11SysTrcS(ip65504D11SysTrcS);
	}

	public void setIp65504D11SysTrcS(int number) {
	    number = checkIp65504D11SysTrcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D11SysTrcS((short)number);
	}
	public void setIp65504D11SysTrcS(long number) {
	    number = checkIp65504D11SysTrcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D11SysTrcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D11SysTrcL
	 *	@return ip65504D11SysTrcL
	 */
	public short getIp65504D11SysTrcL() throws CFException {
        if (isIp65504D11SysTrcLModified()) { 
           ip65504D11SysTrcL = refreshIp65504D11SysTrcL();
        }
   		return ip65504D11SysTrcL;
	}
	
	/**
	 * 	Update Ip65504D11SysTrcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D11-SYS-TRC-L
	 *	@param number
	 */
	public void setIp65504D11SysTrcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D11SysTrcL = checkIp65504D11SysTrcLMaxLimit(number); 
		serializeIp65504D11SysTrcL(ip65504D11SysTrcL);
	}

	public void setIp65504D11SysTrcL(int number) {
	    number = checkIp65504D11SysTrcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D11SysTrcL((short)number);
	}
	public void setIp65504D11SysTrcL(long number) {
	    number = checkIp65504D11SysTrcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D11SysTrcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D12DteTimS
	 *	@return ip65504D12DteTimS
	 */
	public short getIp65504D12DteTimS() throws CFException {
        if (isIp65504D12DteTimSModified()) { 
           ip65504D12DteTimS = refreshIp65504D12DteTimS();
        }
   		return ip65504D12DteTimS;
	}
	
	/**
	 * 	Update Ip65504D12DteTimS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D12-DTE-TIM-S
	 *	@param number
	 */
	public void setIp65504D12DteTimS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D12DteTimS = checkIp65504D12DteTimSMaxLimit(number); 
		serializeIp65504D12DteTimS(ip65504D12DteTimS);
	}

	public void setIp65504D12DteTimS(int number) {
	    number = checkIp65504D12DteTimSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D12DteTimS((short)number);
	}
	public void setIp65504D12DteTimS(long number) {
	    number = checkIp65504D12DteTimSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D12DteTimS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D12DteTimL
	 *	@return ip65504D12DteTimL
	 */
	public short getIp65504D12DteTimL() throws CFException {
        if (isIp65504D12DteTimLModified()) { 
           ip65504D12DteTimL = refreshIp65504D12DteTimL();
        }
   		return ip65504D12DteTimL;
	}
	
	/**
	 * 	Update Ip65504D12DteTimL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D12-DTE-TIM-L
	 *	@param number
	 */
	public void setIp65504D12DteTimL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D12DteTimL = checkIp65504D12DteTimLMaxLimit(number); 
		serializeIp65504D12DteTimL(ip65504D12DteTimL);
	}

	public void setIp65504D12DteTimL(int number) {
	    number = checkIp65504D12DteTimLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D12DteTimL((short)number);
	}
	public void setIp65504D12DteTimL(long number) {
	    number = checkIp65504D12DteTimLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D12DteTimL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D13EffDteS
	 *	@return ip65504D13EffDteS
	 */
	public short getIp65504D13EffDteS() throws CFException {
        if (isIp65504D13EffDteSModified()) { 
           ip65504D13EffDteS = refreshIp65504D13EffDteS();
        }
   		return ip65504D13EffDteS;
	}
	
	/**
	 * 	Update Ip65504D13EffDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D13-EFF-DTE-S
	 *	@param number
	 */
	public void setIp65504D13EffDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D13EffDteS = checkIp65504D13EffDteSMaxLimit(number); 
		serializeIp65504D13EffDteS(ip65504D13EffDteS);
	}

	public void setIp65504D13EffDteS(int number) {
	    number = checkIp65504D13EffDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D13EffDteS((short)number);
	}
	public void setIp65504D13EffDteS(long number) {
	    number = checkIp65504D13EffDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D13EffDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D13EffDteL
	 *	@return ip65504D13EffDteL
	 */
	public short getIp65504D13EffDteL() throws CFException {
        if (isIp65504D13EffDteLModified()) { 
           ip65504D13EffDteL = refreshIp65504D13EffDteL();
        }
   		return ip65504D13EffDteL;
	}
	
	/**
	 * 	Update Ip65504D13EffDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D13-EFF-DTE-L
	 *	@param number
	 */
	public void setIp65504D13EffDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D13EffDteL = checkIp65504D13EffDteLMaxLimit(number); 
		serializeIp65504D13EffDteL(ip65504D13EffDteL);
	}

	public void setIp65504D13EffDteL(int number) {
	    number = checkIp65504D13EffDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D13EffDteL((short)number);
	}
	public void setIp65504D13EffDteL(long number) {
	    number = checkIp65504D13EffDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D13EffDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D14ExpDteS
	 *	@return ip65504D14ExpDteS
	 */
	public short getIp65504D14ExpDteS() throws CFException {
        if (isIp65504D14ExpDteSModified()) { 
           ip65504D14ExpDteS = refreshIp65504D14ExpDteS();
        }
   		return ip65504D14ExpDteS;
	}
	
	/**
	 * 	Update Ip65504D14ExpDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D14-EXP-DTE-S
	 *	@param number
	 */
	public void setIp65504D14ExpDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D14ExpDteS = checkIp65504D14ExpDteSMaxLimit(number); 
		serializeIp65504D14ExpDteS(ip65504D14ExpDteS);
	}

	public void setIp65504D14ExpDteS(int number) {
	    number = checkIp65504D14ExpDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D14ExpDteS((short)number);
	}
	public void setIp65504D14ExpDteS(long number) {
	    number = checkIp65504D14ExpDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D14ExpDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D14ExpDteL
	 *	@return ip65504D14ExpDteL
	 */
	public short getIp65504D14ExpDteL() throws CFException {
        if (isIp65504D14ExpDteLModified()) { 
           ip65504D14ExpDteL = refreshIp65504D14ExpDteL();
        }
   		return ip65504D14ExpDteL;
	}
	
	/**
	 * 	Update Ip65504D14ExpDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D14-EXP-DTE-L
	 *	@param number
	 */
	public void setIp65504D14ExpDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D14ExpDteL = checkIp65504D14ExpDteLMaxLimit(number); 
		serializeIp65504D14ExpDteL(ip65504D14ExpDteL);
	}

	public void setIp65504D14ExpDteL(int number) {
	    number = checkIp65504D14ExpDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D14ExpDteL((short)number);
	}
	public void setIp65504D14ExpDteL(long number) {
	    number = checkIp65504D14ExpDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D14ExpDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D15SetDteS
	 *	@return ip65504D15SetDteS
	 */
	public short getIp65504D15SetDteS() throws CFException {
        if (isIp65504D15SetDteSModified()) { 
           ip65504D15SetDteS = refreshIp65504D15SetDteS();
        }
   		return ip65504D15SetDteS;
	}
	
	/**
	 * 	Update Ip65504D15SetDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D15-SET-DTE-S
	 *	@param number
	 */
	public void setIp65504D15SetDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D15SetDteS = checkIp65504D15SetDteSMaxLimit(number); 
		serializeIp65504D15SetDteS(ip65504D15SetDteS);
	}

	public void setIp65504D15SetDteS(int number) {
	    number = checkIp65504D15SetDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D15SetDteS((short)number);
	}
	public void setIp65504D15SetDteS(long number) {
	    number = checkIp65504D15SetDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D15SetDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D15SetDteL
	 *	@return ip65504D15SetDteL
	 */
	public short getIp65504D15SetDteL() throws CFException {
        if (isIp65504D15SetDteLModified()) { 
           ip65504D15SetDteL = refreshIp65504D15SetDteL();
        }
   		return ip65504D15SetDteL;
	}
	
	/**
	 * 	Update Ip65504D15SetDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D15-SET-DTE-L
	 *	@param number
	 */
	public void setIp65504D15SetDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D15SetDteL = checkIp65504D15SetDteLMaxLimit(number); 
		serializeIp65504D15SetDteL(ip65504D15SetDteL);
	}

	public void setIp65504D15SetDteL(int number) {
	    number = checkIp65504D15SetDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D15SetDteL((short)number);
	}
	public void setIp65504D15SetDteL(long number) {
	    number = checkIp65504D15SetDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D15SetDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D16CnvDteS
	 *	@return ip65504D16CnvDteS
	 */
	public short getIp65504D16CnvDteS() throws CFException {
        if (isIp65504D16CnvDteSModified()) { 
           ip65504D16CnvDteS = refreshIp65504D16CnvDteS();
        }
   		return ip65504D16CnvDteS;
	}
	
	/**
	 * 	Update Ip65504D16CnvDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D16-CNV-DTE-S
	 *	@param number
	 */
	public void setIp65504D16CnvDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D16CnvDteS = checkIp65504D16CnvDteSMaxLimit(number); 
		serializeIp65504D16CnvDteS(ip65504D16CnvDteS);
	}

	public void setIp65504D16CnvDteS(int number) {
	    number = checkIp65504D16CnvDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D16CnvDteS((short)number);
	}
	public void setIp65504D16CnvDteS(long number) {
	    number = checkIp65504D16CnvDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D16CnvDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D16CnvDteL
	 *	@return ip65504D16CnvDteL
	 */
	public short getIp65504D16CnvDteL() throws CFException {
        if (isIp65504D16CnvDteLModified()) { 
           ip65504D16CnvDteL = refreshIp65504D16CnvDteL();
        }
   		return ip65504D16CnvDteL;
	}
	
	/**
	 * 	Update Ip65504D16CnvDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D16-CNV-DTE-L
	 *	@param number
	 */
	public void setIp65504D16CnvDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D16CnvDteL = checkIp65504D16CnvDteLMaxLimit(number); 
		serializeIp65504D16CnvDteL(ip65504D16CnvDteL);
	}

	public void setIp65504D16CnvDteL(int number) {
	    number = checkIp65504D16CnvDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D16CnvDteL((short)number);
	}
	public void setIp65504D16CnvDteL(long number) {
	    number = checkIp65504D16CnvDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D16CnvDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D17CapDteS
	 *	@return ip65504D17CapDteS
	 */
	public short getIp65504D17CapDteS() throws CFException {
        if (isIp65504D17CapDteSModified()) { 
           ip65504D17CapDteS = refreshIp65504D17CapDteS();
        }
   		return ip65504D17CapDteS;
	}
	
	/**
	 * 	Update Ip65504D17CapDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D17-CAP-DTE-S
	 *	@param number
	 */
	public void setIp65504D17CapDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D17CapDteS = checkIp65504D17CapDteSMaxLimit(number); 
		serializeIp65504D17CapDteS(ip65504D17CapDteS);
	}

	public void setIp65504D17CapDteS(int number) {
	    number = checkIp65504D17CapDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D17CapDteS((short)number);
	}
	public void setIp65504D17CapDteS(long number) {
	    number = checkIp65504D17CapDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D17CapDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D17CapDteL
	 *	@return ip65504D17CapDteL
	 */
	public short getIp65504D17CapDteL() throws CFException {
        if (isIp65504D17CapDteLModified()) { 
           ip65504D17CapDteL = refreshIp65504D17CapDteL();
        }
   		return ip65504D17CapDteL;
	}
	
	/**
	 * 	Update Ip65504D17CapDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D17-CAP-DTE-L
	 *	@param number
	 */
	public void setIp65504D17CapDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D17CapDteL = checkIp65504D17CapDteLMaxLimit(number); 
		serializeIp65504D17CapDteL(ip65504D17CapDteL);
	}

	public void setIp65504D17CapDteL(int number) {
	    number = checkIp65504D17CapDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D17CapDteL((short)number);
	}
	public void setIp65504D17CapDteL(long number) {
	    number = checkIp65504D17CapDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D17CapDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D18MerTypS
	 *	@return ip65504D18MerTypS
	 */
	public short getIp65504D18MerTypS() throws CFException {
        if (isIp65504D18MerTypSModified()) { 
           ip65504D18MerTypS = refreshIp65504D18MerTypS();
        }
   		return ip65504D18MerTypS;
	}
	
	/**
	 * 	Update Ip65504D18MerTypS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D18-MER-TYP-S
	 *	@param number
	 */
	public void setIp65504D18MerTypS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D18MerTypS = checkIp65504D18MerTypSMaxLimit(number); 
		serializeIp65504D18MerTypS(ip65504D18MerTypS);
	}

	public void setIp65504D18MerTypS(int number) {
	    number = checkIp65504D18MerTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D18MerTypS((short)number);
	}
	public void setIp65504D18MerTypS(long number) {
	    number = checkIp65504D18MerTypSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D18MerTypS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D18MerTypL
	 *	@return ip65504D18MerTypL
	 */
	public short getIp65504D18MerTypL() throws CFException {
        if (isIp65504D18MerTypLModified()) { 
           ip65504D18MerTypL = refreshIp65504D18MerTypL();
        }
   		return ip65504D18MerTypL;
	}
	
	/**
	 * 	Update Ip65504D18MerTypL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D18-MER-TYP-L
	 *	@param number
	 */
	public void setIp65504D18MerTypL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D18MerTypL = checkIp65504D18MerTypLMaxLimit(number); 
		serializeIp65504D18MerTypL(ip65504D18MerTypL);
	}

	public void setIp65504D18MerTypL(int number) {
	    number = checkIp65504D18MerTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D18MerTypL((short)number);
	}
	public void setIp65504D18MerTypL(long number) {
	    number = checkIp65504D18MerTypLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D18MerTypL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D19AcqCcdS
	 *	@return ip65504D19AcqCcdS
	 */
	public short getIp65504D19AcqCcdS() throws CFException {
        if (isIp65504D19AcqCcdSModified()) { 
           ip65504D19AcqCcdS = refreshIp65504D19AcqCcdS();
        }
   		return ip65504D19AcqCcdS;
	}
	
	/**
	 * 	Update Ip65504D19AcqCcdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D19-ACQ-CCD-S
	 *	@param number
	 */
	public void setIp65504D19AcqCcdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D19AcqCcdS = checkIp65504D19AcqCcdSMaxLimit(number); 
		serializeIp65504D19AcqCcdS(ip65504D19AcqCcdS);
	}

	public void setIp65504D19AcqCcdS(int number) {
	    number = checkIp65504D19AcqCcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D19AcqCcdS((short)number);
	}
	public void setIp65504D19AcqCcdS(long number) {
	    number = checkIp65504D19AcqCcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D19AcqCcdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D19AcqCcdL
	 *	@return ip65504D19AcqCcdL
	 */
	public short getIp65504D19AcqCcdL() throws CFException {
        if (isIp65504D19AcqCcdLModified()) { 
           ip65504D19AcqCcdL = refreshIp65504D19AcqCcdL();
        }
   		return ip65504D19AcqCcdL;
	}
	
	/**
	 * 	Update Ip65504D19AcqCcdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D19-ACQ-CCD-L
	 *	@param number
	 */
	public void setIp65504D19AcqCcdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D19AcqCcdL = checkIp65504D19AcqCcdLMaxLimit(number); 
		serializeIp65504D19AcqCcdL(ip65504D19AcqCcdL);
	}

	public void setIp65504D19AcqCcdL(int number) {
	    number = checkIp65504D19AcqCcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D19AcqCcdL((short)number);
	}
	public void setIp65504D19AcqCcdL(long number) {
	    number = checkIp65504D19AcqCcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D19AcqCcdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D20PanCcdS
	 *	@return ip65504D20PanCcdS
	 */
	public short getIp65504D20PanCcdS() throws CFException {
        if (isIp65504D20PanCcdSModified()) { 
           ip65504D20PanCcdS = refreshIp65504D20PanCcdS();
        }
   		return ip65504D20PanCcdS;
	}
	
	/**
	 * 	Update Ip65504D20PanCcdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D20-PAN-CCD-S
	 *	@param number
	 */
	public void setIp65504D20PanCcdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D20PanCcdS = checkIp65504D20PanCcdSMaxLimit(number); 
		serializeIp65504D20PanCcdS(ip65504D20PanCcdS);
	}

	public void setIp65504D20PanCcdS(int number) {
	    number = checkIp65504D20PanCcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D20PanCcdS((short)number);
	}
	public void setIp65504D20PanCcdS(long number) {
	    number = checkIp65504D20PanCcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D20PanCcdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D20PanCcdL
	 *	@return ip65504D20PanCcdL
	 */
	public short getIp65504D20PanCcdL() throws CFException {
        if (isIp65504D20PanCcdLModified()) { 
           ip65504D20PanCcdL = refreshIp65504D20PanCcdL();
        }
   		return ip65504D20PanCcdL;
	}
	
	/**
	 * 	Update Ip65504D20PanCcdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D20-PAN-CCD-L
	 *	@param number
	 */
	public void setIp65504D20PanCcdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D20PanCcdL = checkIp65504D20PanCcdLMaxLimit(number); 
		serializeIp65504D20PanCcdL(ip65504D20PanCcdL);
	}

	public void setIp65504D20PanCcdL(int number) {
	    number = checkIp65504D20PanCcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D20PanCcdL((short)number);
	}
	public void setIp65504D20PanCcdL(long number) {
	    number = checkIp65504D20PanCcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D20PanCcdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D21FwdCcdS
	 *	@return ip65504D21FwdCcdS
	 */
	public short getIp65504D21FwdCcdS() throws CFException {
        if (isIp65504D21FwdCcdSModified()) { 
           ip65504D21FwdCcdS = refreshIp65504D21FwdCcdS();
        }
   		return ip65504D21FwdCcdS;
	}
	
	/**
	 * 	Update Ip65504D21FwdCcdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D21-FWD-CCD-S
	 *	@param number
	 */
	public void setIp65504D21FwdCcdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D21FwdCcdS = checkIp65504D21FwdCcdSMaxLimit(number); 
		serializeIp65504D21FwdCcdS(ip65504D21FwdCcdS);
	}

	public void setIp65504D21FwdCcdS(int number) {
	    number = checkIp65504D21FwdCcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D21FwdCcdS((short)number);
	}
	public void setIp65504D21FwdCcdS(long number) {
	    number = checkIp65504D21FwdCcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D21FwdCcdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D21FwdCcdL
	 *	@return ip65504D21FwdCcdL
	 */
	public short getIp65504D21FwdCcdL() throws CFException {
        if (isIp65504D21FwdCcdLModified()) { 
           ip65504D21FwdCcdL = refreshIp65504D21FwdCcdL();
        }
   		return ip65504D21FwdCcdL;
	}
	
	/**
	 * 	Update Ip65504D21FwdCcdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D21-FWD-CCD-L
	 *	@param number
	 */
	public void setIp65504D21FwdCcdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D21FwdCcdL = checkIp65504D21FwdCcdLMaxLimit(number); 
		serializeIp65504D21FwdCcdL(ip65504D21FwdCcdL);
	}

	public void setIp65504D21FwdCcdL(int number) {
	    number = checkIp65504D21FwdCcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D21FwdCcdL((short)number);
	}
	public void setIp65504D21FwdCcdL(long number) {
	    number = checkIp65504D21FwdCcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D21FwdCcdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D22PoiDcdS
	 *	@return ip65504D22PoiDcdS
	 */
	public short getIp65504D22PoiDcdS() throws CFException {
        if (isIp65504D22PoiDcdSModified()) { 
           ip65504D22PoiDcdS = refreshIp65504D22PoiDcdS();
        }
   		return ip65504D22PoiDcdS;
	}
	
	/**
	 * 	Update Ip65504D22PoiDcdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D22-POI-DCD-S
	 *	@param number
	 */
	public void setIp65504D22PoiDcdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D22PoiDcdS = checkIp65504D22PoiDcdSMaxLimit(number); 
		serializeIp65504D22PoiDcdS(ip65504D22PoiDcdS);
	}

	public void setIp65504D22PoiDcdS(int number) {
	    number = checkIp65504D22PoiDcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D22PoiDcdS((short)number);
	}
	public void setIp65504D22PoiDcdS(long number) {
	    number = checkIp65504D22PoiDcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D22PoiDcdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D22PoiDcdL
	 *	@return ip65504D22PoiDcdL
	 */
	public short getIp65504D22PoiDcdL() throws CFException {
        if (isIp65504D22PoiDcdLModified()) { 
           ip65504D22PoiDcdL = refreshIp65504D22PoiDcdL();
        }
   		return ip65504D22PoiDcdL;
	}
	
	/**
	 * 	Update Ip65504D22PoiDcdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D22-POI-DCD-L
	 *	@param number
	 */
	public void setIp65504D22PoiDcdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D22PoiDcdL = checkIp65504D22PoiDcdLMaxLimit(number); 
		serializeIp65504D22PoiDcdL(ip65504D22PoiDcdL);
	}

	public void setIp65504D22PoiDcdL(int number) {
	    number = checkIp65504D22PoiDcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D22PoiDcdL((short)number);
	}
	public void setIp65504D22PoiDcdL(long number) {
	    number = checkIp65504D22PoiDcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D22PoiDcdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D23CardSqS
	 *	@return ip65504D23CardSqS
	 */
	public short getIp65504D23CardSqS() throws CFException {
        if (isIp65504D23CardSqSModified()) { 
           ip65504D23CardSqS = refreshIp65504D23CardSqS();
        }
   		return ip65504D23CardSqS;
	}
	
	/**
	 * 	Update Ip65504D23CardSqS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D23-CARD-SQ-S
	 *	@param number
	 */
	public void setIp65504D23CardSqS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D23CardSqS = checkIp65504D23CardSqSMaxLimit(number); 
		serializeIp65504D23CardSqS(ip65504D23CardSqS);
	}

	public void setIp65504D23CardSqS(int number) {
	    number = checkIp65504D23CardSqSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D23CardSqS((short)number);
	}
	public void setIp65504D23CardSqS(long number) {
	    number = checkIp65504D23CardSqSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D23CardSqS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D23CardSqL
	 *	@return ip65504D23CardSqL
	 */
	public short getIp65504D23CardSqL() throws CFException {
        if (isIp65504D23CardSqLModified()) { 
           ip65504D23CardSqL = refreshIp65504D23CardSqL();
        }
   		return ip65504D23CardSqL;
	}
	
	/**
	 * 	Update Ip65504D23CardSqL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D23-CARD-SQ-L
	 *	@param number
	 */
	public void setIp65504D23CardSqL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D23CardSqL = checkIp65504D23CardSqLMaxLimit(number); 
		serializeIp65504D23CardSqL(ip65504D23CardSqL);
	}

	public void setIp65504D23CardSqL(int number) {
	    number = checkIp65504D23CardSqLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D23CardSqL((short)number);
	}
	public void setIp65504D23CardSqL(long number) {
	    number = checkIp65504D23CardSqLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D23CardSqL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D24FuncCdS
	 *	@return ip65504D24FuncCdS
	 */
	public short getIp65504D24FuncCdS() throws CFException {
        if (isIp65504D24FuncCdSModified()) { 
           ip65504D24FuncCdS = refreshIp65504D24FuncCdS();
        }
   		return ip65504D24FuncCdS;
	}
	
	/**
	 * 	Update Ip65504D24FuncCdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D24-FUNC-CD-S
	 *	@param number
	 */
	public void setIp65504D24FuncCdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D24FuncCdS = checkIp65504D24FuncCdSMaxLimit(number); 
		serializeIp65504D24FuncCdS(ip65504D24FuncCdS);
	}

	public void setIp65504D24FuncCdS(int number) {
	    number = checkIp65504D24FuncCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D24FuncCdS((short)number);
	}
	public void setIp65504D24FuncCdS(long number) {
	    number = checkIp65504D24FuncCdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D24FuncCdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D24FuncCdL
	 *	@return ip65504D24FuncCdL
	 */
	public short getIp65504D24FuncCdL() throws CFException {
        if (isIp65504D24FuncCdLModified()) { 
           ip65504D24FuncCdL = refreshIp65504D24FuncCdL();
        }
   		return ip65504D24FuncCdL;
	}
	
	/**
	 * 	Update Ip65504D24FuncCdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D24-FUNC-CD-L
	 *	@param number
	 */
	public void setIp65504D24FuncCdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D24FuncCdL = checkIp65504D24FuncCdLMaxLimit(number); 
		serializeIp65504D24FuncCdL(ip65504D24FuncCdL);
	}

	public void setIp65504D24FuncCdL(int number) {
	    number = checkIp65504D24FuncCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D24FuncCdL((short)number);
	}
	public void setIp65504D24FuncCdL(long number) {
	    number = checkIp65504D24FuncCdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D24FuncCdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D25MsgReaS
	 *	@return ip65504D25MsgReaS
	 */
	public short getIp65504D25MsgReaS() throws CFException {
        if (isIp65504D25MsgReaSModified()) { 
           ip65504D25MsgReaS = refreshIp65504D25MsgReaS();
        }
   		return ip65504D25MsgReaS;
	}
	
	/**
	 * 	Update Ip65504D25MsgReaS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D25-MSG-REA-S
	 *	@param number
	 */
	public void setIp65504D25MsgReaS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D25MsgReaS = checkIp65504D25MsgReaSMaxLimit(number); 
		serializeIp65504D25MsgReaS(ip65504D25MsgReaS);
	}

	public void setIp65504D25MsgReaS(int number) {
	    number = checkIp65504D25MsgReaSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D25MsgReaS((short)number);
	}
	public void setIp65504D25MsgReaS(long number) {
	    number = checkIp65504D25MsgReaSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D25MsgReaS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D25MsgReaL
	 *	@return ip65504D25MsgReaL
	 */
	public short getIp65504D25MsgReaL() throws CFException {
        if (isIp65504D25MsgReaLModified()) { 
           ip65504D25MsgReaL = refreshIp65504D25MsgReaL();
        }
   		return ip65504D25MsgReaL;
	}
	
	/**
	 * 	Update Ip65504D25MsgReaL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D25-MSG-REA-L
	 *	@param number
	 */
	public void setIp65504D25MsgReaL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D25MsgReaL = checkIp65504D25MsgReaLMaxLimit(number); 
		serializeIp65504D25MsgReaL(ip65504D25MsgReaL);
	}

	public void setIp65504D25MsgReaL(int number) {
	    number = checkIp65504D25MsgReaLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D25MsgReaL((short)number);
	}
	public void setIp65504D25MsgReaL(long number) {
	    number = checkIp65504D25MsgReaLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D25MsgReaL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D26MccCodS
	 *	@return ip65504D26MccCodS
	 */
	public short getIp65504D26MccCodS() throws CFException {
        if (isIp65504D26MccCodSModified()) { 
           ip65504D26MccCodS = refreshIp65504D26MccCodS();
        }
   		return ip65504D26MccCodS;
	}
	
	/**
	 * 	Update Ip65504D26MccCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D26-MCC-COD-S
	 *	@param number
	 */
	public void setIp65504D26MccCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D26MccCodS = checkIp65504D26MccCodSMaxLimit(number); 
		serializeIp65504D26MccCodS(ip65504D26MccCodS);
	}

	public void setIp65504D26MccCodS(int number) {
	    number = checkIp65504D26MccCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D26MccCodS((short)number);
	}
	public void setIp65504D26MccCodS(long number) {
	    number = checkIp65504D26MccCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D26MccCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D26MccCodL
	 *	@return ip65504D26MccCodL
	 */
	public short getIp65504D26MccCodL() throws CFException {
        if (isIp65504D26MccCodLModified()) { 
           ip65504D26MccCodL = refreshIp65504D26MccCodL();
        }
   		return ip65504D26MccCodL;
	}
	
	/**
	 * 	Update Ip65504D26MccCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D26-MCC-COD-L
	 *	@param number
	 */
	public void setIp65504D26MccCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D26MccCodL = checkIp65504D26MccCodLMaxLimit(number); 
		serializeIp65504D26MccCodL(ip65504D26MccCodL);
	}

	public void setIp65504D26MccCodL(int number) {
	    number = checkIp65504D26MccCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D26MccCodL((short)number);
	}
	public void setIp65504D26MccCodL(long number) {
	    number = checkIp65504D26MccCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D26MccCodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D27AprCodS
	 *	@return ip65504D27AprCodS
	 */
	public short getIp65504D27AprCodS() throws CFException {
        if (isIp65504D27AprCodSModified()) { 
           ip65504D27AprCodS = refreshIp65504D27AprCodS();
        }
   		return ip65504D27AprCodS;
	}
	
	/**
	 * 	Update Ip65504D27AprCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D27-APR-COD-S
	 *	@param number
	 */
	public void setIp65504D27AprCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D27AprCodS = checkIp65504D27AprCodSMaxLimit(number); 
		serializeIp65504D27AprCodS(ip65504D27AprCodS);
	}

	public void setIp65504D27AprCodS(int number) {
	    number = checkIp65504D27AprCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D27AprCodS((short)number);
	}
	public void setIp65504D27AprCodS(long number) {
	    number = checkIp65504D27AprCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D27AprCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D27AprCodL
	 *	@return ip65504D27AprCodL
	 */
	public short getIp65504D27AprCodL() throws CFException {
        if (isIp65504D27AprCodLModified()) { 
           ip65504D27AprCodL = refreshIp65504D27AprCodL();
        }
   		return ip65504D27AprCodL;
	}
	
	/**
	 * 	Update Ip65504D27AprCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D27-APR-COD-L
	 *	@param number
	 */
	public void setIp65504D27AprCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D27AprCodL = checkIp65504D27AprCodLMaxLimit(number); 
		serializeIp65504D27AprCodL(ip65504D27AprCodL);
	}

	public void setIp65504D27AprCodL(int number) {
	    number = checkIp65504D27AprCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D27AprCodL((short)number);
	}
	public void setIp65504D27AprCodL(long number) {
	    number = checkIp65504D27AprCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D27AprCodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D28RecDteL
	 *	@return ip65504D28RecDteL
	 */
	public short getIp65504D28RecDteL() throws CFException {
        if (isIp65504D28RecDteLModified()) { 
           ip65504D28RecDteL = refreshIp65504D28RecDteL();
        }
   		return ip65504D28RecDteL;
	}
	
	/**
	 * 	Update Ip65504D28RecDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D28-REC-DTE-L
	 *	@param number
	 */
	public void setIp65504D28RecDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D28RecDteL = checkIp65504D28RecDteLMaxLimit(number); 
		serializeIp65504D28RecDteL(ip65504D28RecDteL);
	}

	public void setIp65504D28RecDteL(int number) {
	    number = checkIp65504D28RecDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D28RecDteL((short)number);
	}
	public void setIp65504D28RecDteL(long number) {
	    number = checkIp65504D28RecDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D28RecDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D28RecDteS
	 *	@return ip65504D28RecDteS
	 */
	public short getIp65504D28RecDteS() throws CFException {
        if (isIp65504D28RecDteSModified()) { 
           ip65504D28RecDteS = refreshIp65504D28RecDteS();
        }
   		return ip65504D28RecDteS;
	}
	
	/**
	 * 	Update Ip65504D28RecDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D28-REC-DTE-S
	 *	@param number
	 */
	public void setIp65504D28RecDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D28RecDteS = checkIp65504D28RecDteSMaxLimit(number); 
		serializeIp65504D28RecDteS(ip65504D28RecDteS);
	}

	public void setIp65504D28RecDteS(int number) {
	    number = checkIp65504D28RecDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D28RecDteS((short)number);
	}
	public void setIp65504D28RecDteS(long number) {
	    number = checkIp65504D28RecDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D28RecDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D29RecIndS
	 *	@return ip65504D29RecIndS
	 */
	public short getIp65504D29RecIndS() throws CFException {
        if (isIp65504D29RecIndSModified()) { 
           ip65504D29RecIndS = refreshIp65504D29RecIndS();
        }
   		return ip65504D29RecIndS;
	}
	
	/**
	 * 	Update Ip65504D29RecIndS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D29-REC-IND-S
	 *	@param number
	 */
	public void setIp65504D29RecIndS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D29RecIndS = checkIp65504D29RecIndSMaxLimit(number); 
		serializeIp65504D29RecIndS(ip65504D29RecIndS);
	}

	public void setIp65504D29RecIndS(int number) {
	    number = checkIp65504D29RecIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D29RecIndS((short)number);
	}
	public void setIp65504D29RecIndS(long number) {
	    number = checkIp65504D29RecIndSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D29RecIndS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D29RecIndL
	 *	@return ip65504D29RecIndL
	 */
	public short getIp65504D29RecIndL() throws CFException {
        if (isIp65504D29RecIndLModified()) { 
           ip65504D29RecIndL = refreshIp65504D29RecIndL();
        }
   		return ip65504D29RecIndL;
	}
	
	/**
	 * 	Update Ip65504D29RecIndL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D29-REC-IND-L
	 *	@param number
	 */
	public void setIp65504D29RecIndL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D29RecIndL = checkIp65504D29RecIndLMaxLimit(number); 
		serializeIp65504D29RecIndL(ip65504D29RecIndL);
	}

	public void setIp65504D29RecIndL(int number) {
	    number = checkIp65504D29RecIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D29RecIndL((short)number);
	}
	public void setIp65504D29RecIndL(long number) {
	    number = checkIp65504D29RecIndLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D29RecIndL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D30OrgAmtS
	 *	@return ip65504D30OrgAmtS
	 */
	public short getIp65504D30OrgAmtS() throws CFException {
        if (isIp65504D30OrgAmtSModified()) { 
           ip65504D30OrgAmtS = refreshIp65504D30OrgAmtS();
        }
   		return ip65504D30OrgAmtS;
	}
	
	/**
	 * 	Update Ip65504D30OrgAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D30-ORG-AMT-S
	 *	@param number
	 */
	public void setIp65504D30OrgAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D30OrgAmtS = checkIp65504D30OrgAmtSMaxLimit(number); 
		serializeIp65504D30OrgAmtS(ip65504D30OrgAmtS);
	}

	public void setIp65504D30OrgAmtS(int number) {
	    number = checkIp65504D30OrgAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D30OrgAmtS((short)number);
	}
	public void setIp65504D30OrgAmtS(long number) {
	    number = checkIp65504D30OrgAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D30OrgAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D30OrgAmtL
	 *	@return ip65504D30OrgAmtL
	 */
	public short getIp65504D30OrgAmtL() throws CFException {
        if (isIp65504D30OrgAmtLModified()) { 
           ip65504D30OrgAmtL = refreshIp65504D30OrgAmtL();
        }
   		return ip65504D30OrgAmtL;
	}
	
	/**
	 * 	Update Ip65504D30OrgAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D30-ORG-AMT-L
	 *	@param number
	 */
	public void setIp65504D30OrgAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D30OrgAmtL = checkIp65504D30OrgAmtLMaxLimit(number); 
		serializeIp65504D30OrgAmtL(ip65504D30OrgAmtL);
	}

	public void setIp65504D30OrgAmtL(int number) {
	    number = checkIp65504D30OrgAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D30OrgAmtL((short)number);
	}
	public void setIp65504D30OrgAmtL(long number) {
	    number = checkIp65504D30OrgAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D30OrgAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D31AcqRefS
	 *	@return ip65504D31AcqRefS
	 */
	public short getIp65504D31AcqRefS() throws CFException {
        if (isIp65504D31AcqRefSModified()) { 
           ip65504D31AcqRefS = refreshIp65504D31AcqRefS();
        }
   		return ip65504D31AcqRefS;
	}
	
	/**
	 * 	Update Ip65504D31AcqRefS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D31-ACQ-REF-S
	 *	@param number
	 */
	public void setIp65504D31AcqRefS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D31AcqRefS = checkIp65504D31AcqRefSMaxLimit(number); 
		serializeIp65504D31AcqRefS(ip65504D31AcqRefS);
	}

	public void setIp65504D31AcqRefS(int number) {
	    number = checkIp65504D31AcqRefSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D31AcqRefS((short)number);
	}
	public void setIp65504D31AcqRefS(long number) {
	    number = checkIp65504D31AcqRefSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D31AcqRefS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D31AcqRefL
	 *	@return ip65504D31AcqRefL
	 */
	public short getIp65504D31AcqRefL() throws CFException {
        if (isIp65504D31AcqRefLModified()) { 
           ip65504D31AcqRefL = refreshIp65504D31AcqRefL();
        }
   		return ip65504D31AcqRefL;
	}
	
	/**
	 * 	Update Ip65504D31AcqRefL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D31-ACQ-REF-L
	 *	@param number
	 */
	public void setIp65504D31AcqRefL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D31AcqRefL = checkIp65504D31AcqRefLMaxLimit(number); 
		serializeIp65504D31AcqRefL(ip65504D31AcqRefL);
	}

	public void setIp65504D31AcqRefL(int number) {
	    number = checkIp65504D31AcqRefLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D31AcqRefL((short)number);
	}
	public void setIp65504D31AcqRefL(long number) {
	    number = checkIp65504D31AcqRefLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D31AcqRefL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504DeNamesLargeGroup1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504D01BitMapS((short)0);
         	setIp65504D01BitMapL((short)0);
         	setIp65504D02PanNbrS((short)0);
         	setIp65504D02PanNbrL((short)0);
         	setIp65504D03ProcCdS((short)0);
         	setIp65504D03ProcCdL((short)0);
         	setIp65504D04TrxAmtS((short)0);
         	setIp65504D04TrxAmtL((short)0);
         	setIp65504D05RecAmtS((short)0);
         	setIp65504D05RecAmtL((short)0);
         	setIp65504D06BilAmtS((short)0);
         	setIp65504D06BilAmtL((short)0);
         	setIp65504D07DteTimS((short)0);
         	setIp65504D07DteTimL((short)0);
         	setIp65504D08BilFeeS((short)0);
         	setIp65504D08BilFeeL((short)0);
         	setIp65504D09RecRteS((short)0);
         	setIp65504D09RecRteL((short)0);
         	setIp65504D10BilRteS((short)0);
         	setIp65504D10BilRteL((short)0);
         	setIp65504D11SysTrcS((short)0);
         	setIp65504D11SysTrcL((short)0);
         	setIp65504D12DteTimS((short)0);
         	setIp65504D12DteTimL((short)0);
         	setIp65504D13EffDteS((short)0);
         	setIp65504D13EffDteL((short)0);
         	setIp65504D14ExpDteS((short)0);
         	setIp65504D14ExpDteL((short)0);
         	setIp65504D15SetDteS((short)0);
         	setIp65504D15SetDteL((short)0);
         	setIp65504D16CnvDteS((short)0);
         	setIp65504D16CnvDteL((short)0);
         	setIp65504D17CapDteS((short)0);
         	setIp65504D17CapDteL((short)0);
         	setIp65504D18MerTypS((short)0);
         	setIp65504D18MerTypL((short)0);
         	setIp65504D19AcqCcdS((short)0);
         	setIp65504D19AcqCcdL((short)0);
         	setIp65504D20PanCcdS((short)0);
         	setIp65504D20PanCcdL((short)0);
         	setIp65504D21FwdCcdS((short)0);
         	setIp65504D21FwdCcdL((short)0);
         	setIp65504D22PoiDcdS((short)0);
         	setIp65504D22PoiDcdL((short)0);
         	setIp65504D23CardSqS((short)0);
         	setIp65504D23CardSqL((short)0);
         	setIp65504D24FuncCdS((short)0);
         	setIp65504D24FuncCdL((short)0);
         	setIp65504D25MsgReaS((short)0);
         	setIp65504D25MsgReaL((short)0);
         	setIp65504D26MccCodS((short)0);
         	setIp65504D26MccCodL((short)0);
         	setIp65504D27AprCodS((short)0);
         	setIp65504D27AprCodL((short)0);
         	setIp65504D28RecDteL((short)0);
         	setIp65504D28RecDteS((short)0);
         	setIp65504D29RecIndS((short)0);
         	setIp65504D29RecIndL((short)0);
         	setIp65504D30OrgAmtS((short)0);
         	setIp65504D30OrgAmtL((short)0);
         	setIp65504D31AcqRefS((short)0);
         	setIp65504D31AcqRefL((short)0);
   }

		public static int getIp65504DeNamesLargeGroup1FieldLength() {
			return IP_65504_DE_NAMES_LARGE_GROUP_1_LENGTH;
		}

}
  
