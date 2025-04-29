package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01OptUnderlXrefData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01OptUnderlXrefData extends Bdms01OptUnderlXrefDataSerialized { 
   

								@Getter @Setter private int bdms01UndlSecSegSqlcd;

						@Getter @Setter private char[] bdms01UndlSymblTrdsAsCd = Field.fillLowValue(20);

						@Getter @Setter private char[] bdms01UndlPrimeExchangeCd = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01UndlPrimeSymbolCd = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01UndlCanadaExchangeCd = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01UndlCanadaSymbolCd = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01UndlCusip = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01UndlIsin = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01UndlSedol = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01UndlCommonCode = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01UndlCins = Field.fillLowValue(12);
	
	/**
	* Constructor for Bdms01OptUnderlXrefData
	**/
    public Bdms01OptUnderlXrefData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01OptUnderlXrefData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OptUnderlXrefData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01OptUnderlXrefData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01UndlSecSegSqlcd(0);
         setBdms01UndlSymblTrdsAsCd(CONSTANTS.SPACE_20);
         setBdms01UndlPrimeExchangeCd(CONSTANTS.SPACE_10);
         setBdms01UndlPrimeSymbolCd(CONSTANTS.SPACE_12);
         setBdms01UndlCanadaExchangeCd(CONSTANTS.SPACE_10);
         setBdms01UndlCanadaSymbolCd(CONSTANTS.SPACE_12);
         setBdms01UndlCusip(CONSTANTS.SPACE_12);
         setBdms01UndlIsin(CONSTANTS.SPACE_12);
         setBdms01UndlSedol(CONSTANTS.SPACE_12);
         setBdms01UndlCommonCode(CONSTANTS.SPACE_12);
         setBdms01UndlCins(CONSTANTS.SPACE_12);
   }


}
  
