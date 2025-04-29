package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Jddd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Jddd extends Ip67002JdddSerialized { 
   

								private int ip67002JDdd01;

	
	/**
	* Constructor for Ip67002Jddd
	**/
    public Ip67002Jddd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Jddd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Jddd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public int getIp67002JDdd01() throws CFException {
       if (isIp67002JDdd01Modified()) { 
           ip67002JDdd01 = refreshIp67002JDdd01();
        }
   		return ip67002JDdd01;
	}
	

	
	   
	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *  Corresponding COBOL Variable is IP67002-J-DDD
	 *	@param number
	 */
	public void setIp67002JDdd01(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002JDdd01 = checkIp67002JDdd01MaxLimit(number); 
		serializeIp67002JDdd01(ip67002JDdd01);
	}
	

	public void setIp67002JDdd01(long number) {
	    number = checkIp67002JDdd01MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002JDdd01((int)number);
	}
	
	/**
	 * 	Update Ip67002JDdd01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01(char[] value) throws CFException {
		 ip67002JDdd01 = serializeIp67002JDdd01(value);
	}
	/**
	 * 	Update Ip67002JDdd01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd01String(char[] value) throws CFException {
		 setIp67002JDdd01(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002Jddd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002JDdd01(0);
   }

		public static int getIp67002JdddFieldLength() {
			return IP_67002_JDDD_LENGTH;
		}

}
  
