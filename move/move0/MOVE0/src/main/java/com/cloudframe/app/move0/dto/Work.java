package com.cloudframe.app.move0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int sub1;

						@Getter @Setter private char[] label = Field.fillLowValue(5);

						@Getter @Setter private char[] wrkaApplication = Field.fillLowValue(2);

						@Getter @Setter private char[] rl6bfMonthlyAllowText1 = Field.fillLowValue(15);

						@Getter @Setter private char[] lkplanDataAllowUom = Field.fillLowValue(10);

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

								@Getter @Setter private char[] edit = Field.fillLowValue(21);

								@Getter @Setter private BigDecimal numDisp3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal numDec3 = BigDecimal.ZERO;

								@Getter @Setter private int int3;

								@Getter @Setter private short short3;

								@Getter @Setter private long long3;

								@Getter @Setter private BigDecimal numDisp4 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal numDec4 = BigDecimal.ZERO;

								@Getter @Setter private int int4;

								@Getter @Setter private short short4;

								@Getter @Setter private long long4;

						@Getter @Setter private char[] beginning = new char[10];

						@Getter @Setter private char[] ending = new char[10];

								@Getter @Setter private BigDecimal d10 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d20 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d30 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d40 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d50 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d60 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d70 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d80 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d11 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d21 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d31 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d41 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d51 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d61 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d71 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d81 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p10 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p20 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p30 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p40 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p50 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p60 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p70 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p80 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p11 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p21 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p31 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p41 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p51 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p61 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p71 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal p81 = BigDecimal.ZERO;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBeginning(String.join("", java.util.Collections.nCopies(10, ">")).toCharArray());
								setEnding(String.join("", java.util.Collections.nCopies(10, "<")).toCharArray());
    }





}
  
