package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdOidDateCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdOidDateCcyymmdd extends MsdOidDateCcyymmddSerialized { 
   

								private int msdOidDateCc;

								private long msdOidDate;
	
	/**
	* Constructor for MsdOidDateCcyymmdd
	**/
    public MsdOidDateCcyymmdd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdOidDateCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOidDateCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdOidDateCc
	 *	@return msdOidDateCc
	 */
	public int getMsdOidDateCc() throws CFException {
       if (isMsdOidDateCcModified()) { 
           msdOidDateCc = refreshMsdOidDateCc();
        }
   		return msdOidDateCc;
	}
	

	
	   
	/**
	 * 	Update MsdOidDateCc with the passed value
	 *  Corresponding COBOL Variable is MSD-OID-DATE-CC
	 *	@param number
	 */
	public void setMsdOidDateCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdOidDateCc = checkMsdOidDateCcMaxLimit(number); 
		serializeMsdOidDateCc(msdOidDateCc);
	}
	

	public void setMsdOidDateCc(long number) {
	    number = checkMsdOidDateCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdOidDateCc((int)number);
	}
	
	/**
	 * 	Update MsdOidDateCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOidDateCc(char[] value) throws CFException {
		 msdOidDateCc = serializeMsdOidDateCc(value);
	}
	/**
	 * 	Update MsdOidDateCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdOidDateCcString(char[] value) throws CFException {
		 setMsdOidDateCc(value);
	}
	/**
	 *	Returns the value of msdOidDate
	 *	@return msdOidDate
	 */
	public long getMsdOidDate() throws CFException {
       if (isMsdOidDateModified()) { 
           msdOidDate = refreshMsdOidDate();
        }
   		return msdOidDate;
	}
	

	
	   
	/**
	 * 	Update MsdOidDate with the passed value
	 *  Corresponding COBOL Variable is MSD-OID-DATE
	 *	@param number
	 */
	public void setMsdOidDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdOidDate = checkMsdOidDateMaxLimit(number); 
		serializeMsdOidDate(msdOidDate);
	}
	

	/**
	 * 	Update MsdOidDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdOidDate(char[] value) throws CFException {
		 msdOidDate = serializeMsdOidDate(value);
	}
	/**
	 * 	Update MsdOidDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdOidDateString(char[] value) throws CFException {
		 setMsdOidDate(value);
	}

	
	
	
	/**
	 * 	initializes MsdOidDateCcyymmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdOidDateCc(0);
                     setMsdOidDate(0);
   }

		public static int getMsdOidDateCcyymmddFieldLength() {
			return MSD_OID_DATE_CCYYMMDD_LENGTH;
		}

}
  
