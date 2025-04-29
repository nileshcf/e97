package com.cloudframe.app.db2funci.dto;

/**
*  The class Dclvbsscrdt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class Dclvbsscrdt extends DclvbsscrdtSerialized {
   

								private BigDecimal yieldBidPct;

								private short putNtcMinDyQty;

								private short putNtcMaxDyQty;
	
	/**
	* Constructor for Dclvbsscrdt
	**/
    public Dclvbsscrdt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of yieldBidPct
	 *	@return yieldBidPct
	 */
   public BigDecimal getYieldBidPct() {
	if (isYieldBidPctModified()) {
		yieldBidPct = refreshYieldBidPct();
	}
   	return yieldBidPct;
   }

  
	/**
	*  set variable yieldBidPct
	*  @param value
	**/
   public void setYieldBidPct(BigDecimal value) {
	setYieldBidPct(value, true);
   } 


	/**
	 *	Update YieldBidPct with the passed value and serialize the object if setModified is true
	 *	@param value
	 *	@param setModified
	 */
   private void setYieldBidPct(BigDecimal value,boolean setModified) {
      yieldBidPct = value;
      if (setModified) {
          serializeYieldBidPct(value);
      }
   }  
	
	
	public short getPutNtcMinDyQty() throws CFException {
        if (isPutNtcMinDyQtyModified()) { 
           putNtcMinDyQty = refreshPutNtcMinDyQty();
        }
   		return putNtcMinDyQty;
	}
	
	/**
	 * 	Update PutNtcMinDyQty with the passed value
	 *  Corresponding COBOL Variable is PUT-NTC-MIN-DY-QTY
	 *	@param number
	 */
	public void setPutNtcMinDyQty(short number) {
			putNtcMinDyQty = checkPutNtcMinDyQtyMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePutNtcMinDyQty(putNtcMinDyQty);
	}

	public void setPutNtcMinDyQty(int number) {
	    number = checkPutNtcMinDyQtyMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMinDyQty((short)number);
	}
	public void setPutNtcMinDyQty(long number) {
	    number = checkPutNtcMinDyQtyMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMinDyQty((short)number);
	}
	

	public short getPutNtcMaxDyQty() throws CFException {
        if (isPutNtcMaxDyQtyModified()) { 
           putNtcMaxDyQty = refreshPutNtcMaxDyQty();
        }
   		return putNtcMaxDyQty;
	}
	
	/**
	 * 	Update PutNtcMaxDyQty with the passed value
	 *  Corresponding COBOL Variable is PUT-NTC-MAX-DY-QTY
	 *	@param number
	 */
	public void setPutNtcMaxDyQty(short number) {
			putNtcMaxDyQty = checkPutNtcMaxDyQtyMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePutNtcMaxDyQty(putNtcMaxDyQty);
	}

	public void setPutNtcMaxDyQty(int number) {
	    number = checkPutNtcMaxDyQtyMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMaxDyQty((short)number);
	}
	public void setPutNtcMaxDyQty(long number) {
	    number = checkPutNtcMaxDyQtyMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMaxDyQty((short)number);
	}
	


	
	
	

		public static int getDclvbsscrdtFieldLength() {
			return DCLVBSSCRDT_LENGTH;
		}

}
  
