package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01TaxSegData is used to handle fields declared in it
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
public class Bdms01TaxSegData extends Bdms01TaxSegDataSerialized { 
   

								@Getter @Setter private int bdms01TaxSegSqlcd;

						@Getter @Setter private char[] bdms01EffectiveTaxDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01TaxCountryCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01EligTaxCrdtInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01StatusTaxCd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal bdms01TaxWitholdRt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bdms01TaxCreditRt = BigDecimal.ZERO;

	
	/**
	* Constructor for Bdms01TaxSegData
	**/
    public Bdms01TaxSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01TaxSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01TaxSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01TaxSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01TaxSegSqlcd(0);
         setBdms01EffectiveTaxDt(CONSTANTS.SPACE_10);
         setBdms01TaxCountryCd(CONSTANTS.SPACE_2);
         setBdms01EligTaxCrdtInd(CONSTANTS.SPACE);
         setBdms01StatusTaxCd(CONSTANTS.SPACE);
			setBdms01TaxWitholdRt(BigDecimal.ZERO);
			setBdms01TaxCreditRt(BigDecimal.ZERO);
   }


}
  
