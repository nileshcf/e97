package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fDateTo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rlu5fDateTo extends Rlu5fDateToSerialized { 
   

								private int rlu5fDateToMm;

								private int rlu5fDateToDd;

								private int rlu5fDateToCc;

								private int rlu5fDateToYy;
	
	/**
	* Constructor for Rlu5fDateTo
	**/
    public Rlu5fDateTo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fDateTo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDateTo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fDateToMm
	 *	@return rlu5fDateToMm
	 */
	public int getRlu5fDateToMm() throws CFException {
       if (isRlu5fDateToMmModified()) { 
           rlu5fDateToMm = refreshRlu5fDateToMm();
        }
   		return rlu5fDateToMm;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateToMm with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-TO-MM
	 *	@param number
	 */
	public void setRlu5fDateToMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateToMm = checkRlu5fDateToMmMaxLimit(number); 
		serializeRlu5fDateToMm(rlu5fDateToMm);
	}
	

	public void setRlu5fDateToMm(long number) {
	    number = checkRlu5fDateToMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateToMm((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateToMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToMm(char[] value) throws CFException {
		 rlu5fDateToMm = serializeRlu5fDateToMm(value);
	}
	/**
	 * 	Update Rlu5fDateToMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToMmString(char[] value) throws CFException {
		 setRlu5fDateToMm(value);
	}
	/**
	 *	Returns the value of rlu5fDateToDd
	 *	@return rlu5fDateToDd
	 */
	public int getRlu5fDateToDd() throws CFException {
       if (isRlu5fDateToDdModified()) { 
           rlu5fDateToDd = refreshRlu5fDateToDd();
        }
   		return rlu5fDateToDd;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateToDd with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-TO-DD
	 *	@param number
	 */
	public void setRlu5fDateToDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateToDd = checkRlu5fDateToDdMaxLimit(number); 
		serializeRlu5fDateToDd(rlu5fDateToDd);
	}
	

	public void setRlu5fDateToDd(long number) {
	    number = checkRlu5fDateToDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateToDd((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateToDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToDd(char[] value) throws CFException {
		 rlu5fDateToDd = serializeRlu5fDateToDd(value);
	}
	/**
	 * 	Update Rlu5fDateToDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToDdString(char[] value) throws CFException {
		 setRlu5fDateToDd(value);
	}
	/**
	 *	Returns the value of rlu5fDateToCc
	 *	@return rlu5fDateToCc
	 */
	public int getRlu5fDateToCc() throws CFException {
       if (isRlu5fDateToCcModified()) { 
           rlu5fDateToCc = refreshRlu5fDateToCc();
        }
   		return rlu5fDateToCc;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateToCc with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-TO-CC
	 *	@param number
	 */
	public void setRlu5fDateToCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateToCc = checkRlu5fDateToCcMaxLimit(number); 
		serializeRlu5fDateToCc(rlu5fDateToCc);
	}
	

	public void setRlu5fDateToCc(long number) {
	    number = checkRlu5fDateToCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateToCc((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateToCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToCc(char[] value) throws CFException {
		 rlu5fDateToCc = serializeRlu5fDateToCc(value);
	}
	/**
	 * 	Update Rlu5fDateToCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToCcString(char[] value) throws CFException {
		 setRlu5fDateToCc(value);
	}
	/**
	 *	Returns the value of rlu5fDateToYy
	 *	@return rlu5fDateToYy
	 */
	public int getRlu5fDateToYy() throws CFException {
       if (isRlu5fDateToYyModified()) { 
           rlu5fDateToYy = refreshRlu5fDateToYy();
        }
   		return rlu5fDateToYy;
	}
	

	
	   
	/**
	 * 	Update Rlu5fDateToYy with the passed value
	 *  Corresponding COBOL Variable is RLU5F-DATE-TO-YY
	 *	@param number
	 */
	public void setRlu5fDateToYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fDateToYy = checkRlu5fDateToYyMaxLimit(number); 
		serializeRlu5fDateToYy(rlu5fDateToYy);
	}
	

	public void setRlu5fDateToYy(long number) {
	    number = checkRlu5fDateToYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fDateToYy((int)number);
	}
	
	/**
	 * 	Update Rlu5fDateToYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToYy(char[] value) throws CFException {
		 rlu5fDateToYy = serializeRlu5fDateToYy(value);
	}
	/**
	 * 	Update Rlu5fDateToYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fDateToYyString(char[] value) throws CFException {
		 setRlu5fDateToYy(value);
	}

	
	
	
	/**
	 * 	initializes Rlu5fDateTo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fDateToMm(0);
                     setRlu5fDateToDd(0);
                     setRlu5fDateToCc(0);
                     setRlu5fDateToYy(0);
   }

		public static int getRlu5fDateToFieldLength() {
			return RLU_5F_DATE_TO_LENGTH;
		}

}
  
