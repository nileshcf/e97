package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdPriceCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdPriceCcyymmdd extends MsdPriceCcyymmddSerialized { 
   

								private int msdPriceCc;

								private long msdPriceYymmdd;
	
	/**
	* Constructor for MsdPriceCcyymmdd
	**/
    public MsdPriceCcyymmdd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdPriceCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdPriceCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdPriceCc
	 *	@return msdPriceCc
	 */
	public int getMsdPriceCc() throws CFException {
       if (isMsdPriceCcModified()) { 
           msdPriceCc = refreshMsdPriceCc();
        }
   		return msdPriceCc;
	}
	

	
	   
	/**
	 * 	Update MsdPriceCc with the passed value
	 *  Corresponding COBOL Variable is MSD-PRICE-CC
	 *	@param number
	 */
	public void setMsdPriceCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdPriceCc = checkMsdPriceCcMaxLimit(number); 
		serializeMsdPriceCc(msdPriceCc);
	}
	

	public void setMsdPriceCc(long number) {
	    number = checkMsdPriceCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdPriceCc((int)number);
	}
	
	/**
	 * 	Update MsdPriceCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdPriceCc(char[] value) throws CFException {
		 msdPriceCc = serializeMsdPriceCc(value);
	}
	/**
	 * 	Update MsdPriceCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdPriceCcString(char[] value) throws CFException {
		 setMsdPriceCc(value);
	}
	/**
	 *	Returns the value of msdPriceYymmdd
	 *	@return msdPriceYymmdd
	 */
	public long getMsdPriceYymmdd() throws CFException {
       if (isMsdPriceYymmddModified()) { 
           msdPriceYymmdd = refreshMsdPriceYymmdd();
        }
   		return msdPriceYymmdd;
	}
	

	
	   
	/**
	 * 	Update MsdPriceYymmdd with the passed value
	 *  Corresponding COBOL Variable is MSD-PRICE-YYMMDD
	 *	@param number
	 */
	public void setMsdPriceYymmdd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdPriceYymmdd = checkMsdPriceYymmddMaxLimit(number); 
		serializeMsdPriceYymmdd(msdPriceYymmdd);
	}
	

	/**
	 * 	Update MsdPriceYymmdd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdPriceYymmdd(char[] value) throws CFException {
		 msdPriceYymmdd = serializeMsdPriceYymmdd(value);
	}
	/**
	 * 	Update MsdPriceYymmdd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdPriceYymmddString(char[] value) throws CFException {
		 setMsdPriceYymmdd(value);
	}

	
	
	
	/**
	 * 	initializes MsdPriceCcyymmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdPriceCc(0);
                     setMsdPriceYymmdd(0);
   }

		public static int getMsdPriceCcyymmddFieldLength() {
			return MSD_PRICE_CCYYMMDD_LENGTH;
		}

}
  
