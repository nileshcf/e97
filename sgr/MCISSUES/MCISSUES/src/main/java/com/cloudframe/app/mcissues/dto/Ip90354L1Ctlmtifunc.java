package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354L1Ctlmtifunc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip90354L1Ctlmtifunc extends Ip90354L1CtlmtifuncSerialized { 
   

								private int ip90354L1Ctlmti;

								private int ip90354L1Ctlfunc;
	
	/**
	* Constructor for Ip90354L1Ctlmtifunc
	**/
    public Ip90354L1Ctlmtifunc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip90354L1Ctlmtifunc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip90354L1Ctlmtifunc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip90354L1Ctlmti
	 *	@return ip90354L1Ctlmti
	 */
	public int getIp90354L1Ctlmti() throws CFException {
       if (isIp90354L1CtlmtiModified()) { 
           ip90354L1Ctlmti = refreshIp90354L1Ctlmti();
        }
   		return ip90354L1Ctlmti;
	}
	

	
	   
	/**
	 * 	Update Ip90354L1Ctlmti with the passed value
	 *  Corresponding COBOL Variable is IP90354-L1-CTLMTI
	 *	@param number
	 */
	public void setIp90354L1Ctlmti(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90354L1Ctlmti = checkIp90354L1CtlmtiMaxLimit(number); 
		serializeIp90354L1Ctlmti(ip90354L1Ctlmti);
	}
	

	public void setIp90354L1Ctlmti(long number) {
	    number = checkIp90354L1CtlmtiMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90354L1Ctlmti((int)number);
	}
	
	/**
	 * 	Update Ip90354L1Ctlmti with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90354L1Ctlmti(char[] value) throws CFException {
		 ip90354L1Ctlmti = serializeIp90354L1Ctlmti(value);
	}
	/**
	 * 	Update Ip90354L1Ctlmti with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlmtiString(char[] value) throws CFException {
		 setIp90354L1Ctlmti(value);
	}
	/**
	 *	Returns the value of ip90354L1Ctlfunc
	 *	@return ip90354L1Ctlfunc
	 */
	public int getIp90354L1Ctlfunc() throws CFException {
       if (isIp90354L1CtlfuncModified()) { 
           ip90354L1Ctlfunc = refreshIp90354L1Ctlfunc();
        }
   		return ip90354L1Ctlfunc;
	}
	

	
	   
	/**
	 * 	Update Ip90354L1Ctlfunc with the passed value
	 *  Corresponding COBOL Variable is IP90354-L1-CTLFUNC
	 *	@param number
	 */
	public void setIp90354L1Ctlfunc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip90354L1Ctlfunc = checkIp90354L1CtlfuncMaxLimit(number); 
		serializeIp90354L1Ctlfunc(ip90354L1Ctlfunc);
	}
	

	public void setIp90354L1Ctlfunc(long number) {
	    number = checkIp90354L1CtlfuncMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp90354L1Ctlfunc((int)number);
	}
	
	/**
	 * 	Update Ip90354L1Ctlfunc with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp90354L1Ctlfunc(char[] value) throws CFException {
		 ip90354L1Ctlfunc = serializeIp90354L1Ctlfunc(value);
	}
	/**
	 * 	Update Ip90354L1Ctlfunc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp90354L1CtlfuncString(char[] value) throws CFException {
		 setIp90354L1Ctlfunc(value);
	}

	
	
	

		public static int getIp90354L1CtlmtifuncFieldLength() {
			return IP_90354_L_1_CTLMTIFUNC_LENGTH;
		}

}
  
