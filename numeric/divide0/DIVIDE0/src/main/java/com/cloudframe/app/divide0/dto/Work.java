package com.cloudframe.app.divide0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short ip20004ItemLength;

								@Getter @Setter private short tmpLth800;

								@Getter @Setter private BigDecimal decimal = BigDecimal.ZERO;

								@Getter @Setter private char[] editFld1 = Field.fillLowValue(5);

								@Getter @Setter private char[] editFld2 = Field.fillLowValue(6);

								@Getter @Setter private long fbTotalVolume;

								@Getter @Setter private char[] daPcntHoldDisp = Field.fillLowValue(8);

								@Getter @Setter private char[] daPercentDisp = Field.fillLowValue(6);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
