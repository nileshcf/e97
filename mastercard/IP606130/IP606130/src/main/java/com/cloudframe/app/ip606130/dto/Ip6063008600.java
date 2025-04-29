package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip6063008600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Ip6063008600 extends Ip6063008600Serialized {
   


								private int maxEntries6003008;

	
	/**
	* Constructor for Ip6063008600
	**/
    public Ip6063008600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TABLE IP0000T1 OVERFLOW. CONTAINS MORE THAN  ").toCharArray()
             , getStartOffset() + 0
             ,45
             );
								setMaxEntries6003008(0);
       replaceValue( // serialize and save the value
             (" ENTRIES.").toCharArray()
             , getStartOffset() + 49
             ,9
             );
    }


 

	/**
	 *	Returns the value of maxEntries6003008
	 *	@return maxEntries6003008
	 */
	public int getMaxEntries6003008() throws CFException {
       if (isMaxEntries6003008Modified()) { 
           maxEntries6003008 = refreshMaxEntries6003008();
        }
   		return maxEntries6003008;
	}
	

	
	   
	/**
	 * 	Update MaxEntries6003008 with the passed value
	 *  Corresponding COBOL Variable is 600-3008-MAX-ENTRIES
	 *	@param number
	 */
	public void setMaxEntries6003008(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxEntries6003008 = checkMaxEntries6003008MaxLimit(number); 
		serializeMaxEntries6003008(maxEntries6003008);
	}
	

	public void setMaxEntries6003008(long number) {
	    number = checkMaxEntries6003008MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxEntries6003008((int)number);
	}
	
	/**
	 * 	Update MaxEntries6003008 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxEntries6003008(char[] value) throws CFException {
		 maxEntries6003008 = serializeMaxEntries6003008(value);
	}
	/**
	 * 	Update MaxEntries6003008 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxEntries6003008String(char[] value) throws CFException {
		 setMaxEntries6003008(value);
	}

	
	
	

		public static int getIp6063008600FieldLength() {
			return IP_6063008600_LENGTH;
		}

}
  
