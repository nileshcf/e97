package com.cloudframe.app.ar640010.dto;

/**
*  The class ResponseParms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ResponseParms1000 extends ResponseParms1000Serialized {
   

						@Getter @Setter private char[] functionResponse1000 = new char[4];

								@Getter @Setter private int requestNbr1000;

						@Getter @Setter private char[] responseDsn1000 = new char[44];

								@Getter @Setter private int bulkFilesAvail1000;

						@Getter @Setter private char[] allocUnitType1000 = new char[1];

								@Getter @Setter private int allocUnitsUsed1000;

						@Getter @Setter private char[] recfm1000 = new char[3];

								@Getter @Setter private int lrecl1000;

								@Getter @Setter private int blksz1000;

								@Getter @Setter private int recordCopyCnt1000;

								@Getter @Setter private int broadcastEndpts1000;

								@Getter @Setter private int broadcastErrors1000;

						@Getter @Setter private char[] responseMessage1000 = new char[50];
				@Getter @Setter private ResponseMessage1000Redefined responseMessage1000Redefined = new ResponseMessage1000Redefined();

						@Getter @Setter private char[] applProcDate1000 = new char[10];

						@Getter @Setter private char[] applProcDateJul1000 = new char[3];

						@Getter @Setter private char[] responseBusPrtnrId1000 = new char[6];

						@Getter @Setter private char[] responseIca1000 = Field.fillLowValue(6);

						@Getter @Setter private char[] responseTknname1000 = new char[128];

						@Getter @Setter private char[] responseGftDsnFail1000 = new char[44];
	
	/**
	* Constructor for ResponseParms1000
	**/
    public ResponseParms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getResponseMessage1000Redefined().setParent(this,getStartOffset() + 85);
	   	/*  end of offset */
								setFunctionResponse1000(("0000").toCharArray());
								setRequestNbr1000(0);
								setResponseDsn1000(fillSpace(44));
								setBulkFilesAvail1000(0);
								setAllocUnitType1000(fillSpace(1));
								setAllocUnitsUsed1000(0);
								setRecfm1000(fillSpace(3));
								setLrecl1000(0);
								setBlksz1000(0);
								setRecordCopyCnt1000(0);
								setBroadcastEndpts1000(0);
								setBroadcastErrors1000(0);
								setResponseMessage1000(fillSpace(50));
								setApplProcDate1000(fillSpace(10));
								setApplProcDateJul1000(fillSpace(3));
								setResponseBusPrtnrId1000(fillSpace(6));
								setResponseTknname1000(pad(128," ".toCharArray(),' ',RIGHT_PAD));
								setResponseGftDsnFail1000(fillSpace(44));
    }





}
  
