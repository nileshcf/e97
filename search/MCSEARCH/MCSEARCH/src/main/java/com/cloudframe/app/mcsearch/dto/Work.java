package com.cloudframe.app.mcsearch.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.mcsearch.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] ip22462001 = new char[8];

						private char[] ip22462101 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp22462001(("IP224620").toCharArray());
								setIp22462101(("IP224621").toCharArray());
    }


 

	/**
	 *	Returns the value of ip22462001
	 *	@return ip22462001
	 */
   public char[] getIp22462001() throws CFException{
   		return ip22462001;
   }

  
	/**
	*  set variable ip22462001
	*  Corresponding COBOL Variable is WS-IP224620
	*  @param value
	**/
   public void setIp22462001(char[] value) {
       value = checkIp22462001Constraints(value);
       arraycopy(value,0,ip22462001,0,value.length);
   } 
	public void setIp22462001(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip22462001,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ip22462101
	 *	@return ip22462101
	 */
   public char[] getIp22462101() throws CFException{
   		return ip22462101;
   }

  
	/**
	*  set variable ip22462101
	*  Corresponding COBOL Variable is WS-IP224621
	*  @param value
	**/
   public void setIp22462101(char[] value) {
       value = checkIp22462101Constraints(value);
       arraycopy(value,0,ip22462101,0,value.length);
   } 
	public void setIp22462101(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip22462101,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
