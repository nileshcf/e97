package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondCouponMmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondCouponMmdd extends MsdBondCouponMmddSerialized { 
   

								private int msdBondCouponMm;

								private int msdBondCouponDd;
	
	/**
	* Constructor for MsdBondCouponMmdd
	**/
    public MsdBondCouponMmdd() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondCouponMmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCouponMmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdBondCouponMm
	 *	@return msdBondCouponMm
	 */
	public int getMsdBondCouponMm() throws CFException {
       if (isMsdBondCouponMmModified()) { 
           msdBondCouponMm = refreshMsdBondCouponMm();
        }
   		return msdBondCouponMm;
	}
	

	
	   
	/**
	 * 	Update MsdBondCouponMm with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-COUPON-MM
	 *	@param number
	 */
	public void setMsdBondCouponMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondCouponMm = checkMsdBondCouponMmMaxLimit(number); 
		serializeMsdBondCouponMm(msdBondCouponMm);
	}
	

	public void setMsdBondCouponMm(long number) {
	    number = checkMsdBondCouponMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondCouponMm((int)number);
	}
	
	/**
	 * 	Update MsdBondCouponMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondCouponMm(char[] value) throws CFException {
		 msdBondCouponMm = serializeMsdBondCouponMm(value);
	}
	/**
	 * 	Update MsdBondCouponMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondCouponMmString(char[] value) throws CFException {
		 setMsdBondCouponMm(value);
	}
	/**
	 *	Returns the value of msdBondCouponDd
	 *	@return msdBondCouponDd
	 */
	public int getMsdBondCouponDd() throws CFException {
       if (isMsdBondCouponDdModified()) { 
           msdBondCouponDd = refreshMsdBondCouponDd();
        }
   		return msdBondCouponDd;
	}
	

	
	   
	/**
	 * 	Update MsdBondCouponDd with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-COUPON-DD
	 *	@param number
	 */
	public void setMsdBondCouponDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondCouponDd = checkMsdBondCouponDdMaxLimit(number); 
		serializeMsdBondCouponDd(msdBondCouponDd);
	}
	

	public void setMsdBondCouponDd(long number) {
	    number = checkMsdBondCouponDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondCouponDd((int)number);
	}
	
	/**
	 * 	Update MsdBondCouponDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondCouponDd(char[] value) throws CFException {
		 msdBondCouponDd = serializeMsdBondCouponDd(value);
	}
	/**
	 * 	Update MsdBondCouponDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondCouponDdString(char[] value) throws CFException {
		 setMsdBondCouponDd(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondCouponMmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdBondCouponMm(0);
                     setMsdBondCouponDd(0);
   }

		public static int getMsdBondCouponMmddFieldLength() {
			return MSD_BOND_COUPON_MMDD_LENGTH;
		}

}
  
