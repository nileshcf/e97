package com.cloudframe.app.sf326010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] mipLogEofSw100 = new char[1];

								@Getter @Setter private short halfword8300;

								@Getter @Setter private short halfword13300;

								@Getter @Setter private short one300;

								@Getter @Setter private short twenty300;

						@Getter @Setter private char[] sf305120300 = new char[8];

						@Getter @Setter private char[] zLog300 = new char[1];

						@Getter @Setter private char[] charC300 = new char[1];

						@Getter @Setter private char[] charE300 = new char[1];

						@Getter @Setter private char[] charA300 = new char[1];

						@Getter @Setter private char[] charB300 = new char[1];

						@Getter @Setter private char[] charN300 = new char[1];

								@Getter @Setter private long sys001Lrecl400;

								@Getter @Setter private short sub400;

								@Getter @Setter private int assert1400;

								@Getter @Setter private int mipLogCnt400;

								@Getter @Setter private int zLogCnt400;

								@Getter @Setter private int zLogBypass400;

						@Getter @Setter private char[] execStartMsg600 = new char[64];

						@Getter @Setter private char[] currDateYyyy600 = new char[4];

						@Getter @Setter private char[] currDateMm600 = new char[2];

						@Getter @Setter private char[] currDateDd600 = new char[2];

						@Getter @Setter private char[] currTimeHh600 = new char[2];

						@Getter @Setter private char[] currTimeMm600 = new char[2];

						@Getter @Setter private char[] currTimeSs600 = new char[2];

						@Getter @Setter private char[] message6008000 = new char[62];

						@Getter @Setter private char[] message6008999 = new char[62];

						@Getter @Setter private char[] eojMessage6009400 = new char[44];

								@Getter @Setter private int tranlogTimeHh800;

								@Getter @Setter private int tranlogTimeMm800;

								@Getter @Setter private int tranlogTimeSs800;

								@Getter @Setter private int tranlogDateMm800;

								@Getter @Setter private int tranlogDateDd800;

								@Getter @Setter private int tranlogDateYy800;

								@Getter @Setter private int tranlogDateCc800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMipLogEofSw100(("N").toCharArray());
								setHalfword8300((short)8);
								setHalfword13300((short)13);
								setOne300((short)1);
								setTwenty300((short)20);
								setSf305120300(("SF305120").toCharArray());
								setZLog300(("Z").toCharArray());
								setCharC300(("C").toCharArray());
								setCharE300(("E").toCharArray());
								setCharA300(("A").toCharArray());
								setCharB300(("B").toCharArray());
								setCharN300(("N").toCharArray());
								setSys001Lrecl400(0L);
								setSub400((short)0);
								setAssert1400(0);
								setMipLogCnt400(0);
								setZLogCnt400(0);
								setZLogBypass400(0);
								setExecStartMsg600(pad(64,"SF326010-0001  EXTRACT Z-LOG RECORDS FROM MIP-LOG FILE".toCharArray(),' ',RIGHT_PAD));
								setCurrDateYyyy600(fillSpace(4));
								setCurrDateMm600(fillSpace(2));
								setCurrDateDd600(fillSpace(2));
								setCurrTimeHh600(fillSpace(2));
								setCurrTimeMm600(fillSpace(2));
								setCurrTimeSs600(fillSpace(2));
								setMessage6008000("SF326010-8000 ***** INPUT AND OUTPUT FILE RECORD COUNTS ******".toCharArray());
								setMessage6008999("SF326010-8999 ************** < END OF COUNTS > ***************".toCharArray());
								setEojMessage6009400(("SF326010-9999 COMPLETED SUCCESSFULLY        ").toCharArray());
								setTranlogTimeHh800(0);
								setTranlogTimeMm800(0);
								setTranlogTimeSs800(0);
								setTranlogDateMm800(0);
								setTranlogDateDd800(0);
								setTranlogDateYy800(0);
								setTranlogDateCc800(0);
    }





}
  
