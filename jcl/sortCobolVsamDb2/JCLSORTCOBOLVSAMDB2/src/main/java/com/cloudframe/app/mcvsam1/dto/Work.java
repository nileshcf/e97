package com.cloudframe.app.mcvsam1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.mcvsam1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] pgmName300 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPgmName300(("MCVSAM2 ").toCharArray());
    }


 

	/**
	 *	Returns the value of pgmName300
	 *	@return pgmName300
	 */
   public char[] getPgmName300() throws CFException{
   		return pgmName300;
   }

  
	/**
	*  set variable pgmName300
	*  Corresponding COBOL Variable is 300-PGM-NAME
	*  @param value
	**/
   public void setPgmName300(char[] value) {
       value = checkPgmName300Constraints(value);
       arraycopy(value,0,pgmName300,0,value.length);
   } 
	public void setPgmName300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmName300,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
