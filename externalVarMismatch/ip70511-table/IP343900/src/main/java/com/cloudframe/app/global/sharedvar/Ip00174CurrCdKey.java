package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00174CurrCdKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00174CurrCdKey extends Ip00174CurrCdKeySerialized { 
   

								private int ip00174CurrCdCode;
	
	/**
	* Constructor for Ip00174CurrCdKey
	**/
    public Ip00174CurrCdKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00174CurrCdKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00174CurrCdKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00174CurrCdCode
	 *	@return ip00174CurrCdCode
	 */
	public int getIp00174CurrCdCode() throws CFException {
       if (isIp00174CurrCdCodeModified()) { 
           ip00174CurrCdCode = refreshIp00174CurrCdCode();
        }
   		return ip00174CurrCdCode;
	}
	

	
	   
	/**
	 * 	Update Ip00174CurrCdCode with the passed value
	 *  Corresponding COBOL Variable is IP00174-CURR-CD-CODE
	 *	@param number
	 */
	public void setIp00174CurrCdCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00174CurrCdCode = checkIp00174CurrCdCodeMaxLimit(number); 
		serializeIp00174CurrCdCode(ip00174CurrCdCode);
	}
	

	public void setIp00174CurrCdCode(long number) {
	    number = checkIp00174CurrCdCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00174CurrCdCode((int)number);
	}
	
	/**
	 * 	Update Ip00174CurrCdCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurrCdCode(char[] value) throws CFException {
		 ip00174CurrCdCode = serializeIp00174CurrCdCode(value);
	}
	/**
	 * 	Update Ip00174CurrCdCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurrCdCodeString(char[] value) throws CFException {
		 setIp00174CurrCdCode(value);
	}

	
	
	
	/**
	 * 	initializes Ip00174CurrCdKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00174CurrCdCode(0);
   }

		public static int getIp00174CurrCdKeyFieldLength() {
			return IP_00174_CURR_CD_KEY_LENGTH;
		}

}
  
