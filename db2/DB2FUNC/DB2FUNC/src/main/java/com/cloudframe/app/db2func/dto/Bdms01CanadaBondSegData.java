package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01CanadaBondSegData is used to handle fields declared in it
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
public class Bdms01CanadaBondSegData extends Bdms01CanadaBondSegDataSerialized { 
   

								@Getter @Setter private int bdms01CanBondSegSqlcd;

						@Getter @Setter private char[] bdms01ClsBooksBondDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01OfferingBondDt = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal bdms01ParFctrPct = BigDecimal.ZERO;

								@Getter @Setter private short bdms01PayMadeNbr;
	
	/**
	* Constructor for Bdms01CanadaBondSegData
	**/
    public Bdms01CanadaBondSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01CanadaBondSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CanadaBondSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01CanadaBondSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01CanBondSegSqlcd(0);
         setBdms01ClsBooksBondDt(CONSTANTS.SPACE_10);
         setBdms01OfferingBondDt(CONSTANTS.SPACE_10);
			setBdms01ParFctrPct(BigDecimal.ZERO);
         	setBdms01PayMadeNbr((short)0);
   }


}
  
