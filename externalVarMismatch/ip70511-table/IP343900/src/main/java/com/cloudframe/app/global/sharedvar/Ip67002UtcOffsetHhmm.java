package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002UtcOffsetHhmm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002UtcOffsetHhmm extends Ip67002UtcOffsetHhmmSerialized { 
   

								private int ip67002UtcOffsetHh;

								private int ip67002UtcOffsetMm;
	
	/**
	* Constructor for Ip67002UtcOffsetHhmm
	**/
    public Ip67002UtcOffsetHhmm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002UtcOffsetHhmm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002UtcOffsetHhmm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public int getIp67002UtcOffsetHh() throws CFException {
       if (isIp67002UtcOffsetHhModified()) { 
           ip67002UtcOffsetHh = refreshIp67002UtcOffsetHh();
        }
   		return ip67002UtcOffsetHh;
	}
	

	
	   
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *  Corresponding COBOL Variable is IP67002-UTC-OFFSET-HH
	 *	@param number
	 */
	public void setIp67002UtcOffsetHh(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002UtcOffsetHh = checkIp67002UtcOffsetHhMaxLimit(number); 
		serializeIp67002UtcOffsetHh(ip67002UtcOffsetHh);
	}
	

	public void setIp67002UtcOffsetHh(long number) {
	    number = checkIp67002UtcOffsetHhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002UtcOffsetHh((int)number);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHh(char[] value) throws CFException {
		 ip67002UtcOffsetHh = serializeIp67002UtcOffsetHh(value);
	}
	/**
	 * 	Update Ip67002UtcOffsetHh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetHhString(char[] value) throws CFException {
		 setIp67002UtcOffsetHh(value);
	}
	/**
	 *	Returns the value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public int getIp67002UtcOffsetMm() throws CFException {
       if (isIp67002UtcOffsetMmModified()) { 
           ip67002UtcOffsetMm = refreshIp67002UtcOffsetMm();
        }
   		return ip67002UtcOffsetMm;
	}
	

	
	   
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *  Corresponding COBOL Variable is IP67002-UTC-OFFSET-MM
	 *	@param number
	 */
	public void setIp67002UtcOffsetMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002UtcOffsetMm = checkIp67002UtcOffsetMmMaxLimit(number); 
		serializeIp67002UtcOffsetMm(ip67002UtcOffsetMm);
	}
	

	public void setIp67002UtcOffsetMm(long number) {
	    number = checkIp67002UtcOffsetMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002UtcOffsetMm((int)number);
	}
	
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMm(char[] value) throws CFException {
		 ip67002UtcOffsetMm = serializeIp67002UtcOffsetMm(value);
	}
	/**
	 * 	Update Ip67002UtcOffsetMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002UtcOffsetMmString(char[] value) throws CFException {
		 setIp67002UtcOffsetMm(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002UtcOffsetHhmm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002UtcOffsetHh(0);
                     setIp67002UtcOffsetMm(0);
   }

		public static int getIp67002UtcOffsetHhmmFieldLength() {
			return IP_67002_UTC_OFFSET_HHMM_LENGTH;
		}

}
  
