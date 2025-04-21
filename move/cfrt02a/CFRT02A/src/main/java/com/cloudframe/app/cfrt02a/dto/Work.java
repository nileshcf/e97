package com.cloudframe.app.cfrt02a.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.cfrt02a.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] theMessage = Field.fillLowValue(50);

						private char[] theDisplay = new char[605];

								private int theNumber;

						private char[] aSpace = Field.fillLowValue(1);

						private char[] stage = Field.fillLowValue(60);

								private short start;

								private short sub;

								private int inx;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTheDisplay(String.join("", java.util.Collections.nCopies(605, "-")).toCharArray());
								setStart((short)2);
								setInx(0);
    }


 

	/**
	 *	Returns the value of theMessage
	 *	@return theMessage
	 */
   public char[] getTheMessage() throws CFException{
   		return theMessage;
   }

  
	/**
	*  set variable theMessage
	*  Corresponding COBOL Variable is THE-MESSAGE
	*  @param value
	**/
   public void setTheMessage(char[] value) {
       value = checkTheMessageConstraints(value);
       arraycopy(value,0,theMessage,0,value.length);
   } 
	public void setTheMessage(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,theMessage,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of theDisplay
	 *	@return theDisplay
	 */
   public char[] getTheDisplay() throws CFException{
   		return theDisplay;
   }

  
	/**
	*  set variable theDisplay
	*  Corresponding COBOL Variable is THE-DISPLAY
	*  @param value
	**/
   public void setTheDisplay(char[] value) {
       value = checkTheDisplayConstraints(value);
       arraycopy(value,0,theDisplay,0,value.length);
   } 
	public void setTheDisplay(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,theDisplay,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of theNumber
	 *	@return theNumber
	 */
	public int getTheNumber() throws CFException {
       if (isTheNumberModified()) { 
           theNumber = refreshTheNumber();
        }
   		return theNumber;
	}
	

	
	   
	/**
	 * 	Update TheNumber with the passed value
	 *  Corresponding COBOL Variable is THE-NUMBER
	 *	@param number
	 */
	public void setTheNumber(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    theNumber = checkTheNumberMaxLimit(number); 
		serializeTheNumber(theNumber);
	}
	

	public void setTheNumber(long number) {
	    number = checkTheNumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTheNumber((int)number);
	}
	
	/**
	 * 	Update TheNumber with the passed value
	 *	@param value (String or char[])
	 */
	public void setTheNumber(char[] value) throws CFException {
		 theNumber = serializeTheNumber(value);
	}
	/**
	 * 	Update TheNumber with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTheNumberString(char[] value) throws CFException {
		 setTheNumber(value);
	}
	/**
	 *	Returns the value of aSpace
	 *	@return aSpace
	 */
   public char[] getASpace() throws CFException{
   		return aSpace;
   }

  
	/**
	*  set variable aSpace
	*  Corresponding COBOL Variable is A-SPACE
	*  @param value
	**/
   public void setASpace(char[] value) {
       value = checkASpaceConstraints(value);
       arraycopy(value,0,aSpace,0,value.length);
   } 
	public void setASpace(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,aSpace,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of stage
	 *	@return stage
	 */
   public char[] getStage() throws CFException{
   		return stage;
   }

  
	/**
	*  set variable stage
	*  Corresponding COBOL Variable is WS-STAGE
	*  @param value
	**/
   public void setStage(char[] value) {
       value = checkStageConstraints(value);
       arraycopy(value,0,stage,0,value.length);
   } 
	public void setStage(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,stage,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of start
	 *	@return start
	 */
	public short getStart() throws CFException {
   		return start;
	}
	
	/**
	 * 	Update Start with the passed value
	 *  Corresponding COBOL Variable is WS-START
	 *	@param number
	 */
	public void setStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    start = checkStartMaxLimit(number); 
	}

	public void setStart(int number) {
	    number = checkStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStart((short)number);
	}
	public void setStart(long number) {
	    number = checkStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStart((short)number);
	}
	

	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public short getSub() throws CFException {
   		return sub;
	}
	
	/**
	 * 	Update Sub with the passed value
	 *  Corresponding COBOL Variable is WS-SUB
	 *	@param number
	 */
	public void setSub(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub = checkSubMaxLimit(number); 
	}

	public void setSub(int number) {
	    number = checkSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub((short)number);
	}
	public void setSub(long number) {
	    number = checkSubMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub((short)number);
	}
	

	/**
	 *	Returns the value of inx
	 *	@return inx
	 */
	public int getInx() throws CFException {
       if (isInxModified()) { 
           inx = refreshInx();
        }
   		return inx;
	}
	

	
	   
	/**
	 * 	Update Inx with the passed value
	 *  Corresponding COBOL Variable is INX
	 *	@param number
	 */
	public void setInx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    inx = checkInxMaxLimit(number); 
		serializeInx(inx);
	}
	

	public void setInx(long number) {
	    number = checkInxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInx((int)number);
	}
	
	/**
	 * 	Update Inx with the passed value
	 *	@param value (String or char[])
	 */
	public void setInx(char[] value) throws CFException {
		 inx = serializeInx(value);
	}
	/**
	 * 	Update Inx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInxString(char[] value) throws CFException {
		 setInx(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
