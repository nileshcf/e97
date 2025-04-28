package com.cloudframe.app.init1.dto;

/**
*  The class ChgEndDtIso2Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgEndDtIso2Redefined extends ChgEndDtIso2RedefinedSerialized { 
   

								private int chgEndYy2;

								private int chgEndMm2;

								private int chgEndDd2;
	
	/**
	* Constructor for ChgEndDtIso2Redefined
	**/
    public ChgEndDtIso2Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgEndDtIso2Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIso2Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgEndYy2
	 *	@return chgEndYy2
	 */
	public int getChgEndYy2() throws CFException {
       if (isChgEndYy2Modified()) { 
           chgEndYy2 = refreshChgEndYy2();
        }
   		return chgEndYy2;
	}
	

	
	   
	/**
	 * 	Update ChgEndYy2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-YY-2
	 *	@param number
	 */
	public void setChgEndYy2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndYy2 = checkChgEndYy2MaxLimit(number); 
		serializeChgEndYy2(chgEndYy2);
	}
	

	public void setChgEndYy2(long number) {
	    number = checkChgEndYy2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndYy2((int)number);
	}
	
	/**
	 * 	Update ChgEndYy2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndYy2(char[] value) throws CFException {
		 chgEndYy2 = serializeChgEndYy2(value);
	}
	/**
	 * 	Update ChgEndYy2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndYy2String(char[] value) throws CFException {
		 setChgEndYy2(value);
	}
	/**
	 *	Returns the value of chgEndMm2
	 *	@return chgEndMm2
	 */
	public int getChgEndMm2() throws CFException {
       if (isChgEndMm2Modified()) { 
           chgEndMm2 = refreshChgEndMm2();
        }
   		return chgEndMm2;
	}
	

	
	   
	/**
	 * 	Update ChgEndMm2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-MM-2
	 *	@param number
	 */
	public void setChgEndMm2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndMm2 = checkChgEndMm2MaxLimit(number); 
		serializeChgEndMm2(chgEndMm2);
	}
	

	public void setChgEndMm2(long number) {
	    number = checkChgEndMm2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndMm2((int)number);
	}
	
	/**
	 * 	Update ChgEndMm2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndMm2(char[] value) throws CFException {
		 chgEndMm2 = serializeChgEndMm2(value);
	}
	/**
	 * 	Update ChgEndMm2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndMm2String(char[] value) throws CFException {
		 setChgEndMm2(value);
	}
	/**
	 *	Returns the value of chgEndDd2
	 *	@return chgEndDd2
	 */
	public int getChgEndDd2() throws CFException {
       if (isChgEndDd2Modified()) { 
           chgEndDd2 = refreshChgEndDd2();
        }
   		return chgEndDd2;
	}
	

	
	   
	/**
	 * 	Update ChgEndDd2 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-DD-2
	 *	@param number
	 */
	public void setChgEndDd2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndDd2 = checkChgEndDd2MaxLimit(number); 
		serializeChgEndDd2(chgEndDd2);
	}
	

	public void setChgEndDd2(long number) {
	    number = checkChgEndDd2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndDd2((int)number);
	}
	
	/**
	 * 	Update ChgEndDd2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndDd2(char[] value) throws CFException {
		 chgEndDd2 = serializeChgEndDd2(value);
	}
	/**
	 * 	Update ChgEndDd2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndDd2String(char[] value) throws CFException {
		 setChgEndDd2(value);
	}

	
	
	

		public static int getChgEndDtIso2RedefinedFieldLength() {
			return CHG_END_DT_ISO_2_REDEFINED_LENGTH;
		}

}
  
