package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdCashDivPay1Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdCashDivPay1Mmddyycc extends MsdCashDivPay1MmddyyccSerialized { 
   

								private long msdCashDivPay1Mmddyy;

								private int msdCashDivPay1Cc;
	
	/**
	* Constructor for MsdCashDivPay1Mmddyycc
	**/
    public MsdCashDivPay1Mmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdCashDivPay1Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivPay1Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdCashDivPay1Mmddyy
	 *	@return msdCashDivPay1Mmddyy
	 */
	public long getMsdCashDivPay1Mmddyy() throws CFException {
       if (isMsdCashDivPay1MmddyyModified()) { 
           msdCashDivPay1Mmddyy = refreshMsdCashDivPay1Mmddyy();
        }
   		return msdCashDivPay1Mmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivPay1Mmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-PAY1-MMDDYY
	 *	@param number
	 */
	public void setMsdCashDivPay1Mmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivPay1Mmddyy = checkMsdCashDivPay1MmddyyMaxLimit(number); 
		serializeMsdCashDivPay1Mmddyy(msdCashDivPay1Mmddyy);
	}
	

	/**
	 * 	Update MsdCashDivPay1Mmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay1Mmddyy(char[] value) throws CFException {
		 msdCashDivPay1Mmddyy = serializeMsdCashDivPay1Mmddyy(value);
	}
	/**
	 * 	Update MsdCashDivPay1Mmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay1MmddyyString(char[] value) throws CFException {
		 setMsdCashDivPay1Mmddyy(value);
	}
	/**
	 *	Returns the value of msdCashDivPay1Cc
	 *	@return msdCashDivPay1Cc
	 */
	public int getMsdCashDivPay1Cc() throws CFException {
       if (isMsdCashDivPay1CcModified()) { 
           msdCashDivPay1Cc = refreshMsdCashDivPay1Cc();
        }
   		return msdCashDivPay1Cc;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivPay1Cc with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-PAY1-CC
	 *	@param number
	 */
	public void setMsdCashDivPay1Cc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivPay1Cc = checkMsdCashDivPay1CcMaxLimit(number); 
		serializeMsdCashDivPay1Cc(msdCashDivPay1Cc);
	}
	

	public void setMsdCashDivPay1Cc(long number) {
	    number = checkMsdCashDivPay1CcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdCashDivPay1Cc((int)number);
	}
	
	/**
	 * 	Update MsdCashDivPay1Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay1Cc(char[] value) throws CFException {
		 msdCashDivPay1Cc = serializeMsdCashDivPay1Cc(value);
	}
	/**
	 * 	Update MsdCashDivPay1Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay1CcString(char[] value) throws CFException {
		 setMsdCashDivPay1Cc(value);
	}

	
	
	
	/**
	 * 	initializes MsdCashDivPay1Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivPay1Mmddyy(0);
                     setMsdCashDivPay1Cc(0);
   }

		public static int getMsdCashDivPay1MmddyyccFieldLength() {
			return MSD_CASH_DIV_PAY_1_MMDDYYCC_LENGTH;
		}

}
  
