package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fCellcryptRenewalRed is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rlu5fCellcryptRenewalRed extends Rlu5fCellcryptRenewalRedSerialized { 
   

								private int rlu5fCellcryptRenewalMm;

								private int rlu5fCellcryptRenewalDd;

								private int rlu5fCellcryptRenewalCc;

								private int rlu5fCellcryptRenewalYy;
	
	/**
	* Constructor for Rlu5fCellcryptRenewalRed
	**/
    public Rlu5fCellcryptRenewalRed() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fCellcryptRenewalRed. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fCellcryptRenewalRed(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fCellcryptRenewalMm
	 *	@return rlu5fCellcryptRenewalMm
	 */
	public int getRlu5fCellcryptRenewalMm() throws CFException {
       if (isRlu5fCellcryptRenewalMmModified()) { 
           rlu5fCellcryptRenewalMm = refreshRlu5fCellcryptRenewalMm();
        }
   		return rlu5fCellcryptRenewalMm;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptRenewalMm with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-RENEWAL-MM
	 *	@param number
	 */
	public void setRlu5fCellcryptRenewalMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptRenewalMm = checkRlu5fCellcryptRenewalMmMaxLimit(number); 
		serializeRlu5fCellcryptRenewalMm(rlu5fCellcryptRenewalMm);
	}
	

	public void setRlu5fCellcryptRenewalMm(long number) {
	    number = checkRlu5fCellcryptRenewalMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptRenewalMm((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptRenewalMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalMm(char[] value) throws CFException {
		 rlu5fCellcryptRenewalMm = serializeRlu5fCellcryptRenewalMm(value);
	}
	/**
	 * 	Update Rlu5fCellcryptRenewalMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalMmString(char[] value) throws CFException {
		 setRlu5fCellcryptRenewalMm(value);
	}
	/**
	 *	Returns the value of rlu5fCellcryptRenewalDd
	 *	@return rlu5fCellcryptRenewalDd
	 */
	public int getRlu5fCellcryptRenewalDd() throws CFException {
       if (isRlu5fCellcryptRenewalDdModified()) { 
           rlu5fCellcryptRenewalDd = refreshRlu5fCellcryptRenewalDd();
        }
   		return rlu5fCellcryptRenewalDd;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptRenewalDd with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-RENEWAL-DD
	 *	@param number
	 */
	public void setRlu5fCellcryptRenewalDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptRenewalDd = checkRlu5fCellcryptRenewalDdMaxLimit(number); 
		serializeRlu5fCellcryptRenewalDd(rlu5fCellcryptRenewalDd);
	}
	

	public void setRlu5fCellcryptRenewalDd(long number) {
	    number = checkRlu5fCellcryptRenewalDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptRenewalDd((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptRenewalDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalDd(char[] value) throws CFException {
		 rlu5fCellcryptRenewalDd = serializeRlu5fCellcryptRenewalDd(value);
	}
	/**
	 * 	Update Rlu5fCellcryptRenewalDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalDdString(char[] value) throws CFException {
		 setRlu5fCellcryptRenewalDd(value);
	}
	/**
	 *	Returns the value of rlu5fCellcryptRenewalCc
	 *	@return rlu5fCellcryptRenewalCc
	 */
	public int getRlu5fCellcryptRenewalCc() throws CFException {
       if (isRlu5fCellcryptRenewalCcModified()) { 
           rlu5fCellcryptRenewalCc = refreshRlu5fCellcryptRenewalCc();
        }
   		return rlu5fCellcryptRenewalCc;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptRenewalCc with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-RENEWAL-CC
	 *	@param number
	 */
	public void setRlu5fCellcryptRenewalCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptRenewalCc = checkRlu5fCellcryptRenewalCcMaxLimit(number); 
		serializeRlu5fCellcryptRenewalCc(rlu5fCellcryptRenewalCc);
	}
	

	public void setRlu5fCellcryptRenewalCc(long number) {
	    number = checkRlu5fCellcryptRenewalCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptRenewalCc((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptRenewalCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalCc(char[] value) throws CFException {
		 rlu5fCellcryptRenewalCc = serializeRlu5fCellcryptRenewalCc(value);
	}
	/**
	 * 	Update Rlu5fCellcryptRenewalCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalCcString(char[] value) throws CFException {
		 setRlu5fCellcryptRenewalCc(value);
	}
	/**
	 *	Returns the value of rlu5fCellcryptRenewalYy
	 *	@return rlu5fCellcryptRenewalYy
	 */
	public int getRlu5fCellcryptRenewalYy() throws CFException {
       if (isRlu5fCellcryptRenewalYyModified()) { 
           rlu5fCellcryptRenewalYy = refreshRlu5fCellcryptRenewalYy();
        }
   		return rlu5fCellcryptRenewalYy;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptRenewalYy with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-RENEWAL-YY
	 *	@param number
	 */
	public void setRlu5fCellcryptRenewalYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptRenewalYy = checkRlu5fCellcryptRenewalYyMaxLimit(number); 
		serializeRlu5fCellcryptRenewalYy(rlu5fCellcryptRenewalYy);
	}
	

	public void setRlu5fCellcryptRenewalYy(long number) {
	    number = checkRlu5fCellcryptRenewalYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptRenewalYy((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptRenewalYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalYy(char[] value) throws CFException {
		 rlu5fCellcryptRenewalYy = serializeRlu5fCellcryptRenewalYy(value);
	}
	/**
	 * 	Update Rlu5fCellcryptRenewalYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptRenewalYyString(char[] value) throws CFException {
		 setRlu5fCellcryptRenewalYy(value);
	}

	
	
	

		public static int getRlu5fCellcryptRenewalRedFieldLength() {
			return RLU_5F_CELLCRYPT_RENEWAL_RED_LENGTH;
		}

}
  
