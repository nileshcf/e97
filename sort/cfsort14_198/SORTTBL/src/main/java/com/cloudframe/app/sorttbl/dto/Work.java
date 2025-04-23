package com.cloudframe.app.sorttbl.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.sorttbl.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] acceptInput = Field.fillLowValue(80);

								private int ip00854wEntriesMax;

								private int recordsLoaded400;

								private short idx;

						private char[] ptrIp666040800 = new char[8];

						private char[] quicksort300 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp00854wEntriesMax(500);
								setPtrIp666040800(("IP666040").toCharArray());
								setQuicksort300(("IP666040").toCharArray());
    }


 

	/**
	 *	Returns the value of acceptInput
	 *	@return acceptInput
	 */
   public char[] getAcceptInput() throws CFException{
   		return acceptInput;
   }

  
	/**
	*  set variable acceptInput
	*  Corresponding COBOL Variable is WS-ACCEPT-INPUT
	*  @param value
	**/
   public void setAcceptInput(char[] value) {
       value = checkAcceptInputConstraints(value);
       arraycopy(value,0,acceptInput,0,value.length);
   } 
	public void setAcceptInput(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,acceptInput,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ip00854wEntriesMax
	 *	@return ip00854wEntriesMax
	 */
	public int getIp00854wEntriesMax() throws CFException {
   		return ip00854wEntriesMax;
	}
	
	/**
	 * 	Update Ip00854wEntriesMax with the passed value
	 *  Corresponding COBOL Variable is IP00854W-ENTRIES-MAX
	 *	@param number
	 */
	public void setIp00854wEntriesMax(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00854wEntriesMax = checkIp00854wEntriesMaxMaxLimit(number); 
	}


	public void setIp00854wEntriesMax(long number) {
	    number = checkIp00854wEntriesMaxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00854wEntriesMax((int)number);
	}
	
	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {
   		return recordsLoaded400;
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECORDS-LOADED
	 *	@param number
	 */
	public void setRecordsLoaded400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recordsLoaded400 = checkRecordsLoaded400MaxLimit(number); 
	}


	public void setRecordsLoaded400(long number) {
	    number = checkRecordsLoaded400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecordsLoaded400((int)number);
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
	 *	Returns the value of ptrIp666040800
	 *	@return ptrIp666040800
	 */
   public char[] getPtrIp666040800() throws CFException{
   		return ptrIp666040800;
   }

  
	/**
	*  set variable ptrIp666040800
	*  Corresponding COBOL Variable is 800-PTR-IP666040
	*  @param value
	**/
   public void setPtrIp666040800(char[] value) {
       value = checkPtrIp666040800Constraints(value);
       arraycopy(value,0,ptrIp666040800,0,value.length);
   } 
	public void setPtrIp666040800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp666040800,0,beginIndex + endIndex);
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
  
