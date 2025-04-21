package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup35 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup35 extends Ip65504PdsNamesLargeGroup35Serialized { 
   

								private short ip65504P1055MemdataS;

								private short ip65504P1055MemdataL;


								private short ip65504P1056MemdataS;

								private short ip65504P1056MemdataL;


								private short ip65504P1057MemdataS;

								private short ip65504P1057MemdataL;


								private short ip65504P1058MemdataS;

								private short ip65504P1058MemdataL;


								private short ip65504P1059MemdataS;

								private short ip65504P1059MemdataL;


								private short ip65504P1060MemdataS;

								private short ip65504P1060MemdataL;


								private short ip65504P1061MemdataS;

								private short ip65504P1061MemdataL;


								private short ip65504P1062MemdataS;

								private short ip65504P1062MemdataL;


								private short ip65504P1063MemdataS;

								private short ip65504P1063MemdataL;


								private short ip65504P1064MemdataS;

								private short ip65504P1064MemdataL;


								private short ip65504P1065MemdataS;

								private short ip65504P1065MemdataL;


								private short ip65504P1066MemdataS;

								private short ip65504P1066MemdataL;


								private short ip65504P1067MemdataS;

								private short ip65504P1067MemdataL;


								private short ip65504P1068MemdataS;

								private short ip65504P1068MemdataL;


								private short ip65504P1069MemdataS;

								private short ip65504P1069MemdataL;


								private short ip65504P1070MemdataS;

								private short ip65504P1070MemdataL;


								private short ip65504P1071MemdataS;

								private short ip65504P1071MemdataL;


								private short ip65504P1072MemdataS;

								private short ip65504P1072MemdataL;


								private short ip65504P1073MemdataS;

								private short ip65504P1073MemdataL;


								private short ip65504P1074MemdataS;

								private short ip65504P1074MemdataL;


								private short ip65504P1075MemdataS;

								private short ip65504P1075MemdataL;


								private short ip65504P1076MemdataS;

								private short ip65504P1076MemdataL;


								private short ip65504P1077MemdataS;

								private short ip65504P1077MemdataL;


								private short ip65504P1078MemdataS;

								private short ip65504P1078MemdataL;


								private short ip65504P1079MemdataS;

								private short ip65504P1079MemdataL;


								private short ip65504P1080MemdataS;

								private short ip65504P1080MemdataL;


								private short ip65504P1081MemdataS;

								private short ip65504P1081MemdataL;


								private short ip65504P1082MemdataS;

								private short ip65504P1082MemdataL;


								private short ip65504P1083MemdataS;

								private short ip65504P1083MemdataL;


								private short ip65504P1084MemdataS;

								private short ip65504P1084MemdataL;


								private short ip65504P1085MemdataS;

								private short ip65504P1085MemdataL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup35
	**/
    public Ip65504PdsNamesLargeGroup35() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup35. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup35(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P1055MemdataS
	 *	@return ip65504P1055MemdataS
	 */
	public short getIp65504P1055MemdataS() throws CFException {
        if (isIp65504P1055MemdataSModified()) { 
           ip65504P1055MemdataS = refreshIp65504P1055MemdataS();
        }
   		return ip65504P1055MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1055MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1055-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1055MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1055MemdataS = checkIp65504P1055MemdataSMaxLimit(number); 
		serializeIp65504P1055MemdataS(ip65504P1055MemdataS);
	}

	public void setIp65504P1055MemdataS(int number) {
	    number = checkIp65504P1055MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1055MemdataS((short)number);
	}
	public void setIp65504P1055MemdataS(long number) {
	    number = checkIp65504P1055MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1055MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1055MemdataL
	 *	@return ip65504P1055MemdataL
	 */
	public short getIp65504P1055MemdataL() throws CFException {
        if (isIp65504P1055MemdataLModified()) { 
           ip65504P1055MemdataL = refreshIp65504P1055MemdataL();
        }
   		return ip65504P1055MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1055MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1055-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1055MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1055MemdataL = checkIp65504P1055MemdataLMaxLimit(number); 
		serializeIp65504P1055MemdataL(ip65504P1055MemdataL);
	}

	public void setIp65504P1055MemdataL(int number) {
	    number = checkIp65504P1055MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1055MemdataL((short)number);
	}
	public void setIp65504P1055MemdataL(long number) {
	    number = checkIp65504P1055MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1055MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1056MemdataS
	 *	@return ip65504P1056MemdataS
	 */
	public short getIp65504P1056MemdataS() throws CFException {
        if (isIp65504P1056MemdataSModified()) { 
           ip65504P1056MemdataS = refreshIp65504P1056MemdataS();
        }
   		return ip65504P1056MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1056MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1056-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1056MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1056MemdataS = checkIp65504P1056MemdataSMaxLimit(number); 
		serializeIp65504P1056MemdataS(ip65504P1056MemdataS);
	}

	public void setIp65504P1056MemdataS(int number) {
	    number = checkIp65504P1056MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1056MemdataS((short)number);
	}
	public void setIp65504P1056MemdataS(long number) {
	    number = checkIp65504P1056MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1056MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1056MemdataL
	 *	@return ip65504P1056MemdataL
	 */
	public short getIp65504P1056MemdataL() throws CFException {
        if (isIp65504P1056MemdataLModified()) { 
           ip65504P1056MemdataL = refreshIp65504P1056MemdataL();
        }
   		return ip65504P1056MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1056MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1056-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1056MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1056MemdataL = checkIp65504P1056MemdataLMaxLimit(number); 
		serializeIp65504P1056MemdataL(ip65504P1056MemdataL);
	}

	public void setIp65504P1056MemdataL(int number) {
	    number = checkIp65504P1056MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1056MemdataL((short)number);
	}
	public void setIp65504P1056MemdataL(long number) {
	    number = checkIp65504P1056MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1056MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1057MemdataS
	 *	@return ip65504P1057MemdataS
	 */
	public short getIp65504P1057MemdataS() throws CFException {
        if (isIp65504P1057MemdataSModified()) { 
           ip65504P1057MemdataS = refreshIp65504P1057MemdataS();
        }
   		return ip65504P1057MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1057MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1057-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1057MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1057MemdataS = checkIp65504P1057MemdataSMaxLimit(number); 
		serializeIp65504P1057MemdataS(ip65504P1057MemdataS);
	}

	public void setIp65504P1057MemdataS(int number) {
	    number = checkIp65504P1057MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1057MemdataS((short)number);
	}
	public void setIp65504P1057MemdataS(long number) {
	    number = checkIp65504P1057MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1057MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1057MemdataL
	 *	@return ip65504P1057MemdataL
	 */
	public short getIp65504P1057MemdataL() throws CFException {
        if (isIp65504P1057MemdataLModified()) { 
           ip65504P1057MemdataL = refreshIp65504P1057MemdataL();
        }
   		return ip65504P1057MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1057MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1057-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1057MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1057MemdataL = checkIp65504P1057MemdataLMaxLimit(number); 
		serializeIp65504P1057MemdataL(ip65504P1057MemdataL);
	}

	public void setIp65504P1057MemdataL(int number) {
	    number = checkIp65504P1057MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1057MemdataL((short)number);
	}
	public void setIp65504P1057MemdataL(long number) {
	    number = checkIp65504P1057MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1057MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1058MemdataS
	 *	@return ip65504P1058MemdataS
	 */
	public short getIp65504P1058MemdataS() throws CFException {
        if (isIp65504P1058MemdataSModified()) { 
           ip65504P1058MemdataS = refreshIp65504P1058MemdataS();
        }
   		return ip65504P1058MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1058MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1058-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1058MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1058MemdataS = checkIp65504P1058MemdataSMaxLimit(number); 
		serializeIp65504P1058MemdataS(ip65504P1058MemdataS);
	}

	public void setIp65504P1058MemdataS(int number) {
	    number = checkIp65504P1058MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1058MemdataS((short)number);
	}
	public void setIp65504P1058MemdataS(long number) {
	    number = checkIp65504P1058MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1058MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1058MemdataL
	 *	@return ip65504P1058MemdataL
	 */
	public short getIp65504P1058MemdataL() throws CFException {
        if (isIp65504P1058MemdataLModified()) { 
           ip65504P1058MemdataL = refreshIp65504P1058MemdataL();
        }
   		return ip65504P1058MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1058MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1058-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1058MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1058MemdataL = checkIp65504P1058MemdataLMaxLimit(number); 
		serializeIp65504P1058MemdataL(ip65504P1058MemdataL);
	}

	public void setIp65504P1058MemdataL(int number) {
	    number = checkIp65504P1058MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1058MemdataL((short)number);
	}
	public void setIp65504P1058MemdataL(long number) {
	    number = checkIp65504P1058MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1058MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1059MemdataS
	 *	@return ip65504P1059MemdataS
	 */
	public short getIp65504P1059MemdataS() throws CFException {
        if (isIp65504P1059MemdataSModified()) { 
           ip65504P1059MemdataS = refreshIp65504P1059MemdataS();
        }
   		return ip65504P1059MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1059MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1059-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1059MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1059MemdataS = checkIp65504P1059MemdataSMaxLimit(number); 
		serializeIp65504P1059MemdataS(ip65504P1059MemdataS);
	}

	public void setIp65504P1059MemdataS(int number) {
	    number = checkIp65504P1059MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1059MemdataS((short)number);
	}
	public void setIp65504P1059MemdataS(long number) {
	    number = checkIp65504P1059MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1059MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1059MemdataL
	 *	@return ip65504P1059MemdataL
	 */
	public short getIp65504P1059MemdataL() throws CFException {
        if (isIp65504P1059MemdataLModified()) { 
           ip65504P1059MemdataL = refreshIp65504P1059MemdataL();
        }
   		return ip65504P1059MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1059MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1059-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1059MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1059MemdataL = checkIp65504P1059MemdataLMaxLimit(number); 
		serializeIp65504P1059MemdataL(ip65504P1059MemdataL);
	}

	public void setIp65504P1059MemdataL(int number) {
	    number = checkIp65504P1059MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1059MemdataL((short)number);
	}
	public void setIp65504P1059MemdataL(long number) {
	    number = checkIp65504P1059MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1059MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1060MemdataS
	 *	@return ip65504P1060MemdataS
	 */
	public short getIp65504P1060MemdataS() throws CFException {
        if (isIp65504P1060MemdataSModified()) { 
           ip65504P1060MemdataS = refreshIp65504P1060MemdataS();
        }
   		return ip65504P1060MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1060MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1060-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1060MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1060MemdataS = checkIp65504P1060MemdataSMaxLimit(number); 
		serializeIp65504P1060MemdataS(ip65504P1060MemdataS);
	}

	public void setIp65504P1060MemdataS(int number) {
	    number = checkIp65504P1060MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1060MemdataS((short)number);
	}
	public void setIp65504P1060MemdataS(long number) {
	    number = checkIp65504P1060MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1060MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1060MemdataL
	 *	@return ip65504P1060MemdataL
	 */
	public short getIp65504P1060MemdataL() throws CFException {
        if (isIp65504P1060MemdataLModified()) { 
           ip65504P1060MemdataL = refreshIp65504P1060MemdataL();
        }
   		return ip65504P1060MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1060MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1060-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1060MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1060MemdataL = checkIp65504P1060MemdataLMaxLimit(number); 
		serializeIp65504P1060MemdataL(ip65504P1060MemdataL);
	}

	public void setIp65504P1060MemdataL(int number) {
	    number = checkIp65504P1060MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1060MemdataL((short)number);
	}
	public void setIp65504P1060MemdataL(long number) {
	    number = checkIp65504P1060MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1060MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1061MemdataS
	 *	@return ip65504P1061MemdataS
	 */
	public short getIp65504P1061MemdataS() throws CFException {
        if (isIp65504P1061MemdataSModified()) { 
           ip65504P1061MemdataS = refreshIp65504P1061MemdataS();
        }
   		return ip65504P1061MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1061MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1061-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1061MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1061MemdataS = checkIp65504P1061MemdataSMaxLimit(number); 
		serializeIp65504P1061MemdataS(ip65504P1061MemdataS);
	}

	public void setIp65504P1061MemdataS(int number) {
	    number = checkIp65504P1061MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1061MemdataS((short)number);
	}
	public void setIp65504P1061MemdataS(long number) {
	    number = checkIp65504P1061MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1061MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1061MemdataL
	 *	@return ip65504P1061MemdataL
	 */
	public short getIp65504P1061MemdataL() throws CFException {
        if (isIp65504P1061MemdataLModified()) { 
           ip65504P1061MemdataL = refreshIp65504P1061MemdataL();
        }
   		return ip65504P1061MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1061MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1061-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1061MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1061MemdataL = checkIp65504P1061MemdataLMaxLimit(number); 
		serializeIp65504P1061MemdataL(ip65504P1061MemdataL);
	}

	public void setIp65504P1061MemdataL(int number) {
	    number = checkIp65504P1061MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1061MemdataL((short)number);
	}
	public void setIp65504P1061MemdataL(long number) {
	    number = checkIp65504P1061MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1061MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1062MemdataS
	 *	@return ip65504P1062MemdataS
	 */
	public short getIp65504P1062MemdataS() throws CFException {
        if (isIp65504P1062MemdataSModified()) { 
           ip65504P1062MemdataS = refreshIp65504P1062MemdataS();
        }
   		return ip65504P1062MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1062MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1062-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1062MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1062MemdataS = checkIp65504P1062MemdataSMaxLimit(number); 
		serializeIp65504P1062MemdataS(ip65504P1062MemdataS);
	}

	public void setIp65504P1062MemdataS(int number) {
	    number = checkIp65504P1062MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1062MemdataS((short)number);
	}
	public void setIp65504P1062MemdataS(long number) {
	    number = checkIp65504P1062MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1062MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1062MemdataL
	 *	@return ip65504P1062MemdataL
	 */
	public short getIp65504P1062MemdataL() throws CFException {
        if (isIp65504P1062MemdataLModified()) { 
           ip65504P1062MemdataL = refreshIp65504P1062MemdataL();
        }
   		return ip65504P1062MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1062MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1062-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1062MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1062MemdataL = checkIp65504P1062MemdataLMaxLimit(number); 
		serializeIp65504P1062MemdataL(ip65504P1062MemdataL);
	}

	public void setIp65504P1062MemdataL(int number) {
	    number = checkIp65504P1062MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1062MemdataL((short)number);
	}
	public void setIp65504P1062MemdataL(long number) {
	    number = checkIp65504P1062MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1062MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1063MemdataS
	 *	@return ip65504P1063MemdataS
	 */
	public short getIp65504P1063MemdataS() throws CFException {
        if (isIp65504P1063MemdataSModified()) { 
           ip65504P1063MemdataS = refreshIp65504P1063MemdataS();
        }
   		return ip65504P1063MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1063MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1063-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1063MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1063MemdataS = checkIp65504P1063MemdataSMaxLimit(number); 
		serializeIp65504P1063MemdataS(ip65504P1063MemdataS);
	}

	public void setIp65504P1063MemdataS(int number) {
	    number = checkIp65504P1063MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1063MemdataS((short)number);
	}
	public void setIp65504P1063MemdataS(long number) {
	    number = checkIp65504P1063MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1063MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1063MemdataL
	 *	@return ip65504P1063MemdataL
	 */
	public short getIp65504P1063MemdataL() throws CFException {
        if (isIp65504P1063MemdataLModified()) { 
           ip65504P1063MemdataL = refreshIp65504P1063MemdataL();
        }
   		return ip65504P1063MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1063MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1063-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1063MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1063MemdataL = checkIp65504P1063MemdataLMaxLimit(number); 
		serializeIp65504P1063MemdataL(ip65504P1063MemdataL);
	}

	public void setIp65504P1063MemdataL(int number) {
	    number = checkIp65504P1063MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1063MemdataL((short)number);
	}
	public void setIp65504P1063MemdataL(long number) {
	    number = checkIp65504P1063MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1063MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1064MemdataS
	 *	@return ip65504P1064MemdataS
	 */
	public short getIp65504P1064MemdataS() throws CFException {
        if (isIp65504P1064MemdataSModified()) { 
           ip65504P1064MemdataS = refreshIp65504P1064MemdataS();
        }
   		return ip65504P1064MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1064MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1064-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1064MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1064MemdataS = checkIp65504P1064MemdataSMaxLimit(number); 
		serializeIp65504P1064MemdataS(ip65504P1064MemdataS);
	}

	public void setIp65504P1064MemdataS(int number) {
	    number = checkIp65504P1064MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1064MemdataS((short)number);
	}
	public void setIp65504P1064MemdataS(long number) {
	    number = checkIp65504P1064MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1064MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1064MemdataL
	 *	@return ip65504P1064MemdataL
	 */
	public short getIp65504P1064MemdataL() throws CFException {
        if (isIp65504P1064MemdataLModified()) { 
           ip65504P1064MemdataL = refreshIp65504P1064MemdataL();
        }
   		return ip65504P1064MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1064MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1064-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1064MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1064MemdataL = checkIp65504P1064MemdataLMaxLimit(number); 
		serializeIp65504P1064MemdataL(ip65504P1064MemdataL);
	}

	public void setIp65504P1064MemdataL(int number) {
	    number = checkIp65504P1064MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1064MemdataL((short)number);
	}
	public void setIp65504P1064MemdataL(long number) {
	    number = checkIp65504P1064MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1064MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1065MemdataS
	 *	@return ip65504P1065MemdataS
	 */
	public short getIp65504P1065MemdataS() throws CFException {
        if (isIp65504P1065MemdataSModified()) { 
           ip65504P1065MemdataS = refreshIp65504P1065MemdataS();
        }
   		return ip65504P1065MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1065MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1065-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1065MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1065MemdataS = checkIp65504P1065MemdataSMaxLimit(number); 
		serializeIp65504P1065MemdataS(ip65504P1065MemdataS);
	}

	public void setIp65504P1065MemdataS(int number) {
	    number = checkIp65504P1065MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1065MemdataS((short)number);
	}
	public void setIp65504P1065MemdataS(long number) {
	    number = checkIp65504P1065MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1065MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1065MemdataL
	 *	@return ip65504P1065MemdataL
	 */
	public short getIp65504P1065MemdataL() throws CFException {
        if (isIp65504P1065MemdataLModified()) { 
           ip65504P1065MemdataL = refreshIp65504P1065MemdataL();
        }
   		return ip65504P1065MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1065MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1065-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1065MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1065MemdataL = checkIp65504P1065MemdataLMaxLimit(number); 
		serializeIp65504P1065MemdataL(ip65504P1065MemdataL);
	}

	public void setIp65504P1065MemdataL(int number) {
	    number = checkIp65504P1065MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1065MemdataL((short)number);
	}
	public void setIp65504P1065MemdataL(long number) {
	    number = checkIp65504P1065MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1065MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1066MemdataS
	 *	@return ip65504P1066MemdataS
	 */
	public short getIp65504P1066MemdataS() throws CFException {
        if (isIp65504P1066MemdataSModified()) { 
           ip65504P1066MemdataS = refreshIp65504P1066MemdataS();
        }
   		return ip65504P1066MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1066MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1066-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1066MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1066MemdataS = checkIp65504P1066MemdataSMaxLimit(number); 
		serializeIp65504P1066MemdataS(ip65504P1066MemdataS);
	}

	public void setIp65504P1066MemdataS(int number) {
	    number = checkIp65504P1066MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1066MemdataS((short)number);
	}
	public void setIp65504P1066MemdataS(long number) {
	    number = checkIp65504P1066MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1066MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1066MemdataL
	 *	@return ip65504P1066MemdataL
	 */
	public short getIp65504P1066MemdataL() throws CFException {
        if (isIp65504P1066MemdataLModified()) { 
           ip65504P1066MemdataL = refreshIp65504P1066MemdataL();
        }
   		return ip65504P1066MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1066MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1066-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1066MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1066MemdataL = checkIp65504P1066MemdataLMaxLimit(number); 
		serializeIp65504P1066MemdataL(ip65504P1066MemdataL);
	}

	public void setIp65504P1066MemdataL(int number) {
	    number = checkIp65504P1066MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1066MemdataL((short)number);
	}
	public void setIp65504P1066MemdataL(long number) {
	    number = checkIp65504P1066MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1066MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1067MemdataS
	 *	@return ip65504P1067MemdataS
	 */
	public short getIp65504P1067MemdataS() throws CFException {
        if (isIp65504P1067MemdataSModified()) { 
           ip65504P1067MemdataS = refreshIp65504P1067MemdataS();
        }
   		return ip65504P1067MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1067MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1067-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1067MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1067MemdataS = checkIp65504P1067MemdataSMaxLimit(number); 
		serializeIp65504P1067MemdataS(ip65504P1067MemdataS);
	}

	public void setIp65504P1067MemdataS(int number) {
	    number = checkIp65504P1067MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1067MemdataS((short)number);
	}
	public void setIp65504P1067MemdataS(long number) {
	    number = checkIp65504P1067MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1067MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1067MemdataL
	 *	@return ip65504P1067MemdataL
	 */
	public short getIp65504P1067MemdataL() throws CFException {
        if (isIp65504P1067MemdataLModified()) { 
           ip65504P1067MemdataL = refreshIp65504P1067MemdataL();
        }
   		return ip65504P1067MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1067MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1067-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1067MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1067MemdataL = checkIp65504P1067MemdataLMaxLimit(number); 
		serializeIp65504P1067MemdataL(ip65504P1067MemdataL);
	}

	public void setIp65504P1067MemdataL(int number) {
	    number = checkIp65504P1067MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1067MemdataL((short)number);
	}
	public void setIp65504P1067MemdataL(long number) {
	    number = checkIp65504P1067MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1067MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1068MemdataS
	 *	@return ip65504P1068MemdataS
	 */
	public short getIp65504P1068MemdataS() throws CFException {
        if (isIp65504P1068MemdataSModified()) { 
           ip65504P1068MemdataS = refreshIp65504P1068MemdataS();
        }
   		return ip65504P1068MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1068MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1068-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1068MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1068MemdataS = checkIp65504P1068MemdataSMaxLimit(number); 
		serializeIp65504P1068MemdataS(ip65504P1068MemdataS);
	}

	public void setIp65504P1068MemdataS(int number) {
	    number = checkIp65504P1068MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1068MemdataS((short)number);
	}
	public void setIp65504P1068MemdataS(long number) {
	    number = checkIp65504P1068MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1068MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1068MemdataL
	 *	@return ip65504P1068MemdataL
	 */
	public short getIp65504P1068MemdataL() throws CFException {
        if (isIp65504P1068MemdataLModified()) { 
           ip65504P1068MemdataL = refreshIp65504P1068MemdataL();
        }
   		return ip65504P1068MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1068MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1068-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1068MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1068MemdataL = checkIp65504P1068MemdataLMaxLimit(number); 
		serializeIp65504P1068MemdataL(ip65504P1068MemdataL);
	}

	public void setIp65504P1068MemdataL(int number) {
	    number = checkIp65504P1068MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1068MemdataL((short)number);
	}
	public void setIp65504P1068MemdataL(long number) {
	    number = checkIp65504P1068MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1068MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1069MemdataS
	 *	@return ip65504P1069MemdataS
	 */
	public short getIp65504P1069MemdataS() throws CFException {
        if (isIp65504P1069MemdataSModified()) { 
           ip65504P1069MemdataS = refreshIp65504P1069MemdataS();
        }
   		return ip65504P1069MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1069MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1069-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1069MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1069MemdataS = checkIp65504P1069MemdataSMaxLimit(number); 
		serializeIp65504P1069MemdataS(ip65504P1069MemdataS);
	}

	public void setIp65504P1069MemdataS(int number) {
	    number = checkIp65504P1069MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1069MemdataS((short)number);
	}
	public void setIp65504P1069MemdataS(long number) {
	    number = checkIp65504P1069MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1069MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1069MemdataL
	 *	@return ip65504P1069MemdataL
	 */
	public short getIp65504P1069MemdataL() throws CFException {
        if (isIp65504P1069MemdataLModified()) { 
           ip65504P1069MemdataL = refreshIp65504P1069MemdataL();
        }
   		return ip65504P1069MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1069MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1069-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1069MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1069MemdataL = checkIp65504P1069MemdataLMaxLimit(number); 
		serializeIp65504P1069MemdataL(ip65504P1069MemdataL);
	}

	public void setIp65504P1069MemdataL(int number) {
	    number = checkIp65504P1069MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1069MemdataL((short)number);
	}
	public void setIp65504P1069MemdataL(long number) {
	    number = checkIp65504P1069MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1069MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1070MemdataS
	 *	@return ip65504P1070MemdataS
	 */
	public short getIp65504P1070MemdataS() throws CFException {
        if (isIp65504P1070MemdataSModified()) { 
           ip65504P1070MemdataS = refreshIp65504P1070MemdataS();
        }
   		return ip65504P1070MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1070MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1070-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1070MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1070MemdataS = checkIp65504P1070MemdataSMaxLimit(number); 
		serializeIp65504P1070MemdataS(ip65504P1070MemdataS);
	}

	public void setIp65504P1070MemdataS(int number) {
	    number = checkIp65504P1070MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1070MemdataS((short)number);
	}
	public void setIp65504P1070MemdataS(long number) {
	    number = checkIp65504P1070MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1070MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1070MemdataL
	 *	@return ip65504P1070MemdataL
	 */
	public short getIp65504P1070MemdataL() throws CFException {
        if (isIp65504P1070MemdataLModified()) { 
           ip65504P1070MemdataL = refreshIp65504P1070MemdataL();
        }
   		return ip65504P1070MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1070MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1070-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1070MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1070MemdataL = checkIp65504P1070MemdataLMaxLimit(number); 
		serializeIp65504P1070MemdataL(ip65504P1070MemdataL);
	}

	public void setIp65504P1070MemdataL(int number) {
	    number = checkIp65504P1070MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1070MemdataL((short)number);
	}
	public void setIp65504P1070MemdataL(long number) {
	    number = checkIp65504P1070MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1070MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1071MemdataS
	 *	@return ip65504P1071MemdataS
	 */
	public short getIp65504P1071MemdataS() throws CFException {
        if (isIp65504P1071MemdataSModified()) { 
           ip65504P1071MemdataS = refreshIp65504P1071MemdataS();
        }
   		return ip65504P1071MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1071MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1071-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1071MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1071MemdataS = checkIp65504P1071MemdataSMaxLimit(number); 
		serializeIp65504P1071MemdataS(ip65504P1071MemdataS);
	}

	public void setIp65504P1071MemdataS(int number) {
	    number = checkIp65504P1071MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1071MemdataS((short)number);
	}
	public void setIp65504P1071MemdataS(long number) {
	    number = checkIp65504P1071MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1071MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1071MemdataL
	 *	@return ip65504P1071MemdataL
	 */
	public short getIp65504P1071MemdataL() throws CFException {
        if (isIp65504P1071MemdataLModified()) { 
           ip65504P1071MemdataL = refreshIp65504P1071MemdataL();
        }
   		return ip65504P1071MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1071MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1071-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1071MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1071MemdataL = checkIp65504P1071MemdataLMaxLimit(number); 
		serializeIp65504P1071MemdataL(ip65504P1071MemdataL);
	}

	public void setIp65504P1071MemdataL(int number) {
	    number = checkIp65504P1071MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1071MemdataL((short)number);
	}
	public void setIp65504P1071MemdataL(long number) {
	    number = checkIp65504P1071MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1071MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1072MemdataS
	 *	@return ip65504P1072MemdataS
	 */
	public short getIp65504P1072MemdataS() throws CFException {
        if (isIp65504P1072MemdataSModified()) { 
           ip65504P1072MemdataS = refreshIp65504P1072MemdataS();
        }
   		return ip65504P1072MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1072MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1072-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1072MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1072MemdataS = checkIp65504P1072MemdataSMaxLimit(number); 
		serializeIp65504P1072MemdataS(ip65504P1072MemdataS);
	}

	public void setIp65504P1072MemdataS(int number) {
	    number = checkIp65504P1072MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1072MemdataS((short)number);
	}
	public void setIp65504P1072MemdataS(long number) {
	    number = checkIp65504P1072MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1072MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1072MemdataL
	 *	@return ip65504P1072MemdataL
	 */
	public short getIp65504P1072MemdataL() throws CFException {
        if (isIp65504P1072MemdataLModified()) { 
           ip65504P1072MemdataL = refreshIp65504P1072MemdataL();
        }
   		return ip65504P1072MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1072MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1072-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1072MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1072MemdataL = checkIp65504P1072MemdataLMaxLimit(number); 
		serializeIp65504P1072MemdataL(ip65504P1072MemdataL);
	}

	public void setIp65504P1072MemdataL(int number) {
	    number = checkIp65504P1072MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1072MemdataL((short)number);
	}
	public void setIp65504P1072MemdataL(long number) {
	    number = checkIp65504P1072MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1072MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1073MemdataS
	 *	@return ip65504P1073MemdataS
	 */
	public short getIp65504P1073MemdataS() throws CFException {
        if (isIp65504P1073MemdataSModified()) { 
           ip65504P1073MemdataS = refreshIp65504P1073MemdataS();
        }
   		return ip65504P1073MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1073MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1073-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1073MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1073MemdataS = checkIp65504P1073MemdataSMaxLimit(number); 
		serializeIp65504P1073MemdataS(ip65504P1073MemdataS);
	}

	public void setIp65504P1073MemdataS(int number) {
	    number = checkIp65504P1073MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1073MemdataS((short)number);
	}
	public void setIp65504P1073MemdataS(long number) {
	    number = checkIp65504P1073MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1073MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1073MemdataL
	 *	@return ip65504P1073MemdataL
	 */
	public short getIp65504P1073MemdataL() throws CFException {
        if (isIp65504P1073MemdataLModified()) { 
           ip65504P1073MemdataL = refreshIp65504P1073MemdataL();
        }
   		return ip65504P1073MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1073MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1073-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1073MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1073MemdataL = checkIp65504P1073MemdataLMaxLimit(number); 
		serializeIp65504P1073MemdataL(ip65504P1073MemdataL);
	}

	public void setIp65504P1073MemdataL(int number) {
	    number = checkIp65504P1073MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1073MemdataL((short)number);
	}
	public void setIp65504P1073MemdataL(long number) {
	    number = checkIp65504P1073MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1073MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1074MemdataS
	 *	@return ip65504P1074MemdataS
	 */
	public short getIp65504P1074MemdataS() throws CFException {
        if (isIp65504P1074MemdataSModified()) { 
           ip65504P1074MemdataS = refreshIp65504P1074MemdataS();
        }
   		return ip65504P1074MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1074MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1074-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1074MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1074MemdataS = checkIp65504P1074MemdataSMaxLimit(number); 
		serializeIp65504P1074MemdataS(ip65504P1074MemdataS);
	}

	public void setIp65504P1074MemdataS(int number) {
	    number = checkIp65504P1074MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1074MemdataS((short)number);
	}
	public void setIp65504P1074MemdataS(long number) {
	    number = checkIp65504P1074MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1074MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1074MemdataL
	 *	@return ip65504P1074MemdataL
	 */
	public short getIp65504P1074MemdataL() throws CFException {
        if (isIp65504P1074MemdataLModified()) { 
           ip65504P1074MemdataL = refreshIp65504P1074MemdataL();
        }
   		return ip65504P1074MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1074MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1074-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1074MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1074MemdataL = checkIp65504P1074MemdataLMaxLimit(number); 
		serializeIp65504P1074MemdataL(ip65504P1074MemdataL);
	}

	public void setIp65504P1074MemdataL(int number) {
	    number = checkIp65504P1074MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1074MemdataL((short)number);
	}
	public void setIp65504P1074MemdataL(long number) {
	    number = checkIp65504P1074MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1074MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1075MemdataS
	 *	@return ip65504P1075MemdataS
	 */
	public short getIp65504P1075MemdataS() throws CFException {
        if (isIp65504P1075MemdataSModified()) { 
           ip65504P1075MemdataS = refreshIp65504P1075MemdataS();
        }
   		return ip65504P1075MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1075MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1075-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1075MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1075MemdataS = checkIp65504P1075MemdataSMaxLimit(number); 
		serializeIp65504P1075MemdataS(ip65504P1075MemdataS);
	}

	public void setIp65504P1075MemdataS(int number) {
	    number = checkIp65504P1075MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1075MemdataS((short)number);
	}
	public void setIp65504P1075MemdataS(long number) {
	    number = checkIp65504P1075MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1075MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1075MemdataL
	 *	@return ip65504P1075MemdataL
	 */
	public short getIp65504P1075MemdataL() throws CFException {
        if (isIp65504P1075MemdataLModified()) { 
           ip65504P1075MemdataL = refreshIp65504P1075MemdataL();
        }
   		return ip65504P1075MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1075MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1075-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1075MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1075MemdataL = checkIp65504P1075MemdataLMaxLimit(number); 
		serializeIp65504P1075MemdataL(ip65504P1075MemdataL);
	}

	public void setIp65504P1075MemdataL(int number) {
	    number = checkIp65504P1075MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1075MemdataL((short)number);
	}
	public void setIp65504P1075MemdataL(long number) {
	    number = checkIp65504P1075MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1075MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1076MemdataS
	 *	@return ip65504P1076MemdataS
	 */
	public short getIp65504P1076MemdataS() throws CFException {
        if (isIp65504P1076MemdataSModified()) { 
           ip65504P1076MemdataS = refreshIp65504P1076MemdataS();
        }
   		return ip65504P1076MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1076MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1076-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1076MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1076MemdataS = checkIp65504P1076MemdataSMaxLimit(number); 
		serializeIp65504P1076MemdataS(ip65504P1076MemdataS);
	}

	public void setIp65504P1076MemdataS(int number) {
	    number = checkIp65504P1076MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1076MemdataS((short)number);
	}
	public void setIp65504P1076MemdataS(long number) {
	    number = checkIp65504P1076MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1076MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1076MemdataL
	 *	@return ip65504P1076MemdataL
	 */
	public short getIp65504P1076MemdataL() throws CFException {
        if (isIp65504P1076MemdataLModified()) { 
           ip65504P1076MemdataL = refreshIp65504P1076MemdataL();
        }
   		return ip65504P1076MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1076MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1076-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1076MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1076MemdataL = checkIp65504P1076MemdataLMaxLimit(number); 
		serializeIp65504P1076MemdataL(ip65504P1076MemdataL);
	}

	public void setIp65504P1076MemdataL(int number) {
	    number = checkIp65504P1076MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1076MemdataL((short)number);
	}
	public void setIp65504P1076MemdataL(long number) {
	    number = checkIp65504P1076MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1076MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1077MemdataS
	 *	@return ip65504P1077MemdataS
	 */
	public short getIp65504P1077MemdataS() throws CFException {
        if (isIp65504P1077MemdataSModified()) { 
           ip65504P1077MemdataS = refreshIp65504P1077MemdataS();
        }
   		return ip65504P1077MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1077MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1077-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1077MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1077MemdataS = checkIp65504P1077MemdataSMaxLimit(number); 
		serializeIp65504P1077MemdataS(ip65504P1077MemdataS);
	}

	public void setIp65504P1077MemdataS(int number) {
	    number = checkIp65504P1077MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1077MemdataS((short)number);
	}
	public void setIp65504P1077MemdataS(long number) {
	    number = checkIp65504P1077MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1077MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1077MemdataL
	 *	@return ip65504P1077MemdataL
	 */
	public short getIp65504P1077MemdataL() throws CFException {
        if (isIp65504P1077MemdataLModified()) { 
           ip65504P1077MemdataL = refreshIp65504P1077MemdataL();
        }
   		return ip65504P1077MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1077MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1077-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1077MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1077MemdataL = checkIp65504P1077MemdataLMaxLimit(number); 
		serializeIp65504P1077MemdataL(ip65504P1077MemdataL);
	}

	public void setIp65504P1077MemdataL(int number) {
	    number = checkIp65504P1077MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1077MemdataL((short)number);
	}
	public void setIp65504P1077MemdataL(long number) {
	    number = checkIp65504P1077MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1077MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1078MemdataS
	 *	@return ip65504P1078MemdataS
	 */
	public short getIp65504P1078MemdataS() throws CFException {
        if (isIp65504P1078MemdataSModified()) { 
           ip65504P1078MemdataS = refreshIp65504P1078MemdataS();
        }
   		return ip65504P1078MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1078MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1078-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1078MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1078MemdataS = checkIp65504P1078MemdataSMaxLimit(number); 
		serializeIp65504P1078MemdataS(ip65504P1078MemdataS);
	}

	public void setIp65504P1078MemdataS(int number) {
	    number = checkIp65504P1078MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1078MemdataS((short)number);
	}
	public void setIp65504P1078MemdataS(long number) {
	    number = checkIp65504P1078MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1078MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1078MemdataL
	 *	@return ip65504P1078MemdataL
	 */
	public short getIp65504P1078MemdataL() throws CFException {
        if (isIp65504P1078MemdataLModified()) { 
           ip65504P1078MemdataL = refreshIp65504P1078MemdataL();
        }
   		return ip65504P1078MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1078MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1078-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1078MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1078MemdataL = checkIp65504P1078MemdataLMaxLimit(number); 
		serializeIp65504P1078MemdataL(ip65504P1078MemdataL);
	}

	public void setIp65504P1078MemdataL(int number) {
	    number = checkIp65504P1078MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1078MemdataL((short)number);
	}
	public void setIp65504P1078MemdataL(long number) {
	    number = checkIp65504P1078MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1078MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1079MemdataS
	 *	@return ip65504P1079MemdataS
	 */
	public short getIp65504P1079MemdataS() throws CFException {
        if (isIp65504P1079MemdataSModified()) { 
           ip65504P1079MemdataS = refreshIp65504P1079MemdataS();
        }
   		return ip65504P1079MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1079MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1079-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1079MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1079MemdataS = checkIp65504P1079MemdataSMaxLimit(number); 
		serializeIp65504P1079MemdataS(ip65504P1079MemdataS);
	}

	public void setIp65504P1079MemdataS(int number) {
	    number = checkIp65504P1079MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1079MemdataS((short)number);
	}
	public void setIp65504P1079MemdataS(long number) {
	    number = checkIp65504P1079MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1079MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1079MemdataL
	 *	@return ip65504P1079MemdataL
	 */
	public short getIp65504P1079MemdataL() throws CFException {
        if (isIp65504P1079MemdataLModified()) { 
           ip65504P1079MemdataL = refreshIp65504P1079MemdataL();
        }
   		return ip65504P1079MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1079MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1079-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1079MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1079MemdataL = checkIp65504P1079MemdataLMaxLimit(number); 
		serializeIp65504P1079MemdataL(ip65504P1079MemdataL);
	}

	public void setIp65504P1079MemdataL(int number) {
	    number = checkIp65504P1079MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1079MemdataL((short)number);
	}
	public void setIp65504P1079MemdataL(long number) {
	    number = checkIp65504P1079MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1079MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1080MemdataS
	 *	@return ip65504P1080MemdataS
	 */
	public short getIp65504P1080MemdataS() throws CFException {
        if (isIp65504P1080MemdataSModified()) { 
           ip65504P1080MemdataS = refreshIp65504P1080MemdataS();
        }
   		return ip65504P1080MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1080MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1080-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1080MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1080MemdataS = checkIp65504P1080MemdataSMaxLimit(number); 
		serializeIp65504P1080MemdataS(ip65504P1080MemdataS);
	}

	public void setIp65504P1080MemdataS(int number) {
	    number = checkIp65504P1080MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1080MemdataS((short)number);
	}
	public void setIp65504P1080MemdataS(long number) {
	    number = checkIp65504P1080MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1080MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1080MemdataL
	 *	@return ip65504P1080MemdataL
	 */
	public short getIp65504P1080MemdataL() throws CFException {
        if (isIp65504P1080MemdataLModified()) { 
           ip65504P1080MemdataL = refreshIp65504P1080MemdataL();
        }
   		return ip65504P1080MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1080MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1080-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1080MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1080MemdataL = checkIp65504P1080MemdataLMaxLimit(number); 
		serializeIp65504P1080MemdataL(ip65504P1080MemdataL);
	}

	public void setIp65504P1080MemdataL(int number) {
	    number = checkIp65504P1080MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1080MemdataL((short)number);
	}
	public void setIp65504P1080MemdataL(long number) {
	    number = checkIp65504P1080MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1080MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1081MemdataS
	 *	@return ip65504P1081MemdataS
	 */
	public short getIp65504P1081MemdataS() throws CFException {
        if (isIp65504P1081MemdataSModified()) { 
           ip65504P1081MemdataS = refreshIp65504P1081MemdataS();
        }
   		return ip65504P1081MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1081MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1081-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1081MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1081MemdataS = checkIp65504P1081MemdataSMaxLimit(number); 
		serializeIp65504P1081MemdataS(ip65504P1081MemdataS);
	}

	public void setIp65504P1081MemdataS(int number) {
	    number = checkIp65504P1081MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1081MemdataS((short)number);
	}
	public void setIp65504P1081MemdataS(long number) {
	    number = checkIp65504P1081MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1081MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1081MemdataL
	 *	@return ip65504P1081MemdataL
	 */
	public short getIp65504P1081MemdataL() throws CFException {
        if (isIp65504P1081MemdataLModified()) { 
           ip65504P1081MemdataL = refreshIp65504P1081MemdataL();
        }
   		return ip65504P1081MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1081MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1081-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1081MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1081MemdataL = checkIp65504P1081MemdataLMaxLimit(number); 
		serializeIp65504P1081MemdataL(ip65504P1081MemdataL);
	}

	public void setIp65504P1081MemdataL(int number) {
	    number = checkIp65504P1081MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1081MemdataL((short)number);
	}
	public void setIp65504P1081MemdataL(long number) {
	    number = checkIp65504P1081MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1081MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1082MemdataS
	 *	@return ip65504P1082MemdataS
	 */
	public short getIp65504P1082MemdataS() throws CFException {
        if (isIp65504P1082MemdataSModified()) { 
           ip65504P1082MemdataS = refreshIp65504P1082MemdataS();
        }
   		return ip65504P1082MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1082MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1082-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1082MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1082MemdataS = checkIp65504P1082MemdataSMaxLimit(number); 
		serializeIp65504P1082MemdataS(ip65504P1082MemdataS);
	}

	public void setIp65504P1082MemdataS(int number) {
	    number = checkIp65504P1082MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1082MemdataS((short)number);
	}
	public void setIp65504P1082MemdataS(long number) {
	    number = checkIp65504P1082MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1082MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1082MemdataL
	 *	@return ip65504P1082MemdataL
	 */
	public short getIp65504P1082MemdataL() throws CFException {
        if (isIp65504P1082MemdataLModified()) { 
           ip65504P1082MemdataL = refreshIp65504P1082MemdataL();
        }
   		return ip65504P1082MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1082MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1082-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1082MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1082MemdataL = checkIp65504P1082MemdataLMaxLimit(number); 
		serializeIp65504P1082MemdataL(ip65504P1082MemdataL);
	}

	public void setIp65504P1082MemdataL(int number) {
	    number = checkIp65504P1082MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1082MemdataL((short)number);
	}
	public void setIp65504P1082MemdataL(long number) {
	    number = checkIp65504P1082MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1082MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1083MemdataS
	 *	@return ip65504P1083MemdataS
	 */
	public short getIp65504P1083MemdataS() throws CFException {
        if (isIp65504P1083MemdataSModified()) { 
           ip65504P1083MemdataS = refreshIp65504P1083MemdataS();
        }
   		return ip65504P1083MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1083MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1083-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1083MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1083MemdataS = checkIp65504P1083MemdataSMaxLimit(number); 
		serializeIp65504P1083MemdataS(ip65504P1083MemdataS);
	}

	public void setIp65504P1083MemdataS(int number) {
	    number = checkIp65504P1083MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1083MemdataS((short)number);
	}
	public void setIp65504P1083MemdataS(long number) {
	    number = checkIp65504P1083MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1083MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1083MemdataL
	 *	@return ip65504P1083MemdataL
	 */
	public short getIp65504P1083MemdataL() throws CFException {
        if (isIp65504P1083MemdataLModified()) { 
           ip65504P1083MemdataL = refreshIp65504P1083MemdataL();
        }
   		return ip65504P1083MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1083MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1083-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1083MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1083MemdataL = checkIp65504P1083MemdataLMaxLimit(number); 
		serializeIp65504P1083MemdataL(ip65504P1083MemdataL);
	}

	public void setIp65504P1083MemdataL(int number) {
	    number = checkIp65504P1083MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1083MemdataL((short)number);
	}
	public void setIp65504P1083MemdataL(long number) {
	    number = checkIp65504P1083MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1083MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1084MemdataS
	 *	@return ip65504P1084MemdataS
	 */
	public short getIp65504P1084MemdataS() throws CFException {
        if (isIp65504P1084MemdataSModified()) { 
           ip65504P1084MemdataS = refreshIp65504P1084MemdataS();
        }
   		return ip65504P1084MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1084MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1084-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1084MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1084MemdataS = checkIp65504P1084MemdataSMaxLimit(number); 
		serializeIp65504P1084MemdataS(ip65504P1084MemdataS);
	}

	public void setIp65504P1084MemdataS(int number) {
	    number = checkIp65504P1084MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1084MemdataS((short)number);
	}
	public void setIp65504P1084MemdataS(long number) {
	    number = checkIp65504P1084MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1084MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1084MemdataL
	 *	@return ip65504P1084MemdataL
	 */
	public short getIp65504P1084MemdataL() throws CFException {
        if (isIp65504P1084MemdataLModified()) { 
           ip65504P1084MemdataL = refreshIp65504P1084MemdataL();
        }
   		return ip65504P1084MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1084MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1084-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1084MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1084MemdataL = checkIp65504P1084MemdataLMaxLimit(number); 
		serializeIp65504P1084MemdataL(ip65504P1084MemdataL);
	}

	public void setIp65504P1084MemdataL(int number) {
	    number = checkIp65504P1084MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1084MemdataL((short)number);
	}
	public void setIp65504P1084MemdataL(long number) {
	    number = checkIp65504P1084MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1084MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1085MemdataS
	 *	@return ip65504P1085MemdataS
	 */
	public short getIp65504P1085MemdataS() throws CFException {
        if (isIp65504P1085MemdataSModified()) { 
           ip65504P1085MemdataS = refreshIp65504P1085MemdataS();
        }
   		return ip65504P1085MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1085MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1085-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1085MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1085MemdataS = checkIp65504P1085MemdataSMaxLimit(number); 
		serializeIp65504P1085MemdataS(ip65504P1085MemdataS);
	}

	public void setIp65504P1085MemdataS(int number) {
	    number = checkIp65504P1085MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1085MemdataS((short)number);
	}
	public void setIp65504P1085MemdataS(long number) {
	    number = checkIp65504P1085MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1085MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1085MemdataL
	 *	@return ip65504P1085MemdataL
	 */
	public short getIp65504P1085MemdataL() throws CFException {
        if (isIp65504P1085MemdataLModified()) { 
           ip65504P1085MemdataL = refreshIp65504P1085MemdataL();
        }
   		return ip65504P1085MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1085MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1085-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1085MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1085MemdataL = checkIp65504P1085MemdataLMaxLimit(number); 
		serializeIp65504P1085MemdataL(ip65504P1085MemdataL);
	}

	public void setIp65504P1085MemdataL(int number) {
	    number = checkIp65504P1085MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1085MemdataL((short)number);
	}
	public void setIp65504P1085MemdataL(long number) {
	    number = checkIp65504P1085MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1085MemdataL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup35
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P1055MemdataS((short)0);
         	setIp65504P1055MemdataL((short)0);
         	setIp65504P1056MemdataS((short)0);
         	setIp65504P1056MemdataL((short)0);
         	setIp65504P1057MemdataS((short)0);
         	setIp65504P1057MemdataL((short)0);
         	setIp65504P1058MemdataS((short)0);
         	setIp65504P1058MemdataL((short)0);
         	setIp65504P1059MemdataS((short)0);
         	setIp65504P1059MemdataL((short)0);
         	setIp65504P1060MemdataS((short)0);
         	setIp65504P1060MemdataL((short)0);
         	setIp65504P1061MemdataS((short)0);
         	setIp65504P1061MemdataL((short)0);
         	setIp65504P1062MemdataS((short)0);
         	setIp65504P1062MemdataL((short)0);
         	setIp65504P1063MemdataS((short)0);
         	setIp65504P1063MemdataL((short)0);
         	setIp65504P1064MemdataS((short)0);
         	setIp65504P1064MemdataL((short)0);
         	setIp65504P1065MemdataS((short)0);
         	setIp65504P1065MemdataL((short)0);
         	setIp65504P1066MemdataS((short)0);
         	setIp65504P1066MemdataL((short)0);
         	setIp65504P1067MemdataS((short)0);
         	setIp65504P1067MemdataL((short)0);
         	setIp65504P1068MemdataS((short)0);
         	setIp65504P1068MemdataL((short)0);
         	setIp65504P1069MemdataS((short)0);
         	setIp65504P1069MemdataL((short)0);
         	setIp65504P1070MemdataS((short)0);
         	setIp65504P1070MemdataL((short)0);
         	setIp65504P1071MemdataS((short)0);
         	setIp65504P1071MemdataL((short)0);
         	setIp65504P1072MemdataS((short)0);
         	setIp65504P1072MemdataL((short)0);
         	setIp65504P1073MemdataS((short)0);
         	setIp65504P1073MemdataL((short)0);
         	setIp65504P1074MemdataS((short)0);
         	setIp65504P1074MemdataL((short)0);
         	setIp65504P1075MemdataS((short)0);
         	setIp65504P1075MemdataL((short)0);
         	setIp65504P1076MemdataS((short)0);
         	setIp65504P1076MemdataL((short)0);
         	setIp65504P1077MemdataS((short)0);
         	setIp65504P1077MemdataL((short)0);
         	setIp65504P1078MemdataS((short)0);
         	setIp65504P1078MemdataL((short)0);
         	setIp65504P1079MemdataS((short)0);
         	setIp65504P1079MemdataL((short)0);
         	setIp65504P1080MemdataS((short)0);
         	setIp65504P1080MemdataL((short)0);
         	setIp65504P1081MemdataS((short)0);
         	setIp65504P1081MemdataL((short)0);
         	setIp65504P1082MemdataS((short)0);
         	setIp65504P1082MemdataL((short)0);
         	setIp65504P1083MemdataS((short)0);
         	setIp65504P1083MemdataL((short)0);
         	setIp65504P1084MemdataS((short)0);
         	setIp65504P1084MemdataL((short)0);
         	setIp65504P1085MemdataS((short)0);
         	setIp65504P1085MemdataL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup35FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_35_LENGTH;
		}

}
  
