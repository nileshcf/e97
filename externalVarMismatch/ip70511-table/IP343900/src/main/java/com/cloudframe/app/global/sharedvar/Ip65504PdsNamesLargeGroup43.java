package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup43 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup43 extends Ip65504PdsNamesLargeGroup43Serialized { 
   

								private short ip65504P1303S;

								private short ip65504P1303L;


								private short ip65504P1304S;

								private short ip65504P1304L;


								private short ip65504P1305S;

								private short ip65504P1305L;


								private short ip65504P1306S;

								private short ip65504P1306L;


								private short ip65504P1307S;

								private short ip65504P1307L;


								private short ip65504P1308S;

								private short ip65504P1308L;


								private short ip65504P1309S;

								private short ip65504P1309L;


								private short ip65504P1310S;

								private short ip65504P1310L;


								private short ip65504P1311S;

								private short ip65504P1311L;


								private short ip65504P1312S;

								private short ip65504P1312L;


								private short ip65504P1313S;

								private short ip65504P1313L;


								private short ip65504P1314S;

								private short ip65504P1314L;


								private short ip65504P1315S;

								private short ip65504P1315L;


								private short ip65504P1316S;

								private short ip65504P1316L;


								private short ip65504P1317S;

								private short ip65504P1317L;


								private short ip65504P1318S;

								private short ip65504P1318L;


								private short ip65504P1319S;

								private short ip65504P1319L;


								private short ip65504P1320S;

								private short ip65504P1320L;


								private short ip65504P1321S;

								private short ip65504P1321L;


								private short ip65504P1322S;

								private short ip65504P1322L;


								private short ip65504P1323S;

								private short ip65504P1323L;


								private short ip65504P1324S;

								private short ip65504P1324L;


								private short ip65504P1325S;

								private short ip65504P1325L;


								private short ip65504P1326S;

								private short ip65504P1326L;


								private short ip65504P1327S;

								private short ip65504P1327L;


								private short ip65504P1328S;

								private short ip65504P1328L;


								private short ip65504P1329S;

								private short ip65504P1329L;


								private short ip65504P1330S;

								private short ip65504P1330L;


								private short ip65504P1331S;

								private short ip65504P1331L;


								private short ip65504P1332S;

								private short ip65504P1332L;


								private short ip65504P1333S;

								private short ip65504P1333L;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup43
	**/
    public Ip65504PdsNamesLargeGroup43() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup43. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup43(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P1303S
	 *	@return ip65504P1303S
	 */
	public short getIp65504P1303S() throws CFException {
        if (isIp65504P1303SModified()) { 
           ip65504P1303S = refreshIp65504P1303S();
        }
   		return ip65504P1303S;
	}
	
	/**
	 * 	Update Ip65504P1303S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1303-S
	 *	@param number
	 */
	public void setIp65504P1303S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1303S = checkIp65504P1303SMaxLimit(number); 
		serializeIp65504P1303S(ip65504P1303S);
	}

	public void setIp65504P1303S(int number) {
	    number = checkIp65504P1303SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1303S((short)number);
	}
	public void setIp65504P1303S(long number) {
	    number = checkIp65504P1303SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1303S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1303L
	 *	@return ip65504P1303L
	 */
	public short getIp65504P1303L() throws CFException {
        if (isIp65504P1303LModified()) { 
           ip65504P1303L = refreshIp65504P1303L();
        }
   		return ip65504P1303L;
	}
	
	/**
	 * 	Update Ip65504P1303L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1303-L
	 *	@param number
	 */
	public void setIp65504P1303L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1303L = checkIp65504P1303LMaxLimit(number); 
		serializeIp65504P1303L(ip65504P1303L);
	}

	public void setIp65504P1303L(int number) {
	    number = checkIp65504P1303LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1303L((short)number);
	}
	public void setIp65504P1303L(long number) {
	    number = checkIp65504P1303LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1303L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1304S
	 *	@return ip65504P1304S
	 */
	public short getIp65504P1304S() throws CFException {
        if (isIp65504P1304SModified()) { 
           ip65504P1304S = refreshIp65504P1304S();
        }
   		return ip65504P1304S;
	}
	
	/**
	 * 	Update Ip65504P1304S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1304-S
	 *	@param number
	 */
	public void setIp65504P1304S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1304S = checkIp65504P1304SMaxLimit(number); 
		serializeIp65504P1304S(ip65504P1304S);
	}

	public void setIp65504P1304S(int number) {
	    number = checkIp65504P1304SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1304S((short)number);
	}
	public void setIp65504P1304S(long number) {
	    number = checkIp65504P1304SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1304S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1304L
	 *	@return ip65504P1304L
	 */
	public short getIp65504P1304L() throws CFException {
        if (isIp65504P1304LModified()) { 
           ip65504P1304L = refreshIp65504P1304L();
        }
   		return ip65504P1304L;
	}
	
	/**
	 * 	Update Ip65504P1304L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1304-L
	 *	@param number
	 */
	public void setIp65504P1304L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1304L = checkIp65504P1304LMaxLimit(number); 
		serializeIp65504P1304L(ip65504P1304L);
	}

	public void setIp65504P1304L(int number) {
	    number = checkIp65504P1304LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1304L((short)number);
	}
	public void setIp65504P1304L(long number) {
	    number = checkIp65504P1304LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1304L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1305S
	 *	@return ip65504P1305S
	 */
	public short getIp65504P1305S() throws CFException {
        if (isIp65504P1305SModified()) { 
           ip65504P1305S = refreshIp65504P1305S();
        }
   		return ip65504P1305S;
	}
	
	/**
	 * 	Update Ip65504P1305S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1305-S
	 *	@param number
	 */
	public void setIp65504P1305S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1305S = checkIp65504P1305SMaxLimit(number); 
		serializeIp65504P1305S(ip65504P1305S);
	}

	public void setIp65504P1305S(int number) {
	    number = checkIp65504P1305SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1305S((short)number);
	}
	public void setIp65504P1305S(long number) {
	    number = checkIp65504P1305SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1305S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1305L
	 *	@return ip65504P1305L
	 */
	public short getIp65504P1305L() throws CFException {
        if (isIp65504P1305LModified()) { 
           ip65504P1305L = refreshIp65504P1305L();
        }
   		return ip65504P1305L;
	}
	
	/**
	 * 	Update Ip65504P1305L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1305-L
	 *	@param number
	 */
	public void setIp65504P1305L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1305L = checkIp65504P1305LMaxLimit(number); 
		serializeIp65504P1305L(ip65504P1305L);
	}

	public void setIp65504P1305L(int number) {
	    number = checkIp65504P1305LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1305L((short)number);
	}
	public void setIp65504P1305L(long number) {
	    number = checkIp65504P1305LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1305L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1306S
	 *	@return ip65504P1306S
	 */
	public short getIp65504P1306S() throws CFException {
        if (isIp65504P1306SModified()) { 
           ip65504P1306S = refreshIp65504P1306S();
        }
   		return ip65504P1306S;
	}
	
	/**
	 * 	Update Ip65504P1306S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1306-S
	 *	@param number
	 */
	public void setIp65504P1306S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1306S = checkIp65504P1306SMaxLimit(number); 
		serializeIp65504P1306S(ip65504P1306S);
	}

	public void setIp65504P1306S(int number) {
	    number = checkIp65504P1306SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1306S((short)number);
	}
	public void setIp65504P1306S(long number) {
	    number = checkIp65504P1306SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1306S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1306L
	 *	@return ip65504P1306L
	 */
	public short getIp65504P1306L() throws CFException {
        if (isIp65504P1306LModified()) { 
           ip65504P1306L = refreshIp65504P1306L();
        }
   		return ip65504P1306L;
	}
	
	/**
	 * 	Update Ip65504P1306L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1306-L
	 *	@param number
	 */
	public void setIp65504P1306L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1306L = checkIp65504P1306LMaxLimit(number); 
		serializeIp65504P1306L(ip65504P1306L);
	}

	public void setIp65504P1306L(int number) {
	    number = checkIp65504P1306LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1306L((short)number);
	}
	public void setIp65504P1306L(long number) {
	    number = checkIp65504P1306LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1306L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1307S
	 *	@return ip65504P1307S
	 */
	public short getIp65504P1307S() throws CFException {
        if (isIp65504P1307SModified()) { 
           ip65504P1307S = refreshIp65504P1307S();
        }
   		return ip65504P1307S;
	}
	
	/**
	 * 	Update Ip65504P1307S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1307-S
	 *	@param number
	 */
	public void setIp65504P1307S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1307S = checkIp65504P1307SMaxLimit(number); 
		serializeIp65504P1307S(ip65504P1307S);
	}

	public void setIp65504P1307S(int number) {
	    number = checkIp65504P1307SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1307S((short)number);
	}
	public void setIp65504P1307S(long number) {
	    number = checkIp65504P1307SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1307S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1307L
	 *	@return ip65504P1307L
	 */
	public short getIp65504P1307L() throws CFException {
        if (isIp65504P1307LModified()) { 
           ip65504P1307L = refreshIp65504P1307L();
        }
   		return ip65504P1307L;
	}
	
	/**
	 * 	Update Ip65504P1307L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1307-L
	 *	@param number
	 */
	public void setIp65504P1307L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1307L = checkIp65504P1307LMaxLimit(number); 
		serializeIp65504P1307L(ip65504P1307L);
	}

	public void setIp65504P1307L(int number) {
	    number = checkIp65504P1307LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1307L((short)number);
	}
	public void setIp65504P1307L(long number) {
	    number = checkIp65504P1307LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1307L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1308S
	 *	@return ip65504P1308S
	 */
	public short getIp65504P1308S() throws CFException {
        if (isIp65504P1308SModified()) { 
           ip65504P1308S = refreshIp65504P1308S();
        }
   		return ip65504P1308S;
	}
	
	/**
	 * 	Update Ip65504P1308S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1308-S
	 *	@param number
	 */
	public void setIp65504P1308S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1308S = checkIp65504P1308SMaxLimit(number); 
		serializeIp65504P1308S(ip65504P1308S);
	}

	public void setIp65504P1308S(int number) {
	    number = checkIp65504P1308SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1308S((short)number);
	}
	public void setIp65504P1308S(long number) {
	    number = checkIp65504P1308SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1308S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1308L
	 *	@return ip65504P1308L
	 */
	public short getIp65504P1308L() throws CFException {
        if (isIp65504P1308LModified()) { 
           ip65504P1308L = refreshIp65504P1308L();
        }
   		return ip65504P1308L;
	}
	
	/**
	 * 	Update Ip65504P1308L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1308-L
	 *	@param number
	 */
	public void setIp65504P1308L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1308L = checkIp65504P1308LMaxLimit(number); 
		serializeIp65504P1308L(ip65504P1308L);
	}

	public void setIp65504P1308L(int number) {
	    number = checkIp65504P1308LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1308L((short)number);
	}
	public void setIp65504P1308L(long number) {
	    number = checkIp65504P1308LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1308L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1309S
	 *	@return ip65504P1309S
	 */
	public short getIp65504P1309S() throws CFException {
        if (isIp65504P1309SModified()) { 
           ip65504P1309S = refreshIp65504P1309S();
        }
   		return ip65504P1309S;
	}
	
	/**
	 * 	Update Ip65504P1309S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1309-S
	 *	@param number
	 */
	public void setIp65504P1309S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1309S = checkIp65504P1309SMaxLimit(number); 
		serializeIp65504P1309S(ip65504P1309S);
	}

	public void setIp65504P1309S(int number) {
	    number = checkIp65504P1309SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1309S((short)number);
	}
	public void setIp65504P1309S(long number) {
	    number = checkIp65504P1309SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1309S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1309L
	 *	@return ip65504P1309L
	 */
	public short getIp65504P1309L() throws CFException {
        if (isIp65504P1309LModified()) { 
           ip65504P1309L = refreshIp65504P1309L();
        }
   		return ip65504P1309L;
	}
	
	/**
	 * 	Update Ip65504P1309L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1309-L
	 *	@param number
	 */
	public void setIp65504P1309L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1309L = checkIp65504P1309LMaxLimit(number); 
		serializeIp65504P1309L(ip65504P1309L);
	}

	public void setIp65504P1309L(int number) {
	    number = checkIp65504P1309LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1309L((short)number);
	}
	public void setIp65504P1309L(long number) {
	    number = checkIp65504P1309LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1309L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1310S
	 *	@return ip65504P1310S
	 */
	public short getIp65504P1310S() throws CFException {
        if (isIp65504P1310SModified()) { 
           ip65504P1310S = refreshIp65504P1310S();
        }
   		return ip65504P1310S;
	}
	
	/**
	 * 	Update Ip65504P1310S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1310-S
	 *	@param number
	 */
	public void setIp65504P1310S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1310S = checkIp65504P1310SMaxLimit(number); 
		serializeIp65504P1310S(ip65504P1310S);
	}

	public void setIp65504P1310S(int number) {
	    number = checkIp65504P1310SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1310S((short)number);
	}
	public void setIp65504P1310S(long number) {
	    number = checkIp65504P1310SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1310S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1310L
	 *	@return ip65504P1310L
	 */
	public short getIp65504P1310L() throws CFException {
        if (isIp65504P1310LModified()) { 
           ip65504P1310L = refreshIp65504P1310L();
        }
   		return ip65504P1310L;
	}
	
	/**
	 * 	Update Ip65504P1310L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1310-L
	 *	@param number
	 */
	public void setIp65504P1310L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1310L = checkIp65504P1310LMaxLimit(number); 
		serializeIp65504P1310L(ip65504P1310L);
	}

	public void setIp65504P1310L(int number) {
	    number = checkIp65504P1310LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1310L((short)number);
	}
	public void setIp65504P1310L(long number) {
	    number = checkIp65504P1310LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1310L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1311S
	 *	@return ip65504P1311S
	 */
	public short getIp65504P1311S() throws CFException {
        if (isIp65504P1311SModified()) { 
           ip65504P1311S = refreshIp65504P1311S();
        }
   		return ip65504P1311S;
	}
	
	/**
	 * 	Update Ip65504P1311S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1311-S
	 *	@param number
	 */
	public void setIp65504P1311S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1311S = checkIp65504P1311SMaxLimit(number); 
		serializeIp65504P1311S(ip65504P1311S);
	}

	public void setIp65504P1311S(int number) {
	    number = checkIp65504P1311SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1311S((short)number);
	}
	public void setIp65504P1311S(long number) {
	    number = checkIp65504P1311SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1311S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1311L
	 *	@return ip65504P1311L
	 */
	public short getIp65504P1311L() throws CFException {
        if (isIp65504P1311LModified()) { 
           ip65504P1311L = refreshIp65504P1311L();
        }
   		return ip65504P1311L;
	}
	
	/**
	 * 	Update Ip65504P1311L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1311-L
	 *	@param number
	 */
	public void setIp65504P1311L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1311L = checkIp65504P1311LMaxLimit(number); 
		serializeIp65504P1311L(ip65504P1311L);
	}

	public void setIp65504P1311L(int number) {
	    number = checkIp65504P1311LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1311L((short)number);
	}
	public void setIp65504P1311L(long number) {
	    number = checkIp65504P1311LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1311L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1312S
	 *	@return ip65504P1312S
	 */
	public short getIp65504P1312S() throws CFException {
        if (isIp65504P1312SModified()) { 
           ip65504P1312S = refreshIp65504P1312S();
        }
   		return ip65504P1312S;
	}
	
	/**
	 * 	Update Ip65504P1312S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1312-S
	 *	@param number
	 */
	public void setIp65504P1312S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1312S = checkIp65504P1312SMaxLimit(number); 
		serializeIp65504P1312S(ip65504P1312S);
	}

	public void setIp65504P1312S(int number) {
	    number = checkIp65504P1312SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1312S((short)number);
	}
	public void setIp65504P1312S(long number) {
	    number = checkIp65504P1312SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1312S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1312L
	 *	@return ip65504P1312L
	 */
	public short getIp65504P1312L() throws CFException {
        if (isIp65504P1312LModified()) { 
           ip65504P1312L = refreshIp65504P1312L();
        }
   		return ip65504P1312L;
	}
	
	/**
	 * 	Update Ip65504P1312L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1312-L
	 *	@param number
	 */
	public void setIp65504P1312L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1312L = checkIp65504P1312LMaxLimit(number); 
		serializeIp65504P1312L(ip65504P1312L);
	}

	public void setIp65504P1312L(int number) {
	    number = checkIp65504P1312LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1312L((short)number);
	}
	public void setIp65504P1312L(long number) {
	    number = checkIp65504P1312LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1312L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1313S
	 *	@return ip65504P1313S
	 */
	public short getIp65504P1313S() throws CFException {
        if (isIp65504P1313SModified()) { 
           ip65504P1313S = refreshIp65504P1313S();
        }
   		return ip65504P1313S;
	}
	
	/**
	 * 	Update Ip65504P1313S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1313-S
	 *	@param number
	 */
	public void setIp65504P1313S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1313S = checkIp65504P1313SMaxLimit(number); 
		serializeIp65504P1313S(ip65504P1313S);
	}

	public void setIp65504P1313S(int number) {
	    number = checkIp65504P1313SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1313S((short)number);
	}
	public void setIp65504P1313S(long number) {
	    number = checkIp65504P1313SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1313S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1313L
	 *	@return ip65504P1313L
	 */
	public short getIp65504P1313L() throws CFException {
        if (isIp65504P1313LModified()) { 
           ip65504P1313L = refreshIp65504P1313L();
        }
   		return ip65504P1313L;
	}
	
	/**
	 * 	Update Ip65504P1313L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1313-L
	 *	@param number
	 */
	public void setIp65504P1313L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1313L = checkIp65504P1313LMaxLimit(number); 
		serializeIp65504P1313L(ip65504P1313L);
	}

	public void setIp65504P1313L(int number) {
	    number = checkIp65504P1313LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1313L((short)number);
	}
	public void setIp65504P1313L(long number) {
	    number = checkIp65504P1313LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1313L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1314S
	 *	@return ip65504P1314S
	 */
	public short getIp65504P1314S() throws CFException {
        if (isIp65504P1314SModified()) { 
           ip65504P1314S = refreshIp65504P1314S();
        }
   		return ip65504P1314S;
	}
	
	/**
	 * 	Update Ip65504P1314S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1314-S
	 *	@param number
	 */
	public void setIp65504P1314S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1314S = checkIp65504P1314SMaxLimit(number); 
		serializeIp65504P1314S(ip65504P1314S);
	}

	public void setIp65504P1314S(int number) {
	    number = checkIp65504P1314SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1314S((short)number);
	}
	public void setIp65504P1314S(long number) {
	    number = checkIp65504P1314SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1314S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1314L
	 *	@return ip65504P1314L
	 */
	public short getIp65504P1314L() throws CFException {
        if (isIp65504P1314LModified()) { 
           ip65504P1314L = refreshIp65504P1314L();
        }
   		return ip65504P1314L;
	}
	
	/**
	 * 	Update Ip65504P1314L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1314-L
	 *	@param number
	 */
	public void setIp65504P1314L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1314L = checkIp65504P1314LMaxLimit(number); 
		serializeIp65504P1314L(ip65504P1314L);
	}

	public void setIp65504P1314L(int number) {
	    number = checkIp65504P1314LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1314L((short)number);
	}
	public void setIp65504P1314L(long number) {
	    number = checkIp65504P1314LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1314L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1315S
	 *	@return ip65504P1315S
	 */
	public short getIp65504P1315S() throws CFException {
        if (isIp65504P1315SModified()) { 
           ip65504P1315S = refreshIp65504P1315S();
        }
   		return ip65504P1315S;
	}
	
	/**
	 * 	Update Ip65504P1315S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1315-S
	 *	@param number
	 */
	public void setIp65504P1315S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1315S = checkIp65504P1315SMaxLimit(number); 
		serializeIp65504P1315S(ip65504P1315S);
	}

	public void setIp65504P1315S(int number) {
	    number = checkIp65504P1315SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1315S((short)number);
	}
	public void setIp65504P1315S(long number) {
	    number = checkIp65504P1315SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1315S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1315L
	 *	@return ip65504P1315L
	 */
	public short getIp65504P1315L() throws CFException {
        if (isIp65504P1315LModified()) { 
           ip65504P1315L = refreshIp65504P1315L();
        }
   		return ip65504P1315L;
	}
	
	/**
	 * 	Update Ip65504P1315L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1315-L
	 *	@param number
	 */
	public void setIp65504P1315L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1315L = checkIp65504P1315LMaxLimit(number); 
		serializeIp65504P1315L(ip65504P1315L);
	}

	public void setIp65504P1315L(int number) {
	    number = checkIp65504P1315LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1315L((short)number);
	}
	public void setIp65504P1315L(long number) {
	    number = checkIp65504P1315LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1315L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1316S
	 *	@return ip65504P1316S
	 */
	public short getIp65504P1316S() throws CFException {
        if (isIp65504P1316SModified()) { 
           ip65504P1316S = refreshIp65504P1316S();
        }
   		return ip65504P1316S;
	}
	
	/**
	 * 	Update Ip65504P1316S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1316-S
	 *	@param number
	 */
	public void setIp65504P1316S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1316S = checkIp65504P1316SMaxLimit(number); 
		serializeIp65504P1316S(ip65504P1316S);
	}

	public void setIp65504P1316S(int number) {
	    number = checkIp65504P1316SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1316S((short)number);
	}
	public void setIp65504P1316S(long number) {
	    number = checkIp65504P1316SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1316S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1316L
	 *	@return ip65504P1316L
	 */
	public short getIp65504P1316L() throws CFException {
        if (isIp65504P1316LModified()) { 
           ip65504P1316L = refreshIp65504P1316L();
        }
   		return ip65504P1316L;
	}
	
	/**
	 * 	Update Ip65504P1316L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1316-L
	 *	@param number
	 */
	public void setIp65504P1316L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1316L = checkIp65504P1316LMaxLimit(number); 
		serializeIp65504P1316L(ip65504P1316L);
	}

	public void setIp65504P1316L(int number) {
	    number = checkIp65504P1316LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1316L((short)number);
	}
	public void setIp65504P1316L(long number) {
	    number = checkIp65504P1316LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1316L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1317S
	 *	@return ip65504P1317S
	 */
	public short getIp65504P1317S() throws CFException {
        if (isIp65504P1317SModified()) { 
           ip65504P1317S = refreshIp65504P1317S();
        }
   		return ip65504P1317S;
	}
	
	/**
	 * 	Update Ip65504P1317S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1317-S
	 *	@param number
	 */
	public void setIp65504P1317S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1317S = checkIp65504P1317SMaxLimit(number); 
		serializeIp65504P1317S(ip65504P1317S);
	}

	public void setIp65504P1317S(int number) {
	    number = checkIp65504P1317SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1317S((short)number);
	}
	public void setIp65504P1317S(long number) {
	    number = checkIp65504P1317SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1317S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1317L
	 *	@return ip65504P1317L
	 */
	public short getIp65504P1317L() throws CFException {
        if (isIp65504P1317LModified()) { 
           ip65504P1317L = refreshIp65504P1317L();
        }
   		return ip65504P1317L;
	}
	
	/**
	 * 	Update Ip65504P1317L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1317-L
	 *	@param number
	 */
	public void setIp65504P1317L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1317L = checkIp65504P1317LMaxLimit(number); 
		serializeIp65504P1317L(ip65504P1317L);
	}

	public void setIp65504P1317L(int number) {
	    number = checkIp65504P1317LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1317L((short)number);
	}
	public void setIp65504P1317L(long number) {
	    number = checkIp65504P1317LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1317L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1318S
	 *	@return ip65504P1318S
	 */
	public short getIp65504P1318S() throws CFException {
        if (isIp65504P1318SModified()) { 
           ip65504P1318S = refreshIp65504P1318S();
        }
   		return ip65504P1318S;
	}
	
	/**
	 * 	Update Ip65504P1318S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1318-S
	 *	@param number
	 */
	public void setIp65504P1318S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1318S = checkIp65504P1318SMaxLimit(number); 
		serializeIp65504P1318S(ip65504P1318S);
	}

	public void setIp65504P1318S(int number) {
	    number = checkIp65504P1318SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1318S((short)number);
	}
	public void setIp65504P1318S(long number) {
	    number = checkIp65504P1318SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1318S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1318L
	 *	@return ip65504P1318L
	 */
	public short getIp65504P1318L() throws CFException {
        if (isIp65504P1318LModified()) { 
           ip65504P1318L = refreshIp65504P1318L();
        }
   		return ip65504P1318L;
	}
	
	/**
	 * 	Update Ip65504P1318L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1318-L
	 *	@param number
	 */
	public void setIp65504P1318L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1318L = checkIp65504P1318LMaxLimit(number); 
		serializeIp65504P1318L(ip65504P1318L);
	}

	public void setIp65504P1318L(int number) {
	    number = checkIp65504P1318LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1318L((short)number);
	}
	public void setIp65504P1318L(long number) {
	    number = checkIp65504P1318LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1318L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1319S
	 *	@return ip65504P1319S
	 */
	public short getIp65504P1319S() throws CFException {
        if (isIp65504P1319SModified()) { 
           ip65504P1319S = refreshIp65504P1319S();
        }
   		return ip65504P1319S;
	}
	
	/**
	 * 	Update Ip65504P1319S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1319-S
	 *	@param number
	 */
	public void setIp65504P1319S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1319S = checkIp65504P1319SMaxLimit(number); 
		serializeIp65504P1319S(ip65504P1319S);
	}

	public void setIp65504P1319S(int number) {
	    number = checkIp65504P1319SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1319S((short)number);
	}
	public void setIp65504P1319S(long number) {
	    number = checkIp65504P1319SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1319S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1319L
	 *	@return ip65504P1319L
	 */
	public short getIp65504P1319L() throws CFException {
        if (isIp65504P1319LModified()) { 
           ip65504P1319L = refreshIp65504P1319L();
        }
   		return ip65504P1319L;
	}
	
	/**
	 * 	Update Ip65504P1319L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1319-L
	 *	@param number
	 */
	public void setIp65504P1319L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1319L = checkIp65504P1319LMaxLimit(number); 
		serializeIp65504P1319L(ip65504P1319L);
	}

	public void setIp65504P1319L(int number) {
	    number = checkIp65504P1319LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1319L((short)number);
	}
	public void setIp65504P1319L(long number) {
	    number = checkIp65504P1319LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1319L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1320S
	 *	@return ip65504P1320S
	 */
	public short getIp65504P1320S() throws CFException {
        if (isIp65504P1320SModified()) { 
           ip65504P1320S = refreshIp65504P1320S();
        }
   		return ip65504P1320S;
	}
	
	/**
	 * 	Update Ip65504P1320S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1320-S
	 *	@param number
	 */
	public void setIp65504P1320S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1320S = checkIp65504P1320SMaxLimit(number); 
		serializeIp65504P1320S(ip65504P1320S);
	}

	public void setIp65504P1320S(int number) {
	    number = checkIp65504P1320SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1320S((short)number);
	}
	public void setIp65504P1320S(long number) {
	    number = checkIp65504P1320SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1320S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1320L
	 *	@return ip65504P1320L
	 */
	public short getIp65504P1320L() throws CFException {
        if (isIp65504P1320LModified()) { 
           ip65504P1320L = refreshIp65504P1320L();
        }
   		return ip65504P1320L;
	}
	
	/**
	 * 	Update Ip65504P1320L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1320-L
	 *	@param number
	 */
	public void setIp65504P1320L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1320L = checkIp65504P1320LMaxLimit(number); 
		serializeIp65504P1320L(ip65504P1320L);
	}

	public void setIp65504P1320L(int number) {
	    number = checkIp65504P1320LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1320L((short)number);
	}
	public void setIp65504P1320L(long number) {
	    number = checkIp65504P1320LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1320L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1321S
	 *	@return ip65504P1321S
	 */
	public short getIp65504P1321S() throws CFException {
        if (isIp65504P1321SModified()) { 
           ip65504P1321S = refreshIp65504P1321S();
        }
   		return ip65504P1321S;
	}
	
	/**
	 * 	Update Ip65504P1321S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1321-S
	 *	@param number
	 */
	public void setIp65504P1321S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1321S = checkIp65504P1321SMaxLimit(number); 
		serializeIp65504P1321S(ip65504P1321S);
	}

	public void setIp65504P1321S(int number) {
	    number = checkIp65504P1321SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1321S((short)number);
	}
	public void setIp65504P1321S(long number) {
	    number = checkIp65504P1321SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1321S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1321L
	 *	@return ip65504P1321L
	 */
	public short getIp65504P1321L() throws CFException {
        if (isIp65504P1321LModified()) { 
           ip65504P1321L = refreshIp65504P1321L();
        }
   		return ip65504P1321L;
	}
	
	/**
	 * 	Update Ip65504P1321L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1321-L
	 *	@param number
	 */
	public void setIp65504P1321L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1321L = checkIp65504P1321LMaxLimit(number); 
		serializeIp65504P1321L(ip65504P1321L);
	}

	public void setIp65504P1321L(int number) {
	    number = checkIp65504P1321LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1321L((short)number);
	}
	public void setIp65504P1321L(long number) {
	    number = checkIp65504P1321LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1321L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1322S
	 *	@return ip65504P1322S
	 */
	public short getIp65504P1322S() throws CFException {
        if (isIp65504P1322SModified()) { 
           ip65504P1322S = refreshIp65504P1322S();
        }
   		return ip65504P1322S;
	}
	
	/**
	 * 	Update Ip65504P1322S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1322-S
	 *	@param number
	 */
	public void setIp65504P1322S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1322S = checkIp65504P1322SMaxLimit(number); 
		serializeIp65504P1322S(ip65504P1322S);
	}

	public void setIp65504P1322S(int number) {
	    number = checkIp65504P1322SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1322S((short)number);
	}
	public void setIp65504P1322S(long number) {
	    number = checkIp65504P1322SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1322S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1322L
	 *	@return ip65504P1322L
	 */
	public short getIp65504P1322L() throws CFException {
        if (isIp65504P1322LModified()) { 
           ip65504P1322L = refreshIp65504P1322L();
        }
   		return ip65504P1322L;
	}
	
	/**
	 * 	Update Ip65504P1322L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1322-L
	 *	@param number
	 */
	public void setIp65504P1322L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1322L = checkIp65504P1322LMaxLimit(number); 
		serializeIp65504P1322L(ip65504P1322L);
	}

	public void setIp65504P1322L(int number) {
	    number = checkIp65504P1322LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1322L((short)number);
	}
	public void setIp65504P1322L(long number) {
	    number = checkIp65504P1322LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1322L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1323S
	 *	@return ip65504P1323S
	 */
	public short getIp65504P1323S() throws CFException {
        if (isIp65504P1323SModified()) { 
           ip65504P1323S = refreshIp65504P1323S();
        }
   		return ip65504P1323S;
	}
	
	/**
	 * 	Update Ip65504P1323S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1323-S
	 *	@param number
	 */
	public void setIp65504P1323S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1323S = checkIp65504P1323SMaxLimit(number); 
		serializeIp65504P1323S(ip65504P1323S);
	}

	public void setIp65504P1323S(int number) {
	    number = checkIp65504P1323SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1323S((short)number);
	}
	public void setIp65504P1323S(long number) {
	    number = checkIp65504P1323SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1323S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1323L
	 *	@return ip65504P1323L
	 */
	public short getIp65504P1323L() throws CFException {
        if (isIp65504P1323LModified()) { 
           ip65504P1323L = refreshIp65504P1323L();
        }
   		return ip65504P1323L;
	}
	
	/**
	 * 	Update Ip65504P1323L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1323-L
	 *	@param number
	 */
	public void setIp65504P1323L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1323L = checkIp65504P1323LMaxLimit(number); 
		serializeIp65504P1323L(ip65504P1323L);
	}

	public void setIp65504P1323L(int number) {
	    number = checkIp65504P1323LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1323L((short)number);
	}
	public void setIp65504P1323L(long number) {
	    number = checkIp65504P1323LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1323L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1324S
	 *	@return ip65504P1324S
	 */
	public short getIp65504P1324S() throws CFException {
        if (isIp65504P1324SModified()) { 
           ip65504P1324S = refreshIp65504P1324S();
        }
   		return ip65504P1324S;
	}
	
	/**
	 * 	Update Ip65504P1324S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1324-S
	 *	@param number
	 */
	public void setIp65504P1324S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1324S = checkIp65504P1324SMaxLimit(number); 
		serializeIp65504P1324S(ip65504P1324S);
	}

	public void setIp65504P1324S(int number) {
	    number = checkIp65504P1324SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1324S((short)number);
	}
	public void setIp65504P1324S(long number) {
	    number = checkIp65504P1324SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1324S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1324L
	 *	@return ip65504P1324L
	 */
	public short getIp65504P1324L() throws CFException {
        if (isIp65504P1324LModified()) { 
           ip65504P1324L = refreshIp65504P1324L();
        }
   		return ip65504P1324L;
	}
	
	/**
	 * 	Update Ip65504P1324L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1324-L
	 *	@param number
	 */
	public void setIp65504P1324L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1324L = checkIp65504P1324LMaxLimit(number); 
		serializeIp65504P1324L(ip65504P1324L);
	}

	public void setIp65504P1324L(int number) {
	    number = checkIp65504P1324LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1324L((short)number);
	}
	public void setIp65504P1324L(long number) {
	    number = checkIp65504P1324LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1324L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1325S
	 *	@return ip65504P1325S
	 */
	public short getIp65504P1325S() throws CFException {
        if (isIp65504P1325SModified()) { 
           ip65504P1325S = refreshIp65504P1325S();
        }
   		return ip65504P1325S;
	}
	
	/**
	 * 	Update Ip65504P1325S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1325-S
	 *	@param number
	 */
	public void setIp65504P1325S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1325S = checkIp65504P1325SMaxLimit(number); 
		serializeIp65504P1325S(ip65504P1325S);
	}

	public void setIp65504P1325S(int number) {
	    number = checkIp65504P1325SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1325S((short)number);
	}
	public void setIp65504P1325S(long number) {
	    number = checkIp65504P1325SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1325S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1325L
	 *	@return ip65504P1325L
	 */
	public short getIp65504P1325L() throws CFException {
        if (isIp65504P1325LModified()) { 
           ip65504P1325L = refreshIp65504P1325L();
        }
   		return ip65504P1325L;
	}
	
	/**
	 * 	Update Ip65504P1325L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1325-L
	 *	@param number
	 */
	public void setIp65504P1325L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1325L = checkIp65504P1325LMaxLimit(number); 
		serializeIp65504P1325L(ip65504P1325L);
	}

	public void setIp65504P1325L(int number) {
	    number = checkIp65504P1325LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1325L((short)number);
	}
	public void setIp65504P1325L(long number) {
	    number = checkIp65504P1325LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1325L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1326S
	 *	@return ip65504P1326S
	 */
	public short getIp65504P1326S() throws CFException {
        if (isIp65504P1326SModified()) { 
           ip65504P1326S = refreshIp65504P1326S();
        }
   		return ip65504P1326S;
	}
	
	/**
	 * 	Update Ip65504P1326S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1326-S
	 *	@param number
	 */
	public void setIp65504P1326S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1326S = checkIp65504P1326SMaxLimit(number); 
		serializeIp65504P1326S(ip65504P1326S);
	}

	public void setIp65504P1326S(int number) {
	    number = checkIp65504P1326SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1326S((short)number);
	}
	public void setIp65504P1326S(long number) {
	    number = checkIp65504P1326SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1326S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1326L
	 *	@return ip65504P1326L
	 */
	public short getIp65504P1326L() throws CFException {
        if (isIp65504P1326LModified()) { 
           ip65504P1326L = refreshIp65504P1326L();
        }
   		return ip65504P1326L;
	}
	
	/**
	 * 	Update Ip65504P1326L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1326-L
	 *	@param number
	 */
	public void setIp65504P1326L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1326L = checkIp65504P1326LMaxLimit(number); 
		serializeIp65504P1326L(ip65504P1326L);
	}

	public void setIp65504P1326L(int number) {
	    number = checkIp65504P1326LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1326L((short)number);
	}
	public void setIp65504P1326L(long number) {
	    number = checkIp65504P1326LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1326L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1327S
	 *	@return ip65504P1327S
	 */
	public short getIp65504P1327S() throws CFException {
        if (isIp65504P1327SModified()) { 
           ip65504P1327S = refreshIp65504P1327S();
        }
   		return ip65504P1327S;
	}
	
	/**
	 * 	Update Ip65504P1327S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1327-S
	 *	@param number
	 */
	public void setIp65504P1327S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1327S = checkIp65504P1327SMaxLimit(number); 
		serializeIp65504P1327S(ip65504P1327S);
	}

	public void setIp65504P1327S(int number) {
	    number = checkIp65504P1327SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1327S((short)number);
	}
	public void setIp65504P1327S(long number) {
	    number = checkIp65504P1327SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1327S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1327L
	 *	@return ip65504P1327L
	 */
	public short getIp65504P1327L() throws CFException {
        if (isIp65504P1327LModified()) { 
           ip65504P1327L = refreshIp65504P1327L();
        }
   		return ip65504P1327L;
	}
	
	/**
	 * 	Update Ip65504P1327L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1327-L
	 *	@param number
	 */
	public void setIp65504P1327L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1327L = checkIp65504P1327LMaxLimit(number); 
		serializeIp65504P1327L(ip65504P1327L);
	}

	public void setIp65504P1327L(int number) {
	    number = checkIp65504P1327LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1327L((short)number);
	}
	public void setIp65504P1327L(long number) {
	    number = checkIp65504P1327LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1327L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1328S
	 *	@return ip65504P1328S
	 */
	public short getIp65504P1328S() throws CFException {
        if (isIp65504P1328SModified()) { 
           ip65504P1328S = refreshIp65504P1328S();
        }
   		return ip65504P1328S;
	}
	
	/**
	 * 	Update Ip65504P1328S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1328-S
	 *	@param number
	 */
	public void setIp65504P1328S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1328S = checkIp65504P1328SMaxLimit(number); 
		serializeIp65504P1328S(ip65504P1328S);
	}

	public void setIp65504P1328S(int number) {
	    number = checkIp65504P1328SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1328S((short)number);
	}
	public void setIp65504P1328S(long number) {
	    number = checkIp65504P1328SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1328S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1328L
	 *	@return ip65504P1328L
	 */
	public short getIp65504P1328L() throws CFException {
        if (isIp65504P1328LModified()) { 
           ip65504P1328L = refreshIp65504P1328L();
        }
   		return ip65504P1328L;
	}
	
	/**
	 * 	Update Ip65504P1328L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1328-L
	 *	@param number
	 */
	public void setIp65504P1328L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1328L = checkIp65504P1328LMaxLimit(number); 
		serializeIp65504P1328L(ip65504P1328L);
	}

	public void setIp65504P1328L(int number) {
	    number = checkIp65504P1328LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1328L((short)number);
	}
	public void setIp65504P1328L(long number) {
	    number = checkIp65504P1328LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1328L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1329S
	 *	@return ip65504P1329S
	 */
	public short getIp65504P1329S() throws CFException {
        if (isIp65504P1329SModified()) { 
           ip65504P1329S = refreshIp65504P1329S();
        }
   		return ip65504P1329S;
	}
	
	/**
	 * 	Update Ip65504P1329S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1329-S
	 *	@param number
	 */
	public void setIp65504P1329S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1329S = checkIp65504P1329SMaxLimit(number); 
		serializeIp65504P1329S(ip65504P1329S);
	}

	public void setIp65504P1329S(int number) {
	    number = checkIp65504P1329SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1329S((short)number);
	}
	public void setIp65504P1329S(long number) {
	    number = checkIp65504P1329SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1329S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1329L
	 *	@return ip65504P1329L
	 */
	public short getIp65504P1329L() throws CFException {
        if (isIp65504P1329LModified()) { 
           ip65504P1329L = refreshIp65504P1329L();
        }
   		return ip65504P1329L;
	}
	
	/**
	 * 	Update Ip65504P1329L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1329-L
	 *	@param number
	 */
	public void setIp65504P1329L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1329L = checkIp65504P1329LMaxLimit(number); 
		serializeIp65504P1329L(ip65504P1329L);
	}

	public void setIp65504P1329L(int number) {
	    number = checkIp65504P1329LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1329L((short)number);
	}
	public void setIp65504P1329L(long number) {
	    number = checkIp65504P1329LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1329L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1330S
	 *	@return ip65504P1330S
	 */
	public short getIp65504P1330S() throws CFException {
        if (isIp65504P1330SModified()) { 
           ip65504P1330S = refreshIp65504P1330S();
        }
   		return ip65504P1330S;
	}
	
	/**
	 * 	Update Ip65504P1330S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1330-S
	 *	@param number
	 */
	public void setIp65504P1330S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1330S = checkIp65504P1330SMaxLimit(number); 
		serializeIp65504P1330S(ip65504P1330S);
	}

	public void setIp65504P1330S(int number) {
	    number = checkIp65504P1330SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1330S((short)number);
	}
	public void setIp65504P1330S(long number) {
	    number = checkIp65504P1330SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1330S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1330L
	 *	@return ip65504P1330L
	 */
	public short getIp65504P1330L() throws CFException {
        if (isIp65504P1330LModified()) { 
           ip65504P1330L = refreshIp65504P1330L();
        }
   		return ip65504P1330L;
	}
	
	/**
	 * 	Update Ip65504P1330L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1330-L
	 *	@param number
	 */
	public void setIp65504P1330L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1330L = checkIp65504P1330LMaxLimit(number); 
		serializeIp65504P1330L(ip65504P1330L);
	}

	public void setIp65504P1330L(int number) {
	    number = checkIp65504P1330LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1330L((short)number);
	}
	public void setIp65504P1330L(long number) {
	    number = checkIp65504P1330LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1330L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1331S
	 *	@return ip65504P1331S
	 */
	public short getIp65504P1331S() throws CFException {
        if (isIp65504P1331SModified()) { 
           ip65504P1331S = refreshIp65504P1331S();
        }
   		return ip65504P1331S;
	}
	
	/**
	 * 	Update Ip65504P1331S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1331-S
	 *	@param number
	 */
	public void setIp65504P1331S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1331S = checkIp65504P1331SMaxLimit(number); 
		serializeIp65504P1331S(ip65504P1331S);
	}

	public void setIp65504P1331S(int number) {
	    number = checkIp65504P1331SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1331S((short)number);
	}
	public void setIp65504P1331S(long number) {
	    number = checkIp65504P1331SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1331S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1331L
	 *	@return ip65504P1331L
	 */
	public short getIp65504P1331L() throws CFException {
        if (isIp65504P1331LModified()) { 
           ip65504P1331L = refreshIp65504P1331L();
        }
   		return ip65504P1331L;
	}
	
	/**
	 * 	Update Ip65504P1331L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1331-L
	 *	@param number
	 */
	public void setIp65504P1331L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1331L = checkIp65504P1331LMaxLimit(number); 
		serializeIp65504P1331L(ip65504P1331L);
	}

	public void setIp65504P1331L(int number) {
	    number = checkIp65504P1331LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1331L((short)number);
	}
	public void setIp65504P1331L(long number) {
	    number = checkIp65504P1331LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1331L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1332S
	 *	@return ip65504P1332S
	 */
	public short getIp65504P1332S() throws CFException {
        if (isIp65504P1332SModified()) { 
           ip65504P1332S = refreshIp65504P1332S();
        }
   		return ip65504P1332S;
	}
	
	/**
	 * 	Update Ip65504P1332S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1332-S
	 *	@param number
	 */
	public void setIp65504P1332S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1332S = checkIp65504P1332SMaxLimit(number); 
		serializeIp65504P1332S(ip65504P1332S);
	}

	public void setIp65504P1332S(int number) {
	    number = checkIp65504P1332SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1332S((short)number);
	}
	public void setIp65504P1332S(long number) {
	    number = checkIp65504P1332SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1332S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1332L
	 *	@return ip65504P1332L
	 */
	public short getIp65504P1332L() throws CFException {
        if (isIp65504P1332LModified()) { 
           ip65504P1332L = refreshIp65504P1332L();
        }
   		return ip65504P1332L;
	}
	
	/**
	 * 	Update Ip65504P1332L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1332-L
	 *	@param number
	 */
	public void setIp65504P1332L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1332L = checkIp65504P1332LMaxLimit(number); 
		serializeIp65504P1332L(ip65504P1332L);
	}

	public void setIp65504P1332L(int number) {
	    number = checkIp65504P1332LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1332L((short)number);
	}
	public void setIp65504P1332L(long number) {
	    number = checkIp65504P1332LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1332L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1333S
	 *	@return ip65504P1333S
	 */
	public short getIp65504P1333S() throws CFException {
        if (isIp65504P1333SModified()) { 
           ip65504P1333S = refreshIp65504P1333S();
        }
   		return ip65504P1333S;
	}
	
	/**
	 * 	Update Ip65504P1333S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1333-S
	 *	@param number
	 */
	public void setIp65504P1333S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1333S = checkIp65504P1333SMaxLimit(number); 
		serializeIp65504P1333S(ip65504P1333S);
	}

	public void setIp65504P1333S(int number) {
	    number = checkIp65504P1333SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1333S((short)number);
	}
	public void setIp65504P1333S(long number) {
	    number = checkIp65504P1333SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1333S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1333L
	 *	@return ip65504P1333L
	 */
	public short getIp65504P1333L() throws CFException {
        if (isIp65504P1333LModified()) { 
           ip65504P1333L = refreshIp65504P1333L();
        }
   		return ip65504P1333L;
	}
	
	/**
	 * 	Update Ip65504P1333L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1333-L
	 *	@param number
	 */
	public void setIp65504P1333L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1333L = checkIp65504P1333LMaxLimit(number); 
		serializeIp65504P1333L(ip65504P1333L);
	}

	public void setIp65504P1333L(int number) {
	    number = checkIp65504P1333LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1333L((short)number);
	}
	public void setIp65504P1333L(long number) {
	    number = checkIp65504P1333LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1333L((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup43
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P1303S((short)0);
         	setIp65504P1303L((short)0);
         	setIp65504P1304S((short)0);
         	setIp65504P1304L((short)0);
         	setIp65504P1305S((short)0);
         	setIp65504P1305L((short)0);
         	setIp65504P1306S((short)0);
         	setIp65504P1306L((short)0);
         	setIp65504P1307S((short)0);
         	setIp65504P1307L((short)0);
         	setIp65504P1308S((short)0);
         	setIp65504P1308L((short)0);
         	setIp65504P1309S((short)0);
         	setIp65504P1309L((short)0);
         	setIp65504P1310S((short)0);
         	setIp65504P1310L((short)0);
         	setIp65504P1311S((short)0);
         	setIp65504P1311L((short)0);
         	setIp65504P1312S((short)0);
         	setIp65504P1312L((short)0);
         	setIp65504P1313S((short)0);
         	setIp65504P1313L((short)0);
         	setIp65504P1314S((short)0);
         	setIp65504P1314L((short)0);
         	setIp65504P1315S((short)0);
         	setIp65504P1315L((short)0);
         	setIp65504P1316S((short)0);
         	setIp65504P1316L((short)0);
         	setIp65504P1317S((short)0);
         	setIp65504P1317L((short)0);
         	setIp65504P1318S((short)0);
         	setIp65504P1318L((short)0);
         	setIp65504P1319S((short)0);
         	setIp65504P1319L((short)0);
         	setIp65504P1320S((short)0);
         	setIp65504P1320L((short)0);
         	setIp65504P1321S((short)0);
         	setIp65504P1321L((short)0);
         	setIp65504P1322S((short)0);
         	setIp65504P1322L((short)0);
         	setIp65504P1323S((short)0);
         	setIp65504P1323L((short)0);
         	setIp65504P1324S((short)0);
         	setIp65504P1324L((short)0);
         	setIp65504P1325S((short)0);
         	setIp65504P1325L((short)0);
         	setIp65504P1326S((short)0);
         	setIp65504P1326L((short)0);
         	setIp65504P1327S((short)0);
         	setIp65504P1327L((short)0);
         	setIp65504P1328S((short)0);
         	setIp65504P1328L((short)0);
         	setIp65504P1329S((short)0);
         	setIp65504P1329L((short)0);
         	setIp65504P1330S((short)0);
         	setIp65504P1330L((short)0);
         	setIp65504P1331S((short)0);
         	setIp65504P1331L((short)0);
         	setIp65504P1332S((short)0);
         	setIp65504P1332L((short)0);
         	setIp65504P1333S((short)0);
         	setIp65504P1333L((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup43FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_43_LENGTH;
		}

}
  
