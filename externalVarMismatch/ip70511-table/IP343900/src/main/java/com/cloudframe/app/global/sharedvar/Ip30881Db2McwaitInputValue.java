package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30881Db2McwaitInputValue is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip30881Db2McwaitInputValue")

public class Ip30881Db2McwaitInputValue extends Ip30881Db2McwaitInputValueSerialized  implements InitializingBean {
   

								private int ip30881911RetryValue;
	
	/**
	* Constructor for Ip30881Db2McwaitInputValue
	**/
    public Ip30881Db2McwaitInputValue() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip30881911RetryValue
	 *	@return ip30881911RetryValue
	 */
	public int getIp30881911RetryValue() throws CFException {
       if (isIp30881911RetryValueModified()) { 
           ip30881911RetryValue = refreshIp30881911RetryValue();
        }
   		return ip30881911RetryValue;
	}
	

	
	   
	/**
	 * 	Update Ip30881911RetryValue with the passed value
	 *  Corresponding COBOL Variable is IP30881-911-RETRY-VALUE
	 *	@param number
	 */
	public void setIp30881911RetryValue(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip30881911RetryValue = checkIp30881911RetryValueMaxLimit(number); 
		serializeIp30881911RetryValue(ip30881911RetryValue);
	}
	

	public void setIp30881911RetryValue(long number) {
	    number = checkIp30881911RetryValueMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp30881911RetryValue((int)number);
	}
	
	/**
	 * 	Update Ip30881911RetryValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp30881911RetryValue(char[] value) throws CFException {
		 ip30881911RetryValue = serializeIp30881911RetryValue(value);
	}
	/**
	 * 	Update Ip30881911RetryValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp30881911RetryValueString(char[] value) throws CFException {
		 setIp30881911RetryValue(value);
	}

	
	
	
	/**
	 * 	initializes Ip30881Db2McwaitInputValue
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30881911RetryValue(0);
   }

		public static int getIp30881Db2McwaitInputValueFieldLength() {
			return IP_30881_DB_2_MCWAIT_INPUT_VALUE_LENGTH;
		}

}
  
