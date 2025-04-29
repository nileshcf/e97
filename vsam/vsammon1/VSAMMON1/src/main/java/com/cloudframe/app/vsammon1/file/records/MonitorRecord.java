package com.cloudframe.app.vsammon1.file.records;

/**
*  The class MonitorRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:31. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


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



	/**
	 * 	initializes MonitorRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getMonPriKey().initialize();
     
         setMonXctorSysId(CONSTANTS.SPACE_4);
         setMonXctorTranId(CONSTANTS.SPACE_4);
         setMonXcaorSysId(CONSTANTS.SPACE_4);
                     setMonXcaorTskNo(0);
         setMonXcdtPgmTyCd(CONSTANTS.SPACE_35);
         setMonXcdtReqrIpAd(CONSTANTS.SPACE_15);
                     setMonXcdtTskAorTm(0);
                     setMonXcdtTskElpsTm(0);
         	setMonXcdtTskCmpCd((short)0);
         setMonXcdtTskAbndCd(CONSTANTS.SPACE_4);
                     setMonXcdtReqSz(0);
                     setMonXcdtRespSz(0);
         setMonUsertoken(CONSTANTS.SPACE_128);
   }


}
  
