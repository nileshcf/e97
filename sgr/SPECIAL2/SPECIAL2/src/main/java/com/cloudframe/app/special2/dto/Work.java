package com.cloudframe.app.special2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int cnt1r;

								@Getter @Setter private char[] edit = Field.fillLowValue(11);

								@Getter @Setter private BigDecimal cnt2r = BigDecimal.ZERO;

								@Getter @Setter private char[] edit2 = Field.fillLowValue(12);

								@Getter @Setter private BigDecimal cnt3r = BigDecimal.ZERO;

								@Getter @Setter private char[] edit3 = Field.fillLowValue(8);

								@Getter @Setter private char[] bhDisplay = Field.fillLowValue(11);

								@Getter @Setter private BigDecimal bodyHeight = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal numericFlag = BigDecimal.ZERO;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCnt3r(BigDecimal.valueOf(9876.25).setScale(2));
								setBodyHeight(BigDecimal.ZERO);
    }





}
  
