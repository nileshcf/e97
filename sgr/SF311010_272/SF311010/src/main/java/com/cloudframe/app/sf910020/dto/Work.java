package com.cloudframe.app.sf910020.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf910020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] charX300 = new char[1];

						private char[] char1300 = new char[1];

								private short binary1300;

						private char[] byteTable800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCharX300(("X").toCharArray());
								setChar1300(("1").toCharArray());
								setBinary1300((short)1);
								setByteTable800(fillSpace(8));
    }


 

	/**
	 *	Returns the value of charX300
	 *	@return charX300
	 */
   public char[] getCharX300() throws CFException{
   		return charX300;
   }

  
	/**
	*  set variable charX300
	*  Corresponding COBOL Variable is 300-CHAR-X
	*  @param value
	**/
   public void setCharX300(char[] value) {
       value = checkCharX300Constraints(value);
       arraycopy(value,0,charX300,0,value.length);
   } 
	public void setCharX300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charX300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of char1300
	 *	@return char1300
	 */
   public char[] getChar1300() throws CFException{
   		return char1300;
   }

  
	/**
	*  set variable char1300
	*  Corresponding COBOL Variable is 300-CHAR-1
	*  @param value
	**/
   public void setChar1300(char[] value) {
       value = checkChar1300Constraints(value);
       arraycopy(value,0,char1300,0,value.length);
   } 
	public void setChar1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,char1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {
   		return binary1300;
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-1
	 *	@param number
	 */
	public void setBinary1300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary1300 = checkBinary1300MaxLimit(number); 
	}

	public void setBinary1300(int number) {
	    number = checkBinary1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary1300((short)number);
	}
	public void setBinary1300(long number) {
	    number = checkBinary1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary1300((short)number);
	}
	

	/**
	 *	Returns the value of byteTable800
	 *	@return byteTable800
	 */
   public char[] getByteTable800() throws CFException{
   		return byteTable800;
   }

  
	/**
	*  set variable byteTable800
	*  Corresponding COBOL Variable is 800-BYTE-TABLE
	*  @param value
	**/
   public void setByteTable800(char[] value) {
       value = checkByteTable800Constraints(value);
       arraycopy(value,0,byteTable800,0,value.length);
   } 
	public void setByteTable800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,byteTable800,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
