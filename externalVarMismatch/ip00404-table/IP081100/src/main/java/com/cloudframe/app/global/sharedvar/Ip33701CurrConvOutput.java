package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip33701CurrConvOutput is used to handle fields declared in it
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
public class Ip33701CurrConvOutput extends Ip33701CurrConvOutputSerialized { 
   

						@Getter @Setter private char[] ip33701ConvType = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal ip33701RateSrcToTrg = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701SrcAmt6Decimals = BigDecimal.ZERO;

								@Getter @Setter private long ip33701TargetAmount;

								@Getter @Setter private BigDecimal ip33701TargetAmount1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701TargetAmount2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701TargetAmount3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701TargetAmount4 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701TargetAmount5 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701TargetAmount6 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701TrgAmt6Decimals = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal ip33701TargetAmount7 = BigDecimal.ZERO;

								@Getter @Setter private short ip33701ReturnCode;
	
	/**
	* Constructor for Ip33701CurrConvOutput
	**/
    public Ip33701CurrConvOutput() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip33701CurrConvOutput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip33701CurrConvOutput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip33701CurrConvOutput
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp33701ConvType(CONSTANTS.SPACE);
			setIp33701RateSrcToTrg(BigDecimal.ZERO);
			setIp33701SrcAmt6Decimals(BigDecimal.ZERO);
                     setIp33701TargetAmount(0);
			setIp33701TrgAmt6Decimals(BigDecimal.ZERO);
			setIp33701TargetAmount7(BigDecimal.ZERO);
         	setIp33701ReturnCode((short)0);
   }


}
  
