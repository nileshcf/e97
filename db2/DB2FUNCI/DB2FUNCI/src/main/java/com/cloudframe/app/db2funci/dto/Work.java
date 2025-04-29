package com.cloudframe.app.db2funci.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private BigDecimal cntngYldRt = BigDecimal.ZERO;

								@Getter @Setter private char[] bdms01CntngYldRtEdt = Field.fillLowValue(16);

								@Getter @Setter private long isinCnt;

								@Getter @Setter private char[] decimalEdit = Field.fillLowValue(16);

								@Getter @Setter private int ctryHoliCt;

								@Getter @Setter private char[] sqlcodeDisp = Field.fillLowValue(5);

						@Getter @Setter private char[] sysinFlag = new char[1];

						@Getter @Setter private char[] procnm = Field.fillLowValue(18);

						@Getter @Setter private char[] schema = Field.fillLowValue(8);

								@Getter @Setter private int numCursors;

								@Getter @Setter private int outCode;

								@Getter @Setter private short parmind;

						@Getter @Setter private char[] isinCursorFlg = new char[1];

						@Getter @Setter private char[] loc1 = Field.fillLowValue(0);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCtryHoliCt(0);
								setSysinFlag(fillSpace(1));
								setIsinCursorFlg(fillSpace(1));
    }





}
  
