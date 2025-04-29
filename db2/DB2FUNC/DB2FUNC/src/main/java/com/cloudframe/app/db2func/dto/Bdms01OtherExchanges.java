package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01OtherExchanges is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01OtherExchanges extends Bdms01OtherExchangesSerialized { 
   

						@Getter @Setter private char[] bdms01OtherExchangeCd = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01OtherExchangeSymbol = Field.fillLowValue(12);
	
	/**
	* Constructor for Bdms01OtherExchanges
	**/
    public Bdms01OtherExchanges() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01OtherExchanges. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OtherExchanges(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01OtherExchanges
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01OtherExchangeCd(CONSTANTS.SPACE_10);
         setBdms01OtherExchangeSymbol(CONSTANTS.SPACE_12);
   }


}
  
