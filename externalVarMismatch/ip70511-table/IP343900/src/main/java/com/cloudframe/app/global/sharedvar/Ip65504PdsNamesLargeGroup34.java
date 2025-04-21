package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup34 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup34 extends Ip65504PdsNamesLargeGroup34Serialized { 
   

								private short ip65504P1024MemdataS;

								private short ip65504P1024MemdataL;


								private short ip65504P1025MemdataS;

								private short ip65504P1025MemdataL;


								private short ip65504P1026MemdataS;

								private short ip65504P1026MemdataL;


								private short ip65504P1027MemdataS;

								private short ip65504P1027MemdataL;


								private short ip65504P1028MemdataS;

								private short ip65504P1028MemdataL;


								private short ip65504P1029MemdataS;

								private short ip65504P1029MemdataL;


								private short ip65504P1030MemdataS;

								private short ip65504P1030MemdataL;


								private short ip65504P1031MemdataS;

								private short ip65504P1031MemdataL;


								private short ip65504P1032MemdataS;

								private short ip65504P1032MemdataL;


								private short ip65504P1033MemdataS;

								private short ip65504P1033MemdataL;


								private short ip65504P1034MemdataS;

								private short ip65504P1034MemdataL;


								private short ip65504P1035MemdataS;

								private short ip65504P1035MemdataL;


								private short ip65504P1036MemdataS;

								private short ip65504P1036MemdataL;


								private short ip65504P1037MemdataS;

								private short ip65504P1037MemdataL;


								private short ip65504P1038MemdataS;

								private short ip65504P1038MemdataL;


								private short ip65504P1039MemdataS;

								private short ip65504P1039MemdataL;


								private short ip65504P1040MemdataS;

								private short ip65504P1040MemdataL;


								private short ip65504P1041MemdataS;

								private short ip65504P1041MemdataL;


								private short ip65504P1042MemdataS;

								private short ip65504P1042MemdataL;


								private short ip65504P1043MemdataS;

								private short ip65504P1043MemdataL;


								private short ip65504P1044MemdataS;

								private short ip65504P1044MemdataL;


								private short ip65504P1045MemdataS;

								private short ip65504P1045MemdataL;


								private short ip65504P1046MemdataS;

								private short ip65504P1046MemdataL;


								private short ip65504P1047MemdataS;

								private short ip65504P1047MemdataL;


								private short ip65504P1048MemdataS;

								private short ip65504P1048MemdataL;


								private short ip65504P1049MemdataS;

								private short ip65504P1049MemdataL;


								private short ip65504P1050MemdataS;

								private short ip65504P1050MemdataL;


								private short ip65504P1051MemdataS;

								private short ip65504P1051MemdataL;


								private short ip65504P1052MemdataS;

								private short ip65504P1052MemdataL;


								private short ip65504P1053MemdataS;

								private short ip65504P1053MemdataL;


								private short ip65504P1054MemdataS;

								private short ip65504P1054MemdataL;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup34
	**/
    public Ip65504PdsNamesLargeGroup34() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup34. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup34(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P1024MemdataS
	 *	@return ip65504P1024MemdataS
	 */
	public short getIp65504P1024MemdataS() throws CFException {
        if (isIp65504P1024MemdataSModified()) { 
           ip65504P1024MemdataS = refreshIp65504P1024MemdataS();
        }
   		return ip65504P1024MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1024MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1024-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1024MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1024MemdataS = checkIp65504P1024MemdataSMaxLimit(number); 
		serializeIp65504P1024MemdataS(ip65504P1024MemdataS);
	}

	public void setIp65504P1024MemdataS(int number) {
	    number = checkIp65504P1024MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1024MemdataS((short)number);
	}
	public void setIp65504P1024MemdataS(long number) {
	    number = checkIp65504P1024MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1024MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1024MemdataL
	 *	@return ip65504P1024MemdataL
	 */
	public short getIp65504P1024MemdataL() throws CFException {
        if (isIp65504P1024MemdataLModified()) { 
           ip65504P1024MemdataL = refreshIp65504P1024MemdataL();
        }
   		return ip65504P1024MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1024MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1024-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1024MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1024MemdataL = checkIp65504P1024MemdataLMaxLimit(number); 
		serializeIp65504P1024MemdataL(ip65504P1024MemdataL);
	}

	public void setIp65504P1024MemdataL(int number) {
	    number = checkIp65504P1024MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1024MemdataL((short)number);
	}
	public void setIp65504P1024MemdataL(long number) {
	    number = checkIp65504P1024MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1024MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1025MemdataS
	 *	@return ip65504P1025MemdataS
	 */
	public short getIp65504P1025MemdataS() throws CFException {
        if (isIp65504P1025MemdataSModified()) { 
           ip65504P1025MemdataS = refreshIp65504P1025MemdataS();
        }
   		return ip65504P1025MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1025MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1025-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1025MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1025MemdataS = checkIp65504P1025MemdataSMaxLimit(number); 
		serializeIp65504P1025MemdataS(ip65504P1025MemdataS);
	}

	public void setIp65504P1025MemdataS(int number) {
	    number = checkIp65504P1025MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1025MemdataS((short)number);
	}
	public void setIp65504P1025MemdataS(long number) {
	    number = checkIp65504P1025MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1025MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1025MemdataL
	 *	@return ip65504P1025MemdataL
	 */
	public short getIp65504P1025MemdataL() throws CFException {
        if (isIp65504P1025MemdataLModified()) { 
           ip65504P1025MemdataL = refreshIp65504P1025MemdataL();
        }
   		return ip65504P1025MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1025MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1025-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1025MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1025MemdataL = checkIp65504P1025MemdataLMaxLimit(number); 
		serializeIp65504P1025MemdataL(ip65504P1025MemdataL);
	}

	public void setIp65504P1025MemdataL(int number) {
	    number = checkIp65504P1025MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1025MemdataL((short)number);
	}
	public void setIp65504P1025MemdataL(long number) {
	    number = checkIp65504P1025MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1025MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1026MemdataS
	 *	@return ip65504P1026MemdataS
	 */
	public short getIp65504P1026MemdataS() throws CFException {
        if (isIp65504P1026MemdataSModified()) { 
           ip65504P1026MemdataS = refreshIp65504P1026MemdataS();
        }
   		return ip65504P1026MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1026MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1026-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1026MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1026MemdataS = checkIp65504P1026MemdataSMaxLimit(number); 
		serializeIp65504P1026MemdataS(ip65504P1026MemdataS);
	}

	public void setIp65504P1026MemdataS(int number) {
	    number = checkIp65504P1026MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1026MemdataS((short)number);
	}
	public void setIp65504P1026MemdataS(long number) {
	    number = checkIp65504P1026MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1026MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1026MemdataL
	 *	@return ip65504P1026MemdataL
	 */
	public short getIp65504P1026MemdataL() throws CFException {
        if (isIp65504P1026MemdataLModified()) { 
           ip65504P1026MemdataL = refreshIp65504P1026MemdataL();
        }
   		return ip65504P1026MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1026MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1026-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1026MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1026MemdataL = checkIp65504P1026MemdataLMaxLimit(number); 
		serializeIp65504P1026MemdataL(ip65504P1026MemdataL);
	}

	public void setIp65504P1026MemdataL(int number) {
	    number = checkIp65504P1026MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1026MemdataL((short)number);
	}
	public void setIp65504P1026MemdataL(long number) {
	    number = checkIp65504P1026MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1026MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1027MemdataS
	 *	@return ip65504P1027MemdataS
	 */
	public short getIp65504P1027MemdataS() throws CFException {
        if (isIp65504P1027MemdataSModified()) { 
           ip65504P1027MemdataS = refreshIp65504P1027MemdataS();
        }
   		return ip65504P1027MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1027MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1027-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1027MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1027MemdataS = checkIp65504P1027MemdataSMaxLimit(number); 
		serializeIp65504P1027MemdataS(ip65504P1027MemdataS);
	}

	public void setIp65504P1027MemdataS(int number) {
	    number = checkIp65504P1027MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1027MemdataS((short)number);
	}
	public void setIp65504P1027MemdataS(long number) {
	    number = checkIp65504P1027MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1027MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1027MemdataL
	 *	@return ip65504P1027MemdataL
	 */
	public short getIp65504P1027MemdataL() throws CFException {
        if (isIp65504P1027MemdataLModified()) { 
           ip65504P1027MemdataL = refreshIp65504P1027MemdataL();
        }
   		return ip65504P1027MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1027MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1027-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1027MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1027MemdataL = checkIp65504P1027MemdataLMaxLimit(number); 
		serializeIp65504P1027MemdataL(ip65504P1027MemdataL);
	}

	public void setIp65504P1027MemdataL(int number) {
	    number = checkIp65504P1027MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1027MemdataL((short)number);
	}
	public void setIp65504P1027MemdataL(long number) {
	    number = checkIp65504P1027MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1027MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1028MemdataS
	 *	@return ip65504P1028MemdataS
	 */
	public short getIp65504P1028MemdataS() throws CFException {
        if (isIp65504P1028MemdataSModified()) { 
           ip65504P1028MemdataS = refreshIp65504P1028MemdataS();
        }
   		return ip65504P1028MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1028MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1028-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1028MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1028MemdataS = checkIp65504P1028MemdataSMaxLimit(number); 
		serializeIp65504P1028MemdataS(ip65504P1028MemdataS);
	}

	public void setIp65504P1028MemdataS(int number) {
	    number = checkIp65504P1028MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1028MemdataS((short)number);
	}
	public void setIp65504P1028MemdataS(long number) {
	    number = checkIp65504P1028MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1028MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1028MemdataL
	 *	@return ip65504P1028MemdataL
	 */
	public short getIp65504P1028MemdataL() throws CFException {
        if (isIp65504P1028MemdataLModified()) { 
           ip65504P1028MemdataL = refreshIp65504P1028MemdataL();
        }
   		return ip65504P1028MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1028MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1028-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1028MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1028MemdataL = checkIp65504P1028MemdataLMaxLimit(number); 
		serializeIp65504P1028MemdataL(ip65504P1028MemdataL);
	}

	public void setIp65504P1028MemdataL(int number) {
	    number = checkIp65504P1028MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1028MemdataL((short)number);
	}
	public void setIp65504P1028MemdataL(long number) {
	    number = checkIp65504P1028MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1028MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1029MemdataS
	 *	@return ip65504P1029MemdataS
	 */
	public short getIp65504P1029MemdataS() throws CFException {
        if (isIp65504P1029MemdataSModified()) { 
           ip65504P1029MemdataS = refreshIp65504P1029MemdataS();
        }
   		return ip65504P1029MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1029MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1029-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1029MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1029MemdataS = checkIp65504P1029MemdataSMaxLimit(number); 
		serializeIp65504P1029MemdataS(ip65504P1029MemdataS);
	}

	public void setIp65504P1029MemdataS(int number) {
	    number = checkIp65504P1029MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1029MemdataS((short)number);
	}
	public void setIp65504P1029MemdataS(long number) {
	    number = checkIp65504P1029MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1029MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1029MemdataL
	 *	@return ip65504P1029MemdataL
	 */
	public short getIp65504P1029MemdataL() throws CFException {
        if (isIp65504P1029MemdataLModified()) { 
           ip65504P1029MemdataL = refreshIp65504P1029MemdataL();
        }
   		return ip65504P1029MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1029MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1029-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1029MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1029MemdataL = checkIp65504P1029MemdataLMaxLimit(number); 
		serializeIp65504P1029MemdataL(ip65504P1029MemdataL);
	}

	public void setIp65504P1029MemdataL(int number) {
	    number = checkIp65504P1029MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1029MemdataL((short)number);
	}
	public void setIp65504P1029MemdataL(long number) {
	    number = checkIp65504P1029MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1029MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1030MemdataS
	 *	@return ip65504P1030MemdataS
	 */
	public short getIp65504P1030MemdataS() throws CFException {
        if (isIp65504P1030MemdataSModified()) { 
           ip65504P1030MemdataS = refreshIp65504P1030MemdataS();
        }
   		return ip65504P1030MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1030MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1030-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1030MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1030MemdataS = checkIp65504P1030MemdataSMaxLimit(number); 
		serializeIp65504P1030MemdataS(ip65504P1030MemdataS);
	}

	public void setIp65504P1030MemdataS(int number) {
	    number = checkIp65504P1030MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1030MemdataS((short)number);
	}
	public void setIp65504P1030MemdataS(long number) {
	    number = checkIp65504P1030MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1030MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1030MemdataL
	 *	@return ip65504P1030MemdataL
	 */
	public short getIp65504P1030MemdataL() throws CFException {
        if (isIp65504P1030MemdataLModified()) { 
           ip65504P1030MemdataL = refreshIp65504P1030MemdataL();
        }
   		return ip65504P1030MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1030MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1030-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1030MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1030MemdataL = checkIp65504P1030MemdataLMaxLimit(number); 
		serializeIp65504P1030MemdataL(ip65504P1030MemdataL);
	}

	public void setIp65504P1030MemdataL(int number) {
	    number = checkIp65504P1030MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1030MemdataL((short)number);
	}
	public void setIp65504P1030MemdataL(long number) {
	    number = checkIp65504P1030MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1030MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1031MemdataS
	 *	@return ip65504P1031MemdataS
	 */
	public short getIp65504P1031MemdataS() throws CFException {
        if (isIp65504P1031MemdataSModified()) { 
           ip65504P1031MemdataS = refreshIp65504P1031MemdataS();
        }
   		return ip65504P1031MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1031MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1031-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1031MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1031MemdataS = checkIp65504P1031MemdataSMaxLimit(number); 
		serializeIp65504P1031MemdataS(ip65504P1031MemdataS);
	}

	public void setIp65504P1031MemdataS(int number) {
	    number = checkIp65504P1031MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1031MemdataS((short)number);
	}
	public void setIp65504P1031MemdataS(long number) {
	    number = checkIp65504P1031MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1031MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1031MemdataL
	 *	@return ip65504P1031MemdataL
	 */
	public short getIp65504P1031MemdataL() throws CFException {
        if (isIp65504P1031MemdataLModified()) { 
           ip65504P1031MemdataL = refreshIp65504P1031MemdataL();
        }
   		return ip65504P1031MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1031MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1031-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1031MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1031MemdataL = checkIp65504P1031MemdataLMaxLimit(number); 
		serializeIp65504P1031MemdataL(ip65504P1031MemdataL);
	}

	public void setIp65504P1031MemdataL(int number) {
	    number = checkIp65504P1031MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1031MemdataL((short)number);
	}
	public void setIp65504P1031MemdataL(long number) {
	    number = checkIp65504P1031MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1031MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1032MemdataS
	 *	@return ip65504P1032MemdataS
	 */
	public short getIp65504P1032MemdataS() throws CFException {
        if (isIp65504P1032MemdataSModified()) { 
           ip65504P1032MemdataS = refreshIp65504P1032MemdataS();
        }
   		return ip65504P1032MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1032MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1032-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1032MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1032MemdataS = checkIp65504P1032MemdataSMaxLimit(number); 
		serializeIp65504P1032MemdataS(ip65504P1032MemdataS);
	}

	public void setIp65504P1032MemdataS(int number) {
	    number = checkIp65504P1032MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1032MemdataS((short)number);
	}
	public void setIp65504P1032MemdataS(long number) {
	    number = checkIp65504P1032MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1032MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1032MemdataL
	 *	@return ip65504P1032MemdataL
	 */
	public short getIp65504P1032MemdataL() throws CFException {
        if (isIp65504P1032MemdataLModified()) { 
           ip65504P1032MemdataL = refreshIp65504P1032MemdataL();
        }
   		return ip65504P1032MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1032MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1032-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1032MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1032MemdataL = checkIp65504P1032MemdataLMaxLimit(number); 
		serializeIp65504P1032MemdataL(ip65504P1032MemdataL);
	}

	public void setIp65504P1032MemdataL(int number) {
	    number = checkIp65504P1032MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1032MemdataL((short)number);
	}
	public void setIp65504P1032MemdataL(long number) {
	    number = checkIp65504P1032MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1032MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1033MemdataS
	 *	@return ip65504P1033MemdataS
	 */
	public short getIp65504P1033MemdataS() throws CFException {
        if (isIp65504P1033MemdataSModified()) { 
           ip65504P1033MemdataS = refreshIp65504P1033MemdataS();
        }
   		return ip65504P1033MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1033MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1033-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1033MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1033MemdataS = checkIp65504P1033MemdataSMaxLimit(number); 
		serializeIp65504P1033MemdataS(ip65504P1033MemdataS);
	}

	public void setIp65504P1033MemdataS(int number) {
	    number = checkIp65504P1033MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1033MemdataS((short)number);
	}
	public void setIp65504P1033MemdataS(long number) {
	    number = checkIp65504P1033MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1033MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1033MemdataL
	 *	@return ip65504P1033MemdataL
	 */
	public short getIp65504P1033MemdataL() throws CFException {
        if (isIp65504P1033MemdataLModified()) { 
           ip65504P1033MemdataL = refreshIp65504P1033MemdataL();
        }
   		return ip65504P1033MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1033MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1033-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1033MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1033MemdataL = checkIp65504P1033MemdataLMaxLimit(number); 
		serializeIp65504P1033MemdataL(ip65504P1033MemdataL);
	}

	public void setIp65504P1033MemdataL(int number) {
	    number = checkIp65504P1033MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1033MemdataL((short)number);
	}
	public void setIp65504P1033MemdataL(long number) {
	    number = checkIp65504P1033MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1033MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1034MemdataS
	 *	@return ip65504P1034MemdataS
	 */
	public short getIp65504P1034MemdataS() throws CFException {
        if (isIp65504P1034MemdataSModified()) { 
           ip65504P1034MemdataS = refreshIp65504P1034MemdataS();
        }
   		return ip65504P1034MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1034MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1034-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1034MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1034MemdataS = checkIp65504P1034MemdataSMaxLimit(number); 
		serializeIp65504P1034MemdataS(ip65504P1034MemdataS);
	}

	public void setIp65504P1034MemdataS(int number) {
	    number = checkIp65504P1034MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1034MemdataS((short)number);
	}
	public void setIp65504P1034MemdataS(long number) {
	    number = checkIp65504P1034MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1034MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1034MemdataL
	 *	@return ip65504P1034MemdataL
	 */
	public short getIp65504P1034MemdataL() throws CFException {
        if (isIp65504P1034MemdataLModified()) { 
           ip65504P1034MemdataL = refreshIp65504P1034MemdataL();
        }
   		return ip65504P1034MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1034MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1034-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1034MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1034MemdataL = checkIp65504P1034MemdataLMaxLimit(number); 
		serializeIp65504P1034MemdataL(ip65504P1034MemdataL);
	}

	public void setIp65504P1034MemdataL(int number) {
	    number = checkIp65504P1034MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1034MemdataL((short)number);
	}
	public void setIp65504P1034MemdataL(long number) {
	    number = checkIp65504P1034MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1034MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1035MemdataS
	 *	@return ip65504P1035MemdataS
	 */
	public short getIp65504P1035MemdataS() throws CFException {
        if (isIp65504P1035MemdataSModified()) { 
           ip65504P1035MemdataS = refreshIp65504P1035MemdataS();
        }
   		return ip65504P1035MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1035MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1035-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1035MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1035MemdataS = checkIp65504P1035MemdataSMaxLimit(number); 
		serializeIp65504P1035MemdataS(ip65504P1035MemdataS);
	}

	public void setIp65504P1035MemdataS(int number) {
	    number = checkIp65504P1035MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1035MemdataS((short)number);
	}
	public void setIp65504P1035MemdataS(long number) {
	    number = checkIp65504P1035MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1035MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1035MemdataL
	 *	@return ip65504P1035MemdataL
	 */
	public short getIp65504P1035MemdataL() throws CFException {
        if (isIp65504P1035MemdataLModified()) { 
           ip65504P1035MemdataL = refreshIp65504P1035MemdataL();
        }
   		return ip65504P1035MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1035MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1035-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1035MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1035MemdataL = checkIp65504P1035MemdataLMaxLimit(number); 
		serializeIp65504P1035MemdataL(ip65504P1035MemdataL);
	}

	public void setIp65504P1035MemdataL(int number) {
	    number = checkIp65504P1035MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1035MemdataL((short)number);
	}
	public void setIp65504P1035MemdataL(long number) {
	    number = checkIp65504P1035MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1035MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1036MemdataS
	 *	@return ip65504P1036MemdataS
	 */
	public short getIp65504P1036MemdataS() throws CFException {
        if (isIp65504P1036MemdataSModified()) { 
           ip65504P1036MemdataS = refreshIp65504P1036MemdataS();
        }
   		return ip65504P1036MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1036MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1036-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1036MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1036MemdataS = checkIp65504P1036MemdataSMaxLimit(number); 
		serializeIp65504P1036MemdataS(ip65504P1036MemdataS);
	}

	public void setIp65504P1036MemdataS(int number) {
	    number = checkIp65504P1036MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1036MemdataS((short)number);
	}
	public void setIp65504P1036MemdataS(long number) {
	    number = checkIp65504P1036MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1036MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1036MemdataL
	 *	@return ip65504P1036MemdataL
	 */
	public short getIp65504P1036MemdataL() throws CFException {
        if (isIp65504P1036MemdataLModified()) { 
           ip65504P1036MemdataL = refreshIp65504P1036MemdataL();
        }
   		return ip65504P1036MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1036MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1036-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1036MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1036MemdataL = checkIp65504P1036MemdataLMaxLimit(number); 
		serializeIp65504P1036MemdataL(ip65504P1036MemdataL);
	}

	public void setIp65504P1036MemdataL(int number) {
	    number = checkIp65504P1036MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1036MemdataL((short)number);
	}
	public void setIp65504P1036MemdataL(long number) {
	    number = checkIp65504P1036MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1036MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1037MemdataS
	 *	@return ip65504P1037MemdataS
	 */
	public short getIp65504P1037MemdataS() throws CFException {
        if (isIp65504P1037MemdataSModified()) { 
           ip65504P1037MemdataS = refreshIp65504P1037MemdataS();
        }
   		return ip65504P1037MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1037MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1037-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1037MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1037MemdataS = checkIp65504P1037MemdataSMaxLimit(number); 
		serializeIp65504P1037MemdataS(ip65504P1037MemdataS);
	}

	public void setIp65504P1037MemdataS(int number) {
	    number = checkIp65504P1037MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1037MemdataS((short)number);
	}
	public void setIp65504P1037MemdataS(long number) {
	    number = checkIp65504P1037MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1037MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1037MemdataL
	 *	@return ip65504P1037MemdataL
	 */
	public short getIp65504P1037MemdataL() throws CFException {
        if (isIp65504P1037MemdataLModified()) { 
           ip65504P1037MemdataL = refreshIp65504P1037MemdataL();
        }
   		return ip65504P1037MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1037MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1037-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1037MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1037MemdataL = checkIp65504P1037MemdataLMaxLimit(number); 
		serializeIp65504P1037MemdataL(ip65504P1037MemdataL);
	}

	public void setIp65504P1037MemdataL(int number) {
	    number = checkIp65504P1037MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1037MemdataL((short)number);
	}
	public void setIp65504P1037MemdataL(long number) {
	    number = checkIp65504P1037MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1037MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1038MemdataS
	 *	@return ip65504P1038MemdataS
	 */
	public short getIp65504P1038MemdataS() throws CFException {
        if (isIp65504P1038MemdataSModified()) { 
           ip65504P1038MemdataS = refreshIp65504P1038MemdataS();
        }
   		return ip65504P1038MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1038MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1038-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1038MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1038MemdataS = checkIp65504P1038MemdataSMaxLimit(number); 
		serializeIp65504P1038MemdataS(ip65504P1038MemdataS);
	}

	public void setIp65504P1038MemdataS(int number) {
	    number = checkIp65504P1038MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1038MemdataS((short)number);
	}
	public void setIp65504P1038MemdataS(long number) {
	    number = checkIp65504P1038MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1038MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1038MemdataL
	 *	@return ip65504P1038MemdataL
	 */
	public short getIp65504P1038MemdataL() throws CFException {
        if (isIp65504P1038MemdataLModified()) { 
           ip65504P1038MemdataL = refreshIp65504P1038MemdataL();
        }
   		return ip65504P1038MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1038MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1038-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1038MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1038MemdataL = checkIp65504P1038MemdataLMaxLimit(number); 
		serializeIp65504P1038MemdataL(ip65504P1038MemdataL);
	}

	public void setIp65504P1038MemdataL(int number) {
	    number = checkIp65504P1038MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1038MemdataL((short)number);
	}
	public void setIp65504P1038MemdataL(long number) {
	    number = checkIp65504P1038MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1038MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1039MemdataS
	 *	@return ip65504P1039MemdataS
	 */
	public short getIp65504P1039MemdataS() throws CFException {
        if (isIp65504P1039MemdataSModified()) { 
           ip65504P1039MemdataS = refreshIp65504P1039MemdataS();
        }
   		return ip65504P1039MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1039MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1039-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1039MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1039MemdataS = checkIp65504P1039MemdataSMaxLimit(number); 
		serializeIp65504P1039MemdataS(ip65504P1039MemdataS);
	}

	public void setIp65504P1039MemdataS(int number) {
	    number = checkIp65504P1039MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1039MemdataS((short)number);
	}
	public void setIp65504P1039MemdataS(long number) {
	    number = checkIp65504P1039MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1039MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1039MemdataL
	 *	@return ip65504P1039MemdataL
	 */
	public short getIp65504P1039MemdataL() throws CFException {
        if (isIp65504P1039MemdataLModified()) { 
           ip65504P1039MemdataL = refreshIp65504P1039MemdataL();
        }
   		return ip65504P1039MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1039MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1039-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1039MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1039MemdataL = checkIp65504P1039MemdataLMaxLimit(number); 
		serializeIp65504P1039MemdataL(ip65504P1039MemdataL);
	}

	public void setIp65504P1039MemdataL(int number) {
	    number = checkIp65504P1039MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1039MemdataL((short)number);
	}
	public void setIp65504P1039MemdataL(long number) {
	    number = checkIp65504P1039MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1039MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1040MemdataS
	 *	@return ip65504P1040MemdataS
	 */
	public short getIp65504P1040MemdataS() throws CFException {
        if (isIp65504P1040MemdataSModified()) { 
           ip65504P1040MemdataS = refreshIp65504P1040MemdataS();
        }
   		return ip65504P1040MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1040MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1040-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1040MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1040MemdataS = checkIp65504P1040MemdataSMaxLimit(number); 
		serializeIp65504P1040MemdataS(ip65504P1040MemdataS);
	}

	public void setIp65504P1040MemdataS(int number) {
	    number = checkIp65504P1040MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1040MemdataS((short)number);
	}
	public void setIp65504P1040MemdataS(long number) {
	    number = checkIp65504P1040MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1040MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1040MemdataL
	 *	@return ip65504P1040MemdataL
	 */
	public short getIp65504P1040MemdataL() throws CFException {
        if (isIp65504P1040MemdataLModified()) { 
           ip65504P1040MemdataL = refreshIp65504P1040MemdataL();
        }
   		return ip65504P1040MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1040MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1040-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1040MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1040MemdataL = checkIp65504P1040MemdataLMaxLimit(number); 
		serializeIp65504P1040MemdataL(ip65504P1040MemdataL);
	}

	public void setIp65504P1040MemdataL(int number) {
	    number = checkIp65504P1040MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1040MemdataL((short)number);
	}
	public void setIp65504P1040MemdataL(long number) {
	    number = checkIp65504P1040MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1040MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1041MemdataS
	 *	@return ip65504P1041MemdataS
	 */
	public short getIp65504P1041MemdataS() throws CFException {
        if (isIp65504P1041MemdataSModified()) { 
           ip65504P1041MemdataS = refreshIp65504P1041MemdataS();
        }
   		return ip65504P1041MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1041MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1041-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1041MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1041MemdataS = checkIp65504P1041MemdataSMaxLimit(number); 
		serializeIp65504P1041MemdataS(ip65504P1041MemdataS);
	}

	public void setIp65504P1041MemdataS(int number) {
	    number = checkIp65504P1041MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1041MemdataS((short)number);
	}
	public void setIp65504P1041MemdataS(long number) {
	    number = checkIp65504P1041MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1041MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1041MemdataL
	 *	@return ip65504P1041MemdataL
	 */
	public short getIp65504P1041MemdataL() throws CFException {
        if (isIp65504P1041MemdataLModified()) { 
           ip65504P1041MemdataL = refreshIp65504P1041MemdataL();
        }
   		return ip65504P1041MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1041MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1041-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1041MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1041MemdataL = checkIp65504P1041MemdataLMaxLimit(number); 
		serializeIp65504P1041MemdataL(ip65504P1041MemdataL);
	}

	public void setIp65504P1041MemdataL(int number) {
	    number = checkIp65504P1041MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1041MemdataL((short)number);
	}
	public void setIp65504P1041MemdataL(long number) {
	    number = checkIp65504P1041MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1041MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1042MemdataS
	 *	@return ip65504P1042MemdataS
	 */
	public short getIp65504P1042MemdataS() throws CFException {
        if (isIp65504P1042MemdataSModified()) { 
           ip65504P1042MemdataS = refreshIp65504P1042MemdataS();
        }
   		return ip65504P1042MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1042MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1042-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1042MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1042MemdataS = checkIp65504P1042MemdataSMaxLimit(number); 
		serializeIp65504P1042MemdataS(ip65504P1042MemdataS);
	}

	public void setIp65504P1042MemdataS(int number) {
	    number = checkIp65504P1042MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1042MemdataS((short)number);
	}
	public void setIp65504P1042MemdataS(long number) {
	    number = checkIp65504P1042MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1042MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1042MemdataL
	 *	@return ip65504P1042MemdataL
	 */
	public short getIp65504P1042MemdataL() throws CFException {
        if (isIp65504P1042MemdataLModified()) { 
           ip65504P1042MemdataL = refreshIp65504P1042MemdataL();
        }
   		return ip65504P1042MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1042MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1042-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1042MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1042MemdataL = checkIp65504P1042MemdataLMaxLimit(number); 
		serializeIp65504P1042MemdataL(ip65504P1042MemdataL);
	}

	public void setIp65504P1042MemdataL(int number) {
	    number = checkIp65504P1042MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1042MemdataL((short)number);
	}
	public void setIp65504P1042MemdataL(long number) {
	    number = checkIp65504P1042MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1042MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1043MemdataS
	 *	@return ip65504P1043MemdataS
	 */
	public short getIp65504P1043MemdataS() throws CFException {
        if (isIp65504P1043MemdataSModified()) { 
           ip65504P1043MemdataS = refreshIp65504P1043MemdataS();
        }
   		return ip65504P1043MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1043MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1043-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1043MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1043MemdataS = checkIp65504P1043MemdataSMaxLimit(number); 
		serializeIp65504P1043MemdataS(ip65504P1043MemdataS);
	}

	public void setIp65504P1043MemdataS(int number) {
	    number = checkIp65504P1043MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1043MemdataS((short)number);
	}
	public void setIp65504P1043MemdataS(long number) {
	    number = checkIp65504P1043MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1043MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1043MemdataL
	 *	@return ip65504P1043MemdataL
	 */
	public short getIp65504P1043MemdataL() throws CFException {
        if (isIp65504P1043MemdataLModified()) { 
           ip65504P1043MemdataL = refreshIp65504P1043MemdataL();
        }
   		return ip65504P1043MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1043MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1043-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1043MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1043MemdataL = checkIp65504P1043MemdataLMaxLimit(number); 
		serializeIp65504P1043MemdataL(ip65504P1043MemdataL);
	}

	public void setIp65504P1043MemdataL(int number) {
	    number = checkIp65504P1043MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1043MemdataL((short)number);
	}
	public void setIp65504P1043MemdataL(long number) {
	    number = checkIp65504P1043MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1043MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1044MemdataS
	 *	@return ip65504P1044MemdataS
	 */
	public short getIp65504P1044MemdataS() throws CFException {
        if (isIp65504P1044MemdataSModified()) { 
           ip65504P1044MemdataS = refreshIp65504P1044MemdataS();
        }
   		return ip65504P1044MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1044MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1044-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1044MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1044MemdataS = checkIp65504P1044MemdataSMaxLimit(number); 
		serializeIp65504P1044MemdataS(ip65504P1044MemdataS);
	}

	public void setIp65504P1044MemdataS(int number) {
	    number = checkIp65504P1044MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1044MemdataS((short)number);
	}
	public void setIp65504P1044MemdataS(long number) {
	    number = checkIp65504P1044MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1044MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1044MemdataL
	 *	@return ip65504P1044MemdataL
	 */
	public short getIp65504P1044MemdataL() throws CFException {
        if (isIp65504P1044MemdataLModified()) { 
           ip65504P1044MemdataL = refreshIp65504P1044MemdataL();
        }
   		return ip65504P1044MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1044MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1044-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1044MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1044MemdataL = checkIp65504P1044MemdataLMaxLimit(number); 
		serializeIp65504P1044MemdataL(ip65504P1044MemdataL);
	}

	public void setIp65504P1044MemdataL(int number) {
	    number = checkIp65504P1044MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1044MemdataL((short)number);
	}
	public void setIp65504P1044MemdataL(long number) {
	    number = checkIp65504P1044MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1044MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1045MemdataS
	 *	@return ip65504P1045MemdataS
	 */
	public short getIp65504P1045MemdataS() throws CFException {
        if (isIp65504P1045MemdataSModified()) { 
           ip65504P1045MemdataS = refreshIp65504P1045MemdataS();
        }
   		return ip65504P1045MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1045MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1045-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1045MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1045MemdataS = checkIp65504P1045MemdataSMaxLimit(number); 
		serializeIp65504P1045MemdataS(ip65504P1045MemdataS);
	}

	public void setIp65504P1045MemdataS(int number) {
	    number = checkIp65504P1045MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1045MemdataS((short)number);
	}
	public void setIp65504P1045MemdataS(long number) {
	    number = checkIp65504P1045MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1045MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1045MemdataL
	 *	@return ip65504P1045MemdataL
	 */
	public short getIp65504P1045MemdataL() throws CFException {
        if (isIp65504P1045MemdataLModified()) { 
           ip65504P1045MemdataL = refreshIp65504P1045MemdataL();
        }
   		return ip65504P1045MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1045MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1045-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1045MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1045MemdataL = checkIp65504P1045MemdataLMaxLimit(number); 
		serializeIp65504P1045MemdataL(ip65504P1045MemdataL);
	}

	public void setIp65504P1045MemdataL(int number) {
	    number = checkIp65504P1045MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1045MemdataL((short)number);
	}
	public void setIp65504P1045MemdataL(long number) {
	    number = checkIp65504P1045MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1045MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1046MemdataS
	 *	@return ip65504P1046MemdataS
	 */
	public short getIp65504P1046MemdataS() throws CFException {
        if (isIp65504P1046MemdataSModified()) { 
           ip65504P1046MemdataS = refreshIp65504P1046MemdataS();
        }
   		return ip65504P1046MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1046MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1046-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1046MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1046MemdataS = checkIp65504P1046MemdataSMaxLimit(number); 
		serializeIp65504P1046MemdataS(ip65504P1046MemdataS);
	}

	public void setIp65504P1046MemdataS(int number) {
	    number = checkIp65504P1046MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1046MemdataS((short)number);
	}
	public void setIp65504P1046MemdataS(long number) {
	    number = checkIp65504P1046MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1046MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1046MemdataL
	 *	@return ip65504P1046MemdataL
	 */
	public short getIp65504P1046MemdataL() throws CFException {
        if (isIp65504P1046MemdataLModified()) { 
           ip65504P1046MemdataL = refreshIp65504P1046MemdataL();
        }
   		return ip65504P1046MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1046MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1046-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1046MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1046MemdataL = checkIp65504P1046MemdataLMaxLimit(number); 
		serializeIp65504P1046MemdataL(ip65504P1046MemdataL);
	}

	public void setIp65504P1046MemdataL(int number) {
	    number = checkIp65504P1046MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1046MemdataL((short)number);
	}
	public void setIp65504P1046MemdataL(long number) {
	    number = checkIp65504P1046MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1046MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1047MemdataS
	 *	@return ip65504P1047MemdataS
	 */
	public short getIp65504P1047MemdataS() throws CFException {
        if (isIp65504P1047MemdataSModified()) { 
           ip65504P1047MemdataS = refreshIp65504P1047MemdataS();
        }
   		return ip65504P1047MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1047MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1047-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1047MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1047MemdataS = checkIp65504P1047MemdataSMaxLimit(number); 
		serializeIp65504P1047MemdataS(ip65504P1047MemdataS);
	}

	public void setIp65504P1047MemdataS(int number) {
	    number = checkIp65504P1047MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1047MemdataS((short)number);
	}
	public void setIp65504P1047MemdataS(long number) {
	    number = checkIp65504P1047MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1047MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1047MemdataL
	 *	@return ip65504P1047MemdataL
	 */
	public short getIp65504P1047MemdataL() throws CFException {
        if (isIp65504P1047MemdataLModified()) { 
           ip65504P1047MemdataL = refreshIp65504P1047MemdataL();
        }
   		return ip65504P1047MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1047MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1047-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1047MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1047MemdataL = checkIp65504P1047MemdataLMaxLimit(number); 
		serializeIp65504P1047MemdataL(ip65504P1047MemdataL);
	}

	public void setIp65504P1047MemdataL(int number) {
	    number = checkIp65504P1047MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1047MemdataL((short)number);
	}
	public void setIp65504P1047MemdataL(long number) {
	    number = checkIp65504P1047MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1047MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1048MemdataS
	 *	@return ip65504P1048MemdataS
	 */
	public short getIp65504P1048MemdataS() throws CFException {
        if (isIp65504P1048MemdataSModified()) { 
           ip65504P1048MemdataS = refreshIp65504P1048MemdataS();
        }
   		return ip65504P1048MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1048MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1048-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1048MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1048MemdataS = checkIp65504P1048MemdataSMaxLimit(number); 
		serializeIp65504P1048MemdataS(ip65504P1048MemdataS);
	}

	public void setIp65504P1048MemdataS(int number) {
	    number = checkIp65504P1048MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1048MemdataS((short)number);
	}
	public void setIp65504P1048MemdataS(long number) {
	    number = checkIp65504P1048MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1048MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1048MemdataL
	 *	@return ip65504P1048MemdataL
	 */
	public short getIp65504P1048MemdataL() throws CFException {
        if (isIp65504P1048MemdataLModified()) { 
           ip65504P1048MemdataL = refreshIp65504P1048MemdataL();
        }
   		return ip65504P1048MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1048MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1048-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1048MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1048MemdataL = checkIp65504P1048MemdataLMaxLimit(number); 
		serializeIp65504P1048MemdataL(ip65504P1048MemdataL);
	}

	public void setIp65504P1048MemdataL(int number) {
	    number = checkIp65504P1048MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1048MemdataL((short)number);
	}
	public void setIp65504P1048MemdataL(long number) {
	    number = checkIp65504P1048MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1048MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1049MemdataS
	 *	@return ip65504P1049MemdataS
	 */
	public short getIp65504P1049MemdataS() throws CFException {
        if (isIp65504P1049MemdataSModified()) { 
           ip65504P1049MemdataS = refreshIp65504P1049MemdataS();
        }
   		return ip65504P1049MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1049MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1049-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1049MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1049MemdataS = checkIp65504P1049MemdataSMaxLimit(number); 
		serializeIp65504P1049MemdataS(ip65504P1049MemdataS);
	}

	public void setIp65504P1049MemdataS(int number) {
	    number = checkIp65504P1049MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1049MemdataS((short)number);
	}
	public void setIp65504P1049MemdataS(long number) {
	    number = checkIp65504P1049MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1049MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1049MemdataL
	 *	@return ip65504P1049MemdataL
	 */
	public short getIp65504P1049MemdataL() throws CFException {
        if (isIp65504P1049MemdataLModified()) { 
           ip65504P1049MemdataL = refreshIp65504P1049MemdataL();
        }
   		return ip65504P1049MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1049MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1049-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1049MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1049MemdataL = checkIp65504P1049MemdataLMaxLimit(number); 
		serializeIp65504P1049MemdataL(ip65504P1049MemdataL);
	}

	public void setIp65504P1049MemdataL(int number) {
	    number = checkIp65504P1049MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1049MemdataL((short)number);
	}
	public void setIp65504P1049MemdataL(long number) {
	    number = checkIp65504P1049MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1049MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1050MemdataS
	 *	@return ip65504P1050MemdataS
	 */
	public short getIp65504P1050MemdataS() throws CFException {
        if (isIp65504P1050MemdataSModified()) { 
           ip65504P1050MemdataS = refreshIp65504P1050MemdataS();
        }
   		return ip65504P1050MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1050MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1050-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1050MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1050MemdataS = checkIp65504P1050MemdataSMaxLimit(number); 
		serializeIp65504P1050MemdataS(ip65504P1050MemdataS);
	}

	public void setIp65504P1050MemdataS(int number) {
	    number = checkIp65504P1050MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1050MemdataS((short)number);
	}
	public void setIp65504P1050MemdataS(long number) {
	    number = checkIp65504P1050MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1050MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1050MemdataL
	 *	@return ip65504P1050MemdataL
	 */
	public short getIp65504P1050MemdataL() throws CFException {
        if (isIp65504P1050MemdataLModified()) { 
           ip65504P1050MemdataL = refreshIp65504P1050MemdataL();
        }
   		return ip65504P1050MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1050MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1050-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1050MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1050MemdataL = checkIp65504P1050MemdataLMaxLimit(number); 
		serializeIp65504P1050MemdataL(ip65504P1050MemdataL);
	}

	public void setIp65504P1050MemdataL(int number) {
	    number = checkIp65504P1050MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1050MemdataL((short)number);
	}
	public void setIp65504P1050MemdataL(long number) {
	    number = checkIp65504P1050MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1050MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1051MemdataS
	 *	@return ip65504P1051MemdataS
	 */
	public short getIp65504P1051MemdataS() throws CFException {
        if (isIp65504P1051MemdataSModified()) { 
           ip65504P1051MemdataS = refreshIp65504P1051MemdataS();
        }
   		return ip65504P1051MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1051MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1051-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1051MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1051MemdataS = checkIp65504P1051MemdataSMaxLimit(number); 
		serializeIp65504P1051MemdataS(ip65504P1051MemdataS);
	}

	public void setIp65504P1051MemdataS(int number) {
	    number = checkIp65504P1051MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1051MemdataS((short)number);
	}
	public void setIp65504P1051MemdataS(long number) {
	    number = checkIp65504P1051MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1051MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1051MemdataL
	 *	@return ip65504P1051MemdataL
	 */
	public short getIp65504P1051MemdataL() throws CFException {
        if (isIp65504P1051MemdataLModified()) { 
           ip65504P1051MemdataL = refreshIp65504P1051MemdataL();
        }
   		return ip65504P1051MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1051MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1051-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1051MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1051MemdataL = checkIp65504P1051MemdataLMaxLimit(number); 
		serializeIp65504P1051MemdataL(ip65504P1051MemdataL);
	}

	public void setIp65504P1051MemdataL(int number) {
	    number = checkIp65504P1051MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1051MemdataL((short)number);
	}
	public void setIp65504P1051MemdataL(long number) {
	    number = checkIp65504P1051MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1051MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1052MemdataS
	 *	@return ip65504P1052MemdataS
	 */
	public short getIp65504P1052MemdataS() throws CFException {
        if (isIp65504P1052MemdataSModified()) { 
           ip65504P1052MemdataS = refreshIp65504P1052MemdataS();
        }
   		return ip65504P1052MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1052MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1052-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1052MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1052MemdataS = checkIp65504P1052MemdataSMaxLimit(number); 
		serializeIp65504P1052MemdataS(ip65504P1052MemdataS);
	}

	public void setIp65504P1052MemdataS(int number) {
	    number = checkIp65504P1052MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1052MemdataS((short)number);
	}
	public void setIp65504P1052MemdataS(long number) {
	    number = checkIp65504P1052MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1052MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1052MemdataL
	 *	@return ip65504P1052MemdataL
	 */
	public short getIp65504P1052MemdataL() throws CFException {
        if (isIp65504P1052MemdataLModified()) { 
           ip65504P1052MemdataL = refreshIp65504P1052MemdataL();
        }
   		return ip65504P1052MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1052MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1052-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1052MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1052MemdataL = checkIp65504P1052MemdataLMaxLimit(number); 
		serializeIp65504P1052MemdataL(ip65504P1052MemdataL);
	}

	public void setIp65504P1052MemdataL(int number) {
	    number = checkIp65504P1052MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1052MemdataL((short)number);
	}
	public void setIp65504P1052MemdataL(long number) {
	    number = checkIp65504P1052MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1052MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1053MemdataS
	 *	@return ip65504P1053MemdataS
	 */
	public short getIp65504P1053MemdataS() throws CFException {
        if (isIp65504P1053MemdataSModified()) { 
           ip65504P1053MemdataS = refreshIp65504P1053MemdataS();
        }
   		return ip65504P1053MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1053MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1053-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1053MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1053MemdataS = checkIp65504P1053MemdataSMaxLimit(number); 
		serializeIp65504P1053MemdataS(ip65504P1053MemdataS);
	}

	public void setIp65504P1053MemdataS(int number) {
	    number = checkIp65504P1053MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1053MemdataS((short)number);
	}
	public void setIp65504P1053MemdataS(long number) {
	    number = checkIp65504P1053MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1053MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1053MemdataL
	 *	@return ip65504P1053MemdataL
	 */
	public short getIp65504P1053MemdataL() throws CFException {
        if (isIp65504P1053MemdataLModified()) { 
           ip65504P1053MemdataL = refreshIp65504P1053MemdataL();
        }
   		return ip65504P1053MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1053MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1053-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1053MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1053MemdataL = checkIp65504P1053MemdataLMaxLimit(number); 
		serializeIp65504P1053MemdataL(ip65504P1053MemdataL);
	}

	public void setIp65504P1053MemdataL(int number) {
	    number = checkIp65504P1053MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1053MemdataL((short)number);
	}
	public void setIp65504P1053MemdataL(long number) {
	    number = checkIp65504P1053MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1053MemdataL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1054MemdataS
	 *	@return ip65504P1054MemdataS
	 */
	public short getIp65504P1054MemdataS() throws CFException {
        if (isIp65504P1054MemdataSModified()) { 
           ip65504P1054MemdataS = refreshIp65504P1054MemdataS();
        }
   		return ip65504P1054MemdataS;
	}
	
	/**
	 * 	Update Ip65504P1054MemdataS with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1054-MEMDATA-S
	 *	@param number
	 */
	public void setIp65504P1054MemdataS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1054MemdataS = checkIp65504P1054MemdataSMaxLimit(number); 
		serializeIp65504P1054MemdataS(ip65504P1054MemdataS);
	}

	public void setIp65504P1054MemdataS(int number) {
	    number = checkIp65504P1054MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1054MemdataS((short)number);
	}
	public void setIp65504P1054MemdataS(long number) {
	    number = checkIp65504P1054MemdataSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1054MemdataS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1054MemdataL
	 *	@return ip65504P1054MemdataL
	 */
	public short getIp65504P1054MemdataL() throws CFException {
        if (isIp65504P1054MemdataLModified()) { 
           ip65504P1054MemdataL = refreshIp65504P1054MemdataL();
        }
   		return ip65504P1054MemdataL;
	}
	
	/**
	 * 	Update Ip65504P1054MemdataL with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1054-MEMDATA-L
	 *	@param number
	 */
	public void setIp65504P1054MemdataL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1054MemdataL = checkIp65504P1054MemdataLMaxLimit(number); 
		serializeIp65504P1054MemdataL(ip65504P1054MemdataL);
	}

	public void setIp65504P1054MemdataL(int number) {
	    number = checkIp65504P1054MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1054MemdataL((short)number);
	}
	public void setIp65504P1054MemdataL(long number) {
	    number = checkIp65504P1054MemdataLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1054MemdataL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup34
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P1024MemdataS((short)0);
         	setIp65504P1024MemdataL((short)0);
         	setIp65504P1025MemdataS((short)0);
         	setIp65504P1025MemdataL((short)0);
         	setIp65504P1026MemdataS((short)0);
         	setIp65504P1026MemdataL((short)0);
         	setIp65504P1027MemdataS((short)0);
         	setIp65504P1027MemdataL((short)0);
         	setIp65504P1028MemdataS((short)0);
         	setIp65504P1028MemdataL((short)0);
         	setIp65504P1029MemdataS((short)0);
         	setIp65504P1029MemdataL((short)0);
         	setIp65504P1030MemdataS((short)0);
         	setIp65504P1030MemdataL((short)0);
         	setIp65504P1031MemdataS((short)0);
         	setIp65504P1031MemdataL((short)0);
         	setIp65504P1032MemdataS((short)0);
         	setIp65504P1032MemdataL((short)0);
         	setIp65504P1033MemdataS((short)0);
         	setIp65504P1033MemdataL((short)0);
         	setIp65504P1034MemdataS((short)0);
         	setIp65504P1034MemdataL((short)0);
         	setIp65504P1035MemdataS((short)0);
         	setIp65504P1035MemdataL((short)0);
         	setIp65504P1036MemdataS((short)0);
         	setIp65504P1036MemdataL((short)0);
         	setIp65504P1037MemdataS((short)0);
         	setIp65504P1037MemdataL((short)0);
         	setIp65504P1038MemdataS((short)0);
         	setIp65504P1038MemdataL((short)0);
         	setIp65504P1039MemdataS((short)0);
         	setIp65504P1039MemdataL((short)0);
         	setIp65504P1040MemdataS((short)0);
         	setIp65504P1040MemdataL((short)0);
         	setIp65504P1041MemdataS((short)0);
         	setIp65504P1041MemdataL((short)0);
         	setIp65504P1042MemdataS((short)0);
         	setIp65504P1042MemdataL((short)0);
         	setIp65504P1043MemdataS((short)0);
         	setIp65504P1043MemdataL((short)0);
         	setIp65504P1044MemdataS((short)0);
         	setIp65504P1044MemdataL((short)0);
         	setIp65504P1045MemdataS((short)0);
         	setIp65504P1045MemdataL((short)0);
         	setIp65504P1046MemdataS((short)0);
         	setIp65504P1046MemdataL((short)0);
         	setIp65504P1047MemdataS((short)0);
         	setIp65504P1047MemdataL((short)0);
         	setIp65504P1048MemdataS((short)0);
         	setIp65504P1048MemdataL((short)0);
         	setIp65504P1049MemdataS((short)0);
         	setIp65504P1049MemdataL((short)0);
         	setIp65504P1050MemdataS((short)0);
         	setIp65504P1050MemdataL((short)0);
         	setIp65504P1051MemdataS((short)0);
         	setIp65504P1051MemdataL((short)0);
         	setIp65504P1052MemdataS((short)0);
         	setIp65504P1052MemdataL((short)0);
         	setIp65504P1053MemdataS((short)0);
         	setIp65504P1053MemdataL((short)0);
         	setIp65504P1054MemdataS((short)0);
         	setIp65504P1054MemdataL((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup34FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_34_LENGTH;
		}

}
  
