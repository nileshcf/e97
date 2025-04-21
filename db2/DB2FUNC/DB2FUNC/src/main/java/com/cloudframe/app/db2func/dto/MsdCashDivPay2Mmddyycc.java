package com.cloudframe.app.db2func.dto;

/**
*  The class MsdCashDivPay2Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdCashDivPay2Mmddyycc extends MsdCashDivPay2MmddyyccSerialized { 
   

								private long msdCashDivPay2Mmddyy;

								private int msdCashDivPay2Cc;
	
	/**
	* Constructor for MsdCashDivPay2Mmddyycc
	**/
    public MsdCashDivPay2Mmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdCashDivPay2Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivPay2Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdCashDivPay2Mmddyy
	 *	@return msdCashDivPay2Mmddyy
	 */
	public long getMsdCashDivPay2Mmddyy() throws CFException {
       if (isMsdCashDivPay2MmddyyModified()) { 
           msdCashDivPay2Mmddyy = refreshMsdCashDivPay2Mmddyy();
        }
   		return msdCashDivPay2Mmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivPay2Mmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-PAY2-MMDDYY
	 *	@param number
	 */
	public void setMsdCashDivPay2Mmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivPay2Mmddyy = checkMsdCashDivPay2MmddyyMaxLimit(number); 
		serializeMsdCashDivPay2Mmddyy(msdCashDivPay2Mmddyy);
	}
	

	/**
	 * 	Update MsdCashDivPay2Mmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay2Mmddyy(char[] value) throws CFException {
		 msdCashDivPay2Mmddyy = serializeMsdCashDivPay2Mmddyy(value);
	}
	/**
	 * 	Update MsdCashDivPay2Mmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay2MmddyyString(char[] value) throws CFException {
		 setMsdCashDivPay2Mmddyy(value);
	}
	/**
	 *	Returns the value of msdCashDivPay2Cc
	 *	@return msdCashDivPay2Cc
	 */
	public int getMsdCashDivPay2Cc() throws CFException {
       if (isMsdCashDivPay2CcModified()) { 
           msdCashDivPay2Cc = refreshMsdCashDivPay2Cc();
        }
   		return msdCashDivPay2Cc;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivPay2Cc with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-PAY2-CC
	 *	@param number
	 */
	public void setMsdCashDivPay2Cc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivPay2Cc = checkMsdCashDivPay2CcMaxLimit(number); 
		serializeMsdCashDivPay2Cc(msdCashDivPay2Cc);
	}
	

	public void setMsdCashDivPay2Cc(long number) {
	    number = checkMsdCashDivPay2CcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdCashDivPay2Cc((int)number);
	}
	
	/**
	 * 	Update MsdCashDivPay2Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay2Cc(char[] value) throws CFException {
		 msdCashDivPay2Cc = serializeMsdCashDivPay2Cc(value);
	}
	/**
	 * 	Update MsdCashDivPay2Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivPay2CcString(char[] value) throws CFException {
		 setMsdCashDivPay2Cc(value);
	}

	
	
	
	/**
	 * 	initializes MsdCashDivPay2Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivPay2Mmddyy(0);
                     setMsdCashDivPay2Cc(0);
   }

		public static int getMsdCashDivPay2MmddyyccFieldLength() {
			return MSD_CASH_DIV_PAY_2_MMDDYYCC_LENGTH;
		}

}
  
