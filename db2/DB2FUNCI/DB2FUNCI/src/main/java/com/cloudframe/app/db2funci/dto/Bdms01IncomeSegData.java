package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01IncomeSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01IncomeSegData extends Bdms01IncomeSegDataSerialized { 
   

								@Getter @Setter private int bdms01IncomeSegSqlcd;

						@Getter @Setter private char[] msdDividendType = Field.fillLowValue(1);

						@Getter @Setter private char[] msdPaymentFreq = Field.fillLowValue(1);
				@Getter @Setter private MsdCashDivRec1Mmddyycc msdCashDivRec1Mmddyycc = new MsdCashDivRec1Mmddyycc();

								@Getter @Setter private BigDecimal msdCashDivRate1 = BigDecimal.ZERO;
				@Getter @Setter private MsdCashDivEx1Mmddyycc msdCashDivEx1Mmddyycc = new MsdCashDivEx1Mmddyycc();
				@Getter @Setter private MsdCashDivPay1Mmddyycc msdCashDivPay1Mmddyycc = new MsdCashDivPay1Mmddyycc();

						@Getter @Setter private char[] bdms01Cash1RecordDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01Cash1PaymentDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01Cash1ExdividendDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01Cash1FrqncPayCd = Field.fillLowValue(2);

								@Getter @Setter private int bdms01Cash1DayTkffGnrtQty;

						@Getter @Setter private char[] bdms01Cash1AssetLiqnInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Cash1CurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01Cash1VendorCd = Field.fillLowValue(5);

						@Getter @Setter private char[] bdms01Cash1TypeIncomeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01Cash1PayFrctnShrInd = Field.fillLowValue(1);
				@Getter @Setter private MsdCashDivRec2Mmddyycc msdCashDivRec2Mmddyycc = new MsdCashDivRec2Mmddyycc();

								@Getter @Setter private BigDecimal msdCashDivRate2 = BigDecimal.ZERO;
				@Getter @Setter private MsdCashDivEx2Mmddyycc msdCashDivEx2Mmddyycc = new MsdCashDivEx2Mmddyycc();
				@Getter @Setter private MsdCashDivPay2Mmddyycc msdCashDivPay2Mmddyycc = new MsdCashDivPay2Mmddyycc();

						@Getter @Setter private char[] bdms01Cash2RecordDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01Cash2PaymentDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01Cash2ExdividendDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01Cash2FrqncPayCd = Field.fillLowValue(2);

								@Getter @Setter private int bdms01Cash2DayTkffGnrtQty;

						@Getter @Setter private char[] bdms01Cash2AssetLiqnInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01Cash2CurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01Cash2VendorCd = Field.fillLowValue(5);

						@Getter @Setter private char[] bdms01Cash2TypeIncomeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01Cash2PayFrctnShrInd = Field.fillLowValue(1);
				@Getter @Setter private MsdStockDivRecMmddyycc msdStockDivRecMmddyycc = new MsdStockDivRecMmddyycc();

								@Getter @Setter private BigDecimal msdStockDivRate = BigDecimal.ZERO;
				@Getter @Setter private MsdStockDivExMmddyycc msdStockDivExMmddyycc = new MsdStockDivExMmddyycc();
				@Getter @Setter private MsdStockDivPayMmddyycc msdStockDivPayMmddyycc = new MsdStockDivPayMmddyycc();

						@Getter @Setter private char[] bdms01StockRecordDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01StockPaymentDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01StockExdividendDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01StockFrqncPayCd = Field.fillLowValue(2);

								@Getter @Setter private int bdms01StockDayTkffGnrtQty;

						@Getter @Setter private char[] bdms01StockAssetLiqnInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01StockCurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01StockVendorCd = Field.fillLowValue(5);

						@Getter @Setter private char[] bdms01StockTypeIncomeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01StockPayFrctnShrInd = Field.fillLowValue(1);
				@Getter @Setter private MsdSplitDivRecMmddyycc msdSplitDivRecMmddyycc = new MsdSplitDivRecMmddyycc();

								@Getter @Setter private BigDecimal msdSplitDivRate = BigDecimal.ZERO;
				@Getter @Setter private MsdSplitDivExMmddyycc msdSplitDivExMmddyycc = new MsdSplitDivExMmddyycc();
				@Getter @Setter private MsdSplitDivPayMmddyycc msdSplitDivPayMmddyycc = new MsdSplitDivPayMmddyycc();

						@Getter @Setter private char[] bdms01SplitRecordDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01SplitPaymentDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01SplitExdividendDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01SplitFrqncPayCd = Field.fillLowValue(2);

								@Getter @Setter private int bdms01SplitDayTkffGnrtQty;

						@Getter @Setter private char[] bdms01SplitAssetLiqnInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SplitCurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SplitVendorCd = Field.fillLowValue(5);

						@Getter @Setter private char[] bdms01SplitTypeIncomeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SplitPayFrctnShrInd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdSplitRightInd = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01IncomeSegData
	**/
    public Bdms01IncomeSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01IncomeSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01IncomeSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdCashDivRec1Mmddyycc().setParent(this,getStartOffset() + 6);
					getMsdCashDivEx1Mmddyycc().setParent(this,getStartOffset() + 29);
					getMsdCashDivPay1Mmddyycc().setParent(this,getStartOffset() + 37);
					getMsdCashDivRec2Mmddyycc().setParent(this,getStartOffset() + 89);
					getMsdCashDivEx2Mmddyycc().setParent(this,getStartOffset() + 112);
					getMsdCashDivPay2Mmddyycc().setParent(this,getStartOffset() + 120);
					getMsdStockDivRecMmddyycc().setParent(this,getStartOffset() + 172);
					getMsdStockDivExMmddyycc().setParent(this,getStartOffset() + 195);
					getMsdStockDivPayMmddyycc().setParent(this,getStartOffset() + 203);
					getMsdSplitDivRecMmddyycc().setParent(this,getStartOffset() + 255);
					getMsdSplitDivExMmddyycc().setParent(this,getStartOffset() + 278);
					getMsdSplitDivPayMmddyycc().setParent(this,getStartOffset() + 286);
    } 

	/**
	 * 	initializes Bdms01IncomeSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01IncomeSegSqlcd(0);
         setMsdDividendType(CONSTANTS.SPACE);
         setMsdPaymentFreq(CONSTANTS.SPACE);
          getMsdCashDivRec1Mmddyycc().initialize();
     
			setMsdCashDivRate1(BigDecimal.ZERO);
          getMsdCashDivEx1Mmddyycc().initialize();
     
          getMsdCashDivPay1Mmddyycc().initialize();
     
         setBdms01Cash1RecordDt(CONSTANTS.SPACE_10);
         setBdms01Cash1PaymentDt(CONSTANTS.SPACE_10);
         setBdms01Cash1ExdividendDt(CONSTANTS.SPACE_10);
         setBdms01Cash1FrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01Cash1DayTkffGnrtQty(0);
         setBdms01Cash1AssetLiqnInd(CONSTANTS.SPACE);
         setBdms01Cash1CurrencyCd(CONSTANTS.SPACE_2);
         setBdms01Cash1VendorCd(CONSTANTS.SPACE_5);
         setBdms01Cash1TypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01Cash1PayFrctnShrInd(CONSTANTS.SPACE);
          getMsdCashDivRec2Mmddyycc().initialize();
     
			setMsdCashDivRate2(BigDecimal.ZERO);
          getMsdCashDivEx2Mmddyycc().initialize();
     
          getMsdCashDivPay2Mmddyycc().initialize();
     
         setBdms01Cash2RecordDt(CONSTANTS.SPACE_10);
         setBdms01Cash2PaymentDt(CONSTANTS.SPACE_10);
         setBdms01Cash2ExdividendDt(CONSTANTS.SPACE_10);
         setBdms01Cash2FrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01Cash2DayTkffGnrtQty(0);
         setBdms01Cash2AssetLiqnInd(CONSTANTS.SPACE);
         setBdms01Cash2CurrencyCd(CONSTANTS.SPACE_2);
         setBdms01Cash2VendorCd(CONSTANTS.SPACE_5);
         setBdms01Cash2TypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01Cash2PayFrctnShrInd(CONSTANTS.SPACE);
          getMsdStockDivRecMmddyycc().initialize();
     
			setMsdStockDivRate(BigDecimal.ZERO);
          getMsdStockDivExMmddyycc().initialize();
     
          getMsdStockDivPayMmddyycc().initialize();
     
         setBdms01StockRecordDt(CONSTANTS.SPACE_10);
         setBdms01StockPaymentDt(CONSTANTS.SPACE_10);
         setBdms01StockExdividendDt(CONSTANTS.SPACE_10);
         setBdms01StockFrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01StockDayTkffGnrtQty(0);
         setBdms01StockAssetLiqnInd(CONSTANTS.SPACE);
         setBdms01StockCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01StockVendorCd(CONSTANTS.SPACE_5);
         setBdms01StockTypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01StockPayFrctnShrInd(CONSTANTS.SPACE);
          getMsdSplitDivRecMmddyycc().initialize();
     
			setMsdSplitDivRate(BigDecimal.ZERO);
          getMsdSplitDivExMmddyycc().initialize();
     
          getMsdSplitDivPayMmddyycc().initialize();
     
         setBdms01SplitRecordDt(CONSTANTS.SPACE_10);
         setBdms01SplitPaymentDt(CONSTANTS.SPACE_10);
         setBdms01SplitExdividendDt(CONSTANTS.SPACE_10);
         setBdms01SplitFrqncPayCd(CONSTANTS.SPACE_2);
                     setBdms01SplitDayTkffGnrtQty(0);
         setBdms01SplitAssetLiqnInd(CONSTANTS.SPACE);
         setBdms01SplitCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01SplitVendorCd(CONSTANTS.SPACE_5);
         setBdms01SplitTypeIncomeCd(CONSTANTS.SPACE_2);
         setBdms01SplitPayFrctnShrInd(CONSTANTS.SPACE);
         setMsdSplitRightInd(CONSTANTS.SPACE);
   }


}
  
