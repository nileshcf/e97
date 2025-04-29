package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01ReturnData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01ReturnData extends Bdms01ReturnDataSerialized { 
   

						@Getter @Setter private char[] bdms01ReturnCode = Field.fillLowValue(2);

								@Getter @Setter private int bdms01ReturnSqlcode;
				@Getter @Setter private MsdRecordKey msdRecordKey = new MsdRecordKey();

						@Getter @Setter private char[] bdms01RegCode = Field.fillLowValue(2);
				@Getter @Setter private Bdms01AdpMasterSegData bdms01AdpMasterSegData = new Bdms01AdpMasterSegData();
				@Getter @Setter private Bdms01BaseSecuritySegData bdms01BaseSecuritySegData = new Bdms01BaseSecuritySegData();
				@Getter @Setter private Bdms01SecurityTypeSegData bdms01SecurityTypeSegData = new Bdms01SecurityTypeSegData();
				@Getter @Setter private Bdms01PriceSegData bdms01PriceSegData = new Bdms01PriceSegData();
				@Getter @Setter private Bdms01XrefSegData bdms01XrefSegData = new Bdms01XrefSegData();
				@Getter @Setter private Bdms01DescSegData bdms01DescSegData = new Bdms01DescSegData();
				@Getter @Setter private Bdms01SpecialistSegData bdms01SpecialistSegData = new Bdms01SpecialistSegData();
				@Getter @Setter private Bdms01FrozenChillSegData bdms01FrozenChillSegData = new Bdms01FrozenChillSegData();
				@Getter @Setter private Bdms01IncomeSegData bdms01IncomeSegData = new Bdms01IncomeSegData();
				@Getter @Setter private Bdms01RatingSegData bdms01RatingSegData = new Bdms01RatingSegData();
				@Getter @Setter private Bdms01ConvertibleSegData bdms01ConvertibleSegData = new Bdms01ConvertibleSegData();
				@Getter @Setter private Bdms01StockSegData bdms01StockSegData = new Bdms01StockSegData();
				@Getter @Setter private Bdms01OptionSegData bdms01OptionSegData = new Bdms01OptionSegData();
				@Getter @Setter private Bdms01BondBasicSegData bdms01BondBasicSegData = new Bdms01BondBasicSegData();
				@Getter @Setter private Bdms01BondFeatureSegData bdms01BondFeatureSegData = new Bdms01BondFeatureSegData();
				@Getter @Setter private Bdms01BondFactorSegData bdms01BondFactorSegData = new Bdms01BondFactorSegData();
				@Getter @Setter private Bdms01BondCmoSegData bdms01BondCmoSegData = new Bdms01BondCmoSegData();
				@Getter @Setter private Bdms01OidSegData bdms01OidSegData = new Bdms01OidSegData();
				@Getter @Setter private Bdms01UitSegData bdms01UitSegData = new Bdms01UitSegData();
				@Getter @Setter private Bdms01MortBackedSegData bdms01MortBackedSegData = new Bdms01MortBackedSegData();
				@Getter @Setter private Bdms01GetpriceSegData bdms01GetpriceSegData = new Bdms01GetpriceSegData();
				@Getter @Setter private Bdms01MultSecurityNoData bdms01MultSecurityNoData = new Bdms01MultSecurityNoData();
				@Getter @Setter private Bdms01DivQualifyData bdms01DivQualifyData = new Bdms01DivQualifyData();
				@Getter @Setter private Bdms01TaxSegData bdms01TaxSegData = new Bdms01TaxSegData();
				@Getter @Setter private Bdms01BondBasicExpData bdms01BondBasicExpData = new Bdms01BondBasicExpData();
				@Getter @Setter private Bdms01BaseSecurityExpData bdms01BaseSecurityExpData = new Bdms01BaseSecurityExpData();
				@Getter @Setter private Bdms01MultAdpNoData bdms01MultAdpNoData = new Bdms01MultAdpNoData();
				@Getter @Setter private Bdms01UnitsSegData bdms01UnitsSegData = new Bdms01UnitsSegData();
				@Getter @Setter private Bdms01TcontrolSegData bdms01TcontrolSegData = new Bdms01TcontrolSegData();
				@Getter @Setter private Bdms01SecurityPrivSegData bdms01SecurityPrivSegData = new Bdms01SecurityPrivSegData();
				@Getter @Setter private Bdms01AdpMasterExpData bdms01AdpMasterExpData = new Bdms01AdpMasterExpData();
				@Getter @Setter private Bdms01CvrsnSegData bdms01CvrsnSegData = new Bdms01CvrsnSegData();
				@Getter @Setter private Bdms01CanadaBondSegData bdms01CanadaBondSegData = new Bdms01CanadaBondSegData();
				@Getter @Setter private Bdms01OptUnderlXrefData bdms01OptUnderlXrefData = new Bdms01OptUnderlXrefData();

	
	/**
	* Constructor for Bdms01ReturnData
	**/
    public Bdms01ReturnData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01ReturnData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01ReturnData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdRecordKey().setParent(this,getStartOffset() + 6);
					getBdms01AdpMasterSegData().setParent(this,getStartOffset() + 16);
					getBdms01BaseSecuritySegData().setParent(this,getStartOffset() + 222);
					getBdms01SecurityTypeSegData().setParent(this,getStartOffset() + 357);
					getBdms01PriceSegData().setParent(this,getStartOffset() + 400);
					getBdms01XrefSegData().setParent(this,getStartOffset() + 562);
					getBdms01DescSegData().setParent(this,getStartOffset() + 882);
					getBdms01SpecialistSegData().setParent(this,getStartOffset() + 1181);
					getBdms01FrozenChillSegData().setParent(this,getStartOffset() + 1239);
					getBdms01IncomeSegData().setParent(this,getStartOffset() + 1401);
					getBdms01RatingSegData().setParent(this,getStartOffset() + 1840);
					getBdms01ConvertibleSegData().setParent(this,getStartOffset() + 1887);
					getBdms01StockSegData().setParent(this,getStartOffset() + 1956);
					getBdms01OptionSegData().setParent(this,getStartOffset() + 2249);
					getBdms01BondBasicSegData().setParent(this,getStartOffset() + 2438);
					getBdms01BondFeatureSegData().setParent(this,getStartOffset() + 2687);
					getBdms01BondFactorSegData().setParent(this,getStartOffset() + 3081);
					getBdms01BondCmoSegData().setParent(this,getStartOffset() + 3245);
					getBdms01OidSegData().setParent(this,getStartOffset() + 3329);
					getBdms01UitSegData().setParent(this,getStartOffset() + 3417);
					getBdms01MortBackedSegData().setParent(this,getStartOffset() + 3460);
					getBdms01GetpriceSegData().setParent(this,getStartOffset() + 3549);
					getBdms01MultSecurityNoData().setParent(this,getStartOffset() + 3668);
					getBdms01DivQualifyData().setParent(this,getStartOffset() + 3705);
					getBdms01TaxSegData().setParent(this,getStartOffset() + 3707);
					getBdms01BondBasicExpData().setParent(this,getStartOffset() + 3773);
					getBdms01BaseSecurityExpData().setParent(this,getStartOffset() + 3930);
					getBdms01MultAdpNoData().setParent(this,getStartOffset() + 4146);
					getBdms01UnitsSegData().setParent(this,getStartOffset() + 4328);
					getBdms01TcontrolSegData().setParent(this,getStartOffset() + 4385);
					getBdms01SecurityPrivSegData().setParent(this,getStartOffset() + 4530);
					getBdms01AdpMasterExpData().setParent(this,getStartOffset() + 4531);
					getBdms01CvrsnSegData().setParent(this,getStartOffset() + 4744);
					getBdms01CanadaBondSegData().setParent(this,getStartOffset() + 5133);
					getBdms01OptUnderlXrefData().setParent(this,getStartOffset() + 5177);
    } 

	/**
	 * 	initializes Bdms01ReturnData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01ReturnCode(CONSTANTS.SPACE_2);
                     setBdms01ReturnSqlcode(0);
          getMsdRecordKey().initialize();
     
         setBdms01RegCode(CONSTANTS.SPACE_2);
          getBdms01AdpMasterSegData().initialize();
     
          getBdms01BaseSecuritySegData().initialize();
     
          getBdms01SecurityTypeSegData().initialize();
     
          getBdms01PriceSegData().initialize();
     
          getBdms01XrefSegData().initialize();
     
          getBdms01DescSegData().initialize();
     
          getBdms01SpecialistSegData().initialize();
     
          getBdms01FrozenChillSegData().initialize();
     
          getBdms01IncomeSegData().initialize();
     
          getBdms01RatingSegData().initialize();
     
          getBdms01ConvertibleSegData().initialize();
     
          getBdms01StockSegData().initialize();
     
          getBdms01OptionSegData().initialize();
     
          getBdms01BondBasicSegData().initialize();
     
          getBdms01BondFeatureSegData().initialize();
     
          getBdms01BondFactorSegData().initialize();
     
          getBdms01BondCmoSegData().initialize();
     
          getBdms01OidSegData().initialize();
     
          getBdms01UitSegData().initialize();
     
          getBdms01MortBackedSegData().initialize();
     
          getBdms01GetpriceSegData().initialize();
     
          getBdms01MultSecurityNoData().initialize();
     
          getBdms01DivQualifyData().initialize();
     
          getBdms01TaxSegData().initialize();
     
          getBdms01BondBasicExpData().initialize();
     
          getBdms01BaseSecurityExpData().initialize();
     
          getBdms01MultAdpNoData().initialize();
     
          getBdms01UnitsSegData().initialize();
     
          getBdms01TcontrolSegData().initialize();
     
          getBdms01SecurityPrivSegData().initialize();
     
          getBdms01AdpMasterExpData().initialize();
     
          getBdms01CvrsnSegData().initialize();
     
          getBdms01CanadaBondSegData().initialize();
     
          getBdms01OptUnderlXrefData().initialize();
     
   }


}
  
