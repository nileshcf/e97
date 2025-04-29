package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4TagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip655o4TagId extends Ip655o4TagIdSerialized { 
   

								private short ip655o4TagType;

								private short ip655o4TagNo;
	
	/**
	* Constructor for Ip655o4TagId
	**/
    public Ip655o4TagId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip655o4TagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip655o4TagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip655o4TagType
	 *	@return ip655o4TagType
	 */
	public short getIp655o4TagType() throws CFException {
        if (isIp655o4TagTypeModified()) { 
           ip655o4TagType = refreshIp655o4TagType();
        }
   		return ip655o4TagType;
	}
	
	/**
	 * 	Update Ip655o4TagType with the passed value
	 *  Corresponding COBOL Variable is IP655O4-TAG-TYPE
	 *	@param number
	 */
	public void setIp655o4TagType(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip655o4TagType = checkIp655o4TagTypeMaxLimit(number); 
		serializeIp655o4TagType(ip655o4TagType);
	}

	public void setIp655o4TagType(int number) {
	    number = checkIp655o4TagTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp655o4TagType((short)number);
	}
	public void setIp655o4TagType(long number) {
	    number = checkIp655o4TagTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp655o4TagType((short)number);
	}
	

	/**
	 *	Returns the value of ip655o4TagNo
	 *	@return ip655o4TagNo
	 */
	public short getIp655o4TagNo() throws CFException {
        if (isIp655o4TagNoModified()) { 
           ip655o4TagNo = refreshIp655o4TagNo();
        }
   		return ip655o4TagNo;
	}
	
	/**
	 * 	Update Ip655o4TagNo with the passed value
	 *  Corresponding COBOL Variable is IP655O4-TAG-NO
	 *	@param number
	 */
	public void setIp655o4TagNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip655o4TagNo = checkIp655o4TagNoMaxLimit(number); 
		serializeIp655o4TagNo(ip655o4TagNo);
	}

	public void setIp655o4TagNo(int number) {
	    number = checkIp655o4TagNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp655o4TagNo((short)number);
	}
	public void setIp655o4TagNo(long number) {
	    number = checkIp655o4TagNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp655o4TagNo((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip655o4TagId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp655o4TagType((short)0);
         	setIp655o4TagNo((short)0);
   }

		public static int getIp655o4TagIdFieldLength() {
			return IP_655O_4_TAG_ID_LENGTH;
		}

}
  
