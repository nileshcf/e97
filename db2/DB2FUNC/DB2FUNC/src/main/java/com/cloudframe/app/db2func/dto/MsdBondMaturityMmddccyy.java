package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondMaturityMmddccyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondMaturityMmddccyy extends MsdBondMaturityMmddccyySerialized { 
   

								private int msdBondMaturityMm;

								private int msdBondMaturityDd;

								private int msdBondMaturityCc;

								private int msdBondMaturityYy;
	
	/**
	* Constructor for MsdBondMaturityMmddccyy
	**/
    public MsdBondMaturityMmddccyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondMaturityMmddccyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondMaturityMmddccyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdBondMaturityMm
	 *	@return msdBondMaturityMm
	 */
	public int getMsdBondMaturityMm() throws CFException {
       if (isMsdBondMaturityMmModified()) { 
           msdBondMaturityMm = refreshMsdBondMaturityMm();
        }
   		return msdBondMaturityMm;
	}
	

	
	   
	/**
	 * 	Update MsdBondMaturityMm with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-MATURITY-MM
	 *	@param number
	 */
	public void setMsdBondMaturityMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondMaturityMm = checkMsdBondMaturityMmMaxLimit(number); 
		serializeMsdBondMaturityMm(msdBondMaturityMm);
	}
	

	public void setMsdBondMaturityMm(long number) {
	    number = checkMsdBondMaturityMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondMaturityMm((int)number);
	}
	
	/**
	 * 	Update MsdBondMaturityMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityMm(char[] value) throws CFException {
		 msdBondMaturityMm = serializeMsdBondMaturityMm(value);
	}
	/**
	 * 	Update MsdBondMaturityMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityMmString(char[] value) throws CFException {
		 setMsdBondMaturityMm(value);
	}
	/**
	 *	Returns the value of msdBondMaturityDd
	 *	@return msdBondMaturityDd
	 */
	public int getMsdBondMaturityDd() throws CFException {
       if (isMsdBondMaturityDdModified()) { 
           msdBondMaturityDd = refreshMsdBondMaturityDd();
        }
   		return msdBondMaturityDd;
	}
	

	
	   
	/**
	 * 	Update MsdBondMaturityDd with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-MATURITY-DD
	 *	@param number
	 */
	public void setMsdBondMaturityDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondMaturityDd = checkMsdBondMaturityDdMaxLimit(number); 
		serializeMsdBondMaturityDd(msdBondMaturityDd);
	}
	

	public void setMsdBondMaturityDd(long number) {
	    number = checkMsdBondMaturityDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondMaturityDd((int)number);
	}
	
	/**
	 * 	Update MsdBondMaturityDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityDd(char[] value) throws CFException {
		 msdBondMaturityDd = serializeMsdBondMaturityDd(value);
	}
	/**
	 * 	Update MsdBondMaturityDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityDdString(char[] value) throws CFException {
		 setMsdBondMaturityDd(value);
	}
	/**
	 *	Returns the value of msdBondMaturityCc
	 *	@return msdBondMaturityCc
	 */
	public int getMsdBondMaturityCc() throws CFException {
       if (isMsdBondMaturityCcModified()) { 
           msdBondMaturityCc = refreshMsdBondMaturityCc();
        }
   		return msdBondMaturityCc;
	}
	

	
	   
	/**
	 * 	Update MsdBondMaturityCc with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-MATURITY-CC
	 *	@param number
	 */
	public void setMsdBondMaturityCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondMaturityCc = checkMsdBondMaturityCcMaxLimit(number); 
		serializeMsdBondMaturityCc(msdBondMaturityCc);
	}
	

	public void setMsdBondMaturityCc(long number) {
	    number = checkMsdBondMaturityCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondMaturityCc((int)number);
	}
	
	/**
	 * 	Update MsdBondMaturityCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityCc(char[] value) throws CFException {
		 msdBondMaturityCc = serializeMsdBondMaturityCc(value);
	}
	/**
	 * 	Update MsdBondMaturityCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityCcString(char[] value) throws CFException {
		 setMsdBondMaturityCc(value);
	}
	/**
	 *	Returns the value of msdBondMaturityYy
	 *	@return msdBondMaturityYy
	 */
	public int getMsdBondMaturityYy() throws CFException {
       if (isMsdBondMaturityYyModified()) { 
           msdBondMaturityYy = refreshMsdBondMaturityYy();
        }
   		return msdBondMaturityYy;
	}
	

	
	   
	/**
	 * 	Update MsdBondMaturityYy with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-MATURITY-YY
	 *	@param number
	 */
	public void setMsdBondMaturityYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondMaturityYy = checkMsdBondMaturityYyMaxLimit(number); 
		serializeMsdBondMaturityYy(msdBondMaturityYy);
	}
	

	public void setMsdBondMaturityYy(long number) {
	    number = checkMsdBondMaturityYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondMaturityYy((int)number);
	}
	
	/**
	 * 	Update MsdBondMaturityYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityYy(char[] value) throws CFException {
		 msdBondMaturityYy = serializeMsdBondMaturityYy(value);
	}
	/**
	 * 	Update MsdBondMaturityYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondMaturityYyString(char[] value) throws CFException {
		 setMsdBondMaturityYy(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondMaturityMmddccyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondMaturityMm(0);
                     setMsdBondMaturityDd(0);
                     setMsdBondMaturityCc(0);
                     setMsdBondMaturityYy(0);
   }

		public static int getMsdBondMaturityMmddccyyFieldLength() {
			return MSD_BOND_MATURITY_MMDDCCYY_LENGTH;
		}

}
  
