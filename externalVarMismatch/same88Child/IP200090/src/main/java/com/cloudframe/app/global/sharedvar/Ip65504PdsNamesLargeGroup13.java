package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup13 extends Ip65504PdsNamesLargeGroup13Serialized { 
   

								private short ip65504P373RecIdxS;

								private short ip65504P373RecIdxL;


								private short ip65504P374RecPcdS;

								private short ip65504P374RecPcdL;


								private short ip65504P375Mbrind1S;

								private short ip65504P375Mbrind1L;


								private short ip65504P376Mbrind2S;

								private short ip65504P376Mbrind2L;


								private short ip65504P377ReservdS;

								private short ip65504P377ReservdL;


								private short ip65504P378ComTtlS;

								private short ip65504P378ComTtlL;


								private short ip65504P379ReservdS;

								private short ip65504P379ReservdL;


								private short ip65504P380DbtxamtS;

								private short ip65504P380DbtxamtL;


								private short ip65504P381CrtxamtS;

								private short ip65504P381CrtxamtL;


								private short ip65504P382DbFeesS;

								private short ip65504P382DbFeesL;


								private short ip65504P383CrFeesS;

								private short ip65504P383CrFeesL;


								private short ip65504P384TrxAmtS;

								private short ip65504P384TrxAmtL;


								private short ip65504P385TrxFeeS;

								private short ip65504P385TrxFeeL;


								private short ip65504P386NetAmtS;

								private short ip65504P386NetAmtL;


								private short ip65504P387ReservdS;

								private short ip65504P387ReservdL;


								private short ip65504P388ReservdS;

								private short ip65504P388ReservdL;


								private short ip65504P389ReservdS;

								private short ip65504P389ReservdL;


								private short ip65504P390DbtxamtS;

								private short ip65504P390DbtxamtL;


								private short ip65504P391CrtxamtS;

								private short ip65504P391CrtxamtL;


								private short ip65504P392DbtxfeeS;

								private short ip65504P392DbtxfeeL;


								private short ip65504P393CrtxfeeS;

								private short ip65504P393CrtxfeeL;


								private short ip65504P394AmtNetS;

								private short ip65504P394AmtNetL;


								private short ip65504P395AmtFeeS;

								private short ip65504P395AmtFeeL;


								private short ip65504P396AmtTtlS;

								private short ip65504P396AmtTtlL;


								private short ip65504P397ReservdS;

								private short ip65504P397ReservdL;


								private short ip65504P398ReservdS;

								private short ip65504P398ReservdL;


								private short ip65504P399ReservdS;

								private short ip65504P399ReservdL;


								private short ip65504P400DbtrxnoS;

								private short ip65504P400DbtrxnoL;


								private short ip65504P401CrtrxnoS;

								private short ip65504P401CrtrxnoL;


								private short ip65504P402TrxTtlS;

								private short ip65504P402TrxTtlL;


								private short ip65504P403ReservdS;

								private short ip65504P403ReservdL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup13
	**/
    public Ip65504PdsNamesLargeGroup13() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup13. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup13(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P373RecIdxS
	 *	@return ip65504P373RecIdxS
	 */
	public short getIp65504P373RecIdxS() throws CFException {
        if (isIp65504P373RecIdxSModified()) { 
           ip65504P373RecIdxS = refreshIp65504P373RecIdxS();
        }
   		return ip65504P373RecIdxS;
	}
	
	/**
	 * 	Update Ip65504P373RecIdxS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P373-REC-IDX-S
	 *	@param number
	 */
	public void setIp65504P373RecIdxS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P373RecIdxS = checkIp65504P373RecIdxSMaxLimit(number); 
		serializeIp65504P373RecIdxS(ip65504P373RecIdxS);
	}

	public void setIp65504P373RecIdxS(int number) {
	    number = checkIp65504P373RecIdxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P373RecIdxS((short)number);
	}
	public void setIp65504P373RecIdxS(long number) {
	    number = checkIp65504P373RecIdxSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P373RecIdxS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P373RecIdxL
	 *	@return ip65504P373RecIdxL
	 */
	public short getIp65504P373RecIdxL() throws CFException {
        if (isIp65504P373RecIdxLModified()) { 
           ip65504P373RecIdxL = refreshIp65504P373RecIdxL();
        }
   		return ip65504P373RecIdxL;
	}
	
	/**
	 * 	Update Ip65504P373RecIdxL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P373-REC-IDX-L
	 *	@param number
	 */
	public void setIp65504P373RecIdxL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P373RecIdxL = checkIp65504P373RecIdxLMaxLimit(number); 
		serializeIp65504P373RecIdxL(ip65504P373RecIdxL);
	}

	public void setIp65504P373RecIdxL(int number) {
	    number = checkIp65504P373RecIdxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P373RecIdxL((short)number);
	}
	public void setIp65504P373RecIdxL(long number) {
	    number = checkIp65504P373RecIdxLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P373RecIdxL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P374RecPcdS
	 *	@return ip65504P374RecPcdS
	 */
	public short getIp65504P374RecPcdS() throws CFException {
        if (isIp65504P374RecPcdSModified()) { 
           ip65504P374RecPcdS = refreshIp65504P374RecPcdS();
        }
   		return ip65504P374RecPcdS;
	}
	
	/**
	 * 	Update Ip65504P374RecPcdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P374-REC-PCD-S
	 *	@param number
	 */
	public void setIp65504P374RecPcdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P374RecPcdS = checkIp65504P374RecPcdSMaxLimit(number); 
		serializeIp65504P374RecPcdS(ip65504P374RecPcdS);
	}

	public void setIp65504P374RecPcdS(int number) {
	    number = checkIp65504P374RecPcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P374RecPcdS((short)number);
	}
	public void setIp65504P374RecPcdS(long number) {
	    number = checkIp65504P374RecPcdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P374RecPcdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P374RecPcdL
	 *	@return ip65504P374RecPcdL
	 */
	public short getIp65504P374RecPcdL() throws CFException {
        if (isIp65504P374RecPcdLModified()) { 
           ip65504P374RecPcdL = refreshIp65504P374RecPcdL();
        }
   		return ip65504P374RecPcdL;
	}
	
	/**
	 * 	Update Ip65504P374RecPcdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P374-REC-PCD-L
	 *	@param number
	 */
	public void setIp65504P374RecPcdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P374RecPcdL = checkIp65504P374RecPcdLMaxLimit(number); 
		serializeIp65504P374RecPcdL(ip65504P374RecPcdL);
	}

	public void setIp65504P374RecPcdL(int number) {
	    number = checkIp65504P374RecPcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P374RecPcdL((short)number);
	}
	public void setIp65504P374RecPcdL(long number) {
	    number = checkIp65504P374RecPcdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P374RecPcdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P375Mbrind1S
	 *	@return ip65504P375Mbrind1S
	 */
	public short getIp65504P375Mbrind1S() throws CFException {
        if (isIp65504P375Mbrind1SModified()) { 
           ip65504P375Mbrind1S = refreshIp65504P375Mbrind1S();
        }
   		return ip65504P375Mbrind1S;
	}
	
	/**
	 * 	Update Ip65504P375Mbrind1S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P375-MBRIND1-S
	 *	@param number
	 */
	public void setIp65504P375Mbrind1S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P375Mbrind1S = checkIp65504P375Mbrind1SMaxLimit(number); 
		serializeIp65504P375Mbrind1S(ip65504P375Mbrind1S);
	}

	public void setIp65504P375Mbrind1S(int number) {
	    number = checkIp65504P375Mbrind1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P375Mbrind1S((short)number);
	}
	public void setIp65504P375Mbrind1S(long number) {
	    number = checkIp65504P375Mbrind1SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P375Mbrind1S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P375Mbrind1L
	 *	@return ip65504P375Mbrind1L
	 */
	public short getIp65504P375Mbrind1L() throws CFException {
        if (isIp65504P375Mbrind1LModified()) { 
           ip65504P375Mbrind1L = refreshIp65504P375Mbrind1L();
        }
   		return ip65504P375Mbrind1L;
	}
	
	/**
	 * 	Update Ip65504P375Mbrind1L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P375-MBRIND1-L
	 *	@param number
	 */
	public void setIp65504P375Mbrind1L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P375Mbrind1L = checkIp65504P375Mbrind1LMaxLimit(number); 
		serializeIp65504P375Mbrind1L(ip65504P375Mbrind1L);
	}

	public void setIp65504P375Mbrind1L(int number) {
	    number = checkIp65504P375Mbrind1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P375Mbrind1L((short)number);
	}
	public void setIp65504P375Mbrind1L(long number) {
	    number = checkIp65504P375Mbrind1LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P375Mbrind1L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P376Mbrind2S
	 *	@return ip65504P376Mbrind2S
	 */
	public short getIp65504P376Mbrind2S() throws CFException {
        if (isIp65504P376Mbrind2SModified()) { 
           ip65504P376Mbrind2S = refreshIp65504P376Mbrind2S();
        }
   		return ip65504P376Mbrind2S;
	}
	
	/**
	 * 	Update Ip65504P376Mbrind2S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P376-MBRIND2-S
	 *	@param number
	 */
	public void setIp65504P376Mbrind2S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P376Mbrind2S = checkIp65504P376Mbrind2SMaxLimit(number); 
		serializeIp65504P376Mbrind2S(ip65504P376Mbrind2S);
	}

	public void setIp65504P376Mbrind2S(int number) {
	    number = checkIp65504P376Mbrind2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P376Mbrind2S((short)number);
	}
	public void setIp65504P376Mbrind2S(long number) {
	    number = checkIp65504P376Mbrind2SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P376Mbrind2S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P376Mbrind2L
	 *	@return ip65504P376Mbrind2L
	 */
	public short getIp65504P376Mbrind2L() throws CFException {
        if (isIp65504P376Mbrind2LModified()) { 
           ip65504P376Mbrind2L = refreshIp65504P376Mbrind2L();
        }
   		return ip65504P376Mbrind2L;
	}
	
	/**
	 * 	Update Ip65504P376Mbrind2L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P376-MBRIND2-L
	 *	@param number
	 */
	public void setIp65504P376Mbrind2L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P376Mbrind2L = checkIp65504P376Mbrind2LMaxLimit(number); 
		serializeIp65504P376Mbrind2L(ip65504P376Mbrind2L);
	}

	public void setIp65504P376Mbrind2L(int number) {
	    number = checkIp65504P376Mbrind2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P376Mbrind2L((short)number);
	}
	public void setIp65504P376Mbrind2L(long number) {
	    number = checkIp65504P376Mbrind2LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P376Mbrind2L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P377ReservdS
	 *	@return ip65504P377ReservdS
	 */
	public short getIp65504P377ReservdS() throws CFException {
        if (isIp65504P377ReservdSModified()) { 
           ip65504P377ReservdS = refreshIp65504P377ReservdS();
        }
   		return ip65504P377ReservdS;
	}
	
	/**
	 * 	Update Ip65504P377ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P377-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P377ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P377ReservdS = checkIp65504P377ReservdSMaxLimit(number); 
		serializeIp65504P377ReservdS(ip65504P377ReservdS);
	}

	public void setIp65504P377ReservdS(int number) {
	    number = checkIp65504P377ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P377ReservdS((short)number);
	}
	public void setIp65504P377ReservdS(long number) {
	    number = checkIp65504P377ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P377ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P377ReservdL
	 *	@return ip65504P377ReservdL
	 */
	public short getIp65504P377ReservdL() throws CFException {
        if (isIp65504P377ReservdLModified()) { 
           ip65504P377ReservdL = refreshIp65504P377ReservdL();
        }
   		return ip65504P377ReservdL;
	}
	
	/**
	 * 	Update Ip65504P377ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P377-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P377ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P377ReservdL = checkIp65504P377ReservdLMaxLimit(number); 
		serializeIp65504P377ReservdL(ip65504P377ReservdL);
	}

	public void setIp65504P377ReservdL(int number) {
	    number = checkIp65504P377ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P377ReservdL((short)number);
	}
	public void setIp65504P377ReservdL(long number) {
	    number = checkIp65504P377ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P377ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P378ComTtlS
	 *	@return ip65504P378ComTtlS
	 */
	public short getIp65504P378ComTtlS() throws CFException {
        if (isIp65504P378ComTtlSModified()) { 
           ip65504P378ComTtlS = refreshIp65504P378ComTtlS();
        }
   		return ip65504P378ComTtlS;
	}
	
	/**
	 * 	Update Ip65504P378ComTtlS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P378-COM-TTL-S
	 *	@param number
	 */
	public void setIp65504P378ComTtlS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P378ComTtlS = checkIp65504P378ComTtlSMaxLimit(number); 
		serializeIp65504P378ComTtlS(ip65504P378ComTtlS);
	}

	public void setIp65504P378ComTtlS(int number) {
	    number = checkIp65504P378ComTtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P378ComTtlS((short)number);
	}
	public void setIp65504P378ComTtlS(long number) {
	    number = checkIp65504P378ComTtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P378ComTtlS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P378ComTtlL
	 *	@return ip65504P378ComTtlL
	 */
	public short getIp65504P378ComTtlL() throws CFException {
        if (isIp65504P378ComTtlLModified()) { 
           ip65504P378ComTtlL = refreshIp65504P378ComTtlL();
        }
   		return ip65504P378ComTtlL;
	}
	
	/**
	 * 	Update Ip65504P378ComTtlL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P378-COM-TTL-L
	 *	@param number
	 */
	public void setIp65504P378ComTtlL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P378ComTtlL = checkIp65504P378ComTtlLMaxLimit(number); 
		serializeIp65504P378ComTtlL(ip65504P378ComTtlL);
	}

	public void setIp65504P378ComTtlL(int number) {
	    number = checkIp65504P378ComTtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P378ComTtlL((short)number);
	}
	public void setIp65504P378ComTtlL(long number) {
	    number = checkIp65504P378ComTtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P378ComTtlL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P379ReservdS
	 *	@return ip65504P379ReservdS
	 */
	public short getIp65504P379ReservdS() throws CFException {
        if (isIp65504P379ReservdSModified()) { 
           ip65504P379ReservdS = refreshIp65504P379ReservdS();
        }
   		return ip65504P379ReservdS;
	}
	
	/**
	 * 	Update Ip65504P379ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P379-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P379ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P379ReservdS = checkIp65504P379ReservdSMaxLimit(number); 
		serializeIp65504P379ReservdS(ip65504P379ReservdS);
	}

	public void setIp65504P379ReservdS(int number) {
	    number = checkIp65504P379ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P379ReservdS((short)number);
	}
	public void setIp65504P379ReservdS(long number) {
	    number = checkIp65504P379ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P379ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P379ReservdL
	 *	@return ip65504P379ReservdL
	 */
	public short getIp65504P379ReservdL() throws CFException {
        if (isIp65504P379ReservdLModified()) { 
           ip65504P379ReservdL = refreshIp65504P379ReservdL();
        }
   		return ip65504P379ReservdL;
	}
	
	/**
	 * 	Update Ip65504P379ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P379-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P379ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P379ReservdL = checkIp65504P379ReservdLMaxLimit(number); 
		serializeIp65504P379ReservdL(ip65504P379ReservdL);
	}

	public void setIp65504P379ReservdL(int number) {
	    number = checkIp65504P379ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P379ReservdL((short)number);
	}
	public void setIp65504P379ReservdL(long number) {
	    number = checkIp65504P379ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P379ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P380DbtxamtS
	 *	@return ip65504P380DbtxamtS
	 */
	public short getIp65504P380DbtxamtS() throws CFException {
        if (isIp65504P380DbtxamtSModified()) { 
           ip65504P380DbtxamtS = refreshIp65504P380DbtxamtS();
        }
   		return ip65504P380DbtxamtS;
	}
	
	/**
	 * 	Update Ip65504P380DbtxamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P380-DBTXAMT-S
	 *	@param number
	 */
	public void setIp65504P380DbtxamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P380DbtxamtS = checkIp65504P380DbtxamtSMaxLimit(number); 
		serializeIp65504P380DbtxamtS(ip65504P380DbtxamtS);
	}

	public void setIp65504P380DbtxamtS(int number) {
	    number = checkIp65504P380DbtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P380DbtxamtS((short)number);
	}
	public void setIp65504P380DbtxamtS(long number) {
	    number = checkIp65504P380DbtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P380DbtxamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P380DbtxamtL
	 *	@return ip65504P380DbtxamtL
	 */
	public short getIp65504P380DbtxamtL() throws CFException {
        if (isIp65504P380DbtxamtLModified()) { 
           ip65504P380DbtxamtL = refreshIp65504P380DbtxamtL();
        }
   		return ip65504P380DbtxamtL;
	}
	
	/**
	 * 	Update Ip65504P380DbtxamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P380-DBTXAMT-L
	 *	@param number
	 */
	public void setIp65504P380DbtxamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P380DbtxamtL = checkIp65504P380DbtxamtLMaxLimit(number); 
		serializeIp65504P380DbtxamtL(ip65504P380DbtxamtL);
	}

	public void setIp65504P380DbtxamtL(int number) {
	    number = checkIp65504P380DbtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P380DbtxamtL((short)number);
	}
	public void setIp65504P380DbtxamtL(long number) {
	    number = checkIp65504P380DbtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P380DbtxamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P381CrtxamtS
	 *	@return ip65504P381CrtxamtS
	 */
	public short getIp65504P381CrtxamtS() throws CFException {
        if (isIp65504P381CrtxamtSModified()) { 
           ip65504P381CrtxamtS = refreshIp65504P381CrtxamtS();
        }
   		return ip65504P381CrtxamtS;
	}
	
	/**
	 * 	Update Ip65504P381CrtxamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P381-CRTXAMT-S
	 *	@param number
	 */
	public void setIp65504P381CrtxamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P381CrtxamtS = checkIp65504P381CrtxamtSMaxLimit(number); 
		serializeIp65504P381CrtxamtS(ip65504P381CrtxamtS);
	}

	public void setIp65504P381CrtxamtS(int number) {
	    number = checkIp65504P381CrtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P381CrtxamtS((short)number);
	}
	public void setIp65504P381CrtxamtS(long number) {
	    number = checkIp65504P381CrtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P381CrtxamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P381CrtxamtL
	 *	@return ip65504P381CrtxamtL
	 */
	public short getIp65504P381CrtxamtL() throws CFException {
        if (isIp65504P381CrtxamtLModified()) { 
           ip65504P381CrtxamtL = refreshIp65504P381CrtxamtL();
        }
   		return ip65504P381CrtxamtL;
	}
	
	/**
	 * 	Update Ip65504P381CrtxamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P381-CRTXAMT-L
	 *	@param number
	 */
	public void setIp65504P381CrtxamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P381CrtxamtL = checkIp65504P381CrtxamtLMaxLimit(number); 
		serializeIp65504P381CrtxamtL(ip65504P381CrtxamtL);
	}

	public void setIp65504P381CrtxamtL(int number) {
	    number = checkIp65504P381CrtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P381CrtxamtL((short)number);
	}
	public void setIp65504P381CrtxamtL(long number) {
	    number = checkIp65504P381CrtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P381CrtxamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P382DbFeesS
	 *	@return ip65504P382DbFeesS
	 */
	public short getIp65504P382DbFeesS() throws CFException {
        if (isIp65504P382DbFeesSModified()) { 
           ip65504P382DbFeesS = refreshIp65504P382DbFeesS();
        }
   		return ip65504P382DbFeesS;
	}
	
	/**
	 * 	Update Ip65504P382DbFeesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P382-DB-FEES-S
	 *	@param number
	 */
	public void setIp65504P382DbFeesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P382DbFeesS = checkIp65504P382DbFeesSMaxLimit(number); 
		serializeIp65504P382DbFeesS(ip65504P382DbFeesS);
	}

	public void setIp65504P382DbFeesS(int number) {
	    number = checkIp65504P382DbFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P382DbFeesS((short)number);
	}
	public void setIp65504P382DbFeesS(long number) {
	    number = checkIp65504P382DbFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P382DbFeesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P382DbFeesL
	 *	@return ip65504P382DbFeesL
	 */
	public short getIp65504P382DbFeesL() throws CFException {
        if (isIp65504P382DbFeesLModified()) { 
           ip65504P382DbFeesL = refreshIp65504P382DbFeesL();
        }
   		return ip65504P382DbFeesL;
	}
	
	/**
	 * 	Update Ip65504P382DbFeesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P382-DB-FEES-L
	 *	@param number
	 */
	public void setIp65504P382DbFeesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P382DbFeesL = checkIp65504P382DbFeesLMaxLimit(number); 
		serializeIp65504P382DbFeesL(ip65504P382DbFeesL);
	}

	public void setIp65504P382DbFeesL(int number) {
	    number = checkIp65504P382DbFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P382DbFeesL((short)number);
	}
	public void setIp65504P382DbFeesL(long number) {
	    number = checkIp65504P382DbFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P382DbFeesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P383CrFeesS
	 *	@return ip65504P383CrFeesS
	 */
	public short getIp65504P383CrFeesS() throws CFException {
        if (isIp65504P383CrFeesSModified()) { 
           ip65504P383CrFeesS = refreshIp65504P383CrFeesS();
        }
   		return ip65504P383CrFeesS;
	}
	
	/**
	 * 	Update Ip65504P383CrFeesS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P383-CR-FEES-S
	 *	@param number
	 */
	public void setIp65504P383CrFeesS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P383CrFeesS = checkIp65504P383CrFeesSMaxLimit(number); 
		serializeIp65504P383CrFeesS(ip65504P383CrFeesS);
	}

	public void setIp65504P383CrFeesS(int number) {
	    number = checkIp65504P383CrFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P383CrFeesS((short)number);
	}
	public void setIp65504P383CrFeesS(long number) {
	    number = checkIp65504P383CrFeesSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P383CrFeesS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P383CrFeesL
	 *	@return ip65504P383CrFeesL
	 */
	public short getIp65504P383CrFeesL() throws CFException {
        if (isIp65504P383CrFeesLModified()) { 
           ip65504P383CrFeesL = refreshIp65504P383CrFeesL();
        }
   		return ip65504P383CrFeesL;
	}
	
	/**
	 * 	Update Ip65504P383CrFeesL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P383-CR-FEES-L
	 *	@param number
	 */
	public void setIp65504P383CrFeesL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P383CrFeesL = checkIp65504P383CrFeesLMaxLimit(number); 
		serializeIp65504P383CrFeesL(ip65504P383CrFeesL);
	}

	public void setIp65504P383CrFeesL(int number) {
	    number = checkIp65504P383CrFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P383CrFeesL((short)number);
	}
	public void setIp65504P383CrFeesL(long number) {
	    number = checkIp65504P383CrFeesLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P383CrFeesL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P384TrxAmtS
	 *	@return ip65504P384TrxAmtS
	 */
	public short getIp65504P384TrxAmtS() throws CFException {
        if (isIp65504P384TrxAmtSModified()) { 
           ip65504P384TrxAmtS = refreshIp65504P384TrxAmtS();
        }
   		return ip65504P384TrxAmtS;
	}
	
	/**
	 * 	Update Ip65504P384TrxAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P384-TRX-AMT-S
	 *	@param number
	 */
	public void setIp65504P384TrxAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P384TrxAmtS = checkIp65504P384TrxAmtSMaxLimit(number); 
		serializeIp65504P384TrxAmtS(ip65504P384TrxAmtS);
	}

	public void setIp65504P384TrxAmtS(int number) {
	    number = checkIp65504P384TrxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P384TrxAmtS((short)number);
	}
	public void setIp65504P384TrxAmtS(long number) {
	    number = checkIp65504P384TrxAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P384TrxAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P384TrxAmtL
	 *	@return ip65504P384TrxAmtL
	 */
	public short getIp65504P384TrxAmtL() throws CFException {
        if (isIp65504P384TrxAmtLModified()) { 
           ip65504P384TrxAmtL = refreshIp65504P384TrxAmtL();
        }
   		return ip65504P384TrxAmtL;
	}
	
	/**
	 * 	Update Ip65504P384TrxAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P384-TRX-AMT-L
	 *	@param number
	 */
	public void setIp65504P384TrxAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P384TrxAmtL = checkIp65504P384TrxAmtLMaxLimit(number); 
		serializeIp65504P384TrxAmtL(ip65504P384TrxAmtL);
	}

	public void setIp65504P384TrxAmtL(int number) {
	    number = checkIp65504P384TrxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P384TrxAmtL((short)number);
	}
	public void setIp65504P384TrxAmtL(long number) {
	    number = checkIp65504P384TrxAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P384TrxAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P385TrxFeeS
	 *	@return ip65504P385TrxFeeS
	 */
	public short getIp65504P385TrxFeeS() throws CFException {
        if (isIp65504P385TrxFeeSModified()) { 
           ip65504P385TrxFeeS = refreshIp65504P385TrxFeeS();
        }
   		return ip65504P385TrxFeeS;
	}
	
	/**
	 * 	Update Ip65504P385TrxFeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P385-TRX-FEE-S
	 *	@param number
	 */
	public void setIp65504P385TrxFeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P385TrxFeeS = checkIp65504P385TrxFeeSMaxLimit(number); 
		serializeIp65504P385TrxFeeS(ip65504P385TrxFeeS);
	}

	public void setIp65504P385TrxFeeS(int number) {
	    number = checkIp65504P385TrxFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P385TrxFeeS((short)number);
	}
	public void setIp65504P385TrxFeeS(long number) {
	    number = checkIp65504P385TrxFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P385TrxFeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P385TrxFeeL
	 *	@return ip65504P385TrxFeeL
	 */
	public short getIp65504P385TrxFeeL() throws CFException {
        if (isIp65504P385TrxFeeLModified()) { 
           ip65504P385TrxFeeL = refreshIp65504P385TrxFeeL();
        }
   		return ip65504P385TrxFeeL;
	}
	
	/**
	 * 	Update Ip65504P385TrxFeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P385-TRX-FEE-L
	 *	@param number
	 */
	public void setIp65504P385TrxFeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P385TrxFeeL = checkIp65504P385TrxFeeLMaxLimit(number); 
		serializeIp65504P385TrxFeeL(ip65504P385TrxFeeL);
	}

	public void setIp65504P385TrxFeeL(int number) {
	    number = checkIp65504P385TrxFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P385TrxFeeL((short)number);
	}
	public void setIp65504P385TrxFeeL(long number) {
	    number = checkIp65504P385TrxFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P385TrxFeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P386NetAmtS
	 *	@return ip65504P386NetAmtS
	 */
	public short getIp65504P386NetAmtS() throws CFException {
        if (isIp65504P386NetAmtSModified()) { 
           ip65504P386NetAmtS = refreshIp65504P386NetAmtS();
        }
   		return ip65504P386NetAmtS;
	}
	
	/**
	 * 	Update Ip65504P386NetAmtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P386-NET-AMT-S
	 *	@param number
	 */
	public void setIp65504P386NetAmtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P386NetAmtS = checkIp65504P386NetAmtSMaxLimit(number); 
		serializeIp65504P386NetAmtS(ip65504P386NetAmtS);
	}

	public void setIp65504P386NetAmtS(int number) {
	    number = checkIp65504P386NetAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P386NetAmtS((short)number);
	}
	public void setIp65504P386NetAmtS(long number) {
	    number = checkIp65504P386NetAmtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P386NetAmtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P386NetAmtL
	 *	@return ip65504P386NetAmtL
	 */
	public short getIp65504P386NetAmtL() throws CFException {
        if (isIp65504P386NetAmtLModified()) { 
           ip65504P386NetAmtL = refreshIp65504P386NetAmtL();
        }
   		return ip65504P386NetAmtL;
	}
	
	/**
	 * 	Update Ip65504P386NetAmtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P386-NET-AMT-L
	 *	@param number
	 */
	public void setIp65504P386NetAmtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P386NetAmtL = checkIp65504P386NetAmtLMaxLimit(number); 
		serializeIp65504P386NetAmtL(ip65504P386NetAmtL);
	}

	public void setIp65504P386NetAmtL(int number) {
	    number = checkIp65504P386NetAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P386NetAmtL((short)number);
	}
	public void setIp65504P386NetAmtL(long number) {
	    number = checkIp65504P386NetAmtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P386NetAmtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P387ReservdS
	 *	@return ip65504P387ReservdS
	 */
	public short getIp65504P387ReservdS() throws CFException {
        if (isIp65504P387ReservdSModified()) { 
           ip65504P387ReservdS = refreshIp65504P387ReservdS();
        }
   		return ip65504P387ReservdS;
	}
	
	/**
	 * 	Update Ip65504P387ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P387-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P387ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P387ReservdS = checkIp65504P387ReservdSMaxLimit(number); 
		serializeIp65504P387ReservdS(ip65504P387ReservdS);
	}

	public void setIp65504P387ReservdS(int number) {
	    number = checkIp65504P387ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P387ReservdS((short)number);
	}
	public void setIp65504P387ReservdS(long number) {
	    number = checkIp65504P387ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P387ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P387ReservdL
	 *	@return ip65504P387ReservdL
	 */
	public short getIp65504P387ReservdL() throws CFException {
        if (isIp65504P387ReservdLModified()) { 
           ip65504P387ReservdL = refreshIp65504P387ReservdL();
        }
   		return ip65504P387ReservdL;
	}
	
	/**
	 * 	Update Ip65504P387ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P387-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P387ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P387ReservdL = checkIp65504P387ReservdLMaxLimit(number); 
		serializeIp65504P387ReservdL(ip65504P387ReservdL);
	}

	public void setIp65504P387ReservdL(int number) {
	    number = checkIp65504P387ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P387ReservdL((short)number);
	}
	public void setIp65504P387ReservdL(long number) {
	    number = checkIp65504P387ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P387ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P388ReservdS
	 *	@return ip65504P388ReservdS
	 */
	public short getIp65504P388ReservdS() throws CFException {
        if (isIp65504P388ReservdSModified()) { 
           ip65504P388ReservdS = refreshIp65504P388ReservdS();
        }
   		return ip65504P388ReservdS;
	}
	
	/**
	 * 	Update Ip65504P388ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P388-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P388ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P388ReservdS = checkIp65504P388ReservdSMaxLimit(number); 
		serializeIp65504P388ReservdS(ip65504P388ReservdS);
	}

	public void setIp65504P388ReservdS(int number) {
	    number = checkIp65504P388ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P388ReservdS((short)number);
	}
	public void setIp65504P388ReservdS(long number) {
	    number = checkIp65504P388ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P388ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P388ReservdL
	 *	@return ip65504P388ReservdL
	 */
	public short getIp65504P388ReservdL() throws CFException {
        if (isIp65504P388ReservdLModified()) { 
           ip65504P388ReservdL = refreshIp65504P388ReservdL();
        }
   		return ip65504P388ReservdL;
	}
	
	/**
	 * 	Update Ip65504P388ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P388-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P388ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P388ReservdL = checkIp65504P388ReservdLMaxLimit(number); 
		serializeIp65504P388ReservdL(ip65504P388ReservdL);
	}

	public void setIp65504P388ReservdL(int number) {
	    number = checkIp65504P388ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P388ReservdL((short)number);
	}
	public void setIp65504P388ReservdL(long number) {
	    number = checkIp65504P388ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P388ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P389ReservdS
	 *	@return ip65504P389ReservdS
	 */
	public short getIp65504P389ReservdS() throws CFException {
        if (isIp65504P389ReservdSModified()) { 
           ip65504P389ReservdS = refreshIp65504P389ReservdS();
        }
   		return ip65504P389ReservdS;
	}
	
	/**
	 * 	Update Ip65504P389ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P389-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P389ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P389ReservdS = checkIp65504P389ReservdSMaxLimit(number); 
		serializeIp65504P389ReservdS(ip65504P389ReservdS);
	}

	public void setIp65504P389ReservdS(int number) {
	    number = checkIp65504P389ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P389ReservdS((short)number);
	}
	public void setIp65504P389ReservdS(long number) {
	    number = checkIp65504P389ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P389ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P389ReservdL
	 *	@return ip65504P389ReservdL
	 */
	public short getIp65504P389ReservdL() throws CFException {
        if (isIp65504P389ReservdLModified()) { 
           ip65504P389ReservdL = refreshIp65504P389ReservdL();
        }
   		return ip65504P389ReservdL;
	}
	
	/**
	 * 	Update Ip65504P389ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P389-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P389ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P389ReservdL = checkIp65504P389ReservdLMaxLimit(number); 
		serializeIp65504P389ReservdL(ip65504P389ReservdL);
	}

	public void setIp65504P389ReservdL(int number) {
	    number = checkIp65504P389ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P389ReservdL((short)number);
	}
	public void setIp65504P389ReservdL(long number) {
	    number = checkIp65504P389ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P389ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P390DbtxamtS
	 *	@return ip65504P390DbtxamtS
	 */
	public short getIp65504P390DbtxamtS() throws CFException {
        if (isIp65504P390DbtxamtSModified()) { 
           ip65504P390DbtxamtS = refreshIp65504P390DbtxamtS();
        }
   		return ip65504P390DbtxamtS;
	}
	
	/**
	 * 	Update Ip65504P390DbtxamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P390-DBTXAMT-S
	 *	@param number
	 */
	public void setIp65504P390DbtxamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P390DbtxamtS = checkIp65504P390DbtxamtSMaxLimit(number); 
		serializeIp65504P390DbtxamtS(ip65504P390DbtxamtS);
	}

	public void setIp65504P390DbtxamtS(int number) {
	    number = checkIp65504P390DbtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P390DbtxamtS((short)number);
	}
	public void setIp65504P390DbtxamtS(long number) {
	    number = checkIp65504P390DbtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P390DbtxamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P390DbtxamtL
	 *	@return ip65504P390DbtxamtL
	 */
	public short getIp65504P390DbtxamtL() throws CFException {
        if (isIp65504P390DbtxamtLModified()) { 
           ip65504P390DbtxamtL = refreshIp65504P390DbtxamtL();
        }
   		return ip65504P390DbtxamtL;
	}
	
	/**
	 * 	Update Ip65504P390DbtxamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P390-DBTXAMT-L
	 *	@param number
	 */
	public void setIp65504P390DbtxamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P390DbtxamtL = checkIp65504P390DbtxamtLMaxLimit(number); 
		serializeIp65504P390DbtxamtL(ip65504P390DbtxamtL);
	}

	public void setIp65504P390DbtxamtL(int number) {
	    number = checkIp65504P390DbtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P390DbtxamtL((short)number);
	}
	public void setIp65504P390DbtxamtL(long number) {
	    number = checkIp65504P390DbtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P390DbtxamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P391CrtxamtS
	 *	@return ip65504P391CrtxamtS
	 */
	public short getIp65504P391CrtxamtS() throws CFException {
        if (isIp65504P391CrtxamtSModified()) { 
           ip65504P391CrtxamtS = refreshIp65504P391CrtxamtS();
        }
   		return ip65504P391CrtxamtS;
	}
	
	/**
	 * 	Update Ip65504P391CrtxamtS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P391-CRTXAMT-S
	 *	@param number
	 */
	public void setIp65504P391CrtxamtS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P391CrtxamtS = checkIp65504P391CrtxamtSMaxLimit(number); 
		serializeIp65504P391CrtxamtS(ip65504P391CrtxamtS);
	}

	public void setIp65504P391CrtxamtS(int number) {
	    number = checkIp65504P391CrtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P391CrtxamtS((short)number);
	}
	public void setIp65504P391CrtxamtS(long number) {
	    number = checkIp65504P391CrtxamtSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P391CrtxamtS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P391CrtxamtL
	 *	@return ip65504P391CrtxamtL
	 */
	public short getIp65504P391CrtxamtL() throws CFException {
        if (isIp65504P391CrtxamtLModified()) { 
           ip65504P391CrtxamtL = refreshIp65504P391CrtxamtL();
        }
   		return ip65504P391CrtxamtL;
	}
	
	/**
	 * 	Update Ip65504P391CrtxamtL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P391-CRTXAMT-L
	 *	@param number
	 */
	public void setIp65504P391CrtxamtL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P391CrtxamtL = checkIp65504P391CrtxamtLMaxLimit(number); 
		serializeIp65504P391CrtxamtL(ip65504P391CrtxamtL);
	}

	public void setIp65504P391CrtxamtL(int number) {
	    number = checkIp65504P391CrtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P391CrtxamtL((short)number);
	}
	public void setIp65504P391CrtxamtL(long number) {
	    number = checkIp65504P391CrtxamtLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P391CrtxamtL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P392DbtxfeeS
	 *	@return ip65504P392DbtxfeeS
	 */
	public short getIp65504P392DbtxfeeS() throws CFException {
        if (isIp65504P392DbtxfeeSModified()) { 
           ip65504P392DbtxfeeS = refreshIp65504P392DbtxfeeS();
        }
   		return ip65504P392DbtxfeeS;
	}
	
	/**
	 * 	Update Ip65504P392DbtxfeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P392-DBTXFEE-S
	 *	@param number
	 */
	public void setIp65504P392DbtxfeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P392DbtxfeeS = checkIp65504P392DbtxfeeSMaxLimit(number); 
		serializeIp65504P392DbtxfeeS(ip65504P392DbtxfeeS);
	}

	public void setIp65504P392DbtxfeeS(int number) {
	    number = checkIp65504P392DbtxfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P392DbtxfeeS((short)number);
	}
	public void setIp65504P392DbtxfeeS(long number) {
	    number = checkIp65504P392DbtxfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P392DbtxfeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P392DbtxfeeL
	 *	@return ip65504P392DbtxfeeL
	 */
	public short getIp65504P392DbtxfeeL() throws CFException {
        if (isIp65504P392DbtxfeeLModified()) { 
           ip65504P392DbtxfeeL = refreshIp65504P392DbtxfeeL();
        }
   		return ip65504P392DbtxfeeL;
	}
	
	/**
	 * 	Update Ip65504P392DbtxfeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P392-DBTXFEE-L
	 *	@param number
	 */
	public void setIp65504P392DbtxfeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P392DbtxfeeL = checkIp65504P392DbtxfeeLMaxLimit(number); 
		serializeIp65504P392DbtxfeeL(ip65504P392DbtxfeeL);
	}

	public void setIp65504P392DbtxfeeL(int number) {
	    number = checkIp65504P392DbtxfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P392DbtxfeeL((short)number);
	}
	public void setIp65504P392DbtxfeeL(long number) {
	    number = checkIp65504P392DbtxfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P392DbtxfeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P393CrtxfeeS
	 *	@return ip65504P393CrtxfeeS
	 */
	public short getIp65504P393CrtxfeeS() throws CFException {
        if (isIp65504P393CrtxfeeSModified()) { 
           ip65504P393CrtxfeeS = refreshIp65504P393CrtxfeeS();
        }
   		return ip65504P393CrtxfeeS;
	}
	
	/**
	 * 	Update Ip65504P393CrtxfeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P393-CRTXFEE-S
	 *	@param number
	 */
	public void setIp65504P393CrtxfeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P393CrtxfeeS = checkIp65504P393CrtxfeeSMaxLimit(number); 
		serializeIp65504P393CrtxfeeS(ip65504P393CrtxfeeS);
	}

	public void setIp65504P393CrtxfeeS(int number) {
	    number = checkIp65504P393CrtxfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P393CrtxfeeS((short)number);
	}
	public void setIp65504P393CrtxfeeS(long number) {
	    number = checkIp65504P393CrtxfeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P393CrtxfeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P393CrtxfeeL
	 *	@return ip65504P393CrtxfeeL
	 */
	public short getIp65504P393CrtxfeeL() throws CFException {
        if (isIp65504P393CrtxfeeLModified()) { 
           ip65504P393CrtxfeeL = refreshIp65504P393CrtxfeeL();
        }
   		return ip65504P393CrtxfeeL;
	}
	
	/**
	 * 	Update Ip65504P393CrtxfeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P393-CRTXFEE-L
	 *	@param number
	 */
	public void setIp65504P393CrtxfeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P393CrtxfeeL = checkIp65504P393CrtxfeeLMaxLimit(number); 
		serializeIp65504P393CrtxfeeL(ip65504P393CrtxfeeL);
	}

	public void setIp65504P393CrtxfeeL(int number) {
	    number = checkIp65504P393CrtxfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P393CrtxfeeL((short)number);
	}
	public void setIp65504P393CrtxfeeL(long number) {
	    number = checkIp65504P393CrtxfeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P393CrtxfeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P394AmtNetS
	 *	@return ip65504P394AmtNetS
	 */
	public short getIp65504P394AmtNetS() throws CFException {
        if (isIp65504P394AmtNetSModified()) { 
           ip65504P394AmtNetS = refreshIp65504P394AmtNetS();
        }
   		return ip65504P394AmtNetS;
	}
	
	/**
	 * 	Update Ip65504P394AmtNetS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P394-AMT-NET-S
	 *	@param number
	 */
	public void setIp65504P394AmtNetS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P394AmtNetS = checkIp65504P394AmtNetSMaxLimit(number); 
		serializeIp65504P394AmtNetS(ip65504P394AmtNetS);
	}

	public void setIp65504P394AmtNetS(int number) {
	    number = checkIp65504P394AmtNetSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P394AmtNetS((short)number);
	}
	public void setIp65504P394AmtNetS(long number) {
	    number = checkIp65504P394AmtNetSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P394AmtNetS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P394AmtNetL
	 *	@return ip65504P394AmtNetL
	 */
	public short getIp65504P394AmtNetL() throws CFException {
        if (isIp65504P394AmtNetLModified()) { 
           ip65504P394AmtNetL = refreshIp65504P394AmtNetL();
        }
   		return ip65504P394AmtNetL;
	}
	
	/**
	 * 	Update Ip65504P394AmtNetL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P394-AMT-NET-L
	 *	@param number
	 */
	public void setIp65504P394AmtNetL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P394AmtNetL = checkIp65504P394AmtNetLMaxLimit(number); 
		serializeIp65504P394AmtNetL(ip65504P394AmtNetL);
	}

	public void setIp65504P394AmtNetL(int number) {
	    number = checkIp65504P394AmtNetLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P394AmtNetL((short)number);
	}
	public void setIp65504P394AmtNetL(long number) {
	    number = checkIp65504P394AmtNetLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P394AmtNetL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P395AmtFeeS
	 *	@return ip65504P395AmtFeeS
	 */
	public short getIp65504P395AmtFeeS() throws CFException {
        if (isIp65504P395AmtFeeSModified()) { 
           ip65504P395AmtFeeS = refreshIp65504P395AmtFeeS();
        }
   		return ip65504P395AmtFeeS;
	}
	
	/**
	 * 	Update Ip65504P395AmtFeeS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P395-AMT-FEE-S
	 *	@param number
	 */
	public void setIp65504P395AmtFeeS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P395AmtFeeS = checkIp65504P395AmtFeeSMaxLimit(number); 
		serializeIp65504P395AmtFeeS(ip65504P395AmtFeeS);
	}

	public void setIp65504P395AmtFeeS(int number) {
	    number = checkIp65504P395AmtFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P395AmtFeeS((short)number);
	}
	public void setIp65504P395AmtFeeS(long number) {
	    number = checkIp65504P395AmtFeeSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P395AmtFeeS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P395AmtFeeL
	 *	@return ip65504P395AmtFeeL
	 */
	public short getIp65504P395AmtFeeL() throws CFException {
        if (isIp65504P395AmtFeeLModified()) { 
           ip65504P395AmtFeeL = refreshIp65504P395AmtFeeL();
        }
   		return ip65504P395AmtFeeL;
	}
	
	/**
	 * 	Update Ip65504P395AmtFeeL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P395-AMT-FEE-L
	 *	@param number
	 */
	public void setIp65504P395AmtFeeL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P395AmtFeeL = checkIp65504P395AmtFeeLMaxLimit(number); 
		serializeIp65504P395AmtFeeL(ip65504P395AmtFeeL);
	}

	public void setIp65504P395AmtFeeL(int number) {
	    number = checkIp65504P395AmtFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P395AmtFeeL((short)number);
	}
	public void setIp65504P395AmtFeeL(long number) {
	    number = checkIp65504P395AmtFeeLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P395AmtFeeL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P396AmtTtlS
	 *	@return ip65504P396AmtTtlS
	 */
	public short getIp65504P396AmtTtlS() throws CFException {
        if (isIp65504P396AmtTtlSModified()) { 
           ip65504P396AmtTtlS = refreshIp65504P396AmtTtlS();
        }
   		return ip65504P396AmtTtlS;
	}
	
	/**
	 * 	Update Ip65504P396AmtTtlS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P396-AMT-TTL-S
	 *	@param number
	 */
	public void setIp65504P396AmtTtlS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P396AmtTtlS = checkIp65504P396AmtTtlSMaxLimit(number); 
		serializeIp65504P396AmtTtlS(ip65504P396AmtTtlS);
	}

	public void setIp65504P396AmtTtlS(int number) {
	    number = checkIp65504P396AmtTtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P396AmtTtlS((short)number);
	}
	public void setIp65504P396AmtTtlS(long number) {
	    number = checkIp65504P396AmtTtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P396AmtTtlS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P396AmtTtlL
	 *	@return ip65504P396AmtTtlL
	 */
	public short getIp65504P396AmtTtlL() throws CFException {
        if (isIp65504P396AmtTtlLModified()) { 
           ip65504P396AmtTtlL = refreshIp65504P396AmtTtlL();
        }
   		return ip65504P396AmtTtlL;
	}
	
	/**
	 * 	Update Ip65504P396AmtTtlL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P396-AMT-TTL-L
	 *	@param number
	 */
	public void setIp65504P396AmtTtlL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P396AmtTtlL = checkIp65504P396AmtTtlLMaxLimit(number); 
		serializeIp65504P396AmtTtlL(ip65504P396AmtTtlL);
	}

	public void setIp65504P396AmtTtlL(int number) {
	    number = checkIp65504P396AmtTtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P396AmtTtlL((short)number);
	}
	public void setIp65504P396AmtTtlL(long number) {
	    number = checkIp65504P396AmtTtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P396AmtTtlL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P397ReservdS
	 *	@return ip65504P397ReservdS
	 */
	public short getIp65504P397ReservdS() throws CFException {
        if (isIp65504P397ReservdSModified()) { 
           ip65504P397ReservdS = refreshIp65504P397ReservdS();
        }
   		return ip65504P397ReservdS;
	}
	
	/**
	 * 	Update Ip65504P397ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P397-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P397ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P397ReservdS = checkIp65504P397ReservdSMaxLimit(number); 
		serializeIp65504P397ReservdS(ip65504P397ReservdS);
	}

	public void setIp65504P397ReservdS(int number) {
	    number = checkIp65504P397ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P397ReservdS((short)number);
	}
	public void setIp65504P397ReservdS(long number) {
	    number = checkIp65504P397ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P397ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P397ReservdL
	 *	@return ip65504P397ReservdL
	 */
	public short getIp65504P397ReservdL() throws CFException {
        if (isIp65504P397ReservdLModified()) { 
           ip65504P397ReservdL = refreshIp65504P397ReservdL();
        }
   		return ip65504P397ReservdL;
	}
	
	/**
	 * 	Update Ip65504P397ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P397-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P397ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P397ReservdL = checkIp65504P397ReservdLMaxLimit(number); 
		serializeIp65504P397ReservdL(ip65504P397ReservdL);
	}

	public void setIp65504P397ReservdL(int number) {
	    number = checkIp65504P397ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P397ReservdL((short)number);
	}
	public void setIp65504P397ReservdL(long number) {
	    number = checkIp65504P397ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P397ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P398ReservdS
	 *	@return ip65504P398ReservdS
	 */
	public short getIp65504P398ReservdS() throws CFException {
        if (isIp65504P398ReservdSModified()) { 
           ip65504P398ReservdS = refreshIp65504P398ReservdS();
        }
   		return ip65504P398ReservdS;
	}
	
	/**
	 * 	Update Ip65504P398ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P398-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P398ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P398ReservdS = checkIp65504P398ReservdSMaxLimit(number); 
		serializeIp65504P398ReservdS(ip65504P398ReservdS);
	}

	public void setIp65504P398ReservdS(int number) {
	    number = checkIp65504P398ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P398ReservdS((short)number);
	}
	public void setIp65504P398ReservdS(long number) {
	    number = checkIp65504P398ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P398ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P398ReservdL
	 *	@return ip65504P398ReservdL
	 */
	public short getIp65504P398ReservdL() throws CFException {
        if (isIp65504P398ReservdLModified()) { 
           ip65504P398ReservdL = refreshIp65504P398ReservdL();
        }
   		return ip65504P398ReservdL;
	}
	
	/**
	 * 	Update Ip65504P398ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P398-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P398ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P398ReservdL = checkIp65504P398ReservdLMaxLimit(number); 
		serializeIp65504P398ReservdL(ip65504P398ReservdL);
	}

	public void setIp65504P398ReservdL(int number) {
	    number = checkIp65504P398ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P398ReservdL((short)number);
	}
	public void setIp65504P398ReservdL(long number) {
	    number = checkIp65504P398ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P398ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P399ReservdS
	 *	@return ip65504P399ReservdS
	 */
	public short getIp65504P399ReservdS() throws CFException {
        if (isIp65504P399ReservdSModified()) { 
           ip65504P399ReservdS = refreshIp65504P399ReservdS();
        }
   		return ip65504P399ReservdS;
	}
	
	/**
	 * 	Update Ip65504P399ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P399-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P399ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P399ReservdS = checkIp65504P399ReservdSMaxLimit(number); 
		serializeIp65504P399ReservdS(ip65504P399ReservdS);
	}

	public void setIp65504P399ReservdS(int number) {
	    number = checkIp65504P399ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P399ReservdS((short)number);
	}
	public void setIp65504P399ReservdS(long number) {
	    number = checkIp65504P399ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P399ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P399ReservdL
	 *	@return ip65504P399ReservdL
	 */
	public short getIp65504P399ReservdL() throws CFException {
        if (isIp65504P399ReservdLModified()) { 
           ip65504P399ReservdL = refreshIp65504P399ReservdL();
        }
   		return ip65504P399ReservdL;
	}
	
	/**
	 * 	Update Ip65504P399ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P399-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P399ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P399ReservdL = checkIp65504P399ReservdLMaxLimit(number); 
		serializeIp65504P399ReservdL(ip65504P399ReservdL);
	}

	public void setIp65504P399ReservdL(int number) {
	    number = checkIp65504P399ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P399ReservdL((short)number);
	}
	public void setIp65504P399ReservdL(long number) {
	    number = checkIp65504P399ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P399ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P400DbtrxnoS
	 *	@return ip65504P400DbtrxnoS
	 */
	public short getIp65504P400DbtrxnoS() throws CFException {
        if (isIp65504P400DbtrxnoSModified()) { 
           ip65504P400DbtrxnoS = refreshIp65504P400DbtrxnoS();
        }
   		return ip65504P400DbtrxnoS;
	}
	
	/**
	 * 	Update Ip65504P400DbtrxnoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P400-DBTRXNO-S
	 *	@param number
	 */
	public void setIp65504P400DbtrxnoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P400DbtrxnoS = checkIp65504P400DbtrxnoSMaxLimit(number); 
		serializeIp65504P400DbtrxnoS(ip65504P400DbtrxnoS);
	}

	public void setIp65504P400DbtrxnoS(int number) {
	    number = checkIp65504P400DbtrxnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P400DbtrxnoS((short)number);
	}
	public void setIp65504P400DbtrxnoS(long number) {
	    number = checkIp65504P400DbtrxnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P400DbtrxnoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P400DbtrxnoL
	 *	@return ip65504P400DbtrxnoL
	 */
	public short getIp65504P400DbtrxnoL() throws CFException {
        if (isIp65504P400DbtrxnoLModified()) { 
           ip65504P400DbtrxnoL = refreshIp65504P400DbtrxnoL();
        }
   		return ip65504P400DbtrxnoL;
	}
	
	/**
	 * 	Update Ip65504P400DbtrxnoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P400-DBTRXNO-L
	 *	@param number
	 */
	public void setIp65504P400DbtrxnoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P400DbtrxnoL = checkIp65504P400DbtrxnoLMaxLimit(number); 
		serializeIp65504P400DbtrxnoL(ip65504P400DbtrxnoL);
	}

	public void setIp65504P400DbtrxnoL(int number) {
	    number = checkIp65504P400DbtrxnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P400DbtrxnoL((short)number);
	}
	public void setIp65504P400DbtrxnoL(long number) {
	    number = checkIp65504P400DbtrxnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P400DbtrxnoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P401CrtrxnoS
	 *	@return ip65504P401CrtrxnoS
	 */
	public short getIp65504P401CrtrxnoS() throws CFException {
        if (isIp65504P401CrtrxnoSModified()) { 
           ip65504P401CrtrxnoS = refreshIp65504P401CrtrxnoS();
        }
   		return ip65504P401CrtrxnoS;
	}
	
	/**
	 * 	Update Ip65504P401CrtrxnoS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P401-CRTRXNO-S
	 *	@param number
	 */
	public void setIp65504P401CrtrxnoS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P401CrtrxnoS = checkIp65504P401CrtrxnoSMaxLimit(number); 
		serializeIp65504P401CrtrxnoS(ip65504P401CrtrxnoS);
	}

	public void setIp65504P401CrtrxnoS(int number) {
	    number = checkIp65504P401CrtrxnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P401CrtrxnoS((short)number);
	}
	public void setIp65504P401CrtrxnoS(long number) {
	    number = checkIp65504P401CrtrxnoSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P401CrtrxnoS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P401CrtrxnoL
	 *	@return ip65504P401CrtrxnoL
	 */
	public short getIp65504P401CrtrxnoL() throws CFException {
        if (isIp65504P401CrtrxnoLModified()) { 
           ip65504P401CrtrxnoL = refreshIp65504P401CrtrxnoL();
        }
   		return ip65504P401CrtrxnoL;
	}
	
	/**
	 * 	Update Ip65504P401CrtrxnoL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P401-CRTRXNO-L
	 *	@param number
	 */
	public void setIp65504P401CrtrxnoL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P401CrtrxnoL = checkIp65504P401CrtrxnoLMaxLimit(number); 
		serializeIp65504P401CrtrxnoL(ip65504P401CrtrxnoL);
	}

	public void setIp65504P401CrtrxnoL(int number) {
	    number = checkIp65504P401CrtrxnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P401CrtrxnoL((short)number);
	}
	public void setIp65504P401CrtrxnoL(long number) {
	    number = checkIp65504P401CrtrxnoLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P401CrtrxnoL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P402TrxTtlS
	 *	@return ip65504P402TrxTtlS
	 */
	public short getIp65504P402TrxTtlS() throws CFException {
        if (isIp65504P402TrxTtlSModified()) { 
           ip65504P402TrxTtlS = refreshIp65504P402TrxTtlS();
        }
   		return ip65504P402TrxTtlS;
	}
	
	/**
	 * 	Update Ip65504P402TrxTtlS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P402-TRX-TTL-S
	 *	@param number
	 */
	public void setIp65504P402TrxTtlS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P402TrxTtlS = checkIp65504P402TrxTtlSMaxLimit(number); 
		serializeIp65504P402TrxTtlS(ip65504P402TrxTtlS);
	}

	public void setIp65504P402TrxTtlS(int number) {
	    number = checkIp65504P402TrxTtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P402TrxTtlS((short)number);
	}
	public void setIp65504P402TrxTtlS(long number) {
	    number = checkIp65504P402TrxTtlSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P402TrxTtlS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P402TrxTtlL
	 *	@return ip65504P402TrxTtlL
	 */
	public short getIp65504P402TrxTtlL() throws CFException {
        if (isIp65504P402TrxTtlLModified()) { 
           ip65504P402TrxTtlL = refreshIp65504P402TrxTtlL();
        }
   		return ip65504P402TrxTtlL;
	}
	
	/**
	 * 	Update Ip65504P402TrxTtlL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P402-TRX-TTL-L
	 *	@param number
	 */
	public void setIp65504P402TrxTtlL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P402TrxTtlL = checkIp65504P402TrxTtlLMaxLimit(number); 
		serializeIp65504P402TrxTtlL(ip65504P402TrxTtlL);
	}

	public void setIp65504P402TrxTtlL(int number) {
	    number = checkIp65504P402TrxTtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P402TrxTtlL((short)number);
	}
	public void setIp65504P402TrxTtlL(long number) {
	    number = checkIp65504P402TrxTtlLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P402TrxTtlL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P403ReservdS
	 *	@return ip65504P403ReservdS
	 */
	public short getIp65504P403ReservdS() throws CFException {
        if (isIp65504P403ReservdSModified()) { 
           ip65504P403ReservdS = refreshIp65504P403ReservdS();
        }
   		return ip65504P403ReservdS;
	}
	
	/**
	 * 	Update Ip65504P403ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P403-RESERVD-S
	 *	@param number
	 */
	public void setIp65504P403ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P403ReservdS = checkIp65504P403ReservdSMaxLimit(number); 
		serializeIp65504P403ReservdS(ip65504P403ReservdS);
	}

	public void setIp65504P403ReservdS(int number) {
	    number = checkIp65504P403ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P403ReservdS((short)number);
	}
	public void setIp65504P403ReservdS(long number) {
	    number = checkIp65504P403ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P403ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P403ReservdL
	 *	@return ip65504P403ReservdL
	 */
	public short getIp65504P403ReservdL() throws CFException {
        if (isIp65504P403ReservdLModified()) { 
           ip65504P403ReservdL = refreshIp65504P403ReservdL();
        }
   		return ip65504P403ReservdL;
	}
	
	/**
	 * 	Update Ip65504P403ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P403-RESERVD-L
	 *	@param number
	 */
	public void setIp65504P403ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P403ReservdL = checkIp65504P403ReservdLMaxLimit(number); 
		serializeIp65504P403ReservdL(ip65504P403ReservdL);
	}

	public void setIp65504P403ReservdL(int number) {
	    number = checkIp65504P403ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P403ReservdL((short)number);
	}
	public void setIp65504P403ReservdL(long number) {
	    number = checkIp65504P403ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P403ReservdL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup13
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P373RecIdxS((short)0);
         	setIp65504P373RecIdxL((short)0);
         	setIp65504P374RecPcdS((short)0);
         	setIp65504P374RecPcdL((short)0);
         	setIp65504P375Mbrind1S((short)0);
         	setIp65504P375Mbrind1L((short)0);
         	setIp65504P376Mbrind2S((short)0);
         	setIp65504P376Mbrind2L((short)0);
         	setIp65504P377ReservdS((short)0);
         	setIp65504P377ReservdL((short)0);
         	setIp65504P378ComTtlS((short)0);
         	setIp65504P378ComTtlL((short)0);
         	setIp65504P379ReservdS((short)0);
         	setIp65504P379ReservdL((short)0);
         	setIp65504P380DbtxamtS((short)0);
         	setIp65504P380DbtxamtL((short)0);
         	setIp65504P381CrtxamtS((short)0);
         	setIp65504P381CrtxamtL((short)0);
         	setIp65504P382DbFeesS((short)0);
         	setIp65504P382DbFeesL((short)0);
         	setIp65504P383CrFeesS((short)0);
         	setIp65504P383CrFeesL((short)0);
         	setIp65504P384TrxAmtS((short)0);
         	setIp65504P384TrxAmtL((short)0);
         	setIp65504P385TrxFeeS((short)0);
         	setIp65504P385TrxFeeL((short)0);
         	setIp65504P386NetAmtS((short)0);
         	setIp65504P386NetAmtL((short)0);
         	setIp65504P387ReservdS((short)0);
         	setIp65504P387ReservdL((short)0);
         	setIp65504P388ReservdS((short)0);
         	setIp65504P388ReservdL((short)0);
         	setIp65504P389ReservdS((short)0);
         	setIp65504P389ReservdL((short)0);
         	setIp65504P390DbtxamtS((short)0);
         	setIp65504P390DbtxamtL((short)0);
         	setIp65504P391CrtxamtS((short)0);
         	setIp65504P391CrtxamtL((short)0);
         	setIp65504P392DbtxfeeS((short)0);
         	setIp65504P392DbtxfeeL((short)0);
         	setIp65504P393CrtxfeeS((short)0);
         	setIp65504P393CrtxfeeL((short)0);
         	setIp65504P394AmtNetS((short)0);
         	setIp65504P394AmtNetL((short)0);
         	setIp65504P395AmtFeeS((short)0);
         	setIp65504P395AmtFeeL((short)0);
         	setIp65504P396AmtTtlS((short)0);
         	setIp65504P396AmtTtlL((short)0);
         	setIp65504P397ReservdS((short)0);
         	setIp65504P397ReservdL((short)0);
         	setIp65504P398ReservdS((short)0);
         	setIp65504P398ReservdL((short)0);
         	setIp65504P399ReservdS((short)0);
         	setIp65504P399ReservdL((short)0);
         	setIp65504P400DbtrxnoS((short)0);
         	setIp65504P400DbtrxnoL((short)0);
         	setIp65504P401CrtrxnoS((short)0);
         	setIp65504P401CrtrxnoL((short)0);
         	setIp65504P402TrxTtlS((short)0);
         	setIp65504P402TrxTtlL((short)0);
         	setIp65504P403ReservdS((short)0);
         	setIp65504P403ReservdL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup13FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_13_LENGTH;
		}

}
  
