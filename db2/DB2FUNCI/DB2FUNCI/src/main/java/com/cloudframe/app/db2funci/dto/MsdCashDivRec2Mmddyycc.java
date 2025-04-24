package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdCashDivRec2Mmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdCashDivRec2Mmddyycc extends MsdCashDivRec2MmddyyccSerialized { 
   

								private long msdCashDivRec2Mmddyy;

								private int msdCashDivRec2Cc;
	
	/**
	* Constructor for MsdCashDivRec2Mmddyycc
	**/
    public MsdCashDivRec2Mmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdCashDivRec2Mmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdCashDivRec2Mmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdCashDivRec2Mmddyy
	 *	@return msdCashDivRec2Mmddyy
	 */
	public long getMsdCashDivRec2Mmddyy() throws CFException {
       if (isMsdCashDivRec2MmddyyModified()) { 
           msdCashDivRec2Mmddyy = refreshMsdCashDivRec2Mmddyy();
        }
   		return msdCashDivRec2Mmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivRec2Mmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-REC2-MMDDYY
	 *	@param number
	 */
	public void setMsdCashDivRec2Mmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivRec2Mmddyy = checkMsdCashDivRec2MmddyyMaxLimit(number); 
		serializeMsdCashDivRec2Mmddyy(msdCashDivRec2Mmddyy);
	}
	

	/**
	 * 	Update MsdCashDivRec2Mmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec2Mmddyy(char[] value) throws CFException {
		 msdCashDivRec2Mmddyy = serializeMsdCashDivRec2Mmddyy(value);
	}
	/**
	 * 	Update MsdCashDivRec2Mmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec2MmddyyString(char[] value) throws CFException {
		 setMsdCashDivRec2Mmddyy(value);
	}
	/**
	 *	Returns the value of msdCashDivRec2Cc
	 *	@return msdCashDivRec2Cc
	 */
	public int getMsdCashDivRec2Cc() throws CFException {
       if (isMsdCashDivRec2CcModified()) { 
           msdCashDivRec2Cc = refreshMsdCashDivRec2Cc();
        }
   		return msdCashDivRec2Cc;
	}
	

	
	   
	/**
	 * 	Update MsdCashDivRec2Cc with the passed value
	 *  Corresponding COBOL Variable is MSD-CASH-DIV-REC2-CC
	 *	@param number
	 */
	public void setMsdCashDivRec2Cc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdCashDivRec2Cc = checkMsdCashDivRec2CcMaxLimit(number); 
		serializeMsdCashDivRec2Cc(msdCashDivRec2Cc);
	}
	

	public void setMsdCashDivRec2Cc(long number) {
	    number = checkMsdCashDivRec2CcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdCashDivRec2Cc((int)number);
	}
	
	/**
	 * 	Update MsdCashDivRec2Cc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec2Cc(char[] value) throws CFException {
		 msdCashDivRec2Cc = serializeMsdCashDivRec2Cc(value);
	}
	/**
	 * 	Update MsdCashDivRec2Cc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdCashDivRec2CcString(char[] value) throws CFException {
		 setMsdCashDivRec2Cc(value);
	}

	
	
	
	/**
	 * 	initializes MsdCashDivRec2Mmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdCashDivRec2Mmddyy(0);
                     setMsdCashDivRec2Cc(0);
   }

		public static int getMsdCashDivRec2MmddyyccFieldLength() {
			return MSD_CASH_DIV_REC_2_MMDDYYCC_LENGTH;
		}

}
  
