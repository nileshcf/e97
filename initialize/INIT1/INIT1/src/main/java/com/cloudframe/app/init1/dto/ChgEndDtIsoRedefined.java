package com.cloudframe.app.init1.dto;

/**
*  The class ChgEndDtIsoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgEndDtIsoRedefined extends ChgEndDtIsoRedefinedSerialized { 
   

								private int chgEndYy;

								private int chgEndMm;

								private int chgEndDd;
	
	/**
	* Constructor for ChgEndDtIsoRedefined
	**/
    public ChgEndDtIsoRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgEndDtIsoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgEndDtIsoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgEndYy
	 *	@return chgEndYy
	 */
	public int getChgEndYy() throws CFException {
       if (isChgEndYyModified()) { 
           chgEndYy = refreshChgEndYy();
        }
   		return chgEndYy;
	}
	

	
	   
	/**
	 * 	Update ChgEndYy with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-YY
	 *	@param number
	 */
	public void setChgEndYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndYy = checkChgEndYyMaxLimit(number); 
		serializeChgEndYy(chgEndYy);
	}
	

	public void setChgEndYy(long number) {
	    number = checkChgEndYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndYy((int)number);
	}
	
	/**
	 * 	Update ChgEndYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndYy(char[] value) throws CFException {
		 chgEndYy = serializeChgEndYy(value);
	}
	/**
	 * 	Update ChgEndYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndYyString(char[] value) throws CFException {
		 setChgEndYy(value);
	}
	/**
	 *	Returns the value of chgEndMm
	 *	@return chgEndMm
	 */
	public int getChgEndMm() throws CFException {
       if (isChgEndMmModified()) { 
           chgEndMm = refreshChgEndMm();
        }
   		return chgEndMm;
	}
	

	
	   
	/**
	 * 	Update ChgEndMm with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-MM
	 *	@param number
	 */
	public void setChgEndMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndMm = checkChgEndMmMaxLimit(number); 
		serializeChgEndMm(chgEndMm);
	}
	

	public void setChgEndMm(long number) {
	    number = checkChgEndMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndMm((int)number);
	}
	
	/**
	 * 	Update ChgEndMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndMm(char[] value) throws CFException {
		 chgEndMm = serializeChgEndMm(value);
	}
	/**
	 * 	Update ChgEndMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndMmString(char[] value) throws CFException {
		 setChgEndMm(value);
	}
	/**
	 *	Returns the value of chgEndDd
	 *	@return chgEndDd
	 */
	public int getChgEndDd() throws CFException {
       if (isChgEndDdModified()) { 
           chgEndDd = refreshChgEndDd();
        }
   		return chgEndDd;
	}
	

	
	   
	/**
	 * 	Update ChgEndDd with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-END-DD
	 *	@param number
	 */
	public void setChgEndDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgEndDd = checkChgEndDdMaxLimit(number); 
		serializeChgEndDd(chgEndDd);
	}
	

	public void setChgEndDd(long number) {
	    number = checkChgEndDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgEndDd((int)number);
	}
	
	/**
	 * 	Update ChgEndDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgEndDd(char[] value) throws CFException {
		 chgEndDd = serializeChgEndDd(value);
	}
	/**
	 * 	Update ChgEndDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgEndDdString(char[] value) throws CFException {
		 setChgEndDd(value);
	}

	
	
	

		public static int getChgEndDtIsoRedefinedFieldLength() {
			return CHG_END_DT_ISO_REDEFINED_LENGTH;
		}

}
  
