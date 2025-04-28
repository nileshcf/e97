package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iReadTableIdRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip50004iReadTableIdRedefined extends Ip50004iReadTableIdRedefinedSerialized { 
   


								private int ip50004iReadTableNum;

	
	/**
	* Constructor for Ip50004iReadTableIdRedefined
	**/
    public Ip50004iReadTableIdRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50004iReadTableIdRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iReadTableIdRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip50004iReadTableNum
	 *	@return ip50004iReadTableNum
	 */
	public int getIp50004iReadTableNum() throws CFException {
       if (isIp50004iReadTableNumModified()) { 
           ip50004iReadTableNum = refreshIp50004iReadTableNum();
        }
   		return ip50004iReadTableNum;
	}
	

	
	   
	/**
	 * 	Update Ip50004iReadTableNum with the passed value
	 *  Corresponding COBOL Variable is IP50004I-READ-TABLE-NUM
	 *	@param number
	 */
	public void setIp50004iReadTableNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50004iReadTableNum = checkIp50004iReadTableNumMaxLimit(number); 
		serializeIp50004iReadTableNum(ip50004iReadTableNum);
	}
	

	public void setIp50004iReadTableNum(long number) {
	    number = checkIp50004iReadTableNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp50004iReadTableNum((int)number);
	}
	
	/**
	 * 	Update Ip50004iReadTableNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50004iReadTableNum(char[] value) throws CFException {
		 ip50004iReadTableNum = serializeIp50004iReadTableNum(value);
	}
	/**
	 * 	Update Ip50004iReadTableNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50004iReadTableNumString(char[] value) throws CFException {
		 setIp50004iReadTableNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip50004iReadTableIdRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp50004iReadTableNum(0);
   }

		public static int getIp50004iReadTableIdRedefinedFieldLength() {
			return IP_50004I_READ_TABLE_ID_REDEFINED_LENGTH;
		}

}
  
