package com.cloudframe.app.db2funci.dto;

/**
*  The class Db2Indicators is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Db2Indicators extends Db2IndicatorsSerialized {
   

								private short doNotUseDtNull;

								private short sAdpOldNbrNull;

								private short clientNbrNull;

								private short mcgillCdNull;

								private short sicCdNull;

								private short issueDtNull;

								private short cLegacyNull;

								private short redenomDtNull;

								private short oatsNasdaqCdNull;

								private short closeIpoDtNull;

								private short paymentDtNull;

								private short exdividendDtNull;

								private short currencyCdNull;

								private short mProxyDtNull;

								private short rProxyDtNull;

								private short expirationDtNull;

								private short expirationAmtNull;

								private short fIncmDebtCdNull;

								private short callDtNull;

								private short callAmtNull;

								private short dvdndAnnlAmtNull;

								private short dvdndAnnlPctNull;

								private short sAdpRstrNbrNull;

								private short utsCanadianCdNull;

								private short tIndexOptCdNull;

								private short cLegacyCdNull;

								private short maturityDtNull;

								private short couponFirstDtNull;

								private short recordHldEstDtNull;

								private short accrueIntDtNull;

								private short cmrlBondCdNull;

								private short typeGovtCdNull;

								private short stateCdNull;

								private short govtBackCdNull;

								private short typePaperCdNull;

								private short payInterestDtNull;

								private short evltnBondCdNull;

								private short callTypeCdNull;

								private short typeMuniCdNull;

								private short typePutCdNull;

								private short fFrqncCdNull;

								private short rPartialCdNull;

								private short sBondCdNull;

								private short dIssuePctNull;

								private short vCurrentAmtNull;

								private short oidDtNull;

								private short cvrsnExptnDtNull;

								private short cusipCntraNbrNull;

								private short astBckdCdNull;

								private short symblTrdsAsCdNull;

								private short symblTrdsWhiNull;

								private short naicsCdNull;

								private short dlvrblFctrPctNull;

								private short yieldBidNull;

								private short mnmmDnmntAmtNull;

								private short clNoticeDaysNull;

								private short taxWitholdRtNull;

								private short taxCreditRtNull;

								private short cvrsnRtNull;

								private short cvrsnPrcAmtNull;

								private short cvrsnExpDtNull;

								private short scrtyAdpNull;

								private short putStrtDtNull;

								private short putEndDtNull;

								private short putNtcMinNull;

								private short putNtcMaxNull;

								private short putTmngCdNull;

								private short callTmngCdNull;

								private short regShoElgblDtNull;

								private short sttlmDtNull;

								private short optionMaturityDtNull;

								private short regShoInelgblNull;

								private short putFreqCdNull;

								private short frstVrblRstDtNull;

								private short rstFreqCdNull;

								private short call2TmngCdNull;

								private short undlSymblTrdsNull;

								private short undPrimeExchNull;

								private short undPrimeSymbolNull;

								private short undCanadaExchNull;

								private short undCanadaSymbolNull;

								private short undlCusipNull;

								private short undlIsinNull;

								private short undlSedolNull;

								private short undlCommonCdNull;

								private short undlCinsNull;

								private short mtrlMdfdDtNull;
	
	/**
	* Constructor for Db2Indicators
	**/
    public Db2Indicators() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDoNotUseDtNull((short)0);
								setSAdpOldNbrNull((short)0);
								setClientNbrNull((short)0);
								setMcgillCdNull((short)0);
								setSicCdNull((short)0);
								setIssueDtNull((short)0);
								setCLegacyNull((short)0);
								setRedenomDtNull((short)0);
								setOatsNasdaqCdNull((short)0);
								setCloseIpoDtNull((short)0);
								setPaymentDtNull((short)0);
								setExdividendDtNull((short)0);
								setCurrencyCdNull((short)0);
								setMProxyDtNull((short)0);
								setRProxyDtNull((short)0);
								setExpirationDtNull((short)0);
								setExpirationAmtNull((short)0);
								setFIncmDebtCdNull((short)0);
								setCallDtNull((short)0);
								setCallAmtNull((short)0);
								setDvdndAnnlAmtNull((short)0);
								setDvdndAnnlPctNull((short)0);
								setSAdpRstrNbrNull((short)0);
								setUtsCanadianCdNull((short)0);
								setTIndexOptCdNull((short)0);
								setCLegacyCdNull((short)0);
								setMaturityDtNull((short)0);
								setCouponFirstDtNull((short)0);
								setRecordHldEstDtNull((short)0);
								setAccrueIntDtNull((short)0);
								setCmrlBondCdNull((short)0);
								setTypeGovtCdNull((short)0);
								setStateCdNull((short)0);
								setGovtBackCdNull((short)0);
								setTypePaperCdNull((short)0);
								setPayInterestDtNull((short)0);
								setEvltnBondCdNull((short)0);
								setCallTypeCdNull((short)0);
								setTypeMuniCdNull((short)0);
								setTypePutCdNull((short)0);
								setFFrqncCdNull((short)0);
								setRPartialCdNull((short)0);
								setSBondCdNull((short)0);
								setDIssuePctNull((short)0);
								setVCurrentAmtNull((short)0);
								setOidDtNull((short)0);
								setCvrsnExptnDtNull((short)0);
								setCusipCntraNbrNull((short)0);
								setAstBckdCdNull((short)0);
								setSymblTrdsAsCdNull((short)0);
								setSymblTrdsWhiNull((short)0);
								setNaicsCdNull((short)0);
								setDlvrblFctrPctNull((short)0);
								setYieldBidNull((short)0);
								setMnmmDnmntAmtNull((short)0);
								setClNoticeDaysNull((short)0);
								setTaxWitholdRtNull((short)0);
								setTaxCreditRtNull((short)0);
								setCvrsnRtNull((short)0);
								setCvrsnPrcAmtNull((short)0);
								setCvrsnExpDtNull((short)0);
								setScrtyAdpNull((short)0);
								setPutStrtDtNull((short)0);
								setPutEndDtNull((short)0);
								setPutNtcMinNull((short)0);
								setPutNtcMaxNull((short)0);
								setPutTmngCdNull((short)0);
								setCallTmngCdNull((short)0);
								setRegShoElgblDtNull((short)0);
								setSttlmDtNull((short)0);
								setOptionMaturityDtNull((short)0);
								setRegShoInelgblNull((short)0);
								setPutFreqCdNull((short)0);
								setFrstVrblRstDtNull((short)0);
								setRstFreqCdNull((short)0);
								setCall2TmngCdNull((short)0);
								setUndlSymblTrdsNull((short)0);
								setUndPrimeExchNull((short)0);
								setUndPrimeSymbolNull((short)0);
								setUndCanadaExchNull((short)0);
								setUndCanadaSymbolNull((short)0);
								setUndlCusipNull((short)0);
								setUndlIsinNull((short)0);
								setUndlSedolNull((short)0);
								setUndlCommonCdNull((short)0);
								setUndlCinsNull((short)0);
								setMtrlMdfdDtNull((short)0);
    }


 

	/**
	 *	Returns the value of doNotUseDtNull
	 *	@return doNotUseDtNull
	 */
	public short getDoNotUseDtNull() throws CFException {
        if (isDoNotUseDtNullModified()) { 
           doNotUseDtNull = refreshDoNotUseDtNull();
        }
   		return doNotUseDtNull;
	}
	
	/**
	 * 	Update DoNotUseDtNull with the passed value
	 *  Corresponding COBOL Variable is DO-NOT-USE-DT-NULL
	 *	@param number
	 */
	public void setDoNotUseDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    doNotUseDtNull = checkDoNotUseDtNullMaxLimit(number); 
		serializeDoNotUseDtNull(doNotUseDtNull);
	}

	public void setDoNotUseDtNull(int number) {
	    number = checkDoNotUseDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDoNotUseDtNull((short)number);
	}
	public void setDoNotUseDtNull(long number) {
	    number = checkDoNotUseDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDoNotUseDtNull((short)number);
	}
	

	/**
	 *	Returns the value of sAdpOldNbrNull
	 *	@return sAdpOldNbrNull
	 */
	public short getSAdpOldNbrNull() throws CFException {
        if (isSAdpOldNbrNullModified()) { 
           sAdpOldNbrNull = refreshSAdpOldNbrNull();
        }
   		return sAdpOldNbrNull;
	}
	
	/**
	 * 	Update SAdpOldNbrNull with the passed value
	 *  Corresponding COBOL Variable is S-ADP-OLD-NBR-NULL
	 *	@param number
	 */
	public void setSAdpOldNbrNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sAdpOldNbrNull = checkSAdpOldNbrNullMaxLimit(number); 
		serializeSAdpOldNbrNull(sAdpOldNbrNull);
	}

	public void setSAdpOldNbrNull(int number) {
	    number = checkSAdpOldNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSAdpOldNbrNull((short)number);
	}
	public void setSAdpOldNbrNull(long number) {
	    number = checkSAdpOldNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSAdpOldNbrNull((short)number);
	}
	

	/**
	 *	Returns the value of clientNbrNull
	 *	@return clientNbrNull
	 */
	public short getClientNbrNull() throws CFException {
        if (isClientNbrNullModified()) { 
           clientNbrNull = refreshClientNbrNull();
        }
   		return clientNbrNull;
	}
	
	/**
	 * 	Update ClientNbrNull with the passed value
	 *  Corresponding COBOL Variable is CLIENT-NBR-NULL
	 *	@param number
	 */
	public void setClientNbrNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    clientNbrNull = checkClientNbrNullMaxLimit(number); 
		serializeClientNbrNull(clientNbrNull);
	}

	public void setClientNbrNull(int number) {
	    number = checkClientNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setClientNbrNull((short)number);
	}
	public void setClientNbrNull(long number) {
	    number = checkClientNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setClientNbrNull((short)number);
	}
	

	/**
	 *	Returns the value of mcgillCdNull
	 *	@return mcgillCdNull
	 */
	public short getMcgillCdNull() throws CFException {
        if (isMcgillCdNullModified()) { 
           mcgillCdNull = refreshMcgillCdNull();
        }
   		return mcgillCdNull;
	}
	
	/**
	 * 	Update McgillCdNull with the passed value
	 *  Corresponding COBOL Variable is MCGILL-CD-NULL
	 *	@param number
	 */
	public void setMcgillCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mcgillCdNull = checkMcgillCdNullMaxLimit(number); 
		serializeMcgillCdNull(mcgillCdNull);
	}

	public void setMcgillCdNull(int number) {
	    number = checkMcgillCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMcgillCdNull((short)number);
	}
	public void setMcgillCdNull(long number) {
	    number = checkMcgillCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMcgillCdNull((short)number);
	}
	

	/**
	 *	Returns the value of sicCdNull
	 *	@return sicCdNull
	 */
	public short getSicCdNull() throws CFException {
        if (isSicCdNullModified()) { 
           sicCdNull = refreshSicCdNull();
        }
   		return sicCdNull;
	}
	
	/**
	 * 	Update SicCdNull with the passed value
	 *  Corresponding COBOL Variable is SIC-CD-NULL
	 *	@param number
	 */
	public void setSicCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sicCdNull = checkSicCdNullMaxLimit(number); 
		serializeSicCdNull(sicCdNull);
	}

	public void setSicCdNull(int number) {
	    number = checkSicCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSicCdNull((short)number);
	}
	public void setSicCdNull(long number) {
	    number = checkSicCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSicCdNull((short)number);
	}
	

	/**
	 *	Returns the value of issueDtNull
	 *	@return issueDtNull
	 */
	public short getIssueDtNull() throws CFException {
        if (isIssueDtNullModified()) { 
           issueDtNull = refreshIssueDtNull();
        }
   		return issueDtNull;
	}
	
	/**
	 * 	Update IssueDtNull with the passed value
	 *  Corresponding COBOL Variable is ISSUE-DT-NULL
	 *	@param number
	 */
	public void setIssueDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    issueDtNull = checkIssueDtNullMaxLimit(number); 
		serializeIssueDtNull(issueDtNull);
	}

	public void setIssueDtNull(int number) {
	    number = checkIssueDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIssueDtNull((short)number);
	}
	public void setIssueDtNull(long number) {
	    number = checkIssueDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIssueDtNull((short)number);
	}
	

	/**
	 *	Returns the value of cLegacyNull
	 *	@return cLegacyNull
	 */
	public short getCLegacyNull() throws CFException {
        if (isCLegacyNullModified()) { 
           cLegacyNull = refreshCLegacyNull();
        }
   		return cLegacyNull;
	}
	
	/**
	 * 	Update CLegacyNull with the passed value
	 *  Corresponding COBOL Variable is C-LEGACY-NULL
	 *	@param number
	 */
	public void setCLegacyNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cLegacyNull = checkCLegacyNullMaxLimit(number); 
		serializeCLegacyNull(cLegacyNull);
	}

	public void setCLegacyNull(int number) {
	    number = checkCLegacyNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCLegacyNull((short)number);
	}
	public void setCLegacyNull(long number) {
	    number = checkCLegacyNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCLegacyNull((short)number);
	}
	

	/**
	 *	Returns the value of redenomDtNull
	 *	@return redenomDtNull
	 */
	public short getRedenomDtNull() throws CFException {
        if (isRedenomDtNullModified()) { 
           redenomDtNull = refreshRedenomDtNull();
        }
   		return redenomDtNull;
	}
	
	/**
	 * 	Update RedenomDtNull with the passed value
	 *  Corresponding COBOL Variable is REDENOM-DT-NULL
	 *	@param number
	 */
	public void setRedenomDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    redenomDtNull = checkRedenomDtNullMaxLimit(number); 
		serializeRedenomDtNull(redenomDtNull);
	}

	public void setRedenomDtNull(int number) {
	    number = checkRedenomDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRedenomDtNull((short)number);
	}
	public void setRedenomDtNull(long number) {
	    number = checkRedenomDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRedenomDtNull((short)number);
	}
	

	/**
	 *	Returns the value of oatsNasdaqCdNull
	 *	@return oatsNasdaqCdNull
	 */
	public short getOatsNasdaqCdNull() throws CFException {
        if (isOatsNasdaqCdNullModified()) { 
           oatsNasdaqCdNull = refreshOatsNasdaqCdNull();
        }
   		return oatsNasdaqCdNull;
	}
	
	/**
	 * 	Update OatsNasdaqCdNull with the passed value
	 *  Corresponding COBOL Variable is OATS-NASDAQ-CD-NULL
	 *	@param number
	 */
	public void setOatsNasdaqCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    oatsNasdaqCdNull = checkOatsNasdaqCdNullMaxLimit(number); 
		serializeOatsNasdaqCdNull(oatsNasdaqCdNull);
	}

	public void setOatsNasdaqCdNull(int number) {
	    number = checkOatsNasdaqCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOatsNasdaqCdNull((short)number);
	}
	public void setOatsNasdaqCdNull(long number) {
	    number = checkOatsNasdaqCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOatsNasdaqCdNull((short)number);
	}
	

	/**
	 *	Returns the value of closeIpoDtNull
	 *	@return closeIpoDtNull
	 */
	public short getCloseIpoDtNull() throws CFException {
        if (isCloseIpoDtNullModified()) { 
           closeIpoDtNull = refreshCloseIpoDtNull();
        }
   		return closeIpoDtNull;
	}
	
	/**
	 * 	Update CloseIpoDtNull with the passed value
	 *  Corresponding COBOL Variable is CLOSE-IPO-DT-NULL
	 *	@param number
	 */
	public void setCloseIpoDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    closeIpoDtNull = checkCloseIpoDtNullMaxLimit(number); 
		serializeCloseIpoDtNull(closeIpoDtNull);
	}

	public void setCloseIpoDtNull(int number) {
	    number = checkCloseIpoDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCloseIpoDtNull((short)number);
	}
	public void setCloseIpoDtNull(long number) {
	    number = checkCloseIpoDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCloseIpoDtNull((short)number);
	}
	

	/**
	 *	Returns the value of paymentDtNull
	 *	@return paymentDtNull
	 */
	public short getPaymentDtNull() throws CFException {
        if (isPaymentDtNullModified()) { 
           paymentDtNull = refreshPaymentDtNull();
        }
   		return paymentDtNull;
	}
	
	/**
	 * 	Update PaymentDtNull with the passed value
	 *  Corresponding COBOL Variable is PAYMENT-DT-NULL
	 *	@param number
	 */
	public void setPaymentDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    paymentDtNull = checkPaymentDtNullMaxLimit(number); 
		serializePaymentDtNull(paymentDtNull);
	}

	public void setPaymentDtNull(int number) {
	    number = checkPaymentDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPaymentDtNull((short)number);
	}
	public void setPaymentDtNull(long number) {
	    number = checkPaymentDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPaymentDtNull((short)number);
	}
	

	/**
	 *	Returns the value of exdividendDtNull
	 *	@return exdividendDtNull
	 */
	public short getExdividendDtNull() throws CFException {
        if (isExdividendDtNullModified()) { 
           exdividendDtNull = refreshExdividendDtNull();
        }
   		return exdividendDtNull;
	}
	
	/**
	 * 	Update ExdividendDtNull with the passed value
	 *  Corresponding COBOL Variable is EXDIVIDEND-DT-NULL
	 *	@param number
	 */
	public void setExdividendDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    exdividendDtNull = checkExdividendDtNullMaxLimit(number); 
		serializeExdividendDtNull(exdividendDtNull);
	}

	public void setExdividendDtNull(int number) {
	    number = checkExdividendDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExdividendDtNull((short)number);
	}
	public void setExdividendDtNull(long number) {
	    number = checkExdividendDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExdividendDtNull((short)number);
	}
	

	/**
	 *	Returns the value of currencyCdNull
	 *	@return currencyCdNull
	 */
	public short getCurrencyCdNull() throws CFException {
        if (isCurrencyCdNullModified()) { 
           currencyCdNull = refreshCurrencyCdNull();
        }
   		return currencyCdNull;
	}
	
	/**
	 * 	Update CurrencyCdNull with the passed value
	 *  Corresponding COBOL Variable is CURRENCY-CD-NULL
	 *	@param number
	 */
	public void setCurrencyCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    currencyCdNull = checkCurrencyCdNullMaxLimit(number); 
		serializeCurrencyCdNull(currencyCdNull);
	}

	public void setCurrencyCdNull(int number) {
	    number = checkCurrencyCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCurrencyCdNull((short)number);
	}
	public void setCurrencyCdNull(long number) {
	    number = checkCurrencyCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCurrencyCdNull((short)number);
	}
	

	/**
	 *	Returns the value of mProxyDtNull
	 *	@return mProxyDtNull
	 */
	public short getMProxyDtNull() throws CFException {
        if (isMProxyDtNullModified()) { 
           mProxyDtNull = refreshMProxyDtNull();
        }
   		return mProxyDtNull;
	}
	
	/**
	 * 	Update MProxyDtNull with the passed value
	 *  Corresponding COBOL Variable is M-PROXY-DT-NULL
	 *	@param number
	 */
	public void setMProxyDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mProxyDtNull = checkMProxyDtNullMaxLimit(number); 
		serializeMProxyDtNull(mProxyDtNull);
	}

	public void setMProxyDtNull(int number) {
	    number = checkMProxyDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMProxyDtNull((short)number);
	}
	public void setMProxyDtNull(long number) {
	    number = checkMProxyDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMProxyDtNull((short)number);
	}
	

	/**
	 *	Returns the value of rProxyDtNull
	 *	@return rProxyDtNull
	 */
	public short getRProxyDtNull() throws CFException {
        if (isRProxyDtNullModified()) { 
           rProxyDtNull = refreshRProxyDtNull();
        }
   		return rProxyDtNull;
	}
	
	/**
	 * 	Update RProxyDtNull with the passed value
	 *  Corresponding COBOL Variable is R-PROXY-DT-NULL
	 *	@param number
	 */
	public void setRProxyDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rProxyDtNull = checkRProxyDtNullMaxLimit(number); 
		serializeRProxyDtNull(rProxyDtNull);
	}

	public void setRProxyDtNull(int number) {
	    number = checkRProxyDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRProxyDtNull((short)number);
	}
	public void setRProxyDtNull(long number) {
	    number = checkRProxyDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRProxyDtNull((short)number);
	}
	

	/**
	 *	Returns the value of expirationDtNull
	 *	@return expirationDtNull
	 */
	public short getExpirationDtNull() throws CFException {
        if (isExpirationDtNullModified()) { 
           expirationDtNull = refreshExpirationDtNull();
        }
   		return expirationDtNull;
	}
	
	/**
	 * 	Update ExpirationDtNull with the passed value
	 *  Corresponding COBOL Variable is EXPIRATION-DT-NULL
	 *	@param number
	 */
	public void setExpirationDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    expirationDtNull = checkExpirationDtNullMaxLimit(number); 
		serializeExpirationDtNull(expirationDtNull);
	}

	public void setExpirationDtNull(int number) {
	    number = checkExpirationDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExpirationDtNull((short)number);
	}
	public void setExpirationDtNull(long number) {
	    number = checkExpirationDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExpirationDtNull((short)number);
	}
	

	/**
	 *	Returns the value of expirationAmtNull
	 *	@return expirationAmtNull
	 */
	public short getExpirationAmtNull() throws CFException {
        if (isExpirationAmtNullModified()) { 
           expirationAmtNull = refreshExpirationAmtNull();
        }
   		return expirationAmtNull;
	}
	
	/**
	 * 	Update ExpirationAmtNull with the passed value
	 *  Corresponding COBOL Variable is EXPIRATION-AMT-NULL
	 *	@param number
	 */
	public void setExpirationAmtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    expirationAmtNull = checkExpirationAmtNullMaxLimit(number); 
		serializeExpirationAmtNull(expirationAmtNull);
	}

	public void setExpirationAmtNull(int number) {
	    number = checkExpirationAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExpirationAmtNull((short)number);
	}
	public void setExpirationAmtNull(long number) {
	    number = checkExpirationAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setExpirationAmtNull((short)number);
	}
	

	/**
	 *	Returns the value of fIncmDebtCdNull
	 *	@return fIncmDebtCdNull
	 */
	public short getFIncmDebtCdNull() throws CFException {
        if (isFIncmDebtCdNullModified()) { 
           fIncmDebtCdNull = refreshFIncmDebtCdNull();
        }
   		return fIncmDebtCdNull;
	}
	
	/**
	 * 	Update FIncmDebtCdNull with the passed value
	 *  Corresponding COBOL Variable is F-INCM-DEBT-CD-NULL
	 *	@param number
	 */
	public void setFIncmDebtCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    fIncmDebtCdNull = checkFIncmDebtCdNullMaxLimit(number); 
		serializeFIncmDebtCdNull(fIncmDebtCdNull);
	}

	public void setFIncmDebtCdNull(int number) {
	    number = checkFIncmDebtCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFIncmDebtCdNull((short)number);
	}
	public void setFIncmDebtCdNull(long number) {
	    number = checkFIncmDebtCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFIncmDebtCdNull((short)number);
	}
	

	/**
	 *	Returns the value of callDtNull
	 *	@return callDtNull
	 */
	public short getCallDtNull() throws CFException {
        if (isCallDtNullModified()) { 
           callDtNull = refreshCallDtNull();
        }
   		return callDtNull;
	}
	
	/**
	 * 	Update CallDtNull with the passed value
	 *  Corresponding COBOL Variable is CALL-DT-NULL
	 *	@param number
	 */
	public void setCallDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    callDtNull = checkCallDtNullMaxLimit(number); 
		serializeCallDtNull(callDtNull);
	}

	public void setCallDtNull(int number) {
	    number = checkCallDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallDtNull((short)number);
	}
	public void setCallDtNull(long number) {
	    number = checkCallDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallDtNull((short)number);
	}
	

	/**
	 *	Returns the value of callAmtNull
	 *	@return callAmtNull
	 */
	public short getCallAmtNull() throws CFException {
        if (isCallAmtNullModified()) { 
           callAmtNull = refreshCallAmtNull();
        }
   		return callAmtNull;
	}
	
	/**
	 * 	Update CallAmtNull with the passed value
	 *  Corresponding COBOL Variable is CALL-AMT-NULL
	 *	@param number
	 */
	public void setCallAmtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    callAmtNull = checkCallAmtNullMaxLimit(number); 
		serializeCallAmtNull(callAmtNull);
	}

	public void setCallAmtNull(int number) {
	    number = checkCallAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallAmtNull((short)number);
	}
	public void setCallAmtNull(long number) {
	    number = checkCallAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallAmtNull((short)number);
	}
	

	/**
	 *	Returns the value of dvdndAnnlAmtNull
	 *	@return dvdndAnnlAmtNull
	 */
	public short getDvdndAnnlAmtNull() throws CFException {
        if (isDvdndAnnlAmtNullModified()) { 
           dvdndAnnlAmtNull = refreshDvdndAnnlAmtNull();
        }
   		return dvdndAnnlAmtNull;
	}
	
	/**
	 * 	Update DvdndAnnlAmtNull with the passed value
	 *  Corresponding COBOL Variable is DVDND-ANNL-AMT-NULL
	 *	@param number
	 */
	public void setDvdndAnnlAmtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dvdndAnnlAmtNull = checkDvdndAnnlAmtNullMaxLimit(number); 
		serializeDvdndAnnlAmtNull(dvdndAnnlAmtNull);
	}

	public void setDvdndAnnlAmtNull(int number) {
	    number = checkDvdndAnnlAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDvdndAnnlAmtNull((short)number);
	}
	public void setDvdndAnnlAmtNull(long number) {
	    number = checkDvdndAnnlAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDvdndAnnlAmtNull((short)number);
	}
	

	/**
	 *	Returns the value of dvdndAnnlPctNull
	 *	@return dvdndAnnlPctNull
	 */
	public short getDvdndAnnlPctNull() throws CFException {
        if (isDvdndAnnlPctNullModified()) { 
           dvdndAnnlPctNull = refreshDvdndAnnlPctNull();
        }
   		return dvdndAnnlPctNull;
	}
	
	/**
	 * 	Update DvdndAnnlPctNull with the passed value
	 *  Corresponding COBOL Variable is DVDND-ANNL-PCT-NULL
	 *	@param number
	 */
	public void setDvdndAnnlPctNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dvdndAnnlPctNull = checkDvdndAnnlPctNullMaxLimit(number); 
		serializeDvdndAnnlPctNull(dvdndAnnlPctNull);
	}

	public void setDvdndAnnlPctNull(int number) {
	    number = checkDvdndAnnlPctNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDvdndAnnlPctNull((short)number);
	}
	public void setDvdndAnnlPctNull(long number) {
	    number = checkDvdndAnnlPctNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDvdndAnnlPctNull((short)number);
	}
	

	/**
	 *	Returns the value of sAdpRstrNbrNull
	 *	@return sAdpRstrNbrNull
	 */
	public short getSAdpRstrNbrNull() throws CFException {
        if (isSAdpRstrNbrNullModified()) { 
           sAdpRstrNbrNull = refreshSAdpRstrNbrNull();
        }
   		return sAdpRstrNbrNull;
	}
	
	/**
	 * 	Update SAdpRstrNbrNull with the passed value
	 *  Corresponding COBOL Variable is S-ADP-RSTR-NBR-NULL
	 *	@param number
	 */
	public void setSAdpRstrNbrNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sAdpRstrNbrNull = checkSAdpRstrNbrNullMaxLimit(number); 
		serializeSAdpRstrNbrNull(sAdpRstrNbrNull);
	}

	public void setSAdpRstrNbrNull(int number) {
	    number = checkSAdpRstrNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSAdpRstrNbrNull((short)number);
	}
	public void setSAdpRstrNbrNull(long number) {
	    number = checkSAdpRstrNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSAdpRstrNbrNull((short)number);
	}
	

	/**
	 *	Returns the value of utsCanadianCdNull
	 *	@return utsCanadianCdNull
	 */
	public short getUtsCanadianCdNull() throws CFException {
        if (isUtsCanadianCdNullModified()) { 
           utsCanadianCdNull = refreshUtsCanadianCdNull();
        }
   		return utsCanadianCdNull;
	}
	
	/**
	 * 	Update UtsCanadianCdNull with the passed value
	 *  Corresponding COBOL Variable is UTS-CANADIAN-CD-NULL
	 *	@param number
	 */
	public void setUtsCanadianCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    utsCanadianCdNull = checkUtsCanadianCdNullMaxLimit(number); 
		serializeUtsCanadianCdNull(utsCanadianCdNull);
	}

	public void setUtsCanadianCdNull(int number) {
	    number = checkUtsCanadianCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUtsCanadianCdNull((short)number);
	}
	public void setUtsCanadianCdNull(long number) {
	    number = checkUtsCanadianCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUtsCanadianCdNull((short)number);
	}
	

	/**
	 *	Returns the value of tIndexOptCdNull
	 *	@return tIndexOptCdNull
	 */
	public short getTIndexOptCdNull() throws CFException {
        if (isTIndexOptCdNullModified()) { 
           tIndexOptCdNull = refreshTIndexOptCdNull();
        }
   		return tIndexOptCdNull;
	}
	
	/**
	 * 	Update TIndexOptCdNull with the passed value
	 *  Corresponding COBOL Variable is T-INDEX-OPT-CD-NULL
	 *	@param number
	 */
	public void setTIndexOptCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tIndexOptCdNull = checkTIndexOptCdNullMaxLimit(number); 
		serializeTIndexOptCdNull(tIndexOptCdNull);
	}

	public void setTIndexOptCdNull(int number) {
	    number = checkTIndexOptCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTIndexOptCdNull((short)number);
	}
	public void setTIndexOptCdNull(long number) {
	    number = checkTIndexOptCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTIndexOptCdNull((short)number);
	}
	

	/**
	 *	Returns the value of cLegacyCdNull
	 *	@return cLegacyCdNull
	 */
	public short getCLegacyCdNull() throws CFException {
        if (isCLegacyCdNullModified()) { 
           cLegacyCdNull = refreshCLegacyCdNull();
        }
   		return cLegacyCdNull;
	}
	
	/**
	 * 	Update CLegacyCdNull with the passed value
	 *  Corresponding COBOL Variable is C-LEGACY-CD-NULL
	 *	@param number
	 */
	public void setCLegacyCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cLegacyCdNull = checkCLegacyCdNullMaxLimit(number); 
		serializeCLegacyCdNull(cLegacyCdNull);
	}

	public void setCLegacyCdNull(int number) {
	    number = checkCLegacyCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCLegacyCdNull((short)number);
	}
	public void setCLegacyCdNull(long number) {
	    number = checkCLegacyCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCLegacyCdNull((short)number);
	}
	

	/**
	 *	Returns the value of maturityDtNull
	 *	@return maturityDtNull
	 */
	public short getMaturityDtNull() throws CFException {
        if (isMaturityDtNullModified()) { 
           maturityDtNull = refreshMaturityDtNull();
        }
   		return maturityDtNull;
	}
	
	/**
	 * 	Update MaturityDtNull with the passed value
	 *  Corresponding COBOL Variable is MATURITY-DT-NULL
	 *	@param number
	 */
	public void setMaturityDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    maturityDtNull = checkMaturityDtNullMaxLimit(number); 
		serializeMaturityDtNull(maturityDtNull);
	}

	public void setMaturityDtNull(int number) {
	    number = checkMaturityDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaturityDtNull((short)number);
	}
	public void setMaturityDtNull(long number) {
	    number = checkMaturityDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaturityDtNull((short)number);
	}
	

	/**
	 *	Returns the value of couponFirstDtNull
	 *	@return couponFirstDtNull
	 */
	public short getCouponFirstDtNull() throws CFException {
        if (isCouponFirstDtNullModified()) { 
           couponFirstDtNull = refreshCouponFirstDtNull();
        }
   		return couponFirstDtNull;
	}
	
	/**
	 * 	Update CouponFirstDtNull with the passed value
	 *  Corresponding COBOL Variable is COUPON-FIRST-DT-NULL
	 *	@param number
	 */
	public void setCouponFirstDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    couponFirstDtNull = checkCouponFirstDtNullMaxLimit(number); 
		serializeCouponFirstDtNull(couponFirstDtNull);
	}

	public void setCouponFirstDtNull(int number) {
	    number = checkCouponFirstDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCouponFirstDtNull((short)number);
	}
	public void setCouponFirstDtNull(long number) {
	    number = checkCouponFirstDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCouponFirstDtNull((short)number);
	}
	

	/**
	 *	Returns the value of recordHldEstDtNull
	 *	@return recordHldEstDtNull
	 */
	public short getRecordHldEstDtNull() throws CFException {
        if (isRecordHldEstDtNullModified()) { 
           recordHldEstDtNull = refreshRecordHldEstDtNull();
        }
   		return recordHldEstDtNull;
	}
	
	/**
	 * 	Update RecordHldEstDtNull with the passed value
	 *  Corresponding COBOL Variable is RECORD-HLD-EST-DT-NULL
	 *	@param number
	 */
	public void setRecordHldEstDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    recordHldEstDtNull = checkRecordHldEstDtNullMaxLimit(number); 
		serializeRecordHldEstDtNull(recordHldEstDtNull);
	}

	public void setRecordHldEstDtNull(int number) {
	    number = checkRecordHldEstDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecordHldEstDtNull((short)number);
	}
	public void setRecordHldEstDtNull(long number) {
	    number = checkRecordHldEstDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRecordHldEstDtNull((short)number);
	}
	

	/**
	 *	Returns the value of accrueIntDtNull
	 *	@return accrueIntDtNull
	 */
	public short getAccrueIntDtNull() throws CFException {
        if (isAccrueIntDtNullModified()) { 
           accrueIntDtNull = refreshAccrueIntDtNull();
        }
   		return accrueIntDtNull;
	}
	
	/**
	 * 	Update AccrueIntDtNull with the passed value
	 *  Corresponding COBOL Variable is ACCRUE-INT-DT-NULL
	 *	@param number
	 */
	public void setAccrueIntDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    accrueIntDtNull = checkAccrueIntDtNullMaxLimit(number); 
		serializeAccrueIntDtNull(accrueIntDtNull);
	}

	public void setAccrueIntDtNull(int number) {
	    number = checkAccrueIntDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAccrueIntDtNull((short)number);
	}
	public void setAccrueIntDtNull(long number) {
	    number = checkAccrueIntDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAccrueIntDtNull((short)number);
	}
	

	/**
	 *	Returns the value of cmrlBondCdNull
	 *	@return cmrlBondCdNull
	 */
	public short getCmrlBondCdNull() throws CFException {
        if (isCmrlBondCdNullModified()) { 
           cmrlBondCdNull = refreshCmrlBondCdNull();
        }
   		return cmrlBondCdNull;
	}
	
	/**
	 * 	Update CmrlBondCdNull with the passed value
	 *  Corresponding COBOL Variable is CMRL-BOND-CD-NULL
	 *	@param number
	 */
	public void setCmrlBondCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cmrlBondCdNull = checkCmrlBondCdNullMaxLimit(number); 
		serializeCmrlBondCdNull(cmrlBondCdNull);
	}

	public void setCmrlBondCdNull(int number) {
	    number = checkCmrlBondCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmrlBondCdNull((short)number);
	}
	public void setCmrlBondCdNull(long number) {
	    number = checkCmrlBondCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCmrlBondCdNull((short)number);
	}
	

	/**
	 *	Returns the value of typeGovtCdNull
	 *	@return typeGovtCdNull
	 */
	public short getTypeGovtCdNull() throws CFException {
        if (isTypeGovtCdNullModified()) { 
           typeGovtCdNull = refreshTypeGovtCdNull();
        }
   		return typeGovtCdNull;
	}
	
	/**
	 * 	Update TypeGovtCdNull with the passed value
	 *  Corresponding COBOL Variable is TYPE-GOVT-CD-NULL
	 *	@param number
	 */
	public void setTypeGovtCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    typeGovtCdNull = checkTypeGovtCdNullMaxLimit(number); 
		serializeTypeGovtCdNull(typeGovtCdNull);
	}

	public void setTypeGovtCdNull(int number) {
	    number = checkTypeGovtCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypeGovtCdNull((short)number);
	}
	public void setTypeGovtCdNull(long number) {
	    number = checkTypeGovtCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypeGovtCdNull((short)number);
	}
	

	/**
	 *	Returns the value of stateCdNull
	 *	@return stateCdNull
	 */
	public short getStateCdNull() throws CFException {
        if (isStateCdNullModified()) { 
           stateCdNull = refreshStateCdNull();
        }
   		return stateCdNull;
	}
	
	/**
	 * 	Update StateCdNull with the passed value
	 *  Corresponding COBOL Variable is STATE-CD-NULL
	 *	@param number
	 */
	public void setStateCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    stateCdNull = checkStateCdNullMaxLimit(number); 
		serializeStateCdNull(stateCdNull);
	}

	public void setStateCdNull(int number) {
	    number = checkStateCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStateCdNull((short)number);
	}
	public void setStateCdNull(long number) {
	    number = checkStateCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStateCdNull((short)number);
	}
	

	/**
	 *	Returns the value of govtBackCdNull
	 *	@return govtBackCdNull
	 */
	public short getGovtBackCdNull() throws CFException {
        if (isGovtBackCdNullModified()) { 
           govtBackCdNull = refreshGovtBackCdNull();
        }
   		return govtBackCdNull;
	}
	
	/**
	 * 	Update GovtBackCdNull with the passed value
	 *  Corresponding COBOL Variable is GOVT-BACK-CD-NULL
	 *	@param number
	 */
	public void setGovtBackCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    govtBackCdNull = checkGovtBackCdNullMaxLimit(number); 
		serializeGovtBackCdNull(govtBackCdNull);
	}

	public void setGovtBackCdNull(int number) {
	    number = checkGovtBackCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setGovtBackCdNull((short)number);
	}
	public void setGovtBackCdNull(long number) {
	    number = checkGovtBackCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setGovtBackCdNull((short)number);
	}
	

	/**
	 *	Returns the value of typePaperCdNull
	 *	@return typePaperCdNull
	 */
	public short getTypePaperCdNull() throws CFException {
        if (isTypePaperCdNullModified()) { 
           typePaperCdNull = refreshTypePaperCdNull();
        }
   		return typePaperCdNull;
	}
	
	/**
	 * 	Update TypePaperCdNull with the passed value
	 *  Corresponding COBOL Variable is TYPE-PAPER-CD-NULL
	 *	@param number
	 */
	public void setTypePaperCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    typePaperCdNull = checkTypePaperCdNullMaxLimit(number); 
		serializeTypePaperCdNull(typePaperCdNull);
	}

	public void setTypePaperCdNull(int number) {
	    number = checkTypePaperCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypePaperCdNull((short)number);
	}
	public void setTypePaperCdNull(long number) {
	    number = checkTypePaperCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypePaperCdNull((short)number);
	}
	

	/**
	 *	Returns the value of payInterestDtNull
	 *	@return payInterestDtNull
	 */
	public short getPayInterestDtNull() throws CFException {
        if (isPayInterestDtNullModified()) { 
           payInterestDtNull = refreshPayInterestDtNull();
        }
   		return payInterestDtNull;
	}
	
	/**
	 * 	Update PayInterestDtNull with the passed value
	 *  Corresponding COBOL Variable is PAY-INTEREST-DT-NULL
	 *	@param number
	 */
	public void setPayInterestDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    payInterestDtNull = checkPayInterestDtNullMaxLimit(number); 
		serializePayInterestDtNull(payInterestDtNull);
	}

	public void setPayInterestDtNull(int number) {
	    number = checkPayInterestDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPayInterestDtNull((short)number);
	}
	public void setPayInterestDtNull(long number) {
	    number = checkPayInterestDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPayInterestDtNull((short)number);
	}
	

	/**
	 *	Returns the value of evltnBondCdNull
	 *	@return evltnBondCdNull
	 */
	public short getEvltnBondCdNull() throws CFException {
        if (isEvltnBondCdNullModified()) { 
           evltnBondCdNull = refreshEvltnBondCdNull();
        }
   		return evltnBondCdNull;
	}
	
	/**
	 * 	Update EvltnBondCdNull with the passed value
	 *  Corresponding COBOL Variable is EVLTN-BOND-CD-NULL
	 *	@param number
	 */
	public void setEvltnBondCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    evltnBondCdNull = checkEvltnBondCdNullMaxLimit(number); 
		serializeEvltnBondCdNull(evltnBondCdNull);
	}

	public void setEvltnBondCdNull(int number) {
	    number = checkEvltnBondCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEvltnBondCdNull((short)number);
	}
	public void setEvltnBondCdNull(long number) {
	    number = checkEvltnBondCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEvltnBondCdNull((short)number);
	}
	

	/**
	 *	Returns the value of callTypeCdNull
	 *	@return callTypeCdNull
	 */
	public short getCallTypeCdNull() throws CFException {
        if (isCallTypeCdNullModified()) { 
           callTypeCdNull = refreshCallTypeCdNull();
        }
   		return callTypeCdNull;
	}
	
	/**
	 * 	Update CallTypeCdNull with the passed value
	 *  Corresponding COBOL Variable is CALL-TYPE-CD-NULL
	 *	@param number
	 */
	public void setCallTypeCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    callTypeCdNull = checkCallTypeCdNullMaxLimit(number); 
		serializeCallTypeCdNull(callTypeCdNull);
	}

	public void setCallTypeCdNull(int number) {
	    number = checkCallTypeCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallTypeCdNull((short)number);
	}
	public void setCallTypeCdNull(long number) {
	    number = checkCallTypeCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallTypeCdNull((short)number);
	}
	

	/**
	 *	Returns the value of typeMuniCdNull
	 *	@return typeMuniCdNull
	 */
	public short getTypeMuniCdNull() throws CFException {
        if (isTypeMuniCdNullModified()) { 
           typeMuniCdNull = refreshTypeMuniCdNull();
        }
   		return typeMuniCdNull;
	}
	
	/**
	 * 	Update TypeMuniCdNull with the passed value
	 *  Corresponding COBOL Variable is TYPE-MUNI-CD-NULL
	 *	@param number
	 */
	public void setTypeMuniCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    typeMuniCdNull = checkTypeMuniCdNullMaxLimit(number); 
		serializeTypeMuniCdNull(typeMuniCdNull);
	}

	public void setTypeMuniCdNull(int number) {
	    number = checkTypeMuniCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypeMuniCdNull((short)number);
	}
	public void setTypeMuniCdNull(long number) {
	    number = checkTypeMuniCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypeMuniCdNull((short)number);
	}
	

	/**
	 *	Returns the value of typePutCdNull
	 *	@return typePutCdNull
	 */
	public short getTypePutCdNull() throws CFException {
        if (isTypePutCdNullModified()) { 
           typePutCdNull = refreshTypePutCdNull();
        }
   		return typePutCdNull;
	}
	
	/**
	 * 	Update TypePutCdNull with the passed value
	 *  Corresponding COBOL Variable is TYPE-PUT-CD-NULL
	 *	@param number
	 */
	public void setTypePutCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    typePutCdNull = checkTypePutCdNullMaxLimit(number); 
		serializeTypePutCdNull(typePutCdNull);
	}

	public void setTypePutCdNull(int number) {
	    number = checkTypePutCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypePutCdNull((short)number);
	}
	public void setTypePutCdNull(long number) {
	    number = checkTypePutCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTypePutCdNull((short)number);
	}
	

	/**
	 *	Returns the value of fFrqncCdNull
	 *	@return fFrqncCdNull
	 */
	public short getFFrqncCdNull() throws CFException {
        if (isFFrqncCdNullModified()) { 
           fFrqncCdNull = refreshFFrqncCdNull();
        }
   		return fFrqncCdNull;
	}
	
	/**
	 * 	Update FFrqncCdNull with the passed value
	 *  Corresponding COBOL Variable is F-FRQNC-CD-NULL
	 *	@param number
	 */
	public void setFFrqncCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    fFrqncCdNull = checkFFrqncCdNullMaxLimit(number); 
		serializeFFrqncCdNull(fFrqncCdNull);
	}

	public void setFFrqncCdNull(int number) {
	    number = checkFFrqncCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFFrqncCdNull((short)number);
	}
	public void setFFrqncCdNull(long number) {
	    number = checkFFrqncCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFFrqncCdNull((short)number);
	}
	

	/**
	 *	Returns the value of rPartialCdNull
	 *	@return rPartialCdNull
	 */
	public short getRPartialCdNull() throws CFException {
        if (isRPartialCdNullModified()) { 
           rPartialCdNull = refreshRPartialCdNull();
        }
   		return rPartialCdNull;
	}
	
	/**
	 * 	Update RPartialCdNull with the passed value
	 *  Corresponding COBOL Variable is R-PARTIAL-CD-NULL
	 *	@param number
	 */
	public void setRPartialCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rPartialCdNull = checkRPartialCdNullMaxLimit(number); 
		serializeRPartialCdNull(rPartialCdNull);
	}

	public void setRPartialCdNull(int number) {
	    number = checkRPartialCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRPartialCdNull((short)number);
	}
	public void setRPartialCdNull(long number) {
	    number = checkRPartialCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRPartialCdNull((short)number);
	}
	

	/**
	 *	Returns the value of sBondCdNull
	 *	@return sBondCdNull
	 */
	public short getSBondCdNull() throws CFException {
        if (isSBondCdNullModified()) { 
           sBondCdNull = refreshSBondCdNull();
        }
   		return sBondCdNull;
	}
	
	/**
	 * 	Update SBondCdNull with the passed value
	 *  Corresponding COBOL Variable is S-BOND-CD-NULL
	 *	@param number
	 */
	public void setSBondCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sBondCdNull = checkSBondCdNullMaxLimit(number); 
		serializeSBondCdNull(sBondCdNull);
	}

	public void setSBondCdNull(int number) {
	    number = checkSBondCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSBondCdNull((short)number);
	}
	public void setSBondCdNull(long number) {
	    number = checkSBondCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSBondCdNull((short)number);
	}
	

	/**
	 *	Returns the value of dIssuePctNull
	 *	@return dIssuePctNull
	 */
	public short getDIssuePctNull() throws CFException {
        if (isDIssuePctNullModified()) { 
           dIssuePctNull = refreshDIssuePctNull();
        }
   		return dIssuePctNull;
	}
	
	/**
	 * 	Update DIssuePctNull with the passed value
	 *  Corresponding COBOL Variable is D-ISSUE-PCT-NULL
	 *	@param number
	 */
	public void setDIssuePctNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dIssuePctNull = checkDIssuePctNullMaxLimit(number); 
		serializeDIssuePctNull(dIssuePctNull);
	}

	public void setDIssuePctNull(int number) {
	    number = checkDIssuePctNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDIssuePctNull((short)number);
	}
	public void setDIssuePctNull(long number) {
	    number = checkDIssuePctNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDIssuePctNull((short)number);
	}
	

	/**
	 *	Returns the value of vCurrentAmtNull
	 *	@return vCurrentAmtNull
	 */
	public short getVCurrentAmtNull() throws CFException {
        if (isVCurrentAmtNullModified()) { 
           vCurrentAmtNull = refreshVCurrentAmtNull();
        }
   		return vCurrentAmtNull;
	}
	
	/**
	 * 	Update VCurrentAmtNull with the passed value
	 *  Corresponding COBOL Variable is V-CURRENT-AMT-NULL
	 *	@param number
	 */
	public void setVCurrentAmtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    vCurrentAmtNull = checkVCurrentAmtNullMaxLimit(number); 
		serializeVCurrentAmtNull(vCurrentAmtNull);
	}

	public void setVCurrentAmtNull(int number) {
	    number = checkVCurrentAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVCurrentAmtNull((short)number);
	}
	public void setVCurrentAmtNull(long number) {
	    number = checkVCurrentAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVCurrentAmtNull((short)number);
	}
	

	/**
	 *	Returns the value of oidDtNull
	 *	@return oidDtNull
	 */
	public short getOidDtNull() throws CFException {
        if (isOidDtNullModified()) { 
           oidDtNull = refreshOidDtNull();
        }
   		return oidDtNull;
	}
	
	/**
	 * 	Update OidDtNull with the passed value
	 *  Corresponding COBOL Variable is OID-DT-NULL
	 *	@param number
	 */
	public void setOidDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    oidDtNull = checkOidDtNullMaxLimit(number); 
		serializeOidDtNull(oidDtNull);
	}

	public void setOidDtNull(int number) {
	    number = checkOidDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOidDtNull((short)number);
	}
	public void setOidDtNull(long number) {
	    number = checkOidDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOidDtNull((short)number);
	}
	

	/**
	 *	Returns the value of cvrsnExptnDtNull
	 *	@return cvrsnExptnDtNull
	 */
	public short getCvrsnExptnDtNull() throws CFException {
        if (isCvrsnExptnDtNullModified()) { 
           cvrsnExptnDtNull = refreshCvrsnExptnDtNull();
        }
   		return cvrsnExptnDtNull;
	}
	
	/**
	 * 	Update CvrsnExptnDtNull with the passed value
	 *  Corresponding COBOL Variable is CVRSN-EXPTN-DT-NULL
	 *	@param number
	 */
	public void setCvrsnExptnDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cvrsnExptnDtNull = checkCvrsnExptnDtNullMaxLimit(number); 
		serializeCvrsnExptnDtNull(cvrsnExptnDtNull);
	}

	public void setCvrsnExptnDtNull(int number) {
	    number = checkCvrsnExptnDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnExptnDtNull((short)number);
	}
	public void setCvrsnExptnDtNull(long number) {
	    number = checkCvrsnExptnDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnExptnDtNull((short)number);
	}
	

	/**
	 *	Returns the value of cusipCntraNbrNull
	 *	@return cusipCntraNbrNull
	 */
	public short getCusipCntraNbrNull() throws CFException {
        if (isCusipCntraNbrNullModified()) { 
           cusipCntraNbrNull = refreshCusipCntraNbrNull();
        }
   		return cusipCntraNbrNull;
	}
	
	/**
	 * 	Update CusipCntraNbrNull with the passed value
	 *  Corresponding COBOL Variable is CUSIP-CNTRA-NBR-NULL
	 *	@param number
	 */
	public void setCusipCntraNbrNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cusipCntraNbrNull = checkCusipCntraNbrNullMaxLimit(number); 
		serializeCusipCntraNbrNull(cusipCntraNbrNull);
	}

	public void setCusipCntraNbrNull(int number) {
	    number = checkCusipCntraNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCusipCntraNbrNull((short)number);
	}
	public void setCusipCntraNbrNull(long number) {
	    number = checkCusipCntraNbrNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCusipCntraNbrNull((short)number);
	}
	

	/**
	 *	Returns the value of astBckdCdNull
	 *	@return astBckdCdNull
	 */
	public short getAstBckdCdNull() throws CFException {
        if (isAstBckdCdNullModified()) { 
           astBckdCdNull = refreshAstBckdCdNull();
        }
   		return astBckdCdNull;
	}
	
	/**
	 * 	Update AstBckdCdNull with the passed value
	 *  Corresponding COBOL Variable is AST-BCKD-CD-NULL
	 *	@param number
	 */
	public void setAstBckdCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    astBckdCdNull = checkAstBckdCdNullMaxLimit(number); 
		serializeAstBckdCdNull(astBckdCdNull);
	}

	public void setAstBckdCdNull(int number) {
	    number = checkAstBckdCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAstBckdCdNull((short)number);
	}
	public void setAstBckdCdNull(long number) {
	    number = checkAstBckdCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAstBckdCdNull((short)number);
	}
	

	/**
	 *	Returns the value of symblTrdsAsCdNull
	 *	@return symblTrdsAsCdNull
	 */
	public short getSymblTrdsAsCdNull() throws CFException {
        if (isSymblTrdsAsCdNullModified()) { 
           symblTrdsAsCdNull = refreshSymblTrdsAsCdNull();
        }
   		return symblTrdsAsCdNull;
	}
	
	/**
	 * 	Update SymblTrdsAsCdNull with the passed value
	 *  Corresponding COBOL Variable is SYMBL-TRDS-AS-CD-NULL
	 *	@param number
	 */
	public void setSymblTrdsAsCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    symblTrdsAsCdNull = checkSymblTrdsAsCdNullMaxLimit(number); 
		serializeSymblTrdsAsCdNull(symblTrdsAsCdNull);
	}

	public void setSymblTrdsAsCdNull(int number) {
	    number = checkSymblTrdsAsCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSymblTrdsAsCdNull((short)number);
	}
	public void setSymblTrdsAsCdNull(long number) {
	    number = checkSymblTrdsAsCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSymblTrdsAsCdNull((short)number);
	}
	

	/**
	 *	Returns the value of symblTrdsWhiNull
	 *	@return symblTrdsWhiNull
	 */
	public short getSymblTrdsWhiNull() throws CFException {
        if (isSymblTrdsWhiNullModified()) { 
           symblTrdsWhiNull = refreshSymblTrdsWhiNull();
        }
   		return symblTrdsWhiNull;
	}
	
	/**
	 * 	Update SymblTrdsWhiNull with the passed value
	 *  Corresponding COBOL Variable is SYMBL-TRDS-WHI-NULL
	 *	@param number
	 */
	public void setSymblTrdsWhiNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    symblTrdsWhiNull = checkSymblTrdsWhiNullMaxLimit(number); 
		serializeSymblTrdsWhiNull(symblTrdsWhiNull);
	}

	public void setSymblTrdsWhiNull(int number) {
	    number = checkSymblTrdsWhiNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSymblTrdsWhiNull((short)number);
	}
	public void setSymblTrdsWhiNull(long number) {
	    number = checkSymblTrdsWhiNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSymblTrdsWhiNull((short)number);
	}
	

	/**
	 *	Returns the value of naicsCdNull
	 *	@return naicsCdNull
	 */
	public short getNaicsCdNull() throws CFException {
        if (isNaicsCdNullModified()) { 
           naicsCdNull = refreshNaicsCdNull();
        }
   		return naicsCdNull;
	}
	
	/**
	 * 	Update NaicsCdNull with the passed value
	 *  Corresponding COBOL Variable is NAICS-CD-NULL
	 *	@param number
	 */
	public void setNaicsCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    naicsCdNull = checkNaicsCdNullMaxLimit(number); 
		serializeNaicsCdNull(naicsCdNull);
	}

	public void setNaicsCdNull(int number) {
	    number = checkNaicsCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNaicsCdNull((short)number);
	}
	public void setNaicsCdNull(long number) {
	    number = checkNaicsCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNaicsCdNull((short)number);
	}
	

	/**
	 *	Returns the value of dlvrblFctrPctNull
	 *	@return dlvrblFctrPctNull
	 */
	public short getDlvrblFctrPctNull() throws CFException {
        if (isDlvrblFctrPctNullModified()) { 
           dlvrblFctrPctNull = refreshDlvrblFctrPctNull();
        }
   		return dlvrblFctrPctNull;
	}
	
	/**
	 * 	Update DlvrblFctrPctNull with the passed value
	 *  Corresponding COBOL Variable is DLVRBL-FCTR-PCT-NULL
	 *	@param number
	 */
	public void setDlvrblFctrPctNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dlvrblFctrPctNull = checkDlvrblFctrPctNullMaxLimit(number); 
		serializeDlvrblFctrPctNull(dlvrblFctrPctNull);
	}

	public void setDlvrblFctrPctNull(int number) {
	    number = checkDlvrblFctrPctNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDlvrblFctrPctNull((short)number);
	}
	public void setDlvrblFctrPctNull(long number) {
	    number = checkDlvrblFctrPctNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDlvrblFctrPctNull((short)number);
	}
	

	/**
	 *	Returns the value of yieldBidNull
	 *	@return yieldBidNull
	 */
	public short getYieldBidNull() throws CFException {
        if (isYieldBidNullModified()) { 
           yieldBidNull = refreshYieldBidNull();
        }
   		return yieldBidNull;
	}
	
	/**
	 * 	Update YieldBidNull with the passed value
	 *  Corresponding COBOL Variable is YIELD-BID-NULL
	 *	@param number
	 */
	public void setYieldBidNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    yieldBidNull = checkYieldBidNullMaxLimit(number); 
		serializeYieldBidNull(yieldBidNull);
	}

	public void setYieldBidNull(int number) {
	    number = checkYieldBidNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setYieldBidNull((short)number);
	}
	public void setYieldBidNull(long number) {
	    number = checkYieldBidNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setYieldBidNull((short)number);
	}
	

	/**
	 *	Returns the value of mnmmDnmntAmtNull
	 *	@return mnmmDnmntAmtNull
	 */
	public short getMnmmDnmntAmtNull() throws CFException {
        if (isMnmmDnmntAmtNullModified()) { 
           mnmmDnmntAmtNull = refreshMnmmDnmntAmtNull();
        }
   		return mnmmDnmntAmtNull;
	}
	
	/**
	 * 	Update MnmmDnmntAmtNull with the passed value
	 *  Corresponding COBOL Variable is MNMM-DNMNT-AMT-NULL
	 *	@param number
	 */
	public void setMnmmDnmntAmtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mnmmDnmntAmtNull = checkMnmmDnmntAmtNullMaxLimit(number); 
		serializeMnmmDnmntAmtNull(mnmmDnmntAmtNull);
	}

	public void setMnmmDnmntAmtNull(int number) {
	    number = checkMnmmDnmntAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMnmmDnmntAmtNull((short)number);
	}
	public void setMnmmDnmntAmtNull(long number) {
	    number = checkMnmmDnmntAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMnmmDnmntAmtNull((short)number);
	}
	

	/**
	 *	Returns the value of clNoticeDaysNull
	 *	@return clNoticeDaysNull
	 */
	public short getClNoticeDaysNull() throws CFException {
        if (isClNoticeDaysNullModified()) { 
           clNoticeDaysNull = refreshClNoticeDaysNull();
        }
   		return clNoticeDaysNull;
	}
	
	/**
	 * 	Update ClNoticeDaysNull with the passed value
	 *  Corresponding COBOL Variable is CL-NOTICE-DAYS-NULL
	 *	@param number
	 */
	public void setClNoticeDaysNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    clNoticeDaysNull = checkClNoticeDaysNullMaxLimit(number); 
		serializeClNoticeDaysNull(clNoticeDaysNull);
	}

	public void setClNoticeDaysNull(int number) {
	    number = checkClNoticeDaysNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setClNoticeDaysNull((short)number);
	}
	public void setClNoticeDaysNull(long number) {
	    number = checkClNoticeDaysNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setClNoticeDaysNull((short)number);
	}
	

	/**
	 *	Returns the value of taxWitholdRtNull
	 *	@return taxWitholdRtNull
	 */
	public short getTaxWitholdRtNull() throws CFException {
        if (isTaxWitholdRtNullModified()) { 
           taxWitholdRtNull = refreshTaxWitholdRtNull();
        }
   		return taxWitholdRtNull;
	}
	
	/**
	 * 	Update TaxWitholdRtNull with the passed value
	 *  Corresponding COBOL Variable is TAX-WITHOLD-RT-NULL
	 *	@param number
	 */
	public void setTaxWitholdRtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taxWitholdRtNull = checkTaxWitholdRtNullMaxLimit(number); 
		serializeTaxWitholdRtNull(taxWitholdRtNull);
	}

	public void setTaxWitholdRtNull(int number) {
	    number = checkTaxWitholdRtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaxWitholdRtNull((short)number);
	}
	public void setTaxWitholdRtNull(long number) {
	    number = checkTaxWitholdRtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaxWitholdRtNull((short)number);
	}
	

	/**
	 *	Returns the value of taxCreditRtNull
	 *	@return taxCreditRtNull
	 */
	public short getTaxCreditRtNull() throws CFException {
        if (isTaxCreditRtNullModified()) { 
           taxCreditRtNull = refreshTaxCreditRtNull();
        }
   		return taxCreditRtNull;
	}
	
	/**
	 * 	Update TaxCreditRtNull with the passed value
	 *  Corresponding COBOL Variable is TAX-CREDIT-RT-NULL
	 *	@param number
	 */
	public void setTaxCreditRtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taxCreditRtNull = checkTaxCreditRtNullMaxLimit(number); 
		serializeTaxCreditRtNull(taxCreditRtNull);
	}

	public void setTaxCreditRtNull(int number) {
	    number = checkTaxCreditRtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaxCreditRtNull((short)number);
	}
	public void setTaxCreditRtNull(long number) {
	    number = checkTaxCreditRtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaxCreditRtNull((short)number);
	}
	

	/**
	 *	Returns the value of cvrsnRtNull
	 *	@return cvrsnRtNull
	 */
	public short getCvrsnRtNull() throws CFException {
        if (isCvrsnRtNullModified()) { 
           cvrsnRtNull = refreshCvrsnRtNull();
        }
   		return cvrsnRtNull;
	}
	
	/**
	 * 	Update CvrsnRtNull with the passed value
	 *  Corresponding COBOL Variable is CVRSN-RT-NULL
	 *	@param number
	 */
	public void setCvrsnRtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cvrsnRtNull = checkCvrsnRtNullMaxLimit(number); 
		serializeCvrsnRtNull(cvrsnRtNull);
	}

	public void setCvrsnRtNull(int number) {
	    number = checkCvrsnRtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnRtNull((short)number);
	}
	public void setCvrsnRtNull(long number) {
	    number = checkCvrsnRtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnRtNull((short)number);
	}
	

	/**
	 *	Returns the value of cvrsnPrcAmtNull
	 *	@return cvrsnPrcAmtNull
	 */
	public short getCvrsnPrcAmtNull() throws CFException {
        if (isCvrsnPrcAmtNullModified()) { 
           cvrsnPrcAmtNull = refreshCvrsnPrcAmtNull();
        }
   		return cvrsnPrcAmtNull;
	}
	
	/**
	 * 	Update CvrsnPrcAmtNull with the passed value
	 *  Corresponding COBOL Variable is CVRSN-PRC-AMT-NULL
	 *	@param number
	 */
	public void setCvrsnPrcAmtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cvrsnPrcAmtNull = checkCvrsnPrcAmtNullMaxLimit(number); 
		serializeCvrsnPrcAmtNull(cvrsnPrcAmtNull);
	}

	public void setCvrsnPrcAmtNull(int number) {
	    number = checkCvrsnPrcAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnPrcAmtNull((short)number);
	}
	public void setCvrsnPrcAmtNull(long number) {
	    number = checkCvrsnPrcAmtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnPrcAmtNull((short)number);
	}
	

	/**
	 *	Returns the value of cvrsnExpDtNull
	 *	@return cvrsnExpDtNull
	 */
	public short getCvrsnExpDtNull() throws CFException {
        if (isCvrsnExpDtNullModified()) { 
           cvrsnExpDtNull = refreshCvrsnExpDtNull();
        }
   		return cvrsnExpDtNull;
	}
	
	/**
	 * 	Update CvrsnExpDtNull with the passed value
	 *  Corresponding COBOL Variable is CVRSN-EXP-DT-NULL
	 *	@param number
	 */
	public void setCvrsnExpDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cvrsnExpDtNull = checkCvrsnExpDtNullMaxLimit(number); 
		serializeCvrsnExpDtNull(cvrsnExpDtNull);
	}

	public void setCvrsnExpDtNull(int number) {
	    number = checkCvrsnExpDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnExpDtNull((short)number);
	}
	public void setCvrsnExpDtNull(long number) {
	    number = checkCvrsnExpDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCvrsnExpDtNull((short)number);
	}
	

	/**
	 *	Returns the value of scrtyAdpNull
	 *	@return scrtyAdpNull
	 */
	public short getScrtyAdpNull() throws CFException {
        if (isScrtyAdpNullModified()) { 
           scrtyAdpNull = refreshScrtyAdpNull();
        }
   		return scrtyAdpNull;
	}
	
	/**
	 * 	Update ScrtyAdpNull with the passed value
	 *  Corresponding COBOL Variable is SCRTY-ADP-NULL
	 *	@param number
	 */
	public void setScrtyAdpNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    scrtyAdpNull = checkScrtyAdpNullMaxLimit(number); 
		serializeScrtyAdpNull(scrtyAdpNull);
	}

	public void setScrtyAdpNull(int number) {
	    number = checkScrtyAdpNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setScrtyAdpNull((short)number);
	}
	public void setScrtyAdpNull(long number) {
	    number = checkScrtyAdpNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setScrtyAdpNull((short)number);
	}
	

	/**
	 *	Returns the value of putStrtDtNull
	 *	@return putStrtDtNull
	 */
	public short getPutStrtDtNull() throws CFException {
        if (isPutStrtDtNullModified()) { 
           putStrtDtNull = refreshPutStrtDtNull();
        }
   		return putStrtDtNull;
	}
	
	/**
	 * 	Update PutStrtDtNull with the passed value
	 *  Corresponding COBOL Variable is PUT-STRT-DT-NULL
	 *	@param number
	 */
	public void setPutStrtDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    putStrtDtNull = checkPutStrtDtNullMaxLimit(number); 
		serializePutStrtDtNull(putStrtDtNull);
	}

	public void setPutStrtDtNull(int number) {
	    number = checkPutStrtDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutStrtDtNull((short)number);
	}
	public void setPutStrtDtNull(long number) {
	    number = checkPutStrtDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutStrtDtNull((short)number);
	}
	

	/**
	 *	Returns the value of putEndDtNull
	 *	@return putEndDtNull
	 */
	public short getPutEndDtNull() throws CFException {
        if (isPutEndDtNullModified()) { 
           putEndDtNull = refreshPutEndDtNull();
        }
   		return putEndDtNull;
	}
	
	/**
	 * 	Update PutEndDtNull with the passed value
	 *  Corresponding COBOL Variable is PUT-END-DT-NULL
	 *	@param number
	 */
	public void setPutEndDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    putEndDtNull = checkPutEndDtNullMaxLimit(number); 
		serializePutEndDtNull(putEndDtNull);
	}

	public void setPutEndDtNull(int number) {
	    number = checkPutEndDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutEndDtNull((short)number);
	}
	public void setPutEndDtNull(long number) {
	    number = checkPutEndDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutEndDtNull((short)number);
	}
	

	/**
	 *	Returns the value of putNtcMinNull
	 *	@return putNtcMinNull
	 */
	public short getPutNtcMinNull() throws CFException {
        if (isPutNtcMinNullModified()) { 
           putNtcMinNull = refreshPutNtcMinNull();
        }
   		return putNtcMinNull;
	}
	
	/**
	 * 	Update PutNtcMinNull with the passed value
	 *  Corresponding COBOL Variable is PUT-NTC-MIN-NULL
	 *	@param number
	 */
	public void setPutNtcMinNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    putNtcMinNull = checkPutNtcMinNullMaxLimit(number); 
		serializePutNtcMinNull(putNtcMinNull);
	}

	public void setPutNtcMinNull(int number) {
	    number = checkPutNtcMinNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMinNull((short)number);
	}
	public void setPutNtcMinNull(long number) {
	    number = checkPutNtcMinNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMinNull((short)number);
	}
	

	/**
	 *	Returns the value of putNtcMaxNull
	 *	@return putNtcMaxNull
	 */
	public short getPutNtcMaxNull() throws CFException {
        if (isPutNtcMaxNullModified()) { 
           putNtcMaxNull = refreshPutNtcMaxNull();
        }
   		return putNtcMaxNull;
	}
	
	/**
	 * 	Update PutNtcMaxNull with the passed value
	 *  Corresponding COBOL Variable is PUT-NTC-MAX-NULL
	 *	@param number
	 */
	public void setPutNtcMaxNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    putNtcMaxNull = checkPutNtcMaxNullMaxLimit(number); 
		serializePutNtcMaxNull(putNtcMaxNull);
	}

	public void setPutNtcMaxNull(int number) {
	    number = checkPutNtcMaxNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMaxNull((short)number);
	}
	public void setPutNtcMaxNull(long number) {
	    number = checkPutNtcMaxNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutNtcMaxNull((short)number);
	}
	

	/**
	 *	Returns the value of putTmngCdNull
	 *	@return putTmngCdNull
	 */
	public short getPutTmngCdNull() throws CFException {
        if (isPutTmngCdNullModified()) { 
           putTmngCdNull = refreshPutTmngCdNull();
        }
   		return putTmngCdNull;
	}
	
	/**
	 * 	Update PutTmngCdNull with the passed value
	 *  Corresponding COBOL Variable is PUT-TMNG-CD-NULL
	 *	@param number
	 */
	public void setPutTmngCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    putTmngCdNull = checkPutTmngCdNullMaxLimit(number); 
		serializePutTmngCdNull(putTmngCdNull);
	}

	public void setPutTmngCdNull(int number) {
	    number = checkPutTmngCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutTmngCdNull((short)number);
	}
	public void setPutTmngCdNull(long number) {
	    number = checkPutTmngCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutTmngCdNull((short)number);
	}
	

	/**
	 *	Returns the value of callTmngCdNull
	 *	@return callTmngCdNull
	 */
	public short getCallTmngCdNull() throws CFException {
        if (isCallTmngCdNullModified()) { 
           callTmngCdNull = refreshCallTmngCdNull();
        }
   		return callTmngCdNull;
	}
	
	/**
	 * 	Update CallTmngCdNull with the passed value
	 *  Corresponding COBOL Variable is CALL-TMNG-CD-NULL
	 *	@param number
	 */
	public void setCallTmngCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    callTmngCdNull = checkCallTmngCdNullMaxLimit(number); 
		serializeCallTmngCdNull(callTmngCdNull);
	}

	public void setCallTmngCdNull(int number) {
	    number = checkCallTmngCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallTmngCdNull((short)number);
	}
	public void setCallTmngCdNull(long number) {
	    number = checkCallTmngCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCallTmngCdNull((short)number);
	}
	

	/**
	 *	Returns the value of regShoElgblDtNull
	 *	@return regShoElgblDtNull
	 */
	public short getRegShoElgblDtNull() throws CFException {
        if (isRegShoElgblDtNullModified()) { 
           regShoElgblDtNull = refreshRegShoElgblDtNull();
        }
   		return regShoElgblDtNull;
	}
	
	/**
	 * 	Update RegShoElgblDtNull with the passed value
	 *  Corresponding COBOL Variable is REG-SHO-ELGBL-DT-NULL
	 *	@param number
	 */
	public void setRegShoElgblDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    regShoElgblDtNull = checkRegShoElgblDtNullMaxLimit(number); 
		serializeRegShoElgblDtNull(regShoElgblDtNull);
	}

	public void setRegShoElgblDtNull(int number) {
	    number = checkRegShoElgblDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRegShoElgblDtNull((short)number);
	}
	public void setRegShoElgblDtNull(long number) {
	    number = checkRegShoElgblDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRegShoElgblDtNull((short)number);
	}
	

	/**
	 *	Returns the value of sttlmDtNull
	 *	@return sttlmDtNull
	 */
	public short getSttlmDtNull() throws CFException {
        if (isSttlmDtNullModified()) { 
           sttlmDtNull = refreshSttlmDtNull();
        }
   		return sttlmDtNull;
	}
	
	/**
	 * 	Update SttlmDtNull with the passed value
	 *  Corresponding COBOL Variable is STTLM-DT-NULL
	 *	@param number
	 */
	public void setSttlmDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sttlmDtNull = checkSttlmDtNullMaxLimit(number); 
		serializeSttlmDtNull(sttlmDtNull);
	}

	public void setSttlmDtNull(int number) {
	    number = checkSttlmDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSttlmDtNull((short)number);
	}
	public void setSttlmDtNull(long number) {
	    number = checkSttlmDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSttlmDtNull((short)number);
	}
	

	/**
	 *	Returns the value of optionMaturityDtNull
	 *	@return optionMaturityDtNull
	 */
	public short getOptionMaturityDtNull() throws CFException {
        if (isOptionMaturityDtNullModified()) { 
           optionMaturityDtNull = refreshOptionMaturityDtNull();
        }
   		return optionMaturityDtNull;
	}
	
	/**
	 * 	Update OptionMaturityDtNull with the passed value
	 *  Corresponding COBOL Variable is OPTION-MATURITY-DT-NULL
	 *	@param number
	 */
	public void setOptionMaturityDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    optionMaturityDtNull = checkOptionMaturityDtNullMaxLimit(number); 
		serializeOptionMaturityDtNull(optionMaturityDtNull);
	}

	public void setOptionMaturityDtNull(int number) {
	    number = checkOptionMaturityDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOptionMaturityDtNull((short)number);
	}
	public void setOptionMaturityDtNull(long number) {
	    number = checkOptionMaturityDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOptionMaturityDtNull((short)number);
	}
	

	/**
	 *	Returns the value of regShoInelgblNull
	 *	@return regShoInelgblNull
	 */
	public short getRegShoInelgblNull() throws CFException {
        if (isRegShoInelgblNullModified()) { 
           regShoInelgblNull = refreshRegShoInelgblNull();
        }
   		return regShoInelgblNull;
	}
	
	/**
	 * 	Update RegShoInelgblNull with the passed value
	 *  Corresponding COBOL Variable is REG-SHO-INELGBL-NULL
	 *	@param number
	 */
	public void setRegShoInelgblNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    regShoInelgblNull = checkRegShoInelgblNullMaxLimit(number); 
		serializeRegShoInelgblNull(regShoInelgblNull);
	}

	public void setRegShoInelgblNull(int number) {
	    number = checkRegShoInelgblNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRegShoInelgblNull((short)number);
	}
	public void setRegShoInelgblNull(long number) {
	    number = checkRegShoInelgblNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRegShoInelgblNull((short)number);
	}
	

	/**
	 *	Returns the value of putFreqCdNull
	 *	@return putFreqCdNull
	 */
	public short getPutFreqCdNull() throws CFException {
        if (isPutFreqCdNullModified()) { 
           putFreqCdNull = refreshPutFreqCdNull();
        }
   		return putFreqCdNull;
	}
	
	/**
	 * 	Update PutFreqCdNull with the passed value
	 *  Corresponding COBOL Variable is PUT-FREQ-CD-NULL
	 *	@param number
	 */
	public void setPutFreqCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    putFreqCdNull = checkPutFreqCdNullMaxLimit(number); 
		serializePutFreqCdNull(putFreqCdNull);
	}

	public void setPutFreqCdNull(int number) {
	    number = checkPutFreqCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutFreqCdNull((short)number);
	}
	public void setPutFreqCdNull(long number) {
	    number = checkPutFreqCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPutFreqCdNull((short)number);
	}
	

	/**
	 *	Returns the value of frstVrblRstDtNull
	 *	@return frstVrblRstDtNull
	 */
	public short getFrstVrblRstDtNull() throws CFException {
        if (isFrstVrblRstDtNullModified()) { 
           frstVrblRstDtNull = refreshFrstVrblRstDtNull();
        }
   		return frstVrblRstDtNull;
	}
	
	/**
	 * 	Update FrstVrblRstDtNull with the passed value
	 *  Corresponding COBOL Variable is FRST-VRBL-RST-DT-NULL
	 *	@param number
	 */
	public void setFrstVrblRstDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    frstVrblRstDtNull = checkFrstVrblRstDtNullMaxLimit(number); 
		serializeFrstVrblRstDtNull(frstVrblRstDtNull);
	}

	public void setFrstVrblRstDtNull(int number) {
	    number = checkFrstVrblRstDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFrstVrblRstDtNull((short)number);
	}
	public void setFrstVrblRstDtNull(long number) {
	    number = checkFrstVrblRstDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFrstVrblRstDtNull((short)number);
	}
	

	/**
	 *	Returns the value of rstFreqCdNull
	 *	@return rstFreqCdNull
	 */
	public short getRstFreqCdNull() throws CFException {
        if (isRstFreqCdNullModified()) { 
           rstFreqCdNull = refreshRstFreqCdNull();
        }
   		return rstFreqCdNull;
	}
	
	/**
	 * 	Update RstFreqCdNull with the passed value
	 *  Corresponding COBOL Variable is RST-FREQ-CD-NULL
	 *	@param number
	 */
	public void setRstFreqCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rstFreqCdNull = checkRstFreqCdNullMaxLimit(number); 
		serializeRstFreqCdNull(rstFreqCdNull);
	}

	public void setRstFreqCdNull(int number) {
	    number = checkRstFreqCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRstFreqCdNull((short)number);
	}
	public void setRstFreqCdNull(long number) {
	    number = checkRstFreqCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRstFreqCdNull((short)number);
	}
	

	/**
	 *	Returns the value of call2TmngCdNull
	 *	@return call2TmngCdNull
	 */
	public short getCall2TmngCdNull() throws CFException {
        if (isCall2TmngCdNullModified()) { 
           call2TmngCdNull = refreshCall2TmngCdNull();
        }
   		return call2TmngCdNull;
	}
	
	/**
	 * 	Update Call2TmngCdNull with the passed value
	 *  Corresponding COBOL Variable is CALL2-TMNG-CD-NULL
	 *	@param number
	 */
	public void setCall2TmngCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    call2TmngCdNull = checkCall2TmngCdNullMaxLimit(number); 
		serializeCall2TmngCdNull(call2TmngCdNull);
	}

	public void setCall2TmngCdNull(int number) {
	    number = checkCall2TmngCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCall2TmngCdNull((short)number);
	}
	public void setCall2TmngCdNull(long number) {
	    number = checkCall2TmngCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCall2TmngCdNull((short)number);
	}
	

	/**
	 *	Returns the value of undlSymblTrdsNull
	 *	@return undlSymblTrdsNull
	 */
	public short getUndlSymblTrdsNull() throws CFException {
        if (isUndlSymblTrdsNullModified()) { 
           undlSymblTrdsNull = refreshUndlSymblTrdsNull();
        }
   		return undlSymblTrdsNull;
	}
	
	/**
	 * 	Update UndlSymblTrdsNull with the passed value
	 *  Corresponding COBOL Variable is UNDL-SYMBL-TRDS-NULL
	 *	@param number
	 */
	public void setUndlSymblTrdsNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undlSymblTrdsNull = checkUndlSymblTrdsNullMaxLimit(number); 
		serializeUndlSymblTrdsNull(undlSymblTrdsNull);
	}

	public void setUndlSymblTrdsNull(int number) {
	    number = checkUndlSymblTrdsNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlSymblTrdsNull((short)number);
	}
	public void setUndlSymblTrdsNull(long number) {
	    number = checkUndlSymblTrdsNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlSymblTrdsNull((short)number);
	}
	

	/**
	 *	Returns the value of undPrimeExchNull
	 *	@return undPrimeExchNull
	 */
	public short getUndPrimeExchNull() throws CFException {
        if (isUndPrimeExchNullModified()) { 
           undPrimeExchNull = refreshUndPrimeExchNull();
        }
   		return undPrimeExchNull;
	}
	
	/**
	 * 	Update UndPrimeExchNull with the passed value
	 *  Corresponding COBOL Variable is UND-PRIME-EXCH-NULL
	 *	@param number
	 */
	public void setUndPrimeExchNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undPrimeExchNull = checkUndPrimeExchNullMaxLimit(number); 
		serializeUndPrimeExchNull(undPrimeExchNull);
	}

	public void setUndPrimeExchNull(int number) {
	    number = checkUndPrimeExchNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndPrimeExchNull((short)number);
	}
	public void setUndPrimeExchNull(long number) {
	    number = checkUndPrimeExchNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndPrimeExchNull((short)number);
	}
	

	/**
	 *	Returns the value of undPrimeSymbolNull
	 *	@return undPrimeSymbolNull
	 */
	public short getUndPrimeSymbolNull() throws CFException {
        if (isUndPrimeSymbolNullModified()) { 
           undPrimeSymbolNull = refreshUndPrimeSymbolNull();
        }
   		return undPrimeSymbolNull;
	}
	
	/**
	 * 	Update UndPrimeSymbolNull with the passed value
	 *  Corresponding COBOL Variable is UND-PRIME-SYMBOL-NULL
	 *	@param number
	 */
	public void setUndPrimeSymbolNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undPrimeSymbolNull = checkUndPrimeSymbolNullMaxLimit(number); 
		serializeUndPrimeSymbolNull(undPrimeSymbolNull);
	}

	public void setUndPrimeSymbolNull(int number) {
	    number = checkUndPrimeSymbolNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndPrimeSymbolNull((short)number);
	}
	public void setUndPrimeSymbolNull(long number) {
	    number = checkUndPrimeSymbolNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndPrimeSymbolNull((short)number);
	}
	

	/**
	 *	Returns the value of undCanadaExchNull
	 *	@return undCanadaExchNull
	 */
	public short getUndCanadaExchNull() throws CFException {
        if (isUndCanadaExchNullModified()) { 
           undCanadaExchNull = refreshUndCanadaExchNull();
        }
   		return undCanadaExchNull;
	}
	
	/**
	 * 	Update UndCanadaExchNull with the passed value
	 *  Corresponding COBOL Variable is UND-CANADA-EXCH-NULL
	 *	@param number
	 */
	public void setUndCanadaExchNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undCanadaExchNull = checkUndCanadaExchNullMaxLimit(number); 
		serializeUndCanadaExchNull(undCanadaExchNull);
	}

	public void setUndCanadaExchNull(int number) {
	    number = checkUndCanadaExchNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndCanadaExchNull((short)number);
	}
	public void setUndCanadaExchNull(long number) {
	    number = checkUndCanadaExchNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndCanadaExchNull((short)number);
	}
	

	/**
	 *	Returns the value of undCanadaSymbolNull
	 *	@return undCanadaSymbolNull
	 */
	public short getUndCanadaSymbolNull() throws CFException {
        if (isUndCanadaSymbolNullModified()) { 
           undCanadaSymbolNull = refreshUndCanadaSymbolNull();
        }
   		return undCanadaSymbolNull;
	}
	
	/**
	 * 	Update UndCanadaSymbolNull with the passed value
	 *  Corresponding COBOL Variable is UND-CANADA-SYMBOL-NULL
	 *	@param number
	 */
	public void setUndCanadaSymbolNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undCanadaSymbolNull = checkUndCanadaSymbolNullMaxLimit(number); 
		serializeUndCanadaSymbolNull(undCanadaSymbolNull);
	}

	public void setUndCanadaSymbolNull(int number) {
	    number = checkUndCanadaSymbolNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndCanadaSymbolNull((short)number);
	}
	public void setUndCanadaSymbolNull(long number) {
	    number = checkUndCanadaSymbolNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndCanadaSymbolNull((short)number);
	}
	

	/**
	 *	Returns the value of undlCusipNull
	 *	@return undlCusipNull
	 */
	public short getUndlCusipNull() throws CFException {
        if (isUndlCusipNullModified()) { 
           undlCusipNull = refreshUndlCusipNull();
        }
   		return undlCusipNull;
	}
	
	/**
	 * 	Update UndlCusipNull with the passed value
	 *  Corresponding COBOL Variable is UNDL-CUSIP-NULL
	 *	@param number
	 */
	public void setUndlCusipNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undlCusipNull = checkUndlCusipNullMaxLimit(number); 
		serializeUndlCusipNull(undlCusipNull);
	}

	public void setUndlCusipNull(int number) {
	    number = checkUndlCusipNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlCusipNull((short)number);
	}
	public void setUndlCusipNull(long number) {
	    number = checkUndlCusipNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlCusipNull((short)number);
	}
	

	/**
	 *	Returns the value of undlIsinNull
	 *	@return undlIsinNull
	 */
	public short getUndlIsinNull() throws CFException {
        if (isUndlIsinNullModified()) { 
           undlIsinNull = refreshUndlIsinNull();
        }
   		return undlIsinNull;
	}
	
	/**
	 * 	Update UndlIsinNull with the passed value
	 *  Corresponding COBOL Variable is UNDL-ISIN-NULL
	 *	@param number
	 */
	public void setUndlIsinNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undlIsinNull = checkUndlIsinNullMaxLimit(number); 
		serializeUndlIsinNull(undlIsinNull);
	}

	public void setUndlIsinNull(int number) {
	    number = checkUndlIsinNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlIsinNull((short)number);
	}
	public void setUndlIsinNull(long number) {
	    number = checkUndlIsinNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlIsinNull((short)number);
	}
	

	/**
	 *	Returns the value of undlSedolNull
	 *	@return undlSedolNull
	 */
	public short getUndlSedolNull() throws CFException {
        if (isUndlSedolNullModified()) { 
           undlSedolNull = refreshUndlSedolNull();
        }
   		return undlSedolNull;
	}
	
	/**
	 * 	Update UndlSedolNull with the passed value
	 *  Corresponding COBOL Variable is UNDL-SEDOL-NULL
	 *	@param number
	 */
	public void setUndlSedolNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undlSedolNull = checkUndlSedolNullMaxLimit(number); 
		serializeUndlSedolNull(undlSedolNull);
	}

	public void setUndlSedolNull(int number) {
	    number = checkUndlSedolNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlSedolNull((short)number);
	}
	public void setUndlSedolNull(long number) {
	    number = checkUndlSedolNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlSedolNull((short)number);
	}
	

	/**
	 *	Returns the value of undlCommonCdNull
	 *	@return undlCommonCdNull
	 */
	public short getUndlCommonCdNull() throws CFException {
        if (isUndlCommonCdNullModified()) { 
           undlCommonCdNull = refreshUndlCommonCdNull();
        }
   		return undlCommonCdNull;
	}
	
	/**
	 * 	Update UndlCommonCdNull with the passed value
	 *  Corresponding COBOL Variable is UNDL-COMMON-CD-NULL
	 *	@param number
	 */
	public void setUndlCommonCdNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undlCommonCdNull = checkUndlCommonCdNullMaxLimit(number); 
		serializeUndlCommonCdNull(undlCommonCdNull);
	}

	public void setUndlCommonCdNull(int number) {
	    number = checkUndlCommonCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlCommonCdNull((short)number);
	}
	public void setUndlCommonCdNull(long number) {
	    number = checkUndlCommonCdNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlCommonCdNull((short)number);
	}
	

	/**
	 *	Returns the value of undlCinsNull
	 *	@return undlCinsNull
	 */
	public short getUndlCinsNull() throws CFException {
        if (isUndlCinsNullModified()) { 
           undlCinsNull = refreshUndlCinsNull();
        }
   		return undlCinsNull;
	}
	
	/**
	 * 	Update UndlCinsNull with the passed value
	 *  Corresponding COBOL Variable is UNDL-CINS-NULL
	 *	@param number
	 */
	public void setUndlCinsNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    undlCinsNull = checkUndlCinsNullMaxLimit(number); 
		serializeUndlCinsNull(undlCinsNull);
	}

	public void setUndlCinsNull(int number) {
	    number = checkUndlCinsNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlCinsNull((short)number);
	}
	public void setUndlCinsNull(long number) {
	    number = checkUndlCinsNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setUndlCinsNull((short)number);
	}
	

	/**
	 *	Returns the value of mtrlMdfdDtNull
	 *	@return mtrlMdfdDtNull
	 */
	public short getMtrlMdfdDtNull() throws CFException {
        if (isMtrlMdfdDtNullModified()) { 
           mtrlMdfdDtNull = refreshMtrlMdfdDtNull();
        }
   		return mtrlMdfdDtNull;
	}
	
	/**
	 * 	Update MtrlMdfdDtNull with the passed value
	 *  Corresponding COBOL Variable is MTRL-MDFD-DT-NULL
	 *	@param number
	 */
	public void setMtrlMdfdDtNull(short number) {
	     // Truncate if the number is beyond +/- Max range
	    mtrlMdfdDtNull = checkMtrlMdfdDtNullMaxLimit(number); 
		serializeMtrlMdfdDtNull(mtrlMdfdDtNull);
	}

	public void setMtrlMdfdDtNull(int number) {
	    number = checkMtrlMdfdDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMtrlMdfdDtNull((short)number);
	}
	public void setMtrlMdfdDtNull(long number) {
	    number = checkMtrlMdfdDtNullMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMtrlMdfdDtNull((short)number);
	}
	


	
	
	

		public static int getDb2IndicatorsFieldLength() {
			return DB_2_INDICATORS_LENGTH;
		}

}
  
