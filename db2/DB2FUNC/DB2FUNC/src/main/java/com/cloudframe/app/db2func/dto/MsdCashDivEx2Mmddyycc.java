package com.cloudframe.app.db2func.dto;

/**
*  The class MsdCashDivEx2Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdCashDivEx2Mmddyycc extends MsdCashDivEx2MmddyyccSerialized { 
   

								private long msdCashDivEx2Mmddyy;

								private int msdCashDivEx2Cc;
	
	/**
	* Constructor for MsdCashDivEx2Mmddyycc
	**/
    public MsdCashDivEx2Mmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdCashDivEx2Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivEx2Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdCashDivEx2Mmddyy
	 *	@return msdCashDivEx2Mmddyy
	 */
	public long getMsdCashDivEx2Mmddyy() throws CFException {
       if (isMsdCashDivEx2MmddyyModified()) { 
           msdCashDivEx2Mmddyy = refreshMsdCashDivEx2Mmddyy();
        }
   		return msdCashDivEx2Mmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivEx2Mmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-EX2-MMDDYY
	 *	@param number
	 */
	public void setMsdCashDivEx2Mmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivEx2Mmddyy = checkMsdCashDivEx2MmddyyMaxLimit(number); 
		serializeMsdCashDivEx2Mmddyy(msdCashDivEx2Mmddyy);
	}
	

	/**
	 * 	Update MsdCashDivEx2Mmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx2Mmddyy(char[] value) throws CFException {
		 msdCashDivEx2Mmddyy = serializeMsdCashDivEx2Mmddyy(value);
	}
	/**
	 * 	Update MsdCashDivEx2Mmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx2MmddyyString(char[] value) throws CFException {
		 setMsdCashDivEx2Mmddyy(value);
	}
	/**
	 *	Returns the value of msdCashDivEx2Cc
	 *	@return msdCashDivEx2Cc
	 */
	public int getMsdCashDivEx2Cc() throws CFException {
       if (isMsdCashDivEx2CcModified()) { 
           msdCashDivEx2Cc = refreshMsdCashDivEx2Cc();
        }
   		return msdCashDivEx2Cc;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivEx2Cc with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-EX2-CC
	 *	@param number
	 */
	public void setMsdCashDivEx2Cc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivEx2Cc = checkMsdCashDivEx2CcMaxLimit(number); 
		serializeMsdCashDivEx2Cc(msdCashDivEx2Cc);
	}
	

	public void setMsdCashDivEx2Cc(long number) {
	    number = checkMsdCashDivEx2CcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdCashDivEx2Cc((int)number);
	}
	
	/**
	 * 	Update MsdCashDivEx2Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx2Cc(char[] value) throws CFException {
		 msdCashDivEx2Cc = serializeMsdCashDivEx2Cc(value);
	}
	/**
	 * 	Update MsdCashDivEx2Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx2CcString(char[] value) throws CFException {
		 setMsdCashDivEx2Cc(value);
	}

	
	
	
	/**
	 * 	initializes MsdCashDivEx2Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivEx2Mmddyy(0);
                     setMsdCashDivEx2Cc(0);
   }

		public static int getMsdCashDivEx2MmddyyccFieldLength() {
			return MSD_CASH_DIV_EX_2_MMDDYYCC_LENGTH;
		}

}
  
