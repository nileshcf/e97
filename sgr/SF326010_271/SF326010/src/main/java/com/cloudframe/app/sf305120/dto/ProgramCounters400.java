package com.cloudframe.app.sf305120.dto;

/**
*  The class ProgramCounters400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class ProgramCounters400 extends ProgramCounters400Serialized {
   

								private short iteration400;

								private short sub400;

								private short srSub400;

								private short sr1Length400;

								private short vardataLnth400;

								private int isoOffset400;

								private int x9aOffset400;

								private int eitOffset400;

								private int esHdrLen400;

								private int siHdrLen400;
	
	/**
	* Constructor for ProgramCounters400
	**/
    public ProgramCounters400() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIteration400((short)0);
								setSub400((short)0);
								setSrSub400((short)0);
								setSr1Length400((short)0);
								setVardataLnth400((short)0);
								setIsoOffset400(0);
								setX9aOffset400(0);
								setEitOffset400(0);
								setEsHdrLen400(0);
								setSiHdrLen400(0);
    }


 

	/**
	 *	Returns the value of iteration400
	 *	@return iteration400
	 */
	public short getIteration400() throws CFException {
        if (isIteration400Modified()) { 
           iteration400 = refreshIteration400();
        }
   		return iteration400;
	}
	
	/**
	 * 	Update Iteration400 with the passed value
	 *  Corresponding COBOL Variable is 400-ITERATION
	 *	@param number
	 */
	public void setIteration400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    iteration400 = checkIteration400MaxLimit(number); 
		serializeIteration400(iteration400);
	}

	public void setIteration400(int number) {
	    number = checkIteration400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIteration400((short)number);
	}
	public void setIteration400(long number) {
	    number = checkIteration400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIteration400((short)number);
	}
	

	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {
        if (isSub400Modified()) { 
           sub400 = refreshSub400();
        }
   		return sub400;
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUB
	 *	@param number
	 */
	public void setSub400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub400 = checkSub400MaxLimit(number); 
		serializeSub400(sub400);
	}

	public void setSub400(int number) {
	    number = checkSub400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub400((short)number);
	}
	public void setSub400(long number) {
	    number = checkSub400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub400((short)number);
	}
	

	/**
	 *	Returns the value of srSub400
	 *	@return srSub400
	 */
	public short getSrSub400() throws CFException {
        if (isSrSub400Modified()) { 
           srSub400 = refreshSrSub400();
        }
   		return srSub400;
	}
	
	/**
	 * 	Update SrSub400 with the passed value
	 *  Corresponding COBOL Variable is 400-SR-SUB
	 *	@param number
	 */
	public void setSrSub400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    srSub400 = checkSrSub400MaxLimit(number); 
		serializeSrSub400(srSub400);
	}

	public void setSrSub400(int number) {
	    number = checkSrSub400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSrSub400((short)number);
	}
	public void setSrSub400(long number) {
	    number = checkSrSub400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSrSub400((short)number);
	}
	

	/**
	 *	Returns the value of sr1Length400
	 *	@return sr1Length400
	 */
	public short getSr1Length400() throws CFException {
        if (isSr1Length400Modified()) { 
           sr1Length400 = refreshSr1Length400();
        }
   		return sr1Length400;
	}
	
	/**
	 * 	Update Sr1Length400 with the passed value
	 *  Corresponding COBOL Variable is 400-SR1-LENGTH
	 *	@param number
	 */
	public void setSr1Length400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sr1Length400 = checkSr1Length400MaxLimit(number); 
		serializeSr1Length400(sr1Length400);
	}

	public void setSr1Length400(int number) {
	    number = checkSr1Length400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSr1Length400((short)number);
	}
	public void setSr1Length400(long number) {
	    number = checkSr1Length400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSr1Length400((short)number);
	}
	

	/**
	 *	Returns the value of vardataLnth400
	 *	@return vardataLnth400
	 */
	public short getVardataLnth400() throws CFException {
        if (isVardataLnth400Modified()) { 
           vardataLnth400 = refreshVardataLnth400();
        }
   		return vardataLnth400;
	}
	
	/**
	 * 	Update VardataLnth400 with the passed value
	 *  Corresponding COBOL Variable is 400-VARDATA-LNTH
	 *	@param number
	 */
	public void setVardataLnth400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    vardataLnth400 = checkVardataLnth400MaxLimit(number); 
		serializeVardataLnth400(vardataLnth400);
	}

	public void setVardataLnth400(int number) {
	    number = checkVardataLnth400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVardataLnth400((short)number);
	}
	public void setVardataLnth400(long number) {
	    number = checkVardataLnth400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVardataLnth400((short)number);
	}
	

	/**
	 *	Returns the value of isoOffset400
	 *	@return isoOffset400
	 */
	public int getIsoOffset400() throws CFException {
        if (isIsoOffset400Modified()) { 
           isoOffset400 = refreshIsoOffset400();
        }
   		return isoOffset400;
	}
	
	/**
	 * 	Update IsoOffset400 with the passed value
	 *  Corresponding COBOL Variable is 400-ISO-OFFSET
	 *	@param number
	 */
	public void setIsoOffset400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    isoOffset400 = checkIsoOffset400MaxLimit(number); 
		serializeIsoOffset400(isoOffset400);
	}


	public void setIsoOffset400(long number) {
	    number = checkIsoOffset400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIsoOffset400((int)number);
	}
	
	/**
	 *	Returns the value of x9aOffset400
	 *	@return x9aOffset400
	 */
	public int getX9aOffset400() throws CFException {
        if (isX9aOffset400Modified()) { 
           x9aOffset400 = refreshX9aOffset400();
        }
   		return x9aOffset400;
	}
	
	/**
	 * 	Update X9aOffset400 with the passed value
	 *  Corresponding COBOL Variable is 400-X9A-OFFSET
	 *	@param number
	 */
	public void setX9aOffset400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    x9aOffset400 = checkX9aOffset400MaxLimit(number); 
		serializeX9aOffset400(x9aOffset400);
	}


	public void setX9aOffset400(long number) {
	    number = checkX9aOffset400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setX9aOffset400((int)number);
	}
	
	/**
	 *	Returns the value of eitOffset400
	 *	@return eitOffset400
	 */
	public int getEitOffset400() throws CFException {
        if (isEitOffset400Modified()) { 
           eitOffset400 = refreshEitOffset400();
        }
   		return eitOffset400;
	}
	
	/**
	 * 	Update EitOffset400 with the passed value
	 *  Corresponding COBOL Variable is 400-EIT-OFFSET
	 *	@param number
	 */
	public void setEitOffset400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    eitOffset400 = checkEitOffset400MaxLimit(number); 
		serializeEitOffset400(eitOffset400);
	}


	public void setEitOffset400(long number) {
	    number = checkEitOffset400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEitOffset400((int)number);
	}
	
	/**
	 *	Returns the value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public int getEsHdrLen400() throws CFException {
       if (isEsHdrLen400Modified()) { 
           esHdrLen400 = refreshEsHdrLen400();
        }
   		return esHdrLen400;
	}
	

	
	   
	/**
	 * 	Update EsHdrLen400 with the passed value
	 *  Corresponding COBOL Variable is 400-ES-HDR-LEN
	 *	@param number
	 */
	public void setEsHdrLen400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    esHdrLen400 = checkEsHdrLen400MaxLimit(number); 
		serializeEsHdrLen400(esHdrLen400);
	}
	

	public void setEsHdrLen400(long number) {
	    number = checkEsHdrLen400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEsHdrLen400((int)number);
	}
	
	/**
	 * 	Update EsHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400(char[] value) throws CFException {
		 esHdrLen400 = serializeEsHdrLen400(value);
	}
	/**
	 * 	Update EsHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEsHdrLen400String(char[] value) throws CFException {
		 setEsHdrLen400(value);
	}
	/**
	 *	Returns the value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public int getSiHdrLen400() throws CFException {
       if (isSiHdrLen400Modified()) { 
           siHdrLen400 = refreshSiHdrLen400();
        }
   		return siHdrLen400;
	}
	

	
	   
	/**
	 * 	Update SiHdrLen400 with the passed value
	 *  Corresponding COBOL Variable is 400-SI-HDR-LEN
	 *	@param number
	 */
	public void setSiHdrLen400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    siHdrLen400 = checkSiHdrLen400MaxLimit(number); 
		serializeSiHdrLen400(siHdrLen400);
	}
	

	public void setSiHdrLen400(long number) {
	    number = checkSiHdrLen400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSiHdrLen400((int)number);
	}
	
	/**
	 * 	Update SiHdrLen400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400(char[] value) throws CFException {
		 siHdrLen400 = serializeSiHdrLen400(value);
	}
	/**
	 * 	Update SiHdrLen400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSiHdrLen400String(char[] value) throws CFException {
		 setSiHdrLen400(value);
	}

	
	
	
	/**
	 * 	initializes ProgramCounters400
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIteration400((short)0);
         	setSub400((short)0);
         	setSrSub400((short)0);
         	setSr1Length400((short)0);
         	setVardataLnth400((short)0);
                     setIsoOffset400(0);
                     setX9aOffset400(0);
                     setEitOffset400(0);
                     setEsHdrLen400(0);
                     setSiHdrLen400(0);
   }

		public static int getProgramCounters400FieldLength() {
			return PROGRAM_COUNTERS_400_LENGTH;
		}

}
  
