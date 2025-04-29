package com.cloudframe.app.mc158.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.mc158.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] normalIpmMsg = new char[50];

								private short posS;

								private short posL;

						private char[] val1 = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNormalIpmMsg(("1644                ABCD                          ").toCharArray());
								setVal1(("1").toCharArray());
    }


 

	/**
	 *	Returns the value of normalIpmMsg
	 *	@return normalIpmMsg
	 */
   public char[] getNormalIpmMsg() throws CFException{
   		return normalIpmMsg;
   }

  
	/**
	*  set variable normalIpmMsg
	*  Corresponding COBOL Variable is WS-NORMAL-IPM-MSG
	*  @param value
	**/
   public void setNormalIpmMsg(char[] value) {
       value = checkNormalIpmMsgConstraints(value);
       arraycopy(value,0,normalIpmMsg,0,value.length);
   } 
	public void setNormalIpmMsg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,normalIpmMsg,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of posS
	 *	@return posS
	 */
	public short getPosS() throws CFException {
   		return posS;
	}
	
	/**
	 * 	Update PosS with the passed value
	 *  Corresponding COBOL Variable is WS-POS-S
	 *	@param number
	 */
	public void setPosS(short number) {
	     // Truncate if the number is beyond +/- Max range
	    posS = checkPosSMaxLimit(number); 
	}

	public void setPosS(int number) {
	    number = checkPosSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPosS((short)number);
	}
	public void setPosS(long number) {
	    number = checkPosSMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPosS((short)number);
	}
	

	/**
	 *	Returns the value of posL
	 *	@return posL
	 */
	public short getPosL() throws CFException {
   		return posL;
	}
	
	/**
	 * 	Update PosL with the passed value
	 *  Corresponding COBOL Variable is WS-POS-L
	 *	@param number
	 */
	public void setPosL(short number) {
	     // Truncate if the number is beyond +/- Max range
	    posL = checkPosLMaxLimit(number); 
	}

	public void setPosL(int number) {
	    number = checkPosLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPosL((short)number);
	}
	public void setPosL(long number) {
	    number = checkPosLMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPosL((short)number);
	}
	

	/**
	 *	Returns the value of val1
	 *	@return val1
	 */
   public char[] getVal1() throws CFException{
   		return val1;
   }

  
	/**
	*  set variable val1
	*  Corresponding COBOL Variable is WS-VAL-1
	*  @param value
	**/
   public void setVal1(char[] value) {
       value = checkVal1Constraints(value);
       arraycopy(value,0,val1,0,value.length);
   } 
	public void setVal1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val1,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
