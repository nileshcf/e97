package com.cloudframe.app.mcextend.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.mcextend.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] mcfile101 = new char[8];

						private char[] mcfile201 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMcfile101(("MCFILE1 ").toCharArray());
								setMcfile201(("MCFILE2 ").toCharArray());
    }


 

	/**
	 *	Returns the value of mcfile101
	 *	@return mcfile101
	 */
   public char[] getMcfile101() throws CFException{
   		return mcfile101;
   }

  
	/**
	*  set variable mcfile101
	*  Corresponding COBOL Variable is WS-MCFILE1
	*  @param value
	**/
   public void setMcfile101(char[] value) {
       value = checkMcfile101Constraints(value);
       arraycopy(value,0,mcfile101,0,value.length);
   } 
	public void setMcfile101(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcfile101,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mcfile201
	 *	@return mcfile201
	 */
   public char[] getMcfile201() throws CFException{
   		return mcfile201;
   }

  
	/**
	*  set variable mcfile201
	*  Corresponding COBOL Variable is WS-MCFILE2
	*  @param value
	**/
   public void setMcfile201(char[] value) {
       value = checkMcfile201Constraints(value);
       arraycopy(value,0,mcfile201,0,value.length);
   } 
	public void setMcfile201(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcfile201,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
