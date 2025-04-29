package com.cloudframe.app.multi0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private BigDecimal wrkDb1dayFlt = BigDecimal.ZERO;

								@Getter @Setter private char[] wrkDb1dayFltDisp = Field.fillLowValue(11);

								@Getter @Setter private BigDecimal axisWpCoiAccum = BigDecimal.ZERO;

								@Getter @Setter private int axisWpCoiRound;

								@Getter @Setter private char[] axisWpCoiRoundDisp = Field.fillLowValue(10);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
