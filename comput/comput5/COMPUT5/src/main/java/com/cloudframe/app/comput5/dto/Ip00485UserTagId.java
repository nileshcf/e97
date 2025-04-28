package com.cloudframe.app.comput5.dto;

/**
*  The class Ip00485UserTagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00485UserTagId extends Ip00485UserTagIdSerialized { 
   

								private short ip00485UserTagOccurrence;

								private short ip00485UserTagSubfldNo;

								private short ip00485MemberId;
	
	/**
	* Constructor for Ip00485UserTagId
	**/
    public Ip00485UserTagId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00485UserTagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00485UserTagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00485UserTagOccurrence
	 *	@return ip00485UserTagOccurrence
	 */
	public short getIp00485UserTagOccurrence() throws CFException {
        if (isIp00485UserTagOccurrenceModified()) { 
           ip00485UserTagOccurrence = refreshIp00485UserTagOccurrence();
        }
   		return ip00485UserTagOccurrence;
	}
	
	/**
	 * 	Update Ip00485UserTagOccurrence with the passed value
	 *  Corresponding COBOL Variable is IP00485-USER-TAG-OCCURRENCE
	 *	@param number
	 */
	public void setIp00485UserTagOccurrence(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00485UserTagOccurrence = checkIp00485UserTagOccurrenceMaxLimit(number); 
		serializeIp00485UserTagOccurrence(ip00485UserTagOccurrence);
	}

	public void setIp00485UserTagOccurrence(int number) {
	    number = checkIp00485UserTagOccurrenceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagOccurrence((short)number);
	}
	public void setIp00485UserTagOccurrence(long number) {
	    number = checkIp00485UserTagOccurrenceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagOccurrence((short)number);
	}
	

	/**
	 *	Returns the value of ip00485UserTagSubfldNo
	 *	@return ip00485UserTagSubfldNo
	 */
	public short getIp00485UserTagSubfldNo() throws CFException {
        if (isIp00485UserTagSubfldNoModified()) { 
           ip00485UserTagSubfldNo = refreshIp00485UserTagSubfldNo();
        }
   		return ip00485UserTagSubfldNo;
	}
	
	/**
	 * 	Update Ip00485UserTagSubfldNo with the passed value
	 *  Corresponding COBOL Variable is IP00485-USER-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setIp00485UserTagSubfldNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00485UserTagSubfldNo = checkIp00485UserTagSubfldNoMaxLimit(number); 
		serializeIp00485UserTagSubfldNo(ip00485UserTagSubfldNo);
	}

	public void setIp00485UserTagSubfldNo(int number) {
	    number = checkIp00485UserTagSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagSubfldNo((short)number);
	}
	public void setIp00485UserTagSubfldNo(long number) {
	    number = checkIp00485UserTagSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485UserTagSubfldNo((short)number);
	}
	

	/**
	 *	Returns the value of ip00485MemberId
	 *	@return ip00485MemberId
	 */
	public short getIp00485MemberId() throws CFException {
        if (isIp00485MemberIdModified()) { 
           ip00485MemberId = refreshIp00485MemberId();
        }
   		return ip00485MemberId;
	}
	
	/**
	 * 	Update Ip00485MemberId with the passed value
	 *  Corresponding COBOL Variable is IP00485-MEMBER-ID
	 *	@param number
	 */
	public void setIp00485MemberId(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00485MemberId = checkIp00485MemberIdMaxLimit(number); 
		serializeIp00485MemberId(ip00485MemberId);
	}

	public void setIp00485MemberId(int number) {
	    number = checkIp00485MemberIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485MemberId((short)number);
	}
	public void setIp00485MemberId(long number) {
	    number = checkIp00485MemberIdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00485MemberId((short)number);
	}
	


	
	
	

		public static int getIp00485UserTagIdFieldLength() {
			return IP_00485_USER_TAG_ID_LENGTH;
		}

}
  
