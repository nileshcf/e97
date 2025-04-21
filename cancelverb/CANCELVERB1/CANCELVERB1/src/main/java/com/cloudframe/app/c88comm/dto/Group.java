package com.cloudframe.app.c88comm.dto;

/**
*  The class Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.c88comm.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Group extends GroupSerialized {
   

								private int numbers;
	
	/**
	* Constructor for Group
	**/
    public Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNumbers(0);
    }


 

	/**
	 *	Returns the value of numbers
	 *	@return numbers
	 */
	public int getNumbers() throws CFException {
       if (isNumbersModified()) { 
           numbers = refreshNumbers();
        }
   		return numbers;
	}
	

	
	   
	/**
	 * 	Update Numbers with the passed value
	 *  Corresponding COBOL Variable is WS-NUMBERS
	 *	@param number
	 */
	public void setNumbers(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    numbers = checkNumbersMaxLimit(number); 
		serializeNumbers(numbers);
	}
	

	public void setNumbers(long number) {
	    number = checkNumbersMaxLimit(number); // Truncate if value is beyond +/- Max range
		setNumbers((int)number);
	}
	
	/**
	 * 	Update Numbers with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumbers(char[] value) throws CFException {
		 numbers = serializeNumbers(value);
	}
	/**
	 * 	Update Numbers with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumbersString(char[] value) throws CFException {
		 setNumbers(value);
	}
	
	/**
	 *	Test condition 1 for isOne()
	 *	@return  Returns true if isOne() is 1
	 */
   public boolean isOne() throws CFException {
      return (  getNumbers()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setOneTrue() {  			
    	setNumbers( 1);
   	}
	
	/**
	 *	Test condition 2 for isTwo()
	 *	@return  Returns true if isTwo() is 2
	 */
   public boolean isTwo() throws CFException {
      return (  getNumbers()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setTwoTrue() {  			
    	setNumbers( 2);
   	}
	
	/**
	 *	Test condition 5 6 7 for isAll()
	 *	@return  Returns true if isAll() is 5 6 7
	 */
   public boolean isAll() throws CFException {
      return (  getNumbers()  ==  5  ||  getNumbers()  ==  6  ||  getNumbers()  ==  7  );
   }


	/**
	*  set values 5 6 7
	*/
   	public void setAllTrue() {  			
    	setNumbers( 5);
   	}

	
	
	

		public static int getGroupFieldLength() {
			return GROUP_LENGTH;
		}

}
  
