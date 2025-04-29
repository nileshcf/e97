package com.cloudframe.app.ar640010.dto;

/**
*  The class RequestParms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RequestParms1000 extends RequestParms1000Serialized {
   

						@Getter @Setter private char[] functionRequest1000 = new char[1];

						@Getter @Setter private char[] bulkId1000 = new char[4];

						@Getter @Setter private char[] endptId1000 = new char[7];

						@Getter @Setter private char[] deleteInd1000 = new char[1];

						@Getter @Setter private char[] cyclNum1000 = new char[3];
				@Getter @Setter private CyclNum1000Redefined cyclNum1000Redefined = new CyclNum1000Redefined();

						@Getter @Setter private char[] listBroadcastDd1000 = new char[8];
				@Getter @Setter private ApplicationDsn1000 applicationDsn1000 = new ApplicationDsn1000();
				@Getter @Setter private GftDsn1000 gftDsn1000 = new GftDsn1000();
				@Getter @Setter private GftRetrieveDsn1000 gftRetrieveDsn1000 = new GftRetrieveDsn1000();

						@Getter @Setter private char[] broadcastResult1000 = new char[8];
				@Getter @Setter private ProcDate1000 procDate1000 = new ProcDate1000();

								@Getter @Setter private int recCount1000;

								@Getter @Setter private int byteCount1000;
				@Getter @Setter private ApplicationPdsDsn1000 applicationPdsDsn1000 = new ApplicationPdsDsn1000();

								@Getter @Setter private int recCountLarge1000;

								@Getter @Setter private long byteCountLarge1000;

						@Getter @Setter private char[] tknname1000 = new char[128];
	
	/**
	* Constructor for RequestParms1000
	**/
    public RequestParms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCyclNum1000Redefined().setParent(this,getStartOffset() + 13);
					getApplicationDsn1000().setParent(this,getStartOffset() + 24);
					getGftDsn1000().setParent(this,getStartOffset() + 68);
					getGftRetrieveDsn1000().setParent(this,getStartOffset() + 68);
					getProcDate1000().setParent(this,getStartOffset() + 120);
					getApplicationPdsDsn1000().setParent(this,getStartOffset() + 138);
	   	/*  end of offset */
								setFunctionRequest1000(fillSpace(1));
								setBulkId1000(fillSpace(4));
								setEndptId1000(fillSpace(7));
								setDeleteInd1000(fillSpace(1));
								setCyclNum1000(fillSpace(3));
								setListBroadcastDd1000(fillSpace(8));
								setBroadcastResult1000(fillSpace(8));
							getProcDate1000().setString(fillSpace(10));
								setRecCount1000(0);
								setByteCount1000(0);
								setRecCountLarge1000(0);
								setByteCountLarge1000(0L);
								setTknname1000(pad(128," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
