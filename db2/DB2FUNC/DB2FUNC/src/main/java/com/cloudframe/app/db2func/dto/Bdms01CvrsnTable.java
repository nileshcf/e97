package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01CvrsnTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01CvrsnTable extends Bdms01CvrsnTableSerialized { 
   

								@Getter @Setter private BigDecimal bdms01CvrsnCvtblRt = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01CvrsnCvtblExerCd = Field.fillLowValue(4);

						@Getter @Setter private char[] bdms01CvrsnCvtblExpDt = Field.fillLowValue(10);

						@Getter @Setter private char[] bdms01CvrsnExerSecId = Field.fillLowValue(12);

						@Getter @Setter private char[] bdms01CvrsnExerCncyCd = Field.fillLowValue(3);

								@Getter @Setter private BigDecimal bdms01CvrsnCvtblPrcAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01CvrsnExerSecCd = Field.fillLowValue(1);

								@Getter @Setter private BigDecimal bdms01CvrsnExerExchRt = BigDecimal.ZERO;

						@Getter @Setter private char[] bdms01CvrsnExerRtCd = Field.fillLowValue(1);

						@Getter @Setter private char[] bdms01CvrsnExerPrcCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01CvrsnTable
	**/
    public Bdms01CvrsnTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01CvrsnTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CvrsnTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01CvrsnTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
			setBdms01CvrsnCvtblRt(BigDecimal.ZERO);
         setBdms01CvrsnCvtblExerCd(CONSTANTS.SPACE_4);
         setBdms01CvrsnCvtblExpDt(CONSTANTS.SPACE_10);
         setBdms01CvrsnExerSecId(CONSTANTS.SPACE_12);
         setBdms01CvrsnExerCncyCd(CONSTANTS.SPACE_3);
			setBdms01CvrsnCvtblPrcAmt(BigDecimal.ZERO);
         setBdms01CvrsnExerSecCd(CONSTANTS.SPACE);
			setBdms01CvrsnExerExchRt(BigDecimal.ZERO);
         setBdms01CvrsnExerRtCd(CONSTANTS.SPACE);
         setBdms01CvrsnExerPrcCd(CONSTANTS.SPACE);
   }


}
  
