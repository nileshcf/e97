package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041ReadTableIdRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip500041ReadTableIdRedefined extends Ip500041ReadTableIdRedefinedSerialized { 
   


								private int ip500041ReadTableNum;

	
	/**
	* Constructor for Ip500041ReadTableIdRedefined
	**/
    public Ip500041ReadTableIdRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip500041ReadTableIdRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041ReadTableIdRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip500041ReadTableNum
	 *	@return ip500041ReadTableNum
	 */
	public int getIp500041ReadTableNum() throws CFException {
       if (isIp500041ReadTableNumModified()) { 
           ip500041ReadTableNum = refreshIp500041ReadTableNum();
        }
   		return ip500041ReadTableNum;
	}
	

	
	   
	/**
	 * 	Update Ip500041ReadTableNum with the passed value
	 *  Corresponding COBOL Variable is IP500041-READ-TABLE-NUM
	 *	@param number
	 */
	public void setIp500041ReadTableNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip500041ReadTableNum = checkIp500041ReadTableNumMaxLimit(number); 
		serializeIp500041ReadTableNum(ip500041ReadTableNum);
	}
	

	public void setIp500041ReadTableNum(long number) {
	    number = checkIp500041ReadTableNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp500041ReadTableNum((int)number);
	}
	
	/**
	 * 	Update Ip500041ReadTableNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp500041ReadTableNum(char[] value) throws CFException {
		 ip500041ReadTableNum = serializeIp500041ReadTableNum(value);
	}
	/**
	 * 	Update Ip500041ReadTableNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp500041ReadTableNumString(char[] value) throws CFException {
		 setIp500041ReadTableNum(value);
	}

	
	
	
	/**
	 * 	initializes Ip500041ReadTableIdRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp500041ReadTableNum(0);
   }

		public static int getIp500041ReadTableIdRedefinedFieldLength() {
			return IP_500041_READ_TABLE_ID_REDEFINED_LENGTH;
		}

}
  
