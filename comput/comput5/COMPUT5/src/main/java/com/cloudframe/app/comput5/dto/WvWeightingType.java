package com.cloudframe.app.comput5.dto;

/**
*  The class WvWeightingType is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;


@Data
public class WvWeightingType extends WvWeightingTypeSerialized { 
   

						@Getter @Setter private char[] wvWeight = Field.fillLowValue(5);

								@Getter @Setter private BigDecimal wvFmse = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wvTotal = BigDecimal.ZERO;
      private List<BigDecimal> wvMonthlyExpo; 

	
	/**
	* Constructor for WvWeightingType
	**/
    public WvWeightingType() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WvWeightingType. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvWeightingType(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
