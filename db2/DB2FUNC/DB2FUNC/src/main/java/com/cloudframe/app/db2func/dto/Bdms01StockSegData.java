package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01StockSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01StockSegData extends Bdms01StockSegDataSerialized { 
   

								@Getter @Setter private int bdms01StockSegSqlcd;

								@Getter @Setter private long msdSharesOuts;

								@Getter @Setter private BigDecimal msdEarnPerShr = BigDecimal.ZERO;

						@Getter @Setter private char[] msdEarnPerShrSign = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal msdEstimatedDiv = BigDecimal.ZERO;

								@Getter @Setter private long msdStkProxyMtngDt;

								@Getter @Setter private long msdStkProxyRecDt;
				@Getter @Setter private MsdWrntsExpMmddccyy msdWrntsExpMmddccyy = new MsdWrntsExpMmddccyy();

						@Getter @Setter private char[] msdPoisonPillInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MeetingProxyDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01RecordProxyDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01StkExpirationDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01MasterLtdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdMlp = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MmfInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OpenFundCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01LotTradeCd = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal bdms01DvdndYldAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bdms01ExpirationAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01AdrInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01GdrInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PsnplCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01PrfrdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DivCumInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FreqIncmDebtCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01CallDt = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal bdms01CallAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bdms01DvdndAnnlAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bdms01DvdndAnnlPct = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01PrtcpInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01VoteRghtsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ScrtyAdpRstrNbr = Field.fillLowValue(7);

						@Getter @Setter private char[] bdms01UtsCanadianCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01WarrantsIndexInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdMidsQids = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01EtfInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SmallCptlInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ExmptUptckInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RegShoElgblInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RegShoElgblDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01MfFamilyNbr = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01ShrClassCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RegShoInelgblDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01MfLoadTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01EqiContraInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OtcBlltnFeeInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01StockSegData
	**/
    public Bdms01StockSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01StockSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01StockSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdWrntsExpMmddccyy().setParent(this,getStartOffset() + 64);
    } 

	/**
	 * 	initializes Bdms01StockSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01StockSegSqlcd(0);
                     setMsdSharesOuts(0);
			setMsdEarnPerShr(BigDecimal.ZERO);
         setMsdEarnPerShrSign(CONSTANTS.SPACE);
			setMsdEstimatedDiv(BigDecimal.ZERO);
                     setMsdStkProxyMtngDt(0);
                     setMsdStkProxyRecDt(0);
          getMsdWrntsExpMmddccyy().initialize();
     
         setMsdPoisonPillInd(CONSTANTS.SPACE);
         setBdms01MeetingProxyDt(CONSTANTS.SPACE_10);
         setBdms01RecordProxyDt(CONSTANTS.SPACE_10);
         setBdms01StkExpirationDt(CONSTANTS.SPACE_10);
         setBdms01MasterLtdInd(CONSTANTS.SPACE);
         setBdms01MmfInd(CONSTANTS.SPACE);
         setBdms01OpenFundCd(CONSTANTS.SPACE);
         setBdms01LotTradeCd(CONSTANTS.SPACE_2);
			setBdms01DvdndYldAmt(BigDecimal.ZERO);
			setBdms01ExpirationAmt(BigDecimal.ZERO);
         setBdms01AdrInd(CONSTANTS.SPACE);
         setBdms01GdrInd(CONSTANTS.SPACE);
         setBdms01PsnplCd(CONSTANTS.SPACE_3);
         setBdms01PrfrdInd(CONSTANTS.SPACE);
         setBdms01DivCumInd(CONSTANTS.SPACE);
         setBdms01FreqIncmDebtCd(CONSTANTS.SPACE_2);
         setBdms01CallDt(CONSTANTS.SPACE_10);
			setBdms01CallAmt(BigDecimal.ZERO);
			setBdms01DvdndAnnlAmt(BigDecimal.ZERO);
			setBdms01DvdndAnnlPct(BigDecimal.ZERO);
         setBdms01PrtcpInd(CONSTANTS.SPACE);
         setBdms01VoteRghtsInd(CONSTANTS.SPACE);
         setBdms01ScrtyAdpRstrNbr(CONSTANTS.SPACE_7);
         setBdms01UtsCanadianCd(CONSTANTS.SPACE);
         setBdms01WarrantsIndexInd(CONSTANTS.SPACE);
         setMsdMidsQids(CONSTANTS.SPACE);
         setBdms01EtfInd(CONSTANTS.SPACE);
         setBdms01SmallCptlInd(CONSTANTS.SPACE);
         setBdms01ExmptUptckInd(CONSTANTS.SPACE);
         setBdms01RegShoElgblInd(CONSTANTS.SPACE);
         setBdms01RegShoElgblDt(CONSTANTS.SPACE_10);
         setBdms01MfFamilyNbr(CONSTANTS.SPACE_4);
         setBdms01ShrClassCd(CONSTANTS.SPACE);
         setBdms01RegShoInelgblDt(CONSTANTS.SPACE_10);
         setBdms01MfLoadTypeCd(CONSTANTS.SPACE);
         setBdms01EqiContraInd(CONSTANTS.SPACE);
         setBdms01OtcBlltnFeeInd(CONSTANTS.SPACE);
   }


}
  
