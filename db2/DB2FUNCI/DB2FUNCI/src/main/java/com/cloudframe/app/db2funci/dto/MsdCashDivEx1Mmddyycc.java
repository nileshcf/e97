package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdCashDivEx1Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdCashDivEx1Mmddyycc extends MsdCashDivEx1MmddyyccSerialized { 
   

								private long msdCashDivEx1Mmddyy;

								private int msdCashDivEx1Cc;
	
	/**
	* Constructor for MsdCashDivEx1Mmddyycc
	**/
    public MsdCashDivEx1Mmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdCashDivEx1Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivEx1Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdCashDivEx1Mmddyy
	 *	@return msdCashDivEx1Mmddyy
	 */
	public long getMsdCashDivEx1Mmddyy() throws CFException {
       if (isMsdCashDivEx1MmddyyModified()) { 
           msdCashDivEx1Mmddyy = refreshMsdCashDivEx1Mmddyy();
        }
   		return msdCashDivEx1Mmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivEx1Mmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-EX1-MMDDYY
	 *	@param number
	 */
	public void setMsdCashDivEx1Mmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivEx1Mmddyy = checkMsdCashDivEx1MmddyyMaxLimit(number); 
		serializeMsdCashDivEx1Mmddyy(msdCashDivEx1Mmddyy);
	}
	

	/**
	 * 	Update MsdCashDivEx1Mmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx1Mmddyy(char[] value) throws CFException {
		 msdCashDivEx1Mmddyy = serializeMsdCashDivEx1Mmddyy(value);
	}
	/**
	 * 	Update MsdCashDivEx1Mmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx1MmddyyString(char[] value) throws CFException {
		 setMsdCashDivEx1Mmddyy(value);
	}
	/**
	 *	Returns the value of msdCashDivEx1Cc
	 *	@return msdCashDivEx1Cc
	 */
	public int getMsdCashDivEx1Cc() throws CFException {
       if (isMsdCashDivEx1CcModified()) { 
           msdCashDivEx1Cc = refreshMsdCashDivEx1Cc();
        }
   		return msdCashDivEx1Cc;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivEx1Cc with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-EX1-CC
	 *	@param number
	 */
	public void setMsdCashDivEx1Cc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivEx1Cc = checkMsdCashDivEx1CcMaxLimit(number); 
		serializeMsdCashDivEx1Cc(msdCashDivEx1Cc);
	}
	

	public void setMsdCashDivEx1Cc(long number) {
	    number = checkMsdCashDivEx1CcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdCashDivEx1Cc((int)number);
	}
	
	/**
	 * 	Update MsdCashDivEx1Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx1Cc(char[] value) throws CFException {
		 msdCashDivEx1Cc = serializeMsdCashDivEx1Cc(value);
	}
	/**
	 * 	Update MsdCashDivEx1Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivEx1CcString(char[] value) throws CFException {
		 setMsdCashDivEx1Cc(value);
	}

	
	
	
	/**
	 * 	initializes MsdCashDivEx1Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivEx1Mmddyy(0);
                     setMsdCashDivEx1Cc(0);
   }

		public static int getMsdCashDivEx1MmddyyccFieldLength() {
			return MSD_CASH_DIV_EX_1_MMDDYYCC_LENGTH;
		}

}
  
