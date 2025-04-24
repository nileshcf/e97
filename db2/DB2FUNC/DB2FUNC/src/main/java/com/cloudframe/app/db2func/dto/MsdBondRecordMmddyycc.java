package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondRecordMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondRecordMmddyycc extends MsdBondRecordMmddyyccSerialized { 
   

								private long msdBondRecordMmddyy;

								private int msdBondRecordCc;
	
	/**
	* Constructor for MsdBondRecordMmddyycc
	**/
    public MsdBondRecordMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondRecordMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondRecordMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdBondRecordMmddyy
	 *	@return msdBondRecordMmddyy
	 */
	public long getMsdBondRecordMmddyy() throws CFException {
       if (isMsdBondRecordMmddyyModified()) { 
           msdBondRecordMmddyy = refreshMsdBondRecordMmddyy();
        }
   		return msdBondRecordMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdBondRecordMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-RECORD-MMDDYY
	 *	@param number
	 */
	public void setMsdBondRecordMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondRecordMmddyy = checkMsdBondRecordMmddyyMaxLimit(number); 
		serializeMsdBondRecordMmddyy(msdBondRecordMmddyy);
	}
	

	/**
	 * 	Update MsdBondRecordMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondRecordMmddyy(char[] value) throws CFException {
		 msdBondRecordMmddyy = serializeMsdBondRecordMmddyy(value);
	}
	/**
	 * 	Update MsdBondRecordMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondRecordMmddyyString(char[] value) throws CFException {
		 setMsdBondRecordMmddyy(value);
	}
	/**
	 *	Returns the value of msdBondRecordCc
	 *	@return msdBondRecordCc
	 */
	public int getMsdBondRecordCc() throws CFException {
       if (isMsdBondRecordCcModified()) { 
           msdBondRecordCc = refreshMsdBondRecordCc();
        }
   		return msdBondRecordCc;
	}
	

	
	   
	/**
	 * 	Update MsdBondRecordCc with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-RECORD-CC
	 *	@param number
	 */
	public void setMsdBondRecordCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondRecordCc = checkMsdBondRecordCcMaxLimit(number); 
		serializeMsdBondRecordCc(msdBondRecordCc);
	}
	

	public void setMsdBondRecordCc(long number) {
	    number = checkMsdBondRecordCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondRecordCc((int)number);
	}
	
	/**
	 * 	Update MsdBondRecordCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondRecordCc(char[] value) throws CFException {
		 msdBondRecordCc = serializeMsdBondRecordCc(value);
	}
	/**
	 * 	Update MsdBondRecordCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondRecordCcString(char[] value) throws CFException {
		 setMsdBondRecordCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondRecordMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondRecordMmddyy(0);
                     setMsdBondRecordCc(0);
   }

		public static int getMsdBondRecordMmddyyccFieldLength() {
			return MSD_BOND_RECORD_MMDDYYCC_LENGTH;
		}

}
  
