package com.cloudframe.app.gp004760.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.utility.CFUtil;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] sys201FileStatus200 = new char[2];

						@Getter @Setter private char[] sys202FileStatus200 = new char[2];

						@Getter @Setter private char[] statusCode300 = new char[25];

						@Getter @Setter private char[] abendCode300 = new char[4];

						@Getter @Setter private char[] errorMessage600 = new char[40];

								@Getter @Setter private int statusCode600;

						@Getter @Setter private char[] displayAbendMsgTxt600 = new char[480];

						@Getter @Setter private char[] abendPara300 = new char[35];

								@Getter @Setter private long idx800;

								@Getter @Setter private long sub800;

								@Getter @Setter private short plusOneHundred300;

						@Getter @Setter private char[] cabtccextCsr100 = new char[1];

								@Getter @Setter private long outfileCnt;

								@Getter @Setter private int ocrCnt;

						@Getter @Setter private char[] thisPgmDb2CollIdBase300 = new char[7];

						@Getter @Setter private char[] db2ErrModule300 = new char[8];

						@Getter @Setter private char[] outputCntMsg600 = new char[43];

								@Getter @Setter private char[] wsSqlcodeDisp800 = new char[4];
							

						@Getter @Setter private char[] wsCurrParagraph800 = new char[30];

						@Getter @Setter private char[] wsSqlFunction800 = new char[25];

						@Getter @Setter private char[] wsCurrTable800 = new char[25];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSys201FileStatus200(fillSpace(2));
								setSys202FileStatus200(fillSpace(2));
								setStatusCode300(("GP004760 : STATUS CODE : ").toCharArray());
								setAbendCode300(fillSpace(4));
								setErrorMessage600(fillSpace(40));
								setStatusCode600(0);
								setDisplayAbendMsgTxt600("************************************************************************************************************************A B E N D          A B E N D          A B E N D                                                                         A B E N D       G P 0 0 4 7 6 0       A B E N D                                                                         ************************************************************************************************************************".toCharArray());
								setAbendPara300(fillSpace(35));
								setPlusOneHundred300((short)100);
								setCabtccextCsr100(("N").toCharArray());
								setThisPgmDb2CollIdBase300(("COLLGPA").toCharArray());
								setDb2ErrModule300(("DB200020").toCharArray());
								setOutputCntMsg600(("TOTAL OUTPUT RECORDS WRITTEN:              ").toCharArray());
								setWsSqlcodeDisp800(CFUtil.cobolNumberFormatter("-999".toCharArray(),"0".toCharArray()));
								setWsCurrParagraph800(fillSpace(30));
								setWsSqlFunction800(fillSpace(25));
								setWsCurrTable800(fillSpace(25));
    }





}
  
