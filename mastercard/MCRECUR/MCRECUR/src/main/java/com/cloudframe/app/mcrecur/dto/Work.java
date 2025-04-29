package com.cloudframe.app.mcrecur.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.mcrecur.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short idx;

						private char[] ptrIp666030800 = new char[8];

						private char[] quicksort300 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPtrIp666030800(("IP666030").toCharArray());
								setQuicksort300(("IP666030").toCharArray());
    }


 

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {
   		return idx;
	}
	
	/**
	 * 	Update Idx with the passed value
	 *  Corresponding COBOL Variable is WS-IDX
	 *	@param number
	 */
	public void setIdx(short number) {
	     // Truncate if the number is beyond +/- Max range
	    idx = checkIdxMaxLimit(number); 
	}

	public void setIdx(int number) {
	    number = checkIdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx((short)number);
	}
	public void setIdx(long number) {
	    number = checkIdxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx((short)number);
	}
	

	/**
	 *	Returns the value of ptrIp666030800
	 *	@return ptrIp666030800
	 */
   public char[] getPtrIp666030800() throws CFException{
   		return ptrIp666030800;
   }

  
	/**
	*  set variable ptrIp666030800
	*  Corresponding COBOL Variable is 800-PTR-IP666030
	*  @param value
	**/
   public void setPtrIp666030800(char[] value) {
       value = checkPtrIp666030800Constraints(value);
       arraycopy(value,0,ptrIp666030800,0,value.length);
   } 
	public void setPtrIp666030800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp666030800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of quicksort300
	 *	@return quicksort300
	 */
   public char[] getQuicksort300() throws CFException{
   		return quicksort300;
   }

  
	/**
	*  set variable quicksort300
	*  Corresponding COBOL Variable is 300-QUICKSORT
	*  @param value
	**/
   public void setQuicksort300(char[] value) {
       value = checkQuicksort300Constraints(value);
       arraycopy(value,0,quicksort300,0,value.length);
   } 
	public void setQuicksort300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,quicksort300,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
