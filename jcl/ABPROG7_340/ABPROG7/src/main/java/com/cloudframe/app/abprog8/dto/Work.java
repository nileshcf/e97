package com.cloudframe.app.abprog8.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.abprog8.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private int i;

						private char[] pgmName = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPgmName(("ABPROG9 ").toCharArray());
    }


 

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
       if (isIModified()) { 
           i = refreshI();
        }
   		return i;
	}
	

	
	   
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    i = checkIMaxLimit(number); 
		serializeI(i);
	}
	

	public void setI(long number) {
	    number = checkIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setI((int)number);
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value) throws CFException {
		 i = serializeI(value);
	}
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value) throws CFException {
		 setI(value);
	}
	/**
	 *	Returns the value of pgmName
	 *	@return pgmName
	 */
   public char[] getPgmName() throws CFException{
   		return pgmName;
   }

  
	/**
	*  set variable pgmName
	*  Corresponding COBOL Variable is PGM-NAME
	*  @param value
	**/
   public void setPgmName(char[] value) {
       value = checkPgmNameConstraints(value);
       arraycopy(value,0,pgmName,0,value.length);
   } 
	public void setPgmName(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmName,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
