package com.cloudframe.app.numeric0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] acctHbEqupSurchageOcc06 = Field.fillLowValue(28);

								@Getter @Setter private BigDecimal numDisp1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal numDec1 = BigDecimal.ZERO;

								@Getter @Setter private long int1;

								@Getter @Setter private int short1;

								@Getter @Setter private long long1;

								@Getter @Setter private BigDecimal numDisp2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal numDec2 = BigDecimal.ZERO;

								@Getter @Setter private long int2;

								@Getter @Setter private int short2;

								@Getter @Setter private long long2;

								@Getter @Setter private BigDecimal totAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal v9297 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal v9299 = BigDecimal.ZERO;

								@Getter @Setter private long comp918;

								@Getter @Setter private long comp3918;

								@Getter @Setter private BigDecimal v93Comp399 = BigDecimal.ZERO;

								@Getter @Setter private char[] dispPerUnitRate = Field.fillLowValue(15);

						@Getter @Setter private char[] rlu7jPerUnitRate = Field.fillLowValue(15);

								@Getter @Setter private BigDecimal v9399 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal v93915 = BigDecimal.ZERO;

								@Getter @Setter private short count;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setTotAmt(BigDecimal.ZERO);
								setV93915(BigDecimal.ZERO);
    }





}
  
