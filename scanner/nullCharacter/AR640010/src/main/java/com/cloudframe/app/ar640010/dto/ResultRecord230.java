package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultRecord230 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ResultRecord230 extends ResultRecord230Serialized {
   

						@Getter @Setter private char[] resultJobTs230 = new char[19];

						@Getter @Setter private char[] resultJobName230 = new char[8];

						@Getter @Setter private char[] resultStepName230 = new char[8];

						@Getter @Setter private char[] resultProcStep230 = new char[8];

						@Getter @Setter private char[] resultJobId230 = new char[8];

						@Getter @Setter private char[] resultDbId230 = new char[8];

						@Getter @Setter private char[] resultDbPkg230 = new char[16];

						@Getter @Setter private char[] resultCpuId230 = new char[8];

								@Getter @Setter private int resultRequest230;

						@Getter @Setter private char[] resultEndptId230 = new char[7];

						@Getter @Setter private char[] resultBulkId230 = new char[4];

								@Getter @Setter private short resultCyclNum230;

						@Getter @Setter private char[] resultStatus230 = new char[6];

						@Getter @Setter private char[] resultReason230 = new char[30];

						@Getter @Setter private char[] resultTs230 = new char[26];

						@Getter @Setter private char[] resultListDd230 = new char[8];

						@Getter @Setter private char[] resultListDsn230 = new char[54];

						@Getter @Setter private char[] resultExitNam230 = new char[8];

						@Getter @Setter private char[] resultExitDsn230 = new char[44];

						@Getter @Setter private char[] resultCodeExit230 = new char[1];
	
	/**
	* Constructor for ResultRecord230
	**/
    public ResultRecord230() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setResultJobTs230(fillSpace(19));
								setResultJobName230(fillSpace(8));
								setResultStepName230(fillSpace(8));
								setResultProcStep230(fillSpace(8));
								setResultJobId230(fillSpace(8));
								setResultDbId230(fillSpace(8));
								setResultDbPkg230(fillSpace(16));
								setResultCpuId230(fillSpace(8));
								setResultRequest230(0);
								setResultEndptId230(fillSpace(7));
								setResultBulkId230(fillSpace(4));
								setResultCyclNum230((short)0);
								setResultStatus230(fillSpace(6));
								setResultReason230(fillSpace(30));
								setResultTs230(fillSpace(26));
								setResultListDd230(fillSpace(8));
								setResultListDsn230(fillSpace(54));
								setResultExitNam230(fillSpace(8));
								setResultExitDsn230(fillSpace(44));
								setResultCodeExit230(fillSpace(1));
    }





}
  
