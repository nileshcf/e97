package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup80 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup80 extends Ip65504PdsNamesLargeGroup80Serialized { 
   

								private short ip65504P2450S;

								private short ip65504P2450L;


								private short ip65504P2451S;

								private short ip65504P2451L;


								private short ip65504P2452S;

								private short ip65504P2452L;


								private short ip65504P2453S;

								private short ip65504P2453L;


								private short ip65504P2454S;

								private short ip65504P2454L;


								private short ip65504P2455S;

								private short ip65504P2455L;


								private short ip65504P2456S;

								private short ip65504P2456L;


								private short ip65504P2457S;

								private short ip65504P2457L;


								private short ip65504P2458S;

								private short ip65504P2458L;


								private short ip65504P2459S;

								private short ip65504P2459L;


								private short ip65504P2460S;

								private short ip65504P2460L;


								private short ip65504P2461S;

								private short ip65504P2461L;


								private short ip65504P2462S;

								private short ip65504P2462L;


								private short ip65504P2463S;

								private short ip65504P2463L;


								private short ip65504P2464S;

								private short ip65504P2464L;


								private short ip65504P2465S;

								private short ip65504P2465L;


								private short ip65504P2466S;

								private short ip65504P2466L;


								private short ip65504P2467S;

								private short ip65504P2467L;


								private short ip65504P2468S;

								private short ip65504P2468L;


								private short ip65504P2469S;

								private short ip65504P2469L;


								private short ip65504P2470S;

								private short ip65504P2470L;


								private short ip65504P2471S;

								private short ip65504P2471L;


								private short ip65504P2472S;

								private short ip65504P2472L;


								private short ip65504P2473S;

								private short ip65504P2473L;


								private short ip65504P2474S;

								private short ip65504P2474L;


								private short ip65504P2475S;

								private short ip65504P2475L;


								private short ip65504P2476S;

								private short ip65504P2476L;


								private short ip65504P2477S;

								private short ip65504P2477L;


								private short ip65504P2478S;

								private short ip65504P2478L;


								private short ip65504P2479S;

								private short ip65504P2479L;


								private short ip65504P2480S;

								private short ip65504P2480L;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup80
	**/
    public Ip65504PdsNamesLargeGroup80() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup80. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup80(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P2450S
	 *	@return ip65504P2450S
	 */
	public short getIp65504P2450S() throws CFException {
        if (isIp65504P2450SModified()) { 
           ip65504P2450S = refreshIp65504P2450S();
        }
   		return ip65504P2450S;
	}
	
	/**
	 * 	Update Ip65504P2450S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2450-S
	 *	@param number
	 */
	public void setIp65504P2450S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2450S = checkIp65504P2450SMaxLimit(number); 
		serializeIp65504P2450S(ip65504P2450S);
	}

	public void setIp65504P2450S(int number) {
	    number = checkIp65504P2450SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2450S((short)number);
	}
	public void setIp65504P2450S(long number) {
	    number = checkIp65504P2450SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2450S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2450L
	 *	@return ip65504P2450L
	 */
	public short getIp65504P2450L() throws CFException {
        if (isIp65504P2450LModified()) { 
           ip65504P2450L = refreshIp65504P2450L();
        }
   		return ip65504P2450L;
	}
	
	/**
	 * 	Update Ip65504P2450L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2450-L
	 *	@param number
	 */
	public void setIp65504P2450L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2450L = checkIp65504P2450LMaxLimit(number); 
		serializeIp65504P2450L(ip65504P2450L);
	}

	public void setIp65504P2450L(int number) {
	    number = checkIp65504P2450LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2450L((short)number);
	}
	public void setIp65504P2450L(long number) {
	    number = checkIp65504P2450LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2450L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2451S
	 *	@return ip65504P2451S
	 */
	public short getIp65504P2451S() throws CFException {
        if (isIp65504P2451SModified()) { 
           ip65504P2451S = refreshIp65504P2451S();
        }
   		return ip65504P2451S;
	}
	
	/**
	 * 	Update Ip65504P2451S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2451-S
	 *	@param number
	 */
	public void setIp65504P2451S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2451S = checkIp65504P2451SMaxLimit(number); 
		serializeIp65504P2451S(ip65504P2451S);
	}

	public void setIp65504P2451S(int number) {
	    number = checkIp65504P2451SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2451S((short)number);
	}
	public void setIp65504P2451S(long number) {
	    number = checkIp65504P2451SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2451S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2451L
	 *	@return ip65504P2451L
	 */
	public short getIp65504P2451L() throws CFException {
        if (isIp65504P2451LModified()) { 
           ip65504P2451L = refreshIp65504P2451L();
        }
   		return ip65504P2451L;
	}
	
	/**
	 * 	Update Ip65504P2451L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2451-L
	 *	@param number
	 */
	public void setIp65504P2451L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2451L = checkIp65504P2451LMaxLimit(number); 
		serializeIp65504P2451L(ip65504P2451L);
	}

	public void setIp65504P2451L(int number) {
	    number = checkIp65504P2451LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2451L((short)number);
	}
	public void setIp65504P2451L(long number) {
	    number = checkIp65504P2451LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2451L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2452S
	 *	@return ip65504P2452S
	 */
	public short getIp65504P2452S() throws CFException {
        if (isIp65504P2452SModified()) { 
           ip65504P2452S = refreshIp65504P2452S();
        }
   		return ip65504P2452S;
	}
	
	/**
	 * 	Update Ip65504P2452S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2452-S
	 *	@param number
	 */
	public void setIp65504P2452S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2452S = checkIp65504P2452SMaxLimit(number); 
		serializeIp65504P2452S(ip65504P2452S);
	}

	public void setIp65504P2452S(int number) {
	    number = checkIp65504P2452SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2452S((short)number);
	}
	public void setIp65504P2452S(long number) {
	    number = checkIp65504P2452SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2452S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2452L
	 *	@return ip65504P2452L
	 */
	public short getIp65504P2452L() throws CFException {
        if (isIp65504P2452LModified()) { 
           ip65504P2452L = refreshIp65504P2452L();
        }
   		return ip65504P2452L;
	}
	
	/**
	 * 	Update Ip65504P2452L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2452-L
	 *	@param number
	 */
	public void setIp65504P2452L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2452L = checkIp65504P2452LMaxLimit(number); 
		serializeIp65504P2452L(ip65504P2452L);
	}

	public void setIp65504P2452L(int number) {
	    number = checkIp65504P2452LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2452L((short)number);
	}
	public void setIp65504P2452L(long number) {
	    number = checkIp65504P2452LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2452L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2453S
	 *	@return ip65504P2453S
	 */
	public short getIp65504P2453S() throws CFException {
        if (isIp65504P2453SModified()) { 
           ip65504P2453S = refreshIp65504P2453S();
        }
   		return ip65504P2453S;
	}
	
	/**
	 * 	Update Ip65504P2453S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2453-S
	 *	@param number
	 */
	public void setIp65504P2453S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2453S = checkIp65504P2453SMaxLimit(number); 
		serializeIp65504P2453S(ip65504P2453S);
	}

	public void setIp65504P2453S(int number) {
	    number = checkIp65504P2453SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2453S((short)number);
	}
	public void setIp65504P2453S(long number) {
	    number = checkIp65504P2453SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2453S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2453L
	 *	@return ip65504P2453L
	 */
	public short getIp65504P2453L() throws CFException {
        if (isIp65504P2453LModified()) { 
           ip65504P2453L = refreshIp65504P2453L();
        }
   		return ip65504P2453L;
	}
	
	/**
	 * 	Update Ip65504P2453L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2453-L
	 *	@param number
	 */
	public void setIp65504P2453L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2453L = checkIp65504P2453LMaxLimit(number); 
		serializeIp65504P2453L(ip65504P2453L);
	}

	public void setIp65504P2453L(int number) {
	    number = checkIp65504P2453LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2453L((short)number);
	}
	public void setIp65504P2453L(long number) {
	    number = checkIp65504P2453LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2453L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2454S
	 *	@return ip65504P2454S
	 */
	public short getIp65504P2454S() throws CFException {
        if (isIp65504P2454SModified()) { 
           ip65504P2454S = refreshIp65504P2454S();
        }
   		return ip65504P2454S;
	}
	
	/**
	 * 	Update Ip65504P2454S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2454-S
	 *	@param number
	 */
	public void setIp65504P2454S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2454S = checkIp65504P2454SMaxLimit(number); 
		serializeIp65504P2454S(ip65504P2454S);
	}

	public void setIp65504P2454S(int number) {
	    number = checkIp65504P2454SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2454S((short)number);
	}
	public void setIp65504P2454S(long number) {
	    number = checkIp65504P2454SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2454S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2454L
	 *	@return ip65504P2454L
	 */
	public short getIp65504P2454L() throws CFException {
        if (isIp65504P2454LModified()) { 
           ip65504P2454L = refreshIp65504P2454L();
        }
   		return ip65504P2454L;
	}
	
	/**
	 * 	Update Ip65504P2454L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2454-L
	 *	@param number
	 */
	public void setIp65504P2454L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2454L = checkIp65504P2454LMaxLimit(number); 
		serializeIp65504P2454L(ip65504P2454L);
	}

	public void setIp65504P2454L(int number) {
	    number = checkIp65504P2454LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2454L((short)number);
	}
	public void setIp65504P2454L(long number) {
	    number = checkIp65504P2454LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2454L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2455S
	 *	@return ip65504P2455S
	 */
	public short getIp65504P2455S() throws CFException {
        if (isIp65504P2455SModified()) { 
           ip65504P2455S = refreshIp65504P2455S();
        }
   		return ip65504P2455S;
	}
	
	/**
	 * 	Update Ip65504P2455S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2455-S
	 *	@param number
	 */
	public void setIp65504P2455S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2455S = checkIp65504P2455SMaxLimit(number); 
		serializeIp65504P2455S(ip65504P2455S);
	}

	public void setIp65504P2455S(int number) {
	    number = checkIp65504P2455SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2455S((short)number);
	}
	public void setIp65504P2455S(long number) {
	    number = checkIp65504P2455SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2455S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2455L
	 *	@return ip65504P2455L
	 */
	public short getIp65504P2455L() throws CFException {
        if (isIp65504P2455LModified()) { 
           ip65504P2455L = refreshIp65504P2455L();
        }
   		return ip65504P2455L;
	}
	
	/**
	 * 	Update Ip65504P2455L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2455-L
	 *	@param number
	 */
	public void setIp65504P2455L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2455L = checkIp65504P2455LMaxLimit(number); 
		serializeIp65504P2455L(ip65504P2455L);
	}

	public void setIp65504P2455L(int number) {
	    number = checkIp65504P2455LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2455L((short)number);
	}
	public void setIp65504P2455L(long number) {
	    number = checkIp65504P2455LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2455L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2456S
	 *	@return ip65504P2456S
	 */
	public short getIp65504P2456S() throws CFException {
        if (isIp65504P2456SModified()) { 
           ip65504P2456S = refreshIp65504P2456S();
        }
   		return ip65504P2456S;
	}
	
	/**
	 * 	Update Ip65504P2456S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2456-S
	 *	@param number
	 */
	public void setIp65504P2456S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2456S = checkIp65504P2456SMaxLimit(number); 
		serializeIp65504P2456S(ip65504P2456S);
	}

	public void setIp65504P2456S(int number) {
	    number = checkIp65504P2456SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2456S((short)number);
	}
	public void setIp65504P2456S(long number) {
	    number = checkIp65504P2456SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2456S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2456L
	 *	@return ip65504P2456L
	 */
	public short getIp65504P2456L() throws CFException {
        if (isIp65504P2456LModified()) { 
           ip65504P2456L = refreshIp65504P2456L();
        }
   		return ip65504P2456L;
	}
	
	/**
	 * 	Update Ip65504P2456L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2456-L
	 *	@param number
	 */
	public void setIp65504P2456L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2456L = checkIp65504P2456LMaxLimit(number); 
		serializeIp65504P2456L(ip65504P2456L);
	}

	public void setIp65504P2456L(int number) {
	    number = checkIp65504P2456LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2456L((short)number);
	}
	public void setIp65504P2456L(long number) {
	    number = checkIp65504P2456LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2456L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2457S
	 *	@return ip65504P2457S
	 */
	public short getIp65504P2457S() throws CFException {
        if (isIp65504P2457SModified()) { 
           ip65504P2457S = refreshIp65504P2457S();
        }
   		return ip65504P2457S;
	}
	
	/**
	 * 	Update Ip65504P2457S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2457-S
	 *	@param number
	 */
	public void setIp65504P2457S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2457S = checkIp65504P2457SMaxLimit(number); 
		serializeIp65504P2457S(ip65504P2457S);
	}

	public void setIp65504P2457S(int number) {
	    number = checkIp65504P2457SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2457S((short)number);
	}
	public void setIp65504P2457S(long number) {
	    number = checkIp65504P2457SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2457S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2457L
	 *	@return ip65504P2457L
	 */
	public short getIp65504P2457L() throws CFException {
        if (isIp65504P2457LModified()) { 
           ip65504P2457L = refreshIp65504P2457L();
        }
   		return ip65504P2457L;
	}
	
	/**
	 * 	Update Ip65504P2457L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2457-L
	 *	@param number
	 */
	public void setIp65504P2457L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2457L = checkIp65504P2457LMaxLimit(number); 
		serializeIp65504P2457L(ip65504P2457L);
	}

	public void setIp65504P2457L(int number) {
	    number = checkIp65504P2457LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2457L((short)number);
	}
	public void setIp65504P2457L(long number) {
	    number = checkIp65504P2457LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2457L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2458S
	 *	@return ip65504P2458S
	 */
	public short getIp65504P2458S() throws CFException {
        if (isIp65504P2458SModified()) { 
           ip65504P2458S = refreshIp65504P2458S();
        }
   		return ip65504P2458S;
	}
	
	/**
	 * 	Update Ip65504P2458S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2458-S
	 *	@param number
	 */
	public void setIp65504P2458S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2458S = checkIp65504P2458SMaxLimit(number); 
		serializeIp65504P2458S(ip65504P2458S);
	}

	public void setIp65504P2458S(int number) {
	    number = checkIp65504P2458SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2458S((short)number);
	}
	public void setIp65504P2458S(long number) {
	    number = checkIp65504P2458SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2458S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2458L
	 *	@return ip65504P2458L
	 */
	public short getIp65504P2458L() throws CFException {
        if (isIp65504P2458LModified()) { 
           ip65504P2458L = refreshIp65504P2458L();
        }
   		return ip65504P2458L;
	}
	
	/**
	 * 	Update Ip65504P2458L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2458-L
	 *	@param number
	 */
	public void setIp65504P2458L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2458L = checkIp65504P2458LMaxLimit(number); 
		serializeIp65504P2458L(ip65504P2458L);
	}

	public void setIp65504P2458L(int number) {
	    number = checkIp65504P2458LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2458L((short)number);
	}
	public void setIp65504P2458L(long number) {
	    number = checkIp65504P2458LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2458L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2459S
	 *	@return ip65504P2459S
	 */
	public short getIp65504P2459S() throws CFException {
        if (isIp65504P2459SModified()) { 
           ip65504P2459S = refreshIp65504P2459S();
        }
   		return ip65504P2459S;
	}
	
	/**
	 * 	Update Ip65504P2459S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2459-S
	 *	@param number
	 */
	public void setIp65504P2459S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2459S = checkIp65504P2459SMaxLimit(number); 
		serializeIp65504P2459S(ip65504P2459S);
	}

	public void setIp65504P2459S(int number) {
	    number = checkIp65504P2459SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2459S((short)number);
	}
	public void setIp65504P2459S(long number) {
	    number = checkIp65504P2459SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2459S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2459L
	 *	@return ip65504P2459L
	 */
	public short getIp65504P2459L() throws CFException {
        if (isIp65504P2459LModified()) { 
           ip65504P2459L = refreshIp65504P2459L();
        }
   		return ip65504P2459L;
	}
	
	/**
	 * 	Update Ip65504P2459L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2459-L
	 *	@param number
	 */
	public void setIp65504P2459L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2459L = checkIp65504P2459LMaxLimit(number); 
		serializeIp65504P2459L(ip65504P2459L);
	}

	public void setIp65504P2459L(int number) {
	    number = checkIp65504P2459LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2459L((short)number);
	}
	public void setIp65504P2459L(long number) {
	    number = checkIp65504P2459LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2459L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2460S
	 *	@return ip65504P2460S
	 */
	public short getIp65504P2460S() throws CFException {
        if (isIp65504P2460SModified()) { 
           ip65504P2460S = refreshIp65504P2460S();
        }
   		return ip65504P2460S;
	}
	
	/**
	 * 	Update Ip65504P2460S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2460-S
	 *	@param number
	 */
	public void setIp65504P2460S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2460S = checkIp65504P2460SMaxLimit(number); 
		serializeIp65504P2460S(ip65504P2460S);
	}

	public void setIp65504P2460S(int number) {
	    number = checkIp65504P2460SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2460S((short)number);
	}
	public void setIp65504P2460S(long number) {
	    number = checkIp65504P2460SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2460S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2460L
	 *	@return ip65504P2460L
	 */
	public short getIp65504P2460L() throws CFException {
        if (isIp65504P2460LModified()) { 
           ip65504P2460L = refreshIp65504P2460L();
        }
   		return ip65504P2460L;
	}
	
	/**
	 * 	Update Ip65504P2460L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2460-L
	 *	@param number
	 */
	public void setIp65504P2460L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2460L = checkIp65504P2460LMaxLimit(number); 
		serializeIp65504P2460L(ip65504P2460L);
	}

	public void setIp65504P2460L(int number) {
	    number = checkIp65504P2460LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2460L((short)number);
	}
	public void setIp65504P2460L(long number) {
	    number = checkIp65504P2460LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2460L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2461S
	 *	@return ip65504P2461S
	 */
	public short getIp65504P2461S() throws CFException {
        if (isIp65504P2461SModified()) { 
           ip65504P2461S = refreshIp65504P2461S();
        }
   		return ip65504P2461S;
	}
	
	/**
	 * 	Update Ip65504P2461S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2461-S
	 *	@param number
	 */
	public void setIp65504P2461S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2461S = checkIp65504P2461SMaxLimit(number); 
		serializeIp65504P2461S(ip65504P2461S);
	}

	public void setIp65504P2461S(int number) {
	    number = checkIp65504P2461SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2461S((short)number);
	}
	public void setIp65504P2461S(long number) {
	    number = checkIp65504P2461SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2461S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2461L
	 *	@return ip65504P2461L
	 */
	public short getIp65504P2461L() throws CFException {
        if (isIp65504P2461LModified()) { 
           ip65504P2461L = refreshIp65504P2461L();
        }
   		return ip65504P2461L;
	}
	
	/**
	 * 	Update Ip65504P2461L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2461-L
	 *	@param number
	 */
	public void setIp65504P2461L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2461L = checkIp65504P2461LMaxLimit(number); 
		serializeIp65504P2461L(ip65504P2461L);
	}

	public void setIp65504P2461L(int number) {
	    number = checkIp65504P2461LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2461L((short)number);
	}
	public void setIp65504P2461L(long number) {
	    number = checkIp65504P2461LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2461L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2462S
	 *	@return ip65504P2462S
	 */
	public short getIp65504P2462S() throws CFException {
        if (isIp65504P2462SModified()) { 
           ip65504P2462S = refreshIp65504P2462S();
        }
   		return ip65504P2462S;
	}
	
	/**
	 * 	Update Ip65504P2462S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2462-S
	 *	@param number
	 */
	public void setIp65504P2462S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2462S = checkIp65504P2462SMaxLimit(number); 
		serializeIp65504P2462S(ip65504P2462S);
	}

	public void setIp65504P2462S(int number) {
	    number = checkIp65504P2462SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2462S((short)number);
	}
	public void setIp65504P2462S(long number) {
	    number = checkIp65504P2462SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2462S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2462L
	 *	@return ip65504P2462L
	 */
	public short getIp65504P2462L() throws CFException {
        if (isIp65504P2462LModified()) { 
           ip65504P2462L = refreshIp65504P2462L();
        }
   		return ip65504P2462L;
	}
	
	/**
	 * 	Update Ip65504P2462L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2462-L
	 *	@param number
	 */
	public void setIp65504P2462L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2462L = checkIp65504P2462LMaxLimit(number); 
		serializeIp65504P2462L(ip65504P2462L);
	}

	public void setIp65504P2462L(int number) {
	    number = checkIp65504P2462LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2462L((short)number);
	}
	public void setIp65504P2462L(long number) {
	    number = checkIp65504P2462LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2462L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2463S
	 *	@return ip65504P2463S
	 */
	public short getIp65504P2463S() throws CFException {
        if (isIp65504P2463SModified()) { 
           ip65504P2463S = refreshIp65504P2463S();
        }
   		return ip65504P2463S;
	}
	
	/**
	 * 	Update Ip65504P2463S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2463-S
	 *	@param number
	 */
	public void setIp65504P2463S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2463S = checkIp65504P2463SMaxLimit(number); 
		serializeIp65504P2463S(ip65504P2463S);
	}

	public void setIp65504P2463S(int number) {
	    number = checkIp65504P2463SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2463S((short)number);
	}
	public void setIp65504P2463S(long number) {
	    number = checkIp65504P2463SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2463S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2463L
	 *	@return ip65504P2463L
	 */
	public short getIp65504P2463L() throws CFException {
        if (isIp65504P2463LModified()) { 
           ip65504P2463L = refreshIp65504P2463L();
        }
   		return ip65504P2463L;
	}
	
	/**
	 * 	Update Ip65504P2463L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2463-L
	 *	@param number
	 */
	public void setIp65504P2463L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2463L = checkIp65504P2463LMaxLimit(number); 
		serializeIp65504P2463L(ip65504P2463L);
	}

	public void setIp65504P2463L(int number) {
	    number = checkIp65504P2463LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2463L((short)number);
	}
	public void setIp65504P2463L(long number) {
	    number = checkIp65504P2463LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2463L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2464S
	 *	@return ip65504P2464S
	 */
	public short getIp65504P2464S() throws CFException {
        if (isIp65504P2464SModified()) { 
           ip65504P2464S = refreshIp65504P2464S();
        }
   		return ip65504P2464S;
	}
	
	/**
	 * 	Update Ip65504P2464S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2464-S
	 *	@param number
	 */
	public void setIp65504P2464S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2464S = checkIp65504P2464SMaxLimit(number); 
		serializeIp65504P2464S(ip65504P2464S);
	}

	public void setIp65504P2464S(int number) {
	    number = checkIp65504P2464SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2464S((short)number);
	}
	public void setIp65504P2464S(long number) {
	    number = checkIp65504P2464SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2464S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2464L
	 *	@return ip65504P2464L
	 */
	public short getIp65504P2464L() throws CFException {
        if (isIp65504P2464LModified()) { 
           ip65504P2464L = refreshIp65504P2464L();
        }
   		return ip65504P2464L;
	}
	
	/**
	 * 	Update Ip65504P2464L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2464-L
	 *	@param number
	 */
	public void setIp65504P2464L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2464L = checkIp65504P2464LMaxLimit(number); 
		serializeIp65504P2464L(ip65504P2464L);
	}

	public void setIp65504P2464L(int number) {
	    number = checkIp65504P2464LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2464L((short)number);
	}
	public void setIp65504P2464L(long number) {
	    number = checkIp65504P2464LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2464L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2465S
	 *	@return ip65504P2465S
	 */
	public short getIp65504P2465S() throws CFException {
        if (isIp65504P2465SModified()) { 
           ip65504P2465S = refreshIp65504P2465S();
        }
   		return ip65504P2465S;
	}
	
	/**
	 * 	Update Ip65504P2465S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2465-S
	 *	@param number
	 */
	public void setIp65504P2465S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2465S = checkIp65504P2465SMaxLimit(number); 
		serializeIp65504P2465S(ip65504P2465S);
	}

	public void setIp65504P2465S(int number) {
	    number = checkIp65504P2465SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2465S((short)number);
	}
	public void setIp65504P2465S(long number) {
	    number = checkIp65504P2465SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2465S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2465L
	 *	@return ip65504P2465L
	 */
	public short getIp65504P2465L() throws CFException {
        if (isIp65504P2465LModified()) { 
           ip65504P2465L = refreshIp65504P2465L();
        }
   		return ip65504P2465L;
	}
	
	/**
	 * 	Update Ip65504P2465L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2465-L
	 *	@param number
	 */
	public void setIp65504P2465L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2465L = checkIp65504P2465LMaxLimit(number); 
		serializeIp65504P2465L(ip65504P2465L);
	}

	public void setIp65504P2465L(int number) {
	    number = checkIp65504P2465LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2465L((short)number);
	}
	public void setIp65504P2465L(long number) {
	    number = checkIp65504P2465LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2465L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2466S
	 *	@return ip65504P2466S
	 */
	public short getIp65504P2466S() throws CFException {
        if (isIp65504P2466SModified()) { 
           ip65504P2466S = refreshIp65504P2466S();
        }
   		return ip65504P2466S;
	}
	
	/**
	 * 	Update Ip65504P2466S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2466-S
	 *	@param number
	 */
	public void setIp65504P2466S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2466S = checkIp65504P2466SMaxLimit(number); 
		serializeIp65504P2466S(ip65504P2466S);
	}

	public void setIp65504P2466S(int number) {
	    number = checkIp65504P2466SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2466S((short)number);
	}
	public void setIp65504P2466S(long number) {
	    number = checkIp65504P2466SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2466S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2466L
	 *	@return ip65504P2466L
	 */
	public short getIp65504P2466L() throws CFException {
        if (isIp65504P2466LModified()) { 
           ip65504P2466L = refreshIp65504P2466L();
        }
   		return ip65504P2466L;
	}
	
	/**
	 * 	Update Ip65504P2466L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2466-L
	 *	@param number
	 */
	public void setIp65504P2466L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2466L = checkIp65504P2466LMaxLimit(number); 
		serializeIp65504P2466L(ip65504P2466L);
	}

	public void setIp65504P2466L(int number) {
	    number = checkIp65504P2466LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2466L((short)number);
	}
	public void setIp65504P2466L(long number) {
	    number = checkIp65504P2466LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2466L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2467S
	 *	@return ip65504P2467S
	 */
	public short getIp65504P2467S() throws CFException {
        if (isIp65504P2467SModified()) { 
           ip65504P2467S = refreshIp65504P2467S();
        }
   		return ip65504P2467S;
	}
	
	/**
	 * 	Update Ip65504P2467S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2467-S
	 *	@param number
	 */
	public void setIp65504P2467S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2467S = checkIp65504P2467SMaxLimit(number); 
		serializeIp65504P2467S(ip65504P2467S);
	}

	public void setIp65504P2467S(int number) {
	    number = checkIp65504P2467SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2467S((short)number);
	}
	public void setIp65504P2467S(long number) {
	    number = checkIp65504P2467SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2467S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2467L
	 *	@return ip65504P2467L
	 */
	public short getIp65504P2467L() throws CFException {
        if (isIp65504P2467LModified()) { 
           ip65504P2467L = refreshIp65504P2467L();
        }
   		return ip65504P2467L;
	}
	
	/**
	 * 	Update Ip65504P2467L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2467-L
	 *	@param number
	 */
	public void setIp65504P2467L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2467L = checkIp65504P2467LMaxLimit(number); 
		serializeIp65504P2467L(ip65504P2467L);
	}

	public void setIp65504P2467L(int number) {
	    number = checkIp65504P2467LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2467L((short)number);
	}
	public void setIp65504P2467L(long number) {
	    number = checkIp65504P2467LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2467L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2468S
	 *	@return ip65504P2468S
	 */
	public short getIp65504P2468S() throws CFException {
        if (isIp65504P2468SModified()) { 
           ip65504P2468S = refreshIp65504P2468S();
        }
   		return ip65504P2468S;
	}
	
	/**
	 * 	Update Ip65504P2468S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2468-S
	 *	@param number
	 */
	public void setIp65504P2468S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2468S = checkIp65504P2468SMaxLimit(number); 
		serializeIp65504P2468S(ip65504P2468S);
	}

	public void setIp65504P2468S(int number) {
	    number = checkIp65504P2468SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2468S((short)number);
	}
	public void setIp65504P2468S(long number) {
	    number = checkIp65504P2468SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2468S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2468L
	 *	@return ip65504P2468L
	 */
	public short getIp65504P2468L() throws CFException {
        if (isIp65504P2468LModified()) { 
           ip65504P2468L = refreshIp65504P2468L();
        }
   		return ip65504P2468L;
	}
	
	/**
	 * 	Update Ip65504P2468L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2468-L
	 *	@param number
	 */
	public void setIp65504P2468L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2468L = checkIp65504P2468LMaxLimit(number); 
		serializeIp65504P2468L(ip65504P2468L);
	}

	public void setIp65504P2468L(int number) {
	    number = checkIp65504P2468LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2468L((short)number);
	}
	public void setIp65504P2468L(long number) {
	    number = checkIp65504P2468LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2468L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2469S
	 *	@return ip65504P2469S
	 */
	public short getIp65504P2469S() throws CFException {
        if (isIp65504P2469SModified()) { 
           ip65504P2469S = refreshIp65504P2469S();
        }
   		return ip65504P2469S;
	}
	
	/**
	 * 	Update Ip65504P2469S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2469-S
	 *	@param number
	 */
	public void setIp65504P2469S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2469S = checkIp65504P2469SMaxLimit(number); 
		serializeIp65504P2469S(ip65504P2469S);
	}

	public void setIp65504P2469S(int number) {
	    number = checkIp65504P2469SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2469S((short)number);
	}
	public void setIp65504P2469S(long number) {
	    number = checkIp65504P2469SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2469S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2469L
	 *	@return ip65504P2469L
	 */
	public short getIp65504P2469L() throws CFException {
        if (isIp65504P2469LModified()) { 
           ip65504P2469L = refreshIp65504P2469L();
        }
   		return ip65504P2469L;
	}
	
	/**
	 * 	Update Ip65504P2469L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2469-L
	 *	@param number
	 */
	public void setIp65504P2469L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2469L = checkIp65504P2469LMaxLimit(number); 
		serializeIp65504P2469L(ip65504P2469L);
	}

	public void setIp65504P2469L(int number) {
	    number = checkIp65504P2469LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2469L((short)number);
	}
	public void setIp65504P2469L(long number) {
	    number = checkIp65504P2469LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2469L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2470S
	 *	@return ip65504P2470S
	 */
	public short getIp65504P2470S() throws CFException {
        if (isIp65504P2470SModified()) { 
           ip65504P2470S = refreshIp65504P2470S();
        }
   		return ip65504P2470S;
	}
	
	/**
	 * 	Update Ip65504P2470S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2470-S
	 *	@param number
	 */
	public void setIp65504P2470S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2470S = checkIp65504P2470SMaxLimit(number); 
		serializeIp65504P2470S(ip65504P2470S);
	}

	public void setIp65504P2470S(int number) {
	    number = checkIp65504P2470SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2470S((short)number);
	}
	public void setIp65504P2470S(long number) {
	    number = checkIp65504P2470SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2470S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2470L
	 *	@return ip65504P2470L
	 */
	public short getIp65504P2470L() throws CFException {
        if (isIp65504P2470LModified()) { 
           ip65504P2470L = refreshIp65504P2470L();
        }
   		return ip65504P2470L;
	}
	
	/**
	 * 	Update Ip65504P2470L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2470-L
	 *	@param number
	 */
	public void setIp65504P2470L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2470L = checkIp65504P2470LMaxLimit(number); 
		serializeIp65504P2470L(ip65504P2470L);
	}

	public void setIp65504P2470L(int number) {
	    number = checkIp65504P2470LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2470L((short)number);
	}
	public void setIp65504P2470L(long number) {
	    number = checkIp65504P2470LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2470L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2471S
	 *	@return ip65504P2471S
	 */
	public short getIp65504P2471S() throws CFException {
        if (isIp65504P2471SModified()) { 
           ip65504P2471S = refreshIp65504P2471S();
        }
   		return ip65504P2471S;
	}
	
	/**
	 * 	Update Ip65504P2471S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2471-S
	 *	@param number
	 */
	public void setIp65504P2471S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2471S = checkIp65504P2471SMaxLimit(number); 
		serializeIp65504P2471S(ip65504P2471S);
	}

	public void setIp65504P2471S(int number) {
	    number = checkIp65504P2471SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2471S((short)number);
	}
	public void setIp65504P2471S(long number) {
	    number = checkIp65504P2471SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2471S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2471L
	 *	@return ip65504P2471L
	 */
	public short getIp65504P2471L() throws CFException {
        if (isIp65504P2471LModified()) { 
           ip65504P2471L = refreshIp65504P2471L();
        }
   		return ip65504P2471L;
	}
	
	/**
	 * 	Update Ip65504P2471L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2471-L
	 *	@param number
	 */
	public void setIp65504P2471L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2471L = checkIp65504P2471LMaxLimit(number); 
		serializeIp65504P2471L(ip65504P2471L);
	}

	public void setIp65504P2471L(int number) {
	    number = checkIp65504P2471LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2471L((short)number);
	}
	public void setIp65504P2471L(long number) {
	    number = checkIp65504P2471LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2471L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2472S
	 *	@return ip65504P2472S
	 */
	public short getIp65504P2472S() throws CFException {
        if (isIp65504P2472SModified()) { 
           ip65504P2472S = refreshIp65504P2472S();
        }
   		return ip65504P2472S;
	}
	
	/**
	 * 	Update Ip65504P2472S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2472-S
	 *	@param number
	 */
	public void setIp65504P2472S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2472S = checkIp65504P2472SMaxLimit(number); 
		serializeIp65504P2472S(ip65504P2472S);
	}

	public void setIp65504P2472S(int number) {
	    number = checkIp65504P2472SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2472S((short)number);
	}
	public void setIp65504P2472S(long number) {
	    number = checkIp65504P2472SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2472S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2472L
	 *	@return ip65504P2472L
	 */
	public short getIp65504P2472L() throws CFException {
        if (isIp65504P2472LModified()) { 
           ip65504P2472L = refreshIp65504P2472L();
        }
   		return ip65504P2472L;
	}
	
	/**
	 * 	Update Ip65504P2472L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2472-L
	 *	@param number
	 */
	public void setIp65504P2472L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2472L = checkIp65504P2472LMaxLimit(number); 
		serializeIp65504P2472L(ip65504P2472L);
	}

	public void setIp65504P2472L(int number) {
	    number = checkIp65504P2472LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2472L((short)number);
	}
	public void setIp65504P2472L(long number) {
	    number = checkIp65504P2472LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2472L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2473S
	 *	@return ip65504P2473S
	 */
	public short getIp65504P2473S() throws CFException {
        if (isIp65504P2473SModified()) { 
           ip65504P2473S = refreshIp65504P2473S();
        }
   		return ip65504P2473S;
	}
	
	/**
	 * 	Update Ip65504P2473S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2473-S
	 *	@param number
	 */
	public void setIp65504P2473S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2473S = checkIp65504P2473SMaxLimit(number); 
		serializeIp65504P2473S(ip65504P2473S);
	}

	public void setIp65504P2473S(int number) {
	    number = checkIp65504P2473SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2473S((short)number);
	}
	public void setIp65504P2473S(long number) {
	    number = checkIp65504P2473SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2473S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2473L
	 *	@return ip65504P2473L
	 */
	public short getIp65504P2473L() throws CFException {
        if (isIp65504P2473LModified()) { 
           ip65504P2473L = refreshIp65504P2473L();
        }
   		return ip65504P2473L;
	}
	
	/**
	 * 	Update Ip65504P2473L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2473-L
	 *	@param number
	 */
	public void setIp65504P2473L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2473L = checkIp65504P2473LMaxLimit(number); 
		serializeIp65504P2473L(ip65504P2473L);
	}

	public void setIp65504P2473L(int number) {
	    number = checkIp65504P2473LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2473L((short)number);
	}
	public void setIp65504P2473L(long number) {
	    number = checkIp65504P2473LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2473L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2474S
	 *	@return ip65504P2474S
	 */
	public short getIp65504P2474S() throws CFException {
        if (isIp65504P2474SModified()) { 
           ip65504P2474S = refreshIp65504P2474S();
        }
   		return ip65504P2474S;
	}
	
	/**
	 * 	Update Ip65504P2474S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2474-S
	 *	@param number
	 */
	public void setIp65504P2474S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2474S = checkIp65504P2474SMaxLimit(number); 
		serializeIp65504P2474S(ip65504P2474S);
	}

	public void setIp65504P2474S(int number) {
	    number = checkIp65504P2474SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2474S((short)number);
	}
	public void setIp65504P2474S(long number) {
	    number = checkIp65504P2474SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2474S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2474L
	 *	@return ip65504P2474L
	 */
	public short getIp65504P2474L() throws CFException {
        if (isIp65504P2474LModified()) { 
           ip65504P2474L = refreshIp65504P2474L();
        }
   		return ip65504P2474L;
	}
	
	/**
	 * 	Update Ip65504P2474L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2474-L
	 *	@param number
	 */
	public void setIp65504P2474L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2474L = checkIp65504P2474LMaxLimit(number); 
		serializeIp65504P2474L(ip65504P2474L);
	}

	public void setIp65504P2474L(int number) {
	    number = checkIp65504P2474LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2474L((short)number);
	}
	public void setIp65504P2474L(long number) {
	    number = checkIp65504P2474LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2474L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2475S
	 *	@return ip65504P2475S
	 */
	public short getIp65504P2475S() throws CFException {
        if (isIp65504P2475SModified()) { 
           ip65504P2475S = refreshIp65504P2475S();
        }
   		return ip65504P2475S;
	}
	
	/**
	 * 	Update Ip65504P2475S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2475-S
	 *	@param number
	 */
	public void setIp65504P2475S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2475S = checkIp65504P2475SMaxLimit(number); 
		serializeIp65504P2475S(ip65504P2475S);
	}

	public void setIp65504P2475S(int number) {
	    number = checkIp65504P2475SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2475S((short)number);
	}
	public void setIp65504P2475S(long number) {
	    number = checkIp65504P2475SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2475S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2475L
	 *	@return ip65504P2475L
	 */
	public short getIp65504P2475L() throws CFException {
        if (isIp65504P2475LModified()) { 
           ip65504P2475L = refreshIp65504P2475L();
        }
   		return ip65504P2475L;
	}
	
	/**
	 * 	Update Ip65504P2475L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2475-L
	 *	@param number
	 */
	public void setIp65504P2475L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2475L = checkIp65504P2475LMaxLimit(number); 
		serializeIp65504P2475L(ip65504P2475L);
	}

	public void setIp65504P2475L(int number) {
	    number = checkIp65504P2475LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2475L((short)number);
	}
	public void setIp65504P2475L(long number) {
	    number = checkIp65504P2475LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2475L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2476S
	 *	@return ip65504P2476S
	 */
	public short getIp65504P2476S() throws CFException {
        if (isIp65504P2476SModified()) { 
           ip65504P2476S = refreshIp65504P2476S();
        }
   		return ip65504P2476S;
	}
	
	/**
	 * 	Update Ip65504P2476S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2476-S
	 *	@param number
	 */
	public void setIp65504P2476S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2476S = checkIp65504P2476SMaxLimit(number); 
		serializeIp65504P2476S(ip65504P2476S);
	}

	public void setIp65504P2476S(int number) {
	    number = checkIp65504P2476SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2476S((short)number);
	}
	public void setIp65504P2476S(long number) {
	    number = checkIp65504P2476SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2476S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2476L
	 *	@return ip65504P2476L
	 */
	public short getIp65504P2476L() throws CFException {
        if (isIp65504P2476LModified()) { 
           ip65504P2476L = refreshIp65504P2476L();
        }
   		return ip65504P2476L;
	}
	
	/**
	 * 	Update Ip65504P2476L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2476-L
	 *	@param number
	 */
	public void setIp65504P2476L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2476L = checkIp65504P2476LMaxLimit(number); 
		serializeIp65504P2476L(ip65504P2476L);
	}

	public void setIp65504P2476L(int number) {
	    number = checkIp65504P2476LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2476L((short)number);
	}
	public void setIp65504P2476L(long number) {
	    number = checkIp65504P2476LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2476L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2477S
	 *	@return ip65504P2477S
	 */
	public short getIp65504P2477S() throws CFException {
        if (isIp65504P2477SModified()) { 
           ip65504P2477S = refreshIp65504P2477S();
        }
   		return ip65504P2477S;
	}
	
	/**
	 * 	Update Ip65504P2477S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2477-S
	 *	@param number
	 */
	public void setIp65504P2477S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2477S = checkIp65504P2477SMaxLimit(number); 
		serializeIp65504P2477S(ip65504P2477S);
	}

	public void setIp65504P2477S(int number) {
	    number = checkIp65504P2477SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2477S((short)number);
	}
	public void setIp65504P2477S(long number) {
	    number = checkIp65504P2477SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2477S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2477L
	 *	@return ip65504P2477L
	 */
	public short getIp65504P2477L() throws CFException {
        if (isIp65504P2477LModified()) { 
           ip65504P2477L = refreshIp65504P2477L();
        }
   		return ip65504P2477L;
	}
	
	/**
	 * 	Update Ip65504P2477L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2477-L
	 *	@param number
	 */
	public void setIp65504P2477L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2477L = checkIp65504P2477LMaxLimit(number); 
		serializeIp65504P2477L(ip65504P2477L);
	}

	public void setIp65504P2477L(int number) {
	    number = checkIp65504P2477LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2477L((short)number);
	}
	public void setIp65504P2477L(long number) {
	    number = checkIp65504P2477LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2477L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2478S
	 *	@return ip65504P2478S
	 */
	public short getIp65504P2478S() throws CFException {
        if (isIp65504P2478SModified()) { 
           ip65504P2478S = refreshIp65504P2478S();
        }
   		return ip65504P2478S;
	}
	
	/**
	 * 	Update Ip65504P2478S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2478-S
	 *	@param number
	 */
	public void setIp65504P2478S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2478S = checkIp65504P2478SMaxLimit(number); 
		serializeIp65504P2478S(ip65504P2478S);
	}

	public void setIp65504P2478S(int number) {
	    number = checkIp65504P2478SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2478S((short)number);
	}
	public void setIp65504P2478S(long number) {
	    number = checkIp65504P2478SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2478S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2478L
	 *	@return ip65504P2478L
	 */
	public short getIp65504P2478L() throws CFException {
        if (isIp65504P2478LModified()) { 
           ip65504P2478L = refreshIp65504P2478L();
        }
   		return ip65504P2478L;
	}
	
	/**
	 * 	Update Ip65504P2478L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2478-L
	 *	@param number
	 */
	public void setIp65504P2478L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2478L = checkIp65504P2478LMaxLimit(number); 
		serializeIp65504P2478L(ip65504P2478L);
	}

	public void setIp65504P2478L(int number) {
	    number = checkIp65504P2478LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2478L((short)number);
	}
	public void setIp65504P2478L(long number) {
	    number = checkIp65504P2478LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2478L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2479S
	 *	@return ip65504P2479S
	 */
	public short getIp65504P2479S() throws CFException {
        if (isIp65504P2479SModified()) { 
           ip65504P2479S = refreshIp65504P2479S();
        }
   		return ip65504P2479S;
	}
	
	/**
	 * 	Update Ip65504P2479S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2479-S
	 *	@param number
	 */
	public void setIp65504P2479S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2479S = checkIp65504P2479SMaxLimit(number); 
		serializeIp65504P2479S(ip65504P2479S);
	}

	public void setIp65504P2479S(int number) {
	    number = checkIp65504P2479SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2479S((short)number);
	}
	public void setIp65504P2479S(long number) {
	    number = checkIp65504P2479SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2479S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2479L
	 *	@return ip65504P2479L
	 */
	public short getIp65504P2479L() throws CFException {
        if (isIp65504P2479LModified()) { 
           ip65504P2479L = refreshIp65504P2479L();
        }
   		return ip65504P2479L;
	}
	
	/**
	 * 	Update Ip65504P2479L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2479-L
	 *	@param number
	 */
	public void setIp65504P2479L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2479L = checkIp65504P2479LMaxLimit(number); 
		serializeIp65504P2479L(ip65504P2479L);
	}

	public void setIp65504P2479L(int number) {
	    number = checkIp65504P2479LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2479L((short)number);
	}
	public void setIp65504P2479L(long number) {
	    number = checkIp65504P2479LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2479L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2480S
	 *	@return ip65504P2480S
	 */
	public short getIp65504P2480S() throws CFException {
        if (isIp65504P2480SModified()) { 
           ip65504P2480S = refreshIp65504P2480S();
        }
   		return ip65504P2480S;
	}
	
	/**
	 * 	Update Ip65504P2480S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2480-S
	 *	@param number
	 */
	public void setIp65504P2480S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2480S = checkIp65504P2480SMaxLimit(number); 
		serializeIp65504P2480S(ip65504P2480S);
	}

	public void setIp65504P2480S(int number) {
	    number = checkIp65504P2480SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2480S((short)number);
	}
	public void setIp65504P2480S(long number) {
	    number = checkIp65504P2480SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2480S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P2480L
	 *	@return ip65504P2480L
	 */
	public short getIp65504P2480L() throws CFException {
        if (isIp65504P2480LModified()) { 
           ip65504P2480L = refreshIp65504P2480L();
        }
   		return ip65504P2480L;
	}
	
	/**
	 * 	Update Ip65504P2480L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P2480-L
	 *	@param number
	 */
	public void setIp65504P2480L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P2480L = checkIp65504P2480LMaxLimit(number); 
		serializeIp65504P2480L(ip65504P2480L);
	}

	public void setIp65504P2480L(int number) {
	    number = checkIp65504P2480LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2480L((short)number);
	}
	public void setIp65504P2480L(long number) {
	    number = checkIp65504P2480LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P2480L((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup80
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P2450S((short)0);
         	setIp65504P2450L((short)0);
         	setIp65504P2451S((short)0);
         	setIp65504P2451L((short)0);
         	setIp65504P2452S((short)0);
         	setIp65504P2452L((short)0);
         	setIp65504P2453S((short)0);
         	setIp65504P2453L((short)0);
         	setIp65504P2454S((short)0);
         	setIp65504P2454L((short)0);
         	setIp65504P2455S((short)0);
         	setIp65504P2455L((short)0);
         	setIp65504P2456S((short)0);
         	setIp65504P2456L((short)0);
         	setIp65504P2457S((short)0);
         	setIp65504P2457L((short)0);
         	setIp65504P2458S((short)0);
         	setIp65504P2458L((short)0);
         	setIp65504P2459S((short)0);
         	setIp65504P2459L((short)0);
         	setIp65504P2460S((short)0);
         	setIp65504P2460L((short)0);
         	setIp65504P2461S((short)0);
         	setIp65504P2461L((short)0);
         	setIp65504P2462S((short)0);
         	setIp65504P2462L((short)0);
         	setIp65504P2463S((short)0);
         	setIp65504P2463L((short)0);
         	setIp65504P2464S((short)0);
         	setIp65504P2464L((short)0);
         	setIp65504P2465S((short)0);
         	setIp65504P2465L((short)0);
         	setIp65504P2466S((short)0);
         	setIp65504P2466L((short)0);
         	setIp65504P2467S((short)0);
         	setIp65504P2467L((short)0);
         	setIp65504P2468S((short)0);
         	setIp65504P2468L((short)0);
         	setIp65504P2469S((short)0);
         	setIp65504P2469L((short)0);
         	setIp65504P2470S((short)0);
         	setIp65504P2470L((short)0);
         	setIp65504P2471S((short)0);
         	setIp65504P2471L((short)0);
         	setIp65504P2472S((short)0);
         	setIp65504P2472L((short)0);
         	setIp65504P2473S((short)0);
         	setIp65504P2473L((short)0);
         	setIp65504P2474S((short)0);
         	setIp65504P2474L((short)0);
         	setIp65504P2475S((short)0);
         	setIp65504P2475L((short)0);
         	setIp65504P2476S((short)0);
         	setIp65504P2476L((short)0);
         	setIp65504P2477S((short)0);
         	setIp65504P2477L((short)0);
         	setIp65504P2478S((short)0);
         	setIp65504P2478L((short)0);
         	setIp65504P2479S((short)0);
         	setIp65504P2479L((short)0);
         	setIp65504P2480S((short)0);
         	setIp65504P2480L((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup80FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_80_LENGTH;
		}

}
  
