package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01BondBasicExpData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01BondBasicExpData extends Bdms01BondBasicExpDataSerialized { 
   

						@Getter @Setter private char[] bdms01ScrtyAdpBaseNbr = Field.fillLowValue(7);

						@Getter @Setter private char[] bdms01PuttableInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01AbsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TypeAbsCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01CbndPassThruInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01UseOfPrcdCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01OtrEnhcmtCmpyNm = Field.fillLowValue(50);

						@Getter @Setter private char[] bdms01OtrEnhcmtTypeCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SttlmDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01SttlmInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OtrTaxExmptCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01RmktTermInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FrgnSvrgnDbInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01ClMkWhlInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01InsCd = Field.fillLowValue(5);

						@Getter @Setter private char[] bdms01InsFtidCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01RrbInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01IssSttsCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01EomRuleCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CouponTypeCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OffrDocDlvryCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SidMudNbr = Field.fillLowValue(7);

						@Getter @Setter private char[] bdms01MuniSrsDescTxt = Field.fillLowValue(20);

						@Getter @Setter private char[] bdms01SupissTypeCd = Field.fillLowValue(5);

	
	/**
	* Constructor for Bdms01BondBasicExpData
	**/
    public Bdms01BondBasicExpData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01BondBasicExpData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondBasicExpData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01BondBasicExpData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01ScrtyAdpBaseNbr(CONSTANTS.SPACE_7);
         setBdms01PuttableInd(CONSTANTS.SPACE);
         setBdms01AbsInd(CONSTANTS.SPACE);
         setBdms01TypeAbsCd(CONSTANTS.SPACE_2);
         setBdms01CbndPassThruInd(CONSTANTS.SPACE);
         setBdms01UseOfPrcdCd(CONSTANTS.SPACE_2);
         setBdms01OtrEnhcmtCmpyNm(CONSTANTS.SPACE_50);
         setBdms01OtrEnhcmtTypeCd(CONSTANTS.SPACE_2);
         setBdms01SttlmDt(CONSTANTS.SPACE_10);
         setBdms01SttlmInd(CONSTANTS.SPACE);
         setBdms01OtrTaxExmptCd(CONSTANTS.SPACE);
         setBdms01RmktTermInd(CONSTANTS.SPACE);
         setBdms01FrgnSvrgnDbInd(CONSTANTS.SPACE);
         setBdms01ClMkWhlInd(CONSTANTS.SPACE);
         setBdms01InsCd(CONSTANTS.SPACE_5);
         setBdms01InsFtidCd(CONSTANTS.SPACE_2);
         setBdms01RrbInd(CONSTANTS.SPACE);
         setBdms01IssSttsCd(CONSTANTS.SPACE);
         setBdms01EomRuleCd(CONSTANTS.SPACE);
         setBdms01CouponTypeCd(CONSTANTS.SPACE);
         setBdms01OffrDocDlvryCd(CONSTANTS.SPACE);
         setBdms01SidMudNbr(CONSTANTS.SPACE_7);
         setBdms01MuniSrsDescTxt(CONSTANTS.SPACE_20);
         setBdms01SupissTypeCd(CONSTANTS.SPACE_5);
   }


}
  
