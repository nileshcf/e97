package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102OldElementId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip002102OldElementId extends Ip002102OldElementIdSerialized { 
   

								private short ip002102OldElementType;

								private short ip002102OldElementNo;
	
	/**
	* Constructor for Ip002102OldElementId
	**/
    public Ip002102OldElementId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip002102OldElementId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102OldElementId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip002102OldElementType
	 *	@return ip002102OldElementType
	 */
	public short getIp002102OldElementType() throws CFException {
        if (isIp002102OldElementTypeModified()) { 
           ip002102OldElementType = refreshIp002102OldElementType();
        }
   		return ip002102OldElementType;
	}
	
	/**
	 * 	Update Ip002102OldElementType with the passed value
	 *  Corresponding COBOL Variable is IP002102-OLD-ELEMENT-TYPE
	 *	@param number
	 */
	public void setIp002102OldElementType(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102OldElementType = checkIp002102OldElementTypeMaxLimit(number); 
		serializeIp002102OldElementType(ip002102OldElementType);
	}

	public void setIp002102OldElementType(int number) {
	    number = checkIp002102OldElementTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102OldElementType((short)number);
	}
	public void setIp002102OldElementType(long number) {
	    number = checkIp002102OldElementTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102OldElementType((short)number);
	}
	

	
	/**
	 *	Test condition 2 for isIp002102ItWasADe()
	 *	@return  Returns true if isIp002102ItWasADe() is 2
	 */
   public boolean isIp002102ItWasADe() throws CFException {
      return (  getIp002102OldElementType()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp002102ItWasADeTrue() {  			
    	setIp002102OldElementType( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isIp002102ItWasAPds()
	 *	@return  Returns true if isIp002102ItWasAPds() is 3
	 */
   public boolean isIp002102ItWasAPds() throws CFException {
      return (  getIp002102OldElementType()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIp002102ItWasAPdsTrue() {  			
    	setIp002102OldElementType( (short)3);
   	}
	/**
	 *	Returns the value of ip002102OldElementNo
	 *	@return ip002102OldElementNo
	 */
	public short getIp002102OldElementNo() throws CFException {
        if (isIp002102OldElementNoModified()) { 
           ip002102OldElementNo = refreshIp002102OldElementNo();
        }
   		return ip002102OldElementNo;
	}
	
	/**
	 * 	Update Ip002102OldElementNo with the passed value
	 *  Corresponding COBOL Variable is IP002102-OLD-ELEMENT-NO
	 *	@param number
	 */
	public void setIp002102OldElementNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102OldElementNo = checkIp002102OldElementNoMaxLimit(number); 
		serializeIp002102OldElementNo(ip002102OldElementNo);
	}

	public void setIp002102OldElementNo(int number) {
	    number = checkIp002102OldElementNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102OldElementNo((short)number);
	}
	public void setIp002102OldElementNo(long number) {
	    number = checkIp002102OldElementNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102OldElementNo((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip002102OldElementId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp002102OldElementType((short)0);
         	setIp002102OldElementNo((short)0);
   }

		public static int getIp002102OldElementIdFieldLength() {
			return IP_002102_OLD_ELEMENT_ID_LENGTH;
		}

}
  
