package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211CloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50211CloseDt extends Ip50211CloseDtSerialized { 
   

						@Getter @Setter private char[] ip50211ClosedCcyy = Field.fillLowValue(4);

						@Getter @Setter private char[] ip50211Filler1 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip50211ClosedMm = Field.fillLowValue(2);

						@Getter @Setter private char[] ip50211Filler2 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip50211ClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip50211CloseDt
	**/
    public Ip50211CloseDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50211CloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211CloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip50211CloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211ClosedCcyy(CONSTANTS.SPACE_4);
         setIp50211Filler1(CONSTANTS.SPACE);
         setIp50211ClosedMm(CONSTANTS.SPACE_2);
         setIp50211Filler2(CONSTANTS.SPACE);
         setIp50211ClosedDd(CONSTANTS.SPACE_2);
   }


}
  
