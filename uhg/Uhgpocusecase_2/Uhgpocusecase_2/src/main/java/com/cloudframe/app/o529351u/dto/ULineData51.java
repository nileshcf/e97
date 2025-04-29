package com.cloudframe.app.o529351u.dto;

/**
*  The class ULineData51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class ULineData51 extends ULineData51Serialized { 
   

						@Getter @Setter private char[] uLinePos51 = Field.fillLowValue(2);

						@Getter @Setter private char[] uLineServiceCode51 = Field.fillLowValue(6);

								@Getter @Setter private int uLineDosDate51;

								@Getter @Setter private BigDecimal uLineChargeAmt51 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal uLineNotcovAmt51 = BigDecimal.ZERO;

						@Getter @Setter private char[] uLineRemarkCd51 = Field.fillLowValue(3);

								@Getter @Setter private int uLineAppUnits51;

						@Getter @Setter private char[] uLineDiagPointer51 = Field.fillLowValue(8);
	
	/**
	* Constructor for ULineData51
	**/
    public ULineData51() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ULineData51. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ULineData51(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
