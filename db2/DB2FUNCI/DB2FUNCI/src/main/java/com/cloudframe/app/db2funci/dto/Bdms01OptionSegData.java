package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01OptionSegData is used to handle fields declared in it
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
public class Bdms01OptionSegData extends Bdms01OptionSegDataSerialized { 
   

								@Getter @Setter private int bdms01OptionSegSqlcd;

						@Getter @Setter private char[] msdUnderlyingSecNo = Field.fillLowValue(7);

								@Getter @Setter private BigDecimal msdOptStrikePrice = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal msdOptExpndStrkPrc = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal msdOptFactor = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal msdOptExpndFactor = BigDecimal.ZERO;
				@Getter @Setter private MsdOptExpMmddccyy msdOptExpMmddccyy = new MsdOptExpMmddccyy();

								@Getter @Setter private BigDecimal msdOptCapPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01OptExpirationDt = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal msdUnderlyingSecPrice = BigDecimal.ZERO;

						@Getter @Setter private char[] msdCurrencyCode01 = Field.fillLowValue(3);

						@Getter @Setter private char[] msdCurrencyCode2 = Field.fillLowValue(3);

								@Getter @Setter private long bdms01OptTradeVolume;

						@Getter @Setter private char[] bdms01OptSecurityParsInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TypeDebtOptCd = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01EscrowRcptInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TypeOptionCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01TypeIndexOptCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01OptCurrencyCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01PutCallCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01LeapInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01FlexInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01EurExerciseInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01OptCurrencyLegacyCd = Field.fillLowValue(2);

								@Getter @Setter private BigDecimal bdms01DlvrblFctrPct = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01DcmlFrctnCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01DlvrbOptnSymId = Field.fillLowValue(6);

						@Getter @Setter private char[] bdms01OptionMaturityDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01OccOptnSymId = Field.fillLowValue(6);

						@Getter @Setter private char[] bdms01FroInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01BrdBsdBnryInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SecCusipBaseNbr = Field.fillLowValue(9);

	
	/**
	* Constructor for Bdms01OptionSegData
	**/
    public Bdms01OptionSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01OptionSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OptionSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdOptExpMmddccyy().setParent(this,getStartOffset() + 44);
    } 

	/**
	 * 	initializes Bdms01OptionSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01OptionSegSqlcd(0);
         setMsdUnderlyingSecNo(CONSTANTS.SPACE_7);
			setMsdOptStrikePrice(BigDecimal.ZERO);
			setMsdOptFactor(BigDecimal.ZERO);
          getMsdOptExpMmddccyy().initialize();
     
			setMsdOptCapPrice(BigDecimal.ZERO);
         setBdms01OptExpirationDt(CONSTANTS.SPACE_10);
			setMsdUnderlyingSecPrice(BigDecimal.ZERO);
         setMsdCurrencyCode01(CONSTANTS.SPACE_3);
                     setBdms01OptTradeVolume(0);
         setBdms01OptSecurityParsInd(CONSTANTS.SPACE);
         setBdms01TypeDebtOptCd(CONSTANTS.SPACE_3);
         setBdms01EscrowRcptInd(CONSTANTS.SPACE);
         setBdms01TypeOptionCd(CONSTANTS.SPACE_2);
         setBdms01TypeIndexOptCd(CONSTANTS.SPACE_2);
         setBdms01OptCurrencyCd(CONSTANTS.SPACE_2);
         setBdms01PutCallCd(CONSTANTS.SPACE);
         setBdms01LeapInd(CONSTANTS.SPACE);
         setBdms01FlexInd(CONSTANTS.SPACE);
         setBdms01EurExerciseInd(CONSTANTS.SPACE);
         setBdms01OptCurrencyLegacyCd(CONSTANTS.SPACE_2);
			setBdms01DlvrblFctrPct(BigDecimal.ZERO);
         setBdms01DcmlFrctnCd(CONSTANTS.SPACE);
         setBdms01DlvrbOptnSymId(CONSTANTS.SPACE_6);
         setBdms01OptionMaturityDt(CONSTANTS.SPACE_10);
         setBdms01OccOptnSymId(CONSTANTS.SPACE_6);
         setBdms01FroInd(CONSTANTS.SPACE);
         setBdms01BrdBsdBnryInd(CONSTANTS.SPACE);
         setBdms01SecCusipBaseNbr(CONSTANTS.SPACE_9);
   }


}
  
