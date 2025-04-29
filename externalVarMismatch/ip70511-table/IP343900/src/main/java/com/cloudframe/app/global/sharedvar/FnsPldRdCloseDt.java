package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdCloseDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPldRdCloseDt extends FnsPldRdCloseDtSerialized { 
   

						@Getter @Setter private char[] fnsPldRdClosedCcyy = Field.fillLowValue(4);

						@Getter @Setter private char[] fnsPldRdFiller1 = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPldRdClosedMm = Field.fillLowValue(2);

						@Getter @Setter private char[] fnsPldRdFiller2 = Field.fillLowValue(1);

						@Getter @Setter private char[] fnsPldRdClosedDd = Field.fillLowValue(2);
	
	/**
	* Constructor for FnsPldRdCloseDt
	**/
    public FnsPldRdCloseDt() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPldRdCloseDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdCloseDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes FnsPldRdCloseDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdClosedCcyy(CONSTANTS.SPACE_4);
         setFnsPldRdFiller1(CONSTANTS.SPACE);
         setFnsPldRdClosedMm(CONSTANTS.SPACE_2);
         setFnsPldRdFiller2(CONSTANTS.SPACE);
         setFnsPldRdClosedDd(CONSTANTS.SPACE_2);
   }


}
  
