package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331ErrorIndex is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip30331ErrorIndex extends Ip30331ErrorIndexSerialized { 
   

								private int ip30331ErrorMsgSevCd;

								private int ip30331ErrorNumber;
	
	/**
	* Constructor for Ip30331ErrorIndex
	**/
    public Ip30331ErrorIndex() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip30331ErrorIndex. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331ErrorIndex(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip30331ErrorMsgSevCd
	 *	@return ip30331ErrorMsgSevCd
	 */
	public int getIp30331ErrorMsgSevCd() throws CFException {
       if (isIp30331ErrorMsgSevCdModified()) { 
           ip30331ErrorMsgSevCd = refreshIp30331ErrorMsgSevCd();
        }
   		return ip30331ErrorMsgSevCd;
	}
	

	
	   
	/**
	 * 	Update Ip30331ErrorMsgSevCd with the passed value
	 *  Corresponding COBOL Variable is IP30331-ERROR-MSG-SEV-CD
	 *	@param number
	 */
	public void setIp30331ErrorMsgSevCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip30331ErrorMsgSevCd = checkIp30331ErrorMsgSevCdMaxLimit(number); 
		serializeIp30331ErrorMsgSevCd(ip30331ErrorMsgSevCd);
	}
	

	public void setIp30331ErrorMsgSevCd(long number) {
	    number = checkIp30331ErrorMsgSevCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp30331ErrorMsgSevCd((int)number);
	}
	
	/**
	 * 	Update Ip30331ErrorMsgSevCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp30331ErrorMsgSevCd(char[] value) throws CFException {
		 ip30331ErrorMsgSevCd = serializeIp30331ErrorMsgSevCd(value);
	}
	/**
	 * 	Update Ip30331ErrorMsgSevCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp30331ErrorMsgSevCdString(char[] value) throws CFException {
		 setIp30331ErrorMsgSevCd(value);
	}
	/**
	 *	Returns the value of ip30331ErrorNumber
	 *	@return ip30331ErrorNumber
	 */
	public int getIp30331ErrorNumber() throws CFException {
       if (isIp30331ErrorNumberModified()) { 
           ip30331ErrorNumber = refreshIp30331ErrorNumber();
        }
   		return ip30331ErrorNumber;
	}
	

	
	   
	/**
	 * 	Update Ip30331ErrorNumber with the passed value
	 *  Corresponding COBOL Variable is IP30331-ERROR-NUMBER
	 *	@param number
	 */
	public void setIp30331ErrorNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip30331ErrorNumber = checkIp30331ErrorNumberMaxLimit(number); 
		serializeIp30331ErrorNumber(ip30331ErrorNumber);
	}
	

	public void setIp30331ErrorNumber(long number) {
	    number = checkIp30331ErrorNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp30331ErrorNumber((int)number);
	}
	
	/**
	 * 	Update Ip30331ErrorNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp30331ErrorNumber(char[] value) throws CFException {
		 ip30331ErrorNumber = serializeIp30331ErrorNumber(value);
	}
	/**
	 * 	Update Ip30331ErrorNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp30331ErrorNumberString(char[] value) throws CFException {
		 setIp30331ErrorNumber(value);
	}

	
	
	
	/**
	 * 	initializes Ip30331ErrorIndex
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30331ErrorMsgSevCd(0);
                     setIp30331ErrorNumber(0);
   }

		public static int getIp30331ErrorIndexFieldLength() {
			return IP_30331_ERROR_INDEX_LENGTH;
		}

}
  
