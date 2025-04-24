package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondDatedMmddyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondDatedMmddyy extends MsdBondDatedMmddyySerialized { 
   

								private int msdBondDatedMm;

								private int msdBondDatedDd;

								private int msdBondDatedYy;
	
	/**
	* Constructor for MsdBondDatedMmddyy
	**/
    public MsdBondDatedMmddyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondDatedMmddyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondDatedMmddyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdBondDatedMm
	 *	@return msdBondDatedMm
	 */
	public int getMsdBondDatedMm() throws CFException {
       if (isMsdBondDatedMmModified()) { 
           msdBondDatedMm = refreshMsdBondDatedMm();
        }
   		return msdBondDatedMm;
	}
	

	
	   
	/**
	 * 	Update MsdBondDatedMm with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-DATED-MM
	 *	@param number
	 */
	public void setMsdBondDatedMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondDatedMm = checkMsdBondDatedMmMaxLimit(number); 
		serializeMsdBondDatedMm(msdBondDatedMm);
	}
	

	public void setMsdBondDatedMm(long number) {
	    number = checkMsdBondDatedMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondDatedMm((int)number);
	}
	
	/**
	 * 	Update MsdBondDatedMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedMm(char[] value) throws CFException {
		 msdBondDatedMm = serializeMsdBondDatedMm(value);
	}
	/**
	 * 	Update MsdBondDatedMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedMmString(char[] value) throws CFException {
		 setMsdBondDatedMm(value);
	}
	/**
	 *	Returns the value of msdBondDatedDd
	 *	@return msdBondDatedDd
	 */
	public int getMsdBondDatedDd() throws CFException {
       if (isMsdBondDatedDdModified()) { 
           msdBondDatedDd = refreshMsdBondDatedDd();
        }
   		return msdBondDatedDd;
	}
	

	
	   
	/**
	 * 	Update MsdBondDatedDd with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-DATED-DD
	 *	@param number
	 */
	public void setMsdBondDatedDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondDatedDd = checkMsdBondDatedDdMaxLimit(number); 
		serializeMsdBondDatedDd(msdBondDatedDd);
	}
	

	public void setMsdBondDatedDd(long number) {
	    number = checkMsdBondDatedDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondDatedDd((int)number);
	}
	
	/**
	 * 	Update MsdBondDatedDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedDd(char[] value) throws CFException {
		 msdBondDatedDd = serializeMsdBondDatedDd(value);
	}
	/**
	 * 	Update MsdBondDatedDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedDdString(char[] value) throws CFException {
		 setMsdBondDatedDd(value);
	}
	/**
	 *	Returns the value of msdBondDatedYy
	 *	@return msdBondDatedYy
	 */
	public int getMsdBondDatedYy() throws CFException {
       if (isMsdBondDatedYyModified()) { 
           msdBondDatedYy = refreshMsdBondDatedYy();
        }
   		return msdBondDatedYy;
	}
	

	
	   
	/**
	 * 	Update MsdBondDatedYy with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-DATED-YY
	 *	@param number
	 */
	public void setMsdBondDatedYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondDatedYy = checkMsdBondDatedYyMaxLimit(number); 
		serializeMsdBondDatedYy(msdBondDatedYy);
	}
	

	public void setMsdBondDatedYy(long number) {
	    number = checkMsdBondDatedYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondDatedYy((int)number);
	}
	
	/**
	 * 	Update MsdBondDatedYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedYy(char[] value) throws CFException {
		 msdBondDatedYy = serializeMsdBondDatedYy(value);
	}
	/**
	 * 	Update MsdBondDatedYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedYyString(char[] value) throws CFException {
		 setMsdBondDatedYy(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondDatedMmddyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondDatedMm(0);
                     setMsdBondDatedDd(0);
                     setMsdBondDatedYy(0);
   }

		public static int getMsdBondDatedMmddyyFieldLength() {
			return MSD_BOND_DATED_MMDDYY_LENGTH;
		}

}
  
