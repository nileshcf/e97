package com.cloudframe.app.vsammon1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] eofSw = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEofSw(fillSpace(1));
    }


 

	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException{
   		return eofSw;
   }

  
	/**
	*  set variable eofSw
	*  Corresponding COBOL Variable is WS-EOF-SW
	*  @param value
	**/
   public void setEofSw(char[] value) {
       value = checkEofSwConstraints(value);
       arraycopy(value,0,eofSw,0,value.length);
   } 
	public void setEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofSw,0,beginIndex + endIndex);
   }
	char[] endOfMonitor88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfMonitor()
	 *	@return  Returns true if isEndOfMonitor() is "Y"
	 */
   public boolean isEndOfMonitor() throws CFException {
      return (  compareChars( getEofSw() , endOfMonitor88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfMonitorTrue() {  			
    	setEofSw( endOfMonitor88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
