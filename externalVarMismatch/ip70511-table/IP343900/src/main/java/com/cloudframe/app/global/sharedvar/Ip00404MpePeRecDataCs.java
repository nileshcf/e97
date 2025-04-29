package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404MpePeRecDataCs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00404MpePeRecDataCs extends Ip00404MpePeRecDataCsSerialized { 
   

						@Getter @Setter private char[] ip00404ProductType = Field.fillLowValue(1);

								@Getter @Setter private long ip00404Endpoint;

						@Getter @Setter private char[] ip00404Country = Field.fillLowValue(3);

								@Getter @Setter private int ip00404CountryNum;
				@Getter @Setter private Ip00404RegionSubreg ip00404RegionSubreg = new Ip00404RegionSubreg();

						@Getter @Setter private char[] ip00404ProductClass = Field.fillLowValue(3);

						@Getter @Setter private char[] ip00404TranRoutingInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404PrsProdReassgnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404ProdReassignmentSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404OptInFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404LicensedProdId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip00404VirtFundPanInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404AcctCatgPartSw = Field.fillLowValue(1);

								@Getter @Setter private long ip00404AcctCatgActvnDate;
				@Getter @Setter private Ip00404CardHldrBlngCur ip00404CardHldrBlngCur = new Ip00404CardHldrBlngCur();

						@Getter @Setter private char[] ip00404ChipConversionSw = Field.fillLowValue(1);
				@Getter @Setter private Ip00404FloorExpiryDate ip00404FloorExpiryDate = new Ip00404FloorExpiryDate();

						@Getter @Setter private char[] ip00404CoBrandSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404SpendControlRcnSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404MerchCleanServPart = Field.fillLowValue(3);

								@Getter @Setter private long ip00404MerchCleanActvDate;

						@Getter @Setter private char[] ip00404PaypassEnabledInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404RateTypeIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404RoutePsnIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404CbwpIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404FlexParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404RepwrRldInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404MoneySendInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404RegulatedRateIndSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404CashAccessSw = Field.fillLowValue(1);

								@Getter @Setter private int ip00404PersonPresentInd;

						@Getter @Setter private char[] ip00404CrossBdrException = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404IssTargetMarketInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404PostDateServSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404MealVoucherInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404NonRldblPrpdSw = Field.fillLowValue(2);

						@Getter @Setter private char[] ip00404FasterFundsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404AnonPrepaidInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404DccStatusInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404PayByAcctInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404IssGamParticipSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404MemberFiller = Field.fillLowValue(12);

						@Getter @Setter private char[] ip00404ChbConvExclId = Field.fillLowValue(1);

								@Getter @Setter private long ip00404ChbConvExclExpire;

						@Getter @Setter private char[] ip00404HardshipIndicator = Field.fillLowValue(1);

								@Getter @Setter private long ip00404HardshipEffective;

								@Getter @Setter private long ip00404HardshipExpiration;

						@Getter @Setter private char[] ip00404GamingCountrySw = Field.fillLowValue(1);

								@Getter @Setter private int ip00404CrossBorderInd;

						@Getter @Setter private char[] ip00404RecPaymtCanSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404DomDbtParticipSw = Field.fillLowValue(1);
				@Getter @Setter private Ip00404GrpCode ip00404GrpCode = new Ip00404GrpCode();

						@Getter @Setter private char[] ip00404IpcFraudCtlSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404IccrParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404RevCreditInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404ChgbkBkoutInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404RtnTrnstNum = Field.fillLowValue(10);

								@Getter @Setter private long ip00404TrueIssuerIca;

						@Getter @Setter private char[] ip00404MerchantTaxIdSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404InstallServSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404TokenServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404GbsBillInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404InstallAuthSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404SeqServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404CbfmParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404CbcmParticipInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404CbfmDccSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404InstApiGcmsSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404InsEnabApiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404InstApiUiSw = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404Filler = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404OboServiceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404MultCurrSw = Field.fillLowValue(1);

								@Getter @Setter private long ip00404AnonIndEffDate;

						@Getter @Setter private char[] ip00404CbfmEcbRateParInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404AlmXbOptOutInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00404JpnNonmdesTknrngSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00404MpePeRecDataCs
	**/
    public Ip00404MpePeRecDataCs() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404MpePeRecDataCs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404MpePeRecDataCs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00404RegionSubreg().setParent(this,getStartOffset() + 14);
					getIp00404CardHldrBlngCur().setParent(this,getStartOffset() + 33);
					getIp00404FloorExpiryDate().setParent(this,getStartOffset() + 66);
					getIp00404GrpCode().setParent(this,getStartOffset() + 140);
    } 

	/**
	 * 	initializes Ip00404MpePeRecDataCs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00404ProductType(CONSTANTS.SPACE);
                     setIp00404Endpoint(0);
         setIp00404Country(CONSTANTS.SPACE_3);
                     setIp00404CountryNum(0);
          getIp00404RegionSubreg().initialize();
     
         setIp00404ProductClass(CONSTANTS.SPACE_3);
         setIp00404TranRoutingInd(CONSTANTS.SPACE);
         setIp00404PrsProdReassgnSw(CONSTANTS.SPACE);
         setIp00404ProdReassignmentSw(CONSTANTS.SPACE);
         setIp00404OptInFlag(CONSTANTS.SPACE);
         setIp00404LicensedProdId(CONSTANTS.SPACE_3);
         setIp00404VirtFundPanInd(CONSTANTS.SPACE);
         setIp00404AcctCatgPartSw(CONSTANTS.SPACE);
                     setIp00404AcctCatgActvnDate(0);
          getIp00404CardHldrBlngCur().initialize();
     
         setIp00404ChipConversionSw(CONSTANTS.SPACE);
          getIp00404FloorExpiryDate().initialize();
     
         setIp00404CoBrandSw(CONSTANTS.SPACE);
         setIp00404SpendControlRcnSw(CONSTANTS.SPACE);
         setIp00404MerchCleanServPart(CONSTANTS.SPACE_3);
                     setIp00404MerchCleanActvDate(0);
         setIp00404PaypassEnabledInd(CONSTANTS.SPACE);
         setIp00404RateTypeIndicator(CONSTANTS.SPACE);
         setIp00404RoutePsnIndicator(CONSTANTS.SPACE);
         setIp00404CbwpIndicator(CONSTANTS.SPACE);
         setIp00404FlexParticipInd(CONSTANTS.SPACE);
         setIp00404RepwrRldInd(CONSTANTS.SPACE);
         setIp00404MoneySendInd(CONSTANTS.SPACE);
         setIp00404RegulatedRateIndSw(CONSTANTS.SPACE);
         setIp00404CashAccessSw(CONSTANTS.SPACE);
                     setIp00404PersonPresentInd(0);
         setIp00404CrossBdrException(CONSTANTS.SPACE);
         setIp00404IssTargetMarketInd(CONSTANTS.SPACE);
         setIp00404PostDateServSw(CONSTANTS.SPACE);
         setIp00404MealVoucherInd(CONSTANTS.SPACE);
         setIp00404NonRldblPrpdSw(CONSTANTS.SPACE_2);
         setIp00404FasterFundsInd(CONSTANTS.SPACE);
         setIp00404AnonPrepaidInd(CONSTANTS.SPACE);
         setIp00404DccStatusInd(CONSTANTS.SPACE);
         setIp00404PayByAcctInd(CONSTANTS.SPACE);
         setIp00404IssGamParticipSw(CONSTANTS.SPACE);
         setIp00404MemberFiller(CONSTANTS.SPACE_12);
         setIp00404ChbConvExclId(CONSTANTS.SPACE);
                     setIp00404ChbConvExclExpire(0);
         setIp00404HardshipIndicator(CONSTANTS.SPACE);
                     setIp00404HardshipEffective(0);
                     setIp00404HardshipExpiration(0);
         setIp00404GamingCountrySw(CONSTANTS.SPACE);
                     setIp00404CrossBorderInd(0);
         setIp00404RecPaymtCanSw(CONSTANTS.SPACE);
         setIp00404DomDbtParticipSw(CONSTANTS.SPACE);
          getIp00404GrpCode().initialize();
     
         setIp00404IpcFraudCtlSw(CONSTANTS.SPACE);
         setIp00404IccrParticipInd(CONSTANTS.SPACE);
         setIp00404RevCreditInd(CONSTANTS.SPACE);
         setIp00404ChgbkBkoutInd(CONSTANTS.SPACE);
         setIp00404RtnTrnstNum(CONSTANTS.SPACE_10);
                     setIp00404TrueIssuerIca(0);
         setIp00404MerchantTaxIdSw(CONSTANTS.SPACE);
         setIp00404InstallServSw(CONSTANTS.SPACE);
         setIp00404TokenServiceInd(CONSTANTS.SPACE);
         setIp00404GbsBillInd(CONSTANTS.SPACE);
         setIp00404InstallAuthSw(CONSTANTS.SPACE);
         setIp00404SeqServiceInd(CONSTANTS.SPACE);
         setIp00404CbfmParticipInd(CONSTANTS.SPACE);
         setIp00404CbcmParticipInd(CONSTANTS.SPACE);
         setIp00404CbfmDccSw(CONSTANTS.SPACE);
         setIp00404InstApiGcmsSw(CONSTANTS.SPACE);
         setIp00404InsEnabApiInd(CONSTANTS.SPACE);
         setIp00404InstApiUiSw(CONSTANTS.SPACE);
         setIp00404Filler(CONSTANTS.SPACE);
         setIp00404OboServiceInd(CONSTANTS.SPACE);
         setIp00404MultCurrSw(CONSTANTS.SPACE);
                     setIp00404AnonIndEffDate(0);
         setIp00404CbfmEcbRateParInd(CONSTANTS.SPACE);
         setIp00404AlmXbOptOutInd(CONSTANTS.SPACE);
         setIp00404JpnNonmdesTknrngSw(CONSTANTS.SPACE);
   }


}
  
