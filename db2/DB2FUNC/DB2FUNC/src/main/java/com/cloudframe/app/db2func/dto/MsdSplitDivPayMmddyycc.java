package com.cloudframe.app.db2func.dto;

/**
*  The class MsdSplitDivPayMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdSplitDivPayMmddyycc extends MsdSplitDivPayMmddyyccSerialized { 
   

								private long msdSplitDivPayMmddyy;

								private int msdSplitDivPayCc;
	
	/**
	* Constructor for MsdSplitDivPayMmddyycc
	**/
    public MsdSplitDivPayMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdSplitDivPayMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivPayMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdSplitDivPayMmddyy
	 *	@return msdSplitDivPayMmddyy
	 */
	public long getMsdSplitDivPayMmddyy() throws CFException {
       if (isMsdSplitDivPayMmddyyModified()) { 
           msdSplitDivPayMmddyy = refreshMsdSplitDivPayMmddyy();
        }
   		return msdSplitDivPayMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdSplitDivPayMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-SPLIT-DIV-PAY-MMDDYY
	 *	@param number
	 */
	public void setMsdSplitDivPayMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSplitDivPayMmddyy = checkMsdSplitDivPayMmddyyMaxLimit(number); 
		serializeMsdSplitDivPayMmddyy(msdSplitDivPayMmddyy);
	}
	

	/**
	 * 	Update MsdSplitDivPayMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivPayMmddyy(char[] value) throws CFException {
		 msdSplitDivPayMmddyy = serializeMsdSplitDivPayMmddyy(value);
	}
	/**
	 * 	Update MsdSplitDivPayMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivPayMmddyyString(char[] value) throws CFException {
		 setMsdSplitDivPayMmddyy(value);
	}
	/**
	 *	Returns the value of msdSplitDivPayCc
	 *	@return msdSplitDivPayCc
	 */
	public int getMsdSplitDivPayCc() throws CFException {
       if (isMsdSplitDivPayCcModified()) { 
           msdSplitDivPayCc = refreshMsdSplitDivPayCc();
        }
   		return msdSplitDivPayCc;
	}
	

	
	   
	/**
	 * 	Update MsdSplitDivPayCc with the passed value
	 *  Corresponding COBOL Variable is MSD-SPLIT-DIV-PAY-CC
	 *	@param number
	 */
	public void setMsdSplitDivPayCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSplitDivPayCc = checkMsdSplitDivPayCcMaxLimit(number); 
		serializeMsdSplitDivPayCc(msdSplitDivPayCc);
	}
	

	public void setMsdSplitDivPayCc(long number) {
	    number = checkMsdSplitDivPayCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdSplitDivPayCc((int)number);
	}
	
	/**
	 * 	Update MsdSplitDivPayCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivPayCc(char[] value) throws CFException {
		 msdSplitDivPayCc = serializeMsdSplitDivPayCc(value);
	}
	/**
	 * 	Update MsdSplitDivPayCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivPayCcString(char[] value) throws CFException {
		 setMsdSplitDivPayCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdSplitDivPayMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdSplitDivPayMmddyy(0);
                     setMsdSplitDivPayCc(0);
   }

		public static int getMsdSplitDivPayMmddyyccFieldLength() {
			return MSD_SPLIT_DIV_PAY_MMDDYYCC_LENGTH;
		}

}
  
