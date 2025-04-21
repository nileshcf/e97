package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup50 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup50 extends Ip65504PdsNamesLargeGroup50Serialized { 
   

								private short ip65504P1520S;

								private short ip65504P1520L;


								private short ip65504P1521S;

								private short ip65504P1521L;


								private short ip65504P1522S;

								private short ip65504P1522L;


								private short ip65504P1523S;

								private short ip65504P1523L;


								private short ip65504P1524S;

								private short ip65504P1524L;


								private short ip65504P1525S;

								private short ip65504P1525L;


								private short ip65504P1526S;

								private short ip65504P1526L;


								private short ip65504P1527S;

								private short ip65504P1527L;


								private short ip65504P1528S;

								private short ip65504P1528L;


								private short ip65504P1529S;

								private short ip65504P1529L;


								private short ip65504P1530S;

								private short ip65504P1530L;


								private short ip65504P1531S;

								private short ip65504P1531L;


								private short ip65504P1532S;

								private short ip65504P1532L;


								private short ip65504P1533S;

								private short ip65504P1533L;


								private short ip65504P1534S;

								private short ip65504P1534L;


								private short ip65504P1535S;

								private short ip65504P1535L;


								private short ip65504P1536S;

								private short ip65504P1536L;


								private short ip65504P1537S;

								private short ip65504P1537L;


								private short ip65504P1538S;

								private short ip65504P1538L;


								private short ip65504P1539S;

								private short ip65504P1539L;


								private short ip65504P1540S;

								private short ip65504P1540L;


								private short ip65504P1541S;

								private short ip65504P1541L;


								private short ip65504P1542S;

								private short ip65504P1542L;


								private short ip65504P1543S;

								private short ip65504P1543L;


								private short ip65504P1544S;

								private short ip65504P1544L;


								private short ip65504P1545S;

								private short ip65504P1545L;


								private short ip65504P1546S;

								private short ip65504P1546L;


								private short ip65504P1547S;

								private short ip65504P1547L;


								private short ip65504P1548S;

								private short ip65504P1548L;


								private short ip65504P1549S;

								private short ip65504P1549L;


								private short ip65504P1550S;

								private short ip65504P1550L;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup50
	**/
    public Ip65504PdsNamesLargeGroup50() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup50. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup50(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P1520S
	 *	@return ip65504P1520S
	 */
	public short getIp65504P1520S() throws CFException {
        if (isIp65504P1520SModified()) { 
           ip65504P1520S = refreshIp65504P1520S();
        }
   		return ip65504P1520S;
	}
	
	/**
	 * 	Update Ip65504P1520S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1520-S
	 *	@param number
	 */
	public void setIp65504P1520S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1520S = checkIp65504P1520SMaxLimit(number); 
		serializeIp65504P1520S(ip65504P1520S);
	}

	public void setIp65504P1520S(int number) {
	    number = checkIp65504P1520SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1520S((short)number);
	}
	public void setIp65504P1520S(long number) {
	    number = checkIp65504P1520SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1520S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1520L
	 *	@return ip65504P1520L
	 */
	public short getIp65504P1520L() throws CFException {
        if (isIp65504P1520LModified()) { 
           ip65504P1520L = refreshIp65504P1520L();
        }
   		return ip65504P1520L;
	}
	
	/**
	 * 	Update Ip65504P1520L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1520-L
	 *	@param number
	 */
	public void setIp65504P1520L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1520L = checkIp65504P1520LMaxLimit(number); 
		serializeIp65504P1520L(ip65504P1520L);
	}

	public void setIp65504P1520L(int number) {
	    number = checkIp65504P1520LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1520L((short)number);
	}
	public void setIp65504P1520L(long number) {
	    number = checkIp65504P1520LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1520L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1521S
	 *	@return ip65504P1521S
	 */
	public short getIp65504P1521S() throws CFException {
        if (isIp65504P1521SModified()) { 
           ip65504P1521S = refreshIp65504P1521S();
        }
   		return ip65504P1521S;
	}
	
	/**
	 * 	Update Ip65504P1521S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1521-S
	 *	@param number
	 */
	public void setIp65504P1521S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1521S = checkIp65504P1521SMaxLimit(number); 
		serializeIp65504P1521S(ip65504P1521S);
	}

	public void setIp65504P1521S(int number) {
	    number = checkIp65504P1521SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1521S((short)number);
	}
	public void setIp65504P1521S(long number) {
	    number = checkIp65504P1521SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1521S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1521L
	 *	@return ip65504P1521L
	 */
	public short getIp65504P1521L() throws CFException {
        if (isIp65504P1521LModified()) { 
           ip65504P1521L = refreshIp65504P1521L();
        }
   		return ip65504P1521L;
	}
	
	/**
	 * 	Update Ip65504P1521L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1521-L
	 *	@param number
	 */
	public void setIp65504P1521L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1521L = checkIp65504P1521LMaxLimit(number); 
		serializeIp65504P1521L(ip65504P1521L);
	}

	public void setIp65504P1521L(int number) {
	    number = checkIp65504P1521LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1521L((short)number);
	}
	public void setIp65504P1521L(long number) {
	    number = checkIp65504P1521LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1521L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1522S
	 *	@return ip65504P1522S
	 */
	public short getIp65504P1522S() throws CFException {
        if (isIp65504P1522SModified()) { 
           ip65504P1522S = refreshIp65504P1522S();
        }
   		return ip65504P1522S;
	}
	
	/**
	 * 	Update Ip65504P1522S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1522-S
	 *	@param number
	 */
	public void setIp65504P1522S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1522S = checkIp65504P1522SMaxLimit(number); 
		serializeIp65504P1522S(ip65504P1522S);
	}

	public void setIp65504P1522S(int number) {
	    number = checkIp65504P1522SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1522S((short)number);
	}
	public void setIp65504P1522S(long number) {
	    number = checkIp65504P1522SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1522S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1522L
	 *	@return ip65504P1522L
	 */
	public short getIp65504P1522L() throws CFException {
        if (isIp65504P1522LModified()) { 
           ip65504P1522L = refreshIp65504P1522L();
        }
   		return ip65504P1522L;
	}
	
	/**
	 * 	Update Ip65504P1522L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1522-L
	 *	@param number
	 */
	public void setIp65504P1522L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1522L = checkIp65504P1522LMaxLimit(number); 
		serializeIp65504P1522L(ip65504P1522L);
	}

	public void setIp65504P1522L(int number) {
	    number = checkIp65504P1522LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1522L((short)number);
	}
	public void setIp65504P1522L(long number) {
	    number = checkIp65504P1522LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1522L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1523S
	 *	@return ip65504P1523S
	 */
	public short getIp65504P1523S() throws CFException {
        if (isIp65504P1523SModified()) { 
           ip65504P1523S = refreshIp65504P1523S();
        }
   		return ip65504P1523S;
	}
	
	/**
	 * 	Update Ip65504P1523S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1523-S
	 *	@param number
	 */
	public void setIp65504P1523S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1523S = checkIp65504P1523SMaxLimit(number); 
		serializeIp65504P1523S(ip65504P1523S);
	}

	public void setIp65504P1523S(int number) {
	    number = checkIp65504P1523SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1523S((short)number);
	}
	public void setIp65504P1523S(long number) {
	    number = checkIp65504P1523SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1523S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1523L
	 *	@return ip65504P1523L
	 */
	public short getIp65504P1523L() throws CFException {
        if (isIp65504P1523LModified()) { 
           ip65504P1523L = refreshIp65504P1523L();
        }
   		return ip65504P1523L;
	}
	
	/**
	 * 	Update Ip65504P1523L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1523-L
	 *	@param number
	 */
	public void setIp65504P1523L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1523L = checkIp65504P1523LMaxLimit(number); 
		serializeIp65504P1523L(ip65504P1523L);
	}

	public void setIp65504P1523L(int number) {
	    number = checkIp65504P1523LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1523L((short)number);
	}
	public void setIp65504P1523L(long number) {
	    number = checkIp65504P1523LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1523L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1524S
	 *	@return ip65504P1524S
	 */
	public short getIp65504P1524S() throws CFException {
        if (isIp65504P1524SModified()) { 
           ip65504P1524S = refreshIp65504P1524S();
        }
   		return ip65504P1524S;
	}
	
	/**
	 * 	Update Ip65504P1524S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1524-S
	 *	@param number
	 */
	public void setIp65504P1524S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1524S = checkIp65504P1524SMaxLimit(number); 
		serializeIp65504P1524S(ip65504P1524S);
	}

	public void setIp65504P1524S(int number) {
	    number = checkIp65504P1524SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1524S((short)number);
	}
	public void setIp65504P1524S(long number) {
	    number = checkIp65504P1524SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1524S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1524L
	 *	@return ip65504P1524L
	 */
	public short getIp65504P1524L() throws CFException {
        if (isIp65504P1524LModified()) { 
           ip65504P1524L = refreshIp65504P1524L();
        }
   		return ip65504P1524L;
	}
	
	/**
	 * 	Update Ip65504P1524L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1524-L
	 *	@param number
	 */
	public void setIp65504P1524L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1524L = checkIp65504P1524LMaxLimit(number); 
		serializeIp65504P1524L(ip65504P1524L);
	}

	public void setIp65504P1524L(int number) {
	    number = checkIp65504P1524LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1524L((short)number);
	}
	public void setIp65504P1524L(long number) {
	    number = checkIp65504P1524LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1524L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1525S
	 *	@return ip65504P1525S
	 */
	public short getIp65504P1525S() throws CFException {
        if (isIp65504P1525SModified()) { 
           ip65504P1525S = refreshIp65504P1525S();
        }
   		return ip65504P1525S;
	}
	
	/**
	 * 	Update Ip65504P1525S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1525-S
	 *	@param number
	 */
	public void setIp65504P1525S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1525S = checkIp65504P1525SMaxLimit(number); 
		serializeIp65504P1525S(ip65504P1525S);
	}

	public void setIp65504P1525S(int number) {
	    number = checkIp65504P1525SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1525S((short)number);
	}
	public void setIp65504P1525S(long number) {
	    number = checkIp65504P1525SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1525S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1525L
	 *	@return ip65504P1525L
	 */
	public short getIp65504P1525L() throws CFException {
        if (isIp65504P1525LModified()) { 
           ip65504P1525L = refreshIp65504P1525L();
        }
   		return ip65504P1525L;
	}
	
	/**
	 * 	Update Ip65504P1525L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1525-L
	 *	@param number
	 */
	public void setIp65504P1525L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1525L = checkIp65504P1525LMaxLimit(number); 
		serializeIp65504P1525L(ip65504P1525L);
	}

	public void setIp65504P1525L(int number) {
	    number = checkIp65504P1525LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1525L((short)number);
	}
	public void setIp65504P1525L(long number) {
	    number = checkIp65504P1525LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1525L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1526S
	 *	@return ip65504P1526S
	 */
	public short getIp65504P1526S() throws CFException {
        if (isIp65504P1526SModified()) { 
           ip65504P1526S = refreshIp65504P1526S();
        }
   		return ip65504P1526S;
	}
	
	/**
	 * 	Update Ip65504P1526S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1526-S
	 *	@param number
	 */
	public void setIp65504P1526S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1526S = checkIp65504P1526SMaxLimit(number); 
		serializeIp65504P1526S(ip65504P1526S);
	}

	public void setIp65504P1526S(int number) {
	    number = checkIp65504P1526SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1526S((short)number);
	}
	public void setIp65504P1526S(long number) {
	    number = checkIp65504P1526SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1526S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1526L
	 *	@return ip65504P1526L
	 */
	public short getIp65504P1526L() throws CFException {
        if (isIp65504P1526LModified()) { 
           ip65504P1526L = refreshIp65504P1526L();
        }
   		return ip65504P1526L;
	}
	
	/**
	 * 	Update Ip65504P1526L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1526-L
	 *	@param number
	 */
	public void setIp65504P1526L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1526L = checkIp65504P1526LMaxLimit(number); 
		serializeIp65504P1526L(ip65504P1526L);
	}

	public void setIp65504P1526L(int number) {
	    number = checkIp65504P1526LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1526L((short)number);
	}
	public void setIp65504P1526L(long number) {
	    number = checkIp65504P1526LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1526L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1527S
	 *	@return ip65504P1527S
	 */
	public short getIp65504P1527S() throws CFException {
        if (isIp65504P1527SModified()) { 
           ip65504P1527S = refreshIp65504P1527S();
        }
   		return ip65504P1527S;
	}
	
	/**
	 * 	Update Ip65504P1527S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1527-S
	 *	@param number
	 */
	public void setIp65504P1527S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1527S = checkIp65504P1527SMaxLimit(number); 
		serializeIp65504P1527S(ip65504P1527S);
	}

	public void setIp65504P1527S(int number) {
	    number = checkIp65504P1527SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1527S((short)number);
	}
	public void setIp65504P1527S(long number) {
	    number = checkIp65504P1527SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1527S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1527L
	 *	@return ip65504P1527L
	 */
	public short getIp65504P1527L() throws CFException {
        if (isIp65504P1527LModified()) { 
           ip65504P1527L = refreshIp65504P1527L();
        }
   		return ip65504P1527L;
	}
	
	/**
	 * 	Update Ip65504P1527L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1527-L
	 *	@param number
	 */
	public void setIp65504P1527L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1527L = checkIp65504P1527LMaxLimit(number); 
		serializeIp65504P1527L(ip65504P1527L);
	}

	public void setIp65504P1527L(int number) {
	    number = checkIp65504P1527LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1527L((short)number);
	}
	public void setIp65504P1527L(long number) {
	    number = checkIp65504P1527LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1527L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1528S
	 *	@return ip65504P1528S
	 */
	public short getIp65504P1528S() throws CFException {
        if (isIp65504P1528SModified()) { 
           ip65504P1528S = refreshIp65504P1528S();
        }
   		return ip65504P1528S;
	}
	
	/**
	 * 	Update Ip65504P1528S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1528-S
	 *	@param number
	 */
	public void setIp65504P1528S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1528S = checkIp65504P1528SMaxLimit(number); 
		serializeIp65504P1528S(ip65504P1528S);
	}

	public void setIp65504P1528S(int number) {
	    number = checkIp65504P1528SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1528S((short)number);
	}
	public void setIp65504P1528S(long number) {
	    number = checkIp65504P1528SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1528S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1528L
	 *	@return ip65504P1528L
	 */
	public short getIp65504P1528L() throws CFException {
        if (isIp65504P1528LModified()) { 
           ip65504P1528L = refreshIp65504P1528L();
        }
   		return ip65504P1528L;
	}
	
	/**
	 * 	Update Ip65504P1528L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1528-L
	 *	@param number
	 */
	public void setIp65504P1528L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1528L = checkIp65504P1528LMaxLimit(number); 
		serializeIp65504P1528L(ip65504P1528L);
	}

	public void setIp65504P1528L(int number) {
	    number = checkIp65504P1528LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1528L((short)number);
	}
	public void setIp65504P1528L(long number) {
	    number = checkIp65504P1528LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1528L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1529S
	 *	@return ip65504P1529S
	 */
	public short getIp65504P1529S() throws CFException {
        if (isIp65504P1529SModified()) { 
           ip65504P1529S = refreshIp65504P1529S();
        }
   		return ip65504P1529S;
	}
	
	/**
	 * 	Update Ip65504P1529S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1529-S
	 *	@param number
	 */
	public void setIp65504P1529S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1529S = checkIp65504P1529SMaxLimit(number); 
		serializeIp65504P1529S(ip65504P1529S);
	}

	public void setIp65504P1529S(int number) {
	    number = checkIp65504P1529SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1529S((short)number);
	}
	public void setIp65504P1529S(long number) {
	    number = checkIp65504P1529SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1529S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1529L
	 *	@return ip65504P1529L
	 */
	public short getIp65504P1529L() throws CFException {
        if (isIp65504P1529LModified()) { 
           ip65504P1529L = refreshIp65504P1529L();
        }
   		return ip65504P1529L;
	}
	
	/**
	 * 	Update Ip65504P1529L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1529-L
	 *	@param number
	 */
	public void setIp65504P1529L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1529L = checkIp65504P1529LMaxLimit(number); 
		serializeIp65504P1529L(ip65504P1529L);
	}

	public void setIp65504P1529L(int number) {
	    number = checkIp65504P1529LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1529L((short)number);
	}
	public void setIp65504P1529L(long number) {
	    number = checkIp65504P1529LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1529L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1530S
	 *	@return ip65504P1530S
	 */
	public short getIp65504P1530S() throws CFException {
        if (isIp65504P1530SModified()) { 
           ip65504P1530S = refreshIp65504P1530S();
        }
   		return ip65504P1530S;
	}
	
	/**
	 * 	Update Ip65504P1530S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1530-S
	 *	@param number
	 */
	public void setIp65504P1530S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1530S = checkIp65504P1530SMaxLimit(number); 
		serializeIp65504P1530S(ip65504P1530S);
	}

	public void setIp65504P1530S(int number) {
	    number = checkIp65504P1530SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1530S((short)number);
	}
	public void setIp65504P1530S(long number) {
	    number = checkIp65504P1530SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1530S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1530L
	 *	@return ip65504P1530L
	 */
	public short getIp65504P1530L() throws CFException {
        if (isIp65504P1530LModified()) { 
           ip65504P1530L = refreshIp65504P1530L();
        }
   		return ip65504P1530L;
	}
	
	/**
	 * 	Update Ip65504P1530L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1530-L
	 *	@param number
	 */
	public void setIp65504P1530L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1530L = checkIp65504P1530LMaxLimit(number); 
		serializeIp65504P1530L(ip65504P1530L);
	}

	public void setIp65504P1530L(int number) {
	    number = checkIp65504P1530LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1530L((short)number);
	}
	public void setIp65504P1530L(long number) {
	    number = checkIp65504P1530LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1530L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1531S
	 *	@return ip65504P1531S
	 */
	public short getIp65504P1531S() throws CFException {
        if (isIp65504P1531SModified()) { 
           ip65504P1531S = refreshIp65504P1531S();
        }
   		return ip65504P1531S;
	}
	
	/**
	 * 	Update Ip65504P1531S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1531-S
	 *	@param number
	 */
	public void setIp65504P1531S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1531S = checkIp65504P1531SMaxLimit(number); 
		serializeIp65504P1531S(ip65504P1531S);
	}

	public void setIp65504P1531S(int number) {
	    number = checkIp65504P1531SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1531S((short)number);
	}
	public void setIp65504P1531S(long number) {
	    number = checkIp65504P1531SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1531S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1531L
	 *	@return ip65504P1531L
	 */
	public short getIp65504P1531L() throws CFException {
        if (isIp65504P1531LModified()) { 
           ip65504P1531L = refreshIp65504P1531L();
        }
   		return ip65504P1531L;
	}
	
	/**
	 * 	Update Ip65504P1531L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1531-L
	 *	@param number
	 */
	public void setIp65504P1531L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1531L = checkIp65504P1531LMaxLimit(number); 
		serializeIp65504P1531L(ip65504P1531L);
	}

	public void setIp65504P1531L(int number) {
	    number = checkIp65504P1531LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1531L((short)number);
	}
	public void setIp65504P1531L(long number) {
	    number = checkIp65504P1531LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1531L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1532S
	 *	@return ip65504P1532S
	 */
	public short getIp65504P1532S() throws CFException {
        if (isIp65504P1532SModified()) { 
           ip65504P1532S = refreshIp65504P1532S();
        }
   		return ip65504P1532S;
	}
	
	/**
	 * 	Update Ip65504P1532S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1532-S
	 *	@param number
	 */
	public void setIp65504P1532S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1532S = checkIp65504P1532SMaxLimit(number); 
		serializeIp65504P1532S(ip65504P1532S);
	}

	public void setIp65504P1532S(int number) {
	    number = checkIp65504P1532SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1532S((short)number);
	}
	public void setIp65504P1532S(long number) {
	    number = checkIp65504P1532SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1532S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1532L
	 *	@return ip65504P1532L
	 */
	public short getIp65504P1532L() throws CFException {
        if (isIp65504P1532LModified()) { 
           ip65504P1532L = refreshIp65504P1532L();
        }
   		return ip65504P1532L;
	}
	
	/**
	 * 	Update Ip65504P1532L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1532-L
	 *	@param number
	 */
	public void setIp65504P1532L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1532L = checkIp65504P1532LMaxLimit(number); 
		serializeIp65504P1532L(ip65504P1532L);
	}

	public void setIp65504P1532L(int number) {
	    number = checkIp65504P1532LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1532L((short)number);
	}
	public void setIp65504P1532L(long number) {
	    number = checkIp65504P1532LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1532L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1533S
	 *	@return ip65504P1533S
	 */
	public short getIp65504P1533S() throws CFException {
        if (isIp65504P1533SModified()) { 
           ip65504P1533S = refreshIp65504P1533S();
        }
   		return ip65504P1533S;
	}
	
	/**
	 * 	Update Ip65504P1533S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1533-S
	 *	@param number
	 */
	public void setIp65504P1533S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1533S = checkIp65504P1533SMaxLimit(number); 
		serializeIp65504P1533S(ip65504P1533S);
	}

	public void setIp65504P1533S(int number) {
	    number = checkIp65504P1533SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1533S((short)number);
	}
	public void setIp65504P1533S(long number) {
	    number = checkIp65504P1533SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1533S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1533L
	 *	@return ip65504P1533L
	 */
	public short getIp65504P1533L() throws CFException {
        if (isIp65504P1533LModified()) { 
           ip65504P1533L = refreshIp65504P1533L();
        }
   		return ip65504P1533L;
	}
	
	/**
	 * 	Update Ip65504P1533L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1533-L
	 *	@param number
	 */
	public void setIp65504P1533L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1533L = checkIp65504P1533LMaxLimit(number); 
		serializeIp65504P1533L(ip65504P1533L);
	}

	public void setIp65504P1533L(int number) {
	    number = checkIp65504P1533LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1533L((short)number);
	}
	public void setIp65504P1533L(long number) {
	    number = checkIp65504P1533LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1533L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1534S
	 *	@return ip65504P1534S
	 */
	public short getIp65504P1534S() throws CFException {
        if (isIp65504P1534SModified()) { 
           ip65504P1534S = refreshIp65504P1534S();
        }
   		return ip65504P1534S;
	}
	
	/**
	 * 	Update Ip65504P1534S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1534-S
	 *	@param number
	 */
	public void setIp65504P1534S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1534S = checkIp65504P1534SMaxLimit(number); 
		serializeIp65504P1534S(ip65504P1534S);
	}

	public void setIp65504P1534S(int number) {
	    number = checkIp65504P1534SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1534S((short)number);
	}
	public void setIp65504P1534S(long number) {
	    number = checkIp65504P1534SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1534S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1534L
	 *	@return ip65504P1534L
	 */
	public short getIp65504P1534L() throws CFException {
        if (isIp65504P1534LModified()) { 
           ip65504P1534L = refreshIp65504P1534L();
        }
   		return ip65504P1534L;
	}
	
	/**
	 * 	Update Ip65504P1534L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1534-L
	 *	@param number
	 */
	public void setIp65504P1534L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1534L = checkIp65504P1534LMaxLimit(number); 
		serializeIp65504P1534L(ip65504P1534L);
	}

	public void setIp65504P1534L(int number) {
	    number = checkIp65504P1534LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1534L((short)number);
	}
	public void setIp65504P1534L(long number) {
	    number = checkIp65504P1534LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1534L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1535S
	 *	@return ip65504P1535S
	 */
	public short getIp65504P1535S() throws CFException {
        if (isIp65504P1535SModified()) { 
           ip65504P1535S = refreshIp65504P1535S();
        }
   		return ip65504P1535S;
	}
	
	/**
	 * 	Update Ip65504P1535S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1535-S
	 *	@param number
	 */
	public void setIp65504P1535S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1535S = checkIp65504P1535SMaxLimit(number); 
		serializeIp65504P1535S(ip65504P1535S);
	}

	public void setIp65504P1535S(int number) {
	    number = checkIp65504P1535SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1535S((short)number);
	}
	public void setIp65504P1535S(long number) {
	    number = checkIp65504P1535SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1535S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1535L
	 *	@return ip65504P1535L
	 */
	public short getIp65504P1535L() throws CFException {
        if (isIp65504P1535LModified()) { 
           ip65504P1535L = refreshIp65504P1535L();
        }
   		return ip65504P1535L;
	}
	
	/**
	 * 	Update Ip65504P1535L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1535-L
	 *	@param number
	 */
	public void setIp65504P1535L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1535L = checkIp65504P1535LMaxLimit(number); 
		serializeIp65504P1535L(ip65504P1535L);
	}

	public void setIp65504P1535L(int number) {
	    number = checkIp65504P1535LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1535L((short)number);
	}
	public void setIp65504P1535L(long number) {
	    number = checkIp65504P1535LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1535L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1536S
	 *	@return ip65504P1536S
	 */
	public short getIp65504P1536S() throws CFException {
        if (isIp65504P1536SModified()) { 
           ip65504P1536S = refreshIp65504P1536S();
        }
   		return ip65504P1536S;
	}
	
	/**
	 * 	Update Ip65504P1536S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1536-S
	 *	@param number
	 */
	public void setIp65504P1536S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1536S = checkIp65504P1536SMaxLimit(number); 
		serializeIp65504P1536S(ip65504P1536S);
	}

	public void setIp65504P1536S(int number) {
	    number = checkIp65504P1536SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1536S((short)number);
	}
	public void setIp65504P1536S(long number) {
	    number = checkIp65504P1536SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1536S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1536L
	 *	@return ip65504P1536L
	 */
	public short getIp65504P1536L() throws CFException {
        if (isIp65504P1536LModified()) { 
           ip65504P1536L = refreshIp65504P1536L();
        }
   		return ip65504P1536L;
	}
	
	/**
	 * 	Update Ip65504P1536L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1536-L
	 *	@param number
	 */
	public void setIp65504P1536L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1536L = checkIp65504P1536LMaxLimit(number); 
		serializeIp65504P1536L(ip65504P1536L);
	}

	public void setIp65504P1536L(int number) {
	    number = checkIp65504P1536LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1536L((short)number);
	}
	public void setIp65504P1536L(long number) {
	    number = checkIp65504P1536LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1536L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1537S
	 *	@return ip65504P1537S
	 */
	public short getIp65504P1537S() throws CFException {
        if (isIp65504P1537SModified()) { 
           ip65504P1537S = refreshIp65504P1537S();
        }
   		return ip65504P1537S;
	}
	
	/**
	 * 	Update Ip65504P1537S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1537-S
	 *	@param number
	 */
	public void setIp65504P1537S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1537S = checkIp65504P1537SMaxLimit(number); 
		serializeIp65504P1537S(ip65504P1537S);
	}

	public void setIp65504P1537S(int number) {
	    number = checkIp65504P1537SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1537S((short)number);
	}
	public void setIp65504P1537S(long number) {
	    number = checkIp65504P1537SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1537S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1537L
	 *	@return ip65504P1537L
	 */
	public short getIp65504P1537L() throws CFException {
        if (isIp65504P1537LModified()) { 
           ip65504P1537L = refreshIp65504P1537L();
        }
   		return ip65504P1537L;
	}
	
	/**
	 * 	Update Ip65504P1537L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1537-L
	 *	@param number
	 */
	public void setIp65504P1537L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1537L = checkIp65504P1537LMaxLimit(number); 
		serializeIp65504P1537L(ip65504P1537L);
	}

	public void setIp65504P1537L(int number) {
	    number = checkIp65504P1537LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1537L((short)number);
	}
	public void setIp65504P1537L(long number) {
	    number = checkIp65504P1537LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1537L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1538S
	 *	@return ip65504P1538S
	 */
	public short getIp65504P1538S() throws CFException {
        if (isIp65504P1538SModified()) { 
           ip65504P1538S = refreshIp65504P1538S();
        }
   		return ip65504P1538S;
	}
	
	/**
	 * 	Update Ip65504P1538S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1538-S
	 *	@param number
	 */
	public void setIp65504P1538S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1538S = checkIp65504P1538SMaxLimit(number); 
		serializeIp65504P1538S(ip65504P1538S);
	}

	public void setIp65504P1538S(int number) {
	    number = checkIp65504P1538SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1538S((short)number);
	}
	public void setIp65504P1538S(long number) {
	    number = checkIp65504P1538SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1538S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1538L
	 *	@return ip65504P1538L
	 */
	public short getIp65504P1538L() throws CFException {
        if (isIp65504P1538LModified()) { 
           ip65504P1538L = refreshIp65504P1538L();
        }
   		return ip65504P1538L;
	}
	
	/**
	 * 	Update Ip65504P1538L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1538-L
	 *	@param number
	 */
	public void setIp65504P1538L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1538L = checkIp65504P1538LMaxLimit(number); 
		serializeIp65504P1538L(ip65504P1538L);
	}

	public void setIp65504P1538L(int number) {
	    number = checkIp65504P1538LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1538L((short)number);
	}
	public void setIp65504P1538L(long number) {
	    number = checkIp65504P1538LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1538L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1539S
	 *	@return ip65504P1539S
	 */
	public short getIp65504P1539S() throws CFException {
        if (isIp65504P1539SModified()) { 
           ip65504P1539S = refreshIp65504P1539S();
        }
   		return ip65504P1539S;
	}
	
	/**
	 * 	Update Ip65504P1539S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1539-S
	 *	@param number
	 */
	public void setIp65504P1539S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1539S = checkIp65504P1539SMaxLimit(number); 
		serializeIp65504P1539S(ip65504P1539S);
	}

	public void setIp65504P1539S(int number) {
	    number = checkIp65504P1539SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1539S((short)number);
	}
	public void setIp65504P1539S(long number) {
	    number = checkIp65504P1539SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1539S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1539L
	 *	@return ip65504P1539L
	 */
	public short getIp65504P1539L() throws CFException {
        if (isIp65504P1539LModified()) { 
           ip65504P1539L = refreshIp65504P1539L();
        }
   		return ip65504P1539L;
	}
	
	/**
	 * 	Update Ip65504P1539L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1539-L
	 *	@param number
	 */
	public void setIp65504P1539L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1539L = checkIp65504P1539LMaxLimit(number); 
		serializeIp65504P1539L(ip65504P1539L);
	}

	public void setIp65504P1539L(int number) {
	    number = checkIp65504P1539LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1539L((short)number);
	}
	public void setIp65504P1539L(long number) {
	    number = checkIp65504P1539LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1539L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1540S
	 *	@return ip65504P1540S
	 */
	public short getIp65504P1540S() throws CFException {
        if (isIp65504P1540SModified()) { 
           ip65504P1540S = refreshIp65504P1540S();
        }
   		return ip65504P1540S;
	}
	
	/**
	 * 	Update Ip65504P1540S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1540-S
	 *	@param number
	 */
	public void setIp65504P1540S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1540S = checkIp65504P1540SMaxLimit(number); 
		serializeIp65504P1540S(ip65504P1540S);
	}

	public void setIp65504P1540S(int number) {
	    number = checkIp65504P1540SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1540S((short)number);
	}
	public void setIp65504P1540S(long number) {
	    number = checkIp65504P1540SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1540S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1540L
	 *	@return ip65504P1540L
	 */
	public short getIp65504P1540L() throws CFException {
        if (isIp65504P1540LModified()) { 
           ip65504P1540L = refreshIp65504P1540L();
        }
   		return ip65504P1540L;
	}
	
	/**
	 * 	Update Ip65504P1540L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1540-L
	 *	@param number
	 */
	public void setIp65504P1540L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1540L = checkIp65504P1540LMaxLimit(number); 
		serializeIp65504P1540L(ip65504P1540L);
	}

	public void setIp65504P1540L(int number) {
	    number = checkIp65504P1540LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1540L((short)number);
	}
	public void setIp65504P1540L(long number) {
	    number = checkIp65504P1540LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1540L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1541S
	 *	@return ip65504P1541S
	 */
	public short getIp65504P1541S() throws CFException {
        if (isIp65504P1541SModified()) { 
           ip65504P1541S = refreshIp65504P1541S();
        }
   		return ip65504P1541S;
	}
	
	/**
	 * 	Update Ip65504P1541S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1541-S
	 *	@param number
	 */
	public void setIp65504P1541S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1541S = checkIp65504P1541SMaxLimit(number); 
		serializeIp65504P1541S(ip65504P1541S);
	}

	public void setIp65504P1541S(int number) {
	    number = checkIp65504P1541SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1541S((short)number);
	}
	public void setIp65504P1541S(long number) {
	    number = checkIp65504P1541SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1541S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1541L
	 *	@return ip65504P1541L
	 */
	public short getIp65504P1541L() throws CFException {
        if (isIp65504P1541LModified()) { 
           ip65504P1541L = refreshIp65504P1541L();
        }
   		return ip65504P1541L;
	}
	
	/**
	 * 	Update Ip65504P1541L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1541-L
	 *	@param number
	 */
	public void setIp65504P1541L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1541L = checkIp65504P1541LMaxLimit(number); 
		serializeIp65504P1541L(ip65504P1541L);
	}

	public void setIp65504P1541L(int number) {
	    number = checkIp65504P1541LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1541L((short)number);
	}
	public void setIp65504P1541L(long number) {
	    number = checkIp65504P1541LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1541L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1542S
	 *	@return ip65504P1542S
	 */
	public short getIp65504P1542S() throws CFException {
        if (isIp65504P1542SModified()) { 
           ip65504P1542S = refreshIp65504P1542S();
        }
   		return ip65504P1542S;
	}
	
	/**
	 * 	Update Ip65504P1542S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1542-S
	 *	@param number
	 */
	public void setIp65504P1542S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1542S = checkIp65504P1542SMaxLimit(number); 
		serializeIp65504P1542S(ip65504P1542S);
	}

	public void setIp65504P1542S(int number) {
	    number = checkIp65504P1542SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1542S((short)number);
	}
	public void setIp65504P1542S(long number) {
	    number = checkIp65504P1542SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1542S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1542L
	 *	@return ip65504P1542L
	 */
	public short getIp65504P1542L() throws CFException {
        if (isIp65504P1542LModified()) { 
           ip65504P1542L = refreshIp65504P1542L();
        }
   		return ip65504P1542L;
	}
	
	/**
	 * 	Update Ip65504P1542L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1542-L
	 *	@param number
	 */
	public void setIp65504P1542L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1542L = checkIp65504P1542LMaxLimit(number); 
		serializeIp65504P1542L(ip65504P1542L);
	}

	public void setIp65504P1542L(int number) {
	    number = checkIp65504P1542LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1542L((short)number);
	}
	public void setIp65504P1542L(long number) {
	    number = checkIp65504P1542LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1542L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1543S
	 *	@return ip65504P1543S
	 */
	public short getIp65504P1543S() throws CFException {
        if (isIp65504P1543SModified()) { 
           ip65504P1543S = refreshIp65504P1543S();
        }
   		return ip65504P1543S;
	}
	
	/**
	 * 	Update Ip65504P1543S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1543-S
	 *	@param number
	 */
	public void setIp65504P1543S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1543S = checkIp65504P1543SMaxLimit(number); 
		serializeIp65504P1543S(ip65504P1543S);
	}

	public void setIp65504P1543S(int number) {
	    number = checkIp65504P1543SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1543S((short)number);
	}
	public void setIp65504P1543S(long number) {
	    number = checkIp65504P1543SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1543S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1543L
	 *	@return ip65504P1543L
	 */
	public short getIp65504P1543L() throws CFException {
        if (isIp65504P1543LModified()) { 
           ip65504P1543L = refreshIp65504P1543L();
        }
   		return ip65504P1543L;
	}
	
	/**
	 * 	Update Ip65504P1543L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1543-L
	 *	@param number
	 */
	public void setIp65504P1543L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1543L = checkIp65504P1543LMaxLimit(number); 
		serializeIp65504P1543L(ip65504P1543L);
	}

	public void setIp65504P1543L(int number) {
	    number = checkIp65504P1543LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1543L((short)number);
	}
	public void setIp65504P1543L(long number) {
	    number = checkIp65504P1543LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1543L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1544S
	 *	@return ip65504P1544S
	 */
	public short getIp65504P1544S() throws CFException {
        if (isIp65504P1544SModified()) { 
           ip65504P1544S = refreshIp65504P1544S();
        }
   		return ip65504P1544S;
	}
	
	/**
	 * 	Update Ip65504P1544S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1544-S
	 *	@param number
	 */
	public void setIp65504P1544S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1544S = checkIp65504P1544SMaxLimit(number); 
		serializeIp65504P1544S(ip65504P1544S);
	}

	public void setIp65504P1544S(int number) {
	    number = checkIp65504P1544SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1544S((short)number);
	}
	public void setIp65504P1544S(long number) {
	    number = checkIp65504P1544SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1544S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1544L
	 *	@return ip65504P1544L
	 */
	public short getIp65504P1544L() throws CFException {
        if (isIp65504P1544LModified()) { 
           ip65504P1544L = refreshIp65504P1544L();
        }
   		return ip65504P1544L;
	}
	
	/**
	 * 	Update Ip65504P1544L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1544-L
	 *	@param number
	 */
	public void setIp65504P1544L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1544L = checkIp65504P1544LMaxLimit(number); 
		serializeIp65504P1544L(ip65504P1544L);
	}

	public void setIp65504P1544L(int number) {
	    number = checkIp65504P1544LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1544L((short)number);
	}
	public void setIp65504P1544L(long number) {
	    number = checkIp65504P1544LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1544L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1545S
	 *	@return ip65504P1545S
	 */
	public short getIp65504P1545S() throws CFException {
        if (isIp65504P1545SModified()) { 
           ip65504P1545S = refreshIp65504P1545S();
        }
   		return ip65504P1545S;
	}
	
	/**
	 * 	Update Ip65504P1545S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1545-S
	 *	@param number
	 */
	public void setIp65504P1545S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1545S = checkIp65504P1545SMaxLimit(number); 
		serializeIp65504P1545S(ip65504P1545S);
	}

	public void setIp65504P1545S(int number) {
	    number = checkIp65504P1545SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1545S((short)number);
	}
	public void setIp65504P1545S(long number) {
	    number = checkIp65504P1545SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1545S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1545L
	 *	@return ip65504P1545L
	 */
	public short getIp65504P1545L() throws CFException {
        if (isIp65504P1545LModified()) { 
           ip65504P1545L = refreshIp65504P1545L();
        }
   		return ip65504P1545L;
	}
	
	/**
	 * 	Update Ip65504P1545L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1545-L
	 *	@param number
	 */
	public void setIp65504P1545L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1545L = checkIp65504P1545LMaxLimit(number); 
		serializeIp65504P1545L(ip65504P1545L);
	}

	public void setIp65504P1545L(int number) {
	    number = checkIp65504P1545LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1545L((short)number);
	}
	public void setIp65504P1545L(long number) {
	    number = checkIp65504P1545LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1545L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1546S
	 *	@return ip65504P1546S
	 */
	public short getIp65504P1546S() throws CFException {
        if (isIp65504P1546SModified()) { 
           ip65504P1546S = refreshIp65504P1546S();
        }
   		return ip65504P1546S;
	}
	
	/**
	 * 	Update Ip65504P1546S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1546-S
	 *	@param number
	 */
	public void setIp65504P1546S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1546S = checkIp65504P1546SMaxLimit(number); 
		serializeIp65504P1546S(ip65504P1546S);
	}

	public void setIp65504P1546S(int number) {
	    number = checkIp65504P1546SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1546S((short)number);
	}
	public void setIp65504P1546S(long number) {
	    number = checkIp65504P1546SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1546S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1546L
	 *	@return ip65504P1546L
	 */
	public short getIp65504P1546L() throws CFException {
        if (isIp65504P1546LModified()) { 
           ip65504P1546L = refreshIp65504P1546L();
        }
   		return ip65504P1546L;
	}
	
	/**
	 * 	Update Ip65504P1546L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1546-L
	 *	@param number
	 */
	public void setIp65504P1546L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1546L = checkIp65504P1546LMaxLimit(number); 
		serializeIp65504P1546L(ip65504P1546L);
	}

	public void setIp65504P1546L(int number) {
	    number = checkIp65504P1546LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1546L((short)number);
	}
	public void setIp65504P1546L(long number) {
	    number = checkIp65504P1546LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1546L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1547S
	 *	@return ip65504P1547S
	 */
	public short getIp65504P1547S() throws CFException {
        if (isIp65504P1547SModified()) { 
           ip65504P1547S = refreshIp65504P1547S();
        }
   		return ip65504P1547S;
	}
	
	/**
	 * 	Update Ip65504P1547S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1547-S
	 *	@param number
	 */
	public void setIp65504P1547S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1547S = checkIp65504P1547SMaxLimit(number); 
		serializeIp65504P1547S(ip65504P1547S);
	}

	public void setIp65504P1547S(int number) {
	    number = checkIp65504P1547SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1547S((short)number);
	}
	public void setIp65504P1547S(long number) {
	    number = checkIp65504P1547SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1547S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1547L
	 *	@return ip65504P1547L
	 */
	public short getIp65504P1547L() throws CFException {
        if (isIp65504P1547LModified()) { 
           ip65504P1547L = refreshIp65504P1547L();
        }
   		return ip65504P1547L;
	}
	
	/**
	 * 	Update Ip65504P1547L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1547-L
	 *	@param number
	 */
	public void setIp65504P1547L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1547L = checkIp65504P1547LMaxLimit(number); 
		serializeIp65504P1547L(ip65504P1547L);
	}

	public void setIp65504P1547L(int number) {
	    number = checkIp65504P1547LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1547L((short)number);
	}
	public void setIp65504P1547L(long number) {
	    number = checkIp65504P1547LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1547L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1548S
	 *	@return ip65504P1548S
	 */
	public short getIp65504P1548S() throws CFException {
        if (isIp65504P1548SModified()) { 
           ip65504P1548S = refreshIp65504P1548S();
        }
   		return ip65504P1548S;
	}
	
	/**
	 * 	Update Ip65504P1548S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1548-S
	 *	@param number
	 */
	public void setIp65504P1548S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1548S = checkIp65504P1548SMaxLimit(number); 
		serializeIp65504P1548S(ip65504P1548S);
	}

	public void setIp65504P1548S(int number) {
	    number = checkIp65504P1548SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1548S((short)number);
	}
	public void setIp65504P1548S(long number) {
	    number = checkIp65504P1548SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1548S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1548L
	 *	@return ip65504P1548L
	 */
	public short getIp65504P1548L() throws CFException {
        if (isIp65504P1548LModified()) { 
           ip65504P1548L = refreshIp65504P1548L();
        }
   		return ip65504P1548L;
	}
	
	/**
	 * 	Update Ip65504P1548L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1548-L
	 *	@param number
	 */
	public void setIp65504P1548L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1548L = checkIp65504P1548LMaxLimit(number); 
		serializeIp65504P1548L(ip65504P1548L);
	}

	public void setIp65504P1548L(int number) {
	    number = checkIp65504P1548LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1548L((short)number);
	}
	public void setIp65504P1548L(long number) {
	    number = checkIp65504P1548LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1548L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1549S
	 *	@return ip65504P1549S
	 */
	public short getIp65504P1549S() throws CFException {
        if (isIp65504P1549SModified()) { 
           ip65504P1549S = refreshIp65504P1549S();
        }
   		return ip65504P1549S;
	}
	
	/**
	 * 	Update Ip65504P1549S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1549-S
	 *	@param number
	 */
	public void setIp65504P1549S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1549S = checkIp65504P1549SMaxLimit(number); 
		serializeIp65504P1549S(ip65504P1549S);
	}

	public void setIp65504P1549S(int number) {
	    number = checkIp65504P1549SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1549S((short)number);
	}
	public void setIp65504P1549S(long number) {
	    number = checkIp65504P1549SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1549S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1549L
	 *	@return ip65504P1549L
	 */
	public short getIp65504P1549L() throws CFException {
        if (isIp65504P1549LModified()) { 
           ip65504P1549L = refreshIp65504P1549L();
        }
   		return ip65504P1549L;
	}
	
	/**
	 * 	Update Ip65504P1549L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1549-L
	 *	@param number
	 */
	public void setIp65504P1549L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1549L = checkIp65504P1549LMaxLimit(number); 
		serializeIp65504P1549L(ip65504P1549L);
	}

	public void setIp65504P1549L(int number) {
	    number = checkIp65504P1549LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1549L((short)number);
	}
	public void setIp65504P1549L(long number) {
	    number = checkIp65504P1549LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1549L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1550S
	 *	@return ip65504P1550S
	 */
	public short getIp65504P1550S() throws CFException {
        if (isIp65504P1550SModified()) { 
           ip65504P1550S = refreshIp65504P1550S();
        }
   		return ip65504P1550S;
	}
	
	/**
	 * 	Update Ip65504P1550S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1550-S
	 *	@param number
	 */
	public void setIp65504P1550S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1550S = checkIp65504P1550SMaxLimit(number); 
		serializeIp65504P1550S(ip65504P1550S);
	}

	public void setIp65504P1550S(int number) {
	    number = checkIp65504P1550SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1550S((short)number);
	}
	public void setIp65504P1550S(long number) {
	    number = checkIp65504P1550SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1550S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1550L
	 *	@return ip65504P1550L
	 */
	public short getIp65504P1550L() throws CFException {
        if (isIp65504P1550LModified()) { 
           ip65504P1550L = refreshIp65504P1550L();
        }
   		return ip65504P1550L;
	}
	
	/**
	 * 	Update Ip65504P1550L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1550-L
	 *	@param number
	 */
	public void setIp65504P1550L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1550L = checkIp65504P1550LMaxLimit(number); 
		serializeIp65504P1550L(ip65504P1550L);
	}

	public void setIp65504P1550L(int number) {
	    number = checkIp65504P1550LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1550L((short)number);
	}
	public void setIp65504P1550L(long number) {
	    number = checkIp65504P1550LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1550L((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup50
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P1520S((short)0);
         	setIp65504P1520L((short)0);
         	setIp65504P1521S((short)0);
         	setIp65504P1521L((short)0);
         	setIp65504P1522S((short)0);
         	setIp65504P1522L((short)0);
         	setIp65504P1523S((short)0);
         	setIp65504P1523L((short)0);
         	setIp65504P1524S((short)0);
         	setIp65504P1524L((short)0);
         	setIp65504P1525S((short)0);
         	setIp65504P1525L((short)0);
         	setIp65504P1526S((short)0);
         	setIp65504P1526L((short)0);
         	setIp65504P1527S((short)0);
         	setIp65504P1527L((short)0);
         	setIp65504P1528S((short)0);
         	setIp65504P1528L((short)0);
         	setIp65504P1529S((short)0);
         	setIp65504P1529L((short)0);
         	setIp65504P1530S((short)0);
         	setIp65504P1530L((short)0);
         	setIp65504P1531S((short)0);
         	setIp65504P1531L((short)0);
         	setIp65504P1532S((short)0);
         	setIp65504P1532L((short)0);
         	setIp65504P1533S((short)0);
         	setIp65504P1533L((short)0);
         	setIp65504P1534S((short)0);
         	setIp65504P1534L((short)0);
         	setIp65504P1535S((short)0);
         	setIp65504P1535L((short)0);
         	setIp65504P1536S((short)0);
         	setIp65504P1536L((short)0);
         	setIp65504P1537S((short)0);
         	setIp65504P1537L((short)0);
         	setIp65504P1538S((short)0);
         	setIp65504P1538L((short)0);
         	setIp65504P1539S((short)0);
         	setIp65504P1539L((short)0);
         	setIp65504P1540S((short)0);
         	setIp65504P1540L((short)0);
         	setIp65504P1541S((short)0);
         	setIp65504P1541L((short)0);
         	setIp65504P1542S((short)0);
         	setIp65504P1542L((short)0);
         	setIp65504P1543S((short)0);
         	setIp65504P1543L((short)0);
         	setIp65504P1544S((short)0);
         	setIp65504P1544L((short)0);
         	setIp65504P1545S((short)0);
         	setIp65504P1545L((short)0);
         	setIp65504P1546S((short)0);
         	setIp65504P1546L((short)0);
         	setIp65504P1547S((short)0);
         	setIp65504P1547L((short)0);
         	setIp65504P1548S((short)0);
         	setIp65504P1548L((short)0);
         	setIp65504P1549S((short)0);
         	setIp65504P1549L((short)0);
         	setIp65504P1550S((short)0);
         	setIp65504P1550L((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup50FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_50_LENGTH;
		}

}
  
