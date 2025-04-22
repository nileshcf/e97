package com.cloudframe.app.ar640010.dto;

/**
*  The class IdentityMsg601 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class IdentityMsg601 extends IdentityMsg601Serialized {
   


								private long identityRequest601;

	
	/**
	* Constructor for IdentityMsg601
	**/
    public IdentityMsg601() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0010-REQUEST NBR: ").toCharArray()
             , getStartOffset() + 0
             ,18
             );
								setIdentityRequest601(0L);
       replaceValue( // serialize and save the value
             (" STARTED").toCharArray()
             , getStartOffset() + 27
             ,8
             );
    }


 

	/**
	 *	Returns the value of identityRequest601
	 *	@return identityRequest601
	 */
	public long getIdentityRequest601() throws CFException {
       if (isIdentityRequest601Modified()) { 
           identityRequest601 = refreshIdentityRequest601();
        }
   		return identityRequest601;
	}
	

	
	   
	/**
	 * 	Update IdentityRequest601 with the passed value
	 *  Corresponding COBOL Variable is 601-IDENTITY-REQUEST
	 *	@param number
	 */
	public void setIdentityRequest601(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    identityRequest601 = checkIdentityRequest601MaxLimit(number); 
		serializeIdentityRequest601(identityRequest601);
	}
	

	/**
	 * 	Update IdentityRequest601 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdentityRequest601(char[] value) throws CFException {
		 identityRequest601 = serializeIdentityRequest601(value);
	}
	/**
	 * 	Update IdentityRequest601 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdentityRequest601String(char[] value) throws CFException {
		 setIdentityRequest601(value);
	}

	
	
	

		public static int getIdentityMsg601FieldLength() {
			return IDENTITY_MSG_601_LENGTH;
		}

}
  
