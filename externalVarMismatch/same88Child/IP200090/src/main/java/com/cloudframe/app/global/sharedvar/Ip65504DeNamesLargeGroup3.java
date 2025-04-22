package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNamesLargeGroup3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504DeNamesLargeGroup3 extends Ip65504DeNamesLargeGroup3Serialized { 
   

								private short ip65504D63TrxCycS;

								private short ip65504D63TrxCycL;


								private short ip65504D64MacCodS;

								private short ip65504D64MacCodL;


								private short ip65504D65ReservdS;

								private short ip65504D65ReservdL;


								private short ip65504D66AmtFeeS;

								private short ip65504D66AmtFeeL;


								private short ip65504D67ExtPayS;

								private short ip65504D67ExtPayL;


								private short ip65504D68RecvCcS;

								private short ip65504D68RecvCcL;


								private short ip65504D69SetlCcS;

								private short ip65504D69SetlCcL;


								private short ip65504D70AuthCcS;

								private short ip65504D70AuthCcL;


								private short ip65504D71MsgNbrS;

								private short ip65504D71MsgNbrL;


								private short ip65504D72DataRdS;

								private short ip65504D72DataRdL;


								private short ip65504D73ActDteS;

								private short ip65504D73ActDteL;


								private short ip65504D74CrNmbrS;

								private short ip65504D74CrNmbrL;


								private short ip65504D75CrRevnS;

								private short ip65504D75CrRevnL;


								private short ip65504D76DbNmbrS;

								private short ip65504D76DbNmbrL;


								private short ip65504D77DbRevnS;

								private short ip65504D77DbRevnL;


								private short ip65504D78TferNoS;

								private short ip65504D78TferNoL;


								private short ip65504D79TferRvS;

								private short ip65504D79TferRcL;


								private short ip65504D80InqNbrS;

								private short ip65504D80InqNbrL;


								private short ip65504D81AuthNoS;

								private short ip65504D81AuthNoL;


								private short ip65504D82InqRevS;

								private short ip65504D82InqRevL;


								private short ip65504D83PymtNoS;

								private short ip65504D83PymtNoL;


								private short ip65504D84PymtRvS;

								private short ip65504D84PymtRvL;


								private short ip65504D85FeeColS;

								private short ip65504D85FeeColL;


								private short ip65504D86CrAmtsS;

								private short ip65504D86CrAmtsL;


								private short ip65504D87CrRevrS;

								private short ip65504D87CrRevrL;


								private short ip65504D88DbAmtsS;

								private short ip65504D88DbAmtsL;


								private short ip65504D89DbRevrS;

								private short ip65504D89DbRevrL;


								private short ip65504D90AuthRvS;

								private short ip65504D90AuthRvL;


								private short ip65504D91TrxDccS;

								private short ip65504D91TrxDccL;


								private short ip65504D92TrxOccS;

								private short ip65504D92TrxOccL;


								private short ip65504D93TrxDidS;

								private short ip65504D93TrxDidL;

	
	/**
	* Constructor for Ip65504DeNamesLargeGroup3
	**/
    public Ip65504DeNamesLargeGroup3() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeNamesLargeGroup3. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup3(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504D63TrxCycS
	 *	@return ip65504D63TrxCycS
	 */
	public short getIp65504D63TrxCycS() throws CFException {
        if (isIp65504D63TrxCycSModified()) { 
           ip65504D63TrxCycS = refreshIp65504D63TrxCycS();
        }
   		return ip65504D63TrxCycS;
	}
	
	/**
	 * 	Update Ip65504D63TrxCycS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D63-TRX-CYC-S
	 *	@param number
	 */
	public void setIp65504D63TrxCycS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D63TrxCycS = checkIp65504D63TrxCycSMaxLimit(number); 
		serializeIp65504D63TrxCycS(ip65504D63TrxCycS);
	}

	public void setIp65504D63TrxCycS(int number) {
	    number = checkIp65504D63TrxCycSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D63TrxCycS((short)number);
	}
	public void setIp65504D63TrxCycS(long number) {
	    number = checkIp65504D63TrxCycSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D63TrxCycS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D63TrxCycL
	 *	@return ip65504D63TrxCycL
	 */
	public short getIp65504D63TrxCycL() throws CFException {
        if (isIp65504D63TrxCycLModified()) { 
           ip65504D63TrxCycL = refreshIp65504D63TrxCycL();
        }
   		return ip65504D63TrxCycL;
	}
	
	/**
	 * 	Update Ip65504D63TrxCycL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D63-TRX-CYC-L
	 *	@param number
	 */
	public void setIp65504D63TrxCycL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D63TrxCycL = checkIp65504D63TrxCycLMaxLimit(number); 
		serializeIp65504D63TrxCycL(ip65504D63TrxCycL);
	}

	public void setIp65504D63TrxCycL(int number) {
	    number = checkIp65504D63TrxCycLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D63TrxCycL((short)number);
	}
	public void setIp65504D63TrxCycL(long number) {
	    number = checkIp65504D63TrxCycLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D63TrxCycL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D64MacCodS
	 *	@return ip65504D64MacCodS
	 */
	public short getIp65504D64MacCodS() throws CFException {
        if (isIp65504D64MacCodSModified()) { 
           ip65504D64MacCodS = refreshIp65504D64MacCodS();
        }
   		return ip65504D64MacCodS;
	}
	
	/**
	 * 	Update Ip65504D64MacCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D64-MAC-COD-S
	 *	@param number
	 */
	public void setIp65504D64MacCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D64MacCodS = checkIp65504D64MacCodSMaxLimit(number); 
		serializeIp65504D64MacCodS(ip65504D64MacCodS);
	}

	public void setIp65504D64MacCodS(int number) {
	    number = checkIp65504D64MacCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D64MacCodS((short)number);
	}
	public void setIp65504D64MacCodS(long number) {
	    number = checkIp65504D64MacCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D64MacCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D64MacCodL
	 *	@return ip65504D64MacCodL
	 */
	public short getIp65504D64MacCodL() throws CFException {
        if (isIp65504D64MacCodLModified()) { 
           ip65504D64MacCodL = refreshIp65504D64MacCodL();
        }
   		return ip65504D64MacCodL;
	}
	
	/**
	 * 	Update Ip65504D64MacCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D64-MAC-COD-L
	 *	@param number
	 */
	public void setIp65504D64MacCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D64MacCodL = checkIp65504D64MacCodLMaxLimit(number); 
		serializeIp65504D64MacCodL(ip65504D64MacCodL);
	}

	public void setIp65504D64MacCodL(int number) {
	    number = checkIp65504D64MacCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D64MacCodL((short)number);
	}
	public void setIp65504D64MacCodL(long number) {
	    number = checkIp65504D64MacCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D64MacCodL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D65ReservdS
	 *	@return ip65504D65ReservdS
	 */
	public short getIp65504D65ReservdS() throws CFException {
        if (isIp65504D65ReservdSModified()) { 
           ip65504D65ReservdS = refreshIp65504D65ReservdS();
        }
   		return ip65504D65ReservdS;
	}
	
	/**
	 * 	Update Ip65504D65ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D65-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D65ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D65ReservdS = checkIp65504D65ReservdSMaxLimit(number); 
		serializeIp65504D65ReservdS(ip65504D65ReservdS);
	}

	public void setIp65504D65ReservdS(int number) {
	    number = checkIp65504D65ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D65ReservdS((short)number);
	}
	public void setIp65504D65ReservdS(long number) {
	    number = checkIp65504D65ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D65ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D65ReservdL
	 *	@return ip65504D65ReservdL
	 */
	public short getIp65504D65ReservdL() throws CFException {
        if (isIp65504D65ReservdLModified()) { 
           ip65504D65ReservdL = refreshIp65504D65ReservdL();
        }
   		return ip65504D65ReservdL;
	}
	
	/**
	 * 	Update Ip65504D65ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D65-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D65ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D65ReservdL = checkIp65504D65ReservdLMaxLimit(number); 
		serializeIp65504D65ReservdL(ip65504D65ReservdL);
	}

	public void setIp65504D65ReservdL(int number) {
	    number = checkIp65504D65ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D65ReservdL((short)number);
	}
	public void setIp65504D65ReservdL(long number) {
	    number = checkIp65504D65ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D65ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D66AmtFeeS
	 *	@return ip65504D66AmtFeeS
	 */
	public short getIp65504D66AmtFeeS() throws CFException {
        if (isIp65504D66AmtFeeSModified()) { 
           ip65504D66AmtFeeS = refreshIp65504D66AmtFeeS();
        }
   		return ip65504D66AmtFeeS;
	}
	
	/**
	 * 	Update Ip65504D66AmtFeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D66-AMT-FEE-S
	 *	@param number
	 */
	public void setIp65504D66AmtFeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D66AmtFeeS = checkIp65504D66AmtFeeSMaxLimit(number); 
		serializeIp65504D66AmtFeeS(ip65504D66AmtFeeS);
	}

	public void setIp65504D66AmtFeeS(int number) {
	    number = checkIp65504D66AmtFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D66AmtFeeS((short)number);
	}
	public void setIp65504D66AmtFeeS(long number) {
	    number = checkIp65504D66AmtFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D66AmtFeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D66AmtFeeL
	 *	@return ip65504D66AmtFeeL
	 */
	public short getIp65504D66AmtFeeL() throws CFException {
        if (isIp65504D66AmtFeeLModified()) { 
           ip65504D66AmtFeeL = refreshIp65504D66AmtFeeL();
        }
   		return ip65504D66AmtFeeL;
	}
	
	/**
	 * 	Update Ip65504D66AmtFeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D66-AMT-FEE-L
	 *	@param number
	 */
	public void setIp65504D66AmtFeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D66AmtFeeL = checkIp65504D66AmtFeeLMaxLimit(number); 
		serializeIp65504D66AmtFeeL(ip65504D66AmtFeeL);
	}

	public void setIp65504D66AmtFeeL(int number) {
	    number = checkIp65504D66AmtFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D66AmtFeeL((short)number);
	}
	public void setIp65504D66AmtFeeL(long number) {
	    number = checkIp65504D66AmtFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D66AmtFeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D67ExtPayS
	 *	@return ip65504D67ExtPayS
	 */
	public short getIp65504D67ExtPayS() throws CFException {
        if (isIp65504D67ExtPaySModified()) { 
           ip65504D67ExtPayS = refreshIp65504D67ExtPayS();
        }
   		return ip65504D67ExtPayS;
	}
	
	/**
	 * 	Update Ip65504D67ExtPayS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D67-EXT-PAY-S
	 *	@param number
	 */
	public void setIp65504D67ExtPayS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D67ExtPayS = checkIp65504D67ExtPaySMaxLimit(number); 
		serializeIp65504D67ExtPayS(ip65504D67ExtPayS);
	}

	public void setIp65504D67ExtPayS(int number) {
	    number = checkIp65504D67ExtPaySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D67ExtPayS((short)number);
	}
	public void setIp65504D67ExtPayS(long number) {
	    number = checkIp65504D67ExtPaySMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D67ExtPayS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D67ExtPayL
	 *	@return ip65504D67ExtPayL
	 */
	public short getIp65504D67ExtPayL() throws CFException {
        if (isIp65504D67ExtPayLModified()) { 
           ip65504D67ExtPayL = refreshIp65504D67ExtPayL();
        }
   		return ip65504D67ExtPayL;
	}
	
	/**
	 * 	Update Ip65504D67ExtPayL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D67-EXT-PAY-L
	 *	@param number
	 */
	public void setIp65504D67ExtPayL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D67ExtPayL = checkIp65504D67ExtPayLMaxLimit(number); 
		serializeIp65504D67ExtPayL(ip65504D67ExtPayL);
	}

	public void setIp65504D67ExtPayL(int number) {
	    number = checkIp65504D67ExtPayLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D67ExtPayL((short)number);
	}
	public void setIp65504D67ExtPayL(long number) {
	    number = checkIp65504D67ExtPayLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D67ExtPayL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D68RecvCcS
	 *	@return ip65504D68RecvCcS
	 */
	public short getIp65504D68RecvCcS() throws CFException {
        if (isIp65504D68RecvCcSModified()) { 
           ip65504D68RecvCcS = refreshIp65504D68RecvCcS();
        }
   		return ip65504D68RecvCcS;
	}
	
	/**
	 * 	Update Ip65504D68RecvCcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D68-RECV-CC-S
	 *	@param number
	 */
	public void setIp65504D68RecvCcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D68RecvCcS = checkIp65504D68RecvCcSMaxLimit(number); 
		serializeIp65504D68RecvCcS(ip65504D68RecvCcS);
	}

	public void setIp65504D68RecvCcS(int number) {
	    number = checkIp65504D68RecvCcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D68RecvCcS((short)number);
	}
	public void setIp65504D68RecvCcS(long number) {
	    number = checkIp65504D68RecvCcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D68RecvCcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D68RecvCcL
	 *	@return ip65504D68RecvCcL
	 */
	public short getIp65504D68RecvCcL() throws CFException {
        if (isIp65504D68RecvCcLModified()) { 
           ip65504D68RecvCcL = refreshIp65504D68RecvCcL();
        }
   		return ip65504D68RecvCcL;
	}
	
	/**
	 * 	Update Ip65504D68RecvCcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D68-RECV-CC-L
	 *	@param number
	 */
	public void setIp65504D68RecvCcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D68RecvCcL = checkIp65504D68RecvCcLMaxLimit(number); 
		serializeIp65504D68RecvCcL(ip65504D68RecvCcL);
	}

	public void setIp65504D68RecvCcL(int number) {
	    number = checkIp65504D68RecvCcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D68RecvCcL((short)number);
	}
	public void setIp65504D68RecvCcL(long number) {
	    number = checkIp65504D68RecvCcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D68RecvCcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D69SetlCcS
	 *	@return ip65504D69SetlCcS
	 */
	public short getIp65504D69SetlCcS() throws CFException {
        if (isIp65504D69SetlCcSModified()) { 
           ip65504D69SetlCcS = refreshIp65504D69SetlCcS();
        }
   		return ip65504D69SetlCcS;
	}
	
	/**
	 * 	Update Ip65504D69SetlCcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D69-SETL-CC-S
	 *	@param number
	 */
	public void setIp65504D69SetlCcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D69SetlCcS = checkIp65504D69SetlCcSMaxLimit(number); 
		serializeIp65504D69SetlCcS(ip65504D69SetlCcS);
	}

	public void setIp65504D69SetlCcS(int number) {
	    number = checkIp65504D69SetlCcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D69SetlCcS((short)number);
	}
	public void setIp65504D69SetlCcS(long number) {
	    number = checkIp65504D69SetlCcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D69SetlCcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D69SetlCcL
	 *	@return ip65504D69SetlCcL
	 */
	public short getIp65504D69SetlCcL() throws CFException {
        if (isIp65504D69SetlCcLModified()) { 
           ip65504D69SetlCcL = refreshIp65504D69SetlCcL();
        }
   		return ip65504D69SetlCcL;
	}
	
	/**
	 * 	Update Ip65504D69SetlCcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D69-SETL-CC-L
	 *	@param number
	 */
	public void setIp65504D69SetlCcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D69SetlCcL = checkIp65504D69SetlCcLMaxLimit(number); 
		serializeIp65504D69SetlCcL(ip65504D69SetlCcL);
	}

	public void setIp65504D69SetlCcL(int number) {
	    number = checkIp65504D69SetlCcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D69SetlCcL((short)number);
	}
	public void setIp65504D69SetlCcL(long number) {
	    number = checkIp65504D69SetlCcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D69SetlCcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D70AuthCcS
	 *	@return ip65504D70AuthCcS
	 */
	public short getIp65504D70AuthCcS() throws CFException {
        if (isIp65504D70AuthCcSModified()) { 
           ip65504D70AuthCcS = refreshIp65504D70AuthCcS();
        }
   		return ip65504D70AuthCcS;
	}
	
	/**
	 * 	Update Ip65504D70AuthCcS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D70-AUTH-CC-S
	 *	@param number
	 */
	public void setIp65504D70AuthCcS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D70AuthCcS = checkIp65504D70AuthCcSMaxLimit(number); 
		serializeIp65504D70AuthCcS(ip65504D70AuthCcS);
	}

	public void setIp65504D70AuthCcS(int number) {
	    number = checkIp65504D70AuthCcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D70AuthCcS((short)number);
	}
	public void setIp65504D70AuthCcS(long number) {
	    number = checkIp65504D70AuthCcSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D70AuthCcS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D70AuthCcL
	 *	@return ip65504D70AuthCcL
	 */
	public short getIp65504D70AuthCcL() throws CFException {
        if (isIp65504D70AuthCcLModified()) { 
           ip65504D70AuthCcL = refreshIp65504D70AuthCcL();
        }
   		return ip65504D70AuthCcL;
	}
	
	/**
	 * 	Update Ip65504D70AuthCcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D70-AUTH-CC-L
	 *	@param number
	 */
	public void setIp65504D70AuthCcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D70AuthCcL = checkIp65504D70AuthCcLMaxLimit(number); 
		serializeIp65504D70AuthCcL(ip65504D70AuthCcL);
	}

	public void setIp65504D70AuthCcL(int number) {
	    number = checkIp65504D70AuthCcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D70AuthCcL((short)number);
	}
	public void setIp65504D70AuthCcL(long number) {
	    number = checkIp65504D70AuthCcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D70AuthCcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D71MsgNbrS
	 *	@return ip65504D71MsgNbrS
	 */
	public short getIp65504D71MsgNbrS() throws CFException {
        if (isIp65504D71MsgNbrSModified()) { 
           ip65504D71MsgNbrS = refreshIp65504D71MsgNbrS();
        }
   		return ip65504D71MsgNbrS;
	}
	
	/**
	 * 	Update Ip65504D71MsgNbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D71-MSG-NBR-S
	 *	@param number
	 */
	public void setIp65504D71MsgNbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D71MsgNbrS = checkIp65504D71MsgNbrSMaxLimit(number); 
		serializeIp65504D71MsgNbrS(ip65504D71MsgNbrS);
	}

	public void setIp65504D71MsgNbrS(int number) {
	    number = checkIp65504D71MsgNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D71MsgNbrS((short)number);
	}
	public void setIp65504D71MsgNbrS(long number) {
	    number = checkIp65504D71MsgNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D71MsgNbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D71MsgNbrL
	 *	@return ip65504D71MsgNbrL
	 */
	public short getIp65504D71MsgNbrL() throws CFException {
        if (isIp65504D71MsgNbrLModified()) { 
           ip65504D71MsgNbrL = refreshIp65504D71MsgNbrL();
        }
   		return ip65504D71MsgNbrL;
	}
	
	/**
	 * 	Update Ip65504D71MsgNbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D71-MSG-NBR-L
	 *	@param number
	 */
	public void setIp65504D71MsgNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D71MsgNbrL = checkIp65504D71MsgNbrLMaxLimit(number); 
		serializeIp65504D71MsgNbrL(ip65504D71MsgNbrL);
	}

	public void setIp65504D71MsgNbrL(int number) {
	    number = checkIp65504D71MsgNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D71MsgNbrL((short)number);
	}
	public void setIp65504D71MsgNbrL(long number) {
	    number = checkIp65504D71MsgNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D71MsgNbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D72DataRdS
	 *	@return ip65504D72DataRdS
	 */
	public short getIp65504D72DataRdS() throws CFException {
        if (isIp65504D72DataRdSModified()) { 
           ip65504D72DataRdS = refreshIp65504D72DataRdS();
        }
   		return ip65504D72DataRdS;
	}
	
	/**
	 * 	Update Ip65504D72DataRdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D72-DATA-RD-S
	 *	@param number
	 */
	public void setIp65504D72DataRdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D72DataRdS = checkIp65504D72DataRdSMaxLimit(number); 
		serializeIp65504D72DataRdS(ip65504D72DataRdS);
	}

	public void setIp65504D72DataRdS(int number) {
	    number = checkIp65504D72DataRdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D72DataRdS((short)number);
	}
	public void setIp65504D72DataRdS(long number) {
	    number = checkIp65504D72DataRdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D72DataRdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D72DataRdL
	 *	@return ip65504D72DataRdL
	 */
	public short getIp65504D72DataRdL() throws CFException {
        if (isIp65504D72DataRdLModified()) { 
           ip65504D72DataRdL = refreshIp65504D72DataRdL();
        }
   		return ip65504D72DataRdL;
	}
	
	/**
	 * 	Update Ip65504D72DataRdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D72-DATA-RD-L
	 *	@param number
	 */
	public void setIp65504D72DataRdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D72DataRdL = checkIp65504D72DataRdLMaxLimit(number); 
		serializeIp65504D72DataRdL(ip65504D72DataRdL);
	}

	public void setIp65504D72DataRdL(int number) {
	    number = checkIp65504D72DataRdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D72DataRdL((short)number);
	}
	public void setIp65504D72DataRdL(long number) {
	    number = checkIp65504D72DataRdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D72DataRdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D73ActDteS
	 *	@return ip65504D73ActDteS
	 */
	public short getIp65504D73ActDteS() throws CFException {
        if (isIp65504D73ActDteSModified()) { 
           ip65504D73ActDteS = refreshIp65504D73ActDteS();
        }
   		return ip65504D73ActDteS;
	}
	
	/**
	 * 	Update Ip65504D73ActDteS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D73-ACT-DTE-S
	 *	@param number
	 */
	public void setIp65504D73ActDteS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D73ActDteS = checkIp65504D73ActDteSMaxLimit(number); 
		serializeIp65504D73ActDteS(ip65504D73ActDteS);
	}

	public void setIp65504D73ActDteS(int number) {
	    number = checkIp65504D73ActDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D73ActDteS((short)number);
	}
	public void setIp65504D73ActDteS(long number) {
	    number = checkIp65504D73ActDteSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D73ActDteS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D73ActDteL
	 *	@return ip65504D73ActDteL
	 */
	public short getIp65504D73ActDteL() throws CFException {
        if (isIp65504D73ActDteLModified()) { 
           ip65504D73ActDteL = refreshIp65504D73ActDteL();
        }
   		return ip65504D73ActDteL;
	}
	
	/**
	 * 	Update Ip65504D73ActDteL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D73-ACT-DTE-L
	 *	@param number
	 */
	public void setIp65504D73ActDteL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D73ActDteL = checkIp65504D73ActDteLMaxLimit(number); 
		serializeIp65504D73ActDteL(ip65504D73ActDteL);
	}

	public void setIp65504D73ActDteL(int number) {
	    number = checkIp65504D73ActDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D73ActDteL((short)number);
	}
	public void setIp65504D73ActDteL(long number) {
	    number = checkIp65504D73ActDteLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D73ActDteL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D74CrNmbrS
	 *	@return ip65504D74CrNmbrS
	 */
	public short getIp65504D74CrNmbrS() throws CFException {
        if (isIp65504D74CrNmbrSModified()) { 
           ip65504D74CrNmbrS = refreshIp65504D74CrNmbrS();
        }
   		return ip65504D74CrNmbrS;
	}
	
	/**
	 * 	Update Ip65504D74CrNmbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D74-CR-NMBR-S
	 *	@param number
	 */
	public void setIp65504D74CrNmbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D74CrNmbrS = checkIp65504D74CrNmbrSMaxLimit(number); 
		serializeIp65504D74CrNmbrS(ip65504D74CrNmbrS);
	}

	public void setIp65504D74CrNmbrS(int number) {
	    number = checkIp65504D74CrNmbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D74CrNmbrS((short)number);
	}
	public void setIp65504D74CrNmbrS(long number) {
	    number = checkIp65504D74CrNmbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D74CrNmbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D74CrNmbrL
	 *	@return ip65504D74CrNmbrL
	 */
	public short getIp65504D74CrNmbrL() throws CFException {
        if (isIp65504D74CrNmbrLModified()) { 
           ip65504D74CrNmbrL = refreshIp65504D74CrNmbrL();
        }
   		return ip65504D74CrNmbrL;
	}
	
	/**
	 * 	Update Ip65504D74CrNmbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D74-CR-NMBR-L
	 *	@param number
	 */
	public void setIp65504D74CrNmbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D74CrNmbrL = checkIp65504D74CrNmbrLMaxLimit(number); 
		serializeIp65504D74CrNmbrL(ip65504D74CrNmbrL);
	}

	public void setIp65504D74CrNmbrL(int number) {
	    number = checkIp65504D74CrNmbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D74CrNmbrL((short)number);
	}
	public void setIp65504D74CrNmbrL(long number) {
	    number = checkIp65504D74CrNmbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D74CrNmbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D75CrRevnS
	 *	@return ip65504D75CrRevnS
	 */
	public short getIp65504D75CrRevnS() throws CFException {
        if (isIp65504D75CrRevnSModified()) { 
           ip65504D75CrRevnS = refreshIp65504D75CrRevnS();
        }
   		return ip65504D75CrRevnS;
	}
	
	/**
	 * 	Update Ip65504D75CrRevnS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D75-CR-REVN-S
	 *	@param number
	 */
	public void setIp65504D75CrRevnS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D75CrRevnS = checkIp65504D75CrRevnSMaxLimit(number); 
		serializeIp65504D75CrRevnS(ip65504D75CrRevnS);
	}

	public void setIp65504D75CrRevnS(int number) {
	    number = checkIp65504D75CrRevnSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D75CrRevnS((short)number);
	}
	public void setIp65504D75CrRevnS(long number) {
	    number = checkIp65504D75CrRevnSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D75CrRevnS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D75CrRevnL
	 *	@return ip65504D75CrRevnL
	 */
	public short getIp65504D75CrRevnL() throws CFException {
        if (isIp65504D75CrRevnLModified()) { 
           ip65504D75CrRevnL = refreshIp65504D75CrRevnL();
        }
   		return ip65504D75CrRevnL;
	}
	
	/**
	 * 	Update Ip65504D75CrRevnL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D75-CR-REVN-L
	 *	@param number
	 */
	public void setIp65504D75CrRevnL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D75CrRevnL = checkIp65504D75CrRevnLMaxLimit(number); 
		serializeIp65504D75CrRevnL(ip65504D75CrRevnL);
	}

	public void setIp65504D75CrRevnL(int number) {
	    number = checkIp65504D75CrRevnLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D75CrRevnL((short)number);
	}
	public void setIp65504D75CrRevnL(long number) {
	    number = checkIp65504D75CrRevnLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D75CrRevnL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D76DbNmbrS
	 *	@return ip65504D76DbNmbrS
	 */
	public short getIp65504D76DbNmbrS() throws CFException {
        if (isIp65504D76DbNmbrSModified()) { 
           ip65504D76DbNmbrS = refreshIp65504D76DbNmbrS();
        }
   		return ip65504D76DbNmbrS;
	}
	
	/**
	 * 	Update Ip65504D76DbNmbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D76-DB-NMBR-S
	 *	@param number
	 */
	public void setIp65504D76DbNmbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D76DbNmbrS = checkIp65504D76DbNmbrSMaxLimit(number); 
		serializeIp65504D76DbNmbrS(ip65504D76DbNmbrS);
	}

	public void setIp65504D76DbNmbrS(int number) {
	    number = checkIp65504D76DbNmbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D76DbNmbrS((short)number);
	}
	public void setIp65504D76DbNmbrS(long number) {
	    number = checkIp65504D76DbNmbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D76DbNmbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D76DbNmbrL
	 *	@return ip65504D76DbNmbrL
	 */
	public short getIp65504D76DbNmbrL() throws CFException {
        if (isIp65504D76DbNmbrLModified()) { 
           ip65504D76DbNmbrL = refreshIp65504D76DbNmbrL();
        }
   		return ip65504D76DbNmbrL;
	}
	
	/**
	 * 	Update Ip65504D76DbNmbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D76-DB-NMBR-L
	 *	@param number
	 */
	public void setIp65504D76DbNmbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D76DbNmbrL = checkIp65504D76DbNmbrLMaxLimit(number); 
		serializeIp65504D76DbNmbrL(ip65504D76DbNmbrL);
	}

	public void setIp65504D76DbNmbrL(int number) {
	    number = checkIp65504D76DbNmbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D76DbNmbrL((short)number);
	}
	public void setIp65504D76DbNmbrL(long number) {
	    number = checkIp65504D76DbNmbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D76DbNmbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D77DbRevnS
	 *	@return ip65504D77DbRevnS
	 */
	public short getIp65504D77DbRevnS() throws CFException {
        if (isIp65504D77DbRevnSModified()) { 
           ip65504D77DbRevnS = refreshIp65504D77DbRevnS();
        }
   		return ip65504D77DbRevnS;
	}
	
	/**
	 * 	Update Ip65504D77DbRevnS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D77-DB-REVN-S
	 *	@param number
	 */
	public void setIp65504D77DbRevnS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D77DbRevnS = checkIp65504D77DbRevnSMaxLimit(number); 
		serializeIp65504D77DbRevnS(ip65504D77DbRevnS);
	}

	public void setIp65504D77DbRevnS(int number) {
	    number = checkIp65504D77DbRevnSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D77DbRevnS((short)number);
	}
	public void setIp65504D77DbRevnS(long number) {
	    number = checkIp65504D77DbRevnSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D77DbRevnS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D77DbRevnL
	 *	@return ip65504D77DbRevnL
	 */
	public short getIp65504D77DbRevnL() throws CFException {
        if (isIp65504D77DbRevnLModified()) { 
           ip65504D77DbRevnL = refreshIp65504D77DbRevnL();
        }
   		return ip65504D77DbRevnL;
	}
	
	/**
	 * 	Update Ip65504D77DbRevnL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D77-DB-REVN-L
	 *	@param number
	 */
	public void setIp65504D77DbRevnL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D77DbRevnL = checkIp65504D77DbRevnLMaxLimit(number); 
		serializeIp65504D77DbRevnL(ip65504D77DbRevnL);
	}

	public void setIp65504D77DbRevnL(int number) {
	    number = checkIp65504D77DbRevnLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D77DbRevnL((short)number);
	}
	public void setIp65504D77DbRevnL(long number) {
	    number = checkIp65504D77DbRevnLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D77DbRevnL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D78TferNoS
	 *	@return ip65504D78TferNoS
	 */
	public short getIp65504D78TferNoS() throws CFException {
        if (isIp65504D78TferNoSModified()) { 
           ip65504D78TferNoS = refreshIp65504D78TferNoS();
        }
   		return ip65504D78TferNoS;
	}
	
	/**
	 * 	Update Ip65504D78TferNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D78-TFER-NO-S
	 *	@param number
	 */
	public void setIp65504D78TferNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D78TferNoS = checkIp65504D78TferNoSMaxLimit(number); 
		serializeIp65504D78TferNoS(ip65504D78TferNoS);
	}

	public void setIp65504D78TferNoS(int number) {
	    number = checkIp65504D78TferNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D78TferNoS((short)number);
	}
	public void setIp65504D78TferNoS(long number) {
	    number = checkIp65504D78TferNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D78TferNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D78TferNoL
	 *	@return ip65504D78TferNoL
	 */
	public short getIp65504D78TferNoL() throws CFException {
        if (isIp65504D78TferNoLModified()) { 
           ip65504D78TferNoL = refreshIp65504D78TferNoL();
        }
   		return ip65504D78TferNoL;
	}
	
	/**
	 * 	Update Ip65504D78TferNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D78-TFER-NO-L
	 *	@param number
	 */
	public void setIp65504D78TferNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D78TferNoL = checkIp65504D78TferNoLMaxLimit(number); 
		serializeIp65504D78TferNoL(ip65504D78TferNoL);
	}

	public void setIp65504D78TferNoL(int number) {
	    number = checkIp65504D78TferNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D78TferNoL((short)number);
	}
	public void setIp65504D78TferNoL(long number) {
	    number = checkIp65504D78TferNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D78TferNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D79TferRvS
	 *	@return ip65504D79TferRvS
	 */
	public short getIp65504D79TferRvS() throws CFException {
        if (isIp65504D79TferRvSModified()) { 
           ip65504D79TferRvS = refreshIp65504D79TferRvS();
        }
   		return ip65504D79TferRvS;
	}
	
	/**
	 * 	Update Ip65504D79TferRvS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D79-TFER-RV-S
	 *	@param number
	 */
	public void setIp65504D79TferRvS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D79TferRvS = checkIp65504D79TferRvSMaxLimit(number); 
		serializeIp65504D79TferRvS(ip65504D79TferRvS);
	}

	public void setIp65504D79TferRvS(int number) {
	    number = checkIp65504D79TferRvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D79TferRvS((short)number);
	}
	public void setIp65504D79TferRvS(long number) {
	    number = checkIp65504D79TferRvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D79TferRvS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D79TferRcL
	 *	@return ip65504D79TferRcL
	 */
	public short getIp65504D79TferRcL() throws CFException {
        if (isIp65504D79TferRcLModified()) { 
           ip65504D79TferRcL = refreshIp65504D79TferRcL();
        }
   		return ip65504D79TferRcL;
	}
	
	/**
	 * 	Update Ip65504D79TferRcL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D79-TFER-RC-L
	 *	@param number
	 */
	public void setIp65504D79TferRcL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D79TferRcL = checkIp65504D79TferRcLMaxLimit(number); 
		serializeIp65504D79TferRcL(ip65504D79TferRcL);
	}

	public void setIp65504D79TferRcL(int number) {
	    number = checkIp65504D79TferRcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D79TferRcL((short)number);
	}
	public void setIp65504D79TferRcL(long number) {
	    number = checkIp65504D79TferRcLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D79TferRcL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D80InqNbrS
	 *	@return ip65504D80InqNbrS
	 */
	public short getIp65504D80InqNbrS() throws CFException {
        if (isIp65504D80InqNbrSModified()) { 
           ip65504D80InqNbrS = refreshIp65504D80InqNbrS();
        }
   		return ip65504D80InqNbrS;
	}
	
	/**
	 * 	Update Ip65504D80InqNbrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D80-INQ-NBR-S
	 *	@param number
	 */
	public void setIp65504D80InqNbrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D80InqNbrS = checkIp65504D80InqNbrSMaxLimit(number); 
		serializeIp65504D80InqNbrS(ip65504D80InqNbrS);
	}

	public void setIp65504D80InqNbrS(int number) {
	    number = checkIp65504D80InqNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D80InqNbrS((short)number);
	}
	public void setIp65504D80InqNbrS(long number) {
	    number = checkIp65504D80InqNbrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D80InqNbrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D80InqNbrL
	 *	@return ip65504D80InqNbrL
	 */
	public short getIp65504D80InqNbrL() throws CFException {
        if (isIp65504D80InqNbrLModified()) { 
           ip65504D80InqNbrL = refreshIp65504D80InqNbrL();
        }
   		return ip65504D80InqNbrL;
	}
	
	/**
	 * 	Update Ip65504D80InqNbrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D80-INQ-NBR-L
	 *	@param number
	 */
	public void setIp65504D80InqNbrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D80InqNbrL = checkIp65504D80InqNbrLMaxLimit(number); 
		serializeIp65504D80InqNbrL(ip65504D80InqNbrL);
	}

	public void setIp65504D80InqNbrL(int number) {
	    number = checkIp65504D80InqNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D80InqNbrL((short)number);
	}
	public void setIp65504D80InqNbrL(long number) {
	    number = checkIp65504D80InqNbrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D80InqNbrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D81AuthNoS
	 *	@return ip65504D81AuthNoS
	 */
	public short getIp65504D81AuthNoS() throws CFException {
        if (isIp65504D81AuthNoSModified()) { 
           ip65504D81AuthNoS = refreshIp65504D81AuthNoS();
        }
   		return ip65504D81AuthNoS;
	}
	
	/**
	 * 	Update Ip65504D81AuthNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D81-AUTH-NO-S
	 *	@param number
	 */
	public void setIp65504D81AuthNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D81AuthNoS = checkIp65504D81AuthNoSMaxLimit(number); 
		serializeIp65504D81AuthNoS(ip65504D81AuthNoS);
	}

	public void setIp65504D81AuthNoS(int number) {
	    number = checkIp65504D81AuthNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D81AuthNoS((short)number);
	}
	public void setIp65504D81AuthNoS(long number) {
	    number = checkIp65504D81AuthNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D81AuthNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D81AuthNoL
	 *	@return ip65504D81AuthNoL
	 */
	public short getIp65504D81AuthNoL() throws CFException {
        if (isIp65504D81AuthNoLModified()) { 
           ip65504D81AuthNoL = refreshIp65504D81AuthNoL();
        }
   		return ip65504D81AuthNoL;
	}
	
	/**
	 * 	Update Ip65504D81AuthNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D81-AUTH-NO-L
	 *	@param number
	 */
	public void setIp65504D81AuthNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D81AuthNoL = checkIp65504D81AuthNoLMaxLimit(number); 
		serializeIp65504D81AuthNoL(ip65504D81AuthNoL);
	}

	public void setIp65504D81AuthNoL(int number) {
	    number = checkIp65504D81AuthNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D81AuthNoL((short)number);
	}
	public void setIp65504D81AuthNoL(long number) {
	    number = checkIp65504D81AuthNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D81AuthNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D82InqRevS
	 *	@return ip65504D82InqRevS
	 */
	public short getIp65504D82InqRevS() throws CFException {
        if (isIp65504D82InqRevSModified()) { 
           ip65504D82InqRevS = refreshIp65504D82InqRevS();
        }
   		return ip65504D82InqRevS;
	}
	
	/**
	 * 	Update Ip65504D82InqRevS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D82-INQ-REV-S
	 *	@param number
	 */
	public void setIp65504D82InqRevS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D82InqRevS = checkIp65504D82InqRevSMaxLimit(number); 
		serializeIp65504D82InqRevS(ip65504D82InqRevS);
	}

	public void setIp65504D82InqRevS(int number) {
	    number = checkIp65504D82InqRevSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D82InqRevS((short)number);
	}
	public void setIp65504D82InqRevS(long number) {
	    number = checkIp65504D82InqRevSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D82InqRevS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D82InqRevL
	 *	@return ip65504D82InqRevL
	 */
	public short getIp65504D82InqRevL() throws CFException {
        if (isIp65504D82InqRevLModified()) { 
           ip65504D82InqRevL = refreshIp65504D82InqRevL();
        }
   		return ip65504D82InqRevL;
	}
	
	/**
	 * 	Update Ip65504D82InqRevL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D82-INQ-REV-L
	 *	@param number
	 */
	public void setIp65504D82InqRevL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D82InqRevL = checkIp65504D82InqRevLMaxLimit(number); 
		serializeIp65504D82InqRevL(ip65504D82InqRevL);
	}

	public void setIp65504D82InqRevL(int number) {
	    number = checkIp65504D82InqRevLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D82InqRevL((short)number);
	}
	public void setIp65504D82InqRevL(long number) {
	    number = checkIp65504D82InqRevLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D82InqRevL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D83PymtNoS
	 *	@return ip65504D83PymtNoS
	 */
	public short getIp65504D83PymtNoS() throws CFException {
        if (isIp65504D83PymtNoSModified()) { 
           ip65504D83PymtNoS = refreshIp65504D83PymtNoS();
        }
   		return ip65504D83PymtNoS;
	}
	
	/**
	 * 	Update Ip65504D83PymtNoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D83-PYMT-NO-S
	 *	@param number
	 */
	public void setIp65504D83PymtNoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D83PymtNoS = checkIp65504D83PymtNoSMaxLimit(number); 
		serializeIp65504D83PymtNoS(ip65504D83PymtNoS);
	}

	public void setIp65504D83PymtNoS(int number) {
	    number = checkIp65504D83PymtNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D83PymtNoS((short)number);
	}
	public void setIp65504D83PymtNoS(long number) {
	    number = checkIp65504D83PymtNoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D83PymtNoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D83PymtNoL
	 *	@return ip65504D83PymtNoL
	 */
	public short getIp65504D83PymtNoL() throws CFException {
        if (isIp65504D83PymtNoLModified()) { 
           ip65504D83PymtNoL = refreshIp65504D83PymtNoL();
        }
   		return ip65504D83PymtNoL;
	}
	
	/**
	 * 	Update Ip65504D83PymtNoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D83-PYMT-NO-L
	 *	@param number
	 */
	public void setIp65504D83PymtNoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D83PymtNoL = checkIp65504D83PymtNoLMaxLimit(number); 
		serializeIp65504D83PymtNoL(ip65504D83PymtNoL);
	}

	public void setIp65504D83PymtNoL(int number) {
	    number = checkIp65504D83PymtNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D83PymtNoL((short)number);
	}
	public void setIp65504D83PymtNoL(long number) {
	    number = checkIp65504D83PymtNoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D83PymtNoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D84PymtRvS
	 *	@return ip65504D84PymtRvS
	 */
	public short getIp65504D84PymtRvS() throws CFException {
        if (isIp65504D84PymtRvSModified()) { 
           ip65504D84PymtRvS = refreshIp65504D84PymtRvS();
        }
   		return ip65504D84PymtRvS;
	}
	
	/**
	 * 	Update Ip65504D84PymtRvS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D84-PYMT-RV-S
	 *	@param number
	 */
	public void setIp65504D84PymtRvS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D84PymtRvS = checkIp65504D84PymtRvSMaxLimit(number); 
		serializeIp65504D84PymtRvS(ip65504D84PymtRvS);
	}

	public void setIp65504D84PymtRvS(int number) {
	    number = checkIp65504D84PymtRvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D84PymtRvS((short)number);
	}
	public void setIp65504D84PymtRvS(long number) {
	    number = checkIp65504D84PymtRvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D84PymtRvS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D84PymtRvL
	 *	@return ip65504D84PymtRvL
	 */
	public short getIp65504D84PymtRvL() throws CFException {
        if (isIp65504D84PymtRvLModified()) { 
           ip65504D84PymtRvL = refreshIp65504D84PymtRvL();
        }
   		return ip65504D84PymtRvL;
	}
	
	/**
	 * 	Update Ip65504D84PymtRvL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D84-PYMT-RV-L
	 *	@param number
	 */
	public void setIp65504D84PymtRvL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D84PymtRvL = checkIp65504D84PymtRvLMaxLimit(number); 
		serializeIp65504D84PymtRvL(ip65504D84PymtRvL);
	}

	public void setIp65504D84PymtRvL(int number) {
	    number = checkIp65504D84PymtRvLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D84PymtRvL((short)number);
	}
	public void setIp65504D84PymtRvL(long number) {
	    number = checkIp65504D84PymtRvLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D84PymtRvL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D85FeeColS
	 *	@return ip65504D85FeeColS
	 */
	public short getIp65504D85FeeColS() throws CFException {
        if (isIp65504D85FeeColSModified()) { 
           ip65504D85FeeColS = refreshIp65504D85FeeColS();
        }
   		return ip65504D85FeeColS;
	}
	
	/**
	 * 	Update Ip65504D85FeeColS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D85-FEE-COL-S
	 *	@param number
	 */
	public void setIp65504D85FeeColS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D85FeeColS = checkIp65504D85FeeColSMaxLimit(number); 
		serializeIp65504D85FeeColS(ip65504D85FeeColS);
	}

	public void setIp65504D85FeeColS(int number) {
	    number = checkIp65504D85FeeColSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D85FeeColS((short)number);
	}
	public void setIp65504D85FeeColS(long number) {
	    number = checkIp65504D85FeeColSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D85FeeColS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D85FeeColL
	 *	@return ip65504D85FeeColL
	 */
	public short getIp65504D85FeeColL() throws CFException {
        if (isIp65504D85FeeColLModified()) { 
           ip65504D85FeeColL = refreshIp65504D85FeeColL();
        }
   		return ip65504D85FeeColL;
	}
	
	/**
	 * 	Update Ip65504D85FeeColL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D85-FEE-COL-L
	 *	@param number
	 */
	public void setIp65504D85FeeColL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D85FeeColL = checkIp65504D85FeeColLMaxLimit(number); 
		serializeIp65504D85FeeColL(ip65504D85FeeColL);
	}

	public void setIp65504D85FeeColL(int number) {
	    number = checkIp65504D85FeeColLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D85FeeColL((short)number);
	}
	public void setIp65504D85FeeColL(long number) {
	    number = checkIp65504D85FeeColLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D85FeeColL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D86CrAmtsS
	 *	@return ip65504D86CrAmtsS
	 */
	public short getIp65504D86CrAmtsS() throws CFException {
        if (isIp65504D86CrAmtsSModified()) { 
           ip65504D86CrAmtsS = refreshIp65504D86CrAmtsS();
        }
   		return ip65504D86CrAmtsS;
	}
	
	/**
	 * 	Update Ip65504D86CrAmtsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D86-CR-AMTS-S
	 *	@param number
	 */
	public void setIp65504D86CrAmtsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D86CrAmtsS = checkIp65504D86CrAmtsSMaxLimit(number); 
		serializeIp65504D86CrAmtsS(ip65504D86CrAmtsS);
	}

	public void setIp65504D86CrAmtsS(int number) {
	    number = checkIp65504D86CrAmtsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D86CrAmtsS((short)number);
	}
	public void setIp65504D86CrAmtsS(long number) {
	    number = checkIp65504D86CrAmtsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D86CrAmtsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D86CrAmtsL
	 *	@return ip65504D86CrAmtsL
	 */
	public short getIp65504D86CrAmtsL() throws CFException {
        if (isIp65504D86CrAmtsLModified()) { 
           ip65504D86CrAmtsL = refreshIp65504D86CrAmtsL();
        }
   		return ip65504D86CrAmtsL;
	}
	
	/**
	 * 	Update Ip65504D86CrAmtsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D86-CR-AMTS-L
	 *	@param number
	 */
	public void setIp65504D86CrAmtsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D86CrAmtsL = checkIp65504D86CrAmtsLMaxLimit(number); 
		serializeIp65504D86CrAmtsL(ip65504D86CrAmtsL);
	}

	public void setIp65504D86CrAmtsL(int number) {
	    number = checkIp65504D86CrAmtsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D86CrAmtsL((short)number);
	}
	public void setIp65504D86CrAmtsL(long number) {
	    number = checkIp65504D86CrAmtsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D86CrAmtsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D87CrRevrS
	 *	@return ip65504D87CrRevrS
	 */
	public short getIp65504D87CrRevrS() throws CFException {
        if (isIp65504D87CrRevrSModified()) { 
           ip65504D87CrRevrS = refreshIp65504D87CrRevrS();
        }
   		return ip65504D87CrRevrS;
	}
	
	/**
	 * 	Update Ip65504D87CrRevrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D87-CR-REVR-S
	 *	@param number
	 */
	public void setIp65504D87CrRevrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D87CrRevrS = checkIp65504D87CrRevrSMaxLimit(number); 
		serializeIp65504D87CrRevrS(ip65504D87CrRevrS);
	}

	public void setIp65504D87CrRevrS(int number) {
	    number = checkIp65504D87CrRevrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D87CrRevrS((short)number);
	}
	public void setIp65504D87CrRevrS(long number) {
	    number = checkIp65504D87CrRevrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D87CrRevrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D87CrRevrL
	 *	@return ip65504D87CrRevrL
	 */
	public short getIp65504D87CrRevrL() throws CFException {
        if (isIp65504D87CrRevrLModified()) { 
           ip65504D87CrRevrL = refreshIp65504D87CrRevrL();
        }
   		return ip65504D87CrRevrL;
	}
	
	/**
	 * 	Update Ip65504D87CrRevrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D87-CR-REVR-L
	 *	@param number
	 */
	public void setIp65504D87CrRevrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D87CrRevrL = checkIp65504D87CrRevrLMaxLimit(number); 
		serializeIp65504D87CrRevrL(ip65504D87CrRevrL);
	}

	public void setIp65504D87CrRevrL(int number) {
	    number = checkIp65504D87CrRevrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D87CrRevrL((short)number);
	}
	public void setIp65504D87CrRevrL(long number) {
	    number = checkIp65504D87CrRevrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D87CrRevrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D88DbAmtsS
	 *	@return ip65504D88DbAmtsS
	 */
	public short getIp65504D88DbAmtsS() throws CFException {
        if (isIp65504D88DbAmtsSModified()) { 
           ip65504D88DbAmtsS = refreshIp65504D88DbAmtsS();
        }
   		return ip65504D88DbAmtsS;
	}
	
	/**
	 * 	Update Ip65504D88DbAmtsS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D88-DB-AMTS-S
	 *	@param number
	 */
	public void setIp65504D88DbAmtsS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D88DbAmtsS = checkIp65504D88DbAmtsSMaxLimit(number); 
		serializeIp65504D88DbAmtsS(ip65504D88DbAmtsS);
	}

	public void setIp65504D88DbAmtsS(int number) {
	    number = checkIp65504D88DbAmtsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D88DbAmtsS((short)number);
	}
	public void setIp65504D88DbAmtsS(long number) {
	    number = checkIp65504D88DbAmtsSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D88DbAmtsS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D88DbAmtsL
	 *	@return ip65504D88DbAmtsL
	 */
	public short getIp65504D88DbAmtsL() throws CFException {
        if (isIp65504D88DbAmtsLModified()) { 
           ip65504D88DbAmtsL = refreshIp65504D88DbAmtsL();
        }
   		return ip65504D88DbAmtsL;
	}
	
	/**
	 * 	Update Ip65504D88DbAmtsL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D88-DB-AMTS-L
	 *	@param number
	 */
	public void setIp65504D88DbAmtsL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D88DbAmtsL = checkIp65504D88DbAmtsLMaxLimit(number); 
		serializeIp65504D88DbAmtsL(ip65504D88DbAmtsL);
	}

	public void setIp65504D88DbAmtsL(int number) {
	    number = checkIp65504D88DbAmtsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D88DbAmtsL((short)number);
	}
	public void setIp65504D88DbAmtsL(long number) {
	    number = checkIp65504D88DbAmtsLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D88DbAmtsL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D89DbRevrS
	 *	@return ip65504D89DbRevrS
	 */
	public short getIp65504D89DbRevrS() throws CFException {
        if (isIp65504D89DbRevrSModified()) { 
           ip65504D89DbRevrS = refreshIp65504D89DbRevrS();
        }
   		return ip65504D89DbRevrS;
	}
	
	/**
	 * 	Update Ip65504D89DbRevrS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D89-DB-REVR-S
	 *	@param number
	 */
	public void setIp65504D89DbRevrS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D89DbRevrS = checkIp65504D89DbRevrSMaxLimit(number); 
		serializeIp65504D89DbRevrS(ip65504D89DbRevrS);
	}

	public void setIp65504D89DbRevrS(int number) {
	    number = checkIp65504D89DbRevrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D89DbRevrS((short)number);
	}
	public void setIp65504D89DbRevrS(long number) {
	    number = checkIp65504D89DbRevrSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D89DbRevrS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D89DbRevrL
	 *	@return ip65504D89DbRevrL
	 */
	public short getIp65504D89DbRevrL() throws CFException {
        if (isIp65504D89DbRevrLModified()) { 
           ip65504D89DbRevrL = refreshIp65504D89DbRevrL();
        }
   		return ip65504D89DbRevrL;
	}
	
	/**
	 * 	Update Ip65504D89DbRevrL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D89-DB-REVR-L
	 *	@param number
	 */
	public void setIp65504D89DbRevrL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D89DbRevrL = checkIp65504D89DbRevrLMaxLimit(number); 
		serializeIp65504D89DbRevrL(ip65504D89DbRevrL);
	}

	public void setIp65504D89DbRevrL(int number) {
	    number = checkIp65504D89DbRevrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D89DbRevrL((short)number);
	}
	public void setIp65504D89DbRevrL(long number) {
	    number = checkIp65504D89DbRevrLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D89DbRevrL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D90AuthRvS
	 *	@return ip65504D90AuthRvS
	 */
	public short getIp65504D90AuthRvS() throws CFException {
        if (isIp65504D90AuthRvSModified()) { 
           ip65504D90AuthRvS = refreshIp65504D90AuthRvS();
        }
   		return ip65504D90AuthRvS;
	}
	
	/**
	 * 	Update Ip65504D90AuthRvS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D90-AUTH-RV-S
	 *	@param number
	 */
	public void setIp65504D90AuthRvS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D90AuthRvS = checkIp65504D90AuthRvSMaxLimit(number); 
		serializeIp65504D90AuthRvS(ip65504D90AuthRvS);
	}

	public void setIp65504D90AuthRvS(int number) {
	    number = checkIp65504D90AuthRvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D90AuthRvS((short)number);
	}
	public void setIp65504D90AuthRvS(long number) {
	    number = checkIp65504D90AuthRvSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D90AuthRvS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D90AuthRvL
	 *	@return ip65504D90AuthRvL
	 */
	public short getIp65504D90AuthRvL() throws CFException {
        if (isIp65504D90AuthRvLModified()) { 
           ip65504D90AuthRvL = refreshIp65504D90AuthRvL();
        }
   		return ip65504D90AuthRvL;
	}
	
	/**
	 * 	Update Ip65504D90AuthRvL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D90-AUTH-RV-L
	 *	@param number
	 */
	public void setIp65504D90AuthRvL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D90AuthRvL = checkIp65504D90AuthRvLMaxLimit(number); 
		serializeIp65504D90AuthRvL(ip65504D90AuthRvL);
	}

	public void setIp65504D90AuthRvL(int number) {
	    number = checkIp65504D90AuthRvLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D90AuthRvL((short)number);
	}
	public void setIp65504D90AuthRvL(long number) {
	    number = checkIp65504D90AuthRvLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D90AuthRvL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D91TrxDccS
	 *	@return ip65504D91TrxDccS
	 */
	public short getIp65504D91TrxDccS() throws CFException {
        if (isIp65504D91TrxDccSModified()) { 
           ip65504D91TrxDccS = refreshIp65504D91TrxDccS();
        }
   		return ip65504D91TrxDccS;
	}
	
	/**
	 * 	Update Ip65504D91TrxDccS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D91-TRX-DCC-S
	 *	@param number
	 */
	public void setIp65504D91TrxDccS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D91TrxDccS = checkIp65504D91TrxDccSMaxLimit(number); 
		serializeIp65504D91TrxDccS(ip65504D91TrxDccS);
	}

	public void setIp65504D91TrxDccS(int number) {
	    number = checkIp65504D91TrxDccSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D91TrxDccS((short)number);
	}
	public void setIp65504D91TrxDccS(long number) {
	    number = checkIp65504D91TrxDccSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D91TrxDccS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D91TrxDccL
	 *	@return ip65504D91TrxDccL
	 */
	public short getIp65504D91TrxDccL() throws CFException {
        if (isIp65504D91TrxDccLModified()) { 
           ip65504D91TrxDccL = refreshIp65504D91TrxDccL();
        }
   		return ip65504D91TrxDccL;
	}
	
	/**
	 * 	Update Ip65504D91TrxDccL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D91-TRX-DCC-L
	 *	@param number
	 */
	public void setIp65504D91TrxDccL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D91TrxDccL = checkIp65504D91TrxDccLMaxLimit(number); 
		serializeIp65504D91TrxDccL(ip65504D91TrxDccL);
	}

	public void setIp65504D91TrxDccL(int number) {
	    number = checkIp65504D91TrxDccLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D91TrxDccL((short)number);
	}
	public void setIp65504D91TrxDccL(long number) {
	    number = checkIp65504D91TrxDccLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D91TrxDccL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D92TrxOccS
	 *	@return ip65504D92TrxOccS
	 */
	public short getIp65504D92TrxOccS() throws CFException {
        if (isIp65504D92TrxOccSModified()) { 
           ip65504D92TrxOccS = refreshIp65504D92TrxOccS();
        }
   		return ip65504D92TrxOccS;
	}
	
	/**
	 * 	Update Ip65504D92TrxOccS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D92-TRX-OCC-S
	 *	@param number
	 */
	public void setIp65504D92TrxOccS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D92TrxOccS = checkIp65504D92TrxOccSMaxLimit(number); 
		serializeIp65504D92TrxOccS(ip65504D92TrxOccS);
	}

	public void setIp65504D92TrxOccS(int number) {
	    number = checkIp65504D92TrxOccSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D92TrxOccS((short)number);
	}
	public void setIp65504D92TrxOccS(long number) {
	    number = checkIp65504D92TrxOccSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D92TrxOccS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D92TrxOccL
	 *	@return ip65504D92TrxOccL
	 */
	public short getIp65504D92TrxOccL() throws CFException {
        if (isIp65504D92TrxOccLModified()) { 
           ip65504D92TrxOccL = refreshIp65504D92TrxOccL();
        }
   		return ip65504D92TrxOccL;
	}
	
	/**
	 * 	Update Ip65504D92TrxOccL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D92-TRX-OCC-L
	 *	@param number
	 */
	public void setIp65504D92TrxOccL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D92TrxOccL = checkIp65504D92TrxOccLMaxLimit(number); 
		serializeIp65504D92TrxOccL(ip65504D92TrxOccL);
	}

	public void setIp65504D92TrxOccL(int number) {
	    number = checkIp65504D92TrxOccLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D92TrxOccL((short)number);
	}
	public void setIp65504D92TrxOccL(long number) {
	    number = checkIp65504D92TrxOccLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D92TrxOccL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D93TrxDidS
	 *	@return ip65504D93TrxDidS
	 */
	public short getIp65504D93TrxDidS() throws CFException {
        if (isIp65504D93TrxDidSModified()) { 
           ip65504D93TrxDidS = refreshIp65504D93TrxDidS();
        }
   		return ip65504D93TrxDidS;
	}
	
	/**
	 * 	Update Ip65504D93TrxDidS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D93-TRX-DID-S
	 *	@param number
	 */
	public void setIp65504D93TrxDidS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D93TrxDidS = checkIp65504D93TrxDidSMaxLimit(number); 
		serializeIp65504D93TrxDidS(ip65504D93TrxDidS);
	}

	public void setIp65504D93TrxDidS(int number) {
	    number = checkIp65504D93TrxDidSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D93TrxDidS((short)number);
	}
	public void setIp65504D93TrxDidS(long number) {
	    number = checkIp65504D93TrxDidSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D93TrxDidS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D93TrxDidL
	 *	@return ip65504D93TrxDidL
	 */
	public short getIp65504D93TrxDidL() throws CFException {
        if (isIp65504D93TrxDidLModified()) { 
           ip65504D93TrxDidL = refreshIp65504D93TrxDidL();
        }
   		return ip65504D93TrxDidL;
	}
	
	/**
	 * 	Update Ip65504D93TrxDidL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D93-TRX-DID-L
	 *	@param number
	 */
	public void setIp65504D93TrxDidL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D93TrxDidL = checkIp65504D93TrxDidLMaxLimit(number); 
		serializeIp65504D93TrxDidL(ip65504D93TrxDidL);
	}

	public void setIp65504D93TrxDidL(int number) {
	    number = checkIp65504D93TrxDidLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D93TrxDidL((short)number);
	}
	public void setIp65504D93TrxDidL(long number) {
	    number = checkIp65504D93TrxDidLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D93TrxDidL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504DeNamesLargeGroup3
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504D63TrxCycS((short)0);
         	setIp65504D63TrxCycL((short)0);
         	setIp65504D64MacCodS((short)0);
         	setIp65504D64MacCodL((short)0);
         	setIp65504D65ReservdS((short)0);
         	setIp65504D65ReservdL((short)0);
         	setIp65504D66AmtFeeS((short)0);
         	setIp65504D66AmtFeeL((short)0);
         	setIp65504D67ExtPayS((short)0);
         	setIp65504D67ExtPayL((short)0);
         	setIp65504D68RecvCcS((short)0);
         	setIp65504D68RecvCcL((short)0);
         	setIp65504D69SetlCcS((short)0);
         	setIp65504D69SetlCcL((short)0);
         	setIp65504D70AuthCcS((short)0);
         	setIp65504D70AuthCcL((short)0);
         	setIp65504D71MsgNbrS((short)0);
         	setIp65504D71MsgNbrL((short)0);
         	setIp65504D72DataRdS((short)0);
         	setIp65504D72DataRdL((short)0);
         	setIp65504D73ActDteS((short)0);
         	setIp65504D73ActDteL((short)0);
         	setIp65504D74CrNmbrS((short)0);
         	setIp65504D74CrNmbrL((short)0);
         	setIp65504D75CrRevnS((short)0);
         	setIp65504D75CrRevnL((short)0);
         	setIp65504D76DbNmbrS((short)0);
         	setIp65504D76DbNmbrL((short)0);
         	setIp65504D77DbRevnS((short)0);
         	setIp65504D77DbRevnL((short)0);
         	setIp65504D78TferNoS((short)0);
         	setIp65504D78TferNoL((short)0);
         	setIp65504D79TferRvS((short)0);
         	setIp65504D79TferRcL((short)0);
         	setIp65504D80InqNbrS((short)0);
         	setIp65504D80InqNbrL((short)0);
         	setIp65504D81AuthNoS((short)0);
         	setIp65504D81AuthNoL((short)0);
         	setIp65504D82InqRevS((short)0);
         	setIp65504D82InqRevL((short)0);
         	setIp65504D83PymtNoS((short)0);
         	setIp65504D83PymtNoL((short)0);
         	setIp65504D84PymtRvS((short)0);
         	setIp65504D84PymtRvL((short)0);
         	setIp65504D85FeeColS((short)0);
         	setIp65504D85FeeColL((short)0);
         	setIp65504D86CrAmtsS((short)0);
         	setIp65504D86CrAmtsL((short)0);
         	setIp65504D87CrRevrS((short)0);
         	setIp65504D87CrRevrL((short)0);
         	setIp65504D88DbAmtsS((short)0);
         	setIp65504D88DbAmtsL((short)0);
         	setIp65504D89DbRevrS((short)0);
         	setIp65504D89DbRevrL((short)0);
         	setIp65504D90AuthRvS((short)0);
         	setIp65504D90AuthRvL((short)0);
         	setIp65504D91TrxDccS((short)0);
         	setIp65504D91TrxDccL((short)0);
         	setIp65504D92TrxOccS((short)0);
         	setIp65504D92TrxOccL((short)0);
         	setIp65504D93TrxDidS((short)0);
         	setIp65504D93TrxDidL((short)0);
   }

		public static int getIp65504DeNamesLargeGroup3FieldLength() {
			return IP_65504_DE_NAMES_LARGE_GROUP_3_LENGTH;
		}

}
  
