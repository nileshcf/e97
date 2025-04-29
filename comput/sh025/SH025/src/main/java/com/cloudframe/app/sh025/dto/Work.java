package com.cloudframe.app.sh025.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private BigDecimal wvVolExposed = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal dealgpalAllocWgtnNum = BigDecimal.ZERO;

								@Getter @Setter private char[] wvVolExposedEdit = Field.fillLowValue(15);

								@Getter @Setter private char[] wvExtrOUsdValue = Field.fillLowValue(10);

								@Getter @Setter private BigDecimal pcstlogUsdCostValue = BigDecimal.ZERO;

								@Getter @Setter private char[] wvExtrOUsdValue2 = Field.fillLowValue(12);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
