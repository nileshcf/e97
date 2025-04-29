package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondPayMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondPayMmddyycc extends MsdBondPayMmddyyccSerialized { 
   

								private long msdBondPayMmddyy;

								private int msdBondPayCc;
	
	/**
	* Constructor for MsdBondPayMmddyycc
	**/
    public MsdBondPayMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondPayMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondPayMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdBondPayMmddyy
	 *	@return msdBondPayMmddyy
	 */
	public long getMsdBondPayMmddyy() throws CFException {
       if (isMsdBondPayMmddyyModified()) { 
           msdBondPayMmddyy = refreshMsdBondPayMmddyy();
        }
   		return msdBondPayMmddyy;
	}
	

	
	   
	/**
	 * 	Update MsdBondPayMmddyy with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-PAY-MMDDYY
	 *	@param number
	 */
	public void setMsdBondPayMmddyy(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondPayMmddyy = checkMsdBondPayMmddyyMaxLimit(number); 
		serializeMsdBondPayMmddyy(msdBondPayMmddyy);
	}
	

	/**
	 * 	Update MsdBondPayMmddyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondPayMmddyy(char[] value) throws CFException {
		 msdBondPayMmddyy = serializeMsdBondPayMmddyy(value);
	}
	/**
	 * 	Update MsdBondPayMmddyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondPayMmddyyString(char[] value) throws CFException {
		 setMsdBondPayMmddyy(value);
	}
	/**
	 *	Returns the value of msdBondPayCc
	 *	@return msdBondPayCc
	 */
	public int getMsdBondPayCc() throws CFException {
       if (isMsdBondPayCcModified()) { 
           msdBondPayCc = refreshMsdBondPayCc();
        }
   		return msdBondPayCc;
	}
	

	
	   
	/**
	 * 	Update MsdBondPayCc with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-PAY-CC
	 *	@param number
	 */
	public void setMsdBondPayCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondPayCc = checkMsdBondPayCcMaxLimit(number); 
		serializeMsdBondPayCc(msdBondPayCc);
	}
	

	public void setMsdBondPayCc(long number) {
	    number = checkMsdBondPayCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondPayCc((int)number);
	}
	
	/**
	 * 	Update MsdBondPayCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondPayCc(char[] value) throws CFException {
		 msdBondPayCc = serializeMsdBondPayCc(value);
	}
	/**
	 * 	Update MsdBondPayCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondPayCcString(char[] value) throws CFException {
		 setMsdBondPayCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondPayMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondPayMmddyy(0);
                     setMsdBondPayCc(0);
   }

		public static int getMsdBondPayMmddyyccFieldLength() {
			return MSD_BOND_PAY_MMDDYYCC_LENGTH;
		}

}
  
