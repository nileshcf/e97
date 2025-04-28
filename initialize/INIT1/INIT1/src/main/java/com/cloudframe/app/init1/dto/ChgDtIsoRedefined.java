package com.cloudframe.app.init1.dto;

/**
*  The class ChgDtIsoRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChgDtIsoRedefined extends ChgDtIsoRedefinedSerialized { 
   

								private int chgYy;

								private int chgMm;

								private int chgDd;
	
	/**
	* Constructor for ChgDtIsoRedefined
	**/
    public ChgDtIsoRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ChgDtIsoRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ChgDtIsoRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of chgYy
	 *	@return chgYy
	 */
	public int getChgYy() throws CFException {
       if (isChgYyModified()) { 
           chgYy = refreshChgYy();
        }
   		return chgYy;
	}
	

	
	   
	/**
	 * 	Update ChgYy with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-YY
	 *	@param number
	 */
	public void setChgYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgYy = checkChgYyMaxLimit(number); 
		serializeChgYy(chgYy);
	}
	

	public void setChgYy(long number) {
	    number = checkChgYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgYy((int)number);
	}
	
	/**
	 * 	Update ChgYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgYy(char[] value) throws CFException {
		 chgYy = serializeChgYy(value);
	}
	/**
	 * 	Update ChgYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgYyString(char[] value) throws CFException {
		 setChgYy(value);
	}
	/**
	 *	Returns the value of chgMm
	 *	@return chgMm
	 */
	public int getChgMm() throws CFException {
       if (isChgMmModified()) { 
           chgMm = refreshChgMm();
        }
   		return chgMm;
	}
	

	
	   
	/**
	 * 	Update ChgMm with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-MM
	 *	@param number
	 */
	public void setChgMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgMm = checkChgMmMaxLimit(number); 
		serializeChgMm(chgMm);
	}
	

	public void setChgMm(long number) {
	    number = checkChgMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgMm((int)number);
	}
	
	/**
	 * 	Update ChgMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgMm(char[] value) throws CFException {
		 chgMm = serializeChgMm(value);
	}
	/**
	 * 	Update ChgMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgMmString(char[] value) throws CFException {
		 setChgMm(value);
	}
	/**
	 *	Returns the value of chgDd
	 *	@return chgDd
	 */
	public int getChgDd() throws CFException {
       if (isChgDdModified()) { 
           chgDd = refreshChgDd();
        }
   		return chgDd;
	}
	

	
	   
	/**
	 * 	Update ChgDd with the passed value
	 *  Corresponding COBOL Variable is WS-CHG-DD
	 *	@param number
	 */
	public void setChgDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    chgDd = checkChgDdMaxLimit(number); 
		serializeChgDd(chgDd);
	}
	

	public void setChgDd(long number) {
	    number = checkChgDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setChgDd((int)number);
	}
	
	/**
	 * 	Update ChgDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setChgDd(char[] value) throws CFException {
		 chgDd = serializeChgDd(value);
	}
	/**
	 * 	Update ChgDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setChgDdString(char[] value) throws CFException {
		 setChgDd(value);
	}

	
	
	

		public static int getChgDtIsoRedefinedFieldLength() {
			return CHG_DT_ISO_REDEFINED_LENGTH;
		}

}
  
