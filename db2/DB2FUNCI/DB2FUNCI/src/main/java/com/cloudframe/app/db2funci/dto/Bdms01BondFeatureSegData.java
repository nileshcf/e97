package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BondFeatureSegData is used to handle fields declared in it
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
public class Bdms01BondFeatureSegData extends Bdms01BondFeatureSegDataSerialized { 
   

								@Getter @Setter private int bdms01BondFeatureSegSqlcd;
				@Getter @Setter private MsdBondCallMmddyycc msdBondCallMmddyycc = new MsdBondCallMmddyycc();

								@Getter @Setter private BigDecimal msdBondCallPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01CallRateBondDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01CallTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CallFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01CallRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01CallSelectionBondCd = Field.fillLowValue(2);
				@Getter @Setter private MsdBondPutMmddyycc msdBondPutMmddyycc = new MsdBondPutMmddyycc();

								@Getter @Setter private BigDecimal msdBondPutPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01PutRateBondDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PutTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] msdBondPutType = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PutFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PutRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PutSelectionBondCd = Field.fillLowValue(2);

								@Getter @Setter private long msdBndPrerefDate;

								@Getter @Setter private BigDecimal msdBndPrerefPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01PrerefRateBondDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PrefTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PrefFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PrefRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PrefSelectionBondCd = Field.fillLowValue(2);

								@Getter @Setter private long msdBondParCallDate;

								@Getter @Setter private BigDecimal msdBondParCallPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01PcRateBondDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PcTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PcFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PcRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PcSelectionBondCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01BndRefundDate = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal bdms01BndRefundPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01RfTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RfFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RfRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RfSelectionBondCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01AddtlPutDate = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal bdms01AddtlPutPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01PaTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PaFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PaRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PaSelectionBondCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01BndOfferingDate = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal bdms01BndOfferingPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01ExTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ExFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01ExRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01ExSelectionBondCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01BndRetractDate = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal bdms01BndRetractPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01RtTypePutCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RtFeatureFrqncCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RtRdmptPartialCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RtSelectionBondCd = Field.fillLowValue(2);

	
	/**
	* Constructor for Bdms01BondFeatureSegData
	**/
    public Bdms01BondFeatureSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01BondFeatureSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondFeatureSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdBondCallMmddyycc().setParent(this,getStartOffset() + 4);
					getMsdBondPutMmddyycc().setParent(this,getStartOffset() + 47);
    } 

	/**
	 * 	initializes Bdms01BondFeatureSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondFeatureSegSqlcd(0);
          getMsdBondCallMmddyycc().initialize();
     
			setMsdBondCallPrice(BigDecimal.ZERO);
         setBdms01CallRateBondDt(CONSTANTS.SPACE_10);
         setBdms01CallTypePutCd(CONSTANTS.SPACE);
         setBdms01CallFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01CallRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01CallSelectionBondCd(CONSTANTS.SPACE_2);
          getMsdBondPutMmddyycc().initialize();
     
			setMsdBondPutPrice(BigDecimal.ZERO);
         setBdms01PutRateBondDt(CONSTANTS.SPACE_10);
         setBdms01PutTypePutCd(CONSTANTS.SPACE);
         setBdms01PutFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PutRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PutSelectionBondCd(CONSTANTS.SPACE_2);
                     setMsdBndPrerefDate(0);
			setMsdBndPrerefPrice(BigDecimal.ZERO);
         setBdms01PrerefRateBondDt(CONSTANTS.SPACE_10);
         setBdms01PrefTypePutCd(CONSTANTS.SPACE);
         setBdms01PrefFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PrefRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PrefSelectionBondCd(CONSTANTS.SPACE_2);
                     setMsdBondParCallDate(0);
			setMsdBondParCallPrice(BigDecimal.ZERO);
         setBdms01PcRateBondDt(CONSTANTS.SPACE_10);
         setBdms01PcTypePutCd(CONSTANTS.SPACE);
         setBdms01PcFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PcRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PcSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01BndRefundDate(CONSTANTS.SPACE_10);
			setBdms01BndRefundPrice(BigDecimal.ZERO);
         setBdms01RfTypePutCd(CONSTANTS.SPACE);
         setBdms01RfFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01RfRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01RfSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01AddtlPutDate(CONSTANTS.SPACE_10);
			setBdms01AddtlPutPrice(BigDecimal.ZERO);
         setBdms01PaTypePutCd(CONSTANTS.SPACE);
         setBdms01PaFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01PaRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01PaSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01BndOfferingDate(CONSTANTS.SPACE_10);
			setBdms01BndOfferingPrice(BigDecimal.ZERO);
         setBdms01ExTypePutCd(CONSTANTS.SPACE);
         setBdms01ExFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01ExRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01ExSelectionBondCd(CONSTANTS.SPACE_2);
         setBdms01BndRetractDate(CONSTANTS.SPACE_10);
			setBdms01BndRetractPrice(BigDecimal.ZERO);
         setBdms01RtTypePutCd(CONSTANTS.SPACE);
         setBdms01RtFeatureFrqncCd(CONSTANTS.SPACE_2);
         setBdms01RtRdmptPartialCd(CONSTANTS.SPACE_2);
         setBdms01RtSelectionBondCd(CONSTANTS.SPACE_2);
   }


}
  
