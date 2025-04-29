package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01UitSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01UitSegData extends Bdms01UitSegDataSerialized { 
   

								@Getter @Setter private int bdms01UitSegSqlcd;

						@Getter @Setter private char[] msdUnitIdCd = Field.fillLowValue(2);

								@Getter @Setter private int msdUnitIdNo;

						@Getter @Setter private char[] bdms01TypeUitCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01UitInterestPayCd = Field.fillLowValue(2);

						@Getter @Setter private char[] bdms01SpnsrId = Field.fillLowValue(3);

						@Getter @Setter private char[] bdms01WrapInd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CshRnvstCd = Field.fillLowValue(2);

	
	/**
	* Constructor for Bdms01UitSegData
	**/
    public Bdms01UitSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01UitSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01UitSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01UitSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01UitSegSqlcd(0);
         setMsdUnitIdCd(CONSTANTS.SPACE_2);
                     setMsdUnitIdNo(0);
         setBdms01TypeUitCd(CONSTANTS.SPACE_2);
         setBdms01UitInterestPayCd(CONSTANTS.SPACE_2);
         setBdms01SpnsrId(CONSTANTS.SPACE_3);
         setBdms01WrapInd(CONSTANTS.SPACE);
         setBdms01CshRnvstCd(CONSTANTS.SPACE_2);
   }


}
  
