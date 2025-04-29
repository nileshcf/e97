package com.cloudframe.app.cfif01.dto;

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
   

						@Getter @Setter private char[] wmbcsCsCharacter = Field.fillLowValue(1);

						@Getter @Setter private char[] wmbcsShiftOutPc = new char[1];

						@Getter @Setter private char[] wmbcsShiftInPc = new char[1];

						@Getter @Setter private char[] cisoutWorkRec = Field.fillLowValue(8);

						@Getter @Setter private char[] cond = Field.fillLowValue(6);

								@Getter @Setter private char[] wS1 = Field.fillLowValue(12);

								@Getter @Setter private char[] wS2 = Field.fillLowValue(13);

								@Getter @Setter private BigDecimal from = BigDecimal.ZERO;

								@Getter @Setter private int tempMktgCd;

						@Getter @Setter private char[] revoDnsCd = Field.fillLowValue(5);

								@Getter @Setter private int currentMonth;

						@Getter @Setter private char[] monthRange = Field.fillLowValue(2);

								@Getter @Setter private int delayCustIdNo;

						@Getter @Setter private char[] delayMtn = Field.fillLowValue(10);

						@Getter @Setter private char[] delayBillPeriod = Field.fillLowValue(1);

						@Getter @Setter private char[] delayMeasCd = Field.fillLowValue(2);

						@Getter @Setter private char[] delaydatEofSw = new char[1];

						@Getter @Setter private char[] readDelaydatSw = new char[1];

								@Getter @Setter private int billku00CustIdNo;

						@Getter @Setter private char[] billku00Mtn = Field.fillLowValue(10);

						@Getter @Setter private char[] x4 = new char[4];

						@Getter @Setter private char[] x3 = new char[3];

						@Getter @Setter private char[] batchId = new char[3];

								@Getter @Setter private int oinGeoCd;

						@Getter @Setter private char[] tranCode = new char[4];

						@Getter @Setter private char[] parmState = Field.fillLowValue(2);

						@Getter @Setter private char[] parmTyperun = Field.fillLowValue(4);

						@Getter @Setter private char[] parmRao = Field.fillLowValue(3);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWmbcsShiftOutPc(getString(new byte[] {(byte)0x0E}).toCharArray());
								setWmbcsShiftInPc(getString(new byte[] {(byte)0x0F}).toCharArray());
								setTempMktgCd(0);
								setCurrentMonth(10);
								setDelaydatEofSw(fillLowValue(1));
								setReadDelaydatSw(fillSpace(1));
								setX4(("ABC ").toCharArray());
								setX3(("ABC").toCharArray());
								setBatchId(fillSpace(3));
								setTranCode(fillSpace(4));
    }





}
  
