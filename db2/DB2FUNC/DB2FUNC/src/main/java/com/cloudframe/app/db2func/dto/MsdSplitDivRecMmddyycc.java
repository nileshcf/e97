package com.cloudframe.app.db2func.dto;

/**
*  The class MsdSplitDivRecMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdSplitDivRecMmddyycc extends MsdSplitDivRecMmddyyccSerialized { 
   

								private long msdSplitDivRecMmddyy;

								private int msdSplitDivRecCc;
	
	/**
	* Constructor for MsdSplitDivRecMmddyycc
	**/
    public MsdSplitDivRecMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdSplitDivRecMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivRecMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdSplitDivRecMmddyy
	 *	@return msdSplitDivRecMmddyy
	 */
	public long getMsdSplitDivRecMmddyy() throws CFException {
       if (isMsdSplitDivRecMmddyyModified()) { 
           msdSplitDivRecMmddyy = refreshMsdSplitDivRecMmddyy();
        }
   		return msdSplitDivRecMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdSplitDivRecMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-SPLIT-DIV-REC-MMDDYY
	 *	@param number
	 */
	public void setMsdSplitDivRecMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSplitDivRecMmddyy = checkMsdSplitDivRecMmddyyMaxLimit(number); 
		serializeMsdSplitDivRecMmddyy(msdSplitDivRecMmddyy);
	}
	

	/**
	 * 	Update MsdSplitDivRecMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivRecMmddyy(char[] value) throws CFException {
		 msdSplitDivRecMmddyy = serializeMsdSplitDivRecMmddyy(value);
	}
	/**
	 * 	Update MsdSplitDivRecMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivRecMmddyyString(char[] value) throws CFException {
		 setMsdSplitDivRecMmddyy(value);
	}
	/**
	 *	Returns the value of msdSplitDivRecCc
	 *	@return msdSplitDivRecCc
	 */
	public int getMsdSplitDivRecCc() throws CFException {
       if (isMsdSplitDivRecCcModified()) { 
           msdSplitDivRecCc = refreshMsdSplitDivRecCc();
        }
   		return msdSplitDivRecCc;
	}
	

	
	   
	/**
	 * 	Update MsdSplitDivRecCc with the passed value
	 *  Corresponding COBOL Variable is MSD-SPLIT-DIV-REC-CC
	 *	@param number
	 */
	public void setMsdSplitDivRecCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSplitDivRecCc = checkMsdSplitDivRecCcMaxLimit(number); 
		serializeMsdSplitDivRecCc(msdSplitDivRecCc);
	}
	

	public void setMsdSplitDivRecCc(long number) {
	    number = checkMsdSplitDivRecCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdSplitDivRecCc((int)number);
	}
	
	/**
	 * 	Update MsdSplitDivRecCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivRecCc(char[] value) throws CFException {
		 msdSplitDivRecCc = serializeMsdSplitDivRecCc(value);
	}
	/**
	 * 	Update MsdSplitDivRecCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivRecCcString(char[] value) throws CFException {
		 setMsdSplitDivRecCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdSplitDivRecMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdSplitDivRecMmddyy(0);
                     setMsdSplitDivRecCc(0);
   }

		public static int getMsdSplitDivRecMmddyyccFieldLength() {
			return MSD_SPLIT_DIV_REC_MMDDYYCC_LENGTH;
		}

}
  
