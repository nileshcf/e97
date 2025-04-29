package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayloadCloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPayloadCloseDt extends FnsPayloadCloseDtSerialized { 
   

						@Getter @Setter private char[] fnsPayloadClosedCcyy = Field.fillLowValue(4);

						@Getter @Setter private char[] fnsPayloadFiller1 = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPayloadClosedMm = Field.fillLowValue(2);

						@Getter @Setter private char[] fnsPayloadFiller2 = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPayloadClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for FnsPayloadCloseDt
	**/
    public FnsPayloadCloseDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPayloadCloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPayloadCloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes FnsPayloadCloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPayloadClosedCcyy(CONSTANTS.SPACE_4);
         setFnsPayloadFiller1(CONSTANTS.SPACE);
         setFnsPayloadClosedMm(CONSTANTS.SPACE_2);
         setFnsPayloadFiller2(CONSTANTS.SPACE);
         setFnsPayloadClosedDd(CONSTANTS.SPACE_2);
   }


}
  
