package com.cloudframe.app.init1.dto;

/**
*  The class ChgBlEndIsoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgBlEndIsoRedefined extends ChgBlEndIsoRedefinedSerialized { 
   

								private int chgBlEndYy;

								private int chgBlEndMm;

								private int chgBlEndDd;
	
	/**
	* Constructor for ChgBlEndIsoRedefined
	**/
    public ChgBlEndIsoRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgBlEndIsoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgBlEndIsoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgBlEndYy
	 *	@return chgBlEndYy
	 */
	public int getChgBlEndYy() throws CFException {
       if (isChgBlEndYyModified()) { 
           chgBlEndYy = refreshChgBlEndYy();
        }
   		return chgBlEndYy;
	}
	

	
	   
	/**
	 * 	Update ChgBlEndYy with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-BL-END-YY
	 *	@param number
	 */
	public void setChgBlEndYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgBlEndYy = checkChgBlEndYyMaxLimit(number); 
		serializeChgBlEndYy(chgBlEndYy);
	}
	

	public void setChgBlEndYy(long number) {
	    number = checkChgBlEndYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgBlEndYy((int)number);
	}
	
	/**
	 * 	Update ChgBlEndYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgBlEndYy(char[] value) throws CFException {
		 chgBlEndYy = serializeChgBlEndYy(value);
	}
	/**
	 * 	Update ChgBlEndYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgBlEndYyString(char[] value) throws CFException {
		 setChgBlEndYy(value);
	}
	/**
	 *	Returns the value of chgBlEndMm
	 *	@return chgBlEndMm
	 */
	public int getChgBlEndMm() throws CFException {
       if (isChgBlEndMmModified()) { 
           chgBlEndMm = refreshChgBlEndMm();
        }
   		return chgBlEndMm;
	}
	

	
	   
	/**
	 * 	Update ChgBlEndMm with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-BL-END-MM
	 *	@param number
	 */
	public void setChgBlEndMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgBlEndMm = checkChgBlEndMmMaxLimit(number); 
		serializeChgBlEndMm(chgBlEndMm);
	}
	

	public void setChgBlEndMm(long number) {
	    number = checkChgBlEndMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgBlEndMm((int)number);
	}
	
	/**
	 * 	Update ChgBlEndMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgBlEndMm(char[] value) throws CFException {
		 chgBlEndMm = serializeChgBlEndMm(value);
	}
	/**
	 * 	Update ChgBlEndMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgBlEndMmString(char[] value) throws CFException {
		 setChgBlEndMm(value);
	}
	/**
	 *	Returns the value of chgBlEndDd
	 *	@return chgBlEndDd
	 */
	public int getChgBlEndDd() throws CFException {
       if (isChgBlEndDdModified()) { 
           chgBlEndDd = refreshChgBlEndDd();
        }
   		return chgBlEndDd;
	}
	

	
	   
	/**
	 * 	Update ChgBlEndDd with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-BL-END-DD
	 *	@param number
	 */
	public void setChgBlEndDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgBlEndDd = checkChgBlEndDdMaxLimit(number); 
		serializeChgBlEndDd(chgBlEndDd);
	}
	

	public void setChgBlEndDd(long number) {
	    number = checkChgBlEndDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgBlEndDd((int)number);
	}
	
	/**
	 * 	Update ChgBlEndDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgBlEndDd(char[] value) throws CFException {
		 chgBlEndDd = serializeChgBlEndDd(value);
	}
	/**
	 * 	Update ChgBlEndDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgBlEndDdString(char[] value) throws CFException {
		 setChgBlEndDd(value);
	}

	
	
	

		public static int getChgBlEndIsoRedefinedFieldLength() {
			return CHG_BL_END_ISO_REDEFINED_LENGTH;
		}

}
  
