package com.cloudframe.app.init1.dto;

/**
*  The class ChgStartDtIsoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgStartDtIsoRedefined extends ChgStartDtIsoRedefinedSerialized { 
   

								private int chgStartYy;

								private int chgStartMm;

								private int chgStartDd;
	
	/**
	* Constructor for ChgStartDtIsoRedefined
	**/
    public ChgStartDtIsoRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgStartDtIsoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgStartDtIsoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgStartYy
	 *	@return chgStartYy
	 */
	public int getChgStartYy() throws CFException {
       if (isChgStartYyModified()) { 
           chgStartYy = refreshChgStartYy();
        }
   		return chgStartYy;
	}
	

	
	   
	/**
	 * 	Update ChgStartYy with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-YY
	 *	@param number
	 */
	public void setChgStartYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartYy = checkChgStartYyMaxLimit(number); 
		serializeChgStartYy(chgStartYy);
	}
	

	public void setChgStartYy(long number) {
	    number = checkChgStartYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartYy((int)number);
	}
	
	/**
	 * 	Update ChgStartYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartYy(char[] value) throws CFException {
		 chgStartYy = serializeChgStartYy(value);
	}
	/**
	 * 	Update ChgStartYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartYyString(char[] value) throws CFException {
		 setChgStartYy(value);
	}
	/**
	 *	Returns the value of chgStartMm
	 *	@return chgStartMm
	 */
	public int getChgStartMm() throws CFException {
       if (isChgStartMmModified()) { 
           chgStartMm = refreshChgStartMm();
        }
   		return chgStartMm;
	}
	

	
	   
	/**
	 * 	Update ChgStartMm with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-MM
	 *	@param number
	 */
	public void setChgStartMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartMm = checkChgStartMmMaxLimit(number); 
		serializeChgStartMm(chgStartMm);
	}
	

	public void setChgStartMm(long number) {
	    number = checkChgStartMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartMm((int)number);
	}
	
	/**
	 * 	Update ChgStartMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartMm(char[] value) throws CFException {
		 chgStartMm = serializeChgStartMm(value);
	}
	/**
	 * 	Update ChgStartMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartMmString(char[] value) throws CFException {
		 setChgStartMm(value);
	}
	/**
	 *	Returns the value of chgStartDd
	 *	@return chgStartDd
	 */
	public int getChgStartDd() throws CFException {
       if (isChgStartDdModified()) { 
           chgStartDd = refreshChgStartDd();
        }
   		return chgStartDd;
	}
	

	
	   
	/**
	 * 	Update ChgStartDd with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-START-DD
	 *	@param number
	 */
	public void setChgStartDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgStartDd = checkChgStartDdMaxLimit(number); 
		serializeChgStartDd(chgStartDd);
	}
	

	public void setChgStartDd(long number) {
	    number = checkChgStartDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgStartDd((int)number);
	}
	
	/**
	 * 	Update ChgStartDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgStartDd(char[] value) throws CFException {
		 chgStartDd = serializeChgStartDd(value);
	}
	/**
	 * 	Update ChgStartDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgStartDdString(char[] value) throws CFException {
		 setChgStartDd(value);
	}

	
	
	

		public static int getChgStartDtIsoRedefinedFieldLength() {
			return CHG_START_DT_ISO_REDEFINED_LENGTH;
		}

}
  
