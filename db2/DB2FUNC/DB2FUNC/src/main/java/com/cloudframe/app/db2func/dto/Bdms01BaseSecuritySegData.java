package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01BaseSecuritySegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01BaseSecuritySegData extends Bdms01BaseSecuritySegDataSerialized { 
   

								@Getter @Setter private int bdms01BaseSecuritySegSqlcd;

						@Getter @Setter private char[] msdIndustrialClass = Field.fillLowValue(2);

						@Getter @Setter private char[] msdAidsCode = Field.fillLowValue(1);

								@Getter @Setter private long msdStkDailyVolume;

								@Getter @Setter private long msdDailyVolume;

						@Getter @Setter private char[] msdTaxCode = Field.fillLowValue(1);

						@Getter @Setter private char[] msdMarginCode = Field.fillLowValue(1);

								@Getter @Setter private long msdRedenominationDate;

						@Getter @Setter private char[] msdBndRemicInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdBndRemicReitInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdCurrencyCode = Field.fillLowValue(3);

						@Getter @Setter private char[] msdCurrencyCode1 = Field.fillLowValue(3);

						@Getter @Setter private char[] msdIssueCurrencyPrev = Field.fillLowValue(3);

								@Getter @Setter private int msdIncomeDistPoint;

						@Getter @Setter private char[] msdSicCode = Field.fillLowValue(4);

						@Getter @Setter private char[] msdProprietaryCode = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SecurityParsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MarginableLstInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MarginableOtcInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TaxableCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ConvInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CnsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01R144aInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msd144a = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OptionInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DllrUsTradeInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BasSecCurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01ErclrInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CedelInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01IssueDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01ReitInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RemicInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RoyaltyInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01IbmCd = Field.fillLowValue(6);

						@Getter @Setter private char[] bdms01CanadaProductCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01ForeignInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01IssueWhenInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01InvstDrctInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CurrencyLegacyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RedenominationDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01OatsNasdaqCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01StepBondInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PhlyBltmExchInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ChgoExchInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BstnExchInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PcfcExchInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MadoffInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PinkSheetInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01NaicsCd = Field.fillLowValue(6);

						@Getter @Setter private char[] bdms01LlcInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal bdms01YieldBidPct = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01IntPyngInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TleBypassInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01QlfdOvrdDvdCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PutStrtDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PutTmngCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CallTmngCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OtcBlltnStkInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01BaseSecuritySegData
	**/
    public Bdms01BaseSecuritySegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01BaseSecuritySegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BaseSecuritySegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01BaseSecuritySegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BaseSecuritySegSqlcd(0);
         setMsdIndustrialClass(CONSTANTS.SPACE_2);
         setMsdAidsCode(CONSTANTS.SPACE);
                     setMsdStkDailyVolume(0);
         setMsdTaxCode(CONSTANTS.SPACE);
         setMsdMarginCode(CONSTANTS.SPACE);
                     setMsdRedenominationDate(0);
         setMsdBndRemicInd(CONSTANTS.SPACE);
         setMsdCurrencyCode(CONSTANTS.SPACE_3);
         setMsdIssueCurrencyPrev(CONSTANTS.SPACE_3);
                     setMsdIncomeDistPoint(0);
         setMsdSicCode(CONSTANTS.SPACE_4);
         setMsdProprietaryCode(CONSTANTS.SPACE_2);
         setBdms01SecurityParsInd(CONSTANTS.SPACE);
         setBdms01MarginableLstInd(CONSTANTS.SPACE);
         setBdms01MarginableOtcInd(CONSTANTS.SPACE);
         setBdms01TaxableCd(CONSTANTS.SPACE);
         setBdms01ConvInd(CONSTANTS.SPACE);
         setBdms01CnsInd(CONSTANTS.SPACE);
         setBdms01R144aInd(CONSTANTS.SPACE);
         setBdms01OptionInd(CONSTANTS.SPACE);
         setBdms01DllrUsTradeInd(CONSTANTS.SPACE);
         setBdms01BasSecCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01ErclrInd(CONSTANTS.SPACE);
         setBdms01CedelInd(CONSTANTS.SPACE);
         setBdms01IssueDt(CONSTANTS.SPACE_10);
         setBdms01ReitInd(CONSTANTS.SPACE);
         setBdms01RemicInd(CONSTANTS.SPACE);
         setBdms01RoyaltyInd(CONSTANTS.SPACE);
         setBdms01IbmCd(CONSTANTS.SPACE_6);
         setBdms01CanadaProductCd(CONSTANTS.SPACE_3);
         setBdms01ForeignInd(CONSTANTS.SPACE);
         setBdms01IssueWhenInd(CONSTANTS.SPACE);
         setBdms01InvstDrctInd(CONSTANTS.SPACE);
         setBdms01CurrencyLegacyCd(CONSTANTS.SPACE_2);
         setBdms01RedenominationDt(CONSTANTS.SPACE_10);
         setBdms01OatsNasdaqCd(CONSTANTS.SPACE);
         setBdms01StepBondInd(CONSTANTS.SPACE);
         setBdms01PhlyBltmExchInd(CONSTANTS.SPACE);
         setBdms01ChgoExchInd(CONSTANTS.SPACE);
         setBdms01BstnExchInd(CONSTANTS.SPACE);
         setBdms01PcfcExchInd(CONSTANTS.SPACE);
         setBdms01MadoffInd(CONSTANTS.SPACE);
         setBdms01PinkSheetInd(CONSTANTS.SPACE);
         setBdms01NaicsCd(CONSTANTS.SPACE_6);
         setBdms01LlcInd(CONSTANTS.SPACE);
			setBdms01YieldBidPct(BigDecimal.ZERO);
         setBdms01IntPyngInd(CONSTANTS.SPACE);
         setBdms01TleBypassInd(CONSTANTS.SPACE);
         setBdms01QlfdOvrdDvdCd(CONSTANTS.SPACE);
         setBdms01PutStrtDt(CONSTANTS.SPACE_10);
         setBdms01PutTmngCd(CONSTANTS.SPACE);
         setBdms01CallTmngCd(CONSTANTS.SPACE);
         setBdms01OtcBlltnStkInd(CONSTANTS.SPACE);
   }


}
  
