package com.cloudframe.app.init1.dto;

/**
*  The class ChgStartDtIso2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgStartDtIso2Redefined extends ChgStartDtIso2RedefinedSerialized { 
   

								private int chgStartYy2;

								private int chgStartMm2;

								private int chgStartDd2;
	
	/**
	* Constructor for ChgStartDtIso2Redefined
	**/
    public ChgStartDtIso2Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgStartDtIso2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIso2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgStartYy2
	 *	@return chgStartYy2
	 */
	public int getChgStartYy2() throws CFException {
       if (isChgStartYy2Modified()) { 
           chgStartYy2 = refreshChgStartYy2();
        }
   		return chgStartYy2;
	}
	

	
	   
	/**
	 * 	Update ChgStartYy2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-YY-2
	 *	@param number
	 */
	public void setChgStartYy2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartYy2 = checkChgStartYy2MaxLimit(number); 
		serializeChgStartYy2(chgStartYy2);
	}
	

	public void setChgStartYy2(long number) {
	    number = checkChgStartYy2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartYy2((int)number);
	}
	
	/**
	 * 	Update ChgStartYy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartYy2(char[] value) throws CFException {
		 chgStartYy2 = serializeChgStartYy2(value);
	}
	/**
	 * 	Update ChgStartYy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartYy2String(char[] value) throws CFException {
		 setChgStartYy2(value);
	}
	/**
	 *	Returns the value of chgStartMm2
	 *	@return chgStartMm2
	 */
	public int getChgStartMm2() throws CFException {
       if (isChgStartMm2Modified()) { 
           chgStartMm2 = refreshChgStartMm2();
        }
   		return chgStartMm2;
	}
	

	
	   
	/**
	 * 	Update ChgStartMm2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-MM-2
	 *	@param number
	 */
	public void setChgStartMm2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartMm2 = checkChgStartMm2MaxLimit(number); 
		serializeChgStartMm2(chgStartMm2);
	}
	

	public void setChgStartMm2(long number) {
	    number = checkChgStartMm2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartMm2((int)number);
	}
	
	/**
	 * 	Update ChgStartMm2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartMm2(char[] value) throws CFException {
		 chgStartMm2 = serializeChgStartMm2(value);
	}
	/**
	 * 	Update ChgStartMm2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartMm2String(char[] value) throws CFException {
		 setChgStartMm2(value);
	}
	/**
	 *	Returns the value of chgStartDd2
	 *	@return chgStartDd2
	 */
	public int getChgStartDd2() throws CFException {
       if (isChgStartDd2Modified()) { 
           chgStartDd2 = refreshChgStartDd2();
        }
   		return chgStartDd2;
	}
	

	
	   
	/**
	 * 	Update ChgStartDd2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-DD-2
	 *	@param number
	 */
	public void setChgStartDd2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartDd2 = checkChgStartDd2MaxLimit(number); 
		serializeChgStartDd2(chgStartDd2);
	}
	

	public void setChgStartDd2(long number) {
	    number = checkChgStartDd2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartDd2((int)number);
	}
	
	/**
	 * 	Update ChgStartDd2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartDd2(char[] value) throws CFException {
		 chgStartDd2 = serializeChgStartDd2(value);
	}
	/**
	 * 	Update ChgStartDd2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartDd2String(char[] value) throws CFException {
		 setChgStartDd2(value);
	}

	
	
	

		public static int getChgStartDtIso2RedefinedFieldLength() {
			return CHG_START_DT_ISO_2_REDEFINED_LENGTH;
		}

}
  
