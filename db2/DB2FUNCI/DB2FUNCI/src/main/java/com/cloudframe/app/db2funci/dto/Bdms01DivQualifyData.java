package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01DivQualifyData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01DivQualifyData extends Bdms01DivQualifyDataSerialized { 
   

						@Getter @Setter private char[] msdDividendQualify = Field.fillLowValue(1);

						@Getter @Setter private char[] msdDividendQualifyOverride = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01DivQualifyData
	**/
    public Bdms01DivQualifyData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01DivQualifyData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01DivQualifyData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01DivQualifyData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdDividendQualify(CONSTANTS.SPACE);
         setMsdDividendQualifyOverride(CONSTANTS.SPACE);
   }


}
  
