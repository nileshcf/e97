package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1ErrorIndex is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip2ooo1ErrorIndex extends Ip2ooo1ErrorIndexSerialized { 
   

								private int ip2ooo1ErrorMsgSevCd;

								private int ip2ooo1ErrorNumber;
	
	/**
	* Constructor for Ip2ooo1ErrorIndex
	**/
    public Ip2ooo1ErrorIndex() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip2ooo1ErrorIndex. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorIndex(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip2ooo1ErrorMsgSevCd
	 *	@return ip2ooo1ErrorMsgSevCd
	 */
	public int getIp2ooo1ErrorMsgSevCd() throws CFException {
       if (isIp2ooo1ErrorMsgSevCdModified()) { 
           ip2ooo1ErrorMsgSevCd = refreshIp2ooo1ErrorMsgSevCd();
        }
   		return ip2ooo1ErrorMsgSevCd;
	}
	

	
	   
	/**
	 * 	Update Ip2ooo1ErrorMsgSevCd with the passed value
	 *  Corresponding COBOL Variable is IP2OOO1-ERROR-MSG-SEV-CD
	 *	@param number
	 */
	public void setIp2ooo1ErrorMsgSevCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip2ooo1ErrorMsgSevCd = checkIp2ooo1ErrorMsgSevCdMaxLimit(number); 
		serializeIp2ooo1ErrorMsgSevCd(ip2ooo1ErrorMsgSevCd);
	}
	

	public void setIp2ooo1ErrorMsgSevCd(long number) {
	    number = checkIp2ooo1ErrorMsgSevCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp2ooo1ErrorMsgSevCd((int)number);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorMsgSevCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgSevCd(char[] value) throws CFException {
		 ip2ooo1ErrorMsgSevCd = serializeIp2ooo1ErrorMsgSevCd(value);
	}
	/**
	 * 	Update Ip2ooo1ErrorMsgSevCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorMsgSevCdString(char[] value) throws CFException {
		 setIp2ooo1ErrorMsgSevCd(value);
	}
	/**
	 *	Returns the value of ip2ooo1ErrorNumber
	 *	@return ip2ooo1ErrorNumber
	 */
	public int getIp2ooo1ErrorNumber() throws CFException {
       if (isIp2ooo1ErrorNumberModified()) { 
           ip2ooo1ErrorNumber = refreshIp2ooo1ErrorNumber();
        }
   		return ip2ooo1ErrorNumber;
	}
	

	
	   
	/**
	 * 	Update Ip2ooo1ErrorNumber with the passed value
	 *  Corresponding COBOL Variable is IP2OOO1-ERROR-NUMBER
	 *	@param number
	 */
	public void setIp2ooo1ErrorNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip2ooo1ErrorNumber = checkIp2ooo1ErrorNumberMaxLimit(number); 
		serializeIp2ooo1ErrorNumber(ip2ooo1ErrorNumber);
	}
	

	public void setIp2ooo1ErrorNumber(long number) {
	    number = checkIp2ooo1ErrorNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp2ooo1ErrorNumber((int)number);
	}
	
	/**
	 * 	Update Ip2ooo1ErrorNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorNumber(char[] value) throws CFException {
		 ip2ooo1ErrorNumber = serializeIp2ooo1ErrorNumber(value);
	}
	/**
	 * 	Update Ip2ooo1ErrorNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp2ooo1ErrorNumberString(char[] value) throws CFException {
		 setIp2ooo1ErrorNumber(value);
	}

	
	
	
	/**
	 * 	initializes Ip2ooo1ErrorIndex
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp2ooo1ErrorMsgSevCd(0);
                     setIp2ooo1ErrorNumber(0);
   }

		public static int getIp2ooo1ErrorIndexFieldLength() {
			return IP_2OOO_1_ERROR_INDEX_LENGTH;
		}

}
  
