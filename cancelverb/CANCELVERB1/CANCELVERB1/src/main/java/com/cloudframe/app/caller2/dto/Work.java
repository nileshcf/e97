package com.cloudframe.app.caller2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.caller2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] prog = new char[8];

						private char[] prog1 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setProg(("CALLED3 ").toCharArray());
								setProg1(("CALLED3 ").toCharArray());
    }


 

	/**
	 *	Returns the value of prog
	 *	@return prog
	 */
   public char[] getProg() throws CFException{
   		return prog;
   }

  
	/**
	*  set variable prog
	*  Corresponding COBOL Variable is WS-PROG
	*  @param value
	**/
   public void setProg(char[] value) {
       value = checkProgConstraints(value);
       arraycopy(value,0,prog,0,value.length);
   } 
	public void setProg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prog,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prog1
	 *	@return prog1
	 */
   public char[] getProg1() throws CFException{
   		return prog1;
   }

  
	/**
	*  set variable prog1
	*  Corresponding COBOL Variable is WS-PROG1
	*  @param value
	**/
   public void setProg1(char[] value) {
       value = checkProg1Constraints(value);
       arraycopy(value,0,prog1,0,value.length);
   } 
	public void setProg1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prog1,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
