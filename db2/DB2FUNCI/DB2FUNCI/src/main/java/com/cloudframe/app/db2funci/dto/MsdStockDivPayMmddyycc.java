package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdStockDivPayMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdStockDivPayMmddyycc extends MsdStockDivPayMmddyyccSerialized { 
   

								private long msdStockDivPayMmddyy;

								private int msdStockDivPayCc;
	
	/**
	* Constructor for MsdStockDivPayMmddyycc
	**/
    public MsdStockDivPayMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdStockDivPayMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdStockDivPayMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdStockDivPayMmddyy
	 *	@return msdStockDivPayMmddyy
	 */
	public long getMsdStockDivPayMmddyy() throws CFException {
       if (isMsdStockDivPayMmddyyModified()) { 
           msdStockDivPayMmddyy = refreshMsdStockDivPayMmddyy();
        }
   		return msdStockDivPayMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdStockDivPayMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-STOCK-DIV-PAY-MMDDYY
	 *	@param number
	 */
	public void setMsdStockDivPayMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStockDivPayMmddyy = checkMsdStockDivPayMmddyyMaxLimit(number); 
		serializeMsdStockDivPayMmddyy(msdStockDivPayMmddyy);
	}
	

	/**
	 * 	Update MsdStockDivPayMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivPayMmddyy(char[] value) throws CFException {
		 msdStockDivPayMmddyy = serializeMsdStockDivPayMmddyy(value);
	}
	/**
	 * 	Update MsdStockDivPayMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivPayMmddyyString(char[] value) throws CFException {
		 setMsdStockDivPayMmddyy(value);
	}
	/**
	 *	Returns the value of msdStockDivPayCc
	 *	@return msdStockDivPayCc
	 */
	public int getMsdStockDivPayCc() throws CFException {
       if (isMsdStockDivPayCcModified()) { 
           msdStockDivPayCc = refreshMsdStockDivPayCc();
        }
   		return msdStockDivPayCc;
	}
	

	
	   
	/**
	 * 	Update MsdStockDivPayCc with the passed value
	 *  Corresponding COBOL Variable is MSD-STOCK-DIV-PAY-CC
	 *	@param number
	 */
	public void setMsdStockDivPayCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdStockDivPayCc = checkMsdStockDivPayCcMaxLimit(number); 
		serializeMsdStockDivPayCc(msdStockDivPayCc);
	}
	

	public void setMsdStockDivPayCc(long number) {
	    number = checkMsdStockDivPayCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdStockDivPayCc((int)number);
	}
	
	/**
	 * 	Update MsdStockDivPayCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivPayCc(char[] value) throws CFException {
		 msdStockDivPayCc = serializeMsdStockDivPayCc(value);
	}
	/**
	 * 	Update MsdStockDivPayCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStockDivPayCcString(char[] value) throws CFException {
		 setMsdStockDivPayCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdStockDivPayMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdStockDivPayMmddyy(0);
                     setMsdStockDivPayCc(0);
   }

		public static int getMsdStockDivPayMmddyyccFieldLength() {
			return MSD_STOCK_DIV_PAY_MMDDYYCC_LENGTH;
		}

}
  
