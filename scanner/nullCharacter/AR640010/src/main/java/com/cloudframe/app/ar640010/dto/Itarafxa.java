package com.cloudframe.app.ar640010.dto;

/**
*  The class Itarafxa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Itarafxa extends ItarafxaSerialized {
   

								private short tarafxaArchLocTxtN;

								private short tarafxaLstStatTsN;

								private short tarafxaXferRqstTsN;

								private short tarafxaXferStrtTsN;

								private short tarafxaXferStopTsN;

								private short tarafxaXferRdyTsN;

								private short tarafxaXferCondCdN;

								private short tarafxaXferStatTxtN;

								private short tarafxaXferPrcssIdN;

								private short tarafxaOrgXferPrcsIdN;

								private short tarafxaTrgrCondCdN;

								private short tarafxaTrgrStatTxtN;

								private short tarafxaOrgLocNamN;

								private short tarafxaTrgrActNamN;

								private short tarafxaPrvMnfrmFileNamN;

								private short tarafxaPrvCyclNumN;

								private short tarafxaPrvBusPrtnrIdN;

								private short tarafxaPrvEndptIdN;

								private short tarafxaPrvAvailTsN;

								private short tarafxaNxtMnfrmFileNamN;

								private short tarafxaNxtCyclNumN;

								private short tarafxaNxtBusPrtnrIdN;

								private short tarafxaNxtEndptIdN;

								private short tarafxaNxtAvailTsN;

								private short tarafxaApplExitJobNamN;

								private short tarafxaApplExitTsN;

								private short tarafxaCsMipIdN;

								private short tarafxaRmMipIdN;

								private short tarafxaApplExitNamN;

								private short tarafxaTapeCmpltdSwN;

								private short tarafxaTapeMultVolSwN;

								private short tarafxaApplPrcssngDtN;

								private short tarafxaTransitionalDsnN;

								private short tarafxaSourceHubIdN;

								private short tarafxaOwningHubIdN;

								private short tarafxaStatRefIdN;

								private short tarafxaSrcLocEntNamN;

								private short tarafxaSrcTaskNamN;

								private short tarafxaSrcTaskIdN;

								private short tarafxaSrcTaskUsrN;

								private short tarafxaSrcTaskStrtTsN;

								private short tarafxaSrcTaskStopTsN;

								private short tarafxaTrgtLocEntNamN;

								private short tarafxaTrgtTaskNamN;

								private short tarafxaTrgtTaskIdN;

								private short tarafxaTrgtTaskUsrN;

								private short tarafxaTrgtTaskStrtTsN;

								private short tarafxaTrgtTaskStopTsN;

								private short tarafxaApplTknNamN;
	
	/**
	* Constructor for Itarafxa
	**/
    public Itarafxa() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tarafxaArchLocTxtN
	 *	@return tarafxaArchLocTxtN
	 */
	public short getTarafxaArchLocTxtN() throws CFException {
        if (isTarafxaArchLocTxtNModified()) { 
           tarafxaArchLocTxtN = refreshTarafxaArchLocTxtN();
        }
   		return tarafxaArchLocTxtN;
	}
	
	/**
	 * 	Update TarafxaArchLocTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-ARCH-LOC-TXT-N
	 *	@param number
	 */
	public void setTarafxaArchLocTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaArchLocTxtN = checkTarafxaArchLocTxtNMaxLimit(number); 
		serializeTarafxaArchLocTxtN(tarafxaArchLocTxtN);
	}

	public void setTarafxaArchLocTxtN(int number) {
	    number = checkTarafxaArchLocTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaArchLocTxtN((short)number);
	}
	public void setTarafxaArchLocTxtN(long number) {
	    number = checkTarafxaArchLocTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaArchLocTxtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaLstStatTsN
	 *	@return tarafxaLstStatTsN
	 */
	public short getTarafxaLstStatTsN() throws CFException {
        if (isTarafxaLstStatTsNModified()) { 
           tarafxaLstStatTsN = refreshTarafxaLstStatTsN();
        }
   		return tarafxaLstStatTsN;
	}
	
	/**
	 * 	Update TarafxaLstStatTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-LST-STAT-TS-N
	 *	@param number
	 */
	public void setTarafxaLstStatTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaLstStatTsN = checkTarafxaLstStatTsNMaxLimit(number); 
		serializeTarafxaLstStatTsN(tarafxaLstStatTsN);
	}

	public void setTarafxaLstStatTsN(int number) {
	    number = checkTarafxaLstStatTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaLstStatTsN((short)number);
	}
	public void setTarafxaLstStatTsN(long number) {
	    number = checkTarafxaLstStatTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaLstStatTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaXferRqstTsN
	 *	@return tarafxaXferRqstTsN
	 */
	public short getTarafxaXferRqstTsN() throws CFException {
        if (isTarafxaXferRqstTsNModified()) { 
           tarafxaXferRqstTsN = refreshTarafxaXferRqstTsN();
        }
   		return tarafxaXferRqstTsN;
	}
	
	/**
	 * 	Update TarafxaXferRqstTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-RQST-TS-N
	 *	@param number
	 */
	public void setTarafxaXferRqstTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaXferRqstTsN = checkTarafxaXferRqstTsNMaxLimit(number); 
		serializeTarafxaXferRqstTsN(tarafxaXferRqstTsN);
	}

	public void setTarafxaXferRqstTsN(int number) {
	    number = checkTarafxaXferRqstTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferRqstTsN((short)number);
	}
	public void setTarafxaXferRqstTsN(long number) {
	    number = checkTarafxaXferRqstTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferRqstTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaXferStrtTsN
	 *	@return tarafxaXferStrtTsN
	 */
	public short getTarafxaXferStrtTsN() throws CFException {
        if (isTarafxaXferStrtTsNModified()) { 
           tarafxaXferStrtTsN = refreshTarafxaXferStrtTsN();
        }
   		return tarafxaXferStrtTsN;
	}
	
	/**
	 * 	Update TarafxaXferStrtTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-STRT-TS-N
	 *	@param number
	 */
	public void setTarafxaXferStrtTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaXferStrtTsN = checkTarafxaXferStrtTsNMaxLimit(number); 
		serializeTarafxaXferStrtTsN(tarafxaXferStrtTsN);
	}

	public void setTarafxaXferStrtTsN(int number) {
	    number = checkTarafxaXferStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferStrtTsN((short)number);
	}
	public void setTarafxaXferStrtTsN(long number) {
	    number = checkTarafxaXferStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferStrtTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaXferStopTsN
	 *	@return tarafxaXferStopTsN
	 */
	public short getTarafxaXferStopTsN() throws CFException {
        if (isTarafxaXferStopTsNModified()) { 
           tarafxaXferStopTsN = refreshTarafxaXferStopTsN();
        }
   		return tarafxaXferStopTsN;
	}
	
	/**
	 * 	Update TarafxaXferStopTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-STOP-TS-N
	 *	@param number
	 */
	public void setTarafxaXferStopTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaXferStopTsN = checkTarafxaXferStopTsNMaxLimit(number); 
		serializeTarafxaXferStopTsN(tarafxaXferStopTsN);
	}

	public void setTarafxaXferStopTsN(int number) {
	    number = checkTarafxaXferStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferStopTsN((short)number);
	}
	public void setTarafxaXferStopTsN(long number) {
	    number = checkTarafxaXferStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferStopTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaXferRdyTsN
	 *	@return tarafxaXferRdyTsN
	 */
	public short getTarafxaXferRdyTsN() throws CFException {
        if (isTarafxaXferRdyTsNModified()) { 
           tarafxaXferRdyTsN = refreshTarafxaXferRdyTsN();
        }
   		return tarafxaXferRdyTsN;
	}
	
	/**
	 * 	Update TarafxaXferRdyTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-RDY-TS-N
	 *	@param number
	 */
	public void setTarafxaXferRdyTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaXferRdyTsN = checkTarafxaXferRdyTsNMaxLimit(number); 
		serializeTarafxaXferRdyTsN(tarafxaXferRdyTsN);
	}

	public void setTarafxaXferRdyTsN(int number) {
	    number = checkTarafxaXferRdyTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferRdyTsN((short)number);
	}
	public void setTarafxaXferRdyTsN(long number) {
	    number = checkTarafxaXferRdyTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferRdyTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaXferCondCdN
	 *	@return tarafxaXferCondCdN
	 */
	public short getTarafxaXferCondCdN() throws CFException {
        if (isTarafxaXferCondCdNModified()) { 
           tarafxaXferCondCdN = refreshTarafxaXferCondCdN();
        }
   		return tarafxaXferCondCdN;
	}
	
	/**
	 * 	Update TarafxaXferCondCdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-COND-CD-N
	 *	@param number
	 */
	public void setTarafxaXferCondCdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaXferCondCdN = checkTarafxaXferCondCdNMaxLimit(number); 
		serializeTarafxaXferCondCdN(tarafxaXferCondCdN);
	}

	public void setTarafxaXferCondCdN(int number) {
	    number = checkTarafxaXferCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferCondCdN((short)number);
	}
	public void setTarafxaXferCondCdN(long number) {
	    number = checkTarafxaXferCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferCondCdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaXferStatTxtN
	 *	@return tarafxaXferStatTxtN
	 */
	public short getTarafxaXferStatTxtN() throws CFException {
        if (isTarafxaXferStatTxtNModified()) { 
           tarafxaXferStatTxtN = refreshTarafxaXferStatTxtN();
        }
   		return tarafxaXferStatTxtN;
	}
	
	/**
	 * 	Update TarafxaXferStatTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-STAT-TXT-N
	 *	@param number
	 */
	public void setTarafxaXferStatTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaXferStatTxtN = checkTarafxaXferStatTxtNMaxLimit(number); 
		serializeTarafxaXferStatTxtN(tarafxaXferStatTxtN);
	}

	public void setTarafxaXferStatTxtN(int number) {
	    number = checkTarafxaXferStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferStatTxtN((short)number);
	}
	public void setTarafxaXferStatTxtN(long number) {
	    number = checkTarafxaXferStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferStatTxtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaXferPrcssIdN
	 *	@return tarafxaXferPrcssIdN
	 */
	public short getTarafxaXferPrcssIdN() throws CFException {
        if (isTarafxaXferPrcssIdNModified()) { 
           tarafxaXferPrcssIdN = refreshTarafxaXferPrcssIdN();
        }
   		return tarafxaXferPrcssIdN;
	}
	
	/**
	 * 	Update TarafxaXferPrcssIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-XFER-PRCSS-ID-N
	 *	@param number
	 */
	public void setTarafxaXferPrcssIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaXferPrcssIdN = checkTarafxaXferPrcssIdNMaxLimit(number); 
		serializeTarafxaXferPrcssIdN(tarafxaXferPrcssIdN);
	}

	public void setTarafxaXferPrcssIdN(int number) {
	    number = checkTarafxaXferPrcssIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferPrcssIdN((short)number);
	}
	public void setTarafxaXferPrcssIdN(long number) {
	    number = checkTarafxaXferPrcssIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaXferPrcssIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaOrgXferPrcsIdN
	 *	@return tarafxaOrgXferPrcsIdN
	 */
	public short getTarafxaOrgXferPrcsIdN() throws CFException {
        if (isTarafxaOrgXferPrcsIdNModified()) { 
           tarafxaOrgXferPrcsIdN = refreshTarafxaOrgXferPrcsIdN();
        }
   		return tarafxaOrgXferPrcsIdN;
	}
	
	/**
	 * 	Update TarafxaOrgXferPrcsIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-ORG-XFER-PRCS-ID-N
	 *	@param number
	 */
	public void setTarafxaOrgXferPrcsIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaOrgXferPrcsIdN = checkTarafxaOrgXferPrcsIdNMaxLimit(number); 
		serializeTarafxaOrgXferPrcsIdN(tarafxaOrgXferPrcsIdN);
	}

	public void setTarafxaOrgXferPrcsIdN(int number) {
	    number = checkTarafxaOrgXferPrcsIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaOrgXferPrcsIdN((short)number);
	}
	public void setTarafxaOrgXferPrcsIdN(long number) {
	    number = checkTarafxaOrgXferPrcsIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaOrgXferPrcsIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgrCondCdN
	 *	@return tarafxaTrgrCondCdN
	 */
	public short getTarafxaTrgrCondCdN() throws CFException {
        if (isTarafxaTrgrCondCdNModified()) { 
           tarafxaTrgrCondCdN = refreshTarafxaTrgrCondCdN();
        }
   		return tarafxaTrgrCondCdN;
	}
	
	/**
	 * 	Update TarafxaTrgrCondCdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGR-COND-CD-N
	 *	@param number
	 */
	public void setTarafxaTrgrCondCdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgrCondCdN = checkTarafxaTrgrCondCdNMaxLimit(number); 
		serializeTarafxaTrgrCondCdN(tarafxaTrgrCondCdN);
	}

	public void setTarafxaTrgrCondCdN(int number) {
	    number = checkTarafxaTrgrCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgrCondCdN((short)number);
	}
	public void setTarafxaTrgrCondCdN(long number) {
	    number = checkTarafxaTrgrCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgrCondCdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgrStatTxtN
	 *	@return tarafxaTrgrStatTxtN
	 */
	public short getTarafxaTrgrStatTxtN() throws CFException {
        if (isTarafxaTrgrStatTxtNModified()) { 
           tarafxaTrgrStatTxtN = refreshTarafxaTrgrStatTxtN();
        }
   		return tarafxaTrgrStatTxtN;
	}
	
	/**
	 * 	Update TarafxaTrgrStatTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGR-STAT-TXT-N
	 *	@param number
	 */
	public void setTarafxaTrgrStatTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgrStatTxtN = checkTarafxaTrgrStatTxtNMaxLimit(number); 
		serializeTarafxaTrgrStatTxtN(tarafxaTrgrStatTxtN);
	}

	public void setTarafxaTrgrStatTxtN(int number) {
	    number = checkTarafxaTrgrStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgrStatTxtN((short)number);
	}
	public void setTarafxaTrgrStatTxtN(long number) {
	    number = checkTarafxaTrgrStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgrStatTxtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaOrgLocNamN
	 *	@return tarafxaOrgLocNamN
	 */
	public short getTarafxaOrgLocNamN() throws CFException {
        if (isTarafxaOrgLocNamNModified()) { 
           tarafxaOrgLocNamN = refreshTarafxaOrgLocNamN();
        }
   		return tarafxaOrgLocNamN;
	}
	
	/**
	 * 	Update TarafxaOrgLocNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-ORG-LOC-NAM-N
	 *	@param number
	 */
	public void setTarafxaOrgLocNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaOrgLocNamN = checkTarafxaOrgLocNamNMaxLimit(number); 
		serializeTarafxaOrgLocNamN(tarafxaOrgLocNamN);
	}

	public void setTarafxaOrgLocNamN(int number) {
	    number = checkTarafxaOrgLocNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaOrgLocNamN((short)number);
	}
	public void setTarafxaOrgLocNamN(long number) {
	    number = checkTarafxaOrgLocNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaOrgLocNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgrActNamN
	 *	@return tarafxaTrgrActNamN
	 */
	public short getTarafxaTrgrActNamN() throws CFException {
        if (isTarafxaTrgrActNamNModified()) { 
           tarafxaTrgrActNamN = refreshTarafxaTrgrActNamN();
        }
   		return tarafxaTrgrActNamN;
	}
	
	/**
	 * 	Update TarafxaTrgrActNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGR-ACT-NAM-N
	 *	@param number
	 */
	public void setTarafxaTrgrActNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgrActNamN = checkTarafxaTrgrActNamNMaxLimit(number); 
		serializeTarafxaTrgrActNamN(tarafxaTrgrActNamN);
	}

	public void setTarafxaTrgrActNamN(int number) {
	    number = checkTarafxaTrgrActNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgrActNamN((short)number);
	}
	public void setTarafxaTrgrActNamN(long number) {
	    number = checkTarafxaTrgrActNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgrActNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaPrvMnfrmFileNamN
	 *	@return tarafxaPrvMnfrmFileNamN
	 */
	public short getTarafxaPrvMnfrmFileNamN() throws CFException {
        if (isTarafxaPrvMnfrmFileNamNModified()) { 
           tarafxaPrvMnfrmFileNamN = refreshTarafxaPrvMnfrmFileNamN();
        }
   		return tarafxaPrvMnfrmFileNamN;
	}
	
	/**
	 * 	Update TarafxaPrvMnfrmFileNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-PRV-MNFRM-FILE-NAM-N
	 *	@param number
	 */
	public void setTarafxaPrvMnfrmFileNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaPrvMnfrmFileNamN = checkTarafxaPrvMnfrmFileNamNMaxLimit(number); 
		serializeTarafxaPrvMnfrmFileNamN(tarafxaPrvMnfrmFileNamN);
	}

	public void setTarafxaPrvMnfrmFileNamN(int number) {
	    number = checkTarafxaPrvMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvMnfrmFileNamN((short)number);
	}
	public void setTarafxaPrvMnfrmFileNamN(long number) {
	    number = checkTarafxaPrvMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvMnfrmFileNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaPrvCyclNumN
	 *	@return tarafxaPrvCyclNumN
	 */
	public short getTarafxaPrvCyclNumN() throws CFException {
        if (isTarafxaPrvCyclNumNModified()) { 
           tarafxaPrvCyclNumN = refreshTarafxaPrvCyclNumN();
        }
   		return tarafxaPrvCyclNumN;
	}
	
	/**
	 * 	Update TarafxaPrvCyclNumN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-PRV-CYCL-NUM-N
	 *	@param number
	 */
	public void setTarafxaPrvCyclNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaPrvCyclNumN = checkTarafxaPrvCyclNumNMaxLimit(number); 
		serializeTarafxaPrvCyclNumN(tarafxaPrvCyclNumN);
	}

	public void setTarafxaPrvCyclNumN(int number) {
	    number = checkTarafxaPrvCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvCyclNumN((short)number);
	}
	public void setTarafxaPrvCyclNumN(long number) {
	    number = checkTarafxaPrvCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvCyclNumN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaPrvBusPrtnrIdN
	 *	@return tarafxaPrvBusPrtnrIdN
	 */
	public short getTarafxaPrvBusPrtnrIdN() throws CFException {
        if (isTarafxaPrvBusPrtnrIdNModified()) { 
           tarafxaPrvBusPrtnrIdN = refreshTarafxaPrvBusPrtnrIdN();
        }
   		return tarafxaPrvBusPrtnrIdN;
	}
	
	/**
	 * 	Update TarafxaPrvBusPrtnrIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-PRV-BUS-PRTNR-ID-N
	 *	@param number
	 */
	public void setTarafxaPrvBusPrtnrIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaPrvBusPrtnrIdN = checkTarafxaPrvBusPrtnrIdNMaxLimit(number); 
		serializeTarafxaPrvBusPrtnrIdN(tarafxaPrvBusPrtnrIdN);
	}

	public void setTarafxaPrvBusPrtnrIdN(int number) {
	    number = checkTarafxaPrvBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvBusPrtnrIdN((short)number);
	}
	public void setTarafxaPrvBusPrtnrIdN(long number) {
	    number = checkTarafxaPrvBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvBusPrtnrIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaPrvEndptIdN
	 *	@return tarafxaPrvEndptIdN
	 */
	public short getTarafxaPrvEndptIdN() throws CFException {
        if (isTarafxaPrvEndptIdNModified()) { 
           tarafxaPrvEndptIdN = refreshTarafxaPrvEndptIdN();
        }
   		return tarafxaPrvEndptIdN;
	}
	
	/**
	 * 	Update TarafxaPrvEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-PRV-ENDPT-ID-N
	 *	@param number
	 */
	public void setTarafxaPrvEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaPrvEndptIdN = checkTarafxaPrvEndptIdNMaxLimit(number); 
		serializeTarafxaPrvEndptIdN(tarafxaPrvEndptIdN);
	}

	public void setTarafxaPrvEndptIdN(int number) {
	    number = checkTarafxaPrvEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvEndptIdN((short)number);
	}
	public void setTarafxaPrvEndptIdN(long number) {
	    number = checkTarafxaPrvEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvEndptIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaPrvAvailTsN
	 *	@return tarafxaPrvAvailTsN
	 */
	public short getTarafxaPrvAvailTsN() throws CFException {
        if (isTarafxaPrvAvailTsNModified()) { 
           tarafxaPrvAvailTsN = refreshTarafxaPrvAvailTsN();
        }
   		return tarafxaPrvAvailTsN;
	}
	
	/**
	 * 	Update TarafxaPrvAvailTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-PRV-AVAIL-TS-N
	 *	@param number
	 */
	public void setTarafxaPrvAvailTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaPrvAvailTsN = checkTarafxaPrvAvailTsNMaxLimit(number); 
		serializeTarafxaPrvAvailTsN(tarafxaPrvAvailTsN);
	}

	public void setTarafxaPrvAvailTsN(int number) {
	    number = checkTarafxaPrvAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvAvailTsN((short)number);
	}
	public void setTarafxaPrvAvailTsN(long number) {
	    number = checkTarafxaPrvAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaPrvAvailTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaNxtMnfrmFileNamN
	 *	@return tarafxaNxtMnfrmFileNamN
	 */
	public short getTarafxaNxtMnfrmFileNamN() throws CFException {
        if (isTarafxaNxtMnfrmFileNamNModified()) { 
           tarafxaNxtMnfrmFileNamN = refreshTarafxaNxtMnfrmFileNamN();
        }
   		return tarafxaNxtMnfrmFileNamN;
	}
	
	/**
	 * 	Update TarafxaNxtMnfrmFileNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-NXT-MNFRM-FILE-NAM-N
	 *	@param number
	 */
	public void setTarafxaNxtMnfrmFileNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaNxtMnfrmFileNamN = checkTarafxaNxtMnfrmFileNamNMaxLimit(number); 
		serializeTarafxaNxtMnfrmFileNamN(tarafxaNxtMnfrmFileNamN);
	}

	public void setTarafxaNxtMnfrmFileNamN(int number) {
	    number = checkTarafxaNxtMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtMnfrmFileNamN((short)number);
	}
	public void setTarafxaNxtMnfrmFileNamN(long number) {
	    number = checkTarafxaNxtMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtMnfrmFileNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaNxtCyclNumN
	 *	@return tarafxaNxtCyclNumN
	 */
	public short getTarafxaNxtCyclNumN() throws CFException {
        if (isTarafxaNxtCyclNumNModified()) { 
           tarafxaNxtCyclNumN = refreshTarafxaNxtCyclNumN();
        }
   		return tarafxaNxtCyclNumN;
	}
	
	/**
	 * 	Update TarafxaNxtCyclNumN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-NXT-CYCL-NUM-N
	 *	@param number
	 */
	public void setTarafxaNxtCyclNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaNxtCyclNumN = checkTarafxaNxtCyclNumNMaxLimit(number); 
		serializeTarafxaNxtCyclNumN(tarafxaNxtCyclNumN);
	}

	public void setTarafxaNxtCyclNumN(int number) {
	    number = checkTarafxaNxtCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtCyclNumN((short)number);
	}
	public void setTarafxaNxtCyclNumN(long number) {
	    number = checkTarafxaNxtCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtCyclNumN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaNxtBusPrtnrIdN
	 *	@return tarafxaNxtBusPrtnrIdN
	 */
	public short getTarafxaNxtBusPrtnrIdN() throws CFException {
        if (isTarafxaNxtBusPrtnrIdNModified()) { 
           tarafxaNxtBusPrtnrIdN = refreshTarafxaNxtBusPrtnrIdN();
        }
   		return tarafxaNxtBusPrtnrIdN;
	}
	
	/**
	 * 	Update TarafxaNxtBusPrtnrIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-NXT-BUS-PRTNR-ID-N
	 *	@param number
	 */
	public void setTarafxaNxtBusPrtnrIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaNxtBusPrtnrIdN = checkTarafxaNxtBusPrtnrIdNMaxLimit(number); 
		serializeTarafxaNxtBusPrtnrIdN(tarafxaNxtBusPrtnrIdN);
	}

	public void setTarafxaNxtBusPrtnrIdN(int number) {
	    number = checkTarafxaNxtBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtBusPrtnrIdN((short)number);
	}
	public void setTarafxaNxtBusPrtnrIdN(long number) {
	    number = checkTarafxaNxtBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtBusPrtnrIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaNxtEndptIdN
	 *	@return tarafxaNxtEndptIdN
	 */
	public short getTarafxaNxtEndptIdN() throws CFException {
        if (isTarafxaNxtEndptIdNModified()) { 
           tarafxaNxtEndptIdN = refreshTarafxaNxtEndptIdN();
        }
   		return tarafxaNxtEndptIdN;
	}
	
	/**
	 * 	Update TarafxaNxtEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-NXT-ENDPT-ID-N
	 *	@param number
	 */
	public void setTarafxaNxtEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaNxtEndptIdN = checkTarafxaNxtEndptIdNMaxLimit(number); 
		serializeTarafxaNxtEndptIdN(tarafxaNxtEndptIdN);
	}

	public void setTarafxaNxtEndptIdN(int number) {
	    number = checkTarafxaNxtEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtEndptIdN((short)number);
	}
	public void setTarafxaNxtEndptIdN(long number) {
	    number = checkTarafxaNxtEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtEndptIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaNxtAvailTsN
	 *	@return tarafxaNxtAvailTsN
	 */
	public short getTarafxaNxtAvailTsN() throws CFException {
        if (isTarafxaNxtAvailTsNModified()) { 
           tarafxaNxtAvailTsN = refreshTarafxaNxtAvailTsN();
        }
   		return tarafxaNxtAvailTsN;
	}
	
	/**
	 * 	Update TarafxaNxtAvailTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-NXT-AVAIL-TS-N
	 *	@param number
	 */
	public void setTarafxaNxtAvailTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaNxtAvailTsN = checkTarafxaNxtAvailTsNMaxLimit(number); 
		serializeTarafxaNxtAvailTsN(tarafxaNxtAvailTsN);
	}

	public void setTarafxaNxtAvailTsN(int number) {
	    number = checkTarafxaNxtAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtAvailTsN((short)number);
	}
	public void setTarafxaNxtAvailTsN(long number) {
	    number = checkTarafxaNxtAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaNxtAvailTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaApplExitJobNamN
	 *	@return tarafxaApplExitJobNamN
	 */
	public short getTarafxaApplExitJobNamN() throws CFException {
        if (isTarafxaApplExitJobNamNModified()) { 
           tarafxaApplExitJobNamN = refreshTarafxaApplExitJobNamN();
        }
   		return tarafxaApplExitJobNamN;
	}
	
	/**
	 * 	Update TarafxaApplExitJobNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-APPL-EXIT-JOB-NAM-N
	 *	@param number
	 */
	public void setTarafxaApplExitJobNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaApplExitJobNamN = checkTarafxaApplExitJobNamNMaxLimit(number); 
		serializeTarafxaApplExitJobNamN(tarafxaApplExitJobNamN);
	}

	public void setTarafxaApplExitJobNamN(int number) {
	    number = checkTarafxaApplExitJobNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplExitJobNamN((short)number);
	}
	public void setTarafxaApplExitJobNamN(long number) {
	    number = checkTarafxaApplExitJobNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplExitJobNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaApplExitTsN
	 *	@return tarafxaApplExitTsN
	 */
	public short getTarafxaApplExitTsN() throws CFException {
        if (isTarafxaApplExitTsNModified()) { 
           tarafxaApplExitTsN = refreshTarafxaApplExitTsN();
        }
   		return tarafxaApplExitTsN;
	}
	
	/**
	 * 	Update TarafxaApplExitTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-APPL-EXIT-TS-N
	 *	@param number
	 */
	public void setTarafxaApplExitTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaApplExitTsN = checkTarafxaApplExitTsNMaxLimit(number); 
		serializeTarafxaApplExitTsN(tarafxaApplExitTsN);
	}

	public void setTarafxaApplExitTsN(int number) {
	    number = checkTarafxaApplExitTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplExitTsN((short)number);
	}
	public void setTarafxaApplExitTsN(long number) {
	    number = checkTarafxaApplExitTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplExitTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaCsMipIdN
	 *	@return tarafxaCsMipIdN
	 */
	public short getTarafxaCsMipIdN() throws CFException {
        if (isTarafxaCsMipIdNModified()) { 
           tarafxaCsMipIdN = refreshTarafxaCsMipIdN();
        }
   		return tarafxaCsMipIdN;
	}
	
	/**
	 * 	Update TarafxaCsMipIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-CS-MIP-ID-N
	 *	@param number
	 */
	public void setTarafxaCsMipIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaCsMipIdN = checkTarafxaCsMipIdNMaxLimit(number); 
		serializeTarafxaCsMipIdN(tarafxaCsMipIdN);
	}

	public void setTarafxaCsMipIdN(int number) {
	    number = checkTarafxaCsMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaCsMipIdN((short)number);
	}
	public void setTarafxaCsMipIdN(long number) {
	    number = checkTarafxaCsMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaCsMipIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaRmMipIdN
	 *	@return tarafxaRmMipIdN
	 */
	public short getTarafxaRmMipIdN() throws CFException {
        if (isTarafxaRmMipIdNModified()) { 
           tarafxaRmMipIdN = refreshTarafxaRmMipIdN();
        }
   		return tarafxaRmMipIdN;
	}
	
	/**
	 * 	Update TarafxaRmMipIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-RM-MIP-ID-N
	 *	@param number
	 */
	public void setTarafxaRmMipIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaRmMipIdN = checkTarafxaRmMipIdNMaxLimit(number); 
		serializeTarafxaRmMipIdN(tarafxaRmMipIdN);
	}

	public void setTarafxaRmMipIdN(int number) {
	    number = checkTarafxaRmMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaRmMipIdN((short)number);
	}
	public void setTarafxaRmMipIdN(long number) {
	    number = checkTarafxaRmMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaRmMipIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaApplExitNamN
	 *	@return tarafxaApplExitNamN
	 */
	public short getTarafxaApplExitNamN() throws CFException {
        if (isTarafxaApplExitNamNModified()) { 
           tarafxaApplExitNamN = refreshTarafxaApplExitNamN();
        }
   		return tarafxaApplExitNamN;
	}
	
	/**
	 * 	Update TarafxaApplExitNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-APPL-EXIT-NAM-N
	 *	@param number
	 */
	public void setTarafxaApplExitNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaApplExitNamN = checkTarafxaApplExitNamNMaxLimit(number); 
		serializeTarafxaApplExitNamN(tarafxaApplExitNamN);
	}

	public void setTarafxaApplExitNamN(int number) {
	    number = checkTarafxaApplExitNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplExitNamN((short)number);
	}
	public void setTarafxaApplExitNamN(long number) {
	    number = checkTarafxaApplExitNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplExitNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTapeCmpltdSwN
	 *	@return tarafxaTapeCmpltdSwN
	 */
	public short getTarafxaTapeCmpltdSwN() throws CFException {
        if (isTarafxaTapeCmpltdSwNModified()) { 
           tarafxaTapeCmpltdSwN = refreshTarafxaTapeCmpltdSwN();
        }
   		return tarafxaTapeCmpltdSwN;
	}
	
	/**
	 * 	Update TarafxaTapeCmpltdSwN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TAPE-CMPLTD-SW-N
	 *	@param number
	 */
	public void setTarafxaTapeCmpltdSwN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTapeCmpltdSwN = checkTarafxaTapeCmpltdSwNMaxLimit(number); 
		serializeTarafxaTapeCmpltdSwN(tarafxaTapeCmpltdSwN);
	}

	public void setTarafxaTapeCmpltdSwN(int number) {
	    number = checkTarafxaTapeCmpltdSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTapeCmpltdSwN((short)number);
	}
	public void setTarafxaTapeCmpltdSwN(long number) {
	    number = checkTarafxaTapeCmpltdSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTapeCmpltdSwN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTapeMultVolSwN
	 *	@return tarafxaTapeMultVolSwN
	 */
	public short getTarafxaTapeMultVolSwN() throws CFException {
        if (isTarafxaTapeMultVolSwNModified()) { 
           tarafxaTapeMultVolSwN = refreshTarafxaTapeMultVolSwN();
        }
   		return tarafxaTapeMultVolSwN;
	}
	
	/**
	 * 	Update TarafxaTapeMultVolSwN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TAPE-MULT-VOL-SW-N
	 *	@param number
	 */
	public void setTarafxaTapeMultVolSwN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTapeMultVolSwN = checkTarafxaTapeMultVolSwNMaxLimit(number); 
		serializeTarafxaTapeMultVolSwN(tarafxaTapeMultVolSwN);
	}

	public void setTarafxaTapeMultVolSwN(int number) {
	    number = checkTarafxaTapeMultVolSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTapeMultVolSwN((short)number);
	}
	public void setTarafxaTapeMultVolSwN(long number) {
	    number = checkTarafxaTapeMultVolSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTapeMultVolSwN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaApplPrcssngDtN
	 *	@return tarafxaApplPrcssngDtN
	 */
	public short getTarafxaApplPrcssngDtN() throws CFException {
        if (isTarafxaApplPrcssngDtNModified()) { 
           tarafxaApplPrcssngDtN = refreshTarafxaApplPrcssngDtN();
        }
   		return tarafxaApplPrcssngDtN;
	}
	
	/**
	 * 	Update TarafxaApplPrcssngDtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-APPL-PRCSSNG-DT-N
	 *	@param number
	 */
	public void setTarafxaApplPrcssngDtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaApplPrcssngDtN = checkTarafxaApplPrcssngDtNMaxLimit(number); 
		serializeTarafxaApplPrcssngDtN(tarafxaApplPrcssngDtN);
	}

	public void setTarafxaApplPrcssngDtN(int number) {
	    number = checkTarafxaApplPrcssngDtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplPrcssngDtN((short)number);
	}
	public void setTarafxaApplPrcssngDtN(long number) {
	    number = checkTarafxaApplPrcssngDtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplPrcssngDtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTransitionalDsnN
	 *	@return tarafxaTransitionalDsnN
	 */
	public short getTarafxaTransitionalDsnN() throws CFException {
        if (isTarafxaTransitionalDsnNModified()) { 
           tarafxaTransitionalDsnN = refreshTarafxaTransitionalDsnN();
        }
   		return tarafxaTransitionalDsnN;
	}
	
	/**
	 * 	Update TarafxaTransitionalDsnN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRANSITIONAL-DSN-N
	 *	@param number
	 */
	public void setTarafxaTransitionalDsnN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTransitionalDsnN = checkTarafxaTransitionalDsnNMaxLimit(number); 
		serializeTarafxaTransitionalDsnN(tarafxaTransitionalDsnN);
	}

	public void setTarafxaTransitionalDsnN(int number) {
	    number = checkTarafxaTransitionalDsnNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTransitionalDsnN((short)number);
	}
	public void setTarafxaTransitionalDsnN(long number) {
	    number = checkTarafxaTransitionalDsnNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTransitionalDsnN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSourceHubIdN
	 *	@return tarafxaSourceHubIdN
	 */
	public short getTarafxaSourceHubIdN() throws CFException {
        if (isTarafxaSourceHubIdNModified()) { 
           tarafxaSourceHubIdN = refreshTarafxaSourceHubIdN();
        }
   		return tarafxaSourceHubIdN;
	}
	
	/**
	 * 	Update TarafxaSourceHubIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SOURCE-HUB-ID-N
	 *	@param number
	 */
	public void setTarafxaSourceHubIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSourceHubIdN = checkTarafxaSourceHubIdNMaxLimit(number); 
		serializeTarafxaSourceHubIdN(tarafxaSourceHubIdN);
	}

	public void setTarafxaSourceHubIdN(int number) {
	    number = checkTarafxaSourceHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSourceHubIdN((short)number);
	}
	public void setTarafxaSourceHubIdN(long number) {
	    number = checkTarafxaSourceHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSourceHubIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaOwningHubIdN
	 *	@return tarafxaOwningHubIdN
	 */
	public short getTarafxaOwningHubIdN() throws CFException {
        if (isTarafxaOwningHubIdNModified()) { 
           tarafxaOwningHubIdN = refreshTarafxaOwningHubIdN();
        }
   		return tarafxaOwningHubIdN;
	}
	
	/**
	 * 	Update TarafxaOwningHubIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-OWNING-HUB-ID-N
	 *	@param number
	 */
	public void setTarafxaOwningHubIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaOwningHubIdN = checkTarafxaOwningHubIdNMaxLimit(number); 
		serializeTarafxaOwningHubIdN(tarafxaOwningHubIdN);
	}

	public void setTarafxaOwningHubIdN(int number) {
	    number = checkTarafxaOwningHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaOwningHubIdN((short)number);
	}
	public void setTarafxaOwningHubIdN(long number) {
	    number = checkTarafxaOwningHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaOwningHubIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaStatRefIdN
	 *	@return tarafxaStatRefIdN
	 */
	public short getTarafxaStatRefIdN() throws CFException {
        if (isTarafxaStatRefIdNModified()) { 
           tarafxaStatRefIdN = refreshTarafxaStatRefIdN();
        }
   		return tarafxaStatRefIdN;
	}
	
	/**
	 * 	Update TarafxaStatRefIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-STAT-REF-ID-N
	 *	@param number
	 */
	public void setTarafxaStatRefIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaStatRefIdN = checkTarafxaStatRefIdNMaxLimit(number); 
		serializeTarafxaStatRefIdN(tarafxaStatRefIdN);
	}

	public void setTarafxaStatRefIdN(int number) {
	    number = checkTarafxaStatRefIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaStatRefIdN((short)number);
	}
	public void setTarafxaStatRefIdN(long number) {
	    number = checkTarafxaStatRefIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaStatRefIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSrcLocEntNamN
	 *	@return tarafxaSrcLocEntNamN
	 */
	public short getTarafxaSrcLocEntNamN() throws CFException {
        if (isTarafxaSrcLocEntNamNModified()) { 
           tarafxaSrcLocEntNamN = refreshTarafxaSrcLocEntNamN();
        }
   		return tarafxaSrcLocEntNamN;
	}
	
	/**
	 * 	Update TarafxaSrcLocEntNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SRC-LOC-ENT-NAM-N
	 *	@param number
	 */
	public void setTarafxaSrcLocEntNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSrcLocEntNamN = checkTarafxaSrcLocEntNamNMaxLimit(number); 
		serializeTarafxaSrcLocEntNamN(tarafxaSrcLocEntNamN);
	}

	public void setTarafxaSrcLocEntNamN(int number) {
	    number = checkTarafxaSrcLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcLocEntNamN((short)number);
	}
	public void setTarafxaSrcLocEntNamN(long number) {
	    number = checkTarafxaSrcLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcLocEntNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSrcTaskNamN
	 *	@return tarafxaSrcTaskNamN
	 */
	public short getTarafxaSrcTaskNamN() throws CFException {
        if (isTarafxaSrcTaskNamNModified()) { 
           tarafxaSrcTaskNamN = refreshTarafxaSrcTaskNamN();
        }
   		return tarafxaSrcTaskNamN;
	}
	
	/**
	 * 	Update TarafxaSrcTaskNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SRC-TASK-NAM-N
	 *	@param number
	 */
	public void setTarafxaSrcTaskNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSrcTaskNamN = checkTarafxaSrcTaskNamNMaxLimit(number); 
		serializeTarafxaSrcTaskNamN(tarafxaSrcTaskNamN);
	}

	public void setTarafxaSrcTaskNamN(int number) {
	    number = checkTarafxaSrcTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskNamN((short)number);
	}
	public void setTarafxaSrcTaskNamN(long number) {
	    number = checkTarafxaSrcTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSrcTaskIdN
	 *	@return tarafxaSrcTaskIdN
	 */
	public short getTarafxaSrcTaskIdN() throws CFException {
        if (isTarafxaSrcTaskIdNModified()) { 
           tarafxaSrcTaskIdN = refreshTarafxaSrcTaskIdN();
        }
   		return tarafxaSrcTaskIdN;
	}
	
	/**
	 * 	Update TarafxaSrcTaskIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SRC-TASK-ID-N
	 *	@param number
	 */
	public void setTarafxaSrcTaskIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSrcTaskIdN = checkTarafxaSrcTaskIdNMaxLimit(number); 
		serializeTarafxaSrcTaskIdN(tarafxaSrcTaskIdN);
	}

	public void setTarafxaSrcTaskIdN(int number) {
	    number = checkTarafxaSrcTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskIdN((short)number);
	}
	public void setTarafxaSrcTaskIdN(long number) {
	    number = checkTarafxaSrcTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSrcTaskUsrN
	 *	@return tarafxaSrcTaskUsrN
	 */
	public short getTarafxaSrcTaskUsrN() throws CFException {
        if (isTarafxaSrcTaskUsrNModified()) { 
           tarafxaSrcTaskUsrN = refreshTarafxaSrcTaskUsrN();
        }
   		return tarafxaSrcTaskUsrN;
	}
	
	/**
	 * 	Update TarafxaSrcTaskUsrN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SRC-TASK-USR-N
	 *	@param number
	 */
	public void setTarafxaSrcTaskUsrN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSrcTaskUsrN = checkTarafxaSrcTaskUsrNMaxLimit(number); 
		serializeTarafxaSrcTaskUsrN(tarafxaSrcTaskUsrN);
	}

	public void setTarafxaSrcTaskUsrN(int number) {
	    number = checkTarafxaSrcTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskUsrN((short)number);
	}
	public void setTarafxaSrcTaskUsrN(long number) {
	    number = checkTarafxaSrcTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskUsrN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSrcTaskStrtTsN
	 *	@return tarafxaSrcTaskStrtTsN
	 */
	public short getTarafxaSrcTaskStrtTsN() throws CFException {
        if (isTarafxaSrcTaskStrtTsNModified()) { 
           tarafxaSrcTaskStrtTsN = refreshTarafxaSrcTaskStrtTsN();
        }
   		return tarafxaSrcTaskStrtTsN;
	}
	
	/**
	 * 	Update TarafxaSrcTaskStrtTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SRC-TASK-STRT-TS-N
	 *	@param number
	 */
	public void setTarafxaSrcTaskStrtTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSrcTaskStrtTsN = checkTarafxaSrcTaskStrtTsNMaxLimit(number); 
		serializeTarafxaSrcTaskStrtTsN(tarafxaSrcTaskStrtTsN);
	}

	public void setTarafxaSrcTaskStrtTsN(int number) {
	    number = checkTarafxaSrcTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskStrtTsN((short)number);
	}
	public void setTarafxaSrcTaskStrtTsN(long number) {
	    number = checkTarafxaSrcTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskStrtTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSrcTaskStopTsN
	 *	@return tarafxaSrcTaskStopTsN
	 */
	public short getTarafxaSrcTaskStopTsN() throws CFException {
        if (isTarafxaSrcTaskStopTsNModified()) { 
           tarafxaSrcTaskStopTsN = refreshTarafxaSrcTaskStopTsN();
        }
   		return tarafxaSrcTaskStopTsN;
	}
	
	/**
	 * 	Update TarafxaSrcTaskStopTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SRC-TASK-STOP-TS-N
	 *	@param number
	 */
	public void setTarafxaSrcTaskStopTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSrcTaskStopTsN = checkTarafxaSrcTaskStopTsNMaxLimit(number); 
		serializeTarafxaSrcTaskStopTsN(tarafxaSrcTaskStopTsN);
	}

	public void setTarafxaSrcTaskStopTsN(int number) {
	    number = checkTarafxaSrcTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskStopTsN((short)number);
	}
	public void setTarafxaSrcTaskStopTsN(long number) {
	    number = checkTarafxaSrcTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskStopTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgtLocEntNamN
	 *	@return tarafxaTrgtLocEntNamN
	 */
	public short getTarafxaTrgtLocEntNamN() throws CFException {
        if (isTarafxaTrgtLocEntNamNModified()) { 
           tarafxaTrgtLocEntNamN = refreshTarafxaTrgtLocEntNamN();
        }
   		return tarafxaTrgtLocEntNamN;
	}
	
	/**
	 * 	Update TarafxaTrgtLocEntNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGT-LOC-ENT-NAM-N
	 *	@param number
	 */
	public void setTarafxaTrgtLocEntNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgtLocEntNamN = checkTarafxaTrgtLocEntNamNMaxLimit(number); 
		serializeTarafxaTrgtLocEntNamN(tarafxaTrgtLocEntNamN);
	}

	public void setTarafxaTrgtLocEntNamN(int number) {
	    number = checkTarafxaTrgtLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtLocEntNamN((short)number);
	}
	public void setTarafxaTrgtLocEntNamN(long number) {
	    number = checkTarafxaTrgtLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtLocEntNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgtTaskNamN
	 *	@return tarafxaTrgtTaskNamN
	 */
	public short getTarafxaTrgtTaskNamN() throws CFException {
        if (isTarafxaTrgtTaskNamNModified()) { 
           tarafxaTrgtTaskNamN = refreshTarafxaTrgtTaskNamN();
        }
   		return tarafxaTrgtTaskNamN;
	}
	
	/**
	 * 	Update TarafxaTrgtTaskNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-NAM-N
	 *	@param number
	 */
	public void setTarafxaTrgtTaskNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgtTaskNamN = checkTarafxaTrgtTaskNamNMaxLimit(number); 
		serializeTarafxaTrgtTaskNamN(tarafxaTrgtTaskNamN);
	}

	public void setTarafxaTrgtTaskNamN(int number) {
	    number = checkTarafxaTrgtTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskNamN((short)number);
	}
	public void setTarafxaTrgtTaskNamN(long number) {
	    number = checkTarafxaTrgtTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgtTaskIdN
	 *	@return tarafxaTrgtTaskIdN
	 */
	public short getTarafxaTrgtTaskIdN() throws CFException {
        if (isTarafxaTrgtTaskIdNModified()) { 
           tarafxaTrgtTaskIdN = refreshTarafxaTrgtTaskIdN();
        }
   		return tarafxaTrgtTaskIdN;
	}
	
	/**
	 * 	Update TarafxaTrgtTaskIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-ID-N
	 *	@param number
	 */
	public void setTarafxaTrgtTaskIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgtTaskIdN = checkTarafxaTrgtTaskIdNMaxLimit(number); 
		serializeTarafxaTrgtTaskIdN(tarafxaTrgtTaskIdN);
	}

	public void setTarafxaTrgtTaskIdN(int number) {
	    number = checkTarafxaTrgtTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskIdN((short)number);
	}
	public void setTarafxaTrgtTaskIdN(long number) {
	    number = checkTarafxaTrgtTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgtTaskUsrN
	 *	@return tarafxaTrgtTaskUsrN
	 */
	public short getTarafxaTrgtTaskUsrN() throws CFException {
        if (isTarafxaTrgtTaskUsrNModified()) { 
           tarafxaTrgtTaskUsrN = refreshTarafxaTrgtTaskUsrN();
        }
   		return tarafxaTrgtTaskUsrN;
	}
	
	/**
	 * 	Update TarafxaTrgtTaskUsrN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-USR-N
	 *	@param number
	 */
	public void setTarafxaTrgtTaskUsrN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgtTaskUsrN = checkTarafxaTrgtTaskUsrNMaxLimit(number); 
		serializeTarafxaTrgtTaskUsrN(tarafxaTrgtTaskUsrN);
	}

	public void setTarafxaTrgtTaskUsrN(int number) {
	    number = checkTarafxaTrgtTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskUsrN((short)number);
	}
	public void setTarafxaTrgtTaskUsrN(long number) {
	    number = checkTarafxaTrgtTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskUsrN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgtTaskStrtTsN
	 *	@return tarafxaTrgtTaskStrtTsN
	 */
	public short getTarafxaTrgtTaskStrtTsN() throws CFException {
        if (isTarafxaTrgtTaskStrtTsNModified()) { 
           tarafxaTrgtTaskStrtTsN = refreshTarafxaTrgtTaskStrtTsN();
        }
   		return tarafxaTrgtTaskStrtTsN;
	}
	
	/**
	 * 	Update TarafxaTrgtTaskStrtTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-STRT-TS-N
	 *	@param number
	 */
	public void setTarafxaTrgtTaskStrtTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgtTaskStrtTsN = checkTarafxaTrgtTaskStrtTsNMaxLimit(number); 
		serializeTarafxaTrgtTaskStrtTsN(tarafxaTrgtTaskStrtTsN);
	}

	public void setTarafxaTrgtTaskStrtTsN(int number) {
	    number = checkTarafxaTrgtTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskStrtTsN((short)number);
	}
	public void setTarafxaTrgtTaskStrtTsN(long number) {
	    number = checkTarafxaTrgtTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskStrtTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgtTaskStopTsN
	 *	@return tarafxaTrgtTaskStopTsN
	 */
	public short getTarafxaTrgtTaskStopTsN() throws CFException {
        if (isTarafxaTrgtTaskStopTsNModified()) { 
           tarafxaTrgtTaskStopTsN = refreshTarafxaTrgtTaskStopTsN();
        }
   		return tarafxaTrgtTaskStopTsN;
	}
	
	/**
	 * 	Update TarafxaTrgtTaskStopTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-STOP-TS-N
	 *	@param number
	 */
	public void setTarafxaTrgtTaskStopTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgtTaskStopTsN = checkTarafxaTrgtTaskStopTsNMaxLimit(number); 
		serializeTarafxaTrgtTaskStopTsN(tarafxaTrgtTaskStopTsN);
	}

	public void setTarafxaTrgtTaskStopTsN(int number) {
	    number = checkTarafxaTrgtTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskStopTsN((short)number);
	}
	public void setTarafxaTrgtTaskStopTsN(long number) {
	    number = checkTarafxaTrgtTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskStopTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaApplTknNamN
	 *	@return tarafxaApplTknNamN
	 */
	public short getTarafxaApplTknNamN() throws CFException {
        if (isTarafxaApplTknNamNModified()) { 
           tarafxaApplTknNamN = refreshTarafxaApplTknNamN();
        }
   		return tarafxaApplTknNamN;
	}
	
	/**
	 * 	Update TarafxaApplTknNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-APPL-TKN-NAM-N
	 *	@param number
	 */
	public void setTarafxaApplTknNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaApplTknNamN = checkTarafxaApplTknNamNMaxLimit(number); 
		serializeTarafxaApplTknNamN(tarafxaApplTknNamN);
	}

	public void setTarafxaApplTknNamN(int number) {
	    number = checkTarafxaApplTknNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplTknNamN((short)number);
	}
	public void setTarafxaApplTknNamN(long number) {
	    number = checkTarafxaApplTknNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplTknNamN((short)number);
	}
	


	
	
	

		public static int getItarafxaFieldLength() {
			return ITARAFXA_LENGTH;
		}

}
  
