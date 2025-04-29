package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondPutMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondPutMmddyycc extends MsdBondPutMmddyyccSerialized { 
   

								private long msdBondPutMmddyy;

								private int msdBondPutCc;
	
	/**
	* Constructor for MsdBondPutMmddyycc
	**/
    public MsdBondPutMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondPutMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondPutMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdBondPutMmddyy
	 *	@return msdBondPutMmddyy
	 */
	public long getMsdBondPutMmddyy() throws CFException {
       if (isMsdBondPutMmddyyModified()) { 
           msdBondPutMmddyy = refreshMsdBondPutMmddyy();
        }
   		return msdBondPutMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdBondPutMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-PUT-MMDDYY
	 *	@param number
	 */
	public void setMsdBondPutMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondPutMmddyy = checkMsdBondPutMmddyyMaxLimit(number); 
		serializeMsdBondPutMmddyy(msdBondPutMmddyy);
	}
	

	/**
	 * 	Update MsdBondPutMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondPutMmddyy(char[] value) throws CFException {
		 msdBondPutMmddyy = serializeMsdBondPutMmddyy(value);
	}
	/**
	 * 	Update MsdBondPutMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondPutMmddyyString(char[] value) throws CFException {
		 setMsdBondPutMmddyy(value);
	}
	/**
	 *	Returns the value of msdBondPutCc
	 *	@return msdBondPutCc
	 */
	public int getMsdBondPutCc() throws CFException {
       if (isMsdBondPutCcModified()) { 
           msdBondPutCc = refreshMsdBondPutCc();
        }
   		return msdBondPutCc;
	}
	

	
	   
	/**
	 * 	Update MsdBondPutCc with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-PUT-CC
	 *	@param number
	 */
	public void setMsdBondPutCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondPutCc = checkMsdBondPutCcMaxLimit(number); 
		serializeMsdBondPutCc(msdBondPutCc);
	}
	

	public void setMsdBondPutCc(long number) {
	    number = checkMsdBondPutCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondPutCc((int)number);
	}
	
	/**
	 * 	Update MsdBondPutCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondPutCc(char[] value) throws CFException {
		 msdBondPutCc = serializeMsdBondPutCc(value);
	}
	/**
	 * 	Update MsdBondPutCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondPutCcString(char[] value) throws CFException {
		 setMsdBondPutCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondPutMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondPutMmddyy(0);
                     setMsdBondPutCc(0);
   }

		public static int getMsdBondPutMmddyyccFieldLength() {
			return MSD_BOND_PUT_MMDDYYCC_LENGTH;
		}

}
  
