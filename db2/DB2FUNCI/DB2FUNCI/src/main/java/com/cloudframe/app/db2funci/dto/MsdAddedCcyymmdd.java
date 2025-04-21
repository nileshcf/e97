package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdAddedCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdAddedCcyymmdd extends MsdAddedCcyymmddSerialized { 
   

								private int msdAddedCc;

								private long msdAddedYymmdd;
	
	/**
	* Constructor for MsdAddedCcyymmdd
	**/
    public MsdAddedCcyymmdd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdAddedCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdAddedCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdAddedCc
	 *	@return msdAddedCc
	 */
	public int getMsdAddedCc() throws CFException {
       if (isMsdAddedCcModified()) { 
           msdAddedCc = refreshMsdAddedCc();
        }
   		return msdAddedCc;
	}
	

	
	   
	/**
	 * 	Update MsdAddedCc with the passed value
	 *  Corresponding COBOL Variable is MSD-ADDED-CC
	 *	@param number
	 */
	public void setMsdAddedCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdAddedCc = checkMsdAddedCcMaxLimit(number); 
		serializeMsdAddedCc(msdAddedCc);
	}
	

	public void setMsdAddedCc(long number) {
	    number = checkMsdAddedCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdAddedCc((int)number);
	}
	
	/**
	 * 	Update MsdAddedCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdAddedCc(char[] value) throws CFException {
		 msdAddedCc = serializeMsdAddedCc(value);
	}
	/**
	 * 	Update MsdAddedCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdAddedCcString(char[] value) throws CFException {
		 setMsdAddedCc(value);
	}
	/**
	 *	Returns the value of msdAddedYymmdd
	 *	@return msdAddedYymmdd
	 */
	public long getMsdAddedYymmdd() throws CFException {
       if (isMsdAddedYymmddModified()) { 
           msdAddedYymmdd = refreshMsdAddedYymmdd();
        }
   		return msdAddedYymmdd;
	}
	

	
	   
	/**
	 * 	Update MsdAddedYymmdd with the passed value
	 *  Corresponding COBOL Variable is MSD-ADDED-YYMMDD
	 *	@param number
	 */
	public void setMsdAddedYymmdd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdAddedYymmdd = checkMsdAddedYymmddMaxLimit(number); 
		serializeMsdAddedYymmdd(msdAddedYymmdd);
	}
	

	/**
	 * 	Update MsdAddedYymmdd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdAddedYymmdd(char[] value) throws CFException {
		 msdAddedYymmdd = serializeMsdAddedYymmdd(value);
	}
	/**
	 * 	Update MsdAddedYymmdd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdAddedYymmddString(char[] value) throws CFException {
		 setMsdAddedYymmdd(value);
	}

	
	
	
	/**
	 * 	initializes MsdAddedCcyymmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdAddedCc(0);
                     setMsdAddedYymmdd(0);
   }

		public static int getMsdAddedCcyymmddFieldLength() {
			return MSD_ADDED_CCYYMMDD_LENGTH;
		}

}
  
