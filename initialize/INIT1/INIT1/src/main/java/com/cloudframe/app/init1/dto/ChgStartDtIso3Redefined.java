package com.cloudframe.app.init1.dto;

/**
*  The class ChgStartDtIso3Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgStartDtIso3Redefined extends ChgStartDtIso3RedefinedSerialized { 
   

								private int chgStartYy3;

								private int chgStartMm3;

								private int chgStartDd3;
	
	/**
	* Constructor for ChgStartDtIso3Redefined
	**/
    public ChgStartDtIso3Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgStartDtIso3Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIso3Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgStartYy3
	 *	@return chgStartYy3
	 */
	public int getChgStartYy3() throws CFException {
       if (isChgStartYy3Modified()) { 
           chgStartYy3 = refreshChgStartYy3();
        }
   		return chgStartYy3;
	}
	

	
	   
	/**
	 * 	Update ChgStartYy3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-YY-3
	 *	@param number
	 */
	public void setChgStartYy3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartYy3 = checkChgStartYy3MaxLimit(number); 
		serializeChgStartYy3(chgStartYy3);
	}
	

	public void setChgStartYy3(long number) {
	    number = checkChgStartYy3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartYy3((int)number);
	}
	
	/**
	 * 	Update ChgStartYy3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartYy3(char[] value) throws CFException {
		 chgStartYy3 = serializeChgStartYy3(value);
	}
	/**
	 * 	Update ChgStartYy3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartYy3String(char[] value) throws CFException {
		 setChgStartYy3(value);
	}
	/**
	 *	Returns the value of chgStartMm3
	 *	@return chgStartMm3
	 */
	public int getChgStartMm3() throws CFException {
       if (isChgStartMm3Modified()) { 
           chgStartMm3 = refreshChgStartMm3();
        }
   		return chgStartMm3;
	}
	

	
	   
	/**
	 * 	Update ChgStartMm3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-MM-3
	 *	@param number
	 */
	public void setChgStartMm3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartMm3 = checkChgStartMm3MaxLimit(number); 
		serializeChgStartMm3(chgStartMm3);
	}
	

	public void setChgStartMm3(long number) {
	    number = checkChgStartMm3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartMm3((int)number);
	}
	
	/**
	 * 	Update ChgStartMm3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartMm3(char[] value) throws CFException {
		 chgStartMm3 = serializeChgStartMm3(value);
	}
	/**
	 * 	Update ChgStartMm3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartMm3String(char[] value) throws CFException {
		 setChgStartMm3(value);
	}
	/**
	 *	Returns the value of chgStartDd3
	 *	@return chgStartDd3
	 */
	public int getChgStartDd3() throws CFException {
       if (isChgStartDd3Modified()) { 
           chgStartDd3 = refreshChgStartDd3();
        }
   		return chgStartDd3;
	}
	

	
	   
	/**
	 * 	Update ChgStartDd3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-DD-3
	 *	@param number
	 */
	public void setChgStartDd3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartDd3 = checkChgStartDd3MaxLimit(number); 
		serializeChgStartDd3(chgStartDd3);
	}
	

	public void setChgStartDd3(long number) {
	    number = checkChgStartDd3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartDd3((int)number);
	}
	
	/**
	 * 	Update ChgStartDd3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartDd3(char[] value) throws CFException {
		 chgStartDd3 = serializeChgStartDd3(value);
	}
	/**
	 * 	Update ChgStartDd3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartDd3String(char[] value) throws CFException {
		 setChgStartDd3(value);
	}

	
	
	

		public static int getChgStartDtIso3RedefinedFieldLength() {
			return CHG_START_DT_ISO_3_REDEFINED_LENGTH;
		}

}
  
