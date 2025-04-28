package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00694TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00694TableData extends Ip00694TableDataSerialized { 
   

								private int ip00694GlobalCurrCode;

								private int ip00694GlobalCurrExp;
	
	/**
	* Constructor for Ip00694TableData
	**/
    public Ip00694TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00694TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00694TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00694GlobalCurrCode
	 *	@return ip00694GlobalCurrCode
	 */
	public int getIp00694GlobalCurrCode() throws CFException {
       if (isIp00694GlobalCurrCodeModified()) { 
           ip00694GlobalCurrCode = refreshIp00694GlobalCurrCode();
        }
   		return ip00694GlobalCurrCode;
	}
	

	
	   
	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value
	 *  Corresponding COBOL Variable is IP00694-GLOBAL-CURR-CODE
	 *	@param number
	 */
	public void setIp00694GlobalCurrCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00694GlobalCurrCode = checkIp00694GlobalCurrCodeMaxLimit(number); 
		serializeIp00694GlobalCurrCode(ip00694GlobalCurrCode);
	}
	

	public void setIp00694GlobalCurrCode(long number) {
	    number = checkIp00694GlobalCurrCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00694GlobalCurrCode((int)number);
	}
	
	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrCode(char[] value) throws CFException {
		 ip00694GlobalCurrCode = serializeIp00694GlobalCurrCode(value);
	}
	/**
	 * 	Update Ip00694GlobalCurrCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrCodeString(char[] value) throws CFException {
		 setIp00694GlobalCurrCode(value);
	}
	/**
	 *	Returns the value of ip00694GlobalCurrExp
	 *	@return ip00694GlobalCurrExp
	 */
	public int getIp00694GlobalCurrExp() throws CFException {
       if (isIp00694GlobalCurrExpModified()) { 
           ip00694GlobalCurrExp = refreshIp00694GlobalCurrExp();
        }
   		return ip00694GlobalCurrExp;
	}
	

	
	   
	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value
	 *  Corresponding COBOL Variable is IP00694-GLOBAL-CURR-EXP
	 *	@param number
	 */
	public void setIp00694GlobalCurrExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00694GlobalCurrExp = checkIp00694GlobalCurrExpMaxLimit(number); 
		serializeIp00694GlobalCurrExp(ip00694GlobalCurrExp);
	}
	

	public void setIp00694GlobalCurrExp(long number) {
	    number = checkIp00694GlobalCurrExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00694GlobalCurrExp((int)number);
	}
	
	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrExp(char[] value) throws CFException {
		 ip00694GlobalCurrExp = serializeIp00694GlobalCurrExp(value);
	}
	/**
	 * 	Update Ip00694GlobalCurrExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00694GlobalCurrExpString(char[] value) throws CFException {
		 setIp00694GlobalCurrExp(value);
	}

	
	
	
	/**
	 * 	initializes Ip00694TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00694GlobalCurrCode(0);
                     setIp00694GlobalCurrExp(0);
   }

		public static int getIp00694TableDataFieldLength() {
			return IP_00694_TABLE_DATA_LENGTH;
		}

}
  
