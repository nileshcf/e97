package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeNamesLargeGroup5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504DeNamesLargeGroup5 extends Ip65504DeNamesLargeGroup5Serialized { 
   

								private short ip65504D125ReservdS;

								private short ip65504D125ReservdL;


								private short ip65504D126ConvdatS;

								private short ip65504D126ConvdatL;


								private short ip65504D127NetworkS;

								private short ip65504D127NetworkL;


								private short ip65504D128MacCodS;

								private short ip65504D128MacCodL;

	
	/**
	* Constructor for Ip65504DeNamesLargeGroup5
	**/
    public Ip65504DeNamesLargeGroup5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504DeNamesLargeGroup5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504DeNamesLargeGroup5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504D125ReservdS
	 *	@return ip65504D125ReservdS
	 */
	public short getIp65504D125ReservdS() throws CFException {
        if (isIp65504D125ReservdSModified()) { 
           ip65504D125ReservdS = refreshIp65504D125ReservdS();
        }
   		return ip65504D125ReservdS;
	}
	
	/**
	 * 	Update Ip65504D125ReservdS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D125-RESERVD-S
	 *	@param number
	 */
	public void setIp65504D125ReservdS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D125ReservdS = checkIp65504D125ReservdSMaxLimit(number); 
		serializeIp65504D125ReservdS(ip65504D125ReservdS);
	}

	public void setIp65504D125ReservdS(int number) {
	    number = checkIp65504D125ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D125ReservdS((short)number);
	}
	public void setIp65504D125ReservdS(long number) {
	    number = checkIp65504D125ReservdSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D125ReservdS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D125ReservdL
	 *	@return ip65504D125ReservdL
	 */
	public short getIp65504D125ReservdL() throws CFException {
        if (isIp65504D125ReservdLModified()) { 
           ip65504D125ReservdL = refreshIp65504D125ReservdL();
        }
   		return ip65504D125ReservdL;
	}
	
	/**
	 * 	Update Ip65504D125ReservdL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D125-RESERVD-L
	 *	@param number
	 */
	public void setIp65504D125ReservdL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D125ReservdL = checkIp65504D125ReservdLMaxLimit(number); 
		serializeIp65504D125ReservdL(ip65504D125ReservdL);
	}

	public void setIp65504D125ReservdL(int number) {
	    number = checkIp65504D125ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D125ReservdL((short)number);
	}
	public void setIp65504D125ReservdL(long number) {
	    number = checkIp65504D125ReservdLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D125ReservdL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D126ConvdatS
	 *	@return ip65504D126ConvdatS
	 */
	public short getIp65504D126ConvdatS() throws CFException {
        if (isIp65504D126ConvdatSModified()) { 
           ip65504D126ConvdatS = refreshIp65504D126ConvdatS();
        }
   		return ip65504D126ConvdatS;
	}
	
	/**
	 * 	Update Ip65504D126ConvdatS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D126-CONVDAT-S
	 *	@param number
	 */
	public void setIp65504D126ConvdatS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D126ConvdatS = checkIp65504D126ConvdatSMaxLimit(number); 
		serializeIp65504D126ConvdatS(ip65504D126ConvdatS);
	}

	public void setIp65504D126ConvdatS(int number) {
	    number = checkIp65504D126ConvdatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D126ConvdatS((short)number);
	}
	public void setIp65504D126ConvdatS(long number) {
	    number = checkIp65504D126ConvdatSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D126ConvdatS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D126ConvdatL
	 *	@return ip65504D126ConvdatL
	 */
	public short getIp65504D126ConvdatL() throws CFException {
        if (isIp65504D126ConvdatLModified()) { 
           ip65504D126ConvdatL = refreshIp65504D126ConvdatL();
        }
   		return ip65504D126ConvdatL;
	}
	
	/**
	 * 	Update Ip65504D126ConvdatL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D126-CONVDAT-L
	 *	@param number
	 */
	public void setIp65504D126ConvdatL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D126ConvdatL = checkIp65504D126ConvdatLMaxLimit(number); 
		serializeIp65504D126ConvdatL(ip65504D126ConvdatL);
	}

	public void setIp65504D126ConvdatL(int number) {
	    number = checkIp65504D126ConvdatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D126ConvdatL((short)number);
	}
	public void setIp65504D126ConvdatL(long number) {
	    number = checkIp65504D126ConvdatLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D126ConvdatL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D127NetworkS
	 *	@return ip65504D127NetworkS
	 */
	public short getIp65504D127NetworkS() throws CFException {
        if (isIp65504D127NetworkSModified()) { 
           ip65504D127NetworkS = refreshIp65504D127NetworkS();
        }
   		return ip65504D127NetworkS;
	}
	
	/**
	 * 	Update Ip65504D127NetworkS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D127-NETWORK-S
	 *	@param number
	 */
	public void setIp65504D127NetworkS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D127NetworkS = checkIp65504D127NetworkSMaxLimit(number); 
		serializeIp65504D127NetworkS(ip65504D127NetworkS);
	}

	public void setIp65504D127NetworkS(int number) {
	    number = checkIp65504D127NetworkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D127NetworkS((short)number);
	}
	public void setIp65504D127NetworkS(long number) {
	    number = checkIp65504D127NetworkSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D127NetworkS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D127NetworkL
	 *	@return ip65504D127NetworkL
	 */
	public short getIp65504D127NetworkL() throws CFException {
        if (isIp65504D127NetworkLModified()) { 
           ip65504D127NetworkL = refreshIp65504D127NetworkL();
        }
   		return ip65504D127NetworkL;
	}
	
	/**
	 * 	Update Ip65504D127NetworkL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D127-NETWORK-L
	 *	@param number
	 */
	public void setIp65504D127NetworkL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D127NetworkL = checkIp65504D127NetworkLMaxLimit(number); 
		serializeIp65504D127NetworkL(ip65504D127NetworkL);
	}

	public void setIp65504D127NetworkL(int number) {
	    number = checkIp65504D127NetworkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D127NetworkL((short)number);
	}
	public void setIp65504D127NetworkL(long number) {
	    number = checkIp65504D127NetworkLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D127NetworkL((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D128MacCodS
	 *	@return ip65504D128MacCodS
	 */
	public short getIp65504D128MacCodS() throws CFException {
        if (isIp65504D128MacCodSModified()) { 
           ip65504D128MacCodS = refreshIp65504D128MacCodS();
        }
   		return ip65504D128MacCodS;
	}
	
	/**
	 * 	Update Ip65504D128MacCodS with the passed value
	 *  Corresponding COBOL Variable is IP65504-D128-MAC-COD-S
	 *	@param number
	 */
	public void setIp65504D128MacCodS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D128MacCodS = checkIp65504D128MacCodSMaxLimit(number); 
		serializeIp65504D128MacCodS(ip65504D128MacCodS);
	}

	public void setIp65504D128MacCodS(int number) {
	    number = checkIp65504D128MacCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D128MacCodS((short)number);
	}
	public void setIp65504D128MacCodS(long number) {
	    number = checkIp65504D128MacCodSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D128MacCodS((short)number);
	}
	

	/**
	 *	Returns the value of ip65504D128MacCodL
	 *	@return ip65504D128MacCodL
	 */
	public short getIp65504D128MacCodL() throws CFException {
        if (isIp65504D128MacCodLModified()) { 
           ip65504D128MacCodL = refreshIp65504D128MacCodL();
        }
   		return ip65504D128MacCodL;
	}
	
	/**
	 * 	Update Ip65504D128MacCodL with the passed value
	 *  Corresponding COBOL Variable is IP65504-D128-MAC-COD-L
	 *	@param number
	 */
	public void setIp65504D128MacCodL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504D128MacCodL = checkIp65504D128MacCodLMaxLimit(number); 
		serializeIp65504D128MacCodL(ip65504D128MacCodL);
	}

	public void setIp65504D128MacCodL(int number) {
	    number = checkIp65504D128MacCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D128MacCodL((short)number);
	}
	public void setIp65504D128MacCodL(long number) {
	    number = checkIp65504D128MacCodLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504D128MacCodL((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip65504DeNamesLargeGroup5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504D125ReservdS((short)0);
         	setIp65504D125ReservdL((short)0);
         	setIp65504D126ConvdatS((short)0);
         	setIp65504D126ConvdatL((short)0);
         	setIp65504D127NetworkS((short)0);
         	setIp65504D127NetworkL((short)0);
         	setIp65504D128MacCodS((short)0);
         	setIp65504D128MacCodL((short)0);
   }

		public static int getIp65504DeNamesLargeGroup5FieldLength() {
			return IP_65504_DE_NAMES_LARGE_GROUP_5_LENGTH;
		}

}
  
