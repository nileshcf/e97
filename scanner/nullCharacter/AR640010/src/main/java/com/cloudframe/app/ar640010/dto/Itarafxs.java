package com.cloudframe.app.ar640010.dto;

/**
*  The class Itarafxs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Itarafxs extends ItarafxsSerialized {
   

								private short tarafxsArchLocTxtN;

								private short tarafxsLstStatTsN;

								private short tarafxsXferRqstTsN;

								private short tarafxsXferStrtTsN;

								private short tarafxsXferStopTsN;

								private short tarafxsXferRdyTsN;

								private short tarafxsXferCondCdN;

								private short tarafxsXferStatTxtN;

								private short tarafxsXferPrcssIdN;

								private short tarafxsOrgXferPrcsIdN;

								private short tarafxsTrgrCondCdN;

								private short tarafxsTrgrStatTxtN;

								private short tarafxsOrgLocNamN;

								private short tarafxsTrgrActNamN;

								private short tarafxsPrvMnfrmFileNamN;

								private short tarafxsPrvCyclNumN;

								private short tarafxsPrvBusPrtnrIdN;

								private short tarafxsPrvEndptIdN;

								private short tarafxsPrvAvailTsN;

								private short tarafxsNxtMnfrmFileNamN;

								private short tarafxsNxtCyclNumN;

								private short tarafxsNxtBusPrtnrIdN;

								private short tarafxsNxtEndptIdN;

								private short tarafxsNxtAvailTsN;

								private short tarafxsApplExitJobNamN;

								private short tarafxsApplExitTsN;

								private short tarafxsCsMipIdN;

								private short tarafxsRmMipIdN;

								private short tarafxsApplExitNamN;

								private short tarafxsTapeCmpltdSwN;

								private short tarafxsTapeMultVolSwN;

								private short tarafxsApplPrcssngDtN;

								private short tarafxsTransitionalDsnN;

								private short tarafxsSourceHubIdN;

								private short tarafxsOwningHubIdN;

								private short tarafxsStatRefIdN;

								private short tarafxsSrcLocEntNamN;

								private short tarafxsSrcTaskNamN;

								private short tarafxsSrcTaskIdN;

								private short tarafxsSrcTaskUsrN;

								private short tarafxsSrcTaskStrtTsN;

								private short tarafxsSrcTaskStopTsN;

								private short tarafxsTrgtLocEntNamN;

								private short tarafxsTrgtTaskNamN;

								private short tarafxsTrgtTaskIdN;

								private short tarafxsTrgtTaskUsrN;

								private short tarafxsTrgtTaskStrtTsN;

								private short tarafxsTrgtTaskStopTsN;

								private short tarafxsApplTknNamN;
	
	/**
	* Constructor for Itarafxs
	**/
    public Itarafxs() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tarafxsArchLocTxtN
	 *	@return tarafxsArchLocTxtN
	 */
	public short getTarafxsArchLocTxtN() throws CFException {
        if (isTarafxsArchLocTxtNModified()) { 
           tarafxsArchLocTxtN = refreshTarafxsArchLocTxtN();
        }
   		return tarafxsArchLocTxtN;
	}
	
	/**
	 * 	Update TarafxsArchLocTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-ARCH-LOC-TXT-N
	 *	@param number
	 */
	public void setTarafxsArchLocTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsArchLocTxtN = checkTarafxsArchLocTxtNMaxLimit(number); 
		serializeTarafxsArchLocTxtN(tarafxsArchLocTxtN);
	}

	public void setTarafxsArchLocTxtN(int number) {
	    number = checkTarafxsArchLocTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsArchLocTxtN((short)number);
	}
	public void setTarafxsArchLocTxtN(long number) {
	    number = checkTarafxsArchLocTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsArchLocTxtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsLstStatTsN
	 *	@return tarafxsLstStatTsN
	 */
	public short getTarafxsLstStatTsN() throws CFException {
        if (isTarafxsLstStatTsNModified()) { 
           tarafxsLstStatTsN = refreshTarafxsLstStatTsN();
        }
   		return tarafxsLstStatTsN;
	}
	
	/**
	 * 	Update TarafxsLstStatTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-LST-STAT-TS-N
	 *	@param number
	 */
	public void setTarafxsLstStatTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsLstStatTsN = checkTarafxsLstStatTsNMaxLimit(number); 
		serializeTarafxsLstStatTsN(tarafxsLstStatTsN);
	}

	public void setTarafxsLstStatTsN(int number) {
	    number = checkTarafxsLstStatTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsLstStatTsN((short)number);
	}
	public void setTarafxsLstStatTsN(long number) {
	    number = checkTarafxsLstStatTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsLstStatTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsXferRqstTsN
	 *	@return tarafxsXferRqstTsN
	 */
	public short getTarafxsXferRqstTsN() throws CFException {
        if (isTarafxsXferRqstTsNModified()) { 
           tarafxsXferRqstTsN = refreshTarafxsXferRqstTsN();
        }
   		return tarafxsXferRqstTsN;
	}
	
	/**
	 * 	Update TarafxsXferRqstTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-RQST-TS-N
	 *	@param number
	 */
	public void setTarafxsXferRqstTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsXferRqstTsN = checkTarafxsXferRqstTsNMaxLimit(number); 
		serializeTarafxsXferRqstTsN(tarafxsXferRqstTsN);
	}

	public void setTarafxsXferRqstTsN(int number) {
	    number = checkTarafxsXferRqstTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferRqstTsN((short)number);
	}
	public void setTarafxsXferRqstTsN(long number) {
	    number = checkTarafxsXferRqstTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferRqstTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsXferStrtTsN
	 *	@return tarafxsXferStrtTsN
	 */
	public short getTarafxsXferStrtTsN() throws CFException {
        if (isTarafxsXferStrtTsNModified()) { 
           tarafxsXferStrtTsN = refreshTarafxsXferStrtTsN();
        }
   		return tarafxsXferStrtTsN;
	}
	
	/**
	 * 	Update TarafxsXferStrtTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-STRT-TS-N
	 *	@param number
	 */
	public void setTarafxsXferStrtTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsXferStrtTsN = checkTarafxsXferStrtTsNMaxLimit(number); 
		serializeTarafxsXferStrtTsN(tarafxsXferStrtTsN);
	}

	public void setTarafxsXferStrtTsN(int number) {
	    number = checkTarafxsXferStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferStrtTsN((short)number);
	}
	public void setTarafxsXferStrtTsN(long number) {
	    number = checkTarafxsXferStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferStrtTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsXferStopTsN
	 *	@return tarafxsXferStopTsN
	 */
	public short getTarafxsXferStopTsN() throws CFException {
        if (isTarafxsXferStopTsNModified()) { 
           tarafxsXferStopTsN = refreshTarafxsXferStopTsN();
        }
   		return tarafxsXferStopTsN;
	}
	
	/**
	 * 	Update TarafxsXferStopTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-STOP-TS-N
	 *	@param number
	 */
	public void setTarafxsXferStopTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsXferStopTsN = checkTarafxsXferStopTsNMaxLimit(number); 
		serializeTarafxsXferStopTsN(tarafxsXferStopTsN);
	}

	public void setTarafxsXferStopTsN(int number) {
	    number = checkTarafxsXferStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferStopTsN((short)number);
	}
	public void setTarafxsXferStopTsN(long number) {
	    number = checkTarafxsXferStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferStopTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsXferRdyTsN
	 *	@return tarafxsXferRdyTsN
	 */
	public short getTarafxsXferRdyTsN() throws CFException {
        if (isTarafxsXferRdyTsNModified()) { 
           tarafxsXferRdyTsN = refreshTarafxsXferRdyTsN();
        }
   		return tarafxsXferRdyTsN;
	}
	
	/**
	 * 	Update TarafxsXferRdyTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-RDY-TS-N
	 *	@param number
	 */
	public void setTarafxsXferRdyTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsXferRdyTsN = checkTarafxsXferRdyTsNMaxLimit(number); 
		serializeTarafxsXferRdyTsN(tarafxsXferRdyTsN);
	}

	public void setTarafxsXferRdyTsN(int number) {
	    number = checkTarafxsXferRdyTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferRdyTsN((short)number);
	}
	public void setTarafxsXferRdyTsN(long number) {
	    number = checkTarafxsXferRdyTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferRdyTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsXferCondCdN
	 *	@return tarafxsXferCondCdN
	 */
	public short getTarafxsXferCondCdN() throws CFException {
        if (isTarafxsXferCondCdNModified()) { 
           tarafxsXferCondCdN = refreshTarafxsXferCondCdN();
        }
   		return tarafxsXferCondCdN;
	}
	
	/**
	 * 	Update TarafxsXferCondCdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-COND-CD-N
	 *	@param number
	 */
	public void setTarafxsXferCondCdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsXferCondCdN = checkTarafxsXferCondCdNMaxLimit(number); 
		serializeTarafxsXferCondCdN(tarafxsXferCondCdN);
	}

	public void setTarafxsXferCondCdN(int number) {
	    number = checkTarafxsXferCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferCondCdN((short)number);
	}
	public void setTarafxsXferCondCdN(long number) {
	    number = checkTarafxsXferCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferCondCdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsXferStatTxtN
	 *	@return tarafxsXferStatTxtN
	 */
	public short getTarafxsXferStatTxtN() throws CFException {
        if (isTarafxsXferStatTxtNModified()) { 
           tarafxsXferStatTxtN = refreshTarafxsXferStatTxtN();
        }
   		return tarafxsXferStatTxtN;
	}
	
	/**
	 * 	Update TarafxsXferStatTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-STAT-TXT-N
	 *	@param number
	 */
	public void setTarafxsXferStatTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsXferStatTxtN = checkTarafxsXferStatTxtNMaxLimit(number); 
		serializeTarafxsXferStatTxtN(tarafxsXferStatTxtN);
	}

	public void setTarafxsXferStatTxtN(int number) {
	    number = checkTarafxsXferStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferStatTxtN((short)number);
	}
	public void setTarafxsXferStatTxtN(long number) {
	    number = checkTarafxsXferStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferStatTxtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsXferPrcssIdN
	 *	@return tarafxsXferPrcssIdN
	 */
	public short getTarafxsXferPrcssIdN() throws CFException {
        if (isTarafxsXferPrcssIdNModified()) { 
           tarafxsXferPrcssIdN = refreshTarafxsXferPrcssIdN();
        }
   		return tarafxsXferPrcssIdN;
	}
	
	/**
	 * 	Update TarafxsXferPrcssIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-XFER-PRCSS-ID-N
	 *	@param number
	 */
	public void setTarafxsXferPrcssIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsXferPrcssIdN = checkTarafxsXferPrcssIdNMaxLimit(number); 
		serializeTarafxsXferPrcssIdN(tarafxsXferPrcssIdN);
	}

	public void setTarafxsXferPrcssIdN(int number) {
	    number = checkTarafxsXferPrcssIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferPrcssIdN((short)number);
	}
	public void setTarafxsXferPrcssIdN(long number) {
	    number = checkTarafxsXferPrcssIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsXferPrcssIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsOrgXferPrcsIdN
	 *	@return tarafxsOrgXferPrcsIdN
	 */
	public short getTarafxsOrgXferPrcsIdN() throws CFException {
        if (isTarafxsOrgXferPrcsIdNModified()) { 
           tarafxsOrgXferPrcsIdN = refreshTarafxsOrgXferPrcsIdN();
        }
   		return tarafxsOrgXferPrcsIdN;
	}
	
	/**
	 * 	Update TarafxsOrgXferPrcsIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-ORG-XFER-PRCS-ID-N
	 *	@param number
	 */
	public void setTarafxsOrgXferPrcsIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsOrgXferPrcsIdN = checkTarafxsOrgXferPrcsIdNMaxLimit(number); 
		serializeTarafxsOrgXferPrcsIdN(tarafxsOrgXferPrcsIdN);
	}

	public void setTarafxsOrgXferPrcsIdN(int number) {
	    number = checkTarafxsOrgXferPrcsIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsOrgXferPrcsIdN((short)number);
	}
	public void setTarafxsOrgXferPrcsIdN(long number) {
	    number = checkTarafxsOrgXferPrcsIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsOrgXferPrcsIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgrCondCdN
	 *	@return tarafxsTrgrCondCdN
	 */
	public short getTarafxsTrgrCondCdN() throws CFException {
        if (isTarafxsTrgrCondCdNModified()) { 
           tarafxsTrgrCondCdN = refreshTarafxsTrgrCondCdN();
        }
   		return tarafxsTrgrCondCdN;
	}
	
	/**
	 * 	Update TarafxsTrgrCondCdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGR-COND-CD-N
	 *	@param number
	 */
	public void setTarafxsTrgrCondCdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgrCondCdN = checkTarafxsTrgrCondCdNMaxLimit(number); 
		serializeTarafxsTrgrCondCdN(tarafxsTrgrCondCdN);
	}

	public void setTarafxsTrgrCondCdN(int number) {
	    number = checkTarafxsTrgrCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgrCondCdN((short)number);
	}
	public void setTarafxsTrgrCondCdN(long number) {
	    number = checkTarafxsTrgrCondCdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgrCondCdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgrStatTxtN
	 *	@return tarafxsTrgrStatTxtN
	 */
	public short getTarafxsTrgrStatTxtN() throws CFException {
        if (isTarafxsTrgrStatTxtNModified()) { 
           tarafxsTrgrStatTxtN = refreshTarafxsTrgrStatTxtN();
        }
   		return tarafxsTrgrStatTxtN;
	}
	
	/**
	 * 	Update TarafxsTrgrStatTxtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGR-STAT-TXT-N
	 *	@param number
	 */
	public void setTarafxsTrgrStatTxtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgrStatTxtN = checkTarafxsTrgrStatTxtNMaxLimit(number); 
		serializeTarafxsTrgrStatTxtN(tarafxsTrgrStatTxtN);
	}

	public void setTarafxsTrgrStatTxtN(int number) {
	    number = checkTarafxsTrgrStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgrStatTxtN((short)number);
	}
	public void setTarafxsTrgrStatTxtN(long number) {
	    number = checkTarafxsTrgrStatTxtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgrStatTxtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsOrgLocNamN
	 *	@return tarafxsOrgLocNamN
	 */
	public short getTarafxsOrgLocNamN() throws CFException {
        if (isTarafxsOrgLocNamNModified()) { 
           tarafxsOrgLocNamN = refreshTarafxsOrgLocNamN();
        }
   		return tarafxsOrgLocNamN;
	}
	
	/**
	 * 	Update TarafxsOrgLocNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-ORG-LOC-NAM-N
	 *	@param number
	 */
	public void setTarafxsOrgLocNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsOrgLocNamN = checkTarafxsOrgLocNamNMaxLimit(number); 
		serializeTarafxsOrgLocNamN(tarafxsOrgLocNamN);
	}

	public void setTarafxsOrgLocNamN(int number) {
	    number = checkTarafxsOrgLocNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsOrgLocNamN((short)number);
	}
	public void setTarafxsOrgLocNamN(long number) {
	    number = checkTarafxsOrgLocNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsOrgLocNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgrActNamN
	 *	@return tarafxsTrgrActNamN
	 */
	public short getTarafxsTrgrActNamN() throws CFException {
        if (isTarafxsTrgrActNamNModified()) { 
           tarafxsTrgrActNamN = refreshTarafxsTrgrActNamN();
        }
   		return tarafxsTrgrActNamN;
	}
	
	/**
	 * 	Update TarafxsTrgrActNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGR-ACT-NAM-N
	 *	@param number
	 */
	public void setTarafxsTrgrActNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgrActNamN = checkTarafxsTrgrActNamNMaxLimit(number); 
		serializeTarafxsTrgrActNamN(tarafxsTrgrActNamN);
	}

	public void setTarafxsTrgrActNamN(int number) {
	    number = checkTarafxsTrgrActNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgrActNamN((short)number);
	}
	public void setTarafxsTrgrActNamN(long number) {
	    number = checkTarafxsTrgrActNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgrActNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsPrvMnfrmFileNamN
	 *	@return tarafxsPrvMnfrmFileNamN
	 */
	public short getTarafxsPrvMnfrmFileNamN() throws CFException {
        if (isTarafxsPrvMnfrmFileNamNModified()) { 
           tarafxsPrvMnfrmFileNamN = refreshTarafxsPrvMnfrmFileNamN();
        }
   		return tarafxsPrvMnfrmFileNamN;
	}
	
	/**
	 * 	Update TarafxsPrvMnfrmFileNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-PRV-MNFRM-FILE-NAM-N
	 *	@param number
	 */
	public void setTarafxsPrvMnfrmFileNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsPrvMnfrmFileNamN = checkTarafxsPrvMnfrmFileNamNMaxLimit(number); 
		serializeTarafxsPrvMnfrmFileNamN(tarafxsPrvMnfrmFileNamN);
	}

	public void setTarafxsPrvMnfrmFileNamN(int number) {
	    number = checkTarafxsPrvMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvMnfrmFileNamN((short)number);
	}
	public void setTarafxsPrvMnfrmFileNamN(long number) {
	    number = checkTarafxsPrvMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvMnfrmFileNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsPrvCyclNumN
	 *	@return tarafxsPrvCyclNumN
	 */
	public short getTarafxsPrvCyclNumN() throws CFException {
        if (isTarafxsPrvCyclNumNModified()) { 
           tarafxsPrvCyclNumN = refreshTarafxsPrvCyclNumN();
        }
   		return tarafxsPrvCyclNumN;
	}
	
	/**
	 * 	Update TarafxsPrvCyclNumN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-PRV-CYCL-NUM-N
	 *	@param number
	 */
	public void setTarafxsPrvCyclNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsPrvCyclNumN = checkTarafxsPrvCyclNumNMaxLimit(number); 
		serializeTarafxsPrvCyclNumN(tarafxsPrvCyclNumN);
	}

	public void setTarafxsPrvCyclNumN(int number) {
	    number = checkTarafxsPrvCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvCyclNumN((short)number);
	}
	public void setTarafxsPrvCyclNumN(long number) {
	    number = checkTarafxsPrvCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvCyclNumN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsPrvBusPrtnrIdN
	 *	@return tarafxsPrvBusPrtnrIdN
	 */
	public short getTarafxsPrvBusPrtnrIdN() throws CFException {
        if (isTarafxsPrvBusPrtnrIdNModified()) { 
           tarafxsPrvBusPrtnrIdN = refreshTarafxsPrvBusPrtnrIdN();
        }
   		return tarafxsPrvBusPrtnrIdN;
	}
	
	/**
	 * 	Update TarafxsPrvBusPrtnrIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-PRV-BUS-PRTNR-ID-N
	 *	@param number
	 */
	public void setTarafxsPrvBusPrtnrIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsPrvBusPrtnrIdN = checkTarafxsPrvBusPrtnrIdNMaxLimit(number); 
		serializeTarafxsPrvBusPrtnrIdN(tarafxsPrvBusPrtnrIdN);
	}

	public void setTarafxsPrvBusPrtnrIdN(int number) {
	    number = checkTarafxsPrvBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvBusPrtnrIdN((short)number);
	}
	public void setTarafxsPrvBusPrtnrIdN(long number) {
	    number = checkTarafxsPrvBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvBusPrtnrIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsPrvEndptIdN
	 *	@return tarafxsPrvEndptIdN
	 */
	public short getTarafxsPrvEndptIdN() throws CFException {
        if (isTarafxsPrvEndptIdNModified()) { 
           tarafxsPrvEndptIdN = refreshTarafxsPrvEndptIdN();
        }
   		return tarafxsPrvEndptIdN;
	}
	
	/**
	 * 	Update TarafxsPrvEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-PRV-ENDPT-ID-N
	 *	@param number
	 */
	public void setTarafxsPrvEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsPrvEndptIdN = checkTarafxsPrvEndptIdNMaxLimit(number); 
		serializeTarafxsPrvEndptIdN(tarafxsPrvEndptIdN);
	}

	public void setTarafxsPrvEndptIdN(int number) {
	    number = checkTarafxsPrvEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvEndptIdN((short)number);
	}
	public void setTarafxsPrvEndptIdN(long number) {
	    number = checkTarafxsPrvEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvEndptIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsPrvAvailTsN
	 *	@return tarafxsPrvAvailTsN
	 */
	public short getTarafxsPrvAvailTsN() throws CFException {
        if (isTarafxsPrvAvailTsNModified()) { 
           tarafxsPrvAvailTsN = refreshTarafxsPrvAvailTsN();
        }
   		return tarafxsPrvAvailTsN;
	}
	
	/**
	 * 	Update TarafxsPrvAvailTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-PRV-AVAIL-TS-N
	 *	@param number
	 */
	public void setTarafxsPrvAvailTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsPrvAvailTsN = checkTarafxsPrvAvailTsNMaxLimit(number); 
		serializeTarafxsPrvAvailTsN(tarafxsPrvAvailTsN);
	}

	public void setTarafxsPrvAvailTsN(int number) {
	    number = checkTarafxsPrvAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvAvailTsN((short)number);
	}
	public void setTarafxsPrvAvailTsN(long number) {
	    number = checkTarafxsPrvAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsPrvAvailTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsNxtMnfrmFileNamN
	 *	@return tarafxsNxtMnfrmFileNamN
	 */
	public short getTarafxsNxtMnfrmFileNamN() throws CFException {
        if (isTarafxsNxtMnfrmFileNamNModified()) { 
           tarafxsNxtMnfrmFileNamN = refreshTarafxsNxtMnfrmFileNamN();
        }
   		return tarafxsNxtMnfrmFileNamN;
	}
	
	/**
	 * 	Update TarafxsNxtMnfrmFileNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-NXT-MNFRM-FILE-NAM-N
	 *	@param number
	 */
	public void setTarafxsNxtMnfrmFileNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsNxtMnfrmFileNamN = checkTarafxsNxtMnfrmFileNamNMaxLimit(number); 
		serializeTarafxsNxtMnfrmFileNamN(tarafxsNxtMnfrmFileNamN);
	}

	public void setTarafxsNxtMnfrmFileNamN(int number) {
	    number = checkTarafxsNxtMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtMnfrmFileNamN((short)number);
	}
	public void setTarafxsNxtMnfrmFileNamN(long number) {
	    number = checkTarafxsNxtMnfrmFileNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtMnfrmFileNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsNxtCyclNumN
	 *	@return tarafxsNxtCyclNumN
	 */
	public short getTarafxsNxtCyclNumN() throws CFException {
        if (isTarafxsNxtCyclNumNModified()) { 
           tarafxsNxtCyclNumN = refreshTarafxsNxtCyclNumN();
        }
   		return tarafxsNxtCyclNumN;
	}
	
	/**
	 * 	Update TarafxsNxtCyclNumN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-NXT-CYCL-NUM-N
	 *	@param number
	 */
	public void setTarafxsNxtCyclNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsNxtCyclNumN = checkTarafxsNxtCyclNumNMaxLimit(number); 
		serializeTarafxsNxtCyclNumN(tarafxsNxtCyclNumN);
	}

	public void setTarafxsNxtCyclNumN(int number) {
	    number = checkTarafxsNxtCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtCyclNumN((short)number);
	}
	public void setTarafxsNxtCyclNumN(long number) {
	    number = checkTarafxsNxtCyclNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtCyclNumN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsNxtBusPrtnrIdN
	 *	@return tarafxsNxtBusPrtnrIdN
	 */
	public short getTarafxsNxtBusPrtnrIdN() throws CFException {
        if (isTarafxsNxtBusPrtnrIdNModified()) { 
           tarafxsNxtBusPrtnrIdN = refreshTarafxsNxtBusPrtnrIdN();
        }
   		return tarafxsNxtBusPrtnrIdN;
	}
	
	/**
	 * 	Update TarafxsNxtBusPrtnrIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-NXT-BUS-PRTNR-ID-N
	 *	@param number
	 */
	public void setTarafxsNxtBusPrtnrIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsNxtBusPrtnrIdN = checkTarafxsNxtBusPrtnrIdNMaxLimit(number); 
		serializeTarafxsNxtBusPrtnrIdN(tarafxsNxtBusPrtnrIdN);
	}

	public void setTarafxsNxtBusPrtnrIdN(int number) {
	    number = checkTarafxsNxtBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtBusPrtnrIdN((short)number);
	}
	public void setTarafxsNxtBusPrtnrIdN(long number) {
	    number = checkTarafxsNxtBusPrtnrIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtBusPrtnrIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsNxtEndptIdN
	 *	@return tarafxsNxtEndptIdN
	 */
	public short getTarafxsNxtEndptIdN() throws CFException {
        if (isTarafxsNxtEndptIdNModified()) { 
           tarafxsNxtEndptIdN = refreshTarafxsNxtEndptIdN();
        }
   		return tarafxsNxtEndptIdN;
	}
	
	/**
	 * 	Update TarafxsNxtEndptIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-NXT-ENDPT-ID-N
	 *	@param number
	 */
	public void setTarafxsNxtEndptIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsNxtEndptIdN = checkTarafxsNxtEndptIdNMaxLimit(number); 
		serializeTarafxsNxtEndptIdN(tarafxsNxtEndptIdN);
	}

	public void setTarafxsNxtEndptIdN(int number) {
	    number = checkTarafxsNxtEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtEndptIdN((short)number);
	}
	public void setTarafxsNxtEndptIdN(long number) {
	    number = checkTarafxsNxtEndptIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtEndptIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsNxtAvailTsN
	 *	@return tarafxsNxtAvailTsN
	 */
	public short getTarafxsNxtAvailTsN() throws CFException {
        if (isTarafxsNxtAvailTsNModified()) { 
           tarafxsNxtAvailTsN = refreshTarafxsNxtAvailTsN();
        }
   		return tarafxsNxtAvailTsN;
	}
	
	/**
	 * 	Update TarafxsNxtAvailTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-NXT-AVAIL-TS-N
	 *	@param number
	 */
	public void setTarafxsNxtAvailTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsNxtAvailTsN = checkTarafxsNxtAvailTsNMaxLimit(number); 
		serializeTarafxsNxtAvailTsN(tarafxsNxtAvailTsN);
	}

	public void setTarafxsNxtAvailTsN(int number) {
	    number = checkTarafxsNxtAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtAvailTsN((short)number);
	}
	public void setTarafxsNxtAvailTsN(long number) {
	    number = checkTarafxsNxtAvailTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsNxtAvailTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsApplExitJobNamN
	 *	@return tarafxsApplExitJobNamN
	 */
	public short getTarafxsApplExitJobNamN() throws CFException {
        if (isTarafxsApplExitJobNamNModified()) { 
           tarafxsApplExitJobNamN = refreshTarafxsApplExitJobNamN();
        }
   		return tarafxsApplExitJobNamN;
	}
	
	/**
	 * 	Update TarafxsApplExitJobNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-APPL-EXIT-JOB-NAM-N
	 *	@param number
	 */
	public void setTarafxsApplExitJobNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsApplExitJobNamN = checkTarafxsApplExitJobNamNMaxLimit(number); 
		serializeTarafxsApplExitJobNamN(tarafxsApplExitJobNamN);
	}

	public void setTarafxsApplExitJobNamN(int number) {
	    number = checkTarafxsApplExitJobNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplExitJobNamN((short)number);
	}
	public void setTarafxsApplExitJobNamN(long number) {
	    number = checkTarafxsApplExitJobNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplExitJobNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsApplExitTsN
	 *	@return tarafxsApplExitTsN
	 */
	public short getTarafxsApplExitTsN() throws CFException {
        if (isTarafxsApplExitTsNModified()) { 
           tarafxsApplExitTsN = refreshTarafxsApplExitTsN();
        }
   		return tarafxsApplExitTsN;
	}
	
	/**
	 * 	Update TarafxsApplExitTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-APPL-EXIT-TS-N
	 *	@param number
	 */
	public void setTarafxsApplExitTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsApplExitTsN = checkTarafxsApplExitTsNMaxLimit(number); 
		serializeTarafxsApplExitTsN(tarafxsApplExitTsN);
	}

	public void setTarafxsApplExitTsN(int number) {
	    number = checkTarafxsApplExitTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplExitTsN((short)number);
	}
	public void setTarafxsApplExitTsN(long number) {
	    number = checkTarafxsApplExitTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplExitTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsCsMipIdN
	 *	@return tarafxsCsMipIdN
	 */
	public short getTarafxsCsMipIdN() throws CFException {
        if (isTarafxsCsMipIdNModified()) { 
           tarafxsCsMipIdN = refreshTarafxsCsMipIdN();
        }
   		return tarafxsCsMipIdN;
	}
	
	/**
	 * 	Update TarafxsCsMipIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-CS-MIP-ID-N
	 *	@param number
	 */
	public void setTarafxsCsMipIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsCsMipIdN = checkTarafxsCsMipIdNMaxLimit(number); 
		serializeTarafxsCsMipIdN(tarafxsCsMipIdN);
	}

	public void setTarafxsCsMipIdN(int number) {
	    number = checkTarafxsCsMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsCsMipIdN((short)number);
	}
	public void setTarafxsCsMipIdN(long number) {
	    number = checkTarafxsCsMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsCsMipIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsRmMipIdN
	 *	@return tarafxsRmMipIdN
	 */
	public short getTarafxsRmMipIdN() throws CFException {
        if (isTarafxsRmMipIdNModified()) { 
           tarafxsRmMipIdN = refreshTarafxsRmMipIdN();
        }
   		return tarafxsRmMipIdN;
	}
	
	/**
	 * 	Update TarafxsRmMipIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-RM-MIP-ID-N
	 *	@param number
	 */
	public void setTarafxsRmMipIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsRmMipIdN = checkTarafxsRmMipIdNMaxLimit(number); 
		serializeTarafxsRmMipIdN(tarafxsRmMipIdN);
	}

	public void setTarafxsRmMipIdN(int number) {
	    number = checkTarafxsRmMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsRmMipIdN((short)number);
	}
	public void setTarafxsRmMipIdN(long number) {
	    number = checkTarafxsRmMipIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsRmMipIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsApplExitNamN
	 *	@return tarafxsApplExitNamN
	 */
	public short getTarafxsApplExitNamN() throws CFException {
        if (isTarafxsApplExitNamNModified()) { 
           tarafxsApplExitNamN = refreshTarafxsApplExitNamN();
        }
   		return tarafxsApplExitNamN;
	}
	
	/**
	 * 	Update TarafxsApplExitNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-APPL-EXIT-NAM-N
	 *	@param number
	 */
	public void setTarafxsApplExitNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsApplExitNamN = checkTarafxsApplExitNamNMaxLimit(number); 
		serializeTarafxsApplExitNamN(tarafxsApplExitNamN);
	}

	public void setTarafxsApplExitNamN(int number) {
	    number = checkTarafxsApplExitNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplExitNamN((short)number);
	}
	public void setTarafxsApplExitNamN(long number) {
	    number = checkTarafxsApplExitNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplExitNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTapeCmpltdSwN
	 *	@return tarafxsTapeCmpltdSwN
	 */
	public short getTarafxsTapeCmpltdSwN() throws CFException {
        if (isTarafxsTapeCmpltdSwNModified()) { 
           tarafxsTapeCmpltdSwN = refreshTarafxsTapeCmpltdSwN();
        }
   		return tarafxsTapeCmpltdSwN;
	}
	
	/**
	 * 	Update TarafxsTapeCmpltdSwN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TAPE-CMPLTD-SW-N
	 *	@param number
	 */
	public void setTarafxsTapeCmpltdSwN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTapeCmpltdSwN = checkTarafxsTapeCmpltdSwNMaxLimit(number); 
		serializeTarafxsTapeCmpltdSwN(tarafxsTapeCmpltdSwN);
	}

	public void setTarafxsTapeCmpltdSwN(int number) {
	    number = checkTarafxsTapeCmpltdSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTapeCmpltdSwN((short)number);
	}
	public void setTarafxsTapeCmpltdSwN(long number) {
	    number = checkTarafxsTapeCmpltdSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTapeCmpltdSwN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTapeMultVolSwN
	 *	@return tarafxsTapeMultVolSwN
	 */
	public short getTarafxsTapeMultVolSwN() throws CFException {
        if (isTarafxsTapeMultVolSwNModified()) { 
           tarafxsTapeMultVolSwN = refreshTarafxsTapeMultVolSwN();
        }
   		return tarafxsTapeMultVolSwN;
	}
	
	/**
	 * 	Update TarafxsTapeMultVolSwN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TAPE-MULT-VOL-SW-N
	 *	@param number
	 */
	public void setTarafxsTapeMultVolSwN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTapeMultVolSwN = checkTarafxsTapeMultVolSwNMaxLimit(number); 
		serializeTarafxsTapeMultVolSwN(tarafxsTapeMultVolSwN);
	}

	public void setTarafxsTapeMultVolSwN(int number) {
	    number = checkTarafxsTapeMultVolSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTapeMultVolSwN((short)number);
	}
	public void setTarafxsTapeMultVolSwN(long number) {
	    number = checkTarafxsTapeMultVolSwNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTapeMultVolSwN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsApplPrcssngDtN
	 *	@return tarafxsApplPrcssngDtN
	 */
	public short getTarafxsApplPrcssngDtN() throws CFException {
        if (isTarafxsApplPrcssngDtNModified()) { 
           tarafxsApplPrcssngDtN = refreshTarafxsApplPrcssngDtN();
        }
   		return tarafxsApplPrcssngDtN;
	}
	
	/**
	 * 	Update TarafxsApplPrcssngDtN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-APPL-PRCSSNG-DT-N
	 *	@param number
	 */
	public void setTarafxsApplPrcssngDtN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsApplPrcssngDtN = checkTarafxsApplPrcssngDtNMaxLimit(number); 
		serializeTarafxsApplPrcssngDtN(tarafxsApplPrcssngDtN);
	}

	public void setTarafxsApplPrcssngDtN(int number) {
	    number = checkTarafxsApplPrcssngDtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplPrcssngDtN((short)number);
	}
	public void setTarafxsApplPrcssngDtN(long number) {
	    number = checkTarafxsApplPrcssngDtNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplPrcssngDtN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTransitionalDsnN
	 *	@return tarafxsTransitionalDsnN
	 */
	public short getTarafxsTransitionalDsnN() throws CFException {
        if (isTarafxsTransitionalDsnNModified()) { 
           tarafxsTransitionalDsnN = refreshTarafxsTransitionalDsnN();
        }
   		return tarafxsTransitionalDsnN;
	}
	
	/**
	 * 	Update TarafxsTransitionalDsnN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRANSITIONAL-DSN-N
	 *	@param number
	 */
	public void setTarafxsTransitionalDsnN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTransitionalDsnN = checkTarafxsTransitionalDsnNMaxLimit(number); 
		serializeTarafxsTransitionalDsnN(tarafxsTransitionalDsnN);
	}

	public void setTarafxsTransitionalDsnN(int number) {
	    number = checkTarafxsTransitionalDsnNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTransitionalDsnN((short)number);
	}
	public void setTarafxsTransitionalDsnN(long number) {
	    number = checkTarafxsTransitionalDsnNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTransitionalDsnN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSourceHubIdN
	 *	@return tarafxsSourceHubIdN
	 */
	public short getTarafxsSourceHubIdN() throws CFException {
        if (isTarafxsSourceHubIdNModified()) { 
           tarafxsSourceHubIdN = refreshTarafxsSourceHubIdN();
        }
   		return tarafxsSourceHubIdN;
	}
	
	/**
	 * 	Update TarafxsSourceHubIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SOURCE-HUB-ID-N
	 *	@param number
	 */
	public void setTarafxsSourceHubIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSourceHubIdN = checkTarafxsSourceHubIdNMaxLimit(number); 
		serializeTarafxsSourceHubIdN(tarafxsSourceHubIdN);
	}

	public void setTarafxsSourceHubIdN(int number) {
	    number = checkTarafxsSourceHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSourceHubIdN((short)number);
	}
	public void setTarafxsSourceHubIdN(long number) {
	    number = checkTarafxsSourceHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSourceHubIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsOwningHubIdN
	 *	@return tarafxsOwningHubIdN
	 */
	public short getTarafxsOwningHubIdN() throws CFException {
        if (isTarafxsOwningHubIdNModified()) { 
           tarafxsOwningHubIdN = refreshTarafxsOwningHubIdN();
        }
   		return tarafxsOwningHubIdN;
	}
	
	/**
	 * 	Update TarafxsOwningHubIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-OWNING-HUB-ID-N
	 *	@param number
	 */
	public void setTarafxsOwningHubIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsOwningHubIdN = checkTarafxsOwningHubIdNMaxLimit(number); 
		serializeTarafxsOwningHubIdN(tarafxsOwningHubIdN);
	}

	public void setTarafxsOwningHubIdN(int number) {
	    number = checkTarafxsOwningHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsOwningHubIdN((short)number);
	}
	public void setTarafxsOwningHubIdN(long number) {
	    number = checkTarafxsOwningHubIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsOwningHubIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsStatRefIdN
	 *	@return tarafxsStatRefIdN
	 */
	public short getTarafxsStatRefIdN() throws CFException {
        if (isTarafxsStatRefIdNModified()) { 
           tarafxsStatRefIdN = refreshTarafxsStatRefIdN();
        }
   		return tarafxsStatRefIdN;
	}
	
	/**
	 * 	Update TarafxsStatRefIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-STAT-REF-ID-N
	 *	@param number
	 */
	public void setTarafxsStatRefIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsStatRefIdN = checkTarafxsStatRefIdNMaxLimit(number); 
		serializeTarafxsStatRefIdN(tarafxsStatRefIdN);
	}

	public void setTarafxsStatRefIdN(int number) {
	    number = checkTarafxsStatRefIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsStatRefIdN((short)number);
	}
	public void setTarafxsStatRefIdN(long number) {
	    number = checkTarafxsStatRefIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsStatRefIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSrcLocEntNamN
	 *	@return tarafxsSrcLocEntNamN
	 */
	public short getTarafxsSrcLocEntNamN() throws CFException {
        if (isTarafxsSrcLocEntNamNModified()) { 
           tarafxsSrcLocEntNamN = refreshTarafxsSrcLocEntNamN();
        }
   		return tarafxsSrcLocEntNamN;
	}
	
	/**
	 * 	Update TarafxsSrcLocEntNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SRC-LOC-ENT-NAM-N
	 *	@param number
	 */
	public void setTarafxsSrcLocEntNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSrcLocEntNamN = checkTarafxsSrcLocEntNamNMaxLimit(number); 
		serializeTarafxsSrcLocEntNamN(tarafxsSrcLocEntNamN);
	}

	public void setTarafxsSrcLocEntNamN(int number) {
	    number = checkTarafxsSrcLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcLocEntNamN((short)number);
	}
	public void setTarafxsSrcLocEntNamN(long number) {
	    number = checkTarafxsSrcLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcLocEntNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSrcTaskNamN
	 *	@return tarafxsSrcTaskNamN
	 */
	public short getTarafxsSrcTaskNamN() throws CFException {
        if (isTarafxsSrcTaskNamNModified()) { 
           tarafxsSrcTaskNamN = refreshTarafxsSrcTaskNamN();
        }
   		return tarafxsSrcTaskNamN;
	}
	
	/**
	 * 	Update TarafxsSrcTaskNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SRC-TASK-NAM-N
	 *	@param number
	 */
	public void setTarafxsSrcTaskNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSrcTaskNamN = checkTarafxsSrcTaskNamNMaxLimit(number); 
		serializeTarafxsSrcTaskNamN(tarafxsSrcTaskNamN);
	}

	public void setTarafxsSrcTaskNamN(int number) {
	    number = checkTarafxsSrcTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskNamN((short)number);
	}
	public void setTarafxsSrcTaskNamN(long number) {
	    number = checkTarafxsSrcTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSrcTaskIdN
	 *	@return tarafxsSrcTaskIdN
	 */
	public short getTarafxsSrcTaskIdN() throws CFException {
        if (isTarafxsSrcTaskIdNModified()) { 
           tarafxsSrcTaskIdN = refreshTarafxsSrcTaskIdN();
        }
   		return tarafxsSrcTaskIdN;
	}
	
	/**
	 * 	Update TarafxsSrcTaskIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SRC-TASK-ID-N
	 *	@param number
	 */
	public void setTarafxsSrcTaskIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSrcTaskIdN = checkTarafxsSrcTaskIdNMaxLimit(number); 
		serializeTarafxsSrcTaskIdN(tarafxsSrcTaskIdN);
	}

	public void setTarafxsSrcTaskIdN(int number) {
	    number = checkTarafxsSrcTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskIdN((short)number);
	}
	public void setTarafxsSrcTaskIdN(long number) {
	    number = checkTarafxsSrcTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSrcTaskUsrN
	 *	@return tarafxsSrcTaskUsrN
	 */
	public short getTarafxsSrcTaskUsrN() throws CFException {
        if (isTarafxsSrcTaskUsrNModified()) { 
           tarafxsSrcTaskUsrN = refreshTarafxsSrcTaskUsrN();
        }
   		return tarafxsSrcTaskUsrN;
	}
	
	/**
	 * 	Update TarafxsSrcTaskUsrN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SRC-TASK-USR-N
	 *	@param number
	 */
	public void setTarafxsSrcTaskUsrN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSrcTaskUsrN = checkTarafxsSrcTaskUsrNMaxLimit(number); 
		serializeTarafxsSrcTaskUsrN(tarafxsSrcTaskUsrN);
	}

	public void setTarafxsSrcTaskUsrN(int number) {
	    number = checkTarafxsSrcTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskUsrN((short)number);
	}
	public void setTarafxsSrcTaskUsrN(long number) {
	    number = checkTarafxsSrcTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskUsrN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSrcTaskStrtTsN
	 *	@return tarafxsSrcTaskStrtTsN
	 */
	public short getTarafxsSrcTaskStrtTsN() throws CFException {
        if (isTarafxsSrcTaskStrtTsNModified()) { 
           tarafxsSrcTaskStrtTsN = refreshTarafxsSrcTaskStrtTsN();
        }
   		return tarafxsSrcTaskStrtTsN;
	}
	
	/**
	 * 	Update TarafxsSrcTaskStrtTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SRC-TASK-STRT-TS-N
	 *	@param number
	 */
	public void setTarafxsSrcTaskStrtTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSrcTaskStrtTsN = checkTarafxsSrcTaskStrtTsNMaxLimit(number); 
		serializeTarafxsSrcTaskStrtTsN(tarafxsSrcTaskStrtTsN);
	}

	public void setTarafxsSrcTaskStrtTsN(int number) {
	    number = checkTarafxsSrcTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskStrtTsN((short)number);
	}
	public void setTarafxsSrcTaskStrtTsN(long number) {
	    number = checkTarafxsSrcTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskStrtTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSrcTaskStopTsN
	 *	@return tarafxsSrcTaskStopTsN
	 */
	public short getTarafxsSrcTaskStopTsN() throws CFException {
        if (isTarafxsSrcTaskStopTsNModified()) { 
           tarafxsSrcTaskStopTsN = refreshTarafxsSrcTaskStopTsN();
        }
   		return tarafxsSrcTaskStopTsN;
	}
	
	/**
	 * 	Update TarafxsSrcTaskStopTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SRC-TASK-STOP-TS-N
	 *	@param number
	 */
	public void setTarafxsSrcTaskStopTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSrcTaskStopTsN = checkTarafxsSrcTaskStopTsNMaxLimit(number); 
		serializeTarafxsSrcTaskStopTsN(tarafxsSrcTaskStopTsN);
	}

	public void setTarafxsSrcTaskStopTsN(int number) {
	    number = checkTarafxsSrcTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskStopTsN((short)number);
	}
	public void setTarafxsSrcTaskStopTsN(long number) {
	    number = checkTarafxsSrcTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskStopTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgtLocEntNamN
	 *	@return tarafxsTrgtLocEntNamN
	 */
	public short getTarafxsTrgtLocEntNamN() throws CFException {
        if (isTarafxsTrgtLocEntNamNModified()) { 
           tarafxsTrgtLocEntNamN = refreshTarafxsTrgtLocEntNamN();
        }
   		return tarafxsTrgtLocEntNamN;
	}
	
	/**
	 * 	Update TarafxsTrgtLocEntNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGT-LOC-ENT-NAM-N
	 *	@param number
	 */
	public void setTarafxsTrgtLocEntNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgtLocEntNamN = checkTarafxsTrgtLocEntNamNMaxLimit(number); 
		serializeTarafxsTrgtLocEntNamN(tarafxsTrgtLocEntNamN);
	}

	public void setTarafxsTrgtLocEntNamN(int number) {
	    number = checkTarafxsTrgtLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtLocEntNamN((short)number);
	}
	public void setTarafxsTrgtLocEntNamN(long number) {
	    number = checkTarafxsTrgtLocEntNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtLocEntNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgtTaskNamN
	 *	@return tarafxsTrgtTaskNamN
	 */
	public short getTarafxsTrgtTaskNamN() throws CFException {
        if (isTarafxsTrgtTaskNamNModified()) { 
           tarafxsTrgtTaskNamN = refreshTarafxsTrgtTaskNamN();
        }
   		return tarafxsTrgtTaskNamN;
	}
	
	/**
	 * 	Update TarafxsTrgtTaskNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-NAM-N
	 *	@param number
	 */
	public void setTarafxsTrgtTaskNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgtTaskNamN = checkTarafxsTrgtTaskNamNMaxLimit(number); 
		serializeTarafxsTrgtTaskNamN(tarafxsTrgtTaskNamN);
	}

	public void setTarafxsTrgtTaskNamN(int number) {
	    number = checkTarafxsTrgtTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskNamN((short)number);
	}
	public void setTarafxsTrgtTaskNamN(long number) {
	    number = checkTarafxsTrgtTaskNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskNamN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgtTaskIdN
	 *	@return tarafxsTrgtTaskIdN
	 */
	public short getTarafxsTrgtTaskIdN() throws CFException {
        if (isTarafxsTrgtTaskIdNModified()) { 
           tarafxsTrgtTaskIdN = refreshTarafxsTrgtTaskIdN();
        }
   		return tarafxsTrgtTaskIdN;
	}
	
	/**
	 * 	Update TarafxsTrgtTaskIdN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-ID-N
	 *	@param number
	 */
	public void setTarafxsTrgtTaskIdN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgtTaskIdN = checkTarafxsTrgtTaskIdNMaxLimit(number); 
		serializeTarafxsTrgtTaskIdN(tarafxsTrgtTaskIdN);
	}

	public void setTarafxsTrgtTaskIdN(int number) {
	    number = checkTarafxsTrgtTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskIdN((short)number);
	}
	public void setTarafxsTrgtTaskIdN(long number) {
	    number = checkTarafxsTrgtTaskIdNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskIdN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgtTaskUsrN
	 *	@return tarafxsTrgtTaskUsrN
	 */
	public short getTarafxsTrgtTaskUsrN() throws CFException {
        if (isTarafxsTrgtTaskUsrNModified()) { 
           tarafxsTrgtTaskUsrN = refreshTarafxsTrgtTaskUsrN();
        }
   		return tarafxsTrgtTaskUsrN;
	}
	
	/**
	 * 	Update TarafxsTrgtTaskUsrN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-USR-N
	 *	@param number
	 */
	public void setTarafxsTrgtTaskUsrN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgtTaskUsrN = checkTarafxsTrgtTaskUsrNMaxLimit(number); 
		serializeTarafxsTrgtTaskUsrN(tarafxsTrgtTaskUsrN);
	}

	public void setTarafxsTrgtTaskUsrN(int number) {
	    number = checkTarafxsTrgtTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskUsrN((short)number);
	}
	public void setTarafxsTrgtTaskUsrN(long number) {
	    number = checkTarafxsTrgtTaskUsrNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskUsrN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgtTaskStrtTsN
	 *	@return tarafxsTrgtTaskStrtTsN
	 */
	public short getTarafxsTrgtTaskStrtTsN() throws CFException {
        if (isTarafxsTrgtTaskStrtTsNModified()) { 
           tarafxsTrgtTaskStrtTsN = refreshTarafxsTrgtTaskStrtTsN();
        }
   		return tarafxsTrgtTaskStrtTsN;
	}
	
	/**
	 * 	Update TarafxsTrgtTaskStrtTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-STRT-TS-N
	 *	@param number
	 */
	public void setTarafxsTrgtTaskStrtTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgtTaskStrtTsN = checkTarafxsTrgtTaskStrtTsNMaxLimit(number); 
		serializeTarafxsTrgtTaskStrtTsN(tarafxsTrgtTaskStrtTsN);
	}

	public void setTarafxsTrgtTaskStrtTsN(int number) {
	    number = checkTarafxsTrgtTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskStrtTsN((short)number);
	}
	public void setTarafxsTrgtTaskStrtTsN(long number) {
	    number = checkTarafxsTrgtTaskStrtTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskStrtTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgtTaskStopTsN
	 *	@return tarafxsTrgtTaskStopTsN
	 */
	public short getTarafxsTrgtTaskStopTsN() throws CFException {
        if (isTarafxsTrgtTaskStopTsNModified()) { 
           tarafxsTrgtTaskStopTsN = refreshTarafxsTrgtTaskStopTsN();
        }
   		return tarafxsTrgtTaskStopTsN;
	}
	
	/**
	 * 	Update TarafxsTrgtTaskStopTsN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-STOP-TS-N
	 *	@param number
	 */
	public void setTarafxsTrgtTaskStopTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgtTaskStopTsN = checkTarafxsTrgtTaskStopTsNMaxLimit(number); 
		serializeTarafxsTrgtTaskStopTsN(tarafxsTrgtTaskStopTsN);
	}

	public void setTarafxsTrgtTaskStopTsN(int number) {
	    number = checkTarafxsTrgtTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskStopTsN((short)number);
	}
	public void setTarafxsTrgtTaskStopTsN(long number) {
	    number = checkTarafxsTrgtTaskStopTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskStopTsN((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsApplTknNamN
	 *	@return tarafxsApplTknNamN
	 */
	public short getTarafxsApplTknNamN() throws CFException {
        if (isTarafxsApplTknNamNModified()) { 
           tarafxsApplTknNamN = refreshTarafxsApplTknNamN();
        }
   		return tarafxsApplTknNamN;
	}
	
	/**
	 * 	Update TarafxsApplTknNamN with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-APPL-TKN-NAM-N
	 *	@param number
	 */
	public void setTarafxsApplTknNamN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsApplTknNamN = checkTarafxsApplTknNamNMaxLimit(number); 
		serializeTarafxsApplTknNamN(tarafxsApplTknNamN);
	}

	public void setTarafxsApplTknNamN(int number) {
	    number = checkTarafxsApplTknNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplTknNamN((short)number);
	}
	public void setTarafxsApplTknNamN(long number) {
	    number = checkTarafxsApplTknNamNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplTknNamN((short)number);
	}
	


	
	
	

		public static int getItarafxsFieldLength() {
			return ITARAFXS_LENGTH;
		}

}
  
