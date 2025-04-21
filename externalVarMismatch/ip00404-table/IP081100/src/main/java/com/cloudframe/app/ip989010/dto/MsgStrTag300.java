package com.cloudframe.app.ip989010.dto;

/**
*  The class MsgStrTag300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MsgStrTag300 extends MsgStrTag300Serialized {
   


								private int msgStrMti300;

	
	/**
	* Constructor for MsgStrTag300
	**/
    public MsgStrTag300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("<msg mti=\"").toCharArray()
             , getStartOffset() + 0
             ,10
             );
								setMsgStrMti300(0);
       replaceValue( // serialize and save the value
             ("\">").toCharArray()
             , getStartOffset() + 14
             ,2
             );
    }


 

	/**
	 *	Returns the value of msgStrMti300
	 *	@return msgStrMti300
	 */
	public int getMsgStrMti300() throws CFException {
       if (isMsgStrMti300Modified()) { 
           msgStrMti300 = refreshMsgStrMti300();
        }
   		return msgStrMti300;
	}
	

	
	   
	/**
	 * 	Update MsgStrMti300 with the passed value
	 *  Corresponding COBOL Variable is 300-MSG-STR-MTI
	 *	@param number
	 */
	public void setMsgStrMti300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msgStrMti300 = checkMsgStrMti300MaxLimit(number); 
		serializeMsgStrMti300(msgStrMti300);
	}
	

	public void setMsgStrMti300(long number) {
	    number = checkMsgStrMti300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsgStrMti300((int)number);
	}
	
	/**
	 * 	Update MsgStrMti300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsgStrMti300(char[] value) throws CFException {
		 msgStrMti300 = serializeMsgStrMti300(value);
	}
	/**
	 * 	Update MsgStrMti300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsgStrMti300String(char[] value) throws CFException {
		 setMsgStrMti300(value);
	}

	
	
	

		public static int getMsgStrTag300FieldLength() {
			return MSG_STR_TAG_300_LENGTH;
		}

}
  
