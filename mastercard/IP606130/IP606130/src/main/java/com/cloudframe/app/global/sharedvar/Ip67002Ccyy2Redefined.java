package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Ccyy2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Ccyy2Redefined extends Ip67002Ccyy2RedefinedSerialized { 
   

								private int ip67002Cc2;

								private int ip67002Yy2;
	
	/**
	* Constructor for Ip67002Ccyy2Redefined
	**/
    public Ip67002Ccyy2Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Ccyy2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Ccyy2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002Cc2
	 *	@return ip67002Cc2
	 */
	public int getIp67002Cc2() throws CFException {
       if (isIp67002Cc2Modified()) { 
           ip67002Cc2 = refreshIp67002Cc2();
        }
   		return ip67002Cc2;
	}
	

	
	   
	/**
	 * 	Update Ip67002Cc2 with the passed value
	 *  Corresponding COBOL Variable is IP67002-CC-2
	 *	@param number
	 */
	public void setIp67002Cc2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Cc2 = checkIp67002Cc2MaxLimit(number); 
		serializeIp67002Cc2(ip67002Cc2);
	}
	

	public void setIp67002Cc2(long number) {
	    number = checkIp67002Cc2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Cc2((int)number);
	}
	
	/**
	 * 	Update Ip67002Cc2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc2(char[] value) throws CFException {
		 ip67002Cc2 = serializeIp67002Cc2(value);
	}
	/**
	 * 	Update Ip67002Cc2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc2String(char[] value) throws CFException {
		 setIp67002Cc2(value);
	}
	/**
	 *	Returns the value of ip67002Yy2
	 *	@return ip67002Yy2
	 */
	public int getIp67002Yy2() throws CFException {
       if (isIp67002Yy2Modified()) { 
           ip67002Yy2 = refreshIp67002Yy2();
        }
   		return ip67002Yy2;
	}
	

	
	   
	/**
	 * 	Update Ip67002Yy2 with the passed value
	 *  Corresponding COBOL Variable is IP67002-YY-2
	 *	@param number
	 */
	public void setIp67002Yy2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Yy2 = checkIp67002Yy2MaxLimit(number); 
		serializeIp67002Yy2(ip67002Yy2);
	}
	

	public void setIp67002Yy2(long number) {
	    number = checkIp67002Yy2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Yy2((int)number);
	}
	
	/**
	 * 	Update Ip67002Yy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy2(char[] value) throws CFException {
		 ip67002Yy2 = serializeIp67002Yy2(value);
	}
	/**
	 * 	Update Ip67002Yy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy2String(char[] value) throws CFException {
		 setIp67002Yy2(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002Ccyy2Redefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Cc2(0);
                     setIp67002Yy2(0);
   }

		public static int getIp67002Ccyy2RedefinedFieldLength() {
			return IP_67002_CCYY_2_REDEFINED_LENGTH;
		}

}
  
