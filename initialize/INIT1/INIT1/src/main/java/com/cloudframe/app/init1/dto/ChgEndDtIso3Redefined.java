package com.cloudframe.app.init1.dto;

/**
*  The class ChgEndDtIso3Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgEndDtIso3Redefined extends ChgEndDtIso3RedefinedSerialized { 
   

								private int chgEndYy3;

								private int chgEndMm3;

								private int chgEndDd3;
	
	/**
	* Constructor for ChgEndDtIso3Redefined
	**/
    public ChgEndDtIso3Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgEndDtIso3Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIso3Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgEndYy3
	 *	@return chgEndYy3
	 */
	public int getChgEndYy3() throws CFException {
       if (isChgEndYy3Modified()) { 
           chgEndYy3 = refreshChgEndYy3();
        }
   		return chgEndYy3;
	}
	

	
	   
	/**
	 * 	Update ChgEndYy3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-YY-3
	 *	@param number
	 */
	public void setChgEndYy3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndYy3 = checkChgEndYy3MaxLimit(number); 
		serializeChgEndYy3(chgEndYy3);
	}
	

	public void setChgEndYy3(long number) {
	    number = checkChgEndYy3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndYy3((int)number);
	}
	
	/**
	 * 	Update ChgEndYy3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndYy3(char[] value) throws CFException {
		 chgEndYy3 = serializeChgEndYy3(value);
	}
	/**
	 * 	Update ChgEndYy3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndYy3String(char[] value) throws CFException {
		 setChgEndYy3(value);
	}
	/**
	 *	Returns the value of chgEndMm3
	 *	@return chgEndMm3
	 */
	public int getChgEndMm3() throws CFException {
       if (isChgEndMm3Modified()) { 
           chgEndMm3 = refreshChgEndMm3();
        }
   		return chgEndMm3;
	}
	

	
	   
	/**
	 * 	Update ChgEndMm3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-MM-3
	 *	@param number
	 */
	public void setChgEndMm3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndMm3 = checkChgEndMm3MaxLimit(number); 
		serializeChgEndMm3(chgEndMm3);
	}
	

	public void setChgEndMm3(long number) {
	    number = checkChgEndMm3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndMm3((int)number);
	}
	
	/**
	 * 	Update ChgEndMm3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndMm3(char[] value) throws CFException {
		 chgEndMm3 = serializeChgEndMm3(value);
	}
	/**
	 * 	Update ChgEndMm3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndMm3String(char[] value) throws CFException {
		 setChgEndMm3(value);
	}
	/**
	 *	Returns the value of chgEndDd3
	 *	@return chgEndDd3
	 */
	public int getChgEndDd3() throws CFException {
       if (isChgEndDd3Modified()) { 
           chgEndDd3 = refreshChgEndDd3();
        }
   		return chgEndDd3;
	}
	

	
	   
	/**
	 * 	Update ChgEndDd3 with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-DD-3
	 *	@param number
	 */
	public void setChgEndDd3(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndDd3 = checkChgEndDd3MaxLimit(number); 
		serializeChgEndDd3(chgEndDd3);
	}
	

	public void setChgEndDd3(long number) {
	    number = checkChgEndDd3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndDd3((int)number);
	}
	
	/**
	 * 	Update ChgEndDd3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndDd3(char[] value) throws CFException {
		 chgEndDd3 = serializeChgEndDd3(value);
	}
	/**
	 * 	Update ChgEndDd3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndDd3String(char[] value) throws CFException {
		 setChgEndDd3(value);
	}

	
	
	

		public static int getChgEndDtIso3RedefinedFieldLength() {
			return CHG_END_DT_ISO_3_REDEFINED_LENGTH;
		}

}
  
