package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01BondCmoSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01BondCmoSegData extends Bdms01BondCmoSegDataSerialized { 
   

								@Getter @Setter private int bdms01BondCmoSegSqlcd;

						@Getter @Setter private char[] msdCmoInd = Field.fillLowValue(1);

								@Getter @Setter private long msdStartAccrualDate;

								@Getter @Setter private long msdEndAccrualDate;

								@Getter @Setter private int msdDelayDays;

						@Getter @Setter private char[] bdms01AccrualStartDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01AccrualEndDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01BondCmoSegData
	**/
    public Bdms01BondCmoSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01BondCmoSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondCmoSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01BondCmoSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01BondCmoSegSqlcd(0);
         setMsdCmoInd(CONSTANTS.SPACE);
                     setMsdStartAccrualDate(0);
                     setMsdEndAccrualDate(0);
                     setMsdDelayDays(0);
         setBdms01AccrualStartDt(CONSTANTS.SPACE_10);
         setBdms01AccrualEndDt(CONSTANTS.SPACE_10);
   }


}
  
