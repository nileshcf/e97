package com.cloudframe.app.ar640010.dto;

/**
*  The class ReqWorkAreas810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ReqWorkAreas810 extends ReqWorkAreas810Serialized {
   

						@Getter @Setter private char[] applTkn810 = new char[128];

						@Getter @Setter private char[] functionTs810 = new char[26];

						@Getter @Setter private char[] bulkId810 = new char[4];

						@Getter @Setter private char[] endptId810 = new char[7];

						@Getter @Setter private char[] endptIdOrig810 = new char[7];

						@Getter @Setter private char[] busPrtnrIdOrig810 = new char[6];

								@Getter @Setter private short cyclNum810;
				@Getter @Setter private CyclNumRange810 cyclNumRange810 = new CyclNumRange810();

						@Getter @Setter private char[] busPrtnrId810 = new char[6];
				@Getter @Setter private ProcDate810 procDate810 = new ProcDate810();

								@Getter @Setter private int procJulDay810;

								@Getter @Setter private long computeDate810;

						@Getter @Setter private char[] statCd810 = new char[1];

						@Getter @Setter private char[] xferMthdCd810 = new char[1];

						@Getter @Setter private char[] xferTypeCd810 = new char[1];

						@Getter @Setter private char[] sndRcvPrmsnCd810 = new char[1];

						@Getter @Setter private char[] renameHlq810 = new char[8];

						@Getter @Setter private char[] renameSystemId810 = new char[8];

						@Getter @Setter private char[] preExitDsn810 = new char[44];
				@Getter @Setter private ApplExitWork810 applExitWork810 = new ApplExitWork810();

						@Getter @Setter private char[] rteToHubSw810 = new char[1];
	
	/**
	* Constructor for ReqWorkAreas810
	**/
    public ReqWorkAreas810() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCyclNumRange810().setParent(this,getStartOffset() + 180);
					getProcDate810().setParent(this,getStartOffset() + 190);
					getApplExitWork810().setParent(this,getStartOffset() + 275);
	   	/*  end of offset */
								setApplTkn810(pad(128," ".toCharArray(),' ',RIGHT_PAD));
								setFunctionTs810(fillSpace(26));
								setBulkId810(fillSpace(4));
								setEndptId810(fillSpace(7));
								setEndptIdOrig810(fillSpace(7));
								setBusPrtnrIdOrig810(fillSpace(6));
								setCyclNum810((short)0);
								setBusPrtnrId810(fillSpace(6));
								setProcJulDay810(0);
								setComputeDate810(0L);
								setStatCd810(fillSpace(1));
								setXferMthdCd810(fillSpace(1));
								setXferTypeCd810(fillSpace(1));
								setSndRcvPrmsnCd810(fillSpace(1));
								setRenameHlq810(fillSpace(8));
								setRenameSystemId810(fillSpace(8));
								setPreExitDsn810(fillSpace(44));
								setRteToHubSw810(fillSpace(1));
    }





}
  
