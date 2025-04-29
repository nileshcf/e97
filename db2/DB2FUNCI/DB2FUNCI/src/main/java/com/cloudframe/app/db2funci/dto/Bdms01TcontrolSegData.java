package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01TcontrolSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01TcontrolSegData extends Bdms01TcontrolSegDataSerialized { 
   

								@Getter @Setter private int bdms01TcontrolSegSqlcd;

						@Getter @Setter private char[] bdms01UpdtTranCd = Field.fillLowValue(8);

						@Getter @Setter private char[] bdms01UpdtTmstp = Field.fillLowValue(26);

						@Getter @Setter private char[] bdms01UpdtTrmlCd = Field.fillLowValue(8);

						@Getter @Setter private char[] bdms01UpdtCommentTxt = Field.fillLowValue(79);

	
	/**
	* Constructor for Bdms01TcontrolSegData
	**/
    public Bdms01TcontrolSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01TcontrolSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01TcontrolSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01TcontrolSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01TcontrolSegSqlcd(0);
         setBdms01UpdtTranCd(CONSTANTS.SPACE_8);
         setBdms01UpdtTmstp(CONSTANTS.SPACE_26);
         setBdms01UpdtTrmlCd(CONSTANTS.SPACE_8);
         setBdms01UpdtCommentTxt(CONSTANTS.SPACE_79);
   }


}
  
