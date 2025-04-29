package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921CloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip82921CloseDt extends Ip82921CloseDtSerialized { 
   

						@Getter @Setter private char[] ip82921ClosedCcyy = Field.fillLowValue(4);

						@Getter @Setter private char[] ip82921Filler1 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip82921ClosedMm = Field.fillLowValue(2);

						@Getter @Setter private char[] ip82921Filler2 = Field.fillLowValue(1);

						@Getter @Setter private char[] ip82921ClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for Ip82921CloseDt
	**/
    public Ip82921CloseDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip82921CloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921CloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip82921CloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921ClosedCcyy(CONSTANTS.SPACE_4);
         setIp82921Filler1(CONSTANTS.SPACE);
         setIp82921ClosedMm(CONSTANTS.SPACE_2);
         setIp82921Filler2(CONSTANTS.SPACE);
         setIp82921ClosedDd(CONSTANTS.SPACE_2);
   }


}
  
