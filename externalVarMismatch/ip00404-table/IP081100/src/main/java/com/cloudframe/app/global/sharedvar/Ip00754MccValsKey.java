package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754MccValsKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00754MccValsKey extends Ip00754MccValsKeySerialized { 
   

								private int ip00754MccVals;
	
	/**
	* Constructor for Ip00754MccValsKey
	**/
    public Ip00754MccValsKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00754MccValsKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00754MccValsKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00754MccVals
	 *	@return ip00754MccVals
	 */
	public int getIp00754MccVals() throws CFException {
       if (isIp00754MccValsModified()) { 
           ip00754MccVals = refreshIp00754MccVals();
        }
   		return ip00754MccVals;
	}
	

	
	   
	/**
	 * 	Update Ip00754MccVals with the passed value
	 *  Corresponding COBOL Variable is IP00754-MCC-VALS
	 *	@param number
	 */
	public void setIp00754MccVals(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00754MccVals = checkIp00754MccValsMaxLimit(number); 
		serializeIp00754MccVals(ip00754MccVals);
	}
	

	public void setIp00754MccVals(long number) {
	    number = checkIp00754MccValsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00754MccVals((int)number);
	}
	
	/**
	 * 	Update Ip00754MccVals with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00754MccVals(char[] value) throws CFException {
		 ip00754MccVals = serializeIp00754MccVals(value);
	}
	/**
	 * 	Update Ip00754MccVals with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00754MccValsString(char[] value) throws CFException {
		 setIp00754MccVals(value);
	}

	
	
	
	/**
	 * 	initializes Ip00754MccValsKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00754MccVals(0);
   }

		public static int getIp00754MccValsKeyFieldLength() {
			return IP_00754_MCC_VALS_KEY_LENGTH;
		}

}
  
