package com.cloudframe.app.wm002.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.wm002.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private int callCount;

								private int loopCount;

						private char[] switchWs = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCallCount(0);
								setSwitchWs(fillSpace(1));
    }


 

	/**
	 *	Returns the value of callCount
	 *	@return callCount
	 */
	public int getCallCount() throws CFException {
       if (isCallCountModified()) { 
           callCount = refreshCallCount();
        }
   		return callCount;
	}
	

	
	   
	/**
	 * 	Update CallCount with the passed value
	 *  Corresponding COBOL Variable is WS-CALL-COUNT
	 *	@param number
	 */
	public void setCallCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    callCount = checkCallCountMaxLimit(number); 
		serializeCallCount(callCount);
	}
	

	public void setCallCount(long number) {
	    number = checkCallCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCallCount((int)number);
	}
	
	/**
	 * 	Update CallCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setCallCount(char[] value) throws CFException {
		 callCount = serializeCallCount(value);
	}
	/**
	 * 	Update CallCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCallCountString(char[] value) throws CFException {
		 setCallCount(value);
	}
	/**
	 *	Returns the value of loopCount
	 *	@return loopCount
	 */
	public int getLoopCount() throws CFException {
       if (isLoopCountModified()) { 
           loopCount = refreshLoopCount();
        }
   		return loopCount;
	}
	

	
	   
	/**
	 * 	Update LoopCount with the passed value
	 *  Corresponding COBOL Variable is WS-LOOP-COUNT
	 *	@param number
	 */
	public void setLoopCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    loopCount = checkLoopCountMaxLimit(number); 
		serializeLoopCount(loopCount);
	}
	

	public void setLoopCount(long number) {
	    number = checkLoopCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setLoopCount((int)number);
	}
	
	/**
	 * 	Update LoopCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLoopCount(char[] value) throws CFException {
		 loopCount = serializeLoopCount(value);
	}
	/**
	 * 	Update LoopCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLoopCountString(char[] value) throws CFException {
		 setLoopCount(value);
	}
	/**
	 *	Returns the value of switchWs
	 *	@return switchWs
	 */
   public char[] getSwitchWs() throws CFException{
   		return switchWs;
   }

  
	/**
	*  set variable switchWs
	*  Corresponding COBOL Variable is WS-SWITCH
	*  @param value
	**/
   public void setSwitchWs(char[] value) {
       value = checkSwitchWsConstraints(value);
       arraycopy(value,0,switchWs,0,value.length);
   } 
	public void setSwitchWs(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,switchWs,0,beginIndex + endIndex);
   }
	char[] addDummyGoTo88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isAddDummyGoTo()
	 *	@return  Returns true if isAddDummyGoTo() is "D"
	 */
   public boolean isAddDummyGoTo() throws CFException {
      return (  compareChars( getSwitchWs() , addDummyGoTo88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setAddDummyGoToTrue() {  			
    	setSwitchWs( addDummyGoTo88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
