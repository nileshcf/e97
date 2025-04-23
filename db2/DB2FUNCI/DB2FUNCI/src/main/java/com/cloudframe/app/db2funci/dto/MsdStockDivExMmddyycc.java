package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdStockDivExMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdStockDivExMmddyycc extends MsdStockDivExMmddyyccSerialized { 
   

								private long msdStockDivExMmddyy;

								private int msdStockDivExCc;
	
	/**
	* Constructor for MsdStockDivExMmddyycc
	**/
    public MsdStockDivExMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdStockDivExMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivExMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdStockDivExMmddyy
	 *	@return msdStockDivExMmddyy
	 */
	public long getMsdStockDivExMmddyy() throws CFException {
       if (isMsdStockDivExMmddyyModified()) { 
           msdStockDivExMmddyy = refreshMsdStockDivExMmddyy();
        }
   		return msdStockDivExMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdStockDivExMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-STOCK-DIV-EX-MMDDYY
	 *	@param number
	 */
	public void setMsdStockDivExMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStockDivExMmddyy = checkMsdStockDivExMmddyyMaxLimit(number); 
		serializeMsdStockDivExMmddyy(msdStockDivExMmddyy);
	}
	

	/**
	 * 	Update MsdStockDivExMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivExMmddyy(char[] value) throws CFException {
		 msdStockDivExMmddyy = serializeMsdStockDivExMmddyy(value);
	}
	/**
	 * 	Update MsdStockDivExMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivExMmddyyString(char[] value) throws CFException {
		 setMsdStockDivExMmddyy(value);
	}
	/**
	 *	Returns the value of msdStockDivExCc
	 *	@return msdStockDivExCc
	 */
	public int getMsdStockDivExCc() throws CFException {
       if (isMsdStockDivExCcModified()) { 
           msdStockDivExCc = refreshMsdStockDivExCc();
        }
   		return msdStockDivExCc;
	}
	

	
	   
	/**
	 * 	Update MsdStockDivExCc with the passed value
	 *  Corresponding COBOL Variable is MSD-STOCK-DIV-EX-CC
	 *	@param number
	 */
	public void setMsdStockDivExCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStockDivExCc = checkMsdStockDivExCcMaxLimit(number); 
		serializeMsdStockDivExCc(msdStockDivExCc);
	}
	

	public void setMsdStockDivExCc(long number) {
	    number = checkMsdStockDivExCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdStockDivExCc((int)number);
	}
	
	/**
	 * 	Update MsdStockDivExCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivExCc(char[] value) throws CFException {
		 msdStockDivExCc = serializeMsdStockDivExCc(value);
	}
	/**
	 * 	Update MsdStockDivExCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivExCcString(char[] value) throws CFException {
		 setMsdStockDivExCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdStockDivExMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdStockDivExMmddyy(0);
                     setMsdStockDivExCc(0);
   }

		public static int getMsdStockDivExMmddyyccFieldLength() {
			return MSD_STOCK_DIV_EX_MMDDYYCC_LENGTH;
		}

}
  
