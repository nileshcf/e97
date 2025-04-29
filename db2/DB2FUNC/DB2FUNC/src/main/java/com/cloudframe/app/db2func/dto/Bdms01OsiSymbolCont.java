package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01OsiSymbolCont is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01OsiSymbolCont extends Bdms01OsiSymbolContSerialized { 
   

						@Getter @Setter private char[] bdms01SearchOptSymbolType = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01SearchOptSymbol = Field.fillLowValue(6);

								@Getter @Setter private BigDecimal bdms01SearchOptStrike = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01SearchOptStrikex = Field.fillLowValue(8);
	
	/**
	* Constructor for Bdms01OsiSymbolCont
	**/
    public Bdms01OsiSymbolCont() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01OsiSymbolCont. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OsiSymbolCont(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01OsiSymbolCont
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBdms01SearchOptSymbolType(CONSTANTS.SPACE);
         setBdms01SearchOptSymbol(CONSTANTS.SPACE_6);
			setBdms01SearchOptStrike(BigDecimal.ZERO);
   }


}
  
