package com.cloudframe.app.addrchk.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.addrchk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private int primvar1;

								private int primvar2;

								private int primvar3;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of primvar1
	 *	@return primvar1
	 */
	public int getPrimvar1() throws CFException {
        if (isPrimvar1Modified()) { 
           primvar1 = refreshPrimvar1();
        }
   		return primvar1;
	}
	
	/**
	 * 	Update Primvar1 with the passed value
	 *  Corresponding COBOL Variable is PRIMVAR1
	 *	@param number
	 */
	public void setPrimvar1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    primvar1 = checkPrimvar1MaxLimit(number); 
		serializePrimvar1(primvar1);
	}


	public void setPrimvar1(long number) {
	    number = checkPrimvar1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPrimvar1((int)number);
	}
	
	/**
	 *	Returns the value of primvar2
	 *	@return primvar2
	 */
	public int getPrimvar2() throws CFException {
        if (isPrimvar2Modified()) { 
           primvar2 = refreshPrimvar2();
        }
   		return primvar2;
	}
	
	/**
	 * 	Update Primvar2 with the passed value
	 *  Corresponding COBOL Variable is PRIMVAR2
	 *	@param number
	 */
	public void setPrimvar2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    primvar2 = checkPrimvar2MaxLimit(number); 
		serializePrimvar2(primvar2);
	}


	public void setPrimvar2(long number) {
	    number = checkPrimvar2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPrimvar2((int)number);
	}
	
	/**
	 *	Returns the value of primvar3
	 *	@return primvar3
	 */
	public int getPrimvar3() throws CFException {
        if (isPrimvar3Modified()) { 
           primvar3 = refreshPrimvar3();
        }
   		return primvar3;
	}
	
	/**
	 * 	Update Primvar3 with the passed value
	 *  Corresponding COBOL Variable is PRIMVAR3
	 *	@param number
	 */
	public void setPrimvar3(int number) {
	     // Truncate if the number is beyond +/- Max range
	    primvar3 = checkPrimvar3MaxLimit(number); 
		serializePrimvar3(primvar3);
	}


	public void setPrimvar3(long number) {
	    number = checkPrimvar3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPrimvar3((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
