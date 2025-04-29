package com.cloudframe.app.vsammon9.file.records;

/**
*  The class MonitorRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MonitorRecord extends MonitorRecordSerialized {
   
				@Getter @Setter private MonPriKey monPriKey = new MonPriKey();

						@Getter @Setter private char[] monXctorSysId = Field.fillLowValue(4);

						@Getter @Setter private char[] monXctorTranId = Field.fillLowValue(4);

						@Getter @Setter private char[] monXcaorSysId = Field.fillLowValue(4);

								@Getter @Setter private int monXcaorTskNo;

						@Getter @Setter private char[] monXcdtPgmTyCd = Field.fillLowValue(35);

						@Getter @Setter private char[] monXcdtReqrIpAd = Field.fillLowValue(15);

								@Getter @Setter private int monXcdtTskAorTm;

								@Getter @Setter private int monXcdtTskElpsTm;

								@Getter @Setter private short monXcdtTskCmpCd;

						@Getter @Setter private char[] monXcdtTskAbndCd = Field.fillLowValue(4);

								@Getter @Setter private int monXcdtReqSz;

								@Getter @Setter private int monXcdtRespSz;

						@Getter @Setter private char[] monUsertoken = Field.fillLowValue(128);
	
	/**
	* Constructor for MonitorRecord
	**/
    public MonitorRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMonPriKey().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
