package com.cloudframe.app.global.sharedvar;

/**
*  The class SeprEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SeprEntry extends SeprEntrySerialized { 
   

								private int seprLength;

								private int seprOffset;
	
	/**
	* Constructor for SeprEntry
	**/
    public SeprEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SeprEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeprEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of seprLength
	 *	@return seprLength
	 */
	public int getSeprLength() throws CFException {
       if (isSeprLengthModified()) { 
           seprLength = refreshSeprLength();
        }
   		return seprLength;
	}
	

	
	   
	/**
	 * 	Update SeprLength with the passed value
	 *  Corresponding COBOL Variable is SEPR-LENGTH
	 *	@param number
	 */
	public void setSeprLength(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    seprLength = checkSeprLengthMaxLimit(number); 
		serializeSeprLength(seprLength);
	}
	

	public void setSeprLength(long number) {
	    number = checkSeprLengthMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSeprLength((int)number);
	}
	
	/**
	 * 	Update SeprLength with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeprLength(char[] value) throws CFException {
		 seprLength = serializeSeprLength(value);
	}
	/**
	 * 	Update SeprLength with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeprLengthString(char[] value) throws CFException {
		 setSeprLength(value);
	}
	/**
	 *	Returns the value of seprOffset
	 *	@return seprOffset
	 */
	public int getSeprOffset() throws CFException {
       if (isSeprOffsetModified()) { 
           seprOffset = refreshSeprOffset();
        }
   		return seprOffset;
	}
	

	
	   
	/**
	 * 	Update SeprOffset with the passed value
	 *  Corresponding COBOL Variable is SEPR-OFFSET
	 *	@param number
	 */
	public void setSeprOffset(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    seprOffset = checkSeprOffsetMaxLimit(number); 
		serializeSeprOffset(seprOffset);
	}
	

	public void setSeprOffset(long number) {
	    number = checkSeprOffsetMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSeprOffset((int)number);
	}
	
	/**
	 * 	Update SeprOffset with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeprOffset(char[] value) throws CFException {
		 seprOffset = serializeSeprOffset(value);
	}
	/**
	 * 	Update SeprOffset with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeprOffsetString(char[] value) throws CFException {
		 setSeprOffset(value);
	}

	
	
	
	/**
	 * 	initializes SeprEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setSeprLength(0);
                     setSeprOffset(0);
   }

		public static int getSeprEntryFieldLength() {
			return SEPR_ENTRY_LENGTH;
		}

}
  
