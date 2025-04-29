package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01InputData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01InputData extends Bdms01InputDataSerialized { 
   

						@Getter @Setter private char[] bdms01Db2Function = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SearchKeyField = Field.fillLowValue(12);
				@Getter @Setter private Bdms01SearchKeyFieldRedefined01 bdms01SearchKeyFieldRedefined01 = new Bdms01SearchKeyFieldRedefined01();
				@Getter @Setter private Bdms01SearchKeyFieldRedefined bdms01SearchKeyFieldRedefined = new Bdms01SearchKeyFieldRedefined();

						@Getter @Setter private char[] bdms01SearchKeyWiCode = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SearchKeyType = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01AdpMasterSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BaseSecuritySegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SecurityTypeSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PriceSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01XrefSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DescSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SpecialistSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FrozenChillSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01IncomeSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RatingSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ConvertibleSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01StockSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OptionSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BondBasicSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BondFeatureSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BondFactorSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BondCmoSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OidSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01UitSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01MortBackedSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01GetpriceSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DivQualifyInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TaxSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01UnitsSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TcontrolSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SecurityPrivSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CvrsnSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CanadaBondSegInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OptUnderlXrefSegInd = Field.fillLowValue(1);


						@Getter @Setter private char[] bdms01ReqPriceRegion = Field.fillLowValue(1);
				@Getter @Setter private Bdms01OsiSymbolCont bdms01OsiSymbolCont = new Bdms01OsiSymbolCont();

						@Getter @Setter private char[] bdms01SearchKeyIsinCntry = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01LogError = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ProgramName = Field.fillLowValue(8);
	
	/**
	* Constructor for Bdms01InputData
	**/
    public Bdms01InputData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01InputData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01InputData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getBdms01SearchKeyFieldRedefined01().setParent(this,getStartOffset() + 1);
					getBdms01SearchKeyFieldRedefined().setParent(this,getStartOffset() + 1);
					getBdms01OsiSymbolCont().setParent(this,getStartOffset() + 74);
    } 

	/**
	 * 	initializes Bdms01InputData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01Db2Function(CONSTANTS.SPACE);
         setBdms01SearchKeyField(CONSTANTS.SPACE_12);
         setBdms01SearchKeyWiCode(CONSTANTS.SPACE);
         setBdms01SearchKeyType(CONSTANTS.SPACE_2);
         setBdms01AdpMasterSegInd(CONSTANTS.SPACE);
         setBdms01BaseSecuritySegInd(CONSTANTS.SPACE);
         setBdms01SecurityTypeSegInd(CONSTANTS.SPACE);
         setBdms01PriceSegInd(CONSTANTS.SPACE);
         setBdms01XrefSegInd(CONSTANTS.SPACE);
         setBdms01DescSegInd(CONSTANTS.SPACE);
         setBdms01SpecialistSegInd(CONSTANTS.SPACE);
         setBdms01FrozenChillSegInd(CONSTANTS.SPACE);
         setBdms01IncomeSegInd(CONSTANTS.SPACE);
         setBdms01RatingSegInd(CONSTANTS.SPACE);
         setBdms01ConvertibleSegInd(CONSTANTS.SPACE);
         setBdms01StockSegInd(CONSTANTS.SPACE);
         setBdms01OptionSegInd(CONSTANTS.SPACE);
         setBdms01BondBasicSegInd(CONSTANTS.SPACE);
         setBdms01BondFeatureSegInd(CONSTANTS.SPACE);
         setBdms01BondFactorSegInd(CONSTANTS.SPACE);
         setBdms01BondCmoSegInd(CONSTANTS.SPACE);
         setBdms01OidSegInd(CONSTANTS.SPACE);
         setBdms01UitSegInd(CONSTANTS.SPACE);
         setBdms01MortBackedSegInd(CONSTANTS.SPACE);
         setBdms01GetpriceSegInd(CONSTANTS.SPACE);
         setBdms01DivQualifyInd(CONSTANTS.SPACE);
         setBdms01TaxSegInd(CONSTANTS.SPACE);
         setBdms01UnitsSegInd(CONSTANTS.SPACE);
         setBdms01TcontrolSegInd(CONSTANTS.SPACE);
         setBdms01SecurityPrivSegInd(CONSTANTS.SPACE);
         setBdms01CvrsnSegInd(CONSTANTS.SPACE);
         setBdms01CanadaBondSegInd(CONSTANTS.SPACE);
         setBdms01OptUnderlXrefSegInd(CONSTANTS.SPACE);
         setBdms01ReqPriceRegion(CONSTANTS.SPACE);
          getBdms01OsiSymbolCont().initialize();
     
         setBdms01SearchKeyIsinCntry(CONSTANTS.SPACE_2);
         setBdms01LogError(CONSTANTS.SPACE);
         setBdms01ProgramName(CONSTANTS.SPACE_8);
   }


}
  
