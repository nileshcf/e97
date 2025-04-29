package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BondBasicSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01BondBasicSegData extends Bdms01BondBasicSegDataSerialized { 
   

								@Getter @Setter private int bdms01BondBasicSegSqlcd;

								@Getter @Setter private BigDecimal msdBondInterestRate = BigDecimal.ZERO;
				@Getter @Setter private MsdBondMaturityMmddccyy msdBondMaturityMmddccyy = new MsdBondMaturityMmddccyy();
				@Getter @Setter private MsdBondCouponMmdd msdBondCouponMmdd = new MsdBondCouponMmdd();

						@Getter @Setter private char[] bdms01DateCouponCd = Field.fillLowValue(4);
				@Getter @Setter private MsdBondDatedMmddyycc msdBondDatedMmddyycc = new MsdBondDatedMmddyycc();
				@Getter @Setter private MsdBondRecordMmddyycc msdBondRecordMmddyycc = new MsdBondRecordMmddyycc();

						@Getter @Setter private char[] msdBondDatedIndicator = Field.fillLowValue(1);

						@Getter @Setter private char[] msdStateCode = Field.fillLowValue(2);

						@Getter @Setter private char[] msdInsuranceCode = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01InsJjkCd = Field.fillLowValue(2);

						@Getter @Setter private char[] msdBondGuaranteedInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdBndEvalueCode = Field.fillLowValue(1);
				@Getter @Setter private MsdBondPayMmddyycc msdBondPayMmddyycc = new MsdBondPayMmddyycc();

						@Getter @Setter private char[] msdBondActualPayDate = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01DatePayActualCd = Field.fillLowValue(4);

								@Getter @Setter private long msdBondFirstCpnDt;

						@Getter @Setter private char[] bdms01FrqncRateChgCd = Field.fillLowValue(2);
				@Getter @Setter private Bdms01FrqncRateChgCdRedefined bdms01FrqncRateChgCdRedefined = new Bdms01FrqncRateChgCdRedefined();

						@Getter @Setter private char[] bdms01MaturityDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01AccrueIntDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PayInterestDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01CouponFirstDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01CalcYldIntCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RecordHldEstDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PrdLongShortCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ExtCallInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdExtraordinaryCall = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ChngRateCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MuniMultInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SbaInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TaxExmptBankInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01StrpdBondInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DefaultInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SerialBondNbr = Field.fillLowValue(7);

						@Getter @Setter private char[] bdms01InterestPayCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01NbrDayPayCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01CmrlBondCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01TypeGovtCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01StateCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01GovtBackCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01TypePaperCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PymntArreasInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RdmptPrtlCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01OrgnlIntPayDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01EvltnBondCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RefundReasonCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01CanadaBondInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ErbndInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CallTypeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01TypeMuniCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01AgencyInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TiisInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01IntCalcnCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01AstBckdCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01GnmaSrlNoteInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TraceInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TbaInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal bdms01MnmmDnmntAmt = BigDecimal.ZERO;

								@Getter @Setter private int bdms01ClNoticeDaysNbr;

						@Getter @Setter private char[] bdms01SinkingFundInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DefeaseInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RvnuInd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal bdms01CvrsnRt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bdms01CvrsnPrcAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01CvrsnExpDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01BondBasicSegData
	**/
    public Bdms01BondBasicSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01BondBasicSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondBasicSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdBondMaturityMmddccyy().setParent(this,getStartOffset() + 15);
					getMsdBondCouponMmdd().setParent(this,getStartOffset() + 23);
					getMsdBondDatedMmddyycc().setParent(this,getStartOffset() + 27);
					getMsdBondRecordMmddyycc().setParent(this,getStartOffset() + 35);
					getMsdBondPayMmddyycc().setParent(this,getStartOffset() + 50);
					getBdms01FrqncRateChgCdRedefined().setParent(this,getStartOffset() + 68);
    } 

	/**
	 * 	initializes Bdms01BondBasicSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondBasicSegSqlcd(0);
			setMsdBondInterestRate(BigDecimal.ZERO);
          getMsdBondMaturityMmddccyy().initialize();
     
          getMsdBondCouponMmdd().initialize();
     
          getMsdBondDatedMmddyycc().initialize();
     
          getMsdBondRecordMmddyycc().initialize();
     
         setMsdBondDatedIndicator(CONSTANTS.SPACE);
         setMsdStateCode(CONSTANTS.SPACE_2);
         setMsdInsuranceCode(CONSTANTS.SPACE_2);
         setMsdBondGuaranteedInd(CONSTANTS.SPACE);
         setMsdBndEvalueCode(CONSTANTS.SPACE);
          getMsdBondPayMmddyycc().initialize();
     
         setMsdBondActualPayDate(CONSTANTS.SPACE_4);
                     setMsdBondFirstCpnDt(0);
         setBdms01FrqncRateChgCd(CONSTANTS.SPACE_2);
         setBdms01MaturityDt(CONSTANTS.SPACE_10);
         setBdms01AccrueIntDt(CONSTANTS.SPACE_10);
         setBdms01PayInterestDt(CONSTANTS.SPACE_10);
         setBdms01CouponFirstDt(CONSTANTS.SPACE_10);
         setBdms01CalcYldIntCd(CONSTANTS.SPACE);
         setBdms01RecordHldEstDt(CONSTANTS.SPACE_10);
         setBdms01PrdLongShortCd(CONSTANTS.SPACE);
         setBdms01ExtCallInd(CONSTANTS.SPACE);
         setBdms01ChngRateCd(CONSTANTS.SPACE);
         setBdms01MuniMultInd(CONSTANTS.SPACE);
         setBdms01SbaInd(CONSTANTS.SPACE);
         setBdms01TaxExmptBankInd(CONSTANTS.SPACE);
         setBdms01StrpdBondInd(CONSTANTS.SPACE);
         setBdms01DefaultInd(CONSTANTS.SPACE);
         setBdms01SerialBondNbr(CONSTANTS.SPACE_7);
         setBdms01InterestPayCd(CONSTANTS.SPACE_2);
         setBdms01NbrDayPayCd(CONSTANTS.SPACE_4);
         setBdms01CmrlBondCd(CONSTANTS.SPACE_2);
         setBdms01TypeGovtCd(CONSTANTS.SPACE_2);
         setBdms01StateCd(CONSTANTS.SPACE_2);
         setBdms01GovtBackCd(CONSTANTS.SPACE_2);
         setBdms01TypePaperCd(CONSTANTS.SPACE_2);
         setBdms01PymntArreasInd(CONSTANTS.SPACE);
         setBdms01RdmptPrtlCd(CONSTANTS.SPACE_2);
         setBdms01OrgnlIntPayDt(CONSTANTS.SPACE_10);
         setBdms01EvltnBondCd(CONSTANTS.SPACE_2);
         setBdms01RefundReasonCd(CONSTANTS.SPACE_2);
         setBdms01CanadaBondInd(CONSTANTS.SPACE);
         setBdms01ErbndInd(CONSTANTS.SPACE);
         setBdms01CallTypeCd(CONSTANTS.SPACE_2);
         setBdms01TypeMuniCd(CONSTANTS.SPACE_4);
         setBdms01AgencyInd(CONSTANTS.SPACE);
         setBdms01TiisInd(CONSTANTS.SPACE);
         setBdms01IntCalcnCd(CONSTANTS.SPACE_4);
         setBdms01AstBckdCd(CONSTANTS.SPACE_2);
         setBdms01GnmaSrlNoteInd(CONSTANTS.SPACE);
         setBdms01TraceInd(CONSTANTS.SPACE);
         setBdms01TbaInd(CONSTANTS.SPACE);
			setBdms01MnmmDnmntAmt(BigDecimal.ZERO);
                     setBdms01ClNoticeDaysNbr(0);
         setBdms01SinkingFundInd(CONSTANTS.SPACE);
         setBdms01DefeaseInd(CONSTANTS.SPACE);
         setBdms01RvnuInd(CONSTANTS.SPACE);
			setBdms01CvrsnRt(BigDecimal.ZERO);
			setBdms01CvrsnPrcAmt(BigDecimal.ZERO);
         setBdms01CvrsnExpDt(CONSTANTS.SPACE_10);
   }


}
  
