package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar647ErrorMsg661 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ar647ErrorMsg661 extends Ar647ErrorMsg661Serialized {
   



								private int ar647ReturnCode661;
	
	/**
	* Constructor for Ar647ErrorMsg661
	**/
    public Ar647ErrorMsg661() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("6010-ERROR ENCOUNTERED IN AR647010 RENAME SUB-PGM").toCharArray()
             , getStartOffset() + 0
             ,49
             );
       replaceValue( // serialize and save the value
             (", RETURN-CODE: ").toCharArray()
             , getStartOffset() + 49
             ,15
             );
								setAr647ReturnCode661(0);
    }


 

	/**
	 *	Returns the value of ar647ReturnCode661
	 *	@return ar647ReturnCode661
	 */
	public int getAr647ReturnCode661() throws CFException {
       if (isAr647ReturnCode661Modified()) { 
           ar647ReturnCode661 = refreshAr647ReturnCode661();
        }
   		return ar647ReturnCode661;
	}
	

	
	   
	/**
	 * 	Update Ar647ReturnCode661 with the passed value
	 *  Corresponding COBOL Variable is 661-AR647-RETURN-CODE
	 *	@param number
	 */
	public void setAr647ReturnCode661(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ar647ReturnCode661 = checkAr647ReturnCode661MaxLimit(number); 
		serializeAr647ReturnCode661(ar647ReturnCode661);
	}
	

	public void setAr647ReturnCode661(long number) {
	    number = checkAr647ReturnCode661MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAr647ReturnCode661((int)number);
	}
	
	/**
	 * 	Update Ar647ReturnCode661 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAr647ReturnCode661(char[] value) throws CFException {
		 ar647ReturnCode661 = serializeAr647ReturnCode661(value);
	}
	/**
	 * 	Update Ar647ReturnCode661 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAr647ReturnCode661String(char[] value) throws CFException {
		 setAr647ReturnCode661(value);
	}

	
	
	

		public static int getAr647ErrorMsg661FieldLength() {
			return AR_647_ERROR_MSG_661_LENGTH;
		}

}
  
