package com.cloudframe.app.init1.dto;

/**
*  The class WscdlCalDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class WscdlCalDate extends WscdlCalDateSerialized {
   

								@Getter @Setter private int wcdliBlCycNo;

								@Getter @Setter private int wcdliCurMm;

								@Getter @Setter private int wcdliCurYyyy;

						@Getter @Setter private char[] wcdliPrevCycDtInd = new char[1];

						@Getter @Setter private char[] wcdliNextCycDtInd = new char[1];
				@Getter @Setter private WcdloCycStartDt wcdloCycStartDt = new WcdloCycStartDt();
				@Getter @Setter private WcdloCycEndDt wcdloCycEndDt = new WcdloCycEndDt();
				@Getter @Setter private WcdloDateChar wcdloDateChar = new WcdloDateChar();

								@Getter @Setter private long wcdloStartDateIso;

								@Getter @Setter private long wcdloEndDateIso;
				@Getter @Setter private WcdloDateTable wcdloDateTable = new WcdloDateTable();

								@Getter @Setter private int wcdloHoldCurMm;

								@Getter @Setter private int wcdloHoldCurYyyy;

						@Getter @Setter private char[] wcdloHoldStartDt = new char[10];

								@Getter @Setter private long wcdloHoldStartDtIso;

						@Getter @Setter private char[] wcdloHoldEndDt = new char[10];

								@Getter @Setter private long wcdloHoldEndDtIso;

								@Getter @Setter private BigDecimal wcdloLeapYear = BigDecimal.ZERO;

						@Getter @Setter private char[] wcdloLeapYearSw = new char[1];

						@Getter @Setter private char[] wcdloValidationRsn = new char[1];

								@Getter @Setter private int wcdloValidCycles;

								@Getter @Setter private int wcdloValidMonths;

								@Getter @Setter private int wcdloCurMm;
	
	/**
	* Constructor for WscdlCalDate
	**/
    public WscdlCalDate() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWcdloCycStartDt().setParent(this,getStartOffset() + 10);
					getWcdloCycEndDt().setParent(this,getStartOffset() + 20);
					getWcdloDateChar().setParent(this,getStartOffset() + 30);
					getWcdloDateTable().setParent(this,getStartOffset() + 90);
	   	/*  end of offset */
								setWcdliBlCycNo(0);
								setWcdliCurMm(0);
								setWcdliCurYyyy(0);
								setWcdliPrevCycDtInd(fillSpace(1));
								setWcdliNextCycDtInd(fillSpace(1));
								setWcdloHoldCurMm(0);
								setWcdloHoldCurYyyy(0);
								setWcdloHoldStartDt(fillSpace(10));
								setWcdloHoldStartDtIso(0L);
								setWcdloHoldEndDt(fillSpace(10));
								setWcdloHoldEndDtIso(0L);
								setWcdloLeapYear(BigDecimal.ZERO);
								setWcdloLeapYearSw(fillSpace(1));
								setWcdloValidationRsn(fillSpace(1));
								setWcdloValidCycles(0);
								setWcdloValidMonths(0);
								setWcdloCurMm(0);
    }





}
  
