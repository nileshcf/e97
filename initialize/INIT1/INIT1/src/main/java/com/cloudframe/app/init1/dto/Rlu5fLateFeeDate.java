package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fLateFeeDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rlu5fLateFeeDate extends Rlu5fLateFeeDateSerialized { 
   

								private int rlu5fLateFeeDateMm;

								private int rlu5fLateFeeDateDd;

								private int rlu5fLateFeeDateCc;

								private int rlu5fLateFeeDateYy;
	
	/**
	* Constructor for Rlu5fLateFeeDate
	**/
    public Rlu5fLateFeeDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fLateFeeDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fLateFeeDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fLateFeeDateMm
	 *	@return rlu5fLateFeeDateMm
	 */
	public int getRlu5fLateFeeDateMm() throws CFException {
       if (isRlu5fLateFeeDateMmModified()) { 
           rlu5fLateFeeDateMm = refreshRlu5fLateFeeDateMm();
        }
   		return rlu5fLateFeeDateMm;
	}
	

	
	   
	/**
	 * 	Update Rlu5fLateFeeDateMm with the passed value
	 *  Corresponding COBOL Variable is RLU5F-LATE-FEE-DATE-MM
	 *	@param number
	 */
	public void setRlu5fLateFeeDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fLateFeeDateMm = checkRlu5fLateFeeDateMmMaxLimit(number); 
		serializeRlu5fLateFeeDateMm(rlu5fLateFeeDateMm);
	}
	

	public void setRlu5fLateFeeDateMm(long number) {
	    number = checkRlu5fLateFeeDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fLateFeeDateMm((int)number);
	}
	
	/**
	 * 	Update Rlu5fLateFeeDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateMm(char[] value) throws CFException {
		 rlu5fLateFeeDateMm = serializeRlu5fLateFeeDateMm(value);
	}
	/**
	 * 	Update Rlu5fLateFeeDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateMmString(char[] value) throws CFException {
		 setRlu5fLateFeeDateMm(value);
	}
	/**
	 *	Returns the value of rlu5fLateFeeDateDd
	 *	@return rlu5fLateFeeDateDd
	 */
	public int getRlu5fLateFeeDateDd() throws CFException {
       if (isRlu5fLateFeeDateDdModified()) { 
           rlu5fLateFeeDateDd = refreshRlu5fLateFeeDateDd();
        }
   		return rlu5fLateFeeDateDd;
	}
	

	
	   
	/**
	 * 	Update Rlu5fLateFeeDateDd with the passed value
	 *  Corresponding COBOL Variable is RLU5F-LATE-FEE-DATE-DD
	 *	@param number
	 */
	public void setRlu5fLateFeeDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fLateFeeDateDd = checkRlu5fLateFeeDateDdMaxLimit(number); 
		serializeRlu5fLateFeeDateDd(rlu5fLateFeeDateDd);
	}
	

	public void setRlu5fLateFeeDateDd(long number) {
	    number = checkRlu5fLateFeeDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fLateFeeDateDd((int)number);
	}
	
	/**
	 * 	Update Rlu5fLateFeeDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateDd(char[] value) throws CFException {
		 rlu5fLateFeeDateDd = serializeRlu5fLateFeeDateDd(value);
	}
	/**
	 * 	Update Rlu5fLateFeeDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateDdString(char[] value) throws CFException {
		 setRlu5fLateFeeDateDd(value);
	}
	/**
	 *	Returns the value of rlu5fLateFeeDateCc
	 *	@return rlu5fLateFeeDateCc
	 */
	public int getRlu5fLateFeeDateCc() throws CFException {
       if (isRlu5fLateFeeDateCcModified()) { 
           rlu5fLateFeeDateCc = refreshRlu5fLateFeeDateCc();
        }
   		return rlu5fLateFeeDateCc;
	}
	

	
	   
	/**
	 * 	Update Rlu5fLateFeeDateCc with the passed value
	 *  Corresponding COBOL Variable is RLU5F-LATE-FEE-DATE-CC
	 *	@param number
	 */
	public void setRlu5fLateFeeDateCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fLateFeeDateCc = checkRlu5fLateFeeDateCcMaxLimit(number); 
		serializeRlu5fLateFeeDateCc(rlu5fLateFeeDateCc);
	}
	

	public void setRlu5fLateFeeDateCc(long number) {
	    number = checkRlu5fLateFeeDateCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fLateFeeDateCc((int)number);
	}
	
	/**
	 * 	Update Rlu5fLateFeeDateCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateCc(char[] value) throws CFException {
		 rlu5fLateFeeDateCc = serializeRlu5fLateFeeDateCc(value);
	}
	/**
	 * 	Update Rlu5fLateFeeDateCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateCcString(char[] value) throws CFException {
		 setRlu5fLateFeeDateCc(value);
	}
	/**
	 *	Returns the value of rlu5fLateFeeDateYy
	 *	@return rlu5fLateFeeDateYy
	 */
	public int getRlu5fLateFeeDateYy() throws CFException {
       if (isRlu5fLateFeeDateYyModified()) { 
           rlu5fLateFeeDateYy = refreshRlu5fLateFeeDateYy();
        }
   		return rlu5fLateFeeDateYy;
	}
	

	
	   
	/**
	 * 	Update Rlu5fLateFeeDateYy with the passed value
	 *  Corresponding COBOL Variable is RLU5F-LATE-FEE-DATE-YY
	 *	@param number
	 */
	public void setRlu5fLateFeeDateYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fLateFeeDateYy = checkRlu5fLateFeeDateYyMaxLimit(number); 
		serializeRlu5fLateFeeDateYy(rlu5fLateFeeDateYy);
	}
	

	public void setRlu5fLateFeeDateYy(long number) {
	    number = checkRlu5fLateFeeDateYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fLateFeeDateYy((int)number);
	}
	
	/**
	 * 	Update Rlu5fLateFeeDateYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateYy(char[] value) throws CFException {
		 rlu5fLateFeeDateYy = serializeRlu5fLateFeeDateYy(value);
	}
	/**
	 * 	Update Rlu5fLateFeeDateYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fLateFeeDateYyString(char[] value) throws CFException {
		 setRlu5fLateFeeDateYy(value);
	}

	
	
	
	/**
	 * 	initializes Rlu5fLateFeeDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setRlu5fLateFeeDateMm(0);
                     setRlu5fLateFeeDateDd(0);
                     setRlu5fLateFeeDateCc(0);
                     setRlu5fLateFeeDateYy(0);
   }

		public static int getRlu5fLateFeeDateFieldLength() {
			return RLU_5F_LATE_FEE_DATE_LENGTH;
		}

}
  
