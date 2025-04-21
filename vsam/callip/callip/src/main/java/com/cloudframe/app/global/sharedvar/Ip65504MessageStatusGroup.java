package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504MessageStatusGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip65504MessageStatusGroup")

public class Ip65504MessageStatusGroup extends Ip65504MessageStatusGroupSerialized  implements InitializingBean {
   

								private short ip65504MessageStatus;
	
	/**
	* Constructor for Ip65504MessageStatusGroup
	**/
    public Ip65504MessageStatusGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip65504MessageStatus
	 *	@return ip65504MessageStatus
	 */
	public short getIp65504MessageStatus() throws CFException {
        if (isIp65504MessageStatusModified()) { 
           ip65504MessageStatus = refreshIp65504MessageStatus();
        }
   		return ip65504MessageStatus;
	}
	
	/**
	 * 	Update Ip65504MessageStatus with the passed value
	 *  Corresponding COBOL Variable is IP65504-MESSAGE-STATUS
	 *	@param number
	 */
	public void setIp65504MessageStatus(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504MessageStatus = checkIp65504MessageStatusMaxLimit(number); 
		serializeIp65504MessageStatus(ip65504MessageStatus);
	}

	public void setIp65504MessageStatus(int number) {
	    number = checkIp65504MessageStatusMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504MessageStatus((short)number);
	}
	public void setIp65504MessageStatus(long number) {
	    number = checkIp65504MessageStatusMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504MessageStatus((short)number);
	}
	

	
	/**
	 *	Test condition 990 for isIp65504TooManyTags()
	 *	@return  Returns true if isIp65504TooManyTags() is 990
	 */
   public boolean isIp65504TooManyTags() throws CFException {
      return (  getIp65504MessageStatus()  ==  990  );
   }


	/**
	*  set values 990
	*/
   	public void setIp65504TooManyTagsTrue() {  			
    	setIp65504MessageStatus( (short)990);
   	}
	
	/**
	 *	Test condition 991 for isIp65504NoPdsDefined()
	 *	@return  Returns true if isIp65504NoPdsDefined() is 991
	 */
   public boolean isIp65504NoPdsDefined() throws CFException {
      return (  getIp65504MessageStatus()  ==  991  );
   }


	/**
	*  set values 991
	*/
   	public void setIp65504NoPdsDefinedTrue() {  			
    	setIp65504MessageStatus( (short)991);
   	}
	
	/**
	 *	Test condition 992 for isIp65504NoSlashAtEnd()
	 *	@return  Returns true if isIp65504NoSlashAtEnd() is 992
	 */
   public boolean isIp65504NoSlashAtEnd() throws CFException {
      return (  getIp65504MessageStatus()  ==  992  );
   }


	/**
	*  set values 992
	*/
   	public void setIp65504NoSlashAtEndTrue() {  			
    	setIp65504MessageStatus( (short)992);
   	}
	
	/**
	 *	Test condition 993 for isIp65504MissingDe1()
	 *	@return  Returns true if isIp65504MissingDe1() is 993
	 */
   public boolean isIp65504MissingDe1() throws CFException {
      return (  getIp65504MessageStatus()  ==  993  );
   }


	/**
	*  set values 993
	*/
   	public void setIp65504MissingDe1True() {  			
    	setIp65504MessageStatus( (short)993);
   	}
	
	/**
	 *	Test condition 994 for isIp65504NonNumericPdsId()
	 *	@return  Returns true if isIp65504NonNumericPdsId() is 994
	 */
   public boolean isIp65504NonNumericPdsId() throws CFException {
      return (  getIp65504MessageStatus()  ==  994  );
   }


	/**
	*  set values 994
	*/
   	public void setIp65504NonNumericPdsIdTrue() {  			
    	setIp65504MessageStatus( (short)994);
   	}
	
	/**
	 *	Test condition 987 for isIp65504DuplicatePds()
	 *	@return  Returns true if isIp65504DuplicatePds() is 987
	 */
   public boolean isIp65504DuplicatePds() throws CFException {
      return (  getIp65504MessageStatus()  ==  987  );
   }


	/**
	*  set values 987
	*/
   	public void setIp65504DuplicatePdsTrue() {  			
    	setIp65504MessageStatus( (short)987);
   	}
	
	/**
	 *	Test condition 996 for isIp65504BadTagNo()
	 *	@return  Returns true if isIp65504BadTagNo() is 996
	 */
   public boolean isIp65504BadTagNo() throws CFException {
      return (  getIp65504MessageStatus()  ==  996  );
   }


	/**
	*  set values 996
	*/
   	public void setIp65504BadTagNoTrue() {  			
    	setIp65504MessageStatus( (short)996);
   	}
	
	/**
	 *	Test condition 997 for isIp65504NonNumericLngth()
	 *	@return  Returns true if isIp65504NonNumericLngth() is 997
	 */
   public boolean isIp65504NonNumericLngth() throws CFException {
      return (  getIp65504MessageStatus()  ==  997  );
   }


	/**
	*  set values 997
	*/
   	public void setIp65504NonNumericLngthTrue() {  			
    	setIp65504MessageStatus( (short)997);
   	}
	
	/**
	 *	Test condition 115 for isIp65504Carrier48TooShort()
	 *	@return  Returns true if isIp65504Carrier48TooShort() is 115
	 */
   public boolean isIp65504Carrier48TooShort() throws CFException {
      return (  getIp65504MessageStatus()  ==  115  );
   }


	/**
	*  set values 115
	*/
   	public void setIp65504Carrier48TooShortTrue() {  			
    	setIp65504MessageStatus( (short)115);
   	}
	
	/**
	 *	Test condition 166 for isIp65504Carrier62TooShort()
	 *	@return  Returns true if isIp65504Carrier62TooShort() is 166
	 */
   public boolean isIp65504Carrier62TooShort() throws CFException {
      return (  getIp65504MessageStatus()  ==  166  );
   }


	/**
	*  set values 166
	*/
   	public void setIp65504Carrier62TooShortTrue() {  			
    	setIp65504MessageStatus( (short)166);
   	}
	
	/**
	 *	Test condition 171 for isIp65504Carrier123TooShort()
	 *	@return  Returns true if isIp65504Carrier123TooShort() is 171
	 */
   public boolean isIp65504Carrier123TooShort() throws CFException {
      return (  getIp65504MessageStatus()  ==  171  );
   }


	/**
	*  set values 171
	*/
   	public void setIp65504Carrier123TooShortTrue() {  			
    	setIp65504MessageStatus( (short)171);
   	}
	
	/**
	 *	Test condition 2152 for isIp65504Carrier124TooShort()
	 *	@return  Returns true if isIp65504Carrier124TooShort() is 2152
	 */
   public boolean isIp65504Carrier124TooShort() throws CFException {
      return (  getIp65504MessageStatus()  ==  2152  );
   }


	/**
	*  set values 2152
	*/
   	public void setIp65504Carrier124TooShortTrue() {  			
    	setIp65504MessageStatus( (short)2152);
   	}
	
	/**
	 *	Test condition 176 for isIp65504Carrier125TooShort()
	 *	@return  Returns true if isIp65504Carrier125TooShort() is 176
	 */
   public boolean isIp65504Carrier125TooShort() throws CFException {
      return (  getIp65504MessageStatus()  ==  176  );
   }


	/**
	*  set values 176
	*/
   	public void setIp65504Carrier125TooShortTrue() {  			
    	setIp65504MessageStatus( (short)176);
   	}

	
	
	

		public static int getIp65504MessageStatusGroupFieldLength() {
			return IP_65504_MESSAGE_STATUS_GROUP_LENGTH;
		}

}
  
