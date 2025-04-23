package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Cf20004TableId extends Cf20004TableIdSerialized { 
   


								private int cf20004TableNo;

	
	/**
	* Constructor for Cf20004TableId
	**/
    public Cf20004TableId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Cf20004TableId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cf20004TableNo
	 *	@return cf20004TableNo
	 */
	public int getCf20004TableNo() throws CFException {
       if (isCf20004TableNoModified()) { 
           cf20004TableNo = refreshCf20004TableNo();
        }
   		return cf20004TableNo;
	}
	

	
	   
	/**
	 * 	Update Cf20004TableNo with the passed value
	 *  Corresponding COBOL Variable is CF20004-TABLE-NO
	 *	@param number
	 */
	public void setCf20004TableNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cf20004TableNo = checkCf20004TableNoMaxLimit(number); 
		serializeCf20004TableNo(cf20004TableNo);
	}
	

	public void setCf20004TableNo(long number) {
	    number = checkCf20004TableNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCf20004TableNo((int)number);
	}
	
	/**
	 * 	Update Cf20004TableNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setCf20004TableNo(char[] value) throws CFException {
		 cf20004TableNo = serializeCf20004TableNo(value);
	}
	/**
	 * 	Update Cf20004TableNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCf20004TableNoString(char[] value) throws CFException {
		 setCf20004TableNo(value);
	}

	
	
	
	/**
	 * 	initializes Cf20004TableId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setCf20004TableNo(0);
   }

		public static int getCf20004TableIdFieldLength() {
			return CF_20004_TABLE_ID_LENGTH;
		}

}
  
