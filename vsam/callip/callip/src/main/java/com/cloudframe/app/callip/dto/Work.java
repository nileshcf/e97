package com.cloudframe.app.callip.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.callip.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] ip66201001 = new char[8];

						private char[] ip65001001 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp66201001(("IP662010").toCharArray());
								setIp65001001(("IP650010").toCharArray());
    }


 

	/**
	 *	Returns the value of ip66201001
	 *	@return ip66201001
	 */
   public char[] getIp66201001() throws CFException{
   		return ip66201001;
   }

  
	/**
	*  set variable ip66201001
	*  Corresponding COBOL Variable is WS-IP662010
	*  @param value
	**/
   public void setIp66201001(char[] value) {
       value = checkIp66201001Constraints(value);
       arraycopy(value,0,ip66201001,0,value.length);
   } 
	public void setIp66201001(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip66201001,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ip65001001
	 *	@return ip65001001
	 */
   public char[] getIp65001001() throws CFException{
   		return ip65001001;
   }

  
	/**
	*  set variable ip65001001
	*  Corresponding COBOL Variable is WS-IP650010
	*  @param value
	**/
   public void setIp65001001(char[] value) {
       value = checkIp65001001Constraints(value);
       arraycopy(value,0,ip65001001,0,value.length);
   } 
	public void setIp65001001(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip65001001,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
