package com.cloudframe.app.o529351u.dto;

/**
*  The class UOutLineData51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class UOutLineData51 extends UOutLineData51Serialized { 
   

						@Getter @Setter private char[] uOutLinePos51 = Field.fillLowValue(2);

						@Getter @Setter private char[] uOutLineServiceCode51 = Field.fillLowValue(6);

								@Getter @Setter private int uOutLineDosDate51;

								@Getter @Setter private BigDecimal uOutLineChargeAmt51 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal uOutLineNotcovAmt51 = BigDecimal.ZERO;

						@Getter @Setter private char[] uOutLineRemarkCd51 = Field.fillLowValue(3);

								@Getter @Setter private short uOutLinePlanVar51;

						@Getter @Setter private char[] uOutLineCauseCd51 = Field.fillLowValue(1);

								@Getter @Setter private int uOutLineAppUnits51;

						@Getter @Setter private char[] uOutSpiTblId51 = Field.fillLowValue(7);

						@Getter @Setter private char[] uOutPosTierCd51 = Field.fillLowValue(1);

						@Getter @Setter private char[] uOutDiagElgInd51 = Field.fillLowValue(1);
	
	/**
	* Constructor for UOutLineData51
	**/
    public UOutLineData51() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for UOutLineData51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UOutLineData51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
