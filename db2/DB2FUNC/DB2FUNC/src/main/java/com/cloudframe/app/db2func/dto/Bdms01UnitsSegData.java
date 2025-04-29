package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01UnitsSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01UnitsSegData extends Bdms01UnitsSegDataSerialized { 
   

								@Getter @Setter private int bdms01UnitsSegSqlcd;

						@Getter @Setter private char[] bdms01TypeUnitsCd = Field.fillLowValue(3);

	
	/**
	* Constructor for Bdms01UnitsSegData
	**/
    public Bdms01UnitsSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01UnitsSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01UnitsSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01UnitsSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01UnitsSegSqlcd(0);
         setBdms01TypeUnitsCd(CONSTANTS.SPACE_3);
   }


}
  
