package com.cloudframe.app.comput.dto;

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
   

								@Getter @Setter private long w03a1DiComp3;

								@Getter @Setter private int w03a1DiComp;

								@Getter @Setter private BigDecimal w03a1DiDecimal = BigDecimal.ZERO;

								@Getter @Setter private short w03a1DiSmallint;

								@Getter @Setter private int w03a1DiInt;

								@Getter @Setter private long w03a1DiBigint;

								@Getter @Setter private BigDecimal w03a1DiReal;

								@Getter @Setter private BigDecimal w03a1DiDouble;

								@Getter @Setter private long w03a1DoComp3;

								@Getter @Setter private int w03a1DoComp;

								@Getter @Setter private BigDecimal w03a1DoDecimal = BigDecimal.ZERO;

								@Getter @Setter private short w03a1DoSmallint;

								@Getter @Setter private int w03a1DoInt;

								@Getter @Setter private long w03a1DoBigint;

								@Getter @Setter private BigDecimal w03a1DoReal;

								@Getter @Setter private BigDecimal w03a1DoDouble;

								@Getter @Setter private long hvStartDt81d;

								@Getter @Setter private int intOfDt1;

								@Getter @Setter private BigDecimal tb11148AdminAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal totAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal rlu3aMtnAcAcctChgsCredits = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal chrgCreditTotNotax = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w5v5A = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w5v5 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w3v2A = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w3v2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w3v2Result = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal pmslk402ListPrice = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wFeePromoxAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wChgAmtDec5 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal wcdloLeapYear = BigDecimal.ZERO;

								@Getter @Setter private int wcdliCurYyyy;

								@Getter @Setter private BigDecimal w1 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w2 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w3 = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal w4 = BigDecimal.ZERO;

								@Getter @Setter private int w5;

								@Getter @Setter private int ccatTitleSize;

								@Getter @Setter private int ccatCombinedSize;

								@Getter @Setter private char[] pctWoPrice = Field.fillLowValue(11);

								@Getter @Setter private BigDecimal pctWithNoPrice = BigDecimal.ZERO;

								@Getter @Setter private long recsWithoutPrice;

								@Getter @Setter private long detailRecs;

								@Getter @Setter private BigDecimal f = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal a = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal b = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal c = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal d = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal e = BigDecimal.ZERO;

								@Getter @Setter private int coordinatedGeneration;

								@Getter @Setter private int reportGen;

								@Getter @Setter private int cbsumGen;

								@Getter @Setter private int omsumpvGen;

								@Getter @Setter private int omauditGen;

								@Getter @Setter private int omencfGen;

								@Getter @Setter private long decimalNo300;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIntOfDt1(0);
								setTotAmt(BigDecimal.ZERO);
								setChrgCreditTotNotax(BigDecimal.ZERO);
								setWcdloLeapYear(BigDecimal.ZERO);
								setWcdliCurYyyy(0);
								setPctWithNoPrice(BigDecimal.ZERO);
								setRecsWithoutPrice(0L);
								setDetailRecs(0L);
								setDecimalNo300(0L);
    }





}
  
