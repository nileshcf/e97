package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01GetpriceSegData is used to handle fields declared in it
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
public class Bdms01GetpriceSegData extends Bdms01GetpriceSegDataSerialized { 
   

								@Getter @Setter private int bdms01GetpriceSegSqlcd;

						@Getter @Setter private char[] bdms01GetprcRetPriceDate = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01GetprcRetCurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01GetprcRetExchangeCd = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01GetprcRetVendorCd = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01GetprcRetWiInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01GetprcRetCountryCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01GetprcRetCloseAvSw = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal bdms01GetprcRetCloseAvPrc = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01GetprcRetAskHiSw = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal bdms01GetprcRetAskHiPrc = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01GetprcRetBidLoSw = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal bdms01GetprcRetBidLoPrc = BigDecimal.ZERO;

	
	/**
	* Constructor for Bdms01GetpriceSegData
	**/
    public Bdms01GetpriceSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01GetpriceSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01GetpriceSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01GetpriceSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01GetpriceSegSqlcd(0);
         setBdms01GetprcRetPriceDate(CONSTANTS.SPACE_10);
         setBdms01GetprcRetCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01GetprcRetExchangeCd(CONSTANTS.SPACE_10);
         setBdms01GetprcRetVendorCd(CONSTANTS.SPACE_10);
         setBdms01GetprcRetWiInd(CONSTANTS.SPACE);
         setBdms01GetprcRetCountryCd(CONSTANTS.SPACE_2);
         setBdms01GetprcRetCloseAvSw(CONSTANTS.SPACE_2);
			setBdms01GetprcRetCloseAvPrc(BigDecimal.ZERO);
         setBdms01GetprcRetAskHiSw(CONSTANTS.SPACE_2);
			setBdms01GetprcRetAskHiPrc(BigDecimal.ZERO);
         setBdms01GetprcRetBidLoSw(CONSTANTS.SPACE_2);
			setBdms01GetprcRetBidLoPrc(BigDecimal.ZERO);
   }


}
  
