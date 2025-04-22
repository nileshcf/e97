package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdSplitDivExMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdSplitDivExMmddyycc extends MsdSplitDivExMmddyyccSerialized { 
   

								private long msdSplitDivExMmddyy;

								private int msdSplitDivExCc;
	
	/**
	* Constructor for MsdSplitDivExMmddyycc
	**/
    public MsdSplitDivExMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdSplitDivExMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdSplitDivExMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdSplitDivExMmddyy
	 *	@return msdSplitDivExMmddyy
	 */
	public long getMsdSplitDivExMmddyy() throws CFException {
       if (isMsdSplitDivExMmddyyModified()) { 
           msdSplitDivExMmddyy = refreshMsdSplitDivExMmddyy();
        }
   		return msdSplitDivExMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdSplitDivExMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-SPLIT-DIV-EX-MMDDYY
	 *	@param number
	 */
	public void setMsdSplitDivExMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSplitDivExMmddyy = checkMsdSplitDivExMmddyyMaxLimit(number); 
		serializeMsdSplitDivExMmddyy(msdSplitDivExMmddyy);
	}
	

	/**
	 * 	Update MsdSplitDivExMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivExMmddyy(char[] value) throws CFException {
		 msdSplitDivExMmddyy = serializeMsdSplitDivExMmddyy(value);
	}
	/**
	 * 	Update MsdSplitDivExMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivExMmddyyString(char[] value) throws CFException {
		 setMsdSplitDivExMmddyy(value);
	}
	/**
	 *	Returns the value of msdSplitDivExCc
	 *	@return msdSplitDivExCc
	 */
	public int getMsdSplitDivExCc() throws CFException {
       if (isMsdSplitDivExCcModified()) { 
           msdSplitDivExCc = refreshMsdSplitDivExCc();
        }
   		return msdSplitDivExCc;
	}
	

	
	   
	/**
	 * 	Update MsdSplitDivExCc with the passed value
	 *  Corresponding COBOL Variable is MSD-SPLIT-DIV-EX-CC
	 *	@param number
	 */
	public void setMsdSplitDivExCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdSplitDivExCc = checkMsdSplitDivExCcMaxLimit(number); 
		serializeMsdSplitDivExCc(msdSplitDivExCc);
	}
	

	public void setMsdSplitDivExCc(long number) {
	    number = checkMsdSplitDivExCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdSplitDivExCc((int)number);
	}
	
	/**
	 * 	Update MsdSplitDivExCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivExCc(char[] value) throws CFException {
		 msdSplitDivExCc = serializeMsdSplitDivExCc(value);
	}
	/**
	 * 	Update MsdSplitDivExCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdSplitDivExCcString(char[] value) throws CFException {
		 setMsdSplitDivExCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdSplitDivExMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdSplitDivExMmddyy(0);
                     setMsdSplitDivExCc(0);
   }

		public static int getMsdSplitDivExMmddyyccFieldLength() {
			return MSD_SPLIT_DIV_EX_MMDDYYCC_LENGTH;
		}

}
  
