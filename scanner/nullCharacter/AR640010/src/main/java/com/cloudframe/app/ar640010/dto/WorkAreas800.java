package com.cloudframe.app.ar640010.dto;

/**
*  The class WorkAreas800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;


@Data
public class WorkAreas800 extends WorkAreas800Serialized {
   

								@Getter @Setter private short idx800;
				@Getter @Setter private Psa800 psa800 = new Psa800();

								@Getter @Setter private short spaceCnt800;

								@Getter @Setter private short wrdLength800;

						@Getter @Setter private char[] tempTxt800 = new char[128];

								@Getter @Setter private short sub1800;

								@Getter @Setter private short sub2800;

								@Getter @Setter private short sub3800;

								@Getter @Setter private short sub4800;

								@Getter @Setter private short sub5800;

								@Getter @Setter private short parmCnt1800;

								@Getter @Setter private short parmCnt2800;

						@Getter @Setter private char[] parmText800 = new char[1024];

						@Getter @Setter private char[] parmText1800 = new char[15];

						@Getter @Setter private char[] parmText2800 = new char[10];

								@Getter @Setter private long parmNum800;

								@Getter @Setter private long parmNum1800;

								@Getter @Setter private long parmNum2800;

								@Getter @Setter private int sub800;
				@Getter @Setter private FunctionTs800 functionTs800 = new FunctionTs800();

								@Getter @Setter private long jan1stDate800;

						@Getter @Setter private char[] fileDsnFull800 = new char[54];
				@Getter @Setter private PgmTs800 pgmTs800 = new PgmTs800();

								@Getter @Setter private int pgmJulDay800;

						@Getter @Setter private char[] listDsn800 = new char[54];
				@Getter @Setter private ResultFill800 resultFill800 = new ResultFill800();

								@Getter @Setter private char[] numericWrk1800 = new char[13];
							

								@Getter @Setter private short numericPos1800;

								@Getter @Setter private char[] numericWrk2800 = new char[13];
							

								@Getter @Setter private short numericPos2800;

								@Getter @Setter private char[] sqlcodeDisplay800 = Field.fillLowValue(9);
	
	/**
	* Constructor for WorkAreas800
	**/
    public WorkAreas800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getPsa800().setParent(this,getStartOffset() + 2);
					getFunctionTs800().setParent(this,getStartOffset() + 1235);
					getPgmTs800().setParent(this,getStartOffset() + 1318);
					getResultFill800().setParent(this,getStartOffset() + 1401);
	   	/*  end of offset */
								setIdx800((short)0);
								setSpaceCnt800((short)0);
								setWrdLength800((short)0);
								setTempTxt800(pad(128," ".toCharArray(),' ',RIGHT_PAD));
								setSub1800((short)0);
								setSub2800((short)0);
								setSub3800((short)0);
								setSub4800((short)0);
								setSub5800((short)0);
								setParmCnt1800((short)0);
								setParmCnt2800((short)0);
								setParmText800(pad(1024," ".toCharArray(),' ',RIGHT_PAD));
								setParmText1800(fillSpace(15));
								setParmText2800(fillSpace(10));
								setParmNum800(0L);
								setParmNum1800(0L);
								setParmNum2800(0L);
								setSub800(0);
							getFunctionTs800().setString(fillSpace(21));
								setJan1stDate800(101L);
								setFileDsnFull800(fillSpace(54));
								setPgmJulDay800(0);
								setListDsn800(fillSpace(54));
								setNumericWrk1800(fillSpace(13));
								setNumericPos1800((short)0);
								setNumericWrk2800(fillSpace(13));
								setNumericPos2800((short)0);
    }





}
  
