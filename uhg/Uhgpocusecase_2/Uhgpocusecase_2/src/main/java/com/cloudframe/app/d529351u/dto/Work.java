package com.cloudframe.app.d529351u.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short dsmFuncCd;

								@Getter @Setter private int sub;

								@Getter @Setter private int csSub;

								@Getter @Setter private int frtoSub;

								@Getter @Setter private int ptypSub;

								@Getter @Setter private int icdSub;

								@Getter @Setter private int fcndSub;

								@Getter @Setter private int causSub;

								@Getter @Setter private int ipaSub;

								@Getter @Setter private int cflgSub;

								@Getter @Setter private int mainCtr;

								@Getter @Setter private int planMatch;

								@Getter @Setter private long planEffDate;

								@Getter @Setter private long planCanDate;

						@Getter @Setter private char[] fetchEnd = new char[1];

						@Getter @Setter private char[] closeCsrInd = new char[1];

						@Getter @Setter private char[] fetchEndMain = new char[1];

						@Getter @Setter private char[] fetchEndFrto = new char[1];

						@Getter @Setter private char[] fetchEndPtyp = new char[1];

						@Getter @Setter private char[] fetchEndIcd = new char[1];

						@Getter @Setter private char[] fetchEndFcnd = new char[1];

						@Getter @Setter private char[] fetchEndComb = new char[1];

								@Getter @Setter private int sqlcode_Ws;

								@Getter @Setter private int dsnnrows;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSub(0);
								setCsSub(0);
								setFrtoSub(0);
								setPtypSub(0);
								setIcdSub(0);
								setFcndSub(0);
								setCausSub(0);
								setIpaSub(0);
								setCflgSub(0);
								setMainCtr(0);
								setPlanMatch(0);
								setPlanEffDate(0L);
								setPlanCanDate(0L);
								setFetchEnd(fillSpace(1));
								setCloseCsrInd(fillSpace(1));
								setFetchEndMain(fillSpace(1));
								setFetchEndFrto(fillSpace(1));
								setFetchEndPtyp(fillSpace(1));
								setFetchEndIcd(fillSpace(1));
								setFetchEndFcnd(fillSpace(1));
								setFetchEndComb(fillSpace(1));
    }





}
  
