package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip67002Hhmm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip67002Hhmm extends Ip67002HhmmSerialized { 
   

								private int ip67002Hh;

								private int ip67002Mth;
	
	/**
	* Constructor for Ip67002Hhmm
	**/
    public Ip67002Hhmm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip67002Hhmm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Hhmm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip67002Hh
	 *	@return ip67002Hh
	 */
	public int getIp67002Hh() throws CFException {
       if (isIp67002HhModified()) { 
           ip67002Hh = refreshIp67002Hh();
        }
   		return ip67002Hh;
	}
	

	
	   
	/**
	 * 	Update Ip67002Hh with the passed value
	 *  Corresponding COBOL Variable is IP67002-HH
	 *	@param number
	 */
	public void setIp67002Hh(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Hh = checkIp67002HhMaxLimit(number); 
		serializeIp67002Hh(ip67002Hh);
	}
	

	public void setIp67002Hh(long number) {
	    number = checkIp67002HhMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Hh((int)number);
	}
	
	/**
	 * 	Update Ip67002Hh with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Hh(char[] value) throws CFException {
		 ip67002Hh = serializeIp67002Hh(value);
	}
	/**
	 * 	Update Ip67002Hh with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002HhString(char[] value) throws CFException {
		 setIp67002Hh(value);
	}
	/**
	 *	Returns the value of ip67002Mth
	 *	@return ip67002Mth
	 */
	public int getIp67002Mth() throws CFException {
       if (isIp67002MthModified()) { 
           ip67002Mth = refreshIp67002Mth();
        }
   		return ip67002Mth;
	}
	

	
	   
	/**
	 * 	Update Ip67002Mth with the passed value
	 *  Corresponding COBOL Variable is IP67002-MTH
	 *	@param number
	 */
	public void setIp67002Mth(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip67002Mth = checkIp67002MthMaxLimit(number); 
		serializeIp67002Mth(ip67002Mth);
	}
	

	public void setIp67002Mth(long number) {
	    number = checkIp67002MthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp67002Mth((int)number);
	}
	
	/**
	 * 	Update Ip67002Mth with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp67002Mth(char[] value) throws CFException {
		 ip67002Mth = serializeIp67002Mth(value);
	}
	/**
	 * 	Update Ip67002Mth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp67002MthString(char[] value) throws CFException {
		 setIp67002Mth(value);
	}

	
	
	
	/**
	 * 	initializes Ip67002Hhmm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp67002Hh(0);
                     setIp67002Mth(0);
   }

		public static int getIp67002HhmmFieldLength() {
			return IP_67002_HHMM_LENGTH;
		}

}
  
