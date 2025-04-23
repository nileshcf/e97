package com.cloudframe.app.evaluat1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.evaluat1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] mmNota = Field.fillLowValue(3);

						private char[] mmDb = Field.fillLowValue(2);

								private short i;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mmNota
	 *	@return mmNota
	 */
   public char[] getMmNota() throws CFException{
   		return mmNota;
   }

  
	/**
	*  set variable mmNota
	*  Corresponding COBOL Variable is MM-NOTA
	*  @param value
	**/
   public void setMmNota(char[] value) {
       value = checkMmNotaConstraints(value);
       arraycopy(value,0,mmNota,0,value.length);
   } 
	public void setMmNota(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mmNota,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mmDb
	 *	@return mmDb
	 */
   public char[] getMmDb() throws CFException{
   		return mmDb;
   }

  
	/**
	*  set variable mmDb
	*  Corresponding COBOL Variable is MM-DB
	*  @param value
	**/
   public void setMmDb(char[] value) {
       value = checkMmDbConstraints(value);
       arraycopy(value,0,mmDb,0,value.length);
   } 
	public void setMmDb(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mmDb,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is WS-I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
