package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup36 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup36 extends Ip65504PdsNamesLargeGroup36Serialized { 
   

								private short ip65504P1086MemdataS;

								private short ip65504P1086MemdataL;


								private short ip65504P1087MemdataS;

								private short ip65504P1087MemdataL;


								private short ip65504P1088MemdataS;

								private short ip65504P1088MemdataL;


								private short ip65504P1089MemdataS;

								private short ip65504P1089MemdataL;


								private short ip65504P1090MemdataS;

								private short ip65504P1090MemdataL;


								private short ip65504P1091MemdataS;

								private short ip65504P1091MemdataL;


								private short ip65504P1092MemdataS;

								private short ip65504P1092MemdataL;


								private short ip65504P1093MemdataS;

								private short ip65504P1093MemdataL;


								private short ip65504P1094MemdataS;

								private short ip65504P1094MemdataL;


								private short ip65504P1095MemdataS;

								private short ip65504P1095MemdataL;


								private short ip65504P1096MemdataS;

								private short ip65504P1096MemdataL;


								private short ip65504P1097MemdataS;

								private short ip65504P1097MemdataL;


								private short ip65504P1098MemdataS;

								private short ip65504P1098MemdataL;


								private short ip65504P1099MemdataS;

								private short ip65504P1099MemdataL;


								private short ip65504P1100S;

								private short ip65504P1100L;


								private short ip65504P1101S;

								private short ip65504P1101L;


								private short ip65504P1102S;

								private short ip65504P1102L;


								private short ip65504P1103S;

								private short ip65504P1103L;


								private short ip65504P1104S;

								private short ip65504P1104L;


								private short ip65504P1105S;

								private short ip65504P1105L;


								private short ip65504P1106S;

								private short ip65504P1106L;


								private short ip65504P1107S;

								private short ip65504P1107L;


								private short ip65504P1108S;

								private short ip65504P1108L;


								private short ip65504P1109S;

								private short ip65504P1109L;


								private short ip65504P1110S;

								private short ip65504P1110L;


								private short ip65504P1111S;

								private short ip65504P1111L;


								private short ip65504P1112S;

								private short ip65504P1112L;


								private short ip65504P1113S;

								private short ip65504P1113L;


								private short ip65504P1114S;

								private short ip65504P1114L;


								private short ip65504P1115S;

								private short ip65504P1115L;


								private short ip65504P1116S;

								private short ip65504P1116L;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup36
	**/
    public Ip65504PdsNamesLargeGroup36() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup36. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup36(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P1086MemdataS
	 *	@return ip65504P1086MemdataS
	 */
	public short getIp65504P1086MemdataS() throws CFException {
        if (isIp65504P1086MemdataSModified()) { 
           ip65504P1086MemdataS = refreshIp65504P1086MemdataS();
        }
   		return ip65504P1086MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1086MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1086-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1086MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1086MemdataS = checkIp65504P1086MemdataSMaxLimit(number); 
		serializeIp65504P1086MemdataS(ip65504P1086MemdataS);
	}

	public void setIp65504P1086MemdataS(int number) {
	    number = checkIp65504P1086MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1086MemdataS((short)number);
	}
	public void setIp65504P1086MemdataS(long number) {
	    number = checkIp65504P1086MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1086MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1086MemdataL
	 *	@return ip65504P1086MemdataL
	 */
	public short getIp65504P1086MemdataL() throws CFException {
        if (isIp65504P1086MemdataLModified()) { 
           ip65504P1086MemdataL = refreshIp65504P1086MemdataL();
        }
   		return ip65504P1086MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1086MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1086-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1086MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1086MemdataL = checkIp65504P1086MemdataLMaxLimit(number); 
		serializeIp65504P1086MemdataL(ip65504P1086MemdataL);
	}

	public void setIp65504P1086MemdataL(int number) {
	    number = checkIp65504P1086MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1086MemdataL((short)number);
	}
	public void setIp65504P1086MemdataL(long number) {
	    number = checkIp65504P1086MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1086MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1087MemdataS
	 *	@return ip65504P1087MemdataS
	 */
	public short getIp65504P1087MemdataS() throws CFException {
        if (isIp65504P1087MemdataSModified()) { 
           ip65504P1087MemdataS = refreshIp65504P1087MemdataS();
        }
   		return ip65504P1087MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1087MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1087-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1087MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1087MemdataS = checkIp65504P1087MemdataSMaxLimit(number); 
		serializeIp65504P1087MemdataS(ip65504P1087MemdataS);
	}

	public void setIp65504P1087MemdataS(int number) {
	    number = checkIp65504P1087MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1087MemdataS((short)number);
	}
	public void setIp65504P1087MemdataS(long number) {
	    number = checkIp65504P1087MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1087MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1087MemdataL
	 *	@return ip65504P1087MemdataL
	 */
	public short getIp65504P1087MemdataL() throws CFException {
        if (isIp65504P1087MemdataLModified()) { 
           ip65504P1087MemdataL = refreshIp65504P1087MemdataL();
        }
   		return ip65504P1087MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1087MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1087-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1087MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1087MemdataL = checkIp65504P1087MemdataLMaxLimit(number); 
		serializeIp65504P1087MemdataL(ip65504P1087MemdataL);
	}

	public void setIp65504P1087MemdataL(int number) {
	    number = checkIp65504P1087MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1087MemdataL((short)number);
	}
	public void setIp65504P1087MemdataL(long number) {
	    number = checkIp65504P1087MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1087MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1088MemdataS
	 *	@return ip65504P1088MemdataS
	 */
	public short getIp65504P1088MemdataS() throws CFException {
        if (isIp65504P1088MemdataSModified()) { 
           ip65504P1088MemdataS = refreshIp65504P1088MemdataS();
        }
   		return ip65504P1088MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1088MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1088-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1088MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1088MemdataS = checkIp65504P1088MemdataSMaxLimit(number); 
		serializeIp65504P1088MemdataS(ip65504P1088MemdataS);
	}

	public void setIp65504P1088MemdataS(int number) {
	    number = checkIp65504P1088MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1088MemdataS((short)number);
	}
	public void setIp65504P1088MemdataS(long number) {
	    number = checkIp65504P1088MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1088MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1088MemdataL
	 *	@return ip65504P1088MemdataL
	 */
	public short getIp65504P1088MemdataL() throws CFException {
        if (isIp65504P1088MemdataLModified()) { 
           ip65504P1088MemdataL = refreshIp65504P1088MemdataL();
        }
   		return ip65504P1088MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1088MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1088-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1088MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1088MemdataL = checkIp65504P1088MemdataLMaxLimit(number); 
		serializeIp65504P1088MemdataL(ip65504P1088MemdataL);
	}

	public void setIp65504P1088MemdataL(int number) {
	    number = checkIp65504P1088MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1088MemdataL((short)number);
	}
	public void setIp65504P1088MemdataL(long number) {
	    number = checkIp65504P1088MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1088MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1089MemdataS
	 *	@return ip65504P1089MemdataS
	 */
	public short getIp65504P1089MemdataS() throws CFException {
        if (isIp65504P1089MemdataSModified()) { 
           ip65504P1089MemdataS = refreshIp65504P1089MemdataS();
        }
   		return ip65504P1089MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1089MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1089-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1089MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1089MemdataS = checkIp65504P1089MemdataSMaxLimit(number); 
		serializeIp65504P1089MemdataS(ip65504P1089MemdataS);
	}

	public void setIp65504P1089MemdataS(int number) {
	    number = checkIp65504P1089MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1089MemdataS((short)number);
	}
	public void setIp65504P1089MemdataS(long number) {
	    number = checkIp65504P1089MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1089MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1089MemdataL
	 *	@return ip65504P1089MemdataL
	 */
	public short getIp65504P1089MemdataL() throws CFException {
        if (isIp65504P1089MemdataLModified()) { 
           ip65504P1089MemdataL = refreshIp65504P1089MemdataL();
        }
   		return ip65504P1089MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1089MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1089-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1089MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1089MemdataL = checkIp65504P1089MemdataLMaxLimit(number); 
		serializeIp65504P1089MemdataL(ip65504P1089MemdataL);
	}

	public void setIp65504P1089MemdataL(int number) {
	    number = checkIp65504P1089MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1089MemdataL((short)number);
	}
	public void setIp65504P1089MemdataL(long number) {
	    number = checkIp65504P1089MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1089MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1090MemdataS
	 *	@return ip65504P1090MemdataS
	 */
	public short getIp65504P1090MemdataS() throws CFException {
        if (isIp65504P1090MemdataSModified()) { 
           ip65504P1090MemdataS = refreshIp65504P1090MemdataS();
        }
   		return ip65504P1090MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1090MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1090-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1090MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1090MemdataS = checkIp65504P1090MemdataSMaxLimit(number); 
		serializeIp65504P1090MemdataS(ip65504P1090MemdataS);
	}

	public void setIp65504P1090MemdataS(int number) {
	    number = checkIp65504P1090MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1090MemdataS((short)number);
	}
	public void setIp65504P1090MemdataS(long number) {
	    number = checkIp65504P1090MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1090MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1090MemdataL
	 *	@return ip65504P1090MemdataL
	 */
	public short getIp65504P1090MemdataL() throws CFException {
        if (isIp65504P1090MemdataLModified()) { 
           ip65504P1090MemdataL = refreshIp65504P1090MemdataL();
        }
   		return ip65504P1090MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1090MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1090-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1090MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1090MemdataL = checkIp65504P1090MemdataLMaxLimit(number); 
		serializeIp65504P1090MemdataL(ip65504P1090MemdataL);
	}

	public void setIp65504P1090MemdataL(int number) {
	    number = checkIp65504P1090MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1090MemdataL((short)number);
	}
	public void setIp65504P1090MemdataL(long number) {
	    number = checkIp65504P1090MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1090MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1091MemdataS
	 *	@return ip65504P1091MemdataS
	 */
	public short getIp65504P1091MemdataS() throws CFException {
        if (isIp65504P1091MemdataSModified()) { 
           ip65504P1091MemdataS = refreshIp65504P1091MemdataS();
        }
   		return ip65504P1091MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1091MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1091-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1091MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1091MemdataS = checkIp65504P1091MemdataSMaxLimit(number); 
		serializeIp65504P1091MemdataS(ip65504P1091MemdataS);
	}

	public void setIp65504P1091MemdataS(int number) {
	    number = checkIp65504P1091MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1091MemdataS((short)number);
	}
	public void setIp65504P1091MemdataS(long number) {
	    number = checkIp65504P1091MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1091MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1091MemdataL
	 *	@return ip65504P1091MemdataL
	 */
	public short getIp65504P1091MemdataL() throws CFException {
        if (isIp65504P1091MemdataLModified()) { 
           ip65504P1091MemdataL = refreshIp65504P1091MemdataL();
        }
   		return ip65504P1091MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1091MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1091-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1091MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1091MemdataL = checkIp65504P1091MemdataLMaxLimit(number); 
		serializeIp65504P1091MemdataL(ip65504P1091MemdataL);
	}

	public void setIp65504P1091MemdataL(int number) {
	    number = checkIp65504P1091MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1091MemdataL((short)number);
	}
	public void setIp65504P1091MemdataL(long number) {
	    number = checkIp65504P1091MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1091MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1092MemdataS
	 *	@return ip65504P1092MemdataS
	 */
	public short getIp65504P1092MemdataS() throws CFException {
        if (isIp65504P1092MemdataSModified()) { 
           ip65504P1092MemdataS = refreshIp65504P1092MemdataS();
        }
   		return ip65504P1092MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1092MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1092-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1092MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1092MemdataS = checkIp65504P1092MemdataSMaxLimit(number); 
		serializeIp65504P1092MemdataS(ip65504P1092MemdataS);
	}

	public void setIp65504P1092MemdataS(int number) {
	    number = checkIp65504P1092MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1092MemdataS((short)number);
	}
	public void setIp65504P1092MemdataS(long number) {
	    number = checkIp65504P1092MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1092MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1092MemdataL
	 *	@return ip65504P1092MemdataL
	 */
	public short getIp65504P1092MemdataL() throws CFException {
        if (isIp65504P1092MemdataLModified()) { 
           ip65504P1092MemdataL = refreshIp65504P1092MemdataL();
        }
   		return ip65504P1092MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1092MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1092-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1092MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1092MemdataL = checkIp65504P1092MemdataLMaxLimit(number); 
		serializeIp65504P1092MemdataL(ip65504P1092MemdataL);
	}

	public void setIp65504P1092MemdataL(int number) {
	    number = checkIp65504P1092MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1092MemdataL((short)number);
	}
	public void setIp65504P1092MemdataL(long number) {
	    number = checkIp65504P1092MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1092MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1093MemdataS
	 *	@return ip65504P1093MemdataS
	 */
	public short getIp65504P1093MemdataS() throws CFException {
        if (isIp65504P1093MemdataSModified()) { 
           ip65504P1093MemdataS = refreshIp65504P1093MemdataS();
        }
   		return ip65504P1093MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1093MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1093-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1093MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1093MemdataS = checkIp65504P1093MemdataSMaxLimit(number); 
		serializeIp65504P1093MemdataS(ip65504P1093MemdataS);
	}

	public void setIp65504P1093MemdataS(int number) {
	    number = checkIp65504P1093MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1093MemdataS((short)number);
	}
	public void setIp65504P1093MemdataS(long number) {
	    number = checkIp65504P1093MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1093MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1093MemdataL
	 *	@return ip65504P1093MemdataL
	 */
	public short getIp65504P1093MemdataL() throws CFException {
        if (isIp65504P1093MemdataLModified()) { 
           ip65504P1093MemdataL = refreshIp65504P1093MemdataL();
        }
   		return ip65504P1093MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1093MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1093-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1093MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1093MemdataL = checkIp65504P1093MemdataLMaxLimit(number); 
		serializeIp65504P1093MemdataL(ip65504P1093MemdataL);
	}

	public void setIp65504P1093MemdataL(int number) {
	    number = checkIp65504P1093MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1093MemdataL((short)number);
	}
	public void setIp65504P1093MemdataL(long number) {
	    number = checkIp65504P1093MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1093MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1094MemdataS
	 *	@return ip65504P1094MemdataS
	 */
	public short getIp65504P1094MemdataS() throws CFException {
        if (isIp65504P1094MemdataSModified()) { 
           ip65504P1094MemdataS = refreshIp65504P1094MemdataS();
        }
   		return ip65504P1094MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1094MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1094-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1094MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1094MemdataS = checkIp65504P1094MemdataSMaxLimit(number); 
		serializeIp65504P1094MemdataS(ip65504P1094MemdataS);
	}

	public void setIp65504P1094MemdataS(int number) {
	    number = checkIp65504P1094MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1094MemdataS((short)number);
	}
	public void setIp65504P1094MemdataS(long number) {
	    number = checkIp65504P1094MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1094MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1094MemdataL
	 *	@return ip65504P1094MemdataL
	 */
	public short getIp65504P1094MemdataL() throws CFException {
        if (isIp65504P1094MemdataLModified()) { 
           ip65504P1094MemdataL = refreshIp65504P1094MemdataL();
        }
   		return ip65504P1094MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1094MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1094-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1094MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1094MemdataL = checkIp65504P1094MemdataLMaxLimit(number); 
		serializeIp65504P1094MemdataL(ip65504P1094MemdataL);
	}

	public void setIp65504P1094MemdataL(int number) {
	    number = checkIp65504P1094MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1094MemdataL((short)number);
	}
	public void setIp65504P1094MemdataL(long number) {
	    number = checkIp65504P1094MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1094MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1095MemdataS
	 *	@return ip65504P1095MemdataS
	 */
	public short getIp65504P1095MemdataS() throws CFException {
        if (isIp65504P1095MemdataSModified()) { 
           ip65504P1095MemdataS = refreshIp65504P1095MemdataS();
        }
   		return ip65504P1095MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1095MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1095-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1095MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1095MemdataS = checkIp65504P1095MemdataSMaxLimit(number); 
		serializeIp65504P1095MemdataS(ip65504P1095MemdataS);
	}

	public void setIp65504P1095MemdataS(int number) {
	    number = checkIp65504P1095MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1095MemdataS((short)number);
	}
	public void setIp65504P1095MemdataS(long number) {
	    number = checkIp65504P1095MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1095MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1095MemdataL
	 *	@return ip65504P1095MemdataL
	 */
	public short getIp65504P1095MemdataL() throws CFException {
        if (isIp65504P1095MemdataLModified()) { 
           ip65504P1095MemdataL = refreshIp65504P1095MemdataL();
        }
   		return ip65504P1095MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1095MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1095-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1095MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1095MemdataL = checkIp65504P1095MemdataLMaxLimit(number); 
		serializeIp65504P1095MemdataL(ip65504P1095MemdataL);
	}

	public void setIp65504P1095MemdataL(int number) {
	    number = checkIp65504P1095MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1095MemdataL((short)number);
	}
	public void setIp65504P1095MemdataL(long number) {
	    number = checkIp65504P1095MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1095MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1096MemdataS
	 *	@return ip65504P1096MemdataS
	 */
	public short getIp65504P1096MemdataS() throws CFException {
        if (isIp65504P1096MemdataSModified()) { 
           ip65504P1096MemdataS = refreshIp65504P1096MemdataS();
        }
   		return ip65504P1096MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1096MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1096-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1096MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1096MemdataS = checkIp65504P1096MemdataSMaxLimit(number); 
		serializeIp65504P1096MemdataS(ip65504P1096MemdataS);
	}

	public void setIp65504P1096MemdataS(int number) {
	    number = checkIp65504P1096MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1096MemdataS((short)number);
	}
	public void setIp65504P1096MemdataS(long number) {
	    number = checkIp65504P1096MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1096MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1096MemdataL
	 *	@return ip65504P1096MemdataL
	 */
	public short getIp65504P1096MemdataL() throws CFException {
        if (isIp65504P1096MemdataLModified()) { 
           ip65504P1096MemdataL = refreshIp65504P1096MemdataL();
        }
   		return ip65504P1096MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1096MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1096-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1096MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1096MemdataL = checkIp65504P1096MemdataLMaxLimit(number); 
		serializeIp65504P1096MemdataL(ip65504P1096MemdataL);
	}

	public void setIp65504P1096MemdataL(int number) {
	    number = checkIp65504P1096MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1096MemdataL((short)number);
	}
	public void setIp65504P1096MemdataL(long number) {
	    number = checkIp65504P1096MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1096MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1097MemdataS
	 *	@return ip65504P1097MemdataS
	 */
	public short getIp65504P1097MemdataS() throws CFException {
        if (isIp65504P1097MemdataSModified()) { 
           ip65504P1097MemdataS = refreshIp65504P1097MemdataS();
        }
   		return ip65504P1097MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1097MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1097-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1097MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1097MemdataS = checkIp65504P1097MemdataSMaxLimit(number); 
		serializeIp65504P1097MemdataS(ip65504P1097MemdataS);
	}

	public void setIp65504P1097MemdataS(int number) {
	    number = checkIp65504P1097MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1097MemdataS((short)number);
	}
	public void setIp65504P1097MemdataS(long number) {
	    number = checkIp65504P1097MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1097MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1097MemdataL
	 *	@return ip65504P1097MemdataL
	 */
	public short getIp65504P1097MemdataL() throws CFException {
        if (isIp65504P1097MemdataLModified()) { 
           ip65504P1097MemdataL = refreshIp65504P1097MemdataL();
        }
   		return ip65504P1097MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1097MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1097-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1097MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1097MemdataL = checkIp65504P1097MemdataLMaxLimit(number); 
		serializeIp65504P1097MemdataL(ip65504P1097MemdataL);
	}

	public void setIp65504P1097MemdataL(int number) {
	    number = checkIp65504P1097MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1097MemdataL((short)number);
	}
	public void setIp65504P1097MemdataL(long number) {
	    number = checkIp65504P1097MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1097MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1098MemdataS
	 *	@return ip65504P1098MemdataS
	 */
	public short getIp65504P1098MemdataS() throws CFException {
        if (isIp65504P1098MemdataSModified()) { 
           ip65504P1098MemdataS = refreshIp65504P1098MemdataS();
        }
   		return ip65504P1098MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1098MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1098-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1098MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1098MemdataS = checkIp65504P1098MemdataSMaxLimit(number); 
		serializeIp65504P1098MemdataS(ip65504P1098MemdataS);
	}

	public void setIp65504P1098MemdataS(int number) {
	    number = checkIp65504P1098MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1098MemdataS((short)number);
	}
	public void setIp65504P1098MemdataS(long number) {
	    number = checkIp65504P1098MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1098MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1098MemdataL
	 *	@return ip65504P1098MemdataL
	 */
	public short getIp65504P1098MemdataL() throws CFException {
        if (isIp65504P1098MemdataLModified()) { 
           ip65504P1098MemdataL = refreshIp65504P1098MemdataL();
        }
   		return ip65504P1098MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1098MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1098-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1098MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1098MemdataL = checkIp65504P1098MemdataLMaxLimit(number); 
		serializeIp65504P1098MemdataL(ip65504P1098MemdataL);
	}

	public void setIp65504P1098MemdataL(int number) {
	    number = checkIp65504P1098MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1098MemdataL((short)number);
	}
	public void setIp65504P1098MemdataL(long number) {
	    number = checkIp65504P1098MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1098MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1099MemdataS
	 *	@return ip65504P1099MemdataS
	 */
	public short getIp65504P1099MemdataS() throws CFException {
        if (isIp65504P1099MemdataSModified()) { 
           ip65504P1099MemdataS = refreshIp65504P1099MemdataS();
        }
   		return ip65504P1099MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1099MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1099-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1099MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1099MemdataS = checkIp65504P1099MemdataSMaxLimit(number); 
		serializeIp65504P1099MemdataS(ip65504P1099MemdataS);
	}

	public void setIp65504P1099MemdataS(int number) {
	    number = checkIp65504P1099MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1099MemdataS((short)number);
	}
	public void setIp65504P1099MemdataS(long number) {
	    number = checkIp65504P1099MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1099MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1099MemdataL
	 *	@return ip65504P1099MemdataL
	 */
	public short getIp65504P1099MemdataL() throws CFException {
        if (isIp65504P1099MemdataLModified()) { 
           ip65504P1099MemdataL = refreshIp65504P1099MemdataL();
        }
   		return ip65504P1099MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1099MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1099-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1099MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1099MemdataL = checkIp65504P1099MemdataLMaxLimit(number); 
		serializeIp65504P1099MemdataL(ip65504P1099MemdataL);
	}

	public void setIp65504P1099MemdataL(int number) {
	    number = checkIp65504P1099MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1099MemdataL((short)number);
	}
	public void setIp65504P1099MemdataL(long number) {
	    number = checkIp65504P1099MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1099MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1100S
	 *	@return ip65504P1100S
	 */
	public short getIp65504P1100S() throws CFException {
        if (isIp65504P1100SModified()) { 
           ip65504P1100S = refreshIp65504P1100S();
        }
   		return ip65504P1100S;
	}
	
	/**
	 * 	Update Ip65504P1100S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1100-S
	 *	@param number
	 */
	public void setIp65504P1100S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1100S = checkIp65504P1100SMaxLimit(number); 
		serializeIp65504P1100S(ip65504P1100S);
	}

	public void setIp65504P1100S(int number) {
	    number = checkIp65504P1100SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1100S((short)number);
	}
	public void setIp65504P1100S(long number) {
	    number = checkIp65504P1100SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1100S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1100L
	 *	@return ip65504P1100L
	 */
	public short getIp65504P1100L() throws CFException {
        if (isIp65504P1100LModified()) { 
           ip65504P1100L = refreshIp65504P1100L();
        }
   		return ip65504P1100L;
	}
	
	/**
	 * 	Update Ip65504P1100L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1100-L
	 *	@param number
	 */
	public void setIp65504P1100L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1100L = checkIp65504P1100LMaxLimit(number); 
		serializeIp65504P1100L(ip65504P1100L);
	}

	public void setIp65504P1100L(int number) {
	    number = checkIp65504P1100LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1100L((short)number);
	}
	public void setIp65504P1100L(long number) {
	    number = checkIp65504P1100LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1100L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1101S
	 *	@return ip65504P1101S
	 */
	public short getIp65504P1101S() throws CFException {
        if (isIp65504P1101SModified()) { 
           ip65504P1101S = refreshIp65504P1101S();
        }
   		return ip65504P1101S;
	}
	
	/**
	 * 	Update Ip65504P1101S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1101-S
	 *	@param number
	 */
	public void setIp65504P1101S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1101S = checkIp65504P1101SMaxLimit(number); 
		serializeIp65504P1101S(ip65504P1101S);
	}

	public void setIp65504P1101S(int number) {
	    number = checkIp65504P1101SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1101S((short)number);
	}
	public void setIp65504P1101S(long number) {
	    number = checkIp65504P1101SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1101S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1101L
	 *	@return ip65504P1101L
	 */
	public short getIp65504P1101L() throws CFException {
        if (isIp65504P1101LModified()) { 
           ip65504P1101L = refreshIp65504P1101L();
        }
   		return ip65504P1101L;
	}
	
	/**
	 * 	Update Ip65504P1101L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1101-L
	 *	@param number
	 */
	public void setIp65504P1101L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1101L = checkIp65504P1101LMaxLimit(number); 
		serializeIp65504P1101L(ip65504P1101L);
	}

	public void setIp65504P1101L(int number) {
	    number = checkIp65504P1101LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1101L((short)number);
	}
	public void setIp65504P1101L(long number) {
	    number = checkIp65504P1101LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1101L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1102S
	 *	@return ip65504P1102S
	 */
	public short getIp65504P1102S() throws CFException {
        if (isIp65504P1102SModified()) { 
           ip65504P1102S = refreshIp65504P1102S();
        }
   		return ip65504P1102S;
	}
	
	/**
	 * 	Update Ip65504P1102S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1102-S
	 *	@param number
	 */
	public void setIp65504P1102S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1102S = checkIp65504P1102SMaxLimit(number); 
		serializeIp65504P1102S(ip65504P1102S);
	}

	public void setIp65504P1102S(int number) {
	    number = checkIp65504P1102SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1102S((short)number);
	}
	public void setIp65504P1102S(long number) {
	    number = checkIp65504P1102SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1102S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1102L
	 *	@return ip65504P1102L
	 */
	public short getIp65504P1102L() throws CFException {
        if (isIp65504P1102LModified()) { 
           ip65504P1102L = refreshIp65504P1102L();
        }
   		return ip65504P1102L;
	}
	
	/**
	 * 	Update Ip65504P1102L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1102-L
	 *	@param number
	 */
	public void setIp65504P1102L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1102L = checkIp65504P1102LMaxLimit(number); 
		serializeIp65504P1102L(ip65504P1102L);
	}

	public void setIp65504P1102L(int number) {
	    number = checkIp65504P1102LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1102L((short)number);
	}
	public void setIp65504P1102L(long number) {
	    number = checkIp65504P1102LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1102L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1103S
	 *	@return ip65504P1103S
	 */
	public short getIp65504P1103S() throws CFException {
        if (isIp65504P1103SModified()) { 
           ip65504P1103S = refreshIp65504P1103S();
        }
   		return ip65504P1103S;
	}
	
	/**
	 * 	Update Ip65504P1103S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1103-S
	 *	@param number
	 */
	public void setIp65504P1103S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1103S = checkIp65504P1103SMaxLimit(number); 
		serializeIp65504P1103S(ip65504P1103S);
	}

	public void setIp65504P1103S(int number) {
	    number = checkIp65504P1103SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1103S((short)number);
	}
	public void setIp65504P1103S(long number) {
	    number = checkIp65504P1103SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1103S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1103L
	 *	@return ip65504P1103L
	 */
	public short getIp65504P1103L() throws CFException {
        if (isIp65504P1103LModified()) { 
           ip65504P1103L = refreshIp65504P1103L();
        }
   		return ip65504P1103L;
	}
	
	/**
	 * 	Update Ip65504P1103L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1103-L
	 *	@param number
	 */
	public void setIp65504P1103L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1103L = checkIp65504P1103LMaxLimit(number); 
		serializeIp65504P1103L(ip65504P1103L);
	}

	public void setIp65504P1103L(int number) {
	    number = checkIp65504P1103LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1103L((short)number);
	}
	public void setIp65504P1103L(long number) {
	    number = checkIp65504P1103LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1103L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1104S
	 *	@return ip65504P1104S
	 */
	public short getIp65504P1104S() throws CFException {
        if (isIp65504P1104SModified()) { 
           ip65504P1104S = refreshIp65504P1104S();
        }
   		return ip65504P1104S;
	}
	
	/**
	 * 	Update Ip65504P1104S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1104-S
	 *	@param number
	 */
	public void setIp65504P1104S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1104S = checkIp65504P1104SMaxLimit(number); 
		serializeIp65504P1104S(ip65504P1104S);
	}

	public void setIp65504P1104S(int number) {
	    number = checkIp65504P1104SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1104S((short)number);
	}
	public void setIp65504P1104S(long number) {
	    number = checkIp65504P1104SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1104S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1104L
	 *	@return ip65504P1104L
	 */
	public short getIp65504P1104L() throws CFException {
        if (isIp65504P1104LModified()) { 
           ip65504P1104L = refreshIp65504P1104L();
        }
   		return ip65504P1104L;
	}
	
	/**
	 * 	Update Ip65504P1104L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1104-L
	 *	@param number
	 */
	public void setIp65504P1104L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1104L = checkIp65504P1104LMaxLimit(number); 
		serializeIp65504P1104L(ip65504P1104L);
	}

	public void setIp65504P1104L(int number) {
	    number = checkIp65504P1104LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1104L((short)number);
	}
	public void setIp65504P1104L(long number) {
	    number = checkIp65504P1104LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1104L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1105S
	 *	@return ip65504P1105S
	 */
	public short getIp65504P1105S() throws CFException {
        if (isIp65504P1105SModified()) { 
           ip65504P1105S = refreshIp65504P1105S();
        }
   		return ip65504P1105S;
	}
	
	/**
	 * 	Update Ip65504P1105S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1105-S
	 *	@param number
	 */
	public void setIp65504P1105S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1105S = checkIp65504P1105SMaxLimit(number); 
		serializeIp65504P1105S(ip65504P1105S);
	}

	public void setIp65504P1105S(int number) {
	    number = checkIp65504P1105SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1105S((short)number);
	}
	public void setIp65504P1105S(long number) {
	    number = checkIp65504P1105SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1105S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1105L
	 *	@return ip65504P1105L
	 */
	public short getIp65504P1105L() throws CFException {
        if (isIp65504P1105LModified()) { 
           ip65504P1105L = refreshIp65504P1105L();
        }
   		return ip65504P1105L;
	}
	
	/**
	 * 	Update Ip65504P1105L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1105-L
	 *	@param number
	 */
	public void setIp65504P1105L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1105L = checkIp65504P1105LMaxLimit(number); 
		serializeIp65504P1105L(ip65504P1105L);
	}

	public void setIp65504P1105L(int number) {
	    number = checkIp65504P1105LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1105L((short)number);
	}
	public void setIp65504P1105L(long number) {
	    number = checkIp65504P1105LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1105L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1106S
	 *	@return ip65504P1106S
	 */
	public short getIp65504P1106S() throws CFException {
        if (isIp65504P1106SModified()) { 
           ip65504P1106S = refreshIp65504P1106S();
        }
   		return ip65504P1106S;
	}
	
	/**
	 * 	Update Ip65504P1106S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1106-S
	 *	@param number
	 */
	public void setIp65504P1106S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1106S = checkIp65504P1106SMaxLimit(number); 
		serializeIp65504P1106S(ip65504P1106S);
	}

	public void setIp65504P1106S(int number) {
	    number = checkIp65504P1106SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1106S((short)number);
	}
	public void setIp65504P1106S(long number) {
	    number = checkIp65504P1106SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1106S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1106L
	 *	@return ip65504P1106L
	 */
	public short getIp65504P1106L() throws CFException {
        if (isIp65504P1106LModified()) { 
           ip65504P1106L = refreshIp65504P1106L();
        }
   		return ip65504P1106L;
	}
	
	/**
	 * 	Update Ip65504P1106L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1106-L
	 *	@param number
	 */
	public void setIp65504P1106L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1106L = checkIp65504P1106LMaxLimit(number); 
		serializeIp65504P1106L(ip65504P1106L);
	}

	public void setIp65504P1106L(int number) {
	    number = checkIp65504P1106LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1106L((short)number);
	}
	public void setIp65504P1106L(long number) {
	    number = checkIp65504P1106LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1106L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1107S
	 *	@return ip65504P1107S
	 */
	public short getIp65504P1107S() throws CFException {
        if (isIp65504P1107SModified()) { 
           ip65504P1107S = refreshIp65504P1107S();
        }
   		return ip65504P1107S;
	}
	
	/**
	 * 	Update Ip65504P1107S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1107-S
	 *	@param number
	 */
	public void setIp65504P1107S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1107S = checkIp65504P1107SMaxLimit(number); 
		serializeIp65504P1107S(ip65504P1107S);
	}

	public void setIp65504P1107S(int number) {
	    number = checkIp65504P1107SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1107S((short)number);
	}
	public void setIp65504P1107S(long number) {
	    number = checkIp65504P1107SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1107S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1107L
	 *	@return ip65504P1107L
	 */
	public short getIp65504P1107L() throws CFException {
        if (isIp65504P1107LModified()) { 
           ip65504P1107L = refreshIp65504P1107L();
        }
   		return ip65504P1107L;
	}
	
	/**
	 * 	Update Ip65504P1107L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1107-L
	 *	@param number
	 */
	public void setIp65504P1107L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1107L = checkIp65504P1107LMaxLimit(number); 
		serializeIp65504P1107L(ip65504P1107L);
	}

	public void setIp65504P1107L(int number) {
	    number = checkIp65504P1107LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1107L((short)number);
	}
	public void setIp65504P1107L(long number) {
	    number = checkIp65504P1107LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1107L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1108S
	 *	@return ip65504P1108S
	 */
	public short getIp65504P1108S() throws CFException {
        if (isIp65504P1108SModified()) { 
           ip65504P1108S = refreshIp65504P1108S();
        }
   		return ip65504P1108S;
	}
	
	/**
	 * 	Update Ip65504P1108S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1108-S
	 *	@param number
	 */
	public void setIp65504P1108S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1108S = checkIp65504P1108SMaxLimit(number); 
		serializeIp65504P1108S(ip65504P1108S);
	}

	public void setIp65504P1108S(int number) {
	    number = checkIp65504P1108SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1108S((short)number);
	}
	public void setIp65504P1108S(long number) {
	    number = checkIp65504P1108SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1108S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1108L
	 *	@return ip65504P1108L
	 */
	public short getIp65504P1108L() throws CFException {
        if (isIp65504P1108LModified()) { 
           ip65504P1108L = refreshIp65504P1108L();
        }
   		return ip65504P1108L;
	}
	
	/**
	 * 	Update Ip65504P1108L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1108-L
	 *	@param number
	 */
	public void setIp65504P1108L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1108L = checkIp65504P1108LMaxLimit(number); 
		serializeIp65504P1108L(ip65504P1108L);
	}

	public void setIp65504P1108L(int number) {
	    number = checkIp65504P1108LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1108L((short)number);
	}
	public void setIp65504P1108L(long number) {
	    number = checkIp65504P1108LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1108L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1109S
	 *	@return ip65504P1109S
	 */
	public short getIp65504P1109S() throws CFException {
        if (isIp65504P1109SModified()) { 
           ip65504P1109S = refreshIp65504P1109S();
        }
   		return ip65504P1109S;
	}
	
	/**
	 * 	Update Ip65504P1109S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1109-S
	 *	@param number
	 */
	public void setIp65504P1109S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1109S = checkIp65504P1109SMaxLimit(number); 
		serializeIp65504P1109S(ip65504P1109S);
	}

	public void setIp65504P1109S(int number) {
	    number = checkIp65504P1109SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1109S((short)number);
	}
	public void setIp65504P1109S(long number) {
	    number = checkIp65504P1109SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1109S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1109L
	 *	@return ip65504P1109L
	 */
	public short getIp65504P1109L() throws CFException {
        if (isIp65504P1109LModified()) { 
           ip65504P1109L = refreshIp65504P1109L();
        }
   		return ip65504P1109L;
	}
	
	/**
	 * 	Update Ip65504P1109L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1109-L
	 *	@param number
	 */
	public void setIp65504P1109L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1109L = checkIp65504P1109LMaxLimit(number); 
		serializeIp65504P1109L(ip65504P1109L);
	}

	public void setIp65504P1109L(int number) {
	    number = checkIp65504P1109LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1109L((short)number);
	}
	public void setIp65504P1109L(long number) {
	    number = checkIp65504P1109LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1109L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1110S
	 *	@return ip65504P1110S
	 */
	public short getIp65504P1110S() throws CFException {
        if (isIp65504P1110SModified()) { 
           ip65504P1110S = refreshIp65504P1110S();
        }
   		return ip65504P1110S;
	}
	
	/**
	 * 	Update Ip65504P1110S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1110-S
	 *	@param number
	 */
	public void setIp65504P1110S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1110S = checkIp65504P1110SMaxLimit(number); 
		serializeIp65504P1110S(ip65504P1110S);
	}

	public void setIp65504P1110S(int number) {
	    number = checkIp65504P1110SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1110S((short)number);
	}
	public void setIp65504P1110S(long number) {
	    number = checkIp65504P1110SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1110S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1110L
	 *	@return ip65504P1110L
	 */
	public short getIp65504P1110L() throws CFException {
        if (isIp65504P1110LModified()) { 
           ip65504P1110L = refreshIp65504P1110L();
        }
   		return ip65504P1110L;
	}
	
	/**
	 * 	Update Ip65504P1110L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1110-L
	 *	@param number
	 */
	public void setIp65504P1110L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1110L = checkIp65504P1110LMaxLimit(number); 
		serializeIp65504P1110L(ip65504P1110L);
	}

	public void setIp65504P1110L(int number) {
	    number = checkIp65504P1110LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1110L((short)number);
	}
	public void setIp65504P1110L(long number) {
	    number = checkIp65504P1110LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1110L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1111S
	 *	@return ip65504P1111S
	 */
	public short getIp65504P1111S() throws CFException {
        if (isIp65504P1111SModified()) { 
           ip65504P1111S = refreshIp65504P1111S();
        }
   		return ip65504P1111S;
	}
	
	/**
	 * 	Update Ip65504P1111S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1111-S
	 *	@param number
	 */
	public void setIp65504P1111S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1111S = checkIp65504P1111SMaxLimit(number); 
		serializeIp65504P1111S(ip65504P1111S);
	}

	public void setIp65504P1111S(int number) {
	    number = checkIp65504P1111SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1111S((short)number);
	}
	public void setIp65504P1111S(long number) {
	    number = checkIp65504P1111SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1111S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1111L
	 *	@return ip65504P1111L
	 */
	public short getIp65504P1111L() throws CFException {
        if (isIp65504P1111LModified()) { 
           ip65504P1111L = refreshIp65504P1111L();
        }
   		return ip65504P1111L;
	}
	
	/**
	 * 	Update Ip65504P1111L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1111-L
	 *	@param number
	 */
	public void setIp65504P1111L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1111L = checkIp65504P1111LMaxLimit(number); 
		serializeIp65504P1111L(ip65504P1111L);
	}

	public void setIp65504P1111L(int number) {
	    number = checkIp65504P1111LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1111L((short)number);
	}
	public void setIp65504P1111L(long number) {
	    number = checkIp65504P1111LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1111L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1112S
	 *	@return ip65504P1112S
	 */
	public short getIp65504P1112S() throws CFException {
        if (isIp65504P1112SModified()) { 
           ip65504P1112S = refreshIp65504P1112S();
        }
   		return ip65504P1112S;
	}
	
	/**
	 * 	Update Ip65504P1112S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1112-S
	 *	@param number
	 */
	public void setIp65504P1112S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1112S = checkIp65504P1112SMaxLimit(number); 
		serializeIp65504P1112S(ip65504P1112S);
	}

	public void setIp65504P1112S(int number) {
	    number = checkIp65504P1112SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1112S((short)number);
	}
	public void setIp65504P1112S(long number) {
	    number = checkIp65504P1112SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1112S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1112L
	 *	@return ip65504P1112L
	 */
	public short getIp65504P1112L() throws CFException {
        if (isIp65504P1112LModified()) { 
           ip65504P1112L = refreshIp65504P1112L();
        }
   		return ip65504P1112L;
	}
	
	/**
	 * 	Update Ip65504P1112L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1112-L
	 *	@param number
	 */
	public void setIp65504P1112L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1112L = checkIp65504P1112LMaxLimit(number); 
		serializeIp65504P1112L(ip65504P1112L);
	}

	public void setIp65504P1112L(int number) {
	    number = checkIp65504P1112LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1112L((short)number);
	}
	public void setIp65504P1112L(long number) {
	    number = checkIp65504P1112LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1112L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1113S
	 *	@return ip65504P1113S
	 */
	public short getIp65504P1113S() throws CFException {
        if (isIp65504P1113SModified()) { 
           ip65504P1113S = refreshIp65504P1113S();
        }
   		return ip65504P1113S;
	}
	
	/**
	 * 	Update Ip65504P1113S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1113-S
	 *	@param number
	 */
	public void setIp65504P1113S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1113S = checkIp65504P1113SMaxLimit(number); 
		serializeIp65504P1113S(ip65504P1113S);
	}

	public void setIp65504P1113S(int number) {
	    number = checkIp65504P1113SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1113S((short)number);
	}
	public void setIp65504P1113S(long number) {
	    number = checkIp65504P1113SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1113S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1113L
	 *	@return ip65504P1113L
	 */
	public short getIp65504P1113L() throws CFException {
        if (isIp65504P1113LModified()) { 
           ip65504P1113L = refreshIp65504P1113L();
        }
   		return ip65504P1113L;
	}
	
	/**
	 * 	Update Ip65504P1113L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1113-L
	 *	@param number
	 */
	public void setIp65504P1113L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1113L = checkIp65504P1113LMaxLimit(number); 
		serializeIp65504P1113L(ip65504P1113L);
	}

	public void setIp65504P1113L(int number) {
	    number = checkIp65504P1113LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1113L((short)number);
	}
	public void setIp65504P1113L(long number) {
	    number = checkIp65504P1113LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1113L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1114S
	 *	@return ip65504P1114S
	 */
	public short getIp65504P1114S() throws CFException {
        if (isIp65504P1114SModified()) { 
           ip65504P1114S = refreshIp65504P1114S();
        }
   		return ip65504P1114S;
	}
	
	/**
	 * 	Update Ip65504P1114S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1114-S
	 *	@param number
	 */
	public void setIp65504P1114S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1114S = checkIp65504P1114SMaxLimit(number); 
		serializeIp65504P1114S(ip65504P1114S);
	}

	public void setIp65504P1114S(int number) {
	    number = checkIp65504P1114SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1114S((short)number);
	}
	public void setIp65504P1114S(long number) {
	    number = checkIp65504P1114SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1114S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1114L
	 *	@return ip65504P1114L
	 */
	public short getIp65504P1114L() throws CFException {
        if (isIp65504P1114LModified()) { 
           ip65504P1114L = refreshIp65504P1114L();
        }
   		return ip65504P1114L;
	}
	
	/**
	 * 	Update Ip65504P1114L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1114-L
	 *	@param number
	 */
	public void setIp65504P1114L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1114L = checkIp65504P1114LMaxLimit(number); 
		serializeIp65504P1114L(ip65504P1114L);
	}

	public void setIp65504P1114L(int number) {
	    number = checkIp65504P1114LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1114L((short)number);
	}
	public void setIp65504P1114L(long number) {
	    number = checkIp65504P1114LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1114L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1115S
	 *	@return ip65504P1115S
	 */
	public short getIp65504P1115S() throws CFException {
        if (isIp65504P1115SModified()) { 
           ip65504P1115S = refreshIp65504P1115S();
        }
   		return ip65504P1115S;
	}
	
	/**
	 * 	Update Ip65504P1115S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1115-S
	 *	@param number
	 */
	public void setIp65504P1115S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1115S = checkIp65504P1115SMaxLimit(number); 
		serializeIp65504P1115S(ip65504P1115S);
	}

	public void setIp65504P1115S(int number) {
	    number = checkIp65504P1115SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1115S((short)number);
	}
	public void setIp65504P1115S(long number) {
	    number = checkIp65504P1115SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1115S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1115L
	 *	@return ip65504P1115L
	 */
	public short getIp65504P1115L() throws CFException {
        if (isIp65504P1115LModified()) { 
           ip65504P1115L = refreshIp65504P1115L();
        }
   		return ip65504P1115L;
	}
	
	/**
	 * 	Update Ip65504P1115L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1115-L
	 *	@param number
	 */
	public void setIp65504P1115L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1115L = checkIp65504P1115LMaxLimit(number); 
		serializeIp65504P1115L(ip65504P1115L);
	}

	public void setIp65504P1115L(int number) {
	    number = checkIp65504P1115LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1115L((short)number);
	}
	public void setIp65504P1115L(long number) {
	    number = checkIp65504P1115LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1115L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1116S
	 *	@return ip65504P1116S
	 */
	public short getIp65504P1116S() throws CFException {
        if (isIp65504P1116SModified()) { 
           ip65504P1116S = refreshIp65504P1116S();
        }
   		return ip65504P1116S;
	}
	
	/**
	 * 	Update Ip65504P1116S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1116-S
	 *	@param number
	 */
	public void setIp65504P1116S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1116S = checkIp65504P1116SMaxLimit(number); 
		serializeIp65504P1116S(ip65504P1116S);
	}

	public void setIp65504P1116S(int number) {
	    number = checkIp65504P1116SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1116S((short)number);
	}
	public void setIp65504P1116S(long number) {
	    number = checkIp65504P1116SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1116S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1116L
	 *	@return ip65504P1116L
	 */
	public short getIp65504P1116L() throws CFException {
        if (isIp65504P1116LModified()) { 
           ip65504P1116L = refreshIp65504P1116L();
        }
   		return ip65504P1116L;
	}
	
	/**
	 * 	Update Ip65504P1116L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1116-L
	 *	@param number
	 */
	public void setIp65504P1116L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1116L = checkIp65504P1116LMaxLimit(number); 
		serializeIp65504P1116L(ip65504P1116L);
	}

	public void setIp65504P1116L(int number) {
	    number = checkIp65504P1116LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1116L((short)number);
	}
	public void setIp65504P1116L(long number) {
	    number = checkIp65504P1116LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1116L((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup36
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P1086MemdataS((short)0);
         	setIp65504P1086MemdataL((short)0);
         	setIp65504P1087MemdataS((short)0);
         	setIp65504P1087MemdataL((short)0);
         	setIp65504P1088MemdataS((short)0);
         	setIp65504P1088MemdataL((short)0);
         	setIp65504P1089MemdataS((short)0);
         	setIp65504P1089MemdataL((short)0);
         	setIp65504P1090MemdataS((short)0);
         	setIp65504P1090MemdataL((short)0);
         	setIp65504P1091MemdataS((short)0);
         	setIp65504P1091MemdataL((short)0);
         	setIp65504P1092MemdataS((short)0);
         	setIp65504P1092MemdataL((short)0);
         	setIp65504P1093MemdataS((short)0);
         	setIp65504P1093MemdataL((short)0);
         	setIp65504P1094MemdataS((short)0);
         	setIp65504P1094MemdataL((short)0);
         	setIp65504P1095MemdataS((short)0);
         	setIp65504P1095MemdataL((short)0);
         	setIp65504P1096MemdataS((short)0);
         	setIp65504P1096MemdataL((short)0);
         	setIp65504P1097MemdataS((short)0);
         	setIp65504P1097MemdataL((short)0);
         	setIp65504P1098MemdataS((short)0);
         	setIp65504P1098MemdataL((short)0);
         	setIp65504P1099MemdataS((short)0);
         	setIp65504P1099MemdataL((short)0);
         	setIp65504P1100S((short)0);
         	setIp65504P1100L((short)0);
         	setIp65504P1101S((short)0);
         	setIp65504P1101L((short)0);
         	setIp65504P1102S((short)0);
         	setIp65504P1102L((short)0);
         	setIp65504P1103S((short)0);
         	setIp65504P1103L((short)0);
         	setIp65504P1104S((short)0);
         	setIp65504P1104L((short)0);
         	setIp65504P1105S((short)0);
         	setIp65504P1105L((short)0);
         	setIp65504P1106S((short)0);
         	setIp65504P1106L((short)0);
         	setIp65504P1107S((short)0);
         	setIp65504P1107L((short)0);
         	setIp65504P1108S((short)0);
         	setIp65504P1108L((short)0);
         	setIp65504P1109S((short)0);
         	setIp65504P1109L((short)0);
         	setIp65504P1110S((short)0);
         	setIp65504P1110L((short)0);
         	setIp65504P1111S((short)0);
         	setIp65504P1111L((short)0);
         	setIp65504P1112S((short)0);
         	setIp65504P1112L((short)0);
         	setIp65504P1113S((short)0);
         	setIp65504P1113L((short)0);
         	setIp65504P1114S((short)0);
         	setIp65504P1114L((short)0);
         	setIp65504P1115S((short)0);
         	setIp65504P1115L((short)0);
         	setIp65504P1116S((short)0);
         	setIp65504P1116L((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup36FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_36_LENGTH;
		}

}
  
