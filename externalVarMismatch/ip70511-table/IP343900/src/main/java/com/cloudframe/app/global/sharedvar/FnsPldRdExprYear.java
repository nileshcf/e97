package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdExprYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class FnsPldRdExprYear extends FnsPldRdExprYearSerialized { 
   

						@Getter @Setter private char[] fnsPldRdExprCc = Field.fillLowValue(2);

						@Getter @Setter private char[] fnsPldRdExprYy = Field.fillLowValue(2);
	
	/**
	* Constructor for FnsPldRdExprYear
	**/
    public FnsPldRdExprYear() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FnsPldRdExprYear. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdExprYear(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes FnsPldRdExprYear
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdExprCc(CONSTANTS.SPACE_2);
         setFnsPldRdExprYy(CONSTANTS.SPACE_2);
   }


}
  
