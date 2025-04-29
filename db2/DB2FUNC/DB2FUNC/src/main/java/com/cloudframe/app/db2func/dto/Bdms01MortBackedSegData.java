package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01MortBackedSegData is used to handle fields declared in it
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
public class Bdms01MortBackedSegData extends Bdms01MortBackedSegDataSerialized { 
   

								@Getter @Setter private int bdms01MortBackedSegSqlcd;

						@Getter @Setter private char[] msdGnmaPoolNumber = Field.fillLowValue(6);

						@Getter @Setter private char[] bdms01PayGrdtdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01TypeMbsCd = Field.fillLowValue(4);

								@Getter @Setter private BigDecimal bdms01AvgWghtCpnAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bdms01MbOrgnlAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal bdms01AvgWghtMatAmt = BigDecimal.ZERO;

								@Getter @Setter private int bdms01MbDayDelayQty;

	
	/**
	* Constructor for Bdms01MortBackedSegData
	**/
    public Bdms01MortBackedSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01MortBackedSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MortBackedSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01MortBackedSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01MortBackedSegSqlcd(0);
         setMsdGnmaPoolNumber(CONSTANTS.SPACE_6);
         setBdms01PayGrdtdInd(CONSTANTS.SPACE);
         setBdms01TypeMbsCd(CONSTANTS.SPACE_4);
			setBdms01AvgWghtCpnAmt(BigDecimal.ZERO);
			setBdms01MbOrgnlAmt(BigDecimal.ZERO);
			setBdms01AvgWghtMatAmt(BigDecimal.ZERO);
                     setBdms01MbDayDelayQty(0);
   }


}
  
