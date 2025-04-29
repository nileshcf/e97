package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iMpePeRecDataCs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0040iMpePeRecDataCs extends Ip0040iMpePeRecDataCsSerialized { 
   

						@Getter @Setter private char[] ip0040iProductType = Field.fillLowValue(1);

								@Getter @Setter private long ip0040iEndpoint;

						@Getter @Setter private char[] ip0040iCountry = Field.fillLowValue(3);

								@Getter @Setter private int ip0040iCountryNum;
				@Getter @Setter private Ip0040iRegionSubreg ip0040iRegionSubreg = new Ip0040iRegionSubreg();

						@Getter @Setter private char[] ip0040iProductClass = Field.fillLowValue(3);

						@Getter @Setter private char[] ip0040iTranRoutingInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iPrsProdReassgnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iProdReassignmentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iOptInFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iLicensedProdId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip0040iVirtFundPanInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iAcctCatgPartSw = Field.fillLowValue(1);

								@Getter @Setter private long ip0040iAcctCatgActvnDate;
				@Getter @Setter private Ip0040iCardHldrBlngCur ip0040iCardHldrBlngCur = new Ip0040iCardHldrBlngCur();

						@Getter @Setter private char[] ip0040iChipConversionSw = Field.fillLowValue(1);
				@Getter @Setter private Ip0040iFloorExpiryDate ip0040iFloorExpiryDate = new Ip0040iFloorExpiryDate();

						@Getter @Setter private char[] ip0040iCoBrandSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iSpendControlRcnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iMerchCleanServPart = Field.fillLowValue(3);

								@Getter @Setter private long ip0040iMerchCleanActvDate;

						@Getter @Setter private char[] ip0040iPaypassEnabledInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iRateTypeIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iRoutePsnIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iCbwpIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iFlexParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iRepwrRldInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iMoneySendInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iRegulatedRateIndSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iCashAccessSw = Field.fillLowValue(1);

								@Getter @Setter private int ip0040iPersonPresentInd;

						@Getter @Setter private char[] ip0040iCrossBdrException = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iIssTargetMarketInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iPostDateServSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iMealVoucherInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iNonRldblPrpdSw = Field.fillLowValue(2);

						@Getter @Setter private char[] ip0040iFasterFundsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iAnonPrepaidInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iDccStatusInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iPayByAcctInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iIssGamParticipSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iMemberFiller = Field.fillLowValue(12);

						@Getter @Setter private char[] ip0040iChbConvExclId = Field.fillLowValue(1);

								@Getter @Setter private long ip0040iChbConvExclExpire;

						@Getter @Setter private char[] ip0040iHardshipIndicator = Field.fillLowValue(1);

								@Getter @Setter private long ip0040iHardshipEffective;

								@Getter @Setter private long ip0040iHardshipExpiration;

						@Getter @Setter private char[] ip0040iGamingCountrySw = Field.fillLowValue(1);

								@Getter @Setter private int ip0040iCrossBorderInd;

						@Getter @Setter private char[] ip0040iRecPaymtCanSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iDomDbtParticipSw = Field.fillLowValue(1);
				@Getter @Setter private Ip0040iGrpCode ip0040iGrpCode = new Ip0040iGrpCode();

						@Getter @Setter private char[] ip0040iIpcFraudCtlSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iIccrParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iRevCreditInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iChgbkBkoutInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iRtnTrnstNum = Field.fillLowValue(10);

								@Getter @Setter private long ip0040iTrueIssuerIca;

						@Getter @Setter private char[] ip0040iMerchantTaxIdSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iInstallServSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iTokenServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iGbsBillInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iInstallAuthSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iSeqServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iCbfmParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iCbcmParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iCbfmDccSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iInstApiGcmsSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iInsEnabApiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iInstApiUiSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iFiller = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iOboServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iMultCurrSw = Field.fillLowValue(1);

								@Getter @Setter private long ip0040iAnonIndEffDate;

						@Getter @Setter private char[] ip0040iCbfmEcbRateParInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iAlmXbOptOutInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip0040iJpnNonmdesTknrngSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip0040iMpePeRecDataCs
	**/
    public Ip0040iMpePeRecDataCs() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040iMpePeRecDataCs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iMpePeRecDataCs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0040iRegionSubreg().setParent(this,getStartOffset() + 14);
					getIp0040iCardHldrBlngCur().setParent(this,getStartOffset() + 33);
					getIp0040iFloorExpiryDate().setParent(this,getStartOffset() + 66);
					getIp0040iGrpCode().setParent(this,getStartOffset() + 140);
    } 

	/**
	 * 	initializes Ip0040iMpePeRecDataCs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp0040iProductType(CONSTANTS.SPACE);
                     setIp0040iEndpoint(0);
         setIp0040iCountry(CONSTANTS.SPACE_3);
                     setIp0040iCountryNum(0);
          getIp0040iRegionSubreg().initialize();
     
         setIp0040iProductClass(CONSTANTS.SPACE_3);
         setIp0040iTranRoutingInd(CONSTANTS.SPACE);
         setIp0040iPrsProdReassgnSw(CONSTANTS.SPACE);
         setIp0040iProdReassignmentSw(CONSTANTS.SPACE);
         setIp0040iOptInFlag(CONSTANTS.SPACE);
         setIp0040iLicensedProdId(CONSTANTS.SPACE_3);
         setIp0040iVirtFundPanInd(CONSTANTS.SPACE);
         setIp0040iAcctCatgPartSw(CONSTANTS.SPACE);
                     setIp0040iAcctCatgActvnDate(0);
          getIp0040iCardHldrBlngCur().initialize();
     
         setIp0040iChipConversionSw(CONSTANTS.SPACE);
          getIp0040iFloorExpiryDate().initialize();
     
         setIp0040iCoBrandSw(CONSTANTS.SPACE);
         setIp0040iSpendControlRcnSw(CONSTANTS.SPACE);
         setIp0040iMerchCleanServPart(CONSTANTS.SPACE_3);
                     setIp0040iMerchCleanActvDate(0);
         setIp0040iPaypassEnabledInd(CONSTANTS.SPACE);
         setIp0040iRateTypeIndicator(CONSTANTS.SPACE);
         setIp0040iRoutePsnIndicator(CONSTANTS.SPACE);
         setIp0040iCbwpIndicator(CONSTANTS.SPACE);
         setIp0040iFlexParticipInd(CONSTANTS.SPACE);
         setIp0040iRepwrRldInd(CONSTANTS.SPACE);
         setIp0040iMoneySendInd(CONSTANTS.SPACE);
         setIp0040iRegulatedRateIndSw(CONSTANTS.SPACE);
         setIp0040iCashAccessSw(CONSTANTS.SPACE);
                     setIp0040iPersonPresentInd(0);
         setIp0040iCrossBdrException(CONSTANTS.SPACE);
         setIp0040iIssTargetMarketInd(CONSTANTS.SPACE);
         setIp0040iPostDateServSw(CONSTANTS.SPACE);
         setIp0040iMealVoucherInd(CONSTANTS.SPACE);
         setIp0040iNonRldblPrpdSw(CONSTANTS.SPACE_2);
         setIp0040iFasterFundsInd(CONSTANTS.SPACE);
         setIp0040iAnonPrepaidInd(CONSTANTS.SPACE);
         setIp0040iDccStatusInd(CONSTANTS.SPACE);
         setIp0040iPayByAcctInd(CONSTANTS.SPACE);
         setIp0040iIssGamParticipSw(CONSTANTS.SPACE);
         setIp0040iMemberFiller(CONSTANTS.SPACE_12);
         setIp0040iChbConvExclId(CONSTANTS.SPACE);
                     setIp0040iChbConvExclExpire(0);
         setIp0040iHardshipIndicator(CONSTANTS.SPACE);
                     setIp0040iHardshipEffective(0);
                     setIp0040iHardshipExpiration(0);
         setIp0040iGamingCountrySw(CONSTANTS.SPACE);
                     setIp0040iCrossBorderInd(0);
         setIp0040iRecPaymtCanSw(CONSTANTS.SPACE);
         setIp0040iDomDbtParticipSw(CONSTANTS.SPACE);
          getIp0040iGrpCode().initialize();
     
         setIp0040iIpcFraudCtlSw(CONSTANTS.SPACE);
         setIp0040iIccrParticipInd(CONSTANTS.SPACE);
         setIp0040iRevCreditInd(CONSTANTS.SPACE);
         setIp0040iChgbkBkoutInd(CONSTANTS.SPACE);
         setIp0040iRtnTrnstNum(CONSTANTS.SPACE_10);
                     setIp0040iTrueIssuerIca(0);
         setIp0040iMerchantTaxIdSw(CONSTANTS.SPACE);
         setIp0040iInstallServSw(CONSTANTS.SPACE);
         setIp0040iTokenServiceInd(CONSTANTS.SPACE);
         setIp0040iGbsBillInd(CONSTANTS.SPACE);
         setIp0040iInstallAuthSw(CONSTANTS.SPACE);
         setIp0040iSeqServiceInd(CONSTANTS.SPACE);
         setIp0040iCbfmParticipInd(CONSTANTS.SPACE);
         setIp0040iCbcmParticipInd(CONSTANTS.SPACE);
         setIp0040iCbfmDccSw(CONSTANTS.SPACE);
         setIp0040iInstApiGcmsSw(CONSTANTS.SPACE);
         setIp0040iInsEnabApiInd(CONSTANTS.SPACE);
         setIp0040iInstApiUiSw(CONSTANTS.SPACE);
         setIp0040iFiller(CONSTANTS.SPACE);
         setIp0040iOboServiceInd(CONSTANTS.SPACE);
         setIp0040iMultCurrSw(CONSTANTS.SPACE);
                     setIp0040iAnonIndEffDate(0);
         setIp0040iCbfmEcbRateParInd(CONSTANTS.SPACE);
         setIp0040iAlmXbOptOutInd(CONSTANTS.SPACE);
         setIp0040iJpnNonmdesTknrngSw(CONSTANTS.SPACE);
   }


}
  
