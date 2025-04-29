package com.cloudframe.app.db2func.dto;

/**
*  The class MsdStockDivRecMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdStockDivRecMmddyycc extends MsdStockDivRecMmddyyccSerialized { 
   

								private long msdStockDivRecMmddyy;

								private int msdStockDivRecCc;
	
	/**
	* Constructor for MsdStockDivRecMmddyycc
	**/
    public MsdStockDivRecMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdStockDivRecMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivRecMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdStockDivRecMmddyy
	 *	@return msdStockDivRecMmddyy
	 */
	public long getMsdStockDivRecMmddyy() throws CFException {
       if (isMsdStockDivRecMmddyyModified()) { 
           msdStockDivRecMmddyy = refreshMsdStockDivRecMmddyy();
        }
   		return msdStockDivRecMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdStockDivRecMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-STOCK-DIV-REC-MMDDYY
	 *	@param number
	 */
	public void setMsdStockDivRecMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStockDivRecMmddyy = checkMsdStockDivRecMmddyyMaxLimit(number); 
		serializeMsdStockDivRecMmddyy(msdStockDivRecMmddyy);
	}
	

	/**
	 * 	Update MsdStockDivRecMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivRecMmddyy(char[] value) throws CFException {
		 msdStockDivRecMmddyy = serializeMsdStockDivRecMmddyy(value);
	}
	/**
	 * 	Update MsdStockDivRecMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivRecMmddyyString(char[] value) throws CFException {
		 setMsdStockDivRecMmddyy(value);
	}
	/**
	 *	Returns the value of msdStockDivRecCc
	 *	@return msdStockDivRecCc
	 */
	public int getMsdStockDivRecCc() throws CFException {
       if (isMsdStockDivRecCcModified()) { 
           msdStockDivRecCc = refreshMsdStockDivRecCc();
        }
   		return msdStockDivRecCc;
	}
	

	
	   
	/**
	 * 	Update MsdStockDivRecCc with the passed value
	 *  Corresponding COBOL Variable is MSD-STOCK-DIV-REC-CC
	 *	@param number
	 */
	public void setMsdStockDivRecCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStockDivRecCc = checkMsdStockDivRecCcMaxLimit(number); 
		serializeMsdStockDivRecCc(msdStockDivRecCc);
	}
	

	public void setMsdStockDivRecCc(long number) {
	    number = checkMsdStockDivRecCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdStockDivRecCc((int)number);
	}
	
	/**
	 * 	Update MsdStockDivRecCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivRecCc(char[] value) throws CFException {
		 msdStockDivRecCc = serializeMsdStockDivRecCc(value);
	}
	/**
	 * 	Update MsdStockDivRecCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivRecCcString(char[] value) throws CFException {
		 setMsdStockDivRecCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdStockDivRecMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdStockDivRecMmddyy(0);
                     setMsdStockDivRecCc(0);
   }

		public static int getMsdStockDivRecMmddyyccFieldLength() {
			return MSD_STOCK_DIV_REC_MMDDYYCC_LENGTH;
		}

}
  
