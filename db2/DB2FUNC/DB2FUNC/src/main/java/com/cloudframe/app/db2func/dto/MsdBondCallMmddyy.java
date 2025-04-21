package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondCallMmddyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondCallMmddyy extends MsdBondCallMmddyySerialized { 
   

								private int msdBondCallMm;

								private int msdBondCallDd;

								private int msdBondCallYy;
	
	/**
	* Constructor for MsdBondCallMmddyy
	**/
    public MsdBondCallMmddyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondCallMmddyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCallMmddyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdBondCallMm
	 *	@return msdBondCallMm
	 */
	public int getMsdBondCallMm() throws CFException {
       if (isMsdBondCallMmModified()) { 
           msdBondCallMm = refreshMsdBondCallMm();
        }
   		return msdBondCallMm;
	}
	

	
	   
	/**
	 * 	Update MsdBondCallMm with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-CALL-MM
	 *	@param number
	 */
	public void setMsdBondCallMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondCallMm = checkMsdBondCallMmMaxLimit(number); 
		serializeMsdBondCallMm(msdBondCallMm);
	}
	

	public void setMsdBondCallMm(long number) {
	    number = checkMsdBondCallMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondCallMm((int)number);
	}
	
	/**
	 * 	Update MsdBondCallMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallMm(char[] value) throws CFException {
		 msdBondCallMm = serializeMsdBondCallMm(value);
	}
	/**
	 * 	Update MsdBondCallMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallMmString(char[] value) throws CFException {
		 setMsdBondCallMm(value);
	}
	/**
	 *	Returns the value of msdBondCallDd
	 *	@return msdBondCallDd
	 */
	public int getMsdBondCallDd() throws CFException {
       if (isMsdBondCallDdModified()) { 
           msdBondCallDd = refreshMsdBondCallDd();
        }
   		return msdBondCallDd;
	}
	

	
	   
	/**
	 * 	Update MsdBondCallDd with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-CALL-DD
	 *	@param number
	 */
	public void setMsdBondCallDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondCallDd = checkMsdBondCallDdMaxLimit(number); 
		serializeMsdBondCallDd(msdBondCallDd);
	}
	

	public void setMsdBondCallDd(long number) {
	    number = checkMsdBondCallDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondCallDd((int)number);
	}
	
	/**
	 * 	Update MsdBondCallDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallDd(char[] value) throws CFException {
		 msdBondCallDd = serializeMsdBondCallDd(value);
	}
	/**
	 * 	Update MsdBondCallDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallDdString(char[] value) throws CFException {
		 setMsdBondCallDd(value);
	}
	/**
	 *	Returns the value of msdBondCallYy
	 *	@return msdBondCallYy
	 */
	public int getMsdBondCallYy() throws CFException {
       if (isMsdBondCallYyModified()) { 
           msdBondCallYy = refreshMsdBondCallYy();
        }
   		return msdBondCallYy;
	}
	

	
	   
	/**
	 * 	Update MsdBondCallYy with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-CALL-YY
	 *	@param number
	 */
	public void setMsdBondCallYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondCallYy = checkMsdBondCallYyMaxLimit(number); 
		serializeMsdBondCallYy(msdBondCallYy);
	}
	

	public void setMsdBondCallYy(long number) {
	    number = checkMsdBondCallYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondCallYy((int)number);
	}
	
	/**
	 * 	Update MsdBondCallYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallYy(char[] value) throws CFException {
		 msdBondCallYy = serializeMsdBondCallYy(value);
	}
	/**
	 * 	Update MsdBondCallYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondCallYyString(char[] value) throws CFException {
		 setMsdBondCallYy(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondCallMmddyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondCallMm(0);
                     setMsdBondCallDd(0);
                     setMsdBondCallYy(0);
   }

		public static int getMsdBondCallMmddyyFieldLength() {
			return MSD_BOND_CALL_MMDDYY_LENGTH;
		}

}
  
