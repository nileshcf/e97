package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsNamesLargeGroup40 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504PdsNamesLargeGroup40 extends Ip65504PdsNamesLargeGroup40Serialized { 
   

								private short ip65504P1210S;

								private short ip65504P1210L;


								private short ip65504P1211S;

								private short ip65504P1211L;


								private short ip65504P1212S;

								private short ip65504P1212L;


								private short ip65504P1213S;

								private short ip65504P1213L;


								private short ip65504P1214S;

								private short ip65504P1214L;


								private short ip65504P1215S;

								private short ip65504P1215L;


								private short ip65504P1216S;

								private short ip65504P1216L;


								private short ip65504P1217S;

								private short ip65504P1217L;


								private short ip65504P1218S;

								private short ip65504P1218L;


								private short ip65504P1219S;

								private short ip65504P1219L;


								private short ip65504P1220S;

								private short ip65504P1220L;


								private short ip65504P1221S;

								private short ip65504P1221L;


								private short ip65504P1222S;

								private short ip65504P1222L;


								private short ip65504P1223S;

								private short ip65504P1223L;


								private short ip65504P1224S;

								private short ip65504P1224L;


								private short ip65504P1225S;

								private short ip65504P1225L;


								private short ip65504P1226S;

								private short ip65504P1226L;


								private short ip65504P1227S;

								private short ip65504P1227L;


								private short ip65504P1228S;

								private short ip65504P1228L;


								private short ip65504P1229S;

								private short ip65504P1229L;


								private short ip65504P1230S;

								private short ip65504P1230L;


								private short ip65504P1231S;

								private short ip65504P1231L;


								private short ip65504P1232S;

								private short ip65504P1232L;


								private short ip65504P1233S;

								private short ip65504P1233L;


								private short ip65504P1234S;

								private short ip65504P1234L;


								private short ip65504P1235S;

								private short ip65504P1235L;


								private short ip65504P1236S;

								private short ip65504P1236L;


								private short ip65504P1237S;

								private short ip65504P1237L;


								private short ip65504P1238S;

								private short ip65504P1238L;


								private short ip65504P1239S;

								private short ip65504P1239L;


								private short ip65504P1240S;

								private short ip65504P1240L;

	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup40
	**/
    public Ip65504PdsNamesLargeGroup40() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup40. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup40(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504P1210S
	 *	@return ip65504P1210S
	 */
	public short getIp65504P1210S() throws CFException {
        if (isIp65504P1210SModified()) { 
           ip65504P1210S = refreshIp65504P1210S();
        }
   		return ip65504P1210S;
	}
	
	/**
	 * 	Update Ip65504P1210S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1210-S
	 *	@param number
	 */
	public void setIp65504P1210S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1210S = checkIp65504P1210SMaxLimit(number); 
		serializeIp65504P1210S(ip65504P1210S);
	}

	public void setIp65504P1210S(int number) {
	    number = checkIp65504P1210SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1210S((short)number);
	}
	public void setIp65504P1210S(long number) {
	    number = checkIp65504P1210SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1210S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1210L
	 *	@return ip65504P1210L
	 */
	public short getIp65504P1210L() throws CFException {
        if (isIp65504P1210LModified()) { 
           ip65504P1210L = refreshIp65504P1210L();
        }
   		return ip65504P1210L;
	}
	
	/**
	 * 	Update Ip65504P1210L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1210-L
	 *	@param number
	 */
	public void setIp65504P1210L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1210L = checkIp65504P1210LMaxLimit(number); 
		serializeIp65504P1210L(ip65504P1210L);
	}

	public void setIp65504P1210L(int number) {
	    number = checkIp65504P1210LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1210L((short)number);
	}
	public void setIp65504P1210L(long number) {
	    number = checkIp65504P1210LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1210L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1211S
	 *	@return ip65504P1211S
	 */
	public short getIp65504P1211S() throws CFException {
        if (isIp65504P1211SModified()) { 
           ip65504P1211S = refreshIp65504P1211S();
        }
   		return ip65504P1211S;
	}
	
	/**
	 * 	Update Ip65504P1211S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1211-S
	 *	@param number
	 */
	public void setIp65504P1211S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1211S = checkIp65504P1211SMaxLimit(number); 
		serializeIp65504P1211S(ip65504P1211S);
	}

	public void setIp65504P1211S(int number) {
	    number = checkIp65504P1211SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1211S((short)number);
	}
	public void setIp65504P1211S(long number) {
	    number = checkIp65504P1211SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1211S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1211L
	 *	@return ip65504P1211L
	 */
	public short getIp65504P1211L() throws CFException {
        if (isIp65504P1211LModified()) { 
           ip65504P1211L = refreshIp65504P1211L();
        }
   		return ip65504P1211L;
	}
	
	/**
	 * 	Update Ip65504P1211L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1211-L
	 *	@param number
	 */
	public void setIp65504P1211L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1211L = checkIp65504P1211LMaxLimit(number); 
		serializeIp65504P1211L(ip65504P1211L);
	}

	public void setIp65504P1211L(int number) {
	    number = checkIp65504P1211LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1211L((short)number);
	}
	public void setIp65504P1211L(long number) {
	    number = checkIp65504P1211LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1211L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1212S
	 *	@return ip65504P1212S
	 */
	public short getIp65504P1212S() throws CFException {
        if (isIp65504P1212SModified()) { 
           ip65504P1212S = refreshIp65504P1212S();
        }
   		return ip65504P1212S;
	}
	
	/**
	 * 	Update Ip65504P1212S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1212-S
	 *	@param number
	 */
	public void setIp65504P1212S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1212S = checkIp65504P1212SMaxLimit(number); 
		serializeIp65504P1212S(ip65504P1212S);
	}

	public void setIp65504P1212S(int number) {
	    number = checkIp65504P1212SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1212S((short)number);
	}
	public void setIp65504P1212S(long number) {
	    number = checkIp65504P1212SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1212S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1212L
	 *	@return ip65504P1212L
	 */
	public short getIp65504P1212L() throws CFException {
        if (isIp65504P1212LModified()) { 
           ip65504P1212L = refreshIp65504P1212L();
        }
   		return ip65504P1212L;
	}
	
	/**
	 * 	Update Ip65504P1212L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1212-L
	 *	@param number
	 */
	public void setIp65504P1212L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1212L = checkIp65504P1212LMaxLimit(number); 
		serializeIp65504P1212L(ip65504P1212L);
	}

	public void setIp65504P1212L(int number) {
	    number = checkIp65504P1212LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1212L((short)number);
	}
	public void setIp65504P1212L(long number) {
	    number = checkIp65504P1212LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1212L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1213S
	 *	@return ip65504P1213S
	 */
	public short getIp65504P1213S() throws CFException {
        if (isIp65504P1213SModified()) { 
           ip65504P1213S = refreshIp65504P1213S();
        }
   		return ip65504P1213S;
	}
	
	/**
	 * 	Update Ip65504P1213S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1213-S
	 *	@param number
	 */
	public void setIp65504P1213S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1213S = checkIp65504P1213SMaxLimit(number); 
		serializeIp65504P1213S(ip65504P1213S);
	}

	public void setIp65504P1213S(int number) {
	    number = checkIp65504P1213SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1213S((short)number);
	}
	public void setIp65504P1213S(long number) {
	    number = checkIp65504P1213SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1213S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1213L
	 *	@return ip65504P1213L
	 */
	public short getIp65504P1213L() throws CFException {
        if (isIp65504P1213LModified()) { 
           ip65504P1213L = refreshIp65504P1213L();
        }
   		return ip65504P1213L;
	}
	
	/**
	 * 	Update Ip65504P1213L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1213-L
	 *	@param number
	 */
	public void setIp65504P1213L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1213L = checkIp65504P1213LMaxLimit(number); 
		serializeIp65504P1213L(ip65504P1213L);
	}

	public void setIp65504P1213L(int number) {
	    number = checkIp65504P1213LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1213L((short)number);
	}
	public void setIp65504P1213L(long number) {
	    number = checkIp65504P1213LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1213L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1214S
	 *	@return ip65504P1214S
	 */
	public short getIp65504P1214S() throws CFException {
        if (isIp65504P1214SModified()) { 
           ip65504P1214S = refreshIp65504P1214S();
        }
   		return ip65504P1214S;
	}
	
	/**
	 * 	Update Ip65504P1214S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1214-S
	 *	@param number
	 */
	public void setIp65504P1214S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1214S = checkIp65504P1214SMaxLimit(number); 
		serializeIp65504P1214S(ip65504P1214S);
	}

	public void setIp65504P1214S(int number) {
	    number = checkIp65504P1214SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1214S((short)number);
	}
	public void setIp65504P1214S(long number) {
	    number = checkIp65504P1214SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1214S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1214L
	 *	@return ip65504P1214L
	 */
	public short getIp65504P1214L() throws CFException {
        if (isIp65504P1214LModified()) { 
           ip65504P1214L = refreshIp65504P1214L();
        }
   		return ip65504P1214L;
	}
	
	/**
	 * 	Update Ip65504P1214L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1214-L
	 *	@param number
	 */
	public void setIp65504P1214L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1214L = checkIp65504P1214LMaxLimit(number); 
		serializeIp65504P1214L(ip65504P1214L);
	}

	public void setIp65504P1214L(int number) {
	    number = checkIp65504P1214LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1214L((short)number);
	}
	public void setIp65504P1214L(long number) {
	    number = checkIp65504P1214LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1214L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1215S
	 *	@return ip65504P1215S
	 */
	public short getIp65504P1215S() throws CFException {
        if (isIp65504P1215SModified()) { 
           ip65504P1215S = refreshIp65504P1215S();
        }
   		return ip65504P1215S;
	}
	
	/**
	 * 	Update Ip65504P1215S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1215-S
	 *	@param number
	 */
	public void setIp65504P1215S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1215S = checkIp65504P1215SMaxLimit(number); 
		serializeIp65504P1215S(ip65504P1215S);
	}

	public void setIp65504P1215S(int number) {
	    number = checkIp65504P1215SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1215S((short)number);
	}
	public void setIp65504P1215S(long number) {
	    number = checkIp65504P1215SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1215S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1215L
	 *	@return ip65504P1215L
	 */
	public short getIp65504P1215L() throws CFException {
        if (isIp65504P1215LModified()) { 
           ip65504P1215L = refreshIp65504P1215L();
        }
   		return ip65504P1215L;
	}
	
	/**
	 * 	Update Ip65504P1215L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1215-L
	 *	@param number
	 */
	public void setIp65504P1215L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1215L = checkIp65504P1215LMaxLimit(number); 
		serializeIp65504P1215L(ip65504P1215L);
	}

	public void setIp65504P1215L(int number) {
	    number = checkIp65504P1215LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1215L((short)number);
	}
	public void setIp65504P1215L(long number) {
	    number = checkIp65504P1215LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1215L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1216S
	 *	@return ip65504P1216S
	 */
	public short getIp65504P1216S() throws CFException {
        if (isIp65504P1216SModified()) { 
           ip65504P1216S = refreshIp65504P1216S();
        }
   		return ip65504P1216S;
	}
	
	/**
	 * 	Update Ip65504P1216S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1216-S
	 *	@param number
	 */
	public void setIp65504P1216S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1216S = checkIp65504P1216SMaxLimit(number); 
		serializeIp65504P1216S(ip65504P1216S);
	}

	public void setIp65504P1216S(int number) {
	    number = checkIp65504P1216SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1216S((short)number);
	}
	public void setIp65504P1216S(long number) {
	    number = checkIp65504P1216SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1216S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1216L
	 *	@return ip65504P1216L
	 */
	public short getIp65504P1216L() throws CFException {
        if (isIp65504P1216LModified()) { 
           ip65504P1216L = refreshIp65504P1216L();
        }
   		return ip65504P1216L;
	}
	
	/**
	 * 	Update Ip65504P1216L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1216-L
	 *	@param number
	 */
	public void setIp65504P1216L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1216L = checkIp65504P1216LMaxLimit(number); 
		serializeIp65504P1216L(ip65504P1216L);
	}

	public void setIp65504P1216L(int number) {
	    number = checkIp65504P1216LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1216L((short)number);
	}
	public void setIp65504P1216L(long number) {
	    number = checkIp65504P1216LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1216L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1217S
	 *	@return ip65504P1217S
	 */
	public short getIp65504P1217S() throws CFException {
        if (isIp65504P1217SModified()) { 
           ip65504P1217S = refreshIp65504P1217S();
        }
   		return ip65504P1217S;
	}
	
	/**
	 * 	Update Ip65504P1217S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1217-S
	 *	@param number
	 */
	public void setIp65504P1217S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1217S = checkIp65504P1217SMaxLimit(number); 
		serializeIp65504P1217S(ip65504P1217S);
	}

	public void setIp65504P1217S(int number) {
	    number = checkIp65504P1217SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1217S((short)number);
	}
	public void setIp65504P1217S(long number) {
	    number = checkIp65504P1217SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1217S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1217L
	 *	@return ip65504P1217L
	 */
	public short getIp65504P1217L() throws CFException {
        if (isIp65504P1217LModified()) { 
           ip65504P1217L = refreshIp65504P1217L();
        }
   		return ip65504P1217L;
	}
	
	/**
	 * 	Update Ip65504P1217L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1217-L
	 *	@param number
	 */
	public void setIp65504P1217L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1217L = checkIp65504P1217LMaxLimit(number); 
		serializeIp65504P1217L(ip65504P1217L);
	}

	public void setIp65504P1217L(int number) {
	    number = checkIp65504P1217LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1217L((short)number);
	}
	public void setIp65504P1217L(long number) {
	    number = checkIp65504P1217LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1217L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1218S
	 *	@return ip65504P1218S
	 */
	public short getIp65504P1218S() throws CFException {
        if (isIp65504P1218SModified()) { 
           ip65504P1218S = refreshIp65504P1218S();
        }
   		return ip65504P1218S;
	}
	
	/**
	 * 	Update Ip65504P1218S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1218-S
	 *	@param number
	 */
	public void setIp65504P1218S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1218S = checkIp65504P1218SMaxLimit(number); 
		serializeIp65504P1218S(ip65504P1218S);
	}

	public void setIp65504P1218S(int number) {
	    number = checkIp65504P1218SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1218S((short)number);
	}
	public void setIp65504P1218S(long number) {
	    number = checkIp65504P1218SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1218S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1218L
	 *	@return ip65504P1218L
	 */
	public short getIp65504P1218L() throws CFException {
        if (isIp65504P1218LModified()) { 
           ip65504P1218L = refreshIp65504P1218L();
        }
   		return ip65504P1218L;
	}
	
	/**
	 * 	Update Ip65504P1218L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1218-L
	 *	@param number
	 */
	public void setIp65504P1218L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1218L = checkIp65504P1218LMaxLimit(number); 
		serializeIp65504P1218L(ip65504P1218L);
	}

	public void setIp65504P1218L(int number) {
	    number = checkIp65504P1218LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1218L((short)number);
	}
	public void setIp65504P1218L(long number) {
	    number = checkIp65504P1218LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1218L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1219S
	 *	@return ip65504P1219S
	 */
	public short getIp65504P1219S() throws CFException {
        if (isIp65504P1219SModified()) { 
           ip65504P1219S = refreshIp65504P1219S();
        }
   		return ip65504P1219S;
	}
	
	/**
	 * 	Update Ip65504P1219S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1219-S
	 *	@param number
	 */
	public void setIp65504P1219S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1219S = checkIp65504P1219SMaxLimit(number); 
		serializeIp65504P1219S(ip65504P1219S);
	}

	public void setIp65504P1219S(int number) {
	    number = checkIp65504P1219SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1219S((short)number);
	}
	public void setIp65504P1219S(long number) {
	    number = checkIp65504P1219SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1219S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1219L
	 *	@return ip65504P1219L
	 */
	public short getIp65504P1219L() throws CFException {
        if (isIp65504P1219LModified()) { 
           ip65504P1219L = refreshIp65504P1219L();
        }
   		return ip65504P1219L;
	}
	
	/**
	 * 	Update Ip65504P1219L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1219-L
	 *	@param number
	 */
	public void setIp65504P1219L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1219L = checkIp65504P1219LMaxLimit(number); 
		serializeIp65504P1219L(ip65504P1219L);
	}

	public void setIp65504P1219L(int number) {
	    number = checkIp65504P1219LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1219L((short)number);
	}
	public void setIp65504P1219L(long number) {
	    number = checkIp65504P1219LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1219L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1220S
	 *	@return ip65504P1220S
	 */
	public short getIp65504P1220S() throws CFException {
        if (isIp65504P1220SModified()) { 
           ip65504P1220S = refreshIp65504P1220S();
        }
   		return ip65504P1220S;
	}
	
	/**
	 * 	Update Ip65504P1220S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1220-S
	 *	@param number
	 */
	public void setIp65504P1220S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1220S = checkIp65504P1220SMaxLimit(number); 
		serializeIp65504P1220S(ip65504P1220S);
	}

	public void setIp65504P1220S(int number) {
	    number = checkIp65504P1220SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1220S((short)number);
	}
	public void setIp65504P1220S(long number) {
	    number = checkIp65504P1220SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1220S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1220L
	 *	@return ip65504P1220L
	 */
	public short getIp65504P1220L() throws CFException {
        if (isIp65504P1220LModified()) { 
           ip65504P1220L = refreshIp65504P1220L();
        }
   		return ip65504P1220L;
	}
	
	/**
	 * 	Update Ip65504P1220L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1220-L
	 *	@param number
	 */
	public void setIp65504P1220L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1220L = checkIp65504P1220LMaxLimit(number); 
		serializeIp65504P1220L(ip65504P1220L);
	}

	public void setIp65504P1220L(int number) {
	    number = checkIp65504P1220LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1220L((short)number);
	}
	public void setIp65504P1220L(long number) {
	    number = checkIp65504P1220LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1220L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1221S
	 *	@return ip65504P1221S
	 */
	public short getIp65504P1221S() throws CFException {
        if (isIp65504P1221SModified()) { 
           ip65504P1221S = refreshIp65504P1221S();
        }
   		return ip65504P1221S;
	}
	
	/**
	 * 	Update Ip65504P1221S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1221-S
	 *	@param number
	 */
	public void setIp65504P1221S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1221S = checkIp65504P1221SMaxLimit(number); 
		serializeIp65504P1221S(ip65504P1221S);
	}

	public void setIp65504P1221S(int number) {
	    number = checkIp65504P1221SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1221S((short)number);
	}
	public void setIp65504P1221S(long number) {
	    number = checkIp65504P1221SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1221S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1221L
	 *	@return ip65504P1221L
	 */
	public short getIp65504P1221L() throws CFException {
        if (isIp65504P1221LModified()) { 
           ip65504P1221L = refreshIp65504P1221L();
        }
   		return ip65504P1221L;
	}
	
	/**
	 * 	Update Ip65504P1221L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1221-L
	 *	@param number
	 */
	public void setIp65504P1221L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1221L = checkIp65504P1221LMaxLimit(number); 
		serializeIp65504P1221L(ip65504P1221L);
	}

	public void setIp65504P1221L(int number) {
	    number = checkIp65504P1221LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1221L((short)number);
	}
	public void setIp65504P1221L(long number) {
	    number = checkIp65504P1221LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1221L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1222S
	 *	@return ip65504P1222S
	 */
	public short getIp65504P1222S() throws CFException {
        if (isIp65504P1222SModified()) { 
           ip65504P1222S = refreshIp65504P1222S();
        }
   		return ip65504P1222S;
	}
	
	/**
	 * 	Update Ip65504P1222S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1222-S
	 *	@param number
	 */
	public void setIp65504P1222S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1222S = checkIp65504P1222SMaxLimit(number); 
		serializeIp65504P1222S(ip65504P1222S);
	}

	public void setIp65504P1222S(int number) {
	    number = checkIp65504P1222SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1222S((short)number);
	}
	public void setIp65504P1222S(long number) {
	    number = checkIp65504P1222SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1222S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1222L
	 *	@return ip65504P1222L
	 */
	public short getIp65504P1222L() throws CFException {
        if (isIp65504P1222LModified()) { 
           ip65504P1222L = refreshIp65504P1222L();
        }
   		return ip65504P1222L;
	}
	
	/**
	 * 	Update Ip65504P1222L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1222-L
	 *	@param number
	 */
	public void setIp65504P1222L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1222L = checkIp65504P1222LMaxLimit(number); 
		serializeIp65504P1222L(ip65504P1222L);
	}

	public void setIp65504P1222L(int number) {
	    number = checkIp65504P1222LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1222L((short)number);
	}
	public void setIp65504P1222L(long number) {
	    number = checkIp65504P1222LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1222L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1223S
	 *	@return ip65504P1223S
	 */
	public short getIp65504P1223S() throws CFException {
        if (isIp65504P1223SModified()) { 
           ip65504P1223S = refreshIp65504P1223S();
        }
   		return ip65504P1223S;
	}
	
	/**
	 * 	Update Ip65504P1223S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1223-S
	 *	@param number
	 */
	public void setIp65504P1223S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1223S = checkIp65504P1223SMaxLimit(number); 
		serializeIp65504P1223S(ip65504P1223S);
	}

	public void setIp65504P1223S(int number) {
	    number = checkIp65504P1223SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1223S((short)number);
	}
	public void setIp65504P1223S(long number) {
	    number = checkIp65504P1223SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1223S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1223L
	 *	@return ip65504P1223L
	 */
	public short getIp65504P1223L() throws CFException {
        if (isIp65504P1223LModified()) { 
           ip65504P1223L = refreshIp65504P1223L();
        }
   		return ip65504P1223L;
	}
	
	/**
	 * 	Update Ip65504P1223L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1223-L
	 *	@param number
	 */
	public void setIp65504P1223L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1223L = checkIp65504P1223LMaxLimit(number); 
		serializeIp65504P1223L(ip65504P1223L);
	}

	public void setIp65504P1223L(int number) {
	    number = checkIp65504P1223LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1223L((short)number);
	}
	public void setIp65504P1223L(long number) {
	    number = checkIp65504P1223LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1223L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1224S
	 *	@return ip65504P1224S
	 */
	public short getIp65504P1224S() throws CFException {
        if (isIp65504P1224SModified()) { 
           ip65504P1224S = refreshIp65504P1224S();
        }
   		return ip65504P1224S;
	}
	
	/**
	 * 	Update Ip65504P1224S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1224-S
	 *	@param number
	 */
	public void setIp65504P1224S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1224S = checkIp65504P1224SMaxLimit(number); 
		serializeIp65504P1224S(ip65504P1224S);
	}

	public void setIp65504P1224S(int number) {
	    number = checkIp65504P1224SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1224S((short)number);
	}
	public void setIp65504P1224S(long number) {
	    number = checkIp65504P1224SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1224S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1224L
	 *	@return ip65504P1224L
	 */
	public short getIp65504P1224L() throws CFException {
        if (isIp65504P1224LModified()) { 
           ip65504P1224L = refreshIp65504P1224L();
        }
   		return ip65504P1224L;
	}
	
	/**
	 * 	Update Ip65504P1224L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1224-L
	 *	@param number
	 */
	public void setIp65504P1224L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1224L = checkIp65504P1224LMaxLimit(number); 
		serializeIp65504P1224L(ip65504P1224L);
	}

	public void setIp65504P1224L(int number) {
	    number = checkIp65504P1224LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1224L((short)number);
	}
	public void setIp65504P1224L(long number) {
	    number = checkIp65504P1224LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1224L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1225S
	 *	@return ip65504P1225S
	 */
	public short getIp65504P1225S() throws CFException {
        if (isIp65504P1225SModified()) { 
           ip65504P1225S = refreshIp65504P1225S();
        }
   		return ip65504P1225S;
	}
	
	/**
	 * 	Update Ip65504P1225S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1225-S
	 *	@param number
	 */
	public void setIp65504P1225S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1225S = checkIp65504P1225SMaxLimit(number); 
		serializeIp65504P1225S(ip65504P1225S);
	}

	public void setIp65504P1225S(int number) {
	    number = checkIp65504P1225SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1225S((short)number);
	}
	public void setIp65504P1225S(long number) {
	    number = checkIp65504P1225SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1225S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1225L
	 *	@return ip65504P1225L
	 */
	public short getIp65504P1225L() throws CFException {
        if (isIp65504P1225LModified()) { 
           ip65504P1225L = refreshIp65504P1225L();
        }
   		return ip65504P1225L;
	}
	
	/**
	 * 	Update Ip65504P1225L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1225-L
	 *	@param number
	 */
	public void setIp65504P1225L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1225L = checkIp65504P1225LMaxLimit(number); 
		serializeIp65504P1225L(ip65504P1225L);
	}

	public void setIp65504P1225L(int number) {
	    number = checkIp65504P1225LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1225L((short)number);
	}
	public void setIp65504P1225L(long number) {
	    number = checkIp65504P1225LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1225L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1226S
	 *	@return ip65504P1226S
	 */
	public short getIp65504P1226S() throws CFException {
        if (isIp65504P1226SModified()) { 
           ip65504P1226S = refreshIp65504P1226S();
        }
   		return ip65504P1226S;
	}
	
	/**
	 * 	Update Ip65504P1226S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1226-S
	 *	@param number
	 */
	public void setIp65504P1226S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1226S = checkIp65504P1226SMaxLimit(number); 
		serializeIp65504P1226S(ip65504P1226S);
	}

	public void setIp65504P1226S(int number) {
	    number = checkIp65504P1226SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1226S((short)number);
	}
	public void setIp65504P1226S(long number) {
	    number = checkIp65504P1226SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1226S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1226L
	 *	@return ip65504P1226L
	 */
	public short getIp65504P1226L() throws CFException {
        if (isIp65504P1226LModified()) { 
           ip65504P1226L = refreshIp65504P1226L();
        }
   		return ip65504P1226L;
	}
	
	/**
	 * 	Update Ip65504P1226L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1226-L
	 *	@param number
	 */
	public void setIp65504P1226L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1226L = checkIp65504P1226LMaxLimit(number); 
		serializeIp65504P1226L(ip65504P1226L);
	}

	public void setIp65504P1226L(int number) {
	    number = checkIp65504P1226LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1226L((short)number);
	}
	public void setIp65504P1226L(long number) {
	    number = checkIp65504P1226LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1226L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1227S
	 *	@return ip65504P1227S
	 */
	public short getIp65504P1227S() throws CFException {
        if (isIp65504P1227SModified()) { 
           ip65504P1227S = refreshIp65504P1227S();
        }
   		return ip65504P1227S;
	}
	
	/**
	 * 	Update Ip65504P1227S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1227-S
	 *	@param number
	 */
	public void setIp65504P1227S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1227S = checkIp65504P1227SMaxLimit(number); 
		serializeIp65504P1227S(ip65504P1227S);
	}

	public void setIp65504P1227S(int number) {
	    number = checkIp65504P1227SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1227S((short)number);
	}
	public void setIp65504P1227S(long number) {
	    number = checkIp65504P1227SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1227S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1227L
	 *	@return ip65504P1227L
	 */
	public short getIp65504P1227L() throws CFException {
        if (isIp65504P1227LModified()) { 
           ip65504P1227L = refreshIp65504P1227L();
        }
   		return ip65504P1227L;
	}
	
	/**
	 * 	Update Ip65504P1227L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1227-L
	 *	@param number
	 */
	public void setIp65504P1227L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1227L = checkIp65504P1227LMaxLimit(number); 
		serializeIp65504P1227L(ip65504P1227L);
	}

	public void setIp65504P1227L(int number) {
	    number = checkIp65504P1227LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1227L((short)number);
	}
	public void setIp65504P1227L(long number) {
	    number = checkIp65504P1227LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1227L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1228S
	 *	@return ip65504P1228S
	 */
	public short getIp65504P1228S() throws CFException {
        if (isIp65504P1228SModified()) { 
           ip65504P1228S = refreshIp65504P1228S();
        }
   		return ip65504P1228S;
	}
	
	/**
	 * 	Update Ip65504P1228S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1228-S
	 *	@param number
	 */
	public void setIp65504P1228S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1228S = checkIp65504P1228SMaxLimit(number); 
		serializeIp65504P1228S(ip65504P1228S);
	}

	public void setIp65504P1228S(int number) {
	    number = checkIp65504P1228SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1228S((short)number);
	}
	public void setIp65504P1228S(long number) {
	    number = checkIp65504P1228SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1228S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1228L
	 *	@return ip65504P1228L
	 */
	public short getIp65504P1228L() throws CFException {
        if (isIp65504P1228LModified()) { 
           ip65504P1228L = refreshIp65504P1228L();
        }
   		return ip65504P1228L;
	}
	
	/**
	 * 	Update Ip65504P1228L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1228-L
	 *	@param number
	 */
	public void setIp65504P1228L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1228L = checkIp65504P1228LMaxLimit(number); 
		serializeIp65504P1228L(ip65504P1228L);
	}

	public void setIp65504P1228L(int number) {
	    number = checkIp65504P1228LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1228L((short)number);
	}
	public void setIp65504P1228L(long number) {
	    number = checkIp65504P1228LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1228L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1229S
	 *	@return ip65504P1229S
	 */
	public short getIp65504P1229S() throws CFException {
        if (isIp65504P1229SModified()) { 
           ip65504P1229S = refreshIp65504P1229S();
        }
   		return ip65504P1229S;
	}
	
	/**
	 * 	Update Ip65504P1229S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1229-S
	 *	@param number
	 */
	public void setIp65504P1229S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1229S = checkIp65504P1229SMaxLimit(number); 
		serializeIp65504P1229S(ip65504P1229S);
	}

	public void setIp65504P1229S(int number) {
	    number = checkIp65504P1229SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1229S((short)number);
	}
	public void setIp65504P1229S(long number) {
	    number = checkIp65504P1229SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1229S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1229L
	 *	@return ip65504P1229L
	 */
	public short getIp65504P1229L() throws CFException {
        if (isIp65504P1229LModified()) { 
           ip65504P1229L = refreshIp65504P1229L();
        }
   		return ip65504P1229L;
	}
	
	/**
	 * 	Update Ip65504P1229L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1229-L
	 *	@param number
	 */
	public void setIp65504P1229L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1229L = checkIp65504P1229LMaxLimit(number); 
		serializeIp65504P1229L(ip65504P1229L);
	}

	public void setIp65504P1229L(int number) {
	    number = checkIp65504P1229LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1229L((short)number);
	}
	public void setIp65504P1229L(long number) {
	    number = checkIp65504P1229LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1229L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1230S
	 *	@return ip65504P1230S
	 */
	public short getIp65504P1230S() throws CFException {
        if (isIp65504P1230SModified()) { 
           ip65504P1230S = refreshIp65504P1230S();
        }
   		return ip65504P1230S;
	}
	
	/**
	 * 	Update Ip65504P1230S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1230-S
	 *	@param number
	 */
	public void setIp65504P1230S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1230S = checkIp65504P1230SMaxLimit(number); 
		serializeIp65504P1230S(ip65504P1230S);
	}

	public void setIp65504P1230S(int number) {
	    number = checkIp65504P1230SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1230S((short)number);
	}
	public void setIp65504P1230S(long number) {
	    number = checkIp65504P1230SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1230S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1230L
	 *	@return ip65504P1230L
	 */
	public short getIp65504P1230L() throws CFException {
        if (isIp65504P1230LModified()) { 
           ip65504P1230L = refreshIp65504P1230L();
        }
   		return ip65504P1230L;
	}
	
	/**
	 * 	Update Ip65504P1230L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1230-L
	 *	@param number
	 */
	public void setIp65504P1230L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1230L = checkIp65504P1230LMaxLimit(number); 
		serializeIp65504P1230L(ip65504P1230L);
	}

	public void setIp65504P1230L(int number) {
	    number = checkIp65504P1230LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1230L((short)number);
	}
	public void setIp65504P1230L(long number) {
	    number = checkIp65504P1230LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1230L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1231S
	 *	@return ip65504P1231S
	 */
	public short getIp65504P1231S() throws CFException {
        if (isIp65504P1231SModified()) { 
           ip65504P1231S = refreshIp65504P1231S();
        }
   		return ip65504P1231S;
	}
	
	/**
	 * 	Update Ip65504P1231S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1231-S
	 *	@param number
	 */
	public void setIp65504P1231S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1231S = checkIp65504P1231SMaxLimit(number); 
		serializeIp65504P1231S(ip65504P1231S);
	}

	public void setIp65504P1231S(int number) {
	    number = checkIp65504P1231SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1231S((short)number);
	}
	public void setIp65504P1231S(long number) {
	    number = checkIp65504P1231SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1231S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1231L
	 *	@return ip65504P1231L
	 */
	public short getIp65504P1231L() throws CFException {
        if (isIp65504P1231LModified()) { 
           ip65504P1231L = refreshIp65504P1231L();
        }
   		return ip65504P1231L;
	}
	
	/**
	 * 	Update Ip65504P1231L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1231-L
	 *	@param number
	 */
	public void setIp65504P1231L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1231L = checkIp65504P1231LMaxLimit(number); 
		serializeIp65504P1231L(ip65504P1231L);
	}

	public void setIp65504P1231L(int number) {
	    number = checkIp65504P1231LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1231L((short)number);
	}
	public void setIp65504P1231L(long number) {
	    number = checkIp65504P1231LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1231L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1232S
	 *	@return ip65504P1232S
	 */
	public short getIp65504P1232S() throws CFException {
        if (isIp65504P1232SModified()) { 
           ip65504P1232S = refreshIp65504P1232S();
        }
   		return ip65504P1232S;
	}
	
	/**
	 * 	Update Ip65504P1232S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1232-S
	 *	@param number
	 */
	public void setIp65504P1232S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1232S = checkIp65504P1232SMaxLimit(number); 
		serializeIp65504P1232S(ip65504P1232S);
	}

	public void setIp65504P1232S(int number) {
	    number = checkIp65504P1232SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1232S((short)number);
	}
	public void setIp65504P1232S(long number) {
	    number = checkIp65504P1232SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1232S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1232L
	 *	@return ip65504P1232L
	 */
	public short getIp65504P1232L() throws CFException {
        if (isIp65504P1232LModified()) { 
           ip65504P1232L = refreshIp65504P1232L();
        }
   		return ip65504P1232L;
	}
	
	/**
	 * 	Update Ip65504P1232L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1232-L
	 *	@param number
	 */
	public void setIp65504P1232L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1232L = checkIp65504P1232LMaxLimit(number); 
		serializeIp65504P1232L(ip65504P1232L);
	}

	public void setIp65504P1232L(int number) {
	    number = checkIp65504P1232LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1232L((short)number);
	}
	public void setIp65504P1232L(long number) {
	    number = checkIp65504P1232LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1232L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1233S
	 *	@return ip65504P1233S
	 */
	public short getIp65504P1233S() throws CFException {
        if (isIp65504P1233SModified()) { 
           ip65504P1233S = refreshIp65504P1233S();
        }
   		return ip65504P1233S;
	}
	
	/**
	 * 	Update Ip65504P1233S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1233-S
	 *	@param number
	 */
	public void setIp65504P1233S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1233S = checkIp65504P1233SMaxLimit(number); 
		serializeIp65504P1233S(ip65504P1233S);
	}

	public void setIp65504P1233S(int number) {
	    number = checkIp65504P1233SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1233S((short)number);
	}
	public void setIp65504P1233S(long number) {
	    number = checkIp65504P1233SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1233S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1233L
	 *	@return ip65504P1233L
	 */
	public short getIp65504P1233L() throws CFException {
        if (isIp65504P1233LModified()) { 
           ip65504P1233L = refreshIp65504P1233L();
        }
   		return ip65504P1233L;
	}
	
	/**
	 * 	Update Ip65504P1233L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1233-L
	 *	@param number
	 */
	public void setIp65504P1233L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1233L = checkIp65504P1233LMaxLimit(number); 
		serializeIp65504P1233L(ip65504P1233L);
	}

	public void setIp65504P1233L(int number) {
	    number = checkIp65504P1233LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1233L((short)number);
	}
	public void setIp65504P1233L(long number) {
	    number = checkIp65504P1233LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1233L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1234S
	 *	@return ip65504P1234S
	 */
	public short getIp65504P1234S() throws CFException {
        if (isIp65504P1234SModified()) { 
           ip65504P1234S = refreshIp65504P1234S();
        }
   		return ip65504P1234S;
	}
	
	/**
	 * 	Update Ip65504P1234S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1234-S
	 *	@param number
	 */
	public void setIp65504P1234S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1234S = checkIp65504P1234SMaxLimit(number); 
		serializeIp65504P1234S(ip65504P1234S);
	}

	public void setIp65504P1234S(int number) {
	    number = checkIp65504P1234SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1234S((short)number);
	}
	public void setIp65504P1234S(long number) {
	    number = checkIp65504P1234SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1234S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1234L
	 *	@return ip65504P1234L
	 */
	public short getIp65504P1234L() throws CFException {
        if (isIp65504P1234LModified()) { 
           ip65504P1234L = refreshIp65504P1234L();
        }
   		return ip65504P1234L;
	}
	
	/**
	 * 	Update Ip65504P1234L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1234-L
	 *	@param number
	 */
	public void setIp65504P1234L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1234L = checkIp65504P1234LMaxLimit(number); 
		serializeIp65504P1234L(ip65504P1234L);
	}

	public void setIp65504P1234L(int number) {
	    number = checkIp65504P1234LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1234L((short)number);
	}
	public void setIp65504P1234L(long number) {
	    number = checkIp65504P1234LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1234L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1235S
	 *	@return ip65504P1235S
	 */
	public short getIp65504P1235S() throws CFException {
        if (isIp65504P1235SModified()) { 
           ip65504P1235S = refreshIp65504P1235S();
        }
   		return ip65504P1235S;
	}
	
	/**
	 * 	Update Ip65504P1235S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1235-S
	 *	@param number
	 */
	public void setIp65504P1235S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1235S = checkIp65504P1235SMaxLimit(number); 
		serializeIp65504P1235S(ip65504P1235S);
	}

	public void setIp65504P1235S(int number) {
	    number = checkIp65504P1235SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1235S((short)number);
	}
	public void setIp65504P1235S(long number) {
	    number = checkIp65504P1235SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1235S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1235L
	 *	@return ip65504P1235L
	 */
	public short getIp65504P1235L() throws CFException {
        if (isIp65504P1235LModified()) { 
           ip65504P1235L = refreshIp65504P1235L();
        }
   		return ip65504P1235L;
	}
	
	/**
	 * 	Update Ip65504P1235L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1235-L
	 *	@param number
	 */
	public void setIp65504P1235L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1235L = checkIp65504P1235LMaxLimit(number); 
		serializeIp65504P1235L(ip65504P1235L);
	}

	public void setIp65504P1235L(int number) {
	    number = checkIp65504P1235LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1235L((short)number);
	}
	public void setIp65504P1235L(long number) {
	    number = checkIp65504P1235LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1235L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1236S
	 *	@return ip65504P1236S
	 */
	public short getIp65504P1236S() throws CFException {
        if (isIp65504P1236SModified()) { 
           ip65504P1236S = refreshIp65504P1236S();
        }
   		return ip65504P1236S;
	}
	
	/**
	 * 	Update Ip65504P1236S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1236-S
	 *	@param number
	 */
	public void setIp65504P1236S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1236S = checkIp65504P1236SMaxLimit(number); 
		serializeIp65504P1236S(ip65504P1236S);
	}

	public void setIp65504P1236S(int number) {
	    number = checkIp65504P1236SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1236S((short)number);
	}
	public void setIp65504P1236S(long number) {
	    number = checkIp65504P1236SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1236S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1236L
	 *	@return ip65504P1236L
	 */
	public short getIp65504P1236L() throws CFException {
        if (isIp65504P1236LModified()) { 
           ip65504P1236L = refreshIp65504P1236L();
        }
   		return ip65504P1236L;
	}
	
	/**
	 * 	Update Ip65504P1236L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1236-L
	 *	@param number
	 */
	public void setIp65504P1236L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1236L = checkIp65504P1236LMaxLimit(number); 
		serializeIp65504P1236L(ip65504P1236L);
	}

	public void setIp65504P1236L(int number) {
	    number = checkIp65504P1236LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1236L((short)number);
	}
	public void setIp65504P1236L(long number) {
	    number = checkIp65504P1236LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1236L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1237S
	 *	@return ip65504P1237S
	 */
	public short getIp65504P1237S() throws CFException {
        if (isIp65504P1237SModified()) { 
           ip65504P1237S = refreshIp65504P1237S();
        }
   		return ip65504P1237S;
	}
	
	/**
	 * 	Update Ip65504P1237S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1237-S
	 *	@param number
	 */
	public void setIp65504P1237S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1237S = checkIp65504P1237SMaxLimit(number); 
		serializeIp65504P1237S(ip65504P1237S);
	}

	public void setIp65504P1237S(int number) {
	    number = checkIp65504P1237SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1237S((short)number);
	}
	public void setIp65504P1237S(long number) {
	    number = checkIp65504P1237SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1237S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1237L
	 *	@return ip65504P1237L
	 */
	public short getIp65504P1237L() throws CFException {
        if (isIp65504P1237LModified()) { 
           ip65504P1237L = refreshIp65504P1237L();
        }
   		return ip65504P1237L;
	}
	
	/**
	 * 	Update Ip65504P1237L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1237-L
	 *	@param number
	 */
	public void setIp65504P1237L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1237L = checkIp65504P1237LMaxLimit(number); 
		serializeIp65504P1237L(ip65504P1237L);
	}

	public void setIp65504P1237L(int number) {
	    number = checkIp65504P1237LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1237L((short)number);
	}
	public void setIp65504P1237L(long number) {
	    number = checkIp65504P1237LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1237L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1238S
	 *	@return ip65504P1238S
	 */
	public short getIp65504P1238S() throws CFException {
        if (isIp65504P1238SModified()) { 
           ip65504P1238S = refreshIp65504P1238S();
        }
   		return ip65504P1238S;
	}
	
	/**
	 * 	Update Ip65504P1238S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1238-S
	 *	@param number
	 */
	public void setIp65504P1238S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1238S = checkIp65504P1238SMaxLimit(number); 
		serializeIp65504P1238S(ip65504P1238S);
	}

	public void setIp65504P1238S(int number) {
	    number = checkIp65504P1238SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1238S((short)number);
	}
	public void setIp65504P1238S(long number) {
	    number = checkIp65504P1238SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1238S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1238L
	 *	@return ip65504P1238L
	 */
	public short getIp65504P1238L() throws CFException {
        if (isIp65504P1238LModified()) { 
           ip65504P1238L = refreshIp65504P1238L();
        }
   		return ip65504P1238L;
	}
	
	/**
	 * 	Update Ip65504P1238L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1238-L
	 *	@param number
	 */
	public void setIp65504P1238L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1238L = checkIp65504P1238LMaxLimit(number); 
		serializeIp65504P1238L(ip65504P1238L);
	}

	public void setIp65504P1238L(int number) {
	    number = checkIp65504P1238LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1238L((short)number);
	}
	public void setIp65504P1238L(long number) {
	    number = checkIp65504P1238LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1238L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1239S
	 *	@return ip65504P1239S
	 */
	public short getIp65504P1239S() throws CFException {
        if (isIp65504P1239SModified()) { 
           ip65504P1239S = refreshIp65504P1239S();
        }
   		return ip65504P1239S;
	}
	
	/**
	 * 	Update Ip65504P1239S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1239-S
	 *	@param number
	 */
	public void setIp65504P1239S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1239S = checkIp65504P1239SMaxLimit(number); 
		serializeIp65504P1239S(ip65504P1239S);
	}

	public void setIp65504P1239S(int number) {
	    number = checkIp65504P1239SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1239S((short)number);
	}
	public void setIp65504P1239S(long number) {
	    number = checkIp65504P1239SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1239S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1239L
	 *	@return ip65504P1239L
	 */
	public short getIp65504P1239L() throws CFException {
        if (isIp65504P1239LModified()) { 
           ip65504P1239L = refreshIp65504P1239L();
        }
   		return ip65504P1239L;
	}
	
	/**
	 * 	Update Ip65504P1239L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1239-L
	 *	@param number
	 */
	public void setIp65504P1239L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1239L = checkIp65504P1239LMaxLimit(number); 
		serializeIp65504P1239L(ip65504P1239L);
	}

	public void setIp65504P1239L(int number) {
	    number = checkIp65504P1239LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1239L((short)number);
	}
	public void setIp65504P1239L(long number) {
	    number = checkIp65504P1239LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1239L((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1240S
	 *	@return ip65504P1240S
	 */
	public short getIp65504P1240S() throws CFException {
        if (isIp65504P1240SModified()) { 
           ip65504P1240S = refreshIp65504P1240S();
        }
   		return ip65504P1240S;
	}
	
	/**
	 * 	Update Ip65504P1240S with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1240-S
	 *	@param number
	 */
	public void setIp65504P1240S(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1240S = checkIp65504P1240SMaxLimit(number); 
		serializeIp65504P1240S(ip65504P1240S);
	}

	public void setIp65504P1240S(int number) {
	    number = checkIp65504P1240SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1240S((short)number);
	}
	public void setIp65504P1240S(long number) {
	    number = checkIp65504P1240SMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1240S((short)number);
	}
	

	/**
	 *	Returns the value of ip65504P1240L
	 *	@return ip65504P1240L
	 */
	public short getIp65504P1240L() throws CFException {
        if (isIp65504P1240LModified()) { 
           ip65504P1240L = refreshIp65504P1240L();
        }
   		return ip65504P1240L;
	}
	
	/**
	 * 	Update Ip65504P1240L with the passed value
	 *  Corresponding COBOL Variable is IP65504-P1240-L
	 *	@param number
	 */
	public void setIp65504P1240L(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504P1240L = checkIp65504P1240LMaxLimit(number); 
		serializeIp65504P1240L(ip65504P1240L);
	}

	public void setIp65504P1240L(int number) {
	    number = checkIp65504P1240LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1240L((short)number);
	}
	public void setIp65504P1240L(long number) {
	    number = checkIp65504P1240LMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504P1240L((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504PdsNamesLargeGroup40
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504P1210S((short)0);
         	setIp65504P1210L((short)0);
         	setIp65504P1211S((short)0);
         	setIp65504P1211L((short)0);
         	setIp65504P1212S((short)0);
         	setIp65504P1212L((short)0);
         	setIp65504P1213S((short)0);
         	setIp65504P1213L((short)0);
         	setIp65504P1214S((short)0);
         	setIp65504P1214L((short)0);
         	setIp65504P1215S((short)0);
         	setIp65504P1215L((short)0);
         	setIp65504P1216S((short)0);
         	setIp65504P1216L((short)0);
         	setIp65504P1217S((short)0);
         	setIp65504P1217L((short)0);
         	setIp65504P1218S((short)0);
         	setIp65504P1218L((short)0);
         	setIp65504P1219S((short)0);
         	setIp65504P1219L((short)0);
         	setIp65504P1220S((short)0);
         	setIp65504P1220L((short)0);
         	setIp65504P1221S((short)0);
         	setIp65504P1221L((short)0);
         	setIp65504P1222S((short)0);
         	setIp65504P1222L((short)0);
         	setIp65504P1223S((short)0);
         	setIp65504P1223L((short)0);
         	setIp65504P1224S((short)0);
         	setIp65504P1224L((short)0);
         	setIp65504P1225S((short)0);
         	setIp65504P1225L((short)0);
         	setIp65504P1226S((short)0);
         	setIp65504P1226L((short)0);
         	setIp65504P1227S((short)0);
         	setIp65504P1227L((short)0);
         	setIp65504P1228S((short)0);
         	setIp65504P1228L((short)0);
         	setIp65504P1229S((short)0);
         	setIp65504P1229L((short)0);
         	setIp65504P1230S((short)0);
         	setIp65504P1230L((short)0);
         	setIp65504P1231S((short)0);
         	setIp65504P1231L((short)0);
         	setIp65504P1232S((short)0);
         	setIp65504P1232L((short)0);
         	setIp65504P1233S((short)0);
         	setIp65504P1233L((short)0);
         	setIp65504P1234S((short)0);
         	setIp65504P1234L((short)0);
         	setIp65504P1235S((short)0);
         	setIp65504P1235L((short)0);
         	setIp65504P1236S((short)0);
         	setIp65504P1236L((short)0);
         	setIp65504P1237S((short)0);
         	setIp65504P1237L((short)0);
         	setIp65504P1238S((short)0);
         	setIp65504P1238L((short)0);
         	setIp65504P1239S((short)0);
         	setIp65504P1239L((short)0);
         	setIp65504P1240S((short)0);
         	setIp65504P1240L((short)0);
   }

		public static int getIp65504PdsNamesLargeGroup40FieldLength() {
			return IP_65504_PDS_NAMES_LARGE_GROUP_40_LENGTH;
		}

}
  
