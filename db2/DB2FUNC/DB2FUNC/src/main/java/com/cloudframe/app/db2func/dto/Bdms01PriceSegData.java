package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01PriceSegData is used to handle fields declared in it
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
public class Bdms01PriceSegData extends Bdms01PriceSegDataSerialized { 
   

								@Getter @Setter private int bdms01PriceSegSqlcd;
				@Getter @Setter private MsdPriceCcyymmdd msdPriceCcyymmdd = new MsdPriceCcyymmdd();

								@Getter @Setter private BigDecimal msdSecurityPrice = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal msdSecurityPriceHi = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal msdSecurityPriceLow = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01PriceIssueWhenInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01PriceExchangeCode = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PriceCurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01VendorCd = Field.fillLowValue(5);

						@Getter @Setter private char[] bdms01PriceSetDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PriceCountryCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01CloseAvSw = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01AskHiSw = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01BidLoSw = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal msdHousePrice = BigDecimal.ZERO;

						@Getter @Setter private char[] msdHousePriceDate = Field.fillLowValue(10);

						@Getter @Setter private char[] msdHousePriceSource = Field.fillLowValue(15);

						@Getter @Setter private char[] msdHousePriceRegion = Field.fillLowValue(1);

	
	/**
	* Constructor for Bdms01PriceSegData
	**/
    public Bdms01PriceSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01PriceSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01PriceSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdPriceCcyymmdd().setParent(this,getStartOffset() + 4);
    } 

	/**
	 * 	initializes Bdms01PriceSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01PriceSegSqlcd(0);
          getMsdPriceCcyymmdd().initialize();
     
			setMsdSecurityPrice(BigDecimal.ZERO);
			setMsdSecurityPriceHi(BigDecimal.ZERO);
			setMsdSecurityPriceLow(BigDecimal.ZERO);
         setBdms01PriceIssueWhenInd(CONSTANTS.SPACE);
         setBdms01PriceExchangeCode(CONSTANTS.SPACE_10);
         setBdms01PriceCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01VendorCd(CONSTANTS.SPACE_5);
         setBdms01PriceSetDt(CONSTANTS.SPACE_10);
         setBdms01PriceCountryCd(CONSTANTS.SPACE_2);
         setBdms01CloseAvSw(CONSTANTS.SPACE_2);
         setBdms01AskHiSw(CONSTANTS.SPACE_2);
         setBdms01BidLoSw(CONSTANTS.SPACE_2);
			setMsdHousePrice(BigDecimal.ZERO);
         setMsdHousePriceDate(CONSTANTS.SPACE_10);
         setMsdHousePriceSource(CONSTANTS.SPACE_15);
         setMsdHousePriceRegion(CONSTANTS.SPACE);
   }


}
  
