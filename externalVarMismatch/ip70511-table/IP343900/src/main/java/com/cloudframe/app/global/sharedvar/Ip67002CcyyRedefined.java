package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002CcyyRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002CcyyRedefined extends Ip67002CcyyRedefinedSerialized { 
   

								private int ip67002Cc;

								private int ip67002Yy;
	
	/**
	* Constructor for Ip67002CcyyRedefined
	**/
    public Ip67002CcyyRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002CcyyRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002CcyyRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002Cc
	 *	@return ip67002Cc
	 */
	public int getIp67002Cc() throws CFException {
       if (isIp67002CcModified()) { 
           ip67002Cc = refreshIp67002Cc();
        }
   		return ip67002Cc;
	}
	

	
	   
	/**
	 * 	Update Ip67002Cc with the passed value
	 *  Corresponding COBOL Variable is IP67002-CC
	 *	@param number
	 */
	public void setIp67002Cc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Cc = checkIp67002CcMaxLimit(number); 
		serializeIp67002Cc(ip67002Cc);
	}
	

	public void setIp67002Cc(long number) {
	    number = checkIp67002CcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Cc((int)number);
	}
	
	/**
	 * 	Update Ip67002Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Cc(char[] value) throws CFException {
		 ip67002Cc = serializeIp67002Cc(value);
	}
	/**
	 * 	Update Ip67002Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002CcString(char[] value) throws CFException {
		 setIp67002Cc(value);
	}
	/**
	 *	Returns the value of ip67002Yy
	 *	@return ip67002Yy
	 */
	public int getIp67002Yy() throws CFException {
       if (isIp67002YyModified()) { 
           ip67002Yy = refreshIp67002Yy();
        }
   		return ip67002Yy;
	}
	

	
	   
	/**
	 * 	Update Ip67002Yy with the passed value
	 *  Corresponding COBOL Variable is IP67002-YY
	 *	@param number
	 */
	public void setIp67002Yy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Yy = checkIp67002YyMaxLimit(number); 
		serializeIp67002Yy(ip67002Yy);
	}
	

	public void setIp67002Yy(long number) {
	    number = checkIp67002YyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Yy((int)number);
	}
	
	/**
	 * 	Update Ip67002Yy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Yy(char[] value) throws CFException {
		 ip67002Yy = serializeIp67002Yy(value);
	}
	/**
	 * 	Update Ip67002Yy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002YyString(char[] value) throws CFException {
		 setIp67002Yy(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002CcyyRedefined
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Cc(0);
                     setIp67002Yy(0);
   }

		public static int getIp67002CcyyRedefinedFieldLength() {
			return IP_67002_CCYY_REDEFINED_LENGTH;
		}

}
  
