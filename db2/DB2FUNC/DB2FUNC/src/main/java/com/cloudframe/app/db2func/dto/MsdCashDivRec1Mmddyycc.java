package com.cloudframe.app.db2func.dto;

/**
*  The class MsdCashDivRec1Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdCashDivRec1Mmddyycc extends MsdCashDivRec1MmddyyccSerialized { 
   

								private long msdCashDivRec1Mmddyy;

								private int msdCashDivRec1Cc;
	
	/**
	* Constructor for MsdCashDivRec1Mmddyycc
	**/
    public MsdCashDivRec1Mmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdCashDivRec1Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivRec1Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdCashDivRec1Mmddyy
	 *	@return msdCashDivRec1Mmddyy
	 */
	public long getMsdCashDivRec1Mmddyy() throws CFException {
       if (isMsdCashDivRec1MmddyyModified()) { 
           msdCashDivRec1Mmddyy = refreshMsdCashDivRec1Mmddyy();
        }
   		return msdCashDivRec1Mmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivRec1Mmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-REC1-MMDDYY
	 *	@param number
	 */
	public void setMsdCashDivRec1Mmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivRec1Mmddyy = checkMsdCashDivRec1MmddyyMaxLimit(number); 
		serializeMsdCashDivRec1Mmddyy(msdCashDivRec1Mmddyy);
	}
	

	/**
	 * 	Update MsdCashDivRec1Mmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec1Mmddyy(char[] value) throws CFException {
		 msdCashDivRec1Mmddyy = serializeMsdCashDivRec1Mmddyy(value);
	}
	/**
	 * 	Update MsdCashDivRec1Mmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec1MmddyyString(char[] value) throws CFException {
		 setMsdCashDivRec1Mmddyy(value);
	}
	/**
	 *	Returns the value of msdCashDivRec1Cc
	 *	@return msdCashDivRec1Cc
	 */
	public int getMsdCashDivRec1Cc() throws CFException {
       if (isMsdCashDivRec1CcModified()) { 
           msdCashDivRec1Cc = refreshMsdCashDivRec1Cc();
        }
   		return msdCashDivRec1Cc;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivRec1Cc with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-REC1-CC
	 *	@param number
	 */
	public void setMsdCashDivRec1Cc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivRec1Cc = checkMsdCashDivRec1CcMaxLimit(number); 
		serializeMsdCashDivRec1Cc(msdCashDivRec1Cc);
	}
	

	public void setMsdCashDivRec1Cc(long number) {
	    number = checkMsdCashDivRec1CcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdCashDivRec1Cc((int)number);
	}
	
	/**
	 * 	Update MsdCashDivRec1Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec1Cc(char[] value) throws CFException {
		 msdCashDivRec1Cc = serializeMsdCashDivRec1Cc(value);
	}
	/**
	 * 	Update MsdCashDivRec1Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec1CcString(char[] value) throws CFException {
		 setMsdCashDivRec1Cc(value);
	}

	
	
	
	/**
	 * 	initializes MsdCashDivRec1Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivRec1Mmddyy(0);
                     setMsdCashDivRec1Cc(0);
   }

		public static int getMsdCashDivRec1MmddyyccFieldLength() {
			return MSD_CASH_DIV_REC_1_MMDDYYCC_LENGTH;
		}

}
  
