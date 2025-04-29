package com.cloudframe.app.init1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] cDisplayJobnme = Field.fillLowValue(8);

						@Getter @Setter private char[] delayedCpduInd = new char[1];

						@Getter @Setter private char[] rejectCd = new char[3];

						@Getter @Setter private char[] bypassAcctFlag = new char[1];

						@Getter @Setter private char[] errRejFlag = new char[1];

						@Getter @Setter private char[] paygoSplanTableX = Field.fillLowValue(52);

								@Getter @Setter private short messageMaxCnt;

								@Getter @Setter private int i1;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDelayedCpduInd(("N").toCharArray());
								setRejectCd(fillSpace(3));
								setBypassAcctFlag(fillSpace(1));
								setErrRejFlag(fillSpace(1));
								setMessageMaxCnt((short)10);
								setI1(0);
    }





}
  
