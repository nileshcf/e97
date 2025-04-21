package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102NewElementId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip002102NewElementId extends Ip002102NewElementIdSerialized { 
   

								private short ip002102NewElementType;

								private short ip002102NewElementNo;
	
	/**
	* Constructor for Ip002102NewElementId
	**/
    public Ip002102NewElementId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip002102NewElementId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102NewElementId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip002102NewElementType
	 *	@return ip002102NewElementType
	 */
	public short getIp002102NewElementType() throws CFException {
        if (isIp002102NewElementTypeModified()) { 
           ip002102NewElementType = refreshIp002102NewElementType();
        }
   		return ip002102NewElementType;
	}
	
	/**
	 * 	Update Ip002102NewElementType with the passed value
	 *  Corresponding COBOL Variable is IP002102-NEW-ELEMENT-TYPE
	 *	@param number
	 */
	public void setIp002102NewElementType(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102NewElementType = checkIp002102NewElementTypeMaxLimit(number); 
		serializeIp002102NewElementType(ip002102NewElementType);
	}

	public void setIp002102NewElementType(int number) {
	    number = checkIp002102NewElementTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102NewElementType((short)number);
	}
	public void setIp002102NewElementType(long number) {
	    number = checkIp002102NewElementTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102NewElementType((short)number);
	}
	

	
	/**
	 *	Test condition 2 for isIp002102ItIsADe()
	 *	@return  Returns true if isIp002102ItIsADe() is 2
	 */
   public boolean isIp002102ItIsADe() throws CFException {
      return (  getIp002102NewElementType()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp002102ItIsADeTrue() {  			
    	setIp002102NewElementType( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isIp002102ItIsAPds()
	 *	@return  Returns true if isIp002102ItIsAPds() is 3
	 */
   public boolean isIp002102ItIsAPds() throws CFException {
      return (  getIp002102NewElementType()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIp002102ItIsAPdsTrue() {  			
    	setIp002102NewElementType( (short)3);
   	}
	/**
	 *	Returns the value of ip002102NewElementNo
	 *	@return ip002102NewElementNo
	 */
	public short getIp002102NewElementNo() throws CFException {
        if (isIp002102NewElementNoModified()) { 
           ip002102NewElementNo = refreshIp002102NewElementNo();
        }
   		return ip002102NewElementNo;
	}
	
	/**
	 * 	Update Ip002102NewElementNo with the passed value
	 *  Corresponding COBOL Variable is IP002102-NEW-ELEMENT-NO
	 *	@param number
	 */
	public void setIp002102NewElementNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip002102NewElementNo = checkIp002102NewElementNoMaxLimit(number); 
		serializeIp002102NewElementNo(ip002102NewElementNo);
	}

	public void setIp002102NewElementNo(int number) {
	    number = checkIp002102NewElementNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102NewElementNo((short)number);
	}
	public void setIp002102NewElementNo(long number) {
	    number = checkIp002102NewElementNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp002102NewElementNo((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip002102NewElementId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp002102NewElementType((short)0);
         	setIp002102NewElementNo((short)0);
   }

		public static int getIp002102NewElementIdFieldLength() {
			return IP_002102_NEW_ELEMENT_ID_LENGTH;
		}

}
  
