package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip996011StartTimestamp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip996011StartTimestamp extends Ip996011StartTimestampSerialized { 
   

								@Getter @Setter private char[] ip996011StartMonth = Field.fillLowValue(3);

								@Getter @Setter private char[] ip996011StartDay = Field.fillLowValue(3);

								@Getter @Setter private char[] ip996011StartYear = Field.fillLowValue(3);

								@Getter @Setter private int ip996011StartHour;

						@Getter @Setter private char[] ip996011Dot1 = Field.fillLowValue(1);

								@Getter @Setter private int ip996011StartMinute;

						@Getter @Setter private char[] ip996011Dot2 = Field.fillLowValue(1);

								@Getter @Setter private char[] ip996011StartSecond = Field.fillLowValue(4);
	
	/**
	* Constructor for Ip996011StartTimestamp
	**/
    public Ip996011StartTimestamp() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip996011StartTimestamp. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip996011StartTimestamp(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip996011StartTimestamp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setIp996011StartMonth(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_33154069,"0".toCharArray()));
                    setIp996011StartDay(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_33154069,"0".toCharArray()));
                    setIp996011StartYear(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_33154658,"0".toCharArray()));
                     setIp996011StartHour(0);
         setIp996011Dot1(CONSTANTS.SPACE);
                     setIp996011StartMinute(0);
         setIp996011Dot2(CONSTANTS.SPACE);
                    setIp996011StartSecond(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1027795424,"0".toCharArray()));
   }


}
  
