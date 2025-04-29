package com.cloudframe.app.mc082.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:23. using version 5.0.0.254
**/


import com.cloudframe.app.mc082.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] mc083Prog = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMc083Prog(("MC083   ").toCharArray());
    }


 

	/**
	 *	Returns the value of mc083Prog
	 *	@return mc083Prog
	 */
   public char[] getMc083Prog() throws CFException{
   		return mc083Prog;
   }

  
	/**
	*  set variable mc083Prog
	*  Corresponding COBOL Variable is MC083-PROG
	*  @param value
	**/
   public void setMc083Prog(char[] value) {
       value = checkMc083ProgConstraints(value);
       arraycopy(value,0,mc083Prog,0,value.length);
   } 
	public void setMc083Prog(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mc083Prog,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
