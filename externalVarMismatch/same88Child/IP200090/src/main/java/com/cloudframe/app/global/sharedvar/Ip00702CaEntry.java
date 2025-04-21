package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00702CaEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00702CaEntry extends Ip00702CaEntrySerialized { 
   

								private short ip00702CaStart;

								private short ip00702CaLength;
	
	/**
	* Constructor for Ip00702CaEntry
	**/
    public Ip00702CaEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00702CaEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00702CaEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00702CaStart
	 *	@return ip00702CaStart
	 */
	public short getIp00702CaStart() throws CFException {
        if (isIp00702CaStartModified()) { 
           ip00702CaStart = refreshIp00702CaStart();
        }
   		return ip00702CaStart;
	}
	
	/**
	 * 	Update Ip00702CaStart with the passed value
	 *  Corresponding COBOL Variable is IP00702-CA-START
	 *	@param number
	 */
	public void setIp00702CaStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00702CaStart = checkIp00702CaStartMaxLimit(number); 
		serializeIp00702CaStart(ip00702CaStart);
	}

	public void setIp00702CaStart(int number) {
	    number = checkIp00702CaStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00702CaStart((short)number);
	}
	public void setIp00702CaStart(long number) {
	    number = checkIp00702CaStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00702CaStart((short)number);
	}
	

	/**
	 *	Returns the value of ip00702CaLength
	 *	@return ip00702CaLength
	 */
	public short getIp00702CaLength() throws CFException {
        if (isIp00702CaLengthModified()) { 
           ip00702CaLength = refreshIp00702CaLength();
        }
   		return ip00702CaLength;
	}
	
	/**
	 * 	Update Ip00702CaLength with the passed value
	 *  Corresponding COBOL Variable is IP00702-CA-LENGTH
	 *	@param number
	 */
	public void setIp00702CaLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00702CaLength = checkIp00702CaLengthMaxLimit(number); 
		serializeIp00702CaLength(ip00702CaLength);
	}

	public void setIp00702CaLength(int number) {
	    number = checkIp00702CaLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00702CaLength((short)number);
	}
	public void setIp00702CaLength(long number) {
	    number = checkIp00702CaLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00702CaLength((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip00702CaEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp00702CaStart((short)0);
         	setIp00702CaLength((short)0);
   }

		public static int getIp00702CaEntryFieldLength() {
			return IP_00702_CA_ENTRY_LENGTH;
		}

}
  
