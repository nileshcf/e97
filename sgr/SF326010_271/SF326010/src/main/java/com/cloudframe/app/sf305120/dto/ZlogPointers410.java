package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogPointers410 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class ZlogPointers410 extends ZlogPointers410Serialized { 
   

								private short servInfoCount410;

								private short servInfoPtr410;

								private short payload1Ptr410;

								private short isoMsg2Ptr410;

								private short isoMsg2Lnth410;

								private short trailer1Ptr410;

								private short trailer1Lnth410;

								private short trailer2Ptr410;

								private short trailer2Lnth410;

								private short holdSr2Ptr410;
	
	/**
	* Constructor for ZlogPointers410
	**/
    public ZlogPointers410() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setServInfoCount410((short)0);
								setServInfoPtr410((short)0);
								setPayload1Ptr410((short)0);
								setIsoMsg2Ptr410((short)0);
								setIsoMsg2Lnth410((short)0);
								setTrailer1Ptr410((short)0);
								setTrailer1Lnth410((short)0);
								setTrailer2Ptr410((short)0);
								setTrailer2Lnth410((short)0);
								setHoldSr2Ptr410((short)0);
    }


 

	/**
	 *	Returns the value of servInfoCount410
	 *	@return servInfoCount410
	 */
	public short getServInfoCount410() throws CFException {
        if (isServInfoCount410Modified()) { 
           servInfoCount410 = refreshServInfoCount410();
        }
   		return servInfoCount410;
	}
	
	/**
	 * 	Update ServInfoCount410 with the passed value
	 *  Corresponding COBOL Variable is 410-SERV-INFO-COUNT
	 *	@param number
	 */
	public void setServInfoCount410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    servInfoCount410 = checkServInfoCount410MaxLimit(number); 
		serializeServInfoCount410(servInfoCount410);
	}

	public void setServInfoCount410(int number) {
	    number = checkServInfoCount410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setServInfoCount410((short)number);
	}
	public void setServInfoCount410(long number) {
	    number = checkServInfoCount410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setServInfoCount410((short)number);
	}
	

	/**
	 *	Returns the value of servInfoPtr410
	 *	@return servInfoPtr410
	 */
	public short getServInfoPtr410() throws CFException {
        if (isServInfoPtr410Modified()) { 
           servInfoPtr410 = refreshServInfoPtr410();
        }
   		return servInfoPtr410;
	}
	
	/**
	 * 	Update ServInfoPtr410 with the passed value
	 *  Corresponding COBOL Variable is 410-SERV-INFO-PTR
	 *	@param number
	 */
	public void setServInfoPtr410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    servInfoPtr410 = checkServInfoPtr410MaxLimit(number); 
		serializeServInfoPtr410(servInfoPtr410);
	}

	public void setServInfoPtr410(int number) {
	    number = checkServInfoPtr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setServInfoPtr410((short)number);
	}
	public void setServInfoPtr410(long number) {
	    number = checkServInfoPtr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setServInfoPtr410((short)number);
	}
	

	/**
	 *	Returns the value of payload1Ptr410
	 *	@return payload1Ptr410
	 */
	public short getPayload1Ptr410() throws CFException {
        if (isPayload1Ptr410Modified()) { 
           payload1Ptr410 = refreshPayload1Ptr410();
        }
   		return payload1Ptr410;
	}
	
	/**
	 * 	Update Payload1Ptr410 with the passed value
	 *  Corresponding COBOL Variable is 410-PAYLOAD-1-PTR
	 *	@param number
	 */
	public void setPayload1Ptr410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    payload1Ptr410 = checkPayload1Ptr410MaxLimit(number); 
		serializePayload1Ptr410(payload1Ptr410);
	}

	public void setPayload1Ptr410(int number) {
	    number = checkPayload1Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPayload1Ptr410((short)number);
	}
	public void setPayload1Ptr410(long number) {
	    number = checkPayload1Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPayload1Ptr410((short)number);
	}
	

	/**
	 *	Returns the value of isoMsg2Ptr410
	 *	@return isoMsg2Ptr410
	 */
	public short getIsoMsg2Ptr410() throws CFException {
        if (isIsoMsg2Ptr410Modified()) { 
           isoMsg2Ptr410 = refreshIsoMsg2Ptr410();
        }
   		return isoMsg2Ptr410;
	}
	
	/**
	 * 	Update IsoMsg2Ptr410 with the passed value
	 *  Corresponding COBOL Variable is 410-ISO-MSG2-PTR
	 *	@param number
	 */
	public void setIsoMsg2Ptr410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    isoMsg2Ptr410 = checkIsoMsg2Ptr410MaxLimit(number); 
		serializeIsoMsg2Ptr410(isoMsg2Ptr410);
	}

	public void setIsoMsg2Ptr410(int number) {
	    number = checkIsoMsg2Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIsoMsg2Ptr410((short)number);
	}
	public void setIsoMsg2Ptr410(long number) {
	    number = checkIsoMsg2Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIsoMsg2Ptr410((short)number);
	}
	

	/**
	 *	Returns the value of isoMsg2Lnth410
	 *	@return isoMsg2Lnth410
	 */
	public short getIsoMsg2Lnth410() throws CFException {
        if (isIsoMsg2Lnth410Modified()) { 
           isoMsg2Lnth410 = refreshIsoMsg2Lnth410();
        }
   		return isoMsg2Lnth410;
	}
	
	/**
	 * 	Update IsoMsg2Lnth410 with the passed value
	 *  Corresponding COBOL Variable is 410-ISO-MSG2-LNTH
	 *	@param number
	 */
	public void setIsoMsg2Lnth410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    isoMsg2Lnth410 = checkIsoMsg2Lnth410MaxLimit(number); 
		serializeIsoMsg2Lnth410(isoMsg2Lnth410);
	}

	public void setIsoMsg2Lnth410(int number) {
	    number = checkIsoMsg2Lnth410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIsoMsg2Lnth410((short)number);
	}
	public void setIsoMsg2Lnth410(long number) {
	    number = checkIsoMsg2Lnth410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIsoMsg2Lnth410((short)number);
	}
	

	/**
	 *	Returns the value of trailer1Ptr410
	 *	@return trailer1Ptr410
	 */
	public short getTrailer1Ptr410() throws CFException {
        if (isTrailer1Ptr410Modified()) { 
           trailer1Ptr410 = refreshTrailer1Ptr410();
        }
   		return trailer1Ptr410;
	}
	
	/**
	 * 	Update Trailer1Ptr410 with the passed value
	 *  Corresponding COBOL Variable is 410-TRAILER-1-PTR
	 *	@param number
	 */
	public void setTrailer1Ptr410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    trailer1Ptr410 = checkTrailer1Ptr410MaxLimit(number); 
		serializeTrailer1Ptr410(trailer1Ptr410);
	}

	public void setTrailer1Ptr410(int number) {
	    number = checkTrailer1Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer1Ptr410((short)number);
	}
	public void setTrailer1Ptr410(long number) {
	    number = checkTrailer1Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer1Ptr410((short)number);
	}
	

	/**
	 *	Returns the value of trailer1Lnth410
	 *	@return trailer1Lnth410
	 */
	public short getTrailer1Lnth410() throws CFException {
        if (isTrailer1Lnth410Modified()) { 
           trailer1Lnth410 = refreshTrailer1Lnth410();
        }
   		return trailer1Lnth410;
	}
	
	/**
	 * 	Update Trailer1Lnth410 with the passed value
	 *  Corresponding COBOL Variable is 410-TRAILER-1-LNTH
	 *	@param number
	 */
	public void setTrailer1Lnth410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    trailer1Lnth410 = checkTrailer1Lnth410MaxLimit(number); 
		serializeTrailer1Lnth410(trailer1Lnth410);
	}

	public void setTrailer1Lnth410(int number) {
	    number = checkTrailer1Lnth410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer1Lnth410((short)number);
	}
	public void setTrailer1Lnth410(long number) {
	    number = checkTrailer1Lnth410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer1Lnth410((short)number);
	}
	

	/**
	 *	Returns the value of trailer2Ptr410
	 *	@return trailer2Ptr410
	 */
	public short getTrailer2Ptr410() throws CFException {
        if (isTrailer2Ptr410Modified()) { 
           trailer2Ptr410 = refreshTrailer2Ptr410();
        }
   		return trailer2Ptr410;
	}
	
	/**
	 * 	Update Trailer2Ptr410 with the passed value
	 *  Corresponding COBOL Variable is 410-TRAILER-2-PTR
	 *	@param number
	 */
	public void setTrailer2Ptr410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    trailer2Ptr410 = checkTrailer2Ptr410MaxLimit(number); 
		serializeTrailer2Ptr410(trailer2Ptr410);
	}

	public void setTrailer2Ptr410(int number) {
	    number = checkTrailer2Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer2Ptr410((short)number);
	}
	public void setTrailer2Ptr410(long number) {
	    number = checkTrailer2Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer2Ptr410((short)number);
	}
	

	/**
	 *	Returns the value of trailer2Lnth410
	 *	@return trailer2Lnth410
	 */
	public short getTrailer2Lnth410() throws CFException {
        if (isTrailer2Lnth410Modified()) { 
           trailer2Lnth410 = refreshTrailer2Lnth410();
        }
   		return trailer2Lnth410;
	}
	
	/**
	 * 	Update Trailer2Lnth410 with the passed value
	 *  Corresponding COBOL Variable is 410-TRAILER-2-LNTH
	 *	@param number
	 */
	public void setTrailer2Lnth410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    trailer2Lnth410 = checkTrailer2Lnth410MaxLimit(number); 
		serializeTrailer2Lnth410(trailer2Lnth410);
	}

	public void setTrailer2Lnth410(int number) {
	    number = checkTrailer2Lnth410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer2Lnth410((short)number);
	}
	public void setTrailer2Lnth410(long number) {
	    number = checkTrailer2Lnth410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTrailer2Lnth410((short)number);
	}
	

	/**
	 *	Returns the value of holdSr2Ptr410
	 *	@return holdSr2Ptr410
	 */
	public short getHoldSr2Ptr410() throws CFException {
        if (isHoldSr2Ptr410Modified()) { 
           holdSr2Ptr410 = refreshHoldSr2Ptr410();
        }
   		return holdSr2Ptr410;
	}
	
	/**
	 * 	Update HoldSr2Ptr410 with the passed value
	 *  Corresponding COBOL Variable is 410-HOLD-SR2-PTR
	 *	@param number
	 */
	public void setHoldSr2Ptr410(short number) {
	     // Truncate if the number is beyond +/- Max range
	    holdSr2Ptr410 = checkHoldSr2Ptr410MaxLimit(number); 
		serializeHoldSr2Ptr410(holdSr2Ptr410);
	}

	public void setHoldSr2Ptr410(int number) {
	    number = checkHoldSr2Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHoldSr2Ptr410((short)number);
	}
	public void setHoldSr2Ptr410(long number) {
	    number = checkHoldSr2Ptr410MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHoldSr2Ptr410((short)number);
	}
	


	
	
	
	/**
	 * 	initializes ZlogPointers410
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setServInfoCount410((short)0);
         	setServInfoPtr410((short)0);
         	setPayload1Ptr410((short)0);
         	setIsoMsg2Ptr410((short)0);
         	setIsoMsg2Lnth410((short)0);
         	setTrailer1Ptr410((short)0);
         	setTrailer1Lnth410((short)0);
         	setTrailer2Ptr410((short)0);
         	setTrailer2Lnth410((short)0);
         	setHoldSr2Ptr410((short)0);
   }

		public static int getZlogPointers410FieldLength() {
			return ZLOG_POINTERS_410_LENGTH;
		}

}
  
