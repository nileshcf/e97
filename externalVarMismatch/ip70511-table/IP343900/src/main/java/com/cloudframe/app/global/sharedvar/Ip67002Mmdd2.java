package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Mmdd2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Mmdd2 extends Ip67002Mmdd2Serialized { 
   

								private int ip67002Mm2;

								private int ip67002Dd2;
	
	/**
	* Constructor for Ip67002Mmdd2
	**/
    public Ip67002Mmdd2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Mmdd2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Mmdd2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002Mm2
	 *	@return ip67002Mm2
	 */
	public int getIp67002Mm2() throws CFException {
       if (isIp67002Mm2Modified()) { 
           ip67002Mm2 = refreshIp67002Mm2();
        }
   		return ip67002Mm2;
	}
	

	
	   
	/**
	 * 	Update Ip67002Mm2 with the passed value
	 *  Corresponding COBOL Variable is IP67002-MM-2
	 *	@param number
	 */
	public void setIp67002Mm2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Mm2 = checkIp67002Mm2MaxLimit(number); 
		serializeIp67002Mm2(ip67002Mm2);
	}
	

	public void setIp67002Mm2(long number) {
	    number = checkIp67002Mm2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Mm2((int)number);
	}
	
	/**
	 * 	Update Ip67002Mm2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Mm2(char[] value) throws CFException {
		 ip67002Mm2 = serializeIp67002Mm2(value);
	}
	/**
	 * 	Update Ip67002Mm2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Mm2String(char[] value) throws CFException {
		 setIp67002Mm2(value);
	}
	/**
	 *	Returns the value of ip67002Dd2
	 *	@return ip67002Dd2
	 */
	public int getIp67002Dd2() throws CFException {
       if (isIp67002Dd2Modified()) { 
           ip67002Dd2 = refreshIp67002Dd2();
        }
   		return ip67002Dd2;
	}
	

	
	   
	/**
	 * 	Update Ip67002Dd2 with the passed value
	 *  Corresponding COBOL Variable is IP67002-DD-2
	 *	@param number
	 */
	public void setIp67002Dd2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Dd2 = checkIp67002Dd2MaxLimit(number); 
		serializeIp67002Dd2(ip67002Dd2);
	}
	

	public void setIp67002Dd2(long number) {
	    number = checkIp67002Dd2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Dd2((int)number);
	}
	
	/**
	 * 	Update Ip67002Dd2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Dd2(char[] value) throws CFException {
		 ip67002Dd2 = serializeIp67002Dd2(value);
	}
	/**
	 * 	Update Ip67002Dd2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Dd2String(char[] value) throws CFException {
		 setIp67002Dd2(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002Mmdd2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Mm2(0);
                     setIp67002Dd2(0);
   }

		public static int getIp67002Mmdd2FieldLength() {
			return IP_67002_MMDD_2_LENGTH;
		}

}
  
