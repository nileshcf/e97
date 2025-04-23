package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Jddd2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Jddd2 extends Ip67002Jddd2Serialized { 
   

								private int ip67002JDdd201;

	
	/**
	* Constructor for Ip67002Jddd2
	**/
    public Ip67002Jddd2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Jddd2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Jddd2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002JDdd201
	 *	@return ip67002JDdd201
	 */
	public int getIp67002JDdd201() throws CFException {
       if (isIp67002JDdd201Modified()) { 
           ip67002JDdd201 = refreshIp67002JDdd201();
        }
   		return ip67002JDdd201;
	}
	

	
	   
	/**
	 * 	Update Ip67002JDdd201 with the passed value
	 *  Corresponding COBOL Variable is IP67002-J-DDD-2
	 *	@param number
	 */
	public void setIp67002JDdd201(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002JDdd201 = checkIp67002JDdd201MaxLimit(number); 
		serializeIp67002JDdd201(ip67002JDdd201);
	}
	

	public void setIp67002JDdd201(long number) {
	    number = checkIp67002JDdd201MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002JDdd201((int)number);
	}
	
	/**
	 * 	Update Ip67002JDdd201 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd201(char[] value) throws CFException {
		 ip67002JDdd201 = serializeIp67002JDdd201(value);
	}
	/**
	 * 	Update Ip67002JDdd201 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002JDdd201String(char[] value) throws CFException {
		 setIp67002JDdd201(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002Jddd2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002JDdd201(0);
   }

		public static int getIp67002Jddd2FieldLength() {
			return IP_67002_JDDD_2_LENGTH;
		}

}
  
