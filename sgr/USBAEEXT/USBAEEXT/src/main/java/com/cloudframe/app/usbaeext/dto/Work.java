package com.cloudframe.app.usbaeext.dto;

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
   

						@Getter @Setter private char[] waEndSw = new char[1];

								@Getter @Setter private int waReturnCode;

								@Getter @Setter private long tmAdjNo;

								@Getter @Setter private long tmAdjTime;

						@Getter @Setter private char[] tmAdjAcct = Field.fillLowValue(18);

						@Getter @Setter private char[] tmAdjDepDdrKey = Field.fillLowValue(8);

						@Getter @Setter private char[] tmAdjPset = Field.fillLowValue(1);

						@Getter @Setter private char[] tmAdjDdrKey = Field.fillLowValue(8);

						@Getter @Setter private char[] tmAdjDepAcct = Field.fillLowValue(18);

								@Getter @Setter private BigDecimal tmAdjDepAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal tmAdjCorrAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] tmAdjClass = Field.fillLowValue(2);

						@Getter @Setter private char[] tmAdjCode = Field.fillLowValue(3);

						@Getter @Setter private char[] tmAdjName = Field.fillLowValue(15);

						@Getter @Setter private char[] tmAdjOperNo = Field.fillLowValue(3);

						@Getter @Setter private char[] tmAdjEntryKey = Field.fillLowValue(5);

						@Getter @Setter private char[] tmAdjState = Field.fillLowValue(3);

						@Getter @Setter private char[] tmAdjComment = Field.fillLowValue(50);

						@Getter @Setter private char[] tmAdjRt = Field.fillLowValue(9);

								@Getter @Setter private BigDecimal tmAdjAmt = BigDecimal.ZERO;

						@Getter @Setter private char[] tmAdjItemClass = Field.fillLowValue(2);

						@Getter @Setter private char[] tmAdjFirstDrn = Field.fillLowValue(20);

						@Getter @Setter private char[] tmAdjDrn = Field.fillLowValue(20);

						@Getter @Setter private char[] tmAdjLookupText = Field.fillLowValue(30);

						@Getter @Setter private char[] tmAdjAdviceKey = Field.fillLowValue(8);

						@Getter @Setter private char[] tmAdjCorrF5 = Field.fillLowValue(10);

						@Getter @Setter private char[] tmAdjDepF5 = Field.fillLowValue(10);

						@Getter @Setter private char[] tmAdjAppInstance = Field.fillLowValue(2);

						@Getter @Setter private char[] tmAdjEntry = Field.fillLowValue(4);

						@Getter @Setter private char[] tmAdjCycle = Field.fillLowValue(1);

						@Getter @Setter private char[] tmAdjEnd = Field.fillLowValue(3);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWaEndSw(fillLowValue(1));
								setWaReturnCode(0);
    }





}
  
