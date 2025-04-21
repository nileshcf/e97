package com.cloudframe.app.dxc001.dto;

/**
*  The class CurrDate1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:54. using version 5.0.0.256
**/


import com.cloudframe.app.dxc001.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class CurrDate1 extends CurrDate1Serialized {
   

								private int chckYear1;

								private int chckMonth1;

								private int chckDay1;
	
	/**
	* Constructor for CurrDate1
	**/
    public CurrDate1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of chckYear1
	 *	@return chckYear1
	 */
	public int getChckYear1() throws CFException {
       if (isChckYear1Modified()) { 
           chckYear1 = refreshChckYear1();
        }
   		return chckYear1;
	}
	

	
	   
	/**
	 * 	Update ChckYear1 with the passed value
	 *  Corresponding COBOL Variable is CHCK-YEAR1
	 *	@param number
	 */
	public void setChckYear1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chckYear1 = checkChckYear1MaxLimit(number); 
		serializeChckYear1(chckYear1);
	}
	

	public void setChckYear1(long number) {
	    number = checkChckYear1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChckYear1((int)number);
	}
	
	/**
	 * 	Update ChckYear1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChckYear1(char[] value) throws CFException {
		 chckYear1 = serializeChckYear1(value);
	}
	/**
	 * 	Update ChckYear1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChckYear1String(char[] value) throws CFException {
		 setChckYear1(value);
	}
	/**
	 *	Returns the value of chckMonth1
	 *	@return chckMonth1
	 */
	public int getChckMonth1() throws CFException {
       if (isChckMonth1Modified()) { 
           chckMonth1 = refreshChckMonth1();
        }
   		return chckMonth1;
	}
	

	
	   
	/**
	 * 	Update ChckMonth1 with the passed value
	 *  Corresponding COBOL Variable is CHCK-MONTH1
	 *	@param number
	 */
	public void setChckMonth1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chckMonth1 = checkChckMonth1MaxLimit(number); 
		serializeChckMonth1(chckMonth1);
	}
	

	public void setChckMonth1(long number) {
	    number = checkChckMonth1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChckMonth1((int)number);
	}
	
	/**
	 * 	Update ChckMonth1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChckMonth1(char[] value) throws CFException {
		 chckMonth1 = serializeChckMonth1(value);
	}
	/**
	 * 	Update ChckMonth1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChckMonth1String(char[] value) throws CFException {
		 setChckMonth1(value);
	}
	/**
	 *	Returns the value of chckDay1
	 *	@return chckDay1
	 */
	public int getChckDay1() throws CFException {
       if (isChckDay1Modified()) { 
           chckDay1 = refreshChckDay1();
        }
   		return chckDay1;
	}
	

	
	   
	/**
	 * 	Update ChckDay1 with the passed value
	 *  Corresponding COBOL Variable is CHCK-DAY1
	 *	@param number
	 */
	public void setChckDay1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chckDay1 = checkChckDay1MaxLimit(number); 
		serializeChckDay1(chckDay1);
	}
	

	public void setChckDay1(long number) {
	    number = checkChckDay1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChckDay1((int)number);
	}
	
	/**
	 * 	Update ChckDay1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChckDay1(char[] value) throws CFException {
		 chckDay1 = serializeChckDay1(value);
	}
	/**
	 * 	Update ChckDay1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChckDay1String(char[] value) throws CFException {
		 setChckDay1(value);
	}

	
	
	

		public static int getCurrDate1FieldLength() {
			return CURR_DATE_1_LENGTH;
		}

}
  
