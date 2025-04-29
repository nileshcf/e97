package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip33701CurrConvInput is used to handle fields declared in it
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
public class Ip33701CurrConvInput extends Ip33701CurrConvInputSerialized { 
   

								@Getter @Setter private int ip33701SourceCurCode;

						@Getter @Setter private char[] ip33701SourceCurExp = Field.fillLowValue(1);

								@Getter @Setter private int ip33701TargetCurCode;

						@Getter @Setter private char[] ip33701TargetCurExp = Field.fillLowValue(1);

								@Getter @Setter private long ip33701SourceAmount;

								@Getter @Setter private BigDecimal ip33701SourceAmount1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701SourceAmount2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701SourceAmount3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701SourceAmount4 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701SourceAmount5 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701SourceAmount6 = BigDecimal.ZERO;

						@Getter @Setter private char[] ip33701ConvRateTrgAsRef = Field.fillLowValue(1);

						@Getter @Setter private char[] ip33701ConvRateTrgNotRef = Field.fillLowValue(1);

						@Getter @Setter private char[] ip33701ApplyConvRate = Field.fillLowValue(1);

						@Getter @Setter private char[] ip33701ApplyCrossRate = Field.fillLowValue(1);

						@Getter @Setter private char[] ip33701RateTypeSrcToBase = Field.fillLowValue(1);

						@Getter @Setter private char[] ip33701RateTypeTrgToBase = Field.fillLowValue(1);

								@Getter @Setter private long ip33701FxDateYyddd;

						@Getter @Setter private char[] ip33701IsTargetAmtTrunc = Field.fillLowValue(1);

						@Getter @Setter private char[] ip33701ToGetSrcAmt6 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip33701CurrConvInput
	**/
    public Ip33701CurrConvInput() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip33701CurrConvInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip33701CurrConvInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip33701CurrConvInput
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp33701SourceCurCode(0);
         setIp33701SourceCurExp(CONSTANTS.SPACE);
                     setIp33701TargetCurCode(0);
         setIp33701TargetCurExp(CONSTANTS.SPACE);
                     setIp33701SourceAmount(0);
         setIp33701ConvRateTrgAsRef(CONSTANTS.SPACE);
         setIp33701ConvRateTrgNotRef(CONSTANTS.SPACE);
         setIp33701ApplyConvRate(CONSTANTS.SPACE);
         setIp33701ApplyCrossRate(CONSTANTS.SPACE);
         setIp33701RateTypeSrcToBase(CONSTANTS.SPACE);
         setIp33701RateTypeTrgToBase(CONSTANTS.SPACE);
                     setIp33701FxDateYyddd(0);
         setIp33701IsTargetAmtTrunc(CONSTANTS.SPACE);
         setIp33701ToGetSrcAmt6(CONSTANTS.SPACE);
   }


}
  
