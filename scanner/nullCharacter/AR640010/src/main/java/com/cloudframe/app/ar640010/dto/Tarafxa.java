package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarafxa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Tarafxa extends TarafxaSerialized {
   

						@Getter @Setter private char[] tarafxaMcMnfrmFileNam = Field.fillLowValue(44);

								@Getter @Setter private short tarafxaCyclNum;

						@Getter @Setter private char[] tarafxaBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] tarafxaEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] tarafxaXferMthdCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxaAvailTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaBulkId = Field.fillLowValue(4);

						@Getter @Setter private char[] tarafxaStatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxaSndRcvPrmsnCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxaMcibdioParmTxt = Field.fillLowValue(50);

								@Getter @Setter private short tarafxaPrtyNum;

						@Getter @Setter private char[] tarafxaArchLocTxt = Field.fillLowValue(44);

						@Getter @Setter private char[] tarafxaSvrFileStatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxaLstStatTs = Field.fillLowValue(26);

								@Getter @Setter private long tarafxaXferFileSzNum;

								@Getter @Setter private int tarafxaTmsXferdCnt;

								@Getter @Setter private long tarafxaXferRecCnt;

						@Getter @Setter private char[] tarafxaXferRqstTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaXferStrtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaXferStopTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaXferRdyTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaXferCondCd = Field.fillLowValue(9);

						@Getter @Setter private char[] tarafxaXferStatTxt = Field.fillLowValue(9);

								@Getter @Setter private long tarafxaXferPrcssId;

								@Getter @Setter private long tarafxaOrgXferPrcsId;

						@Getter @Setter private char[] tarafxaTrgrCondCd = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxaTrgrStatTxt = Field.fillLowValue(9);

						@Getter @Setter private char[] tarafxaOrgLocNam = Field.fillLowValue(16);

						@Getter @Setter private char[] tarafxaLstUpdtUserId = Field.fillLowValue(9);

						@Getter @Setter private char[] tarafxaLstUpdtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaTrgrActNam = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxaPrvMnfrmFileNam = Field.fillLowValue(44);

								@Getter @Setter private short tarafxaPrvCyclNum;

						@Getter @Setter private char[] tarafxaPrvBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] tarafxaPrvEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] tarafxaPrvAvailTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaNxtMnfrmFileNam = Field.fillLowValue(44);

								@Getter @Setter private short tarafxaNxtCyclNum;

						@Getter @Setter private char[] tarafxaNxtBusPrtnrId = Field.fillLowValue(6);

						@Getter @Setter private char[] tarafxaNxtEndptId = Field.fillLowValue(7);

						@Getter @Setter private char[] tarafxaNxtAvailTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaApplExitJobNam = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxaApplExitTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaCsMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] tarafxaRmMipId = Field.fillLowValue(3);

						@Getter @Setter private char[] tarafxaApplExitNam = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxaTapeCmpltdSw = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxaTapeMultVolSw = Field.fillLowValue(1);

						@Getter @Setter private char[] tarafxaApplPrcssngDt = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxaTransitionalDsn = Field.fillLowValue(44);

						@Getter @Setter private char[] tarafxaSourceHubId = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxaOwningHubId = Field.fillLowValue(8);

						@Getter @Setter private char[] tarafxaStatRefId = Field.fillLowValue(4);

						@Getter @Setter private char[] tarafxaSrcLocEntNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxaSrcTaskNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxaSrcTaskId = Field.fillLowValue(13);
				@Getter @Setter private TarafxaSrcTaskUsr tarafxaSrcTaskUsr = new TarafxaSrcTaskUsr();

						@Getter @Setter private char[] tarafxaSrcTaskStrtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaSrcTaskStopTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaTrgtLocEntNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxaTrgtTaskNam = Field.fillLowValue(10);

						@Getter @Setter private char[] tarafxaTrgtTaskId = Field.fillLowValue(13);
				@Getter @Setter private TarafxaTrgtTaskUsr tarafxaTrgtTaskUsr = new TarafxaTrgtTaskUsr();

						@Getter @Setter private char[] tarafxaTrgtTaskStrtTs = Field.fillLowValue(26);

						@Getter @Setter private char[] tarafxaTrgtTaskStopTs = Field.fillLowValue(26);
				@Getter @Setter private TarafxaApplTknNam tarafxaApplTknNam = new TarafxaApplTknNam();
	
	/**
	* Constructor for Tarafxa
	**/
    public Tarafxa() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTarafxaSrcTaskUsr().setParent(this,getStartOffset() + 764);
					getTarafxaTrgtTaskUsr().setParent(this,getStartOffset() + 915);
					getTarafxaApplTknNam().setParent(this,getStartOffset() + 1033);
	   	/*  end of offset */
    }





}
  
