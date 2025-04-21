package com.cloudframe.app.init1.dto;

/**
*  The class Rlu5fCellcryptTransactionRd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rlu5fCellcryptTransactionRd extends Rlu5fCellcryptTransactionRdSerialized { 
   

								private int rlu5fCellcryptTransactionMm;

								private int rlu5fCellcryptTransactionDd;

								private int rlu5fCellcryptTransactionCc;

								private int rlu5fCellcryptTransactionYy;
	
	/**
	* Constructor for Rlu5fCellcryptTransactionRd
	**/
    public Rlu5fCellcryptTransactionRd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rlu5fCellcryptTransactionRd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fCellcryptTransactionRd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlu5fCellcryptTransactionMm
	 *	@return rlu5fCellcryptTransactionMm
	 */
	public int getRlu5fCellcryptTransactionMm() throws CFException {
       if (isRlu5fCellcryptTransactionMmModified()) { 
           rlu5fCellcryptTransactionMm = refreshRlu5fCellcryptTransactionMm();
        }
   		return rlu5fCellcryptTransactionMm;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptTransactionMm with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-TRANSACTION-MM
	 *	@param number
	 */
	public void setRlu5fCellcryptTransactionMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptTransactionMm = checkRlu5fCellcryptTransactionMmMaxLimit(number); 
		serializeRlu5fCellcryptTransactionMm(rlu5fCellcryptTransactionMm);
	}
	

	public void setRlu5fCellcryptTransactionMm(long number) {
	    number = checkRlu5fCellcryptTransactionMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptTransactionMm((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptTransactionMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionMm(char[] value) throws CFException {
		 rlu5fCellcryptTransactionMm = serializeRlu5fCellcryptTransactionMm(value);
	}
	/**
	 * 	Update Rlu5fCellcryptTransactionMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionMmString(char[] value) throws CFException {
		 setRlu5fCellcryptTransactionMm(value);
	}
	/**
	 *	Returns the value of rlu5fCellcryptTransactionDd
	 *	@return rlu5fCellcryptTransactionDd
	 */
	public int getRlu5fCellcryptTransactionDd() throws CFException {
       if (isRlu5fCellcryptTransactionDdModified()) { 
           rlu5fCellcryptTransactionDd = refreshRlu5fCellcryptTransactionDd();
        }
   		return rlu5fCellcryptTransactionDd;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptTransactionDd with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-TRANSACTION-DD
	 *	@param number
	 */
	public void setRlu5fCellcryptTransactionDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptTransactionDd = checkRlu5fCellcryptTransactionDdMaxLimit(number); 
		serializeRlu5fCellcryptTransactionDd(rlu5fCellcryptTransactionDd);
	}
	

	public void setRlu5fCellcryptTransactionDd(long number) {
	    number = checkRlu5fCellcryptTransactionDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptTransactionDd((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptTransactionDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionDd(char[] value) throws CFException {
		 rlu5fCellcryptTransactionDd = serializeRlu5fCellcryptTransactionDd(value);
	}
	/**
	 * 	Update Rlu5fCellcryptTransactionDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionDdString(char[] value) throws CFException {
		 setRlu5fCellcryptTransactionDd(value);
	}
	/**
	 *	Returns the value of rlu5fCellcryptTransactionCc
	 *	@return rlu5fCellcryptTransactionCc
	 */
	public int getRlu5fCellcryptTransactionCc() throws CFException {
       if (isRlu5fCellcryptTransactionCcModified()) { 
           rlu5fCellcryptTransactionCc = refreshRlu5fCellcryptTransactionCc();
        }
   		return rlu5fCellcryptTransactionCc;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptTransactionCc with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-TRANSACTION-CC
	 *	@param number
	 */
	public void setRlu5fCellcryptTransactionCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptTransactionCc = checkRlu5fCellcryptTransactionCcMaxLimit(number); 
		serializeRlu5fCellcryptTransactionCc(rlu5fCellcryptTransactionCc);
	}
	

	public void setRlu5fCellcryptTransactionCc(long number) {
	    number = checkRlu5fCellcryptTransactionCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptTransactionCc((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptTransactionCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionCc(char[] value) throws CFException {
		 rlu5fCellcryptTransactionCc = serializeRlu5fCellcryptTransactionCc(value);
	}
	/**
	 * 	Update Rlu5fCellcryptTransactionCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionCcString(char[] value) throws CFException {
		 setRlu5fCellcryptTransactionCc(value);
	}
	/**
	 *	Returns the value of rlu5fCellcryptTransactionYy
	 *	@return rlu5fCellcryptTransactionYy
	 */
	public int getRlu5fCellcryptTransactionYy() throws CFException {
       if (isRlu5fCellcryptTransactionYyModified()) { 
           rlu5fCellcryptTransactionYy = refreshRlu5fCellcryptTransactionYy();
        }
   		return rlu5fCellcryptTransactionYy;
	}
	

	
	   
	/**
	 * 	Update Rlu5fCellcryptTransactionYy with the passed value
	 *  Corresponding COBOL Variable is RLU5F-CELLCRYPT-TRANSACTION-YY
	 *	@param number
	 */
	public void setRlu5fCellcryptTransactionYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rlu5fCellcryptTransactionYy = checkRlu5fCellcryptTransactionYyMaxLimit(number); 
		serializeRlu5fCellcryptTransactionYy(rlu5fCellcryptTransactionYy);
	}
	

	public void setRlu5fCellcryptTransactionYy(long number) {
	    number = checkRlu5fCellcryptTransactionYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRlu5fCellcryptTransactionYy((int)number);
	}
	
	/**
	 * 	Update Rlu5fCellcryptTransactionYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionYy(char[] value) throws CFException {
		 rlu5fCellcryptTransactionYy = serializeRlu5fCellcryptTransactionYy(value);
	}
	/**
	 * 	Update Rlu5fCellcryptTransactionYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRlu5fCellcryptTransactionYyString(char[] value) throws CFException {
		 setRlu5fCellcryptTransactionYy(value);
	}

	
	
	

		public static int getRlu5fCellcryptTransactionRdFieldLength() {
			return RLU_5F_CELLCRYPT_TRANSACTION_RD_LENGTH;
		}

}
  
