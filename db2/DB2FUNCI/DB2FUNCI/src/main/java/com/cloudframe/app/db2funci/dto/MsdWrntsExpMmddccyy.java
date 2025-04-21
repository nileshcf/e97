package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdWrntsExpMmddccyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdWrntsExpMmddccyy extends MsdWrntsExpMmddccyySerialized { 
   

								private int msdWrntsExpMm;

								private int msdWrntsExpDd;

								private int msdWrntsExpCc;

								private int msdWrntsExpYy;
	
	/**
	* Constructor for MsdWrntsExpMmddccyy
	**/
    public MsdWrntsExpMmddccyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdWrntsExpMmddccyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdWrntsExpMmddccyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdWrntsExpMm
	 *	@return msdWrntsExpMm
	 */
	public int getMsdWrntsExpMm() throws CFException {
       if (isMsdWrntsExpMmModified()) { 
           msdWrntsExpMm = refreshMsdWrntsExpMm();
        }
   		return msdWrntsExpMm;
	}
	

	
	   
	/**
	 * 	Update MsdWrntsExpMm with the passed value
	 *  Corresponding COBOL Variable is MSD-WRNTS-EXP-MM
	 *	@param number
	 */
	public void setMsdWrntsExpMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdWrntsExpMm = checkMsdWrntsExpMmMaxLimit(number); 
		serializeMsdWrntsExpMm(msdWrntsExpMm);
	}
	

	public void setMsdWrntsExpMm(long number) {
	    number = checkMsdWrntsExpMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdWrntsExpMm((int)number);
	}
	
	/**
	 * 	Update MsdWrntsExpMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpMm(char[] value) throws CFException {
		 msdWrntsExpMm = serializeMsdWrntsExpMm(value);
	}
	/**
	 * 	Update MsdWrntsExpMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpMmString(char[] value) throws CFException {
		 setMsdWrntsExpMm(value);
	}
	/**
	 *	Returns the value of msdWrntsExpDd
	 *	@return msdWrntsExpDd
	 */
	public int getMsdWrntsExpDd() throws CFException {
       if (isMsdWrntsExpDdModified()) { 
           msdWrntsExpDd = refreshMsdWrntsExpDd();
        }
   		return msdWrntsExpDd;
	}
	

	
	   
	/**
	 * 	Update MsdWrntsExpDd with the passed value
	 *  Corresponding COBOL Variable is MSD-WRNTS-EXP-DD
	 *	@param number
	 */
	public void setMsdWrntsExpDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdWrntsExpDd = checkMsdWrntsExpDdMaxLimit(number); 
		serializeMsdWrntsExpDd(msdWrntsExpDd);
	}
	

	public void setMsdWrntsExpDd(long number) {
	    number = checkMsdWrntsExpDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdWrntsExpDd((int)number);
	}
	
	/**
	 * 	Update MsdWrntsExpDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpDd(char[] value) throws CFException {
		 msdWrntsExpDd = serializeMsdWrntsExpDd(value);
	}
	/**
	 * 	Update MsdWrntsExpDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpDdString(char[] value) throws CFException {
		 setMsdWrntsExpDd(value);
	}
	/**
	 *	Returns the value of msdWrntsExpCc
	 *	@return msdWrntsExpCc
	 */
	public int getMsdWrntsExpCc() throws CFException {
       if (isMsdWrntsExpCcModified()) { 
           msdWrntsExpCc = refreshMsdWrntsExpCc();
        }
   		return msdWrntsExpCc;
	}
	

	
	   
	/**
	 * 	Update MsdWrntsExpCc with the passed value
	 *  Corresponding COBOL Variable is MSD-WRNTS-EXP-CC
	 *	@param number
	 */
	public void setMsdWrntsExpCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdWrntsExpCc = checkMsdWrntsExpCcMaxLimit(number); 
		serializeMsdWrntsExpCc(msdWrntsExpCc);
	}
	

	public void setMsdWrntsExpCc(long number) {
	    number = checkMsdWrntsExpCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdWrntsExpCc((int)number);
	}
	
	/**
	 * 	Update MsdWrntsExpCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpCc(char[] value) throws CFException {
		 msdWrntsExpCc = serializeMsdWrntsExpCc(value);
	}
	/**
	 * 	Update MsdWrntsExpCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpCcString(char[] value) throws CFException {
		 setMsdWrntsExpCc(value);
	}
	/**
	 *	Returns the value of msdWrntsExpYy
	 *	@return msdWrntsExpYy
	 */
	public int getMsdWrntsExpYy() throws CFException {
       if (isMsdWrntsExpYyModified()) { 
           msdWrntsExpYy = refreshMsdWrntsExpYy();
        }
   		return msdWrntsExpYy;
	}
	

	
	   
	/**
	 * 	Update MsdWrntsExpYy with the passed value
	 *  Corresponding COBOL Variable is MSD-WRNTS-EXP-YY
	 *	@param number
	 */
	public void setMsdWrntsExpYy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdWrntsExpYy = checkMsdWrntsExpYyMaxLimit(number); 
		serializeMsdWrntsExpYy(msdWrntsExpYy);
	}
	

	public void setMsdWrntsExpYy(long number) {
	    number = checkMsdWrntsExpYyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdWrntsExpYy((int)number);
	}
	
	/**
	 * 	Update MsdWrntsExpYy with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpYy(char[] value) throws CFException {
		 msdWrntsExpYy = serializeMsdWrntsExpYy(value);
	}
	/**
	 * 	Update MsdWrntsExpYy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdWrntsExpYyString(char[] value) throws CFException {
		 setMsdWrntsExpYy(value);
	}

	
	
	
	/**
	 * 	initializes MsdWrntsExpMmddccyy
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdWrntsExpMm(0);
                     setMsdWrntsExpDd(0);
                     setMsdWrntsExpCc(0);
                     setMsdWrntsExpYy(0);
   }

		public static int getMsdWrntsExpMmddccyyFieldLength() {
			return MSD_WRNTS_EXP_MMDDCCYY_LENGTH;
		}

}
  
