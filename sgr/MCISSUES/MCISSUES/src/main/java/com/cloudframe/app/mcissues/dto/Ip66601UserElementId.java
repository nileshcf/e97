package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip66601UserElementId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip66601UserElementId extends Ip66601UserElementIdSerialized { 
   

								private short ip66601UserTagType;

								private short ip66601UserTagNo;
	
	/**
	* Constructor for Ip66601UserElementId
	**/
    public Ip66601UserElementId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66601UserElementId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserElementId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip66601UserTagType
	 *	@return ip66601UserTagType
	 */
	public short getIp66601UserTagType() throws CFException {
        if (isIp66601UserTagTypeModified()) { 
           ip66601UserTagType = refreshIp66601UserTagType();
        }
   		return ip66601UserTagType;
	}
	
	/**
	 * 	Update Ip66601UserTagType with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TAG-TYPE
	 *	@param number
	 */
	public void setIp66601UserTagType(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagType = checkIp66601UserTagTypeMaxLimit(number); 
		serializeIp66601UserTagType(ip66601UserTagType);
	}

	public void setIp66601UserTagType(int number) {
	    number = checkIp66601UserTagTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagType((short)number);
	}
	public void setIp66601UserTagType(long number) {
	    number = checkIp66601UserTagTypeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagType((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isIp66601UserMtiTag()
	 *	@return  Returns true if isIp66601UserMtiTag() is 1
	 */
   public boolean isIp66601UserMtiTag() throws CFException {
      return (  getIp66601UserTagType()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIp66601UserMtiTagTrue() {  			
    	setIp66601UserTagType( (short)1);
   	}
	
	/**
	 *	Test condition 2 for isIp66601UserDeTag()
	 *	@return  Returns true if isIp66601UserDeTag() is 2
	 */
   public boolean isIp66601UserDeTag() throws CFException {
      return (  getIp66601UserTagType()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp66601UserDeTagTrue() {  			
    	setIp66601UserTagType( (short)2);
   	}
	
	/**
	 *	Test condition 3 for isIp66601UserPdsTag()
	 *	@return  Returns true if isIp66601UserPdsTag() is 3
	 */
   public boolean isIp66601UserPdsTag() throws CFException {
      return (  getIp66601UserTagType()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIp66601UserPdsTagTrue() {  			
    	setIp66601UserTagType( (short)3);
   	}
	
	/**
	 *	Test condition 1 2 3 for isIp66601UserTagTypeValid()
	 *	@return  Returns true if isIp66601UserTagTypeValid() is 1 2 3
	 */
   public boolean isIp66601UserTagTypeValid() throws CFException {
      return (  getIp66601UserTagType()  ==  1  ||  getIp66601UserTagType()  ==  2  ||  getIp66601UserTagType()  ==  3  );
   }


	/**
	*  set values 1 2 3
	*/
   	public void setIp66601UserTagTypeValidTrue() {  			
    	setIp66601UserTagType( (short)1);
   	}
	/**
	 *	Returns the value of ip66601UserTagNo
	 *	@return ip66601UserTagNo
	 */
	public short getIp66601UserTagNo() throws CFException {
        if (isIp66601UserTagNoModified()) { 
           ip66601UserTagNo = refreshIp66601UserTagNo();
        }
   		return ip66601UserTagNo;
	}
	
	/**
	 * 	Update Ip66601UserTagNo with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TAG-NO
	 *	@param number
	 */
	public void setIp66601UserTagNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagNo = checkIp66601UserTagNoMaxLimit(number); 
		serializeIp66601UserTagNo(ip66601UserTagNo);
	}

	public void setIp66601UserTagNo(int number) {
	    number = checkIp66601UserTagNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagNo((short)number);
	}
	public void setIp66601UserTagNo(long number) {
	    number = checkIp66601UserTagNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagNo((short)number);
	}
	

	
	/**
	 *	Test condition 0 THROUGH 128 for isIp66601UserDeNoValid()
	 *	@return  Returns true if isIp66601UserDeNoValid() is 0 THROUGH 128
	 */
   public boolean isIp66601UserDeNoValid() throws CFException {
      return (   (getIp66601UserTagNo()  >=  0 ) &&   (getIp66601UserTagNo()  <=  128 )   );
   }


	/**
	*  set values 0 THROUGH 128
	*/
   	public void setIp66601UserDeNoValidTrue() {  			
    	setIp66601UserTagNo( (short)0);
   	}

	
	
	

		public static int getIp66601UserElementIdFieldLength() {
			return IP_66601_USER_ELEMENT_ID_LENGTH;
		}

}
  
