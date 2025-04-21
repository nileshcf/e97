package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Yyddd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Yyddd extends Ip67002YydddSerialized { 
   

								private int ip67002YyJul;

								private int ip67002Ddd;
	
	/**
	* Constructor for Ip67002Yyddd
	**/
    public Ip67002Yyddd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Yyddd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Yyddd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002YyJul
	 *	@return ip67002YyJul
	 */
	public int getIp67002YyJul() throws CFException {
       if (isIp67002YyJulModified()) { 
           ip67002YyJul = refreshIp67002YyJul();
        }
   		return ip67002YyJul;
	}
	

	
	   
	/**
	 * 	Update Ip67002YyJul with the passed value
	 *  Corresponding COBOL Variable is IP67002-YY-JUL
	 *	@param number
	 */
	public void setIp67002YyJul(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002YyJul = checkIp67002YyJulMaxLimit(number); 
		serializeIp67002YyJul(ip67002YyJul);
	}
	

	public void setIp67002YyJul(long number) {
	    number = checkIp67002YyJulMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002YyJul((int)number);
	}
	
	/**
	 * 	Update Ip67002YyJul with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002YyJul(char[] value) throws CFException {
		 ip67002YyJul = serializeIp67002YyJul(value);
	}
	/**
	 * 	Update Ip67002YyJul with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002YyJulString(char[] value) throws CFException {
		 setIp67002YyJul(value);
	}
	/**
	 *	Returns the value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public int getIp67002Ddd() throws CFException {
       if (isIp67002DddModified()) { 
           ip67002Ddd = refreshIp67002Ddd();
        }
   		return ip67002Ddd;
	}
	

	
	   
	/**
	 * 	Update Ip67002Ddd with the passed value
	 *  Corresponding COBOL Variable is IP67002-DDD
	 *	@param number
	 */
	public void setIp67002Ddd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Ddd = checkIp67002DddMaxLimit(number); 
		serializeIp67002Ddd(ip67002Ddd);
	}
	

	public void setIp67002Ddd(long number) {
	    number = checkIp67002DddMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Ddd((int)number);
	}
	
	/**
	 * 	Update Ip67002Ddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Ddd(char[] value) throws CFException {
		 ip67002Ddd = serializeIp67002Ddd(value);
	}
	/**
	 * 	Update Ip67002Ddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002DddString(char[] value) throws CFException {
		 setIp67002Ddd(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002Yyddd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002YyJul(0);
                     setIp67002Ddd(0);
   }

		public static int getIp67002YydddFieldLength() {
			return IP_67002_YYDDD_LENGTH;
		}

}
  
