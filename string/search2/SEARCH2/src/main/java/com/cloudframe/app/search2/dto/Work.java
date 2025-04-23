package com.cloudframe.app.search2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.search2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private int initial;

								private int increment;

								private int sub;

								private int sub2;

								private int sub3;

								private short toggle123;

								private short toggleMax;

								private int counter;

								private long searchItem;

								private int sbidCount;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInitial(1000);
								setIncrement(100);
								setSub(1);
								setSub2(1);
								setSub3(1);
								setToggle123((short)1);
								setToggleMax((short)2);
								setCounter(50);
								setSbidCount(0);
    }


 

	/**
	 *	Returns the value of initial
	 *	@return initial
	 */
	public int getInitial() throws CFException {
   		return initial;
	}
	
	/**
	 * 	Update Initial with the passed value
	 *  Corresponding COBOL Variable is WS-INITIAL
	 *	@param number
	 */
	public void setInitial(int number) {
	     // Truncate if the number is beyond +/- Max range
	    initial = checkInitialMaxLimit(number); 
	}


	public void setInitial(long number) {
	    number = checkInitialMaxLimit(number); // Truncate if value is beyond +/- Max range
		setInitial((int)number);
	}
	
	/**
	 *	Returns the value of increment
	 *	@return increment
	 */
	public int getIncrement() throws CFException {
   		return increment;
	}
	
	/**
	 * 	Update Increment with the passed value
	 *  Corresponding COBOL Variable is WS-INCREMENT
	 *	@param number
	 */
	public void setIncrement(int number) {
	     // Truncate if the number is beyond +/- Max range
	    increment = checkIncrementMaxLimit(number); 
	}


	public void setIncrement(long number) {
	    number = checkIncrementMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIncrement((int)number);
	}
	
	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {
   		return sub;
	}
	
	/**
	 * 	Update Sub with the passed value
	 *  Corresponding COBOL Variable is WS-SUB
	 *	@param number
	 */
	public void setSub(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub = checkSubMaxLimit(number); 
	}


	public void setSub(long number) {
	    number = checkSubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub((int)number);
	}
	
	/**
	 *	Returns the value of sub2
	 *	@return sub2
	 */
	public int getSub2() throws CFException {
   		return sub2;
	}
	
	/**
	 * 	Update Sub2 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB2
	 *	@param number
	 */
	public void setSub2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub2 = checkSub2MaxLimit(number); 
	}


	public void setSub2(long number) {
	    number = checkSub2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub2((int)number);
	}
	
	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {
   		return sub3;
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *  Corresponding COBOL Variable is WS-SUB3
	 *	@param number
	 */
	public void setSub3(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sub3 = checkSub3MaxLimit(number); 
	}


	public void setSub3(long number) {
	    number = checkSub3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSub3((int)number);
	}
	
	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {
   		return toggle123;
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *  Corresponding COBOL Variable is WS-123-TOGGLE
	 *	@param number
	 */
	public void setToggle123(short number) {
	     // Truncate if the number is beyond +/- Max range
	    toggle123 = checkToggle123MaxLimit(number); 
	}

	public void setToggle123(int number) {
	    number = checkToggle123MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setToggle123((short)number);
	}
	public void setToggle123(long number) {
	    number = checkToggle123MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setToggle123((short)number);
	}
	

	/**
	 *	Returns the value of toggleMax
	 *	@return toggleMax
	 */
	public short getToggleMax() throws CFException {
   		return toggleMax;
	}
	
	/**
	 * 	Update ToggleMax with the passed value
	 *  Corresponding COBOL Variable is WS-TOGGLE-MAX
	 *	@param number
	 */
	public void setToggleMax(short number) {
	     // Truncate if the number is beyond +/- Max range
	    toggleMax = checkToggleMaxMaxLimit(number); 
	}

	public void setToggleMax(int number) {
	    number = checkToggleMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setToggleMax((short)number);
	}
	public void setToggleMax(long number) {
	    number = checkToggleMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setToggleMax((short)number);
	}
	

	/**
	 *	Returns the value of counter
	 *	@return counter
	 */
	public int getCounter() throws CFException {
   		return counter;
	}
	
	/**
	 * 	Update Counter with the passed value
	 *  Corresponding COBOL Variable is WS-COUNTER
	 *	@param number
	 */
	public void setCounter(int number) {
	     // Truncate if the number is beyond +/- Max range
	    counter = checkCounterMaxLimit(number); 
	}


	public void setCounter(long number) {
	    number = checkCounterMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCounter((int)number);
	}
	
	/**
	 *	Returns the value of searchItem
	 *	@return searchItem
	 */
	public long getSearchItem() throws CFException {
   		return searchItem;
	}
	
	/**
	 * 	Update SearchItem with the passed value
	 *  Corresponding COBOL Variable is WS-SEARCH-ITEM
	 *	@param number
	 */
	public void setSearchItem(long number) {
	     // Truncate if the number is beyond +/- Max range
	    searchItem = checkSearchItemMaxLimit(number); 
	}


	/**
	 *	Returns the value of sbidCount
	 *	@return sbidCount
	 */
	public int getSbidCount() throws CFException {
   		return sbidCount;
	}
	
	/**
	 * 	Update SbidCount with the passed value
	 *  Corresponding COBOL Variable is WS-SBID-COUNT
	 *	@param number
	 */
	public void setSbidCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sbidCount = checkSbidCountMaxLimit(number); 
	}


	public void setSbidCount(long number) {
	    number = checkSbidCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSbidCount((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
