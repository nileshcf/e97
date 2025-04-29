package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarafxs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Tarafxs extends TarafxsSerialized {
   

						@Getter @Setter private char[] tarafxsMcMnfrmFileNam = Field.fillLowValue(44);

								@Getter @Setter private short tarafxsCyclNum;

						@Getter @Setter private char[] tarafxsBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] tarafxsEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] tarafxsXferMthdCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxsAvailTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsBulkId = Field.fillLowValue(4);

						@Getter @Setter private char[] tarafxsStatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxsSndRcvPrmsnCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxsMcibdioParmTxt = Field.fillLowValue(50);

								@Getter @Setter private short tarafxsPrtyNum;

						@Getter @Setter private char[] tarafxsArchLocTxt = Field.fillLowValue(44);

						@Getter @Setter private char[] tarafxsSvrFileStatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxsLstStatTs = Field.fillLowValue(26);

								@Getter @Setter private long tarafxsXferFileSzNum;

								@Getter @Setter private int tarafxsTmsXferdCnt;

								@Getter @Setter private long tarafxsXferRecCnt;

						@Getter @Setter private char[] tarafxsXferRqstTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsXferStrtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsXferStopTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsXferRdyTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsXferCondCd = Field.fillLowValue(9);

						@Getter @Setter private char[] tarafxsXferStatTxt = Field.fillLowValue(9);

								@Getter @Setter private long tarafxsXferPrcssId;

								@Getter @Setter private long tarafxsOrgXferPrcsId;

						@Getter @Setter private char[] tarafxsTrgrCondCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxsTrgrStatTxt = Field.fillLowValue(9);

						@Getter @Setter private char[] tarafxsOrgLocNam = Field.fillLowValue(16);

						@Getter @Setter private char[] tarafxsLstUpdtUserId = Field.fillLowValue(9);

						@Getter @Setter private char[] tarafxsLstUpdtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsTrgrActNam = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxsPrvMnfrmFileNam = Field.fillLowValue(44);

								@Getter @Setter private short tarafxsPrvCyclNum;

						@Getter @Setter private char[] tarafxsPrvBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] tarafxsPrvEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] tarafxsPrvAvailTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsNxtMnfrmFileNam = Field.fillLowValue(44);

								@Getter @Setter private short tarafxsNxtCyclNum;

						@Getter @Setter private char[] tarafxsNxtBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] tarafxsNxtEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] tarafxsNxtAvailTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsApplExitJobNam = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxsApplExitTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsCsMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] tarafxsRmMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] tarafxsApplExitNam = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxsTapeCmpltdSw = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxsTapeMultVolSw = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxsApplPrcssngDt = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxsTransitionalDsn = Field.fillLowValue(44);

						@Getter @Setter private char[] tarafxsSourceHubId = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxsOwningHubId = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxsStatRefId = Field.fillLowValue(4);

						@Getter @Setter private char[] tarafxsSrcLocEntNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxsSrcTaskNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxsSrcTaskId = Field.fillLowValue(13);
				@Getter @Setter private TarafxsSrcTaskUsr tarafxsSrcTaskUsr = new TarafxsSrcTaskUsr();

						@Getter @Setter private char[] tarafxsSrcTaskStrtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsSrcTaskStopTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsTrgtLocEntNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxsTrgtTaskNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxsTrgtTaskId = Field.fillLowValue(13);
				@Getter @Setter private TarafxsTrgtTaskUsr tarafxsTrgtTaskUsr = new TarafxsTrgtTaskUsr();

						@Getter @Setter private char[] tarafxsTrgtTaskStrtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxsTrgtTaskStopTs = Field.fillLowValue(26);
				@Getter @Setter private TarafxsApplTknNam tarafxsApplTknNam = new TarafxsApplTknNam();
	
	/**
	* Constructor for Tarafxs
	**/
    public Tarafxs() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTarafxsSrcTaskUsr().setParent(this,getStartOffset() + 764);
					getTarafxsTrgtTaskUsr().setParent(this,getStartOffset() + 915);
					getTarafxsApplTknNam().setParent(this,getStartOffset() + 1033);
	   	/*  end of offset */
    }





}
  
