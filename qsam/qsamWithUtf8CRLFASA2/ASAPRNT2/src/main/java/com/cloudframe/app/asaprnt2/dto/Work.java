package com.cloudframe.app.asaprnt2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:55. using version 5.0.0.254
**/


import com.cloudframe.app.asaprnt2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private short lineSpace;

						private char[] reprec = Field.fillLowValue(287);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lineSpace
	 *	@return lineSpace
	 */
	public short getLineSpace() throws CFException {
   		return lineSpace;
	}
	
	/**
	 * 	Update LineSpace with the passed value
	 *  Corresponding COBOL Variable is LINE-SPACE
	 *	@param number
	 */
	public void setLineSpace(short number) {
	     // Truncate if the number is beyond +/- Max range
	    lineSpace = checkLineSpaceMaxLimit(number); 
	}

	public void setLineSpace(int number) {
	    number = checkLineSpaceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLineSpace((short)number);
	}
	public void setLineSpace(long number) {
	    number = checkLineSpaceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLineSpace((short)number);
	}
	

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */
   public char[] getReprec() throws CFException{
   		return reprec;
   }

  
	/**
	*  set variable reprec
	*  Corresponding COBOL Variable is WS-REPREC
	*  @param value
	**/
   public void setReprec(char[] value) {
       value = checkReprecConstraints(value);
       arraycopy(value,0,reprec,0,value.length);
   } 
	public void setReprec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,reprec,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
