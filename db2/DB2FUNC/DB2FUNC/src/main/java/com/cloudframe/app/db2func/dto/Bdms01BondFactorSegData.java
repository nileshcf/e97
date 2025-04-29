package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01BondFactorSegData is used to handle fields declared in it
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
public class Bdms01BondFactorSegData extends Bdms01BondFactorSegDataSerialized { 
   

								@Getter @Setter private int bdms01BondFactorSegSqlcd;

								@Getter @Setter private BigDecimal msdGnmaCurrFactor = BigDecimal.ZERO;

								@Getter @Setter private long msdCurrFactorUpdDate;

						@Getter @Setter private char[] bdms01CurrFacBondDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01GnmaCurrFactorPDt = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal msdGnmaPrevFactor = BigDecimal.ZERO;

								@Getter @Setter private long msdPrevFactorUpdDate;

						@Getter @Setter private char[] bdms01GnmaPrevFactorPDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PrevFacBondDt = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal msdGnmaPrevToPrevFac = BigDecimal.ZERO;

								@Getter @Setter private long msdPrev2FactorUpdDate;

						@Getter @Setter private char[] bdms01GnmaPvToPvFacPDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01PvpvFacBondDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01BondFactorSegData
	**/
    public Bdms01BondFactorSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01BondFactorSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondFactorSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01BondFactorSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondFactorSegSqlcd(0);
			setMsdGnmaCurrFactor(BigDecimal.ZERO);
                     setMsdCurrFactorUpdDate(0);
         setBdms01CurrFacBondDt(CONSTANTS.SPACE_10);
         setBdms01GnmaCurrFactorPDt(CONSTANTS.SPACE_10);
			setMsdGnmaPrevFactor(BigDecimal.ZERO);
                     setMsdPrevFactorUpdDate(0);
         setBdms01GnmaPrevFactorPDt(CONSTANTS.SPACE_10);
         setBdms01PrevFacBondDt(CONSTANTS.SPACE_10);
			setMsdGnmaPrevToPrevFac(BigDecimal.ZERO);
                     setMsdPrev2FactorUpdDate(0);
         setBdms01GnmaPvToPvFacPDt(CONSTANTS.SPACE_10);
         setBdms01PvpvFacBondDt(CONSTANTS.SPACE_10);
   }


}
  
