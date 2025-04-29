package com.cloudframe.app.comput5.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int biorptvlBatParmValNum;

						@Getter @Setter private char[] wvGeneralParm = Field.fillLowValue(80);

								@Getter @Setter private BigDecimal axisWpCoiAccum = BigDecimal.ZERO;

								@Getter @Setter private int axisWpCoiRound;

								@Getter @Setter private char[] axisWpCoiRoundDisp = Field.fillLowValue(10);

								@Getter @Setter private short wlilhI;

								@Getter @Setter private BigDecimal wlilhAccLoanAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wlilhAccLoanAndIntAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wlilhPrvRt = BigDecimal.ZERO;

								@Getter @Setter private int l1680TotalDays;

								@Getter @Setter private BigDecimal w6530PvIntPmtAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w6530CfAdjustedAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w6530CfIntRt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w6530MktvalIntRt = BigDecimal.ZERO;

								@Getter @Setter private int w6530MktvalAdjYears;

								@Getter @Setter private BigDecimal w6530PvMatPmtAmt = BigDecimal.ZERO;

								@Getter @Setter private char[] w6530PvIntPmtAmtDis = Field.fillLowValue(20);

								@Getter @Setter private char[] w6530PvMatPmtAmtDis = Field.fillLowValue(20);

								@Getter @Setter private BigDecimal wvSumSettlValue = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvSumDexValue = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvCostValue = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal prclcstLatestCostValue = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal prclfcstFnceActualsUsdA = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvPrtQuantity = BigDecimal.ZERO;

								@Getter @Setter private char[] wpCurrUnitDayN = Field.fillLowValue(12);

								@Getter @Setter private char[] wpUsdValue = Field.fillLowValue(12);

								@Getter @Setter private BigDecimal wvNumericOutput = BigDecimal.ZERO;

								@Getter @Setter private short wvMaxIntDigits;

								@Getter @Setter private short wvMaxDecDigits;

								@Getter @Setter private short wvIntCtr;

								@Getter @Setter private short wvDecCtr;

								@Getter @Setter private short wvSignCtr;

								@Getter @Setter private short wvCommaCtr;

								@Getter @Setter private short wvFldsFilled;

								@Getter @Setter private short wvStartPosn;

								@Getter @Setter private short wvCommaNdx;

								@Getter @Setter private short wvToNdx;

								@Getter @Setter private short wvFromNdx;

						@Getter @Setter private char[] wvDltr1 = Field.fillLowValue(1);

							@Getter @Setter private char[] filler = fillLowValue(1);

							@Getter @Setter private char[] filler01 = fillLowValue(1);

							@Getter @Setter private char[] filler02 = fillLowValue(1);

							@Getter @Setter private char[] filler03 = fillLowValue(1);

								@Getter @Setter private short wvExposureCount;

								@Getter @Setter private short wvSeqNum;

								@Getter @Setter private char[] wvKbblVol = Field.fillLowValue(14);

								@Getter @Setter private BigDecimal prclexpKbblVol = BigDecimal.ZERO;

								@Getter @Setter private char[] wxUserQuantity = Field.fillLowValue(19);

								@Getter @Setter private char[] wpFmseLmtKtN = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal trdgauthQuantityAuthA = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvBtfFactor = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvDBblVol = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvDBarrels = BigDecimal.ZERO;

								@Getter @Setter private char[] wpDBarrels = Field.fillLowValue(20);

								@Getter @Setter private BigDecimal wvDMtAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvEffWeightPc = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal dealgpalAllocWgtnNum = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal parcelBblVol = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvDQty = BigDecimal.ZERO;

								@Getter @Setter private char[] wpDQty = Field.fillLowValue(19);

								@Getter @Setter private BigDecimal wvMmbConv = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvDTonnes = BigDecimal.ZERO;

								@Getter @Setter private int wvExposureInt;

								@Getter @Setter private BigDecimal wvExposureAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvUsdBblVariance = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvOrigCost = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvLtstCost = BigDecimal.ZERO;

								@Getter @Setter private char[] wvExtrBblVar = Field.fillLowValue(14);

								@Getter @Setter private BigDecimal wvUsdVariance = BigDecimal.ZERO;

								@Getter @Setter private char[] wvExtrUsdVar = Field.fillLowValue(10);

								@Getter @Setter private int idx;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
