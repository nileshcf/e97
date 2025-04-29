package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip65504TagId extends Ip65504TagIdSerialized { 
   

								private short ip65504TagType;

								private short ip65504TagNo;
	
	/**
	* Constructor for Ip65504TagId
	**/
    public Ip65504TagId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504TagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504TagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip65504TagType
	 *	@return ip65504TagType
	 */
	public short getIp65504TagType() throws CFException {
        if (isIp65504TagTypeModified()) { 
           ip65504TagType = refreshIp65504TagType();
        }
   		return ip65504TagType;
	}
	
	/**
	 * 	Update Ip65504TagType with the passed value
	 *  Corresponding COBOL Variable is IP65504-TAG-TYPE
	 *	@param number
	 */
	public void setIp65504TagType(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504TagType = checkIp65504TagTypeMaxLimit(number); 
		serializeIp65504TagType(ip65504TagType);
	}

	public void setIp65504TagType(int number) {
	    number = checkIp65504TagTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagType((short)number);
	}
	public void setIp65504TagType(long number) {
	    number = checkIp65504TagTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagType((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isIp6550488MtiTag()
	 *	@return  Returns true if isIp6550488MtiTag() is 1
	 */
   public boolean isIp6550488MtiTag() throws CFException {
      return (  getIp65504TagType()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIp6550488MtiTagTrue() {  			
    	setIp65504TagType( (short)1);
   	}
	
	/**
	 *	Test condition 2 for isIp6550488DeTag()
	 *	@return  Returns true if isIp6550488DeTag() is 2
	 */
   public boolean isIp6550488DeTag() throws CFException {
      return (  getIp65504TagType()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp6550488DeTagTrue() {  			
    	setIp65504TagType( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isIp6550488PdsTag()
	 *	@return  Returns true if isIp6550488PdsTag() is 3
	 */
   public boolean isIp6550488PdsTag() throws CFException {
      return (  getIp65504TagType()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIp6550488PdsTagTrue() {  			
    	setIp65504TagType( (short)3);
   	}
	
	/**
	 *	Test condition 1 2 3 for isIp6550488TagTypeValid()
	 *	@return  Returns true if isIp6550488TagTypeValid() is 1 2 3
	 */
   public boolean isIp6550488TagTypeValid() throws CFException {
      return (  getIp65504TagType()  ==  1  ||  getIp65504TagType()  ==  2  ||  getIp65504TagType()  ==  3  );
   }


	/**
	*  set values 1 2 3
	*/
   	public void setIp6550488TagTypeValidTrue() {  			
    	setIp65504TagType( (short)1);
   	}
	/**
	 *	Returns the value of ip65504TagNo
	 *	@return ip65504TagNo
	 */
	public short getIp65504TagNo() throws CFException {
        if (isIp65504TagNoModified()) { 
           ip65504TagNo = refreshIp65504TagNo();
        }
   		return ip65504TagNo;
	}
	
	/**
	 * 	Update Ip65504TagNo with the passed value
	 *  Corresponding COBOL Variable is IP65504-TAG-NO
	 *	@param number
	 */
	public void setIp65504TagNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504TagNo = checkIp65504TagNoMaxLimit(number); 
		serializeIp65504TagNo(ip65504TagNo);
	}

	public void setIp65504TagNo(int number) {
	    number = checkIp65504TagNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagNo((short)number);
	}
	public void setIp65504TagNo(long number) {
	    number = checkIp65504TagNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagNo((short)number);
	}
	

	
	/**
	 *	Test condition 1 THROUGH 128 for isIp6550488DeNoValid()
	 *	@return  Returns true if isIp6550488DeNoValid() is 1 THROUGH 128
	 */
   public boolean isIp6550488DeNoValid() throws CFException {
      return (   (getIp65504TagNo()  >=  1 ) &&   (getIp65504TagNo()  <=  128 )   );
   }


	/**
	*  set values 1 THROUGH 128
	*/
   	public void setIp6550488DeNoValidTrue() {  			
    	setIp65504TagNo( (short)1);
   	}

	
	
	
	/**
	 * 	initializes Ip65504TagId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp65504TagType((short)0);
         	setIp65504TagNo((short)0);
   }

		public static int getIp65504TagIdFieldLength() {
			return IP_65504_TAG_ID_LENGTH;
		}

}
  
