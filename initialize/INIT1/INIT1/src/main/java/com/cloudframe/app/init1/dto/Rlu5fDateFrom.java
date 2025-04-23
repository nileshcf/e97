package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fDateFrom is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rlu5fDateFrom extends Rlu5fDateFromSerialized { 
   

								private int rlu5fDateFromMm;

								private int rlu5fDateFromDd;

								private int rlu5fDateFromCc;

								private int rlu5fDateFromYy;
	
	/**
	* Constructor for Rlu5fDateFrom
	**/
    public Rlu5fDateFrom() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fDateFrom. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDateFrom(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fDateFromMm
	 *	@return rlu5fDateFromMm
	 */
	public int getRlu5fDateFromMm() throws CFException {
       if (isRlu5fDateFromMmModified()) { 
           rlu5fDateFromMm = refreshRlu5fDateFromMm();
        }
   		return rlu5fDateFromMm;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateFromMm with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-FROM-MM
	 *	@param number
	 */
	public void setRlu5fDateFromMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateFromMm = checkRlu5fDateFromMmMaxLimit(number); 
		serializeRlu5fDateFromMm(rlu5fDateFromMm);
	}
	

	public void setRlu5fDateFromMm(long number) {
	    number = checkRlu5fDateFromMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateFromMm((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateFromMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromMm(char[] value) throws CFException {
		 rlu5fDateFromMm = serializeRlu5fDateFromMm(value);
	}
	/**
	 * 	Update Rlu5fDateFromMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromMmString(char[] value) throws CFException {
		 setRlu5fDateFromMm(value);
	}
	/**
	 *	Returns the value of rlu5fDateFromDd
	 *	@return rlu5fDateFromDd
	 */
	public int getRlu5fDateFromDd() throws CFException {
       if (isRlu5fDateFromDdModified()) { 
           rlu5fDateFromDd = refreshRlu5fDateFromDd();
        }
   		return rlu5fDateFromDd;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateFromDd with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-FROM-DD
	 *	@param number
	 */
	public void setRlu5fDateFromDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateFromDd = checkRlu5fDateFromDdMaxLimit(number); 
		serializeRlu5fDateFromDd(rlu5fDateFromDd);
	}
	

	public void setRlu5fDateFromDd(long number) {
	    number = checkRlu5fDateFromDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateFromDd((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateFromDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromDd(char[] value) throws CFException {
		 rlu5fDateFromDd = serializeRlu5fDateFromDd(value);
	}
	/**
	 * 	Update Rlu5fDateFromDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromDdString(char[] value) throws CFException {
		 setRlu5fDateFromDd(value);
	}
	/**
	 *	Returns the value of rlu5fDateFromCc
	 *	@return rlu5fDateFromCc
	 */
	public int getRlu5fDateFromCc() throws CFException {
       if (isRlu5fDateFromCcModified()) { 
           rlu5fDateFromCc = refreshRlu5fDateFromCc();
        }
   		return rlu5fDateFromCc;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateFromCc with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-FROM-CC
	 *	@param number
	 */
	public void setRlu5fDateFromCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateFromCc = checkRlu5fDateFromCcMaxLimit(number); 
		serializeRlu5fDateFromCc(rlu5fDateFromCc);
	}
	

	public void setRlu5fDateFromCc(long number) {
	    number = checkRlu5fDateFromCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateFromCc((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateFromCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromCc(char[] value) throws CFException {
		 rlu5fDateFromCc = serializeRlu5fDateFromCc(value);
	}
	/**
	 * 	Update Rlu5fDateFromCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromCcString(char[] value) throws CFException {
		 setRlu5fDateFromCc(value);
	}
	/**
	 *	Returns the value of rlu5fDateFromYy
	 *	@return rlu5fDateFromYy
	 */
	public int getRlu5fDateFromYy() throws CFException {
       if (isRlu5fDateFromYyModified()) { 
           rlu5fDateFromYy = refreshRlu5fDateFromYy();
        }
   		return rlu5fDateFromYy;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateFromYy with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-FROM-YY
	 *	@param number
	 */
	public void setRlu5fDateFromYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateFromYy = checkRlu5fDateFromYyMaxLimit(number); 
		serializeRlu5fDateFromYy(rlu5fDateFromYy);
	}
	

	public void setRlu5fDateFromYy(long number) {
	    number = checkRlu5fDateFromYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateFromYy((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateFromYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromYy(char[] value) throws CFException {
		 rlu5fDateFromYy = serializeRlu5fDateFromYy(value);
	}
	/**
	 * 	Update Rlu5fDateFromYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateFromYyString(char[] value) throws CFException {
		 setRlu5fDateFromYy(value);
	}

	
	
	
	/**
	 * 	initializes Rlu5fDateFrom
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fDateFromMm(0);
                     setRlu5fDateFromDd(0);
                     setRlu5fDateFromCc(0);
                     setRlu5fDateFromYy(0);
   }

		public static int getRlu5fDateFromFieldLength() {
			return RLU_5F_DATE_FROM_LENGTH;
		}

}
  
